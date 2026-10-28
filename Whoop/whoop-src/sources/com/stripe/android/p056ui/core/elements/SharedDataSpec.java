package com.stripe.android.p056ui.core.elements;

import android.os.Parcel;
import android.os.Parcelable;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import x30.C37871a;
import x30.C37935w0;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;<B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB?\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J \u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010&J@\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\"J\u0010\u0010*\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b*\u0010 J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00100\u0012\u0004\b2\u00103\u001a\u0004\b1\u0010\"R0\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00104\u0012\u0004\b6\u00103\u001a\u0004\b5\u0010$R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00107\u0012\u0004\b9\u00103\u001a\u0004\b8\u0010&¨\u0006="}, m65681d2 = {"Lcom/stripe/android/ui/core/elements/SharedDataSpec;", "Landroid/os/Parcelable;", "", "type", "Ljava/util/ArrayList;", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "Lkotlin/collections/ArrayList;", "fields", "Lcom/stripe/android/ui/core/elements/SelectorIcon;", "selectorIcon", "<init>", "(Ljava/lang/String;Ljava/util/ArrayList;Lcom/stripe/android/ui/core/elements/SelectorIcon;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/ArrayList;Lcom/stripe/android/ui/core/elements/SelectorIcon;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$payments_ui_core_release", "(Lcom/stripe/android/ui/core/elements/SharedDataSpec;Lzc3/c;Lyc3/g;)V", "write$Self", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/ArrayList;", "component3", "()Lcom/stripe/android/ui/core/elements/SelectorIcon;", "copy", "(Ljava/lang/String;Ljava/util/ArrayList;Lcom/stripe/android/ui/core/elements/SelectorIcon;)Lcom/stripe/android/ui/core/elements/SharedDataSpec;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getType$annotations", "()V", "Ljava/util/ArrayList;", "getFields", "getFields$annotations", "Lcom/stripe/android/ui/core/elements/SelectorIcon;", "getSelectorIcon", "getSelectorIcon$annotations", "Companion", "$serializer", "com/stripe/android/ui/core/elements/z", "payments-ui-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SharedDataSpec implements Parcelable {
    public static final int $stable = 8;
    private final ArrayList<FormItemSpec> fields;
    private final SelectorIcon selectorIcon;
    private final String type;
    public static final C5701z Companion = new C5701z();
    public static final Parcelable.Creator<SharedDataSpec> CREATOR = new C37871a(24);
    private static final InterfaceC37138c[] $childSerializers = {null, new ArrayListSerializer(C37935w0.f162401c), null};

    public /* synthetic */ SharedDataSpec(int i13, String str, ArrayList arrayList, SelectorIcon selectorIcon, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, SharedDataSpec$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        if ((i13 & 2) == 0) {
            this.fields = new ArrayList<>();
        } else {
            this.fields = arrayList;
        }
        if ((i13 & 4) == 0) {
            this.selectorIcon = null;
        } else {
            this.selectorIcon = selectorIcon;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SharedDataSpec copy$default(SharedDataSpec sharedDataSpec, String str, ArrayList arrayList, SelectorIcon selectorIcon, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sharedDataSpec.type;
        }
        if ((i13 & 2) != 0) {
            arrayList = sharedDataSpec.fields;
        }
        if ((i13 & 4) != 0) {
            selectorIcon = sharedDataSpec.selectorIcon;
        }
        return sharedDataSpec.copy(str, arrayList, selectorIcon);
    }

    @InterfaceC37143h("fields")
    public static /* synthetic */ void getFields$annotations() {
    }

    @InterfaceC37143h("selector_icon")
    public static /* synthetic */ void getSelectorIcon$annotations() {
    }

    @InterfaceC37143h("type")
    public static /* synthetic */ void getType$annotations() {
    }

    public static final /* synthetic */ void write$Self$payments_ui_core_release(SharedDataSpec self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.type);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.fields, new ArrayList())) {
            output.encodeSerializableElement(serialDesc, 1, interfaceC37138cArr[1], self.fields);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.selectorIcon == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, SelectorIcon$$serializer.INSTANCE, self.selectorIcon);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final ArrayList<FormItemSpec> component2() {
        return this.fields;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SelectorIcon getSelectorIcon() {
        return this.selectorIcon;
    }

    public final SharedDataSpec copy(String type, ArrayList<FormItemSpec> fields, SelectorIcon selectorIcon) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(fields, "fields");
        return new SharedDataSpec(type, fields, selectorIcon);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SharedDataSpec)) {
            return false;
        }
        SharedDataSpec sharedDataSpec = (SharedDataSpec) other;
        return AbstractC22676k.m65745e(this.type, sharedDataSpec.type) && AbstractC22676k.m65745e(this.fields, sharedDataSpec.fields) && AbstractC22676k.m65745e(this.selectorIcon, sharedDataSpec.selectorIcon);
    }

    public final ArrayList<FormItemSpec> getFields() {
        return this.fields;
    }

    public final SelectorIcon getSelectorIcon() {
        return this.selectorIcon;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = (this.fields.hashCode() + (this.type.hashCode() * 31)) * 31;
        SelectorIcon selectorIcon = this.selectorIcon;
        return iHashCode + (selectorIcon == null ? 0 : selectorIcon.hashCode());
    }

    public String toString() {
        return "SharedDataSpec(type=" + this.type + ", fields=" + this.fields + ", selectorIcon=" + this.selectorIcon + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.type);
        ArrayList<FormItemSpec> arrayList = this.fields;
        dest.writeInt(arrayList.size());
        Iterator<FormItemSpec> it = arrayList.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        SelectorIcon selectorIcon = this.selectorIcon;
        if (selectorIcon == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            selectorIcon.writeToParcel(dest, flags);
        }
    }

    public SharedDataSpec(String type, ArrayList<FormItemSpec> fields, SelectorIcon selectorIcon) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(fields, "fields");
        this.type = type;
        this.fields = fields;
        this.selectorIcon = selectorIcon;
    }

    public /* synthetic */ SharedDataSpec(String str, ArrayList arrayList, SelectorIcon selectorIcon, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? new ArrayList() : arrayList, (i13 & 4) != 0 ? null : selectorIcon);
    }
}
