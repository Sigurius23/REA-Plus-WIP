package com.stripe.android.p056ui.core.elements;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.uicore.elements.AddressFieldConfiguration;
import com.stripe.android.uicore.elements.C5705a;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.IdentifierSpec$$serializer;
import com.whoop.android.R;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import g40.AbstractC15387m;
import g40.C15347f;
import g40.C15366i0;
import g40.C15382l;
import g40.C15413r0;
import g40.C15430u2;
import g40.C15432v;
import g40.C15435v2;
import g40.InterfaceC15367i1;
import g40.InterfaceC15450y2;
import g40.InterfaceC15452z;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import m63.C25126d;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.C25235a0;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p479s4.AbstractC32128i;
import p565vy.AbstractC36561a;
import p696zy.C41210b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import x30.C37871a;
import yb3.AbstractC39414r;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 S2\u00020\u00012\u00020\u0002:\u0002TUBO\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010BM\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015JK\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00162\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0011¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0011¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003¢\u0006\u0004\b+\u0010*J\u0010\u0010,\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b0\u0010-JX\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b5\u0010&J\u001a\u00108\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b8\u00109J'\u0010A\u001a\u00020\"2\u0006\u0010:\u001a\u00020\u00002\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=H\u0001¢\u0006\u0004\b?\u0010@R \u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010B\u0012\u0004\bD\u0010E\u001a\u0004\bC\u0010(R&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010F\u0012\u0004\bH\u0010E\u001a\u0004\bG\u0010*R&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010F\u0012\u0004\bJ\u0010E\u001a\u0004\bI\u0010*R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010K\u0012\u0004\bM\u0010E\u001a\u0004\bL\u0010-R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010N\u0012\u0004\bP\u0010E\u001a\u0004\bO\u0010/R \u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010K\u0012\u0004\bR\u0010E\u001a\u0004\bQ\u0010-¨\u0006V"}, m65681d2 = {"Lcom/stripe/android/ui/core/elements/AddressSpec;", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "Landroid/os/Parcelable;", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "apiPath", "", "", "allowedCountryCodes", "Lcom/stripe/android/ui/core/elements/DisplayField;", "displayFields", "", "showLabel", "Lg40/m;", "type", "hideCountry", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLg40/m;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "initialValues", "shippingValues", "Lg40/z;", "autocompleteAddressInteractorFactory", "", "Lg40/i1;", "transform", "(Ljava/util/Map;Ljava/util/Map;Lg40/z;)Ljava/util/List;", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "component2", "()Ljava/util/Set;", "component3", "component4", "()Z", "component5", "()Lg40/m;", "component6", "copy", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLg40/m;Z)Lcom/stripe/android/ui/core/elements/AddressSpec;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "write$Self$payments_ui_core_release", "(Lcom/stripe/android/ui/core/elements/AddressSpec;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getApiPath", "getApiPath$annotations", "()V", "Ljava/util/Set;", "getAllowedCountryCodes", "getAllowedCountryCodes$annotations", "getDisplayFields", "getDisplayFields$annotations", "Z", "getShowLabel", "getShowLabel$annotations", "Lg40/m;", "getType", "getType$annotations", "getHideCountry", "getHideCountry$annotations", "Companion", "$serializer", "com/stripe/android/ui/core/elements/a", "payments-ui-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AddressSpec extends FormItemSpec implements Parcelable {
    public static final int $stable = 8;
    private final Set<String> allowedCountryCodes;
    private final IdentifierSpec apiPath;
    private final Set<DisplayField> displayFields;
    private final boolean hideCountry;
    private final boolean showLabel;
    private final AbstractC15387m type;
    public static final C5672a Companion = new C5672a();
    public static final Parcelable.Creator<AddressSpec> CREATOR = new C37871a(0);
    private static final InterfaceC37138c[] $childSerializers = {null, new LinkedHashSetSerializer(StringSerializer.INSTANCE), new LinkedHashSetSerializer(DisplayField.Companion.serializer()), null};

    public AddressSpec() {
        this(null, null, null, false, null, false, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressSpec copy$default(AddressSpec addressSpec, IdentifierSpec identifierSpec, Set set, Set set2, boolean z4, AbstractC15387m abstractC15387m, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            identifierSpec = addressSpec.apiPath;
        }
        if ((i13 & 2) != 0) {
            set = addressSpec.allowedCountryCodes;
        }
        if ((i13 & 4) != 0) {
            set2 = addressSpec.displayFields;
        }
        if ((i13 & 8) != 0) {
            z4 = addressSpec.showLabel;
        }
        if ((i13 & 16) != 0) {
            abstractC15387m = addressSpec.type;
        }
        if ((i13 & 32) != 0) {
            z13 = addressSpec.hideCountry;
        }
        AbstractC15387m abstractC15387m2 = abstractC15387m;
        boolean z14 = z13;
        return addressSpec.copy(identifierSpec, set, set2, z4, abstractC15387m2, z14);
    }

    @InterfaceC37143h("allowed_country_codes")
    public static /* synthetic */ void getAllowedCountryCodes$annotations() {
    }

    @InterfaceC37143h("api_path")
    public static /* synthetic */ void getApiPath$annotations() {
    }

    @InterfaceC37143h("display_fields")
    public static /* synthetic */ void getDisplayFields$annotations() {
    }

    public static /* synthetic */ void getHideCountry$annotations() {
    }

    @InterfaceC37143h("show_label")
    public static /* synthetic */ void getShowLabel$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public static final void write$Self$payments_ui_core_release(AddressSpec self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0)) {
            output.encodeSerializableElement(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.getApiPath());
        } else {
            IdentifierSpec apiPath = self.getApiPath();
            IdentifierSpec.Companion.getClass();
            if (!AbstractC22676k.m65745e(apiPath, C5705a.m16892a("billing_details[address]"))) {
                output.encodeSerializableElement(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.getApiPath());
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.allowedCountryCodes, AbstractC36561a.f156562a)) {
            output.encodeSerializableElement(serialDesc, 1, interfaceC37138cArr[1], self.allowedCountryCodes);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.displayFields, C25235a0.f99113w)) {
            output.encodeSerializableElement(serialDesc, 2, interfaceC37138cArr[2], self.displayFields);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.showLabel) {
            return;
        }
        output.encodeBooleanElement(serialDesc, 3, self.showLabel);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    public final Set<String> component2() {
        return this.allowedCountryCodes;
    }

    public final Set<DisplayField> component3() {
        return this.displayFields;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getShowLabel() {
        return this.showLabel;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final AbstractC15387m getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getHideCountry() {
        return this.hideCountry;
    }

    public final AddressSpec copy(IdentifierSpec apiPath, Set<String> allowedCountryCodes, Set<? extends DisplayField> displayFields, boolean showLabel, AbstractC15387m type, boolean hideCountry) {
        AbstractC22676k.m65750j(apiPath, "apiPath");
        AbstractC22676k.m65750j(allowedCountryCodes, "allowedCountryCodes");
        AbstractC22676k.m65750j(displayFields, "displayFields");
        AbstractC22676k.m65750j(type, "type");
        return new AddressSpec(apiPath, allowedCountryCodes, displayFields, showLabel, type, hideCountry);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressSpec)) {
            return false;
        }
        AddressSpec addressSpec = (AddressSpec) other;
        return AbstractC22676k.m65745e(this.apiPath, addressSpec.apiPath) && AbstractC22676k.m65745e(this.allowedCountryCodes, addressSpec.allowedCountryCodes) && AbstractC22676k.m65745e(this.displayFields, addressSpec.displayFields) && this.showLabel == addressSpec.showLabel && AbstractC22676k.m65745e(this.type, addressSpec.type) && this.hideCountry == addressSpec.hideCountry;
    }

    public final Set<String> getAllowedCountryCodes() {
        return this.allowedCountryCodes;
    }

    @Override // com.stripe.android.p056ui.core.elements.FormItemSpec
    public IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    public final Set<DisplayField> getDisplayFields() {
        return this.displayFields;
    }

    public final boolean getHideCountry() {
        return this.hideCountry;
    }

    public final boolean getShowLabel() {
        return this.showLabel;
    }

    public final AbstractC15387m getType() {
        return this.type;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hideCountry) + ((this.type.hashCode() + AbstractC2875y.m8289b(AbstractC25012a.m73368a(this.displayFields, AbstractC25012a.m73368a(this.allowedCountryCodes, this.apiPath.hashCode() * 31, 31), 31), 31, this.showLabel)) * 31);
    }

    public String toString() {
        return "AddressSpec(apiPath=" + this.apiPath + ", allowedCountryCodes=" + this.allowedCountryCodes + ", displayFields=" + this.displayFields + ", showLabel=" + this.showLabel + ", type=" + this.type + ", hideCountry=" + this.hideCountry + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<InterfaceC15367i1> transform(Map<IdentifierSpec, String> initialValues, Map<IdentifierSpec, String> shippingValues, InterfaceC15452z autocompleteAddressInteractorFactory) {
        char c3;
        InterfaceC15450y2 c15347f;
        Object obj;
        Boolean boolM125868N0;
        AbstractC22676k.m65750j(initialValues, "initialValues");
        Object c15435v2 = null;
        C41210b c41210bM100064s = this.showLabel ? AbstractC32128i.m100064s(R.string.stripe_billing_details, new Object[0], C25271y.f99162w) : null;
        if (this.displayFields.size() == 1 && AbstractC25265s.m74094E0(this.displayFields) == DisplayField.Country) {
            IdentifierSpec.Companion.getClass();
            return AbstractC37056f.m118960L(this.hideCountry ? null : createSectionElement$payments_ui_core_release(new C15366i0(C5705a.m16892a("billing_details[address][country]"), new C15413r0(new C25126d(this.allowedCountryCodes, null, null, 62), initialValues.get(getApiPath()))), c41210bM100064s));
        }
        if (shippingValues != null) {
            IdentifierSpec.Companion.getClass();
            String str = shippingValues.get(IdentifierSpec.SameAsShipping);
            if (str != null && (boolM125868N0 = AbstractC39414r.m125868N0(str)) != null) {
                c15435v2 = new C15435v2(IdentifierSpec.SameAsShipping, new C15430u2(boolM125868N0.booleanValue()));
            }
        }
        C15435v2 c15435v3 = c15435v2;
        if (autocompleteAddressInteractorFactory != null) {
            C15435v2 c15435v4 = c15435v3;
            c3 = 1;
            c15347f = new C15432v(getApiPath(), initialValues, this.allowedCountryCodes, null, null, null, null, c15435v4, shippingValues, autocompleteAddressInteractorFactory, this.hideCountry, 120);
            obj = c15435v4;
        } else {
            c3 = 1;
            c15347f = new C15347f(getApiPath(), initialValues, this.type, this.allowedCountryCodes, null, c15435v3, shippingValues, false, this.hideCountry, 144);
            obj = c15435v3;
        }
        InterfaceC15367i1[] interfaceC15367i1Arr = new InterfaceC15367i1[2];
        interfaceC15367i1Arr[0] = createSectionElement$payments_ui_core_release(c15347f, c41210bM100064s);
        interfaceC15367i1Arr[c3] = obj;
        return AbstractC25260n.m74077r0(interfaceC15367i1Arr);
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
        Set<DisplayField> set2 = this.displayFields;
        dest.writeInt(set2.size());
        Iterator<DisplayField> it3 = set2.iterator();
        while (it3.hasNext()) {
            dest.writeString(it3.next().name());
        }
        dest.writeInt(this.showLabel ? 1 : 0);
        dest.writeParcelable(this.type, flags);
        dest.writeInt(this.hideCountry ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AddressSpec(int i13, IdentifierSpec identifierSpec, Set set, Set set2, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if ((i13 & 1) == 0) {
            IdentifierSpec.Companion.getClass();
            identifierSpec = C5705a.m16892a("billing_details[address]");
        }
        this.apiPath = identifierSpec;
        if ((i13 & 2) == 0) {
            this.allowedCountryCodes = AbstractC36561a.f156562a;
        } else {
            this.allowedCountryCodes = set;
        }
        if ((i13 & 4) == 0) {
            this.displayFields = C25235a0.f99113w;
        } else {
            this.displayFields = set2;
        }
        if ((i13 & 8) == 0) {
            this.showLabel = true;
        } else {
            this.showLabel = z4;
        }
        this.type = new C15382l((AddressFieldConfiguration) (objArr2 == true ? 1 : 0), (AddressFieldConfiguration) (objArr == true ? 1 : 0), 7);
        this.hideCountry = false;
    }

    public AddressSpec(IdentifierSpec identifierSpec, Set set, Set set2, boolean z4, AbstractC15387m abstractC15387m, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 1) != 0) {
            IdentifierSpec.Companion.getClass();
            identifierSpec = C5705a.m16892a("billing_details[address]");
        }
        set = (i13 & 2) != 0 ? AbstractC36561a.f156562a : set;
        set2 = (i13 & 4) != 0 ? C25235a0.f99113w : set2;
        z4 = (i13 & 8) != 0 ? true : z4;
        if ((i13 & 16) != 0) {
            AddressFieldConfiguration addressFieldConfiguration = null;
            abstractC15387m = new C15382l(addressFieldConfiguration, addressFieldConfiguration, 7);
        }
        this(identifierSpec, (Set<String>) set, (Set<? extends DisplayField>) set2, z4, abstractC15387m, (i13 & 32) != 0 ? false : z13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AddressSpec(IdentifierSpec apiPath, Set<String> allowedCountryCodes, Set<? extends DisplayField> displayFields, boolean z4, AbstractC15387m type, boolean z13) {
        super(null);
        AbstractC22676k.m65750j(apiPath, "apiPath");
        AbstractC22676k.m65750j(allowedCountryCodes, "allowedCountryCodes");
        AbstractC22676k.m65750j(displayFields, "displayFields");
        AbstractC22676k.m65750j(type, "type");
        this.apiPath = apiPath;
        this.allowedCountryCodes = allowedCountryCodes;
        this.displayFields = displayFields;
        this.showLabel = z4;
        this.type = type;
        this.hideCountry = z13;
    }
}
