package lit.amida.lfsprofile

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView.visibility = View.INVISIBLE
        textTitle.visibility = View.INVISIBLE
        textMsg.visibility = View.INVISIBLE

        setButtonColor()

        buttonName.setOnClickListener {
            setViews("名前", "Androidメンターのランディだよ", R.drawable.randy_image)
            buttonName.setBackgroundColor(Color.parseColor("#1e50a2"))
        }

        buttonSports.setOnClickListener {
            setViews("スポーツ", "野球観戦が好きで，スタジアムに通っている", R.drawable.baseball_image)
            buttonSports.setBackgroundColor(Color.parseColor("#ba2636"))
        }

        buttonFood.setOnClickListener {
            setViews("好きな食べ物", "キャンディやドーナツが大好き", R.drawable.donut_image)
            buttonFood.setBackgroundColor(Color.parseColor("#316745"))
        }

        buttonHobby.setOnClickListener {
            setViews("趣味", "ガジェットを集めて動かすこと", R.drawable.gadget_image)
            buttonHobby.setBackgroundColor(Color.parseColor("#ea5506"))
        }



    }

    fun setViews(title:String, msg:String, resId:Int){
        setButtonColor()
        imageView.setImageResource(resId)
        textTitle.text = title
        textMsg.text = msg

        imageView.visibility = View.VISIBLE
        textTitle.visibility = View.VISIBLE
        textMsg.visibility = View.VISIBLE
    }

    fun setButtonColor(){
        buttonName.setBackgroundColor(Color.parseColor("#474a4d"))
        buttonSports.setBackgroundColor(Color.parseColor("#474a4d"))
        buttonFood.setBackgroundColor(Color.parseColor("#474a4d"))
        buttonHobby.setBackgroundColor(Color.parseColor("#474a4d"))
    }
}