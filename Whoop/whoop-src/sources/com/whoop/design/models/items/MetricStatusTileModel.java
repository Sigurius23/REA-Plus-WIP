package com.whoop.design.models.items;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import md1.C25452a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import te0.AbstractC33745d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JV\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b3\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b4\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010#¨\u0006;"}, m65681d2 = {"Lcom/whoop/design/models/items/MetricStatusTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "value", "valueSuffix", "Lcom/whoop/design/models/items/TagModel;", NotificationCompat.CATEGORY_STATUS, "Lcom/whoop/design/models/items/SecondaryButtonModel;", "updateButton", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/design/models/items/SecondaryButtonModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/design/models/items/SecondaryButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/MetricStatusTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "component4", "component5", "()Lcom/whoop/design/models/items/TagModel;", "component6", "()Lcom/whoop/design/models/items/SecondaryButtonModel;", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/design/models/items/SecondaryButtonModel;)Lcom/whoop/design/models/items/MetricStatusTileModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getTitle", "getSubtitle", "getValue", "getValueSuffix", "Lcom/whoop/design/models/items/TagModel;", "getStatus", "Lcom/whoop/design/models/items/SecondaryButtonModel;", "getUpdateButton", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MetricStatusTileModel implements DesignSystemModel {
    private final TagModel status;
    private final TextResource subtitle;
    private final TextResource title;
    private final SecondaryButtonModel updateButton;
    private final TextResource value;
    private final TextResource valueSuffix;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/MetricStatusTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/MetricStatusTileModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MetricStatusTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MetricStatusTileModel(int i13, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, TagModel tagModel, SecondaryButtonModel secondaryButtonModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, MetricStatusTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = textResource;
        this.subtitle = textResource2;
        this.value = textResource3;
        this.valueSuffix = textResource4;
        this.status = tagModel;
        this.updateButton = secondaryButtonModel;
    }

    public static /* synthetic */ MetricStatusTileModel copy$default(MetricStatusTileModel metricStatusTileModel, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, TagModel tagModel, SecondaryButtonModel secondaryButtonModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = metricStatusTileModel.title;
        }
        if ((i13 & 2) != 0) {
            textResource2 = metricStatusTileModel.subtitle;
        }
        if ((i13 & 4) != 0) {
            textResource3 = metricStatusTileModel.value;
        }
        if ((i13 & 8) != 0) {
            textResource4 = metricStatusTileModel.valueSuffix;
        }
        if ((i13 & 16) != 0) {
            tagModel = metricStatusTileModel.status;
        }
        if ((i13 & 32) != 0) {
            secondaryButtonModel = metricStatusTileModel.updateButton;
        }
        TagModel tagModel2 = tagModel;
        SecondaryButtonModel secondaryButtonModel2 = secondaryButtonModel;
        return metricStatusTileModel.copy(textResource, textResource2, textResource3, textResource4, tagModel2, secondaryButtonModel2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(MetricStatusTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 0, c25452a, self.title);
        output.encodeNullableSerializableElement(serialDesc, 1, c25452a, self.subtitle);
        output.encodeNullableSerializableElement(serialDesc, 2, c25452a, self.value);
        output.encodeNullableSerializableElement(serialDesc, 3, c25452a, self.valueSuffix);
        output.encodeNullableSerializableElement(serialDesc, 4, TagModel$$serializer.INSTANCE, self.status);
        output.encodeNullableSerializableElement(serialDesc, 5, SecondaryButtonModel$$serializer.INSTANCE, self.updateButton);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TextResource getValueSuffix() {
        return this.valueSuffix;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TagModel getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final SecondaryButtonModel getUpdateButton() {
        return this.updateButton;
    }

    public final MetricStatusTileModel copy(TextResource title, TextResource subtitle, TextResource value, TextResource valueSuffix, TagModel status, SecondaryButtonModel updateButton) {
        AbstractC22676k.m65750j(title, "title");
        return new MetricStatusTileModel(title, subtitle, value, valueSuffix, status, updateButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetricStatusTileModel)) {
            return false;
        }
        MetricStatusTileModel metricStatusTileModel = (MetricStatusTileModel) other;
        return AbstractC22676k.m65745e(this.title, metricStatusTileModel.title) && AbstractC22676k.m65745e(this.subtitle, metricStatusTileModel.subtitle) && AbstractC22676k.m65745e(this.value, metricStatusTileModel.value) && AbstractC22676k.m65745e(this.valueSuffix, metricStatusTileModel.valueSuffix) && AbstractC22676k.m65745e(this.status, metricStatusTileModel.status) && AbstractC22676k.m65745e(this.updateButton, metricStatusTileModel.updateButton);
    }

    public final TagModel getStatus() {
        return this.status;
    }

    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public final SecondaryButtonModel getUpdateButton() {
        return this.updateButton;
    }

    public final TextResource getValue() {
        return this.value;
    }

    public final TextResource getValueSuffix() {
        return this.valueSuffix;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        TextResource textResource = this.subtitle;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        TextResource textResource2 = this.value;
        int iHashCode3 = (iHashCode2 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        TextResource textResource3 = this.valueSuffix;
        int iHashCode4 = (iHashCode3 + (textResource3 == null ? 0 : textResource3.hashCode())) * 31;
        TagModel tagModel = this.status;
        int iHashCode5 = (iHashCode4 + (tagModel == null ? 0 : tagModel.hashCode())) * 31;
        SecondaryButtonModel secondaryButtonModel = this.updateButton;
        return iHashCode5 + (secondaryButtonModel != null ? secondaryButtonModel.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        TextResource textResource3 = this.value;
        TextResource textResource4 = this.valueSuffix;
        TagModel tagModel = this.status;
        SecondaryButtonModel secondaryButtonModel = this.updateButton;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("MetricStatusTileModel(title=", textResource, ", subtitle=", textResource2, ", value=");
        AbstractC30007c.m91855y(sbM106658q, textResource3, ", valueSuffix=", textResource4, ", status=");
        sbM106658q.append(tagModel);
        sbM106658q.append(", updateButton=");
        sbM106658q.append(secondaryButtonModel);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public MetricStatusTileModel(TextResource title, TextResource textResource, TextResource textResource2, TextResource textResource3, TagModel tagModel, SecondaryButtonModel secondaryButtonModel) {
        AbstractC22676k.m65750j(title, "title");
        this.title = title;
        this.subtitle = textResource;
        this.value = textResource2;
        this.valueSuffix = textResource3;
        this.status = tagModel;
        this.updateButton = secondaryButtonModel;
    }
}
