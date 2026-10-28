package dq1;

import com.whoop.hrZones.network.ZoneID;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: dq1.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Ldq1/e;", "", "<init>", "()V", "Lcom/whoop/hrZones/network/ZoneID;", "zoneId", "", "a", "(Lcom/whoop/hrZones/network/ZoneID;)Ljava/lang/String;", "zoneID", "b", "(Ljava/lang/String;)Lcom/whoop/hrZones/network/ZoneID;", "hrZones-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12292e {
    /* JADX INFO: renamed from: a */
    public final String m34221a(ZoneID zoneId) {
        AbstractC22676k.m65750j(zoneId, "zoneId");
        return zoneId.name();
    }

    /* JADX INFO: renamed from: b */
    public final ZoneID m34222b(String zoneID) {
        AbstractC22676k.m65750j(zoneID, "zoneID");
        return ZoneID.valueOf(zoneID);
    }
}
