package p385ox;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: ox.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC28446a {

    /* JADX INFO: renamed from: a */
    public static final String[] f114688a = {"com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su", "com.topjohnwu.magisk", "com.kingroot.kinguser", "com.kingo.root", "com.smedialink.oneclickroot", "com.zhiqupk.root.global", "com.alephzain.framaroot"};

    /* JADX INFO: renamed from: b */
    public static final String[] f114689b = {"com.koushikdutta.rommanager", "com.koushikdutta.rommanager.license", "com.dimonvideo.luckypatcher", "com.chelpus.lackypatch", "com.ramdroid.appquarantine", "com.ramdroid.appquarantinepro", "com.android.vending.billing.InAppBillingService.COIN", "com.android.vending.billing.InAppBillingService.LUCK", "com.chelpus.luckypatcher", "com.blackmartalpha", "org.blackmart.market", "com.allinone.free", "com.repodroid.app", "org.creeplays.hack", "com.baseappfull.fwd", "com.zmapp", "com.dv.marketmod.installer", "org.mobilism.android", "com.android.wp.net.log", "com.android.camera.update", "cc.madkite.freedom", "com.solohsu.android.edxp.manager", "org.meowcat.edxposed.manager", "com.xmodgame", "com.cih.game_cih", "com.charles.lpoqasert", "catch_.me_.if_.you_.can_"};

    /* JADX INFO: renamed from: c */
    public static final String[] f114690c = {"/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/cache/", "/data/", "/dev/"};

    /* JADX INFO: renamed from: d */
    public static final String[] f114691d = {"/system", "/system/bin", "/system/sbin", "/system/xbin", "/vendor/bin", "/sbin", "/etc"};

    /* JADX INFO: renamed from: a */
    public static String[] m86214a() {
        ArrayList arrayList = new ArrayList(Arrays.asList(f114690c));
        String str = System.getenv("PATH");
        if (str == null || "".equals(str)) {
            return (String[]) arrayList.toArray(new String[0]);
        }
        String[] strArrSplit = str.split(":");
        int length = strArrSplit.length;
        for (int i13 = 0; i13 < length; i13++) {
            String strConcat = strArrSplit[i13];
            if (!strConcat.endsWith("/")) {
                strConcat = strConcat.concat("/");
            }
            if (!arrayList.contains(strConcat)) {
                arrayList.add(strConcat);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
