package com.example.ismailozkan.selly.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.InspectableModifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberImagePainter
import com.example.ismailozkan.selly.R


@Composable
fun MainScreen(navController: NavController , viewModel: MainViewModel = viewModel() , ) {
    val query by viewModel.query.collectAsState()
    val items by viewModel.items.collectAsState()

    Scaffold(
        bottomBar = { BottomBar(navController = navController)}
    )
    { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            SearchBar(
                query = query,
                onQueryChange = { viewModel.updateQuery(it) },
                onSearch = { viewModel.performSearch() }
            )
            Spacer(modifier = Modifier.height(16.dp))
            ItemList(items = items, navController)
        }
    }
}

@Composable
fun SearchBar(
    query: String,
    onQueryChange: (String) -> Unit,
    onSearch: () -> Unit
) {
    TextField(
        value = query,
        onValueChange = onQueryChange,
        placeholder = { Text("Search...") },
        modifier = Modifier.fillMaxWidth(),
        singleLine = true,
        keyboardOptions = KeyboardOptions.Default.copy(
            imeAction = ImeAction.Search
        ),
        keyboardActions = KeyboardActions(
            onSearch = { onSearch() }
        )
        )
}

@Composable
fun ItemList(items: List<Product> , navController: NavController) {
    LazyColumn {
        items(items.size) { index ->
            val item = items[index]
            ElevatedCard(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 20.dp
                ),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .clickable {
                            navController.navigate("Buy $item")
                        }
                ) {
                    Image(
                        painter = rememberImagePainter(item.painter),
                        contentDescription = item.name,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                    )
                    Text(text = item.name)
                }
            }
        }
    }
}
@Composable
fun BottomBar(navController: NavController){
    Row(
        modifier = Modifier
            .height(60.dp)
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.primaryContainer)
        ,
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Spacer(modifier = Modifier.weight(1f))
        IconButton(onClick = {
            navController.navigate("Main Menu")
        }) {
            Icon(
                Icons.Outlined.Home,
                contentDescription = null,
                modifier = Modifier.size(40.dp),
                tint = colorResource(id = R.color.black)
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        IconButton(onClick = {
            navController.navigate("Messages")
        }) {
            Icon(
                Icons.Outlined.MailOutline,
                contentDescription = null,
                modifier = Modifier.size(40.dp)
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        IconButton(onClick = {
            navController.navigate("Sale")
        }) {
            Icon(
                Icons.Outlined.Lock,
                contentDescription = null,
                modifier = Modifier.size(40.dp)
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        IconButton(onClick = {
            navController.navigate("Favourite Ads")
        }) {
            Icon(
                Icons.Outlined.FavoriteBorder,
                contentDescription = null,
                modifier = Modifier.size(40.dp))
        }
        Spacer(modifier = Modifier.weight(1f))
        IconButton(onClick = {
            navController.navigate("Profile")
        }) {
            Icon(
                Icons.Outlined.AccountCircle,
                contentDescription = null,
                modifier = Modifier.size(40.dp)
            )
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen(navController = rememberNavController())
}
