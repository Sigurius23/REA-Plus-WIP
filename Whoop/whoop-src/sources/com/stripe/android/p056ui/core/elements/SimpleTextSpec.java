package com.stripe.android.p056ui.core.elements;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.IdentifierSpec$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import g40.C15333c3;
import g40.C15339d3;
import g40.C15351f3;
import g40.C15440w2;
import ih0.AbstractC18489d0;
import java.util.Map;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import m83.C25271y;
import m83.C25272z;
import p000.AbstractC11266d;
import p479s4.AbstractC32128i;
import p696zy.C41210b;
import p696zy.InterfaceC41211c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import x30.AbstractC37921q1;
import x30.C37871a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0002KLB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBI\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001f\u001a\u00020\u001e2\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010$\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0004¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b*\u0010'J\u0010\u0010+\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b/\u00100JB\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b5\u0010'J\u001a\u00108\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b8\u00109R \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010:\u0012\u0004\b<\u0010=\u001a\u0004\b;\u0010)R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010>\u0012\u0004\b@\u0010=\u001a\u0004\b?\u0010'R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010A\u0012\u0004\bC\u0010=\u001a\u0004\bB\u0010,R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010D\u0012\u0004\bF\u0010=\u001a\u0004\bE\u0010.R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010G\u0012\u0004\bI\u0010=\u001a\u0004\bH\u00100¨\u0006M"}, m65681d2 = {"Lcom/stripe/android/ui/core/elements/SimpleTextSpec;", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "apiPath", "", "label", "Lcom/stripe/android/ui/core/elements/Capitalization;", "capitalization", "Lcom/stripe/android/ui/core/elements/KeyboardType;", "keyboardType", "", "showOptionalLabel", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;ILcom/stripe/android/ui/core/elements/Capitalization;Lcom/stripe/android/ui/core/elements/KeyboardType;Z)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/stripe/android/uicore/elements/IdentifierSpec;ILcom/stripe/android/ui/core/elements/Capitalization;Lcom/stripe/android/ui/core/elements/KeyboardType;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$payments_ui_core_release", "(Lcom/stripe/android/ui/core/elements/SimpleTextSpec;Lzc3/c;Lyc3/g;)V", "write$Self", "", "", "initialValues", "Lg40/w2;", "transform", "(Ljava/util/Map;)Lg40/w2;", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "component2", "component3", "()Lcom/stripe/android/ui/core/elements/Capitalization;", "component4", "()Lcom/stripe/android/ui/core/elements/KeyboardType;", "component5", "()Z", "copy", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;ILcom/stripe/android/ui/core/elements/Capitalization;Lcom/stripe/android/ui/core/elements/KeyboardType;Z)Lcom/stripe/android/ui/core/elements/SimpleTextSpec;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getApiPath", "getApiPath$annotations", "()V", "I", "getLabel", "getLabel$annotations", "Lcom/stripe/android/ui/core/elements/Capitalization;", "getCapitalization", "getCapitalization$annotations", "Lcom/stripe/android/ui/core/elements/KeyboardType;", "getKeyboardType", "getKeyboardType$annotations", "Z", "getShowOptionalLabel", "getShowOptionalLabel$annotations", "Companion", "$serializer", "com/stripe/android/ui/core/elements/a0", "payments-ui-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SimpleTextSpec extends FormItemSpec {
    private final IdentifierSpec apiPath;
    private final Capitalization capitalization;
    private final KeyboardType keyboardType;
    private final int label;
    private final boolean showOptionalLabel;
    public static final C5673a0 Companion = new C5673a0();
    public static final Parcelable.Creator<SimpleTextSpec> CREATOR = new C37871a(25);
    public static final int $stable = IdentifierSpec.$stable;
    private static final InterfaceC37138c[] $childSerializers = {null, null, Capitalization.Companion.serializer(), KeyboardType.Companion.serializer(), null};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SimpleTextSpec(int i13, IdentifierSpec identifierSpec, int i14, Capitalization capitalization, KeyboardType keyboardType, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, SimpleTextSpec$$serializer.INSTANCE.getDescriptor());
        }
        this.apiPath = identifierSpec;
        this.label = i14;
        if ((i13 & 4) == 0) {
            this.capitalization = Capitalization.None;
        } else {
            this.capitalization = capitalization;
        }
        if ((i13 & 8) == 0) {
            this.keyboardType = KeyboardType.Ascii;
        } else {
            this.keyboardType = keyboardType;
        }
        if ((i13 & 16) == 0) {
            this.showOptionalLabel = false;
        } else {
            this.showOptionalLabel = z4;
        }
    }

    public static /* synthetic */ SimpleTextSpec copy$default(SimpleTextSpec simpleTextSpec, IdentifierSpec identifierSpec, int i13, Capitalization capitalization, KeyboardType keyboardType, boolean z4, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            identifierSpec = simpleTextSpec.apiPath;
        }
        if ((i14 & 2) != 0) {
            i13 = simpleTextSpec.label;
        }
        if ((i14 & 4) != 0) {
            capitalization = simpleTextSpec.capitalization;
        }
        if ((i14 & 8) != 0) {
            keyboardType = simpleTextSpec.keyboardType;
        }
        if ((i14 & 16) != 0) {
            z4 = simpleTextSpec.showOptionalLabel;
        }
        boolean z13 = z4;
        Capitalization capitalization2 = capitalization;
        return simpleTextSpec.copy(identifierSpec, i13, capitalization2, keyboardType, z13);
    }

    @InterfaceC37143h("api_path")
    public static /* synthetic */ void getApiPath$annotations() {
    }

    @InterfaceC37143h("capitalization")
    public static /* synthetic */ void getCapitalization$annotations() {
    }

    @InterfaceC37143h("keyboard_type")
    public static /* synthetic */ void getKeyboardType$annotations() {
    }

    @InterfaceC37143h("label")
    public static /* synthetic */ void getLabel$annotations() {
    }

    @InterfaceC37143h("show_optional_label")
    public static /* synthetic */ void getShowOptionalLabel$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C15440w2 transform$default(SimpleTextSpec simpleTextSpec, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            map = C25272z.f99163w;
        }
        return simpleTextSpec.transform(map);
    }

    public static final /* synthetic */ void write$Self$payments_ui_core_release(SimpleTextSpec self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.getApiPath());
        output.encodeIntElement(serialDesc, 1, self.label);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.capitalization != Capitalization.None) {
            output.encodeSerializableElement(serialDesc, 2, interfaceC37138cArr[2], self.capitalization);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.keyboardType != KeyboardType.Ascii) {
            output.encodeSerializableElement(serialDesc, 3, interfaceC37138cArr[3], self.keyboardType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.showOptionalLabel) {
            output.encodeBooleanElement(serialDesc, 4, self.showOptionalLabel);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Capitalization getCapitalization() {
        return this.capitalization;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final KeyboardType getKeyboardType() {
        return this.keyboardType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getShowOptionalLabel() {
        return this.showOptionalLabel;
    }

    public final SimpleTextSpec copy(IdentifierSpec apiPath, int label, Capitalization capitalization, KeyboardType keyboardType, boolean showOptionalLabel) {
        AbstractC22676k.m65750j(apiPath, "apiPath");
        AbstractC22676k.m65750j(capitalization, "capitalization");
        AbstractC22676k.m65750j(keyboardType, "keyboardType");
        return new SimpleTextSpec(apiPath, label, capitalization, keyboardType, showOptionalLabel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimpleTextSpec)) {
            return false;
        }
        SimpleTextSpec simpleTextSpec = (SimpleTextSpec) other;
        return AbstractC22676k.m65745e(this.apiPath, simpleTextSpec.apiPath) && this.label == simpleTextSpec.label && this.capitalization == simpleTextSpec.capitalization && this.keyboardType == simpleTextSpec.keyboardType && this.showOptionalLabel == simpleTextSpec.showOptionalLabel;
    }

    @Override // com.stripe.android.p056ui.core.elements.FormItemSpec
    public IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    public final Capitalization getCapitalization() {
        return this.capitalization;
    }

    public final KeyboardType getKeyboardType() {
        return this.keyboardType;
    }

    public final int getLabel() {
        return this.label;
    }

    public final boolean getShowOptionalLabel() {
        return this.showOptionalLabel;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showOptionalLabel) + ((this.keyboardType.hashCode() + ((this.capitalization.hashCode() + AbstractC11266d.m30448b(this.label, this.apiPath.hashCode() * 31, 31)) * 31)) * 31);
    }

    public String toString() {
        IdentifierSpec identifierSpec = this.apiPath;
        int i13 = this.label;
        Capitalization capitalization = this.capitalization;
        KeyboardType keyboardType = this.keyboardType;
        boolean z4 = this.showOptionalLabel;
        StringBuilder sb4 = new StringBuilder("SimpleTextSpec(apiPath=");
        sb4.append(identifierSpec);
        sb4.append(", label=");
        sb4.append(i13);
        sb4.append(", capitalization=");
        sb4.append(capitalization);
        sb4.append(", keyboardType=");
        sb4.append(keyboardType);
        sb4.append(", showOptionalLabel=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final C15440w2 transform(Map<IdentifierSpec, String> initialValues) {
        int i13;
        AbstractC22676k.m65750j(initialValues, "initialValues");
        IdentifierSpec apiPath = getApiPath();
        int i14 = 0;
        C41210b c41210bM100064s = AbstractC32128i.m100064s(this.label, new Object[0], C25271y.f99162w);
        int i15 = AbstractC37921q1.f162376a[this.capitalization.ordinal()];
        int i16 = 3;
        int i17 = 4;
        if (i15 != 1) {
            if (i15 == 2) {
                i14 = 1;
            } else if (i15 == 3) {
                i14 = 2;
            } else {
                if (i15 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i14 = 3;
            }
        }
        switch (AbstractC37921q1.f162377b[this.keyboardType.ordinal()]) {
            case 1:
                i13 = 1;
                return FormItemSpec.createSectionElement$payments_ui_core_release$default(this, new C15333c3(apiPath, new C15351f3(new C15339d3(c41210bM100064s, i14, i13, null, this.showOptionalLabel, 40), initialValues.get(getApiPath()), null, i17)), (InterfaceC41211c) null, 2, (Object) null);
            case 2:
                i13 = 2;
                return FormItemSpec.createSectionElement$payments_ui_core_release$default(this, new C15333c3(apiPath, new C15351f3(new C15339d3(c41210bM100064s, i14, i13, null, this.showOptionalLabel, 40), initialValues.get(getApiPath()), null, i17)), (InterfaceC41211c) null, 2, (Object) null);
            case 3:
                i13 = i16;
                return FormItemSpec.createSectionElement$payments_ui_core_release$default(this, new C15333c3(apiPath, new C15351f3(new C15339d3(c41210bM100064s, i14, i13, null, this.showOptionalLabel, 40), initialValues.get(getApiPath()), null, i17)), (InterfaceC41211c) null, 2, (Object) null);
            case 4:
                i13 = 4;
                return FormItemSpec.createSectionElement$payments_ui_core_release$default(this, new C15333c3(apiPath, new C15351f3(new C15339d3(c41210bM100064s, i14, i13, null, this.showOptionalLabel, 40), initialValues.get(getApiPath()), null, i17)), (InterfaceC41211c) null, 2, (Object) null);
            case 5:
                i16 = 5;
                i13 = i16;
                return FormItemSpec.createSectionElement$payments_ui_core_release$default(this, new C15333c3(apiPath, new C15351f3(new C15339d3(c41210bM100064s, i14, i13, null, this.showOptionalLabel, 40), initialValues.get(getApiPath()), null, i17)), (InterfaceC41211c) null, 2, (Object) null);
            case 6:
                i16 = 6;
                i13 = i16;
                return FormItemSpec.createSectionElement$payments_ui_core_release$default(this, new C15333c3(apiPath, new C15351f3(new C15339d3(c41210bM100064s, i14, i13, null, this.showOptionalLabel, 40), initialValues.get(getApiPath()), null, i17)), (InterfaceC41211c) null, 2, (Object) null);
            case 7:
                i16 = 7;
                i13 = i16;
                return FormItemSpec.createSectionElement$payments_ui_core_release$default(this, new C15333c3(apiPath, new C15351f3(new C15339d3(c41210bM100064s, i14, i13, null, this.showOptionalLabel, 40), initialValues.get(getApiPath()), null, i17)), (InterfaceC41211c) null, 2, (Object) null);
            case 8:
                i16 = 8;
                i13 = i16;
                return FormItemSpec.createSectionElement$payments_ui_core_release$default(this, new C15333c3(apiPath, new C15351f3(new C15339d3(c41210bM100064s, i14, i13, null, this.showOptionalLabel, 40), initialValues.get(getApiPath()), null, i17)), (InterfaceC41211c) null, 2, (Object) null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.apiPath, flags);
        dest.writeInt(this.label);
        dest.writeString(this.capitalization.name());
        dest.writeString(this.keyboardType.name());
        dest.writeInt(this.showOptionalLabel ? 1 : 0);
    }

    public /* synthetic */ SimpleTextSpec(IdentifierSpec identifierSpec, int i13, Capitalization capitalization, KeyboardType keyboardType, boolean z4, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(identifierSpec, i13, (i14 & 4) != 0 ? Capitalization.None : capitalization, (i14 & 8) != 0 ? KeyboardType.Ascii : keyboardType, (i14 & 16) != 0 ? false : z4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleTextSpec(IdentifierSpec apiPath, int i13, Capitalization capitalization, KeyboardType keyboardType, boolean z4) {
        super(null);
        AbstractC22676k.m65750j(apiPath, "apiPath");
        AbstractC22676k.m65750j(capitalization, "capitalization");
        AbstractC22676k.m65750j(keyboardType, "keyboardType");
        this.apiPath = apiPath;
        this.label = i13;
        this.capitalization = capitalization;
        this.keyboardType = keyboardType;
        this.showOptionalLabel = z4;
    }
}
