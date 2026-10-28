package com.whoop.profile.view.edit.form;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b01.C2193n;
import b91.C2886a;
import bf0.C3195g;
import bs1.C3590i;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.domain.model.UnitSystem;
import com.whoop.domain.model.UnitSystemExtKt;
import com.whoop.profile.C9691R;
import com.whoop.profile.presentation.edit.EditProfileViewState;
import d21.C11503a;
import gb1.AbstractC15676d;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import l83.C23465k;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p163g1.C15043i8;
import p163g1.C15197y1;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p209i3.C18027i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import qz0.AbstractC30785d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39420x;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a]\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u00042\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001aM\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a7\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00102\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001c²\u0006\u000e\u0010\u001b\u001a\u00020\u001a8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;", "groupedField", "Lkotlin/Function2;", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;", "", "Ll83/a0;", "onOpenBottomSheet", "Lkotlin/Function1;", "onUnitSystemChanged", "", "isEnabled", "HeightWeightGroupedFormField", "(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;Lc93/m;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "value", "Lkotlin/Function0;", "onClick", "unit", "isError", "ClickableFormFieldContent", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lc93/a;Ljava/lang/String;ZZLandroidx/compose/runtime/Composer;II)V", "text", "isSelected", "UnitToggleButton", "(Ljava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/domain/model/UnitSystem;", "selectedUnitSystem", "profile_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class HeightWeightGroupedFormFieldKt {
    /* JADX WARN: Code duplicated, block: B:101:0x0238  */
    /* JADX WARN: Code duplicated, block: B:102:0x023c  */
    /* JADX WARN: Code duplicated, block: B:105:0x024f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0260  */
    /* JADX WARN: Code duplicated, block: B:112:0x0293  */
    /* JADX WARN: Code duplicated, block: B:113:0x0297  */
    /* JADX WARN: Code duplicated, block: B:116:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:118:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:121:0x0306  */
    /* JADX WARN: Code duplicated, block: B:123:0x034d  */
    /* JADX WARN: Code duplicated, block: B:125:0x0367  */
    /* JADX WARN: Code duplicated, block: B:128:0x0375  */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:87:0x011a  */
    /* JADX WARN: Code duplicated, block: B:89:0x012c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0136  */
    /* JADX WARN: Code duplicated, block: B:93:0x0148  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b3  */
    private static final void ClickableFormFieldContent(Modifier modifier, String str, InterfaceC4339a interfaceC4339a, String str2, boolean z4, boolean z13, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        String str3;
        int i16;
        boolean z14;
        int i17;
        int i18;
        boolean z15;
        int i19;
        boolean z16;
        C28655q c28655q;
        Modifier modifier3;
        String str4;
        boolean z17;
        boolean z18;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        String str5;
        boolean z19;
        boolean z24;
        C38072d c38072d;
        int i24;
        long jM125416r;
        long jM95627c;
        long jM125370W0;
        String str6;
        boolean z25;
        long jM125370W1;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Modifier modifier4;
        int i25;
        int iHashCode2;
        int i26;
        String str7;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-186830265);
        int i27 = i14 & 1;
        if (i27 != 0) {
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
            i15 |= c28655q2.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(interfaceC4339a) ? 256 : 128;
        }
        int i28 = i14 & 8;
        if (i28 == 0) {
            if ((i13 & 3072) == 0) {
                str3 = str2;
                i15 |= c28655q2.m87153g(str3) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    z14 = z4;
                    if (c28655q2.m87155h(z14)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 32;
                if (i18 != 0) {
                    if ((196608 & i13) == 0) {
                        z15 = z13;
                        if (c28655q2.m87155h(z15)) {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i19;
                    }
                    if ((i15 & 74899) != 74898) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z16)) {
                        c2314t = C2314t.f9131w;
                        if (i27 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i28 != 0) {
                            str5 = "";
                        } else {
                            str5 = str3;
                        }
                        if (i16 != 0) {
                            z19 = false;
                        } else {
                            z19 = z14;
                        }
                        if (i18 != 0) {
                            z24 = true;
                        } else {
                            z24 = z15;
                        }
                        C15043i8 c15043i8 = C15043i8.f56313a;
                        c38072d = C38072d.f163053a;
                        i24 = C38072d.f163054b;
                        long jM125430y = c38072d.m121949b(c28655q2, i24).getBrandWhite();
                        if (z19) {
                            c28655q2.m87150e0(844753177);
                            jM125416r = c38072d.m121949b(c28655q2, i24).getAccentAlertTrend15();
                        } else {
                            c28655q2.m87150e0(844754510);
                            jM125416r = c38072d.m121949b(c28655q2, i24).getBlack30();
                        }
                        c28655q2.m87173q(false);
                        long jM125430y2 = c38072d.m121949b(c28655q2, i24).getBrandWhite();
                        long jM125430y3 = c38072d.m121949b(c28655q2, i24).getBrandWhite();
                        if (z19) {
                            c28655q2.m87150e0(844760306);
                            jM95627c = c38072d.m121949b(c28655q2, i24).getAccentAlert();
                        } else {
                            jM95627c = AbstractC31061c.m95627c(c28655q2, 844761422, c38072d, c28655q2, i24);
                        }
                        c28655q2.m87173q(false);
                        if (z19) {
                            c28655q2.m87150e0(844763794);
                            jM125370W0 = c38072d.m121949b(c28655q2, i24).getAccentAlert();
                        } else {
                            c28655q2.m87150e0(844764910);
                            jM125370W0 = c38072d.m121949b(c28655q2, i24).getWhite10();
                        }
                        c28655q2.m87173q(false);
                        str6 = str5;
                        C15197y1 c15197y1M43130h = C15043i8.m43130h(jM125430y, 0L, jM125416r, jM125430y2, jM125430y3, jM95627c, jM125370W0, 0L, c38072d.m121949b(c28655q2, i24).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q2, 2096770);
                        if (z19) {
                            c28655q2.m87150e0(844769042);
                            jM125370W1 = c38072d.m121949b(c28655q2, i24).getAccentAlert();
                            z25 = false;
                        } else {
                            z25 = false;
                            c28655q2.m87150e0(844770158);
                            jM125370W1 = c38072d.m121949b(c28655q2, i24).getWhite10();
                        }
                        c28655q2.m87173q(z25);
                        float f13 = 3 * 4;
                        boolean z26 = z24;
                        Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1092a.m3362g(AbstractC15751g.m44455h(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3411h(56, AbstractC1102d.m3409f(1.0f, modifier2)), AbstractC33253j.m105489e(f13)), ((C17919x) c15197y1M43130h.m43214a(c28655q2).getValue()).f69639a, AbstractC17918w0.f69621a), 1, jM125370W1, AbstractC33253j.m105489e(f13)), z26, null, new C18027i(0), interfaceC4339a, 10), 16, 0.0f, 2);
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9117z, false);
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
                        C0209i c0209i2 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d);
                        C0209i c0209i3 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            modifier4 = modifier2;
                        } else {
                            modifier4 = modifier2;
                            if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i4 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                            i25 = i15;
                            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                            iHashCode2 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a);
                            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                            C2886a c2886aM8420a = c38072d.m121952e(c28655q2, i24).getB1();
                            i26 = C2886a.f11498d << 18;
                            AbstractC30795n.m94707h(str, null, ((C17919x) c15197y1M43130h.m43218e(z26, c28655q2).getValue()).f69639a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q2, (i25 >> 3) & 14, i26, 196602);
                            c28655q = c28655q2;
                            if (str6.length() > 0) {
                                c28655q.m87150e0(1928206950);
                                C2886a c2886aM8420a2 = c38072d.m121952e(c28655q, i24).getB1();
                                str7 = str6;
                                AbstractC30795n.m94707h(str7, null, c38072d.m121949b(c28655q, i24).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a2, null, c28655q, (i25 >> 9) & 14, i26, 196602);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                str7 = str6;
                                c28655q.m87150e0(1928415921);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(true);
                            c28655q.m87173q(true);
                            z18 = z26;
                            str4 = str7;
                            modifier3 = modifier4;
                            z17 = z19;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        C0209i c0209i5 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N);
                        Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                        i25 = i15;
                        C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3409f2);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a2);
                        AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m3);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N3);
                        C2886a c2886aM8420a3 = c38072d.m121952e(c28655q2, i24).getB1();
                        i26 = C2886a.f11498d << 18;
                        AbstractC30795n.m94707h(str, null, ((C17919x) c15197y1M43130h.m43218e(z26, c28655q2).getValue()).f69639a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a3, null, c28655q2, (i25 >> 3) & 14, i26, 196602);
                        c28655q = c28655q2;
                        if (str6.length() > 0) {
                            c28655q.m87150e0(1928206950);
                            C2886a c2886aM8420a4 = c38072d.m121952e(c28655q, i24).getB1();
                            str7 = str6;
                            AbstractC30795n.m94707h(str7, null, c38072d.m121949b(c28655q, i24).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a4, null, c28655q, (i25 >> 9) & 14, i26, 196602);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            str7 = str6;
                            c28655q.m87150e0(1928415921);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        z18 = z26;
                        str4 = str7;
                        modifier3 = modifier4;
                        z17 = z19;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        str4 = str3;
                        z17 = z14;
                        z18 = z15;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2193n(modifier3, str, interfaceC4339a, str4, z17, z18, i13, i14);
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                z15 = z13;
                if ((i15 & 74899) != 74898) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z16)) {
                    c2314t = C2314t.f9131w;
                    if (i27 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i28 != 0) {
                        str5 = "";
                    } else {
                        str5 = str3;
                    }
                    if (i16 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    if (i18 != 0) {
                        z24 = true;
                    } else {
                        z24 = z15;
                    }
                    C15043i8 c15043i9 = C15043i8.f56313a;
                    c38072d = C38072d.f163053a;
                    i24 = C38072d.f163054b;
                    long jM125430y4 = c38072d.m121949b(c28655q2, i24).getBrandWhite();
                    if (z19) {
                        c28655q2.m87150e0(844753177);
                        jM125416r = c38072d.m121949b(c28655q2, i24).getAccentAlertTrend15();
                    } else {
                        c28655q2.m87150e0(844754510);
                        jM125416r = c38072d.m121949b(c28655q2, i24).getBlack30();
                    }
                    c28655q2.m87173q(false);
                    long jM125430y5 = c38072d.m121949b(c28655q2, i24).getBrandWhite();
                    long jM125430y6 = c38072d.m121949b(c28655q2, i24).getBrandWhite();
                    if (z19) {
                        c28655q2.m87150e0(844760306);
                        jM95627c = c38072d.m121949b(c28655q2, i24).getAccentAlert();
                    } else {
                        jM95627c = AbstractC31061c.m95627c(c28655q2, 844761422, c38072d, c28655q2, i24);
                    }
                    c28655q2.m87173q(false);
                    if (z19) {
                        c28655q2.m87150e0(844763794);
                        jM125370W0 = c38072d.m121949b(c28655q2, i24).getAccentAlert();
                    } else {
                        c28655q2.m87150e0(844764910);
                        jM125370W0 = c38072d.m121949b(c28655q2, i24).getWhite10();
                    }
                    c28655q2.m87173q(false);
                    str6 = str5;
                    C15197y1 c15197y1M43130h2 = C15043i8.m43130h(jM125430y4, 0L, jM125416r, jM125430y5, jM125430y6, jM95627c, jM125370W0, 0L, c38072d.m121949b(c28655q2, i24).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q2, 2096770);
                    if (z19) {
                        c28655q2.m87150e0(844769042);
                        jM125370W1 = c38072d.m121949b(c28655q2, i24).getAccentAlert();
                        z25 = false;
                    } else {
                        z25 = false;
                        c28655q2.m87150e0(844770158);
                        jM125370W1 = c38072d.m121949b(c28655q2, i24).getWhite10();
                    }
                    c28655q2.m87173q(z25);
                    float f14 = 3 * 4;
                    boolean z27 = z24;
                    Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1092a.m3362g(AbstractC15751g.m44455h(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3411h(56, AbstractC1102d.m3409f(1.0f, modifier2)), AbstractC33253j.m105489e(f14)), ((C17919x) c15197y1M43130h2.m43214a(c28655q2).getValue()).f69639a, AbstractC17918w0.f69621a), 1, jM125370W1, AbstractC33253j.m105489e(f14)), z27, null, new C18027i(0), interfaceC4339a, 10), 16, 0.0f, 2);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9117z, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3396r2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i6 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC39127r0M66763d2);
                    C0209i c0209i7 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m4);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        modifier4 = modifier2;
                        if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i8 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N4);
                        Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                        i25 = i15;
                        C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3409f3);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i6, c22994r1M66759a3);
                        AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m5);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N5);
                        C2886a c2886aM8420a5 = c38072d.m121952e(c28655q2, i24).getB1();
                        i26 = C2886a.f11498d << 18;
                        AbstractC30795n.m94707h(str, null, ((C17919x) c15197y1M43130h2.m43218e(z27, c28655q2).getValue()).f69639a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a5, null, c28655q2, (i25 >> 3) & 14, i26, 196602);
                        c28655q = c28655q2;
                        if (str6.length() > 0) {
                            c28655q.m87150e0(1928206950);
                            C2886a c2886aM8420a6 = c38072d.m121952e(c28655q, i24).getB1();
                            str7 = str6;
                            AbstractC30795n.m94707h(str7, null, c38072d.m121949b(c28655q, i24).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a6, null, c28655q, (i25 >> 9) & 14, i26, 196602);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            str7 = str6;
                            c28655q.m87150e0(1928415921);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        z18 = z27;
                        str4 = str7;
                        modifier3 = modifier4;
                        z17 = z19;
                    } else {
                        modifier4 = modifier2;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    C0209i c0209i9 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N4);
                    Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                    i25 = i15;
                    C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM3409f4);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i6, c22994r1M66759a4);
                    AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m6);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N6);
                    C2886a c2886aM8420a7 = c38072d.m121952e(c28655q2, i24).getB1();
                    i26 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(str, null, ((C17919x) c15197y1M43130h2.m43218e(z27, c28655q2).getValue()).f69639a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a7, null, c28655q2, (i25 >> 3) & 14, i26, 196602);
                    c28655q = c28655q2;
                    if (str6.length() > 0) {
                        c28655q.m87150e0(1928206950);
                        C2886a c2886aM8420a8 = c38072d.m121952e(c28655q, i24).getB1();
                        str7 = str6;
                        AbstractC30795n.m94707h(str7, null, c38072d.m121949b(c28655q, i24).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a8, null, c28655q, (i25 >> 9) & 14, i26, 196602);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        str7 = str6;
                        c28655q.m87150e0(1928415921);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    z18 = z27;
                    str4 = str7;
                    modifier3 = modifier4;
                    z17 = z19;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    str4 = str3;
                    z17 = z14;
                    z18 = z15;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2193n(modifier3, str, interfaceC4339a, str4, z17, z18, i13, i14);
                }
            }
            i15 |= 24576;
            z14 = z4;
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    z15 = z13;
                    if (c28655q2.m87155h(z15)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                if ((i15 & 74899) != 74898) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z16)) {
                    c2314t = C2314t.f9131w;
                    if (i27 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i28 != 0) {
                        str5 = "";
                    } else {
                        str5 = str3;
                    }
                    if (i16 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    if (i18 != 0) {
                        z24 = true;
                    } else {
                        z24 = z15;
                    }
                    C15043i8 c15043i10 = C15043i8.f56313a;
                    c38072d = C38072d.f163053a;
                    i24 = C38072d.f163054b;
                    long jM125430y7 = c38072d.m121949b(c28655q2, i24).getBrandWhite();
                    if (z19) {
                        c28655q2.m87150e0(844753177);
                        jM125416r = c38072d.m121949b(c28655q2, i24).getAccentAlertTrend15();
                    } else {
                        c28655q2.m87150e0(844754510);
                        jM125416r = c38072d.m121949b(c28655q2, i24).getBlack30();
                    }
                    c28655q2.m87173q(false);
                    long jM125430y8 = c38072d.m121949b(c28655q2, i24).getBrandWhite();
                    long jM125430y9 = c38072d.m121949b(c28655q2, i24).getBrandWhite();
                    if (z19) {
                        c28655q2.m87150e0(844760306);
                        jM95627c = c38072d.m121949b(c28655q2, i24).getAccentAlert();
                    } else {
                        jM95627c = AbstractC31061c.m95627c(c28655q2, 844761422, c38072d, c28655q2, i24);
                    }
                    c28655q2.m87173q(false);
                    if (z19) {
                        c28655q2.m87150e0(844763794);
                        jM125370W0 = c38072d.m121949b(c28655q2, i24).getAccentAlert();
                    } else {
                        c28655q2.m87150e0(844764910);
                        jM125370W0 = c38072d.m121949b(c28655q2, i24).getWhite10();
                    }
                    c28655q2.m87173q(false);
                    str6 = str5;
                    C15197y1 c15197y1M43130h3 = C15043i8.m43130h(jM125430y7, 0L, jM125416r, jM125430y8, jM125430y9, jM95627c, jM125370W0, 0L, c38072d.m121949b(c28655q2, i24).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q2, 2096770);
                    if (z19) {
                        c28655q2.m87150e0(844769042);
                        jM125370W1 = c38072d.m121949b(c28655q2, i24).getAccentAlert();
                        z25 = false;
                    } else {
                        z25 = false;
                        c28655q2.m87150e0(844770158);
                        jM125370W1 = c38072d.m121949b(c28655q2, i24).getWhite10();
                    }
                    c28655q2.m87173q(z25);
                    float f15 = 3 * 4;
                    boolean z28 = z24;
                    Modifier modifierM3396r3 = AbstractC1099a.m3396r(AbstractC1092a.m3362g(AbstractC15751g.m44455h(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3411h(56, AbstractC1102d.m3409f(1.0f, modifier2)), AbstractC33253j.m105489e(f15)), ((C17919x) c15197y1M43130h3.m43214a(c28655q2).getValue()).f69639a, AbstractC17918w0.f69621a), 1, jM125370W1, AbstractC33253j.m105489e(f15)), z28, null, new C18027i(0), interfaceC4339a, 10), 16, 0.0f, 2);
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9117z, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM3396r3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i10 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i10, interfaceC39127r0M66763d3);
                    C0209i c0209i11 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i11, interfaceC28653p1M87165m7);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        modifier4 = modifier2;
                        if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i12 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N7);
                        Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t);
                        i25 = i15;
                        C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                        Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM3409f5);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i10, c22994r1M66759a5);
                        AbstractC28683x.m87239G(c28655q2, c0209i11, interfaceC28653p1M87165m8);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N8);
                        C2886a c2886aM8420a9 = c38072d.m121952e(c28655q2, i24).getB1();
                        i26 = C2886a.f11498d << 18;
                        AbstractC30795n.m94707h(str, null, ((C17919x) c15197y1M43130h3.m43218e(z28, c28655q2).getValue()).f69639a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a9, null, c28655q2, (i25 >> 3) & 14, i26, 196602);
                        c28655q = c28655q2;
                        if (str6.length() > 0) {
                            c28655q.m87150e0(1928206950);
                            C2886a c2886aM8420a10 = c38072d.m121952e(c28655q, i24).getB1();
                            str7 = str6;
                            AbstractC30795n.m94707h(str7, null, c38072d.m121949b(c28655q, i24).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a10, null, c28655q, (i25 >> 9) & 14, i26, 196602);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            str7 = str6;
                            c28655q.m87150e0(1928415921);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        z18 = z28;
                        str4 = str7;
                        modifier3 = modifier4;
                        z17 = z19;
                    } else {
                        modifier4 = modifier2;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    C0209i c0209i13 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i13, modifierM118962N7);
                    Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t);
                    i25 = i15;
                    C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifierM3409f6);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i10, c22994r1M66759a6);
                    AbstractC28683x.m87239G(c28655q2, c0209i11, interfaceC28653p1M87165m9);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i13, modifierM118962N9);
                    C2886a c2886aM8420a11 = c38072d.m121952e(c28655q2, i24).getB1();
                    i26 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(str, null, ((C17919x) c15197y1M43130h3.m43218e(z28, c28655q2).getValue()).f69639a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a11, null, c28655q2, (i25 >> 3) & 14, i26, 196602);
                    c28655q = c28655q2;
                    if (str6.length() > 0) {
                        c28655q.m87150e0(1928206950);
                        C2886a c2886aM8420a12 = c38072d.m121952e(c28655q, i24).getB1();
                        str7 = str6;
                        AbstractC30795n.m94707h(str7, null, c38072d.m121949b(c28655q, i24).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a12, null, c28655q, (i25 >> 9) & 14, i26, 196602);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        str7 = str6;
                        c28655q.m87150e0(1928415921);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    z18 = z28;
                    str4 = str7;
                    modifier3 = modifier4;
                    z17 = z19;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    str4 = str3;
                    z17 = z14;
                    z18 = z15;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2193n(modifier3, str, interfaceC4339a, str4, z17, z18, i13, i14);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            z15 = z13;
            if ((i15 & 74899) != 74898) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z16)) {
                c2314t = C2314t.f9131w;
                if (i27 != 0) {
                    modifier2 = c2314t;
                }
                if (i28 != 0) {
                    str5 = "";
                } else {
                    str5 = str3;
                }
                if (i16 != 0) {
                    z19 = false;
                } else {
                    z19 = z14;
                }
                if (i18 != 0) {
                    z24 = true;
                } else {
                    z24 = z15;
                }
                C15043i8 c15043i11 = C15043i8.f56313a;
                c38072d = C38072d.f163053a;
                i24 = C38072d.f163054b;
                long jM125430y10 = c38072d.m121949b(c28655q2, i24).getBrandWhite();
                if (z19) {
                    c28655q2.m87150e0(844753177);
                    jM125416r = c38072d.m121949b(c28655q2, i24).getAccentAlertTrend15();
                } else {
                    c28655q2.m87150e0(844754510);
                    jM125416r = c38072d.m121949b(c28655q2, i24).getBlack30();
                }
                c28655q2.m87173q(false);
                long jM125430y11 = c38072d.m121949b(c28655q2, i24).getBrandWhite();
                long jM125430y12 = c38072d.m121949b(c28655q2, i24).getBrandWhite();
                if (z19) {
                    c28655q2.m87150e0(844760306);
                    jM95627c = c38072d.m121949b(c28655q2, i24).getAccentAlert();
                } else {
                    jM95627c = AbstractC31061c.m95627c(c28655q2, 844761422, c38072d, c28655q2, i24);
                }
                c28655q2.m87173q(false);
                if (z19) {
                    c28655q2.m87150e0(844763794);
                    jM125370W0 = c38072d.m121949b(c28655q2, i24).getAccentAlert();
                } else {
                    c28655q2.m87150e0(844764910);
                    jM125370W0 = c38072d.m121949b(c28655q2, i24).getWhite10();
                }
                c28655q2.m87173q(false);
                str6 = str5;
                C15197y1 c15197y1M43130h4 = C15043i8.m43130h(jM125430y10, 0L, jM125416r, jM125430y11, jM125430y12, jM95627c, jM125370W0, 0L, c38072d.m121949b(c28655q2, i24).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q2, 2096770);
                if (z19) {
                    c28655q2.m87150e0(844769042);
                    jM125370W1 = c38072d.m121949b(c28655q2, i24).getAccentAlert();
                    z25 = false;
                } else {
                    z25 = false;
                    c28655q2.m87150e0(844770158);
                    jM125370W1 = c38072d.m121949b(c28655q2, i24).getWhite10();
                }
                c28655q2.m87173q(z25);
                float f16 = 3 * 4;
                boolean z29 = z24;
                Modifier modifierM3396r4 = AbstractC1099a.m3396r(AbstractC1092a.m3362g(AbstractC15751g.m44455h(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3411h(56, AbstractC1102d.m3409f(1.0f, modifier2)), AbstractC33253j.m105489e(f16)), ((C17919x) c15197y1M43130h4.m43214a(c28655q2).getValue()).f69639a, AbstractC17918w0.f69621a), 1, jM125370W1, AbstractC33253j.m105489e(f16)), z29, null, new C18027i(0), interfaceC4339a, 10), 16, 0.0f, 2);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9117z, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, modifierM3396r4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i14 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i14, interfaceC39127r0M66763d4);
                C0209i c0209i15 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i15, interfaceC28653p1M87165m10);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    modifier4 = modifier2;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i16 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i16, modifierM118962N10);
                    Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t);
                    i25 = i15;
                    C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q2.m87165m();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q2, modifierM3409f7);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i14, c22994r1M66759a7);
                    AbstractC28683x.m87239G(c28655q2, c0209i15, interfaceC28653p1M87165m11);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i16, modifierM118962N11);
                    C2886a c2886aM8420a13 = c38072d.m121952e(c28655q2, i24).getB1();
                    i26 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(str, null, ((C17919x) c15197y1M43130h4.m43218e(z29, c28655q2).getValue()).f69639a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a13, null, c28655q2, (i25 >> 3) & 14, i26, 196602);
                    c28655q = c28655q2;
                    if (str6.length() > 0) {
                        c28655q.m87150e0(1928206950);
                        C2886a c2886aM8420a14 = c38072d.m121952e(c28655q, i24).getB1();
                        str7 = str6;
                        AbstractC30795n.m94707h(str7, null, c38072d.m121949b(c28655q, i24).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a14, null, c28655q, (i25 >> 9) & 14, i26, 196602);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        str7 = str6;
                        c28655q.m87150e0(1928415921);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    z18 = z29;
                    str4 = str7;
                    modifier3 = modifier4;
                    z17 = z19;
                } else {
                    modifier4 = modifier2;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                C0209i c0209i17 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i17, modifierM118962N10);
                Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t);
                i25 = i15;
                C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q2.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q2, modifierM3409f8);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i14, c22994r1M66759a8);
                AbstractC28683x.m87239G(c28655q2, c0209i15, interfaceC28653p1M87165m12);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i17, modifierM118962N12);
                C2886a c2886aM8420a15 = c38072d.m121952e(c28655q2, i24).getB1();
                i26 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(str, null, ((C17919x) c15197y1M43130h4.m43218e(z29, c28655q2).getValue()).f69639a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a15, null, c28655q2, (i25 >> 3) & 14, i26, 196602);
                c28655q = c28655q2;
                if (str6.length() > 0) {
                    c28655q.m87150e0(1928206950);
                    C2886a c2886aM8420a16 = c38072d.m121952e(c28655q, i24).getB1();
                    str7 = str6;
                    AbstractC30795n.m94707h(str7, null, c38072d.m121949b(c28655q, i24).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a16, null, c28655q, (i25 >> 9) & 14, i26, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    str7 = str6;
                    c28655q.m87150e0(1928415921);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                z18 = z29;
                str4 = str7;
                modifier3 = modifier4;
                z17 = z19;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                str4 = str3;
                z17 = z14;
                z18 = z15;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2193n(modifier3, str, interfaceC4339a, str4, z17, z18, i13, i14);
            }
        }
        i15 |= 3072;
        str3 = str2;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                z14 = z4;
                if (c28655q2.m87155h(z14)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    z15 = z13;
                    if (c28655q2.m87155h(z15)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                if ((i15 & 74899) != 74898) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z16)) {
                    c2314t = C2314t.f9131w;
                    if (i27 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i28 != 0) {
                        str5 = "";
                    } else {
                        str5 = str3;
                    }
                    if (i16 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    if (i18 != 0) {
                        z24 = true;
                    } else {
                        z24 = z15;
                    }
                    C15043i8 c15043i12 = C15043i8.f56313a;
                    c38072d = C38072d.f163053a;
                    i24 = C38072d.f163054b;
                    long jM125430y13 = c38072d.m121949b(c28655q2, i24).getBrandWhite();
                    if (z19) {
                        c28655q2.m87150e0(844753177);
                        jM125416r = c38072d.m121949b(c28655q2, i24).getAccentAlertTrend15();
                    } else {
                        c28655q2.m87150e0(844754510);
                        jM125416r = c38072d.m121949b(c28655q2, i24).getBlack30();
                    }
                    c28655q2.m87173q(false);
                    long jM125430y14 = c38072d.m121949b(c28655q2, i24).getBrandWhite();
                    long jM125430y15 = c38072d.m121949b(c28655q2, i24).getBrandWhite();
                    if (z19) {
                        c28655q2.m87150e0(844760306);
                        jM95627c = c38072d.m121949b(c28655q2, i24).getAccentAlert();
                    } else {
                        jM95627c = AbstractC31061c.m95627c(c28655q2, 844761422, c38072d, c28655q2, i24);
                    }
                    c28655q2.m87173q(false);
                    if (z19) {
                        c28655q2.m87150e0(844763794);
                        jM125370W0 = c38072d.m121949b(c28655q2, i24).getAccentAlert();
                    } else {
                        c28655q2.m87150e0(844764910);
                        jM125370W0 = c38072d.m121949b(c28655q2, i24).getWhite10();
                    }
                    c28655q2.m87173q(false);
                    str6 = str5;
                    C15197y1 c15197y1M43130h5 = C15043i8.m43130h(jM125430y13, 0L, jM125416r, jM125430y14, jM125430y15, jM95627c, jM125370W0, 0L, c38072d.m121949b(c28655q2, i24).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q2, 2096770);
                    if (z19) {
                        c28655q2.m87150e0(844769042);
                        jM125370W1 = c38072d.m121949b(c28655q2, i24).getAccentAlert();
                        z25 = false;
                    } else {
                        z25 = false;
                        c28655q2.m87150e0(844770158);
                        jM125370W1 = c38072d.m121949b(c28655q2, i24).getWhite10();
                    }
                    c28655q2.m87173q(z25);
                    float f17 = 3 * 4;
                    boolean z210 = z24;
                    Modifier modifierM3396r5 = AbstractC1099a.m3396r(AbstractC1092a.m3362g(AbstractC15751g.m44455h(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3411h(56, AbstractC1102d.m3409f(1.0f, modifier2)), AbstractC33253j.m105489e(f17)), ((C17919x) c15197y1M43130h5.m43214a(c28655q2).getValue()).f69639a, AbstractC17918w0.f69621a), 1, jM125370W1, AbstractC33253j.m105489e(f17)), z210, null, new C18027i(0), interfaceC4339a, 10), 16, 0.0f, 2);
                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9117z, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q2.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q2, modifierM3396r5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i18 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i18, interfaceC39127r0M66763d5);
                    C0209i c0209i19 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i19, interfaceC28653p1M87165m13);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        modifier4 = modifier2;
                        if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i110 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i110, modifierM118962N13);
                        Modifier modifierM3409f9 = AbstractC1102d.m3409f(1.0f, c2314t);
                        i25 = i15;
                        C22994r1 c22994r1M66759a9 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q2.m87165m();
                        Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q2, modifierM3409f9);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i18, c22994r1M66759a9);
                        AbstractC28683x.m87239G(c28655q2, c0209i19, interfaceC28653p1M87165m14);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i110, modifierM118962N14);
                        C2886a c2886aM8420a17 = c38072d.m121952e(c28655q2, i24).getB1();
                        i26 = C2886a.f11498d << 18;
                        AbstractC30795n.m94707h(str, null, ((C17919x) c15197y1M43130h5.m43218e(z210, c28655q2).getValue()).f69639a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a17, null, c28655q2, (i25 >> 3) & 14, i26, 196602);
                        c28655q = c28655q2;
                        if (str6.length() > 0) {
                            c28655q.m87150e0(1928206950);
                            C2886a c2886aM8420a18 = c38072d.m121952e(c28655q, i24).getB1();
                            str7 = str6;
                            AbstractC30795n.m94707h(str7, null, c38072d.m121949b(c28655q, i24).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a18, null, c28655q, (i25 >> 9) & 14, i26, 196602);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            str7 = str6;
                            c28655q.m87150e0(1928415921);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        z18 = z210;
                        str4 = str7;
                        modifier3 = modifier4;
                        z17 = z19;
                    } else {
                        modifier4 = modifier2;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    C0209i c0209i111 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i111, modifierM118962N13);
                    Modifier modifierM3409f10 = AbstractC1102d.m3409f(1.0f, c2314t);
                    i25 = i15;
                    C22994r1 c22994r1M66759a10 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q2.m87165m();
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q2, modifierM3409f10);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i18, c22994r1M66759a10);
                    AbstractC28683x.m87239G(c28655q2, c0209i19, interfaceC28653p1M87165m15);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i111, modifierM118962N15);
                    C2886a c2886aM8420a19 = c38072d.m121952e(c28655q2, i24).getB1();
                    i26 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(str, null, ((C17919x) c15197y1M43130h5.m43218e(z210, c28655q2).getValue()).f69639a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a19, null, c28655q2, (i25 >> 3) & 14, i26, 196602);
                    c28655q = c28655q2;
                    if (str6.length() > 0) {
                        c28655q.m87150e0(1928206950);
                        C2886a c2886aM8420a110 = c38072d.m121952e(c28655q, i24).getB1();
                        str7 = str6;
                        AbstractC30795n.m94707h(str7, null, c38072d.m121949b(c28655q, i24).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a110, null, c28655q, (i25 >> 9) & 14, i26, 196602);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        str7 = str6;
                        c28655q.m87150e0(1928415921);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    z18 = z210;
                    str4 = str7;
                    modifier3 = modifier4;
                    z17 = z19;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    str4 = str3;
                    z17 = z14;
                    z18 = z15;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2193n(modifier3, str, interfaceC4339a, str4, z17, z18, i13, i14);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            z15 = z13;
            if ((i15 & 74899) != 74898) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z16)) {
                c2314t = C2314t.f9131w;
                if (i27 != 0) {
                    modifier2 = c2314t;
                }
                if (i28 != 0) {
                    str5 = "";
                } else {
                    str5 = str3;
                }
                if (i16 != 0) {
                    z19 = false;
                } else {
                    z19 = z14;
                }
                if (i18 != 0) {
                    z24 = true;
                } else {
                    z24 = z15;
                }
                C15043i8 c15043i13 = C15043i8.f56313a;
                c38072d = C38072d.f163053a;
                i24 = C38072d.f163054b;
                long jM125430y16 = c38072d.m121949b(c28655q2, i24).getBrandWhite();
                if (z19) {
                    c28655q2.m87150e0(844753177);
                    jM125416r = c38072d.m121949b(c28655q2, i24).getAccentAlertTrend15();
                } else {
                    c28655q2.m87150e0(844754510);
                    jM125416r = c38072d.m121949b(c28655q2, i24).getBlack30();
                }
                c28655q2.m87173q(false);
                long jM125430y17 = c38072d.m121949b(c28655q2, i24).getBrandWhite();
                long jM125430y18 = c38072d.m121949b(c28655q2, i24).getBrandWhite();
                if (z19) {
                    c28655q2.m87150e0(844760306);
                    jM95627c = c38072d.m121949b(c28655q2, i24).getAccentAlert();
                } else {
                    jM95627c = AbstractC31061c.m95627c(c28655q2, 844761422, c38072d, c28655q2, i24);
                }
                c28655q2.m87173q(false);
                if (z19) {
                    c28655q2.m87150e0(844763794);
                    jM125370W0 = c38072d.m121949b(c28655q2, i24).getAccentAlert();
                } else {
                    c28655q2.m87150e0(844764910);
                    jM125370W0 = c38072d.m121949b(c28655q2, i24).getWhite10();
                }
                c28655q2.m87173q(false);
                str6 = str5;
                C15197y1 c15197y1M43130h6 = C15043i8.m43130h(jM125430y16, 0L, jM125416r, jM125430y17, jM125430y18, jM95627c, jM125370W0, 0L, c38072d.m121949b(c28655q2, i24).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q2, 2096770);
                if (z19) {
                    c28655q2.m87150e0(844769042);
                    jM125370W1 = c38072d.m121949b(c28655q2, i24).getAccentAlert();
                    z25 = false;
                } else {
                    z25 = false;
                    c28655q2.m87150e0(844770158);
                    jM125370W1 = c38072d.m121949b(c28655q2, i24).getWhite10();
                }
                c28655q2.m87173q(z25);
                float f18 = 3 * 4;
                boolean z211 = z24;
                Modifier modifierM3396r6 = AbstractC1099a.m3396r(AbstractC1092a.m3362g(AbstractC15751g.m44455h(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3411h(56, AbstractC1102d.m3409f(1.0f, modifier2)), AbstractC33253j.m105489e(f18)), ((C17919x) c15197y1M43130h6.m43214a(c28655q2).getValue()).f69639a, AbstractC17918w0.f69621a), 1, jM125370W1, AbstractC33253j.m105489e(f18)), z211, null, new C18027i(0), interfaceC4339a, 10), 16, 0.0f, 2);
                InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9117z, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q2.m87165m();
                Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q2, modifierM3396r6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i112 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i112, interfaceC39127r0M66763d6);
                C0209i c0209i113 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i113, interfaceC28653p1M87165m16);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    modifier4 = modifier2;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i114 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i114, modifierM118962N16);
                    Modifier modifierM3409f11 = AbstractC1102d.m3409f(1.0f, c2314t);
                    i25 = i15;
                    C22994r1 c22994r1M66759a11 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q2.m87165m();
                    Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q2, modifierM3409f11);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i112, c22994r1M66759a11);
                    AbstractC28683x.m87239G(c28655q2, c0209i113, interfaceC28653p1M87165m17);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i114, modifierM118962N17);
                    C2886a c2886aM8420a111 = c38072d.m121952e(c28655q2, i24).getB1();
                    i26 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(str, null, ((C17919x) c15197y1M43130h6.m43218e(z211, c28655q2).getValue()).f69639a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a111, null, c28655q2, (i25 >> 3) & 14, i26, 196602);
                    c28655q = c28655q2;
                    if (str6.length() > 0) {
                        c28655q.m87150e0(1928206950);
                        C2886a c2886aM8420a112 = c38072d.m121952e(c28655q, i24).getB1();
                        str7 = str6;
                        AbstractC30795n.m94707h(str7, null, c38072d.m121949b(c28655q, i24).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a112, null, c28655q, (i25 >> 9) & 14, i26, 196602);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        str7 = str6;
                        c28655q.m87150e0(1928415921);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    z18 = z211;
                    str4 = str7;
                    modifier3 = modifier4;
                    z17 = z19;
                } else {
                    modifier4 = modifier2;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                C0209i c0209i115 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i115, modifierM118962N16);
                Modifier modifierM3409f12 = AbstractC1102d.m3409f(1.0f, c2314t);
                i25 = i15;
                C22994r1 c22994r1M66759a12 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q2.m87165m();
                Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q2, modifierM3409f12);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i112, c22994r1M66759a12);
                AbstractC28683x.m87239G(c28655q2, c0209i113, interfaceC28653p1M87165m18);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i115, modifierM118962N18);
                C2886a c2886aM8420a113 = c38072d.m121952e(c28655q2, i24).getB1();
                i26 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(str, null, ((C17919x) c15197y1M43130h6.m43218e(z211, c28655q2).getValue()).f69639a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a113, null, c28655q2, (i25 >> 3) & 14, i26, 196602);
                c28655q = c28655q2;
                if (str6.length() > 0) {
                    c28655q.m87150e0(1928206950);
                    C2886a c2886aM8420a114 = c38072d.m121952e(c28655q, i24).getB1();
                    str7 = str6;
                    AbstractC30795n.m94707h(str7, null, c38072d.m121949b(c28655q, i24).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a114, null, c28655q, (i25 >> 9) & 14, i26, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    str7 = str6;
                    c28655q.m87150e0(1928415921);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                z18 = z211;
                str4 = str7;
                modifier3 = modifier4;
                z17 = z19;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                str4 = str3;
                z17 = z14;
                z18 = z15;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2193n(modifier3, str, interfaceC4339a, str4, z17, z18, i13, i14);
            }
        }
        i15 |= 24576;
        z14 = z4;
        i18 = i14 & 32;
        if (i18 != 0) {
            if ((196608 & i13) == 0) {
                z15 = z13;
                if (c28655q2.m87155h(z15)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i19;
            }
            if ((i15 & 74899) != 74898) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z16)) {
                c2314t = C2314t.f9131w;
                if (i27 != 0) {
                    modifier2 = c2314t;
                }
                if (i28 != 0) {
                    str5 = "";
                } else {
                    str5 = str3;
                }
                if (i16 != 0) {
                    z19 = false;
                } else {
                    z19 = z14;
                }
                if (i18 != 0) {
                    z24 = true;
                } else {
                    z24 = z15;
                }
                C15043i8 c15043i14 = C15043i8.f56313a;
                c38072d = C38072d.f163053a;
                i24 = C38072d.f163054b;
                long jM125430y19 = c38072d.m121949b(c28655q2, i24).getBrandWhite();
                if (z19) {
                    c28655q2.m87150e0(844753177);
                    jM125416r = c38072d.m121949b(c28655q2, i24).getAccentAlertTrend15();
                } else {
                    c28655q2.m87150e0(844754510);
                    jM125416r = c38072d.m121949b(c28655q2, i24).getBlack30();
                }
                c28655q2.m87173q(false);
                long jM125430y110 = c38072d.m121949b(c28655q2, i24).getBrandWhite();
                long jM125430y111 = c38072d.m121949b(c28655q2, i24).getBrandWhite();
                if (z19) {
                    c28655q2.m87150e0(844760306);
                    jM95627c = c38072d.m121949b(c28655q2, i24).getAccentAlert();
                } else {
                    jM95627c = AbstractC31061c.m95627c(c28655q2, 844761422, c38072d, c28655q2, i24);
                }
                c28655q2.m87173q(false);
                if (z19) {
                    c28655q2.m87150e0(844763794);
                    jM125370W0 = c38072d.m121949b(c28655q2, i24).getAccentAlert();
                } else {
                    c28655q2.m87150e0(844764910);
                    jM125370W0 = c38072d.m121949b(c28655q2, i24).getWhite10();
                }
                c28655q2.m87173q(false);
                str6 = str5;
                C15197y1 c15197y1M43130h7 = C15043i8.m43130h(jM125430y19, 0L, jM125416r, jM125430y110, jM125430y111, jM95627c, jM125370W0, 0L, c38072d.m121949b(c28655q2, i24).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q2, 2096770);
                if (z19) {
                    c28655q2.m87150e0(844769042);
                    jM125370W1 = c38072d.m121949b(c28655q2, i24).getAccentAlert();
                    z25 = false;
                } else {
                    z25 = false;
                    c28655q2.m87150e0(844770158);
                    jM125370W1 = c38072d.m121949b(c28655q2, i24).getWhite10();
                }
                c28655q2.m87173q(z25);
                float f19 = 3 * 4;
                boolean z212 = z24;
                Modifier modifierM3396r7 = AbstractC1099a.m3396r(AbstractC1092a.m3362g(AbstractC15751g.m44455h(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3411h(56, AbstractC1102d.m3409f(1.0f, modifier2)), AbstractC33253j.m105489e(f19)), ((C17919x) c15197y1M43130h7.m43214a(c28655q2).getValue()).f69639a, AbstractC17918w0.f69621a), 1, jM125370W1, AbstractC33253j.m105489e(f19)), z212, null, new C18027i(0), interfaceC4339a, 10), 16, 0.0f, 2);
                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9117z, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q2.m87165m();
                Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q2, modifierM3396r7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i116 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i116, interfaceC39127r0M66763d7);
                C0209i c0209i117 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i117, interfaceC28653p1M87165m19);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    modifier4 = modifier2;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i118 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i118, modifierM118962N19);
                    Modifier modifierM3409f13 = AbstractC1102d.m3409f(1.0f, c2314t);
                    i25 = i15;
                    C22994r1 c22994r1M66759a13 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q2.m87165m();
                    Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q2, modifierM3409f13);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i116, c22994r1M66759a13);
                    AbstractC28683x.m87239G(c28655q2, c0209i117, interfaceC28653p1M87165m110);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i118, modifierM118962N110);
                    C2886a c2886aM8420a115 = c38072d.m121952e(c28655q2, i24).getB1();
                    i26 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(str, null, ((C17919x) c15197y1M43130h7.m43218e(z212, c28655q2).getValue()).f69639a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a115, null, c28655q2, (i25 >> 3) & 14, i26, 196602);
                    c28655q = c28655q2;
                    if (str6.length() > 0) {
                        c28655q.m87150e0(1928206950);
                        C2886a c2886aM8420a116 = c38072d.m121952e(c28655q, i24).getB1();
                        str7 = str6;
                        AbstractC30795n.m94707h(str7, null, c38072d.m121949b(c28655q, i24).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a116, null, c28655q, (i25 >> 9) & 14, i26, 196602);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        str7 = str6;
                        c28655q.m87150e0(1928415921);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    z18 = z212;
                    str4 = str7;
                    modifier3 = modifier4;
                    z17 = z19;
                } else {
                    modifier4 = modifier2;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                C0209i c0209i119 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i119, modifierM118962N19);
                Modifier modifierM3409f14 = AbstractC1102d.m3409f(1.0f, c2314t);
                i25 = i15;
                C22994r1 c22994r1M66759a14 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q2.m87165m();
                Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q2, modifierM3409f14);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i116, c22994r1M66759a14);
                AbstractC28683x.m87239G(c28655q2, c0209i117, interfaceC28653p1M87165m111);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i119, modifierM118962N111);
                C2886a c2886aM8420a117 = c38072d.m121952e(c28655q2, i24).getB1();
                i26 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(str, null, ((C17919x) c15197y1M43130h7.m43218e(z212, c28655q2).getValue()).f69639a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a117, null, c28655q2, (i25 >> 3) & 14, i26, 196602);
                c28655q = c28655q2;
                if (str6.length() > 0) {
                    c28655q.m87150e0(1928206950);
                    C2886a c2886aM8420a118 = c38072d.m121952e(c28655q, i24).getB1();
                    str7 = str6;
                    AbstractC30795n.m94707h(str7, null, c38072d.m121949b(c28655q, i24).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a118, null, c28655q, (i25 >> 9) & 14, i26, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    str7 = str6;
                    c28655q.m87150e0(1928415921);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                z18 = z212;
                str4 = str7;
                modifier3 = modifier4;
                z17 = z19;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                str4 = str3;
                z17 = z14;
                z18 = z15;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2193n(modifier3, str, interfaceC4339a, str4, z17, z18, i13, i14);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        z15 = z13;
        if ((i15 & 74899) != 74898) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z16)) {
            c2314t = C2314t.f9131w;
            if (i27 != 0) {
                modifier2 = c2314t;
            }
            if (i28 != 0) {
                str5 = "";
            } else {
                str5 = str3;
            }
            if (i16 != 0) {
                z19 = false;
            } else {
                z19 = z14;
            }
            if (i18 != 0) {
                z24 = true;
            } else {
                z24 = z15;
            }
            C15043i8 c15043i15 = C15043i8.f56313a;
            c38072d = C38072d.f163053a;
            i24 = C38072d.f163054b;
            long jM125430y112 = c38072d.m121949b(c28655q2, i24).getBrandWhite();
            if (z19) {
                c28655q2.m87150e0(844753177);
                jM125416r = c38072d.m121949b(c28655q2, i24).getAccentAlertTrend15();
            } else {
                c28655q2.m87150e0(844754510);
                jM125416r = c38072d.m121949b(c28655q2, i24).getBlack30();
            }
            c28655q2.m87173q(false);
            long jM125430y113 = c38072d.m121949b(c28655q2, i24).getBrandWhite();
            long jM125430y114 = c38072d.m121949b(c28655q2, i24).getBrandWhite();
            if (z19) {
                c28655q2.m87150e0(844760306);
                jM95627c = c38072d.m121949b(c28655q2, i24).getAccentAlert();
            } else {
                jM95627c = AbstractC31061c.m95627c(c28655q2, 844761422, c38072d, c28655q2, i24);
            }
            c28655q2.m87173q(false);
            if (z19) {
                c28655q2.m87150e0(844763794);
                jM125370W0 = c38072d.m121949b(c28655q2, i24).getAccentAlert();
            } else {
                c28655q2.m87150e0(844764910);
                jM125370W0 = c38072d.m121949b(c28655q2, i24).getWhite10();
            }
            c28655q2.m87173q(false);
            str6 = str5;
            C15197y1 c15197y1M43130h8 = C15043i8.m43130h(jM125430y112, 0L, jM125416r, jM125430y113, jM125430y114, jM95627c, jM125370W0, 0L, c38072d.m121949b(c28655q2, i24).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q2, 2096770);
            if (z19) {
                c28655q2.m87150e0(844769042);
                jM125370W1 = c38072d.m121949b(c28655q2, i24).getAccentAlert();
                z25 = false;
            } else {
                z25 = false;
                c28655q2.m87150e0(844770158);
                jM125370W1 = c38072d.m121949b(c28655q2, i24).getWhite10();
            }
            c28655q2.m87173q(z25);
            float f110 = 3 * 4;
            boolean z213 = z24;
            Modifier modifierM3396r8 = AbstractC1099a.m3396r(AbstractC1092a.m3362g(AbstractC15751g.m44455h(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3411h(56, AbstractC1102d.m3409f(1.0f, modifier2)), AbstractC33253j.m105489e(f110)), ((C17919x) c15197y1M43130h8.m43214a(c28655q2).getValue()).f69639a, AbstractC17918w0.f69621a), 1, jM125370W1, AbstractC33253j.m105489e(f110)), z213, null, new C18027i(0), interfaceC4339a, 10), 16, 0.0f, 2);
            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9117z, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q2.m87165m();
            Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q2, modifierM3396r8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i1110 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i1110, interfaceC39127r0M66763d8);
            C0209i c0209i1111 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i1111, interfaceC28653p1M87165m112);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                modifier4 = modifier2;
                if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i1112 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i1112, modifierM118962N112);
                Modifier modifierM3409f15 = AbstractC1102d.m3409f(1.0f, c2314t);
                i25 = i15;
                C22994r1 c22994r1M66759a15 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q2.m87165m();
                Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q2, modifierM3409f15);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i1110, c22994r1M66759a15);
                AbstractC28683x.m87239G(c28655q2, c0209i1111, interfaceC28653p1M87165m113);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i1112, modifierM118962N113);
                C2886a c2886aM8420a119 = c38072d.m121952e(c28655q2, i24).getB1();
                i26 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(str, null, ((C17919x) c15197y1M43130h8.m43218e(z213, c28655q2).getValue()).f69639a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a119, null, c28655q2, (i25 >> 3) & 14, i26, 196602);
                c28655q = c28655q2;
                if (str6.length() > 0) {
                    c28655q.m87150e0(1928206950);
                    C2886a c2886aM8420a1110 = c38072d.m121952e(c28655q, i24).getB1();
                    str7 = str6;
                    AbstractC30795n.m94707h(str7, null, c38072d.m121949b(c28655q, i24).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a1110, null, c28655q, (i25 >> 9) & 14, i26, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    str7 = str6;
                    c28655q.m87150e0(1928415921);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                z18 = z213;
                str4 = str7;
                modifier3 = modifier4;
                z17 = z19;
            } else {
                modifier4 = modifier2;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            C0209i c0209i1113 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i1113, modifierM118962N112);
            Modifier modifierM3409f16 = AbstractC1102d.m3409f(1.0f, c2314t);
            i25 = i15;
            C22994r1 c22994r1M66759a16 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q2.m87165m();
            Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q2, modifierM3409f16);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i1110, c22994r1M66759a16);
            AbstractC28683x.m87239G(c28655q2, c0209i1111, interfaceC28653p1M87165m114);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i1113, modifierM118962N114);
            C2886a c2886aM8420a1111 = c38072d.m121952e(c28655q2, i24).getB1();
            i26 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(str, null, ((C17919x) c15197y1M43130h8.m43218e(z213, c28655q2).getValue()).f69639a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a1111, null, c28655q2, (i25 >> 3) & 14, i26, 196602);
            c28655q = c28655q2;
            if (str6.length() > 0) {
                c28655q.m87150e0(1928206950);
                C2886a c2886aM8420a1112 = c38072d.m121952e(c28655q, i24).getB1();
                str7 = str6;
                AbstractC30795n.m94707h(str7, null, c38072d.m121949b(c28655q, i24).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a1112, null, c28655q, (i25 >> 9) & 14, i26, 196602);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                str7 = str6;
                c28655q.m87150e0(1928415921);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            z18 = z213;
            str4 = str7;
            modifier3 = modifier4;
            z17 = z19;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
            str4 = str3;
            z17 = z14;
            z18 = z15;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2193n(modifier3, str, interfaceC4339a, str4, z17, z18, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ClickableFormFieldContent$lambda$1(Modifier modifier, String str, InterfaceC4339a interfaceC4339a, String str2, boolean z4, boolean z13, int i13, int i14, Composer composer, int i15) {
        ClickableFormFieldContent(modifier, str, interfaceC4339a, str2, z4, z13, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0250  */
    /* JADX WARN: Code duplicated, block: B:101:0x0252  */
    /* JADX WARN: Code duplicated, block: B:104:0x0259 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:107:0x025f  */
    /* JADX WARN: Code duplicated, block: B:110:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:114:0x02bc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:115:0x02be  */
    /* JADX WARN: Code duplicated, block: B:118:0x0308  */
    /* JADX WARN: Code duplicated, block: B:120:0x030e  */
    /* JADX WARN: Code duplicated, block: B:123:0x031e  */
    /* JADX WARN: Code duplicated, block: B:125:0x032c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0360  */
    /* JADX WARN: Code duplicated, block: B:132:0x0364  */
    /* JADX WARN: Code duplicated, block: B:135:0x0371  */
    /* JADX WARN: Code duplicated, block: B:137:0x037f  */
    /* JADX WARN: Code duplicated, block: B:140:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:141:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:144:0x03c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:147:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:150:0x0430  */
    /* JADX WARN: Code duplicated, block: B:151:0x0434  */
    /* JADX WARN: Code duplicated, block: B:154:0x0443  */
    /* JADX WARN: Code duplicated, block: B:156:0x0451  */
    /* JADX WARN: Code duplicated, block: B:161:0x0488  */
    /* JADX WARN: Code duplicated, block: B:162:0x048a  */
    /* JADX WARN: Code duplicated, block: B:165:0x0491  */
    /* JADX WARN: Code duplicated, block: B:169:0x0499  */
    /* JADX WARN: Code duplicated, block: B:172:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:175:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:80:0x014e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0152  */
    /* JADX WARN: Code duplicated, block: B:84:0x0167  */
    /* JADX WARN: Code duplicated, block: B:87:0x0178  */
    /* JADX WARN: Code duplicated, block: B:91:0x021d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0221  */
    /* JADX WARN: Code duplicated, block: B:95:0x022e  */
    /* JADX WARN: Code duplicated, block: B:97:0x023c  */
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
    public static final void HeightWeightGroupedFormField(Modifier modifier, HeightWeightGroupedField groupedField, final InterfaceC4351m onOpenBottomSheet, Function1 function1, boolean z4, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        int i16;
        boolean z13;
        int i17;
        int i18;
        boolean z14;
        Modifier modifier3;
        Function1 function3;
        boolean z15;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        C28676v0 c28676v0;
        boolean z16;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Float fM125915y;
        float fFloatValue;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0213j c0213j2;
        Function1 function4;
        C0213j c0213j3;
        int iHashCode2;
        int i19;
        boolean z17;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        final InterfaceC28601c1 interfaceC28601c3;
        boolean z18;
        Object objM87133R3;
        int iHashCode3;
        C0209i c0209i2;
        int iHashCode4;
        int i24;
        boolean z19;
        Object objM87133R4;
        C0209i c0209i3;
        int iHashCode5;
        boolean z24;
        Object objM87133R5;
        Object objM87133R6;
        AbstractC22676k.m65750j(groupedField, "groupedField");
        AbstractC22676k.m65750j(onOpenBottomSheet, "onOpenBottomSheet");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1085826377);
        int i25 = i14 & 1;
        if (i25 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(groupedField) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onOpenBottomSheet) ? 256 : 128;
        }
        int i26 = i14 & 8;
        if (i26 == 0) {
            if ((i13 & 3072) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    z13 = z4;
                    if (c28655q.m87155h(z13)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                i18 = i15;
                if ((i18 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i18 & 1, z14)) {
                    c2314t = C2314t.f9131w;
                    if (i25 != 0) {
                        modifier2 = c2314t;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C9779c(3);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function2 = (Function1) objM87133R6;
                    }
                    if (i16 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(groupedField.getUnitSystem());
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    boolean zIsImperial = UnitSystemExtKt.isImperial(HeightWeightGroupedFormField$lambda$2(interfaceC28601c1));
                    fM125915y = AbstractC39420x.m125915y(groupedField.getCurrentHeightValue());
                    if (fM125915y != null) {
                        fFloatValue = fM125915y.floatValue();
                    } else {
                        fFloatValue = 0.0f;
                    }
                    Float fM125915y2 = AbstractC39420x.m125915y(groupedField.getCurrentWeightValue());
                    float fFloatValue2 = fM125915y2 != null ? fM125915y2.floatValue() : 0.0f;
                    C11503a c11503a = C11503a.f37005a;
                    int iM30924m = c11503a.m30924m(fFloatValue2);
                    C23465k c23465kM30919h = c11503a.m30919h(fFloatValue, zIsImperial);
                    TextResource textResource = (TextResource) c23465kM30919h.f92937w;
                    TextResource textResource2 = (TextResource) c23465kM30919h.f92938x;
                    C23465k c23465kM30920i = c11503a.m30920i(iM30924m, zIsImperial);
                    TextResource textResource3 = (TextResource) c23465kM30920i.f92937w;
                    TextResource textResource4 = (TextResource) c23465kM30920i.f92938x;
                    C22957g c22957g = AbstractC22977m.f90652c;
                    C2305k c2305k = C2299e.f9110M;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                    Modifier modifier4 = modifier2;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i4 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a);
                    C0209i c0209i5 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        c0213j2 = c0213j;
                    } else {
                        c0213j2 = c0213j;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i6 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N);
                        TextResource textResourceM21278l = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_units_label));
                        int i27 = TextResource.$stable;
                        function4 = function2;
                        c0213j3 = c0213j2;
                        AbstractC30785d.m94660b(textResourceM21278l, null, null, c28655q, i27, 6);
                        float f13 = 8;
                        AbstractC11266d.m30469w((float) 0.5d, f13, c2314t, c28655q);
                        float f14 = 4;
                        float f15 = 3 * f14;
                        C38072d c38072d = C38072d.f163053a;
                        int i28 = C38072d.f163054b;
                        Modifier modifierM3394p = AbstractC1099a.m3394p(f14, AbstractC1092a.m3358c(AbstractC15751g.m44455h(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, c2314t), AbstractC33253j.m105489e(f15)), 1, c38072d.m121949b(c28655q, i28).getBlack30(), AbstractC33253j.m105489e(f15)), c38072d.m121949b(c28655q, i28).getBlack30(), AbstractC17918w0.f69621a));
                        C22971k c22971kM66746i = AbstractC22977m.m66746i(f14);
                        C2306l c2306l = C2299e.f9107J;
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22971kM66746i, c2306l, c28655q, 6);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j3);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, c22994r1M66759a);
                        AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m2);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N2);
                        String strM92103Y = AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_imperial_label);
                        i19 = i18 & 7168;
                        if (i19 == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (!z17 || objM87133R2 == c28676v0) {
                            interfaceC28601c2 = interfaceC28601c1;
                            objM87133R2 = new C3590i(function4, interfaceC28601c2, 5);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            interfaceC28601c2 = interfaceC28601c1;
                        }
                        C23000t1 c23000t1 = C23000t1.f90727a;
                        interfaceC28601c3 = interfaceC28601c2;
                        UnitToggleButton(strM92103Y, zIsImperial, (InterfaceC4339a) objM87133R2, AbstractC15676d.m44101d(c23000t1.mo66772c(c2314t, true, 1.0f), "edit_profile_unit_imperial"), c28655q, 0, 0);
                        String strM92103Y2 = AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_metric_label);
                        boolean z25 = !zIsImperial;
                        if (i19 == 2048) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z18 || objM87133R3 == c28676v0) {
                            objM87133R3 = new C3590i(function4, interfaceC28601c3, 6);
                            c28655q.m87172p0(objM87133R3);
                        }
                        UnitToggleButton(strM92103Y2, z25, (InterfaceC4339a) objM87133R3, AbstractC15676d.m44101d(c23000t1.mo66772c(c2314t, true, 1.0f), "edit_profile_unit_metric"), c28655q, 0, 0);
                        c28655q.m87173q(true);
                        float f16 = 2 * f13;
                        Modifier modifierM91835e = AbstractC30007c.m91835e(c2314t, f16, c28655q, c2314t, 1.0f);
                        C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f16), c2306l, c28655q, 6);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM91835e);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j3);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, c22994r1M66759a2);
                        AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m3);
                        if (c28655q.f115903S && AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                            c0209i2 = c0209i;
                        } else {
                            c0209i2 = c0209i;
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N3);
                        Modifier modifierMo66772c = c23000t1.mo66772c(c2314t, true, 1.0f);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierMo66772c);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j3);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m4);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N4);
                        AbstractC30785d.m94660b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_height_label)), null, null, c28655q, i27, 6);
                        Modifier modifierM44101d = AbstractC15676d.m44101d(c2314t, "edit_profile_height_field");
                        String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, i27);
                        String strM21274h2 = AbstractC8693b.m21274h(textResource2, c28655q, i27);
                        i24 = i18 & 896;
                        if (i24 == 256) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        objM87133R4 = c28655q.m87133R();
                        if (z19 || objM87133R4 == c28676v0) {
                            final int i29 = 0;
                            objM87133R4 = new InterfaceC4339a() { // from class: com.whoop.profile.view.edit.form.e
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i29) {
                                        case 0:
                                            return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$0$0$0(onOpenBottomSheet, interfaceC28601c3);
                                        default:
                                            return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$1$0$0(onOpenBottomSheet, interfaceC28601c3);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R4);
                        }
                        int i34 = 458752 & (i18 << 3);
                        boolean z26 = z16;
                        c0209i3 = c0209i2;
                        ClickableFormFieldContent(modifierM44101d, strM21274h, (InterfaceC4339a) objM87133R4, strM21274h2, false, z26, c28655q, i34, 16);
                        c28655q.m87173q(true);
                        Modifier modifierMo66772c2 = c23000t1.mo66772c(c2314t, true, 1.0f);
                        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                        iHashCode5 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierMo66772c2);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j3);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a3);
                        AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m5);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode5))) {
                            AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N5);
                        AbstractC30785d.m94660b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_weight_label)), null, null, c28655q, i27, 6);
                        Modifier modifierM44101d2 = AbstractC15676d.m44101d(c2314t, "edit_profile_weight_field");
                        String strM21274h3 = AbstractC8693b.m21274h(textResource3, c28655q, i27);
                        String strM21274h4 = AbstractC8693b.m21274h(textResource4, c28655q, i27);
                        if (i24 == 256) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        objM87133R5 = c28655q.m87133R();
                        if (z24 || objM87133R5 == c28676v0) {
                            final int i35 = 1;
                            objM87133R5 = new InterfaceC4339a() { // from class: com.whoop.profile.view.edit.form.e
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i35) {
                                        case 0:
                                            return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$0$0$0(onOpenBottomSheet, interfaceC28601c3);
                                        default:
                                            return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$1$0$0(onOpenBottomSheet, interfaceC28601c3);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R5);
                        }
                        z13 = z26;
                        ClickableFormFieldContent(modifierM44101d2, strM21274h3, (InterfaceC4339a) objM87133R5, strM21274h4, false, z13, c28655q, i34, 16);
                        c28655q = c28655q;
                        AbstractC25012a.m73392y(c28655q, true, true, true);
                        modifier3 = modifier4;
                        function3 = function4;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    C0209i c0209i7 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N);
                    TextResource textResourceM21278l2 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_units_label));
                    int i210 = TextResource.$stable;
                    function4 = function2;
                    c0213j3 = c0213j2;
                    AbstractC30785d.m94660b(textResourceM21278l2, null, null, c28655q, i210, 6);
                    float f17 = 8;
                    AbstractC11266d.m30469w((float) 0.5d, f17, c2314t, c28655q);
                    float f18 = 4;
                    float f19 = 3 * f18;
                    C38072d c38072d2 = C38072d.f163053a;
                    int i211 = C38072d.f163054b;
                    Modifier modifierM3394p2 = AbstractC1099a.m3394p(f18, AbstractC1092a.m3358c(AbstractC15751g.m44455h(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, c2314t), AbstractC33253j.m105489e(f19)), 1, c38072d2.m121949b(c28655q, i211).getBlack30(), AbstractC33253j.m105489e(f19)), c38072d2.m121949b(c28655q, i211).getBlack30(), AbstractC17918w0.f69621a));
                    C22971k c22971kM66746i2 = AbstractC22977m.m66746i(f18);
                    C2306l c2306l2 = C2299e.f9107J;
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22971kM66746i2, c2306l2, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, c22994r1M66759a3);
                    AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m6);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N6);
                    String strM92103Y3 = AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_imperial_label);
                    i19 = i18 & 7168;
                    if (i19 == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z17) {
                        interfaceC28601c2 = interfaceC28601c1;
                        objM87133R2 = new C3590i(function4, interfaceC28601c2, 5);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        interfaceC28601c2 = interfaceC28601c1;
                        objM87133R2 = new C3590i(function4, interfaceC28601c2, 5);
                        c28655q.m87172p0(objM87133R2);
                    }
                    C23000t1 c23000t2 = C23000t1.f90727a;
                    interfaceC28601c3 = interfaceC28601c2;
                    UnitToggleButton(strM92103Y3, zIsImperial, (InterfaceC4339a) objM87133R2, AbstractC15676d.m44101d(c23000t2.mo66772c(c2314t, true, 1.0f), "edit_profile_unit_imperial"), c28655q, 0, 0);
                    String strM92103Y4 = AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_metric_label);
                    boolean z27 = !zIsImperial;
                    if (i19 == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z18) {
                        objM87133R3 = new C3590i(function4, interfaceC28601c3, 6);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C3590i(function4, interfaceC28601c3, 6);
                        c28655q.m87172p0(objM87133R3);
                    }
                    UnitToggleButton(strM92103Y4, z27, (InterfaceC4339a) objM87133R3, AbstractC15676d.m44101d(c23000t2.mo66772c(c2314t, true, 1.0f), "edit_profile_unit_metric"), c28655q, 0, 0);
                    c28655q.m87173q(true);
                    float f110 = 2 * f17;
                    Modifier modifierM91835e2 = AbstractC30007c.m91835e(c2314t, f110, c28655q, c2314t, 1.0f);
                    C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f110), c2306l2, c28655q, 6);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM91835e2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, c22994r1M66759a4);
                    AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m7);
                    if (c28655q.f115903S) {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    } else {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N7);
                    Modifier modifierMo66772c3 = c23000t2.mo66772c(c2314t, true, 1.0f);
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierMo66772c3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a4);
                    AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m8);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N8);
                    AbstractC30785d.m94660b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_height_label)), null, null, c28655q, i210, 6);
                    Modifier modifierM44101d3 = AbstractC15676d.m44101d(c2314t, "edit_profile_height_field");
                    String strM21274h5 = AbstractC8693b.m21274h(textResource, c28655q, i210);
                    String strM21274h6 = AbstractC8693b.m21274h(textResource2, c28655q, i210);
                    i24 = i18 & 896;
                    if (i24 == 256) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objM87133R4 = c28655q.m87133R();
                    if (z19) {
                        final int i212 = 0;
                        objM87133R4 = new InterfaceC4339a() { // from class: com.whoop.profile.view.edit.form.e
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i212) {
                                    case 0:
                                        return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$0$0$0(onOpenBottomSheet, interfaceC28601c3);
                                    default:
                                        return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$1$0$0(onOpenBottomSheet, interfaceC28601c3);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        final int i213 = 0;
                        objM87133R4 = new InterfaceC4339a() { // from class: com.whoop.profile.view.edit.form.e
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i213) {
                                    case 0:
                                        return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$0$0$0(onOpenBottomSheet, interfaceC28601c3);
                                    default:
                                        return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$1$0$0(onOpenBottomSheet, interfaceC28601c3);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R4);
                    }
                    int i36 = 458752 & (i18 << 3);
                    boolean z28 = z16;
                    c0209i3 = c0209i2;
                    ClickableFormFieldContent(modifierM44101d3, strM21274h5, (InterfaceC4339a) objM87133R4, strM21274h6, false, z28, c28655q, i36, 16);
                    c28655q.m87173q(true);
                    Modifier modifierMo66772c4 = c23000t2.mo66772c(c2314t, true, 1.0f);
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                    iHashCode5 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierMo66772c4);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m9);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N9);
                    AbstractC30785d.m94660b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_weight_label)), null, null, c28655q, i210, 6);
                    Modifier modifierM44101d4 = AbstractC15676d.m44101d(c2314t, "edit_profile_weight_field");
                    String strM21274h7 = AbstractC8693b.m21274h(textResource3, c28655q, i210);
                    String strM21274h8 = AbstractC8693b.m21274h(textResource4, c28655q, i210);
                    if (i24 == 256) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    objM87133R5 = c28655q.m87133R();
                    if (z24) {
                        final int i37 = 1;
                        objM87133R5 = new InterfaceC4339a() { // from class: com.whoop.profile.view.edit.form.e
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i37) {
                                    case 0:
                                        return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$0$0$0(onOpenBottomSheet, interfaceC28601c3);
                                    default:
                                        return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$1$0$0(onOpenBottomSheet, interfaceC28601c3);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        final int i38 = 1;
                        objM87133R5 = new InterfaceC4339a() { // from class: com.whoop.profile.view.edit.form.e
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i38) {
                                    case 0:
                                        return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$0$0$0(onOpenBottomSheet, interfaceC28601c3);
                                    default:
                                        return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$1$0$0(onOpenBottomSheet, interfaceC28601c3);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R5);
                    }
                    z13 = z28;
                    ClickableFormFieldContent(modifierM44101d4, strM21274h7, (InterfaceC4339a) objM87133R5, strM21274h8, false, z13, c28655q, i36, 16);
                    c28655q = c28655q;
                    AbstractC25012a.m73392y(c28655q, true, true, true);
                    modifier3 = modifier4;
                    function3 = function4;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    function3 = function2;
                }
                z15 = z13;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3195g((Object) modifier3, (Object) groupedField, (Object) onOpenBottomSheet, function3, z15, i13, i14, 4);
                }
            }
            i15 |= 24576;
            z13 = z4;
            i18 = i15;
            if ((i18 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i18 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i25 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C9779c(3);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function2 = (Function1) objM87133R6;
                }
                if (i16 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(groupedField.getUnitSystem());
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                boolean zIsImperial2 = UnitSystemExtKt.isImperial(HeightWeightGroupedFormField$lambda$2(interfaceC28601c1));
                fM125915y = AbstractC39420x.m125915y(groupedField.getCurrentHeightValue());
                if (fM125915y != null) {
                    fFloatValue = fM125915y.floatValue();
                } else {
                    fFloatValue = 0.0f;
                }
                Float fM125915y3 = AbstractC39420x.m125915y(groupedField.getCurrentWeightValue());
                if (fM125915y3 != null) {
                }
                C11503a c11503a2 = C11503a.f37005a;
                int iM30924m2 = c11503a2.m30924m(fFloatValue2);
                C23465k c23465kM30919h2 = c11503a2.m30919h(fFloatValue, zIsImperial2);
                TextResource textResource5 = (TextResource) c23465kM30919h2.f92937w;
                TextResource textResource6 = (TextResource) c23465kM30919h2.f92938x;
                C23465k c23465kM30920i2 = c11503a2.m30920i(iM30924m2, zIsImperial2);
                TextResource textResource7 = (TextResource) c23465kM30920i2.f92937w;
                TextResource textResource8 = (TextResource) c23465kM30920i2.f92938x;
                C22957g c22957g2 = AbstractC22977m.f90652c;
                C2305k c2305k2 = C2299e.f9110M;
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
                Modifier modifier5 = modifier2;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifier5);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i8 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a6);
                C0209i c0209i9 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m10);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    c0213j2 = c0213j;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i10 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N10);
                    TextResource textResourceM21278l3 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_units_label));
                    int i214 = TextResource.$stable;
                    function4 = function2;
                    c0213j3 = c0213j2;
                    AbstractC30785d.m94660b(textResourceM21278l3, null, null, c28655q, i214, 6);
                    float f111 = 8;
                    AbstractC11266d.m30469w((float) 0.5d, f111, c2314t, c28655q);
                    float f112 = 4;
                    float f113 = 3 * f112;
                    C38072d c38072d3 = C38072d.f163053a;
                    int i215 = C38072d.f163054b;
                    Modifier modifierM3394p3 = AbstractC1099a.m3394p(f112, AbstractC1092a.m3358c(AbstractC15751g.m44455h(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, c2314t), AbstractC33253j.m105489e(f113)), 1, c38072d3.m121949b(c28655q, i215).getBlack30(), AbstractC33253j.m105489e(f113)), c38072d3.m121949b(c28655q, i215).getBlack30(), AbstractC17918w0.f69621a));
                    C22971k c22971kM66746i3 = AbstractC22977m.m66746i(f112);
                    C2306l c2306l3 = C2299e.f9107J;
                    C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(c22971kM66746i3, c2306l3, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3394p3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i8, c22994r1M66759a5);
                    AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m11);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N11);
                    String strM92103Y5 = AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_imperial_label);
                    i19 = i18 & 7168;
                    if (i19 == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z17) {
                        interfaceC28601c2 = interfaceC28601c1;
                        objM87133R2 = new C3590i(function4, interfaceC28601c2, 5);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        interfaceC28601c2 = interfaceC28601c1;
                        objM87133R2 = new C3590i(function4, interfaceC28601c2, 5);
                        c28655q.m87172p0(objM87133R2);
                    }
                    C23000t1 c23000t3 = C23000t1.f90727a;
                    interfaceC28601c3 = interfaceC28601c2;
                    UnitToggleButton(strM92103Y5, zIsImperial2, (InterfaceC4339a) objM87133R2, AbstractC15676d.m44101d(c23000t3.mo66772c(c2314t, true, 1.0f), "edit_profile_unit_imperial"), c28655q, 0, 0);
                    String strM92103Y6 = AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_metric_label);
                    boolean z29 = !zIsImperial2;
                    if (i19 == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z18) {
                        objM87133R3 = new C3590i(function4, interfaceC28601c3, 6);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C3590i(function4, interfaceC28601c3, 6);
                        c28655q.m87172p0(objM87133R3);
                    }
                    UnitToggleButton(strM92103Y6, z29, (InterfaceC4339a) objM87133R3, AbstractC15676d.m44101d(c23000t3.mo66772c(c2314t, true, 1.0f), "edit_profile_unit_metric"), c28655q, 0, 0);
                    c28655q.m87173q(true);
                    float f114 = 2 * f111;
                    Modifier modifierM91835e3 = AbstractC30007c.m91835e(c2314t, f114, c28655q, c2314t, 1.0f);
                    C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f114), c2306l3, c28655q, 6);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM91835e3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i8, c22994r1M66759a6);
                    AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m12);
                    if (c28655q.f115903S) {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    } else {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N12);
                    Modifier modifierMo66772c5 = c23000t3.mo66772c(c2314t, true, 1.0f);
                    C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierMo66772c5);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a7);
                    AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m13);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N13);
                    AbstractC30785d.m94660b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_height_label)), null, null, c28655q, i214, 6);
                    Modifier modifierM44101d5 = AbstractC15676d.m44101d(c2314t, "edit_profile_height_field");
                    String strM21274h9 = AbstractC8693b.m21274h(textResource5, c28655q, i214);
                    String strM21274h10 = AbstractC8693b.m21274h(textResource6, c28655q, i214);
                    i24 = i18 & 896;
                    if (i24 == 256) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objM87133R4 = c28655q.m87133R();
                    if (z19) {
                        final int i216 = 0;
                        objM87133R4 = new InterfaceC4339a() { // from class: com.whoop.profile.view.edit.form.e
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i216) {
                                    case 0:
                                        return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$0$0$0(onOpenBottomSheet, interfaceC28601c3);
                                    default:
                                        return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$1$0$0(onOpenBottomSheet, interfaceC28601c3);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        final int i217 = 0;
                        objM87133R4 = new InterfaceC4339a() { // from class: com.whoop.profile.view.edit.form.e
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i217) {
                                    case 0:
                                        return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$0$0$0(onOpenBottomSheet, interfaceC28601c3);
                                    default:
                                        return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$1$0$0(onOpenBottomSheet, interfaceC28601c3);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R4);
                    }
                    int i39 = 458752 & (i18 << 3);
                    boolean z210 = z16;
                    c0209i3 = c0209i2;
                    ClickableFormFieldContent(modifierM44101d5, strM21274h9, (InterfaceC4339a) objM87133R4, strM21274h10, false, z210, c28655q, i39, 16);
                    c28655q.m87173q(true);
                    Modifier modifierMo66772c6 = c23000t3.mo66772c(c2314t, true, 1.0f);
                    C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
                    iHashCode5 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierMo66772c6);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a8);
                    AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m14);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N14);
                    AbstractC30785d.m94660b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_weight_label)), null, null, c28655q, i214, 6);
                    Modifier modifierM44101d6 = AbstractC15676d.m44101d(c2314t, "edit_profile_weight_field");
                    String strM21274h11 = AbstractC8693b.m21274h(textResource7, c28655q, i214);
                    String strM21274h12 = AbstractC8693b.m21274h(textResource8, c28655q, i214);
                    if (i24 == 256) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    objM87133R5 = c28655q.m87133R();
                    if (z24) {
                        final int i310 = 1;
                        objM87133R5 = new InterfaceC4339a() { // from class: com.whoop.profile.view.edit.form.e
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i310) {
                                    case 0:
                                        return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$0$0$0(onOpenBottomSheet, interfaceC28601c3);
                                    default:
                                        return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$1$0$0(onOpenBottomSheet, interfaceC28601c3);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        final int i311 = 1;
                        objM87133R5 = new InterfaceC4339a() { // from class: com.whoop.profile.view.edit.form.e
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i311) {
                                    case 0:
                                        return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$0$0$0(onOpenBottomSheet, interfaceC28601c3);
                                    default:
                                        return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$1$0$0(onOpenBottomSheet, interfaceC28601c3);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R5);
                    }
                    z13 = z210;
                    ClickableFormFieldContent(modifierM44101d6, strM21274h11, (InterfaceC4339a) objM87133R5, strM21274h12, false, z13, c28655q, i39, 16);
                    c28655q = c28655q;
                    AbstractC25012a.m73392y(c28655q, true, true, true);
                    modifier3 = modifier5;
                    function3 = function4;
                } else {
                    c0213j2 = c0213j;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i11 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i11, modifierM118962N10);
                TextResource textResourceM21278l4 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_units_label));
                int i218 = TextResource.$stable;
                function4 = function2;
                c0213j3 = c0213j2;
                AbstractC30785d.m94660b(textResourceM21278l4, null, null, c28655q, i218, 6);
                float f115 = 8;
                AbstractC11266d.m30469w((float) 0.5d, f115, c2314t, c28655q);
                float f116 = 4;
                float f117 = 3 * f116;
                C38072d c38072d4 = C38072d.f163053a;
                int i219 = C38072d.f163054b;
                Modifier modifierM3394p4 = AbstractC1099a.m3394p(f116, AbstractC1092a.m3358c(AbstractC15751g.m44455h(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, c2314t), AbstractC33253j.m105489e(f117)), 1, c38072d4.m121949b(c28655q, i219).getBlack30(), AbstractC33253j.m105489e(f117)), c38072d4.m121949b(c28655q, i219).getBlack30(), AbstractC17918w0.f69621a));
                C22971k c22971kM66746i4 = AbstractC22977m.m66746i(f116);
                C2306l c2306l4 = C2299e.f9107J;
                C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(c22971kM66746i4, c2306l4, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM3394p4);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j3);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, c22994r1M66759a7);
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m15);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i11, modifierM118962N15);
                String strM92103Y7 = AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_imperial_label);
                i19 = i18 & 7168;
                if (i19 == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z17) {
                    interfaceC28601c2 = interfaceC28601c1;
                    objM87133R2 = new C3590i(function4, interfaceC28601c2, 5);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    interfaceC28601c2 = interfaceC28601c1;
                    objM87133R2 = new C3590i(function4, interfaceC28601c2, 5);
                    c28655q.m87172p0(objM87133R2);
                }
                C23000t1 c23000t4 = C23000t1.f90727a;
                interfaceC28601c3 = interfaceC28601c2;
                UnitToggleButton(strM92103Y7, zIsImperial2, (InterfaceC4339a) objM87133R2, AbstractC15676d.m44101d(c23000t4.mo66772c(c2314t, true, 1.0f), "edit_profile_unit_imperial"), c28655q, 0, 0);
                String strM92103Y8 = AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_metric_label);
                boolean z211 = !zIsImperial2;
                if (i19 == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z18) {
                    objM87133R3 = new C3590i(function4, interfaceC28601c3, 6);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C3590i(function4, interfaceC28601c3, 6);
                    c28655q.m87172p0(objM87133R3);
                }
                UnitToggleButton(strM92103Y8, z211, (InterfaceC4339a) objM87133R3, AbstractC15676d.m44101d(c23000t4.mo66772c(c2314t, true, 1.0f), "edit_profile_unit_metric"), c28655q, 0, 0);
                c28655q.m87173q(true);
                float f118 = 2 * f115;
                Modifier modifierM91835e4 = AbstractC30007c.m91835e(c2314t, f118, c28655q, c2314t, 1.0f);
                C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f118), c2306l4, c28655q, 6);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM91835e4);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j3);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, c22994r1M66759a8);
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m16);
                if (c28655q.f115903S) {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                } else {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i11, modifierM118962N16);
                Modifier modifierMo66772c7 = c23000t4.mo66772c(c2314t, true, 1.0f);
                C23010x c23010xM66775a9 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q.m87165m();
                Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q, modifierMo66772c7);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j3);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a9);
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m17);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i11, modifierM118962N17);
                AbstractC30785d.m94660b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_height_label)), null, null, c28655q, i218, 6);
                Modifier modifierM44101d7 = AbstractC15676d.m44101d(c2314t, "edit_profile_height_field");
                String strM21274h13 = AbstractC8693b.m21274h(textResource5, c28655q, i218);
                String strM21274h14 = AbstractC8693b.m21274h(textResource6, c28655q, i218);
                i24 = i18 & 896;
                if (i24 == 256) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objM87133R4 = c28655q.m87133R();
                if (z19) {
                    final int i2110 = 0;
                    objM87133R4 = new InterfaceC4339a() { // from class: com.whoop.profile.view.edit.form.e
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i2110) {
                                case 0:
                                    return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$0$0$0(onOpenBottomSheet, interfaceC28601c3);
                                default:
                                    return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$1$0$0(onOpenBottomSheet, interfaceC28601c3);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R4);
                } else {
                    final int i2111 = 0;
                    objM87133R4 = new InterfaceC4339a() { // from class: com.whoop.profile.view.edit.form.e
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i2111) {
                                case 0:
                                    return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$0$0$0(onOpenBottomSheet, interfaceC28601c3);
                                default:
                                    return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$1$0$0(onOpenBottomSheet, interfaceC28601c3);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R4);
                }
                int i312 = 458752 & (i18 << 3);
                boolean z212 = z16;
                c0209i3 = c0209i2;
                ClickableFormFieldContent(modifierM44101d7, strM21274h13, (InterfaceC4339a) objM87133R4, strM21274h14, false, z212, c28655q, i312, 16);
                c28655q.m87173q(true);
                Modifier modifierMo66772c8 = c23000t4.mo66772c(c2314t, true, 1.0f);
                C23010x c23010xM66775a10 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
                iHashCode5 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q.m87165m();
                Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q, modifierMo66772c8);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j3);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a10);
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m18);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i11, modifierM118962N18);
                AbstractC30785d.m94660b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_weight_label)), null, null, c28655q, i218, 6);
                Modifier modifierM44101d8 = AbstractC15676d.m44101d(c2314t, "edit_profile_weight_field");
                String strM21274h15 = AbstractC8693b.m21274h(textResource7, c28655q, i218);
                String strM21274h16 = AbstractC8693b.m21274h(textResource8, c28655q, i218);
                if (i24 == 256) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                objM87133R5 = c28655q.m87133R();
                if (z24) {
                    final int i313 = 1;
                    objM87133R5 = new InterfaceC4339a() { // from class: com.whoop.profile.view.edit.form.e
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i313) {
                                case 0:
                                    return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$0$0$0(onOpenBottomSheet, interfaceC28601c3);
                                default:
                                    return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$1$0$0(onOpenBottomSheet, interfaceC28601c3);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R5);
                } else {
                    final int i314 = 1;
                    objM87133R5 = new InterfaceC4339a() { // from class: com.whoop.profile.view.edit.form.e
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i314) {
                                case 0:
                                    return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$0$0$0(onOpenBottomSheet, interfaceC28601c3);
                                default:
                                    return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$1$0$0(onOpenBottomSheet, interfaceC28601c3);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R5);
                }
                z13 = z212;
                ClickableFormFieldContent(modifierM44101d8, strM21274h15, (InterfaceC4339a) objM87133R5, strM21274h16, false, z13, c28655q, i312, 16);
                c28655q = c28655q;
                AbstractC25012a.m73392y(c28655q, true, true, true);
                modifier3 = modifier5;
                function3 = function4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            z15 = z13;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3195g((Object) modifier3, (Object) groupedField, (Object) onOpenBottomSheet, function3, z15, i13, i14, 4);
            }
        }
        i15 |= 3072;
        function2 = function1;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                z13 = z4;
                if (c28655q.m87155h(z13)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            i18 = i15;
            if ((i18 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i18 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i25 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C9779c(3);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function2 = (Function1) objM87133R6;
                }
                if (i16 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(groupedField.getUnitSystem());
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                boolean zIsImperial3 = UnitSystemExtKt.isImperial(HeightWeightGroupedFormField$lambda$2(interfaceC28601c1));
                fM125915y = AbstractC39420x.m125915y(groupedField.getCurrentHeightValue());
                if (fM125915y != null) {
                    fFloatValue = fM125915y.floatValue();
                } else {
                    fFloatValue = 0.0f;
                }
                Float fM125915y4 = AbstractC39420x.m125915y(groupedField.getCurrentWeightValue());
                if (fM125915y4 != null) {
                }
                C11503a c11503a3 = C11503a.f37005a;
                int iM30924m3 = c11503a3.m30924m(fFloatValue2);
                C23465k c23465kM30919h3 = c11503a3.m30919h(fFloatValue, zIsImperial3);
                TextResource textResource9 = (TextResource) c23465kM30919h3.f92937w;
                TextResource textResource10 = (TextResource) c23465kM30919h3.f92938x;
                C23465k c23465kM30920i3 = c11503a3.m30920i(iM30924m3, zIsImperial3);
                TextResource textResource11 = (TextResource) c23465kM30920i3.f92937w;
                TextResource textResource12 = (TextResource) c23465kM30920i3.f92938x;
                C22957g c22957g3 = AbstractC22977m.f90652c;
                C2305k c2305k3 = C2299e.f9110M;
                C23010x c23010xM66775a11 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q, 0);
                Modifier modifier6 = modifier2;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q.m87165m();
                Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q, modifier6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i12 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i12, c23010xM66775a11);
                C0209i c0209i13 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i13, interfaceC28653p1M87165m19);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    c0213j2 = c0213j;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i14 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i14, modifierM118962N19);
                    TextResource textResourceM21278l5 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_units_label));
                    int i2112 = TextResource.$stable;
                    function4 = function2;
                    c0213j3 = c0213j2;
                    AbstractC30785d.m94660b(textResourceM21278l5, null, null, c28655q, i2112, 6);
                    float f119 = 8;
                    AbstractC11266d.m30469w((float) 0.5d, f119, c2314t, c28655q);
                    float f1110 = 4;
                    float f1111 = 3 * f1110;
                    C38072d c38072d5 = C38072d.f163053a;
                    int i2113 = C38072d.f163054b;
                    Modifier modifierM3394p5 = AbstractC1099a.m3394p(f1110, AbstractC1092a.m3358c(AbstractC15751g.m44455h(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, c2314t), AbstractC33253j.m105489e(f1111)), 1, c38072d5.m121949b(c28655q, i2113).getBlack30(), AbstractC33253j.m105489e(f1111)), c38072d5.m121949b(c28655q, i2113).getBlack30(), AbstractC17918w0.f69621a));
                    C22971k c22971kM66746i5 = AbstractC22977m.m66746i(f1110);
                    C2306l c2306l5 = C2299e.f9107J;
                    C22994r1 c22994r1M66759a9 = AbstractC22988p1.m66759a(c22971kM66746i5, c2306l5, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q.m87165m();
                    Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q, modifierM3394p5);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i12, c22994r1M66759a9);
                    AbstractC28683x.m87239G(c28655q, c0209i13, interfaceC28653p1M87165m110);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i14, modifierM118962N110);
                    String strM92103Y9 = AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_imperial_label);
                    i19 = i18 & 7168;
                    if (i19 == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z17) {
                        interfaceC28601c2 = interfaceC28601c1;
                        objM87133R2 = new C3590i(function4, interfaceC28601c2, 5);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        interfaceC28601c2 = interfaceC28601c1;
                        objM87133R2 = new C3590i(function4, interfaceC28601c2, 5);
                        c28655q.m87172p0(objM87133R2);
                    }
                    C23000t1 c23000t5 = C23000t1.f90727a;
                    interfaceC28601c3 = interfaceC28601c2;
                    UnitToggleButton(strM92103Y9, zIsImperial3, (InterfaceC4339a) objM87133R2, AbstractC15676d.m44101d(c23000t5.mo66772c(c2314t, true, 1.0f), "edit_profile_unit_imperial"), c28655q, 0, 0);
                    String strM92103Y10 = AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_metric_label);
                    boolean z213 = !zIsImperial3;
                    if (i19 == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z18) {
                        objM87133R3 = new C3590i(function4, interfaceC28601c3, 6);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C3590i(function4, interfaceC28601c3, 6);
                        c28655q.m87172p0(objM87133R3);
                    }
                    UnitToggleButton(strM92103Y10, z213, (InterfaceC4339a) objM87133R3, AbstractC15676d.m44101d(c23000t5.mo66772c(c2314t, true, 1.0f), "edit_profile_unit_metric"), c28655q, 0, 0);
                    c28655q.m87173q(true);
                    float f1112 = 2 * f119;
                    Modifier modifierM91835e5 = AbstractC30007c.m91835e(c2314t, f1112, c28655q, c2314t, 1.0f);
                    C22994r1 c22994r1M66759a10 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f1112), c2306l5, c28655q, 6);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q.m87165m();
                    Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q, modifierM91835e5);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i12, c22994r1M66759a10);
                    AbstractC28683x.m87239G(c28655q, c0209i13, interfaceC28653p1M87165m111);
                    if (c28655q.f115903S) {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    } else {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i14, modifierM118962N111);
                    Modifier modifierMo66772c9 = c23000t5.mo66772c(c2314t, true, 1.0f);
                    C23010x c23010xM66775a12 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q, 0);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q.m87165m();
                    Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q, modifierMo66772c9);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i12, c23010xM66775a12);
                    AbstractC28683x.m87239G(c28655q, c0209i13, interfaceC28653p1M87165m112);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i14, modifierM118962N112);
                    AbstractC30785d.m94660b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_height_label)), null, null, c28655q, i2112, 6);
                    Modifier modifierM44101d9 = AbstractC15676d.m44101d(c2314t, "edit_profile_height_field");
                    String strM21274h17 = AbstractC8693b.m21274h(textResource9, c28655q, i2112);
                    String strM21274h18 = AbstractC8693b.m21274h(textResource10, c28655q, i2112);
                    i24 = i18 & 896;
                    if (i24 == 256) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objM87133R4 = c28655q.m87133R();
                    if (z19) {
                        final int i2114 = 0;
                        objM87133R4 = new InterfaceC4339a() { // from class: com.whoop.profile.view.edit.form.e
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2114) {
                                    case 0:
                                        return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$0$0$0(onOpenBottomSheet, interfaceC28601c3);
                                    default:
                                        return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$1$0$0(onOpenBottomSheet, interfaceC28601c3);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        final int i2115 = 0;
                        objM87133R4 = new InterfaceC4339a() { // from class: com.whoop.profile.view.edit.form.e
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2115) {
                                    case 0:
                                        return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$0$0$0(onOpenBottomSheet, interfaceC28601c3);
                                    default:
                                        return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$1$0$0(onOpenBottomSheet, interfaceC28601c3);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R4);
                    }
                    int i315 = 458752 & (i18 << 3);
                    boolean z214 = z16;
                    c0209i3 = c0209i2;
                    ClickableFormFieldContent(modifierM44101d9, strM21274h17, (InterfaceC4339a) objM87133R4, strM21274h18, false, z214, c28655q, i315, 16);
                    c28655q.m87173q(true);
                    Modifier modifierMo66772c10 = c23000t5.mo66772c(c2314t, true, 1.0f);
                    C23010x c23010xM66775a13 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q, 0);
                    iHashCode5 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q.m87165m();
                    Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q, modifierMo66772c10);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i12, c23010xM66775a13);
                    AbstractC28683x.m87239G(c28655q, c0209i13, interfaceC28653p1M87165m113);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i14, modifierM118962N113);
                    AbstractC30785d.m94660b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_weight_label)), null, null, c28655q, i2112, 6);
                    Modifier modifierM44101d10 = AbstractC15676d.m44101d(c2314t, "edit_profile_weight_field");
                    String strM21274h19 = AbstractC8693b.m21274h(textResource11, c28655q, i2112);
                    String strM21274h110 = AbstractC8693b.m21274h(textResource12, c28655q, i2112);
                    if (i24 == 256) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    objM87133R5 = c28655q.m87133R();
                    if (z24) {
                        final int i316 = 1;
                        objM87133R5 = new InterfaceC4339a() { // from class: com.whoop.profile.view.edit.form.e
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i316) {
                                    case 0:
                                        return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$0$0$0(onOpenBottomSheet, interfaceC28601c3);
                                    default:
                                        return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$1$0$0(onOpenBottomSheet, interfaceC28601c3);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        final int i317 = 1;
                        objM87133R5 = new InterfaceC4339a() { // from class: com.whoop.profile.view.edit.form.e
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i317) {
                                    case 0:
                                        return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$0$0$0(onOpenBottomSheet, interfaceC28601c3);
                                    default:
                                        return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$1$0$0(onOpenBottomSheet, interfaceC28601c3);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R5);
                    }
                    z13 = z214;
                    ClickableFormFieldContent(modifierM44101d10, strM21274h19, (InterfaceC4339a) objM87133R5, strM21274h110, false, z13, c28655q, i315, 16);
                    c28655q = c28655q;
                    AbstractC25012a.m73392y(c28655q, true, true, true);
                    modifier3 = modifier6;
                    function3 = function4;
                } else {
                    c0213j2 = c0213j;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i15 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i15, modifierM118962N19);
                TextResource textResourceM21278l6 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_units_label));
                int i2116 = TextResource.$stable;
                function4 = function2;
                c0213j3 = c0213j2;
                AbstractC30785d.m94660b(textResourceM21278l6, null, null, c28655q, i2116, 6);
                float f1113 = 8;
                AbstractC11266d.m30469w((float) 0.5d, f1113, c2314t, c28655q);
                float f1114 = 4;
                float f1115 = 3 * f1114;
                C38072d c38072d6 = C38072d.f163053a;
                int i2117 = C38072d.f163054b;
                Modifier modifierM3394p6 = AbstractC1099a.m3394p(f1114, AbstractC1092a.m3358c(AbstractC15751g.m44455h(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, c2314t), AbstractC33253j.m105489e(f1115)), 1, c38072d6.m121949b(c28655q, i2117).getBlack30(), AbstractC33253j.m105489e(f1115)), c38072d6.m121949b(c28655q, i2117).getBlack30(), AbstractC17918w0.f69621a));
                C22971k c22971kM66746i6 = AbstractC22977m.m66746i(f1114);
                C2306l c2306l6 = C2299e.f9107J;
                C22994r1 c22994r1M66759a11 = AbstractC22988p1.m66759a(c22971kM66746i6, c2306l6, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q.m87165m();
                Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q, modifierM3394p6);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j3);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i12, c22994r1M66759a11);
                AbstractC28683x.m87239G(c28655q, c0209i13, interfaceC28653p1M87165m114);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i15, modifierM118962N114);
                String strM92103Y11 = AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_imperial_label);
                i19 = i18 & 7168;
                if (i19 == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z17) {
                    interfaceC28601c2 = interfaceC28601c1;
                    objM87133R2 = new C3590i(function4, interfaceC28601c2, 5);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    interfaceC28601c2 = interfaceC28601c1;
                    objM87133R2 = new C3590i(function4, interfaceC28601c2, 5);
                    c28655q.m87172p0(objM87133R2);
                }
                C23000t1 c23000t6 = C23000t1.f90727a;
                interfaceC28601c3 = interfaceC28601c2;
                UnitToggleButton(strM92103Y11, zIsImperial3, (InterfaceC4339a) objM87133R2, AbstractC15676d.m44101d(c23000t6.mo66772c(c2314t, true, 1.0f), "edit_profile_unit_imperial"), c28655q, 0, 0);
                String strM92103Y12 = AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_metric_label);
                boolean z215 = !zIsImperial3;
                if (i19 == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z18) {
                    objM87133R3 = new C3590i(function4, interfaceC28601c3, 6);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C3590i(function4, interfaceC28601c3, 6);
                    c28655q.m87172p0(objM87133R3);
                }
                UnitToggleButton(strM92103Y12, z215, (InterfaceC4339a) objM87133R3, AbstractC15676d.m44101d(c23000t6.mo66772c(c2314t, true, 1.0f), "edit_profile_unit_metric"), c28655q, 0, 0);
                c28655q.m87173q(true);
                float f1116 = 2 * f1113;
                Modifier modifierM91835e6 = AbstractC30007c.m91835e(c2314t, f1116, c28655q, c2314t, 1.0f);
                C22994r1 c22994r1M66759a12 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f1116), c2306l6, c28655q, 6);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q.m87165m();
                Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q, modifierM91835e6);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j3);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i12, c22994r1M66759a12);
                AbstractC28683x.m87239G(c28655q, c0209i13, interfaceC28653p1M87165m115);
                if (c28655q.f115903S) {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                } else {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i15, modifierM118962N115);
                Modifier modifierMo66772c11 = c23000t6.mo66772c(c2314t, true, 1.0f);
                C23010x c23010xM66775a14 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q, 0);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q.m87165m();
                Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q, modifierMo66772c11);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j3);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i12, c23010xM66775a14);
                AbstractC28683x.m87239G(c28655q, c0209i13, interfaceC28653p1M87165m116);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i15, modifierM118962N116);
                AbstractC30785d.m94660b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_height_label)), null, null, c28655q, i2116, 6);
                Modifier modifierM44101d11 = AbstractC15676d.m44101d(c2314t, "edit_profile_height_field");
                String strM21274h111 = AbstractC8693b.m21274h(textResource9, c28655q, i2116);
                String strM21274h112 = AbstractC8693b.m21274h(textResource10, c28655q, i2116);
                i24 = i18 & 896;
                if (i24 == 256) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objM87133R4 = c28655q.m87133R();
                if (z19) {
                    final int i2118 = 0;
                    objM87133R4 = new InterfaceC4339a() { // from class: com.whoop.profile.view.edit.form.e
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i2118) {
                                case 0:
                                    return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$0$0$0(onOpenBottomSheet, interfaceC28601c3);
                                default:
                                    return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$1$0$0(onOpenBottomSheet, interfaceC28601c3);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R4);
                } else {
                    final int i2119 = 0;
                    objM87133R4 = new InterfaceC4339a() { // from class: com.whoop.profile.view.edit.form.e
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i2119) {
                                case 0:
                                    return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$0$0$0(onOpenBottomSheet, interfaceC28601c3);
                                default:
                                    return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$1$0$0(onOpenBottomSheet, interfaceC28601c3);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R4);
                }
                int i318 = 458752 & (i18 << 3);
                boolean z216 = z16;
                c0209i3 = c0209i2;
                ClickableFormFieldContent(modifierM44101d11, strM21274h111, (InterfaceC4339a) objM87133R4, strM21274h112, false, z216, c28655q, i318, 16);
                c28655q.m87173q(true);
                Modifier modifierMo66772c12 = c23000t6.mo66772c(c2314t, true, 1.0f);
                C23010x c23010xM66775a15 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q, 0);
                iHashCode5 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q.m87165m();
                Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q, modifierMo66772c12);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j3);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i12, c23010xM66775a15);
                AbstractC28683x.m87239G(c28655q, c0209i13, interfaceC28653p1M87165m117);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i15, modifierM118962N117);
                AbstractC30785d.m94660b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_weight_label)), null, null, c28655q, i2116, 6);
                Modifier modifierM44101d12 = AbstractC15676d.m44101d(c2314t, "edit_profile_weight_field");
                String strM21274h113 = AbstractC8693b.m21274h(textResource11, c28655q, i2116);
                String strM21274h114 = AbstractC8693b.m21274h(textResource12, c28655q, i2116);
                if (i24 == 256) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                objM87133R5 = c28655q.m87133R();
                if (z24) {
                    final int i319 = 1;
                    objM87133R5 = new InterfaceC4339a() { // from class: com.whoop.profile.view.edit.form.e
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i319) {
                                case 0:
                                    return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$0$0$0(onOpenBottomSheet, interfaceC28601c3);
                                default:
                                    return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$1$0$0(onOpenBottomSheet, interfaceC28601c3);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R5);
                } else {
                    final int i3110 = 1;
                    objM87133R5 = new InterfaceC4339a() { // from class: com.whoop.profile.view.edit.form.e
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i3110) {
                                case 0:
                                    return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$0$0$0(onOpenBottomSheet, interfaceC28601c3);
                                default:
                                    return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$1$0$0(onOpenBottomSheet, interfaceC28601c3);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R5);
                }
                z13 = z216;
                ClickableFormFieldContent(modifierM44101d12, strM21274h113, (InterfaceC4339a) objM87133R5, strM21274h114, false, z13, c28655q, i318, 16);
                c28655q = c28655q;
                AbstractC25012a.m73392y(c28655q, true, true, true);
                modifier3 = modifier6;
                function3 = function4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            z15 = z13;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3195g((Object) modifier3, (Object) groupedField, (Object) onOpenBottomSheet, function3, z15, i13, i14, 4);
            }
        }
        i15 |= 24576;
        z13 = z4;
        i18 = i15;
        if ((i18 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i18 & 1, z14)) {
            c2314t = C2314t.f9131w;
            if (i25 != 0) {
                modifier2 = c2314t;
            }
            c28676v0 = C28635l.f115821a;
            if (i26 != 0) {
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C9779c(3);
                    c28655q.m87172p0(objM87133R6);
                }
                function2 = (Function1) objM87133R6;
            }
            if (i16 != 0) {
                z16 = true;
            } else {
                z16 = z13;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(groupedField.getUnitSystem());
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            boolean zIsImperial4 = UnitSystemExtKt.isImperial(HeightWeightGroupedFormField$lambda$2(interfaceC28601c1));
            fM125915y = AbstractC39420x.m125915y(groupedField.getCurrentHeightValue());
            if (fM125915y != null) {
                fFloatValue = fM125915y.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            Float fM125915y5 = AbstractC39420x.m125915y(groupedField.getCurrentWeightValue());
            if (fM125915y5 != null) {
            }
            C11503a c11503a4 = C11503a.f37005a;
            int iM30924m4 = c11503a4.m30924m(fFloatValue2);
            C23465k c23465kM30919h4 = c11503a4.m30919h(fFloatValue, zIsImperial4);
            TextResource textResource13 = (TextResource) c23465kM30919h4.f92937w;
            TextResource textResource14 = (TextResource) c23465kM30919h4.f92938x;
            C23465k c23465kM30920i4 = c11503a4.m30920i(iM30924m4, zIsImperial4);
            TextResource textResource15 = (TextResource) c23465kM30920i4.f92937w;
            TextResource textResource16 = (TextResource) c23465kM30920i4.f92938x;
            C22957g c22957g4 = AbstractC22977m.f90652c;
            C2305k c2305k4 = C2299e.f9110M;
            C23010x c23010xM66775a16 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q, 0);
            Modifier modifier7 = modifier2;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q.m87165m();
            Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q, modifier7);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i16 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i16, c23010xM66775a16);
            C0209i c0209i17 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i17, interfaceC28653p1M87165m118);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                c0213j2 = c0213j;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i18 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i18, modifierM118962N118);
                TextResource textResourceM21278l7 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_units_label));
                int i21110 = TextResource.$stable;
                function4 = function2;
                c0213j3 = c0213j2;
                AbstractC30785d.m94660b(textResourceM21278l7, null, null, c28655q, i21110, 6);
                float f1117 = 8;
                AbstractC11266d.m30469w((float) 0.5d, f1117, c2314t, c28655q);
                float f1118 = 4;
                float f1119 = 3 * f1118;
                C38072d c38072d7 = C38072d.f163053a;
                int i21111 = C38072d.f163054b;
                Modifier modifierM3394p7 = AbstractC1099a.m3394p(f1118, AbstractC1092a.m3358c(AbstractC15751g.m44455h(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, c2314t), AbstractC33253j.m105489e(f1119)), 1, c38072d7.m121949b(c28655q, i21111).getBlack30(), AbstractC33253j.m105489e(f1119)), c38072d7.m121949b(c28655q, i21111).getBlack30(), AbstractC17918w0.f69621a));
                C22971k c22971kM66746i7 = AbstractC22977m.m66746i(f1118);
                C2306l c2306l7 = C2299e.f9107J;
                C22994r1 c22994r1M66759a13 = AbstractC22988p1.m66759a(c22971kM66746i7, c2306l7, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m119 = c28655q.m87165m();
                Modifier modifierM118962N119 = AbstractC37056f.m118962N(c28655q, modifierM3394p7);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j3);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i16, c22994r1M66759a13);
                AbstractC28683x.m87239G(c28655q, c0209i17, interfaceC28653p1M87165m119);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i18, modifierM118962N119);
                String strM92103Y13 = AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_imperial_label);
                i19 = i18 & 7168;
                if (i19 == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z17) {
                    interfaceC28601c2 = interfaceC28601c1;
                    objM87133R2 = new C3590i(function4, interfaceC28601c2, 5);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    interfaceC28601c2 = interfaceC28601c1;
                    objM87133R2 = new C3590i(function4, interfaceC28601c2, 5);
                    c28655q.m87172p0(objM87133R2);
                }
                C23000t1 c23000t7 = C23000t1.f90727a;
                interfaceC28601c3 = interfaceC28601c2;
                UnitToggleButton(strM92103Y13, zIsImperial4, (InterfaceC4339a) objM87133R2, AbstractC15676d.m44101d(c23000t7.mo66772c(c2314t, true, 1.0f), "edit_profile_unit_imperial"), c28655q, 0, 0);
                String strM92103Y14 = AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_metric_label);
                boolean z217 = !zIsImperial4;
                if (i19 == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z18) {
                    objM87133R3 = new C3590i(function4, interfaceC28601c3, 6);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C3590i(function4, interfaceC28601c3, 6);
                    c28655q.m87172p0(objM87133R3);
                }
                UnitToggleButton(strM92103Y14, z217, (InterfaceC4339a) objM87133R3, AbstractC15676d.m44101d(c23000t7.mo66772c(c2314t, true, 1.0f), "edit_profile_unit_metric"), c28655q, 0, 0);
                c28655q.m87173q(true);
                float f11110 = 2 * f1117;
                Modifier modifierM91835e7 = AbstractC30007c.m91835e(c2314t, f11110, c28655q, c2314t, 1.0f);
                C22994r1 c22994r1M66759a14 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f11110), c2306l7, c28655q, 6);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1110 = c28655q.m87165m();
                Modifier modifierM118962N1110 = AbstractC37056f.m118962N(c28655q, modifierM91835e7);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j3);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i16, c22994r1M66759a14);
                AbstractC28683x.m87239G(c28655q, c0209i17, interfaceC28653p1M87165m1110);
                if (c28655q.f115903S) {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                } else {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i18, modifierM118962N1110);
                Modifier modifierMo66772c13 = c23000t7.mo66772c(c2314t, true, 1.0f);
                C23010x c23010xM66775a17 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q, 0);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111 = c28655q.m87165m();
                Modifier modifierM118962N1111 = AbstractC37056f.m118962N(c28655q, modifierMo66772c13);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j3);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i16, c23010xM66775a17);
                AbstractC28683x.m87239G(c28655q, c0209i17, interfaceC28653p1M87165m1111);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i18, modifierM118962N1111);
                AbstractC30785d.m94660b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_height_label)), null, null, c28655q, i21110, 6);
                Modifier modifierM44101d13 = AbstractC15676d.m44101d(c2314t, "edit_profile_height_field");
                String strM21274h115 = AbstractC8693b.m21274h(textResource13, c28655q, i21110);
                String strM21274h116 = AbstractC8693b.m21274h(textResource14, c28655q, i21110);
                i24 = i18 & 896;
                if (i24 == 256) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objM87133R4 = c28655q.m87133R();
                if (z19) {
                    final int i21112 = 0;
                    objM87133R4 = new InterfaceC4339a() { // from class: com.whoop.profile.view.edit.form.e
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i21112) {
                                case 0:
                                    return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$0$0$0(onOpenBottomSheet, interfaceC28601c3);
                                default:
                                    return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$1$0$0(onOpenBottomSheet, interfaceC28601c3);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R4);
                } else {
                    final int i21113 = 0;
                    objM87133R4 = new InterfaceC4339a() { // from class: com.whoop.profile.view.edit.form.e
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i21113) {
                                case 0:
                                    return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$0$0$0(onOpenBottomSheet, interfaceC28601c3);
                                default:
                                    return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$1$0$0(onOpenBottomSheet, interfaceC28601c3);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R4);
                }
                int i3111 = 458752 & (i18 << 3);
                boolean z218 = z16;
                c0209i3 = c0209i2;
                ClickableFormFieldContent(modifierM44101d13, strM21274h115, (InterfaceC4339a) objM87133R4, strM21274h116, false, z218, c28655q, i3111, 16);
                c28655q.m87173q(true);
                Modifier modifierMo66772c14 = c23000t7.mo66772c(c2314t, true, 1.0f);
                C23010x c23010xM66775a18 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q, 0);
                iHashCode5 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1112 = c28655q.m87165m();
                Modifier modifierM118962N1112 = AbstractC37056f.m118962N(c28655q, modifierMo66772c14);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j3);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i16, c23010xM66775a18);
                AbstractC28683x.m87239G(c28655q, c0209i17, interfaceC28653p1M87165m1112);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i18, modifierM118962N1112);
                AbstractC30785d.m94660b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_weight_label)), null, null, c28655q, i21110, 6);
                Modifier modifierM44101d14 = AbstractC15676d.m44101d(c2314t, "edit_profile_weight_field");
                String strM21274h117 = AbstractC8693b.m21274h(textResource15, c28655q, i21110);
                String strM21274h118 = AbstractC8693b.m21274h(textResource16, c28655q, i21110);
                if (i24 == 256) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                objM87133R5 = c28655q.m87133R();
                if (z24) {
                    final int i3112 = 1;
                    objM87133R5 = new InterfaceC4339a() { // from class: com.whoop.profile.view.edit.form.e
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i3112) {
                                case 0:
                                    return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$0$0$0(onOpenBottomSheet, interfaceC28601c3);
                                default:
                                    return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$1$0$0(onOpenBottomSheet, interfaceC28601c3);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R5);
                } else {
                    final int i3113 = 1;
                    objM87133R5 = new InterfaceC4339a() { // from class: com.whoop.profile.view.edit.form.e
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i3113) {
                                case 0:
                                    return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$0$0$0(onOpenBottomSheet, interfaceC28601c3);
                                default:
                                    return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$1$0$0(onOpenBottomSheet, interfaceC28601c3);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R5);
                }
                z13 = z218;
                ClickableFormFieldContent(modifierM44101d14, strM21274h117, (InterfaceC4339a) objM87133R5, strM21274h118, false, z13, c28655q, i3111, 16);
                c28655q = c28655q;
                AbstractC25012a.m73392y(c28655q, true, true, true);
                modifier3 = modifier7;
                function3 = function4;
            } else {
                c0213j2 = c0213j;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i19 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i19, modifierM118962N118);
            TextResource textResourceM21278l8 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_units_label));
            int i21114 = TextResource.$stable;
            function4 = function2;
            c0213j3 = c0213j2;
            AbstractC30785d.m94660b(textResourceM21278l8, null, null, c28655q, i21114, 6);
            float f11111 = 8;
            AbstractC11266d.m30469w((float) 0.5d, f11111, c2314t, c28655q);
            float f11112 = 4;
            float f11113 = 3 * f11112;
            C38072d c38072d8 = C38072d.f163053a;
            int i21115 = C38072d.f163054b;
            Modifier modifierM3394p8 = AbstractC1099a.m3394p(f11112, AbstractC1092a.m3358c(AbstractC15751g.m44455h(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, c2314t), AbstractC33253j.m105489e(f11113)), 1, c38072d8.m121949b(c28655q, i21115).getBlack30(), AbstractC33253j.m105489e(f11113)), c38072d8.m121949b(c28655q, i21115).getBlack30(), AbstractC17918w0.f69621a));
            C22971k c22971kM66746i8 = AbstractC22977m.m66746i(f11112);
            C2306l c2306l8 = C2299e.f9107J;
            C22994r1 c22994r1M66759a15 = AbstractC22988p1.m66759a(c22971kM66746i8, c2306l8, c28655q, 6);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m1113 = c28655q.m87165m();
            Modifier modifierM118962N1113 = AbstractC37056f.m118962N(c28655q, modifierM3394p8);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j3);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i16, c22994r1M66759a15);
            AbstractC28683x.m87239G(c28655q, c0209i17, interfaceC28653p1M87165m1113);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i19, modifierM118962N1113);
            String strM92103Y15 = AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_imperial_label);
            i19 = i18 & 7168;
            if (i19 == 2048) {
                z17 = true;
            } else {
                z17 = false;
            }
            objM87133R2 = c28655q.m87133R();
            if (z17) {
                interfaceC28601c2 = interfaceC28601c1;
                objM87133R2 = new C3590i(function4, interfaceC28601c2, 5);
                c28655q.m87172p0(objM87133R2);
            } else {
                interfaceC28601c2 = interfaceC28601c1;
                objM87133R2 = new C3590i(function4, interfaceC28601c2, 5);
                c28655q.m87172p0(objM87133R2);
            }
            C23000t1 c23000t8 = C23000t1.f90727a;
            interfaceC28601c3 = interfaceC28601c2;
            UnitToggleButton(strM92103Y15, zIsImperial4, (InterfaceC4339a) objM87133R2, AbstractC15676d.m44101d(c23000t8.mo66772c(c2314t, true, 1.0f), "edit_profile_unit_imperial"), c28655q, 0, 0);
            String strM92103Y16 = AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_metric_label);
            boolean z219 = !zIsImperial4;
            if (i19 == 2048) {
                z18 = true;
            } else {
                z18 = false;
            }
            objM87133R3 = c28655q.m87133R();
            if (z18) {
                objM87133R3 = new C3590i(function4, interfaceC28601c3, 6);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C3590i(function4, interfaceC28601c3, 6);
                c28655q.m87172p0(objM87133R3);
            }
            UnitToggleButton(strM92103Y16, z219, (InterfaceC4339a) objM87133R3, AbstractC15676d.m44101d(c23000t8.mo66772c(c2314t, true, 1.0f), "edit_profile_unit_metric"), c28655q, 0, 0);
            c28655q.m87173q(true);
            float f11114 = 2 * f11111;
            Modifier modifierM91835e8 = AbstractC30007c.m91835e(c2314t, f11114, c28655q, c2314t, 1.0f);
            C22994r1 c22994r1M66759a16 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f11114), c2306l8, c28655q, 6);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m1114 = c28655q.m87165m();
            Modifier modifierM118962N1114 = AbstractC37056f.m118962N(c28655q, modifierM91835e8);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j3);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i16, c22994r1M66759a16);
            AbstractC28683x.m87239G(c28655q, c0209i17, interfaceC28653p1M87165m1114);
            if (c28655q.f115903S) {
                c0209i2 = c0209i;
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
            } else {
                c0209i2 = c0209i;
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q, c0209i19, modifierM118962N1114);
            Modifier modifierMo66772c15 = c23000t8.mo66772c(c2314t, true, 1.0f);
            C23010x c23010xM66775a19 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q, 0);
            iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m1115 = c28655q.m87165m();
            Modifier modifierM118962N1115 = AbstractC37056f.m118962N(c28655q, modifierMo66772c15);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j3);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i16, c23010xM66775a19);
            AbstractC28683x.m87239G(c28655q, c0209i17, interfaceC28653p1M87165m1115);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q, c0209i19, modifierM118962N1115);
            AbstractC30785d.m94660b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_height_label)), null, null, c28655q, i21114, 6);
            Modifier modifierM44101d15 = AbstractC15676d.m44101d(c2314t, "edit_profile_height_field");
            String strM21274h119 = AbstractC8693b.m21274h(textResource13, c28655q, i21114);
            String strM21274h1110 = AbstractC8693b.m21274h(textResource14, c28655q, i21114);
            i24 = i18 & 896;
            if (i24 == 256) {
                z19 = true;
            } else {
                z19 = false;
            }
            objM87133R4 = c28655q.m87133R();
            if (z19) {
                final int i21116 = 0;
                objM87133R4 = new InterfaceC4339a() { // from class: com.whoop.profile.view.edit.form.e
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i21116) {
                            case 0:
                                return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$0$0$0(onOpenBottomSheet, interfaceC28601c3);
                            default:
                                return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$1$0$0(onOpenBottomSheet, interfaceC28601c3);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R4);
            } else {
                final int i21117 = 0;
                objM87133R4 = new InterfaceC4339a() { // from class: com.whoop.profile.view.edit.form.e
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i21117) {
                            case 0:
                                return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$0$0$0(onOpenBottomSheet, interfaceC28601c3);
                            default:
                                return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$1$0$0(onOpenBottomSheet, interfaceC28601c3);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R4);
            }
            int i3114 = 458752 & (i18 << 3);
            boolean z2110 = z16;
            c0209i3 = c0209i2;
            ClickableFormFieldContent(modifierM44101d15, strM21274h119, (InterfaceC4339a) objM87133R4, strM21274h1110, false, z2110, c28655q, i3114, 16);
            c28655q.m87173q(true);
            Modifier modifierMo66772c16 = c23000t8.mo66772c(c2314t, true, 1.0f);
            C23010x c23010xM66775a110 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q, 0);
            iHashCode5 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m1116 = c28655q.m87165m();
            Modifier modifierM118962N1116 = AbstractC37056f.m118962N(c28655q, modifierMo66772c16);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j3);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i16, c23010xM66775a110);
            AbstractC28683x.m87239G(c28655q, c0209i17, interfaceC28653p1M87165m1116);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i19, modifierM118962N1116);
            AbstractC30785d.m94660b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_edit_weight_label)), null, null, c28655q, i21114, 6);
            Modifier modifierM44101d16 = AbstractC15676d.m44101d(c2314t, "edit_profile_weight_field");
            String strM21274h1111 = AbstractC8693b.m21274h(textResource15, c28655q, i21114);
            String strM21274h1112 = AbstractC8693b.m21274h(textResource16, c28655q, i21114);
            if (i24 == 256) {
                z24 = true;
            } else {
                z24 = false;
            }
            objM87133R5 = c28655q.m87133R();
            if (z24) {
                final int i3115 = 1;
                objM87133R5 = new InterfaceC4339a() { // from class: com.whoop.profile.view.edit.form.e
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i3115) {
                            case 0:
                                return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$0$0$0(onOpenBottomSheet, interfaceC28601c3);
                            default:
                                return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$1$0$0(onOpenBottomSheet, interfaceC28601c3);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R5);
            } else {
                final int i3116 = 1;
                objM87133R5 = new InterfaceC4339a() { // from class: com.whoop.profile.view.edit.form.e
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i3116) {
                            case 0:
                                return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$0$0$0(onOpenBottomSheet, interfaceC28601c3);
                            default:
                                return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$4$1$1$0$0(onOpenBottomSheet, interfaceC28601c3);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R5);
            }
            z13 = z2110;
            ClickableFormFieldContent(modifierM44101d16, strM21274h1111, (InterfaceC4339a) objM87133R5, strM21274h1112, false, z13, c28655q, i3114, 16);
            c28655q = c28655q;
            AbstractC25012a.m73392y(c28655q, true, true, true);
            modifier3 = modifier7;
            function3 = function4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        z15 = z13;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3195g((Object) modifier3, (Object) groupedField, (Object) onOpenBottomSheet, function3, z15, i13, i14, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 HeightWeightGroupedFormField$lambda$0$0(String it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    private static final UnitSystem HeightWeightGroupedFormField$lambda$2(InterfaceC28601c1 interfaceC28601c1) {
        return (UnitSystem) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 HeightWeightGroupedFormField$lambda$4$0$0$0(Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        interfaceC28601c1.setValue(UnitSystem.IMPERIAL);
        function1.invoke("imperial");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 HeightWeightGroupedFormField$lambda$4$0$1$0(Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        interfaceC28601c1.setValue(UnitSystem.METRIC);
        function1.invoke("metric");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 HeightWeightGroupedFormField$lambda$4$1$0$0$0(InterfaceC4351m interfaceC4351m, InterfaceC28601c1 interfaceC28601c1) {
        interfaceC4351m.invoke(EditProfileViewState.BottomSheetType.HEIGHT, HeightWeightGroupedFormField$lambda$2(interfaceC28601c1).toName());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 HeightWeightGroupedFormField$lambda$4$1$1$0$0(InterfaceC4351m interfaceC4351m, InterfaceC28601c1 interfaceC28601c1) {
        interfaceC4351m.invoke(EditProfileViewState.BottomSheetType.WEIGHT, HeightWeightGroupedFormField$lambda$2(interfaceC28601c1).toName());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 HeightWeightGroupedFormField$lambda$5(Modifier modifier, HeightWeightGroupedField heightWeightGroupedField, InterfaceC4351m interfaceC4351m, Function1 function1, boolean z4, int i13, int i14, Composer composer, int i15) {
        HeightWeightGroupedFormField(modifier, heightWeightGroupedField, interfaceC4351m, function1, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x008f  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:56:0x0108  */
    /* JADX WARN: Code duplicated, block: B:59:0x011e  */
    /* JADX WARN: Code duplicated, block: B:61:0x012a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0162  */
    /* JADX WARN: Code duplicated, block: B:66:0x016c  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    private static final void UnitToggleButton(String str, boolean z4, InterfaceC4339a interfaceC4339a, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z13;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        long jM125368V0;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C38072d c38072d;
        int i16;
        long jM73370c;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-81571967);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(interfaceC4339a) ? 256 : 128;
        }
        int i17 = i14 & 8;
        if (i17 == 0) {
            if ((i13 & 3072) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                if (i17 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                float f13 = 2;
                Modifier modifierM53364e = AbstractC18489d0.m53364e(modifier4, f13, 4);
                if (z4) {
                    c28655q.m87150e0(-1081239416);
                    jM125368V0 = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                } else {
                    c28655q.m87150e0(-1081238420);
                    jM125368V0 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getTransparent();
                    c28655q.m87173q(false);
                }
                float f14 = 8;
                Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1092a.m3362g(AbstractC1092a.m3358c(modifierM53364e, jM125368V0, AbstractC17918w0.f69621a), false, null, new C18027i(0), interfaceC4339a, 11), f13 * f14, 1 * f14);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
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
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                c38072d = C38072d.f163053a;
                i16 = C38072d.f163054b;
                C2886a c2886aM8422c = c38072d.m121952e(c28655q, i16).getB3();
                if (z4) {
                    jM73370c = AbstractC25012a.m73366B(c28655q, -2097796591, c38072d, c28655q, i16);
                } else {
                    jM73370c = AbstractC25012a.m73370c(c28655q, -2097795506, c38072d, c28655q, i16);
                }
                c28655q.m87173q(false);
                AbstractC30795n.m94707h(str, null, jM73370c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c, null, c28655q, i15 & 14, C2886a.f11498d << 18, 196602);
                c28655q.m87173q(true);
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C9782f(i13, i14, 0, modifier3, interfaceC4339a, str, z4);
            }
        }
        i15 |= 3072;
        modifier2 = modifier;
        if ((i15 & 1171) != 1170) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            if (i17 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            float f15 = 2;
            Modifier modifierM53364e2 = AbstractC18489d0.m53364e(modifier4, f15, 4);
            if (z4) {
                c28655q.m87150e0(-1081239416);
                jM125368V0 = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            } else {
                c28655q.m87150e0(-1081238420);
                jM125368V0 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getTransparent();
                c28655q.m87173q(false);
            }
            float f16 = 8;
            Modifier modifierM3395q2 = AbstractC1099a.m3395q(AbstractC1092a.m3362g(AbstractC1092a.m3358c(modifierM53364e2, jM125368V0, AbstractC17918w0.f69621a), false, null, new C18027i(0), interfaceC4339a, 11), f15 * f16, 1 * f16);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            c38072d = C38072d.f163053a;
            i16 = C38072d.f163054b;
            C2886a c2886aM8422c2 = c38072d.m121952e(c28655q, i16).getB3();
            if (z4) {
                jM73370c = AbstractC25012a.m73366B(c28655q, -2097796591, c38072d, c28655q, i16);
            } else {
                jM73370c = AbstractC25012a.m73370c(c28655q, -2097795506, c38072d, c28655q, i16);
            }
            c28655q.m87173q(false);
            AbstractC30795n.m94707h(str, null, jM73370c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c2, null, c28655q, i15 & 14, C2886a.f11498d << 18, 196602);
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9782f(i13, i14, 0, modifier3, interfaceC4339a, str, z4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 UnitToggleButton$lambda$1(String str, boolean z4, InterfaceC4339a interfaceC4339a, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        UnitToggleButton(str, z4, interfaceC4339a, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
