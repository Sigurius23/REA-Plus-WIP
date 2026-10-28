package p211i5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import androidx.core.app.FrameMetricsAggregator;
import androidx.health.platform.client.proto.C1533u;
import bh3.InterfaceC3260g;
import i92.AbstractC18274s;
import i92.C18257b;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.notifications.PushNotificationReceivedListener;
import io.sentry.C20511q4;
import io.sentry.C20513q6;
import io.sentry.EnumC20418m;
import io.sentry.InterfaceC20632y1;
import io.sentry.android.core.AbstractC20118j0;
import io.sentry.clientreport.C20295c;
import io.sentry.clientreport.EnumC20296d;
import io.sentry.okhttp.C20452d;
import io.sentry.util.AbstractC20589k;
import io.sentry.util.AbstractC20592n;
import io.sentry.util.InterfaceC20583e;
import io.sentry.util.network.InterfaceC20596d;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import me3.InterfaceC25479b;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34832o0;

/* JADX INFO: renamed from: i5.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C18090c implements InterfaceC25479b, InterfaceC3260g, PushNotificationReceivedListener, InterfaceC20632y1, InterfaceC20583e, InterfaceC20596d {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f70300w;

    public /* synthetic */ C18090c(int i13) {
        this.f70300w = i13;
    }

    @Override // io.sentry.util.network.InterfaceC20596d
    /* JADX INFO: renamed from: a */
    public LinkedHashMap mo51937a(Object obj) {
        C34832o0 req = (C34832o0) obj;
        AbstractC22676k.m65750j(req, "req");
        return C20452d.m56650c(req.f146714c);
    }

    @Override // bh3.InterfaceC3260g
    /* JADX INFO: renamed from: b */
    public Object mo1678b(Object obj) {
        return AbstractC18274s.m52647l((Throwable) obj);
    }

    /* JADX INFO: renamed from: c */
    public Object m51938c(Context context) {
        String string;
        switch (this.f70300w) {
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC20118j0.m56008b(context);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                try {
                    return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                } catch (Throwable unused) {
                    return null;
                }
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                try {
                    ApplicationInfo applicationInfo = context.getApplicationInfo();
                    int i13 = applicationInfo.labelRes;
                    if (i13 == 0) {
                        CharSequence charSequence = applicationInfo.nonLocalizedLabel;
                        string = charSequence != null ? charSequence.toString() : context.getPackageManager().getApplicationLabel(applicationInfo).toString();
                    } else {
                        string = context.getString(i13);
                    }
                    return string;
                } catch (Throwable unused2) {
                    return null;
                }
            case 20:
                return AbstractC20118j0.m56007a(context);
            default:
                try {
                    return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                } catch (Throwable unused3) {
                    return null;
                }
        }
    }

    @Override // io.sentry.InterfaceC20632y1
    /* JADX INFO: renamed from: d */
    public Object mo11181d() {
        return null;
    }

    @Override // io.sentry.util.InterfaceC20583e
    /* JADX INFO: renamed from: j */
    public Object mo19991j() {
        switch (this.f70300w) {
            case 12:
                return C20513q6.empty();
            case 13:
                return new C20511q4();
            case 14:
                byte[] bArr = new byte[8];
                AbstractC20589k.m56722a().m56720b(bArr);
                byte b = (byte) (bArr[6] & 15);
                bArr[6] = b;
                bArr[6] = (byte) (b | 64);
                long j7 = 0;
                for (int i13 = 0; i13 < 8; i13++) {
                    j7 = (j7 << 8) | ((long) (bArr[i13] & 255));
                }
                char[] cArr = new char[16];
                AbstractC20592n.m56727a(cArr, j7);
                return new String(cArr);
            case 15:
                return new FrameMetricsAggregator();
            case 24:
                return new Timer(true);
            default:
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                for (EnumC20296d enumC20296d : EnumC20296d.values()) {
                    for (EnumC20418m enumC20418m : EnumC20418m.values()) {
                        concurrentHashMap.put(new C20295c(enumC20296d.getReason(), enumC20418m.getCategory()), new AtomicLong(0L));
                    }
                }
                return Collections.unmodifiableMap(concurrentHashMap);
        }
    }

    @Override // me3.InterfaceC25479b
    public void log(String str) {
        C18257b.m52594c(str);
    }

    @Override // io.getstream.chat.android.client.notifications.PushNotificationReceivedListener
    public void onPushNotificationReceived(String str, String str2) {
        ChatClient.pushNotificationReceivedListener$lambda$3(str, str2);
    }
}
