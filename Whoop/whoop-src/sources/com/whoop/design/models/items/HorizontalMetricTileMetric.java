package com.whoop.design.models.items;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import md1.C25452a;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u0006/"}, m65681d2 = {"Lcom/whoop/design/models/items/HorizontalMetricTileMetric;", "", "", "statusIcon", NotificationCompat.CATEGORY_STATUS, "icon", "Lcom/whoop/design/util/TextResource;", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/HorizontalMetricTileMetric;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/design/util/TextResource;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/models/items/HorizontalMetricTileMetric;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStatusIcon", "getStatus", "getIcon", "Lcom/whoop/design/util/TextResource;", "getText", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HorizontalMetricTileMetric {
    private final String icon;
    private final String status;
    private final String statusIcon;
    private final TextResource text;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/HorizontalMetricTileMetric$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/HorizontalMetricTileMetric;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HorizontalMetricTileMetric$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HorizontalMetricTileMetric(int i13, String str, String str2, String str3, TextResource textResource, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, HorizontalMetricTileMetric$$serializer.INSTANCE.getDescriptor());
        }
        this.statusIcon = str;
        this.status = str2;
        this.icon = str3;
        this.text = textResource;
    }

    public static /* synthetic */ HorizontalMetricTileMetric copy$default(HorizontalMetricTileMetric horizontalMetricTileMetric, String str, String str2, String str3, TextResource textResource, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = horizontalMetricTileMetric.statusIcon;
        }
        if ((i13 & 2) != 0) {
            str2 = horizontalMetricTileMetric.status;
        }
        if ((i13 & 4) != 0) {
            str3 = horizontalMetricTileMetric.icon;
        }
        if ((i13 & 8) != 0) {
            textResource = horizontalMetricTileMetric.text;
        }
        return horizontalMetricTileMetric.copy(str, str2, str3, textResource);
    }

    public static final /* synthetic */ void write$Self$design_models_release(HorizontalMetricTileMetric self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.statusIcon);
        output.encodeStringElement(serialDesc, 1, self.status);
        output.encodeStringElement(serialDesc, 2, self.icon);
        output.encodeSerializableElement(serialDesc, 3, C25452a.f99689a, self.text);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatusIcon() {
        return this.statusIcon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    public final HorizontalMetricTileMetric copy(String statusIcon, String status, String icon, TextResource text) {
        AbstractC22676k.m65750j(statusIcon, "statusIcon");
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(text, "text");
        return new HorizontalMetricTileMetric(statusIcon, status, icon, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HorizontalMetricTileMetric)) {
            return false;
        }
        HorizontalMetricTileMetric horizontalMetricTileMetric = (HorizontalMetricTileMetric) other;
        return AbstractC22676k.m65745e(this.statusIcon, horizontalMetricTileMetric.statusIcon) && AbstractC22676k.m65745e(this.status, horizontalMetricTileMetric.status) && AbstractC22676k.m65745e(this.icon, horizontalMetricTileMetric.icon) && AbstractC22676k.m65745e(this.text, horizontalMetricTileMetric.text);
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getStatusIcon() {
        return this.statusIcon;
    }

    public final TextResource getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.statusIcon.hashCode() * 31, 31, this.status), 31, this.icon);
    }

    public String toString() {
        String str = this.statusIcon;
        String str2 = this.status;
        String str3 = this.icon;
        TextResource textResource = this.text;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HorizontalMetricTileMetric(statusIcon=", str, ", status=", str2, ", icon=");
        sbM32001t.append(str3);
        sbM32001t.append(", text=");
        sbM32001t.append(textResource);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public HorizontalMetricTileMetric(String statusIcon, String status, String icon, TextResource text) {
        AbstractC22676k.m65750j(statusIcon, "statusIcon");
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(text, "text");
        this.statusIcon = statusIcon;
        this.status = status;
        this.icon = icon;
        this.text = text;
    }
}
