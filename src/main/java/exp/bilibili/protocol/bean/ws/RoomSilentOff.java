package exp.bilibili.protocol.bean.ws;

import net.sf.json.JSONObject;
import exp.bilibili.protocol.envm.BiliCmd;
import exp.bilibili.protocol.envm.BiliCmdAtrbt;
import exp.libs.utils.format.JsonUtils;

/**
 * 
 * <PRE>
 * 
 	关播通知
	{
	  "cmd": "ROOM_SILENT_OFF",
	  "data": [
	    
	  ],
	  "roomid": "269706"
	}
 * </PRE>
 * @version   2017-12-17
 * @author    EXP: 272629724@qq.com
 * @since     jdk版本：jdk1.6
 */
public class RoomSilentOff extends _Msg {

	private String roomId;
	
	public RoomSilentOff(JSONObject json) {
		super(json);
		this.cmd = BiliCmd.ROOM_SILENT_OFF;
	}
	
	@Override
	protected void analyse(JSONObject json) {
		this.roomId = JsonUtils.getStr(json, BiliCmdAtrbt.roomid);
	}

	public String getRoomId() {
		return roomId;
	}

}
