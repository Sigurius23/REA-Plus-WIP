package com.whoop.profile.presentation.edit;

import a61.C0468a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import c93.InterfaceC4351m;
import com.whoop.domain.model.UnitSystem;
import com.whoop.domain.model.UnitSystemExtKt;
import d21.AbstractC11508f;
import d21.C11503a;
import d21.C11509g;
import gy0.AbstractC16277f;
import i93.C18284j;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28617g1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28690z0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import s41.AbstractC32195c;
import s41.C32196d;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39420x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a]\u0010\f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0001¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u0014H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a;\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u0014H\u0001¢\u0006\u0004\b\u0019\u0010\u0017¨\u0006\u001e²\u0006\f\u0010\u001b\u001a\u00020\u001a8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001d\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;", "bottomSheetType", "Lcom/whoop/profile/presentation/edit/EditProfileViewState;", "viewState", "Lkotlin/Function2;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;", "", "Ll83/a0;", "onFieldUpdate", "overrideUnitSystem", "currentHeight", "currentWeight", "HeightWeightContent", "(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;Lcom/whoop/profile/presentation/edit/EditProfileViewState;Lc93/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "", "currentHeightInMeters", "", "isImperial", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;", "validationRanges", "Lkotlin/Function1;", "onValueSelected", "HeightSelector", "(FZLcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "currentWeightInKilograms", "WeightSelector", "Lcom/whoop/domain/model/UnitSystem;", "unitSystem", "selectedHeightValue", "selectedWeightValue", "profile_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class HeightWeightContentKt {
    public static final void HeightSelector(float f13, boolean z4, EditProfileViewState.ValidationRanges validationRanges, Function1 onValueSelected, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(validationRanges, "validationRanges");
        AbstractC22676k.m65750j(onValueSelected, "onValueSelected");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1604644213);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87147d(f13) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(validationRanges) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onValueSelected) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            C11503a c11503a = C11503a.f37005a;
            int iM30930s = c11503a.m30930s(f13);
            int iM30930s2 = c11503a.m30930s(validationRanges.getHeightMetersMin());
            int iM30930s3 = c11503a.m30930s(validationRanges.getHeightMetersMax());
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            C11509g c11509g = new C11509g(z4 ? UnitSystem.IMPERIAL : UnitSystem.METRIC, iM30930s, new C18284j(validationRanges.getHeightFeetMin(), validationRanges.getHeightFeetMax(), 1), new C18284j(iM30930s2, iM30930s3, 1), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62399y0), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62261M0), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62245I));
            boolean z13 = (i14 & 7168) == 2048;
            Object objM87133R = c28655q.m87133R();
            if (z13 || objM87133R == C28635l.f115821a) {
                objM87133R = new C0468a(onValueSelected, 21);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC11508f.m30953e(c11509g, (Function1) objM87133R, AbstractC1102d.m3409f(1.0f, c2314t), 40, C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getB1(), false, c28655q, 200064 | C11509g.f37027h | (C2886a.f11498d << 12), 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9724c(f13, z4, validationRanges, onValueSelected, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 HeightSelector$lambda$0$0$0(Function1 function1, int i13) {
        function1.invoke(Float.valueOf(C11503a.f37005a.m30931t(i13)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 HeightSelector$lambda$1(float f13, boolean z4, EditProfileViewState.ValidationRanges validationRanges, Function1 function1, int i13, Composer composer, int i14) {
        HeightSelector(f13, z4, validationRanges, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0127  */
    /* JADX WARN: Code duplicated, block: B:102:0x0129  */
    /* JADX WARN: Code duplicated, block: B:105:0x0134  */
    /* JADX WARN: Code duplicated, block: B:109:0x014c  */
    /* JADX WARN: Code duplicated, block: B:111:0x014f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0151  */
    /* JADX WARN: Code duplicated, block: B:115:0x015b A[PHI: r3
      0x015b: PHI (r3v7 float) = (r3v6 float), (r3v17 float) binds: [B:110:0x014d, B:114:0x0157] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:116:0x015e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0182 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x0184  */
    /* JADX WARN: Code duplicated, block: B:126:0x0194 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x0196  */
    /* JADX WARN: Code duplicated, block: B:130:0x019e  */
    /* JADX WARN: Code duplicated, block: B:133:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:136:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:137:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:139:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:142:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:145:0x01fe A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:146:0x0200  */
    /* JADX WARN: Code duplicated, block: B:149:0x0218  */
    /* JADX WARN: Code duplicated, block: B:152:0x0227  */
    /* JADX WARN: Code duplicated, block: B:153:0x0237 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:41:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    /* JADX WARN: Code duplicated, block: B:44:0x0089  */
    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:50:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:90:0x0100  */
    /* JADX WARN: Code duplicated, block: B:93:0x0109 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x010b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0120  */
    /* JADX WARN: Code duplicated, block: B:98:0x0123  */
    public static final void HeightWeightContent(final EditProfileViewState.BottomSheetType bottomSheetType, final EditProfileViewState viewState, final InterfaceC4351m onFieldUpdate, String str, String str2, String str3, Composer composer, final int i13, final int i14) {
        int i15;
        String str4;
        int i16;
        String str5;
        int i17;
        int i18;
        String str6;
        int i19;
        boolean z4;
        boolean z13;
        EditProfileViewState.BottomSheetType bottomSheetType2;
        final InterfaceC4351m interfaceC4351m;
        final String str7;
        final String str8;
        C28655q c28655q;
        final String str9;
        C28677v1 c28677v1M87180u;
        InterfaceC4351m interfaceC4351m2;
        final String str10;
        final String str11;
        final String str12;
        EditProfileViewState.EditProfileData profileData;
        String str13;
        String str14;
        String str15;
        UnitSystem unitSystem;
        boolean z14;
        Object objM87133R;
        boolean zIsImperial;
        boolean z15;
        float weight;
        float height;
        EditProfileViewState.EditProfileData editProfileData;
        boolean zM87147d;
        Object objM87133R2;
        final InterfaceC28690z0 interfaceC28690z0;
        boolean zM87147d2;
        Object objM87133R3;
        final InterfaceC28690z0 interfaceC28690z1;
        C28655q c28655q2;
        boolean z16;
        Object objM87133R4;
        boolean zM87153g;
        Object objM87133R5;
        Float fM125915y;
        Float fM125915y2;
        AbstractC22676k.m65750j(bottomSheetType, "bottomSheetType");
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onFieldUpdate, "onFieldUpdate");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(1417109137);
        if ((i13 & 6) == 0) {
            i15 = (c28655q3.m87149e(bottomSheetType.ordinal()) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q3.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q3.m87157i(onFieldUpdate) ? 256 : 128;
        }
        int i24 = i14 & 8;
        if (i24 == 0) {
            if ((i13 & 3072) == 0) {
                str4 = str;
                i15 |= c28655q3.m87153g(str4) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    str5 = str2;
                    if (c28655q3.m87153g(str5)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 32;
                if (i18 != 0) {
                    if ((196608 & i13) == 0) {
                        str6 = str3;
                        if (c28655q3.m87153g(str6)) {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i19;
                    }
                    z4 = true;
                    if ((74899 & i15) != 74898) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c28655q3.m87135U(i15 & 1, z13)) {
                        if (i24 != 0) {
                            str10 = null;
                        } else {
                            str10 = str4;
                        }
                        if (i16 != 0) {
                            str11 = null;
                        } else {
                            str11 = str5;
                        }
                        if (i18 != 0) {
                            str12 = null;
                        } else {
                            str12 = str6;
                        }
                        profileData = viewState.getProfileData();
                        if (profileData == null) {
                            c28677v1M87180u = c28655q3.m87180u();
                            if (c28677v1M87180u != null) {
                                return;
                            }
                            final int i25 = 0;
                            interfaceC4351m2 = new InterfaceC4351m() { // from class: com.whoop.profile.presentation.edit.d
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    switch (i25) {
                                        case 0:
                                            int iIntValue = ((Integer) obj2).intValue();
                                            return HeightWeightContentKt.HeightWeightContent$lambda$0(bottomSheetType, viewState, onFieldUpdate, str10, str11, str12, i13, i14, (Composer) obj, iIntValue);
                                        default:
                                            int iIntValue2 = ((Integer) obj2).intValue();
                                            return HeightWeightContentKt.HeightWeightContent$lambda$12(bottomSheetType, viewState, onFieldUpdate, str10, str11, str12, i13, i14, (Composer) obj, iIntValue2);
                                    }
                                }
                            };
                        } else {
                            bottomSheetType2 = bottomSheetType;
                            interfaceC4351m = onFieldUpdate;
                            str13 = str10;
                            str14 = str11;
                            str15 = str12;
                            if (str13 != null || (unitSystem = UnitSystemExtKt.unitSystemFromString(str13)) == null) {
                                unitSystem = profileData.getUnitSystem();
                            }
                            if ((i15 & 7168) == 2048) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            objM87133R = c28655q3.m87133R();
                            C28676v0 c28676v0 = C28635l.f115821a;
                            if (z14 || objM87133R == c28676v0) {
                                objM87133R = AbstractC28683x.m87272z(unitSystem);
                                c28655q3.m87172p0(objM87133R);
                            }
                            zIsImperial = UnitSystemExtKt.isImperial(HeightWeightContent$lambda$3((InterfaceC28601c1) objM87133R));
                            if (bottomSheetType2 == EditProfileViewState.BottomSheetType.HEIGHT) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            weight = 0.0f;
                            if (!z15) {
                                height = ((str14 != null || (fM125915y2 = AbstractC39420x.m125915y(str14)) == null) && (fM125915y2 = AbstractC39420x.m125915y(viewState.getEditableFields().getHeight().getValue())) == null) ? profileData.getHeight() : fM125915y2.floatValue();
                            } else {
                                height = 0.0f;
                            }
                            if (z15) {
                                editProfileData = profileData;
                            } else if ((str15 != null || (fM125915y = AbstractC39420x.m125915y(str15)) == null) && (fM125915y = AbstractC39420x.m125915y(viewState.getEditableFields().getWeight().getValue())) == null) {
                                editProfileData = profileData;
                                weight = (float) editProfileData.getWeight();
                            } else {
                                weight = fM125915y.floatValue();
                                editProfileData = profileData;
                            }
                            zM87147d = c28655q3.m87147d(height);
                            objM87133R2 = c28655q3.m87133R();
                            if (zM87147d || objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC11266d.m30468v(height, c28655q3);
                            }
                            interfaceC28690z0 = (InterfaceC28690z0) objM87133R2;
                            zM87147d2 = c28655q3.m87147d(weight);
                            objM87133R3 = c28655q3.m87133R();
                            if (zM87147d2 || objM87133R3 == c28676v0) {
                                objM87133R3 = AbstractC11266d.m30468v(weight, c28655q3);
                            }
                            interfaceC28690z1 = (InterfaceC28690z0) objM87133R3;
                            if (z15) {
                                c28655q3.m87150e0(1866126958);
                                float fHeightWeightContent$lambda$5 = HeightWeightContent$lambda$5(interfaceC28690z0);
                                EditProfileViewState.ValidationRanges validationRanges = editProfileData.getValidationRanges();
                                zM87153g = c28655q3.m87153g(interfaceC28690z0) | ((i15 & 896) == 256);
                                objM87133R5 = c28655q3.m87133R();
                                if (zM87153g || objM87133R5 == c28676v0) {
                                    final int i26 = 0;
                                    objM87133R5 = new Function1() { // from class: com.whoop.profile.presentation.edit.e
                                        @Override // p715kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            int i27 = i26;
                                            float fFloatValue = ((Float) obj).floatValue();
                                            switch (i27) {
                                                case 0:
                                                    return HeightWeightContentKt.HeightWeightContent$lambda$10$0(interfaceC4351m, interfaceC28690z0, fFloatValue);
                                                default:
                                                    return HeightWeightContentKt.HeightWeightContent$lambda$11$0(interfaceC4351m, interfaceC28690z0, fFloatValue);
                                            }
                                        }
                                    };
                                    c28655q3.m87172p0(objM87133R5);
                                }
                                Function1 function1 = (Function1) objM87133R5;
                                c28655q2 = c28655q3;
                                HeightSelector(fHeightWeightContent$lambda$5, zIsImperial, validationRanges, function1, c28655q2, 0);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(1866516907);
                                float fHeightWeightContent$lambda$8 = HeightWeightContent$lambda$8(interfaceC28690z1);
                                EditProfileViewState.ValidationRanges validationRanges2 = editProfileData.getValidationRanges();
                                boolean zM87153g2 = c28655q2.m87153g(interfaceC28690z1);
                                if ((i15 & 896) != 256) {
                                    c28655q2 = c28655q3;
                                    z4 = false;
                                }
                                c28655q2 = c28655q3;
                                z16 = zM87153g2 | z4;
                                objM87133R4 = c28655q2.m87133R();
                                if (z16 || objM87133R4 == c28676v0) {
                                    final int i27 = 1;
                                    objM87133R4 = new Function1() { // from class: com.whoop.profile.presentation.edit.e
                                        @Override // p715kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            int i28 = i27;
                                            float fFloatValue = ((Float) obj).floatValue();
                                            switch (i28) {
                                                case 0:
                                                    return HeightWeightContentKt.HeightWeightContent$lambda$10$0(interfaceC4351m, interfaceC28690z1, fFloatValue);
                                                default:
                                                    return HeightWeightContentKt.HeightWeightContent$lambda$11$0(interfaceC4351m, interfaceC28690z1, fFloatValue);
                                            }
                                        }
                                    };
                                    c28655q2.m87172p0(objM87133R4);
                                }
                                WeightSelector(fHeightWeightContent$lambda$8, zIsImperial, validationRanges2, (Function1) objM87133R4, c28655q2, 0);
                                c28655q2.m87173q(false);
                            }
                            c28655q = c28655q2;
                            str9 = str14;
                            str7 = str13;
                            str8 = str15;
                        }
                        c28677v1M87180u.f115982d = interfaceC4351m2;
                    }
                    bottomSheetType2 = bottomSheetType;
                    interfaceC4351m = onFieldUpdate;
                    c28655q3.m87138X();
                    str7 = str4;
                    str8 = str6;
                    c28655q = c28655q3;
                    str9 = str5;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        final int i28 = 1;
                        final EditProfileViewState.BottomSheetType bottomSheetType3 = bottomSheetType2;
                        final InterfaceC4351m interfaceC4351m3 = interfaceC4351m;
                        interfaceC4351m2 = new InterfaceC4351m() { // from class: com.whoop.profile.presentation.edit.d
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i28) {
                                    case 0:
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return HeightWeightContentKt.HeightWeightContent$lambda$0(bottomSheetType3, viewState, interfaceC4351m3, str7, str9, str8, i13, i14, (Composer) obj, iIntValue);
                                    default:
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        return HeightWeightContentKt.HeightWeightContent$lambda$12(bottomSheetType3, viewState, interfaceC4351m3, str7, str9, str8, i13, i14, (Composer) obj, iIntValue2);
                                }
                            }
                        };
                        c28677v1M87180u.f115982d = interfaceC4351m2;
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                str6 = str3;
                z4 = true;
                if ((74899 & i15) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q3.m87135U(i15 & 1, z13)) {
                    if (i24 != 0) {
                        str10 = null;
                    } else {
                        str10 = str4;
                    }
                    if (i16 != 0) {
                        str11 = null;
                    } else {
                        str11 = str5;
                    }
                    if (i18 != 0) {
                        str12 = null;
                    } else {
                        str12 = str6;
                    }
                    profileData = viewState.getProfileData();
                    if (profileData == null) {
                        c28677v1M87180u = c28655q3.m87180u();
                        if (c28677v1M87180u != null) {
                            return;
                        }
                        final int i29 = 0;
                        interfaceC4351m2 = new InterfaceC4351m() { // from class: com.whoop.profile.presentation.edit.d
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i29) {
                                    case 0:
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return HeightWeightContentKt.HeightWeightContent$lambda$0(bottomSheetType, viewState, onFieldUpdate, str10, str11, str12, i13, i14, (Composer) obj, iIntValue);
                                    default:
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        return HeightWeightContentKt.HeightWeightContent$lambda$12(bottomSheetType, viewState, onFieldUpdate, str10, str11, str12, i13, i14, (Composer) obj, iIntValue2);
                                }
                            }
                        };
                    } else {
                        bottomSheetType2 = bottomSheetType;
                        interfaceC4351m = onFieldUpdate;
                        str13 = str10;
                        str14 = str11;
                        str15 = str12;
                        if (str13 != null) {
                            unitSystem = profileData.getUnitSystem();
                        } else {
                            unitSystem = profileData.getUnitSystem();
                        }
                        if ((i15 & 7168) == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R = c28655q3.m87133R();
                        C28676v0 c28676v1 = C28635l.f115821a;
                        if (z14) {
                            objM87133R = AbstractC28683x.m87272z(unitSystem);
                            c28655q3.m87172p0(objM87133R);
                        } else {
                            objM87133R = AbstractC28683x.m87272z(unitSystem);
                            c28655q3.m87172p0(objM87133R);
                        }
                        zIsImperial = UnitSystemExtKt.isImperial(HeightWeightContent$lambda$3((InterfaceC28601c1) objM87133R));
                        if (bottomSheetType2 == EditProfileViewState.BottomSheetType.HEIGHT) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        weight = 0.0f;
                        if (!z15) {
                            height = 0.0f;
                        } else if (str14 != null) {
                        }
                        if (z15) {
                            editProfileData = profileData;
                        } else if (str15 != null) {
                            editProfileData = profileData;
                            weight = (float) editProfileData.getWeight();
                        } else {
                            editProfileData = profileData;
                            weight = (float) editProfileData.getWeight();
                        }
                        zM87147d = c28655q3.m87147d(height);
                        objM87133R2 = c28655q3.m87133R();
                        if (zM87147d) {
                            objM87133R2 = AbstractC11266d.m30468v(height, c28655q3);
                        } else {
                            objM87133R2 = AbstractC11266d.m30468v(height, c28655q3);
                        }
                        interfaceC28690z0 = (InterfaceC28690z0) objM87133R2;
                        zM87147d2 = c28655q3.m87147d(weight);
                        objM87133R3 = c28655q3.m87133R();
                        if (zM87147d2) {
                            objM87133R3 = AbstractC11266d.m30468v(weight, c28655q3);
                        } else {
                            objM87133R3 = AbstractC11266d.m30468v(weight, c28655q3);
                        }
                        interfaceC28690z1 = (InterfaceC28690z0) objM87133R3;
                        if (z15) {
                            c28655q3.m87150e0(1866126958);
                            float fHeightWeightContent$lambda$6 = HeightWeightContent$lambda$5(interfaceC28690z0);
                            EditProfileViewState.ValidationRanges validationRanges3 = editProfileData.getValidationRanges();
                            zM87153g = c28655q3.m87153g(interfaceC28690z0) | ((i15 & 896) == 256);
                            objM87133R5 = c28655q3.m87133R();
                            if (zM87153g) {
                                final int i210 = 0;
                                objM87133R5 = new Function1() { // from class: com.whoop.profile.presentation.edit.e
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        int i211 = i210;
                                        float fFloatValue = ((Float) obj).floatValue();
                                        switch (i211) {
                                            case 0:
                                                return HeightWeightContentKt.HeightWeightContent$lambda$10$0(interfaceC4351m, interfaceC28690z0, fFloatValue);
                                            default:
                                                return HeightWeightContentKt.HeightWeightContent$lambda$11$0(interfaceC4351m, interfaceC28690z0, fFloatValue);
                                        }
                                    }
                                };
                                c28655q3.m87172p0(objM87133R5);
                            } else {
                                final int i211 = 0;
                                objM87133R5 = new Function1() { // from class: com.whoop.profile.presentation.edit.e
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        int i212 = i211;
                                        float fFloatValue = ((Float) obj).floatValue();
                                        switch (i212) {
                                            case 0:
                                                return HeightWeightContentKt.HeightWeightContent$lambda$10$0(interfaceC4351m, interfaceC28690z0, fFloatValue);
                                            default:
                                                return HeightWeightContentKt.HeightWeightContent$lambda$11$0(interfaceC4351m, interfaceC28690z0, fFloatValue);
                                        }
                                    }
                                };
                                c28655q3.m87172p0(objM87133R5);
                            }
                            Function1 function2 = (Function1) objM87133R5;
                            c28655q2 = c28655q3;
                            HeightSelector(fHeightWeightContent$lambda$6, zIsImperial, validationRanges3, function2, c28655q2, 0);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(1866516907);
                            float fHeightWeightContent$lambda$9 = HeightWeightContent$lambda$8(interfaceC28690z1);
                            EditProfileViewState.ValidationRanges validationRanges4 = editProfileData.getValidationRanges();
                            boolean zM87153g3 = c28655q2.m87153g(interfaceC28690z1);
                            if ((i15 & 896) != 256) {
                                c28655q2 = c28655q3;
                                z4 = false;
                            }
                            c28655q2 = c28655q3;
                            z16 = zM87153g3 | z4;
                            objM87133R4 = c28655q2.m87133R();
                            if (z16) {
                                final int i212 = 1;
                                objM87133R4 = new Function1() { // from class: com.whoop.profile.presentation.edit.e
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        int i213 = i212;
                                        float fFloatValue = ((Float) obj).floatValue();
                                        switch (i213) {
                                            case 0:
                                                return HeightWeightContentKt.HeightWeightContent$lambda$10$0(interfaceC4351m, interfaceC28690z1, fFloatValue);
                                            default:
                                                return HeightWeightContentKt.HeightWeightContent$lambda$11$0(interfaceC4351m, interfaceC28690z1, fFloatValue);
                                        }
                                    }
                                };
                                c28655q2.m87172p0(objM87133R4);
                            } else {
                                final int i213 = 1;
                                objM87133R4 = new Function1() { // from class: com.whoop.profile.presentation.edit.e
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        int i214 = i213;
                                        float fFloatValue = ((Float) obj).floatValue();
                                        switch (i214) {
                                            case 0:
                                                return HeightWeightContentKt.HeightWeightContent$lambda$10$0(interfaceC4351m, interfaceC28690z1, fFloatValue);
                                            default:
                                                return HeightWeightContentKt.HeightWeightContent$lambda$11$0(interfaceC4351m, interfaceC28690z1, fFloatValue);
                                        }
                                    }
                                };
                                c28655q2.m87172p0(objM87133R4);
                            }
                            WeightSelector(fHeightWeightContent$lambda$9, zIsImperial, validationRanges4, (Function1) objM87133R4, c28655q2, 0);
                            c28655q2.m87173q(false);
                        }
                        c28655q = c28655q2;
                        str9 = str14;
                        str7 = str13;
                        str8 = str15;
                    }
                    c28677v1M87180u.f115982d = interfaceC4351m2;
                }
                bottomSheetType2 = bottomSheetType;
                interfaceC4351m = onFieldUpdate;
                c28655q3.m87138X();
                str7 = str4;
                str8 = str6;
                c28655q = c28655q3;
                str9 = str5;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i214 = 1;
                    final EditProfileViewState.BottomSheetType bottomSheetType4 = bottomSheetType2;
                    final InterfaceC4351m interfaceC4351m4 = interfaceC4351m;
                    interfaceC4351m2 = new InterfaceC4351m() { // from class: com.whoop.profile.presentation.edit.d
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i214) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return HeightWeightContentKt.HeightWeightContent$lambda$0(bottomSheetType4, viewState, interfaceC4351m4, str7, str9, str8, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return HeightWeightContentKt.HeightWeightContent$lambda$12(bottomSheetType4, viewState, interfaceC4351m4, str7, str9, str8, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                    c28677v1M87180u.f115982d = interfaceC4351m2;
                }
            }
            i15 |= 24576;
            str5 = str2;
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    str6 = str3;
                    if (c28655q3.m87153g(str6)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                z4 = true;
                if ((74899 & i15) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q3.m87135U(i15 & 1, z13)) {
                    if (i24 != 0) {
                        str10 = null;
                    } else {
                        str10 = str4;
                    }
                    if (i16 != 0) {
                        str11 = null;
                    } else {
                        str11 = str5;
                    }
                    if (i18 != 0) {
                        str12 = null;
                    } else {
                        str12 = str6;
                    }
                    profileData = viewState.getProfileData();
                    if (profileData == null) {
                        c28677v1M87180u = c28655q3.m87180u();
                        if (c28677v1M87180u != null) {
                            return;
                        }
                        final int i215 = 0;
                        interfaceC4351m2 = new InterfaceC4351m() { // from class: com.whoop.profile.presentation.edit.d
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i215) {
                                    case 0:
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return HeightWeightContentKt.HeightWeightContent$lambda$0(bottomSheetType, viewState, onFieldUpdate, str10, str11, str12, i13, i14, (Composer) obj, iIntValue);
                                    default:
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        return HeightWeightContentKt.HeightWeightContent$lambda$12(bottomSheetType, viewState, onFieldUpdate, str10, str11, str12, i13, i14, (Composer) obj, iIntValue2);
                                }
                            }
                        };
                    } else {
                        bottomSheetType2 = bottomSheetType;
                        interfaceC4351m = onFieldUpdate;
                        str13 = str10;
                        str14 = str11;
                        str15 = str12;
                        if (str13 != null) {
                            unitSystem = profileData.getUnitSystem();
                        } else {
                            unitSystem = profileData.getUnitSystem();
                        }
                        if ((i15 & 7168) == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R = c28655q3.m87133R();
                        C28676v0 c28676v2 = C28635l.f115821a;
                        if (z14) {
                            objM87133R = AbstractC28683x.m87272z(unitSystem);
                            c28655q3.m87172p0(objM87133R);
                        } else {
                            objM87133R = AbstractC28683x.m87272z(unitSystem);
                            c28655q3.m87172p0(objM87133R);
                        }
                        zIsImperial = UnitSystemExtKt.isImperial(HeightWeightContent$lambda$3((InterfaceC28601c1) objM87133R));
                        if (bottomSheetType2 == EditProfileViewState.BottomSheetType.HEIGHT) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        weight = 0.0f;
                        if (!z15) {
                            height = 0.0f;
                        } else if (str14 != null) {
                        }
                        if (z15) {
                            editProfileData = profileData;
                        } else if (str15 != null) {
                            editProfileData = profileData;
                            weight = (float) editProfileData.getWeight();
                        } else {
                            editProfileData = profileData;
                            weight = (float) editProfileData.getWeight();
                        }
                        zM87147d = c28655q3.m87147d(height);
                        objM87133R2 = c28655q3.m87133R();
                        if (zM87147d) {
                            objM87133R2 = AbstractC11266d.m30468v(height, c28655q3);
                        } else {
                            objM87133R2 = AbstractC11266d.m30468v(height, c28655q3);
                        }
                        interfaceC28690z0 = (InterfaceC28690z0) objM87133R2;
                        zM87147d2 = c28655q3.m87147d(weight);
                        objM87133R3 = c28655q3.m87133R();
                        if (zM87147d2) {
                            objM87133R3 = AbstractC11266d.m30468v(weight, c28655q3);
                        } else {
                            objM87133R3 = AbstractC11266d.m30468v(weight, c28655q3);
                        }
                        interfaceC28690z1 = (InterfaceC28690z0) objM87133R3;
                        if (z15) {
                            c28655q3.m87150e0(1866126958);
                            float fHeightWeightContent$lambda$7 = HeightWeightContent$lambda$5(interfaceC28690z0);
                            EditProfileViewState.ValidationRanges validationRanges5 = editProfileData.getValidationRanges();
                            zM87153g = c28655q3.m87153g(interfaceC28690z0) | ((i15 & 896) == 256);
                            objM87133R5 = c28655q3.m87133R();
                            if (zM87153g) {
                                final int i216 = 0;
                                objM87133R5 = new Function1() { // from class: com.whoop.profile.presentation.edit.e
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        int i217 = i216;
                                        float fFloatValue = ((Float) obj).floatValue();
                                        switch (i217) {
                                            case 0:
                                                return HeightWeightContentKt.HeightWeightContent$lambda$10$0(interfaceC4351m, interfaceC28690z0, fFloatValue);
                                            default:
                                                return HeightWeightContentKt.HeightWeightContent$lambda$11$0(interfaceC4351m, interfaceC28690z0, fFloatValue);
                                        }
                                    }
                                };
                                c28655q3.m87172p0(objM87133R5);
                            } else {
                                final int i217 = 0;
                                objM87133R5 = new Function1() { // from class: com.whoop.profile.presentation.edit.e
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        int i218 = i217;
                                        float fFloatValue = ((Float) obj).floatValue();
                                        switch (i218) {
                                            case 0:
                                                return HeightWeightContentKt.HeightWeightContent$lambda$10$0(interfaceC4351m, interfaceC28690z0, fFloatValue);
                                            default:
                                                return HeightWeightContentKt.HeightWeightContent$lambda$11$0(interfaceC4351m, interfaceC28690z0, fFloatValue);
                                        }
                                    }
                                };
                                c28655q3.m87172p0(objM87133R5);
                            }
                            Function1 function3 = (Function1) objM87133R5;
                            c28655q2 = c28655q3;
                            HeightSelector(fHeightWeightContent$lambda$7, zIsImperial, validationRanges5, function3, c28655q2, 0);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(1866516907);
                            float fHeightWeightContent$lambda$10 = HeightWeightContent$lambda$8(interfaceC28690z1);
                            EditProfileViewState.ValidationRanges validationRanges6 = editProfileData.getValidationRanges();
                            boolean zM87153g4 = c28655q2.m87153g(interfaceC28690z1);
                            if ((i15 & 896) != 256) {
                                c28655q2 = c28655q3;
                                z4 = false;
                            }
                            c28655q2 = c28655q3;
                            z16 = zM87153g4 | z4;
                            objM87133R4 = c28655q2.m87133R();
                            if (z16) {
                                final int i218 = 1;
                                objM87133R4 = new Function1() { // from class: com.whoop.profile.presentation.edit.e
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        int i219 = i218;
                                        float fFloatValue = ((Float) obj).floatValue();
                                        switch (i219) {
                                            case 0:
                                                return HeightWeightContentKt.HeightWeightContent$lambda$10$0(interfaceC4351m, interfaceC28690z1, fFloatValue);
                                            default:
                                                return HeightWeightContentKt.HeightWeightContent$lambda$11$0(interfaceC4351m, interfaceC28690z1, fFloatValue);
                                        }
                                    }
                                };
                                c28655q2.m87172p0(objM87133R4);
                            } else {
                                final int i219 = 1;
                                objM87133R4 = new Function1() { // from class: com.whoop.profile.presentation.edit.e
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        int i2110 = i219;
                                        float fFloatValue = ((Float) obj).floatValue();
                                        switch (i2110) {
                                            case 0:
                                                return HeightWeightContentKt.HeightWeightContent$lambda$10$0(interfaceC4351m, interfaceC28690z1, fFloatValue);
                                            default:
                                                return HeightWeightContentKt.HeightWeightContent$lambda$11$0(interfaceC4351m, interfaceC28690z1, fFloatValue);
                                        }
                                    }
                                };
                                c28655q2.m87172p0(objM87133R4);
                            }
                            WeightSelector(fHeightWeightContent$lambda$10, zIsImperial, validationRanges6, (Function1) objM87133R4, c28655q2, 0);
                            c28655q2.m87173q(false);
                        }
                        c28655q = c28655q2;
                        str9 = str14;
                        str7 = str13;
                        str8 = str15;
                    }
                    c28677v1M87180u.f115982d = interfaceC4351m2;
                }
                bottomSheetType2 = bottomSheetType;
                interfaceC4351m = onFieldUpdate;
                c28655q3.m87138X();
                str7 = str4;
                str8 = str6;
                c28655q = c28655q3;
                str9 = str5;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i2110 = 1;
                    final EditProfileViewState.BottomSheetType bottomSheetType5 = bottomSheetType2;
                    final InterfaceC4351m interfaceC4351m5 = interfaceC4351m;
                    interfaceC4351m2 = new InterfaceC4351m() { // from class: com.whoop.profile.presentation.edit.d
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i2110) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return HeightWeightContentKt.HeightWeightContent$lambda$0(bottomSheetType5, viewState, interfaceC4351m5, str7, str9, str8, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return HeightWeightContentKt.HeightWeightContent$lambda$12(bottomSheetType5, viewState, interfaceC4351m5, str7, str9, str8, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                    c28677v1M87180u.f115982d = interfaceC4351m2;
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            str6 = str3;
            z4 = true;
            if ((74899 & i15) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q3.m87135U(i15 & 1, z13)) {
                if (i24 != 0) {
                    str10 = null;
                } else {
                    str10 = str4;
                }
                if (i16 != 0) {
                    str11 = null;
                } else {
                    str11 = str5;
                }
                if (i18 != 0) {
                    str12 = null;
                } else {
                    str12 = str6;
                }
                profileData = viewState.getProfileData();
                if (profileData == null) {
                    c28677v1M87180u = c28655q3.m87180u();
                    if (c28677v1M87180u != null) {
                        return;
                    }
                    final int i2111 = 0;
                    interfaceC4351m2 = new InterfaceC4351m() { // from class: com.whoop.profile.presentation.edit.d
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i2111) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return HeightWeightContentKt.HeightWeightContent$lambda$0(bottomSheetType, viewState, onFieldUpdate, str10, str11, str12, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return HeightWeightContentKt.HeightWeightContent$lambda$12(bottomSheetType, viewState, onFieldUpdate, str10, str11, str12, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                } else {
                    bottomSheetType2 = bottomSheetType;
                    interfaceC4351m = onFieldUpdate;
                    str13 = str10;
                    str14 = str11;
                    str15 = str12;
                    if (str13 != null) {
                        unitSystem = profileData.getUnitSystem();
                    } else {
                        unitSystem = profileData.getUnitSystem();
                    }
                    if ((i15 & 7168) == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R = c28655q3.m87133R();
                    C28676v0 c28676v3 = C28635l.f115821a;
                    if (z14) {
                        objM87133R = AbstractC28683x.m87272z(unitSystem);
                        c28655q3.m87172p0(objM87133R);
                    } else {
                        objM87133R = AbstractC28683x.m87272z(unitSystem);
                        c28655q3.m87172p0(objM87133R);
                    }
                    zIsImperial = UnitSystemExtKt.isImperial(HeightWeightContent$lambda$3((InterfaceC28601c1) objM87133R));
                    if (bottomSheetType2 == EditProfileViewState.BottomSheetType.HEIGHT) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    weight = 0.0f;
                    if (!z15) {
                        height = 0.0f;
                    } else if (str14 != null) {
                    }
                    if (z15) {
                        editProfileData = profileData;
                    } else if (str15 != null) {
                        editProfileData = profileData;
                        weight = (float) editProfileData.getWeight();
                    } else {
                        editProfileData = profileData;
                        weight = (float) editProfileData.getWeight();
                    }
                    zM87147d = c28655q3.m87147d(height);
                    objM87133R2 = c28655q3.m87133R();
                    if (zM87147d) {
                        objM87133R2 = AbstractC11266d.m30468v(height, c28655q3);
                    } else {
                        objM87133R2 = AbstractC11266d.m30468v(height, c28655q3);
                    }
                    interfaceC28690z0 = (InterfaceC28690z0) objM87133R2;
                    zM87147d2 = c28655q3.m87147d(weight);
                    objM87133R3 = c28655q3.m87133R();
                    if (zM87147d2) {
                        objM87133R3 = AbstractC11266d.m30468v(weight, c28655q3);
                    } else {
                        objM87133R3 = AbstractC11266d.m30468v(weight, c28655q3);
                    }
                    interfaceC28690z1 = (InterfaceC28690z0) objM87133R3;
                    if (z15) {
                        c28655q3.m87150e0(1866126958);
                        float fHeightWeightContent$lambda$11 = HeightWeightContent$lambda$5(interfaceC28690z0);
                        EditProfileViewState.ValidationRanges validationRanges7 = editProfileData.getValidationRanges();
                        zM87153g = c28655q3.m87153g(interfaceC28690z0) | ((i15 & 896) == 256);
                        objM87133R5 = c28655q3.m87133R();
                        if (zM87153g) {
                            final int i2112 = 0;
                            objM87133R5 = new Function1() { // from class: com.whoop.profile.presentation.edit.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    int i2113 = i2112;
                                    float fFloatValue = ((Float) obj).floatValue();
                                    switch (i2113) {
                                        case 0:
                                            return HeightWeightContentKt.HeightWeightContent$lambda$10$0(interfaceC4351m, interfaceC28690z0, fFloatValue);
                                        default:
                                            return HeightWeightContentKt.HeightWeightContent$lambda$11$0(interfaceC4351m, interfaceC28690z0, fFloatValue);
                                    }
                                }
                            };
                            c28655q3.m87172p0(objM87133R5);
                        } else {
                            final int i2113 = 0;
                            objM87133R5 = new Function1() { // from class: com.whoop.profile.presentation.edit.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    int i2114 = i2113;
                                    float fFloatValue = ((Float) obj).floatValue();
                                    switch (i2114) {
                                        case 0:
                                            return HeightWeightContentKt.HeightWeightContent$lambda$10$0(interfaceC4351m, interfaceC28690z0, fFloatValue);
                                        default:
                                            return HeightWeightContentKt.HeightWeightContent$lambda$11$0(interfaceC4351m, interfaceC28690z0, fFloatValue);
                                    }
                                }
                            };
                            c28655q3.m87172p0(objM87133R5);
                        }
                        Function1 function4 = (Function1) objM87133R5;
                        c28655q2 = c28655q3;
                        HeightSelector(fHeightWeightContent$lambda$11, zIsImperial, validationRanges7, function4, c28655q2, 0);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(1866516907);
                        float fHeightWeightContent$lambda$12 = HeightWeightContent$lambda$8(interfaceC28690z1);
                        EditProfileViewState.ValidationRanges validationRanges8 = editProfileData.getValidationRanges();
                        boolean zM87153g5 = c28655q2.m87153g(interfaceC28690z1);
                        if ((i15 & 896) != 256) {
                            c28655q2 = c28655q3;
                            z4 = false;
                        }
                        c28655q2 = c28655q3;
                        z16 = zM87153g5 | z4;
                        objM87133R4 = c28655q2.m87133R();
                        if (z16) {
                            final int i2114 = 1;
                            objM87133R4 = new Function1() { // from class: com.whoop.profile.presentation.edit.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    int i2115 = i2114;
                                    float fFloatValue = ((Float) obj).floatValue();
                                    switch (i2115) {
                                        case 0:
                                            return HeightWeightContentKt.HeightWeightContent$lambda$10$0(interfaceC4351m, interfaceC28690z1, fFloatValue);
                                        default:
                                            return HeightWeightContentKt.HeightWeightContent$lambda$11$0(interfaceC4351m, interfaceC28690z1, fFloatValue);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R4);
                        } else {
                            final int i2115 = 1;
                            objM87133R4 = new Function1() { // from class: com.whoop.profile.presentation.edit.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    int i2116 = i2115;
                                    float fFloatValue = ((Float) obj).floatValue();
                                    switch (i2116) {
                                        case 0:
                                            return HeightWeightContentKt.HeightWeightContent$lambda$10$0(interfaceC4351m, interfaceC28690z1, fFloatValue);
                                        default:
                                            return HeightWeightContentKt.HeightWeightContent$lambda$11$0(interfaceC4351m, interfaceC28690z1, fFloatValue);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R4);
                        }
                        WeightSelector(fHeightWeightContent$lambda$12, zIsImperial, validationRanges8, (Function1) objM87133R4, c28655q2, 0);
                        c28655q2.m87173q(false);
                    }
                    c28655q = c28655q2;
                    str9 = str14;
                    str7 = str13;
                    str8 = str15;
                }
                c28677v1M87180u.f115982d = interfaceC4351m2;
            }
            bottomSheetType2 = bottomSheetType;
            interfaceC4351m = onFieldUpdate;
            c28655q3.m87138X();
            str7 = str4;
            str8 = str6;
            c28655q = c28655q3;
            str9 = str5;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i2116 = 1;
                final EditProfileViewState.BottomSheetType bottomSheetType6 = bottomSheetType2;
                final InterfaceC4351m interfaceC4351m6 = interfaceC4351m;
                interfaceC4351m2 = new InterfaceC4351m() { // from class: com.whoop.profile.presentation.edit.d
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i2116) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return HeightWeightContentKt.HeightWeightContent$lambda$0(bottomSheetType6, viewState, interfaceC4351m6, str7, str9, str8, i13, i14, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return HeightWeightContentKt.HeightWeightContent$lambda$12(bottomSheetType6, viewState, interfaceC4351m6, str7, str9, str8, i13, i14, (Composer) obj, iIntValue2);
                        }
                    }
                };
                c28677v1M87180u.f115982d = interfaceC4351m2;
            }
        }
        i15 |= 3072;
        str4 = str;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                str5 = str2;
                if (c28655q3.m87153g(str5)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    str6 = str3;
                    if (c28655q3.m87153g(str6)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                z4 = true;
                if ((74899 & i15) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q3.m87135U(i15 & 1, z13)) {
                    if (i24 != 0) {
                        str10 = null;
                    } else {
                        str10 = str4;
                    }
                    if (i16 != 0) {
                        str11 = null;
                    } else {
                        str11 = str5;
                    }
                    if (i18 != 0) {
                        str12 = null;
                    } else {
                        str12 = str6;
                    }
                    profileData = viewState.getProfileData();
                    if (profileData == null) {
                        c28677v1M87180u = c28655q3.m87180u();
                        if (c28677v1M87180u != null) {
                            return;
                        }
                        final int i2117 = 0;
                        interfaceC4351m2 = new InterfaceC4351m() { // from class: com.whoop.profile.presentation.edit.d
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i2117) {
                                    case 0:
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return HeightWeightContentKt.HeightWeightContent$lambda$0(bottomSheetType, viewState, onFieldUpdate, str10, str11, str12, i13, i14, (Composer) obj, iIntValue);
                                    default:
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        return HeightWeightContentKt.HeightWeightContent$lambda$12(bottomSheetType, viewState, onFieldUpdate, str10, str11, str12, i13, i14, (Composer) obj, iIntValue2);
                                }
                            }
                        };
                    } else {
                        bottomSheetType2 = bottomSheetType;
                        interfaceC4351m = onFieldUpdate;
                        str13 = str10;
                        str14 = str11;
                        str15 = str12;
                        if (str13 != null) {
                            unitSystem = profileData.getUnitSystem();
                        } else {
                            unitSystem = profileData.getUnitSystem();
                        }
                        if ((i15 & 7168) == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R = c28655q3.m87133R();
                        C28676v0 c28676v4 = C28635l.f115821a;
                        if (z14) {
                            objM87133R = AbstractC28683x.m87272z(unitSystem);
                            c28655q3.m87172p0(objM87133R);
                        } else {
                            objM87133R = AbstractC28683x.m87272z(unitSystem);
                            c28655q3.m87172p0(objM87133R);
                        }
                        zIsImperial = UnitSystemExtKt.isImperial(HeightWeightContent$lambda$3((InterfaceC28601c1) objM87133R));
                        if (bottomSheetType2 == EditProfileViewState.BottomSheetType.HEIGHT) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        weight = 0.0f;
                        if (!z15) {
                            height = 0.0f;
                        } else if (str14 != null) {
                        }
                        if (z15) {
                            editProfileData = profileData;
                        } else if (str15 != null) {
                            editProfileData = profileData;
                            weight = (float) editProfileData.getWeight();
                        } else {
                            editProfileData = profileData;
                            weight = (float) editProfileData.getWeight();
                        }
                        zM87147d = c28655q3.m87147d(height);
                        objM87133R2 = c28655q3.m87133R();
                        if (zM87147d) {
                            objM87133R2 = AbstractC11266d.m30468v(height, c28655q3);
                        } else {
                            objM87133R2 = AbstractC11266d.m30468v(height, c28655q3);
                        }
                        interfaceC28690z0 = (InterfaceC28690z0) objM87133R2;
                        zM87147d2 = c28655q3.m87147d(weight);
                        objM87133R3 = c28655q3.m87133R();
                        if (zM87147d2) {
                            objM87133R3 = AbstractC11266d.m30468v(weight, c28655q3);
                        } else {
                            objM87133R3 = AbstractC11266d.m30468v(weight, c28655q3);
                        }
                        interfaceC28690z1 = (InterfaceC28690z0) objM87133R3;
                        if (z15) {
                            c28655q3.m87150e0(1866126958);
                            float fHeightWeightContent$lambda$13 = HeightWeightContent$lambda$5(interfaceC28690z0);
                            EditProfileViewState.ValidationRanges validationRanges9 = editProfileData.getValidationRanges();
                            zM87153g = c28655q3.m87153g(interfaceC28690z0) | ((i15 & 896) == 256);
                            objM87133R5 = c28655q3.m87133R();
                            if (zM87153g) {
                                final int i2118 = 0;
                                objM87133R5 = new Function1() { // from class: com.whoop.profile.presentation.edit.e
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        int i2119 = i2118;
                                        float fFloatValue = ((Float) obj).floatValue();
                                        switch (i2119) {
                                            case 0:
                                                return HeightWeightContentKt.HeightWeightContent$lambda$10$0(interfaceC4351m, interfaceC28690z0, fFloatValue);
                                            default:
                                                return HeightWeightContentKt.HeightWeightContent$lambda$11$0(interfaceC4351m, interfaceC28690z0, fFloatValue);
                                        }
                                    }
                                };
                                c28655q3.m87172p0(objM87133R5);
                            } else {
                                final int i2119 = 0;
                                objM87133R5 = new Function1() { // from class: com.whoop.profile.presentation.edit.e
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        int i21110 = i2119;
                                        float fFloatValue = ((Float) obj).floatValue();
                                        switch (i21110) {
                                            case 0:
                                                return HeightWeightContentKt.HeightWeightContent$lambda$10$0(interfaceC4351m, interfaceC28690z0, fFloatValue);
                                            default:
                                                return HeightWeightContentKt.HeightWeightContent$lambda$11$0(interfaceC4351m, interfaceC28690z0, fFloatValue);
                                        }
                                    }
                                };
                                c28655q3.m87172p0(objM87133R5);
                            }
                            Function1 function5 = (Function1) objM87133R5;
                            c28655q2 = c28655q3;
                            HeightSelector(fHeightWeightContent$lambda$13, zIsImperial, validationRanges9, function5, c28655q2, 0);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(1866516907);
                            float fHeightWeightContent$lambda$14 = HeightWeightContent$lambda$8(interfaceC28690z1);
                            EditProfileViewState.ValidationRanges validationRanges10 = editProfileData.getValidationRanges();
                            boolean zM87153g6 = c28655q2.m87153g(interfaceC28690z1);
                            if ((i15 & 896) != 256) {
                                c28655q2 = c28655q3;
                                z4 = false;
                            }
                            c28655q2 = c28655q3;
                            z16 = zM87153g6 | z4;
                            objM87133R4 = c28655q2.m87133R();
                            if (z16) {
                                final int i21110 = 1;
                                objM87133R4 = new Function1() { // from class: com.whoop.profile.presentation.edit.e
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        int i21111 = i21110;
                                        float fFloatValue = ((Float) obj).floatValue();
                                        switch (i21111) {
                                            case 0:
                                                return HeightWeightContentKt.HeightWeightContent$lambda$10$0(interfaceC4351m, interfaceC28690z1, fFloatValue);
                                            default:
                                                return HeightWeightContentKt.HeightWeightContent$lambda$11$0(interfaceC4351m, interfaceC28690z1, fFloatValue);
                                        }
                                    }
                                };
                                c28655q2.m87172p0(objM87133R4);
                            } else {
                                final int i21111 = 1;
                                objM87133R4 = new Function1() { // from class: com.whoop.profile.presentation.edit.e
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        int i21112 = i21111;
                                        float fFloatValue = ((Float) obj).floatValue();
                                        switch (i21112) {
                                            case 0:
                                                return HeightWeightContentKt.HeightWeightContent$lambda$10$0(interfaceC4351m, interfaceC28690z1, fFloatValue);
                                            default:
                                                return HeightWeightContentKt.HeightWeightContent$lambda$11$0(interfaceC4351m, interfaceC28690z1, fFloatValue);
                                        }
                                    }
                                };
                                c28655q2.m87172p0(objM87133R4);
                            }
                            WeightSelector(fHeightWeightContent$lambda$14, zIsImperial, validationRanges10, (Function1) objM87133R4, c28655q2, 0);
                            c28655q2.m87173q(false);
                        }
                        c28655q = c28655q2;
                        str9 = str14;
                        str7 = str13;
                        str8 = str15;
                    }
                    c28677v1M87180u.f115982d = interfaceC4351m2;
                }
                bottomSheetType2 = bottomSheetType;
                interfaceC4351m = onFieldUpdate;
                c28655q3.m87138X();
                str7 = str4;
                str8 = str6;
                c28655q = c28655q3;
                str9 = str5;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i21112 = 1;
                    final EditProfileViewState.BottomSheetType bottomSheetType7 = bottomSheetType2;
                    final InterfaceC4351m interfaceC4351m7 = interfaceC4351m;
                    interfaceC4351m2 = new InterfaceC4351m() { // from class: com.whoop.profile.presentation.edit.d
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i21112) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return HeightWeightContentKt.HeightWeightContent$lambda$0(bottomSheetType7, viewState, interfaceC4351m7, str7, str9, str8, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return HeightWeightContentKt.HeightWeightContent$lambda$12(bottomSheetType7, viewState, interfaceC4351m7, str7, str9, str8, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                    c28677v1M87180u.f115982d = interfaceC4351m2;
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            str6 = str3;
            z4 = true;
            if ((74899 & i15) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q3.m87135U(i15 & 1, z13)) {
                if (i24 != 0) {
                    str10 = null;
                } else {
                    str10 = str4;
                }
                if (i16 != 0) {
                    str11 = null;
                } else {
                    str11 = str5;
                }
                if (i18 != 0) {
                    str12 = null;
                } else {
                    str12 = str6;
                }
                profileData = viewState.getProfileData();
                if (profileData == null) {
                    c28677v1M87180u = c28655q3.m87180u();
                    if (c28677v1M87180u != null) {
                        return;
                    }
                    final int i21113 = 0;
                    interfaceC4351m2 = new InterfaceC4351m() { // from class: com.whoop.profile.presentation.edit.d
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i21113) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return HeightWeightContentKt.HeightWeightContent$lambda$0(bottomSheetType, viewState, onFieldUpdate, str10, str11, str12, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return HeightWeightContentKt.HeightWeightContent$lambda$12(bottomSheetType, viewState, onFieldUpdate, str10, str11, str12, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                } else {
                    bottomSheetType2 = bottomSheetType;
                    interfaceC4351m = onFieldUpdate;
                    str13 = str10;
                    str14 = str11;
                    str15 = str12;
                    if (str13 != null) {
                        unitSystem = profileData.getUnitSystem();
                    } else {
                        unitSystem = profileData.getUnitSystem();
                    }
                    if ((i15 & 7168) == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R = c28655q3.m87133R();
                    C28676v0 c28676v5 = C28635l.f115821a;
                    if (z14) {
                        objM87133R = AbstractC28683x.m87272z(unitSystem);
                        c28655q3.m87172p0(objM87133R);
                    } else {
                        objM87133R = AbstractC28683x.m87272z(unitSystem);
                        c28655q3.m87172p0(objM87133R);
                    }
                    zIsImperial = UnitSystemExtKt.isImperial(HeightWeightContent$lambda$3((InterfaceC28601c1) objM87133R));
                    if (bottomSheetType2 == EditProfileViewState.BottomSheetType.HEIGHT) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    weight = 0.0f;
                    if (!z15) {
                        height = 0.0f;
                    } else if (str14 != null) {
                    }
                    if (z15) {
                        editProfileData = profileData;
                    } else if (str15 != null) {
                        editProfileData = profileData;
                        weight = (float) editProfileData.getWeight();
                    } else {
                        editProfileData = profileData;
                        weight = (float) editProfileData.getWeight();
                    }
                    zM87147d = c28655q3.m87147d(height);
                    objM87133R2 = c28655q3.m87133R();
                    if (zM87147d) {
                        objM87133R2 = AbstractC11266d.m30468v(height, c28655q3);
                    } else {
                        objM87133R2 = AbstractC11266d.m30468v(height, c28655q3);
                    }
                    interfaceC28690z0 = (InterfaceC28690z0) objM87133R2;
                    zM87147d2 = c28655q3.m87147d(weight);
                    objM87133R3 = c28655q3.m87133R();
                    if (zM87147d2) {
                        objM87133R3 = AbstractC11266d.m30468v(weight, c28655q3);
                    } else {
                        objM87133R3 = AbstractC11266d.m30468v(weight, c28655q3);
                    }
                    interfaceC28690z1 = (InterfaceC28690z0) objM87133R3;
                    if (z15) {
                        c28655q3.m87150e0(1866126958);
                        float fHeightWeightContent$lambda$15 = HeightWeightContent$lambda$5(interfaceC28690z0);
                        EditProfileViewState.ValidationRanges validationRanges11 = editProfileData.getValidationRanges();
                        zM87153g = c28655q3.m87153g(interfaceC28690z0) | ((i15 & 896) == 256);
                        objM87133R5 = c28655q3.m87133R();
                        if (zM87153g) {
                            final int i21114 = 0;
                            objM87133R5 = new Function1() { // from class: com.whoop.profile.presentation.edit.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    int i21115 = i21114;
                                    float fFloatValue = ((Float) obj).floatValue();
                                    switch (i21115) {
                                        case 0:
                                            return HeightWeightContentKt.HeightWeightContent$lambda$10$0(interfaceC4351m, interfaceC28690z0, fFloatValue);
                                        default:
                                            return HeightWeightContentKt.HeightWeightContent$lambda$11$0(interfaceC4351m, interfaceC28690z0, fFloatValue);
                                    }
                                }
                            };
                            c28655q3.m87172p0(objM87133R5);
                        } else {
                            final int i21115 = 0;
                            objM87133R5 = new Function1() { // from class: com.whoop.profile.presentation.edit.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    int i21116 = i21115;
                                    float fFloatValue = ((Float) obj).floatValue();
                                    switch (i21116) {
                                        case 0:
                                            return HeightWeightContentKt.HeightWeightContent$lambda$10$0(interfaceC4351m, interfaceC28690z0, fFloatValue);
                                        default:
                                            return HeightWeightContentKt.HeightWeightContent$lambda$11$0(interfaceC4351m, interfaceC28690z0, fFloatValue);
                                    }
                                }
                            };
                            c28655q3.m87172p0(objM87133R5);
                        }
                        Function1 function6 = (Function1) objM87133R5;
                        c28655q2 = c28655q3;
                        HeightSelector(fHeightWeightContent$lambda$15, zIsImperial, validationRanges11, function6, c28655q2, 0);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(1866516907);
                        float fHeightWeightContent$lambda$16 = HeightWeightContent$lambda$8(interfaceC28690z1);
                        EditProfileViewState.ValidationRanges validationRanges12 = editProfileData.getValidationRanges();
                        boolean zM87153g7 = c28655q2.m87153g(interfaceC28690z1);
                        if ((i15 & 896) != 256) {
                            c28655q2 = c28655q3;
                            z4 = false;
                        }
                        c28655q2 = c28655q3;
                        z16 = zM87153g7 | z4;
                        objM87133R4 = c28655q2.m87133R();
                        if (z16) {
                            final int i21116 = 1;
                            objM87133R4 = new Function1() { // from class: com.whoop.profile.presentation.edit.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    int i21117 = i21116;
                                    float fFloatValue = ((Float) obj).floatValue();
                                    switch (i21117) {
                                        case 0:
                                            return HeightWeightContentKt.HeightWeightContent$lambda$10$0(interfaceC4351m, interfaceC28690z1, fFloatValue);
                                        default:
                                            return HeightWeightContentKt.HeightWeightContent$lambda$11$0(interfaceC4351m, interfaceC28690z1, fFloatValue);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R4);
                        } else {
                            final int i21117 = 1;
                            objM87133R4 = new Function1() { // from class: com.whoop.profile.presentation.edit.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    int i21118 = i21117;
                                    float fFloatValue = ((Float) obj).floatValue();
                                    switch (i21118) {
                                        case 0:
                                            return HeightWeightContentKt.HeightWeightContent$lambda$10$0(interfaceC4351m, interfaceC28690z1, fFloatValue);
                                        default:
                                            return HeightWeightContentKt.HeightWeightContent$lambda$11$0(interfaceC4351m, interfaceC28690z1, fFloatValue);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R4);
                        }
                        WeightSelector(fHeightWeightContent$lambda$16, zIsImperial, validationRanges12, (Function1) objM87133R4, c28655q2, 0);
                        c28655q2.m87173q(false);
                    }
                    c28655q = c28655q2;
                    str9 = str14;
                    str7 = str13;
                    str8 = str15;
                }
                c28677v1M87180u.f115982d = interfaceC4351m2;
            }
            bottomSheetType2 = bottomSheetType;
            interfaceC4351m = onFieldUpdate;
            c28655q3.m87138X();
            str7 = str4;
            str8 = str6;
            c28655q = c28655q3;
            str9 = str5;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i21118 = 1;
                final EditProfileViewState.BottomSheetType bottomSheetType8 = bottomSheetType2;
                final InterfaceC4351m interfaceC4351m8 = interfaceC4351m;
                interfaceC4351m2 = new InterfaceC4351m() { // from class: com.whoop.profile.presentation.edit.d
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i21118) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return HeightWeightContentKt.HeightWeightContent$lambda$0(bottomSheetType8, viewState, interfaceC4351m8, str7, str9, str8, i13, i14, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return HeightWeightContentKt.HeightWeightContent$lambda$12(bottomSheetType8, viewState, interfaceC4351m8, str7, str9, str8, i13, i14, (Composer) obj, iIntValue2);
                        }
                    }
                };
                c28677v1M87180u.f115982d = interfaceC4351m2;
            }
        }
        i15 |= 24576;
        str5 = str2;
        i18 = i14 & 32;
        if (i18 != 0) {
            if ((196608 & i13) == 0) {
                str6 = str3;
                if (c28655q3.m87153g(str6)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i19;
            }
            z4 = true;
            if ((74899 & i15) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q3.m87135U(i15 & 1, z13)) {
                if (i24 != 0) {
                    str10 = null;
                } else {
                    str10 = str4;
                }
                if (i16 != 0) {
                    str11 = null;
                } else {
                    str11 = str5;
                }
                if (i18 != 0) {
                    str12 = null;
                } else {
                    str12 = str6;
                }
                profileData = viewState.getProfileData();
                if (profileData == null) {
                    c28677v1M87180u = c28655q3.m87180u();
                    if (c28677v1M87180u != null) {
                        return;
                    }
                    final int i21119 = 0;
                    interfaceC4351m2 = new InterfaceC4351m() { // from class: com.whoop.profile.presentation.edit.d
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i21119) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return HeightWeightContentKt.HeightWeightContent$lambda$0(bottomSheetType, viewState, onFieldUpdate, str10, str11, str12, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return HeightWeightContentKt.HeightWeightContent$lambda$12(bottomSheetType, viewState, onFieldUpdate, str10, str11, str12, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                } else {
                    bottomSheetType2 = bottomSheetType;
                    interfaceC4351m = onFieldUpdate;
                    str13 = str10;
                    str14 = str11;
                    str15 = str12;
                    if (str13 != null) {
                        unitSystem = profileData.getUnitSystem();
                    } else {
                        unitSystem = profileData.getUnitSystem();
                    }
                    if ((i15 & 7168) == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R = c28655q3.m87133R();
                    C28676v0 c28676v6 = C28635l.f115821a;
                    if (z14) {
                        objM87133R = AbstractC28683x.m87272z(unitSystem);
                        c28655q3.m87172p0(objM87133R);
                    } else {
                        objM87133R = AbstractC28683x.m87272z(unitSystem);
                        c28655q3.m87172p0(objM87133R);
                    }
                    zIsImperial = UnitSystemExtKt.isImperial(HeightWeightContent$lambda$3((InterfaceC28601c1) objM87133R));
                    if (bottomSheetType2 == EditProfileViewState.BottomSheetType.HEIGHT) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    weight = 0.0f;
                    if (!z15) {
                        height = 0.0f;
                    } else if (str14 != null) {
                    }
                    if (z15) {
                        editProfileData = profileData;
                    } else if (str15 != null) {
                        editProfileData = profileData;
                        weight = (float) editProfileData.getWeight();
                    } else {
                        editProfileData = profileData;
                        weight = (float) editProfileData.getWeight();
                    }
                    zM87147d = c28655q3.m87147d(height);
                    objM87133R2 = c28655q3.m87133R();
                    if (zM87147d) {
                        objM87133R2 = AbstractC11266d.m30468v(height, c28655q3);
                    } else {
                        objM87133R2 = AbstractC11266d.m30468v(height, c28655q3);
                    }
                    interfaceC28690z0 = (InterfaceC28690z0) objM87133R2;
                    zM87147d2 = c28655q3.m87147d(weight);
                    objM87133R3 = c28655q3.m87133R();
                    if (zM87147d2) {
                        objM87133R3 = AbstractC11266d.m30468v(weight, c28655q3);
                    } else {
                        objM87133R3 = AbstractC11266d.m30468v(weight, c28655q3);
                    }
                    interfaceC28690z1 = (InterfaceC28690z0) objM87133R3;
                    if (z15) {
                        c28655q3.m87150e0(1866126958);
                        float fHeightWeightContent$lambda$17 = HeightWeightContent$lambda$5(interfaceC28690z0);
                        EditProfileViewState.ValidationRanges validationRanges13 = editProfileData.getValidationRanges();
                        zM87153g = c28655q3.m87153g(interfaceC28690z0) | ((i15 & 896) == 256);
                        objM87133R5 = c28655q3.m87133R();
                        if (zM87153g) {
                            final int i211110 = 0;
                            objM87133R5 = new Function1() { // from class: com.whoop.profile.presentation.edit.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    int i211111 = i211110;
                                    float fFloatValue = ((Float) obj).floatValue();
                                    switch (i211111) {
                                        case 0:
                                            return HeightWeightContentKt.HeightWeightContent$lambda$10$0(interfaceC4351m, interfaceC28690z0, fFloatValue);
                                        default:
                                            return HeightWeightContentKt.HeightWeightContent$lambda$11$0(interfaceC4351m, interfaceC28690z0, fFloatValue);
                                    }
                                }
                            };
                            c28655q3.m87172p0(objM87133R5);
                        } else {
                            final int i211111 = 0;
                            objM87133R5 = new Function1() { // from class: com.whoop.profile.presentation.edit.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    int i211112 = i211111;
                                    float fFloatValue = ((Float) obj).floatValue();
                                    switch (i211112) {
                                        case 0:
                                            return HeightWeightContentKt.HeightWeightContent$lambda$10$0(interfaceC4351m, interfaceC28690z0, fFloatValue);
                                        default:
                                            return HeightWeightContentKt.HeightWeightContent$lambda$11$0(interfaceC4351m, interfaceC28690z0, fFloatValue);
                                    }
                                }
                            };
                            c28655q3.m87172p0(objM87133R5);
                        }
                        Function1 function7 = (Function1) objM87133R5;
                        c28655q2 = c28655q3;
                        HeightSelector(fHeightWeightContent$lambda$17, zIsImperial, validationRanges13, function7, c28655q2, 0);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(1866516907);
                        float fHeightWeightContent$lambda$18 = HeightWeightContent$lambda$8(interfaceC28690z1);
                        EditProfileViewState.ValidationRanges validationRanges14 = editProfileData.getValidationRanges();
                        boolean zM87153g8 = c28655q2.m87153g(interfaceC28690z1);
                        if ((i15 & 896) != 256) {
                            c28655q2 = c28655q3;
                            z4 = false;
                        }
                        c28655q2 = c28655q3;
                        z16 = zM87153g8 | z4;
                        objM87133R4 = c28655q2.m87133R();
                        if (z16) {
                            final int i211112 = 1;
                            objM87133R4 = new Function1() { // from class: com.whoop.profile.presentation.edit.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    int i211113 = i211112;
                                    float fFloatValue = ((Float) obj).floatValue();
                                    switch (i211113) {
                                        case 0:
                                            return HeightWeightContentKt.HeightWeightContent$lambda$10$0(interfaceC4351m, interfaceC28690z1, fFloatValue);
                                        default:
                                            return HeightWeightContentKt.HeightWeightContent$lambda$11$0(interfaceC4351m, interfaceC28690z1, fFloatValue);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R4);
                        } else {
                            final int i211113 = 1;
                            objM87133R4 = new Function1() { // from class: com.whoop.profile.presentation.edit.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    int i211114 = i211113;
                                    float fFloatValue = ((Float) obj).floatValue();
                                    switch (i211114) {
                                        case 0:
                                            return HeightWeightContentKt.HeightWeightContent$lambda$10$0(interfaceC4351m, interfaceC28690z1, fFloatValue);
                                        default:
                                            return HeightWeightContentKt.HeightWeightContent$lambda$11$0(interfaceC4351m, interfaceC28690z1, fFloatValue);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R4);
                        }
                        WeightSelector(fHeightWeightContent$lambda$18, zIsImperial, validationRanges14, (Function1) objM87133R4, c28655q2, 0);
                        c28655q2.m87173q(false);
                    }
                    c28655q = c28655q2;
                    str9 = str14;
                    str7 = str13;
                    str8 = str15;
                }
                c28677v1M87180u.f115982d = interfaceC4351m2;
            }
            bottomSheetType2 = bottomSheetType;
            interfaceC4351m = onFieldUpdate;
            c28655q3.m87138X();
            str7 = str4;
            str8 = str6;
            c28655q = c28655q3;
            str9 = str5;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i211114 = 1;
                final EditProfileViewState.BottomSheetType bottomSheetType9 = bottomSheetType2;
                final InterfaceC4351m interfaceC4351m9 = interfaceC4351m;
                interfaceC4351m2 = new InterfaceC4351m() { // from class: com.whoop.profile.presentation.edit.d
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i211114) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return HeightWeightContentKt.HeightWeightContent$lambda$0(bottomSheetType9, viewState, interfaceC4351m9, str7, str9, str8, i13, i14, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return HeightWeightContentKt.HeightWeightContent$lambda$12(bottomSheetType9, viewState, interfaceC4351m9, str7, str9, str8, i13, i14, (Composer) obj, iIntValue2);
                        }
                    }
                };
                c28677v1M87180u.f115982d = interfaceC4351m2;
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        str6 = str3;
        z4 = true;
        if ((74899 & i15) != 74898) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q3.m87135U(i15 & 1, z13)) {
            if (i24 != 0) {
                str10 = null;
            } else {
                str10 = str4;
            }
            if (i16 != 0) {
                str11 = null;
            } else {
                str11 = str5;
            }
            if (i18 != 0) {
                str12 = null;
            } else {
                str12 = str6;
            }
            profileData = viewState.getProfileData();
            if (profileData == null) {
                c28677v1M87180u = c28655q3.m87180u();
                if (c28677v1M87180u != null) {
                    return;
                }
                final int i211115 = 0;
                interfaceC4351m2 = new InterfaceC4351m() { // from class: com.whoop.profile.presentation.edit.d
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i211115) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return HeightWeightContentKt.HeightWeightContent$lambda$0(bottomSheetType, viewState, onFieldUpdate, str10, str11, str12, i13, i14, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return HeightWeightContentKt.HeightWeightContent$lambda$12(bottomSheetType, viewState, onFieldUpdate, str10, str11, str12, i13, i14, (Composer) obj, iIntValue2);
                        }
                    }
                };
            } else {
                bottomSheetType2 = bottomSheetType;
                interfaceC4351m = onFieldUpdate;
                str13 = str10;
                str14 = str11;
                str15 = str12;
                if (str13 != null) {
                    unitSystem = profileData.getUnitSystem();
                } else {
                    unitSystem = profileData.getUnitSystem();
                }
                if ((i15 & 7168) == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R = c28655q3.m87133R();
                C28676v0 c28676v7 = C28635l.f115821a;
                if (z14) {
                    objM87133R = AbstractC28683x.m87272z(unitSystem);
                    c28655q3.m87172p0(objM87133R);
                } else {
                    objM87133R = AbstractC28683x.m87272z(unitSystem);
                    c28655q3.m87172p0(objM87133R);
                }
                zIsImperial = UnitSystemExtKt.isImperial(HeightWeightContent$lambda$3((InterfaceC28601c1) objM87133R));
                if (bottomSheetType2 == EditProfileViewState.BottomSheetType.HEIGHT) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                weight = 0.0f;
                if (!z15) {
                    height = 0.0f;
                } else if (str14 != null) {
                }
                if (z15) {
                    editProfileData = profileData;
                } else if (str15 != null) {
                    editProfileData = profileData;
                    weight = (float) editProfileData.getWeight();
                } else {
                    editProfileData = profileData;
                    weight = (float) editProfileData.getWeight();
                }
                zM87147d = c28655q3.m87147d(height);
                objM87133R2 = c28655q3.m87133R();
                if (zM87147d) {
                    objM87133R2 = AbstractC11266d.m30468v(height, c28655q3);
                } else {
                    objM87133R2 = AbstractC11266d.m30468v(height, c28655q3);
                }
                interfaceC28690z0 = (InterfaceC28690z0) objM87133R2;
                zM87147d2 = c28655q3.m87147d(weight);
                objM87133R3 = c28655q3.m87133R();
                if (zM87147d2) {
                    objM87133R3 = AbstractC11266d.m30468v(weight, c28655q3);
                } else {
                    objM87133R3 = AbstractC11266d.m30468v(weight, c28655q3);
                }
                interfaceC28690z1 = (InterfaceC28690z0) objM87133R3;
                if (z15) {
                    c28655q3.m87150e0(1866126958);
                    float fHeightWeightContent$lambda$19 = HeightWeightContent$lambda$5(interfaceC28690z0);
                    EditProfileViewState.ValidationRanges validationRanges15 = editProfileData.getValidationRanges();
                    zM87153g = c28655q3.m87153g(interfaceC28690z0) | ((i15 & 896) == 256);
                    objM87133R5 = c28655q3.m87133R();
                    if (zM87153g) {
                        final int i211116 = 0;
                        objM87133R5 = new Function1() { // from class: com.whoop.profile.presentation.edit.e
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                int i211117 = i211116;
                                float fFloatValue = ((Float) obj).floatValue();
                                switch (i211117) {
                                    case 0:
                                        return HeightWeightContentKt.HeightWeightContent$lambda$10$0(interfaceC4351m, interfaceC28690z0, fFloatValue);
                                    default:
                                        return HeightWeightContentKt.HeightWeightContent$lambda$11$0(interfaceC4351m, interfaceC28690z0, fFloatValue);
                                }
                            }
                        };
                        c28655q3.m87172p0(objM87133R5);
                    } else {
                        final int i211117 = 0;
                        objM87133R5 = new Function1() { // from class: com.whoop.profile.presentation.edit.e
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                int i211118 = i211117;
                                float fFloatValue = ((Float) obj).floatValue();
                                switch (i211118) {
                                    case 0:
                                        return HeightWeightContentKt.HeightWeightContent$lambda$10$0(interfaceC4351m, interfaceC28690z0, fFloatValue);
                                    default:
                                        return HeightWeightContentKt.HeightWeightContent$lambda$11$0(interfaceC4351m, interfaceC28690z0, fFloatValue);
                                }
                            }
                        };
                        c28655q3.m87172p0(objM87133R5);
                    }
                    Function1 function8 = (Function1) objM87133R5;
                    c28655q2 = c28655q3;
                    HeightSelector(fHeightWeightContent$lambda$19, zIsImperial, validationRanges15, function8, c28655q2, 0);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(1866516907);
                    float fHeightWeightContent$lambda$110 = HeightWeightContent$lambda$8(interfaceC28690z1);
                    EditProfileViewState.ValidationRanges validationRanges16 = editProfileData.getValidationRanges();
                    boolean zM87153g9 = c28655q2.m87153g(interfaceC28690z1);
                    if ((i15 & 896) != 256) {
                        c28655q2 = c28655q3;
                        z4 = false;
                    }
                    c28655q2 = c28655q3;
                    z16 = zM87153g9 | z4;
                    objM87133R4 = c28655q2.m87133R();
                    if (z16) {
                        final int i211118 = 1;
                        objM87133R4 = new Function1() { // from class: com.whoop.profile.presentation.edit.e
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                int i211119 = i211118;
                                float fFloatValue = ((Float) obj).floatValue();
                                switch (i211119) {
                                    case 0:
                                        return HeightWeightContentKt.HeightWeightContent$lambda$10$0(interfaceC4351m, interfaceC28690z1, fFloatValue);
                                    default:
                                        return HeightWeightContentKt.HeightWeightContent$lambda$11$0(interfaceC4351m, interfaceC28690z1, fFloatValue);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R4);
                    } else {
                        final int i211119 = 1;
                        objM87133R4 = new Function1() { // from class: com.whoop.profile.presentation.edit.e
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                int i2111110 = i211119;
                                float fFloatValue = ((Float) obj).floatValue();
                                switch (i2111110) {
                                    case 0:
                                        return HeightWeightContentKt.HeightWeightContent$lambda$10$0(interfaceC4351m, interfaceC28690z1, fFloatValue);
                                    default:
                                        return HeightWeightContentKt.HeightWeightContent$lambda$11$0(interfaceC4351m, interfaceC28690z1, fFloatValue);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R4);
                    }
                    WeightSelector(fHeightWeightContent$lambda$110, zIsImperial, validationRanges16, (Function1) objM87133R4, c28655q2, 0);
                    c28655q2.m87173q(false);
                }
                c28655q = c28655q2;
                str9 = str14;
                str7 = str13;
                str8 = str15;
            }
            c28677v1M87180u.f115982d = interfaceC4351m2;
        }
        bottomSheetType2 = bottomSheetType;
        interfaceC4351m = onFieldUpdate;
        c28655q3.m87138X();
        str7 = str4;
        str8 = str6;
        c28655q = c28655q3;
        str9 = str5;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final int i2111110 = 1;
            final EditProfileViewState.BottomSheetType bottomSheetType10 = bottomSheetType2;
            final InterfaceC4351m interfaceC4351m10 = interfaceC4351m;
            interfaceC4351m2 = new InterfaceC4351m() { // from class: com.whoop.profile.presentation.edit.d
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    switch (i2111110) {
                        case 0:
                            int iIntValue = ((Integer) obj2).intValue();
                            return HeightWeightContentKt.HeightWeightContent$lambda$0(bottomSheetType10, viewState, interfaceC4351m10, str7, str9, str8, i13, i14, (Composer) obj, iIntValue);
                        default:
                            int iIntValue2 = ((Integer) obj2).intValue();
                            return HeightWeightContentKt.HeightWeightContent$lambda$12(bottomSheetType10, viewState, interfaceC4351m10, str7, str9, str8, i13, i14, (Composer) obj, iIntValue2);
                    }
                }
            };
            c28677v1M87180u.f115982d = interfaceC4351m2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 HeightWeightContent$lambda$0(EditProfileViewState.BottomSheetType bottomSheetType, EditProfileViewState editProfileViewState, InterfaceC4351m interfaceC4351m, String str, String str2, String str3, int i13, int i14, Composer composer, int i15) {
        HeightWeightContent(bottomSheetType, editProfileViewState, interfaceC4351m, str, str2, str3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 HeightWeightContent$lambda$10$0(InterfaceC4351m interfaceC4351m, InterfaceC28690z0 interfaceC28690z0, float f13) {
        HeightWeightContent$lambda$6(interfaceC28690z0, f13);
        interfaceC4351m.invoke(EditProfileEvent.FieldType.HEIGHT, String.valueOf(f13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 HeightWeightContent$lambda$11$0(InterfaceC4351m interfaceC4351m, InterfaceC28690z0 interfaceC28690z0, float f13) {
        HeightWeightContent$lambda$9(interfaceC28690z0, f13);
        interfaceC4351m.invoke(EditProfileEvent.FieldType.WEIGHT, String.valueOf(f13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 HeightWeightContent$lambda$12(EditProfileViewState.BottomSheetType bottomSheetType, EditProfileViewState editProfileViewState, InterfaceC4351m interfaceC4351m, String str, String str2, String str3, int i13, int i14, Composer composer, int i15) {
        HeightWeightContent(bottomSheetType, editProfileViewState, interfaceC4351m, str, str2, str3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    private static final UnitSystem HeightWeightContent$lambda$3(InterfaceC28601c1 interfaceC28601c1) {
        return (UnitSystem) interfaceC28601c1.getValue();
    }

    private static final float HeightWeightContent$lambda$5(InterfaceC28690z0 interfaceC28690z0) {
        return ((C28617g1) interfaceC28690z0).m87022x();
    }

    private static final void HeightWeightContent$lambda$6(InterfaceC28690z0 interfaceC28690z0, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
    }

    private static final float HeightWeightContent$lambda$8(InterfaceC28690z0 interfaceC28690z0) {
        return ((C28617g1) interfaceC28690z0).m87022x();
    }

    private static final void HeightWeightContent$lambda$9(InterfaceC28690z0 interfaceC28690z0, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
    }

    public static final void WeightSelector(float f13, boolean z4, EditProfileViewState.ValidationRanges validationRanges, Function1 onValueSelected, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(validationRanges, "validationRanges");
        AbstractC22676k.m65750j(onValueSelected, "onValueSelected");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1513824134);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87147d(f13) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(validationRanges) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onValueSelected) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            int iM30924m = C11503a.f37005a.m30924m(f13);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            C32196d c32196d = new C32196d(z4 ? UnitSystem.IMPERIAL : UnitSystem.METRIC, iM30924m, new C18284j(validationRanges.getWeightPoundsMin(), validationRanges.getWeightPoundsMax(), 1), new C18284j(validationRanges.getWeightKilogramsMin(), validationRanges.getWeightKilogramsMax(), 1), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62247I1), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62273Q0));
            boolean z13 = (i14 & 7168) == 2048;
            Object objM87133R = c28655q.m87133R();
            if (z13 || objM87133R == C28635l.f115821a) {
                objM87133R = new C0468a(onValueSelected, 22);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC32195c.m100133d(c32196d, (Function1) objM87133R, AbstractC1102d.m3409f(1.0f, c2314t), 10 * 4, C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getB1(), false, c28655q, 200064 | C32196d.f133326g | (C2886a.f11498d << 12), 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9724c(f13, z4, validationRanges, onValueSelected, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 WeightSelector$lambda$0$0$0(Function1 function1, int i13) {
        function1.invoke(Float.valueOf(C11503a.f37005a.m30928q(i13)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 WeightSelector$lambda$1(float f13, boolean z4, EditProfileViewState.ValidationRanges validationRanges, Function1 function1, int i13, Composer composer, int i14) {
        WeightSelector(f13, z4, validationRanges, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
