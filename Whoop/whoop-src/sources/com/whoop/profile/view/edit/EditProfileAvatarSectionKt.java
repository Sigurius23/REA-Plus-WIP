package com.whoop.profile.view.edit;

import a31.C0343e;
import a81.C0555f;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import b01.C2190k;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.data.local.room.dao.persistent.C6498i;
import com.whoop.design.models.modal.C8527a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.C9691R;
import com.whoop.profile.presentation.edit.EditProfileEvent;
import com.whoop.profile.presentation.edit.EditProfileViewState;
import com.whoop.profile.view.ProfileAvatarKt;
import gb1.AbstractC15676d;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import te0.AbstractC33745d;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\n\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;", "profileData", "Lkotlin/Function1;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;", "Ll83/a0;", "onEvent", "Lkotlin/Function0;", "onOpenAvatarEditor", "Landroidx/compose/ui/Modifier;", "modifier", "EditProfileAvatarSection", "(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "profile_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EditProfileAvatarSectionKt {
    /* JADX WARN: Code duplicated, block: B:103:0x024f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0293  */
    /* JADX WARN: Code duplicated, block: B:107:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:109:0x0310  */
    /* JADX WARN: Code duplicated, block: B:112:0x031d  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:64:0x0100  */
    /* JADX WARN: Code duplicated, block: B:68:0x012c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0130  */
    /* JADX WARN: Code duplicated, block: B:72:0x013d  */
    /* JADX WARN: Code duplicated, block: B:74:0x014b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0153  */
    /* JADX WARN: Code duplicated, block: B:81:0x015f  */
    /* JADX WARN: Code duplicated, block: B:84:0x01be  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01eb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:92:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:95:0x022c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0230  */
    /* JADX WARN: Code duplicated, block: B:99:0x023d  */
    public static final void EditProfileAvatarSection(EditProfileViewState.EditProfileData editProfileData, Function1 function1, InterfaceC4339a interfaceC4339a, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        int i16;
        Modifier modifier2;
        int i17;
        boolean z4;
        Function1 function2;
        InterfaceC4339a interfaceC4339a3;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        int i18;
        C28676v0 c28676v0;
        Function1 function3;
        InterfaceC4339a interfaceC4339a4;
        C2314t c2314t;
        Modifier modifier4;
        float f13;
        float f14;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        float f15;
        int iHashCode2;
        AbstractC22403o abstractC22403oM64503l;
        float f16;
        C38072d c38072d;
        int i19;
        Object objM87133R;
        boolean z13;
        Object objM87133R2;
        int iHashCode3;
        boolean z14;
        String avatarUrl;
        Object objM87133R3;
        Object objM87133R4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-757804025);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(editProfileData) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
            if ((i13 & 384) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q.m87157i(interfaceC4339a2) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    modifier2 = modifier;
                    if (c28655q.m87153g(modifier2)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i15 & 1155) != 1154) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    i18 = i14 & 2;
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C6498i(23);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function3 = (Function1) objM87133R4;
                    } else {
                        function3 = function1;
                    }
                    if (i24 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C8527a(11);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    c2314t = C2314t.f9131w;
                    if (i16 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    f13 = 16;
                    float f17 = (float) 2.5d;
                    float f18 = 8;
                    f14 = f17 * f18;
                    Modifier modifierM3396r = AbstractC1099a.m3396r(modifier4, f14, 0.0f, 2);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 48);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                    InterfaceC0221l.f734a.getClass();
                    Modifier modifier5 = modifier4;
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i2 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                    C0209i c0209i3 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        f15 = f13;
                    } else {
                        f15 = f13;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                        if (editProfileData != null || (avatarUrl = editProfileData.getAvatarUrl()) == null) {
                            abstractC22403oM64503l = null;
                        } else {
                            abstractC22403oM64503l = AbstractC22404p.m64503l(avatarUrl);
                        }
                        f16 = f15;
                        ProfileAvatarKt.ProfileAvatar(abstractC22403oM64503l, null, AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_avatar_content_description), c28655q, AbstractC22403o.f87638a, 2);
                        float f19 = 4;
                        Modifier modifierM44101d = AbstractC15676d.m44101d(AbstractC1102d.m3419p(12 * f19, AbstractC1099a.m3391m(C1100b.f4583a.mo3400a(c2314t, C2299e.f9106I), 6 * f19, 1 * f19)), "edit_profile_avatar_button");
                        c38072d = C38072d.f163053a;
                        i19 = C38072d.f163054b;
                        Modifier modifierM44455h = AbstractC15751g.m44455h(modifierM44101d, f17, c38072d.m121949b(c28655q, i19).getBackgroundDarkAlt(), AbstractC33253j.m105489e(f16));
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C2190k(f16, 1);
                            c28655q.m87172p0(objM87133R);
                        }
                        Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC1125a.m3478a(modifierM44455h, (Function1) objM87133R), EnumC39333f.WHITE_10.mo134584toComposableColorWaAFU9c(c28655q, 6), AbstractC33253j.m105489e(f16));
                        if ((i15 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z13 || objM87133R2 == c28676v0) {
                            objM87133R2 = new C0343e(interfaceC4339a4, 14);
                            c28655q.m87172p0(objM87133R2);
                        }
                        Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 1.5d) * f18, AbstractC1092a.m3362g(modifierM3358c, false, null, null, (InterfaceC4339a) objM87133R2, 15));
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
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
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAction().getPencil(), c28655q, 6), AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_avatar_button), AbstractC1102d.m3419p(f19 * f19, c2314t), c38072d.m121949b(c28655q, i19).getBrandWhite(), c28655q, 384, 0);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        if (editProfileData != null) {
                            AbstractC33745d.m106667z(c28655q, 1703115812, c2314t, f14, c28655q);
                            TextResource firstName = editProfileData.getFirstName();
                            int i25 = TextResource.$stable;
                            z14 = true;
                            AbstractC30795n.m94707h(AbstractC18489d0.m53370k(AbstractC8693b.m21274h(firstName, c28655q, i25), " ", AbstractC8693b.m21274h(editProfileData.getLastName(), c28655q, i25)), null, c38072d.m121949b(c28655q, i19).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getT2(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            z14 = true;
                            c28655q.m87150e0(1703455045);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z14);
                        interfaceC4339a3 = interfaceC4339a4;
                        function2 = function3;
                        modifier3 = modifier5;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    C0209i c0209i5 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N4);
                    if (editProfileData != null) {
                        abstractC22403oM64503l = null;
                    } else {
                        abstractC22403oM64503l = null;
                    }
                    f16 = f15;
                    ProfileAvatarKt.ProfileAvatar(abstractC22403oM64503l, null, AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_avatar_content_description), c28655q, AbstractC22403o.f87638a, 2);
                    float f110 = 4;
                    Modifier modifierM44101d2 = AbstractC15676d.m44101d(AbstractC1102d.m3419p(12 * f110, AbstractC1099a.m3391m(C1100b.f4583a.mo3400a(c2314t, C2299e.f9106I), 6 * f110, 1 * f110)), "edit_profile_avatar_button");
                    c38072d = C38072d.f163053a;
                    i19 = C38072d.f163054b;
                    Modifier modifierM44455h2 = AbstractC15751g.m44455h(modifierM44101d2, f17, c38072d.m121949b(c28655q, i19).getBackgroundDarkAlt(), AbstractC33253j.m105489e(f16));
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C2190k(f16, 1);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifierM3358c2 = AbstractC1092a.m3358c(AbstractC1125a.m3478a(modifierM44455h2, (Function1) objM87133R), EnumC39333f.WHITE_10.mo134584toComposableColorWaAFU9c(c28655q, 6), AbstractC33253j.m105489e(f16));
                    if ((i15 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z13) {
                        objM87133R2 = new C0343e(interfaceC4339a4, 14);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C0343e(interfaceC4339a4, 14);
                        c28655q.m87172p0(objM87133R2);
                    }
                    Modifier modifierM3394p2 = AbstractC1099a.m3394p(((float) 1.5d) * f18, AbstractC1092a.m3362g(modifierM3358c2, false, null, null, (InterfaceC4339a) objM87133R2, 15));
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d4);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m5);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N5);
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAction().getPencil(), c28655q, 6), AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_avatar_button), AbstractC1102d.m3419p(f110 * f110, c2314t), c38072d.m121949b(c28655q, i19).getBrandWhite(), c28655q, 384, 0);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    if (editProfileData != null) {
                        AbstractC33745d.m106667z(c28655q, 1703115812, c2314t, f14, c28655q);
                        TextResource firstName2 = editProfileData.getFirstName();
                        int i26 = TextResource.$stable;
                        z14 = true;
                        AbstractC30795n.m94707h(AbstractC18489d0.m53370k(AbstractC8693b.m21274h(firstName2, c28655q, i26), " ", AbstractC8693b.m21274h(editProfileData.getLastName(), c28655q, i26)), null, c38072d.m121949b(c28655q, i19).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getT2(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        z14 = true;
                        c28655q.m87150e0(1703455045);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z14);
                    interfaceC4339a3 = interfaceC4339a4;
                    function2 = function3;
                    modifier3 = modifier5;
                } else {
                    c28655q.m87138X();
                    function2 = function1;
                    interfaceC4339a3 = interfaceC4339a2;
                    modifier3 = modifier2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0555f(editProfileData, function2, interfaceC4339a3, modifier3, i13, i14, 14);
                }
            }
            i15 |= 3072;
            modifier2 = modifier;
            if ((i15 & 1155) != 1154) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                i18 = i14 & 2;
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C6498i(23);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function3 = (Function1) objM87133R4;
                } else {
                    function3 = function1;
                }
                if (i24 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C8527a(11);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                f13 = 16;
                float f111 = (float) 2.5d;
                float f112 = 8;
                f14 = f111 * f112;
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(modifier4, f14, 0.0f, 2);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
                InterfaceC0221l.f734a.getClass();
                Modifier modifier6 = modifier4;
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i6 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a2);
                C0209i c0209i7 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m6);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    f15 = f13;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i8 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N6);
                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d5);
                    AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m7);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N7);
                    if (editProfileData != null) {
                        abstractC22403oM64503l = null;
                    } else {
                        abstractC22403oM64503l = null;
                    }
                    f16 = f15;
                    ProfileAvatarKt.ProfileAvatar(abstractC22403oM64503l, null, AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_avatar_content_description), c28655q, AbstractC22403o.f87638a, 2);
                    float f113 = 4;
                    Modifier modifierM44101d3 = AbstractC15676d.m44101d(AbstractC1102d.m3419p(12 * f113, AbstractC1099a.m3391m(C1100b.f4583a.mo3400a(c2314t, C2299e.f9106I), 6 * f113, 1 * f113)), "edit_profile_avatar_button");
                    c38072d = C38072d.f163053a;
                    i19 = C38072d.f163054b;
                    Modifier modifierM44455h3 = AbstractC15751g.m44455h(modifierM44101d3, f111, c38072d.m121949b(c28655q, i19).getBackgroundDarkAlt(), AbstractC33253j.m105489e(f16));
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C2190k(f16, 1);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifierM3358c3 = AbstractC1092a.m3358c(AbstractC1125a.m3478a(modifierM44455h3, (Function1) objM87133R), EnumC39333f.WHITE_10.mo134584toComposableColorWaAFU9c(c28655q, 6), AbstractC33253j.m105489e(f16));
                    if ((i15 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z13) {
                        objM87133R2 = new C0343e(interfaceC4339a4, 14);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C0343e(interfaceC4339a4, 14);
                        c28655q.m87172p0(objM87133R2);
                    }
                    Modifier modifierM3394p3 = AbstractC1099a.m3394p(((float) 1.5d) * f112, AbstractC1092a.m3362g(modifierM3358c3, false, null, null, (InterfaceC4339a) objM87133R2, 15));
                    InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3394p3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d6);
                    AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m8);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N8);
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAction().getPencil(), c28655q, 6), AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_avatar_button), AbstractC1102d.m3419p(f113 * f113, c2314t), c38072d.m121949b(c28655q, i19).getBrandWhite(), c28655q, 384, 0);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    if (editProfileData != null) {
                        AbstractC33745d.m106667z(c28655q, 1703115812, c2314t, f14, c28655q);
                        TextResource firstName3 = editProfileData.getFirstName();
                        int i27 = TextResource.$stable;
                        z14 = true;
                        AbstractC30795n.m94707h(AbstractC18489d0.m53370k(AbstractC8693b.m21274h(firstName3, c28655q, i27), " ", AbstractC8693b.m21274h(editProfileData.getLastName(), c28655q, i27)), null, c38072d.m121949b(c28655q, i19).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getT2(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        z14 = true;
                        c28655q.m87150e0(1703455045);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z14);
                    interfaceC4339a3 = interfaceC4339a4;
                    function2 = function3;
                    modifier3 = modifier6;
                } else {
                    f15 = f13;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i9 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d7);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m9);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N9);
                if (editProfileData != null) {
                    abstractC22403oM64503l = null;
                } else {
                    abstractC22403oM64503l = null;
                }
                f16 = f15;
                ProfileAvatarKt.ProfileAvatar(abstractC22403oM64503l, null, AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_avatar_content_description), c28655q, AbstractC22403o.f87638a, 2);
                float f114 = 4;
                Modifier modifierM44101d4 = AbstractC15676d.m44101d(AbstractC1102d.m3419p(12 * f114, AbstractC1099a.m3391m(C1100b.f4583a.mo3400a(c2314t, C2299e.f9106I), 6 * f114, 1 * f114)), "edit_profile_avatar_button");
                c38072d = C38072d.f163053a;
                i19 = C38072d.f163054b;
                Modifier modifierM44455h4 = AbstractC15751g.m44455h(modifierM44101d4, f111, c38072d.m121949b(c28655q, i19).getBackgroundDarkAlt(), AbstractC33253j.m105489e(f16));
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C2190k(f16, 1);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3358c4 = AbstractC1092a.m3358c(AbstractC1125a.m3478a(modifierM44455h4, (Function1) objM87133R), EnumC39333f.WHITE_10.mo134584toComposableColorWaAFU9c(c28655q, 6), AbstractC33253j.m105489e(f16));
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z13) {
                    objM87133R2 = new C0343e(interfaceC4339a4, 14);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C0343e(interfaceC4339a4, 14);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM3394p4 = AbstractC1099a.m3394p(((float) 1.5d) * f112, AbstractC1092a.m3362g(modifierM3358c4, false, null, null, (InterfaceC4339a) objM87133R2, 15));
                InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3394p4);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d8);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m10);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N10);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAction().getPencil(), c28655q, 6), AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_avatar_button), AbstractC1102d.m3419p(f114 * f114, c2314t), c38072d.m121949b(c28655q, i19).getBrandWhite(), c28655q, 384, 0);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                if (editProfileData != null) {
                    AbstractC33745d.m106667z(c28655q, 1703115812, c2314t, f14, c28655q);
                    TextResource firstName4 = editProfileData.getFirstName();
                    int i28 = TextResource.$stable;
                    z14 = true;
                    AbstractC30795n.m94707h(AbstractC18489d0.m53370k(AbstractC8693b.m21274h(firstName4, c28655q, i28), " ", AbstractC8693b.m21274h(editProfileData.getLastName(), c28655q, i28)), null, c38072d.m121949b(c28655q, i19).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getT2(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    z14 = true;
                    c28655q.m87150e0(1703455045);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z14);
                interfaceC4339a3 = interfaceC4339a4;
                function2 = function3;
                modifier3 = modifier6;
            } else {
                c28655q.m87138X();
                function2 = function1;
                interfaceC4339a3 = interfaceC4339a2;
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0555f(editProfileData, function2, interfaceC4339a3, modifier3, i13, i14, 14);
            }
        }
        i15 |= 384;
        interfaceC4339a2 = interfaceC4339a;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                modifier2 = modifier;
                if (c28655q.m87153g(modifier2)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i15 & 1155) != 1154) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                i18 = i14 & 2;
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C6498i(23);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function3 = (Function1) objM87133R4;
                } else {
                    function3 = function1;
                }
                if (i24 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C8527a(11);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                f13 = 16;
                float f115 = (float) 2.5d;
                float f116 = 8;
                f14 = f115 * f116;
                Modifier modifierM3396r3 = AbstractC1099a.m3396r(modifier4, f14, 0.0f, 2);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3396r3);
                InterfaceC0221l.f734a.getClass();
                Modifier modifier7 = modifier4;
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i10 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i10, c23010xM66775a3);
                C0209i c0209i11 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m11);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    f15 = f13;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i12 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N11);
                    InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC39127r0M66763d9);
                    AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m12);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N12);
                    if (editProfileData != null) {
                        abstractC22403oM64503l = null;
                    } else {
                        abstractC22403oM64503l = null;
                    }
                    f16 = f15;
                    ProfileAvatarKt.ProfileAvatar(abstractC22403oM64503l, null, AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_avatar_content_description), c28655q, AbstractC22403o.f87638a, 2);
                    float f117 = 4;
                    Modifier modifierM44101d5 = AbstractC15676d.m44101d(AbstractC1102d.m3419p(12 * f117, AbstractC1099a.m3391m(C1100b.f4583a.mo3400a(c2314t, C2299e.f9106I), 6 * f117, 1 * f117)), "edit_profile_avatar_button");
                    c38072d = C38072d.f163053a;
                    i19 = C38072d.f163054b;
                    Modifier modifierM44455h5 = AbstractC15751g.m44455h(modifierM44101d5, f115, c38072d.m121949b(c28655q, i19).getBackgroundDarkAlt(), AbstractC33253j.m105489e(f16));
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C2190k(f16, 1);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifierM3358c5 = AbstractC1092a.m3358c(AbstractC1125a.m3478a(modifierM44455h5, (Function1) objM87133R), EnumC39333f.WHITE_10.mo134584toComposableColorWaAFU9c(c28655q, 6), AbstractC33253j.m105489e(f16));
                    if ((i15 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z13) {
                        objM87133R2 = new C0343e(interfaceC4339a4, 14);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C0343e(interfaceC4339a4, 14);
                        c28655q.m87172p0(objM87133R2);
                    }
                    Modifier modifierM3394p5 = AbstractC1099a.m3394p(((float) 1.5d) * f116, AbstractC1092a.m3362g(modifierM3358c5, false, null, null, (InterfaceC4339a) objM87133R2, 15));
                    InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierM3394p5);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC39127r0M66763d10);
                    AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m13);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N13);
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAction().getPencil(), c28655q, 6), AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_avatar_button), AbstractC1102d.m3419p(f117 * f117, c2314t), c38072d.m121949b(c28655q, i19).getBrandWhite(), c28655q, 384, 0);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    if (editProfileData != null) {
                        AbstractC33745d.m106667z(c28655q, 1703115812, c2314t, f14, c28655q);
                        TextResource firstName5 = editProfileData.getFirstName();
                        int i29 = TextResource.$stable;
                        z14 = true;
                        AbstractC30795n.m94707h(AbstractC18489d0.m53370k(AbstractC8693b.m21274h(firstName5, c28655q, i29), " ", AbstractC8693b.m21274h(editProfileData.getLastName(), c28655q, i29)), null, c38072d.m121949b(c28655q, i19).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getT2(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        z14 = true;
                        c28655q.m87150e0(1703455045);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z14);
                    interfaceC4339a3 = interfaceC4339a4;
                    function2 = function3;
                    modifier3 = modifier7;
                } else {
                    f15 = f13;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i13 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N11);
                InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC39127r0M66763d11);
                AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m14);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N14);
                if (editProfileData != null) {
                    abstractC22403oM64503l = null;
                } else {
                    abstractC22403oM64503l = null;
                }
                f16 = f15;
                ProfileAvatarKt.ProfileAvatar(abstractC22403oM64503l, null, AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_avatar_content_description), c28655q, AbstractC22403o.f87638a, 2);
                float f118 = 4;
                Modifier modifierM44101d6 = AbstractC15676d.m44101d(AbstractC1102d.m3419p(12 * f118, AbstractC1099a.m3391m(C1100b.f4583a.mo3400a(c2314t, C2299e.f9106I), 6 * f118, 1 * f118)), "edit_profile_avatar_button");
                c38072d = C38072d.f163053a;
                i19 = C38072d.f163054b;
                Modifier modifierM44455h6 = AbstractC15751g.m44455h(modifierM44101d6, f115, c38072d.m121949b(c28655q, i19).getBackgroundDarkAlt(), AbstractC33253j.m105489e(f16));
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C2190k(f16, 1);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3358c6 = AbstractC1092a.m3358c(AbstractC1125a.m3478a(modifierM44455h6, (Function1) objM87133R), EnumC39333f.WHITE_10.mo134584toComposableColorWaAFU9c(c28655q, 6), AbstractC33253j.m105489e(f16));
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z13) {
                    objM87133R2 = new C0343e(interfaceC4339a4, 14);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C0343e(interfaceC4339a4, 14);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM3394p6 = AbstractC1099a.m3394p(((float) 1.5d) * f116, AbstractC1092a.m3362g(modifierM3358c6, false, null, null, (InterfaceC4339a) objM87133R2, 15));
                InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM3394p6);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC39127r0M66763d12);
                AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m15);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N15);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAction().getPencil(), c28655q, 6), AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_avatar_button), AbstractC1102d.m3419p(f118 * f118, c2314t), c38072d.m121949b(c28655q, i19).getBrandWhite(), c28655q, 384, 0);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                if (editProfileData != null) {
                    AbstractC33745d.m106667z(c28655q, 1703115812, c2314t, f14, c28655q);
                    TextResource firstName6 = editProfileData.getFirstName();
                    int i210 = TextResource.$stable;
                    z14 = true;
                    AbstractC30795n.m94707h(AbstractC18489d0.m53370k(AbstractC8693b.m21274h(firstName6, c28655q, i210), " ", AbstractC8693b.m21274h(editProfileData.getLastName(), c28655q, i210)), null, c38072d.m121949b(c28655q, i19).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getT2(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    z14 = true;
                    c28655q.m87150e0(1703455045);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z14);
                interfaceC4339a3 = interfaceC4339a4;
                function2 = function3;
                modifier3 = modifier7;
            } else {
                c28655q.m87138X();
                function2 = function1;
                interfaceC4339a3 = interfaceC4339a2;
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0555f(editProfileData, function2, interfaceC4339a3, modifier3, i13, i14, 14);
            }
        }
        i15 |= 3072;
        modifier2 = modifier;
        if ((i15 & 1155) != 1154) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            i18 = i14 & 2;
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C6498i(23);
                    c28655q.m87172p0(objM87133R4);
                }
                function3 = (Function1) objM87133R4;
            } else {
                function3 = function1;
            }
            if (i24 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C8527a(11);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            f13 = 16;
            float f119 = (float) 2.5d;
            float f1110 = 8;
            f14 = f119 * f1110;
            Modifier modifierM3396r4 = AbstractC1099a.m3396r(modifier4, f14, 0.0f, 2);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 48);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
            Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM3396r4);
            InterfaceC0221l.f734a.getClass();
            Modifier modifier8 = modifier4;
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i14 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i14, c23010xM66775a4);
            C0209i c0209i15 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m16);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                f15 = f13;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i16 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N16);
                InterfaceC39127r0 interfaceC39127r0M66763d13 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q.m87165m();
                Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC39127r0M66763d13);
                AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m17);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N17);
                if (editProfileData != null) {
                    abstractC22403oM64503l = null;
                } else {
                    abstractC22403oM64503l = null;
                }
                f16 = f15;
                ProfileAvatarKt.ProfileAvatar(abstractC22403oM64503l, null, AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_avatar_content_description), c28655q, AbstractC22403o.f87638a, 2);
                float f1111 = 4;
                Modifier modifierM44101d7 = AbstractC15676d.m44101d(AbstractC1102d.m3419p(12 * f1111, AbstractC1099a.m3391m(C1100b.f4583a.mo3400a(c2314t, C2299e.f9106I), 6 * f1111, 1 * f1111)), "edit_profile_avatar_button");
                c38072d = C38072d.f163053a;
                i19 = C38072d.f163054b;
                Modifier modifierM44455h7 = AbstractC15751g.m44455h(modifierM44101d7, f119, c38072d.m121949b(c28655q, i19).getBackgroundDarkAlt(), AbstractC33253j.m105489e(f16));
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C2190k(f16, 1);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3358c7 = AbstractC1092a.m3358c(AbstractC1125a.m3478a(modifierM44455h7, (Function1) objM87133R), EnumC39333f.WHITE_10.mo134584toComposableColorWaAFU9c(c28655q, 6), AbstractC33253j.m105489e(f16));
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z13) {
                    objM87133R2 = new C0343e(interfaceC4339a4, 14);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C0343e(interfaceC4339a4, 14);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM3394p7 = AbstractC1099a.m3394p(((float) 1.5d) * f1110, AbstractC1092a.m3362g(modifierM3358c7, false, null, null, (InterfaceC4339a) objM87133R2, 15));
                InterfaceC39127r0 interfaceC39127r0M66763d14 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q.m87165m();
                Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q, modifierM3394p7);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC39127r0M66763d14);
                AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m18);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N18);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAction().getPencil(), c28655q, 6), AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_avatar_button), AbstractC1102d.m3419p(f1111 * f1111, c2314t), c38072d.m121949b(c28655q, i19).getBrandWhite(), c28655q, 384, 0);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                if (editProfileData != null) {
                    AbstractC33745d.m106667z(c28655q, 1703115812, c2314t, f14, c28655q);
                    TextResource firstName7 = editProfileData.getFirstName();
                    int i211 = TextResource.$stable;
                    z14 = true;
                    AbstractC30795n.m94707h(AbstractC18489d0.m53370k(AbstractC8693b.m21274h(firstName7, c28655q, i211), " ", AbstractC8693b.m21274h(editProfileData.getLastName(), c28655q, i211)), null, c38072d.m121949b(c28655q, i19).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getT2(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    z14 = true;
                    c28655q.m87150e0(1703455045);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z14);
                interfaceC4339a3 = interfaceC4339a4;
                function2 = function3;
                modifier3 = modifier8;
            } else {
                f15 = f13;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i17 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N16);
            InterfaceC39127r0 interfaceC39127r0M66763d15 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q.m87165m();
            Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC39127r0M66763d15);
            AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m19);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N19);
            if (editProfileData != null) {
                abstractC22403oM64503l = null;
            } else {
                abstractC22403oM64503l = null;
            }
            f16 = f15;
            ProfileAvatarKt.ProfileAvatar(abstractC22403oM64503l, null, AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_avatar_content_description), c28655q, AbstractC22403o.f87638a, 2);
            float f1112 = 4;
            Modifier modifierM44101d8 = AbstractC15676d.m44101d(AbstractC1102d.m3419p(12 * f1112, AbstractC1099a.m3391m(C1100b.f4583a.mo3400a(c2314t, C2299e.f9106I), 6 * f1112, 1 * f1112)), "edit_profile_avatar_button");
            c38072d = C38072d.f163053a;
            i19 = C38072d.f163054b;
            Modifier modifierM44455h8 = AbstractC15751g.m44455h(modifierM44101d8, f119, c38072d.m121949b(c28655q, i19).getBackgroundDarkAlt(), AbstractC33253j.m105489e(f16));
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = new C2190k(f16, 1);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3358c8 = AbstractC1092a.m3358c(AbstractC1125a.m3478a(modifierM44455h8, (Function1) objM87133R), EnumC39333f.WHITE_10.mo134584toComposableColorWaAFU9c(c28655q, 6), AbstractC33253j.m105489e(f16));
            if ((i15 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R2 = c28655q.m87133R();
            if (z13) {
                objM87133R2 = new C0343e(interfaceC4339a4, 14);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C0343e(interfaceC4339a4, 14);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM3394p8 = AbstractC1099a.m3394p(((float) 1.5d) * f1110, AbstractC1092a.m3362g(modifierM3358c8, false, null, null, (InterfaceC4339a) objM87133R2, 15));
            InterfaceC39127r0 interfaceC39127r0M66763d16 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q.m87165m();
            Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q, modifierM3394p8);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC39127r0M66763d16);
            AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m110);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N110);
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAction().getPencil(), c28655q, 6), AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_avatar_button), AbstractC1102d.m3419p(f1112 * f1112, c2314t), c38072d.m121949b(c28655q, i19).getBrandWhite(), c28655q, 384, 0);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            if (editProfileData != null) {
                AbstractC33745d.m106667z(c28655q, 1703115812, c2314t, f14, c28655q);
                TextResource firstName8 = editProfileData.getFirstName();
                int i212 = TextResource.$stable;
                z14 = true;
                AbstractC30795n.m94707h(AbstractC18489d0.m53370k(AbstractC8693b.m21274h(firstName8, c28655q, i212), " ", AbstractC8693b.m21274h(editProfileData.getLastName(), c28655q, i212)), null, c38072d.m121949b(c28655q, i19).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getT2(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                z14 = true;
                c28655q.m87150e0(1703455045);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z14);
            interfaceC4339a3 = interfaceC4339a4;
            function2 = function3;
            modifier3 = modifier8;
        } else {
            c28655q.m87138X();
            function2 = function1;
            interfaceC4339a3 = interfaceC4339a2;
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0555f(editProfileData, function2, interfaceC4339a3, modifier3, i13, i14, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileAvatarSection$lambda$0$0(EditProfileEvent.ViewEvent it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileAvatarSection$lambda$2$0$0$0(float f13, InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        long jMo134585toTestableColor0d7_KjU = EnumC39333f.BACKGROUND_DARK_ALT.getColor();
        float fMo743q0 = drawBehind.mo743q0(f13);
        InterfaceC22131e.m63374D(drawBehind, jMo134585toTestableColor0d7_KjU, 0L, 0L, (((long) Float.floatToRawIntBits(fMo743q0)) << 32) | (((long) Float.floatToRawIntBits(fMo743q0)) & 4294967295L), null, 0.0f, 246);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileAvatarSection$lambda$2$0$1$0(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileAvatarSection$lambda$3(EditProfileViewState.EditProfileData editProfileData, Function1 function1, InterfaceC4339a interfaceC4339a, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        EditProfileAvatarSection(editProfileData, function1, interfaceC4339a, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
