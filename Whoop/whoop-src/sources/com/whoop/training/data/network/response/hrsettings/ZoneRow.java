package com.whoop.training.data.network.response.hrsettings;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJB\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u001dJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b-\u0010\u001d¨\u00061"}, m65681d2 = {"Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;", "", "", "style", "label", "id", "", "min", "max", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$training_release", "(Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()I", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStyle", "getLabel", "getId", "I", "getMin", "getMax", "Companion", "$serializer", "a", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ZoneRow {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("id")
    private final String id;

    @SerializedName("label")
    private final String label;

    @SerializedName("max")
    private final int max;

    @SerializedName("min")
    private final int min;

    @SerializedName("style")
    private final String style;

    /* JADX INFO: renamed from: com.whoop.training.data.network.response.hrsettings.ZoneRow$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/training/data/network/response/hrsettings/ZoneRow$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;", "serializer", "()Lwc3/c;", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ZoneRow$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ZoneRow(int i13, String str, String str2, String str3, int i14, int i15, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, ZoneRow$$serializer.INSTANCE.getDescriptor());
        }
        this.style = str;
        this.label = str2;
        this.id = str3;
        this.min = i14;
        this.max = i15;
    }

    public static /* synthetic */ ZoneRow copy$default(ZoneRow zoneRow, String str, String str2, String str3, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = zoneRow.style;
        }
        if ((i15 & 2) != 0) {
            str2 = zoneRow.label;
        }
        if ((i15 & 4) != 0) {
            str3 = zoneRow.id;
        }
        if ((i15 & 8) != 0) {
            i13 = zoneRow.min;
        }
        if ((i15 & 16) != 0) {
            i14 = zoneRow.max;
        }
        int i16 = i14;
        String str4 = str3;
        return zoneRow.copy(str, str2, str4, i13, i16);
    }

    public static final /* synthetic */ void write$Self$training_release(ZoneRow self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.style);
        output.encodeStringElement(serialDesc, 1, self.label);
        output.encodeStringElement(serialDesc, 2, self.id);
        output.encodeIntElement(serialDesc, 3, self.min);
        output.encodeIntElement(serialDesc, 4, self.max);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMin() {
        return this.min;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    public final ZoneRow copy(String style, String label, String id4, int min, int max) {
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(id4, "id");
        return new ZoneRow(style, label, id4, min, max);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ZoneRow)) {
            return false;
        }
        ZoneRow zoneRow = (ZoneRow) other;
        return AbstractC22676k.m65745e(this.style, zoneRow.style) && AbstractC22676k.m65745e(this.label, zoneRow.label) && AbstractC22676k.m65745e(this.id, zoneRow.id) && this.min == zoneRow.min && this.max == zoneRow.max;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getMax() {
        return this.max;
    }

    public final int getMin() {
        return this.min;
    }

    public final String getStyle() {
        return this.style;
    }

    public int hashCode() {
        return Integer.hashCode(this.max) + AbstractC11266d.m30448b(this.min, AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.style.hashCode() * 31, 31, this.label), 31, this.id), 31);
    }

    public String toString() {
        String str = this.style;
        String str2 = this.label;
        String str3 = this.id;
        int i13 = this.min;
        int i14 = this.max;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ZoneRow(style=", str, ", label=", str2, ", id=");
        AbstractC11266d.m30470x(i13, str3, ", min=", ", max=", sbM32001t);
        return AbstractC18489d0.m53371l(sbM32001t, i14, ")");
    }

    public ZoneRow(String style, String label, String id4, int i13, int i14) {
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(id4, "id");
        this.style = style;
        this.label = label;
        this.id = id4;
        this.min = i13;
        this.max = i14;
    }
}
