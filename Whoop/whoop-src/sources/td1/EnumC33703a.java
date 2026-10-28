package td1;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: td1.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m65681d2 = {"Ltd1/a;", "", "", "hardwareFamily", "<init>", "(Ljava/lang/String;II)V", "", "analyticsName", "()Ljava/lang/String;", "I", "getHardwareFamily", "()I", "Companion", "a", "MAVERICK", "HARVARD", "UNKNOWN", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC33703a {
    MAVERICK(13),
    HARVARD(6),
    UNKNOWN(-1);

    private final int hardwareFamily;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: td1.a$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Ltd1/a$a;", "", "<init>", "()V", "", "hardwareFamily", "Ltd1/a;", "a", "(Ljava/lang/Number;)Ltd1/a;", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001f  */
        /* JADX WARN: Code duplicated, block: B:15:0x0022 A[RETURN] */
        /* JADX INFO: renamed from: a */
        public final EnumC33703a m106480a(Number hardwareFamily) {
            int iIntValue = hardwareFamily != null ? hardwareFamily.intValue() : -1;
            for (EnumC33703a enumC33703a : EnumC33703a.values()) {
                if (enumC33703a.getHardwareFamily() == iIntValue) {
                    if (enumC33703a == null) {
                        return EnumC33703a.UNKNOWN;
                    }
                    return enumC33703a;
                }
            }
            enumC33703a = null;
            if (enumC33703a == null) {
                return EnumC33703a.UNKNOWN;
            }
            return enumC33703a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: td1.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f140892a;

        static {
            int[] iArr = new int[EnumC33703a.values().length];
            try {
                iArr[EnumC33703a.MAVERICK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC33703a.HARVARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC33703a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f140892a = iArr;
        }
    }

    EnumC33703a(int i13) {
        this.hardwareFamily = i13;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final String analyticsName() {
        int i13 = b.f140892a[ordinal()];
        if (i13 == 1) {
            return "Maverick";
        }
        if (i13 == 2) {
            return "Gen4";
        }
        if (i13 == 3) {
            return "";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int getHardwareFamily() {
        return this.hardwareFamily;
    }
}
