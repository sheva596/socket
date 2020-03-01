package service;

import com.sun.jna.Library;

/**
 * @ProjectName: socket
 * @Package: service
 * @ClassName: JLRC
 * @Author: jerry
 * @Description: ${description}
 * @Date: 20-3-1 下午1:59
 * @Version: 1.0
 */
public interface JLRC extends Library {
    int getInfo(byte[]cid ,byte[]app_id, byte[]appkey, byte[] reqID, byte[] biz_sequence_id,
                byte[] info,byte[] picture, byte[] dn, byte[] appeidcode, byte[] errMsg,int decodeLevel ,byte[] ip)
            ;
}
