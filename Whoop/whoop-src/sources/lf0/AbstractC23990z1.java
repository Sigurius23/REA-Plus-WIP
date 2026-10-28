package lf0;

import a81.C0556g;
import androidx.compose.animation.AbstractC1091c;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.room.AbstractC1772c1;
import ar2.C1935f;
import b91.C2886a;
import bg0.C3226h;
import c41.AbstractC4106r2;
import c41.C4092p2;
import c93.InterfaceC4339a;
import c93.InterfaceC4352n;
import de0.C11980a;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import iy0.C21026a;
import java.io.IOException;
import java.util.List;
import jp2.C21881l;
import jt1.C21937b;
import k71.C22252i;
import kw1.C22852c;
import l72.C23399f;
import l83.C23454a0;
import l83.InterfaceC23459e;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p353o0.C27317b;
import p353o0.C27323g;
import p353o0.InterfaceC27326j;
import p353o0.InterfaceC27335s;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import rz0.AbstractC31926e;
import se.AbstractC32417h;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: lf0.z1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\u001aA\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a1\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0010H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001b²\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u001a\u001a\u00020\u00198\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Llf0/a2;", "state", "Lde0/a;", "selectedAppointment", "Lkotlin/Function1;", "Llf0/x1;", "Ll83/a0;", "onViewEvent", "s", "(Landroidx/compose/ui/Modifier;Llf0/a2;Lde0/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "z", "(Llf0/a2;Landroidx/compose/runtime/Composer;I)V", "", "isExpanded", "Lkotlin/Function0;", "onToggle", "o", "(Llf0/a2;ZLc93/a;Landroidx/compose/runtime/Composer;I)V", "Llf0/e;", "isSelected", "onClick", "k", "(Llf0/e;ZLc93/a;Landroidx/compose/runtime/Composer;II)V", "", "rotationAngle", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23990z1 {

    /* JADX INFO: renamed from: lf0.z1$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C11980a f94695w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C23910e f94696x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C23897a2 f94697y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f94698z;

        public a(C11980a c11980a, C23910e c23910e, C23897a2 c23897a2, Function1 function1) {
            this.f94695w = c11980a;
            this.f94696x = c23910e;
            this.f94697y = c23897a2;
            this.f94698z = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m70807a() {
            this.f94698z.invoke(new AbstractC23984x1.a(this.f94697y.getSiteCode(), (this.f94695w != null && AbstractC22676k.m65745e(this.f94696x.getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), this.f94695w.getCom.mapbox.common.HttpHeaders.DATE java.lang.String()) && AbstractC22676k.m65745e(this.f94697y.getSiteCode(), this.f94695w.getSiteCode())) ? null : this.f94696x));
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m70807a();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: lf0.z1$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f94699w = new b();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C23910e c23910e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: lf0.z1$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94700w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f94701x;

        public c(Function1 function1, List list) {
            this.f94700w = function1;
            this.f94701x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m70809a(int i13) {
            return this.f94700w.invoke(this.f94701x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m70809a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: lf0.z1$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f94702w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C11980a f94703x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C23897a2 f94704y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f94705z;

        public d(List list, C11980a c11980a, C23897a2 c23897a2, Function1 function1) {
            this.f94702w = list;
            this.f94703x = c11980a;
            this.f94704y = c23897a2;
            this.f94705z = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m70810a(InterfaceC27326j interfaceC27326j, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (((C28655q) composer).m87153g(interfaceC27326j) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            C23910e c23910e = (C23910e) this.f94702w.get(i13);
            c28655q.m87150e0(1981771645);
            boolean z4 = this.f94703x != null && AbstractC22676k.m65745e(c23910e.getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), this.f94703x.getCom.mapbox.common.HttpHeaders.DATE java.lang.String()) && AbstractC22676k.m65745e(this.f94704y.getSiteCode(), this.f94703x.getSiteCode());
            boolean zM87153g = c28655q.m87153g(this.f94703x) | c28655q.m87153g(c23910e) | c28655q.m87157i(this.f94704y) | c28655q.m87153g(this.f94705z);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new a(this.f94703x, c23910e, this.f94704y, this.f94705z);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC23990z1.m70791k(c23910e, z4, (InterfaceC4339a) objM87133R, c28655q, 0, 0);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m70810a((InterfaceC27326j) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m70780A(C23897a2 c23897a2, int i13, Composer composer, int i14) {
        m70806z(c23897a2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0091  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:55:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:62:0x0111  */
    /* JADX WARN: Code duplicated, block: B:63:0x0115  */
    /* JADX WARN: Code duplicated, block: B:66:0x0128  */
    /* JADX WARN: Code duplicated, block: B:68:0x0136  */
    /* JADX WARN: Code duplicated, block: B:71:0x0150  */
    /* JADX WARN: Code duplicated, block: B:73:0x0163  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    public static final void m70791k(C23910e state, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        int i16;
        InterfaceC4339a interfaceC4339a2;
        int i17;
        boolean z14;
        C28655q c28655q;
        boolean z15;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        boolean z16;
        Object objM87133R;
        long jM95628d;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C38072d c38072d;
        int i18;
        long jM73366B;
        Object objM87133R2;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(812446099);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(state) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                z13 = z4;
                i15 |= c28655q2.m87155h(z13) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q2.m87157i(interfaceC4339a2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z14)) {
                    if (i19 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C23399f(19);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    if ((i15 & 896) == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (z16 || objM87133R == c28676v0) {
                        objM87133R = new C21026a(interfaceC4339a4, 28);
                        c28655q2.m87172p0(objM87133R);
                    }
                    Modifier modifierM53364e = AbstractC18489d0.m53364e(AbstractC1092a.m3362g(C2314t.f9131w, false, null, null, (InterfaceC4339a) objM87133R, 15), 3, 4);
                    if (z15) {
                        c28655q2.m87150e0(-923336803);
                        jM95628d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
                    } else {
                        c28655q2.m87150e0(-923335718);
                        jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
                    }
                    Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1092a.m3358c(modifierM53364e, jM95628d, AbstractC17918w0.f69621a), 0.0f, ((float) 1.5d) * 8, 1);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3396r);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                    String strM70291b = state.getTextDisplay();
                    c38072d = C38072d.f163053a;
                    i18 = C38072d.f163054b;
                    C2886a c2886aM8407E = c38072d.m121952e(c28655q2, i18).getN8();
                    if (z15) {
                        c28655q2.m87150e0(-1969298109);
                        jM73366B = c38072d.m121949b(c28655q2, i18).getBrandBlack();
                    } else {
                        jM73366B = AbstractC25012a.m73366B(c28655q2, -1969297021, c38072d, c28655q2, i18);
                    }
                    c28655q2.m87173q(false);
                    interfaceC4339a3 = interfaceC4339a4;
                    AbstractC30795n.m94707h(strM70291b, null, jM73366B, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c2886aM8407E, null, c28655q2, 0, (C2886a.f11498d << 18) | 3120, 186362);
                    c28655q = c28655q2;
                    c28655q.m87173q(true);
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    z15 = z13;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3226h(state, z15, interfaceC4339a3, i13, i14, 19);
                }
            }
            i15 |= 384;
            interfaceC4339a2 = interfaceC4339a;
            if ((i15 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                if (i19 != 0) {
                    z15 = false;
                } else {
                    z15 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C23399f(19);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if ((i15 & 896) == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM87133R = c28655q2.m87133R();
                if (z16) {
                    objM87133R = new C21026a(interfaceC4339a4, 28);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C21026a(interfaceC4339a4, 28);
                    c28655q2.m87172p0(objM87133R);
                }
                Modifier modifierM53364e2 = AbstractC18489d0.m53364e(AbstractC1092a.m3362g(C2314t.f9131w, false, null, null, (InterfaceC4339a) objM87133R, 15), 3, 4);
                if (z15) {
                    c28655q2.m87150e0(-923336803);
                    jM95628d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
                } else {
                    c28655q2.m87150e0(-923335718);
                    jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
                }
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1092a.m3358c(modifierM53364e2, jM95628d, AbstractC17918w0.f69621a), 0.0f, ((float) 1.5d) * 8, 1);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3396r2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                String strM70291b2 = state.getTextDisplay();
                c38072d = C38072d.f163053a;
                i18 = C38072d.f163054b;
                C2886a c2886aM8407E2 = c38072d.m121952e(c28655q2, i18).getN8();
                if (z15) {
                    c28655q2.m87150e0(-1969298109);
                    jM73366B = c38072d.m121949b(c28655q2, i18).getBrandBlack();
                } else {
                    jM73366B = AbstractC25012a.m73366B(c28655q2, -1969297021, c38072d, c28655q2, i18);
                }
                c28655q2.m87173q(false);
                interfaceC4339a3 = interfaceC4339a4;
                AbstractC30795n.m94707h(strM70291b2, null, jM73366B, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c2886aM8407E2, null, c28655q2, 0, (C2886a.f11498d << 18) | 3120, 186362);
                c28655q = c28655q2;
                c28655q.m87173q(true);
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                z15 = z13;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3226h(state, z15, interfaceC4339a3, i13, i14, 19);
            }
        }
        i15 |= 48;
        z13 = z4;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q2.m87157i(interfaceC4339a2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                if (i19 != 0) {
                    z15 = false;
                } else {
                    z15 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C23399f(19);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if ((i15 & 896) == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM87133R = c28655q2.m87133R();
                if (z16) {
                    objM87133R = new C21026a(interfaceC4339a4, 28);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C21026a(interfaceC4339a4, 28);
                    c28655q2.m87172p0(objM87133R);
                }
                Modifier modifierM53364e3 = AbstractC18489d0.m53364e(AbstractC1092a.m3362g(C2314t.f9131w, false, null, null, (InterfaceC4339a) objM87133R, 15), 3, 4);
                if (z15) {
                    c28655q2.m87150e0(-923336803);
                    jM95628d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
                } else {
                    c28655q2.m87150e0(-923335718);
                    jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
                }
                Modifier modifierM3396r3 = AbstractC1099a.m3396r(AbstractC1092a.m3358c(modifierM53364e3, jM95628d, AbstractC17918w0.f69621a), 0.0f, ((float) 1.5d) * 8, 1);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3396r3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N3);
                String strM70291b3 = state.getTextDisplay();
                c38072d = C38072d.f163053a;
                i18 = C38072d.f163054b;
                C2886a c2886aM8407E3 = c38072d.m121952e(c28655q2, i18).getN8();
                if (z15) {
                    c28655q2.m87150e0(-1969298109);
                    jM73366B = c38072d.m121949b(c28655q2, i18).getBrandBlack();
                } else {
                    jM73366B = AbstractC25012a.m73366B(c28655q2, -1969297021, c38072d, c28655q2, i18);
                }
                c28655q2.m87173q(false);
                interfaceC4339a3 = interfaceC4339a4;
                AbstractC30795n.m94707h(strM70291b3, null, jM73366B, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c2886aM8407E3, null, c28655q2, 0, (C2886a.f11498d << 18) | 3120, 186362);
                c28655q = c28655q2;
                c28655q.m87173q(true);
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                z15 = z13;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3226h(state, z15, interfaceC4339a3, i13, i14, 19);
            }
        }
        i15 |= 384;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 147) != 146) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z14)) {
            if (i19 != 0) {
                z15 = false;
            } else {
                z15 = z13;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C23399f(19);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            if ((i15 & 896) == 256) {
                z16 = true;
            } else {
                z16 = false;
            }
            objM87133R = c28655q2.m87133R();
            if (z16) {
                objM87133R = new C21026a(interfaceC4339a4, 28);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C21026a(interfaceC4339a4, 28);
                c28655q2.m87172p0(objM87133R);
            }
            Modifier modifierM53364e4 = AbstractC18489d0.m53364e(AbstractC1092a.m3362g(C2314t.f9131w, false, null, null, (InterfaceC4339a) objM87133R, 15), 3, 4);
            if (z15) {
                c28655q2.m87150e0(-923336803);
                jM95628d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
            } else {
                c28655q2.m87150e0(-923335718);
                jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
            }
            Modifier modifierM3396r4 = AbstractC1099a.m3396r(AbstractC1092a.m3358c(modifierM53364e4, jM95628d, AbstractC17918w0.f69621a), 0.0f, ((float) 1.5d) * 8, 1);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3396r4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
            String strM70291b4 = state.getTextDisplay();
            c38072d = C38072d.f163053a;
            i18 = C38072d.f163054b;
            C2886a c2886aM8407E4 = c38072d.m121952e(c28655q2, i18).getN8();
            if (z15) {
                c28655q2.m87150e0(-1969298109);
                jM73366B = c38072d.m121949b(c28655q2, i18).getBrandBlack();
            } else {
                jM73366B = AbstractC25012a.m73366B(c28655q2, -1969297021, c38072d, c28655q2, i18);
            }
            c28655q2.m87173q(false);
            interfaceC4339a3 = interfaceC4339a4;
            AbstractC30795n.m94707h(strM70291b4, null, jM73366B, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c2886aM8407E4, null, c28655q2, 0, (C2886a.f11498d << 18) | 3120, 186362);
            c28655q = c28655q2;
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            z15 = z13;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3226h(state, z15, interfaceC4339a3, i13, i14, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m70792l() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m70793m(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m70794n(C23910e c23910e, boolean z4, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m70791k(c23910e, z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    public static final void m70795o(C23897a2 state, boolean z4, InterfaceC4339a onToggle, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onToggle, "onToggle");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1464336034);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(state) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onToggle) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            InterfaceC28670t2 interfaceC28670t2M30588b = AbstractC11352g.m30588b(z4 ? -180.0f : 0.0f, AbstractC11348f.m30574v(300, 0, null, 6), null, null, c28655q, 48, 28);
            boolean z13 = (i14 & 896) == 256;
            Object objM87133R = c28655q.m87133R();
            if (z13 || objM87133R == C28635l.f115821a) {
                objM87133R = new C21026a(onToggle, 29);
                c28655q.m87172p0(objM87133R);
            }
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15), 0.0f, 20, 0.0f, 0.0f, 13);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
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
            C27430e c27430eM107874S = AbstractC34132o.m107874S(EnumC16313m0.CARET_DOWN.toWhoopIcon(), c28655q, 6);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC15005f3.m43108b(c27430eM107874S, null, AbstractC1772c1.m5375L(m70796p(interfaceC28670t2M30588b), AbstractC1102d.m3419p(16, c2314t)), c38072d.m121949b(c28655q, i15).getWhite50(), c28655q, 48, 0);
            AbstractC30795n.m94707h(z4 ? state.getExpandedTextDisplay() : state.getCollapsedTextDisplay(), AbstractC1099a.m3398t(c2314t, ((float) 1.5d) * 8, 0.0f, 0.0f, 0.0f, 14), c38072d.m121949b(c28655q, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB2(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1935f(state, z4, onToggle, i13, 24);
        }
    }

    /* JADX INFO: renamed from: p */
    private static final float m70796p(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m70797q(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m70798r(C23897a2 c23897a2, boolean z4, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m70795o(c23897a2, z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX WARN: Code duplicated, block: B:35:0x006e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0088  */
    /* JADX WARN: Code duplicated, block: B:46:0x008c  */
    /* JADX WARN: Code duplicated, block: B:48:0x008f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:61:0x010a  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: s */
    public static final void m70799s(Modifier modifier, C23897a2 state, C11980a c11980a, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C11980a c11980a2;
        int i16;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        C11980a c11980a3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        List<C23910e> listM74156w1;
        int i17;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1896437161);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(state) ? 32 : 16;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                c11980a2 = c11980a;
                i15 |= c28655q2.m87153g(c11980a2) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q2.m87157i(onViewEvent)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i16 = i15;
            if ((i16 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i16 & 1, z4)) {
                if (i18 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i19 != 0) {
                    c11980a3 = null;
                } else {
                    c11980a3 = c11980a2;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(state.getIsExpanded()));
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                if (m70800t(interfaceC28601c1)) {
                    listM74156w1 = state.m70184c();
                } else {
                    listM74156w1 = AbstractC25265s.m74156w1(state.m70184c(), state.getMaxVisibleButtons());
                }
                c28655q = c28655q2;
                Modifier modifier5 = modifier4;
                AbstractC31926e.m99375j(modifier5, null, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite5(), AbstractC33253j.m105489e(3 * 4), null, null, 0.0f, AbstractC37817c.m121344e(1890674713, c28655q2, new C0556g(state, listM74156w1, c11980a3, onViewEvent, interfaceC28601c1)), c28655q, (i16 & 14) | 12582912, 114);
                modifier3 = modifier5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                c11980a3 = c11980a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22852c((Object) modifier3, (Object) state, (Object) c11980a3, (InterfaceC23459e) onViewEvent, i13, i14, 8);
            }
        }
        i15 |= 384;
        c11980a2 = c11980a;
        if ((i13 & 3072) == 0) {
            if (c28655q2.m87157i(onViewEvent)) {
                i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i17;
        }
        i16 = i15;
        if ((i16 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i16 & 1, z4)) {
            if (i18 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            if (i19 != 0) {
                c11980a3 = null;
            } else {
                c11980a3 = c11980a2;
            }
            objM87133R = c28655q2.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(state.getIsExpanded()));
                c28655q2.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            if (m70800t(interfaceC28601c1)) {
                listM74156w1 = state.m70184c();
            } else {
                listM74156w1 = AbstractC25265s.m74156w1(state.m70184c(), state.getMaxVisibleButtons());
            }
            c28655q = c28655q2;
            Modifier modifier6 = modifier4;
            AbstractC31926e.m99375j(modifier6, null, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite5(), AbstractC33253j.m105489e(3 * 4), null, null, 0.0f, AbstractC37817c.m121344e(1890674713, c28655q2, new C0556g(state, listM74156w1, c11980a3, onViewEvent, interfaceC28601c1)), c28655q, (i16 & 14) | 12582912, 114);
            modifier3 = modifier6;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
            c11980a3 = c11980a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22852c((Object) modifier3, (Object) state, (Object) c11980a3, (InterfaceC23459e) onViewEvent, i13, i14, 8);
        }
    }

    /* JADX INFO: renamed from: t */
    private static final boolean m70800t(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: u */
    private static final void m70801u(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m70802v(C23897a2 c23897a2, List list, C11980a c11980a, Function1 function1, InterfaceC28601c1 interfaceC28601c1, Composer composer, int i13) throws XmlPullParserException, IOException {
        C2314t c2314t;
        int i14;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * 8, c2314t2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            m70806z(c23897a2, c28655q, 0);
            boolean zIsEmpty = list.isEmpty();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zIsEmpty) {
                c2314t = c2314t2;
                i14 = 24;
                c28655q.m87150e0(-900132801);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-901602604);
                Modifier modifierM3355a = AbstractC1091c.m3355a(AbstractC1099a.m3398t(AbstractC1102d.m3413j(c2314t2, 0.0f, 1000, 1), 0.0f, 24, 0.0f, 0.0f, 13), AbstractC11348f.m30574v(500, 0, null, 6), 2);
                C27317b c27317b = new C27317b(3);
                float f13 = 12;
                C22971k c22971kM66746i = AbstractC22977m.m66746i(f13);
                C22971k c22971kM66746i2 = AbstractC22977m.m66746i(f13);
                boolean zM87157i = c28655q.m87157i(list) | c28655q.m87153g(c11980a) | c28655q.m87157i(c23897a2) | c28655q.m87153g(function1);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    C21881l c21881l = new C21881l(list, c11980a, c23897a2, function1, 7);
                    c28655q.m87172p0(c21881l);
                    objM87133R = c21881l;
                }
                Function1 function2 = (Function1) objM87133R;
                i14 = 24;
                c2314t = c2314t2;
                AbstractC32417h.m101202k(c27317b, modifierM3355a, null, null, c22971kM66746i, c22971kM66746i2, null, false, null, function2, c28655q, 1769472, 924);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            C4092p2 c4092p2M70189i = c23897a2.getInfoCallout();
            if (c4092p2M70189i == null) {
                c28655q.m87150e0(-900094269);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-900094268);
                AbstractC4106r2.m12647f(AbstractC1099a.m3398t(c2314t, 0.0f, i14, 0.0f, 0.0f, 13), c4092p2M70189i, null, c28655q, (C4092p2.f16593v << 3) | 6, 4);
                c28655q.m87173q(false);
            }
            if (c23897a2.m70184c().size() > c23897a2.getMaxVisibleButtons()) {
                c28655q.m87150e0(-899807487);
                boolean zM70800t = m70800t(interfaceC28601c1);
                Object objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C21937b(15, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R2);
                }
                m70795o(c23897a2, zM70800t, (InterfaceC4339a) objM87133R2, c28655q, 384);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-899717153);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m70803w(List list, C11980a c11980a, C23897a2 c23897a2, Function1 function1, InterfaceC27335s LazyVerticalGrid) {
        AbstractC22676k.m65750j(LazyVerticalGrid, "$this$LazyVerticalGrid");
        C27323g c27323g = (C27323g) LazyVerticalGrid;
        c27323g.m82467q(list.size(), new c(b.f94699w, list), new C37816b(new d(list, c11980a, c23897a2, function1), true, -1117249557));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m70804x(InterfaceC28601c1 interfaceC28601c1) {
        m70801u(interfaceC28601c1, !m70800t(interfaceC28601c1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m70805y(Modifier modifier, C23897a2 c23897a2, C11980a c11980a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m70799s(modifier, c23897a2, c11980a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    public static final void m70806z(C23897a2 state, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1043459036);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87157i(state) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2306l c2306l = C2299e.f9108K;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90655f, c2306l, c28655q2, 54);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            String strM70194n = state.getTitleDisplay();
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            C2886a c2886aM8419Q = c38072d.m121952e(c28655q2, i15).getT4();
            long jM125430y = c38072d.m121949b(c28655q2, i15).getBrandWhite();
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM70194n, layoutWeightElement, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8419Q, null, c28655q2, 0, i16, 196600);
            float f13 = ((float) 0.5d) * 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, f13, 0.0f, 0.0f, 0.0f, 14);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q2, 48);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3398t);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(state.getDistanceIcon().toWhoopIcon(), c28655q2, 6), null, AbstractC1102d.m3419p(10, c2314t), c38072d.m121949b(c28655q2, i15).getRecovery(), c28655q2, 432, 0);
            c28655q = c28655q2;
            AbstractC30795n.m94707h(state.getDistanceDisplay(), AbstractC1099a.m3398t(c2314t, f13, 0.0f, 0.0f, 0.0f, 14), c38072d.m121949b(c28655q2, i15).getRecovery(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getB2(), null, c28655q, 48, i16, 196600);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            AbstractC30795n.m94707h(state.getSubtitleDisplay(), AbstractC1099a.m3398t(c2314t, 0.0f, f13, 0.0f, 0.0f, 13), c38072d.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB2(), null, c28655q, 48, i16, 196600);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22252i(state, i13, 6);
        }
    }
}
