package br.senai.sp.jandira.mytrips

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.R
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.ui.theme.MytripsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MytripsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                    TelaCadastro()
                }
            }
        }
    }
}

@Composable
fun Greeting()  {
    Column (
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ){
            Box(
                modifier = Modifier
                    .background(
                        color = Color(0xFFCF06F0),
                        // Borda da box
                        shape = RoundedCornerShape(bottomStart = 10.dp)
                    )
                    .height(40.dp)
                    .width(120.dp),

            ){

            }

        }

    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(10.dp)
    ) {
        Text(
            // Texto "LOGIN
            text = "Login",
            color = Color(0xFFCF06F0),
                    fontSize = 48.sp,
            fontWeight = FontWeight.ExtraBold,

            modifier = Modifier
                .offset(x = 2.dp, y = 156.dp)


        )

        Text(
            text = "Please sign in to continue.",
            color = Color(0xFFA09C9C),
            fontSize = 14.sp,
            modifier = Modifier
                .offset(x = 2.dp, y = 151.dp)
        )

    }

    // Espaco para inserir dados
    Column (
        modifier = Modifier
            .padding(16.dp)
    ) {

        // Para digitar o email
        OutlinedTextField(
            value = "teste@email.com",
            onValueChange = {},
            modifier = Modifier
                .padding(top = 300.dp)
                .fillMaxWidth(),
            label = {
                Text(text = "E-mail" )
            },
            colors = OutlinedTextFieldDefaults
                .colors(
                    focusedBorderColor = Color(0xFFA600FF),
                    unfocusedBorderColor = Color(0xFFA600FF),
                    // Quando tiver o texto em foco fica dessa cor
                    focusedTextColor = Color.Black,
                    // Quando nao tiver em foco
                    unfocusedTextColor = Color.Black
                ),
            shape = RoundedCornerShape(16.dp),
            leadingIcon = {
                Icon(imageVector = Icons.Filled.Email, contentDescription = "", tint = Color(0xFFCF06F0))
            }
            // Funcao Label - Neste caso ela fica acima da caixa para digitar
//            placeholder = {
//                Text(text = "Seu peso em kg")
//            }

        )
        // Espaco entre os Outlined
        Spacer(modifier = Modifier.height(16.dp))

        // Para digitar a senha
        OutlinedTextField(
            value = "**********",

            onValueChange ={},
            modifier =  Modifier
                .fillMaxWidth(),

             //Label sobe pra cima da linha quando usado no outlinedTextField
                    label = {
                        Text(text = "Password")
                    },
            colors = OutlinedTextFieldDefaults
                .colors(
                    // Quando a borda tiver desfocada e em foco
                    focusedBorderColor = Color(0xFFA600FF),
                    unfocusedBorderColor = Color(0xFFA600FF),

                    focusedTextColor = Color.Black,
                    unfocusedTextColor = Color.Black
                ),
            shape = RoundedCornerShape(16.dp),
            leadingIcon = {
                Icon(imageVector = Icons.Filled.Lock, contentDescription = "", tint = Color(0xFFCF06F0))
            }

        )

    }


    Column {
        Button(onClick = { /*TODO*/ },
            modifier = Modifier
                .width(150.dp)
                .offset(x = 225.dp, y = 490.dp)
                .height(50.dp),

            // Definir cor do botao e curvatura do botao
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFCF06F0)),
            shape = RoundedCornerShape(16.dp)
            ) {

            // Texto dentro do botao
            Text(
                text = "SIGN IN",
                fontSize = 16.sp,
                fontWeight = FontWeight.Black

            )
            // Icone de Seta
                Icon(imageVector = Icons.Filled.ArrowForward, contentDescription = "", tint = Color.White)

        }

        Text(
            text = "Don’t have an account?",
            color = Color(0xFFA09C9C),
            fontSize = 12.sp,
            modifier = Modifier
                .offset(x= 180.dp, y = 516.dp)
        )

        Text(
            text = "Sign up",
            color = Color(0xFFCF06F0),
            fontWeight = FontWeight.ExtraBold,
            fontSize = 14.sp,
            modifier = Modifier
                .offset(x= 320.dp, y= 499.dp)
        )
    }


    Column (
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row (
            modifier = Modifier
                .offset(y = 740.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ){
            Box(
                modifier = Modifier
                    .background(
                        color = Color(0xFFCF06F0),
                        // Borda da box
                        shape = RoundedCornerShape(topEnd = 10.dp)
                    )
                    .height(40.dp)
                    .width(120.dp)

                ){

            }

        }

    }


}



