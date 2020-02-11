package app.sano.picchi.count

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var number :Int = 0
    var number2 :Int = 0
    var total = number + number2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun add(view: View?){
        number++
        textView.text = "$number　回ボタンが押された"
        total++
        textView3.text = "合計で$total "
    }

    fun minus(view: View?){
        number--
        textView.text = "$number　回ボタンが押された"
        total--
        textView3.text = "合計で$total "
    }

    fun add2(view: View?){
        number2++
        textView2.text = "$number2　回ボタンが押された"
        total++
        textView3.text = "合計で$total "
    }

    fun minus2(view: View?){
        number2--
        textView2.text = "$number2　回ボタンが押された"
        total--
        textView3.text = "合計で$total "
    }

    fun keisan(textView: TextView){
        number++
        textView.text = "合計で$total "
    }






}
