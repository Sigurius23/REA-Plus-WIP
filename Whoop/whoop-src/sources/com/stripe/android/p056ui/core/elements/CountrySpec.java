package com.stripe.android.p056ui.core.elements;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.IdentifierSpec$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import g40.C15366i0;
import g40.C15413r0;
import g40.C15440w2;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import m63.C25126d;
import p565vy.AbstractC36561a;
import p696zy.InterfaceC41211c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import x30.C37871a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 82\u00020\u0001:\u00029:B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u001a\u001a\u00020\u00192\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\t¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b%\u0010&J*\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b+\u0010\"J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100R \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0003\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010$R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00105\u0012\u0004\b7\u00104\u001a\u0004\b6\u0010&¨\u0006;"}, m65681d2 = {"Lcom/stripe/android/ui/core/elements/CountrySpec;", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "apiPath", "", "", "allowedCountryCodes", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$payments_ui_core_release", "(Lcom/stripe/android/ui/core/elements/CountrySpec;Lzc3/c;Lyc3/g;)V", "write$Self", "", "initialValues", "Lg40/w2;", "transform", "(Ljava/util/Map;)Lg40/w2;", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "component2", "()Ljava/util/Set;", "copy", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;)Lcom/stripe/android/ui/core/elements/CountrySpec;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getApiPath", "getApiPath$annotations", "()V", "Ljava/util/Set;", "getAllowedCountryCodes", "getAllowedCountryCodes$annotations", "Companion", "$serializer", "com/stripe/android/ui/core/elements/j", "payments-ui-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CountrySpec extends FormItemSpec {
    public static final int $stable = 8;
    private final Set<String> allowedCountryCodes;
    private final IdentifierSpec apiPath;
    public static final C5685j Companion = new C5685j();
    public static final Parcelable.Creator<CountrySpec> CREATOR = new C37871a(9);
    private static final InterfaceC37138c[] $childSerializers = {null, new LinkedHashSetSerializer(StringSerializer.INSTANCE)};

    public CountrySpec() {
        this((IdentifierSpec) null, (Set) null, 3, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CountrySpec copy$default(CountrySpec countrySpec, IdentifierSpec identifierSpec, Set set, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            identifierSpec = countrySpec.apiPath;
        }
        if ((i13 & 2) != 0) {
            set = countrySpec.allowedCountryCodes;
        }
        return countrySpec.copy(identifierSpec, set);
    }

    @InterfaceC37143h("allowed_country_codes")
    public static /* synthetic */ void getAllowedCountryCodes$annotations() {
    }

    @InterfaceC37143h("api_path")
    public static /* synthetic */ void getApiPath$annotations() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public static final void write$Self$payments_ui_core_release(CountrySpec self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0)) {
            output.encodeSerializableElement(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.getApiPath());
        } else {
            IdentifierSpec apiPath = self.getApiPath();
            IdentifierSpec.Companion.getClass();
            if (!AbstractC22676k.m65745e(apiPath, IdentifierSpec.Country)) {
                output.encodeSerializableElement(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.getApiPath());
            }
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && AbstractC22676k.m65745e(self.allowedCountryCodes, AbstractC36561a.f156562a)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 1, interfaceC37138cArr[1], self.allowedCountryCodes);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    public final Set<String> component2() {
        return this.allowedCountryCodes;
    }

    public final CountrySpec copy(IdentifierSpec apiPath, Set<String> allowedCountryCodes) {
        AbstractC22676k.m65750j(apiPath, "apiPath");
        AbstractC22676k.m65750j(allowedCountryCodes, "allowedCountryCodes");
        return new CountrySpec(apiPath, allowedCountryCodes);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountrySpec)) {
            return false;
        }
        CountrySpec countrySpec = (CountrySpec) other;
        return AbstractC22676k.m65745e(this.apiPath, countrySpec.apiPath) && AbstractC22676k.m65745e(this.allowedCountryCodes, countrySpec.allowedCountryCodes);
    }

    public final Set<String> getAllowedCountryCodes() {
        return this.allowedCountryCodes;
    }

    @Override // com.stripe.android.p056ui.core.elements.FormItemSpec
    public IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    public int hashCode() {
        return this.allowedCountryCodes.hashCode() + (this.apiPath.hashCode() * 31);
    }

    public String toString() {
        return "CountrySpec(apiPath=" + this.apiPath + ", allowedCountryCodes=" + this.allowedCountryCodes + ")";
    }

    public final C15440w2 transform(Map<IdentifierSpec, String> initialValues) {
        AbstractC22676k.m65750j(initialValues, "initialValues");
        return FormItemSpec.createSectionElement$payments_ui_core_release$default(this, new C15366i0(getApiPath(), new C15413r0(new C25126d(this.allowedCountryCodes, null, null, 62), initialValues.get(getApiPath()))), (InterfaceC41211c) null, 2, (Object) null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.apiPath, flags);
        Set<String> set = this.allowedCountryCodes;
        dest.writeInt(set.size());
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            dest.writeString(it.next());
        }
    }

    public CountrySpec(int i13, IdentifierSpec identifierSpec, Set set, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if ((i13 & 1) == 0) {
            IdentifierSpec.Companion.getClass();
            identifierSpec = IdentifierSpec.Country;
        }
        this.apiPath = identifierSpec;
        if ((i13 & 2) != 0) {
            this.allowedCountryCodes = set;
        } else {
            Set set2 = AbstractC36561a.f156562a;
            this.allowedCountryCodes = AbstractC36561a.f156562a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CountrySpec(IdentifierSpec identifierSpec, Set set, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 1) != 0) {
            IdentifierSpec.Companion.getClass();
            identifierSpec = IdentifierSpec.Country;
        }
        if ((i13 & 2) != 0) {
            Set set2 = AbstractC36561a.f156562a;
            set = AbstractC36561a.f156562a;
        }
        this(identifierSpec, set);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountrySpec(IdentifierSpec apiPath, Set<String> allowedCountryCodes) {
        super(null);
        AbstractC22676k.m65750j(apiPath, "apiPath");
        AbstractC22676k.m65750j(allowedCountryCodes, "allowedCountryCodes");
        this.apiPath = apiPath;
        this.allowedCountryCodes = allowedCountryCodes;
    }
}
