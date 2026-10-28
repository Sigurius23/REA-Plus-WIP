package gl2;

import jl2.EnumC21774a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gl2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Ljl2/a;", "hrZone", "", "b", "(Ljl2/a;)Ljava/lang/String;", "a", "training_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15972b {

    /* JADX INFO: renamed from: gl2.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f60461a;

        static {
            int[] iArr = new int[EnumC21774a.values().length];
            try {
                iArr[EnumC21774a.ZONE_5.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC21774a.ZONE_4.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC21774a.ZONE_3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC21774a.ZONE_2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC21774a.ZONE_1.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f60461a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final String m45120a(EnumC21774a hrZone) {
        AbstractC22676k.m65750j(hrZone, "hrZone");
        int i13 = a.f60461a[hrZone.ordinal()];
        if (i13 == 1) {
            return "zone_5_max";
        }
        if (i13 == 2) {
            return "zone_4_max";
        }
        if (i13 == 3) {
            return "zone_3_max";
        }
        if (i13 == 4) {
            return "zone_2_max";
        }
        if (i13 == 5) {
            return "zone_1_max";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public static final String m45121b(EnumC21774a hrZone) {
        AbstractC22676k.m65750j(hrZone, "hrZone");
        int i13 = a.f60461a[hrZone.ordinal()];
        if (i13 == 1) {
            return "zone_5_min";
        }
        if (i13 == 2) {
            return "zone_4_min";
        }
        if (i13 == 3) {
            return "zone_3_min";
        }
        if (i13 == 4) {
            return "zone_2_min";
        }
        if (i13 == 5) {
            return "zone_1_min";
        }
        throw new NoWhenBranchMatchedException();
    }
}
