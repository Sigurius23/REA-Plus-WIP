package f71;

import ge3.AbstractC15751g;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: f71.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m65681d2 = {"Lf71/f;", "", "<init>", "(Ljava/lang/String;I)V", "Ly81/e;", "mapToWhoopColor", "()Ly81/e;", "NO_DATA", "RECOVERY_HIGH", "RECOVERY_LOW", "RECOVERY_MEDIUM", "STRAIN", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC14225f {
    NO_DATA,
    RECOVERY_HIGH,
    RECOVERY_LOW,
    RECOVERY_MEDIUM,
    STRAIN;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: f71.f$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f51960a;

        static {
            int[] iArr = new int[EnumC14225f.values().length];
            try {
                iArr[EnumC14225f.NO_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC14225f.RECOVERY_HIGH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC14225f.RECOVERY_LOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC14225f.RECOVERY_MEDIUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC14225f.STRAIN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f51960a = iArr;
        }
    }

    /* JADX INFO: renamed from: f71.f$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f51961w = new b();

        /* JADX INFO: renamed from: a */
        public final long m40689a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite30();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m40689a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: f71.f$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f51962w = new c();

        /* JADX INFO: renamed from: a */
        public final long m40690a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryHighRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m40690a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: f71.f$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f51963w = new d();

        /* JADX INFO: renamed from: a */
        public final long m40691a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryLowRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m40691a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: f71.f$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f51964w = new e();

        /* JADX INFO: renamed from: a */
        public final long m40692a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryMediumRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m40692a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: f71.f$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f51965w = new f();

        /* JADX INFO: renamed from: a */
        public final long m40693a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrain();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m40693a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: f71.f$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f51966w = new g();

        /* JADX INFO: renamed from: a */
        public final long m40694a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m40694a((C39336i) obj));
        }
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final InterfaceC39332e mapToWhoopColor() {
        int i13 = a.f51960a[ordinal()];
        if (i13 == 1) {
            return p745y81.Function1.m125323a(b.f51961w);
        }
        if (i13 == 2) {
            return p745y81.Function1.m125323a(c.f51962w);
        }
        if (i13 == 3) {
            return p745y81.Function1.m125323a(d.f51963w);
        }
        if (i13 != 4) {
            return i13 != 5 ? p745y81.Function1.m125323a(g.f51966w) : p745y81.Function1.m125323a(f.f51965w);
        }
        return p745y81.Function1.m125323a(e.f51964w);
    }
}
