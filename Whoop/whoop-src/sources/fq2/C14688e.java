package fq2;

import ar2.C1932c;
import b91.AbstractC2890e;
import b91.C2886a;
import b91.C2889d;
import br2.C3561c;
import br2.C3568j;
import br2.EnumC3560b;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.UnknownDesignModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.user.journey.model.UserJourneyFooterStyle;
import com.whoop.user.journey.model.UserJourneyStep;
import com.whoop.user.journey.model.weekinreview.ChatStep;
import com.whoop.user.journey.model.weekinreview.ColoredText;
import com.whoop.user.journey.model.weekinreview.Day;
import com.whoop.user.journey.model.weekinreview.PastSevenDaysStep;
import com.whoop.user.journey.model.weekinreview.Recommendation;
import com.whoop.user.journey.model.weekinreview.WirIntroStep;
import com.whoop.user.journey.model.weekinreview.WirPillarIntroStep;
import com.whoop.user.journey.model.weekinreview.WirWrapUpRecommendationsStep;
import com.whoop.user.journey.model.yearinreview.Bar;
import com.whoop.user.journey.model.yearinreview.ContentSection;
import com.whoop.user.journey.model.yearinreview.DonutChartStep;
import com.whoop.user.journey.model.yearinreview.DualBarStep;
import com.whoop.user.journey.model.yearinreview.FinaleStep;
import com.whoop.user.journey.model.yearinreview.FooterText;
import com.whoop.user.journey.model.yearinreview.GaugeStep;
import com.whoop.user.journey.model.yearinreview.HighlightedText;
import com.whoop.user.journey.model.yearinreview.HorizontalBarStep;
import com.whoop.user.journey.model.yearinreview.HorizontalSleepBarStep;
import com.whoop.user.journey.model.yearinreview.ImageOnlyStep;
import com.whoop.user.journey.model.yearinreview.InReviewDesignItemStep;
import com.whoop.user.journey.model.yearinreview.IntroStepStep;
import com.whoop.user.journey.model.yearinreview.LongTextStep;
import com.whoop.user.journey.model.yearinreview.NumberWithImage;
import com.whoop.user.journey.model.yearinreview.NumberWithImageFontSize;
import com.whoop.user.journey.model.yearinreview.PillarIntroStep;
import com.whoop.user.journey.model.yearinreview.QuizAnswerOption;
import com.whoop.user.journey.model.yearinreview.QuizStep;
import com.whoop.user.journey.model.yearinreview.SectionType;
import com.whoop.user.journey.model.yearinreview.ShareableStep;
import com.whoop.user.journey.model.yearinreview.ShortTextStep;
import com.whoop.user.journey.model.yearinreview.StackedHorizontalBarsStep;
import com.whoop.user.journey.model.yearinreview.StatItemModel;
import com.whoop.user.journey.model.yearinreview.StatListStep;
import cr2.C11087c;
import cr2.C11091g;
import cr2.EnumC11092h;
import er2.C13579a;
import er2.C13580b;
import er2.EnumC13585g;
import fr2.C14717b;
import gb1.AbstractC15673b0;
import gq2.C16082a;
import gq2.C16083b;
import gq2.C16084c;
import gr2.C16113a;
import gr2.C16114b;
import gr2.EnumC16115c;
import gz0.EnumC16313m0;
import hr2.AbstractC17588h;
import hr2.C17581a;
import hr2.C17582b;
import hy0.EnumC17727b2;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import ir2.C20862a;
import ir2.C20863b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.C21535a;
import jr2.AbstractC21902a;
import jr2.C21905d;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kr2.AbstractC22815d;
import lr2.C24700a;
import lr2.C24701b;
import lr2.InterfaceC24703d;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import ny0.C27256h;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p636y3.C39183o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.AbstractC24675g;
import p717lq2.AbstractC24688t;
import p717lq2.C24670b;
import p717lq2.EnumC24674f;
import p717lq2.InterfaceC24673e;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import rq2.C31713a;
import rq2.C31722e0;
import rq2.C31723f;
import rq2.C31734k0;
import rq2.C31744p0;
import rq2.C31745q;
import rq2.C31749s;
import rq2.C31757y;
import sq2.C32885b;
import sq2.C32887d;
import tq2.C34090g;
import tq2.C34091h;
import uq2.C35167d;
import v41.InterfaceC35689r0;
import v63.AbstractC35745c;
import vq2.C36286c;
import wb3.AbstractC37056f;
import xq2.C38553c0;
import xq2.C38566g1;
import yb3.AbstractC39421y;
import yp2.AbstractC39704a;
import zq2.C40988a;
import zq2.C40993f;
import zq2.C41003p;

