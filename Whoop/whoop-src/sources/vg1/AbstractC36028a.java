package vg1;

import ad3.AbstractC0757c;
import ad3.C0755b;
import com.whoop.connectivityCore.firmware.models.WhoopFwDevice;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vg1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "", "b", "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)Ljava/lang/String;", "a", "(Ljava/lang/String;)Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "firmware-update-service_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36028a {
    /* JADX INFO: renamed from: a */
    public static final WhoopFwDevice m114389a(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        C0755b c0755b = AbstractC0757c.f2762d;
        c0755b.getClass();
        return (WhoopFwDevice) c0755b.m1831b(WhoopFwDevice.INSTANCE.serializer(), str);
    }

    /* JADX INFO: renamed from: b */
    public static final String m114390b(WhoopFwDevice whoopFwDevice) {
        AbstractC22676k.m65750j(whoopFwDevice, "<this>");
        C0755b c0755b = AbstractC0757c.f2762d;
        c0755b.getClass();
        return c0755b.m1833d(WhoopFwDevice.INSTANCE.serializer(), whoopFwDevice);
    }
}
