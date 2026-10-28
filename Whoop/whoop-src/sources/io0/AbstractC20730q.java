package io0;

import com.whoop.clinicianintheloop.api.PersonalIntakeForm;
import com.whoop.design.models.items.form.FormTextFieldModel;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: io0.q */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;", "Lio0/v;", "type", "Lcom/whoop/design/models/items/form/FormTextFieldModel;", "a", "(Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;Lio0/v;)Lcom/whoop/design/models/items/form/FormTextFieldModel;", "clinician-in-the-loop_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC20730q {

    /* JADX INFO: renamed from: io0.q$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f77792a;

        static {
            int[] iArr = new int[EnumC20735v.values().length];
            try {
                iArr[EnumC20735v.FIRST_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC20735v.LAST_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC20735v.DATE_OF_BIRTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC20735v.ADDRESS_LINE_1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC20735v.ADDRESS_LINE_2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC20735v.CITY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC20735v.STATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC20735v.ZIP_CODE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC20735v.COUNTRY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC20735v.PHONE_NUMBER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f77792a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final FormTextFieldModel m57008a(PersonalIntakeForm personalIntakeForm, EnumC20735v type) {
        AbstractC22676k.m65750j(personalIntakeForm, "<this>");
        AbstractC22676k.m65750j(type, "type");
        switch (a.f77792a[type.ordinal()]) {
            case 1:
                return personalIntakeForm.getFirstName();
            case 2:
                return personalIntakeForm.getLastName();
            case 3:
                return personalIntakeForm.getDateOfBirth();
            case 4:
                return personalIntakeForm.getAddressLine1();
            case 5:
                return personalIntakeForm.getAddressLine2();
            case 6:
                return personalIntakeForm.getCity();
            case 7:
                return personalIntakeForm.getState();
            case 8:
                return personalIntakeForm.getZipCode();
            case 9:
                return personalIntakeForm.getCountry();
            case 10:
                return personalIntakeForm.getPhoneNumber();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
