package bj0;

import a81.C0559j;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b72.C2783a;
import com.whoop.archv2.model.template.FillMode;
import com.whoop.archv2.model.template.HorizontalAlignment;
import com.whoop.archv2.model.template.VerticalAlignment;
import dp0.AbstractC12250f;
import ep0.C13404j;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.AbstractC22403o;
import l83.C23454a0;
import p000.AbstractC11266d;
import p000.C22079k;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p026b2.InterfaceC2302h;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25306o;
import p720m91.InterfaceC25288a0;
import p739ui0.AbstractC35005g;
import p739ui0.AbstractC35014p;
import ri0.C31442a;
import ri0.C31447f;
import ri0.InterfaceC31443b;
import ti0.AbstractC33846k;
import ti0.C33838c;
import ti0.C33845j;
import ti0.EnumC33847l;
import wb3.AbstractC37056f;
import x81.C38072d;
import xi0.AbstractC38319a;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: bj0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lti0/j;", "contentState", "Lkotlin/Function1;", "Lri0/b;", "Ll83/a0;", "action", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lti0/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lm91/o;", "itemWrapper", "", "onEvent", "e", "(Lm91/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "l", "(Lti0/j;)Z", "Lb2/h;", "k", "(Lti0/j;)Lb2/h;", "arch-v2_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3329b {

    /* JADX INFO: renamed from: bj0.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f12919a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f12920b;

        static {
            int[] iArr = new int[HorizontalAlignment.values().length];
            try {
                iArr[HorizontalAlignment.LEADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HorizontalAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HorizontalAlignment.TRAILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f12919a = iArr;
            int[] iArr2 = new int[VerticalAlignment.values().length];
            try {
                iArr2[VerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VerticalAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[VerticalAlignment.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f12920b = iArr2;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m9627e(C25306o itemWrapper, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        Function1 function3;
        AbstractC22676k.m65750j(itemWrapper, "itemWrapper");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-392964344);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(itemWrapper) : c28655q.m87157i(itemWrapper) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C2783a(17);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            AbstractC25303l.m74290q(itemWrapper, null, null, function3, c28655q, C25306o.f99297c | (i15 & 14) | ((i15 << 6) & 7168), 6);
            function2 = function3;
        } else {
            c28655q.m87138X();
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3328a(itemWrapper, function2, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m9628f(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m9629g(C25306o c25306o, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m9627e(c25306o, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    public static final void m9630h(C33845j contentState, Function1 function1, Composer composer, int i13) {
        int i14;
        Modifier modifierM3358c;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C2314t c2314t;
        C28655q c28655q;
        Modifier modifierM107049a;
        C0209i c0209i3;
        C28655q c28655q2;
        boolean z4;
        C2314t c2314t2;
        Modifier modifierM66722k;
        EnumC33847l enumC33847lM107008b;
        List<C25306o> listM96776a;
        Function1 action = function1;
        AbstractC22676k.m65750j(contentState, "contentState");
        AbstractC22676k.m65750j(action, "action");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-1453717762);
        if ((i13 & 6) == 0) {
            i14 = (c28655q3.m87157i(contentState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q3.m87157i(action) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q3.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C31442a c31442aM107042e = contentState.getFooterState();
            boolean z13 = (c31442aM107042e == null || (listM96776a = c31442aM107042e.m96776a()) == null || !(listM96776a.isEmpty() ^ true)) ? false : true;
            C13404j c13404jM107047j = contentState.getScreenContextMetadata();
            boolean z14 = c13404jM107047j != null && c13404jM107047j.getIsWceEnabled() && z13;
            boolean zM9634l = m9634l(contentState);
            boolean zM110631v = AbstractC35014p.m110631v(contentState.getNavigationBarState());
            C2314t c2314t3 = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t3);
            if (zM9634l) {
                c28655q3.m87150e0(-1550049845);
                modifierM3358c = AbstractC1092a.m3358c(c2314t3, C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getBrandBlack(), AbstractC17918w0.f69621a);
                c28655q3.m87173q(false);
            } else {
                c28655q3.m87150e0(-1549956876);
                c28655q3.m87173q(false);
                modifierM3358c = c2314t3;
            }
            Modifier modifierMo3471e = modifierM3407d.mo3471e(modifierM3358c);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierMo3471e);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j2);
            } else {
                c28655q3.m87178s0();
            }
            C0209i c0209i4 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i4, interfaceC39127r0M66763d);
            C0209i c0209i5 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m);
            C0209i c0209i6 = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i6);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i7, modifierM118962N);
            C33838c c33838cM107040c = contentState.getBackground();
            AbstractC22403o abstractC22403oM107007a = c33838cM107040c != null ? c33838cM107040c.getImage() : null;
            C1100b c1100b = C1100b.f4583a;
            if (abstractC22403oM107007a == null) {
                c28655q3.m87150e0(-1041236480);
                c28655q3.m87173q(false);
                c0209i = c0209i5;
                c2314t = c2314t3;
                c0209i2 = c0209i6;
                c28655q = c28655q3;
                c0213j = c0213j2;
            } else {
                c28655q3.m87150e0(-1041236479);
                c0213j = c0213j2;
                c0209i = c0209i5;
                c0209i2 = c0209i6;
                c2314t = c2314t3;
                AbstractC38319a.m122792f(c1100b, abstractC22403oM107007a, null, 0.0f, null, c28655q3, (AbstractC22403o.f87638a << 3) | 6, 14);
                c28655q = c28655q3;
                c28655q.m87173q(false);
            }
            C33838c c33838cM107040c2 = contentState.getBackground();
            if ((c33838cM107040c2 != null ? c33838cM107040c2.getImage() : null) != null || zM9634l) {
                c28655q.m87150e0(-1040921922);
                c28655q.m87173q(false);
                modifierM107049a = c2314t;
            } else {
                c28655q.m87150e0(-1041047069);
                C33838c c33838cM107040c3 = contentState.getBackground();
                if (c33838cM107040c3 == null || (enumC33847lM107008b = c33838cM107040c3.getTheme()) == null) {
                    enumC33847lM107008b = EnumC33847l.DARK;
                }
                modifierM107049a = AbstractC33846k.m107049a(c2314t, enumC33847lM107008b, c28655q, 6);
                c28655q.m87173q(false);
            }
            float f13 = 1.0f;
            Modifier modifierMo3471e2 = AbstractC12250f.m34129b(AbstractC1102d.m3407d(1.0f, c2314t), contentState.getScreenContextMetadata(), false, c28655q, (C13404j.f46947x << 3) | 6, 2).mo3471e(modifierM107049a);
            Modifier modifierM66720i = AbstractC22953f.m66720i(!zM110631v ? modifierMo3471e2.mo3471e(AbstractC22953f.m66724m(c2314t)) : modifierMo3471e2.mo3471e(c2314t));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM66720i);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a);
            C0209i c0209i8 = c0209i;
            AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                c0209i3 = c0209i2;
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            } else {
                c0209i3 = c0209i2;
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N2);
            if (zM110631v) {
                C28655q c28655q4 = c28655q;
                c0213j = c0213j;
                c28655q2 = c28655q4;
                c0209i4 = c0209i4;
                z4 = false;
                f13 = 1.0f;
                c28655q2.m87150e0(-1647488728);
                c28655q2.m87173q(false);
            } else {
                c28655q.m87150e0(-330245211);
                C31447f c31447fM107045h = contentState.getNavigationBarState();
                if (c31447fM107045h == null) {
                    c28655q.m87150e0(-1647666948);
                    c28655q.m87173q(false);
                    c28655q2 = c28655q;
                    z4 = false;
                } else {
                    c28655q.m87150e0(-1647666947);
                    z4 = false;
                    c28655q2 = c28655q;
                    AbstractC35014p.m110618i(null, c31447fM107045h, action, c28655q2, (i15 << 3) & 896, 1);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(z4);
            }
            if (z13) {
                if (f13 <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                modifierM66722k = AbstractC38963t7.m124374d(f13, f13, true);
                c2314t2 = c2314t;
            } else {
                c2314t2 = c2314t;
                modifierM66722k = AbstractC22953f.m66722k(AbstractC1102d.m3407d(f13, c2314t2));
            }
            Modifier modifierM3393o = AbstractC1099a.m3393o(contentState.getPaddingValues(), modifierM66722k);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(m9633k(contentState), contentState.getFillMode() == FillMode.FILL ? true : z4);
            C0209i c0209i9 = c0209i3;
            int iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3393o);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC28653p1M87165m3);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i9);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N3);
            C25306o c25306oM107044g = contentState.getItemWrapper();
            if (c25306oM107044g == null) {
                c28655q2.m87150e0(156387752);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(156387753);
                boolean zM87157i = ((i15 & 112) == 32) | c28655q2.m87157i(c25306oM107044g);
                Object objM87133R = c28655q2.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new C0559j(action, c25306oM107044g, 2);
                    c28655q2.m87172p0(objM87133R);
                }
                m9627e(c25306oM107044g, (Function1) objM87133R, c28655q2, C25306o.f99297c, 0);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            int i16 = (i15 << 3) & 896;
            C2314t c2314t4 = c2314t2;
            C28655q c28655q5 = c28655q2;
            AbstractC35005g.m110531h(null, contentState.getFooterState(), action, z14, c28655q5, i16, 1);
            c28655q3 = c28655q5;
            c28655q3.m87173q(true);
            if (zM110631v) {
                c28655q3.m87150e0(-1039033340);
                action = function1;
                AbstractC35014p.m110618i(AbstractC22953f.m66725n(c1100b.mo3400a(c2314t4, C2299e.f9115x)), contentState.getNavigationBarState(), action, c28655q3, i16, 0);
                c28655q3.m87173q(false);
            } else {
                action = function1;
                c28655q3.m87150e0(-1038762338);
                c28655q3.m87173q(false);
            }
            c28655q3.m87173q(true);
        } else {
            c28655q3.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q3.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22079k(contentState, action, i13, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m9631i(Function1 function1, C25306o c25306o, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC31443b.j(it, c25306o.getState()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m9632j(C33845j c33845j, Function1 function1, int i13, Composer composer, int i14) {
        m9630h(c33845j, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    private static final InterfaceC2302h m9633k(C33845j c33845j) {
        int i13 = a.f12920b[c33845j.getVerticalAlignment().ordinal()];
        if (i13 == 1) {
            int i14 = a.f12919a[c33845j.getHorizontalAlignment().ordinal()];
            if (i14 == 1) {
                return C2299e.f9114w;
            }
            if (i14 == 2) {
                return C2299e.f9115x;
            }
            if (i14 == 3) {
                return C2299e.f9116y;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i13 == 2) {
            int i15 = a.f12919a[c33845j.getHorizontalAlignment().ordinal()];
            if (i15 == 1) {
                return C2299e.f9117z;
            }
            if (i15 == 2) {
                return C2299e.f9102E;
            }
            if (i15 == 3) {
                return C2299e.f9103F;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i13 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i16 = a.f12919a[c33845j.getHorizontalAlignment().ordinal()];
        if (i16 == 1) {
            return C2299e.f9104G;
        }
        if (i16 == 2) {
            return C2299e.f9105H;
        }
        if (i16 == 3) {
            return C2299e.f9106I;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m9634l(C33845j c33845j) {
        AbstractC22676k.m65750j(c33845j, "<this>");
        if (c33845j.getBackground() != null) {
            return false;
        }
        C25306o c25306oM107044g = c33845j.getItemWrapper();
        return (c25306oM107044g != null ? c25306oM107044g.getState() : null) instanceof InterfaceC25288a0;
    }
}
