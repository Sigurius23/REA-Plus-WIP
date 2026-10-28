package com.whoop.clinicianintheloop.api;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gm2.C15999a;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/api/HealthIntakeResponse;", "", "TextEntryHealthIntakeResponse", "HeightWeightHealthIntakeResponse", "Lcom/whoop/clinicianintheloop/api/HealthIntakeResponse$HeightWeightHealthIntakeResponse;", "Lcom/whoop/clinicianintheloop/api/HealthIntakeResponse$TextEntryHealthIntakeResponse;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface HealthIntakeResponse {

    @Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0017J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u001a¨\u0006,"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/api/HealthIntakeResponse$HeightWeightHealthIntakeResponse;", "Lcom/whoop/clinicianintheloop/api/HealthIntakeResponse;", "", "heightValue", "weightValue", "", "unit", "<init>", "(IILjava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$clinician_in_the_loop_release", "(Lcom/whoop/clinicianintheloop/api/HealthIntakeResponse$HeightWeightHealthIntakeResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "component3", "()Ljava/lang/String;", "copy", "(IILjava/lang/String;)Lcom/whoop/clinicianintheloop/api/HealthIntakeResponse$HeightWeightHealthIntakeResponse;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getHeightValue", "getWeightValue", "Ljava/lang/String;", "getUnit", "Companion", "$serializer", "a", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class HeightWeightHealthIntakeResponse implements HealthIntakeResponse {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final int heightValue;
        private final String unit;
        private final int weightValue;

        /* JADX INFO: renamed from: com.whoop.clinicianintheloop.api.HealthIntakeResponse$HeightWeightHealthIntakeResponse$a, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/api/HealthIntakeResponse$HeightWeightHealthIntakeResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/clinicianintheloop/api/HealthIntakeResponse$HeightWeightHealthIntakeResponse;", "serializer", "()Lwc3/c;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC37138c serializer() {
                return C6137xf05fabf5.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ HeightWeightHealthIntakeResponse(int i13, int i14, int i15, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i13 & 7)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 7, C6137xf05fabf5.INSTANCE.getDescriptor());
            }
            this.heightValue = i14;
            this.weightValue = i15;
            this.unit = str;
        }

        public static /* synthetic */ HeightWeightHealthIntakeResponse copy$default(HeightWeightHealthIntakeResponse heightWeightHealthIntakeResponse, int i13, int i14, String str, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                i13 = heightWeightHealthIntakeResponse.heightValue;
            }
            if ((i15 & 2) != 0) {
                i14 = heightWeightHealthIntakeResponse.weightValue;
            }
            if ((i15 & 4) != 0) {
                str = heightWeightHealthIntakeResponse.unit;
            }
            return heightWeightHealthIntakeResponse.copy(i13, i14, str);
        }

        public static final /* synthetic */ void write$Self$clinician_in_the_loop_release(HeightWeightHealthIntakeResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            output.encodeIntElement(serialDesc, 0, self.heightValue);
            output.encodeIntElement(serialDesc, 1, self.weightValue);
            output.encodeStringElement(serialDesc, 2, self.unit);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getHeightValue() {
            return this.heightValue;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getWeightValue() {
            return this.weightValue;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getUnit() {
            return this.unit;
        }

        public final HeightWeightHealthIntakeResponse copy(int heightValue, int weightValue, String unit) {
            AbstractC22676k.m65750j(unit, "unit");
            return new HeightWeightHealthIntakeResponse(heightValue, weightValue, unit);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeightWeightHealthIntakeResponse)) {
                return false;
            }
            HeightWeightHealthIntakeResponse heightWeightHealthIntakeResponse = (HeightWeightHealthIntakeResponse) other;
            return this.heightValue == heightWeightHealthIntakeResponse.heightValue && this.weightValue == heightWeightHealthIntakeResponse.weightValue && AbstractC22676k.m65745e(this.unit, heightWeightHealthIntakeResponse.unit);
        }

        public final int getHeightValue() {
            return this.heightValue;
        }

        public final String getUnit() {
            return this.unit;
        }

        public final int getWeightValue() {
            return this.weightValue;
        }

        public int hashCode() {
            return this.unit.hashCode() + AbstractC11266d.m30448b(this.weightValue, Integer.hashCode(this.heightValue) * 31, 31);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.unit, ")", AbstractC11266d.m30465s(this.heightValue, this.weightValue, "HeightWeightHealthIntakeResponse(heightValue=", ", weightValue=", ", unit="));
        }

        public HeightWeightHealthIntakeResponse(int i13, int i14, String unit) {
            AbstractC22676k.m65750j(unit, "unit");
            this.heightValue = i13;
            this.weightValue = i14;
            this.unit = unit;
        }
    }

    @Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B%\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ.\u0010\u001b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001a¨\u0006-"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/api/HealthIntakeResponse$TextEntryHealthIntakeResponse;", "Lcom/whoop/clinicianintheloop/api/HealthIntakeResponse;", "", "Lcom/whoop/clinicianintheloop/api/HealthIntakeEntryResponse;", "entries", "", "checkbox", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$clinician_in_the_loop_release", "(Lcom/whoop/clinicianintheloop/api/HealthIntakeResponse$TextEntryHealthIntakeResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/Boolean;", "copy", "(Ljava/util/List;Ljava/lang/Boolean;)Lcom/whoop/clinicianintheloop/api/HealthIntakeResponse$TextEntryHealthIntakeResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getEntries", "Ljava/lang/Boolean;", "getCheckbox", "Companion", "$serializer", "a", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class TextEntryHealthIntakeResponse implements HealthIntakeResponse {
        private final Boolean checkbox;
        private final List<HealthIntakeEntryResponse> entries;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;
        private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C15999a(6)), null};

        /* JADX INFO: renamed from: com.whoop.clinicianintheloop.api.HealthIntakeResponse$TextEntryHealthIntakeResponse$a, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/api/HealthIntakeResponse$TextEntryHealthIntakeResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/clinicianintheloop/api/HealthIntakeResponse$TextEntryHealthIntakeResponse;", "serializer", "()Lwc3/c;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC37138c serializer() {
                return HealthIntakeResponse$TextEntryHealthIntakeResponse$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TextEntryHealthIntakeResponse() {
            this((List) null, (Boolean) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
            return new ArrayListSerializer(HealthIntakeEntryResponse$$serializer.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TextEntryHealthIntakeResponse copy$default(TextEntryHealthIntakeResponse textEntryHealthIntakeResponse, List list, Boolean bool, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                list = textEntryHealthIntakeResponse.entries;
            }
            if ((i13 & 2) != 0) {
                bool = textEntryHealthIntakeResponse.checkbox;
            }
            return textEntryHealthIntakeResponse.copy(list, bool);
        }

        public static final /* synthetic */ void write$Self$clinician_in_the_loop_release(TextEntryHealthIntakeResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.entries != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.entries);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.checkbox == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 1, BooleanSerializer.INSTANCE, self.checkbox);
        }

        public final List<HealthIntakeEntryResponse> component1() {
            return this.entries;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getCheckbox() {
            return this.checkbox;
        }

        public final TextEntryHealthIntakeResponse copy(List<HealthIntakeEntryResponse> entries, Boolean checkbox) {
            return new TextEntryHealthIntakeResponse(entries, checkbox);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextEntryHealthIntakeResponse)) {
                return false;
            }
            TextEntryHealthIntakeResponse textEntryHealthIntakeResponse = (TextEntryHealthIntakeResponse) other;
            return AbstractC22676k.m65745e(this.entries, textEntryHealthIntakeResponse.entries) && AbstractC22676k.m65745e(this.checkbox, textEntryHealthIntakeResponse.checkbox);
        }

        public final Boolean getCheckbox() {
            return this.checkbox;
        }

        public final List<HealthIntakeEntryResponse> getEntries() {
            return this.entries;
        }

        public int hashCode() {
            List<HealthIntakeEntryResponse> list = this.entries;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            Boolean bool = this.checkbox;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "TextEntryHealthIntakeResponse(entries=" + this.entries + ", checkbox=" + this.checkbox + ")";
        }

        public /* synthetic */ TextEntryHealthIntakeResponse(int i13, List list, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i13 & 1) == 0) {
                this.entries = null;
            } else {
                this.entries = list;
            }
            if ((i13 & 2) == 0) {
                this.checkbox = null;
            } else {
                this.checkbox = bool;
            }
        }

        public TextEntryHealthIntakeResponse(List<HealthIntakeEntryResponse> list, Boolean bool) {
            this.entries = list;
            this.checkbox = bool;
        }

        public /* synthetic */ TextEntryHealthIntakeResponse(List list, Boolean bool, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : list, (i13 & 2) != 0 ? null : bool);
        }
    }
}
