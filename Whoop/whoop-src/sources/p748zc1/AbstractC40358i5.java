package p748zc1;

import am2.C1024j;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import b30.C2559k4;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import gz0.AbstractC16319p0;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22404p;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27274q;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p733ry2.C31915d;
import pz0.AbstractC29641d;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import wo1.C37450h;
import x81.C38072d;

/* JADX INFO: renamed from: zc1.i5 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0004\u0010\u0002\u001a?\u0010\f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00000\nH\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Ll83/a0;", "U", "(Landroidx/compose/runtime/Composer;I)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "I", "", "text", "", "enabled", "checked", "Lkotlin/Function1;", "onCheckedChange", "F", "(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40358i5 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m129939A(int i13, Composer composer, int i14) {
        m129983w(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m129940B(Context context) {
        Toast.makeText(context, "Centered: Left Icon Clicked", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m129941C(Context context) {
        Toast.makeText(context, "Centered: Right Icon Clicked", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m129942D(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, AbstractC6721d.a aVar, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
        AbstractC6721d.a aVar2 = (AbstractC6721d.a) interfaceC28601c2.getValue();
        interfaceC28601c2.setValue(aVar2.m20156a((32763 & 1) != 0 ? aVar2.title : null, (32763 & 2) != 0 ? aVar2.subtitle : null, (32763 & 4) != 0 ? aVar2.leftIcon : z4 ? aVar.getLeftIcon() : null, (32763 & 8) != 0 ? aVar2.rightIcon : null, (32763 & 16) != 0 ? aVar2.leftIconButtonType : null, (32763 & 32) != 0 ? aVar2.rightIconButtonType : null, (32763 & 64) != 0 ? aVar2.shouldKeepOriginalIconColor : false, (32763 & 128) != 0 ? aVar2.rightIconView : null, (32763 & 256) != 0 ? aVar2.rightIconColor : null, (32763 & 512) != 0 ? aVar2.leftIconColor : null, (32763 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? aVar2.titleColor : null, (32763 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? aVar2.subtitleColor : null, (32763 & 4096) != 0 ? aVar2.tag : null, (32763 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? aVar2.titleAutomationTag : null, (32763 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? aVar2.leftIconAutomationTag : null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m129943E(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, AbstractC6721d.a aVar, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
        AbstractC6721d.a aVar2 = (AbstractC6721d.a) interfaceC28601c2.getValue();
        interfaceC28601c2.setValue(aVar2.m20156a((32763 & 1) != 0 ? aVar2.title : z4 ? aVar.getTitle() : AbstractC8693b.m21267a(), (32763 & 2) != 0 ? aVar2.subtitle : null, (32763 & 4) != 0 ? aVar2.leftIcon : null, (32763 & 8) != 0 ? aVar2.rightIcon : null, (32763 & 16) != 0 ? aVar2.leftIconButtonType : null, (32763 & 32) != 0 ? aVar2.rightIconButtonType : null, (32763 & 64) != 0 ? aVar2.shouldKeepOriginalIconColor : false, (32763 & 128) != 0 ? aVar2.rightIconView : null, (32763 & 256) != 0 ? aVar2.rightIconColor : null, (32763 & 512) != 0 ? aVar2.leftIconColor : null, (32763 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? aVar2.titleColor : null, (32763 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? aVar2.subtitleColor : null, (32763 & 4096) != 0 ? aVar2.tag : null, (32763 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? aVar2.titleAutomationTag : null, (32763 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? aVar2.leftIconAutomationTag : null));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00da  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:62:0x012c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0134  */
    /* JADX WARN: Code duplicated, block: B:67:0x0138  */
    /* JADX WARN: Code duplicated, block: B:69:0x0162  */
    /* JADX WARN: Code duplicated, block: B:72:0x016d  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: F */
    private static final void m129944F(String str, boolean z4, boolean z13, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        boolean z14;
        int i16;
        boolean z15;
        int i17;
        boolean z16;
        boolean z17;
        boolean z18;
        C28677v1 c28677v1M87180u;
        boolean z19;
        boolean z24;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z25;
        Object objM87133R;
        int i18;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1294986167);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
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
                if ((i13 & 3072) == 0) {
                    if (c28655q.m87157i(function1)) {
                        i18 = 2048;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i18;
                }
                if ((i15 & 1171) != 1170) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    if (i19 != 0) {
                        z19 = true;
                    } else {
                        z19 = z14;
                    }
                    if (i16 != 0) {
                        z24 = true;
                    } else {
                        z24 = z15;
                    }
                    float f13 = 4;
                    Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 10 * f13, 2 * f13);
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    AbstractC30795n.m94707h(str, null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c28655q, i15 & 14, 0, 262138);
                    c28655q = c28655q;
                    z25 = (i15 & 7168) == 2048;
                    objM87133R = c28655q.m87133R();
                    if (z25 || objM87133R == C28635l.f115821a) {
                        objM87133R = new C37450h(function1, 24);
                        c28655q.m87172p0(objM87133R);
                    }
                    boolean z26 = z19;
                    boolean z27 = z24;
                    AbstractC29641d.m91043e(null, z27, z26, 0L, null, null, (Function1) objM87133R, c28655q, ((i15 >> 3) & 112) | ((i15 << 3) & 896), 57);
                    c28655q.m87173q(true);
                    z18 = z27;
                    z17 = z26;
                } else {
                    c28655q.m87138X();
                    z17 = z14;
                    z18 = z15;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2559k4(str, z17, z18, function1, i13, i14, 9);
                }
            }
            i15 |= 384;
            z15 = z13;
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(function1)) {
                    i18 = 2048;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i18;
            }
            if ((i15 & 1171) != 1170) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                if (i19 != 0) {
                    z19 = true;
                } else {
                    z19 = z14;
                }
                if (i16 != 0) {
                    z24 = true;
                } else {
                    z24 = z15;
                }
                float f14 = 4;
                Modifier modifierM3395q2 = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 10 * f14, 2 * f14);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3395q2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                AbstractC30795n.m94707h(str, null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c28655q, i15 & 14, 0, 262138);
                c28655q = c28655q;
                if ((i15 & 7168) == 2048) {
                }
                objM87133R = c28655q.m87133R();
                if (z25) {
                    objM87133R = new C37450h(function1, 24);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C37450h(function1, 24);
                    c28655q.m87172p0(objM87133R);
                }
                boolean z28 = z19;
                boolean z29 = z24;
                AbstractC29641d.m91043e(null, z29, z28, 0L, null, null, (Function1) objM87133R, c28655q, ((i15 >> 3) & 112) | ((i15 << 3) & 896), 57);
                c28655q.m87173q(true);
                z18 = z29;
                z17 = z28;
            } else {
                c28655q.m87138X();
                z17 = z14;
                z18 = z15;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2559k4(str, z17, z18, function1, i13, i14, 9);
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
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(function1)) {
                    i18 = 2048;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i18;
            }
            if ((i15 & 1171) != 1170) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                if (i19 != 0) {
                    z19 = true;
                } else {
                    z19 = z14;
                }
                if (i16 != 0) {
                    z24 = true;
                } else {
                    z24 = z15;
                }
                float f15 = 4;
                Modifier modifierM3395q3 = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 10 * f15, 2 * f15);
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3395q3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                AbstractC30795n.m94707h(str, null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c28655q, i15 & 14, 0, 262138);
                c28655q = c28655q;
                if ((i15 & 7168) == 2048) {
                }
                objM87133R = c28655q.m87133R();
                if (z25) {
                    objM87133R = new C37450h(function1, 24);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C37450h(function1, 24);
                    c28655q.m87172p0(objM87133R);
                }
                boolean z210 = z19;
                boolean z211 = z24;
                AbstractC29641d.m91043e(null, z211, z210, 0L, null, null, (Function1) objM87133R, c28655q, ((i15 >> 3) & 112) | ((i15 << 3) & 896), 57);
                c28655q.m87173q(true);
                z18 = z211;
                z17 = z210;
            } else {
                c28655q.m87138X();
                z17 = z14;
                z18 = z15;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2559k4(str, z17, z18, function1, i13, i14, 9);
            }
        }
        i15 |= 384;
        z15 = z13;
        if ((i13 & 3072) == 0) {
            if (c28655q.m87157i(function1)) {
                i18 = 2048;
            } else {
                i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i18;
        }
        if ((i15 & 1171) != 1170) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (c28655q.m87135U(i15 & 1, z16)) {
            if (i19 != 0) {
                z19 = true;
            } else {
                z19 = z14;
            }
            if (i16 != 0) {
                z24 = true;
            } else {
                z24 = z15;
            }
            float f16 = 4;
            Modifier modifierM3395q4 = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 10 * f16, 2 * f16);
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3395q4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            AbstractC30795n.m94707h(str, null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c28655q, i15 & 14, 0, 262138);
            c28655q = c28655q;
            if ((i15 & 7168) == 2048) {
            }
            objM87133R = c28655q.m87133R();
            if (z25) {
                objM87133R = new C37450h(function1, 24);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C37450h(function1, 24);
                c28655q.m87172p0(objM87133R);
            }
            boolean z212 = z19;
            boolean z213 = z24;
            AbstractC29641d.m91043e(null, z213, z212, 0L, null, null, (Function1) objM87133R, c28655q, ((i15 >> 3) & 112) | ((i15 << 3) & 896), 57);
            c28655q.m87173q(true);
            z18 = z213;
            z17 = z212;
        } else {
            c28655q.m87138X();
            z17 = z14;
            z18 = z15;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2559k4(str, z17, z18, function1, i13, i14, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m129945G(Function1 function1, boolean z4) {
        function1.invoke(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m129946H(String str, boolean z4, boolean z13, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m129944F(str, z4, z13, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

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
    /* JADX INFO: renamed from: I */
    private static final void m129947I(Composer composer, int i13) {
        final InterfaceC28601c1 interfaceC28601c1;
        InterfaceC28601c1 interfaceC28601c2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-374365737);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            final AbstractC6721d.c cVar = new AbstractC6721d.c(AbstractC8693b.m21278l("17.1"), AbstractC8693b.m21278l("Title"), AbstractC8693b.m21278l("Subtitle"), Integer.valueOf(AbstractC16319p0.m46430a().getAction().getCross()), null, Integer.valueOf(AbstractC16319p0.m46430a().getAction().getPencil()), null, AbstractC22404p.m64502k(AbstractC16319p0.m46430a().getActivities().getCycling()), null, null, null, null, null, 8016, null);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(cVar);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R2;
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q.m87172p0(objM87133R3);
            }
            final InterfaceC28601c1 interfaceC28601c5 = (InterfaceC28601c1) objM87133R3;
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q.m87172p0(objM87133R4);
            }
            final InterfaceC28601c1 interfaceC28601c6 = (InterfaceC28601c1) objM87133R4;
            Object objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q.m87172p0(objM87133R5);
            }
            final InterfaceC28601c1 interfaceC28601c7 = (InterfaceC28601c1) objM87133R5;
            Object objM87133R6 = c28655q.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q.m87172p0(objM87133R6);
            }
            InterfaceC28601c1 interfaceC28601c8 = (InterfaceC28601c1) objM87133R6;
            Object objM87133R7 = c28655q.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q.m87172p0(objM87133R7);
            }
            final InterfaceC28601c1 interfaceC28601c9 = (InterfaceC28601c1) objM87133R7;
            Object objM87133R8 = c28655q.m87133R();
            if (objM87133R8 == c28676v0) {
                objM87133R8 = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q.m87172p0(objM87133R8);
            }
            final InterfaceC28601c1 interfaceC28601c10 = (InterfaceC28601c1) objM87133R8;
            Object objM87133R9 = c28655q.m87133R();
            if (objM87133R9 == c28676v0) {
                objM87133R9 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R9);
            }
            InterfaceC28601c1 interfaceC28601c11 = (InterfaceC28601c1) objM87133R9;
            Object objM87133R10 = c28655q.m87133R();
            if (objM87133R10 == c28676v0) {
                objM87133R10 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R10);
            }
            InterfaceC28601c1 interfaceC28601c12 = (InterfaceC28601c1) objM87133R10;
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            C2886a c2886aM8434o = c38072d.m121952e(c28655q, i14).getH1();
            long jM125430y = c38072d.m121949b(c28655q, i14).getBrandWhite();
            C2314t c2314t = C2314t.f9131w;
            AbstractC30795n.m94707h("Left Aligned", AbstractC1102d.m3409f(1.0f, c2314t), jM125430y, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8434o, null, c28655q, 54, C2886a.f11498d << 18, 196088);
            float f13 = 2 * 4;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
            Modifier modifierM3358c = AbstractC1092a.m3358c(c2314t, c38072d.m121949b(c28655q, i14).getBrandWhoopPro(), AbstractC17918w0.f69621a);
            AbstractC6721d abstractC6721d = (AbstractC6721d) interfaceC28601c3.getValue();
            boolean zM87157i = c28655q.m87157i(context);
            Object objM87133R11 = c28655q.m87133R();
            if (zM87157i || objM87133R11 == c28676v0) {
                objM87133R11 = new C40387l1(context, 18);
                c28655q.m87172p0(objM87133R11);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R11;
            boolean zM87157i2 = c28655q.m87157i(context);
            Object objM87133R12 = c28655q.m87133R();
            if (zM87157i2 || objM87133R12 == c28676v0) {
                objM87133R12 = new C40387l1(context, 15);
                c28655q.m87172p0(objM87133R12);
            }
            AbstractC6719b.m20143d(modifierM3358c, abstractC6721d, null, interfaceC4339a, (InterfaceC4339a) objM87133R12, null, c28655q, AbstractC6721d.c.f25657p << 3, 36);
            c28655q = c28655q;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
            boolean zBooleanValue = ((Boolean) interfaceC28601c5.getValue()).booleanValue();
            boolean zM87157i3 = c28655q.m87157i(cVar);
            Object objM87133R13 = c28655q.m87133R();
            if (zM87157i3 || objM87133R13 == c28676v0) {
                final int i15 = 0;
                interfaceC28601c1 = interfaceC28601c3;
                objM87133R13 = new Function1() { // from class: zc1.g5
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i16 = i15;
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        switch (i16) {
                            case 0:
                                return AbstractC40358i5.m129950L(interfaceC28601c5, interfaceC28601c1, cVar, zBooleanValue2);
                            case 1:
                                return AbstractC40358i5.m129951M(interfaceC28601c5, interfaceC28601c1, cVar, zBooleanValue2);
                            case 2:
                                return AbstractC40358i5.m129952N(interfaceC28601c5, interfaceC28601c1, cVar, zBooleanValue2);
                            case 3:
                                return AbstractC40358i5.m129954P(interfaceC28601c5, interfaceC28601c1, cVar, zBooleanValue2);
                            default:
                                return AbstractC40358i5.m129955Q(interfaceC28601c5, interfaceC28601c1, cVar, zBooleanValue2);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R13);
            } else {
                interfaceC28601c1 = interfaceC28601c3;
            }
            m129944F("Left Icon", false, zBooleanValue, (Function1) objM87133R13, c28655q, 6, 2);
            boolean zBooleanValue2 = ((Boolean) interfaceC28601c6.getValue()).booleanValue();
            boolean zM87157i4 = c28655q.m87157i(cVar);
            Object objM87133R14 = c28655q.m87133R();
            if (zM87157i4 || objM87133R14 == c28676v0) {
                final int i16 = 1;
                objM87133R14 = new Function1() { // from class: zc1.g5
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i17 = i16;
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        switch (i17) {
                            case 0:
                                return AbstractC40358i5.m129950L(interfaceC28601c6, interfaceC28601c1, cVar, zBooleanValue3);
                            case 1:
                                return AbstractC40358i5.m129951M(interfaceC28601c6, interfaceC28601c1, cVar, zBooleanValue3);
                            case 2:
                                return AbstractC40358i5.m129952N(interfaceC28601c6, interfaceC28601c1, cVar, zBooleanValue3);
                            case 3:
                                return AbstractC40358i5.m129954P(interfaceC28601c6, interfaceC28601c1, cVar, zBooleanValue3);
                            default:
                                return AbstractC40358i5.m129955Q(interfaceC28601c6, interfaceC28601c1, cVar, zBooleanValue3);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R14);
            }
            m129944F("Data", false, zBooleanValue2, (Function1) objM87133R14, c28655q, 6, 2);
            boolean zBooleanValue3 = ((Boolean) interfaceC28601c7.getValue()).booleanValue();
            boolean zM87157i5 = c28655q.m87157i(cVar);
            Object objM87133R15 = c28655q.m87133R();
            if (zM87157i5 || objM87133R15 == c28676v0) {
                final int i17 = 2;
                objM87133R15 = new Function1() { // from class: zc1.g5
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i18 = i17;
                        boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                        switch (i18) {
                            case 0:
                                return AbstractC40358i5.m129950L(interfaceC28601c7, interfaceC28601c1, cVar, zBooleanValue4);
                            case 1:
                                return AbstractC40358i5.m129951M(interfaceC28601c7, interfaceC28601c1, cVar, zBooleanValue4);
                            case 2:
                                return AbstractC40358i5.m129952N(interfaceC28601c7, interfaceC28601c1, cVar, zBooleanValue4);
                            case 3:
                                return AbstractC40358i5.m129954P(interfaceC28601c7, interfaceC28601c1, cVar, zBooleanValue4);
                            default:
                                return AbstractC40358i5.m129955Q(interfaceC28601c7, interfaceC28601c1, cVar, zBooleanValue4);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R15);
            }
            m129944F("Data Icon", false, zBooleanValue3, (Function1) objM87133R15, c28655q, 6, 2);
            boolean zBooleanValue4 = ((Boolean) interfaceC28601c8.getValue()).booleanValue();
            boolean zM87157i6 = c28655q.m87157i(cVar);
            Object objM87133R16 = c28655q.m87133R();
            if (zM87157i6 || objM87133R16 == c28676v0) {
                interfaceC28601c2 = interfaceC28601c4;
                C31915d c31915d = new C31915d(interfaceC28601c8, interfaceC28601c2, interfaceC28601c1, cVar, 25);
                c28655q.m87172p0(c31915d);
                objM87133R16 = c31915d;
            } else {
                interfaceC28601c2 = interfaceC28601c4;
            }
            m129944F("Title", false, zBooleanValue4, (Function1) objM87133R16, c28655q, 6, 2);
            boolean zBooleanValue5 = ((Boolean) interfaceC28601c2.getValue()).booleanValue();
            boolean zBooleanValue6 = ((Boolean) interfaceC28601c9.getValue()).booleanValue();
            boolean zM87157i7 = c28655q.m87157i(cVar);
            Object objM87133R17 = c28655q.m87133R();
            if (zM87157i7 || objM87133R17 == c28676v0) {
                final int i18 = 3;
                objM87133R17 = new Function1() { // from class: zc1.g5
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i19 = i18;
                        boolean zBooleanValue7 = ((Boolean) obj).booleanValue();
                        switch (i19) {
                            case 0:
                                return AbstractC40358i5.m129950L(interfaceC28601c9, interfaceC28601c1, cVar, zBooleanValue7);
                            case 1:
                                return AbstractC40358i5.m129951M(interfaceC28601c9, interfaceC28601c1, cVar, zBooleanValue7);
                            case 2:
                                return AbstractC40358i5.m129952N(interfaceC28601c9, interfaceC28601c1, cVar, zBooleanValue7);
                            case 3:
                                return AbstractC40358i5.m129954P(interfaceC28601c9, interfaceC28601c1, cVar, zBooleanValue7);
                            default:
                                return AbstractC40358i5.m129955Q(interfaceC28601c9, interfaceC28601c1, cVar, zBooleanValue7);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R17);
            }
            m129944F("Subtitle", zBooleanValue5, zBooleanValue6, (Function1) objM87133R17, c28655q, 6, 0);
            boolean zBooleanValue7 = ((Boolean) interfaceC28601c10.getValue()).booleanValue();
            boolean zM87157i8 = c28655q.m87157i(cVar);
            Object objM87133R18 = c28655q.m87133R();
            if (zM87157i8 || objM87133R18 == c28676v0) {
                final int i19 = 4;
                objM87133R18 = new Function1() { // from class: zc1.g5
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i110 = i19;
                        boolean zBooleanValue8 = ((Boolean) obj).booleanValue();
                        switch (i110) {
                            case 0:
                                return AbstractC40358i5.m129950L(interfaceC28601c10, interfaceC28601c1, cVar, zBooleanValue8);
                            case 1:
                                return AbstractC40358i5.m129951M(interfaceC28601c10, interfaceC28601c1, cVar, zBooleanValue8);
                            case 2:
                                return AbstractC40358i5.m129952N(interfaceC28601c10, interfaceC28601c1, cVar, zBooleanValue8);
                            case 3:
                                return AbstractC40358i5.m129954P(interfaceC28601c10, interfaceC28601c1, cVar, zBooleanValue8);
                            default:
                                return AbstractC40358i5.m129955Q(interfaceC28601c10, interfaceC28601c1, cVar, zBooleanValue8);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R18);
            }
            m129944F("Right Icon", false, zBooleanValue7, (Function1) objM87133R18, c28655q, 6, 2);
            boolean zBooleanValue8 = ((Boolean) interfaceC28601c11.getValue()).booleanValue();
            Object objM87133R19 = c28655q.m87133R();
            if (objM87133R19 == c28676v0) {
                objM87133R19 = new C1024j(11, interfaceC28601c11, interfaceC28601c1);
                c28655q.m87172p0(objM87133R19);
            }
            m129944F("SecondaryMedium Left", false, zBooleanValue8, (Function1) objM87133R19, c28655q, 3078, 2);
            boolean zBooleanValue9 = ((Boolean) interfaceC28601c12.getValue()).booleanValue();
            Object objM87133R20 = c28655q.m87133R();
            if (objM87133R20 == c28676v0) {
                objM87133R20 = new C1024j(12, interfaceC28601c12, interfaceC28601c1);
                c28655q.m87172p0(objM87133R20);
            }
            m129944F("SecondarySmall Right", false, zBooleanValue9, (Function1) objM87133R20, c28655q, 3078, 2);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40270a5(i13, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m129948J(Context context) {
        Toast.makeText(context, "Left Aligned: Left Icon Clicked", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m129949K(Context context) {
        Toast.makeText(context, "Left Aligned: Right Icon Clicked", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m129950L(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, AbstractC6721d.c cVar, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
        interfaceC28601c2.setValue(AbstractC6721d.c.m20175b((AbstractC6721d.c) interfaceC28601c2.getValue(), null, null, null, z4 ? cVar.getLeftIcon() : null, null, null, null, null, null, null, null, null, null, 8183, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m129951M(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, AbstractC6721d.c cVar, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
        interfaceC28601c2.setValue(AbstractC6721d.c.m20175b((AbstractC6721d.c) interfaceC28601c2.getValue(), z4 ? cVar.getData() : AbstractC8693b.m21267a(), null, null, null, null, null, null, null, null, null, null, null, null, 8190, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m129952N(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, AbstractC6721d.c cVar, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
        interfaceC28601c2.setValue(AbstractC6721d.c.m20175b((AbstractC6721d.c) interfaceC28601c2.getValue(), null, null, null, null, null, null, null, z4 ? cVar.getDataIcon() : null, null, null, null, null, null, 8063, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m129953O(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, AbstractC6721d.c cVar, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
        interfaceC28601c2.setValue(Boolean.valueOf(z4));
        interfaceC28601c3.setValue(AbstractC6721d.c.m20175b((AbstractC6721d.c) interfaceC28601c3.getValue(), null, z4 ? cVar.getTitle() : AbstractC8693b.m21267a(), null, null, null, null, null, null, null, null, null, null, null, 8189, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m129954P(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, AbstractC6721d.c cVar, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
        interfaceC28601c2.setValue(AbstractC6721d.c.m20175b((AbstractC6721d.c) interfaceC28601c2.getValue(), null, null, z4 ? cVar.getSubtitle() : AbstractC8693b.m21267a(), null, null, null, null, null, null, null, null, null, null, 8187, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m129955Q(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, AbstractC6721d.c cVar, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
        interfaceC28601c2.setValue(AbstractC6721d.c.m20175b((AbstractC6721d.c) interfaceC28601c2.getValue(), null, null, null, null, null, z4 ? cVar.getRightIcon() : null, null, null, null, null, null, null, null, 8159, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m129956R(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
        interfaceC28601c2.setValue(AbstractC6721d.c.m20175b((AbstractC6721d.c) interfaceC28601c2.getValue(), null, null, null, null, null, null, null, null, null, z4 ? AbstractC27274q.e.f109142f : AbstractC27274q.a.f109136f, null, null, null, 7679, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m129957S(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
        interfaceC28601c2.setValue(AbstractC6721d.c.m20175b((AbstractC6721d.c) interfaceC28601c2.getValue(), null, null, null, null, null, null, null, null, null, null, z4 ? AbstractC27274q.g.f109144f : AbstractC27274q.a.f109136f, null, null, 7167, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m129958T(int i13, Composer composer, int i14) {
        m129947I(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: U */
    public static final void m129959U(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-916836420);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            m129983w(c28655q, 0);
            AbstractC18489d0.m53380u(5, 4, c2314t, c28655q);
            m129947I(c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40270a5(i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m129960V(int i13, Composer composer, int i14) {
        m129959U(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

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
    /* JADX INFO: renamed from: w */
    private static final void m129983w(Composer composer, int i13) {
        final InterfaceC28601c1 interfaceC28601c1;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(206579978);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            final AbstractC6721d.a aVar = new AbstractC6721d.a(AbstractC8693b.m21278l("Title"), null, Integer.valueOf(AbstractC16319p0.m46430a().getAction().getCross()), null, Integer.valueOf(AbstractC16319p0.m46430a().getAction().getPencil()), null, null, null, false, null, null, null, null, null, null, null, 65514, null);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(aVar);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q.m87172p0(objM87133R2);
            }
            final InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R2;
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q.m87172p0(objM87133R3);
            }
            final InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R3;
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q.m87172p0(objM87133R4);
            }
            final InterfaceC28601c1 interfaceC28601c5 = (InterfaceC28601c1) objM87133R4;
            Object objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R5);
            }
            InterfaceC28601c1 interfaceC28601c6 = (InterfaceC28601c1) objM87133R5;
            Object objM87133R6 = c28655q.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R6);
            }
            InterfaceC28601c1 interfaceC28601c7 = (InterfaceC28601c1) objM87133R6;
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            C2886a c2886aM8434o = c38072d.m121952e(c28655q, i14).getH1();
            long jM125430y = c38072d.m121949b(c28655q, i14).getBrandWhite();
            C2314t c2314t = C2314t.f9131w;
            AbstractC30795n.m94707h("Centered", AbstractC1102d.m3409f(1.0f, c2314t), jM125430y, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8434o, null, c28655q, 54, C2886a.f11498d << 18, 196088);
            float f13 = 2 * 4;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
            Modifier modifierM3358c = AbstractC1092a.m3358c(c2314t, c38072d.m121949b(c28655q, i14).getBrandWhoopPro(), AbstractC17918w0.f69621a);
            AbstractC6721d abstractC6721d = (AbstractC6721d) interfaceC28601c2.getValue();
            boolean zM87157i = c28655q.m87157i(context);
            Object objM87133R7 = c28655q.m87133R();
            if (zM87157i || objM87133R7 == c28676v0) {
                objM87133R7 = new C40387l1(context, 16);
                c28655q.m87172p0(objM87133R7);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R7;
            boolean zM87157i2 = c28655q.m87157i(context);
            Object objM87133R8 = c28655q.m87133R();
            if (zM87157i2 || objM87133R8 == c28676v0) {
                objM87133R8 = new C40387l1(context, 17);
                c28655q.m87172p0(objM87133R8);
            }
            AbstractC6719b.m20143d(modifierM3358c, abstractC6721d, null, interfaceC4339a, (InterfaceC4339a) objM87133R8, null, c28655q, AbstractC6721d.a.f25641r << 3, 36);
            c28655q = c28655q;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
            boolean zBooleanValue = ((Boolean) interfaceC28601c3.getValue()).booleanValue();
            boolean zM87157i3 = c28655q.m87157i(aVar);
            Object objM87133R9 = c28655q.m87133R();
            if (zM87157i3 || objM87133R9 == c28676v0) {
                final int i15 = 0;
                interfaceC28601c1 = interfaceC28601c2;
                objM87133R9 = new Function1() { // from class: zc1.h5
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i16 = i15;
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        switch (i16) {
                            case 0:
                                return AbstractC40358i5.m129942D(interfaceC28601c3, interfaceC28601c1, aVar, zBooleanValue2);
                            case 1:
                                return AbstractC40358i5.m129943E(interfaceC28601c3, interfaceC28601c1, aVar, zBooleanValue2);
                            default:
                                return AbstractC40358i5.m129984x(interfaceC28601c3, interfaceC28601c1, aVar, zBooleanValue2);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R9);
            } else {
                interfaceC28601c1 = interfaceC28601c2;
            }
            m129944F("Left Icon", false, zBooleanValue, (Function1) objM87133R9, c28655q, 6, 2);
            boolean zBooleanValue2 = ((Boolean) interfaceC28601c4.getValue()).booleanValue();
            boolean zM87157i4 = c28655q.m87157i(aVar);
            Object objM87133R10 = c28655q.m87133R();
            if (zM87157i4 || objM87133R10 == c28676v0) {
                final int i16 = 1;
                objM87133R10 = new Function1() { // from class: zc1.h5
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i17 = i16;
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        switch (i17) {
                            case 0:
                                return AbstractC40358i5.m129942D(interfaceC28601c4, interfaceC28601c1, aVar, zBooleanValue3);
                            case 1:
                                return AbstractC40358i5.m129943E(interfaceC28601c4, interfaceC28601c1, aVar, zBooleanValue3);
                            default:
                                return AbstractC40358i5.m129984x(interfaceC28601c4, interfaceC28601c1, aVar, zBooleanValue3);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R10);
            }
            m129944F("Title", false, zBooleanValue2, (Function1) objM87133R10, c28655q, 6, 2);
            boolean zBooleanValue3 = ((Boolean) interfaceC28601c5.getValue()).booleanValue();
            boolean zM87157i5 = c28655q.m87157i(aVar);
            Object objM87133R11 = c28655q.m87133R();
            if (zM87157i5 || objM87133R11 == c28676v0) {
                final int i17 = 2;
                objM87133R11 = new Function1() { // from class: zc1.h5
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i18 = i17;
                        boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                        switch (i18) {
                            case 0:
                                return AbstractC40358i5.m129942D(interfaceC28601c5, interfaceC28601c1, aVar, zBooleanValue4);
                            case 1:
                                return AbstractC40358i5.m129943E(interfaceC28601c5, interfaceC28601c1, aVar, zBooleanValue4);
                            default:
                                return AbstractC40358i5.m129984x(interfaceC28601c5, interfaceC28601c1, aVar, zBooleanValue4);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R11);
            }
            m129944F("Right Icon", false, zBooleanValue3, (Function1) objM87133R11, c28655q, 6, 2);
            boolean zBooleanValue4 = ((Boolean) interfaceC28601c6.getValue()).booleanValue();
            Object objM87133R12 = c28655q.m87133R();
            if (objM87133R12 == c28676v0) {
                objM87133R12 = new C1024j(13, interfaceC28601c6, interfaceC28601c1);
                c28655q.m87172p0(objM87133R12);
            }
            m129944F("SecondaryMedium Left", false, zBooleanValue4, (Function1) objM87133R12, c28655q, 3078, 2);
            boolean zBooleanValue5 = ((Boolean) interfaceC28601c7.getValue()).booleanValue();
            Object objM87133R13 = c28655q.m87133R();
            if (objM87133R13 == c28676v0) {
                objM87133R13 = new C1024j(14, interfaceC28601c7, interfaceC28601c1);
                c28655q.m87172p0(objM87133R13);
            }
            m129944F("SecondarySmall Right", false, zBooleanValue5, (Function1) objM87133R13, c28655q, 3078, 2);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40270a5(i13, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m129984x(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, AbstractC6721d.a aVar, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
        AbstractC6721d.a aVar2 = (AbstractC6721d.a) interfaceC28601c2.getValue();
        interfaceC28601c2.setValue(aVar2.m20156a((32763 & 1) != 0 ? aVar2.title : null, (32763 & 2) != 0 ? aVar2.subtitle : null, (32763 & 4) != 0 ? aVar2.leftIcon : null, (32763 & 8) != 0 ? aVar2.rightIcon : z4 ? aVar.getRightIcon() : null, (32763 & 16) != 0 ? aVar2.leftIconButtonType : null, (32763 & 32) != 0 ? aVar2.rightIconButtonType : null, (32763 & 64) != 0 ? aVar2.shouldKeepOriginalIconColor : false, (32763 & 128) != 0 ? aVar2.rightIconView : null, (32763 & 256) != 0 ? aVar2.rightIconColor : null, (32763 & 512) != 0 ? aVar2.leftIconColor : null, (32763 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? aVar2.titleColor : null, (32763 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? aVar2.subtitleColor : null, (32763 & 4096) != 0 ? aVar2.tag : null, (32763 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? aVar2.titleAutomationTag : null, (32763 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? aVar2.leftIconAutomationTag : null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m129985y(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
        AbstractC6721d.a aVar = (AbstractC6721d.a) interfaceC28601c2.getValue();
        interfaceC28601c2.setValue(aVar.m20156a((32763 & 1) != 0 ? aVar.title : null, (32763 & 2) != 0 ? aVar.subtitle : null, (32763 & 4) != 0 ? aVar.leftIcon : null, (32763 & 8) != 0 ? aVar.rightIcon : null, (32763 & 16) != 0 ? aVar.leftIconButtonType : z4 ? AbstractC27274q.e.f109142f : AbstractC27274q.a.f109136f, (32763 & 32) != 0 ? aVar.rightIconButtonType : null, (32763 & 64) != 0 ? aVar.shouldKeepOriginalIconColor : false, (32763 & 128) != 0 ? aVar.rightIconView : null, (32763 & 256) != 0 ? aVar.rightIconColor : null, (32763 & 512) != 0 ? aVar.leftIconColor : null, (32763 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? aVar.titleColor : null, (32763 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? aVar.subtitleColor : null, (32763 & 4096) != 0 ? aVar.tag : null, (32763 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? aVar.titleAutomationTag : null, (32763 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? aVar.leftIconAutomationTag : null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m129986z(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
        AbstractC6721d.a aVar = (AbstractC6721d.a) interfaceC28601c2.getValue();
        interfaceC28601c2.setValue(aVar.m20156a((32763 & 1) != 0 ? aVar.title : null, (32763 & 2) != 0 ? aVar.subtitle : null, (32763 & 4) != 0 ? aVar.leftIcon : null, (32763 & 8) != 0 ? aVar.rightIcon : null, (32763 & 16) != 0 ? aVar.leftIconButtonType : null, (32763 & 32) != 0 ? aVar.rightIconButtonType : z4 ? AbstractC27274q.g.f109144f : AbstractC27274q.a.f109136f, (32763 & 64) != 0 ? aVar.shouldKeepOriginalIconColor : false, (32763 & 128) != 0 ? aVar.rightIconView : null, (32763 & 256) != 0 ? aVar.rightIconColor : null, (32763 & 512) != 0 ? aVar.leftIconColor : null, (32763 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? aVar.titleColor : null, (32763 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? aVar.subtitleColor : null, (32763 & 4096) != 0 ? aVar.tag : null, (32763 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? aVar.titleAutomationTag : null, (32763 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? aVar.leftIconAutomationTag : null));
        return C23454a0.f92919a;
    }
}
