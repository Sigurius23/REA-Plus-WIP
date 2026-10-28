package ny0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b11.C2276c;
import b91.C2886a;
import b91.EnumC2888c;
import c13.AbstractC3855a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import dp0.C12253i;
import e61.C12762e;
import fy1.C14873i;
import ge3.AbstractC15751g;
import gz0.EnumC16313m0;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import l83.InterfaceC23459e;
import m83.C25235a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17911t;
import p208i2.C17919x;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p291l0.EnumC22935a1;
import p291l0.InterfaceC22973k1;
import p292l1.AbstractC23112i3;
import p292l1.AbstractC23164r1;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p712j91.InterfaceC21430b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p719m22.C24965t;
import p745y81.EnumC39333f;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;

/* JADX INFO: renamed from: ny0.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a9\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\r\u001a\u00020\f*\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\"\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001a¨\u0006!²\u0006\f\u0010 \u001a\u00020\u001f8\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lny0/h;", "state", "Lj0/i;", "interactionSource", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "d", "(Landroidx/compose/ui/Modifier;Lny0/h;Lj0/i;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Lny0/b;", "Ly3/f;", "l", "(Lny0/b;)F", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/runtime/Composer;I)V", "a", "Lny0/h;", "k", "()Lny0/h;", "spreadCardButtonState", "", "b", "Ljava/util/List;", "getChipCardButtonStates", "()Ljava/util/List;", "chipCardButtonStates", "c", "j", "cardButtonStates", "", "isPressed", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27249e {

    /* JADX INFO: renamed from: a */
    private static final C27256h f109049a;

    /* JADX INFO: renamed from: b */
    private static final List<C27256h> f109050b;

    /* JADX INFO: renamed from: c */
    private static final List<C27256h> f109051c;

    /* JADX INFO: renamed from: ny0.e$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m82130a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(1525525316);
            EnumC22935a1 enumC22935a1 = EnumC22935a1.f90538x;
            C2314t c2314t = C2314t.f9131w;
            float f13 = 4;
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1099a.m3388j(c2314t, enumC22935a1), 2 * f13, ((float) 1.5d) * f13);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(1 * 8), C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
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
            c28655q.m87150e0(1564201741);
            for (C27256h c27256h : AbstractC27249e.m82127j()) {
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                C0209i c0209i2 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                C27246d c27246d = new C27246d();
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = b.f109052w;
                    c28655q.m87172p0(objM87133R);
                }
                c27246d.Compose(c2314t, c27256h, (Function1) objM87133R, c28655q, 390);
                c28655q.m87173q(true);
            }
            AbstractC25012a.m73392y(c28655q, false, true, false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m82130a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ny0.e$b */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f109052w = new b();

        /* JADX INFO: renamed from: a */
        public final void m82131a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m82131a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ny0.e$c */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f109053a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f109054b;

        static {
            int[] iArr = new int[EnumC27252f.values().length];
            try {
                iArr[EnumC27252f.PILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC27252f.ROUNDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f109053a = iArr;
            int[] iArr2 = new int[EnumC27240b.values().length];
            try {
                iArr2[EnumC27240b.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC27240b.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC27240b.MEDIUM_LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC27240b.LARGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f109054b = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String str = null;
        boolean z4 = false;
        boolean z13 = false;
        f109049a = new C27256h(AbstractC8693b.m21278l("Wide Button"), EnumC16313m0.HOME, null, null, null, str, null, null, null, null, null, null, null, false, z4, null, false, z13, null, null, null, null, null, null, null, 33554428, null);
        TextResource textResourceM21278l = AbstractC8693b.m21278l("Today");
        EnumC27272p enumC27272p = EnumC27272p.DARK_BACKGROUND;
        EnumC27254g enumC27254g = EnumC27254g.CHIP;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        C27256h c27256h = new C27256h(textResourceM21278l, objArr, objArr2, objArr3, str, objArr4, enumC27272p, objArr5, objArr6, objArr7, enumC27254g, objArr8, null, z4, false, null, z13, false, null, objArr9, objArr10, objArr11, objArr12, objArr13, null, 33553342, null);
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("This Week");
        EnumC16313m0 enumC16313m0 = EnumC16313m0.TINY_EXPAND;
        boolean z14 = false;
        boolean z15 = false;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        Object[] objArr18 = 0 == true ? 1 : 0;
        Object[] objArr19 = 0 == true ? 1 : 0;
        Object[] objArr20 = 0 == true ? 1 : 0;
        f109050b = AbstractC37056f.m118959K(c27256h, new C27256h(textResourceM21278l2, enumC16313m0, null, objArr14, objArr19, null, null, objArr20, null, null, enumC27254g, objArr15, objArr16, false, false, objArr17, z14, z15, objArr18, null, null, EnumC27243c.TRAILING_ICON, null, null, null, 31456252, null));
        boolean z16 = false;
        Object[] objArr21 = 0 == true ? 1 : 0;
        Object[] objArr22 = 0 == true ? 1 : 0;
        Object[] objArr23 = 0 == true ? 1 : 0;
        Object[] objArr24 = 0 == true ? 1 : 0;
        Object[] objArr25 = 0 == true ? 1 : 0;
        Object[] objArr26 = 0 == true ? 1 : 0;
        Object[] objArr27 = 0 == true ? 1 : 0;
        Object[] objArr28 = 0 == true ? 1 : 0;
        Object[] objArr29 = 0 == true ? 1 : 0;
        Object[] objArr30 = 0 == true ? 1 : 0;
        Object[] objArr31 = 0 == true ? 1 : 0;
        Object[] objArr32 = 0 == true ? 1 : 0;
        Object[] objArr33 = 0 == true ? 1 : 0;
        C27256h c27256h2 = new C27256h(AbstractC8693b.m21278l("Activity"), EnumC16313m0.ADD, objArr27, objArr28, objArr25, objArr29, objArr30, null, objArr21, objArr22, null, null, objArr23, z14, z15, objArr24, false, z16, null, objArr31, objArr32, objArr33, null, objArr26, null, 33554428, null);
        DefaultConstructorMarker defaultConstructorMarker = null;
        C39174f c39174f = null;
        boolean z17 = false;
        String str2 = null;
        boolean z18 = false;
        AbstractC18247a abstractC18247a = null;
        Object[] objArr34 = 0 == true ? 1 : 0;
        Object[] objArr35 = 0 == true ? 1 : 0;
        Object[] objArr36 = 0 == true ? 1 : 0;
        Object[] objArr37 = 0 == true ? 1 : 0;
        Object[] objArr38 = 0 == true ? 1 : 0;
        Object[] objArr39 = 0 == true ? 1 : 0;
        Object[] objArr40 = 0 == true ? 1 : 0;
        Object[] objArr41 = 0 == true ? 1 : 0;
        Object[] objArr42 = 0 == true ? 1 : 0;
        Object[] objArr43 = 0 == true ? 1 : 0;
        Object[] objArr44 = 0 == true ? 1 : 0;
        Object[] objArr45 = 0 == true ? 1 : 0;
        C27256h c27256h3 = new C27256h(AbstractC8693b.m21278l("No Icon"), objArr39, objArr40, objArr37, objArr41, objArr42, 0 == true ? 1 : 0, objArr34, objArr35, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr36, c39174f, z15, z17, str2, z16, z18, objArr43, objArr44, objArr45, 0 == true ? 1 : 0, objArr38, 0 == true ? 1 : 0, abstractC18247a, 33554430, defaultConstructorMarker);
        Object[] objArr46 = 0 == true ? 1 : 0;
        Object[] objArr47 = 0 == true ? 1 : 0;
        Object[] objArr48 = 0 == true ? 1 : 0;
        Object[] objArr49 = 0 == true ? 1 : 0;
        Object[] objArr50 = 0 == true ? 1 : 0;
        Object[] objArr51 = 0 == true ? 1 : 0;
        Object[] objArr52 = 0 == true ? 1 : 0;
        Object[] objArr53 = 0 == true ? 1 : 0;
        Object[] objArr54 = 0 == true ? 1 : 0;
        Object[] objArr55 = 0 == true ? 1 : 0;
        Object[] objArr56 = 0 == true ? 1 : 0;
        f109051c = AbstractC37056f.m118959K(c27256h2, c27256h3, new C27256h(AbstractC8693b.m21278l("Testing Very Long Title Button Text: Go! "), enumC16313m0, objArr51, objArr49, objArr52, objArr53, 0 == true ? 1 : 0, objArr46, objArr47, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr48, c39174f, z15, z17, str2, z16, z18, objArr54, objArr55, objArr56, 0 == true ? 1 : 0, objArr50, 0 == true ? 1 : 0, abstractC18247a, 33554428, defaultConstructorMarker));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x017f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0187  */
    /* JADX WARN: Code duplicated, block: B:104:0x0189  */
    /* JADX WARN: Code duplicated, block: B:108:0x0192  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:112:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:115:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:116:0x01de  */
    /* JADX WARN: Code duplicated, block: B:119:0x020f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0213  */
    /* JADX WARN: Code duplicated, block: B:125:0x0234  */
    /* JADX WARN: Code duplicated, block: B:128:0x0242  */
    /* JADX WARN: Code duplicated, block: B:129:0x0244  */
    /* JADX WARN: Code duplicated, block: B:132:0x0269  */
    /* JADX WARN: Code duplicated, block: B:133:0x026d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0288  */
    /* JADX WARN: Code duplicated, block: B:144:0x029e  */
    /* JADX WARN: Code duplicated, block: B:150:0x02af  */
    /* JADX WARN: Code duplicated, block: B:153:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:155:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:157:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:158:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:161:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:162:0x032c  */
    /* JADX WARN: Code duplicated, block: B:165:0x039e  */
    /* JADX WARN: Code duplicated, block: B:166:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:169:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:170:0x0416  */
    /* JADX WARN: Code duplicated, block: B:172:0x0426  */
    /* JADX WARN: Code duplicated, block: B:175:0x0431  */
    /* JADX WARN: Code duplicated, block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x006d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0085  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00be  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:66:0x00db  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fe A[PHI: r12
      0x00fe: PHI (r12v21 y3.f) = (r12v0 y3.f), (r12v2 y3.f) binds: [B:68:0x00fc, B:71:0x0109] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x014c  */
    /* JADX WARN: Code duplicated, block: B:87:0x014f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0154  */
    /* JADX WARN: Code duplicated, block: B:90:0x015a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0166  */
    /* JADX WARN: Code duplicated, block: B:94:0x0169  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX INFO: renamed from: d */
    public static final void m82121d(Modifier modifier, C27256h state, InterfaceC21083i interfaceC21083i, InterfaceC4339a onClick, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        InterfaceC21083i interfaceC21083i2;
        boolean z4;
        Modifier modifier3;
        InterfaceC21083i interfaceC21083i3;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C28676v0 c28676v0;
        InterfaceC28601c1 interfaceC28601c1M44460m;
        AbstractC18247a abstractC18247aM82149g;
        InterfaceC21430b interfaceC21430bM82150h;
        C17919x c17919xM31989h;
        AbstractC17911t abstractC17911tMo60316a;
        float fM134467getVerticalPaddingD9Ej5fM;
        float fM134466getHorizontalPaddingD9Ej5fM;
        C39174f cornerRadius;
        float fM134465getCornerRadiusD9Ej5fM;
        EnumC2888c textStyle;
        int i16;
        C33252i c33252iM105486b;
        float f13;
        boolean z13;
        boolean z14;
        Object obj;
        Modifier modifierM118994r;
        Modifier modifierMo3471e;
        Modifier modifierM52565c;
        InterfaceC22973k1 paddingValues;
        Modifier modifierMo3471e2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        float f14;
        int iHashCode2;
        boolean z15;
        boolean z16;
        EnumC39333f iconColor;
        ?? r10;
        C17919x c17919x;
        long jMo134584toComposableColorWaAFU9c;
        long j7;
        C2314t c2314t2;
        boolean z17;
        int i17;
        boolean z18;
        C2314t c2314t3;
        C28655q c28655q2;
        C2314t c2314t4;
        ?? r14;
        C28655q c28655q3;
        Object objM87133R;
        Object objM30453g;
        int i18;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(1769444995);
        int i19 = i14 & 1;
        if (i19 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q4.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q4.m87157i(state) ? 32 : 16;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
            if ((i13 & 384) == 0) {
                interfaceC21083i2 = interfaceC21083i;
                i15 |= c28655q4.m87153g(interfaceC21083i2) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q4.m87157i(onClick)) {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i18;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q4.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R = c28655q4.m87133R();
                    if (objM87133R == c28676v0) {
                        objM30453g = objM87133R;
                        objM30453g = AbstractC11266d.m30453g(c28655q4);
                    }
                    objM30453g = objM87133R;
                    interfaceC21083i2 = (InterfaceC21083i) objM30453g;
                }
                interfaceC28601c1M44460m = AbstractC15751g.m44460m(interfaceC21083i2, c28655q4, (i15 >> 6) & 14);
                if (!state.getEnabled()) {
                    abstractC18247aM82149g = state.getDisabledBackgroundOverride();
                    if (abstractC18247aM82149g == null) {
                        abstractC18247aM82149g = EnumC27272p.DEFAULT.getBackground();
                    }
                } else if (m82122e(interfaceC28601c1M44460m)) {
                    abstractC18247aM82149g = state.m82163u();
                } else {
                    abstractC18247aM82149g = state.m82149g();
                }
                interfaceC21430bM82150h = state.m82150h();
                c17919xM31989h = null;
                if (interfaceC21430bM82150h == null) {
                    c28655q4.m87150e0(1402731723);
                    c28655q4.m87173q(false);
                    abstractC17911tMo60316a = null;
                } else {
                    c28655q4.m87150e0(-370392586);
                    abstractC17911tMo60316a = interfaceC21430bM82150h.mo60316a(c28655q4, 0);
                    c28655q4.m87173q(false);
                }
                fM134467getVerticalPaddingD9Ej5fM = state.getButtonSize().getVerticalPadding();
                fM134466getHorizontalPaddingD9Ej5fM = state.getButtonSize().getHorizontalPadding();
                cornerRadius = state.getCornerRadius();
                if (cornerRadius != null && (cornerRadius = state.getStyle().getCornerRadius()) == null) {
                    fM134465getCornerRadiusD9Ej5fM = state.getButtonSize().getCornerRadius();
                } else {
                    fM134465getCornerRadiusD9Ej5fM = cornerRadius.f168413w;
                }
                textStyle = state.getTextStyle();
                if ((textStyle != null || (titleStyle = EnumC2888c.INSTANCE.m8402a(textStyle)) == null) && (titleStyle = state.getStyle().getTitleStyle()) == null) {
                }
                C2886a c2886a = titleStyle;
                i16 = c.f109053a[state.getButtonSize().getShape().ordinal()];
                if (i16 != 1) {
                    c33252iM105486b = AbstractC33253j.m105486b(50);
                } else {
                    if (i16 == 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c33252iM105486b = AbstractC33253j.m105489e(fM134465getCornerRadiusD9Ej5fM);
                }
                if (state.getEnabled()) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.4f;
                }
                Modifier modifierM107879c = AbstractC34132o.m107879c(f13, c2314t);
                if (state.getEnabled() || state.getIsLoading()) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if ((i15 & 7168) == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                Object objM87133R2 = c28655q4.m87133R();
                obj = objM87133R2;
                if (z14 || objM87133R2 == c28676v0) {
                    C12762e c12762e = new C12762e(onClick, 6);
                    c28655q4.m87172p0(c12762e);
                    obj = c12762e;
                }
                InterfaceC21083i interfaceC21083i4 = interfaceC21083i2;
                modifierM118994r = AbstractC37056f.m118994r(AbstractC1092a.m3360e(modifierM107879c, interfaceC21083i4, null, z13, null, (InterfaceC4339a) obj, 24), c33252iM105486b);
                if (abstractC17911tMo60316a != null) {
                    modifierMo3471e = modifierM118994r.mo3471e(AbstractC15751g.m44456i((float) 1.5d, c2314t, abstractC17911tMo60316a, c33252iM105486b));
                } else {
                    modifierMo3471e = modifierM118994r.mo3471e(c2314t);
                }
                modifierM52565c = AbstractC18249c.m52565c(modifierMo3471e, abstractC18247aM82149g);
                paddingValues = state.getStyle().getPaddingValues();
                if (paddingValues != null) {
                    modifierMo3471e2 = modifierM52565c.mo3471e(AbstractC1099a.m3393o(paddingValues, c2314t));
                } else {
                    modifierMo3471e2 = modifierM52565c.mo3471e(AbstractC1099a.m3395q(c2314t, fM134466getHorizontalPaddingD9Ej5fM, fM134467getVerticalPaddingD9Ej5fM));
                }
                Modifier modifierMo3471e3 = modifier4.mo3471e(modifierMo3471e2);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, modifierMo3471e3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC39127r0M66763d);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q4, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N);
                if (state.getIsLoading()) {
                    f14 = 0.0f;
                } else {
                    f14 = 1.0f;
                }
                Modifier modifierM107879c2 = AbstractC34132o.m107879c(f14, c2314t);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q4, 54);
                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, modifierM107879c2);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i2, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q4, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N2);
                if (state.getIcon() == null && state.getIconConfiguration() == EnumC27243c.LEADING_ICON) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (state.getIcon() == null && state.getIconConfiguration() == EnumC27243c.TRAILING_ICON) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                iconColor = state.getStyle().getIconColor();
                if (iconColor == null) {
                    c28655q4.m87150e0(1985527957);
                    r10 = 0;
                    c28655q4.m87173q(false);
                } else {
                    r10 = 0;
                    c28655q4.m87150e0(-905782036);
                    c17919xM31989h = AbstractC11895b.m31989h(c28655q4, false, iconColor.mo134584toComposableColorWaAFU9c(c28655q4, 0));
                }
                c17919x = c17919xM31989h;
                if (c17919x == null) {
                    c28655q4.m87150e0(-905780756);
                    jMo134584toComposableColorWaAFU9c = state.m82167y().mo134584toComposableColorWaAFU9c(c28655q4, r10);
                    c28655q4.m87173q(r10);
                } else {
                    c28655q4.m87150e0(-905782709);
                    c28655q4.m87173q(r10);
                    jMo134584toComposableColorWaAFU9c = c17919x.f69639a;
                }
                if (z15) {
                    c28655q4.m87150e0(1985631219);
                    float f15 = 4;
                    c2314t2 = c2314t;
                    long j13 = jMo134584toComposableColorWaAFU9c;
                    AbstractC23164r1.m67133b(AbstractC34132o.m107874S(state.getIcon().toWhoopIcon(), c28655q4, 6), "", AbstractC1102d.m3419p(f15 * f15, c2314t), j13, c28655q4, 432, 0);
                    j7 = j13;
                    z17 = true;
                    i17 = 0;
                    AbstractC31061c.m95650z(1, 8, c2314t2, c28655q4, false);
                } else {
                    j7 = jMo134584toComposableColorWaAFU9c;
                    c2314t2 = c2314t;
                    z17 = true;
                    i17 = 0;
                    c28655q4.m87150e0(1985959881);
                    c28655q4.m87173q(false);
                }
                z18 = z17;
                c2314t3 = c2314t2;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(state.getTitle(), c28655q4, i17), null, state.m82167y().mo134584toComposableColorWaAFU9c(c28655q4, i17), 0L, null, null, null, 0L, null, null, 0L, 2, false, state.getButtonSize().getMaxLines(), 0, null, c2886a, null, c28655q4, 0, 48, 186362);
                c28655q2 = c28655q4;
                if (z16) {
                    c28655q2.m87150e0(1986285939);
                    c2314t4 = c2314t3;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p((z18 ? 1.0f : 0.0f) * 8, c2314t4));
                    float f16 = 4;
                    AbstractC23164r1.m67133b(AbstractC34132o.m107874S(state.getIcon().toWhoopIcon(), c28655q2, 6), "", AbstractC1102d.m3419p(f16 * f16, c2314t4), j7, c28655q2, 432, 0);
                    r14 = 0;
                    c28655q2.m87173q(false);
                } else {
                    c2314t4 = c2314t3;
                    r14 = 0;
                    c28655q2.m87150e0(1986614601);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(z18);
                if (state.getIsLoading()) {
                    c28655q2.m87150e0(1259841446);
                    float f17 = 4;
                    AbstractC23112i3.m67090a(AbstractC1102d.m3419p(f17 * f17, c2314t4), state.m82167y().mo134584toComposableColorWaAFU9c(c28655q2, r14), (float) 1.5d, 0L, 0, 0.0f, c28655q2, 390, 56);
                    C28655q c28655q5 = c28655q2;
                    c28655q5.m87173q(r14);
                    c28655q3 = c28655q5;
                } else {
                    c28655q2.m87150e0(1260034917);
                    c28655q2.m87173q(r14);
                    c28655q3 = c28655q2;
                }
                c28655q3.m87173q(z18);
                modifier3 = modifier4;
                interfaceC21083i3 = interfaceC21083i4;
                c28655q = c28655q3;
            } else {
                c28655q4.m87138X();
                modifier3 = modifier2;
                interfaceC21083i3 = interfaceC21083i2;
                c28655q = c28655q4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2276c(modifier3, (Object) state, (Object) interfaceC21083i3, (InterfaceC23459e) onClick, i13, i14, 5);
            }
        }
        i15 |= 384;
        interfaceC21083i2 = interfaceC21083i;
        if ((i13 & 3072) == 0) {
            if (c28655q4.m87157i(onClick)) {
                i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i18;
        }
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q4.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i19 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R = c28655q4.m87133R();
                if (objM87133R == c28676v0) {
                    objM30453g = objM87133R;
                    objM30453g = AbstractC11266d.m30453g(c28655q4);
                }
                objM30453g = objM87133R;
                interfaceC21083i2 = (InterfaceC21083i) objM30453g;
            }
            interfaceC28601c1M44460m = AbstractC15751g.m44460m(interfaceC21083i2, c28655q4, (i15 >> 6) & 14);
            if (!state.getEnabled()) {
                abstractC18247aM82149g = state.getDisabledBackgroundOverride();
                if (abstractC18247aM82149g == null) {
                    abstractC18247aM82149g = EnumC27272p.DEFAULT.getBackground();
                }
            } else if (m82122e(interfaceC28601c1M44460m)) {
                abstractC18247aM82149g = state.m82163u();
            } else {
                abstractC18247aM82149g = state.m82149g();
            }
            interfaceC21430bM82150h = state.m82150h();
            c17919xM31989h = null;
            if (interfaceC21430bM82150h == null) {
                c28655q4.m87150e0(1402731723);
                c28655q4.m87173q(false);
                abstractC17911tMo60316a = null;
            } else {
                c28655q4.m87150e0(-370392586);
                abstractC17911tMo60316a = interfaceC21430bM82150h.mo60316a(c28655q4, 0);
                c28655q4.m87173q(false);
            }
            fM134467getVerticalPaddingD9Ej5fM = state.getButtonSize().getVerticalPadding();
            fM134466getHorizontalPaddingD9Ej5fM = state.getButtonSize().getHorizontalPadding();
            cornerRadius = state.getCornerRadius();
            if (cornerRadius != null) {
                fM134465getCornerRadiusD9Ej5fM = cornerRadius.f168413w;
            } else {
                fM134465getCornerRadiusD9Ej5fM = state.getButtonSize().getCornerRadius();
            }
            textStyle = state.getTextStyle();
            C2886a titleStyle = textStyle != null ? state.getButtonSize().getTextStyle() : state.getButtonSize().getTextStyle();
            C2886a c2886a2 = titleStyle;
            i16 = c.f109053a[state.getButtonSize().getShape().ordinal()];
            if (i16 != 1) {
                c33252iM105486b = AbstractC33253j.m105486b(50);
            } else {
                if (i16 == 2) {
                    throw new NoWhenBranchMatchedException();
                }
                c33252iM105486b = AbstractC33253j.m105489e(fM134465getCornerRadiusD9Ej5fM);
            }
            if (state.getEnabled()) {
                f13 = 1.0f;
            } else {
                f13 = 0.4f;
            }
            Modifier modifierM107879c3 = AbstractC34132o.m107879c(f13, c2314t);
            if (state.getEnabled()) {
                z13 = false;
            } else {
                z13 = false;
            }
            if ((i15 & 7168) == 2048) {
                z14 = true;
            } else {
                z14 = false;
            }
            Object objM87133R3 = c28655q4.m87133R();
            obj = objM87133R3;
            if (z14) {
                C12762e c12762e2 = new C12762e(onClick, 6);
                c28655q4.m87172p0(c12762e2);
                obj = c12762e2;
            } else {
                C12762e c12762e3 = new C12762e(onClick, 6);
                c28655q4.m87172p0(c12762e3);
                obj = c12762e3;
            }
            InterfaceC21083i interfaceC21083i5 = interfaceC21083i2;
            modifierM118994r = AbstractC37056f.m118994r(AbstractC1092a.m3360e(modifierM107879c3, interfaceC21083i5, null, z13, null, (InterfaceC4339a) obj, 24), c33252iM105486b);
            if (abstractC17911tMo60316a != null) {
                modifierMo3471e = modifierM118994r.mo3471e(AbstractC15751g.m44456i((float) 1.5d, c2314t, abstractC17911tMo60316a, c33252iM105486b));
            } else {
                modifierMo3471e = modifierM118994r.mo3471e(c2314t);
            }
            modifierM52565c = AbstractC18249c.m52565c(modifierMo3471e, abstractC18247aM82149g);
            paddingValues = state.getStyle().getPaddingValues();
            if (paddingValues != null) {
                modifierMo3471e2 = modifierM52565c.mo3471e(AbstractC1099a.m3393o(paddingValues, c2314t));
            } else {
                modifierMo3471e2 = modifierM52565c.mo3471e(AbstractC1099a.m3395q(c2314t, fM134466getHorizontalPaddingD9Ej5fM, fM134467getVerticalPaddingD9Ej5fM));
            }
            Modifier modifierMo3471e4 = modifier4.mo3471e(modifierMo3471e2);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q4.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q4, modifierMo3471e4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q4, c0209i5, interfaceC39127r0M66763d2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q4, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q4, c0209i7, modifierM118962N3);
            if (state.getIsLoading()) {
                f14 = 0.0f;
            } else {
                f14 = 1.0f;
            }
            Modifier modifierM107879c4 = AbstractC34132o.m107879c(f14, c2314t);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q4, 54);
            iHashCode2 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q4.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q4, modifierM107879c4);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i5, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q4, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q4, c0209i7, modifierM118962N4);
            if (state.getIcon() == null) {
                z15 = false;
            } else {
                z15 = false;
            }
            if (state.getIcon() == null) {
                z16 = false;
            } else {
                z16 = false;
            }
            iconColor = state.getStyle().getIconColor();
            if (iconColor == null) {
                c28655q4.m87150e0(1985527957);
                r10 = 0;
                c28655q4.m87173q(false);
            } else {
                r10 = 0;
                c28655q4.m87150e0(-905782036);
                c17919xM31989h = AbstractC11895b.m31989h(c28655q4, false, iconColor.mo134584toComposableColorWaAFU9c(c28655q4, 0));
            }
            c17919x = c17919xM31989h;
            if (c17919x == null) {
                c28655q4.m87150e0(-905780756);
                jMo134584toComposableColorWaAFU9c = state.m82167y().mo134584toComposableColorWaAFU9c(c28655q4, r10);
                c28655q4.m87173q(r10);
            } else {
                c28655q4.m87150e0(-905782709);
                c28655q4.m87173q(r10);
                jMo134584toComposableColorWaAFU9c = c17919x.f69639a;
            }
            if (z15) {
                c28655q4.m87150e0(1985631219);
                float f18 = 4;
                c2314t2 = c2314t;
                long j14 = jMo134584toComposableColorWaAFU9c;
                AbstractC23164r1.m67133b(AbstractC34132o.m107874S(state.getIcon().toWhoopIcon(), c28655q4, 6), "", AbstractC1102d.m3419p(f18 * f18, c2314t), j14, c28655q4, 432, 0);
                j7 = j14;
                z17 = true;
                i17 = 0;
                AbstractC31061c.m95650z(1, 8, c2314t2, c28655q4, false);
            } else {
                j7 = jMo134584toComposableColorWaAFU9c;
                c2314t2 = c2314t;
                z17 = true;
                i17 = 0;
                c28655q4.m87150e0(1985959881);
                c28655q4.m87173q(false);
            }
            z18 = z17;
            c2314t3 = c2314t2;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(state.getTitle(), c28655q4, i17), null, state.m82167y().mo134584toComposableColorWaAFU9c(c28655q4, i17), 0L, null, null, null, 0L, null, null, 0L, 2, false, state.getButtonSize().getMaxLines(), 0, null, c2886a2, null, c28655q4, 0, 48, 186362);
            c28655q2 = c28655q4;
            if (z16) {
                c28655q2.m87150e0(1986285939);
                c2314t4 = c2314t3;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p((z18 ? 1.0f : 0.0f) * 8, c2314t4));
                float f19 = 4;
                AbstractC23164r1.m67133b(AbstractC34132o.m107874S(state.getIcon().toWhoopIcon(), c28655q2, 6), "", AbstractC1102d.m3419p(f19 * f19, c2314t4), j7, c28655q2, 432, 0);
                r14 = 0;
                c28655q2.m87173q(false);
            } else {
                c2314t4 = c2314t3;
                r14 = 0;
                c28655q2.m87150e0(1986614601);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(z18);
            if (state.getIsLoading()) {
                c28655q2.m87150e0(1259841446);
                float f110 = 4;
                AbstractC23112i3.m67090a(AbstractC1102d.m3419p(f110 * f110, c2314t4), state.m82167y().mo134584toComposableColorWaAFU9c(c28655q2, r14), (float) 1.5d, 0L, 0, 0.0f, c28655q2, 390, 56);
                C28655q c28655q6 = c28655q2;
                c28655q6.m87173q(r14);
                c28655q3 = c28655q6;
            } else {
                c28655q2.m87150e0(1260034917);
                c28655q2.m87173q(r14);
                c28655q3 = c28655q2;
            }
            c28655q3.m87173q(z18);
            modifier3 = modifier4;
            interfaceC21083i3 = interfaceC21083i5;
            c28655q = c28655q3;
        } else {
            c28655q4.m87138X();
            modifier3 = modifier2;
            interfaceC21083i3 = interfaceC21083i2;
            c28655q = c28655q4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2276c(modifier3, (Object) state, (Object) interfaceC21083i3, (InterfaceC23459e) onClick, i13, i14, 5);
        }
    }

    /* JADX INFO: renamed from: e */
    private static final boolean m82122e(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m82123f(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m82124g(Modifier modifier, C27256h c27256h, InterfaceC21083i interfaceC21083i, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m82121d(modifier, c27256h, interfaceC21083i, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    public static final void m82125h(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(703786875);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new a()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24965t(i13, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m82126i(int i13, Composer composer, int i14) {
        m82125h(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    public static final List<C27256h> m82127j() {
        return f109051c;
    }

    /* JADX INFO: renamed from: k */
    public static final C27256h m82128k() {
        return f109049a;
    }

    /* JADX INFO: renamed from: l */
    public static final float m82129l(EnumC27240b enumC27240b) {
        AbstractC22676k.m65750j(enumC27240b, "<this>");
        int i13 = c.f109054b[enumC27240b.ordinal()];
        if (i13 == 1) {
            return 1 * 4;
        }
        if (i13 == 2) {
            return 2 * 4;
        }
        if (i13 == 3) {
            return 3 * 4;
        }
        if (i13 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        float f13 = 4;
        return f13 * f13;
    }
}
