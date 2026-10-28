package com.stripe.android.p056ui.core.elements;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.IdentifierSpec$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import d13.AbstractC11478a;
import g40.C15413r0;
import g40.C15440w2;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import m83.C25271y;
import m83.C25272z;
import p408q.C29662f;
import p479s4.AbstractC32128i;
import p696zy.InterfaceC41211c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import x30.C37871a;
import x30.C37918p1;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002ABB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001d\u001a\u00020\u001c2\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\"\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u000b¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u000b¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b*\u0010+J4\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b0\u0010%J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b4\u00105R \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0003\u00106\u0012\u0004\b8\u00109\u001a\u0004\b7\u0010'R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010:\u0012\u0004\b<\u00109\u001a\u0004\b;\u0010)R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010=\u0012\u0004\b?\u00109\u001a\u0004\b>\u0010+¨\u0006C"}, m65681d2 = {"Lcom/stripe/android/ui/core/elements/DropdownSpec;", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "apiPath", "Lcom/stripe/android/ui/core/elements/TranslationId;", "labelTranslationId", "", "Lcom/stripe/android/ui/core/elements/DropdownItemSpec;", "items", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/TranslationId;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/TranslationId;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$payments_ui_core_release", "(Lcom/stripe/android/ui/core/elements/DropdownSpec;Lzc3/c;Lyc3/g;)V", "write$Self", "", "", "initialValues", "Lg40/w2;", "transform", "(Ljava/util/Map;)Lg40/w2;", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "component2", "()Lcom/stripe/android/ui/core/elements/TranslationId;", "component3", "()Ljava/util/List;", "copy", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/TranslationId;Ljava/util/List;)Lcom/stripe/android/ui/core/elements/DropdownSpec;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getApiPath", "getApiPath$annotations", "()V", "Lcom/stripe/android/ui/core/elements/TranslationId;", "getLabelTranslationId", "getLabelTranslationId$annotations", "Ljava/util/List;", "getItems", "getItems$annotations", "Companion", "$serializer", "com/stripe/android/ui/core/elements/l", "payments-ui-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DropdownSpec extends FormItemSpec {
    public static final int $stable = 8;
    private final IdentifierSpec apiPath;
    private final List<DropdownItemSpec> items;
    private final TranslationId labelTranslationId;
    public static final C5687l Companion = new C5687l();
    public static final Parcelable.Creator<DropdownSpec> CREATOR = new C37871a(11);
    private static final InterfaceC37138c[] $childSerializers = {null, TranslationId.Companion.serializer(), new ArrayListSerializer(DropdownItemSpec$$serializer.INSTANCE)};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DropdownSpec(int i13, IdentifierSpec identifierSpec, TranslationId translationId, List list, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, DropdownSpec$$serializer.INSTANCE.getDescriptor());
        }
        this.apiPath = identifierSpec;
        this.labelTranslationId = translationId;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DropdownSpec copy$default(DropdownSpec dropdownSpec, IdentifierSpec identifierSpec, TranslationId translationId, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            identifierSpec = dropdownSpec.apiPath;
        }
        if ((i13 & 2) != 0) {
            translationId = dropdownSpec.labelTranslationId;
        }
        if ((i13 & 4) != 0) {
            list = dropdownSpec.items;
        }
        return dropdownSpec.copy(identifierSpec, translationId, list);
    }

    @InterfaceC37143h("api_path")
    public static /* synthetic */ void getApiPath$annotations() {
    }

    @InterfaceC37143h("items")
    public static /* synthetic */ void getItems$annotations() {
    }

    @InterfaceC37143h("translation_id")
    public static /* synthetic */ void getLabelTranslationId$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C15440w2 transform$default(DropdownSpec dropdownSpec, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            map = C25272z.f99163w;
        }
        return dropdownSpec.transform(map);
    }

    public static final /* synthetic */ void write$Self$payments_ui_core_release(DropdownSpec self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.getApiPath());
        output.encodeSerializableElement(serialDesc, 1, interfaceC37138cArr[1], self.labelTranslationId);
        output.encodeSerializableElement(serialDesc, 2, interfaceC37138cArr[2], self.items);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TranslationId getLabelTranslationId() {
        return this.labelTranslationId;
    }

    public final List<DropdownItemSpec> component3() {
        return this.items;
    }

    public final DropdownSpec copy(IdentifierSpec apiPath, TranslationId labelTranslationId, List<DropdownItemSpec> items) {
        AbstractC22676k.m65750j(apiPath, "apiPath");
        AbstractC22676k.m65750j(labelTranslationId, "labelTranslationId");
        AbstractC22676k.m65750j(items, "items");
        return new DropdownSpec(apiPath, labelTranslationId, items);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DropdownSpec)) {
            return false;
        }
        DropdownSpec dropdownSpec = (DropdownSpec) other;
        return AbstractC22676k.m65745e(this.apiPath, dropdownSpec.apiPath) && this.labelTranslationId == dropdownSpec.labelTranslationId && AbstractC22676k.m65745e(this.items, dropdownSpec.items);
    }

    @Override // com.stripe.android.p056ui.core.elements.FormItemSpec
    public IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    public final List<DropdownItemSpec> getItems() {
        return this.items;
    }

    public final TranslationId getLabelTranslationId() {
        return this.labelTranslationId;
    }

    public int hashCode() {
        return this.items.hashCode() + ((this.labelTranslationId.hashCode() + (this.apiPath.hashCode() * 31)) * 31);
    }

    public String toString() {
        IdentifierSpec identifierSpec = this.apiPath;
        TranslationId translationId = this.labelTranslationId;
        List<DropdownItemSpec> list = this.items;
        StringBuilder sb4 = new StringBuilder("DropdownSpec(apiPath=");
        sb4.append(identifierSpec);
        sb4.append(", labelTranslationId=");
        sb4.append(translationId);
        sb4.append(", items=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }

    public final C15440w2 transform(Map<IdentifierSpec, String> initialValues) {
        AbstractC22676k.m65750j(initialValues, "initialValues");
        return FormItemSpec.createSectionElement$payments_ui_core_release$default(this, new C37918p1(getApiPath(), new C15413r0(new C29662f(AbstractC32128i.m100064s(this.labelTranslationId.getResourceId(), new Object[0], C25271y.f99162w), this.items), initialValues.get(getApiPath()))), (InterfaceC41211c) null, 2, (Object) null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.apiPath, flags);
        dest.writeString(this.labelTranslationId.name());
        Iterator itM30863o = AbstractC11478a.m30863o(this.items, dest);
        while (itM30863o.hasNext()) {
            dest.writeParcelable((Parcelable) itM30863o.next(), flags);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropdownSpec(IdentifierSpec apiPath, TranslationId labelTranslationId, List<DropdownItemSpec> items) {
        super(null);
        AbstractC22676k.m65750j(apiPath, "apiPath");
        AbstractC22676k.m65750j(labelTranslationId, "labelTranslationId");
        AbstractC22676k.m65750j(items, "items");
        this.apiPath = apiPath;
        this.labelTranslationId = labelTranslationId;
        this.items = items;
    }
}
