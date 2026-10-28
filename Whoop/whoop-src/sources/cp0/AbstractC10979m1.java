package cp0;

import android.content.res.Configuration;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.p018ui.input.nestedscroll.AbstractC1129a;
import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import as1.C1945f;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4340b;
import c93.InterfaceC4351m;
import c93.InterfaceC4353o;
import com.whoop.coacheverywherecommon.models.CoachEducationType;
import e93.AbstractC12889b;
import ep0.C13404j;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p097ds.AbstractC12313p;
import p180h0.AbstractC16486z0;
import p181h2.C16617b;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17916v0;
import p208i2.C17919x;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28624i0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28620h0;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p512u2.AbstractC34452c0;
import p512u2.C34472r;
import p512u2.InterfaceC34476v;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.C39169a;
import p636y3.C39178j;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p734sl0.C32645n0;
import po0.AbstractC29398b;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;
import yo0.AbstractC39683e;

/* JADX INFO: renamed from: cp0.m1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a×\u0004\u0010.\u001a\u00020\u001c2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001c0\u001b2\u001a\u0010\u001f\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u001c0\u001b2\u001a\u0010 \u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u001c0\u001b2\u001a\u0010!\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u001c0\u001b2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001c0\u001b2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001c0\u001b2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001c0\u001b2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001c0\u001b2\u0014\u0010&\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u001c0\u001b2\b\u0010(\u001a\u0004\u0018\u00010'2\"\b\u0002\u0010*\u001a\u001c\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010)2¹\u0001\u0010-\u001a´\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001e\u0012<\u0012:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010,\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u0015\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010)\u0012\u0004\u0012\u00020\u001c0+H\u0001¢\u0006\u0004\b.\u0010/\u001a\u001f\u00100\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\nH\u0000¢\u0006\u0004\b0\u00101\u001a\u001d\u00104\u001a\u000202*\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0017H\u0000¢\u0006\u0004\b4\u00105\u001a\u001d\u00106\u001a\u000202*\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0017H\u0001¢\u0006\u0004\b6\u00107\u001a'\u0010=\u001a\u00020<2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\nH\u0000¢\u0006\u0004\b=\u0010>\u001a\u0017\u0010B\u001a\u00020A2\u0006\u0010@\u001a\u00020?H\u0000¢\u0006\u0004\bB\u0010C\u001a\u0017\u0010G\u001a\u00020F2\u0006\u0010E\u001a\u00020DH\u0000¢\u0006\u0004\bG\u0010H¨\u0006I"}, m65681d2 = {"Lh2/b;", "fabPosition", "", "fabSize", "animatedHeroProgress", "animatedHeightFraction", "Ly3/c;", "density", "Lcp0/u1;", "sheetState", "", "isDragging", "isOverlayActive", "screenHeightPx", "imeHeightPx", "Lsl0/n0;", "screenArgs", "isEducationTypeDayZero", "Lcp0/h;", "effectiveToolbarContent", "showToolbar", "", "betaTagText", "Lcp0/y0;", "morphDragHandler", "isPrefetchEnabled", "isBottomSheetVisible", "Lkotlin/Function1;", "Ll83/a0;", "onIsOverlayActiveChanged", "Lkotlin/Function0;", "onBetaClickChanged", "onHistoryClickChanged", "onContextHubClickChanged", "onBetaTagTextChanged", "onShowBetaTagChanged", "onShowContextHubIconChanged", "onShowHistoryIconChanged", "onDismiss", "Lep0/j;", "screenContext", "Lkotlin/Function3;", "onContentLoaded", "Lkotlin/Function8;", "Lkotlin/Function5;", "content", "k", "(JFFFLy3/c;Lcp0/u1;ZZFFLsl0/n0;ZLcp0/h;ZLjava/lang/String;Lcp0/y0;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lep0/j;Lkotlin/jvm/functions/Function3;Lc93/b;Landroidx/compose/runtime/Composer;IIII)V", "A", "(FZ)Z", "Landroidx/compose/ui/Modifier;", "handler", "x", "(Landroidx/compose/ui/Modifier;Lcp0/y0;)Landroidx/compose/ui/Modifier;", "y", "(Landroidx/compose/ui/Modifier;Lcp0/y0;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "Lcp0/s1;", "dragState", "heightChange", "isDraggingDown", "Lcp0/t1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lcp0/s1;FZ)Lcp0/t1;", "Lcp0/r1;", "dragEndState", "Lcp0/q1;", "v", "(Lcp0/r1;)Lcp0/q1;", "Lcp0/f1;", "params", "Lcp0/e1;", "u", "(Lcp0/f1;)Lcp0/e1;", "coach-everywhere_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC10979m1 {

    /* JADX INFO: renamed from: cp0.m1$a */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.composables.MorphCoachEverywhereBottomSheetKt$MorphCoachEverywhereBottomSheet$2$6$1$1", m100430f = "MorphCoachEverywhereBottomSheet.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f34187w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f34188x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f34189y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z4, Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f34188x = z4;
            this.f34189y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f34188x, this.f34189y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f34187w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!this.f34188x) {
                this.f34189y.invoke(Boolean.FALSE);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: cp0.m1$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements PointerInputEventHandler {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C11011y0 f34190w;

        public b(C11011y0 c11011y0) {
            this.f34190w = c11011y0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public static final C23454a0 m29279e(C11011y0 c11011y0, C16617b c16617b) {
            c11011y0.m29560k();
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public static final C23454a0 m29280f(C11011y0 c11011y0) {
            c11011y0.m29559j();
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public static final C23454a0 m29281g(C11011y0 c11011y0) {
            c11011y0.m29558i();
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final C23454a0 m29282h(C11011y0 c11011y0, C34472r c34472r, C16617b c16617b) {
            AbstractC22676k.m65750j(c34472r, "<unused var>");
            c11011y0.m29557h(Float.intBitsToFloat((int) (c16617b.f63937a & 4294967295L)));
            return C23454a0.f92919a;
        }

        @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C11011y0 c11011y0 = this.f34190w;
            int i13 = 0;
            Object objM46657f = AbstractC16486z0.m46657f(interfaceC34476v, new C10982n1(c11011y0, i13), new C10985o1(c11011y0, i13), new C10985o1(c11011y0, 1), new C10988p1(c11011y0, 0), interfaceC30057d);
            return objM46657f == EnumC31071a.f128113w ? objM46657f : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: cp0.m1$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f34191a;

        static {
            int[] iArr = new int[EnumC11003u1.values().length];
            try {
                iArr[EnumC11003u1.Partial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC11003u1.Expanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC11003u1.Hidden.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f34191a = iArr;
        }
    }

    /* JADX INFO: renamed from: cp0.m1$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements PointerInputEventHandler {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C11011y0 f34192w;

        public d(C11011y0 c11011y0) {
            this.f34192w = c11011y0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public static final C23454a0 m29287e(C11011y0 c11011y0, C16617b c16617b) {
            c11011y0.m29560k();
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public static final C23454a0 m29288f(C11011y0 c11011y0) {
            c11011y0.m29559j();
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public static final C23454a0 m29289g(C11011y0 c11011y0) {
            c11011y0.m29558i();
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final C23454a0 m29290h(C11011y0 c11011y0, C34472r c34472r, C16617b c16617b) {
            AbstractC22676k.m65750j(c34472r, "<unused var>");
            c11011y0.m29557h(Float.intBitsToFloat((int) (c16617b.f63937a & 4294967295L)));
            return C23454a0.f92919a;
        }

        @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C11011y0 c11011y0 = this.f34192w;
            Object objM46657f = AbstractC16486z0.m46657f(interfaceC34476v, new C10982n1(c11011y0, 1), new C10985o1(c11011y0, 2), new C10985o1(c11011y0, 3), new C10988p1(c11011y0, 1), interfaceC30057d);
            return objM46657f == EnumC31071a.f128113w ? objM46657f : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: cp0.m1$e */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"cp0/m1$e", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C11013z0 f34193a;

        public e(C11013z0 c11013z0) {
            this.f34193a = c11013z0;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            C11013z0 c11013z0 = this.f34193a;
            if (c11013z0 != null) {
                c11013z0.m29561a();
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public static final boolean m29248A(float f13, boolean z4) {
        return f13 > 0.0f || z4;
    }

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
    /* JADX INFO: renamed from: k */
    public static final void m29259k(final long j7, final float f13, final float f14, final float f15, final InterfaceC39171c density, EnumC11003u1 sheetState, final boolean z4, final boolean z13, final float f16, final float f17, final C32645n0 screenArgs, final boolean z14, final C10962h effectiveToolbarContent, final boolean z15, final String betaTagText, final C11011y0 morphDragHandler, final boolean z16, final boolean z17, Function1 onIsOverlayActiveChanged, final Function1 onBetaClickChanged, final Function1 onHistoryClickChanged, final Function1 onContextHubClickChanged, final Function1 onBetaTagTextChanged, final Function1 onShowBetaTagChanged, final Function1 onShowContextHubIconChanged, final Function1 onShowHistoryIconChanged, final Function1 onDismiss, final C13404j c13404j, Function3 function3, final InterfaceC4340b content, Composer composer, final int i13, final int i14, final int i15, final int i16) {
        int i17;
        int i18;
        int i19;
        final EnumC11003u1 enumC11003u1;
        C28655q c28655q;
        Function1 function1;
        final Function3 function4;
        float f18;
        final Function1 function2;
        boolean z18;
        Object obj;
        Object obj2;
        boolean z19;
        boolean z24;
        String strName;
        CoachEducationType educationType;
        C0209i c0209i;
        Integer num;
        AbstractC22676k.m65750j(density, "density");
        AbstractC22676k.m65750j(sheetState, "sheetState");
        AbstractC22676k.m65750j(screenArgs, "screenArgs");
        AbstractC22676k.m65750j(effectiveToolbarContent, "effectiveToolbarContent");
        AbstractC22676k.m65750j(betaTagText, "betaTagText");
        AbstractC22676k.m65750j(morphDragHandler, "morphDragHandler");
        AbstractC22676k.m65750j(onIsOverlayActiveChanged, "onIsOverlayActiveChanged");
        AbstractC22676k.m65750j(onBetaClickChanged, "onBetaClickChanged");
        AbstractC22676k.m65750j(onHistoryClickChanged, "onHistoryClickChanged");
        AbstractC22676k.m65750j(onContextHubClickChanged, "onContextHubClickChanged");
        AbstractC22676k.m65750j(onBetaTagTextChanged, "onBetaTagTextChanged");
        AbstractC22676k.m65750j(onShowBetaTagChanged, "onShowBetaTagChanged");
        AbstractC22676k.m65750j(onShowContextHubIconChanged, "onShowContextHubIconChanged");
        AbstractC22676k.m65750j(onShowHistoryIconChanged, "onShowHistoryIconChanged");
        AbstractC22676k.m65750j(onDismiss, "onDismiss");
        AbstractC22676k.m65750j(content, "content");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1195182041);
        if ((i13 & 6) == 0) {
            i17 = i13 | (c28655q2.m87151f(j7) ? 4 : 2);
        } else {
            i17 = i13;
        }
        if ((i13 & 48) == 0) {
            i17 |= c28655q2.m87147d(f13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i17 |= c28655q2.m87147d(f14) ? 256 : 128;
        }
        int i24 = i13 & 3072;
        int i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i24 == 0) {
            i17 |= c28655q2.m87147d(f15) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : 1024;
        }
        int i26 = i13 & 24576;
        int i27 = DfuBaseService.ERROR_REMOTE_MASK;
        if (i26 == 0) {
            i17 |= c28655q2.m87153g(density) ? 16384 : 8192;
        }
        int i28 = i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21;
        int i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        if (i28 == 0) {
            i17 |= c28655q2.m87149e(sheetState.ordinal()) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : 65536;
        }
        if ((i13 & 1572864) == 0) {
            i17 |= c28655q2.m87155h(z4) ? 1048576 : 524288;
        }
        if ((i13 & 12582912) == 0) {
            i17 |= c28655q2.m87155h(z13) ? 8388608 : 4194304;
        }
        int i34 = i13 & 100663296;
        int i35 = AndroidSDKConstants.FLAG_MUTABLE;
        if (i34 == 0) {
            i17 |= c28655q2.m87147d(f16) ? 67108864 : 33554432;
        }
        if ((i13 & 805306368) == 0) {
            i17 |= c28655q2.m87147d(f17) ? 536870912 : 268435456;
        }
        int i36 = i17;
        if ((i14 & 6) == 0) {
            i18 = i14 | ((i14 & 8) == 0 ? c28655q2.m87153g(screenArgs) : c28655q2.m87157i(screenArgs) ? 4 : 2);
        } else {
            i18 = i14;
        }
        if ((i14 & 48) == 0) {
            i18 |= c28655q2.m87155h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i18 |= c28655q2.m87153g(effectiveToolbarContent) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i18 |= c28655q2.m87155h(z15) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : 1024;
        }
        if ((i14 & 24576) == 0) {
            i18 |= c28655q2.m87153g(betaTagText) ? 16384 : 8192;
        }
        if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            i18 |= c28655q2.m87157i(morphDragHandler) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i18 |= c28655q2.m87155h(z16) ? 1048576 : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i18 |= c28655q2.m87155h(z17) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i18 |= c28655q2.m87157i(onIsOverlayActiveChanged) ? 67108864 : 33554432;
        }
        if ((i14 & 805306368) == 0) {
            i18 |= c28655q2.m87157i(onBetaClickChanged) ? 536870912 : 268435456;
        }
        int i37 = i18;
        if ((i15 & 6) == 0) {
            i19 = i15 | (c28655q2.m87157i(onHistoryClickChanged) ? 4 : 2);
        } else {
            i19 = i15;
        }
        if ((i15 & 48) == 0) {
            i19 |= c28655q2.m87157i(onContextHubClickChanged) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i19 |= c28655q2.m87157i(onBetaTagTextChanged) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            if (c28655q2.m87157i(onShowBetaTagChanged)) {
                i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            }
            i19 |= i25;
        }
        if ((i15 & 24576) == 0) {
            if (c28655q2.m87157i(onShowContextHubIconChanged)) {
                i27 = 16384;
            }
            i19 |= i27;
        }
        if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q2.m87157i(onShowHistoryIconChanged)) {
                i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            }
            i19 |= i29;
        }
        if ((i15 & 1572864) == 0) {
            i19 |= c28655q2.m87157i(onDismiss) ? 1048576 : 524288;
        }
        if ((i15 & 12582912) == 0) {
            i19 |= (i15 & 16777216) == 0 ? c28655q2.m87153g(c13404j) : c28655q2.m87157i(c13404j) ? 8388608 : 4194304;
        }
        int i38 = i16 & 268435456;
        if (i38 != 0) {
            i19 |= 100663296;
        } else if ((i15 & 100663296) == 0) {
            if (c28655q2.m87157i(function3)) {
                i35 = 67108864;
            }
            i19 |= i35;
        }
        if ((i15 & 805306368) == 0) {
            i19 |= c28655q2.m87157i(content) ? 536870912 : 268435456;
        }
        int i39 = i19;
        if (c28655q2.m87135U(i36 & 1, ((i36 & 306783379) == 306783378 && (i37 & 306783379) == 306783378 && (i39 & 306783379) == 306783378) ? false : true)) {
            Function3 function5 = i38 != 0 ? null : function3;
            c28655q = c28655q2;
            C10955e1 c10955e1M29269u = m29269u(new C10958f1(f14, f15, j7, f13, density.mo743q0(((Configuration) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenWidthDp), f16, f17, null));
            if (f14 > 0.0f || z16 || z17) {
                c28655q.m87150e0(391887442);
                boolean zM29248A = m29248A(f14, z17);
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3488c = AbstractC1127a.m3488c(AbstractC1102d.m3407d(1.0f, c2314t), 0.0f, 0.0f, f14 > 0.0f ? 1.0f : 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0, 524283);
                boolean zM87155h = c28655q.m87155h(zM29248A);
                Object objM87133R = c28655q.m87133R();
                Object obj3 = C28635l.f115821a;
                if (zM87155h || objM87133R == obj3) {
                    objM87133R = new C10967i1(zM29248A, 0);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3498b = AbstractC1131a.m3498b(modifierM3488c, (Function3) objM87133R);
                C2307m c2307m = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3498b);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                C0209i c0209i4 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
                }
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                boolean zM87153g = c28655q.m87153g(c10955e1M29269u);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87153g || objM87133R2 == obj3) {
                    objM87133R2 = new C11007w0(c10955e1M29269u, 7);
                    c28655q.m87172p0(objM87133R2);
                }
                float f19 = 8;
                float f24 = 4;
                Modifier modifierM53364e = AbstractC18489d0.m53364e(AbstractC1102d.m3421r(AbstractC1099a.m3390l(c2314t, (Function1) objM87133R2), density.mo734f0(c10955e1M29269u.getHeroWidth()), density.mo734f0(c10955e1M29269u.getSheetHeight())), f19, f24);
                C38072d c38072d = C38072d.f163053a;
                int i44 = C38072d.f163054b;
                long jM51541c = C17919x.m51541c(0.97f, c38072d.m121949b(c28655q, i44).getBrandBlack());
                C17916v0 c17916v0 = AbstractC17918w0.f69621a;
                Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM53364e, jM51541c, c17916v0);
                Object objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == obj3) {
                    objM87133R3 = AbstractC11266d.m30453g(c28655q);
                }
                InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R3;
                Object objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == obj3) {
                    objM87133R4 = new C10977m(19);
                    c28655q.m87172p0(objM87133R4);
                }
                Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1092a.m3360e(modifierM3358c, interfaceC21083i, null, false, null, (InterfaceC4339a) objM87133R4, 28), "CoachEverywhereBottomSheet");
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3599a);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
                if (c10955e1M29269u.getHeroGradientAlpha() > 0.0f) {
                    c28655q.m87150e0(-2135431289);
                    f18 = 0.0f;
                    AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1127a.m3488c(AbstractC1102d.m3407d(1.0f, c2314t), 0.0f, 0.0f, c10955e1M29269u.getHeroGradientAlpha(), 0.0f, 0.0f, 0.0f, null, null, 0, 524283), C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51515c(1300199935)), new C17919x(AbstractC17918w0.m51515c(643417086)), new C17919x(AbstractC17918w0.m51515c(5882878))), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), 2000.0f, 8), null, 0.0f, 6), c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    f18 = 0.0f;
                    c28655q.m87150e0(-2134684592);
                    c28655q.m87173q(false);
                }
                Boolean boolValueOf = Boolean.valueOf(z14);
                int i45 = i37 & 234881024;
                boolean z25 = ((i37 & 112) == 32) | (i45 == 67108864);
                Object objM87133R5 = c28655q.m87133R();
                if (z25 || objM87133R5 == obj3) {
                    objM87133R5 = new a(z14, onIsOverlayActiveChanged, null);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, boolValueOf);
                Modifier modifierMo3471e = AbstractC1127a.m3488c(AbstractC1102d.m3407d(1.0f, c2314t), 0.0f, 0.0f, f14 > 0.15f ? c10955e1M29269u.getContentOpacity() : f18, 0.0f, 0.0f, 0.0f, null, null, 0, 524283).mo3471e(z13 ? AbstractC12313p.m34301s(25, c2314t) : c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(r10, false);
                int iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                int i46 = 3670016 & i39;
                int i47 = i36 & 458752;
                boolean z26 = (i46 == 1048576) | (i47 == 131072);
                Object objM87133R6 = c28655q.m87133R();
                if (z26 || objM87133R6 == obj3) {
                    final int i48 = 0;
                    enumC11003u1 = sheetState;
                    function2 = onDismiss;
                    objM87133R6 = new InterfaceC4339a() { // from class: cp0.j1
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i48) {
                                case 0:
                                    return AbstractC10979m1.m29264p(function2, enumC11003u1);
                                default:
                                    return AbstractC10979m1.m29266r(function2, enumC11003u1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R6);
                } else {
                    enumC11003u1 = sheetState;
                    function2 = onDismiss;
                }
                Object obj4 = (InterfaceC4339a) objM87133R6;
                boolean z27 = ((i39 & 14) == 4) | ((i37 & 1879048192) == 536870912) | ((i39 & 112) == 32) | ((i39 & 896) == 256) | ((i39 & 7168) == 2048);
                Object objM87133R7 = c28655q.m87133R();
                if (z27 || objM87133R7 == obj3) {
                    z18 = false;
                    obj = null;
                    obj2 = obj3;
                    Object c10973k1 = new C10973k1(onBetaClickChanged, onHistoryClickChanged, onContextHubClickChanged, onBetaTagTextChanged, onShowBetaTagChanged, 0);
                    c28655q.m87172p0(c10973k1);
                    objM87133R7 = c10973k1;
                } else {
                    z18 = false;
                    obj = null;
                    obj2 = obj3;
                }
                Object obj5 = (InterfaceC4353o) objM87133R7;
                boolean z28 = (i47 == 131072 ? true : z18) | (i46 == 1048576 ? true : z18);
                Object objM87133R8 = c28655q.m87133R();
                if (z28 || objM87133R8 == obj2) {
                    final int i49 = 1;
                    objM87133R8 = new InterfaceC4339a() { // from class: cp0.j1
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i49) {
                                case 0:
                                    return AbstractC10979m1.m29264p(function2, enumC11003u1);
                                default:
                                    return AbstractC10979m1.m29266r(function2, enumC11003u1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R8);
                }
                int i54 = i39 >> 3;
                boolean z29 = z18;
                content.invoke(screenArgs, obj4, obj5, onShowContextHubIconChanged, onShowHistoryIconChanged, (InterfaceC4339a) objM87133R8, betaTagText, function5, c28655q, Integer.valueOf(C32645n0.f135304t | (i37 & 14) | (i54 & 7168) | (57344 & i54) | ((i37 << 6) & 3670016) | (29360128 & i54) | (i54 & 234881024)));
                c28655q = c28655q;
                if (enumC11003u1 == EnumC11003u1.Hidden || !z15) {
                    z19 = true;
                    c28655q.m87150e0(791683158);
                    c28655q.m87173q(z29);
                } else {
                    c28655q.m87150e0(789390212);
                    Modifier modifierM3358c2 = AbstractC1092a.m3358c(AbstractC1102d.m3411h(14 * f24, AbstractC1102d.m3409f(1.0f, c2314t)), C17919x.f69636m, c17916v0);
                    boolean zM87157i = c28655q.m87157i(morphDragHandler);
                    Object objM87133R9 = c28655q.m87133R();
                    if (zM87157i || objM87133R9 == obj2) {
                        objM87133R9 = new b(morphDragHandler);
                        c28655q.m87172p0(objM87133R9);
                    }
                    Modifier modifierM108903b = AbstractC34452c0.m108903b(modifierM3358c2, morphDragHandler, (PointerInputEventHandler) objM87133R9);
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m, z29);
                    int iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM108903b);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d4);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                        c0209i = c0209i4;
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
                    } else {
                        c0209i = c0209i4;
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N4);
                    Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                    int iHashCode5 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3407d);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m5);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode5))) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N5);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    float f25 = 2 * f19;
                    Modifier modifierM3398t = AbstractC1099a.m3398t(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), f25, 0.0f, 0.0f, 0.0f, 14);
                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9117z, z29);
                    int iHashCode6 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d5);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m6);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode6))) {
                        AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N6);
                    InterfaceC4351m interfaceC4351mM29098a = effectiveToolbarContent.getLeadingIcon();
                    if (interfaceC4351mM29098a == null) {
                        c28655q.m87150e0(2123139800);
                        c28655q.m87173q(z29);
                        num = 0;
                    } else {
                        c28655q.m87150e0(484130377);
                        num = 0;
                        interfaceC4351mM29098a.invoke(c28655q, null);
                        c28655q.m87173q(z29);
                    }
                    c28655q.m87173q(true);
                    AbstractC22989q.m66760a(AbstractC31061c.m95629e(AbstractC1102d.m3411h(5, AbstractC1102d.m3424u(15 * f24, c2314t)), (float) 0.5d, f24, c38072d.m121949b(c28655q, i44).getWhite20()), c28655q, z29 ? 1 : 0);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM3398t2 = AbstractC1099a.m3398t(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0.0f, 0.0f, f25, 0.0f, 11);
                    InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9103F, z29);
                    int iHashCode7 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d6);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m7);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode7))) {
                        AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N7);
                    InterfaceC4351m interfaceC4351mM29099b = effectiveToolbarContent.getTrailingIcon();
                    if (interfaceC4351mM29099b == null) {
                        c28655q.m87150e0(428969136);
                    } else {
                        c28655q.m87150e0(-1094540943);
                        interfaceC4351mM29099b.invoke(c28655q, num);
                    }
                    c28655q.m87173q(z29);
                    z19 = true;
                    AbstractC2875y.m8286B(c28655q, true, true, true, z29);
                }
                c28655q.m87173q(z19);
                if (z14) {
                    c28655q.m87150e0(-2130669100);
                    if (c13404j == null || (educationType = c13404j.getEducationType()) == null || (strName = educationType.name()) == null) {
                        strName = "COACH_EVERYWHERE_GENERAL_INTRO";
                    }
                    String onboardingAnalyticSource = c13404j != null ? c13404j.getOnboardingAnalyticSource() : null;
                    char c3 = i45 == 67108864 ? (char) 1 : z29 ? 1 : 0;
                    Object objM87133R10 = c28655q.m87133R();
                    if (c3 != 0 || objM87133R10 == obj2) {
                        function1 = onIsOverlayActiveChanged;
                        objM87133R10 = new C10947c(function1, 1);
                        c28655q.m87172p0(objM87133R10);
                    } else {
                        function1 = onIsOverlayActiveChanged;
                    }
                    z24 = z29 ? 1 : 0;
                    AbstractC39683e.m126913A(strName, onboardingAnalyticSource, betaTagText, null, z4, (Function1) objM87133R10, c28655q, ((i37 >> 6) & 896) | (57344 & (i36 >> 6)), 8);
                    c28655q.m87173q(z24);
                } else {
                    function1 = onIsOverlayActiveChanged;
                    z24 = z29 ? 1 : 0;
                    c28655q.m87150e0(-2130150160);
                    c28655q.m87173q(z24);
                }
                AbstractC25012a.m73392y(c28655q, true, true, z24);
            } else {
                c28655q.m87150e0(398736489);
                c28655q.m87173q(false);
                enumC11003u1 = sheetState;
                function1 = onIsOverlayActiveChanged;
            }
            function4 = function5;
        } else {
            enumC11003u1 = sheetState;
            c28655q = c28655q2;
            function1 = onIsOverlayActiveChanged;
            c28655q.m87138X();
            function4 = function3;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final Function1 function6 = function1;
            final EnumC11003u1 enumC11003u2 = enumC11003u1;
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: cp0.l1
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj6, Object obj7) {
                    int iIntValue = ((Integer) obj7).intValue();
                    return AbstractC10979m1.m29268t(j7, f13, f14, f15, density, enumC11003u2, z4, z13, f16, f17, screenArgs, z14, effectiveToolbarContent, z15, betaTagText, morphDragHandler, z16, z17, function6, onBetaClickChanged, onHistoryClickChanged, onContextHubClickChanged, onBetaTagTextChanged, onShowBetaTagChanged, onShowContextHubIconChanged, onShowHistoryIconChanged, onDismiss, c13404j, function4, content, i13, i14, i15, i16, (Composer) obj6, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final InterfaceC39130s0 m29260l(boolean z4, InterfaceC39133t0 layout, InterfaceC39124q0 measurable, C39169a c39169a) {
        AbstractC22676k.m65750j(layout, "$this$layout");
        AbstractC22676k.m65750j(measurable, "measurable");
        AbstractC39104j1 abstractC39104j1Mo448T = measurable.mo448T(c39169a.f168407a);
        return layout.mo86822W(abstractC39104j1Mo448T.f168211w, abstractC39104j1Mo448T.f168212x, C25272z.f99163w, new C1945f(z4, abstractC39104j1Mo448T, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m29261m(boolean z4, AbstractC39104j1 abstractC39104j1, AbstractC39101i1 layout) {
        AbstractC22676k.m65750j(layout, "$this$layout");
        if (z4) {
            layout.m124632f(abstractC39104j1, 0, 0, 0.0f);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C39178j m29262n(C10955e1 c10955e1, InterfaceC39171c offset) {
        AbstractC22676k.m65750j(offset, "$this$offset");
        int iM36258X = AbstractC12889b.m36258X(c10955e1.getHeroX());
        return new C39178j((((long) AbstractC12889b.m36258X(c10955e1.getHeroY())) & 4294967295L) | (((long) iM36258X) << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m29263o() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m29264p(Function1 function1, EnumC11003u1 enumC11003u1) {
        function1.invoke(AbstractC29398b.m89576a(enumC11003u1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m29265q(Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, InterfaceC4339a betaClick, InterfaceC4339a historyClick, InterfaceC4339a contextHubClick, String betaText, boolean z4) {
        AbstractC22676k.m65750j(betaClick, "betaClick");
        AbstractC22676k.m65750j(historyClick, "historyClick");
        AbstractC22676k.m65750j(contextHubClick, "contextHubClick");
        AbstractC22676k.m65750j(betaText, "betaText");
        function1.invoke(betaClick);
        function2.invoke(historyClick);
        function3.invoke(contextHubClick);
        function4.invoke(betaText);
        function5.invoke(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m29266r(Function1 function1, EnumC11003u1 enumC11003u1) {
        function1.invoke(AbstractC29398b.m89576a(enumC11003u1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m29267s(Function1 function1, boolean z4) {
        function1.invoke(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m29268t(long j7, float f13, float f14, float f15, InterfaceC39171c interfaceC39171c, EnumC11003u1 enumC11003u1, boolean z4, boolean z13, float f16, float f17, C32645n0 c32645n0, boolean z14, C10962h c10962h, boolean z15, String str, C11011y0 c11011y0, boolean z16, boolean z17, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, Function1 function7, Function1 function8, Function1 function9, C13404j c13404j, Function3 function10, InterfaceC4340b interfaceC4340b, int i13, int i14, int i15, int i16, Composer composer, int i17) {
        m29259k(j7, f13, f14, f15, interfaceC39171c, enumC11003u1, z4, z13, f16, f17, c32645n0, z14, c10962h, z15, str, c11011y0, z16, z17, function1, function2, function3, function4, function5, function6, function7, function8, function9, c13404j, function10, interfaceC4340b, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), AbstractC28683x.m87244L(i15), i16);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    public static final C10955e1 m29269u(C10958f1 params) {
        float fM29070d;
        float fM29070d2;
        float fM29068b;
        float fM29068b2;
        AbstractC22676k.m65750j(params, "params");
        float fM29072f = params.getScreenHeightPx() - params.getImeHeightPx();
        float f13 = 0.45f * fM29072f;
        boolean z4 = params.getAnimatedHeroProgress() >= 1.0f;
        if (z4) {
            fM29070d = params.getAnimatedHeightFraction() * fM29072f;
        } else {
            fM29070d = params.getFabSize() + (params.getAnimatedHeroProgress() * (f13 - params.getFabSize()));
        }
        float f14 = fM29070d;
        if (z4) {
            fM29070d2 = params.getScreenWidthPx();
        } else {
            fM29070d2 = params.getFabSize() + (params.getAnimatedHeroProgress() * (params.getScreenWidthPx() - params.getFabSize()));
        }
        float f15 = fM29070d2;
        if (z4) {
            fM29068b = 0.0f;
        } else {
            fM29068b = (1 - params.getAnimatedHeroProgress()) * Float.intBitsToFloat((int) (params.getFabPosition() >> 32));
        }
        if (z4) {
            fM29068b2 = fM29072f - f14;
        } else {
            fM29068b2 = (params.getAnimatedHeroProgress() * ((fM29072f - f13) - Float.intBitsToFloat((int) (params.getFabPosition() & 4294967295L)))) + Float.intBitsToFloat((int) (params.getFabPosition() & 4294967295L));
        }
        float f16 = fM29068b2;
        float fM36283m = params.getAnimatedHeroProgress() > 0.15f ? AbstractC12889b.m36283m((params.getAnimatedHeroProgress() - 0.15f) / 0.85f, 0.0f, 1.0f) : 0.0f;
        return new C10955e1(f14, f15, fM29068b, f16, fM36283m, params.getAnimatedHeroProgress() > 0.15f ? 1.0f - fM36283m : 1.0f);
    }

    /* JADX INFO: renamed from: v */
    public static final AbstractC10991q1 m29270v(C10994r1 dragEndState) {
        AbstractC22676k.m65750j(dragEndState, "dragEndState");
        float fM29349a = dragEndState.getScreenHeightPx() * 0.08f;
        float fM29349a2 = dragEndState.getScreenHeightPx() * 0.12f;
        float fM29349a3 = dragEndState.getScreenHeightPx() * 0.15f;
        float fM29349a4 = dragEndState.getScreenHeightPx() * 0.18f;
        float fM29349a5 = dragEndState.getScreenHeightPx() * 0.35f;
        boolean z4 = Math.abs(dragEndState.getTotalDragAmount()) > fM29349a4;
        float f13 = dragEndState.getIsEducationTypeDayZero() ? 0.9f : 0.45f;
        int i13 = c.f34191a[dragEndState.getSheetState().ordinal()];
        if (i13 == 1) {
            if (z4 && dragEndState.getTotalDragAmount() < (-fM29349a2)) {
                return new AbstractC10991q1.a(EnumC11003u1.Expanded, 0.9f, 1.0f, false, 8, null);
            }
            if (z4 && dragEndState.getTotalDragAmount() > fM29349a2) {
                return new AbstractC10991q1.a(EnumC11003u1.Hidden, f13, 0.0f, true);
            }
            if (dragEndState.getTotalDragAmount() < (-fM29349a2)) {
                return new AbstractC10991q1.a(EnumC11003u1.Expanded, 0.9f, 1.0f, false, 8, null);
            }
            return dragEndState.getTotalDragAmount() > fM29349a3 ? new AbstractC10991q1.a(EnumC11003u1.Hidden, f13, 0.0f, true) : new AbstractC10991q1.b(f13, 1.0f);
        }
        if (i13 != 2) {
            if (i13 == 3) {
                return new AbstractC10991q1.b(0.0f, 0.0f);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (z4 && dragEndState.getTotalDragAmount() > fM29349a5) {
            return new AbstractC10991q1.a(EnumC11003u1.Hidden, f13, 0.0f, true);
        }
        if (z4 && dragEndState.getTotalDragAmount() > fM29349a2) {
            return new AbstractC10991q1.a(EnumC11003u1.Partial, f13, 1.0f, false, 8, null);
        }
        if (dragEndState.getTotalDragAmount() > fM29349a) {
            return new AbstractC10991q1.a(EnumC11003u1.Partial, f13, 1.0f, false, 8, null);
        }
        return new AbstractC10991q1.b(0.9f, 1.0f);
    }

    /* JADX INFO: renamed from: w */
    public static final C11000t1 m29271w(C10997s1 dragState, float f13, boolean z4) {
        AbstractC22676k.m65750j(dragState, "dragState");
        float f14 = dragState.getIsEducationTypeDayZero() ? 0.9f : 0.45f;
        boolean z13 = false;
        boolean z14 = dragState.getCurrentHeroProgress() < 1.0f;
        boolean z15 = dragState.getCurrentTargetHeight() <= f14;
        boolean z16 = dragState.getSheetState() == EnumC11003u1.Partial && z4 && z15;
        if (dragState.getSheetState() == EnumC11003u1.Expanded && z4 && z15) {
            z13 = true;
        }
        if (z14 || z16 || z13) {
            return new C11000t1(AbstractC12889b.m36283m(dragState.getCurrentHeroProgress() + (f13 / f14), 0.0f, 1.0f), f14);
        }
        return new C11000t1(1.0f, AbstractC12889b.m36283m(dragState.getCurrentTargetHeight() + f13, 0.45f, 0.9f));
    }

    /* JADX INFO: renamed from: x */
    public static final Modifier m29272x(Modifier modifier, C11011y0 c11011y0) {
        AbstractC22676k.m65750j(modifier, "<this>");
        return c11011y0 == null ? modifier : AbstractC34452c0.m108903b(modifier, c11011y0, new d(c11011y0));
    }

    /* JADX INFO: renamed from: y */
    public static final Modifier m29273y(Modifier modifier, C11011y0 c11011y0, Composer composer, int i13) {
        AbstractC22676k.m65750j(modifier, "<this>");
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(c11011y0);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87153g || objM87133R == c28676v0) {
            objM87133R = c11011y0 != null ? new C11013z0(c11011y0) : null;
            c28655q.m87172p0(objM87133R);
        }
        C11013z0 c11013z0 = (C11013z0) objM87133R;
        boolean zM87157i = c28655q.m87157i(c11013z0);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i || objM87133R2 == c28676v0) {
            objM87133R2 = new C11007w0(c11013z0, 8);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC28683x.m87251e(c11013z0, (Function1) objM87133R2, c28655q);
        return c11013z0 == null ? modifier : AbstractC1129a.m3495a(modifier, c11013z0, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final InterfaceC28620h0 m29274z(C11013z0 c11013z0, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        return new e(c11013z0);
    }
}
