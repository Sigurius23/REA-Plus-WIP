package gb1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import l83.C23454a0;
import p077d0.AbstractC11348f;
import p077d0.C11344e;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.InterfaceC22131e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: gb1.y */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\t\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0019\u001a\u00020\u0018*\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "Li2/x;", "color", "Ly3/f;", "diameter", "", "centerAlpha", "", "pulse", "f", "(Landroidx/compose/ui/Modifier;Li2/x;FFZLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "active", "Ld0/e;", "Ld0/n;", "i", "(ZLandroidx/compose/runtime/Composer;I)Ld0/e;", "fraction", "e", "(F)F", "d", "(FF)F", "Lk2/e;", "radius", "alpha", "Ll83/a0;", "c", "(Lk2/e;JFF)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15697y {

    /* JADX INFO: renamed from: gb1.y$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.modifier.RadialGlowKt$rememberGlowPulse$1$1", m100430f = "RadialGlow.kt", m100431l = {51, 52}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f58935w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f58936x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C11344e f58937y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z4, C11344e c11344e, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f58936x = z4;
            this.f58937y = c11344e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f58936x, this.f58937y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
        
            if (p077d0.C11344e.m30547d(r4, r5, r6, null, r10, 12) == r0) goto L17;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r10.f58935w
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L1c
                if (r1 == r2) goto L18
                if (r1 != r3) goto L10
                p505ts.AbstractC34132o.m107864I(r11)
                goto L5c
            L10:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L18:
                p505ts.AbstractC34132o.m107864I(r11)
                goto L34
            L1c:
                p505ts.AbstractC34132o.m107864I(r11)
                boolean r11 = r10.f58936x
                if (r11 == 0) goto L5c
                d0.e r11 = r10.f58937y
                java.lang.Float r1 = new java.lang.Float
                r4 = 0
                r1.<init>(r4)
                r10.f58935w = r2
                java.lang.Object r11 = r11.m30551g(r1, r10)
                if (r11 != r0) goto L34
                goto L5b
            L34:
                d0.e r4 = r10.f58937y
                java.lang.Float r5 = new java.lang.Float
                r11 = 1065353216(0x3f800000, float:1.0)
                r5.<init>(r11)
                r11 = 1500(0x5dc, float:2.102E-42)
                d0.v r1 = p077d0.AbstractC11329a0.f36292a
                r2 = 0
                d0.e2 r11 = p077d0.AbstractC11348f.m30574v(r11, r2, r1, r3)
                d0.v0 r1 = p077d0.EnumC11408v0.f36578x
                long r6 = (long) r2
                r7 = r6
                d0.w0 r6 = new d0.w0
                r6.<init>(r11, r1, r7)
                r10.f58935w = r3
                r7 = 0
                r9 = 12
                r8 = r10
                java.lang.Object r11 = p077d0.C11344e.m30547d(r4, r5, r6, r7, r8, r9)
                if (r11 != r0) goto L5c
            L5b:
                return r0
            L5c:
                l83.a0 r11 = l83.C23454a0.f92919a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: gb1.AbstractC15697y.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: c */
    private static final void m44170c(InterfaceC22131e interfaceC22131e, long j7, float f13, float f14) {
        InterfaceC22131e.m63375G(interfaceC22131e, C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(f14, j7)), new C17919x(C17919x.f69636m)), interfaceC22131e.mo721B0(), f13, 8), f13, interfaceC22131e.mo721B0(), 0.0f, null, 120);
    }

    /* JADX INFO: renamed from: d */
    public static final float m44171d(float f13, float f14) {
        return AbstractC12889b.m36249O(0.5f, 1.0f, f13) * f14;
    }

    /* JADX INFO: renamed from: e */
    public static final float m44172e(float f13) {
        return AbstractC12889b.m36249O(0.85f, 1.15f, f13);
    }

    /* JADX INFO: renamed from: f */
    public static final Modifier m44173f(Modifier radialGlow, C17919x c17919x, float f13, float f14, boolean z4, Composer composer, int i13, int i14) {
        AbstractC22676k.m65750j(radialGlow, "$this$radialGlow");
        if ((i14 & 4) != 0) {
            f14 = 0.5f;
        }
        if ((i14 & 8) != 0) {
            z4 = false;
        }
        boolean z13 = true;
        C11344e c11344eM44176i = m44176i(c17919x != null && z4, composer, 0);
        if (c17919x == null) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(1183705926);
            c28655q.m87173q(false);
            return radialGlow;
        }
        C28676v0 c28676v0 = C28635l.f115821a;
        if (z4) {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(1183710386);
            boolean zM87157i = c28655q2.m87157i(c11344eM44176i) | ((((i13 & 112) ^ 48) > 32 && c28655q2.m87153g(c17919x)) || (i13 & 48) == 32) | ((((i13 & 896) ^ 384) > 256 && c28655q2.m87147d(f13)) || (i13 & 384) == 256);
            if ((((i13 & 7168) ^ 3072) <= 2048 || !c28655q2.m87147d(f14)) && (i13 & 3072) != 2048) {
                z13 = false;
            }
            boolean z14 = zM87157i | z13;
            Object objM87133R = c28655q2.m87133R();
            if (z14 || objM87133R == c28676v0) {
                objM87133R = new C15694v(c11344eM44176i, c17919x, f13, f14);
                c28655q2.m87172p0(objM87133R);
            }
            Modifier modifierM3478a = AbstractC1125a.m3478a(radialGlow, (Function1) objM87133R);
            c28655q2.m87173q(false);
            return modifierM3478a;
        }
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87150e0(1183706749);
        boolean z15 = ((((i13 & 112) ^ 48) > 32 && c28655q3.m87153g(c17919x)) || (i13 & 48) == 32) | ((((i13 & 896) ^ 384) > 256 && c28655q3.m87147d(f13)) || (i13 & 384) == 256);
        if ((((i13 & 7168) ^ 3072) <= 2048 || !c28655q3.m87147d(f14)) && (i13 & 3072) != 2048) {
            z13 = false;
        }
        boolean z16 = z15 | z13;
        Object objM87133R2 = c28655q3.m87133R();
        if (z16 || objM87133R2 == c28676v0) {
            objM87133R2 = new C15696x(f13, f14, 0, c17919x);
            c28655q3.m87172p0(objM87133R2);
        }
        Modifier modifierM3478a2 = AbstractC1125a.m3478a(radialGlow, (Function1) objM87133R2);
        c28655q3.m87173q(false);
        return modifierM3478a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m44174g(C17919x c17919x, float f13, float f14, InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        m44170c(drawBehind, c17919x.f69639a, drawBehind.mo743q0(f13) / 2.0f, f14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m44175h(C11344e c11344e, C17919x c17919x, float f13, float f14, InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        float fFloatValue = ((Number) c11344e.m30549e()).floatValue();
        m44170c(drawBehind, c17919x.f69639a, m44172e(fFloatValue) * (drawBehind.mo743q0(f13) / 2.0f), m44171d(fFloatValue, f14));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    public static final C11344e m44176i(boolean z4, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = AbstractC11348f.m30553a(0.0f);
            c28655q.m87172p0(objM87133R);
        }
        C11344e c11344e = (C11344e) objM87133R;
        Boolean boolValueOf = Boolean.valueOf(z4);
        boolean zM87157i = ((((i13 & 14) ^ 6) > 4 && c28655q.m87155h(z4)) || (i13 & 6) == 4) | c28655q.m87157i(c11344e);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i || objM87133R2 == c28676v0) {
            objM87133R2 = new a(z4, c11344e, null);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, boolValueOf);
        return c11344e;
    }
}
