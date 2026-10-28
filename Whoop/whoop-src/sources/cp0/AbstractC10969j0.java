package cp0;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b01.C2191l;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c41.C4139w0;
import c93.InterfaceC4339a;
import c93.InterfaceC4340b;
import c93.InterfaceC4351m;
import c93.InterfaceC4353o;
import com.whoop.coacheverywherecommon.models.CoachEducationType;
import com.whoop.data.repositories.FeatureFlagChecker;
import dp0.AbstractC12252h;
import dp0.InterfaceC12251g;
import ec3.AbstractC13091v;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import ep0.C13398d;
import ep0.C13404j;
import ep0.InterfaceC13399e;
import io.sentry.config.AbstractC20301a;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.JsonElement;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import o01.EnumC27349e;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p000.C0003a0;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p077d0.C11347e2;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p291l0.InterfaceC23004v;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28596b0;
import p390p1.C28617g1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p390p1.InterfaceC28690z0;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p636y3.InterfaceC39171c;
import p702ch0.AbstractC4610c1;
import p702ch0.AbstractC4658w0;
import p702ch0.C4656v0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p734sl0.AbstractC32686w;
import p734sl0.C32645n0;
import po0.AbstractC29398b;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import yb3.AbstractC39414r;
import zo0.InterfaceC40915c;

/* JADX INFO: renamed from: cp0.j0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0013\u001a\u0095\u0003\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\"\b\u0002\u0010\u000e\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\r2\u001a\b\u0002\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u00102\u001a\b\u0002\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u00102\b\b\u0002\u0010\u0013\u001a\u00020\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142»\u0001\b\u0002\u0010\u001a\u001a´\u0001\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0018\u0012<\u0012:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0019\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00040\u0016H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 \u001aû\u0001\u0010*\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00172\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182>\u0010#\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00192\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00182\b\b\u0002\u0010(\u001a\u00020'2\"\b\u0002\u0010\u000e\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010)\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0001¢\u0006\u0004\b*\u0010+\u001af\u00102\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\r2\b\b\u0002\u0010.\u001a\u00020\n2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002H\u0080@¢\u0006\u0004\b2\u00103\u001a\u0019\u00106\u001a\u00020\u00172\b\u00105\u001a\u0004\u0018\u000104H\u0000¢\u0006\u0004\b6\u00107\" \u0010=\u001a\b\u0012\u0004\u0012\u00020\r088\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\" \u0010@\u001a\b\u0012\u0004\u0012\u00020'088\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010:\u001a\u0004\b?\u0010<\"\"\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010A088\u0000X\u0080\u0004¢\u0006\f\n\u0004\bB\u0010:\u001a\u0004\bC\u0010<\"\u001c\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010F0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006Y²\u0006\u0016\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00188\n@\nX\u008a\u008e\u0002²\u0006\u0016\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00188\n@\nX\u008a\u008e\u0002²\u0006\u0016\u0010L\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00188\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010M\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010N\u001a\u00020\r8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010O\u001a\u00020\r8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010P\u001a\u00020\r8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010(\u001a\u00020'8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010Q\u001a\u00020'8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010R\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010S\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010T\u001a\u00020\r8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010U\u001a\u00020\r8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010V\u001a\u00020\n8\nX\u008a\u0084\u0002²\u0006\f\u0010W\u001a\u00020\n8\nX\u008a\u0084\u0002²\u0006\f\u0010\u001e\u001a\u00020\u001d8\nX\u008a\u0084\u0002²\u0006\u000e\u0010X\u001a\u0004\u0018\u00010F8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcp0/m0;", "bottomSheetState", "Lkotlin/Function1;", "", "Ll83/a0;", "onDismiss", "Lzo0/c;", "internalCallbacks", "Lbc3/c0;", "coroutineScope", "", "onAnimationProgress", "Lkotlin/Function3;", "", "onContentLoaded", "insightTextWasCutoff", "Lkotlin/Function2;", "onDrawerCollapsed", "onDrawerExpanded", "inlineDrawerVisible", "Lch0/v0;", "coordinator", "Lkotlin/Function8;", "Lsl0/n0;", "Lkotlin/Function0;", "Lkotlin/Function5;", "content", "I", "(Lcp0/m0;Lkotlin/jvm/functions/Function1;Lzo0/c;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;ZLc93/m;Lc93/m;ZLch0/v0;Lc93/b;Landroidx/compose/runtime/Composer;III)V", "Lep0/d;", "globalCoachState", "e1", "(Lep0/d;)Z", "screenArgs", "onBackPressed", "onProvideWrapperCallbacks", "onShowContextHubChanged", "onShowHistoryChanged", "onNavigationEvent", "Lcp0/u1;", "sheetState", "readOnlyHalfSheet", "P0", "(Lsl0/n0;Lc93/a;Lc93/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lcp0/u1;Lkotlin/jvm/functions/Function3;Lzo0/c;ZZLch0/v0;Landroidx/compose/runtime/Composer;III)V", "visible", "shouldOpenExpanded", "partialHeightFraction", "onSheetState", "onHeroProgress", "onTargetHeightFraction", "d1", "(ZZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;", "Lep0/j;", "screenContext", "f1", "(Lep0/j;)Lsl0/n0;", "Lp1/t1;", "a", "Lp1/t1;", "getLocalCoachBottomSheetVisible", "()Lp1/t1;", "LocalCoachBottomSheetVisible", "b", "getLocalCoachBottomSheetState", "LocalCoachBottomSheetState", "Lcp0/y0;", "c", "getLocalCoachSheetMorphDragHandler", "LocalCoachSheetMorphDragHandler", "Lec3/p1;", "", "d", "Lec3/p1;", "NoTtfmtStartTime", "betaClickCallback", "historyClickCallback", "contextHubClickCallback", "betaTagText", "showBetaTag", "showContextHubIcon", "showHistoryIcon", "previousSheetState", "targetHeightFraction", "heroProgress", "isDragging", "isOverlayActive", "animatedHeightFraction", "animatedHeroProgress", "ttfmtStartTimeMs", "coach-everywhere_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC10969j0 {

    /* JADX INFO: renamed from: a */
    private static final AbstractC28669t1 f34074a = new C28596b0(new C10977m(8));

    /* JADX INFO: renamed from: b */
    private static final AbstractC28669t1 f34075b = new C28596b0(new C10977m(9));

    /* JADX INFO: renamed from: c */
    private static final AbstractC28669t1 f34076c = new C28596b0(new C10977m(10));

    /* JADX INFO: renamed from: d */
    private static final InterfaceC13075p1 f34077d = AbstractC13091v.m36593c(null);

    /* JADX INFO: renamed from: cp0.j0$a */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.composables.CoachEverywhereBottomSheetKt$CoachEverywhereBottomSheet$4$1", m100430f = "CoachEverywhereBottomSheet.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC4351m f34078E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f34079F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC28601c1 f34080G;

        /* JADX INFO: renamed from: w */
        int f34081w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC4351m f34082x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f34083y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f34084z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC4351m interfaceC4351m, String str, boolean z4, InterfaceC4351m interfaceC4351m2, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f34082x = interfaceC4351m;
            this.f34083y = str;
            this.f34084z = z4;
            this.f34078E = interfaceC4351m2;
            this.f34079F = interfaceC28601c1;
            this.f34080G = interfaceC28601c2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f34082x, this.f34083y, this.f34084z, this.f34078E, this.f34079F, this.f34080G, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f34081w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            EnumC11003u1 enumC11003u1M29165d0 = AbstractC10969j0.m29165d0(this.f34079F);
            EnumC11003u1 enumC11003u1 = EnumC11003u1.Partial;
            if (enumC11003u1M29165d0 == enumC11003u1 && AbstractC10969j0.m29159b0(this.f34080G) == EnumC11003u1.Expanded) {
                this.f34082x.invoke(this.f34083y, Boolean.valueOf(this.f34084z));
            } else if (AbstractC10969j0.m29165d0(this.f34079F) == EnumC11003u1.Expanded && AbstractC10969j0.m29159b0(this.f34080G) == enumC11003u1) {
                this.f34078E.invoke(this.f34083y, Boolean.valueOf(this.f34084z));
            }
            AbstractC10969j0.m29168e0(this.f34079F, AbstractC10969j0.m29159b0(this.f34080G));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: cp0.j0$b */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.composables.CoachEverywhereBottomSheetKt$CoachEverywhereBottomSheet$5$1", m100430f = "CoachEverywhereBottomSheet.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f34085w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f34086x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f34087y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f34086x = function1;
            this.f34087y = interfaceC28670t2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f34086x, this.f34087y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f34085w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Function1 function1 = this.f34086x;
            if (function1 != null) {
                function1.invoke(new Float(AbstractC10969j0.m29208x0(this.f34087y)));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: cp0.j0$c */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.composables.CoachEverywhereBottomSheetKt$CoachEverywhereBottomSheet$6$1", m100430f = "CoachEverywhereBottomSheet.kt", m100431l = {245}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f34088E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28690z0 f34089F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC28690z0 f34090G;

        /* JADX INFO: renamed from: w */
        int f34091w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C10978m0 f34092x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f34093y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ float f34094z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C10978m0 c10978m0, boolean z4, float f13, InterfaceC28601c1 interfaceC28601c1, InterfaceC28690z0 interfaceC28690z0, InterfaceC28690z0 interfaceC28690z1, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f34092x = c10978m0;
            this.f34093y = z4;
            this.f34094z = f13;
            this.f34088E = interfaceC28601c1;
            this.f34089F = interfaceC28690z0;
            this.f34090G = interfaceC28690z1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public static final C23454a0 m29216j(InterfaceC28601c1 interfaceC28601c1, EnumC11003u1 enumC11003u1) {
            AbstractC10969j0.m29162c0(interfaceC28601c1, enumC11003u1);
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k */
        public static final C23454a0 m29217k(InterfaceC28690z0 interfaceC28690z0, float f13) {
            AbstractC10969j0.m29178i0(interfaceC28690z0, f13);
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: l */
        public static final C23454a0 m29218l(InterfaceC28690z0 interfaceC28690z0, float f13) {
            AbstractC10969j0.m29174g0(interfaceC28690z0, f13);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f34092x, this.f34093y, this.f34094z, this.f34088E, this.f34089F, this.f34090G, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f34091w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                boolean zM29243k = this.f34092x.getVisible();
                boolean z4 = this.f34093y;
                float f13 = this.f34094z;
                int i14 = 0;
                C10972k0 c10972k0 = new C10972k0(i14, this.f34088E);
                C10975l0 c10975l0 = new C10975l0(this.f34089F, i14);
                C10975l0 c10975l1 = new C10975l0(this.f34090G, 1);
                this.f34091w = 1;
                if (AbstractC10969j0.m29166d1(zM29243k, z4, f13, c10972k0, c10975l0, c10975l1, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: cp0.j0$d */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.composables.CoachEverywhereBottomSheetKt$CoachEverywhereBottomSheet$7$1", m100430f = "CoachEverywhereBottomSheet.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28690z0 f34095E;

        /* JADX INFO: renamed from: w */
        int f34096w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C10978m0 f34097x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ float f34098y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f34099z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C10978m0 c10978m0, float f13, InterfaceC28601c1 interfaceC28601c1, InterfaceC28690z0 interfaceC28690z0, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f34097x = c10978m0;
            this.f34098y = f13;
            this.f34099z = interfaceC28601c1;
            this.f34095E = interfaceC28690z0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f34097x, this.f34098y, this.f34099z, this.f34095E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f34096w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f34097x.getVisible() && AbstractC10969j0.m29159b0(this.f34099z) == EnumC11003u1.Partial) {
                AbstractC10969j0.m29174g0(this.f34095E, this.f34098y);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: cp0.j0$e */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.composables.CoachEverywhereBottomSheetKt$CoachEverywhereBottomSheet$8$1", m100430f = "CoachEverywhereBottomSheet.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28690z0 f34100E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28690z0 f34101F;

        /* JADX INFO: renamed from: w */
        int f34102w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f34103x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C10978m0 f34104y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f34105z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z4, C10978m0 c10978m0, InterfaceC28601c1 interfaceC28601c1, InterfaceC28690z0 interfaceC28690z0, InterfaceC28690z0 interfaceC28690z1, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f34103x = z4;
            this.f34104y = c10978m0;
            this.f34105z = interfaceC28601c1;
            this.f34100E = interfaceC28690z0;
            this.f34101F = interfaceC28690z1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f34103x, this.f34104y, this.f34105z, this.f34100E, this.f34101F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f34102w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f34103x && AbstractC10969j0.m29159b0(this.f34105z) == EnumC11003u1.Partial && !this.f34104y.getReadOnlyHalfSheet()) {
                AbstractC10969j0.m29162c0(this.f34105z, EnumC11003u1.Expanded);
                AbstractC10969j0.m29174g0(this.f34100E, 0.9f);
                AbstractC10969j0.m29178i0(this.f34101F, 1.0f);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: cp0.j0$f */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.composables.CoachEverywhereBottomSheetKt$CoachEverywhereBottomSheet$9$1$1", m100430f = "CoachEverywhereBottomSheet.kt", m100431l = {DfuBaseService.NOTIFICATION_ID}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f34106E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28690z0 f34107F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC28690z0 f34108G;

        /* JADX INFO: renamed from: w */
        int f34109w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ float f34110x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f34111y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ EnumC11003u1 f34112z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(float f13, Function1 function1, EnumC11003u1 enumC11003u1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28690z0 interfaceC28690z0, InterfaceC28690z0 interfaceC28690z1, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f34110x = f13;
            this.f34111y = function1;
            this.f34112z = enumC11003u1;
            this.f34106E = interfaceC28601c1;
            this.f34107F = interfaceC28690z0;
            this.f34108G = interfaceC28690z1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f34110x, this.f34111y, this.f34112z, this.f34106E, this.f34107F, this.f34108G, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f34109w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC10969j0.m29162c0(this.f34106E, EnumC11003u1.Hidden);
                AbstractC10969j0.m29178i0(this.f34107F, 0.0f);
                AbstractC10969j0.m29174g0(this.f34108G, this.f34110x);
                this.f34109w = 1;
                if (AbstractC3034m0.m8782b(300L, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f34111y.invoke(AbstractC29398b.m89576a(this.f34112z));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: cp0.j0$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class g {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f34113a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f34114b;

        static {
            int[] iArr = new int[EnumC11003u1.values().length];
            try {
                iArr[EnumC11003u1.Expanded.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC11003u1.Partial.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC11003u1.Hidden.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f34113a = iArr;
            int[] iArr2 = new int[CoachEducationType.values().length];
            try {
                iArr2[CoachEducationType.COACH_EVERYWHERE_DAY_ZERO.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            f34114b = iArr2;
        }
    }

    /* JADX INFO: renamed from: cp0.j0$h */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.composables.CoachEverywhereBottomSheetKt", m100430f = "CoachEverywhereBottomSheet.kt", m100431l = {508, 515}, m100432m = "animateBottomSheetVisibility", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f34115E;

        /* JADX INFO: renamed from: F */
        Object f34116F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f34117G;

        /* JADX INFO: renamed from: H */
        int f34118H;

        /* JADX INFO: renamed from: w */
        boolean f34119w;

        /* JADX INFO: renamed from: x */
        boolean f34120x;

        /* JADX INFO: renamed from: y */
        float f34121y;

        /* JADX INFO: renamed from: z */
        Object f34122z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f34117G = obj;
            this.f34118H |= Integer.MIN_VALUE;
            return AbstractC10969j0.m29166d1(false, false, 0.0f, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final C23454a0 m29104A0(final InterfaceC39171c interfaceC39171c, final boolean z4, final C10978m0 c10978m0, final C32645n0 c32645n0, final boolean z13, final C10962h c10962h, final C11011y0 c11011y0, final boolean z14, final Function1 function1, final Function3 function3, final InterfaceC4340b interfaceC4340b, final InterfaceC28690z0 interfaceC28690z0, final InterfaceC28670t2 interfaceC28670t2, final InterfaceC28670t2 interfaceC28670t3, final InterfaceC28601c1 interfaceC28601c1, final InterfaceC28601c1 interfaceC28601c2, final InterfaceC28601c1 interfaceC28601c3, final InterfaceC28601c1 interfaceC28601c4, final InterfaceC28601c1 interfaceC28601c5, final InterfaceC28601c1 interfaceC28601c6, final InterfaceC28601c1 interfaceC28601c7, final InterfaceC28601c1 interfaceC28601c8, final InterfaceC28601c1 interfaceC28601c9, final InterfaceC28601c1 interfaceC28601c10, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC22953f.m66714a(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), null, false, AbstractC37817c.m121344e(-626122808, c28655q, new Function3() { // from class: cp0.d0
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return AbstractC10969j0.m29106B0(interfaceC39171c, z4, c10978m0, c32645n0, z13, c10962h, c11011y0, z14, function1, function3, interfaceC4340b, interfaceC28690z0, interfaceC28670t2, interfaceC28670t3, interfaceC28601c1, interfaceC28601c2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c5, interfaceC28601c6, interfaceC28601c7, interfaceC28601c8, interfaceC28601c9, interfaceC28601c10, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                }
            }), c28655q, 3078, 6);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final C23454a0 m29106B0(InterfaceC39171c interfaceC39171c, boolean z4, C10978m0 c10978m0, C32645n0 c32645n0, boolean z13, C10962h c10962h, C11011y0 c11011y0, boolean z14, Function1 function1, Function3 function3, InterfaceC4340b interfaceC4340b, InterfaceC28690z0 interfaceC28690z0, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, InterfaceC28601c1 interfaceC28601c5, InterfaceC28601c1 interfaceC28601c6, InterfaceC28601c1 interfaceC28601c7, InterfaceC28601c1 interfaceC28601c8, InterfaceC28601c1 interfaceC28601c9, InterfaceC28601c1 interfaceC28601c10, InterfaceC23004v BoxWithConstraints, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Configuration configuration = (Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a);
            float fMo743q0 = interfaceC39171c.mo743q0(((C1101c) BoxWithConstraints).m3402c());
            float fMo743q1 = interfaceC39171c.mo743q0(configuration.screenHeightDp);
            float f13 = z4 ? fMo743q0 : fMo743q1;
            boolean zM87147d = c28655q.m87147d(f13);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87147d || objM87133R == c28676v0) {
                objM87133R = new C10954e0(interfaceC28690z0, f13, 0);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87257k((InterfaceC4339a) objM87133R, c28655q);
            float fM29236d = c10978m0.getImeHeightPx();
            if (z4 && AbstractC10981n0.m29291a(fMo743q1, fMo743q0, fM29236d)) {
                fM29236d = 0.0f;
            }
            float f14 = fM29236d;
            long jM29234b = c10978m0.getFabPosition();
            float fM29235c = c10978m0.getFabSize();
            float fM29208x0 = m29208x0(interfaceC28670t2);
            float fM29204v0 = m29204v0(interfaceC28670t3);
            EnumC11003u1 enumC11003u1M29159b0 = m29159b0(interfaceC28601c1);
            boolean zM29180j0 = m29180j0(interfaceC28601c2);
            boolean zM29184l0 = m29184l0(interfaceC28601c3);
            boolean z15 = (z13 && c10978m0.getToolbarContent() == null) ? false : true;
            String strM29129N = m29129N(interfaceC28601c4);
            boolean z16 = c10978m0.getIsPrefetchEnabled() || z14;
            boolean zM29243k = c10978m0.getVisible();
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C10972k0(2, interfaceC28601c3);
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function2 = (Function1) objM87133R2;
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C10972k0(3, interfaceC28601c5);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function4 = (Function1) objM87133R3;
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C10972k0(4, interfaceC28601c6);
                c28655q.m87172p0(objM87133R4);
            }
            Function1 function5 = (Function1) objM87133R4;
            Object objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = new C10972k0(5, interfaceC28601c7);
                c28655q.m87172p0(objM87133R5);
            }
            Function1 function6 = (Function1) objM87133R5;
            Object objM87133R6 = c28655q.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = new C10972k0(6, interfaceC28601c4);
                c28655q.m87172p0(objM87133R6);
            }
            Function1 function7 = (Function1) objM87133R6;
            Object objM87133R7 = c28655q.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = new C10972k0(8, interfaceC28601c8);
                c28655q.m87172p0(objM87133R7);
            }
            Function1 function8 = (Function1) objM87133R7;
            Object objM87133R8 = c28655q.m87133R();
            if (objM87133R8 == c28676v0) {
                objM87133R8 = new C10972k0(9, interfaceC28601c9);
                c28655q.m87172p0(objM87133R8);
            }
            Function1 function9 = (Function1) objM87133R8;
            Object objM87133R9 = c28655q.m87133R();
            if (objM87133R9 == c28676v0) {
                objM87133R9 = new C10972k0(10, interfaceC28601c10);
                c28655q.m87172p0(objM87133R9);
            }
            AbstractC10979m1.m29259k(jM29234b, fM29235c, fM29208x0, fM29204v0, interfaceC39171c, enumC11003u1M29159b0, zM29180j0, zM29184l0, f13, f14, c32645n0, z13, c10962h, z15, strM29129N, c11011y0, z16, zM29243k, function2, function4, function5, function6, function7, function8, function9, (Function1) objM87133R9, function1, c10978m0.getScreenContext(), function3, interfaceC4340b, c28655q, 0, C32645n0.f135304t | 905969664, (C13404j.f46947x << 21) | 224694, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final C23454a0 m29108C0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        m29145V(interfaceC28601c1, z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final C23454a0 m29110D0(InterfaceC28690z0 interfaceC28690z0, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final C23454a0 m29112E0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        m29186m0(interfaceC28601c1, z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final C23454a0 m29114F0(InterfaceC28601c1 interfaceC28601c1, InterfaceC4339a interfaceC4339a) {
        m29128M0(interfaceC28601c1, interfaceC4339a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final C23454a0 m29116G0(InterfaceC28601c1 interfaceC28601c1, InterfaceC4339a interfaceC4339a) {
        m29132O0(interfaceC28601c1, interfaceC4339a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final C23454a0 m29118H0(InterfaceC28601c1 interfaceC28601c1, InterfaceC4339a interfaceC4339a) {
        m29127M(interfaceC28601c1, interfaceC4339a);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0135  */
    /* JADX WARN: Code duplicated, block: B:104:0x0138  */
    /* JADX WARN: Code duplicated, block: B:108:0x0140  */
    /* JADX WARN: Code duplicated, block: B:109:0x0143  */
    /* JADX WARN: Code duplicated, block: B:111:0x0147  */
    /* JADX WARN: Code duplicated, block: B:113:0x014b  */
    /* JADX WARN: Code duplicated, block: B:114:0x0150  */
    /* JADX WARN: Code duplicated, block: B:116:0x0156  */
    /* JADX WARN: Code duplicated, block: B:117:0x0159  */
    /* JADX WARN: Code duplicated, block: B:119:0x015e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0166  */
    /* JADX WARN: Code duplicated, block: B:124:0x016d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0171  */
    /* JADX WARN: Code duplicated, block: B:128:0x017b  */
    /* JADX WARN: Code duplicated, block: B:129:0x017e  */
    /* JADX WARN: Code duplicated, block: B:133:0x018e  */
    /* JADX WARN: Code duplicated, block: B:137:0x0197  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:142:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:149:0x01d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:154:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:156:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:158:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:160:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:162:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:164:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:166:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:168:0x0200  */
    /* JADX WARN: Code duplicated, block: B:170:0x020c  */
    /* JADX WARN: Code duplicated, block: B:172:0x020f  */
    /* JADX WARN: Code duplicated, block: B:174:0x0215  */
    /* JADX WARN: Code duplicated, block: B:176:0x0222  */
    /* JADX WARN: Code duplicated, block: B:178:0x0226  */
    /* JADX WARN: Code duplicated, block: B:179:0x0228  */
    /* JADX WARN: Code duplicated, block: B:181:0x022c  */
    /* JADX WARN: Code duplicated, block: B:183:0x022f  */
    /* JADX WARN: Code duplicated, block: B:184:0x0250  */
    /* JADX WARN: Code duplicated, block: B:187:0x0275 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:188:0x0277  */
    /* JADX WARN: Code duplicated, block: B:191:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:192:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:195:0x02db  */
    /* JADX WARN: Code duplicated, block: B:198:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:201:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:204:0x030a  */
    /* JADX WARN: Code duplicated, block: B:207:0x031b  */
    /* JADX WARN: Code duplicated, block: B:210:0x032e  */
    /* JADX WARN: Code duplicated, block: B:213:0x0341  */
    /* JADX WARN: Code duplicated, block: B:216:0x034e  */
    /* JADX WARN: Code duplicated, block: B:217:0x0351  */
    /* JADX WARN: Code duplicated, block: B:220:0x0359 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:222:0x035e  */
    /* JADX WARN: Code duplicated, block: B:224:0x0362  */
    /* JADX WARN: Code duplicated, block: B:229:0x036f  */
    /* JADX WARN: Code duplicated, block: B:232:0x0379  */
    /* JADX WARN: Code duplicated, block: B:233:0x0396  */
    /* JADX WARN: Code duplicated, block: B:236:0x03cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:237:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:238:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:241:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:244:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:247:0x040d  */
    /* JADX WARN: Code duplicated, block: B:250:0x041d  */
    /* JADX WARN: Code duplicated, block: B:252:0x0425  */
    /* JADX WARN: Code duplicated, block: B:253:0x0427  */
    /* JADX WARN: Code duplicated, block: B:257:0x0435  */
    /* JADX WARN: Code duplicated, block: B:260:0x0446  */
    /* JADX WARN: Code duplicated, block: B:263:0x0459  */
    /* JADX WARN: Code duplicated, block: B:264:0x0461  */
    /* JADX WARN: Code duplicated, block: B:267:0x0472 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:268:0x0474  */
    /* JADX WARN: Code duplicated, block: B:273:0x050c  */
    /* JADX WARN: Code duplicated, block: B:280:0x051c  */
    /* JADX WARN: Code duplicated, block: B:283:0x052a  */
    /* JADX WARN: Code duplicated, block: B:284:0x052d  */
    /* JADX WARN: Code duplicated, block: B:287:0x053b  */
    /* JADX WARN: Code duplicated, block: B:288:0x053e  */
    /* JADX WARN: Code duplicated, block: B:291:0x0548  */
    /* JADX WARN: Code duplicated, block: B:292:0x054b  */
    /* JADX WARN: Code duplicated, block: B:295:0x0553 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:298:0x055e  */
    /* JADX WARN: Code duplicated, block: B:301:0x0592  */
    /* JADX WARN: Code duplicated, block: B:302:0x0599  */
    /* JADX WARN: Code duplicated, block: B:305:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:306:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:309:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:310:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:313:0x0616  */
    /* JADX WARN: Code duplicated, block: B:314:0x0619  */
    /* JADX WARN: Code duplicated, block: B:317:0x0625 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:318:0x0627  */
    /* JADX WARN: Code duplicated, block: B:321:0x0642  */
    /* JADX WARN: Code duplicated, block: B:323:0x0646  */
    /* JADX WARN: Code duplicated, block: B:326:0x064f  */
    /* JADX WARN: Code duplicated, block: B:328:0x0658  */
    /* JADX WARN: Code duplicated, block: B:332:0x0679 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:335:0x067f  */
    /* JADX WARN: Code duplicated, block: B:338:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:344:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:347:0x06c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:348:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:351:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:357:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:360:0x0704 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:361:0x0706  */
    /* JADX WARN: Code duplicated, block: B:365:0x073d  */
    /* JADX WARN: Code duplicated, block: B:368:0x0747 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:369:0x0749  */
    /* JADX WARN: Code duplicated, block: B:372:0x076f  */
    /* JADX WARN: Code duplicated, block: B:381:0x082b  */
    /* JADX WARN: Code duplicated, block: B:384:0x0844  */
    /* JADX WARN: Code duplicated, block: B:386:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:87:0x0102  */
    /* JADX WARN: Code duplicated, block: B:88:0x0107  */
    /* JADX WARN: Code duplicated, block: B:90:0x010d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0113  */
    /* JADX WARN: Code duplicated, block: B:93:0x0116  */
    /* JADX WARN: Code duplicated, block: B:97:0x0120  */
    /* JADX WARN: Code duplicated, block: B:99:0x0127  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34, types: [c93.m] */
    /* JADX WARN: Type inference failed for: r5v97 */
    /* JADX WARN: Type inference failed for: r7v28, types: [c93.m, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX INFO: renamed from: I */
    public static final void m29119I(final C10978m0 bottomSheetState, final Function1 onDismiss, InterfaceC40915c interfaceC40915c, InterfaceC2994c0 interfaceC2994c0, Function1 function1, Function3 function3, boolean z4, InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2, boolean z13, C4656v0 c4656v0, InterfaceC4340b interfaceC4340b, Composer composer, final int i13, final int i14, final int i15) {
        int i16;
        InterfaceC2994c0 interfaceC2994c1;
        Function1 function2;
        int i17;
        Function3 function4;
        int i18;
        int i19;
        boolean z14;
        int i24;
        int i25;
        InterfaceC4351m interfaceC4351m3;
        int i26;
        int i27;
        int i28;
        int i29;
        int i34;
        int i35;
        int i36;
        boolean zM87157i;
        int i37;
        int i38;
        int i39;
        boolean z15;
        final boolean z16;
        final InterfaceC4340b interfaceC4340b2;
        C28655q c28655q;
        final Function1 function5;
        final Function3 function6;
        final boolean z17;
        final InterfaceC2994c0 interfaceC2994c2;
        final InterfaceC4351m interfaceC4351m4;
        final InterfaceC4351m interfaceC4351m5;
        final C4656v0 c4656v1;
        final InterfaceC40915c interfaceC40915c2;
        C28677v1 c28677v1M87180u;
        InterfaceC4351m interfaceC4351m6;
        C28677v1 c28677v1;
        int i44;
        C28676v0 c28676v0;
        final InterfaceC40915c interfaceC40915c3;
        InterfaceC2994c0 interfaceC2994c3;
        InterfaceC4351m interfaceC4351m7;
        InterfaceC4351m interfaceC4351m8;
        final boolean z18;
        String str;
        InterfaceC4340b interfaceC4340b3;
        C4656v0 c4656v2;
        int i45;
        Function1 function7;
        Function3 function8;
        InterfaceC2994c0 interfaceC2994c4;
        boolean z19;
        InterfaceC4351m interfaceC4351m9;
        InterfaceC4351m interfaceC4351m10;
        boolean z24;
        Object objM87133R;
        Object objM87133R2;
        Object objM87133R3;
        boolean zM87153g;
        Object objM87133R4;
        boolean zM29247c;
        boolean zM29246b;
        final boolean zIsFeatureEnabled;
        C13404j c13404jM29240h;
        String screenId;
        boolean zM74155w0;
        Object objM87133R5;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R6;
        Object objM87133R7;
        Object objM87133R8;
        final InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R9;
        final InterfaceC28601c1 interfaceC28601c3;
        Object objM87133R10;
        Object objM87133R11;
        final InterfaceC28601c1 interfaceC28601c4;
        boolean z25;
        boolean z26;
        boolean z27;
        C10962h c10962h;
        ?? r10;
        C10962h c10962hM29242j;
        float fM29245a;
        Object objM87133R12;
        final InterfaceC28601c1 interfaceC28601c5;
        Object objM87133R13;
        InterfaceC28601c1 interfaceC28601c6;
        Object objM87133R14;
        final InterfaceC28690z0 interfaceC28690z0;
        Object objM87133R15;
        final InterfaceC28690z0 interfaceC28690z1;
        Object objM87133R16;
        final InterfaceC28601c1 interfaceC28601c7;
        Object objM87133R17;
        Object objM87133R18;
        final InterfaceC28690z0 interfaceC28690z2;
        boolean zM87153g2;
        InterfaceC2994c0 interfaceC2994c5;
        InterfaceC28601c1 interfaceC28601c8;
        Object c11011y0;
        boolean z28;
        float f13;
        C28676v0 c28676v1;
        InterfaceC2994c0 interfaceC2994c6;
        C28655q c28655q2;
        boolean z29;
        C13404j c13404jM29240h2;
        String source;
        boolean z34;
        boolean z35;
        boolean z36;
        boolean z37;
        Object objM87133R19;
        final InterfaceC4351m interfaceC4351m11;
        InterfaceC4351m interfaceC4351m12;
        final boolean z38;
        C11347e2 c11347e2M30574v;
        C28655q c28655q3;
        InterfaceC39171c interfaceC39171c;
        boolean z39;
        C11347e2 c11347e2M30574v2;
        final InterfaceC28670t2 interfaceC28670t2M30588b;
        boolean z44;
        boolean zM87153g3;
        Object objM87133R20;
        int i46;
        C10978m0 c10978m0;
        InterfaceC39171c interfaceC39171c2;
        boolean z45;
        boolean z46;
        float f14;
        boolean zM87147d;
        Object objM87133R21;
        float f15;
        boolean z47;
        boolean zM87147d2;
        Object objM87133R22;
        boolean z48;
        boolean z49;
        Object objM87133R23;
        boolean zM87155h;
        Object objM87133R24;
        float f16;
        int i47;
        final C4656v0 c4656v3 = c4656v0;
        AbstractC22676k.m65750j(bottomSheetState, "bottomSheetState");
        AbstractC22676k.m65750j(onDismiss, "onDismiss");
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(128525598);
        if ((i13 & 6) == 0) {
            i16 = ((i13 & 8) == 0 ? c28655q4.m87153g(bottomSheetState) : c28655q4.m87157i(bottomSheetState) ? 4 : 2) | i13;
        } else {
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= c28655q4.m87157i(onDismiss) ? 32 : 16;
        }
        int i48 = i15 & 4;
        if (i48 != 0) {
            i16 |= 384;
        } else if ((i13 & 384) == 0) {
            i16 |= (i13 & 512) == 0 ? c28655q4.m87153g(interfaceC40915c) : c28655q4.m87157i(interfaceC40915c) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            if ((i15 & 8) == 0) {
                interfaceC2994c1 = interfaceC2994c0;
                if (c28655q4.m87157i(interfaceC2994c1)) {
                    i47 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i16 |= i47;
            } else {
                interfaceC2994c1 = interfaceC2994c0;
            }
            i47 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i16 |= i47;
        } else {
            interfaceC2994c1 = interfaceC2994c0;
        }
        int i49 = i15 & 16;
        if (i49 == 0) {
            if ((i13 & 24576) == 0) {
                function2 = function1;
                i16 |= c28655q4.m87157i(function2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i17 = i15 & 32;
            if (i17 != 0) {
                i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                function4 = function3;
            } else {
                function4 = function3;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q4.m87157i(function4)) {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i18;
                }
            }
            i19 = i15 & 64;
            if (i19 != 0) {
                i16 |= 1572864;
                z14 = z4;
            } else {
                z14 = z4;
                if ((i13 & 1572864) == 0) {
                    if (c28655q4.m87155h(z14)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i16 |= i24;
                }
            }
            i25 = i15 & 128;
            if (i25 != 0) {
                i16 |= 12582912;
                interfaceC4351m3 = interfaceC4351m;
            } else {
                interfaceC4351m3 = interfaceC4351m;
                if ((i13 & 12582912) == 0) {
                    if (c28655q4.m87157i(interfaceC4351m3)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i16 |= i26;
                }
            }
            i27 = i15 & 256;
            if (i27 != 0) {
                i16 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (c28655q4.m87157i(interfaceC4351m2)) {
                    i28 = 67108864;
                } else {
                    i28 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i28;
            }
            i29 = i15 & 512;
            if (i29 != 0) {
                if ((i13 & 805306368) == 0) {
                    if (c28655q4.m87155h(z13)) {
                        i34 = 536870912;
                    } else {
                        i34 = 268435456;
                    }
                    i16 |= i34;
                }
                i35 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i35 != 0) {
                    i36 = i14 | 6;
                } else if ((i14 & 6) == 0) {
                    if ((i14 & 8) == 0) {
                        zM87157i = c28655q4.m87153g(c4656v3);
                    } else {
                        zM87157i = c28655q4.m87157i(c4656v3);
                    }
                    if (zM87157i) {
                        i37 = 4;
                    } else {
                        i37 = 2;
                    }
                    i36 = i14 | i37;
                } else {
                    i36 = i14;
                }
                i38 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                if (i38 != 0) {
                    if ((i14 & 48) == 0) {
                        if (c28655q4.m87157i(interfaceC4340b)) {
                            i39 = 32;
                        } else {
                            i39 = 16;
                        }
                        i36 |= i39;
                    }
                    if ((i16 & 306783379) == 306783378 || (i36 & 19) != 18) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c28655q4.m87135U(i16 & 1, z15)) {
                        c28655q4.m87140Z();
                        i44 = i13 & 1;
                        c28676v0 = C28635l.f115821a;
                        if (i44 != 0 || c28655q4.m87118C()) {
                            if (i48 != 0) {
                                interfaceC40915c3 = null;
                            } else {
                                interfaceC40915c3 = interfaceC40915c;
                            }
                            if ((i15 & 8) != 0) {
                                objM87133R3 = c28655q4.m87133R();
                                if (objM87133R3 == c28676v0) {
                                    objM87133R3 = AbstractC28683x.m87262p(c28655q4);
                                    c28655q4.m87172p0(objM87133R3);
                                }
                                interfaceC2994c3 = (InterfaceC2994c0) objM87133R3;
                                i16 &= -7169;
                            } else {
                                interfaceC2994c3 = interfaceC2994c1;
                            }
                            if (i49 != 0) {
                                function2 = null;
                            }
                            if (i17 != 0) {
                                function4 = null;
                            }
                            if (i19 != 0) {
                                z14 = false;
                            }
                            if (i25 != 0) {
                                objM87133R2 = c28655q4.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C4139w0(7);
                                    c28655q4.m87172p0(objM87133R2);
                                }
                                interfaceC4351m7 = (InterfaceC4351m) objM87133R2;
                            } else {
                                interfaceC4351m7 = interfaceC4351m3;
                            }
                            if (i27 != 0) {
                                objM87133R = c28655q4.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C4139w0(8);
                                    c28655q4.m87172p0(objM87133R);
                                }
                                interfaceC4351m8 = (InterfaceC4351m) objM87133R;
                            } else {
                                interfaceC4351m8 = interfaceC4351m2;
                            }
                            if (i29 != 0) {
                                z18 = false;
                            } else {
                                z18 = z13;
                            }
                            if (i35 != 0) {
                                c4656v3 = null;
                            }
                            if (i38 != 0) {
                                str = null;
                                C37816b c37816bM121344e = AbstractC37817c.m121344e(-633821104, c28655q4, new InterfaceC4340b() { // from class: cp0.i0
                                    @Override // c93.InterfaceC4340b
                                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
                                        int iIntValue = ((Integer) obj10).intValue();
                                        return AbstractC10969j0.m29137R(interfaceC40915c3, bottomSheetState, z18, c4656v3, (C32645n0) obj, (InterfaceC4339a) obj2, (InterfaceC4353o) obj3, (Function1) obj4, (Function1) obj5, (InterfaceC4339a) obj6, (String) obj7, (Function3) obj8, (C28655q) ((Composer) obj9), iIntValue);
                                    }
                                });
                                c4656v2 = c4656v3;
                                i45 = i16;
                                function7 = function2;
                                function8 = function4;
                                interfaceC2994c4 = interfaceC2994c3;
                                z19 = z14;
                                interfaceC4351m9 = interfaceC4351m7;
                                interfaceC4351m10 = interfaceC4351m8;
                                z24 = z18;
                                interfaceC4340b3 = c37816bM121344e;
                            } else {
                                str = null;
                                interfaceC4340b3 = interfaceC4340b;
                                c4656v2 = c4656v3;
                                i45 = i16;
                                function7 = function2;
                                function8 = function4;
                                interfaceC2994c4 = interfaceC2994c3;
                                z19 = z14;
                                interfaceC4351m9 = interfaceC4351m7;
                                interfaceC4351m10 = interfaceC4351m8;
                                z24 = z18;
                            }
                        } else {
                            c28655q4.m87138X();
                            if ((i15 & 8) != 0) {
                                i16 &= -7169;
                            }
                            interfaceC40915c3 = interfaceC40915c;
                            interfaceC4351m10 = interfaceC4351m2;
                            z24 = z13;
                            interfaceC4340b3 = interfaceC4340b;
                            c4656v2 = c4656v3;
                            i45 = i16;
                            function7 = function2;
                            function8 = function4;
                            z19 = z14;
                            interfaceC2994c4 = interfaceC2994c1;
                            interfaceC4351m9 = interfaceC4351m3;
                            str = null;
                        }
                        c28655q4.m87175r();
                        zM87153g = c28655q4.m87153g(bottomSheetState.getScreenContext());
                        objM87133R4 = c28655q4.m87133R();
                        if (zM87153g || objM87133R4 == c28676v0) {
                            objM87133R4 = m29172f1(bottomSheetState.getScreenContext());
                            c28655q4.m87172p0(objM87133R4);
                        }
                        final C32645n0 c32645n0 = (C32645n0) objM87133R4;
                        FeatureFlagChecker featureFlagChecker = (FeatureFlagChecker) c28655q4.m87161k(AbstractC38073e.m121968p());
                        C10978m0.Companion aVar = C10978m0.INSTANCE;
                        zM29247c = aVar.m29247c(bottomSheetState.getScreenContext());
                        zM29246b = aVar.m29246b(bottomSheetState.getCustomDrawerPresentation(), bottomSheetState.getShouldOpenFullSize(), zM29247c, bottomSheetState.getReadOnlyHalfSheet());
                        final boolean zIsFeatureEnabled2 = featureFlagChecker.isFeatureEnabled("wce-padding-keyboard-fix");
                        zIsFeatureEnabled = featureFlagChecker.isFeatureEnabled("context-hub-profile");
                        Set setM74059b1 = AbstractC25260n.m74059b1(new String[]{"CONTEXT_HUB", "CONTEXT_DETAILS"});
                        c13404jM29240h = bottomSheetState.getScreenContext();
                        if (c13404jM29240h != null) {
                            screenId = c13404jM29240h.getScreenId();
                        } else {
                            screenId = str;
                        }
                        zM74155w0 = AbstractC25265s.m74155w0(setM74059b1, screenId);
                        objM87133R5 = c28655q4.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87272z(str);
                            c28655q4.m87172p0(objM87133R5);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                        objM87133R6 = c28655q4.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC28683x.m87272z(str);
                            c28655q4.m87172p0(objM87133R6);
                        }
                        final InterfaceC28601c1 interfaceC28601c9 = (InterfaceC28601c1) objM87133R6;
                        objM87133R7 = c28655q4.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC28683x.m87272z(str);
                            c28655q4.m87172p0(objM87133R7);
                        }
                        final InterfaceC28601c1 interfaceC28601c10 = (InterfaceC28601c1) objM87133R7;
                        objM87133R8 = c28655q4.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = AbstractC28683x.m87272z("");
                            c28655q4.m87172p0(objM87133R8);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R8;
                        final InterfaceC40915c interfaceC40915c4 = interfaceC40915c3;
                        objM87133R9 = c28655q4.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = AbstractC28683x.m87272z(Boolean.TRUE);
                            c28655q4.m87172p0(objM87133R9);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R9;
                        objM87133R10 = c28655q4.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = AbstractC28683x.m87272z(Boolean.TRUE);
                            c28655q4.m87172p0(objM87133R10);
                        }
                        final InterfaceC28601c1 interfaceC28601c11 = (InterfaceC28601c1) objM87133R10;
                        objM87133R11 = c28655q4.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = AbstractC28683x.m87272z(Boolean.TRUE);
                            c28655q4.m87172p0(objM87133R11);
                        }
                        interfaceC28601c4 = (InterfaceC28601c1) objM87133R11;
                        if (zIsFeatureEnabled) {
                            z25 = zM74155w0;
                        } else {
                            z25 = true;
                        }
                        if (m29143U(interfaceC28601c4) || !z25) {
                            z26 = false;
                        } else {
                            z26 = true;
                        }
                        if (zIsFeatureEnabled || !m29139S(interfaceC28601c11) || zM74155w0) {
                            z27 = false;
                        } else {
                            z27 = true;
                        }
                        if (m29133P(interfaceC28601c3)) {
                            c28655q4.m87150e0(2094451546);
                            C37816b c37816bM121344e2 = AbstractC37817c.m121344e(36773779, c28655q4, new C0003a0(19, interfaceC28601c2, interfaceC28601c1));
                            c28655q4.m87173q(false);
                            r10 = c37816bM121344e2;
                        } else {
                            c28655q4.m87150e0(2094652488);
                            c28655q4.m87173q(false);
                            r10 = str;
                        }
                        final boolean z52 = z27;
                        final boolean z54 = z26;
                        c10962h = new C10962h(r10, AbstractC37817c.m121344e(-582148231, c28655q4, new InterfaceC4351m() { // from class: cp0.b0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC10969j0.m29151Y(z54, z52, zIsFeatureEnabled, interfaceC28601c9, interfaceC28601c10, (Composer) obj, iIntValue);
                            }
                        }));
                        c10962hM29242j = bottomSheetState.getToolbarContent();
                        if (c10962hM29242j == null) {
                            c10962h = c10962hM29242j;
                        } else if (zM29247c) {
                            ?? r14 = str;
                            c10962h = new C10962h(r14, r14, 3, r14);
                        }
                        fM29245a = aVar.m29245a(bottomSheetState.getCustomDrawerPresentation());
                        objM87133R12 = c28655q4.m87133R();
                        if (objM87133R12 == c28676v0) {
                            objM87133R12 = AbstractC28683x.m87272z(bottomSheetState.getInitialSheetState());
                            c28655q4.m87172p0(objM87133R12);
                        }
                        interfaceC28601c5 = (InterfaceC28601c1) objM87133R12;
                        objM87133R13 = c28655q4.m87133R();
                        if (objM87133R13 == c28676v0) {
                            objM87133R13 = AbstractC28683x.m87272z(bottomSheetState.getInitialSheetState());
                            c28655q4.m87172p0(objM87133R13);
                        }
                        interfaceC28601c6 = (InterfaceC28601c1) objM87133R13;
                        objM87133R14 = c28655q4.m87133R();
                        if (objM87133R14 == c28676v0) {
                            objM87133R14 = AbstractC11266d.m30468v(bottomSheetState.getInitialHeightFraction(), c28655q4);
                        }
                        interfaceC28690z0 = (InterfaceC28690z0) objM87133R14;
                        objM87133R15 = c28655q4.m87133R();
                        if (objM87133R15 == c28676v0) {
                            if (bottomSheetState.getInitialSheetState() == EnumC11003u1.Hidden) {
                                f16 = 0.0f;
                            } else {
                                f16 = 1.0f;
                            }
                            objM87133R15 = AbstractC11266d.m30468v(f16, c28655q4);
                        }
                        interfaceC28690z1 = (InterfaceC28690z0) objM87133R15;
                        objM87133R16 = c28655q4.m87133R();
                        if (objM87133R16 == c28676v0) {
                            objM87133R16 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q4.m87172p0(objM87133R16);
                        }
                        interfaceC28601c7 = (InterfaceC28601c1) objM87133R16;
                        objM87133R17 = c28655q4.m87133R();
                        if (objM87133R17 == c28676v0) {
                            objM87133R17 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q4.m87172p0(objM87133R17);
                        }
                        final InterfaceC28601c1 interfaceC28601c12 = (InterfaceC28601c1) objM87133R17;
                        objM87133R18 = c28655q4.m87133R();
                        if (objM87133R18 == c28676v0) {
                            objM87133R18 = AbstractC11266d.m30468v(0.0f, c28655q4);
                        }
                        interfaceC28690z2 = (InterfaceC28690z0) objM87133R18;
                        zM87153g2 = c28655q4.m87153g(interfaceC2994c4);
                        interfaceC2994c5 = interfaceC2994c4;
                        Object objM87133R25 = c28655q4.m87133R();
                        if (!zM87153g2 || objM87133R25 == c28676v0) {
                            final int i54 = 0;
                            final int i55 = 1;
                            final int i56 = 2;
                            interfaceC28601c8 = interfaceC28601c1;
                            z28 = zM29246b;
                            f13 = fM29245a;
                            c28676v1 = c28676v0;
                            interfaceC2994c6 = interfaceC2994c5;
                            c28655q2 = c28655q4;
                            z29 = zM29247c;
                            c11011y0 = new C11011y0(interfaceC2994c6, z29, new InterfaceC4339a() { // from class: cp0.c0
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    float fM29188n0;
                                    switch (i54) {
                                        case 0:
                                            fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z2);
                                            break;
                                        case 1:
                                            fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z2);
                                            break;
                                        default:
                                            fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z2);
                                            break;
                                    }
                                    return Float.valueOf(fM29188n0);
                                }
                            }, new C10992r(1, interfaceC28601c5), new InterfaceC4339a() { // from class: cp0.c0
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    float fM29188n0;
                                    switch (i55) {
                                        case 0:
                                            fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z1);
                                            break;
                                        case 1:
                                            fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z1);
                                            break;
                                        default:
                                            fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z1);
                                            break;
                                    }
                                    return Float.valueOf(fM29188n0);
                                }
                            }, new InterfaceC4339a() { // from class: cp0.c0
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    float fM29188n0;
                                    switch (i56) {
                                        case 0:
                                            fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z0);
                                            break;
                                        case 1:
                                            fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z0);
                                            break;
                                        default:
                                            fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z0);
                                            break;
                                    }
                                    return Float.valueOf(fM29188n0);
                                }
                            }, new C10975l0(interfaceC28690z1, 3), new C10975l0(interfaceC28690z0, 4), new C10972k0(7, interfaceC28601c5), new C10972k0(11, interfaceC28601c7), onDismiss);
                            c28655q2.m87172p0(c11011y0);
                        } else {
                            c28676v1 = c28676v0;
                            c11011y0 = objM87133R25;
                            c28655q2 = c28655q4;
                            f13 = fM29245a;
                            z28 = zM29246b;
                            interfaceC28601c8 = interfaceC28601c1;
                            interfaceC2994c6 = interfaceC2994c5;
                            z29 = zM29247c;
                        }
                        final C11011y0 c11011y1 = (C11011y0) c11011y0;
                        c13404jM29240h2 = bottomSheetState.getScreenContext();
                        if (c13404jM29240h2 != null || (source = c13404jM29240h2.getSource()) == null) {
                            source = "";
                        } else {
                            if (AbstractC39414r.m125890i0(source)) {
                                source = null;
                            }
                            if (source == null) {
                                source = "";
                            }
                        }
                        EnumC11003u1 enumC11003u1M29159b0 = m29159b0(interfaceC28601c5);
                        if ((i45 & 234881024) == 67108864) {
                            z34 = true;
                        } else {
                            z34 = false;
                        }
                        boolean zM87153g4 = z34 | c28655q2.m87153g(source);
                        if ((i45 & 3670016) == 1048576) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        boolean z55 = zM87153g4 | z35;
                        if ((i45 & 29360128) == 8388608) {
                            z36 = true;
                        } else {
                            z36 = false;
                        }
                        z37 = z55 | z36;
                        objM87133R19 = c28655q2.m87133R();
                        if (!z37 || objM87133R19 == c28676v1) {
                            boolean z56 = z19;
                            InterfaceC4351m interfaceC4351m13 = interfaceC4351m9;
                            InterfaceC4351m interfaceC4351m14 = interfaceC4351m10;
                            objM87133R19 = new a(interfaceC4351m14, source, z56, interfaceC4351m13, interfaceC28601c6, interfaceC28601c5, null);
                            interfaceC4351m11 = interfaceC4351m14;
                            interfaceC4351m12 = interfaceC4351m13;
                            z38 = z56;
                            c28655q2.m87172p0(objM87133R19);
                        } else {
                            z38 = z19;
                            interfaceC4351m12 = interfaceC4351m9;
                            interfaceC4351m11 = interfaceC4351m10;
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R19, enumC11003u1M29159b0);
                        float fM29171f0 = m29171f0(interfaceC28690z0);
                        if (m29180j0(interfaceC28601c7)) {
                            c11347e2M30574v = AbstractC11348f.m30574v(0, 0, null, 6);
                        } else {
                            c11347e2M30574v = AbstractC11348f.m30574v(300, 0, null, 6);
                        }
                        c28655q3 = c28655q2;
                        final InterfaceC28670t2 interfaceC28670t2M30588b2 = AbstractC11352g.m30588b(fM29171f0, c11347e2M30574v, "bottomSheetHeight", null, c28655q3, 3072, 20);
                        interfaceC39171c = (InterfaceC39171c) c28655q3.m87161k(AbstractC2453v1.f9569h);
                        if (bottomSheetState.getImeHeightPx() > 0) {
                            z39 = true;
                        } else {
                            z39 = false;
                        }
                        float fM29176h0 = m29176h0(interfaceC28690z1);
                        if (m29180j0(interfaceC28601c7)) {
                            c11347e2M30574v2 = AbstractC11348f.m30574v(0, 0, null, 6);
                        } else {
                            c11347e2M30574v2 = AbstractC11348f.m30574v(300, 0, null, 6);
                        }
                        interfaceC28670t2M30588b = AbstractC11352g.m30588b(fM29176h0, c11347e2M30574v2, "heroProgress", null, c28655q3, 3072, 20);
                        Float fValueOf = Float.valueOf(m29208x0(interfaceC28670t2M30588b));
                        if ((i45 & 57344) == 16384) {
                            z44 = true;
                        } else {
                            z44 = false;
                        }
                        zM87153g3 = z44 | c28655q3.m87153g(interfaceC28670t2M30588b);
                        objM87133R20 = c28655q3.m87133R();
                        if (zM87153g3 || objM87133R20 == c28676v1) {
                            objM87133R20 = new b(function7, interfaceC28670t2M30588b, null);
                            c28655q3.m87172p0(objM87133R20);
                        }
                        AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R20, fValueOf);
                        Boolean boolValueOf = Boolean.valueOf(bottomSheetState.getVisible());
                        i46 = i45 & 14;
                        if (i46 != 4) {
                            if ((i45 & 8) != 0) {
                                c10978m0 = bottomSheetState;
                                if (c28655q3.m87157i(c10978m0)) {
                                }
                                boolean zM87155h2 = z45 | c28655q3.m87155h(z28);
                                z46 = z28;
                                f14 = f13;
                                zM87147d = zM87155h2 | c28655q3.m87147d(f14);
                                objM87133R21 = c28655q3.m87133R();
                                if (!zM87147d || objM87133R21 == c28676v1) {
                                    objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                                    f15 = f14;
                                    c28655q3.m87172p0(objM87133R21);
                                } else {
                                    f15 = f14;
                                }
                                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R21, boolValueOf);
                                Float fValueOf2 = Float.valueOf(f15);
                                if (i46 != 4 || ((i45 & 8) != 0 && c28655q3.m87157i(c10978m0))) {
                                    z47 = true;
                                } else {
                                    z47 = false;
                                }
                                zM87147d2 = z47 | c28655q3.m87147d(f15);
                                objM87133R22 = c28655q3.m87133R();
                                if (zM87147d2 || objM87133R22 == c28676v1) {
                                    objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                                    c28655q3.m87172p0(objM87133R22);
                                }
                                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R22, fValueOf2);
                                Boolean boolValueOf2 = Boolean.valueOf(z39);
                                boolean zM87155h3 = c28655q3.m87155h(z39);
                                if (i46 != 4 || ((i45 & 8) != 0 && c28655q3.m87157i(c10978m0))) {
                                    z48 = true;
                                } else {
                                    z48 = false;
                                }
                                z49 = zM87155h3 | z48;
                                objM87133R23 = c28655q3.m87133R();
                                if (z49 || objM87133R23 == c28676v1) {
                                    objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                                    c28655q3.m87172p0(objM87133R23);
                                }
                                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R23, boolValueOf2);
                                boolean zM29243k = bottomSheetState.getVisible();
                                zM87155h = c28655q3.m87155h(z29) | c28655q3.m87147d(f15) | c28655q3.m87157i(interfaceC2994c6) | ((i45 & 112) == 32);
                                objM87133R24 = c28655q3.m87133R();
                                if (zM87155h || objM87133R24 == c28676v1) {
                                    final InterfaceC2994c0 interfaceC2994c7 = interfaceC2994c6;
                                    final boolean z57 = z29;
                                    final float f17 = f15;
                                    objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            return AbstractC10969j0.m29210y0(z57, f17, interfaceC2994c7, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                                        }
                                    };
                                    c28655q3.m87172p0(objM87133R24);
                                }
                                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R24, zM29243k, c28655q3, 0, 0);
                                if (!bottomSheetState.getVisible() || bottomSheetState.getIsPrefetchEnabled() || z24) {
                                    InterfaceC4351m interfaceC4351m15 = interfaceC4351m12;
                                    final boolean z58 = z24;
                                    final InterfaceC4340b interfaceC4340b4 = interfaceC4340b3;
                                    C28673u1[] c28673u1Arr = {f34074a.mo86977a(Boolean.valueOf(bottomSheetState.getVisible())), f34075b.mo86977a(m29159b0(interfaceC28601c5)), f34076c.mo86977a(c11011y1)};
                                    final Function3 function9 = function8;
                                    final C10962h c10962h2 = c10962h;
                                    final InterfaceC28601c1 interfaceC28601c13 = interfaceC28601c8;
                                    final InterfaceC39171c interfaceC39171c3 = interfaceC39171c2;
                                    final boolean z59 = z29;
                                    AbstractC28683x.m87248b(c28673u1Arr, AbstractC37817c.m121344e(1438636126, c28655q3, new InterfaceC4351m() { // from class: cp0.h0
                                        @Override // c93.InterfaceC4351m
                                        public final Object invoke(Object obj, Object obj2) {
                                            int iIntValue = ((Integer) obj2).intValue();
                                            return AbstractC10969j0.m29104A0(interfaceC39171c3, zIsFeatureEnabled2, bottomSheetState, c32645n0, z59, c10962h2, c11011y1, z58, onDismiss, function9, interfaceC4340b4, interfaceC28690z2, interfaceC28670t2M30588b, interfaceC28670t2M30588b2, interfaceC28601c5, interfaceC28601c7, interfaceC28601c12, interfaceC28601c2, interfaceC28601c13, interfaceC28601c9, interfaceC28601c10, interfaceC28601c3, interfaceC28601c11, interfaceC28601c4, (Composer) obj, iIntValue);
                                        }
                                    }), c28655q3, 56);
                                    c28655q = c28655q3;
                                    z16 = z58;
                                    interfaceC4340b2 = interfaceC4340b4;
                                    function6 = function9;
                                    interfaceC2994c2 = interfaceC2994c6;
                                    z17 = z38;
                                    interfaceC4351m4 = interfaceC4351m15;
                                    interfaceC4351m5 = interfaceC4351m11;
                                    function5 = function7;
                                    interfaceC40915c2 = interfaceC40915c4;
                                    c4656v1 = c4656v2;
                                } else {
                                    C28677v1 c28677v1M87180u2 = c28655q3.m87180u();
                                    if (c28677v1M87180u2 == null) {
                                        return;
                                    }
                                    final int i57 = 0;
                                    final InterfaceC2994c0 interfaceC2994c8 = interfaceC2994c6;
                                    final InterfaceC4351m interfaceC4351m16 = interfaceC4351m12;
                                    final Function1 function10 = function7;
                                    final Function3 function11 = function8;
                                    final boolean z60 = z24;
                                    final C4656v0 c4656v4 = c4656v2;
                                    final InterfaceC4340b interfaceC4340b5 = interfaceC4340b3;
                                    interfaceC4351m6 = new InterfaceC4351m() { // from class: cp0.g0
                                        @Override // c93.InterfaceC4351m
                                        public final Object invoke(Object obj, Object obj2) {
                                            Composer composer2 = (Composer) obj;
                                            switch (i57) {
                                                case 0:
                                                    return AbstractC10969j0.m29212z0(bottomSheetState, onDismiss, interfaceC40915c4, interfaceC2994c8, function10, function11, z38, interfaceC4351m16, interfaceC4351m11, z60, c4656v4, interfaceC4340b5, i13, i14, i15, composer2, ((Integer) obj2).intValue());
                                                default:
                                                    return AbstractC10969j0.m29126L0(bottomSheetState, onDismiss, interfaceC40915c4, interfaceC2994c8, function10, function11, z38, interfaceC4351m16, interfaceC4351m11, z60, c4656v4, interfaceC4340b5, i13, i14, i15, composer2, ((Integer) obj2).intValue());
                                            }
                                        }
                                    };
                                    c28677v1 = c28677v1M87180u2;
                                }
                                c28677v1.f115982d = interfaceC4351m6;
                            }
                            c10978m0 = bottomSheetState;
                            interfaceC39171c2 = interfaceC39171c;
                            z45 = false;
                            boolean zM87155h4 = z45 | c28655q3.m87155h(z28);
                            z46 = z28;
                            f14 = f13;
                            zM87147d = zM87155h4 | c28655q3.m87147d(f14);
                            objM87133R21 = c28655q3.m87133R();
                            if (zM87147d) {
                                objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                                f15 = f14;
                                c28655q3.m87172p0(objM87133R21);
                            } else {
                                objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                                f15 = f14;
                                c28655q3.m87172p0(objM87133R21);
                            }
                            AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R21, boolValueOf);
                            Float fValueOf3 = Float.valueOf(f15);
                            if (i46 != 4) {
                                z47 = true;
                            } else {
                                z47 = true;
                            }
                            zM87147d2 = z47 | c28655q3.m87147d(f15);
                            objM87133R22 = c28655q3.m87133R();
                            if (zM87147d2) {
                                objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                                c28655q3.m87172p0(objM87133R22);
                            } else {
                                objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                                c28655q3.m87172p0(objM87133R22);
                            }
                            AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R22, fValueOf3);
                            Boolean boolValueOf3 = Boolean.valueOf(z39);
                            boolean zM87155h5 = c28655q3.m87155h(z39);
                            if (i46 != 4) {
                                z48 = true;
                            } else {
                                z48 = true;
                            }
                            z49 = zM87155h5 | z48;
                            objM87133R23 = c28655q3.m87133R();
                            if (z49) {
                                objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                                c28655q3.m87172p0(objM87133R23);
                            } else {
                                objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                                c28655q3.m87172p0(objM87133R23);
                            }
                            AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R23, boolValueOf3);
                            boolean zM29243k2 = bottomSheetState.getVisible();
                            zM87155h = c28655q3.m87155h(z29) | c28655q3.m87147d(f15) | c28655q3.m87157i(interfaceC2994c6) | ((i45 & 112) == 32);
                            objM87133R24 = c28655q3.m87133R();
                            if (zM87155h) {
                                final InterfaceC2994c0 interfaceC2994c9 = interfaceC2994c6;
                                final boolean z510 = z29;
                                final float f18 = f15;
                                objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC10969j0.m29210y0(z510, f18, interfaceC2994c9, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                                    }
                                };
                                c28655q3.m87172p0(objM87133R24);
                            } else {
                                final InterfaceC2994c0 interfaceC2994c10 = interfaceC2994c6;
                                final boolean z511 = z29;
                                final float f19 = f15;
                                objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC10969j0.m29210y0(z511, f19, interfaceC2994c10, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                                    }
                                };
                                c28655q3.m87172p0(objM87133R24);
                            }
                            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R24, zM29243k2, c28655q3, 0, 0);
                            if (bottomSheetState.getVisible()) {
                            }
                            InterfaceC4351m interfaceC4351m17 = interfaceC4351m12;
                            final boolean z512 = z24;
                            final InterfaceC4340b interfaceC4340b6 = interfaceC4340b3;
                            C28673u1[] c28673u1Arr2 = {f34074a.mo86977a(Boolean.valueOf(bottomSheetState.getVisible())), f34075b.mo86977a(m29159b0(interfaceC28601c5)), f34076c.mo86977a(c11011y1)};
                            final Function3 function12 = function8;
                            final C10962h c10962h3 = c10962h;
                            final InterfaceC28601c1 interfaceC28601c14 = interfaceC28601c8;
                            final InterfaceC39171c interfaceC39171c4 = interfaceC39171c2;
                            final boolean z513 = z29;
                            AbstractC28683x.m87248b(c28673u1Arr2, AbstractC37817c.m121344e(1438636126, c28655q3, new InterfaceC4351m() { // from class: cp0.h0
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC10969j0.m29104A0(interfaceC39171c4, zIsFeatureEnabled2, bottomSheetState, c32645n0, z513, c10962h3, c11011y1, z512, onDismiss, function12, interfaceC4340b6, interfaceC28690z2, interfaceC28670t2M30588b, interfaceC28670t2M30588b2, interfaceC28601c5, interfaceC28601c7, interfaceC28601c12, interfaceC28601c2, interfaceC28601c14, interfaceC28601c9, interfaceC28601c10, interfaceC28601c3, interfaceC28601c11, interfaceC28601c4, (Composer) obj, iIntValue);
                                }
                            }), c28655q3, 56);
                            c28655q = c28655q3;
                            z16 = z512;
                            interfaceC4340b2 = interfaceC4340b6;
                            function6 = function12;
                            interfaceC2994c2 = interfaceC2994c6;
                            z17 = z38;
                            interfaceC4351m4 = interfaceC4351m17;
                            interfaceC4351m5 = interfaceC4351m11;
                            function5 = function7;
                            interfaceC40915c2 = interfaceC40915c4;
                            c4656v1 = c4656v2;
                        } else {
                            c10978m0 = bottomSheetState;
                        }
                        interfaceC39171c2 = interfaceC39171c;
                        z45 = true;
                        boolean zM87155h6 = z45 | c28655q3.m87155h(z28);
                        z46 = z28;
                        f14 = f13;
                        zM87147d = zM87155h6 | c28655q3.m87147d(f14);
                        objM87133R21 = c28655q3.m87133R();
                        if (zM87147d) {
                            objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                            f15 = f14;
                            c28655q3.m87172p0(objM87133R21);
                        } else {
                            objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                            f15 = f14;
                            c28655q3.m87172p0(objM87133R21);
                        }
                        AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R21, boolValueOf);
                        Float fValueOf4 = Float.valueOf(f15);
                        if (i46 != 4) {
                            z47 = true;
                        } else {
                            z47 = true;
                        }
                        zM87147d2 = z47 | c28655q3.m87147d(f15);
                        objM87133R22 = c28655q3.m87133R();
                        if (zM87147d2) {
                            objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                            c28655q3.m87172p0(objM87133R22);
                        } else {
                            objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                            c28655q3.m87172p0(objM87133R22);
                        }
                        AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R22, fValueOf4);
                        Boolean boolValueOf4 = Boolean.valueOf(z39);
                        boolean zM87155h7 = c28655q3.m87155h(z39);
                        if (i46 != 4) {
                            z48 = true;
                        } else {
                            z48 = true;
                        }
                        z49 = zM87155h7 | z48;
                        objM87133R23 = c28655q3.m87133R();
                        if (z49) {
                            objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                            c28655q3.m87172p0(objM87133R23);
                        } else {
                            objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                            c28655q3.m87172p0(objM87133R23);
                        }
                        AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R23, boolValueOf4);
                        boolean zM29243k3 = bottomSheetState.getVisible();
                        zM87155h = c28655q3.m87155h(z29) | c28655q3.m87147d(f15) | c28655q3.m87157i(interfaceC2994c6) | ((i45 & 112) == 32);
                        objM87133R24 = c28655q3.m87133R();
                        if (zM87155h) {
                            final InterfaceC2994c0 interfaceC2994c11 = interfaceC2994c6;
                            final boolean z514 = z29;
                            final float f110 = f15;
                            objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC10969j0.m29210y0(z514, f110, interfaceC2994c11, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                                }
                            };
                            c28655q3.m87172p0(objM87133R24);
                        } else {
                            final InterfaceC2994c0 interfaceC2994c12 = interfaceC2994c6;
                            final boolean z515 = z29;
                            final float f111 = f15;
                            objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC10969j0.m29210y0(z515, f111, interfaceC2994c12, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                                }
                            };
                            c28655q3.m87172p0(objM87133R24);
                        }
                        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R24, zM29243k3, c28655q3, 0, 0);
                        if (bottomSheetState.getVisible()) {
                        }
                        InterfaceC4351m interfaceC4351m18 = interfaceC4351m12;
                        final boolean z516 = z24;
                        final InterfaceC4340b interfaceC4340b7 = interfaceC4340b3;
                        C28673u1[] c28673u1Arr3 = {f34074a.mo86977a(Boolean.valueOf(bottomSheetState.getVisible())), f34075b.mo86977a(m29159b0(interfaceC28601c5)), f34076c.mo86977a(c11011y1)};
                        final Function3 function13 = function8;
                        final C10962h c10962h4 = c10962h;
                        final InterfaceC28601c1 interfaceC28601c15 = interfaceC28601c8;
                        final InterfaceC39171c interfaceC39171c5 = interfaceC39171c2;
                        final boolean z517 = z29;
                        AbstractC28683x.m87248b(c28673u1Arr3, AbstractC37817c.m121344e(1438636126, c28655q3, new InterfaceC4351m() { // from class: cp0.h0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC10969j0.m29104A0(interfaceC39171c5, zIsFeatureEnabled2, bottomSheetState, c32645n0, z517, c10962h4, c11011y1, z516, onDismiss, function13, interfaceC4340b7, interfaceC28690z2, interfaceC28670t2M30588b, interfaceC28670t2M30588b2, interfaceC28601c5, interfaceC28601c7, interfaceC28601c12, interfaceC28601c2, interfaceC28601c15, interfaceC28601c9, interfaceC28601c10, interfaceC28601c3, interfaceC28601c11, interfaceC28601c4, (Composer) obj, iIntValue);
                            }
                        }), c28655q3, 56);
                        c28655q = c28655q3;
                        z16 = z516;
                        interfaceC4340b2 = interfaceC4340b7;
                        function6 = function13;
                        interfaceC2994c2 = interfaceC2994c6;
                        z17 = z38;
                        interfaceC4351m4 = interfaceC4351m18;
                        interfaceC4351m5 = interfaceC4351m11;
                        function5 = function7;
                        interfaceC40915c2 = interfaceC40915c4;
                        c4656v1 = c4656v2;
                    } else {
                        c28655q4.m87138X();
                        z16 = z13;
                        interfaceC4340b2 = interfaceC4340b;
                        c28655q = c28655q4;
                        function5 = function2;
                        function6 = function4;
                        z17 = z14;
                        interfaceC2994c2 = interfaceC2994c1;
                        interfaceC4351m4 = interfaceC4351m3;
                        interfaceC4351m5 = interfaceC4351m2;
                        c4656v1 = c4656v3;
                        interfaceC40915c2 = interfaceC40915c;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        final int i58 = 1;
                        interfaceC4351m6 = new InterfaceC4351m() { // from class: cp0.g0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                Composer composer2 = (Composer) obj;
                                switch (i58) {
                                    case 0:
                                        return AbstractC10969j0.m29212z0(bottomSheetState, onDismiss, interfaceC40915c2, interfaceC2994c2, function5, function6, z17, interfaceC4351m4, interfaceC4351m5, z16, c4656v1, interfaceC4340b2, i13, i14, i15, composer2, ((Integer) obj2).intValue());
                                    default:
                                        return AbstractC10969j0.m29126L0(bottomSheetState, onDismiss, interfaceC40915c2, interfaceC2994c2, function5, function6, z17, interfaceC4351m4, interfaceC4351m5, z16, c4656v1, interfaceC4340b2, i13, i14, i15, composer2, ((Integer) obj2).intValue());
                                }
                            }
                        };
                        c28677v1 = c28677v1M87180u;
                        c28677v1.f115982d = interfaceC4351m6;
                    }
                }
                i36 |= 48;
                if ((i16 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (c28655q4.m87135U(i16 & 1, z15)) {
                    c28655q4.m87140Z();
                    i44 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i44 != 0) {
                        if (i48 != 0) {
                            interfaceC40915c3 = null;
                        } else {
                            interfaceC40915c3 = interfaceC40915c;
                        }
                        if ((i15 & 8) != 0) {
                            objM87133R3 = c28655q4.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = AbstractC28683x.m87262p(c28655q4);
                                c28655q4.m87172p0(objM87133R3);
                            }
                            interfaceC2994c3 = (InterfaceC2994c0) objM87133R3;
                            i16 &= -7169;
                        } else {
                            interfaceC2994c3 = interfaceC2994c1;
                        }
                        if (i49 != 0) {
                            function2 = null;
                        }
                        if (i17 != 0) {
                            function4 = null;
                        }
                        if (i19 != 0) {
                            z14 = false;
                        }
                        if (i25 != 0) {
                            objM87133R2 = c28655q4.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C4139w0(7);
                                c28655q4.m87172p0(objM87133R2);
                            }
                            interfaceC4351m7 = (InterfaceC4351m) objM87133R2;
                        } else {
                            interfaceC4351m7 = interfaceC4351m3;
                        }
                        if (i27 != 0) {
                            objM87133R = c28655q4.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C4139w0(8);
                                c28655q4.m87172p0(objM87133R);
                            }
                            interfaceC4351m8 = (InterfaceC4351m) objM87133R;
                        } else {
                            interfaceC4351m8 = interfaceC4351m2;
                        }
                        if (i29 != 0) {
                            z18 = false;
                        } else {
                            z18 = z13;
                        }
                        if (i35 != 0) {
                            c4656v3 = null;
                        }
                        if (i38 != 0) {
                            str = null;
                            C37816b c37816bM121344e3 = AbstractC37817c.m121344e(-633821104, c28655q4, new InterfaceC4340b() { // from class: cp0.i0
                                @Override // c93.InterfaceC4340b
                                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
                                    int iIntValue = ((Integer) obj10).intValue();
                                    return AbstractC10969j0.m29137R(interfaceC40915c3, bottomSheetState, z18, c4656v3, (C32645n0) obj, (InterfaceC4339a) obj2, (InterfaceC4353o) obj3, (Function1) obj4, (Function1) obj5, (InterfaceC4339a) obj6, (String) obj7, (Function3) obj8, (C28655q) ((Composer) obj9), iIntValue);
                                }
                            });
                            c4656v2 = c4656v3;
                            i45 = i16;
                            function7 = function2;
                            function8 = function4;
                            interfaceC2994c4 = interfaceC2994c3;
                            z19 = z14;
                            interfaceC4351m9 = interfaceC4351m7;
                            interfaceC4351m10 = interfaceC4351m8;
                            z24 = z18;
                            interfaceC4340b3 = c37816bM121344e3;
                        } else {
                            str = null;
                            interfaceC4340b3 = interfaceC4340b;
                            c4656v2 = c4656v3;
                            i45 = i16;
                            function7 = function2;
                            function8 = function4;
                            interfaceC2994c4 = interfaceC2994c3;
                            z19 = z14;
                            interfaceC4351m9 = interfaceC4351m7;
                            interfaceC4351m10 = interfaceC4351m8;
                            z24 = z18;
                        }
                    } else {
                        if (i48 != 0) {
                            interfaceC40915c3 = null;
                        } else {
                            interfaceC40915c3 = interfaceC40915c;
                        }
                        if ((i15 & 8) != 0) {
                            objM87133R3 = c28655q4.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = AbstractC28683x.m87262p(c28655q4);
                                c28655q4.m87172p0(objM87133R3);
                            }
                            interfaceC2994c3 = (InterfaceC2994c0) objM87133R3;
                            i16 &= -7169;
                        } else {
                            interfaceC2994c3 = interfaceC2994c1;
                        }
                        if (i49 != 0) {
                            function2 = null;
                        }
                        if (i17 != 0) {
                            function4 = null;
                        }
                        if (i19 != 0) {
                            z14 = false;
                        }
                        if (i25 != 0) {
                            objM87133R2 = c28655q4.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C4139w0(7);
                                c28655q4.m87172p0(objM87133R2);
                            }
                            interfaceC4351m7 = (InterfaceC4351m) objM87133R2;
                        } else {
                            interfaceC4351m7 = interfaceC4351m3;
                        }
                        if (i27 != 0) {
                            objM87133R = c28655q4.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C4139w0(8);
                                c28655q4.m87172p0(objM87133R);
                            }
                            interfaceC4351m8 = (InterfaceC4351m) objM87133R;
                        } else {
                            interfaceC4351m8 = interfaceC4351m2;
                        }
                        if (i29 != 0) {
                            z18 = false;
                        } else {
                            z18 = z13;
                        }
                        if (i35 != 0) {
                            c4656v3 = null;
                        }
                        if (i38 != 0) {
                            str = null;
                            C37816b c37816bM121344e4 = AbstractC37817c.m121344e(-633821104, c28655q4, new InterfaceC4340b() { // from class: cp0.i0
                                @Override // c93.InterfaceC4340b
                                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
                                    int iIntValue = ((Integer) obj10).intValue();
                                    return AbstractC10969j0.m29137R(interfaceC40915c3, bottomSheetState, z18, c4656v3, (C32645n0) obj, (InterfaceC4339a) obj2, (InterfaceC4353o) obj3, (Function1) obj4, (Function1) obj5, (InterfaceC4339a) obj6, (String) obj7, (Function3) obj8, (C28655q) ((Composer) obj9), iIntValue);
                                }
                            });
                            c4656v2 = c4656v3;
                            i45 = i16;
                            function7 = function2;
                            function8 = function4;
                            interfaceC2994c4 = interfaceC2994c3;
                            z19 = z14;
                            interfaceC4351m9 = interfaceC4351m7;
                            interfaceC4351m10 = interfaceC4351m8;
                            z24 = z18;
                            interfaceC4340b3 = c37816bM121344e4;
                        } else {
                            str = null;
                            interfaceC4340b3 = interfaceC4340b;
                            c4656v2 = c4656v3;
                            i45 = i16;
                            function7 = function2;
                            function8 = function4;
                            interfaceC2994c4 = interfaceC2994c3;
                            z19 = z14;
                            interfaceC4351m9 = interfaceC4351m7;
                            interfaceC4351m10 = interfaceC4351m8;
                            z24 = z18;
                        }
                    }
                    c28655q4.m87175r();
                    zM87153g = c28655q4.m87153g(bottomSheetState.getScreenContext());
                    objM87133R4 = c28655q4.m87133R();
                    if (zM87153g) {
                        objM87133R4 = m29172f1(bottomSheetState.getScreenContext());
                        c28655q4.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = m29172f1(bottomSheetState.getScreenContext());
                        c28655q4.m87172p0(objM87133R4);
                    }
                    final C32645n0 c32645n1 = (C32645n0) objM87133R4;
                    FeatureFlagChecker featureFlagChecker2 = (FeatureFlagChecker) c28655q4.m87161k(AbstractC38073e.m121968p());
                    C10978m0.Companion aVar2 = C10978m0.INSTANCE;
                    zM29247c = aVar2.m29247c(bottomSheetState.getScreenContext());
                    zM29246b = aVar2.m29246b(bottomSheetState.getCustomDrawerPresentation(), bottomSheetState.getShouldOpenFullSize(), zM29247c, bottomSheetState.getReadOnlyHalfSheet());
                    final boolean zIsFeatureEnabled3 = featureFlagChecker2.isFeatureEnabled("wce-padding-keyboard-fix");
                    zIsFeatureEnabled = featureFlagChecker2.isFeatureEnabled("context-hub-profile");
                    Set setM74059b2 = AbstractC25260n.m74059b1(new String[]{"CONTEXT_HUB", "CONTEXT_DETAILS"});
                    c13404jM29240h = bottomSheetState.getScreenContext();
                    if (c13404jM29240h != null) {
                        screenId = c13404jM29240h.getScreenId();
                    } else {
                        screenId = str;
                    }
                    zM74155w0 = AbstractC25265s.m74155w0(setM74059b2, screenId);
                    objM87133R5 = c28655q4.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(str);
                        c28655q4.m87172p0(objM87133R5);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                    objM87133R6 = c28655q4.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87272z(str);
                        c28655q4.m87172p0(objM87133R6);
                    }
                    final InterfaceC28601c1 interfaceC28601c16 = (InterfaceC28601c1) objM87133R6;
                    objM87133R7 = c28655q4.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC28683x.m87272z(str);
                        c28655q4.m87172p0(objM87133R7);
                    }
                    final InterfaceC28601c1 interfaceC28601c17 = (InterfaceC28601c1) objM87133R7;
                    objM87133R8 = c28655q4.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = AbstractC28683x.m87272z("");
                        c28655q4.m87172p0(objM87133R8);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R8;
                    final InterfaceC40915c interfaceC40915c5 = interfaceC40915c3;
                    objM87133R9 = c28655q4.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = AbstractC28683x.m87272z(Boolean.TRUE);
                        c28655q4.m87172p0(objM87133R9);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R9;
                    objM87133R10 = c28655q4.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = AbstractC28683x.m87272z(Boolean.TRUE);
                        c28655q4.m87172p0(objM87133R10);
                    }
                    final InterfaceC28601c1 interfaceC28601c18 = (InterfaceC28601c1) objM87133R10;
                    objM87133R11 = c28655q4.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = AbstractC28683x.m87272z(Boolean.TRUE);
                        c28655q4.m87172p0(objM87133R11);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R11;
                    if (zIsFeatureEnabled) {
                        z25 = zM74155w0;
                    } else {
                        z25 = true;
                    }
                    if (m29143U(interfaceC28601c4)) {
                        z26 = false;
                    } else {
                        z26 = false;
                    }
                    if (zIsFeatureEnabled) {
                        z27 = false;
                    } else {
                        z27 = false;
                    }
                    if (m29133P(interfaceC28601c3)) {
                        c28655q4.m87150e0(2094451546);
                        C37816b c37816bM121344e5 = AbstractC37817c.m121344e(36773779, c28655q4, new C0003a0(19, interfaceC28601c2, interfaceC28601c1));
                        c28655q4.m87173q(false);
                        r10 = c37816bM121344e5;
                    } else {
                        c28655q4.m87150e0(2094652488);
                        c28655q4.m87173q(false);
                        r10 = str;
                    }
                    final boolean z518 = z27;
                    final boolean z519 = z26;
                    c10962h = new C10962h(r10, AbstractC37817c.m121344e(-582148231, c28655q4, new InterfaceC4351m() { // from class: cp0.b0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC10969j0.m29151Y(z519, z518, zIsFeatureEnabled, interfaceC28601c16, interfaceC28601c17, (Composer) obj, iIntValue);
                        }
                    }));
                    c10962hM29242j = bottomSheetState.getToolbarContent();
                    if (c10962hM29242j == null) {
                        c10962h = c10962hM29242j;
                    } else if (zM29247c) {
                        ?? r15 = str;
                        c10962h = new C10962h(r15, r15, 3, r15);
                    }
                    fM29245a = aVar2.m29245a(bottomSheetState.getCustomDrawerPresentation());
                    objM87133R12 = c28655q4.m87133R();
                    if (objM87133R12 == c28676v0) {
                        objM87133R12 = AbstractC28683x.m87272z(bottomSheetState.getInitialSheetState());
                        c28655q4.m87172p0(objM87133R12);
                    }
                    interfaceC28601c5 = (InterfaceC28601c1) objM87133R12;
                    objM87133R13 = c28655q4.m87133R();
                    if (objM87133R13 == c28676v0) {
                        objM87133R13 = AbstractC28683x.m87272z(bottomSheetState.getInitialSheetState());
                        c28655q4.m87172p0(objM87133R13);
                    }
                    interfaceC28601c6 = (InterfaceC28601c1) objM87133R13;
                    objM87133R14 = c28655q4.m87133R();
                    if (objM87133R14 == c28676v0) {
                        objM87133R14 = AbstractC11266d.m30468v(bottomSheetState.getInitialHeightFraction(), c28655q4);
                    }
                    interfaceC28690z0 = (InterfaceC28690z0) objM87133R14;
                    objM87133R15 = c28655q4.m87133R();
                    if (objM87133R15 == c28676v0) {
                        if (bottomSheetState.getInitialSheetState() == EnumC11003u1.Hidden) {
                            f16 = 0.0f;
                        } else {
                            f16 = 1.0f;
                        }
                        objM87133R15 = AbstractC11266d.m30468v(f16, c28655q4);
                    }
                    interfaceC28690z1 = (InterfaceC28690z0) objM87133R15;
                    objM87133R16 = c28655q4.m87133R();
                    if (objM87133R16 == c28676v0) {
                        objM87133R16 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q4.m87172p0(objM87133R16);
                    }
                    interfaceC28601c7 = (InterfaceC28601c1) objM87133R16;
                    objM87133R17 = c28655q4.m87133R();
                    if (objM87133R17 == c28676v0) {
                        objM87133R17 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q4.m87172p0(objM87133R17);
                    }
                    final InterfaceC28601c1 interfaceC28601c19 = (InterfaceC28601c1) objM87133R17;
                    objM87133R18 = c28655q4.m87133R();
                    if (objM87133R18 == c28676v0) {
                        objM87133R18 = AbstractC11266d.m30468v(0.0f, c28655q4);
                    }
                    interfaceC28690z2 = (InterfaceC28690z0) objM87133R18;
                    zM87153g2 = c28655q4.m87153g(interfaceC2994c4);
                    interfaceC2994c5 = interfaceC2994c4;
                    Object objM87133R26 = c28655q4.m87133R();
                    if (zM87153g2) {
                        final int i59 = 0;
                        final int i510 = 1;
                        final int i511 = 2;
                        interfaceC28601c8 = interfaceC28601c1;
                        z28 = zM29246b;
                        f13 = fM29245a;
                        c28676v1 = c28676v0;
                        interfaceC2994c6 = interfaceC2994c5;
                        c28655q2 = c28655q4;
                        z29 = zM29247c;
                        c11011y0 = new C11011y0(interfaceC2994c6, z29, new InterfaceC4339a() { // from class: cp0.c0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                float fM29188n0;
                                switch (i59) {
                                    case 0:
                                        fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z2);
                                        break;
                                    case 1:
                                        fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z2);
                                        break;
                                    default:
                                        fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z2);
                                        break;
                                }
                                return Float.valueOf(fM29188n0);
                            }
                        }, new C10992r(1, interfaceC28601c5), new InterfaceC4339a() { // from class: cp0.c0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                float fM29188n0;
                                switch (i510) {
                                    case 0:
                                        fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z1);
                                        break;
                                    case 1:
                                        fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z1);
                                        break;
                                    default:
                                        fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z1);
                                        break;
                                }
                                return Float.valueOf(fM29188n0);
                            }
                        }, new InterfaceC4339a() { // from class: cp0.c0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                float fM29188n0;
                                switch (i511) {
                                    case 0:
                                        fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z0);
                                        break;
                                    case 1:
                                        fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z0);
                                        break;
                                    default:
                                        fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z0);
                                        break;
                                }
                                return Float.valueOf(fM29188n0);
                            }
                        }, new C10975l0(interfaceC28690z1, 3), new C10975l0(interfaceC28690z0, 4), new C10972k0(7, interfaceC28601c5), new C10972k0(11, interfaceC28601c7), onDismiss);
                        c28655q2.m87172p0(c11011y0);
                    } else {
                        final int i512 = 0;
                        final int i513 = 1;
                        final int i514 = 2;
                        interfaceC28601c8 = interfaceC28601c1;
                        z28 = zM29246b;
                        f13 = fM29245a;
                        c28676v1 = c28676v0;
                        interfaceC2994c6 = interfaceC2994c5;
                        c28655q2 = c28655q4;
                        z29 = zM29247c;
                        c11011y0 = new C11011y0(interfaceC2994c6, z29, new InterfaceC4339a() { // from class: cp0.c0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                float fM29188n0;
                                switch (i512) {
                                    case 0:
                                        fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z2);
                                        break;
                                    case 1:
                                        fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z2);
                                        break;
                                    default:
                                        fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z2);
                                        break;
                                }
                                return Float.valueOf(fM29188n0);
                            }
                        }, new C10992r(1, interfaceC28601c5), new InterfaceC4339a() { // from class: cp0.c0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                float fM29188n0;
                                switch (i513) {
                                    case 0:
                                        fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z1);
                                        break;
                                    case 1:
                                        fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z1);
                                        break;
                                    default:
                                        fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z1);
                                        break;
                                }
                                return Float.valueOf(fM29188n0);
                            }
                        }, new InterfaceC4339a() { // from class: cp0.c0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                float fM29188n0;
                                switch (i514) {
                                    case 0:
                                        fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z0);
                                        break;
                                    case 1:
                                        fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z0);
                                        break;
                                    default:
                                        fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z0);
                                        break;
                                }
                                return Float.valueOf(fM29188n0);
                            }
                        }, new C10975l0(interfaceC28690z1, 3), new C10975l0(interfaceC28690z0, 4), new C10972k0(7, interfaceC28601c5), new C10972k0(11, interfaceC28601c7), onDismiss);
                        c28655q2.m87172p0(c11011y0);
                    }
                    final C11011y0 c11011y2 = (C11011y0) c11011y0;
                    c13404jM29240h2 = bottomSheetState.getScreenContext();
                    if (c13404jM29240h2 != null) {
                        source = "";
                    } else {
                        source = "";
                    }
                    EnumC11003u1 enumC11003u1M29159b1 = m29159b0(interfaceC28601c5);
                    if ((i45 & 234881024) == 67108864) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    boolean zM87153g5 = z34 | c28655q2.m87153g(source);
                    if ((i45 & 3670016) == 1048576) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    boolean z520 = zM87153g5 | z35;
                    if ((i45 & 29360128) == 8388608) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    z37 = z520 | z36;
                    objM87133R19 = c28655q2.m87133R();
                    if (z37) {
                        boolean z521 = z19;
                        InterfaceC4351m interfaceC4351m19 = interfaceC4351m9;
                        InterfaceC4351m interfaceC4351m110 = interfaceC4351m10;
                        objM87133R19 = new a(interfaceC4351m110, source, z521, interfaceC4351m19, interfaceC28601c6, interfaceC28601c5, null);
                        interfaceC4351m11 = interfaceC4351m110;
                        interfaceC4351m12 = interfaceC4351m19;
                        z38 = z521;
                        c28655q2.m87172p0(objM87133R19);
                    } else {
                        boolean z522 = z19;
                        InterfaceC4351m interfaceC4351m111 = interfaceC4351m9;
                        InterfaceC4351m interfaceC4351m112 = interfaceC4351m10;
                        objM87133R19 = new a(interfaceC4351m112, source, z522, interfaceC4351m111, interfaceC28601c6, interfaceC28601c5, null);
                        interfaceC4351m11 = interfaceC4351m112;
                        interfaceC4351m12 = interfaceC4351m111;
                        z38 = z522;
                        c28655q2.m87172p0(objM87133R19);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R19, enumC11003u1M29159b1);
                    float fM29171f1 = m29171f0(interfaceC28690z0);
                    if (m29180j0(interfaceC28601c7)) {
                        c11347e2M30574v = AbstractC11348f.m30574v(0, 0, null, 6);
                    } else {
                        c11347e2M30574v = AbstractC11348f.m30574v(300, 0, null, 6);
                    }
                    c28655q3 = c28655q2;
                    final InterfaceC28670t2 interfaceC28670t2M30588b3 = AbstractC11352g.m30588b(fM29171f1, c11347e2M30574v, "bottomSheetHeight", null, c28655q3, 3072, 20);
                    interfaceC39171c = (InterfaceC39171c) c28655q3.m87161k(AbstractC2453v1.f9569h);
                    if (bottomSheetState.getImeHeightPx() > 0) {
                        z39 = true;
                    } else {
                        z39 = false;
                    }
                    float fM29176h1 = m29176h0(interfaceC28690z1);
                    if (m29180j0(interfaceC28601c7)) {
                        c11347e2M30574v2 = AbstractC11348f.m30574v(0, 0, null, 6);
                    } else {
                        c11347e2M30574v2 = AbstractC11348f.m30574v(300, 0, null, 6);
                    }
                    interfaceC28670t2M30588b = AbstractC11352g.m30588b(fM29176h1, c11347e2M30574v2, "heroProgress", null, c28655q3, 3072, 20);
                    Float fValueOf5 = Float.valueOf(m29208x0(interfaceC28670t2M30588b));
                    if ((i45 & 57344) == 16384) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    zM87153g3 = z44 | c28655q3.m87153g(interfaceC28670t2M30588b);
                    objM87133R20 = c28655q3.m87133R();
                    if (zM87153g3) {
                        objM87133R20 = new b(function7, interfaceC28670t2M30588b, null);
                        c28655q3.m87172p0(objM87133R20);
                    } else {
                        objM87133R20 = new b(function7, interfaceC28670t2M30588b, null);
                        c28655q3.m87172p0(objM87133R20);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R20, fValueOf5);
                    Boolean boolValueOf5 = Boolean.valueOf(bottomSheetState.getVisible());
                    i46 = i45 & 14;
                    if (i46 != 4) {
                        if ((i45 & 8) != 0) {
                            c10978m0 = bottomSheetState;
                            if (c28655q3.m87157i(c10978m0)) {
                            }
                            boolean zM87155h8 = z45 | c28655q3.m87155h(z28);
                            z46 = z28;
                            f14 = f13;
                            zM87147d = zM87155h8 | c28655q3.m87147d(f14);
                            objM87133R21 = c28655q3.m87133R();
                            if (zM87147d) {
                                objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                                f15 = f14;
                                c28655q3.m87172p0(objM87133R21);
                            } else {
                                objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                                f15 = f14;
                                c28655q3.m87172p0(objM87133R21);
                            }
                            AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R21, boolValueOf5);
                            Float fValueOf6 = Float.valueOf(f15);
                            if (i46 != 4) {
                                z47 = true;
                            } else {
                                z47 = true;
                            }
                            zM87147d2 = z47 | c28655q3.m87147d(f15);
                            objM87133R22 = c28655q3.m87133R();
                            if (zM87147d2) {
                                objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                                c28655q3.m87172p0(objM87133R22);
                            } else {
                                objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                                c28655q3.m87172p0(objM87133R22);
                            }
                            AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R22, fValueOf6);
                            Boolean boolValueOf6 = Boolean.valueOf(z39);
                            boolean zM87155h9 = c28655q3.m87155h(z39);
                            if (i46 != 4) {
                                z48 = true;
                            } else {
                                z48 = true;
                            }
                            z49 = zM87155h9 | z48;
                            objM87133R23 = c28655q3.m87133R();
                            if (z49) {
                                objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                                c28655q3.m87172p0(objM87133R23);
                            } else {
                                objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                                c28655q3.m87172p0(objM87133R23);
                            }
                            AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R23, boolValueOf6);
                            boolean zM29243k4 = bottomSheetState.getVisible();
                            zM87155h = c28655q3.m87155h(z29) | c28655q3.m87147d(f15) | c28655q3.m87157i(interfaceC2994c6) | ((i45 & 112) == 32);
                            objM87133R24 = c28655q3.m87133R();
                            if (zM87155h) {
                                final InterfaceC2994c0 interfaceC2994c13 = interfaceC2994c6;
                                final boolean z5110 = z29;
                                final float f112 = f15;
                                objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC10969j0.m29210y0(z5110, f112, interfaceC2994c13, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                                    }
                                };
                                c28655q3.m87172p0(objM87133R24);
                            } else {
                                final InterfaceC2994c0 interfaceC2994c14 = interfaceC2994c6;
                                final boolean z5111 = z29;
                                final float f113 = f15;
                                objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC10969j0.m29210y0(z5111, f113, interfaceC2994c14, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                                    }
                                };
                                c28655q3.m87172p0(objM87133R24);
                            }
                            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R24, zM29243k4, c28655q3, 0, 0);
                            if (bottomSheetState.getVisible()) {
                            }
                            InterfaceC4351m interfaceC4351m113 = interfaceC4351m12;
                            final boolean z5112 = z24;
                            final InterfaceC4340b interfaceC4340b8 = interfaceC4340b3;
                            C28673u1[] c28673u1Arr4 = {f34074a.mo86977a(Boolean.valueOf(bottomSheetState.getVisible())), f34075b.mo86977a(m29159b0(interfaceC28601c5)), f34076c.mo86977a(c11011y2)};
                            final Function3 function14 = function8;
                            final C10962h c10962h5 = c10962h;
                            final InterfaceC28601c1 interfaceC28601c110 = interfaceC28601c8;
                            final InterfaceC39171c interfaceC39171c6 = interfaceC39171c2;
                            final boolean z5113 = z29;
                            AbstractC28683x.m87248b(c28673u1Arr4, AbstractC37817c.m121344e(1438636126, c28655q3, new InterfaceC4351m() { // from class: cp0.h0
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC10969j0.m29104A0(interfaceC39171c6, zIsFeatureEnabled3, bottomSheetState, c32645n1, z5113, c10962h5, c11011y2, z5112, onDismiss, function14, interfaceC4340b8, interfaceC28690z2, interfaceC28670t2M30588b, interfaceC28670t2M30588b3, interfaceC28601c5, interfaceC28601c7, interfaceC28601c19, interfaceC28601c2, interfaceC28601c110, interfaceC28601c16, interfaceC28601c17, interfaceC28601c3, interfaceC28601c18, interfaceC28601c4, (Composer) obj, iIntValue);
                                }
                            }), c28655q3, 56);
                            c28655q = c28655q3;
                            z16 = z5112;
                            interfaceC4340b2 = interfaceC4340b8;
                            function6 = function14;
                            interfaceC2994c2 = interfaceC2994c6;
                            z17 = z38;
                            interfaceC4351m4 = interfaceC4351m113;
                            interfaceC4351m5 = interfaceC4351m11;
                            function5 = function7;
                            interfaceC40915c2 = interfaceC40915c5;
                            c4656v1 = c4656v2;
                        } else {
                            c10978m0 = bottomSheetState;
                        }
                        interfaceC39171c2 = interfaceC39171c;
                        z45 = false;
                        boolean zM87155h10 = z45 | c28655q3.m87155h(z28);
                        z46 = z28;
                        f14 = f13;
                        zM87147d = zM87155h10 | c28655q3.m87147d(f14);
                        objM87133R21 = c28655q3.m87133R();
                        if (zM87147d) {
                            objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                            f15 = f14;
                            c28655q3.m87172p0(objM87133R21);
                        } else {
                            objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                            f15 = f14;
                            c28655q3.m87172p0(objM87133R21);
                        }
                        AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R21, boolValueOf5);
                        Float fValueOf7 = Float.valueOf(f15);
                        if (i46 != 4) {
                            z47 = true;
                        } else {
                            z47 = true;
                        }
                        zM87147d2 = z47 | c28655q3.m87147d(f15);
                        objM87133R22 = c28655q3.m87133R();
                        if (zM87147d2) {
                            objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                            c28655q3.m87172p0(objM87133R22);
                        } else {
                            objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                            c28655q3.m87172p0(objM87133R22);
                        }
                        AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R22, fValueOf7);
                        Boolean boolValueOf7 = Boolean.valueOf(z39);
                        boolean zM87155h11 = c28655q3.m87155h(z39);
                        if (i46 != 4) {
                            z48 = true;
                        } else {
                            z48 = true;
                        }
                        z49 = zM87155h11 | z48;
                        objM87133R23 = c28655q3.m87133R();
                        if (z49) {
                            objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                            c28655q3.m87172p0(objM87133R23);
                        } else {
                            objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                            c28655q3.m87172p0(objM87133R23);
                        }
                        AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R23, boolValueOf7);
                        boolean zM29243k5 = bottomSheetState.getVisible();
                        zM87155h = c28655q3.m87155h(z29) | c28655q3.m87147d(f15) | c28655q3.m87157i(interfaceC2994c6) | ((i45 & 112) == 32);
                        objM87133R24 = c28655q3.m87133R();
                        if (zM87155h) {
                            final InterfaceC2994c0 interfaceC2994c15 = interfaceC2994c6;
                            final boolean z5114 = z29;
                            final float f114 = f15;
                            objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC10969j0.m29210y0(z5114, f114, interfaceC2994c15, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                                }
                            };
                            c28655q3.m87172p0(objM87133R24);
                        } else {
                            final InterfaceC2994c0 interfaceC2994c16 = interfaceC2994c6;
                            final boolean z5115 = z29;
                            final float f115 = f15;
                            objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC10969j0.m29210y0(z5115, f115, interfaceC2994c16, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                                }
                            };
                            c28655q3.m87172p0(objM87133R24);
                        }
                        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R24, zM29243k5, c28655q3, 0, 0);
                        if (bottomSheetState.getVisible()) {
                        }
                        InterfaceC4351m interfaceC4351m114 = interfaceC4351m12;
                        final boolean z5116 = z24;
                        final InterfaceC4340b interfaceC4340b9 = interfaceC4340b3;
                        C28673u1[] c28673u1Arr5 = {f34074a.mo86977a(Boolean.valueOf(bottomSheetState.getVisible())), f34075b.mo86977a(m29159b0(interfaceC28601c5)), f34076c.mo86977a(c11011y2)};
                        final Function3 function15 = function8;
                        final C10962h c10962h6 = c10962h;
                        final InterfaceC28601c1 interfaceC28601c111 = interfaceC28601c8;
                        final InterfaceC39171c interfaceC39171c7 = interfaceC39171c2;
                        final boolean z5117 = z29;
                        AbstractC28683x.m87248b(c28673u1Arr5, AbstractC37817c.m121344e(1438636126, c28655q3, new InterfaceC4351m() { // from class: cp0.h0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC10969j0.m29104A0(interfaceC39171c7, zIsFeatureEnabled3, bottomSheetState, c32645n1, z5117, c10962h6, c11011y2, z5116, onDismiss, function15, interfaceC4340b9, interfaceC28690z2, interfaceC28670t2M30588b, interfaceC28670t2M30588b3, interfaceC28601c5, interfaceC28601c7, interfaceC28601c19, interfaceC28601c2, interfaceC28601c111, interfaceC28601c16, interfaceC28601c17, interfaceC28601c3, interfaceC28601c18, interfaceC28601c4, (Composer) obj, iIntValue);
                            }
                        }), c28655q3, 56);
                        c28655q = c28655q3;
                        z16 = z5116;
                        interfaceC4340b2 = interfaceC4340b9;
                        function6 = function15;
                        interfaceC2994c2 = interfaceC2994c6;
                        z17 = z38;
                        interfaceC4351m4 = interfaceC4351m114;
                        interfaceC4351m5 = interfaceC4351m11;
                        function5 = function7;
                        interfaceC40915c2 = interfaceC40915c5;
                        c4656v1 = c4656v2;
                    } else {
                        c10978m0 = bottomSheetState;
                    }
                    interfaceC39171c2 = interfaceC39171c;
                    z45 = true;
                    boolean zM87155h12 = z45 | c28655q3.m87155h(z28);
                    z46 = z28;
                    f14 = f13;
                    zM87147d = zM87155h12 | c28655q3.m87147d(f14);
                    objM87133R21 = c28655q3.m87133R();
                    if (zM87147d) {
                        objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                        f15 = f14;
                        c28655q3.m87172p0(objM87133R21);
                    } else {
                        objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                        f15 = f14;
                        c28655q3.m87172p0(objM87133R21);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R21, boolValueOf5);
                    Float fValueOf8 = Float.valueOf(f15);
                    if (i46 != 4) {
                        z47 = true;
                    } else {
                        z47 = true;
                    }
                    zM87147d2 = z47 | c28655q3.m87147d(f15);
                    objM87133R22 = c28655q3.m87133R();
                    if (zM87147d2) {
                        objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                        c28655q3.m87172p0(objM87133R22);
                    } else {
                        objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                        c28655q3.m87172p0(objM87133R22);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R22, fValueOf8);
                    Boolean boolValueOf8 = Boolean.valueOf(z39);
                    boolean zM87155h13 = c28655q3.m87155h(z39);
                    if (i46 != 4) {
                        z48 = true;
                    } else {
                        z48 = true;
                    }
                    z49 = zM87155h13 | z48;
                    objM87133R23 = c28655q3.m87133R();
                    if (z49) {
                        objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                        c28655q3.m87172p0(objM87133R23);
                    } else {
                        objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                        c28655q3.m87172p0(objM87133R23);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R23, boolValueOf8);
                    boolean zM29243k6 = bottomSheetState.getVisible();
                    zM87155h = c28655q3.m87155h(z29) | c28655q3.m87147d(f15) | c28655q3.m87157i(interfaceC2994c6) | ((i45 & 112) == 32);
                    objM87133R24 = c28655q3.m87133R();
                    if (zM87155h) {
                        final InterfaceC2994c0 interfaceC2994c17 = interfaceC2994c6;
                        final boolean z5118 = z29;
                        final float f116 = f15;
                        objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC10969j0.m29210y0(z5118, f116, interfaceC2994c17, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                            }
                        };
                        c28655q3.m87172p0(objM87133R24);
                    } else {
                        final InterfaceC2994c0 interfaceC2994c18 = interfaceC2994c6;
                        final boolean z5119 = z29;
                        final float f117 = f15;
                        objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC10969j0.m29210y0(z5119, f117, interfaceC2994c18, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                            }
                        };
                        c28655q3.m87172p0(objM87133R24);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R24, zM29243k6, c28655q3, 0, 0);
                    if (bottomSheetState.getVisible()) {
                    }
                    InterfaceC4351m interfaceC4351m115 = interfaceC4351m12;
                    final boolean z51110 = z24;
                    final InterfaceC4340b interfaceC4340b10 = interfaceC4340b3;
                    C28673u1[] c28673u1Arr6 = {f34074a.mo86977a(Boolean.valueOf(bottomSheetState.getVisible())), f34075b.mo86977a(m29159b0(interfaceC28601c5)), f34076c.mo86977a(c11011y2)};
                    final Function3 function16 = function8;
                    final C10962h c10962h7 = c10962h;
                    final InterfaceC28601c1 interfaceC28601c112 = interfaceC28601c8;
                    final InterfaceC39171c interfaceC39171c8 = interfaceC39171c2;
                    final boolean z51111 = z29;
                    AbstractC28683x.m87248b(c28673u1Arr6, AbstractC37817c.m121344e(1438636126, c28655q3, new InterfaceC4351m() { // from class: cp0.h0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC10969j0.m29104A0(interfaceC39171c8, zIsFeatureEnabled3, bottomSheetState, c32645n1, z51111, c10962h7, c11011y2, z51110, onDismiss, function16, interfaceC4340b10, interfaceC28690z2, interfaceC28670t2M30588b, interfaceC28670t2M30588b3, interfaceC28601c5, interfaceC28601c7, interfaceC28601c19, interfaceC28601c2, interfaceC28601c112, interfaceC28601c16, interfaceC28601c17, interfaceC28601c3, interfaceC28601c18, interfaceC28601c4, (Composer) obj, iIntValue);
                        }
                    }), c28655q3, 56);
                    c28655q = c28655q3;
                    z16 = z51110;
                    interfaceC4340b2 = interfaceC4340b10;
                    function6 = function16;
                    interfaceC2994c2 = interfaceC2994c6;
                    z17 = z38;
                    interfaceC4351m4 = interfaceC4351m115;
                    interfaceC4351m5 = interfaceC4351m11;
                    function5 = function7;
                    interfaceC40915c2 = interfaceC40915c5;
                    c4656v1 = c4656v2;
                } else {
                    c28655q4.m87138X();
                    z16 = z13;
                    interfaceC4340b2 = interfaceC4340b;
                    c28655q = c28655q4;
                    function5 = function2;
                    function6 = function4;
                    z17 = z14;
                    interfaceC2994c2 = interfaceC2994c1;
                    interfaceC4351m4 = interfaceC4351m3;
                    interfaceC4351m5 = interfaceC4351m2;
                    c4656v1 = c4656v3;
                    interfaceC40915c2 = interfaceC40915c;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i515 = 1;
                    interfaceC4351m6 = new InterfaceC4351m() { // from class: cp0.g0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            Composer composer2 = (Composer) obj;
                            switch (i515) {
                                case 0:
                                    return AbstractC10969j0.m29212z0(bottomSheetState, onDismiss, interfaceC40915c2, interfaceC2994c2, function5, function6, z17, interfaceC4351m4, interfaceC4351m5, z16, c4656v1, interfaceC4340b2, i13, i14, i15, composer2, ((Integer) obj2).intValue());
                                default:
                                    return AbstractC10969j0.m29126L0(bottomSheetState, onDismiss, interfaceC40915c2, interfaceC2994c2, function5, function6, z17, interfaceC4351m4, interfaceC4351m5, z16, c4656v1, interfaceC4340b2, i13, i14, i15, composer2, ((Integer) obj2).intValue());
                            }
                        }
                    };
                    c28677v1 = c28677v1M87180u;
                    c28677v1.f115982d = interfaceC4351m6;
                }
            }
            i16 |= 805306368;
            i35 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i35 != 0) {
                i36 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                if ((i14 & 8) == 0) {
                    zM87157i = c28655q4.m87153g(c4656v3);
                } else {
                    zM87157i = c28655q4.m87157i(c4656v3);
                }
                if (zM87157i) {
                    i37 = 4;
                } else {
                    i37 = 2;
                }
                i36 = i14 | i37;
            } else {
                i36 = i14;
            }
            i38 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            if (i38 != 0) {
                if ((i14 & 48) == 0) {
                    if (c28655q4.m87157i(interfaceC4340b)) {
                        i39 = 32;
                    } else {
                        i39 = 16;
                    }
                    i36 |= i39;
                }
                if ((i16 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (c28655q4.m87135U(i16 & 1, z15)) {
                    c28655q4.m87140Z();
                    i44 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i44 != 0) {
                        if (i48 != 0) {
                            interfaceC40915c3 = null;
                        } else {
                            interfaceC40915c3 = interfaceC40915c;
                        }
                        if ((i15 & 8) != 0) {
                            objM87133R3 = c28655q4.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = AbstractC28683x.m87262p(c28655q4);
                                c28655q4.m87172p0(objM87133R3);
                            }
                            interfaceC2994c3 = (InterfaceC2994c0) objM87133R3;
                            i16 &= -7169;
                        } else {
                            interfaceC2994c3 = interfaceC2994c1;
                        }
                        if (i49 != 0) {
                            function2 = null;
                        }
                        if (i17 != 0) {
                            function4 = null;
                        }
                        if (i19 != 0) {
                            z14 = false;
                        }
                        if (i25 != 0) {
                            objM87133R2 = c28655q4.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C4139w0(7);
                                c28655q4.m87172p0(objM87133R2);
                            }
                            interfaceC4351m7 = (InterfaceC4351m) objM87133R2;
                        } else {
                            interfaceC4351m7 = interfaceC4351m3;
                        }
                        if (i27 != 0) {
                            objM87133R = c28655q4.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C4139w0(8);
                                c28655q4.m87172p0(objM87133R);
                            }
                            interfaceC4351m8 = (InterfaceC4351m) objM87133R;
                        } else {
                            interfaceC4351m8 = interfaceC4351m2;
                        }
                        if (i29 != 0) {
                            z18 = false;
                        } else {
                            z18 = z13;
                        }
                        if (i35 != 0) {
                            c4656v3 = null;
                        }
                        if (i38 != 0) {
                            str = null;
                            C37816b c37816bM121344e6 = AbstractC37817c.m121344e(-633821104, c28655q4, new InterfaceC4340b() { // from class: cp0.i0
                                @Override // c93.InterfaceC4340b
                                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
                                    int iIntValue = ((Integer) obj10).intValue();
                                    return AbstractC10969j0.m29137R(interfaceC40915c3, bottomSheetState, z18, c4656v3, (C32645n0) obj, (InterfaceC4339a) obj2, (InterfaceC4353o) obj3, (Function1) obj4, (Function1) obj5, (InterfaceC4339a) obj6, (String) obj7, (Function3) obj8, (C28655q) ((Composer) obj9), iIntValue);
                                }
                            });
                            c4656v2 = c4656v3;
                            i45 = i16;
                            function7 = function2;
                            function8 = function4;
                            interfaceC2994c4 = interfaceC2994c3;
                            z19 = z14;
                            interfaceC4351m9 = interfaceC4351m7;
                            interfaceC4351m10 = interfaceC4351m8;
                            z24 = z18;
                            interfaceC4340b3 = c37816bM121344e6;
                        } else {
                            str = null;
                            interfaceC4340b3 = interfaceC4340b;
                            c4656v2 = c4656v3;
                            i45 = i16;
                            function7 = function2;
                            function8 = function4;
                            interfaceC2994c4 = interfaceC2994c3;
                            z19 = z14;
                            interfaceC4351m9 = interfaceC4351m7;
                            interfaceC4351m10 = interfaceC4351m8;
                            z24 = z18;
                        }
                    } else {
                        if (i48 != 0) {
                            interfaceC40915c3 = null;
                        } else {
                            interfaceC40915c3 = interfaceC40915c;
                        }
                        if ((i15 & 8) != 0) {
                            objM87133R3 = c28655q4.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = AbstractC28683x.m87262p(c28655q4);
                                c28655q4.m87172p0(objM87133R3);
                            }
                            interfaceC2994c3 = (InterfaceC2994c0) objM87133R3;
                            i16 &= -7169;
                        } else {
                            interfaceC2994c3 = interfaceC2994c1;
                        }
                        if (i49 != 0) {
                            function2 = null;
                        }
                        if (i17 != 0) {
                            function4 = null;
                        }
                        if (i19 != 0) {
                            z14 = false;
                        }
                        if (i25 != 0) {
                            objM87133R2 = c28655q4.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C4139w0(7);
                                c28655q4.m87172p0(objM87133R2);
                            }
                            interfaceC4351m7 = (InterfaceC4351m) objM87133R2;
                        } else {
                            interfaceC4351m7 = interfaceC4351m3;
                        }
                        if (i27 != 0) {
                            objM87133R = c28655q4.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C4139w0(8);
                                c28655q4.m87172p0(objM87133R);
                            }
                            interfaceC4351m8 = (InterfaceC4351m) objM87133R;
                        } else {
                            interfaceC4351m8 = interfaceC4351m2;
                        }
                        if (i29 != 0) {
                            z18 = false;
                        } else {
                            z18 = z13;
                        }
                        if (i35 != 0) {
                            c4656v3 = null;
                        }
                        if (i38 != 0) {
                            str = null;
                            C37816b c37816bM121344e7 = AbstractC37817c.m121344e(-633821104, c28655q4, new InterfaceC4340b() { // from class: cp0.i0
                                @Override // c93.InterfaceC4340b
                                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
                                    int iIntValue = ((Integer) obj10).intValue();
                                    return AbstractC10969j0.m29137R(interfaceC40915c3, bottomSheetState, z18, c4656v3, (C32645n0) obj, (InterfaceC4339a) obj2, (InterfaceC4353o) obj3, (Function1) obj4, (Function1) obj5, (InterfaceC4339a) obj6, (String) obj7, (Function3) obj8, (C28655q) ((Composer) obj9), iIntValue);
                                }
                            });
                            c4656v2 = c4656v3;
                            i45 = i16;
                            function7 = function2;
                            function8 = function4;
                            interfaceC2994c4 = interfaceC2994c3;
                            z19 = z14;
                            interfaceC4351m9 = interfaceC4351m7;
                            interfaceC4351m10 = interfaceC4351m8;
                            z24 = z18;
                            interfaceC4340b3 = c37816bM121344e7;
                        } else {
                            str = null;
                            interfaceC4340b3 = interfaceC4340b;
                            c4656v2 = c4656v3;
                            i45 = i16;
                            function7 = function2;
                            function8 = function4;
                            interfaceC2994c4 = interfaceC2994c3;
                            z19 = z14;
                            interfaceC4351m9 = interfaceC4351m7;
                            interfaceC4351m10 = interfaceC4351m8;
                            z24 = z18;
                        }
                    }
                    c28655q4.m87175r();
                    zM87153g = c28655q4.m87153g(bottomSheetState.getScreenContext());
                    objM87133R4 = c28655q4.m87133R();
                    if (zM87153g) {
                        objM87133R4 = m29172f1(bottomSheetState.getScreenContext());
                        c28655q4.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = m29172f1(bottomSheetState.getScreenContext());
                        c28655q4.m87172p0(objM87133R4);
                    }
                    final C32645n0 c32645n2 = (C32645n0) objM87133R4;
                    FeatureFlagChecker featureFlagChecker3 = (FeatureFlagChecker) c28655q4.m87161k(AbstractC38073e.m121968p());
                    C10978m0.Companion aVar3 = C10978m0.INSTANCE;
                    zM29247c = aVar3.m29247c(bottomSheetState.getScreenContext());
                    zM29246b = aVar3.m29246b(bottomSheetState.getCustomDrawerPresentation(), bottomSheetState.getShouldOpenFullSize(), zM29247c, bottomSheetState.getReadOnlyHalfSheet());
                    final boolean zIsFeatureEnabled4 = featureFlagChecker3.isFeatureEnabled("wce-padding-keyboard-fix");
                    zIsFeatureEnabled = featureFlagChecker3.isFeatureEnabled("context-hub-profile");
                    Set setM74059b3 = AbstractC25260n.m74059b1(new String[]{"CONTEXT_HUB", "CONTEXT_DETAILS"});
                    c13404jM29240h = bottomSheetState.getScreenContext();
                    if (c13404jM29240h != null) {
                        screenId = c13404jM29240h.getScreenId();
                    } else {
                        screenId = str;
                    }
                    zM74155w0 = AbstractC25265s.m74155w0(setM74059b3, screenId);
                    objM87133R5 = c28655q4.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(str);
                        c28655q4.m87172p0(objM87133R5);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                    objM87133R6 = c28655q4.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87272z(str);
                        c28655q4.m87172p0(objM87133R6);
                    }
                    final InterfaceC28601c1 interfaceC28601c113 = (InterfaceC28601c1) objM87133R6;
                    objM87133R7 = c28655q4.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC28683x.m87272z(str);
                        c28655q4.m87172p0(objM87133R7);
                    }
                    final InterfaceC28601c1 interfaceC28601c114 = (InterfaceC28601c1) objM87133R7;
                    objM87133R8 = c28655q4.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = AbstractC28683x.m87272z("");
                        c28655q4.m87172p0(objM87133R8);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R8;
                    final InterfaceC40915c interfaceC40915c6 = interfaceC40915c3;
                    objM87133R9 = c28655q4.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = AbstractC28683x.m87272z(Boolean.TRUE);
                        c28655q4.m87172p0(objM87133R9);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R9;
                    objM87133R10 = c28655q4.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = AbstractC28683x.m87272z(Boolean.TRUE);
                        c28655q4.m87172p0(objM87133R10);
                    }
                    final InterfaceC28601c1 interfaceC28601c115 = (InterfaceC28601c1) objM87133R10;
                    objM87133R11 = c28655q4.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = AbstractC28683x.m87272z(Boolean.TRUE);
                        c28655q4.m87172p0(objM87133R11);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R11;
                    if (zIsFeatureEnabled) {
                        z25 = zM74155w0;
                    } else {
                        z25 = true;
                    }
                    if (m29143U(interfaceC28601c4)) {
                        z26 = false;
                    } else {
                        z26 = false;
                    }
                    if (zIsFeatureEnabled) {
                        z27 = false;
                    } else {
                        z27 = false;
                    }
                    if (m29133P(interfaceC28601c3)) {
                        c28655q4.m87150e0(2094451546);
                        C37816b c37816bM121344e8 = AbstractC37817c.m121344e(36773779, c28655q4, new C0003a0(19, interfaceC28601c2, interfaceC28601c1));
                        c28655q4.m87173q(false);
                        r10 = c37816bM121344e8;
                    } else {
                        c28655q4.m87150e0(2094652488);
                        c28655q4.m87173q(false);
                        r10 = str;
                    }
                    final boolean z5120 = z27;
                    final boolean z5121 = z26;
                    c10962h = new C10962h(r10, AbstractC37817c.m121344e(-582148231, c28655q4, new InterfaceC4351m() { // from class: cp0.b0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC10969j0.m29151Y(z5121, z5120, zIsFeatureEnabled, interfaceC28601c113, interfaceC28601c114, (Composer) obj, iIntValue);
                        }
                    }));
                    c10962hM29242j = bottomSheetState.getToolbarContent();
                    if (c10962hM29242j == null) {
                        c10962h = c10962hM29242j;
                    } else if (zM29247c) {
                        ?? r16 = str;
                        c10962h = new C10962h(r16, r16, 3, r16);
                    }
                    fM29245a = aVar3.m29245a(bottomSheetState.getCustomDrawerPresentation());
                    objM87133R12 = c28655q4.m87133R();
                    if (objM87133R12 == c28676v0) {
                        objM87133R12 = AbstractC28683x.m87272z(bottomSheetState.getInitialSheetState());
                        c28655q4.m87172p0(objM87133R12);
                    }
                    interfaceC28601c5 = (InterfaceC28601c1) objM87133R12;
                    objM87133R13 = c28655q4.m87133R();
                    if (objM87133R13 == c28676v0) {
                        objM87133R13 = AbstractC28683x.m87272z(bottomSheetState.getInitialSheetState());
                        c28655q4.m87172p0(objM87133R13);
                    }
                    interfaceC28601c6 = (InterfaceC28601c1) objM87133R13;
                    objM87133R14 = c28655q4.m87133R();
                    if (objM87133R14 == c28676v0) {
                        objM87133R14 = AbstractC11266d.m30468v(bottomSheetState.getInitialHeightFraction(), c28655q4);
                    }
                    interfaceC28690z0 = (InterfaceC28690z0) objM87133R14;
                    objM87133R15 = c28655q4.m87133R();
                    if (objM87133R15 == c28676v0) {
                        if (bottomSheetState.getInitialSheetState() == EnumC11003u1.Hidden) {
                            f16 = 0.0f;
                        } else {
                            f16 = 1.0f;
                        }
                        objM87133R15 = AbstractC11266d.m30468v(f16, c28655q4);
                    }
                    interfaceC28690z1 = (InterfaceC28690z0) objM87133R15;
                    objM87133R16 = c28655q4.m87133R();
                    if (objM87133R16 == c28676v0) {
                        objM87133R16 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q4.m87172p0(objM87133R16);
                    }
                    interfaceC28601c7 = (InterfaceC28601c1) objM87133R16;
                    objM87133R17 = c28655q4.m87133R();
                    if (objM87133R17 == c28676v0) {
                        objM87133R17 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q4.m87172p0(objM87133R17);
                    }
                    final InterfaceC28601c1 interfaceC28601c116 = (InterfaceC28601c1) objM87133R17;
                    objM87133R18 = c28655q4.m87133R();
                    if (objM87133R18 == c28676v0) {
                        objM87133R18 = AbstractC11266d.m30468v(0.0f, c28655q4);
                    }
                    interfaceC28690z2 = (InterfaceC28690z0) objM87133R18;
                    zM87153g2 = c28655q4.m87153g(interfaceC2994c4);
                    interfaceC2994c5 = interfaceC2994c4;
                    Object objM87133R27 = c28655q4.m87133R();
                    if (zM87153g2) {
                        final int i516 = 0;
                        final int i517 = 1;
                        final int i518 = 2;
                        interfaceC28601c8 = interfaceC28601c1;
                        z28 = zM29246b;
                        f13 = fM29245a;
                        c28676v1 = c28676v0;
                        interfaceC2994c6 = interfaceC2994c5;
                        c28655q2 = c28655q4;
                        z29 = zM29247c;
                        c11011y0 = new C11011y0(interfaceC2994c6, z29, new InterfaceC4339a() { // from class: cp0.c0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                float fM29188n0;
                                switch (i516) {
                                    case 0:
                                        fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z2);
                                        break;
                                    case 1:
                                        fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z2);
                                        break;
                                    default:
                                        fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z2);
                                        break;
                                }
                                return Float.valueOf(fM29188n0);
                            }
                        }, new C10992r(1, interfaceC28601c5), new InterfaceC4339a() { // from class: cp0.c0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                float fM29188n0;
                                switch (i517) {
                                    case 0:
                                        fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z1);
                                        break;
                                    case 1:
                                        fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z1);
                                        break;
                                    default:
                                        fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z1);
                                        break;
                                }
                                return Float.valueOf(fM29188n0);
                            }
                        }, new InterfaceC4339a() { // from class: cp0.c0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                float fM29188n0;
                                switch (i518) {
                                    case 0:
                                        fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z0);
                                        break;
                                    case 1:
                                        fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z0);
                                        break;
                                    default:
                                        fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z0);
                                        break;
                                }
                                return Float.valueOf(fM29188n0);
                            }
                        }, new C10975l0(interfaceC28690z1, 3), new C10975l0(interfaceC28690z0, 4), new C10972k0(7, interfaceC28601c5), new C10972k0(11, interfaceC28601c7), onDismiss);
                        c28655q2.m87172p0(c11011y0);
                    } else {
                        final int i519 = 0;
                        final int i5110 = 1;
                        final int i5111 = 2;
                        interfaceC28601c8 = interfaceC28601c1;
                        z28 = zM29246b;
                        f13 = fM29245a;
                        c28676v1 = c28676v0;
                        interfaceC2994c6 = interfaceC2994c5;
                        c28655q2 = c28655q4;
                        z29 = zM29247c;
                        c11011y0 = new C11011y0(interfaceC2994c6, z29, new InterfaceC4339a() { // from class: cp0.c0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                float fM29188n0;
                                switch (i519) {
                                    case 0:
                                        fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z2);
                                        break;
                                    case 1:
                                        fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z2);
                                        break;
                                    default:
                                        fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z2);
                                        break;
                                }
                                return Float.valueOf(fM29188n0);
                            }
                        }, new C10992r(1, interfaceC28601c5), new InterfaceC4339a() { // from class: cp0.c0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                float fM29188n0;
                                switch (i5110) {
                                    case 0:
                                        fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z1);
                                        break;
                                    case 1:
                                        fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z1);
                                        break;
                                    default:
                                        fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z1);
                                        break;
                                }
                                return Float.valueOf(fM29188n0);
                            }
                        }, new InterfaceC4339a() { // from class: cp0.c0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                float fM29188n0;
                                switch (i5111) {
                                    case 0:
                                        fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z0);
                                        break;
                                    case 1:
                                        fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z0);
                                        break;
                                    default:
                                        fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z0);
                                        break;
                                }
                                return Float.valueOf(fM29188n0);
                            }
                        }, new C10975l0(interfaceC28690z1, 3), new C10975l0(interfaceC28690z0, 4), new C10972k0(7, interfaceC28601c5), new C10972k0(11, interfaceC28601c7), onDismiss);
                        c28655q2.m87172p0(c11011y0);
                    }
                    final C11011y0 c11011y3 = (C11011y0) c11011y0;
                    c13404jM29240h2 = bottomSheetState.getScreenContext();
                    if (c13404jM29240h2 != null) {
                        source = "";
                    } else {
                        source = "";
                    }
                    EnumC11003u1 enumC11003u1M29159b2 = m29159b0(interfaceC28601c5);
                    if ((i45 & 234881024) == 67108864) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    boolean zM87153g6 = z34 | c28655q2.m87153g(source);
                    if ((i45 & 3670016) == 1048576) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    boolean z523 = zM87153g6 | z35;
                    if ((i45 & 29360128) == 8388608) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    z37 = z523 | z36;
                    objM87133R19 = c28655q2.m87133R();
                    if (z37) {
                        boolean z524 = z19;
                        InterfaceC4351m interfaceC4351m116 = interfaceC4351m9;
                        InterfaceC4351m interfaceC4351m117 = interfaceC4351m10;
                        objM87133R19 = new a(interfaceC4351m117, source, z524, interfaceC4351m116, interfaceC28601c6, interfaceC28601c5, null);
                        interfaceC4351m11 = interfaceC4351m117;
                        interfaceC4351m12 = interfaceC4351m116;
                        z38 = z524;
                        c28655q2.m87172p0(objM87133R19);
                    } else {
                        boolean z525 = z19;
                        InterfaceC4351m interfaceC4351m118 = interfaceC4351m9;
                        InterfaceC4351m interfaceC4351m119 = interfaceC4351m10;
                        objM87133R19 = new a(interfaceC4351m119, source, z525, interfaceC4351m118, interfaceC28601c6, interfaceC28601c5, null);
                        interfaceC4351m11 = interfaceC4351m119;
                        interfaceC4351m12 = interfaceC4351m118;
                        z38 = z525;
                        c28655q2.m87172p0(objM87133R19);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R19, enumC11003u1M29159b2);
                    float fM29171f2 = m29171f0(interfaceC28690z0);
                    if (m29180j0(interfaceC28601c7)) {
                        c11347e2M30574v = AbstractC11348f.m30574v(0, 0, null, 6);
                    } else {
                        c11347e2M30574v = AbstractC11348f.m30574v(300, 0, null, 6);
                    }
                    c28655q3 = c28655q2;
                    final InterfaceC28670t2 interfaceC28670t2M30588b4 = AbstractC11352g.m30588b(fM29171f2, c11347e2M30574v, "bottomSheetHeight", null, c28655q3, 3072, 20);
                    interfaceC39171c = (InterfaceC39171c) c28655q3.m87161k(AbstractC2453v1.f9569h);
                    if (bottomSheetState.getImeHeightPx() > 0) {
                        z39 = true;
                    } else {
                        z39 = false;
                    }
                    float fM29176h2 = m29176h0(interfaceC28690z1);
                    if (m29180j0(interfaceC28601c7)) {
                        c11347e2M30574v2 = AbstractC11348f.m30574v(0, 0, null, 6);
                    } else {
                        c11347e2M30574v2 = AbstractC11348f.m30574v(300, 0, null, 6);
                    }
                    interfaceC28670t2M30588b = AbstractC11352g.m30588b(fM29176h2, c11347e2M30574v2, "heroProgress", null, c28655q3, 3072, 20);
                    Float fValueOf9 = Float.valueOf(m29208x0(interfaceC28670t2M30588b));
                    if ((i45 & 57344) == 16384) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    zM87153g3 = z44 | c28655q3.m87153g(interfaceC28670t2M30588b);
                    objM87133R20 = c28655q3.m87133R();
                    if (zM87153g3) {
                        objM87133R20 = new b(function7, interfaceC28670t2M30588b, null);
                        c28655q3.m87172p0(objM87133R20);
                    } else {
                        objM87133R20 = new b(function7, interfaceC28670t2M30588b, null);
                        c28655q3.m87172p0(objM87133R20);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R20, fValueOf9);
                    Boolean boolValueOf9 = Boolean.valueOf(bottomSheetState.getVisible());
                    i46 = i45 & 14;
                    if (i46 != 4) {
                        if ((i45 & 8) != 0) {
                            c10978m0 = bottomSheetState;
                            if (c28655q3.m87157i(c10978m0)) {
                            }
                            boolean zM87155h14 = z45 | c28655q3.m87155h(z28);
                            z46 = z28;
                            f14 = f13;
                            zM87147d = zM87155h14 | c28655q3.m87147d(f14);
                            objM87133R21 = c28655q3.m87133R();
                            if (zM87147d) {
                                objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                                f15 = f14;
                                c28655q3.m87172p0(objM87133R21);
                            } else {
                                objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                                f15 = f14;
                                c28655q3.m87172p0(objM87133R21);
                            }
                            AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R21, boolValueOf9);
                            Float fValueOf10 = Float.valueOf(f15);
                            if (i46 != 4) {
                                z47 = true;
                            } else {
                                z47 = true;
                            }
                            zM87147d2 = z47 | c28655q3.m87147d(f15);
                            objM87133R22 = c28655q3.m87133R();
                            if (zM87147d2) {
                                objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                                c28655q3.m87172p0(objM87133R22);
                            } else {
                                objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                                c28655q3.m87172p0(objM87133R22);
                            }
                            AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R22, fValueOf10);
                            Boolean boolValueOf10 = Boolean.valueOf(z39);
                            boolean zM87155h15 = c28655q3.m87155h(z39);
                            if (i46 != 4) {
                                z48 = true;
                            } else {
                                z48 = true;
                            }
                            z49 = zM87155h15 | z48;
                            objM87133R23 = c28655q3.m87133R();
                            if (z49) {
                                objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                                c28655q3.m87172p0(objM87133R23);
                            } else {
                                objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                                c28655q3.m87172p0(objM87133R23);
                            }
                            AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R23, boolValueOf10);
                            boolean zM29243k7 = bottomSheetState.getVisible();
                            zM87155h = c28655q3.m87155h(z29) | c28655q3.m87147d(f15) | c28655q3.m87157i(interfaceC2994c6) | ((i45 & 112) == 32);
                            objM87133R24 = c28655q3.m87133R();
                            if (zM87155h) {
                                final InterfaceC2994c0 interfaceC2994c19 = interfaceC2994c6;
                                final boolean z51112 = z29;
                                final float f118 = f15;
                                objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC10969j0.m29210y0(z51112, f118, interfaceC2994c19, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                                    }
                                };
                                c28655q3.m87172p0(objM87133R24);
                            } else {
                                final InterfaceC2994c0 interfaceC2994c110 = interfaceC2994c6;
                                final boolean z51113 = z29;
                                final float f119 = f15;
                                objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC10969j0.m29210y0(z51113, f119, interfaceC2994c110, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                                    }
                                };
                                c28655q3.m87172p0(objM87133R24);
                            }
                            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R24, zM29243k7, c28655q3, 0, 0);
                            if (bottomSheetState.getVisible()) {
                            }
                            InterfaceC4351m interfaceC4351m1110 = interfaceC4351m12;
                            final boolean z51114 = z24;
                            final InterfaceC4340b interfaceC4340b11 = interfaceC4340b3;
                            C28673u1[] c28673u1Arr7 = {f34074a.mo86977a(Boolean.valueOf(bottomSheetState.getVisible())), f34075b.mo86977a(m29159b0(interfaceC28601c5)), f34076c.mo86977a(c11011y3)};
                            final Function3 function17 = function8;
                            final C10962h c10962h8 = c10962h;
                            final InterfaceC28601c1 interfaceC28601c117 = interfaceC28601c8;
                            final InterfaceC39171c interfaceC39171c9 = interfaceC39171c2;
                            final boolean z51115 = z29;
                            AbstractC28683x.m87248b(c28673u1Arr7, AbstractC37817c.m121344e(1438636126, c28655q3, new InterfaceC4351m() { // from class: cp0.h0
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC10969j0.m29104A0(interfaceC39171c9, zIsFeatureEnabled4, bottomSheetState, c32645n2, z51115, c10962h8, c11011y3, z51114, onDismiss, function17, interfaceC4340b11, interfaceC28690z2, interfaceC28670t2M30588b, interfaceC28670t2M30588b4, interfaceC28601c5, interfaceC28601c7, interfaceC28601c116, interfaceC28601c2, interfaceC28601c117, interfaceC28601c113, interfaceC28601c114, interfaceC28601c3, interfaceC28601c115, interfaceC28601c4, (Composer) obj, iIntValue);
                                }
                            }), c28655q3, 56);
                            c28655q = c28655q3;
                            z16 = z51114;
                            interfaceC4340b2 = interfaceC4340b11;
                            function6 = function17;
                            interfaceC2994c2 = interfaceC2994c6;
                            z17 = z38;
                            interfaceC4351m4 = interfaceC4351m1110;
                            interfaceC4351m5 = interfaceC4351m11;
                            function5 = function7;
                            interfaceC40915c2 = interfaceC40915c6;
                            c4656v1 = c4656v2;
                        } else {
                            c10978m0 = bottomSheetState;
                        }
                        interfaceC39171c2 = interfaceC39171c;
                        z45 = false;
                        boolean zM87155h16 = z45 | c28655q3.m87155h(z28);
                        z46 = z28;
                        f14 = f13;
                        zM87147d = zM87155h16 | c28655q3.m87147d(f14);
                        objM87133R21 = c28655q3.m87133R();
                        if (zM87147d) {
                            objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                            f15 = f14;
                            c28655q3.m87172p0(objM87133R21);
                        } else {
                            objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                            f15 = f14;
                            c28655q3.m87172p0(objM87133R21);
                        }
                        AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R21, boolValueOf9);
                        Float fValueOf11 = Float.valueOf(f15);
                        if (i46 != 4) {
                            z47 = true;
                        } else {
                            z47 = true;
                        }
                        zM87147d2 = z47 | c28655q3.m87147d(f15);
                        objM87133R22 = c28655q3.m87133R();
                        if (zM87147d2) {
                            objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                            c28655q3.m87172p0(objM87133R22);
                        } else {
                            objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                            c28655q3.m87172p0(objM87133R22);
                        }
                        AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R22, fValueOf11);
                        Boolean boolValueOf11 = Boolean.valueOf(z39);
                        boolean zM87155h17 = c28655q3.m87155h(z39);
                        if (i46 != 4) {
                            z48 = true;
                        } else {
                            z48 = true;
                        }
                        z49 = zM87155h17 | z48;
                        objM87133R23 = c28655q3.m87133R();
                        if (z49) {
                            objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                            c28655q3.m87172p0(objM87133R23);
                        } else {
                            objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                            c28655q3.m87172p0(objM87133R23);
                        }
                        AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R23, boolValueOf11);
                        boolean zM29243k8 = bottomSheetState.getVisible();
                        zM87155h = c28655q3.m87155h(z29) | c28655q3.m87147d(f15) | c28655q3.m87157i(interfaceC2994c6) | ((i45 & 112) == 32);
                        objM87133R24 = c28655q3.m87133R();
                        if (zM87155h) {
                            final InterfaceC2994c0 interfaceC2994c111 = interfaceC2994c6;
                            final boolean z51116 = z29;
                            final float f1110 = f15;
                            objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC10969j0.m29210y0(z51116, f1110, interfaceC2994c111, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                                }
                            };
                            c28655q3.m87172p0(objM87133R24);
                        } else {
                            final InterfaceC2994c0 interfaceC2994c112 = interfaceC2994c6;
                            final boolean z51117 = z29;
                            final float f1111 = f15;
                            objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC10969j0.m29210y0(z51117, f1111, interfaceC2994c112, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                                }
                            };
                            c28655q3.m87172p0(objM87133R24);
                        }
                        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R24, zM29243k8, c28655q3, 0, 0);
                        if (bottomSheetState.getVisible()) {
                        }
                        InterfaceC4351m interfaceC4351m1111 = interfaceC4351m12;
                        final boolean z51118 = z24;
                        final InterfaceC4340b interfaceC4340b12 = interfaceC4340b3;
                        C28673u1[] c28673u1Arr8 = {f34074a.mo86977a(Boolean.valueOf(bottomSheetState.getVisible())), f34075b.mo86977a(m29159b0(interfaceC28601c5)), f34076c.mo86977a(c11011y3)};
                        final Function3 function18 = function8;
                        final C10962h c10962h9 = c10962h;
                        final InterfaceC28601c1 interfaceC28601c118 = interfaceC28601c8;
                        final InterfaceC39171c interfaceC39171c10 = interfaceC39171c2;
                        final boolean z51119 = z29;
                        AbstractC28683x.m87248b(c28673u1Arr8, AbstractC37817c.m121344e(1438636126, c28655q3, new InterfaceC4351m() { // from class: cp0.h0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC10969j0.m29104A0(interfaceC39171c10, zIsFeatureEnabled4, bottomSheetState, c32645n2, z51119, c10962h9, c11011y3, z51118, onDismiss, function18, interfaceC4340b12, interfaceC28690z2, interfaceC28670t2M30588b, interfaceC28670t2M30588b4, interfaceC28601c5, interfaceC28601c7, interfaceC28601c116, interfaceC28601c2, interfaceC28601c118, interfaceC28601c113, interfaceC28601c114, interfaceC28601c3, interfaceC28601c115, interfaceC28601c4, (Composer) obj, iIntValue);
                            }
                        }), c28655q3, 56);
                        c28655q = c28655q3;
                        z16 = z51118;
                        interfaceC4340b2 = interfaceC4340b12;
                        function6 = function18;
                        interfaceC2994c2 = interfaceC2994c6;
                        z17 = z38;
                        interfaceC4351m4 = interfaceC4351m1111;
                        interfaceC4351m5 = interfaceC4351m11;
                        function5 = function7;
                        interfaceC40915c2 = interfaceC40915c6;
                        c4656v1 = c4656v2;
                    } else {
                        c10978m0 = bottomSheetState;
                    }
                    interfaceC39171c2 = interfaceC39171c;
                    z45 = true;
                    boolean zM87155h18 = z45 | c28655q3.m87155h(z28);
                    z46 = z28;
                    f14 = f13;
                    zM87147d = zM87155h18 | c28655q3.m87147d(f14);
                    objM87133R21 = c28655q3.m87133R();
                    if (zM87147d) {
                        objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                        f15 = f14;
                        c28655q3.m87172p0(objM87133R21);
                    } else {
                        objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                        f15 = f14;
                        c28655q3.m87172p0(objM87133R21);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R21, boolValueOf9);
                    Float fValueOf12 = Float.valueOf(f15);
                    if (i46 != 4) {
                        z47 = true;
                    } else {
                        z47 = true;
                    }
                    zM87147d2 = z47 | c28655q3.m87147d(f15);
                    objM87133R22 = c28655q3.m87133R();
                    if (zM87147d2) {
                        objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                        c28655q3.m87172p0(objM87133R22);
                    } else {
                        objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                        c28655q3.m87172p0(objM87133R22);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R22, fValueOf12);
                    Boolean boolValueOf12 = Boolean.valueOf(z39);
                    boolean zM87155h19 = c28655q3.m87155h(z39);
                    if (i46 != 4) {
                        z48 = true;
                    } else {
                        z48 = true;
                    }
                    z49 = zM87155h19 | z48;
                    objM87133R23 = c28655q3.m87133R();
                    if (z49) {
                        objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                        c28655q3.m87172p0(objM87133R23);
                    } else {
                        objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                        c28655q3.m87172p0(objM87133R23);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R23, boolValueOf12);
                    boolean zM29243k9 = bottomSheetState.getVisible();
                    zM87155h = c28655q3.m87155h(z29) | c28655q3.m87147d(f15) | c28655q3.m87157i(interfaceC2994c6) | ((i45 & 112) == 32);
                    objM87133R24 = c28655q3.m87133R();
                    if (zM87155h) {
                        final InterfaceC2994c0 interfaceC2994c113 = interfaceC2994c6;
                        final boolean z511110 = z29;
                        final float f1112 = f15;
                        objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC10969j0.m29210y0(z511110, f1112, interfaceC2994c113, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                            }
                        };
                        c28655q3.m87172p0(objM87133R24);
                    } else {
                        final InterfaceC2994c0 interfaceC2994c114 = interfaceC2994c6;
                        final boolean z511111 = z29;
                        final float f1113 = f15;
                        objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC10969j0.m29210y0(z511111, f1113, interfaceC2994c114, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                            }
                        };
                        c28655q3.m87172p0(objM87133R24);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R24, zM29243k9, c28655q3, 0, 0);
                    if (bottomSheetState.getVisible()) {
                    }
                    InterfaceC4351m interfaceC4351m1112 = interfaceC4351m12;
                    final boolean z511112 = z24;
                    final InterfaceC4340b interfaceC4340b13 = interfaceC4340b3;
                    C28673u1[] c28673u1Arr9 = {f34074a.mo86977a(Boolean.valueOf(bottomSheetState.getVisible())), f34075b.mo86977a(m29159b0(interfaceC28601c5)), f34076c.mo86977a(c11011y3)};
                    final Function3 function19 = function8;
                    final C10962h c10962h10 = c10962h;
                    final InterfaceC28601c1 interfaceC28601c119 = interfaceC28601c8;
                    final InterfaceC39171c interfaceC39171c11 = interfaceC39171c2;
                    final boolean z511113 = z29;
                    AbstractC28683x.m87248b(c28673u1Arr9, AbstractC37817c.m121344e(1438636126, c28655q3, new InterfaceC4351m() { // from class: cp0.h0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC10969j0.m29104A0(interfaceC39171c11, zIsFeatureEnabled4, bottomSheetState, c32645n2, z511113, c10962h10, c11011y3, z511112, onDismiss, function19, interfaceC4340b13, interfaceC28690z2, interfaceC28670t2M30588b, interfaceC28670t2M30588b4, interfaceC28601c5, interfaceC28601c7, interfaceC28601c116, interfaceC28601c2, interfaceC28601c119, interfaceC28601c113, interfaceC28601c114, interfaceC28601c3, interfaceC28601c115, interfaceC28601c4, (Composer) obj, iIntValue);
                        }
                    }), c28655q3, 56);
                    c28655q = c28655q3;
                    z16 = z511112;
                    interfaceC4340b2 = interfaceC4340b13;
                    function6 = function19;
                    interfaceC2994c2 = interfaceC2994c6;
                    z17 = z38;
                    interfaceC4351m4 = interfaceC4351m1112;
                    interfaceC4351m5 = interfaceC4351m11;
                    function5 = function7;
                    interfaceC40915c2 = interfaceC40915c6;
                    c4656v1 = c4656v2;
                } else {
                    c28655q4.m87138X();
                    z16 = z13;
                    interfaceC4340b2 = interfaceC4340b;
                    c28655q = c28655q4;
                    function5 = function2;
                    function6 = function4;
                    z17 = z14;
                    interfaceC2994c2 = interfaceC2994c1;
                    interfaceC4351m4 = interfaceC4351m3;
                    interfaceC4351m5 = interfaceC4351m2;
                    c4656v1 = c4656v3;
                    interfaceC40915c2 = interfaceC40915c;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i5112 = 1;
                    interfaceC4351m6 = new InterfaceC4351m() { // from class: cp0.g0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            Composer composer2 = (Composer) obj;
                            switch (i5112) {
                                case 0:
                                    return AbstractC10969j0.m29212z0(bottomSheetState, onDismiss, interfaceC40915c2, interfaceC2994c2, function5, function6, z17, interfaceC4351m4, interfaceC4351m5, z16, c4656v1, interfaceC4340b2, i13, i14, i15, composer2, ((Integer) obj2).intValue());
                                default:
                                    return AbstractC10969j0.m29126L0(bottomSheetState, onDismiss, interfaceC40915c2, interfaceC2994c2, function5, function6, z17, interfaceC4351m4, interfaceC4351m5, z16, c4656v1, interfaceC4340b2, i13, i14, i15, composer2, ((Integer) obj2).intValue());
                            }
                        }
                    };
                    c28677v1 = c28677v1M87180u;
                    c28677v1.f115982d = interfaceC4351m6;
                }
            }
            i36 |= 48;
            if ((i16 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (c28655q4.m87135U(i16 & 1, z15)) {
                c28655q4.m87140Z();
                i44 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i44 != 0) {
                    if (i48 != 0) {
                        interfaceC40915c3 = null;
                    } else {
                        interfaceC40915c3 = interfaceC40915c;
                    }
                    if ((i15 & 8) != 0) {
                        objM87133R3 = c28655q4.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87262p(c28655q4);
                            c28655q4.m87172p0(objM87133R3);
                        }
                        interfaceC2994c3 = (InterfaceC2994c0) objM87133R3;
                        i16 &= -7169;
                    } else {
                        interfaceC2994c3 = interfaceC2994c1;
                    }
                    if (i49 != 0) {
                        function2 = null;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    }
                    if (i19 != 0) {
                        z14 = false;
                    }
                    if (i25 != 0) {
                        objM87133R2 = c28655q4.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C4139w0(7);
                            c28655q4.m87172p0(objM87133R2);
                        }
                        interfaceC4351m7 = (InterfaceC4351m) objM87133R2;
                    } else {
                        interfaceC4351m7 = interfaceC4351m3;
                    }
                    if (i27 != 0) {
                        objM87133R = c28655q4.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C4139w0(8);
                            c28655q4.m87172p0(objM87133R);
                        }
                        interfaceC4351m8 = (InterfaceC4351m) objM87133R;
                    } else {
                        interfaceC4351m8 = interfaceC4351m2;
                    }
                    if (i29 != 0) {
                        z18 = false;
                    } else {
                        z18 = z13;
                    }
                    if (i35 != 0) {
                        c4656v3 = null;
                    }
                    if (i38 != 0) {
                        str = null;
                        C37816b c37816bM121344e9 = AbstractC37817c.m121344e(-633821104, c28655q4, new InterfaceC4340b() { // from class: cp0.i0
                            @Override // c93.InterfaceC4340b
                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
                                int iIntValue = ((Integer) obj10).intValue();
                                return AbstractC10969j0.m29137R(interfaceC40915c3, bottomSheetState, z18, c4656v3, (C32645n0) obj, (InterfaceC4339a) obj2, (InterfaceC4353o) obj3, (Function1) obj4, (Function1) obj5, (InterfaceC4339a) obj6, (String) obj7, (Function3) obj8, (C28655q) ((Composer) obj9), iIntValue);
                            }
                        });
                        c4656v2 = c4656v3;
                        i45 = i16;
                        function7 = function2;
                        function8 = function4;
                        interfaceC2994c4 = interfaceC2994c3;
                        z19 = z14;
                        interfaceC4351m9 = interfaceC4351m7;
                        interfaceC4351m10 = interfaceC4351m8;
                        z24 = z18;
                        interfaceC4340b3 = c37816bM121344e9;
                    } else {
                        str = null;
                        interfaceC4340b3 = interfaceC4340b;
                        c4656v2 = c4656v3;
                        i45 = i16;
                        function7 = function2;
                        function8 = function4;
                        interfaceC2994c4 = interfaceC2994c3;
                        z19 = z14;
                        interfaceC4351m9 = interfaceC4351m7;
                        interfaceC4351m10 = interfaceC4351m8;
                        z24 = z18;
                    }
                } else {
                    if (i48 != 0) {
                        interfaceC40915c3 = null;
                    } else {
                        interfaceC40915c3 = interfaceC40915c;
                    }
                    if ((i15 & 8) != 0) {
                        objM87133R3 = c28655q4.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87262p(c28655q4);
                            c28655q4.m87172p0(objM87133R3);
                        }
                        interfaceC2994c3 = (InterfaceC2994c0) objM87133R3;
                        i16 &= -7169;
                    } else {
                        interfaceC2994c3 = interfaceC2994c1;
                    }
                    if (i49 != 0) {
                        function2 = null;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    }
                    if (i19 != 0) {
                        z14 = false;
                    }
                    if (i25 != 0) {
                        objM87133R2 = c28655q4.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C4139w0(7);
                            c28655q4.m87172p0(objM87133R2);
                        }
                        interfaceC4351m7 = (InterfaceC4351m) objM87133R2;
                    } else {
                        interfaceC4351m7 = interfaceC4351m3;
                    }
                    if (i27 != 0) {
                        objM87133R = c28655q4.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C4139w0(8);
                            c28655q4.m87172p0(objM87133R);
                        }
                        interfaceC4351m8 = (InterfaceC4351m) objM87133R;
                    } else {
                        interfaceC4351m8 = interfaceC4351m2;
                    }
                    if (i29 != 0) {
                        z18 = false;
                    } else {
                        z18 = z13;
                    }
                    if (i35 != 0) {
                        c4656v3 = null;
                    }
                    if (i38 != 0) {
                        str = null;
                        C37816b c37816bM121344e10 = AbstractC37817c.m121344e(-633821104, c28655q4, new InterfaceC4340b() { // from class: cp0.i0
                            @Override // c93.InterfaceC4340b
                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
                                int iIntValue = ((Integer) obj10).intValue();
                                return AbstractC10969j0.m29137R(interfaceC40915c3, bottomSheetState, z18, c4656v3, (C32645n0) obj, (InterfaceC4339a) obj2, (InterfaceC4353o) obj3, (Function1) obj4, (Function1) obj5, (InterfaceC4339a) obj6, (String) obj7, (Function3) obj8, (C28655q) ((Composer) obj9), iIntValue);
                            }
                        });
                        c4656v2 = c4656v3;
                        i45 = i16;
                        function7 = function2;
                        function8 = function4;
                        interfaceC2994c4 = interfaceC2994c3;
                        z19 = z14;
                        interfaceC4351m9 = interfaceC4351m7;
                        interfaceC4351m10 = interfaceC4351m8;
                        z24 = z18;
                        interfaceC4340b3 = c37816bM121344e10;
                    } else {
                        str = null;
                        interfaceC4340b3 = interfaceC4340b;
                        c4656v2 = c4656v3;
                        i45 = i16;
                        function7 = function2;
                        function8 = function4;
                        interfaceC2994c4 = interfaceC2994c3;
                        z19 = z14;
                        interfaceC4351m9 = interfaceC4351m7;
                        interfaceC4351m10 = interfaceC4351m8;
                        z24 = z18;
                    }
                }
                c28655q4.m87175r();
                zM87153g = c28655q4.m87153g(bottomSheetState.getScreenContext());
                objM87133R4 = c28655q4.m87133R();
                if (zM87153g) {
                    objM87133R4 = m29172f1(bottomSheetState.getScreenContext());
                    c28655q4.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = m29172f1(bottomSheetState.getScreenContext());
                    c28655q4.m87172p0(objM87133R4);
                }
                final C32645n0 c32645n3 = (C32645n0) objM87133R4;
                FeatureFlagChecker featureFlagChecker4 = (FeatureFlagChecker) c28655q4.m87161k(AbstractC38073e.m121968p());
                C10978m0.Companion aVar4 = C10978m0.INSTANCE;
                zM29247c = aVar4.m29247c(bottomSheetState.getScreenContext());
                zM29246b = aVar4.m29246b(bottomSheetState.getCustomDrawerPresentation(), bottomSheetState.getShouldOpenFullSize(), zM29247c, bottomSheetState.getReadOnlyHalfSheet());
                final boolean zIsFeatureEnabled5 = featureFlagChecker4.isFeatureEnabled("wce-padding-keyboard-fix");
                zIsFeatureEnabled = featureFlagChecker4.isFeatureEnabled("context-hub-profile");
                Set setM74059b4 = AbstractC25260n.m74059b1(new String[]{"CONTEXT_HUB", "CONTEXT_DETAILS"});
                c13404jM29240h = bottomSheetState.getScreenContext();
                if (c13404jM29240h != null) {
                    screenId = c13404jM29240h.getScreenId();
                } else {
                    screenId = str;
                }
                zM74155w0 = AbstractC25265s.m74155w0(setM74059b4, screenId);
                objM87133R5 = c28655q4.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(str);
                    c28655q4.m87172p0(objM87133R5);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                objM87133R6 = c28655q4.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC28683x.m87272z(str);
                    c28655q4.m87172p0(objM87133R6);
                }
                final InterfaceC28601c1 interfaceC28601c1110 = (InterfaceC28601c1) objM87133R6;
                objM87133R7 = c28655q4.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC28683x.m87272z(str);
                    c28655q4.m87172p0(objM87133R7);
                }
                final InterfaceC28601c1 interfaceC28601c1111 = (InterfaceC28601c1) objM87133R7;
                objM87133R8 = c28655q4.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = AbstractC28683x.m87272z("");
                    c28655q4.m87172p0(objM87133R8);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R8;
                final InterfaceC40915c interfaceC40915c7 = interfaceC40915c3;
                objM87133R9 = c28655q4.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = AbstractC28683x.m87272z(Boolean.TRUE);
                    c28655q4.m87172p0(objM87133R9);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R9;
                objM87133R10 = c28655q4.m87133R();
                if (objM87133R10 == c28676v0) {
                    objM87133R10 = AbstractC28683x.m87272z(Boolean.TRUE);
                    c28655q4.m87172p0(objM87133R10);
                }
                final InterfaceC28601c1 interfaceC28601c1112 = (InterfaceC28601c1) objM87133R10;
                objM87133R11 = c28655q4.m87133R();
                if (objM87133R11 == c28676v0) {
                    objM87133R11 = AbstractC28683x.m87272z(Boolean.TRUE);
                    c28655q4.m87172p0(objM87133R11);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R11;
                if (zIsFeatureEnabled) {
                    z25 = zM74155w0;
                } else {
                    z25 = true;
                }
                if (m29143U(interfaceC28601c4)) {
                    z26 = false;
                } else {
                    z26 = false;
                }
                if (zIsFeatureEnabled) {
                    z27 = false;
                } else {
                    z27 = false;
                }
                if (m29133P(interfaceC28601c3)) {
                    c28655q4.m87150e0(2094451546);
                    C37816b c37816bM121344e11 = AbstractC37817c.m121344e(36773779, c28655q4, new C0003a0(19, interfaceC28601c2, interfaceC28601c1));
                    c28655q4.m87173q(false);
                    r10 = c37816bM121344e11;
                } else {
                    c28655q4.m87150e0(2094652488);
                    c28655q4.m87173q(false);
                    r10 = str;
                }
                final boolean z5122 = z27;
                final boolean z5123 = z26;
                c10962h = new C10962h(r10, AbstractC37817c.m121344e(-582148231, c28655q4, new InterfaceC4351m() { // from class: cp0.b0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC10969j0.m29151Y(z5123, z5122, zIsFeatureEnabled, interfaceC28601c1110, interfaceC28601c1111, (Composer) obj, iIntValue);
                    }
                }));
                c10962hM29242j = bottomSheetState.getToolbarContent();
                if (c10962hM29242j == null) {
                    c10962h = c10962hM29242j;
                } else if (zM29247c) {
                    ?? r17 = str;
                    c10962h = new C10962h(r17, r17, 3, r17);
                }
                fM29245a = aVar4.m29245a(bottomSheetState.getCustomDrawerPresentation());
                objM87133R12 = c28655q4.m87133R();
                if (objM87133R12 == c28676v0) {
                    objM87133R12 = AbstractC28683x.m87272z(bottomSheetState.getInitialSheetState());
                    c28655q4.m87172p0(objM87133R12);
                }
                interfaceC28601c5 = (InterfaceC28601c1) objM87133R12;
                objM87133R13 = c28655q4.m87133R();
                if (objM87133R13 == c28676v0) {
                    objM87133R13 = AbstractC28683x.m87272z(bottomSheetState.getInitialSheetState());
                    c28655q4.m87172p0(objM87133R13);
                }
                interfaceC28601c6 = (InterfaceC28601c1) objM87133R13;
                objM87133R14 = c28655q4.m87133R();
                if (objM87133R14 == c28676v0) {
                    objM87133R14 = AbstractC11266d.m30468v(bottomSheetState.getInitialHeightFraction(), c28655q4);
                }
                interfaceC28690z0 = (InterfaceC28690z0) objM87133R14;
                objM87133R15 = c28655q4.m87133R();
                if (objM87133R15 == c28676v0) {
                    if (bottomSheetState.getInitialSheetState() == EnumC11003u1.Hidden) {
                        f16 = 0.0f;
                    } else {
                        f16 = 1.0f;
                    }
                    objM87133R15 = AbstractC11266d.m30468v(f16, c28655q4);
                }
                interfaceC28690z1 = (InterfaceC28690z0) objM87133R15;
                objM87133R16 = c28655q4.m87133R();
                if (objM87133R16 == c28676v0) {
                    objM87133R16 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q4.m87172p0(objM87133R16);
                }
                interfaceC28601c7 = (InterfaceC28601c1) objM87133R16;
                objM87133R17 = c28655q4.m87133R();
                if (objM87133R17 == c28676v0) {
                    objM87133R17 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q4.m87172p0(objM87133R17);
                }
                final InterfaceC28601c1 interfaceC28601c1113 = (InterfaceC28601c1) objM87133R17;
                objM87133R18 = c28655q4.m87133R();
                if (objM87133R18 == c28676v0) {
                    objM87133R18 = AbstractC11266d.m30468v(0.0f, c28655q4);
                }
                interfaceC28690z2 = (InterfaceC28690z0) objM87133R18;
                zM87153g2 = c28655q4.m87153g(interfaceC2994c4);
                interfaceC2994c5 = interfaceC2994c4;
                Object objM87133R28 = c28655q4.m87133R();
                if (zM87153g2) {
                    final int i5113 = 0;
                    final int i5114 = 1;
                    final int i5115 = 2;
                    interfaceC28601c8 = interfaceC28601c1;
                    z28 = zM29246b;
                    f13 = fM29245a;
                    c28676v1 = c28676v0;
                    interfaceC2994c6 = interfaceC2994c5;
                    c28655q2 = c28655q4;
                    z29 = zM29247c;
                    c11011y0 = new C11011y0(interfaceC2994c6, z29, new InterfaceC4339a() { // from class: cp0.c0
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            float fM29188n0;
                            switch (i5113) {
                                case 0:
                                    fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z2);
                                    break;
                                case 1:
                                    fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z2);
                                    break;
                                default:
                                    fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z2);
                                    break;
                            }
                            return Float.valueOf(fM29188n0);
                        }
                    }, new C10992r(1, interfaceC28601c5), new InterfaceC4339a() { // from class: cp0.c0
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            float fM29188n0;
                            switch (i5114) {
                                case 0:
                                    fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z1);
                                    break;
                                case 1:
                                    fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z1);
                                    break;
                                default:
                                    fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z1);
                                    break;
                            }
                            return Float.valueOf(fM29188n0);
                        }
                    }, new InterfaceC4339a() { // from class: cp0.c0
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            float fM29188n0;
                            switch (i5115) {
                                case 0:
                                    fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z0);
                                    break;
                                case 1:
                                    fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z0);
                                    break;
                                default:
                                    fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z0);
                                    break;
                            }
                            return Float.valueOf(fM29188n0);
                        }
                    }, new C10975l0(interfaceC28690z1, 3), new C10975l0(interfaceC28690z0, 4), new C10972k0(7, interfaceC28601c5), new C10972k0(11, interfaceC28601c7), onDismiss);
                    c28655q2.m87172p0(c11011y0);
                } else {
                    final int i5116 = 0;
                    final int i5117 = 1;
                    final int i5118 = 2;
                    interfaceC28601c8 = interfaceC28601c1;
                    z28 = zM29246b;
                    f13 = fM29245a;
                    c28676v1 = c28676v0;
                    interfaceC2994c6 = interfaceC2994c5;
                    c28655q2 = c28655q4;
                    z29 = zM29247c;
                    c11011y0 = new C11011y0(interfaceC2994c6, z29, new InterfaceC4339a() { // from class: cp0.c0
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            float fM29188n0;
                            switch (i5116) {
                                case 0:
                                    fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z2);
                                    break;
                                case 1:
                                    fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z2);
                                    break;
                                default:
                                    fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z2);
                                    break;
                            }
                            return Float.valueOf(fM29188n0);
                        }
                    }, new C10992r(1, interfaceC28601c5), new InterfaceC4339a() { // from class: cp0.c0
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            float fM29188n0;
                            switch (i5117) {
                                case 0:
                                    fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z1);
                                    break;
                                case 1:
                                    fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z1);
                                    break;
                                default:
                                    fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z1);
                                    break;
                            }
                            return Float.valueOf(fM29188n0);
                        }
                    }, new InterfaceC4339a() { // from class: cp0.c0
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            float fM29188n0;
                            switch (i5118) {
                                case 0:
                                    fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z0);
                                    break;
                                case 1:
                                    fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z0);
                                    break;
                                default:
                                    fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z0);
                                    break;
                            }
                            return Float.valueOf(fM29188n0);
                        }
                    }, new C10975l0(interfaceC28690z1, 3), new C10975l0(interfaceC28690z0, 4), new C10972k0(7, interfaceC28601c5), new C10972k0(11, interfaceC28601c7), onDismiss);
                    c28655q2.m87172p0(c11011y0);
                }
                final C11011y0 c11011y4 = (C11011y0) c11011y0;
                c13404jM29240h2 = bottomSheetState.getScreenContext();
                if (c13404jM29240h2 != null) {
                    source = "";
                } else {
                    source = "";
                }
                EnumC11003u1 enumC11003u1M29159b3 = m29159b0(interfaceC28601c5);
                if ((i45 & 234881024) == 67108864) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                boolean zM87153g7 = z34 | c28655q2.m87153g(source);
                if ((i45 & 3670016) == 1048576) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                boolean z526 = zM87153g7 | z35;
                if ((i45 & 29360128) == 8388608) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                z37 = z526 | z36;
                objM87133R19 = c28655q2.m87133R();
                if (z37) {
                    boolean z527 = z19;
                    InterfaceC4351m interfaceC4351m1113 = interfaceC4351m9;
                    InterfaceC4351m interfaceC4351m1114 = interfaceC4351m10;
                    objM87133R19 = new a(interfaceC4351m1114, source, z527, interfaceC4351m1113, interfaceC28601c6, interfaceC28601c5, null);
                    interfaceC4351m11 = interfaceC4351m1114;
                    interfaceC4351m12 = interfaceC4351m1113;
                    z38 = z527;
                    c28655q2.m87172p0(objM87133R19);
                } else {
                    boolean z528 = z19;
                    InterfaceC4351m interfaceC4351m1115 = interfaceC4351m9;
                    InterfaceC4351m interfaceC4351m1116 = interfaceC4351m10;
                    objM87133R19 = new a(interfaceC4351m1116, source, z528, interfaceC4351m1115, interfaceC28601c6, interfaceC28601c5, null);
                    interfaceC4351m11 = interfaceC4351m1116;
                    interfaceC4351m12 = interfaceC4351m1115;
                    z38 = z528;
                    c28655q2.m87172p0(objM87133R19);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R19, enumC11003u1M29159b3);
                float fM29171f3 = m29171f0(interfaceC28690z0);
                if (m29180j0(interfaceC28601c7)) {
                    c11347e2M30574v = AbstractC11348f.m30574v(0, 0, null, 6);
                } else {
                    c11347e2M30574v = AbstractC11348f.m30574v(300, 0, null, 6);
                }
                c28655q3 = c28655q2;
                final InterfaceC28670t2 interfaceC28670t2M30588b5 = AbstractC11352g.m30588b(fM29171f3, c11347e2M30574v, "bottomSheetHeight", null, c28655q3, 3072, 20);
                interfaceC39171c = (InterfaceC39171c) c28655q3.m87161k(AbstractC2453v1.f9569h);
                if (bottomSheetState.getImeHeightPx() > 0) {
                    z39 = true;
                } else {
                    z39 = false;
                }
                float fM29176h3 = m29176h0(interfaceC28690z1);
                if (m29180j0(interfaceC28601c7)) {
                    c11347e2M30574v2 = AbstractC11348f.m30574v(0, 0, null, 6);
                } else {
                    c11347e2M30574v2 = AbstractC11348f.m30574v(300, 0, null, 6);
                }
                interfaceC28670t2M30588b = AbstractC11352g.m30588b(fM29176h3, c11347e2M30574v2, "heroProgress", null, c28655q3, 3072, 20);
                Float fValueOf13 = Float.valueOf(m29208x0(interfaceC28670t2M30588b));
                if ((i45 & 57344) == 16384) {
                    z44 = true;
                } else {
                    z44 = false;
                }
                zM87153g3 = z44 | c28655q3.m87153g(interfaceC28670t2M30588b);
                objM87133R20 = c28655q3.m87133R();
                if (zM87153g3) {
                    objM87133R20 = new b(function7, interfaceC28670t2M30588b, null);
                    c28655q3.m87172p0(objM87133R20);
                } else {
                    objM87133R20 = new b(function7, interfaceC28670t2M30588b, null);
                    c28655q3.m87172p0(objM87133R20);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R20, fValueOf13);
                Boolean boolValueOf13 = Boolean.valueOf(bottomSheetState.getVisible());
                i46 = i45 & 14;
                if (i46 != 4) {
                    if ((i45 & 8) != 0) {
                        c10978m0 = bottomSheetState;
                        if (c28655q3.m87157i(c10978m0)) {
                        }
                        boolean zM87155h110 = z45 | c28655q3.m87155h(z28);
                        z46 = z28;
                        f14 = f13;
                        zM87147d = zM87155h110 | c28655q3.m87147d(f14);
                        objM87133R21 = c28655q3.m87133R();
                        if (zM87147d) {
                            objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                            f15 = f14;
                            c28655q3.m87172p0(objM87133R21);
                        } else {
                            objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                            f15 = f14;
                            c28655q3.m87172p0(objM87133R21);
                        }
                        AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R21, boolValueOf13);
                        Float fValueOf14 = Float.valueOf(f15);
                        if (i46 != 4) {
                            z47 = true;
                        } else {
                            z47 = true;
                        }
                        zM87147d2 = z47 | c28655q3.m87147d(f15);
                        objM87133R22 = c28655q3.m87133R();
                        if (zM87147d2) {
                            objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                            c28655q3.m87172p0(objM87133R22);
                        } else {
                            objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                            c28655q3.m87172p0(objM87133R22);
                        }
                        AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R22, fValueOf14);
                        Boolean boolValueOf14 = Boolean.valueOf(z39);
                        boolean zM87155h111 = c28655q3.m87155h(z39);
                        if (i46 != 4) {
                            z48 = true;
                        } else {
                            z48 = true;
                        }
                        z49 = zM87155h111 | z48;
                        objM87133R23 = c28655q3.m87133R();
                        if (z49) {
                            objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                            c28655q3.m87172p0(objM87133R23);
                        } else {
                            objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                            c28655q3.m87172p0(objM87133R23);
                        }
                        AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R23, boolValueOf14);
                        boolean zM29243k10 = bottomSheetState.getVisible();
                        zM87155h = c28655q3.m87155h(z29) | c28655q3.m87147d(f15) | c28655q3.m87157i(interfaceC2994c6) | ((i45 & 112) == 32);
                        objM87133R24 = c28655q3.m87133R();
                        if (zM87155h) {
                            final InterfaceC2994c0 interfaceC2994c115 = interfaceC2994c6;
                            final boolean z511114 = z29;
                            final float f1114 = f15;
                            objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC10969j0.m29210y0(z511114, f1114, interfaceC2994c115, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                                }
                            };
                            c28655q3.m87172p0(objM87133R24);
                        } else {
                            final InterfaceC2994c0 interfaceC2994c116 = interfaceC2994c6;
                            final boolean z511115 = z29;
                            final float f1115 = f15;
                            objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC10969j0.m29210y0(z511115, f1115, interfaceC2994c116, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                                }
                            };
                            c28655q3.m87172p0(objM87133R24);
                        }
                        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R24, zM29243k10, c28655q3, 0, 0);
                        if (bottomSheetState.getVisible()) {
                        }
                        InterfaceC4351m interfaceC4351m1117 = interfaceC4351m12;
                        final boolean z511116 = z24;
                        final InterfaceC4340b interfaceC4340b14 = interfaceC4340b3;
                        C28673u1[] c28673u1Arr10 = {f34074a.mo86977a(Boolean.valueOf(bottomSheetState.getVisible())), f34075b.mo86977a(m29159b0(interfaceC28601c5)), f34076c.mo86977a(c11011y4)};
                        final Function3 function110 = function8;
                        final C10962h c10962h11 = c10962h;
                        final InterfaceC28601c1 interfaceC28601c1114 = interfaceC28601c8;
                        final InterfaceC39171c interfaceC39171c12 = interfaceC39171c2;
                        final boolean z511117 = z29;
                        AbstractC28683x.m87248b(c28673u1Arr10, AbstractC37817c.m121344e(1438636126, c28655q3, new InterfaceC4351m() { // from class: cp0.h0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC10969j0.m29104A0(interfaceC39171c12, zIsFeatureEnabled5, bottomSheetState, c32645n3, z511117, c10962h11, c11011y4, z511116, onDismiss, function110, interfaceC4340b14, interfaceC28690z2, interfaceC28670t2M30588b, interfaceC28670t2M30588b5, interfaceC28601c5, interfaceC28601c7, interfaceC28601c1113, interfaceC28601c2, interfaceC28601c1114, interfaceC28601c1110, interfaceC28601c1111, interfaceC28601c3, interfaceC28601c1112, interfaceC28601c4, (Composer) obj, iIntValue);
                            }
                        }), c28655q3, 56);
                        c28655q = c28655q3;
                        z16 = z511116;
                        interfaceC4340b2 = interfaceC4340b14;
                        function6 = function110;
                        interfaceC2994c2 = interfaceC2994c6;
                        z17 = z38;
                        interfaceC4351m4 = interfaceC4351m1117;
                        interfaceC4351m5 = interfaceC4351m11;
                        function5 = function7;
                        interfaceC40915c2 = interfaceC40915c7;
                        c4656v1 = c4656v2;
                    } else {
                        c10978m0 = bottomSheetState;
                    }
                    interfaceC39171c2 = interfaceC39171c;
                    z45 = false;
                    boolean zM87155h112 = z45 | c28655q3.m87155h(z28);
                    z46 = z28;
                    f14 = f13;
                    zM87147d = zM87155h112 | c28655q3.m87147d(f14);
                    objM87133R21 = c28655q3.m87133R();
                    if (zM87147d) {
                        objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                        f15 = f14;
                        c28655q3.m87172p0(objM87133R21);
                    } else {
                        objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                        f15 = f14;
                        c28655q3.m87172p0(objM87133R21);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R21, boolValueOf13);
                    Float fValueOf15 = Float.valueOf(f15);
                    if (i46 != 4) {
                        z47 = true;
                    } else {
                        z47 = true;
                    }
                    zM87147d2 = z47 | c28655q3.m87147d(f15);
                    objM87133R22 = c28655q3.m87133R();
                    if (zM87147d2) {
                        objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                        c28655q3.m87172p0(objM87133R22);
                    } else {
                        objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                        c28655q3.m87172p0(objM87133R22);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R22, fValueOf15);
                    Boolean boolValueOf15 = Boolean.valueOf(z39);
                    boolean zM87155h113 = c28655q3.m87155h(z39);
                    if (i46 != 4) {
                        z48 = true;
                    } else {
                        z48 = true;
                    }
                    z49 = zM87155h113 | z48;
                    objM87133R23 = c28655q3.m87133R();
                    if (z49) {
                        objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                        c28655q3.m87172p0(objM87133R23);
                    } else {
                        objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                        c28655q3.m87172p0(objM87133R23);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R23, boolValueOf15);
                    boolean zM29243k11 = bottomSheetState.getVisible();
                    zM87155h = c28655q3.m87155h(z29) | c28655q3.m87147d(f15) | c28655q3.m87157i(interfaceC2994c6) | ((i45 & 112) == 32);
                    objM87133R24 = c28655q3.m87133R();
                    if (zM87155h) {
                        final InterfaceC2994c0 interfaceC2994c117 = interfaceC2994c6;
                        final boolean z511118 = z29;
                        final float f1116 = f15;
                        objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC10969j0.m29210y0(z511118, f1116, interfaceC2994c117, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                            }
                        };
                        c28655q3.m87172p0(objM87133R24);
                    } else {
                        final InterfaceC2994c0 interfaceC2994c118 = interfaceC2994c6;
                        final boolean z511119 = z29;
                        final float f1117 = f15;
                        objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC10969j0.m29210y0(z511119, f1117, interfaceC2994c118, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                            }
                        };
                        c28655q3.m87172p0(objM87133R24);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R24, zM29243k11, c28655q3, 0, 0);
                    if (bottomSheetState.getVisible()) {
                    }
                    InterfaceC4351m interfaceC4351m1118 = interfaceC4351m12;
                    final boolean z5111110 = z24;
                    final InterfaceC4340b interfaceC4340b15 = interfaceC4340b3;
                    C28673u1[] c28673u1Arr11 = {f34074a.mo86977a(Boolean.valueOf(bottomSheetState.getVisible())), f34075b.mo86977a(m29159b0(interfaceC28601c5)), f34076c.mo86977a(c11011y4)};
                    final Function3 function111 = function8;
                    final C10962h c10962h12 = c10962h;
                    final InterfaceC28601c1 interfaceC28601c1115 = interfaceC28601c8;
                    final InterfaceC39171c interfaceC39171c13 = interfaceC39171c2;
                    final boolean z5111111 = z29;
                    AbstractC28683x.m87248b(c28673u1Arr11, AbstractC37817c.m121344e(1438636126, c28655q3, new InterfaceC4351m() { // from class: cp0.h0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC10969j0.m29104A0(interfaceC39171c13, zIsFeatureEnabled5, bottomSheetState, c32645n3, z5111111, c10962h12, c11011y4, z5111110, onDismiss, function111, interfaceC4340b15, interfaceC28690z2, interfaceC28670t2M30588b, interfaceC28670t2M30588b5, interfaceC28601c5, interfaceC28601c7, interfaceC28601c1113, interfaceC28601c2, interfaceC28601c1115, interfaceC28601c1110, interfaceC28601c1111, interfaceC28601c3, interfaceC28601c1112, interfaceC28601c4, (Composer) obj, iIntValue);
                        }
                    }), c28655q3, 56);
                    c28655q = c28655q3;
                    z16 = z5111110;
                    interfaceC4340b2 = interfaceC4340b15;
                    function6 = function111;
                    interfaceC2994c2 = interfaceC2994c6;
                    z17 = z38;
                    interfaceC4351m4 = interfaceC4351m1118;
                    interfaceC4351m5 = interfaceC4351m11;
                    function5 = function7;
                    interfaceC40915c2 = interfaceC40915c7;
                    c4656v1 = c4656v2;
                } else {
                    c10978m0 = bottomSheetState;
                }
                interfaceC39171c2 = interfaceC39171c;
                z45 = true;
                boolean zM87155h114 = z45 | c28655q3.m87155h(z28);
                z46 = z28;
                f14 = f13;
                zM87147d = zM87155h114 | c28655q3.m87147d(f14);
                objM87133R21 = c28655q3.m87133R();
                if (zM87147d) {
                    objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                    f15 = f14;
                    c28655q3.m87172p0(objM87133R21);
                } else {
                    objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                    f15 = f14;
                    c28655q3.m87172p0(objM87133R21);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R21, boolValueOf13);
                Float fValueOf16 = Float.valueOf(f15);
                if (i46 != 4) {
                    z47 = true;
                } else {
                    z47 = true;
                }
                zM87147d2 = z47 | c28655q3.m87147d(f15);
                objM87133R22 = c28655q3.m87133R();
                if (zM87147d2) {
                    objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                    c28655q3.m87172p0(objM87133R22);
                } else {
                    objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                    c28655q3.m87172p0(objM87133R22);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R22, fValueOf16);
                Boolean boolValueOf16 = Boolean.valueOf(z39);
                boolean zM87155h115 = c28655q3.m87155h(z39);
                if (i46 != 4) {
                    z48 = true;
                } else {
                    z48 = true;
                }
                z49 = zM87155h115 | z48;
                objM87133R23 = c28655q3.m87133R();
                if (z49) {
                    objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                    c28655q3.m87172p0(objM87133R23);
                } else {
                    objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                    c28655q3.m87172p0(objM87133R23);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R23, boolValueOf16);
                boolean zM29243k12 = bottomSheetState.getVisible();
                zM87155h = c28655q3.m87155h(z29) | c28655q3.m87147d(f15) | c28655q3.m87157i(interfaceC2994c6) | ((i45 & 112) == 32);
                objM87133R24 = c28655q3.m87133R();
                if (zM87155h) {
                    final InterfaceC2994c0 interfaceC2994c119 = interfaceC2994c6;
                    final boolean z5111112 = z29;
                    final float f1118 = f15;
                    objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return AbstractC10969j0.m29210y0(z5111112, f1118, interfaceC2994c119, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                        }
                    };
                    c28655q3.m87172p0(objM87133R24);
                } else {
                    final InterfaceC2994c0 interfaceC2994c1110 = interfaceC2994c6;
                    final boolean z5111113 = z29;
                    final float f1119 = f15;
                    objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return AbstractC10969j0.m29210y0(z5111113, f1119, interfaceC2994c1110, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                        }
                    };
                    c28655q3.m87172p0(objM87133R24);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R24, zM29243k12, c28655q3, 0, 0);
                if (bottomSheetState.getVisible()) {
                }
                InterfaceC4351m interfaceC4351m1119 = interfaceC4351m12;
                final boolean z5111114 = z24;
                final InterfaceC4340b interfaceC4340b16 = interfaceC4340b3;
                C28673u1[] c28673u1Arr12 = {f34074a.mo86977a(Boolean.valueOf(bottomSheetState.getVisible())), f34075b.mo86977a(m29159b0(interfaceC28601c5)), f34076c.mo86977a(c11011y4)};
                final Function3 function112 = function8;
                final C10962h c10962h13 = c10962h;
                final InterfaceC28601c1 interfaceC28601c1116 = interfaceC28601c8;
                final InterfaceC39171c interfaceC39171c14 = interfaceC39171c2;
                final boolean z5111115 = z29;
                AbstractC28683x.m87248b(c28673u1Arr12, AbstractC37817c.m121344e(1438636126, c28655q3, new InterfaceC4351m() { // from class: cp0.h0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC10969j0.m29104A0(interfaceC39171c14, zIsFeatureEnabled5, bottomSheetState, c32645n3, z5111115, c10962h13, c11011y4, z5111114, onDismiss, function112, interfaceC4340b16, interfaceC28690z2, interfaceC28670t2M30588b, interfaceC28670t2M30588b5, interfaceC28601c5, interfaceC28601c7, interfaceC28601c1113, interfaceC28601c2, interfaceC28601c1116, interfaceC28601c1110, interfaceC28601c1111, interfaceC28601c3, interfaceC28601c1112, interfaceC28601c4, (Composer) obj, iIntValue);
                    }
                }), c28655q3, 56);
                c28655q = c28655q3;
                z16 = z5111114;
                interfaceC4340b2 = interfaceC4340b16;
                function6 = function112;
                interfaceC2994c2 = interfaceC2994c6;
                z17 = z38;
                interfaceC4351m4 = interfaceC4351m1119;
                interfaceC4351m5 = interfaceC4351m11;
                function5 = function7;
                interfaceC40915c2 = interfaceC40915c7;
                c4656v1 = c4656v2;
            } else {
                c28655q4.m87138X();
                z16 = z13;
                interfaceC4340b2 = interfaceC4340b;
                c28655q = c28655q4;
                function5 = function2;
                function6 = function4;
                z17 = z14;
                interfaceC2994c2 = interfaceC2994c1;
                interfaceC4351m4 = interfaceC4351m3;
                interfaceC4351m5 = interfaceC4351m2;
                c4656v1 = c4656v3;
                interfaceC40915c2 = interfaceC40915c;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i5119 = 1;
                interfaceC4351m6 = new InterfaceC4351m() { // from class: cp0.g0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        switch (i5119) {
                            case 0:
                                return AbstractC10969j0.m29212z0(bottomSheetState, onDismiss, interfaceC40915c2, interfaceC2994c2, function5, function6, z17, interfaceC4351m4, interfaceC4351m5, z16, c4656v1, interfaceC4340b2, i13, i14, i15, composer2, ((Integer) obj2).intValue());
                            default:
                                return AbstractC10969j0.m29126L0(bottomSheetState, onDismiss, interfaceC40915c2, interfaceC2994c2, function5, function6, z17, interfaceC4351m4, interfaceC4351m5, z16, c4656v1, interfaceC4340b2, i13, i14, i15, composer2, ((Integer) obj2).intValue());
                        }
                    }
                };
                c28677v1 = c28677v1M87180u;
                c28677v1.f115982d = interfaceC4351m6;
            }
        }
        i16 |= 24576;
        function2 = function1;
        i17 = i15 & 32;
        if (i17 != 0) {
            i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            function4 = function3;
        } else {
            function4 = function3;
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q4.m87157i(function4)) {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i18;
            }
        }
        i19 = i15 & 64;
        if (i19 != 0) {
            i16 |= 1572864;
            z14 = z4;
        } else {
            z14 = z4;
            if ((i13 & 1572864) == 0) {
                if (c28655q4.m87155h(z14)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i16 |= i24;
            }
        }
        i25 = i15 & 128;
        if (i25 != 0) {
            i16 |= 12582912;
            interfaceC4351m3 = interfaceC4351m;
        } else {
            interfaceC4351m3 = interfaceC4351m;
            if ((i13 & 12582912) == 0) {
                if (c28655q4.m87157i(interfaceC4351m3)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i16 |= i26;
            }
        }
        i27 = i15 & 256;
        if (i27 != 0) {
            i16 |= 100663296;
        } else if ((i13 & 100663296) == 0) {
            if (c28655q4.m87157i(interfaceC4351m2)) {
                i28 = 67108864;
            } else {
                i28 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i16 |= i28;
        }
        i29 = i15 & 512;
        if (i29 != 0) {
            if ((i13 & 805306368) == 0) {
                if (c28655q4.m87155h(z13)) {
                    i34 = 536870912;
                } else {
                    i34 = 268435456;
                }
                i16 |= i34;
            }
            i35 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i35 != 0) {
                i36 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                if ((i14 & 8) == 0) {
                    zM87157i = c28655q4.m87153g(c4656v3);
                } else {
                    zM87157i = c28655q4.m87157i(c4656v3);
                }
                if (zM87157i) {
                    i37 = 4;
                } else {
                    i37 = 2;
                }
                i36 = i14 | i37;
            } else {
                i36 = i14;
            }
            i38 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            if (i38 != 0) {
                if ((i14 & 48) == 0) {
                    if (c28655q4.m87157i(interfaceC4340b)) {
                        i39 = 32;
                    } else {
                        i39 = 16;
                    }
                    i36 |= i39;
                }
                if ((i16 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (c28655q4.m87135U(i16 & 1, z15)) {
                    c28655q4.m87140Z();
                    i44 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i44 != 0) {
                        if (i48 != 0) {
                            interfaceC40915c3 = null;
                        } else {
                            interfaceC40915c3 = interfaceC40915c;
                        }
                        if ((i15 & 8) != 0) {
                            objM87133R3 = c28655q4.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = AbstractC28683x.m87262p(c28655q4);
                                c28655q4.m87172p0(objM87133R3);
                            }
                            interfaceC2994c3 = (InterfaceC2994c0) objM87133R3;
                            i16 &= -7169;
                        } else {
                            interfaceC2994c3 = interfaceC2994c1;
                        }
                        if (i49 != 0) {
                            function2 = null;
                        }
                        if (i17 != 0) {
                            function4 = null;
                        }
                        if (i19 != 0) {
                            z14 = false;
                        }
                        if (i25 != 0) {
                            objM87133R2 = c28655q4.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C4139w0(7);
                                c28655q4.m87172p0(objM87133R2);
                            }
                            interfaceC4351m7 = (InterfaceC4351m) objM87133R2;
                        } else {
                            interfaceC4351m7 = interfaceC4351m3;
                        }
                        if (i27 != 0) {
                            objM87133R = c28655q4.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C4139w0(8);
                                c28655q4.m87172p0(objM87133R);
                            }
                            interfaceC4351m8 = (InterfaceC4351m) objM87133R;
                        } else {
                            interfaceC4351m8 = interfaceC4351m2;
                        }
                        if (i29 != 0) {
                            z18 = false;
                        } else {
                            z18 = z13;
                        }
                        if (i35 != 0) {
                            c4656v3 = null;
                        }
                        if (i38 != 0) {
                            str = null;
                            C37816b c37816bM121344e12 = AbstractC37817c.m121344e(-633821104, c28655q4, new InterfaceC4340b() { // from class: cp0.i0
                                @Override // c93.InterfaceC4340b
                                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
                                    int iIntValue = ((Integer) obj10).intValue();
                                    return AbstractC10969j0.m29137R(interfaceC40915c3, bottomSheetState, z18, c4656v3, (C32645n0) obj, (InterfaceC4339a) obj2, (InterfaceC4353o) obj3, (Function1) obj4, (Function1) obj5, (InterfaceC4339a) obj6, (String) obj7, (Function3) obj8, (C28655q) ((Composer) obj9), iIntValue);
                                }
                            });
                            c4656v2 = c4656v3;
                            i45 = i16;
                            function7 = function2;
                            function8 = function4;
                            interfaceC2994c4 = interfaceC2994c3;
                            z19 = z14;
                            interfaceC4351m9 = interfaceC4351m7;
                            interfaceC4351m10 = interfaceC4351m8;
                            z24 = z18;
                            interfaceC4340b3 = c37816bM121344e12;
                        } else {
                            str = null;
                            interfaceC4340b3 = interfaceC4340b;
                            c4656v2 = c4656v3;
                            i45 = i16;
                            function7 = function2;
                            function8 = function4;
                            interfaceC2994c4 = interfaceC2994c3;
                            z19 = z14;
                            interfaceC4351m9 = interfaceC4351m7;
                            interfaceC4351m10 = interfaceC4351m8;
                            z24 = z18;
                        }
                    } else {
                        if (i48 != 0) {
                            interfaceC40915c3 = null;
                        } else {
                            interfaceC40915c3 = interfaceC40915c;
                        }
                        if ((i15 & 8) != 0) {
                            objM87133R3 = c28655q4.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = AbstractC28683x.m87262p(c28655q4);
                                c28655q4.m87172p0(objM87133R3);
                            }
                            interfaceC2994c3 = (InterfaceC2994c0) objM87133R3;
                            i16 &= -7169;
                        } else {
                            interfaceC2994c3 = interfaceC2994c1;
                        }
                        if (i49 != 0) {
                            function2 = null;
                        }
                        if (i17 != 0) {
                            function4 = null;
                        }
                        if (i19 != 0) {
                            z14 = false;
                        }
                        if (i25 != 0) {
                            objM87133R2 = c28655q4.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C4139w0(7);
                                c28655q4.m87172p0(objM87133R2);
                            }
                            interfaceC4351m7 = (InterfaceC4351m) objM87133R2;
                        } else {
                            interfaceC4351m7 = interfaceC4351m3;
                        }
                        if (i27 != 0) {
                            objM87133R = c28655q4.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C4139w0(8);
                                c28655q4.m87172p0(objM87133R);
                            }
                            interfaceC4351m8 = (InterfaceC4351m) objM87133R;
                        } else {
                            interfaceC4351m8 = interfaceC4351m2;
                        }
                        if (i29 != 0) {
                            z18 = false;
                        } else {
                            z18 = z13;
                        }
                        if (i35 != 0) {
                            c4656v3 = null;
                        }
                        if (i38 != 0) {
                            str = null;
                            C37816b c37816bM121344e13 = AbstractC37817c.m121344e(-633821104, c28655q4, new InterfaceC4340b() { // from class: cp0.i0
                                @Override // c93.InterfaceC4340b
                                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
                                    int iIntValue = ((Integer) obj10).intValue();
                                    return AbstractC10969j0.m29137R(interfaceC40915c3, bottomSheetState, z18, c4656v3, (C32645n0) obj, (InterfaceC4339a) obj2, (InterfaceC4353o) obj3, (Function1) obj4, (Function1) obj5, (InterfaceC4339a) obj6, (String) obj7, (Function3) obj8, (C28655q) ((Composer) obj9), iIntValue);
                                }
                            });
                            c4656v2 = c4656v3;
                            i45 = i16;
                            function7 = function2;
                            function8 = function4;
                            interfaceC2994c4 = interfaceC2994c3;
                            z19 = z14;
                            interfaceC4351m9 = interfaceC4351m7;
                            interfaceC4351m10 = interfaceC4351m8;
                            z24 = z18;
                            interfaceC4340b3 = c37816bM121344e13;
                        } else {
                            str = null;
                            interfaceC4340b3 = interfaceC4340b;
                            c4656v2 = c4656v3;
                            i45 = i16;
                            function7 = function2;
                            function8 = function4;
                            interfaceC2994c4 = interfaceC2994c3;
                            z19 = z14;
                            interfaceC4351m9 = interfaceC4351m7;
                            interfaceC4351m10 = interfaceC4351m8;
                            z24 = z18;
                        }
                    }
                    c28655q4.m87175r();
                    zM87153g = c28655q4.m87153g(bottomSheetState.getScreenContext());
                    objM87133R4 = c28655q4.m87133R();
                    if (zM87153g) {
                        objM87133R4 = m29172f1(bottomSheetState.getScreenContext());
                        c28655q4.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = m29172f1(bottomSheetState.getScreenContext());
                        c28655q4.m87172p0(objM87133R4);
                    }
                    final C32645n0 c32645n4 = (C32645n0) objM87133R4;
                    FeatureFlagChecker featureFlagChecker5 = (FeatureFlagChecker) c28655q4.m87161k(AbstractC38073e.m121968p());
                    C10978m0.Companion aVar5 = C10978m0.INSTANCE;
                    zM29247c = aVar5.m29247c(bottomSheetState.getScreenContext());
                    zM29246b = aVar5.m29246b(bottomSheetState.getCustomDrawerPresentation(), bottomSheetState.getShouldOpenFullSize(), zM29247c, bottomSheetState.getReadOnlyHalfSheet());
                    final boolean zIsFeatureEnabled6 = featureFlagChecker5.isFeatureEnabled("wce-padding-keyboard-fix");
                    zIsFeatureEnabled = featureFlagChecker5.isFeatureEnabled("context-hub-profile");
                    Set setM74059b5 = AbstractC25260n.m74059b1(new String[]{"CONTEXT_HUB", "CONTEXT_DETAILS"});
                    c13404jM29240h = bottomSheetState.getScreenContext();
                    if (c13404jM29240h != null) {
                        screenId = c13404jM29240h.getScreenId();
                    } else {
                        screenId = str;
                    }
                    zM74155w0 = AbstractC25265s.m74155w0(setM74059b5, screenId);
                    objM87133R5 = c28655q4.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(str);
                        c28655q4.m87172p0(objM87133R5);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                    objM87133R6 = c28655q4.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87272z(str);
                        c28655q4.m87172p0(objM87133R6);
                    }
                    final InterfaceC28601c1 interfaceC28601c1117 = (InterfaceC28601c1) objM87133R6;
                    objM87133R7 = c28655q4.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC28683x.m87272z(str);
                        c28655q4.m87172p0(objM87133R7);
                    }
                    final InterfaceC28601c1 interfaceC28601c1118 = (InterfaceC28601c1) objM87133R7;
                    objM87133R8 = c28655q4.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = AbstractC28683x.m87272z("");
                        c28655q4.m87172p0(objM87133R8);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R8;
                    final InterfaceC40915c interfaceC40915c8 = interfaceC40915c3;
                    objM87133R9 = c28655q4.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = AbstractC28683x.m87272z(Boolean.TRUE);
                        c28655q4.m87172p0(objM87133R9);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R9;
                    objM87133R10 = c28655q4.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = AbstractC28683x.m87272z(Boolean.TRUE);
                        c28655q4.m87172p0(objM87133R10);
                    }
                    final InterfaceC28601c1 interfaceC28601c1119 = (InterfaceC28601c1) objM87133R10;
                    objM87133R11 = c28655q4.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = AbstractC28683x.m87272z(Boolean.TRUE);
                        c28655q4.m87172p0(objM87133R11);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R11;
                    if (zIsFeatureEnabled) {
                        z25 = zM74155w0;
                    } else {
                        z25 = true;
                    }
                    if (m29143U(interfaceC28601c4)) {
                        z26 = false;
                    } else {
                        z26 = false;
                    }
                    if (zIsFeatureEnabled) {
                        z27 = false;
                    } else {
                        z27 = false;
                    }
                    if (m29133P(interfaceC28601c3)) {
                        c28655q4.m87150e0(2094451546);
                        C37816b c37816bM121344e14 = AbstractC37817c.m121344e(36773779, c28655q4, new C0003a0(19, interfaceC28601c2, interfaceC28601c1));
                        c28655q4.m87173q(false);
                        r10 = c37816bM121344e14;
                    } else {
                        c28655q4.m87150e0(2094652488);
                        c28655q4.m87173q(false);
                        r10 = str;
                    }
                    final boolean z5124 = z27;
                    final boolean z5125 = z26;
                    c10962h = new C10962h(r10, AbstractC37817c.m121344e(-582148231, c28655q4, new InterfaceC4351m() { // from class: cp0.b0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC10969j0.m29151Y(z5125, z5124, zIsFeatureEnabled, interfaceC28601c1117, interfaceC28601c1118, (Composer) obj, iIntValue);
                        }
                    }));
                    c10962hM29242j = bottomSheetState.getToolbarContent();
                    if (c10962hM29242j == null) {
                        c10962h = c10962hM29242j;
                    } else if (zM29247c) {
                        ?? r18 = str;
                        c10962h = new C10962h(r18, r18, 3, r18);
                    }
                    fM29245a = aVar5.m29245a(bottomSheetState.getCustomDrawerPresentation());
                    objM87133R12 = c28655q4.m87133R();
                    if (objM87133R12 == c28676v0) {
                        objM87133R12 = AbstractC28683x.m87272z(bottomSheetState.getInitialSheetState());
                        c28655q4.m87172p0(objM87133R12);
                    }
                    interfaceC28601c5 = (InterfaceC28601c1) objM87133R12;
                    objM87133R13 = c28655q4.m87133R();
                    if (objM87133R13 == c28676v0) {
                        objM87133R13 = AbstractC28683x.m87272z(bottomSheetState.getInitialSheetState());
                        c28655q4.m87172p0(objM87133R13);
                    }
                    interfaceC28601c6 = (InterfaceC28601c1) objM87133R13;
                    objM87133R14 = c28655q4.m87133R();
                    if (objM87133R14 == c28676v0) {
                        objM87133R14 = AbstractC11266d.m30468v(bottomSheetState.getInitialHeightFraction(), c28655q4);
                    }
                    interfaceC28690z0 = (InterfaceC28690z0) objM87133R14;
                    objM87133R15 = c28655q4.m87133R();
                    if (objM87133R15 == c28676v0) {
                        if (bottomSheetState.getInitialSheetState() == EnumC11003u1.Hidden) {
                            f16 = 0.0f;
                        } else {
                            f16 = 1.0f;
                        }
                        objM87133R15 = AbstractC11266d.m30468v(f16, c28655q4);
                    }
                    interfaceC28690z1 = (InterfaceC28690z0) objM87133R15;
                    objM87133R16 = c28655q4.m87133R();
                    if (objM87133R16 == c28676v0) {
                        objM87133R16 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q4.m87172p0(objM87133R16);
                    }
                    interfaceC28601c7 = (InterfaceC28601c1) objM87133R16;
                    objM87133R17 = c28655q4.m87133R();
                    if (objM87133R17 == c28676v0) {
                        objM87133R17 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q4.m87172p0(objM87133R17);
                    }
                    final InterfaceC28601c1 interfaceC28601c11110 = (InterfaceC28601c1) objM87133R17;
                    objM87133R18 = c28655q4.m87133R();
                    if (objM87133R18 == c28676v0) {
                        objM87133R18 = AbstractC11266d.m30468v(0.0f, c28655q4);
                    }
                    interfaceC28690z2 = (InterfaceC28690z0) objM87133R18;
                    zM87153g2 = c28655q4.m87153g(interfaceC2994c4);
                    interfaceC2994c5 = interfaceC2994c4;
                    Object objM87133R29 = c28655q4.m87133R();
                    if (zM87153g2) {
                        final int i51110 = 0;
                        final int i51111 = 1;
                        final int i51112 = 2;
                        interfaceC28601c8 = interfaceC28601c1;
                        z28 = zM29246b;
                        f13 = fM29245a;
                        c28676v1 = c28676v0;
                        interfaceC2994c6 = interfaceC2994c5;
                        c28655q2 = c28655q4;
                        z29 = zM29247c;
                        c11011y0 = new C11011y0(interfaceC2994c6, z29, new InterfaceC4339a() { // from class: cp0.c0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                float fM29188n0;
                                switch (i51110) {
                                    case 0:
                                        fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z2);
                                        break;
                                    case 1:
                                        fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z2);
                                        break;
                                    default:
                                        fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z2);
                                        break;
                                }
                                return Float.valueOf(fM29188n0);
                            }
                        }, new C10992r(1, interfaceC28601c5), new InterfaceC4339a() { // from class: cp0.c0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                float fM29188n0;
                                switch (i51111) {
                                    case 0:
                                        fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z1);
                                        break;
                                    case 1:
                                        fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z1);
                                        break;
                                    default:
                                        fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z1);
                                        break;
                                }
                                return Float.valueOf(fM29188n0);
                            }
                        }, new InterfaceC4339a() { // from class: cp0.c0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                float fM29188n0;
                                switch (i51112) {
                                    case 0:
                                        fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z0);
                                        break;
                                    case 1:
                                        fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z0);
                                        break;
                                    default:
                                        fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z0);
                                        break;
                                }
                                return Float.valueOf(fM29188n0);
                            }
                        }, new C10975l0(interfaceC28690z1, 3), new C10975l0(interfaceC28690z0, 4), new C10972k0(7, interfaceC28601c5), new C10972k0(11, interfaceC28601c7), onDismiss);
                        c28655q2.m87172p0(c11011y0);
                    } else {
                        final int i51113 = 0;
                        final int i51114 = 1;
                        final int i51115 = 2;
                        interfaceC28601c8 = interfaceC28601c1;
                        z28 = zM29246b;
                        f13 = fM29245a;
                        c28676v1 = c28676v0;
                        interfaceC2994c6 = interfaceC2994c5;
                        c28655q2 = c28655q4;
                        z29 = zM29247c;
                        c11011y0 = new C11011y0(interfaceC2994c6, z29, new InterfaceC4339a() { // from class: cp0.c0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                float fM29188n0;
                                switch (i51113) {
                                    case 0:
                                        fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z2);
                                        break;
                                    case 1:
                                        fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z2);
                                        break;
                                    default:
                                        fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z2);
                                        break;
                                }
                                return Float.valueOf(fM29188n0);
                            }
                        }, new C10992r(1, interfaceC28601c5), new InterfaceC4339a() { // from class: cp0.c0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                float fM29188n0;
                                switch (i51114) {
                                    case 0:
                                        fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z1);
                                        break;
                                    case 1:
                                        fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z1);
                                        break;
                                    default:
                                        fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z1);
                                        break;
                                }
                                return Float.valueOf(fM29188n0);
                            }
                        }, new InterfaceC4339a() { // from class: cp0.c0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                float fM29188n0;
                                switch (i51115) {
                                    case 0:
                                        fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z0);
                                        break;
                                    case 1:
                                        fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z0);
                                        break;
                                    default:
                                        fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z0);
                                        break;
                                }
                                return Float.valueOf(fM29188n0);
                            }
                        }, new C10975l0(interfaceC28690z1, 3), new C10975l0(interfaceC28690z0, 4), new C10972k0(7, interfaceC28601c5), new C10972k0(11, interfaceC28601c7), onDismiss);
                        c28655q2.m87172p0(c11011y0);
                    }
                    final C11011y0 c11011y5 = (C11011y0) c11011y0;
                    c13404jM29240h2 = bottomSheetState.getScreenContext();
                    if (c13404jM29240h2 != null) {
                        source = "";
                    } else {
                        source = "";
                    }
                    EnumC11003u1 enumC11003u1M29159b4 = m29159b0(interfaceC28601c5);
                    if ((i45 & 234881024) == 67108864) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    boolean zM87153g8 = z34 | c28655q2.m87153g(source);
                    if ((i45 & 3670016) == 1048576) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    boolean z529 = zM87153g8 | z35;
                    if ((i45 & 29360128) == 8388608) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    z37 = z529 | z36;
                    objM87133R19 = c28655q2.m87133R();
                    if (z37) {
                        boolean z5210 = z19;
                        InterfaceC4351m interfaceC4351m11110 = interfaceC4351m9;
                        InterfaceC4351m interfaceC4351m11111 = interfaceC4351m10;
                        objM87133R19 = new a(interfaceC4351m11111, source, z5210, interfaceC4351m11110, interfaceC28601c6, interfaceC28601c5, null);
                        interfaceC4351m11 = interfaceC4351m11111;
                        interfaceC4351m12 = interfaceC4351m11110;
                        z38 = z5210;
                        c28655q2.m87172p0(objM87133R19);
                    } else {
                        boolean z5211 = z19;
                        InterfaceC4351m interfaceC4351m11112 = interfaceC4351m9;
                        InterfaceC4351m interfaceC4351m11113 = interfaceC4351m10;
                        objM87133R19 = new a(interfaceC4351m11113, source, z5211, interfaceC4351m11112, interfaceC28601c6, interfaceC28601c5, null);
                        interfaceC4351m11 = interfaceC4351m11113;
                        interfaceC4351m12 = interfaceC4351m11112;
                        z38 = z5211;
                        c28655q2.m87172p0(objM87133R19);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R19, enumC11003u1M29159b4);
                    float fM29171f4 = m29171f0(interfaceC28690z0);
                    if (m29180j0(interfaceC28601c7)) {
                        c11347e2M30574v = AbstractC11348f.m30574v(0, 0, null, 6);
                    } else {
                        c11347e2M30574v = AbstractC11348f.m30574v(300, 0, null, 6);
                    }
                    c28655q3 = c28655q2;
                    final InterfaceC28670t2 interfaceC28670t2M30588b6 = AbstractC11352g.m30588b(fM29171f4, c11347e2M30574v, "bottomSheetHeight", null, c28655q3, 3072, 20);
                    interfaceC39171c = (InterfaceC39171c) c28655q3.m87161k(AbstractC2453v1.f9569h);
                    if (bottomSheetState.getImeHeightPx() > 0) {
                        z39 = true;
                    } else {
                        z39 = false;
                    }
                    float fM29176h4 = m29176h0(interfaceC28690z1);
                    if (m29180j0(interfaceC28601c7)) {
                        c11347e2M30574v2 = AbstractC11348f.m30574v(0, 0, null, 6);
                    } else {
                        c11347e2M30574v2 = AbstractC11348f.m30574v(300, 0, null, 6);
                    }
                    interfaceC28670t2M30588b = AbstractC11352g.m30588b(fM29176h4, c11347e2M30574v2, "heroProgress", null, c28655q3, 3072, 20);
                    Float fValueOf17 = Float.valueOf(m29208x0(interfaceC28670t2M30588b));
                    if ((i45 & 57344) == 16384) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    zM87153g3 = z44 | c28655q3.m87153g(interfaceC28670t2M30588b);
                    objM87133R20 = c28655q3.m87133R();
                    if (zM87153g3) {
                        objM87133R20 = new b(function7, interfaceC28670t2M30588b, null);
                        c28655q3.m87172p0(objM87133R20);
                    } else {
                        objM87133R20 = new b(function7, interfaceC28670t2M30588b, null);
                        c28655q3.m87172p0(objM87133R20);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R20, fValueOf17);
                    Boolean boolValueOf17 = Boolean.valueOf(bottomSheetState.getVisible());
                    i46 = i45 & 14;
                    if (i46 != 4) {
                        if ((i45 & 8) != 0) {
                            c10978m0 = bottomSheetState;
                            if (c28655q3.m87157i(c10978m0)) {
                            }
                            boolean zM87155h116 = z45 | c28655q3.m87155h(z28);
                            z46 = z28;
                            f14 = f13;
                            zM87147d = zM87155h116 | c28655q3.m87147d(f14);
                            objM87133R21 = c28655q3.m87133R();
                            if (zM87147d) {
                                objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                                f15 = f14;
                                c28655q3.m87172p0(objM87133R21);
                            } else {
                                objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                                f15 = f14;
                                c28655q3.m87172p0(objM87133R21);
                            }
                            AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R21, boolValueOf17);
                            Float fValueOf18 = Float.valueOf(f15);
                            if (i46 != 4) {
                                z47 = true;
                            } else {
                                z47 = true;
                            }
                            zM87147d2 = z47 | c28655q3.m87147d(f15);
                            objM87133R22 = c28655q3.m87133R();
                            if (zM87147d2) {
                                objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                                c28655q3.m87172p0(objM87133R22);
                            } else {
                                objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                                c28655q3.m87172p0(objM87133R22);
                            }
                            AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R22, fValueOf18);
                            Boolean boolValueOf18 = Boolean.valueOf(z39);
                            boolean zM87155h117 = c28655q3.m87155h(z39);
                            if (i46 != 4) {
                                z48 = true;
                            } else {
                                z48 = true;
                            }
                            z49 = zM87155h117 | z48;
                            objM87133R23 = c28655q3.m87133R();
                            if (z49) {
                                objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                                c28655q3.m87172p0(objM87133R23);
                            } else {
                                objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                                c28655q3.m87172p0(objM87133R23);
                            }
                            AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R23, boolValueOf18);
                            boolean zM29243k13 = bottomSheetState.getVisible();
                            zM87155h = c28655q3.m87155h(z29) | c28655q3.m87147d(f15) | c28655q3.m87157i(interfaceC2994c6) | ((i45 & 112) == 32);
                            objM87133R24 = c28655q3.m87133R();
                            if (zM87155h) {
                                final InterfaceC2994c0 interfaceC2994c1111 = interfaceC2994c6;
                                final boolean z5111116 = z29;
                                final float f11110 = f15;
                                objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC10969j0.m29210y0(z5111116, f11110, interfaceC2994c1111, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                                    }
                                };
                                c28655q3.m87172p0(objM87133R24);
                            } else {
                                final InterfaceC2994c0 interfaceC2994c1112 = interfaceC2994c6;
                                final boolean z5111117 = z29;
                                final float f11111 = f15;
                                objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC10969j0.m29210y0(z5111117, f11111, interfaceC2994c1112, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                                    }
                                };
                                c28655q3.m87172p0(objM87133R24);
                            }
                            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R24, zM29243k13, c28655q3, 0, 0);
                            if (bottomSheetState.getVisible()) {
                            }
                            InterfaceC4351m interfaceC4351m11114 = interfaceC4351m12;
                            final boolean z5111118 = z24;
                            final InterfaceC4340b interfaceC4340b17 = interfaceC4340b3;
                            C28673u1[] c28673u1Arr13 = {f34074a.mo86977a(Boolean.valueOf(bottomSheetState.getVisible())), f34075b.mo86977a(m29159b0(interfaceC28601c5)), f34076c.mo86977a(c11011y5)};
                            final Function3 function113 = function8;
                            final C10962h c10962h14 = c10962h;
                            final InterfaceC28601c1 interfaceC28601c11111 = interfaceC28601c8;
                            final InterfaceC39171c interfaceC39171c15 = interfaceC39171c2;
                            final boolean z5111119 = z29;
                            AbstractC28683x.m87248b(c28673u1Arr13, AbstractC37817c.m121344e(1438636126, c28655q3, new InterfaceC4351m() { // from class: cp0.h0
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC10969j0.m29104A0(interfaceC39171c15, zIsFeatureEnabled6, bottomSheetState, c32645n4, z5111119, c10962h14, c11011y5, z5111118, onDismiss, function113, interfaceC4340b17, interfaceC28690z2, interfaceC28670t2M30588b, interfaceC28670t2M30588b6, interfaceC28601c5, interfaceC28601c7, interfaceC28601c11110, interfaceC28601c2, interfaceC28601c11111, interfaceC28601c1117, interfaceC28601c1118, interfaceC28601c3, interfaceC28601c1119, interfaceC28601c4, (Composer) obj, iIntValue);
                                }
                            }), c28655q3, 56);
                            c28655q = c28655q3;
                            z16 = z5111118;
                            interfaceC4340b2 = interfaceC4340b17;
                            function6 = function113;
                            interfaceC2994c2 = interfaceC2994c6;
                            z17 = z38;
                            interfaceC4351m4 = interfaceC4351m11114;
                            interfaceC4351m5 = interfaceC4351m11;
                            function5 = function7;
                            interfaceC40915c2 = interfaceC40915c8;
                            c4656v1 = c4656v2;
                        } else {
                            c10978m0 = bottomSheetState;
                        }
                        interfaceC39171c2 = interfaceC39171c;
                        z45 = false;
                        boolean zM87155h118 = z45 | c28655q3.m87155h(z28);
                        z46 = z28;
                        f14 = f13;
                        zM87147d = zM87155h118 | c28655q3.m87147d(f14);
                        objM87133R21 = c28655q3.m87133R();
                        if (zM87147d) {
                            objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                            f15 = f14;
                            c28655q3.m87172p0(objM87133R21);
                        } else {
                            objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                            f15 = f14;
                            c28655q3.m87172p0(objM87133R21);
                        }
                        AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R21, boolValueOf17);
                        Float fValueOf19 = Float.valueOf(f15);
                        if (i46 != 4) {
                            z47 = true;
                        } else {
                            z47 = true;
                        }
                        zM87147d2 = z47 | c28655q3.m87147d(f15);
                        objM87133R22 = c28655q3.m87133R();
                        if (zM87147d2) {
                            objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                            c28655q3.m87172p0(objM87133R22);
                        } else {
                            objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                            c28655q3.m87172p0(objM87133R22);
                        }
                        AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R22, fValueOf19);
                        Boolean boolValueOf19 = Boolean.valueOf(z39);
                        boolean zM87155h119 = c28655q3.m87155h(z39);
                        if (i46 != 4) {
                            z48 = true;
                        } else {
                            z48 = true;
                        }
                        z49 = zM87155h119 | z48;
                        objM87133R23 = c28655q3.m87133R();
                        if (z49) {
                            objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                            c28655q3.m87172p0(objM87133R23);
                        } else {
                            objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                            c28655q3.m87172p0(objM87133R23);
                        }
                        AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R23, boolValueOf19);
                        boolean zM29243k14 = bottomSheetState.getVisible();
                        zM87155h = c28655q3.m87155h(z29) | c28655q3.m87147d(f15) | c28655q3.m87157i(interfaceC2994c6) | ((i45 & 112) == 32);
                        objM87133R24 = c28655q3.m87133R();
                        if (zM87155h) {
                            final InterfaceC2994c0 interfaceC2994c1113 = interfaceC2994c6;
                            final boolean z51111110 = z29;
                            final float f11112 = f15;
                            objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC10969j0.m29210y0(z51111110, f11112, interfaceC2994c1113, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                                }
                            };
                            c28655q3.m87172p0(objM87133R24);
                        } else {
                            final InterfaceC2994c0 interfaceC2994c1114 = interfaceC2994c6;
                            final boolean z51111111 = z29;
                            final float f11113 = f15;
                            objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC10969j0.m29210y0(z51111111, f11113, interfaceC2994c1114, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                                }
                            };
                            c28655q3.m87172p0(objM87133R24);
                        }
                        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R24, zM29243k14, c28655q3, 0, 0);
                        if (bottomSheetState.getVisible()) {
                        }
                        InterfaceC4351m interfaceC4351m11115 = interfaceC4351m12;
                        final boolean z51111112 = z24;
                        final InterfaceC4340b interfaceC4340b18 = interfaceC4340b3;
                        C28673u1[] c28673u1Arr14 = {f34074a.mo86977a(Boolean.valueOf(bottomSheetState.getVisible())), f34075b.mo86977a(m29159b0(interfaceC28601c5)), f34076c.mo86977a(c11011y5)};
                        final Function3 function114 = function8;
                        final C10962h c10962h15 = c10962h;
                        final InterfaceC28601c1 interfaceC28601c11112 = interfaceC28601c8;
                        final InterfaceC39171c interfaceC39171c16 = interfaceC39171c2;
                        final boolean z51111113 = z29;
                        AbstractC28683x.m87248b(c28673u1Arr14, AbstractC37817c.m121344e(1438636126, c28655q3, new InterfaceC4351m() { // from class: cp0.h0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC10969j0.m29104A0(interfaceC39171c16, zIsFeatureEnabled6, bottomSheetState, c32645n4, z51111113, c10962h15, c11011y5, z51111112, onDismiss, function114, interfaceC4340b18, interfaceC28690z2, interfaceC28670t2M30588b, interfaceC28670t2M30588b6, interfaceC28601c5, interfaceC28601c7, interfaceC28601c11110, interfaceC28601c2, interfaceC28601c11112, interfaceC28601c1117, interfaceC28601c1118, interfaceC28601c3, interfaceC28601c1119, interfaceC28601c4, (Composer) obj, iIntValue);
                            }
                        }), c28655q3, 56);
                        c28655q = c28655q3;
                        z16 = z51111112;
                        interfaceC4340b2 = interfaceC4340b18;
                        function6 = function114;
                        interfaceC2994c2 = interfaceC2994c6;
                        z17 = z38;
                        interfaceC4351m4 = interfaceC4351m11115;
                        interfaceC4351m5 = interfaceC4351m11;
                        function5 = function7;
                        interfaceC40915c2 = interfaceC40915c8;
                        c4656v1 = c4656v2;
                    } else {
                        c10978m0 = bottomSheetState;
                    }
                    interfaceC39171c2 = interfaceC39171c;
                    z45 = true;
                    boolean zM87155h1110 = z45 | c28655q3.m87155h(z28);
                    z46 = z28;
                    f14 = f13;
                    zM87147d = zM87155h1110 | c28655q3.m87147d(f14);
                    objM87133R21 = c28655q3.m87133R();
                    if (zM87147d) {
                        objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                        f15 = f14;
                        c28655q3.m87172p0(objM87133R21);
                    } else {
                        objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                        f15 = f14;
                        c28655q3.m87172p0(objM87133R21);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R21, boolValueOf17);
                    Float fValueOf110 = Float.valueOf(f15);
                    if (i46 != 4) {
                        z47 = true;
                    } else {
                        z47 = true;
                    }
                    zM87147d2 = z47 | c28655q3.m87147d(f15);
                    objM87133R22 = c28655q3.m87133R();
                    if (zM87147d2) {
                        objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                        c28655q3.m87172p0(objM87133R22);
                    } else {
                        objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                        c28655q3.m87172p0(objM87133R22);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R22, fValueOf110);
                    Boolean boolValueOf110 = Boolean.valueOf(z39);
                    boolean zM87155h1111 = c28655q3.m87155h(z39);
                    if (i46 != 4) {
                        z48 = true;
                    } else {
                        z48 = true;
                    }
                    z49 = zM87155h1111 | z48;
                    objM87133R23 = c28655q3.m87133R();
                    if (z49) {
                        objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                        c28655q3.m87172p0(objM87133R23);
                    } else {
                        objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                        c28655q3.m87172p0(objM87133R23);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R23, boolValueOf110);
                    boolean zM29243k15 = bottomSheetState.getVisible();
                    zM87155h = c28655q3.m87155h(z29) | c28655q3.m87147d(f15) | c28655q3.m87157i(interfaceC2994c6) | ((i45 & 112) == 32);
                    objM87133R24 = c28655q3.m87133R();
                    if (zM87155h) {
                        final InterfaceC2994c0 interfaceC2994c1115 = interfaceC2994c6;
                        final boolean z51111114 = z29;
                        final float f11114 = f15;
                        objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC10969j0.m29210y0(z51111114, f11114, interfaceC2994c1115, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                            }
                        };
                        c28655q3.m87172p0(objM87133R24);
                    } else {
                        final InterfaceC2994c0 interfaceC2994c1116 = interfaceC2994c6;
                        final boolean z51111115 = z29;
                        final float f11115 = f15;
                        objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC10969j0.m29210y0(z51111115, f11115, interfaceC2994c1116, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                            }
                        };
                        c28655q3.m87172p0(objM87133R24);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R24, zM29243k15, c28655q3, 0, 0);
                    if (bottomSheetState.getVisible()) {
                    }
                    InterfaceC4351m interfaceC4351m11116 = interfaceC4351m12;
                    final boolean z51111116 = z24;
                    final InterfaceC4340b interfaceC4340b19 = interfaceC4340b3;
                    C28673u1[] c28673u1Arr15 = {f34074a.mo86977a(Boolean.valueOf(bottomSheetState.getVisible())), f34075b.mo86977a(m29159b0(interfaceC28601c5)), f34076c.mo86977a(c11011y5)};
                    final Function3 function115 = function8;
                    final C10962h c10962h16 = c10962h;
                    final InterfaceC28601c1 interfaceC28601c11113 = interfaceC28601c8;
                    final InterfaceC39171c interfaceC39171c17 = interfaceC39171c2;
                    final boolean z51111117 = z29;
                    AbstractC28683x.m87248b(c28673u1Arr15, AbstractC37817c.m121344e(1438636126, c28655q3, new InterfaceC4351m() { // from class: cp0.h0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC10969j0.m29104A0(interfaceC39171c17, zIsFeatureEnabled6, bottomSheetState, c32645n4, z51111117, c10962h16, c11011y5, z51111116, onDismiss, function115, interfaceC4340b19, interfaceC28690z2, interfaceC28670t2M30588b, interfaceC28670t2M30588b6, interfaceC28601c5, interfaceC28601c7, interfaceC28601c11110, interfaceC28601c2, interfaceC28601c11113, interfaceC28601c1117, interfaceC28601c1118, interfaceC28601c3, interfaceC28601c1119, interfaceC28601c4, (Composer) obj, iIntValue);
                        }
                    }), c28655q3, 56);
                    c28655q = c28655q3;
                    z16 = z51111116;
                    interfaceC4340b2 = interfaceC4340b19;
                    function6 = function115;
                    interfaceC2994c2 = interfaceC2994c6;
                    z17 = z38;
                    interfaceC4351m4 = interfaceC4351m11116;
                    interfaceC4351m5 = interfaceC4351m11;
                    function5 = function7;
                    interfaceC40915c2 = interfaceC40915c8;
                    c4656v1 = c4656v2;
                } else {
                    c28655q4.m87138X();
                    z16 = z13;
                    interfaceC4340b2 = interfaceC4340b;
                    c28655q = c28655q4;
                    function5 = function2;
                    function6 = function4;
                    z17 = z14;
                    interfaceC2994c2 = interfaceC2994c1;
                    interfaceC4351m4 = interfaceC4351m3;
                    interfaceC4351m5 = interfaceC4351m2;
                    c4656v1 = c4656v3;
                    interfaceC40915c2 = interfaceC40915c;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i51116 = 1;
                    interfaceC4351m6 = new InterfaceC4351m() { // from class: cp0.g0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            Composer composer2 = (Composer) obj;
                            switch (i51116) {
                                case 0:
                                    return AbstractC10969j0.m29212z0(bottomSheetState, onDismiss, interfaceC40915c2, interfaceC2994c2, function5, function6, z17, interfaceC4351m4, interfaceC4351m5, z16, c4656v1, interfaceC4340b2, i13, i14, i15, composer2, ((Integer) obj2).intValue());
                                default:
                                    return AbstractC10969j0.m29126L0(bottomSheetState, onDismiss, interfaceC40915c2, interfaceC2994c2, function5, function6, z17, interfaceC4351m4, interfaceC4351m5, z16, c4656v1, interfaceC4340b2, i13, i14, i15, composer2, ((Integer) obj2).intValue());
                            }
                        }
                    };
                    c28677v1 = c28677v1M87180u;
                    c28677v1.f115982d = interfaceC4351m6;
                }
            }
            i36 |= 48;
            if ((i16 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (c28655q4.m87135U(i16 & 1, z15)) {
                c28655q4.m87140Z();
                i44 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i44 != 0) {
                    if (i48 != 0) {
                        interfaceC40915c3 = null;
                    } else {
                        interfaceC40915c3 = interfaceC40915c;
                    }
                    if ((i15 & 8) != 0) {
                        objM87133R3 = c28655q4.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87262p(c28655q4);
                            c28655q4.m87172p0(objM87133R3);
                        }
                        interfaceC2994c3 = (InterfaceC2994c0) objM87133R3;
                        i16 &= -7169;
                    } else {
                        interfaceC2994c3 = interfaceC2994c1;
                    }
                    if (i49 != 0) {
                        function2 = null;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    }
                    if (i19 != 0) {
                        z14 = false;
                    }
                    if (i25 != 0) {
                        objM87133R2 = c28655q4.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C4139w0(7);
                            c28655q4.m87172p0(objM87133R2);
                        }
                        interfaceC4351m7 = (InterfaceC4351m) objM87133R2;
                    } else {
                        interfaceC4351m7 = interfaceC4351m3;
                    }
                    if (i27 != 0) {
                        objM87133R = c28655q4.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C4139w0(8);
                            c28655q4.m87172p0(objM87133R);
                        }
                        interfaceC4351m8 = (InterfaceC4351m) objM87133R;
                    } else {
                        interfaceC4351m8 = interfaceC4351m2;
                    }
                    if (i29 != 0) {
                        z18 = false;
                    } else {
                        z18 = z13;
                    }
                    if (i35 != 0) {
                        c4656v3 = null;
                    }
                    if (i38 != 0) {
                        str = null;
                        C37816b c37816bM121344e15 = AbstractC37817c.m121344e(-633821104, c28655q4, new InterfaceC4340b() { // from class: cp0.i0
                            @Override // c93.InterfaceC4340b
                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
                                int iIntValue = ((Integer) obj10).intValue();
                                return AbstractC10969j0.m29137R(interfaceC40915c3, bottomSheetState, z18, c4656v3, (C32645n0) obj, (InterfaceC4339a) obj2, (InterfaceC4353o) obj3, (Function1) obj4, (Function1) obj5, (InterfaceC4339a) obj6, (String) obj7, (Function3) obj8, (C28655q) ((Composer) obj9), iIntValue);
                            }
                        });
                        c4656v2 = c4656v3;
                        i45 = i16;
                        function7 = function2;
                        function8 = function4;
                        interfaceC2994c4 = interfaceC2994c3;
                        z19 = z14;
                        interfaceC4351m9 = interfaceC4351m7;
                        interfaceC4351m10 = interfaceC4351m8;
                        z24 = z18;
                        interfaceC4340b3 = c37816bM121344e15;
                    } else {
                        str = null;
                        interfaceC4340b3 = interfaceC4340b;
                        c4656v2 = c4656v3;
                        i45 = i16;
                        function7 = function2;
                        function8 = function4;
                        interfaceC2994c4 = interfaceC2994c3;
                        z19 = z14;
                        interfaceC4351m9 = interfaceC4351m7;
                        interfaceC4351m10 = interfaceC4351m8;
                        z24 = z18;
                    }
                } else {
                    if (i48 != 0) {
                        interfaceC40915c3 = null;
                    } else {
                        interfaceC40915c3 = interfaceC40915c;
                    }
                    if ((i15 & 8) != 0) {
                        objM87133R3 = c28655q4.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87262p(c28655q4);
                            c28655q4.m87172p0(objM87133R3);
                        }
                        interfaceC2994c3 = (InterfaceC2994c0) objM87133R3;
                        i16 &= -7169;
                    } else {
                        interfaceC2994c3 = interfaceC2994c1;
                    }
                    if (i49 != 0) {
                        function2 = null;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    }
                    if (i19 != 0) {
                        z14 = false;
                    }
                    if (i25 != 0) {
                        objM87133R2 = c28655q4.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C4139w0(7);
                            c28655q4.m87172p0(objM87133R2);
                        }
                        interfaceC4351m7 = (InterfaceC4351m) objM87133R2;
                    } else {
                        interfaceC4351m7 = interfaceC4351m3;
                    }
                    if (i27 != 0) {
                        objM87133R = c28655q4.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C4139w0(8);
                            c28655q4.m87172p0(objM87133R);
                        }
                        interfaceC4351m8 = (InterfaceC4351m) objM87133R;
                    } else {
                        interfaceC4351m8 = interfaceC4351m2;
                    }
                    if (i29 != 0) {
                        z18 = false;
                    } else {
                        z18 = z13;
                    }
                    if (i35 != 0) {
                        c4656v3 = null;
                    }
                    if (i38 != 0) {
                        str = null;
                        C37816b c37816bM121344e16 = AbstractC37817c.m121344e(-633821104, c28655q4, new InterfaceC4340b() { // from class: cp0.i0
                            @Override // c93.InterfaceC4340b
                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
                                int iIntValue = ((Integer) obj10).intValue();
                                return AbstractC10969j0.m29137R(interfaceC40915c3, bottomSheetState, z18, c4656v3, (C32645n0) obj, (InterfaceC4339a) obj2, (InterfaceC4353o) obj3, (Function1) obj4, (Function1) obj5, (InterfaceC4339a) obj6, (String) obj7, (Function3) obj8, (C28655q) ((Composer) obj9), iIntValue);
                            }
                        });
                        c4656v2 = c4656v3;
                        i45 = i16;
                        function7 = function2;
                        function8 = function4;
                        interfaceC2994c4 = interfaceC2994c3;
                        z19 = z14;
                        interfaceC4351m9 = interfaceC4351m7;
                        interfaceC4351m10 = interfaceC4351m8;
                        z24 = z18;
                        interfaceC4340b3 = c37816bM121344e16;
                    } else {
                        str = null;
                        interfaceC4340b3 = interfaceC4340b;
                        c4656v2 = c4656v3;
                        i45 = i16;
                        function7 = function2;
                        function8 = function4;
                        interfaceC2994c4 = interfaceC2994c3;
                        z19 = z14;
                        interfaceC4351m9 = interfaceC4351m7;
                        interfaceC4351m10 = interfaceC4351m8;
                        z24 = z18;
                    }
                }
                c28655q4.m87175r();
                zM87153g = c28655q4.m87153g(bottomSheetState.getScreenContext());
                objM87133R4 = c28655q4.m87133R();
                if (zM87153g) {
                    objM87133R4 = m29172f1(bottomSheetState.getScreenContext());
                    c28655q4.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = m29172f1(bottomSheetState.getScreenContext());
                    c28655q4.m87172p0(objM87133R4);
                }
                final C32645n0 c32645n5 = (C32645n0) objM87133R4;
                FeatureFlagChecker featureFlagChecker6 = (FeatureFlagChecker) c28655q4.m87161k(AbstractC38073e.m121968p());
                C10978m0.Companion aVar6 = C10978m0.INSTANCE;
                zM29247c = aVar6.m29247c(bottomSheetState.getScreenContext());
                zM29246b = aVar6.m29246b(bottomSheetState.getCustomDrawerPresentation(), bottomSheetState.getShouldOpenFullSize(), zM29247c, bottomSheetState.getReadOnlyHalfSheet());
                final boolean zIsFeatureEnabled7 = featureFlagChecker6.isFeatureEnabled("wce-padding-keyboard-fix");
                zIsFeatureEnabled = featureFlagChecker6.isFeatureEnabled("context-hub-profile");
                Set setM74059b6 = AbstractC25260n.m74059b1(new String[]{"CONTEXT_HUB", "CONTEXT_DETAILS"});
                c13404jM29240h = bottomSheetState.getScreenContext();
                if (c13404jM29240h != null) {
                    screenId = c13404jM29240h.getScreenId();
                } else {
                    screenId = str;
                }
                zM74155w0 = AbstractC25265s.m74155w0(setM74059b6, screenId);
                objM87133R5 = c28655q4.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(str);
                    c28655q4.m87172p0(objM87133R5);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                objM87133R6 = c28655q4.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC28683x.m87272z(str);
                    c28655q4.m87172p0(objM87133R6);
                }
                final InterfaceC28601c1 interfaceC28601c11114 = (InterfaceC28601c1) objM87133R6;
                objM87133R7 = c28655q4.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC28683x.m87272z(str);
                    c28655q4.m87172p0(objM87133R7);
                }
                final InterfaceC28601c1 interfaceC28601c11115 = (InterfaceC28601c1) objM87133R7;
                objM87133R8 = c28655q4.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = AbstractC28683x.m87272z("");
                    c28655q4.m87172p0(objM87133R8);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R8;
                final InterfaceC40915c interfaceC40915c9 = interfaceC40915c3;
                objM87133R9 = c28655q4.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = AbstractC28683x.m87272z(Boolean.TRUE);
                    c28655q4.m87172p0(objM87133R9);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R9;
                objM87133R10 = c28655q4.m87133R();
                if (objM87133R10 == c28676v0) {
                    objM87133R10 = AbstractC28683x.m87272z(Boolean.TRUE);
                    c28655q4.m87172p0(objM87133R10);
                }
                final InterfaceC28601c1 interfaceC28601c11116 = (InterfaceC28601c1) objM87133R10;
                objM87133R11 = c28655q4.m87133R();
                if (objM87133R11 == c28676v0) {
                    objM87133R11 = AbstractC28683x.m87272z(Boolean.TRUE);
                    c28655q4.m87172p0(objM87133R11);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R11;
                if (zIsFeatureEnabled) {
                    z25 = zM74155w0;
                } else {
                    z25 = true;
                }
                if (m29143U(interfaceC28601c4)) {
                    z26 = false;
                } else {
                    z26 = false;
                }
                if (zIsFeatureEnabled) {
                    z27 = false;
                } else {
                    z27 = false;
                }
                if (m29133P(interfaceC28601c3)) {
                    c28655q4.m87150e0(2094451546);
                    C37816b c37816bM121344e17 = AbstractC37817c.m121344e(36773779, c28655q4, new C0003a0(19, interfaceC28601c2, interfaceC28601c1));
                    c28655q4.m87173q(false);
                    r10 = c37816bM121344e17;
                } else {
                    c28655q4.m87150e0(2094652488);
                    c28655q4.m87173q(false);
                    r10 = str;
                }
                final boolean z5126 = z27;
                final boolean z5127 = z26;
                c10962h = new C10962h(r10, AbstractC37817c.m121344e(-582148231, c28655q4, new InterfaceC4351m() { // from class: cp0.b0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC10969j0.m29151Y(z5127, z5126, zIsFeatureEnabled, interfaceC28601c11114, interfaceC28601c11115, (Composer) obj, iIntValue);
                    }
                }));
                c10962hM29242j = bottomSheetState.getToolbarContent();
                if (c10962hM29242j == null) {
                    c10962h = c10962hM29242j;
                } else if (zM29247c) {
                    ?? r19 = str;
                    c10962h = new C10962h(r19, r19, 3, r19);
                }
                fM29245a = aVar6.m29245a(bottomSheetState.getCustomDrawerPresentation());
                objM87133R12 = c28655q4.m87133R();
                if (objM87133R12 == c28676v0) {
                    objM87133R12 = AbstractC28683x.m87272z(bottomSheetState.getInitialSheetState());
                    c28655q4.m87172p0(objM87133R12);
                }
                interfaceC28601c5 = (InterfaceC28601c1) objM87133R12;
                objM87133R13 = c28655q4.m87133R();
                if (objM87133R13 == c28676v0) {
                    objM87133R13 = AbstractC28683x.m87272z(bottomSheetState.getInitialSheetState());
                    c28655q4.m87172p0(objM87133R13);
                }
                interfaceC28601c6 = (InterfaceC28601c1) objM87133R13;
                objM87133R14 = c28655q4.m87133R();
                if (objM87133R14 == c28676v0) {
                    objM87133R14 = AbstractC11266d.m30468v(bottomSheetState.getInitialHeightFraction(), c28655q4);
                }
                interfaceC28690z0 = (InterfaceC28690z0) objM87133R14;
                objM87133R15 = c28655q4.m87133R();
                if (objM87133R15 == c28676v0) {
                    if (bottomSheetState.getInitialSheetState() == EnumC11003u1.Hidden) {
                        f16 = 0.0f;
                    } else {
                        f16 = 1.0f;
                    }
                    objM87133R15 = AbstractC11266d.m30468v(f16, c28655q4);
                }
                interfaceC28690z1 = (InterfaceC28690z0) objM87133R15;
                objM87133R16 = c28655q4.m87133R();
                if (objM87133R16 == c28676v0) {
                    objM87133R16 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q4.m87172p0(objM87133R16);
                }
                interfaceC28601c7 = (InterfaceC28601c1) objM87133R16;
                objM87133R17 = c28655q4.m87133R();
                if (objM87133R17 == c28676v0) {
                    objM87133R17 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q4.m87172p0(objM87133R17);
                }
                final InterfaceC28601c1 interfaceC28601c11117 = (InterfaceC28601c1) objM87133R17;
                objM87133R18 = c28655q4.m87133R();
                if (objM87133R18 == c28676v0) {
                    objM87133R18 = AbstractC11266d.m30468v(0.0f, c28655q4);
                }
                interfaceC28690z2 = (InterfaceC28690z0) objM87133R18;
                zM87153g2 = c28655q4.m87153g(interfaceC2994c4);
                interfaceC2994c5 = interfaceC2994c4;
                Object objM87133R210 = c28655q4.m87133R();
                if (zM87153g2) {
                    final int i51117 = 0;
                    final int i51118 = 1;
                    final int i51119 = 2;
                    interfaceC28601c8 = interfaceC28601c1;
                    z28 = zM29246b;
                    f13 = fM29245a;
                    c28676v1 = c28676v0;
                    interfaceC2994c6 = interfaceC2994c5;
                    c28655q2 = c28655q4;
                    z29 = zM29247c;
                    c11011y0 = new C11011y0(interfaceC2994c6, z29, new InterfaceC4339a() { // from class: cp0.c0
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            float fM29188n0;
                            switch (i51117) {
                                case 0:
                                    fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z2);
                                    break;
                                case 1:
                                    fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z2);
                                    break;
                                default:
                                    fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z2);
                                    break;
                            }
                            return Float.valueOf(fM29188n0);
                        }
                    }, new C10992r(1, interfaceC28601c5), new InterfaceC4339a() { // from class: cp0.c0
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            float fM29188n0;
                            switch (i51118) {
                                case 0:
                                    fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z1);
                                    break;
                                case 1:
                                    fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z1);
                                    break;
                                default:
                                    fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z1);
                                    break;
                            }
                            return Float.valueOf(fM29188n0);
                        }
                    }, new InterfaceC4339a() { // from class: cp0.c0
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            float fM29188n0;
                            switch (i51119) {
                                case 0:
                                    fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z0);
                                    break;
                                case 1:
                                    fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z0);
                                    break;
                                default:
                                    fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z0);
                                    break;
                            }
                            return Float.valueOf(fM29188n0);
                        }
                    }, new C10975l0(interfaceC28690z1, 3), new C10975l0(interfaceC28690z0, 4), new C10972k0(7, interfaceC28601c5), new C10972k0(11, interfaceC28601c7), onDismiss);
                    c28655q2.m87172p0(c11011y0);
                } else {
                    final int i511110 = 0;
                    final int i511111 = 1;
                    final int i511112 = 2;
                    interfaceC28601c8 = interfaceC28601c1;
                    z28 = zM29246b;
                    f13 = fM29245a;
                    c28676v1 = c28676v0;
                    interfaceC2994c6 = interfaceC2994c5;
                    c28655q2 = c28655q4;
                    z29 = zM29247c;
                    c11011y0 = new C11011y0(interfaceC2994c6, z29, new InterfaceC4339a() { // from class: cp0.c0
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            float fM29188n0;
                            switch (i511110) {
                                case 0:
                                    fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z2);
                                    break;
                                case 1:
                                    fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z2);
                                    break;
                                default:
                                    fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z2);
                                    break;
                            }
                            return Float.valueOf(fM29188n0);
                        }
                    }, new C10992r(1, interfaceC28601c5), new InterfaceC4339a() { // from class: cp0.c0
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            float fM29188n0;
                            switch (i511111) {
                                case 0:
                                    fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z1);
                                    break;
                                case 1:
                                    fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z1);
                                    break;
                                default:
                                    fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z1);
                                    break;
                            }
                            return Float.valueOf(fM29188n0);
                        }
                    }, new InterfaceC4339a() { // from class: cp0.c0
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            float fM29188n0;
                            switch (i511112) {
                                case 0:
                                    fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z0);
                                    break;
                                case 1:
                                    fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z0);
                                    break;
                                default:
                                    fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z0);
                                    break;
                            }
                            return Float.valueOf(fM29188n0);
                        }
                    }, new C10975l0(interfaceC28690z1, 3), new C10975l0(interfaceC28690z0, 4), new C10972k0(7, interfaceC28601c5), new C10972k0(11, interfaceC28601c7), onDismiss);
                    c28655q2.m87172p0(c11011y0);
                }
                final C11011y0 c11011y6 = (C11011y0) c11011y0;
                c13404jM29240h2 = bottomSheetState.getScreenContext();
                if (c13404jM29240h2 != null) {
                    source = "";
                } else {
                    source = "";
                }
                EnumC11003u1 enumC11003u1M29159b5 = m29159b0(interfaceC28601c5);
                if ((i45 & 234881024) == 67108864) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                boolean zM87153g9 = z34 | c28655q2.m87153g(source);
                if ((i45 & 3670016) == 1048576) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                boolean z5212 = zM87153g9 | z35;
                if ((i45 & 29360128) == 8388608) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                z37 = z5212 | z36;
                objM87133R19 = c28655q2.m87133R();
                if (z37) {
                    boolean z5213 = z19;
                    InterfaceC4351m interfaceC4351m11117 = interfaceC4351m9;
                    InterfaceC4351m interfaceC4351m11118 = interfaceC4351m10;
                    objM87133R19 = new a(interfaceC4351m11118, source, z5213, interfaceC4351m11117, interfaceC28601c6, interfaceC28601c5, null);
                    interfaceC4351m11 = interfaceC4351m11118;
                    interfaceC4351m12 = interfaceC4351m11117;
                    z38 = z5213;
                    c28655q2.m87172p0(objM87133R19);
                } else {
                    boolean z5214 = z19;
                    InterfaceC4351m interfaceC4351m11119 = interfaceC4351m9;
                    InterfaceC4351m interfaceC4351m111110 = interfaceC4351m10;
                    objM87133R19 = new a(interfaceC4351m111110, source, z5214, interfaceC4351m11119, interfaceC28601c6, interfaceC28601c5, null);
                    interfaceC4351m11 = interfaceC4351m111110;
                    interfaceC4351m12 = interfaceC4351m11119;
                    z38 = z5214;
                    c28655q2.m87172p0(objM87133R19);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R19, enumC11003u1M29159b5);
                float fM29171f5 = m29171f0(interfaceC28690z0);
                if (m29180j0(interfaceC28601c7)) {
                    c11347e2M30574v = AbstractC11348f.m30574v(0, 0, null, 6);
                } else {
                    c11347e2M30574v = AbstractC11348f.m30574v(300, 0, null, 6);
                }
                c28655q3 = c28655q2;
                final InterfaceC28670t2 interfaceC28670t2M30588b7 = AbstractC11352g.m30588b(fM29171f5, c11347e2M30574v, "bottomSheetHeight", null, c28655q3, 3072, 20);
                interfaceC39171c = (InterfaceC39171c) c28655q3.m87161k(AbstractC2453v1.f9569h);
                if (bottomSheetState.getImeHeightPx() > 0) {
                    z39 = true;
                } else {
                    z39 = false;
                }
                float fM29176h5 = m29176h0(interfaceC28690z1);
                if (m29180j0(interfaceC28601c7)) {
                    c11347e2M30574v2 = AbstractC11348f.m30574v(0, 0, null, 6);
                } else {
                    c11347e2M30574v2 = AbstractC11348f.m30574v(300, 0, null, 6);
                }
                interfaceC28670t2M30588b = AbstractC11352g.m30588b(fM29176h5, c11347e2M30574v2, "heroProgress", null, c28655q3, 3072, 20);
                Float fValueOf111 = Float.valueOf(m29208x0(interfaceC28670t2M30588b));
                if ((i45 & 57344) == 16384) {
                    z44 = true;
                } else {
                    z44 = false;
                }
                zM87153g3 = z44 | c28655q3.m87153g(interfaceC28670t2M30588b);
                objM87133R20 = c28655q3.m87133R();
                if (zM87153g3) {
                    objM87133R20 = new b(function7, interfaceC28670t2M30588b, null);
                    c28655q3.m87172p0(objM87133R20);
                } else {
                    objM87133R20 = new b(function7, interfaceC28670t2M30588b, null);
                    c28655q3.m87172p0(objM87133R20);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R20, fValueOf111);
                Boolean boolValueOf111 = Boolean.valueOf(bottomSheetState.getVisible());
                i46 = i45 & 14;
                if (i46 != 4) {
                    if ((i45 & 8) != 0) {
                        c10978m0 = bottomSheetState;
                        if (c28655q3.m87157i(c10978m0)) {
                        }
                        boolean zM87155h1112 = z45 | c28655q3.m87155h(z28);
                        z46 = z28;
                        f14 = f13;
                        zM87147d = zM87155h1112 | c28655q3.m87147d(f14);
                        objM87133R21 = c28655q3.m87133R();
                        if (zM87147d) {
                            objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                            f15 = f14;
                            c28655q3.m87172p0(objM87133R21);
                        } else {
                            objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                            f15 = f14;
                            c28655q3.m87172p0(objM87133R21);
                        }
                        AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R21, boolValueOf111);
                        Float fValueOf112 = Float.valueOf(f15);
                        if (i46 != 4) {
                            z47 = true;
                        } else {
                            z47 = true;
                        }
                        zM87147d2 = z47 | c28655q3.m87147d(f15);
                        objM87133R22 = c28655q3.m87133R();
                        if (zM87147d2) {
                            objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                            c28655q3.m87172p0(objM87133R22);
                        } else {
                            objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                            c28655q3.m87172p0(objM87133R22);
                        }
                        AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R22, fValueOf112);
                        Boolean boolValueOf112 = Boolean.valueOf(z39);
                        boolean zM87155h1113 = c28655q3.m87155h(z39);
                        if (i46 != 4) {
                            z48 = true;
                        } else {
                            z48 = true;
                        }
                        z49 = zM87155h1113 | z48;
                        objM87133R23 = c28655q3.m87133R();
                        if (z49) {
                            objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                            c28655q3.m87172p0(objM87133R23);
                        } else {
                            objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                            c28655q3.m87172p0(objM87133R23);
                        }
                        AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R23, boolValueOf112);
                        boolean zM29243k16 = bottomSheetState.getVisible();
                        zM87155h = c28655q3.m87155h(z29) | c28655q3.m87147d(f15) | c28655q3.m87157i(interfaceC2994c6) | ((i45 & 112) == 32);
                        objM87133R24 = c28655q3.m87133R();
                        if (zM87155h) {
                            final InterfaceC2994c0 interfaceC2994c1117 = interfaceC2994c6;
                            final boolean z51111118 = z29;
                            final float f11116 = f15;
                            objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC10969j0.m29210y0(z51111118, f11116, interfaceC2994c1117, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                                }
                            };
                            c28655q3.m87172p0(objM87133R24);
                        } else {
                            final InterfaceC2994c0 interfaceC2994c1118 = interfaceC2994c6;
                            final boolean z51111119 = z29;
                            final float f11117 = f15;
                            objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC10969j0.m29210y0(z51111119, f11117, interfaceC2994c1118, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                                }
                            };
                            c28655q3.m87172p0(objM87133R24);
                        }
                        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R24, zM29243k16, c28655q3, 0, 0);
                        if (bottomSheetState.getVisible()) {
                        }
                        InterfaceC4351m interfaceC4351m111111 = interfaceC4351m12;
                        final boolean z511111110 = z24;
                        final InterfaceC4340b interfaceC4340b110 = interfaceC4340b3;
                        C28673u1[] c28673u1Arr16 = {f34074a.mo86977a(Boolean.valueOf(bottomSheetState.getVisible())), f34075b.mo86977a(m29159b0(interfaceC28601c5)), f34076c.mo86977a(c11011y6)};
                        final Function3 function116 = function8;
                        final C10962h c10962h17 = c10962h;
                        final InterfaceC28601c1 interfaceC28601c11118 = interfaceC28601c8;
                        final InterfaceC39171c interfaceC39171c18 = interfaceC39171c2;
                        final boolean z511111111 = z29;
                        AbstractC28683x.m87248b(c28673u1Arr16, AbstractC37817c.m121344e(1438636126, c28655q3, new InterfaceC4351m() { // from class: cp0.h0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC10969j0.m29104A0(interfaceC39171c18, zIsFeatureEnabled7, bottomSheetState, c32645n5, z511111111, c10962h17, c11011y6, z511111110, onDismiss, function116, interfaceC4340b110, interfaceC28690z2, interfaceC28670t2M30588b, interfaceC28670t2M30588b7, interfaceC28601c5, interfaceC28601c7, interfaceC28601c11117, interfaceC28601c2, interfaceC28601c11118, interfaceC28601c11114, interfaceC28601c11115, interfaceC28601c3, interfaceC28601c11116, interfaceC28601c4, (Composer) obj, iIntValue);
                            }
                        }), c28655q3, 56);
                        c28655q = c28655q3;
                        z16 = z511111110;
                        interfaceC4340b2 = interfaceC4340b110;
                        function6 = function116;
                        interfaceC2994c2 = interfaceC2994c6;
                        z17 = z38;
                        interfaceC4351m4 = interfaceC4351m111111;
                        interfaceC4351m5 = interfaceC4351m11;
                        function5 = function7;
                        interfaceC40915c2 = interfaceC40915c9;
                        c4656v1 = c4656v2;
                    } else {
                        c10978m0 = bottomSheetState;
                    }
                    interfaceC39171c2 = interfaceC39171c;
                    z45 = false;
                    boolean zM87155h1114 = z45 | c28655q3.m87155h(z28);
                    z46 = z28;
                    f14 = f13;
                    zM87147d = zM87155h1114 | c28655q3.m87147d(f14);
                    objM87133R21 = c28655q3.m87133R();
                    if (zM87147d) {
                        objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                        f15 = f14;
                        c28655q3.m87172p0(objM87133R21);
                    } else {
                        objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                        f15 = f14;
                        c28655q3.m87172p0(objM87133R21);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R21, boolValueOf111);
                    Float fValueOf113 = Float.valueOf(f15);
                    if (i46 != 4) {
                        z47 = true;
                    } else {
                        z47 = true;
                    }
                    zM87147d2 = z47 | c28655q3.m87147d(f15);
                    objM87133R22 = c28655q3.m87133R();
                    if (zM87147d2) {
                        objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                        c28655q3.m87172p0(objM87133R22);
                    } else {
                        objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                        c28655q3.m87172p0(objM87133R22);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R22, fValueOf113);
                    Boolean boolValueOf113 = Boolean.valueOf(z39);
                    boolean zM87155h1115 = c28655q3.m87155h(z39);
                    if (i46 != 4) {
                        z48 = true;
                    } else {
                        z48 = true;
                    }
                    z49 = zM87155h1115 | z48;
                    objM87133R23 = c28655q3.m87133R();
                    if (z49) {
                        objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                        c28655q3.m87172p0(objM87133R23);
                    } else {
                        objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                        c28655q3.m87172p0(objM87133R23);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R23, boolValueOf113);
                    boolean zM29243k17 = bottomSheetState.getVisible();
                    zM87155h = c28655q3.m87155h(z29) | c28655q3.m87147d(f15) | c28655q3.m87157i(interfaceC2994c6) | ((i45 & 112) == 32);
                    objM87133R24 = c28655q3.m87133R();
                    if (zM87155h) {
                        final InterfaceC2994c0 interfaceC2994c1119 = interfaceC2994c6;
                        final boolean z511111112 = z29;
                        final float f11118 = f15;
                        objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC10969j0.m29210y0(z511111112, f11118, interfaceC2994c1119, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                            }
                        };
                        c28655q3.m87172p0(objM87133R24);
                    } else {
                        final InterfaceC2994c0 interfaceC2994c11110 = interfaceC2994c6;
                        final boolean z511111113 = z29;
                        final float f11119 = f15;
                        objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC10969j0.m29210y0(z511111113, f11119, interfaceC2994c11110, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                            }
                        };
                        c28655q3.m87172p0(objM87133R24);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R24, zM29243k17, c28655q3, 0, 0);
                    if (bottomSheetState.getVisible()) {
                    }
                    InterfaceC4351m interfaceC4351m111112 = interfaceC4351m12;
                    final boolean z511111114 = z24;
                    final InterfaceC4340b interfaceC4340b111 = interfaceC4340b3;
                    C28673u1[] c28673u1Arr17 = {f34074a.mo86977a(Boolean.valueOf(bottomSheetState.getVisible())), f34075b.mo86977a(m29159b0(interfaceC28601c5)), f34076c.mo86977a(c11011y6)};
                    final Function3 function117 = function8;
                    final C10962h c10962h18 = c10962h;
                    final InterfaceC28601c1 interfaceC28601c11119 = interfaceC28601c8;
                    final InterfaceC39171c interfaceC39171c19 = interfaceC39171c2;
                    final boolean z511111115 = z29;
                    AbstractC28683x.m87248b(c28673u1Arr17, AbstractC37817c.m121344e(1438636126, c28655q3, new InterfaceC4351m() { // from class: cp0.h0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC10969j0.m29104A0(interfaceC39171c19, zIsFeatureEnabled7, bottomSheetState, c32645n5, z511111115, c10962h18, c11011y6, z511111114, onDismiss, function117, interfaceC4340b111, interfaceC28690z2, interfaceC28670t2M30588b, interfaceC28670t2M30588b7, interfaceC28601c5, interfaceC28601c7, interfaceC28601c11117, interfaceC28601c2, interfaceC28601c11119, interfaceC28601c11114, interfaceC28601c11115, interfaceC28601c3, interfaceC28601c11116, interfaceC28601c4, (Composer) obj, iIntValue);
                        }
                    }), c28655q3, 56);
                    c28655q = c28655q3;
                    z16 = z511111114;
                    interfaceC4340b2 = interfaceC4340b111;
                    function6 = function117;
                    interfaceC2994c2 = interfaceC2994c6;
                    z17 = z38;
                    interfaceC4351m4 = interfaceC4351m111112;
                    interfaceC4351m5 = interfaceC4351m11;
                    function5 = function7;
                    interfaceC40915c2 = interfaceC40915c9;
                    c4656v1 = c4656v2;
                } else {
                    c10978m0 = bottomSheetState;
                }
                interfaceC39171c2 = interfaceC39171c;
                z45 = true;
                boolean zM87155h1116 = z45 | c28655q3.m87155h(z28);
                z46 = z28;
                f14 = f13;
                zM87147d = zM87155h1116 | c28655q3.m87147d(f14);
                objM87133R21 = c28655q3.m87133R();
                if (zM87147d) {
                    objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                    f15 = f14;
                    c28655q3.m87172p0(objM87133R21);
                } else {
                    objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                    f15 = f14;
                    c28655q3.m87172p0(objM87133R21);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R21, boolValueOf111);
                Float fValueOf114 = Float.valueOf(f15);
                if (i46 != 4) {
                    z47 = true;
                } else {
                    z47 = true;
                }
                zM87147d2 = z47 | c28655q3.m87147d(f15);
                objM87133R22 = c28655q3.m87133R();
                if (zM87147d2) {
                    objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                    c28655q3.m87172p0(objM87133R22);
                } else {
                    objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                    c28655q3.m87172p0(objM87133R22);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R22, fValueOf114);
                Boolean boolValueOf114 = Boolean.valueOf(z39);
                boolean zM87155h1117 = c28655q3.m87155h(z39);
                if (i46 != 4) {
                    z48 = true;
                } else {
                    z48 = true;
                }
                z49 = zM87155h1117 | z48;
                objM87133R23 = c28655q3.m87133R();
                if (z49) {
                    objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                    c28655q3.m87172p0(objM87133R23);
                } else {
                    objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                    c28655q3.m87172p0(objM87133R23);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R23, boolValueOf114);
                boolean zM29243k18 = bottomSheetState.getVisible();
                zM87155h = c28655q3.m87155h(z29) | c28655q3.m87147d(f15) | c28655q3.m87157i(interfaceC2994c6) | ((i45 & 112) == 32);
                objM87133R24 = c28655q3.m87133R();
                if (zM87155h) {
                    final InterfaceC2994c0 interfaceC2994c11111 = interfaceC2994c6;
                    final boolean z511111116 = z29;
                    final float f111110 = f15;
                    objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return AbstractC10969j0.m29210y0(z511111116, f111110, interfaceC2994c11111, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                        }
                    };
                    c28655q3.m87172p0(objM87133R24);
                } else {
                    final InterfaceC2994c0 interfaceC2994c11112 = interfaceC2994c6;
                    final boolean z511111117 = z29;
                    final float f111111 = f15;
                    objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return AbstractC10969j0.m29210y0(z511111117, f111111, interfaceC2994c11112, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                        }
                    };
                    c28655q3.m87172p0(objM87133R24);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R24, zM29243k18, c28655q3, 0, 0);
                if (bottomSheetState.getVisible()) {
                }
                InterfaceC4351m interfaceC4351m111113 = interfaceC4351m12;
                final boolean z511111118 = z24;
                final InterfaceC4340b interfaceC4340b112 = interfaceC4340b3;
                C28673u1[] c28673u1Arr18 = {f34074a.mo86977a(Boolean.valueOf(bottomSheetState.getVisible())), f34075b.mo86977a(m29159b0(interfaceC28601c5)), f34076c.mo86977a(c11011y6)};
                final Function3 function118 = function8;
                final C10962h c10962h19 = c10962h;
                final InterfaceC28601c1 interfaceC28601c111110 = interfaceC28601c8;
                final InterfaceC39171c interfaceC39171c110 = interfaceC39171c2;
                final boolean z511111119 = z29;
                AbstractC28683x.m87248b(c28673u1Arr18, AbstractC37817c.m121344e(1438636126, c28655q3, new InterfaceC4351m() { // from class: cp0.h0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC10969j0.m29104A0(interfaceC39171c110, zIsFeatureEnabled7, bottomSheetState, c32645n5, z511111119, c10962h19, c11011y6, z511111118, onDismiss, function118, interfaceC4340b112, interfaceC28690z2, interfaceC28670t2M30588b, interfaceC28670t2M30588b7, interfaceC28601c5, interfaceC28601c7, interfaceC28601c11117, interfaceC28601c2, interfaceC28601c111110, interfaceC28601c11114, interfaceC28601c11115, interfaceC28601c3, interfaceC28601c11116, interfaceC28601c4, (Composer) obj, iIntValue);
                    }
                }), c28655q3, 56);
                c28655q = c28655q3;
                z16 = z511111118;
                interfaceC4340b2 = interfaceC4340b112;
                function6 = function118;
                interfaceC2994c2 = interfaceC2994c6;
                z17 = z38;
                interfaceC4351m4 = interfaceC4351m111113;
                interfaceC4351m5 = interfaceC4351m11;
                function5 = function7;
                interfaceC40915c2 = interfaceC40915c9;
                c4656v1 = c4656v2;
            } else {
                c28655q4.m87138X();
                z16 = z13;
                interfaceC4340b2 = interfaceC4340b;
                c28655q = c28655q4;
                function5 = function2;
                function6 = function4;
                z17 = z14;
                interfaceC2994c2 = interfaceC2994c1;
                interfaceC4351m4 = interfaceC4351m3;
                interfaceC4351m5 = interfaceC4351m2;
                c4656v1 = c4656v3;
                interfaceC40915c2 = interfaceC40915c;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i511113 = 1;
                interfaceC4351m6 = new InterfaceC4351m() { // from class: cp0.g0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        switch (i511113) {
                            case 0:
                                return AbstractC10969j0.m29212z0(bottomSheetState, onDismiss, interfaceC40915c2, interfaceC2994c2, function5, function6, z17, interfaceC4351m4, interfaceC4351m5, z16, c4656v1, interfaceC4340b2, i13, i14, i15, composer2, ((Integer) obj2).intValue());
                            default:
                                return AbstractC10969j0.m29126L0(bottomSheetState, onDismiss, interfaceC40915c2, interfaceC2994c2, function5, function6, z17, interfaceC4351m4, interfaceC4351m5, z16, c4656v1, interfaceC4340b2, i13, i14, i15, composer2, ((Integer) obj2).intValue());
                        }
                    }
                };
                c28677v1 = c28677v1M87180u;
                c28677v1.f115982d = interfaceC4351m6;
            }
        }
        i16 |= 805306368;
        i35 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i35 != 0) {
            i36 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            if ((i14 & 8) == 0) {
                zM87157i = c28655q4.m87153g(c4656v3);
            } else {
                zM87157i = c28655q4.m87157i(c4656v3);
            }
            if (zM87157i) {
                i37 = 4;
            } else {
                i37 = 2;
            }
            i36 = i14 | i37;
        } else {
            i36 = i14;
        }
        i38 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        if (i38 != 0) {
            if ((i14 & 48) == 0) {
                if (c28655q4.m87157i(interfaceC4340b)) {
                    i39 = 32;
                } else {
                    i39 = 16;
                }
                i36 |= i39;
            }
            if ((i16 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (c28655q4.m87135U(i16 & 1, z15)) {
                c28655q4.m87140Z();
                i44 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i44 != 0) {
                    if (i48 != 0) {
                        interfaceC40915c3 = null;
                    } else {
                        interfaceC40915c3 = interfaceC40915c;
                    }
                    if ((i15 & 8) != 0) {
                        objM87133R3 = c28655q4.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87262p(c28655q4);
                            c28655q4.m87172p0(objM87133R3);
                        }
                        interfaceC2994c3 = (InterfaceC2994c0) objM87133R3;
                        i16 &= -7169;
                    } else {
                        interfaceC2994c3 = interfaceC2994c1;
                    }
                    if (i49 != 0) {
                        function2 = null;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    }
                    if (i19 != 0) {
                        z14 = false;
                    }
                    if (i25 != 0) {
                        objM87133R2 = c28655q4.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C4139w0(7);
                            c28655q4.m87172p0(objM87133R2);
                        }
                        interfaceC4351m7 = (InterfaceC4351m) objM87133R2;
                    } else {
                        interfaceC4351m7 = interfaceC4351m3;
                    }
                    if (i27 != 0) {
                        objM87133R = c28655q4.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C4139w0(8);
                            c28655q4.m87172p0(objM87133R);
                        }
                        interfaceC4351m8 = (InterfaceC4351m) objM87133R;
                    } else {
                        interfaceC4351m8 = interfaceC4351m2;
                    }
                    if (i29 != 0) {
                        z18 = false;
                    } else {
                        z18 = z13;
                    }
                    if (i35 != 0) {
                        c4656v3 = null;
                    }
                    if (i38 != 0) {
                        str = null;
                        C37816b c37816bM121344e18 = AbstractC37817c.m121344e(-633821104, c28655q4, new InterfaceC4340b() { // from class: cp0.i0
                            @Override // c93.InterfaceC4340b
                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
                                int iIntValue = ((Integer) obj10).intValue();
                                return AbstractC10969j0.m29137R(interfaceC40915c3, bottomSheetState, z18, c4656v3, (C32645n0) obj, (InterfaceC4339a) obj2, (InterfaceC4353o) obj3, (Function1) obj4, (Function1) obj5, (InterfaceC4339a) obj6, (String) obj7, (Function3) obj8, (C28655q) ((Composer) obj9), iIntValue);
                            }
                        });
                        c4656v2 = c4656v3;
                        i45 = i16;
                        function7 = function2;
                        function8 = function4;
                        interfaceC2994c4 = interfaceC2994c3;
                        z19 = z14;
                        interfaceC4351m9 = interfaceC4351m7;
                        interfaceC4351m10 = interfaceC4351m8;
                        z24 = z18;
                        interfaceC4340b3 = c37816bM121344e18;
                    } else {
                        str = null;
                        interfaceC4340b3 = interfaceC4340b;
                        c4656v2 = c4656v3;
                        i45 = i16;
                        function7 = function2;
                        function8 = function4;
                        interfaceC2994c4 = interfaceC2994c3;
                        z19 = z14;
                        interfaceC4351m9 = interfaceC4351m7;
                        interfaceC4351m10 = interfaceC4351m8;
                        z24 = z18;
                    }
                } else {
                    if (i48 != 0) {
                        interfaceC40915c3 = null;
                    } else {
                        interfaceC40915c3 = interfaceC40915c;
                    }
                    if ((i15 & 8) != 0) {
                        objM87133R3 = c28655q4.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87262p(c28655q4);
                            c28655q4.m87172p0(objM87133R3);
                        }
                        interfaceC2994c3 = (InterfaceC2994c0) objM87133R3;
                        i16 &= -7169;
                    } else {
                        interfaceC2994c3 = interfaceC2994c1;
                    }
                    if (i49 != 0) {
                        function2 = null;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    }
                    if (i19 != 0) {
                        z14 = false;
                    }
                    if (i25 != 0) {
                        objM87133R2 = c28655q4.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C4139w0(7);
                            c28655q4.m87172p0(objM87133R2);
                        }
                        interfaceC4351m7 = (InterfaceC4351m) objM87133R2;
                    } else {
                        interfaceC4351m7 = interfaceC4351m3;
                    }
                    if (i27 != 0) {
                        objM87133R = c28655q4.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C4139w0(8);
                            c28655q4.m87172p0(objM87133R);
                        }
                        interfaceC4351m8 = (InterfaceC4351m) objM87133R;
                    } else {
                        interfaceC4351m8 = interfaceC4351m2;
                    }
                    if (i29 != 0) {
                        z18 = false;
                    } else {
                        z18 = z13;
                    }
                    if (i35 != 0) {
                        c4656v3 = null;
                    }
                    if (i38 != 0) {
                        str = null;
                        C37816b c37816bM121344e19 = AbstractC37817c.m121344e(-633821104, c28655q4, new InterfaceC4340b() { // from class: cp0.i0
                            @Override // c93.InterfaceC4340b
                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
                                int iIntValue = ((Integer) obj10).intValue();
                                return AbstractC10969j0.m29137R(interfaceC40915c3, bottomSheetState, z18, c4656v3, (C32645n0) obj, (InterfaceC4339a) obj2, (InterfaceC4353o) obj3, (Function1) obj4, (Function1) obj5, (InterfaceC4339a) obj6, (String) obj7, (Function3) obj8, (C28655q) ((Composer) obj9), iIntValue);
                            }
                        });
                        c4656v2 = c4656v3;
                        i45 = i16;
                        function7 = function2;
                        function8 = function4;
                        interfaceC2994c4 = interfaceC2994c3;
                        z19 = z14;
                        interfaceC4351m9 = interfaceC4351m7;
                        interfaceC4351m10 = interfaceC4351m8;
                        z24 = z18;
                        interfaceC4340b3 = c37816bM121344e19;
                    } else {
                        str = null;
                        interfaceC4340b3 = interfaceC4340b;
                        c4656v2 = c4656v3;
                        i45 = i16;
                        function7 = function2;
                        function8 = function4;
                        interfaceC2994c4 = interfaceC2994c3;
                        z19 = z14;
                        interfaceC4351m9 = interfaceC4351m7;
                        interfaceC4351m10 = interfaceC4351m8;
                        z24 = z18;
                    }
                }
                c28655q4.m87175r();
                zM87153g = c28655q4.m87153g(bottomSheetState.getScreenContext());
                objM87133R4 = c28655q4.m87133R();
                if (zM87153g) {
                    objM87133R4 = m29172f1(bottomSheetState.getScreenContext());
                    c28655q4.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = m29172f1(bottomSheetState.getScreenContext());
                    c28655q4.m87172p0(objM87133R4);
                }
                final C32645n0 c32645n6 = (C32645n0) objM87133R4;
                FeatureFlagChecker featureFlagChecker7 = (FeatureFlagChecker) c28655q4.m87161k(AbstractC38073e.m121968p());
                C10978m0.Companion aVar7 = C10978m0.INSTANCE;
                zM29247c = aVar7.m29247c(bottomSheetState.getScreenContext());
                zM29246b = aVar7.m29246b(bottomSheetState.getCustomDrawerPresentation(), bottomSheetState.getShouldOpenFullSize(), zM29247c, bottomSheetState.getReadOnlyHalfSheet());
                final boolean zIsFeatureEnabled8 = featureFlagChecker7.isFeatureEnabled("wce-padding-keyboard-fix");
                zIsFeatureEnabled = featureFlagChecker7.isFeatureEnabled("context-hub-profile");
                Set setM74059b7 = AbstractC25260n.m74059b1(new String[]{"CONTEXT_HUB", "CONTEXT_DETAILS"});
                c13404jM29240h = bottomSheetState.getScreenContext();
                if (c13404jM29240h != null) {
                    screenId = c13404jM29240h.getScreenId();
                } else {
                    screenId = str;
                }
                zM74155w0 = AbstractC25265s.m74155w0(setM74059b7, screenId);
                objM87133R5 = c28655q4.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(str);
                    c28655q4.m87172p0(objM87133R5);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                objM87133R6 = c28655q4.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC28683x.m87272z(str);
                    c28655q4.m87172p0(objM87133R6);
                }
                final InterfaceC28601c1 interfaceC28601c111111 = (InterfaceC28601c1) objM87133R6;
                objM87133R7 = c28655q4.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC28683x.m87272z(str);
                    c28655q4.m87172p0(objM87133R7);
                }
                final InterfaceC28601c1 interfaceC28601c111112 = (InterfaceC28601c1) objM87133R7;
                objM87133R8 = c28655q4.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = AbstractC28683x.m87272z("");
                    c28655q4.m87172p0(objM87133R8);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R8;
                final InterfaceC40915c interfaceC40915c10 = interfaceC40915c3;
                objM87133R9 = c28655q4.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = AbstractC28683x.m87272z(Boolean.TRUE);
                    c28655q4.m87172p0(objM87133R9);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R9;
                objM87133R10 = c28655q4.m87133R();
                if (objM87133R10 == c28676v0) {
                    objM87133R10 = AbstractC28683x.m87272z(Boolean.TRUE);
                    c28655q4.m87172p0(objM87133R10);
                }
                final InterfaceC28601c1 interfaceC28601c111113 = (InterfaceC28601c1) objM87133R10;
                objM87133R11 = c28655q4.m87133R();
                if (objM87133R11 == c28676v0) {
                    objM87133R11 = AbstractC28683x.m87272z(Boolean.TRUE);
                    c28655q4.m87172p0(objM87133R11);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R11;
                if (zIsFeatureEnabled) {
                    z25 = zM74155w0;
                } else {
                    z25 = true;
                }
                if (m29143U(interfaceC28601c4)) {
                    z26 = false;
                } else {
                    z26 = false;
                }
                if (zIsFeatureEnabled) {
                    z27 = false;
                } else {
                    z27 = false;
                }
                if (m29133P(interfaceC28601c3)) {
                    c28655q4.m87150e0(2094451546);
                    C37816b c37816bM121344e110 = AbstractC37817c.m121344e(36773779, c28655q4, new C0003a0(19, interfaceC28601c2, interfaceC28601c1));
                    c28655q4.m87173q(false);
                    r10 = c37816bM121344e110;
                } else {
                    c28655q4.m87150e0(2094652488);
                    c28655q4.m87173q(false);
                    r10 = str;
                }
                final boolean z5128 = z27;
                final boolean z5129 = z26;
                c10962h = new C10962h(r10, AbstractC37817c.m121344e(-582148231, c28655q4, new InterfaceC4351m() { // from class: cp0.b0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC10969j0.m29151Y(z5129, z5128, zIsFeatureEnabled, interfaceC28601c111111, interfaceC28601c111112, (Composer) obj, iIntValue);
                    }
                }));
                c10962hM29242j = bottomSheetState.getToolbarContent();
                if (c10962hM29242j == null) {
                    c10962h = c10962hM29242j;
                } else if (zM29247c) {
                    ?? r110 = str;
                    c10962h = new C10962h(r110, r110, 3, r110);
                }
                fM29245a = aVar7.m29245a(bottomSheetState.getCustomDrawerPresentation());
                objM87133R12 = c28655q4.m87133R();
                if (objM87133R12 == c28676v0) {
                    objM87133R12 = AbstractC28683x.m87272z(bottomSheetState.getInitialSheetState());
                    c28655q4.m87172p0(objM87133R12);
                }
                interfaceC28601c5 = (InterfaceC28601c1) objM87133R12;
                objM87133R13 = c28655q4.m87133R();
                if (objM87133R13 == c28676v0) {
                    objM87133R13 = AbstractC28683x.m87272z(bottomSheetState.getInitialSheetState());
                    c28655q4.m87172p0(objM87133R13);
                }
                interfaceC28601c6 = (InterfaceC28601c1) objM87133R13;
                objM87133R14 = c28655q4.m87133R();
                if (objM87133R14 == c28676v0) {
                    objM87133R14 = AbstractC11266d.m30468v(bottomSheetState.getInitialHeightFraction(), c28655q4);
                }
                interfaceC28690z0 = (InterfaceC28690z0) objM87133R14;
                objM87133R15 = c28655q4.m87133R();
                if (objM87133R15 == c28676v0) {
                    if (bottomSheetState.getInitialSheetState() == EnumC11003u1.Hidden) {
                        f16 = 0.0f;
                    } else {
                        f16 = 1.0f;
                    }
                    objM87133R15 = AbstractC11266d.m30468v(f16, c28655q4);
                }
                interfaceC28690z1 = (InterfaceC28690z0) objM87133R15;
                objM87133R16 = c28655q4.m87133R();
                if (objM87133R16 == c28676v0) {
                    objM87133R16 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q4.m87172p0(objM87133R16);
                }
                interfaceC28601c7 = (InterfaceC28601c1) objM87133R16;
                objM87133R17 = c28655q4.m87133R();
                if (objM87133R17 == c28676v0) {
                    objM87133R17 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q4.m87172p0(objM87133R17);
                }
                final InterfaceC28601c1 interfaceC28601c111114 = (InterfaceC28601c1) objM87133R17;
                objM87133R18 = c28655q4.m87133R();
                if (objM87133R18 == c28676v0) {
                    objM87133R18 = AbstractC11266d.m30468v(0.0f, c28655q4);
                }
                interfaceC28690z2 = (InterfaceC28690z0) objM87133R18;
                zM87153g2 = c28655q4.m87153g(interfaceC2994c4);
                interfaceC2994c5 = interfaceC2994c4;
                Object objM87133R211 = c28655q4.m87133R();
                if (zM87153g2) {
                    final int i511114 = 0;
                    final int i511115 = 1;
                    final int i511116 = 2;
                    interfaceC28601c8 = interfaceC28601c1;
                    z28 = zM29246b;
                    f13 = fM29245a;
                    c28676v1 = c28676v0;
                    interfaceC2994c6 = interfaceC2994c5;
                    c28655q2 = c28655q4;
                    z29 = zM29247c;
                    c11011y0 = new C11011y0(interfaceC2994c6, z29, new InterfaceC4339a() { // from class: cp0.c0
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            float fM29188n0;
                            switch (i511114) {
                                case 0:
                                    fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z2);
                                    break;
                                case 1:
                                    fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z2);
                                    break;
                                default:
                                    fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z2);
                                    break;
                            }
                            return Float.valueOf(fM29188n0);
                        }
                    }, new C10992r(1, interfaceC28601c5), new InterfaceC4339a() { // from class: cp0.c0
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            float fM29188n0;
                            switch (i511115) {
                                case 0:
                                    fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z1);
                                    break;
                                case 1:
                                    fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z1);
                                    break;
                                default:
                                    fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z1);
                                    break;
                            }
                            return Float.valueOf(fM29188n0);
                        }
                    }, new InterfaceC4339a() { // from class: cp0.c0
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            float fM29188n0;
                            switch (i511116) {
                                case 0:
                                    fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z0);
                                    break;
                                case 1:
                                    fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z0);
                                    break;
                                default:
                                    fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z0);
                                    break;
                            }
                            return Float.valueOf(fM29188n0);
                        }
                    }, new C10975l0(interfaceC28690z1, 3), new C10975l0(interfaceC28690z0, 4), new C10972k0(7, interfaceC28601c5), new C10972k0(11, interfaceC28601c7), onDismiss);
                    c28655q2.m87172p0(c11011y0);
                } else {
                    final int i511117 = 0;
                    final int i511118 = 1;
                    final int i511119 = 2;
                    interfaceC28601c8 = interfaceC28601c1;
                    z28 = zM29246b;
                    f13 = fM29245a;
                    c28676v1 = c28676v0;
                    interfaceC2994c6 = interfaceC2994c5;
                    c28655q2 = c28655q4;
                    z29 = zM29247c;
                    c11011y0 = new C11011y0(interfaceC2994c6, z29, new InterfaceC4339a() { // from class: cp0.c0
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            float fM29188n0;
                            switch (i511117) {
                                case 0:
                                    fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z2);
                                    break;
                                case 1:
                                    fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z2);
                                    break;
                                default:
                                    fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z2);
                                    break;
                            }
                            return Float.valueOf(fM29188n0);
                        }
                    }, new C10992r(1, interfaceC28601c5), new InterfaceC4339a() { // from class: cp0.c0
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            float fM29188n0;
                            switch (i511118) {
                                case 0:
                                    fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z1);
                                    break;
                                case 1:
                                    fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z1);
                                    break;
                                default:
                                    fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z1);
                                    break;
                            }
                            return Float.valueOf(fM29188n0);
                        }
                    }, new InterfaceC4339a() { // from class: cp0.c0
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            float fM29188n0;
                            switch (i511119) {
                                case 0:
                                    fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z0);
                                    break;
                                case 1:
                                    fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z0);
                                    break;
                                default:
                                    fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z0);
                                    break;
                            }
                            return Float.valueOf(fM29188n0);
                        }
                    }, new C10975l0(interfaceC28690z1, 3), new C10975l0(interfaceC28690z0, 4), new C10972k0(7, interfaceC28601c5), new C10972k0(11, interfaceC28601c7), onDismiss);
                    c28655q2.m87172p0(c11011y0);
                }
                final C11011y0 c11011y7 = (C11011y0) c11011y0;
                c13404jM29240h2 = bottomSheetState.getScreenContext();
                if (c13404jM29240h2 != null) {
                    source = "";
                } else {
                    source = "";
                }
                EnumC11003u1 enumC11003u1M29159b6 = m29159b0(interfaceC28601c5);
                if ((i45 & 234881024) == 67108864) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                boolean zM87153g10 = z34 | c28655q2.m87153g(source);
                if ((i45 & 3670016) == 1048576) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                boolean z5215 = zM87153g10 | z35;
                if ((i45 & 29360128) == 8388608) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                z37 = z5215 | z36;
                objM87133R19 = c28655q2.m87133R();
                if (z37) {
                    boolean z5216 = z19;
                    InterfaceC4351m interfaceC4351m111114 = interfaceC4351m9;
                    InterfaceC4351m interfaceC4351m111115 = interfaceC4351m10;
                    objM87133R19 = new a(interfaceC4351m111115, source, z5216, interfaceC4351m111114, interfaceC28601c6, interfaceC28601c5, null);
                    interfaceC4351m11 = interfaceC4351m111115;
                    interfaceC4351m12 = interfaceC4351m111114;
                    z38 = z5216;
                    c28655q2.m87172p0(objM87133R19);
                } else {
                    boolean z5217 = z19;
                    InterfaceC4351m interfaceC4351m111116 = interfaceC4351m9;
                    InterfaceC4351m interfaceC4351m111117 = interfaceC4351m10;
                    objM87133R19 = new a(interfaceC4351m111117, source, z5217, interfaceC4351m111116, interfaceC28601c6, interfaceC28601c5, null);
                    interfaceC4351m11 = interfaceC4351m111117;
                    interfaceC4351m12 = interfaceC4351m111116;
                    z38 = z5217;
                    c28655q2.m87172p0(objM87133R19);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R19, enumC11003u1M29159b6);
                float fM29171f6 = m29171f0(interfaceC28690z0);
                if (m29180j0(interfaceC28601c7)) {
                    c11347e2M30574v = AbstractC11348f.m30574v(0, 0, null, 6);
                } else {
                    c11347e2M30574v = AbstractC11348f.m30574v(300, 0, null, 6);
                }
                c28655q3 = c28655q2;
                final InterfaceC28670t2 interfaceC28670t2M30588b8 = AbstractC11352g.m30588b(fM29171f6, c11347e2M30574v, "bottomSheetHeight", null, c28655q3, 3072, 20);
                interfaceC39171c = (InterfaceC39171c) c28655q3.m87161k(AbstractC2453v1.f9569h);
                if (bottomSheetState.getImeHeightPx() > 0) {
                    z39 = true;
                } else {
                    z39 = false;
                }
                float fM29176h6 = m29176h0(interfaceC28690z1);
                if (m29180j0(interfaceC28601c7)) {
                    c11347e2M30574v2 = AbstractC11348f.m30574v(0, 0, null, 6);
                } else {
                    c11347e2M30574v2 = AbstractC11348f.m30574v(300, 0, null, 6);
                }
                interfaceC28670t2M30588b = AbstractC11352g.m30588b(fM29176h6, c11347e2M30574v2, "heroProgress", null, c28655q3, 3072, 20);
                Float fValueOf115 = Float.valueOf(m29208x0(interfaceC28670t2M30588b));
                if ((i45 & 57344) == 16384) {
                    z44 = true;
                } else {
                    z44 = false;
                }
                zM87153g3 = z44 | c28655q3.m87153g(interfaceC28670t2M30588b);
                objM87133R20 = c28655q3.m87133R();
                if (zM87153g3) {
                    objM87133R20 = new b(function7, interfaceC28670t2M30588b, null);
                    c28655q3.m87172p0(objM87133R20);
                } else {
                    objM87133R20 = new b(function7, interfaceC28670t2M30588b, null);
                    c28655q3.m87172p0(objM87133R20);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R20, fValueOf115);
                Boolean boolValueOf115 = Boolean.valueOf(bottomSheetState.getVisible());
                i46 = i45 & 14;
                if (i46 != 4) {
                    if ((i45 & 8) != 0) {
                        c10978m0 = bottomSheetState;
                        if (c28655q3.m87157i(c10978m0)) {
                        }
                        boolean zM87155h1118 = z45 | c28655q3.m87155h(z28);
                        z46 = z28;
                        f14 = f13;
                        zM87147d = zM87155h1118 | c28655q3.m87147d(f14);
                        objM87133R21 = c28655q3.m87133R();
                        if (zM87147d) {
                            objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                            f15 = f14;
                            c28655q3.m87172p0(objM87133R21);
                        } else {
                            objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                            f15 = f14;
                            c28655q3.m87172p0(objM87133R21);
                        }
                        AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R21, boolValueOf115);
                        Float fValueOf116 = Float.valueOf(f15);
                        if (i46 != 4) {
                            z47 = true;
                        } else {
                            z47 = true;
                        }
                        zM87147d2 = z47 | c28655q3.m87147d(f15);
                        objM87133R22 = c28655q3.m87133R();
                        if (zM87147d2) {
                            objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                            c28655q3.m87172p0(objM87133R22);
                        } else {
                            objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                            c28655q3.m87172p0(objM87133R22);
                        }
                        AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R22, fValueOf116);
                        Boolean boolValueOf116 = Boolean.valueOf(z39);
                        boolean zM87155h1119 = c28655q3.m87155h(z39);
                        if (i46 != 4) {
                            z48 = true;
                        } else {
                            z48 = true;
                        }
                        z49 = zM87155h1119 | z48;
                        objM87133R23 = c28655q3.m87133R();
                        if (z49) {
                            objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                            c28655q3.m87172p0(objM87133R23);
                        } else {
                            objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                            c28655q3.m87172p0(objM87133R23);
                        }
                        AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R23, boolValueOf116);
                        boolean zM29243k19 = bottomSheetState.getVisible();
                        zM87155h = c28655q3.m87155h(z29) | c28655q3.m87147d(f15) | c28655q3.m87157i(interfaceC2994c6) | ((i45 & 112) == 32);
                        objM87133R24 = c28655q3.m87133R();
                        if (zM87155h) {
                            final InterfaceC2994c0 interfaceC2994c11113 = interfaceC2994c6;
                            final boolean z5111111110 = z29;
                            final float f111112 = f15;
                            objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC10969j0.m29210y0(z5111111110, f111112, interfaceC2994c11113, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                                }
                            };
                            c28655q3.m87172p0(objM87133R24);
                        } else {
                            final InterfaceC2994c0 interfaceC2994c11114 = interfaceC2994c6;
                            final boolean z5111111111 = z29;
                            final float f111113 = f15;
                            objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC10969j0.m29210y0(z5111111111, f111113, interfaceC2994c11114, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                                }
                            };
                            c28655q3.m87172p0(objM87133R24);
                        }
                        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R24, zM29243k19, c28655q3, 0, 0);
                        if (bottomSheetState.getVisible()) {
                        }
                        InterfaceC4351m interfaceC4351m111118 = interfaceC4351m12;
                        final boolean z5111111112 = z24;
                        final InterfaceC4340b interfaceC4340b113 = interfaceC4340b3;
                        C28673u1[] c28673u1Arr19 = {f34074a.mo86977a(Boolean.valueOf(bottomSheetState.getVisible())), f34075b.mo86977a(m29159b0(interfaceC28601c5)), f34076c.mo86977a(c11011y7)};
                        final Function3 function119 = function8;
                        final C10962h c10962h110 = c10962h;
                        final InterfaceC28601c1 interfaceC28601c111115 = interfaceC28601c8;
                        final InterfaceC39171c interfaceC39171c111 = interfaceC39171c2;
                        final boolean z5111111113 = z29;
                        AbstractC28683x.m87248b(c28673u1Arr19, AbstractC37817c.m121344e(1438636126, c28655q3, new InterfaceC4351m() { // from class: cp0.h0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC10969j0.m29104A0(interfaceC39171c111, zIsFeatureEnabled8, bottomSheetState, c32645n6, z5111111113, c10962h110, c11011y7, z5111111112, onDismiss, function119, interfaceC4340b113, interfaceC28690z2, interfaceC28670t2M30588b, interfaceC28670t2M30588b8, interfaceC28601c5, interfaceC28601c7, interfaceC28601c111114, interfaceC28601c2, interfaceC28601c111115, interfaceC28601c111111, interfaceC28601c111112, interfaceC28601c3, interfaceC28601c111113, interfaceC28601c4, (Composer) obj, iIntValue);
                            }
                        }), c28655q3, 56);
                        c28655q = c28655q3;
                        z16 = z5111111112;
                        interfaceC4340b2 = interfaceC4340b113;
                        function6 = function119;
                        interfaceC2994c2 = interfaceC2994c6;
                        z17 = z38;
                        interfaceC4351m4 = interfaceC4351m111118;
                        interfaceC4351m5 = interfaceC4351m11;
                        function5 = function7;
                        interfaceC40915c2 = interfaceC40915c10;
                        c4656v1 = c4656v2;
                    } else {
                        c10978m0 = bottomSheetState;
                    }
                    interfaceC39171c2 = interfaceC39171c;
                    z45 = false;
                    boolean zM87155h11110 = z45 | c28655q3.m87155h(z28);
                    z46 = z28;
                    f14 = f13;
                    zM87147d = zM87155h11110 | c28655q3.m87147d(f14);
                    objM87133R21 = c28655q3.m87133R();
                    if (zM87147d) {
                        objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                        f15 = f14;
                        c28655q3.m87172p0(objM87133R21);
                    } else {
                        objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                        f15 = f14;
                        c28655q3.m87172p0(objM87133R21);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R21, boolValueOf115);
                    Float fValueOf117 = Float.valueOf(f15);
                    if (i46 != 4) {
                        z47 = true;
                    } else {
                        z47 = true;
                    }
                    zM87147d2 = z47 | c28655q3.m87147d(f15);
                    objM87133R22 = c28655q3.m87133R();
                    if (zM87147d2) {
                        objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                        c28655q3.m87172p0(objM87133R22);
                    } else {
                        objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                        c28655q3.m87172p0(objM87133R22);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R22, fValueOf117);
                    Boolean boolValueOf117 = Boolean.valueOf(z39);
                    boolean zM87155h11111 = c28655q3.m87155h(z39);
                    if (i46 != 4) {
                        z48 = true;
                    } else {
                        z48 = true;
                    }
                    z49 = zM87155h11111 | z48;
                    objM87133R23 = c28655q3.m87133R();
                    if (z49) {
                        objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                        c28655q3.m87172p0(objM87133R23);
                    } else {
                        objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                        c28655q3.m87172p0(objM87133R23);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R23, boolValueOf117);
                    boolean zM29243k110 = bottomSheetState.getVisible();
                    zM87155h = c28655q3.m87155h(z29) | c28655q3.m87147d(f15) | c28655q3.m87157i(interfaceC2994c6) | ((i45 & 112) == 32);
                    objM87133R24 = c28655q3.m87133R();
                    if (zM87155h) {
                        final InterfaceC2994c0 interfaceC2994c11115 = interfaceC2994c6;
                        final boolean z5111111114 = z29;
                        final float f111114 = f15;
                        objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC10969j0.m29210y0(z5111111114, f111114, interfaceC2994c11115, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                            }
                        };
                        c28655q3.m87172p0(objM87133R24);
                    } else {
                        final InterfaceC2994c0 interfaceC2994c11116 = interfaceC2994c6;
                        final boolean z5111111115 = z29;
                        final float f111115 = f15;
                        objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC10969j0.m29210y0(z5111111115, f111115, interfaceC2994c11116, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                            }
                        };
                        c28655q3.m87172p0(objM87133R24);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R24, zM29243k110, c28655q3, 0, 0);
                    if (bottomSheetState.getVisible()) {
                    }
                    InterfaceC4351m interfaceC4351m111119 = interfaceC4351m12;
                    final boolean z5111111116 = z24;
                    final InterfaceC4340b interfaceC4340b114 = interfaceC4340b3;
                    C28673u1[] c28673u1Arr110 = {f34074a.mo86977a(Boolean.valueOf(bottomSheetState.getVisible())), f34075b.mo86977a(m29159b0(interfaceC28601c5)), f34076c.mo86977a(c11011y7)};
                    final Function3 function1110 = function8;
                    final C10962h c10962h111 = c10962h;
                    final InterfaceC28601c1 interfaceC28601c111116 = interfaceC28601c8;
                    final InterfaceC39171c interfaceC39171c112 = interfaceC39171c2;
                    final boolean z5111111117 = z29;
                    AbstractC28683x.m87248b(c28673u1Arr110, AbstractC37817c.m121344e(1438636126, c28655q3, new InterfaceC4351m() { // from class: cp0.h0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC10969j0.m29104A0(interfaceC39171c112, zIsFeatureEnabled8, bottomSheetState, c32645n6, z5111111117, c10962h111, c11011y7, z5111111116, onDismiss, function1110, interfaceC4340b114, interfaceC28690z2, interfaceC28670t2M30588b, interfaceC28670t2M30588b8, interfaceC28601c5, interfaceC28601c7, interfaceC28601c111114, interfaceC28601c2, interfaceC28601c111116, interfaceC28601c111111, interfaceC28601c111112, interfaceC28601c3, interfaceC28601c111113, interfaceC28601c4, (Composer) obj, iIntValue);
                        }
                    }), c28655q3, 56);
                    c28655q = c28655q3;
                    z16 = z5111111116;
                    interfaceC4340b2 = interfaceC4340b114;
                    function6 = function1110;
                    interfaceC2994c2 = interfaceC2994c6;
                    z17 = z38;
                    interfaceC4351m4 = interfaceC4351m111119;
                    interfaceC4351m5 = interfaceC4351m11;
                    function5 = function7;
                    interfaceC40915c2 = interfaceC40915c10;
                    c4656v1 = c4656v2;
                } else {
                    c10978m0 = bottomSheetState;
                }
                interfaceC39171c2 = interfaceC39171c;
                z45 = true;
                boolean zM87155h11112 = z45 | c28655q3.m87155h(z28);
                z46 = z28;
                f14 = f13;
                zM87147d = zM87155h11112 | c28655q3.m87147d(f14);
                objM87133R21 = c28655q3.m87133R();
                if (zM87147d) {
                    objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                    f15 = f14;
                    c28655q3.m87172p0(objM87133R21);
                } else {
                    objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                    f15 = f14;
                    c28655q3.m87172p0(objM87133R21);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R21, boolValueOf115);
                Float fValueOf118 = Float.valueOf(f15);
                if (i46 != 4) {
                    z47 = true;
                } else {
                    z47 = true;
                }
                zM87147d2 = z47 | c28655q3.m87147d(f15);
                objM87133R22 = c28655q3.m87133R();
                if (zM87147d2) {
                    objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                    c28655q3.m87172p0(objM87133R22);
                } else {
                    objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                    c28655q3.m87172p0(objM87133R22);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R22, fValueOf118);
                Boolean boolValueOf118 = Boolean.valueOf(z39);
                boolean zM87155h11113 = c28655q3.m87155h(z39);
                if (i46 != 4) {
                    z48 = true;
                } else {
                    z48 = true;
                }
                z49 = zM87155h11113 | z48;
                objM87133R23 = c28655q3.m87133R();
                if (z49) {
                    objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                    c28655q3.m87172p0(objM87133R23);
                } else {
                    objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                    c28655q3.m87172p0(objM87133R23);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R23, boolValueOf118);
                boolean zM29243k111 = bottomSheetState.getVisible();
                zM87155h = c28655q3.m87155h(z29) | c28655q3.m87147d(f15) | c28655q3.m87157i(interfaceC2994c6) | ((i45 & 112) == 32);
                objM87133R24 = c28655q3.m87133R();
                if (zM87155h) {
                    final InterfaceC2994c0 interfaceC2994c11117 = interfaceC2994c6;
                    final boolean z5111111118 = z29;
                    final float f111116 = f15;
                    objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return AbstractC10969j0.m29210y0(z5111111118, f111116, interfaceC2994c11117, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                        }
                    };
                    c28655q3.m87172p0(objM87133R24);
                } else {
                    final InterfaceC2994c0 interfaceC2994c11118 = interfaceC2994c6;
                    final boolean z5111111119 = z29;
                    final float f111117 = f15;
                    objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return AbstractC10969j0.m29210y0(z5111111119, f111117, interfaceC2994c11118, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                        }
                    };
                    c28655q3.m87172p0(objM87133R24);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R24, zM29243k111, c28655q3, 0, 0);
                if (bottomSheetState.getVisible()) {
                }
                InterfaceC4351m interfaceC4351m1111110 = interfaceC4351m12;
                final boolean z51111111110 = z24;
                final InterfaceC4340b interfaceC4340b115 = interfaceC4340b3;
                C28673u1[] c28673u1Arr111 = {f34074a.mo86977a(Boolean.valueOf(bottomSheetState.getVisible())), f34075b.mo86977a(m29159b0(interfaceC28601c5)), f34076c.mo86977a(c11011y7)};
                final Function3 function1111 = function8;
                final C10962h c10962h112 = c10962h;
                final InterfaceC28601c1 interfaceC28601c111117 = interfaceC28601c8;
                final InterfaceC39171c interfaceC39171c113 = interfaceC39171c2;
                final boolean z51111111111 = z29;
                AbstractC28683x.m87248b(c28673u1Arr111, AbstractC37817c.m121344e(1438636126, c28655q3, new InterfaceC4351m() { // from class: cp0.h0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC10969j0.m29104A0(interfaceC39171c113, zIsFeatureEnabled8, bottomSheetState, c32645n6, z51111111111, c10962h112, c11011y7, z51111111110, onDismiss, function1111, interfaceC4340b115, interfaceC28690z2, interfaceC28670t2M30588b, interfaceC28670t2M30588b8, interfaceC28601c5, interfaceC28601c7, interfaceC28601c111114, interfaceC28601c2, interfaceC28601c111117, interfaceC28601c111111, interfaceC28601c111112, interfaceC28601c3, interfaceC28601c111113, interfaceC28601c4, (Composer) obj, iIntValue);
                    }
                }), c28655q3, 56);
                c28655q = c28655q3;
                z16 = z51111111110;
                interfaceC4340b2 = interfaceC4340b115;
                function6 = function1111;
                interfaceC2994c2 = interfaceC2994c6;
                z17 = z38;
                interfaceC4351m4 = interfaceC4351m1111110;
                interfaceC4351m5 = interfaceC4351m11;
                function5 = function7;
                interfaceC40915c2 = interfaceC40915c10;
                c4656v1 = c4656v2;
            } else {
                c28655q4.m87138X();
                z16 = z13;
                interfaceC4340b2 = interfaceC4340b;
                c28655q = c28655q4;
                function5 = function2;
                function6 = function4;
                z17 = z14;
                interfaceC2994c2 = interfaceC2994c1;
                interfaceC4351m4 = interfaceC4351m3;
                interfaceC4351m5 = interfaceC4351m2;
                c4656v1 = c4656v3;
                interfaceC40915c2 = interfaceC40915c;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i5111110 = 1;
                interfaceC4351m6 = new InterfaceC4351m() { // from class: cp0.g0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        switch (i5111110) {
                            case 0:
                                return AbstractC10969j0.m29212z0(bottomSheetState, onDismiss, interfaceC40915c2, interfaceC2994c2, function5, function6, z17, interfaceC4351m4, interfaceC4351m5, z16, c4656v1, interfaceC4340b2, i13, i14, i15, composer2, ((Integer) obj2).intValue());
                            default:
                                return AbstractC10969j0.m29126L0(bottomSheetState, onDismiss, interfaceC40915c2, interfaceC2994c2, function5, function6, z17, interfaceC4351m4, interfaceC4351m5, z16, c4656v1, interfaceC4340b2, i13, i14, i15, composer2, ((Integer) obj2).intValue());
                        }
                    }
                };
                c28677v1 = c28677v1M87180u;
                c28677v1.f115982d = interfaceC4351m6;
            }
        }
        i36 |= 48;
        if ((i16 & 306783379) == 306783378) {
            z15 = true;
        } else {
            z15 = true;
        }
        if (c28655q4.m87135U(i16 & 1, z15)) {
            c28655q4.m87140Z();
            i44 = i13 & 1;
            c28676v0 = C28635l.f115821a;
            if (i44 != 0) {
                if (i48 != 0) {
                    interfaceC40915c3 = null;
                } else {
                    interfaceC40915c3 = interfaceC40915c;
                }
                if ((i15 & 8) != 0) {
                    objM87133R3 = c28655q4.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87262p(c28655q4);
                        c28655q4.m87172p0(objM87133R3);
                    }
                    interfaceC2994c3 = (InterfaceC2994c0) objM87133R3;
                    i16 &= -7169;
                } else {
                    interfaceC2994c3 = interfaceC2994c1;
                }
                if (i49 != 0) {
                    function2 = null;
                }
                if (i17 != 0) {
                    function4 = null;
                }
                if (i19 != 0) {
                    z14 = false;
                }
                if (i25 != 0) {
                    objM87133R2 = c28655q4.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C4139w0(7);
                        c28655q4.m87172p0(objM87133R2);
                    }
                    interfaceC4351m7 = (InterfaceC4351m) objM87133R2;
                } else {
                    interfaceC4351m7 = interfaceC4351m3;
                }
                if (i27 != 0) {
                    objM87133R = c28655q4.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C4139w0(8);
                        c28655q4.m87172p0(objM87133R);
                    }
                    interfaceC4351m8 = (InterfaceC4351m) objM87133R;
                } else {
                    interfaceC4351m8 = interfaceC4351m2;
                }
                if (i29 != 0) {
                    z18 = false;
                } else {
                    z18 = z13;
                }
                if (i35 != 0) {
                    c4656v3 = null;
                }
                if (i38 != 0) {
                    str = null;
                    C37816b c37816bM121344e111 = AbstractC37817c.m121344e(-633821104, c28655q4, new InterfaceC4340b() { // from class: cp0.i0
                        @Override // c93.InterfaceC4340b
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
                            int iIntValue = ((Integer) obj10).intValue();
                            return AbstractC10969j0.m29137R(interfaceC40915c3, bottomSheetState, z18, c4656v3, (C32645n0) obj, (InterfaceC4339a) obj2, (InterfaceC4353o) obj3, (Function1) obj4, (Function1) obj5, (InterfaceC4339a) obj6, (String) obj7, (Function3) obj8, (C28655q) ((Composer) obj9), iIntValue);
                        }
                    });
                    c4656v2 = c4656v3;
                    i45 = i16;
                    function7 = function2;
                    function8 = function4;
                    interfaceC2994c4 = interfaceC2994c3;
                    z19 = z14;
                    interfaceC4351m9 = interfaceC4351m7;
                    interfaceC4351m10 = interfaceC4351m8;
                    z24 = z18;
                    interfaceC4340b3 = c37816bM121344e111;
                } else {
                    str = null;
                    interfaceC4340b3 = interfaceC4340b;
                    c4656v2 = c4656v3;
                    i45 = i16;
                    function7 = function2;
                    function8 = function4;
                    interfaceC2994c4 = interfaceC2994c3;
                    z19 = z14;
                    interfaceC4351m9 = interfaceC4351m7;
                    interfaceC4351m10 = interfaceC4351m8;
                    z24 = z18;
                }
            } else {
                if (i48 != 0) {
                    interfaceC40915c3 = null;
                } else {
                    interfaceC40915c3 = interfaceC40915c;
                }
                if ((i15 & 8) != 0) {
                    objM87133R3 = c28655q4.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87262p(c28655q4);
                        c28655q4.m87172p0(objM87133R3);
                    }
                    interfaceC2994c3 = (InterfaceC2994c0) objM87133R3;
                    i16 &= -7169;
                } else {
                    interfaceC2994c3 = interfaceC2994c1;
                }
                if (i49 != 0) {
                    function2 = null;
                }
                if (i17 != 0) {
                    function4 = null;
                }
                if (i19 != 0) {
                    z14 = false;
                }
                if (i25 != 0) {
                    objM87133R2 = c28655q4.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C4139w0(7);
                        c28655q4.m87172p0(objM87133R2);
                    }
                    interfaceC4351m7 = (InterfaceC4351m) objM87133R2;
                } else {
                    interfaceC4351m7 = interfaceC4351m3;
                }
                if (i27 != 0) {
                    objM87133R = c28655q4.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C4139w0(8);
                        c28655q4.m87172p0(objM87133R);
                    }
                    interfaceC4351m8 = (InterfaceC4351m) objM87133R;
                } else {
                    interfaceC4351m8 = interfaceC4351m2;
                }
                if (i29 != 0) {
                    z18 = false;
                } else {
                    z18 = z13;
                }
                if (i35 != 0) {
                    c4656v3 = null;
                }
                if (i38 != 0) {
                    str = null;
                    C37816b c37816bM121344e112 = AbstractC37817c.m121344e(-633821104, c28655q4, new InterfaceC4340b() { // from class: cp0.i0
                        @Override // c93.InterfaceC4340b
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
                            int iIntValue = ((Integer) obj10).intValue();
                            return AbstractC10969j0.m29137R(interfaceC40915c3, bottomSheetState, z18, c4656v3, (C32645n0) obj, (InterfaceC4339a) obj2, (InterfaceC4353o) obj3, (Function1) obj4, (Function1) obj5, (InterfaceC4339a) obj6, (String) obj7, (Function3) obj8, (C28655q) ((Composer) obj9), iIntValue);
                        }
                    });
                    c4656v2 = c4656v3;
                    i45 = i16;
                    function7 = function2;
                    function8 = function4;
                    interfaceC2994c4 = interfaceC2994c3;
                    z19 = z14;
                    interfaceC4351m9 = interfaceC4351m7;
                    interfaceC4351m10 = interfaceC4351m8;
                    z24 = z18;
                    interfaceC4340b3 = c37816bM121344e112;
                } else {
                    str = null;
                    interfaceC4340b3 = interfaceC4340b;
                    c4656v2 = c4656v3;
                    i45 = i16;
                    function7 = function2;
                    function8 = function4;
                    interfaceC2994c4 = interfaceC2994c3;
                    z19 = z14;
                    interfaceC4351m9 = interfaceC4351m7;
                    interfaceC4351m10 = interfaceC4351m8;
                    z24 = z18;
                }
            }
            c28655q4.m87175r();
            zM87153g = c28655q4.m87153g(bottomSheetState.getScreenContext());
            objM87133R4 = c28655q4.m87133R();
            if (zM87153g) {
                objM87133R4 = m29172f1(bottomSheetState.getScreenContext());
                c28655q4.m87172p0(objM87133R4);
            } else {
                objM87133R4 = m29172f1(bottomSheetState.getScreenContext());
                c28655q4.m87172p0(objM87133R4);
            }
            final C32645n0 c32645n7 = (C32645n0) objM87133R4;
            FeatureFlagChecker featureFlagChecker8 = (FeatureFlagChecker) c28655q4.m87161k(AbstractC38073e.m121968p());
            C10978m0.Companion aVar8 = C10978m0.INSTANCE;
            zM29247c = aVar8.m29247c(bottomSheetState.getScreenContext());
            zM29246b = aVar8.m29246b(bottomSheetState.getCustomDrawerPresentation(), bottomSheetState.getShouldOpenFullSize(), zM29247c, bottomSheetState.getReadOnlyHalfSheet());
            final boolean zIsFeatureEnabled9 = featureFlagChecker8.isFeatureEnabled("wce-padding-keyboard-fix");
            zIsFeatureEnabled = featureFlagChecker8.isFeatureEnabled("context-hub-profile");
            Set setM74059b8 = AbstractC25260n.m74059b1(new String[]{"CONTEXT_HUB", "CONTEXT_DETAILS"});
            c13404jM29240h = bottomSheetState.getScreenContext();
            if (c13404jM29240h != null) {
                screenId = c13404jM29240h.getScreenId();
            } else {
                screenId = str;
            }
            zM74155w0 = AbstractC25265s.m74155w0(setM74059b8, screenId);
            objM87133R5 = c28655q4.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC28683x.m87272z(str);
                c28655q4.m87172p0(objM87133R5);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
            objM87133R6 = c28655q4.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = AbstractC28683x.m87272z(str);
                c28655q4.m87172p0(objM87133R6);
            }
            final InterfaceC28601c1 interfaceC28601c111118 = (InterfaceC28601c1) objM87133R6;
            objM87133R7 = c28655q4.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = AbstractC28683x.m87272z(str);
                c28655q4.m87172p0(objM87133R7);
            }
            final InterfaceC28601c1 interfaceC28601c111119 = (InterfaceC28601c1) objM87133R7;
            objM87133R8 = c28655q4.m87133R();
            if (objM87133R8 == c28676v0) {
                objM87133R8 = AbstractC28683x.m87272z("");
                c28655q4.m87172p0(objM87133R8);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R8;
            final InterfaceC40915c interfaceC40915c11 = interfaceC40915c3;
            objM87133R9 = c28655q4.m87133R();
            if (objM87133R9 == c28676v0) {
                objM87133R9 = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q4.m87172p0(objM87133R9);
            }
            interfaceC28601c3 = (InterfaceC28601c1) objM87133R9;
            objM87133R10 = c28655q4.m87133R();
            if (objM87133R10 == c28676v0) {
                objM87133R10 = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q4.m87172p0(objM87133R10);
            }
            final InterfaceC28601c1 interfaceC28601c1111110 = (InterfaceC28601c1) objM87133R10;
            objM87133R11 = c28655q4.m87133R();
            if (objM87133R11 == c28676v0) {
                objM87133R11 = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q4.m87172p0(objM87133R11);
            }
            interfaceC28601c4 = (InterfaceC28601c1) objM87133R11;
            if (zIsFeatureEnabled) {
                z25 = zM74155w0;
            } else {
                z25 = true;
            }
            if (m29143U(interfaceC28601c4)) {
                z26 = false;
            } else {
                z26 = false;
            }
            if (zIsFeatureEnabled) {
                z27 = false;
            } else {
                z27 = false;
            }
            if (m29133P(interfaceC28601c3)) {
                c28655q4.m87150e0(2094451546);
                C37816b c37816bM121344e113 = AbstractC37817c.m121344e(36773779, c28655q4, new C0003a0(19, interfaceC28601c2, interfaceC28601c1));
                c28655q4.m87173q(false);
                r10 = c37816bM121344e113;
            } else {
                c28655q4.m87150e0(2094652488);
                c28655q4.m87173q(false);
                r10 = str;
            }
            final boolean z51210 = z27;
            final boolean z51211 = z26;
            c10962h = new C10962h(r10, AbstractC37817c.m121344e(-582148231, c28655q4, new InterfaceC4351m() { // from class: cp0.b0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC10969j0.m29151Y(z51211, z51210, zIsFeatureEnabled, interfaceC28601c111118, interfaceC28601c111119, (Composer) obj, iIntValue);
                }
            }));
            c10962hM29242j = bottomSheetState.getToolbarContent();
            if (c10962hM29242j == null) {
                c10962h = c10962hM29242j;
            } else if (zM29247c) {
                ?? r111 = str;
                c10962h = new C10962h(r111, r111, 3, r111);
            }
            fM29245a = aVar8.m29245a(bottomSheetState.getCustomDrawerPresentation());
            objM87133R12 = c28655q4.m87133R();
            if (objM87133R12 == c28676v0) {
                objM87133R12 = AbstractC28683x.m87272z(bottomSheetState.getInitialSheetState());
                c28655q4.m87172p0(objM87133R12);
            }
            interfaceC28601c5 = (InterfaceC28601c1) objM87133R12;
            objM87133R13 = c28655q4.m87133R();
            if (objM87133R13 == c28676v0) {
                objM87133R13 = AbstractC28683x.m87272z(bottomSheetState.getInitialSheetState());
                c28655q4.m87172p0(objM87133R13);
            }
            interfaceC28601c6 = (InterfaceC28601c1) objM87133R13;
            objM87133R14 = c28655q4.m87133R();
            if (objM87133R14 == c28676v0) {
                objM87133R14 = AbstractC11266d.m30468v(bottomSheetState.getInitialHeightFraction(), c28655q4);
            }
            interfaceC28690z0 = (InterfaceC28690z0) objM87133R14;
            objM87133R15 = c28655q4.m87133R();
            if (objM87133R15 == c28676v0) {
                if (bottomSheetState.getInitialSheetState() == EnumC11003u1.Hidden) {
                    f16 = 0.0f;
                } else {
                    f16 = 1.0f;
                }
                objM87133R15 = AbstractC11266d.m30468v(f16, c28655q4);
            }
            interfaceC28690z1 = (InterfaceC28690z0) objM87133R15;
            objM87133R16 = c28655q4.m87133R();
            if (objM87133R16 == c28676v0) {
                objM87133R16 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q4.m87172p0(objM87133R16);
            }
            interfaceC28601c7 = (InterfaceC28601c1) objM87133R16;
            objM87133R17 = c28655q4.m87133R();
            if (objM87133R17 == c28676v0) {
                objM87133R17 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q4.m87172p0(objM87133R17);
            }
            final InterfaceC28601c1 interfaceC28601c1111111 = (InterfaceC28601c1) objM87133R17;
            objM87133R18 = c28655q4.m87133R();
            if (objM87133R18 == c28676v0) {
                objM87133R18 = AbstractC11266d.m30468v(0.0f, c28655q4);
            }
            interfaceC28690z2 = (InterfaceC28690z0) objM87133R18;
            zM87153g2 = c28655q4.m87153g(interfaceC2994c4);
            interfaceC2994c5 = interfaceC2994c4;
            Object objM87133R212 = c28655q4.m87133R();
            if (zM87153g2) {
                final int i5111111 = 0;
                final int i5111112 = 1;
                final int i5111113 = 2;
                interfaceC28601c8 = interfaceC28601c1;
                z28 = zM29246b;
                f13 = fM29245a;
                c28676v1 = c28676v0;
                interfaceC2994c6 = interfaceC2994c5;
                c28655q2 = c28655q4;
                z29 = zM29247c;
                c11011y0 = new C11011y0(interfaceC2994c6, z29, new InterfaceC4339a() { // from class: cp0.c0
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        float fM29188n0;
                        switch (i5111111) {
                            case 0:
                                fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z2);
                                break;
                            case 1:
                                fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z2);
                                break;
                            default:
                                fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z2);
                                break;
                        }
                        return Float.valueOf(fM29188n0);
                    }
                }, new C10992r(1, interfaceC28601c5), new InterfaceC4339a() { // from class: cp0.c0
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        float fM29188n0;
                        switch (i5111112) {
                            case 0:
                                fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z1);
                                break;
                            case 1:
                                fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z1);
                                break;
                            default:
                                fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z1);
                                break;
                        }
                        return Float.valueOf(fM29188n0);
                    }
                }, new InterfaceC4339a() { // from class: cp0.c0
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        float fM29188n0;
                        switch (i5111113) {
                            case 0:
                                fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z0);
                                break;
                            case 1:
                                fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z0);
                                break;
                            default:
                                fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z0);
                                break;
                        }
                        return Float.valueOf(fM29188n0);
                    }
                }, new C10975l0(interfaceC28690z1, 3), new C10975l0(interfaceC28690z0, 4), new C10972k0(7, interfaceC28601c5), new C10972k0(11, interfaceC28601c7), onDismiss);
                c28655q2.m87172p0(c11011y0);
            } else {
                final int i5111114 = 0;
                final int i5111115 = 1;
                final int i5111116 = 2;
                interfaceC28601c8 = interfaceC28601c1;
                z28 = zM29246b;
                f13 = fM29245a;
                c28676v1 = c28676v0;
                interfaceC2994c6 = interfaceC2994c5;
                c28655q2 = c28655q4;
                z29 = zM29247c;
                c11011y0 = new C11011y0(interfaceC2994c6, z29, new InterfaceC4339a() { // from class: cp0.c0
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        float fM29188n0;
                        switch (i5111114) {
                            case 0:
                                fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z2);
                                break;
                            case 1:
                                fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z2);
                                break;
                            default:
                                fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z2);
                                break;
                        }
                        return Float.valueOf(fM29188n0);
                    }
                }, new C10992r(1, interfaceC28601c5), new InterfaceC4339a() { // from class: cp0.c0
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        float fM29188n0;
                        switch (i5111115) {
                            case 0:
                                fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z1);
                                break;
                            case 1:
                                fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z1);
                                break;
                            default:
                                fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z1);
                                break;
                        }
                        return Float.valueOf(fM29188n0);
                    }
                }, new InterfaceC4339a() { // from class: cp0.c0
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        float fM29188n0;
                        switch (i5111116) {
                            case 0:
                                fM29188n0 = AbstractC10969j0.m29188n0(interfaceC28690z0);
                                break;
                            case 1:
                                fM29188n0 = AbstractC10969j0.m29192p0(interfaceC28690z0);
                                break;
                            default:
                                fM29188n0 = AbstractC10969j0.m29194q0(interfaceC28690z0);
                                break;
                        }
                        return Float.valueOf(fM29188n0);
                    }
                }, new C10975l0(interfaceC28690z1, 3), new C10975l0(interfaceC28690z0, 4), new C10972k0(7, interfaceC28601c5), new C10972k0(11, interfaceC28601c7), onDismiss);
                c28655q2.m87172p0(c11011y0);
            }
            final C11011y0 c11011y8 = (C11011y0) c11011y0;
            c13404jM29240h2 = bottomSheetState.getScreenContext();
            if (c13404jM29240h2 != null) {
                source = "";
            } else {
                source = "";
            }
            EnumC11003u1 enumC11003u1M29159b7 = m29159b0(interfaceC28601c5);
            if ((i45 & 234881024) == 67108864) {
                z34 = true;
            } else {
                z34 = false;
            }
            boolean zM87153g11 = z34 | c28655q2.m87153g(source);
            if ((i45 & 3670016) == 1048576) {
                z35 = true;
            } else {
                z35 = false;
            }
            boolean z5218 = zM87153g11 | z35;
            if ((i45 & 29360128) == 8388608) {
                z36 = true;
            } else {
                z36 = false;
            }
            z37 = z5218 | z36;
            objM87133R19 = c28655q2.m87133R();
            if (z37) {
                boolean z5219 = z19;
                InterfaceC4351m interfaceC4351m1111111 = interfaceC4351m9;
                InterfaceC4351m interfaceC4351m1111112 = interfaceC4351m10;
                objM87133R19 = new a(interfaceC4351m1111112, source, z5219, interfaceC4351m1111111, interfaceC28601c6, interfaceC28601c5, null);
                interfaceC4351m11 = interfaceC4351m1111112;
                interfaceC4351m12 = interfaceC4351m1111111;
                z38 = z5219;
                c28655q2.m87172p0(objM87133R19);
            } else {
                boolean z52110 = z19;
                InterfaceC4351m interfaceC4351m1111113 = interfaceC4351m9;
                InterfaceC4351m interfaceC4351m1111114 = interfaceC4351m10;
                objM87133R19 = new a(interfaceC4351m1111114, source, z52110, interfaceC4351m1111113, interfaceC28601c6, interfaceC28601c5, null);
                interfaceC4351m11 = interfaceC4351m1111114;
                interfaceC4351m12 = interfaceC4351m1111113;
                z38 = z52110;
                c28655q2.m87172p0(objM87133R19);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R19, enumC11003u1M29159b7);
            float fM29171f7 = m29171f0(interfaceC28690z0);
            if (m29180j0(interfaceC28601c7)) {
                c11347e2M30574v = AbstractC11348f.m30574v(0, 0, null, 6);
            } else {
                c11347e2M30574v = AbstractC11348f.m30574v(300, 0, null, 6);
            }
            c28655q3 = c28655q2;
            final InterfaceC28670t2 interfaceC28670t2M30588b9 = AbstractC11352g.m30588b(fM29171f7, c11347e2M30574v, "bottomSheetHeight", null, c28655q3, 3072, 20);
            interfaceC39171c = (InterfaceC39171c) c28655q3.m87161k(AbstractC2453v1.f9569h);
            if (bottomSheetState.getImeHeightPx() > 0) {
                z39 = true;
            } else {
                z39 = false;
            }
            float fM29176h7 = m29176h0(interfaceC28690z1);
            if (m29180j0(interfaceC28601c7)) {
                c11347e2M30574v2 = AbstractC11348f.m30574v(0, 0, null, 6);
            } else {
                c11347e2M30574v2 = AbstractC11348f.m30574v(300, 0, null, 6);
            }
            interfaceC28670t2M30588b = AbstractC11352g.m30588b(fM29176h7, c11347e2M30574v2, "heroProgress", null, c28655q3, 3072, 20);
            Float fValueOf119 = Float.valueOf(m29208x0(interfaceC28670t2M30588b));
            if ((i45 & 57344) == 16384) {
                z44 = true;
            } else {
                z44 = false;
            }
            zM87153g3 = z44 | c28655q3.m87153g(interfaceC28670t2M30588b);
            objM87133R20 = c28655q3.m87133R();
            if (zM87153g3) {
                objM87133R20 = new b(function7, interfaceC28670t2M30588b, null);
                c28655q3.m87172p0(objM87133R20);
            } else {
                objM87133R20 = new b(function7, interfaceC28670t2M30588b, null);
                c28655q3.m87172p0(objM87133R20);
            }
            AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R20, fValueOf119);
            Boolean boolValueOf119 = Boolean.valueOf(bottomSheetState.getVisible());
            i46 = i45 & 14;
            if (i46 != 4) {
                if ((i45 & 8) != 0) {
                    c10978m0 = bottomSheetState;
                    if (c28655q3.m87157i(c10978m0)) {
                    }
                    boolean zM87155h11114 = z45 | c28655q3.m87155h(z28);
                    z46 = z28;
                    f14 = f13;
                    zM87147d = zM87155h11114 | c28655q3.m87147d(f14);
                    objM87133R21 = c28655q3.m87133R();
                    if (zM87147d) {
                        objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                        f15 = f14;
                        c28655q3.m87172p0(objM87133R21);
                    } else {
                        objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                        f15 = f14;
                        c28655q3.m87172p0(objM87133R21);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R21, boolValueOf119);
                    Float fValueOf1110 = Float.valueOf(f15);
                    if (i46 != 4) {
                        z47 = true;
                    } else {
                        z47 = true;
                    }
                    zM87147d2 = z47 | c28655q3.m87147d(f15);
                    objM87133R22 = c28655q3.m87133R();
                    if (zM87147d2) {
                        objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                        c28655q3.m87172p0(objM87133R22);
                    } else {
                        objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                        c28655q3.m87172p0(objM87133R22);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R22, fValueOf1110);
                    Boolean boolValueOf1110 = Boolean.valueOf(z39);
                    boolean zM87155h11115 = c28655q3.m87155h(z39);
                    if (i46 != 4) {
                        z48 = true;
                    } else {
                        z48 = true;
                    }
                    z49 = zM87155h11115 | z48;
                    objM87133R23 = c28655q3.m87133R();
                    if (z49) {
                        objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                        c28655q3.m87172p0(objM87133R23);
                    } else {
                        objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                        c28655q3.m87172p0(objM87133R23);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R23, boolValueOf1110);
                    boolean zM29243k112 = bottomSheetState.getVisible();
                    zM87155h = c28655q3.m87155h(z29) | c28655q3.m87147d(f15) | c28655q3.m87157i(interfaceC2994c6) | ((i45 & 112) == 32);
                    objM87133R24 = c28655q3.m87133R();
                    if (zM87155h) {
                        final InterfaceC2994c0 interfaceC2994c11119 = interfaceC2994c6;
                        final boolean z51111111112 = z29;
                        final float f111118 = f15;
                        objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC10969j0.m29210y0(z51111111112, f111118, interfaceC2994c11119, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                            }
                        };
                        c28655q3.m87172p0(objM87133R24);
                    } else {
                        final InterfaceC2994c0 interfaceC2994c111110 = interfaceC2994c6;
                        final boolean z51111111113 = z29;
                        final float f111119 = f15;
                        objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC10969j0.m29210y0(z51111111113, f111119, interfaceC2994c111110, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                            }
                        };
                        c28655q3.m87172p0(objM87133R24);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R24, zM29243k112, c28655q3, 0, 0);
                    if (bottomSheetState.getVisible()) {
                    }
                    InterfaceC4351m interfaceC4351m1111115 = interfaceC4351m12;
                    final boolean z51111111114 = z24;
                    final InterfaceC4340b interfaceC4340b116 = interfaceC4340b3;
                    C28673u1[] c28673u1Arr112 = {f34074a.mo86977a(Boolean.valueOf(bottomSheetState.getVisible())), f34075b.mo86977a(m29159b0(interfaceC28601c5)), f34076c.mo86977a(c11011y8)};
                    final Function3 function1112 = function8;
                    final C10962h c10962h113 = c10962h;
                    final InterfaceC28601c1 interfaceC28601c1111112 = interfaceC28601c8;
                    final InterfaceC39171c interfaceC39171c114 = interfaceC39171c2;
                    final boolean z51111111115 = z29;
                    AbstractC28683x.m87248b(c28673u1Arr112, AbstractC37817c.m121344e(1438636126, c28655q3, new InterfaceC4351m() { // from class: cp0.h0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC10969j0.m29104A0(interfaceC39171c114, zIsFeatureEnabled9, bottomSheetState, c32645n7, z51111111115, c10962h113, c11011y8, z51111111114, onDismiss, function1112, interfaceC4340b116, interfaceC28690z2, interfaceC28670t2M30588b, interfaceC28670t2M30588b9, interfaceC28601c5, interfaceC28601c7, interfaceC28601c1111111, interfaceC28601c2, interfaceC28601c1111112, interfaceC28601c111118, interfaceC28601c111119, interfaceC28601c3, interfaceC28601c1111110, interfaceC28601c4, (Composer) obj, iIntValue);
                        }
                    }), c28655q3, 56);
                    c28655q = c28655q3;
                    z16 = z51111111114;
                    interfaceC4340b2 = interfaceC4340b116;
                    function6 = function1112;
                    interfaceC2994c2 = interfaceC2994c6;
                    z17 = z38;
                    interfaceC4351m4 = interfaceC4351m1111115;
                    interfaceC4351m5 = interfaceC4351m11;
                    function5 = function7;
                    interfaceC40915c2 = interfaceC40915c11;
                    c4656v1 = c4656v2;
                } else {
                    c10978m0 = bottomSheetState;
                }
                interfaceC39171c2 = interfaceC39171c;
                z45 = false;
                boolean zM87155h11116 = z45 | c28655q3.m87155h(z28);
                z46 = z28;
                f14 = f13;
                zM87147d = zM87155h11116 | c28655q3.m87147d(f14);
                objM87133R21 = c28655q3.m87133R();
                if (zM87147d) {
                    objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                    f15 = f14;
                    c28655q3.m87172p0(objM87133R21);
                } else {
                    objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                    f15 = f14;
                    c28655q3.m87172p0(objM87133R21);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R21, boolValueOf119);
                Float fValueOf1111 = Float.valueOf(f15);
                if (i46 != 4) {
                    z47 = true;
                } else {
                    z47 = true;
                }
                zM87147d2 = z47 | c28655q3.m87147d(f15);
                objM87133R22 = c28655q3.m87133R();
                if (zM87147d2) {
                    objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                    c28655q3.m87172p0(objM87133R22);
                } else {
                    objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                    c28655q3.m87172p0(objM87133R22);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R22, fValueOf1111);
                Boolean boolValueOf1111 = Boolean.valueOf(z39);
                boolean zM87155h11117 = c28655q3.m87155h(z39);
                if (i46 != 4) {
                    z48 = true;
                } else {
                    z48 = true;
                }
                z49 = zM87155h11117 | z48;
                objM87133R23 = c28655q3.m87133R();
                if (z49) {
                    objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                    c28655q3.m87172p0(objM87133R23);
                } else {
                    objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                    c28655q3.m87172p0(objM87133R23);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R23, boolValueOf1111);
                boolean zM29243k113 = bottomSheetState.getVisible();
                zM87155h = c28655q3.m87155h(z29) | c28655q3.m87147d(f15) | c28655q3.m87157i(interfaceC2994c6) | ((i45 & 112) == 32);
                objM87133R24 = c28655q3.m87133R();
                if (zM87155h) {
                    final InterfaceC2994c0 interfaceC2994c111111 = interfaceC2994c6;
                    final boolean z51111111116 = z29;
                    final float f1111110 = f15;
                    objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return AbstractC10969j0.m29210y0(z51111111116, f1111110, interfaceC2994c111111, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                        }
                    };
                    c28655q3.m87172p0(objM87133R24);
                } else {
                    final InterfaceC2994c0 interfaceC2994c111112 = interfaceC2994c6;
                    final boolean z51111111117 = z29;
                    final float f1111111 = f15;
                    objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return AbstractC10969j0.m29210y0(z51111111117, f1111111, interfaceC2994c111112, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                        }
                    };
                    c28655q3.m87172p0(objM87133R24);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R24, zM29243k113, c28655q3, 0, 0);
                if (bottomSheetState.getVisible()) {
                }
                InterfaceC4351m interfaceC4351m1111116 = interfaceC4351m12;
                final boolean z51111111118 = z24;
                final InterfaceC4340b interfaceC4340b117 = interfaceC4340b3;
                C28673u1[] c28673u1Arr113 = {f34074a.mo86977a(Boolean.valueOf(bottomSheetState.getVisible())), f34075b.mo86977a(m29159b0(interfaceC28601c5)), f34076c.mo86977a(c11011y8)};
                final Function3 function1113 = function8;
                final C10962h c10962h114 = c10962h;
                final InterfaceC28601c1 interfaceC28601c1111113 = interfaceC28601c8;
                final InterfaceC39171c interfaceC39171c115 = interfaceC39171c2;
                final boolean z51111111119 = z29;
                AbstractC28683x.m87248b(c28673u1Arr113, AbstractC37817c.m121344e(1438636126, c28655q3, new InterfaceC4351m() { // from class: cp0.h0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC10969j0.m29104A0(interfaceC39171c115, zIsFeatureEnabled9, bottomSheetState, c32645n7, z51111111119, c10962h114, c11011y8, z51111111118, onDismiss, function1113, interfaceC4340b117, interfaceC28690z2, interfaceC28670t2M30588b, interfaceC28670t2M30588b9, interfaceC28601c5, interfaceC28601c7, interfaceC28601c1111111, interfaceC28601c2, interfaceC28601c1111113, interfaceC28601c111118, interfaceC28601c111119, interfaceC28601c3, interfaceC28601c1111110, interfaceC28601c4, (Composer) obj, iIntValue);
                    }
                }), c28655q3, 56);
                c28655q = c28655q3;
                z16 = z51111111118;
                interfaceC4340b2 = interfaceC4340b117;
                function6 = function1113;
                interfaceC2994c2 = interfaceC2994c6;
                z17 = z38;
                interfaceC4351m4 = interfaceC4351m1111116;
                interfaceC4351m5 = interfaceC4351m11;
                function5 = function7;
                interfaceC40915c2 = interfaceC40915c11;
                c4656v1 = c4656v2;
            } else {
                c10978m0 = bottomSheetState;
            }
            interfaceC39171c2 = interfaceC39171c;
            z45 = true;
            boolean zM87155h11118 = z45 | c28655q3.m87155h(z28);
            z46 = z28;
            f14 = f13;
            zM87147d = zM87155h11118 | c28655q3.m87147d(f14);
            objM87133R21 = c28655q3.m87133R();
            if (zM87147d) {
                objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                f15 = f14;
                c28655q3.m87172p0(objM87133R21);
            } else {
                objM87133R21 = new c(c10978m0, z46, f14, interfaceC28601c5, interfaceC28690z1, interfaceC28690z0, null);
                f15 = f14;
                c28655q3.m87172p0(objM87133R21);
            }
            AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R21, boolValueOf119);
            Float fValueOf1112 = Float.valueOf(f15);
            if (i46 != 4) {
                z47 = true;
            } else {
                z47 = true;
            }
            zM87147d2 = z47 | c28655q3.m87147d(f15);
            objM87133R22 = c28655q3.m87133R();
            if (zM87147d2) {
                objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                c28655q3.m87172p0(objM87133R22);
            } else {
                objM87133R22 = new d(c10978m0, f15, interfaceC28601c5, interfaceC28690z0, null);
                c28655q3.m87172p0(objM87133R22);
            }
            AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R22, fValueOf1112);
            Boolean boolValueOf1112 = Boolean.valueOf(z39);
            boolean zM87155h11119 = c28655q3.m87155h(z39);
            if (i46 != 4) {
                z48 = true;
            } else {
                z48 = true;
            }
            z49 = zM87155h11119 | z48;
            objM87133R23 = c28655q3.m87133R();
            if (z49) {
                objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                c28655q3.m87172p0(objM87133R23);
            } else {
                objM87133R23 = new e(z39, c10978m0, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1, null);
                c28655q3.m87172p0(objM87133R23);
            }
            AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R23, boolValueOf1112);
            boolean zM29243k114 = bottomSheetState.getVisible();
            zM87155h = c28655q3.m87155h(z29) | c28655q3.m87147d(f15) | c28655q3.m87157i(interfaceC2994c6) | ((i45 & 112) == 32);
            objM87133R24 = c28655q3.m87133R();
            if (zM87155h) {
                final InterfaceC2994c0 interfaceC2994c111113 = interfaceC2994c6;
                final boolean z511111111110 = z29;
                final float f1111112 = f15;
                objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        return AbstractC10969j0.m29210y0(z511111111110, f1111112, interfaceC2994c111113, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                    }
                };
                c28655q3.m87172p0(objM87133R24);
            } else {
                final InterfaceC2994c0 interfaceC2994c111114 = interfaceC2994c6;
                final boolean z511111111111 = z29;
                final float f1111113 = f15;
                objM87133R24 = new InterfaceC4339a() { // from class: cp0.f0
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        return AbstractC10969j0.m29210y0(z511111111111, f1111113, interfaceC2994c111114, onDismiss, interfaceC28601c5, interfaceC28690z0, interfaceC28690z1);
                    }
                };
                c28655q3.m87172p0(objM87133R24);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R24, zM29243k114, c28655q3, 0, 0);
            if (bottomSheetState.getVisible()) {
            }
            InterfaceC4351m interfaceC4351m1111117 = interfaceC4351m12;
            final boolean z511111111112 = z24;
            final InterfaceC4340b interfaceC4340b118 = interfaceC4340b3;
            C28673u1[] c28673u1Arr114 = {f34074a.mo86977a(Boolean.valueOf(bottomSheetState.getVisible())), f34075b.mo86977a(m29159b0(interfaceC28601c5)), f34076c.mo86977a(c11011y8)};
            final Function3 function1114 = function8;
            final C10962h c10962h115 = c10962h;
            final InterfaceC28601c1 interfaceC28601c1111114 = interfaceC28601c8;
            final InterfaceC39171c interfaceC39171c116 = interfaceC39171c2;
            final boolean z511111111113 = z29;
            AbstractC28683x.m87248b(c28673u1Arr114, AbstractC37817c.m121344e(1438636126, c28655q3, new InterfaceC4351m() { // from class: cp0.h0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC10969j0.m29104A0(interfaceC39171c116, zIsFeatureEnabled9, bottomSheetState, c32645n7, z511111111113, c10962h115, c11011y8, z511111111112, onDismiss, function1114, interfaceC4340b118, interfaceC28690z2, interfaceC28670t2M30588b, interfaceC28670t2M30588b9, interfaceC28601c5, interfaceC28601c7, interfaceC28601c1111111, interfaceC28601c2, interfaceC28601c1111114, interfaceC28601c111118, interfaceC28601c111119, interfaceC28601c3, interfaceC28601c1111110, interfaceC28601c4, (Composer) obj, iIntValue);
                }
            }), c28655q3, 56);
            c28655q = c28655q3;
            z16 = z511111111112;
            interfaceC4340b2 = interfaceC4340b118;
            function6 = function1114;
            interfaceC2994c2 = interfaceC2994c6;
            z17 = z38;
            interfaceC4351m4 = interfaceC4351m1111117;
            interfaceC4351m5 = interfaceC4351m11;
            function5 = function7;
            interfaceC40915c2 = interfaceC40915c11;
            c4656v1 = c4656v2;
        } else {
            c28655q4.m87138X();
            z16 = z13;
            interfaceC4340b2 = interfaceC4340b;
            c28655q = c28655q4;
            function5 = function2;
            function6 = function4;
            z17 = z14;
            interfaceC2994c2 = interfaceC2994c1;
            interfaceC4351m4 = interfaceC4351m3;
            interfaceC4351m5 = interfaceC4351m2;
            c4656v1 = c4656v3;
            interfaceC40915c2 = interfaceC40915c;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final int i5111117 = 1;
            interfaceC4351m6 = new InterfaceC4351m() { // from class: cp0.g0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    switch (i5111117) {
                        case 0:
                            return AbstractC10969j0.m29212z0(bottomSheetState, onDismiss, interfaceC40915c2, interfaceC2994c2, function5, function6, z17, interfaceC4351m4, interfaceC4351m5, z16, c4656v1, interfaceC4340b2, i13, i14, i15, composer2, ((Integer) obj2).intValue());
                        default:
                            return AbstractC10969j0.m29126L0(bottomSheetState, onDismiss, interfaceC40915c2, interfaceC2994c2, function5, function6, z17, interfaceC4351m4, interfaceC4351m5, z16, c4656v1, interfaceC4340b2, i13, i14, i15, composer2, ((Integer) obj2).intValue());
                    }
                }
            };
            c28677v1 = c28677v1M87180u;
            c28677v1.f115982d = interfaceC4351m6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final C23454a0 m29120I0(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m29131O(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m29121J(String str, boolean z4) {
        AbstractC22676k.m65750j(str, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final C23454a0 m29122J0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        m29135Q(interfaceC28601c1, z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m29123K(String str, boolean z4) {
        AbstractC22676k.m65750j(str, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final C23454a0 m29124K0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        m29141T(interfaceC28601c1, z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: L */
    private static final InterfaceC4339a m29125L(InterfaceC28601c1 interfaceC28601c1) {
        return (InterfaceC4339a) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final C23454a0 m29126L0(C10978m0 c10978m0, Function1 function1, InterfaceC40915c interfaceC40915c, InterfaceC2994c0 interfaceC2994c0, Function1 function2, Function3 function3, boolean z4, InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2, boolean z13, C4656v0 c4656v0, InterfaceC4340b interfaceC4340b, int i13, int i14, int i15, Composer composer, int i16) {
        m29119I(c10978m0, function1, interfaceC40915c, interfaceC2994c0, function2, function3, z4, interfaceC4351m, interfaceC4351m2, z13, c4656v0, interfaceC4340b, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: M */
    private static final void m29127M(InterfaceC28601c1 interfaceC28601c1, InterfaceC4339a interfaceC4339a) {
        interfaceC28601c1.setValue(interfaceC4339a);
    }

    /* JADX INFO: renamed from: M0 */
    private static final void m29128M0(InterfaceC28601c1 interfaceC28601c1, InterfaceC4339a interfaceC4339a) {
        interfaceC28601c1.setValue(interfaceC4339a);
    }

    /* JADX INFO: renamed from: N */
    private static final String m29129N(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: N0 */
    private static final InterfaceC4339a m29130N0(InterfaceC28601c1 interfaceC28601c1) {
        return (InterfaceC4339a) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: O */
    private static final void m29131O(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: O0 */
    private static final void m29132O0(InterfaceC28601c1 interfaceC28601c1, InterfaceC4339a interfaceC4339a) {
        interfaceC28601c1.setValue(interfaceC4339a);
    }

    /* JADX INFO: renamed from: P */
    private static final boolean m29133P(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: P0 */
    public static final void m29134P0(C32645n0 screenArgs, InterfaceC4339a onBackPressed, InterfaceC4353o interfaceC4353o, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a, EnumC11003u1 enumC11003u1, Function3 function3, InterfaceC40915c interfaceC40915c, boolean z4, boolean z13, C4656v0 c4656v0, Composer composer, int i13, int i14, int i15) {
        int i16;
        InterfaceC4353o interfaceC4353o2;
        Function1 function4;
        InterfaceC4339a interfaceC4339a2;
        Function3 function5;
        int i17;
        EnumC11003u1 enumC11003u2;
        boolean z14;
        boolean z15;
        C4656v0 c4656v1;
        C28655q c28655q;
        InterfaceC40915c interfaceC40915c2;
        InterfaceC13037f2 interfaceC13037f2Mo132622e;
        EnumC11003u1 enumC11003u3;
        Function3 function6;
        C4656v0 c4656v0M14712i;
        AbstractC22676k.m65750j(screenArgs, "screenArgs");
        AbstractC22676k.m65750j(onBackPressed, "onBackPressed");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-2048277008);
        if ((i13 & 6) == 0) {
            i16 = ((i13 & 8) == 0 ? c28655q2.m87153g(screenArgs) : c28655q2.m87157i(screenArgs) ? 4 : 2) | i13;
        } else {
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= c28655q2.m87157i(onBackPressed) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            interfaceC4353o2 = interfaceC4353o;
            i16 |= c28655q2.m87157i(interfaceC4353o2) ? 256 : 128;
        } else {
            interfaceC4353o2 = interfaceC4353o;
        }
        if ((i13 & 3072) == 0) {
            i16 |= c28655q2.m87157i(function1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            function4 = function2;
            i16 |= c28655q2.m87157i(function4) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        } else {
            function4 = function2;
        }
        if ((196608 & i13) == 0) {
            interfaceC4339a2 = interfaceC4339a;
            i16 |= c28655q2.m87157i(interfaceC4339a2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        } else {
            interfaceC4339a2 = interfaceC4339a;
        }
        int i18 = i15 & 64;
        if (i18 != 0) {
            i16 |= 1572864;
        } else if ((i13 & 1572864) == 0) {
            i16 |= c28655q2.m87149e(enumC11003u1 == null ? -1 : enumC11003u1.ordinal()) ? 1048576 : 524288;
        }
        int i19 = i15 & 128;
        if (i19 != 0) {
            i16 |= 12582912;
            function5 = function3;
        } else {
            function5 = function3;
            if ((i13 & 12582912) == 0) {
                i16 |= c28655q2.m87157i(function5) ? 8388608 : 4194304;
            }
        }
        int i24 = i15 & 256;
        int i25 = 100663296;
        if (i24 != 0) {
            i16 |= i25;
        } else if ((i13 & 100663296) == 0) {
            i25 = (i13 & 134217728) == 0 ? c28655q2.m87153g(interfaceC40915c) : c28655q2.m87157i(interfaceC40915c) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
            i16 |= i25;
        }
        int i26 = i15 & 512;
        if (i26 != 0) {
            i16 |= 805306368;
        } else if ((i13 & 805306368) == 0) {
            i16 |= c28655q2.m87155h(z4) ? 536870912 : 268435456;
        }
        int i27 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i27 != 0) {
            i17 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i17 = i14 | (c28655q2.m87155h(z13) ? 4 : 2);
        } else {
            i17 = i14;
        }
        int i28 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        if (i28 != 0) {
            i17 |= 48;
        } else if ((i14 & 48) == 0) {
            i17 |= (i14 & 64) == 0 ? c28655q2.m87153g(c4656v0) : c28655q2.m87157i(c4656v0) ? 32 : 16;
        }
        if (c28655q2.m87135U(i16 & 1, ((i16 & 306783379) == 306783378 && (i17 & 19) == 18) ? false : true)) {
            EnumC11003u1 enumC11003u4 = i18 != 0 ? EnumC11003u1.Hidden : enumC11003u1;
            if (i19 != 0) {
                function5 = null;
            }
            InterfaceC40915c interfaceC40915c3 = i24 != 0 ? null : interfaceC40915c;
            boolean z16 = i26 != 0 ? false : z4;
            boolean z17 = i27 != 0 ? false : z13;
            C4656v0 c4656v2 = i28 != 0 ? null : c4656v0;
            InterfaceC28601c1 interfaceC28601c1M87261o = AbstractC28683x.m87261o(((InterfaceC12251g) c28655q2.m87161k(AbstractC12252h.m34153c())).getState(), c28655q2, 0);
            if (interfaceC40915c3 == null || (interfaceC13037f2Mo132622e = interfaceC40915c3.getTtfmtStartTimeMs()) == null) {
                interfaceC13037f2Mo132622e = f34077d;
            }
            InterfaceC28601c1 interfaceC28601c1M87261o2 = AbstractC28683x.m87261o(interfaceC13037f2Mo132622e, c28655q2, 0);
            boolean zM29169e1 = m29169e1(m29136Q0(interfaceC28601c1M87261o));
            boolean zBooleanValue = ((Boolean) c28655q2.m87161k(f34074a)).booleanValue();
            C11011y0 c11011y0 = (C11011y0) c28655q2.m87161k(f34076c);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM29272x = AbstractC10979m1.m29272x(c2314t, c11011y0);
            Modifier modifierM29273y = AbstractC10979m1.m29273y(c2314t, c11011y0, c28655q2, 6);
            String strM102021f = screenArgs.getFingerprint();
            if (strM102021f == null || strM102021f.length() == 0) {
                enumC11003u3 = enumC11003u4;
                c28655q2.m87150e0(-1617272070);
                int i29 = i16 >> 6;
                int i34 = C32645n0.f135304t | (i16 & 14) | (i16 & 112) | (i16 & 896) | (i29 & 7168) | ((i16 >> 3) & 3670016) | (i29 & 29360128);
                function6 = function5;
                AbstractC32686w.m102539r(screenArgs, onBackPressed, interfaceC4353o, interfaceC4339a, zM29169e1, zBooleanValue, function6, z16, null, c28655q2, i34, 256);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-1618471956);
                boolean z18 = zBooleanValue || z17;
                boolean z19 = m29136Q0(interfaceC28601c1M87261o).getIsBottomSheetVisible() || z17;
                boolean z24 = enumC11003u4 == EnumC11003u1.Expanded;
                boolean zM37830f = m29136Q0(interfaceC28601c1M87261o).getIsBottomSheetVisible();
                Long lM29138R0 = m29138R0(interfaceC28601c1M87261o2);
                EnumC11003u1 enumC11003u5 = enumC11003u4;
                if (c4656v2 == null) {
                    c28655q2.m87150e0(-1299101571);
                    c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q2, (C32645n0.f135304t << 3) | ((i16 << 3) & 112));
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-1299102036);
                    c28655q2.m87173q(false);
                    c4656v0M14712i = c4656v2;
                }
                int i35 = (i16 & 7168) | C32645n0.f135304t | (i16 & 14) | (i16 & 112) | (i16 & 896) | (57344 & i16) | (i16 & 458752) | ((i16 >> 3) & 3670016);
                int i36 = (458752 & (i16 >> 12)) | (C4656v0.f18980q << 18);
                function6 = function5;
                enumC11003u3 = enumC11003u5;
                boolean z25 = z16;
                AbstractC4610c1.m14357p(screenArgs, onBackPressed, interfaceC4353o2, function1, function4, interfaceC4339a2, function6, zM29169e1, zM37830f, z19, lM29138R0, z18, z24, modifierM29272x, modifierM29273y, z25, c4656v0M14712i, c28655q2, i35, i36, 0);
                z16 = z25;
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            }
            function5 = function6;
            z14 = z16;
            c28655q = c28655q2;
            enumC11003u2 = enumC11003u3;
            interfaceC40915c2 = interfaceC40915c3;
            z15 = z17;
            c4656v1 = c4656v2;
        } else {
            c28655q2.m87138X();
            enumC11003u2 = enumC11003u1;
            z14 = z4;
            z15 = z13;
            c4656v1 = c4656v0;
            c28655q = c28655q2;
            interfaceC40915c2 = interfaceC40915c;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2191l(screenArgs, onBackPressed, interfaceC4353o, function1, function2, interfaceC4339a, enumC11003u2, function5, interfaceC40915c2, z14, z15, c4656v1, i13, i14, i15);
        }
    }

    /* JADX INFO: renamed from: Q */
    private static final void m29135Q(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: Q0 */
    private static final C13398d m29136Q0(InterfaceC28670t2 interfaceC28670t2) {
        return (C13398d) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m29137R(InterfaceC40915c interfaceC40915c, C10978m0 c10978m0, boolean z4, C4656v0 c4656v0, C32645n0 screenArgs, InterfaceC4339a onBackPressed, InterfaceC4353o interfaceC4353o, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a, String betaText, Function3 function3, Composer composer, int i13) {
        int i14;
        InterfaceC4353o interfaceC4353o2;
        Function1 function4;
        Function1 function5;
        InterfaceC4339a interfaceC4339a2;
        Function3 function6;
        AbstractC22676k.m65750j(screenArgs, "screenArgs");
        AbstractC22676k.m65750j(onBackPressed, "onBackPressed");
        AbstractC22676k.m65750j(betaText, "betaText");
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? ((C28655q) composer).m87153g(screenArgs) : ((C28655q) composer).m87157i(screenArgs) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= ((C28655q) composer).m87157i(onBackPressed) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            interfaceC4353o2 = interfaceC4353o;
            i14 |= ((C28655q) composer).m87157i(interfaceC4353o2) ? 256 : 128;
        } else {
            interfaceC4353o2 = interfaceC4353o;
        }
        if ((i13 & 3072) == 0) {
            function4 = function1;
            i14 |= ((C28655q) composer).m87157i(function4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            function4 = function1;
        }
        if ((i13 & 24576) == 0) {
            function5 = function2;
            i14 |= ((C28655q) composer).m87157i(function5) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        } else {
            function5 = function2;
        }
        if ((196608 & i13) == 0) {
            interfaceC4339a2 = interfaceC4339a;
            i14 |= ((C28655q) composer).m87157i(interfaceC4339a2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        } else {
            interfaceC4339a2 = interfaceC4339a;
        }
        if ((i13 & 12582912) == 0) {
            function6 = function3;
            i14 |= ((C28655q) composer).m87157i(function6) ? 8388608 : 4194304;
        } else {
            function6 = function3;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (37823635 & i14) != 37823634)) {
            InterfaceC4353o interfaceC4353o3 = interfaceC4353o2;
            m29134P0(screenArgs, onBackPressed, interfaceC4353o3, function4, function5, interfaceC4339a2, (EnumC11003u1) c28655q.m87161k(f34075b), function6, interfaceC40915c, c10978m0.getReadOnlyHalfSheet(), z4, c4656v0, c28655q, C32645n0.f135304t | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 29360128), C4656v0.f18980q << 3, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: R0 */
    private static final Long m29138R0(InterfaceC28670t2 interfaceC28670t2) {
        return (Long) interfaceC28670t2.getValue();
    }

    /* JADX INFO: renamed from: S */
    private static final boolean m29139S(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final C23454a0 m29140S0(C32645n0 c32645n0, InterfaceC4339a interfaceC4339a, InterfaceC4353o interfaceC4353o, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a2, EnumC11003u1 enumC11003u1, Function3 function3, InterfaceC40915c interfaceC40915c, boolean z4, boolean z13, C4656v0 c4656v0, int i13, int i14, int i15, Composer composer, int i16) {
        m29134P0(c32645n0, interfaceC4339a, interfaceC4353o, function1, function2, interfaceC4339a2, enumC11003u1, function3, interfaceC40915c, z4, z13, c4656v0, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: T */
    private static final void m29141T(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final EnumC11003u1 m29142T0() {
        return EnumC11003u1.Hidden;
    }

    /* JADX INFO: renamed from: U */
    private static final boolean m29143U(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final boolean m29144U0() {
        return true;
    }

    /* JADX INFO: renamed from: V */
    private static final void m29145V(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final C11011y0 m29146V0() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m29147W(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            String strM29129N = m29129N(interfaceC28601c1);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C10992r(4, interfaceC28601c2);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC10971k.m29224f(strM29129N, (InterfaceC4339a) objM87133R, c28655q, 48);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m29149X(InterfaceC28601c1 interfaceC28601c1) {
        InterfaceC4339a interfaceC4339aM29206w0 = m29206w0(interfaceC28601c1);
        if (interfaceC4339aM29206w0 != null) {
            interfaceC4339aM29206w0.invoke();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m29151Y(boolean z4, boolean z13, boolean z14, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, Composer composer, int i13) throws XmlPullParserException, IOException {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(2 * 8), C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4) {
                c28655q.m87150e0(-1321245784);
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C10992r(2, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC10971k.m29226h((InterfaceC4339a) objM87133R, c28655q, 6);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1321094907);
                c28655q.m87173q(false);
            }
            if (z13) {
                c28655q.m87150e0(-1321051321);
                Object objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C10992r(3, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC10971k.m29229k(z14, (InterfaceC4339a) objM87133R2, c28655q, 48);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1320837979);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m29153Z(InterfaceC28601c1 interfaceC28601c1) {
        InterfaceC4339a interfaceC4339aM29130N0 = m29130N0(interfaceC28601c1);
        if (interfaceC4339aM29130N0 != null) {
            interfaceC4339aM29130N0.invoke();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m29156a0(InterfaceC28601c1 interfaceC28601c1) {
        InterfaceC4339a interfaceC4339aM29125L = m29125L(interfaceC28601c1);
        if (interfaceC4339aM29125L != null) {
            interfaceC4339aM29125L.invoke();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final EnumC11003u1 m29159b0(InterfaceC28601c1 interfaceC28601c1) {
        return (EnumC11003u1) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final void m29162c0(InterfaceC28601c1 interfaceC28601c1, EnumC11003u1 enumC11003u1) {
        interfaceC28601c1.setValue(enumC11003u1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final EnumC11003u1 m29165d0(InterfaceC28601c1 interfaceC28601c1) {
        return (EnumC11003u1) interfaceC28601c1.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d1 */
    public static final Object m29166d1(boolean z4, boolean z13, float f13, Function1 function1, Function1 function2, Function1 function3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        h hVar;
        Function1 function4;
        Function1 function5;
        if (interfaceC30057d instanceof h) {
            hVar = (h) interfaceC30057d;
            int i13 = hVar.f34118H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                hVar.f34118H = i13 - Integer.MIN_VALUE;
            } else {
                hVar = new h(interfaceC30057d);
            }
        } else {
            hVar = new h(interfaceC30057d);
        }
        Object obj = hVar.f34117G;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = hVar.f34118H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (z4) {
                hVar.f34122z = function1;
                hVar.f34115E = function2;
                hVar.f34116F = function3;
                hVar.f34119w = z4;
                hVar.f34120x = z13;
                hVar.f34121y = f13;
                hVar.f34118H = 1;
                if (AbstractC3034m0.m8782b(50L, hVar) != enumC31071a) {
                }
                return enumC31071a;
            }
            function1.invoke(EnumC11003u1.Hidden);
            function2.invoke(new Float(0.0f));
            function3.invoke(new Float(f13));
            return C23454a0.f92919a;
        }
        if (i14 == 1) {
            f13 = hVar.f34121y;
            z13 = hVar.f34120x;
            z4 = hVar.f34119w;
            function3 = (Function1) hVar.f34116F;
            function2 = (Function1) hVar.f34115E;
            function1 = (Function1) hVar.f34122z;
            AbstractC34132o.m107864I(obj);
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function5 = (Function1) hVar.f34116F;
            function4 = (Function1) hVar.f34122z;
            AbstractC34132o.m107864I(obj);
        }
        function4.invoke(EnumC11003u1.Expanded);
        function5.invoke(new Float(0.9f));
        return C23454a0.f92919a;
        if (z13) {
            function1.invoke(EnumC11003u1.Partial);
            function2.invoke(new Float(1.0f));
            function3.invoke(new Float(f13));
            hVar.f34122z = function1;
            hVar.f34115E = null;
            hVar.f34116F = function3;
            hVar.f34119w = z4;
            hVar.f34120x = z13;
            hVar.f34121y = f13;
            hVar.f34118H = 2;
            if (AbstractC3034m0.m8782b(300L, hVar) != enumC31071a) {
                function4 = function1;
                function5 = function3;
                function4.invoke(EnumC11003u1.Expanded);
                function5.invoke(new Float(0.9f));
            }
            return enumC31071a;
        }
        function1.invoke(EnumC11003u1.Partial);
        function2.invoke(new Float(1.0f));
        function3.invoke(new Float(f13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final void m29168e0(InterfaceC28601c1 interfaceC28601c1, EnumC11003u1 enumC11003u1) {
        interfaceC28601c1.setValue(enumC11003u1);
    }

    /* JADX INFO: renamed from: e1 */
    public static final boolean m29169e1(C13398d globalCoachState) {
        AbstractC22676k.m65750j(globalCoachState, "globalCoachState");
        C13404j c13404jM37826b = globalCoachState.getCurrentScreenContext();
        return (c13404jM37826b != null ? AbstractC22676k.m65745e(c13404jM37826b.getIsWcePrefetch(), Boolean.TRUE) : false) && (globalCoachState.getProactiveState().getProactiveAnimationState() instanceof InterfaceC13399e.e);
    }

    /* JADX INFO: renamed from: f0 */
    private static final float m29171f0(InterfaceC28690z0 interfaceC28690z0) {
        return ((C28617g1) interfaceC28690z0).m87022x();
    }

    /* JADX INFO: renamed from: f1 */
    public static final C32645n0 m29172f1(C13404j c13404j) {
        String conversationSeedId;
        String sourceType;
        String sourceId;
        Map<String, JsonElement> mapM37846c;
        String source;
        EnumC27349e enumC27349e = EnumC27349e.GENERAL;
        String contextualMessage = c13404j != null ? c13404j.getContextualMessage() : null;
        if (c13404j == null || (conversationSeedId = c13404j.getConversationSeedId()) == null) {
            conversationSeedId = "";
        }
        String fingerprint = c13404j != null ? c13404j.getFingerprint() : null;
        if (c13404j == null || (sourceType = c13404j.getSourceType()) == null) {
            sourceType = "";
        }
        String presetQuestion = c13404j != null ? c13404j.getPresetQuestion() : null;
        String presetQuestionKey = c13404j != null ? c13404j.getPresetQuestionKey() : null;
        boolean includeInitialMessage = c13404j != null ? c13404j.getIncludeInitialMessage() : true;
        if (c13404j == null || (sourceId = c13404j.getSourceId()) == null) {
            sourceId = "";
        }
        if (c13404j == null || (mapM37846c = c13404j.m37846c()) == null) {
            mapM37846c = C25272z.f99163w;
        }
        if (c13404j == null || (source = c13404j.getSource()) == null) {
            source = "";
        }
        return new C32645n0(enumC27349e, null, contextualMessage, conversationSeedId, fingerprint, null, sourceType, presetQuestion, presetQuestionKey, includeInitialMessage, sourceId, mapM37846c, source, c13404j != null ? AbstractC22676k.m65745e(c13404j.getIsWcePrefetch(), Boolean.TRUE) : false, c13404j != null ? c13404j.getEntryText() : null, c13404j != null ? c13404j.getUserMessage() : null, c13404j != null ? c13404j.getEntrypointExperience() : null, false, 131106, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final void m29174g0(InterfaceC28690z0 interfaceC28690z0, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
    }

    /* JADX INFO: renamed from: h0 */
    private static final float m29176h0(InterfaceC28690z0 interfaceC28690z0) {
        return ((C28617g1) interfaceC28690z0).m87022x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final void m29178i0(InterfaceC28690z0 interfaceC28690z0, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
    }

    /* JADX INFO: renamed from: j0 */
    private static final boolean m29180j0(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: k0 */
    private static final void m29182k0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: l0 */
    private static final boolean m29184l0(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: m0 */
    private static final void m29186m0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final float m29188n0(InterfaceC28690z0 interfaceC28690z0) {
        return ((C28617g1) interfaceC28690z0).m87022x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final EnumC11003u1 m29190o0(InterfaceC28601c1 interfaceC28601c1) {
        return m29159b0(interfaceC28601c1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final float m29192p0(InterfaceC28690z0 interfaceC28690z0) {
        return m29176h0(interfaceC28690z0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final float m29194q0(InterfaceC28690z0 interfaceC28690z0) {
        return m29171f0(interfaceC28690z0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C23454a0 m29196r0(InterfaceC28690z0 interfaceC28690z0, float f13) {
        m29178i0(interfaceC28690z0, f13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final C23454a0 m29198s0(InterfaceC28690z0 interfaceC28690z0, float f13) {
        m29174g0(interfaceC28690z0, f13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final C23454a0 m29200t0(InterfaceC28601c1 interfaceC28601c1, EnumC11003u1 it) {
        AbstractC22676k.m65750j(it, "it");
        m29162c0(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final C23454a0 m29202u0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        m29182k0(interfaceC28601c1, z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v0 */
    private static final float m29204v0(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: w0 */
    private static final InterfaceC4339a m29206w0(InterfaceC28601c1 interfaceC28601c1) {
        return (InterfaceC4339a) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final float m29208x0(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final C23454a0 m29210y0(boolean z4, float f13, InterfaceC2994c0 interfaceC2994c0, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28690z0 interfaceC28690z0, InterfaceC28690z0 interfaceC28690z1) {
        int i13 = g.f34113a[m29159b0(interfaceC28601c1).ordinal()];
        if (i13 == 1) {
            m29162c0(interfaceC28601c1, EnumC11003u1.Partial);
            if (z4) {
                f13 = 0.9f;
            }
            m29174g0(interfaceC28690z0, f13);
            m29178i0(interfaceC28690z1, 1.0f);
        } else if (i13 == 2) {
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new f(f13, function1, m29159b0(interfaceC28601c1), interfaceC28601c1, interfaceC28690z1, interfaceC28690z0, null), 3);
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            function1.invoke(null);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final C23454a0 m29212z0(C10978m0 c10978m0, Function1 function1, InterfaceC40915c interfaceC40915c, InterfaceC2994c0 interfaceC2994c0, Function1 function2, Function3 function3, boolean z4, InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2, boolean z13, C4656v0 c4656v0, InterfaceC4340b interfaceC4340b, int i13, int i14, int i15, Composer composer, int i16) {
        m29119I(c10978m0, function1, interfaceC40915c, interfaceC2994c0, function2, function3, z4, interfaceC4351m, interfaceC4351m2, z13, c4656v0, interfaceC4340b, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }
}
