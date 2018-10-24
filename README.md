# bilibili-plugin
　哔哩哔哩插件姬

------


## 运行环境

　![](https://img.shields.io/badge/Platform-Windows%20x64-brightgreen.svg)  ![](https://img.shields.io/badge/JDK-1.7%2B-brightgreen.svg)


## 软件介绍

　此程序用于[`B站直播间`](https://live.bilibili.com/)，核心功能包括但不限于：
<br/>　
- **偷窥直播间：**
<br/>　*可实时监控指定直播间的版聊情况（包括投喂、聊天等）*
<br/>　*主播开播时自动触发通知*
<br/>　
- **全平台挂机抽奖：**
<br/>　*此功能可自动监控并参与全平台的小电视/摩天大楼/C位光环、活动高能礼物、节奏风暴抽奖*
<br/>　*需要登陆后才能使用（支持帐密登陆和B站手机APP扫码登陆，本插件不会盗号，不放心请勿使用）*
<br/>　
- **自动完成每日任务：**
<br/>　○ *每日签到*
<br/>　○ *每日小学数学任务（宝箱任务）*
<br/>　○ *领取日常/周常礼包*
<br/>　○ *友爱社签到（PC端自动模拟观看，手机端需绑定手机自行观看规定时长）*
<br/>　○ *自动扭蛋、投喂心仪直播间（可开关控制）*
<br/>　○ *领取成就奖励*
<br/>　○ *领取/补领总督奖励*
<br/>　
- **为主播自动答谢、公告、晚安、打call、点歌:**
<br/>　*为保护直播间秩序，普通用户默认禁用此功能，仅对主播或房管开放*
<br/>　
- **房间活跃度统计：**
<br/>　*主播限定功能，实时采集直播间内所有用户的活跃度，并按月度生成统计报表*
<br/>　
- **直播间抽奖：**
<br/>　*主播限定功能，会搜集当前直播间内的活跃用户数据进行抽奖*
<br/>　
- **版聊命令禁言：**
<br/>　*此功能主要便于在手机端直播间，通过在版聊区输入命令即可管制某些用户的违规行为*
<br/>　*目前支持命令有两种：*
<br/>　　○  【#禁言+用户名关键字】*直接关小黑屋1小时（仅限房管或主播使用）*
<br/>　　○  【#举报+用户名关键字】*超过3人联名则关小黑屋1小时（所有用户可用）*
<br/>　
      
      
## 运行界面展示

### ※ 主界面
![主界面](https://raw.githubusercontent.com/lyy289065406/bilibili-plugin/master/doc/%E8%BF%90%E8%A1%8C%E6%88%AA%E5%9B%BE/01-%E4%B8%BB%E7%95%8C%E9%9D%A2.png)

### ※ 多号挂机管理界面
![多号挂机](https://raw.githubusercontent.com/lyy289065406/bilibili-plugin/master/doc/%E8%BF%90%E8%A1%8C%E6%88%AA%E5%9B%BE/02-%E5%A4%9A%E5%8F%B7%E6%8C%82%E6%9C%BA.png)

### ※ 登陆界面
<br/>　
　*二维码登陆（左） & 帐密登陆（右）*<br/>
![登陆界面](https://raw.githubusercontent.com/lyy289065406/bilibili-plugin/master/doc/%E8%BF%90%E8%A1%8C%E6%88%AA%E5%9B%BE/03-%E7%99%BB%E9%99%86%E7%95%8C%E9%9D%A2.png)

### ※ 功能界面
<br/>　
　*自动抽奖设置（左） & 开播通知（右）*<br/>
![抽奖设置与开播通知](https://raw.githubusercontent.com/lyy289065406/bilibili-plugin/master/doc/%E8%BF%90%E8%A1%8C%E6%88%AA%E5%9B%BE/04-%E6%8A%BD%E5%A5%96%E8%AE%BE%E7%BD%AE%E4%B8%8E%E5%BC%80%E6%92%AD%E9%80%9A%E7%9F%A5.png)
<br/>　
<br/>　
　*小学宝箱（左） & 随缘点歌姬（右）*<br/>
![小学宝箱与随缘点歌](https://raw.githubusercontent.com/lyy289065406/bilibili-plugin/master/doc/%E8%BF%90%E8%A1%8C%E6%88%AA%E5%9B%BE/05-%E5%B0%8F%E5%AD%A6%E5%AE%9D%E7%AE%B1%E4%B8%8E%E9%9A%8F%E7%BC%98%E7%82%B9%E6%AD%8C.png)
<br/>　
<br/>　
　*粉丝活跃度统计（左） & 直播间抽奖姬（右）*<br/>
![粉丝活跃度统计与抽奖](https://raw.githubusercontent.com/lyy289065406/bilibili-plugin/master/doc/%E8%BF%90%E8%A1%8C%E6%88%AA%E5%9B%BE/06-%E7%B2%89%E4%B8%9D%E6%B4%BB%E8%B7%83%E5%BA%A6%E7%BB%9F%E8%AE%A1%E4%B8%8E%E6%8A%BD%E5%A5%96.png)



## 安装与使用

- 01.　安装JDK环境【[jdk-7u72-windows-x64.exe](https://github.com/lyy289065406/environment/tree/master/environment/java/JDK/windows/x64/jdk-7u72-windows-x64.exe)】，一直 下一步 到完成即可（无需修改安装路径）
- 02.　解压并运行【哔哩哔哩插件姬.exe】（面向不同人群，分别提供了试用版/大众版/主播版/管理员版）
- 03.　为限制随意传播，会要求输入注册码，请加QQ群131637823申请
   
  
## 全功能一览

| 功能 | 试用版 | 普通用户版 | 主播版 | 管理员版 |
|:---:|:---:|:---:|:---:|:---:|
| 日常签到 | √ | √ | √ | √ |
| 友爱社签到（限PC端） | √ | √ | √ | √ |
| 日常/周常礼包 | √ | √ | √ | √ |
| 成就礼包 | √ | √ | √ | √ |
| 每日宝箱任务 | √ | √ | √ | √ |
| 小电视抽奖 | √ | √ | √ | √ |
| 摩天大楼抽奖 | √ | √ | √ | √ |
| 高能抽奖（需绑定手机） | √ | √ | √ | √ |
| 节奏风暴抽奖（需实名） | √ | √ | √ | √ |
| 实时舰长/提督/总督奖励 | √ | √ | √ | √ |
| 多号挂机 | +3小号 | +8小号 | +15小号 | +233小号 |
| 自动投喂（有开关） | √ | √ | √ | √ |
| 自动扭蛋（有开关） | √ | √ | √ | √ |
| 实时版聊 | √ | √ | √ | √ |
| 随缘点歌姬 | √ | √ | √ | √ |
| 打call姬 | √ | √ | √ | √ |
| 公告姬 | x | x | √ | √ |
| 答谢姬 | x | x | √ | √ |
| 晚安姬 | x | x | √ | √ |
| 补领舰长/提督/总督奖励 | x | x | √ | √ |
| 发起直播间抽奖 | x | x | √ | √ |
| 节奏风暴检索范围设置 | x | x | √ | √ |
| 抽奖参数设置 | x | x | √ | √ |
| 直播间活跃度统计<br/>（可导出排名报表） | x | x | x | √ |
| 版聊命令：举报/禁言<br/>（便于手机端管理直播间） | x | x | x | √ |
| 软件自动升级 | x | √ | √ | √ |


## 升级记录

### v5.7版本：
- 01.　增加对新消息类型的支持
- 02.　新增每个角色的行为统计
- 03.　增加进入直播间行为模拟
- 04.　增加舰长/提督/总督亲密度领取支持
- 05.　修正直播心跳协议
- 06.　新增服务器配置信息提取接口
- 07.　节奏风暴开关与健将亲密度联动
- 08.　增加主动冻结机制，已防止被B站试探脚本
- 09.　更新节奏风暴抽奖逻辑


### v5.6版本：
- 01.　修正监控站点无法访问问题.
- 02.　增加连续抽奖频度控制.


### v5.5版本：
- 01.　增加数十款新礼物的支持.
- 02.　加大连续抽奖间隔.
- 03.　调整抽奖公告提示.
- 04.　调整软件版权校验接口.
    
    
### v5.4版本：
- 01.　修正无法监听直播室通知异常.


### v5.3版本：
- 01.　修正挂机列表中若存在被封禁账号会导致所有账号无法抽节奏风暴问题.


### v5.2版本：
- 01.　取消未实名账号抽奖限制
- 02.　修正B站升级后自动扭蛋失败问题
- 03.　支持新增的礼物combo连击消息解析
- 04.　支持新增的小时榜消息解析
- 05.　修正B站升级后无法抽节奏风暴问题
- 06.　支持魔天大楼全平台监听


### v5.1版本：
- 01.　增加试用版
- 02.　限制未实名账号连续抽奖
- 03.　限制未实名账号参与抽奖的概率最高不超过80%


### v5.0版本：
- 01.　植入自动升级接口
- 02.　修正小电视/摩天大楼漏抽奖异常


### v4.2版本：
- 01.　增加抽奖的反应设置
- 02.　取消连续抽奖限制, 默认抽奖概率恢复为100%
- 03.　修正活跃值跨月后不清零异常
- 04.　修正软件授权计时算法
- 05.　限制一台PC只能启动一次程序
- 06.　升级节奏风暴抽奖逻辑
- 07.　新增新礼物列表
- 08.　取消活动心跳礼物领取
- 09.　修正小学数学宝箱最后一轮的最后一个宝箱没有领取异常
- 10.　新增摩天大楼礼物抽奖
- 11.　修正系统托盘图标
- 12.　调整节奏风暴策略
- 13.　自动领取总督亲密度奖励
- 14.　增加一键补领总督奖励功能
- 15.　对应B站升级小电视/摩天大楼抽奖
- 16.　限制普通用户更改抽奖参数的权限
    
    
### v4.1版本：
- 01.　新增答谢姬和晚安姬编辑器
- 02.　答谢姬根据发言长度自动填充形容词
- 03.　更新闪耀之星活动礼物
- 04.　恢复自动完成小学数学任务


### v4.0版本：
- 01.　修正投喂礼物时, 对于未登记的陆吾会出现除零的异常
- 02.　修正高能礼物抽奖协议
- 03.　暂时关闭私信通知亲密度
- 04.　增加全局抽奖总开关
- 05.　修正发送弹幕可能锁屏问题
- 06.　小call机修正为从所有账号中随机抽取若干个打call（取消单号自动发送）
- 07.　除节奏风暴外, 增加连续抽奖限制, 降低被封禁抽奖的几率
- 08.　增加抽奖随机概率设置(默认50%, 降低被封禁抽奖的几率)


### v3.9版本：
- 01.　修正发送弹幕失败问题 (B站升级导致)
- 02.　开放节奏风暴扫描策略 (用于错峰扫描)
- 03.　新增弹幕颜色：桃花粉 (并新增悬浮说明)
- 04.　开放收藏直播间功能
- 05.　日常任务优化: 减少多号挂机的请求次数
- 06.　小号管理优化: 自动记录每个账号的自动投喂状态, 显示悬浮账号ID
    
    
### v3.8版本：
- 01.　支持自动领取情人节活动在线时长礼物（需绑定手机号）
- 02.　放宽小号个数限制（普通用户版：8   主播版：15）
- 03.　实名账号强制不自动扭蛋/投喂永久礼物，仅绑定手机账号增加保护开关控制


### v3.7版本：
- 01.　自动投喂添加保护机制:对于已绑定手机或实名的账号不投喂永久性礼物和未过期B克拉
- 02.　自动投喂策略变更1：未拥有房间勋章时, 若有未保护B克拉则只投喂1个B克拉; 否则投喂所有未保护礼物
- 03.　自动投喂策略变更2：对于今天内到期的礼物, 无视所有保护和亲密度进行投喂
- 04.　零点错峰执行事件, 避免产生大量请求
- 05.　根据时段适当调整节奏风暴扫描间隔, 避免产生大量无效请求


### v3.6版本：
- 01.　对应B站升级版本，调整小学数学任务接口
- 02.　对应B站升级版本，调整节奏风暴接口
    

### v3.5版本：
- 01.　取消2018春节活动红包兑换姬入口
- 02.　自动领取日常/周常/勋章/友爱社礼包
- 03.　B站小学数学版本升级，兼容处理验证码图片格式随机变换问题
- 04.　提高小学数学验证码辨识率
- 05.　修正小学数学任务跨天后没有及时自动执行异常
- 06.　支持小号差异化投喂房间
- 07.　当启用自动投喂后，会根据所投喂房间的勋章亲密度投喂，避免溢出（若无该房间勋章则全部投喂）
- 08.　当小号开启自动投喂时，同时触发自动扭蛋（满100抽一次）
- 09.　自动识别实名账号（未实名账号不参与节奏风暴抽奖）
- 10.　登陆有效期到期前48小时开始警告, 到期前1小时自动退出登陆（主号则退出程序）
- 11.　增加cookies备份/导入功能（用于升级时迁移登陆账号信息）
- 12.　弹幕发送失败时提示原因

    
### v3.4版本：
- 01.　修正多条弹幕消息切割错误问题
- 02.　自动领取成就奖励
- 03.　自动领取上上签奖励
- 04.　支持小号兑换小红包(与主号共用兑换策略)
- 05.　修正停止程序后启动进程没有终止异常


### v3.3版本：
- 01.　调整节奏风暴扫描频率，降低封IP几率
- 02.　优化日常任务和抽奖策略（未绑定手机的账号不重复尝试相关禁止行为）
- 03.　修正接收弹幕\投喂消息遗留问题
- 04.　修正部分活跃值没记录的问题
- 05.　根据登陆用户权限动态调整自动弹幕的内容长度
- 06.　优化身份识别系统
- 07.　优化私聊信息系统
- 08.　自动模拟PC端在线观看直播（用于完成友爱社任务）
<br/>　　 手机端模拟暂未生效（两端cookie不互通）
- 09.　增加执法机器人:
<br/>　　　【#禁言+用户名关键字】则关小黑屋1小时（仅限房管或主播使用）
<br/>　　　【#举报+用户名关键字】超过3人联名则关小黑屋1小时（所有用户可用）


### v3.2版本：
- 01.　修正跨天后大号没有签到异常
- 02.　外移cookies缓存文件夹, 便于升级后迁移登陆记录
    

### v3.1版本：
- 01.　紧急修复B站小学数学任务图片格式变化导致程序卡死问题
    
    
### v3.0版本：
- 01.　环境包变更为JDK1.7 x64 (应该支持win10)
- 02.　软件瘦身（大小为原来的一半）
- 03.　新增随缘点歌姬
- 04.　优化登陆系统, 提高登陆效率
- 05.　增加小号批量挂机功能（普通用户上限为3,主播用户上限为8）
- 06.　小号支持自动投喂功能
- 07.　调整节奏风暴扫描算法, 修正节奏风暴误判抽奖成功问题
- 08.　对于因房间信号调整造成的短时间内重复开播, 不再重复发送开播通知
- 09.　调整发送私信提示个人活跃值的基点为10W
- 10.　调整活跃值与软件授权天数的兑换比例为20W:1


### v2.3版本：
- 01.　提供selenium-phantomjs抽奖支持的最后一个版本
- 02.　支持活跃度导出


### v2.2版本：
- 01.　支持B站2018版的弹幕消息格式
- 02.　修正节奏风暴监听某些直播间错误问题
- 03.　临时增加小红包兑奖姬（随活动下线而下线）
<br/>　　　***注：***
<br/>　　　　○ *使用前请校准本地时间为帝都时间*
<br/>　　　　○ *兑奖姬在打开后, 自动在每小时的55分~02分之间执行高频兑奖, 因此存在封号风险*
<br/>　　　　○ *兑换规则：当同时选中了多种兑换品时, 会优先尽可能多地兑换花费较高的奖品, 再兑换花费较低的奖品*
    
    
### v2.1版本：
- 01.　对所有用户开放TOP50热门房间的节奏风暴自动抽奖（时也命也,佛系看天）
<br/>　　　***注：*** *节奏风暴存在封号风险，尽量使用马甲号扫描（收益自动归大号），否则被封号概不负责*
- 02.　对所有用户开放小call姬（为小乔打call）
- 03.　限制定时公告与自动打call频率：同一用户同屏最多出现1条
- 04.　稍微放大登陆验证码
- 05.　更新对春节活动礼物的活跃度计算支持
- 06.　正式上线活跃度续期系统：
<br/>　　　○ 对于2.0（不包括）之前的哔哩哔哩插件，在年前（2月中旬）会全部自动失效
<br/>　　　○ 对于2.0（包括）之后的哔哩哔哩插件，暂时授权到 2018-03-01
<br/>　　　○ 授权时间在插件窗口顶部可见
<br/>　
<br/>　　 ***续期规则（暂定）：***
<br/>　　　*在【指定直播间】所有用户（不使用本插件的用户也会计算在内）的活跃度每累计达到10W，则续期1天*
<br/>　　　*（从2月1日之前试运行，2月1日后可能会调整，届时每周会公布一次活跃值）*
<br/>　
<br/>　　 ***增加活跃度方式（限定直播间开放）：***
<br/>　　　○ *发言一次： 活跃度+1*
<br/>　　　○ *投喂礼物： 活跃度+等值瓜子*
<br/>　　　○ *上船： 活跃度+等值瓜子*


### v2.0版本：
- 01.　增加全平台节奏风暴扫描抽奖（主播版限定）
- 02.　增加友爱社自动签到(需绑定手机并自行在双端观看规定时长直播)
- 03.　登陆成功后界面显示当前登陆用户
- 04.　允许在登陆状态清除登陆信息
- 05.　增加关播通知
- 06.　增设直播间的活跃度系统
<br/>　　　***注：*** *活跃度以后会用于福利用途（具体方案以后公布, 目前先记录）*
    
    
### v1.9版本：
- 01.　紧急修复【嗨翻全场】抽奖导致的刷屏问题


### v1.8版本：
- 01.　新增帐密登陆模式
- 02.　增加清除登陆信息功能
- 03.　对普通用户开放直播间内节奏风暴抽奖
- 04.　增加嗨翻全场抽奖
- 05.　删除重复抽奖失败的提示
- 06.　优化界面缓存, 避免长时间运行后可能诱发的卡顿问题
- 07.　新增公告姬
- 08.　增加打call姬和公告姬的在线编辑功能


### v1.7版本：
- 01.　登陆有效时间上调为1个月
- 02.　增加因登陆超时导致抽奖失败的提示
- 03.　调整开播打卡提示
- 04.　跨天后自动重做签到和每日小学数学任务(需本地时间与北京时间校准)


### v1.6版本：
- 01.　开播新增蜂鸣提示音
- 02.　提高因系统繁忙导致小电视抽奖失败的成功率


### v1.5版本：
- 01.　增加默认房间号设置（限主播版，避免你们花心）
- 02.　调整：登陆后会自动连接到直播间
- 03.　最小化时可选择最小化到托盘
- 04.　增加右下角弹框提示开播通知


### v1.4版本：
- 01.　增加每日自动签到功能
- 02.　增加每日小学数学自动完成功能
- 03.　增加弹幕颜色、模式切换提示
- 04.　调整默认抽奖模式为服务器注入模式
- 05.　提高连续抽奖时的成功率
- 06.　增加节奏风暴自动抽奖（限定版实装）


### v1.3版本：
- 01.　新增弹幕颜色
- 02.　丰富打call词库
- 03.　新增全平台自动抽奖模式：
<br/>　　　**【浏览器仿真模式】** 默认模式, 模拟人工操作执行抽奖, 效率较低, 但适用于所有抽奖
<br/>　　　**【注入服务器模式】** 大幅优化抽奖效率, 但仅适用于小电视, 或当季度的高能抽奖
    

### v1.2版本：
- 01.　新增在线发言功能
- 02.　召唤答谢姬
- 03.　召唤晚安姬
- 04.　召唤小call机
- 04.　优化登陆提示
- 05.　优化网络断开后的重连逻辑


### v1.1版本：
- 01.　优化登陆与抽奖监控逻辑
- 02.　修正自动抽奖时总是触发超时问题
- 03.　修复内存泄漏问题
- 04.　屏蔽B站首次登入时的升级教程（妨碍抽奖）
    
    
## 版权声明

　[![Copyright (C) 2016-2018 By EXP](https://img.shields.io/badge/Copyright%20(C)-2006~2018%20By%20EXP-blue.svg)](http://exp-blog.com)　[![License: GPL v3](https://img.shields.io/badge/License-GPL%20v3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)
  

- Site: [http://exp-blog.com](http://exp-blog.com) 
- Mail: <a href="mailto:289065406@qq.com?subject=[EXP's Github]%20Your%20Question%20（请写下您的疑问）&amp;body=What%20can%20I%20help%20you?%20（需要我提供什么帮助吗？）">289065406@qq.com</a>


------

