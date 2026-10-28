package com.whoop.profile.view.edit;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.core.app.FrameMetricsAggregator;
import androidx.profileinstaller.ProfileVerifier;
import bm2.C3440f1;
import bm2.C3446h1;
import bs1.C3602u;
import bz0.C3713c;
import c13.AbstractC3855a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.local.room.dao.persistent.C6498i;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.models.modal.C8527a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.C9691R;
import com.whoop.profile.presentation.edit.EditProfileEvent;
import com.whoop.profile.presentation.edit.EditProfileViewState;
import com.whoop.profile.view.C9813i;
import com.whoop.profile.view.edit.form.EditProfileFormState;
import com.whoop.profile.view.edit.form.FieldState;
import dp0.C12253i;
import fy1.C14873i;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import m83.C25235a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import or2.C28161f1;
import p000.AbstractC11266d;
import p003a1.C0111j;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p164g2.C15240l;
import p164g2.InterfaceC15237i;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p555vl.AbstractC36095b;
import p602x1.AbstractC37817c;
import p699b70.C2777c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import q83.AbstractC30060g;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u009d\u0001\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u00062\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u00062\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a¹\u0001\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u00062\u001a\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\b0\f2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u00062\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u000f\u0010\u001a\u001a\u00020\bH\u0001¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileViewState;", "viewState", "Lcom/whoop/profile/view/edit/form/EditProfileFormState;", "formState", "Ltr2/n;", "logger", "Lkotlin/Function1;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;", "Ll83/a0;", "onEvent", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$NavigationEvent;", "onNavigationEvent", "Lkotlin/Function2;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;", "", "onFieldUpdate", "onFieldValidation", "Lkotlin/Function0;", "onUsernameFieldFocused", "onOpenBirthdayPicker", "EditProfileContent", "(Lcom/whoop/profile/presentation/edit/EditProfileViewState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Ltr2/n;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;", "onOpenBottomSheet", "EditProfileMainContent", "(Lcom/whoop/profile/presentation/edit/EditProfileViewState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Ltr2/n;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "EditProfileContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "profile_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EditProfileContentKt {
    /* JADX WARN: Code duplicated, block: B:100:0x0160  */
    /* JADX WARN: Code duplicated, block: B:104:0x016a  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00da  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:78:0x0108  */
    /* JADX WARN: Code duplicated, block: B:79:0x010b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0115  */
    /* JADX WARN: Code duplicated, block: B:84:0x0119  */
    /* JADX WARN: Code duplicated, block: B:86:0x011f  */
    /* JADX WARN: Code duplicated, block: B:88:0x012d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0130  */
    /* JADX WARN: Code duplicated, block: B:92:0x0136  */
    /* JADX WARN: Code duplicated, block: B:94:0x0144  */
    /* JADX WARN: Code duplicated, block: B:97:0x0153  */
    public static final void EditProfileContent(EditProfileViewState viewState, EditProfileFormState formState, InterfaceC34116n logger, Function1 onEvent, Function1 onNavigationEvent, InterfaceC4351m onFieldUpdate, Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC4339a onOpenBirthdayPicker, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        int i16;
        int i17;
        InterfaceC4339a interfaceC4339a2;
        int i18;
        boolean z4;
        C28655q c28655q;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function3;
        InterfaceC4339a interfaceC4339a4;
        Object objM87133R;
        boolean z13;
        Object objM87133R2;
        Object objM87133R3;
        Object objM87133R4;
        int i19;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(formState, "formState");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(onFieldUpdate, "onFieldUpdate");
        AbstractC22676k.m65750j(onOpenBirthdayPicker, "onOpenBirthdayPicker");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1748562424);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q2.m87153g(formState) : c28655q2.m87157i(formState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(logger) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87157i(onEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q2.m87157i(onNavigationEvent) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q2.m87157i(onFieldUpdate) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        int i24 = i14 & 64;
        if (i24 == 0) {
            if ((i13 & 1572864) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 1048576 : 524288;
            }
            i16 = i14 & 128;
            if (i16 != 0) {
                i15 |= 12582912;
                i17 = 1572864;
                interfaceC4339a2 = interfaceC4339a;
            } else {
                i17 = 1572864;
                interfaceC4339a2 = interfaceC4339a;
                if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a2)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i15 |= i18;
                }
            }
            if ((i13 & 100663296) == 0) {
                if (c28655q2.m87157i(onOpenBirthdayPicker)) {
                    i19 = 67108864;
                } else {
                    i19 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i19;
            }
            if ((i15 & 38347923) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C6498i(25);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function3 = (Function1) objM87133R4;
                } else {
                    function3 = function2;
                }
                if (i16 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C8527a(13);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                InterfaceC15237i interfaceC15237i = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q2);
                }
                InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
                z13 = (458752 & i15) == 131072;
                objM87133R2 = c28655q2.m87133R();
                if (z13 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C9788l(0, onFieldUpdate);
                    c28655q2.m87172p0(objM87133R2);
                }
                InterfaceC4351m interfaceC4351m = (InterfaceC4351m) objM87133R2;
                int i25 = i15;
                C3602u c3602u = new C3602u(interfaceC21083i, interfaceC15237i, viewState, onEvent, onNavigationEvent, formState, logger, onFieldUpdate, function3, interfaceC4339a4, onOpenBirthdayPicker);
                InterfaceC4339a interfaceC4339a5 = interfaceC4339a4;
                function2 = function3;
                c28655q = c28655q2;
                EditProfileBottomSheetKt.EditProfileBottomSheet(viewState, formState, interfaceC4351m, onEvent, null, null, AbstractC37817c.m121344e(-949378836, c28655q2, c3602u), c28655q, (i25 & 14) | i17 | (TextResource.$stable << 3) | (i25 & 112) | (i25 & 7168), 48);
                interfaceC4339a3 = interfaceC4339a5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3446h1(viewState, formState, logger, onEvent, onNavigationEvent, onFieldUpdate, function2, interfaceC4339a3, onOpenBirthdayPicker, i13, i14, 1);
            }
        }
        i15 |= 1572864;
        function2 = function1;
        i16 = i14 & 128;
        if (i16 != 0) {
            i15 |= 12582912;
            i17 = 1572864;
            interfaceC4339a2 = interfaceC4339a;
        } else {
            i17 = 1572864;
            interfaceC4339a2 = interfaceC4339a;
            if ((i13 & 12582912) == 0) {
                if (c28655q2.m87157i(interfaceC4339a2)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i15 |= i18;
            }
        }
        if ((i13 & 100663296) == 0) {
            if (c28655q2.m87157i(onOpenBirthdayPicker)) {
                i19 = 67108864;
            } else {
                i19 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i15 |= i19;
        }
        if ((i15 & 38347923) != 38347922) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C6498i(25);
                    c28655q2.m87172p0(objM87133R4);
                }
                function3 = (Function1) objM87133R4;
            } else {
                function3 = function2;
            }
            if (i16 != 0) {
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C8527a(13);
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            InterfaceC15237i interfaceC15237i2 = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
            objM87133R = c28655q2.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q2);
            }
            InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R;
            if ((458752 & i15) == 131072) {
            }
            objM87133R2 = c28655q2.m87133R();
            if (z13) {
                objM87133R2 = new C9788l(0, onFieldUpdate);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C9788l(0, onFieldUpdate);
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC4351m interfaceC4351m2 = (InterfaceC4351m) objM87133R2;
            int i26 = i15;
            C3602u c3602u2 = new C3602u(interfaceC21083i2, interfaceC15237i2, viewState, onEvent, onNavigationEvent, formState, logger, onFieldUpdate, function3, interfaceC4339a4, onOpenBirthdayPicker);
            InterfaceC4339a interfaceC4339a6 = interfaceC4339a4;
            function2 = function3;
            c28655q = c28655q2;
            EditProfileBottomSheetKt.EditProfileBottomSheet(viewState, formState, interfaceC4351m2, onEvent, null, null, AbstractC37817c.m121344e(-949378836, c28655q2, c3602u2), c28655q, (i26 & 14) | i17 | (TextResource.$stable << 3) | (i26 & 112) | (i26 & 7168), 48);
            interfaceC4339a3 = interfaceC4339a6;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3446h1(viewState, formState, logger, onEvent, onNavigationEvent, onFieldUpdate, function2, interfaceC4339a3, onOpenBirthdayPicker, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileContent$lambda$0$0(EditProfileEvent.FieldType it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileContent$lambda$3$0(InterfaceC4351m interfaceC4351m, EditProfileEvent.FieldType fieldType, String value) {
        AbstractC22676k.m65750j(fieldType, "fieldType");
        AbstractC22676k.m65750j(value, "value");
        interfaceC4351m.invoke(fieldType, value);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileContent$lambda$4(InterfaceC21083i interfaceC21083i, InterfaceC15237i interfaceC15237i, EditProfileViewState editProfileViewState, Function1 function1, Function1 function2, EditProfileFormState editProfileFormState, InterfaceC34116n interfaceC34116n, InterfaceC4351m interfaceC4351m, Function1 function3, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4351m onOpenBottomSheet, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(onOpenBottomSheet, "onOpenBottomSheet");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87157i(onOpenBottomSheet) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Modifier modifierM114675c = AbstractC36095b.m114675c(C2314t.f9131w, 1.0f);
            boolean zM87157i = c28655q.m87157i(interfaceC15237i);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C0111j(interfaceC15237i, 19);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3360e = AbstractC1092a.m3360e(modifierM114675c, interfaceC21083i, null, false, null, (InterfaceC4339a) objM87133R, 28);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3360e);
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
            if (editProfileViewState.getFullScreenModal() != null) {
                c28655q.m87150e0(1257048692);
                EditProfileViewState.FullScreenModal fullScreenModal = editProfileViewState.getFullScreenModal();
                boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87153g(function2);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87153g || objM87133R2 == c28676v0) {
                    objM87133R2 = new C2777c(function1, 2, function2);
                    c28655q.m87172p0(objM87133R2);
                }
                EditProfileFullScreenModalKt.EditProfileFullScreenModal(fullScreenModal, (Function1) objM87133R2, c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1257550086);
                boolean zM87153g2 = c28655q.m87153g(interfaceC4351m);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87153g2 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C9788l(1, interfaceC4351m);
                    c28655q.m87172p0(objM87133R3);
                }
                EditProfileMainContent(editProfileViewState, editProfileFormState, interfaceC34116n, function1, function2, onOpenBottomSheet, (InterfaceC4351m) objM87133R3, function3, interfaceC4339a, interfaceC4339a2, c28655q, (TextResource.$stable << 3) | ((i14 << 15) & 458752), 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileContent$lambda$4$0$0(InterfaceC15237i interfaceC15237i) {
        ((C15240l) interfaceC15237i).m43339b(false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileContent$lambda$4$1$0$0(Function1 function1, Function1 function2, EditProfileEvent event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof EditProfileEvent.ViewEvent) {
            function1.invoke(event);
        } else {
            if (!(event instanceof EditProfileEvent.NavigationEvent)) {
                throw new NoWhenBranchMatchedException();
            }
            function2.invoke(event);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileContent$lambda$4$1$1$0(InterfaceC4351m interfaceC4351m, EditProfileEvent.FieldType fieldType, String value) {
        AbstractC22676k.m65750j(fieldType, "fieldType");
        AbstractC22676k.m65750j(value, "value");
        interfaceC4351m.invoke(fieldType, value);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileContent$lambda$5(EditProfileViewState editProfileViewState, EditProfileFormState editProfileFormState, InterfaceC34116n interfaceC34116n, Function1 function1, Function1 function2, InterfaceC4351m interfaceC4351m, Function1 function3, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, int i14, Composer composer, int i15) {
        EditProfileContent(editProfileViewState, editProfileFormState, interfaceC34116n, function1, function2, interfaceC4351m, function3, interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    public static final void EditProfileContentPreview(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1525906420);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new InterfaceC4351m() { // from class: com.whoop.profile.view.edit.EditProfileContentKt$EditProfileContentPreview$$inlined$WhoopPreviewTheme$1
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
                    c28655q2.m87150e0(-527396373);
                    EditProfileViewState editProfileViewState = new EditProfileViewState(null, null, null, null, null, null, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null);
                    EditProfileFormState editProfileFormState = new EditProfileFormState(new FieldState("", null, false, false, false, false, 62, null), new FieldState("", null, false, false, false, false, 62, null), new FieldState("", null, false, false, false, false, 62, null), new FieldState("", null, false, false, false, false, 62, null), new FieldState("", null, false, false, false, false, 62, null), new FieldState("", null, false, false, false, false, 62, null), new FieldState("", null, false, false, false, false, 62, null), new FieldState("", null, false, false, false, false, 62, null), new FieldState("", null, false, false, false, false, 62, null), new FieldState("", null, false, false, false, false, 62, null), new FieldState("", null, false, false, false, false, 62, null), new FieldState("", null, false, false, false, false, 62, null), new FieldState("", null, false, false, false, false, 62, null));
                    C28161f1 c28161f1 = C28161f1.f113863b;
                    Object objM87133R = c28655q2.m87133R();
                    C28676v0 c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = new Function1() { // from class: com.whoop.profile.view.edit.EditProfileContentKt$EditProfileContentPreview$1$1$1
                            public final void invoke(EditProfileEvent.ViewEvent it) {
                                AbstractC22676k.m65750j(it, "it");
                            }

                            @Override // p715kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((EditProfileEvent.ViewEvent) obj);
                                return C23454a0.f92919a;
                            }
                        };
                        c28655q2.m87172p0(objM87133R);
                    }
                    Function1 function1 = (Function1) objM87133R;
                    Object objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new Function1() { // from class: com.whoop.profile.view.edit.EditProfileContentKt$EditProfileContentPreview$1$2$1
                            public final void invoke(EditProfileEvent.NavigationEvent it) {
                                AbstractC22676k.m65750j(it, "it");
                            }

                            @Override // p715kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((EditProfileEvent.NavigationEvent) obj);
                                return C23454a0.f92919a;
                            }
                        };
                        c28655q2.m87172p0(objM87133R2);
                    }
                    Function1 function2 = (Function1) objM87133R2;
                    Object objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new InterfaceC4351m() { // from class: com.whoop.profile.view.edit.EditProfileContentKt$EditProfileContentPreview$1$3$1
                            public final void invoke(EditProfileEvent.FieldType fieldType, String str) {
                                AbstractC22676k.m65750j(fieldType, "<unused var>");
                                AbstractC22676k.m65750j(str, "<unused var>");
                            }

                            @Override // c93.InterfaceC4351m
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((EditProfileEvent.FieldType) obj, (String) obj2);
                                return C23454a0.f92919a;
                            }
                        };
                        c28655q2.m87172p0(objM87133R3);
                    }
                    InterfaceC4351m interfaceC4351m = (InterfaceC4351m) objM87133R3;
                    Object objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new Function1() { // from class: com.whoop.profile.view.edit.EditProfileContentKt$EditProfileContentPreview$1$4$1
                            public final void invoke(EditProfileEvent.FieldType fieldType) {
                                AbstractC22676k.m65750j(fieldType, "<unused var>");
                            }

                            @Override // p715kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((EditProfileEvent.FieldType) obj);
                                return C23454a0.f92919a;
                            }
                        };
                        c28655q2.m87172p0(objM87133R4);
                    }
                    Function1 function3 = (Function1) objM87133R4;
                    Object objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new InterfaceC4339a() { // from class: com.whoop.profile.view.edit.EditProfileContentKt$EditProfileContentPreview$1$5$1
                            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                            public final void m134176invoke() {
                            }

                            @Override // c93.InterfaceC4339a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m134176invoke();
                                return C23454a0.f92919a;
                            }
                        };
                        c28655q2.m87172p0(objM87133R5);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R5;
                    Object objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new InterfaceC4339a() { // from class: com.whoop.profile.view.edit.EditProfileContentKt$EditProfileContentPreview$1$6$1
                            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                            public final void m134177invoke() {
                            }

                            @Override // c93.InterfaceC4339a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m134177invoke();
                                return C23454a0.f92919a;
                            }
                        };
                        c28655q2.m87172p0(objM87133R6);
                    }
                    EditProfileContentKt.EditProfileContent(editProfileViewState, editProfileFormState, c28161f1, function1, function2, interfaceC4351m, function3, interfaceC4339a, (InterfaceC4339a) objM87133R6, c28655q2, (TextResource.$stable << 3) | 115043328, 0);
                    c28655q2.m87173q(false);
                }
            }), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3713c(i13, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileContentPreview$lambda$1(int i13, Composer composer, int i14) {
        EditProfileContentPreview(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0128  */
    /* JADX WARN: Code duplicated, block: B:102:0x012e  */
    /* JADX WARN: Code duplicated, block: B:104:0x013d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0198  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:113:0x0203  */
    /* JADX WARN: Code duplicated, block: B:116:0x020f  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:89:0x0101  */
    /* JADX WARN: Code duplicated, block: B:92:0x010b  */
    /* JADX WARN: Code duplicated, block: B:94:0x010f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0115  */
    /* JADX WARN: Code duplicated, block: B:98:0x0124  */
    private static final void EditProfileMainContent(EditProfileViewState editProfileViewState, EditProfileFormState editProfileFormState, InterfaceC34116n interfaceC34116n, Function1 function1, Function1 function2, InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2, Function1 function3, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Composer composer, int i13, int i14) {
        int i15;
        Function1 function4;
        int i16;
        InterfaceC4339a interfaceC4339a3;
        int i17;
        int i18;
        boolean z4;
        Function1 function5;
        C28655q c28655q;
        InterfaceC4339a interfaceC4339a4;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function6;
        InterfaceC4339a interfaceC4339a5;
        boolean z13;
        Object objM87133R;
        Object objM87133R2;
        Object objM87133R3;
        int i19;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-2006188817);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(editProfileViewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q2.m87153g(editProfileFormState) : c28655q2.m87157i(editProfileFormState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(interfaceC34116n) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87157i(function1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q2.m87157i(function2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q2.m87157i(interfaceC4351m) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i15 |= c28655q2.m87157i(interfaceC4351m2) ? 1048576 : 524288;
        }
        int i24 = i14 & 128;
        if (i24 == 0) {
            if ((12582912 & i13) == 0) {
                function4 = function3;
                i15 |= c28655q2.m87157i(function4) ? 8388608 : 4194304;
            }
            i16 = i14 & 256;
            if (i16 != 0) {
                i15 |= 100663296;
                interfaceC4339a3 = interfaceC4339a;
            } else {
                interfaceC4339a3 = interfaceC4339a;
                if ((i13 & 100663296) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a3)) {
                        i17 = 67108864;
                    } else {
                        i17 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i17;
                }
            }
            if ((i13 & 805306368) == 0) {
                if (c28655q2.m87157i(interfaceC4339a2)) {
                    i19 = 536870912;
                } else {
                    i19 = 268435456;
                }
                i15 |= i19;
            }
            i18 = i15;
            if ((i18 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i18 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C6498i(24);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function6 = (Function1) objM87133R3;
                } else {
                    function6 = function4;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C8527a(12);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a5 = interfaceC4339a3;
                }
                AbstractC6721d.a aVar = new AbstractC6721d.a(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, C9691R.string.profile_edit_profile_title)), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                float f13 = 8;
                Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 2 * f13, 0.0f, 1 * f13, 5);
                z13 = (i18 & 57344) == 16384;
                objM87133R = c28655q2.m87133R();
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new C9813i(function2, 1);
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC6719b.m20143d(modifierM3398t, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                int i25 = i18 << 3;
                c28655q = c28655q2;
                Function1 function7 = function6;
                InterfaceC4339a interfaceC4339a6 = interfaceC4339a5;
                EditProfileFieldsContentKt.EditProfileFieldsContent(null, editProfileViewState, editProfileFormState, interfaceC34116n, function1, interfaceC4351m, interfaceC4351m2, function7, interfaceC4339a6, interfaceC4339a2, c28655q, (i25 & 57344) | (i25 & 112) | (TextResource.$stable << 6) | (i25 & 896) | (i25 & 7168) | (i18 & 458752) | (i18 & 3670016) | (i18 & 29360128) | (i18 & 234881024) | (i18 & 1879048192), 1);
                interfaceC4339a4 = interfaceC4339a6;
                function5 = function7;
            } else {
                c28655q2.m87138X();
                function5 = function4;
                c28655q = c28655q2;
                interfaceC4339a4 = interfaceC4339a3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3440f1(editProfileViewState, editProfileFormState, interfaceC34116n, function1, function2, interfaceC4351m, interfaceC4351m2, function5, interfaceC4339a4, interfaceC4339a2, i13, i14, 1);
            }
        }
        i15 |= 12582912;
        function4 = function3;
        i16 = i14 & 256;
        if (i16 != 0) {
            i15 |= 100663296;
            interfaceC4339a3 = interfaceC4339a;
        } else {
            interfaceC4339a3 = interfaceC4339a;
            if ((i13 & 100663296) == 0) {
                if (c28655q2.m87157i(interfaceC4339a3)) {
                    i17 = 67108864;
                } else {
                    i17 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i17;
            }
        }
        if ((i13 & 805306368) == 0) {
            if (c28655q2.m87157i(interfaceC4339a2)) {
                i19 = 536870912;
            } else {
                i19 = 268435456;
            }
            i15 |= i19;
        }
        i18 = i15;
        if ((i18 & 306783379) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i18 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C6498i(24);
                    c28655q2.m87172p0(objM87133R3);
                }
                function6 = (Function1) objM87133R3;
            } else {
                function6 = function4;
            }
            if (i16 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C8527a(12);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a5 = interfaceC4339a3;
            }
            AbstractC6721d.a aVar2 = new AbstractC6721d.a(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, C9691R.string.profile_edit_profile_title)), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
            float f14 = 8;
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 2 * f14, 0.0f, 1 * f14, 5);
            if ((i18 & 57344) == 16384) {
            }
            objM87133R = c28655q2.m87133R();
            if (z13) {
                objM87133R = new C9813i(function2, 1);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C9813i(function2, 1);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(modifierM3398t2, aVar2, null, (InterfaceC4339a) objM87133R, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            int i26 = i18 << 3;
            c28655q = c28655q2;
            Function1 function8 = function6;
            InterfaceC4339a interfaceC4339a7 = interfaceC4339a5;
            EditProfileFieldsContentKt.EditProfileFieldsContent(null, editProfileViewState, editProfileFormState, interfaceC34116n, function1, interfaceC4351m, interfaceC4351m2, function8, interfaceC4339a7, interfaceC4339a2, c28655q, (i26 & 57344) | (i26 & 112) | (TextResource.$stable << 6) | (i26 & 896) | (i26 & 7168) | (i18 & 458752) | (i18 & 3670016) | (i18 & 29360128) | (i18 & 234881024) | (i18 & 1879048192), 1);
            interfaceC4339a4 = interfaceC4339a7;
            function5 = function8;
        } else {
            c28655q2.m87138X();
            function5 = function4;
            c28655q = c28655q2;
            interfaceC4339a4 = interfaceC4339a3;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3440f1(editProfileViewState, editProfileFormState, interfaceC34116n, function1, function2, interfaceC4351m, interfaceC4351m2, function5, interfaceC4339a4, interfaceC4339a2, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileMainContent$lambda$0$0(EditProfileEvent.FieldType it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileMainContent$lambda$2$0(Function1 function1) {
        function1.invoke(EditProfileEvent.GoBack.INSTANCE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileMainContent$lambda$3(EditProfileViewState editProfileViewState, EditProfileFormState editProfileFormState, InterfaceC34116n interfaceC34116n, Function1 function1, Function1 function2, InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2, Function1 function3, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, int i14, Composer composer, int i15) {
        EditProfileMainContent(editProfileViewState, editProfileFormState, interfaceC34116n, function1, function2, interfaceC4351m, interfaceC4351m2, function3, interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
