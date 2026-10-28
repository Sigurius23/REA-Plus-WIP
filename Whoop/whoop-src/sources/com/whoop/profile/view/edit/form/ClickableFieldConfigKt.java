package com.whoop.profile.view.edit.form;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.domain.model.UnitSystemExtKt;
import com.whoop.profile.C9691R;
import com.whoop.profile.domain.models.Gender;
import com.whoop.profile.domain.models.PhysiologicalBaseline;
import com.whoop.profile.presentation.edit.EditProfileViewState;
import d21.C11503a;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25260n;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nH\u0002\u001a\u001c\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u000f"}, m65681d2 = {"createClickableFieldConfigs", "", "Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;", "profileData", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;", "formState", "Lcom/whoop/profile/view/edit/form/EditProfileFormState;", "getGenderDisplayText", "Lcom/whoop/design/util/TextResource;", "genderValue", "", "getPhysiologicalBaselineDisplayText", "baselineValue", "createHeightWeightGroupedField", "Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;", "profile_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ClickableFieldConfigKt {

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Gender.values().length];
            try {
                iArr[Gender.FEMALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Gender.MALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Gender.NON_BINARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Gender.PREFER_NOT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PhysiologicalBaseline.values().length];
            try {
                iArr2[PhysiologicalBaseline.FEMALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PhysiologicalBaseline.MALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PhysiologicalBaseline.AVERAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0145  */
    /* JADX WARN: Code duplicated, block: B:75:0x0153  */
    /* JADX WARN: Code duplicated, block: B:76:0x0161  */
    public static final List<ClickableFieldConfig> createClickableFieldConfigs(EditProfileViewState.EditProfileData editProfileData, EditProfileFormState formState) {
        EditProfileViewState.Country country;
        TextResource textResourceM21267a;
        ClickableFieldConfig clickableFieldConfig;
        TextResource textResourceM21267a2;
        List<EditProfileViewState.Country> countries;
        Object next;
        List<EditProfileViewState.State> states;
        Object next2;
        List<EditProfileViewState.Country> countries2;
        Object next3;
        List<EditProfileViewState.State> states2;
        List<EditProfileViewState.Country> countries3;
        Object next4;
        AbstractC22676k.m65750j(formState, "formState");
        if (editProfileData == null || (countries3 = editProfileData.getCountries()) == null) {
            country = null;
        } else {
            Iterator<T> it = countries3.iterator();
            do {
                if (!it.hasNext()) {
                    next4 = null;
                    break;
                }
                next4 = it.next();
            } while (!AbstractC22676k.m65745e(((EditProfileViewState.Country) next4).getCountryCode(), formState.getCountry().getValue()));
            country = (EditProfileViewState.Country) next4;
        }
        boolean z4 = false;
        if (country != null && (states2 = country.getStates()) != null && (!states2.isEmpty())) {
            z4 = true;
        }
        boolean zRequiresPhysiologicalBaseline = Gender.valueOf(formState.getGender().getValue()).requiresPhysiologicalBaseline();
        EditProfileViewState.BottomSheetType bottomSheetType = EditProfileViewState.BottomSheetType.COUNTRY;
        int i13 = C9691R.string.profile_edit_country_label;
        if (editProfileData == null || (countries2 = editProfileData.getCountries()) == null) {
            textResourceM21267a = AbstractC8693b.m21267a();
        } else {
            Iterator<T> it3 = countries2.iterator();
            do {
                if (!it3.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it3.next();
            } while (!AbstractC22676k.m65745e(((EditProfileViewState.Country) next3).getCountryCode(), formState.getCountry().getValue()));
            EditProfileViewState.Country country2 = (EditProfileViewState.Country) next3;
            if (country2 == null || (textResourceM21267a = country2.getName()) == null) {
                textResourceM21267a = AbstractC8693b.m21267a();
            }
        }
        ClickableFieldConfig clickableFieldConfig2 = new ClickableFieldConfig(bottomSheetType, i13, textResourceM21267a, false, false, null, 56, null);
        if (z4) {
            EditProfileViewState.BottomSheetType bottomSheetType2 = EditProfileViewState.BottomSheetType.STATE;
            int i14 = C9691R.string.profile_edit_state_label;
            if (editProfileData != null && (countries = editProfileData.getCountries()) != null) {
                Iterator<T> it4 = countries.iterator();
                do {
                    if (!it4.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it4.next();
                } while (!AbstractC22676k.m65745e(((EditProfileViewState.Country) next).getCountryCode(), formState.getCountry().getValue()));
                EditProfileViewState.Country country3 = (EditProfileViewState.Country) next;
                if (country3 != null && (states = country3.getStates()) != null) {
                    Iterator<T> it5 = states.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it5.next();
                        EditProfileViewState.State state = (EditProfileViewState.State) next2;
                        if (AbstractC22676k.m65745e(state.getCode(), formState.getState().getValue()) || ((state.getName() instanceof TextResource.C8691e) && AbstractC39421y.m125921F(((TextResource.C8691e) state.getName()).getValue().toString(), formState.getState().getValue(), true))) {
                            break;
                        }
                    }
                    EditProfileViewState.State state2 = (EditProfileViewState.State) next2;
                    if (state2 == null || (textResourceM21267a2 = state2.getName()) == null) {
                        if (formState.getState().getValue().length() > 0) {
                            textResourceM21267a2 = new TextResource.C8691e(formState.getState().getValue());
                        } else {
                            textResourceM21267a2 = AbstractC8693b.m21267a();
                        }
                    }
                } else if (formState.getState().getValue().length() > 0) {
                    textResourceM21267a2 = new TextResource.C8691e(formState.getState().getValue());
                } else {
                    textResourceM21267a2 = AbstractC8693b.m21267a();
                }
            } else if (formState.getState().getValue().length() > 0) {
                textResourceM21267a2 = new TextResource.C8691e(formState.getState().getValue());
            } else {
                textResourceM21267a2 = AbstractC8693b.m21267a();
            }
            clickableFieldConfig = new ClickableFieldConfig(bottomSheetType2, i14, textResourceM21267a2, false, AbstractC8693b.m21270d(formState.getState().getError()), formState.getState().getError(), 8, null);
        } else {
            clickableFieldConfig = null;
        }
        return AbstractC25260n.m74077r0(new ClickableFieldConfig[]{clickableFieldConfig2, clickableFieldConfig, new ClickableFieldConfig(EditProfileViewState.BottomSheetType.GENDER, C9691R.string.profile_edit_gender_label, getGenderDisplayText(formState.getGender().getValue()), false, false, null, 56, null), zRequiresPhysiologicalBaseline ? new ClickableFieldConfig(EditProfileViewState.BottomSheetType.PHYSIOLOGICAL_BASELINE, C9691R.string.profile_edit_physiological_baseline_label, getPhysiologicalBaselineDisplayText(formState.getPhysiologicalBaseline().getValue()), true, false, null, 48, null) : null});
    }

    public static final HeightWeightGroupedField createHeightWeightGroupedField(EditProfileViewState.EditProfileData editProfileData, EditProfileFormState formState) {
        AbstractC22676k.m65750j(formState, "formState");
        if (editProfileData == null) {
            return null;
        }
        boolean zIsImperial = UnitSystemExtKt.isImperial(editProfileData.getUnitSystem());
        float height = editProfileData.getHeight();
        float weight = (float) editProfileData.getWeight();
        String value = formState.getHeight().getValue();
        if (value.length() == 0) {
            value = String.valueOf(height);
        }
        String str = value;
        String value2 = formState.getWeight().getValue();
        if (value2.length() == 0) {
            value2 = String.valueOf(weight);
        }
        String str2 = value2;
        C11503a c11503a = C11503a.f37005a;
        Float fM125915y = AbstractC39420x.m125915y(str2);
        return new HeightWeightGroupedField(editProfileData.getUnitSystem(), c11503a.m30915d(Float.parseFloat(str), zIsImperial), c11503a.m30916e(c11503a.m30924m(fM125915y != null ? fM125915y.floatValue() : 0.0f), zIsImperial), editProfileData, str, str2);
    }

    private static final TextResource getGenderDisplayText(String str) {
        int i13 = WhenMappings.$EnumSwitchMapping$0[Gender.valueOf(str).ordinal()];
        if (i13 == 1) {
            return new TextResource.C8688b(C9691R.string.profile_gender_woman, null, 2, null);
        }
        if (i13 == 2) {
            return new TextResource.C8688b(C9691R.string.profile_gender_man, null, 2, null);
        }
        if (i13 == 3) {
            return new TextResource.C8688b(C9691R.string.profile_gender_non_binary, null, 2, null);
        }
        if (i13 == 4) {
            return new TextResource.C8688b(C9691R.string.profile_gender_prefer_not_to_specify, null, 2, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final TextResource getPhysiologicalBaselineDisplayText(String str) {
        if (str.length() == 0) {
            return AbstractC8693b.m21267a();
        }
        int i13 = WhenMappings.$EnumSwitchMapping$1[PhysiologicalBaseline.valueOf(str).ordinal()];
        if (i13 == 1) {
            return new TextResource.C8688b(C9691R.string.profile_baseline_female, null, 2, null);
        }
        if (i13 == 2) {
            return new TextResource.C8688b(C9691R.string.profile_baseline_male, null, 2, null);
        }
        if (i13 == 3) {
            return new TextResource.C8688b(C9691R.string.profile_baseline_prefer_not_to_specify, null, 2, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
