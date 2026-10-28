package xi2;

import ad3.AbstractC0757c;
import am2.C1019g0;
import android.content.Context;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b90.C2880b;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.design.models.modal.DecodedGenericInteraction;
import com.whoop.design.models.modal.GenericInteractionDecoderKt;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.WhoopShareScreenModel;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.service.network.model.UserSessionDto;
import ej1.C13258u;
import gb1.AbstractC15673b0;
import gb1.AbstractC15674c;
import gv1.AbstractC16227a;
import gv1.AbstractC16241o;
import gv1.AbstractC16242p;
import gv1.InterfaceC16239m;
import gy0.AbstractC16272a;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import h01.C16534a0;
import i51.AbstractC18109f;
import i51.AbstractC18111h;
import i51.C18112i;
import i51.EnumC18110g;
import j02.C21173v0;
import j11.AbstractC21211n;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import l83.InterfaceC23462h;
import live.hms.video.utils.HMSConstantsKt;
import m83.AbstractC25265s;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import nw0.C27198e;
import ny0.C27256h;
import ny0.EnumC27243c;
import oi2.AbstractC27950a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p712j91.InterfaceC21430b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33191j1;
import p736sz0.C33194k1;
import p745y81.EnumC39333f;
import pf.AbstractC29125c;
import q71.AbstractC30015f;
import q71.C30011b;
import q71.C30012c;
import q71.C30014e;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s21.C32078a;
import s21.C32085h;
import s21.EnumC32086i;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import si2.InterfaceC32548b;
import ti2.AbstractC33856c;
import ti2.C33854a;
import ti2.C33860g;
import ti2.C33861h;
import ti2.InterfaceC33858e;
import tr2.InterfaceC34116n;
import u21.C34484d;
import u21.C34485e;
import ui2.C35022c;
import ui2.EnumC35021b;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import v90.C35813e;
import w01.C36681f;
import wb3.AbstractC37056f;
import x81.C38072d;
import xa0.C38136a;
import xa1.C38138a;

