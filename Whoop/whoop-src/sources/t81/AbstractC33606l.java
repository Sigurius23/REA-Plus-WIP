package t81;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2648w3;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.design.util.AbstractC8693b;
import d61.InterfaceC11732a;
import e93.AbstractC12889b;
import g61.C15529b;
import h71.AbstractC16990g;
import h71.C16993j;
import h71.C16995l;
import i71.InterfaceC18201e;
import i93.C18279e;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import o71.C27632b;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p132f0.C13821r1;
import p180h0.AbstractC16434o3;
import p181h2.C16617b;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18041w;
import p209i3.InterfaceC18044z;
import p291l0.AbstractC22989q;
import p291l0.C22976l1;
import p390p1.AbstractC28683x;
import p390p1.C28617g1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28690z0;
import p505ts.AbstractC34132o;
import p512u2.AbstractC34452c0;
import p512u2.InterfaceC34476v;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22663d0;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import t80.C33592b;
import u81.AbstractC34636a;
import u81.C34637b;
import u81.C34639d;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: t81.l */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a]\u0010\u0014\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2$\u0010\u0013\u001a \u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001aw\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00122\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u00022\u001a\b\u0002\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006!²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0018\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0016\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0017\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010 \u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lt81/r;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "q", "(Lt81/r;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "isAnimatingFromState", "", "zoom", "", "currentScrollPosition", "Lh2/b;", "centerAnchor", "Lkotlin/Function4;", "Lu81/d;", "Lu81/b;", "triggerZoomableGraphAnimator", "o", "(ZLt81/r;FIJLc93/n;Landroidx/compose/runtime/Composer;I)V", "isAnimating", "isDiscreteZoom", "zoomTargets", "scrollTargets", "updateZoom", "updateScrollPosition", "Lkotlin/Function2;", "onResultFinished", "O", "(ZZLu81/d;Lu81/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;II)V", "isDoubleTap", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33606l {

    /* JADX INFO: renamed from: t81.l$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.zoomable.ZoomableGraphKt$ExternalZoomChangeListener$1$1", m100430f = "ZoomableGraph.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ int f140220E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ long f140221F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC4352n f140222G;

        /* JADX INFO: renamed from: w */
        int f140223w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f140224x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C33612r f140225y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ float f140226z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z4, C33612r c33612r, float f13, int i13, long j7, InterfaceC4352n interfaceC4352n, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f140224x = z4;
            this.f140225y = c33612r;
            this.f140226z = f13;
            this.f140220E = i13;
            this.f140221F = j7;
            this.f140222G = interfaceC4352n;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final C23454a0 m106177h(InterfaceC4352n interfaceC4352n, C34639d c34639d, C34637b c34637b, boolean z4, boolean z13) {
            interfaceC4352n.invoke(c34639d, c34637b, Boolean.valueOf(z4), Boolean.valueOf(z13));
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f140224x, this.f140225y, this.f140226z, this.f140220E, this.f140221F, this.f140222G, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f140223w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f140224x) {
                C33612r c33612r = this.f140225y;
                float f13 = this.f140226z;
                int i13 = this.f140220E;
                long j7 = this.f140221F;
                final InterfaceC4352n interfaceC4352n = this.f140222G;
                AbstractC34636a.m109471a(c33612r, f13, i13, j7, new InterfaceC4352n() { // from class: t81.k
                    @Override // c93.InterfaceC4352n
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                        boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                        return AbstractC33606l.a.m106177h(interfaceC4352n, (C34639d) obj2, (C34637b) obj3, zBooleanValue, zBooleanValue2);
                    }
                });
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: t81.l$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements PointerInputEventHandler {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f140227E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f140228F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC28601c1 f140229G;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C33612r f140230w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13821r1 f140231x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f140232y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28690z0 f140233z;

        public b(C33612r c33612r, C13821r1 c13821r1, Function1 function1, InterfaceC28690z0 interfaceC28690z0, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3) {
            this.f140230w = c33612r;
            this.f140231x = c13821r1;
            this.f140232y = function1;
            this.f140233z = interfaceC28690z0;
            this.f140227E = interfaceC28601c1;
            this.f140228F = interfaceC28601c2;
            this.f140229G = interfaceC28601c3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static final C23454a0 m106179b(C33612r c33612r, C13821r1 c13821r1, Function1 function1, InterfaceC28690z0 interfaceC28690z0, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, C16617b c16617b, float f13, boolean z4) {
            float fFloatValue = ((Number) AbstractC12889b.m36288r(Float.valueOf(AbstractC33606l.m106174y(interfaceC28690z0) * f13), new C18279e(c33612r.getZoomLevel().getMinZoomLevel(), c33612r.getZoomLevel().getMaxZoomLevel()))).floatValue();
            AbstractC33606l.m106133L(interfaceC28601c1, new C34639d(AbstractC33606l.m106174y(interfaceC28690z0), fFloatValue));
            C15529b c15529bM47865g = c33612r.getPlaneState().getStartVerticalAxis();
            Number numberValueOf = c15529bM47865g != null ? Float.valueOf(c15529bM47865g.getSize()) : Double.valueOf(0.0d);
            int iM87024x = c13821r1.f49318a.m87024x();
            AbstractC33606l.m106135N(interfaceC28601c2, new C34637b(iM87024x, C33595a.f140188a.m106103a(c16617b.f63937a, AbstractC33606l.m106174y(interfaceC28690z0), AbstractC33606l.m106132K(interfaceC28601c1).getEnd(), iM87024x, numberValueOf.doubleValue())));
            AbstractC33606l.m106173x(interfaceC28601c3, false);
            boolean z13 = fFloatValue > AbstractC33606l.m106174y(interfaceC28690z0);
            c13821r1.mo9766e(AbstractC33606l.m106134M(interfaceC28601c2).getEnd() - AbstractC33606l.m106134M(interfaceC28601c2).getStart());
            AbstractC33606l.m106130I(interfaceC28690z0, AbstractC33606l.m106132K(interfaceC28601c1).getEnd());
            function1.invoke(new InterfaceC33600f.b(AbstractC33606l.m106174y(interfaceC28690z0), z13, z4));
            return C23454a0.f92919a;
        }

        @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            final C33612r c33612r = this.f140230w;
            final C13821r1 c13821r1 = this.f140231x;
            final Function1 function1 = this.f140232y;
            final InterfaceC28690z0 interfaceC28690z0 = this.f140233z;
            final InterfaceC28601c1 interfaceC28601c1 = this.f140227E;
            final InterfaceC28601c1 interfaceC28601c2 = this.f140228F;
            final InterfaceC28601c1 interfaceC28601c3 = this.f140229G;
            Object objM106110a = AbstractC33598d.m106110a(interfaceC34476v, new Function3() { // from class: t81.m
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    float fFloatValue = ((Float) obj2).floatValue();
                    boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                    return AbstractC33606l.b.m106179b(c33612r, c13821r1, function1, interfaceC28690z0, interfaceC28601c1, interfaceC28601c2, interfaceC28601c3, (C16617b) obj, fFloatValue, zBooleanValue);
                }
            }, interfaceC30057d);
            return objM106110a == EnumC31071a.f128113w ? objM106110a : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: t81.l$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements PointerInputEventHandler {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f140234E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f140235F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC28601c1 f140236G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ InterfaceC28601c1 f140237H;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C33612r f140238w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13821r1 f140239x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28690z0 f140240y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f140241z;

        public c(C33612r c33612r, C13821r1 c13821r1, InterfaceC28690z0 interfaceC28690z0, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, InterfaceC28601c1 interfaceC28601c5) {
            this.f140238w = c33612r;
            this.f140239x = c13821r1;
            this.f140240y = interfaceC28690z0;
            this.f140241z = interfaceC28601c1;
            this.f140234E = interfaceC28601c2;
            this.f140235F = interfaceC28601c3;
            this.f140236G = interfaceC28601c4;
            this.f140237H = interfaceC28601c5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static final C23454a0 m106182c(C33612r c33612r, C13821r1 c13821r1, InterfaceC28690z0 interfaceC28690z0, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, InterfaceC28601c1 interfaceC28601c5, C16617b c16617b) {
            AbstractC34636a.m109471a(c33612r, AbstractC33606l.m106174y(interfaceC28690z0), c13821r1.f49318a.m87024x(), c16617b.f63937a, new C33609o(interfaceC28601c1, interfaceC28601c2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c5, 0));
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public static final C23454a0 m106183d(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, InterfaceC28601c1 interfaceC28601c5, C34639d newZoomTargets, C34637b newScrollTargets, boolean z4, boolean z13) {
            AbstractC22676k.m65750j(newZoomTargets, "newZoomTargets");
            AbstractC22676k.m65750j(newScrollTargets, "newScrollTargets");
            AbstractC33606l.m106133L(interfaceC28601c1, newZoomTargets);
            AbstractC33606l.m106135N(interfaceC28601c2, newScrollTargets);
            AbstractC33606l.m106173x(interfaceC28601c3, z4);
            AbstractC33606l.m106171v(interfaceC28601c4, z13);
            AbstractC33606l.m106122A(interfaceC28601c5, true);
            return C23454a0.f92919a;
        }

        @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            final C33612r c33612r = this.f140238w;
            final C13821r1 c13821r1 = this.f140239x;
            final InterfaceC28690z0 interfaceC28690z0 = this.f140240y;
            final InterfaceC28601c1 interfaceC28601c1 = this.f140241z;
            final InterfaceC28601c1 interfaceC28601c2 = this.f140234E;
            final InterfaceC28601c1 interfaceC28601c3 = this.f140235F;
            final InterfaceC28601c1 interfaceC28601c4 = this.f140236G;
            final InterfaceC28601c1 interfaceC28601c5 = this.f140237H;
            Object objM46605e = AbstractC16434o3.m46605e(interfaceC34476v, new Function1() { // from class: t81.n
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC33606l.c.m106182c(c33612r, c13821r1, interfaceC28690z0, interfaceC28601c1, interfaceC28601c2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c5, (C16617b) obj);
                }
            }, null, null, null, interfaceC30057d, 14);
            return objM46605e == EnumC31071a.f128113w ? objM46605e : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: t81.l$d */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.zoomable.ZoomableGraphKt$ZoomableGraphAnimator$4$1", m100430f = "ZoomableGraph.kt", m100431l = {268, 274}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C34637b f140242E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ boolean f140243F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ boolean f140244G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ C34639d f140245H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ Function1 f140246I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ Function1 f140247J;

        /* JADX INFO: renamed from: K */
        final /* synthetic */ InterfaceC4351m f140248K;

        /* JADX INFO: renamed from: w */
        long f140249w;

        /* JADX INFO: renamed from: x */
        Object f140250x;

        /* JADX INFO: renamed from: y */
        Object f140251y;

        /* JADX INFO: renamed from: z */
        int f140252z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C34637b c34637b, boolean z4, boolean z13, C34639d c34639d, Function1 function1, Function1 function2, InterfaceC4351m interfaceC4351m, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f140242E = c34637b;
            this.f140243F = z4;
            this.f140244G = z13;
            this.f140245H = c34639d;
            this.f140246I = function1;
            this.f140247J = function2;
            this.f140248K = interfaceC4351m;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public static final long m106186i(long j7) {
            return j7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public static final C23454a0 m106187j(C33596b c33596b, C34639d c34639d, C34637b c34637b, long j7, Function1 function1, C22663d0 c22663d0, Function1 function2, InterfaceC4351m interfaceC4351m, long j13) {
            C33597c c33597cM106106a = c33596b.m106106a(c34639d.getStart(), c34639d.getEnd(), c34637b.getStart(), c34637b.getEnd(), j13, j7);
            function1.invoke(Float.valueOf(c33597cM106106a.getZoomLevel()));
            function2.invoke(Float.valueOf(c33597cM106106a.getContentOffset() - c22663d0.f89331w));
            c22663d0.f89331w = c33597cM106106a.getContentOffset();
            if (c33597cM106106a.getFinished()) {
                interfaceC4351m.invoke(Float.valueOf(c34639d.getEnd()), Boolean.valueOf(c34639d.getEnd() > c34639d.getStart()));
            }
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f140242E, this.f140243F, this.f140244G, this.f140245H, this.f140246I, this.f140247J, this.f140248K, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0065  */
        /* JADX WARN: Code duplicated, block: B:24:0x0086 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:26:? A[LOOP:0: B:16:0x0061->B:26:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
        
            if (r2 == r1) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                r18 = this;
                r0 = r18
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r0.f140252z
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L2d
                if (r2 == r4) goto L27
                if (r2 != r3) goto L1f
                long r4 = r0.f140249w
                java.lang.Object r2 = r0.f140251y
                t81.b r2 = (t81.C33596b) r2
                java.lang.Object r6 = r0.f140250x
                kotlin.jvm.internal.d0 r6 = (p715kotlin.jvm.internal.C22663d0) r6
                p505ts.AbstractC34132o.m107864I(r19)
                r9 = r2
                r12 = r4
                r15 = r6
                goto L61
            L1f:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L27:
                p505ts.AbstractC34132o.m107864I(r19)
                r2 = r19
                goto L3f
            L2d:
                p505ts.AbstractC34132o.m107864I(r19)
                t81.p r2 = new t81.p
                r5 = 0
                r2.<init>(r5)
                r0.f140252z = r4
                java.lang.Object r2 = p390p1.AbstractC28683x.m87246N(r2, r0)
                if (r2 != r1) goto L3f
                goto L86
            L3f:
                java.lang.Number r2 = (java.lang.Number) r2
                long r4 = r2.longValue()
                kotlin.jvm.internal.d0 r2 = new kotlin.jvm.internal.d0
                r2.<init>()
                u81.b r6 = r0.f140242E
                int r6 = r6.getStart()
                float r6 = (float) r6
                r2.f89331w = r6
                boolean r6 = r0.f140243F
                if (r6 == 0) goto L87
                t81.b r6 = new t81.b
                r7 = 1140457472(0x43fa0000, float:500.0)
                r6.<init>(r7)
                r15 = r2
                r12 = r4
                r9 = r6
            L61:
                boolean r2 = r0.f140244G
                if (r2 == 0) goto L87
                u81.d r10 = r0.f140245H
                u81.b r11 = r0.f140242E
                kotlin.jvm.functions.Function1 r14 = r0.f140246I
                kotlin.jvm.functions.Function1 r2 = r0.f140247J
                c93.m r4 = r0.f140248K
                t81.q r8 = new t81.q
                r16 = r2
                r17 = r4
                r8.<init>()
                r0.f140250x = r15
                r0.f140251y = r9
                r0.f140249w = r12
                r0.f140252z = r3
                java.lang.Object r2 = p390p1.AbstractC28683x.m87246N(r8, r0)
                if (r2 != r1) goto L61
            L86:
                return r1
            L87:
                l83.a0 r1 = l83.C23454a0.f92919a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: t81.AbstractC33606l.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final void m106122A(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m106123B(InterfaceC28690z0 interfaceC28690z0, float f13) {
        m106130I(interfaceC28690z0, f13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m106124C(C13821r1 c13821r1, float f13) {
        c13821r1.mo9766e(f13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m106125D(Function1 function1, InterfaceC28690z0 interfaceC28690z0, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, float f13, boolean z4) {
        m106130I(interfaceC28690z0, f13);
        function1.invoke(new InterfaceC33600f.a(m106174y(interfaceC28690z0), z4, m106175z(interfaceC28601c1)));
        m106171v(interfaceC28601c2, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m106126E(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, InterfaceC28601c1 interfaceC28601c5, C34639d newZoomTargets, C34637b newScrollTargets, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(newZoomTargets, "newZoomTargets");
        AbstractC22676k.m65750j(newScrollTargets, "newScrollTargets");
        m106133L(interfaceC28601c1, newZoomTargets);
        m106135N(interfaceC28601c2, newScrollTargets);
        m106173x(interfaceC28601c3, z4);
        m106171v(interfaceC28601c4, z13);
        m106122A(interfaceC28601c5, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m106127F(InterfaceC28601c1 interfaceC28601c1, InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        C17920x0 c17920x0 = (C17920x0) graphicsLayer;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c17920x0.f69653R >> 32)) / 2.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c17920x0.f69653R & 4294967295L)) / 2.0f;
        m106169t(interfaceC28601c1, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m106128G(String str, InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        AbstractC18041w.m51806e(str, semantics);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m106129H(Function1 function1, C16995l it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final void m106130I(InterfaceC28690z0 interfaceC28690z0, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m106131J(C33612r c33612r, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m106166q(c33612r, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C34639d m106132K(InterfaceC28601c1 interfaceC28601c1) {
        return (C34639d) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final void m106133L(InterfaceC28601c1 interfaceC28601c1, C34639d c34639d) {
        interfaceC28601c1.setValue(c34639d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C34637b m106134M(InterfaceC28601c1 interfaceC28601c1) {
        return (C34637b) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final void m106135N(InterfaceC28601c1 interfaceC28601c1, C34637b c34637b) {
        interfaceC28601c1.setValue(c34637b);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0143  */
    /* JADX WARN: Code duplicated, block: B:103:0x0146  */
    /* JADX WARN: Code duplicated, block: B:106:0x0151  */
    /* JADX WARN: Code duplicated, block: B:107:0x0154  */
    /* JADX WARN: Code duplicated, block: B:110:0x015e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0161  */
    /* JADX WARN: Code duplicated, block: B:114:0x016b  */
    /* JADX WARN: Code duplicated, block: B:120:0x017b  */
    /* JADX WARN: Code duplicated, block: B:122:0x0190  */
    /* JADX WARN: Code duplicated, block: B:125:0x019c  */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0091  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Code duplicated, block: B:51:0x009a  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00af  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00db  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:81:0x0103  */
    /* JADX WARN: Code duplicated, block: B:83:0x0106  */
    /* JADX WARN: Code duplicated, block: B:85:0x010c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0119  */
    /* JADX WARN: Code duplicated, block: B:90:0x0123  */
    /* JADX WARN: Code duplicated, block: B:91:0x0126  */
    /* JADX WARN: Code duplicated, block: B:94:0x012c  */
    /* JADX WARN: Code duplicated, block: B:95:0x012f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0137  */
    /* JADX WARN: Code duplicated, block: B:99:0x013a  */
    /* JADX INFO: renamed from: O */
    public static final void m106136O(boolean z4, boolean z13, C34639d zoomTargets, C34637b scrollTargets, Function1 function1, Function1 function2, InterfaceC4351m interfaceC4351m, Composer composer, int i13, int i14) {
        boolean z14;
        int i15;
        Function1 function3;
        int i16;
        Function1 function4;
        int i17;
        int i18;
        InterfaceC4351m interfaceC4351m2;
        int i19;
        boolean z15;
        InterfaceC4351m interfaceC4351m3;
        Function1 function5;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function7;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z24;
        boolean z25;
        boolean z26;
        Object dVar;
        Object objM87133R;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(zoomTargets, "zoomTargets");
        AbstractC22676k.m65750j(scrollTargets, "scrollTargets");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1265975845);
        if ((i13 & 6) == 0) {
            z14 = z4;
            i15 = (c28655q.m87155h(z14) ? 4 : 2) | i13;
        } else {
            z14 = z4;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87155h(z13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(zoomTargets) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87153g(scrollTargets) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i24 = i14 & 16;
        if (i24 == 0) {
            if ((i13 & 24576) == 0) {
                function3 = function1;
                i15 |= c28655q.m87157i(function3) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 = i14 & 32;
            if (i16 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                function4 = function2;
            } else {
                function4 = function2;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(function4)) {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i17;
                }
            }
            i18 = i14 & 64;
            if (i18 != 0) {
                i15 |= 1572864;
                interfaceC4351m2 = interfaceC4351m;
            } else {
                interfaceC4351m2 = interfaceC4351m;
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87157i(interfaceC4351m2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i15 |= i19;
                }
            }
            if ((i15 & 599187) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q.m87135U(i15 & 1, z15)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C33610p(2);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function5 = (Function1) objM87133R3;
                } else {
                    function5 = function3;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C33610p(3);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function7 = (Function1) objM87133R2;
                } else {
                    function7 = function4;
                }
                if (i18 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C33602h();
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4351m3 = (InterfaceC4351m) objM87133R;
                } else {
                    interfaceC4351m3 = interfaceC4351m2;
                }
                Boolean boolValueOf = Boolean.valueOf(z14);
                if ((i15 & 7168) == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if ((i15 & 112) == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z27 = z17 | z16;
                if ((i15 & 14) == 4) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z28 = z27 | z18;
                if ((i15 & 896) == 256) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z29 = z28 | z19;
                if ((57344 & i15) == 16384) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean z34 = z29 | z24;
                if ((458752 & i15) == 131072) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                z26 = z34 | z25 | ((i15 & 3670016) == 1048576);
                Object objM87133R4 = c28655q.m87133R();
                if (!z26 || objM87133R4 == c28676v0) {
                    function6 = function7;
                    dVar = new d(scrollTargets, z13, z4, zoomTargets, function5, function6, interfaceC4351m3, null);
                    c28655q.m87172p0(dVar);
                } else {
                    dVar = objM87133R4;
                    function6 = function7;
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) dVar, boolValueOf);
            } else {
                c28655q.m87138X();
                interfaceC4351m3 = interfaceC4351m2;
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2648w3(z4, z13, zoomTargets, scrollTargets, function5, function6, interfaceC4351m3, i13, i14);
            }
        }
        i15 |= 24576;
        function3 = function1;
        i16 = i14 & 32;
        if (i16 != 0) {
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            function4 = function2;
        } else {
            function4 = function2;
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87157i(function4)) {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i17;
            }
        }
        i18 = i14 & 64;
        if (i18 != 0) {
            i15 |= 1572864;
            interfaceC4351m2 = interfaceC4351m;
        } else {
            interfaceC4351m2 = interfaceC4351m;
            if ((i13 & 1572864) == 0) {
                if (c28655q.m87157i(interfaceC4351m2)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i15 |= i19;
            }
        }
        if ((i15 & 599187) != 599186) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (c28655q.m87135U(i15 & 1, z15)) {
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C33610p(2);
                    c28655q.m87172p0(objM87133R3);
                }
                function5 = (Function1) objM87133R3;
            } else {
                function5 = function3;
            }
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C33610p(3);
                    c28655q.m87172p0(objM87133R2);
                }
                function7 = (Function1) objM87133R2;
            } else {
                function7 = function4;
            }
            if (i18 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C33602h();
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC4351m3 = (InterfaceC4351m) objM87133R;
            } else {
                interfaceC4351m3 = interfaceC4351m2;
            }
            Boolean boolValueOf2 = Boolean.valueOf(z14);
            if ((i15 & 7168) == 2048) {
                z16 = true;
            } else {
                z16 = false;
            }
            if ((i15 & 112) == 32) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean z210 = z17 | z16;
            if ((i15 & 14) == 4) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean z211 = z210 | z18;
            if ((i15 & 896) == 256) {
                z19 = true;
            } else {
                z19 = false;
            }
            boolean z212 = z211 | z19;
            if ((57344 & i15) == 16384) {
                z24 = true;
            } else {
                z24 = false;
            }
            boolean z35 = z212 | z24;
            if ((458752 & i15) == 131072) {
                z25 = true;
            } else {
                z25 = false;
            }
            z26 = z35 | z25 | ((i15 & 3670016) == 1048576);
            Object objM87133R5 = c28655q.m87133R();
            if (z26) {
                function6 = function7;
                dVar = new d(scrollTargets, z13, z4, zoomTargets, function5, function6, interfaceC4351m3, null);
                c28655q.m87172p0(dVar);
            } else {
                function6 = function7;
                dVar = new d(scrollTargets, z13, z4, zoomTargets, function5, function6, interfaceC4351m3, null);
                c28655q.m87172p0(dVar);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) dVar, boolValueOf2);
        } else {
            c28655q.m87138X();
            interfaceC4351m3 = interfaceC4351m2;
            function5 = function3;
            function6 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2648w3(z4, z13, zoomTargets, scrollTargets, function5, function6, interfaceC4351m3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m106137P(float f13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m106138Q(float f13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m106139R(float f13, boolean z4) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m106140S(boolean z4, boolean z13, C34639d c34639d, C34637b c34637b, Function1 function1, Function1 function2, InterfaceC4351m interfaceC4351m, int i13, int i14, Composer composer, int i15) {
        m106136O(z4, z13, c34639d, c34637b, function1, function2, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    public static final void m106164o(boolean z4, C33612r state, float f13, int i13, long j7, InterfaceC4352n triggerZoomableGraphAnimator, Composer composer, int i14) {
        boolean z13;
        int i15;
        float f14;
        int i16;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(triggerZoomableGraphAnimator, "triggerZoomableGraphAnimator");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1751859839);
        if ((i14 & 6) == 0) {
            z13 = z4;
            i15 = (c28655q.m87155h(z13) ? 4 : 2) | i14;
        } else {
            z13 = z4;
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            f14 = f13;
            i15 |= c28655q.m87147d(f14) ? 256 : 128;
        } else {
            f14 = f13;
        }
        if ((i14 & 3072) == 0) {
            i16 = i13;
            i15 |= c28655q.m87149e(i16) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            i16 = i13;
        }
        if ((i14 & 24576) == 0) {
            i15 |= c28655q.m87151f(j7) ? 16384 : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i14) == 0) {
            i15 |= c28655q.m87157i(triggerZoomableGraphAnimator) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if (c28655q.m87135U(i15 & 1, (74899 & i15) != 74898)) {
            Boolean boolValueOf = Boolean.valueOf(z13);
            boolean zM87157i = ((i15 & 14) == 4) | c28655q.m87157i(state) | ((i15 & 896) == 256) | ((i15 & 7168) == 2048) | ((57344 & i15) == 16384) | ((i15 & 458752) == 131072);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                a aVar = new a(z4, state, f14, i16, j7, triggerZoomableGraphAnimator, null);
                c28655q.m87172p0(aVar);
                objM87133R = aVar;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, boolValueOf);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33604j(z4, state, f13, i13, j7, triggerZoomableGraphAnimator, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m106165p(boolean z4, C33612r c33612r, float f13, int i13, long j7, InterfaceC4352n interfaceC4352n, int i14, Composer composer, int i15) {
        m106164o(z4, c33612r, f13, i13, j7, interfaceC4352n, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0295  */
    /* JADX WARN: Code duplicated, block: B:104:0x0311  */
    /* JADX WARN: Code duplicated, block: B:107:0x033b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0343  */
    /* JADX WARN: Code duplicated, block: B:114:0x0361  */
    /* JADX WARN: Code duplicated, block: B:119:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:125:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:127:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:130:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:54:0x010b  */
    /* JADX WARN: Code duplicated, block: B:57:0x012e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0145  */
    /* JADX WARN: Code duplicated, block: B:64:0x0155  */
    /* JADX WARN: Code duplicated, block: B:65:0x0158  */
    /* JADX WARN: Code duplicated, block: B:69:0x0162  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:85:0x0201  */
    /* JADX WARN: Code duplicated, block: B:91:0x0232  */
    /* JADX WARN: Code duplicated, block: B:94:0x0270  */
    /* JADX WARN: Code duplicated, block: B:95:0x0274  */
    /* JADX INFO: renamed from: q */
    public static final void m106166q(C33612r state, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function3;
        Object objM87133R;
        final InterfaceC28690z0 interfaceC28690z0;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R4;
        final InterfaceC28601c1 interfaceC28601c3;
        final C13821r1 c13821r1M92099U;
        Object objM87133R5;
        InterfaceC28601c1 interfaceC28601c4;
        Object objM87133R6;
        InterfaceC28601c1 interfaceC28601c5;
        Object objM87133R7;
        InterfaceC28601c1 interfaceC28601c6;
        Object objM87133R8;
        boolean zM87153g;
        Object objM87133R9;
        int i16;
        boolean z13;
        Object objM87133R10;
        Function1 function4;
        Object objM87133R11;
        Object objM87133R12;
        boolean z14;
        boolean z15;
        Object bVar;
        C13821r1 c13821r1;
        InterfaceC28690z0 interfaceC28690z1;
        boolean zM87157i;
        Object objM87133R13;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        final String strM21274h;
        boolean zM87153g2;
        Object objM87133R14;
        int iHashCode2;
        boolean z16;
        Object objM87133R15;
        final Function1 function5;
        Object objM87133R16;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-667678243);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q2.m87157i(state) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R16 = c28655q2.m87133R();
                    if (objM87133R16 == c28676v0) {
                        objM87133R16 = new C33610p(1);
                        c28655q2.m87172p0(objM87133R16);
                    }
                    function3 = (Function1) objM87133R16;
                } else {
                    function3 = function2;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30468v(state.getZoom(), c28655q2);
                }
                interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(new C34639d(state.getZoomToggleState().getZoomOutLevel(), state.getZoomToggleState().getZoomInLevel()));
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(new C34637b(0, 0));
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(new C16617b((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L)));
                    c28655q2.m87172p0(objM87133R4);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
                c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q2, 1);
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R5);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R5;
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC28683x.m87272z(Boolean.TRUE);
                    c28655q2.m87172p0(objM87133R6);
                }
                interfaceC28601c5 = (InterfaceC28601c1) objM87133R6;
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC28683x.m87272z(Boolean.TRUE);
                    c28655q2.m87172p0(objM87133R7);
                }
                interfaceC28601c6 = (InterfaceC28601c1) objM87133R7;
                boolean zM106170u = m106170u(interfaceC28601c4);
                boolean zM106172w = m106172w(interfaceC28601c5);
                C34639d c34639dM106132K = m106132K(interfaceC28601c1);
                C34637b c34637bM106134M = m106134M(interfaceC28601c2);
                objM87133R8 = c28655q2.m87133R();
                if (objM87133R8 == c28676v0) {
                    final int i18 = 0;
                    objM87133R8 = new Function1() { // from class: t81.i
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i18) {
                                case 0:
                                    return AbstractC33606l.m106123B((InterfaceC28690z0) interfaceC28690z0, ((Float) obj).floatValue());
                                case 1:
                                    return AbstractC33606l.m106124C((C13821r1) interfaceC28690z0, ((Float) obj).floatValue());
                                case 2:
                                    return AbstractC33606l.m106127F((InterfaceC28601c1) interfaceC28690z0, (InterfaceC17886g0) obj);
                                case 3:
                                    return AbstractC33606l.m106128G((String) interfaceC28690z0, (InterfaceC18044z) obj);
                                default:
                                    return AbstractC33606l.m106129H((Function1) interfaceC28690z0, (C16995l) obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R8);
                }
                Function1 function6 = (Function1) objM87133R8;
                zM87153g = c28655q2.m87153g(c13821r1M92099U);
                objM87133R9 = c28655q2.m87133R();
                if (zM87153g || objM87133R9 == c28676v0) {
                    final int i19 = 1;
                    objM87133R9 = new Function1() { // from class: t81.i
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i19) {
                                case 0:
                                    return AbstractC33606l.m106123B((InterfaceC28690z0) c13821r1M92099U, ((Float) obj).floatValue());
                                case 1:
                                    return AbstractC33606l.m106124C((C13821r1) c13821r1M92099U, ((Float) obj).floatValue());
                                case 2:
                                    return AbstractC33606l.m106127F((InterfaceC28601c1) c13821r1M92099U, (InterfaceC17886g0) obj);
                                case 3:
                                    return AbstractC33606l.m106128G((String) c13821r1M92099U, (InterfaceC18044z) obj);
                                default:
                                    return AbstractC33606l.m106129H((Function1) c13821r1M92099U, (C16995l) obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R9);
                }
                Function1 function7 = (Function1) objM87133R9;
                i16 = i15 & 112;
                if (i16 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R10 = c28655q2.m87133R();
                if (z13 || objM87133R10 == c28676v0) {
                    objM87133R10 = new C27632b(function3, interfaceC28690z0, interfaceC28601c6, interfaceC28601c4);
                    c28655q2.m87172p0(objM87133R10);
                }
                function4 = function3;
                m106136O(zM106170u, zM106172w, c34639dM106132K, c34637bM106134M, function6, function7, (InterfaceC4351m) objM87133R10, c28655q2, 24576, 0);
                int i24 = i15;
                boolean isAnimating = state.getIsAnimating();
                float fM106174y = m106174y(interfaceC28690z0);
                int iM87024x = c13821r1M92099U.f49318a.m87024x();
                long jM106168s = m106168s(interfaceC28601c3);
                objM87133R11 = c28655q2.m87133R();
                if (objM87133R11 == c28676v0) {
                    objM87133R11 = new C33609o(interfaceC28601c1, interfaceC28601c2, interfaceC28601c5, interfaceC28601c4, interfaceC28601c6, 1);
                    c28655q2.m87172p0(objM87133R11);
                }
                m106164o(isAnimating, state, fM106174y, iM87024x, jM106168s, (InterfaceC4352n) objM87133R11, c28655q2, ((i24 << 3) & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21);
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t, "zoomGraph");
                objM87133R12 = c28655q2.m87133R();
                if (objM87133R12 == c28676v0) {
                    final int i25 = 2;
                    objM87133R12 = new Function1() { // from class: t81.i
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i25) {
                                case 0:
                                    return AbstractC33606l.m106123B((InterfaceC28690z0) interfaceC28601c3, ((Float) obj).floatValue());
                                case 1:
                                    return AbstractC33606l.m106124C((C13821r1) interfaceC28601c3, ((Float) obj).floatValue());
                                case 2:
                                    return AbstractC33606l.m106127F((InterfaceC28601c1) interfaceC28601c3, (InterfaceC17886g0) obj);
                                case 3:
                                    return AbstractC33606l.m106128G((String) interfaceC28601c3, (InterfaceC18044z) obj);
                                default:
                                    return AbstractC33606l.m106129H((Function1) interfaceC28601c3, (C16995l) obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R12);
                }
                Modifier modifierM3486a = AbstractC1127a.m3486a(modifierM3599a, (Function1) objM87133R12);
                boolean zM87157i2 = c28655q2.m87157i(state) | c28655q2.m87153g(c13821r1M92099U);
                if (i16 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zM87157i2 | z14;
                Object objM87133R17 = c28655q2.m87133R();
                if (!z15 || objM87133R17 == c28676v0) {
                    c13821r1 = c13821r1M92099U;
                    bVar = new b(state, c13821r1, function4, interfaceC28690z0, interfaceC28601c1, interfaceC28601c2, interfaceC28601c5);
                    interfaceC28690z1 = interfaceC28690z0;
                    c28655q2.m87172p0(bVar);
                } else {
                    bVar = objM87133R17;
                    c13821r1 = c13821r1M92099U;
                    interfaceC28690z1 = interfaceC28690z0;
                }
                C23454a0 c23454a0 = C23454a0.f92919a;
                Modifier modifierM108903b = AbstractC34452c0.m108903b(modifierM3486a, c23454a0, (PointerInputEventHandler) bVar);
                zM87157i = c28655q2.m87157i(state) | c28655q2.m87153g(c13821r1);
                objM87133R13 = c28655q2.m87133R();
                if (zM87157i || objM87133R13 == c28676v0) {
                    c cVar = new c(state, c13821r1, interfaceC28690z1, interfaceC28601c1, interfaceC28601c2, interfaceC28601c5, interfaceC28601c4, interfaceC28601c6);
                    c28655q2.m87172p0(cVar);
                    objM87133R13 = cVar;
                }
                Modifier modifierM108903b2 = AbstractC34452c0.m108903b(modifierM108903b, c23454a0, (PointerInputEventHandler) objM87133R13);
                C2307m c2307m = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM108903b2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                C33612r c33612rM106189a = state.m106189a((8159 & 1) != 0 ? state.planeState : null, (8159 & 2) != 0 ? state.plotPadding : null, (8159 & 4) != 0 ? state.plots : null, (8159 & 8) != 0 ? state.initialGraphSize : 0L, (8159 & 16) != 0 ? state.accessibilityLabel : null, (8159 & 32) != 0 ? state.zoom : m106174y(interfaceC28690z1), (8159 & 64) != 0 ? state.zoomLevel : null, (8159 & 128) != 0 ? state.zoomToggleState : null, (8159 & 256) != 0 ? state.isAnimating : false, (8159 & 512) != 0 ? state.initialDataScrubState : null, (8159 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? state.initialPlotId : null, (8159 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? state.initialScrollableScrubberState : null, (8159 & 4096) != 0 ? state.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null);
                strM21274h = AbstractC8693b.m21274h(c33612rM106189a.getAccessibilityLabel(), c28655q2, 0);
                float fontScale = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).getFontScale();
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                zM87153g2 = c28655q2.m87153g(strM21274h);
                objM87133R14 = c28655q2.m87133R();
                if (zM87153g2 || objM87133R14 == c28676v0) {
                    final int i26 = 3;
                    objM87133R14 = new Function1() { // from class: t81.i
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i26) {
                                case 0:
                                    return AbstractC33606l.m106123B((InterfaceC28690z0) strM21274h, ((Float) obj).floatValue());
                                case 1:
                                    return AbstractC33606l.m106124C((C13821r1) strM21274h, ((Float) obj).floatValue());
                                case 2:
                                    return AbstractC33606l.m106127F((InterfaceC28601c1) strM21274h, (InterfaceC17886g0) obj);
                                case 3:
                                    return AbstractC33606l.m106128G((String) strM21274h, (InterfaceC18044z) obj);
                                default:
                                    return AbstractC33606l.m106129H((Function1) strM21274h, (C16995l) obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R14);
                }
                Modifier modifierM51775c = AbstractC18032n.m51775c(modifierM3409f, false, (Function1) objM87133R14);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM51775c);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                C16993j c16993j = new C16993j(c33612rM106189a.getPlaneState(), c33612rM106189a.m106196j(), c33612rM106189a.getZoom(), InterfaceC18201e.a.f70706a, null, null, 48, null);
                long initialGraphSize = c33612rM106189a.getInitialGraphSize();
                C22976l1 c22976l1M3379a = AbstractC1099a.m3379a(((float) 2.5d) * 8 * fontScale, 0.0f, 2);
                InterfaceC11732a initialDataScrubState = c33612rM106189a.getInitialDataScrubState();
                z16 = i16 == 32;
                objM87133R15 = c28655q2.m87133R();
                if (!z16 || objM87133R15 == c28676v0) {
                    final int i27 = 4;
                    function5 = function4;
                    objM87133R15 = new Function1() { // from class: t81.i
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i27) {
                                case 0:
                                    return AbstractC33606l.m106123B((InterfaceC28690z0) function5, ((Float) obj).floatValue());
                                case 1:
                                    return AbstractC33606l.m106124C((C13821r1) function5, ((Float) obj).floatValue());
                                case 2:
                                    return AbstractC33606l.m106127F((InterfaceC28601c1) function5, (InterfaceC17886g0) obj);
                                case 3:
                                    return AbstractC33606l.m106128G((String) function5, (InterfaceC18044z) obj);
                                default:
                                    return AbstractC33606l.m106129H((Function1) function5, (C16995l) obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R15);
                } else {
                    function5 = function4;
                }
                AbstractC16990g.m47833l(null, c16993j, null, null, initialGraphSize, (Function1) objM87133R15, c13821r1, c22976l1M3379a, initialDataScrubState, null, c28655q2, 0, 525);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                function2 = function5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33592b(state, i13, function2, i14, 1);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R16 = c28655q2.m87133R();
                if (objM87133R16 == c28676v0) {
                    objM87133R16 = new C33610p(1);
                    c28655q2.m87172p0(objM87133R16);
                }
                function3 = (Function1) objM87133R16;
            } else {
                function3 = function2;
            }
            objM87133R = c28655q2.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30468v(state.getZoom(), c28655q2);
            }
            interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(new C34639d(state.getZoomToggleState().getZoomOutLevel(), state.getZoomToggleState().getZoomInLevel()));
                c28655q2.m87172p0(objM87133R2);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
            objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(new C34637b(0, 0));
                c28655q2.m87172p0(objM87133R3);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
            objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(new C16617b((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L)));
                c28655q2.m87172p0(objM87133R4);
            }
            interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
            c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q2, 1);
            objM87133R5 = c28655q2.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R5);
            }
            interfaceC28601c4 = (InterfaceC28601c1) objM87133R5;
            objM87133R6 = c28655q2.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q2.m87172p0(objM87133R6);
            }
            interfaceC28601c5 = (InterfaceC28601c1) objM87133R6;
            objM87133R7 = c28655q2.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q2.m87172p0(objM87133R7);
            }
            interfaceC28601c6 = (InterfaceC28601c1) objM87133R7;
            boolean zM106170u2 = m106170u(interfaceC28601c4);
            boolean zM106172w2 = m106172w(interfaceC28601c5);
            C34639d c34639dM106132K2 = m106132K(interfaceC28601c1);
            C34637b c34637bM106134M2 = m106134M(interfaceC28601c2);
            objM87133R8 = c28655q2.m87133R();
            if (objM87133R8 == c28676v0) {
                final int i110 = 0;
                objM87133R8 = new Function1() { // from class: t81.i
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i110) {
                            case 0:
                                return AbstractC33606l.m106123B((InterfaceC28690z0) interfaceC28690z0, ((Float) obj).floatValue());
                            case 1:
                                return AbstractC33606l.m106124C((C13821r1) interfaceC28690z0, ((Float) obj).floatValue());
                            case 2:
                                return AbstractC33606l.m106127F((InterfaceC28601c1) interfaceC28690z0, (InterfaceC17886g0) obj);
                            case 3:
                                return AbstractC33606l.m106128G((String) interfaceC28690z0, (InterfaceC18044z) obj);
                            default:
                                return AbstractC33606l.m106129H((Function1) interfaceC28690z0, (C16995l) obj);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R8);
            }
            Function1 function8 = (Function1) objM87133R8;
            zM87153g = c28655q2.m87153g(c13821r1M92099U);
            objM87133R9 = c28655q2.m87133R();
            if (zM87153g) {
                final int i111 = 1;
                objM87133R9 = new Function1() { // from class: t81.i
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i111) {
                            case 0:
                                return AbstractC33606l.m106123B((InterfaceC28690z0) c13821r1M92099U, ((Float) obj).floatValue());
                            case 1:
                                return AbstractC33606l.m106124C((C13821r1) c13821r1M92099U, ((Float) obj).floatValue());
                            case 2:
                                return AbstractC33606l.m106127F((InterfaceC28601c1) c13821r1M92099U, (InterfaceC17886g0) obj);
                            case 3:
                                return AbstractC33606l.m106128G((String) c13821r1M92099U, (InterfaceC18044z) obj);
                            default:
                                return AbstractC33606l.m106129H((Function1) c13821r1M92099U, (C16995l) obj);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R9);
            } else {
                final int i112 = 1;
                objM87133R9 = new Function1() { // from class: t81.i
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i112) {
                            case 0:
                                return AbstractC33606l.m106123B((InterfaceC28690z0) c13821r1M92099U, ((Float) obj).floatValue());
                            case 1:
                                return AbstractC33606l.m106124C((C13821r1) c13821r1M92099U, ((Float) obj).floatValue());
                            case 2:
                                return AbstractC33606l.m106127F((InterfaceC28601c1) c13821r1M92099U, (InterfaceC17886g0) obj);
                            case 3:
                                return AbstractC33606l.m106128G((String) c13821r1M92099U, (InterfaceC18044z) obj);
                            default:
                                return AbstractC33606l.m106129H((Function1) c13821r1M92099U, (C16995l) obj);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R9);
            }
            Function1 function9 = (Function1) objM87133R9;
            i16 = i15 & 112;
            if (i16 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R10 = c28655q2.m87133R();
            if (z13) {
                objM87133R10 = new C27632b(function3, interfaceC28690z0, interfaceC28601c6, interfaceC28601c4);
                c28655q2.m87172p0(objM87133R10);
            } else {
                objM87133R10 = new C27632b(function3, interfaceC28690z0, interfaceC28601c6, interfaceC28601c4);
                c28655q2.m87172p0(objM87133R10);
            }
            function4 = function3;
            m106136O(zM106170u2, zM106172w2, c34639dM106132K2, c34637bM106134M2, function8, function9, (InterfaceC4351m) objM87133R10, c28655q2, 24576, 0);
            int i28 = i15;
            boolean isAnimating2 = state.getIsAnimating();
            float fM106174y2 = m106174y(interfaceC28690z0);
            int iM87024x2 = c13821r1M92099U.f49318a.m87024x();
            long jM106168s2 = m106168s(interfaceC28601c3);
            objM87133R11 = c28655q2.m87133R();
            if (objM87133R11 == c28676v0) {
                objM87133R11 = new C33609o(interfaceC28601c1, interfaceC28601c2, interfaceC28601c5, interfaceC28601c4, interfaceC28601c6, 1);
                c28655q2.m87172p0(objM87133R11);
            }
            m106164o(isAnimating2, state, fM106174y2, iM87024x2, jM106168s2, (InterfaceC4352n) objM87133R11, c28655q2, ((i28 << 3) & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21);
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3599a2 = AbstractC1136a.m3599a(c2314t2, "zoomGraph");
            objM87133R12 = c28655q2.m87133R();
            if (objM87133R12 == c28676v0) {
                final int i29 = 2;
                objM87133R12 = new Function1() { // from class: t81.i
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i29) {
                            case 0:
                                return AbstractC33606l.m106123B((InterfaceC28690z0) interfaceC28601c3, ((Float) obj).floatValue());
                            case 1:
                                return AbstractC33606l.m106124C((C13821r1) interfaceC28601c3, ((Float) obj).floatValue());
                            case 2:
                                return AbstractC33606l.m106127F((InterfaceC28601c1) interfaceC28601c3, (InterfaceC17886g0) obj);
                            case 3:
                                return AbstractC33606l.m106128G((String) interfaceC28601c3, (InterfaceC18044z) obj);
                            default:
                                return AbstractC33606l.m106129H((Function1) interfaceC28601c3, (C16995l) obj);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R12);
            }
            Modifier modifierM3486a2 = AbstractC1127a.m3486a(modifierM3599a2, (Function1) objM87133R12);
            boolean zM87157i3 = c28655q2.m87157i(state) | c28655q2.m87153g(c13821r1M92099U);
            if (i16 == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = zM87157i3 | z14;
            Object objM87133R18 = c28655q2.m87133R();
            if (z15) {
                c13821r1 = c13821r1M92099U;
                bVar = new b(state, c13821r1, function4, interfaceC28690z0, interfaceC28601c1, interfaceC28601c2, interfaceC28601c5);
                interfaceC28690z1 = interfaceC28690z0;
                c28655q2.m87172p0(bVar);
            } else {
                c13821r1 = c13821r1M92099U;
                bVar = new b(state, c13821r1, function4, interfaceC28690z0, interfaceC28601c1, interfaceC28601c2, interfaceC28601c5);
                interfaceC28690z1 = interfaceC28690z0;
                c28655q2.m87172p0(bVar);
            }
            C23454a0 c23454a1 = C23454a0.f92919a;
            Modifier modifierM108903b3 = AbstractC34452c0.m108903b(modifierM3486a2, c23454a1, (PointerInputEventHandler) bVar);
            zM87157i = c28655q2.m87157i(state) | c28655q2.m87153g(c13821r1);
            objM87133R13 = c28655q2.m87133R();
            if (zM87157i) {
                c cVar2 = new c(state, c13821r1, interfaceC28690z1, interfaceC28601c1, interfaceC28601c2, interfaceC28601c5, interfaceC28601c4, interfaceC28601c6);
                c28655q2.m87172p0(cVar2);
                objM87133R13 = cVar2;
            } else {
                c cVar3 = new c(state, c13821r1, interfaceC28690z1, interfaceC28601c1, interfaceC28601c2, interfaceC28601c5, interfaceC28601c4, interfaceC28601c6);
                c28655q2.m87172p0(cVar3);
                objM87133R13 = cVar3;
            }
            Modifier modifierM108903b4 = AbstractC34452c0.m108903b(modifierM108903b3, c23454a1, (PointerInputEventHandler) objM87133R13);
            C2307m c2307m2 = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m2, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM108903b4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC39127r0M66763d3);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N3);
            C33612r c33612rM106189a2 = state.m106189a((8159 & 1) != 0 ? state.planeState : null, (8159 & 2) != 0 ? state.plotPadding : null, (8159 & 4) != 0 ? state.plots : null, (8159 & 8) != 0 ? state.initialGraphSize : 0L, (8159 & 16) != 0 ? state.accessibilityLabel : null, (8159 & 32) != 0 ? state.zoom : m106174y(interfaceC28690z1), (8159 & 64) != 0 ? state.zoomLevel : null, (8159 & 128) != 0 ? state.zoomToggleState : null, (8159 & 256) != 0 ? state.isAnimating : false, (8159 & 512) != 0 ? state.initialDataScrubState : null, (8159 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? state.initialPlotId : null, (8159 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? state.initialScrollableScrubberState : null, (8159 & 4096) != 0 ? state.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null);
            strM21274h = AbstractC8693b.m21274h(c33612rM106189a2.getAccessibilityLabel(), c28655q2, 0);
            float fontScale2 = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).getFontScale();
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
            zM87153g2 = c28655q2.m87153g(strM21274h);
            objM87133R14 = c28655q2.m87133R();
            if (zM87153g2) {
                final int i210 = 3;
                objM87133R14 = new Function1() { // from class: t81.i
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i210) {
                            case 0:
                                return AbstractC33606l.m106123B((InterfaceC28690z0) strM21274h, ((Float) obj).floatValue());
                            case 1:
                                return AbstractC33606l.m106124C((C13821r1) strM21274h, ((Float) obj).floatValue());
                            case 2:
                                return AbstractC33606l.m106127F((InterfaceC28601c1) strM21274h, (InterfaceC17886g0) obj);
                            case 3:
                                return AbstractC33606l.m106128G((String) strM21274h, (InterfaceC18044z) obj);
                            default:
                                return AbstractC33606l.m106129H((Function1) strM21274h, (C16995l) obj);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R14);
            } else {
                final int i211 = 3;
                objM87133R14 = new Function1() { // from class: t81.i
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i211) {
                            case 0:
                                return AbstractC33606l.m106123B((InterfaceC28690z0) strM21274h, ((Float) obj).floatValue());
                            case 1:
                                return AbstractC33606l.m106124C((C13821r1) strM21274h, ((Float) obj).floatValue());
                            case 2:
                                return AbstractC33606l.m106127F((InterfaceC28601c1) strM21274h, (InterfaceC17886g0) obj);
                            case 3:
                                return AbstractC33606l.m106128G((String) strM21274h, (InterfaceC18044z) obj);
                            default:
                                return AbstractC33606l.m106129H((Function1) strM21274h, (C16995l) obj);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R14);
            }
            Modifier modifierM51775c2 = AbstractC18032n.m51775c(modifierM3409f2, false, (Function1) objM87133R14);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m2, false);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM51775c2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N4);
            C16993j c16993j2 = new C16993j(c33612rM106189a2.getPlaneState(), c33612rM106189a2.m106196j(), c33612rM106189a2.getZoom(), InterfaceC18201e.a.f70706a, null, null, 48, null);
            long initialGraphSize2 = c33612rM106189a2.getInitialGraphSize();
            C22976l1 c22976l1M3379a2 = AbstractC1099a.m3379a(((float) 2.5d) * 8 * fontScale2, 0.0f, 2);
            InterfaceC11732a initialDataScrubState2 = c33612rM106189a2.getInitialDataScrubState();
            if (i16 == 32) {
            }
            objM87133R15 = c28655q2.m87133R();
            if (z16) {
                final int i212 = 4;
                function5 = function4;
                objM87133R15 = new Function1() { // from class: t81.i
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i212) {
                            case 0:
                                return AbstractC33606l.m106123B((InterfaceC28690z0) function5, ((Float) obj).floatValue());
                            case 1:
                                return AbstractC33606l.m106124C((C13821r1) function5, ((Float) obj).floatValue());
                            case 2:
                                return AbstractC33606l.m106127F((InterfaceC28601c1) function5, (InterfaceC17886g0) obj);
                            case 3:
                                return AbstractC33606l.m106128G((String) function5, (InterfaceC18044z) obj);
                            default:
                                return AbstractC33606l.m106129H((Function1) function5, (C16995l) obj);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R15);
            } else {
                final int i213 = 4;
                function5 = function4;
                objM87133R15 = new Function1() { // from class: t81.i
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i213) {
                            case 0:
                                return AbstractC33606l.m106123B((InterfaceC28690z0) function5, ((Float) obj).floatValue());
                            case 1:
                                return AbstractC33606l.m106124C((C13821r1) function5, ((Float) obj).floatValue());
                            case 2:
                                return AbstractC33606l.m106127F((InterfaceC28601c1) function5, (InterfaceC17886g0) obj);
                            case 3:
                                return AbstractC33606l.m106128G((String) function5, (InterfaceC18044z) obj);
                            default:
                                return AbstractC33606l.m106129H((Function1) function5, (C16995l) obj);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R15);
            }
            AbstractC16990g.m47833l(null, c16993j2, null, null, initialGraphSize2, (Function1) objM87133R15, c13821r1, c22976l1M3379a2, initialDataScrubState2, null, c28655q2, 0, 525);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            function2 = function5;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33592b(state, i13, function2, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m106167r(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    private static final long m106168s(InterfaceC28601c1 interfaceC28601c1) {
        return ((C16617b) interfaceC28601c1.getValue()).f63937a;
    }

    /* JADX INFO: renamed from: t */
    private static final void m106169t(InterfaceC28601c1 interfaceC28601c1, long j7) {
        interfaceC28601c1.setValue(new C16617b(j7));
    }

    /* JADX INFO: renamed from: u */
    private static final boolean m106170u(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final void m106171v(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: w */
    private static final boolean m106172w(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final void m106173x(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final float m106174y(InterfaceC28690z0 interfaceC28690z0) {
        return ((C28617g1) interfaceC28690z0).m87022x();
    }

    /* JADX INFO: renamed from: z */
    private static final boolean m106175z(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }
}
