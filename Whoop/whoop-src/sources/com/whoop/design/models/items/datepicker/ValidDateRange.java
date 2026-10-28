package com.whoop.design.models.items.datepicker;

import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ@\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b,\u0010\u001c¨\u0006/"}, m65681d2 = {"Lcom/whoop/design/models/items/datepicker/ValidDateRange;", "", "", "minDate", "maxDate", "Lcom/whoop/navigation/models/GenericInteraction;", "validRangeAction", "invalidRangeAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/datepicker/ValidDateRange;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/navigation/models/GenericInteraction;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/design/models/items/datepicker/ValidDateRange;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMinDate", "getMaxDate", "Lcom/whoop/navigation/models/GenericInteraction;", "getValidRangeAction", "getInvalidRangeAction", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ValidDateRange {
    private final GenericInteraction invalidRangeAction;
    private final String maxDate;
    private final String minDate;
    private final GenericInteraction validRangeAction;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericInteraction.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/datepicker/ValidDateRange$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/datepicker/ValidDateRange;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ValidDateRange$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ValidDateRange() {
        this((String) null, (String) null, (GenericInteraction) null, (GenericInteraction) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ValidDateRange copy$default(ValidDateRange validDateRange, String str, String str2, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = validDateRange.minDate;
        }
        if ((i13 & 2) != 0) {
            str2 = validDateRange.maxDate;
        }
        if ((i13 & 4) != 0) {
            genericInteraction = validDateRange.validRangeAction;
        }
        if ((i13 & 8) != 0) {
            genericInteraction2 = validDateRange.invalidRangeAction;
        }
        return validDateRange.copy(str, str2, genericInteraction, genericInteraction2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ValidDateRange self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.minDate != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.minDate);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.maxDate != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.maxDate);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.validRangeAction != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, GenericInteraction$$serializer.INSTANCE, self.validRangeAction);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.invalidRangeAction == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, GenericInteraction$$serializer.INSTANCE, self.invalidRangeAction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMinDate() {
        return this.minDate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMaxDate() {
        return this.maxDate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final GenericInteraction getValidRangeAction() {
        return this.validRangeAction;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final GenericInteraction getInvalidRangeAction() {
        return this.invalidRangeAction;
    }

    public final ValidDateRange copy(String minDate, String maxDate, GenericInteraction validRangeAction, GenericInteraction invalidRangeAction) {
        return new ValidDateRange(minDate, maxDate, validRangeAction, invalidRangeAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValidDateRange)) {
            return false;
        }
        ValidDateRange validDateRange = (ValidDateRange) other;
        return AbstractC22676k.m65745e(this.minDate, validDateRange.minDate) && AbstractC22676k.m65745e(this.maxDate, validDateRange.maxDate) && AbstractC22676k.m65745e(this.validRangeAction, validDateRange.validRangeAction) && AbstractC22676k.m65745e(this.invalidRangeAction, validDateRange.invalidRangeAction);
    }

    public final GenericInteraction getInvalidRangeAction() {
        return this.invalidRangeAction;
    }

    public final String getMaxDate() {
        return this.maxDate;
    }

    public final String getMinDate() {
        return this.minDate;
    }

    public final GenericInteraction getValidRangeAction() {
        return this.validRangeAction;
    }

    public int hashCode() {
        String str = this.minDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.maxDate;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        GenericInteraction genericInteraction = this.validRangeAction;
        int iHashCode3 = (iHashCode2 + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        GenericInteraction genericInteraction2 = this.invalidRangeAction;
        return iHashCode3 + (genericInteraction2 != null ? genericInteraction2.hashCode() : 0);
    }

    public String toString() {
        String str = this.minDate;
        String str2 = this.maxDate;
        GenericInteraction genericInteraction = this.validRangeAction;
        GenericInteraction genericInteraction2 = this.invalidRangeAction;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ValidDateRange(minDate=", str, ", maxDate=", str2, ", validRangeAction=");
        sbM32001t.append(genericInteraction);
        sbM32001t.append(", invalidRangeAction=");
        sbM32001t.append(genericInteraction2);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ ValidDateRange(int i13, String str, String str2, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.minDate = null;
        } else {
            this.minDate = str;
        }
        if ((i13 & 2) == 0) {
            this.maxDate = null;
        } else {
            this.maxDate = str2;
        }
        if ((i13 & 4) == 0) {
            this.validRangeAction = null;
        } else {
            this.validRangeAction = genericInteraction;
        }
        if ((i13 & 8) == 0) {
            this.invalidRangeAction = null;
        } else {
            this.invalidRangeAction = genericInteraction2;
        }
    }

    public ValidDateRange(String str, String str2, GenericInteraction genericInteraction, GenericInteraction genericInteraction2) {
        this.minDate = str;
        this.maxDate = str2;
        this.validRangeAction = genericInteraction;
        this.invalidRangeAction = genericInteraction2;
    }

    public /* synthetic */ ValidDateRange(String str, String str2, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : genericInteraction, (i13 & 8) != 0 ? null : genericInteraction2);
    }
}
