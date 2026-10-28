package yg2;

import com.whoop.hrZones.network.ZoneID;
import java.util.LinkedList;
import java.util.List;
import m83.AbstractC25265s;
import n71.C26436q;
import n71.EnumC26437r;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: yg2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Lyg2/c;", "", "<init>", "()V", "Lcom/whoop/hrZones/network/ZoneID;", "zoneID", "Ln71/r;", "c", "(Lcom/whoop/hrZones/network/ZoneID;)Ln71/r;", "Lyg2/d$a;", "state", "", "", "a", "(Lyg2/d$a;)Ljava/util/List;", "Lyg2/d;", "Ln71/q;", "b", "(Lyg2/d;)Ln71/q;", "Ljava/util/LinkedList;", "Ljava/util/LinkedList;", "heartRates", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39528c {

    /* JADX INFO: renamed from: b */
    public static final int f169985b = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final LinkedList<Integer> heartRates = new LinkedList<>();

    /* JADX INFO: renamed from: yg2.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f169987a;

        static {
            int[] iArr = new int[ZoneID.values().length];
            try {
                iArr[ZoneID.ZONE_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ZoneID.ZONE_1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ZoneID.ZONE_2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ZoneID.ZONE_3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ZoneID.ZONE_4.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ZoneID.ZONE_5.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f169987a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    private final List<Integer> m126254a(AbstractC39529d.a state) {
        if (this.heartRates.size() == 30) {
            this.heartRates.remove(0);
        }
        this.heartRates.add(Integer.valueOf(state.getHeartRate()));
        if (this.heartRates.isEmpty()) {
            return null;
        }
        return AbstractC25265s.m74093D1(this.heartRates);
    }

    /* JADX INFO: renamed from: c */
    private final EnumC26437r m126255c(ZoneID zoneID) {
        switch (a.f169987a[zoneID.ordinal()]) {
            case 1:
                return EnumC26437r.ZONE_0;
            case 2:
                return EnumC26437r.ZONE_1;
            case 3:
                return EnumC26437r.ZONE_2;
            case 4:
                return EnumC26437r.ZONE_3;
            case 5:
                return EnumC26437r.ZONE_4;
            case 6:
                return EnumC26437r.ZONE_5;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: b */
    public final C26436q m126256b(AbstractC39529d state) {
        AbstractC22676k.m65750j(state, "state");
        if (state instanceof AbstractC39529d.a) {
            AbstractC39529d.a aVar = (AbstractC39529d.a) state;
            return new C26436q(m126254a(aVar), m126255c(aVar.getZoneID()), 0, 4, null);
        }
        if (state instanceof AbstractC39529d.b) {
            return new C26436q(null, EnumC26437r.CALIBRATING, 0, 4, null);
        }
        if (state instanceof AbstractC39529d.c) {
            return new C26436q(null, EnumC26437r.DEVICE_OFF_BODY, 0, 4, null);
        }
        if (state instanceof AbstractC39529d.d) {
            return new C26436q(null, EnumC26437r.DISCONNECTED, 0, 4, null);
        }
        if (state instanceof AbstractC39529d.e) {
            return new C26436q(null, EnumC26437r.FW_UPDATE_IN_PROGRESS, 0, 4, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
