package p292l1;

import android.view.View;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2541i2;
import b30.C2549j2;
import b30.C2567l4;
import bc3.InterfaceC2994c0;
import c31.C3922f;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import d30.C11547l0;
import io.getstream.chat.android.p226ui.viewmodel.typing.C19962a;
import io2.C20780q;
import j93.AbstractC21478l0;
import java.util.UUID;
import kotlin.C1990b0;
import kx1.C22881b;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p077d0.AbstractC11348f;
import p077d0.C11344e;
import p077d0.C11362i1;
import p077d0.C11376m;
import p132f0.C13825t;
import p163g1.C15097o1;
import p163g1.C15107p1;
import p163g1.C15132r6;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p208i2.InterfaceC17869a1;
import p209i3.AbstractC18032n;
import p209i3.C18027i;
import p238j0.C21078d;
import p238j0.C21080f;
import p238j0.C21086l;
import p238j0.InterfaceC21082h;
import p238j0.InterfaceC21083i;
import p269k1.C22111b;
import p291l0.AbstractC22989q;
import p291l0.C22976l1;
import p291l0.InterfaceC22973k1;
import p316m1.AbstractC24899e0;
import p354o1.AbstractC27359b;
import p354o1.AbstractC27370i;
import p354o1.AbstractC27372k;
import p354o1.AbstractC27373l;
import p354o1.AbstractC27384w;
import p354o1.AbstractC27385x;
import p354o1.EnumC27375n;
import p390p1.AbstractC28683x;
import p390p1.C28596b0;
import p390p1.C28635l;
import p390p1.C28647o;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p634y1.AbstractC39038k;
import p635y2.C39111m;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p668z1.C39967p;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import vf3.AbstractC35952b;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: l1.k3 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC23124k3 {

    /* JADX INFO: renamed from: a */
    public static final C22111b f91358a = new C22111b(0.16f, 0.1f, 0.08f, 0.1f);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean, int] */
    /* JADX INFO: renamed from: a */
    public static final void m67097a(InterfaceC4339a interfaceC4339a, Modifier modifier, boolean z4, InterfaceC17869a1 interfaceC17869a1, C23090f c23090f, C23102h c23102h, C13825t c13825t, InterfaceC22973k1 interfaceC22973k1, C37816b c37816b, Composer composer, int i13, int i14) {
        int i15;
        C23102h c23102h2;
        C23102h c23102h3;
        C28655q c28655q;
        float f13;
        Object obj;
        boolean z13;
        C11376m c11376m;
        ?? r10;
        InterfaceC21083i interfaceC21083i;
        int i16;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1310015664);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(interfaceC4339a) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(modifier) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87153g(interfaceC17869a1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q2.m87153g(c23090f) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            if ((i14 & 32) == 0) {
                c23102h2 = c23102h;
                if (c28655q2.m87153g(c23102h2)) {
                    i16 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                }
                i15 |= i16;
            } else {
                c23102h2 = c23102h;
            }
            i16 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            i15 |= i16;
        } else {
            c23102h2 = c23102h;
        }
        if ((1572864 & i13) == 0) {
            i15 |= c28655q2.m87153g(c13825t) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i15 |= c28655q2.m87153g(interfaceC22973k1) ? 8388608 : 4194304;
        }
        if ((i14 & 256) != 0) {
            i15 |= 100663296;
        } else if ((i13 & 100663296) == 0) {
            i15 |= c28655q2.m87153g(null) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((805306368 & i13) == 0) {
            i15 |= c28655q2.m87157i(c37816b) ? 536870912 : 268435456;
        }
        boolean z14 = true;
        if (c28655q2.m87135U(i15 & 1, (i15 & 306783379) != 306783378)) {
            c28655q2.m87140Z();
            if ((i13 & 1) != 0 && !c28655q2.m87118C()) {
                c28655q2.m87138X();
                if ((i14 & 32) != 0) {
                    i15 &= -458753;
                }
            } else if ((i14 & 32) != 0) {
                C22976l1 c22976l1 = AbstractC23096g.f91202a;
                i15 &= -458753;
                c23102h2 = new C23102h(AbstractC27372k.f109890b, AbstractC27372k.f109899k, AbstractC27372k.f109896h, AbstractC27372k.f109897i, AbstractC27372k.f109892d);
            }
            C23102h c23102h4 = c23102h2;
            c28655q2.m87175r();
            c28655q2.m87150e0(1691738187);
            Object objM87133R = c28655q2.m87133R();
            Object obj2 = C28635l.f115821a;
            if (objM87133R == obj2) {
                objM87133R = AbstractC11266d.m30453g(c28655q2);
            }
            InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R;
            c28655q2.m87173q(false);
            long j7 = z4 ? c23090f.f91162a : c23090f.f91164c;
            long j13 = z4 ? c23090f.f91163b : c23090f.f91165d;
            if (c23102h4 == null) {
                c28655q2.m87150e0(1691921830);
                c28655q2.m87173q(false);
                interfaceC21083i2 = interfaceC21083i2;
                obj = obj2;
                c23102h4 = c23102h4;
                r10 = 0;
                c11376m = null;
            } else {
                c28655q2.m87150e0(-499611205);
                int i17 = ((i15 >> 9) & 896) | ((i15 >> 6) & 14);
                Object objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == obj2) {
                    objM87133R2 = new C39967p();
                    c28655q2.m87172p0(objM87133R2);
                }
                C39967p c39967p = (C39967p) objM87133R2;
                boolean zM87153g = c28655q2.m87153g(interfaceC21083i2);
                Object objM87133R3 = c28655q2.m87133R();
                if (zM87153g || objM87133R3 == obj2) {
                    objM87133R3 = new C15097o1(interfaceC21083i2, c39967p, null, 3);
                    c28655q2.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R3, interfaceC21083i2);
                InterfaceC21082h interfaceC21082h = (InterfaceC21082h) AbstractC25265s.m74114R0(c39967p);
                if (!z4) {
                    f13 = c23102h4.f91228e;
                } else if (interfaceC21082h instanceof C21086l) {
                    f13 = c23102h4.f91225b;
                } else if (interfaceC21082h instanceof C21080f) {
                    f13 = c23102h4.f91227d;
                } else {
                    f13 = interfaceC21082h instanceof C21078d ? c23102h4.f91226c : c23102h4.f91224a;
                }
                Object objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == obj2) {
                    objM87133R4 = new C11344e(new C39174f(f13), AbstractC11348f.f36369k, null, 12);
                    c28655q2.m87172p0(objM87133R4);
                }
                C11344e c11344e = (C11344e) objM87133R4;
                C39174f c39174f = new C39174f(f13);
                boolean zM87157i = c28655q2.m87157i(c11344e) | c28655q2.m87147d(f13) | ((((i17 & 14) ^ 6) > 4 && c28655q2.m87155h(z4)) || (i17 & 6) == 4);
                if ((((i17 & 896) ^ 384) <= 256 || !c28655q2.m87153g(c23102h4)) && (i17 & 384) != 256) {
                    z14 = false;
                }
                boolean zM87157i2 = zM87157i | z14 | c28655q2.m87157i(interfaceC21082h);
                Object objM87133R5 = c28655q2.m87133R();
                if (zM87157i2 || objM87133R5 == obj2) {
                    float f14 = f13;
                    obj = obj2;
                    z13 = false;
                    C15107p1 c15107p1 = new C15107p1(c11344e, f14, z4, c23102h4, interfaceC21082h, null, 1);
                    c28655q2.m87172p0(c15107p1);
                    objM87133R5 = c15107p1;
                } else {
                    obj = obj2;
                    z13 = false;
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R5, c39174f);
                c11376m = c11344e.f36343c;
                c28655q2.m87173q(z13);
                r10 = z13;
            }
            float f15 = c11376m != null ? ((C39174f) c11376m.f36471x.getValue()).f168413w : (float) r10;
            Object objM87133R6 = c28655q2.m87133R();
            if (objM87133R6 == obj) {
                objM87133R6 = new C22881b(8);
                c28655q2.m87172p0(objM87133R6);
            }
            Modifier modifierM51775c = AbstractC18032n.m51775c(modifier, r10, (Function1) objM87133R6);
            C37816b c37816bM121344e = AbstractC37817c.m121344e(-535639973, c28655q2, new C15132r6(interfaceC22973k1, j13, c37816b, 1));
            C28596b0 c28596b0 = AbstractC23077c4.f91050a;
            float f16 = (float) r10;
            if (interfaceC21083i2 == null) {
                c28655q2.m87150e0(-1701037204);
                Object objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == obj) {
                    objM87133R7 = AbstractC11266d.m30453g(c28655q2);
                }
                c28655q2.m87173q(r10);
                interfaceC21083i = (InterfaceC21083i) objM87133R7;
            } else {
                c28655q2.m87150e0(2023337163);
                c28655q2.m87173q(r10);
                interfaceC21083i = interfaceC21083i2;
            }
            C28596b0 c28596b1 = AbstractC23077c4.f91050a;
            float f17 = f16 + ((C39174f) c28655q2.m87161k(c28596b1)).f168413w;
            C28655q c28655q3 = c28655q2;
            AbstractC28683x.m87248b(new C28673u1[]{AbstractC23168s.f91626a.mo86977a(new C17919x(j13)), c28596b1.mo86977a(new C39174f(f17))}, AbstractC37817c.m121344e(849208527, c28655q3, new C23065a4(f17, f15, j7, modifierM51775c, interfaceC4339a, c13825t, interfaceC17869a1, interfaceC21083i, c37816bM121344e, z4)), c28655q3, 56);
            c23102h3 = c23102h4;
            c28655q = c28655q3;
        } else {
            C28655q c28655q4 = c28655q2;
            c28655q4.m87138X();
            c23102h3 = c23102h2;
            c28655q = c28655q4;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23108i(interfaceC4339a, modifier, z4, interfaceC17869a1, c23090f, c23102h3, c13825t, interfaceC22973k1, c37816b, i13, i14);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m67098b(Modifier modifier, InterfaceC17869a1 interfaceC17869a1, C23120k c23120k, C23126l c23126l, C13825t c13825t, C37816b c37816b, Composer composer, int i13) {
        C23126l c23126l2;
        int i14;
        C23126l c23126l3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1359693790);
        int i15 = i13 | (c28655q.m87153g(interfaceC17869a1) ? 32 : 16) | (c28655q.m87153g(c23120k) ? 256 : 128) | DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (c28655q.m87135U(i15 & 1, (74899 & i15) != 74898)) {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                i14 = i15 & (-7169);
                c23126l3 = new C23126l(AbstractC27373l.f109901b, AbstractC27373l.f109908i, AbstractC27373l.f109906g, AbstractC27373l.f109907h, AbstractC27373l.f109905f, AbstractC27373l.f109903d);
            } else {
                c28655q.m87138X();
                i14 = i15 & (-7169);
                c23126l3 = c23126l;
            }
            c28655q.m87175r();
            long j7 = c23120k.f91347a;
            long j13 = c23120k.f91348b;
            float f13 = c23126l3.f91361a;
            c28655q.m87150e0(-1763481333);
            c28655q.m87150e0(167751211);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = AbstractC28683x.m87272z(new C39174f(f13));
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(false);
            AbstractC23077c4.m67048a(modifier, interfaceC17869a1, j7, j13, 0.0f, ((C39174f) ((InterfaceC28601c1) objM87133R).getValue()).f168413w, c13825t, AbstractC37817c.m121344e(-97109725, c28655q, new C2567l4(c37816b, 15)), c28655q, (i14 & 112) | 14155782, 16);
            c23126l2 = c23126l3;
        } else {
            c28655q.m87138X();
            c23126l2 = c23126l;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1990b0(modifier, interfaceC17869a1, c23120k, c23126l2, c13825t, c37816b, i13, 4);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m67099c(Modifier modifier, long j7, float f13, int i13, Composer composer, int i14) {
        int i15;
        Modifier modifier2;
        float f14;
        float density;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1562471785);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i17 = i15 | 48 | (c28655q.m87151f(j7) ? 256 : 128);
        if (c28655q.m87135U(i17 & 1, (i17 & 147) != 146)) {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                modifier2 = i16 != 0 ? C2314t.f9131w : modifier;
                f14 = AbstractC23128l1.f91374a;
            } else {
                c28655q.m87138X();
                modifier2 = modifier;
                f14 = f13;
            }
            c28655q.m87175r();
            if (C39174f.m124782b(f14, 0.0f)) {
                c28655q.m87150e0(-1258250053);
                density = 1.0f / ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).getDensity();
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1258183496);
                c28655q.m87173q(false);
                density = f14;
            }
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1102d.m3411h(density, AbstractC1102d.m3409f(1.0f, modifier2)), j7, AbstractC17918w0.f69621a), c28655q, 0);
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
            f14 = f13;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23140n1(modifier2, f14, j7, i13, i14, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:33:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0091  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00df  */
    /* JADX WARN: Code duplicated, block: B:78:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m67100d(Modifier modifier, long j7, float f13, int i13, Composer composer, int i14) {
        int i15;
        float f14;
        long jM67118d;
        boolean z4;
        boolean z13;
        float f15;
        Modifier modifier2;
        long j13;
        C28677v1 c28677v1M87180u;
        float f16;
        boolean z14;
        boolean z15;
        Object objM87133R;
        int i16;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(75144485);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                f14 = f13;
                i15 |= c28655q.m87147d(f14) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                jM67118d = j7;
                if ((i14 & 4) == 0 || !c28655q.m87151f(jM67118d)) {
                    i16 = 128;
                } else {
                    i16 = 256;
                }
                i15 |= i16;
            } else {
                jM67118d = j7;
            }
            z4 = true;
            if ((i15 & 147) != 146) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0 || c28655q.m87118C()) {
                    if (i17 != 0) {
                        modifier = C2314t.f9131w;
                    }
                    if (i18 != 0) {
                        f16 = AbstractC23128l1.f91374a;
                    } else {
                        f16 = f14;
                    }
                    if ((i14 & 4) != 0) {
                        float f17 = AbstractC23128l1.f91374a;
                        i15 &= -897;
                        jM67118d = AbstractC23138n.m67118d(AbstractC27370i.f109883a, c28655q);
                    }
                } else {
                    c28655q.m87138X();
                    if ((i14 & 4) != 0) {
                        i15 &= -897;
                    }
                    f16 = f14;
                }
                c28655q.m87175r();
                Modifier modifierM3411h = AbstractC1102d.m3411h(f16, AbstractC1102d.m3409f(1.0f, modifier));
                if ((i15 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((((i15 & 896) ^ 384) > 256 || !c28655q.m87151f(jM67118d)) && (i15 & 384) != 256) {
                }
                z15 = z14 | z4;
                objM87133R = c28655q.m87133R();
                if (z15 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C23134m1(f16, jM67118d);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC21478l0.m60421a(modifierM3411h, (Function1) objM87133R, c28655q, 0);
                f15 = f16;
                j13 = jM67118d;
                modifier2 = modifier;
            } else {
                c28655q.m87138X();
                f15 = f14;
                modifier2 = modifier;
                j13 = jM67118d;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C23140n1(modifier2, f15, j13, i13, i14, 0);
            }
        }
        i15 |= 48;
        f14 = f13;
        if ((i13 & 384) == 0) {
            jM67118d = j7;
            if ((i14 & 4) == 0) {
                i16 = 128;
            } else {
                i16 = 128;
            }
            i15 |= i16;
        } else {
            jM67118d = j7;
        }
        z4 = true;
        if ((i15 & 147) != 146) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                if (i17 != 0) {
                    modifier = C2314t.f9131w;
                }
                if (i18 != 0) {
                    f16 = AbstractC23128l1.f91374a;
                } else {
                    f16 = f14;
                }
                if ((i14 & 4) != 0) {
                    float f18 = AbstractC23128l1.f91374a;
                    i15 &= -897;
                    jM67118d = AbstractC23138n.m67118d(AbstractC27370i.f109883a, c28655q);
                }
            } else {
                if (i17 != 0) {
                    modifier = C2314t.f9131w;
                }
                if (i18 != 0) {
                    f16 = AbstractC23128l1.f91374a;
                } else {
                    f16 = f14;
                }
                if ((i14 & 4) != 0) {
                    float f19 = AbstractC23128l1.f91374a;
                    i15 &= -897;
                    jM67118d = AbstractC23138n.m67118d(AbstractC27370i.f109883a, c28655q);
                }
            }
            c28655q.m87175r();
            Modifier modifierM3411h2 = AbstractC1102d.m3411h(f16, AbstractC1102d.m3409f(1.0f, modifier));
            if ((i15 & 112) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            z4 = ((i15 & 896) ^ 384) > 256 ? false : false;
            z15 = z14 | z4;
            objM87133R = c28655q.m87133R();
            if (z15) {
                objM87133R = new C23134m1(f16, jM67118d);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C23134m1(f16, jM67118d);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC21478l0.m60421a(modifierM3411h2, (Function1) objM87133R, c28655q, 0);
            f15 = f16;
            j13 = jM67118d;
            modifier2 = modifier;
        } else {
            c28655q.m87138X();
            f15 = f14;
            modifier2 = modifier;
            j13 = jM67118d;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23140n1(modifier2, f15, j13, i13, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x013a  */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0071  */
    /* JADX WARN: Code duplicated, block: B:46:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0083  */
    /* JADX WARN: Code duplicated, block: B:53:0x0087  */
    /* JADX WARN: Code duplicated, block: B:55:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:91:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:95:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:96:0x0103  */
    /* JADX WARN: Code duplicated, block: B:98:0x012e  */
    /* JADX INFO: renamed from: e */
    public static final void m67101e(InterfaceC4339a interfaceC4339a, Modifier modifier, boolean z4, C23152p1 c23152p1, InterfaceC17869a1 interfaceC17869a1, InterfaceC4351m interfaceC4351m, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        C23152p1 c23152p2;
        int i16;
        InterfaceC17869a1 interfaceC17869a2;
        boolean z14;
        InterfaceC17869a1 interfaceC17869a3;
        C23152p1 c23152p3;
        boolean z15;
        C28677v1 c28677v1M87180u;
        boolean z16;
        C23152p1 c23152p1M67107k;
        C23152p1 c23152p4;
        InterfaceC17869a1 interfaceC17869a1M67130b;
        int i17;
        int i18;
        int i19;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1413012038);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(interfaceC4339a) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if ((i14 & 8) == 0) {
                    c23152p2 = c23152p1;
                    if (c28655q.m87153g(c23152p2)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i15 |= i19;
                } else {
                    c23152p2 = c23152p1;
                }
                i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                i15 |= i19;
            } else {
                c23152p2 = c23152p1;
            }
            if ((i14 & 16) != 0) {
                i15 |= 24576;
            } else if ((i13 & 24576) == 0) {
                if (c28655q.m87153g(null)) {
                    i16 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i16 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i16;
            }
            if ((196608 & i13) == 0) {
                if ((i14 & 32) == 0) {
                    interfaceC17869a2 = interfaceC17869a1;
                    if (c28655q.m87153g(interfaceC17869a2)) {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    }
                    i15 |= i18;
                } else {
                    interfaceC17869a2 = interfaceC17869a1;
                }
                i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                i15 |= i18;
            } else {
                interfaceC17869a2 = interfaceC17869a1;
            }
            if ((1572864 & i13) == 0) {
                if (c28655q.m87157i(interfaceC4351m)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i15 |= i17;
            }
            if ((599187 & i15) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0 || c28655q.m87118C()) {
                    z16 = i24 == 0 ? z13 : true;
                    if ((i14 & 8) != 0) {
                        c23152p1M67107k = m67107k(c28655q);
                        i15 &= -7169;
                    } else {
                        c23152p1M67107k = c23152p2;
                    }
                    if ((i14 & 32) != 0) {
                        i15 &= -458753;
                        c23152p4 = c23152p1M67107k;
                        interfaceC17869a1M67130b = AbstractC23160q3.m67130b(AbstractC27384w.f110062b, c28655q);
                    } else {
                        c23152p4 = c23152p1M67107k;
                    }
                    c28655q.m87175r();
                    int i25 = i15 << 3;
                    m67103g(modifier, interfaceC4339a, z16, interfaceC17869a1M67130b, c23152p4, interfaceC4351m, c28655q, ((i15 >> 3) & 14) | (i25 & 112) | (i15 & 896) | ((i15 >> 6) & 7168) | (57344 & i25) | (i25 & 458752) | (i15 & 3670016));
                    z15 = z16;
                    interfaceC17869a3 = interfaceC17869a1M67130b;
                    c23152p3 = c23152p4;
                } else {
                    c28655q.m87138X();
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                    }
                    if ((i14 & 32) != 0) {
                        i15 &= -458753;
                    }
                    z16 = z13;
                    c23152p4 = c23152p2;
                }
                interfaceC17869a1M67130b = interfaceC17869a2;
                c28655q.m87175r();
                int i26 = i15 << 3;
                m67103g(modifier, interfaceC4339a, z16, interfaceC17869a1M67130b, c23152p4, interfaceC4351m, c28655q, ((i15 >> 3) & 14) | (i26 & 112) | (i15 & 896) | ((i15 >> 6) & 7168) | (57344 & i26) | (i26 & 458752) | (i15 & 3670016));
                z15 = z16;
                interfaceC17869a3 = interfaceC17869a1M67130b;
                c23152p3 = c23152p4;
            } else {
                c28655q.m87138X();
                interfaceC17869a3 = interfaceC17869a2;
                c23152p3 = c23152p2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2541i2(interfaceC4339a, modifier, z15, c23152p3, interfaceC17869a3, interfaceC4351m, i13, i14);
            }
        }
        i15 |= 384;
        z13 = z4;
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) == 0) {
                c23152p2 = c23152p1;
                if (c28655q.m87153g(c23152p2)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i15 |= i19;
            } else {
                c23152p2 = c23152p1;
            }
            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i15 |= i19;
        } else {
            c23152p2 = c23152p1;
        }
        if ((i14 & 16) != 0) {
            i15 |= 24576;
        } else if ((i13 & 24576) == 0) {
            if (c28655q.m87153g(null)) {
                i16 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i16 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i16;
        }
        if ((196608 & i13) == 0) {
            if ((i14 & 32) == 0) {
                interfaceC17869a2 = interfaceC17869a1;
                if (c28655q.m87153g(interfaceC17869a2)) {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                }
                i15 |= i18;
            } else {
                interfaceC17869a2 = interfaceC17869a1;
            }
            i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            i15 |= i18;
        } else {
            interfaceC17869a2 = interfaceC17869a1;
        }
        if ((1572864 & i13) == 0) {
            if (c28655q.m87157i(interfaceC4351m)) {
                i17 = 1048576;
            } else {
                i17 = 524288;
            }
            i15 |= i17;
        }
        if ((599187 & i15) != 599186) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                if (i24 == 0) {
                }
                if ((i14 & 8) != 0) {
                    c23152p1M67107k = m67107k(c28655q);
                    i15 &= -7169;
                } else {
                    c23152p1M67107k = c23152p2;
                }
                if ((i14 & 32) != 0) {
                    i15 &= -458753;
                    c23152p4 = c23152p1M67107k;
                    interfaceC17869a1M67130b = AbstractC23160q3.m67130b(AbstractC27384w.f110062b, c28655q);
                } else {
                    c23152p4 = c23152p1M67107k;
                    interfaceC17869a1M67130b = interfaceC17869a2;
                }
            } else {
                if (i24 == 0) {
                }
                if ((i14 & 8) != 0) {
                    c23152p1M67107k = m67107k(c28655q);
                    i15 &= -7169;
                } else {
                    c23152p1M67107k = c23152p2;
                }
                if ((i14 & 32) != 0) {
                    i15 &= -458753;
                    c23152p4 = c23152p1M67107k;
                    interfaceC17869a1M67130b = AbstractC23160q3.m67130b(AbstractC27384w.f110062b, c28655q);
                } else {
                    c23152p4 = c23152p1M67107k;
                    interfaceC17869a1M67130b = interfaceC17869a2;
                }
            }
            c28655q.m87175r();
            int i27 = i15 << 3;
            m67103g(modifier, interfaceC4339a, z16, interfaceC17869a1M67130b, c23152p4, interfaceC4351m, c28655q, ((i15 >> 3) & 14) | (i27 & 112) | (i15 & 896) | ((i15 >> 6) & 7168) | (57344 & i27) | (i27 & 458752) | (i15 & 3670016));
            z15 = z16;
            interfaceC17869a3 = interfaceC17869a1M67130b;
            c23152p3 = c23152p4;
        } else {
            c28655q.m87138X();
            interfaceC17869a3 = interfaceC17869a2;
            c23152p3 = c23152p2;
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2541i2(interfaceC4339a, modifier, z15, c23152p3, interfaceC17869a3, interfaceC4351m, i13, i14);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m67102f(InterfaceC4339a interfaceC4339a, Modifier modifier, boolean z4, C23152p1 c23152p1, C37816b c37816b, Composer composer, int i13) {
        Modifier modifier2;
        C37816b c37816b2;
        InterfaceC4339a interfaceC4339a2;
        C23152p1 c23152p2;
        boolean z13;
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2096213317);
        int i15 = (c28655q.m87157i(interfaceC4339a) ? 4 : 2) | i13;
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        int i16 = i15 | 25984;
        boolean z14 = true;
        if (c28655q.m87135U(i16 & 1, (74899 & i16) != 74898)) {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                c23152p1 = m67107k(c28655q);
                i14 = i16 & (-7169);
            } else {
                c28655q.m87138X();
                i14 = i16 & (-7169);
                z14 = z4;
            }
            C23152p1 c23152p3 = c23152p1;
            c28655q.m87175r();
            modifier2 = modifier;
            m67101e(interfaceC4339a, modifier2, z14, c23152p3, AbstractC23160q3.m67130b(AbstractC27384w.f110062b, c28655q), c37816b, c28655q, (65534 & i14) | 1572864, 0);
            interfaceC4339a2 = interfaceC4339a;
            c37816b2 = c37816b;
            z13 = z14;
            c23152p2 = c23152p3;
        } else {
            modifier2 = modifier;
            c37816b2 = c37816b;
            interfaceC4339a2 = interfaceC4339a;
            c28655q.m87138X();
            c23152p2 = c23152p1;
            z13 = z4;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2549j2(interfaceC4339a2, modifier2, z13, c23152p2, c37816b2, i13);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m67103g(Modifier modifier, InterfaceC4339a interfaceC4339a, boolean z4, InterfaceC17869a1 interfaceC17869a1, C23152p1 c23152p1, InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1134296466);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87153g(interfaceC17869a1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87153g(c23152p1) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87153g(null) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q.m87157i(interfaceC4351m) ? 1048576 : 524288;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (599187 & i15) != 599186)) {
            c28655q.m87150e0(977045485);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
            c28655q.m87173q(false);
            C39111m c39111m = AbstractC23194w1.f91761a;
            Modifier modifierMo3471e = modifier.mo3471e(MinimumInteractiveModifier.f4745w);
            float f13 = AbstractC27384w.f110063c;
            Modifier modifierM72998e = AbstractC24899e0.m72998e(AbstractC1092a.m3360e(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3420q(AbstractC35952b.m114193a(AbstractC27384w.f110064d + f13 + f13, AbstractC27384w.f110061a), modifierMo3471e), interfaceC17869a1), z4 ? c23152p1.f91563a : c23152p1.f91565c, interfaceC17869a1), interfaceC21083i, AbstractC23130l3.m67110a(0.0f, 7, false), z4, new C18027i(0), interfaceC4339a, 8));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM72998e);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC28683x.m87247a(AbstractC23168s.f91626a.mo86977a(new C17919x(z4 ? c23152p1.f91564b : c23152p1.f91566d)), interfaceC4351m, c28655q, ((i15 >> 15) & 112) | 8);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11547l0(modifier, interfaceC4339a, z4, interfaceC17869a1, c23152p1, interfaceC4351m, i13);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m67104h(final InterfaceC4339a interfaceC4339a, final long j7, final C23147o2 c23147o2, C11344e c11344e, C37816b c37816b, Composer composer, int i13) {
        int i14;
        long j13;
        C23147o2 c23147o3;
        EnumC39181m enumC39181m;
        boolean z4;
        boolean z13;
        Object obj;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(766784632);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(interfaceC4339a) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            j13 = j7;
            i14 |= c28655q.m87151f(j13) ? 32 : 16;
        } else {
            j13 = j7;
        }
        if ((i13 & 384) == 0) {
            c23147o3 = c23147o2;
            i14 |= c28655q.m87153g(c23147o3) ? 256 : 128;
        } else {
            c23147o3 = c23147o2;
        }
        if ((i13 & 3072) == 0) {
            i14 |= (i13 & 4096) == 0 ? c28655q.m87153g(c11344e) : c28655q.m87157i(c11344e) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(c37816b) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            View view = (View) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4980f);
            InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            EnumC39181m enumC39181m2 = (EnumC39181m) c28655q.m87161k(AbstractC2453v1.f9575n);
            C28647o c28647oM87237E = AbstractC28683x.m87237E(c28655q);
            InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(c37816b, c28655q);
            Object[] objArr = new Object[0];
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C23091f0(6);
                c28655q.m87172p0(objM87133R);
            }
            UUID uuid = (UUID) AbstractC39038k.m124457c(objArr, (InterfaceC4339a) objM87133R, c28655q, 48);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
            boolean zM87153g = c28655q.m87153g(view) | c28655q.m87153g(interfaceC39171c);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87153g || objM87133R3 == c28676v0) {
                enumC39181m = enumC39181m2;
                z4 = true;
                z13 = false;
                DialogC23087e2 dialogC23087e2 = new DialogC23087e2(interfaceC4339a, c23147o3, j13, view, enumC39181m, interfaceC39171c, uuid, c11344e, interfaceC2994c0);
                C37816b c37816b2 = new C37816b(new C23180u(1, interfaceC28601c1M87238F), true, -1051373467);
                C23069b2 c23069b2 = dialogC23087e2.f91111H;
                c23069b2.setParentCompositionContext(c28647oM87237E);
                c23069b2.f90999K.setValue(c37816b2);
                c23069b2.f91000L = true;
                c23069b2.m7234c();
                c28655q.m87172p0(dialogC23087e2);
                obj = dialogC23087e2;
            } else {
                enumC39181m = enumC39181m2;
                z4 = true;
                z13 = false;
                obj = objM87133R3;
            }
            final DialogC23087e2 dialogC23087e3 = (DialogC23087e2) obj;
            boolean zM87157i = c28655q.m87157i(dialogC23087e3);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i || objM87133R4 == c28676v0) {
                objM87133R4 = new C19962a(dialogC23087e3, 25);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87251e(dialogC23087e3, (Function1) objM87133R4, c28655q);
            int i15 = i14;
            boolean zM87157i2 = c28655q.m87157i(dialogC23087e3) | ((i15 & 14) == 4 ? z4 : z13) | ((i15 & 896) == 256 ? z4 : z13) | ((i15 & 112) == 32 ? z4 : z13) | c28655q.m87149e(enumC39181m.ordinal());
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i2 || objM87133R5 == c28676v0) {
                final EnumC39181m enumC39181m3 = enumC39181m;
                objM87133R5 = new InterfaceC4339a() { // from class: l1.p2
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        dialogC23087e3.m67056c(interfaceC4339a, c23147o2, j7, enumC39181m3);
                        return C23454a0.f92919a;
                    }
                };
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC28683x.m87257k((InterfaceC4339a) objM87133R5, c28655q);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C20780q(interfaceC4339a, j7, c23147o2, c11344e, c37816b, i13);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m67105i(InterfaceC4339a interfaceC4339a, Modifier modifier, boolean z4, InterfaceC17869a1 interfaceC17869a1, C23090f c23090f, InterfaceC22973k1 interfaceC22973k1, C37816b c37816b, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC17869a1 interfaceC17869a1M67130b;
        C23090f c23090fM67083a;
        C28655q c28655q;
        InterfaceC22973k1 interfaceC22973k2;
        InterfaceC17869a1 interfaceC17869a2;
        C23090f c23090f2;
        boolean z13;
        InterfaceC17869a1 interfaceC17869a3;
        C23090f c23090f3;
        InterfaceC22973k1 interfaceC22973k3;
        boolean z14;
        int i16;
        int i17;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1061374109);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(interfaceC4339a) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(modifier) ? 32 : 16;
        }
        int i18 = i15 | 384;
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) == 0) {
                interfaceC17869a1M67130b = interfaceC17869a1;
                if (c28655q2.m87153g(interfaceC17869a1M67130b)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i18 |= i17;
            } else {
                interfaceC17869a1M67130b = interfaceC17869a1;
            }
            i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i18 |= i17;
        } else {
            interfaceC17869a1M67130b = interfaceC17869a1;
        }
        if ((i13 & 24576) == 0) {
            if ((i14 & 16) == 0) {
                c23090fM67083a = c23090f;
                if (c28655q2.m87153g(c23090fM67083a)) {
                    i16 = DfuBaseService.ERROR_CONNECTION_MASK;
                }
                i18 |= i16;
            } else {
                c23090fM67083a = c23090f;
            }
            i16 = DfuBaseService.ERROR_REMOTE_MASK;
            i18 |= i16;
        } else {
            c23090fM67083a = c23090f;
        }
        if ((i14 & 32) != 0) {
            i18 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            i18 |= c28655q2.m87153g(null) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((i14 & 64) != 0) {
            i18 |= 1572864;
        } else if ((i13 & 1572864) == 0) {
            i18 |= c28655q2.m87153g(null) ? 1048576 : 524288;
        }
        int i19 = i18 | 113246208;
        if ((805306368 & i13) == 0) {
            i19 |= c28655q2.m87157i(c37816b) ? 536870912 : 268435456;
        }
        if (c28655q2.m87135U(i19 & 1, (306783379 & i19) != 306783378)) {
            c28655q2.m87140Z();
            if ((i13 & 1) == 0 || c28655q2.m87118C()) {
                if ((i14 & 8) != 0) {
                    C22976l1 c22976l1 = AbstractC23096g.f91202a;
                    interfaceC17869a1M67130b = AbstractC23160q3.m67130b(AbstractC27359b.f109708b, c28655q2);
                    i19 &= -7169;
                }
                if ((i14 & 16) != 0) {
                    C22976l1 c22976l2 = AbstractC23096g.f91202a;
                    c23090fM67083a = AbstractC23096g.m67083a((C23132m) c28655q2.m87161k(AbstractC23138n.f91494a));
                    i19 &= -57345;
                }
                interfaceC17869a3 = interfaceC17869a1M67130b;
                c23090f3 = c23090fM67083a;
                interfaceC22973k3 = AbstractC23096g.f91202a;
                z14 = true;
            } else {
                c28655q2.m87138X();
                if ((i14 & 8) != 0) {
                    i19 &= -7169;
                }
                if ((i14 & 16) != 0) {
                    i19 &= -57345;
                }
                z14 = z4;
                interfaceC22973k3 = interfaceC22973k1;
                interfaceC17869a3 = interfaceC17869a1M67130b;
                c23090f3 = c23090fM67083a;
            }
            c28655q2.m87175r();
            c28655q = c28655q2;
            m67097a(interfaceC4339a, modifier, z14, interfaceC17869a3, c23090f3, null, null, interfaceC22973k3, c37816b, c28655q, i19 & 2147483646, 0);
            z13 = z14;
            interfaceC17869a2 = interfaceC17869a3;
            c23090f2 = c23090f3;
            interfaceC22973k2 = interfaceC22973k3;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            interfaceC22973k2 = interfaceC22973k1;
            interfaceC17869a2 = interfaceC17869a1M67130b;
            c23090f2 = c23090fM67083a;
            z13 = z4;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3922f(interfaceC4339a, modifier, z13, interfaceC17869a2, c23090f2, interfaceC22973k2, c37816b, i13, i14);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final C11362i1 m67106j(InterfaceC23165r2 interfaceC23165r2, EnumC27375n enumC27375n) {
        int iOrdinal = enumC27375n.ordinal();
        if (iOrdinal == 0) {
            ((C23159q2) interfaceC23165r2).getClass();
            C11362i1 c11362i1 = C23159q2.f91602b;
            AbstractC22676k.m65748h(c11362i1, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.defaultSpatialSpec>");
            return c11362i1;
        }
        if (iOrdinal == 1) {
            ((C23159q2) interfaceC23165r2).getClass();
            C11362i1 c11362i2 = C23159q2.f91603c;
            AbstractC22676k.m65748h(c11362i2, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.fastSpatialSpec>");
            return c11362i2;
        }
        if (iOrdinal == 2) {
            ((C23159q2) interfaceC23165r2).getClass();
            C11362i1 c11362i3 = C23159q2.f91604d;
            AbstractC22676k.m65748h(c11362i3, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.slowSpatialSpec>");
            return c11362i3;
        }
        if (iOrdinal == 3) {
            ((C23159q2) interfaceC23165r2).getClass();
            C11362i1 c11362i4 = C23159q2.f91605e;
            AbstractC22676k.m65748h(c11362i4, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.defaultEffectsSpec>");
            return c11362i4;
        }
        if (iOrdinal == 4) {
            ((C23159q2) interfaceC23165r2).getClass();
            C11362i1 c11362i5 = C23159q2.f91606f;
            AbstractC22676k.m65748h(c11362i5, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.fastEffectsSpec>");
            return c11362i5;
        }
        if (iOrdinal != 5) {
            throw new NoWhenBranchMatchedException();
        }
        ((C23159q2) interfaceC23165r2).getClass();
        C11362i1 c11362i6 = C23159q2.f91607g;
        AbstractC22676k.m65748h(c11362i6, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.slowEffectsSpec>");
        return c11362i6;
    }

    /* JADX INFO: renamed from: k */
    public static C23152p1 m67107k(Composer composer) {
        C28655q c28655q = (C28655q) composer;
        long j7 = ((C17919x) c28655q.m87161k(AbstractC23168s.f91626a)).f69639a;
        C23132m c23132m = (C23132m) c28655q.m87161k(AbstractC23138n.f91494a);
        C23152p1 c23152p1 = c23132m.f91438a0;
        if (c23152p1 == null) {
            long j13 = C17919x.f69636m;
            C23152p1 c23152p2 = new C23152p1(j13, j7, j13, C17919x.m51541c(AbstractC27385x.f110065a, j7));
            c23132m.f91438a0 = c23152p2;
            c23152p1 = c23152p2;
        }
        long j14 = c23152p1.f91564b;
        if (C17919x.m51542d(j14, j7)) {
            return c23152p1;
        }
        long jM51541c = C17919x.m51541c(AbstractC27385x.f110065a, j7);
        long j15 = c23152p1.f91563a;
        long j16 = c23152p1.f91565c;
        if (j7 == 16) {
            j7 = j14;
        }
        if (jM51541c == 16) {
            jM51541c = c23152p1.f91566d;
        }
        return new C23152p1(j15, j7, j16, jM51541c);
    }

    /* JADX INFO: renamed from: l */
    public static final C23196w3 m67108l(C28655q c28655q) {
        EnumC23202x3 enumC23202x3 = EnumC23202x3.f91820w;
        Object objM87133R = c28655q.m87133R();
        if (objM87133R == C28635l.f115821a) {
            objM87133R = new C22881b(7);
            c28655q.m87172p0(objM87133R);
        }
        return AbstractC23178t3.m67143b(false, (Function1) objM87133R, 3456, c28655q, 49);
    }

    /* JADX INFO: renamed from: m */
    public static final C11362i1 m67109m(EnumC27375n enumC27375n, Composer composer) {
        return m67106j((InterfaceC23165r2) ((C28655q) composer).m87161k(AbstractC23200x1.f91803a), enumC27375n);
    }
}
