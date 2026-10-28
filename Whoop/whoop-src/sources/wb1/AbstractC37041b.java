package wb1;

import com.whoop.design.models.items.graph.plane.axis.label.AxisLabelStyle;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;

/* JADX INFO: renamed from: wb1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;", "style", "Ly81/e;", "a", "(Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;)Ly81/e;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37041b {

    /* JADX INFO: renamed from: wb1.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f158510a;

        static {
            int[] iArr = new int[AxisLabelStyle.values().length];
            try {
                iArr[AxisLabelStyle.ACCENT_NEGATIVE_TREND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AxisLabelStyle.ACCENT_POSITIVE_TREND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AxisLabelStyle.HIGHLIGHTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AxisLabelStyle.RECOVERY_LOW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AxisLabelStyle.RECOVERY_MEDIUM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AxisLabelStyle.RECOVERY_HIGH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AxisLabelStyle.STANDARD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AxisLabelStyle.STRAIN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AxisLabelStyle.BIOMARKER_SUFFICIENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f158510a = iArr;
        }
    }

    /* JADX INFO: renamed from: wb1.b$b */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f158511w = new b();

        /* JADX INFO: renamed from: a */
        public final long m118905a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m118905a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: wb1.b$c */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f158512w = new c();

        /* JADX INFO: renamed from: a */
        public final long m118906a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m118906a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: wb1.b$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f158513w = new d();

        /* JADX INFO: renamed from: a */
        public final long m118907a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m118907a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: wb1.b$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f158514w = new e();

        /* JADX INFO: renamed from: a */
        public final long m118908a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryLowRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m118908a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: wb1.b$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f158515w = new f();

        /* JADX INFO: renamed from: a */
        public final long m118909a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryMediumRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m118909a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: wb1.b$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f158516w = new g();

        /* JADX INFO: renamed from: a */
        public final long m118910a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryHighRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m118910a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: wb1.b$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f158517w = new h();

        /* JADX INFO: renamed from: a */
        public final long m118911a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m118911a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: wb1.b$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i f158518w = new i();

        /* JADX INFO: renamed from: a */
        public final long m118912a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrain();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m118912a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: wb1.b$j */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final j f158519w = new j();

        /* JADX INFO: renamed from: a */
        public final long m118913a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSufficientTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m118913a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC39332e m118904a(AxisLabelStyle style) {
        AbstractC22676k.m65750j(style, "style");
        switch (a.f158510a[style.ordinal()]) {
            case 1:
                return p745y81.Function1.m125323a(b.f158511w);
            case 2:
                return p745y81.Function1.m125323a(c.f158512w);
            case 3:
                return p745y81.Function1.m125323a(d.f158513w);
            case 4:
                return p745y81.Function1.m125323a(e.f158514w);
            case 5:
                return p745y81.Function1.m125323a(f.f158515w);
            case 6:
                return p745y81.Function1.m125323a(g.f158516w);
            case 7:
                return p745y81.Function1.m125323a(h.f158517w);
            case 8:
                return p745y81.Function1.m125323a(i.f158518w);
            case 9:
                return p745y81.Function1.m125323a(j.f158519w);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
