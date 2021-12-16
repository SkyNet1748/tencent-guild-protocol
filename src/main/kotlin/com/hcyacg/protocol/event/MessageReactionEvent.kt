package com.hcyacg.protocol.event

import com.google.gson.annotations.SerializedName
import com.hcyacg.protocol.anno.NoArg

@NoArg

data class MessageReactionEvent(
    @SerializedName("channel_id")
    val channelId: String,
    @SerializedName("emoji")
    val emoji: Emoji,
    @SerializedName("guild_id")
    val guildId: String,
    @SerializedName("target")
    val target: Target,
    @SerializedName("user_id")
    val userId: String
)

@NoArg

data class Emoji(
    @SerializedName("id")
    val id: String,
    @SerializedName("type")
    val type: Int
)

@NoArg

data class Target(
    @SerializedName("id")
    val id: String,
    @SerializedName("type")
    val type: Int
)

fun getInfo(id: String): String {
    when (id) {
        "0" -> return "惊讶"
        "1" -> return "撇嘴"
        "2" -> return "色"
        "3" -> return "发呆"
        "4" -> return "得意"
        "5" -> return "流泪"
        "6" -> return "害羞"
        "7" -> return "闭嘴"
        "8" -> return "睡"
        "9" -> return "大哭"
        "10" -> return "尴尬"
        "11" -> return "发怒"
        "12" -> return "调皮"
        "13" -> return "呲牙"
        "14" -> return "微笑"
        "15" -> return "难过"
        "16" -> return "酷"
        "18" -> return "抓狂"
        "19" -> return "吐"
        "20" -> return "偷笑"
        "21" -> return "可爱"
        "22" -> return "白眼"
        "23" -> return "傲慢"
        "24" -> return "饥饿"
        "25" -> return "困"
        "26" -> return "惊恐"
        "27" -> return "流汗"
        "28" -> return "憨笑"
        "29" -> return "悠闲"
        "30" -> return "奋斗"
        "31" -> return "咒骂"
        "32" -> return "疑问"
        "33" -> return "嘘"
        "34" -> return "晕"
        "35" -> return "折磨"
        "36" -> return "衰"
        "37" -> return "骷髅"
        "38" -> return "敲打"
        "39" -> return "再见"
        "41" -> return "发抖"
        "42" -> return "爱情"
        "43" -> return "跳跳"
        "46" -> return "猪头"
        "49" -> return "拥抱"
        "53" -> return "蛋糕"
        "54" -> return "闪电"
        "55" -> return "炸弹"
        "56" -> return "刀"
        "57" -> return "足球"
        "59" -> return "便便"
        "60" -> return "咖啡"
        "61" -> return "饭"
        "63" -> return "玫瑰"
        "64" -> return "凋谢"
        "66" -> return "爱心"
        "67" -> return "心碎"
        "69" -> return "礼物"
        "74" -> return "太阳"
        "75" -> return "月亮"
        "76" -> return "赞"
        "77" -> return "踩"
        "78" -> return "握手"
        "79" -> return "胜利"
        "85" -> return "飞吻"
        "86" -> return "怄火"
        "89" -> return "西瓜"
        "96" -> return "冷汗"
        "97" -> return "擦汗"
        "98" -> return "抠鼻"
        "99" -> return "鼓掌"
        "100" -> return "糗大了"
        "101" -> return "坏笑"
        "102" -> return "左哼哼"
        "103" -> return "右哼哼"
        "104" -> return "哈欠"
        "105" -> return "鄙视"
        "106" -> return "委屈"
        "107" -> return "快哭了"
        "108" -> return "阴险"
        "109" -> return "亲亲"
        "110" -> return "吓"
        "111" -> return "可怜"
        "112" -> return "菜刀"
        "113" -> return "啤酒"
        "114" -> return "篮球"
        "115" -> return "乒乓"
        "116" -> return "示爱"
        "117" -> return "瓢虫"
        "118" -> return "抱拳"
        "119" -> return "勾引"
        "120" -> return "拳头"
        "121" -> return "差劲"
        "122" -> return "爱你"
        "123" -> return "NO"
        "124" -> return "OK"
        "125" -> return "转圈"
        "126" -> return "磕头"
        "127" -> return "回头"
        "128" -> return "跳绳"
        "129" -> return "挥手"
        "130" -> return "激动"
        "131" -> return "街舞"
        "132" -> return "献吻"
        "133" -> return "左太极"
        "134" -> return "右太极"
        "136" -> return "双喜"
        "137" -> return "鞭炮"
        "138" -> return "灯笼"
        "140" -> return "K歌"
        "144" -> return "喝彩"
        "145" -> return "祈祷"
        "146" -> return "爆筋"
        "147" -> return "棒棒糖"
        "148" -> return "喝奶"
        "151" -> return "飞机"
        "158" -> return "钞票"
        "168" -> return "药"
        "169" -> return "手枪"
        "171" -> return "茶"
        "172" -> return "眨眼睛"
        "173" -> return "泪奔"
        "174" -> return "无奈"
        "175" -> return "卖萌"
        "176" -> return "小纠结"
        "177" -> return "喷血"
        "178" -> return "斜眼笑"
        "179" -> return "doge"
        "180" -> return "惊喜"
        "181" -> return "骚扰"
        "182" -> return "笑哭"
        "183" -> return "我最美"
        "184" -> return "河蟹"
        "185" -> return "羊驼"
        "187" -> return "幽灵"
        "188" -> return "蛋"
        "190" -> return "菊花"
        "192" -> return "红包"
        "193" -> return "大笑"
        "194" -> return "不开心"
        "197" -> return "冷漠"
        "198" -> return "呃"
        "199" -> return "好棒"
        "200" -> return "拜托"
        "201" -> return "点赞"
        "202" -> return "无聊"
        "203" -> return "托脸"
        "204" -> return "吃"
        "205" -> return "送花"
        "206" -> return "害怕"
        "207" -> return "花痴"
        "208" -> return "小样儿"
        "210" -> return "飙泪"
        "211" -> return "我不看"
        "212" -> return "托腮"
        "214" -> return "啵啵"
        "215" -> return "糊脸"
        "216" -> return "拍头"
        "217" -> return "扯一扯"
        "218" -> return "舔一舔"
        "219" -> return "蹭一蹭"
        "220" -> return "拽炸天"
        "221" -> return "顶呱呱"
        "222" -> return "抱抱"
        "223" -> return "暴击"
        "224" -> return "开枪"
        "225" -> return "撩一撩"
        "226" -> return "拍桌"
        "227" -> return "拍手"
        "228" -> return "恭喜"
        "229" -> return "干杯"
        "230" -> return "嘲讽"
        "231" -> return "哼"
        "232" -> return "佛系"
        "233" -> return "掐一掐"
        "234" -> return "惊呆"
        "235" -> return "颤抖"
        "236" -> return "啃头"
        "237" -> return "偷看"
        "238" -> return "扇脸"
        "239" -> return "原谅"
        "240" -> return "喷脸"
        "241" -> return "生日快乐"
        "242" -> return "头撞击"
        "243" -> return "甩头"
        "244" -> return "扔狗"
        "245" -> return "加油必胜"
        "246" -> return "加油抱抱"
        "247" -> return "口罩护体"
        "260" -> return "办公"
        "261" -> return "忙碌"
        "262" -> return "心累"
        "263" -> return "沧桑"
        "264" -> return "捂脸"
        "265" -> return "刷手机"
        "266" -> return "嫌弃"
        "267" -> return "头秃"
        "268" -> return "问号"
        "269" -> return "暗中观察"
        "270" -> return "尴尬"
        "271" -> return "吃瓜"
        "272" -> return "呵呵"
        "273" -> return "柠檬"
        "274" -> return "南"
        "👗" -> return "连衣裙"
        "😏" -> return "哼哼"
        "😄" -> return "高兴"
        "😔" -> return "失落"
        "😍" -> return "花痴"
        "😉" -> return "媚眼"
        "☺" -> return "可爱"
        "😜" -> return "淘气"
        "😁" -> return "呲牙"
        "😝" -> return "吐舌"
        "😰" -> return "紧张"
        "😓" -> return "汗"
        "😚" -> return "亲亲"
        "😌" -> return "羞涩"
        "😊" -> return "嘿嘿"
        "❔" -> return "问号"
        "❕" -> return "叹号"
        "❌" -> return "错误"
        "☎" -> return "电话"
        "📷" -> return "相机"
        "📠" -> return "传真"
        "💻" -> return "电脑"
        "🎥" -> return "摄影机"
        "🎤" -> return "话筒"
        "🔫" -> return "手枪"
        "💿" -> return "光碟"
        "💓" -> return "爱心"
        "✨" -> return "闪光"
        "♣" -> return "扑克"
        "🀄" -> return "麻将"
        "〽" -> return "股票"
        "🎰" -> return "老虎机"
        "🚥" -> return "信号灯"
        "🚧" -> return "路障"
        "🎸" -> return "吉他"
        "💈" -> return "理发厅"
        "🛀" -> return "浴缸"
        "🚽" -> return "马桶"
        "🏠" -> return "家"
        "⛪" -> return "教堂"
        "⭕" -> return "正确"
        "⛄" -> return "雪人"
        "🌙" -> return "月亮"
        "☔" -> return "雨天"
        "☀" -> return "晴天"
        "☁" -> return "云朵"
        "💄" -> return "口红"
        "👟" -> return "鞋子"
        "👕" -> return "衣服"
        "👙" -> return "内衣"
        "👜" -> return "包"
        "🌂" -> return "雨伞"
        "👢" -> return "鞋子"
        "👠" -> return "高跟鞋"
        "🏦" -> return "银行"
        "👒" -> return "帽子"
        "🐭" -> return "老鼠"
        "🐳" -> return "海豚"
        "🐧" -> return "企鹅"
        "👼" -> return "天使"
        "🐯" -> return "老虎"
        "🐶" -> return "狗"
        "🐠" -> return "鱼"
        "🐛" -> return "虫"
        "👻" -> return "幽灵"
        "🐸" -> return "青蛙"
        "🐔" -> return "公鸡"
        "🐮" -> return "牛"
        "🐨" -> return "树懒"
        "🐤" -> return "小鸡"
        "💀" -> return "骷髅"
        "🐷" -> return "猪"
        "🐙" -> return "章鱼"
        "🐵" -> return "猴"
        "👦" -> return "男孩"
        "👧" -> return "女孩"
        "👨" -> return "爸爸"
        "👩" -> return "妈妈"
        "⛵" -> return "船"
        "🚌" -> return "公交"
        "🚀" -> return "火箭"
        "🐎" -> return "骑马"
        "🚲" -> return "自行车"
        "🚤" -> return "快艇"
        "🚗" -> return "汽车"
        "🚄" -> return "列车"
        "✈" -> return "飞机"
        "🔒" -> return "锁"
        "🔑" -> return "钥匙"
        "📫" -> return "文件"
        "♨" -> return "热"
        "💉" -> return "打针"
        "💩" -> return "便便"
        "👣" -> return "脚印"
        "🏥" -> return "医院"
        "⚡" -> return "闪电"
        "💤" -> return "睡觉"
        "💰" -> return "钱"
        "🏆" -> return "奖杯"
        "🔥" -> return "火"
        "🏨" -> return "酒店"
        "🏧" -> return "取款机"
        "🏪" -> return "超市"
        "🚹" -> return "男性"
        "💦" -> return "水"
        "🚺" -> return "女性"
        "💨" -> return "吹气"
        "📱" -> return "手机"
        "⭐" -> return "星星"
        "🔔" -> return "铃铛"
        "👑" -> return "皇冠"
        "💣" -> return "炸弹"
        "💍" -> return "戒指"
        "🐚" -> return "海螺"
        "🎈" -> return "气球"
        "🎀" -> return "蝴蝶结"
        "💝" -> return "礼物"
        "🌴" -> return "椰子树"
        "🎉" -> return "庆祝"
        "🌹" -> return "玫瑰"
        "🎄" -> return "圣诞树"
        "🚬" -> return "吸烟"
        "💊" -> return "药丸"
        "🍉" -> return "西瓜"
        "🍓" -> return "草莓"
        "🍊" -> return "橙子"
        "🍎" -> return "苹果"
        "☕" -> return "咖啡"
        "🍸" -> return "高脚杯"
        "🍻" -> return "干杯"
        "🍺" -> return "啤酒"
        "🍟" -> return "薯条"
        "🍳" -> return "煎蛋"
        "🙏" -> return "合十"
        "🍔" -> return "汉堡"
        "🍞" -> return "起司"
        "🎂" -> return "蛋糕"
        "🍣" -> return "寿司"
        "🍧" -> return "刨冰"
        "🍙" -> return "饭团"
        "🍜" -> return "拉面"
        "🍝" -> return "意面"
        "🍚" -> return "米饭"
        "👂" -> return "耳朵"
        "👄" -> return "嘴唇"
        "👃" -> return "鼻子"
        "👀" -> return "眼睛"
        "👇" -> return "向下"
        "👆" -> return "向上"
        "👉" -> return "向右"
        "👈" -> return "向左"
        "👌" -> return "好的"
        "👎" -> return "鄙视"
        "✌" -> return "胜利"
        "👏" -> return "鼓掌"
        "☝" -> return "向上"
        "👍" -> return "厉害"
        "👊" -> return "拳头"
        "💪" -> return "肌肉"
        "😂" -> return "激动"
        "😱" -> return "害怕"
        "😭" -> return "大哭"
        "😘" -> return "飞吻"
        "😳" -> return "瞪眼"
        "😒" -> return "不屑"
        else -> return "未知表情"
    }
}