package com.whoop.profile.view.edit.avatar;

import a81.C0561l;
import am2.C1012d;
import am2.C1040r;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import androidx.activity.result.contract.ActivityResultContracts$GetContent;
import androidx.activity.result.contract.ActivityResultContracts$RequestPermission;
import androidx.activity.result.contract.ActivityResultContracts$TakePicture;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.core.content.FileProvider;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2646w1;
import c93.InterfaceC4339a;
import com.whoop.data.local.room.dao.persistent.C6498i;
import com.whoop.profile.presentation.edit.EditProfileEvent;
import com.whoop.profile.presentation.edit.EditProfileViewState;
import com.whoop.profile.view.C9813i;
import java.io.File;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p179h.C16351i;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u008b\u0001\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00062\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\b0\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0015²\u0006\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00048\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00138\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;", "avatarState", "", "isInCropMode", "Landroid/net/Uri;", "selectedImageUri", "Lkotlin/Function1;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;", "Ll83/a0;", "onEvent", "onCropModeChanged", "onImageSelected", "Landroid/graphics/Rect;", "onCropBoundsChanged", "Lkotlin/Function0;", "onDismiss", "AvatarEditBottomSheetContent", "(Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;ZLandroid/net/Uri;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "tempImageUri", "", "pendingAction", "profile_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AvatarEditBottomSheetContentKt {
    /* JADX WARN: Code duplicated, block: B:100:0x0171  */
    /* JADX WARN: Code duplicated, block: B:101:0x0174  */
    /* JADX WARN: Code duplicated, block: B:105:0x017e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0194  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:124:0x021d  */
    /* JADX WARN: Code duplicated, block: B:128:0x024d  */
    /* JADX WARN: Code duplicated, block: B:133:0x027e  */
    /* JADX WARN: Code duplicated, block: B:135:0x028a  */
    /* JADX WARN: Code duplicated, block: B:139:0x0293  */
    /* JADX WARN: Code duplicated, block: B:142:0x029d  */
    /* JADX WARN: Code duplicated, block: B:144:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:158:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:161:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00db  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:78:0x0101  */
    /* JADX WARN: Code duplicated, block: B:81:0x0110  */
    /* JADX WARN: Code duplicated, block: B:84:0x0136  */
    /* JADX WARN: Code duplicated, block: B:85:0x0139  */
    /* JADX WARN: Code duplicated, block: B:88:0x0142  */
    /* JADX WARN: Code duplicated, block: B:89:0x0145  */
    /* JADX WARN: Code duplicated, block: B:93:0x014f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0168  */
    /* JADX WARN: Code duplicated, block: B:98:0x016d  */
    public static final void AvatarEditBottomSheetContent(EditProfileViewState.AvatarViewState avatarState, boolean z4, Uri uri, Function1 onEvent, final Function1 onCropModeChanged, final Function1 onImageSelected, Function1 function1, InterfaceC4339a onDismiss, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        Function1 function2;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function3;
        Context context;
        Object objM87133R;
        InterfaceC4339a interfaceC4339a;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        File file;
        int i16;
        boolean z14;
        int i17;
        boolean z15;
        boolean z16;
        Object objM87133R3;
        C16351i c16351iM118972a0;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objM87133R4;
        final C16351i c16351iM118972a1;
        Object objM87133R5;
        final InterfaceC28601c1 interfaceC28601c2;
        boolean zM87157i;
        Object objM87133R6;
        InterfaceC28601c1 interfaceC28601c3;
        C16351i c16351iM118972a2;
        boolean zM87157i2;
        Object objM87133R7;
        C16351i c16351iM118972a3;
        boolean zM87157i3;
        Object objM87133R8;
        InterfaceC28601c1 interfaceC28601c4;
        InterfaceC4339a interfaceC4339a2;
        boolean zM87157i4;
        Object objM87133R9;
        InterfaceC4339a interfaceC4339a3;
        String currentAvatarUrl;
        boolean z24;
        String currentAvatarUrl2;
        boolean z25;
        Object objM87133R10;
        int i18;
        AbstractC22676k.m65750j(avatarState, "avatarState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        AbstractC22676k.m65750j(onCropModeChanged, "onCropModeChanged");
        AbstractC22676k.m65750j(onImageSelected, "onImageSelected");
        AbstractC22676k.m65750j(onDismiss, "onDismiss");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(626438840);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(avatarState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(uri) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(onEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87157i(onCropModeChanged) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q.m87157i(onImageSelected) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        int i19 = i14 & 64;
        if (i19 == 0) {
            if ((1572864 & i13) == 0) {
                i15 |= c28655q.m87157i(function1) ? 1048576 : 524288;
            }
            if ((12582912 & i13) == 0) {
                if (c28655q.m87157i(onDismiss)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i15 |= i18;
            }
            if ((4793491 & i15) != 4793490) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R10 = c28655q.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C6498i(27);
                        c28655q.m87172p0(objM87133R10);
                    }
                    function3 = (Function1) objM87133R10;
                } else {
                    function3 = function1;
                }
                context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                objM87133R = c28655q.m87133R();
                interfaceC4339a = null;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(null);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new File(context.getCacheDir(), AbstractC31061c.m95636l(System.currentTimeMillis(), "temp_avatar_", ".jpg"));
                    c28655q.m87172p0(objM87133R2);
                }
                file = (File) objM87133R2;
                ActivityResultContracts$TakePicture activityResultContracts$TakePicture = new ActivityResultContracts$TakePicture();
                i16 = 458752 & i15;
                if (i16 == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                i17 = 57344 & i15;
                if (i17 == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z14 | z15;
                objM87133R3 = c28655q.m87133R();
                if (z16 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C9768a(onImageSelected, onCropModeChanged, interfaceC28601c1, 0);
                    c28655q.m87172p0(objM87133R3);
                }
                c16351iM118972a0 = AbstractC37056f.m118972a0(activityResultContracts$TakePicture, (Function1) objM87133R3, c28655q, 0);
                ActivityResultContracts$GetContent activityResultContracts$GetContent = new ActivityResultContracts$GetContent();
                if (i16 == 131072) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (i17 == 16384) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z17 | z18;
                objM87133R4 = c28655q.m87133R();
                if (z19 || objM87133R4 == c28676v0) {
                    final int i24 = 0;
                    objM87133R4 = new Function1() { // from class: com.whoop.profile.view.edit.avatar.b
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i24) {
                                case 0:
                                    return AvatarEditBottomSheetContentKt.AvatarEditBottomSheetContent$lambda$6$0((Function1) onImageSelected, (Function1) onCropModeChanged, (Uri) obj);
                                default:
                                    return AvatarEditBottomSheetContentKt.AvatarEditBottomSheetContent$lambda$11$0((C16351i) onImageSelected, (InterfaceC28601c1) onCropModeChanged, ((Boolean) obj).booleanValue());
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R4);
                }
                c16351iM118972a1 = AbstractC37056f.m118972a0(activityResultContracts$GetContent, (Function1) objM87133R4, c28655q, 0);
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(null);
                    c28655q.m87172p0(objM87133R5);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R5;
                ActivityResultContracts$RequestPermission activityResultContracts$RequestPermission = new ActivityResultContracts$RequestPermission();
                zM87157i = c28655q.m87157i(context) | c28655q.m87157i(file) | c28655q.m87157i(c16351iM118972a0);
                objM87133R6 = c28655q.m87133R();
                if (!zM87157i || objM87133R6 == c28676v0) {
                    interfaceC28601c3 = interfaceC28601c1;
                    objM87133R6 = new C1040r((Object) context, (Object) file, (Object) c16351iM118972a0, interfaceC28601c2, interfaceC28601c3, 5);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    interfaceC28601c3 = interfaceC28601c1;
                }
                c16351iM118972a2 = AbstractC37056f.m118972a0(activityResultContracts$RequestPermission, (Function1) objM87133R6, c28655q, 0);
                ActivityResultContracts$RequestPermission activityResultContracts$RequestPermission2 = new ActivityResultContracts$RequestPermission();
                zM87157i2 = c28655q.m87157i(c16351iM118972a1);
                objM87133R7 = c28655q.m87133R();
                if (zM87157i2 || objM87133R7 == c28676v0) {
                    final int i25 = 1;
                    objM87133R7 = new Function1() { // from class: com.whoop.profile.view.edit.avatar.b
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i25) {
                                case 0:
                                    return AvatarEditBottomSheetContentKt.AvatarEditBottomSheetContent$lambda$6$0((Function1) c16351iM118972a1, (Function1) interfaceC28601c2, (Uri) obj);
                                default:
                                    return AvatarEditBottomSheetContentKt.AvatarEditBottomSheetContent$lambda$11$0((C16351i) c16351iM118972a1, (InterfaceC28601c1) interfaceC28601c2, ((Boolean) obj).booleanValue());
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R7);
                }
                c16351iM118972a3 = AbstractC37056f.m118972a0(activityResultContracts$RequestPermission2, (Function1) objM87133R7, c28655q, 0);
                zM87157i3 = c28655q.m87157i(context) | c28655q.m87157i(file) | c28655q.m87157i(c16351iM118972a0) | c28655q.m87157i(c16351iM118972a2);
                objM87133R8 = c28655q.m87133R();
                if (!zM87157i3 || objM87133R8 == c28676v0) {
                    objM87133R8 = new C0561l(context, file, c16351iM118972a0, c16351iM118972a2, interfaceC28601c3, interfaceC28601c2, 3);
                    interfaceC28601c4 = interfaceC28601c2;
                    c28655q.m87172p0(objM87133R8);
                } else {
                    interfaceC28601c4 = interfaceC28601c2;
                }
                interfaceC4339a2 = (InterfaceC4339a) objM87133R8;
                zM87157i4 = c28655q.m87157i(c16351iM118972a1) | c28655q.m87157i(context) | c28655q.m87157i(c16351iM118972a3);
                objM87133R9 = c28655q.m87133R();
                if (zM87157i4 || objM87133R9 == c28676v0) {
                    objM87133R9 = new C1012d(c16351iM118972a1, context, c16351iM118972a3, interfaceC28601c4, 7);
                    c28655q.m87172p0(objM87133R9);
                }
                interfaceC4339a3 = (InterfaceC4339a) objM87133R9;
                if (z4 || uri == null) {
                    c28655q.m87150e0(610171246);
                    currentAvatarUrl = avatarState.getCurrentAvatarUrl();
                    if (currentAvatarUrl != null || currentAvatarUrl.length() == 0) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    boolean z26 = !z24;
                    currentAvatarUrl2 = avatarState.getCurrentAvatarUrl();
                    if (currentAvatarUrl2 != null || currentAvatarUrl2.length() == 0) {
                        z25 = false;
                        c28655q.m87150e0(610593342);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(610507224);
                        boolean z27 = (i15 & 7168) == 2048;
                        Object objM87133R11 = c28655q.m87133R();
                        if (z27 || objM87133R11 == c28676v0) {
                            objM87133R11 = new C9813i(onEvent, 2);
                            c28655q.m87172p0(objM87133R11);
                        }
                        interfaceC4339a = (InterfaceC4339a) objM87133R11;
                        z25 = false;
                        c28655q.m87173q(false);
                    }
                    PhotoSourceActionSheetKt.PhotoSourceActionSheet(interfaceC4339a2, interfaceC4339a3, onDismiss, z26, interfaceC4339a, c28655q, (i15 >> 15) & 896, 0);
                    c28655q.m87173q(z25);
                } else {
                    c28655q.m87150e0(609986796);
                    AvatarEditBottomSheetKt.PhotoCropDisplay(uri, function3, c28655q, ((i15 >> 6) & 14) | ((i15 >> 15) & 112), 0);
                    c28655q.m87173q(false);
                }
                function2 = function3;
            } else {
                c28655q.m87138X();
                function2 = function1;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2646w1(avatarState, z4, uri, onEvent, onCropModeChanged, onImageSelected, function2, onDismiss, i13, i14);
            }
        }
        i15 |= 1572864;
        if ((12582912 & i13) == 0) {
            if (c28655q.m87157i(onDismiss)) {
                i18 = 8388608;
            } else {
                i18 = 4194304;
            }
            i15 |= i18;
        }
        if ((4793491 & i15) != 4793490) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R10 = c28655q.m87133R();
                if (objM87133R10 == c28676v0) {
                    objM87133R10 = new C6498i(27);
                    c28655q.m87172p0(objM87133R10);
                }
                function3 = (Function1) objM87133R10;
            } else {
                function3 = function1;
            }
            context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            objM87133R = c28655q.m87133R();
            interfaceC4339a = null;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new File(context.getCacheDir(), AbstractC31061c.m95636l(System.currentTimeMillis(), "temp_avatar_", ".jpg"));
                c28655q.m87172p0(objM87133R2);
            }
            file = (File) objM87133R2;
            ActivityResultContracts$TakePicture activityResultContracts$TakePicture2 = new ActivityResultContracts$TakePicture();
            i16 = 458752 & i15;
            if (i16 == 131072) {
                z14 = true;
            } else {
                z14 = false;
            }
            i17 = 57344 & i15;
            if (i17 == 16384) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = z14 | z15;
            objM87133R3 = c28655q.m87133R();
            if (z16) {
                objM87133R3 = new C9768a(onImageSelected, onCropModeChanged, interfaceC28601c1, 0);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C9768a(onImageSelected, onCropModeChanged, interfaceC28601c1, 0);
                c28655q.m87172p0(objM87133R3);
            }
            c16351iM118972a0 = AbstractC37056f.m118972a0(activityResultContracts$TakePicture2, (Function1) objM87133R3, c28655q, 0);
            ActivityResultContracts$GetContent activityResultContracts$GetContent2 = new ActivityResultContracts$GetContent();
            if (i16 == 131072) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (i17 == 16384) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = z17 | z18;
            objM87133R4 = c28655q.m87133R();
            if (z19) {
                final int i26 = 0;
                objM87133R4 = new Function1() { // from class: com.whoop.profile.view.edit.avatar.b
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i26) {
                            case 0:
                                return AvatarEditBottomSheetContentKt.AvatarEditBottomSheetContent$lambda$6$0((Function1) onImageSelected, (Function1) onCropModeChanged, (Uri) obj);
                            default:
                                return AvatarEditBottomSheetContentKt.AvatarEditBottomSheetContent$lambda$11$0((C16351i) onImageSelected, (InterfaceC28601c1) onCropModeChanged, ((Boolean) obj).booleanValue());
                        }
                    }
                };
                c28655q.m87172p0(objM87133R4);
            } else {
                final int i27 = 0;
                objM87133R4 = new Function1() { // from class: com.whoop.profile.view.edit.avatar.b
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i27) {
                            case 0:
                                return AvatarEditBottomSheetContentKt.AvatarEditBottomSheetContent$lambda$6$0((Function1) onImageSelected, (Function1) onCropModeChanged, (Uri) obj);
                            default:
                                return AvatarEditBottomSheetContentKt.AvatarEditBottomSheetContent$lambda$11$0((C16351i) onImageSelected, (InterfaceC28601c1) onCropModeChanged, ((Boolean) obj).booleanValue());
                        }
                    }
                };
                c28655q.m87172p0(objM87133R4);
            }
            c16351iM118972a1 = AbstractC37056f.m118972a0(activityResultContracts$GetContent2, (Function1) objM87133R4, c28655q, 0);
            objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R5);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R5;
            ActivityResultContracts$RequestPermission activityResultContracts$RequestPermission3 = new ActivityResultContracts$RequestPermission();
            zM87157i = c28655q.m87157i(context) | c28655q.m87157i(file) | c28655q.m87157i(c16351iM118972a0);
            objM87133R6 = c28655q.m87133R();
            if (zM87157i) {
                interfaceC28601c3 = interfaceC28601c1;
                objM87133R6 = new C1040r((Object) context, (Object) file, (Object) c16351iM118972a0, interfaceC28601c2, interfaceC28601c3, 5);
                c28655q.m87172p0(objM87133R6);
            } else {
                interfaceC28601c3 = interfaceC28601c1;
                objM87133R6 = new C1040r((Object) context, (Object) file, (Object) c16351iM118972a0, interfaceC28601c2, interfaceC28601c3, 5);
                c28655q.m87172p0(objM87133R6);
            }
            c16351iM118972a2 = AbstractC37056f.m118972a0(activityResultContracts$RequestPermission3, (Function1) objM87133R6, c28655q, 0);
            ActivityResultContracts$RequestPermission activityResultContracts$RequestPermission4 = new ActivityResultContracts$RequestPermission();
            zM87157i2 = c28655q.m87157i(c16351iM118972a1);
            objM87133R7 = c28655q.m87133R();
            if (zM87157i2) {
                final int i28 = 1;
                objM87133R7 = new Function1() { // from class: com.whoop.profile.view.edit.avatar.b
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i28) {
                            case 0:
                                return AvatarEditBottomSheetContentKt.AvatarEditBottomSheetContent$lambda$6$0((Function1) c16351iM118972a1, (Function1) interfaceC28601c2, (Uri) obj);
                            default:
                                return AvatarEditBottomSheetContentKt.AvatarEditBottomSheetContent$lambda$11$0((C16351i) c16351iM118972a1, (InterfaceC28601c1) interfaceC28601c2, ((Boolean) obj).booleanValue());
                        }
                    }
                };
                c28655q.m87172p0(objM87133R7);
            } else {
                final int i29 = 1;
                objM87133R7 = new Function1() { // from class: com.whoop.profile.view.edit.avatar.b
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i29) {
                            case 0:
                                return AvatarEditBottomSheetContentKt.AvatarEditBottomSheetContent$lambda$6$0((Function1) c16351iM118972a1, (Function1) interfaceC28601c2, (Uri) obj);
                            default:
                                return AvatarEditBottomSheetContentKt.AvatarEditBottomSheetContent$lambda$11$0((C16351i) c16351iM118972a1, (InterfaceC28601c1) interfaceC28601c2, ((Boolean) obj).booleanValue());
                        }
                    }
                };
                c28655q.m87172p0(objM87133R7);
            }
            c16351iM118972a3 = AbstractC37056f.m118972a0(activityResultContracts$RequestPermission4, (Function1) objM87133R7, c28655q, 0);
            zM87157i3 = c28655q.m87157i(context) | c28655q.m87157i(file) | c28655q.m87157i(c16351iM118972a0) | c28655q.m87157i(c16351iM118972a2);
            objM87133R8 = c28655q.m87133R();
            if (zM87157i3) {
                objM87133R8 = new C0561l(context, file, c16351iM118972a0, c16351iM118972a2, interfaceC28601c3, interfaceC28601c2, 3);
                interfaceC28601c4 = interfaceC28601c2;
                c28655q.m87172p0(objM87133R8);
            } else {
                objM87133R8 = new C0561l(context, file, c16351iM118972a0, c16351iM118972a2, interfaceC28601c3, interfaceC28601c2, 3);
                interfaceC28601c4 = interfaceC28601c2;
                c28655q.m87172p0(objM87133R8);
            }
            interfaceC4339a2 = (InterfaceC4339a) objM87133R8;
            zM87157i4 = c28655q.m87157i(c16351iM118972a1) | c28655q.m87157i(context) | c28655q.m87157i(c16351iM118972a3);
            objM87133R9 = c28655q.m87133R();
            if (zM87157i4) {
                objM87133R9 = new C1012d(c16351iM118972a1, context, c16351iM118972a3, interfaceC28601c4, 7);
                c28655q.m87172p0(objM87133R9);
            } else {
                objM87133R9 = new C1012d(c16351iM118972a1, context, c16351iM118972a3, interfaceC28601c4, 7);
                c28655q.m87172p0(objM87133R9);
            }
            interfaceC4339a3 = (InterfaceC4339a) objM87133R9;
            if (z4) {
                c28655q.m87150e0(610171246);
                currentAvatarUrl = avatarState.getCurrentAvatarUrl();
                if (currentAvatarUrl != null) {
                    z24 = true;
                } else {
                    z24 = true;
                }
                boolean z28 = !z24;
                currentAvatarUrl2 = avatarState.getCurrentAvatarUrl();
                if (currentAvatarUrl2 != null) {
                    z25 = false;
                    c28655q.m87150e0(610593342);
                    c28655q.m87173q(false);
                } else {
                    z25 = false;
                    c28655q.m87150e0(610593342);
                    c28655q.m87173q(false);
                }
                PhotoSourceActionSheetKt.PhotoSourceActionSheet(interfaceC4339a2, interfaceC4339a3, onDismiss, z28, interfaceC4339a, c28655q, (i15 >> 15) & 896, 0);
                c28655q.m87173q(z25);
            } else {
                c28655q.m87150e0(610171246);
                currentAvatarUrl = avatarState.getCurrentAvatarUrl();
                if (currentAvatarUrl != null) {
                    z24 = true;
                } else {
                    z24 = true;
                }
                boolean z29 = !z24;
                currentAvatarUrl2 = avatarState.getCurrentAvatarUrl();
                if (currentAvatarUrl2 != null) {
                    z25 = false;
                    c28655q.m87150e0(610593342);
                    c28655q.m87173q(false);
                } else {
                    z25 = false;
                    c28655q.m87150e0(610593342);
                    c28655q.m87173q(false);
                }
                PhotoSourceActionSheetKt.PhotoSourceActionSheet(interfaceC4339a2, interfaceC4339a3, onDismiss, z29, interfaceC4339a, c28655q, (i15 >> 15) & 896, 0);
                c28655q.m87173q(z25);
            }
            function2 = function3;
        } else {
            c28655q.m87138X();
            function2 = function1;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2646w1(avatarState, z4, uri, onEvent, onCropModeChanged, onImageSelected, function2, onDismiss, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 AvatarEditBottomSheetContent$lambda$0$0(Rect rect) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 AvatarEditBottomSheetContent$lambda$10$0(Context context, File file, C16351i c16351i, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, boolean z4) {
        if (z4 && AbstractC22676k.m65745e(AvatarEditBottomSheetContent$lambda$8(interfaceC28601c1), "camera")) {
            interfaceC28601c2.setValue(FileProvider.getUriForFile(context, context.getPackageName() + ".provider", file));
            Uri uriAvatarEditBottomSheetContent$lambda$2 = AvatarEditBottomSheetContent$lambda$2(interfaceC28601c2);
            AbstractC22676k.m65747g(uriAvatarEditBottomSheetContent$lambda$2);
            c16351i.mo4052a(uriAvatarEditBottomSheetContent$lambda$2, null);
        }
        interfaceC28601c1.setValue(null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 AvatarEditBottomSheetContent$lambda$11$0(C16351i c16351i, InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        if (z4 && AbstractC22676k.m65745e(AvatarEditBottomSheetContent$lambda$8(interfaceC28601c1), "gallery")) {
            c16351i.mo4052a("image/*", null);
        }
        interfaceC28601c1.setValue(null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 AvatarEditBottomSheetContent$lambda$12$0(Context context, File file, C16351i c16351i, C16351i c16351i2, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        if (AbstractC32122c.checkSelfPermission(context, "android.permission.CAMERA") == 0) {
            interfaceC28601c1.setValue(FileProvider.getUriForFile(context, context.getPackageName() + ".provider", file));
            Uri uriAvatarEditBottomSheetContent$lambda$2 = AvatarEditBottomSheetContent$lambda$2(interfaceC28601c1);
            AbstractC22676k.m65747g(uriAvatarEditBottomSheetContent$lambda$2);
            c16351i.mo4052a(uriAvatarEditBottomSheetContent$lambda$2, null);
        } else {
            interfaceC28601c2.setValue("camera");
            c16351i2.mo4052a("android.permission.CAMERA", null);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 AvatarEditBottomSheetContent$lambda$13$0(C16351i c16351i, Context context, C16351i c16351i2, InterfaceC28601c1 interfaceC28601c1) {
        if (Build.VERSION.SDK_INT < 33 && AbstractC32122c.checkSelfPermission(context, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
            interfaceC28601c1.setValue("gallery");
            c16351i2.mo4052a("android.permission.READ_EXTERNAL_STORAGE", null);
        } else {
            c16351i.mo4052a("image/*", null);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 AvatarEditBottomSheetContent$lambda$14$0(Function1 function1) {
        function1.invoke(EditProfileEvent.DeleteAvatar.INSTANCE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 AvatarEditBottomSheetContent$lambda$15(EditProfileViewState.AvatarViewState avatarViewState, boolean z4, Uri uri, Function1 function1, Function1 function2, Function1 function3, Function1 function4, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        AvatarEditBottomSheetContent(avatarViewState, z4, uri, function1, function2, function3, function4, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    private static final Uri AvatarEditBottomSheetContent$lambda$2(InterfaceC28601c1 interfaceC28601c1) {
        return (Uri) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 AvatarEditBottomSheetContent$lambda$5$0(Function1 function1, Function1 function2, InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        if (z4 && AvatarEditBottomSheetContent$lambda$2(interfaceC28601c1) != null) {
            Uri uriAvatarEditBottomSheetContent$lambda$2 = AvatarEditBottomSheetContent$lambda$2(interfaceC28601c1);
            AbstractC22676k.m65747g(uriAvatarEditBottomSheetContent$lambda$2);
            function1.invoke(uriAvatarEditBottomSheetContent$lambda$2);
            function2.invoke(Boolean.TRUE);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 AvatarEditBottomSheetContent$lambda$6$0(Function1 function1, Function1 function2, Uri uri) {
        if (uri != null) {
            function1.invoke(uri);
            function2.invoke(Boolean.TRUE);
        }
        return C23454a0.f92919a;
    }

    private static final String AvatarEditBottomSheetContent$lambda$8(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }
}
