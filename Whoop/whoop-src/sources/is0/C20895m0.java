package is0;

import androidx.compose.foundation.gestures.AbstractC1096a;
import com.mapbox.common.logger.LogPriority;
import e93.AbstractC12889b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Arrays;
import l83.C23454a0;
import p132f0.EnumC13840z0;
import p180h0.C16390g;
import p180h0.C16402i1;
import p180h0.C16430o;
import p180h0.C16435p;
import p180h0.C16475x;
import p180h0.InterfaceC16356a;
import p180h0.InterfaceC16397h1;
import p180h0.InterfaceC16413k2;
import p180h0.InterfaceC16439p3;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: is0.m0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011*\u0001\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0019\u0010\u0017J \u0010\u001d\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b\"\u0010!R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010+\u001a\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010.\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u00100\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0011\u00103\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, m65681d2 = {"Lis0/m0;", "", "Lis0/b0;", "initialValue", "<init>", "(Lis0/b0;)V", "Lh0/a;", "is0/m0$a", "b", "(Lh0/a;)Lis0/m0$a;", "", "collapsedHeightPx", "expandedHeightPx", "Ll83/a0;", "p", "(FF)V", "delta", "e", "(F)F", "", "d", "(F)Ljava/lang/Integer;", "f", "(Lq83/d;)Ljava/lang/Object;", "c", "o", "Lh0/p3;", "flingBehavior", "velocityY", "n", "(Lh0/p3;FLq83/d;)Ljava/lang/Object;", "", "l", "()Z", "m", "Lh0/p;", "a", "Lh0/p;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lh0/p;", "draggableState", "g", "()Ljava/lang/Float;", "anchoredOffset", "j", "()Lis0/b0;", "settledValue", "k", "targetValue", "i", "()F", "expansionProgress", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C20895m0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C16435p draggableState;

    /* JADX INFO: renamed from: is0.m0$a */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"is0/m0$a", "Lh0/k2;", "", "pixels", "a", "(F)F", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC16413k2 {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC16356a f78659b;

        public a(InterfaceC16356a interfaceC16356a) {
            this.f78659b = interfaceC16356a;
        }

        @Override // p180h0.InterfaceC16413k2
        /* JADX INFO: renamed from: a */
        public float mo29373a(float pixels) {
            C16475x c16475x = (C16475x) C20895m0.this.getDraggableState().m46613c();
            float fM36283m = AbstractC12889b.m36283m(C20895m0.this.getDraggableState().f63154f.m87022x() + pixels, c16475x.m46649d(), c16475x.m46648c());
            float fM87022x = fM36283m - C20895m0.this.getDraggableState().f63154f.m87022x();
            ((C16430o) this.f78659b).m46600b(fM36283m, 0.0f);
            return fM87022x;
        }
    }

    /* JADX INFO: renamed from: is0.m0$b */
    @InterfaceC32271e(m100429c = "com.whoop.communityreactions.view.ReactionsPanelState$settle$2", m100430f = "ReactionsPanelState.kt", m100431l = {LogPriority.NONE}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lh0/a;", "Lh0/h1;", "Lis0/b0;", "it", "Ll83/a0;", "<anonymous>", "(Lh0/a;Lh0/h1;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC16439p3 f78660E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C20895m0 f78661F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ float f78662G;

        /* JADX INFO: renamed from: w */
        Object f78663w;

        /* JADX INFO: renamed from: x */
        int f78664x;

        /* JADX INFO: renamed from: y */
        int f78665y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f78666z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC16439p3 interfaceC16439p3, C20895m0 c20895m0, float f13, InterfaceC30057d<? super b> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f78660E = interfaceC16439p3;
            this.f78661F = c20895m0;
            this.f78662G = f13;
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16356a interfaceC16356a, InterfaceC16397h1 interfaceC16397h1, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(this.f78660E, this.f78661F, this.f78662G, interfaceC30057d);
            bVar.f78666z = interfaceC16356a;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC16356a interfaceC16356a = (InterfaceC16356a) this.f78666z;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f78665y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC16439p3 interfaceC16439p3 = this.f78660E;
                C20895m0 c20895m0 = this.f78661F;
                float f13 = this.f78662G;
                a aVarM57820b = c20895m0.m57820b(interfaceC16356a);
                this.f78666z = null;
                this.f78663w = null;
                this.f78664x = 0;
                this.f78665y = 1;
                if (interfaceC16439p3.mo46565a(aVarM57820b, f13, this) == enumC31071a) {
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

    public C20895m0(EnumC20873b0 initialValue) {
        AbstractC22676k.m65750j(initialValue, "initialValue");
        this.draggableState = new C16435p(initialValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final a m57820b(InterfaceC16356a interfaceC16356a) {
        return new a(interfaceC16356a);
    }

    /* JADX INFO: renamed from: g */
    private final Float m57821g() {
        float fM87022x = this.draggableState.f63154f.m87022x();
        Float fValueOf = Float.valueOf(fM87022x);
        if (Float.isNaN(fM87022x)) {
            return null;
        }
        return fValueOf;
    }

    /* JADX INFO: renamed from: q */
    private static final C23454a0 m57822q(float f13, C16402i1 DraggableAnchors) {
        AbstractC22676k.m65750j(DraggableAnchors, "$this$DraggableAnchors");
        DraggableAnchors.m46592a(EnumC20873b0.Collapsed, 0.0f);
        DraggableAnchors.m46592a(EnumC20873b0.Expanded, -f13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    public final Object m57823c(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM3372c = AbstractC1096a.m3372c(this.draggableState, EnumC20873b0.Collapsed, AbstractC20897n0.m57839c(), interfaceC30057d);
        return objM3372c == EnumC31071a.f128113w ? objM3372c : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    public final Integer m57824d(float collapsedHeightPx) {
        if (collapsedHeightPx <= 0.0f) {
            return null;
        }
        Float fM57821g = m57821g();
        if (fM57821g == null) {
            return Integer.valueOf(AbstractC12889b.m36258X(collapsedHeightPx));
        }
        int iM36258X = AbstractC12889b.m36258X(collapsedHeightPx - fM57821g.floatValue());
        if (iM36258X < 1) {
            iM36258X = 1;
        }
        return Integer.valueOf(iM36258X);
    }

    /* JADX INFO: renamed from: e */
    public final float m57825e(float delta) {
        if (m57821g() == null) {
            return 0.0f;
        }
        C16435p c16435p = this.draggableState;
        float fM46614d = c16435p.m46614d(delta);
        float fM46616f = fM46614d - c16435p.m46616f();
        c16435p.f63158j.m46600b(fM46614d, 0.0f);
        return fM46616f;
    }

    /* JADX INFO: renamed from: f */
    public final Object m57826f(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM3372c = AbstractC1096a.m3372c(this.draggableState, EnumC20873b0.Expanded, AbstractC20897n0.m57839c(), interfaceC30057d);
        return objM3372c == EnumC31071a.f128113w ? objM3372c : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C16435p getDraggableState() {
        return this.draggableState;
    }

    /* JADX INFO: renamed from: i */
    public final float m57828i() {
        if (m57821g() == null) {
            return m57829j() == EnumC20873b0.Expanded ? 1.0f : 0.0f;
        }
        return this.draggableState.m46615e(EnumC20873b0.Collapsed, EnumC20873b0.Expanded);
    }

    /* JADX INFO: renamed from: j */
    public final EnumC20873b0 m57829j() {
        return (EnumC20873b0) this.draggableState.f63152d.getValue();
    }

    /* JADX INFO: renamed from: k */
    public final EnumC20873b0 m57830k() {
        return (EnumC20873b0) this.draggableState.f63153e.getValue();
    }

    /* JADX INFO: renamed from: l */
    public final boolean m57831l() {
        Float fM57821g = m57821g();
        if (fM57821g != null) {
            float fFloatValue = fM57821g.floatValue();
            float fM46650e = ((C16475x) this.draggableState.m46613c()).m46650e(EnumC20873b0.Expanded);
            if (!Float.isNaN(fM46650e) && fFloatValue > fM46650e + 0.5f) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m57832m() {
        Float fM57821g = m57821g();
        if (fM57821g != null) {
            float fFloatValue = fM57821g.floatValue();
            float fM46650e = ((C16475x) this.draggableState.m46613c()).m46650e(m57829j());
            if (!Float.isNaN(fM46650e) && Math.abs(fFloatValue - fM46650e) > 0.5f) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final Object m57833n(InterfaceC16439p3 interfaceC16439p3, float f13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM46611b;
        return (m57821g() == null || (objM46611b = C16435p.m46611b(this.draggableState, new b(interfaceC16439p3, this, f13, null), interfaceC30057d)) != EnumC31071a.f128113w) ? C23454a0.f92919a : objM46611b;
    }

    /* JADX INFO: renamed from: o */
    public final Object m57834o(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM46612a = this.draggableState.m46612a(EnumC20873b0.Expanded, EnumC13840z0.f49374w, new C16390g(4, null), interfaceC30057d);
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (objM46612a != enumC31071a) {
            objM46612a = c23454a0;
        }
        return objM46612a == enumC31071a ? objM46612a : c23454a0;
    }

    /* JADX INFO: renamed from: p */
    public final void m57835p(float collapsedHeightPx, float expandedHeightPx) {
        float fM57838b = AbstractC20897n0.m57838b(expandedHeightPx, collapsedHeightPx) - collapsedHeightPx;
        if (fM57838b < 1.0f) {
            fM57838b = 1.0f;
        }
        C16435p c16435p = this.draggableState;
        C16402i1 c16402i1 = new C16402i1();
        m57822q(fM57838b, c16402i1);
        float[] fArr = c16402i1.f63050b;
        ArrayList arrayList = c16402i1.f63049a;
        int size = arrayList.size();
        AbstractC22676k.m65750j(fArr, "<this>");
        AbstractC34132o.m107886j(size, fArr.length);
        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, size);
        AbstractC22676k.m65749i(fArrCopyOfRange, "copyOfRange(...)");
        c16435p.m46618h(new C16475x(arrayList, fArrCopyOfRange), m57830k());
    }
}
