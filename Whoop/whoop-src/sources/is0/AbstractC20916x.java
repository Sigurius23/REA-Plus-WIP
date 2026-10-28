package is0;

import androidx.compose.animation.AbstractC1091c;
import androidx.compose.foundation.gestures.AbstractC1096a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.input.nestedscroll.AbstractC1129a;
import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.p018ui.layout.AbstractC1132b;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.core.app.FrameMetricsAggregator;
import androidx.profileinstaller.ProfileVerifier;
import bb2.C2931g;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ce3.C4510k;
import com.whoop.design.util.TextResource;
import e93.AbstractC12889b;
import gb1.AbstractC15673b0;
import gb1.C15672b;
import java.util.List;
import l83.C23454a0;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p002a0.C0006a1;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p014aj.C0929d;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p077d0.C11347e2;
import p088dc.AbstractC11895b;
import p132f0.C13821r1;
import p134f2.C14015d;
import p134f2.C14018g;
import p180h0.AbstractC16362b;
import p180h0.AbstractC16434o3;
import p180h0.C16435p;
import p180h0.EnumC16377d2;
import p180h0.InterfaceC16439p3;
import p181h2.C16617b;
import p208i2.AbstractC17911t;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C23010x;
import p291l0.InterfaceC23004v;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p492t2.InterfaceC33313a;
import p505ts.AbstractC34132o;
import p512u2.AbstractC34452c0;
import p512u2.InterfaceC34476v;
import p602x1.AbstractC37817c;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.C39169a;
import p636y3.C39180l;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: is0.x */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\f\u001ae\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a/\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a;\u0010\u001c\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a#\u0010\u001f\u001a\u00020\u0000*\u00020\u00002\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\nH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a)\u0010$\u001a\u00020\u0000*\u00020\u00002\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\n2\u0006\u0010#\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%\u001a=\u0010)\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u001a2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0003¢\u0006\u0004\b)\u0010*\"\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-\"\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101\" \u00109\u001a\b\u0012\u0004\u0012\u000204038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006@²\u0006\f\u0010:\u001a\u00020!8\nX\u008a\u0084\u0002²\u0006\f\u0010&\u001a\u00020!8\nX\u008a\u0084\u0002²\u0006\u000e\u0010;\u001a\u00020\u001a8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010<\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0014\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010=\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010>\u001a\u00020\u001a8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010?\u001a\u00020!8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lis0/s0;", "viewState", "Lis0/j;", "expansion", "Lis0/m0;", "panelState", "Lis0/a0;", "controls", "Lkotlin/Function0;", "Ll83/a0;", "onPreviewClick", "Lkotlin/Function1;", "Lis0/r0;", "onEvent", "o", "(Landroidx/compose/ui/Modifier;Lis0/s0;Lis0/j;Lis0/m0;Lis0/a0;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "availablePx", "inputHeightPx", "sectionSpacingPx", "handleReservationPx", "W", "(IIII)I", "layoutHeightPx", "", "isExpanded", "X", "(IIILjava/lang/Integer;Z)Ljava/lang/Integer;", "heightPx", "T", "(Landroidx/compose/ui/Modifier;Lc93/a;)Landroidx/compose/ui/Modifier;", "", "alpha", "pinnedHeightPx", "Q", "(Landroidx/compose/ui/Modifier;Lc93/a;F)Landroidx/compose/ui/Modifier;", "contentAlpha", "surfacedIndex", "fadeInOnAppear", "J", "(Lis0/s0;FIZLc93/a;Landroidx/compose/runtime/Composer;I)V", "Ly3/f;", "a", "F", "EXPANDED_LIST_HANDLE_RESERVATION", "Li2/t;", "b", "Li2/t;", "EXPANDED_CHROME_BRUSH", "", "", "c", "Ljava/util/List;", "getPreviewQuickReactionEmojis", "()Ljava/util/List;", "previewQuickReactionEmojis", "outlineAlpha", "hasBeenExpanded", "bodyNaturalHeightPx", "lastReportedNaturalHeightPx", "appeared", "appearAlpha", "community-reactions-arch-mini_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC20916x {

    /* JADX INFO: renamed from: a */
    private static final float f78801a = 6 * 8;

    /* JADX INFO: renamed from: b */
    private static final AbstractC17911t f78802b = AbstractC15673b0.m44030c0();

    /* JADX INFO: renamed from: c */
    private static final List<String> f78803c = AbstractC37056f.m118959K("🔥", "🙌");

    /* JADX INFO: renamed from: is0.x$a */
    @InterfaceC32271e(m100429c = "com.whoop.communityreactions.view.ReactionsBarKt$ReactionsBar$3$1", m100430f = "ReactionsBar.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f78804w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C20888j f78805x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f78806y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C20888j c20888j, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f78805x = c20888j;
            this.f78806y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f78805x, this.f78806y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f78804w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f78805x.getIsExpanded()) {
                AbstractC20916x.m57924G(this.f78806y, true);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: is0.x$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements PointerInputEventHandler {

        /* JADX INFO: renamed from: w */
        public static final b f78807w = new b();

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static final C23454a0 m57969b(C16617b c16617b) {
            return C23454a0.f92919a;
        }

        @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            Object objM46605e = AbstractC16434o3.m46605e(interfaceC34476v, null, null, null, new C20918y(0), interfaceC30057d, 7);
            return objM46605e == EnumC31071a.f128113w ? objM46605e : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: is0.x$c */
    @InterfaceC32271e(m100429c = "com.whoop.communityreactions.view.ReactionsBarKt$ReactionsPreviewRegion$1$1", m100430f = "ReactionsBar.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f78808w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f78809x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f78809x = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f78809x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f78808w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC20916x.m57929L(this.f78809x, true);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m57918A(InterfaceC28593a1 interfaceC28593a1, InterfaceC28593a1 interfaceC28593a2, int i13, C20888j c20888j, InterfaceC28593a1 interfaceC28593a3, C39180l c39180l) {
        m57960s(interfaceC28593a1, (int) (c39180l.f168422a & 4294967295L));
        m57926I(i13, c20888j, interfaceC28593a3, (int) (c39180l.f168422a & 4294967295L), m57961t(interfaceC28593a2));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m57919B(InterfaceC28593a1 interfaceC28593a1, InterfaceC28593a1 interfaceC28593a2, int i13, C20888j c20888j, InterfaceC28593a1 interfaceC28593a3, C39180l c39180l) {
        m57960s(interfaceC28593a1, (int) (c39180l.f168422a & 4294967295L));
        m57926I(i13, c20888j, interfaceC28593a3, (int) (c39180l.f168422a & 4294967295L), m57961t(interfaceC28593a2));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m57920C(InterfaceC28593a1 interfaceC28593a1, InterfaceC28593a1 interfaceC28593a2, int i13, C20888j c20888j, InterfaceC28593a1 interfaceC28593a3, C39180l c39180l) {
        m57962u(interfaceC28593a1, (int) (c39180l.f168422a & 4294967295L));
        m57926I(i13, c20888j, interfaceC28593a3, m57959r(interfaceC28593a2), (int) (c39180l.f168422a & 4294967295L));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m57921D(Modifier modifier, C20907s0 c20907s0, C20888j c20888j, C20895m0 c20895m0, C20871a0 c20871a0, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m57956o(modifier, c20907s0, c20888j, c20895m0, c20871a0, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: E */
    private static final float m57922E(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: F */
    private static final boolean m57923F(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final void m57924G(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final boolean m57925H(C13821r1 c13821r1) {
        return c13821r1.f49318a.m87024x() == 0;
    }

    /* JADX INFO: renamed from: I */
    private static final void m57926I(int i13, C20888j c20888j, InterfaceC28593a1 interfaceC28593a1, int i14, int i15) {
        if (i14 <= 0 || i15 <= 0) {
            i13 = 0;
        }
        int i16 = i14 + i15 + i13;
        if (i16 <= 0 || i16 == m57963v(interfaceC28593a1)) {
            return;
        }
        m57964w(interfaceC28593a1, i16);
        c20888j.getOnNaturalHeightChanged().invoke(Integer.valueOf(i16));
    }

    /* JADX INFO: renamed from: J */
    private static final void m57927J(C20907s0 c20907s0, float f13, int i13, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i14) {
        C20907s0 c20907s1;
        int i15;
        int i16;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-98598146);
        if ((i14 & 6) == 0) {
            c20907s1 = c20907s0;
            i15 = (c28655q.m87157i(c20907s1) ? 4 : 2) | i14;
        } else {
            c20907s1 = c20907s0;
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87147d(f13) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 = i13;
            i15 |= c28655q.m87149e(i16) ? 256 : 128;
        } else {
            i16 = i13;
        }
        if ((i14 & 3072) == 0) {
            i15 |= c28655q.m87155h(z4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 24576) == 0) {
            i15 |= c28655q.m87157i(interfaceC4339a) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 9363) != 9362)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC31061c.m95647w(!z4, c28655q);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            InterfaceC28670t2 interfaceC28670t2M30588b = AbstractC11352g.m30588b(m57928K(interfaceC28601c1) ? 1.0f : 0.0f, AbstractC11348f.m30574v(500, 0, null, 6), "reactionsPreviewAppearAlpha", null, c28655q, 3120, 20);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new c(interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
            C11347e2 c11347e2M30574v = AbstractC11348f.m30574v(300, 0, null, 6);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3355a = AbstractC1091c.m3355a(c2314t, c11347e2M30574v, 2);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3355a);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            if (c20907s1.getIsLoading()) {
                c28655q.m87150e0(-1939258530);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1939640047);
                AbstractC20903q0.m57887l(AbstractC34132o.m107879c(m57930M(interfaceC28670t2M30588b) * f13, AbstractC1099a.m3398t(c2314t, 0.0f, 1 * 8, 0.0f, 0.0f, 13)), c20907s1.m57906c(), c20907s1.getSummaryLabel(), i16, interfaceC4339a, c28655q, (TextResource.$stable << 6) | ((i15 << 3) & 7168) | (i15 & 57344), 0);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C20904r(c20907s0, f13, i13, z4, interfaceC4339a, i14);
        }
    }

    /* JADX INFO: renamed from: K */
    private static final boolean m57928K(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final void m57929L(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: M */
    private static final float m57930M(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m57931N(C20907s0 c20907s0, float f13, int i13, boolean z4, InterfaceC4339a interfaceC4339a, int i14, Composer composer, int i15) {
        m57927J(c20907s0, f13, i13, z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Q */
    private static final Modifier m57934Q(Modifier modifier, InterfaceC4339a interfaceC4339a, float f13) {
        return AbstractC1125a.m3479b(modifier, new C15672b(f13, interfaceC4339a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C14018g m57935R(float f13, InterfaceC4339a interfaceC4339a, C14015d drawWithCache) {
        AbstractC22676k.m65750j(drawWithCache, "$this$drawWithCache");
        return drawWithCache.m39910a(new C0006a1(new C15672b(Math.max(f13, Float.intBitsToFloat((int) (drawWithCache.f50036w.mo468d() & 4294967295L))), 1, interfaceC4339a), 21));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m57936S(InterfaceC4339a interfaceC4339a, float f13, InterfaceC22131e onDrawBehind) throws Throwable {
        InterfaceC22131e interfaceC22131e;
        AbstractC22676k.m65750j(onDrawBehind, "$this$onDrawBehind");
        float fM36283m = AbstractC12889b.m36283m(((Number) interfaceC4339a.invoke()).floatValue(), 0.0f, 1.0f);
        if (fM36283m > 0.0f) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (onDrawBehind.mo731d() & 4294967295L)) - f13;
            ((C0929d) onDrawBehind.mo744t0().f812x).m2339B(0.0f, fIntBitsToFloat);
            try {
                interfaceC22131e = onDrawBehind;
                try {
                    InterfaceC22131e.m63385u(interfaceC22131e, f78802b, 0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (onDrawBehind.mo731d() >> 32)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f13))), fM36283m, null, 0, 114);
                    ((C0929d) interfaceC22131e.mo744t0().f812x).m2339B(-0.0f, -fIntBitsToFloat);
                } catch (Throwable th3) {
                    th = th3;
                    Throwable th4 = th;
                    ((C0929d) interfaceC22131e.mo744t0().f812x).m2339B(-0.0f, -fIntBitsToFloat);
                    throw th4;
                }
            } catch (Throwable th5) {
                th = th5;
                interfaceC22131e = onDrawBehind;
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: T */
    private static final Modifier m57937T(Modifier modifier, InterfaceC4339a interfaceC4339a) {
        return AbstractC1131a.m3498b(modifier, new C20906s(interfaceC4339a, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final InterfaceC39130s0 m57938U(InterfaceC4339a interfaceC4339a, InterfaceC39133t0 layout, InterfaceC39124q0 measurable, C39169a c39169a) {
        long jM124758b;
        AbstractC22676k.m65750j(layout, "$this$layout");
        AbstractC22676k.m65750j(measurable, "measurable");
        Integer num = (Integer) interfaceC4339a.invoke();
        if (num == null) {
            jM124758b = c39169a.f168407a;
        } else {
            int iM36284n = AbstractC12889b.m36284n(num.intValue(), C39169a.m124766j(c39169a.f168407a), C39169a.m124764h(c39169a.f168407a));
            jM124758b = C39169a.m124758b(c39169a.f168407a, 0, 0, iM36284n, iM36284n, 3);
        }
        AbstractC39104j1 abstractC39104j1Mo448T = measurable.mo448T(jM124758b);
        return layout.mo86822W(abstractC39104j1Mo448T.f168211w, abstractC39104j1Mo448T.f168212x, C25272z.f99163w, new C20908t(abstractC39104j1Mo448T, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m57939V(AbstractC39104j1 abstractC39104j1, AbstractC39101i1 layout) {
        AbstractC22676k.m65750j(layout, "$this$layout");
        layout.m124632f(abstractC39104j1, 0, 0, 0.0f);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: W */
    public static final int m57940W(int i13, int i14, int i15, int i16) {
        int i17 = ((i13 - i16) - i14) - i15;
        if (i17 < 0) {
            return 0;
        }
        return i17;
    }

    /* JADX INFO: renamed from: X */
    public static final Integer m57941X(int i13, int i14, int i15, Integer num, boolean z4) {
        if (!z4 || i14 <= 0 || num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        if (iIntValue <= i13) {
            i13 = iIntValue;
        }
        int i16 = (i13 - i14) - i15;
        if (i16 < 0) {
            i16 = 0;
        }
        return Integer.valueOf(i16);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0151  */
    /* JADX WARN: Code duplicated, block: B:103:0x0156  */
    /* JADX WARN: Code duplicated, block: B:105:0x015c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0167  */
    /* JADX WARN: Code duplicated, block: B:109:0x016b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0171  */
    /* JADX WARN: Code duplicated, block: B:113:0x0183  */
    /* JADX WARN: Code duplicated, block: B:116:0x0191  */
    /* JADX WARN: Code duplicated, block: B:117:0x0195  */
    /* JADX WARN: Code duplicated, block: B:120:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:121:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:124:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:127:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:128:0x0201  */
    /* JADX WARN: Code duplicated, block: B:131:0x0208 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:132:0x020a  */
    /* JADX WARN: Code duplicated, block: B:135:0x0229  */
    /* JADX WARN: Code duplicated, block: B:139:0x0232  */
    /* JADX WARN: Code duplicated, block: B:142:0x0262  */
    /* JADX WARN: Code duplicated, block: B:144:0x0268  */
    /* JADX WARN: Code duplicated, block: B:150:0x027f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x0281  */
    /* JADX WARN: Code duplicated, block: B:154:0x029d  */
    /* JADX WARN: Code duplicated, block: B:157:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:160:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:163:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:165:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:167:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:173:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:176:0x030b  */
    /* JADX WARN: Code duplicated, block: B:179:0x0322  */
    /* JADX WARN: Code duplicated, block: B:180:0x033f  */
    /* JADX WARN: Code duplicated, block: B:183:0x036d  */
    /* JADX WARN: Code duplicated, block: B:184:0x0371  */
    /* JADX WARN: Code duplicated, block: B:187:0x0384  */
    /* JADX WARN: Code duplicated, block: B:189:0x0392  */
    /* JADX WARN: Code duplicated, block: B:191:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:194:0x0403  */
    /* JADX WARN: Code duplicated, block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00da  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:91:0x010a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x010c  */
    /* JADX WARN: Code duplicated, block: B:94:0x010f  */
    /* JADX WARN: Code duplicated, block: B:97:0x012c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0135  */
    /* JADX INFO: renamed from: o */
    public static final void m57956o(Modifier modifier, final C20907s0 viewState, C20888j c20888j, C20895m0 c20895m0, C20871a0 c20871a0, InterfaceC4339a interfaceC4339a, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C20888j c20888j2;
        C20895m0 c20895m0M57840d;
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        Function1 function2;
        int i25;
        int i26;
        boolean z4;
        C20871a0 c20871a1;
        Function1 function3;
        Modifier modifier3;
        C20888j c20888j3;
        C20895m0 c20895m1;
        InterfaceC4339a interfaceC4339a2;
        C28677v1 c28677v1M87180u;
        int i27;
        C2314t c2314t;
        C28676v0 c28676v0;
        C20871a0 c20871a2;
        int i28;
        InterfaceC4339a interfaceC4339a3;
        Modifier modifier4;
        final InterfaceC4339a interfaceC4339a4;
        Object objM87133R;
        Function1 function4;
        C20888j c20888j4;
        Object objM87133R2;
        final C20895m0 c20895m2;
        float f13;
        float f14;
        Object objM87133R3;
        final InterfaceC28601c1 interfaceC28601c1;
        boolean z13;
        Object objM87133R4;
        boolean z14;
        final C13821r1 c13821r1M92099U;
        final InterfaceC16439p3 interfaceC16439p3M46564a;
        boolean zM87153g;
        Object objM87133R5;
        Object objM87133R6;
        Object objM87133R7;
        final boolean z15;
        Object objM87133R8;
        Object objM87133R9;
        Modifier modifierM57934Q;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i29;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(651220377);
        int i34 = i14 & 1;
        if (i34 != 0) {
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
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        int i35 = i14 & 4;
        if (i35 == 0) {
            if ((i13 & 384) == 0) {
                c20888j2 = c20888j;
                i15 |= c28655q.m87153g(c20888j2) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if ((i14 & 8) == 0) {
                    c20895m0M57840d = c20895m0;
                    if (c28655q.m87153g(c20895m0M57840d)) {
                        i29 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i15 |= i29;
                } else {
                    c20895m0M57840d = c20895m0;
                }
                i29 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                i15 |= i29;
            } else {
                c20895m0M57840d = c20895m0;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87153g(c20871a0)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 32;
                if (i18 != 0) {
                    if ((196608 & i13) == 0) {
                        if (c28655q.m87157i(interfaceC4339a)) {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 64;
                    if (i24 != 0) {
                        i15 |= 1572864;
                        function2 = function1;
                    } else {
                        function2 = function1;
                        if ((i13 & 1572864) == 0) {
                            if (c28655q.m87157i(function2)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i15 |= i25;
                        }
                    }
                    i26 = 0;
                    if ((i15 & 599187) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        c28655q.m87140Z();
                        i27 = i13 & 1;
                        c2314t = C2314t.f9131w;
                        c28676v0 = C28635l.f115821a;
                        if (i27 != 0 || c28655q.m87118C()) {
                            if (i34 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i35 != 0) {
                                c20888j2 = new C20888j(false, null, 0.0f, 0.0f, 0.0f, null, null, 127, null);
                            }
                            if ((i14 & 8) != 0) {
                                i15 &= -7169;
                                c20895m0M57840d = AbstractC20897n0.m57840d(false, c28655q, 0, 1);
                            }
                            if (i16 != 0) {
                                c20871a2 = new C20871a0(null, false, false, false, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
                            } else {
                                c20871a2 = c20871a0;
                            }
                            i28 = 3;
                            if (i18 != 0) {
                                objM87133R2 = c28655q.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C20886i(i28);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            if (i24 != 0) {
                                objM87133R = c28655q.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C20918y(i28);
                                    c28655q.m87172p0(objM87133R);
                                }
                                Function1 function5 = (Function1) objM87133R;
                                Modifier modifier5 = modifier2;
                                function4 = function5;
                                modifier4 = modifier5;
                                interfaceC4339a4 = interfaceC4339a3;
                                c20888j4 = c20888j2;
                            } else {
                                modifier4 = modifier2;
                                interfaceC4339a4 = interfaceC4339a3;
                            }
                            c20895m2 = c20895m0M57840d;
                            c28655q.m87175r();
                            if (viewState.getIsLoading()) {
                                f13 = 0.4f;
                            } else {
                                f13 = 1.0f;
                            }
                            final Function1 function6 = function4;
                            final InterfaceC28670t2 interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(300, 0, null, 6), "reactionsBarOutlineAlpha", null, c28655q, 3120, 20);
                            if (viewState.getIsLoading()) {
                                f14 = 0.0f;
                            } else {
                                f14 = 1.0f;
                            }
                            final InterfaceC28670t2 interfaceC28670t2M30588b2 = AbstractC11352g.m30588b(f14, AbstractC11348f.m30574v(300, 0, null, 6), "reactionsBarContentAlpha", null, c28655q, 3120, 20);
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                                c28655q.m87172p0(objM87133R3);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                            Boolean boolValueOf = Boolean.valueOf(c20888j4.getIsExpanded());
                            if ((i15 & 896) == 256) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objM87133R4 = c28655q.m87133R();
                            if (z13 || objM87133R4 == c28676v0) {
                                objM87133R4 = new a(c20888j4, interfaceC28601c1, null);
                                c28655q.m87172p0(objM87133R4);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, boolValueOf);
                            int size = viewState.m57906c().size();
                            Duration durationM57910g = viewState.getRotationInterval();
                            if (!c20888j4.getIsExpanded() || viewState.getIsLoading()) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            final int iM58033d = AbstractC20921z0.m58033d(size, durationM57910g, z14, c28655q, 0, 0);
                            c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                            C11347e2 c11347e2 = AbstractC16362b.f62900a;
                            interfaceC16439p3M46564a = AbstractC16362b.m46564a(c20895m2.getDraggableState(), c28655q, AbstractC16362b.f62902c << 9);
                            zM87153g = c28655q.m87153g(interfaceC16439p3M46564a) | ((((i15 & 7168) ^ 3072) <= 2048 && c28655q.m87153g(c20895m2)) || (i15 & 3072) == 2048) | c28655q.m87153g(c13821r1M92099U);
                            objM87133R5 = c28655q.m87133R();
                            if (zM87153g || objM87133R5 == c28676v0) {
                                objM87133R5 = AbstractC20897n0.m57837a(new C20910u(c13821r1M92099U, i26), c20895m2, interfaceC16439p3M46564a);
                                c28655q.m87172p0(objM87133R5);
                            }
                            final InterfaceC33313a interfaceC33313a = (InterfaceC33313a) objM87133R5;
                            final InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = AbstractC31061c.m95646v(0, c28655q);
                            }
                            final InterfaceC28593a1 interfaceC28593a1 = (InterfaceC28593a1) objM87133R6;
                            objM87133R7 = c28655q.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = AbstractC31061c.m95646v(0, c28655q);
                            }
                            final InterfaceC28593a1 interfaceC28593a2 = (InterfaceC28593a1) objM87133R7;
                            if (c20888j4.getIsExpanded() || viewState.m57905b().isEmpty()) {
                                z15 = false;
                            } else {
                                z15 = true;
                            }
                            float f15 = (z15 && c20888j4.getIsExpanded()) ? 0 : ((float) 1.5d) * 8;
                            final int iMo724F = interfaceC39171c.mo724F(f15);
                            objM87133R8 = c28655q.m87133R();
                            if (objM87133R8 == c28676v0) {
                                objM87133R8 = AbstractC31061c.m95646v(0, c28655q);
                            }
                            final InterfaceC28593a1 interfaceC28593a3 = (InterfaceC28593a1) objM87133R8;
                            final float f16 = f15;
                            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(modifier4, "ReactionsBar"));
                            objM87133R9 = c28655q.m87133R();
                            if (objM87133R9 == c28676v0) {
                                objM87133R9 = b.f78807w;
                                c28655q.m87172p0(objM87133R9);
                            }
                            Modifier modifierM118995s = AbstractC37056f.m118995s(AbstractC34452c0.m108903b(modifierM3409f, C23454a0.f92919a, (PointerInputEventHandler) objM87133R9));
                            if (c20888j4.getIsExpanded()) {
                                float f17 = 4;
                                float f18 = f17 * f17;
                                modifierM57934Q = m57934Q(AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105491g(f18, f18, 0.0f, 0.0f, 12)), c20888j4.getChromeProgress(), c20888j4.getChromeHeightPx());
                            } else {
                                modifierM57934Q = c2314t;
                            }
                            Modifier modifierMo3471e = modifierM118995s.mo3471e(modifierM57934Q);
                            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                            c0209i = C0217k.f732j;
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                            final C20871a0 c20871a3 = c20871a2;
                            final C20888j c20888j5 = c20888j4;
                            AbstractC22953f.m66714a(AbstractC22953f.m66722k(AbstractC1102d.m3409f(1.0f, c2314t)), null, false, AbstractC37817c.m121344e(1522487157, c28655q, new Function3() { // from class: is0.v
                                @Override // p715kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int iIntValue = ((Integer) obj3).intValue();
                                    return AbstractC20916x.m57966y(interfaceC39171c, f16, iMo724F, interfaceC28593a2, interfaceC28670t2M30588b, c20888j5, viewState, c20871a3, function6, interfaceC28593a1, interfaceC28593a3, c20895m2, interfaceC16439p3M46564a, z15, interfaceC33313a, c13821r1M92099U, iM58033d, interfaceC4339a4, interfaceC28670t2M30588b2, interfaceC28601c1, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                                }
                            }), c28655q, 3072, 6);
                            c28655q.m87173q(true);
                            c20888j3 = c20888j5;
                            function3 = function6;
                            c20895m1 = c20895m2;
                            c20871a1 = c20871a3;
                            modifier3 = modifier4;
                            c28655q = c28655q;
                            interfaceC4339a2 = interfaceC4339a4;
                        } else {
                            c28655q.m87138X();
                            if ((i14 & 8) != 0) {
                                i15 &= -7169;
                            }
                            c20871a2 = c20871a0;
                            interfaceC4339a4 = interfaceC4339a;
                            modifier4 = modifier2;
                        }
                        c20888j4 = c20888j2;
                        function4 = function2;
                        c20895m2 = c20895m0M57840d;
                        c28655q.m87175r();
                        if (viewState.getIsLoading()) {
                            f13 = 0.4f;
                        } else {
                            f13 = 1.0f;
                        }
                        final Function1 function7 = function4;
                        final InterfaceC28670t2 interfaceC28670t2M30588b3 = AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(300, 0, null, 6), "reactionsBarOutlineAlpha", null, c28655q, 3120, 20);
                        if (viewState.getIsLoading()) {
                            f14 = 0.0f;
                        } else {
                            f14 = 1.0f;
                        }
                        final InterfaceC28670t2 interfaceC28670t2M30588b4 = AbstractC11352g.m30588b(f14, AbstractC11348f.m30574v(300, 0, null, 6), "reactionsBarContentAlpha", null, c28655q, 3120, 20);
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                        Boolean boolValueOf2 = Boolean.valueOf(c20888j4.getIsExpanded());
                        if ((i15 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R4 = c28655q.m87133R();
                        if (z13) {
                            objM87133R4 = new a(c20888j4, interfaceC28601c1, null);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new a(c20888j4, interfaceC28601c1, null);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, boolValueOf2);
                        int size2 = viewState.m57906c().size();
                        Duration durationM57910g2 = viewState.getRotationInterval();
                        if (c20888j4.getIsExpanded()) {
                            z14 = true;
                        } else {
                            z14 = true;
                        }
                        final int iM58033d2 = AbstractC20921z0.m58033d(size2, durationM57910g2, z14, c28655q, 0, 0);
                        c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                        C11347e2 c11347e3 = AbstractC16362b.f62900a;
                        interfaceC16439p3M46564a = AbstractC16362b.m46564a(c20895m2.getDraggableState(), c28655q, AbstractC16362b.f62902c << 9);
                        zM87153g = c28655q.m87153g(interfaceC16439p3M46564a) | ((((i15 & 7168) ^ 3072) <= 2048 && c28655q.m87153g(c20895m2)) || (i15 & 3072) == 2048) | c28655q.m87153g(c13821r1M92099U);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87153g) {
                            objM87133R5 = AbstractC20897n0.m57837a(new C20910u(c13821r1M92099U, i26), c20895m2, interfaceC16439p3M46564a);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = AbstractC20897n0.m57837a(new C20910u(c13821r1M92099U, i26), c20895m2, interfaceC16439p3M46564a);
                            c28655q.m87172p0(objM87133R5);
                        }
                        final InterfaceC33313a interfaceC33313a2 = (InterfaceC33313a) objM87133R5;
                        final InterfaceC39171c interfaceC39171c2 = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC31061c.m95646v(0, c28655q);
                        }
                        final InterfaceC28593a1 interfaceC28593a4 = (InterfaceC28593a1) objM87133R6;
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC31061c.m95646v(0, c28655q);
                        }
                        final InterfaceC28593a1 interfaceC28593a5 = (InterfaceC28593a1) objM87133R7;
                        if (c20888j4.getIsExpanded()) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        if (z15) {
                        }
                        final int iMo724F2 = interfaceC39171c2.mo724F(f15);
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = AbstractC31061c.m95646v(0, c28655q);
                        }
                        final InterfaceC28593a1 interfaceC28593a6 = (InterfaceC28593a1) objM87133R8;
                        final float f19 = f15;
                        Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(modifier4, "ReactionsBar"));
                        objM87133R9 = c28655q.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = b.f78807w;
                            c28655q.m87172p0(objM87133R9);
                        }
                        Modifier modifierM118995s2 = AbstractC37056f.m118995s(AbstractC34452c0.m108903b(modifierM3409f2, C23454a0.f92919a, (PointerInputEventHandler) objM87133R9));
                        if (c20888j4.getIsExpanded()) {
                            float f110 = 4;
                            float f111 = f110 * f110;
                            modifierM57934Q = m57934Q(AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105491g(f111, f111, 0.0f, 0.0f, 12)), c20888j4.getChromeProgress(), c20888j4.getChromeHeightPx());
                        } else {
                            modifierM57934Q = c2314t;
                        }
                        Modifier modifierMo3471e2 = modifierM118995s2.mo3471e(modifierM57934Q);
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                        final C20871a0 c20871a4 = c20871a2;
                        final C20888j c20888j6 = c20888j4;
                        AbstractC22953f.m66714a(AbstractC22953f.m66722k(AbstractC1102d.m3409f(1.0f, c2314t)), null, false, AbstractC37817c.m121344e(1522487157, c28655q, new Function3() { // from class: is0.v
                            @Override // p715kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int iIntValue = ((Integer) obj3).intValue();
                                return AbstractC20916x.m57966y(interfaceC39171c2, f19, iMo724F2, interfaceC28593a5, interfaceC28670t2M30588b3, c20888j6, viewState, c20871a4, function7, interfaceC28593a4, interfaceC28593a6, c20895m2, interfaceC16439p3M46564a, z15, interfaceC33313a2, c13821r1M92099U, iM58033d2, interfaceC4339a4, interfaceC28670t2M30588b4, interfaceC28601c1, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                            }
                        }), c28655q, 3072, 6);
                        c28655q.m87173q(true);
                        c20888j3 = c20888j6;
                        function3 = function7;
                        c20895m1 = c20895m2;
                        c20871a1 = c20871a4;
                        modifier3 = modifier4;
                        c28655q = c28655q;
                        interfaceC4339a2 = interfaceC4339a4;
                    } else {
                        c28655q.m87138X();
                        c20871a1 = c20871a0;
                        function3 = function2;
                        modifier3 = modifier2;
                        c20888j3 = c20888j2;
                        c20895m1 = c20895m0M57840d;
                        interfaceC4339a2 = interfaceC4339a;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2931g((Object) modifier3, (Object) viewState, (Object) c20888j3, (Object) c20895m1, (Object) c20871a1, (Object) interfaceC4339a2, function3, i13, i14, 10);
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                i24 = i14 & 64;
                if (i24 != 0) {
                    i15 |= 1572864;
                    function2 = function1;
                } else {
                    function2 = function1;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q.m87157i(function2)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i15 |= i25;
                    }
                }
                i26 = 0;
                if ((i15 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28655q.m87140Z();
                    i27 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    c28676v0 = C28635l.f115821a;
                    if (i27 != 0) {
                        if (i34 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i35 != 0) {
                            c20888j2 = new C20888j(false, null, 0.0f, 0.0f, 0.0f, null, null, 127, null);
                        }
                        if ((i14 & 8) != 0) {
                            i15 &= -7169;
                            c20895m0M57840d = AbstractC20897n0.m57840d(false, c28655q, 0, 1);
                        }
                        if (i16 != 0) {
                            c20871a2 = new C20871a0(null, false, false, false, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
                        } else {
                            c20871a2 = c20871a0;
                        }
                        i28 = 3;
                        if (i18 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C20886i(i28);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        if (i24 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C20918y(i28);
                                c28655q.m87172p0(objM87133R);
                            }
                            Function1 function8 = (Function1) objM87133R;
                            Modifier modifier6 = modifier2;
                            function4 = function8;
                            modifier4 = modifier6;
                            interfaceC4339a4 = interfaceC4339a3;
                            c20888j4 = c20888j2;
                        } else {
                            modifier4 = modifier2;
                            interfaceC4339a4 = interfaceC4339a3;
                            c20888j4 = c20888j2;
                            function4 = function2;
                        }
                    } else {
                        if (i34 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i35 != 0) {
                            c20888j2 = new C20888j(false, null, 0.0f, 0.0f, 0.0f, null, null, 127, null);
                        }
                        if ((i14 & 8) != 0) {
                            i15 &= -7169;
                            c20895m0M57840d = AbstractC20897n0.m57840d(false, c28655q, 0, 1);
                        }
                        if (i16 != 0) {
                            c20871a2 = new C20871a0(null, false, false, false, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
                        } else {
                            c20871a2 = c20871a0;
                        }
                        i28 = 3;
                        if (i18 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C20886i(i28);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        if (i24 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C20918y(i28);
                                c28655q.m87172p0(objM87133R);
                            }
                            Function1 function9 = (Function1) objM87133R;
                            Modifier modifier7 = modifier2;
                            function4 = function9;
                            modifier4 = modifier7;
                            interfaceC4339a4 = interfaceC4339a3;
                            c20888j4 = c20888j2;
                        } else {
                            modifier4 = modifier2;
                            interfaceC4339a4 = interfaceC4339a3;
                            c20888j4 = c20888j2;
                            function4 = function2;
                        }
                    }
                    c20895m2 = c20895m0M57840d;
                    c28655q.m87175r();
                    if (viewState.getIsLoading()) {
                        f13 = 0.4f;
                    } else {
                        f13 = 1.0f;
                    }
                    final Function1 function10 = function4;
                    final InterfaceC28670t2 interfaceC28670t2M30588b5 = AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(300, 0, null, 6), "reactionsBarOutlineAlpha", null, c28655q, 3120, 20);
                    if (viewState.getIsLoading()) {
                        f14 = 0.0f;
                    } else {
                        f14 = 1.0f;
                    }
                    final InterfaceC28670t2 interfaceC28670t2M30588b6 = AbstractC11352g.m30588b(f14, AbstractC11348f.m30574v(300, 0, null, 6), "reactionsBarContentAlpha", null, c28655q, 3120, 20);
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                    Boolean boolValueOf3 = Boolean.valueOf(c20888j4.getIsExpanded());
                    if ((i15 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R4 = c28655q.m87133R();
                    if (z13) {
                        objM87133R4 = new a(c20888j4, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new a(c20888j4, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, boolValueOf3);
                    int size3 = viewState.m57906c().size();
                    Duration durationM57910g3 = viewState.getRotationInterval();
                    if (c20888j4.getIsExpanded()) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    final int iM58033d3 = AbstractC20921z0.m58033d(size3, durationM57910g3, z14, c28655q, 0, 0);
                    c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                    C11347e2 c11347e4 = AbstractC16362b.f62900a;
                    interfaceC16439p3M46564a = AbstractC16362b.m46564a(c20895m2.getDraggableState(), c28655q, AbstractC16362b.f62902c << 9);
                    zM87153g = c28655q.m87153g(interfaceC16439p3M46564a) | ((((i15 & 7168) ^ 3072) <= 2048 && c28655q.m87153g(c20895m2)) || (i15 & 3072) == 2048) | c28655q.m87153g(c13821r1M92099U);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R5 = AbstractC20897n0.m57837a(new C20910u(c13821r1M92099U, i26), c20895m2, interfaceC16439p3M46564a);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = AbstractC20897n0.m57837a(new C20910u(c13821r1M92099U, i26), c20895m2, interfaceC16439p3M46564a);
                        c28655q.m87172p0(objM87133R5);
                    }
                    final InterfaceC33313a interfaceC33313a3 = (InterfaceC33313a) objM87133R5;
                    final InterfaceC39171c interfaceC39171c3 = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC31061c.m95646v(0, c28655q);
                    }
                    final InterfaceC28593a1 interfaceC28593a7 = (InterfaceC28593a1) objM87133R6;
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC31061c.m95646v(0, c28655q);
                    }
                    final InterfaceC28593a1 interfaceC28593a8 = (InterfaceC28593a1) objM87133R7;
                    if (c20888j4.getIsExpanded()) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                    }
                    final int iMo724F3 = interfaceC39171c3.mo724F(f15);
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = AbstractC31061c.m95646v(0, c28655q);
                    }
                    final InterfaceC28593a1 interfaceC28593a9 = (InterfaceC28593a1) objM87133R8;
                    final float f112 = f15;
                    Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(modifier4, "ReactionsBar"));
                    objM87133R9 = c28655q.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = b.f78807w;
                        c28655q.m87172p0(objM87133R9);
                    }
                    Modifier modifierM118995s3 = AbstractC37056f.m118995s(AbstractC34452c0.m108903b(modifierM3409f3, C23454a0.f92919a, (PointerInputEventHandler) objM87133R9));
                    if (c20888j4.getIsExpanded()) {
                        float f113 = 4;
                        float f114 = f113 * f113;
                        modifierM57934Q = m57934Q(AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105491g(f114, f114, 0.0f, 0.0f, 12)), c20888j4.getChromeProgress(), c20888j4.getChromeHeightPx());
                    } else {
                        modifierM57934Q = c2314t;
                    }
                    Modifier modifierMo3471e3 = modifierM118995s3.mo3471e(modifierM57934Q);
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierMo3471e3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                    final C20871a0 c20871a5 = c20871a2;
                    final C20888j c20888j7 = c20888j4;
                    AbstractC22953f.m66714a(AbstractC22953f.m66722k(AbstractC1102d.m3409f(1.0f, c2314t)), null, false, AbstractC37817c.m121344e(1522487157, c28655q, new Function3() { // from class: is0.v
                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return AbstractC20916x.m57966y(interfaceC39171c3, f112, iMo724F3, interfaceC28593a8, interfaceC28670t2M30588b5, c20888j7, viewState, c20871a5, function10, interfaceC28593a7, interfaceC28593a9, c20895m2, interfaceC16439p3M46564a, z15, interfaceC33313a3, c13821r1M92099U, iM58033d3, interfaceC4339a4, interfaceC28670t2M30588b6, interfaceC28601c1, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                        }
                    }), c28655q, 3072, 6);
                    c28655q.m87173q(true);
                    c20888j3 = c20888j7;
                    function3 = function10;
                    c20895m1 = c20895m2;
                    c20871a1 = c20871a5;
                    modifier3 = modifier4;
                    c28655q = c28655q;
                    interfaceC4339a2 = interfaceC4339a4;
                } else {
                    c28655q.m87138X();
                    c20871a1 = c20871a0;
                    function3 = function2;
                    modifier3 = modifier2;
                    c20888j3 = c20888j2;
                    c20895m1 = c20895m0M57840d;
                    interfaceC4339a2 = interfaceC4339a;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2931g((Object) modifier3, (Object) viewState, (Object) c20888j3, (Object) c20895m1, (Object) c20871a1, (Object) interfaceC4339a2, function3, i13, i14, 10);
                }
            }
            i15 |= 24576;
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    if (c28655q.m87157i(interfaceC4339a)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 64;
                if (i24 != 0) {
                    i15 |= 1572864;
                    function2 = function1;
                } else {
                    function2 = function1;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q.m87157i(function2)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i15 |= i25;
                    }
                }
                i26 = 0;
                if ((i15 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28655q.m87140Z();
                    i27 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    c28676v0 = C28635l.f115821a;
                    if (i27 != 0) {
                        if (i34 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i35 != 0) {
                            c20888j2 = new C20888j(false, null, 0.0f, 0.0f, 0.0f, null, null, 127, null);
                        }
                        if ((i14 & 8) != 0) {
                            i15 &= -7169;
                            c20895m0M57840d = AbstractC20897n0.m57840d(false, c28655q, 0, 1);
                        }
                        if (i16 != 0) {
                            c20871a2 = new C20871a0(null, false, false, false, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
                        } else {
                            c20871a2 = c20871a0;
                        }
                        i28 = 3;
                        if (i18 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C20886i(i28);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        if (i24 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C20918y(i28);
                                c28655q.m87172p0(objM87133R);
                            }
                            Function1 function11 = (Function1) objM87133R;
                            Modifier modifier8 = modifier2;
                            function4 = function11;
                            modifier4 = modifier8;
                            interfaceC4339a4 = interfaceC4339a3;
                            c20888j4 = c20888j2;
                        } else {
                            modifier4 = modifier2;
                            interfaceC4339a4 = interfaceC4339a3;
                            c20888j4 = c20888j2;
                            function4 = function2;
                        }
                    } else {
                        if (i34 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i35 != 0) {
                            c20888j2 = new C20888j(false, null, 0.0f, 0.0f, 0.0f, null, null, 127, null);
                        }
                        if ((i14 & 8) != 0) {
                            i15 &= -7169;
                            c20895m0M57840d = AbstractC20897n0.m57840d(false, c28655q, 0, 1);
                        }
                        if (i16 != 0) {
                            c20871a2 = new C20871a0(null, false, false, false, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
                        } else {
                            c20871a2 = c20871a0;
                        }
                        i28 = 3;
                        if (i18 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C20886i(i28);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        if (i24 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C20918y(i28);
                                c28655q.m87172p0(objM87133R);
                            }
                            Function1 function12 = (Function1) objM87133R;
                            Modifier modifier9 = modifier2;
                            function4 = function12;
                            modifier4 = modifier9;
                            interfaceC4339a4 = interfaceC4339a3;
                            c20888j4 = c20888j2;
                        } else {
                            modifier4 = modifier2;
                            interfaceC4339a4 = interfaceC4339a3;
                            c20888j4 = c20888j2;
                            function4 = function2;
                        }
                    }
                    c20895m2 = c20895m0M57840d;
                    c28655q.m87175r();
                    if (viewState.getIsLoading()) {
                        f13 = 0.4f;
                    } else {
                        f13 = 1.0f;
                    }
                    final Function1 function13 = function4;
                    final InterfaceC28670t2 interfaceC28670t2M30588b7 = AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(300, 0, null, 6), "reactionsBarOutlineAlpha", null, c28655q, 3120, 20);
                    if (viewState.getIsLoading()) {
                        f14 = 0.0f;
                    } else {
                        f14 = 1.0f;
                    }
                    final InterfaceC28670t2 interfaceC28670t2M30588b8 = AbstractC11352g.m30588b(f14, AbstractC11348f.m30574v(300, 0, null, 6), "reactionsBarContentAlpha", null, c28655q, 3120, 20);
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                    Boolean boolValueOf4 = Boolean.valueOf(c20888j4.getIsExpanded());
                    if ((i15 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R4 = c28655q.m87133R();
                    if (z13) {
                        objM87133R4 = new a(c20888j4, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new a(c20888j4, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, boolValueOf4);
                    int size4 = viewState.m57906c().size();
                    Duration durationM57910g4 = viewState.getRotationInterval();
                    if (c20888j4.getIsExpanded()) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    final int iM58033d4 = AbstractC20921z0.m58033d(size4, durationM57910g4, z14, c28655q, 0, 0);
                    c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                    C11347e2 c11347e5 = AbstractC16362b.f62900a;
                    interfaceC16439p3M46564a = AbstractC16362b.m46564a(c20895m2.getDraggableState(), c28655q, AbstractC16362b.f62902c << 9);
                    zM87153g = c28655q.m87153g(interfaceC16439p3M46564a) | ((((i15 & 7168) ^ 3072) <= 2048 && c28655q.m87153g(c20895m2)) || (i15 & 3072) == 2048) | c28655q.m87153g(c13821r1M92099U);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R5 = AbstractC20897n0.m57837a(new C20910u(c13821r1M92099U, i26), c20895m2, interfaceC16439p3M46564a);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = AbstractC20897n0.m57837a(new C20910u(c13821r1M92099U, i26), c20895m2, interfaceC16439p3M46564a);
                        c28655q.m87172p0(objM87133R5);
                    }
                    final InterfaceC33313a interfaceC33313a4 = (InterfaceC33313a) objM87133R5;
                    final InterfaceC39171c interfaceC39171c4 = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC31061c.m95646v(0, c28655q);
                    }
                    final InterfaceC28593a1 interfaceC28593a10 = (InterfaceC28593a1) objM87133R6;
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC31061c.m95646v(0, c28655q);
                    }
                    final InterfaceC28593a1 interfaceC28593a11 = (InterfaceC28593a1) objM87133R7;
                    if (c20888j4.getIsExpanded()) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                    }
                    final int iMo724F4 = interfaceC39171c4.mo724F(f15);
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = AbstractC31061c.m95646v(0, c28655q);
                    }
                    final InterfaceC28593a1 interfaceC28593a12 = (InterfaceC28593a1) objM87133R8;
                    final float f115 = f15;
                    Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(modifier4, "ReactionsBar"));
                    objM87133R9 = c28655q.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = b.f78807w;
                        c28655q.m87172p0(objM87133R9);
                    }
                    Modifier modifierM118995s4 = AbstractC37056f.m118995s(AbstractC34452c0.m108903b(modifierM3409f4, C23454a0.f92919a, (PointerInputEventHandler) objM87133R9));
                    if (c20888j4.getIsExpanded()) {
                        float f116 = 4;
                        float f117 = f116 * f116;
                        modifierM57934Q = m57934Q(AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105491g(f117, f117, 0.0f, 0.0f, 12)), c20888j4.getChromeProgress(), c20888j4.getChromeHeightPx());
                    } else {
                        modifierM57934Q = c2314t;
                    }
                    Modifier modifierMo3471e4 = modifierM118995s4.mo3471e(modifierM57934Q);
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierMo3471e4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d4);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                    final C20871a0 c20871a6 = c20871a2;
                    final C20888j c20888j8 = c20888j4;
                    AbstractC22953f.m66714a(AbstractC22953f.m66722k(AbstractC1102d.m3409f(1.0f, c2314t)), null, false, AbstractC37817c.m121344e(1522487157, c28655q, new Function3() { // from class: is0.v
                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return AbstractC20916x.m57966y(interfaceC39171c4, f115, iMo724F4, interfaceC28593a11, interfaceC28670t2M30588b7, c20888j8, viewState, c20871a6, function13, interfaceC28593a10, interfaceC28593a12, c20895m2, interfaceC16439p3M46564a, z15, interfaceC33313a4, c13821r1M92099U, iM58033d4, interfaceC4339a4, interfaceC28670t2M30588b8, interfaceC28601c1, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                        }
                    }), c28655q, 3072, 6);
                    c28655q.m87173q(true);
                    c20888j3 = c20888j8;
                    function3 = function13;
                    c20895m1 = c20895m2;
                    c20871a1 = c20871a6;
                    modifier3 = modifier4;
                    c28655q = c28655q;
                    interfaceC4339a2 = interfaceC4339a4;
                } else {
                    c28655q.m87138X();
                    c20871a1 = c20871a0;
                    function3 = function2;
                    modifier3 = modifier2;
                    c20888j3 = c20888j2;
                    c20895m1 = c20895m0M57840d;
                    interfaceC4339a2 = interfaceC4339a;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2931g((Object) modifier3, (Object) viewState, (Object) c20888j3, (Object) c20895m1, (Object) c20871a1, (Object) interfaceC4339a2, function3, i13, i14, 10);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
                function2 = function1;
            } else {
                function2 = function1;
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87157i(function2)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
            }
            i26 = 0;
            if ((i15 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                i27 = i13 & 1;
                c2314t = C2314t.f9131w;
                c28676v0 = C28635l.f115821a;
                if (i27 != 0) {
                    if (i34 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i35 != 0) {
                        c20888j2 = new C20888j(false, null, 0.0f, 0.0f, 0.0f, null, null, 127, null);
                    }
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                        c20895m0M57840d = AbstractC20897n0.m57840d(false, c28655q, 0, 1);
                    }
                    if (i16 != 0) {
                        c20871a2 = new C20871a0(null, false, false, false, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
                    } else {
                        c20871a2 = c20871a0;
                    }
                    i28 = 3;
                    if (i18 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C20886i(i28);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    if (i24 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C20918y(i28);
                            c28655q.m87172p0(objM87133R);
                        }
                        Function1 function14 = (Function1) objM87133R;
                        Modifier modifier10 = modifier2;
                        function4 = function14;
                        modifier4 = modifier10;
                        interfaceC4339a4 = interfaceC4339a3;
                        c20888j4 = c20888j2;
                    } else {
                        modifier4 = modifier2;
                        interfaceC4339a4 = interfaceC4339a3;
                        c20888j4 = c20888j2;
                        function4 = function2;
                    }
                } else {
                    if (i34 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i35 != 0) {
                        c20888j2 = new C20888j(false, null, 0.0f, 0.0f, 0.0f, null, null, 127, null);
                    }
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                        c20895m0M57840d = AbstractC20897n0.m57840d(false, c28655q, 0, 1);
                    }
                    if (i16 != 0) {
                        c20871a2 = new C20871a0(null, false, false, false, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
                    } else {
                        c20871a2 = c20871a0;
                    }
                    i28 = 3;
                    if (i18 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C20886i(i28);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    if (i24 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C20918y(i28);
                            c28655q.m87172p0(objM87133R);
                        }
                        Function1 function15 = (Function1) objM87133R;
                        Modifier modifier11 = modifier2;
                        function4 = function15;
                        modifier4 = modifier11;
                        interfaceC4339a4 = interfaceC4339a3;
                        c20888j4 = c20888j2;
                    } else {
                        modifier4 = modifier2;
                        interfaceC4339a4 = interfaceC4339a3;
                        c20888j4 = c20888j2;
                        function4 = function2;
                    }
                }
                c20895m2 = c20895m0M57840d;
                c28655q.m87175r();
                if (viewState.getIsLoading()) {
                    f13 = 0.4f;
                } else {
                    f13 = 1.0f;
                }
                final Function1 function16 = function4;
                final InterfaceC28670t2 interfaceC28670t2M30588b9 = AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(300, 0, null, 6), "reactionsBarOutlineAlpha", null, c28655q, 3120, 20);
                if (viewState.getIsLoading()) {
                    f14 = 0.0f;
                } else {
                    f14 = 1.0f;
                }
                final InterfaceC28670t2 interfaceC28670t2M30588b10 = AbstractC11352g.m30588b(f14, AbstractC11348f.m30574v(300, 0, null, 6), "reactionsBarContentAlpha", null, c28655q, 3120, 20);
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                Boolean boolValueOf5 = Boolean.valueOf(c20888j4.getIsExpanded());
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R4 = c28655q.m87133R();
                if (z13) {
                    objM87133R4 = new a(c20888j4, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new a(c20888j4, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, boolValueOf5);
                int size5 = viewState.m57906c().size();
                Duration durationM57910g5 = viewState.getRotationInterval();
                if (c20888j4.getIsExpanded()) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                final int iM58033d5 = AbstractC20921z0.m58033d(size5, durationM57910g5, z14, c28655q, 0, 0);
                c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                C11347e2 c11347e6 = AbstractC16362b.f62900a;
                interfaceC16439p3M46564a = AbstractC16362b.m46564a(c20895m2.getDraggableState(), c28655q, AbstractC16362b.f62902c << 9);
                zM87153g = c28655q.m87153g(interfaceC16439p3M46564a) | ((((i15 & 7168) ^ 3072) <= 2048 && c28655q.m87153g(c20895m2)) || (i15 & 3072) == 2048) | c28655q.m87153g(c13821r1M92099U);
                objM87133R5 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R5 = AbstractC20897n0.m57837a(new C20910u(c13821r1M92099U, i26), c20895m2, interfaceC16439p3M46564a);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = AbstractC20897n0.m57837a(new C20910u(c13821r1M92099U, i26), c20895m2, interfaceC16439p3M46564a);
                    c28655q.m87172p0(objM87133R5);
                }
                final InterfaceC33313a interfaceC33313a5 = (InterfaceC33313a) objM87133R5;
                final InterfaceC39171c interfaceC39171c5 = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC31061c.m95646v(0, c28655q);
                }
                final InterfaceC28593a1 interfaceC28593a13 = (InterfaceC28593a1) objM87133R6;
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC31061c.m95646v(0, c28655q);
                }
                final InterfaceC28593a1 interfaceC28593a14 = (InterfaceC28593a1) objM87133R7;
                if (c20888j4.getIsExpanded()) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                if (z15) {
                }
                final int iMo724F5 = interfaceC39171c5.mo724F(f15);
                objM87133R8 = c28655q.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = AbstractC31061c.m95646v(0, c28655q);
                }
                final InterfaceC28593a1 interfaceC28593a15 = (InterfaceC28593a1) objM87133R8;
                final float f118 = f15;
                Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(modifier4, "ReactionsBar"));
                objM87133R9 = c28655q.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = b.f78807w;
                    c28655q.m87172p0(objM87133R9);
                }
                Modifier modifierM118995s5 = AbstractC37056f.m118995s(AbstractC34452c0.m108903b(modifierM3409f5, C23454a0.f92919a, (PointerInputEventHandler) objM87133R9));
                if (c20888j4.getIsExpanded()) {
                    float f119 = 4;
                    float f1110 = f119 * f119;
                    modifierM57934Q = m57934Q(AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105491g(f1110, f1110, 0.0f, 0.0f, 12)), c20888j4.getChromeProgress(), c20888j4.getChromeHeightPx());
                } else {
                    modifierM57934Q = c2314t;
                }
                Modifier modifierMo3471e5 = modifierM118995s5.mo3471e(modifierM57934Q);
                InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierMo3471e5);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d5);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                final C20871a0 c20871a7 = c20871a2;
                final C20888j c20888j9 = c20888j4;
                AbstractC22953f.m66714a(AbstractC22953f.m66722k(AbstractC1102d.m3409f(1.0f, c2314t)), null, false, AbstractC37817c.m121344e(1522487157, c28655q, new Function3() { // from class: is0.v
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC20916x.m57966y(interfaceC39171c5, f118, iMo724F5, interfaceC28593a14, interfaceC28670t2M30588b9, c20888j9, viewState, c20871a7, function16, interfaceC28593a13, interfaceC28593a15, c20895m2, interfaceC16439p3M46564a, z15, interfaceC33313a5, c13821r1M92099U, iM58033d5, interfaceC4339a4, interfaceC28670t2M30588b10, interfaceC28601c1, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                    }
                }), c28655q, 3072, 6);
                c28655q.m87173q(true);
                c20888j3 = c20888j9;
                function3 = function16;
                c20895m1 = c20895m2;
                c20871a1 = c20871a7;
                modifier3 = modifier4;
                c28655q = c28655q;
                interfaceC4339a2 = interfaceC4339a4;
            } else {
                c28655q.m87138X();
                c20871a1 = c20871a0;
                function3 = function2;
                modifier3 = modifier2;
                c20888j3 = c20888j2;
                c20895m1 = c20895m0M57840d;
                interfaceC4339a2 = interfaceC4339a;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2931g((Object) modifier3, (Object) viewState, (Object) c20888j3, (Object) c20895m1, (Object) c20871a1, (Object) interfaceC4339a2, function3, i13, i14, 10);
            }
        }
        i15 |= 384;
        c20888j2 = c20888j;
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) == 0) {
                c20895m0M57840d = c20895m0;
                if (c28655q.m87153g(c20895m0M57840d)) {
                    i29 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i15 |= i29;
            } else {
                c20895m0M57840d = c20895m0;
            }
            i29 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i15 |= i29;
        } else {
            c20895m0M57840d = c20895m0;
        }
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                if (c28655q.m87153g(c20871a0)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    if (c28655q.m87157i(interfaceC4339a)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 64;
                if (i24 != 0) {
                    i15 |= 1572864;
                    function2 = function1;
                } else {
                    function2 = function1;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q.m87157i(function2)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i15 |= i25;
                    }
                }
                i26 = 0;
                if ((i15 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28655q.m87140Z();
                    i27 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    c28676v0 = C28635l.f115821a;
                    if (i27 != 0) {
                        if (i34 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i35 != 0) {
                            c20888j2 = new C20888j(false, null, 0.0f, 0.0f, 0.0f, null, null, 127, null);
                        }
                        if ((i14 & 8) != 0) {
                            i15 &= -7169;
                            c20895m0M57840d = AbstractC20897n0.m57840d(false, c28655q, 0, 1);
                        }
                        if (i16 != 0) {
                            c20871a2 = new C20871a0(null, false, false, false, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
                        } else {
                            c20871a2 = c20871a0;
                        }
                        i28 = 3;
                        if (i18 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C20886i(i28);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        if (i24 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C20918y(i28);
                                c28655q.m87172p0(objM87133R);
                            }
                            Function1 function17 = (Function1) objM87133R;
                            Modifier modifier12 = modifier2;
                            function4 = function17;
                            modifier4 = modifier12;
                            interfaceC4339a4 = interfaceC4339a3;
                            c20888j4 = c20888j2;
                        } else {
                            modifier4 = modifier2;
                            interfaceC4339a4 = interfaceC4339a3;
                            c20888j4 = c20888j2;
                            function4 = function2;
                        }
                    } else {
                        if (i34 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i35 != 0) {
                            c20888j2 = new C20888j(false, null, 0.0f, 0.0f, 0.0f, null, null, 127, null);
                        }
                        if ((i14 & 8) != 0) {
                            i15 &= -7169;
                            c20895m0M57840d = AbstractC20897n0.m57840d(false, c28655q, 0, 1);
                        }
                        if (i16 != 0) {
                            c20871a2 = new C20871a0(null, false, false, false, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
                        } else {
                            c20871a2 = c20871a0;
                        }
                        i28 = 3;
                        if (i18 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C20886i(i28);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        if (i24 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C20918y(i28);
                                c28655q.m87172p0(objM87133R);
                            }
                            Function1 function18 = (Function1) objM87133R;
                            Modifier modifier13 = modifier2;
                            function4 = function18;
                            modifier4 = modifier13;
                            interfaceC4339a4 = interfaceC4339a3;
                            c20888j4 = c20888j2;
                        } else {
                            modifier4 = modifier2;
                            interfaceC4339a4 = interfaceC4339a3;
                            c20888j4 = c20888j2;
                            function4 = function2;
                        }
                    }
                    c20895m2 = c20895m0M57840d;
                    c28655q.m87175r();
                    if (viewState.getIsLoading()) {
                        f13 = 0.4f;
                    } else {
                        f13 = 1.0f;
                    }
                    final Function1 function19 = function4;
                    final InterfaceC28670t2 interfaceC28670t2M30588b11 = AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(300, 0, null, 6), "reactionsBarOutlineAlpha", null, c28655q, 3120, 20);
                    if (viewState.getIsLoading()) {
                        f14 = 0.0f;
                    } else {
                        f14 = 1.0f;
                    }
                    final InterfaceC28670t2 interfaceC28670t2M30588b12 = AbstractC11352g.m30588b(f14, AbstractC11348f.m30574v(300, 0, null, 6), "reactionsBarContentAlpha", null, c28655q, 3120, 20);
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                    Boolean boolValueOf6 = Boolean.valueOf(c20888j4.getIsExpanded());
                    if ((i15 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R4 = c28655q.m87133R();
                    if (z13) {
                        objM87133R4 = new a(c20888j4, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new a(c20888j4, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, boolValueOf6);
                    int size6 = viewState.m57906c().size();
                    Duration durationM57910g6 = viewState.getRotationInterval();
                    if (c20888j4.getIsExpanded()) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    final int iM58033d6 = AbstractC20921z0.m58033d(size6, durationM57910g6, z14, c28655q, 0, 0);
                    c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                    C11347e2 c11347e7 = AbstractC16362b.f62900a;
                    interfaceC16439p3M46564a = AbstractC16362b.m46564a(c20895m2.getDraggableState(), c28655q, AbstractC16362b.f62902c << 9);
                    zM87153g = c28655q.m87153g(interfaceC16439p3M46564a) | ((((i15 & 7168) ^ 3072) <= 2048 && c28655q.m87153g(c20895m2)) || (i15 & 3072) == 2048) | c28655q.m87153g(c13821r1M92099U);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R5 = AbstractC20897n0.m57837a(new C20910u(c13821r1M92099U, i26), c20895m2, interfaceC16439p3M46564a);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = AbstractC20897n0.m57837a(new C20910u(c13821r1M92099U, i26), c20895m2, interfaceC16439p3M46564a);
                        c28655q.m87172p0(objM87133R5);
                    }
                    final InterfaceC33313a interfaceC33313a6 = (InterfaceC33313a) objM87133R5;
                    final InterfaceC39171c interfaceC39171c6 = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC31061c.m95646v(0, c28655q);
                    }
                    final InterfaceC28593a1 interfaceC28593a16 = (InterfaceC28593a1) objM87133R6;
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC31061c.m95646v(0, c28655q);
                    }
                    final InterfaceC28593a1 interfaceC28593a17 = (InterfaceC28593a1) objM87133R7;
                    if (c20888j4.getIsExpanded()) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                    }
                    final int iMo724F6 = interfaceC39171c6.mo724F(f15);
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = AbstractC31061c.m95646v(0, c28655q);
                    }
                    final InterfaceC28593a1 interfaceC28593a18 = (InterfaceC28593a1) objM87133R8;
                    final float f1111 = f15;
                    Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(modifier4, "ReactionsBar"));
                    objM87133R9 = c28655q.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = b.f78807w;
                        c28655q.m87172p0(objM87133R9);
                    }
                    Modifier modifierM118995s6 = AbstractC37056f.m118995s(AbstractC34452c0.m108903b(modifierM3409f6, C23454a0.f92919a, (PointerInputEventHandler) objM87133R9));
                    if (c20888j4.getIsExpanded()) {
                        float f1112 = 4;
                        float f1113 = f1112 * f1112;
                        modifierM57934Q = m57934Q(AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105491g(f1113, f1113, 0.0f, 0.0f, 12)), c20888j4.getChromeProgress(), c20888j4.getChromeHeightPx());
                    } else {
                        modifierM57934Q = c2314t;
                    }
                    Modifier modifierMo3471e6 = modifierM118995s6.mo3471e(modifierM57934Q);
                    InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierMo3471e6);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d6);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                    final C20871a0 c20871a8 = c20871a2;
                    final C20888j c20888j10 = c20888j4;
                    AbstractC22953f.m66714a(AbstractC22953f.m66722k(AbstractC1102d.m3409f(1.0f, c2314t)), null, false, AbstractC37817c.m121344e(1522487157, c28655q, new Function3() { // from class: is0.v
                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return AbstractC20916x.m57966y(interfaceC39171c6, f1111, iMo724F6, interfaceC28593a17, interfaceC28670t2M30588b11, c20888j10, viewState, c20871a8, function19, interfaceC28593a16, interfaceC28593a18, c20895m2, interfaceC16439p3M46564a, z15, interfaceC33313a6, c13821r1M92099U, iM58033d6, interfaceC4339a4, interfaceC28670t2M30588b12, interfaceC28601c1, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                        }
                    }), c28655q, 3072, 6);
                    c28655q.m87173q(true);
                    c20888j3 = c20888j10;
                    function3 = function19;
                    c20895m1 = c20895m2;
                    c20871a1 = c20871a8;
                    modifier3 = modifier4;
                    c28655q = c28655q;
                    interfaceC4339a2 = interfaceC4339a4;
                } else {
                    c28655q.m87138X();
                    c20871a1 = c20871a0;
                    function3 = function2;
                    modifier3 = modifier2;
                    c20888j3 = c20888j2;
                    c20895m1 = c20895m0M57840d;
                    interfaceC4339a2 = interfaceC4339a;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2931g((Object) modifier3, (Object) viewState, (Object) c20888j3, (Object) c20895m1, (Object) c20871a1, (Object) interfaceC4339a2, function3, i13, i14, 10);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
                function2 = function1;
            } else {
                function2 = function1;
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87157i(function2)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
            }
            i26 = 0;
            if ((i15 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                i27 = i13 & 1;
                c2314t = C2314t.f9131w;
                c28676v0 = C28635l.f115821a;
                if (i27 != 0) {
                    if (i34 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i35 != 0) {
                        c20888j2 = new C20888j(false, null, 0.0f, 0.0f, 0.0f, null, null, 127, null);
                    }
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                        c20895m0M57840d = AbstractC20897n0.m57840d(false, c28655q, 0, 1);
                    }
                    if (i16 != 0) {
                        c20871a2 = new C20871a0(null, false, false, false, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
                    } else {
                        c20871a2 = c20871a0;
                    }
                    i28 = 3;
                    if (i18 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C20886i(i28);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    if (i24 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C20918y(i28);
                            c28655q.m87172p0(objM87133R);
                        }
                        Function1 function110 = (Function1) objM87133R;
                        Modifier modifier14 = modifier2;
                        function4 = function110;
                        modifier4 = modifier14;
                        interfaceC4339a4 = interfaceC4339a3;
                        c20888j4 = c20888j2;
                    } else {
                        modifier4 = modifier2;
                        interfaceC4339a4 = interfaceC4339a3;
                        c20888j4 = c20888j2;
                        function4 = function2;
                    }
                } else {
                    if (i34 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i35 != 0) {
                        c20888j2 = new C20888j(false, null, 0.0f, 0.0f, 0.0f, null, null, 127, null);
                    }
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                        c20895m0M57840d = AbstractC20897n0.m57840d(false, c28655q, 0, 1);
                    }
                    if (i16 != 0) {
                        c20871a2 = new C20871a0(null, false, false, false, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
                    } else {
                        c20871a2 = c20871a0;
                    }
                    i28 = 3;
                    if (i18 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C20886i(i28);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    if (i24 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C20918y(i28);
                            c28655q.m87172p0(objM87133R);
                        }
                        Function1 function111 = (Function1) objM87133R;
                        Modifier modifier15 = modifier2;
                        function4 = function111;
                        modifier4 = modifier15;
                        interfaceC4339a4 = interfaceC4339a3;
                        c20888j4 = c20888j2;
                    } else {
                        modifier4 = modifier2;
                        interfaceC4339a4 = interfaceC4339a3;
                        c20888j4 = c20888j2;
                        function4 = function2;
                    }
                }
                c20895m2 = c20895m0M57840d;
                c28655q.m87175r();
                if (viewState.getIsLoading()) {
                    f13 = 0.4f;
                } else {
                    f13 = 1.0f;
                }
                final Function1 function112 = function4;
                final InterfaceC28670t2 interfaceC28670t2M30588b13 = AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(300, 0, null, 6), "reactionsBarOutlineAlpha", null, c28655q, 3120, 20);
                if (viewState.getIsLoading()) {
                    f14 = 0.0f;
                } else {
                    f14 = 1.0f;
                }
                final InterfaceC28670t2 interfaceC28670t2M30588b14 = AbstractC11352g.m30588b(f14, AbstractC11348f.m30574v(300, 0, null, 6), "reactionsBarContentAlpha", null, c28655q, 3120, 20);
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                Boolean boolValueOf7 = Boolean.valueOf(c20888j4.getIsExpanded());
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R4 = c28655q.m87133R();
                if (z13) {
                    objM87133R4 = new a(c20888j4, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new a(c20888j4, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, boolValueOf7);
                int size7 = viewState.m57906c().size();
                Duration durationM57910g7 = viewState.getRotationInterval();
                if (c20888j4.getIsExpanded()) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                final int iM58033d7 = AbstractC20921z0.m58033d(size7, durationM57910g7, z14, c28655q, 0, 0);
                c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                C11347e2 c11347e8 = AbstractC16362b.f62900a;
                interfaceC16439p3M46564a = AbstractC16362b.m46564a(c20895m2.getDraggableState(), c28655q, AbstractC16362b.f62902c << 9);
                zM87153g = c28655q.m87153g(interfaceC16439p3M46564a) | ((((i15 & 7168) ^ 3072) <= 2048 && c28655q.m87153g(c20895m2)) || (i15 & 3072) == 2048) | c28655q.m87153g(c13821r1M92099U);
                objM87133R5 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R5 = AbstractC20897n0.m57837a(new C20910u(c13821r1M92099U, i26), c20895m2, interfaceC16439p3M46564a);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = AbstractC20897n0.m57837a(new C20910u(c13821r1M92099U, i26), c20895m2, interfaceC16439p3M46564a);
                    c28655q.m87172p0(objM87133R5);
                }
                final InterfaceC33313a interfaceC33313a7 = (InterfaceC33313a) objM87133R5;
                final InterfaceC39171c interfaceC39171c7 = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC31061c.m95646v(0, c28655q);
                }
                final InterfaceC28593a1 interfaceC28593a19 = (InterfaceC28593a1) objM87133R6;
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC31061c.m95646v(0, c28655q);
                }
                final InterfaceC28593a1 interfaceC28593a110 = (InterfaceC28593a1) objM87133R7;
                if (c20888j4.getIsExpanded()) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                if (z15) {
                }
                final int iMo724F7 = interfaceC39171c7.mo724F(f15);
                objM87133R8 = c28655q.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = AbstractC31061c.m95646v(0, c28655q);
                }
                final InterfaceC28593a1 interfaceC28593a111 = (InterfaceC28593a1) objM87133R8;
                final float f1114 = f15;
                Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(modifier4, "ReactionsBar"));
                objM87133R9 = c28655q.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = b.f78807w;
                    c28655q.m87172p0(objM87133R9);
                }
                Modifier modifierM118995s7 = AbstractC37056f.m118995s(AbstractC34452c0.m108903b(modifierM3409f7, C23454a0.f92919a, (PointerInputEventHandler) objM87133R9));
                if (c20888j4.getIsExpanded()) {
                    float f1115 = 4;
                    float f1116 = f1115 * f1115;
                    modifierM57934Q = m57934Q(AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105491g(f1116, f1116, 0.0f, 0.0f, 12)), c20888j4.getChromeProgress(), c20888j4.getChromeHeightPx());
                } else {
                    modifierM57934Q = c2314t;
                }
                Modifier modifierMo3471e7 = modifierM118995s7.mo3471e(modifierM57934Q);
                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierMo3471e7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d7);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                final C20871a0 c20871a9 = c20871a2;
                final C20888j c20888j11 = c20888j4;
                AbstractC22953f.m66714a(AbstractC22953f.m66722k(AbstractC1102d.m3409f(1.0f, c2314t)), null, false, AbstractC37817c.m121344e(1522487157, c28655q, new Function3() { // from class: is0.v
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC20916x.m57966y(interfaceC39171c7, f1114, iMo724F7, interfaceC28593a110, interfaceC28670t2M30588b13, c20888j11, viewState, c20871a9, function112, interfaceC28593a19, interfaceC28593a111, c20895m2, interfaceC16439p3M46564a, z15, interfaceC33313a7, c13821r1M92099U, iM58033d7, interfaceC4339a4, interfaceC28670t2M30588b14, interfaceC28601c1, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                    }
                }), c28655q, 3072, 6);
                c28655q.m87173q(true);
                c20888j3 = c20888j11;
                function3 = function112;
                c20895m1 = c20895m2;
                c20871a1 = c20871a9;
                modifier3 = modifier4;
                c28655q = c28655q;
                interfaceC4339a2 = interfaceC4339a4;
            } else {
                c28655q.m87138X();
                c20871a1 = c20871a0;
                function3 = function2;
                modifier3 = modifier2;
                c20888j3 = c20888j2;
                c20895m1 = c20895m0M57840d;
                interfaceC4339a2 = interfaceC4339a;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2931g((Object) modifier3, (Object) viewState, (Object) c20888j3, (Object) c20895m1, (Object) c20871a1, (Object) interfaceC4339a2, function3, i13, i14, 10);
            }
        }
        i15 |= 24576;
        i18 = i14 & 32;
        if (i18 != 0) {
            if ((196608 & i13) == 0) {
                if (c28655q.m87157i(interfaceC4339a)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i19;
            }
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
                function2 = function1;
            } else {
                function2 = function1;
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87157i(function2)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
            }
            i26 = 0;
            if ((i15 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                i27 = i13 & 1;
                c2314t = C2314t.f9131w;
                c28676v0 = C28635l.f115821a;
                if (i27 != 0) {
                    if (i34 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i35 != 0) {
                        c20888j2 = new C20888j(false, null, 0.0f, 0.0f, 0.0f, null, null, 127, null);
                    }
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                        c20895m0M57840d = AbstractC20897n0.m57840d(false, c28655q, 0, 1);
                    }
                    if (i16 != 0) {
                        c20871a2 = new C20871a0(null, false, false, false, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
                    } else {
                        c20871a2 = c20871a0;
                    }
                    i28 = 3;
                    if (i18 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C20886i(i28);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    if (i24 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C20918y(i28);
                            c28655q.m87172p0(objM87133R);
                        }
                        Function1 function113 = (Function1) objM87133R;
                        Modifier modifier16 = modifier2;
                        function4 = function113;
                        modifier4 = modifier16;
                        interfaceC4339a4 = interfaceC4339a3;
                        c20888j4 = c20888j2;
                    } else {
                        modifier4 = modifier2;
                        interfaceC4339a4 = interfaceC4339a3;
                        c20888j4 = c20888j2;
                        function4 = function2;
                    }
                } else {
                    if (i34 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i35 != 0) {
                        c20888j2 = new C20888j(false, null, 0.0f, 0.0f, 0.0f, null, null, 127, null);
                    }
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                        c20895m0M57840d = AbstractC20897n0.m57840d(false, c28655q, 0, 1);
                    }
                    if (i16 != 0) {
                        c20871a2 = new C20871a0(null, false, false, false, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
                    } else {
                        c20871a2 = c20871a0;
                    }
                    i28 = 3;
                    if (i18 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C20886i(i28);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    if (i24 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C20918y(i28);
                            c28655q.m87172p0(objM87133R);
                        }
                        Function1 function114 = (Function1) objM87133R;
                        Modifier modifier17 = modifier2;
                        function4 = function114;
                        modifier4 = modifier17;
                        interfaceC4339a4 = interfaceC4339a3;
                        c20888j4 = c20888j2;
                    } else {
                        modifier4 = modifier2;
                        interfaceC4339a4 = interfaceC4339a3;
                        c20888j4 = c20888j2;
                        function4 = function2;
                    }
                }
                c20895m2 = c20895m0M57840d;
                c28655q.m87175r();
                if (viewState.getIsLoading()) {
                    f13 = 0.4f;
                } else {
                    f13 = 1.0f;
                }
                final Function1 function115 = function4;
                final InterfaceC28670t2 interfaceC28670t2M30588b15 = AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(300, 0, null, 6), "reactionsBarOutlineAlpha", null, c28655q, 3120, 20);
                if (viewState.getIsLoading()) {
                    f14 = 0.0f;
                } else {
                    f14 = 1.0f;
                }
                final InterfaceC28670t2 interfaceC28670t2M30588b16 = AbstractC11352g.m30588b(f14, AbstractC11348f.m30574v(300, 0, null, 6), "reactionsBarContentAlpha", null, c28655q, 3120, 20);
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                Boolean boolValueOf8 = Boolean.valueOf(c20888j4.getIsExpanded());
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R4 = c28655q.m87133R();
                if (z13) {
                    objM87133R4 = new a(c20888j4, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new a(c20888j4, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, boolValueOf8);
                int size8 = viewState.m57906c().size();
                Duration durationM57910g8 = viewState.getRotationInterval();
                if (c20888j4.getIsExpanded()) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                final int iM58033d8 = AbstractC20921z0.m58033d(size8, durationM57910g8, z14, c28655q, 0, 0);
                c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                C11347e2 c11347e9 = AbstractC16362b.f62900a;
                interfaceC16439p3M46564a = AbstractC16362b.m46564a(c20895m2.getDraggableState(), c28655q, AbstractC16362b.f62902c << 9);
                zM87153g = c28655q.m87153g(interfaceC16439p3M46564a) | ((((i15 & 7168) ^ 3072) <= 2048 && c28655q.m87153g(c20895m2)) || (i15 & 3072) == 2048) | c28655q.m87153g(c13821r1M92099U);
                objM87133R5 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R5 = AbstractC20897n0.m57837a(new C20910u(c13821r1M92099U, i26), c20895m2, interfaceC16439p3M46564a);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = AbstractC20897n0.m57837a(new C20910u(c13821r1M92099U, i26), c20895m2, interfaceC16439p3M46564a);
                    c28655q.m87172p0(objM87133R5);
                }
                final InterfaceC33313a interfaceC33313a8 = (InterfaceC33313a) objM87133R5;
                final InterfaceC39171c interfaceC39171c8 = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC31061c.m95646v(0, c28655q);
                }
                final InterfaceC28593a1 interfaceC28593a112 = (InterfaceC28593a1) objM87133R6;
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC31061c.m95646v(0, c28655q);
                }
                final InterfaceC28593a1 interfaceC28593a113 = (InterfaceC28593a1) objM87133R7;
                if (c20888j4.getIsExpanded()) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                if (z15) {
                }
                final int iMo724F8 = interfaceC39171c8.mo724F(f15);
                objM87133R8 = c28655q.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = AbstractC31061c.m95646v(0, c28655q);
                }
                final InterfaceC28593a1 interfaceC28593a114 = (InterfaceC28593a1) objM87133R8;
                final float f1117 = f15;
                Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(modifier4, "ReactionsBar"));
                objM87133R9 = c28655q.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = b.f78807w;
                    c28655q.m87172p0(objM87133R9);
                }
                Modifier modifierM118995s8 = AbstractC37056f.m118995s(AbstractC34452c0.m108903b(modifierM3409f8, C23454a0.f92919a, (PointerInputEventHandler) objM87133R9));
                if (c20888j4.getIsExpanded()) {
                    float f1118 = 4;
                    float f1119 = f1118 * f1118;
                    modifierM57934Q = m57934Q(AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105491g(f1119, f1119, 0.0f, 0.0f, 12)), c20888j4.getChromeProgress(), c20888j4.getChromeHeightPx());
                } else {
                    modifierM57934Q = c2314t;
                }
                Modifier modifierMo3471e8 = modifierM118995s8.mo3471e(modifierM57934Q);
                InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierMo3471e8);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d8);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
                final C20871a0 c20871a10 = c20871a2;
                final C20888j c20888j12 = c20888j4;
                AbstractC22953f.m66714a(AbstractC22953f.m66722k(AbstractC1102d.m3409f(1.0f, c2314t)), null, false, AbstractC37817c.m121344e(1522487157, c28655q, new Function3() { // from class: is0.v
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC20916x.m57966y(interfaceC39171c8, f1117, iMo724F8, interfaceC28593a113, interfaceC28670t2M30588b15, c20888j12, viewState, c20871a10, function115, interfaceC28593a112, interfaceC28593a114, c20895m2, interfaceC16439p3M46564a, z15, interfaceC33313a8, c13821r1M92099U, iM58033d8, interfaceC4339a4, interfaceC28670t2M30588b16, interfaceC28601c1, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                    }
                }), c28655q, 3072, 6);
                c28655q.m87173q(true);
                c20888j3 = c20888j12;
                function3 = function115;
                c20895m1 = c20895m2;
                c20871a1 = c20871a10;
                modifier3 = modifier4;
                c28655q = c28655q;
                interfaceC4339a2 = interfaceC4339a4;
            } else {
                c28655q.m87138X();
                c20871a1 = c20871a0;
                function3 = function2;
                modifier3 = modifier2;
                c20888j3 = c20888j2;
                c20895m1 = c20895m0M57840d;
                interfaceC4339a2 = interfaceC4339a;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2931g((Object) modifier3, (Object) viewState, (Object) c20888j3, (Object) c20895m1, (Object) c20871a1, (Object) interfaceC4339a2, function3, i13, i14, 10);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        i24 = i14 & 64;
        if (i24 != 0) {
            i15 |= 1572864;
            function2 = function1;
        } else {
            function2 = function1;
            if ((i13 & 1572864) == 0) {
                if (c28655q.m87157i(function2)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i15 |= i25;
            }
        }
        i26 = 0;
        if ((i15 & 599187) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28655q.m87140Z();
            i27 = i13 & 1;
            c2314t = C2314t.f9131w;
            c28676v0 = C28635l.f115821a;
            if (i27 != 0) {
                if (i34 != 0) {
                    modifier2 = c2314t;
                }
                if (i35 != 0) {
                    c20888j2 = new C20888j(false, null, 0.0f, 0.0f, 0.0f, null, null, 127, null);
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                    c20895m0M57840d = AbstractC20897n0.m57840d(false, c28655q, 0, 1);
                }
                if (i16 != 0) {
                    c20871a2 = new C20871a0(null, false, false, false, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
                } else {
                    c20871a2 = c20871a0;
                }
                i28 = 3;
                if (i18 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C20886i(i28);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                if (i24 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C20918y(i28);
                        c28655q.m87172p0(objM87133R);
                    }
                    Function1 function116 = (Function1) objM87133R;
                    Modifier modifier18 = modifier2;
                    function4 = function116;
                    modifier4 = modifier18;
                    interfaceC4339a4 = interfaceC4339a3;
                    c20888j4 = c20888j2;
                } else {
                    modifier4 = modifier2;
                    interfaceC4339a4 = interfaceC4339a3;
                    c20888j4 = c20888j2;
                    function4 = function2;
                }
            } else {
                if (i34 != 0) {
                    modifier2 = c2314t;
                }
                if (i35 != 0) {
                    c20888j2 = new C20888j(false, null, 0.0f, 0.0f, 0.0f, null, null, 127, null);
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                    c20895m0M57840d = AbstractC20897n0.m57840d(false, c28655q, 0, 1);
                }
                if (i16 != 0) {
                    c20871a2 = new C20871a0(null, false, false, false, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
                } else {
                    c20871a2 = c20871a0;
                }
                i28 = 3;
                if (i18 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C20886i(i28);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                if (i24 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C20918y(i28);
                        c28655q.m87172p0(objM87133R);
                    }
                    Function1 function117 = (Function1) objM87133R;
                    Modifier modifier19 = modifier2;
                    function4 = function117;
                    modifier4 = modifier19;
                    interfaceC4339a4 = interfaceC4339a3;
                    c20888j4 = c20888j2;
                } else {
                    modifier4 = modifier2;
                    interfaceC4339a4 = interfaceC4339a3;
                    c20888j4 = c20888j2;
                    function4 = function2;
                }
            }
            c20895m2 = c20895m0M57840d;
            c28655q.m87175r();
            if (viewState.getIsLoading()) {
                f13 = 0.4f;
            } else {
                f13 = 1.0f;
            }
            final Function1 function118 = function4;
            final InterfaceC28670t2 interfaceC28670t2M30588b17 = AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(300, 0, null, 6), "reactionsBarOutlineAlpha", null, c28655q, 3120, 20);
            if (viewState.getIsLoading()) {
                f14 = 0.0f;
            } else {
                f14 = 1.0f;
            }
            final InterfaceC28670t2 interfaceC28670t2M30588b18 = AbstractC11352g.m30588b(f14, AbstractC11348f.m30574v(300, 0, null, 6), "reactionsBarContentAlpha", null, c28655q, 3120, 20);
            objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R3);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
            Boolean boolValueOf9 = Boolean.valueOf(c20888j4.getIsExpanded());
            if ((i15 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R4 = c28655q.m87133R();
            if (z13) {
                objM87133R4 = new a(c20888j4, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new a(c20888j4, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, boolValueOf9);
            int size9 = viewState.m57906c().size();
            Duration durationM57910g9 = viewState.getRotationInterval();
            if (c20888j4.getIsExpanded()) {
                z14 = true;
            } else {
                z14 = true;
            }
            final int iM58033d9 = AbstractC20921z0.m58033d(size9, durationM57910g9, z14, c28655q, 0, 0);
            c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
            C11347e2 c11347e10 = AbstractC16362b.f62900a;
            interfaceC16439p3M46564a = AbstractC16362b.m46564a(c20895m2.getDraggableState(), c28655q, AbstractC16362b.f62902c << 9);
            zM87153g = c28655q.m87153g(interfaceC16439p3M46564a) | ((((i15 & 7168) ^ 3072) <= 2048 && c28655q.m87153g(c20895m2)) || (i15 & 3072) == 2048) | c28655q.m87153g(c13821r1M92099U);
            objM87133R5 = c28655q.m87133R();
            if (zM87153g) {
                objM87133R5 = AbstractC20897n0.m57837a(new C20910u(c13821r1M92099U, i26), c20895m2, interfaceC16439p3M46564a);
                c28655q.m87172p0(objM87133R5);
            } else {
                objM87133R5 = AbstractC20897n0.m57837a(new C20910u(c13821r1M92099U, i26), c20895m2, interfaceC16439p3M46564a);
                c28655q.m87172p0(objM87133R5);
            }
            final InterfaceC33313a interfaceC33313a9 = (InterfaceC33313a) objM87133R5;
            final InterfaceC39171c interfaceC39171c9 = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            objM87133R6 = c28655q.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = AbstractC31061c.m95646v(0, c28655q);
            }
            final InterfaceC28593a1 interfaceC28593a115 = (InterfaceC28593a1) objM87133R6;
            objM87133R7 = c28655q.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = AbstractC31061c.m95646v(0, c28655q);
            }
            final InterfaceC28593a1 interfaceC28593a116 = (InterfaceC28593a1) objM87133R7;
            if (c20888j4.getIsExpanded()) {
                z15 = false;
            } else {
                z15 = false;
            }
            if (z15) {
            }
            final int iMo724F9 = interfaceC39171c9.mo724F(f15);
            objM87133R8 = c28655q.m87133R();
            if (objM87133R8 == c28676v0) {
                objM87133R8 = AbstractC31061c.m95646v(0, c28655q);
            }
            final InterfaceC28593a1 interfaceC28593a117 = (InterfaceC28593a1) objM87133R8;
            final float f11110 = f15;
            Modifier modifierM3409f9 = AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(modifier4, "ReactionsBar"));
            objM87133R9 = c28655q.m87133R();
            if (objM87133R9 == c28676v0) {
                objM87133R9 = b.f78807w;
                c28655q.m87172p0(objM87133R9);
            }
            Modifier modifierM118995s9 = AbstractC37056f.m118995s(AbstractC34452c0.m108903b(modifierM3409f9, C23454a0.f92919a, (PointerInputEventHandler) objM87133R9));
            if (c20888j4.getIsExpanded()) {
                float f11111 = 4;
                float f11112 = f11111 * f11111;
                modifierM57934Q = m57934Q(AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105491g(f11112, f11112, 0.0f, 0.0f, 12)), c20888j4.getChromeProgress(), c20888j4.getChromeHeightPx());
            } else {
                modifierM57934Q = c2314t;
            }
            Modifier modifierMo3471e9 = modifierM118995s9.mo3471e(modifierM57934Q);
            InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierMo3471e9);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d9);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m9);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N9);
            final C20871a0 c20871a11 = c20871a2;
            final C20888j c20888j13 = c20888j4;
            AbstractC22953f.m66714a(AbstractC22953f.m66722k(AbstractC1102d.m3409f(1.0f, c2314t)), null, false, AbstractC37817c.m121344e(1522487157, c28655q, new Function3() { // from class: is0.v
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return AbstractC20916x.m57966y(interfaceC39171c9, f11110, iMo724F9, interfaceC28593a116, interfaceC28670t2M30588b17, c20888j13, viewState, c20871a11, function118, interfaceC28593a115, interfaceC28593a117, c20895m2, interfaceC16439p3M46564a, z15, interfaceC33313a9, c13821r1M92099U, iM58033d9, interfaceC4339a4, interfaceC28670t2M30588b18, interfaceC28601c1, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                }
            }), c28655q, 3072, 6);
            c28655q.m87173q(true);
            c20888j3 = c20888j13;
            function3 = function118;
            c20895m1 = c20895m2;
            c20871a1 = c20871a11;
            modifier3 = modifier4;
            c28655q = c28655q;
            interfaceC4339a2 = interfaceC4339a4;
        } else {
            c28655q.m87138X();
            c20871a1 = c20871a0;
            function3 = function2;
            modifier3 = modifier2;
            c20888j3 = c20888j2;
            c20895m1 = c20895m0M57840d;
            interfaceC4339a2 = interfaceC4339a;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2931g((Object) modifier3, (Object) viewState, (Object) c20888j3, (Object) c20895m1, (Object) c20871a1, (Object) interfaceC4339a2, function3, i13, i14, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m57957p() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m57958q(AbstractC20905r0 it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    private static final int m57959r(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: s */
    private static final void m57960s(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: renamed from: t */
    private static final int m57961t(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: u */
    private static final void m57962u(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: renamed from: v */
    private static final int m57963v(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: w */
    private static final void m57964w(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: renamed from: x */
    private static final float m57965x(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m57966y(InterfaceC39171c interfaceC39171c, float f13, final int i13, final InterfaceC28593a1 interfaceC28593a1, InterfaceC28670t2 interfaceC28670t2, final C20888j c20888j, C20907s0 c20907s0, C20871a0 c20871a0, Function1 function1, final InterfaceC28593a1 interfaceC28593a2, final InterfaceC28593a1 interfaceC28593a3, C20895m0 c20895m0, InterfaceC16439p3 interfaceC16439p3, boolean z4, InterfaceC33313a interfaceC33313a, C13821r1 c13821r1, int i14, InterfaceC4339a interfaceC4339a, InterfaceC28670t2 interfaceC28670t3, InterfaceC28601c1 interfaceC28601c1, InterfaceC23004v BoxWithConstraints, Composer composer, int i15) {
        int i16;
        C2314t c2314t;
        boolean z13;
        C2307m c2307m = C2299e.f9114w;
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i15 & 6) == 0) {
            i16 = i15 | (((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2);
        } else {
            i16 = i15;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i16 & 1, (i16 & 19) != 18)) {
            int iMo724F = interfaceC39171c.mo724F(((C1101c) BoxWithConstraints).m3402c());
            float fMo733e0 = interfaceC39171c.mo733e0(m57940W(iMo724F, m57961t(interfaceC28593a1), i13, interfaceC39171c.mo724F(f78801a)));
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM107879c = AbstractC34132o.m107879c(m57965x(interfaceC28670t2), AbstractC1102d.m3409f(1.0f, c2314t2));
            C22971k c22971kM66746i = AbstractC22977m.m66746i(f13);
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, c2305k, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM107879c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            boolean zM57728m = c20888j.getIsExpanded();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM57728m) {
                c28655q.m87150e0(1222875052);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM31988g = AbstractC11895b.m31988g(modifierM3409f, false, 1.0f);
                boolean zM87149e = c28655q.m87149e(iMo724F) | c28655q.m87149e(i13) | c28655q.m87153g(c20888j);
                Object objM87133R = c28655q.m87133R();
                if (zM87149e || objM87133R == c28676v0) {
                    objM87133R = new C4510k(iMo724F, i13, c20888j, interfaceC28593a1);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM118995s = AbstractC37056f.m118995s(m57937T(modifierM31988g, (InterfaceC4339a) objM87133R));
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM118995s);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                Modifier modifierM3426w = AbstractC1102d.m3426w(AbstractC1102d.m3409f(1.0f, c2314t2), C2299e.f9107J, true);
                boolean zM87149e2 = c28655q.m87149e(i13) | c28655q.m87153g(c20888j);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87149e2 || objM87133R2 == c28676v0) {
                    final int i17 = 0;
                    Function1 function2 = new Function1() { // from class: is0.w
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i17) {
                                case 0:
                                    return AbstractC20916x.m57918A(interfaceC28593a2, interfaceC28593a1, i13, c20888j, interfaceC28593a3, (C39180l) obj);
                                case 1:
                                    return AbstractC20916x.m57919B(interfaceC28593a2, interfaceC28593a1, i13, c20888j, interfaceC28593a3, (C39180l) obj);
                                default:
                                    return AbstractC20916x.m57920C(interfaceC28593a2, interfaceC28593a1, i13, c20888j, interfaceC28593a3, (C39180l) obj);
                            }
                        }
                    };
                    c28655q.m87172p0(function2);
                    objM87133R2 = function2;
                }
                Modifier modifierM3502b = AbstractC1132b.m3502b(modifierM3426w, (Function1) objM87133R2);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                int iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3502b);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                C16435p c16435pM57827h = c20895m0.getDraggableState();
                EnumC16377d2 enumC16377d2 = EnumC16377d2.f62971w;
                AbstractC20875c0.m57684b(AbstractC1096a.m3371b(c16435pM57827h, false, null, interfaceC16439p3, 28), c28655q, 0, 0);
                if (z4) {
                    c28655q.m87150e0(992325590);
                    z13 = true;
                    AbstractC20920z.m58012i(AbstractC1102d.m3413j(AbstractC1129a.m3495a(c2314t2, interfaceC33313a, null), 0.0f, fMo733e0, 1), c20907s0.m57905b(), c13821r1, function1, c28655q, 0, 0);
                    c28655q.m87173q(false);
                } else {
                    z13 = true;
                    c28655q.m87150e0(992827232);
                    c28655q.m87173q(false);
                }
                AbstractC25012a.m73392y(c28655q, z13, z13, false);
                c2314t = c2314t2;
            } else {
                c2314t = c2314t2;
                c28655q.m87150e0(1225098837);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                boolean zM87149e3 = c28655q.m87149e(i13) | c28655q.m87153g(c20888j);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87149e3 || objM87133R3 == c28676v0) {
                    final int i18 = 1;
                    Function1 function3 = new Function1() { // from class: is0.w
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i18) {
                                case 0:
                                    return AbstractC20916x.m57918A(interfaceC28593a2, interfaceC28593a1, i13, c20888j, interfaceC28593a3, (C39180l) obj);
                                case 1:
                                    return AbstractC20916x.m57919B(interfaceC28593a2, interfaceC28593a1, i13, c20888j, interfaceC28593a3, (C39180l) obj);
                                default:
                                    return AbstractC20916x.m57920C(interfaceC28593a2, interfaceC28593a1, i13, c20888j, interfaceC28593a3, (C39180l) obj);
                            }
                        }
                    };
                    c28655q.m87172p0(function3);
                    objM87133R3 = function3;
                }
                Modifier modifierM3502b2 = AbstractC1132b.m3502b(modifierM3409f2, (Function1) objM87133R3);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                int iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3502b2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                c28676v0 = c28676v0;
                m57927J(c20907s0, m57922E(interfaceC28670t3), i14, m57923F(interfaceC28601c1), interfaceC4339a, c28655q, 0);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            boolean zM87149e4 = c28655q.m87149e(i13) | c28655q.m87153g(c20888j);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87149e4 || objM87133R4 == c28676v0) {
                final int i19 = 2;
                objM87133R4 = new Function1() { // from class: is0.w
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i19) {
                            case 0:
                                return AbstractC20916x.m57918A(interfaceC28593a1, interfaceC28593a2, i13, c20888j, interfaceC28593a3, (C39180l) obj);
                            case 1:
                                return AbstractC20916x.m57919B(interfaceC28593a1, interfaceC28593a2, i13, c20888j, interfaceC28593a3, (C39180l) obj);
                            default:
                                return AbstractC20916x.m57920C(interfaceC28593a1, interfaceC28593a2, i13, c20888j, interfaceC28593a3, (C39180l) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC20900p.m57858m(AbstractC1132b.m3502b(c2314t, (Function1) objM87133R4), c20907s0, m57922E(interfaceC28670t3), c20888j.getIsExpanded(), c20888j.getContentInsetHorizontal(), c20888j.getContentInsetBottom(), c20871a0, function1, null, c28655q, 0, 256);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final Integer m57967z(int i13, int i14, C20888j c20888j, InterfaceC28593a1 interfaceC28593a1) {
        return m57941X(i13, m57961t(interfaceC28593a1), i14, (Integer) c20888j.getLayoutHeightPx().invoke(), c20888j.getIsExpanded());
    }
}