/* JADX INFO: renamed from: xi2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u008b\u0001\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001f\u0010 \"\u001b\u0010%\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\" \u0010+\u001a\b\u0012\u0004\u0012\u00020\u001c0&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\" \u0010.\u001a\b\u0012\u0004\u0012\u00020\u001c0&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010*\" \u00101\u001a\b\u0012\u0004\u0012\u00020\u001c0&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b0\u0010*\" \u00105\u001a\b\u0012\u0004\u0012\u0002020&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u0010(\u001a\u0004\b4\u0010*\" \u00108\u001a\b\u0012\u0004\u0012\u00020\u001c0&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u0010(\u001a\u0004\b7\u0010*¨\u00069"}, m65681d2 = {"Lti2/g;", "viewState", "Lad3/c;", "interactionJson", "Lkotlin/Function1;", "Lti2/e;", "Ll83/a0;", "onViewEvent", "Lsi2/b;", "onNavigationEvent", "Lm91/p;", "itemFactory", "Loi2/a;", "onAnalyticsEvent", "Lgv1/m;", "onLottieTesterOverrideViewEvent", "Ltr2/n;", "logger", "t", "(Lti2/g;Lad3/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lm91/p;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ltr2/n;Landroidx/compose/runtime/Composer;II)V", "Lui2/c;", "data", "E", "(Lui2/c;Lti2/g;Landroidx/compose/runtime/Composer;I)V", "Lti2/g$a;", "onEvent", "p", "(Lti2/g$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lm91/u;", "item", "", "G", "(Lm91/u;)I", "a", "Ll83/h;", "getPreviewInteractionJson", "()Lad3/c;", "previewInteractionJson", "", "b", "Ljava/util/List;", "getDesignItems", "()Ljava/util/List;", "designItems", "c", "getDesignItemsWithLargeNumbers", "designItemsWithLargeNumbers", "d", "getDesignItemsNoSubmetrics", "designItemsNoSubmetrics", "Ls21/h;", "e", "getRestorationMilestoneCard", "restorationMilestoneCard", "f", "getDesignItemsWithRestoration", "designItemsWithRestoration", "streaks_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38328f {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC23462h f164232a = AbstractC30060g.m92088H(new C38138a(29));

    /* JADX INFO: renamed from: b */
    private static final List<InterfaceC25312u> f164233b;

    /* JADX INFO: renamed from: c */
    private static final List<InterfaceC25312u> f164234c;

    /* JADX INFO: renamed from: d */
    private static final List<InterfaceC25312u> f164235d;

    /* JADX INFO: renamed from: e */
    private static final List<C32085h> f164236e;

    /* JADX INFO: renamed from: f */
    private static final List<InterfaceC25312u> f164237f;

    /* JADX INFO: renamed from: xi2.f$a */
    @InterfaceC32271e(m100429c = "com.whoop.streaks.view.screens.StreaksScreenKt$StreaksExplainerScreen$6$1", m100430f = "StreaksScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f164238w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f164239x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C33860g f164240y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, C33860g c33860g, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f164239x = function1;
            this.f164240y = c33860g;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f164239x, this.f164240y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f164238w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f164239x.invoke(new AbstractC27950a.c(this.f164240y));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: xi2.f$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f164241a;

        static {
            int[] iArr = new int[EnumC35021b.values().length];
            try {
                iArr[EnumC35021b.RESTORATION_GRADIENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC35021b.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f164241a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        C30012c c30012c = new C30012c(UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE, AbstractC8693b.m21278l("Dec 13"), AbstractC8693b.m21278l("Streak started"), null, null, null, null, null, null, 504, null);
        C30012c c30012c2 = new C30012c("2", AbstractC8693b.m21278l("Top 30%"), null, new AbstractC22403o.a(AbstractC16272a.f61988Q4), null, null, null, null, null, 500, null);
        TextResource textResourceM21278l = AbstractC8693b.m21278l("1200");
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("Max streak");
        EnumC16313m0 enumC16313m0 = EnumC16313m0.EDUCATION;
        C30014e c30014e = new C30014e(AbstractC37056f.m118959K(c30012c, c30012c2, new C30012c("3", textResourceM21278l, textResourceM21278l2, 0 == true ? 1 : 0, enumC16313m0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, new C30011b(AbstractC8693b.m21278l("MAXIMUM STREAK"), AbstractC8693b.m21278l("Your longest streak started on Jun 12, 2023 and ended on Dec 24, 2023."), AbstractC8693b.m21278l("CLOSE")), 232, null)));
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l("THIS WEEK");
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l("MON");
        EnumC39333f enumC39333f = EnumC39333f.WHITE_50;
        C33861h c33861h = new C33861h(textResourceM21278l4, enumC39333f, new AbstractC22403o.a(AbstractC16272a.f61887A));
        C33861h c33861h2 = new C33861h(AbstractC8693b.m21278l("TUE"), enumC39333f, new AbstractC22403o.a(AbstractC16272a.f61887A));
        C33861h c33861h3 = new C33861h(AbstractC8693b.m21278l("WED"), enumC39333f, new AbstractC22403o.a(AbstractC16272a.f61887A));
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l("THU");
        EnumC39333f enumC39333f2 = EnumC39333f.BRAND_WHITE;
        C33854a c33854a = new C33854a(textResourceM21278l3, AbstractC37056f.m118959K(c33861h, c33861h2, c33861h3, new C33861h(textResourceM21278l5, enumC39333f2, new AbstractC22403o.a(AbstractC16272a.f61887A)), new C33861h(AbstractC8693b.m21278l("FRI"), enumC39333f, new AbstractC22403o.a(AbstractC16272a.f61887A)), new C33861h(AbstractC8693b.m21278l("SAT"), enumC39333f, new AbstractC22403o.a(AbstractC16272a.f61887A)), new C33861h(AbstractC8693b.m21278l("SUN"), enumC39333f, new AbstractC22403o.a(AbstractC16272a.f61887A))));
        int i13 = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        C34484d c34484d = new C34484d(AbstractC8693b.m21278l("1000 more days"), AbstractC8693b.m21278l("to unlock your whatcha gonna do."), null, new C34485e(new AbstractC22403o.a(AbstractC16272a.f62001T), null, i13, 0 == true ? 1 : 0), new C34485e(new AbstractC22403o.a(AbstractC16272a.f62120m3), null, i13, 0 == true ? 1 : 0), 0.3d, 4, defaultConstructorMarker);
        C16534a0 c16534a0 = new C16534a0(HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY, AbstractC8693b.m21278l("Build a streak of consecutive days to stoke the fire. Wear your WHOOP each day to maintain your streak. Miss a day, it resets."), "ONBOARDING", null, false, null, null, AbstractC8693b.m21278l("You're heating up"), false, null, null, 1912, null);
        TextResource textResourceM21278l6 = AbstractC8693b.m21278l("SHARE STREAK");
        EnumC16313m0 enumC16313m1 = EnumC16313m0.SHARE;
        AppScreen.C9438v6 c9438v6 = AppScreen.C9438v6.f28000w;
        String str = "/streak-share";
        boolean z4 = false;
        EnumC27243c enumC27243c = null;
        Object[] objArr = 0 == true ? 1 : 0;
        f164233b = AbstractC37056f.m118959K(c30014e, c33854a, c34484d, c16534a0, new C27256h(textResourceM21278l6, enumC16313m1, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, new C9598e(c9438v6, new WhoopShareScreenModel(str, (String) null, i13, (DefaultConstructorMarker) (0 == true ? 1 : 0)), null, 4, null), 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, objArr, null, false, false, "share_streak_button", z4, false, null, null, null, enumC27243c, null, null, null, 33521532, null));
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        EnumC16313m0 enumC16313m2 = null;
        C30014e c30014e2 = new C30014e(AbstractC37056f.m118959K(new C30012c(UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE, AbstractC8693b.m21278l("Dec 13"), AbstractC8693b.m21278l("Streak started"), 0 == true ? 1 : 0, enumC16313m2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 504, defaultConstructorMarker2), new C30012c("2", AbstractC8693b.m21278l("Top 30%"), null, new AbstractC22403o.a(AbstractC16272a.f61988Q4), enumC16313m2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 500, defaultConstructorMarker2), new C30012c("3", AbstractC8693b.m21278l("1200"), AbstractC8693b.m21278l("Max streak"), null, enumC16313m0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, new C30011b(AbstractC8693b.m21278l("MAXIMUM STREAK"), AbstractC8693b.m21278l("Your longest streak started on Jun 12, 2023 and ended on Dec 24, 2023."), AbstractC8693b.m21278l("CLOSE")), 232, defaultConstructorMarker)));
        C33854a c33854a2 = new C33854a(AbstractC8693b.m21278l("THIS WEEK"), AbstractC37056f.m118959K(new C33861h(AbstractC8693b.m21278l("MON"), enumC39333f, new AbstractC22403o.a(AbstractC16272a.f61887A)), new C33861h(AbstractC8693b.m21278l("TUE"), enumC39333f, new AbstractC22403o.a(AbstractC16272a.f61887A)), new C33861h(AbstractC8693b.m21278l("WED"), enumC39333f, new AbstractC22403o.a(AbstractC16272a.f61887A)), new C33861h(AbstractC8693b.m21278l("THU"), enumC39333f2, new AbstractC22403o.a(AbstractC16272a.f61887A)), new C33861h(AbstractC8693b.m21278l("FRI"), enumC39333f, new AbstractC22403o.a(AbstractC16272a.f61887A)), new C33861h(AbstractC8693b.m21278l("SAT"), enumC39333f, new AbstractC22403o.a(AbstractC16272a.f61887A)), new C33861h(AbstractC8693b.m21278l("SUN"), enumC39333f, new AbstractC22403o.a(AbstractC16272a.f61887A))));
        TextResource textResourceM21278l7 = AbstractC8693b.m21278l("17 more days");
        TextResource textResourceM21278l8 = AbstractC8693b.m21278l("to unlock your next milestone.");
        AbstractC18111h.b bVar = new AbstractC18111h.b(new AbstractC22403o.a(AbstractC16272a.f62001T));
        EnumC18110g enumC18110g = EnumC18110g.SMALL;
        String str2 = null;
        int i14 = 4;
        C21173v0 c21173v0 = null;
        int i15 = 33521532;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        boolean z13 = false;
        boolean z14 = false;
        InterfaceC21430b interfaceC21430b = null;
        f164234c = AbstractC37056f.m118959K(c30014e2, c33854a2, new C34484d(textResourceM21278l7, textResourceM21278l8, null, new C34485e(new AbstractC22403o.a(AbstractC16272a.f62001T), new C18112i(bVar, enumC18110g, AbstractC8693b.m21278l("99999"), 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 56, defaultConstructorMarker2)), new C34485e(new AbstractC22403o.a(AbstractC16272a.f62001T), new C18112i(new AbstractC18111h.b(new AbstractC22403o.a(AbstractC16272a.f62120m3)), enumC18110g, AbstractC8693b.m21278l("99999"), 0 == true ? 1 : 0, null, false, 56, null)), 0.5d, 4, 0 == true ? 1 : 0), new C16534a0(HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY, AbstractC8693b.m21278l("Build a streak of consecutive days to stoke the fire. Wear your WHOOP each day to maintain your streak. Miss a day, it resets."), "ONBOARDING", str2, false, null, null, AbstractC8693b.m21278l("You're heating up"), false, null, null, 1912, null), new C27256h(AbstractC8693b.m21278l("SHARE STREAK"), enumC16313m1, null, null, str2, null, 0 == true ? 1 : 0, new C9598e(c9438v6, new WhoopShareScreenModel(str, (String) null, i13, (DefaultConstructorMarker) (0 == true ? 1 : 0)), c21173v0, i14, 0 == true ? 1 : 0), null, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, false, z4, "share_streak_button", z13, z14, 0 == true ? 1 : 0, enumC27243c, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, interfaceC21430b, 0 == true ? 1 : 0, i15, defaultConstructorMarker3));
        C33854a c33854a3 = new C33854a(AbstractC8693b.m21278l("THIS WEEK"), AbstractC37056f.m118959K(new C33861h(AbstractC8693b.m21278l("MON"), enumC39333f, new AbstractC22403o.a(AbstractC16272a.f61887A)), new C33861h(AbstractC8693b.m21278l("TUE"), enumC39333f, new AbstractC22403o.a(AbstractC16272a.f61887A)), new C33861h(AbstractC8693b.m21278l("WED"), enumC39333f, new AbstractC22403o.a(AbstractC16272a.f61887A)), new C33861h(AbstractC8693b.m21278l("THU"), enumC39333f2, new AbstractC22403o.a(AbstractC16272a.f61887A)), new C33861h(AbstractC8693b.m21278l("FRI"), enumC39333f, new AbstractC22403o.a(AbstractC16272a.f61887A)), new C33861h(AbstractC8693b.m21278l("SAT"), enumC39333f, new AbstractC22403o.a(AbstractC16272a.f61887A)), new C33861h(AbstractC8693b.m21278l("SUN"), enumC39333f, new AbstractC22403o.a(AbstractC16272a.f61887A))));
        int i16 = 2;
        C34484d c34484d2 = new C34484d(AbstractC8693b.m21278l("1000 more days"), AbstractC8693b.m21278l("to unlock your whatcha gonna do."), null, new C34485e(new AbstractC22403o.a(AbstractC16272a.f62001T), null, i16, 0 == true ? 1 : 0), new C34485e(new AbstractC22403o.a(AbstractC16272a.f62120m3), 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0), 0.3d, 4, 0 == true ? 1 : 0);
        String str3 = null;
        C16534a0 c16534a1 = new C16534a0(HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY, AbstractC8693b.m21278l("Build a streak of consecutive days to stoke the fire. Wear your WHOOP each day to maintain your streak. Miss a day, it resets."), "ONBOARDING", str3, false, null, null, AbstractC8693b.m21278l("You're heating up"), false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1912, null);
        Object[] objArr2 = 0 == true ? 1 : 0;
        List<InterfaceC25312u> listM118959K = AbstractC37056f.m118959K(c33854a3, c34484d2, c16534a1, new C27256h(AbstractC8693b.m21278l("SHARE STREAK"), enumC16313m1, null, null, str3, null, 0 == true ? 1 : 0, new C9598e(c9438v6, new WhoopShareScreenModel(str, (String) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0)), c21173v0, i14, 0 == true ? 1 : 0), null, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, false, z4, "share_streak_button", z13, z14, 0 == true ? 1 : 0, enumC27243c, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, interfaceC21430b, objArr2, i15, defaultConstructorMarker3));
        f164235d = listM118959K;
        List<C32085h> listM118958J = AbstractC37056f.m118958J(new C32085h(AbstractC8693b.m21278l("Restore your 60 day streak"), AbstractC8693b.m21278l("Wear for 4 more days to restore your streak."), "streak-restoration-card", new AbstractC22403o.a(AbstractC16272a.f61887A), AbstractC8693b.m21278l("Learn More"), null, null, 3, 7, EnumC39333f.STRAIN_ZONE_2, false, EnumC39333f.WHITE_10, EnumC32086i.STEP_BAR, null, new C32078a(AbstractC8693b.m21278l("Restore your 60 day streak"), AbstractC8693b.m21278l("If you lose a streak of 30 days or more, you can restore it by wearing your WHOOP for 7 consecutive days. You can only restore a streak within 3 days of losing it."), C25271y.f99162w), null, null, 98336, null));
        f164236e = listM118958J;
        f164237f = AbstractC25265s.m74129g1(listM118958J, listM118959K);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m122855A(Function1 function1) {
        function1.invoke(InterfaceC32548b.b.f134863a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m122856B(C35022c c35022c, Function1 function1, Context context, Function1 function2) {
        CharSequence charSequenceResolve;
        if (AbstractC22676k.m65745e(c35022c.getHeaderIconDestination().getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9438v6.f28000w)) {
            TextResource textResourceM110693k = c35022c.getStreakValue();
            String string = null;
            if (!AbstractC8693b.m21270d(textResourceM110693k)) {
                textResourceM110693k = null;
            }
            if (textResourceM110693k != null && (charSequenceResolve = textResourceM110693k.resolve(context)) != null) {
                string = charSequenceResolve.toString();
            }
            if (string == null) {
                string = "";
            }
            function1.invoke(new AbstractC27950a.a(string, c35022c.getStreakState()));
        }
        function2.invoke(new InterfaceC32548b.a(c35022c.getHeaderIconDestination()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m122857C(Function1 function1) {
        function1.invoke(InterfaceC32548b.b.f134863a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m122858D(C33860g c33860g, AbstractC0757c abstractC0757c, Function1 function1, Function1 function2, C25307p c25307p, Function1 function3, Function1 function4, InterfaceC34116n interfaceC34116n, int i13, int i14, Composer composer, int i15) {
        m122882t(c33860g, abstractC0757c, function1, function2, c25307p, function3, function4, interfaceC34116n, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: E */
    public static final void m122859E(C35022c data, C33860g viewState, Composer composer, int i13) {
        int i14;
        InterfaceC35689r0 interfaceC35689r0M110689g;
        AbstractC22676k.m65750j(data, "data");
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1712018343);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(data) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            boolean zM107061b = viewState.getStreaksLottieState().getShowLottieTesterFab();
            AbstractC16241o abstractC16241oM107060a = viewState.getStreaksLottieState().getLottieTesterSource();
            C18112i c18112iM110684b = data.getCelebrationMedia();
            C2314t c2314t = C2314t.f9131w;
            if (c18112iM110684b != null) {
                c28655q.m87150e0(-1517161);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(3 * 4, c2314t));
                AbstractC18109f.m51967d(AbstractC16227a.m45933a(data.getCelebrationMedia(), zM107061b, abstractC16241oM107060a), AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, c2314t), "StreaksExplainerCelebrationMedia"), null, c28655q, C18112i.f70331g | 48, 4);
                c28655q.m87173q(false);
            } else if (data.getLottieWrapper() != null) {
                c28655q.m87150e0(-1105481);
                if (!zM107061b || abstractC16241oM107060a == null || (interfaceC35689r0M110689g = AbstractC16242p.m46026b(abstractC16241oM107060a)) == null) {
                    interfaceC35689r0M110689g = data.getLottieWrapper();
                }
                AbstractC35684p.m113047h(AbstractC1136a.m3599a(AbstractC1099a.m3392n(AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(100 * 4, c2314t)), 0.0f, (-10) * 8, 1), "StreaksExplainerLottie"), interfaceC35689r0M110689g, false, 0.0f, 0, null, null, null, null, c28655q, 6, 508);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else if (data.getImage() != null) {
                c28655q.m87150e0(-523394);
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(data.getImage(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1136a.m3599a(AbstractC1099a.m3392n(AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(100 * 4, c2314t)), 0.0f, (-10) * 8, 1), "StreaksExplainerImage"), null, null, 0.0f, null, c28655q, 432, 120);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-168599);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35813e(data, viewState, i13, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m122860F(C35022c c35022c, C33860g c33860g, int i13, Composer composer, int i14) {
        m122859E(c35022c, c33860g, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G */
    public static final int m122861G(InterfaceC25312u item) {
        AbstractC22676k.m65750j(item, "item");
        return item instanceof C30014e ? 4 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final AbstractC0757c m122862H() {
        return AbstractC6728b.m20379d(null, null, null, null, null, 31, null);
    }

    /* JADX INFO: renamed from: p */
    private static final void m122878p(C33860g.a aVar, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1280037218);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87153g(aVar) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            boolean z4 = aVar instanceof C33860g.a.C42396a;
            C2314t c2314t = C2314t.f9131w;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4) {
                c28655q.m87150e0(-1425642651);
                C33860g.a.C42396a c42396a = (C33860g.a.C42396a) aVar;
                int i15 = i14;
                TextResource textResourceM107077c = c42396a.getTitle();
                TextResource textResourceM107075a = c42396a.getDescription();
                TextResource textResourceM107076b = c42396a.getPrimaryActionText();
                boolean z13 = (i15 & 112) == 32;
                Object objM87133R = c28655q.m87133R();
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new C36681f(function1, 19);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                int i16 = TextResource.$stable;
                AbstractC21211n.m59497o(c2314t, textResourceM107077c, textResourceM107075a, textResourceM107076b, false, null, null, null, null, null, null, false, false, null, null, false, 0, null, null, null, false, null, null, null, interfaceC4339a, null, null, null, c28655q, (i16 << 3) | 6 | (i16 << 6) | (i16 << 9), 384, 0, 251654128);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                int i17 = i14;
                if (!(aVar instanceof C33860g.a.b)) {
                    throw AbstractC11895b.m32003v(1755124605, c28655q, false);
                }
                c28655q.m87150e0(-1425166739);
                float f13 = 4;
                Modifier modifierM3411h = AbstractC1102d.m3411h(55 * f13, AbstractC1102d.m3409f(1.0f, c2314t));
                float f14 = 1;
                float f15 = f13 * f14;
                float f16 = f14 * 8;
                Modifier modifierM3397s = AbstractC1099a.m3397s(modifierM3411h, f16, f15, f16, f16);
                C33860g.a.b bVar = (C33860g.a.b) aVar;
                TextResource textResourceM107080c = bVar.getTitle();
                TextResource textResourceM107078a = bVar.getDescription();
                String strM107079b = bVar.getImageUrl();
                boolean z14 = (i17 & 112) == 32;
                Object objM87133R2 = c28655q.m87133R();
                if (z14 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C36681f(function1, 20);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                int i18 = TextResource.$stable;
                AbstractC21211n.m59497o(modifierM3397s, textResourceM107080c, textResourceM107078a, null, false, null, null, null, null, null, null, false, false, null, null, false, 0, null, null, null, false, strM107079b, interfaceC4339a2, null, null, null, null, null, c28655q, (i18 << 3) | (i18 << 6), 805306368, 0, 261619704);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35813e(aVar, function1, i13, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m122879q(Function1 function1) {
        function1.invoke(InterfaceC33858e.b.f141796a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m122880r(Function1 function1) {
        function1.invoke(InterfaceC33858e.c.f141797a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m122881s(C33860g.a aVar, Function1 function1, int i13, Composer composer, int i14) {
        m122878p(aVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0131  */
    /* JADX WARN: Code duplicated, block: B:101:0x0133  */
    /* JADX WARN: Code duplicated, block: B:103:0x0139  */
    /* JADX WARN: Code duplicated, block: B:106:0x0148  */
    /* JADX WARN: Code duplicated, block: B:108:0x014e  */
    /* JADX WARN: Code duplicated, block: B:110:0x015b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0161  */
    /* JADX WARN: Code duplicated, block: B:114:0x0168  */
    /* JADX WARN: Code duplicated, block: B:116:0x016c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0172  */
    /* JADX WARN: Code duplicated, block: B:120:0x017f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0182  */
    /* JADX WARN: Code duplicated, block: B:124:0x0188  */
    /* JADX WARN: Code duplicated, block: B:128:0x0198  */
    /* JADX WARN: Code duplicated, block: B:132:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:133:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:136:0x01de  */
    /* JADX WARN: Code duplicated, block: B:137:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ef A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:141:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:144:0x0204  */
    /* JADX WARN: Code duplicated, block: B:145:0x0211  */
    /* JADX WARN: Code duplicated, block: B:147:0x022a  */
    /* JADX WARN: Code duplicated, block: B:149:0x022d  */
    /* JADX WARN: Code duplicated, block: B:150:0x022f  */
    /* JADX WARN: Code duplicated, block: B:152:0x0235  */
    /* JADX WARN: Code duplicated, block: B:155:0x0262  */
    /* JADX WARN: Code duplicated, block: B:156:0x0266  */
    /* JADX WARN: Code duplicated, block: B:159:0x027b  */
    /* JADX WARN: Code duplicated, block: B:162:0x028c  */
    /* JADX WARN: Code duplicated, block: B:166:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:167:0x02be  */
    /* JADX WARN: Code duplicated, block: B:170:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:172:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:175:0x033f  */
    /* JADX WARN: Code duplicated, block: B:176:0x0343  */
    /* JADX WARN: Code duplicated, block: B:179:0x0350  */
    /* JADX WARN: Code duplicated, block: B:181:0x035e  */
    /* JADX WARN: Code duplicated, block: B:184:0x0379  */
    /* JADX WARN: Code duplicated, block: B:185:0x0385  */
    /* JADX WARN: Code duplicated, block: B:188:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:189:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:192:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:194:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:197:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:198:0x03df  */
    /* JADX WARN: Code duplicated, block: B:200:0x0423  */
    /* JADX WARN: Code duplicated, block: B:202:0x0433  */
    /* JADX WARN: Code duplicated, block: B:203:0x0494  */
    /* JADX WARN: Code duplicated, block: B:206:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:207:0x0505  */
    /* JADX WARN: Code duplicated, block: B:210:0x0519  */
    /* JADX WARN: Code duplicated, block: B:214:0x052e  */
    /* JADX WARN: Code duplicated, block: B:216:0x053e  */
    /* JADX WARN: Code duplicated, block: B:220:0x0565  */
    /* JADX WARN: Code duplicated, block: B:222:0x0582  */
    /* JADX WARN: Code duplicated, block: B:223:0x0584  */
    /* JADX WARN: Code duplicated, block: B:226:0x058a  */
    /* JADX WARN: Code duplicated, block: B:227:0x058c  */
    /* JADX WARN: Code duplicated, block: B:230:0x059e  */
    /* JADX WARN: Code duplicated, block: B:231:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:234:0x05b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:237:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:241:0x063e  */
    /* JADX WARN: Code duplicated, block: B:264:0x0700  */
    /* JADX WARN: Code duplicated, block: B:266:0x073d  */
    /* JADX WARN: Code duplicated, block: B:267:0x073f  */
    /* JADX WARN: Code duplicated, block: B:270:0x0746 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:271:0x0748  */
    /* JADX WARN: Code duplicated, block: B:275:0x0797  */
    /* JADX WARN: Code duplicated, block: B:278:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:283:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:88:0x0102  */
    /* JADX WARN: Code duplicated, block: B:90:0x0111  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public static final void m122882t(C33860g viewState, AbstractC0757c abstractC0757c, Function1 function1, Function1 function2, C25307p c25307p, Function1 function3, Function1 function4, InterfaceC34116n interfaceC34116n, Composer composer, int i13, int i14) {
        Function1 function5;
        int i15;
        int i16;
        int i17;
        Function1 function6;
        int i18;
        int i19;
        Function1 function7;
        int i24;
        InterfaceC34116n interfaceC34116nM107848a;
        boolean z4;
        C28655q c28655q;
        Function1 function8;
        Function1 function9;
        InterfaceC34116n interfaceC34116n2;
        Function1 function10;
        Function1 function11;
        C25307p c25307p2;
        C28677v1 c28677v1M87180u;
        int i25;
        C28676v0 c28676v0;
        Function1 function12;
        C25307p c25307pM107058b;
        Function1 function13;
        Function1 function14;
        C25307p c25307p3;
        InterfaceC34116n interfaceC34116n3;
        Function1 function15;
        Function1 function16;
        Function1 function17;
        Object objM87133R;
        Object objM87133R2;
        Object objM87133R3;
        Object objM87133R4;
        Context context;
        C33860g.a aVarM107071b;
        int i26;
        boolean z13;
        boolean zM87157i;
        Object objM87133R5;
        C25307p c25307p4;
        C35022c c35022cM107070a;
        int i27;
        C2314t c2314t;
        Modifier modifierM44020Y;
        Function1 function18;
        Function1 function19;
        int iHashCode;
        C0213j c0213j;
        Function1 function20;
        C0209i c0209i;
        Context context2;
        int i28;
        int iHashCode2;
        float f13;
        float f14;
        InterfaceC34116n interfaceC34116n4;
        int i29;
        int iHashCode3;
        boolean z14;
        Modifier modifierM3392n;
        int iHashCode4;
        C33194k1 c33194k1M110695m;
        char c3;
        C28655q c28655q2;
        C23454a0 c23454a0;
        C28676v0 c28676v1;
        int i34;
        C28655q c28655q3;
        boolean z15;
        boolean z16;
        int i35;
        boolean z17;
        boolean z18;
        Object objM87133R6;
        int i36;
        boolean z19;
        boolean z24;
        InterfaceC34116n interfaceC34116n5;
        int i37;
        boolean z25;
        Context context3;
        boolean z26;
        Object c1019g0;
        Context context4;
        InterfaceC25312u interfaceC25312u;
        InterfaceC34116n interfaceC34116n6;
        Function1 function21;
        Function1 function22;
        Function1 function23;
        boolean z27;
        C28655q c28655q4;
        int i38;
        boolean zM87157i2;
        AbstractC0757c interactionJson = abstractC0757c;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(interactionJson, "interactionJson");
        C28655q c28655q5 = (C28655q) composer;
        c28655q5.m87154g0(-166829486);
        int i39 = (i13 & 6) == 0 ? (c28655q5.m87157i(viewState) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i39 |= c28655q5.m87157i(interactionJson) ? 32 : 16;
        }
        int i44 = i14 & 4;
        if (i44 == 0) {
            if ((i13 & 384) == 0) {
                function5 = function1;
                i39 |= c28655q5.m87157i(function5) ? 256 : 128;
            }
            i15 = i14 & 8;
            if (i15 != 0) {
                if ((i13 & 3072) == 0) {
                    if (c28655q5.m87157i(function2)) {
                        i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i39 |= i16;
                }
                if ((i13 & 24576) == 0) {
                    if ((i14 & 16) != 0) {
                        i38 = DfuBaseService.ERROR_REMOTE_MASK;
                    } else {
                        if ((32768 & i13) == 0) {
                            zM87157i2 = c28655q5.m87153g(c25307p);
                        } else {
                            zM87157i2 = c28655q5.m87157i(c25307p);
                        }
                        if (zM87157i2) {
                            i38 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i38 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                    }
                    i39 |= i38;
                }
                i17 = i14 & 32;
                if (i17 != 0) {
                    i39 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    function6 = function3;
                } else {
                    function6 = function3;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q5.m87157i(function6)) {
                            i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i39 |= i18;
                    }
                }
                i19 = i14 & 64;
                if (i19 != 0) {
                    i39 |= 1572864;
                    function7 = function4;
                } else {
                    function7 = function4;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q5.m87157i(function7)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i39 |= i24;
                    }
                }
                if ((i13 & 12582912) == 0) {
                    if ((i14 & 128) == 0) {
                        interfaceC34116nM107848a = interfaceC34116n;
                        int i45 = c28655q5.m87157i(interfaceC34116nM107848a) ? 8388608 : 4194304;
                        i39 |= i45;
                    } else {
                        interfaceC34116nM107848a = interfaceC34116n;
                    }
                    i39 |= i45;
                } else {
                    interfaceC34116nM107848a = interfaceC34116n;
                }
                if ((i39 & 4793491) != 4793490) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q5.m87135U(i39 & 1, z4)) {
                    c28655q5.m87140Z();
                    i25 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i25 != 0 || c28655q5.m87118C()) {
                        if (i44 != 0) {
                            objM87133R4 = c28655q5.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C38136a(26);
                                c28655q5.m87172p0(objM87133R4);
                            }
                            function5 = (Function1) objM87133R4;
                        }
                        if (i15 != 0) {
                            objM87133R3 = c28655q5.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C38136a(27);
                                c28655q5.m87172p0(objM87133R3);
                            }
                            function12 = (Function1) objM87133R3;
                        } else {
                            function12 = function2;
                        }
                        if ((i14 & 16) != 0) {
                            c25307pM107058b = AbstractC33856c.m107058b();
                            i39 &= -57345;
                        } else {
                            c25307pM107058b = c25307p;
                        }
                        if (i17 != 0) {
                            objM87133R2 = c28655q5.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C38136a(28);
                                c28655q5.m87172p0(objM87133R2);
                            }
                            function13 = (Function1) objM87133R2;
                        } else {
                            function13 = function6;
                        }
                        if (i19 != 0) {
                            objM87133R = c28655q5.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C38136a(29);
                                c28655q5.m87172p0(objM87133R);
                            }
                            function7 = (Function1) objM87133R;
                        }
                        if ((i14 & 128) != 0) {
                            interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("StreaksScreen");
                            i39 &= -29360129;
                        }
                        InterfaceC34116n interfaceC34116n7 = interfaceC34116nM107848a;
                        function14 = function12;
                        c25307p3 = c25307pM107058b;
                        interfaceC34116n3 = interfaceC34116n7;
                        function15 = function7;
                        function16 = function5;
                        function17 = function13;
                    } else {
                        c28655q5.m87138X();
                        if ((i14 & 16) != 0) {
                            i39 &= -57345;
                        }
                        if ((i14 & 128) != 0) {
                            i39 &= -29360129;
                        }
                        c25307p3 = c25307p;
                        function15 = function7;
                        interfaceC34116n3 = interfaceC34116nM107848a;
                        function16 = function5;
                        function17 = function6;
                        function14 = function2;
                    }
                    c28655q5.m87175r();
                    context = (Context) c28655q5.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                    aVarM107071b = viewState.getDialogState();
                    if (aVarM107071b == null) {
                        c28655q5.m87150e0(-739534285);
                        c28655q5.m87173q(false);
                    } else {
                        c28655q5.m87150e0(-739534284);
                        m122878p(aVarM107071b, function16, c28655q5, (i39 >> 3) & 112);
                        c28655q5.m87173q(false);
                    }
                    i26 = 458752 & i39;
                    if (i26 == 131072) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zM87157i = z13 | c28655q5.m87157i(viewState);
                    objM87133R5 = c28655q5.m87133R();
                    c25307p4 = c25307p3;
                    if (zM87157i || objM87133R5 == c28676v0) {
                        objM87133R5 = new a(function17, viewState, null);
                        c28655q5.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R5, null);
                    c35022cM107070a = viewState.getData();
                    if (c35022cM107070a == null) {
                        c28655q5.m87150e0(-738960940);
                        c28655q5.m87173q(false);
                        c28655q = c28655q5;
                    } else {
                        c28655q5.m87150e0(-738960939);
                        i27 = b.f164241a[c35022cM107070a.getBackgroundType().ordinal()];
                        c2314t = C2314t.f9131w;
                        if (i27 != 1) {
                            modifierM44020Y = AbstractC15673b0.m44020Y(c2314t);
                        } else {
                            if (i27 == 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            modifierM44020Y = c2314t;
                        }
                        C2307m c2307m = C2299e.f9114w;
                        function18 = function16;
                        function19 = function14;
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode = Long.hashCode(c28655q5.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q5.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q5, modifierM44020Y);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q5.m87158i0();
                        function20 = function17;
                        if (c28655q5.f115903S) {
                            c28655q5.m87163l(c0213j);
                        } else {
                            c28655q5.m87178s0();
                        }
                        C0209i c0209i2 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC39127r0M66763d);
                        C0209i c0209i3 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q5, c0209i3, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        context2 = context;
                        if (c28655q5.f115903S) {
                            i28 = i26;
                        } else {
                            i28 = i26;
                            if (!AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i4 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N);
                            Modifier modifierM66723l = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, c2314t));
                            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                            iHashCode2 = Long.hashCode(c28655q5.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q5.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q5, modifierM66723l);
                            c28655q5.m87158i0();
                            if (c28655q5.f115903S) {
                                c28655q5.m87163l(c0213j);
                            } else {
                                c28655q5.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC39127r0M66763d2);
                            AbstractC28683x.m87239G(c28655q5, c0209i3, interfaceC28653p1M87165m2);
                            if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode2))) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N2);
                            f13 = 8;
                            f14 = 2 * f13;
                            interfaceC34116n4 = interfaceC34116n3;
                            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC15674c.m44085i(AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 2), 0.0f, 6 * f13, 0.0f, f14, 5), 10 * 4, null, 2, null), AbstractC30060g.m92099U(0, c28655q5, 1), 14);
                            C2305k c2305k = C2299e.f9111N;
                            C22957g c22957g = AbstractC22977m.f90652c;
                            i29 = i39;
                            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q5, 48);
                            iHashCode3 = Long.hashCode(c28655q5.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q5.m87165m();
                            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q5, modifierM92116f0);
                            c28655q5.m87158i0();
                            if (c28655q5.f115903S) {
                                c28655q5.m87163l(c0213j);
                            } else {
                                c28655q5.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q5, c0209i2, c23010xM66775a);
                            AbstractC28683x.m87239G(c28655q5, c0209i3, interfaceC28653p1M87165m3);
                            if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode3))) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N3);
                            m122859E(c35022cM107070a, viewState, c28655q5, (i29 << 3) & 112);
                            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                            if (c35022cM107070a.getTitleSubtitle() == null) {
                                z14 = true;
                                modifierM3392n = AbstractC1099a.m3392n(c2314t, 0.0f, (-16) * f13, 1);
                            } else {
                                z14 = true;
                                modifierM3392n = c2314t;
                            }
                            Modifier modifierMo3471e = modifierM3409f.mo3471e(modifierM3392n);
                            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q5, 48);
                            iHashCode4 = Long.hashCode(c28655q5.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q5.m87165m();
                            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q5, modifierMo3471e);
                            c28655q5.m87158i0();
                            if (c28655q5.f115903S) {
                                c28655q5.m87163l(c0213j);
                            } else {
                                c28655q5.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q5, c0209i2, c23010xM66775a2);
                            AbstractC28683x.m87239G(c28655q5, c0209i3, interfaceC28653p1M87165m4);
                            if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode4))) {
                                AbstractC11266d.m30471y(iHashCode4, c28655q5, iHashCode4, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N4);
                            c33194k1M110695m = c35022cM107070a.getTitleSubtitle();
                            c3 = 3;
                            if (c33194k1M110695m == null) {
                                c28655q5.m87150e0(-572141400);
                                c28655q5.m87173q(false);
                                c28655q2 = c28655q5;
                                c23454a0 = null;
                            } else {
                                c28655q5.m87150e0(-572141399);
                                AbstractC33191j1.m105171d(AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 2), 0.0f, 5 * f13, 0.0f, 0.0f, 13), c33194k1M110695m, null, c28655q5, (C33194k1.f138384l << 3) | 6, 4);
                                c28655q2 = c28655q5;
                                AbstractC25012a.m73389v(c2314t, f14, c28655q2, false);
                                c23454a0 = C23454a0.f92919a;
                            }
                            if (c23454a0 == null) {
                                c28655q2.m87150e0(-571650328);
                                if (AbstractC8693b.m21270d(c35022cM107070a.getStreakValue())) {
                                    c28655q2.m87150e0(1316319624);
                                    String strM21274h = AbstractC8693b.m21274h(c35022cM107070a.getStreakValue(), c28655q2, TextResource.$stable);
                                    C2886a c2886aM8442w = C38072d.f163053a.m121952e(c28655q2, C38072d.f163054b).getN2();
                                    long jMo134584toComposableColorWaAFU9c = c35022cM107070a.getStreakTextColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
                                    int i46 = C2886a.f11498d << 18;
                                    C28655q c28655q6 = c28655q2;
                                    c28676v1 = c28676v0;
                                    z15 = false;
                                    i34 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                                    AbstractC30795n.m94707h(strM21274h, null, jMo134584toComposableColorWaAFU9c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8442w, null, c28655q6, 0, i46, 196602);
                                    c28655q4 = c28655q6;
                                    c28655q4.m87173q(false);
                                } else {
                                    c28655q4 = c28655q2;
                                    c28676v1 = c28676v0;
                                    z15 = false;
                                    i34 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                                    c28655q4.m87150e0(1316612698);
                                    c28655q4.m87173q(false);
                                }
                                if (AbstractC8693b.m21270d(c35022cM107070a.getStreakSubtitle())) {
                                    c28655q4.m87150e0(1316721477);
                                    C28655q c28655q7 = c28655q4;
                                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c35022cM107070a.getStreakSubtitle(), c28655q4, TextResource.$stable), null, c35022cM107070a.getStreakTextColor().mo134584toComposableColorWaAFU9c(c28655q4, z15 ? 1 : 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q4, C38072d.f163054b).getH3(), null, c28655q7, 0, C2886a.f11498d << 18, 196602);
                                    c28655q3 = c28655q7;
                                    c28655q3.m87173q(z15);
                                } else {
                                    c28655q3 = c28655q4;
                                    c28655q3.m87150e0(1317017434);
                                    c28655q3.m87173q(z15);
                                }
                                if (!AbstractC8693b.m21270d(c35022cM107070a.getStreakValue()) || AbstractC8693b.m21270d(c35022cM107070a.getStreakSubtitle())) {
                                    c28655q3.m87150e0(1317120013);
                                    AbstractC31061c.m95650z(3, f13, c2314t, c28655q3, z15);
                                } else {
                                    c28655q3.m87150e0(1317224762);
                                    c28655q3.m87173q(z15);
                                }
                                c28655q3.m87173q(z15);
                            } else {
                                c35022cM107070a = c35022cM107070a;
                                z14 = z14;
                                c28676v1 = c28676v0;
                                i34 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                                c28655q3 = c28655q2;
                                z15 = false;
                                c28655q3.m87150e0(-849739733);
                                c28655q3.m87173q(false);
                            }
                            c28655q3.m87150e0(-849687131);
                            for (InterfaceC25312u interfaceC25312u2 : c35022cM107070a.m110688f()) {
                                C13258u c13258u = new C13258u(5, interfaceC25312u2);
                                boolean z28 = (c28655q3.m87157i(interfaceC25312u2) ? 1 : 0) | (c28655q3.m87157i(interactionJson) ? 1 : 0);
                                i36 = i29;
                                if ((i36 & 896) == 256) {
                                    z19 = z14;
                                } else {
                                    z19 = z15;
                                }
                                boolean z29 = z28 | z19;
                                if ((i36 & 7168) == i34) {
                                    z24 = z14;
                                } else {
                                    z24 = z15;
                                }
                                boolean z34 = (z29 ? 1 : 0) | z24;
                                interfaceC34116n5 = interfaceC34116n4;
                                boolean z35 = z34 | (c28655q3.m87157i(interfaceC34116n5) ? 1 : 0);
                                char c7 = c3;
                                i37 = i28;
                                if (i37 == 131072) {
                                    z25 = true;
                                } else {
                                    z25 = z15;
                                }
                                context3 = context2;
                                z26 = (((z35 ? 1 : 0) | z25) | (c28655q3.m87157i(c35022cM107070a) ? 1 : 0) ? 1 : 0) | (c28655q3.m87157i(context3) ? 1 : 0);
                                Object objM87133R7 = c28655q3.m87133R();
                                if (z26 == 0 || objM87133R7 == c28676v1) {
                                    context4 = context3;
                                    interfaceC25312u = interfaceC25312u2;
                                    interfaceC34116n6 = interfaceC34116n5;
                                    function21 = function18;
                                    function22 = function19;
                                    function23 = function20;
                                    z27 = true;
                                    c1019g0 = new C1019g0(interfaceC25312u, abstractC0757c, function21, function22, interfaceC34116n6, function23, c35022cM107070a, context4);
                                    c28655q3.m87172p0(c1019g0);
                                } else {
                                    interfaceC34116n6 = interfaceC34116n5;
                                    c1019g0 = objM87133R7;
                                    function22 = function19;
                                    function23 = function20;
                                    z27 = true;
                                    context4 = context3;
                                    interfaceC25312u = interfaceC25312u2;
                                    function21 = function18;
                                }
                                AbstractC25303l.m74291r(interfaceC25312u, c25307p4, c13258u, (Function1) c1019g0, c28655q3, (C25307p.f99300b << 3) | ((i36 >> 9) & 112), 0);
                                interactionJson = abstractC0757c;
                                i29 = i36;
                                function18 = function21;
                                function19 = function22;
                                interfaceC34116n4 = interfaceC34116n6;
                                function20 = function23;
                                context2 = context4;
                                z14 = z27;
                                c3 = c7;
                                i28 = i37;
                            }
                            z16 = z14;
                            function16 = function18;
                            function14 = function19;
                            function17 = function20;
                            Context context5 = context2;
                            int i47 = i28;
                            interfaceC34116n3 = interfaceC34116n4;
                            i35 = i29;
                            c28655q3.m87173q(z15);
                            c28655q3.m87173q(z16);
                            c28655q3.m87173q(z16);
                            if (c35022cM107070a.getHeaderIcon() != null || c35022cM107070a.getHeaderIconDestination() == null) {
                                z17 = z16;
                                c28655q3.m87150e0(-1943357594);
                                AbstractC6721d.a aVar = new AbstractC6721d.a(c35022cM107070a.getTitle(), null, AbstractC13673n.m38561h(C38072d.f163053a), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                                if ((i35 & 7168) == i34) {
                                    z18 = z17;
                                } else {
                                    z18 = z15;
                                }
                                objM87133R6 = c28655q3.m87133R();
                                if (z18 || objM87133R6 == c28676v1) {
                                    objM87133R6 = new C36681f(function14, 22);
                                    c28655q3.m87172p0(objM87133R6);
                                }
                                C28655q c28655q8 = c28655q3;
                                AbstractC6719b.m20143d(null, aVar, null, (InterfaceC4339a) objM87133R6, null, null, c28655q8, AbstractC6721d.a.f25641r << 3, 53);
                                c28655q = c28655q8;
                                c28655q.m87173q(z15);
                            } else {
                                c28655q3.m87150e0(-1944778758);
                                AbstractC6721d.a aVar2 = new AbstractC6721d.a(c35022cM107070a.getTitle(), null, AbstractC13673n.m38561h(C38072d.f163053a), null, Integer.valueOf(AbstractC16315n0.m46378c(c35022cM107070a.getHeaderIcon(), EnumC16313m0.EDUCATION).toWhoopIcon()), null, null, null, false, null, EnumC39333f.WHITE_50, null, null, null, null, null, 64490, null);
                                int i48 = i35 & 7168;
                                boolean z36 = i48 == i34 ? z16 : z15;
                                Object objM87133R8 = c28655q3.m87133R();
                                if (z36 || objM87133R8 == c28676v1) {
                                    objM87133R8 = new C36681f(function14, 21);
                                    c28655q3.m87172p0(objM87133R8);
                                }
                                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R8;
                                boolean z37 = (i48 == i34 ? true : z15) | (((c28655q3.m87157i(c35022cM107070a) ? 1 : 0) | (i47 == 131072 ? true : z15)) | (c28655q3.m87157i(context5) ? 1 : 0) ? 1 : 0);
                                Object objM87133R9 = c28655q3.m87133R();
                                if (z37 != 0 || objM87133R9 == c28676v1) {
                                    objM87133R9 = new C27198e((Object) c35022cM107070a, function17, (Object) context5, function14, 24);
                                    c28655q3.m87172p0(objM87133R9);
                                }
                                C28655q c28655q9 = c28655q3;
                                z17 = true;
                                AbstractC6719b.m20143d(null, aVar2, null, interfaceC4339a, (InterfaceC4339a) objM87133R9, null, c28655q9, AbstractC6721d.a.f25641r << 3, 37);
                                c28655q9.m87173q(z15);
                                c28655q = c28655q9;
                            }
                            viewState.getStreaksLottieState().getShowLottieTesterFab();
                            c28655q.m87150e0(-1942126770);
                            c28655q.m87173q(z15);
                            viewState.getStreaksLottieState().getShowLottieTesterSheet();
                            c28655q.m87150e0(-1941652594);
                            AbstractC2875y.m8286B(c28655q, z15, z17, z17, z15);
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i);
                        C0209i c0209i5 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q5, c0209i5, modifierM118962N);
                        Modifier modifierM66723l2 = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, c2314t));
                        InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode2 = Long.hashCode(c28655q5.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q5.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q5, modifierM66723l2);
                        c28655q5.m87158i0();
                        if (c28655q5.f115903S) {
                            c28655q5.m87163l(c0213j);
                        } else {
                            c28655q5.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC39127r0M66763d3);
                        AbstractC28683x.m87239G(c28655q5, c0209i3, interfaceC28653p1M87165m5);
                        if (c28655q5.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q5, c0209i5, modifierM118962N5);
                        f13 = 8;
                        f14 = 2 * f13;
                        interfaceC34116n4 = interfaceC34116n3;
                        Modifier modifierM92116f1 = AbstractC30060g.m92116f0(AbstractC15674c.m44085i(AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 2), 0.0f, 6 * f13, 0.0f, f14, 5), 10 * 4, null, 2, null), AbstractC30060g.m92099U(0, c28655q5, 1), 14);
                        C2305k c2305k2 = C2299e.f9111N;
                        C22957g c22957g2 = AbstractC22977m.f90652c;
                        i29 = i39;
                        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q5, 48);
                        iHashCode3 = Long.hashCode(c28655q5.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q5.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q5, modifierM92116f1);
                        c28655q5.m87158i0();
                        if (c28655q5.f115903S) {
                            c28655q5.m87163l(c0213j);
                        } else {
                            c28655q5.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q5, c0209i2, c23010xM66775a3);
                        AbstractC28683x.m87239G(c28655q5, c0209i3, interfaceC28653p1M87165m6);
                        if (c28655q5.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q5, c0209i5, modifierM118962N6);
                        m122859E(c35022cM107070a, viewState, c28655q5, (i29 << 3) & 112);
                        Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                        if (c35022cM107070a.getTitleSubtitle() == null) {
                            z14 = true;
                            modifierM3392n = AbstractC1099a.m3392n(c2314t, 0.0f, (-16) * f13, 1);
                        } else {
                            z14 = true;
                            modifierM3392n = c2314t;
                        }
                        Modifier modifierMo3471e2 = modifierM3409f2.mo3471e(modifierM3392n);
                        C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q5, 48);
                        iHashCode4 = Long.hashCode(c28655q5.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q5.m87165m();
                        Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q5, modifierMo3471e2);
                        c28655q5.m87158i0();
                        if (c28655q5.f115903S) {
                            c28655q5.m87163l(c0213j);
                        } else {
                            c28655q5.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q5, c0209i2, c23010xM66775a4);
                        AbstractC28683x.m87239G(c28655q5, c0209i3, interfaceC28653p1M87165m7);
                        if (c28655q5.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q5, iHashCode4, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q5, iHashCode4, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q5, c0209i5, modifierM118962N7);
                        c33194k1M110695m = c35022cM107070a.getTitleSubtitle();
                        c3 = 3;
                        if (c33194k1M110695m == null) {
                            c28655q5.m87150e0(-572141400);
                            c28655q5.m87173q(false);
                            c28655q2 = c28655q5;
                            c23454a0 = null;
                        } else {
                            c28655q5.m87150e0(-572141399);
                            AbstractC33191j1.m105171d(AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 2), 0.0f, 5 * f13, 0.0f, 0.0f, 13), c33194k1M110695m, null, c28655q5, (C33194k1.f138384l << 3) | 6, 4);
                            c28655q2 = c28655q5;
                            AbstractC25012a.m73389v(c2314t, f14, c28655q2, false);
                            c23454a0 = C23454a0.f92919a;
                        }
                        if (c23454a0 == null) {
                            c28655q2.m87150e0(-571650328);
                            if (AbstractC8693b.m21270d(c35022cM107070a.getStreakValue())) {
                                c28655q2.m87150e0(1316319624);
                                String strM21274h2 = AbstractC8693b.m21274h(c35022cM107070a.getStreakValue(), c28655q2, TextResource.$stable);
                                C2886a c2886aM8442w2 = C38072d.f163053a.m121952e(c28655q2, C38072d.f163054b).getN2();
                                long jMo134584toComposableColorWaAFU9c2 = c35022cM107070a.getStreakTextColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
                                int i49 = C2886a.f11498d << 18;
                                C28655q c28655q10 = c28655q2;
                                c28676v1 = c28676v0;
                                z15 = false;
                                i34 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                                AbstractC30795n.m94707h(strM21274h2, null, jMo134584toComposableColorWaAFU9c2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8442w2, null, c28655q10, 0, i49, 196602);
                                c28655q4 = c28655q10;
                                c28655q4.m87173q(false);
                            } else {
                                c28655q4 = c28655q2;
                                c28676v1 = c28676v0;
                                z15 = false;
                                i34 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                                c28655q4.m87150e0(1316612698);
                                c28655q4.m87173q(false);
                            }
                            if (AbstractC8693b.m21270d(c35022cM107070a.getStreakSubtitle())) {
                                c28655q4.m87150e0(1316721477);
                                C28655q c28655q11 = c28655q4;
                                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c35022cM107070a.getStreakSubtitle(), c28655q4, TextResource.$stable), null, c35022cM107070a.getStreakTextColor().mo134584toComposableColorWaAFU9c(c28655q4, z15 ? 1 : 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q4, C38072d.f163054b).getH3(), null, c28655q11, 0, C2886a.f11498d << 18, 196602);
                                c28655q3 = c28655q11;
                                c28655q3.m87173q(z15);
                            } else {
                                c28655q3 = c28655q4;
                                c28655q3.m87150e0(1317017434);
                                c28655q3.m87173q(z15);
                            }
                            if (AbstractC8693b.m21270d(c35022cM107070a.getStreakValue())) {
                                c28655q3.m87150e0(1317120013);
                                AbstractC31061c.m95650z(3, f13, c2314t, c28655q3, z15);
                            } else {
                                c28655q3.m87150e0(1317120013);
                                AbstractC31061c.m95650z(3, f13, c2314t, c28655q3, z15);
                            }
                            c28655q3.m87173q(z15);
                        } else {
                            c35022cM107070a = c35022cM107070a;
                            z14 = z14;
                            c28676v1 = c28676v0;
                            i34 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                            c28655q3 = c28655q2;
                            z15 = false;
                            c28655q3.m87150e0(-849739733);
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87150e0(-849687131);
                        while (r14.hasNext()) {
                            C13258u c13258u2 = new C13258u(5, interfaceC25312u2);
                            boolean z210 = (c28655q3.m87157i(interfaceC25312u2) ? 1 : 0) | (c28655q3.m87157i(interactionJson) ? 1 : 0);
                            i36 = i29;
                            if ((i36 & 896) == 256) {
                                z19 = z14;
                            } else {
                                z19 = z15;
                            }
                            boolean z211 = z210 | z19;
                            if ((i36 & 7168) == i34) {
                                z24 = z14;
                            } else {
                                z24 = z15;
                            }
                            boolean z38 = (z211 ? 1 : 0) | z24;
                            interfaceC34116n5 = interfaceC34116n4;
                            boolean z39 = z38 | (c28655q3.m87157i(interfaceC34116n5) ? 1 : 0);
                            char c14 = c3;
                            i37 = i28;
                            if (i37 == 131072) {
                                z25 = true;
                            } else {
                                z25 = z15;
                            }
                            context3 = context2;
                            z26 = (((z39 ? 1 : 0) | z25) | (c28655q3.m87157i(c35022cM107070a) ? 1 : 0) ? 1 : 0) | (c28655q3.m87157i(context3) ? 1 : 0);
                            Object objM87133R10 = c28655q3.m87133R();
                            if (z26 == 0) {
                                context4 = context3;
                                interfaceC25312u = interfaceC25312u2;
                                interfaceC34116n6 = interfaceC34116n5;
                                function21 = function18;
                                function22 = function19;
                                function23 = function20;
                                z27 = true;
                                c1019g0 = new C1019g0(interfaceC25312u, abstractC0757c, function21, function22, interfaceC34116n6, function23, c35022cM107070a, context4);
                                c28655q3.m87172p0(c1019g0);
                            } else {
                                context4 = context3;
                                interfaceC25312u = interfaceC25312u2;
                                interfaceC34116n6 = interfaceC34116n5;
                                function21 = function18;
                                function22 = function19;
                                function23 = function20;
                                z27 = true;
                                c1019g0 = new C1019g0(interfaceC25312u, abstractC0757c, function21, function22, interfaceC34116n6, function23, c35022cM107070a, context4);
                                c28655q3.m87172p0(c1019g0);
                            }
                            AbstractC25303l.m74291r(interfaceC25312u, c25307p4, c13258u2, (Function1) c1019g0, c28655q3, (C25307p.f99300b << 3) | ((i36 >> 9) & 112), 0);
                            interactionJson = abstractC0757c;
                            i29 = i36;
                            function18 = function21;
                            function19 = function22;
                            interfaceC34116n4 = interfaceC34116n6;
                            function20 = function23;
                            context2 = context4;
                            z14 = z27;
                            c3 = c14;
                            i28 = i37;
                        }
                        z16 = z14;
                        function16 = function18;
                        function14 = function19;
                        function17 = function20;
                        Context context6 = context2;
                        int i410 = i28;
                        interfaceC34116n3 = interfaceC34116n4;
                        i35 = i29;
                        c28655q3.m87173q(z15);
                        c28655q3.m87173q(z16);
                        c28655q3.m87173q(z16);
                        if (c35022cM107070a.getHeaderIcon() != null) {
                            z17 = z16;
                            c28655q3.m87150e0(-1943357594);
                            AbstractC6721d.a aVar3 = new AbstractC6721d.a(c35022cM107070a.getTitle(), null, AbstractC13673n.m38561h(C38072d.f163053a), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                            if ((i35 & 7168) == i34) {
                                z18 = z17;
                            } else {
                                z18 = z15;
                            }
                            objM87133R6 = c28655q3.m87133R();
                            if (z18) {
                                objM87133R6 = new C36681f(function14, 22);
                                c28655q3.m87172p0(objM87133R6);
                            } else {
                                objM87133R6 = new C36681f(function14, 22);
                                c28655q3.m87172p0(objM87133R6);
                            }
                            C28655q c28655q12 = c28655q3;
                            AbstractC6719b.m20143d(null, aVar3, null, (InterfaceC4339a) objM87133R6, null, null, c28655q12, AbstractC6721d.a.f25641r << 3, 53);
                            c28655q = c28655q12;
                            c28655q.m87173q(z15);
                        } else {
                            z17 = z16;
                            c28655q3.m87150e0(-1943357594);
                            AbstractC6721d.a aVar4 = new AbstractC6721d.a(c35022cM107070a.getTitle(), null, AbstractC13673n.m38561h(C38072d.f163053a), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                            if ((i35 & 7168) == i34) {
                                z18 = z17;
                            } else {
                                z18 = z15;
                            }
                            objM87133R6 = c28655q3.m87133R();
                            if (z18) {
                                objM87133R6 = new C36681f(function14, 22);
                                c28655q3.m87172p0(objM87133R6);
                            } else {
                                objM87133R6 = new C36681f(function14, 22);
                                c28655q3.m87172p0(objM87133R6);
                            }
                            C28655q c28655q13 = c28655q3;
                            AbstractC6719b.m20143d(null, aVar4, null, (InterfaceC4339a) objM87133R6, null, null, c28655q13, AbstractC6721d.a.f25641r << 3, 53);
                            c28655q = c28655q13;
                            c28655q.m87173q(z15);
                        }
                        viewState.getStreaksLottieState().getShowLottieTesterFab();
                        c28655q.m87150e0(-1942126770);
                        c28655q.m87173q(z15);
                        viewState.getStreaksLottieState().getShowLottieTesterSheet();
                        c28655q.m87150e0(-1941652594);
                        AbstractC2875y.m8286B(c28655q, z15, z17, z17, z15);
                    }
                    function10 = function16;
                    function8 = function14;
                    function11 = function17;
                    c25307p2 = c25307p4;
                    interfaceC34116n2 = interfaceC34116n3;
                    function9 = function15;
                } else {
                    c28655q = c28655q5;
                    c28655q.m87138X();
                    function8 = function2;
                    function9 = function7;
                    interfaceC34116n2 = interfaceC34116nM107848a;
                    function10 = function5;
                    function11 = function6;
                    c25307p2 = c25307p;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2880b(viewState, abstractC0757c, function10, function8, c25307p2, function11, function9, interfaceC34116n2, i13, i14);
                }
            }
            i39 |= 3072;
            if ((i13 & 24576) == 0) {
                if ((i14 & 16) != 0) {
                    i38 = DfuBaseService.ERROR_REMOTE_MASK;
                } else {
                    if ((32768 & i13) == 0) {
                        zM87157i2 = c28655q5.m87153g(c25307p);
                    } else {
                        zM87157i2 = c28655q5.m87157i(c25307p);
                    }
                    if (zM87157i2) {
                        i38 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i38 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                }
                i39 |= i38;
            }
            i17 = i14 & 32;
            if (i17 != 0) {
                i39 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                function6 = function3;
            } else {
                function6 = function3;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q5.m87157i(function6)) {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i39 |= i18;
                }
            }
            i19 = i14 & 64;
            if (i19 != 0) {
                i39 |= 1572864;
                function7 = function4;
            } else {
                function7 = function4;
                if ((i13 & 1572864) == 0) {
                    if (c28655q5.m87157i(function7)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i39 |= i24;
                }
            }
            if ((i13 & 12582912) == 0) {
                if ((i14 & 128) == 0) {
                    interfaceC34116nM107848a = interfaceC34116n;
                    if (c28655q5.m87157i(interfaceC34116nM107848a)) {
                    }
                    i39 |= i45;
                } else {
                    interfaceC34116nM107848a = interfaceC34116n;
                }
                i39 |= i45;
            } else {
                interfaceC34116nM107848a = interfaceC34116n;
            }
            if ((i39 & 4793491) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q5.m87135U(i39 & 1, z4)) {
                c28655q5.m87140Z();
                i25 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i25 != 0) {
                    if (i44 != 0) {
                        objM87133R4 = c28655q5.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C38136a(26);
                            c28655q5.m87172p0(objM87133R4);
                        }
                        function5 = (Function1) objM87133R4;
                    }
                    if (i15 != 0) {
                        objM87133R3 = c28655q5.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C38136a(27);
                            c28655q5.m87172p0(objM87133R3);
                        }
                        function12 = (Function1) objM87133R3;
                    } else {
                        function12 = function2;
                    }
                    if ((i14 & 16) != 0) {
                        c25307pM107058b = AbstractC33856c.m107058b();
                        i39 &= -57345;
                    } else {
                        c25307pM107058b = c25307p;
                    }
                    if (i17 != 0) {
                        objM87133R2 = c28655q5.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C38136a(28);
                            c28655q5.m87172p0(objM87133R2);
                        }
                        function13 = (Function1) objM87133R2;
                    } else {
                        function13 = function6;
                    }
                    if (i19 != 0) {
                        objM87133R = c28655q5.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C38136a(29);
                            c28655q5.m87172p0(objM87133R);
                        }
                        function7 = (Function1) objM87133R;
                    }
                    if ((i14 & 128) != 0) {
                        interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("StreaksScreen");
                        i39 &= -29360129;
                    }
                    InterfaceC34116n interfaceC34116n8 = interfaceC34116nM107848a;
                    function14 = function12;
                    c25307p3 = c25307pM107058b;
                    interfaceC34116n3 = interfaceC34116n8;
                    function15 = function7;
                    function16 = function5;
                    function17 = function13;
                } else {
                    if (i44 != 0) {
                        objM87133R4 = c28655q5.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C38136a(26);
                            c28655q5.m87172p0(objM87133R4);
                        }
                        function5 = (Function1) objM87133R4;
                    }
                    if (i15 != 0) {
                        objM87133R3 = c28655q5.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C38136a(27);
                            c28655q5.m87172p0(objM87133R3);
                        }
                        function12 = (Function1) objM87133R3;
                    } else {
                        function12 = function2;
                    }
                    if ((i14 & 16) != 0) {
                        c25307pM107058b = AbstractC33856c.m107058b();
                        i39 &= -57345;
                    } else {
                        c25307pM107058b = c25307p;
                    }
                    if (i17 != 0) {
                        objM87133R2 = c28655q5.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C38136a(28);
                            c28655q5.m87172p0(objM87133R2);
                        }
                        function13 = (Function1) objM87133R2;
                    } else {
                        function13 = function6;
                    }
                    if (i19 != 0) {
                        objM87133R = c28655q5.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C38136a(29);
                            c28655q5.m87172p0(objM87133R);
                        }
                        function7 = (Function1) objM87133R;
                    }
                    if ((i14 & 128) != 0) {
                        interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("StreaksScreen");
                        i39 &= -29360129;
                    }
                    InterfaceC34116n interfaceC34116n9 = interfaceC34116nM107848a;
                    function14 = function12;
                    c25307p3 = c25307pM107058b;
                    interfaceC34116n3 = interfaceC34116n9;
                    function15 = function7;
                    function16 = function5;
                    function17 = function13;
                }
                c28655q5.m87175r();
                context = (Context) c28655q5.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                aVarM107071b = viewState.getDialogState();
                if (aVarM107071b == null) {
                    c28655q5.m87150e0(-739534285);
                    c28655q5.m87173q(false);
                } else {
                    c28655q5.m87150e0(-739534284);
                    m122878p(aVarM107071b, function16, c28655q5, (i39 >> 3) & 112);
                    c28655q5.m87173q(false);
                }
                i26 = 458752 & i39;
                if (i26 == 131072) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87157i = z13 | c28655q5.m87157i(viewState);
                objM87133R5 = c28655q5.m87133R();
                c25307p4 = c25307p3;
                if (zM87157i) {
                    objM87133R5 = new a(function17, viewState, null);
                    c28655q5.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new a(function17, viewState, null);
                    c28655q5.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R5, null);
                c35022cM107070a = viewState.getData();
                if (c35022cM107070a == null) {
                    c28655q5.m87150e0(-738960940);
                    c28655q5.m87173q(false);
                    c28655q = c28655q5;
                } else {
                    c28655q5.m87150e0(-738960939);
                    i27 = b.f164241a[c35022cM107070a.getBackgroundType().ordinal()];
                    c2314t = C2314t.f9131w;
                    if (i27 != 1) {
                        modifierM44020Y = AbstractC15673b0.m44020Y(c2314t);
                    } else {
                        if (i27 == 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        modifierM44020Y = c2314t;
                    }
                    C2307m c2307m2 = C2299e.f9114w;
                    function18 = function16;
                    function19 = function14;
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m2, false);
                    iHashCode = Long.hashCode(c28655q5.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q5.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q5, modifierM44020Y);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q5.m87158i0();
                    function20 = function17;
                    if (c28655q5.f115903S) {
                        c28655q5.m87163l(c0213j);
                    } else {
                        c28655q5.m87178s0();
                    }
                    C0209i c0209i6 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q5, c0209i6, interfaceC39127r0M66763d4);
                    C0209i c0209i7 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q5, c0209i7, interfaceC28653p1M87165m8);
                    c0209i = C0217k.f732j;
                    context2 = context;
                    if (c28655q5.f115903S) {
                        i28 = i26;
                        if (!AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i8 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q5, c0209i8, modifierM118962N8);
                        Modifier modifierM66723l3 = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, c2314t));
                        InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m2, false);
                        iHashCode2 = Long.hashCode(c28655q5.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q5.m87165m();
                        Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q5, modifierM66723l3);
                        c28655q5.m87158i0();
                        if (c28655q5.f115903S) {
                            c28655q5.m87163l(c0213j);
                        } else {
                            c28655q5.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q5, c0209i6, interfaceC39127r0M66763d5);
                        AbstractC28683x.m87239G(c28655q5, c0209i7, interfaceC28653p1M87165m9);
                        if (c28655q5.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q5, c0209i8, modifierM118962N9);
                        f13 = 8;
                        f14 = 2 * f13;
                        interfaceC34116n4 = interfaceC34116n3;
                        Modifier modifierM92116f2 = AbstractC30060g.m92116f0(AbstractC15674c.m44085i(AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 2), 0.0f, 6 * f13, 0.0f, f14, 5), 10 * 4, null, 2, null), AbstractC30060g.m92099U(0, c28655q5, 1), 14);
                        C2305k c2305k3 = C2299e.f9111N;
                        C22957g c22957g3 = AbstractC22977m.f90652c;
                        i29 = i39;
                        C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q5, 48);
                        iHashCode3 = Long.hashCode(c28655q5.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q5.m87165m();
                        Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q5, modifierM92116f2);
                        c28655q5.m87158i0();
                        if (c28655q5.f115903S) {
                            c28655q5.m87163l(c0213j);
                        } else {
                            c28655q5.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q5, c0209i6, c23010xM66775a5);
                        AbstractC28683x.m87239G(c28655q5, c0209i7, interfaceC28653p1M87165m10);
                        if (c28655q5.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q5, c0209i8, modifierM118962N10);
                        m122859E(c35022cM107070a, viewState, c28655q5, (i29 << 3) & 112);
                        Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                        if (c35022cM107070a.getTitleSubtitle() == null) {
                            z14 = true;
                            modifierM3392n = AbstractC1099a.m3392n(c2314t, 0.0f, (-16) * f13, 1);
                        } else {
                            z14 = true;
                            modifierM3392n = c2314t;
                        }
                        Modifier modifierMo3471e3 = modifierM3409f3.mo3471e(modifierM3392n);
                        C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q5, 48);
                        iHashCode4 = Long.hashCode(c28655q5.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q5.m87165m();
                        Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q5, modifierMo3471e3);
                        c28655q5.m87158i0();
                        if (c28655q5.f115903S) {
                            c28655q5.m87163l(c0213j);
                        } else {
                            c28655q5.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q5, c0209i6, c23010xM66775a6);
                        AbstractC28683x.m87239G(c28655q5, c0209i7, interfaceC28653p1M87165m11);
                        if (c28655q5.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q5, iHashCode4, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q5, iHashCode4, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q5, c0209i8, modifierM118962N11);
                        c33194k1M110695m = c35022cM107070a.getTitleSubtitle();
                        c3 = 3;
                        if (c33194k1M110695m == null) {
                            c28655q5.m87150e0(-572141400);
                            c28655q5.m87173q(false);
                            c28655q2 = c28655q5;
                            c23454a0 = null;
                        } else {
                            c28655q5.m87150e0(-572141399);
                            AbstractC33191j1.m105171d(AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 2), 0.0f, 5 * f13, 0.0f, 0.0f, 13), c33194k1M110695m, null, c28655q5, (C33194k1.f138384l << 3) | 6, 4);
                            c28655q2 = c28655q5;
                            AbstractC25012a.m73389v(c2314t, f14, c28655q2, false);
                            c23454a0 = C23454a0.f92919a;
                        }
                        if (c23454a0 == null) {
                            c28655q2.m87150e0(-571650328);
                            if (AbstractC8693b.m21270d(c35022cM107070a.getStreakValue())) {
                                c28655q2.m87150e0(1316319624);
                                String strM21274h3 = AbstractC8693b.m21274h(c35022cM107070a.getStreakValue(), c28655q2, TextResource.$stable);
                                C2886a c2886aM8442w3 = C38072d.f163053a.m121952e(c28655q2, C38072d.f163054b).getN2();
                                long jMo134584toComposableColorWaAFU9c3 = c35022cM107070a.getStreakTextColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
                                int i411 = C2886a.f11498d << 18;
                                C28655q c28655q14 = c28655q2;
                                c28676v1 = c28676v0;
                                z15 = false;
                                i34 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                                AbstractC30795n.m94707h(strM21274h3, null, jMo134584toComposableColorWaAFU9c3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8442w3, null, c28655q14, 0, i411, 196602);
                                c28655q4 = c28655q14;
                                c28655q4.m87173q(false);
                            } else {
                                c28655q4 = c28655q2;
                                c28676v1 = c28676v0;
                                z15 = false;
                                i34 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                                c28655q4.m87150e0(1316612698);
                                c28655q4.m87173q(false);
                            }
                            if (AbstractC8693b.m21270d(c35022cM107070a.getStreakSubtitle())) {
                                c28655q4.m87150e0(1316721477);
                                C28655q c28655q15 = c28655q4;
                                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c35022cM107070a.getStreakSubtitle(), c28655q4, TextResource.$stable), null, c35022cM107070a.getStreakTextColor().mo134584toComposableColorWaAFU9c(c28655q4, z15 ? 1 : 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q4, C38072d.f163054b).getH3(), null, c28655q15, 0, C2886a.f11498d << 18, 196602);
                                c28655q3 = c28655q15;
                                c28655q3.m87173q(z15);
                            } else {
                                c28655q3 = c28655q4;
                                c28655q3.m87150e0(1317017434);
                                c28655q3.m87173q(z15);
                            }
                            if (AbstractC8693b.m21270d(c35022cM107070a.getStreakValue())) {
                                c28655q3.m87150e0(1317120013);
                                AbstractC31061c.m95650z(3, f13, c2314t, c28655q3, z15);
                            } else {
                                c28655q3.m87150e0(1317120013);
                                AbstractC31061c.m95650z(3, f13, c2314t, c28655q3, z15);
                            }
                            c28655q3.m87173q(z15);
                        } else {
                            c35022cM107070a = c35022cM107070a;
                            z14 = z14;
                            c28676v1 = c28676v0;
                            i34 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                            c28655q3 = c28655q2;
                            z15 = false;
                            c28655q3.m87150e0(-849739733);
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87150e0(-849687131);
                        while (r14.hasNext()) {
                            C13258u c13258u3 = new C13258u(5, interfaceC25312u2);
                            boolean z212 = (c28655q3.m87157i(interfaceC25312u2) ? 1 : 0) | (c28655q3.m87157i(interactionJson) ? 1 : 0);
                            i36 = i29;
                            if ((i36 & 896) == 256) {
                                z19 = z14;
                            } else {
                                z19 = z15;
                            }
                            boolean z213 = z212 | z19;
                            if ((i36 & 7168) == i34) {
                                z24 = z14;
                            } else {
                                z24 = z15;
                            }
                            boolean z310 = (z213 ? 1 : 0) | z24;
                            interfaceC34116n5 = interfaceC34116n4;
                            boolean z311 = z310 | (c28655q3.m87157i(interfaceC34116n5) ? 1 : 0);
                            char c15 = c3;
                            i37 = i28;
                            if (i37 == 131072) {
                                z25 = true;
                            } else {
                                z25 = z15;
                            }
                            context3 = context2;
                            z26 = (((z311 ? 1 : 0) | z25) | (c28655q3.m87157i(c35022cM107070a) ? 1 : 0) ? 1 : 0) | (c28655q3.m87157i(context3) ? 1 : 0);
                            Object objM87133R11 = c28655q3.m87133R();
                            if (z26 == 0) {
                                context4 = context3;
                                interfaceC25312u = interfaceC25312u2;
                                interfaceC34116n6 = interfaceC34116n5;
                                function21 = function18;
                                function22 = function19;
                                function23 = function20;
                                z27 = true;
                                c1019g0 = new C1019g0(interfaceC25312u, abstractC0757c, function21, function22, interfaceC34116n6, function23, c35022cM107070a, context4);
                                c28655q3.m87172p0(c1019g0);
                            } else {
                                context4 = context3;
                                interfaceC25312u = interfaceC25312u2;
                                interfaceC34116n6 = interfaceC34116n5;
                                function21 = function18;
                                function22 = function19;
                                function23 = function20;
                                z27 = true;
                                c1019g0 = new C1019g0(interfaceC25312u, abstractC0757c, function21, function22, interfaceC34116n6, function23, c35022cM107070a, context4);
                                c28655q3.m87172p0(c1019g0);
                            }
                            AbstractC25303l.m74291r(interfaceC25312u, c25307p4, c13258u3, (Function1) c1019g0, c28655q3, (C25307p.f99300b << 3) | ((i36 >> 9) & 112), 0);
                            interactionJson = abstractC0757c;
                            i29 = i36;
                            function18 = function21;
                            function19 = function22;
                            interfaceC34116n4 = interfaceC34116n6;
                            function20 = function23;
                            context2 = context4;
                            z14 = z27;
                            c3 = c15;
                            i28 = i37;
                        }
                        z16 = z14;
                        function16 = function18;
                        function14 = function19;
                        function17 = function20;
                        Context context7 = context2;
                        int i412 = i28;
                        interfaceC34116n3 = interfaceC34116n4;
                        i35 = i29;
                        c28655q3.m87173q(z15);
                        c28655q3.m87173q(z16);
                        c28655q3.m87173q(z16);
                        if (c35022cM107070a.getHeaderIcon() != null) {
                            z17 = z16;
                            c28655q3.m87150e0(-1943357594);
                            AbstractC6721d.a aVar5 = new AbstractC6721d.a(c35022cM107070a.getTitle(), null, AbstractC13673n.m38561h(C38072d.f163053a), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                            if ((i35 & 7168) == i34) {
                                z18 = z17;
                            } else {
                                z18 = z15;
                            }
                            objM87133R6 = c28655q3.m87133R();
                            if (z18) {
                                objM87133R6 = new C36681f(function14, 22);
                                c28655q3.m87172p0(objM87133R6);
                            } else {
                                objM87133R6 = new C36681f(function14, 22);
                                c28655q3.m87172p0(objM87133R6);
                            }
                            C28655q c28655q16 = c28655q3;
                            AbstractC6719b.m20143d(null, aVar5, null, (InterfaceC4339a) objM87133R6, null, null, c28655q16, AbstractC6721d.a.f25641r << 3, 53);
                            c28655q = c28655q16;
                            c28655q.m87173q(z15);
                        } else {
                            z17 = z16;
                            c28655q3.m87150e0(-1943357594);
                            AbstractC6721d.a aVar6 = new AbstractC6721d.a(c35022cM107070a.getTitle(), null, AbstractC13673n.m38561h(C38072d.f163053a), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                            if ((i35 & 7168) == i34) {
                                z18 = z17;
                            } else {
                                z18 = z15;
                            }
                            objM87133R6 = c28655q3.m87133R();
                            if (z18) {
                                objM87133R6 = new C36681f(function14, 22);
                                c28655q3.m87172p0(objM87133R6);
                            } else {
                                objM87133R6 = new C36681f(function14, 22);
                                c28655q3.m87172p0(objM87133R6);
                            }
                            C28655q c28655q17 = c28655q3;
                            AbstractC6719b.m20143d(null, aVar6, null, (InterfaceC4339a) objM87133R6, null, null, c28655q17, AbstractC6721d.a.f25641r << 3, 53);
                            c28655q = c28655q17;
                            c28655q.m87173q(z15);
                        }
                        viewState.getStreaksLottieState().getShowLottieTesterFab();
                        c28655q.m87150e0(-1942126770);
                        c28655q.m87173q(z15);
                        viewState.getStreaksLottieState().getShowLottieTesterSheet();
                        c28655q.m87150e0(-1941652594);
                        AbstractC2875y.m8286B(c28655q, z15, z17, z17, z15);
                    } else {
                        i28 = i26;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i);
                    C0209i c0209i9 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q5, c0209i9, modifierM118962N8);
                    Modifier modifierM66723l4 = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, c2314t));
                    InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m2, false);
                    iHashCode2 = Long.hashCode(c28655q5.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q5.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q5, modifierM66723l4);
                    c28655q5.m87158i0();
                    if (c28655q5.f115903S) {
                        c28655q5.m87163l(c0213j);
                    } else {
                        c28655q5.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q5, c0209i6, interfaceC39127r0M66763d6);
                    AbstractC28683x.m87239G(c28655q5, c0209i7, interfaceC28653p1M87165m12);
                    if (c28655q5.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q5, c0209i9, modifierM118962N12);
                    f13 = 8;
                    f14 = 2 * f13;
                    interfaceC34116n4 = interfaceC34116n3;
                    Modifier modifierM92116f3 = AbstractC30060g.m92116f0(AbstractC15674c.m44085i(AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 2), 0.0f, 6 * f13, 0.0f, f14, 5), 10 * 4, null, 2, null), AbstractC30060g.m92099U(0, c28655q5, 1), 14);
                    C2305k c2305k4 = C2299e.f9111N;
                    C22957g c22957g4 = AbstractC22977m.f90652c;
                    i29 = i39;
                    C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q5, 48);
                    iHashCode3 = Long.hashCode(c28655q5.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q5.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q5, modifierM92116f3);
                    c28655q5.m87158i0();
                    if (c28655q5.f115903S) {
                        c28655q5.m87163l(c0213j);
                    } else {
                        c28655q5.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q5, c0209i6, c23010xM66775a7);
                    AbstractC28683x.m87239G(c28655q5, c0209i7, interfaceC28653p1M87165m13);
                    if (c28655q5.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q5, c0209i9, modifierM118962N13);
                    m122859E(c35022cM107070a, viewState, c28655q5, (i29 << 3) & 112);
                    Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                    if (c35022cM107070a.getTitleSubtitle() == null) {
                        z14 = true;
                        modifierM3392n = AbstractC1099a.m3392n(c2314t, 0.0f, (-16) * f13, 1);
                    } else {
                        z14 = true;
                        modifierM3392n = c2314t;
                    }
                    Modifier modifierMo3471e4 = modifierM3409f4.mo3471e(modifierM3392n);
                    C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q5, 48);
                    iHashCode4 = Long.hashCode(c28655q5.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q5.m87165m();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q5, modifierMo3471e4);
                    c28655q5.m87158i0();
                    if (c28655q5.f115903S) {
                        c28655q5.m87163l(c0213j);
                    } else {
                        c28655q5.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q5, c0209i6, c23010xM66775a8);
                    AbstractC28683x.m87239G(c28655q5, c0209i7, interfaceC28653p1M87165m14);
                    if (c28655q5.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q5, iHashCode4, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q5, iHashCode4, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q5, c0209i9, modifierM118962N14);
                    c33194k1M110695m = c35022cM107070a.getTitleSubtitle();
                    c3 = 3;
                    if (c33194k1M110695m == null) {
                        c28655q5.m87150e0(-572141400);
                        c28655q5.m87173q(false);
                        c28655q2 = c28655q5;
                        c23454a0 = null;
                    } else {
                        c28655q5.m87150e0(-572141399);
                        AbstractC33191j1.m105171d(AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 2), 0.0f, 5 * f13, 0.0f, 0.0f, 13), c33194k1M110695m, null, c28655q5, (C33194k1.f138384l << 3) | 6, 4);
                        c28655q2 = c28655q5;
                        AbstractC25012a.m73389v(c2314t, f14, c28655q2, false);
                        c23454a0 = C23454a0.f92919a;
                    }
                    if (c23454a0 == null) {
                        c28655q2.m87150e0(-571650328);
                        if (AbstractC8693b.m21270d(c35022cM107070a.getStreakValue())) {
                            c28655q2.m87150e0(1316319624);
                            String strM21274h4 = AbstractC8693b.m21274h(c35022cM107070a.getStreakValue(), c28655q2, TextResource.$stable);
                            C2886a c2886aM8442w4 = C38072d.f163053a.m121952e(c28655q2, C38072d.f163054b).getN2();
                            long jMo134584toComposableColorWaAFU9c4 = c35022cM107070a.getStreakTextColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
                            int i413 = C2886a.f11498d << 18;
                            C28655q c28655q18 = c28655q2;
                            c28676v1 = c28676v0;
                            z15 = false;
                            i34 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                            AbstractC30795n.m94707h(strM21274h4, null, jMo134584toComposableColorWaAFU9c4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8442w4, null, c28655q18, 0, i413, 196602);
                            c28655q4 = c28655q18;
                            c28655q4.m87173q(false);
                        } else {
                            c28655q4 = c28655q2;
                            c28676v1 = c28676v0;
                            z15 = false;
                            i34 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                            c28655q4.m87150e0(1316612698);
                            c28655q4.m87173q(false);
                        }
                        if (AbstractC8693b.m21270d(c35022cM107070a.getStreakSubtitle())) {
                            c28655q4.m87150e0(1316721477);
                            C28655q c28655q19 = c28655q4;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c35022cM107070a.getStreakSubtitle(), c28655q4, TextResource.$stable), null, c35022cM107070a.getStreakTextColor().mo134584toComposableColorWaAFU9c(c28655q4, z15 ? 1 : 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q4, C38072d.f163054b).getH3(), null, c28655q19, 0, C2886a.f11498d << 18, 196602);
                            c28655q3 = c28655q19;
                            c28655q3.m87173q(z15);
                        } else {
                            c28655q3 = c28655q4;
                            c28655q3.m87150e0(1317017434);
                            c28655q3.m87173q(z15);
                        }
                        if (AbstractC8693b.m21270d(c35022cM107070a.getStreakValue())) {
                            c28655q3.m87150e0(1317120013);
                            AbstractC31061c.m95650z(3, f13, c2314t, c28655q3, z15);
                        } else {
                            c28655q3.m87150e0(1317120013);
                            AbstractC31061c.m95650z(3, f13, c2314t, c28655q3, z15);
                        }
                        c28655q3.m87173q(z15);
                    } else {
                        c35022cM107070a = c35022cM107070a;
                        z14 = z14;
                        c28676v1 = c28676v0;
                        i34 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        c28655q3 = c28655q2;
                        z15 = false;
                        c28655q3.m87150e0(-849739733);
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87150e0(-849687131);
                    while (r14.hasNext()) {
                        C13258u c13258u4 = new C13258u(5, interfaceC25312u2);
                        boolean z214 = (c28655q3.m87157i(interfaceC25312u2) ? 1 : 0) | (c28655q3.m87157i(interactionJson) ? 1 : 0);
                        i36 = i29;
                        if ((i36 & 896) == 256) {
                            z19 = z14;
                        } else {
                            z19 = z15;
                        }
                        boolean z215 = z214 | z19;
                        if ((i36 & 7168) == i34) {
                            z24 = z14;
                        } else {
                            z24 = z15;
                        }
                        boolean z312 = (z215 ? 1 : 0) | z24;
                        interfaceC34116n5 = interfaceC34116n4;
                        boolean z313 = z312 | (c28655q3.m87157i(interfaceC34116n5) ? 1 : 0);
                        char c16 = c3;
                        i37 = i28;
                        if (i37 == 131072) {
                            z25 = true;
                        } else {
                            z25 = z15;
                        }
                        context3 = context2;
                        z26 = (((z313 ? 1 : 0) | z25) | (c28655q3.m87157i(c35022cM107070a) ? 1 : 0) ? 1 : 0) | (c28655q3.m87157i(context3) ? 1 : 0);
                        Object objM87133R12 = c28655q3.m87133R();
                        if (z26 == 0) {
                            context4 = context3;
                            interfaceC25312u = interfaceC25312u2;
                            interfaceC34116n6 = interfaceC34116n5;
                            function21 = function18;
                            function22 = function19;
                            function23 = function20;
                            z27 = true;
                            c1019g0 = new C1019g0(interfaceC25312u, abstractC0757c, function21, function22, interfaceC34116n6, function23, c35022cM107070a, context4);
                            c28655q3.m87172p0(c1019g0);
                        } else {
                            context4 = context3;
                            interfaceC25312u = interfaceC25312u2;
                            interfaceC34116n6 = interfaceC34116n5;
                            function21 = function18;
                            function22 = function19;
                            function23 = function20;
                            z27 = true;
                            c1019g0 = new C1019g0(interfaceC25312u, abstractC0757c, function21, function22, interfaceC34116n6, function23, c35022cM107070a, context4);
                            c28655q3.m87172p0(c1019g0);
                        }
                        AbstractC25303l.m74291r(interfaceC25312u, c25307p4, c13258u4, (Function1) c1019g0, c28655q3, (C25307p.f99300b << 3) | ((i36 >> 9) & 112), 0);
                        interactionJson = abstractC0757c;
                        i29 = i36;
                        function18 = function21;
                        function19 = function22;
                        interfaceC34116n4 = interfaceC34116n6;
                        function20 = function23;
                        context2 = context4;
                        z14 = z27;
                        c3 = c16;
                        i28 = i37;
                    }
                    z16 = z14;
                    function16 = function18;
                    function14 = function19;
                    function17 = function20;
                    Context context8 = context2;
                    int i414 = i28;
                    interfaceC34116n3 = interfaceC34116n4;
                    i35 = i29;
                    c28655q3.m87173q(z15);
                    c28655q3.m87173q(z16);
                    c28655q3.m87173q(z16);
                    if (c35022cM107070a.getHeaderIcon() != null) {
                        z17 = z16;
                        c28655q3.m87150e0(-1943357594);
                        AbstractC6721d.a aVar7 = new AbstractC6721d.a(c35022cM107070a.getTitle(), null, AbstractC13673n.m38561h(C38072d.f163053a), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                        if ((i35 & 7168) == i34) {
                            z18 = z17;
                        } else {
                            z18 = z15;
                        }
                        objM87133R6 = c28655q3.m87133R();
                        if (z18) {
                            objM87133R6 = new C36681f(function14, 22);
                            c28655q3.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C36681f(function14, 22);
                            c28655q3.m87172p0(objM87133R6);
                        }
                        C28655q c28655q110 = c28655q3;
                        AbstractC6719b.m20143d(null, aVar7, null, (InterfaceC4339a) objM87133R6, null, null, c28655q110, AbstractC6721d.a.f25641r << 3, 53);
                        c28655q = c28655q110;
                        c28655q.m87173q(z15);
                    } else {
                        z17 = z16;
                        c28655q3.m87150e0(-1943357594);
                        AbstractC6721d.a aVar8 = new AbstractC6721d.a(c35022cM107070a.getTitle(), null, AbstractC13673n.m38561h(C38072d.f163053a), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                        if ((i35 & 7168) == i34) {
                            z18 = z17;
                        } else {
                            z18 = z15;
                        }
                        objM87133R6 = c28655q3.m87133R();
                        if (z18) {
                            objM87133R6 = new C36681f(function14, 22);
                            c28655q3.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C36681f(function14, 22);
                            c28655q3.m87172p0(objM87133R6);
                        }
                        C28655q c28655q111 = c28655q3;
                        AbstractC6719b.m20143d(null, aVar8, null, (InterfaceC4339a) objM87133R6, null, null, c28655q111, AbstractC6721d.a.f25641r << 3, 53);
                        c28655q = c28655q111;
                        c28655q.m87173q(z15);
                    }
                    viewState.getStreaksLottieState().getShowLottieTesterFab();
                    c28655q.m87150e0(-1942126770);
                    c28655q.m87173q(z15);
                    viewState.getStreaksLottieState().getShowLottieTesterSheet();
                    c28655q.m87150e0(-1941652594);
                    AbstractC2875y.m8286B(c28655q, z15, z17, z17, z15);
                }
                function10 = function16;
                function8 = function14;
                function11 = function17;
                c25307p2 = c25307p4;
                interfaceC34116n2 = interfaceC34116n3;
                function9 = function15;
            } else {
                c28655q = c28655q5;
                c28655q.m87138X();
                function8 = function2;
                function9 = function7;
                interfaceC34116n2 = interfaceC34116nM107848a;
                function10 = function5;
                function11 = function6;
                c25307p2 = c25307p;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2880b(viewState, abstractC0757c, function10, function8, c25307p2, function11, function9, interfaceC34116n2, i13, i14);
            }
        }
        i39 |= 384;
        function5 = function1;
        i15 = i14 & 8;
        if (i15 != 0) {
            if ((i13 & 3072) == 0) {
                if (c28655q5.m87157i(function2)) {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i39 |= i16;
            }
            if ((i13 & 24576) == 0) {
                if ((i14 & 16) != 0) {
                    i38 = DfuBaseService.ERROR_REMOTE_MASK;
                } else {
                    if ((32768 & i13) == 0) {
                        zM87157i2 = c28655q5.m87153g(c25307p);
                    } else {
                        zM87157i2 = c28655q5.m87157i(c25307p);
                    }
                    if (zM87157i2) {
                        i38 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i38 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                }
                i39 |= i38;
            }
            i17 = i14 & 32;
            if (i17 != 0) {
                i39 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                function6 = function3;
            } else {
                function6 = function3;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q5.m87157i(function6)) {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i39 |= i18;
                }
            }
            i19 = i14 & 64;
            if (i19 != 0) {
                i39 |= 1572864;
                function7 = function4;
            } else {
                function7 = function4;
                if ((i13 & 1572864) == 0) {
                    if (c28655q5.m87157i(function7)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i39 |= i24;
                }
            }
            if ((i13 & 12582912) == 0) {
                if ((i14 & 128) == 0) {
                    interfaceC34116nM107848a = interfaceC34116n;
                    if (c28655q5.m87157i(interfaceC34116nM107848a)) {
                    }
                    i39 |= i45;
                } else {
                    interfaceC34116nM107848a = interfaceC34116n;
                }
                i39 |= i45;
            } else {
                interfaceC34116nM107848a = interfaceC34116n;
            }
            if ((i39 & 4793491) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q5.m87135U(i39 & 1, z4)) {
                c28655q5.m87140Z();
                i25 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i25 != 0) {
                    if (i44 != 0) {
                        objM87133R4 = c28655q5.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C38136a(26);
                            c28655q5.m87172p0(objM87133R4);
                        }
                        function5 = (Function1) objM87133R4;
                    }
                    if (i15 != 0) {
                        objM87133R3 = c28655q5.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C38136a(27);
                            c28655q5.m87172p0(objM87133R3);
                        }
                        function12 = (Function1) objM87133R3;
                    } else {
                        function12 = function2;
                    }
                    if ((i14 & 16) != 0) {
                        c25307pM107058b = AbstractC33856c.m107058b();
                        i39 &= -57345;
                    } else {
                        c25307pM107058b = c25307p;
                    }
                    if (i17 != 0) {
                        objM87133R2 = c28655q5.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C38136a(28);
                            c28655q5.m87172p0(objM87133R2);
                        }
                        function13 = (Function1) objM87133R2;
                    } else {
                        function13 = function6;
                    }
                    if (i19 != 0) {
                        objM87133R = c28655q5.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C38136a(29);
                            c28655q5.m87172p0(objM87133R);
                        }
                        function7 = (Function1) objM87133R;
                    }
                    if ((i14 & 128) != 0) {
                        interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("StreaksScreen");
                        i39 &= -29360129;
                    }
                    InterfaceC34116n interfaceC34116n10 = interfaceC34116nM107848a;
                    function14 = function12;
                    c25307p3 = c25307pM107058b;
                    interfaceC34116n3 = interfaceC34116n10;
                    function15 = function7;
                    function16 = function5;
                    function17 = function13;
                } else {
                    if (i44 != 0) {
                        objM87133R4 = c28655q5.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C38136a(26);
                            c28655q5.m87172p0(objM87133R4);
                        }
                        function5 = (Function1) objM87133R4;
                    }
                    if (i15 != 0) {
                        objM87133R3 = c28655q5.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C38136a(27);
                            c28655q5.m87172p0(objM87133R3);
                        }
                        function12 = (Function1) objM87133R3;
                    } else {
                        function12 = function2;
                    }
                    if ((i14 & 16) != 0) {
                        c25307pM107058b = AbstractC33856c.m107058b();
                        i39 &= -57345;
                    } else {
                        c25307pM107058b = c25307p;
                    }
                    if (i17 != 0) {
                        objM87133R2 = c28655q5.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C38136a(28);
                            c28655q5.m87172p0(objM87133R2);
                        }
                        function13 = (Function1) objM87133R2;
                    } else {
                        function13 = function6;
                    }
                    if (i19 != 0) {
                        objM87133R = c28655q5.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C38136a(29);
                            c28655q5.m87172p0(objM87133R);
                        }
                        function7 = (Function1) objM87133R;
                    }
                    if ((i14 & 128) != 0) {
                        interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("StreaksScreen");
                        i39 &= -29360129;
                    }
                    InterfaceC34116n interfaceC34116n11 = interfaceC34116nM107848a;
                    function14 = function12;
                    c25307p3 = c25307pM107058b;
                    interfaceC34116n3 = interfaceC34116n11;
                    function15 = function7;
                    function16 = function5;
                    function17 = function13;
                }
                c28655q5.m87175r();
                context = (Context) c28655q5.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                aVarM107071b = viewState.getDialogState();
                if (aVarM107071b == null) {
                    c28655q5.m87150e0(-739534285);
                    c28655q5.m87173q(false);
                } else {
                    c28655q5.m87150e0(-739534284);
                    m122878p(aVarM107071b, function16, c28655q5, (i39 >> 3) & 112);
                    c28655q5.m87173q(false);
                }
                i26 = 458752 & i39;
                if (i26 == 131072) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87157i = z13 | c28655q5.m87157i(viewState);
                objM87133R5 = c28655q5.m87133R();
                c25307p4 = c25307p3;
                if (zM87157i) {
                    objM87133R5 = new a(function17, viewState, null);
                    c28655q5.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new a(function17, viewState, null);
                    c28655q5.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R5, null);
                c35022cM107070a = viewState.getData();
                if (c35022cM107070a == null) {
                    c28655q5.m87150e0(-738960940);
                    c28655q5.m87173q(false);
                    c28655q = c28655q5;
                } else {
                    c28655q5.m87150e0(-738960939);
                    i27 = b.f164241a[c35022cM107070a.getBackgroundType().ordinal()];
                    c2314t = C2314t.f9131w;
                    if (i27 != 1) {
                        modifierM44020Y = AbstractC15673b0.m44020Y(c2314t);
                    } else {
                        if (i27 == 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        modifierM44020Y = c2314t;
                    }
                    C2307m c2307m3 = C2299e.f9114w;
                    function18 = function16;
                    function19 = function14;
                    InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m3, false);
                    iHashCode = Long.hashCode(c28655q5.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q5.m87165m();
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q5, modifierM44020Y);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q5.m87158i0();
                    function20 = function17;
                    if (c28655q5.f115903S) {
                        c28655q5.m87163l(c0213j);
                    } else {
                        c28655q5.m87178s0();
                    }
                    C0209i c0209i10 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q5, c0209i10, interfaceC39127r0M66763d7);
                    C0209i c0209i11 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q5, c0209i11, interfaceC28653p1M87165m15);
                    c0209i = C0217k.f732j;
                    context2 = context;
                    if (c28655q5.f115903S) {
                        i28 = i26;
                        if (!AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i12 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q5, c0209i12, modifierM118962N15);
                        Modifier modifierM66723l5 = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, c2314t));
                        InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m3, false);
                        iHashCode2 = Long.hashCode(c28655q5.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q5.m87165m();
                        Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q5, modifierM66723l5);
                        c28655q5.m87158i0();
                        if (c28655q5.f115903S) {
                            c28655q5.m87163l(c0213j);
                        } else {
                            c28655q5.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q5, c0209i10, interfaceC39127r0M66763d8);
                        AbstractC28683x.m87239G(c28655q5, c0209i11, interfaceC28653p1M87165m16);
                        if (c28655q5.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q5, c0209i12, modifierM118962N16);
                        f13 = 8;
                        f14 = 2 * f13;
                        interfaceC34116n4 = interfaceC34116n3;
                        Modifier modifierM92116f4 = AbstractC30060g.m92116f0(AbstractC15674c.m44085i(AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 2), 0.0f, 6 * f13, 0.0f, f14, 5), 10 * 4, null, 2, null), AbstractC30060g.m92099U(0, c28655q5, 1), 14);
                        C2305k c2305k5 = C2299e.f9111N;
                        C22957g c22957g5 = AbstractC22977m.f90652c;
                        i29 = i39;
                        C23010x c23010xM66775a9 = AbstractC23007w.m66775a(c22957g5, c2305k5, c28655q5, 48);
                        iHashCode3 = Long.hashCode(c28655q5.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q5.m87165m();
                        Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q5, modifierM92116f4);
                        c28655q5.m87158i0();
                        if (c28655q5.f115903S) {
                            c28655q5.m87163l(c0213j);
                        } else {
                            c28655q5.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q5, c0209i10, c23010xM66775a9);
                        AbstractC28683x.m87239G(c28655q5, c0209i11, interfaceC28653p1M87165m17);
                        if (c28655q5.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q5, c0209i12, modifierM118962N17);
                        m122859E(c35022cM107070a, viewState, c28655q5, (i29 << 3) & 112);
                        Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t);
                        if (c35022cM107070a.getTitleSubtitle() == null) {
                            z14 = true;
                            modifierM3392n = AbstractC1099a.m3392n(c2314t, 0.0f, (-16) * f13, 1);
                        } else {
                            z14 = true;
                            modifierM3392n = c2314t;
                        }
                        Modifier modifierMo3471e5 = modifierM3409f5.mo3471e(modifierM3392n);
                        C23010x c23010xM66775a10 = AbstractC23007w.m66775a(c22957g5, c2305k5, c28655q5, 48);
                        iHashCode4 = Long.hashCode(c28655q5.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q5.m87165m();
                        Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q5, modifierMo3471e5);
                        c28655q5.m87158i0();
                        if (c28655q5.f115903S) {
                            c28655q5.m87163l(c0213j);
                        } else {
                            c28655q5.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q5, c0209i10, c23010xM66775a10);
                        AbstractC28683x.m87239G(c28655q5, c0209i11, interfaceC28653p1M87165m18);
                        if (c28655q5.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q5, iHashCode4, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q5, iHashCode4, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q5, c0209i12, modifierM118962N18);
                        c33194k1M110695m = c35022cM107070a.getTitleSubtitle();
                        c3 = 3;
                        if (c33194k1M110695m == null) {
                            c28655q5.m87150e0(-572141400);
                            c28655q5.m87173q(false);
                            c28655q2 = c28655q5;
                            c23454a0 = null;
                        } else {
                            c28655q5.m87150e0(-572141399);
                            AbstractC33191j1.m105171d(AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 2), 0.0f, 5 * f13, 0.0f, 0.0f, 13), c33194k1M110695m, null, c28655q5, (C33194k1.f138384l << 3) | 6, 4);
                            c28655q2 = c28655q5;
                            AbstractC25012a.m73389v(c2314t, f14, c28655q2, false);
                            c23454a0 = C23454a0.f92919a;
                        }
                        if (c23454a0 == null) {
                            c28655q2.m87150e0(-571650328);
                            if (AbstractC8693b.m21270d(c35022cM107070a.getStreakValue())) {
                                c28655q2.m87150e0(1316319624);
                                String strM21274h5 = AbstractC8693b.m21274h(c35022cM107070a.getStreakValue(), c28655q2, TextResource.$stable);
                                C2886a c2886aM8442w5 = C38072d.f163053a.m121952e(c28655q2, C38072d.f163054b).getN2();
                                long jMo134584toComposableColorWaAFU9c5 = c35022cM107070a.getStreakTextColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
                                int i415 = C2886a.f11498d << 18;
                                C28655q c28655q112 = c28655q2;
                                c28676v1 = c28676v0;
                                z15 = false;
                                i34 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                                AbstractC30795n.m94707h(strM21274h5, null, jMo134584toComposableColorWaAFU9c5, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8442w5, null, c28655q112, 0, i415, 196602);
                                c28655q4 = c28655q112;
                                c28655q4.m87173q(false);
                            } else {
                                c28655q4 = c28655q2;
                                c28676v1 = c28676v0;
                                z15 = false;
                                i34 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                                c28655q4.m87150e0(1316612698);
                                c28655q4.m87173q(false);
                            }
                            if (AbstractC8693b.m21270d(c35022cM107070a.getStreakSubtitle())) {
                                c28655q4.m87150e0(1316721477);
                                C28655q c28655q113 = c28655q4;
                                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c35022cM107070a.getStreakSubtitle(), c28655q4, TextResource.$stable), null, c35022cM107070a.getStreakTextColor().mo134584toComposableColorWaAFU9c(c28655q4, z15 ? 1 : 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q4, C38072d.f163054b).getH3(), null, c28655q113, 0, C2886a.f11498d << 18, 196602);
                                c28655q3 = c28655q113;
                                c28655q3.m87173q(z15);
                            } else {
                                c28655q3 = c28655q4;
                                c28655q3.m87150e0(1317017434);
                                c28655q3.m87173q(z15);
                            }
                            if (AbstractC8693b.m21270d(c35022cM107070a.getStreakValue())) {
                                c28655q3.m87150e0(1317120013);
                                AbstractC31061c.m95650z(3, f13, c2314t, c28655q3, z15);
                            } else {
                                c28655q3.m87150e0(1317120013);
                                AbstractC31061c.m95650z(3, f13, c2314t, c28655q3, z15);
                            }
                            c28655q3.m87173q(z15);
                        } else {
                            c35022cM107070a = c35022cM107070a;
                            z14 = z14;
                            c28676v1 = c28676v0;
                            i34 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                            c28655q3 = c28655q2;
                            z15 = false;
                            c28655q3.m87150e0(-849739733);
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87150e0(-849687131);
                        while (r14.hasNext()) {
                            C13258u c13258u5 = new C13258u(5, interfaceC25312u2);
                            boolean z216 = (c28655q3.m87157i(interfaceC25312u2) ? 1 : 0) | (c28655q3.m87157i(interactionJson) ? 1 : 0);
                            i36 = i29;
                            if ((i36 & 896) == 256) {
                                z19 = z14;
                            } else {
                                z19 = z15;
                            }
                            boolean z217 = z216 | z19;
                            if ((i36 & 7168) == i34) {
                                z24 = z14;
                            } else {
                                z24 = z15;
                            }
                            boolean z314 = (z217 ? 1 : 0) | z24;
                            interfaceC34116n5 = interfaceC34116n4;
                            boolean z315 = z314 | (c28655q3.m87157i(interfaceC34116n5) ? 1 : 0);
                            char c17 = c3;
                            i37 = i28;
                            if (i37 == 131072) {
                                z25 = true;
                            } else {
                                z25 = z15;
                            }
                            context3 = context2;
                            z26 = (((z315 ? 1 : 0) | z25) | (c28655q3.m87157i(c35022cM107070a) ? 1 : 0) ? 1 : 0) | (c28655q3.m87157i(context3) ? 1 : 0);
                            Object objM87133R13 = c28655q3.m87133R();
                            if (z26 == 0) {
                                context4 = context3;
                                interfaceC25312u = interfaceC25312u2;
                                interfaceC34116n6 = interfaceC34116n5;
                                function21 = function18;
                                function22 = function19;
                                function23 = function20;
                                z27 = true;
                                c1019g0 = new C1019g0(interfaceC25312u, abstractC0757c, function21, function22, interfaceC34116n6, function23, c35022cM107070a, context4);
                                c28655q3.m87172p0(c1019g0);
                            } else {
                                context4 = context3;
                                interfaceC25312u = interfaceC25312u2;
                                interfaceC34116n6 = interfaceC34116n5;
                                function21 = function18;
                                function22 = function19;
                                function23 = function20;
                                z27 = true;
                                c1019g0 = new C1019g0(interfaceC25312u, abstractC0757c, function21, function22, interfaceC34116n6, function23, c35022cM107070a, context4);
                                c28655q3.m87172p0(c1019g0);
                            }
                            AbstractC25303l.m74291r(interfaceC25312u, c25307p4, c13258u5, (Function1) c1019g0, c28655q3, (C25307p.f99300b << 3) | ((i36 >> 9) & 112), 0);
                            interactionJson = abstractC0757c;
                            i29 = i36;
                            function18 = function21;
                            function19 = function22;
                            interfaceC34116n4 = interfaceC34116n6;
                            function20 = function23;
                            context2 = context4;
                            z14 = z27;
                            c3 = c17;
                            i28 = i37;
                        }
                        z16 = z14;
                        function16 = function18;
                        function14 = function19;
                        function17 = function20;
                        Context context9 = context2;
                        int i416 = i28;
                        interfaceC34116n3 = interfaceC34116n4;
                        i35 = i29;
                        c28655q3.m87173q(z15);
                        c28655q3.m87173q(z16);
                        c28655q3.m87173q(z16);
                        if (c35022cM107070a.getHeaderIcon() != null) {
                            z17 = z16;
                            c28655q3.m87150e0(-1943357594);
                            AbstractC6721d.a aVar9 = new AbstractC6721d.a(c35022cM107070a.getTitle(), null, AbstractC13673n.m38561h(C38072d.f163053a), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                            if ((i35 & 7168) == i34) {
                                z18 = z17;
                            } else {
                                z18 = z15;
                            }
                            objM87133R6 = c28655q3.m87133R();
                            if (z18) {
                                objM87133R6 = new C36681f(function14, 22);
                                c28655q3.m87172p0(objM87133R6);
                            } else {
                                objM87133R6 = new C36681f(function14, 22);
                                c28655q3.m87172p0(objM87133R6);
                            }
                            C28655q c28655q114 = c28655q3;
                            AbstractC6719b.m20143d(null, aVar9, null, (InterfaceC4339a) objM87133R6, null, null, c28655q114, AbstractC6721d.a.f25641r << 3, 53);
                            c28655q = c28655q114;
                            c28655q.m87173q(z15);
                        } else {
                            z17 = z16;
                            c28655q3.m87150e0(-1943357594);
                            AbstractC6721d.a aVar10 = new AbstractC6721d.a(c35022cM107070a.getTitle(), null, AbstractC13673n.m38561h(C38072d.f163053a), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                            if ((i35 & 7168) == i34) {
                                z18 = z17;
                            } else {
                                z18 = z15;
                            }
                            objM87133R6 = c28655q3.m87133R();
                            if (z18) {
                                objM87133R6 = new C36681f(function14, 22);
                                c28655q3.m87172p0(objM87133R6);
                            } else {
                                objM87133R6 = new C36681f(function14, 22);
                                c28655q3.m87172p0(objM87133R6);
                            }
                            C28655q c28655q115 = c28655q3;
                            AbstractC6719b.m20143d(null, aVar10, null, (InterfaceC4339a) objM87133R6, null, null, c28655q115, AbstractC6721d.a.f25641r << 3, 53);
                            c28655q = c28655q115;
                            c28655q.m87173q(z15);
                        }
                        viewState.getStreaksLottieState().getShowLottieTesterFab();
                        c28655q.m87150e0(-1942126770);
                        c28655q.m87173q(z15);
                        viewState.getStreaksLottieState().getShowLottieTesterSheet();
                        c28655q.m87150e0(-1941652594);
                        AbstractC2875y.m8286B(c28655q, z15, z17, z17, z15);
                    } else {
                        i28 = i26;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i);
                    C0209i c0209i13 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q5, c0209i13, modifierM118962N15);
                    Modifier modifierM66723l6 = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, c2314t));
                    InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(c2307m3, false);
                    iHashCode2 = Long.hashCode(c28655q5.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q5.m87165m();
                    Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q5, modifierM66723l6);
                    c28655q5.m87158i0();
                    if (c28655q5.f115903S) {
                        c28655q5.m87163l(c0213j);
                    } else {
                        c28655q5.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q5, c0209i10, interfaceC39127r0M66763d9);
                    AbstractC28683x.m87239G(c28655q5, c0209i11, interfaceC28653p1M87165m19);
                    if (c28655q5.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q5, c0209i13, modifierM118962N19);
                    f13 = 8;
                    f14 = 2 * f13;
                    interfaceC34116n4 = interfaceC34116n3;
                    Modifier modifierM92116f5 = AbstractC30060g.m92116f0(AbstractC15674c.m44085i(AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 2), 0.0f, 6 * f13, 0.0f, f14, 5), 10 * 4, null, 2, null), AbstractC30060g.m92099U(0, c28655q5, 1), 14);
                    C2305k c2305k6 = C2299e.f9111N;
                    C22957g c22957g6 = AbstractC22977m.f90652c;
                    i29 = i39;
                    C23010x c23010xM66775a11 = AbstractC23007w.m66775a(c22957g6, c2305k6, c28655q5, 48);
                    iHashCode3 = Long.hashCode(c28655q5.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q5.m87165m();
                    Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q5, modifierM92116f5);
                    c28655q5.m87158i0();
                    if (c28655q5.f115903S) {
                        c28655q5.m87163l(c0213j);
                    } else {
                        c28655q5.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q5, c0209i10, c23010xM66775a11);
                    AbstractC28683x.m87239G(c28655q5, c0209i11, interfaceC28653p1M87165m110);
                    if (c28655q5.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q5, c0209i13, modifierM118962N110);
                    m122859E(c35022cM107070a, viewState, c28655q5, (i29 << 3) & 112);
                    Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t);
                    if (c35022cM107070a.getTitleSubtitle() == null) {
                        z14 = true;
                        modifierM3392n = AbstractC1099a.m3392n(c2314t, 0.0f, (-16) * f13, 1);
                    } else {
                        z14 = true;
                        modifierM3392n = c2314t;
                    }
                    Modifier modifierMo3471e6 = modifierM3409f6.mo3471e(modifierM3392n);
                    C23010x c23010xM66775a12 = AbstractC23007w.m66775a(c22957g6, c2305k6, c28655q5, 48);
                    iHashCode4 = Long.hashCode(c28655q5.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q5.m87165m();
                    Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q5, modifierMo3471e6);
                    c28655q5.m87158i0();
                    if (c28655q5.f115903S) {
                        c28655q5.m87163l(c0213j);
                    } else {
                        c28655q5.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q5, c0209i10, c23010xM66775a12);
                    AbstractC28683x.m87239G(c28655q5, c0209i11, interfaceC28653p1M87165m111);
                    if (c28655q5.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q5, iHashCode4, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q5, iHashCode4, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q5, c0209i13, modifierM118962N111);
                    c33194k1M110695m = c35022cM107070a.getTitleSubtitle();
                    c3 = 3;
                    if (c33194k1M110695m == null) {
                        c28655q5.m87150e0(-572141400);
                        c28655q5.m87173q(false);
                        c28655q2 = c28655q5;
                        c23454a0 = null;
                    } else {
                        c28655q5.m87150e0(-572141399);
                        AbstractC33191j1.m105171d(AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 2), 0.0f, 5 * f13, 0.0f, 0.0f, 13), c33194k1M110695m, null, c28655q5, (C33194k1.f138384l << 3) | 6, 4);
                        c28655q2 = c28655q5;
                        AbstractC25012a.m73389v(c2314t, f14, c28655q2, false);
                        c23454a0 = C23454a0.f92919a;
                    }
                    if (c23454a0 == null) {
                        c28655q2.m87150e0(-571650328);
                        if (AbstractC8693b.m21270d(c35022cM107070a.getStreakValue())) {
                            c28655q2.m87150e0(1316319624);
                            String strM21274h6 = AbstractC8693b.m21274h(c35022cM107070a.getStreakValue(), c28655q2, TextResource.$stable);
                            C2886a c2886aM8442w6 = C38072d.f163053a.m121952e(c28655q2, C38072d.f163054b).getN2();
                            long jMo134584toComposableColorWaAFU9c6 = c35022cM107070a.getStreakTextColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
                            int i417 = C2886a.f11498d << 18;
                            C28655q c28655q116 = c28655q2;
                            c28676v1 = c28676v0;
                            z15 = false;
                            i34 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                            AbstractC30795n.m94707h(strM21274h6, null, jMo134584toComposableColorWaAFU9c6, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8442w6, null, c28655q116, 0, i417, 196602);
                            c28655q4 = c28655q116;
                            c28655q4.m87173q(false);
                        } else {
                            c28655q4 = c28655q2;
                            c28676v1 = c28676v0;
                            z15 = false;
                            i34 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                            c28655q4.m87150e0(1316612698);
                            c28655q4.m87173q(false);
                        }
                        if (AbstractC8693b.m21270d(c35022cM107070a.getStreakSubtitle())) {
                            c28655q4.m87150e0(1316721477);
                            C28655q c28655q117 = c28655q4;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c35022cM107070a.getStreakSubtitle(), c28655q4, TextResource.$stable), null, c35022cM107070a.getStreakTextColor().mo134584toComposableColorWaAFU9c(c28655q4, z15 ? 1 : 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q4, C38072d.f163054b).getH3(), null, c28655q117, 0, C2886a.f11498d << 18, 196602);
                            c28655q3 = c28655q117;
                            c28655q3.m87173q(z15);
                        } else {
                            c28655q3 = c28655q4;
                            c28655q3.m87150e0(1317017434);
                            c28655q3.m87173q(z15);
                        }
                        if (AbstractC8693b.m21270d(c35022cM107070a.getStreakValue())) {
                            c28655q3.m87150e0(1317120013);
                            AbstractC31061c.m95650z(3, f13, c2314t, c28655q3, z15);
                        } else {
                            c28655q3.m87150e0(1317120013);
                            AbstractC31061c.m95650z(3, f13, c2314t, c28655q3, z15);
                        }
                        c28655q3.m87173q(z15);
                    } else {
                        c35022cM107070a = c35022cM107070a;
                        z14 = z14;
                        c28676v1 = c28676v0;
                        i34 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        c28655q3 = c28655q2;
                        z15 = false;
                        c28655q3.m87150e0(-849739733);
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87150e0(-849687131);
                    while (r14.hasNext()) {
                        C13258u c13258u6 = new C13258u(5, interfaceC25312u2);
                        boolean z218 = (c28655q3.m87157i(interfaceC25312u2) ? 1 : 0) | (c28655q3.m87157i(interactionJson) ? 1 : 0);
                        i36 = i29;
                        if ((i36 & 896) == 256) {
                            z19 = z14;
                        } else {
                            z19 = z15;
                        }
                        boolean z219 = z218 | z19;
                        if ((i36 & 7168) == i34) {
                            z24 = z14;
                        } else {
                            z24 = z15;
                        }
                        boolean z316 = (z219 ? 1 : 0) | z24;
                        interfaceC34116n5 = interfaceC34116n4;
                        boolean z317 = z316 | (c28655q3.m87157i(interfaceC34116n5) ? 1 : 0);
                        char c18 = c3;
                        i37 = i28;
                        if (i37 == 131072) {
                            z25 = true;
                        } else {
                            z25 = z15;
                        }
                        context3 = context2;
                        z26 = (((z317 ? 1 : 0) | z25) | (c28655q3.m87157i(c35022cM107070a) ? 1 : 0) ? 1 : 0) | (c28655q3.m87157i(context3) ? 1 : 0);
                        Object objM87133R14 = c28655q3.m87133R();
                        if (z26 == 0) {
                            context4 = context3;
                            interfaceC25312u = interfaceC25312u2;
                            interfaceC34116n6 = interfaceC34116n5;
                            function21 = function18;
                            function22 = function19;
                            function23 = function20;
                            z27 = true;
                            c1019g0 = new C1019g0(interfaceC25312u, abstractC0757c, function21, function22, interfaceC34116n6, function23, c35022cM107070a, context4);
                            c28655q3.m87172p0(c1019g0);
                        } else {
                            context4 = context3;
                            interfaceC25312u = interfaceC25312u2;
                            interfaceC34116n6 = interfaceC34116n5;
                            function21 = function18;
                            function22 = function19;
                            function23 = function20;
                            z27 = true;
                            c1019g0 = new C1019g0(interfaceC25312u, abstractC0757c, function21, function22, interfaceC34116n6, function23, c35022cM107070a, context4);
                            c28655q3.m87172p0(c1019g0);
                        }
                        AbstractC25303l.m74291r(interfaceC25312u, c25307p4, c13258u6, (Function1) c1019g0, c28655q3, (C25307p.f99300b << 3) | ((i36 >> 9) & 112), 0);
                        interactionJson = abstractC0757c;
                        i29 = i36;
                        function18 = function21;
                        function19 = function22;
                        interfaceC34116n4 = interfaceC34116n6;
                        function20 = function23;
                        context2 = context4;
                        z14 = z27;
                        c3 = c18;
                        i28 = i37;
                    }
                    z16 = z14;
                    function16 = function18;
                    function14 = function19;
                    function17 = function20;
                    Context context10 = context2;
                    int i418 = i28;
                    interfaceC34116n3 = interfaceC34116n4;
                    i35 = i29;
                    c28655q3.m87173q(z15);
                    c28655q3.m87173q(z16);
                    c28655q3.m87173q(z16);
                    if (c35022cM107070a.getHeaderIcon() != null) {
                        z17 = z16;
                        c28655q3.m87150e0(-1943357594);
                        AbstractC6721d.a aVar11 = new AbstractC6721d.a(c35022cM107070a.getTitle(), null, AbstractC13673n.m38561h(C38072d.f163053a), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                        if ((i35 & 7168) == i34) {
                            z18 = z17;
                        } else {
                            z18 = z15;
                        }
                        objM87133R6 = c28655q3.m87133R();
                        if (z18) {
                            objM87133R6 = new C36681f(function14, 22);
                            c28655q3.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C36681f(function14, 22);
                            c28655q3.m87172p0(objM87133R6);
                        }
                        C28655q c28655q118 = c28655q3;
                        AbstractC6719b.m20143d(null, aVar11, null, (InterfaceC4339a) objM87133R6, null, null, c28655q118, AbstractC6721d.a.f25641r << 3, 53);
                        c28655q = c28655q118;
                        c28655q.m87173q(z15);
                    } else {
                        z17 = z16;
                        c28655q3.m87150e0(-1943357594);
                        AbstractC6721d.a aVar12 = new AbstractC6721d.a(c35022cM107070a.getTitle(), null, AbstractC13673n.m38561h(C38072d.f163053a), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                        if ((i35 & 7168) == i34) {
                            z18 = z17;
                        } else {
                            z18 = z15;
                        }
                        objM87133R6 = c28655q3.m87133R();
                        if (z18) {
                            objM87133R6 = new C36681f(function14, 22);
                            c28655q3.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C36681f(function14, 22);
                            c28655q3.m87172p0(objM87133R6);
                        }
                        C28655q c28655q119 = c28655q3;
                        AbstractC6719b.m20143d(null, aVar12, null, (InterfaceC4339a) objM87133R6, null, null, c28655q119, AbstractC6721d.a.f25641r << 3, 53);
                        c28655q = c28655q119;
                        c28655q.m87173q(z15);
                    }
                    viewState.getStreaksLottieState().getShowLottieTesterFab();
                    c28655q.m87150e0(-1942126770);
                    c28655q.m87173q(z15);
                    viewState.getStreaksLottieState().getShowLottieTesterSheet();
                    c28655q.m87150e0(-1941652594);
                    AbstractC2875y.m8286B(c28655q, z15, z17, z17, z15);
                }
                function10 = function16;
                function8 = function14;
                function11 = function17;
                c25307p2 = c25307p4;
                interfaceC34116n2 = interfaceC34116n3;
                function9 = function15;
            } else {
                c28655q = c28655q5;
                c28655q.m87138X();
                function8 = function2;
                function9 = function7;
                interfaceC34116n2 = interfaceC34116nM107848a;
                function10 = function5;
                function11 = function6;
                c25307p2 = c25307p;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2880b(viewState, abstractC0757c, function10, function8, c25307p2, function11, function9, interfaceC34116n2, i13, i14);
            }
        }
        i39 |= 3072;
        if ((i13 & 24576) == 0) {
            if ((i14 & 16) != 0) {
                i38 = DfuBaseService.ERROR_REMOTE_MASK;
            } else {
                if ((32768 & i13) == 0) {
                    zM87157i2 = c28655q5.m87153g(c25307p);
                } else {
                    zM87157i2 = c28655q5.m87157i(c25307p);
                }
                if (zM87157i2) {
                    i38 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i38 = DfuBaseService.ERROR_REMOTE_MASK;
                }
            }
            i39 |= i38;
        }
        i17 = i14 & 32;
        if (i17 != 0) {
            i39 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            function6 = function3;
        } else {
            function6 = function3;
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q5.m87157i(function6)) {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i39 |= i18;
            }
        }
        i19 = i14 & 64;
        if (i19 != 0) {
            i39 |= 1572864;
            function7 = function4;
        } else {
            function7 = function4;
            if ((i13 & 1572864) == 0) {
                if (c28655q5.m87157i(function7)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i39 |= i24;
            }
        }
        if ((i13 & 12582912) == 0) {
            if ((i14 & 128) == 0) {
                interfaceC34116nM107848a = interfaceC34116n;
                if (c28655q5.m87157i(interfaceC34116nM107848a)) {
                }
                i39 |= i45;
            } else {
                interfaceC34116nM107848a = interfaceC34116n;
            }
            i39 |= i45;
        } else {
            interfaceC34116nM107848a = interfaceC34116n;
        }
        if ((i39 & 4793491) != 4793490) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q5.m87135U(i39 & 1, z4)) {
            c28655q5.m87140Z();
            i25 = i13 & 1;
            c28676v0 = C28635l.f115821a;
            if (i25 != 0) {
                if (i44 != 0) {
                    objM87133R4 = c28655q5.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C38136a(26);
                        c28655q5.m87172p0(objM87133R4);
                    }
                    function5 = (Function1) objM87133R4;
                }
                if (i15 != 0) {
                    objM87133R3 = c28655q5.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C38136a(27);
                        c28655q5.m87172p0(objM87133R3);
                    }
                    function12 = (Function1) objM87133R3;
                } else {
                    function12 = function2;
                }
                if ((i14 & 16) != 0) {
                    c25307pM107058b = AbstractC33856c.m107058b();
                    i39 &= -57345;
                } else {
                    c25307pM107058b = c25307p;
                }
                if (i17 != 0) {
                    objM87133R2 = c28655q5.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C38136a(28);
                        c28655q5.m87172p0(objM87133R2);
                    }
                    function13 = (Function1) objM87133R2;
                } else {
                    function13 = function6;
                }
                if (i19 != 0) {
                    objM87133R = c28655q5.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C38136a(29);
                        c28655q5.m87172p0(objM87133R);
                    }
                    function7 = (Function1) objM87133R;
                }
                if ((i14 & 128) != 0) {
                    interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("StreaksScreen");
                    i39 &= -29360129;
                }
                InterfaceC34116n interfaceC34116n12 = interfaceC34116nM107848a;
                function14 = function12;
                c25307p3 = c25307pM107058b;
                interfaceC34116n3 = interfaceC34116n12;
                function15 = function7;
                function16 = function5;
                function17 = function13;
            } else {
                if (i44 != 0) {
                    objM87133R4 = c28655q5.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C38136a(26);
                        c28655q5.m87172p0(objM87133R4);
                    }
                    function5 = (Function1) objM87133R4;
                }
                if (i15 != 0) {
                    objM87133R3 = c28655q5.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C38136a(27);
                        c28655q5.m87172p0(objM87133R3);
                    }
                    function12 = (Function1) objM87133R3;
                } else {
                    function12 = function2;
                }
                if ((i14 & 16) != 0) {
                    c25307pM107058b = AbstractC33856c.m107058b();
                    i39 &= -57345;
                } else {
                    c25307pM107058b = c25307p;
                }
                if (i17 != 0) {
                    objM87133R2 = c28655q5.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C38136a(28);
                        c28655q5.m87172p0(objM87133R2);
                    }
                    function13 = (Function1) objM87133R2;
                } else {
                    function13 = function6;
                }
                if (i19 != 0) {
                    objM87133R = c28655q5.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C38136a(29);
                        c28655q5.m87172p0(objM87133R);
                    }
                    function7 = (Function1) objM87133R;
                }
                if ((i14 & 128) != 0) {
                    interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("StreaksScreen");
                    i39 &= -29360129;
                }
                InterfaceC34116n interfaceC34116n13 = interfaceC34116nM107848a;
                function14 = function12;
                c25307p3 = c25307pM107058b;
                interfaceC34116n3 = interfaceC34116n13;
                function15 = function7;
                function16 = function5;
                function17 = function13;
            }
            c28655q5.m87175r();
            context = (Context) c28655q5.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            aVarM107071b = viewState.getDialogState();
            if (aVarM107071b == null) {
                c28655q5.m87150e0(-739534285);
                c28655q5.m87173q(false);
            } else {
                c28655q5.m87150e0(-739534284);
                m122878p(aVarM107071b, function16, c28655q5, (i39 >> 3) & 112);
                c28655q5.m87173q(false);
            }
            i26 = 458752 & i39;
            if (i26 == 131072) {
                z13 = true;
            } else {
                z13 = false;
            }
            zM87157i = z13 | c28655q5.m87157i(viewState);
            objM87133R5 = c28655q5.m87133R();
            c25307p4 = c25307p3;
            if (zM87157i) {
                objM87133R5 = new a(function17, viewState, null);
                c28655q5.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new a(function17, viewState, null);
                c28655q5.m87172p0(objM87133R5);
            }
            AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R5, null);
            c35022cM107070a = viewState.getData();
            if (c35022cM107070a == null) {
                c28655q5.m87150e0(-738960940);
                c28655q5.m87173q(false);
                c28655q = c28655q5;
            } else {
                c28655q5.m87150e0(-738960939);
                i27 = b.f164241a[c35022cM107070a.getBackgroundType().ordinal()];
                c2314t = C2314t.f9131w;
                if (i27 != 1) {
                    modifierM44020Y = AbstractC15673b0.m44020Y(c2314t);
                } else {
                    if (i27 == 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    modifierM44020Y = c2314t;
                }
                C2307m c2307m4 = C2299e.f9114w;
                function18 = function16;
                function19 = function14;
                InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(c2307m4, false);
                iHashCode = Long.hashCode(c28655q5.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q5.m87165m();
                Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q5, modifierM44020Y);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q5.m87158i0();
                function20 = function17;
                if (c28655q5.f115903S) {
                    c28655q5.m87163l(c0213j);
                } else {
                    c28655q5.m87178s0();
                }
                C0209i c0209i14 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q5, c0209i14, interfaceC39127r0M66763d10);
                C0209i c0209i15 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q5, c0209i15, interfaceC28653p1M87165m112);
                c0209i = C0217k.f732j;
                context2 = context;
                if (c28655q5.f115903S) {
                    i28 = i26;
                    if (!AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i16 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q5, c0209i16, modifierM118962N112);
                    Modifier modifierM66723l7 = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, c2314t));
                    InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(c2307m4, false);
                    iHashCode2 = Long.hashCode(c28655q5.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q5.m87165m();
                    Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q5, modifierM66723l7);
                    c28655q5.m87158i0();
                    if (c28655q5.f115903S) {
                        c28655q5.m87163l(c0213j);
                    } else {
                        c28655q5.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q5, c0209i14, interfaceC39127r0M66763d11);
                    AbstractC28683x.m87239G(c28655q5, c0209i15, interfaceC28653p1M87165m113);
                    if (c28655q5.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q5, c0209i16, modifierM118962N113);
                    f13 = 8;
                    f14 = 2 * f13;
                    interfaceC34116n4 = interfaceC34116n3;
                    Modifier modifierM92116f6 = AbstractC30060g.m92116f0(AbstractC15674c.m44085i(AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 2), 0.0f, 6 * f13, 0.0f, f14, 5), 10 * 4, null, 2, null), AbstractC30060g.m92099U(0, c28655q5, 1), 14);
                    C2305k c2305k7 = C2299e.f9111N;
                    C22957g c22957g7 = AbstractC22977m.f90652c;
                    i29 = i39;
                    C23010x c23010xM66775a13 = AbstractC23007w.m66775a(c22957g7, c2305k7, c28655q5, 48);
                    iHashCode3 = Long.hashCode(c28655q5.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q5.m87165m();
                    Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q5, modifierM92116f6);
                    c28655q5.m87158i0();
                    if (c28655q5.f115903S) {
                        c28655q5.m87163l(c0213j);
                    } else {
                        c28655q5.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q5, c0209i14, c23010xM66775a13);
                    AbstractC28683x.m87239G(c28655q5, c0209i15, interfaceC28653p1M87165m114);
                    if (c28655q5.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q5, c0209i16, modifierM118962N114);
                    m122859E(c35022cM107070a, viewState, c28655q5, (i29 << 3) & 112);
                    Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t);
                    if (c35022cM107070a.getTitleSubtitle() == null) {
                        z14 = true;
                        modifierM3392n = AbstractC1099a.m3392n(c2314t, 0.0f, (-16) * f13, 1);
                    } else {
                        z14 = true;
                        modifierM3392n = c2314t;
                    }
                    Modifier modifierMo3471e7 = modifierM3409f7.mo3471e(modifierM3392n);
                    C23010x c23010xM66775a14 = AbstractC23007w.m66775a(c22957g7, c2305k7, c28655q5, 48);
                    iHashCode4 = Long.hashCode(c28655q5.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q5.m87165m();
                    Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q5, modifierMo3471e7);
                    c28655q5.m87158i0();
                    if (c28655q5.f115903S) {
                        c28655q5.m87163l(c0213j);
                    } else {
                        c28655q5.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q5, c0209i14, c23010xM66775a14);
                    AbstractC28683x.m87239G(c28655q5, c0209i15, interfaceC28653p1M87165m115);
                    if (c28655q5.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q5, iHashCode4, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q5, iHashCode4, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q5, c0209i16, modifierM118962N115);
                    c33194k1M110695m = c35022cM107070a.getTitleSubtitle();
                    c3 = 3;
                    if (c33194k1M110695m == null) {
                        c28655q5.m87150e0(-572141400);
                        c28655q5.m87173q(false);
                        c28655q2 = c28655q5;
                        c23454a0 = null;
                    } else {
                        c28655q5.m87150e0(-572141399);
                        AbstractC33191j1.m105171d(AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 2), 0.0f, 5 * f13, 0.0f, 0.0f, 13), c33194k1M110695m, null, c28655q5, (C33194k1.f138384l << 3) | 6, 4);
                        c28655q2 = c28655q5;
                        AbstractC25012a.m73389v(c2314t, f14, c28655q2, false);
                        c23454a0 = C23454a0.f92919a;
                    }
                    if (c23454a0 == null) {
                        c28655q2.m87150e0(-571650328);
                        if (AbstractC8693b.m21270d(c35022cM107070a.getStreakValue())) {
                            c28655q2.m87150e0(1316319624);
                            String strM21274h7 = AbstractC8693b.m21274h(c35022cM107070a.getStreakValue(), c28655q2, TextResource.$stable);
                            C2886a c2886aM8442w7 = C38072d.f163053a.m121952e(c28655q2, C38072d.f163054b).getN2();
                            long jMo134584toComposableColorWaAFU9c7 = c35022cM107070a.getStreakTextColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
                            int i419 = C2886a.f11498d << 18;
                            C28655q c28655q1110 = c28655q2;
                            c28676v1 = c28676v0;
                            z15 = false;
                            i34 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                            AbstractC30795n.m94707h(strM21274h7, null, jMo134584toComposableColorWaAFU9c7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8442w7, null, c28655q1110, 0, i419, 196602);
                            c28655q4 = c28655q1110;
                            c28655q4.m87173q(false);
                        } else {
                            c28655q4 = c28655q2;
                            c28676v1 = c28676v0;
                            z15 = false;
                            i34 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                            c28655q4.m87150e0(1316612698);
                            c28655q4.m87173q(false);
                        }
                        if (AbstractC8693b.m21270d(c35022cM107070a.getStreakSubtitle())) {
                            c28655q4.m87150e0(1316721477);
                            C28655q c28655q1111 = c28655q4;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c35022cM107070a.getStreakSubtitle(), c28655q4, TextResource.$stable), null, c35022cM107070a.getStreakTextColor().mo134584toComposableColorWaAFU9c(c28655q4, z15 ? 1 : 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q4, C38072d.f163054b).getH3(), null, c28655q1111, 0, C2886a.f11498d << 18, 196602);
                            c28655q3 = c28655q1111;
                            c28655q3.m87173q(z15);
                        } else {
                            c28655q3 = c28655q4;
                            c28655q3.m87150e0(1317017434);
                            c28655q3.m87173q(z15);
                        }
                        if (AbstractC8693b.m21270d(c35022cM107070a.getStreakValue())) {
                            c28655q3.m87150e0(1317120013);
                            AbstractC31061c.m95650z(3, f13, c2314t, c28655q3, z15);
                        } else {
                            c28655q3.m87150e0(1317120013);
                            AbstractC31061c.m95650z(3, f13, c2314t, c28655q3, z15);
                        }
                        c28655q3.m87173q(z15);
                    } else {
                        c35022cM107070a = c35022cM107070a;
                        z14 = z14;
                        c28676v1 = c28676v0;
                        i34 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        c28655q3 = c28655q2;
                        z15 = false;
                        c28655q3.m87150e0(-849739733);
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87150e0(-849687131);
                    while (r14.hasNext()) {
                        C13258u c13258u7 = new C13258u(5, interfaceC25312u2);
                        boolean z2110 = (c28655q3.m87157i(interfaceC25312u2) ? 1 : 0) | (c28655q3.m87157i(interactionJson) ? 1 : 0);
                        i36 = i29;
                        if ((i36 & 896) == 256) {
                            z19 = z14;
                        } else {
                            z19 = z15;
                        }
                        boolean z2111 = z2110 | z19;
                        if ((i36 & 7168) == i34) {
                            z24 = z14;
                        } else {
                            z24 = z15;
                        }
                        boolean z318 = (z2111 ? 1 : 0) | z24;
                        interfaceC34116n5 = interfaceC34116n4;
                        boolean z319 = z318 | (c28655q3.m87157i(interfaceC34116n5) ? 1 : 0);
                        char c19 = c3;
                        i37 = i28;
                        if (i37 == 131072) {
                            z25 = true;
                        } else {
                            z25 = z15;
                        }
                        context3 = context2;
                        z26 = (((z319 ? 1 : 0) | z25) | (c28655q3.m87157i(c35022cM107070a) ? 1 : 0) ? 1 : 0) | (c28655q3.m87157i(context3) ? 1 : 0);
                        Object objM87133R15 = c28655q3.m87133R();
                        if (z26 == 0) {
                            context4 = context3;
                            interfaceC25312u = interfaceC25312u2;
                            interfaceC34116n6 = interfaceC34116n5;
                            function21 = function18;
                            function22 = function19;
                            function23 = function20;
                            z27 = true;
                            c1019g0 = new C1019g0(interfaceC25312u, abstractC0757c, function21, function22, interfaceC34116n6, function23, c35022cM107070a, context4);
                            c28655q3.m87172p0(c1019g0);
                        } else {
                            context4 = context3;
                            interfaceC25312u = interfaceC25312u2;
                            interfaceC34116n6 = interfaceC34116n5;
                            function21 = function18;
                            function22 = function19;
                            function23 = function20;
                            z27 = true;
                            c1019g0 = new C1019g0(interfaceC25312u, abstractC0757c, function21, function22, interfaceC34116n6, function23, c35022cM107070a, context4);
                            c28655q3.m87172p0(c1019g0);
                        }
                        AbstractC25303l.m74291r(interfaceC25312u, c25307p4, c13258u7, (Function1) c1019g0, c28655q3, (C25307p.f99300b << 3) | ((i36 >> 9) & 112), 0);
                        interactionJson = abstractC0757c;
                        i29 = i36;
                        function18 = function21;
                        function19 = function22;
                        interfaceC34116n4 = interfaceC34116n6;
                        function20 = function23;
                        context2 = context4;
                        z14 = z27;
                        c3 = c19;
                        i28 = i37;
                    }
                    z16 = z14;
                    function16 = function18;
                    function14 = function19;
                    function17 = function20;
                    Context context11 = context2;
                    int i4110 = i28;
                    interfaceC34116n3 = interfaceC34116n4;
                    i35 = i29;
                    c28655q3.m87173q(z15);
                    c28655q3.m87173q(z16);
                    c28655q3.m87173q(z16);
                    if (c35022cM107070a.getHeaderIcon() != null) {
                        z17 = z16;
                        c28655q3.m87150e0(-1943357594);
                        AbstractC6721d.a aVar13 = new AbstractC6721d.a(c35022cM107070a.getTitle(), null, AbstractC13673n.m38561h(C38072d.f163053a), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                        if ((i35 & 7168) == i34) {
                            z18 = z17;
                        } else {
                            z18 = z15;
                        }
                        objM87133R6 = c28655q3.m87133R();
                        if (z18) {
                            objM87133R6 = new C36681f(function14, 22);
                            c28655q3.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C36681f(function14, 22);
                            c28655q3.m87172p0(objM87133R6);
                        }
                        C28655q c28655q1112 = c28655q3;
                        AbstractC6719b.m20143d(null, aVar13, null, (InterfaceC4339a) objM87133R6, null, null, c28655q1112, AbstractC6721d.a.f25641r << 3, 53);
                        c28655q = c28655q1112;
                        c28655q.m87173q(z15);
                    } else {
                        z17 = z16;
                        c28655q3.m87150e0(-1943357594);
                        AbstractC6721d.a aVar14 = new AbstractC6721d.a(c35022cM107070a.getTitle(), null, AbstractC13673n.m38561h(C38072d.f163053a), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                        if ((i35 & 7168) == i34) {
                            z18 = z17;
                        } else {
                            z18 = z15;
                        }
                        objM87133R6 = c28655q3.m87133R();
                        if (z18) {
                            objM87133R6 = new C36681f(function14, 22);
                            c28655q3.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C36681f(function14, 22);
                            c28655q3.m87172p0(objM87133R6);
                        }
                        C28655q c28655q1113 = c28655q3;
                        AbstractC6719b.m20143d(null, aVar14, null, (InterfaceC4339a) objM87133R6, null, null, c28655q1113, AbstractC6721d.a.f25641r << 3, 53);
                        c28655q = c28655q1113;
                        c28655q.m87173q(z15);
                    }
                    viewState.getStreaksLottieState().getShowLottieTesterFab();
                    c28655q.m87150e0(-1942126770);
                    c28655q.m87173q(z15);
                    viewState.getStreaksLottieState().getShowLottieTesterSheet();
                    c28655q.m87150e0(-1941652594);
                    AbstractC2875y.m8286B(c28655q, z15, z17, z17, z15);
                } else {
                    i28 = i26;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i);
                C0209i c0209i17 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q5, c0209i17, modifierM118962N112);
                Modifier modifierM66723l8 = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, c2314t));
                InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(c2307m4, false);
                iHashCode2 = Long.hashCode(c28655q5.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q5.m87165m();
                Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q5, modifierM66723l8);
                c28655q5.m87158i0();
                if (c28655q5.f115903S) {
                    c28655q5.m87163l(c0213j);
                } else {
                    c28655q5.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q5, c0209i14, interfaceC39127r0M66763d12);
                AbstractC28683x.m87239G(c28655q5, c0209i15, interfaceC28653p1M87165m116);
                if (c28655q5.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q5, c0209i17, modifierM118962N116);
                f13 = 8;
                f14 = 2 * f13;
                interfaceC34116n4 = interfaceC34116n3;
                Modifier modifierM92116f7 = AbstractC30060g.m92116f0(AbstractC15674c.m44085i(AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 2), 0.0f, 6 * f13, 0.0f, f14, 5), 10 * 4, null, 2, null), AbstractC30060g.m92099U(0, c28655q5, 1), 14);
                C2305k c2305k8 = C2299e.f9111N;
                C22957g c22957g8 = AbstractC22977m.f90652c;
                i29 = i39;
                C23010x c23010xM66775a15 = AbstractC23007w.m66775a(c22957g8, c2305k8, c28655q5, 48);
                iHashCode3 = Long.hashCode(c28655q5.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q5.m87165m();
                Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q5, modifierM92116f7);
                c28655q5.m87158i0();
                if (c28655q5.f115903S) {
                    c28655q5.m87163l(c0213j);
                } else {
                    c28655q5.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q5, c0209i14, c23010xM66775a15);
                AbstractC28683x.m87239G(c28655q5, c0209i15, interfaceC28653p1M87165m117);
                if (c28655q5.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q5, c0209i17, modifierM118962N117);
                m122859E(c35022cM107070a, viewState, c28655q5, (i29 << 3) & 112);
                Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t);
                if (c35022cM107070a.getTitleSubtitle() == null) {
                    z14 = true;
                    modifierM3392n = AbstractC1099a.m3392n(c2314t, 0.0f, (-16) * f13, 1);
                } else {
                    z14 = true;
                    modifierM3392n = c2314t;
                }
                Modifier modifierMo3471e8 = modifierM3409f8.mo3471e(modifierM3392n);
                C23010x c23010xM66775a16 = AbstractC23007w.m66775a(c22957g8, c2305k8, c28655q5, 48);
                iHashCode4 = Long.hashCode(c28655q5.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q5.m87165m();
                Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q5, modifierMo3471e8);
                c28655q5.m87158i0();
                if (c28655q5.f115903S) {
                    c28655q5.m87163l(c0213j);
                } else {
                    c28655q5.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q5, c0209i14, c23010xM66775a16);
                AbstractC28683x.m87239G(c28655q5, c0209i15, interfaceC28653p1M87165m118);
                if (c28655q5.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q5, iHashCode4, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q5, iHashCode4, c0209i);
                }
                AbstractC28683x.m87239G(c28655q5, c0209i17, modifierM118962N118);
                c33194k1M110695m = c35022cM107070a.getTitleSubtitle();
                c3 = 3;
                if (c33194k1M110695m == null) {
                    c28655q5.m87150e0(-572141400);
                    c28655q5.m87173q(false);
                    c28655q2 = c28655q5;
                    c23454a0 = null;
                } else {
                    c28655q5.m87150e0(-572141399);
                    AbstractC33191j1.m105171d(AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 2), 0.0f, 5 * f13, 0.0f, 0.0f, 13), c33194k1M110695m, null, c28655q5, (C33194k1.f138384l << 3) | 6, 4);
                    c28655q2 = c28655q5;
                    AbstractC25012a.m73389v(c2314t, f14, c28655q2, false);
                    c23454a0 = C23454a0.f92919a;
                }
                if (c23454a0 == null) {
                    c28655q2.m87150e0(-571650328);
                    if (AbstractC8693b.m21270d(c35022cM107070a.getStreakValue())) {
                        c28655q2.m87150e0(1316319624);
                        String strM21274h8 = AbstractC8693b.m21274h(c35022cM107070a.getStreakValue(), c28655q2, TextResource.$stable);
                        C2886a c2886aM8442w8 = C38072d.f163053a.m121952e(c28655q2, C38072d.f163054b).getN2();
                        long jMo134584toComposableColorWaAFU9c8 = c35022cM107070a.getStreakTextColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
                        int i4111 = C2886a.f11498d << 18;
                        C28655q c28655q1114 = c28655q2;
                        c28676v1 = c28676v0;
                        z15 = false;
                        i34 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        AbstractC30795n.m94707h(strM21274h8, null, jMo134584toComposableColorWaAFU9c8, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8442w8, null, c28655q1114, 0, i4111, 196602);
                        c28655q4 = c28655q1114;
                        c28655q4.m87173q(false);
                    } else {
                        c28655q4 = c28655q2;
                        c28676v1 = c28676v0;
                        z15 = false;
                        i34 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        c28655q4.m87150e0(1316612698);
                        c28655q4.m87173q(false);
                    }
                    if (AbstractC8693b.m21270d(c35022cM107070a.getStreakSubtitle())) {
                        c28655q4.m87150e0(1316721477);
                        C28655q c28655q1115 = c28655q4;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(c35022cM107070a.getStreakSubtitle(), c28655q4, TextResource.$stable), null, c35022cM107070a.getStreakTextColor().mo134584toComposableColorWaAFU9c(c28655q4, z15 ? 1 : 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q4, C38072d.f163054b).getH3(), null, c28655q1115, 0, C2886a.f11498d << 18, 196602);
                        c28655q3 = c28655q1115;
                        c28655q3.m87173q(z15);
                    } else {
                        c28655q3 = c28655q4;
                        c28655q3.m87150e0(1317017434);
                        c28655q3.m87173q(z15);
                    }
                    if (AbstractC8693b.m21270d(c35022cM107070a.getStreakValue())) {
                        c28655q3.m87150e0(1317120013);
                        AbstractC31061c.m95650z(3, f13, c2314t, c28655q3, z15);
                    } else {
                        c28655q3.m87150e0(1317120013);
                        AbstractC31061c.m95650z(3, f13, c2314t, c28655q3, z15);
                    }
                    c28655q3.m87173q(z15);
                } else {
                    c35022cM107070a = c35022cM107070a;
                    z14 = z14;
                    c28676v1 = c28676v0;
                    i34 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    c28655q3 = c28655q2;
                    z15 = false;
                    c28655q3.m87150e0(-849739733);
                    c28655q3.m87173q(false);
                }
                c28655q3.m87150e0(-849687131);
                while (r14.hasNext()) {
                    C13258u c13258u8 = new C13258u(5, interfaceC25312u2);
                    boolean z2112 = (c28655q3.m87157i(interfaceC25312u2) ? 1 : 0) | (c28655q3.m87157i(interactionJson) ? 1 : 0);
                    i36 = i29;
                    if ((i36 & 896) == 256) {
                        z19 = z14;
                    } else {
                        z19 = z15;
                    }
                    boolean z2113 = z2112 | z19;
                    if ((i36 & 7168) == i34) {
                        z24 = z14;
                    } else {
                        z24 = z15;
                    }
                    boolean z3110 = (z2113 ? 1 : 0) | z24;
                    interfaceC34116n5 = interfaceC34116n4;
                    boolean z3111 = z3110 | (c28655q3.m87157i(interfaceC34116n5) ? 1 : 0);
                    char c110 = c3;
                    i37 = i28;
                    if (i37 == 131072) {
                        z25 = true;
                    } else {
                        z25 = z15;
                    }
                    context3 = context2;
                    z26 = (((z3111 ? 1 : 0) | z25) | (c28655q3.m87157i(c35022cM107070a) ? 1 : 0) ? 1 : 0) | (c28655q3.m87157i(context3) ? 1 : 0);
                    Object objM87133R16 = c28655q3.m87133R();
                    if (z26 == 0) {
                        context4 = context3;
                        interfaceC25312u = interfaceC25312u2;
                        interfaceC34116n6 = interfaceC34116n5;
                        function21 = function18;
                        function22 = function19;
                        function23 = function20;
                        z27 = true;
                        c1019g0 = new C1019g0(interfaceC25312u, abstractC0757c, function21, function22, interfaceC34116n6, function23, c35022cM107070a, context4);
                        c28655q3.m87172p0(c1019g0);
                    } else {
                        context4 = context3;
                        interfaceC25312u = interfaceC25312u2;
                        interfaceC34116n6 = interfaceC34116n5;
                        function21 = function18;
                        function22 = function19;
                        function23 = function20;
                        z27 = true;
                        c1019g0 = new C1019g0(interfaceC25312u, abstractC0757c, function21, function22, interfaceC34116n6, function23, c35022cM107070a, context4);
                        c28655q3.m87172p0(c1019g0);
                    }
                    AbstractC25303l.m74291r(interfaceC25312u, c25307p4, c13258u8, (Function1) c1019g0, c28655q3, (C25307p.f99300b << 3) | ((i36 >> 9) & 112), 0);
                    interactionJson = abstractC0757c;
                    i29 = i36;
                    function18 = function21;
                    function19 = function22;
                    interfaceC34116n4 = interfaceC34116n6;
                    function20 = function23;
                    context2 = context4;
                    z14 = z27;
                    c3 = c110;
                    i28 = i37;
                }
                z16 = z14;
                function16 = function18;
                function14 = function19;
                function17 = function20;
                Context context12 = context2;
                int i4112 = i28;
                interfaceC34116n3 = interfaceC34116n4;
                i35 = i29;
                c28655q3.m87173q(z15);
                c28655q3.m87173q(z16);
                c28655q3.m87173q(z16);
                if (c35022cM107070a.getHeaderIcon() != null) {
                    z17 = z16;
                    c28655q3.m87150e0(-1943357594);
                    AbstractC6721d.a aVar15 = new AbstractC6721d.a(c35022cM107070a.getTitle(), null, AbstractC13673n.m38561h(C38072d.f163053a), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                    if ((i35 & 7168) == i34) {
                        z18 = z17;
                    } else {
                        z18 = z15;
                    }
                    objM87133R6 = c28655q3.m87133R();
                    if (z18) {
                        objM87133R6 = new C36681f(function14, 22);
                        c28655q3.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C36681f(function14, 22);
                        c28655q3.m87172p0(objM87133R6);
                    }
                    C28655q c28655q1116 = c28655q3;
                    AbstractC6719b.m20143d(null, aVar15, null, (InterfaceC4339a) objM87133R6, null, null, c28655q1116, AbstractC6721d.a.f25641r << 3, 53);
                    c28655q = c28655q1116;
                    c28655q.m87173q(z15);
                } else {
                    z17 = z16;
                    c28655q3.m87150e0(-1943357594);
                    AbstractC6721d.a aVar16 = new AbstractC6721d.a(c35022cM107070a.getTitle(), null, AbstractC13673n.m38561h(C38072d.f163053a), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                    if ((i35 & 7168) == i34) {
                        z18 = z17;
                    } else {
                        z18 = z15;
                    }
                    objM87133R6 = c28655q3.m87133R();
                    if (z18) {
                        objM87133R6 = new C36681f(function14, 22);
                        c28655q3.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C36681f(function14, 22);
                        c28655q3.m87172p0(objM87133R6);
                    }
                    C28655q c28655q1117 = c28655q3;
                    AbstractC6719b.m20143d(null, aVar16, null, (InterfaceC4339a) objM87133R6, null, null, c28655q1117, AbstractC6721d.a.f25641r << 3, 53);
                    c28655q = c28655q1117;
                    c28655q.m87173q(z15);
                }
                viewState.getStreaksLottieState().getShowLottieTesterFab();
                c28655q.m87150e0(-1942126770);
                c28655q.m87173q(z15);
                viewState.getStreaksLottieState().getShowLottieTesterSheet();
                c28655q.m87150e0(-1941652594);
                AbstractC2875y.m8286B(c28655q, z15, z17, z17, z15);
            }
            function10 = function16;
            function8 = function14;
            function11 = function17;
            c25307p2 = c25307p4;
            interfaceC34116n2 = interfaceC34116n3;
            function9 = function15;
        } else {
            c28655q = c28655q5;
            c28655q.m87138X();
            function8 = function2;
            function9 = function7;
            interfaceC34116n2 = interfaceC34116nM107848a;
            function10 = function5;
            function11 = function6;
            c25307p2 = c25307p;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2880b(viewState, abstractC0757c, function10, function8, c25307p2, function11, function9, interfaceC34116n2, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m122883u(InterfaceC33858e it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m122884v(InterfaceC32548b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m122885w(AbstractC27950a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m122886x(InterfaceC16239m it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final Modifier m122887y(InterfaceC25312u interfaceC25312u, InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1189506290);
        Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 0.0f, 0.0f, 0.0f, m122861G(interfaceC25312u) * 8, 7);
        c28655q.m87173q(false);
        return modifierM3398t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m122888z(InterfaceC25312u interfaceC25312u, AbstractC0757c abstractC0757c, Function1 function1, Function1 function2, InterfaceC34116n interfaceC34116n, Function1 function3, C35022c c35022c, Context context, Object event) {
        CharSequence charSequenceResolve;
        DecodedGenericInteraction decodedGenericInteraction;
        AbstractC22676k.m65750j(event, "event");
        boolean z4 = interfaceC25312u instanceof C32085h;
        C23454a0 c23454a0 = C23454a0.f92919a;
        String string = null;
        navigation = null;
        C9598e navigation = null;
        string = null;
        if (z4) {
            C32085h c32085h = (C32085h) interfaceC25312u;
            GenericInteraction genericInteractionM99820i = c32085h.getInteraction();
            if (genericInteractionM99820i != null && (decodedGenericInteraction = GenericInteractionDecoderKt.toDecodedGenericInteraction(genericInteractionM99820i, abstractC0757c)) != null) {
                navigation = decodedGenericInteraction.getNavigation();
            }
            if (c32085h.getDialogInfo() != null) {
                function1.invoke(InterfaceC33858e.c.f141797a);
            } else if (navigation != null) {
                function2.invoke(new InterfaceC32548b.a(navigation));
            } else if (event instanceof C9598e) {
                function2.invoke(new InterfaceC32548b.a((C9598e) event));
            } else {
                interfaceC34116n.mo85226q(AbstractC11895b.m31996o("MilestoneCard ", c32085h.getId(), " tapped with no destination — BFF payload missing dialogInfo, interaction.navigation and top-level navigation"), new AbstractC30556a.a[0]);
            }
            return c23454a0;
        }
        if (event instanceof AbstractC30015f.a) {
            function1.invoke(InterfaceC33858e.b.f141796a);
        } else if (event instanceof C27256h) {
            C27256h c27256h = (C27256h) event;
            if (AbstractC22676k.m65745e(c27256h.getDestination().getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9438v6.f28000w)) {
                TextResource textResourceM110693k = c35022c.getStreakValue();
                if (!AbstractC8693b.m21270d(textResourceM110693k)) {
                    textResourceM110693k = null;
                }
                if (textResourceM110693k != null && (charSequenceResolve = textResourceM110693k.resolve(context)) != null) {
                    string = charSequenceResolve.toString();
                }
                if (string == null) {
                    string = "";
                }
                function3.invoke(new AbstractC27950a.a(string, c35022c.getStreakState()));
            }
            if (!AbstractC22676k.m65745e(c27256h.getDestination().getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w)) {
                function2.invoke(new InterfaceC32548b.a(c27256h.getDestination()));
            }
        }
        return c23454a0;
    }
}
