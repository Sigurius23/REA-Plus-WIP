package com.whoop.profile.view.edit;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import bb2.C2931g;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bm2.C3467p0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.C9691R;
import com.whoop.profile.domain.models.Gender;
import com.whoop.profile.domain.models.PhysiologicalBaseline;
import com.whoop.profile.presentation.edit.EditProfileEvent;
import com.whoop.profile.presentation.edit.EditProfileViewState;
import com.whoop.profile.view.edit.avatar.AvatarUploadUtils;
import com.whoop.profile.view.edit.form.EditProfileFormState;
import gb1.AbstractC15673b0;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import kotlin.C1990b0;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27271o0;
import ny0.AbstractC27292z;
import p000.AbstractC11266d;
import p000.C3718c;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC23013y;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import qz0.AbstractC30795n;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.C35666g;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39420x;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u008b\u0001\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2&\u0010\u0010\u001a\"\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0004\u0012\u00020\u00070\tH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001ai\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00132\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0017\u0010 \u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b \u0010!\u001a\u0017\u0010\"\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\"\u0010!¨\u00060²\u0006\u0010\u0010#\u001a\u0004\u0018\u00010\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010$\u001a\u0004\u0018\u00010\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010&\u001a\u00020%8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010(\u001a\u00020'8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010*\u001a\u00020)8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010+\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010-\u001a\u0004\u0018\u00010,8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010/\u001a\u0004\u0018\u00010.8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileViewState;", "viewState", "Lcom/whoop/profile/view/edit/form/EditProfileFormState;", "formState", "Lkotlin/Function2;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;", "", "Ll83/a0;", "onFieldUpdate", "Lkotlin/Function1;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;", "onEvent", "Lg1/z3;", "initialValue", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;", "initialBottomSheetType", "content", "EditProfileBottomSheet", "(Lcom/whoop/profile/presentation/edit/EditProfileViewState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lc93/m;Lkotlin/jvm/functions/Function1;Lg1/z3;Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "Lkotlin/Function0;", "onCancel", "onConfirm", "", "showBottomButtons", "fadeInButtons", "confirmButtonText", "BottomSheetFrame", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/m;Landroidx/compose/runtime/Composer;II)V", "type", "getTitle", "(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;)Lcom/whoop/design/util/TextResource;", "getSubtitle", "currentBottomSheet", "overrideUnitSystem", "Lcom/whoop/profile/view/edit/GenderBaselineSheetState;", "genderBaselineState", "Lcom/whoop/profile/view/edit/CountryStateSheetState;", "countryStateState", "Lcom/whoop/profile/view/edit/HeightWeightState;", "heightWeightState", "avatarIsInCropMode", "Landroid/net/Uri;", "avatarSelectedImageUri", "Landroid/graphics/Rect;", "avatarCropBounds", "profile_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EditProfileBottomSheetKt {

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[EditProfileViewState.BottomSheetType.values().length];
            try {
                iArr[EditProfileViewState.BottomSheetType.AVATAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EditProfileViewState.BottomSheetType.COUNTRY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EditProfileViewState.BottomSheetType.WEIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EditProfileViewState.BottomSheetType.HEIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EditProfileViewState.BottomSheetType.STATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EditProfileViewState.BottomSheetType.GENDER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EditProfileViewState.BottomSheetType.PHYSIOLOGICAL_BASELINE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EditProfileEvent.FieldType.values().length];
            try {
                iArr2[EditProfileEvent.FieldType.HEIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EditProfileEvent.FieldType.WEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0117  */
    /* JADX WARN: Code duplicated, block: B:103:0x011b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0123  */
    /* JADX WARN: Code duplicated, block: B:107:0x0126  */
    /* JADX WARN: Code duplicated, block: B:108:0x0128  */
    /* JADX WARN: Code duplicated, block: B:111:0x012e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0180  */
    /* JADX WARN: Code duplicated, block: B:115:0x0184  */
    /* JADX WARN: Code duplicated, block: B:118:0x0197  */
    /* JADX WARN: Code duplicated, block: B:120:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:123:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:124:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:127:0x026d  */
    /* JADX WARN: Code duplicated, block: B:128:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:131:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:133:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:136:0x0311  */
    /* JADX WARN: Code duplicated, block: B:139:0x0322  */
    /* JADX WARN: Code duplicated, block: B:143:0x0337 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:146:0x0389  */
    /* JADX WARN: Code duplicated, block: B:149:0x039c  */
    /* JADX WARN: Code duplicated, block: B:151:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:152:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:155:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:157:0x0402  */
    /* JADX WARN: Code duplicated, block: B:161:0x0414  */
    /* JADX WARN: Code duplicated, block: B:164:0x0420  */
    /* JADX WARN: Code duplicated, block: B:165:0x0422  */
    /* JADX WARN: Code duplicated, block: B:169:0x0471  */
    /* JADX WARN: Code duplicated, block: B:172:0x047a  */
    /* JADX WARN: Code duplicated, block: B:173:0x047d  */
    /* JADX WARN: Code duplicated, block: B:175:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:177:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:180:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fb  */
    private static final void BottomSheetFrame(TextResource textResource, TextResource textResource2, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, boolean z4, boolean z13, TextResource textResource3, InterfaceC4351m interfaceC4351m, Composer composer, int i13, int i14) {
        int i15;
        boolean z14;
        int i16;
        int i17;
        boolean z15;
        C28655q c28655q;
        boolean z16;
        TextResource textResource4;
        boolean z17;
        TextResource textResource5;
        C28677v1 c28677v1M87180u;
        boolean z18;
        int i18;
        TextResource textResource6;
        boolean z19;
        C2314t c2314t;
        float f13;
        float f14;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        int i19;
        C38072d c38072d;
        int i24;
        float f15;
        float f16;
        int i25;
        int i26;
        float f17;
        boolean z24;
        int iHashCode2;
        C0213j c0213j2;
        float f18;
        boolean z25;
        int iHashCode3;
        float f19;
        float f24;
        int i27;
        int i28;
        boolean zM87157i;
        int i29;
        TextResource textResourceM21267a = textResource2;
        TextResource c8688b = textResource3;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1085835844);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q2.m87153g(textResource) : c28655q2.m87157i(textResource) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            if ((i14 & 2) != 0) {
                i29 = 16;
            } else {
                if ((i13 & 64) == 0 ? c28655q2.m87153g(textResourceM21267a) : c28655q2.m87157i(textResourceM21267a)) {
                    i29 = 32;
                } else {
                    i29 = 16;
                }
            }
            i15 |= i29;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(interfaceC4339a) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87157i(interfaceC4339a2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i34 = i14 & 16;
        if (i34 == 0) {
            if ((i13 & 24576) == 0) {
                z14 = z4;
                i15 |= c28655q2.m87155h(z14) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 = i14 & 32;
            if (i16 != 0) {
                if ((196608 & i13) == 0) {
                    if (c28655q2.m87155h(z13)) {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i17;
                }
                if ((1572864 & i13) == 0) {
                    if ((i14 & 64) != 0) {
                        i28 = 524288;
                    } else {
                        if ((2097152 & i13) == 0) {
                            zM87157i = c28655q2.m87153g(c8688b);
                        } else {
                            zM87157i = c28655q2.m87157i(c8688b);
                        }
                        if (zM87157i) {
                            i28 = 1048576;
                        } else {
                            i28 = 524288;
                        }
                    }
                    i15 |= i28;
                }
                if ((12582912 & i13) == 0) {
                    if (c28655q2.m87157i(interfaceC4351m)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                if ((4793491 & i15) != 4793490) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z15)) {
                    c28655q2.m87140Z();
                    if ((i13 & 1) != 0 || c28655q2.m87118C()) {
                        if ((i14 & 2) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                            i15 &= -113;
                        }
                        if (i34 != 0) {
                            z14 = true;
                        }
                        if (i16 != 0) {
                            z18 = false;
                        } else {
                            z18 = z13;
                        }
                        if ((i14 & 64) != 0) {
                            c8688b = new TextResource.C8688b(C9691R.string.profile_confirm, null, 2, null);
                            i15 &= -3670017;
                        }
                    } else {
                        c28655q2.m87138X();
                        if ((i14 & 2) != 0) {
                            i15 &= -113;
                        }
                        if ((i14 & 64) != 0) {
                            i15 &= -3670017;
                        }
                        z18 = z13;
                    }
                    i18 = i15;
                    textResource6 = c8688b;
                    z19 = z14;
                    c28655q2.m87175r();
                    c2314t = C2314t.f9131w;
                    f13 = 8;
                    f14 = 1 * f13;
                    Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f14, 1));
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
                    boolean z26 = z18;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM66722k);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
                    c0209i3 = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                    AbstractC11266d.m30469w((float) 3.5d, 4, c2314t, c28655q2);
                    i19 = TextResource.$stable;
                    String strM21274h = AbstractC8693b.m21274h(textResource, c28655q2, (i18 & 14) | i19);
                    c38072d = C38072d.f163053a;
                    i24 = C38072d.f163054b;
                    C2886a t14 = c38072d.m121952e(c28655q2, i24).getT3();
                    long brandWhite = c38072d.m121949b(c28655q2, i24).getBrandWhite();
                    f15 = ((float) 0.5d) * f13;
                    Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f15, 0.0f, 2);
                    if (AbstractC8693b.m21270d(textResourceM21267a)) {
                        f16 = f15;
                    } else {
                        f16 = 2 * f13;
                    }
                    Modifier modifierM3398t = AbstractC1099a.m3398t(modifierM3396r, 0.0f, 0.0f, 0.0f, f16, 7);
                    C36775k c36775k = new C36775k(5);
                    i25 = C2886a.f11498d;
                    i26 = i25 << 18;
                    AbstractC30795n.m94707h(strM21274h, modifierM3398t, brandWhite, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, t14, null, c28655q2, 0, i26, 196088);
                    c28655q = c28655q2;
                    if (AbstractC8693b.m21270d(textResourceM21267a)) {
                        c28655q.m87150e0(1864528143);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM21267a, c28655q, i19 | ((i18 >> 3) & 14)), AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f15, 0.0f, 2), c38072d.m121949b(c28655q, i24).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i24).getB1(), null, c28655q, 48, i26, 196600);
                        c28655q = c28655q;
                        f17 = f13;
                        z24 = false;
                        AbstractC25012a.m73388u(3, f17, c2314t, c28655q, false);
                    } else {
                        f17 = f13;
                        z24 = false;
                        c28655q.m87150e0(1864898128);
                        c28655q.m87173q(false);
                    }
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, z24);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c0213j2 = c0213j;
                        c28655q.m87163l(c0213j2);
                    } else {
                        c0213j2 = c0213j;
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S) {
                        f18 = f17;
                    } else {
                        f18 = f17;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                        interfaceC4351m.invoke(c28655q, Integer.valueOf((i18 >> 21) & 14));
                        if (z19 || !z26) {
                            z25 = false;
                            c28655q.m87150e0(-1922701878);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-1923372656);
                            z25 = false;
                            AbstractC22989q.m66760a(AbstractC1092a.m3357b(C1100b.f4583a.mo3400a(AbstractC1102d.m3411h(f14, AbstractC1102d.m3409f(1.0f, c2314t)), C2299e.f9105H), C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.f69636m), new C17919x(c38072d.m121949b(c28655q, i24).getBackgroundDarkStd())), 0.0f, Float.POSITIVE_INFINITY, 8), null, 0.0f, 6), c28655q, 0);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        if (z19) {
                            c28655q.m87150e0(1865829430);
                            Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 2 * f18, 0.0f, 0.0f, 13);
                            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(((float) 1.5d) * f18), C2299e.f9107J, c28655q, 6);
                            iHashCode3 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j2);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f19 = Float.MAX_VALUE;
                            } else {
                                f19 = 1.0f;
                            }
                            C28655q c28655q3 = c28655q;
                            AbstractC27271o0.m82253b(new LayoutWeightElement(f19, true), false, new TextResource.C8688b(C9691R.string.profile_cancel, null, 2, null), c38072d.m121952e(c28655q, i24).getH4(), null, null, null, null, false, null, interfaceC4339a, c28655q3, (TextResource.C8688b.f25889c << 6) | (i25 << 9), (i18 >> 6) & 14, MessageListItemViewType.ERROR_MESSAGE);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f24 = Float.MAX_VALUE;
                            } else {
                                f24 = 1.0f;
                            }
                            AbstractC27292z.m82343j(new LayoutWeightElement(f24, true), false, false, null, null, null, textResource6, null, null, null, 0.0f, null, c38072d.m121952e(c28655q3, i24).getH4(), interfaceC4339a2, c28655q3, (i19 << 18) | (3670016 & i18), (i25 << 6) | (i18 & 7168), 4030);
                            c28655q = c28655q3;
                            AbstractC18489d0.m53356B(c28655q, true, c2314t, f14, c28655q);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1866653968);
                            c28655q.m87173q(z25);
                        }
                        c28655q.m87173q(true);
                        z17 = z19;
                        textResource5 = textResourceM21267a;
                        z16 = z26;
                        textResource4 = textResource6;
                    }
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    interfaceC4351m.invoke(c28655q, Integer.valueOf((i18 >> 21) & 14));
                    if (z19) {
                        z25 = false;
                        c28655q.m87150e0(-1922701878);
                        c28655q.m87173q(false);
                    } else {
                        z25 = false;
                        c28655q.m87150e0(-1922701878);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    if (z19) {
                        c28655q.m87150e0(1865829430);
                        Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 2 * f18, 0.0f, 0.0f, 13);
                        C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(((float) 1.5d) * f18), C2299e.f9107J, c28655q, 6);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3398t3);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f19 = Float.MAX_VALUE;
                        } else {
                            f19 = 1.0f;
                        }
                        C28655q c28655q4 = c28655q;
                        AbstractC27271o0.m82253b(new LayoutWeightElement(f19, true), false, new TextResource.C8688b(C9691R.string.profile_cancel, null, 2, null), c38072d.m121952e(c28655q, i24).getH4(), null, null, null, null, false, null, interfaceC4339a, c28655q4, (TextResource.C8688b.f25889c << 6) | (i25 << 9), (i18 >> 6) & 14, MessageListItemViewType.ERROR_MESSAGE);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f24 = Float.MAX_VALUE;
                        } else {
                            f24 = 1.0f;
                        }
                        AbstractC27292z.m82343j(new LayoutWeightElement(f24, true), false, false, null, null, null, textResource6, null, null, null, 0.0f, null, c38072d.m121952e(c28655q4, i24).getH4(), interfaceC4339a2, c28655q4, (i19 << 18) | (3670016 & i18), (i25 << 6) | (i18 & 7168), 4030);
                        c28655q = c28655q4;
                        AbstractC18489d0.m53356B(c28655q, true, c2314t, f14, c28655q);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1866653968);
                        c28655q.m87173q(z25);
                    }
                    c28655q.m87173q(true);
                    z17 = z19;
                    textResource5 = textResourceM21267a;
                    z16 = z26;
                    textResource4 = textResource6;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    z16 = z13;
                    textResource4 = c8688b;
                    z17 = z14;
                    textResource5 = textResourceM21267a;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C9785i(textResource, textResource5, interfaceC4339a, interfaceC4339a2, z17, z16, textResource4, interfaceC4351m, i13, i14);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            if ((1572864 & i13) == 0) {
                if ((i14 & 64) != 0) {
                    i28 = 524288;
                } else {
                    if ((2097152 & i13) == 0) {
                        zM87157i = c28655q2.m87153g(c8688b);
                    } else {
                        zM87157i = c28655q2.m87157i(c8688b);
                    }
                    if (zM87157i) {
                        i28 = 1048576;
                    } else {
                        i28 = 524288;
                    }
                }
                i15 |= i28;
            }
            if ((12582912 & i13) == 0) {
                if (c28655q2.m87157i(interfaceC4351m)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i15 |= i27;
            }
            if ((4793491 & i15) != 4793490) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z15)) {
                c28655q2.m87140Z();
                if ((i13 & 1) != 0) {
                    if ((i14 & 2) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i15 &= -113;
                    }
                    if (i34 != 0) {
                        z14 = true;
                    }
                    if (i16 != 0) {
                        z18 = false;
                    } else {
                        z18 = z13;
                    }
                    if ((i14 & 64) != 0) {
                        c8688b = new TextResource.C8688b(C9691R.string.profile_confirm, null, 2, null);
                        i15 &= -3670017;
                    }
                } else {
                    if ((i14 & 2) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i15 &= -113;
                    }
                    if (i34 != 0) {
                        z14 = true;
                    }
                    if (i16 != 0) {
                        z18 = false;
                    } else {
                        z18 = z13;
                    }
                    if ((i14 & 64) != 0) {
                        c8688b = new TextResource.C8688b(C9691R.string.profile_confirm, null, 2, null);
                        i15 &= -3670017;
                    }
                }
                i18 = i15;
                textResource6 = c8688b;
                z19 = z14;
                c28655q2.m87175r();
                c2314t = C2314t.f9131w;
                f13 = 8;
                f14 = 1 * f13;
                Modifier modifierM66722k2 = AbstractC22953f.m66722k(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f14, 1));
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
                boolean z27 = z18;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM66722k2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a2);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m5);
                c0209i3 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N5);
                AbstractC11266d.m30469w((float) 3.5d, 4, c2314t, c28655q2);
                i19 = TextResource.$stable;
                String strM21274h2 = AbstractC8693b.m21274h(textResource, c28655q2, (i18 & 14) | i19);
                c38072d = C38072d.f163053a;
                i24 = C38072d.f163054b;
                C2886a t15 = c38072d.m121952e(c28655q2, i24).getT3();
                long brandWhite2 = c38072d.m121949b(c28655q2, i24).getBrandWhite();
                f15 = ((float) 0.5d) * f13;
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f15, 0.0f, 2);
                if (AbstractC8693b.m21270d(textResourceM21267a)) {
                    f16 = f15;
                } else {
                    f16 = 2 * f13;
                }
                Modifier modifierM3398t4 = AbstractC1099a.m3398t(modifierM3396r2, 0.0f, 0.0f, 0.0f, f16, 7);
                C36775k c36775k2 = new C36775k(5);
                i25 = C2886a.f11498d;
                i26 = i25 << 18;
                AbstractC30795n.m94707h(strM21274h2, modifierM3398t4, brandWhite2, 0L, null, null, null, 0L, null, c36775k2, 0L, 0, false, 0, 0, null, t15, null, c28655q2, 0, i26, 196088);
                c28655q = c28655q2;
                if (AbstractC8693b.m21270d(textResourceM21267a)) {
                    c28655q.m87150e0(1864528143);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM21267a, c28655q, i19 | ((i18 >> 3) & 14)), AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f15, 0.0f, 2), c38072d.m121949b(c28655q, i24).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i24).getB1(), null, c28655q, 48, i26, 196600);
                    c28655q = c28655q;
                    f17 = f13;
                    z24 = false;
                    AbstractC25012a.m73388u(3, f17, c2314t, c28655q, false);
                } else {
                    f17 = f13;
                    z24 = false;
                    c28655q.m87150e0(1864898128);
                    c28655q.m87173q(false);
                }
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, z24);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c0213j2 = c0213j;
                    c28655q.m87163l(c0213j2);
                } else {
                    c0213j2 = c0213j;
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    f18 = f17;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N6);
                    interfaceC4351m.invoke(c28655q, Integer.valueOf((i18 >> 21) & 14));
                    if (z19) {
                        z25 = false;
                        c28655q.m87150e0(-1922701878);
                        c28655q.m87173q(false);
                    } else {
                        z25 = false;
                        c28655q.m87150e0(-1922701878);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    if (z19) {
                        c28655q.m87150e0(1865829430);
                        Modifier modifierM3398t5 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 2 * f18, 0.0f, 0.0f, 13);
                        C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(((float) 1.5d) * f18), C2299e.f9107J, c28655q, 6);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                        Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3398t5);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a3);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m7);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N7);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f19 = Float.MAX_VALUE;
                        } else {
                            f19 = 1.0f;
                        }
                        C28655q c28655q5 = c28655q;
                        AbstractC27271o0.m82253b(new LayoutWeightElement(f19, true), false, new TextResource.C8688b(C9691R.string.profile_cancel, null, 2, null), c38072d.m121952e(c28655q, i24).getH4(), null, null, null, null, false, null, interfaceC4339a, c28655q5, (TextResource.C8688b.f25889c << 6) | (i25 << 9), (i18 >> 6) & 14, MessageListItemViewType.ERROR_MESSAGE);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f24 = Float.MAX_VALUE;
                        } else {
                            f24 = 1.0f;
                        }
                        AbstractC27292z.m82343j(new LayoutWeightElement(f24, true), false, false, null, null, null, textResource6, null, null, null, 0.0f, null, c38072d.m121952e(c28655q5, i24).getH4(), interfaceC4339a2, c28655q5, (i19 << 18) | (3670016 & i18), (i25 << 6) | (i18 & 7168), 4030);
                        c28655q = c28655q5;
                        AbstractC18489d0.m53356B(c28655q, true, c2314t, f14, c28655q);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1866653968);
                        c28655q.m87173q(z25);
                    }
                    c28655q.m87173q(true);
                    z17 = z19;
                    textResource5 = textResourceM21267a;
                    z16 = z27;
                    textResource4 = textResource6;
                } else {
                    f18 = f17;
                }
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N6);
                interfaceC4351m.invoke(c28655q, Integer.valueOf((i18 >> 21) & 14));
                if (z19) {
                    z25 = false;
                    c28655q.m87150e0(-1922701878);
                    c28655q.m87173q(false);
                } else {
                    z25 = false;
                    c28655q.m87150e0(-1922701878);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                if (z19) {
                    c28655q.m87150e0(1865829430);
                    Modifier modifierM3398t6 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 2 * f18, 0.0f, 0.0f, 13);
                    C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(((float) 1.5d) * f18), C2299e.f9107J, c28655q, 6);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3398t6);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a4);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m8);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N8);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f19 = Float.MAX_VALUE;
                    } else {
                        f19 = 1.0f;
                    }
                    C28655q c28655q6 = c28655q;
                    AbstractC27271o0.m82253b(new LayoutWeightElement(f19, true), false, new TextResource.C8688b(C9691R.string.profile_cancel, null, 2, null), c38072d.m121952e(c28655q, i24).getH4(), null, null, null, null, false, null, interfaceC4339a, c28655q6, (TextResource.C8688b.f25889c << 6) | (i25 << 9), (i18 >> 6) & 14, MessageListItemViewType.ERROR_MESSAGE);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f24 = Float.MAX_VALUE;
                    } else {
                        f24 = 1.0f;
                    }
                    AbstractC27292z.m82343j(new LayoutWeightElement(f24, true), false, false, null, null, null, textResource6, null, null, null, 0.0f, null, c38072d.m121952e(c28655q6, i24).getH4(), interfaceC4339a2, c28655q6, (i19 << 18) | (3670016 & i18), (i25 << 6) | (i18 & 7168), 4030);
                    c28655q = c28655q6;
                    AbstractC18489d0.m53356B(c28655q, true, c2314t, f14, c28655q);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1866653968);
                    c28655q.m87173q(z25);
                }
                c28655q.m87173q(true);
                z17 = z19;
                textResource5 = textResourceM21267a;
                z16 = z27;
                textResource4 = textResource6;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                z16 = z13;
                textResource4 = c8688b;
                z17 = z14;
                textResource5 = textResourceM21267a;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C9785i(textResource, textResource5, interfaceC4339a, interfaceC4339a2, z17, z16, textResource4, interfaceC4351m, i13, i14);
            }
        }
        i15 |= 24576;
        z14 = z4;
        i16 = i14 & 32;
        if (i16 != 0) {
            if ((196608 & i13) == 0) {
                if (c28655q2.m87155h(z13)) {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i17;
            }
            if ((1572864 & i13) == 0) {
                if ((i14 & 64) != 0) {
                    i28 = 524288;
                } else {
                    if ((2097152 & i13) == 0) {
                        zM87157i = c28655q2.m87153g(c8688b);
                    } else {
                        zM87157i = c28655q2.m87157i(c8688b);
                    }
                    if (zM87157i) {
                        i28 = 1048576;
                    } else {
                        i28 = 524288;
                    }
                }
                i15 |= i28;
            }
            if ((12582912 & i13) == 0) {
                if (c28655q2.m87157i(interfaceC4351m)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i15 |= i27;
            }
            if ((4793491 & i15) != 4793490) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z15)) {
                c28655q2.m87140Z();
                if ((i13 & 1) != 0) {
                    if ((i14 & 2) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i15 &= -113;
                    }
                    if (i34 != 0) {
                        z14 = true;
                    }
                    if (i16 != 0) {
                        z18 = false;
                    } else {
                        z18 = z13;
                    }
                    if ((i14 & 64) != 0) {
                        c8688b = new TextResource.C8688b(C9691R.string.profile_confirm, null, 2, null);
                        i15 &= -3670017;
                    }
                } else {
                    if ((i14 & 2) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i15 &= -113;
                    }
                    if (i34 != 0) {
                        z14 = true;
                    }
                    if (i16 != 0) {
                        z18 = false;
                    } else {
                        z18 = z13;
                    }
                    if ((i14 & 64) != 0) {
                        c8688b = new TextResource.C8688b(C9691R.string.profile_confirm, null, 2, null);
                        i15 &= -3670017;
                    }
                }
                i18 = i15;
                textResource6 = c8688b;
                z19 = z14;
                c28655q2.m87175r();
                c2314t = C2314t.f9131w;
                f13 = 8;
                f14 = 1 * f13;
                Modifier modifierM66722k3 = AbstractC22953f.m66722k(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f14, 1));
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
                boolean z28 = z18;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifierM66722k3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a3);
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
                AbstractC11266d.m30469w((float) 3.5d, 4, c2314t, c28655q2);
                i19 = TextResource.$stable;
                String strM21274h3 = AbstractC8693b.m21274h(textResource, c28655q2, (i18 & 14) | i19);
                c38072d = C38072d.f163053a;
                i24 = C38072d.f163054b;
                C2886a t16 = c38072d.m121952e(c28655q2, i24).getT3();
                long brandWhite3 = c38072d.m121949b(c28655q2, i24).getBrandWhite();
                f15 = ((float) 0.5d) * f13;
                Modifier modifierM3396r3 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f15, 0.0f, 2);
                if (AbstractC8693b.m21270d(textResourceM21267a)) {
                    f16 = f15;
                } else {
                    f16 = 2 * f13;
                }
                Modifier modifierM3398t7 = AbstractC1099a.m3398t(modifierM3396r3, 0.0f, 0.0f, 0.0f, f16, 7);
                C36775k c36775k3 = new C36775k(5);
                i25 = C2886a.f11498d;
                i26 = i25 << 18;
                AbstractC30795n.m94707h(strM21274h3, modifierM3398t7, brandWhite3, 0L, null, null, null, 0L, null, c36775k3, 0L, 0, false, 0, 0, null, t16, null, c28655q2, 0, i26, 196088);
                c28655q = c28655q2;
                if (AbstractC8693b.m21270d(textResourceM21267a)) {
                    c28655q.m87150e0(1864528143);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM21267a, c28655q, i19 | ((i18 >> 3) & 14)), AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f15, 0.0f, 2), c38072d.m121949b(c28655q, i24).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i24).getB1(), null, c28655q, 48, i26, 196600);
                    c28655q = c28655q;
                    f17 = f13;
                    z24 = false;
                    AbstractC25012a.m73388u(3, f17, c2314t, c28655q, false);
                } else {
                    f17 = f13;
                    z24 = false;
                    c28655q.m87150e0(1864898128);
                    c28655q.m87173q(false);
                }
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, z24);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c0213j2 = c0213j;
                    c28655q.m87163l(c0213j2);
                } else {
                    c0213j2 = c0213j;
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m10);
                if (c28655q.f115903S) {
                    f18 = f17;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N10);
                    interfaceC4351m.invoke(c28655q, Integer.valueOf((i18 >> 21) & 14));
                    if (z19) {
                        z25 = false;
                        c28655q.m87150e0(-1922701878);
                        c28655q.m87173q(false);
                    } else {
                        z25 = false;
                        c28655q.m87150e0(-1922701878);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    if (z19) {
                        c28655q.m87150e0(1865829430);
                        Modifier modifierM3398t8 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 2 * f18, 0.0f, 0.0f, 13);
                        C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(((float) 1.5d) * f18), C2299e.f9107J, c28655q, 6);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                        Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3398t8);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a5);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f19 = Float.MAX_VALUE;
                        } else {
                            f19 = 1.0f;
                        }
                        C28655q c28655q7 = c28655q;
                        AbstractC27271o0.m82253b(new LayoutWeightElement(f19, true), false, new TextResource.C8688b(C9691R.string.profile_cancel, null, 2, null), c38072d.m121952e(c28655q, i24).getH4(), null, null, null, null, false, null, interfaceC4339a, c28655q7, (TextResource.C8688b.f25889c << 6) | (i25 << 9), (i18 >> 6) & 14, MessageListItemViewType.ERROR_MESSAGE);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f24 = Float.MAX_VALUE;
                        } else {
                            f24 = 1.0f;
                        }
                        AbstractC27292z.m82343j(new LayoutWeightElement(f24, true), false, false, null, null, null, textResource6, null, null, null, 0.0f, null, c38072d.m121952e(c28655q7, i24).getH4(), interfaceC4339a2, c28655q7, (i19 << 18) | (3670016 & i18), (i25 << 6) | (i18 & 7168), 4030);
                        c28655q = c28655q7;
                        AbstractC18489d0.m53356B(c28655q, true, c2314t, f14, c28655q);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1866653968);
                        c28655q.m87173q(z25);
                    }
                    c28655q.m87173q(true);
                    z17 = z19;
                    textResource5 = textResourceM21267a;
                    z16 = z28;
                    textResource4 = textResource6;
                } else {
                    f18 = f17;
                }
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N10);
                interfaceC4351m.invoke(c28655q, Integer.valueOf((i18 >> 21) & 14));
                if (z19) {
                    z25 = false;
                    c28655q.m87150e0(-1922701878);
                    c28655q.m87173q(false);
                } else {
                    z25 = false;
                    c28655q.m87150e0(-1922701878);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                if (z19) {
                    c28655q.m87150e0(1865829430);
                    Modifier modifierM3398t9 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 2 * f18, 0.0f, 0.0f, 13);
                    C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(((float) 1.5d) * f18), C2299e.f9107J, c28655q, 6);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3398t9);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a6);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m12);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N12);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f19 = Float.MAX_VALUE;
                    } else {
                        f19 = 1.0f;
                    }
                    C28655q c28655q8 = c28655q;
                    AbstractC27271o0.m82253b(new LayoutWeightElement(f19, true), false, new TextResource.C8688b(C9691R.string.profile_cancel, null, 2, null), c38072d.m121952e(c28655q, i24).getH4(), null, null, null, null, false, null, interfaceC4339a, c28655q8, (TextResource.C8688b.f25889c << 6) | (i25 << 9), (i18 >> 6) & 14, MessageListItemViewType.ERROR_MESSAGE);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f24 = Float.MAX_VALUE;
                    } else {
                        f24 = 1.0f;
                    }
                    AbstractC27292z.m82343j(new LayoutWeightElement(f24, true), false, false, null, null, null, textResource6, null, null, null, 0.0f, null, c38072d.m121952e(c28655q8, i24).getH4(), interfaceC4339a2, c28655q8, (i19 << 18) | (3670016 & i18), (i25 << 6) | (i18 & 7168), 4030);
                    c28655q = c28655q8;
                    AbstractC18489d0.m53356B(c28655q, true, c2314t, f14, c28655q);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1866653968);
                    c28655q.m87173q(z25);
                }
                c28655q.m87173q(true);
                z17 = z19;
                textResource5 = textResourceM21267a;
                z16 = z28;
                textResource4 = textResource6;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                z16 = z13;
                textResource4 = c8688b;
                z17 = z14;
                textResource5 = textResourceM21267a;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C9785i(textResource, textResource5, interfaceC4339a, interfaceC4339a2, z17, z16, textResource4, interfaceC4351m, i13, i14);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        if ((1572864 & i13) == 0) {
            if ((i14 & 64) != 0) {
                i28 = 524288;
            } else {
                if ((2097152 & i13) == 0) {
                    zM87157i = c28655q2.m87153g(c8688b);
                } else {
                    zM87157i = c28655q2.m87157i(c8688b);
                }
                if (zM87157i) {
                    i28 = 1048576;
                } else {
                    i28 = 524288;
                }
            }
            i15 |= i28;
        }
        if ((12582912 & i13) == 0) {
            if (c28655q2.m87157i(interfaceC4351m)) {
                i27 = 8388608;
            } else {
                i27 = 4194304;
            }
            i15 |= i27;
        }
        if ((4793491 & i15) != 4793490) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z15)) {
            c28655q2.m87140Z();
            if ((i13 & 1) != 0) {
                if ((i14 & 2) != 0) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                    i15 &= -113;
                }
                if (i34 != 0) {
                    z14 = true;
                }
                if (i16 != 0) {
                    z18 = false;
                } else {
                    z18 = z13;
                }
                if ((i14 & 64) != 0) {
                    c8688b = new TextResource.C8688b(C9691R.string.profile_confirm, null, 2, null);
                    i15 &= -3670017;
                }
            } else {
                if ((i14 & 2) != 0) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                    i15 &= -113;
                }
                if (i34 != 0) {
                    z14 = true;
                }
                if (i16 != 0) {
                    z18 = false;
                } else {
                    z18 = z13;
                }
                if ((i14 & 64) != 0) {
                    c8688b = new TextResource.C8688b(C9691R.string.profile_confirm, null, 2, null);
                    i15 &= -3670017;
                }
            }
            i18 = i15;
            textResource6 = c8688b;
            z19 = z14;
            c28655q2.m87175r();
            c2314t = C2314t.f9131w;
            f13 = 8;
            f14 = 1 * f13;
            Modifier modifierM66722k4 = AbstractC22953f.m66722k(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f14, 1));
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
            boolean z29 = z18;
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q2.m87165m();
            Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q2, modifierM66722k4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a4);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m13);
            c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N13);
            AbstractC11266d.m30469w((float) 3.5d, 4, c2314t, c28655q2);
            i19 = TextResource.$stable;
            String strM21274h4 = AbstractC8693b.m21274h(textResource, c28655q2, (i18 & 14) | i19);
            c38072d = C38072d.f163053a;
            i24 = C38072d.f163054b;
            C2886a t17 = c38072d.m121952e(c28655q2, i24).getT3();
            long brandWhite4 = c38072d.m121949b(c28655q2, i24).getBrandWhite();
            f15 = ((float) 0.5d) * f13;
            Modifier modifierM3396r4 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f15, 0.0f, 2);
            if (AbstractC8693b.m21270d(textResourceM21267a)) {
                f16 = f15;
            } else {
                f16 = 2 * f13;
            }
            Modifier modifierM3398t10 = AbstractC1099a.m3398t(modifierM3396r4, 0.0f, 0.0f, 0.0f, f16, 7);
            C36775k c36775k4 = new C36775k(5);
            i25 = C2886a.f11498d;
            i26 = i25 << 18;
            AbstractC30795n.m94707h(strM21274h4, modifierM3398t10, brandWhite4, 0L, null, null, null, 0L, null, c36775k4, 0L, 0, false, 0, 0, null, t17, null, c28655q2, 0, i26, 196088);
            c28655q = c28655q2;
            if (AbstractC8693b.m21270d(textResourceM21267a)) {
                c28655q.m87150e0(1864528143);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM21267a, c28655q, i19 | ((i18 >> 3) & 14)), AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f15, 0.0f, 2), c38072d.m121949b(c28655q, i24).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i24).getB1(), null, c28655q, 48, i26, 196600);
                c28655q = c28655q;
                f17 = f13;
                z24 = false;
                AbstractC25012a.m73388u(3, f17, c2314t, c28655q, false);
            } else {
                f17 = f13;
                z24 = false;
                c28655q.m87150e0(1864898128);
                c28655q.m87173q(false);
            }
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, z24);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
            Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c0213j2 = c0213j;
                c28655q.m87163l(c0213j2);
            } else {
                c0213j2 = c0213j;
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m14);
            if (c28655q.f115903S) {
                f18 = f17;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N14);
                interfaceC4351m.invoke(c28655q, Integer.valueOf((i18 >> 21) & 14));
                if (z19) {
                    z25 = false;
                    c28655q.m87150e0(-1922701878);
                    c28655q.m87173q(false);
                } else {
                    z25 = false;
                    c28655q.m87150e0(-1922701878);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                if (z19) {
                    c28655q.m87150e0(1865829430);
                    Modifier modifierM3398t11 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 2 * f18, 0.0f, 0.0f, 13);
                    C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(((float) 1.5d) * f18), C2299e.f9107J, c28655q, 6);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM3398t11);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a7);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m15);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N15);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f19 = Float.MAX_VALUE;
                    } else {
                        f19 = 1.0f;
                    }
                    C28655q c28655q9 = c28655q;
                    AbstractC27271o0.m82253b(new LayoutWeightElement(f19, true), false, new TextResource.C8688b(C9691R.string.profile_cancel, null, 2, null), c38072d.m121952e(c28655q, i24).getH4(), null, null, null, null, false, null, interfaceC4339a, c28655q9, (TextResource.C8688b.f25889c << 6) | (i25 << 9), (i18 >> 6) & 14, MessageListItemViewType.ERROR_MESSAGE);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f24 = Float.MAX_VALUE;
                    } else {
                        f24 = 1.0f;
                    }
                    AbstractC27292z.m82343j(new LayoutWeightElement(f24, true), false, false, null, null, null, textResource6, null, null, null, 0.0f, null, c38072d.m121952e(c28655q9, i24).getH4(), interfaceC4339a2, c28655q9, (i19 << 18) | (3670016 & i18), (i25 << 6) | (i18 & 7168), 4030);
                    c28655q = c28655q9;
                    AbstractC18489d0.m53356B(c28655q, true, c2314t, f14, c28655q);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1866653968);
                    c28655q.m87173q(z25);
                }
                c28655q.m87173q(true);
                z17 = z19;
                textResource5 = textResourceM21267a;
                z16 = z29;
                textResource4 = textResource6;
            } else {
                f18 = f17;
            }
            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N14);
            interfaceC4351m.invoke(c28655q, Integer.valueOf((i18 >> 21) & 14));
            if (z19) {
                z25 = false;
                c28655q.m87150e0(-1922701878);
                c28655q.m87173q(false);
            } else {
                z25 = false;
                c28655q.m87150e0(-1922701878);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            if (z19) {
                c28655q.m87150e0(1865829430);
                Modifier modifierM3398t12 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 2 * f18, 0.0f, 0.0f, 13);
                C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(((float) 1.5d) * f18), C2299e.f9107J, c28655q, 6);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM3398t12);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a8);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m16);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N16);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f19 = Float.MAX_VALUE;
                } else {
                    f19 = 1.0f;
                }
                C28655q c28655q10 = c28655q;
                AbstractC27271o0.m82253b(new LayoutWeightElement(f19, true), false, new TextResource.C8688b(C9691R.string.profile_cancel, null, 2, null), c38072d.m121952e(c28655q, i24).getH4(), null, null, null, null, false, null, interfaceC4339a, c28655q10, (TextResource.C8688b.f25889c << 6) | (i25 << 9), (i18 >> 6) & 14, MessageListItemViewType.ERROR_MESSAGE);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f24 = Float.MAX_VALUE;
                } else {
                    f24 = 1.0f;
                }
                AbstractC27292z.m82343j(new LayoutWeightElement(f24, true), false, false, null, null, null, textResource6, null, null, null, 0.0f, null, c38072d.m121952e(c28655q10, i24).getH4(), interfaceC4339a2, c28655q10, (i19 << 18) | (3670016 & i18), (i25 << 6) | (i18 & 7168), 4030);
                c28655q = c28655q10;
                AbstractC18489d0.m53356B(c28655q, true, c2314t, f14, c28655q);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1866653968);
                c28655q.m87173q(z25);
            }
            c28655q.m87173q(true);
            z17 = z19;
            textResource5 = textResourceM21267a;
            z16 = z29;
            textResource4 = textResource6;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            z16 = z13;
            textResource4 = c8688b;
            z17 = z14;
            textResource5 = textResourceM21267a;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9785i(textResource, textResource5, interfaceC4339a, interfaceC4339a2, z17, z16, textResource4, interfaceC4351m, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 BottomSheetFrame$lambda$1(TextResource textResource, TextResource textResource2, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, boolean z4, boolean z13, TextResource textResource3, InterfaceC4351m interfaceC4351m, int i13, int i14, Composer composer, int i15) {
        BottomSheetFrame(textResource, textResource2, interfaceC4339a, interfaceC4339a2, z4, z13, textResource3, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    public static final void EditProfileBottomSheet(final EditProfileViewState viewState, final EditProfileFormState formState, final InterfaceC4351m onFieldUpdate, final Function1 onEvent, EnumC15209z3 enumC15209z3, EditProfileViewState.BottomSheetType bottomSheetType, Function3 content, Composer composer, int i13, int i14) {
        int i15;
        EnumC15209z3 enumC15209z4;
        EditProfileViewState.BottomSheetType bottomSheetType2;
        DefaultConstructorMarker defaultConstructorMarker;
        C15199y3 c15199y3;
        InterfaceC2994c0 interfaceC2994c0;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(formState, "formState");
        AbstractC22676k.m65750j(onFieldUpdate, "onFieldUpdate");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        AbstractC22676k.m65750j(content, "content");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-741528716);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(formState) : c28655q.m87157i(formState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onFieldUpdate) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(onEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i16 = i14 & 16;
        if (i16 != 0) {
            i15 |= 24576;
        } else if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87149e(enumC15209z3 == null ? -1 : enumC15209z3.ordinal()) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i17 = i14 & 32;
        if (i17 != 0) {
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        } else if ((196608 & i13) == 0) {
            i15 |= c28655q.m87149e(bottomSheetType != null ? bottomSheetType.ordinal() : -1) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i15 |= c28655q.m87157i(content) ? 1048576 : 524288;
        }
        if (c28655q.m87135U(i15 & 1, (599187 & i15) != 599186)) {
            EnumC15209z3 enumC15209z5 = i16 != 0 ? EnumC15209z3.f57106w : enumC15209z3;
            EditProfileViewState.BottomSheetType bottomSheetType3 = i17 != 0 ? null : bottomSheetType;
            C15199y3 c15199y3M3460c = AbstractC1118c.m3460c(enumC15209z5, null, null, true, c28655q, ((i15 >> 12) & 14) | 3072, 6);
            EnumC15209z3 enumC15209z6 = enumC15209z5;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC2994c0 interfaceC2994c1 = (InterfaceC2994c0) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(bottomSheetType3);
                c28655q.m87172p0(objM87133R2);
            }
            final InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R3);
            }
            final InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(new GenderBaselineSheetState(null, null, false, 7, null));
                c28655q.m87172p0(objM87133R4);
            }
            final InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
            Object objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC28683x.m87272z(new CountryStateSheetState(null, null, null, 7, null));
                c28655q.m87172p0(objM87133R5);
            }
            final InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R5;
            Object objM87133R6 = c28655q.m87133R();
            int i18 = 3;
            float f13 = 0.0f;
            if (objM87133R6 == c28676v0) {
                defaultConstructorMarker = null;
                objM87133R6 = AbstractC28683x.m87272z(new HeightWeightState(f13, f13, i18, defaultConstructorMarker));
                c28655q.m87172p0(objM87133R6);
            } else {
                defaultConstructorMarker = null;
            }
            final InterfaceC28601c1 interfaceC28601c5 = (InterfaceC28601c1) objM87133R6;
            DefaultConstructorMarker defaultConstructorMarker2 = defaultConstructorMarker;
            Object objM87133R7 = c28655q.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R7);
            }
            final InterfaceC28601c1 interfaceC28601c6 = (InterfaceC28601c1) objM87133R7;
            Object objM87133R8 = c28655q.m87133R();
            if (objM87133R8 == c28676v0) {
                objM87133R8 = AbstractC28683x.m87272z(defaultConstructorMarker2);
                c28655q.m87172p0(objM87133R8);
            }
            final InterfaceC28601c1 interfaceC28601c7 = (InterfaceC28601c1) objM87133R8;
            Object objM87133R9 = c28655q.m87133R();
            if (objM87133R9 == c28676v0) {
                objM87133R9 = AbstractC28683x.m87272z(defaultConstructorMarker2);
                c28655q.m87172p0(objM87133R9);
            }
            final InterfaceC28601c1 interfaceC28601c8 = (InterfaceC28601c1) objM87133R9;
            final Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            C35666g c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
            AbstractC35664f.a aVar = new AbstractC35664f.a(c15199y3M3460c);
            float f14 = 6 * 4;
            C33252i c33252iM105491g = AbstractC33253j.m105491g(f14, f14, 0.0f, 0.0f, 12);
            EnumC39333f enumC39333f = EnumC39333f.BLACK_70;
            float f15 = 8;
            float f16 = 2 * f15;
            Modifier modifierM3397s = AbstractC1099a.m3397s(AbstractC1102d.m3409f(1.0f, AbstractC15673b0.m44028b0(C2314t.f9131w)), f16, f16, f16, 0 * f15);
            boolean zM87157i = c28655q.m87157i(interfaceC2994c1) | c28655q.m87157i(c15199y3M3460c);
            Object objM87133R10 = c28655q.m87133R();
            if (zM87157i || objM87133R10 == c28676v0) {
                c15199y3 = c15199y3M3460c;
                interfaceC2994c0 = interfaceC2994c1;
                objM87133R10 = new C9786j(interfaceC2994c0, c15199y3, interfaceC28601c1, interfaceC28601c2, interfaceC28601c6, interfaceC28601c7, interfaceC28601c8, 0);
                c28655q.m87172p0(objM87133R10);
            } else {
                c15199y3 = c15199y3M3460c;
                interfaceC2994c0 = interfaceC2994c1;
            }
            final InterfaceC2994c0 interfaceC2994c2 = interfaceC2994c0;
            final C15199y3 c15199y4 = c15199y3;
            AbstractC35660d.m112871m(null, c35666g, aVar, enumC39333f, (InterfaceC4339a) objM87133R10, null, c33252iM105491g, AbstractC37817c.m121344e(1511982370, c28655q, new Function3() { // from class: com.whoop.profile.view.edit.k
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return EditProfileBottomSheetKt.EditProfileBottomSheet$lambda$25(interfaceC28601c1, interfaceC2994c2, c15199y4, onFieldUpdate, formState, context, onEvent, interfaceC28601c6, interfaceC28601c2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c7, interfaceC28601c8, interfaceC28601c5, viewState, (InterfaceC23013y) obj, (Composer) obj2, iIntValue);
                }
            }), false, null, null, null, false, modifierM3397s, AbstractC37817c.m121344e(2056008166, c28655q, new C3467p0(content, formState, interfaceC2994c0, c15199y3, interfaceC28601c1, interfaceC28601c2, interfaceC28601c3, 2)), c28655q, (C35666g.f151591h << 3) | 12585984 | (AbstractC35664f.a.f151587c << 6), 24576, 7969);
            c28655q = c28655q;
            bottomSheetType2 = bottomSheetType3;
            enumC15209z4 = enumC15209z6;
        } else {
            c28655q.m87138X();
            enumC15209z4 = enumC15209z3;
            bottomSheetType2 = bottomSheetType;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2931g(viewState, formState, onFieldUpdate, onEvent, enumC15209z4, bottomSheetType2, content, i13, i14);
        }
    }

    private static final EditProfileViewState.BottomSheetType EditProfileBottomSheet$lambda$1(InterfaceC28601c1 interfaceC28601c1) {
        return (EditProfileViewState.BottomSheetType) interfaceC28601c1.getValue();
    }

    private static final CountryStateSheetState EditProfileBottomSheet$lambda$10(InterfaceC28601c1 interfaceC28601c1) {
        return (CountryStateSheetState) interfaceC28601c1.getValue();
    }

    private static final HeightWeightState EditProfileBottomSheet$lambda$13(InterfaceC28601c1 interfaceC28601c1) {
        return (HeightWeightState) interfaceC28601c1.getValue();
    }

    private static final boolean EditProfileBottomSheet$lambda$16(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EditProfileBottomSheet$lambda$17(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    private static final Uri EditProfileBottomSheet$lambda$19(InterfaceC28601c1 interfaceC28601c1) {
        return (Uri) interfaceC28601c1.getValue();
    }

    private static final Rect EditProfileBottomSheet$lambda$22(InterfaceC28601c1 interfaceC28601c1) {
        return (Rect) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileBottomSheet$lambda$24$0(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, InterfaceC28601c1 interfaceC28601c5) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new EditProfileBottomSheetKt$EditProfileBottomSheet$1$1$1(c15199y3, interfaceC28601c1, interfaceC28601c2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c5, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileBottomSheet$lambda$25(final InterfaceC28601c1 interfaceC28601c1, final InterfaceC2994c0 interfaceC2994c0, final C15199y3 c15199y3, final InterfaceC4351m interfaceC4351m, final EditProfileFormState editProfileFormState, final Context context, final Function1 function1, final InterfaceC28601c1 interfaceC28601c2, final InterfaceC28601c1 interfaceC28601c3, final InterfaceC28601c1 interfaceC28601c4, final InterfaceC28601c1 interfaceC28601c5, final InterfaceC28601c1 interfaceC28601c6, final InterfaceC28601c1 interfaceC28601c7, final InterfaceC28601c1 interfaceC28601c8, final EditProfileViewState editProfileViewState, InterfaceC23013y BottomSheet, Composer composer, int i13) {
        final EditProfileViewState.BottomSheetType bottomSheetType;
        C28655q c28655q;
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q2 = (C28655q) composer;
        if (c28655q2.m87135U(i13 & 1, (i13 & 17) != 16)) {
            EditProfileViewState.BottomSheetType bottomSheetTypeEditProfileBottomSheet$lambda$1 = EditProfileBottomSheet$lambda$1(interfaceC28601c1);
            if (bottomSheetTypeEditProfileBottomSheet$lambda$1 == null) {
                c28655q2.m87150e0(2145239552);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(2145239553);
                TextResource title = getTitle(bottomSheetTypeEditProfileBottomSheet$lambda$1);
                TextResource subtitle = getSubtitle(bottomSheetTypeEditProfileBottomSheet$lambda$1);
                int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                boolean zEditProfileBottomSheet$lambda$16 = iArr[bottomSheetTypeEditProfileBottomSheet$lambda$1.ordinal()] == 1 ? EditProfileBottomSheet$lambda$16(interfaceC28601c2) : true;
                int i14 = iArr[bottomSheetTypeEditProfileBottomSheet$lambda$1.ordinal()];
                boolean z4 = i14 == 2 || i14 == 3 || i14 == 4 || i14 == 5;
                TextResource.C8688b c8688b = (iArr[bottomSheetTypeEditProfileBottomSheet$lambda$1.ordinal()] == 1 && EditProfileBottomSheet$lambda$16(interfaceC28601c2)) ? new TextResource.C8688b(C9691R.string.profile_avatar_upload, null, 2, null) : new TextResource.C8688b(C9691R.string.profile_confirm, null, 2, null);
                TextResource.C8688b c8688b2 = c8688b;
                boolean zM87157i = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(c15199y3);
                Object objM87133R = c28655q2.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (zM87157i || objM87133R == c28676v0) {
                    C9775f c9775f = new C9775f(interfaceC2994c0, c15199y3, interfaceC28601c1, interfaceC28601c3, interfaceC28601c4, interfaceC28601c5, interfaceC28601c2, interfaceC28601c6, interfaceC28601c7, 0);
                    c28655q2.m87172p0(c9775f);
                    objM87133R = c9775f;
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                boolean zM87149e = c28655q2.m87149e(bottomSheetTypeEditProfileBottomSheet$lambda$1.ordinal()) | c28655q2.m87153g(interfaceC4351m) | c28655q2.m87157i(editProfileFormState) | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(c15199y3) | c28655q2.m87157i(context) | c28655q2.m87153g(function1);
                Object objM87133R2 = c28655q2.m87133R();
                if (zM87149e || objM87133R2 == c28676v0) {
                    bottomSheetType = bottomSheetTypeEditProfileBottomSheet$lambda$1;
                    InterfaceC4339a interfaceC4339a2 = new InterfaceC4339a() { // from class: com.whoop.profile.view.edit.g
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return EditProfileBottomSheetKt.EditProfileBottomSheet$lambda$25$0$1$0(bottomSheetType, interfaceC4351m, interfaceC2994c0, context, function1, interfaceC28601c4, editProfileFormState, interfaceC28601c1, c15199y3, interfaceC28601c5, interfaceC28601c2, interfaceC28601c6, interfaceC28601c7, interfaceC28601c8, interfaceC28601c3);
                        }
                    };
                    c28655q = c28655q2;
                    c28655q.m87172p0(interfaceC4339a2);
                    objM87133R2 = interfaceC4339a2;
                } else {
                    c28655q = c28655q2;
                    bottomSheetType = bottomSheetTypeEditProfileBottomSheet$lambda$1;
                }
                C37816b c37816bM121344e = AbstractC37817c.m121344e(1786377336, c28655q, new InterfaceC4351m() { // from class: com.whoop.profile.view.edit.h
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return EditProfileBottomSheetKt.EditProfileBottomSheet$lambda$25$0$2(bottomSheetType, editProfileViewState, editProfileFormState, function1, interfaceC2994c0, c15199y3, interfaceC28601c4, interfaceC28601c8, interfaceC28601c3, interfaceC28601c5, interfaceC28601c2, interfaceC28601c6, interfaceC28601c7, interfaceC28601c1, (Composer) obj, iIntValue);
                    }
                });
                int i15 = TextResource.$stable;
                boolean z13 = zEditProfileBottomSheet$lambda$16;
                boolean z14 = z4;
                BottomSheetFrame(title, subtitle, interfaceC4339a, (InterfaceC4339a) objM87133R2, z13, z14, c8688b2, c37816bM121344e, c28655q, (i15 << 3) | 12582912 | i15 | (TextResource.C8688b.f25889c << 18), 0);
                c28655q.m87173q(false);
            }
        } else {
            c28655q2.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileBottomSheet$lambda$25$0$0$0(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, InterfaceC28601c1 interfaceC28601c5, InterfaceC28601c1 interfaceC28601c6, InterfaceC28601c1 interfaceC28601c7) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new EditProfileBottomSheetKt$EditProfileBottomSheet$2$1$1$1$1(c15199y3, interfaceC28601c1, interfaceC28601c2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c5, interfaceC28601c6, interfaceC28601c7, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final C23454a0 EditProfileBottomSheet$lambda$25$0$1$0(EditProfileViewState.BottomSheetType bottomSheetType, InterfaceC4351m interfaceC4351m, InterfaceC2994c0 interfaceC2994c0, Context context, Function1 function1, InterfaceC28601c1 interfaceC28601c1, EditProfileFormState editProfileFormState, InterfaceC28601c1 interfaceC28601c2, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, InterfaceC28601c1 interfaceC28601c5, InterfaceC28601c1 interfaceC28601c6, InterfaceC28601c1 interfaceC28601c7, InterfaceC28601c1 interfaceC28601c8) {
        int i13 = WhenMappings.$EnumSwitchMapping$0[bottomSheetType.ordinal()];
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i13) {
            case 1:
                if (EditProfileBottomSheet$lambda$16(interfaceC28601c4)) {
                    AvatarUploadUtils.INSTANCE.processAndUploadAvatar(EditProfileBottomSheet$lambda$19(interfaceC28601c5), context, function1, new C9773d(interfaceC2994c0, c15199y3, interfaceC28601c2, interfaceC28601c4, interfaceC28601c5, interfaceC28601c6, 1), EditProfileBottomSheet$lambda$22(interfaceC28601c6));
                }
                return c23454a0;
            case 2:
                EditProfileViewState.Country selectedCountry = EditProfileBottomSheet$lambda$10(interfaceC28601c3).getSelectedCountry();
                if (selectedCountry != null) {
                    interfaceC4351m.invoke(EditProfileEvent.FieldType.COUNTRY, selectedCountry.getCountryCode());
                    if (selectedCountry.getStates().isEmpty()) {
                        interfaceC4351m.invoke(EditProfileEvent.FieldType.STATE, "");
                    }
                    AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new EditProfileBottomSheetKt$EditProfileBottomSheet$2$1$2$1$4(c15199y3, interfaceC28601c2, interfaceC28601c3, null), 3);
                    return c23454a0;
                }
                return c23454a0;
            case 3:
                if (EditProfileBottomSheet$lambda$13(interfaceC28601c7).getWeight() > 0.0f) {
                    interfaceC4351m.invoke(EditProfileEvent.FieldType.WEIGHT, String.valueOf(EditProfileBottomSheet$lambda$13(interfaceC28601c7).getWeight()));
                    interfaceC28601c7.setValue(HeightWeightState.copy$default(EditProfileBottomSheet$lambda$13(interfaceC28601c7), 0.0f, 0.0f, 1, null));
                    AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new EditProfileBottomSheetKt$EditProfileBottomSheet$2$1$2$1$8(c15199y3, interfaceC28601c2, null), 3);
                    return c23454a0;
                }
                return c23454a0;
            case 4:
                if (EditProfileBottomSheet$lambda$13(interfaceC28601c7).getHeight() > 0.0f) {
                    interfaceC4351m.invoke(EditProfileEvent.FieldType.HEIGHT, String.valueOf(EditProfileBottomSheet$lambda$13(interfaceC28601c7).getHeight()));
                    interfaceC28601c7.setValue(HeightWeightState.copy$default(EditProfileBottomSheet$lambda$13(interfaceC28601c7), 0.0f, 0.0f, 2, null));
                    AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new EditProfileBottomSheetKt$EditProfileBottomSheet$2$1$2$1$7(c15199y3, interfaceC28601c2, null), 3);
                    return c23454a0;
                }
                return c23454a0;
            case 5:
                EditProfileViewState.State selectedState = EditProfileBottomSheet$lambda$10(interfaceC28601c3).getSelectedState();
                if (selectedState != null) {
                    interfaceC4351m.invoke(EditProfileEvent.FieldType.STATE, selectedState.getCode());
                }
                AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new EditProfileBottomSheetKt$EditProfileBottomSheet$2$1$2$1$5(c15199y3, interfaceC28601c2, interfaceC28601c3, null), 3);
                return c23454a0;
            case 6:
                GenderBaselineBottomSheetLogicKt.handleGenderSelectionConfirm(EditProfileBottomSheet$lambda$7(interfaceC28601c1).getSelectedGender(), interfaceC4351m, new C3718c(editProfileFormState, interfaceC28601c1, false, interfaceC28601c2, 27), new C9774e(interfaceC2994c0, c15199y3, interfaceC28601c2, interfaceC28601c1, 0 == true ? 1 : 0));
                return c23454a0;
            case 7:
                GenderBaselineBottomSheetLogicKt.handlePhysiologicalBaselineSelectionConfirm(EditProfileBottomSheet$lambda$7(interfaceC28601c1).getSelectedGender(), EditProfileBottomSheet$lambda$7(interfaceC28601c1).getSelectedPhysiologicalBaseline(), EditProfileBottomSheet$lambda$7(interfaceC28601c1).isTransitionedFromGender(), interfaceC4351m, new C9774e(interfaceC2994c0, c15199y3, interfaceC28601c2, interfaceC28601c1, 1));
                return c23454a0;
            default:
                AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new EditProfileBottomSheetKt$EditProfileBottomSheet$2$1$2$1$9(c15199y3, interfaceC28601c2, interfaceC28601c8, null), 3);
                return c23454a0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileBottomSheet$lambda$25$0$1$0$0(EditProfileFormState editProfileFormState, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        interfaceC28601c1.setValue(GenderBaselineBottomSheetLogicKt.markAsTransitionedFromGender(EditProfileBottomSheet$lambda$7(interfaceC28601c1), editProfileFormState));
        interfaceC28601c2.setValue(EditProfileViewState.BottomSheetType.PHYSIOLOGICAL_BASELINE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileBottomSheet$lambda$25$0$1$0$1(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new EditProfileBottomSheetKt$EditProfileBottomSheet$2$1$2$1$2$1(c15199y3, interfaceC28601c1, interfaceC28601c2, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileBottomSheet$lambda$25$0$1$0$2(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new EditProfileBottomSheetKt$EditProfileBottomSheet$2$1$2$1$3$1(c15199y3, interfaceC28601c1, interfaceC28601c2, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileBottomSheet$lambda$25$0$1$0$3(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new EditProfileBottomSheetKt$EditProfileBottomSheet$2$1$2$1$6$1(c15199y3, interfaceC28601c1, interfaceC28601c2, interfaceC28601c3, interfaceC28601c4, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:56:0x018a  */
    /* JADX WARN: Code duplicated, block: B:57:0x018f  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v21 java.lang.Object, still in use, count: 2, list:
          (r8v21 java.lang.Object) from 0x011d: PHI (r8 I:??) = (r8v18 java.lang.Object), (r8v21 java.lang.Object) binds: [B:34:0x011c, B:103:0x011d] A[DONT_GENERATE, DONT_INLINE]
          (r8v21 java.lang.Object) from 0x0107: CHECK_CAST (com.whoop.profile.presentation.edit.EditProfileViewState$Country) (r8v21 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static final l83.C23454a0 EditProfileBottomSheet$lambda$25$0$2(com.whoop.profile.presentation.edit.EditProfileViewState.BottomSheetType r32, com.whoop.profile.presentation.edit.EditProfileViewState r33, com.whoop.profile.view.edit.form.EditProfileFormState r34, p715kotlin.jvm.functions.Function1 r35, bc3.InterfaceC2994c0 r36, p163g1.C15199y3 r37, p390p1.InterfaceC28601c1 r38, p390p1.InterfaceC28601c1 r39, p390p1.InterfaceC28601c1 r40, p390p1.InterfaceC28601c1 r41, p390p1.InterfaceC28601c1 r42, p390p1.InterfaceC28601c1 r43, p390p1.InterfaceC28601c1 r44, p390p1.InterfaceC28601c1 r45, androidx.compose.runtime.Composer r46, int r47) {
        /*
            Method dump skipped, instruction units count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.profile.view.edit.EditProfileBottomSheetKt.EditProfileBottomSheet$lambda$25$0$2(com.whoop.profile.presentation.edit.EditProfileViewState$BottomSheetType, com.whoop.profile.presentation.edit.EditProfileViewState, com.whoop.profile.view.edit.form.EditProfileFormState, kotlin.jvm.functions.Function1, bc3.c0, g1.y3, p1.c1, p1.c1, p1.c1, p1.c1, p1.c1, p1.c1, p1.c1, p1.c1, androidx.compose.runtime.Composer, int):l83.a0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileBottomSheet$lambda$25$0$2$0$0(InterfaceC28601c1 interfaceC28601c1, Gender gender) {
        AbstractC22676k.m65750j(gender, "gender");
        interfaceC28601c1.setValue(GenderBaselineBottomSheetLogicKt.updateSelectedGender(EditProfileBottomSheet$lambda$7(interfaceC28601c1), gender));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileBottomSheet$lambda$25$0$2$1$0(InterfaceC28601c1 interfaceC28601c1, PhysiologicalBaseline baseline) {
        AbstractC22676k.m65750j(baseline, "baseline");
        interfaceC28601c1.setValue(GenderBaselineBottomSheetLogicKt.updateSelectedBaseline(EditProfileBottomSheet$lambda$7(interfaceC28601c1), baseline));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileBottomSheet$lambda$25$0$2$10$0(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new EditProfileBottomSheetKt$EditProfileBottomSheet$2$1$3$9$1$1(c15199y3, interfaceC28601c1, interfaceC28601c2, interfaceC28601c3, interfaceC28601c4, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileBottomSheet$lambda$25$0$2$2$0(InterfaceC28601c1 interfaceC28601c1, EditProfileEvent.FieldType fieldType, String value) {
        AbstractC22676k.m65750j(fieldType, "fieldType");
        AbstractC22676k.m65750j(value, "value");
        int i13 = WhenMappings.$EnumSwitchMapping$1[fieldType.ordinal()];
        if (i13 == 1) {
            HeightWeightState heightWeightStateEditProfileBottomSheet$lambda$13 = EditProfileBottomSheet$lambda$13(interfaceC28601c1);
            Float fM125915y = AbstractC39420x.m125915y(value);
            interfaceC28601c1.setValue(HeightWeightState.copy$default(heightWeightStateEditProfileBottomSheet$lambda$13, fM125915y != null ? fM125915y.floatValue() : 0.0f, 0.0f, 2, null));
        } else if (i13 == 2) {
            HeightWeightState heightWeightStateEditProfileBottomSheet$lambda$14 = EditProfileBottomSheet$lambda$13(interfaceC28601c1);
            Float fM125915y2 = AbstractC39420x.m125915y(value);
            interfaceC28601c1.setValue(HeightWeightState.copy$default(heightWeightStateEditProfileBottomSheet$lambda$14, 0.0f, fM125915y2 != null ? fM125915y2.floatValue() : 0.0f, 1, null));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileBottomSheet$lambda$25$0$2$3$0(InterfaceC28601c1 interfaceC28601c1, EditProfileViewState.Country country) {
        AbstractC22676k.m65750j(country, "country");
        interfaceC28601c1.setValue(CountryStateSheetState.copy$default(EditProfileBottomSheet$lambda$10(interfaceC28601c1), null, country, null, 5, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileBottomSheet$lambda$25$0$2$6$0(InterfaceC28601c1 interfaceC28601c1, EditProfileViewState.State state) {
        AbstractC22676k.m65750j(state, "state");
        interfaceC28601c1.setValue(CountryStateSheetState.copy$default(EditProfileBottomSheet$lambda$10(interfaceC28601c1), null, null, state, 3, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileBottomSheet$lambda$25$0$2$7$0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        EditProfileBottomSheet$lambda$17(interfaceC28601c1, z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileBottomSheet$lambda$25$0$2$8$0(InterfaceC28601c1 interfaceC28601c1, Uri uri) {
        AbstractC22676k.m65750j(uri, "uri");
        interfaceC28601c1.setValue(uri);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileBottomSheet$lambda$25$0$2$9$0(InterfaceC28601c1 interfaceC28601c1, Rect rect) {
        interfaceC28601c1.setValue(rect);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileBottomSheet$lambda$26(Function3 function3, EditProfileFormState editProfileFormState, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM87157i = c28655q.m87157i(editProfileFormState) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                Object c1990b0 = new C1990b0(editProfileFormState, interfaceC2994c0, interfaceC28601c1, interfaceC28601c2, interfaceC28601c3, c15199y3);
                c28655q.m87172p0(c1990b0);
                objM87133R = c1990b0;
            }
            function3.invoke((InterfaceC4351m) objM87133R, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileBottomSheet$lambda$26$0$0(EditProfileFormState editProfileFormState, InterfaceC2994c0 interfaceC2994c0, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, C15199y3 c15199y3, EditProfileViewState.BottomSheetType type, String str) {
        AbstractC22676k.m65750j(type, "type");
        interfaceC28601c1.setValue(type);
        interfaceC28601c2.setValue(str);
        if (type == EditProfileViewState.BottomSheetType.GENDER || type == EditProfileViewState.BottomSheetType.PHYSIOLOGICAL_BASELINE) {
            interfaceC28601c3.setValue(GenderBaselineBottomSheetLogicKt.initializeGenderBaselineState(editProfileFormState));
        }
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new EditProfileBottomSheetKt$EditProfileBottomSheet$3$1$1$1(c15199y3, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileBottomSheet$lambda$27(EditProfileViewState editProfileViewState, EditProfileFormState editProfileFormState, InterfaceC4351m interfaceC4351m, Function1 function1, EnumC15209z3 enumC15209z3, EditProfileViewState.BottomSheetType bottomSheetType, Function3 function3, int i13, int i14, Composer composer, int i15) {
        EditProfileBottomSheet(editProfileViewState, editProfileFormState, interfaceC4351m, function1, enumC15209z3, bottomSheetType, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    private static final String EditProfileBottomSheet$lambda$4(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    private static final GenderBaselineSheetState EditProfileBottomSheet$lambda$7(InterfaceC28601c1 interfaceC28601c1) {
        return (GenderBaselineSheetState) interfaceC28601c1.getValue();
    }

    private static final TextResource getSubtitle(EditProfileViewState.BottomSheetType bottomSheetType) {
        int i13 = WhenMappings.$EnumSwitchMapping$0[bottomSheetType.ordinal()];
        if (i13 != 6) {
            return i13 != 7 ? AbstractC8693b.m21267a() : new TextResource.C8688b(C9691R.string.profile_physiological_baseline_subtitle, null, 2, null);
        }
        return new TextResource.C8688b(C9691R.string.profile_gender_subtitle, null, 2, null);
    }

    private static final TextResource getTitle(EditProfileViewState.BottomSheetType bottomSheetType) {
        switch (WhenMappings.$EnumSwitchMapping$0[bottomSheetType.ordinal()]) {
            case 1:
                return new TextResource.C8688b(C9691R.string.profile_set_your_photo_title, null, 2, null);
            case 2:
                return new TextResource.C8688b(C9691R.string.profile_select_country_title, null, 2, null);
            case 3:
                return new TextResource.C8688b(C9691R.string.profile_set_weight_title, null, 2, null);
            case 4:
                return new TextResource.C8688b(C9691R.string.profile_set_height_title, null, 2, null);
            case 5:
                return new TextResource.C8688b(C9691R.string.profile_select_state_title, null, 2, null);
            case 6:
                return new TextResource.C8688b(C9691R.string.profile_set_gender_title, null, 2, null);
            case 7:
                return new TextResource.C8688b(C9691R.string.profile_set_physiological_baseline_title, null, 2, null);
            default:
                return new TextResource.C8688b(C9691R.string.profile_selection_fallback, null, 2, null);
        }
    }
}
