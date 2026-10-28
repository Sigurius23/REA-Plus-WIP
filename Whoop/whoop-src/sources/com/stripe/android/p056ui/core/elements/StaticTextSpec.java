package com.stripe.android.p056ui.core.elements;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.uicore.elements.C5705a;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.IdentifierSpec$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import g40.InterfaceC15367i1;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import x30.C37871a;
import x30.C37924r1;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ$\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u001eJ\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u001e¨\u00066"}, m65681d2 = {"Lcom/stripe/android/ui/core/elements/StaticTextSpec;", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "apiPath", "", "stringResId", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/stripe/android/uicore/elements/IdentifierSpec;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$payments_ui_core_release", "(Lcom/stripe/android/ui/core/elements/StaticTextSpec;Lzc3/c;Lyc3/g;)V", "write$Self", "Lg40/i1;", "transform", "()Lg40/i1;", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "component2", "copy", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;I)Lcom/stripe/android/ui/core/elements/StaticTextSpec;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getApiPath", "getApiPath$annotations", "()V", "I", "getStringResId", "Companion", "$serializer", "com/stripe/android/ui/core/elements/b0", "payments-ui-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StaticTextSpec extends FormItemSpec {
    private final IdentifierSpec apiPath;
    private final int stringResId;
    public static final C5677b0 Companion = new C5677b0();
    public static final Parcelable.Creator<StaticTextSpec> CREATOR = new C37871a(26);
    public static final int $stable = IdentifierSpec.$stable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StaticTextSpec(int i13, IdentifierSpec identifierSpec, int i14, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (2 != (i13 & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2, StaticTextSpec$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            IdentifierSpec.Companion.getClass();
            this.apiPath = C5705a.m16892a("static_text");
        } else {
            this.apiPath = identifierSpec;
        }
        this.stringResId = i14;
    }

    public static /* synthetic */ StaticTextSpec copy$default(StaticTextSpec staticTextSpec, IdentifierSpec identifierSpec, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            identifierSpec = staticTextSpec.apiPath;
        }
        if ((i14 & 2) != 0) {
            i13 = staticTextSpec.stringResId;
        }
        return staticTextSpec.copy(identifierSpec, i13);
    }

    @InterfaceC37143h("api_path")
    public static /* synthetic */ void getApiPath$annotations() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public static final /* synthetic */ void write$Self$payments_ui_core_release(StaticTextSpec self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0)) {
            output.encodeSerializableElement(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.getApiPath());
        } else {
            IdentifierSpec apiPath = self.getApiPath();
            IdentifierSpec.Companion.getClass();
            if (!AbstractC22676k.m65745e(apiPath, C5705a.m16892a("static_text"))) {
                output.encodeSerializableElement(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.getApiPath());
            }
        }
        output.encodeIntElement(serialDesc, 1, self.stringResId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStringResId() {
        return this.stringResId;
    }

    public final StaticTextSpec copy(IdentifierSpec apiPath, int stringResId) {
        AbstractC22676k.m65750j(apiPath, "apiPath");
        return new StaticTextSpec(apiPath, stringResId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StaticTextSpec)) {
            return false;
        }
        StaticTextSpec staticTextSpec = (StaticTextSpec) other;
        return AbstractC22676k.m65745e(this.apiPath, staticTextSpec.apiPath) && this.stringResId == staticTextSpec.stringResId;
    }

    @Override // com.stripe.android.p056ui.core.elements.FormItemSpec
    public IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    public final int getStringResId() {
        return this.stringResId;
    }

    public int hashCode() {
        return Integer.hashCode(this.stringResId) + (this.apiPath.hashCode() * 31);
    }

    public String toString() {
        return "StaticTextSpec(apiPath=" + this.apiPath + ", stringResId=" + this.stringResId + ")";
    }

    public final InterfaceC15367i1 transform() {
        return new C37924r1(getApiPath(), this.stringResId);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.apiPath, flags);
        dest.writeInt(this.stringResId);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ StaticTextSpec(IdentifierSpec identifierSpec, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i14 & 1) != 0) {
            IdentifierSpec.Companion.getClass();
            identifierSpec = C5705a.m16892a("static_text");
        }
        this(identifierSpec, i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticTextSpec(IdentifierSpec apiPath, int i13) {
        super(null);
        AbstractC22676k.m65750j(apiPath, "apiPath");
        this.apiPath = apiPath;
        this.stringResId = i13;
    }
}
