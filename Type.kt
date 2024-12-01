import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.marsphotos.R 

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = CustomFontFamily, 
        fontWeight = FontWeight.Bold, 
        fontSize = 18.sp, 
        lineHeight = 28.sp,
        letterSpacing = 1.sp 
    ),
    headlineSmall = TextStyle(
        fontFamily = CustomFontFamily,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 24.sp,
        letterSpacing = 2.sp 
    )
)
