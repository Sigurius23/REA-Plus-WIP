package ar2;

import a20.C0167g;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.painter.BitmapPainter;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import kd1.AbstractC22403o;
import l83.C23454a0;
import ny0.AbstractC27292z;
import ny0.C27246d;
import ny0.C27256h;
import ny0.EnumC27254g;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p208i2.C17885g;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.EnumC22935a1;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rq2.AbstractC31752t0;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: ar2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\f²\u0006\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lar2/c;", "state", "", "isCurrentStep", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "d", "(Lar2/c;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Landroid/graphics/Bitmap;", "shareImageBitmap", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC1936g {

    /* JADX INFO: renamed from: ar2.g$a */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.view.components.steps.shareablestep.ShareableStepViewV2Kt$ShareableStepViewV2$1$1", m100430f = "ShareableStepViewV2.kt", m100431l = {53}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f7687E;

        /* JADX INFO: renamed from: w */
        Object f7688w;

        /* JADX INFO: renamed from: x */
        int f7689x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Context f7690y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C1932c f7691z;

        /* JADX INFO: renamed from: ar2.g$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.user.journey.view.components.steps.shareablestep.ShareableStepViewV2Kt$ShareableStepViewV2$1$1$1", m100430f = "ShareableStepViewV2.kt", m100431l = {54}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lbc3/c0;)Landroid/graphics/Bitmap;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C41285a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f7692w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ Context f7693x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C1932c f7694y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41285a(Context context, C1932c c1932c, InterfaceC30057d<? super C41285a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f7693x = context;
                this.f7694y = c1932c;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new C41285a(this.f7693x, this.f7694y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Bitmap> interfaceC30057d) {
                return ((C41285a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f7692w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                Context context = this.f7693x;
                AbstractC22403o abstractC22403oM5922e = this.f7694y.getImageSource();
                this.f7692w = 1;
                Object objM5926a = AbstractC1933d.m5926a(context, abstractC22403oM5922e, this);
                return objM5926a == enumC31071a ? enumC31071a : objM5926a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, C1932c c1932c, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f7690y = context;
            this.f7691z = c1932c;
            this.f7687E = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f7690y, this.f7691z, this.f7687E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC28601c1 interfaceC28601c1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f7689x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC28601c1 interfaceC28601c2 = this.f7687E;
                C22365e c22365e = AbstractC3050q0.f12077a;
                ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
                C41285a c41285a = new C41285a(this.f7690y, this.f7691z, null);
                this.f7688w = interfaceC28601c2;
                this.f7689x = 1;
                Object objM8705K = AbstractC3006f0.m8705K(executorC22364d, c41285a, this);
                if (objM8705K == enumC31071a) {
                    return enumC31071a;
                }
                interfaceC28601c1 = interfaceC28601c2;
                obj = objM8705K;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC28601c1 = (InterfaceC28601c1) this.f7688w;
                AbstractC34132o.m107864I(obj);
            }
            AbstractC1936g.m5932f(interfaceC28601c1, (Bitmap) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0295  */
    /* JADX WARN: Code duplicated, block: B:104:0x0299  */
    /* JADX WARN: Code duplicated, block: B:107:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:110:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:111:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:115:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:117:0x0303  */
    /* JADX WARN: Code duplicated, block: B:119:0x0353  */
    /* JADX WARN: Code duplicated, block: B:121:0x0358  */
    /* JADX WARN: Code duplicated, block: B:123:0x035c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0360  */
    /* JADX WARN: Code duplicated, block: B:128:0x0369  */
    /* JADX WARN: Code duplicated, block: B:130:0x036d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0377  */
    /* JADX WARN: Code duplicated, block: B:136:0x037b  */
    /* JADX WARN: Code duplicated, block: B:65:0x014f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0155  */
    /* JADX WARN: Code duplicated, block: B:68:0x0160  */
    /* JADX WARN: Code duplicated, block: B:72:0x0177  */
    /* JADX WARN: Code duplicated, block: B:73:0x0179  */
    /* JADX WARN: Code duplicated, block: B:75:0x017c  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:87:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:91:0x025b  */
    /* JADX WARN: Code duplicated, block: B:92:0x025f  */
    /* JADX WARN: Code duplicated, block: B:97:0x027c  */
    /* JADX INFO: renamed from: d */
    public static final void m5930d(C1932c c1932c, boolean z4, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        Function1 function1;
        float f13;
        boolean zM87153g;
        Object objM87133R;
        Bitmap bitmapM5931e;
        BitmapPainter bitmapPainter;
        BitmapPainter bitmapPainter2;
        int i15;
        boolean z13;
        int iHashCode;
        float f14;
        C0209i c0209i;
        C28676v0 c28676v0;
        boolean z14;
        C2314t c2314t;
        boolean z15;
        int iHashCode2;
        int i16;
        boolean z16;
        boolean zM87153g2;
        Object objM87133R2;
        C28676v0 c28676v1;
        C27256h c27256hM5923f;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objM87133R3;
        C1932c state = c1932c;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-504469579);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(state) : c28655q.m87157i(state) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Object objM87133R4 = c28655q.m87133R();
            C28676v0 c28676v2 = C28635l.f115821a;
            if (objM87133R4 == c28676v2) {
                objM87133R4 = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R4);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R4;
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            TextResource textResourceM5925h = state.getShareMessage();
            int i17 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM5925h, c28655q, i17);
            if (z4) {
                c28655q.m87150e0(-562265335);
                AbstractC22403o abstractC22403oM5922e = state.getImageSource();
                int i18 = i14 & 14;
                boolean zM87157i = c28655q.m87157i(context) | (i18 == 4 || ((i14 & 8) != 0 && c28655q.m87157i(state)));
                Object objM87133R5 = c28655q.m87133R();
                if (zM87157i || objM87133R5 == c28676v2) {
                    objM87133R5 = new a(context, state, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, abstractC22403oM5922e);
                C2314t c2314t2 = C2314t.f9131w;
                float f15 = 8;
                float f16 = 2 * f15;
                Modifier modifierM3394p = AbstractC1099a.m3394p(f16, AbstractC1102d.m3407d(1.0f, c2314t2));
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                int iHashCode3 = Long.hashCode(c28655q.f115904T);
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
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                C0209i c0209i4 = C0217k.f732j;
                if (c28655q.f115903S) {
                    f13 = f16;
                } else {
                    f13 = f16;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    }
                    C0209i c0209i5 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3406c(0.1f, c2314t2));
                    zM87153g = c28655q.m87153g(m5931e(interfaceC28601c1));
                    objM87133R = c28655q.m87133R();
                    if (zM87153g || objM87133R == c28676v2) {
                        bitmapM5931e = m5931e(interfaceC28601c1);
                        if (bitmapM5931e != null) {
                            bitmapPainter = new BitmapPainter(new C17885g(bitmapM5931e));
                        } else {
                            bitmapPainter = null;
                        }
                        c28655q.m87172p0(bitmapPainter);
                        objM87133R = bitmapPainter;
                    }
                    bitmapPainter2 = (BitmapPainter) objM87133R;
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
                    i15 = i14;
                    if (1.0f > 0.0d) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM31988g = AbstractC11895b.m31988g(modifierM3409f, true, 1.0f);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM31988g);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
                    if (bitmapPainter2 == null) {
                        c28655q.m87150e0(-2032831569);
                        c28655q.m87173q(false);
                        c0209i = c0209i3;
                        c2314t = c2314t2;
                        f14 = f15;
                        c28676v0 = c28676v2;
                        z15 = false;
                        z14 = true;
                    } else {
                        c28655q.m87150e0(-2032831568);
                        f14 = f15;
                        c0209i = c0209i3;
                        c28676v0 = c28676v2;
                        z14 = true;
                        c2314t = c2314t2;
                        z15 = false;
                        AbstractC29125c.m88522c(bitmapPainter2, null, AbstractC1102d.m3407d(1.0f, c2314t2), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
                        c28655q.m87173q(false);
                    }
                    AbstractC18489d0.m53356B(c28655q, z14, c2314t, f13, c28655q);
                    Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, 4 * f14, 7);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), C2299e.f9111N, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                    TextResource textResourceM5924g = c1932c.getShareButtonText();
                    i16 = i15 & 896;
                    if (i16 == 256) {
                        z16 = z14;
                    } else {
                        z16 = z15;
                    }
                    zM87153g2 = c28655q.m87153g(strM21274h) | z16;
                    objM87133R2 = c28655q.m87133R();
                    if (zM87153g2) {
                        c28676v1 = c28676v0;
                    } else {
                        c28676v1 = c28676v0;
                        if (objM87133R2 == c28676v1) {
                        }
                        C28676v0 c28676v3 = c28676v1;
                        function1 = onViewEvent;
                        AbstractC27292z.m82343j(null, false, false, null, null, null, textResourceM5924g, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q, i17 << 18, 0, 8127);
                        c28655q = c28655q;
                        c27256hM5923f = c1932c.getSecondaryButton();
                        if (c27256hM5923f == null) {
                            c28655q.m87150e0(-445192799);
                            c28655q.m87173q(z15);
                            state = c1932c;
                        } else {
                            c28655q.m87150e0(-445192798);
                            C27246d c27246d = new C27246d();
                            Modifier modifierM3388j = AbstractC1099a.m3388j(c2314t, EnumC22935a1.f90538x);
                            C27256h c27256hM82144b = C27256h.m82144b(c27256hM5923f, null, null, null, null, null, null, null, null, null, null, EnumC27254g.STANDARD, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33553407, null);
                            if (i16 == 256) {
                                z17 = true;
                            } else {
                                z17 = z15;
                            }
                            if (i18 != 4) {
                                if ((i15 & 8) != 0) {
                                    state = c1932c;
                                    if (c28655q.m87157i(state)) {
                                    }
                                    z19 = z18 | z17;
                                    objM87133R3 = c28655q.m87133R();
                                    if (z19 || objM87133R3 == c28676v3) {
                                        objM87133R3 = new C0167g(13, function1, state);
                                        c28655q.m87172p0(objM87133R3);
                                    }
                                    c27246d.Compose(modifierM3388j, c27256hM82144b, (Function1) objM87133R3, c28655q, (C27256h.f109055z << 3) | 6 | (C27246d.f109048a << 9));
                                    c28655q.m87173q(z15);
                                } else {
                                    state = c1932c;
                                }
                                z18 = z15;
                                z19 = z18 | z17;
                                objM87133R3 = c28655q.m87133R();
                                if (z19) {
                                    objM87133R3 = new C0167g(13, function1, state);
                                    c28655q.m87172p0(objM87133R3);
                                } else {
                                    objM87133R3 = new C0167g(13, function1, state);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                c27246d.Compose(modifierM3388j, c27256hM82144b, (Function1) objM87133R3, c28655q, (C27256h.f109055z << 3) | 6 | (C27246d.f109048a << 9));
                                c28655q.m87173q(z15);
                            } else {
                                state = c1932c;
                            }
                            z18 = true;
                            z19 = z18 | z17;
                            objM87133R3 = c28655q.m87133R();
                            if (z19) {
                                objM87133R3 = new C0167g(13, function1, state);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C0167g(13, function1, state);
                                c28655q.m87172p0(objM87133R3);
                            }
                            c27246d.Compose(modifierM3388j, c27256hM82144b, (Function1) objM87133R3, c28655q, (C27256h.f109055z << 3) | 6 | (C27246d.f109048a << 9));
                            c28655q.m87173q(z15);
                        }
                        AbstractC25012a.m73392y(c28655q, true, true, z15);
                    }
                    objM87133R2 = new C1934e(onViewEvent, strM21274h, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R2);
                    C28676v0 c28676v4 = c28676v1;
                    function1 = onViewEvent;
                    AbstractC27292z.m82343j(null, false, false, null, null, null, textResourceM5924g, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q, i17 << 18, 0, 8127);
                    c28655q = c28655q;
                    c27256hM5923f = c1932c.getSecondaryButton();
                    if (c27256hM5923f == null) {
                        c28655q.m87150e0(-445192799);
                        c28655q.m87173q(z15);
                        state = c1932c;
                    } else {
                        c28655q.m87150e0(-445192798);
                        C27246d c27246d2 = new C27246d();
                        Modifier modifierM3388j2 = AbstractC1099a.m3388j(c2314t, EnumC22935a1.f90538x);
                        C27256h c27256hM82144b2 = C27256h.m82144b(c27256hM5923f, null, null, null, null, null, null, null, null, null, null, EnumC27254g.STANDARD, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33553407, null);
                        if (i16 == 256) {
                            z17 = true;
                        } else {
                            z17 = z15;
                        }
                        if (i18 != 4) {
                            if ((i15 & 8) != 0) {
                                state = c1932c;
                                if (c28655q.m87157i(state)) {
                                }
                                z19 = z18 | z17;
                                objM87133R3 = c28655q.m87133R();
                                if (z19) {
                                    objM87133R3 = new C0167g(13, function1, state);
                                    c28655q.m87172p0(objM87133R3);
                                } else {
                                    objM87133R3 = new C0167g(13, function1, state);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                c27246d2.Compose(modifierM3388j2, c27256hM82144b2, (Function1) objM87133R3, c28655q, (C27256h.f109055z << 3) | 6 | (C27246d.f109048a << 9));
                                c28655q.m87173q(z15);
                            } else {
                                state = c1932c;
                            }
                            z18 = z15;
                            z19 = z18 | z17;
                            objM87133R3 = c28655q.m87133R();
                            if (z19) {
                                objM87133R3 = new C0167g(13, function1, state);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C0167g(13, function1, state);
                                c28655q.m87172p0(objM87133R3);
                            }
                            c27246d2.Compose(modifierM3388j2, c27256hM82144b2, (Function1) objM87133R3, c28655q, (C27256h.f109055z << 3) | 6 | (C27246d.f109048a << 9));
                            c28655q.m87173q(z15);
                        } else {
                            state = c1932c;
                        }
                        z18 = true;
                        z19 = z18 | z17;
                        objM87133R3 = c28655q.m87133R();
                        if (z19) {
                            objM87133R3 = new C0167g(13, function1, state);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C0167g(13, function1, state);
                            c28655q.m87172p0(objM87133R3);
                        }
                        c27246d2.Compose(modifierM3388j2, c27256hM82144b2, (Function1) objM87133R3, c28655q, (C27256h.f109055z << 3) | 6 | (C27246d.f109048a << 9));
                        c28655q.m87173q(z15);
                    }
                    AbstractC25012a.m73392y(c28655q, true, true, z15);
                }
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                C0209i c0209i6 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3406c(0.1f, c2314t2));
                zM87153g = c28655q.m87153g(m5931e(interfaceC28601c1));
                objM87133R = c28655q.m87133R();
                if (zM87153g) {
                    bitmapM5931e = m5931e(interfaceC28601c1);
                    if (bitmapM5931e != null) {
                        bitmapPainter = new BitmapPainter(new C17885g(bitmapM5931e));
                    } else {
                        bitmapPainter = null;
                    }
                    c28655q.m87172p0(bitmapPainter);
                    objM87133R = bitmapPainter;
                } else {
                    bitmapM5931e = m5931e(interfaceC28601c1);
                    if (bitmapM5931e != null) {
                        bitmapPainter = new BitmapPainter(new C17885g(bitmapM5931e));
                    } else {
                        bitmapPainter = null;
                    }
                    c28655q.m87172p0(bitmapPainter);
                    objM87133R = bitmapPainter;
                }
                bitmapPainter2 = (BitmapPainter) objM87133R;
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
                i15 = i14;
                if (1.0f > 0.0d) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM31988g2 = AbstractC11895b.m31988g(modifierM3409f2, true, 1.0f);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM31988g2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N4);
                if (bitmapPainter2 == null) {
                    c28655q.m87150e0(-2032831569);
                    c28655q.m87173q(false);
                    c0209i = c0209i3;
                    c2314t = c2314t2;
                    f14 = f15;
                    c28676v0 = c28676v2;
                    z15 = false;
                    z14 = true;
                } else {
                    c28655q.m87150e0(-2032831568);
                    f14 = f15;
                    c0209i = c0209i3;
                    c28676v0 = c28676v2;
                    z14 = true;
                    c2314t = c2314t2;
                    z15 = false;
                    AbstractC29125c.m88522c(bitmapPainter2, null, AbstractC1102d.m3407d(1.0f, c2314t2), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
                    c28655q.m87173q(false);
                }
                AbstractC18489d0.m53356B(c28655q, z14, c2314t, f13, c28655q);
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, 4 * f14, 7);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), C2299e.f9111N, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N5);
                TextResource textResourceM5924g2 = c1932c.getShareButtonText();
                i16 = i15 & 896;
                if (i16 == 256) {
                    z16 = z14;
                } else {
                    z16 = z15;
                }
                zM87153g2 = c28655q.m87153g(strM21274h) | z16;
                objM87133R2 = c28655q.m87133R();
                if (zM87153g2) {
                    c28676v1 = c28676v0;
                    if (objM87133R2 == c28676v1) {
                    }
                    C28676v0 c28676v5 = c28676v1;
                    function1 = onViewEvent;
                    AbstractC27292z.m82343j(null, false, false, null, null, null, textResourceM5924g2, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q, i17 << 18, 0, 8127);
                    c28655q = c28655q;
                    c27256hM5923f = c1932c.getSecondaryButton();
                    if (c27256hM5923f == null) {
                        c28655q.m87150e0(-445192799);
                        c28655q.m87173q(z15);
                        state = c1932c;
                    } else {
                        c28655q.m87150e0(-445192798);
                        C27246d c27246d3 = new C27246d();
                        Modifier modifierM3388j3 = AbstractC1099a.m3388j(c2314t, EnumC22935a1.f90538x);
                        C27256h c27256hM82144b3 = C27256h.m82144b(c27256hM5923f, null, null, null, null, null, null, null, null, null, null, EnumC27254g.STANDARD, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33553407, null);
                        if (i16 == 256) {
                            z17 = true;
                        } else {
                            z17 = z15;
                        }
                        if (i18 != 4) {
                            if ((i15 & 8) != 0) {
                                state = c1932c;
                                if (c28655q.m87157i(state)) {
                                }
                                z19 = z18 | z17;
                                objM87133R3 = c28655q.m87133R();
                                if (z19) {
                                    objM87133R3 = new C0167g(13, function1, state);
                                    c28655q.m87172p0(objM87133R3);
                                } else {
                                    objM87133R3 = new C0167g(13, function1, state);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                c27246d3.Compose(modifierM3388j3, c27256hM82144b3, (Function1) objM87133R3, c28655q, (C27256h.f109055z << 3) | 6 | (C27246d.f109048a << 9));
                                c28655q.m87173q(z15);
                            } else {
                                state = c1932c;
                            }
                            z18 = z15;
                            z19 = z18 | z17;
                            objM87133R3 = c28655q.m87133R();
                            if (z19) {
                                objM87133R3 = new C0167g(13, function1, state);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C0167g(13, function1, state);
                                c28655q.m87172p0(objM87133R3);
                            }
                            c27246d3.Compose(modifierM3388j3, c27256hM82144b3, (Function1) objM87133R3, c28655q, (C27256h.f109055z << 3) | 6 | (C27246d.f109048a << 9));
                            c28655q.m87173q(z15);
                        } else {
                            state = c1932c;
                        }
                        z18 = true;
                        z19 = z18 | z17;
                        objM87133R3 = c28655q.m87133R();
                        if (z19) {
                            objM87133R3 = new C0167g(13, function1, state);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C0167g(13, function1, state);
                            c28655q.m87172p0(objM87133R3);
                        }
                        c27246d3.Compose(modifierM3388j3, c27256hM82144b3, (Function1) objM87133R3, c28655q, (C27256h.f109055z << 3) | 6 | (C27246d.f109048a << 9));
                        c28655q.m87173q(z15);
                    }
                    AbstractC25012a.m73392y(c28655q, true, true, z15);
                } else {
                    c28676v1 = c28676v0;
                }
                objM87133R2 = new C1934e(onViewEvent, strM21274h, interfaceC28601c1);
                c28655q.m87172p0(objM87133R2);
                C28676v0 c28676v6 = c28676v1;
                function1 = onViewEvent;
                AbstractC27292z.m82343j(null, false, false, null, null, null, textResourceM5924g2, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q, i17 << 18, 0, 8127);
                c28655q = c28655q;
                c27256hM5923f = c1932c.getSecondaryButton();
                if (c27256hM5923f == null) {
                    c28655q.m87150e0(-445192799);
                    c28655q.m87173q(z15);
                    state = c1932c;
                } else {
                    c28655q.m87150e0(-445192798);
                    C27246d c27246d4 = new C27246d();
                    Modifier modifierM3388j4 = AbstractC1099a.m3388j(c2314t, EnumC22935a1.f90538x);
                    C27256h c27256hM82144b4 = C27256h.m82144b(c27256hM5923f, null, null, null, null, null, null, null, null, null, null, EnumC27254g.STANDARD, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33553407, null);
                    if (i16 == 256) {
                        z17 = true;
                    } else {
                        z17 = z15;
                    }
                    if (i18 != 4) {
                        if ((i15 & 8) != 0) {
                            state = c1932c;
                            if (c28655q.m87157i(state)) {
                            }
                            z19 = z18 | z17;
                            objM87133R3 = c28655q.m87133R();
                            if (z19) {
                                objM87133R3 = new C0167g(13, function1, state);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C0167g(13, function1, state);
                                c28655q.m87172p0(objM87133R3);
                            }
                            c27246d4.Compose(modifierM3388j4, c27256hM82144b4, (Function1) objM87133R3, c28655q, (C27256h.f109055z << 3) | 6 | (C27246d.f109048a << 9));
                            c28655q.m87173q(z15);
                        } else {
                            state = c1932c;
                        }
                        z18 = z15;
                        z19 = z18 | z17;
                        objM87133R3 = c28655q.m87133R();
                        if (z19) {
                            objM87133R3 = new C0167g(13, function1, state);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C0167g(13, function1, state);
                            c28655q.m87172p0(objM87133R3);
                        }
                        c27246d4.Compose(modifierM3388j4, c27256hM82144b4, (Function1) objM87133R3, c28655q, (C27256h.f109055z << 3) | 6 | (C27246d.f109048a << 9));
                        c28655q.m87173q(z15);
                    } else {
                        state = c1932c;
                    }
                    z18 = true;
                    z19 = z18 | z17;
                    objM87133R3 = c28655q.m87133R();
                    if (z19) {
                        objM87133R3 = new C0167g(13, function1, state);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C0167g(13, function1, state);
                        c28655q.m87172p0(objM87133R3);
                    }
                    c27246d4.Compose(modifierM3388j4, c27256hM82144b4, (Function1) objM87133R3, c28655q, (C27256h.f109055z << 3) | 6 | (C27246d.f109048a << 9));
                    c28655q.m87173q(z15);
                }
                AbstractC25012a.m73392y(c28655q, true, true, z15);
            } else {
                function1 = onViewEvent;
                c28655q.m87150e0(-560139603);
                c28655q.m87173q(false);
            }
        } else {
            function1 = onViewEvent;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1935f(state, z4, function1, i13, 0);
        }
    }

    /* JADX INFO: renamed from: e */
    private static final Bitmap m5931e(InterfaceC28601c1 interfaceC28601c1) {
        return (Bitmap) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final void m5932f(InterfaceC28601c1 interfaceC28601c1, Bitmap bitmap) {
        interfaceC28601c1.setValue(bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m5933g(Function1 function1, String str, InterfaceC28601c1 interfaceC28601c1) {
        function1.invoke(new AbstractC31752t0.f(str, m5931e(interfaceC28601c1)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m5934h(Function1 function1, C1932c c1932c, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC31752t0.c(c1932c.getSecondaryButton().getDestination()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m5935i(C1932c c1932c, boolean z4, Function1 function1, int i13, Composer composer, int i14) {
        m5930d(c1932c, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
