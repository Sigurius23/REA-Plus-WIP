package gc1;

import a71.C0520a;
import a71.C0522c;
import a71.EnumC0521b;
import a71.EnumC0523d;
import androidx.health.platform.client.proto.C1533u;
import b91.EnumC2888c;
import c41.C4092p2;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.items.graph.GraphLegendModel;
import com.whoop.design.models.items.graph.plot.scrubber.DataScrubberDetailsModel;
import com.whoop.design.models.items.graph.plot.scrubber.PhaseLabel;
import com.whoop.design.models.items.graph.plot.scrubber.SupplementalDataScrubberDetails;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gz0.AbstractC16315n0;
import hy0.C17750h1;
import hy0.EnumC17775o1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23465k;
import m83.AbstractC25267u;
import n21.C26191e;
import p208i2.C17919x;
import p490t0.AbstractC33253j;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23653j2;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import vb1.AbstractC35869b;

/* JADX INFO: renamed from: gc1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;", "model", "La71/a;", "a", "(Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;)La71/a;", "La71/d;", "style", "Ly81/e;", "f", "(La71/d;)Ly81/e;", "Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;", "phaseLabel", "Lhy0/h1;", "d", "(Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;)Lhy0/h1;", "Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;", "La71/c;", "e", "(Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;)La71/c;", "Lcom/whoop/design/models/InfoCalloutTileModel;", "infoCallout", "Lc41/p2;", "c", "(Lcom/whoop/design/models/InfoCalloutTileModel;)Lc41/p2;", "Lcom/whoop/design/models/items/graph/GraphLegendModel;", "graphLegend", "Ln21/e;", "b", "(Lcom/whoop/design/models/items/graph/GraphLegendModel;)Ln21/e;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15709a {

    /* JADX INFO: renamed from: gc1.a$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f59128a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f59129b;

        static {
            int[] iArr = new int[EnumC0523d.values().length];
            try {
                iArr[EnumC0523d.AWAKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0523d.BIOMARKER_NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0523d.BIOMARKER_NEUTRAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC0523d.BIOMARKER_POSITIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC0523d.BIOMARKER_SUFFICIENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC0523d.ELEVATED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC0523d.FAT_MASS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC0523d.HARD_HR_ZONE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC0523d.HIGH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC0523d.HIGH_RECOVERY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC0523d.LEAN_MASS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EnumC0523d.LIGHT_HR_ZONE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EnumC0523d.LIGHT_SLEEP.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[EnumC0523d.LOW_RECOVERY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[EnumC0523d.MAX_HR_ZONE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[EnumC0523d.MEDIUM_RECOVERY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[EnumC0523d.MODERATE_HR_ZONE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[EnumC0523d.NEGATIVE_TREND.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[EnumC0523d.NORMAL.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[EnumC0523d.POSITIVE_TREND.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[EnumC0523d.RECOVERY.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[EnumC0523d.REM_SLEEP.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[EnumC0523d.RESTORATIVE_HR_ZONE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[EnumC0523d.SAGE_ELEVATED.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[EnumC0523d.SAGE_HIGH.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[EnumC0523d.SAGE_NORMAL.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[EnumC0523d.SAGE_ELEVATED_RANGE.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[EnumC0523d.SAGE_HIGH_RANGE.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[EnumC0523d.SAGE_NORMAL_RANGE.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[EnumC0523d.SLEEP.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[EnumC0523d.SLEEP_NEED.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[EnumC0523d.STRAIN.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[EnumC0523d.SWS_SLEEP.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[EnumC0523d.VERY_LIGHT_HR_ZONE.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            f59128a = iArr;
            int[] iArr2 = new int[EnumC0521b.values().length];
            try {
                iArr2[EnumC0521b.MCI_LUTEAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr2[EnumC0521b.MCI_MENSTRUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr2[EnumC0521b.MCI_OVULATORY.ordinal()] = 3;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr2[EnumC0521b.MCI_FOLLICULAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused38) {
            }
            f59129b = iArr2;
        }
    }

    /* JADX INFO: renamed from: gc1.a$a0 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a0 f59130w = new a0();

        /* JADX INFO: renamed from: a */
        public final long m44234a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44234a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$b */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f59131w = new b();

        /* JADX INFO: renamed from: a */
        public final long m44235a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSurfaceMciLutealDim();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44235a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$b0 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b0 f59132w = new b0();

        /* JADX INFO: renamed from: a */
        public final long m44236a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentFocus15();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44236a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$c */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f59133w = new c();

        /* JADX INFO: renamed from: a */
        public final long m44237a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getTextMciLuteal();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44237a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$c0 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c0 f59134w = new c0();

        /* JADX INFO: renamed from: a */
        public final long m44238a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend15();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44238a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$d */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f59135w = new d();

        /* JADX INFO: renamed from: a */
        public final long m44239a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSurfaceMciMenstrualDim();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44239a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$d0 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d0 f59136w = new d0();

        /* JADX INFO: renamed from: a */
        public final long m44240a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentPositiveTrend15();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44240a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$e */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f59137w = new e();

        /* JADX INFO: renamed from: a */
        public final long m44241a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getTextMciMenstrual();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44241a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$e0 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e0 f59138w = new e0();

        /* JADX INFO: renamed from: a */
        public final long m44242a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44242a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$f */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f59139w = new f();

        /* JADX INFO: renamed from: a */
        public final long m44243a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSurfaceMciOvulatoryDim();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44243a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$f0 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f0 f59140w = new f0();

        /* JADX INFO: renamed from: a */
        public final long m44244a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44244a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$g */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f59141w = new g();

        /* JADX INFO: renamed from: a */
        public final long m44245a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getTextMciOvulatory();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44245a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$g0 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g0 f59142w = new g0();

        /* JADX INFO: renamed from: a */
        public final long m44246a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentAction();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44246a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$h */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f59143w = new h();

        /* JADX INFO: renamed from: a */
        public final long m44247a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSurfaceMciFollicularDim();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44247a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$h0 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h0 f59144w = new h0();

        /* JADX INFO: renamed from: a */
        public final long m44248a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrain();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44248a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$i */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i f59145w = new i();

        /* JADX INFO: renamed from: a */
        public final long m44249a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getTextMciFollicular();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44249a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$i0 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i0 f59146w = new i0();

        /* JADX INFO: renamed from: a */
        public final long m44250a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSleepDeepSleep();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44250a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$j */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final j f59147w = new j();

        /* JADX INFO: renamed from: a */
        public final long m44251a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryHighRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44251a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$j0 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final j0 f59148w = new j0();

        /* JADX INFO: renamed from: a */
        public final long m44252a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrainZone1();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44252a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$k */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final k f59149w = new k();

        /* JADX INFO: renamed from: a */
        public final long m44253a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSleepLightSleep();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44253a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$k0 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final k0 f59150w = new k0();

        /* JADX INFO: renamed from: a */
        public final long m44254a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44254a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$l */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final l f59151w = new l();

        /* JADX INFO: renamed from: a */
        public final long m44255a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrainZone2();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44255a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$l0 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final l0 f59152w = new l0();

        /* JADX INFO: renamed from: a */
        public final long m44256a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44256a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$m */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final m f59153w = new m();

        /* JADX INFO: renamed from: a */
        public final long m44257a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSleepLightSleep();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44257a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$m0 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final m0 f59154w = new m0();

        /* JADX INFO: renamed from: a */
        public final long m44258a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44258a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$n */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final n f59155w = new n();

        /* JADX INFO: renamed from: a */
        public final long m44259a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryLowRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44259a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$n0 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final n0 f59156w = new n0();

        /* JADX INFO: renamed from: a */
        public final long m44260a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSufficientTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44260a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$o */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final o f59157w = new o();

        /* JADX INFO: renamed from: a */
        public final long m44261a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrainZone5();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44261a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$o0 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final o0 f59158w = new o0();

        /* JADX INFO: renamed from: a */
        public final long m44262a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44262a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$p */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final p f59159w = new p();

        /* JADX INFO: renamed from: a */
        public final long m44263a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryMediumRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44263a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$p0 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final p0 f59160w = new p0();

        /* JADX INFO: renamed from: a */
        public final long m44264a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrainZone4();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44264a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$q */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final q f59161w = new q();

        /* JADX INFO: renamed from: a */
        public final long m44265a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrainZone3();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44265a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$q0 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final q0 f59162w = new q0();

        /* JADX INFO: renamed from: a */
        public final long m44266a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrainZone4();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44266a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$r */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final r f59163w = new r();

        /* JADX INFO: renamed from: a */
        public final long m44267a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44267a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$r0 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final r0 f59164w = new r0();

        /* JADX INFO: renamed from: a */
        public final long m44268a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrainZone5();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44268a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$s */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final s f59165w = new s();

        /* JADX INFO: renamed from: a */
        public final long m44269a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44269a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$t */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final t f59166w = new t();

        /* JADX INFO: renamed from: a */
        public final long m44270a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSleepAwake();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44270a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$u */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final u f59167w = new u();

        /* JADX INFO: renamed from: a */
        public final long m44271a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44271a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$v */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final v f59168w = new v();

        /* JADX INFO: renamed from: a */
        public final long m44272a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44272a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$w */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class w implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final w f59169w = new w();

        /* JADX INFO: renamed from: a */
        public final long m44273a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSleepRemSleep();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44273a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$x */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class x implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final x f59170w = new x();

        /* JADX INFO: renamed from: a */
        public final long m44274a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44274a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$y */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class y implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final y f59171w = new y();

        /* JADX INFO: renamed from: a */
        public final long m44275a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentFocus();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44275a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gc1.a$z */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class z implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final z f59172w = new z();

        /* JADX INFO: renamed from: a */
        public final long m44276a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44276a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: a */
    public static final C0520a m44228a(DataScrubberDetailsModel dataScrubberDetailsModel) {
        if (dataScrubberDetailsModel == null) {
            return new C0520a(null, null, null, null, null, null, null, true, null, null, null, null, 3967, null);
        }
        TextResource textResourceM21278l = AbstractC8693b.m21278l(dataScrubberDetailsModel.getPrimaryContextualDisplay());
        Double value = dataScrubberDetailsModel.getValue();
        ArrayList arrayList = null;
        Float fValueOf = value != null ? Float.valueOf((float) value.doubleValue()) : null;
        TextResource valueDisplay = dataScrubberDetailsModel.getValueDisplay();
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(dataScrubberDetailsModel.getUnitDisplay());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(dataScrubberDetailsModel.getSecondaryContextualDisplay());
        InterfaceC39332e interfaceC39332eM44233f = m44233f(dataScrubberDetailsModel.getScrubberStyle());
        String dataContext = dataScrubberDetailsModel.getDataContext();
        C17750h1 c17750h1M44231d = m44231d(dataScrubberDetailsModel.getPhaseLabel());
        SupplementalDataScrubberDetails supplementalDataScrubberDetails = dataScrubberDetailsModel.getSupplementalDataScrubberDetails();
        C0522c c0522cM44232e = supplementalDataScrubberDetails != null ? m44232e(supplementalDataScrubberDetails) : null;
        C4092p2 c4092p2M44230c = m44230c(dataScrubberDetailsModel.getCallout());
        List<GraphLegendModel> graphLegends = dataScrubberDetailsModel.getGraphLegends();
        if (graphLegends != null) {
            List<GraphLegendModel> list = graphLegends;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m44229b((GraphLegendModel) it.next()));
            }
        }
        return new C0520a(textResourceM21278l, fValueOf, valueDisplay, textResourceM21278l2, textResourceM21278l3, interfaceC39332eM44233f, dataContext, false, c17750h1M44231d, c0522cM44232e, arrayList, c4092p2M44230c, 128, null);
    }

    /* JADX INFO: renamed from: b */
    private static final C26191e m44229b(GraphLegendModel graphLegendModel) {
        return new C26191e(null, AbstractC35869b.m113876v(graphLegendModel.getGraphLegendStyle()), AbstractC8693b.m21278l(graphLegendModel.getLegendText()), AbstractC35869b.m113878x(graphLegendModel.getGraphLegendStyle()), AbstractC16315n0.m46377b(graphLegendModel.getIcon()), EnumC39333f.WHITE_70, null, EnumC2888c.B3, 65, null);
    }

    /* JADX INFO: renamed from: c */
    private static final C4092p2 m44230c(InfoCalloutTileModel infoCalloutTileModel) {
        if (infoCalloutTileModel != null) {
            return AbstractC23653j2.m68922b(infoCalloutTileModel);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private static final C17750h1 m44231d(PhaseLabel phaseLabel) {
        C23465k c23465k;
        if (phaseLabel == null) {
            return null;
        }
        int i13 = a.f59129b[phaseLabel.getStyle().ordinal()];
        if (i13 == 1) {
            c23465k = new C23465k(p745y81.Function1.m125323a(b.f59131w), p745y81.Function1.m125323a(c.f59133w));
        } else if (i13 == 2) {
            c23465k = new C23465k(p745y81.Function1.m125323a(d.f59135w), p745y81.Function1.m125323a(e.f59137w));
        } else if (i13 == 3) {
            c23465k = new C23465k(p745y81.Function1.m125323a(f.f59139w), p745y81.Function1.m125323a(g.f59141w));
        } else {
            if (i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            c23465k = new C23465k(p745y81.Function1.m125323a(h.f59143w), p745y81.Function1.m125323a(i.f59145w));
        }
        return new C17750h1(AbstractC8693b.m21278l(phaseLabel.getDisplay()), null, (InterfaceC39332e) c23465k.f92937w, null, (InterfaceC39332e) c23465k.f92938x, null, null, EnumC17775o1.SYMPTOMS, false, AbstractC33253j.m105489e(2 * 4), 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4193642, null);
    }

    /* JADX INFO: renamed from: e */
    public static final C0522c m44232e(SupplementalDataScrubberDetails model) {
        AbstractC22676k.m65750j(model, "model");
        return new C0522c(model.getLeadingLabelDisplay(), model.getLeadingRangeDisplay(), model.getTrailingLabelDisplay(), model.getTrailingRangeDisplay(), model.getUnitDisplay());
    }

    /* JADX INFO: renamed from: f */
    private static final InterfaceC39332e m44233f(EnumC0523d enumC0523d) {
        switch (enumC0523d == null ? -1 : a.f59128a[enumC0523d.ordinal()]) {
            case 1:
                return p745y81.Function1.m125323a(t.f59166w);
            case 2:
                return p745y81.Function1.m125323a(e0.f59138w);
            case 3:
                return p745y81.Function1.m125323a(l0.f59152w);
            case 4:
                return p745y81.Function1.m125323a(m0.f59154w);
            case 5:
                return p745y81.Function1.m125323a(n0.f59156w);
            case 6:
                return p745y81.Function1.m125323a(o0.f59158w);
            case 7:
                return p745y81.Function1.m125323a(p0.f59160w);
            case 8:
                return p745y81.Function1.m125323a(q0.f59162w);
            case 9:
                return p745y81.Function1.m125323a(r0.f59164w);
            case 10:
                return p745y81.Function1.m125323a(j.f59147w);
            case 11:
                return p745y81.Function1.m125323a(k.f59149w);
            case 12:
                return p745y81.Function1.m125323a(l.f59151w);
            case 13:
                return p745y81.Function1.m125323a(m.f59153w);
            case 14:
                return p745y81.Function1.m125323a(n.f59155w);
            case 15:
                return p745y81.Function1.m125323a(o.f59157w);
            case 16:
                return p745y81.Function1.m125323a(p.f59159w);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return p745y81.Function1.m125323a(q.f59161w);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return p745y81.Function1.m125323a(r.f59163w);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return p745y81.Function1.m125323a(s.f59165w);
            case 20:
                return p745y81.Function1.m125323a(u.f59167w);
            case 21:
                return p745y81.Function1.m125323a(v.f59168w);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return p745y81.Function1.m125323a(w.f59169w);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return p745y81.Function1.m125323a(x.f59170w);
            case 24:
                return p745y81.Function1.m125323a(y.f59171w);
            case 25:
                return p745y81.Function1.m125323a(z.f59172w);
            case 26:
                return p745y81.Function1.m125323a(a0.f59130w);
            case 27:
                return p745y81.Function1.m125323a(b0.f59132w);
            case 28:
                return p745y81.Function1.m125323a(c0.f59134w);
            case 29:
                return p745y81.Function1.m125323a(d0.f59136w);
            case 30:
                return p745y81.Function1.m125323a(f0.f59140w);
            case 31:
                return p745y81.Function1.m125323a(g0.f59142w);
            case 32:
                return p745y81.Function1.m125323a(h0.f59144w);
            case 33:
                return p745y81.Function1.m125323a(i0.f59146w);
            case 34:
                return p745y81.Function1.m125323a(j0.f59148w);
            default:
                return p745y81.Function1.m125323a(k0.f59150w);
        }
    }
}
