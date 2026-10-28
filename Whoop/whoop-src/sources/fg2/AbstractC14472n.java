package fg2;

import ai1.C0910b;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.p018ui.graphics.painter.BitmapPainter;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c51.C4231h;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d42.C11699o;
import eg2.AbstractC13172e;
import eg2.EnumC13178k;
import ep1.C13421p;
import f01.C13849c0;
import f41.C14068f;
import gb1.AbstractC15673b0;
import gz0.EnumC16313m0;
import j93.AbstractC21478l0;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27271o0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p133f1.C13998z1;
import p134f2.C14015d;
import p134f2.C14018g;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17897m;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17885g;
import p208i2.C17891j;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.C23016z;
import p319m4.AbstractC25012a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import vf2.AbstractC35949a;
import vf2.AbstractC35950b;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: fg2.n */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "isFetchingDestinationPhoneNumber", "isPhoneNumberError", "Lkotlin/Function0;", "Ll83/a0;", "onNext", "onTermsOfService", "n", "(Landroidx/compose/ui/Modifier;ZZLc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "i", "(Landroidx/compose/runtime/Composer;I)V", "Ly3/f;", "a", "F", "BENEFITS_CARD_TAIL_HEIGHT", "sms_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14472n {

    /* JADX INFO: renamed from: a */
    private static final float f52823a = 8;

    /* JADX INFO: renamed from: i */
    private static final void m41304i(Composer composer, int i13) throws Throwable {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-461000825);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            long jM125370W0 = c38072d.m121949b(c28655q, i14).getWhite10();
            long jM125368V0 = c38072d.m121949b(c28655q, i14).getTransparent();
            List listM118959K = AbstractC37056f.m118959K(Integer.valueOf(AbstractC35950b.f153102v), Integer.valueOf(AbstractC35950b.f153103w), Integer.valueOf(AbstractC35950b.f153104x), Integer.valueOf(AbstractC35950b.f153105y));
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierMo3400a = C1100b.f4583a.mo3400a(c2314t, C2299e.f9115x);
            float f13 = 4;
            float f14 = f52823a;
            Modifier modifierM3421r = AbstractC1102d.m3421r(modifierMo3400a, f13 * f13, f14);
            boolean zM87151f = c28655q.m87151f(jM125370W0);
            Object objM87133R = c28655q.m87133R();
            float f15 = f13;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87151f || objM87133R == c28676v0) {
                objM87133R = new C0910b(jM125370W0, 14);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC21478l0.m60421a(modifierM3421r, (Function1) objM87133R, c28655q, 0);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13));
            float f16 = 6 * f15;
            Throwable th3 = null;
            Modifier modifierM3357b = AbstractC1092a.m3357b(AbstractC37056f.m118994r(modifierM3409f2, AbstractC33253j.m105491g(f16, f16, 0.0f, 0.0f, 12)), C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(jM125370W0), new C17919x(jM125368V0)), 0.0f, 0.0f, 14), null, 0.0f, 6);
            float f17 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 2.5d) * f17, modifierM3357b);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            c28655q.m87150e0(867180392);
            Iterator it = listM118959K.iterator();
            int i15 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i16 = i15 + 1;
                if (i15 < 0) {
                    Throwable th4 = th3;
                    AbstractC37056f.m118977d0();
                    throw th4;
                }
                int iIntValue = ((Number) next).intValue();
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                int iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                C0209i c0209i5 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                Modifier modifierM3488c = AbstractC1127a.m3488c(AbstractC1102d.m3419p(5 * f15, c2314t), 0.0f, 0.0f, 0.99f, 0.0f, 0.0f, 0.0f, null, null, 0, 524283);
                Object objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C14068f(20);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM3479b = AbstractC1125a.m3479b(modifierM3488c, (Function1) objM87133R2);
                C27430e c27430eM107874S = AbstractC34132o.m107874S(EnumC16313m0.AI_SPARKLE.toWhoopIcon(), c28655q, 6);
                C38072d c38072d2 = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                C28676v0 c28676v1 = c28676v0;
                int i18 = i15;
                AbstractC15005f3.m43108b(c27430eM107874S, null, modifierM3479b, c38072d2.m121949b(c28655q, i17).getBrandWhite(), c28655q, 48, 0);
                Throwable th5 = th3;
                float f18 = f17;
                C2314t c2314t2 = c2314t;
                C28655q c28655q2 = c28655q;
                float f19 = f15;
                Iterator it3 = it;
                AbstractC30795n.m94707h(AbstractC8693b.m21273g(iIntValue, c28655q, 0), AbstractC1099a.m3398t(c2314t, ((float) 1.5d) * f17, 0.0f, 0.0f, 0.0f, 14), c38072d2.m121949b(c28655q, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i17).getB1(), null, c28655q2, 48, C2886a.f11498d << 18, 196600);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                if (i18 < AbstractC37056f.m118951C(listM118959K)) {
                    c28655q.m87150e0(710437312);
                    float f24 = 2 * f18;
                    c2314t = c2314t2;
                    AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1102d.m3411h(1, AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(c2314t, f18 * f19, f24, 0.0f, f24, 4))), c38072d2.m121949b(c28655q, i17).getWhite10(), AbstractC17918w0.f69621a), c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c2314t = c2314t2;
                    c28655q.m87150e0(710782311);
                    c28655q.m87173q(false);
                }
                it = it3;
                i15 = i16;
                f17 = f18;
                th3 = th5;
                f15 = f19;
                c28676v0 = c28676v1;
            }
            AbstractC25012a.m73392y(c28655q, false, true, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13849c0((byte) 0, i13, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m41305j(long j7, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        C17891j c17891jM51478a = AbstractC17897m.m51478a();
        c17891jM51478a.m51462i(Float.intBitsToFloat((int) (Canvas.mo731d() >> 32)) / 2, 0.0f);
        c17891jM51478a.m51461h(0.0f, Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L)));
        c17891jM51478a.m51461h(Float.intBitsToFloat((int) (Canvas.mo731d() >> 32)), Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L)));
        c17891jM51478a.m51459f();
        InterfaceC22131e.m63386z(Canvas, c17891jM51478a, j7, 0.0f, null, 60);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C14018g m41306k(C14015d drawWithCache) {
        AbstractC22676k.m65750j(drawWithCache, "$this$drawWithCache");
        return drawWithCache.m39910a(new C4231h(AbstractC15673b0.m43972A(), 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m41307l(AbstractC17911t abstractC17911t, InterfaceC22129c onDrawWithContent) {
        AbstractC22676k.m65750j(onDrawWithContent, "$this$onDrawWithContent");
        ((C0238p0) onDrawWithContent).m728a();
        InterfaceC22131e.m63385u(onDrawWithContent, abstractC17911t, 0L, 0L, 0.0f, null, 9, 62);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m41308m(int i13, Composer composer, int i14) throws Throwable {
        m41304i(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:105:0x0203  */
    /* JADX WARN: Code duplicated, block: B:106:0x0207  */
    /* JADX WARN: Code duplicated, block: B:109:0x0214  */
    /* JADX WARN: Code duplicated, block: B:111:0x0222  */
    /* JADX WARN: Code duplicated, block: B:114:0x0312  */
    /* JADX WARN: Code duplicated, block: B:115:0x0314  */
    /* JADX WARN: Code duplicated, block: B:118:0x031b  */
    /* JADX WARN: Code duplicated, block: B:120:0x031f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0439  */
    /* JADX WARN: Code duplicated, block: B:124:0x043d  */
    /* JADX WARN: Code duplicated, block: B:127:0x044a  */
    /* JADX WARN: Code duplicated, block: B:129:0x0458  */
    /* JADX WARN: Code duplicated, block: B:134:0x0492  */
    /* JADX WARN: Code duplicated, block: B:137:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00be  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:87:0x0100  */
    /* JADX WARN: Code duplicated, block: B:90:0x0123 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x0125  */
    /* JADX WARN: Code duplicated, block: B:94:0x018e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0192  */
    /* JADX WARN: Code duplicated, block: B:98:0x01a5  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: n */
    public static final void m41309n(Modifier modifier, boolean z4, boolean z13, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Composer composer, int i13, int i14) throws Throwable {
        Modifier modifier2;
        int i15;
        boolean z14;
        int i16;
        boolean z15;
        int i17;
        int i18;
        InterfaceC4339a interfaceC4339a3;
        int i19;
        int i24;
        InterfaceC4339a interfaceC4339a4;
        int i25;
        boolean z16;
        Modifier modifier3;
        boolean z17;
        boolean z18;
        InterfaceC4339a interfaceC4339a5;
        InterfaceC4339a interfaceC4339a6;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        boolean z19;
        boolean z24;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a7;
        InterfaceC4339a interfaceC4339a8;
        int i26;
        Resources resources;
        Object objM87133R;
        boolean zM87153g;
        Object objM87133R2;
        InterfaceC4339a interfaceC4339a9;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z25;
        int i27;
        int iHashCode2;
        boolean z26;
        Object objM87133R3;
        int iHashCode3;
        Object objM87133R4;
        Object objM87133R5;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(508391257);
        int i28 = i14 & 1;
        if (i28 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        int i29 = i14 & 2;
        if (i29 == 0) {
            if ((i13 & 48) == 0) {
                z14 = z4;
                i15 |= c28655q.m87155h(z14) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    z15 = z13;
                    if (c28655q.m87155h(z15)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        interfaceC4339a3 = interfaceC4339a;
                        if (c28655q.m87157i(interfaceC4339a3)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 16;
                    if (i24 != 0) {
                        if ((i13 & 24576) == 0) {
                            interfaceC4339a4 = interfaceC4339a2;
                            if (c28655q.m87157i(interfaceC4339a4)) {
                                i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                            } else {
                                i25 = DfuBaseService.ERROR_REMOTE_MASK;
                            }
                            i15 |= i25;
                        }
                        if ((i15 & 9363) != 9362) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (c28655q.m87135U(i15 & 1, z16)) {
                            c2314t = C2314t.f9131w;
                            if (i28 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i29 != 0) {
                                z19 = false;
                            } else {
                                z19 = z14;
                            }
                            if (i16 != 0) {
                                z24 = false;
                            } else {
                                z24 = z15;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i18 != 0) {
                                objM87133R5 = c28655q.m87133R();
                                if (objM87133R5 == c28676v0) {
                                    objM87133R5 = new C13998z1(20);
                                    c28655q.m87172p0(objM87133R5);
                                }
                                interfaceC4339a7 = (InterfaceC4339a) objM87133R5;
                            } else {
                                interfaceC4339a7 = interfaceC4339a3;
                            }
                            if (i24 != 0) {
                                objM87133R4 = c28655q.m87133R();
                                if (objM87133R4 == c28676v0) {
                                    objM87133R4 = new C13998z1(21);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                interfaceC4339a8 = (InterfaceC4339a) objM87133R4;
                            } else {
                                interfaceC4339a8 = interfaceC4339a4;
                            }
                            i26 = AbstractC35949a.f153053b;
                            resources = (Resources) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4977c);
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new TypedValue();
                                c28655q.m87172p0(objM87133R);
                            }
                            TypedValue typedValue = (TypedValue) objM87133R;
                            resources.getValue(i26, typedValue, true);
                            CharSequence charSequence = typedValue.string;
                            AbstractC22676k.m65747g(charSequence);
                            zM87153g = c28655q.m87153g(charSequence.toString());
                            objM87133R2 = c28655q.m87133R();
                            if (zM87153g || objM87133R2 == c28676v0) {
                                Drawable drawable = resources.getDrawable(i26, null);
                                AbstractC22676k.m65748h(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                                objM87133R2 = new C17885g(((BitmapDrawable) drawable).getBitmap());
                                c28655q.m87172p0(objM87133R2);
                            }
                            C17885g c17885g = (C17885g) objM87133R2;
                            BitmapPainter bitmapPainter = new BitmapPainter(c17885g, (((long) Math.min(c17885g.f69577a.getHeight(), 140)) & 4294967295L) | (((long) c17885g.f69577a.getWidth()) << 32));
                            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, modifier2);
                            C2307m c2307m = C2299e.f9114w;
                            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                            interfaceC4339a9 = interfaceC4339a8;
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
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
                            c0209i = C0217k.f732j;
                            if (c28655q.f115903S) {
                                z25 = z19;
                            } else {
                                z25 = z19;
                                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                                }
                                C0209i c0209i4 = C0217k.f726d;
                                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                                Modifier modifier4 = modifier2;
                                float f13 = 8;
                                float f14 = 2 * f13;
                                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14), f14, 0.0f, 2);
                                i27 = i15;
                                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                                boolean z27 = z24;
                                iHashCode2 = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                                AbstractC29125c.m88522c(bitmapPainter, null, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 2), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
                                m41304i(c28655q, 0);
                                float f15 = 4;
                                float f16 = f15 * f13;
                                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, f16, 0.0f, 0.0f, 13);
                                String strM21273g = AbstractC8693b.m21273g(AbstractC35950b.f153062G, c28655q, 0);
                                C38072d c38072d = C38072d.f163053a;
                                int i34 = C38072d.f163054b;
                                C2886a c2886aM8418P = c38072d.m121952e(c28655q, i34).getT3();
                                long jM125430y = c38072d.m121949b(c28655q, i34).getBrandWhite();
                                int i35 = C2886a.f11498d;
                                AbstractC30795n.m94707h(strM21273g, modifierM3398t, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P, null, c28655q, 48, i35 << 18, 196600);
                                C2886a c2886aM8430k = c38072d.m121952e(c28655q, i34).getBtS();
                                C22976l1 c22976l1M3379a = AbstractC1099a.m3379a(0, 0.0f, 2);
                                TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC35950b.f153060E);
                                Integer numValueOf = Integer.valueOf(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward());
                                if ((i27 & 57344) == 16384) {
                                    z26 = true;
                                } else {
                                    z26 = false;
                                }
                                objM87133R3 = c28655q.m87133R();
                                if (z26 || objM87133R3 == c28676v0) {
                                    objM87133R3 = new C11699o(interfaceC4339a9, 24);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                AbstractC27271o0.m82253b(c2314t, false, c8688bM21277k, c2886aM8430k, null, null, numValueOf, null, false, c22976l1M3379a, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.C8688b.f25889c << 6) | 906166278 | (i35 << 9), 0, 146);
                                AbstractC1090b.m3350e(C23016z.f90757a, z27, AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13), null, null, null, C14462d.f52794a.m41219b(), c28655q, 1573254 | ((i27 >> 3) & 112), 28);
                                AbstractC25012a.m73388u(35, f15, c2314t, c28655q, true);
                                WeakHashMap weakHashMap = C22944c2.f90553v;
                                float fMo43109a = AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a();
                                Modifier modifierM3419p = AbstractC1102d.m3419p(400, c2314t);
                                C2307m c2307m2 = C2299e.f9106I;
                                C1100b c1100b = C1100b.f4583a;
                                AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1099a.m3392n(c1100b.mo3400a(modifierM3419p, c2307m2), 0.0f, fMo43109a, 1), C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4287324927L))), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 900.0f, 8), null, 0.0f, 6), c28655q, 0);
                                Modifier modifierM3394p = AbstractC1099a.m3394p(f16, c1100b.mo3400a(c2314t, C2299e.f9105H));
                                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                                iHashCode3 = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d2);
                                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                                int i36 = i27 << 3;
                                interfaceC4339a3 = interfaceC4339a7;
                                boolean z28 = z25;
                                AbstractC13172e.m36939k(EnumC13178k.INTRO_V2, false, z28, false, interfaceC4339a3, c28655q, (i36 & 896) | 6 | (i36 & 57344), 10);
                                c28655q = c28655q;
                                c28655q.m87173q(true);
                                c28655q.m87173q(true);
                                interfaceC4339a5 = interfaceC4339a9;
                                z17 = z28;
                                modifier3 = modifier4;
                                z18 = z27;
                            }
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            C0209i c0209i5 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                            Modifier modifier5 = modifier2;
                            float f17 = 8;
                            float f18 = 2 * f17;
                            Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14), f18, 0.0f, 2);
                            i27 = i15;
                            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                            boolean z29 = z24;
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N4);
                            AbstractC29125c.m88522c(bitmapPainter, null, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f18, 0.0f, 2), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
                            m41304i(c28655q, 0);
                            float f19 = 4;
                            float f110 = f19 * f17;
                            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, f110, 0.0f, 0.0f, 13);
                            String strM21273g2 = AbstractC8693b.m21273g(AbstractC35950b.f153062G, c28655q, 0);
                            C38072d c38072d2 = C38072d.f163053a;
                            int i37 = C38072d.f163054b;
                            C2886a c2886aM8418P2 = c38072d2.m121952e(c28655q, i37).getT3();
                            long jM125430y2 = c38072d2.m121949b(c28655q, i37).getBrandWhite();
                            int i38 = C2886a.f11498d;
                            AbstractC30795n.m94707h(strM21273g2, modifierM3398t2, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P2, null, c28655q, 48, i38 << 18, 196600);
                            C2886a c2886aM8430k2 = c38072d2.m121952e(c28655q, i37).getBtS();
                            C22976l1 c22976l1M3379a2 = AbstractC1099a.m3379a(0, 0.0f, 2);
                            TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC35950b.f153060E);
                            Integer numValueOf2 = Integer.valueOf(c38072d2.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward());
                            if ((i27 & 57344) == 16384) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            objM87133R3 = c28655q.m87133R();
                            if (z26) {
                                objM87133R3 = new C11699o(interfaceC4339a9, 24);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C11699o(interfaceC4339a9, 24);
                                c28655q.m87172p0(objM87133R3);
                            }
                            AbstractC27271o0.m82253b(c2314t, false, c8688bM21277k2, c2886aM8430k2, null, null, numValueOf2, null, false, c22976l1M3379a2, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.C8688b.f25889c << 6) | 906166278 | (i38 << 9), 0, 146);
                            AbstractC1090b.m3350e(C23016z.f90757a, z29, AbstractC1099a.m3398t(c2314t, 0.0f, f18, 0.0f, 0.0f, 13), null, null, null, C14462d.f52794a.m41219b(), c28655q, 1573254 | ((i27 >> 3) & 112), 28);
                            AbstractC25012a.m73388u(35, f19, c2314t, c28655q, true);
                            WeakHashMap weakHashMap2 = C22944c2.f90553v;
                            float fMo43109a2 = AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a();
                            Modifier modifierM3419p2 = AbstractC1102d.m3419p(400, c2314t);
                            C2307m c2307m3 = C2299e.f9106I;
                            C1100b c1100b2 = C1100b.f4583a;
                            AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1099a.m3392n(c1100b2.mo3400a(modifierM3419p2, c2307m3), 0.0f, fMo43109a2, 1), C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4287324927L))), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 900.0f, 8), null, 0.0f, 6), c28655q, 0);
                            Modifier modifierM3394p2 = AbstractC1099a.m3394p(f110, c1100b2.mo3400a(c2314t, C2299e.f9105H));
                            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
                            iHashCode3 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d3);
                            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m5);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N5);
                            int i39 = i27 << 3;
                            interfaceC4339a3 = interfaceC4339a7;
                            boolean z210 = z25;
                            AbstractC13172e.m36939k(EnumC13178k.INTRO_V2, false, z210, false, interfaceC4339a3, c28655q, (i39 & 896) | 6 | (i39 & 57344), 10);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(true);
                            interfaceC4339a5 = interfaceC4339a9;
                            z17 = z210;
                            modifier3 = modifier5;
                            z18 = z29;
                        } else {
                            c28655q.m87138X();
                            modifier3 = modifier2;
                            z17 = z14;
                            z18 = z15;
                            interfaceC4339a5 = interfaceC4339a4;
                        }
                        interfaceC4339a6 = interfaceC4339a3;
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C13421p(modifier3, z17, z18, interfaceC4339a6, interfaceC4339a5, i13, i14, 1);
                        }
                    }
                    i15 |= 24576;
                    interfaceC4339a4 = interfaceC4339a2;
                    if ((i15 & 9363) != 9362) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z16)) {
                        c2314t = C2314t.f9131w;
                        if (i28 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i29 != 0) {
                            z19 = false;
                        } else {
                            z19 = z14;
                        }
                        if (i16 != 0) {
                            z24 = false;
                        } else {
                            z24 = z15;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i18 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C13998z1(20);
                                c28655q.m87172p0(objM87133R5);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R5;
                        } else {
                            interfaceC4339a7 = interfaceC4339a3;
                        }
                        if (i24 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C13998z1(21);
                                c28655q.m87172p0(objM87133R4);
                            }
                            interfaceC4339a8 = (InterfaceC4339a) objM87133R4;
                        } else {
                            interfaceC4339a8 = interfaceC4339a4;
                        }
                        i26 = AbstractC35949a.f153053b;
                        resources = (Resources) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4977c);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new TypedValue();
                            c28655q.m87172p0(objM87133R);
                        }
                        TypedValue typedValue2 = (TypedValue) objM87133R;
                        resources.getValue(i26, typedValue2, true);
                        CharSequence charSequence2 = typedValue2.string;
                        AbstractC22676k.m65747g(charSequence2);
                        zM87153g = c28655q.m87153g(charSequence2.toString());
                        objM87133R2 = c28655q.m87133R();
                        if (zM87153g) {
                            Drawable drawable2 = resources.getDrawable(i26, null);
                            AbstractC22676k.m65748h(drawable2, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                            objM87133R2 = new C17885g(((BitmapDrawable) drawable2).getBitmap());
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            Drawable drawable3 = resources.getDrawable(i26, null);
                            AbstractC22676k.m65748h(drawable3, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                            objM87133R2 = new C17885g(((BitmapDrawable) drawable3).getBitmap());
                            c28655q.m87172p0(objM87133R2);
                        }
                        C17885g c17885g2 = (C17885g) objM87133R2;
                        BitmapPainter bitmapPainter2 = new BitmapPainter(c17885g2, (((long) Math.min(c17885g2.f69577a.getHeight(), 140)) & 4294967295L) | (((long) c17885g2.f69577a.getWidth()) << 32));
                        Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, modifier2);
                        C2307m c2307m4 = C2299e.f9114w;
                        InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m4, false);
                        interfaceC4339a9 = interfaceC4339a8;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3407d2);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        C0209i c0209i6 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d4);
                        C0209i c0209i7 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m6);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            z25 = z19;
                            if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i8 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N6);
                            Modifier modifier6 = modifier2;
                            float f111 = 8;
                            float f112 = 2 * f111;
                            Modifier modifierM3396r3 = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14), f112, 0.0f, 2);
                            i27 = i15;
                            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                            boolean z211 = z24;
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3396r3);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a3);
                            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m7);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N7);
                            AbstractC29125c.m88522c(bitmapPainter2, null, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f112, 0.0f, 2), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
                            m41304i(c28655q, 0);
                            float f113 = 4;
                            float f114 = f113 * f111;
                            Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t, 0.0f, f114, 0.0f, 0.0f, 13);
                            String strM21273g3 = AbstractC8693b.m21273g(AbstractC35950b.f153062G, c28655q, 0);
                            C38072d c38072d3 = C38072d.f163053a;
                            int i310 = C38072d.f163054b;
                            C2886a c2886aM8418P3 = c38072d3.m121952e(c28655q, i310).getT3();
                            long jM125430y3 = c38072d3.m121949b(c28655q, i310).getBrandWhite();
                            int i311 = C2886a.f11498d;
                            AbstractC30795n.m94707h(strM21273g3, modifierM3398t3, jM125430y3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P3, null, c28655q, 48, i311 << 18, 196600);
                            C2886a c2886aM8430k3 = c38072d3.m121952e(c28655q, i310).getBtS();
                            C22976l1 c22976l1M3379a3 = AbstractC1099a.m3379a(0, 0.0f, 2);
                            TextResource.C8688b c8688bM21277k3 = AbstractC8693b.m21277k(AbstractC35950b.f153060E);
                            Integer numValueOf3 = Integer.valueOf(c38072d3.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward());
                            if ((i27 & 57344) == 16384) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            objM87133R3 = c28655q.m87133R();
                            if (z26) {
                                objM87133R3 = new C11699o(interfaceC4339a9, 24);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C11699o(interfaceC4339a9, 24);
                                c28655q.m87172p0(objM87133R3);
                            }
                            AbstractC27271o0.m82253b(c2314t, false, c8688bM21277k3, c2886aM8430k3, null, null, numValueOf3, null, false, c22976l1M3379a3, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.C8688b.f25889c << 6) | 906166278 | (i311 << 9), 0, 146);
                            AbstractC1090b.m3350e(C23016z.f90757a, z211, AbstractC1099a.m3398t(c2314t, 0.0f, f112, 0.0f, 0.0f, 13), null, null, null, C14462d.f52794a.m41219b(), c28655q, 1573254 | ((i27 >> 3) & 112), 28);
                            AbstractC25012a.m73388u(35, f113, c2314t, c28655q, true);
                            WeakHashMap weakHashMap3 = C22944c2.f90553v;
                            float fMo43109a3 = AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a();
                            Modifier modifierM3419p3 = AbstractC1102d.m3419p(400, c2314t);
                            C2307m c2307m5 = C2299e.f9106I;
                            C1100b c1100b3 = C1100b.f4583a;
                            AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1099a.m3392n(c1100b3.mo3400a(modifierM3419p3, c2307m5), 0.0f, fMo43109a3, 1), C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4287324927L))), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 900.0f, 8), null, 0.0f, 6), c28655q, 0);
                            Modifier modifierM3394p3 = AbstractC1099a.m3394p(f114, c1100b3.mo3400a(c2314t, C2299e.f9105H));
                            InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m4, false);
                            iHashCode3 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3394p3);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d5);
                            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m8);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N8);
                            int i312 = i27 << 3;
                            interfaceC4339a3 = interfaceC4339a7;
                            boolean z212 = z25;
                            AbstractC13172e.m36939k(EnumC13178k.INTRO_V2, false, z212, false, interfaceC4339a3, c28655q, (i312 & 896) | 6 | (i312 & 57344), 10);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(true);
                            interfaceC4339a5 = interfaceC4339a9;
                            z17 = z212;
                            modifier3 = modifier6;
                            z18 = z211;
                        } else {
                            z25 = z19;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        C0209i c0209i9 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
                        Modifier modifier7 = modifier2;
                        float f115 = 8;
                        float f116 = 2 * f115;
                        Modifier modifierM3396r4 = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14), f116, 0.0f, 2);
                        i27 = i15;
                        C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                        boolean z213 = z24;
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                        Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3396r4);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a4);
                        AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m9);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N9);
                        AbstractC29125c.m88522c(bitmapPainter2, null, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f116, 0.0f, 2), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
                        m41304i(c28655q, 0);
                        float f117 = 4;
                        float f118 = f117 * f115;
                        Modifier modifierM3398t4 = AbstractC1099a.m3398t(c2314t, 0.0f, f118, 0.0f, 0.0f, 13);
                        String strM21273g4 = AbstractC8693b.m21273g(AbstractC35950b.f153062G, c28655q, 0);
                        C38072d c38072d4 = C38072d.f163053a;
                        int i313 = C38072d.f163054b;
                        C2886a c2886aM8418P4 = c38072d4.m121952e(c28655q, i313).getT3();
                        long jM125430y4 = c38072d4.m121949b(c28655q, i313).getBrandWhite();
                        int i314 = C2886a.f11498d;
                        AbstractC30795n.m94707h(strM21273g4, modifierM3398t4, jM125430y4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P4, null, c28655q, 48, i314 << 18, 196600);
                        C2886a c2886aM8430k4 = c38072d4.m121952e(c28655q, i313).getBtS();
                        C22976l1 c22976l1M3379a4 = AbstractC1099a.m3379a(0, 0.0f, 2);
                        TextResource.C8688b c8688bM21277k4 = AbstractC8693b.m21277k(AbstractC35950b.f153060E);
                        Integer numValueOf4 = Integer.valueOf(c38072d4.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward());
                        if ((i27 & 57344) == 16384) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z26) {
                            objM87133R3 = new C11699o(interfaceC4339a9, 24);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C11699o(interfaceC4339a9, 24);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC27271o0.m82253b(c2314t, false, c8688bM21277k4, c2886aM8430k4, null, null, numValueOf4, null, false, c22976l1M3379a4, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.C8688b.f25889c << 6) | 906166278 | (i314 << 9), 0, 146);
                        AbstractC1090b.m3350e(C23016z.f90757a, z213, AbstractC1099a.m3398t(c2314t, 0.0f, f116, 0.0f, 0.0f, 13), null, null, null, C14462d.f52794a.m41219b(), c28655q, 1573254 | ((i27 >> 3) & 112), 28);
                        AbstractC25012a.m73388u(35, f117, c2314t, c28655q, true);
                        WeakHashMap weakHashMap4 = C22944c2.f90553v;
                        float fMo43109a4 = AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a();
                        Modifier modifierM3419p4 = AbstractC1102d.m3419p(400, c2314t);
                        C2307m c2307m6 = C2299e.f9106I;
                        C1100b c1100b4 = C1100b.f4583a;
                        AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1099a.m3392n(c1100b4.mo3400a(modifierM3419p4, c2307m6), 0.0f, fMo43109a4, 1), C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4287324927L))), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 900.0f, 8), null, 0.0f, 6), c28655q, 0);
                        Modifier modifierM3394p4 = AbstractC1099a.m3394p(f118, c1100b4.mo3400a(c2314t, C2299e.f9105H));
                        InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m4, false);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                        Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3394p4);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d6);
                        AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m10);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N10);
                        int i315 = i27 << 3;
                        interfaceC4339a3 = interfaceC4339a7;
                        boolean z214 = z25;
                        AbstractC13172e.m36939k(EnumC13178k.INTRO_V2, false, z214, false, interfaceC4339a3, c28655q, (i315 & 896) | 6 | (i315 & 57344), 10);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        interfaceC4339a5 = interfaceC4339a9;
                        z17 = z214;
                        modifier3 = modifier7;
                        z18 = z213;
                    } else {
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        z17 = z14;
                        z18 = z15;
                        interfaceC4339a5 = interfaceC4339a4;
                    }
                    interfaceC4339a6 = interfaceC4339a3;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C13421p(modifier3, z17, z18, interfaceC4339a6, interfaceC4339a5, i13, i14, 1);
                    }
                }
                i15 |= 3072;
                interfaceC4339a3 = interfaceC4339a;
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        interfaceC4339a4 = interfaceC4339a2;
                        if (c28655q.m87157i(interfaceC4339a4)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((i15 & 9363) != 9362) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z16)) {
                        c2314t = C2314t.f9131w;
                        if (i28 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i29 != 0) {
                            z19 = false;
                        } else {
                            z19 = z14;
                        }
                        if (i16 != 0) {
                            z24 = false;
                        } else {
                            z24 = z15;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i18 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C13998z1(20);
                                c28655q.m87172p0(objM87133R5);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R5;
                        } else {
                            interfaceC4339a7 = interfaceC4339a3;
                        }
                        if (i24 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C13998z1(21);
                                c28655q.m87172p0(objM87133R4);
                            }
                            interfaceC4339a8 = (InterfaceC4339a) objM87133R4;
                        } else {
                            interfaceC4339a8 = interfaceC4339a4;
                        }
                        i26 = AbstractC35949a.f153053b;
                        resources = (Resources) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4977c);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new TypedValue();
                            c28655q.m87172p0(objM87133R);
                        }
                        TypedValue typedValue3 = (TypedValue) objM87133R;
                        resources.getValue(i26, typedValue3, true);
                        CharSequence charSequence3 = typedValue3.string;
                        AbstractC22676k.m65747g(charSequence3);
                        zM87153g = c28655q.m87153g(charSequence3.toString());
                        objM87133R2 = c28655q.m87133R();
                        if (zM87153g) {
                            Drawable drawable4 = resources.getDrawable(i26, null);
                            AbstractC22676k.m65748h(drawable4, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                            objM87133R2 = new C17885g(((BitmapDrawable) drawable4).getBitmap());
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            Drawable drawable5 = resources.getDrawable(i26, null);
                            AbstractC22676k.m65748h(drawable5, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                            objM87133R2 = new C17885g(((BitmapDrawable) drawable5).getBitmap());
                            c28655q.m87172p0(objM87133R2);
                        }
                        C17885g c17885g3 = (C17885g) objM87133R2;
                        BitmapPainter bitmapPainter3 = new BitmapPainter(c17885g3, (((long) Math.min(c17885g3.f69577a.getHeight(), 140)) & 4294967295L) | (((long) c17885g3.f69577a.getWidth()) << 32));
                        Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, modifier2);
                        C2307m c2307m7 = C2299e.f9114w;
                        InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m7, false);
                        interfaceC4339a9 = interfaceC4339a8;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                        Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3407d3);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        C0209i c0209i10 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC39127r0M66763d7);
                        C0209i c0209i11 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m11);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            z25 = z19;
                            if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i12 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N11);
                            Modifier modifier8 = modifier2;
                            float f119 = 8;
                            float f1110 = 2 * f119;
                            Modifier modifierM3396r5 = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14), f1110, 0.0f, 2);
                            i27 = i15;
                            C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                            boolean z215 = z24;
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                            Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3396r5);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i10, c23010xM66775a5);
                            AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m12);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N12);
                            AbstractC29125c.m88522c(bitmapPainter3, null, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f1110, 0.0f, 2), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
                            m41304i(c28655q, 0);
                            float f1111 = 4;
                            float f1112 = f1111 * f119;
                            Modifier modifierM3398t5 = AbstractC1099a.m3398t(c2314t, 0.0f, f1112, 0.0f, 0.0f, 13);
                            String strM21273g5 = AbstractC8693b.m21273g(AbstractC35950b.f153062G, c28655q, 0);
                            C38072d c38072d5 = C38072d.f163053a;
                            int i316 = C38072d.f163054b;
                            C2886a c2886aM8418P5 = c38072d5.m121952e(c28655q, i316).getT3();
                            long jM125430y5 = c38072d5.m121949b(c28655q, i316).getBrandWhite();
                            int i317 = C2886a.f11498d;
                            AbstractC30795n.m94707h(strM21273g5, modifierM3398t5, jM125430y5, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P5, null, c28655q, 48, i317 << 18, 196600);
                            C2886a c2886aM8430k5 = c38072d5.m121952e(c28655q, i316).getBtS();
                            C22976l1 c22976l1M3379a5 = AbstractC1099a.m3379a(0, 0.0f, 2);
                            TextResource.C8688b c8688bM21277k5 = AbstractC8693b.m21277k(AbstractC35950b.f153060E);
                            Integer numValueOf5 = Integer.valueOf(c38072d5.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward());
                            if ((i27 & 57344) == 16384) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            objM87133R3 = c28655q.m87133R();
                            if (z26) {
                                objM87133R3 = new C11699o(interfaceC4339a9, 24);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C11699o(interfaceC4339a9, 24);
                                c28655q.m87172p0(objM87133R3);
                            }
                            AbstractC27271o0.m82253b(c2314t, false, c8688bM21277k5, c2886aM8430k5, null, null, numValueOf5, null, false, c22976l1M3379a5, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.C8688b.f25889c << 6) | 906166278 | (i317 << 9), 0, 146);
                            AbstractC1090b.m3350e(C23016z.f90757a, z215, AbstractC1099a.m3398t(c2314t, 0.0f, f1110, 0.0f, 0.0f, 13), null, null, null, C14462d.f52794a.m41219b(), c28655q, 1573254 | ((i27 >> 3) & 112), 28);
                            AbstractC25012a.m73388u(35, f1111, c2314t, c28655q, true);
                            WeakHashMap weakHashMap5 = C22944c2.f90553v;
                            float fMo43109a5 = AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a();
                            Modifier modifierM3419p5 = AbstractC1102d.m3419p(400, c2314t);
                            C2307m c2307m8 = C2299e.f9106I;
                            C1100b c1100b5 = C1100b.f4583a;
                            AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1099a.m3392n(c1100b5.mo3400a(modifierM3419p5, c2307m8), 0.0f, fMo43109a5, 1), C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4287324927L))), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 900.0f, 8), null, 0.0f, 6), c28655q, 0);
                            Modifier modifierM3394p5 = AbstractC1099a.m3394p(f1112, c1100b5.mo3400a(c2314t, C2299e.f9105H));
                            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m7, false);
                            iHashCode3 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                            Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierM3394p5);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC39127r0M66763d8);
                            AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m13);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N13);
                            int i318 = i27 << 3;
                            interfaceC4339a3 = interfaceC4339a7;
                            boolean z216 = z25;
                            AbstractC13172e.m36939k(EnumC13178k.INTRO_V2, false, z216, false, interfaceC4339a3, c28655q, (i318 & 896) | 6 | (i318 & 57344), 10);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(true);
                            interfaceC4339a5 = interfaceC4339a9;
                            z17 = z216;
                            modifier3 = modifier8;
                            z18 = z215;
                        } else {
                            z25 = z19;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        C0209i c0209i13 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N11);
                        Modifier modifier9 = modifier2;
                        float f1113 = 8;
                        float f1114 = 2 * f1113;
                        Modifier modifierM3396r6 = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14), f1114, 0.0f, 2);
                        i27 = i15;
                        C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                        boolean z217 = z24;
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                        Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierM3396r6);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i10, c23010xM66775a6);
                        AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m14);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N14);
                        AbstractC29125c.m88522c(bitmapPainter3, null, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f1114, 0.0f, 2), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
                        m41304i(c28655q, 0);
                        float f1115 = 4;
                        float f1116 = f1115 * f1113;
                        Modifier modifierM3398t6 = AbstractC1099a.m3398t(c2314t, 0.0f, f1116, 0.0f, 0.0f, 13);
                        String strM21273g6 = AbstractC8693b.m21273g(AbstractC35950b.f153062G, c28655q, 0);
                        C38072d c38072d6 = C38072d.f163053a;
                        int i319 = C38072d.f163054b;
                        C2886a c2886aM8418P6 = c38072d6.m121952e(c28655q, i319).getT3();
                        long jM125430y6 = c38072d6.m121949b(c28655q, i319).getBrandWhite();
                        int i3110 = C2886a.f11498d;
                        AbstractC30795n.m94707h(strM21273g6, modifierM3398t6, jM125430y6, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P6, null, c28655q, 48, i3110 << 18, 196600);
                        C2886a c2886aM8430k6 = c38072d6.m121952e(c28655q, i319).getBtS();
                        C22976l1 c22976l1M3379a6 = AbstractC1099a.m3379a(0, 0.0f, 2);
                        TextResource.C8688b c8688bM21277k6 = AbstractC8693b.m21277k(AbstractC35950b.f153060E);
                        Integer numValueOf6 = Integer.valueOf(c38072d6.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward());
                        if ((i27 & 57344) == 16384) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z26) {
                            objM87133R3 = new C11699o(interfaceC4339a9, 24);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C11699o(interfaceC4339a9, 24);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC27271o0.m82253b(c2314t, false, c8688bM21277k6, c2886aM8430k6, null, null, numValueOf6, null, false, c22976l1M3379a6, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.C8688b.f25889c << 6) | 906166278 | (i3110 << 9), 0, 146);
                        AbstractC1090b.m3350e(C23016z.f90757a, z217, AbstractC1099a.m3398t(c2314t, 0.0f, f1114, 0.0f, 0.0f, 13), null, null, null, C14462d.f52794a.m41219b(), c28655q, 1573254 | ((i27 >> 3) & 112), 28);
                        AbstractC25012a.m73388u(35, f1115, c2314t, c28655q, true);
                        WeakHashMap weakHashMap6 = C22944c2.f90553v;
                        float fMo43109a6 = AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a();
                        Modifier modifierM3419p6 = AbstractC1102d.m3419p(400, c2314t);
                        C2307m c2307m9 = C2299e.f9106I;
                        C1100b c1100b6 = C1100b.f4583a;
                        AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1099a.m3392n(c1100b6.mo3400a(modifierM3419p6, c2307m9), 0.0f, fMo43109a6, 1), C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4287324927L))), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 900.0f, 8), null, 0.0f, 6), c28655q, 0);
                        Modifier modifierM3394p6 = AbstractC1099a.m3394p(f1116, c1100b6.mo3400a(c2314t, C2299e.f9105H));
                        InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(c2307m7, false);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                        Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM3394p6);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC39127r0M66763d9);
                        AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m15);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N15);
                        int i3111 = i27 << 3;
                        interfaceC4339a3 = interfaceC4339a7;
                        boolean z218 = z25;
                        AbstractC13172e.m36939k(EnumC13178k.INTRO_V2, false, z218, false, interfaceC4339a3, c28655q, (i3111 & 896) | 6 | (i3111 & 57344), 10);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        interfaceC4339a5 = interfaceC4339a9;
                        z17 = z218;
                        modifier3 = modifier9;
                        z18 = z217;
                    } else {
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        z17 = z14;
                        z18 = z15;
                        interfaceC4339a5 = interfaceC4339a4;
                    }
                    interfaceC4339a6 = interfaceC4339a3;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C13421p(modifier3, z17, z18, interfaceC4339a6, interfaceC4339a5, i13, i14, 1);
                    }
                }
                i15 |= 24576;
                interfaceC4339a4 = interfaceC4339a2;
                if ((i15 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    c2314t = C2314t.f9131w;
                    if (i28 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i29 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    if (i16 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C13998z1(20);
                            c28655q.m87172p0(objM87133R5);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R5;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    if (i24 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C13998z1(21);
                            c28655q.m87172p0(objM87133R4);
                        }
                        interfaceC4339a8 = (InterfaceC4339a) objM87133R4;
                    } else {
                        interfaceC4339a8 = interfaceC4339a4;
                    }
                    i26 = AbstractC35949a.f153053b;
                    resources = (Resources) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4977c);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new TypedValue();
                        c28655q.m87172p0(objM87133R);
                    }
                    TypedValue typedValue4 = (TypedValue) objM87133R;
                    resources.getValue(i26, typedValue4, true);
                    CharSequence charSequence4 = typedValue4.string;
                    AbstractC22676k.m65747g(charSequence4);
                    zM87153g = c28655q.m87153g(charSequence4.toString());
                    objM87133R2 = c28655q.m87133R();
                    if (zM87153g) {
                        Drawable drawable6 = resources.getDrawable(i26, null);
                        AbstractC22676k.m65748h(drawable6, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                        objM87133R2 = new C17885g(((BitmapDrawable) drawable6).getBitmap());
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        Drawable drawable7 = resources.getDrawable(i26, null);
                        AbstractC22676k.m65748h(drawable7, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                        objM87133R2 = new C17885g(((BitmapDrawable) drawable7).getBitmap());
                        c28655q.m87172p0(objM87133R2);
                    }
                    C17885g c17885g4 = (C17885g) objM87133R2;
                    BitmapPainter bitmapPainter4 = new BitmapPainter(c17885g4, (((long) Math.min(c17885g4.f69577a.getHeight(), 140)) & 4294967295L) | (((long) c17885g4.f69577a.getWidth()) << 32));
                    Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, modifier2);
                    C2307m c2307m10 = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(c2307m10, false);
                    interfaceC4339a9 = interfaceC4339a8;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                    Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM3407d4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i14 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC39127r0M66763d10);
                    C0209i c0209i15 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m16);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        z25 = z19;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i16 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N16);
                        Modifier modifier10 = modifier2;
                        float f1117 = 8;
                        float f1118 = 2 * f1117;
                        Modifier modifierM3396r7 = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14), f1118, 0.0f, 2);
                        i27 = i15;
                        C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                        boolean z219 = z24;
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q.m87165m();
                        Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q, modifierM3396r7);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i14, c23010xM66775a7);
                        AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m17);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N17);
                        AbstractC29125c.m88522c(bitmapPainter4, null, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f1118, 0.0f, 2), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
                        m41304i(c28655q, 0);
                        float f1119 = 4;
                        float f11110 = f1119 * f1117;
                        Modifier modifierM3398t7 = AbstractC1099a.m3398t(c2314t, 0.0f, f11110, 0.0f, 0.0f, 13);
                        String strM21273g7 = AbstractC8693b.m21273g(AbstractC35950b.f153062G, c28655q, 0);
                        C38072d c38072d7 = C38072d.f163053a;
                        int i3112 = C38072d.f163054b;
                        C2886a c2886aM8418P7 = c38072d7.m121952e(c28655q, i3112).getT3();
                        long jM125430y7 = c38072d7.m121949b(c28655q, i3112).getBrandWhite();
                        int i3113 = C2886a.f11498d;
                        AbstractC30795n.m94707h(strM21273g7, modifierM3398t7, jM125430y7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P7, null, c28655q, 48, i3113 << 18, 196600);
                        C2886a c2886aM8430k7 = c38072d7.m121952e(c28655q, i3112).getBtS();
                        C22976l1 c22976l1M3379a7 = AbstractC1099a.m3379a(0, 0.0f, 2);
                        TextResource.C8688b c8688bM21277k7 = AbstractC8693b.m21277k(AbstractC35950b.f153060E);
                        Integer numValueOf7 = Integer.valueOf(c38072d7.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward());
                        if ((i27 & 57344) == 16384) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z26) {
                            objM87133R3 = new C11699o(interfaceC4339a9, 24);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C11699o(interfaceC4339a9, 24);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC27271o0.m82253b(c2314t, false, c8688bM21277k7, c2886aM8430k7, null, null, numValueOf7, null, false, c22976l1M3379a7, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.C8688b.f25889c << 6) | 906166278 | (i3113 << 9), 0, 146);
                        AbstractC1090b.m3350e(C23016z.f90757a, z219, AbstractC1099a.m3398t(c2314t, 0.0f, f1118, 0.0f, 0.0f, 13), null, null, null, C14462d.f52794a.m41219b(), c28655q, 1573254 | ((i27 >> 3) & 112), 28);
                        AbstractC25012a.m73388u(35, f1119, c2314t, c28655q, true);
                        WeakHashMap weakHashMap7 = C22944c2.f90553v;
                        float fMo43109a7 = AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a();
                        Modifier modifierM3419p7 = AbstractC1102d.m3419p(400, c2314t);
                        C2307m c2307m11 = C2299e.f9106I;
                        C1100b c1100b7 = C1100b.f4583a;
                        AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1099a.m3392n(c1100b7.mo3400a(modifierM3419p7, c2307m11), 0.0f, fMo43109a7, 1), C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4287324927L))), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 900.0f, 8), null, 0.0f, 6), c28655q, 0);
                        Modifier modifierM3394p7 = AbstractC1099a.m3394p(f11110, c1100b7.mo3400a(c2314t, C2299e.f9105H));
                        InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(c2307m10, false);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q.m87165m();
                        Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q, modifierM3394p7);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC39127r0M66763d11);
                        AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m18);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N18);
                        int i3114 = i27 << 3;
                        interfaceC4339a3 = interfaceC4339a7;
                        boolean z2110 = z25;
                        AbstractC13172e.m36939k(EnumC13178k.INTRO_V2, false, z2110, false, interfaceC4339a3, c28655q, (i3114 & 896) | 6 | (i3114 & 57344), 10);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        interfaceC4339a5 = interfaceC4339a9;
                        z17 = z2110;
                        modifier3 = modifier10;
                        z18 = z219;
                    } else {
                        z25 = z19;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    C0209i c0209i17 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N16);
                    Modifier modifier11 = modifier2;
                    float f11111 = 8;
                    float f11112 = 2 * f11111;
                    Modifier modifierM3396r8 = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14), f11112, 0.0f, 2);
                    i27 = i15;
                    C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    boolean z2111 = z24;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q.m87165m();
                    Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q, modifierM3396r8);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i14, c23010xM66775a8);
                    AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m19);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N19);
                    AbstractC29125c.m88522c(bitmapPainter4, null, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f11112, 0.0f, 2), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
                    m41304i(c28655q, 0);
                    float f11113 = 4;
                    float f11114 = f11113 * f11111;
                    Modifier modifierM3398t8 = AbstractC1099a.m3398t(c2314t, 0.0f, f11114, 0.0f, 0.0f, 13);
                    String strM21273g8 = AbstractC8693b.m21273g(AbstractC35950b.f153062G, c28655q, 0);
                    C38072d c38072d8 = C38072d.f163053a;
                    int i3115 = C38072d.f163054b;
                    C2886a c2886aM8418P8 = c38072d8.m121952e(c28655q, i3115).getT3();
                    long jM125430y8 = c38072d8.m121949b(c28655q, i3115).getBrandWhite();
                    int i3116 = C2886a.f11498d;
                    AbstractC30795n.m94707h(strM21273g8, modifierM3398t8, jM125430y8, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P8, null, c28655q, 48, i3116 << 18, 196600);
                    C2886a c2886aM8430k8 = c38072d8.m121952e(c28655q, i3115).getBtS();
                    C22976l1 c22976l1M3379a8 = AbstractC1099a.m3379a(0, 0.0f, 2);
                    TextResource.C8688b c8688bM21277k8 = AbstractC8693b.m21277k(AbstractC35950b.f153060E);
                    Integer numValueOf8 = Integer.valueOf(c38072d8.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward());
                    if ((i27 & 57344) == 16384) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z26) {
                        objM87133R3 = new C11699o(interfaceC4339a9, 24);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C11699o(interfaceC4339a9, 24);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC27271o0.m82253b(c2314t, false, c8688bM21277k8, c2886aM8430k8, null, null, numValueOf8, null, false, c22976l1M3379a8, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.C8688b.f25889c << 6) | 906166278 | (i3116 << 9), 0, 146);
                    AbstractC1090b.m3350e(C23016z.f90757a, z2111, AbstractC1099a.m3398t(c2314t, 0.0f, f11112, 0.0f, 0.0f, 13), null, null, null, C14462d.f52794a.m41219b(), c28655q, 1573254 | ((i27 >> 3) & 112), 28);
                    AbstractC25012a.m73388u(35, f11113, c2314t, c28655q, true);
                    WeakHashMap weakHashMap8 = C22944c2.f90553v;
                    float fMo43109a8 = AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a();
                    Modifier modifierM3419p8 = AbstractC1102d.m3419p(400, c2314t);
                    C2307m c2307m12 = C2299e.f9106I;
                    C1100b c1100b8 = C1100b.f4583a;
                    AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1099a.m3392n(c1100b8.mo3400a(modifierM3419p8, c2307m12), 0.0f, fMo43109a8, 1), C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4287324927L))), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 900.0f, 8), null, 0.0f, 6), c28655q, 0);
                    Modifier modifierM3394p8 = AbstractC1099a.m3394p(f11114, c1100b8.mo3400a(c2314t, C2299e.f9105H));
                    InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(c2307m10, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q.m87165m();
                    Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q, modifierM3394p8);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC39127r0M66763d12);
                    AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m110);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N110);
                    int i3117 = i27 << 3;
                    interfaceC4339a3 = interfaceC4339a7;
                    boolean z2112 = z25;
                    AbstractC13172e.m36939k(EnumC13178k.INTRO_V2, false, z2112, false, interfaceC4339a3, c28655q, (i3117 & 896) | 6 | (i3117 & 57344), 10);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    interfaceC4339a5 = interfaceC4339a9;
                    z17 = z2112;
                    modifier3 = modifier11;
                    z18 = z2111;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z17 = z14;
                    z18 = z15;
                    interfaceC4339a5 = interfaceC4339a4;
                }
                interfaceC4339a6 = interfaceC4339a3;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13421p(modifier3, z17, z18, interfaceC4339a6, interfaceC4339a5, i13, i14, 1);
                }
            }
            i15 |= 384;
            z15 = z13;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC4339a3 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a3)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        interfaceC4339a4 = interfaceC4339a2;
                        if (c28655q.m87157i(interfaceC4339a4)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((i15 & 9363) != 9362) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z16)) {
                        c2314t = C2314t.f9131w;
                        if (i28 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i29 != 0) {
                            z19 = false;
                        } else {
                            z19 = z14;
                        }
                        if (i16 != 0) {
                            z24 = false;
                        } else {
                            z24 = z15;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i18 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C13998z1(20);
                                c28655q.m87172p0(objM87133R5);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R5;
                        } else {
                            interfaceC4339a7 = interfaceC4339a3;
                        }
                        if (i24 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C13998z1(21);
                                c28655q.m87172p0(objM87133R4);
                            }
                            interfaceC4339a8 = (InterfaceC4339a) objM87133R4;
                        } else {
                            interfaceC4339a8 = interfaceC4339a4;
                        }
                        i26 = AbstractC35949a.f153053b;
                        resources = (Resources) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4977c);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new TypedValue();
                            c28655q.m87172p0(objM87133R);
                        }
                        TypedValue typedValue5 = (TypedValue) objM87133R;
                        resources.getValue(i26, typedValue5, true);
                        CharSequence charSequence5 = typedValue5.string;
                        AbstractC22676k.m65747g(charSequence5);
                        zM87153g = c28655q.m87153g(charSequence5.toString());
                        objM87133R2 = c28655q.m87133R();
                        if (zM87153g) {
                            Drawable drawable8 = resources.getDrawable(i26, null);
                            AbstractC22676k.m65748h(drawable8, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                            objM87133R2 = new C17885g(((BitmapDrawable) drawable8).getBitmap());
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            Drawable drawable9 = resources.getDrawable(i26, null);
                            AbstractC22676k.m65748h(drawable9, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                            objM87133R2 = new C17885g(((BitmapDrawable) drawable9).getBitmap());
                            c28655q.m87172p0(objM87133R2);
                        }
                        C17885g c17885g5 = (C17885g) objM87133R2;
                        BitmapPainter bitmapPainter5 = new BitmapPainter(c17885g5, (((long) Math.min(c17885g5.f69577a.getHeight(), 140)) & 4294967295L) | (((long) c17885g5.f69577a.getWidth()) << 32));
                        Modifier modifierM3407d5 = AbstractC1102d.m3407d(1.0f, modifier2);
                        C2307m c2307m13 = C2299e.f9114w;
                        InterfaceC39127r0 interfaceC39127r0M66763d13 = AbstractC22989q.m66763d(c2307m13, false);
                        interfaceC4339a9 = interfaceC4339a8;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q.m87165m();
                        Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q, modifierM3407d5);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        C0209i c0209i18 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i18, interfaceC39127r0M66763d13);
                        C0209i c0209i19 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i19, interfaceC28653p1M87165m111);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            z25 = z19;
                            if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i110 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q, c0209i110, modifierM118962N111);
                            Modifier modifier12 = modifier2;
                            float f11115 = 8;
                            float f11116 = 2 * f11115;
                            Modifier modifierM3396r9 = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14), f11116, 0.0f, 2);
                            i27 = i15;
                            C23010x c23010xM66775a9 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                            boolean z2113 = z24;
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q.m87165m();
                            Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q, modifierM3396r9);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i18, c23010xM66775a9);
                            AbstractC28683x.m87239G(c28655q, c0209i19, interfaceC28653p1M87165m112);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i110, modifierM118962N112);
                            AbstractC29125c.m88522c(bitmapPainter5, null, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f11116, 0.0f, 2), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
                            m41304i(c28655q, 0);
                            float f11117 = 4;
                            float f11118 = f11117 * f11115;
                            Modifier modifierM3398t9 = AbstractC1099a.m3398t(c2314t, 0.0f, f11118, 0.0f, 0.0f, 13);
                            String strM21273g9 = AbstractC8693b.m21273g(AbstractC35950b.f153062G, c28655q, 0);
                            C38072d c38072d9 = C38072d.f163053a;
                            int i3118 = C38072d.f163054b;
                            C2886a c2886aM8418P9 = c38072d9.m121952e(c28655q, i3118).getT3();
                            long jM125430y9 = c38072d9.m121949b(c28655q, i3118).getBrandWhite();
                            int i3119 = C2886a.f11498d;
                            AbstractC30795n.m94707h(strM21273g9, modifierM3398t9, jM125430y9, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P9, null, c28655q, 48, i3119 << 18, 196600);
                            C2886a c2886aM8430k9 = c38072d9.m121952e(c28655q, i3118).getBtS();
                            C22976l1 c22976l1M3379a9 = AbstractC1099a.m3379a(0, 0.0f, 2);
                            TextResource.C8688b c8688bM21277k9 = AbstractC8693b.m21277k(AbstractC35950b.f153060E);
                            Integer numValueOf9 = Integer.valueOf(c38072d9.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward());
                            if ((i27 & 57344) == 16384) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            objM87133R3 = c28655q.m87133R();
                            if (z26) {
                                objM87133R3 = new C11699o(interfaceC4339a9, 24);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C11699o(interfaceC4339a9, 24);
                                c28655q.m87172p0(objM87133R3);
                            }
                            AbstractC27271o0.m82253b(c2314t, false, c8688bM21277k9, c2886aM8430k9, null, null, numValueOf9, null, false, c22976l1M3379a9, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.C8688b.f25889c << 6) | 906166278 | (i3119 << 9), 0, 146);
                            AbstractC1090b.m3350e(C23016z.f90757a, z2113, AbstractC1099a.m3398t(c2314t, 0.0f, f11116, 0.0f, 0.0f, 13), null, null, null, C14462d.f52794a.m41219b(), c28655q, 1573254 | ((i27 >> 3) & 112), 28);
                            AbstractC25012a.m73388u(35, f11117, c2314t, c28655q, true);
                            WeakHashMap weakHashMap9 = C22944c2.f90553v;
                            float fMo43109a9 = AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a();
                            Modifier modifierM3419p9 = AbstractC1102d.m3419p(400, c2314t);
                            C2307m c2307m14 = C2299e.f9106I;
                            C1100b c1100b9 = C1100b.f4583a;
                            AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1099a.m3392n(c1100b9.mo3400a(modifierM3419p9, c2307m14), 0.0f, fMo43109a9, 1), C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4287324927L))), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 900.0f, 8), null, 0.0f, 6), c28655q, 0);
                            Modifier modifierM3394p9 = AbstractC1099a.m3394p(f11118, c1100b9.mo3400a(c2314t, C2299e.f9105H));
                            InterfaceC39127r0 interfaceC39127r0M66763d14 = AbstractC22989q.m66763d(c2307m13, false);
                            iHashCode3 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q.m87165m();
                            Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q, modifierM3394p9);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i18, interfaceC39127r0M66763d14);
                            AbstractC28683x.m87239G(c28655q, c0209i19, interfaceC28653p1M87165m113);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i110, modifierM118962N113);
                            int i31110 = i27 << 3;
                            interfaceC4339a3 = interfaceC4339a7;
                            boolean z2114 = z25;
                            AbstractC13172e.m36939k(EnumC13178k.INTRO_V2, false, z2114, false, interfaceC4339a3, c28655q, (i31110 & 896) | 6 | (i31110 & 57344), 10);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(true);
                            interfaceC4339a5 = interfaceC4339a9;
                            z17 = z2114;
                            modifier3 = modifier12;
                            z18 = z2113;
                        } else {
                            z25 = z19;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        C0209i c0209i111 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i111, modifierM118962N111);
                        Modifier modifier13 = modifier2;
                        float f11119 = 8;
                        float f111110 = 2 * f11119;
                        Modifier modifierM3396r10 = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14), f111110, 0.0f, 2);
                        i27 = i15;
                        C23010x c23010xM66775a10 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                        boolean z2115 = z24;
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q.m87165m();
                        Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q, modifierM3396r10);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i18, c23010xM66775a10);
                        AbstractC28683x.m87239G(c28655q, c0209i19, interfaceC28653p1M87165m114);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i111, modifierM118962N114);
                        AbstractC29125c.m88522c(bitmapPainter5, null, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f111110, 0.0f, 2), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
                        m41304i(c28655q, 0);
                        float f111111 = 4;
                        float f111112 = f111111 * f11119;
                        Modifier modifierM3398t10 = AbstractC1099a.m3398t(c2314t, 0.0f, f111112, 0.0f, 0.0f, 13);
                        String strM21273g10 = AbstractC8693b.m21273g(AbstractC35950b.f153062G, c28655q, 0);
                        C38072d c38072d10 = C38072d.f163053a;
                        int i31111 = C38072d.f163054b;
                        C2886a c2886aM8418P10 = c38072d10.m121952e(c28655q, i31111).getT3();
                        long jM125430y10 = c38072d10.m121949b(c28655q, i31111).getBrandWhite();
                        int i31112 = C2886a.f11498d;
                        AbstractC30795n.m94707h(strM21273g10, modifierM3398t10, jM125430y10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P10, null, c28655q, 48, i31112 << 18, 196600);
                        C2886a c2886aM8430k10 = c38072d10.m121952e(c28655q, i31111).getBtS();
                        C22976l1 c22976l1M3379a10 = AbstractC1099a.m3379a(0, 0.0f, 2);
                        TextResource.C8688b c8688bM21277k10 = AbstractC8693b.m21277k(AbstractC35950b.f153060E);
                        Integer numValueOf10 = Integer.valueOf(c38072d10.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward());
                        if ((i27 & 57344) == 16384) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z26) {
                            objM87133R3 = new C11699o(interfaceC4339a9, 24);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C11699o(interfaceC4339a9, 24);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC27271o0.m82253b(c2314t, false, c8688bM21277k10, c2886aM8430k10, null, null, numValueOf10, null, false, c22976l1M3379a10, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.C8688b.f25889c << 6) | 906166278 | (i31112 << 9), 0, 146);
                        AbstractC1090b.m3350e(C23016z.f90757a, z2115, AbstractC1099a.m3398t(c2314t, 0.0f, f111110, 0.0f, 0.0f, 13), null, null, null, C14462d.f52794a.m41219b(), c28655q, 1573254 | ((i27 >> 3) & 112), 28);
                        AbstractC25012a.m73388u(35, f111111, c2314t, c28655q, true);
                        WeakHashMap weakHashMap10 = C22944c2.f90553v;
                        float fMo43109a10 = AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a();
                        Modifier modifierM3419p10 = AbstractC1102d.m3419p(400, c2314t);
                        C2307m c2307m15 = C2299e.f9106I;
                        C1100b c1100b10 = C1100b.f4583a;
                        AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1099a.m3392n(c1100b10.mo3400a(modifierM3419p10, c2307m15), 0.0f, fMo43109a10, 1), C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4287324927L))), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 900.0f, 8), null, 0.0f, 6), c28655q, 0);
                        Modifier modifierM3394p10 = AbstractC1099a.m3394p(f111112, c1100b10.mo3400a(c2314t, C2299e.f9105H));
                        InterfaceC39127r0 interfaceC39127r0M66763d15 = AbstractC22989q.m66763d(c2307m13, false);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q.m87165m();
                        Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q, modifierM3394p10);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i18, interfaceC39127r0M66763d15);
                        AbstractC28683x.m87239G(c28655q, c0209i19, interfaceC28653p1M87165m115);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i111, modifierM118962N115);
                        int i31113 = i27 << 3;
                        interfaceC4339a3 = interfaceC4339a7;
                        boolean z2116 = z25;
                        AbstractC13172e.m36939k(EnumC13178k.INTRO_V2, false, z2116, false, interfaceC4339a3, c28655q, (i31113 & 896) | 6 | (i31113 & 57344), 10);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        interfaceC4339a5 = interfaceC4339a9;
                        z17 = z2116;
                        modifier3 = modifier13;
                        z18 = z2115;
                    } else {
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        z17 = z14;
                        z18 = z15;
                        interfaceC4339a5 = interfaceC4339a4;
                    }
                    interfaceC4339a6 = interfaceC4339a3;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C13421p(modifier3, z17, z18, interfaceC4339a6, interfaceC4339a5, i13, i14, 1);
                    }
                }
                i15 |= 24576;
                interfaceC4339a4 = interfaceC4339a2;
                if ((i15 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    c2314t = C2314t.f9131w;
                    if (i28 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i29 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    if (i16 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C13998z1(20);
                            c28655q.m87172p0(objM87133R5);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R5;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    if (i24 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C13998z1(21);
                            c28655q.m87172p0(objM87133R4);
                        }
                        interfaceC4339a8 = (InterfaceC4339a) objM87133R4;
                    } else {
                        interfaceC4339a8 = interfaceC4339a4;
                    }
                    i26 = AbstractC35949a.f153053b;
                    resources = (Resources) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4977c);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new TypedValue();
                        c28655q.m87172p0(objM87133R);
                    }
                    TypedValue typedValue6 = (TypedValue) objM87133R;
                    resources.getValue(i26, typedValue6, true);
                    CharSequence charSequence6 = typedValue6.string;
                    AbstractC22676k.m65747g(charSequence6);
                    zM87153g = c28655q.m87153g(charSequence6.toString());
                    objM87133R2 = c28655q.m87133R();
                    if (zM87153g) {
                        Drawable drawable10 = resources.getDrawable(i26, null);
                        AbstractC22676k.m65748h(drawable10, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                        objM87133R2 = new C17885g(((BitmapDrawable) drawable10).getBitmap());
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        Drawable drawable11 = resources.getDrawable(i26, null);
                        AbstractC22676k.m65748h(drawable11, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                        objM87133R2 = new C17885g(((BitmapDrawable) drawable11).getBitmap());
                        c28655q.m87172p0(objM87133R2);
                    }
                    C17885g c17885g6 = (C17885g) objM87133R2;
                    BitmapPainter bitmapPainter6 = new BitmapPainter(c17885g6, (((long) Math.min(c17885g6.f69577a.getHeight(), 140)) & 4294967295L) | (((long) c17885g6.f69577a.getWidth()) << 32));
                    Modifier modifierM3407d6 = AbstractC1102d.m3407d(1.0f, modifier2);
                    C2307m c2307m16 = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d16 = AbstractC22989q.m66763d(c2307m16, false);
                    interfaceC4339a9 = interfaceC4339a8;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q.m87165m();
                    Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q, modifierM3407d6);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i112 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i112, interfaceC39127r0M66763d16);
                    C0209i c0209i113 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i113, interfaceC28653p1M87165m116);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        z25 = z19;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i114 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i114, modifierM118962N116);
                        Modifier modifier14 = modifier2;
                        float f111113 = 8;
                        float f111114 = 2 * f111113;
                        Modifier modifierM3396r11 = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14), f111114, 0.0f, 2);
                        i27 = i15;
                        C23010x c23010xM66775a11 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                        boolean z2117 = z24;
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q.m87165m();
                        Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q, modifierM3396r11);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i112, c23010xM66775a11);
                        AbstractC28683x.m87239G(c28655q, c0209i113, interfaceC28653p1M87165m117);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i114, modifierM118962N117);
                        AbstractC29125c.m88522c(bitmapPainter6, null, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f111114, 0.0f, 2), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
                        m41304i(c28655q, 0);
                        float f111115 = 4;
                        float f111116 = f111115 * f111113;
                        Modifier modifierM3398t11 = AbstractC1099a.m3398t(c2314t, 0.0f, f111116, 0.0f, 0.0f, 13);
                        String strM21273g11 = AbstractC8693b.m21273g(AbstractC35950b.f153062G, c28655q, 0);
                        C38072d c38072d11 = C38072d.f163053a;
                        int i31114 = C38072d.f163054b;
                        C2886a c2886aM8418P11 = c38072d11.m121952e(c28655q, i31114).getT3();
                        long jM125430y11 = c38072d11.m121949b(c28655q, i31114).getBrandWhite();
                        int i31115 = C2886a.f11498d;
                        AbstractC30795n.m94707h(strM21273g11, modifierM3398t11, jM125430y11, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P11, null, c28655q, 48, i31115 << 18, 196600);
                        C2886a c2886aM8430k11 = c38072d11.m121952e(c28655q, i31114).getBtS();
                        C22976l1 c22976l1M3379a11 = AbstractC1099a.m3379a(0, 0.0f, 2);
                        TextResource.C8688b c8688bM21277k11 = AbstractC8693b.m21277k(AbstractC35950b.f153060E);
                        Integer numValueOf11 = Integer.valueOf(c38072d11.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward());
                        if ((i27 & 57344) == 16384) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z26) {
                            objM87133R3 = new C11699o(interfaceC4339a9, 24);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C11699o(interfaceC4339a9, 24);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC27271o0.m82253b(c2314t, false, c8688bM21277k11, c2886aM8430k11, null, null, numValueOf11, null, false, c22976l1M3379a11, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.C8688b.f25889c << 6) | 906166278 | (i31115 << 9), 0, 146);
                        AbstractC1090b.m3350e(C23016z.f90757a, z2117, AbstractC1099a.m3398t(c2314t, 0.0f, f111114, 0.0f, 0.0f, 13), null, null, null, C14462d.f52794a.m41219b(), c28655q, 1573254 | ((i27 >> 3) & 112), 28);
                        AbstractC25012a.m73388u(35, f111115, c2314t, c28655q, true);
                        WeakHashMap weakHashMap11 = C22944c2.f90553v;
                        float fMo43109a11 = AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a();
                        Modifier modifierM3419p11 = AbstractC1102d.m3419p(400, c2314t);
                        C2307m c2307m17 = C2299e.f9106I;
                        C1100b c1100b11 = C1100b.f4583a;
                        AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1099a.m3392n(c1100b11.mo3400a(modifierM3419p11, c2307m17), 0.0f, fMo43109a11, 1), C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4287324927L))), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 900.0f, 8), null, 0.0f, 6), c28655q, 0);
                        Modifier modifierM3394p11 = AbstractC1099a.m3394p(f111116, c1100b11.mo3400a(c2314t, C2299e.f9105H));
                        InterfaceC39127r0 interfaceC39127r0M66763d17 = AbstractC22989q.m66763d(c2307m16, false);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q.m87165m();
                        Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q, modifierM3394p11);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i112, interfaceC39127r0M66763d17);
                        AbstractC28683x.m87239G(c28655q, c0209i113, interfaceC28653p1M87165m118);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i114, modifierM118962N118);
                        int i31116 = i27 << 3;
                        interfaceC4339a3 = interfaceC4339a7;
                        boolean z2118 = z25;
                        AbstractC13172e.m36939k(EnumC13178k.INTRO_V2, false, z2118, false, interfaceC4339a3, c28655q, (i31116 & 896) | 6 | (i31116 & 57344), 10);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        interfaceC4339a5 = interfaceC4339a9;
                        z17 = z2118;
                        modifier3 = modifier14;
                        z18 = z2117;
                    } else {
                        z25 = z19;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    C0209i c0209i115 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i115, modifierM118962N116);
                    Modifier modifier15 = modifier2;
                    float f111117 = 8;
                    float f111118 = 2 * f111117;
                    Modifier modifierM3396r12 = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14), f111118, 0.0f, 2);
                    i27 = i15;
                    C23010x c23010xM66775a12 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    boolean z2119 = z24;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m119 = c28655q.m87165m();
                    Modifier modifierM118962N119 = AbstractC37056f.m118962N(c28655q, modifierM3396r12);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i112, c23010xM66775a12);
                    AbstractC28683x.m87239G(c28655q, c0209i113, interfaceC28653p1M87165m119);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i115, modifierM118962N119);
                    AbstractC29125c.m88522c(bitmapPainter6, null, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f111118, 0.0f, 2), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
                    m41304i(c28655q, 0);
                    float f111119 = 4;
                    float f1111110 = f111119 * f111117;
                    Modifier modifierM3398t12 = AbstractC1099a.m3398t(c2314t, 0.0f, f1111110, 0.0f, 0.0f, 13);
                    String strM21273g12 = AbstractC8693b.m21273g(AbstractC35950b.f153062G, c28655q, 0);
                    C38072d c38072d12 = C38072d.f163053a;
                    int i31117 = C38072d.f163054b;
                    C2886a c2886aM8418P12 = c38072d12.m121952e(c28655q, i31117).getT3();
                    long jM125430y12 = c38072d12.m121949b(c28655q, i31117).getBrandWhite();
                    int i31118 = C2886a.f11498d;
                    AbstractC30795n.m94707h(strM21273g12, modifierM3398t12, jM125430y12, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P12, null, c28655q, 48, i31118 << 18, 196600);
                    C2886a c2886aM8430k12 = c38072d12.m121952e(c28655q, i31117).getBtS();
                    C22976l1 c22976l1M3379a12 = AbstractC1099a.m3379a(0, 0.0f, 2);
                    TextResource.C8688b c8688bM21277k12 = AbstractC8693b.m21277k(AbstractC35950b.f153060E);
                    Integer numValueOf12 = Integer.valueOf(c38072d12.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward());
                    if ((i27 & 57344) == 16384) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z26) {
                        objM87133R3 = new C11699o(interfaceC4339a9, 24);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C11699o(interfaceC4339a9, 24);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC27271o0.m82253b(c2314t, false, c8688bM21277k12, c2886aM8430k12, null, null, numValueOf12, null, false, c22976l1M3379a12, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.C8688b.f25889c << 6) | 906166278 | (i31118 << 9), 0, 146);
                    AbstractC1090b.m3350e(C23016z.f90757a, z2119, AbstractC1099a.m3398t(c2314t, 0.0f, f111118, 0.0f, 0.0f, 13), null, null, null, C14462d.f52794a.m41219b(), c28655q, 1573254 | ((i27 >> 3) & 112), 28);
                    AbstractC25012a.m73388u(35, f111119, c2314t, c28655q, true);
                    WeakHashMap weakHashMap12 = C22944c2.f90553v;
                    float fMo43109a12 = AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a();
                    Modifier modifierM3419p12 = AbstractC1102d.m3419p(400, c2314t);
                    C2307m c2307m18 = C2299e.f9106I;
                    C1100b c1100b12 = C1100b.f4583a;
                    AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1099a.m3392n(c1100b12.mo3400a(modifierM3419p12, c2307m18), 0.0f, fMo43109a12, 1), C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4287324927L))), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 900.0f, 8), null, 0.0f, 6), c28655q, 0);
                    Modifier modifierM3394p12 = AbstractC1099a.m3394p(f1111110, c1100b12.mo3400a(c2314t, C2299e.f9105H));
                    InterfaceC39127r0 interfaceC39127r0M66763d18 = AbstractC22989q.m66763d(c2307m16, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1110 = c28655q.m87165m();
                    Modifier modifierM118962N1110 = AbstractC37056f.m118962N(c28655q, modifierM3394p12);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i112, interfaceC39127r0M66763d18);
                    AbstractC28683x.m87239G(c28655q, c0209i113, interfaceC28653p1M87165m1110);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i115, modifierM118962N1110);
                    int i31119 = i27 << 3;
                    interfaceC4339a3 = interfaceC4339a7;
                    boolean z21110 = z25;
                    AbstractC13172e.m36939k(EnumC13178k.INTRO_V2, false, z21110, false, interfaceC4339a3, c28655q, (i31119 & 896) | 6 | (i31119 & 57344), 10);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    interfaceC4339a5 = interfaceC4339a9;
                    z17 = z21110;
                    modifier3 = modifier15;
                    z18 = z2119;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z17 = z14;
                    z18 = z15;
                    interfaceC4339a5 = interfaceC4339a4;
                }
                interfaceC4339a6 = interfaceC4339a3;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13421p(modifier3, z17, z18, interfaceC4339a6, interfaceC4339a5, i13, i14, 1);
                }
            }
            i15 |= 3072;
            interfaceC4339a3 = interfaceC4339a;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a4 = interfaceC4339a2;
                    if (c28655q.m87157i(interfaceC4339a4)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((i15 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    c2314t = C2314t.f9131w;
                    if (i28 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i29 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    if (i16 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C13998z1(20);
                            c28655q.m87172p0(objM87133R5);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R5;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    if (i24 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C13998z1(21);
                            c28655q.m87172p0(objM87133R4);
                        }
                        interfaceC4339a8 = (InterfaceC4339a) objM87133R4;
                    } else {
                        interfaceC4339a8 = interfaceC4339a4;
                    }
                    i26 = AbstractC35949a.f153053b;
                    resources = (Resources) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4977c);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new TypedValue();
                        c28655q.m87172p0(objM87133R);
                    }
                    TypedValue typedValue7 = (TypedValue) objM87133R;
                    resources.getValue(i26, typedValue7, true);
                    CharSequence charSequence7 = typedValue7.string;
                    AbstractC22676k.m65747g(charSequence7);
                    zM87153g = c28655q.m87153g(charSequence7.toString());
                    objM87133R2 = c28655q.m87133R();
                    if (zM87153g) {
                        Drawable drawable12 = resources.getDrawable(i26, null);
                        AbstractC22676k.m65748h(drawable12, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                        objM87133R2 = new C17885g(((BitmapDrawable) drawable12).getBitmap());
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        Drawable drawable13 = resources.getDrawable(i26, null);
                        AbstractC22676k.m65748h(drawable13, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                        objM87133R2 = new C17885g(((BitmapDrawable) drawable13).getBitmap());
                        c28655q.m87172p0(objM87133R2);
                    }
                    C17885g c17885g7 = (C17885g) objM87133R2;
                    BitmapPainter bitmapPainter7 = new BitmapPainter(c17885g7, (((long) Math.min(c17885g7.f69577a.getHeight(), 140)) & 4294967295L) | (((long) c17885g7.f69577a.getWidth()) << 32));
                    Modifier modifierM3407d7 = AbstractC1102d.m3407d(1.0f, modifier2);
                    C2307m c2307m19 = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d19 = AbstractC22989q.m66763d(c2307m19, false);
                    interfaceC4339a9 = interfaceC4339a8;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111 = c28655q.m87165m();
                    Modifier modifierM118962N1111 = AbstractC37056f.m118962N(c28655q, modifierM3407d7);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i116 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i116, interfaceC39127r0M66763d19);
                    C0209i c0209i117 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i117, interfaceC28653p1M87165m1111);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        z25 = z19;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i118 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i118, modifierM118962N1111);
                        Modifier modifier16 = modifier2;
                        float f1111111 = 8;
                        float f1111112 = 2 * f1111111;
                        Modifier modifierM3396r13 = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14), f1111112, 0.0f, 2);
                        i27 = i15;
                        C23010x c23010xM66775a13 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                        boolean z21111 = z24;
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1112 = c28655q.m87165m();
                        Modifier modifierM118962N1112 = AbstractC37056f.m118962N(c28655q, modifierM3396r13);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i116, c23010xM66775a13);
                        AbstractC28683x.m87239G(c28655q, c0209i117, interfaceC28653p1M87165m1112);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i118, modifierM118962N1112);
                        AbstractC29125c.m88522c(bitmapPainter7, null, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f1111112, 0.0f, 2), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
                        m41304i(c28655q, 0);
                        float f1111113 = 4;
                        float f1111114 = f1111113 * f1111111;
                        Modifier modifierM3398t13 = AbstractC1099a.m3398t(c2314t, 0.0f, f1111114, 0.0f, 0.0f, 13);
                        String strM21273g13 = AbstractC8693b.m21273g(AbstractC35950b.f153062G, c28655q, 0);
                        C38072d c38072d13 = C38072d.f163053a;
                        int i311110 = C38072d.f163054b;
                        C2886a c2886aM8418P13 = c38072d13.m121952e(c28655q, i311110).getT3();
                        long jM125430y13 = c38072d13.m121949b(c28655q, i311110).getBrandWhite();
                        int i311111 = C2886a.f11498d;
                        AbstractC30795n.m94707h(strM21273g13, modifierM3398t13, jM125430y13, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P13, null, c28655q, 48, i311111 << 18, 196600);
                        C2886a c2886aM8430k13 = c38072d13.m121952e(c28655q, i311110).getBtS();
                        C22976l1 c22976l1M3379a13 = AbstractC1099a.m3379a(0, 0.0f, 2);
                        TextResource.C8688b c8688bM21277k13 = AbstractC8693b.m21277k(AbstractC35950b.f153060E);
                        Integer numValueOf13 = Integer.valueOf(c38072d13.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward());
                        if ((i27 & 57344) == 16384) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z26) {
                            objM87133R3 = new C11699o(interfaceC4339a9, 24);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C11699o(interfaceC4339a9, 24);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC27271o0.m82253b(c2314t, false, c8688bM21277k13, c2886aM8430k13, null, null, numValueOf13, null, false, c22976l1M3379a13, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.C8688b.f25889c << 6) | 906166278 | (i311111 << 9), 0, 146);
                        AbstractC1090b.m3350e(C23016z.f90757a, z21111, AbstractC1099a.m3398t(c2314t, 0.0f, f1111112, 0.0f, 0.0f, 13), null, null, null, C14462d.f52794a.m41219b(), c28655q, 1573254 | ((i27 >> 3) & 112), 28);
                        AbstractC25012a.m73388u(35, f1111113, c2314t, c28655q, true);
                        WeakHashMap weakHashMap13 = C22944c2.f90553v;
                        float fMo43109a13 = AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a();
                        Modifier modifierM3419p13 = AbstractC1102d.m3419p(400, c2314t);
                        C2307m c2307m110 = C2299e.f9106I;
                        C1100b c1100b13 = C1100b.f4583a;
                        AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1099a.m3392n(c1100b13.mo3400a(modifierM3419p13, c2307m110), 0.0f, fMo43109a13, 1), C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4287324927L))), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 900.0f, 8), null, 0.0f, 6), c28655q, 0);
                        Modifier modifierM3394p13 = AbstractC1099a.m3394p(f1111114, c1100b13.mo3400a(c2314t, C2299e.f9105H));
                        InterfaceC39127r0 interfaceC39127r0M66763d110 = AbstractC22989q.m66763d(c2307m19, false);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1113 = c28655q.m87165m();
                        Modifier modifierM118962N1113 = AbstractC37056f.m118962N(c28655q, modifierM3394p13);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i116, interfaceC39127r0M66763d110);
                        AbstractC28683x.m87239G(c28655q, c0209i117, interfaceC28653p1M87165m1113);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i118, modifierM118962N1113);
                        int i311112 = i27 << 3;
                        interfaceC4339a3 = interfaceC4339a7;
                        boolean z21112 = z25;
                        AbstractC13172e.m36939k(EnumC13178k.INTRO_V2, false, z21112, false, interfaceC4339a3, c28655q, (i311112 & 896) | 6 | (i311112 & 57344), 10);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        interfaceC4339a5 = interfaceC4339a9;
                        z17 = z21112;
                        modifier3 = modifier16;
                        z18 = z21111;
                    } else {
                        z25 = z19;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    C0209i c0209i119 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i119, modifierM118962N1111);
                    Modifier modifier17 = modifier2;
                    float f1111115 = 8;
                    float f1111116 = 2 * f1111115;
                    Modifier modifierM3396r14 = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14), f1111116, 0.0f, 2);
                    i27 = i15;
                    C23010x c23010xM66775a14 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    boolean z21113 = z24;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1114 = c28655q.m87165m();
                    Modifier modifierM118962N1114 = AbstractC37056f.m118962N(c28655q, modifierM3396r14);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i116, c23010xM66775a14);
                    AbstractC28683x.m87239G(c28655q, c0209i117, interfaceC28653p1M87165m1114);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i119, modifierM118962N1114);
                    AbstractC29125c.m88522c(bitmapPainter7, null, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f1111116, 0.0f, 2), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
                    m41304i(c28655q, 0);
                    float f1111117 = 4;
                    float f1111118 = f1111117 * f1111115;
                    Modifier modifierM3398t14 = AbstractC1099a.m3398t(c2314t, 0.0f, f1111118, 0.0f, 0.0f, 13);
                    String strM21273g14 = AbstractC8693b.m21273g(AbstractC35950b.f153062G, c28655q, 0);
                    C38072d c38072d14 = C38072d.f163053a;
                    int i311113 = C38072d.f163054b;
                    C2886a c2886aM8418P14 = c38072d14.m121952e(c28655q, i311113).getT3();
                    long jM125430y14 = c38072d14.m121949b(c28655q, i311113).getBrandWhite();
                    int i311114 = C2886a.f11498d;
                    AbstractC30795n.m94707h(strM21273g14, modifierM3398t14, jM125430y14, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P14, null, c28655q, 48, i311114 << 18, 196600);
                    C2886a c2886aM8430k14 = c38072d14.m121952e(c28655q, i311113).getBtS();
                    C22976l1 c22976l1M3379a14 = AbstractC1099a.m3379a(0, 0.0f, 2);
                    TextResource.C8688b c8688bM21277k14 = AbstractC8693b.m21277k(AbstractC35950b.f153060E);
                    Integer numValueOf14 = Integer.valueOf(c38072d14.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward());
                    if ((i27 & 57344) == 16384) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z26) {
                        objM87133R3 = new C11699o(interfaceC4339a9, 24);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C11699o(interfaceC4339a9, 24);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC27271o0.m82253b(c2314t, false, c8688bM21277k14, c2886aM8430k14, null, null, numValueOf14, null, false, c22976l1M3379a14, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.C8688b.f25889c << 6) | 906166278 | (i311114 << 9), 0, 146);
                    AbstractC1090b.m3350e(C23016z.f90757a, z21113, AbstractC1099a.m3398t(c2314t, 0.0f, f1111116, 0.0f, 0.0f, 13), null, null, null, C14462d.f52794a.m41219b(), c28655q, 1573254 | ((i27 >> 3) & 112), 28);
                    AbstractC25012a.m73388u(35, f1111117, c2314t, c28655q, true);
                    WeakHashMap weakHashMap14 = C22944c2.f90553v;
                    float fMo43109a14 = AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a();
                    Modifier modifierM3419p14 = AbstractC1102d.m3419p(400, c2314t);
                    C2307m c2307m111 = C2299e.f9106I;
                    C1100b c1100b14 = C1100b.f4583a;
                    AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1099a.m3392n(c1100b14.mo3400a(modifierM3419p14, c2307m111), 0.0f, fMo43109a14, 1), C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4287324927L))), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 900.0f, 8), null, 0.0f, 6), c28655q, 0);
                    Modifier modifierM3394p14 = AbstractC1099a.m3394p(f1111118, c1100b14.mo3400a(c2314t, C2299e.f9105H));
                    InterfaceC39127r0 interfaceC39127r0M66763d111 = AbstractC22989q.m66763d(c2307m19, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1115 = c28655q.m87165m();
                    Modifier modifierM118962N1115 = AbstractC37056f.m118962N(c28655q, modifierM3394p14);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i116, interfaceC39127r0M66763d111);
                    AbstractC28683x.m87239G(c28655q, c0209i117, interfaceC28653p1M87165m1115);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i119, modifierM118962N1115);
                    int i311115 = i27 << 3;
                    interfaceC4339a3 = interfaceC4339a7;
                    boolean z21114 = z25;
                    AbstractC13172e.m36939k(EnumC13178k.INTRO_V2, false, z21114, false, interfaceC4339a3, c28655q, (i311115 & 896) | 6 | (i311115 & 57344), 10);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    interfaceC4339a5 = interfaceC4339a9;
                    z17 = z21114;
                    modifier3 = modifier17;
                    z18 = z21113;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z17 = z14;
                    z18 = z15;
                    interfaceC4339a5 = interfaceC4339a4;
                }
                interfaceC4339a6 = interfaceC4339a3;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13421p(modifier3, z17, z18, interfaceC4339a6, interfaceC4339a5, i13, i14, 1);
                }
            }
            i15 |= 24576;
            interfaceC4339a4 = interfaceC4339a2;
            if ((i15 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                c2314t = C2314t.f9131w;
                if (i28 != 0) {
                    modifier2 = c2314t;
                }
                if (i29 != 0) {
                    z19 = false;
                } else {
                    z19 = z14;
                }
                if (i16 != 0) {
                    z24 = false;
                } else {
                    z24 = z15;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C13998z1(20);
                        c28655q.m87172p0(objM87133R5);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R5;
                } else {
                    interfaceC4339a7 = interfaceC4339a3;
                }
                if (i24 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C13998z1(21);
                        c28655q.m87172p0(objM87133R4);
                    }
                    interfaceC4339a8 = (InterfaceC4339a) objM87133R4;
                } else {
                    interfaceC4339a8 = interfaceC4339a4;
                }
                i26 = AbstractC35949a.f153053b;
                resources = (Resources) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4977c);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new TypedValue();
                    c28655q.m87172p0(objM87133R);
                }
                TypedValue typedValue8 = (TypedValue) objM87133R;
                resources.getValue(i26, typedValue8, true);
                CharSequence charSequence8 = typedValue8.string;
                AbstractC22676k.m65747g(charSequence8);
                zM87153g = c28655q.m87153g(charSequence8.toString());
                objM87133R2 = c28655q.m87133R();
                if (zM87153g) {
                    Drawable drawable14 = resources.getDrawable(i26, null);
                    AbstractC22676k.m65748h(drawable14, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                    objM87133R2 = new C17885g(((BitmapDrawable) drawable14).getBitmap());
                    c28655q.m87172p0(objM87133R2);
                } else {
                    Drawable drawable15 = resources.getDrawable(i26, null);
                    AbstractC22676k.m65748h(drawable15, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                    objM87133R2 = new C17885g(((BitmapDrawable) drawable15).getBitmap());
                    c28655q.m87172p0(objM87133R2);
                }
                C17885g c17885g8 = (C17885g) objM87133R2;
                BitmapPainter bitmapPainter8 = new BitmapPainter(c17885g8, (((long) Math.min(c17885g8.f69577a.getHeight(), 140)) & 4294967295L) | (((long) c17885g8.f69577a.getWidth()) << 32));
                Modifier modifierM3407d8 = AbstractC1102d.m3407d(1.0f, modifier2);
                C2307m c2307m112 = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d112 = AbstractC22989q.m66763d(c2307m112, false);
                interfaceC4339a9 = interfaceC4339a8;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1116 = c28655q.m87165m();
                Modifier modifierM118962N1116 = AbstractC37056f.m118962N(c28655q, modifierM3407d8);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i1110 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i1110, interfaceC39127r0M66763d112);
                C0209i c0209i1111 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i1111, interfaceC28653p1M87165m1116);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    z25 = z19;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i1112 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i1112, modifierM118962N1116);
                    Modifier modifier18 = modifier2;
                    float f1111119 = 8;
                    float f11111110 = 2 * f1111119;
                    Modifier modifierM3396r15 = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14), f11111110, 0.0f, 2);
                    i27 = i15;
                    C23010x c23010xM66775a15 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    boolean z21115 = z24;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1117 = c28655q.m87165m();
                    Modifier modifierM118962N1117 = AbstractC37056f.m118962N(c28655q, modifierM3396r15);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1110, c23010xM66775a15);
                    AbstractC28683x.m87239G(c28655q, c0209i1111, interfaceC28653p1M87165m1117);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1112, modifierM118962N1117);
                    AbstractC29125c.m88522c(bitmapPainter8, null, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f11111110, 0.0f, 2), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
                    m41304i(c28655q, 0);
                    float f11111111 = 4;
                    float f11111112 = f11111111 * f1111119;
                    Modifier modifierM3398t15 = AbstractC1099a.m3398t(c2314t, 0.0f, f11111112, 0.0f, 0.0f, 13);
                    String strM21273g15 = AbstractC8693b.m21273g(AbstractC35950b.f153062G, c28655q, 0);
                    C38072d c38072d15 = C38072d.f163053a;
                    int i311116 = C38072d.f163054b;
                    C2886a c2886aM8418P15 = c38072d15.m121952e(c28655q, i311116).getT3();
                    long jM125430y15 = c38072d15.m121949b(c28655q, i311116).getBrandWhite();
                    int i311117 = C2886a.f11498d;
                    AbstractC30795n.m94707h(strM21273g15, modifierM3398t15, jM125430y15, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P15, null, c28655q, 48, i311117 << 18, 196600);
                    C2886a c2886aM8430k15 = c38072d15.m121952e(c28655q, i311116).getBtS();
                    C22976l1 c22976l1M3379a15 = AbstractC1099a.m3379a(0, 0.0f, 2);
                    TextResource.C8688b c8688bM21277k15 = AbstractC8693b.m21277k(AbstractC35950b.f153060E);
                    Integer numValueOf15 = Integer.valueOf(c38072d15.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward());
                    if ((i27 & 57344) == 16384) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z26) {
                        objM87133R3 = new C11699o(interfaceC4339a9, 24);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C11699o(interfaceC4339a9, 24);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC27271o0.m82253b(c2314t, false, c8688bM21277k15, c2886aM8430k15, null, null, numValueOf15, null, false, c22976l1M3379a15, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.C8688b.f25889c << 6) | 906166278 | (i311117 << 9), 0, 146);
                    AbstractC1090b.m3350e(C23016z.f90757a, z21115, AbstractC1099a.m3398t(c2314t, 0.0f, f11111110, 0.0f, 0.0f, 13), null, null, null, C14462d.f52794a.m41219b(), c28655q, 1573254 | ((i27 >> 3) & 112), 28);
                    AbstractC25012a.m73388u(35, f11111111, c2314t, c28655q, true);
                    WeakHashMap weakHashMap15 = C22944c2.f90553v;
                    float fMo43109a15 = AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a();
                    Modifier modifierM3419p15 = AbstractC1102d.m3419p(400, c2314t);
                    C2307m c2307m113 = C2299e.f9106I;
                    C1100b c1100b15 = C1100b.f4583a;
                    AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1099a.m3392n(c1100b15.mo3400a(modifierM3419p15, c2307m113), 0.0f, fMo43109a15, 1), C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4287324927L))), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 900.0f, 8), null, 0.0f, 6), c28655q, 0);
                    Modifier modifierM3394p15 = AbstractC1099a.m3394p(f11111112, c1100b15.mo3400a(c2314t, C2299e.f9105H));
                    InterfaceC39127r0 interfaceC39127r0M66763d113 = AbstractC22989q.m66763d(c2307m112, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1118 = c28655q.m87165m();
                    Modifier modifierM118962N1118 = AbstractC37056f.m118962N(c28655q, modifierM3394p15);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1110, interfaceC39127r0M66763d113);
                    AbstractC28683x.m87239G(c28655q, c0209i1111, interfaceC28653p1M87165m1118);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1112, modifierM118962N1118);
                    int i311118 = i27 << 3;
                    interfaceC4339a3 = interfaceC4339a7;
                    boolean z21116 = z25;
                    AbstractC13172e.m36939k(EnumC13178k.INTRO_V2, false, z21116, false, interfaceC4339a3, c28655q, (i311118 & 896) | 6 | (i311118 & 57344), 10);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    interfaceC4339a5 = interfaceC4339a9;
                    z17 = z21116;
                    modifier3 = modifier18;
                    z18 = z21115;
                } else {
                    z25 = z19;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i1113 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i1113, modifierM118962N1116);
                Modifier modifier19 = modifier2;
                float f11111113 = 8;
                float f11111114 = 2 * f11111113;
                Modifier modifierM3396r16 = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14), f11111114, 0.0f, 2);
                i27 = i15;
                C23010x c23010xM66775a16 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                boolean z21117 = z24;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1119 = c28655q.m87165m();
                Modifier modifierM118962N1119 = AbstractC37056f.m118962N(c28655q, modifierM3396r16);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i1110, c23010xM66775a16);
                AbstractC28683x.m87239G(c28655q, c0209i1111, interfaceC28653p1M87165m1119);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i1113, modifierM118962N1119);
                AbstractC29125c.m88522c(bitmapPainter8, null, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f11111114, 0.0f, 2), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
                m41304i(c28655q, 0);
                float f11111115 = 4;
                float f11111116 = f11111115 * f11111113;
                Modifier modifierM3398t16 = AbstractC1099a.m3398t(c2314t, 0.0f, f11111116, 0.0f, 0.0f, 13);
                String strM21273g16 = AbstractC8693b.m21273g(AbstractC35950b.f153062G, c28655q, 0);
                C38072d c38072d16 = C38072d.f163053a;
                int i311119 = C38072d.f163054b;
                C2886a c2886aM8418P16 = c38072d16.m121952e(c28655q, i311119).getT3();
                long jM125430y16 = c38072d16.m121949b(c28655q, i311119).getBrandWhite();
                int i3111110 = C2886a.f11498d;
                AbstractC30795n.m94707h(strM21273g16, modifierM3398t16, jM125430y16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P16, null, c28655q, 48, i3111110 << 18, 196600);
                C2886a c2886aM8430k16 = c38072d16.m121952e(c28655q, i311119).getBtS();
                C22976l1 c22976l1M3379a16 = AbstractC1099a.m3379a(0, 0.0f, 2);
                TextResource.C8688b c8688bM21277k16 = AbstractC8693b.m21277k(AbstractC35950b.f153060E);
                Integer numValueOf16 = Integer.valueOf(c38072d16.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward());
                if ((i27 & 57344) == 16384) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z26) {
                    objM87133R3 = new C11699o(interfaceC4339a9, 24);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C11699o(interfaceC4339a9, 24);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC27271o0.m82253b(c2314t, false, c8688bM21277k16, c2886aM8430k16, null, null, numValueOf16, null, false, c22976l1M3379a16, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.C8688b.f25889c << 6) | 906166278 | (i3111110 << 9), 0, 146);
                AbstractC1090b.m3350e(C23016z.f90757a, z21117, AbstractC1099a.m3398t(c2314t, 0.0f, f11111114, 0.0f, 0.0f, 13), null, null, null, C14462d.f52794a.m41219b(), c28655q, 1573254 | ((i27 >> 3) & 112), 28);
                AbstractC25012a.m73388u(35, f11111115, c2314t, c28655q, true);
                WeakHashMap weakHashMap16 = C22944c2.f90553v;
                float fMo43109a16 = AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a();
                Modifier modifierM3419p16 = AbstractC1102d.m3419p(400, c2314t);
                C2307m c2307m114 = C2299e.f9106I;
                C1100b c1100b16 = C1100b.f4583a;
                AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1099a.m3392n(c1100b16.mo3400a(modifierM3419p16, c2307m114), 0.0f, fMo43109a16, 1), C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4287324927L))), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 900.0f, 8), null, 0.0f, 6), c28655q, 0);
                Modifier modifierM3394p16 = AbstractC1099a.m3394p(f11111116, c1100b16.mo3400a(c2314t, C2299e.f9105H));
                InterfaceC39127r0 interfaceC39127r0M66763d114 = AbstractC22989q.m66763d(c2307m112, false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11110 = c28655q.m87165m();
                Modifier modifierM118962N11110 = AbstractC37056f.m118962N(c28655q, modifierM3394p16);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i1110, interfaceC39127r0M66763d114);
                AbstractC28683x.m87239G(c28655q, c0209i1111, interfaceC28653p1M87165m11110);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i1113, modifierM118962N11110);
                int i3111111 = i27 << 3;
                interfaceC4339a3 = interfaceC4339a7;
                boolean z21118 = z25;
                AbstractC13172e.m36939k(EnumC13178k.INTRO_V2, false, z21118, false, interfaceC4339a3, c28655q, (i3111111 & 896) | 6 | (i3111111 & 57344), 10);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                interfaceC4339a5 = interfaceC4339a9;
                z17 = z21118;
                modifier3 = modifier19;
                z18 = z21117;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z17 = z14;
                z18 = z15;
                interfaceC4339a5 = interfaceC4339a4;
            }
            interfaceC4339a6 = interfaceC4339a3;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13421p(modifier3, z17, z18, interfaceC4339a6, interfaceC4339a5, i13, i14, 1);
            }
        }
        i15 |= 48;
        z14 = z4;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                z15 = z13;
                if (c28655q.m87155h(z15)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC4339a3 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a3)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        interfaceC4339a4 = interfaceC4339a2;
                        if (c28655q.m87157i(interfaceC4339a4)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((i15 & 9363) != 9362) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z16)) {
                        c2314t = C2314t.f9131w;
                        if (i28 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i29 != 0) {
                            z19 = false;
                        } else {
                            z19 = z14;
                        }
                        if (i16 != 0) {
                            z24 = false;
                        } else {
                            z24 = z15;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i18 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C13998z1(20);
                                c28655q.m87172p0(objM87133R5);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R5;
                        } else {
                            interfaceC4339a7 = interfaceC4339a3;
                        }
                        if (i24 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C13998z1(21);
                                c28655q.m87172p0(objM87133R4);
                            }
                            interfaceC4339a8 = (InterfaceC4339a) objM87133R4;
                        } else {
                            interfaceC4339a8 = interfaceC4339a4;
                        }
                        i26 = AbstractC35949a.f153053b;
                        resources = (Resources) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4977c);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new TypedValue();
                            c28655q.m87172p0(objM87133R);
                        }
                        TypedValue typedValue9 = (TypedValue) objM87133R;
                        resources.getValue(i26, typedValue9, true);
                        CharSequence charSequence9 = typedValue9.string;
                        AbstractC22676k.m65747g(charSequence9);
                        zM87153g = c28655q.m87153g(charSequence9.toString());
                        objM87133R2 = c28655q.m87133R();
                        if (zM87153g) {
                            Drawable drawable16 = resources.getDrawable(i26, null);
                            AbstractC22676k.m65748h(drawable16, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                            objM87133R2 = new C17885g(((BitmapDrawable) drawable16).getBitmap());
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            Drawable drawable17 = resources.getDrawable(i26, null);
                            AbstractC22676k.m65748h(drawable17, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                            objM87133R2 = new C17885g(((BitmapDrawable) drawable17).getBitmap());
                            c28655q.m87172p0(objM87133R2);
                        }
                        C17885g c17885g9 = (C17885g) objM87133R2;
                        BitmapPainter bitmapPainter9 = new BitmapPainter(c17885g9, (((long) Math.min(c17885g9.f69577a.getHeight(), 140)) & 4294967295L) | (((long) c17885g9.f69577a.getWidth()) << 32));
                        Modifier modifierM3407d9 = AbstractC1102d.m3407d(1.0f, modifier2);
                        C2307m c2307m115 = C2299e.f9114w;
                        InterfaceC39127r0 interfaceC39127r0M66763d115 = AbstractC22989q.m66763d(c2307m115, false);
                        interfaceC4339a9 = interfaceC4339a8;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11111 = c28655q.m87165m();
                        Modifier modifierM118962N11111 = AbstractC37056f.m118962N(c28655q, modifierM3407d9);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        C0209i c0209i1114 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i1114, interfaceC39127r0M66763d115);
                        C0209i c0209i1115 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i1115, interfaceC28653p1M87165m11111);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            z25 = z19;
                            if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i1116 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q, c0209i1116, modifierM118962N11111);
                            Modifier modifier110 = modifier2;
                            float f11111117 = 8;
                            float f11111118 = 2 * f11111117;
                            Modifier modifierM3396r17 = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14), f11111118, 0.0f, 2);
                            i27 = i15;
                            C23010x c23010xM66775a17 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                            boolean z21119 = z24;
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m11112 = c28655q.m87165m();
                            Modifier modifierM118962N11112 = AbstractC37056f.m118962N(c28655q, modifierM3396r17);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i1114, c23010xM66775a17);
                            AbstractC28683x.m87239G(c28655q, c0209i1115, interfaceC28653p1M87165m11112);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i1116, modifierM118962N11112);
                            AbstractC29125c.m88522c(bitmapPainter9, null, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f11111118, 0.0f, 2), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
                            m41304i(c28655q, 0);
                            float f11111119 = 4;
                            float f111111110 = f11111119 * f11111117;
                            Modifier modifierM3398t17 = AbstractC1099a.m3398t(c2314t, 0.0f, f111111110, 0.0f, 0.0f, 13);
                            String strM21273g17 = AbstractC8693b.m21273g(AbstractC35950b.f153062G, c28655q, 0);
                            C38072d c38072d17 = C38072d.f163053a;
                            int i3111112 = C38072d.f163054b;
                            C2886a c2886aM8418P17 = c38072d17.m121952e(c28655q, i3111112).getT3();
                            long jM125430y17 = c38072d17.m121949b(c28655q, i3111112).getBrandWhite();
                            int i3111113 = C2886a.f11498d;
                            AbstractC30795n.m94707h(strM21273g17, modifierM3398t17, jM125430y17, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P17, null, c28655q, 48, i3111113 << 18, 196600);
                            C2886a c2886aM8430k17 = c38072d17.m121952e(c28655q, i3111112).getBtS();
                            C22976l1 c22976l1M3379a17 = AbstractC1099a.m3379a(0, 0.0f, 2);
                            TextResource.C8688b c8688bM21277k17 = AbstractC8693b.m21277k(AbstractC35950b.f153060E);
                            Integer numValueOf17 = Integer.valueOf(c38072d17.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward());
                            if ((i27 & 57344) == 16384) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            objM87133R3 = c28655q.m87133R();
                            if (z26) {
                                objM87133R3 = new C11699o(interfaceC4339a9, 24);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C11699o(interfaceC4339a9, 24);
                                c28655q.m87172p0(objM87133R3);
                            }
                            AbstractC27271o0.m82253b(c2314t, false, c8688bM21277k17, c2886aM8430k17, null, null, numValueOf17, null, false, c22976l1M3379a17, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.C8688b.f25889c << 6) | 906166278 | (i3111113 << 9), 0, 146);
                            AbstractC1090b.m3350e(C23016z.f90757a, z21119, AbstractC1099a.m3398t(c2314t, 0.0f, f11111118, 0.0f, 0.0f, 13), null, null, null, C14462d.f52794a.m41219b(), c28655q, 1573254 | ((i27 >> 3) & 112), 28);
                            AbstractC25012a.m73388u(35, f11111119, c2314t, c28655q, true);
                            WeakHashMap weakHashMap17 = C22944c2.f90553v;
                            float fMo43109a17 = AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a();
                            Modifier modifierM3419p17 = AbstractC1102d.m3419p(400, c2314t);
                            C2307m c2307m116 = C2299e.f9106I;
                            C1100b c1100b17 = C1100b.f4583a;
                            AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1099a.m3392n(c1100b17.mo3400a(modifierM3419p17, c2307m116), 0.0f, fMo43109a17, 1), C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4287324927L))), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 900.0f, 8), null, 0.0f, 6), c28655q, 0);
                            Modifier modifierM3394p17 = AbstractC1099a.m3394p(f111111110, c1100b17.mo3400a(c2314t, C2299e.f9105H));
                            InterfaceC39127r0 interfaceC39127r0M66763d116 = AbstractC22989q.m66763d(c2307m115, false);
                            iHashCode3 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m11113 = c28655q.m87165m();
                            Modifier modifierM118962N11113 = AbstractC37056f.m118962N(c28655q, modifierM3394p17);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i1114, interfaceC39127r0M66763d116);
                            AbstractC28683x.m87239G(c28655q, c0209i1115, interfaceC28653p1M87165m11113);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i1116, modifierM118962N11113);
                            int i3111114 = i27 << 3;
                            interfaceC4339a3 = interfaceC4339a7;
                            boolean z211110 = z25;
                            AbstractC13172e.m36939k(EnumC13178k.INTRO_V2, false, z211110, false, interfaceC4339a3, c28655q, (i3111114 & 896) | 6 | (i3111114 & 57344), 10);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(true);
                            interfaceC4339a5 = interfaceC4339a9;
                            z17 = z211110;
                            modifier3 = modifier110;
                            z18 = z21119;
                        } else {
                            z25 = z19;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        C0209i c0209i1117 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i1117, modifierM118962N11111);
                        Modifier modifier111 = modifier2;
                        float f111111111 = 8;
                        float f111111112 = 2 * f111111111;
                        Modifier modifierM3396r18 = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14), f111111112, 0.0f, 2);
                        i27 = i15;
                        C23010x c23010xM66775a18 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                        boolean z211111 = z24;
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11114 = c28655q.m87165m();
                        Modifier modifierM118962N11114 = AbstractC37056f.m118962N(c28655q, modifierM3396r18);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i1114, c23010xM66775a18);
                        AbstractC28683x.m87239G(c28655q, c0209i1115, interfaceC28653p1M87165m11114);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i1117, modifierM118962N11114);
                        AbstractC29125c.m88522c(bitmapPainter9, null, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f111111112, 0.0f, 2), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
                        m41304i(c28655q, 0);
                        float f111111113 = 4;
                        float f111111114 = f111111113 * f111111111;
                        Modifier modifierM3398t18 = AbstractC1099a.m3398t(c2314t, 0.0f, f111111114, 0.0f, 0.0f, 13);
                        String strM21273g18 = AbstractC8693b.m21273g(AbstractC35950b.f153062G, c28655q, 0);
                        C38072d c38072d18 = C38072d.f163053a;
                        int i3111115 = C38072d.f163054b;
                        C2886a c2886aM8418P18 = c38072d18.m121952e(c28655q, i3111115).getT3();
                        long jM125430y18 = c38072d18.m121949b(c28655q, i3111115).getBrandWhite();
                        int i3111116 = C2886a.f11498d;
                        AbstractC30795n.m94707h(strM21273g18, modifierM3398t18, jM125430y18, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P18, null, c28655q, 48, i3111116 << 18, 196600);
                        C2886a c2886aM8430k18 = c38072d18.m121952e(c28655q, i3111115).getBtS();
                        C22976l1 c22976l1M3379a18 = AbstractC1099a.m3379a(0, 0.0f, 2);
                        TextResource.C8688b c8688bM21277k18 = AbstractC8693b.m21277k(AbstractC35950b.f153060E);
                        Integer numValueOf18 = Integer.valueOf(c38072d18.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward());
                        if ((i27 & 57344) == 16384) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z26) {
                            objM87133R3 = new C11699o(interfaceC4339a9, 24);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C11699o(interfaceC4339a9, 24);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC27271o0.m82253b(c2314t, false, c8688bM21277k18, c2886aM8430k18, null, null, numValueOf18, null, false, c22976l1M3379a18, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.C8688b.f25889c << 6) | 906166278 | (i3111116 << 9), 0, 146);
                        AbstractC1090b.m3350e(C23016z.f90757a, z211111, AbstractC1099a.m3398t(c2314t, 0.0f, f111111112, 0.0f, 0.0f, 13), null, null, null, C14462d.f52794a.m41219b(), c28655q, 1573254 | ((i27 >> 3) & 112), 28);
                        AbstractC25012a.m73388u(35, f111111113, c2314t, c28655q, true);
                        WeakHashMap weakHashMap18 = C22944c2.f90553v;
                        float fMo43109a18 = AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a();
                        Modifier modifierM3419p18 = AbstractC1102d.m3419p(400, c2314t);
                        C2307m c2307m117 = C2299e.f9106I;
                        C1100b c1100b18 = C1100b.f4583a;
                        AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1099a.m3392n(c1100b18.mo3400a(modifierM3419p18, c2307m117), 0.0f, fMo43109a18, 1), C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4287324927L))), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 900.0f, 8), null, 0.0f, 6), c28655q, 0);
                        Modifier modifierM3394p18 = AbstractC1099a.m3394p(f111111114, c1100b18.mo3400a(c2314t, C2299e.f9105H));
                        InterfaceC39127r0 interfaceC39127r0M66763d117 = AbstractC22989q.m66763d(c2307m115, false);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11115 = c28655q.m87165m();
                        Modifier modifierM118962N11115 = AbstractC37056f.m118962N(c28655q, modifierM3394p18);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i1114, interfaceC39127r0M66763d117);
                        AbstractC28683x.m87239G(c28655q, c0209i1115, interfaceC28653p1M87165m11115);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i1117, modifierM118962N11115);
                        int i3111117 = i27 << 3;
                        interfaceC4339a3 = interfaceC4339a7;
                        boolean z211112 = z25;
                        AbstractC13172e.m36939k(EnumC13178k.INTRO_V2, false, z211112, false, interfaceC4339a3, c28655q, (i3111117 & 896) | 6 | (i3111117 & 57344), 10);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        interfaceC4339a5 = interfaceC4339a9;
                        z17 = z211112;
                        modifier3 = modifier111;
                        z18 = z211111;
                    } else {
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        z17 = z14;
                        z18 = z15;
                        interfaceC4339a5 = interfaceC4339a4;
                    }
                    interfaceC4339a6 = interfaceC4339a3;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C13421p(modifier3, z17, z18, interfaceC4339a6, interfaceC4339a5, i13, i14, 1);
                    }
                }
                i15 |= 24576;
                interfaceC4339a4 = interfaceC4339a2;
                if ((i15 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    c2314t = C2314t.f9131w;
                    if (i28 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i29 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    if (i16 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C13998z1(20);
                            c28655q.m87172p0(objM87133R5);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R5;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    if (i24 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C13998z1(21);
                            c28655q.m87172p0(objM87133R4);
                        }
                        interfaceC4339a8 = (InterfaceC4339a) objM87133R4;
                    } else {
                        interfaceC4339a8 = interfaceC4339a4;
                    }
                    i26 = AbstractC35949a.f153053b;
                    resources = (Resources) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4977c);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new TypedValue();
                        c28655q.m87172p0(objM87133R);
                    }
                    TypedValue typedValue10 = (TypedValue) objM87133R;
                    resources.getValue(i26, typedValue10, true);
                    CharSequence charSequence10 = typedValue10.string;
                    AbstractC22676k.m65747g(charSequence10);
                    zM87153g = c28655q.m87153g(charSequence10.toString());
                    objM87133R2 = c28655q.m87133R();
                    if (zM87153g) {
                        Drawable drawable18 = resources.getDrawable(i26, null);
                        AbstractC22676k.m65748h(drawable18, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                        objM87133R2 = new C17885g(((BitmapDrawable) drawable18).getBitmap());
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        Drawable drawable19 = resources.getDrawable(i26, null);
                        AbstractC22676k.m65748h(drawable19, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                        objM87133R2 = new C17885g(((BitmapDrawable) drawable19).getBitmap());
                        c28655q.m87172p0(objM87133R2);
                    }
                    C17885g c17885g10 = (C17885g) objM87133R2;
                    BitmapPainter bitmapPainter10 = new BitmapPainter(c17885g10, (((long) Math.min(c17885g10.f69577a.getHeight(), 140)) & 4294967295L) | (((long) c17885g10.f69577a.getWidth()) << 32));
                    Modifier modifierM3407d10 = AbstractC1102d.m3407d(1.0f, modifier2);
                    C2307m c2307m118 = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d118 = AbstractC22989q.m66763d(c2307m118, false);
                    interfaceC4339a9 = interfaceC4339a8;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11116 = c28655q.m87165m();
                    Modifier modifierM118962N11116 = AbstractC37056f.m118962N(c28655q, modifierM3407d10);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i1118 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i1118, interfaceC39127r0M66763d118);
                    C0209i c0209i1119 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i1119, interfaceC28653p1M87165m11116);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        z25 = z19;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i11110 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i11110, modifierM118962N11116);
                        Modifier modifier112 = modifier2;
                        float f111111115 = 8;
                        float f111111116 = 2 * f111111115;
                        Modifier modifierM3396r19 = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14), f111111116, 0.0f, 2);
                        i27 = i15;
                        C23010x c23010xM66775a19 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                        boolean z211113 = z24;
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11117 = c28655q.m87165m();
                        Modifier modifierM118962N11117 = AbstractC37056f.m118962N(c28655q, modifierM3396r19);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i1118, c23010xM66775a19);
                        AbstractC28683x.m87239G(c28655q, c0209i1119, interfaceC28653p1M87165m11117);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i11110, modifierM118962N11117);
                        AbstractC29125c.m88522c(bitmapPainter10, null, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f111111116, 0.0f, 2), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
                        m41304i(c28655q, 0);
                        float f111111117 = 4;
                        float f111111118 = f111111117 * f111111115;
                        Modifier modifierM3398t19 = AbstractC1099a.m3398t(c2314t, 0.0f, f111111118, 0.0f, 0.0f, 13);
                        String strM21273g19 = AbstractC8693b.m21273g(AbstractC35950b.f153062G, c28655q, 0);
                        C38072d c38072d19 = C38072d.f163053a;
                        int i3111118 = C38072d.f163054b;
                        C2886a c2886aM8418P19 = c38072d19.m121952e(c28655q, i3111118).getT3();
                        long jM125430y19 = c38072d19.m121949b(c28655q, i3111118).getBrandWhite();
                        int i3111119 = C2886a.f11498d;
                        AbstractC30795n.m94707h(strM21273g19, modifierM3398t19, jM125430y19, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P19, null, c28655q, 48, i3111119 << 18, 196600);
                        C2886a c2886aM8430k19 = c38072d19.m121952e(c28655q, i3111118).getBtS();
                        C22976l1 c22976l1M3379a19 = AbstractC1099a.m3379a(0, 0.0f, 2);
                        TextResource.C8688b c8688bM21277k19 = AbstractC8693b.m21277k(AbstractC35950b.f153060E);
                        Integer numValueOf19 = Integer.valueOf(c38072d19.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward());
                        if ((i27 & 57344) == 16384) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z26) {
                            objM87133R3 = new C11699o(interfaceC4339a9, 24);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C11699o(interfaceC4339a9, 24);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC27271o0.m82253b(c2314t, false, c8688bM21277k19, c2886aM8430k19, null, null, numValueOf19, null, false, c22976l1M3379a19, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.C8688b.f25889c << 6) | 906166278 | (i3111119 << 9), 0, 146);
                        AbstractC1090b.m3350e(C23016z.f90757a, z211113, AbstractC1099a.m3398t(c2314t, 0.0f, f111111116, 0.0f, 0.0f, 13), null, null, null, C14462d.f52794a.m41219b(), c28655q, 1573254 | ((i27 >> 3) & 112), 28);
                        AbstractC25012a.m73388u(35, f111111117, c2314t, c28655q, true);
                        WeakHashMap weakHashMap19 = C22944c2.f90553v;
                        float fMo43109a19 = AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a();
                        Modifier modifierM3419p19 = AbstractC1102d.m3419p(400, c2314t);
                        C2307m c2307m119 = C2299e.f9106I;
                        C1100b c1100b19 = C1100b.f4583a;
                        AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1099a.m3392n(c1100b19.mo3400a(modifierM3419p19, c2307m119), 0.0f, fMo43109a19, 1), C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4287324927L))), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 900.0f, 8), null, 0.0f, 6), c28655q, 0);
                        Modifier modifierM3394p19 = AbstractC1099a.m3394p(f111111118, c1100b19.mo3400a(c2314t, C2299e.f9105H));
                        InterfaceC39127r0 interfaceC39127r0M66763d119 = AbstractC22989q.m66763d(c2307m118, false);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11118 = c28655q.m87165m();
                        Modifier modifierM118962N11118 = AbstractC37056f.m118962N(c28655q, modifierM3394p19);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i1118, interfaceC39127r0M66763d119);
                        AbstractC28683x.m87239G(c28655q, c0209i1119, interfaceC28653p1M87165m11118);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i11110, modifierM118962N11118);
                        int i31111110 = i27 << 3;
                        interfaceC4339a3 = interfaceC4339a7;
                        boolean z211114 = z25;
                        AbstractC13172e.m36939k(EnumC13178k.INTRO_V2, false, z211114, false, interfaceC4339a3, c28655q, (i31111110 & 896) | 6 | (i31111110 & 57344), 10);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        interfaceC4339a5 = interfaceC4339a9;
                        z17 = z211114;
                        modifier3 = modifier112;
                        z18 = z211113;
                    } else {
                        z25 = z19;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    C0209i c0209i11111 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i11111, modifierM118962N11116);
                    Modifier modifier113 = modifier2;
                    float f111111119 = 8;
                    float f1111111110 = 2 * f111111119;
                    Modifier modifierM3396r110 = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14), f1111111110, 0.0f, 2);
                    i27 = i15;
                    C23010x c23010xM66775a110 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    boolean z211115 = z24;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11119 = c28655q.m87165m();
                    Modifier modifierM118962N11119 = AbstractC37056f.m118962N(c28655q, modifierM3396r110);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1118, c23010xM66775a110);
                    AbstractC28683x.m87239G(c28655q, c0209i1119, interfaceC28653p1M87165m11119);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11111, modifierM118962N11119);
                    AbstractC29125c.m88522c(bitmapPainter10, null, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f1111111110, 0.0f, 2), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
                    m41304i(c28655q, 0);
                    float f1111111111 = 4;
                    float f1111111112 = f1111111111 * f111111119;
                    Modifier modifierM3398t110 = AbstractC1099a.m3398t(c2314t, 0.0f, f1111111112, 0.0f, 0.0f, 13);
                    String strM21273g110 = AbstractC8693b.m21273g(AbstractC35950b.f153062G, c28655q, 0);
                    C38072d c38072d110 = C38072d.f163053a;
                    int i31111111 = C38072d.f163054b;
                    C2886a c2886aM8418P110 = c38072d110.m121952e(c28655q, i31111111).getT3();
                    long jM125430y110 = c38072d110.m121949b(c28655q, i31111111).getBrandWhite();
                    int i31111112 = C2886a.f11498d;
                    AbstractC30795n.m94707h(strM21273g110, modifierM3398t110, jM125430y110, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P110, null, c28655q, 48, i31111112 << 18, 196600);
                    C2886a c2886aM8430k110 = c38072d110.m121952e(c28655q, i31111111).getBtS();
                    C22976l1 c22976l1M3379a110 = AbstractC1099a.m3379a(0, 0.0f, 2);
                    TextResource.C8688b c8688bM21277k110 = AbstractC8693b.m21277k(AbstractC35950b.f153060E);
                    Integer numValueOf110 = Integer.valueOf(c38072d110.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward());
                    if ((i27 & 57344) == 16384) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z26) {
                        objM87133R3 = new C11699o(interfaceC4339a9, 24);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C11699o(interfaceC4339a9, 24);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC27271o0.m82253b(c2314t, false, c8688bM21277k110, c2886aM8430k110, null, null, numValueOf110, null, false, c22976l1M3379a110, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.C8688b.f25889c << 6) | 906166278 | (i31111112 << 9), 0, 146);
                    AbstractC1090b.m3350e(C23016z.f90757a, z211115, AbstractC1099a.m3398t(c2314t, 0.0f, f1111111110, 0.0f, 0.0f, 13), null, null, null, C14462d.f52794a.m41219b(), c28655q, 1573254 | ((i27 >> 3) & 112), 28);
                    AbstractC25012a.m73388u(35, f1111111111, c2314t, c28655q, true);
                    WeakHashMap weakHashMap110 = C22944c2.f90553v;
                    float fMo43109a110 = AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a();
                    Modifier modifierM3419p110 = AbstractC1102d.m3419p(400, c2314t);
                    C2307m c2307m1110 = C2299e.f9106I;
                    C1100b c1100b110 = C1100b.f4583a;
                    AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1099a.m3392n(c1100b110.mo3400a(modifierM3419p110, c2307m1110), 0.0f, fMo43109a110, 1), C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4287324927L))), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 900.0f, 8), null, 0.0f, 6), c28655q, 0);
                    Modifier modifierM3394p110 = AbstractC1099a.m3394p(f1111111112, c1100b110.mo3400a(c2314t, C2299e.f9105H));
                    InterfaceC39127r0 interfaceC39127r0M66763d1110 = AbstractC22989q.m66763d(c2307m118, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111110 = c28655q.m87165m();
                    Modifier modifierM118962N111110 = AbstractC37056f.m118962N(c28655q, modifierM3394p110);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1118, interfaceC39127r0M66763d1110);
                    AbstractC28683x.m87239G(c28655q, c0209i1119, interfaceC28653p1M87165m111110);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11111, modifierM118962N111110);
                    int i31111113 = i27 << 3;
                    interfaceC4339a3 = interfaceC4339a7;
                    boolean z211116 = z25;
                    AbstractC13172e.m36939k(EnumC13178k.INTRO_V2, false, z211116, false, interfaceC4339a3, c28655q, (i31111113 & 896) | 6 | (i31111113 & 57344), 10);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    interfaceC4339a5 = interfaceC4339a9;
                    z17 = z211116;
                    modifier3 = modifier113;
                    z18 = z211115;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z17 = z14;
                    z18 = z15;
                    interfaceC4339a5 = interfaceC4339a4;
                }
                interfaceC4339a6 = interfaceC4339a3;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13421p(modifier3, z17, z18, interfaceC4339a6, interfaceC4339a5, i13, i14, 1);
                }
            }
            i15 |= 3072;
            interfaceC4339a3 = interfaceC4339a;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a4 = interfaceC4339a2;
                    if (c28655q.m87157i(interfaceC4339a4)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((i15 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    c2314t = C2314t.f9131w;
                    if (i28 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i29 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    if (i16 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C13998z1(20);
                            c28655q.m87172p0(objM87133R5);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R5;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    if (i24 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C13998z1(21);
                            c28655q.m87172p0(objM87133R4);
                        }
                        interfaceC4339a8 = (InterfaceC4339a) objM87133R4;
                    } else {
                        interfaceC4339a8 = interfaceC4339a4;
                    }
                    i26 = AbstractC35949a.f153053b;
                    resources = (Resources) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4977c);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new TypedValue();
                        c28655q.m87172p0(objM87133R);
                    }
                    TypedValue typedValue11 = (TypedValue) objM87133R;
                    resources.getValue(i26, typedValue11, true);
                    CharSequence charSequence11 = typedValue11.string;
                    AbstractC22676k.m65747g(charSequence11);
                    zM87153g = c28655q.m87153g(charSequence11.toString());
                    objM87133R2 = c28655q.m87133R();
                    if (zM87153g) {
                        Drawable drawable110 = resources.getDrawable(i26, null);
                        AbstractC22676k.m65748h(drawable110, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                        objM87133R2 = new C17885g(((BitmapDrawable) drawable110).getBitmap());
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        Drawable drawable111 = resources.getDrawable(i26, null);
                        AbstractC22676k.m65748h(drawable111, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                        objM87133R2 = new C17885g(((BitmapDrawable) drawable111).getBitmap());
                        c28655q.m87172p0(objM87133R2);
                    }
                    C17885g c17885g11 = (C17885g) objM87133R2;
                    BitmapPainter bitmapPainter11 = new BitmapPainter(c17885g11, (((long) Math.min(c17885g11.f69577a.getHeight(), 140)) & 4294967295L) | (((long) c17885g11.f69577a.getWidth()) << 32));
                    Modifier modifierM3407d11 = AbstractC1102d.m3407d(1.0f, modifier2);
                    C2307m c2307m1111 = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d1111 = AbstractC22989q.m66763d(c2307m1111, false);
                    interfaceC4339a9 = interfaceC4339a8;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111111 = c28655q.m87165m();
                    Modifier modifierM118962N111111 = AbstractC37056f.m118962N(c28655q, modifierM3407d11);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i11112 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i11112, interfaceC39127r0M66763d1111);
                    C0209i c0209i11113 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i11113, interfaceC28653p1M87165m111111);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        z25 = z19;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i11114 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i11114, modifierM118962N111111);
                        Modifier modifier114 = modifier2;
                        float f1111111113 = 8;
                        float f1111111114 = 2 * f1111111113;
                        Modifier modifierM3396r111 = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14), f1111111114, 0.0f, 2);
                        i27 = i15;
                        C23010x c23010xM66775a111 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                        boolean z211117 = z24;
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111112 = c28655q.m87165m();
                        Modifier modifierM118962N111112 = AbstractC37056f.m118962N(c28655q, modifierM3396r111);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i11112, c23010xM66775a111);
                        AbstractC28683x.m87239G(c28655q, c0209i11113, interfaceC28653p1M87165m111112);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i11114, modifierM118962N111112);
                        AbstractC29125c.m88522c(bitmapPainter11, null, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f1111111114, 0.0f, 2), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
                        m41304i(c28655q, 0);
                        float f1111111115 = 4;
                        float f1111111116 = f1111111115 * f1111111113;
                        Modifier modifierM3398t111 = AbstractC1099a.m3398t(c2314t, 0.0f, f1111111116, 0.0f, 0.0f, 13);
                        String strM21273g111 = AbstractC8693b.m21273g(AbstractC35950b.f153062G, c28655q, 0);
                        C38072d c38072d111 = C38072d.f163053a;
                        int i31111114 = C38072d.f163054b;
                        C2886a c2886aM8418P111 = c38072d111.m121952e(c28655q, i31111114).getT3();
                        long jM125430y111 = c38072d111.m121949b(c28655q, i31111114).getBrandWhite();
                        int i31111115 = C2886a.f11498d;
                        AbstractC30795n.m94707h(strM21273g111, modifierM3398t111, jM125430y111, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P111, null, c28655q, 48, i31111115 << 18, 196600);
                        C2886a c2886aM8430k111 = c38072d111.m121952e(c28655q, i31111114).getBtS();
                        C22976l1 c22976l1M3379a111 = AbstractC1099a.m3379a(0, 0.0f, 2);
                        TextResource.C8688b c8688bM21277k111 = AbstractC8693b.m21277k(AbstractC35950b.f153060E);
                        Integer numValueOf111 = Integer.valueOf(c38072d111.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward());
                        if ((i27 & 57344) == 16384) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z26) {
                            objM87133R3 = new C11699o(interfaceC4339a9, 24);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C11699o(interfaceC4339a9, 24);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC27271o0.m82253b(c2314t, false, c8688bM21277k111, c2886aM8430k111, null, null, numValueOf111, null, false, c22976l1M3379a111, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.C8688b.f25889c << 6) | 906166278 | (i31111115 << 9), 0, 146);
                        AbstractC1090b.m3350e(C23016z.f90757a, z211117, AbstractC1099a.m3398t(c2314t, 0.0f, f1111111114, 0.0f, 0.0f, 13), null, null, null, C14462d.f52794a.m41219b(), c28655q, 1573254 | ((i27 >> 3) & 112), 28);
                        AbstractC25012a.m73388u(35, f1111111115, c2314t, c28655q, true);
                        WeakHashMap weakHashMap111 = C22944c2.f90553v;
                        float fMo43109a111 = AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a();
                        Modifier modifierM3419p111 = AbstractC1102d.m3419p(400, c2314t);
                        C2307m c2307m1112 = C2299e.f9106I;
                        C1100b c1100b111 = C1100b.f4583a;
                        AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1099a.m3392n(c1100b111.mo3400a(modifierM3419p111, c2307m1112), 0.0f, fMo43109a111, 1), C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4287324927L))), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 900.0f, 8), null, 0.0f, 6), c28655q, 0);
                        Modifier modifierM3394p111 = AbstractC1099a.m3394p(f1111111116, c1100b111.mo3400a(c2314t, C2299e.f9105H));
                        InterfaceC39127r0 interfaceC39127r0M66763d1112 = AbstractC22989q.m66763d(c2307m1111, false);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111113 = c28655q.m87165m();
                        Modifier modifierM118962N111113 = AbstractC37056f.m118962N(c28655q, modifierM3394p111);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i11112, interfaceC39127r0M66763d1112);
                        AbstractC28683x.m87239G(c28655q, c0209i11113, interfaceC28653p1M87165m111113);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i11114, modifierM118962N111113);
                        int i31111116 = i27 << 3;
                        interfaceC4339a3 = interfaceC4339a7;
                        boolean z211118 = z25;
                        AbstractC13172e.m36939k(EnumC13178k.INTRO_V2, false, z211118, false, interfaceC4339a3, c28655q, (i31111116 & 896) | 6 | (i31111116 & 57344), 10);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        interfaceC4339a5 = interfaceC4339a9;
                        z17 = z211118;
                        modifier3 = modifier114;
                        z18 = z211117;
                    } else {
                        z25 = z19;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    C0209i c0209i11115 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i11115, modifierM118962N111111);
                    Modifier modifier115 = modifier2;
                    float f1111111117 = 8;
                    float f1111111118 = 2 * f1111111117;
                    Modifier modifierM3396r112 = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14), f1111111118, 0.0f, 2);
                    i27 = i15;
                    C23010x c23010xM66775a112 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    boolean z211119 = z24;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111114 = c28655q.m87165m();
                    Modifier modifierM118962N111114 = AbstractC37056f.m118962N(c28655q, modifierM3396r112);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11112, c23010xM66775a112);
                    AbstractC28683x.m87239G(c28655q, c0209i11113, interfaceC28653p1M87165m111114);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11115, modifierM118962N111114);
                    AbstractC29125c.m88522c(bitmapPainter11, null, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f1111111118, 0.0f, 2), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
                    m41304i(c28655q, 0);
                    float f1111111119 = 4;
                    float f11111111110 = f1111111119 * f1111111117;
                    Modifier modifierM3398t112 = AbstractC1099a.m3398t(c2314t, 0.0f, f11111111110, 0.0f, 0.0f, 13);
                    String strM21273g112 = AbstractC8693b.m21273g(AbstractC35950b.f153062G, c28655q, 0);
                    C38072d c38072d112 = C38072d.f163053a;
                    int i31111117 = C38072d.f163054b;
                    C2886a c2886aM8418P112 = c38072d112.m121952e(c28655q, i31111117).getT3();
                    long jM125430y112 = c38072d112.m121949b(c28655q, i31111117).getBrandWhite();
                    int i31111118 = C2886a.f11498d;
                    AbstractC30795n.m94707h(strM21273g112, modifierM3398t112, jM125430y112, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P112, null, c28655q, 48, i31111118 << 18, 196600);
                    C2886a c2886aM8430k112 = c38072d112.m121952e(c28655q, i31111117).getBtS();
                    C22976l1 c22976l1M3379a112 = AbstractC1099a.m3379a(0, 0.0f, 2);
                    TextResource.C8688b c8688bM21277k112 = AbstractC8693b.m21277k(AbstractC35950b.f153060E);
                    Integer numValueOf112 = Integer.valueOf(c38072d112.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward());
                    if ((i27 & 57344) == 16384) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z26) {
                        objM87133R3 = new C11699o(interfaceC4339a9, 24);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C11699o(interfaceC4339a9, 24);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC27271o0.m82253b(c2314t, false, c8688bM21277k112, c2886aM8430k112, null, null, numValueOf112, null, false, c22976l1M3379a112, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.C8688b.f25889c << 6) | 906166278 | (i31111118 << 9), 0, 146);
                    AbstractC1090b.m3350e(C23016z.f90757a, z211119, AbstractC1099a.m3398t(c2314t, 0.0f, f1111111118, 0.0f, 0.0f, 13), null, null, null, C14462d.f52794a.m41219b(), c28655q, 1573254 | ((i27 >> 3) & 112), 28);
                    AbstractC25012a.m73388u(35, f1111111119, c2314t, c28655q, true);
                    WeakHashMap weakHashMap112 = C22944c2.f90553v;
                    float fMo43109a112 = AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a();
                    Modifier modifierM3419p112 = AbstractC1102d.m3419p(400, c2314t);
                    C2307m c2307m1113 = C2299e.f9106I;
                    C1100b c1100b112 = C1100b.f4583a;
                    AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1099a.m3392n(c1100b112.mo3400a(modifierM3419p112, c2307m1113), 0.0f, fMo43109a112, 1), C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4287324927L))), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 900.0f, 8), null, 0.0f, 6), c28655q, 0);
                    Modifier modifierM3394p112 = AbstractC1099a.m3394p(f11111111110, c1100b112.mo3400a(c2314t, C2299e.f9105H));
                    InterfaceC39127r0 interfaceC39127r0M66763d1113 = AbstractC22989q.m66763d(c2307m1111, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111115 = c28655q.m87165m();
                    Modifier modifierM118962N111115 = AbstractC37056f.m118962N(c28655q, modifierM3394p112);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11112, interfaceC39127r0M66763d1113);
                    AbstractC28683x.m87239G(c28655q, c0209i11113, interfaceC28653p1M87165m111115);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11115, modifierM118962N111115);
                    int i31111119 = i27 << 3;
                    interfaceC4339a3 = interfaceC4339a7;
                    boolean z2111110 = z25;
                    AbstractC13172e.m36939k(EnumC13178k.INTRO_V2, false, z2111110, false, interfaceC4339a3, c28655q, (i31111119 & 896) | 6 | (i31111119 & 57344), 10);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    interfaceC4339a5 = interfaceC4339a9;
                    z17 = z2111110;
                    modifier3 = modifier115;
                    z18 = z211119;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z17 = z14;
                    z18 = z15;
                    interfaceC4339a5 = interfaceC4339a4;
                }
                interfaceC4339a6 = interfaceC4339a3;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13421p(modifier3, z17, z18, interfaceC4339a6, interfaceC4339a5, i13, i14, 1);
                }
            }
            i15 |= 24576;
            interfaceC4339a4 = interfaceC4339a2;
            if ((i15 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                c2314t = C2314t.f9131w;
                if (i28 != 0) {
                    modifier2 = c2314t;
                }
                if (i29 != 0) {
                    z19 = false;
                } else {
                    z19 = z14;
                }
                if (i16 != 0) {
                    z24 = false;
                } else {
                    z24 = z15;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C13998z1(20);
                        c28655q.m87172p0(objM87133R5);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R5;
                } else {
                    interfaceC4339a7 = interfaceC4339a3;
                }
                if (i24 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C13998z1(21);
                        c28655q.m87172p0(objM87133R4);
                    }
                    interfaceC4339a8 = (InterfaceC4339a) objM87133R4;
                } else {
                    interfaceC4339a8 = interfaceC4339a4;
                }
                i26 = AbstractC35949a.f153053b;
                resources = (Resources) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4977c);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new TypedValue();
                    c28655q.m87172p0(objM87133R);
                }
                TypedValue typedValue12 = (TypedValue) objM87133R;
                resources.getValue(i26, typedValue12, true);
                CharSequence charSequence12 = typedValue12.string;
                AbstractC22676k.m65747g(charSequence12);
                zM87153g = c28655q.m87153g(charSequence12.toString());
                objM87133R2 = c28655q.m87133R();
                if (zM87153g) {
                    Drawable drawable112 = resources.getDrawable(i26, null);
                    AbstractC22676k.m65748h(drawable112, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                    objM87133R2 = new C17885g(((BitmapDrawable) drawable112).getBitmap());
                    c28655q.m87172p0(objM87133R2);
                } else {
                    Drawable drawable113 = resources.getDrawable(i26, null);
                    AbstractC22676k.m65748h(drawable113, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                    objM87133R2 = new C17885g(((BitmapDrawable) drawable113).getBitmap());
                    c28655q.m87172p0(objM87133R2);
                }
                C17885g c17885g12 = (C17885g) objM87133R2;
                BitmapPainter bitmapPainter12 = new BitmapPainter(c17885g12, (((long) Math.min(c17885g12.f69577a.getHeight(), 140)) & 4294967295L) | (((long) c17885g12.f69577a.getWidth()) << 32));
                Modifier modifierM3407d12 = AbstractC1102d.m3407d(1.0f, modifier2);
                C2307m c2307m1114 = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d1114 = AbstractC22989q.m66763d(c2307m1114, false);
                interfaceC4339a9 = interfaceC4339a8;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111116 = c28655q.m87165m();
                Modifier modifierM118962N111116 = AbstractC37056f.m118962N(c28655q, modifierM3407d12);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i11116 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i11116, interfaceC39127r0M66763d1114);
                C0209i c0209i11117 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i11117, interfaceC28653p1M87165m111116);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    z25 = z19;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i11118 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i11118, modifierM118962N111116);
                    Modifier modifier116 = modifier2;
                    float f11111111111 = 8;
                    float f11111111112 = 2 * f11111111111;
                    Modifier modifierM3396r113 = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14), f11111111112, 0.0f, 2);
                    i27 = i15;
                    C23010x c23010xM66775a113 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    boolean z2111111 = z24;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111117 = c28655q.m87165m();
                    Modifier modifierM118962N111117 = AbstractC37056f.m118962N(c28655q, modifierM3396r113);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11116, c23010xM66775a113);
                    AbstractC28683x.m87239G(c28655q, c0209i11117, interfaceC28653p1M87165m111117);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11118, modifierM118962N111117);
                    AbstractC29125c.m88522c(bitmapPainter12, null, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f11111111112, 0.0f, 2), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
                    m41304i(c28655q, 0);
                    float f11111111113 = 4;
                    float f11111111114 = f11111111113 * f11111111111;
                    Modifier modifierM3398t113 = AbstractC1099a.m3398t(c2314t, 0.0f, f11111111114, 0.0f, 0.0f, 13);
                    String strM21273g113 = AbstractC8693b.m21273g(AbstractC35950b.f153062G, c28655q, 0);
                    C38072d c38072d113 = C38072d.f163053a;
                    int i311111110 = C38072d.f163054b;
                    C2886a c2886aM8418P113 = c38072d113.m121952e(c28655q, i311111110).getT3();
                    long jM125430y113 = c38072d113.m121949b(c28655q, i311111110).getBrandWhite();
                    int i311111111 = C2886a.f11498d;
                    AbstractC30795n.m94707h(strM21273g113, modifierM3398t113, jM125430y113, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P113, null, c28655q, 48, i311111111 << 18, 196600);
                    C2886a c2886aM8430k113 = c38072d113.m121952e(c28655q, i311111110).getBtS();
                    C22976l1 c22976l1M3379a113 = AbstractC1099a.m3379a(0, 0.0f, 2);
                    TextResource.C8688b c8688bM21277k113 = AbstractC8693b.m21277k(AbstractC35950b.f153060E);
                    Integer numValueOf113 = Integer.valueOf(c38072d113.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward());
                    if ((i27 & 57344) == 16384) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z26) {
                        objM87133R3 = new C11699o(interfaceC4339a9, 24);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C11699o(interfaceC4339a9, 24);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC27271o0.m82253b(c2314t, false, c8688bM21277k113, c2886aM8430k113, null, null, numValueOf113, null, false, c22976l1M3379a113, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.C8688b.f25889c << 6) | 906166278 | (i311111111 << 9), 0, 146);
                    AbstractC1090b.m3350e(C23016z.f90757a, z2111111, AbstractC1099a.m3398t(c2314t, 0.0f, f11111111112, 0.0f, 0.0f, 13), null, null, null, C14462d.f52794a.m41219b(), c28655q, 1573254 | ((i27 >> 3) & 112), 28);
                    AbstractC25012a.m73388u(35, f11111111113, c2314t, c28655q, true);
                    WeakHashMap weakHashMap113 = C22944c2.f90553v;
                    float fMo43109a113 = AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a();
                    Modifier modifierM3419p113 = AbstractC1102d.m3419p(400, c2314t);
                    C2307m c2307m1115 = C2299e.f9106I;
                    C1100b c1100b113 = C1100b.f4583a;
                    AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1099a.m3392n(c1100b113.mo3400a(modifierM3419p113, c2307m1115), 0.0f, fMo43109a113, 1), C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4287324927L))), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 900.0f, 8), null, 0.0f, 6), c28655q, 0);
                    Modifier modifierM3394p113 = AbstractC1099a.m3394p(f11111111114, c1100b113.mo3400a(c2314t, C2299e.f9105H));
                    InterfaceC39127r0 interfaceC39127r0M66763d1115 = AbstractC22989q.m66763d(c2307m1114, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111118 = c28655q.m87165m();
                    Modifier modifierM118962N111118 = AbstractC37056f.m118962N(c28655q, modifierM3394p113);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11116, interfaceC39127r0M66763d1115);
                    AbstractC28683x.m87239G(c28655q, c0209i11117, interfaceC28653p1M87165m111118);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11118, modifierM118962N111118);
                    int i311111112 = i27 << 3;
                    interfaceC4339a3 = interfaceC4339a7;
                    boolean z2111112 = z25;
                    AbstractC13172e.m36939k(EnumC13178k.INTRO_V2, false, z2111112, false, interfaceC4339a3, c28655q, (i311111112 & 896) | 6 | (i311111112 & 57344), 10);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    interfaceC4339a5 = interfaceC4339a9;
                    z17 = z2111112;
                    modifier3 = modifier116;
                    z18 = z2111111;
                } else {
                    z25 = z19;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i11119 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i11119, modifierM118962N111116);
                Modifier modifier117 = modifier2;
                float f11111111115 = 8;
                float f11111111116 = 2 * f11111111115;
                Modifier modifierM3396r114 = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14), f11111111116, 0.0f, 2);
                i27 = i15;
                C23010x c23010xM66775a114 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                boolean z2111113 = z24;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111119 = c28655q.m87165m();
                Modifier modifierM118962N111119 = AbstractC37056f.m118962N(c28655q, modifierM3396r114);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i11116, c23010xM66775a114);
                AbstractC28683x.m87239G(c28655q, c0209i11117, interfaceC28653p1M87165m111119);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i11119, modifierM118962N111119);
                AbstractC29125c.m88522c(bitmapPainter12, null, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f11111111116, 0.0f, 2), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
                m41304i(c28655q, 0);
                float f11111111117 = 4;
                float f11111111118 = f11111111117 * f11111111115;
                Modifier modifierM3398t114 = AbstractC1099a.m3398t(c2314t, 0.0f, f11111111118, 0.0f, 0.0f, 13);
                String strM21273g114 = AbstractC8693b.m21273g(AbstractC35950b.f153062G, c28655q, 0);
                C38072d c38072d114 = C38072d.f163053a;
                int i311111113 = C38072d.f163054b;
                C2886a c2886aM8418P114 = c38072d114.m121952e(c28655q, i311111113).getT3();
                long jM125430y114 = c38072d114.m121949b(c28655q, i311111113).getBrandWhite();
                int i311111114 = C2886a.f11498d;
                AbstractC30795n.m94707h(strM21273g114, modifierM3398t114, jM125430y114, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P114, null, c28655q, 48, i311111114 << 18, 196600);
                C2886a c2886aM8430k114 = c38072d114.m121952e(c28655q, i311111113).getBtS();
                C22976l1 c22976l1M3379a114 = AbstractC1099a.m3379a(0, 0.0f, 2);
                TextResource.C8688b c8688bM21277k114 = AbstractC8693b.m21277k(AbstractC35950b.f153060E);
                Integer numValueOf114 = Integer.valueOf(c38072d114.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward());
                if ((i27 & 57344) == 16384) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z26) {
                    objM87133R3 = new C11699o(interfaceC4339a9, 24);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C11699o(interfaceC4339a9, 24);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC27271o0.m82253b(c2314t, false, c8688bM21277k114, c2886aM8430k114, null, null, numValueOf114, null, false, c22976l1M3379a114, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.C8688b.f25889c << 6) | 906166278 | (i311111114 << 9), 0, 146);
                AbstractC1090b.m3350e(C23016z.f90757a, z2111113, AbstractC1099a.m3398t(c2314t, 0.0f, f11111111116, 0.0f, 0.0f, 13), null, null, null, C14462d.f52794a.m41219b(), c28655q, 1573254 | ((i27 >> 3) & 112), 28);
                AbstractC25012a.m73388u(35, f11111111117, c2314t, c28655q, true);
                WeakHashMap weakHashMap114 = C22944c2.f90553v;
                float fMo43109a114 = AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a();
                Modifier modifierM3419p114 = AbstractC1102d.m3419p(400, c2314t);
                C2307m c2307m1116 = C2299e.f9106I;
                C1100b c1100b114 = C1100b.f4583a;
                AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1099a.m3392n(c1100b114.mo3400a(modifierM3419p114, c2307m1116), 0.0f, fMo43109a114, 1), C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4287324927L))), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 900.0f, 8), null, 0.0f, 6), c28655q, 0);
                Modifier modifierM3394p114 = AbstractC1099a.m3394p(f11111111118, c1100b114.mo3400a(c2314t, C2299e.f9105H));
                InterfaceC39127r0 interfaceC39127r0M66763d1116 = AbstractC22989q.m66763d(c2307m1114, false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111110 = c28655q.m87165m();
                Modifier modifierM118962N1111110 = AbstractC37056f.m118962N(c28655q, modifierM3394p114);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i11116, interfaceC39127r0M66763d1116);
                AbstractC28683x.m87239G(c28655q, c0209i11117, interfaceC28653p1M87165m1111110);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i11119, modifierM118962N1111110);
                int i311111115 = i27 << 3;
                interfaceC4339a3 = interfaceC4339a7;
                boolean z2111114 = z25;
                AbstractC13172e.m36939k(EnumC13178k.INTRO_V2, false, z2111114, false, interfaceC4339a3, c28655q, (i311111115 & 896) | 6 | (i311111115 & 57344), 10);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                interfaceC4339a5 = interfaceC4339a9;
                z17 = z2111114;
                modifier3 = modifier117;
                z18 = z2111113;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z17 = z14;
                z18 = z15;
                interfaceC4339a5 = interfaceC4339a4;
            }
            interfaceC4339a6 = interfaceC4339a3;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13421p(modifier3, z17, z18, interfaceC4339a6, interfaceC4339a5, i13, i14, 1);
            }
        }
        i15 |= 384;
        z15 = z13;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4339a3 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a3)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a4 = interfaceC4339a2;
                    if (c28655q.m87157i(interfaceC4339a4)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((i15 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    c2314t = C2314t.f9131w;
                    if (i28 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i29 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    if (i16 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C13998z1(20);
                            c28655q.m87172p0(objM87133R5);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R5;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    if (i24 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C13998z1(21);
                            c28655q.m87172p0(objM87133R4);
                        }
                        interfaceC4339a8 = (InterfaceC4339a) objM87133R4;
                    } else {
                        interfaceC4339a8 = interfaceC4339a4;
                    }
                    i26 = AbstractC35949a.f153053b;
                    resources = (Resources) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4977c);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new TypedValue();
                        c28655q.m87172p0(objM87133R);
                    }
                    TypedValue typedValue13 = (TypedValue) objM87133R;
                    resources.getValue(i26, typedValue13, true);
                    CharSequence charSequence13 = typedValue13.string;
                    AbstractC22676k.m65747g(charSequence13);
                    zM87153g = c28655q.m87153g(charSequence13.toString());
                    objM87133R2 = c28655q.m87133R();
                    if (zM87153g) {
                        Drawable drawable114 = resources.getDrawable(i26, null);
                        AbstractC22676k.m65748h(drawable114, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                        objM87133R2 = new C17885g(((BitmapDrawable) drawable114).getBitmap());
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        Drawable drawable115 = resources.getDrawable(i26, null);
                        AbstractC22676k.m65748h(drawable115, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                        objM87133R2 = new C17885g(((BitmapDrawable) drawable115).getBitmap());
                        c28655q.m87172p0(objM87133R2);
                    }
                    C17885g c17885g13 = (C17885g) objM87133R2;
                    BitmapPainter bitmapPainter13 = new BitmapPainter(c17885g13, (((long) Math.min(c17885g13.f69577a.getHeight(), 140)) & 4294967295L) | (((long) c17885g13.f69577a.getWidth()) << 32));
                    Modifier modifierM3407d13 = AbstractC1102d.m3407d(1.0f, modifier2);
                    C2307m c2307m1117 = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d1117 = AbstractC22989q.m66763d(c2307m1117, false);
                    interfaceC4339a9 = interfaceC4339a8;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111111 = c28655q.m87165m();
                    Modifier modifierM118962N1111111 = AbstractC37056f.m118962N(c28655q, modifierM3407d13);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i111110 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i111110, interfaceC39127r0M66763d1117);
                    C0209i c0209i111111 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i111111, interfaceC28653p1M87165m1111111);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        z25 = z19;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i111112 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i111112, modifierM118962N1111111);
                        Modifier modifier118 = modifier2;
                        float f11111111119 = 8;
                        float f111111111110 = 2 * f11111111119;
                        Modifier modifierM3396r115 = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14), f111111111110, 0.0f, 2);
                        i27 = i15;
                        C23010x c23010xM66775a115 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                        boolean z2111115 = z24;
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111112 = c28655q.m87165m();
                        Modifier modifierM118962N1111112 = AbstractC37056f.m118962N(c28655q, modifierM3396r115);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i111110, c23010xM66775a115);
                        AbstractC28683x.m87239G(c28655q, c0209i111111, interfaceC28653p1M87165m1111112);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i111112, modifierM118962N1111112);
                        AbstractC29125c.m88522c(bitmapPainter13, null, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f111111111110, 0.0f, 2), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
                        m41304i(c28655q, 0);
                        float f111111111111 = 4;
                        float f111111111112 = f111111111111 * f11111111119;
                        Modifier modifierM3398t115 = AbstractC1099a.m3398t(c2314t, 0.0f, f111111111112, 0.0f, 0.0f, 13);
                        String strM21273g115 = AbstractC8693b.m21273g(AbstractC35950b.f153062G, c28655q, 0);
                        C38072d c38072d115 = C38072d.f163053a;
                        int i311111116 = C38072d.f163054b;
                        C2886a c2886aM8418P115 = c38072d115.m121952e(c28655q, i311111116).getT3();
                        long jM125430y115 = c38072d115.m121949b(c28655q, i311111116).getBrandWhite();
                        int i311111117 = C2886a.f11498d;
                        AbstractC30795n.m94707h(strM21273g115, modifierM3398t115, jM125430y115, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P115, null, c28655q, 48, i311111117 << 18, 196600);
                        C2886a c2886aM8430k115 = c38072d115.m121952e(c28655q, i311111116).getBtS();
                        C22976l1 c22976l1M3379a115 = AbstractC1099a.m3379a(0, 0.0f, 2);
                        TextResource.C8688b c8688bM21277k115 = AbstractC8693b.m21277k(AbstractC35950b.f153060E);
                        Integer numValueOf115 = Integer.valueOf(c38072d115.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward());
                        if ((i27 & 57344) == 16384) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z26) {
                            objM87133R3 = new C11699o(interfaceC4339a9, 24);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C11699o(interfaceC4339a9, 24);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC27271o0.m82253b(c2314t, false, c8688bM21277k115, c2886aM8430k115, null, null, numValueOf115, null, false, c22976l1M3379a115, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.C8688b.f25889c << 6) | 906166278 | (i311111117 << 9), 0, 146);
                        AbstractC1090b.m3350e(C23016z.f90757a, z2111115, AbstractC1099a.m3398t(c2314t, 0.0f, f111111111110, 0.0f, 0.0f, 13), null, null, null, C14462d.f52794a.m41219b(), c28655q, 1573254 | ((i27 >> 3) & 112), 28);
                        AbstractC25012a.m73388u(35, f111111111111, c2314t, c28655q, true);
                        WeakHashMap weakHashMap115 = C22944c2.f90553v;
                        float fMo43109a115 = AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a();
                        Modifier modifierM3419p115 = AbstractC1102d.m3419p(400, c2314t);
                        C2307m c2307m1118 = C2299e.f9106I;
                        C1100b c1100b115 = C1100b.f4583a;
                        AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1099a.m3392n(c1100b115.mo3400a(modifierM3419p115, c2307m1118), 0.0f, fMo43109a115, 1), C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4287324927L))), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 900.0f, 8), null, 0.0f, 6), c28655q, 0);
                        Modifier modifierM3394p115 = AbstractC1099a.m3394p(f111111111112, c1100b115.mo3400a(c2314t, C2299e.f9105H));
                        InterfaceC39127r0 interfaceC39127r0M66763d1118 = AbstractC22989q.m66763d(c2307m1117, false);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111113 = c28655q.m87165m();
                        Modifier modifierM118962N1111113 = AbstractC37056f.m118962N(c28655q, modifierM3394p115);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i111110, interfaceC39127r0M66763d1118);
                        AbstractC28683x.m87239G(c28655q, c0209i111111, interfaceC28653p1M87165m1111113);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i111112, modifierM118962N1111113);
                        int i311111118 = i27 << 3;
                        interfaceC4339a3 = interfaceC4339a7;
                        boolean z2111116 = z25;
                        AbstractC13172e.m36939k(EnumC13178k.INTRO_V2, false, z2111116, false, interfaceC4339a3, c28655q, (i311111118 & 896) | 6 | (i311111118 & 57344), 10);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        interfaceC4339a5 = interfaceC4339a9;
                        z17 = z2111116;
                        modifier3 = modifier118;
                        z18 = z2111115;
                    } else {
                        z25 = z19;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    C0209i c0209i111113 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i111113, modifierM118962N1111111);
                    Modifier modifier119 = modifier2;
                    float f111111111113 = 8;
                    float f111111111114 = 2 * f111111111113;
                    Modifier modifierM3396r116 = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14), f111111111114, 0.0f, 2);
                    i27 = i15;
                    C23010x c23010xM66775a116 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    boolean z2111117 = z24;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111114 = c28655q.m87165m();
                    Modifier modifierM118962N1111114 = AbstractC37056f.m118962N(c28655q, modifierM3396r116);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i111110, c23010xM66775a116);
                    AbstractC28683x.m87239G(c28655q, c0209i111111, interfaceC28653p1M87165m1111114);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i111113, modifierM118962N1111114);
                    AbstractC29125c.m88522c(bitmapPainter13, null, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f111111111114, 0.0f, 2), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
                    m41304i(c28655q, 0);
                    float f111111111115 = 4;
                    float f111111111116 = f111111111115 * f111111111113;
                    Modifier modifierM3398t116 = AbstractC1099a.m3398t(c2314t, 0.0f, f111111111116, 0.0f, 0.0f, 13);
                    String strM21273g116 = AbstractC8693b.m21273g(AbstractC35950b.f153062G, c28655q, 0);
                    C38072d c38072d116 = C38072d.f163053a;
                    int i311111119 = C38072d.f163054b;
                    C2886a c2886aM8418P116 = c38072d116.m121952e(c28655q, i311111119).getT3();
                    long jM125430y116 = c38072d116.m121949b(c28655q, i311111119).getBrandWhite();
                    int i3111111110 = C2886a.f11498d;
                    AbstractC30795n.m94707h(strM21273g116, modifierM3398t116, jM125430y116, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P116, null, c28655q, 48, i3111111110 << 18, 196600);
                    C2886a c2886aM8430k116 = c38072d116.m121952e(c28655q, i311111119).getBtS();
                    C22976l1 c22976l1M3379a116 = AbstractC1099a.m3379a(0, 0.0f, 2);
                    TextResource.C8688b c8688bM21277k116 = AbstractC8693b.m21277k(AbstractC35950b.f153060E);
                    Integer numValueOf116 = Integer.valueOf(c38072d116.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward());
                    if ((i27 & 57344) == 16384) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z26) {
                        objM87133R3 = new C11699o(interfaceC4339a9, 24);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C11699o(interfaceC4339a9, 24);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC27271o0.m82253b(c2314t, false, c8688bM21277k116, c2886aM8430k116, null, null, numValueOf116, null, false, c22976l1M3379a116, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.C8688b.f25889c << 6) | 906166278 | (i3111111110 << 9), 0, 146);
                    AbstractC1090b.m3350e(C23016z.f90757a, z2111117, AbstractC1099a.m3398t(c2314t, 0.0f, f111111111114, 0.0f, 0.0f, 13), null, null, null, C14462d.f52794a.m41219b(), c28655q, 1573254 | ((i27 >> 3) & 112), 28);
                    AbstractC25012a.m73388u(35, f111111111115, c2314t, c28655q, true);
                    WeakHashMap weakHashMap116 = C22944c2.f90553v;
                    float fMo43109a116 = AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a();
                    Modifier modifierM3419p116 = AbstractC1102d.m3419p(400, c2314t);
                    C2307m c2307m1119 = C2299e.f9106I;
                    C1100b c1100b116 = C1100b.f4583a;
                    AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1099a.m3392n(c1100b116.mo3400a(modifierM3419p116, c2307m1119), 0.0f, fMo43109a116, 1), C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4287324927L))), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 900.0f, 8), null, 0.0f, 6), c28655q, 0);
                    Modifier modifierM3394p116 = AbstractC1099a.m3394p(f111111111116, c1100b116.mo3400a(c2314t, C2299e.f9105H));
                    InterfaceC39127r0 interfaceC39127r0M66763d1119 = AbstractC22989q.m66763d(c2307m1117, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111115 = c28655q.m87165m();
                    Modifier modifierM118962N1111115 = AbstractC37056f.m118962N(c28655q, modifierM3394p116);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i111110, interfaceC39127r0M66763d1119);
                    AbstractC28683x.m87239G(c28655q, c0209i111111, interfaceC28653p1M87165m1111115);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i111113, modifierM118962N1111115);
                    int i3111111111 = i27 << 3;
                    interfaceC4339a3 = interfaceC4339a7;
                    boolean z2111118 = z25;
                    AbstractC13172e.m36939k(EnumC13178k.INTRO_V2, false, z2111118, false, interfaceC4339a3, c28655q, (i3111111111 & 896) | 6 | (i3111111111 & 57344), 10);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    interfaceC4339a5 = interfaceC4339a9;
                    z17 = z2111118;
                    modifier3 = modifier119;
                    z18 = z2111117;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z17 = z14;
                    z18 = z15;
                    interfaceC4339a5 = interfaceC4339a4;
                }
                interfaceC4339a6 = interfaceC4339a3;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13421p(modifier3, z17, z18, interfaceC4339a6, interfaceC4339a5, i13, i14, 1);
                }
            }
            i15 |= 24576;
            interfaceC4339a4 = interfaceC4339a2;
            if ((i15 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                c2314t = C2314t.f9131w;
                if (i28 != 0) {
                    modifier2 = c2314t;
                }
                if (i29 != 0) {
                    z19 = false;
                } else {
                    z19 = z14;
                }
                if (i16 != 0) {
                    z24 = false;
                } else {
                    z24 = z15;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C13998z1(20);
                        c28655q.m87172p0(objM87133R5);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R5;
                } else {
                    interfaceC4339a7 = interfaceC4339a3;
                }
                if (i24 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C13998z1(21);
                        c28655q.m87172p0(objM87133R4);
                    }
                    interfaceC4339a8 = (InterfaceC4339a) objM87133R4;
                } else {
                    interfaceC4339a8 = interfaceC4339a4;
                }
                i26 = AbstractC35949a.f153053b;
                resources = (Resources) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4977c);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new TypedValue();
                    c28655q.m87172p0(objM87133R);
                }
                TypedValue typedValue14 = (TypedValue) objM87133R;
                resources.getValue(i26, typedValue14, true);
                CharSequence charSequence14 = typedValue14.string;
                AbstractC22676k.m65747g(charSequence14);
                zM87153g = c28655q.m87153g(charSequence14.toString());
                objM87133R2 = c28655q.m87133R();
                if (zM87153g) {
                    Drawable drawable116 = resources.getDrawable(i26, null);
                    AbstractC22676k.m65748h(drawable116, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                    objM87133R2 = new C17885g(((BitmapDrawable) drawable116).getBitmap());
                    c28655q.m87172p0(objM87133R2);
                } else {
                    Drawable drawable117 = resources.getDrawable(i26, null);
                    AbstractC22676k.m65748h(drawable117, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                    objM87133R2 = new C17885g(((BitmapDrawable) drawable117).getBitmap());
                    c28655q.m87172p0(objM87133R2);
                }
                C17885g c17885g14 = (C17885g) objM87133R2;
                BitmapPainter bitmapPainter14 = new BitmapPainter(c17885g14, (((long) Math.min(c17885g14.f69577a.getHeight(), 140)) & 4294967295L) | (((long) c17885g14.f69577a.getWidth()) << 32));
                Modifier modifierM3407d14 = AbstractC1102d.m3407d(1.0f, modifier2);
                C2307m c2307m11110 = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d11110 = AbstractC22989q.m66763d(c2307m11110, false);
                interfaceC4339a9 = interfaceC4339a8;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111116 = c28655q.m87165m();
                Modifier modifierM118962N1111116 = AbstractC37056f.m118962N(c28655q, modifierM3407d14);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i111114 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i111114, interfaceC39127r0M66763d11110);
                C0209i c0209i111115 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i111115, interfaceC28653p1M87165m1111116);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    z25 = z19;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i111116 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i111116, modifierM118962N1111116);
                    Modifier modifier1110 = modifier2;
                    float f111111111117 = 8;
                    float f111111111118 = 2 * f111111111117;
                    Modifier modifierM3396r117 = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14), f111111111118, 0.0f, 2);
                    i27 = i15;
                    C23010x c23010xM66775a117 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    boolean z2111119 = z24;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111117 = c28655q.m87165m();
                    Modifier modifierM118962N1111117 = AbstractC37056f.m118962N(c28655q, modifierM3396r117);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i111114, c23010xM66775a117);
                    AbstractC28683x.m87239G(c28655q, c0209i111115, interfaceC28653p1M87165m1111117);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i111116, modifierM118962N1111117);
                    AbstractC29125c.m88522c(bitmapPainter14, null, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f111111111118, 0.0f, 2), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
                    m41304i(c28655q, 0);
                    float f111111111119 = 4;
                    float f1111111111110 = f111111111119 * f111111111117;
                    Modifier modifierM3398t117 = AbstractC1099a.m3398t(c2314t, 0.0f, f1111111111110, 0.0f, 0.0f, 13);
                    String strM21273g117 = AbstractC8693b.m21273g(AbstractC35950b.f153062G, c28655q, 0);
                    C38072d c38072d117 = C38072d.f163053a;
                    int i3111111112 = C38072d.f163054b;
                    C2886a c2886aM8418P117 = c38072d117.m121952e(c28655q, i3111111112).getT3();
                    long jM125430y117 = c38072d117.m121949b(c28655q, i3111111112).getBrandWhite();
                    int i3111111113 = C2886a.f11498d;
                    AbstractC30795n.m94707h(strM21273g117, modifierM3398t117, jM125430y117, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P117, null, c28655q, 48, i3111111113 << 18, 196600);
                    C2886a c2886aM8430k117 = c38072d117.m121952e(c28655q, i3111111112).getBtS();
                    C22976l1 c22976l1M3379a117 = AbstractC1099a.m3379a(0, 0.0f, 2);
                    TextResource.C8688b c8688bM21277k117 = AbstractC8693b.m21277k(AbstractC35950b.f153060E);
                    Integer numValueOf117 = Integer.valueOf(c38072d117.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward());
                    if ((i27 & 57344) == 16384) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z26) {
                        objM87133R3 = new C11699o(interfaceC4339a9, 24);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C11699o(interfaceC4339a9, 24);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC27271o0.m82253b(c2314t, false, c8688bM21277k117, c2886aM8430k117, null, null, numValueOf117, null, false, c22976l1M3379a117, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.C8688b.f25889c << 6) | 906166278 | (i3111111113 << 9), 0, 146);
                    AbstractC1090b.m3350e(C23016z.f90757a, z2111119, AbstractC1099a.m3398t(c2314t, 0.0f, f111111111118, 0.0f, 0.0f, 13), null, null, null, C14462d.f52794a.m41219b(), c28655q, 1573254 | ((i27 >> 3) & 112), 28);
                    AbstractC25012a.m73388u(35, f111111111119, c2314t, c28655q, true);
                    WeakHashMap weakHashMap117 = C22944c2.f90553v;
                    float fMo43109a117 = AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a();
                    Modifier modifierM3419p117 = AbstractC1102d.m3419p(400, c2314t);
                    C2307m c2307m11111 = C2299e.f9106I;
                    C1100b c1100b117 = C1100b.f4583a;
                    AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1099a.m3392n(c1100b117.mo3400a(modifierM3419p117, c2307m11111), 0.0f, fMo43109a117, 1), C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4287324927L))), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 900.0f, 8), null, 0.0f, 6), c28655q, 0);
                    Modifier modifierM3394p117 = AbstractC1099a.m3394p(f1111111111110, c1100b117.mo3400a(c2314t, C2299e.f9105H));
                    InterfaceC39127r0 interfaceC39127r0M66763d11111 = AbstractC22989q.m66763d(c2307m11110, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111118 = c28655q.m87165m();
                    Modifier modifierM118962N1111118 = AbstractC37056f.m118962N(c28655q, modifierM3394p117);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i111114, interfaceC39127r0M66763d11111);
                    AbstractC28683x.m87239G(c28655q, c0209i111115, interfaceC28653p1M87165m1111118);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i111116, modifierM118962N1111118);
                    int i3111111114 = i27 << 3;
                    interfaceC4339a3 = interfaceC4339a7;
                    boolean z21111110 = z25;
                    AbstractC13172e.m36939k(EnumC13178k.INTRO_V2, false, z21111110, false, interfaceC4339a3, c28655q, (i3111111114 & 896) | 6 | (i3111111114 & 57344), 10);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    interfaceC4339a5 = interfaceC4339a9;
                    z17 = z21111110;
                    modifier3 = modifier1110;
                    z18 = z2111119;
                } else {
                    z25 = z19;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i111117 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i111117, modifierM118962N1111116);
                Modifier modifier1111 = modifier2;
                float f1111111111111 = 8;
                float f1111111111112 = 2 * f1111111111111;
                Modifier modifierM3396r118 = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14), f1111111111112, 0.0f, 2);
                i27 = i15;
                C23010x c23010xM66775a118 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                boolean z21111111 = z24;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111119 = c28655q.m87165m();
                Modifier modifierM118962N1111119 = AbstractC37056f.m118962N(c28655q, modifierM3396r118);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i111114, c23010xM66775a118);
                AbstractC28683x.m87239G(c28655q, c0209i111115, interfaceC28653p1M87165m1111119);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i111117, modifierM118962N1111119);
                AbstractC29125c.m88522c(bitmapPainter14, null, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f1111111111112, 0.0f, 2), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
                m41304i(c28655q, 0);
                float f1111111111113 = 4;
                float f1111111111114 = f1111111111113 * f1111111111111;
                Modifier modifierM3398t118 = AbstractC1099a.m3398t(c2314t, 0.0f, f1111111111114, 0.0f, 0.0f, 13);
                String strM21273g118 = AbstractC8693b.m21273g(AbstractC35950b.f153062G, c28655q, 0);
                C38072d c38072d118 = C38072d.f163053a;
                int i3111111115 = C38072d.f163054b;
                C2886a c2886aM8418P118 = c38072d118.m121952e(c28655q, i3111111115).getT3();
                long jM125430y118 = c38072d118.m121949b(c28655q, i3111111115).getBrandWhite();
                int i3111111116 = C2886a.f11498d;
                AbstractC30795n.m94707h(strM21273g118, modifierM3398t118, jM125430y118, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P118, null, c28655q, 48, i3111111116 << 18, 196600);
                C2886a c2886aM8430k118 = c38072d118.m121952e(c28655q, i3111111115).getBtS();
                C22976l1 c22976l1M3379a118 = AbstractC1099a.m3379a(0, 0.0f, 2);
                TextResource.C8688b c8688bM21277k118 = AbstractC8693b.m21277k(AbstractC35950b.f153060E);
                Integer numValueOf118 = Integer.valueOf(c38072d118.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward());
                if ((i27 & 57344) == 16384) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z26) {
                    objM87133R3 = new C11699o(interfaceC4339a9, 24);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C11699o(interfaceC4339a9, 24);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC27271o0.m82253b(c2314t, false, c8688bM21277k118, c2886aM8430k118, null, null, numValueOf118, null, false, c22976l1M3379a118, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.C8688b.f25889c << 6) | 906166278 | (i3111111116 << 9), 0, 146);
                AbstractC1090b.m3350e(C23016z.f90757a, z21111111, AbstractC1099a.m3398t(c2314t, 0.0f, f1111111111112, 0.0f, 0.0f, 13), null, null, null, C14462d.f52794a.m41219b(), c28655q, 1573254 | ((i27 >> 3) & 112), 28);
                AbstractC25012a.m73388u(35, f1111111111113, c2314t, c28655q, true);
                WeakHashMap weakHashMap118 = C22944c2.f90553v;
                float fMo43109a118 = AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a();
                Modifier modifierM3419p118 = AbstractC1102d.m3419p(400, c2314t);
                C2307m c2307m11112 = C2299e.f9106I;
                C1100b c1100b118 = C1100b.f4583a;
                AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1099a.m3392n(c1100b118.mo3400a(modifierM3419p118, c2307m11112), 0.0f, fMo43109a118, 1), C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4287324927L))), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 900.0f, 8), null, 0.0f, 6), c28655q, 0);
                Modifier modifierM3394p118 = AbstractC1099a.m3394p(f1111111111114, c1100b118.mo3400a(c2314t, C2299e.f9105H));
                InterfaceC39127r0 interfaceC39127r0M66763d11112 = AbstractC22989q.m66763d(c2307m11110, false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11111110 = c28655q.m87165m();
                Modifier modifierM118962N11111110 = AbstractC37056f.m118962N(c28655q, modifierM3394p118);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i111114, interfaceC39127r0M66763d11112);
                AbstractC28683x.m87239G(c28655q, c0209i111115, interfaceC28653p1M87165m11111110);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i111117, modifierM118962N11111110);
                int i3111111117 = i27 << 3;
                interfaceC4339a3 = interfaceC4339a7;
                boolean z21111112 = z25;
                AbstractC13172e.m36939k(EnumC13178k.INTRO_V2, false, z21111112, false, interfaceC4339a3, c28655q, (i3111111117 & 896) | 6 | (i3111111117 & 57344), 10);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                interfaceC4339a5 = interfaceC4339a9;
                z17 = z21111112;
                modifier3 = modifier1111;
                z18 = z21111111;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z17 = z14;
                z18 = z15;
                interfaceC4339a5 = interfaceC4339a4;
            }
            interfaceC4339a6 = interfaceC4339a3;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13421p(modifier3, z17, z18, interfaceC4339a6, interfaceC4339a5, i13, i14, 1);
            }
        }
        i15 |= 3072;
        interfaceC4339a3 = interfaceC4339a;
        i24 = i14 & 16;
        if (i24 != 0) {
            if ((i13 & 24576) == 0) {
                interfaceC4339a4 = interfaceC4339a2;
                if (c28655q.m87157i(interfaceC4339a4)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            if ((i15 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                c2314t = C2314t.f9131w;
                if (i28 != 0) {
                    modifier2 = c2314t;
                }
                if (i29 != 0) {
                    z19 = false;
                } else {
                    z19 = z14;
                }
                if (i16 != 0) {
                    z24 = false;
                } else {
                    z24 = z15;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C13998z1(20);
                        c28655q.m87172p0(objM87133R5);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R5;
                } else {
                    interfaceC4339a7 = interfaceC4339a3;
                }
                if (i24 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C13998z1(21);
                        c28655q.m87172p0(objM87133R4);
                    }
                    interfaceC4339a8 = (InterfaceC4339a) objM87133R4;
                } else {
                    interfaceC4339a8 = interfaceC4339a4;
                }
                i26 = AbstractC35949a.f153053b;
                resources = (Resources) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4977c);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new TypedValue();
                    c28655q.m87172p0(objM87133R);
                }
                TypedValue typedValue15 = (TypedValue) objM87133R;
                resources.getValue(i26, typedValue15, true);
                CharSequence charSequence15 = typedValue15.string;
                AbstractC22676k.m65747g(charSequence15);
                zM87153g = c28655q.m87153g(charSequence15.toString());
                objM87133R2 = c28655q.m87133R();
                if (zM87153g) {
                    Drawable drawable118 = resources.getDrawable(i26, null);
                    AbstractC22676k.m65748h(drawable118, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                    objM87133R2 = new C17885g(((BitmapDrawable) drawable118).getBitmap());
                    c28655q.m87172p0(objM87133R2);
                } else {
                    Drawable drawable119 = resources.getDrawable(i26, null);
                    AbstractC22676k.m65748h(drawable119, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                    objM87133R2 = new C17885g(((BitmapDrawable) drawable119).getBitmap());
                    c28655q.m87172p0(objM87133R2);
                }
                C17885g c17885g15 = (C17885g) objM87133R2;
                BitmapPainter bitmapPainter15 = new BitmapPainter(c17885g15, (((long) Math.min(c17885g15.f69577a.getHeight(), 140)) & 4294967295L) | (((long) c17885g15.f69577a.getWidth()) << 32));
                Modifier modifierM3407d15 = AbstractC1102d.m3407d(1.0f, modifier2);
                C2307m c2307m11113 = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d11113 = AbstractC22989q.m66763d(c2307m11113, false);
                interfaceC4339a9 = interfaceC4339a8;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11111111 = c28655q.m87165m();
                Modifier modifierM118962N11111111 = AbstractC37056f.m118962N(c28655q, modifierM3407d15);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i111118 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i111118, interfaceC39127r0M66763d11113);
                C0209i c0209i111119 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i111119, interfaceC28653p1M87165m11111111);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    z25 = z19;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i1111110 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i1111110, modifierM118962N11111111);
                    Modifier modifier1112 = modifier2;
                    float f1111111111115 = 8;
                    float f1111111111116 = 2 * f1111111111115;
                    Modifier modifierM3396r119 = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14), f1111111111116, 0.0f, 2);
                    i27 = i15;
                    C23010x c23010xM66775a119 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    boolean z21111113 = z24;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111112 = c28655q.m87165m();
                    Modifier modifierM118962N11111112 = AbstractC37056f.m118962N(c28655q, modifierM3396r119);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i111118, c23010xM66775a119);
                    AbstractC28683x.m87239G(c28655q, c0209i111119, interfaceC28653p1M87165m11111112);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1111110, modifierM118962N11111112);
                    AbstractC29125c.m88522c(bitmapPainter15, null, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f1111111111116, 0.0f, 2), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
                    m41304i(c28655q, 0);
                    float f1111111111117 = 4;
                    float f1111111111118 = f1111111111117 * f1111111111115;
                    Modifier modifierM3398t119 = AbstractC1099a.m3398t(c2314t, 0.0f, f1111111111118, 0.0f, 0.0f, 13);
                    String strM21273g119 = AbstractC8693b.m21273g(AbstractC35950b.f153062G, c28655q, 0);
                    C38072d c38072d119 = C38072d.f163053a;
                    int i3111111118 = C38072d.f163054b;
                    C2886a c2886aM8418P119 = c38072d119.m121952e(c28655q, i3111111118).getT3();
                    long jM125430y119 = c38072d119.m121949b(c28655q, i3111111118).getBrandWhite();
                    int i3111111119 = C2886a.f11498d;
                    AbstractC30795n.m94707h(strM21273g119, modifierM3398t119, jM125430y119, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P119, null, c28655q, 48, i3111111119 << 18, 196600);
                    C2886a c2886aM8430k119 = c38072d119.m121952e(c28655q, i3111111118).getBtS();
                    C22976l1 c22976l1M3379a119 = AbstractC1099a.m3379a(0, 0.0f, 2);
                    TextResource.C8688b c8688bM21277k119 = AbstractC8693b.m21277k(AbstractC35950b.f153060E);
                    Integer numValueOf119 = Integer.valueOf(c38072d119.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward());
                    if ((i27 & 57344) == 16384) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z26) {
                        objM87133R3 = new C11699o(interfaceC4339a9, 24);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C11699o(interfaceC4339a9, 24);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC27271o0.m82253b(c2314t, false, c8688bM21277k119, c2886aM8430k119, null, null, numValueOf119, null, false, c22976l1M3379a119, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.C8688b.f25889c << 6) | 906166278 | (i3111111119 << 9), 0, 146);
                    AbstractC1090b.m3350e(C23016z.f90757a, z21111113, AbstractC1099a.m3398t(c2314t, 0.0f, f1111111111116, 0.0f, 0.0f, 13), null, null, null, C14462d.f52794a.m41219b(), c28655q, 1573254 | ((i27 >> 3) & 112), 28);
                    AbstractC25012a.m73388u(35, f1111111111117, c2314t, c28655q, true);
                    WeakHashMap weakHashMap119 = C22944c2.f90553v;
                    float fMo43109a119 = AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a();
                    Modifier modifierM3419p119 = AbstractC1102d.m3419p(400, c2314t);
                    C2307m c2307m11114 = C2299e.f9106I;
                    C1100b c1100b119 = C1100b.f4583a;
                    AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1099a.m3392n(c1100b119.mo3400a(modifierM3419p119, c2307m11114), 0.0f, fMo43109a119, 1), C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4287324927L))), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 900.0f, 8), null, 0.0f, 6), c28655q, 0);
                    Modifier modifierM3394p119 = AbstractC1099a.m3394p(f1111111111118, c1100b119.mo3400a(c2314t, C2299e.f9105H));
                    InterfaceC39127r0 interfaceC39127r0M66763d11114 = AbstractC22989q.m66763d(c2307m11113, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111113 = c28655q.m87165m();
                    Modifier modifierM118962N11111113 = AbstractC37056f.m118962N(c28655q, modifierM3394p119);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i111118, interfaceC39127r0M66763d11114);
                    AbstractC28683x.m87239G(c28655q, c0209i111119, interfaceC28653p1M87165m11111113);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1111110, modifierM118962N11111113);
                    int i31111111110 = i27 << 3;
                    interfaceC4339a3 = interfaceC4339a7;
                    boolean z21111114 = z25;
                    AbstractC13172e.m36939k(EnumC13178k.INTRO_V2, false, z21111114, false, interfaceC4339a3, c28655q, (i31111111110 & 896) | 6 | (i31111111110 & 57344), 10);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    interfaceC4339a5 = interfaceC4339a9;
                    z17 = z21111114;
                    modifier3 = modifier1112;
                    z18 = z21111113;
                } else {
                    z25 = z19;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i1111111 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i1111111, modifierM118962N11111111);
                Modifier modifier1113 = modifier2;
                float f1111111111119 = 8;
                float f11111111111110 = 2 * f1111111111119;
                Modifier modifierM3396r1110 = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14), f11111111111110, 0.0f, 2);
                i27 = i15;
                C23010x c23010xM66775a1110 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                boolean z21111115 = z24;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11111114 = c28655q.m87165m();
                Modifier modifierM118962N11111114 = AbstractC37056f.m118962N(c28655q, modifierM3396r1110);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i111118, c23010xM66775a1110);
                AbstractC28683x.m87239G(c28655q, c0209i111119, interfaceC28653p1M87165m11111114);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i1111111, modifierM118962N11111114);
                AbstractC29125c.m88522c(bitmapPainter15, null, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f11111111111110, 0.0f, 2), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
                m41304i(c28655q, 0);
                float f11111111111111 = 4;
                float f11111111111112 = f11111111111111 * f1111111111119;
                Modifier modifierM3398t1110 = AbstractC1099a.m3398t(c2314t, 0.0f, f11111111111112, 0.0f, 0.0f, 13);
                String strM21273g1110 = AbstractC8693b.m21273g(AbstractC35950b.f153062G, c28655q, 0);
                C38072d c38072d1110 = C38072d.f163053a;
                int i31111111111 = C38072d.f163054b;
                C2886a c2886aM8418P1110 = c38072d1110.m121952e(c28655q, i31111111111).getT3();
                long jM125430y1110 = c38072d1110.m121949b(c28655q, i31111111111).getBrandWhite();
                int i31111111112 = C2886a.f11498d;
                AbstractC30795n.m94707h(strM21273g1110, modifierM3398t1110, jM125430y1110, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P1110, null, c28655q, 48, i31111111112 << 18, 196600);
                C2886a c2886aM8430k1110 = c38072d1110.m121952e(c28655q, i31111111111).getBtS();
                C22976l1 c22976l1M3379a1110 = AbstractC1099a.m3379a(0, 0.0f, 2);
                TextResource.C8688b c8688bM21277k1110 = AbstractC8693b.m21277k(AbstractC35950b.f153060E);
                Integer numValueOf1110 = Integer.valueOf(c38072d1110.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward());
                if ((i27 & 57344) == 16384) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z26) {
                    objM87133R3 = new C11699o(interfaceC4339a9, 24);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C11699o(interfaceC4339a9, 24);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC27271o0.m82253b(c2314t, false, c8688bM21277k1110, c2886aM8430k1110, null, null, numValueOf1110, null, false, c22976l1M3379a1110, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.C8688b.f25889c << 6) | 906166278 | (i31111111112 << 9), 0, 146);
                AbstractC1090b.m3350e(C23016z.f90757a, z21111115, AbstractC1099a.m3398t(c2314t, 0.0f, f11111111111110, 0.0f, 0.0f, 13), null, null, null, C14462d.f52794a.m41219b(), c28655q, 1573254 | ((i27 >> 3) & 112), 28);
                AbstractC25012a.m73388u(35, f11111111111111, c2314t, c28655q, true);
                WeakHashMap weakHashMap1110 = C22944c2.f90553v;
                float fMo43109a1110 = AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a();
                Modifier modifierM3419p1110 = AbstractC1102d.m3419p(400, c2314t);
                C2307m c2307m11115 = C2299e.f9106I;
                C1100b c1100b1110 = C1100b.f4583a;
                AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1099a.m3392n(c1100b1110.mo3400a(modifierM3419p1110, c2307m11115), 0.0f, fMo43109a1110, 1), C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4287324927L))), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 900.0f, 8), null, 0.0f, 6), c28655q, 0);
                Modifier modifierM3394p1110 = AbstractC1099a.m3394p(f11111111111112, c1100b1110.mo3400a(c2314t, C2299e.f9105H));
                InterfaceC39127r0 interfaceC39127r0M66763d11115 = AbstractC22989q.m66763d(c2307m11113, false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11111115 = c28655q.m87165m();
                Modifier modifierM118962N11111115 = AbstractC37056f.m118962N(c28655q, modifierM3394p1110);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i111118, interfaceC39127r0M66763d11115);
                AbstractC28683x.m87239G(c28655q, c0209i111119, interfaceC28653p1M87165m11111115);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i1111111, modifierM118962N11111115);
                int i31111111113 = i27 << 3;
                interfaceC4339a3 = interfaceC4339a7;
                boolean z21111116 = z25;
                AbstractC13172e.m36939k(EnumC13178k.INTRO_V2, false, z21111116, false, interfaceC4339a3, c28655q, (i31111111113 & 896) | 6 | (i31111111113 & 57344), 10);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                interfaceC4339a5 = interfaceC4339a9;
                z17 = z21111116;
                modifier3 = modifier1113;
                z18 = z21111115;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z17 = z14;
                z18 = z15;
                interfaceC4339a5 = interfaceC4339a4;
            }
            interfaceC4339a6 = interfaceC4339a3;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13421p(modifier3, z17, z18, interfaceC4339a6, interfaceC4339a5, i13, i14, 1);
            }
        }
        i15 |= 24576;
        interfaceC4339a4 = interfaceC4339a2;
        if ((i15 & 9363) != 9362) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (c28655q.m87135U(i15 & 1, z16)) {
            c2314t = C2314t.f9131w;
            if (i28 != 0) {
                modifier2 = c2314t;
            }
            if (i29 != 0) {
                z19 = false;
            } else {
                z19 = z14;
            }
            if (i16 != 0) {
                z24 = false;
            } else {
                z24 = z15;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C13998z1(20);
                    c28655q.m87172p0(objM87133R5);
                }
                interfaceC4339a7 = (InterfaceC4339a) objM87133R5;
            } else {
                interfaceC4339a7 = interfaceC4339a3;
            }
            if (i24 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C13998z1(21);
                    c28655q.m87172p0(objM87133R4);
                }
                interfaceC4339a8 = (InterfaceC4339a) objM87133R4;
            } else {
                interfaceC4339a8 = interfaceC4339a4;
            }
            i26 = AbstractC35949a.f153053b;
            resources = (Resources) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4977c);
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = new TypedValue();
                c28655q.m87172p0(objM87133R);
            }
            TypedValue typedValue16 = (TypedValue) objM87133R;
            resources.getValue(i26, typedValue16, true);
            CharSequence charSequence16 = typedValue16.string;
            AbstractC22676k.m65747g(charSequence16);
            zM87153g = c28655q.m87153g(charSequence16.toString());
            objM87133R2 = c28655q.m87133R();
            if (zM87153g) {
                Drawable drawable1110 = resources.getDrawable(i26, null);
                AbstractC22676k.m65748h(drawable1110, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                objM87133R2 = new C17885g(((BitmapDrawable) drawable1110).getBitmap());
                c28655q.m87172p0(objM87133R2);
            } else {
                Drawable drawable1111 = resources.getDrawable(i26, null);
                AbstractC22676k.m65748h(drawable1111, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                objM87133R2 = new C17885g(((BitmapDrawable) drawable1111).getBitmap());
                c28655q.m87172p0(objM87133R2);
            }
            C17885g c17885g16 = (C17885g) objM87133R2;
            BitmapPainter bitmapPainter16 = new BitmapPainter(c17885g16, (((long) Math.min(c17885g16.f69577a.getHeight(), 140)) & 4294967295L) | (((long) c17885g16.f69577a.getWidth()) << 32));
            Modifier modifierM3407d16 = AbstractC1102d.m3407d(1.0f, modifier2);
            C2307m c2307m11116 = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d11116 = AbstractC22989q.m66763d(c2307m11116, false);
            interfaceC4339a9 = interfaceC4339a8;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11111116 = c28655q.m87165m();
            Modifier modifierM118962N11111116 = AbstractC37056f.m118962N(c28655q, modifierM3407d16);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i1111112 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i1111112, interfaceC39127r0M66763d11116);
            C0209i c0209i1111113 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i1111113, interfaceC28653p1M87165m11111116);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                z25 = z19;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i1111114 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i1111114, modifierM118962N11111116);
                Modifier modifier1114 = modifier2;
                float f11111111111113 = 8;
                float f11111111111114 = 2 * f11111111111113;
                Modifier modifierM3396r1111 = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14), f11111111111114, 0.0f, 2);
                i27 = i15;
                C23010x c23010xM66775a1111 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                boolean z21111117 = z24;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11111117 = c28655q.m87165m();
                Modifier modifierM118962N11111117 = AbstractC37056f.m118962N(c28655q, modifierM3396r1111);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i1111112, c23010xM66775a1111);
                AbstractC28683x.m87239G(c28655q, c0209i1111113, interfaceC28653p1M87165m11111117);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i1111114, modifierM118962N11111117);
                AbstractC29125c.m88522c(bitmapPainter16, null, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f11111111111114, 0.0f, 2), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
                m41304i(c28655q, 0);
                float f11111111111115 = 4;
                float f11111111111116 = f11111111111115 * f11111111111113;
                Modifier modifierM3398t1111 = AbstractC1099a.m3398t(c2314t, 0.0f, f11111111111116, 0.0f, 0.0f, 13);
                String strM21273g1111 = AbstractC8693b.m21273g(AbstractC35950b.f153062G, c28655q, 0);
                C38072d c38072d1111 = C38072d.f163053a;
                int i31111111114 = C38072d.f163054b;
                C2886a c2886aM8418P1111 = c38072d1111.m121952e(c28655q, i31111111114).getT3();
                long jM125430y1111 = c38072d1111.m121949b(c28655q, i31111111114).getBrandWhite();
                int i31111111115 = C2886a.f11498d;
                AbstractC30795n.m94707h(strM21273g1111, modifierM3398t1111, jM125430y1111, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P1111, null, c28655q, 48, i31111111115 << 18, 196600);
                C2886a c2886aM8430k1111 = c38072d1111.m121952e(c28655q, i31111111114).getBtS();
                C22976l1 c22976l1M3379a1111 = AbstractC1099a.m3379a(0, 0.0f, 2);
                TextResource.C8688b c8688bM21277k1111 = AbstractC8693b.m21277k(AbstractC35950b.f153060E);
                Integer numValueOf1111 = Integer.valueOf(c38072d1111.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward());
                if ((i27 & 57344) == 16384) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z26) {
                    objM87133R3 = new C11699o(interfaceC4339a9, 24);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C11699o(interfaceC4339a9, 24);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC27271o0.m82253b(c2314t, false, c8688bM21277k1111, c2886aM8430k1111, null, null, numValueOf1111, null, false, c22976l1M3379a1111, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.C8688b.f25889c << 6) | 906166278 | (i31111111115 << 9), 0, 146);
                AbstractC1090b.m3350e(C23016z.f90757a, z21111117, AbstractC1099a.m3398t(c2314t, 0.0f, f11111111111114, 0.0f, 0.0f, 13), null, null, null, C14462d.f52794a.m41219b(), c28655q, 1573254 | ((i27 >> 3) & 112), 28);
                AbstractC25012a.m73388u(35, f11111111111115, c2314t, c28655q, true);
                WeakHashMap weakHashMap1111 = C22944c2.f90553v;
                float fMo43109a1111 = AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a();
                Modifier modifierM3419p1111 = AbstractC1102d.m3419p(400, c2314t);
                C2307m c2307m11117 = C2299e.f9106I;
                C1100b c1100b1111 = C1100b.f4583a;
                AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1099a.m3392n(c1100b1111.mo3400a(modifierM3419p1111, c2307m11117), 0.0f, fMo43109a1111, 1), C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4287324927L))), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 900.0f, 8), null, 0.0f, 6), c28655q, 0);
                Modifier modifierM3394p1111 = AbstractC1099a.m3394p(f11111111111116, c1100b1111.mo3400a(c2314t, C2299e.f9105H));
                InterfaceC39127r0 interfaceC39127r0M66763d11117 = AbstractC22989q.m66763d(c2307m11116, false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11111118 = c28655q.m87165m();
                Modifier modifierM118962N11111118 = AbstractC37056f.m118962N(c28655q, modifierM3394p1111);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i1111112, interfaceC39127r0M66763d11117);
                AbstractC28683x.m87239G(c28655q, c0209i1111113, interfaceC28653p1M87165m11111118);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i1111114, modifierM118962N11111118);
                int i31111111116 = i27 << 3;
                interfaceC4339a3 = interfaceC4339a7;
                boolean z21111118 = z25;
                AbstractC13172e.m36939k(EnumC13178k.INTRO_V2, false, z21111118, false, interfaceC4339a3, c28655q, (i31111111116 & 896) | 6 | (i31111111116 & 57344), 10);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                interfaceC4339a5 = interfaceC4339a9;
                z17 = z21111118;
                modifier3 = modifier1114;
                z18 = z21111117;
            } else {
                z25 = z19;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i1111115 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i1111115, modifierM118962N11111116);
            Modifier modifier1115 = modifier2;
            float f11111111111117 = 8;
            float f11111111111118 = 2 * f11111111111117;
            Modifier modifierM3396r1112 = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14), f11111111111118, 0.0f, 2);
            i27 = i15;
            C23010x c23010xM66775a1112 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            boolean z21111119 = z24;
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11111119 = c28655q.m87165m();
            Modifier modifierM118962N11111119 = AbstractC37056f.m118962N(c28655q, modifierM3396r1112);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i1111112, c23010xM66775a1112);
            AbstractC28683x.m87239G(c28655q, c0209i1111113, interfaceC28653p1M87165m11111119);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i1111115, modifierM118962N11111119);
            AbstractC29125c.m88522c(bitmapPainter16, null, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f11111111111118, 0.0f, 2), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
            m41304i(c28655q, 0);
            float f11111111111119 = 4;
            float f111111111111110 = f11111111111119 * f11111111111117;
            Modifier modifierM3398t1112 = AbstractC1099a.m3398t(c2314t, 0.0f, f111111111111110, 0.0f, 0.0f, 13);
            String strM21273g1112 = AbstractC8693b.m21273g(AbstractC35950b.f153062G, c28655q, 0);
            C38072d c38072d1112 = C38072d.f163053a;
            int i31111111117 = C38072d.f163054b;
            C2886a c2886aM8418P1112 = c38072d1112.m121952e(c28655q, i31111111117).getT3();
            long jM125430y1112 = c38072d1112.m121949b(c28655q, i31111111117).getBrandWhite();
            int i31111111118 = C2886a.f11498d;
            AbstractC30795n.m94707h(strM21273g1112, modifierM3398t1112, jM125430y1112, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P1112, null, c28655q, 48, i31111111118 << 18, 196600);
            C2886a c2886aM8430k1112 = c38072d1112.m121952e(c28655q, i31111111117).getBtS();
            C22976l1 c22976l1M3379a1112 = AbstractC1099a.m3379a(0, 0.0f, 2);
            TextResource.C8688b c8688bM21277k1112 = AbstractC8693b.m21277k(AbstractC35950b.f153060E);
            Integer numValueOf1112 = Integer.valueOf(c38072d1112.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward());
            if ((i27 & 57344) == 16384) {
                z26 = true;
            } else {
                z26 = false;
            }
            objM87133R3 = c28655q.m87133R();
            if (z26) {
                objM87133R3 = new C11699o(interfaceC4339a9, 24);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C11699o(interfaceC4339a9, 24);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC27271o0.m82253b(c2314t, false, c8688bM21277k1112, c2886aM8430k1112, null, null, numValueOf1112, null, false, c22976l1M3379a1112, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.C8688b.f25889c << 6) | 906166278 | (i31111111118 << 9), 0, 146);
            AbstractC1090b.m3350e(C23016z.f90757a, z21111119, AbstractC1099a.m3398t(c2314t, 0.0f, f11111111111118, 0.0f, 0.0f, 13), null, null, null, C14462d.f52794a.m41219b(), c28655q, 1573254 | ((i27 >> 3) & 112), 28);
            AbstractC25012a.m73388u(35, f11111111111119, c2314t, c28655q, true);
            WeakHashMap weakHashMap1112 = C22944c2.f90553v;
            float fMo43109a1112 = AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a();
            Modifier modifierM3419p1112 = AbstractC1102d.m3419p(400, c2314t);
            C2307m c2307m11118 = C2299e.f9106I;
            C1100b c1100b1112 = C1100b.f4583a;
            AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1099a.m3392n(c1100b1112.mo3400a(modifierM3419p1112, c2307m11118), 0.0f, fMo43109a1112, 1), C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4283487743L))), new C17919x(C17919x.m51541c(0.1f, AbstractC17918w0.m51517e(4287324927L))), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 900.0f, 8), null, 0.0f, 6), c28655q, 0);
            Modifier modifierM3394p1112 = AbstractC1099a.m3394p(f111111111111110, c1100b1112.mo3400a(c2314t, C2299e.f9105H));
            InterfaceC39127r0 interfaceC39127r0M66763d11118 = AbstractC22989q.m66763d(c2307m11116, false);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m111111110 = c28655q.m87165m();
            Modifier modifierM118962N111111110 = AbstractC37056f.m118962N(c28655q, modifierM3394p1112);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i1111112, interfaceC39127r0M66763d11118);
            AbstractC28683x.m87239G(c28655q, c0209i1111113, interfaceC28653p1M87165m111111110);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i1111115, modifierM118962N111111110);
            int i31111111119 = i27 << 3;
            interfaceC4339a3 = interfaceC4339a7;
            boolean z211111110 = z25;
            AbstractC13172e.m36939k(EnumC13178k.INTRO_V2, false, z211111110, false, interfaceC4339a3, c28655q, (i31111111119 & 896) | 6 | (i31111111119 & 57344), 10);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            interfaceC4339a5 = interfaceC4339a9;
            z17 = z211111110;
            modifier3 = modifier1115;
            z18 = z21111119;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            z17 = z14;
            z18 = z15;
            interfaceC4339a5 = interfaceC4339a4;
        }
        interfaceC4339a6 = interfaceC4339a3;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13421p(modifier3, z17, z18, interfaceC4339a6, interfaceC4339a5, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m41310o() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m41311p() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m41312q(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m41313r(Modifier modifier, boolean z4, boolean z13, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, int i14, Composer composer, int i15) throws Throwable {
        m41309n(modifier, z4, z13, interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
