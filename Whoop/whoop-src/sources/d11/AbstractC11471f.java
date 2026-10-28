package d11;

import a31.C0343e;
import a81.C0555f;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import az1.C2161b;
import bs1.C3603v;
import c51.C4231h;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.edit.form.C9779c;
import cu2.C11132l;
import e93.AbstractC12889b;
import gb1.AbstractC15673b0;
import gy0.AbstractC16272a;
import gz0.AbstractC16319p0;
import hg3.AbstractC17269i;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import i91.C18250d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.IOException;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kd1.C22411w;
import kd1.EnumC22400l;
import kotlin.C2032u;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import mh.C25540h;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27265l0;
import ny0.EnumC27269n0;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p132f0.C13825t;
import p134f2.C14015d;
import p134f2.C14018g;
import p163g1.AbstractC15005f3;
import p163g1.AbstractC15011f9;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p209i3.C18027i;
import p238j0.InterfaceC21083i;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.EnumC22935a1;
import p294l3.C23285v0;
import p315m0.AbstractC24868a;
import p331n2.AbstractC26165a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.C39077b1;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p712j91.InterfaceC21430b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import pf.AbstractC29125c;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: d11.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010 \n\u0002\b\u0006\u001a?\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\u000e\u001a\u00020\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u00020\r*\u00020\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a½\u0001\u0010*\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00142\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010&\u001a\u00020!2\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00050'2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b*\u0010+\"\u0017\u00100\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0017\u00103\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u0010/\"\u0017\u00106\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u0010/\"\u0017\u00109\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b7\u0010-\u001a\u0004\b8\u0010/\"\u0017\u0010<\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b:\u0010-\u001a\u0004\b;\u0010/\"\u0017\u0010?\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b=\u0010-\u001a\u0004\b>\u0010/\"\u0017\u0010B\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b@\u0010-\u001a\u0004\bA\u0010/\"\u0017\u0010E\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bC\u0010-\u001a\u0004\bD\u0010/\"\u0017\u0010H\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bF\u0010-\u001a\u0004\bG\u0010/\"\u0017\u0010K\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bI\u0010-\u001a\u0004\bJ\u0010/\"\u0017\u0010M\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\bL\u0010/\"\u0017\u0010P\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bN\u0010-\u001a\u0004\bO\u0010/\"\u0017\u0010S\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bQ\u0010-\u001a\u0004\bR\u0010/\"\u0017\u0010V\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bT\u0010-\u001a\u0004\bU\u0010/\"\u0017\u0010Y\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bW\u0010-\u001a\u0004\bX\u0010/\"\u0017\u0010\\\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bZ\u0010-\u001a\u0004\b[\u0010/\"\u0017\u0010_\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b]\u0010-\u001a\u0004\b^\u0010/\"\u001d\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00000`8\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d¨\u0006f"}, m65681d2 = {"Ld11/i;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "Ll83/a0;", "onDismiss", "onClick", "k", "(Ld11/i;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Ld11/a;", "Ly3/f;", "width", "Lf0/t;", "y", "(Ld11/a;FLandroidx/compose/runtime/Composer;I)Lf0/t;", "x", "(Ld11/a;Landroidx/compose/runtime/Composer;I)Lf0/t;", "Lcom/whoop/design/util/TextResource;", "title", "Ll3/v0;", "titleTextStyle", "supportText", "supportTextStyle", "Ly71/g;", "leftIcon", "Lkd1/o;", "startImageUrl", "endImageUrl", "startImageSize", "startImagePadding", "contentVerticalPadding", "contentEndPadding", "", "isLocked", "isComplete", "Ld11/b;", "ctaButtonInformation", "showCaretIcon", "Lkotlin/Function1;", "Lmh/h;", "backgroundImgBuilder", "s", "(Lcom/whoop/design/util/TextResource;Ll3/v0;Lcom/whoop/design/util/TextResource;Ll3/v0;Ly71/g;Lkd1/o;Lkd1/o;FFFFZZLd11/b;ZLkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;III)V", "a", "Ld11/i;", "getIncompleteState", "()Ld11/i;", "incompleteState", "b", "getIncompleteStateWithSecondaryButton", "incompleteStateWithSecondaryButton", "c", "getButtonWithALongLongTitle", "ButtonWithALongLongTitle", "d", "getIncompleteStateWithColorBorder", "incompleteStateWithColorBorder", "e", "getIncompleteStateWithBrushBorder", "incompleteStateWithBrushBorder", "f", "getIncompleteStateWithCustomImageOverlayBrush", "incompleteStateWithCustomImageOverlayBrush", "g", "getLockedState", "lockedState", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "getCompleteState", "completeState", "i", "getIncompleteStateNoCaret", "incompleteStateNoCaret", "j", "getIncompleteStateDismissible", "incompleteStateDismissible", "getLinkWorkoutCtaTile", "linkWorkoutCtaTile", "l", "getHealthEducation", "healthEducation", "m", "getEducationCoach", "educationCoach", "n", "getLongText", "longText", "o", "getAccessHomeTile", "accessHomeTile", "p", "getStartAndEndImageState", "startAndEndImageState", "q", "getHolidayGiftUpgradePromo", "holidayGiftUpgradePromo", "", "r", "Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "()Ljava/util/List;", "ctaTileStates", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11471f {

    /* JADX INFO: renamed from: a */
    private static final C11474i f36830a;

    /* JADX INFO: renamed from: b */
    private static final C11474i f36831b;

    /* JADX INFO: renamed from: c */
    private static final C11474i f36832c;

    /* JADX INFO: renamed from: d */
    private static final C11474i f36833d;

    /* JADX INFO: renamed from: e */
    private static final C11474i f36834e;

    /* JADX INFO: renamed from: f */
    private static final C11474i f36835f;

    /* JADX INFO: renamed from: g */
    private static final C11474i f36836g;

    /* JADX INFO: renamed from: h */
    private static final C11474i f36837h;

    /* JADX INFO: renamed from: i */
    private static final C11474i f36838i;

    /* JADX INFO: renamed from: j */
    private static final C11474i f36839j;

    /* JADX INFO: renamed from: k */
    private static final C11474i f36840k;

    /* JADX INFO: renamed from: l */
    private static final C11474i f36841l;

    /* JADX INFO: renamed from: m */
    private static final C11474i f36842m;

    /* JADX INFO: renamed from: n */
    private static final C11474i f36843n;

    /* JADX INFO: renamed from: o */
    private static final C11474i f36844o;

    /* JADX INFO: renamed from: p */
    private static final C11474i f36845p;

    /* JADX INFO: renamed from: q */
    private static final C11474i f36846q;

    /* JADX INFO: renamed from: r */
    private static final List<C11474i> f36847r;

    /* JADX INFO: renamed from: d11.f$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f36848w = new a();

        /* JADX INFO: renamed from: a */
        public final long m30801a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getWhite10();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m30801a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: d11.f$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f36849w = new b();

        /* JADX INFO: renamed from: a */
        public final long m30802a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getBrandBlack();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m30802a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: d11.f$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f36850w = new c();

        /* JADX INFO: renamed from: a */
        public final long m30803a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getWhite10();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m30803a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: d11.f$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f36851w = new d();

        /* JADX INFO: renamed from: a */
        public final long m30804a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getWhite10();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m30804a((C39336i) obj));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        C11474i c11474i = new C11474i(null, null, null, AbstractC8693b.m21278l("Set up your personalized alarm"), null, null, new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getSleepCoach(), null, 2, 0 == true ? 1 : 0), new AbstractC22403o.a(AbstractC16272a.f62050b), null, null, null, false, false, null, null, null, false, false, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 536870711, null);
        f36830a = c11474i;
        TextResource textResourceM21278l = AbstractC8693b.m21278l("Set up your personalized alarm");
        int i13 = 2;
        C39274g c39274g = new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getSleepCoach(), null, i13, 0 == true ? 1 : 0);
        AbstractC22403o.a aVar = new AbstractC22403o.a(AbstractC16272a.f62050b);
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("Wake up refreshed");
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l("LET'S GO");
        EnumC39333f enumC39333f = EnumC39333f.ACCENT_ACTION;
        C11474i c11474i2 = new C11474i(null, null, null, textResourceM21278l, textResourceM21278l2, null, c39274g, aVar, null, null, null, false, false, null, null, new C11467b(textResourceM21278l3, enumC39333f, new C39274g(AbstractC16319p0.m46430a().getTinyIcons().getForwardArrow(), 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0), null, 8, null), false, false, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 536837927, null);
        f36831b = c11474i2;
        C11474i c11474i3 = new C11474i(null, null, null, AbstractC8693b.m21278l("Set up your personalized alarm"), AbstractC8693b.m21278l("Track your habits to see how they correlate to changes in your recovery and performance "), null, new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getSleepCoach(), 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0), new AbstractC22403o.a(AbstractC16272a.f62050b), null, null, null, false, false, null, null, new C11467b(AbstractC8693b.m21278l("LET'S GO"), enumC39333f, new C39274g(AbstractC16319p0.m46430a().getTinyIcons().getForwardArrow(), 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0), 0 == true ? 1 : 0, 8, null), false, false, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 536837927, null);
        f36832c = c11474i3;
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l("Set up your personalized alarm");
        C39274g c39274g2 = new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getSleepCoach(), 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        AbstractC22403o.a aVar2 = new AbstractC22403o.a(AbstractC16272a.f62050b);
        EnumC39333f enumC39333f2 = EnumC39333f.BRAND_WHITE;
        C11474i c11474i4 = new C11474i(null, null, null, textResourceM21278l4, null, null, c39274g2, aVar2, null, null, null, false, false, new C11476k(enumC39333f2, 0.0f, 2, null), null, null, false, false, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 536862519, null);
        f36833d = c11474i4;
        C11474i c11474i5 = new C11474i(null, null, null, AbstractC8693b.m21278l("Set up your personalized alarm"), null, null, new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getSleepCoach(), 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0), new AbstractC22403o.a(AbstractC16272a.f62050b), null, null, null, false, false, new C11475j(p712j91.Function1.m60318a(AbstractC15673b0.m43983F0()), 0.0f, 2, null), null, null, false, false, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 536862519, null);
        f36834e = c11474i5;
        C11474i c11474i6 = new C11474i(null, null, null, AbstractC8693b.m21278l("Set up your personalized alarm"), null, null, new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getSleepCoach(), 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0), new AbstractC22403o.a(AbstractC16272a.f62050b), null, null, null, false, false, null, null, null, false, false, null, null, null, C17909s.m51483a(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4294967295L)), new C17919x(AbstractC17918w0.m51515c(0))), 0.0f, 0.0f, 14), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 534773559, null);
        f36835f = c11474i6;
        C11474i c11474i7 = new C11474i(null, null, null, AbstractC8693b.m21278l("Set up your personalized alarm"), AbstractC8693b.m21278l("At least 1 recovery is required to unlock"), null, new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getSleepCoach(), 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0), new AbstractC22403o.a(AbstractC16272a.f62050b), null, null, null, false, false, null, null, null, false, false, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 536864551, null);
        f36836g = c11474i7;
        C11474i c11474i8 = new C11474i(null, null, null, AbstractC8693b.m21278l("Set up your personalized alarm"), null, null, new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getSleepCoach(), 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0), new AbstractC22403o.a(AbstractC16272a.f62050b), null, null, null, false, true, null, null, null, false, false, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 536866615, null);
        f36837h = c11474i8;
        C11474i c11474i9 = new C11474i(null, null, null, AbstractC8693b.m21278l("Set up your personalized alarm"), null, null, new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getSleepCoach(), 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0), new AbstractC22403o.a(AbstractC16272a.f62050b), null, null, null, false, false, null, null, null, false, false, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 536805175, null);
        f36838i = c11474i9;
        C11474i c11474i10 = new C11474i(null, null, null, AbstractC8693b.m21278l("Set up your personalized alarm"), null, null, new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getSleepCoach(), 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0), new AbstractC22403o.a(AbstractC16272a.f62050b), null, null, null, false, false, null, null, null, false, true, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 536674103, null);
        f36839j = c11474i10;
        int i14 = 8;
        C11474i c11474i11 = new C11474i(null, null, null, AbstractC8693b.m21278l("Calculate Muscular Load"), AbstractC8693b.m21278l("Get muscular load credit for your workout and create a history of all your sets & reps."), null, new C39274g(AbstractC16319p0.m46430a().getActivities().getWeightlifting(), 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0), null, null, null, null, false, false, null, null, new C11467b(AbstractC8693b.m21278l("ADD EXERCISES"), EnumC39333f.STRAIN, new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward(), 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0), null, i14, defaultConstructorMarker), false, true, null, AbstractC18249c.m52574l(b.f36849w), null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 536182567, null);
        f36840k = c11474i11;
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l("How Do I Improve My Fitness?");
        C11474i c11474i12 = new C11474i(null, EnumC22400l.EDUCATION_COACH, null, textResourceM21278l5, AbstractC8693b.m21278l("A quick check-in with WHOOP Coach can help you learn how to meet or outperform recommendations."), null, new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward(), 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0), null, new AbstractC22403o.a(AbstractC16272a.f61976O4), null, null, false, false, null, null, new C11467b(AbstractC8693b.m21278l("Chat with coach"), enumC39333f2, new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward(), 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0), p712j91.Function1.m60318a(AbstractC15673b0.m43972A())), false, false, null, null, p712j91.Function1.m60318a(AbstractC15673b0.m44002P()), null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 535789093, null);
        f36841l = c11474i12;
        TextResource textResourceM21278l6 = AbstractC8693b.m21278l("How Do I Improve My Fitness?");
        EnumC22400l enumC22400l = EnumC22400l.HEALTHSPAN_EDUCATION;
        C11474i c11474i13 = new C11474i(null, enumC22400l, null, textResourceM21278l6, AbstractC8693b.m21278l("A quick check-in with WHOOP Coach can help you learn how to meet or outperform recommendations."), null, new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward(), 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0), null, new AbstractC22403o.a(AbstractC16272a.f61976O4), null, null, false, false, null, null, new C11467b(AbstractC8693b.m21278l("Chat with coach"), enumC39333f2, new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward(), 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0), p712j91.Function1.m60318a(AbstractC15673b0.m43972A())), false, false, null, AbstractC18249c.m52574l(a.f36848w), null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 536313381, null);
        f36842m = c11474i13;
        C11474i c11474i14 = new C11474i(null, enumC22400l, null, AbstractC8693b.m21278l("Upgrade to WHOOP Life to Get Access Even Earlier"), AbstractC8693b.m21278l("A quick check-in with WHOOP Coach can help you learn how to meet or outperform recommendations."), null, new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward(), 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0), null, new AbstractC22403o.a(AbstractC16272a.f61976O4), null, null, false, false, null, null, new C11467b(AbstractC8693b.m21278l("Chat with coach"), enumC39333f2, new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward(), 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0), p712j91.Function1.m60318a(AbstractC15673b0.m43972A())), false, false, null, AbstractC18249c.m52574l(c.f36850w), null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 536313381, null);
        f36843n = c11474i14;
        C11474i c11474i15 = new C11474i(null, EnumC22400l.ACCESS_HOME_TILE, null, AbstractC8693b.m21278l("Waiting for Blood Pressure..."), AbstractC8693b.m21278l("Sync 3 readings within 15 days to continue with program setup."), null, new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward(), 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0), null, null, null, null, false, false, new C11475j(p712j91.Function1.m60318a(AbstractC15673b0.m43983F0()), 0.0f, 2, null), null, new C11467b(AbstractC8693b.m21278l("VIEW INSTRUCTIONS"), EnumC39333f.ACCENT_ONBOARDING_ACTION, new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward(), 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0), null, i14, defaultConstructorMarker), false, false, null, null, p712j91.Function1.m60318a(AbstractC15673b0.m44075z()), null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 535781157, null);
        f36844o = c11474i15;
        C11474i c11474i16 = new C11474i(null, null, null, AbstractC8693b.m21278l("Share the Advanced Labs experience"), AbstractC8693b.m21278l("Invite a friend to try Advanced Labs"), null, null, null, null, new AbstractC22403o.a(AbstractC16272a.f61976O4), null, false, false, null, null, new C11467b(AbstractC8693b.m21278l("INVITE"), enumC39333f, new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward(), 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0), null, 8, null), false, false, null, AbstractC18249c.m52574l(d.f36851w), null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 536313191, null);
        f36845p = c11474i16;
        TextResource textResourceM21278l7 = AbstractC8693b.m21278l("Holiday Gift: Upgrade to WHOOP Life");
        EnumC22400l enumC22400l2 = EnumC22400l.HOLIDAY_GIFT_UPGRADE;
        AbstractC22403o.a aVar3 = new AbstractC22403o.a(AbstractC16272a.f61976O4);
        float f13 = 2 * 8;
        f36846q = new C11474i(null, enumC22400l2, null, textResourceM21278l7, AbstractC8693b.m21278l("Limited-time cyber deal on your Life upgrade."), null, null, null, aVar3, null, null, false, false, new C11475j(p712j91.Function1.m60318a(AbstractC15673b0.m43994L()), 0.0f, 2, null), C22411w.f87680a.m64536b(), null, false, false, null, null, p712j91.Function1.m60318a(AbstractC15673b0.m43991J0()), null, 16 * 4, f13, f13, 0.0f, Float.NaN, null, null, 439262821, null);
        f36847r = AbstractC37056f.m118959K(c11474i, c11474i2, c11474i3, c11474i4, c11474i5, c11474i6, c11474i7, c11474i8, c11474i9, c11474i10, c11474i11, c11474i12, c11474i13, c11474i14, c11474i15, c11474i16);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00fd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:76:0x0149  */
    /* JADX WARN: Code duplicated, block: B:79:0x0154  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    public static final void m30786k(C11474i state, Modifier modifier, InterfaceC4339a interfaceC4339a, InterfaceC4339a onClick, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        InterfaceC4339a interfaceC4339a2;
        int i17;
        boolean z4;
        Modifier modifier3;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        Object objM87133R;
        float f13;
        InterfaceC11466a interfaceC11466aM30822k;
        C13825t c13825tM30800y;
        boolean zM87157i;
        Object objM87133R2;
        Object objM87133R3;
        int i18;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(144445907);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(state) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i13 & 3072) == 0) {
                    if (c28655q.m87157i(onClick)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i18;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i19 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C11132l(9);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q);
                    }
                    InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
                    if (state.getEnabled()) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.5f;
                    }
                    interfaceC11466aM30822k = state.getBorderInfo();
                    if (interfaceC11466aM30822k == null) {
                        c28655q.m87150e0(-368917616);
                        c28655q.m87173q(false);
                        c13825tM30800y = null;
                    } else {
                        c28655q.m87150e0(1373572753);
                        c13825tM30800y = m30800y(interfaceC11466aM30822k, (float) 1.5d, c28655q, 48);
                        c28655q.m87173q(false);
                    }
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier3);
                    C18027i c18027i = new C18027i(0);
                    zM87157i = c28655q.m87157i(state) | ((i15 & 7168) == 2048);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i || objM87133R2 == c28676v0) {
                        objM87133R2 = new C3603v(29, state, onClick);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a3 = interfaceC4339a4;
                    AbstractC12889b.m36263b(AbstractC34132o.m107879c(f13, AbstractC1092a.m3360e(modifierM3409f, interfaceC21083i, null, false, c18027i, (InterfaceC4339a) objM87133R2, 12)), state.getCornerRadius().m64090c(), C38072d.f163053a.m121949b(c28655q, 6).getTransparent(), c13825tM30800y, 0, AbstractC37817c.m121344e(48728566, c28655q, new C2032u(state, modifier3, interfaceC4339a3, onClick, 7)), c28655q, 1769472, 8);
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0555f(state, modifier3, interfaceC4339a3, onClick, i13, i14, 15);
                }
            }
            i15 |= 384;
            interfaceC4339a2 = interfaceC4339a;
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(onClick)) {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i18;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i19 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C11132l(9);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q);
                }
                InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R;
                if (state.getEnabled()) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.5f;
                }
                interfaceC11466aM30822k = state.getBorderInfo();
                if (interfaceC11466aM30822k == null) {
                    c28655q.m87150e0(-368917616);
                    c28655q.m87173q(false);
                    c13825tM30800y = null;
                } else {
                    c28655q.m87150e0(1373572753);
                    c13825tM30800y = m30800y(interfaceC11466aM30822k, (float) 1.5d, c28655q, 48);
                    c28655q.m87173q(false);
                }
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier3);
                C18027i c18027i2 = new C18027i(0);
                zM87157i = c28655q.m87157i(state) | ((i15 & 7168) == 2048);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R2 = new C3603v(29, state, onClick);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C3603v(29, state, onClick);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a3 = interfaceC4339a4;
                AbstractC12889b.m36263b(AbstractC34132o.m107879c(f13, AbstractC1092a.m3360e(modifierM3409f2, interfaceC21083i2, null, false, c18027i2, (InterfaceC4339a) objM87133R2, 12)), state.getCornerRadius().m64090c(), C38072d.f163053a.m121949b(c28655q, 6).getTransparent(), c13825tM30800y, 0, AbstractC37817c.m121344e(48728566, c28655q, new C2032u(state, modifier3, interfaceC4339a3, onClick, 7)), c28655q, 1769472, 8);
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0555f(state, modifier3, interfaceC4339a3, onClick, i13, i14, 15);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(onClick)) {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i18;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i19 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C11132l(9);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q);
                }
                InterfaceC21083i interfaceC21083i3 = (InterfaceC21083i) objM87133R;
                if (state.getEnabled()) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.5f;
                }
                interfaceC11466aM30822k = state.getBorderInfo();
                if (interfaceC11466aM30822k == null) {
                    c28655q.m87150e0(-368917616);
                    c28655q.m87173q(false);
                    c13825tM30800y = null;
                } else {
                    c28655q.m87150e0(1373572753);
                    c13825tM30800y = m30800y(interfaceC11466aM30822k, (float) 1.5d, c28655q, 48);
                    c28655q.m87173q(false);
                }
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, modifier3);
                C18027i c18027i3 = new C18027i(0);
                zM87157i = c28655q.m87157i(state) | ((i15 & 7168) == 2048);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R2 = new C3603v(29, state, onClick);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C3603v(29, state, onClick);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a3 = interfaceC4339a4;
                AbstractC12889b.m36263b(AbstractC34132o.m107879c(f13, AbstractC1092a.m3360e(modifierM3409f3, interfaceC21083i3, null, false, c18027i3, (InterfaceC4339a) objM87133R2, 12)), state.getCornerRadius().m64090c(), C38072d.f163053a.m121949b(c28655q, 6).getTransparent(), c13825tM30800y, 0, AbstractC37817c.m121344e(48728566, c28655q, new C2032u(state, modifier3, interfaceC4339a3, onClick, 7)), c28655q, 1769472, 8);
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0555f(state, modifier3, interfaceC4339a3, onClick, i13, i14, 15);
            }
        }
        i15 |= 384;
        interfaceC4339a2 = interfaceC4339a;
        if ((i13 & 3072) == 0) {
            if (c28655q.m87157i(onClick)) {
                i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i18;
        }
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i19 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C11132l(9);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i4 = (InterfaceC21083i) objM87133R;
            if (state.getEnabled()) {
                f13 = 1.0f;
            } else {
                f13 = 0.5f;
            }
            interfaceC11466aM30822k = state.getBorderInfo();
            if (interfaceC11466aM30822k == null) {
                c28655q.m87150e0(-368917616);
                c28655q.m87173q(false);
                c13825tM30800y = null;
            } else {
                c28655q.m87150e0(1373572753);
                c13825tM30800y = m30800y(interfaceC11466aM30822k, (float) 1.5d, c28655q, 48);
                c28655q.m87173q(false);
            }
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, modifier3);
            C18027i c18027i4 = new C18027i(0);
            zM87157i = c28655q.m87157i(state) | ((i15 & 7168) == 2048);
            objM87133R2 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R2 = new C3603v(29, state, onClick);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C3603v(29, state, onClick);
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC4339a3 = interfaceC4339a4;
            AbstractC12889b.m36263b(AbstractC34132o.m107879c(f13, AbstractC1092a.m3360e(modifierM3409f4, interfaceC21083i4, null, false, c18027i4, (InterfaceC4339a) objM87133R2, 12)), state.getCornerRadius().m64090c(), C38072d.f163053a.m121949b(c28655q, 6).getTransparent(), c13825tM30800y, 0, AbstractC37817c.m121344e(48728566, c28655q, new C2032u(state, modifier3, interfaceC4339a3, onClick, 7)), c28655q, 1769472, 8);
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0555f(state, modifier3, interfaceC4339a3, onClick, i13, i14, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m30787l() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m30788m(C11474i c11474i, InterfaceC4339a interfaceC4339a) {
        if (c11474i.getEnabled()) {
            interfaceC4339a.invoke();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m30789n(C11474i c11474i, Modifier modifier, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Composer composer, int i13) throws XmlPullParserException, IOException {
        ?? r10;
        C0209i c0209i;
        C0209i c0209i2;
        C1100b c1100b;
        C2314t c2314t;
        C0209i c0209i3;
        C0209i c0209i4;
        C28655q c28655q;
        boolean z4;
        AbstractC26165a abstractC26165aM64500i;
        C28655q c28655q2;
        C28676v0 c28676v0;
        C28655q c28655q3;
        boolean z13;
        boolean z14 = true;
        int i14 = 2;
        C28655q c28655q4 = (C28655q) composer;
        if (c28655q4.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC21430b interfaceC21430bM30819h = c11474i.getBackgroundGradient();
            AbstractC18247a c18250d = interfaceC21430bM30819h != null ? new C18250d(interfaceC21430bM30819h, 0.0f, i14, null) : c11474i.getBackgroundColor();
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM52565c = AbstractC18249c.m52565c(AbstractC1102d.m3409f(1.0f, c2314t2).mo3471e(!Float.isNaN(c11474i.getHeight()) ? AbstractC1102d.m3413j(c2314t2, c11474i.getHeight(), 0.0f, 2) : modifier), c18250d);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, modifierM52565c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q4, c0209i5, interfaceC39127r0M66763d);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q4, c0209i6, interfaceC28653p1M87165m);
            C0209i c0209i7 = C0217k.f732j;
            if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i7);
            }
            C0209i c0209i8 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q4, c0209i8, modifierM118962N);
            boolean zM30830s = c11474i.getEnabled();
            C1100b c1100b2 = C1100b.f4583a;
            if (zM30830s) {
                c28655q4.m87150e0(-563868045);
                AbstractC22403o abstractC22403oM30820i = c11474i.getBackgroundImg();
                if (abstractC22403oM30820i == null) {
                    c28655q4.m87150e0(-563876571);
                    c28655q4.m87173q(false);
                    abstractC26165aM64500i = null;
                    c0209i = c0209i7;
                    c0209i2 = c0209i8;
                    c1100b = c1100b2;
                    c28655q2 = c28655q4;
                } else {
                    c28655q4.m87150e0(-1265115556);
                    c1100b = c1100b2;
                    c0209i2 = c0209i8;
                    c0209i = c0209i7;
                    abstractC26165aM64500i = AbstractC22404p.m64500i(abstractC22403oM30820i, null, c11474i.getBackgroundImgBuilder(), c28655q4, 0, 1);
                    C28655q c28655q5 = c28655q4;
                    c28655q5.m87173q(false);
                    c28655q2 = c28655q5;
                }
                C28676v0 c28676v1 = C28635l.f115821a;
                if (abstractC26165aM64500i == null) {
                    c28655q2.m87150e0(-563753811);
                    c28655q2.m87173q(false);
                    c28676v0 = c28676v1;
                    c2314t = c2314t2;
                    c0209i3 = c0209i5;
                    c0209i4 = c0209i6;
                    c28655q3 = c28655q2;
                } else {
                    c28655q2.m87150e0(-563753810);
                    AbstractC17911t abstractC17911tM51483a = C17909s.m51483a(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(3004175640L)), new C17919x(AbstractC17918w0.m51515c(856691992))), 0.0f, 0.0f, 14);
                    AbstractC17911t abstractC17911tM30833v = c11474i.getImageOverlayBrush();
                    if (abstractC17911tM30833v != null) {
                        abstractC17911tM51483a = abstractC17911tM30833v;
                    }
                    Modifier modifierMo3401b = c1100b.mo3401b(c2314t2);
                    boolean zM87153g = c28655q2.m87153g(abstractC17911tM51483a);
                    Object objM87133R = c28655q2.m87133R();
                    if (zM87153g || objM87133R == c28676v1) {
                        objM87133R = new C4231h(abstractC17911tM51483a, 1);
                        c28655q2.m87172p0(objM87133R);
                    }
                    C28655q c28655q6 = c28655q2;
                    c28676v0 = c28676v1;
                    c2314t = c2314t2;
                    c0209i4 = c0209i6;
                    c0209i3 = c0209i5;
                    AbstractC29125c.m88522c(abstractC26165aM64500i, null, AbstractC1125a.m3479b(modifierMo3401b, (Function1) objM87133R), null, C39102j.f168199a, 0.0f, null, c28655q6, 24624, 104);
                    C28655q c28655q7 = c28655q6;
                    c28655q7.m87173q(false);
                    c28655q3 = c28655q7;
                }
                if (c11474i.getDismissible()) {
                    c28655q3.m87150e0(-562793678);
                    C38072d c38072d = C38072d.f163053a;
                    C27430e c27430eM107874S = AbstractC34132o.m107874S(c38072d.m121951d().getTinyIcons().getCross(), c28655q3, 6);
                    long jM125430y = c38072d.m121949b(c28655q3, 6).getBrandWhite();
                    Modifier modifierM3398t = AbstractC1099a.m3398t(c1100b.mo3400a(c2314t, C2299e.f9116y), 0.0f, 3 * 4, 2 * 8, 0.0f, 9);
                    boolean zM87153g2 = c28655q3.m87153g(interfaceC4339a);
                    Object objM87133R2 = c28655q3.m87133R();
                    if (zM87153g2 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C0343e(interfaceC4339a, 16);
                        c28655q3.m87172p0(objM87133R2);
                    }
                    AbstractC15005f3.m43108b(c27430eM107874S, null, AbstractC1092a.m3362g(modifierM3398t, false, null, null, (InterfaceC4339a) objM87133R2, 15), jM125430y, c28655q3, 48, 0);
                    z13 = false;
                    c28655q3.m87173q(false);
                } else {
                    z13 = false;
                    c28655q3.m87150e0(-562326074);
                    c28655q3.m87173q(false);
                }
                c28655q3.m87173q(z13);
                r10 = z13;
                c28655q = c28655q3;
            } else {
                z14 = true;
                r10 = 0;
                c0209i = c0209i7;
                c0209i2 = c0209i8;
                c1100b = c1100b2;
                c2314t = c2314t2;
                c0213j = c0213j;
                c0209i3 = c0209i5;
                c0209i4 = c0209i6;
                c28655q4.m87150e0(-562312186);
                c28655q4.m87173q(false);
                c28655q = c28655q4;
            }
            Modifier modifierMo3400a = c1100b.mo3400a(AbstractC1099a.m3388j(c2314t, EnumC22935a1.f90538x), C2299e.f9105H);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, r10);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3400a);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i3, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, modifierM118962N2);
            TextResource textResourceM30813E = c11474i.getTitle();
            C23285v0 c23285v0M30814F = c11474i.getTitleTextStyle();
            if (c23285v0M30814F == null) {
                c28655q.m87150e0(-1337579643);
                c23285v0M30814F = C38072d.f163053a.m121952e(c28655q, 6).getB1().getStyle();
                z4 = false;
            } else {
                z4 = false;
                c28655q.m87150e0(-1337581162);
            }
            c28655q.m87173q(z4);
            C23285v0 c23285v0 = c23285v0M30814F;
            TextResource textResourceM30811C = c11474i.getSupportText();
            C23285v0 c23285v0M30812D = c11474i.getSupportTextStyle();
            if (c23285v0M30812D == null) {
                c28655q.m87150e0(-1337574843);
                c23285v0M30812D = C38072d.f163053a.m121952e(c28655q, 6).getB2().getStyle();
            } else {
                c28655q.m87150e0(-1337576424);
            }
            c28655q.m87173q(z4);
            C28655q c28655q8 = c28655q;
            m30794s(textResourceM30813E, c23285v0, textResourceM30811C, c23285v0M30812D, c11474i.getLeftIcon(), c11474i.getStartImageUrl(), c11474i.getEndImageUrl(), c11474i.getStartImageSize(), c11474i.getStartImagePadding(), c11474i.getContentVerticalPadding(), c11474i.getContentEndPadding(), !c11474i.getEnabled(), c11474i.getIsComplete(), c11474i.getCtaButtonInformation(), c11474i.getShowCaretIcon(), null, interfaceC4339a2, c28655q8, 0, 0, 32768);
            boolean z15 = z14;
            c28655q8.m87173q(z15);
            c28655q8.m87173q(z15);
        } else {
            c28655q4.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C14018g m30790o(AbstractC17911t abstractC17911t, C14015d drawWithCache) {
        AbstractC22676k.m65750j(drawWithCache, "$this$drawWithCache");
        return drawWithCache.m39910a(new C4231h(abstractC17911t, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m30791p(AbstractC17911t abstractC17911t, InterfaceC22129c onDrawWithContent) {
        AbstractC22676k.m65750j(onDrawWithContent, "$this$onDrawWithContent");
        ((C0238p0) onDrawWithContent).m728a();
        InterfaceC22131e.m63385u(onDrawWithContent, abstractC17911t, 0L, 0L, 0.0f, null, 24, 62);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m30792q(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m30793r(C11474i c11474i, Modifier modifier, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, int i14, Composer composer, int i15) {
        m30786k(c11474i, modifier, interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x013c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0144  */
    /* JADX WARN: Code duplicated, block: B:108:0x014a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0154  */
    /* JADX WARN: Code duplicated, block: B:113:0x0157  */
    /* JADX WARN: Code duplicated, block: B:115:0x015d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0161  */
    /* JADX WARN: Code duplicated, block: B:118:0x0166  */
    /* JADX WARN: Code duplicated, block: B:120:0x016c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0171  */
    /* JADX WARN: Code duplicated, block: B:125:0x0177  */
    /* JADX WARN: Code duplicated, block: B:128:0x017e  */
    /* JADX WARN: Code duplicated, block: B:132:0x0186  */
    /* JADX WARN: Code duplicated, block: B:134:0x018c  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:156:0x01db  */
    /* JADX WARN: Code duplicated, block: B:159:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:160:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:162:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:163:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:165:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:166:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:169:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:172:0x0203  */
    /* JADX WARN: Code duplicated, block: B:174:0x0209  */
    /* JADX WARN: Code duplicated, block: B:177:0x0221  */
    /* JADX WARN: Code duplicated, block: B:180:0x023b  */
    /* JADX WARN: Code duplicated, block: B:181:0x0242  */
    /* JADX WARN: Code duplicated, block: B:184:0x0276  */
    /* JADX WARN: Code duplicated, block: B:185:0x027a  */
    /* JADX WARN: Code duplicated, block: B:190:0x029b  */
    /* JADX WARN: Code duplicated, block: B:193:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:194:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:196:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:197:0x034f  */
    /* JADX WARN: Code duplicated, block: B:200:0x0365  */
    /* JADX WARN: Code duplicated, block: B:201:0x0367  */
    /* JADX WARN: Code duplicated, block: B:203:0x036a  */
    /* JADX WARN: Code duplicated, block: B:206:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:207:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:212:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:215:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:216:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:221:0x040a  */
    /* JADX WARN: Code duplicated, block: B:224:0x0465  */
    /* JADX WARN: Code duplicated, block: B:225:0x0467  */
    /* JADX WARN: Code duplicated, block: B:227:0x046a  */
    /* JADX WARN: Code duplicated, block: B:228:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:230:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:232:0x04db  */
    /* JADX WARN: Code duplicated, block: B:234:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:235:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:242:0x050a  */
    /* JADX WARN: Code duplicated, block: B:246:0x0540  */
    /* JADX WARN: Code duplicated, block: B:248:0x058e  */
    /* JADX WARN: Code duplicated, block: B:251:0x0594  */
    /* JADX WARN: Code duplicated, block: B:260:0x0651  */
    /* JADX WARN: Code duplicated, block: B:263:0x0668  */
    /* JADX WARN: Code duplicated, block: B:265:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00da  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:80:0x0102  */
    /* JADX WARN: Code duplicated, block: B:84:0x010e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0114  */
    /* JADX WARN: Code duplicated, block: B:87:0x0117  */
    /* JADX WARN: Code duplicated, block: B:91:0x0121  */
    /* JADX WARN: Code duplicated, block: B:93:0x0127  */
    /* JADX WARN: Code duplicated, block: B:94:0x012a  */
    /* JADX WARN: Code duplicated, block: B:96:0x012f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0135  */
    /* JADX INFO: renamed from: s */
    private static final void m30794s(final TextResource textResource, final C23285v0 c23285v0, TextResource textResource2, final C23285v0 c23285v1, C39274g c39274g, AbstractC22403o abstractC22403o, AbstractC22403o abstractC22403o2, final float f13, final float f14, final float f15, final float f16, final boolean z4, final boolean z13, C11467b c11467b, final boolean z14, Function1 function1, final InterfaceC4339a interfaceC4339a, Composer composer, final int i13, final int i14, final int i15) {
        int i16;
        TextResource textResourceM21267a;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean zM87157i;
        int i29;
        boolean z15;
        final C39274g c39274g2;
        final AbstractC22403o abstractC22403o3;
        final Function1 function2;
        C28655q c28655q;
        final TextResource textResource3;
        final AbstractC22403o abstractC22403o4;
        final C11467b c11467b2;
        C28677v1 c28677v1M87180u;
        int i34;
        C28676v0 c28676v0;
        C39274g c39274g3;
        AbstractC22403o abstractC22403o5;
        AbstractC22403o abstractC22403o6;
        Function1 function3;
        int i35;
        AbstractC22403o abstractC22403o7;
        C11467b c11467b3;
        C39274g c39274g4;
        AbstractC22403o abstractC22403o8;
        Object objM87133R;
        C39274g c39274g5;
        AbstractC22403o abstractC22403o9;
        C2314t c2314t;
        C11467b c11467b4;
        float f17;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C39077b1 c39077b1;
        AbstractC22403o abstractC22403o10;
        C2314t c2314t2;
        boolean z16;
        float f18;
        int iHashCode2;
        int iHashCode3;
        float f19;
        C38072d c38072d;
        String strM21274h;
        boolean z17;
        float f24;
        boolean z18;
        boolean z19;
        Object objM87133R2;
        AbstractC22403o abstractC22403o11;
        int i36;
        int i37;
        int i38;
        int i39;
        int i44;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1606425372);
        if ((i13 & 6) == 0) {
            i16 = (c28655q2.m87153g(textResource) ? 4 : 2) | i13;
        } else {
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= c28655q2.m87153g(c23285v0) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            if ((i15 & 4) == 0) {
                textResourceM21267a = textResource2;
                if (c28655q2.m87153g(textResourceM21267a)) {
                    i44 = 256;
                }
                i16 |= i44;
            } else {
                textResourceM21267a = textResource2;
            }
            i44 = 128;
            i16 |= i44;
        } else {
            textResourceM21267a = textResource2;
        }
        int i45 = i13 & 3072;
        int i46 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i45 == 0) {
            i16 |= c28655q2.m87153g(c23285v1) ? 2048 : 1024;
        }
        int i47 = i15 & 16;
        int i48 = DfuBaseService.ERROR_CONNECTION_MASK;
        if (i47 == 0) {
            if ((i13 & 24576) == 0) {
                i16 |= c28655q2.m87153g(c39274g) ? 16384 : 8192;
            }
            i17 = i15 & 32;
            if (i17 != 0) {
                i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87153g(abstractC22403o)) {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i18;
            }
            i19 = i15 & 64;
            if (i19 != 0) {
                i16 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c28655q2.m87153g(abstractC22403o2)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i16 |= i24;
            }
            if ((i13 & 12582912) == 0) {
                if (c28655q2.m87147d(f13)) {
                    i39 = 8388608;
                } else {
                    i39 = 4194304;
                }
                i16 |= i39;
            }
            if ((i13 & 100663296) == 0) {
                if (c28655q2.m87147d(f14)) {
                    i38 = 67108864;
                } else {
                    i38 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i38;
            }
            if ((i13 & 805306368) == 0) {
                if (c28655q2.m87147d(f15)) {
                    i37 = 536870912;
                } else {
                    i37 = 268435456;
                }
                i16 |= i37;
            }
            if ((i14 & 6) == 0) {
                if (c28655q2.m87147d(f16)) {
                    i36 = 4;
                } else {
                    i36 = 2;
                }
                i25 = i14 | i36;
            } else {
                i25 = i14;
            }
            if ((i14 & 48) == 0) {
                i25 |= c28655q2.m87155h(z4) ? 32 : 16;
            }
            if ((i14 & 384) == 0) {
                i25 |= c28655q2.m87155h(z13) ? 256 : 128;
            }
            i26 = i25;
            i27 = i15 & DfuBaseService.ERROR_REMOTE_MASK;
            if (i27 != 0) {
                i28 = i26 | 3072;
            } else if ((i14 & 3072) == 0) {
                if ((i14 & 4096) == 0) {
                    zM87157i = c28655q2.m87153g(c11467b);
                } else {
                    zM87157i = c28655q2.m87157i(c11467b);
                }
                if (zM87157i) {
                    i46 = 2048;
                }
                i28 = i26 | i46;
            } else {
                i28 = i26;
            }
            if ((i14 & 24576) == 0) {
                if (!c28655q2.m87155h(z14)) {
                    i48 = 8192;
                }
                i28 |= i48;
            }
            if ((i14 & 1572864) == 0) {
                i28 |= c28655q2.m87157i(interfaceC4339a) ? 1048576 : 524288;
            }
            i29 = i28;
            if ((306783379 & i16) == 306783378 || (i29 & 533651) != 533650) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q2.m87135U(i16 & 1, z15)) {
                c28655q2.m87140Z();
                i34 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i34 != 0 || c28655q2.m87118C()) {
                    if ((i15 & 4) != 0) {
                        i16 &= -897;
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    if (i47 != 0) {
                        c39274g3 = null;
                    } else {
                        c39274g3 = c39274g;
                    }
                    if (i17 != 0) {
                        abstractC22403o5 = null;
                    } else {
                        abstractC22403o5 = abstractC22403o;
                    }
                    if (i19 != 0) {
                        abstractC22403o6 = null;
                    } else {
                        abstractC22403o6 = abstractC22403o2;
                    }
                    C11467b c11467b5 = i27 == 0 ? c11467b : null;
                    if ((32768 & i15) != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C9779c(29);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function3 = (Function1) objM87133R;
                    } else {
                        function3 = function1;
                    }
                    i35 = i16;
                    abstractC22403o7 = abstractC22403o6;
                    c11467b3 = c11467b5;
                    c39274g4 = c39274g3;
                    abstractC22403o8 = abstractC22403o5;
                } else {
                    c28655q2.m87138X();
                    if ((i15 & 4) != 0) {
                        i16 &= -897;
                    }
                    c39274g4 = c39274g;
                    abstractC22403o8 = abstractC22403o;
                    abstractC22403o7 = abstractC22403o2;
                    function3 = function1;
                    i35 = i16;
                    c11467b3 = c11467b;
                }
                c28655q2.m87175r();
                c39274g5 = c39274g4;
                EnumC22935a1 enumC22935a1 = EnumC22935a1.f90538x;
                abstractC22403o9 = abstractC22403o7;
                c2314t = C2314t.f9131w;
                Modifier modifierM3388j = AbstractC1099a.m3388j(c2314t, enumC22935a1);
                c11467b4 = c11467b3;
                Function1 function4 = function3;
                if (abstractC22403o9 != null) {
                    f17 = 0 * 8;
                } else {
                    f17 = f16;
                }
                Modifier modifierM3398t = AbstractC1099a.m3398t(modifierM3388j, 0.0f, f15, f17, f15, 1);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3398t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                c39077b1 = C39102j.f168200b;
                if (abstractC22403o8 != null) {
                    c28655q2.m87150e0(581271212);
                    abstractC22403o10 = abstractC22403o8;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403o8, null, null, c28655q2, (i35 >> 15) & 14, 3), null, AbstractC1099a.m3398t(AbstractC1102d.m3419p(f13, c2314t), f14, 0.0f, 0.0f, 0.0f, 14), null, c39077b1, 0.0f, null, c28655q2, 24624, 104);
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                    c2314t2 = c2314t;
                } else {
                    abstractC22403o10 = abstractC22403o8;
                    if (c39274g5 != null) {
                        c28655q2.m87150e0(581618288);
                        c2314t2 = c2314t;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c39274g5.getIcon(), c28655q2, 6), AbstractC8693b.m21274h(c39274g5.getContentDescription(), c28655q2, 0), AbstractC1102d.m3419p(4 * 6, AbstractC1099a.m3398t(c2314t, 2 * 8, 0.0f, 0.0f, 0.0f, 14)), C38072d.f163053a.m121949b(c28655q2, 6).getWhite50(), c28655q2, 384, 0);
                        c28655q2.m87173q(false);
                    } else {
                        c2314t2 = c2314t;
                        c28655q2.m87150e0(581973858);
                        c28655q2.m87173q(false);
                    }
                }
                if (1.0f > 0.0d) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (!z16) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                f18 = (float) 0.5d;
                float f25 = 8;
                Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1099a.m3388j(new LayoutWeightElement(1.0f, true), enumC22935a1), f18 * f25, 0);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9117z, false);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3395q);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 48);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, c2314t2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N3);
                f19 = ((float) 1.5d) * f25;
                Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t2, f19, 0.0f, 2);
                String strM21274h2 = AbstractC8693b.m21274h(textResource, c28655q2, i35 & 14);
                c38072d = C38072d.f163053a;
                AbstractC15011f9.m43114b(strM21274h2, modifierM3396r, c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c23285v0, c28655q2, 48, (i35 << 15) & 3670016, 65528);
                strM21274h = AbstractC8693b.m21274h(textResourceM21267a, c28655q2, (i35 >> 6) & 14);
                if (strM21274h.length() > 0) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (z17) {
                    c28655q2.m87150e0(-902693873);
                    f24 = f19;
                    AbstractC15011f9.m43114b(strM21274h, AbstractC1099a.m3398t(c2314t2, f19, f18 * 4, 0.0f, 0.0f, 12), c38072d.m121949b(c28655q2, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 3, 0, null, c23285v1, c28655q2, 0, ((i35 << 9) & 3670016) | 3072, 57336);
                    z18 = false;
                    c28655q2.m87173q(false);
                } else {
                    f24 = f19;
                    z18 = false;
                    c28655q2.m87150e0(-902377146);
                    c28655q2.m87173q(false);
                }
                if (c11467b4 == null) {
                    c28655q2.m87150e0(-902327175);
                    c28655q2.m87173q(z18);
                } else {
                    c28655q2.m87150e0(-902327174);
                    EnumC27269n0 enumC27269n0 = EnumC27269n0.TextSmall;
                    TextResource textResourceM30767f = c11467b4.getText();
                    C39274g c39274gM30766e = c11467b4.getIcon();
                    InterfaceC39332e interfaceC39332eM30765d = c11467b4.getColor();
                    InterfaceC21430b interfaceC21430bM30764c = c11467b4.getBrush();
                    if ((i29 & 3670016) == 1048576) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objM87133R2 = c28655q2.m87133R();
                    if (z19 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C2161b(interfaceC4339a, 12);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC27265l0.m82217i(null, enumC27269n0, textResourceM30767f, null, c39274gM30766e, false, interfaceC39332eM30765d, interfaceC21430bM30764c, false, false, null, null, (Function1) objM87133R2, c28655q2, 48, 0, 3881);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                if (abstractC22403o9 != null) {
                    c28655q2.m87150e0(583486937);
                    abstractC22403o11 = abstractC22403o9;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403o9, null, null, c28655q2, (i35 >> 18) & 14, 3), null, AbstractC1099a.m3398t(AbstractC1102d.m3419p(18 * 4, c2314t2), 0.0f, 0.0f, f24, 0.0f, 11), null, c39077b1, 0.0f, null, c28655q2, 25008, 104);
                    c28655q2.m87173q(false);
                } else {
                    abstractC22403o11 = abstractC22403o9;
                    if (c11467b4 == null || !z14) {
                        c28655q2.m87150e0(583835904);
                        c28655q2.m87173q(false);
                    } else if (z4) {
                        c28655q2.m87150e0(1958498108);
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getVarious().getLocked(), c28655q2, 6), "locked", AbstractC1102d.m3419p(6 * 4, c2314t2), c38072d.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 432, 0);
                        c28655q2.m87173q(false);
                    } else if (z13) {
                        c28655q2.m87150e0(1958507011);
                        AbstractC29125c.m88522c(AbstractC29125c.m88500I(AbstractC16272a.f62001T, c28655q2, 0), "complete", AbstractC1102d.m3419p(7 * 4, c2314t2), null, null, 0.0f, null, c28655q2, 432, 120);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(1958514024);
                        float f26 = 4;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getTinyIcons().getForwardArrow(), c28655q2, 6), "incomplete", AbstractC1102d.m3419p(f26 * f26, c2314t2), c38072d.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 432, 0);
                        c28655q2.m87173q(false);
                    }
                }
                c28655q2.m87173q(true);
                c39274g2 = c39274g5;
                function2 = function4;
                abstractC22403o3 = abstractC22403o11;
                c28655q = c28655q2;
                textResource3 = textResourceM21267a;
                abstractC22403o4 = abstractC22403o10;
                c11467b2 = c11467b4;
            } else {
                c28655q2.m87138X();
                c39274g2 = c39274g;
                abstractC22403o3 = abstractC22403o2;
                function2 = function1;
                c28655q = c28655q2;
                textResource3 = textResourceM21267a;
                abstractC22403o4 = abstractC22403o;
                c11467b2 = c11467b;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: d11.e
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC11471f.m30797v(textResource, c23285v0, textResource3, c23285v1, c39274g2, abstractC22403o4, abstractC22403o3, f13, f14, f15, f16, z4, z13, c11467b2, z14, function2, interfaceC4339a, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 24576;
        i17 = i15 & 32;
        if (i17 != 0) {
            i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q2.m87153g(abstractC22403o)) {
                i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i16 |= i18;
        }
        i19 = i15 & 64;
        if (i19 != 0) {
            i16 |= 1572864;
        } else if ((i13 & 1572864) == 0) {
            if (c28655q2.m87153g(abstractC22403o2)) {
                i24 = 1048576;
            } else {
                i24 = 524288;
            }
            i16 |= i24;
        }
        if ((i13 & 12582912) == 0) {
            if (c28655q2.m87147d(f13)) {
                i39 = 8388608;
            } else {
                i39 = 4194304;
            }
            i16 |= i39;
        }
        if ((i13 & 100663296) == 0) {
            if (c28655q2.m87147d(f14)) {
                i38 = 67108864;
            } else {
                i38 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i16 |= i38;
        }
        if ((i13 & 805306368) == 0) {
            if (c28655q2.m87147d(f15)) {
                i37 = 536870912;
            } else {
                i37 = 268435456;
            }
            i16 |= i37;
        }
        if ((i14 & 6) == 0) {
            if (c28655q2.m87147d(f16)) {
                i36 = 4;
            } else {
                i36 = 2;
            }
            i25 = i14 | i36;
        } else {
            i25 = i14;
        }
        if ((i14 & 48) == 0) {
            i25 |= c28655q2.m87155h(z4) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i25 |= c28655q2.m87155h(z13) ? 256 : 128;
        }
        i26 = i25;
        i27 = i15 & DfuBaseService.ERROR_REMOTE_MASK;
        if (i27 != 0) {
            i28 = i26 | 3072;
        } else if ((i14 & 3072) == 0) {
            if ((i14 & 4096) == 0) {
                zM87157i = c28655q2.m87153g(c11467b);
            } else {
                zM87157i = c28655q2.m87157i(c11467b);
            }
            if (zM87157i) {
                i46 = 2048;
            }
            i28 = i26 | i46;
        } else {
            i28 = i26;
        }
        if ((i14 & 24576) == 0) {
            if (!c28655q2.m87155h(z14)) {
                i48 = 8192;
            }
            i28 |= i48;
        }
        if ((i14 & 1572864) == 0) {
            i28 |= c28655q2.m87157i(interfaceC4339a) ? 1048576 : 524288;
        }
        i29 = i28;
        if ((306783379 & i16) == 306783378) {
            z15 = true;
        } else {
            z15 = true;
        }
        if (c28655q2.m87135U(i16 & 1, z15)) {
            c28655q2.m87140Z();
            i34 = i13 & 1;
            c28676v0 = C28635l.f115821a;
            if (i34 != 0) {
                if ((i15 & 4) != 0) {
                    i16 &= -897;
                    textResourceM21267a = AbstractC8693b.m21267a();
                }
                if (i47 != 0) {
                    c39274g3 = null;
                } else {
                    c39274g3 = c39274g;
                }
                if (i17 != 0) {
                    abstractC22403o5 = null;
                } else {
                    abstractC22403o5 = abstractC22403o;
                }
                if (i19 != 0) {
                    abstractC22403o6 = null;
                } else {
                    abstractC22403o6 = abstractC22403o2;
                }
                if (i27 == 0) {
                }
                if ((32768 & i15) != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C9779c(29);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function3 = (Function1) objM87133R;
                } else {
                    function3 = function1;
                }
                i35 = i16;
                abstractC22403o7 = abstractC22403o6;
                c11467b3 = c11467b5;
                c39274g4 = c39274g3;
                abstractC22403o8 = abstractC22403o5;
            } else {
                if ((i15 & 4) != 0) {
                    i16 &= -897;
                    textResourceM21267a = AbstractC8693b.m21267a();
                }
                if (i47 != 0) {
                    c39274g3 = null;
                } else {
                    c39274g3 = c39274g;
                }
                if (i17 != 0) {
                    abstractC22403o5 = null;
                } else {
                    abstractC22403o5 = abstractC22403o;
                }
                if (i19 != 0) {
                    abstractC22403o6 = null;
                } else {
                    abstractC22403o6 = abstractC22403o2;
                }
                if (i27 == 0) {
                }
                if ((32768 & i15) != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C9779c(29);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function3 = (Function1) objM87133R;
                } else {
                    function3 = function1;
                }
                i35 = i16;
                abstractC22403o7 = abstractC22403o6;
                c11467b3 = c11467b5;
                c39274g4 = c39274g3;
                abstractC22403o8 = abstractC22403o5;
            }
            c28655q2.m87175r();
            c39274g5 = c39274g4;
            EnumC22935a1 enumC22935a2 = EnumC22935a1.f90538x;
            abstractC22403o9 = abstractC22403o7;
            c2314t = C2314t.f9131w;
            Modifier modifierM3388j2 = AbstractC1099a.m3388j(c2314t, enumC22935a2);
            c11467b4 = c11467b3;
            Function1 function5 = function3;
            if (abstractC22403o9 != null) {
                f17 = 0 * 8;
            } else {
                f17 = f16;
            }
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(modifierM3388j2, 0.0f, f15, f17, f15, 1);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3398t2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i5, c22994r1M66759a2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N4);
            c39077b1 = C39102j.f168200b;
            if (abstractC22403o8 != null) {
                c28655q2.m87150e0(581271212);
                abstractC22403o10 = abstractC22403o8;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403o8, null, null, c28655q2, (i35 >> 15) & 14, 3), null, AbstractC1099a.m3398t(AbstractC1102d.m3419p(f13, c2314t), f14, 0.0f, 0.0f, 0.0f, 14), null, c39077b1, 0.0f, null, c28655q2, 24624, 104);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
                c2314t2 = c2314t;
            } else {
                abstractC22403o10 = abstractC22403o8;
                if (c39274g5 != null) {
                    c28655q2.m87150e0(581618288);
                    c2314t2 = c2314t;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c39274g5.getIcon(), c28655q2, 6), AbstractC8693b.m21274h(c39274g5.getContentDescription(), c28655q2, 0), AbstractC1102d.m3419p(4 * 6, AbstractC1099a.m3398t(c2314t, 2 * 8, 0.0f, 0.0f, 0.0f, 14)), C38072d.f163053a.m121949b(c28655q2, 6).getWhite50(), c28655q2, 384, 0);
                    c28655q2.m87173q(false);
                } else {
                    c2314t2 = c2314t;
                    c28655q2.m87150e0(581973858);
                    c28655q2.m87173q(false);
                }
            }
            if (1.0f > 0.0d) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (!z16) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            f18 = (float) 0.5d;
            float f27 = 8;
            Modifier modifierM3395q2 = AbstractC1099a.m3395q(AbstractC1099a.m3388j(new LayoutWeightElement(1.0f, true), enumC22935a2), f18 * f27, 0);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9117z, false);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3395q2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m5);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N5);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 48);
            iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, c2314t2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m6);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N6);
            f19 = ((float) 1.5d) * f27;
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t2, f19, 0.0f, 2);
            String strM21274h3 = AbstractC8693b.m21274h(textResource, c28655q2, i35 & 14);
            c38072d = C38072d.f163053a;
            AbstractC15011f9.m43114b(strM21274h3, modifierM3396r2, c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c23285v0, c28655q2, 48, (i35 << 15) & 3670016, 65528);
            strM21274h = AbstractC8693b.m21274h(textResourceM21267a, c28655q2, (i35 >> 6) & 14);
            if (strM21274h.length() > 0) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                c28655q2.m87150e0(-902693873);
                f24 = f19;
                AbstractC15011f9.m43114b(strM21274h, AbstractC1099a.m3398t(c2314t2, f19, f18 * 4, 0.0f, 0.0f, 12), c38072d.m121949b(c28655q2, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 3, 0, null, c23285v1, c28655q2, 0, ((i35 << 9) & 3670016) | 3072, 57336);
                z18 = false;
                c28655q2.m87173q(false);
            } else {
                f24 = f19;
                z18 = false;
                c28655q2.m87150e0(-902377146);
                c28655q2.m87173q(false);
            }
            if (c11467b4 == null) {
                c28655q2.m87150e0(-902327175);
                c28655q2.m87173q(z18);
            } else {
                c28655q2.m87150e0(-902327174);
                EnumC27269n0 enumC27269n1 = EnumC27269n0.TextSmall;
                TextResource textResourceM30767f2 = c11467b4.getText();
                C39274g c39274gM30766e2 = c11467b4.getIcon();
                InterfaceC39332e interfaceC39332eM30765d2 = c11467b4.getColor();
                InterfaceC21430b interfaceC21430bM30764c2 = c11467b4.getBrush();
                if ((i29 & 3670016) == 1048576) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objM87133R2 = c28655q2.m87133R();
                if (z19) {
                    objM87133R2 = new C2161b(interfaceC4339a, 12);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C2161b(interfaceC4339a, 12);
                    c28655q2.m87172p0(objM87133R2);
                }
                AbstractC27265l0.m82217i(null, enumC27269n1, textResourceM30767f2, null, c39274gM30766e2, false, interfaceC39332eM30765d2, interfaceC21430bM30764c2, false, false, null, null, (Function1) objM87133R2, c28655q2, 48, 0, 3881);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            c28655q2.m87173q(true);
            if (abstractC22403o9 != null) {
                c28655q2.m87150e0(583486937);
                abstractC22403o11 = abstractC22403o9;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403o9, null, null, c28655q2, (i35 >> 18) & 14, 3), null, AbstractC1099a.m3398t(AbstractC1102d.m3419p(18 * 4, c2314t2), 0.0f, 0.0f, f24, 0.0f, 11), null, c39077b1, 0.0f, null, c28655q2, 25008, 104);
                c28655q2.m87173q(false);
            } else {
                abstractC22403o11 = abstractC22403o9;
                if (c11467b4 == null) {
                    c28655q2.m87150e0(583835904);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(583835904);
                    c28655q2.m87173q(false);
                }
            }
            c28655q2.m87173q(true);
            c39274g2 = c39274g5;
            function2 = function5;
            abstractC22403o3 = abstractC22403o11;
            c28655q = c28655q2;
            textResource3 = textResourceM21267a;
            abstractC22403o4 = abstractC22403o10;
            c11467b2 = c11467b4;
        } else {
            c28655q2.m87138X();
            c39274g2 = c39274g;
            abstractC22403o3 = abstractC22403o2;
            function2 = function1;
            c28655q = c28655q2;
            textResource3 = textResourceM21267a;
            abstractC22403o4 = abstractC22403o;
            c11467b2 = c11467b;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: d11.e
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC11471f.m30797v(textResource, c23285v0, textResource3, c23285v1, c39274g2, abstractC22403o4, abstractC22403o3, f13, f14, f15, f16, z4, z13, c11467b2, z14, function2, interfaceC4339a, i13, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m30795t(C25540h c25540h) {
        AbstractC22676k.m65750j(c25540h, "<this>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m30796u(InterfaceC4339a interfaceC4339a, Object it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m30797v(TextResource textResource, C23285v0 c23285v0, TextResource textResource2, C23285v0 c23285v1, C39274g c39274g, AbstractC22403o abstractC22403o, AbstractC22403o abstractC22403o2, float f13, float f14, float f15, float f16, boolean z4, boolean z13, C11467b c11467b, boolean z14, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, int i14, int i15, Composer composer, int i16) {
        m30794s(textResource, c23285v0, textResource2, c23285v1, c39274g, abstractC22403o, abstractC22403o2, f13, f14, f15, f16, z4, z13, c11467b, z14, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    public static final List<C11474i> m30798w() {
        return f36847r;
    }

    /* JADX INFO: renamed from: x */
    public static final C13825t m30799x(InterfaceC11466a interfaceC11466a, Composer composer, int i13) {
        AbstractC22676k.m65750j(interfaceC11466a, "<this>");
        if (interfaceC11466a instanceof C11476k) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-638324690);
            C11476k c11476k = (C11476k) interfaceC11466a;
            C13825t c13825tM48880a = AbstractC17269i.m48880a(c11476k.getBorderWidth(), c11476k.getColor().mo134584toComposableColorWaAFU9c(c28655q, 0));
            c28655q.m87173q(false);
            return c13825tM48880a;
        }
        if (!(interfaceC11466a instanceof C11475j)) {
            throw AbstractC11895b.m32003v(-638325985, (C28655q) composer, false);
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(-638321682);
        C11475j c11475j = (C11475j) interfaceC11466a;
        C13825t c13825t = new C13825t(c11475j.getBorderWidth(), c11475j.getBrush().mo60316a(c28655q2, 0));
        c28655q2.m87173q(false);
        return c13825t;
    }

    /* JADX INFO: renamed from: y */
    public static final C13825t m30800y(InterfaceC11466a toBorderStroke, float f13, Composer composer, int i13) {
        AbstractC22676k.m65750j(toBorderStroke, "$this$toBorderStroke");
        if (toBorderStroke instanceof C11476k) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-838217553);
            C13825t c13825tM48880a = AbstractC17269i.m48880a(f13, ((C11476k) toBorderStroke).getColor().mo134584toComposableColorWaAFU9c(c28655q, 0));
            c28655q.m87173q(false);
            return c13825tM48880a;
        }
        if (!(toBorderStroke instanceof C11475j)) {
            throw AbstractC11895b.m32003v(-838218859, (C28655q) composer, false);
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(-838214897);
        C13825t c13825t = new C13825t(f13, ((C11475j) toBorderStroke).getBrush().mo60316a(c28655q2, 0));
        c28655q2.m87173q(false);
        return c13825t;
    }
}
