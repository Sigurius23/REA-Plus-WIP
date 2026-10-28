package com.whoop.profile.view.edit;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2564l1;
import be1.C3169c;
import bm2.C3440f1;
import bs1.C3603v;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.local.room.dao.persistent.C6498i;
import com.whoop.design.models.modal.C8527a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.C9691R;
import com.whoop.profile.presentation.edit.EditProfileEvent;
import com.whoop.profile.presentation.edit.EditProfileViewState;
import com.whoop.profile.utils.BirthdayUtils;
import com.whoop.profile.view.edit.form.ClickableFieldConfig;
import com.whoop.profile.view.edit.form.ClickableFieldConfigKt;
import com.whoop.profile.view.edit.form.EditProfileFormState;
import com.whoop.profile.view.edit.form.EditProfileFormUtils;
import com.whoop.profile.view.edit.form.EditProfileTextFieldKt;
import com.whoop.profile.view.edit.form.HeightWeightGroupedField;
import com.whoop.profile.view.edit.form.HeightWeightGroupedFormFieldKt;
import com.whoop.profile.view.edit.form.TextFieldConfig;
import com.whoop.profile.view.edit.form.TextFieldConfigKt;
import gb1.AbstractC15676d;
import ih0.AbstractC18489d0;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27292z;
import p000.AbstractC11266d;
import p003a1.C0111j;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p164g2.C15240l;
import p164g2.InterfaceC15237i;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p510u0.C34348q0;
import p510u0.InterfaceC34345p0;
import p635y2.InterfaceC39127r0;
import p702ch0.C4614e;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import q83.AbstractC30060g;
import qr2.AbstractC30556a;
import qz0.AbstractC30783b;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a±\u0001\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\n0\f2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\f2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\b2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/whoop/profile/presentation/edit/EditProfileViewState;", "viewState", "Lcom/whoop/profile/view/edit/form/EditProfileFormState;", "formState", "Ltr2/n;", "logger", "Lkotlin/Function1;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;", "Ll83/a0;", "onEvent", "Lkotlin/Function2;", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;", "", "onOpenBottomSheet", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;", "onFieldUpdate", "onFieldValidation", "Lkotlin/Function0;", "onUsernameFieldFocused", "onOpenBirthdayPicker", "EditProfileFieldsContent", "(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/presentation/edit/EditProfileViewState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Ltr2/n;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "profile_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EditProfileFieldsContentKt {

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[EditProfileEvent.FieldType.values().length];
            try {
                iArr[EditProfileEvent.FieldType.FIRST_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EditProfileEvent.FieldType.LAST_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EditProfileEvent.FieldType.USERNAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EditProfileEvent.FieldType.CITY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EditProfileViewState.BottomSheetType.values().length];
            try {
                iArr2[EditProfileViewState.BottomSheetType.COUNTRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EditProfileViewState.BottomSheetType.STATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EditProfileViewState.BottomSheetType.GENDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EditProfileViewState.BottomSheetType.PHYSIOLOGICAL_BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0140  */
    /* JADX WARN: Code duplicated, block: B:103:0x0146  */
    /* JADX WARN: Code duplicated, block: B:106:0x0155  */
    /* JADX WARN: Code duplicated, block: B:108:0x015b  */
    /* JADX WARN: Code duplicated, block: B:110:0x0169  */
    /* JADX WARN: Code duplicated, block: B:112:0x016d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0173  */
    /* JADX WARN: Code duplicated, block: B:116:0x0182  */
    /* JADX WARN: Code duplicated, block: B:125:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:129:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:138:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:142:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:151:0x020a  */
    /* JADX WARN: Code duplicated, block: B:155:0x0214  */
    /* JADX WARN: Code duplicated, block: B:158:0x025a  */
    /* JADX WARN: Code duplicated, block: B:159:0x025e  */
    /* JADX WARN: Code duplicated, block: B:162:0x0273  */
    /* JADX WARN: Code duplicated, block: B:165:0x0284  */
    /* JADX WARN: Code duplicated, block: B:169:0x0297  */
    /* JADX WARN: Code duplicated, block: B:170:0x0299  */
    /* JADX WARN: Code duplicated, block: B:172:0x029c  */
    /* JADX WARN: Code duplicated, block: B:175:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:176:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:179:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:181:0x0300  */
    /* JADX WARN: Code duplicated, block: B:184:0x0312  */
    /* JADX WARN: Code duplicated, block: B:185:0x0314  */
    /* JADX WARN: Code duplicated, block: B:188:0x031b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:189:0x031d  */
    /* JADX WARN: Code duplicated, block: B:193:0x0378  */
    /* JADX WARN: Code duplicated, block: B:195:0x0380  */
    /* JADX WARN: Code duplicated, block: B:197:0x0396  */
    /* JADX WARN: Code duplicated, block: B:198:0x0398  */
    /* JADX WARN: Code duplicated, block: B:201:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:203:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:205:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:207:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:208:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:209:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:210:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:211:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:213:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:217:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:219:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:220:0x0414  */
    /* JADX WARN: Code duplicated, block: B:222:0x0422 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:230:0x045b  */
    /* JADX WARN: Code duplicated, block: B:232:0x045f  */
    /* JADX WARN: Code duplicated, block: B:237:0x0476  */
    /* JADX WARN: Code duplicated, block: B:239:0x047c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:241:0x0495  */
    /* JADX WARN: Code duplicated, block: B:243:0x049a  */
    /* JADX WARN: Code duplicated, block: B:245:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:246:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:248:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:250:0x04de  */
    /* JADX WARN: Code duplicated, block: B:253:0x0538  */
    /* JADX WARN: Code duplicated, block: B:255:0x0548  */
    /* JADX WARN: Code duplicated, block: B:258:0x055c  */
    /* JADX WARN: Code duplicated, block: B:260:0x056c  */
    /* JADX WARN: Code duplicated, block: B:264:0x0582  */
    /* JADX WARN: Code duplicated, block: B:266:0x0596  */
    /* JADX WARN: Code duplicated, block: B:267:0x05af  */
    /* JADX WARN: Code duplicated, block: B:269:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:270:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:273:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:275:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:277:0x0614  */
    /* JADX WARN: Code duplicated, block: B:280:0x062e  */
    /* JADX WARN: Code duplicated, block: B:282:0x0642  */
    /* JADX WARN: Code duplicated, block: B:284:0x065b  */
    /* JADX WARN: Code duplicated, block: B:286:0x065e  */
    /* JADX WARN: Code duplicated, block: B:287:0x0675  */
    /* JADX WARN: Code duplicated, block: B:290:0x068b  */
    /* JADX WARN: Code duplicated, block: B:292:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:293:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:296:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:298:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:299:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:301:0x06fb  */
    /* JADX WARN: Code duplicated, block: B:302:0x0711  */
    /* JADX WARN: Code duplicated, block: B:305:0x0725  */
    /* JADX WARN: Code duplicated, block: B:307:0x0739  */
    /* JADX WARN: Code duplicated, block: B:308:0x0750  */
    /* JADX WARN: Code duplicated, block: B:311:0x0765  */
    /* JADX WARN: Code duplicated, block: B:313:0x077d  */
    /* JADX WARN: Code duplicated, block: B:315:0x0795  */
    /* JADX WARN: Code duplicated, block: B:317:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:319:0x07c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:322:0x07cb  */
    /* JADX WARN: Code duplicated, block: B:325:0x07d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:326:0x07db  */
    /* JADX WARN: Code duplicated, block: B:329:0x07f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:330:0x07f4  */
    /* JADX WARN: Code duplicated, block: B:333:0x082c  */
    /* JADX WARN: Code duplicated, block: B:334:0x082e  */
    /* JADX WARN: Code duplicated, block: B:337:0x083b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:338:0x083d  */
    /* JADX WARN: Code duplicated, block: B:341:0x0859  */
    /* JADX WARN: Code duplicated, block: B:342:0x085b  */
    /* JADX WARN: Code duplicated, block: B:345:0x0868  */
    /* JADX WARN: Code duplicated, block: B:346:0x086a  */
    /* JADX WARN: Code duplicated, block: B:349:0x0879 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:352:0x0881  */
    /* JADX WARN: Code duplicated, block: B:355:0x0907  */
    /* JADX WARN: Code duplicated, block: B:356:0x0913  */
    /* JADX WARN: Code duplicated, block: B:362:0x0962  */
    /* JADX WARN: Code duplicated, block: B:363:0x0965  */
    /* JADX WARN: Code duplicated, block: B:365:0x0969  */
    /* JADX WARN: Code duplicated, block: B:366:0x097d  */
    /* JADX WARN: Code duplicated, block: B:370:0x09d5  */
    /* JADX WARN: Code duplicated, block: B:372:0x09f3  */
    /* JADX WARN: Code duplicated, block: B:374:0x09f6  */
    /* JADX WARN: Code duplicated, block: B:376:0x09f9  */
    /* JADX WARN: Code duplicated, block: B:378:0x09fc  */
    /* JADX WARN: Code duplicated, block: B:379:0x09fe  */
    /* JADX WARN: Code duplicated, block: B:380:0x0a0b  */
    /* JADX WARN: Code duplicated, block: B:381:0x0a18  */
    /* JADX WARN: Code duplicated, block: B:382:0x0a25  */
    /* JADX WARN: Code duplicated, block: B:385:0x0a70  */
    /* JADX WARN: Code duplicated, block: B:386:0x0a72  */
    /* JADX WARN: Code duplicated, block: B:389:0x0a7e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:390:0x0a80  */
    /* JADX WARN: Code duplicated, block: B:394:0x0abb  */
    /* JADX WARN: Code duplicated, block: B:396:0x0ac7  */
    /* JADX WARN: Code duplicated, block: B:398:0x0adb  */
    /* JADX WARN: Code duplicated, block: B:402:0x0aee  */
    /* JADX WARN: Code duplicated, block: B:405:0x0af9  */
    /* JADX WARN: Code duplicated, block: B:406:0x0afb  */
    /* JADX WARN: Code duplicated, block: B:409:0x0b02 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:410:0x0b04  */
    /* JADX WARN: Code duplicated, block: B:413:0x0b1b  */
    /* JADX WARN: Code duplicated, block: B:414:0x0b1d  */
    /* JADX WARN: Code duplicated, block: B:417:0x0b25 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:418:0x0b27  */
    /* JADX WARN: Code duplicated, block: B:422:0x0b8c  */
    /* JADX WARN: Code duplicated, block: B:423:0x0b90  */
    /* JADX WARN: Code duplicated, block: B:426:0x0ba3  */
    /* JADX WARN: Code duplicated, block: B:428:0x0bb1  */
    /* JADX WARN: Code duplicated, block: B:431:0x0be8  */
    /* JADX WARN: Code duplicated, block: B:433:0x0bee  */
    /* JADX WARN: Code duplicated, block: B:435:0x0bf2  */
    /* JADX WARN: Code duplicated, block: B:439:0x0bfe  */
    /* JADX WARN: Code duplicated, block: B:442:0x0c06 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:445:0x0c0c  */
    /* JADX WARN: Code duplicated, block: B:447:0x0c4f  */
    /* JADX WARN: Code duplicated, block: B:450:0x0c62  */
    /* JADX WARN: Code duplicated, block: B:453:0x0932 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0129  */
    /* JADX WARN: Code duplicated, block: B:92:0x012b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0134  */
    /* JADX WARN: Code duplicated, block: B:97:0x0138  */
    /* JADX WARN: Code duplicated, block: B:98:0x013b  */
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
    public static final void EditProfileFieldsContent(Modifier modifier, EditProfileViewState viewState, EditProfileFormState formState, InterfaceC34116n logger, Function1 onEvent, InterfaceC4351m onOpenBottomSheet, InterfaceC4351m onFieldUpdate, Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        InterfaceC4339a interfaceC4339a3;
        C28655q c28655q;
        Function1 function4;
        InterfaceC4339a interfaceC4339a4;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier3;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a5;
        InterfaceC4339a interfaceC4339a6;
        boolean showUsernameField;
        int i16;
        boolean z13;
        boolean zM87155h;
        Object objM87133R;
        List list;
        boolean z14;
        boolean z15;
        Object objM87133R2;
        boolean z16;
        boolean z17;
        Object objM87133R3;
        HeightWeightGroupedField heightWeightGroupedField;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Function1 function5;
        InterfaceC4339a interfaceC4339a7;
        boolean z18;
        float f13;
        int iHashCode2;
        int i17;
        boolean z19;
        Object objM87133R4;
        C2314t c2314t2;
        float f14;
        InterfaceC15237i interfaceC15237i;
        C28676v0 c28676v1;
        int i18;
        Iterator it;
        int i19;
        int i24;
        float f15;
        C2314t c2314t3;
        InterfaceC4339a interfaceC4339a8;
        C28655q c28655q2;
        boolean z24;
        TextResource textResourceM21267a;
        boolean z25;
        boolean z26;
        Object objM87133R5;
        boolean z27;
        boolean z28;
        Object objM87133R6;
        boolean z29;
        int iHashCode3;
        C0213j c0213j2;
        C0209i c0209i2;
        boolean z34;
        boolean z35;
        Object objM87133R7;
        int i25;
        boolean zIsLocked;
        boolean z36;
        boolean zM87157i;
        Object objM87133R8;
        Object next;
        int i26;
        TextFieldConfig textFieldConfig;
        boolean z37;
        int i27;
        boolean zIsLocked2;
        boolean z38;
        boolean zIsValidating;
        boolean z39;
        boolean z44;
        boolean z45;
        boolean z46;
        TextResource textResourceM21267a2;
        long jM53358D;
        boolean zM21270d;
        TextResource error;
        C28676v0 c28676v2;
        Object objM87133R9;
        InterfaceC39332e interfaceC39332eM125323a;
        boolean z47;
        long jM125416r;
        boolean z48;
        long jM53358D2;
        boolean z49;
        long jM95628d;
        long jM125380b;
        long jM125380b2;
        boolean z52;
        InterfaceC15237i interfaceC15237i2;
        boolean zM87157i2;
        Object objM87133R10;
        boolean zM87157i3;
        Object objM87133R11;
        boolean z54;
        boolean zM87157i4;
        Object objM87133R12;
        boolean z55;
        boolean z56;
        boolean z57;
        boolean zM87157i5;
        Object objM87133R13;
        InterfaceC4339a interfaceC4339a9;
        Function1 function6;
        C28655q c28655q3;
        C2314t c2314t4;
        boolean z58;
        boolean z59;
        boolean z60;
        Object objM87133R14;
        Object objM87133R15;
        Object objM87133R16;
        Object objM87133R17;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(formState, "formState");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        AbstractC22676k.m65750j(onOpenBottomSheet, "onOpenBottomSheet");
        AbstractC22676k.m65750j(onFieldUpdate, "onFieldUpdate");
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(500554494);
        int i28 = i14 & 1;
        if (i28 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q4.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q4.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q4.m87153g(formState) : c28655q4.m87157i(formState) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q4.m87157i(logger) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q4.m87157i(onEvent) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q4.m87157i(onOpenBottomSheet) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i15 |= c28655q4.m87157i(onFieldUpdate) ? 1048576 : 524288;
        }
        int i29 = i14 & 128;
        if (i29 != 0) {
            i15 |= 12582912;
            function2 = function1;
        } else {
            function2 = function1;
            if ((i13 & 12582912) == 0) {
                i15 |= c28655q4.m87157i(function2) ? 8388608 : 4194304;
            }
        }
        int i34 = i14 & 256;
        if (i34 != 0) {
            i15 |= 100663296;
        } else if ((i13 & 100663296) == 0) {
            i15 |= c28655q4.m87157i(interfaceC4339a) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        int i35 = i14 & 512;
        if (i35 == 0) {
            if ((i13 & 805306368) == 0) {
                i15 |= c28655q4.m87157i(interfaceC4339a2) ? 536870912 : 268435456;
            }
            if ((i15 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q4.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i28 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i29 != 0) {
                    objM87133R17 = c28655q4.m87133R();
                    if (objM87133R17 == c28676v0) {
                        objM87133R17 = new C6498i(26);
                        c28655q4.m87172p0(objM87133R17);
                    }
                    function2 = (Function1) objM87133R17;
                }
                if (i34 != 0) {
                    objM87133R16 = c28655q4.m87133R();
                    if (objM87133R16 == c28676v0) {
                        objM87133R16 = new C8527a(14);
                        c28655q4.m87172p0(objM87133R16);
                    }
                    interfaceC4339a5 = (InterfaceC4339a) objM87133R16;
                } else {
                    interfaceC4339a5 = interfaceC4339a;
                }
                if (i35 != 0) {
                    objM87133R15 = c28655q4.m87133R();
                    if (objM87133R15 == c28676v0) {
                        objM87133R15 = new C8527a(15);
                        c28655q4.m87172p0(objM87133R15);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R15;
                } else {
                    interfaceC4339a6 = interfaceC4339a2;
                }
                InterfaceC15237i interfaceC15237i3 = (InterfaceC15237i) c28655q4.m87161k(AbstractC2453v1.f9570i);
                showUsernameField = viewState.getShowUsernameField();
                i16 = i15 & 896;
                if (i16 != 256 || ((i15 & 512) != 0 && c28655q4.m87153g(formState))) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87155h = z13 | c28655q4.m87155h(showUsernameField);
                objM87133R = c28655q4.m87133R();
                if (zM87155h || objM87133R == c28676v0) {
                    objM87133R = TextFieldConfigKt.createTextFieldConfigs(formState, showUsernameField);
                    c28655q4.m87172p0(objM87133R);
                }
                list = (List) objM87133R;
                boolean zM87153g = c28655q4.m87153g(viewState.getProfileData());
                if (i16 != 256 || ((i15 & 512) != 0 && c28655q4.m87153g(formState))) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zM87153g | z14;
                objM87133R2 = c28655q4.m87133R();
                if (z15 || objM87133R2 == c28676v0) {
                    objM87133R2 = ClickableFieldConfigKt.createClickableFieldConfigs(viewState.getProfileData(), formState);
                    c28655q4.m87172p0(objM87133R2);
                }
                List<ClickableFieldConfig> list2 = (List) objM87133R2;
                boolean zM87153g2 = c28655q4.m87153g(viewState.getProfileData());
                if (i16 != 256 || ((i15 & 512) != 0 && c28655q4.m87153g(formState))) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = zM87153g2 | z16;
                objM87133R3 = c28655q4.m87133R();
                if (z17 || objM87133R3 == c28676v0) {
                    objM87133R3 = ClickableFieldConfigKt.createHeightWeightGroupedField(viewState.getProfileData(), formState);
                    c28655q4.m87172p0(objM87133R3);
                }
                heightWeightGroupedField = (HeightWeightGroupedField) objM87133R3;
                Modifier modifierM66720i = AbstractC22953f.m66720i(AbstractC1102d.m3407d(1.0f, modifier3));
                C22957g c22957g = AbstractC22977m.f90652c;
                Modifier modifier4 = modifier3;
                C2305k c2305k = C2299e.f9110M;
                int i36 = i15;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q4, 0);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, modifierM66720i);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                C0209i c0209i3 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q4, c0209i3, c23010xM66775a);
                C0209i c0209i4 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q4, c0209i4, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                function5 = function2;
                if (c28655q4.f115903S) {
                    interfaceC4339a7 = interfaceC4339a5;
                } else {
                    interfaceC4339a7 = interfaceC4339a5;
                    if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i5 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i5, modifierM118962N);
                    if (1.0f > 0.0d) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (!z18) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    f13 = 8;
                    float f16 = 2 * f13;
                    Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC30060g.m92116f0(new LayoutWeightElement(1.0f, true), AbstractC30060g.m92099U(0, c28655q4, 1), 14), 0.0f, 0.0f, 0.0f, f16, 7);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q4, 0);
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, modifierM3398t);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i3, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q4, c0209i4, interfaceC28653p1M87165m2);
                    if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i5, modifierM118962N2);
                    EditProfileViewState.EditProfileData profileData = viewState.getProfileData();
                    i17 = i36 & 458752;
                    if (i17 == 131072) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objM87133R4 = c28655q4.m87133R();
                    if (z19 || objM87133R4 == c28676v0) {
                        objM87133R4 = new C0111j(onOpenBottomSheet, 20);
                        c28655q4.m87172p0(objM87133R4);
                    }
                    c2314t2 = c2314t;
                    f14 = f16;
                    interfaceC15237i = interfaceC15237i3;
                    c28676v1 = c28676v0;
                    i18 = i36;
                    EditProfileAvatarSectionKt.EditProfileAvatarSection(profileData, onEvent, (InterfaceC4339a) objM87133R4, AbstractC1099a.m3398t(c2314t, 0.0f, f16, 0.0f, 0.0f, 13), c28655q4, ((i36 >> 9) & 112) | 3072, 0);
                    float f17 = ((float) 2.5d) * f13;
                    AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3411h(f17, c2314t2));
                    c28655q4.m87150e0(-117163495);
                    it = list.iterator();
                    i19 = 0;
                    while (it.hasNext()) {
                        next = it.next();
                        i26 = i19 + 1;
                        if (i19 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        textFieldConfig = (TextFieldConfig) next;
                        Iterator it3 = it;
                        c28655q4.m87144b0(1164532513, textFieldConfig.getFieldType());
                        if (textFieldConfig.getFieldType() == EditProfileEvent.FieldType.USERNAME) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        i27 = WhenMappings.$EnumSwitchMapping$0[textFieldConfig.getFieldType().ordinal()];
                        if (i27 != 1) {
                            zIsLocked2 = viewState.getEditableFields().getFirstName().isLocked();
                        } else if (i27 != 2) {
                            zIsLocked2 = viewState.getEditableFields().getLastName().isLocked();
                        } else if (i27 != 3) {
                            zIsLocked2 = viewState.getEditableFields().getUsername().isLocked();
                        } else if (i27 != 4) {
                            zIsLocked2 = false;
                        } else {
                            zIsLocked2 = viewState.getEditableFields().getCity().isLocked();
                        }
                        if (z37 || viewState.isUsernameFieldEditable()) {
                            z38 = true;
                        } else {
                            z38 = false;
                        }
                        if (z37) {
                            zIsValidating = EditProfileFormUtils.INSTANCE.isUsernameFieldValidating(textFieldConfig.getFieldState().isValidating(), viewState.getUsernameValidationState().isValidating());
                        } else {
                            zIsValidating = textFieldConfig.getFieldState().isValidating();
                        }
                        if (!z37 && !zIsValidating && AbstractC8693b.m21269c(formState.getUsername().getError()) && AbstractC22676k.m65745e(viewState.getUsernameValidationState().isValid(), Boolean.TRUE) && AbstractC22676k.m65745e(viewState.getUsernameValidationState().getLastValidatedUsername(), formState.getUsername().getValue())) {
                            z39 = true;
                        } else {
                            z39 = false;
                        }
                        if (!z37 && AbstractC8693b.m21269c(textFieldConfig.getFieldState().getError()) && (zIsValidating || z39)) {
                            z44 = true;
                        } else {
                            z44 = false;
                        }
                        if (z37 || !zIsValidating) {
                            z45 = zIsValidating;
                            z46 = false;
                            if (z39) {
                                c28655q4.m87150e0(1742520510);
                                c28655q4.m87173q(false);
                                textResourceM21267a2 = viewState.getUsernameValidationState().getValidationSuccess();
                                if (textResourceM21267a2 == null) {
                                    textResourceM21267a2 = AbstractC8693b.m21267a();
                                }
                            } else {
                                c28655q4.m87150e0(1164592365);
                                c28655q4.m87173q(false);
                                textResourceM21267a2 = AbstractC8693b.m21267a();
                            }
                        } else {
                            c28655q4.m87150e0(1164586890);
                            textResourceM21267a2 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q4, C9691R.string.profile_edit_username_validating));
                            z45 = zIsValidating;
                            z46 = false;
                            c28655q4.m87173q(false);
                        }
                        if (z39) {
                            c28655q4.m87150e0(1164596429);
                            jM53358D = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentPositiveTrend();
                            c28655q4.m87173q(false);
                        } else {
                            c28655q4.m87150e0(1164597793);
                            jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q4, C38072d.f163054b, z46);
                        }
                        long j7 = jM53358D;
                        TextResource textResourceM21278l = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q4, textFieldConfig.getLabelRes()));
                        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(textFieldConfig.getFieldState().getValue());
                        int iM134192getKeyboardTypePjHm6EE = textFieldConfig.m134192getKeyboardTypePjHm6EE();
                        String lowerCase = textFieldConfig.getFieldType().name().toLowerCase(Locale.ROOT);
                        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
                        zM21270d = AbstractC8693b.m21270d(textFieldConfig.getFieldState().getError());
                        error = textFieldConfig.getFieldState().getError();
                        if (z37) {
                            c28655q4.m87150e0(1743480022);
                            objM87133R14 = c28655q4.m87133R();
                            c28676v2 = c28676v1;
                            if (objM87133R14 == c28676v2) {
                                objM87133R14 = new Function1() { // from class: com.whoop.profile.view.edit.EditProfileFieldsContentKt$EditProfileFieldsContent$4$1$2$1$1
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public /* synthetic */ Object invoke(Object obj) {
                                        return new C17919x(m134178invokevNxB06k((C39336i) obj));
                                    }

                                    /* JADX INFO: renamed from: invoke-vNxB06k, reason: not valid java name */
                                    public final long m134178invokevNxB06k(C39336i whoopColor) {
                                        AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                                        return whoopColor.getAccentFocus();
                                    }
                                };
                                c28655q4.m87172p0(objM87133R14);
                            }
                            interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R14);
                            c28655q4.m87173q(false);
                        } else {
                            c28676v2 = c28676v1;
                            c28655q4.m87150e0(1743567318);
                            objM87133R9 = c28655q4.m87133R();
                            if (objM87133R9 == c28676v2) {
                                objM87133R9 = new Function1() { // from class: com.whoop.profile.view.edit.EditProfileFieldsContentKt$EditProfileFieldsContent$4$1$2$2$1
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public /* synthetic */ Object invoke(Object obj) {
                                        return new C17919x(m134179invokevNxB06k((C39336i) obj));
                                    }

                                    /* JADX INFO: renamed from: invoke-vNxB06k, reason: not valid java name */
                                    public final long m134179invokevNxB06k(C39336i whoopColor) {
                                        AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                                        return whoopColor.getAccentAlert();
                                    }
                                };
                                c28655q4.m87172p0(objM87133R9);
                            }
                            interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R9);
                            c28655q4.m87173q(false);
                        }
                        InterfaceC39332e interfaceC39332e = interfaceC39332eM125323a;
                        if (z37) {
                            c28655q4.m87150e0(1743716707);
                            if (AbstractC8693b.m21270d(textFieldConfig.getFieldState().getError())) {
                                c28655q4.m87150e0(1164631303);
                                z47 = zM21270d;
                                jM125416r = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentFocus15();
                                z60 = false;
                                c28655q4.m87173q(false);
                            } else {
                                z47 = zM21270d;
                                if (z39) {
                                    c28655q4.m87150e0(1164634095);
                                    jM125416r = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentPositiveTrend15();
                                    z60 = false;
                                    c28655q4.m87173q(false);
                                } else {
                                    c28655q4.m87150e0(1164636641);
                                    jM125416r = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBlack30();
                                    z60 = false;
                                    c28655q4.m87173q(false);
                                }
                            }
                            c28655q4.m87173q(z60);
                        } else {
                            z47 = zM21270d;
                            c28655q4.m87150e0(1744070851);
                            if (AbstractC8693b.m21270d(textFieldConfig.getFieldState().getError())) {
                                c28655q4.m87150e0(1164641740);
                                jM125416r = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentAlertTrend15();
                            } else {
                                c28655q4.m87150e0(1164643073);
                                jM125416r = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBlack30();
                            }
                            c28655q4.m87173q(false);
                            c28655q4.m87173q(false);
                        }
                        long j13 = jM125416r;
                        if (z37) {
                            c28655q4.m87150e0(1744305831);
                            if (AbstractC8693b.m21270d(textFieldConfig.getFieldState().getError())) {
                                c28655q4.m87150e0(1164650309);
                                jM53358D2 = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentFocus();
                                z59 = false;
                                c28655q4.m87173q(false);
                            } else {
                                z59 = false;
                                if (z39) {
                                    c28655q4.m87150e0(1164653037);
                                    jM53358D2 = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentPositiveTrend();
                                    z59 = false;
                                    c28655q4.m87173q(false);
                                } else {
                                    c28655q4.m87150e0(1164655521);
                                    jM53358D2 = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q4, C38072d.f163054b, false);
                                }
                                c28655q4.m87173q(z59);
                            }
                            c28655q4.m87173q(z59);
                        } else {
                            error = error;
                            c28655q4.m87150e0(1744655914);
                            if (AbstractC8693b.m21270d(textFieldConfig.getFieldState().getError())) {
                                c28655q4.m87150e0(1164660613);
                                jM53358D2 = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentAlert();
                                z48 = false;
                                c28655q4.m87173q(false);
                            } else {
                                z48 = false;
                                c28655q4.m87150e0(1164661729);
                                jM53358D2 = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q4, C38072d.f163054b, false);
                            }
                            c28655q4.m87173q(z48);
                        }
                        long j14 = jM53358D2;
                        if (z37) {
                            c28655q4.m87150e0(1744886151);
                            if (AbstractC8693b.m21270d(textFieldConfig.getFieldState().getError())) {
                                c28655q4.m87150e0(1164669029);
                                jM95628d = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentFocus();
                                z49 = false;
                                c28655q4.m87173q(false);
                            } else {
                                z49 = false;
                                if (z39) {
                                    c28655q4.m87150e0(1164671757);
                                    jM95628d = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentPositiveTrend();
                                    c28655q4.m87173q(false);
                                } else {
                                    c28655q4.m87150e0(1164674241);
                                    jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q4, C38072d.f163054b, false);
                                }
                            }
                            c28655q4.m87173q(z49);
                        } else {
                            c28655q4.m87150e0(1745236234);
                            if (AbstractC8693b.m21270d(textFieldConfig.getFieldState().getError())) {
                                c28655q4.m87150e0(1164679333);
                                jM95628d = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentAlert();
                                z49 = false;
                                c28655q4.m87173q(false);
                            } else {
                                z49 = false;
                                c28655q4.m87150e0(1164680449);
                                jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q4, C38072d.f163054b, false);
                            }
                            c28655q4.m87173q(z49);
                        }
                        long j15 = jM95628d;
                        if (z37) {
                            c28655q4.m87150e0(1745454195);
                            jM125380b = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentFocus();
                            c28655q4.m87173q(z49);
                        } else {
                            c28655q4.m87150e0(1745544467);
                            jM125380b = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentAlert();
                            c28655q4.m87173q(z49);
                        }
                        long j16 = jM125380b;
                        if (z37) {
                            c28655q4.m87150e0(1745688307);
                            jM125380b2 = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentFocus();
                            c28655q4.m87173q(z49);
                        } else {
                            c28655q4.m87150e0(1745778579);
                            jM125380b2 = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentAlert();
                            c28655q4.m87173q(z49);
                        }
                        long j17 = jM125380b2;
                        if (z38 || zIsLocked2) {
                            z52 = false;
                        } else {
                            z52 = true;
                        }
                        interfaceC15237i2 = interfaceC15237i;
                        zM87157i2 = c28655q4.m87157i(interfaceC15237i2);
                        boolean z64 = z52;
                        objM87133R10 = c28655q4.m87133R();
                        if (zM87157i2 || objM87133R10 == c28676v2) {
                            objM87133R10 = new C2564l1(interfaceC15237i2, 2);
                            c28655q4.m87172p0(objM87133R10);
                        }
                        Function1 function7 = (Function1) objM87133R10;
                        zM87157i3 = c28655q4.m87157i(interfaceC15237i2);
                        objM87133R11 = c28655q4.m87133R();
                        if (zM87157i3 || objM87133R11 == c28676v2) {
                            objM87133R11 = new C2564l1(interfaceC15237i2, 3);
                            c28655q4.m87172p0(objM87133R11);
                        }
                        C34348q0 c34348q0 = new C34348q0(function7, (Function1) objM87133R11, null, null, 58);
                        TextResource textResource = error;
                        int iM134191getImeActioneUduSuo = textFieldConfig.m134191getImeActioneUduSuo();
                        float f18 = f14;
                        Modifier modifierM3395q = AbstractC1099a.m3395q(c2314t2, f18, ((float) 0.5d) * f13);
                        interfaceC15237i = interfaceC15237i2;
                        if ((i18 & 3670016) == 1048576) {
                            z54 = true;
                        } else {
                            z54 = false;
                        }
                        zM87157i4 = z54 | c28655q4.m87157i(textFieldConfig);
                        objM87133R12 = c28655q4.m87133R();
                        if (zM87157i4 || objM87133R12 == c28676v2) {
                            objM87133R12 = new C3169c(29, onFieldUpdate, textFieldConfig);
                            c28655q4.m87172p0(objM87133R12);
                        }
                        Function1 function8 = (Function1) objM87133R12;
                        boolean zM87155h2 = c28655q4.m87155h(z37);
                        z55 = z37;
                        if ((i18 & 234881024) == 67108864) {
                            z56 = true;
                        } else {
                            z56 = false;
                        }
                        boolean z65 = zM87155h2 | z56;
                        if ((i18 & 29360128) == 8388608) {
                            z57 = true;
                        } else {
                            z57 = false;
                        }
                        zM87157i5 = z65 | z57 | c28655q4.m87157i(textFieldConfig);
                        objM87133R13 = c28655q4.m87133R();
                        if (!zM87157i5 || objM87133R13 == c28676v2) {
                            Function1 function9 = function5;
                            InterfaceC4339a interfaceC4339a10 = interfaceC4339a7;
                            objM87133R13 = new C4614e(z55, interfaceC4339a10, function9, textFieldConfig, 2);
                            interfaceC4339a9 = interfaceC4339a10;
                            function6 = function9;
                            c28655q4.m87172p0(objM87133R13);
                        } else {
                            function6 = function5;
                            interfaceC4339a9 = interfaceC4339a7;
                        }
                        Function1 function10 = (Function1) objM87133R13;
                        int i37 = TextResource.$stable;
                        Function1 function11 = function6;
                        c28655q3 = c28655q4;
                        c2314t4 = c2314t2;
                        EditProfileTextFieldKt.m134184EditProfileTextFieldiQW2vr8(textResourceM21278l, textResourceM21278l2, function8, modifierM3395q, lowerCase, textResource, z47, z44, textResourceM21267a2, j7, z39, z45, interfaceC39332e, j13, j14, j15, j16, j17, z64, iM134192getKeyboardTypePjHm6EE, null, null, null, c34348q0, iM134191getImeActioneUduSuo, false, function10, c28655q3, (i37 << 24) | i37 | 3072 | (i37 << 3) | (i37 << 15), 0, 0, 40894464);
                        if (i19 < list.size() - 1) {
                            c28655q3.m87150e0(1747155785);
                            z58 = false;
                            AbstractC25012a.m73388u(1, f13, c2314t4, c28655q3, false);
                        } else {
                            z58 = false;
                            c28655q3.m87150e0(1747247080);
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(z58);
                        c2314t2 = c2314t4;
                        interfaceC4339a7 = interfaceC4339a9;
                        c28655q4 = c28655q3;
                        function5 = function11;
                        i19 = i26;
                        i18 = i18;
                        f14 = f18;
                        c28676v1 = c28676v2;
                        it = it3;
                    }
                    i24 = i18;
                    f15 = f14;
                    c2314t3 = c2314t2;
                    interfaceC4339a8 = interfaceC4339a7;
                    C28676v0 c28676v3 = c28676v1;
                    c28655q2 = c28655q4;
                    Function1 function12 = function5;
                    AbstractC18489d0.m53356B(c28655q2, false, c2314t3, f15, c28655q2);
                    TextResource textResourceM21278l3 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, C9691R.string.profile_edit_birthday_label));
                    if (formState.getBirthday().getValue().length() > 0) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    if (z24) {
                        textResourceM21267a = new TextResource.C8691e(BirthdayUtils.INSTANCE.formatForDisplay(formState.getBirthday().getValue()));
                    } else {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    boolean z66 = !viewState.getEditableFields().getBirthday().isLocked();
                    Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t3, f15, 0.0f, 2);
                    int i38 = TextResource.$stable;
                    InterfaceC4339a interfaceC4339a11 = interfaceC4339a6;
                    AbstractC30783b.m94649b(textResourceM21278l3, textResourceM21267a, interfaceC4339a11, modifierM3396r, "birthday", null, false, z66, 0.0f, 0L, null, c28655q2, i38 | 27648 | (i38 << 3) | ((i24 >> 21) & 896), 0, 1888);
                    c28655q2.m87150e0(-116927849);
                    for (ClickableFieldConfig clickableFieldConfig : list2) {
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f15, c2314t3));
                        i25 = WhenMappings.$EnumSwitchMapping$1[clickableFieldConfig.getType().ordinal()];
                        float f19 = f13;
                        if (i25 != 1) {
                            zIsLocked = viewState.getEditableFields().getCountry().isLocked();
                        } else if (i25 != 2) {
                            zIsLocked = viewState.getEditableFields().getState().isLocked();
                        } else if (i25 != 3) {
                            zIsLocked = viewState.getEditableFields().getGender().isLocked();
                        } else if (i25 != 4) {
                            zIsLocked = false;
                        } else {
                            zIsLocked = viewState.getEditableFields().getPhysiologicalBaseline().isLocked();
                        }
                        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, clickableFieldConfig.getLabelRes()));
                        TextResource value = clickableFieldConfig.getValue();
                        boolean z67 = zIsLocked;
                        InterfaceC4339a interfaceC4339a12 = interfaceC4339a8;
                        String lowerCase2 = clickableFieldConfig.getType().name().toLowerCase(Locale.ROOT);
                        AbstractC22676k.m65749i(lowerCase2, "toLowerCase(...)");
                        boolean zIsError = clickableFieldConfig.isError();
                        TextResource errorMessage = clickableFieldConfig.getErrorMessage();
                        boolean z68 = !z67;
                        Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t3, f15, 0.0f, 2);
                        if (i17 == 131072) {
                            z36 = true;
                        } else {
                            z36 = false;
                        }
                        zM87157i = z36 | c28655q2.m87157i(clickableFieldConfig);
                        objM87133R8 = c28655q2.m87133R();
                        if (zM87157i || objM87133R8 == c28676v3) {
                            objM87133R8 = new C3603v(20, onOpenBottomSheet, clickableFieldConfig);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        int i39 = TextResource.$stable;
                        AbstractC30783b.m94649b(textResourceM21278l4, value, (InterfaceC4339a) objM87133R8, modifierM3396r2, lowerCase2, errorMessage, zIsError, z68, 0.0f, 0L, null, c28655q2, i39 | 3072 | (i39 << 3) | (i39 << 15), 0, 1792);
                        f13 = f19;
                        interfaceC4339a8 = interfaceC4339a12;
                    }
                    float f24 = f13;
                    InterfaceC4339a interfaceC4339a13 = interfaceC4339a8;
                    c28655q2.m87173q(false);
                    if (heightWeightGroupedField == null) {
                        c28655q2.m87150e0(671504273);
                        c28655q2.m87173q(false);
                    } else {
                        AbstractC33745d.m106667z(c28655q2, 671504274, c2314t3, f15, c28655q2);
                        if (!viewState.getEditableFields().getHeight().isLocked() || viewState.getEditableFields().getWeight().isLocked()) {
                            z25 = false;
                        } else {
                            z25 = true;
                        }
                        Modifier modifierM3396r3 = AbstractC1099a.m3396r(c2314t3, f15, 0.0f, 2);
                        if (i17 == 131072) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        objM87133R5 = c28655q2.m87133R();
                        if (z26 || objM87133R5 == c28676v3) {
                            objM87133R5 = new C9788l(2, onOpenBottomSheet);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        InterfaceC4351m interfaceC4351m = (InterfaceC4351m) objM87133R5;
                        boolean zM87157i6 = c28655q2.m87157i(logger);
                        if ((i24 & 3670016) == 1048576) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        z28 = zM87157i6 | z27;
                        objM87133R6 = c28655q2.m87133R();
                        if (z28 || objM87133R6 == c28676v3) {
                            objM87133R6 = new C3169c(28, logger, onFieldUpdate);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField(modifierM3396r3, heightWeightGroupedField, interfaceC4351m, (Function1) objM87133R6, z25, c28655q2, 6, 0);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    Modifier modifierM3395q2 = AbstractC1099a.m3395q(AbstractC1092a.m3358c(AbstractC1102d.m3409f(1.0f, c2314t3), C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a), f17, 4 * f24);
                    z29 = false;
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3395q2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m3);
                    c0209i2 = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N3);
                    TextResource textResourceM21278l5 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, C9691R.string.profile_edit_save_button));
                    boolean zIsSaveButtonEnabled = EditProfileFormUtils.INSTANCE.isSaveButtonEnabled(formState, viewState.getEditableFields(), showUsernameField, viewState.getUsernameValidationState());
                    Modifier modifierM44101d = AbstractC15676d.m44101d(AbstractC1102d.m3409f(1.0f, c2314t3), "edit_profile_save_button");
                    if ((i24 & 57344) == 16384) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    if (i16 != 256 || ((i24 & 512) != 0 && c28655q2.m87157i(formState))) {
                        z29 = true;
                    }
                    z35 = z34 | z29;
                    objM87133R7 = c28655q2.m87133R();
                    if (!z35 || objM87133R7 == c28676v3) {
                        function3 = onEvent;
                        objM87133R7 = new C3603v(21, function3, formState);
                        c28655q2.m87172p0(objM87133R7);
                    } else {
                        function3 = onEvent;
                    }
                    AbstractC27292z.m82343j(modifierM44101d, zIsSaveButtonEnabled, false, null, null, null, textResourceM21278l5, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R7, c28655q2, TextResource.$stable << 18, 0, 8124);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    c28655q = c28655q2;
                    interfaceC4339a3 = interfaceC4339a11;
                    interfaceC4339a4 = interfaceC4339a13;
                    modifier2 = modifier4;
                    function4 = function12;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                C0209i c0209i6 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i6, modifierM118962N);
                if (1.0f > 0.0d) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (!z18) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                f13 = 8;
                float f110 = 2 * f13;
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC30060g.m92116f0(new LayoutWeightElement(1.0f, true), AbstractC30060g.m92099U(0, c28655q4, 1), 14), 0.0f, 0.0f, 0.0f, f110, 7);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q4, 0);
                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q4.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q4, modifierM3398t2);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i3, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q4, c0209i4, interfaceC28653p1M87165m4);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i6, modifierM118962N4);
                EditProfileViewState.EditProfileData profileData2 = viewState.getProfileData();
                i17 = i36 & 458752;
                if (i17 == 131072) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objM87133R4 = c28655q4.m87133R();
                if (z19) {
                    objM87133R4 = new C0111j(onOpenBottomSheet, 20);
                    c28655q4.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C0111j(onOpenBottomSheet, 20);
                    c28655q4.m87172p0(objM87133R4);
                }
                c2314t2 = c2314t;
                f14 = f110;
                interfaceC15237i = interfaceC15237i3;
                c28676v1 = c28676v0;
                i18 = i36;
                EditProfileAvatarSectionKt.EditProfileAvatarSection(profileData2, onEvent, (InterfaceC4339a) objM87133R4, AbstractC1099a.m3398t(c2314t, 0.0f, f110, 0.0f, 0.0f, 13), c28655q4, ((i36 >> 9) & 112) | 3072, 0);
                float f111 = ((float) 2.5d) * f13;
                AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3411h(f111, c2314t2));
                c28655q4.m87150e0(-117163495);
                it = list.iterator();
                i19 = 0;
                while (it.hasNext()) {
                    next = it.next();
                    i26 = i19 + 1;
                    if (i19 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    textFieldConfig = (TextFieldConfig) next;
                    Iterator it4 = it;
                    c28655q4.m87144b0(1164532513, textFieldConfig.getFieldType());
                    if (textFieldConfig.getFieldType() == EditProfileEvent.FieldType.USERNAME) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    i27 = WhenMappings.$EnumSwitchMapping$0[textFieldConfig.getFieldType().ordinal()];
                    if (i27 != 1) {
                        zIsLocked2 = viewState.getEditableFields().getFirstName().isLocked();
                    } else if (i27 != 2) {
                        zIsLocked2 = viewState.getEditableFields().getLastName().isLocked();
                    } else if (i27 != 3) {
                        zIsLocked2 = viewState.getEditableFields().getUsername().isLocked();
                    } else if (i27 != 4) {
                        zIsLocked2 = false;
                    } else {
                        zIsLocked2 = viewState.getEditableFields().getCity().isLocked();
                    }
                    if (z37) {
                        z38 = true;
                    } else {
                        z38 = true;
                    }
                    if (z37) {
                        zIsValidating = EditProfileFormUtils.INSTANCE.isUsernameFieldValidating(textFieldConfig.getFieldState().isValidating(), viewState.getUsernameValidationState().isValidating());
                    } else {
                        zIsValidating = textFieldConfig.getFieldState().isValidating();
                    }
                    if (!z37) {
                        z39 = false;
                    } else {
                        z39 = false;
                    }
                    if (!z37) {
                        z44 = false;
                    } else {
                        z44 = false;
                    }
                    if (z37) {
                        z45 = zIsValidating;
                        z46 = false;
                        if (z39) {
                            c28655q4.m87150e0(1742520510);
                            c28655q4.m87173q(false);
                            textResourceM21267a2 = viewState.getUsernameValidationState().getValidationSuccess();
                            if (textResourceM21267a2 == null) {
                                textResourceM21267a2 = AbstractC8693b.m21267a();
                            }
                        } else {
                            c28655q4.m87150e0(1164592365);
                            c28655q4.m87173q(false);
                            textResourceM21267a2 = AbstractC8693b.m21267a();
                        }
                    } else {
                        z45 = zIsValidating;
                        z46 = false;
                        if (z39) {
                            c28655q4.m87150e0(1742520510);
                            c28655q4.m87173q(false);
                            textResourceM21267a2 = viewState.getUsernameValidationState().getValidationSuccess();
                            if (textResourceM21267a2 == null) {
                                textResourceM21267a2 = AbstractC8693b.m21267a();
                            }
                        } else {
                            c28655q4.m87150e0(1164592365);
                            c28655q4.m87173q(false);
                            textResourceM21267a2 = AbstractC8693b.m21267a();
                        }
                    }
                    if (z39) {
                        c28655q4.m87150e0(1164596429);
                        jM53358D = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentPositiveTrend();
                        c28655q4.m87173q(false);
                    } else {
                        c28655q4.m87150e0(1164597793);
                        jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q4, C38072d.f163054b, z46);
                    }
                    long j18 = jM53358D;
                    TextResource textResourceM21278l6 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q4, textFieldConfig.getLabelRes()));
                    TextResource textResourceM21278l7 = AbstractC8693b.m21278l(textFieldConfig.getFieldState().getValue());
                    int iM134192getKeyboardTypePjHm6EE2 = textFieldConfig.m134192getKeyboardTypePjHm6EE();
                    String lowerCase3 = textFieldConfig.getFieldType().name().toLowerCase(Locale.ROOT);
                    AbstractC22676k.m65749i(lowerCase3, "toLowerCase(...)");
                    zM21270d = AbstractC8693b.m21270d(textFieldConfig.getFieldState().getError());
                    error = textFieldConfig.getFieldState().getError();
                    if (z37) {
                        c28655q4.m87150e0(1743480022);
                        objM87133R14 = c28655q4.m87133R();
                        c28676v2 = c28676v1;
                        if (objM87133R14 == c28676v2) {
                            objM87133R14 = new Function1() { // from class: com.whoop.profile.view.edit.EditProfileFieldsContentKt$EditProfileFieldsContent$4$1$2$1$1
                                @Override // p715kotlin.jvm.functions.Function1
                                public /* synthetic */ Object invoke(Object obj) {
                                    return new C17919x(m134178invokevNxB06k((C39336i) obj));
                                }

                                /* JADX INFO: renamed from: invoke-vNxB06k, reason: not valid java name */
                                public final long m134178invokevNxB06k(C39336i whoopColor) {
                                    AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                                    return whoopColor.getAccentFocus();
                                }
                            };
                            c28655q4.m87172p0(objM87133R14);
                        }
                        interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R14);
                        c28655q4.m87173q(false);
                    } else {
                        c28676v2 = c28676v1;
                        c28655q4.m87150e0(1743567318);
                        objM87133R9 = c28655q4.m87133R();
                        if (objM87133R9 == c28676v2) {
                            objM87133R9 = new Function1() { // from class: com.whoop.profile.view.edit.EditProfileFieldsContentKt$EditProfileFieldsContent$4$1$2$2$1
                                @Override // p715kotlin.jvm.functions.Function1
                                public /* synthetic */ Object invoke(Object obj) {
                                    return new C17919x(m134179invokevNxB06k((C39336i) obj));
                                }

                                /* JADX INFO: renamed from: invoke-vNxB06k, reason: not valid java name */
                                public final long m134179invokevNxB06k(C39336i whoopColor) {
                                    AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                                    return whoopColor.getAccentAlert();
                                }
                            };
                            c28655q4.m87172p0(objM87133R9);
                        }
                        interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R9);
                        c28655q4.m87173q(false);
                    }
                    InterfaceC39332e interfaceC39332e2 = interfaceC39332eM125323a;
                    if (z37) {
                        c28655q4.m87150e0(1743716707);
                        if (AbstractC8693b.m21270d(textFieldConfig.getFieldState().getError())) {
                            c28655q4.m87150e0(1164631303);
                            z47 = zM21270d;
                            jM125416r = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentFocus15();
                            z60 = false;
                            c28655q4.m87173q(false);
                        } else {
                            z47 = zM21270d;
                            if (z39) {
                                c28655q4.m87150e0(1164634095);
                                jM125416r = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentPositiveTrend15();
                                z60 = false;
                                c28655q4.m87173q(false);
                            } else {
                                c28655q4.m87150e0(1164636641);
                                jM125416r = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBlack30();
                                z60 = false;
                                c28655q4.m87173q(false);
                            }
                        }
                        c28655q4.m87173q(z60);
                    } else {
                        z47 = zM21270d;
                        c28655q4.m87150e0(1744070851);
                        if (AbstractC8693b.m21270d(textFieldConfig.getFieldState().getError())) {
                            c28655q4.m87150e0(1164641740);
                            jM125416r = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentAlertTrend15();
                        } else {
                            c28655q4.m87150e0(1164643073);
                            jM125416r = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBlack30();
                        }
                        c28655q4.m87173q(false);
                        c28655q4.m87173q(false);
                    }
                    long j19 = jM125416r;
                    if (z37) {
                        c28655q4.m87150e0(1744305831);
                        if (AbstractC8693b.m21270d(textFieldConfig.getFieldState().getError())) {
                            c28655q4.m87150e0(1164650309);
                            jM53358D2 = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentFocus();
                            z59 = false;
                            c28655q4.m87173q(false);
                        } else {
                            z59 = false;
                            if (z39) {
                                c28655q4.m87150e0(1164653037);
                                jM53358D2 = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentPositiveTrend();
                                z59 = false;
                                c28655q4.m87173q(false);
                            } else {
                                c28655q4.m87150e0(1164655521);
                                jM53358D2 = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q4, C38072d.f163054b, false);
                            }
                            c28655q4.m87173q(z59);
                        }
                        c28655q4.m87173q(z59);
                    } else {
                        error = error;
                        c28655q4.m87150e0(1744655914);
                        if (AbstractC8693b.m21270d(textFieldConfig.getFieldState().getError())) {
                            c28655q4.m87150e0(1164660613);
                            jM53358D2 = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentAlert();
                            z48 = false;
                            c28655q4.m87173q(false);
                        } else {
                            z48 = false;
                            c28655q4.m87150e0(1164661729);
                            jM53358D2 = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q4, C38072d.f163054b, false);
                        }
                        c28655q4.m87173q(z48);
                    }
                    long j110 = jM53358D2;
                    if (z37) {
                        c28655q4.m87150e0(1744886151);
                        if (AbstractC8693b.m21270d(textFieldConfig.getFieldState().getError())) {
                            c28655q4.m87150e0(1164669029);
                            jM95628d = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentFocus();
                            z49 = false;
                            c28655q4.m87173q(false);
                        } else {
                            z49 = false;
                            if (z39) {
                                c28655q4.m87150e0(1164671757);
                                jM95628d = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentPositiveTrend();
                                c28655q4.m87173q(false);
                            } else {
                                c28655q4.m87150e0(1164674241);
                                jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q4, C38072d.f163054b, false);
                            }
                        }
                        c28655q4.m87173q(z49);
                    } else {
                        c28655q4.m87150e0(1745236234);
                        if (AbstractC8693b.m21270d(textFieldConfig.getFieldState().getError())) {
                            c28655q4.m87150e0(1164679333);
                            jM95628d = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentAlert();
                            z49 = false;
                            c28655q4.m87173q(false);
                        } else {
                            z49 = false;
                            c28655q4.m87150e0(1164680449);
                            jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q4, C38072d.f163054b, false);
                        }
                        c28655q4.m87173q(z49);
                    }
                    long j111 = jM95628d;
                    if (z37) {
                        c28655q4.m87150e0(1745454195);
                        jM125380b = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentFocus();
                        c28655q4.m87173q(z49);
                    } else {
                        c28655q4.m87150e0(1745544467);
                        jM125380b = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentAlert();
                        c28655q4.m87173q(z49);
                    }
                    long j112 = jM125380b;
                    if (z37) {
                        c28655q4.m87150e0(1745688307);
                        jM125380b2 = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentFocus();
                        c28655q4.m87173q(z49);
                    } else {
                        c28655q4.m87150e0(1745778579);
                        jM125380b2 = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentAlert();
                        c28655q4.m87173q(z49);
                    }
                    long j113 = jM125380b2;
                    if (z38) {
                        z52 = false;
                    } else {
                        z52 = false;
                    }
                    interfaceC15237i2 = interfaceC15237i;
                    zM87157i2 = c28655q4.m87157i(interfaceC15237i2);
                    boolean z69 = z52;
                    objM87133R10 = c28655q4.m87133R();
                    if (zM87157i2) {
                        objM87133R10 = new C2564l1(interfaceC15237i2, 2);
                        c28655q4.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C2564l1(interfaceC15237i2, 2);
                        c28655q4.m87172p0(objM87133R10);
                    }
                    Function1 function13 = (Function1) objM87133R10;
                    zM87157i3 = c28655q4.m87157i(interfaceC15237i2);
                    objM87133R11 = c28655q4.m87133R();
                    if (zM87157i3) {
                        objM87133R11 = new C2564l1(interfaceC15237i2, 3);
                        c28655q4.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C2564l1(interfaceC15237i2, 3);
                        c28655q4.m87172p0(objM87133R11);
                    }
                    C34348q0 c34348q1 = new C34348q0(function13, (Function1) objM87133R11, null, null, 58);
                    TextResource textResource2 = error;
                    int iM134191getImeActioneUduSuo2 = textFieldConfig.m134191getImeActioneUduSuo();
                    float f112 = f14;
                    Modifier modifierM3395q3 = AbstractC1099a.m3395q(c2314t2, f112, ((float) 0.5d) * f13);
                    interfaceC15237i = interfaceC15237i2;
                    if ((i18 & 3670016) == 1048576) {
                        z54 = true;
                    } else {
                        z54 = false;
                    }
                    zM87157i4 = z54 | c28655q4.m87157i(textFieldConfig);
                    objM87133R12 = c28655q4.m87133R();
                    if (zM87157i4) {
                        objM87133R12 = new C3169c(29, onFieldUpdate, textFieldConfig);
                        c28655q4.m87172p0(objM87133R12);
                    } else {
                        objM87133R12 = new C3169c(29, onFieldUpdate, textFieldConfig);
                        c28655q4.m87172p0(objM87133R12);
                    }
                    Function1 function14 = (Function1) objM87133R12;
                    boolean zM87155h3 = c28655q4.m87155h(z37);
                    z55 = z37;
                    if ((i18 & 234881024) == 67108864) {
                        z56 = true;
                    } else {
                        z56 = false;
                    }
                    boolean z610 = zM87155h3 | z56;
                    if ((i18 & 29360128) == 8388608) {
                        z57 = true;
                    } else {
                        z57 = false;
                    }
                    zM87157i5 = z610 | z57 | c28655q4.m87157i(textFieldConfig);
                    objM87133R13 = c28655q4.m87133R();
                    if (zM87157i5) {
                        Function1 function15 = function5;
                        InterfaceC4339a interfaceC4339a14 = interfaceC4339a7;
                        objM87133R13 = new C4614e(z55, interfaceC4339a14, function15, textFieldConfig, 2);
                        interfaceC4339a9 = interfaceC4339a14;
                        function6 = function15;
                        c28655q4.m87172p0(objM87133R13);
                    } else {
                        Function1 function16 = function5;
                        InterfaceC4339a interfaceC4339a15 = interfaceC4339a7;
                        objM87133R13 = new C4614e(z55, interfaceC4339a15, function16, textFieldConfig, 2);
                        interfaceC4339a9 = interfaceC4339a15;
                        function6 = function16;
                        c28655q4.m87172p0(objM87133R13);
                    }
                    Function1 function17 = (Function1) objM87133R13;
                    int i310 = TextResource.$stable;
                    Function1 function18 = function6;
                    c28655q3 = c28655q4;
                    c2314t4 = c2314t2;
                    EditProfileTextFieldKt.m134184EditProfileTextFieldiQW2vr8(textResourceM21278l6, textResourceM21278l7, function14, modifierM3395q3, lowerCase3, textResource2, z47, z44, textResourceM21267a2, j18, z39, z45, interfaceC39332e2, j19, j110, j111, j112, j113, z69, iM134192getKeyboardTypePjHm6EE2, null, null, null, c34348q1, iM134191getImeActioneUduSuo2, false, function17, c28655q3, (i310 << 24) | i310 | 3072 | (i310 << 3) | (i310 << 15), 0, 0, 40894464);
                    if (i19 < list.size() - 1) {
                        c28655q3.m87150e0(1747155785);
                        z58 = false;
                        AbstractC25012a.m73388u(1, f13, c2314t4, c28655q3, false);
                    } else {
                        z58 = false;
                        c28655q3.m87150e0(1747247080);
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(z58);
                    c2314t2 = c2314t4;
                    interfaceC4339a7 = interfaceC4339a9;
                    c28655q4 = c28655q3;
                    function5 = function18;
                    i19 = i26;
                    i18 = i18;
                    f14 = f112;
                    c28676v1 = c28676v2;
                    it = it4;
                }
                i24 = i18;
                f15 = f14;
                c2314t3 = c2314t2;
                interfaceC4339a8 = interfaceC4339a7;
                C28676v0 c28676v4 = c28676v1;
                c28655q2 = c28655q4;
                Function1 function19 = function5;
                AbstractC18489d0.m53356B(c28655q2, false, c2314t3, f15, c28655q2);
                TextResource textResourceM21278l8 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, C9691R.string.profile_edit_birthday_label));
                if (formState.getBirthday().getValue().length() > 0) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                if (z24) {
                    textResourceM21267a = new TextResource.C8691e(BirthdayUtils.INSTANCE.formatForDisplay(formState.getBirthday().getValue()));
                } else {
                    textResourceM21267a = AbstractC8693b.m21267a();
                }
                boolean z611 = !viewState.getEditableFields().getBirthday().isLocked();
                Modifier modifierM3396r4 = AbstractC1099a.m3396r(c2314t3, f15, 0.0f, 2);
                int i311 = TextResource.$stable;
                InterfaceC4339a interfaceC4339a16 = interfaceC4339a6;
                AbstractC30783b.m94649b(textResourceM21278l8, textResourceM21267a, interfaceC4339a16, modifierM3396r4, "birthday", null, false, z611, 0.0f, 0L, null, c28655q2, i311 | 27648 | (i311 << 3) | ((i24 >> 21) & 896), 0, 1888);
                c28655q2.m87150e0(-116927849);
                while (r13.hasNext()) {
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f15, c2314t3));
                    i25 = WhenMappings.$EnumSwitchMapping$1[clickableFieldConfig.getType().ordinal()];
                    float f113 = f13;
                    if (i25 != 1) {
                        zIsLocked = viewState.getEditableFields().getCountry().isLocked();
                    } else if (i25 != 2) {
                        zIsLocked = viewState.getEditableFields().getState().isLocked();
                    } else if (i25 != 3) {
                        zIsLocked = viewState.getEditableFields().getGender().isLocked();
                    } else if (i25 != 4) {
                        zIsLocked = false;
                    } else {
                        zIsLocked = viewState.getEditableFields().getPhysiologicalBaseline().isLocked();
                    }
                    TextResource textResourceM21278l9 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, clickableFieldConfig.getLabelRes()));
                    TextResource value2 = clickableFieldConfig.getValue();
                    boolean z612 = zIsLocked;
                    InterfaceC4339a interfaceC4339a17 = interfaceC4339a8;
                    String lowerCase4 = clickableFieldConfig.getType().name().toLowerCase(Locale.ROOT);
                    AbstractC22676k.m65749i(lowerCase4, "toLowerCase(...)");
                    boolean zIsError2 = clickableFieldConfig.isError();
                    TextResource errorMessage2 = clickableFieldConfig.getErrorMessage();
                    boolean z613 = !z612;
                    Modifier modifierM3396r5 = AbstractC1099a.m3396r(c2314t3, f15, 0.0f, 2);
                    if (i17 == 131072) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    zM87157i = z36 | c28655q2.m87157i(clickableFieldConfig);
                    objM87133R8 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R8 = new C3603v(20, onOpenBottomSheet, clickableFieldConfig);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C3603v(20, onOpenBottomSheet, clickableFieldConfig);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    int i312 = TextResource.$stable;
                    AbstractC30783b.m94649b(textResourceM21278l9, value2, (InterfaceC4339a) objM87133R8, modifierM3396r5, lowerCase4, errorMessage2, zIsError2, z613, 0.0f, 0L, null, c28655q2, i312 | 3072 | (i312 << 3) | (i312 << 15), 0, 1792);
                    f13 = f113;
                    interfaceC4339a8 = interfaceC4339a17;
                }
                float f25 = f13;
                InterfaceC4339a interfaceC4339a18 = interfaceC4339a8;
                c28655q2.m87173q(false);
                if (heightWeightGroupedField == null) {
                    c28655q2.m87150e0(671504273);
                    c28655q2.m87173q(false);
                } else {
                    AbstractC33745d.m106667z(c28655q2, 671504274, c2314t3, f15, c28655q2);
                    if (viewState.getEditableFields().getHeight().isLocked()) {
                        z25 = false;
                    } else {
                        z25 = false;
                    }
                    Modifier modifierM3396r6 = AbstractC1099a.m3396r(c2314t3, f15, 0.0f, 2);
                    if (i17 == 131072) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    objM87133R5 = c28655q2.m87133R();
                    if (z26) {
                        objM87133R5 = new C9788l(2, onOpenBottomSheet);
                        c28655q2.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C9788l(2, onOpenBottomSheet);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    InterfaceC4351m interfaceC4351m2 = (InterfaceC4351m) objM87133R5;
                    boolean zM87157i7 = c28655q2.m87157i(logger);
                    if ((i24 & 3670016) == 1048576) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    z28 = zM87157i7 | z27;
                    objM87133R6 = c28655q2.m87133R();
                    if (z28) {
                        objM87133R6 = new C3169c(28, logger, onFieldUpdate);
                        c28655q2.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C3169c(28, logger, onFieldUpdate);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField(modifierM3396r6, heightWeightGroupedField, interfaceC4351m2, (Function1) objM87133R6, z25, c28655q2, 6, 0);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(true);
                Modifier modifierM3395q4 = AbstractC1099a.m3395q(AbstractC1092a.m3358c(AbstractC1102d.m3409f(1.0f, c2314t3), C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a), f111, 4 * f25);
                z29 = false;
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3395q4);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j2);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m5);
                c0209i2 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N5);
                TextResource textResourceM21278l10 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, C9691R.string.profile_edit_save_button));
                boolean zIsSaveButtonEnabled2 = EditProfileFormUtils.INSTANCE.isSaveButtonEnabled(formState, viewState.getEditableFields(), showUsernameField, viewState.getUsernameValidationState());
                Modifier modifierM44101d2 = AbstractC15676d.m44101d(AbstractC1102d.m3409f(1.0f, c2314t3), "edit_profile_save_button");
                if ((i24 & 57344) == 16384) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                if (i16 != 256) {
                    z29 = true;
                } else {
                    z29 = true;
                }
                z35 = z34 | z29;
                objM87133R7 = c28655q2.m87133R();
                if (z35) {
                    function3 = onEvent;
                    objM87133R7 = new C3603v(21, function3, formState);
                    c28655q2.m87172p0(objM87133R7);
                } else {
                    function3 = onEvent;
                    objM87133R7 = new C3603v(21, function3, formState);
                    c28655q2.m87172p0(objM87133R7);
                }
                AbstractC27292z.m82343j(modifierM44101d2, zIsSaveButtonEnabled2, false, null, null, null, textResourceM21278l10, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R7, c28655q2, TextResource.$stable << 18, 0, 8124);
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                c28655q = c28655q2;
                interfaceC4339a3 = interfaceC4339a16;
                interfaceC4339a4 = interfaceC4339a18;
                modifier2 = modifier4;
                function4 = function19;
            } else {
                function3 = onEvent;
                c28655q4.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
                c28655q = c28655q4;
                function4 = function2;
                interfaceC4339a4 = interfaceC4339a;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3440f1(modifier2, viewState, formState, logger, function3, onOpenBottomSheet, onFieldUpdate, function4, interfaceC4339a4, interfaceC4339a3, i13, i14, 2);
            }
        }
        i15 |= 805306368;
        if ((i15 & 306783379) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q4.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i28 != 0) {
                modifier3 = c2314t;
            } else {
                modifier3 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i29 != 0) {
                objM87133R17 = c28655q4.m87133R();
                if (objM87133R17 == c28676v0) {
                    objM87133R17 = new C6498i(26);
                    c28655q4.m87172p0(objM87133R17);
                }
                function2 = (Function1) objM87133R17;
            }
            if (i34 != 0) {
                objM87133R16 = c28655q4.m87133R();
                if (objM87133R16 == c28676v0) {
                    objM87133R16 = new C8527a(14);
                    c28655q4.m87172p0(objM87133R16);
                }
                interfaceC4339a5 = (InterfaceC4339a) objM87133R16;
            } else {
                interfaceC4339a5 = interfaceC4339a;
            }
            if (i35 != 0) {
                objM87133R15 = c28655q4.m87133R();
                if (objM87133R15 == c28676v0) {
                    objM87133R15 = new C8527a(15);
                    c28655q4.m87172p0(objM87133R15);
                }
                interfaceC4339a6 = (InterfaceC4339a) objM87133R15;
            } else {
                interfaceC4339a6 = interfaceC4339a2;
            }
            InterfaceC15237i interfaceC15237i4 = (InterfaceC15237i) c28655q4.m87161k(AbstractC2453v1.f9570i);
            showUsernameField = viewState.getShowUsernameField();
            i16 = i15 & 896;
            if (i16 != 256) {
                z13 = true;
            } else {
                z13 = true;
            }
            zM87155h = z13 | c28655q4.m87155h(showUsernameField);
            objM87133R = c28655q4.m87133R();
            if (zM87155h) {
                objM87133R = TextFieldConfigKt.createTextFieldConfigs(formState, showUsernameField);
                c28655q4.m87172p0(objM87133R);
            } else {
                objM87133R = TextFieldConfigKt.createTextFieldConfigs(formState, showUsernameField);
                c28655q4.m87172p0(objM87133R);
            }
            list = (List) objM87133R;
            boolean zM87153g3 = c28655q4.m87153g(viewState.getProfileData());
            if (i16 != 256) {
                z14 = true;
            } else {
                z14 = true;
            }
            z15 = zM87153g3 | z14;
            objM87133R2 = c28655q4.m87133R();
            if (z15) {
                objM87133R2 = ClickableFieldConfigKt.createClickableFieldConfigs(viewState.getProfileData(), formState);
                c28655q4.m87172p0(objM87133R2);
            } else {
                objM87133R2 = ClickableFieldConfigKt.createClickableFieldConfigs(viewState.getProfileData(), formState);
                c28655q4.m87172p0(objM87133R2);
            }
            List<ClickableFieldConfig> list3 = (List) objM87133R2;
            boolean zM87153g4 = c28655q4.m87153g(viewState.getProfileData());
            if (i16 != 256) {
                z16 = true;
            } else {
                z16 = true;
            }
            z17 = zM87153g4 | z16;
            objM87133R3 = c28655q4.m87133R();
            if (z17) {
                objM87133R3 = ClickableFieldConfigKt.createHeightWeightGroupedField(viewState.getProfileData(), formState);
                c28655q4.m87172p0(objM87133R3);
            } else {
                objM87133R3 = ClickableFieldConfigKt.createHeightWeightGroupedField(viewState.getProfileData(), formState);
                c28655q4.m87172p0(objM87133R3);
            }
            heightWeightGroupedField = (HeightWeightGroupedField) objM87133R3;
            Modifier modifierM66720i2 = AbstractC22953f.m66720i(AbstractC1102d.m3407d(1.0f, modifier3));
            C22957g c22957g2 = AbstractC22977m.f90652c;
            Modifier modifier5 = modifier3;
            C2305k c2305k2 = C2299e.f9110M;
            int i313 = i15;
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q4, 0);
            iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q4.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q4, modifierM66720i2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            C0209i c0209i7 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q4, c0209i7, c23010xM66775a4);
            C0209i c0209i8 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q4, c0209i8, interfaceC28653p1M87165m6);
            c0209i = C0217k.f732j;
            function5 = function2;
            if (c28655q4.f115903S) {
                interfaceC4339a7 = interfaceC4339a5;
                if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i9 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i9, modifierM118962N6);
                if (1.0f > 0.0d) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (!z18) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                f13 = 8;
                float f114 = 2 * f13;
                Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC30060g.m92116f0(new LayoutWeightElement(1.0f, true), AbstractC30060g.m92099U(0, c28655q4, 1), 14), 0.0f, 0.0f, 0.0f, f114, 7);
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q4, 0);
                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q4.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q4, modifierM3398t3);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i7, c23010xM66775a5);
                AbstractC28683x.m87239G(c28655q4, c0209i8, interfaceC28653p1M87165m7);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i9, modifierM118962N7);
                EditProfileViewState.EditProfileData profileData3 = viewState.getProfileData();
                i17 = i313 & 458752;
                if (i17 == 131072) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objM87133R4 = c28655q4.m87133R();
                if (z19) {
                    objM87133R4 = new C0111j(onOpenBottomSheet, 20);
                    c28655q4.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C0111j(onOpenBottomSheet, 20);
                    c28655q4.m87172p0(objM87133R4);
                }
                c2314t2 = c2314t;
                f14 = f114;
                interfaceC15237i = interfaceC15237i4;
                c28676v1 = c28676v0;
                i18 = i313;
                EditProfileAvatarSectionKt.EditProfileAvatarSection(profileData3, onEvent, (InterfaceC4339a) objM87133R4, AbstractC1099a.m3398t(c2314t, 0.0f, f114, 0.0f, 0.0f, 13), c28655q4, ((i313 >> 9) & 112) | 3072, 0);
                float f115 = ((float) 2.5d) * f13;
                AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3411h(f115, c2314t2));
                c28655q4.m87150e0(-117163495);
                it = list.iterator();
                i19 = 0;
                while (it.hasNext()) {
                    next = it.next();
                    i26 = i19 + 1;
                    if (i19 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    textFieldConfig = (TextFieldConfig) next;
                    Iterator it5 = it;
                    c28655q4.m87144b0(1164532513, textFieldConfig.getFieldType());
                    if (textFieldConfig.getFieldType() == EditProfileEvent.FieldType.USERNAME) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    i27 = WhenMappings.$EnumSwitchMapping$0[textFieldConfig.getFieldType().ordinal()];
                    if (i27 != 1) {
                        zIsLocked2 = viewState.getEditableFields().getFirstName().isLocked();
                    } else if (i27 != 2) {
                        zIsLocked2 = viewState.getEditableFields().getLastName().isLocked();
                    } else if (i27 != 3) {
                        zIsLocked2 = viewState.getEditableFields().getUsername().isLocked();
                    } else if (i27 != 4) {
                        zIsLocked2 = false;
                    } else {
                        zIsLocked2 = viewState.getEditableFields().getCity().isLocked();
                    }
                    if (z37) {
                        z38 = true;
                    } else {
                        z38 = true;
                    }
                    if (z37) {
                        zIsValidating = EditProfileFormUtils.INSTANCE.isUsernameFieldValidating(textFieldConfig.getFieldState().isValidating(), viewState.getUsernameValidationState().isValidating());
                    } else {
                        zIsValidating = textFieldConfig.getFieldState().isValidating();
                    }
                    if (!z37) {
                        z39 = false;
                    } else {
                        z39 = false;
                    }
                    if (!z37) {
                        z44 = false;
                    } else {
                        z44 = false;
                    }
                    if (z37) {
                        z45 = zIsValidating;
                        z46 = false;
                        if (z39) {
                            c28655q4.m87150e0(1742520510);
                            c28655q4.m87173q(false);
                            textResourceM21267a2 = viewState.getUsernameValidationState().getValidationSuccess();
                            if (textResourceM21267a2 == null) {
                                textResourceM21267a2 = AbstractC8693b.m21267a();
                            }
                        } else {
                            c28655q4.m87150e0(1164592365);
                            c28655q4.m87173q(false);
                            textResourceM21267a2 = AbstractC8693b.m21267a();
                        }
                    } else {
                        z45 = zIsValidating;
                        z46 = false;
                        if (z39) {
                            c28655q4.m87150e0(1742520510);
                            c28655q4.m87173q(false);
                            textResourceM21267a2 = viewState.getUsernameValidationState().getValidationSuccess();
                            if (textResourceM21267a2 == null) {
                                textResourceM21267a2 = AbstractC8693b.m21267a();
                            }
                        } else {
                            c28655q4.m87150e0(1164592365);
                            c28655q4.m87173q(false);
                            textResourceM21267a2 = AbstractC8693b.m21267a();
                        }
                    }
                    if (z39) {
                        c28655q4.m87150e0(1164596429);
                        jM53358D = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentPositiveTrend();
                        c28655q4.m87173q(false);
                    } else {
                        c28655q4.m87150e0(1164597793);
                        jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q4, C38072d.f163054b, z46);
                    }
                    long j114 = jM53358D;
                    TextResource textResourceM21278l11 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q4, textFieldConfig.getLabelRes()));
                    TextResource textResourceM21278l12 = AbstractC8693b.m21278l(textFieldConfig.getFieldState().getValue());
                    int iM134192getKeyboardTypePjHm6EE3 = textFieldConfig.m134192getKeyboardTypePjHm6EE();
                    String lowerCase5 = textFieldConfig.getFieldType().name().toLowerCase(Locale.ROOT);
                    AbstractC22676k.m65749i(lowerCase5, "toLowerCase(...)");
                    zM21270d = AbstractC8693b.m21270d(textFieldConfig.getFieldState().getError());
                    error = textFieldConfig.getFieldState().getError();
                    if (z37) {
                        c28655q4.m87150e0(1743480022);
                        objM87133R14 = c28655q4.m87133R();
                        c28676v2 = c28676v1;
                        if (objM87133R14 == c28676v2) {
                            objM87133R14 = new Function1() { // from class: com.whoop.profile.view.edit.EditProfileFieldsContentKt$EditProfileFieldsContent$4$1$2$1$1
                                @Override // p715kotlin.jvm.functions.Function1
                                public /* synthetic */ Object invoke(Object obj) {
                                    return new C17919x(m134178invokevNxB06k((C39336i) obj));
                                }

                                /* JADX INFO: renamed from: invoke-vNxB06k, reason: not valid java name */
                                public final long m134178invokevNxB06k(C39336i whoopColor) {
                                    AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                                    return whoopColor.getAccentFocus();
                                }
                            };
                            c28655q4.m87172p0(objM87133R14);
                        }
                        interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R14);
                        c28655q4.m87173q(false);
                    } else {
                        c28676v2 = c28676v1;
                        c28655q4.m87150e0(1743567318);
                        objM87133R9 = c28655q4.m87133R();
                        if (objM87133R9 == c28676v2) {
                            objM87133R9 = new Function1() { // from class: com.whoop.profile.view.edit.EditProfileFieldsContentKt$EditProfileFieldsContent$4$1$2$2$1
                                @Override // p715kotlin.jvm.functions.Function1
                                public /* synthetic */ Object invoke(Object obj) {
                                    return new C17919x(m134179invokevNxB06k((C39336i) obj));
                                }

                                /* JADX INFO: renamed from: invoke-vNxB06k, reason: not valid java name */
                                public final long m134179invokevNxB06k(C39336i whoopColor) {
                                    AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                                    return whoopColor.getAccentAlert();
                                }
                            };
                            c28655q4.m87172p0(objM87133R9);
                        }
                        interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R9);
                        c28655q4.m87173q(false);
                    }
                    InterfaceC39332e interfaceC39332e3 = interfaceC39332eM125323a;
                    if (z37) {
                        c28655q4.m87150e0(1743716707);
                        if (AbstractC8693b.m21270d(textFieldConfig.getFieldState().getError())) {
                            c28655q4.m87150e0(1164631303);
                            z47 = zM21270d;
                            jM125416r = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentFocus15();
                            z60 = false;
                            c28655q4.m87173q(false);
                        } else {
                            z47 = zM21270d;
                            if (z39) {
                                c28655q4.m87150e0(1164634095);
                                jM125416r = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentPositiveTrend15();
                                z60 = false;
                                c28655q4.m87173q(false);
                            } else {
                                c28655q4.m87150e0(1164636641);
                                jM125416r = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBlack30();
                                z60 = false;
                                c28655q4.m87173q(false);
                            }
                        }
                        c28655q4.m87173q(z60);
                    } else {
                        z47 = zM21270d;
                        c28655q4.m87150e0(1744070851);
                        if (AbstractC8693b.m21270d(textFieldConfig.getFieldState().getError())) {
                            c28655q4.m87150e0(1164641740);
                            jM125416r = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentAlertTrend15();
                        } else {
                            c28655q4.m87150e0(1164643073);
                            jM125416r = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBlack30();
                        }
                        c28655q4.m87173q(false);
                        c28655q4.m87173q(false);
                    }
                    long j115 = jM125416r;
                    if (z37) {
                        c28655q4.m87150e0(1744305831);
                        if (AbstractC8693b.m21270d(textFieldConfig.getFieldState().getError())) {
                            c28655q4.m87150e0(1164650309);
                            jM53358D2 = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentFocus();
                            z59 = false;
                            c28655q4.m87173q(false);
                        } else {
                            z59 = false;
                            if (z39) {
                                c28655q4.m87150e0(1164653037);
                                jM53358D2 = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentPositiveTrend();
                                z59 = false;
                                c28655q4.m87173q(false);
                            } else {
                                c28655q4.m87150e0(1164655521);
                                jM53358D2 = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q4, C38072d.f163054b, false);
                            }
                            c28655q4.m87173q(z59);
                        }
                        c28655q4.m87173q(z59);
                    } else {
                        error = error;
                        c28655q4.m87150e0(1744655914);
                        if (AbstractC8693b.m21270d(textFieldConfig.getFieldState().getError())) {
                            c28655q4.m87150e0(1164660613);
                            jM53358D2 = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentAlert();
                            z48 = false;
                            c28655q4.m87173q(false);
                        } else {
                            z48 = false;
                            c28655q4.m87150e0(1164661729);
                            jM53358D2 = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q4, C38072d.f163054b, false);
                        }
                        c28655q4.m87173q(z48);
                    }
                    long j116 = jM53358D2;
                    if (z37) {
                        c28655q4.m87150e0(1744886151);
                        if (AbstractC8693b.m21270d(textFieldConfig.getFieldState().getError())) {
                            c28655q4.m87150e0(1164669029);
                            jM95628d = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentFocus();
                            z49 = false;
                            c28655q4.m87173q(false);
                        } else {
                            z49 = false;
                            if (z39) {
                                c28655q4.m87150e0(1164671757);
                                jM95628d = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentPositiveTrend();
                                c28655q4.m87173q(false);
                            } else {
                                c28655q4.m87150e0(1164674241);
                                jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q4, C38072d.f163054b, false);
                            }
                        }
                        c28655q4.m87173q(z49);
                    } else {
                        c28655q4.m87150e0(1745236234);
                        if (AbstractC8693b.m21270d(textFieldConfig.getFieldState().getError())) {
                            c28655q4.m87150e0(1164679333);
                            jM95628d = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentAlert();
                            z49 = false;
                            c28655q4.m87173q(false);
                        } else {
                            z49 = false;
                            c28655q4.m87150e0(1164680449);
                            jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q4, C38072d.f163054b, false);
                        }
                        c28655q4.m87173q(z49);
                    }
                    long j117 = jM95628d;
                    if (z37) {
                        c28655q4.m87150e0(1745454195);
                        jM125380b = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentFocus();
                        c28655q4.m87173q(z49);
                    } else {
                        c28655q4.m87150e0(1745544467);
                        jM125380b = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentAlert();
                        c28655q4.m87173q(z49);
                    }
                    long j118 = jM125380b;
                    if (z37) {
                        c28655q4.m87150e0(1745688307);
                        jM125380b2 = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentFocus();
                        c28655q4.m87173q(z49);
                    } else {
                        c28655q4.m87150e0(1745778579);
                        jM125380b2 = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentAlert();
                        c28655q4.m87173q(z49);
                    }
                    long j119 = jM125380b2;
                    if (z38) {
                        z52 = false;
                    } else {
                        z52 = false;
                    }
                    interfaceC15237i2 = interfaceC15237i;
                    zM87157i2 = c28655q4.m87157i(interfaceC15237i2);
                    boolean z614 = z52;
                    objM87133R10 = c28655q4.m87133R();
                    if (zM87157i2) {
                        objM87133R10 = new C2564l1(interfaceC15237i2, 2);
                        c28655q4.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C2564l1(interfaceC15237i2, 2);
                        c28655q4.m87172p0(objM87133R10);
                    }
                    Function1 function110 = (Function1) objM87133R10;
                    zM87157i3 = c28655q4.m87157i(interfaceC15237i2);
                    objM87133R11 = c28655q4.m87133R();
                    if (zM87157i3) {
                        objM87133R11 = new C2564l1(interfaceC15237i2, 3);
                        c28655q4.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C2564l1(interfaceC15237i2, 3);
                        c28655q4.m87172p0(objM87133R11);
                    }
                    C34348q0 c34348q2 = new C34348q0(function110, (Function1) objM87133R11, null, null, 58);
                    TextResource textResource3 = error;
                    int iM134191getImeActioneUduSuo3 = textFieldConfig.m134191getImeActioneUduSuo();
                    float f116 = f14;
                    Modifier modifierM3395q5 = AbstractC1099a.m3395q(c2314t2, f116, ((float) 0.5d) * f13);
                    interfaceC15237i = interfaceC15237i2;
                    if ((i18 & 3670016) == 1048576) {
                        z54 = true;
                    } else {
                        z54 = false;
                    }
                    zM87157i4 = z54 | c28655q4.m87157i(textFieldConfig);
                    objM87133R12 = c28655q4.m87133R();
                    if (zM87157i4) {
                        objM87133R12 = new C3169c(29, onFieldUpdate, textFieldConfig);
                        c28655q4.m87172p0(objM87133R12);
                    } else {
                        objM87133R12 = new C3169c(29, onFieldUpdate, textFieldConfig);
                        c28655q4.m87172p0(objM87133R12);
                    }
                    Function1 function111 = (Function1) objM87133R12;
                    boolean zM87155h4 = c28655q4.m87155h(z37);
                    z55 = z37;
                    if ((i18 & 234881024) == 67108864) {
                        z56 = true;
                    } else {
                        z56 = false;
                    }
                    boolean z615 = zM87155h4 | z56;
                    if ((i18 & 29360128) == 8388608) {
                        z57 = true;
                    } else {
                        z57 = false;
                    }
                    zM87157i5 = z615 | z57 | c28655q4.m87157i(textFieldConfig);
                    objM87133R13 = c28655q4.m87133R();
                    if (zM87157i5) {
                        Function1 function112 = function5;
                        InterfaceC4339a interfaceC4339a19 = interfaceC4339a7;
                        objM87133R13 = new C4614e(z55, interfaceC4339a19, function112, textFieldConfig, 2);
                        interfaceC4339a9 = interfaceC4339a19;
                        function6 = function112;
                        c28655q4.m87172p0(objM87133R13);
                    } else {
                        Function1 function113 = function5;
                        InterfaceC4339a interfaceC4339a110 = interfaceC4339a7;
                        objM87133R13 = new C4614e(z55, interfaceC4339a110, function113, textFieldConfig, 2);
                        interfaceC4339a9 = interfaceC4339a110;
                        function6 = function113;
                        c28655q4.m87172p0(objM87133R13);
                    }
                    Function1 function114 = (Function1) objM87133R13;
                    int i314 = TextResource.$stable;
                    Function1 function115 = function6;
                    c28655q3 = c28655q4;
                    c2314t4 = c2314t2;
                    EditProfileTextFieldKt.m134184EditProfileTextFieldiQW2vr8(textResourceM21278l11, textResourceM21278l12, function111, modifierM3395q5, lowerCase5, textResource3, z47, z44, textResourceM21267a2, j114, z39, z45, interfaceC39332e3, j115, j116, j117, j118, j119, z614, iM134192getKeyboardTypePjHm6EE3, null, null, null, c34348q2, iM134191getImeActioneUduSuo3, false, function114, c28655q3, (i314 << 24) | i314 | 3072 | (i314 << 3) | (i314 << 15), 0, 0, 40894464);
                    if (i19 < list.size() - 1) {
                        c28655q3.m87150e0(1747155785);
                        z58 = false;
                        AbstractC25012a.m73388u(1, f13, c2314t4, c28655q3, false);
                    } else {
                        z58 = false;
                        c28655q3.m87150e0(1747247080);
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(z58);
                    c2314t2 = c2314t4;
                    interfaceC4339a7 = interfaceC4339a9;
                    c28655q4 = c28655q3;
                    function5 = function115;
                    i19 = i26;
                    i18 = i18;
                    f14 = f116;
                    c28676v1 = c28676v2;
                    it = it5;
                }
                i24 = i18;
                f15 = f14;
                c2314t3 = c2314t2;
                interfaceC4339a8 = interfaceC4339a7;
                C28676v0 c28676v5 = c28676v1;
                c28655q2 = c28655q4;
                Function1 function116 = function5;
                AbstractC18489d0.m53356B(c28655q2, false, c2314t3, f15, c28655q2);
                TextResource textResourceM21278l13 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, C9691R.string.profile_edit_birthday_label));
                if (formState.getBirthday().getValue().length() > 0) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                if (z24) {
                    textResourceM21267a = new TextResource.C8691e(BirthdayUtils.INSTANCE.formatForDisplay(formState.getBirthday().getValue()));
                } else {
                    textResourceM21267a = AbstractC8693b.m21267a();
                }
                boolean z616 = !viewState.getEditableFields().getBirthday().isLocked();
                Modifier modifierM3396r7 = AbstractC1099a.m3396r(c2314t3, f15, 0.0f, 2);
                int i315 = TextResource.$stable;
                InterfaceC4339a interfaceC4339a111 = interfaceC4339a6;
                AbstractC30783b.m94649b(textResourceM21278l13, textResourceM21267a, interfaceC4339a111, modifierM3396r7, "birthday", null, false, z616, 0.0f, 0L, null, c28655q2, i315 | 27648 | (i315 << 3) | ((i24 >> 21) & 896), 0, 1888);
                c28655q2.m87150e0(-116927849);
                while (r13.hasNext()) {
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f15, c2314t3));
                    i25 = WhenMappings.$EnumSwitchMapping$1[clickableFieldConfig.getType().ordinal()];
                    float f117 = f13;
                    if (i25 != 1) {
                        zIsLocked = viewState.getEditableFields().getCountry().isLocked();
                    } else if (i25 != 2) {
                        zIsLocked = viewState.getEditableFields().getState().isLocked();
                    } else if (i25 != 3) {
                        zIsLocked = viewState.getEditableFields().getGender().isLocked();
                    } else if (i25 != 4) {
                        zIsLocked = false;
                    } else {
                        zIsLocked = viewState.getEditableFields().getPhysiologicalBaseline().isLocked();
                    }
                    TextResource textResourceM21278l14 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, clickableFieldConfig.getLabelRes()));
                    TextResource value3 = clickableFieldConfig.getValue();
                    boolean z617 = zIsLocked;
                    InterfaceC4339a interfaceC4339a112 = interfaceC4339a8;
                    String lowerCase6 = clickableFieldConfig.getType().name().toLowerCase(Locale.ROOT);
                    AbstractC22676k.m65749i(lowerCase6, "toLowerCase(...)");
                    boolean zIsError3 = clickableFieldConfig.isError();
                    TextResource errorMessage3 = clickableFieldConfig.getErrorMessage();
                    boolean z618 = !z617;
                    Modifier modifierM3396r8 = AbstractC1099a.m3396r(c2314t3, f15, 0.0f, 2);
                    if (i17 == 131072) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    zM87157i = z36 | c28655q2.m87157i(clickableFieldConfig);
                    objM87133R8 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R8 = new C3603v(20, onOpenBottomSheet, clickableFieldConfig);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C3603v(20, onOpenBottomSheet, clickableFieldConfig);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    int i316 = TextResource.$stable;
                    AbstractC30783b.m94649b(textResourceM21278l14, value3, (InterfaceC4339a) objM87133R8, modifierM3396r8, lowerCase6, errorMessage3, zIsError3, z618, 0.0f, 0L, null, c28655q2, i316 | 3072 | (i316 << 3) | (i316 << 15), 0, 1792);
                    f13 = f117;
                    interfaceC4339a8 = interfaceC4339a112;
                }
                float f26 = f13;
                InterfaceC4339a interfaceC4339a113 = interfaceC4339a8;
                c28655q2.m87173q(false);
                if (heightWeightGroupedField == null) {
                    c28655q2.m87150e0(671504273);
                    c28655q2.m87173q(false);
                } else {
                    AbstractC33745d.m106667z(c28655q2, 671504274, c2314t3, f15, c28655q2);
                    if (viewState.getEditableFields().getHeight().isLocked()) {
                        z25 = false;
                    } else {
                        z25 = false;
                    }
                    Modifier modifierM3396r9 = AbstractC1099a.m3396r(c2314t3, f15, 0.0f, 2);
                    if (i17 == 131072) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    objM87133R5 = c28655q2.m87133R();
                    if (z26) {
                        objM87133R5 = new C9788l(2, onOpenBottomSheet);
                        c28655q2.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C9788l(2, onOpenBottomSheet);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    InterfaceC4351m interfaceC4351m3 = (InterfaceC4351m) objM87133R5;
                    boolean zM87157i8 = c28655q2.m87157i(logger);
                    if ((i24 & 3670016) == 1048576) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    z28 = zM87157i8 | z27;
                    objM87133R6 = c28655q2.m87133R();
                    if (z28) {
                        objM87133R6 = new C3169c(28, logger, onFieldUpdate);
                        c28655q2.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C3169c(28, logger, onFieldUpdate);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField(modifierM3396r9, heightWeightGroupedField, interfaceC4351m3, (Function1) objM87133R6, z25, c28655q2, 6, 0);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(true);
                Modifier modifierM3395q6 = AbstractC1099a.m3395q(AbstractC1092a.m3358c(AbstractC1102d.m3409f(1.0f, c2314t3), C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a), f115, 4 * f26);
                z29 = false;
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM3395q6);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j2);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m8);
                c0209i2 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N8);
                TextResource textResourceM21278l15 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, C9691R.string.profile_edit_save_button));
                boolean zIsSaveButtonEnabled3 = EditProfileFormUtils.INSTANCE.isSaveButtonEnabled(formState, viewState.getEditableFields(), showUsernameField, viewState.getUsernameValidationState());
                Modifier modifierM44101d3 = AbstractC15676d.m44101d(AbstractC1102d.m3409f(1.0f, c2314t3), "edit_profile_save_button");
                if ((i24 & 57344) == 16384) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                if (i16 != 256) {
                    z29 = true;
                } else {
                    z29 = true;
                }
                z35 = z34 | z29;
                objM87133R7 = c28655q2.m87133R();
                if (z35) {
                    function3 = onEvent;
                    objM87133R7 = new C3603v(21, function3, formState);
                    c28655q2.m87172p0(objM87133R7);
                } else {
                    function3 = onEvent;
                    objM87133R7 = new C3603v(21, function3, formState);
                    c28655q2.m87172p0(objM87133R7);
                }
                AbstractC27292z.m82343j(modifierM44101d3, zIsSaveButtonEnabled3, false, null, null, null, textResourceM21278l15, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R7, c28655q2, TextResource.$stable << 18, 0, 8124);
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                c28655q = c28655q2;
                interfaceC4339a3 = interfaceC4339a111;
                interfaceC4339a4 = interfaceC4339a113;
                modifier2 = modifier5;
                function4 = function116;
            } else {
                interfaceC4339a7 = interfaceC4339a5;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
            C0209i c0209i10 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q4, c0209i10, modifierM118962N6);
            if (1.0f > 0.0d) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (!z18) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            f13 = 8;
            float f118 = 2 * f13;
            Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC30060g.m92116f0(new LayoutWeightElement(1.0f, true), AbstractC30060g.m92099U(0, c28655q4, 1), 14), 0.0f, 0.0f, 0.0f, f118, 7);
            C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q4, 0);
            iHashCode2 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q4.m87165m();
            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q4, modifierM3398t4);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i7, c23010xM66775a6);
            AbstractC28683x.m87239G(c28655q4, c0209i8, interfaceC28653p1M87165m9);
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q4, c0209i10, modifierM118962N9);
            EditProfileViewState.EditProfileData profileData4 = viewState.getProfileData();
            i17 = i313 & 458752;
            if (i17 == 131072) {
                z19 = true;
            } else {
                z19 = false;
            }
            objM87133R4 = c28655q4.m87133R();
            if (z19) {
                objM87133R4 = new C0111j(onOpenBottomSheet, 20);
                c28655q4.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C0111j(onOpenBottomSheet, 20);
                c28655q4.m87172p0(objM87133R4);
            }
            c2314t2 = c2314t;
            f14 = f118;
            interfaceC15237i = interfaceC15237i4;
            c28676v1 = c28676v0;
            i18 = i313;
            EditProfileAvatarSectionKt.EditProfileAvatarSection(profileData4, onEvent, (InterfaceC4339a) objM87133R4, AbstractC1099a.m3398t(c2314t, 0.0f, f118, 0.0f, 0.0f, 13), c28655q4, ((i313 >> 9) & 112) | 3072, 0);
            float f119 = ((float) 2.5d) * f13;
            AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3411h(f119, c2314t2));
            c28655q4.m87150e0(-117163495);
            it = list.iterator();
            i19 = 0;
            while (it.hasNext()) {
                next = it.next();
                i26 = i19 + 1;
                if (i19 >= 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                textFieldConfig = (TextFieldConfig) next;
                Iterator it6 = it;
                c28655q4.m87144b0(1164532513, textFieldConfig.getFieldType());
                if (textFieldConfig.getFieldType() == EditProfileEvent.FieldType.USERNAME) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                i27 = WhenMappings.$EnumSwitchMapping$0[textFieldConfig.getFieldType().ordinal()];
                if (i27 != 1) {
                    zIsLocked2 = viewState.getEditableFields().getFirstName().isLocked();
                } else if (i27 != 2) {
                    zIsLocked2 = viewState.getEditableFields().getLastName().isLocked();
                } else if (i27 != 3) {
                    zIsLocked2 = viewState.getEditableFields().getUsername().isLocked();
                } else if (i27 != 4) {
                    zIsLocked2 = false;
                } else {
                    zIsLocked2 = viewState.getEditableFields().getCity().isLocked();
                }
                if (z37) {
                    z38 = true;
                } else {
                    z38 = true;
                }
                if (z37) {
                    zIsValidating = EditProfileFormUtils.INSTANCE.isUsernameFieldValidating(textFieldConfig.getFieldState().isValidating(), viewState.getUsernameValidationState().isValidating());
                } else {
                    zIsValidating = textFieldConfig.getFieldState().isValidating();
                }
                if (!z37) {
                    z39 = false;
                } else {
                    z39 = false;
                }
                if (!z37) {
                    z44 = false;
                } else {
                    z44 = false;
                }
                if (z37) {
                    z45 = zIsValidating;
                    z46 = false;
                    if (z39) {
                        c28655q4.m87150e0(1742520510);
                        c28655q4.m87173q(false);
                        textResourceM21267a2 = viewState.getUsernameValidationState().getValidationSuccess();
                        if (textResourceM21267a2 == null) {
                            textResourceM21267a2 = AbstractC8693b.m21267a();
                        }
                    } else {
                        c28655q4.m87150e0(1164592365);
                        c28655q4.m87173q(false);
                        textResourceM21267a2 = AbstractC8693b.m21267a();
                    }
                } else {
                    z45 = zIsValidating;
                    z46 = false;
                    if (z39) {
                        c28655q4.m87150e0(1742520510);
                        c28655q4.m87173q(false);
                        textResourceM21267a2 = viewState.getUsernameValidationState().getValidationSuccess();
                        if (textResourceM21267a2 == null) {
                            textResourceM21267a2 = AbstractC8693b.m21267a();
                        }
                    } else {
                        c28655q4.m87150e0(1164592365);
                        c28655q4.m87173q(false);
                        textResourceM21267a2 = AbstractC8693b.m21267a();
                    }
                }
                if (z39) {
                    c28655q4.m87150e0(1164596429);
                    jM53358D = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentPositiveTrend();
                    c28655q4.m87173q(false);
                } else {
                    c28655q4.m87150e0(1164597793);
                    jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q4, C38072d.f163054b, z46);
                }
                long j1110 = jM53358D;
                TextResource textResourceM21278l16 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q4, textFieldConfig.getLabelRes()));
                TextResource textResourceM21278l17 = AbstractC8693b.m21278l(textFieldConfig.getFieldState().getValue());
                int iM134192getKeyboardTypePjHm6EE4 = textFieldConfig.m134192getKeyboardTypePjHm6EE();
                String lowerCase7 = textFieldConfig.getFieldType().name().toLowerCase(Locale.ROOT);
                AbstractC22676k.m65749i(lowerCase7, "toLowerCase(...)");
                zM21270d = AbstractC8693b.m21270d(textFieldConfig.getFieldState().getError());
                error = textFieldConfig.getFieldState().getError();
                if (z37) {
                    c28655q4.m87150e0(1743480022);
                    objM87133R14 = c28655q4.m87133R();
                    c28676v2 = c28676v1;
                    if (objM87133R14 == c28676v2) {
                        objM87133R14 = new Function1() { // from class: com.whoop.profile.view.edit.EditProfileFieldsContentKt$EditProfileFieldsContent$4$1$2$1$1
                            @Override // p715kotlin.jvm.functions.Function1
                            public /* synthetic */ Object invoke(Object obj) {
                                return new C17919x(m134178invokevNxB06k((C39336i) obj));
                            }

                            /* JADX INFO: renamed from: invoke-vNxB06k, reason: not valid java name */
                            public final long m134178invokevNxB06k(C39336i whoopColor) {
                                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                                return whoopColor.getAccentFocus();
                            }
                        };
                        c28655q4.m87172p0(objM87133R14);
                    }
                    interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R14);
                    c28655q4.m87173q(false);
                } else {
                    c28676v2 = c28676v1;
                    c28655q4.m87150e0(1743567318);
                    objM87133R9 = c28655q4.m87133R();
                    if (objM87133R9 == c28676v2) {
                        objM87133R9 = new Function1() { // from class: com.whoop.profile.view.edit.EditProfileFieldsContentKt$EditProfileFieldsContent$4$1$2$2$1
                            @Override // p715kotlin.jvm.functions.Function1
                            public /* synthetic */ Object invoke(Object obj) {
                                return new C17919x(m134179invokevNxB06k((C39336i) obj));
                            }

                            /* JADX INFO: renamed from: invoke-vNxB06k, reason: not valid java name */
                            public final long m134179invokevNxB06k(C39336i whoopColor) {
                                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                                return whoopColor.getAccentAlert();
                            }
                        };
                        c28655q4.m87172p0(objM87133R9);
                    }
                    interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R9);
                    c28655q4.m87173q(false);
                }
                InterfaceC39332e interfaceC39332e4 = interfaceC39332eM125323a;
                if (z37) {
                    c28655q4.m87150e0(1743716707);
                    if (AbstractC8693b.m21270d(textFieldConfig.getFieldState().getError())) {
                        c28655q4.m87150e0(1164631303);
                        z47 = zM21270d;
                        jM125416r = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentFocus15();
                        z60 = false;
                        c28655q4.m87173q(false);
                    } else {
                        z47 = zM21270d;
                        if (z39) {
                            c28655q4.m87150e0(1164634095);
                            jM125416r = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentPositiveTrend15();
                            z60 = false;
                            c28655q4.m87173q(false);
                        } else {
                            c28655q4.m87150e0(1164636641);
                            jM125416r = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBlack30();
                            z60 = false;
                            c28655q4.m87173q(false);
                        }
                    }
                    c28655q4.m87173q(z60);
                } else {
                    z47 = zM21270d;
                    c28655q4.m87150e0(1744070851);
                    if (AbstractC8693b.m21270d(textFieldConfig.getFieldState().getError())) {
                        c28655q4.m87150e0(1164641740);
                        jM125416r = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentAlertTrend15();
                    } else {
                        c28655q4.m87150e0(1164643073);
                        jM125416r = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBlack30();
                    }
                    c28655q4.m87173q(false);
                    c28655q4.m87173q(false);
                }
                long j1111 = jM125416r;
                if (z37) {
                    c28655q4.m87150e0(1744305831);
                    if (AbstractC8693b.m21270d(textFieldConfig.getFieldState().getError())) {
                        c28655q4.m87150e0(1164650309);
                        jM53358D2 = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentFocus();
                        z59 = false;
                        c28655q4.m87173q(false);
                    } else {
                        z59 = false;
                        if (z39) {
                            c28655q4.m87150e0(1164653037);
                            jM53358D2 = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentPositiveTrend();
                            z59 = false;
                            c28655q4.m87173q(false);
                        } else {
                            c28655q4.m87150e0(1164655521);
                            jM53358D2 = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q4, C38072d.f163054b, false);
                        }
                        c28655q4.m87173q(z59);
                    }
                    c28655q4.m87173q(z59);
                } else {
                    error = error;
                    c28655q4.m87150e0(1744655914);
                    if (AbstractC8693b.m21270d(textFieldConfig.getFieldState().getError())) {
                        c28655q4.m87150e0(1164660613);
                        jM53358D2 = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentAlert();
                        z48 = false;
                        c28655q4.m87173q(false);
                    } else {
                        z48 = false;
                        c28655q4.m87150e0(1164661729);
                        jM53358D2 = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q4, C38072d.f163054b, false);
                    }
                    c28655q4.m87173q(z48);
                }
                long j1112 = jM53358D2;
                if (z37) {
                    c28655q4.m87150e0(1744886151);
                    if (AbstractC8693b.m21270d(textFieldConfig.getFieldState().getError())) {
                        c28655q4.m87150e0(1164669029);
                        jM95628d = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentFocus();
                        z49 = false;
                        c28655q4.m87173q(false);
                    } else {
                        z49 = false;
                        if (z39) {
                            c28655q4.m87150e0(1164671757);
                            jM95628d = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentPositiveTrend();
                            c28655q4.m87173q(false);
                        } else {
                            c28655q4.m87150e0(1164674241);
                            jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q4, C38072d.f163054b, false);
                        }
                    }
                    c28655q4.m87173q(z49);
                } else {
                    c28655q4.m87150e0(1745236234);
                    if (AbstractC8693b.m21270d(textFieldConfig.getFieldState().getError())) {
                        c28655q4.m87150e0(1164679333);
                        jM95628d = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentAlert();
                        z49 = false;
                        c28655q4.m87173q(false);
                    } else {
                        z49 = false;
                        c28655q4.m87150e0(1164680449);
                        jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q4, C38072d.f163054b, false);
                    }
                    c28655q4.m87173q(z49);
                }
                long j1113 = jM95628d;
                if (z37) {
                    c28655q4.m87150e0(1745454195);
                    jM125380b = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentFocus();
                    c28655q4.m87173q(z49);
                } else {
                    c28655q4.m87150e0(1745544467);
                    jM125380b = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentAlert();
                    c28655q4.m87173q(z49);
                }
                long j1114 = jM125380b;
                if (z37) {
                    c28655q4.m87150e0(1745688307);
                    jM125380b2 = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentFocus();
                    c28655q4.m87173q(z49);
                } else {
                    c28655q4.m87150e0(1745778579);
                    jM125380b2 = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getAccentAlert();
                    c28655q4.m87173q(z49);
                }
                long j1115 = jM125380b2;
                if (z38) {
                    z52 = false;
                } else {
                    z52 = false;
                }
                interfaceC15237i2 = interfaceC15237i;
                zM87157i2 = c28655q4.m87157i(interfaceC15237i2);
                boolean z619 = z52;
                objM87133R10 = c28655q4.m87133R();
                if (zM87157i2) {
                    objM87133R10 = new C2564l1(interfaceC15237i2, 2);
                    c28655q4.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new C2564l1(interfaceC15237i2, 2);
                    c28655q4.m87172p0(objM87133R10);
                }
                Function1 function117 = (Function1) objM87133R10;
                zM87157i3 = c28655q4.m87157i(interfaceC15237i2);
                objM87133R11 = c28655q4.m87133R();
                if (zM87157i3) {
                    objM87133R11 = new C2564l1(interfaceC15237i2, 3);
                    c28655q4.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new C2564l1(interfaceC15237i2, 3);
                    c28655q4.m87172p0(objM87133R11);
                }
                C34348q0 c34348q3 = new C34348q0(function117, (Function1) objM87133R11, null, null, 58);
                TextResource textResource4 = error;
                int iM134191getImeActioneUduSuo4 = textFieldConfig.m134191getImeActioneUduSuo();
                float f1110 = f14;
                Modifier modifierM3395q7 = AbstractC1099a.m3395q(c2314t2, f1110, ((float) 0.5d) * f13);
                interfaceC15237i = interfaceC15237i2;
                if ((i18 & 3670016) == 1048576) {
                    z54 = true;
                } else {
                    z54 = false;
                }
                zM87157i4 = z54 | c28655q4.m87157i(textFieldConfig);
                objM87133R12 = c28655q4.m87133R();
                if (zM87157i4) {
                    objM87133R12 = new C3169c(29, onFieldUpdate, textFieldConfig);
                    c28655q4.m87172p0(objM87133R12);
                } else {
                    objM87133R12 = new C3169c(29, onFieldUpdate, textFieldConfig);
                    c28655q4.m87172p0(objM87133R12);
                }
                Function1 function118 = (Function1) objM87133R12;
                boolean zM87155h5 = c28655q4.m87155h(z37);
                z55 = z37;
                if ((i18 & 234881024) == 67108864) {
                    z56 = true;
                } else {
                    z56 = false;
                }
                boolean z6110 = zM87155h5 | z56;
                if ((i18 & 29360128) == 8388608) {
                    z57 = true;
                } else {
                    z57 = false;
                }
                zM87157i5 = z6110 | z57 | c28655q4.m87157i(textFieldConfig);
                objM87133R13 = c28655q4.m87133R();
                if (zM87157i5) {
                    Function1 function119 = function5;
                    InterfaceC4339a interfaceC4339a114 = interfaceC4339a7;
                    objM87133R13 = new C4614e(z55, interfaceC4339a114, function119, textFieldConfig, 2);
                    interfaceC4339a9 = interfaceC4339a114;
                    function6 = function119;
                    c28655q4.m87172p0(objM87133R13);
                } else {
                    Function1 function1110 = function5;
                    InterfaceC4339a interfaceC4339a115 = interfaceC4339a7;
                    objM87133R13 = new C4614e(z55, interfaceC4339a115, function1110, textFieldConfig, 2);
                    interfaceC4339a9 = interfaceC4339a115;
                    function6 = function1110;
                    c28655q4.m87172p0(objM87133R13);
                }
                Function1 function1111 = (Function1) objM87133R13;
                int i317 = TextResource.$stable;
                Function1 function1112 = function6;
                c28655q3 = c28655q4;
                c2314t4 = c2314t2;
                EditProfileTextFieldKt.m134184EditProfileTextFieldiQW2vr8(textResourceM21278l16, textResourceM21278l17, function118, modifierM3395q7, lowerCase7, textResource4, z47, z44, textResourceM21267a2, j1110, z39, z45, interfaceC39332e4, j1111, j1112, j1113, j1114, j1115, z619, iM134192getKeyboardTypePjHm6EE4, null, null, null, c34348q3, iM134191getImeActioneUduSuo4, false, function1111, c28655q3, (i317 << 24) | i317 | 3072 | (i317 << 3) | (i317 << 15), 0, 0, 40894464);
                if (i19 < list.size() - 1) {
                    c28655q3.m87150e0(1747155785);
                    z58 = false;
                    AbstractC25012a.m73388u(1, f13, c2314t4, c28655q3, false);
                } else {
                    z58 = false;
                    c28655q3.m87150e0(1747247080);
                    c28655q3.m87173q(false);
                }
                c28655q3.m87173q(z58);
                c2314t2 = c2314t4;
                interfaceC4339a7 = interfaceC4339a9;
                c28655q4 = c28655q3;
                function5 = function1112;
                i19 = i26;
                i18 = i18;
                f14 = f1110;
                c28676v1 = c28676v2;
                it = it6;
            }
            i24 = i18;
            f15 = f14;
            c2314t3 = c2314t2;
            interfaceC4339a8 = interfaceC4339a7;
            C28676v0 c28676v6 = c28676v1;
            c28655q2 = c28655q4;
            Function1 function1113 = function5;
            AbstractC18489d0.m53356B(c28655q2, false, c2314t3, f15, c28655q2);
            TextResource textResourceM21278l18 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, C9691R.string.profile_edit_birthday_label));
            if (formState.getBirthday().getValue().length() > 0) {
                z24 = true;
            } else {
                z24 = false;
            }
            if (z24) {
                textResourceM21267a = new TextResource.C8691e(BirthdayUtils.INSTANCE.formatForDisplay(formState.getBirthday().getValue()));
            } else {
                textResourceM21267a = AbstractC8693b.m21267a();
            }
            boolean z6111 = !viewState.getEditableFields().getBirthday().isLocked();
            Modifier modifierM3396r10 = AbstractC1099a.m3396r(c2314t3, f15, 0.0f, 2);
            int i318 = TextResource.$stable;
            InterfaceC4339a interfaceC4339a116 = interfaceC4339a6;
            AbstractC30783b.m94649b(textResourceM21278l18, textResourceM21267a, interfaceC4339a116, modifierM3396r10, "birthday", null, false, z6111, 0.0f, 0L, null, c28655q2, i318 | 27648 | (i318 << 3) | ((i24 >> 21) & 896), 0, 1888);
            c28655q2.m87150e0(-116927849);
            while (r13.hasNext()) {
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f15, c2314t3));
                i25 = WhenMappings.$EnumSwitchMapping$1[clickableFieldConfig.getType().ordinal()];
                float f1111 = f13;
                if (i25 != 1) {
                    zIsLocked = viewState.getEditableFields().getCountry().isLocked();
                } else if (i25 != 2) {
                    zIsLocked = viewState.getEditableFields().getState().isLocked();
                } else if (i25 != 3) {
                    zIsLocked = viewState.getEditableFields().getGender().isLocked();
                } else if (i25 != 4) {
                    zIsLocked = false;
                } else {
                    zIsLocked = viewState.getEditableFields().getPhysiologicalBaseline().isLocked();
                }
                TextResource textResourceM21278l19 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, clickableFieldConfig.getLabelRes()));
                TextResource value4 = clickableFieldConfig.getValue();
                boolean z6112 = zIsLocked;
                InterfaceC4339a interfaceC4339a117 = interfaceC4339a8;
                String lowerCase8 = clickableFieldConfig.getType().name().toLowerCase(Locale.ROOT);
                AbstractC22676k.m65749i(lowerCase8, "toLowerCase(...)");
                boolean zIsError4 = clickableFieldConfig.isError();
                TextResource errorMessage4 = clickableFieldConfig.getErrorMessage();
                boolean z6113 = !z6112;
                Modifier modifierM3396r11 = AbstractC1099a.m3396r(c2314t3, f15, 0.0f, 2);
                if (i17 == 131072) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                zM87157i = z36 | c28655q2.m87157i(clickableFieldConfig);
                objM87133R8 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R8 = new C3603v(20, onOpenBottomSheet, clickableFieldConfig);
                    c28655q2.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new C3603v(20, onOpenBottomSheet, clickableFieldConfig);
                    c28655q2.m87172p0(objM87133R8);
                }
                int i319 = TextResource.$stable;
                AbstractC30783b.m94649b(textResourceM21278l19, value4, (InterfaceC4339a) objM87133R8, modifierM3396r11, lowerCase8, errorMessage4, zIsError4, z6113, 0.0f, 0L, null, c28655q2, i319 | 3072 | (i319 << 3) | (i319 << 15), 0, 1792);
                f13 = f1111;
                interfaceC4339a8 = interfaceC4339a117;
            }
            float f27 = f13;
            InterfaceC4339a interfaceC4339a118 = interfaceC4339a8;
            c28655q2.m87173q(false);
            if (heightWeightGroupedField == null) {
                c28655q2.m87150e0(671504273);
                c28655q2.m87173q(false);
            } else {
                AbstractC33745d.m106667z(c28655q2, 671504274, c2314t3, f15, c28655q2);
                if (viewState.getEditableFields().getHeight().isLocked()) {
                    z25 = false;
                } else {
                    z25 = false;
                }
                Modifier modifierM3396r12 = AbstractC1099a.m3396r(c2314t3, f15, 0.0f, 2);
                if (i17 == 131072) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                objM87133R5 = c28655q2.m87133R();
                if (z26) {
                    objM87133R5 = new C9788l(2, onOpenBottomSheet);
                    c28655q2.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C9788l(2, onOpenBottomSheet);
                    c28655q2.m87172p0(objM87133R5);
                }
                InterfaceC4351m interfaceC4351m4 = (InterfaceC4351m) objM87133R5;
                boolean zM87157i9 = c28655q2.m87157i(logger);
                if ((i24 & 3670016) == 1048576) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                z28 = zM87157i9 | z27;
                objM87133R6 = c28655q2.m87133R();
                if (z28) {
                    objM87133R6 = new C3169c(28, logger, onFieldUpdate);
                    c28655q2.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C3169c(28, logger, onFieldUpdate);
                    c28655q2.m87172p0(objM87133R6);
                }
                HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField(modifierM3396r12, heightWeightGroupedField, interfaceC4351m4, (Function1) objM87133R6, z25, c28655q2, 6, 0);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            Modifier modifierM3395q8 = AbstractC1099a.m3395q(AbstractC1092a.m3358c(AbstractC1102d.m3409f(1.0f, c2314t3), C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a), f119, 4 * f27);
            z29 = false;
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, modifierM3395q8);
            InterfaceC0221l.f734a.getClass();
            c0213j2 = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j2);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m10);
            c0209i2 = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N10);
            TextResource textResourceM21278l110 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, C9691R.string.profile_edit_save_button));
            boolean zIsSaveButtonEnabled4 = EditProfileFormUtils.INSTANCE.isSaveButtonEnabled(formState, viewState.getEditableFields(), showUsernameField, viewState.getUsernameValidationState());
            Modifier modifierM44101d4 = AbstractC15676d.m44101d(AbstractC1102d.m3409f(1.0f, c2314t3), "edit_profile_save_button");
            if ((i24 & 57344) == 16384) {
                z34 = true;
            } else {
                z34 = false;
            }
            if (i16 != 256) {
                z29 = true;
            } else {
                z29 = true;
            }
            z35 = z34 | z29;
            objM87133R7 = c28655q2.m87133R();
            if (z35) {
                function3 = onEvent;
                objM87133R7 = new C3603v(21, function3, formState);
                c28655q2.m87172p0(objM87133R7);
            } else {
                function3 = onEvent;
                objM87133R7 = new C3603v(21, function3, formState);
                c28655q2.m87172p0(objM87133R7);
            }
            AbstractC27292z.m82343j(modifierM44101d4, zIsSaveButtonEnabled4, false, null, null, null, textResourceM21278l110, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R7, c28655q2, TextResource.$stable << 18, 0, 8124);
            c28655q2.m87173q(true);
            c28655q2.m87173q(true);
            c28655q = c28655q2;
            interfaceC4339a3 = interfaceC4339a116;
            interfaceC4339a4 = interfaceC4339a118;
            modifier2 = modifier5;
            function4 = function1113;
        } else {
            function3 = onEvent;
            c28655q4.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
            c28655q = c28655q4;
            function4 = function2;
            interfaceC4339a4 = interfaceC4339a;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3440f1(modifier2, viewState, formState, logger, function3, onOpenBottomSheet, onFieldUpdate, function4, interfaceC4339a4, interfaceC4339a3, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileFieldsContent$lambda$0$0(EditProfileEvent.FieldType it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileFieldsContent$lambda$6$0$0$0(InterfaceC4351m interfaceC4351m) {
        interfaceC4351m.invoke(EditProfileViewState.BottomSheetType.AVATAR, null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileFieldsContent$lambda$6$0$1$2$0(InterfaceC15237i interfaceC15237i, InterfaceC34345p0 KeyboardActions) {
        AbstractC22676k.m65750j(KeyboardActions, "$this$KeyboardActions");
        ((C15240l) interfaceC15237i).m43339b(false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileFieldsContent$lambda$6$0$1$3$0(InterfaceC15237i interfaceC15237i, InterfaceC34345p0 KeyboardActions) {
        AbstractC22676k.m65750j(KeyboardActions, "$this$KeyboardActions");
        ((C15240l) interfaceC15237i).m43345h(6);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileFieldsContent$lambda$6$0$1$4$0(InterfaceC4351m interfaceC4351m, TextFieldConfig textFieldConfig, String newValue) {
        AbstractC22676k.m65750j(newValue, "newValue");
        interfaceC4351m.invoke(textFieldConfig.getFieldType(), newValue);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileFieldsContent$lambda$6$0$1$5$0(boolean z4, InterfaceC4339a interfaceC4339a, Function1 function1, TextFieldConfig textFieldConfig, boolean z13) {
        if (z13 && z4) {
            interfaceC4339a.invoke();
        }
        if (!z13) {
            function1.invoke(textFieldConfig.getFieldType());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileFieldsContent$lambda$6$0$2$0$0(InterfaceC4351m interfaceC4351m, ClickableFieldConfig clickableFieldConfig) {
        interfaceC4351m.invoke(clickableFieldConfig.getType(), null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileFieldsContent$lambda$6$0$3$0$0(InterfaceC4351m interfaceC4351m, EditProfileViewState.BottomSheetType bottomSheetType, String str) {
        AbstractC22676k.m65750j(bottomSheetType, "bottomSheetType");
        interfaceC4351m.invoke(bottomSheetType, str);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileFieldsContent$lambda$6$0$3$1$0(InterfaceC34116n interfaceC34116n, InterfaceC4351m interfaceC4351m, String newUnitSystem) {
        AbstractC22676k.m65750j(newUnitSystem, "newUnitSystem");
        interfaceC34116n.mo85228t("Unit System Toggled to: ".concat(newUnitSystem), new AbstractC30556a.a[0]);
        interfaceC4351m.invoke(EditProfileEvent.FieldType.UNIT_SYSTEM, newUnitSystem);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileFieldsContent$lambda$6$1$0$0(Function1 function1, EditProfileFormState editProfileFormState) {
        function1.invoke(new EditProfileEvent.SaveProfile(editProfileFormState));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileFieldsContent$lambda$7(Modifier modifier, EditProfileViewState editProfileViewState, EditProfileFormState editProfileFormState, InterfaceC34116n interfaceC34116n, Function1 function1, InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2, Function1 function2, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, int i14, Composer composer, int i15) {
        EditProfileFieldsContent(modifier, editProfileViewState, editProfileFormState, interfaceC34116n, function1, interfaceC4351m, interfaceC4351m2, function2, interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
