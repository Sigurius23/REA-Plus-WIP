package i91;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.C3029l;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p208i2.InterfaceC17869a1;
import p390p1.C28655q;
import p712j91.Function1;
import p712j91.InterfaceC21430b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: i91.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\b\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\r\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0015\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0016\u0010\u0017\u001a!\u0010\u0019\u001a\u00020\u00022\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u0005¢\u0006\u0004\b\u0019\u0010\t\u001a\u0019\u0010\u001c\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a-\u0010 \u001a\u00020\u001a*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b \u0010!\u001a\u0013\u0010\"\u001a\u00020\u000f*\u00020\u0002H\u0007¢\u0006\u0004\b\"\u0010#¨\u0006$"}, m65681d2 = {"Li2/t;", "brush", "Li91/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Li2/t;)Li91/a;", "Lkotlin/Function1;", "Ly81/i;", "brushFactory", "j", "(Lkotlin/jvm/functions/Function1;)Li91/a;", "Lj91/b;", "", "alpha", "i", "(Lj91/b;F)Li91/a;", "Li2/x;", "color", "o", "(J)Li91/a;", "Ly81/e;", "m", "(Ly81/e;)Li91/a;", "n", "(Ly81/e;Ljava/lang/Float;)Li91/a;", "colorFactory", "l", "Landroidx/compose/ui/Modifier;", "background", "c", "(Landroidx/compose/ui/Modifier;Li91/a;)Landroidx/compose/ui/Modifier;", "Li2/a1;", "shape", "d", "(Landroidx/compose/ui/Modifier;Li91/a;Li2/a1;Ljava/lang/Float;)Landroidx/compose/ui/Modifier;", "k", "(Li91/a;Landroidx/compose/runtime/Composer;I)J", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18249c {
    /* JADX INFO: renamed from: c */
    public static final Modifier m52565c(Modifier modifier, AbstractC18247a background) {
        AbstractC22676k.m65750j(modifier, "<this>");
        AbstractC22676k.m65750j(background, "background");
        return AbstractC37056f.m118997u(modifier, new C3029l(background, 2));
    }

    /* JADX INFO: renamed from: d */
    public static final Modifier m52566d(Modifier modifier, final AbstractC18247a background, final InterfaceC17869a1 shape, final Float f13) {
        AbstractC22676k.m65750j(modifier, "<this>");
        AbstractC22676k.m65750j(background, "background");
        AbstractC22676k.m65750j(shape, "shape");
        return AbstractC37056f.m118997u(modifier, new Function3() { // from class: i91.b
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC18249c.m52569g(background, shape, f13, (Modifier) obj, (Composer) obj2, iIntValue);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Modifier m52567e(Modifier modifier, AbstractC18247a abstractC18247a, InterfaceC17869a1 interfaceC17869a1, Float f13, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            f13 = null;
        }
        return m52566d(modifier, abstractC18247a, interfaceC17869a1, f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final Modifier m52568f(AbstractC18247a abstractC18247a, Modifier composed, Composer composer, int i13) {
        long jMo134584toComposableColorWaAFU9c;
        Modifier modifierM3358c;
        AbstractC22676k.m65750j(composed, "$this$composed");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1499396165);
        C17919x c17919x = null;
        if (abstractC18247a instanceof C18250d) {
            c28655q.m87150e0(-2105668531);
            C18250d c18250d = (C18250d) abstractC18247a;
            modifierM3358c = AbstractC1092a.m3357b(composed, c18250d.getBrush().mo60316a(c28655q, 0), null, c18250d.getAlpha(), 2);
            c28655q.m87173q(false);
        } else {
            if (!(abstractC18247a instanceof C18252f)) {
                throw AbstractC11895b.m32003v(-2105669883, c28655q, false);
            }
            c28655q.m87150e0(-2105664836);
            C18252f c18252f = (C18252f) abstractC18247a;
            Float fM52581a = c18252f.getAlpha();
            if (fM52581a == null) {
                c28655q.m87150e0(-851053975);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-851053974);
                long jM51541c = C17919x.m51541c(fM52581a.floatValue(), c18252f.getColor().mo134584toComposableColorWaAFU9c(c28655q, 0));
                c28655q.m87173q(false);
                c17919x = new C17919x(jM51541c);
            }
            if (c17919x == null) {
                c28655q.m87150e0(-2105660754);
                jMo134584toComposableColorWaAFU9c = c18252f.getColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-2105663854);
                c28655q.m87173q(false);
                jMo134584toComposableColorWaAFU9c = c17919x.f69639a;
            }
            modifierM3358c = AbstractC1092a.m3358c(composed, jMo134584toComposableColorWaAFU9c, AbstractC17918w0.f69621a);
            c28655q.m87173q(false);
        }
        c28655q.m87173q(false);
        return modifierM3358c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final Modifier m52569g(AbstractC18247a abstractC18247a, InterfaceC17869a1 interfaceC17869a1, Float f13, Modifier composed, Composer composer, int i13) {
        Modifier modifierM3358c;
        AbstractC22676k.m65750j(composed, "$this$composed");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-2007213578);
        if (abstractC18247a instanceof C18250d) {
            c28655q.m87150e0(-491930610);
            C18250d c18250d = (C18250d) abstractC18247a;
            modifierM3358c = AbstractC1092a.m3356a(f13 != null ? f13.floatValue() : c18250d.getAlpha(), composed, c18250d.getBrush().mo60316a(c28655q, 0), interfaceC17869a1);
            c28655q.m87173q(false);
        } else {
            if (!(abstractC18247a instanceof C18252f)) {
                throw AbstractC11895b.m32003v(-491932017, c28655q, false);
            }
            c28655q.m87150e0(-491924769);
            modifierM3358c = AbstractC1092a.m3358c(composed, ((C18252f) abstractC18247a).getColor().mo134584toComposableColorWaAFU9c(c28655q, 0), interfaceC17869a1);
            c28655q.m87173q(false);
        }
        c28655q.m87173q(false);
        return modifierM3358c;
    }

    /* JADX INFO: renamed from: h */
    public static final AbstractC18247a m52570h(AbstractC17911t brush) {
        AbstractC22676k.m65750j(brush, "brush");
        return new C18250d(Function1.m60318a(brush), 0.0f, 2, null);
    }

    /* JADX INFO: renamed from: i */
    public static final AbstractC18247a m52571i(InterfaceC21430b brush, float f13) {
        AbstractC22676k.m65750j(brush, "brush");
        return new C18250d(brush, f13);
    }

    /* JADX INFO: renamed from: j */
    public static final AbstractC18247a m52572j(p715kotlin.jvm.functions.Function1 brushFactory) {
        AbstractC22676k.m65750j(brushFactory, "brushFactory");
        return new C18250d(Function1.m60319b(brushFactory), 0.0f, 2, null);
    }

    /* JADX INFO: renamed from: k */
    public static final long m52573k(AbstractC18247a abstractC18247a, Composer composer, int i13) {
        AbstractC22676k.m65750j(abstractC18247a, "<this>");
        if (abstractC18247a instanceof C18250d) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(421218526);
            c28655q.m87173q(false);
            int i14 = C17919x.f69638o;
            return C17919x.f69637n;
        }
        if (!(abstractC18247a instanceof C18252f)) {
            throw AbstractC11895b.m32003v(421217154, (C28655q) composer, false);
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(421219942);
        long jMo134584toComposableColorWaAFU9c = ((C18252f) abstractC18247a).getColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
        c28655q2.m87173q(false);
        return jMo134584toComposableColorWaAFU9c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static final AbstractC18247a m52574l(p715kotlin.jvm.functions.Function1 colorFactory) {
        AbstractC22676k.m65750j(colorFactory, "colorFactory");
        return new C18252f(p745y81.Function1.m125323a(colorFactory), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public static final AbstractC18247a m52575m(InterfaceC39332e color) {
        AbstractC22676k.m65750j(color, "color");
        return new C18252f(color, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: n */
    public static final AbstractC18247a m52576n(InterfaceC39332e color, Float f13) {
        AbstractC22676k.m65750j(color, "color");
        return new C18252f(color, f13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public static final AbstractC18247a m52577o(long j7) {
        return new C18252f(p745y81.Function1.m125324b(j7), null, 2, 0 == true ? 1 : 0);
    }
}
