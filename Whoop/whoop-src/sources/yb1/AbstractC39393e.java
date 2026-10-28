package yb1;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.items.graph.plot.band.BandPlotStyle;
import i91.AbstractC18249c;
import k61.C22230c;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.AbstractC42793j;
import p745y81.C39336i;

/* JADX INFO: renamed from: yb1.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;", "style", "Lk61/c;", "a", "(Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;)Lk61/c;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39393e {

    /* JADX INFO: renamed from: yb1.e$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f169509a;

        static {
            int[] iArr = new int[BandPlotStyle.values().length];
            try {
                iArr[BandPlotStyle.SLEEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BandPlotStyle.ACCENT_NEGATIVE_10_FADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BandPlotStyle.ACCENT_POSITIVE_10_FADE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BandPlotStyle.NEUTRAL_10_FADE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BandPlotStyle.ACCENT_NEGATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BandPlotStyle.ACCENT_POSITIVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BandPlotStyle.NEUTRAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BandPlotStyle.SUFFICIENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BandPlotStyle.SUFFICIENT_10_FADE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BandPlotStyle.LIGHT_SLEEP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BandPlotStyle.REM_SLEEP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BandPlotStyle.MODERATE_HR_ZONE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BandPlotStyle.SAGE_IMPACTS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[BandPlotStyle.SAGE_IMPACTS_HIGHLIGHTED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[BandPlotStyle.SAGE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[BandPlotStyle.WHITE_10.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[BandPlotStyle.FIRST_TRIMESTER.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[BandPlotStyle.SECOND_TRIMESTER.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[BandPlotStyle.THIRD_TRIMESTER.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[BandPlotStyle.POST_PARTUM.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[BandPlotStyle.UNKNOWN.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[BandPlotStyle.RECOVERY.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[BandPlotStyle.PREGNANCY.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[BandPlotStyle.STRAIN.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[BandPlotStyle.STRESS.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            f169509a = iArr;
        }
    }

    /* JADX INFO: renamed from: yb1.e$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f169510w = new b();

        /* JADX INFO: renamed from: a */
        public final long m125811a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return C17919x.m51541c(0.5f, colorBackground.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m125811a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: yb1.e$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f169511w = new c();

        /* JADX INFO: renamed from: a */
        public final long m125812a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getTransparent();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m125812a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: yb1.e$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f169512w = new d();

        /* JADX INFO: renamed from: a */
        public final long m125813a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getWhite5();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m125813a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: a */
    public static final C22230c m125810a(BandPlotStyle style) {
        AbstractC22676k.m65750j(style, "style");
        switch (a.f169509a[style.ordinal()]) {
            case 1:
                return new C22230c(0.0f, 0, 0, AbstractC18249c.m52574l(b.f169510w), C17919x.m51541c(0.2f, AbstractC42793j.m125436c().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String()), false, 39, null);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 24:
            case 25:
                return null;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 20:
                return new C22230c(0.0f, 0, 0, AbstractC18249c.m52574l(c.f169511w), 0L, false, 55, null);
            case 21:
                return new C22230c(1, 0, 0, AbstractC18249c.m52574l(d.f169512w), 0L, false, 54, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
