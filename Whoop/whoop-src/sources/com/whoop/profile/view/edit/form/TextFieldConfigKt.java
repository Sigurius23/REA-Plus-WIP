package com.whoop.profile.view.edit.form;

import com.whoop.profile.C9691R;
import com.whoop.profile.presentation.edit.EditProfileEvent;
import java.util.ArrayList;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0007"}, m65681d2 = {"createTextFieldConfigs", "", "Lcom/whoop/profile/view/edit/form/TextFieldConfig;", "formState", "Lcom/whoop/profile/view/edit/form/EditProfileFormState;", "includeUsername", "", "profile_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class TextFieldConfigKt {
    public static final List<TextFieldConfig> createTextFieldConfigs(EditProfileFormState formState, boolean z4) {
        AbstractC22676k.m65750j(formState, "formState");
        ArrayList arrayList = new ArrayList();
        if (z4) {
            arrayList.add(new TextFieldConfig(EditProfileEvent.FieldType.USERNAME, C9691R.string.profile_edit_username_label, 1, 6, formState.getUsername(), null));
        }
        arrayList.add(new TextFieldConfig(EditProfileEvent.FieldType.FIRST_NAME, C9691R.string.profile_edit_first_name_label, 1, 6, formState.getFirstName(), null));
        arrayList.add(new TextFieldConfig(EditProfileEvent.FieldType.LAST_NAME, C9691R.string.profile_edit_last_name_label, 1, 6, formState.getLastName(), null));
        arrayList.add(new TextFieldConfig(EditProfileEvent.FieldType.CITY, C9691R.string.profile_edit_city_label, 1, 7, formState.getCity(), null));
        return arrayList;
    }
}
