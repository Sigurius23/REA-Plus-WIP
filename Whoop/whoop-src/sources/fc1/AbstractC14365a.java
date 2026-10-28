package fc1;

import com.whoop.design.models.items.graph.plot.progress.ProgressPlotStyle;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;

/* JADX INFO: renamed from: fc1.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;", "plotStyle", "Ly81/e;", "a", "(Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;)Ly81/e;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14365a {

    /* JADX INFO: renamed from: fc1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f52438a;

        static {
            int[] iArr = new int[ProgressPlotStyle.values().length];
            try {
                iArr[ProgressPlotStyle.PREGNANCY_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProgressPlotStyle.PREGNANCY_FIRST_TRIMESTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProgressPlotStyle.PREGNANCY_SECOND_TRIMESTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProgressPlotStyle.PREGNANCY_THIRD_TRIMESTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProgressPlotStyle.PREGNANCY_POST_PARTUM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ProgressPlotStyle.INACTIVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ProgressPlotStyle.MCI_MENSTRUAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ProgressPlotStyle.MCI_FOLLICULAR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ProgressPlotStyle.MCI_OVULATORY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ProgressPlotStyle.MCI_LUTEAL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f52438a = iArr;
        }
    }

    /* JADX INFO: renamed from: fc1.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f52439w = new b();

        /* JADX INFO: renamed from: a */
        public final long m41002a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSurfaceMciLuteal();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m41002a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: fc1.a$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f52440w = new c();

        /* JADX INFO: renamed from: a */
        public final long m41003a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite20();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m41003a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: fc1.a$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f52441w = new d();

        /* JADX INFO: renamed from: a */
        public final long m41004a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSleepLightSleep();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m41004a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: fc1.a$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f52442w = new e();

        /* JADX INFO: renamed from: a */
        public final long m41005a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSleepRemSleep();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m41005a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: fc1.a$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f52443w = new f();

        /* JADX INFO: renamed from: a */
        public final long m41006a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrainZone3();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m41006a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: fc1.a$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f52444w = new g();

        /* JADX INFO: renamed from: a */
        public final long m41007a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m41007a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: fc1.a$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f52445w = new h();

        /* JADX INFO: renamed from: a */
        public final long m41008a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m41008a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: fc1.a$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i f52446w = new i();

        /* JADX INFO: renamed from: a */
        public final long m41009a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSurfaceMciMenstrual();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m41009a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: fc1.a$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final j f52447w = new j();

        /* JADX INFO: renamed from: a */
        public final long m41010a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSurfaceMciFollicular();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m41010a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: fc1.a$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final k f52448w = new k();

        /* JADX INFO: renamed from: a */
        public final long m41011a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSurfaceMciOvulatory();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m41011a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC39332e m41001a(ProgressPlotStyle plotStyle) {
        AbstractC22676k.m65750j(plotStyle, "plotStyle");
        switch (a.f52438a[plotStyle.ordinal()]) {
            case 1:
                return p745y81.Function1.m125323a(c.f52440w);
            case 2:
                return p745y81.Function1.m125323a(d.f52441w);
            case 3:
                return p745y81.Function1.m125323a(e.f52442w);
            case 4:
                return p745y81.Function1.m125323a(f.f52443w);
            case 5:
                return p745y81.Function1.m125323a(g.f52444w);
            case 6:
                return p745y81.Function1.m125323a(h.f52445w);
            case 7:
                return p745y81.Function1.m125323a(i.f52446w);
            case 8:
                return p745y81.Function1.m125323a(j.f52447w);
            case 9:
                return p745y81.Function1.m125323a(k.f52448w);
            case 10:
                return p745y81.Function1.m125323a(b.f52439w);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
