package p038bx;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;

/* JADX INFO: renamed from: bx.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3686a {

    /* JADX INFO: renamed from: a */
    public static final Set f15055a = AbstractC25260n.m74059b1(new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION", "android.permission.SYSTEM_ALERT_WINDOW", "android.permission.WRITE_SETTINGS", "android.permission.MANAGE_EXTERNAL_STORAGE", "android.permission.REQUEST_INSTALL_PACKAGES", "android.permission.POST_NOTIFICATIONS", "android.permission.BODY_SENSORS_BACKGROUND"});

    /* JADX INFO: renamed from: b */
    public static final Object f15056b = null;

    static {
        Map mapM73990Y = AbstractC25247g0.m73990Y(new C23465k("android.permission.READ_CALENDAR", "android.permission-group.CALENDAR"), new C23465k("android.permission.WRITE_CALENDAR", "android.permission-group.CALENDAR"), new C23465k("android.permission.READ_CALL_LOG", "android.permission-group.CALL_LOG"), new C23465k("android.permission.WRITE_CALL_LOG", "android.permission-group.CALL_LOG"), new C23465k("android.permission.PROCESS_OUTGOING_CALLS", "android.permission-group.CALL_LOG"), new C23465k("android.permission.CAMERA", "android.permission-group.CAMERA"), new C23465k("android.permission.READ_CONTACTS", "android.permission-group.CONTACTS"), new C23465k("android.permission.WRITE_CONTACTS", "android.permission-group.CONTACTS"), new C23465k("android.permission.GET_ACCOUNTS", "android.permission-group.CONTACTS"), new C23465k("android.permission.ACCESS_FINE_LOCATION", "android.permission-group.LOCATION"), new C23465k("android.permission.ACCESS_COARSE_LOCATION", "android.permission-group.LOCATION"), new C23465k("android.permission.ACCESS_BACKGROUND_LOCATION", "android.permission-group.LOCATION"), new C23465k("android.permission.RECORD_AUDIO", "android.permission-group.MICROPHONE"), new C23465k("android.permission.READ_PHONE_STATE", "android.permission-group.PHONE"), new C23465k("android.permission.READ_PHONE_NUMBERS", "android.permission-group.PHONE"), new C23465k("android.permission.CALL_PHONE", "android.permission-group.PHONE"), new C23465k("android.permission.ANSWER_PHONE_CALLS", "android.permission-group.PHONE"), new C23465k("com.android.voicemail.permission.ADD_VOICEMAIL", "android.permission-group.PHONE"), new C23465k("android.permission.USE_SIP", "android.permission-group.PHONE"), new C23465k("android.permission.ACCEPT_HANDOVER", "android.permission-group.PHONE"), new C23465k("android.permission.BODY_SENSORS", "android.permission-group.SENSORS"), new C23465k("android.permission.ACTIVITY_RECOGNITION", "android.permission-group.ACTIVITY_RECOGNITION"), new C23465k("android.permission.SEND_SMS", "android.permission-group.SMS"), new C23465k("android.permission.RECEIVE_SMS", "android.permission-group.SMS"), new C23465k("android.permission.READ_SMS", "android.permission-group.SMS"), new C23465k("android.permission.RECEIVE_WAP_PUSH", "android.permission-group.SMS"), new C23465k("android.permission.RECEIVE_MMS", "android.permission-group.SMS"), new C23465k("android.permission.READ_EXTERNAL_STORAGE", "android.permission-group.STORAGE"), new C23465k("android.permission.WRITE_EXTERNAL_STORAGE", "android.permission-group.STORAGE"), new C23465k("android.permission.ACCESS_MEDIA_LOCATION", "android.permission-group.STORAGE"));
        LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(AbstractC25247g0.m73989X(new C23465k("android.permission.MANAGE_EXTERNAL_STORAGE", "android.permission-group.STORAGE")));
        linkedHashMapM74003l0.putAll(mapM73990Y);
        Map mapM74001j0 = AbstractC25247g0.m74001j0(linkedHashMapM74003l0);
        LinkedHashMap linkedHashMapM74003l1 = AbstractC25247g0.m74003l0(AbstractC25247g0.m73990Y(new C23465k("android.permission.BLUETOOTH_SCAN", "android.permission-group.NEARBY_DEVICES"), new C23465k("android.permission.BLUETOOTH_ADVERTISE", "android.permission-group.NEARBY_DEVICES"), new C23465k("android.permission.BLUETOOTH_CONNECT", "android.permission-group.NEARBY_DEVICES")));
        linkedHashMapM74003l1.putAll(mapM74001j0);
        Map mapM74001j1 = AbstractC25247g0.m74001j0(linkedHashMapM74003l1);
        LinkedHashMap linkedHashMapM74003l2 = AbstractC25247g0.m74003l0(AbstractC25247g0.m73990Y(new C23465k("android.permission.READ_MEDIA_IMAGES", "android.permission-group.READ_MEDIA_VISUAL"), new C23465k("android.permission.READ_MEDIA_VIDEO", "android.permission-group.READ_MEDIA_VISUAL"), new C23465k("android.permission.READ_MEDIA_AUDIO", "android.permission-group.READ_MEDIA_AURAL"), new C23465k("android.permission.POST_NOTIFICATIONS", "android.permission-group.NOTIFICATIONS"), new C23465k("android.permission.NEARBY_WIFI_DEVICES", "android.permission-group.NEARBY_DEVICES"), new C23465k("android.permission.BODY_SENSORS_BACKGROUND", "android.permission-group.SENSORS")));
        linkedHashMapM74003l2.putAll(mapM74001j1);
        AbstractC25247g0.m74001j0(linkedHashMapM74003l2);
    }
}
