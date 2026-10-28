package com.whoop.profile.view.edit;

import a81.C0556g;
import am2.C1042s;
import androidx.compose.runtime.Composer;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.app.NotificationCompat;
import b01.C2192m;
import bs1.C3603v;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.C9691R;
import com.whoop.profile.presentation.edit.BirthdayContentKt;
import com.whoop.profile.presentation.edit.C9723b;
import com.whoop.profile.presentation.edit.EditProfileEvent;
import com.whoop.profile.presentation.edit.EditProfileViewModel;
import com.whoop.profile.presentation.edit.EditProfileViewState;
import com.whoop.profile.view.edit.form.EditProfileFormState;
import com.whoop.profile.view.edit.form.EditProfileFormUtils;
import com.whoop.profile.view.edit.form.FieldState;
import ge3.AbstractC15751g;
import j11.AbstractC21211n;
import j93.InterfaceC21467g;
import java.util.LinkedHashMap;
import java.util.Map;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nf3.C26669a;
import p114eb.AbstractC12939a0;
import p114eb.AbstractC12964i1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf3.C29155a;
import q83.AbstractC30060g;
import tr2.InterfaceC34116n;
import xf3.C38266c;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u0012²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\u0010\u0010\u000e\u001a\u0004\u0018\u00010\r8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0011\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Leb/a0;", "navController", "Ll83/a0;", "EditProfileScreen", "(Leb/a0;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$NavigationEvent;", NotificationCompat.CATEGORY_EVENT, "handleNavigationEvent", "(Lcom/whoop/profile/presentation/edit/EditProfileEvent$NavigationEvent;Leb/a0;)V", "Lcom/whoop/profile/presentation/edit/EditProfileViewModel;", "viewModel", "Lcom/whoop/profile/presentation/edit/EditProfileViewState;", "viewState", "Lcom/whoop/profile/view/edit/form/EditProfileFormState;", "formState", "", "showBirthdayPicker", "showDiscardDialog", "profile_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EditProfileScreenKt {

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EditProfileEvent.FieldType.values().length];
            try {
                iArr[EditProfileEvent.FieldType.USERNAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void EditProfileScreen(AbstractC12939a0 abstractC12939a0, Composer composer, int i13, int i14) {
        AbstractC12939a0 abstractC12939a0M44439S;
        int i15;
        InterfaceC28601c1 interfaceC28601c1;
        InterfaceC28601c1 interfaceC28601c2;
        Map map;
        InterfaceC23462h interfaceC23462h;
        Function1 function1;
        InterfaceC28601c1 interfaceC28601c3;
        InterfaceC23462h interfaceC23462h2;
        Object c1042s;
        EditProfileFormState editProfileFormState;
        InterfaceC4351m interfaceC4351m;
        boolean z4;
        AbstractC12939a0 abstractC12939a1;
        InterfaceC28601c1 interfaceC28601c4;
        InterfaceC28601c1 interfaceC28601c5;
        int i16;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-219810519);
        if ((i13 & 6) == 0) {
            if ((i14 & 1) == 0) {
                abstractC12939a0M44439S = abstractC12939a0;
                if (c28655q.m87157i(abstractC12939a0M44439S)) {
                    i16 = 4;
                }
                i15 = i13 | i16;
            } else {
                abstractC12939a0M44439S = abstractC12939a0;
            }
            i16 = 2;
            i15 = i13 | i16;
        } else {
            abstractC12939a0M44439S = abstractC12939a0;
            i15 = i13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0 && !c28655q.m87118C()) {
                c28655q.m87138X();
                int i17 = i14 & 1;
            } else if ((i14 & 1) != 0) {
                abstractC12939a0M44439S = AbstractC15751g.m44439S(new AbstractC12964i1[0], c28655q);
            }
            AbstractC12939a0 abstractC12939a2 = abstractC12939a0M44439S;
            c28655q.m87175r();
            c28655q.m87152f0(-1688186518);
            C26669a c26669a = C29155a.f118017b;
            if (c26669a == null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            C38266c c38266c = c26669a.f106046a.f159364d;
            C21647a c21647aM114690r = AbstractC36095b.m114690r(c28655q, -1688186210, c28655q, false, -3686552);
            boolean zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new EditProfileScreenKt$EditProfileScreen$$inlined$viewModel$1(c38266c, null, null, c21647aM114690r));
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            InterfaceC23462h interfaceC23462h3 = (InterfaceC23462h) objM87133R;
            c28655q.m87173q(false);
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(EditProfileScreen$lambda$0(interfaceC23462h3).getViewState(), new EditProfileViewState(null, null, null, null, null, null, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null), null, c28655q, 0, 2);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c6 = (InterfaceC28601c1) objM87133R2;
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC28601c1 interfaceC28601c7 = (InterfaceC28601c1) objM87133R3;
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R4);
            }
            InterfaceC28601c1 interfaceC28601c8 = (InterfaceC28601c1) objM87133R4;
            Object objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = new LinkedHashMap();
                c28655q.m87172p0(objM87133R5);
            }
            Map map2 = (Map) objM87133R5;
            Object objM87133R6 = c28655q.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = InterfaceC34116n.INSTANCE.m107848a("EditProfileScreen");
                c28655q.m87172p0(objM87133R6);
            }
            InterfaceC34116n interfaceC34116n = (InterfaceC34116n) objM87133R6;
            EditProfileViewModel editProfileViewModelEditProfileScreen$lambda$0 = EditProfileScreen$lambda$0(interfaceC23462h3);
            boolean zM87157i = c28655q.m87157i(interfaceC23462h3);
            Object objM87133R7 = c28655q.m87133R();
            if (zM87157i || objM87133R7 == c28676v0) {
                objM87133R7 = new EditProfileScreenKt$EditProfileScreen$1$1(interfaceC23462h3, null);
                c28655q.m87172p0(objM87133R7);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R7, editProfileViewModelEditProfileScreen$lambda$0);
            EditProfileViewState.FullScreenModal fullScreenModal = EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getFullScreenModal();
            boolean zM87153g2 = c28655q.m87153g(interfaceC28601c1M87260n) | c28655q.m87157i(abstractC12939a2);
            Object objM87133R8 = c28655q.m87133R();
            if (zM87153g2 || objM87133R8 == c28676v0) {
                objM87133R8 = new EditProfileScreenKt$EditProfileScreen$2$1(abstractC12939a2, interfaceC28601c1M87260n, null);
                c28655q.m87172p0(objM87133R8);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R8, fullScreenModal);
            TextResource validationError = EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEmailValidationState().getValidationError();
            String lastValidatedEmail = EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEmailValidationState().getLastValidatedEmail();
            Boolean boolIsValid = EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEmailValidationState().isValid();
            boolean zM87153g3 = c28655q.m87153g(interfaceC28601c1M87260n) | c28655q.m87157i(map2);
            Object objM87133R9 = c28655q.m87133R();
            if (zM87153g3 || objM87133R9 == c28676v0) {
                objM87133R9 = new EditProfileScreenKt$EditProfileScreen$3$1(map2, interfaceC28601c1M87260n, interfaceC28601c6, null);
                c28655q.m87172p0(objM87133R9);
            }
            int i18 = TextResource.$stable;
            AbstractC28683x.m87255i(validationError, lastValidatedEmail, boolIsValid, (InterfaceC4351m) objM87133R9, c28655q);
            Boolean boolValueOf = Boolean.valueOf(EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getUsernameValidationState().isValidating());
            Boolean boolValueOf2 = Boolean.valueOf(EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getShowUsernameField());
            boolean zM87153g4 = c28655q.m87153g(interfaceC28601c1M87260n);
            Object objM87133R10 = c28655q.m87133R();
            if (zM87153g4 || objM87133R10 == c28676v0) {
                objM87133R10 = new EditProfileScreenKt$EditProfileScreen$4$1(interfaceC28601c1M87260n, interfaceC28601c6, null);
                c28655q.m87172p0(objM87133R10);
            }
            AbstractC28683x.m87254h(boolValueOf, boolValueOf2, (InterfaceC4351m) objM87133R10, c28655q);
            TextResource validationError2 = EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getUsernameValidationState().getValidationError();
            String lastValidatedUsername = EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getUsernameValidationState().getLastValidatedUsername();
            Boolean boolIsValid2 = EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getUsernameValidationState().isValid();
            boolean zM87153g5 = c28655q.m87153g(interfaceC28601c1M87260n);
            Object objM87133R11 = c28655q.m87133R();
            if (zM87153g5 || objM87133R11 == c28676v0) {
                objM87133R11 = new EditProfileScreenKt$EditProfileScreen$5$1(interfaceC28601c1M87260n, interfaceC28601c6, null);
                c28655q.m87172p0(objM87133R11);
            }
            AbstractC28683x.m87255i(validationError2, lastValidatedUsername, boolIsValid2, (InterfaceC4351m) objM87133R11, c28655q);
            EditProfileViewState.FullScreenModal fullScreenModal2 = EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getFullScreenModal();
            if (EditProfileScreen$lambda$3(interfaceC28601c6) == null && EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getEmail().getValue().length() > 0) {
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                boolean z19 = false;
                boolean z24 = false;
                boolean z25 = false;
                boolean z26 = false;
                boolean z27 = false;
                boolean z28 = false;
                interfaceC28601c6.setValue(new EditProfileFormState(new FieldState(EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getEmail().getValue(), EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getEmail().getErrorMessage(), false, true, false, z13, 52, null), new FieldState(EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getUsername().getValue(), EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getUsername().getErrorMessage(), false, AbstractC8693b.m21270d(EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getUsername().getErrorMessage()), z13, z14, 52, null), new FieldState(EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getFirstName().getValue(), EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getFirstName().getErrorMessage(), false, AbstractC8693b.m21270d(EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getFirstName().getErrorMessage()), z14, z15, 52, null), new FieldState(EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getLastName().getValue(), EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getLastName().getErrorMessage(), false, AbstractC8693b.m21270d(EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getLastName().getErrorMessage()), z15, z16, 52, null), new FieldState(EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getHeight().getValue(), EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getHeight().getErrorMessage(), false, AbstractC8693b.m21270d(EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getHeight().getErrorMessage()), z16, z17, 52, null), new FieldState(EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getWeight().getValue(), EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getWeight().getErrorMessage(), false, AbstractC8693b.m21270d(EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getWeight().getErrorMessage()), z17, z18, 52, null), new FieldState(EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getUnitSystem().getValue(), null, false, AbstractC8693b.m21270d(EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getUnitSystem().getErrorMessage()), z18, z19, 54, null), new FieldState(EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getGender().getValue(), EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getGender().getErrorMessage(), false, AbstractC8693b.m21270d(EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getGender().getErrorMessage()), z19, z24, 52, null), new FieldState(EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getPhysiologicalBaseline().getValue(), EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getPhysiologicalBaseline().getErrorMessage(), false, AbstractC8693b.m21270d(EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getPhysiologicalBaseline().getErrorMessage()), z24, z25, 52, null), new FieldState(EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getCountry().getValue(), EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getCountry().getErrorMessage(), false, AbstractC8693b.m21270d(EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getCountry().getErrorMessage()), z25, z26, 52, null), new FieldState(EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getState().getValue(), EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getState().getErrorMessage(), false, AbstractC8693b.m21270d(EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getState().getErrorMessage()), z26, z27, 52, null), new FieldState(EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getBirthday().getValue(), EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getBirthday().getErrorMessage(), false, AbstractC8693b.m21270d(EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getBirthday().getErrorMessage()), z27, z28, 52, null), new FieldState(EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getCity().getValue(), EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getCity().getErrorMessage(), false, AbstractC8693b.m21270d(EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getEditableFields().getCity().getErrorMessage()), z28, false, 52, null)));
            }
            boolean zM87153g6 = c28655q.m87153g(EditProfileScreen$lambda$3(interfaceC28601c6)) | c28655q.m87153g(EditProfileScreen$lambda$1(interfaceC28601c1M87260n).getProfileData());
            Object objM87133R12 = c28655q.m87133R();
            if (zM87153g6 || objM87133R12 == c28676v0) {
                interfaceC28601c1 = interfaceC28601c1M87260n;
                interfaceC28601c2 = interfaceC28601c6;
                map = map2;
                interfaceC23462h = interfaceC23462h3;
                objM87133R12 = new C1042s(interfaceC28601c2, (Object) map, (Object) interfaceC28601c1, (Object) interfaceC23462h, 12);
                c28655q.m87172p0(objM87133R12);
            } else {
                interfaceC28601c1 = interfaceC28601c1M87260n;
                interfaceC28601c2 = interfaceC28601c6;
                map = map2;
                interfaceC23462h = interfaceC23462h3;
            }
            Function1 function2 = (Function1) objM87133R12;
            boolean zM87153g7 = c28655q.m87153g(EditProfileScreen$lambda$3(interfaceC28601c2));
            Object objM87133R13 = c28655q.m87133R();
            if (zM87153g7 || objM87133R13 == c28676v0) {
                InterfaceC23462h interfaceC23462h4 = interfaceC23462h;
                InterfaceC28601c1 interfaceC28601c9 = interfaceC28601c1;
                function1 = function2;
                objM87133R13 = new C0556g((Object) interfaceC28601c2, (Object) map, function1, (Object) interfaceC28601c9, (Object) interfaceC23462h4, 3);
                interfaceC28601c3 = interfaceC28601c9;
                interfaceC23462h2 = interfaceC23462h4;
                c28655q.m87172p0(objM87133R13);
            } else {
                interfaceC28601c3 = interfaceC28601c1;
                interfaceC23462h2 = interfaceC23462h;
                function1 = function2;
            }
            InterfaceC4351m interfaceC4351m2 = (InterfaceC4351m) objM87133R13;
            if (fullScreenModal2 != null) {
                c28655q.m87150e0(-784165710);
                boolean zM87157i2 = c28655q.m87157i(interfaceC23462h2) | c28655q.m87157i(abstractC12939a2);
                Object objM87133R14 = c28655q.m87133R();
                if (zM87157i2 || objM87133R14 == c28676v0) {
                    objM87133R14 = new C9790n(0, abstractC12939a2, interfaceC23462h2);
                    c28655q.m87172p0(objM87133R14);
                }
                EditProfileFullScreenModalKt.EditProfileFullScreenModal(fullScreenModal2, (Function1) objM87133R14, c28655q, 0);
                c28655q.m87173q(false);
                interfaceC28601c7 = interfaceC28601c7;
                z4 = false;
                abstractC12939a2 = abstractC12939a2;
                interfaceC4351m = interfaceC4351m2;
            } else {
                c28655q.m87150e0(1461081486);
                EditProfileFormState editProfileFormStateEditProfileScreen$lambda$3 = EditProfileScreen$lambda$3(interfaceC28601c2);
                if (editProfileFormStateEditProfileScreen$lambda$3 == null) {
                    c28655q.m87150e0(1461081485);
                    c28655q.m87173q(false);
                    z4 = false;
                    interfaceC4351m = interfaceC4351m2;
                } else {
                    c28655q.m87150e0(1461081486);
                    EditProfileViewState editProfileViewStateEditProfileScreen$lambda$1 = EditProfileScreen$lambda$1(interfaceC28601c3);
                    EditProfileViewModel editProfileViewModelEditProfileScreen$lambda$1 = EditProfileScreen$lambda$0(interfaceC23462h2);
                    boolean zM87157i3 = c28655q.m87157i(editProfileViewModelEditProfileScreen$lambda$1);
                    Object objM87133R15 = c28655q.m87133R();
                    if (zM87157i3 || objM87133R15 == c28676v0) {
                        objM87133R15 = new EditProfileScreenKt$EditProfileScreen$7$1$1(editProfileViewModelEditProfileScreen$lambda$1);
                        c28655q.m87172p0(objM87133R15);
                    }
                    Function1 function3 = (Function1) ((InterfaceC21467g) objM87133R15);
                    boolean zM87157i4 = c28655q.m87157i(editProfileFormStateEditProfileScreen$lambda$3) | c28655q.m87153g(interfaceC28601c3) | c28655q.m87157i(abstractC12939a2);
                    Object objM87133R16 = c28655q.m87133R();
                    if (zM87157i4 || objM87133R16 == c28676v0) {
                        editProfileFormState = editProfileFormStateEditProfileScreen$lambda$3;
                        c1042s = new C1042s(editProfileFormState, abstractC12939a2, interfaceC28601c3, interfaceC28601c8, 13);
                        c28655q.m87172p0(c1042s);
                    } else {
                        c1042s = objM87133R16;
                        editProfileFormState = editProfileFormStateEditProfileScreen$lambda$3;
                    }
                    Function1 function4 = (Function1) c1042s;
                    boolean zM87157i5 = c28655q.m87157i(interfaceC23462h2);
                    Object objM87133R17 = c28655q.m87133R();
                    if (zM87157i5 || objM87133R17 == c28676v0) {
                        objM87133R17 = new C9791o(interfaceC23462h2, 0);
                        c28655q.m87172p0(objM87133R17);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R17;
                    Object objM87133R18 = c28655q.m87133R();
                    if (objM87133R18 == c28676v0) {
                        objM87133R18 = new C2192m(20, interfaceC28601c7);
                        c28655q.m87172p0(objM87133R18);
                    }
                    EditProfileFormState editProfileFormState2 = editProfileFormState;
                    interfaceC4351m = interfaceC4351m2;
                    EditProfileContentKt.EditProfileContent(editProfileViewStateEditProfileScreen$lambda$1, editProfileFormState2, interfaceC34116n, function3, function4, interfaceC4351m, function1, interfaceC4339a, (InterfaceC4339a) objM87133R18, c28655q, 100663296 | (i18 << 3), 0);
                    c28655q = c28655q;
                    z4 = false;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z4);
            }
            if (EditProfileScreen$lambda$6(interfaceC28601c7)) {
                c28655q.m87150e0(-784111064);
                EditProfileFormState editProfileFormStateEditProfileScreen$lambda$4 = EditProfileScreen$lambda$3(interfaceC28601c2);
                if (editProfileFormStateEditProfileScreen$lambda$4 == null) {
                    c28655q.m87150e0(1462360793);
                    c28655q.m87173q(z4);
                } else {
                    c28655q.m87150e0(1462360794);
                    String value = editProfileFormStateEditProfileScreen$lambda$4.getBirthday().getValue();
                    Object objM87133R19 = c28655q.m87133R();
                    if (objM87133R19 == c28676v0) {
                        interfaceC28601c5 = interfaceC28601c7;
                        objM87133R19 = new C2192m(21, interfaceC28601c5);
                        c28655q.m87172p0(objM87133R19);
                    } else {
                        interfaceC28601c5 = interfaceC28601c7;
                    }
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R19;
                    boolean zM87153g8 = c28655q.m87153g(interfaceC4351m);
                    Object objM87133R20 = c28655q.m87133R();
                    if (zM87153g8 || objM87133R20 == c28676v0) {
                        objM87133R20 = new C9792p(interfaceC4351m, interfaceC28601c5, 0);
                        c28655q.m87172p0(objM87133R20);
                    }
                    BirthdayContentKt.BirthdayContent(value, interfaceC4339a2, (Function1) objM87133R20, c28655q, 48);
                    z4 = false;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z4);
            } else {
                c28655q.m87150e0(1462765561);
                c28655q.m87173q(z4);
            }
            if (EditProfileScreen$lambda$9(interfaceC28601c8)) {
                c28655q.m87150e0(1462825670);
                TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(C9691R.string.profile_discard_changes_title);
                TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(C9691R.string.profile_discard_changes_message);
                TextResource.C8688b c8688bM21277k3 = AbstractC8693b.m21277k(C9691R.string.profile_discard_changes_discard);
                TextResource.C8688b c8688bM21277k4 = AbstractC8693b.m21277k(C9691R.string.profile_discard_changes_cancel);
                Object objM87133R21 = c28655q.m87133R();
                if (objM87133R21 == c28676v0) {
                    interfaceC28601c4 = interfaceC28601c8;
                    objM87133R21 = new C2192m(18, interfaceC28601c4);
                    c28655q.m87172p0(objM87133R21);
                } else {
                    interfaceC28601c4 = interfaceC28601c8;
                }
                InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R21;
                Object objM87133R22 = c28655q.m87133R();
                if (objM87133R22 == c28676v0) {
                    objM87133R22 = new C2192m(19, interfaceC28601c4);
                    c28655q.m87172p0(objM87133R22);
                }
                InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R22;
                boolean zM87157i6 = c28655q.m87157i(abstractC12939a2);
                Object objM87133R23 = c28655q.m87133R();
                if (zM87157i6 || objM87133R23 == c28676v0) {
                    objM87133R23 = new C3603v(23, abstractC12939a2, interfaceC28601c4);
                    c28655q.m87172p0(objM87133R23);
                }
                int i19 = TextResource.C8688b.f25889c;
                C28655q c28655q2 = c28655q;
                abstractC12939a1 = abstractC12939a2;
                AbstractC21211n.m59497o(null, c8688bM21277k, c8688bM21277k2, c8688bM21277k3, false, null, null, null, null, c8688bM21277k4, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a3, interfaceC4339a4, (InterfaceC4339a) objM87133R23, null, null, null, c28655q2, (i19 << 3) | (i19 << 6) | (i19 << 9) | (i19 << 27), 384, 3456, 239070705);
                c28655q = c28655q2;
                c28655q.m87173q(z4);
            } else {
                abstractC12939a1 = abstractC12939a2;
                c28655q.m87150e0(1463495673);
                c28655q.m87173q(z4);
            }
            abstractC12939a0M44439S = abstractC12939a1;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9723b(abstractC12939a0M44439S, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditProfileViewModel EditProfileScreen$lambda$0(InterfaceC23462h interfaceC23462h) {
        return (EditProfileViewModel) interfaceC23462h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditProfileViewState EditProfileScreen$lambda$1(InterfaceC28670t2 interfaceC28670t2) {
        return (EditProfileViewState) interfaceC28670t2.getValue();
    }

    private static final void EditProfileScreen$lambda$10(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileScreen$lambda$18$0(InterfaceC28601c1 interfaceC28601c1, Map map, InterfaceC28670t2 interfaceC28670t2, InterfaceC23462h interfaceC23462h, EditProfileEvent.FieldType fieldType) {
        AbstractC22676k.m65750j(fieldType, "fieldType");
        EditProfileFormState editProfileFormStateEditProfileScreen$lambda$3 = EditProfileScreen$lambda$3(interfaceC28601c1);
        if (editProfileFormStateEditProfileScreen$lambda$3 != null) {
            if (WhenMappings.$EnumSwitchMapping$0[fieldType.ordinal()] == 1) {
                interfaceC28601c1.setValue(EditProfileFormUtils.INSTANCE.handleUsernameFieldBlur(editProfileFormStateEditProfileScreen$lambda$3, EditProfileScreen$lambda$1(interfaceC28670t2).getEditableFields().getUsername().getValue(), EditProfileScreen$lambda$1(interfaceC28670t2).getShowUsernameField(), EditProfileScreen$lambda$1(interfaceC28670t2).getUsernameValidationState().getLastValidatedUsername()));
            } else {
                EditProfileFormUtils.EmailValidationResult emailValidationResultHandleEmailValidation = EditProfileFormUtils.INSTANCE.handleEmailValidation(editProfileFormStateEditProfileScreen$lambda$3, fieldType, EditProfileScreen$lambda$1(interfaceC28670t2).getProfileData(), map);
                interfaceC28601c1.setValue(emailValidationResultHandleEmailValidation.getFormState());
                if (fieldType == EditProfileEvent.FieldType.EMAIL && emailValidationResultHandleEmailValidation.getShouldTriggerApiValidation() && emailValidationResultHandleEmailValidation.getEmailToValidate() != null && !AbstractC39414r.m125890i0(emailValidationResultHandleEmailValidation.getEmailToValidate())) {
                    EditProfileScreen$lambda$0(interfaceC23462h).sendViewEvent(new EditProfileEvent.ValidateEmailField(emailValidationResultHandleEmailValidation.getEmailToValidate()));
                }
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileScreen$lambda$19$0(InterfaceC28601c1 interfaceC28601c1, Map map, Function1 function1, InterfaceC28670t2 interfaceC28670t2, InterfaceC23462h interfaceC23462h, EditProfileEvent.FieldType fieldType, String value) {
        EditProfileFormUtils editProfileFormUtils;
        EditProfileFormUtils.UpdateFieldValueResult updateFieldValueResultUpdateFieldValue;
        AbstractC22676k.m65750j(fieldType, "fieldType");
        AbstractC22676k.m65750j(value, "value");
        EditProfileFormState editProfileFormStateEditProfileScreen$lambda$3 = EditProfileScreen$lambda$3(interfaceC28601c1);
        if (editProfileFormStateEditProfileScreen$lambda$3 != null && (updateFieldValueResultUpdateFieldValue = (editProfileFormUtils = EditProfileFormUtils.INSTANCE).updateFieldValue(editProfileFormStateEditProfileScreen$lambda$3, fieldType, value, map)) != null) {
            EditProfileFormState formState = updateFieldValueResultUpdateFieldValue.getFormState();
            if (fieldType == EditProfileEvent.FieldType.USERNAME && EditProfileScreen$lambda$1(interfaceC28670t2).getShowUsernameField()) {
                String value2 = EditProfileScreen$lambda$1(interfaceC28670t2).getEditableFields().getUsername().getValue();
                boolean zShouldTriggerUsernameValidation = editProfileFormUtils.shouldTriggerUsernameValidation(value, value2);
                formState = EditProfileFormState.copy$default(formState, null, FieldState.copy$default(formState.getUsername(), null, null, false, false, false, zShouldTriggerUsernameValidation, 31, null), null, null, null, null, null, null, null, null, null, null, null, 8189, null);
                if (zShouldTriggerUsernameValidation) {
                    EditProfileScreen$lambda$0(interfaceC23462h).sendViewEvent(new EditProfileEvent.ValidateUsernameField(value));
                } else if (value.equals(value2)) {
                    EditProfileScreen$lambda$0(interfaceC23462h).sendViewEvent(EditProfileEvent.ClearUsernameValidation.INSTANCE);
                }
            }
            interfaceC28601c1.setValue(formState);
            if (updateFieldValueResultUpdateFieldValue.getShouldValidateState()) {
                function1.invoke(EditProfileEvent.FieldType.STATE);
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileScreen$lambda$20$0(AbstractC12939a0 abstractC12939a0, InterfaceC23462h interfaceC23462h, EditProfileEvent event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof EditProfileEvent.ViewEvent) {
            EditProfileScreen$lambda$0(interfaceC23462h).sendViewEvent((EditProfileEvent.ViewEvent) event);
        } else {
            if (!(event instanceof EditProfileEvent.NavigationEvent)) {
                throw new NoWhenBranchMatchedException();
            }
            handleNavigationEvent((EditProfileEvent.NavigationEvent) event, abstractC12939a0);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileScreen$lambda$21$1$0(EditProfileFormState editProfileFormState, AbstractC12939a0 abstractC12939a0, InterfaceC28670t2 interfaceC28670t2, InterfaceC28601c1 interfaceC28601c1, EditProfileEvent.NavigationEvent event) {
        AbstractC22676k.m65750j(event, "event");
        if (event.equals(EditProfileEvent.GoBack.INSTANCE) && editProfileFormState.isAnyFieldDirty(EditProfileScreen$lambda$1(interfaceC28670t2).getEditableFields(), EditProfileScreen$lambda$1(interfaceC28670t2).getShowUsernameField())) {
            EditProfileScreen$lambda$10(interfaceC28601c1, true);
        } else {
            handleNavigationEvent(event, abstractC12939a0);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileScreen$lambda$21$2$0(InterfaceC23462h interfaceC23462h) {
        EditProfileScreen$lambda$0(interfaceC23462h).sendViewEvent(EditProfileEvent.UsernameFieldTapped.INSTANCE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileScreen$lambda$21$3$0(InterfaceC28601c1 interfaceC28601c1) {
        EditProfileScreen$lambda$7(interfaceC28601c1, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileScreen$lambda$22$0$0(InterfaceC28601c1 interfaceC28601c1) {
        EditProfileScreen$lambda$7(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileScreen$lambda$22$1$0(InterfaceC4351m interfaceC4351m, InterfaceC28601c1 interfaceC28601c1, String selectedDate) {
        AbstractC22676k.m65750j(selectedDate, "selectedDate");
        interfaceC4351m.invoke(EditProfileEvent.FieldType.BIRTHDAY, selectedDate);
        EditProfileScreen$lambda$7(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileScreen$lambda$23$0(InterfaceC28601c1 interfaceC28601c1) {
        EditProfileScreen$lambda$10(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileScreen$lambda$24$0(InterfaceC28601c1 interfaceC28601c1) {
        EditProfileScreen$lambda$10(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileScreen$lambda$25$0(AbstractC12939a0 abstractC12939a0, InterfaceC28601c1 interfaceC28601c1) {
        EditProfileScreen$lambda$10(interfaceC28601c1, false);
        abstractC12939a0.m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileScreen$lambda$26(AbstractC12939a0 abstractC12939a0, int i13, int i14, Composer composer, int i15) {
        EditProfileScreen(abstractC12939a0, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditProfileFormState EditProfileScreen$lambda$3(InterfaceC28601c1 interfaceC28601c1) {
        return (EditProfileFormState) interfaceC28601c1.getValue();
    }

    private static final boolean EditProfileScreen$lambda$6(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    private static final void EditProfileScreen$lambda$7(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    private static final boolean EditProfileScreen$lambda$9(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    private static final void handleNavigationEvent(EditProfileEvent.NavigationEvent navigationEvent, AbstractC12939a0 abstractC12939a0) {
        if (AbstractC22676k.m65745e(navigationEvent, EditProfileEvent.GoBack.INSTANCE)) {
            abstractC12939a0.m36410z();
        }
    }
}