/* JADX INFO: renamed from: fq2.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010!\u001a\u00020\nH\u0002¢\u0006\u0004\b#\u0010$J\u001d\u0010)\u001a\u00020(2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002¢\u0006\u0004\b)\u0010*J7\u00100\u001a\u00020/2\u0006\u0010,\u001a\u00020+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00103R\u0014\u00106\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00105¨\u00067"}, m65681d2 = {"Lfq2/e;", "", "Lgq2/a;", "donutHelper", "Lgq2/b;", "finaleHelper", "<init>", "(Lgq2/a;Lgq2/b;)V", "Lcom/whoop/user/journey/model/yearinreview/Bar;", "bar", "", "stepName", "Lbr2/c;", "g", "(Lcom/whoop/user/journey/model/yearinreview/Bar;Ljava/lang/String;)Lbr2/c;", "Lcom/whoop/user/journey/model/yearinreview/StatItemModel;", "statItemModel", "Lcr2/g;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/user/journey/model/yearinreview/StatItemModel;)Lcr2/g;", "theme", "themeVariant", "", "isV2", "Llq2/e;", "c", "(Ljava/lang/String;Ljava/lang/String;Z)Llq2/e;", "Llq2/t;", "d", "(Ljava/lang/String;Ljava/lang/String;)Llq2/t;", "Li2/t;", "b", "(Ljava/lang/String;)Li2/t;", QueryParams.URL, "Lv41/r0;", "i", "(Ljava/lang/String;)Lv41/r0;", "", "Lcom/whoop/user/journey/model/weekinreview/ColoredText;", "text", "Ly3/o;", "a", "(Ljava/util/List;)J", "Lcom/whoop/user/journey/model/UserJourneyStep;", "model", "submittedTimeCapsuleText", "sectionId", "Llr2/d;", "e", "(Lcom/whoop/user/journey/model/UserJourneyStep;Ljava/lang/String;Ljava/lang/String;Z)Llr2/d;", "Lgq2/a;", "Lgq2/b;", "Ljb1/a;", "Ljb1/a;", "designItemReducerInstance", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14688e {

    /* JADX INFO: renamed from: d */
    public static final int f54289d = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C16082a donutHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C16083b finaleHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C21535a designItemReducerInstance;

    /* JADX INFO: renamed from: fq2.e$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f54293a;

        static {
            int[] iArr = new int[EnumC3560b.values().length];
            try {
                iArr[EnumC3560b.BED_TIME_VARIABILITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3560b.WAKE_TIME_VARIABILITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3560b.POSITIVE_RECOVERY_TREND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3560b.RECOVERY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC3560b.NEGATIVE_RECOVERY_TREND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC3560b.NEUTRAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC3560b.STRAIN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC3560b.LIGHT_SLEEP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC3560b.SLEEP_DEEP_SLEEP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f54293a = iArr;
        }
    }

    public C14688e(C16082a donutHelper, C16083b finaleHelper) {
        AbstractC22676k.m65750j(donutHelper, "donutHelper");
        AbstractC22676k.m65750j(finaleHelper, "finaleHelper");
        this.donutHelper = donutHelper;
        this.finaleHelper = finaleHelper;
        this.designItemReducerInstance = AbstractC14687d.m42081t();
    }

    /* JADX INFO: renamed from: a */
    private final long m42116a(List<ColoredText> text) {
        long jM113248j = AbstractC17588h.m50089a().f92255a.f92192b;
        int i13 = 0;
        for (Object obj : text) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            ColoredText coloredText = (ColoredText) obj;
            int length = coloredText.getText().length();
            if (8 <= length && length < 10) {
                long jM113248j2 = AbstractC35745c.m113248j(70.0f, 4294967296L);
                AbstractC35745c.m113243b(jM113248j, jM113248j2);
                if (Float.compare(C39183o.m124805c(jM113248j), C39183o.m124805c(jM113248j2)) <= 0) {
                    jM113248j = AbstractC35745c.m113248j(70.0f, 4294967296L);
                }
            } else if (10 <= length && length < 12) {
                long jM113248j3 = AbstractC35745c.m113248j(60.0f, 4294967296L);
                AbstractC35745c.m113243b(jM113248j, jM113248j3);
                if (Float.compare(C39183o.m124805c(jM113248j), C39183o.m124805c(jM113248j3)) <= 0) {
                    jM113248j = AbstractC35745c.m113248j(60.0f, 4294967296L);
                }
            } else if (coloredText.getText().length() >= 12) {
                jM113248j = AbstractC35745c.m113248j(50.0f, 4294967296L);
            }
            i13 = i14;
        }
        return jM113248j;
    }

    /* JADX INFO: renamed from: b */
    private final AbstractC17911t m42117b(String theme) {
        int iHashCode = theme.hashCode();
        if (iHashCode != -1838664331) {
            if (iHashCode != -16486507) {
                if (iHashCode == 78984887 && theme.equals("SLEEP")) {
                    return C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51515c(1299947963)), new C17919x(C17919x.f69636m)), 0L, 0L, 14);
                }
            } else if (theme.equals("RECOVERY")) {
                return C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51515c(1298640614)), new C17919x(C17919x.f69636m)), 0L, 0L, 14);
            }
        } else if (theme.equals("STRAIN")) {
            return C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51515c(1291883495)), new C17919x(C17919x.f69636m)), 0L, 0L, 14);
        }
        return C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51515c(1298640614)), new C17919x(C17919x.f69636m)), 0L, 0L, 14);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: c */
    private final InterfaceC24673e m42118c(String theme, String themeVariant, boolean isV2) {
        EnumC24674f enumC24674f;
        if (isV2) {
            return C16084c.f60870a.m45449a(theme, themeVariant);
        }
        EnumC24674f enumC24674f2 = EnumC24674f.PRIMARY;
        EnumC24674f[] enumC24674fArrValues = EnumC24674f.values();
        int length = enumC24674fArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC24674f = null;
                break;
            }
            enumC24674f = enumC24674fArrValues[i13];
            if (AbstractC22676k.m65745e(enumC24674f.name(), themeVariant)) {
                break;
            }
            i13++;
        }
        if (enumC24674f != null) {
            enumC24674f2 = enumC24674f;
        }
        switch (theme.hashCode()) {
            case -1981461840:
                if (theme.equals("WRAP_UP")) {
                    return new AbstractC24675g.g(enumC24674f2);
                }
                break;
            case -1838664331:
                if (theme.equals("STRAIN")) {
                    return new AbstractC24675g.f(enumC24674f2);
                }
                break;
            case -1453044247:
                if (theme.equals("ONE_PERCENT_CLUB")) {
                    return new AbstractC24675g.b(enumC24674f2);
                }
                break;
            case -16486507:
                if (theme.equals("RECOVERY")) {
                    return new AbstractC24675g.d(enumC24674f2);
                }
                break;
            case 69824076:
                if (theme.equals("INTRO")) {
                    return new AbstractC24675g.a(enumC24674f2);
                }
                break;
            case 75573739:
                if (theme.equals("OUTRO")) {
                    return new AbstractC24675g.c(enumC24674f2);
                }
                break;
            case 78984887:
                if (theme.equals("SLEEP")) {
                    return new AbstractC24675g.e(enumC24674f2);
                }
                break;
        }
        return m42119d(theme, themeVariant);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: d */
    private final AbstractC24688t m42119d(String theme, String themeVariant) {
        EnumC24674f enumC24674f;
        EnumC24674f enumC24674f2 = EnumC24674f.PRIMARY;
        EnumC24674f[] enumC24674fArrValues = EnumC24674f.values();
        int length = enumC24674fArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC24674f = null;
                break;
            }
            enumC24674f = enumC24674fArrValues[i13];
            if (AbstractC22676k.m65745e(enumC24674f.name(), themeVariant)) {
                break;
            }
            i13++;
        }
        if (enumC24674f != null) {
            enumC24674f2 = enumC24674f;
        }
        switch (theme.hashCode()) {
            case -1703128819:
                if (theme.equals("WIR_INTRO")) {
                    return new AbstractC24688t.a(enumC24674f2);
                }
                break;
            case -1697379156:
                if (theme.equals("WIR_OUTRO")) {
                    return new AbstractC24688t.b(enumC24674f2);
                }
                break;
            case -1693968008:
                if (theme.equals("WIR_SLEEP")) {
                    return new AbstractC24688t.d(enumC24674f2);
                }
                break;
            case -965629228:
                if (theme.equals("WIR_STRAIN")) {
                    return new AbstractC24688t.e(enumC24674f2);
                }
                break;
            case 1451624756:
                if (theme.equals("WIR_RECOVERY")) {
                    return new AbstractC24688t.c(enumC24674f2);
                }
                break;
        }
        return new AbstractC24688t.a(enumC24674f2);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ InterfaceC24703d m42120f(C14688e c14688e, UserJourneyStep userJourneyStep, String str, String str2, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str = null;
        }
        if ((i13 & 4) != 0) {
            str2 = null;
        }
        if ((i13 & 8) != 0) {
            z4 = false;
        }
        return c14688e.m42124e(userJourneyStep, str, str2, z4);
    }

    /* JADX INFO: renamed from: g */
    private final C3561c m42121g(Bar bar, String stepName) {
        EnumC3560b enumC3560b;
        EnumC39333f enumC39333f;
        EnumC39333f enumC39333f2;
        C2886a n13;
        String barType = bar.getBarType();
        EnumC3560b enumC3560b2 = EnumC3560b.STRAIN;
        EnumC3560b[] enumC3560bArrValues = EnumC3560b.values();
        int length = enumC3560bArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC3560b = null;
                break;
            }
            enumC3560b = enumC3560bArrValues[i13];
            if (AbstractC22676k.m65745e(enumC3560b.name(), barType)) {
                break;
            }
            i13++;
        }
        if (enumC3560b != null) {
            enumC3560b2 = enumC3560b;
        }
        switch (a.f54293a[enumC3560b2.ordinal()]) {
            case 1:
            case 2:
                enumC39333f = EnumC39333f.SLEEP;
                break;
            case 3:
                enumC39333f = EnumC39333f.ACCENT_POSITIVE_TREND;
                break;
            case 4:
                enumC39333f = EnumC39333f.RECOVERY;
                break;
            case 5:
                enumC39333f = EnumC39333f.ACCENT_NEGATIVE_TREND;
                break;
            case 6:
                enumC39333f = EnumC39333f.GREY_L3;
                break;
            case 7:
                enumC39333f = EnumC39333f.STRAIN;
                break;
            case 8:
                enumC39333f = EnumC39333f.SLEEP_LIGHT_SLEEP;
                break;
            case 9:
                enumC39333f = EnumC39333f.SLEEP_DEEP_SLEEP;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        EnumC39333f enumC39333f3 = enumC39333f;
        boolean zM65745e = AbstractC22676k.m65745e(stepName, "HEALTHSPAN_CONTRIBUTORS_STEP");
        if (enumC3560b2 == EnumC3560b.NEUTRAL) {
            enumC39333f2 = EnumC39333f.WHITE_70;
        } else {
            enumC39333f2 = zM65745e ? enumC39333f3 : null;
        }
        C2889d c2889dM8450e = AbstractC2890e.m8450e();
        C2886a b6 = zM65745e ? c2889dM8450e.getB1() : c2889dM8450e.getH4();
        if (zM65745e) {
            n13 = AbstractC2890e.m8450e().getN6();
        } else {
            n13 = (enumC3560b2 == EnumC3560b.NEGATIVE_RECOVERY_TREND || enumC3560b2 == EnumC3560b.POSITIVE_RECOVERY_TREND || !bar.getPrimary()) ? AbstractC2890e.m8450e().getN5() : AbstractC2890e.m8450e().getN3();
        }
        C2886a c2886a = n13;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(bar.getTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(bar.getMetric());
        String subMetric = bar.getSubMetric();
        TextResource textResourceM21278l3 = subMetric != null ? AbstractC8693b.m21278l(subMetric) : null;
        String iconUrl = bar.getIconUrl();
        return new C3561c(textResourceM21278l, textResourceM21278l2, textResourceM21278l3, iconUrl != null ? new AbstractC22403o.c(iconUrl, 0, 0, 0, 14, null) : null, bar.getPrimary(), bar.getOpacity(), enumC39333f3, bar.getFillPercentage(), enumC3560b2, zM65745e, enumC39333f2, b6, c2886a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX INFO: renamed from: h */
    private final C11091g m42122h(StatItemModel statItemModel) {
        EnumC17727b2 enumC17727b2;
        C14684a c14684a;
        switch (statItemModel.getSubtextState()) {
            case "HIGHER_POSITIVE":
                enumC17727b2 = EnumC17727b2.POSITIVE_GREEN;
                break;
            case "HIGHER_NEGATIVE":
                enumC17727b2 = EnumC17727b2.POSITIVE_YELLOW;
                break;
            case "NONE":
                enumC17727b2 = EnumC17727b2.NONE;
                break;
            case "HIGHER_NEUTRAL":
                enumC17727b2 = EnumC17727b2.POSITIVE;
                break;
            case "LOWER_POSITIVE":
                enumC17727b2 = EnumC17727b2.NEGATIVE_GREEN;
                break;
            case "LOWER_NEGATIVE":
                enumC17727b2 = EnumC17727b2.NEGATIVE_YELLOW;
                break;
            case "LOWER_NEUTRAL":
                enumC17727b2 = EnumC17727b2.NEGATIVE;
                break;
            default:
                enumC17727b2 = EnumC17727b2.NEUTRAL;
                break;
        }
        EnumC17727b2 enumC17727b3 = enumC17727b2;
        if (statItemModel.getNumericValue() != null) {
            c14684a = new C14684a(statItemModel.getNumericValue(), EnumC11092h.NUMERICAL);
        } else {
            if (statItemModel.getTextValue() == null) {
                throw new IllegalArgumentException("Both Numeric and Text Value for Stat Model is null.");
            }
            c14684a = new C14684a(statItemModel.getTextValue(), EnumC11092h.TEXT);
        }
        String suffix = statItemModel.getSuffix();
        return new C11091g(AbstractC8693b.m21278l(statItemModel.getTitle()), AbstractC8693b.m21278l(c14684a.getStatValue()), suffix != null ? AbstractC8693b.m21278l(suffix) : null, c14684a.getType(), AbstractC8693b.m21278l(statItemModel.getSubtext()), enumC17727b3);
    }

    /* JADX INFO: renamed from: i */
    private final InterfaceC35689r0 m42123i(String url) {
        if (AbstractC39421y.m125920E(url, ".json", false)) {
            return InterfaceC35689r0.e.m113134a(InterfaceC35689r0.e.m113135b(url));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v25, types: [com.whoop.design.util.TextResource] */
    /* JADX WARN: Type inference failed for: r12v34, types: [com.whoop.design.util.TextResource] */
    /* JADX WARN: Type inference failed for: r12v37, types: [com.whoop.design.util.TextResource] */
    /* JADX WARN: Type inference failed for: r13v31, types: [ny0.h] */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.whoop.design.util.TextResource] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12, types: [gr2.c] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r16v26, types: [com.whoop.design.util.TextResource] */
    /* JADX WARN: Type inference failed for: r17v10, types: [com.whoop.design.util.TextResource] */
    /* JADX WARN: Type inference failed for: r17v9, types: [com.whoop.design.util.TextResource] */
    /* JADX WARN: Type inference failed for: r4v100, types: [gz0.m0] */
    /* JADX WARN: Type inference failed for: r4v102 */
    /* JADX WARN: Type inference failed for: r4v99, types: [gz0.m0] */
    /* JADX WARN: Type inference failed for: r8v23, types: [er2.g] */
    /* JADX WARN: Type inference failed for: r8v24, types: [er2.g] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r9v36, types: [com.whoop.design.util.TextResource] */
    /* JADX INFO: renamed from: e */
    public final InterfaceC24703d m42124e(UserJourneyStep model, String submittedTimeCapsuleText, String sectionId, boolean isV2) {
        int i13;
        EnumC13585g enumC13585g;
        EnumC16313m0 enumC16313m0;
        EnumC13585g enumC13585g2;
        long jM51517e;
        AbstractC22676k.m65750j(model, "model");
        Object obj = null;
        if (model instanceof FinaleStep) {
            FinaleStep finaleStep = (FinaleStep) model;
            List<HighlightedText> highlightedTexts = finaleStep.getHighlightedTexts();
            String footerText = finaleStep.getFooterText();
            TextResource textResourceM21278l = footerText != null ? AbstractC8693b.m21278l(footerText) : null;
            String footerSubText = finaleStep.getFooterSubText();
            return new C35167d(highlightedTexts, textResourceM21278l, footerSubText != null ? AbstractC8693b.m21278l(footerSubText) : null, this.finaleHelper.m45440b(finaleStep.getRecapStats()), UserJourneyFooterStyle.STEP_PROGRESS, m42118c(finaleStep.getTheme(), finaleStep.getThemeVariant(), isV2), finaleStep.getName());
        }
        if (model instanceof GaugeStep) {
            UserJourneyFooterStyle userJourneyFooterStyle = UserJourneyFooterStyle.STEP_PROGRESS;
            GaugeStep gaugeStep = (GaugeStep) model;
            InterfaceC24673e interfaceC24673eM42118c = m42118c(gaugeStep.getTheme(), gaugeStep.getThemeVariant(), isV2);
            List<HighlightedText> highlightedTexts2 = gaugeStep.getHighlightedTexts();
            String footerText2 = gaugeStep.getFooterText();
            TextResource textResourceM21278l2 = footerText2 != null ? AbstractC8693b.m21278l(footerText2) : null;
            String footerSubText2 = gaugeStep.getFooterSubText();
            return new C31744p0(userJourneyFooterStyle, interfaceC24673eM42118c, gaugeStep.getName(), highlightedTexts2, textResourceM21278l2, footerSubText2 != null ? AbstractC8693b.m21278l(footerSubText2) : null, AbstractC8693b.m21278l(gaugeStep.getGaugeDisplayDate()), AbstractC8693b.m21278l(gaugeStep.getGaugeDisplayValue()), gaugeStep.getGaugeFillPercentage());
        }
        if (model instanceof HorizontalBarStep) {
            HorizontalBarStep horizontalBarStep = (HorizontalBarStep) model;
            C21905d c21905d = AbstractC22676k.m65745e(horizontalBarStep.getTheme(), "SLEEP") ? new C21905d(null, AbstractC21902a.m62307b(), 1, null) : new C21905d(null, AbstractC15673b0.m43983F0(), 1, null);
            C21905d c21905d2 = AbstractC22676k.m65745e(horizontalBarStep.getTheme(), "SLEEP") ? new C21905d(new C17919x(EnumC39333f.SLEEP.getColor()), null, 2, null) : new C21905d(null, AbstractC15673b0.m43983F0(), 1, null);
            InterfaceC24673e interfaceC24673eM42118c2 = m42118c(horizontalBarStep.getTheme(), horizontalBarStep.getThemeVariant(), isV2);
            float barFillPercentage = horizontalBarStep.getBarFillPercentage();
            UserJourneyFooterStyle userJourneyFooterStyle2 = UserJourneyFooterStyle.STEP_PROGRESS;
            List<HighlightedText> highlightedTexts3 = horizontalBarStep.getHighlightedTexts();
            String footerText3 = horizontalBarStep.getFooterText();
            TextResource textResourceM21278l3 = footerText3 != null ? AbstractC8693b.m21278l(footerText3) : null;
            String footerSubText3 = horizontalBarStep.getFooterSubText();
            return new C31713a(userJourneyFooterStyle2, interfaceC24673eM42118c2, horizontalBarStep.getName(), barFillPercentage, highlightedTexts3, textResourceM21278l3, footerSubText3 != null ? AbstractC8693b.m21278l(footerSubText3) : null, c21905d, c21905d2, horizontalBarStep.getSubtitle(), horizontalBarStep.getTitle(), horizontalBarStep.getValue(), horizontalBarStep.getValueSuffix());
        }
        if (model instanceof HorizontalSleepBarStep) {
            HorizontalSleepBarStep horizontalSleepBarStep = (HorizontalSleepBarStep) model;
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l(horizontalSleepBarStep.getBedtimeText());
            List<HighlightedText> highlightedTexts4 = horizontalSleepBarStep.getHighlightedTexts();
            String footerText4 = horizontalSleepBarStep.getFooterText();
            TextResource textResourceM21278l5 = footerText4 != null ? AbstractC8693b.m21278l(footerText4) : null;
            String footerSubText4 = horizontalSleepBarStep.getFooterSubText();
            TextResource textResourceM21278l6 = footerSubText4 != null ? AbstractC8693b.m21278l(footerSubText4) : null;
            TextResource textResourceM21278l7 = AbstractC8693b.m21278l(horizontalSleepBarStep.getSubtitle());
            float f13 = Float.parseFloat(horizontalSleepBarStep.getSleepFillPercentageHigher());
            float f14 = Float.parseFloat(horizontalSleepBarStep.getSleepFillPercentageLower());
            TextResource textResourceM21278l8 = AbstractC8693b.m21278l(horizontalSleepBarStep.getWakeTimeText());
            UserJourneyFooterStyle userJourneyFooterStyle3 = UserJourneyFooterStyle.STEP_PROGRESS;
            InterfaceC24673e interfaceC24673eM42118c3 = m42118c(horizontalSleepBarStep.getTheme(), horizontalSleepBarStep.getThemeVariant(), isV2);
            C21905d c21905d3 = new C21905d(null, AbstractC21902a.m62307b(), 1, null);
            C21905d c21905d4 = new C21905d(new C17919x(EnumC39333f.SLEEP.getColor()), null, 2, null);
            List<String> axisLabels = horizontalSleepBarStep.getAxisLabels();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(axisLabels, 10));
            Iterator it = axisLabels.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC8693b.m21278l((String) it.next()));
            }
            return new C36286c(textResourceM21278l4, highlightedTexts4, c21905d3, textResourceM21278l5, textResourceM21278l6, textResourceM21278l7, c21905d4, f13, f14, textResourceM21278l8, arrayList, userJourneyFooterStyle3, interfaceC24673eM42118c3, horizontalSleepBarStep.getName());
        }
        if (model instanceof ImageOnlyStep) {
            ImageOnlyStep imageOnlyStep = (ImageOnlyStep) model;
            List<FooterText> footerTexts = imageOnlyStep.getFooterTexts();
            AbstractC22403o.c cVar = new AbstractC22403o.c(imageOnlyStep.getImageUrl(), 0, 0, 0, 14, null);
            List<HighlightedText> highlightedTexts5 = imageOnlyStep.getHighlightedTexts();
            UserJourneyFooterStyle userJourneyFooterStyle4 = UserJourneyFooterStyle.STEP_PROGRESS;
            InterfaceC24673e interfaceC24673eM42118c4 = m42118c(imageOnlyStep.getTheme(), imageOnlyStep.getThemeVariant(), isV2);
            String name = imageOnlyStep.getName();
            InterfaceC35689r0 interfaceC35689r0M42123i = m42123i(imageOnlyStep.getImageUrl());
            String footerText5 = imageOnlyStep.getFooterText();
            TextResource textResourceM21278l9 = footerText5 != null ? AbstractC8693b.m21278l(footerText5) : null;
            String footerSubText5 = imageOnlyStep.getFooterSubText();
            return new C31723f(footerTexts, cVar, interfaceC35689r0M42123i, highlightedTexts5, textResourceM21278l9, footerSubText5 != null ? AbstractC8693b.m21278l(footerSubText5) : null, userJourneyFooterStyle4, interfaceC24673eM42118c4, name);
        }
        if (model instanceof DonutChartStep) {
            DonutChartStep donutChartStep = (DonutChartStep) model;
            TextResource textResourceM21278l10 = AbstractC8693b.m21278l(donutChartStep.getTitle());
            long jM45436a = this.donutHelper.m45436a(donutChartStep.getTheme());
            List<C32885b> listM45437b = this.donutHelper.m45437b(donutChartStep.getStatistics());
            List<HighlightedText> highlightedTexts6 = donutChartStep.getHighlightedTexts();
            String footerText6 = donutChartStep.getFooterText();
            TextResource textResourceM21278l11 = footerText6 != null ? AbstractC8693b.m21278l(footerText6) : null;
            String footerSubText6 = donutChartStep.getFooterSubText();
            return new C32887d(textResourceM21278l10, listM45437b, highlightedTexts6, textResourceM21278l11, footerSubText6 != null ? AbstractC8693b.m21278l(footerSubText6) : null, jM45436a, UserJourneyFooterStyle.STEP_PROGRESS, m42118c(donutChartStep.getTheme(), donutChartStep.getThemeVariant(), isV2), donutChartStep.getName(), null);
        }
        int i14 = 0;
        if (model instanceof IntroStepStep) {
            IntroStepStep introStepStep = (IntroStepStep) model;
            String icon = introStepStep.getFootNote().getIcon();
            ?? r10 = EnumC16313m0.WHOOP_LOGO_CIRCLE;
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length = enumC16313m0ArrValues.length;
            while (i14 < length) {
                EnumC16313m0 enumC16313m1 = enumC16313m0ArrValues[i14];
                if (AbstractC22676k.m65745e(enumC16313m1.name(), icon)) {
                    obj = enumC16313m1;
                    break;
                }
                i14++;
            }
            if (obj != null) {
                r10 = obj;
            }
            return new C31745q(UserJourneyFooterStyle.GET_STARTED, m42118c(introStepStep.getTheme(), introStepStep.getThemeVariant(), isV2), introStepStep.getName(), introStepStep.getYear(), introStepStep.getGreetingName(), introStepStep.getGreetingText(), new C24670b(r10.toWhoopIcon(), introStepStep.getFootNote().getText()));
        }
        if (model instanceof NumberWithImage) {
            NumberWithImage numberWithImage = (NumberWithImage) model;
            InterfaceC24673e interfaceC24673eM42118c5 = m42118c(numberWithImage.getTheme(), numberWithImage.getThemeVariant(), isV2);
            if ((interfaceC24673eM42118c5 instanceof AbstractC24675g.a) || (interfaceC24673eM42118c5 instanceof AbstractC22815d.p) || (interfaceC24673eM42118c5 instanceof AbstractC22815d.q)) {
                jM51517e = AbstractC17918w0.m51517e(4285683393L);
            } else if ((interfaceC24673eM42118c5 instanceof AbstractC24675g.e) || (interfaceC24673eM42118c5 instanceof AbstractC22815d.s)) {
                jM51517e = AbstractC17918w0.m51517e(4284183730L);
            } else if ((interfaceC24673eM42118c5 instanceof AbstractC24675g.d) || (interfaceC24673eM42118c5 instanceof AbstractC24675g.c) || (interfaceC24673eM42118c5 instanceof AbstractC22815d.r)) {
                jM51517e = AbstractC17918w0.m51517e(4294967295L);
            } else {
                jM51517e = interfaceC24673eM42118c5 instanceof AbstractC24688t.c ? AbstractC17918w0.m51517e(4284985062L) : AbstractC17918w0.m51517e(4284189106L);
            }
            long j7 = jM51517e;
            UserJourneyFooterStyle userJourneyFooterStyle5 = UserJourneyFooterStyle.STEP_PROGRESS;
            String title = numberWithImage.getTitle();
            TextResource textResourceM21278l12 = title != null ? AbstractC8693b.m21278l(title) : null;
            String displayNumber = numberWithImage.getDisplayNumber();
            List<HighlightedText> highlightedTexts7 = numberWithImage.getHighlightedTexts();
            AbstractC22403o.c cVar2 = numberWithImage.getImageUrl().length() > 0 ? new AbstractC22403o.c(numberWithImage.getImageUrl(), 0, 0, 0, 14, null) : null;
            String recoveryBadgeImageUrl = numberWithImage.getRecoveryBadgeImageUrl();
            boolean foundingMember = numberWithImage.getFoundingMember();
            boolean whoopPro = numberWithImage.getWhoopPro();
            List<FooterText> footerTexts2 = numberWithImage.getFooterTexts();
            String footerText7 = numberWithImage.getFooterText();
            TextResource textResourceM21278l13 = footerText7 != null ? AbstractC8693b.m21278l(footerText7) : null;
            String footerSubText7 = numberWithImage.getFooterSubText();
            TextResource textResourceM21278l14 = footerSubText7 != null ? AbstractC8693b.m21278l(footerSubText7) : null;
            NumberWithImageFontSize numberFontSize = numberWithImage.getNumberFontSize();
            if (numberFontSize == null) {
                numberFontSize = NumberWithImageFontSize.LARGE;
            }
            NumberWithImageFontSize numberWithImageFontSize = numberFontSize;
            String recoveryBadgeLevel = numberWithImage.getRecoveryBadgeLevel();
            if (recoveryBadgeLevel == null) {
                recoveryBadgeLevel = "";
            }
            String str = recoveryBadgeLevel;
            String name2 = numberWithImage.getName();
            InterfaceC35689r0 interfaceC35689r0M42123i2 = m42123i(numberWithImage.getImageUrl());
            String backgroundImageUrl = numberWithImage.getBackgroundImageUrl();
            return new C31757y(userJourneyFooterStyle5, interfaceC24673eM42118c5, name2, textResourceM21278l12, displayNumber, highlightedTexts7, cVar2, recoveryBadgeImageUrl, Boolean.valueOf(foundingMember), Boolean.valueOf(whoopPro), footerTexts2, textResourceM21278l13, textResourceM21278l14, j7, numberWithImageFontSize, str, interfaceC35689r0M42123i2, backgroundImageUrl != null ? new AbstractC22403o.c(backgroundImageUrl, 0, 0, 0, 14, null) : null, null);
        }
        if (model instanceof LongTextStep) {
            UserJourneyFooterStyle userJourneyFooterStyle6 = UserJourneyFooterStyle.STEP_PROGRESS;
            LongTextStep longTextStep = (LongTextStep) model;
            InterfaceC24673e interfaceC24673eM42118c6 = m42118c(longTextStep.getTheme(), longTextStep.getThemeVariant(), isV2);
            List<String> texts = longTextStep.getTexts();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(texts, 10));
            Iterator it3 = texts.iterator();
            while (it3.hasNext()) {
                arrayList2.add(AbstractC8693b.m21278l((String) it3.next()));
            }
            String backgroundImageUrl2 = longTextStep.getBackgroundImageUrl();
            return new C31749s(userJourneyFooterStyle6, interfaceC24673eM42118c6, longTextStep.getName(), backgroundImageUrl2 != null ? new AbstractC22403o.c(backgroundImageUrl2, 0, 0, 0, 14, null) : null, arrayList2, 0.0f, 32, null);
        }
        if (model instanceof PillarIntroStep) {
            UserJourneyFooterStyle userJourneyFooterStyle7 = UserJourneyFooterStyle.STEP_PROGRESS;
            PillarIntroStep pillarIntroStep = (PillarIntroStep) model;
            InterfaceC24673e interfaceC24673eM42118c7 = m42118c(pillarIntroStep.getTheme(), pillarIntroStep.getThemeVariant(), isV2);
            String text = pillarIntroStep.getText();
            String name3 = pillarIntroStep.getName();
            String backgroundImageUrl3 = pillarIntroStep.getBackgroundImageUrl();
            return new C31722e0(userJourneyFooterStyle7, interfaceC24673eM42118c7, name3, text, 0.0f, backgroundImageUrl3 != null ? new AbstractC22403o.c(backgroundImageUrl3, 0, 0, 0, 14, null) : null, 16, null);
        }
        if (model instanceof ShareableStep) {
            ShareableStep shareableStep = (ShareableStep) model;
            String shareableCardUrl = shareableStep.getShareableCardUrl();
            TextResource textResourceM21278l15 = AbstractC8693b.m21278l(shareableStep.getShareButtonText());
            TextResource textResourceM21278l16 = AbstractC8693b.m21278l(shareableStep.getShareMessage());
            CardButtonModel secondaryButton = shareableStep.getSecondaryButton();
            if (secondaryButton != null) {
                Object objM60541h = this.designItemReducerInstance.m60541h(secondaryButton);
                AbstractC22676k.m65748h(objM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.atom.button.CardButtonState");
                obj = (C27256h) objM60541h;
            }
            return new C1932c(m42118c(shareableStep.getTheme(), shareableStep.getThemeVariant(), isV2), UserJourneyFooterStyle.STEP_PROGRESS, shareableStep.getName(), textResourceM21278l15, AbstractC22404p.m64503l(shareableStep.getShareableCardUrl()), textResourceM21278l16, obj, shareableCardUrl);
        }
        if (model instanceof ShortTextStep) {
            ShortTextStep shortTextStep = (ShortTextStep) model;
            return new C31734k0(UserJourneyFooterStyle.STEP_PROGRESS, m42118c(shortTextStep.getTheme(), shortTextStep.getThemeVariant(), isV2), shortTextStep.getName(), AbstractC8693b.m21278l(shortTextStep.getText()));
        }
        if (model instanceof StackedHorizontalBarsStep) {
            StackedHorizontalBarsStep stackedHorizontalBarsStep = (StackedHorizontalBarsStep) model;
            String title2 = stackedHorizontalBarsStep.getTitle();
            TextResource textResourceM21278l17 = title2 != null ? AbstractC8693b.m21278l(title2) : null;
            UserJourneyFooterStyle userJourneyFooterStyle8 = UserJourneyFooterStyle.STEP_PROGRESS;
            InterfaceC24673e interfaceC24673eM42118c8 = m42118c(stackedHorizontalBarsStep.getTheme(), stackedHorizontalBarsStep.getThemeVariant(), isV2);
            List<Bar> stackedBars = stackedHorizontalBarsStep.getStackedBars();
            ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(stackedBars, 10));
            Iterator it4 = stackedBars.iterator();
            while (it4.hasNext()) {
                arrayList3.add(m42121g((Bar) it4.next(), stackedHorizontalBarsStep.getName()));
            }
            List<HighlightedText> highlightedTexts8 = stackedHorizontalBarsStep.getHighlightedTexts();
            String footerText8 = stackedHorizontalBarsStep.getFooterText();
            TextResource textResourceM21278l18 = footerText8 != null ? AbstractC8693b.m21278l(footerText8) : null;
            String footerSubText8 = stackedHorizontalBarsStep.getFooterSubText();
            return new C3568j(userJourneyFooterStyle8, interfaceC24673eM42118c8, stackedHorizontalBarsStep.getName(), textResourceM21278l17, arrayList3, highlightedTexts8, textResourceM21278l18, footerSubText8 != null ? AbstractC8693b.m21278l(footerSubText8) : null);
        }
        if (model instanceof StatListStep) {
            StatListStep statListStep = (StatListStep) model;
            String title3 = statListStep.getTitle();
            TextResource textResourceM21278l19 = title3 != null ? AbstractC8693b.m21278l(title3) : null;
            UserJourneyFooterStyle userJourneyFooterStyle9 = UserJourneyFooterStyle.STEP_PROGRESS;
            InterfaceC24673e interfaceC24673eM42118c9 = m42118c(statListStep.getTheme(), statListStep.getThemeVariant(), isV2);
            List<StatItemModel> stats = statListStep.getStats();
            ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(stats, 10));
            Iterator it5 = stats.iterator();
            while (it5.hasNext()) {
                arrayList4.add(m42122h((StatItemModel) it5.next()));
            }
            TextResource textResourceM21278l20 = AbstractC8693b.m21278l(statListStep.getFooterText());
            String name4 = statListStep.getName();
            String wirFooterText = statListStep.getWirFooterText();
            TextResource textResourceM21278l21 = wirFooterText != null ? AbstractC8693b.m21278l(wirFooterText) : null;
            String wirFooterSubText = statListStep.getWirFooterSubText();
            return new C11087c(userJourneyFooterStyle9, interfaceC24673eM42118c9, name4, textResourceM21278l19, arrayList4, textResourceM21278l20, textResourceM21278l21, wirFooterSubText != null ? AbstractC8693b.m21278l(wirFooterSubText) : null);
        }
        if (model instanceof ChatStep) {
            ChatStep chatStep = (ChatStep) model;
            TextResource textResourceM21278l22 = AbstractC8693b.m21278l(chatStep.getWhoopChatBox().getDescriptionText());
            List<String> chatText = chatStep.getWhoopChatBox().getChatText();
            ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(chatText, 10));
            Iterator it6 = chatText.iterator();
            while (it6.hasNext()) {
                arrayList5.add(AbstractC8693b.m21278l((String) it6.next()));
            }
            String avatarUrl = chatStep.getWhoopChatBox().getAvatarUrl();
            AbstractC22403o cVar3 = avatarUrl != null ? new AbstractC22403o.c(avatarUrl, 0, 0, 0, 14, null) : new AbstractC22403o.a(AbstractC39704a.f170898c);
            String chatType = chatStep.getWhoopChatBox().getChatType();
            EnumC13585g enumC13585g3 = EnumC13585g.WHOOP_BOT;
            EnumC13585g[] enumC13585gArrValues = EnumC13585g.values();
            int length2 = enumC13585gArrValues.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length2) {
                    enumC13585g2 = null;
                    break;
                }
                enumC13585g2 = enumC13585gArrValues[i15];
                if (AbstractC22676k.m65745e(enumC13585g2.name(), chatType)) {
                    break;
                }
                i15++;
            }
            if (enumC13585g2 != null) {
                enumC13585g3 = enumC13585g2;
            }
            C13579a c13579a = new C13579a(textResourceM21278l22, arrayList5, enumC13585g3, cVar3);
            TextResource textResourceM21278l23 = AbstractC8693b.m21278l(chatStep.getUserChatBox().getDescriptionText());
            List<String> chatText2 = chatStep.getUserChatBox().getChatText();
            ArrayList arrayList6 = new ArrayList(AbstractC25267u.m74163i0(chatText2, 10));
            Iterator it7 = chatText2.iterator();
            while (it7.hasNext()) {
                arrayList6.add(AbstractC8693b.m21278l((String) it7.next()));
            }
            String avatarUrl2 = chatStep.getUserChatBox().getAvatarUrl();
            AbstractC22403o.c cVar4 = avatarUrl2 != null ? new AbstractC22403o.c(avatarUrl2, 0, 0, 0, 14, null) : null;
            String chatType2 = chatStep.getUserChatBox().getChatType();
            ?? r14 = EnumC13585g.INTRO;
            EnumC13585g[] enumC13585gArrValues2 = EnumC13585g.values();
            int length3 = enumC13585gArrValues2.length;
            while (i14 < length3) {
                EnumC13585g enumC13585g4 = enumC13585gArrValues2[i14];
                if (AbstractC22676k.m65745e(enumC13585g4.name(), chatType2)) {
                    obj = enumC13585g4;
                    break;
                }
                i14++;
            }
            if (obj != null) {
                r14 = obj;
            }
            return new C13580b(c13579a, new C13579a(textResourceM21278l23, arrayList6, r14, cVar4), AbstractC8693b.m21278l(chatStep.getFooterText()), AbstractC8693b.m21278l(chatStep.getFooterSubText()), UserJourneyFooterStyle.STEP_PROGRESS, m42118c(chatStep.getTheme(), chatStep.getThemeVariant(), isV2), chatStep.getName());
        }
        if (model instanceof WirIntroStep) {
            WirIntroStep wirIntroStep = (WirIntroStep) model;
            return new C14717b(AbstractC8693b.m21278l(wirIntroStep.getFooterText()), AbstractC8693b.m21278l(wirIntroStep.getFooterSubText()), new AbstractC22403o.c(wirIntroStep.getBackgroundImageUrl(), 0, 0, 0, 14, null), UserJourneyFooterStyle.GET_STARTED, m42119d(wirIntroStep.getTheme(), wirIntroStep.getThemeVariant()), wirIntroStep.getName());
        }
        if (model instanceof PastSevenDaysStep) {
            PastSevenDaysStep pastSevenDaysStep = (PastSevenDaysStep) model;
            AbstractC22403o.c cVar5 = new AbstractC22403o.c(pastSevenDaysStep.getBackgroundImageUrl(), 0, 0, 0, 14, null);
            List<Day> days = pastSevenDaysStep.getDays();
            ArrayList arrayList7 = new ArrayList(AbstractC25267u.m74163i0(days, 10));
            for (Day day : days) {
                arrayList7.add(new C16113a(AbstractC8693b.m21278l(day.getText()), day.getSelected()));
            }
            TextResource textResourceM21278l24 = AbstractC8693b.m21278l(pastSevenDaysStep.getFooterText());
            TextResource textResourceM21278l25 = AbstractC8693b.m21278l(pastSevenDaysStep.getFooterSubText());
            String type = pastSevenDaysStep.getType();
            EnumC16115c enumC16115c = EnumC16115c.INTRO;
            EnumC16115c[] enumC16115cArrValues = EnumC16115c.values();
            int length4 = enumC16115cArrValues.length;
            while (i14 < length4) {
                EnumC16115c enumC16115c2 = enumC16115cArrValues[i14];
                if (AbstractC22676k.m65745e(enumC16115c2.name(), type)) {
                    obj = enumC16115c2;
                    break;
                }
                i14++;
            }
            return new C16114b(cVar5, arrayList7, textResourceM21278l24, textResourceM21278l25, obj == null ? enumC16115c : obj, UserJourneyFooterStyle.STEP_PROGRESS, m42119d(pastSevenDaysStep.getTheme(), pastSevenDaysStep.getThemeVariant()), pastSevenDaysStep.getName());
        }
        if (model instanceof WirPillarIntroStep) {
            WirPillarIntroStep wirPillarIntroStep = (WirPillarIntroStep) model;
            List<ColoredText> text2 = wirPillarIntroStep.getText();
            ArrayList arrayList8 = new ArrayList(AbstractC25267u.m74163i0(text2, 10));
            for (ColoredText coloredText : text2) {
                TextResource textResourceM21278l26 = AbstractC8693b.m21278l(coloredText.getText());
                EnumC39333f textColor = coloredText.getTextColor();
                if (textColor == null) {
                    textColor = EnumC39333f.BRAND_WHITE;
                }
                arrayList8.add(new C17581a(textResourceM21278l26, textColor));
            }
            return new C17582b(arrayList8, new AbstractC22403o.c(wirPillarIntroStep.getBackgroundImageUrl(), 0, 0, 0, 14, null), m42116a(wirPillarIntroStep.getText()), UserJourneyFooterStyle.STEP_PROGRESS, m42119d(wirPillarIntroStep.getTheme(), wirPillarIntroStep.getThemeVariant()), wirPillarIntroStep.getName(), null);
        }
        if (model instanceof WirWrapUpRecommendationsStep) {
            WirWrapUpRecommendationsStep wirWrapUpRecommendationsStep = (WirWrapUpRecommendationsStep) model;
            List<Recommendation> recommendations = wirWrapUpRecommendationsStep.getRecommendations();
            ArrayList arrayList9 = new ArrayList(AbstractC25267u.m74163i0(recommendations, 10));
            for (Recommendation recommendation : recommendations) {
                TextResource textResourceM21278l27 = AbstractC8693b.m21278l(recommendation.getText());
                String icon2 = recommendation.getIcon();
                EnumC16313m0 enumC16313m2 = EnumC16313m0.JOURNAL;
                EnumC16313m0[] enumC16313m0ArrValues2 = EnumC16313m0.values();
                int length5 = enumC16313m0ArrValues2.length;
                int i16 = 0;
                while (true) {
                    if (i16 >= length5) {
                        enumC16313m0 = null;
                        break;
                    }
                    enumC16313m0 = enumC16313m0ArrValues2[i16];
                    if (AbstractC22676k.m65745e(enumC16313m0.name(), icon2)) {
                        break;
                    }
                    i16++;
                }
                if (enumC16313m0 != null) {
                    enumC16313m2 = enumC16313m0;
                }
                arrayList9.add(new C20862a(textResourceM21278l27, enumC16313m2));
            }
            return new C20863b(arrayList9, AbstractC8693b.m21278l(wirWrapUpRecommendationsStep.getFooterText()), AbstractC8693b.m21278l(wirWrapUpRecommendationsStep.getFooterSubText()), UserJourneyFooterStyle.STEP_PROGRESS, m42119d(wirWrapUpRecommendationsStep.getTheme(), wirWrapUpRecommendationsStep.getThemeVariant()), wirWrapUpRecommendationsStep.getName());
        }
        if (model instanceof QuizStep) {
            QuizStep quizStep = (QuizStep) model;
            TextResource textResourceM21278l28 = AbstractC8693b.m21278l(quizStep.getWhoopCoachQuestion());
            List<QuizAnswerOption> answerOptions = quizStep.getAnswerOptions();
            ArrayList arrayList10 = new ArrayList(AbstractC25267u.m74163i0(answerOptions, 10));
            for (QuizAnswerOption quizAnswerOption : answerOptions) {
                arrayList10.add(new C40988a(AbstractC8693b.m21278l(quizAnswerOption.getAnswer()), quizAnswerOption.isCorrect()));
            }
            TextResource textResourceM21278l29 = AbstractC8693b.m21278l(quizStep.getWhoopCoachIncorrectResponse().getText());
            EnumC39333f textColor2 = quizStep.getWhoopCoachIncorrectResponse().getTextColor();
            if (textColor2 == null) {
                textColor2 = EnumC39333f.BRAND_WHITE;
            }
            C41003p c41003p = new C41003p(textResourceM21278l29, textColor2);
            TextResource textResourceM21278l30 = AbstractC8693b.m21278l(quizStep.getWhoopCoachCorrectResponse().getText());
            EnumC39333f textColor3 = quizStep.getWhoopCoachCorrectResponse().getTextColor();
            if (textColor3 == null) {
                textColor3 = EnumC39333f.BRAND_WHITE;
            }
            C41003p c41003p2 = new C41003p(textResourceM21278l30, textColor3);
            TextResource textResourceM21278l31 = AbstractC8693b.m21278l(quizStep.getWhoopCoachAnswerStatement());
            String theme = quizStep.getTheme();
            EnumC13585g enumC13585g5 = EnumC13585g.SLEEP;
            EnumC13585g[] enumC13585gArrValues3 = EnumC13585g.values();
            int length6 = enumC13585gArrValues3.length;
            while (true) {
                if (i14 >= length6) {
                    enumC13585g = null;
                    break;
                }
                enumC13585g = enumC13585gArrValues3[i14];
                if (AbstractC22676k.m65745e(enumC13585g.name(), theme)) {
                    break;
                }
                i14++;
            }
            EnumC13585g enumC13585g6 = enumC13585g == null ? enumC13585g5 : enumC13585g;
            String avatarUrl3 = quizStep.getAvatarUrl();
            return new C40993f(textResourceM21278l28, arrayList10, c41003p, c41003p2, textResourceM21278l31, enumC13585g6, avatarUrl3 != null ? new AbstractC22403o.c(avatarUrl3, 0, 0, 0, 14, null) : null, new AbstractC22403o.c(quizStep.getCorrectResponseIconUrl(), 0, 0, 0, 14, null), m42123i(quizStep.getCorrectResponseIconUrl()), 0L, UserJourneyFooterStyle.STEP_PROGRESS, m42118c(quizStep.getTheme(), quizStep.getThemeVariant(), isV2), quizStep.getName(), 512, null);
        }
        if (model instanceof DualBarStep) {
            DualBarStep dualBarStep = (DualBarStep) model;
            float fillPercentage = dualBarStep.getLeftBar().getFillPercentage();
            EnumC39333f barColor = dualBarStep.getLeftBar().getBarColor();
            if (barColor == null) {
                barColor = EnumC39333f.RECOVERY;
            }
            EnumC39333f enumC39333f = barColor;
            EnumC39333f labelColor = dualBarStep.getLeftBar().getLabelColor();
            if (labelColor == null) {
                labelColor = EnumC39333f.BRAND_WHITE;
            }
            C34091h c34091h = new C34091h(fillPercentage, enumC39333f, labelColor, AbstractC8693b.m21278l(dualBarStep.getLeftBar().getLabelText()), AbstractC8693b.m21278l(dualBarStep.getLeftBar().getLabelSuffix()), AbstractC8693b.m21278l(dualBarStep.getLeftBar().getLabelSubtext()), m42117b(dualBarStep.getTheme()));
            float fillPercentage2 = dualBarStep.getRightBar().getFillPercentage();
            EnumC39333f barColor2 = dualBarStep.getRightBar().getBarColor();
            if (barColor2 == null) {
                barColor2 = EnumC39333f.RECOVERY;
            }
            EnumC39333f enumC39333f2 = barColor2;
            EnumC39333f labelColor2 = dualBarStep.getRightBar().getLabelColor();
            if (labelColor2 == null) {
                labelColor2 = EnumC39333f.BRAND_WHITE;
            }
            return new C34090g(c34091h, new C34091h(fillPercentage2, enumC39333f2, labelColor2, AbstractC8693b.m21278l(dualBarStep.getRightBar().getLabelText()), AbstractC8693b.m21278l(dualBarStep.getRightBar().getLabelSuffix()), AbstractC8693b.m21278l(dualBarStep.getRightBar().getLabelSubtext()), m42117b(dualBarStep.getTheme())), AbstractC8693b.m21278l(dualBarStep.getFooterText()), AbstractC8693b.m21278l(dualBarStep.getFooterSubText()), UserJourneyFooterStyle.STEP_PROGRESS, m42118c(dualBarStep.getTheme(), dualBarStep.getThemeVariant(), isV2), dualBarStep.getName());
        }
        if (!(model instanceof InReviewDesignItemStep)) {
            throw new IllegalStateException("Unsupported Model Type");
        }
        InReviewDesignItemStep inReviewDesignItemStep = (InReviewDesignItemStep) model;
        List<ContentSection> contentSections = inReviewDesignItemStep.getContentSections();
        ArrayList arrayList11 = new ArrayList(AbstractC25267u.m74163i0(contentSections, 10));
        for (ContentSection contentSection : contentSections) {
            SectionType sectionType = contentSection.getSectionType();
            List<DesignSystemModel> items = contentSection.getItems();
            ArrayList arrayList12 = new ArrayList();
            for (Object obj2 : items) {
                if (!(((DesignSystemModel) obj2) instanceof UnknownDesignModel)) {
                    arrayList12.add(obj2);
                }
            }
            ArrayList arrayList13 = new ArrayList(AbstractC25267u.m74163i0(arrayList12, 10));
            Iterator it8 = arrayList12.iterator();
            while (it8.hasNext()) {
                InterfaceC25312u interfaceC25312uM60541h = this.designItemReducerInstance.m60541h((DesignSystemModel) it8.next());
                if ((interfaceC25312uM60541h instanceof C38553c0) && submittedTimeCapsuleText != null) {
                    interfaceC25312uM60541h = C38553c0.m123540b((C38553c0) interfaceC25312uM60541h, null, null, null, null, submittedTimeCapsuleText, 15, null);
                }
                arrayList13.add(interfaceC25312uM60541h);
            }
            arrayList11.add(new C24700a(sectionType, sectionId, arrayList13));
        }
        ArrayList arrayList14 = new ArrayList();
        Iterator it9 = arrayList11.iterator();
        while (it9.hasNext()) {
            AbstractC25265s.m74141p0(arrayList14, ((C24700a) it9.next()).m72305a());
        }
        if (arrayList14.isEmpty()) {
            i13 = 0;
        } else {
            Iterator it10 = arrayList14.iterator();
            i13 = 0;
            while (it10.hasNext()) {
                if ((((InterfaceC25312u) it10.next()) instanceof C38566g1) && (i13 = i13 + 1) < 0) {
                    AbstractC37056f.m118976c0();
                    throw null;
                }
            }
        }
        if (AbstractC22676k.m65745e(sectionId, "Chronological") && i13 > 0) {
            ArrayList arrayList15 = new ArrayList();
            Iterator it11 = arrayList11.iterator();
            while (it11.hasNext()) {
                AbstractC25265s.m74141p0(arrayList15, ((C24700a) it11.next()).m72305a());
            }
            if (!arrayList15.isEmpty()) {
                Iterator it12 = arrayList15.iterator();
                while (it12.hasNext()) {
                    if (!(((InterfaceC25312u) it12.next()) instanceof C38566g1) && (i14 = i14 + 1) < 0) {
                        AbstractC37056f.m118976c0();
                        throw null;
                    }
                }
            }
        }
        int i17 = i13 + i14;
        String footerNote = inReviewDesignItemStep.getFooterNote();
        return new C24701b(arrayList11, UserJourneyFooterStyle.STEP_PROGRESS, m42118c(inReviewDesignItemStep.getTheme(), "PRIMARY", true), "IN_REVIEW_DESIGN_ITEM_STEP", footerNote != null ? AbstractC8693b.m21278l(footerNote) : null, i17);
    }
}
