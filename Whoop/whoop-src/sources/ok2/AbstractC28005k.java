package ok2;

import com.whoop.hrZones.network.ZoneID;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: ok2.k */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/hrZones/network/ZoneID;", "Ly81/f;", "a", "(Lcom/whoop/hrZones/network/ZoneID;)Ly81/f;", "track-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28005k {

    /* JADX INFO: renamed from: ok2.k$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f112931a;

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
            f112931a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final EnumC39333f m84470a(ZoneID zoneID) {
        AbstractC22676k.m65750j(zoneID, "<this>");
        switch (a.f112931a[zoneID.ordinal()]) {
            case 1:
                return EnumC39333f.BRAND_WHITE;
            case 2:
                return EnumC39333f.STRAIN_ZONE_1;
            case 3:
                return EnumC39333f.STRAIN_ZONE_2;
            case 4:
                return EnumC39333f.STRAIN_ZONE_3;
            case 5:
                return EnumC39333f.STRAIN_ZONE_4;
            case 6:
                return EnumC39333f.STRAIN_ZONE_5;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
