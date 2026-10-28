package com.stripe.android.uicore.address;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 %2\u00020\u0001:\u0002&'B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001d\u0012\u0004\b \u0010\u001c\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010!\u0012\u0004\b$\u0010\u001c\u001a\u0004\b\"\u0010#¨\u0006("}, m65681d2 = {"Lcom/stripe/android/uicore/address/CountryAddressSchema;", "", "Lcom/stripe/android/uicore/address/FieldType;", "type", "", "required", "Lcom/stripe/android/uicore/address/FieldSchema;", "schema", "<init>", "(Lcom/stripe/android/uicore/address/FieldType;ZLcom/stripe/android/uicore/address/FieldSchema;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/stripe/android/uicore/address/FieldType;ZLcom/stripe/android/uicore/address/FieldSchema;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$stripe_ui_core_release", "(Lcom/stripe/android/uicore/address/CountryAddressSchema;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/stripe/android/uicore/address/FieldType;", "getType", "()Lcom/stripe/android/uicore/address/FieldType;", "getType$annotations", "()V", "Z", "getRequired", "()Z", "getRequired$annotations", "Lcom/stripe/android/uicore/address/FieldSchema;", "getSchema", "()Lcom/stripe/android/uicore/address/FieldSchema;", "getSchema$annotations", "Companion", "$serializer", "com/stripe/android/uicore/address/a", "stripe-ui-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final class CountryAddressSchema {
    public static final int $stable = 8;
    private final boolean required;
    private final FieldSchema schema;
    private final FieldType type;
    public static final C5702a Companion = new C5702a();
    private static final InterfaceC37138c[] $childSerializers = {FieldType.Companion.serializer(), null, null};

    public /* synthetic */ CountryAddressSchema(int i13, FieldType fieldType, boolean z4, FieldSchema fieldSchema, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, CountryAddressSchema$$serializer.INSTANCE.getDescriptor());
        }
        this.type = fieldType;
        this.required = z4;
        if ((i13 & 4) == 0) {
            this.schema = null;
        } else {
            this.schema = fieldSchema;
        }
    }

    @InterfaceC37143h("required")
    public static /* synthetic */ void getRequired$annotations() {
    }

    @InterfaceC37143h("schema")
    public static /* synthetic */ void getSchema$annotations() {
    }

    @InterfaceC37143h("type")
    public static /* synthetic */ void getType$annotations() {
    }

    public static final /* synthetic */ void write$Self$stripe_ui_core_release(CountryAddressSchema self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, $childSerializers[0], self.type);
        output.encodeBooleanElement(serialDesc, 1, self.required);
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.schema == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, FieldSchema$$serializer.INSTANCE, self.schema);
    }

    public final boolean getRequired() {
        return this.required;
    }

    public final FieldSchema getSchema() {
        return this.schema;
    }

    public final FieldType getType() {
        return this.type;
    }

    public CountryAddressSchema(FieldType fieldType, boolean z4, FieldSchema fieldSchema) {
        this.type = fieldType;
        this.required = z4;
        this.schema = fieldSchema;
    }

    public /* synthetic */ CountryAddressSchema(FieldType fieldType, boolean z4, FieldSchema fieldSchema, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(fieldType, z4, (i13 & 4) != 0 ? null : fieldSchema);
    }
}
