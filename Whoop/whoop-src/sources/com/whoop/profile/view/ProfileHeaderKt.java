package com.whoop.profile.view;

import a31.C0343e;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import androidx.room.AbstractC1772c1;
import az1.C2161b;
import b91.C2886a;
import bf0.C3189a;
import bs1.C3603v;
import bz0.C3713c;
import c13.AbstractC3855a;
import c41.C4007d1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ck1.C4780c;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.data.local.room.dao.persistent.C6498i;
import com.whoop.design.models.modal.C8527a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.C9691R;
import com.whoop.profile.presentation.NavigateToAccountViewState;
import com.whoop.profile.presentation.NavigateToEditProfileViewState;
import com.whoop.profile.presentation.ProfileEvent;
import com.whoop.profile.presentation.ProfileViewState;
import com.whoop.profile.samples.ProfileSamples;
import dp0.C12253i;
import fy1.C14873i;
import gb1.AbstractC15676d;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kd1.EnumC22414z;
import l83.C23454a0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.C25235a0;
import ny0.AbstractC27292z;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p134f2.C14015d;
import p134f2.C14018g;
import p163g1.AbstractC15005f3;
import p163g1.AbstractC15166v0;
import p163g1.C15077m1;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17907r;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22957g;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.C39077b1;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import pf.AbstractC29125c;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a=\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\f\u0010\u000b\u001a\u000f\u0010\r\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\r\u0010\u000b\u001a\u000f\u0010\u000e\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileViewState$Metadata;", "metadata", "Lkotlin/Function1;", "Lcom/whoop/profile/presentation/ProfileEvent;", "Ll83/a0;", "onEvent", "Lkotlin/Function0;", "onOpenBottomSheet", "ProfileHeader", "(Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "ProfileHeaderSelfProfilePreview", "(Landroidx/compose/runtime/Composer;I)V", "ProfileHeaderOtherProfilePreview", "ProfileHeaderLongTextPreview", "ProfileHeaderFoundingMemberPreview", "profile_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ProfileHeaderKt {
    /* JADX WARN: Code duplicated, block: B:101:0x029d  */
    /* JADX WARN: Code duplicated, block: B:103:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:106:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:107:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:110:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:112:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:115:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:116:0x0314  */
    /* JADX WARN: Code duplicated, block: B:119:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:121:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:124:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:126:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:132:0x040b  */
    /* JADX WARN: Code duplicated, block: B:134:0x0417  */
    /* JADX WARN: Code duplicated, block: B:135:0x042f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0480  */
    /* JADX WARN: Code duplicated, block: B:140:0x049d  */
    /* JADX WARN: Code duplicated, block: B:142:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:143:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:145:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:147:0x04de  */
    /* JADX WARN: Code duplicated, block: B:149:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:155:0x0560  */
    /* JADX WARN: Code duplicated, block: B:157:0x056c  */
    /* JADX WARN: Code duplicated, block: B:158:0x0584  */
    /* JADX WARN: Code duplicated, block: B:160:0x0603  */
    /* JADX WARN: Code duplicated, block: B:161:0x0605  */
    /* JADX WARN: Code duplicated, block: B:164:0x060d  */
    /* JADX WARN: Code duplicated, block: B:167:0x0612  */
    /* JADX WARN: Code duplicated, block: B:168:0x0617  */
    /* JADX WARN: Code duplicated, block: B:173:0x0662  */
    /* JADX WARN: Code duplicated, block: B:176:0x0682  */
    /* JADX WARN: Code duplicated, block: B:177:0x0690  */
    /* JADX WARN: Code duplicated, block: B:179:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:180:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:183:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:184:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:187:0x06df A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:190:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:193:0x0728  */
    /* JADX WARN: Code duplicated, block: B:195:0x0732  */
    /* JADX WARN: Code duplicated, block: B:198:0x0744  */
    /* JADX WARN: Code duplicated, block: B:201:0x0757  */
    /* JADX WARN: Code duplicated, block: B:203:0x075c  */
    /* JADX WARN: Code duplicated, block: B:207:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:208:0x07d0  */
    /* JADX WARN: Code duplicated, block: B:211:0x07dd  */
    /* JADX WARN: Code duplicated, block: B:213:0x07eb  */
    /* JADX WARN: Code duplicated, block: B:216:0x0844  */
    /* JADX WARN: Code duplicated, block: B:218:0x0850  */
    /* JADX WARN: Code duplicated, block: B:221:0x08a4  */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:249:0x0946  */
    /* JADX WARN: Code duplicated, block: B:252:0x0963  */
    /* JADX WARN: Code duplicated, block: B:255:0x096d  */
    /* JADX WARN: Code duplicated, block: B:257:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00da  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:67:0x011a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0172  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:81:0x0206  */
    /* JADX WARN: Code duplicated, block: B:84:0x0220  */
    /* JADX WARN: Code duplicated, block: B:85:0x0225  */
    /* JADX WARN: Code duplicated, block: B:88:0x025f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0263  */
    /* JADX WARN: Code duplicated, block: B:92:0x0270  */
    /* JADX WARN: Code duplicated, block: B:94:0x027e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0291  */
    public static final void ProfileHeader(ProfileViewState.Metadata metadata, Function1 function1, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        int i16;
        InterfaceC4339a interfaceC4339a2;
        int i17;
        boolean z4;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function3;
        int i18;
        InterfaceC4339a interfaceC4339a4;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        ProfileViewState.UserData userData;
        AbstractC22403o profileImageUrl;
        C0209i c0209i5;
        Function1 function4;
        InterfaceC4339a interfaceC4339a5;
        Object objM87133R;
        C0209i c0209i6;
        C28676v0 c28676v1;
        C2314t c2314t2;
        float f13;
        float f14;
        float f15;
        int iHashCode2;
        float f16;
        ProfileViewState.UserData userData2;
        AbstractC22403o profileImageUrl2;
        int i19;
        float f17;
        C2306l c2306l;
        C22949e c22949e;
        int iHashCode3;
        float f18;
        int iHashCode4;
        ProfileViewState.UserData userData3;
        C0209i c0209i7;
        C22949e c22949e2;
        float f19;
        boolean z13;
        float f24;
        C0209i c0209i8;
        float f25;
        C2306l c2306l2;
        int iHashCode5;
        C0213j c0213j2;
        C0209i c0209i9;
        C0209i c0209i10;
        C0209i c0209i11;
        C0209i c0209i12;
        boolean zIsSelfProfile;
        C39077b1 c39077b1;
        C0209i c0209i13;
        C0209i c0209i14;
        C0209i c0209i15;
        C39077b1 c39077b2;
        float f26;
        ProfileViewState.UserData userData4;
        String str;
        String strM74110N0;
        String str2;
        boolean z14;
        C2314t c2314t3;
        int i24;
        int i25;
        Function1 function5;
        C28676v0 c28676v2;
        ProfileViewState.MembershipData membershipData;
        C38072d c38072d;
        int i26;
        boolean z15;
        int i27;
        boolean z16;
        Object objM87133R2;
        InterfaceC4339a interfaceC4339a6;
        float f27;
        int iHashCode6;
        C0213j c0213j3;
        float f28;
        C0209i c0209i16;
        C28655q c28655q;
        Function1 function6;
        C0209i c0209i17;
        float f29;
        InterfaceC4339a interfaceC4339a7;
        int iHashCode7;
        int i28;
        String memberSinceDate;
        boolean z17;
        boolean z18;
        String editButtonTitle;
        boolean z19;
        boolean z24;
        Object objM87133R3;
        C28676v0 c28676v3;
        Integer age;
        String strValueOf;
        AbstractC22403o entitlementImage;
        Object objM87133R4;
        Object objM87133R5;
        AbstractC22676k.m65750j(metadata, "metadata");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1121012628);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(metadata) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i29 = i14 & 2;
        if (i29 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 32 : 16;
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
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i29 != 0) {
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C6498i(15);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        function3 = (Function1) objM87133R5;
                    } else {
                        function3 = function2;
                    }
                    i18 = 8;
                    if (i16 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C8527a(i18);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    c2314t = C2314t.f9131w;
                    Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3407d);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
                    c0209i3 = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                    userData = metadata.getUserData();
                    if (userData != null) {
                        profileImageUrl = userData.getProfileImageUrl();
                    } else {
                        profileImageUrl = null;
                    }
                    if (profileImageUrl == null) {
                        c28655q2.m87150e0(902816210);
                        c28655q2.m87173q(false);
                        function4 = function3;
                        interfaceC4339a5 = interfaceC4339a4;
                        c0209i5 = c0209i2;
                        c2314t2 = c2314t;
                        c28676v1 = c28676v0;
                        c0209i6 = c0209i;
                        f13 = 1.0f;
                    } else {
                        c28655q2.m87150e0(902816211);
                        c0209i5 = c0209i2;
                        function4 = function3;
                        interfaceC4339a5 = interfaceC4339a4;
                        AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(profileImageUrl, null, null, c28655q2, AbstractC22403o.f87638a, 3);
                        Modifier modifierM3488c = AbstractC1127a.m3488c(AbstractC1102d.m3411h(85 * 4, AbstractC1102d.m3409f(1.0f, c2314t)), 0.0f, 0.0f, 0.8f, 0.0f, 0.0f, 0.0f, null, new C17907r(400.0f, 400.0f, 0), 2, 450555);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C6498i(16);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c0209i6 = c0209i;
                        c28676v1 = c28676v0;
                        c2314t2 = c2314t;
                        f13 = 1.0f;
                        AbstractC29125c.m88522c(abstractC26165aM64500i, null, AbstractC1125a.m3479b(modifierM3488c, (Function1) objM87133R), null, C39102j.f168199a, 0.0f, null, c28655q2, 24624, 104);
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                    }
                    f14 = 2;
                    f15 = 8;
                    Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC1099a.m3396r(AbstractC1102d.m3407d(f13, c2314t2), f14 * f15, 0.0f, 2));
                    C2305k c2305k = C2299e.f9110M;
                    C22957g c22957g = AbstractC22977m.f90652c;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 48);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM66724m);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i6, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m2);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                    f16 = 4;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(22 * f16, c2314t2));
                    userData2 = metadata.getUserData();
                    if (userData2 != null) {
                        profileImageUrl2 = userData2.getProfileImageUrl();
                    } else {
                        profileImageUrl2 = null;
                    }
                    i19 = AbstractC22403o.f87638a;
                    ProfileAvatarKt.ProfileAvatar(profileImageUrl2, null, null, c28655q2, i19, 6);
                    f17 = f16 * f16;
                    Modifier modifierM91835e = AbstractC30007c.m91835e(c2314t2, f17, c28655q2, c2314t2, f13);
                    c2306l = C2299e.f9108K;
                    c22949e = AbstractC22977m.f90650a;
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q2, 48);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM91835e);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i6, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m3);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N3);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f18 = Float.MAX_VALUE;
                    } else {
                        f18 = 1.0f;
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f18, true);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
                    iHashCode4 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i6, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m4);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode4))) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N4);
                    userData3 = metadata.getUserData();
                    if (userData3 == null) {
                        c28655q2.m87150e0(307028871);
                        c28655q2.m87173q(false);
                        f24 = f17;
                        c2306l2 = c2306l;
                        c22949e2 = c22949e;
                        z13 = false;
                        c0209i8 = c0209i4;
                        f25 = f16;
                        c0209i7 = c0209i5;
                        f19 = f15;
                    } else {
                        c28655q2.m87150e0(307028872);
                        String strM53370k = AbstractC18489d0.m53370k(userData3.getFirstName(), " ", userData3.getLastName());
                        C38072d c38072d2 = C38072d.f163053a;
                        int i34 = C38072d.f163054b;
                        C28655q c28655q3 = c28655q2;
                        c0209i7 = c0209i5;
                        c22949e2 = c22949e;
                        f19 = f15;
                        z13 = false;
                        f24 = f17;
                        c0209i8 = c0209i4;
                        f25 = f16;
                        c2306l2 = c2306l;
                        AbstractC30795n.m94707h(strM53370k, null, c38072d2.m121949b(c28655q2, i34).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i34).getT2(), null, c28655q3, 0, C2886a.f11498d << 18, 196602);
                        c28655q2 = c28655q3;
                        c28655q2.m87173q(false);
                    }
                    AbstractC11266d.m30469w((float) 0.5d, f25, c2314t2, c28655q2);
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e2, c2306l2, c28655q2, 48);
                    iHashCode5 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, c2314t2);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c0213j2 = c0213j;
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c0213j2 = c0213j;
                        c28655q2.m87178s0();
                    }
                    c0209i9 = c0209i6;
                    AbstractC28683x.m87239G(c28655q2, c0209i9, c22994r1M66759a2);
                    c0209i10 = c0209i7;
                    AbstractC28683x.m87239G(c28655q2, c0209i10, interfaceC28653p1M87165m5);
                    if (c28655q2.f115903S && AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode5))) {
                        c0209i11 = c0209i3;
                    } else {
                        c0209i11 = c0209i3;
                        AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i11);
                    }
                    c0209i12 = c0209i8;
                    AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N5);
                    zIsSelfProfile = metadata.isSelfProfile();
                    c39077b1 = C39102j.f168200b;
                    if (zIsSelfProfile) {
                        c0209i13 = c0209i9;
                        c0209i10 = c0209i10;
                        c0209i14 = c0209i11;
                        c0209i15 = c0209i12;
                        c0213j2 = c0213j2;
                        c39077b2 = c39077b1;
                        f26 = f19;
                        c28655q2.m87150e0(948360136);
                        c28655q2.m87173q(z13);
                    } else {
                        c28655q2.m87150e0(-385070561);
                        entitlementImage = metadata.getEntitlementImage();
                        if (entitlementImage == null) {
                            c28655q2.m87150e0(947714498);
                            c28655q2.m87173q(z13);
                            c0209i13 = c0209i9;
                            c0209i14 = c0209i11;
                            c0209i15 = c0209i12;
                            c39077b2 = c39077b1;
                            f26 = f19;
                        } else {
                            c28655q2.m87150e0(947714499);
                            float f34 = f19;
                            C28655q c28655q4 = c28655q2;
                            c0209i15 = c0209i12;
                            c0209i14 = c0209i11;
                            c0209i13 = c0209i9;
                            f26 = f34;
                            AbstractC29125c.m88522c(AbstractC22404p.m64500i(entitlementImage, null, null, c28655q2, i19, 3), AbstractC30060g.m92103Y(c28655q2, C9691R.string.profile_entitlement_logo_content_description), AbstractC1102d.m3421r(ProfileScreenKt.entitlementImageEffect(c2314t2), f34 * f25, f14 * f25), null, c39077b1, 0.0f, null, c28655q4, 24576, 104);
                            c39077b2 = c39077b1;
                            c28655q2 = c28655q4;
                            AbstractC18489d0.m53381v(1, f26, c2314t2, c28655q2, z13);
                        }
                        c28655q2.m87173q(z13);
                    }
                    userData4 = metadata.getUserData();
                    if (userData4 != null) {
                        String strM30461o = AbstractC11266d.m30461o("@", userData4.getUsername());
                        age = userData4.getAge();
                        if (age != null) {
                            strValueOf = String.valueOf(age.intValue());
                        } else {
                            strValueOf = null;
                        }
                        List listM74077r0 = AbstractC25260n.m74077r0(new String[]{strM30461o, strValueOf, userData4.getLocation()});
                        str = " ";
                        strM74110N0 = AbstractC25265s.m74110N0(listM74077r0, AbstractC11895b.m31996o(str, EnumC22414z.BULLET.getSymbol(), str), null, null, null, 62);
                    } else {
                        str = r5;
                        strM74110N0 = null;
                    }
                    if (strM74110N0 != null || AbstractC39414r.m125890i0(strM74110N0)) {
                        str2 = str;
                        c28655q2.m87150e0(949187464);
                        c28655q2.m87173q(z13);
                    } else {
                        c28655q2.m87150e0(948804025);
                        AbstractC11266d.m30469w(1, f25, c2314t2, c28655q2);
                        C38072d c38072d3 = C38072d.f163053a;
                        int i35 = C38072d.f163054b;
                        C28655q c28655q5 = c28655q2;
                        str2 = str;
                        AbstractC30795n.m94707h(strM74110N0, null, c38072d3.m121949b(c28655q2, i35).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 2, 0, null, c38072d3.m121952e(c28655q2, i35).getB2(), null, c28655q5, 0, (C2886a.f11498d << 18) | 3072, 188410);
                        c28655q2 = c28655q5;
                        c28655q2.m87173q(z13);
                    }
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    if (metadata.isSelfProfile()) {
                        c28655q2.m87150e0(649272442);
                        editButtonTitle = metadata.getEditButtonTitle();
                        if (editButtonTitle == null) {
                            c28655q2.m87150e0(-1347390777);
                            c28655q2.m87173q(z13);
                            z14 = z13;
                            c2314t3 = c2314t2;
                            i24 = 3;
                            i25 = 6;
                            function5 = function4;
                            c28676v2 = c28676v1;
                        } else {
                            c28655q2.m87150e0(-1347390776);
                            TextResource textResourceM21278l = AbstractC8693b.m21278l(editButtonTitle);
                            C38072d c38072d4 = C38072d.f163053a;
                            int iM73365A = AbstractC25012a.m73365A(c38072d4);
                            C22976l1 c22976l1 = AbstractC15166v0.f56891a;
                            int i36 = C38072d.f163054b;
                            C28655q c28655q6 = c28655q2;
                            C2314t c2314t4 = c2314t2;
                            i25 = 6;
                            i24 = 3;
                            C15077m1 c15077m1M43196a = AbstractC15166v0.m43196a(c38072d4.m121949b(c28655q2, i36).getWhite10(), c38072d4.m121949b(c28655q2, i36).getBrandWhite(), 0L, 0L, c28655q6, 0, 12);
                            float f35 = 3 * f25;
                            float f36 = ((float) 2.5d) * f26;
                            float f37 = ((float) 1.5d) * f26;
                            C22976l1 c22976l2 = new C22976l1(f36, f37, f36, f37);
                            C2886a c2886aM8438s = c38072d4.m121952e(c28655q6, i36).getH5();
                            Modifier modifierM3429z = AbstractC1102d.m3429z(c2314t4, null, 1);
                            Integer numValueOf = Integer.valueOf(iM73365A);
                            boolean zM87157i = c28655q6.m87157i(metadata);
                            if ((i15 & 112) == 32) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            z24 = zM87157i | z19;
                            objM87133R3 = c28655q6.m87133R();
                            if (z24) {
                                c28676v3 = c28676v1;
                            } else {
                                c28676v3 = c28676v1;
                                if (objM87133R3 == c28676v3) {
                                    function5 = function4;
                                }
                                c2314t3 = c2314t4;
                                c28676v2 = c28676v3;
                                AbstractC27292z.m82343j(modifierM3429z, false, false, numValueOf, null, null, textResourceM21278l, c15077m1M43196a, null, null, f35, c22976l2, c2886aM8438s, (InterfaceC4339a) objM87133R3, c28655q6, (TextResource.$stable << 18) | 6, (C2886a.f11498d << 6) | 54, 822);
                                c28655q2 = c28655q6;
                                z14 = false;
                                c28655q2.m87173q(false);
                            }
                            function5 = function4;
                            objM87133R3 = new C3603v(metadata, function5, 19);
                            c28655q6.m87172p0(objM87133R3);
                            c2314t3 = c2314t4;
                            c28676v2 = c28676v3;
                            AbstractC27292z.m82343j(modifierM3429z, false, false, numValueOf, null, null, textResourceM21278l, c15077m1M43196a, null, null, f35, c22976l2, c2886aM8438s, (InterfaceC4339a) objM87133R3, c28655q6, (TextResource.$stable << 18) | 6, (C2886a.f11498d << 6) | 54, 822);
                            c28655q2 = c28655q6;
                            z14 = false;
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z14);
                    } else {
                        c22949e2 = c22949e2;
                        z14 = z13;
                        c2314t3 = c2314t2;
                        c2306l2 = c2306l2;
                        i24 = 3;
                        i25 = 6;
                        function5 = function4;
                        c28676v2 = c28676v1;
                        c28655q2.m87150e0(-1346137074);
                        c28655q2.m87173q(z14);
                    }
                    c28655q2.m87173q(true);
                    membershipData = metadata.getMembershipData();
                    if (membershipData == null) {
                        c28655q2.m87150e0(-124365388);
                        c28655q2.m87173q(z14);
                        interfaceC4339a7 = interfaceC4339a5;
                        z18 = true;
                    } else {
                        c28655q2.m87150e0(-124365387);
                        AbstractC11266d.m30469w(i24, f25, c2314t3, c28655q2);
                        float f38 = r18 * f25;
                        Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3405b(AbstractC1102d.m3409f(1.0f, c2314t3), 0.0f, 5 * f25, 1), AbstractC33253j.m105489e(f38));
                        c38072d = C38072d.f163053a;
                        i26 = C38072d.f163054b;
                        Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM118994r, c38072d.m121949b(c28655q2, i26).getBlack20(), AbstractC17918w0.f69621a);
                        if (membershipData.getBottomSheet() != null) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        i27 = i15;
                        if ((i27 & 896) == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R2 = c28655q2.m87133R();
                        if (!z16 || objM87133R2 == c28676v2) {
                            interfaceC4339a6 = interfaceC4339a5;
                            objM87133R2 = new C2161b(interfaceC4339a6, 9);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            interfaceC4339a6 = interfaceC4339a5;
                        }
                        Modifier modifierM44099b = AbstractC15676d.m44099b(modifierM3358c, z15, (Function1) objM87133R2);
                        float f39 = ((float) 1.5d) * f26;
                        f27 = 1 * f26;
                        Modifier modifierM3395q = AbstractC1099a.m3395q(modifierM44099b, f39, f27);
                        C22949e c22949e3 = c22949e2;
                        C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22949e3, c2306l2, c28655q2, 48);
                        iHashCode6 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM3395q);
                        c28655q2.m87158i0();
                        float f43 = f25;
                        if (c28655q2.f115903S) {
                            c0213j3 = c0213j2;
                            c28655q2.m87163l(c0213j3);
                        } else {
                            c0213j3 = c0213j2;
                            c28655q2.m87178s0();
                        }
                        InterfaceC4339a interfaceC4339a8 = interfaceC4339a6;
                        C0209i c0209i18 = c0209i13;
                        AbstractC28683x.m87239G(c28655q2, c0209i18, c22994r1M66759a3);
                        C0209i c0209i19 = c0209i10;
                        AbstractC28683x.m87239G(c28655q2, c0209i19, interfaceC28653p1M87165m6);
                        if (c28655q2.f115903S) {
                            f28 = f27;
                        } else {
                            f28 = f27;
                            if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode6))) {
                                c0209i16 = c0209i14;
                            }
                            C0209i c0209i20 = c0209i15;
                            AbstractC28683x.m87239G(c28655q2, c0209i20, modifierM118962N6);
                            c28655q = c28655q2;
                            C28676v0 c28676v4 = c28676v2;
                            function6 = function5;
                            c0209i17 = c0209i16;
                            f29 = f28;
                            interfaceC4339a7 = interfaceC4339a8;
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(membershipData.getIcon().toWhoopIcon(), c28655q2, i25), "member icon", AbstractC1102d.m3419p(f24, c2314t3), C17919x.f69637n, c28655q, 3504, 0);
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f39, c2314t3));
                            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(c22949e3, C2299e.f9107J, c28655q, 0);
                            iHashCode7 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, c2314t3);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j3);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i18, c22994r1M66759a4);
                            AbstractC28683x.m87239G(c28655q, c0209i19, interfaceC28653p1M87165m7);
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode7))) {
                                AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i17);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i20, modifierM118962N7);
                            String strM8299l = AbstractC2875y.m8299l(membershipData.getMemberSinceTitle(), str2);
                            C2886a c2886aM8422c = c38072d.m121952e(c28655q, i26).getB3();
                            long jM125385c1 = c38072d.m121949b(c28655q, i26).getWhite70();
                            i28 = C2886a.f11498d << 18;
                            AbstractC30795n.m94707h(strM8299l, null, jM125385c1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c, null, c28655q, 0, i28, 196602);
                            c28655q2 = c28655q;
                            memberSinceDate = membershipData.getMemberSinceDate();
                            if (memberSinceDate == null) {
                                c28655q2.m87150e0(-1044783865);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(-1044783864);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f29, c2314t3));
                                AbstractC30795n.m94707h(memberSinceDate, null, c38072d.m121949b(c28655q2, i26).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i26).getB3(), null, c28655q2, 0, i28, 196602);
                                c28655q2 = c28655q2;
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(true);
                            if (metadata.isSelfProfile() || !metadata.getShowSettingsButton()) {
                                function5 = function6;
                                z17 = false;
                                c28655q2.m87150e0(-1181673449);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(1485876527);
                                AbstractC22403o entitlementImage2 = metadata.getEntitlementImage();
                                if (entitlementImage2 == null) {
                                    c28655q2.m87150e0(-1182467918);
                                    c28655q2.m87173q(false);
                                    z17 = false;
                                    function5 = function6;
                                } else {
                                    c28655q2.m87150e0(-1182467917);
                                    if (1.0f <= 0.0d) {
                                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                    }
                                    AbstractC22953f.m66715b(c28655q2, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                                    AbstractC26165a abstractC26165aM64500i2 = AbstractC22404p.m64500i(entitlementImage2, null, null, c28655q2, i19, 3);
                                    String strM92103Y = AbstractC30060g.m92103Y(c28655q2, C9691R.string.profile_entitlement_logo_content_description);
                                    boolean z25 = (i27 & 112) == 32;
                                    Object objM87133R6 = c28655q2.m87133R();
                                    if (z25 || objM87133R6 == c28676v4) {
                                        function5 = function6;
                                        objM87133R6 = new C3189a(function5, 26);
                                        c28655q2.m87172p0(objM87133R6);
                                    } else {
                                        function5 = function6;
                                    }
                                    z17 = false;
                                    C28655q c28655q7 = c28655q2;
                                    AbstractC29125c.m88522c(abstractC26165aM64500i2, strM92103Y, AbstractC1102d.m3421r(ProfileScreenKt.entitlementImageEffect(AbstractC1772c1.m5391i(c2314t3, false, null, (InterfaceC4339a) objM87133R6, 3)), f26 * f43, f38), null, c39077b2, 0.0f, null, c28655q7, 24576, 104);
                                    c28655q2 = c28655q7;
                                    c28655q2.m87173q(false);
                                }
                                c28655q2.m87173q(z17);
                            }
                            z18 = true;
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(z17);
                        }
                        c0209i16 = c0209i14;
                        AbstractC11266d.m30471y(iHashCode6, c28655q2, iHashCode6, c0209i16);
                        C0209i c0209i21 = c0209i15;
                        AbstractC28683x.m87239G(c28655q2, c0209i21, modifierM118962N6);
                        c28655q = c28655q2;
                        C28676v0 c28676v5 = c28676v2;
                        function6 = function5;
                        c0209i17 = c0209i16;
                        f29 = f28;
                        interfaceC4339a7 = interfaceC4339a8;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(membershipData.getIcon().toWhoopIcon(), c28655q2, i25), "member icon", AbstractC1102d.m3419p(f24, c2314t3), C17919x.f69637n, c28655q, 3504, 0);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f39, c2314t3));
                        C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(c22949e3, C2299e.f9107J, c28655q, 0);
                        iHashCode7 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                        Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, c2314t3);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j3);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i18, c22994r1M66759a5);
                        AbstractC28683x.m87239G(c28655q, c0209i19, interfaceC28653p1M87165m8);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i17);
                        } else {
                            AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i17);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i21, modifierM118962N8);
                        String strM8299l2 = AbstractC2875y.m8299l(membershipData.getMemberSinceTitle(), str2);
                        C2886a c2886aM8422c2 = c38072d.m121952e(c28655q, i26).getB3();
                        long jM125385c2 = c38072d.m121949b(c28655q, i26).getWhite70();
                        i28 = C2886a.f11498d << 18;
                        AbstractC30795n.m94707h(strM8299l2, null, jM125385c2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c2, null, c28655q, 0, i28, 196602);
                        c28655q2 = c28655q;
                        memberSinceDate = membershipData.getMemberSinceDate();
                        if (memberSinceDate == null) {
                            c28655q2.m87150e0(-1044783865);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-1044783864);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f29, c2314t3));
                            AbstractC30795n.m94707h(memberSinceDate, null, c38072d.m121949b(c28655q2, i26).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i26).getB3(), null, c28655q2, 0, i28, 196602);
                            c28655q2 = c28655q2;
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(true);
                        if (metadata.isSelfProfile()) {
                            function5 = function6;
                            z17 = false;
                            c28655q2.m87150e0(-1181673449);
                            c28655q2.m87173q(false);
                        } else {
                            function5 = function6;
                            z17 = false;
                            c28655q2.m87150e0(-1181673449);
                            c28655q2.m87173q(false);
                        }
                        z18 = true;
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(z17);
                    }
                    c28655q2.m87173q(z18);
                    c28655q2.m87173q(z18);
                    function2 = function5;
                    interfaceC4339a3 = interfaceC4339a7;
                } else {
                    c28655q2.m87138X();
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q2.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C4007d1(i13, i14, 16, metadata, interfaceC4339a3, function2);
                }
            }
            i15 |= 384;
            interfaceC4339a2 = interfaceC4339a;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i29 != 0) {
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C6498i(15);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    function3 = (Function1) objM87133R5;
                } else {
                    function3 = function2;
                }
                i18 = 8;
                if (i16 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C8527a(i18);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifierM3407d2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d2);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m9);
                c0209i3 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N9);
                userData = metadata.getUserData();
                if (userData != null) {
                    profileImageUrl = userData.getProfileImageUrl();
                } else {
                    profileImageUrl = null;
                }
                if (profileImageUrl == null) {
                    c28655q2.m87150e0(902816210);
                    c28655q2.m87173q(false);
                    function4 = function3;
                    interfaceC4339a5 = interfaceC4339a4;
                    c0209i5 = c0209i2;
                    c2314t2 = c2314t;
                    c28676v1 = c28676v0;
                    c0209i6 = c0209i;
                    f13 = 1.0f;
                } else {
                    c28655q2.m87150e0(902816211);
                    c0209i5 = c0209i2;
                    function4 = function3;
                    interfaceC4339a5 = interfaceC4339a4;
                    AbstractC26165a abstractC26165aM64500i3 = AbstractC22404p.m64500i(profileImageUrl, null, null, c28655q2, AbstractC22403o.f87638a, 3);
                    Modifier modifierM3488c2 = AbstractC1127a.m3488c(AbstractC1102d.m3411h(85 * 4, AbstractC1102d.m3409f(1.0f, c2314t)), 0.0f, 0.0f, 0.8f, 0.0f, 0.0f, 0.0f, null, new C17907r(400.0f, 400.0f, 0), 2, 450555);
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C6498i(16);
                        c28655q2.m87172p0(objM87133R);
                    }
                    c0209i6 = c0209i;
                    c28676v1 = c28676v0;
                    c2314t2 = c2314t;
                    f13 = 1.0f;
                    AbstractC29125c.m88522c(abstractC26165aM64500i3, null, AbstractC1125a.m3479b(modifierM3488c2, (Function1) objM87133R), null, C39102j.f168199a, 0.0f, null, c28655q2, 24624, 104);
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                }
                f14 = 2;
                f15 = 8;
                Modifier modifierM66724m2 = AbstractC22953f.m66724m(AbstractC1099a.m3396r(AbstractC1102d.m3407d(f13, c2314t2), f14 * f15, 0.0f, 2));
                C2305k c2305k2 = C2299e.f9110M;
                C22957g c22957g2 = AbstractC22977m.f90652c;
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q2, 48);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, modifierM66724m2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i6, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m10);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N10);
                f16 = 4;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(22 * f16, c2314t2));
                userData2 = metadata.getUserData();
                if (userData2 != null) {
                    profileImageUrl2 = userData2.getProfileImageUrl();
                } else {
                    profileImageUrl2 = null;
                }
                i19 = AbstractC22403o.f87638a;
                ProfileAvatarKt.ProfileAvatar(profileImageUrl2, null, null, c28655q2, i19, 6);
                f17 = f16 * f16;
                Modifier modifierM91835e2 = AbstractC30007c.m91835e(c2314t2, f17, c28655q2, c2314t2, f13);
                c2306l = C2299e.f9108K;
                c22949e = AbstractC22977m.f90650a;
                C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q2, 48);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q2.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q2, modifierM91835e2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i6, c22994r1M66759a6);
                AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m11);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N11);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f18 = Float.MAX_VALUE;
                } else {
                    f18 = 1.0f;
                }
                LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(f18, true);
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q2, 0);
                iHashCode4 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q2.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i6, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m12);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N12);
                userData3 = metadata.getUserData();
                if (userData3 == null) {
                    c28655q2.m87150e0(307028871);
                    c28655q2.m87173q(false);
                    f24 = f17;
                    c2306l2 = c2306l;
                    c22949e2 = c22949e;
                    z13 = false;
                    c0209i8 = c0209i4;
                    f25 = f16;
                    c0209i7 = c0209i5;
                    f19 = f15;
                } else {
                    c28655q2.m87150e0(307028872);
                    String strM53370k2 = AbstractC18489d0.m53370k(userData3.getFirstName(), " ", userData3.getLastName());
                    C38072d c38072d5 = C38072d.f163053a;
                    int i37 = C38072d.f163054b;
                    C28655q c28655q8 = c28655q2;
                    c0209i7 = c0209i5;
                    c22949e2 = c22949e;
                    f19 = f15;
                    z13 = false;
                    f24 = f17;
                    c0209i8 = c0209i4;
                    f25 = f16;
                    c2306l2 = c2306l;
                    AbstractC30795n.m94707h(strM53370k2, null, c38072d5.m121949b(c28655q2, i37).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d5.m121952e(c28655q2, i37).getT2(), null, c28655q8, 0, C2886a.f11498d << 18, 196602);
                    c28655q2 = c28655q8;
                    c28655q2.m87173q(false);
                }
                AbstractC11266d.m30469w((float) 0.5d, f25, c2314t2, c28655q2);
                C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(c22949e2, c2306l2, c28655q2, 48);
                iHashCode5 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q2.m87165m();
                Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q2, c2314t2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c0213j2 = c0213j;
                    c28655q2.m87163l(c0213j2);
                } else {
                    c0213j2 = c0213j;
                    c28655q2.m87178s0();
                }
                c0209i9 = c0209i6;
                AbstractC28683x.m87239G(c28655q2, c0209i9, c22994r1M66759a7);
                c0209i10 = c0209i7;
                AbstractC28683x.m87239G(c28655q2, c0209i10, interfaceC28653p1M87165m13);
                if (c28655q2.f115903S) {
                    c0209i11 = c0209i3;
                    AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i11);
                } else {
                    c0209i11 = c0209i3;
                    AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i11);
                }
                c0209i12 = c0209i8;
                AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N13);
                zIsSelfProfile = metadata.isSelfProfile();
                c39077b1 = C39102j.f168200b;
                if (zIsSelfProfile) {
                    c28655q2.m87150e0(-385070561);
                    entitlementImage = metadata.getEntitlementImage();
                    if (entitlementImage == null) {
                        c28655q2.m87150e0(947714498);
                        c28655q2.m87173q(z13);
                        c0209i13 = c0209i9;
                        c0209i14 = c0209i11;
                        c0209i15 = c0209i12;
                        c39077b2 = c39077b1;
                        f26 = f19;
                    } else {
                        c28655q2.m87150e0(947714499);
                        float f310 = f19;
                        C28655q c28655q9 = c28655q2;
                        c0209i15 = c0209i12;
                        c0209i14 = c0209i11;
                        c0209i13 = c0209i9;
                        f26 = f310;
                        AbstractC29125c.m88522c(AbstractC22404p.m64500i(entitlementImage, null, null, c28655q2, i19, 3), AbstractC30060g.m92103Y(c28655q2, C9691R.string.profile_entitlement_logo_content_description), AbstractC1102d.m3421r(ProfileScreenKt.entitlementImageEffect(c2314t2), f310 * f25, f14 * f25), null, c39077b1, 0.0f, null, c28655q9, 24576, 104);
                        c39077b2 = c39077b1;
                        c28655q2 = c28655q9;
                        AbstractC18489d0.m53381v(1, f26, c2314t2, c28655q2, z13);
                    }
                    c28655q2.m87173q(z13);
                } else {
                    c0209i13 = c0209i9;
                    c0209i10 = c0209i10;
                    c0209i14 = c0209i11;
                    c0209i15 = c0209i12;
                    c0213j2 = c0213j2;
                    c39077b2 = c39077b1;
                    f26 = f19;
                    c28655q2.m87150e0(948360136);
                    c28655q2.m87173q(z13);
                }
                userData4 = metadata.getUserData();
                if (userData4 != null) {
                    String strM30461o2 = AbstractC11266d.m30461o("@", userData4.getUsername());
                    age = userData4.getAge();
                    if (age != null) {
                        strValueOf = String.valueOf(age.intValue());
                    } else {
                        strValueOf = null;
                    }
                    List listM74077r1 = AbstractC25260n.m74077r0(new String[]{strM30461o2, strValueOf, userData4.getLocation()});
                    str = " ";
                    strM74110N0 = AbstractC25265s.m74110N0(listM74077r1, AbstractC11895b.m31996o(str, EnumC22414z.BULLET.getSymbol(), str), null, null, null, 62);
                } else {
                    str = r5;
                    strM74110N0 = null;
                }
                if (strM74110N0 != null) {
                    str2 = str;
                    c28655q2.m87150e0(949187464);
                    c28655q2.m87173q(z13);
                } else {
                    str2 = str;
                    c28655q2.m87150e0(949187464);
                    c28655q2.m87173q(z13);
                }
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                if (metadata.isSelfProfile()) {
                    c28655q2.m87150e0(649272442);
                    editButtonTitle = metadata.getEditButtonTitle();
                    if (editButtonTitle == null) {
                        c28655q2.m87150e0(-1347390777);
                        c28655q2.m87173q(z13);
                        z14 = z13;
                        c2314t3 = c2314t2;
                        i24 = 3;
                        i25 = 6;
                        function5 = function4;
                        c28676v2 = c28676v1;
                    } else {
                        c28655q2.m87150e0(-1347390776);
                        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(editButtonTitle);
                        C38072d c38072d6 = C38072d.f163053a;
                        int iM73365A2 = AbstractC25012a.m73365A(c38072d6);
                        C22976l1 c22976l3 = AbstractC15166v0.f56891a;
                        int i38 = C38072d.f163054b;
                        C28655q c28655q10 = c28655q2;
                        C2314t c2314t5 = c2314t2;
                        i25 = 6;
                        i24 = 3;
                        C15077m1 c15077m1M43196a2 = AbstractC15166v0.m43196a(c38072d6.m121949b(c28655q2, i38).getWhite10(), c38072d6.m121949b(c28655q2, i38).getBrandWhite(), 0L, 0L, c28655q10, 0, 12);
                        float f311 = 3 * f25;
                        float f312 = ((float) 2.5d) * f26;
                        float f313 = ((float) 1.5d) * f26;
                        C22976l1 c22976l4 = new C22976l1(f312, f313, f312, f313);
                        C2886a c2886aM8438s2 = c38072d6.m121952e(c28655q10, i38).getH5();
                        Modifier modifierM3429z2 = AbstractC1102d.m3429z(c2314t5, null, 1);
                        Integer numValueOf2 = Integer.valueOf(iM73365A2);
                        boolean zM87157i2 = c28655q10.m87157i(metadata);
                        if ((i15 & 112) == 32) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z24 = zM87157i2 | z19;
                        objM87133R3 = c28655q10.m87133R();
                        if (z24) {
                            c28676v3 = c28676v1;
                            if (objM87133R3 == c28676v3) {
                                function5 = function4;
                            }
                            c2314t3 = c2314t5;
                            c28676v2 = c28676v3;
                            AbstractC27292z.m82343j(modifierM3429z2, false, false, numValueOf2, null, null, textResourceM21278l2, c15077m1M43196a2, null, null, f311, c22976l4, c2886aM8438s2, (InterfaceC4339a) objM87133R3, c28655q10, (TextResource.$stable << 18) | 6, (C2886a.f11498d << 6) | 54, 822);
                            c28655q2 = c28655q10;
                            z14 = false;
                            c28655q2.m87173q(false);
                        } else {
                            c28676v3 = c28676v1;
                        }
                        function5 = function4;
                        objM87133R3 = new C3603v(metadata, function5, 19);
                        c28655q10.m87172p0(objM87133R3);
                        c2314t3 = c2314t5;
                        c28676v2 = c28676v3;
                        AbstractC27292z.m82343j(modifierM3429z2, false, false, numValueOf2, null, null, textResourceM21278l2, c15077m1M43196a2, null, null, f311, c22976l4, c2886aM8438s2, (InterfaceC4339a) objM87133R3, c28655q10, (TextResource.$stable << 18) | 6, (C2886a.f11498d << 6) | 54, 822);
                        c28655q2 = c28655q10;
                        z14 = false;
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z14);
                } else {
                    c22949e2 = c22949e2;
                    z14 = z13;
                    c2314t3 = c2314t2;
                    c2306l2 = c2306l2;
                    i24 = 3;
                    i25 = 6;
                    function5 = function4;
                    c28676v2 = c28676v1;
                    c28655q2.m87150e0(-1346137074);
                    c28655q2.m87173q(z14);
                }
                c28655q2.m87173q(true);
                membershipData = metadata.getMembershipData();
                if (membershipData == null) {
                    c28655q2.m87150e0(-124365388);
                    c28655q2.m87173q(z14);
                    interfaceC4339a7 = interfaceC4339a5;
                    z18 = true;
                } else {
                    c28655q2.m87150e0(-124365387);
                    AbstractC11266d.m30469w(i24, f25, c2314t3, c28655q2);
                    float f314 = r18 * f25;
                    Modifier modifierM118994r2 = AbstractC37056f.m118994r(AbstractC1102d.m3405b(AbstractC1102d.m3409f(1.0f, c2314t3), 0.0f, 5 * f25, 1), AbstractC33253j.m105489e(f314));
                    c38072d = C38072d.f163053a;
                    i26 = C38072d.f163054b;
                    Modifier modifierM3358c2 = AbstractC1092a.m3358c(modifierM118994r2, c38072d.m121949b(c28655q2, i26).getBlack20(), AbstractC17918w0.f69621a);
                    if (membershipData.getBottomSheet() != null) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    i27 = i15;
                    if ((i27 & 896) == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R2 = c28655q2.m87133R();
                    if (z16) {
                        interfaceC4339a6 = interfaceC4339a5;
                        objM87133R2 = new C2161b(interfaceC4339a6, 9);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        interfaceC4339a6 = interfaceC4339a5;
                        objM87133R2 = new C2161b(interfaceC4339a6, 9);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    Modifier modifierM44099b2 = AbstractC15676d.m44099b(modifierM3358c2, z15, (Function1) objM87133R2);
                    float f315 = ((float) 1.5d) * f26;
                    f27 = 1 * f26;
                    Modifier modifierM3395q2 = AbstractC1099a.m3395q(modifierM44099b2, f315, f27);
                    C22949e c22949e4 = c22949e2;
                    C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(c22949e4, c2306l2, c28655q2, 48);
                    iHashCode6 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q2.m87165m();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q2, modifierM3395q2);
                    c28655q2.m87158i0();
                    float f44 = f25;
                    if (c28655q2.f115903S) {
                        c0213j3 = c0213j2;
                        c28655q2.m87163l(c0213j3);
                    } else {
                        c0213j3 = c0213j2;
                        c28655q2.m87178s0();
                    }
                    InterfaceC4339a interfaceC4339a9 = interfaceC4339a6;
                    C0209i c0209i110 = c0209i13;
                    AbstractC28683x.m87239G(c28655q2, c0209i110, c22994r1M66759a8);
                    C0209i c0209i111 = c0209i10;
                    AbstractC28683x.m87239G(c28655q2, c0209i111, interfaceC28653p1M87165m14);
                    if (c28655q2.f115903S) {
                        f28 = f27;
                        if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode6))) {
                            c0209i16 = c0209i14;
                        }
                        C0209i c0209i22 = c0209i15;
                        AbstractC28683x.m87239G(c28655q2, c0209i22, modifierM118962N14);
                        c28655q = c28655q2;
                        C28676v0 c28676v6 = c28676v2;
                        function6 = function5;
                        c0209i17 = c0209i16;
                        f29 = f28;
                        interfaceC4339a7 = interfaceC4339a9;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(membershipData.getIcon().toWhoopIcon(), c28655q2, i25), "member icon", AbstractC1102d.m3419p(f24, c2314t3), C17919x.f69637n, c28655q, 3504, 0);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f315, c2314t3));
                        C22994r1 c22994r1M66759a9 = AbstractC22988p1.m66759a(c22949e4, C2299e.f9107J, c28655q, 0);
                        iHashCode7 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                        Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, c2314t3);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j3);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i110, c22994r1M66759a9);
                        AbstractC28683x.m87239G(c28655q, c0209i111, interfaceC28653p1M87165m15);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i17);
                        } else {
                            AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i17);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i22, modifierM118962N15);
                        String strM8299l3 = AbstractC2875y.m8299l(membershipData.getMemberSinceTitle(), str2);
                        C2886a c2886aM8422c3 = c38072d.m121952e(c28655q, i26).getB3();
                        long jM125385c3 = c38072d.m121949b(c28655q, i26).getWhite70();
                        i28 = C2886a.f11498d << 18;
                        AbstractC30795n.m94707h(strM8299l3, null, jM125385c3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c3, null, c28655q, 0, i28, 196602);
                        c28655q2 = c28655q;
                        memberSinceDate = membershipData.getMemberSinceDate();
                        if (memberSinceDate == null) {
                            c28655q2.m87150e0(-1044783865);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-1044783864);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f29, c2314t3));
                            AbstractC30795n.m94707h(memberSinceDate, null, c38072d.m121949b(c28655q2, i26).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i26).getB3(), null, c28655q2, 0, i28, 196602);
                            c28655q2 = c28655q2;
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(true);
                        if (metadata.isSelfProfile()) {
                            function5 = function6;
                            z17 = false;
                            c28655q2.m87150e0(-1181673449);
                            c28655q2.m87173q(false);
                        } else {
                            function5 = function6;
                            z17 = false;
                            c28655q2.m87150e0(-1181673449);
                            c28655q2.m87173q(false);
                        }
                        z18 = true;
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(z17);
                    } else {
                        f28 = f27;
                    }
                    c0209i16 = c0209i14;
                    AbstractC11266d.m30471y(iHashCode6, c28655q2, iHashCode6, c0209i16);
                    C0209i c0209i23 = c0209i15;
                    AbstractC28683x.m87239G(c28655q2, c0209i23, modifierM118962N14);
                    c28655q = c28655q2;
                    C28676v0 c28676v7 = c28676v2;
                    function6 = function5;
                    c0209i17 = c0209i16;
                    f29 = f28;
                    interfaceC4339a7 = interfaceC4339a9;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(membershipData.getIcon().toWhoopIcon(), c28655q2, i25), "member icon", AbstractC1102d.m3419p(f24, c2314t3), C17919x.f69637n, c28655q, 3504, 0);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f315, c2314t3));
                    C22994r1 c22994r1M66759a10 = AbstractC22988p1.m66759a(c22949e4, C2299e.f9107J, c28655q, 0);
                    iHashCode7 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                    Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, c2314t3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i110, c22994r1M66759a10);
                    AbstractC28683x.m87239G(c28655q, c0209i111, interfaceC28653p1M87165m16);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i17);
                    } else {
                        AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i17);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i23, modifierM118962N16);
                    String strM8299l4 = AbstractC2875y.m8299l(membershipData.getMemberSinceTitle(), str2);
                    C2886a c2886aM8422c4 = c38072d.m121952e(c28655q, i26).getB3();
                    long jM125385c4 = c38072d.m121949b(c28655q, i26).getWhite70();
                    i28 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(strM8299l4, null, jM125385c4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c4, null, c28655q, 0, i28, 196602);
                    c28655q2 = c28655q;
                    memberSinceDate = membershipData.getMemberSinceDate();
                    if (memberSinceDate == null) {
                        c28655q2.m87150e0(-1044783865);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-1044783864);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f29, c2314t3));
                        AbstractC30795n.m94707h(memberSinceDate, null, c38072d.m121949b(c28655q2, i26).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i26).getB3(), null, c28655q2, 0, i28, 196602);
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    if (metadata.isSelfProfile()) {
                        function5 = function6;
                        z17 = false;
                        c28655q2.m87150e0(-1181673449);
                        c28655q2.m87173q(false);
                    } else {
                        function5 = function6;
                        z17 = false;
                        c28655q2.m87150e0(-1181673449);
                        c28655q2.m87173q(false);
                    }
                    z18 = true;
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(z17);
                }
                c28655q2.m87173q(z18);
                c28655q2.m87173q(z18);
                function2 = function5;
                interfaceC4339a3 = interfaceC4339a7;
            } else {
                c28655q2.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q2.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4007d1(i13, i14, 16, metadata, interfaceC4339a3, function2);
            }
        }
        i15 |= 48;
        function2 = function1;
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
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i29 != 0) {
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C6498i(15);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    function3 = (Function1) objM87133R5;
                } else {
                    function3 = function2;
                }
                i18 = 8;
                if (i16 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C8527a(i18);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q2.m87165m();
                Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q2, modifierM3407d3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d3);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m17);
                c0209i3 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N17);
                userData = metadata.getUserData();
                if (userData != null) {
                    profileImageUrl = userData.getProfileImageUrl();
                } else {
                    profileImageUrl = null;
                }
                if (profileImageUrl == null) {
                    c28655q2.m87150e0(902816210);
                    c28655q2.m87173q(false);
                    function4 = function3;
                    interfaceC4339a5 = interfaceC4339a4;
                    c0209i5 = c0209i2;
                    c2314t2 = c2314t;
                    c28676v1 = c28676v0;
                    c0209i6 = c0209i;
                    f13 = 1.0f;
                } else {
                    c28655q2.m87150e0(902816211);
                    c0209i5 = c0209i2;
                    function4 = function3;
                    interfaceC4339a5 = interfaceC4339a4;
                    AbstractC26165a abstractC26165aM64500i4 = AbstractC22404p.m64500i(profileImageUrl, null, null, c28655q2, AbstractC22403o.f87638a, 3);
                    Modifier modifierM3488c3 = AbstractC1127a.m3488c(AbstractC1102d.m3411h(85 * 4, AbstractC1102d.m3409f(1.0f, c2314t)), 0.0f, 0.0f, 0.8f, 0.0f, 0.0f, 0.0f, null, new C17907r(400.0f, 400.0f, 0), 2, 450555);
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C6498i(16);
                        c28655q2.m87172p0(objM87133R);
                    }
                    c0209i6 = c0209i;
                    c28676v1 = c28676v0;
                    c2314t2 = c2314t;
                    f13 = 1.0f;
                    AbstractC29125c.m88522c(abstractC26165aM64500i4, null, AbstractC1125a.m3479b(modifierM3488c3, (Function1) objM87133R), null, C39102j.f168199a, 0.0f, null, c28655q2, 24624, 104);
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                }
                f14 = 2;
                f15 = 8;
                Modifier modifierM66724m3 = AbstractC22953f.m66724m(AbstractC1099a.m3396r(AbstractC1102d.m3407d(f13, c2314t2), f14 * f15, 0.0f, 2));
                C2305k c2305k3 = C2299e.f9110M;
                C22957g c22957g3 = AbstractC22977m.f90652c;
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q2, 48);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q2.m87165m();
                Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q2, modifierM66724m3);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i6, c23010xM66775a5);
                AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m18);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N18);
                f16 = 4;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(22 * f16, c2314t2));
                userData2 = metadata.getUserData();
                if (userData2 != null) {
                    profileImageUrl2 = userData2.getProfileImageUrl();
                } else {
                    profileImageUrl2 = null;
                }
                i19 = AbstractC22403o.f87638a;
                ProfileAvatarKt.ProfileAvatar(profileImageUrl2, null, null, c28655q2, i19, 6);
                f17 = f16 * f16;
                Modifier modifierM91835e3 = AbstractC30007c.m91835e(c2314t2, f17, c28655q2, c2314t2, f13);
                c2306l = C2299e.f9108K;
                c22949e = AbstractC22977m.f90650a;
                C22994r1 c22994r1M66759a11 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q2, 48);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q2.m87165m();
                Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q2, modifierM91835e3);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i6, c22994r1M66759a11);
                AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m19);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N19);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f18 = Float.MAX_VALUE;
                } else {
                    f18 = 1.0f;
                }
                LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(f18, true);
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q2, 0);
                iHashCode4 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q2.m87165m();
                Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement3);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i6, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m110);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N110);
                userData3 = metadata.getUserData();
                if (userData3 == null) {
                    c28655q2.m87150e0(307028871);
                    c28655q2.m87173q(false);
                    f24 = f17;
                    c2306l2 = c2306l;
                    c22949e2 = c22949e;
                    z13 = false;
                    c0209i8 = c0209i4;
                    f25 = f16;
                    c0209i7 = c0209i5;
                    f19 = f15;
                } else {
                    c28655q2.m87150e0(307028872);
                    String strM53370k3 = AbstractC18489d0.m53370k(userData3.getFirstName(), " ", userData3.getLastName());
                    C38072d c38072d7 = C38072d.f163053a;
                    int i39 = C38072d.f163054b;
                    C28655q c28655q11 = c28655q2;
                    c0209i7 = c0209i5;
                    c22949e2 = c22949e;
                    f19 = f15;
                    z13 = false;
                    f24 = f17;
                    c0209i8 = c0209i4;
                    f25 = f16;
                    c2306l2 = c2306l;
                    AbstractC30795n.m94707h(strM53370k3, null, c38072d7.m121949b(c28655q2, i39).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d7.m121952e(c28655q2, i39).getT2(), null, c28655q11, 0, C2886a.f11498d << 18, 196602);
                    c28655q2 = c28655q11;
                    c28655q2.m87173q(false);
                }
                AbstractC11266d.m30469w((float) 0.5d, f25, c2314t2, c28655q2);
                C22994r1 c22994r1M66759a12 = AbstractC22988p1.m66759a(c22949e2, c2306l2, c28655q2, 48);
                iHashCode5 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q2.m87165m();
                Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q2, c2314t2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c0213j2 = c0213j;
                    c28655q2.m87163l(c0213j2);
                } else {
                    c0213j2 = c0213j;
                    c28655q2.m87178s0();
                }
                c0209i9 = c0209i6;
                AbstractC28683x.m87239G(c28655q2, c0209i9, c22994r1M66759a12);
                c0209i10 = c0209i7;
                AbstractC28683x.m87239G(c28655q2, c0209i10, interfaceC28653p1M87165m111);
                if (c28655q2.f115903S) {
                    c0209i11 = c0209i3;
                    AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i11);
                } else {
                    c0209i11 = c0209i3;
                    AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i11);
                }
                c0209i12 = c0209i8;
                AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N111);
                zIsSelfProfile = metadata.isSelfProfile();
                c39077b1 = C39102j.f168200b;
                if (zIsSelfProfile) {
                    c28655q2.m87150e0(-385070561);
                    entitlementImage = metadata.getEntitlementImage();
                    if (entitlementImage == null) {
                        c28655q2.m87150e0(947714498);
                        c28655q2.m87173q(z13);
                        c0209i13 = c0209i9;
                        c0209i14 = c0209i11;
                        c0209i15 = c0209i12;
                        c39077b2 = c39077b1;
                        f26 = f19;
                    } else {
                        c28655q2.m87150e0(947714499);
                        float f316 = f19;
                        C28655q c28655q12 = c28655q2;
                        c0209i15 = c0209i12;
                        c0209i14 = c0209i11;
                        c0209i13 = c0209i9;
                        f26 = f316;
                        AbstractC29125c.m88522c(AbstractC22404p.m64500i(entitlementImage, null, null, c28655q2, i19, 3), AbstractC30060g.m92103Y(c28655q2, C9691R.string.profile_entitlement_logo_content_description), AbstractC1102d.m3421r(ProfileScreenKt.entitlementImageEffect(c2314t2), f316 * f25, f14 * f25), null, c39077b1, 0.0f, null, c28655q12, 24576, 104);
                        c39077b2 = c39077b1;
                        c28655q2 = c28655q12;
                        AbstractC18489d0.m53381v(1, f26, c2314t2, c28655q2, z13);
                    }
                    c28655q2.m87173q(z13);
                } else {
                    c0209i13 = c0209i9;
                    c0209i10 = c0209i10;
                    c0209i14 = c0209i11;
                    c0209i15 = c0209i12;
                    c0213j2 = c0213j2;
                    c39077b2 = c39077b1;
                    f26 = f19;
                    c28655q2.m87150e0(948360136);
                    c28655q2.m87173q(z13);
                }
                userData4 = metadata.getUserData();
                if (userData4 != null) {
                    String strM30461o3 = AbstractC11266d.m30461o("@", userData4.getUsername());
                    age = userData4.getAge();
                    if (age != null) {
                        strValueOf = String.valueOf(age.intValue());
                    } else {
                        strValueOf = null;
                    }
                    List listM74077r2 = AbstractC25260n.m74077r0(new String[]{strM30461o3, strValueOf, userData4.getLocation()});
                    str = " ";
                    strM74110N0 = AbstractC25265s.m74110N0(listM74077r2, AbstractC11895b.m31996o(str, EnumC22414z.BULLET.getSymbol(), str), null, null, null, 62);
                } else {
                    str = r5;
                    strM74110N0 = null;
                }
                if (strM74110N0 != null) {
                    str2 = str;
                    c28655q2.m87150e0(949187464);
                    c28655q2.m87173q(z13);
                } else {
                    str2 = str;
                    c28655q2.m87150e0(949187464);
                    c28655q2.m87173q(z13);
                }
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                if (metadata.isSelfProfile()) {
                    c28655q2.m87150e0(649272442);
                    editButtonTitle = metadata.getEditButtonTitle();
                    if (editButtonTitle == null) {
                        c28655q2.m87150e0(-1347390777);
                        c28655q2.m87173q(z13);
                        z14 = z13;
                        c2314t3 = c2314t2;
                        i24 = 3;
                        i25 = 6;
                        function5 = function4;
                        c28676v2 = c28676v1;
                    } else {
                        c28655q2.m87150e0(-1347390776);
                        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(editButtonTitle);
                        C38072d c38072d8 = C38072d.f163053a;
                        int iM73365A3 = AbstractC25012a.m73365A(c38072d8);
                        C22976l1 c22976l5 = AbstractC15166v0.f56891a;
                        int i310 = C38072d.f163054b;
                        C28655q c28655q13 = c28655q2;
                        C2314t c2314t6 = c2314t2;
                        i25 = 6;
                        i24 = 3;
                        C15077m1 c15077m1M43196a3 = AbstractC15166v0.m43196a(c38072d8.m121949b(c28655q2, i310).getWhite10(), c38072d8.m121949b(c28655q2, i310).getBrandWhite(), 0L, 0L, c28655q13, 0, 12);
                        float f317 = 3 * f25;
                        float f318 = ((float) 2.5d) * f26;
                        float f319 = ((float) 1.5d) * f26;
                        C22976l1 c22976l6 = new C22976l1(f318, f319, f318, f319);
                        C2886a c2886aM8438s3 = c38072d8.m121952e(c28655q13, i310).getH5();
                        Modifier modifierM3429z3 = AbstractC1102d.m3429z(c2314t6, null, 1);
                        Integer numValueOf3 = Integer.valueOf(iM73365A3);
                        boolean zM87157i3 = c28655q13.m87157i(metadata);
                        if ((i15 & 112) == 32) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z24 = zM87157i3 | z19;
                        objM87133R3 = c28655q13.m87133R();
                        if (z24) {
                            c28676v3 = c28676v1;
                            if (objM87133R3 == c28676v3) {
                                function5 = function4;
                            }
                            c2314t3 = c2314t6;
                            c28676v2 = c28676v3;
                            AbstractC27292z.m82343j(modifierM3429z3, false, false, numValueOf3, null, null, textResourceM21278l3, c15077m1M43196a3, null, null, f317, c22976l6, c2886aM8438s3, (InterfaceC4339a) objM87133R3, c28655q13, (TextResource.$stable << 18) | 6, (C2886a.f11498d << 6) | 54, 822);
                            c28655q2 = c28655q13;
                            z14 = false;
                            c28655q2.m87173q(false);
                        } else {
                            c28676v3 = c28676v1;
                        }
                        function5 = function4;
                        objM87133R3 = new C3603v(metadata, function5, 19);
                        c28655q13.m87172p0(objM87133R3);
                        c2314t3 = c2314t6;
                        c28676v2 = c28676v3;
                        AbstractC27292z.m82343j(modifierM3429z3, false, false, numValueOf3, null, null, textResourceM21278l3, c15077m1M43196a3, null, null, f317, c22976l6, c2886aM8438s3, (InterfaceC4339a) objM87133R3, c28655q13, (TextResource.$stable << 18) | 6, (C2886a.f11498d << 6) | 54, 822);
                        c28655q2 = c28655q13;
                        z14 = false;
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z14);
                } else {
                    c22949e2 = c22949e2;
                    z14 = z13;
                    c2314t3 = c2314t2;
                    c2306l2 = c2306l2;
                    i24 = 3;
                    i25 = 6;
                    function5 = function4;
                    c28676v2 = c28676v1;
                    c28655q2.m87150e0(-1346137074);
                    c28655q2.m87173q(z14);
                }
                c28655q2.m87173q(true);
                membershipData = metadata.getMembershipData();
                if (membershipData == null) {
                    c28655q2.m87150e0(-124365388);
                    c28655q2.m87173q(z14);
                    interfaceC4339a7 = interfaceC4339a5;
                    z18 = true;
                } else {
                    c28655q2.m87150e0(-124365387);
                    AbstractC11266d.m30469w(i24, f25, c2314t3, c28655q2);
                    float f3110 = r18 * f25;
                    Modifier modifierM118994r3 = AbstractC37056f.m118994r(AbstractC1102d.m3405b(AbstractC1102d.m3409f(1.0f, c2314t3), 0.0f, 5 * f25, 1), AbstractC33253j.m105489e(f3110));
                    c38072d = C38072d.f163053a;
                    i26 = C38072d.f163054b;
                    Modifier modifierM3358c3 = AbstractC1092a.m3358c(modifierM118994r3, c38072d.m121949b(c28655q2, i26).getBlack20(), AbstractC17918w0.f69621a);
                    if (membershipData.getBottomSheet() != null) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    i27 = i15;
                    if ((i27 & 896) == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R2 = c28655q2.m87133R();
                    if (z16) {
                        interfaceC4339a6 = interfaceC4339a5;
                        objM87133R2 = new C2161b(interfaceC4339a6, 9);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        interfaceC4339a6 = interfaceC4339a5;
                        objM87133R2 = new C2161b(interfaceC4339a6, 9);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    Modifier modifierM44099b3 = AbstractC15676d.m44099b(modifierM3358c3, z15, (Function1) objM87133R2);
                    float f3111 = ((float) 1.5d) * f26;
                    f27 = 1 * f26;
                    Modifier modifierM3395q3 = AbstractC1099a.m3395q(modifierM44099b3, f3111, f27);
                    C22949e c22949e5 = c22949e2;
                    C22994r1 c22994r1M66759a13 = AbstractC22988p1.m66759a(c22949e5, c2306l2, c28655q2, 48);
                    iHashCode6 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q2.m87165m();
                    Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q2, modifierM3395q3);
                    c28655q2.m87158i0();
                    float f45 = f25;
                    if (c28655q2.f115903S) {
                        c0213j3 = c0213j2;
                        c28655q2.m87163l(c0213j3);
                    } else {
                        c0213j3 = c0213j2;
                        c28655q2.m87178s0();
                    }
                    InterfaceC4339a interfaceC4339a10 = interfaceC4339a6;
                    C0209i c0209i112 = c0209i13;
                    AbstractC28683x.m87239G(c28655q2, c0209i112, c22994r1M66759a13);
                    C0209i c0209i113 = c0209i10;
                    AbstractC28683x.m87239G(c28655q2, c0209i113, interfaceC28653p1M87165m112);
                    if (c28655q2.f115903S) {
                        f28 = f27;
                        if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode6))) {
                            c0209i16 = c0209i14;
                        }
                        C0209i c0209i24 = c0209i15;
                        AbstractC28683x.m87239G(c28655q2, c0209i24, modifierM118962N112);
                        c28655q = c28655q2;
                        C28676v0 c28676v8 = c28676v2;
                        function6 = function5;
                        c0209i17 = c0209i16;
                        f29 = f28;
                        interfaceC4339a7 = interfaceC4339a10;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(membershipData.getIcon().toWhoopIcon(), c28655q2, i25), "member icon", AbstractC1102d.m3419p(f24, c2314t3), C17919x.f69637n, c28655q, 3504, 0);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f3111, c2314t3));
                        C22994r1 c22994r1M66759a14 = AbstractC22988p1.m66759a(c22949e5, C2299e.f9107J, c28655q, 0);
                        iHashCode7 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q.m87165m();
                        Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q, c2314t3);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j3);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i112, c22994r1M66759a14);
                        AbstractC28683x.m87239G(c28655q, c0209i113, interfaceC28653p1M87165m113);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i17);
                        } else {
                            AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i17);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i24, modifierM118962N113);
                        String strM8299l5 = AbstractC2875y.m8299l(membershipData.getMemberSinceTitle(), str2);
                        C2886a c2886aM8422c5 = c38072d.m121952e(c28655q, i26).getB3();
                        long jM125385c5 = c38072d.m121949b(c28655q, i26).getWhite70();
                        i28 = C2886a.f11498d << 18;
                        AbstractC30795n.m94707h(strM8299l5, null, jM125385c5, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c5, null, c28655q, 0, i28, 196602);
                        c28655q2 = c28655q;
                        memberSinceDate = membershipData.getMemberSinceDate();
                        if (memberSinceDate == null) {
                            c28655q2.m87150e0(-1044783865);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-1044783864);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f29, c2314t3));
                            AbstractC30795n.m94707h(memberSinceDate, null, c38072d.m121949b(c28655q2, i26).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i26).getB3(), null, c28655q2, 0, i28, 196602);
                            c28655q2 = c28655q2;
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(true);
                        if (metadata.isSelfProfile()) {
                            function5 = function6;
                            z17 = false;
                            c28655q2.m87150e0(-1181673449);
                            c28655q2.m87173q(false);
                        } else {
                            function5 = function6;
                            z17 = false;
                            c28655q2.m87150e0(-1181673449);
                            c28655q2.m87173q(false);
                        }
                        z18 = true;
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(z17);
                    } else {
                        f28 = f27;
                    }
                    c0209i16 = c0209i14;
                    AbstractC11266d.m30471y(iHashCode6, c28655q2, iHashCode6, c0209i16);
                    C0209i c0209i25 = c0209i15;
                    AbstractC28683x.m87239G(c28655q2, c0209i25, modifierM118962N112);
                    c28655q = c28655q2;
                    C28676v0 c28676v9 = c28676v2;
                    function6 = function5;
                    c0209i17 = c0209i16;
                    f29 = f28;
                    interfaceC4339a7 = interfaceC4339a10;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(membershipData.getIcon().toWhoopIcon(), c28655q2, i25), "member icon", AbstractC1102d.m3419p(f24, c2314t3), C17919x.f69637n, c28655q, 3504, 0);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f3111, c2314t3));
                    C22994r1 c22994r1M66759a15 = AbstractC22988p1.m66759a(c22949e5, C2299e.f9107J, c28655q, 0);
                    iHashCode7 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q.m87165m();
                    Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q, c2314t3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i112, c22994r1M66759a15);
                    AbstractC28683x.m87239G(c28655q, c0209i113, interfaceC28653p1M87165m114);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i17);
                    } else {
                        AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i17);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i25, modifierM118962N114);
                    String strM8299l6 = AbstractC2875y.m8299l(membershipData.getMemberSinceTitle(), str2);
                    C2886a c2886aM8422c6 = c38072d.m121952e(c28655q, i26).getB3();
                    long jM125385c6 = c38072d.m121949b(c28655q, i26).getWhite70();
                    i28 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(strM8299l6, null, jM125385c6, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c6, null, c28655q, 0, i28, 196602);
                    c28655q2 = c28655q;
                    memberSinceDate = membershipData.getMemberSinceDate();
                    if (memberSinceDate == null) {
                        c28655q2.m87150e0(-1044783865);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-1044783864);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f29, c2314t3));
                        AbstractC30795n.m94707h(memberSinceDate, null, c38072d.m121949b(c28655q2, i26).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i26).getB3(), null, c28655q2, 0, i28, 196602);
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    if (metadata.isSelfProfile()) {
                        function5 = function6;
                        z17 = false;
                        c28655q2.m87150e0(-1181673449);
                        c28655q2.m87173q(false);
                    } else {
                        function5 = function6;
                        z17 = false;
                        c28655q2.m87150e0(-1181673449);
                        c28655q2.m87173q(false);
                    }
                    z18 = true;
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(z17);
                }
                c28655q2.m87173q(z18);
                c28655q2.m87173q(z18);
                function2 = function5;
                interfaceC4339a3 = interfaceC4339a7;
            } else {
                c28655q2.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q2.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4007d1(i13, i14, 16, metadata, interfaceC4339a3, function2);
            }
        }
        i15 |= 384;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i29 != 0) {
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C6498i(15);
                    c28655q2.m87172p0(objM87133R5);
                }
                function3 = (Function1) objM87133R5;
            } else {
                function3 = function2;
            }
            i18 = 8;
            if (i16 != 0) {
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C8527a(i18);
                    c28655q2.m87172p0(objM87133R4);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            c2314t = C2314t.f9131w;
            Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q2.m87165m();
            Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q2, modifierM3407d4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d4);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m115);
            c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N115);
            userData = metadata.getUserData();
            if (userData != null) {
                profileImageUrl = userData.getProfileImageUrl();
            } else {
                profileImageUrl = null;
            }
            if (profileImageUrl == null) {
                c28655q2.m87150e0(902816210);
                c28655q2.m87173q(false);
                function4 = function3;
                interfaceC4339a5 = interfaceC4339a4;
                c0209i5 = c0209i2;
                c2314t2 = c2314t;
                c28676v1 = c28676v0;
                c0209i6 = c0209i;
                f13 = 1.0f;
            } else {
                c28655q2.m87150e0(902816211);
                c0209i5 = c0209i2;
                function4 = function3;
                interfaceC4339a5 = interfaceC4339a4;
                AbstractC26165a abstractC26165aM64500i5 = AbstractC22404p.m64500i(profileImageUrl, null, null, c28655q2, AbstractC22403o.f87638a, 3);
                Modifier modifierM3488c4 = AbstractC1127a.m3488c(AbstractC1102d.m3411h(85 * 4, AbstractC1102d.m3409f(1.0f, c2314t)), 0.0f, 0.0f, 0.8f, 0.0f, 0.0f, 0.0f, null, new C17907r(400.0f, 400.0f, 0), 2, 450555);
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C6498i(16);
                    c28655q2.m87172p0(objM87133R);
                }
                c0209i6 = c0209i;
                c28676v1 = c28676v0;
                c2314t2 = c2314t;
                f13 = 1.0f;
                AbstractC29125c.m88522c(abstractC26165aM64500i5, null, AbstractC1125a.m3479b(modifierM3488c4, (Function1) objM87133R), null, C39102j.f168199a, 0.0f, null, c28655q2, 24624, 104);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            }
            f14 = 2;
            f15 = 8;
            Modifier modifierM66724m4 = AbstractC22953f.m66724m(AbstractC1099a.m3396r(AbstractC1102d.m3407d(f13, c2314t2), f14 * f15, 0.0f, 2));
            C2305k c2305k4 = C2299e.f9110M;
            C22957g c22957g4 = AbstractC22977m.f90652c;
            C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q2, 48);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q2.m87165m();
            Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q2, modifierM66724m4);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i6, c23010xM66775a7);
            AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m116);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N116);
            f16 = 4;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(22 * f16, c2314t2));
            userData2 = metadata.getUserData();
            if (userData2 != null) {
                profileImageUrl2 = userData2.getProfileImageUrl();
            } else {
                profileImageUrl2 = null;
            }
            i19 = AbstractC22403o.f87638a;
            ProfileAvatarKt.ProfileAvatar(profileImageUrl2, null, null, c28655q2, i19, 6);
            f17 = f16 * f16;
            Modifier modifierM91835e4 = AbstractC30007c.m91835e(c2314t2, f17, c28655q2, c2314t2, f13);
            c2306l = C2299e.f9108K;
            c22949e = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a16 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q2, 48);
            iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q2.m87165m();
            Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q2, modifierM91835e4);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i6, c22994r1M66759a16);
            AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m117);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N117);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f18 = Float.MAX_VALUE;
            } else {
                f18 = 1.0f;
            }
            LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(f18, true);
            C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q2, 0);
            iHashCode4 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q2.m87165m();
            Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement4);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i6, c23010xM66775a8);
            AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m118);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N118);
            userData3 = metadata.getUserData();
            if (userData3 == null) {
                c28655q2.m87150e0(307028871);
                c28655q2.m87173q(false);
                f24 = f17;
                c2306l2 = c2306l;
                c22949e2 = c22949e;
                z13 = false;
                c0209i8 = c0209i4;
                f25 = f16;
                c0209i7 = c0209i5;
                f19 = f15;
            } else {
                c28655q2.m87150e0(307028872);
                String strM53370k4 = AbstractC18489d0.m53370k(userData3.getFirstName(), " ", userData3.getLastName());
                C38072d c38072d9 = C38072d.f163053a;
                int i311 = C38072d.f163054b;
                C28655q c28655q14 = c28655q2;
                c0209i7 = c0209i5;
                c22949e2 = c22949e;
                f19 = f15;
                z13 = false;
                f24 = f17;
                c0209i8 = c0209i4;
                f25 = f16;
                c2306l2 = c2306l;
                AbstractC30795n.m94707h(strM53370k4, null, c38072d9.m121949b(c28655q2, i311).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d9.m121952e(c28655q2, i311).getT2(), null, c28655q14, 0, C2886a.f11498d << 18, 196602);
                c28655q2 = c28655q14;
                c28655q2.m87173q(false);
            }
            AbstractC11266d.m30469w((float) 0.5d, f25, c2314t2, c28655q2);
            C22994r1 c22994r1M66759a17 = AbstractC22988p1.m66759a(c22949e2, c2306l2, c28655q2, 48);
            iHashCode5 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m119 = c28655q2.m87165m();
            Modifier modifierM118962N119 = AbstractC37056f.m118962N(c28655q2, c2314t2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c0213j2 = c0213j;
                c28655q2.m87163l(c0213j2);
            } else {
                c0213j2 = c0213j;
                c28655q2.m87178s0();
            }
            c0209i9 = c0209i6;
            AbstractC28683x.m87239G(c28655q2, c0209i9, c22994r1M66759a17);
            c0209i10 = c0209i7;
            AbstractC28683x.m87239G(c28655q2, c0209i10, interfaceC28653p1M87165m119);
            if (c28655q2.f115903S) {
                c0209i11 = c0209i3;
                AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i11);
            } else {
                c0209i11 = c0209i3;
                AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i11);
            }
            c0209i12 = c0209i8;
            AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N119);
            zIsSelfProfile = metadata.isSelfProfile();
            c39077b1 = C39102j.f168200b;
            if (zIsSelfProfile) {
                c28655q2.m87150e0(-385070561);
                entitlementImage = metadata.getEntitlementImage();
                if (entitlementImage == null) {
                    c28655q2.m87150e0(947714498);
                    c28655q2.m87173q(z13);
                    c0209i13 = c0209i9;
                    c0209i14 = c0209i11;
                    c0209i15 = c0209i12;
                    c39077b2 = c39077b1;
                    f26 = f19;
                } else {
                    c28655q2.m87150e0(947714499);
                    float f3112 = f19;
                    C28655q c28655q15 = c28655q2;
                    c0209i15 = c0209i12;
                    c0209i14 = c0209i11;
                    c0209i13 = c0209i9;
                    f26 = f3112;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(entitlementImage, null, null, c28655q2, i19, 3), AbstractC30060g.m92103Y(c28655q2, C9691R.string.profile_entitlement_logo_content_description), AbstractC1102d.m3421r(ProfileScreenKt.entitlementImageEffect(c2314t2), f3112 * f25, f14 * f25), null, c39077b1, 0.0f, null, c28655q15, 24576, 104);
                    c39077b2 = c39077b1;
                    c28655q2 = c28655q15;
                    AbstractC18489d0.m53381v(1, f26, c2314t2, c28655q2, z13);
                }
                c28655q2.m87173q(z13);
            } else {
                c0209i13 = c0209i9;
                c0209i10 = c0209i10;
                c0209i14 = c0209i11;
                c0209i15 = c0209i12;
                c0213j2 = c0213j2;
                c39077b2 = c39077b1;
                f26 = f19;
                c28655q2.m87150e0(948360136);
                c28655q2.m87173q(z13);
            }
            userData4 = metadata.getUserData();
            if (userData4 != null) {
                String strM30461o4 = AbstractC11266d.m30461o("@", userData4.getUsername());
                age = userData4.getAge();
                if (age != null) {
                    strValueOf = String.valueOf(age.intValue());
                } else {
                    strValueOf = null;
                }
                List listM74077r3 = AbstractC25260n.m74077r0(new String[]{strM30461o4, strValueOf, userData4.getLocation()});
                str = " ";
                strM74110N0 = AbstractC25265s.m74110N0(listM74077r3, AbstractC11895b.m31996o(str, EnumC22414z.BULLET.getSymbol(), str), null, null, null, 62);
            } else {
                str = r5;
                strM74110N0 = null;
            }
            if (strM74110N0 != null) {
                str2 = str;
                c28655q2.m87150e0(949187464);
                c28655q2.m87173q(z13);
            } else {
                str2 = str;
                c28655q2.m87150e0(949187464);
                c28655q2.m87173q(z13);
            }
            c28655q2.m87173q(true);
            c28655q2.m87173q(true);
            if (metadata.isSelfProfile()) {
                c28655q2.m87150e0(649272442);
                editButtonTitle = metadata.getEditButtonTitle();
                if (editButtonTitle == null) {
                    c28655q2.m87150e0(-1347390777);
                    c28655q2.m87173q(z13);
                    z14 = z13;
                    c2314t3 = c2314t2;
                    i24 = 3;
                    i25 = 6;
                    function5 = function4;
                    c28676v2 = c28676v1;
                } else {
                    c28655q2.m87150e0(-1347390776);
                    TextResource textResourceM21278l4 = AbstractC8693b.m21278l(editButtonTitle);
                    C38072d c38072d10 = C38072d.f163053a;
                    int iM73365A4 = AbstractC25012a.m73365A(c38072d10);
                    C22976l1 c22976l7 = AbstractC15166v0.f56891a;
                    int i312 = C38072d.f163054b;
                    C28655q c28655q16 = c28655q2;
                    C2314t c2314t7 = c2314t2;
                    i25 = 6;
                    i24 = 3;
                    C15077m1 c15077m1M43196a4 = AbstractC15166v0.m43196a(c38072d10.m121949b(c28655q2, i312).getWhite10(), c38072d10.m121949b(c28655q2, i312).getBrandWhite(), 0L, 0L, c28655q16, 0, 12);
                    float f3113 = 3 * f25;
                    float f3114 = ((float) 2.5d) * f26;
                    float f3115 = ((float) 1.5d) * f26;
                    C22976l1 c22976l8 = new C22976l1(f3114, f3115, f3114, f3115);
                    C2886a c2886aM8438s4 = c38072d10.m121952e(c28655q16, i312).getH5();
                    Modifier modifierM3429z4 = AbstractC1102d.m3429z(c2314t7, null, 1);
                    Integer numValueOf4 = Integer.valueOf(iM73365A4);
                    boolean zM87157i4 = c28655q16.m87157i(metadata);
                    if ((i15 & 112) == 32) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z24 = zM87157i4 | z19;
                    objM87133R3 = c28655q16.m87133R();
                    if (z24) {
                        c28676v3 = c28676v1;
                        if (objM87133R3 == c28676v3) {
                            function5 = function4;
                        }
                        c2314t3 = c2314t7;
                        c28676v2 = c28676v3;
                        AbstractC27292z.m82343j(modifierM3429z4, false, false, numValueOf4, null, null, textResourceM21278l4, c15077m1M43196a4, null, null, f3113, c22976l8, c2886aM8438s4, (InterfaceC4339a) objM87133R3, c28655q16, (TextResource.$stable << 18) | 6, (C2886a.f11498d << 6) | 54, 822);
                        c28655q2 = c28655q16;
                        z14 = false;
                        c28655q2.m87173q(false);
                    } else {
                        c28676v3 = c28676v1;
                    }
                    function5 = function4;
                    objM87133R3 = new C3603v(metadata, function5, 19);
                    c28655q16.m87172p0(objM87133R3);
                    c2314t3 = c2314t7;
                    c28676v2 = c28676v3;
                    AbstractC27292z.m82343j(modifierM3429z4, false, false, numValueOf4, null, null, textResourceM21278l4, c15077m1M43196a4, null, null, f3113, c22976l8, c2886aM8438s4, (InterfaceC4339a) objM87133R3, c28655q16, (TextResource.$stable << 18) | 6, (C2886a.f11498d << 6) | 54, 822);
                    c28655q2 = c28655q16;
                    z14 = false;
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(z14);
            } else {
                c22949e2 = c22949e2;
                z14 = z13;
                c2314t3 = c2314t2;
                c2306l2 = c2306l2;
                i24 = 3;
                i25 = 6;
                function5 = function4;
                c28676v2 = c28676v1;
                c28655q2.m87150e0(-1346137074);
                c28655q2.m87173q(z14);
            }
            c28655q2.m87173q(true);
            membershipData = metadata.getMembershipData();
            if (membershipData == null) {
                c28655q2.m87150e0(-124365388);
                c28655q2.m87173q(z14);
                interfaceC4339a7 = interfaceC4339a5;
                z18 = true;
            } else {
                c28655q2.m87150e0(-124365387);
                AbstractC11266d.m30469w(i24, f25, c2314t3, c28655q2);
                float f3116 = r18 * f25;
                Modifier modifierM118994r4 = AbstractC37056f.m118994r(AbstractC1102d.m3405b(AbstractC1102d.m3409f(1.0f, c2314t3), 0.0f, 5 * f25, 1), AbstractC33253j.m105489e(f3116));
                c38072d = C38072d.f163053a;
                i26 = C38072d.f163054b;
                Modifier modifierM3358c4 = AbstractC1092a.m3358c(modifierM118994r4, c38072d.m121949b(c28655q2, i26).getBlack20(), AbstractC17918w0.f69621a);
                if (membershipData.getBottomSheet() != null) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                i27 = i15;
                if ((i27 & 896) == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM87133R2 = c28655q2.m87133R();
                if (z16) {
                    interfaceC4339a6 = interfaceC4339a5;
                    objM87133R2 = new C2161b(interfaceC4339a6, 9);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    interfaceC4339a6 = interfaceC4339a5;
                    objM87133R2 = new C2161b(interfaceC4339a6, 9);
                    c28655q2.m87172p0(objM87133R2);
                }
                Modifier modifierM44099b4 = AbstractC15676d.m44099b(modifierM3358c4, z15, (Function1) objM87133R2);
                float f3117 = ((float) 1.5d) * f26;
                f27 = 1 * f26;
                Modifier modifierM3395q4 = AbstractC1099a.m3395q(modifierM44099b4, f3117, f27);
                C22949e c22949e6 = c22949e2;
                C22994r1 c22994r1M66759a18 = AbstractC22988p1.m66759a(c22949e6, c2306l2, c28655q2, 48);
                iHashCode6 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1110 = c28655q2.m87165m();
                Modifier modifierM118962N1110 = AbstractC37056f.m118962N(c28655q2, modifierM3395q4);
                c28655q2.m87158i0();
                float f46 = f25;
                if (c28655q2.f115903S) {
                    c0213j3 = c0213j2;
                    c28655q2.m87163l(c0213j3);
                } else {
                    c0213j3 = c0213j2;
                    c28655q2.m87178s0();
                }
                InterfaceC4339a interfaceC4339a11 = interfaceC4339a6;
                C0209i c0209i114 = c0209i13;
                AbstractC28683x.m87239G(c28655q2, c0209i114, c22994r1M66759a18);
                C0209i c0209i115 = c0209i10;
                AbstractC28683x.m87239G(c28655q2, c0209i115, interfaceC28653p1M87165m1110);
                if (c28655q2.f115903S) {
                    f28 = f27;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode6))) {
                        c0209i16 = c0209i14;
                    }
                    C0209i c0209i26 = c0209i15;
                    AbstractC28683x.m87239G(c28655q2, c0209i26, modifierM118962N1110);
                    c28655q = c28655q2;
                    C28676v0 c28676v10 = c28676v2;
                    function6 = function5;
                    c0209i17 = c0209i16;
                    f29 = f28;
                    interfaceC4339a7 = interfaceC4339a11;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(membershipData.getIcon().toWhoopIcon(), c28655q2, i25), "member icon", AbstractC1102d.m3419p(f24, c2314t3), C17919x.f69637n, c28655q, 3504, 0);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f3117, c2314t3));
                    C22994r1 c22994r1M66759a19 = AbstractC22988p1.m66759a(c22949e6, C2299e.f9107J, c28655q, 0);
                    iHashCode7 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111 = c28655q.m87165m();
                    Modifier modifierM118962N1111 = AbstractC37056f.m118962N(c28655q, c2314t3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i114, c22994r1M66759a19);
                    AbstractC28683x.m87239G(c28655q, c0209i115, interfaceC28653p1M87165m1111);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i17);
                    } else {
                        AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i17);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i26, modifierM118962N1111);
                    String strM8299l7 = AbstractC2875y.m8299l(membershipData.getMemberSinceTitle(), str2);
                    C2886a c2886aM8422c7 = c38072d.m121952e(c28655q, i26).getB3();
                    long jM125385c7 = c38072d.m121949b(c28655q, i26).getWhite70();
                    i28 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(strM8299l7, null, jM125385c7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c7, null, c28655q, 0, i28, 196602);
                    c28655q2 = c28655q;
                    memberSinceDate = membershipData.getMemberSinceDate();
                    if (memberSinceDate == null) {
                        c28655q2.m87150e0(-1044783865);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-1044783864);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f29, c2314t3));
                        AbstractC30795n.m94707h(memberSinceDate, null, c38072d.m121949b(c28655q2, i26).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i26).getB3(), null, c28655q2, 0, i28, 196602);
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    if (metadata.isSelfProfile()) {
                        function5 = function6;
                        z17 = false;
                        c28655q2.m87150e0(-1181673449);
                        c28655q2.m87173q(false);
                    } else {
                        function5 = function6;
                        z17 = false;
                        c28655q2.m87150e0(-1181673449);
                        c28655q2.m87173q(false);
                    }
                    z18 = true;
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(z17);
                } else {
                    f28 = f27;
                }
                c0209i16 = c0209i14;
                AbstractC11266d.m30471y(iHashCode6, c28655q2, iHashCode6, c0209i16);
                C0209i c0209i27 = c0209i15;
                AbstractC28683x.m87239G(c28655q2, c0209i27, modifierM118962N1110);
                c28655q = c28655q2;
                C28676v0 c28676v11 = c28676v2;
                function6 = function5;
                c0209i17 = c0209i16;
                f29 = f28;
                interfaceC4339a7 = interfaceC4339a11;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(membershipData.getIcon().toWhoopIcon(), c28655q2, i25), "member icon", AbstractC1102d.m3419p(f24, c2314t3), C17919x.f69637n, c28655q, 3504, 0);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f3117, c2314t3));
                C22994r1 c22994r1M66759a110 = AbstractC22988p1.m66759a(c22949e6, C2299e.f9107J, c28655q, 0);
                iHashCode7 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1112 = c28655q.m87165m();
                Modifier modifierM118962N1112 = AbstractC37056f.m118962N(c28655q, c2314t3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j3);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i114, c22994r1M66759a110);
                AbstractC28683x.m87239G(c28655q, c0209i115, interfaceC28653p1M87165m1112);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i17);
                } else {
                    AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i17);
                }
                AbstractC28683x.m87239G(c28655q, c0209i27, modifierM118962N1112);
                String strM8299l8 = AbstractC2875y.m8299l(membershipData.getMemberSinceTitle(), str2);
                C2886a c2886aM8422c8 = c38072d.m121952e(c28655q, i26).getB3();
                long jM125385c8 = c38072d.m121949b(c28655q, i26).getWhite70();
                i28 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM8299l8, null, jM125385c8, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c8, null, c28655q, 0, i28, 196602);
                c28655q2 = c28655q;
                memberSinceDate = membershipData.getMemberSinceDate();
                if (memberSinceDate == null) {
                    c28655q2.m87150e0(-1044783865);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-1044783864);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f29, c2314t3));
                    AbstractC30795n.m94707h(memberSinceDate, null, c38072d.m121949b(c28655q2, i26).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i26).getB3(), null, c28655q2, 0, i28, 196602);
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(true);
                if (metadata.isSelfProfile()) {
                    function5 = function6;
                    z17 = false;
                    c28655q2.m87150e0(-1181673449);
                    c28655q2.m87173q(false);
                } else {
                    function5 = function6;
                    z17 = false;
                    c28655q2.m87150e0(-1181673449);
                    c28655q2.m87173q(false);
                }
                z18 = true;
                c28655q2.m87173q(true);
                c28655q2.m87173q(z17);
            }
            c28655q2.m87173q(z18);
            c28655q2.m87173q(z18);
            function2 = function5;
            interfaceC4339a3 = interfaceC4339a7;
        } else {
            c28655q2.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q2.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4007d1(i13, i14, 16, metadata, interfaceC4339a3, function2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileHeader$lambda$0$0(ProfileEvent it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C14018g ProfileHeader$lambda$2$0$0$0(C14015d drawWithCache) {
        AbstractC22676k.m65750j(drawWithCache, "$this$drawWithCache");
        return drawWithCache.m39910a(new C4780c(C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4294967295L)), new C17919x(AbstractC17918w0.m51517e(4294967295L)), new C17919x(AbstractC17918w0.m51517e(4009754623L)), new C17919x(AbstractC17918w0.m51517e(3154116607L)), new C17919x(AbstractC17918w0.m51515c(2013265919)), new C17919x(AbstractC17918w0.m51515c(872415231)), new C17919x(AbstractC17918w0.m51515c(16777215))), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawWithCache.f50036w.mo468d() >> 32)) / 2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawWithCache.f50036w.mo468d() & 4294967295L)) * 0.25f))), 0.65f * Float.intBitsToFloat((int) (drawWithCache.f50036w.mo468d() >> 32)), 8), 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileHeader$lambda$2$0$0$0$0(AbstractC17911t abstractC17911t, InterfaceC22129c onDrawWithContent) {
        AbstractC22676k.m65750j(onDrawWithContent, "$this$onDrawWithContent");
        ((C0238p0) onDrawWithContent).m728a();
        InterfaceC22131e.m63385u(onDrawWithContent, abstractC17911t, 0L, 0L, 0.0f, null, 6, 62);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileHeader$lambda$2$1$0$1$0$0(ProfileViewState.Metadata metadata, Function1 function1) {
        AnalyticEventModel editButtonAnalyticEvent = metadata.getEditButtonAnalyticEvent();
        if (editButtonAnalyticEvent != null) {
            function1.invoke(new ProfileEvent.BffAnalyticEvent(editButtonAnalyticEvent));
        }
        function1.invoke(new ProfileEvent.AppDrivenNavigation(NavigateToEditProfileViewState.INSTANCE));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier ProfileHeader$lambda$2$1$1$0$0(InterfaceC4339a interfaceC4339a, Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC1772c1.m5391i(applyIf, false, null, new C0343e(interfaceC4339a, 13), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileHeader$lambda$2$1$1$0$0$0(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileHeader$lambda$2$1$1$1$1$0$0(Function1 function1) {
        function1.invoke(new ProfileEvent.AppDrivenNavigation(NavigateToAccountViewState.INSTANCE));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileHeader$lambda$3(ProfileViewState.Metadata metadata, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        ProfileHeader(metadata, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    public static final void ProfileHeaderFoundingMemberPreview(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(147609870);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new InterfaceC4351m() { // from class: com.whoop.profile.view.ProfileHeaderKt$ProfileHeaderFoundingMemberPreview$$inlined$WhoopPreviewTheme$1
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
                    c28655q2.m87150e0(63757650);
                    ProfileViewState.Metadata metadataCopy$default = ProfileViewState.Metadata.copy$default(ProfileSamples.INSTANCE.getSampleFoundingMemberProfileViewStateMetadata(), null, true, null, null, null, null, false, 125, null);
                    Object objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new Function1() { // from class: com.whoop.profile.view.ProfileHeaderKt$ProfileHeaderFoundingMemberPreview$1$1$1
                            public final void invoke(ProfileEvent it) {
                                AbstractC22676k.m65750j(it, "it");
                            }

                            @Override // p715kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((ProfileEvent) obj);
                                return C23454a0.f92919a;
                            }
                        };
                        c28655q2.m87172p0(objM87133R);
                    }
                    ProfileHeaderKt.ProfileHeader(metadataCopy$default, (Function1) objM87133R, null, c28655q2, 48, 4);
                    c28655q2.m87173q(false);
                }
            }), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3713c(i13, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileHeaderFoundingMemberPreview$lambda$1(int i13, Composer composer, int i14) {
        ProfileHeaderFoundingMemberPreview(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    public static final void ProfileHeaderLongTextPreview(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(131403965);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new InterfaceC4351m() { // from class: com.whoop.profile.view.ProfileHeaderKt$ProfileHeaderLongTextPreview$$inlined$WhoopPreviewTheme$1
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
                    c28655q2.m87150e0(-191585275);
                    ProfileViewState.Metadata metadataCopy$default = ProfileViewState.Metadata.copy$default(ProfileSamples.INSTANCE.getSampleProfileViewStateMetadataWithLongText(), null, true, null, null, null, null, false, 125, null);
                    Object objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new Function1() { // from class: com.whoop.profile.view.ProfileHeaderKt$ProfileHeaderLongTextPreview$1$1$1
                            public final void invoke(ProfileEvent it) {
                                AbstractC22676k.m65750j(it, "it");
                            }

                            @Override // p715kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((ProfileEvent) obj);
                                return C23454a0.f92919a;
                            }
                        };
                        c28655q2.m87172p0(objM87133R);
                    }
                    ProfileHeaderKt.ProfileHeader(metadataCopy$default, (Function1) objM87133R, null, c28655q2, 48, 4);
                    c28655q2.m87173q(false);
                }
            }), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3713c(i13, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileHeaderLongTextPreview$lambda$1(int i13, Composer composer, int i14) {
        ProfileHeaderLongTextPreview(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    public static final void ProfileHeaderOtherProfilePreview(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1730807661);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new InterfaceC4351m() { // from class: com.whoop.profile.view.ProfileHeaderKt$ProfileHeaderOtherProfilePreview$$inlined$WhoopPreviewTheme$1
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
                    c28655q2.m87150e0(1775826944);
                    ProfileViewState.Metadata metadataCopy$default = ProfileViewState.Metadata.copy$default(ProfileSamples.INSTANCE.getSampleProfileViewStateMetadata(), null, false, null, null, null, null, false, 125, null);
                    Object objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new Function1() { // from class: com.whoop.profile.view.ProfileHeaderKt$ProfileHeaderOtherProfilePreview$1$1$1
                            public final void invoke(ProfileEvent it) {
                                AbstractC22676k.m65750j(it, "it");
                            }

                            @Override // p715kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((ProfileEvent) obj);
                                return C23454a0.f92919a;
                            }
                        };
                        c28655q2.m87172p0(objM87133R);
                    }
                    ProfileHeaderKt.ProfileHeader(metadataCopy$default, (Function1) objM87133R, null, c28655q2, 48, 4);
                    c28655q2.m87173q(false);
                }
            }), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3713c(i13, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileHeaderOtherProfilePreview$lambda$1(int i13, Composer composer, int i14) {
        ProfileHeaderOtherProfilePreview(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    public static final void ProfileHeaderSelfProfilePreview(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1181400097);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new InterfaceC4351m() { // from class: com.whoop.profile.view.ProfileHeaderKt$ProfileHeaderSelfProfilePreview$$inlined$WhoopPreviewTheme$1
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
                    c28655q2.m87150e0(-76631851);
                    ProfileViewState.Metadata metadataCopy$default = ProfileViewState.Metadata.copy$default(ProfileSamples.INSTANCE.getSampleProfileViewStateMetadata(), null, true, null, null, null, null, false, 125, null);
                    Object objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new Function1() { // from class: com.whoop.profile.view.ProfileHeaderKt$ProfileHeaderSelfProfilePreview$1$1$1
                            public final void invoke(ProfileEvent it) {
                                AbstractC22676k.m65750j(it, "it");
                            }

                            @Override // p715kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((ProfileEvent) obj);
                                return C23454a0.f92919a;
                            }
                        };
                        c28655q2.m87172p0(objM87133R);
                    }
                    ProfileHeaderKt.ProfileHeader(metadataCopy$default, (Function1) objM87133R, null, c28655q2, 48, 4);
                    c28655q2.m87173q(false);
                }
            }), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3713c(i13, 22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileHeaderSelfProfilePreview$lambda$1(int i13, Composer composer, int i14) {
        ProfileHeaderSelfProfilePreview(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
