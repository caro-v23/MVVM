package com.example.mymvvm.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mymvvm.ui.theme.screen.home.HomeScreen
import com.example.mymvvm.ui.theme.screen.login.loginscreen
import com.example.mymvvm.ui.theme.screen.products.AddProductScreen
import com.example.mymvvm.ui.theme.screen.products.UpdateProductsScreen
import com.example.mymvvm.ui.theme.screen.products.ViewProductsScreen
import com.example.mymvvm.ui.theme.screen.register.registerScreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier,navController:NavHostController= rememberNavController(),startDestination:String= ROUTE_LOGIN) {

    NavHost(navController = navController, modifier=modifier, startDestination = startDestination ){
        composable(ROUTE_LOGIN){
            loginscreen(navController )
        }
        composable(ROUTE_REGISTER){
            registerScreen(navController)
        }
        composable(ROUTE_ABOUT){
            (navController)
        }
        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_ADD_PRODUCT) {
            AddProductScreen(navController)
        }
        composable(ROUTE_VIEW_PRODUCT){
            ViewProductsScreen(navController)
        }
        composable(ROUTE_UPDATE_PRODUCT+ "/{id}"){passedData ->
            UpdateProductsScreen(navController,passedData.arguments?.getString("id")!!)
        }
    }

}