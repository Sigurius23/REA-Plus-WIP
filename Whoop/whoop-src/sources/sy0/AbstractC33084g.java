package sy0;

import am2.C1017f0;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.selection.AbstractC1112d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e93.AbstractC12889b;
import ep1.C13421p;
import gb1.AbstractC15680h;
import gy0.AbstractC16277f;
import java.io.IOException;
import java.util.Locale;
import kd1.AbstractC22404p;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p209i3.C18027i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p291l0.EnumC22935a1;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p331n2.AbstractC26165a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: sy0.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "text", "Lsy0/k$b;", "whoopCheckboxType", "", "initialToggle", "isEnabled", "Lkotlin/Function1;", "Ll83/a0;", "onToggle", "d", "(Lcom/whoop/design/util/TextResource;Lsy0/k$b;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33084g {
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    /* JADX WARN: Code duplicated, block: B:40:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0087  */
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX WARN: Code duplicated, block: B:47:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x009a  */
    /* JADX WARN: Code duplicated, block: B:52:0x009c  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:68:0x00de  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:79:0x0107  */
    /* JADX WARN: Code duplicated, block: B:81:0x010b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0159  */
    /* JADX WARN: Code duplicated, block: B:86:0x0164  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m104807d(final TextResource text, final AbstractC33088k.b whoopCheckboxType, boolean z4, boolean z13, Function1 onToggle, Composer composer, int i13, int i14) {
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
        long jM95628d;
        long jM95624D;
        boolean z24;
        boolean z25;
        boolean z26;
        Object objM87133R;
        int i18;
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(whoopCheckboxType, "whoopCheckboxType");
        AbstractC22676k.m65750j(onToggle, "onToggle");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1017610484);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(text) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(whoopCheckboxType) : c28655q.m87157i(whoopCheckboxType) ? 32 : 16;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                z14 = z4;
                i15 |= c28655q.m87155h(z14) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    z15 = z13;
                    if (c28655q.m87155h(z15)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87157i(onToggle)) {
                        i18 = 16384;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i18;
                }
                if ((i15 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    if (i19 != 0) {
                        z14 = false;
                    }
                    if (i16 != 0) {
                        z19 = true;
                    } else {
                        z19 = z15;
                    }
                    if (z14) {
                        c28655q.m87150e0(-1328859106);
                        jM95628d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                    } else {
                        c28655q.m87150e0(-1328858021);
                        jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                    }
                    long j7 = jM95628d;
                    if (z14) {
                        c28655q.m87150e0(-1328856098);
                        jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
                    } else {
                        c28655q.m87150e0(-1328855010);
                        jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                    }
                    final long j13 = jM95624D;
                    C18027i c18027i = new C18027i(1);
                    if ((57344 & i15) == 16384) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    if ((i15 & 896) == 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = z25 | z24;
                    objM87133R = c28655q.m87133R();
                    if (z26 || objM87133R == C28635l.f115821a) {
                        objM87133R = new C1017f0(onToggle, z14, 5);
                        c28655q.m87172p0(objM87133R);
                    }
                    final boolean z27 = z14;
                    AbstractC12889b.m36263b(AbstractC15680h.m44112a(AbstractC1102d.m3409f(1.0f, AbstractC1112d.m3448b(C2314t.f9131w, z27, z19, c18027i, (Function1) objM87133R, 8)), z19), AbstractC33253j.m105489e(1 * 4), j7, null, 0, AbstractC37817c.m121344e(1634219031, c28655q, new InterfaceC4351m() { // from class: sy0.f
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC33084g.m104809f(whoopCheckboxType, z27, text, j13, (Composer) obj, iIntValue);
                        }
                    }), c28655q, 1769472, 24);
                    z17 = z27;
                    z18 = z19;
                } else {
                    c28655q.m87138X();
                    z17 = z14;
                    z18 = z15;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13421p(text, whoopCheckboxType, z17, z18, onToggle, i13, i14);
                }
            }
            i15 |= 3072;
            z15 = z13;
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(onToggle)) {
                    i18 = 16384;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i18;
            }
            if ((i15 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                if (i19 != 0) {
                    z14 = false;
                }
                if (i16 != 0) {
                    z19 = true;
                } else {
                    z19 = z15;
                }
                if (z14) {
                    c28655q.m87150e0(-1328859106);
                    jM95628d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                } else {
                    c28655q.m87150e0(-1328858021);
                    jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                }
                long j14 = jM95628d;
                if (z14) {
                    c28655q.m87150e0(-1328856098);
                    jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
                } else {
                    c28655q.m87150e0(-1328855010);
                    jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                }
                final long j15 = jM95624D;
                C18027i c18027i2 = new C18027i(1);
                if ((57344 & i15) == 16384) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                if ((i15 & 896) == 256) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                z26 = z25 | z24;
                objM87133R = c28655q.m87133R();
                if (z26) {
                    objM87133R = new C1017f0(onToggle, z14, 5);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C1017f0(onToggle, z14, 5);
                    c28655q.m87172p0(objM87133R);
                }
                final boolean z28 = z14;
                AbstractC12889b.m36263b(AbstractC15680h.m44112a(AbstractC1102d.m3409f(1.0f, AbstractC1112d.m3448b(C2314t.f9131w, z28, z19, c18027i2, (Function1) objM87133R, 8)), z19), AbstractC33253j.m105489e(1 * 4), j14, null, 0, AbstractC37817c.m121344e(1634219031, c28655q, new InterfaceC4351m() { // from class: sy0.f
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC33084g.m104809f(whoopCheckboxType, z28, text, j15, (Composer) obj, iIntValue);
                    }
                }), c28655q, 1769472, 24);
                z17 = z28;
                z18 = z19;
            } else {
                c28655q.m87138X();
                z17 = z14;
                z18 = z15;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13421p(text, whoopCheckboxType, z17, z18, onToggle, i13, i14);
            }
        }
        i15 |= 384;
        z14 = z4;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                z15 = z13;
                if (c28655q.m87155h(z15)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(onToggle)) {
                    i18 = 16384;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i18;
            }
            if ((i15 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                if (i19 != 0) {
                    z14 = false;
                }
                if (i16 != 0) {
                    z19 = true;
                } else {
                    z19 = z15;
                }
                if (z14) {
                    c28655q.m87150e0(-1328859106);
                    jM95628d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                } else {
                    c28655q.m87150e0(-1328858021);
                    jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                }
                long j16 = jM95628d;
                if (z14) {
                    c28655q.m87150e0(-1328856098);
                    jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
                } else {
                    c28655q.m87150e0(-1328855010);
                    jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                }
                final long j17 = jM95624D;
                C18027i c18027i3 = new C18027i(1);
                if ((57344 & i15) == 16384) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                if ((i15 & 896) == 256) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                z26 = z25 | z24;
                objM87133R = c28655q.m87133R();
                if (z26) {
                    objM87133R = new C1017f0(onToggle, z14, 5);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C1017f0(onToggle, z14, 5);
                    c28655q.m87172p0(objM87133R);
                }
                final boolean z29 = z14;
                AbstractC12889b.m36263b(AbstractC15680h.m44112a(AbstractC1102d.m3409f(1.0f, AbstractC1112d.m3448b(C2314t.f9131w, z29, z19, c18027i3, (Function1) objM87133R, 8)), z19), AbstractC33253j.m105489e(1 * 4), j16, null, 0, AbstractC37817c.m121344e(1634219031, c28655q, new InterfaceC4351m() { // from class: sy0.f
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC33084g.m104809f(whoopCheckboxType, z29, text, j17, (Composer) obj, iIntValue);
                    }
                }), c28655q, 1769472, 24);
                z17 = z29;
                z18 = z19;
            } else {
                c28655q.m87138X();
                z17 = z14;
                z18 = z15;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13421p(text, whoopCheckboxType, z17, z18, onToggle, i13, i14);
            }
        }
        i15 |= 3072;
        z15 = z13;
        if ((i13 & 24576) == 0) {
            if (c28655q.m87157i(onToggle)) {
                i18 = 16384;
            } else {
                i18 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i18;
        }
        if ((i15 & 9363) != 9362) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (c28655q.m87135U(i15 & 1, z16)) {
            if (i19 != 0) {
                z14 = false;
            }
            if (i16 != 0) {
                z19 = true;
            } else {
                z19 = z15;
            }
            if (z14) {
                c28655q.m87150e0(-1328859106);
                jM95628d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
            } else {
                c28655q.m87150e0(-1328858021);
                jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
            }
            long j18 = jM95628d;
            if (z14) {
                c28655q.m87150e0(-1328856098);
                jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
            } else {
                c28655q.m87150e0(-1328855010);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
            }
            final long j19 = jM95624D;
            C18027i c18027i4 = new C18027i(1);
            if ((57344 & i15) == 16384) {
                z24 = true;
            } else {
                z24 = false;
            }
            if ((i15 & 896) == 256) {
                z25 = true;
            } else {
                z25 = false;
            }
            z26 = z25 | z24;
            objM87133R = c28655q.m87133R();
            if (z26) {
                objM87133R = new C1017f0(onToggle, z14, 5);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C1017f0(onToggle, z14, 5);
                c28655q.m87172p0(objM87133R);
            }
            final boolean z210 = z14;
            AbstractC12889b.m36263b(AbstractC15680h.m44112a(AbstractC1102d.m3409f(1.0f, AbstractC1112d.m3448b(C2314t.f9131w, z210, z19, c18027i4, (Function1) objM87133R, 8)), z19), AbstractC33253j.m105489e(1 * 4), j18, null, 0, AbstractC37817c.m121344e(1634219031, c28655q, new InterfaceC4351m() { // from class: sy0.f
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC33084g.m104809f(whoopCheckboxType, z210, text, j19, (Composer) obj, iIntValue);
                }
            }), c28655q, 1769472, 24);
            z17 = z210;
            z18 = z19;
        } else {
            c28655q.m87138X();
            z17 = z14;
            z18 = z15;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13421p(text, whoopCheckboxType, z17, z18, onToggle, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m104808e(Function1 function1, boolean z4, boolean z13) {
        function1.invoke(Boolean.valueOf(!z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m104809f(AbstractC33088k.b bVar, boolean z4, TextResource textResource, long j7, Composer composer, int i13) throws XmlPullParserException, IOException {
        long jM95624D;
        long jM73366B;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            EnumC22935a1 enumC22935a1 = EnumC22935a1.f90538x;
            C2314t c2314t = C2314t.f9131w;
            float f13 = 2;
            float f14 = 8;
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1099a.m3388j(c2314t, enumC22935a1), f13 * f14, ((float) 2.5d) * f14);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
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
            AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(bVar.getImage(), null, null, c28655q, 0, 3);
            float f15 = ((float) 0.5d) * f14;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, f15, 0.0f, 0.0f, 0.0f, 14);
            float f16 = 4;
            float f17 = 5 * f16;
            Modifier modifierM3419p = AbstractC1102d.m3419p(f17, modifierM3398t);
            if (z4) {
                c28655q.m87150e0(-285588475);
                jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
            } else {
                c28655q.m87150e0(-285587387);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
            }
            AbstractC15005f3.m43107a(abstractC26165aM64500i, null, modifierM3419p, jM95624D, c28655q, 432, 0);
            AbstractC38963t7.m124386p(f13, f16, c2314t, c28655q);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM3396r = AbstractC1099a.m3396r(new LayoutWeightElement(1.0f, true), f15, 0.0f, 2);
            String upperCase = AbstractC8693b.m21274h(textResource, c28655q, 0).toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            AbstractC30795n.m94707h(upperCase, modifierM3396r, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bVar.getStyle(), null, c28655q, 0, 0, 196600);
            if (z4) {
                c28655q.m87150e0(-262856430);
                C38072d c38072d = C38072d.f163053a;
                C27430e c27430eM107874S = AbstractC34132o.m107874S(c38072d.m121951d().getAction().getCheckMark(), c28655q, 6);
                String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62249J);
                Modifier modifierM3419p2 = AbstractC1102d.m3419p(f17, c2314t);
                if (z4) {
                    c28655q.m87150e0(-285563771);
                    jM73366B = c38072d.m121949b(c28655q, 6).getBrandBlack();
                } else {
                    jM73366B = AbstractC25012a.m73366B(c28655q, -285562683, c38072d, c28655q, 6);
                }
                c28655q.m87173q(false);
                AbstractC15005f3.m43108b(c27430eM107874S, strM92103Y, modifierM3419p2, jM73366B, c28655q, 384, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-262467225);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m104810g(TextResource textResource, AbstractC33088k.b bVar, boolean z4, boolean z13, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m104807d(textResource, bVar, z4, z13, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
