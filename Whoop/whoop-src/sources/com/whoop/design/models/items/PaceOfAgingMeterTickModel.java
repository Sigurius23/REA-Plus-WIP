package com.whoop.design.models.items;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J<\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b\u0006\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b*\u0010\u0019¨\u0006-"}, m65681d2 = {"Lcom/whoop/design/models/items/PaceOfAgingMeterTickModel;", "", "", "topValueDisplay", "bottomValueDisplay", "", "isCurrentValue", "style", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/PaceOfAgingMeterTickModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lcom/whoop/design/models/items/PaceOfAgingMeterTickModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTopValueDisplay", "getBottomValueDisplay", "Z", "getStyle", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PaceOfAgingMeterTickModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String bottomValueDisplay;
    private final boolean isCurrentValue;
    private final String style;
    private final String topValueDisplay;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/PaceOfAgingMeterTickModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/PaceOfAgingMeterTickModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PaceOfAgingMeterTickModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PaceOfAgingMeterTickModel(int i13, String str, String str2, boolean z4, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, PaceOfAgingMeterTickModel$$serializer.INSTANCE.getDescriptor());
        }
        this.topValueDisplay = str;
        this.bottomValueDisplay = str2;
        this.isCurrentValue = z4;
        this.style = str3;
    }

    public static /* synthetic */ PaceOfAgingMeterTickModel copy$default(PaceOfAgingMeterTickModel paceOfAgingMeterTickModel, String str, String str2, boolean z4, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = paceOfAgingMeterTickModel.topValueDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = paceOfAgingMeterTickModel.bottomValueDisplay;
        }
        if ((i13 & 4) != 0) {
            z4 = paceOfAgingMeterTickModel.isCurrentValue;
        }
        if ((i13 & 8) != 0) {
            str3 = paceOfAgingMeterTickModel.style;
        }
        return paceOfAgingMeterTickModel.copy(str, str2, z4, str3);
    }

    public static final /* synthetic */ void write$Self$design_models_release(PaceOfAgingMeterTickModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.topValueDisplay);
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.bottomValueDisplay);
        output.encodeBooleanElement(serialDesc, 2, self.isCurrentValue);
        output.encodeStringElement(serialDesc, 3, self.style);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTopValueDisplay() {
        return this.topValueDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBottomValueDisplay() {
        return this.bottomValueDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsCurrentValue() {
        return this.isCurrentValue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    public final PaceOfAgingMeterTickModel copy(String topValueDisplay, String bottomValueDisplay, boolean isCurrentValue, String style) {
        AbstractC22676k.m65750j(style, "style");
        return new PaceOfAgingMeterTickModel(topValueDisplay, bottomValueDisplay, isCurrentValue, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaceOfAgingMeterTickModel)) {
            return false;
        }
        PaceOfAgingMeterTickModel paceOfAgingMeterTickModel = (PaceOfAgingMeterTickModel) other;
        return AbstractC22676k.m65745e(this.topValueDisplay, paceOfAgingMeterTickModel.topValueDisplay) && AbstractC22676k.m65745e(this.bottomValueDisplay, paceOfAgingMeterTickModel.bottomValueDisplay) && this.isCurrentValue == paceOfAgingMeterTickModel.isCurrentValue && AbstractC22676k.m65745e(this.style, paceOfAgingMeterTickModel.style);
    }

    public final String getBottomValueDisplay() {
        return this.bottomValueDisplay;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getTopValueDisplay() {
        return this.topValueDisplay;
    }

    public int hashCode() {
        String str = this.topValueDisplay;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bottomValueDisplay;
        return this.style.hashCode() + AbstractC2875y.m8289b((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.isCurrentValue);
    }

    public final boolean isCurrentValue() {
        return this.isCurrentValue;
    }

    public String toString() {
        String str = this.topValueDisplay;
        String str2 = this.bottomValueDisplay;
        return AbstractC21702c.m61139j(AbstractC11895b.m32001t("PaceOfAgingMeterTickModel(topValueDisplay=", str, ", bottomValueDisplay=", str2, ", isCurrentValue="), this.isCurrentValue, ", style=", this.style, ")");
    }

    public PaceOfAgingMeterTickModel(String str, String str2, boolean z4, String style) {
        AbstractC22676k.m65750j(style, "style");
        this.topValueDisplay = str;
        this.bottomValueDisplay = str2;
        this.isCurrentValue = z4;
        this.style = style;
    }
}
