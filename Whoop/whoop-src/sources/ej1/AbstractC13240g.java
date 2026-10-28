package ej1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c41.C4092p2;
import c93.InterfaceC4339a;
import cj1.C4745a;
import cj1.C4746b;
import cj1.C4748d;
import cj1.C4749e;
import cj1.C4758n;
import cj1.EnumC4747c;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import d11.C11474i;
import d11.C11475j;
import d30.C11546l;
import e11.C12582b;
import e81.C12824e;
import e93.AbstractC12889b;
import gb1.AbstractC15673b0;
import gy0.AbstractC16272a;
import gz0.EnumC16313m0;
import h01.C16553t;
import h01.EnumC16533a;
import hy0.C17731c2;
import hy0.EnumC17727b2;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j61.C21374h;
import j71.C21395c;
import java.util.Iterator;
import kd1.AbstractC22403o;
import kd1.EnumC22400l;
import l83.C23454a0;
import l83.InterfaceC23459e;
import ny0.C27256h;
import ny0.EnumC27272p;
import oi1.AbstractC27949a;
import p000.AbstractC11266d;
import p000.C0003a0;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p181h2.C16618c;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p602x1.AbstractC37817c;
import p712j91.Function1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: ej1.g */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b!\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\"\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012\"\u0014\u0010\u0017\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012\"\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019\"\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\"\u001a\u0010$\u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u001a\u0010'\u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#\"\u001a\u0010-\u001a\u00020(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u001a\u00100\u001a\u00020(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010,\"\u001a\u00106\u001a\u0002018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u001a\u0010;\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u001a\u0010>\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u00108\u001a\u0004\b=\u0010:\"\u001a\u0010A\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u00108\u001a\u0004\b@\u0010:\"\u001a\u0010E\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\bB\u0010\u0012\u001a\u0004\bC\u0010D\"\u001a\u0010H\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u00108\u001a\u0004\bG\u0010:\"\u001a\u0010K\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bI\u00108\u001a\u0004\bJ\u0010:\"\u001a\u0010N\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bL\u00108\u001a\u0004\bM\u0010:\"\u001a\u0010Q\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bO\u00108\u001a\u0004\bP\u0010:¨\u0006R"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcj1/e;", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Landroidx/compose/ui/Modifier;Lcj1/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcj1/b;", "a", "Lcj1/b;", "getHeader", "()Lcj1/b;", "header", "Lcj1/a;", "b", "Lcj1/a;", "cardBodyItem", "c", "cardBodyWithOnlyCtaItem", "d", "cardBodyHarvardItem", "Lh01/t;", "Lh01/t;", "ecgOnboarding", "Lc41/p2;", "f", "Lc41/p2;", "infoCallOutItem", "Lej1/c0;", "g", "Lej1/c0;", "getImageCardBody", "()Lej1/c0;", "imageCardBody", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "getImageCardBodyShepherdOnly", "imageCardBodyShepherdOnly", "Lej1/j0;", "i", "Lej1/j0;", "getScreenerStatusTile", "()Lej1/j0;", "screenerStatusTile", "j", "getScreenerStatusTileShepherdOnly", "screenerStatusTileShepherdOnly", "Lny0/h;", "k", "Lny0/h;", "getCardButtonOnboarding", "()Lny0/h;", "cardButtonOnboarding", "l", "Lcj1/e;", "getDataVisCardItem", "()Lcj1/e;", "dataVisCardItem", "m", "getDataVisCardWithOnboardingItem", "dataVisCardWithOnboardingItem", "n", "getDataVisCardHarvardItem", "dataVisCardHarvardItem", "o", "getDataBehindCardItem", "()Lcj1/a;", "dataBehindCardItem", "p", "getDataVisCardDataBehindItem", "dataVisCardDataBehindItem", "q", "getDataVisCardV2Normal", "dataVisCardV2Normal", "r", "getDataVisCardV2LongText", "dataVisCardV2LongText", "s", "getDataVisCardV2ShepherdOnlyNoCta", "dataVisCardV2ShepherdOnlyNoCta", "health_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13240g {

    /* JADX INFO: renamed from: a */
    private static final C4746b f45856a;

    /* JADX INFO: renamed from: b */
    private static final C4745a f45857b;

    /* JADX INFO: renamed from: c */
    private static final C4745a f45858c;

    /* JADX INFO: renamed from: d */
    private static final C4745a f45859d;

    /* JADX INFO: renamed from: e */
    private static final C16553t f45860e;

    /* JADX INFO: renamed from: f */
    private static final C4092p2 f45861f;

    /* JADX INFO: renamed from: g */
    private static final C13233c0 f45862g;

    /* JADX INFO: renamed from: h */
    private static final C13233c0 f45863h;

    /* JADX INFO: renamed from: i */
    private static final C13247j0 f45864i;

    /* JADX INFO: renamed from: j */
    private static final C13247j0 f45865j;

    /* JADX INFO: renamed from: k */
    private static final C27256h f45866k;

    /* JADX INFO: renamed from: l */
    private static final C4749e f45867l;

    /* JADX INFO: renamed from: m */
    private static final C4749e f45868m;

    /* JADX INFO: renamed from: n */
    private static final C4749e f45869n;

    /* JADX INFO: renamed from: o */
    private static final C4745a f45870o;

    /* JADX INFO: renamed from: p */
    private static final C4749e f45871p;

    /* JADX INFO: renamed from: q */
    private static final C4749e f45872q;

    /* JADX INFO: renamed from: r */
    private static final C4749e f45873r;

    /* JADX INFO: renamed from: s */
    private static final C4749e f45874s;

    static {
        C4746b c4746b = new C4746b(AbstractC8693b.m21278l("HEART SCREENER"), AbstractC8693b.m21278l("TAKE AN ECG"), 0, 4, null);
        f45856a = c4746b;
        TextResource textResourceM21278l = AbstractC8693b.m21278l("ECG SINUS RHYTHM");
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("Normal");
        TextResource.C8691e c8691e = new TextResource.C8691e("Within Last Month");
        EnumC17727b2 enumC17727b2 = EnumC17727b2.POSITIVE_RANGE;
        C17731c2 c17731c2 = new C17731c2(c8691e, true, enumC17727b2, false, null, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32760, null);
        C21395c c21395c = new C21395c(new C21374h(null, AbstractC13234d.m37172n(), null, null, new C16618c(0.0f, 0.025f, 0.0f, 0.04f), AbstractC13234d.m37174p(), null, null, false, false, null, 0L, 0.0f, 8141, null), AbstractC13234d.m37173o(), null, null, 12, null);
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l("Enable Irregular Heart Rhythm Notifications");
        EnumC16313m0 enumC16313m0 = EnumC16313m0.TINY_CHECKMARK;
        C4745a c4745a = new C4745a(textResourceM21278l, textResourceM21278l2, c17731c2, c21395c, new C4748d(new C11474i(null, EnumC22400l.ANF_ONBOARDING, null, textResourceM21278l3, null, null, new C39274g(enumC16313m0.toWhoopIcon(), null, 2, null), null, null, null, null, false, false, new C11475j(Function1.m60318a(AbstractC15673b0.m43983F0()), 0.0f, 2, null), null, null, false, false, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 536862517, null), EnumC4747c.ShepherdOnboarding), new C4748d(new C11474i(null, EnumC22400l.ANF_NOT_DETECTED, null, AbstractC8693b.m21278l("AFib not detected and some long text even longer"), null, null, new C39274g(enumC16313m0.toWhoopIcon(), null, 2, null), null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 536870709, null), EnumC4747c.ShepherdNotDetected));
        f45857b = c4745a;
        TextResource textResourceM21267a = AbstractC8693b.m21267a();
        TextResource textResourceM21267a2 = AbstractC8693b.m21267a();
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l("Heart Notifications activated");
        EnumC16313m0 enumC16313m1 = EnumC16313m0.TINY_ELLIPSE;
        C39274g c39274g = new C39274g(enumC16313m1.toWhoopIcon(), null, 2, null);
        EnumC22400l enumC22400l = EnumC22400l.ANF_RECENTLY_ACTIVATED;
        C11474i c11474i = new C11474i(null, enumC22400l, null, textResourceM21278l4, null, null, c39274g, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 536870709, null);
        EnumC4747c enumC4747c = EnumC4747c.ShepherdRecentlyActivated;
        C4745a c4745a2 = new C4745a(textResourceM21267a, textResourceM21267a2, null, null, new C4748d(c11474i, enumC4747c), null);
        f45858c = c4745a2;
        C4745a c4745a3 = new C4745a(AbstractC8693b.m21267a(), AbstractC8693b.m21278l("AFib not detected"), new C17731c2(new TextResource.C8691e("Within Last Month"), true, enumC17727b2, false, null, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32760, null), null, null, null);
        f45859d = c4745a3;
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l("ECG");
        String str = "";
        String str2 = "IMPACT_UNLOCKED";
        boolean z4 = false;
        C16553t c16553t = new C16553t(str, AbstractC8693b.m21278l("Lorem ipsum dolor sit amet, consetetur. Lorem ipsum dolor sit amet, consetetur. Lorem ipsum dolor sit amet, consetetur. Lorem ipsum dolor sit amet, consetetur. Lorem ipsum dolor sit amet, consetetur."), str2, null, z4, null, EnumC16533a.ONBOARDING_BG_GRADIENT, new AbstractC22403o.a(AbstractC16272a.f62152s), textResourceM21278l5, false, true, null, null, 6712, null);
        f45860e = c16553t;
        C4092p2 c4092p2 = new C4092p2(EnumC16313m0.TINY_ATTENTION, 0.0f, null, null, AbstractC8693b.m21278l("WHOOP screens for AFib in the background. Though AFib hasn't been detected within the last 24 hours, your most recent ECG report does show signs of AFib. This can be due to sporadic AFib occurances. Consider taking another ECG and sharing with your doctor if you have symptoms"), null, EnumC39333f.BLACK_20, null, EnumC39333f.ACCENT_NEGATIVE_TREND, null, null, null, null, false, null, null, null, null, null, null, 1048238, null);
        f45861f = c4092p2;
        C13233c0 c13233c0 = new C13233c0(null, AbstractC8693b.m21278l("AFib not detected"), AbstractC37056f.m118958J(new C17731c2(AbstractC8693b.m21277k(AbstractC27949a.f112724c), true, EnumC17727b2.NONE, false, null, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32696, null)), new AbstractC22403o.a(AbstractC16272a.f62152s));
        f45862g = c13233c0;
        TextResource textResourceM21278l6 = AbstractC8693b.m21278l("AFib not detected");
        TextResource textResourceM21278l7 = AbstractC8693b.m21278l("BACKGROUND SCREENING");
        TextResource.C8691e c8691e2 = new TextResource.C8691e("In the last 24 hours");
        EnumC17727b2 enumC17727b3 = EnumC17727b2.NEGATIVE_YELLOW;
        C13233c0 c13233c1 = new C13233c0(textResourceM21278l7, textResourceM21278l6, AbstractC37056f.m118959K(new C17731c2(c8691e2, true, enumC17727b3, false, null, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32696, null), new C17731c2(new TextResource.C8691e("In the last 24 hours"), true, enumC17727b3, false, null, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32696, null)), new AbstractC22403o.a(AbstractC16272a.f62152s));
        f45863h = c13233c1;
        TextResource textResourceM21278l8 = AbstractC8693b.m21278l("BACKGROUND SCREENING");
        EnumC16313m0 enumC16313m2 = EnumC16313m0.REMOVE;
        EnumC17727b2 enumC17727b4 = EnumC17727b2.NO_CHANGE;
        EnumC13241g0 enumC13241g0 = EnumC13241g0.SHEPHERD;
        C13247j0 c13247j0 = new C13247j0(AbstractC37056f.m118959K(new C13263z(textResourceM21278l8, enumC13241g0, enumC16313m2, enumC17727b4), new C13263z(AbstractC8693b.m21278l("ECG REPORT"), EnumC13241g0.LABRADOR, enumC16313m0, EnumC17727b2.POSITIVE_GREEN)), AbstractC8693b.m21278l("Background Screening activated. It takes up to 24 hours of data before."));
        f45864i = c13247j0;
        C13247j0 c13247j1 = new C13247j0(AbstractC37056f.m118958J(new C13263z(AbstractC8693b.m21278l("BACKGROUND SCREENING"), enumC13241g0, enumC16313m1, enumC17727b4)), null);
        f45865j = c13247j1;
        C27256h c27256h = new C27256h(AbstractC8693b.m21278l("ENABLE ECG"), null, null, null, null, null, EnumC27272p.ONBOARDING, null, null, null, null, null, null, false, true, null, false, false, null, null, null, null, null, null, null, 33529790, null);
        f45866k = c27256h;
        int i13 = 12;
        DefaultConstructorMarker defaultConstructorMarker = null;
        C9598e c9598e = null;
        C4758n c4758n = null;
        f45867l = new C4749e(c4746b, AbstractC37056f.m118959K(c4745a, c4092p2), c9598e, c4758n, i13, defaultConstructorMarker);
        f45868m = new C4749e(c4746b, AbstractC37056f.m118959K(c16553t, c4745a2), c9598e, c4758n, i13, defaultConstructorMarker);
        f45869n = new C4749e(c4746b, AbstractC37056f.m118958J(c4745a3), c9598e, c4758n, i13, defaultConstructorMarker);
        C4745a c4745a4 = new C4745a(AbstractC8693b.m21267a(), AbstractC8693b.m21267a(), null, null, new C4748d(new C11474i(null, enumC22400l, null, AbstractC8693b.m21278l("Data behind"), null, null, new C39274g(enumC16313m1.toWhoopIcon(), null, 2, null), null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 536870709, null), enumC4747c), null);
        f45870o = c4745a4;
        C9598e c9598e2 = null;
        f45871p = new C4749e(c4746b, AbstractC37056f.m118958J(c4745a4), c9598e2, c4758n, i13, defaultConstructorMarker);
        f45872q = new C4749e(c4746b, AbstractC37056f.m118959K(c13233c0, c13247j0, c27256h), c9598e2, c4758n, i13, defaultConstructorMarker);
        C9598e c9598e3 = null;
        f45873r = new C4749e(c4746b, AbstractC37056f.m118959K(c13233c0, C13247j0.m37225b(c13247j0, null, AbstractC8693b.m21278l("Your Background Screening detected possible AFib in the last day, likely overnight. AFib is sporadic, which is likely why your new ECG did not detect AFib at the time of your reading. You’ll receive a notification in a few hours to take another ECG."), 1, null), new C27256h(AbstractC8693b.m21278l("TAKE ECG"), EnumC16313m0.ADD, null, null, null, null, EnumC27272p.HIGHLIGHT, null, null, null, null, null, null, false, true, null, false, false, null, null, null, null, null, null, null, 33529788, null)), c9598e3, c4758n, i13, defaultConstructorMarker);
        f45874s = new C4749e(c4746b, AbstractC37056f.m118959K(c13233c1, c13247j1), c9598e3, c4758n, i13, defaultConstructorMarker);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x009f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:61:0x0114  */
    /* JADX WARN: Code duplicated, block: B:64:0x011f  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m37200e(Modifier modifier, C4749e itemState, p715kotlin.jvm.functions.Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        p715kotlin.jvm.functions.Function1 function2;
        boolean z4;
        p715kotlin.jvm.functions.Function1 function3;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifierM3362g;
        C28676v0 c28676v0;
        p715kotlin.jvm.functions.Function1 function4;
        boolean zM87157i;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(itemState, "itemState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(501428815);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(itemState) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                modifierM3362g = C2314t.f9131w;
                if (i16 != 0) {
                    modifier2 = modifierM3362g;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C12824e(29);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (p715kotlin.jvm.functions.Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                if (itemState.getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String() != null) {
                    c28655q.m87150e0(169760473);
                    zM87157i = c28655q.m87157i(itemState) | ((i15 & 896) == 256);
                    objM87133R = c28655q.m87133R();
                    if (zM87157i || objM87133R == c28676v0) {
                        objM87133R = new C11546l(15, function4, itemState);
                        c28655q.m87172p0(objM87133R);
                    }
                    modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, (InterfaceC4339a) objM87133R, 15);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(169853659);
                    c28655q.m87173q(false);
                }
                float f13 = 4;
                float f14 = 3 * f13;
                AbstractC12889b.m36263b(AbstractC37056f.m118994r(modifier2, AbstractC33253j.m105489e(f14)).mo3471e(modifierM3362g), AbstractC33253j.m105489e(f14), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), null, 0 * f13, AbstractC37817c.m121344e(-454515572, c28655q, new C0003a0(27, itemState, function4)), c28655q, 1769472, 24);
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            modifier3 = modifier2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C12582b(i13, i14, 7, (Object) modifier3, (Object) itemState, (InterfaceC23459e) function3);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            modifierM3362g = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = modifierM3362g;
            }
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C12824e(29);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (p715kotlin.jvm.functions.Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            if (itemState.getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String() != null) {
                c28655q.m87150e0(169760473);
                zM87157i = c28655q.m87157i(itemState) | ((i15 & 896) == 256);
                objM87133R = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R = new C11546l(15, function4, itemState);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C11546l(15, function4, itemState);
                    c28655q.m87172p0(objM87133R);
                }
                modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, (InterfaceC4339a) objM87133R, 15);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(169853659);
                c28655q.m87173q(false);
            }
            float f15 = 4;
            float f16 = 3 * f15;
            AbstractC12889b.m36263b(AbstractC37056f.m118994r(modifier2, AbstractC33253j.m105489e(f16)).mo3471e(modifierM3362g), AbstractC33253j.m105489e(f16), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), null, 0 * f15, AbstractC37817c.m121344e(-454515572, c28655q, new C0003a0(27, itemState, function4)), c28655q, 1769472, 24);
            function3 = function4;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        modifier3 = modifier2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12582b(i13, i14, 7, (Object) modifier3, (Object) itemState, (InterfaceC23459e) function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m37201f(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m37202g(p715kotlin.jvm.functions.Function1 function1, C4749e c4749e) {
        C9598e c9598eM14940c = c4749e.getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String();
        if (c9598eM14940c == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        function1.invoke(c9598eM14940c);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m37203h(C4749e c4749e, p715kotlin.jvm.functions.Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 2 * 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13, C2314t.f9131w);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC13236e.m37181b(c4749e.getHeader(), function1, c28655q, TextResource.$stable);
            c28655q.m87150e0(-1996578249);
            Iterator<T> it = c4749e.m14939b().iterator();
            while (it.hasNext()) {
                AbstractC13254q.m37258d(null, (InterfaceC25312u) it.next(), function1, c28655q, 0, 1);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m37204i(Modifier modifier, C4749e c4749e, p715kotlin.jvm.functions.Function1 function1, int i13, int i14, Composer composer, int i15) {
        m37200e(modifier, c4749e, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
