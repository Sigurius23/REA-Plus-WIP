package com.whoop.advancedlabs.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ<\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b.\u0010\u001a¨\u00061"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/BiomarkerUpdateItem;", "", "", "id", "", "included", "", "value", "unit", "<init>", "(Ljava/lang/String;ZLjava/lang/Double;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZLjava/lang/Double;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/BiomarkerUpdateItem;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Ljava/lang/Double;", "component4", "copy", "(Ljava/lang/String;ZLjava/lang/Double;Ljava/lang/String;)Lcom/whoop/advancedlabs/domain/models/BiomarkerUpdateItem;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Z", "getIncluded", "Ljava/lang/Double;", "getValue", "getUnit", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BiomarkerUpdateItem {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String id;
    private final boolean included;
    private final String unit;
    private final Double value;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/BiomarkerUpdateItem$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/BiomarkerUpdateItem;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BiomarkerUpdateItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BiomarkerUpdateItem(int i13, String str, boolean z4, Double d3, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, BiomarkerUpdateItem$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.included = z4;
        if ((i13 & 4) == 0) {
            this.value = null;
        } else {
            this.value = d3;
        }
        if ((i13 & 8) == 0) {
            this.unit = null;
        } else {
            this.unit = str2;
        }
    }

    public static /* synthetic */ BiomarkerUpdateItem copy$default(BiomarkerUpdateItem biomarkerUpdateItem, String str, boolean z4, Double d3, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = biomarkerUpdateItem.id;
        }
        if ((i13 & 2) != 0) {
            z4 = biomarkerUpdateItem.included;
        }
        if ((i13 & 4) != 0) {
            d3 = biomarkerUpdateItem.value;
        }
        if ((i13 & 8) != 0) {
            str2 = biomarkerUpdateItem.unit;
        }
        return biomarkerUpdateItem.copy(str, z4, d3, str2);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(BiomarkerUpdateItem self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeBooleanElement(serialDesc, 1, self.included);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.value != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, DoubleSerializer.INSTANCE, self.value);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.unit == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.unit);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIncluded() {
        return this.included;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    public final BiomarkerUpdateItem copy(String id4, boolean included, Double value, String unit) {
        AbstractC22676k.m65750j(id4, "id");
        return new BiomarkerUpdateItem(id4, included, value, unit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BiomarkerUpdateItem)) {
            return false;
        }
        BiomarkerUpdateItem biomarkerUpdateItem = (BiomarkerUpdateItem) other;
        return AbstractC22676k.m65745e(this.id, biomarkerUpdateItem.id) && this.included == biomarkerUpdateItem.included && AbstractC22676k.m65745e(this.value, biomarkerUpdateItem.value) && AbstractC22676k.m65745e(this.unit, biomarkerUpdateItem.unit);
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getIncluded() {
        return this.included;
    }

    public final String getUnit() {
        return this.unit;
    }

    public final Double getValue() {
        return this.value;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(this.id.hashCode() * 31, 31, this.included);
        Double d3 = this.value;
        int iHashCode = (iM8289b + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str = this.unit;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        boolean z4 = this.included;
        Double d3 = this.value;
        String str2 = this.unit;
        StringBuilder sbM73379l = AbstractC25012a.m73379l("BiomarkerUpdateItem(id=", str, ", included=", ", value=", z4);
        sbM73379l.append(d3);
        sbM73379l.append(", unit=");
        sbM73379l.append(str2);
        sbM73379l.append(")");
        return sbM73379l.toString();
    }

    public BiomarkerUpdateItem(String id4, boolean z4, Double d3, String str) {
        AbstractC22676k.m65750j(id4, "id");
        this.id = id4;
        this.included = z4;
        this.value = d3;
        this.unit = str;
    }

    public /* synthetic */ BiomarkerUpdateItem(String str, boolean z4, Double d3, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z4, (i13 & 4) != 0 ? null : d3, (i13 & 8) != 0 ? null : str2);
    }
}