// Tela de Cadastro

@Composable
fun TelaCadastro()  {
    Column (
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ){
            Box(
                modifier = Modifier
                    .background(
                        color = Color(0xFFCF06F0),
                        // Borda da box
                        shape = RoundedCornerShape(bottomStart = 10.dp)
                    )
                    .height(40.dp)
                    .width(120.dp),

                ){

            }

        }

    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(10.dp)
    ) {
        Text(
            // Texto
            text = "Sign Up",
            color = Color(0xFFCF06F0),
            fontSize = 32.sp,
            fontWeight = FontWeight.ExtraBold,

            modifier = Modifier
                .offset(x = 125.dp, y = 41.dp)


        )

        Text(
            text = "Create a new account",
            color = Color(0xFFA09C9C),
            fontSize = 14.sp,
            modifier = Modifier
                .offset(x = 110.dp, y = 46.dp)
        )

        Card (
            modifier = Modifier.size(120.dp)
                .offset(x = 144.dp, y = 60.dp),
            shape = CircleShape,
            colors = CardDefaults.cardColors(Color.Transparent),
        ){
            Image(
                painter = painterResource(id = br.senai.sp.jandira.mytrips.R.drawable.perfil),
                contentDescription = "",
                modifier = Modifier.size(100.dp),
                contentScale = ContentScale.Crop
            )
        }

    }

    // Espaco para inserir dados
    Column (
        modifier = Modifier
            .padding(16.dp)
    ) {

        // Para digitar o nome
        OutlinedTextField(
            value = "Susanna Hoffs",
            onValueChange = {},
            modifier = Modifier
                .padding(top = 225.dp)
                .fillMaxWidth(),
            label = {
                Text(text = "Username" )
            },
            colors = OutlinedTextFieldDefaults
                .colors(
                    focusedBorderColor = Color(0xFFA600FF),
                    unfocusedBorderColor = Color(0xFFA600FF),
                    // Quando tiver o texto em foco fica dessa cor
                    focusedTextColor = Color.Black,
                    // Quando nao tiver em foco
                    unfocusedTextColor = Color.Black
                ),
            shape = RoundedCornerShape(16.dp),
            leadingIcon = {
                Icon(imageVector = Icons.Filled.Email, contentDescription = "", tint = Color(0xFFCF06F0))
            }
            // Funcao Label - Neste caso ela fica acima da caixa para digitar
//            placeholder = {
//                Text(text = "Seu peso em kg")
//            }

        )
        // Espaco entre os Outlined
        Spacer(modifier = Modifier.height(16.dp))

        // Para digitar o telefone
        OutlinedTextField(
            value = "99999-0987",

            onValueChange ={},
            modifier =  Modifier
                .fillMaxWidth(),

            //Label sobe pra cima da linha quando usado no outlinedTextField
            label = {
                Text(text = "Phone")
            },
            colors = OutlinedTextFieldDefaults
                .colors(
                    // Quando a borda tiver desfocada e em foco
                    focusedBorderColor = Color(0xFFA600FF),
                    unfocusedBorderColor = Color(0xFFA600FF),

                    focusedTextColor = Color.Black,
                    unfocusedTextColor = Color.Black
                ),
            shape = RoundedCornerShape(16.dp),
            leadingIcon = {
                Icon(imageVector = Icons.Filled.Lock, contentDescription = "", tint = Color(0xFFCF06F0))
            }

        )
        Spacer(modifier = Modifier.height(16.dp))

        // Para digitar o e-mail
        OutlinedTextField(
            value = "susanna@email.com",

            onValueChange ={},
            modifier =  Modifier
                .fillMaxWidth(),

            //Label sobe pra cima da linha quando usado no outlinedTextField
            label = {
                Text(text = "E-mail")
            },
            colors = OutlinedTextFieldDefaults
                .colors(
                    // Quando a borda tiver desfocada e em foco
                    focusedBorderColor = Color(0xFFA600FF),
                    unfocusedBorderColor = Color(0xFFA600FF),

                    focusedTextColor = Color.Black,
                    unfocusedTextColor = Color.Black
                ),
            shape = RoundedCornerShape(16.dp),
            leadingIcon = {
                Icon(imageVector = Icons.Filled.Lock, contentDescription = "", tint = Color(0xFFCF06F0))
            }

        )
        Spacer(modifier = Modifier.height(16.dp))

        // Para digitar a senha
        OutlinedTextField(
            value = "**********",

            onValueChange ={},
            modifier =  Modifier
                .fillMaxWidth(),

            //Label sobe pra cima da linha quando usado no outlinedTextField
            label = {
                Text(text = "Password")
            },
            colors = OutlinedTextFieldDefaults
                .colors(
                    // Quando a borda tiver desfocada e em foco
                    focusedBorderColor = Color(0xFFA600FF),
                    unfocusedBorderColor = Color(0xFFA600FF),

                    focusedTextColor = Color.Black,
                    unfocusedTextColor = Color.Black
                ),
            shape = RoundedCornerShape(16.dp),
            leadingIcon = {
                Icon(imageVector = Icons.Filled.Lock, contentDescription = "", tint = Color(0xFFCF06F0))
            }

        )




    }


    Column {


// CheckBox - caixinha para marcar habilitado ou desabilitado
        Checkbox(
            checked = false,
            onCheckedChange = {},
            colors = CheckboxDefaults.colors(
                uncheckedColor = Color(0xFFCF06F0),
                checkedColor = Color(0xFFCF06F0)
            ),
            modifier = Modifier
                .offset(x=10.dp, y = 550.dp)


        )
        Text(
            text = "Over 18?",
            color = Color.Black,
            modifier = Modifier
                .offset(x = 50.dp, y = 515.dp)
        )

        // Botao para criar conta
        Button(onClick = { /*TODO*/ },
            modifier = Modifier
                .width(327.dp)
                .offset(x = 35.dp, y = 540.dp)
                .height(48.dp),

            // Definir cor do botao e curvatura do botao
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFCF06F0)),
            shape = RoundedCornerShape(16.dp)
        ) {

            // Texto dentro do botao
            Text(
                text = "CREATE ACCOUNT",
                fontSize = 16.sp,
                fontWeight = FontWeight.Black

            )
        }

        Text(
            text = "Already have an account?",
            color = Color(0xFFA09C9C),
            fontSize = 12.sp,
            modifier = Modifier
                .offset(x= 165.dp, y = 551.dp)
        )

        Text(
            text = "Sign in",
            color = Color(0xFFCF06F0),
            fontWeight = FontWeight.ExtraBold,
            fontSize = 14.sp,
            modifier = Modifier
                .offset(x= 320.dp, y= 533.dp)
        )
    }


    Column (
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row (
            modifier = Modifier
                .offset(y = 740.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ){
            Box(
                modifier = Modifier
                    .background(
                        color = Color(0xFFCF06F0),
                        // Borda da box
                        shape = RoundedCornerShape(topEnd = 10.dp)
                    )
                    .height(40.dp)
                    .width(120.dp)

            ){

            }

        }

    }


}





@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    MytripsTheme {
        Greeting()

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaCadastroPreview() {
    MytripsTheme {
        TelaCadastro()

    }
}