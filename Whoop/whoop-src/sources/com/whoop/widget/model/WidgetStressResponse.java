package com.whoop.widget.model;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fw0.C14833a;
import hc3.AbstractC17176i;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ:\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b/\u0010\u001c¨\u00063"}, m65681d2 = {"Lcom/whoop/widget/model/WidgetStressResponse;", "", "Lcom/whoop/widget/model/WidgetStressState;", "state", "", "valueDisplay", "", "percentage", "bucketDisplay", "<init>", "(Lcom/whoop/widget/model/WidgetStressState;Ljava/lang/String;DLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/widget/model/WidgetStressState;Ljava/lang/String;DLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$widget_release", "(Lcom/whoop/widget/model/WidgetStressResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/widget/model/WidgetStressState;", "component2", "()Ljava/lang/String;", "component3", "()D", "component4", "copy", "(Lcom/whoop/widget/model/WidgetStressState;Ljava/lang/String;DLjava/lang/String;)Lcom/whoop/widget/model/WidgetStressResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/widget/model/WidgetStressState;", "getState", "Ljava/lang/String;", "getValueDisplay", "D", "getPercentage", "getBucketDisplay", "Companion", "$serializer", "a", "widget_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WidgetStressResponse {
    public static final int $stable = 0;
    private final String bucketDisplay;
    private final double percentage;
    private final WidgetStressState state;
    private final String valueDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C14833a(13)), null, null, null};

    /* JADX INFO: renamed from: com.whoop.widget.model.WidgetStressResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/widget/model/WidgetStressResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/widget/model/WidgetStressResponse;", "serializer", "()Lwc3/c;", "widget_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WidgetStressResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WidgetStressResponse(int i13, WidgetStressState widgetStressState, String str, double d3, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (14 != (i13 & 14)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 14, WidgetStressResponse$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.state = WidgetStressState.NO_DATA;
        } else {
            this.state = widgetStressState;
        }
        this.valueDisplay = str;
        this.percentage = d3;
        this.bucketDisplay = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return WidgetStressState.INSTANCE.serializer();
    }

    public static /* synthetic */ WidgetStressResponse copy$default(WidgetStressResponse widgetStressResponse, WidgetStressState widgetStressState, String str, double d3, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            widgetStressState = widgetStressResponse.state;
        }
        if ((i13 & 2) != 0) {
            str = widgetStressResponse.valueDisplay;
        }
        if ((i13 & 4) != 0) {
            d3 = widgetStressResponse.percentage;
        }
        if ((i13 & 8) != 0) {
            str2 = widgetStressResponse.bucketDisplay;
        }
        String str3 = str2;
        return widgetStressResponse.copy(widgetStressState, str, d3, str3);
    }

    public static final /* synthetic */ void write$Self$widget_release(WidgetStressResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.state != WidgetStressState.NO_DATA) {
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.state);
        }
        output.encodeStringElement(serialDesc, 1, self.valueDisplay);
        output.encodeDoubleElement(serialDesc, 2, self.percentage);
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.bucketDisplay);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WidgetStressState getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValueDisplay() {
        return this.valueDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getPercentage() {
        return this.percentage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBucketDisplay() {
        return this.bucketDisplay;
    }

    public final WidgetStressResponse copy(WidgetStressState state, String valueDisplay, double percentage, String bucketDisplay) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(valueDisplay, "valueDisplay");
        return new WidgetStressResponse(state, valueDisplay, percentage, bucketDisplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetStressResponse)) {
            return false;
        }
        WidgetStressResponse widgetStressResponse = (WidgetStressResponse) other;
        return this.state == widgetStressResponse.state && AbstractC22676k.m65745e(this.valueDisplay, widgetStressResponse.valueDisplay) && Double.compare(this.percentage, widgetStressResponse.percentage) == 0 && AbstractC22676k.m65745e(this.bucketDisplay, widgetStressResponse.bucketDisplay);
    }

    public final String getBucketDisplay() {
        return this.bucketDisplay;
    }

    public final double getPercentage() {
        return this.percentage;
    }

    public final WidgetStressState getState() {
        return this.state;
    }

    public final String getValueDisplay() {
        return this.valueDisplay;
    }

    public int hashCode() {
        int iM48499a = AbstractC17176i.m48499a(AbstractC11266d.m30450d(this.state.hashCode() * 31, 31, this.valueDisplay), 31, this.percentage);
        String str = this.bucketDisplay;
        return iM48499a + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "WidgetStressResponse(state=" + this.state + ", valueDisplay=" + this.valueDisplay + ", percentage=" + this.percentage + ", bucketDisplay=" + this.bucketDisplay + ")";
    }

    public WidgetStressResponse(WidgetStressState state, String valueDisplay, double d3, String str) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(valueDisplay, "valueDisplay");
        this.state = state;
        this.valueDisplay = valueDisplay;
        this.percentage = d3;
        this.bucketDisplay = str;
    }

    public /* synthetic */ WidgetStressResponse(WidgetStressState widgetStressState, String str, double d3, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? WidgetStressState.NO_DATA : widgetStressState, str, d3, str2);
    }
}
