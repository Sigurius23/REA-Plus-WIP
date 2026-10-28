package com.whoop.profile.view.edit.avatar;

import a31.C0343e;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b30.C2663y4;
import b91.AbstractC2890e;
import b91.C2886a;
import bf0.C3195g;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.C9691R;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27271o0;
import p000.AbstractC11266d;
import p000.C21061j;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18041w;
import p209i3.InterfaceC18044z;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aU\u0010\b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lkotlin/Function0;", "Ll83/a0;", "onTakePhoto", "onSelectFromGallery", "onCancel", "", "hasExistingAvatar", "onDeletePhoto", "PhotoSourceActionSheet", "(Lc93/a;Lc93/a;Lc93/a;ZLc93/a;Landroidx/compose/runtime/Composer;II)V", "", "text", "Lgz0/m0;", "icon", "onClick", "PhotoActionButton", "(Ljava/lang/String;Lgz0/m0;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "profile_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class PhotoSourceActionSheetKt {
    private static final void PhotoActionButton(String str, EnumC16313m0 enumC16313m0, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        int i15;
        boolean z4;
        String str2 = str;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-726898053);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(str2) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87149e(enumC16313m0 == null ? -1 : enumC16313m0.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            boolean z13 = (i14 & 896) == 256;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z13 || objM87133R == c28676v0) {
                objM87133R = new C0343e(interfaceC4339a, 15);
                c28655q.m87172p0(objM87133R);
            }
            float f13 = 4;
            Modifier modifierM53364e = AbstractC18489d0.m53364e(AbstractC1092a.m3362g(modifierM3409f, false, null, null, (InterfaceC4339a) objM87133R, 15), 3, f13);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            float f14 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f14, AbstractC1092a.m3358c(modifierM53364e, c38072d.m121949b(c28655q, i16).getWhite10(), AbstractC17918w0.f69621a));
            int i17 = i14 & 14;
            boolean z14 = i17 == 4;
            Object objM87133R2 = c28655q.m87133R();
            if (z14 || objM87133R2 == c28676v0) {
                objM87133R2 = new C2663y4(str2, 8);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM51775c = AbstractC18032n.m51775c(modifierM3394p, false, (Function1) objM87133R2);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM51775c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            if (enumC16313m0 == null) {
                c28655q.m87150e0(1995449240);
                c28655q.m87173q(false);
                i15 = i16;
                z4 = true;
            } else {
                i15 = i16;
                AbstractC15005f3.m43108b(AbstractC18489d0.m53378s(c28655q, 1995449241, enumC16313m0, c28655q, 6), "", AbstractC1102d.m3419p(6 * f13, c2314t), c38072d.m121949b(c28655q, i15).getWhite50(), c28655q, 432, 0);
                z4 = true;
                AbstractC31061c.m95650z(1, f14, c2314t, c28655q, false);
            }
            str2 = str;
            AbstractC30795n.m94707h(str2, null, c38072d.m121949b(c28655q, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, AbstractC2890e.m8450e().getH5(), null, c28655q, i17, (C2886a.f11498d << 18) | 3120, 186362);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21061j(i13, interfaceC4339a, enumC16313m0, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 PhotoActionButton$lambda$0$0(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 PhotoActionButton$lambda$1$0(String str, InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        AbstractC18041w.m51806e(str, semantics);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 PhotoActionButton$lambda$3(String str, EnumC16313m0 enumC16313m0, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        PhotoActionButton(str, enumC16313m0, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x0091  */
    /* JADX WARN: Code duplicated, block: B:49:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x009e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00de  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:66:0x0103  */
    /* JADX WARN: Code duplicated, block: B:69:0x013a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x0157  */
    /* JADX WARN: Code duplicated, block: B:73:0x019e  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    public static final void PhotoSourceActionSheet(InterfaceC4339a onTakePhoto, InterfaceC4339a onSelectFromGallery, InterfaceC4339a onCancel, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        int i16;
        InterfaceC4339a interfaceC4339a2;
        int i17;
        boolean z14;
        boolean z15;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        boolean z16;
        InterfaceC4339a interfaceC4339a4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        AbstractC22676k.m65750j(onTakePhoto, "onTakePhoto");
        AbstractC22676k.m65750j(onSelectFromGallery, "onSelectFromGallery");
        AbstractC22676k.m65750j(onCancel, "onCancel");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-820982425);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(onTakePhoto) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onSelectFromGallery) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onCancel) ? 256 : 128;
        }
        int i18 = i14 & 8;
        if (i18 == 0) {
            if ((i13 & 3072) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                if ((i15 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    if (i18 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if (i16 != 0) {
                        interfaceC4339a4 = null;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    C2314t c2314t = C2314t.f9131w;
                    float f13 = 8;
                    Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 2 * f13, 1);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    PhotoActionButton(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_avatar_take_photo), EnumC16313m0.CAMERA, onTakePhoto, c28655q, ((i15 << 6) & 896) | 48);
                    float f14 = ((float) 1.5d) * f13;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
                    PhotoActionButton(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_avatar_select_library), EnumC16313m0.LIST, onSelectFromGallery, c28655q, ((i15 << 3) & 896) | 48);
                    if (z16 || interfaceC4339a4 == null) {
                        c28655q.m87150e0(798477253);
                        c28655q.m87173q(false);
                    } else {
                        AbstractC31061c.m95623C(c28655q, 798207212, c2314t, f14, c28655q);
                        PhotoActionButton(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_avatar_delete_photo), EnumC16313m0.DELETE, interfaceC4339a4, c28655q, ((i15 >> 6) & 896) | 48);
                        c28655q.m87173q(false);
                    }
                    AbstractC18489d0.m53380u(4, f13, c2314t, c28655q);
                    AbstractC27271o0.m82253b(AbstractC1102d.m3409f(1.0f, c2314t), false, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_avatar_cancel)), null, null, null, null, null, false, null, onCancel, c28655q, (TextResource.$stable << 6) | 6, (i15 >> 6) & 14, MessageListItemViewType.POLL);
                    c28655q.m87173q(true);
                    z15 = z16;
                    interfaceC4339a3 = interfaceC4339a4;
                } else {
                    c28655q.m87138X();
                    z15 = z13;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3195g(onTakePhoto, onSelectFromGallery, onCancel, z15, interfaceC4339a3, i13, i14, 3);
                }
            }
            i15 |= 24576;
            interfaceC4339a2 = interfaceC4339a;
            if ((i15 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i18 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if (i16 != 0) {
                    interfaceC4339a4 = null;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                C2314t c2314t2 = C2314t.f9131w;
                float f15 = 8;
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), 0.0f, 2 * f15, 1);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                PhotoActionButton(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_avatar_take_photo), EnumC16313m0.CAMERA, onTakePhoto, c28655q, ((i15 << 6) & 896) | 48);
                float f16 = ((float) 1.5d) * f15;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f16, c2314t2));
                PhotoActionButton(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_avatar_select_library), EnumC16313m0.LIST, onSelectFromGallery, c28655q, ((i15 << 3) & 896) | 48);
                if (z16) {
                    c28655q.m87150e0(798477253);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(798477253);
                    c28655q.m87173q(false);
                }
                AbstractC18489d0.m53380u(4, f15, c2314t2, c28655q);
                AbstractC27271o0.m82253b(AbstractC1102d.m3409f(1.0f, c2314t2), false, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_avatar_cancel)), null, null, null, null, null, false, null, onCancel, c28655q, (TextResource.$stable << 6) | 6, (i15 >> 6) & 14, MessageListItemViewType.POLL);
                c28655q.m87173q(true);
                z15 = z16;
                interfaceC4339a3 = interfaceC4339a4;
            } else {
                c28655q.m87138X();
                z15 = z13;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3195g(onTakePhoto, onSelectFromGallery, onCancel, z15, interfaceC4339a3, i13, i14, 3);
            }
        }
        i15 |= 3072;
        z13 = z4;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a2)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            if ((i15 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i18 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if (i16 != 0) {
                    interfaceC4339a4 = null;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                C2314t c2314t3 = C2314t.f9131w;
                float f17 = 8;
                Modifier modifierM3396r3 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t3), 0.0f, 2 * f17, 1);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3396r3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                PhotoActionButton(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_avatar_take_photo), EnumC16313m0.CAMERA, onTakePhoto, c28655q, ((i15 << 6) & 896) | 48);
                float f18 = ((float) 1.5d) * f17;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f18, c2314t3));
                PhotoActionButton(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_avatar_select_library), EnumC16313m0.LIST, onSelectFromGallery, c28655q, ((i15 << 3) & 896) | 48);
                if (z16) {
                    c28655q.m87150e0(798477253);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(798477253);
                    c28655q.m87173q(false);
                }
                AbstractC18489d0.m53380u(4, f17, c2314t3, c28655q);
                AbstractC27271o0.m82253b(AbstractC1102d.m3409f(1.0f, c2314t3), false, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_avatar_cancel)), null, null, null, null, null, false, null, onCancel, c28655q, (TextResource.$stable << 6) | 6, (i15 >> 6) & 14, MessageListItemViewType.POLL);
                c28655q.m87173q(true);
                z15 = z16;
                interfaceC4339a3 = interfaceC4339a4;
            } else {
                c28655q.m87138X();
                z15 = z13;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3195g(onTakePhoto, onSelectFromGallery, onCancel, z15, interfaceC4339a3, i13, i14, 3);
            }
        }
        i15 |= 24576;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            if (i18 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            if (i16 != 0) {
                interfaceC4339a4 = null;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            C2314t c2314t4 = C2314t.f9131w;
            float f19 = 8;
            Modifier modifierM3396r4 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t4), 0.0f, 2 * f19, 1);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3396r4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            PhotoActionButton(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_avatar_take_photo), EnumC16313m0.CAMERA, onTakePhoto, c28655q, ((i15 << 6) & 896) | 48);
            float f110 = ((float) 1.5d) * f19;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f110, c2314t4));
            PhotoActionButton(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_avatar_select_library), EnumC16313m0.LIST, onSelectFromGallery, c28655q, ((i15 << 3) & 896) | 48);
            if (z16) {
                c28655q.m87150e0(798477253);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(798477253);
                c28655q.m87173q(false);
            }
            AbstractC18489d0.m53380u(4, f19, c2314t4, c28655q);
            AbstractC27271o0.m82253b(AbstractC1102d.m3409f(1.0f, c2314t4), false, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_avatar_cancel)), null, null, null, null, null, false, null, onCancel, c28655q, (TextResource.$stable << 6) | 6, (i15 >> 6) & 14, MessageListItemViewType.POLL);
            c28655q.m87173q(true);
            z15 = z16;
            interfaceC4339a3 = interfaceC4339a4;
        } else {
            c28655q.m87138X();
            z15 = z13;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3195g(onTakePhoto, onSelectFromGallery, onCancel, z15, interfaceC4339a3, i13, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 PhotoSourceActionSheet$lambda$1(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, boolean z4, InterfaceC4339a interfaceC4339a4, int i13, int i14, Composer composer, int i15) {
        PhotoSourceActionSheet(interfaceC4339a, interfaceC4339a2, interfaceC4339a3, z4, interfaceC4339a4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
