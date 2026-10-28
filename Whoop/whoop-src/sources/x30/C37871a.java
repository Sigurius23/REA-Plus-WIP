package x30;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.proto.C1533u;
import com.stripe.android.p056ui.core.elements.AddressSpec;
import com.stripe.android.p056ui.core.elements.AffirmTextSpec;
import com.stripe.android.p056ui.core.elements.AfterpayClearpayTextSpec;
import com.stripe.android.p056ui.core.elements.AuBankAccountNumberSpec;
import com.stripe.android.p056ui.core.elements.AuBecsDebitMandateTextSpec;
import com.stripe.android.p056ui.core.elements.BacsDebitBankAccountSpec;
import com.stripe.android.p056ui.core.elements.BacsDebitConfirmSpec;
import com.stripe.android.p056ui.core.elements.BsbSpec;
import com.stripe.android.p056ui.core.elements.Capitalization;
import com.stripe.android.p056ui.core.elements.CashAppPayMandateTextSpec;
import com.stripe.android.p056ui.core.elements.CountrySpec;
import com.stripe.android.p056ui.core.elements.DisplayField;
import com.stripe.android.p056ui.core.elements.DropdownItemSpec;
import com.stripe.android.p056ui.core.elements.DropdownSpec;
import com.stripe.android.p056ui.core.elements.EmailSpec;
import com.stripe.android.p056ui.core.elements.EmptyFormSpec;
import com.stripe.android.p056ui.core.elements.ExternalPaymentMethodSpec;
import com.stripe.android.p056ui.core.elements.IbanSpec;
import com.stripe.android.p056ui.core.elements.KeyboardType;
import com.stripe.android.p056ui.core.elements.KlarnaHeaderStaticTextSpec;
import com.stripe.android.p056ui.core.elements.KlarnaMandateTextSpec;
import com.stripe.android.p056ui.core.elements.MandateTextSpec;
import com.stripe.android.p056ui.core.elements.NameSpec;
import com.stripe.android.p056ui.core.elements.OTPSpec;
import com.stripe.android.p056ui.core.elements.PhoneSpec;
import com.stripe.android.p056ui.core.elements.SelectorIcon;
import com.stripe.android.p056ui.core.elements.SepaMandateTextSpec;
import com.stripe.android.p056ui.core.elements.SharedDataSpec;
import com.stripe.android.p056ui.core.elements.SimpleTextSpec;
import com.stripe.android.p056ui.core.elements.StaticTextSpec;
import com.stripe.android.p056ui.core.elements.TranslationId;
import com.stripe.android.uicore.elements.IdentifierSpec;
import g40.AbstractC15387m;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: x30.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C37871a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f162187a;

    public /* synthetic */ C37871a(int i13) {
        this.f162187a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f162187a) {
            case 0:
                AbstractC22676k.m65750j(parcel, "parcel");
                IdentifierSpec identifierSpec = (IdentifierSpec) parcel.readParcelable(AddressSpec.class.getClassLoader());
                int i13 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i13);
                int iM106646e = 0;
                while (true) {
                    boolean z4 = true;
                    if (iM106646e == i13) {
                        int i14 = parcel.readInt();
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet(i14);
                        for (int i15 = 0; i15 != i14; i15++) {
                            linkedHashSet2.add(DisplayField.valueOf(parcel.readString()));
                        }
                        if (parcel.readInt() == 0) {
                            z4 = false;
                        }
                        return new AddressSpec(identifierSpec, linkedHashSet, linkedHashSet2, z4, (AbstractC15387m) parcel.readParcelable(AddressSpec.class.getClassLoader()), parcel.readInt() != 0);
                    }
                    iM106646e = AbstractC33745d.m106646e(parcel, linkedHashSet, iM106646e, 1);
                }
                break;
            case 1:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new AffirmTextSpec((IdentifierSpec) parcel.readParcelable(AffirmTextSpec.class.getClassLoader()));
            case 2:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new AfterpayClearpayTextSpec((IdentifierSpec) parcel.readParcelable(AfterpayClearpayTextSpec.class.getClassLoader()));
            case 3:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new AuBankAccountNumberSpec((IdentifierSpec) parcel.readParcelable(AuBankAccountNumberSpec.class.getClassLoader()));
            case 4:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new AuBecsDebitMandateTextSpec((IdentifierSpec) parcel.readParcelable(AuBecsDebitMandateTextSpec.class.getClassLoader()));
            case 5:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return new BacsDebitBankAccountSpec();
            case 6:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return new BacsDebitConfirmSpec();
            case 7:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new BsbSpec((IdentifierSpec) parcel.readParcelable(BsbSpec.class.getClassLoader()));
            case 8:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new CashAppPayMandateTextSpec((IdentifierSpec) parcel.readParcelable(CashAppPayMandateTextSpec.class.getClassLoader()), parcel.readInt());
            case 9:
                AbstractC22676k.m65750j(parcel, "parcel");
                IdentifierSpec identifierSpec2 = (IdentifierSpec) parcel.readParcelable(CountrySpec.class.getClassLoader());
                int i16 = parcel.readInt();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet(i16);
                int iM106646e2 = 0;
                while (iM106646e2 != i16) {
                    iM106646e2 = AbstractC33745d.m106646e(parcel, linkedHashSet3, iM106646e2, 1);
                }
                return new CountrySpec(identifierSpec2, linkedHashSet3);
            case 10:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new DropdownItemSpec(parcel.readString(), parcel.readString());
            case 11:
                AbstractC22676k.m65750j(parcel, "parcel");
                IdentifierSpec identifierSpec3 = (IdentifierSpec) parcel.readParcelable(DropdownSpec.class.getClassLoader());
                TranslationId translationIdValueOf = TranslationId.valueOf(parcel.readString());
                int i17 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i17);
                for (int i18 = 0; i18 != i17; i18++) {
                    arrayList.add(parcel.readParcelable(DropdownSpec.class.getClassLoader()));
                }
                return new DropdownSpec(identifierSpec3, translationIdValueOf, arrayList);
            case 12:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new EmailSpec((IdentifierSpec) parcel.readParcelable(EmailSpec.class.getClassLoader()));
            case 13:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return EmptyFormSpec.INSTANCE;
            case 14:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new ExternalPaymentMethodSpec(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 15:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new IbanSpec((IdentifierSpec) parcel.readParcelable(IbanSpec.class.getClassLoader()));
            case 16:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new KlarnaHeaderStaticTextSpec((IdentifierSpec) parcel.readParcelable(KlarnaHeaderStaticTextSpec.class.getClassLoader()));
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new KlarnaMandateTextSpec((IdentifierSpec) parcel.readParcelable(KlarnaMandateTextSpec.class.getClassLoader()), parcel.readInt());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new MandateTextSpec((IdentifierSpec) parcel.readParcelable(MandateTextSpec.class.getClassLoader()), parcel.readInt());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new NameSpec((IdentifierSpec) parcel.readParcelable(NameSpec.class.getClassLoader()), TranslationId.valueOf(parcel.readString()));
            case 20:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return OTPSpec.INSTANCE;
            case 21:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new PhoneSpec((IdentifierSpec) parcel.readParcelable(PhoneSpec.class.getClassLoader()));
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new SelectorIcon(parcel.readString(), parcel.readString());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new SepaMandateTextSpec((IdentifierSpec) parcel.readParcelable(SepaMandateTextSpec.class.getClassLoader()), parcel.readInt());
            case 24:
                AbstractC22676k.m65750j(parcel, "parcel");
                String string = parcel.readString();
                int i19 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i19);
                for (int i24 = 0; i24 != i19; i24++) {
                    arrayList2.add(parcel.readParcelable(SharedDataSpec.class.getClassLoader()));
                }
                return new SharedDataSpec(string, arrayList2, parcel.readInt() == 0 ? null : SelectorIcon.CREATOR.createFromParcel(parcel));
            case 25:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new SimpleTextSpec((IdentifierSpec) parcel.readParcelable(SimpleTextSpec.class.getClassLoader()), parcel.readInt(), Capitalization.valueOf(parcel.readString()), KeyboardType.valueOf(parcel.readString()), parcel.readInt() != 0);
            default:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new StaticTextSpec((IdentifierSpec) parcel.readParcelable(StaticTextSpec.class.getClassLoader()), parcel.readInt());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f162187a) {
            case 0:
                return new AddressSpec[i13];
            case 1:
                return new AffirmTextSpec[i13];
            case 2:
                return new AfterpayClearpayTextSpec[i13];
            case 3:
                return new AuBankAccountNumberSpec[i13];
            case 4:
                return new AuBecsDebitMandateTextSpec[i13];
            case 5:
                return new BacsDebitBankAccountSpec[i13];
            case 6:
                return new BacsDebitConfirmSpec[i13];
            case 7:
                return new BsbSpec[i13];
            case 8:
                return new CashAppPayMandateTextSpec[i13];
            case 9:
                return new CountrySpec[i13];
            case 10:
                return new DropdownItemSpec[i13];
            case 11:
                return new DropdownSpec[i13];
            case 12:
                return new EmailSpec[i13];
            case 13:
                return new EmptyFormSpec[i13];
            case 14:
                return new ExternalPaymentMethodSpec[i13];
            case 15:
                return new IbanSpec[i13];
            case 16:
                return new KlarnaHeaderStaticTextSpec[i13];
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new KlarnaMandateTextSpec[i13];
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new MandateTextSpec[i13];
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new NameSpec[i13];
            case 20:
                return new OTPSpec[i13];
            case 21:
                return new PhoneSpec[i13];
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new SelectorIcon[i13];
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new SepaMandateTextSpec[i13];
            case 24:
                return new SharedDataSpec[i13];
            case 25:
                return new SimpleTextSpec[i13];
            default:
                return new StaticTextSpec[i13];
        }
    }
}
