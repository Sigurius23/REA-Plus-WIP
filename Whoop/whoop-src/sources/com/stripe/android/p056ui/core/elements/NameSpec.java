package com.stripe.android.p056ui.core.elements;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.IdentifierSpec$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import g40.C15440w2;
import java.util.Map;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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
@Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=>B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u001a\u001a\u00020\u00192\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\b¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010&J$\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b+\u0010\"J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100R \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0003\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010$R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00105\u0012\u0004\b7\u00104\u001a\u0004\b6\u0010&R\u001a\u00109\u001a\u0002088\u0002X\u0083\u0004¢\u0006\f\n\u0004\b9\u0010:\u0012\u0004\b;\u00104¨\u0006?"}, m65681d2 = {"Lcom/stripe/android/ui/core/elements/NameSpec;", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "apiPath", "Lcom/stripe/android/ui/core/elements/TranslationId;", "labelTranslationId", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/TranslationId;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/TranslationId;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$payments_ui_core_release", "(Lcom/stripe/android/ui/core/elements/NameSpec;Lzc3/c;Lyc3/g;)V", "write$Self", "", "", "initialValues", "Lg40/w2;", "transform", "(Ljava/util/Map;)Lg40/w2;", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "component2", "()Lcom/stripe/android/ui/core/elements/TranslationId;", "copy", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/TranslationId;)Lcom/stripe/android/ui/core/elements/NameSpec;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getApiPath", "getApiPath$annotations", "()V", "Lcom/stripe/android/ui/core/elements/TranslationId;", "getLabelTranslationId", "getLabelTranslationId$annotations", "Lcom/stripe/android/ui/core/elements/SimpleTextSpec;", "simpleTextSpec", "Lcom/stripe/android/ui/core/elements/SimpleTextSpec;", "getSimpleTextSpec$annotations", "Companion", "$serializer", "com/stripe/android/ui/core/elements/s", "payments-ui-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class NameSpec extends FormItemSpec {
    private final IdentifierSpec apiPath;
    private final TranslationId labelTranslationId;
    private final SimpleTextSpec simpleTextSpec;
    public static final C5694s Companion = new C5694s();
    public static final Parcelable.Creator<NameSpec> CREATOR = new C37871a(19);
    public static final int $stable = IdentifierSpec.$stable;
    private static final InterfaceC37138c[] $childSerializers = {null, TranslationId.Companion.serializer()};

    public NameSpec() {
        this((IdentifierSpec) null, (TranslationId) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ NameSpec copy$default(NameSpec nameSpec, IdentifierSpec identifierSpec, TranslationId translationId, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            identifierSpec = nameSpec.apiPath;
        }
        if ((i13 & 2) != 0) {
            translationId = nameSpec.labelTranslationId;
        }
        return nameSpec.copy(identifierSpec, translationId);
    }

    @InterfaceC37143h("api_path")
    public static /* synthetic */ void getApiPath$annotations() {
    }

    @InterfaceC37143h("translation_id")
    public static /* synthetic */ void getLabelTranslationId$annotations() {
    }

    private static /* synthetic */ void getSimpleTextSpec$annotations() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public static final void write$Self$payments_ui_core_release(NameSpec self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0)) {
            output.encodeSerializableElement(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.getApiPath());
        } else {
            IdentifierSpec apiPath = self.getApiPath();
            IdentifierSpec.Companion.getClass();
            if (!AbstractC22676k.m65745e(apiPath, IdentifierSpec.Name)) {
                output.encodeSerializableElement(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.getApiPath());
            }
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.labelTranslationId == TranslationId.AddressName) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 1, interfaceC37138cArr[1], self.labelTranslationId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TranslationId getLabelTranslationId() {
        return this.labelTranslationId;
    }

    public final NameSpec copy(IdentifierSpec apiPath, TranslationId labelTranslationId) {
        AbstractC22676k.m65750j(apiPath, "apiPath");
        AbstractC22676k.m65750j(labelTranslationId, "labelTranslationId");
        return new NameSpec(apiPath, labelTranslationId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NameSpec)) {
            return false;
        }
        NameSpec nameSpec = (NameSpec) other;
        return AbstractC22676k.m65745e(this.apiPath, nameSpec.apiPath) && this.labelTranslationId == nameSpec.labelTranslationId;
    }

    @Override // com.stripe.android.p056ui.core.elements.FormItemSpec
    public IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    public final TranslationId getLabelTranslationId() {
        return this.labelTranslationId;
    }

    public int hashCode() {
        return this.labelTranslationId.hashCode() + (this.apiPath.hashCode() * 31);
    }

    public String toString() {
        return "NameSpec(apiPath=" + this.apiPath + ", labelTranslationId=" + this.labelTranslationId + ")";
    }

    public final C15440w2 transform(Map<IdentifierSpec, String> initialValues) {
        AbstractC22676k.m65750j(initialValues, "initialValues");
        return this.simpleTextSpec.transform(initialValues);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.apiPath, flags);
        dest.writeString(this.labelTranslationId.name());
    }

    public NameSpec(int i13, IdentifierSpec identifierSpec, TranslationId translationId, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if ((i13 & 1) == 0) {
            IdentifierSpec.Companion.getClass();
            identifierSpec = IdentifierSpec.Name;
        }
        this.apiPath = identifierSpec;
        if ((i13 & 2) == 0) {
            this.labelTranslationId = TranslationId.AddressName;
        } else {
            this.labelTranslationId = translationId;
        }
        this.simpleTextSpec = new SimpleTextSpec(getApiPath(), this.labelTranslationId.getResourceId(), Capitalization.Words, KeyboardType.Text, false, 16, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NameSpec(IdentifierSpec identifierSpec, TranslationId translationId, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 1) != 0) {
            IdentifierSpec.Companion.getClass();
            identifierSpec = IdentifierSpec.Name;
        }
        this(identifierSpec, (i13 & 2) != 0 ? TranslationId.AddressName : translationId);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NameSpec(IdentifierSpec apiPath, TranslationId labelTranslationId) {
        super(null);
        AbstractC22676k.m65750j(apiPath, "apiPath");
        AbstractC22676k.m65750j(labelTranslationId, "labelTranslationId");
        this.apiPath = apiPath;
        this.labelTranslationId = labelTranslationId;
        this.simpleTextSpec = new SimpleTextSpec(getApiPath(), labelTranslationId.getResourceId(), Capitalization.Words, KeyboardType.Text, false, 16, (DefaultConstructorMarker) null);
    }
}
