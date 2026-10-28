package wb1;

import j61.EnumC21370d;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;

/* JADX INFO: renamed from: wb1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lj61/d;", "style", "Ly81/e;", "a", "(Lj61/d;)Ly81/e;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37043d {

    /* JADX INFO: renamed from: wb1.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f158520a;

        static {
            int[] iArr = new int[EnumC21370d.values().length];
            try {
                iArr[EnumC21370d.SLEEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC21370d.SLEEP_NEED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC21370d.GRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC21370d.MCI_RED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f158520a = iArr;
        }
    }

    /* JADX INFO: renamed from: wb1.d$b */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f158521w = new b();

        /* JADX INFO: renamed from: a */
        public final long m118915a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m118915a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: wb1.d$c */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f158522w = new c();

        /* JADX INFO: renamed from: a */
        public final long m118916a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentAction();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m118916a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: wb1.d$d */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f158523w = new d();

        /* JADX INFO: renamed from: a */
        public final long m118917a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite20();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m118917a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: wb1.d$e */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f158524w = new e();

        /* JADX INFO: renamed from: a */
        public final long m118918a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getMciRed();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m118918a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: wb1.d$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f158525w = new f();

        /* JADX INFO: renamed from: a */
        public final long m118919a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m118919a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC39332e m118914a(EnumC21370d enumC21370d) {
        int i13 = enumC21370d == null ? -1 : a.f158520a[enumC21370d.ordinal()];
        if (i13 == 1) {
            return p745y81.Function1.m125323a(b.f158521w);
        }
        if (i13 == 2) {
            return p745y81.Function1.m125323a(c.f158522w);
        }
        if (i13 != 3) {
            return i13 != 4 ? p745y81.Function1.m125323a(f.f158525w) : p745y81.Function1.m125323a(e.f158524w);
        }
        return p745y81.Function1.m125323a(d.f158523w);
    }
}
