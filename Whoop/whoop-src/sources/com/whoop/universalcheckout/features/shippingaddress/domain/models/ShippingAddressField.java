package com.whoop.universalcheckout.features.shippingaddress.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0002MNB§\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0014\u0010\u0015B§\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0014\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001bJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001bJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001bJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001bJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b+\u0010!J´\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u001bJ\u0010\u0010/\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u00020\b2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103J'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001¢\u0006\u0004\b:\u0010;R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010=\u001a\u0004\b?\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b@\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010=\u001a\u0004\bA\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\bB\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010C\u001a\u0004\b\t\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010D\u001a\u0004\bE\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010D\u001a\u0004\bF\u0010#R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\bG\u0010\u001bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\bH\u0010\u001bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010=\u001a\u0004\bI\u0010\u001bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\bJ\u0010\u001bR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010K\u001a\u0004\bL\u0010*R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010C\u001a\u0004\b\u0013\u0010!¨\u0006O"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;", "", "", "type", "label", "labelExtension", "prefillText", "fieldType", "", "isRequired", "", "maxLength", "minLength", "pattern", "example", "autoCompleteField", "customErrorKey", "Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;", "dropdownLookup", "isReadOnly", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;Ljava/lang/Boolean;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/lang/Boolean;", "component7", "()Ljava/lang/Integer;", "component8", "component9", "component10", "component11", "component12", "component13", "()Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;Ljava/lang/Boolean;)Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$universal_checkout_release", "(Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getType", "getLabel", "getLabelExtension", "getPrefillText", "getFieldType", "Ljava/lang/Boolean;", "Ljava/lang/Integer;", "getMaxLength", "getMinLength", "getPattern", "getExample", "getAutoCompleteField", "getCustomErrorKey", "Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;", "getDropdownLookup", "Companion", "$serializer", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ShippingAddressField {
    public static final String DROPDOWN_FIELD_TYPE = "DROPDOWN";
    public static final String TEXT_FIELD_TYPE = "TEXT";
    private final String autoCompleteField;
    private final String customErrorKey;
    private final DropdownLookup dropdownLookup;
    private final String example;
    private final String fieldType;
    private final Boolean isReadOnly;
    private final Boolean isRequired;
    private final String label;
    private final String labelExtension;
    private final Integer maxLength;
    private final Integer minLength;
    private final String pattern;
    private final String prefillText;
    private final String type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;", "serializer", "()Lwc3/c;", "", "TEXT_FIELD_TYPE", "Ljava/lang/String;", "DROPDOWN_FIELD_TYPE", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ShippingAddressField$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ShippingAddressField(int i13, String str, String str2, String str3, String str4, String str5, Boolean bool, Integer num, Integer num2, String str6, String str7, String str8, String str9, DropdownLookup dropdownLookup, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, ShippingAddressField$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.label = str2;
        if ((i13 & 4) == 0) {
            this.labelExtension = null;
        } else {
            this.labelExtension = str3;
        }
        if ((i13 & 8) == 0) {
            this.prefillText = null;
        } else {
            this.prefillText = str4;
        }
        if ((i13 & 16) == 0) {
            this.fieldType = null;
        } else {
            this.fieldType = str5;
        }
        if ((i13 & 32) == 0) {
            this.isRequired = null;
        } else {
            this.isRequired = bool;
        }
        if ((i13 & 64) == 0) {
            this.maxLength = null;
        } else {
            this.maxLength = num;
        }
        if ((i13 & 128) == 0) {
            this.minLength = null;
        } else {
            this.minLength = num2;
        }
        if ((i13 & 256) == 0) {
            this.pattern = null;
        } else {
            this.pattern = str6;
        }
        if ((i13 & 512) == 0) {
            this.example = null;
        } else {
            this.example = str7;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.autoCompleteField = null;
        } else {
            this.autoCompleteField = str8;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.customErrorKey = null;
        } else {
            this.customErrorKey = str9;
        }
        if ((i13 & 4096) == 0) {
            this.dropdownLookup = null;
        } else {
            this.dropdownLookup = dropdownLookup;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
            this.isReadOnly = null;
        } else {
            this.isReadOnly = bool2;
        }
    }

    public static final /* synthetic */ void write$Self$universal_checkout_release(ShippingAddressField self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.type);
        output.encodeStringElement(serialDesc, 1, self.label);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.labelExtension != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.labelExtension);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.prefillText != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.prefillText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.fieldType != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.fieldType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.isRequired != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, BooleanSerializer.INSTANCE, self.isRequired);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.maxLength != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, IntSerializer.INSTANCE, self.maxLength);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.minLength != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, IntSerializer.INSTANCE, self.minLength);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.pattern != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.pattern);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.example != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.example);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.autoCompleteField != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, self.autoCompleteField);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.customErrorKey != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, self.customErrorKey);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.dropdownLookup != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, DropdownLookup$$serializer.INSTANCE, self.dropdownLookup);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 13) && self.isReadOnly == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 13, BooleanSerializer.INSTANCE, self.isReadOnly);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getExample() {
        return this.example;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getAutoCompleteField() {
        return this.autoCompleteField;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getCustomErrorKey() {
        return this.customErrorKey;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final DropdownLookup getDropdownLookup() {
        return this.dropdownLookup;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Boolean getIsReadOnly() {
        return this.isReadOnly;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLabelExtension() {
        return this.labelExtension;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPrefillText() {
        return this.prefillText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFieldType() {
        return this.fieldType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIsRequired() {
        return this.isRequired;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getMaxLength() {
        return this.maxLength;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getMinLength() {
        return this.minLength;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPattern() {
        return this.pattern;
    }

    public final ShippingAddressField copy(String type, String label, String labelExtension, String prefillText, String fieldType, Boolean isRequired, Integer maxLength, Integer minLength, String pattern, String example, String autoCompleteField, String customErrorKey, DropdownLookup dropdownLookup, Boolean isReadOnly) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(label, "label");
        return new ShippingAddressField(type, label, labelExtension, prefillText, fieldType, isRequired, maxLength, minLength, pattern, example, autoCompleteField, customErrorKey, dropdownLookup, isReadOnly);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShippingAddressField)) {
            return false;
        }
        ShippingAddressField shippingAddressField = (ShippingAddressField) other;
        return AbstractC22676k.m65745e(this.type, shippingAddressField.type) && AbstractC22676k.m65745e(this.label, shippingAddressField.label) && AbstractC22676k.m65745e(this.labelExtension, shippingAddressField.labelExtension) && AbstractC22676k.m65745e(this.prefillText, shippingAddressField.prefillText) && AbstractC22676k.m65745e(this.fieldType, shippingAddressField.fieldType) && AbstractC22676k.m65745e(this.isRequired, shippingAddressField.isRequired) && AbstractC22676k.m65745e(this.maxLength, shippingAddressField.maxLength) && AbstractC22676k.m65745e(this.minLength, shippingAddressField.minLength) && AbstractC22676k.m65745e(this.pattern, shippingAddressField.pattern) && AbstractC22676k.m65745e(this.example, shippingAddressField.example) && AbstractC22676k.m65745e(this.autoCompleteField, shippingAddressField.autoCompleteField) && AbstractC22676k.m65745e(this.customErrorKey, shippingAddressField.customErrorKey) && AbstractC22676k.m65745e(this.dropdownLookup, shippingAddressField.dropdownLookup) && AbstractC22676k.m65745e(this.isReadOnly, shippingAddressField.isReadOnly);
    }

    public final String getAutoCompleteField() {
        return this.autoCompleteField;
    }

    public final String getCustomErrorKey() {
        return this.customErrorKey;
    }

    public final DropdownLookup getDropdownLookup() {
        return this.dropdownLookup;
    }

    public final String getExample() {
        return this.example;
    }

    public final String getFieldType() {
        return this.fieldType;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getLabelExtension() {
        return this.labelExtension;
    }

    public final Integer getMaxLength() {
        return this.maxLength;
    }

    public final Integer getMinLength() {
        return this.minLength;
    }

    public final String getPattern() {
        return this.pattern;
    }

    public final String getPrefillText() {
        return this.prefillText;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.type.hashCode() * 31, 31, this.label);
        String str = this.labelExtension;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.prefillText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fieldType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isRequired;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.maxLength;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.minLength;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.pattern;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.example;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.autoCompleteField;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.customErrorKey;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        DropdownLookup dropdownLookup = this.dropdownLookup;
        int iHashCode11 = (iHashCode10 + (dropdownLookup == null ? 0 : dropdownLookup.hashCode())) * 31;
        Boolean bool2 = this.isReadOnly;
        return iHashCode11 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final Boolean isReadOnly() {
        return this.isReadOnly;
    }

    public final Boolean isRequired() {
        return this.isRequired;
    }

    public String toString() {
        String str = this.type;
        String str2 = this.label;
        String str3 = this.labelExtension;
        String str4 = this.prefillText;
        String str5 = this.fieldType;
        Boolean bool = this.isRequired;
        Integer num = this.maxLength;
        Integer num2 = this.minLength;
        String str6 = this.pattern;
        String str7 = this.example;
        String str8 = this.autoCompleteField;
        String str9 = this.customErrorKey;
        DropdownLookup dropdownLookup = this.dropdownLookup;
        Boolean bool2 = this.isReadOnly;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ShippingAddressField(type=", str, ", label=", str2, ", labelExtension=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", prefillText=", str4, ", fieldType=");
        AbstractC36095b.m114692t(bool, str5, ", isRequired=", ", maxLength=", sbM32001t);
        AbstractC31061c.m95621A(sbM32001t, num, ", minLength=", num2, ", pattern=");
        AbstractC11266d.m30444B(sbM32001t, str6, ", example=", str7, ", autoCompleteField=");
        AbstractC11266d.m30444B(sbM32001t, str8, ", customErrorKey=", str9, ", dropdownLookup=");
        sbM32001t.append(dropdownLookup);
        sbM32001t.append(", isReadOnly=");
        sbM32001t.append(bool2);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public ShippingAddressField(String type, String label, String str, String str2, String str3, Boolean bool, Integer num, Integer num2, String str4, String str5, String str6, String str7, DropdownLookup dropdownLookup, Boolean bool2) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(label, "label");
        this.type = type;
        this.label = label;
        this.labelExtension = str;
        this.prefillText = str2;
        this.fieldType = str3;
        this.isRequired = bool;
        this.maxLength = num;
        this.minLength = num2;
        this.pattern = str4;
        this.example = str5;
        this.autoCompleteField = str6;
        this.customErrorKey = str7;
        this.dropdownLookup = dropdownLookup;
        this.isReadOnly = bool2;
    }

    public /* synthetic */ ShippingAddressField(String str, String str2, String str3, String str4, String str5, Boolean bool, Integer num, Integer num2, String str6, String str7, String str8, String str9, DropdownLookup dropdownLookup, Boolean bool2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? null : bool, (i13 & 64) != 0 ? null : num, (i13 & 128) != 0 ? null : num2, (i13 & 256) != 0 ? null : str6, (i13 & 512) != 0 ? null : str7, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str8, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str9, (i13 & 4096) != 0 ? null : dropdownLookup, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : bool2);
    }
}
