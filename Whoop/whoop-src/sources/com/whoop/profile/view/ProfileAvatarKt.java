package com.whoop.profile.view;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bz0.C3713c;
import c13.AbstractC3855a;
import c93.InterfaceC4351m;
import com.whoop.profile.C9691R;
import dp0.C12253i;
import fy1.C14873i;
import java.util.ArrayList;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import m83.C25235a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lkd1/o;", "avatarImageSource", "Landroidx/compose/ui/Modifier;", "modifier", "", "contentDescription", "Ll83/a0;", "ProfileAvatar", "(Lkd1/o;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "ProfileAvatarWithImagePreview", "(Landroidx/compose/runtime/Composer;I)V", "profile_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ProfileAvatarKt {
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a A[PHI: r1 r4
      0x008a: PHI (r1v19 int) = (r1v6 int), (r1v6 int), (r1v20 int) binds: [B:53:0x0093, B:47:0x0086, B:48:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x008a: PHI (r4v16 androidx.compose.ui.Modifier) = (r4v5 androidx.compose.ui.Modifier), (r4v2 androidx.compose.ui.Modifier), (r4v2 androidx.compose.ui.Modifier) binds: [B:53:0x0093, B:47:0x0086, B:48:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:67:0x0138  */
    /* JADX WARN: Code duplicated, block: B:70:0x014b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0156  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public static final void ProfileAvatar(AbstractC22403o abstractC22403o, Modifier modifier, String str, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        String str2;
        boolean z4;
        String str3;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        int i16;
        C2314t c2314t;
        int i17;
        String strM92103Y;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        String str4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-707883652);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(abstractC22403o) : c28655q.m87157i(abstractC22403o) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if ((i14 & 4) == 0) {
                    str2 = str;
                    int i19 = c28655q.m87153g(str2) ? 256 : 128;
                    i15 |= i19;
                } else {
                    str2 = str;
                }
                i15 |= i19;
            } else {
                str2 = str;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                i16 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i16 != 0 || c28655q.m87118C()) {
                    if (i18 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i14 & 4) != 0) {
                        i17 = i15 & (-897);
                        strM92103Y = AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_picture_content_description);
                        modifier2 = modifier2;
                    }
                    c28655q.m87175r();
                    Modifier modifierM3419p = AbstractC1102d.m3419p(25 * 4, modifier2);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3419p);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    if (abstractC22403o != null) {
                        c28655q.m87150e0(-53816201);
                        str4 = strM92103Y;
                        AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, AbstractC22403o.f87638a | (i17 & 14), 3), str4, AbstractC37056f.m118994r(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC33253j.f138651a), null, C39102j.f168199a, 0.0f, null, c28655q, ((i17 >> 3) & 112) | 24576, 104);
                        c28655q.m87173q(false);
                    } else {
                        str4 = strM92103Y;
                        c28655q.m87150e0(-53500032);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    str3 = str4;
                } else {
                    c28655q.m87138X();
                    if ((i14 & 4) != 0) {
                        i15 &= -897;
                    }
                }
                i17 = i15;
                modifier2 = modifier2;
                strM92103Y = str2;
                c28655q.m87175r();
                Modifier modifierM3419p2 = AbstractC1102d.m3419p(25 * 4, modifier2);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3419p2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                if (abstractC22403o != null) {
                    c28655q.m87150e0(-53816201);
                    str4 = strM92103Y;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, AbstractC22403o.f87638a | (i17 & 14), 3), str4, AbstractC37056f.m118994r(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC33253j.f138651a), null, C39102j.f168199a, 0.0f, null, c28655q, ((i17 >> 3) & 112) | 24576, 104);
                    c28655q.m87173q(false);
                } else {
                    str4 = strM92103Y;
                    c28655q.m87150e0(-53500032);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                str3 = str4;
            } else {
                c28655q.m87138X();
                str3 = str2;
            }
            modifier3 = modifier2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C9747a(abstractC22403o, modifier3, str3, i13, i14);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                str2 = str;
                if (c28655q.m87153g(str2)) {
                }
                i15 |= i19;
            } else {
                str2 = str;
            }
            i15 |= i19;
        } else {
            str2 = str;
        }
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28655q.m87140Z();
            i16 = i13 & 1;
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                if (i18 != 0) {
                    modifier2 = c2314t;
                }
                if ((i14 & 4) != 0) {
                    i17 = i15 & (-897);
                    strM92103Y = AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_picture_content_description);
                    modifier2 = modifier2;
                } else {
                    i17 = i15;
                    modifier2 = modifier2;
                    strM92103Y = str2;
                }
            } else {
                if (i18 != 0) {
                    modifier2 = c2314t;
                }
                if ((i14 & 4) != 0) {
                    i17 = i15 & (-897);
                    strM92103Y = AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_picture_content_description);
                    modifier2 = modifier2;
                } else {
                    i17 = i15;
                    modifier2 = modifier2;
                    strM92103Y = str2;
                }
            }
            c28655q.m87175r();
            Modifier modifierM3419p3 = AbstractC1102d.m3419p(25 * 4, modifier2);
            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3419p3);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d3);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
            if (abstractC22403o != null) {
                c28655q.m87150e0(-53816201);
                str4 = strM92103Y;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, AbstractC22403o.f87638a | (i17 & 14), 3), str4, AbstractC37056f.m118994r(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC33253j.f138651a), null, C39102j.f168199a, 0.0f, null, c28655q, ((i17 >> 3) & 112) | 24576, 104);
                c28655q.m87173q(false);
            } else {
                str4 = strM92103Y;
                c28655q.m87150e0(-53500032);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            str3 = str4;
        } else {
            c28655q.m87138X();
            str3 = str2;
        }
        modifier3 = modifier2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9747a(abstractC22403o, modifier3, str3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileAvatar$lambda$1(AbstractC22403o abstractC22403o, Modifier modifier, String str, int i13, int i14, Composer composer, int i15) {
        ProfileAvatar(abstractC22403o, modifier, str, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    private static final void ProfileAvatarWithImagePreview(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(695752961);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new InterfaceC4351m() { // from class: com.whoop.profile.view.ProfileAvatarKt$ProfileAvatarWithImagePreview$$inlined$WhoopPreviewTheme$1
                @Override // c93.InterfaceC4351m
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C23454a0.f92919a;
                }

                public final void invoke(Composer composer2, int i14) {
                    C28655q c28655q2 = (C28655q) composer2;
                    if (!c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
                        c28655q2.m87138X();
                        return;
                    }
                    c28655q2.m87150e0(-2000558268);
                    ProfileAvatarKt.ProfileAvatar(new AbstractC22403o.a(C38072d.f163053a.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getProfile()), null, null, c28655q2, AbstractC22403o.a.f87639c, 6);
                    c28655q2.m87173q(false);
                }
            }), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3713c(i13, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileAvatarWithImagePreview$lambda$1(int i13, Composer composer, int i14) {
        ProfileAvatarWithImagePreview(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
