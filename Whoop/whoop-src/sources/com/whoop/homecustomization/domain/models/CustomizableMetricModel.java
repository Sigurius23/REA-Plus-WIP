package com.whoop.homecustomization.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bBU\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001cJN\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u001cJ\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001aJ\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b.\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b/\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b0\u0010\u001c¨\u00063"}, m65681d2 = {"Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;", "", "", "index", "", "icon", "name", "metric", "shortName", "previewIcon", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$home_customization_release", "(Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getIndex", "Ljava/lang/String;", "getIcon", "getName", "getMetric", "getShortName", "getPreviewIcon", "Companion", "$serializer", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CustomizableMetricModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String icon;
    private final int index;
    private final String metric;
    private final String name;
    private final String previewIcon;
    private final String shortName;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;", "serializer", "()Lwc3/c;", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CustomizableMetricModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CustomizableMetricModel(int i13, int i14, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, CustomizableMetricModel$$serializer.INSTANCE.getDescriptor());
        }
        this.index = i14;
        this.icon = str;
        this.name = str2;
        this.metric = str3;
        this.shortName = str4;
        this.previewIcon = str5;
    }

    public static /* synthetic */ CustomizableMetricModel copy$default(CustomizableMetricModel customizableMetricModel, int i13, String str, String str2, String str3, String str4, String str5, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = customizableMetricModel.index;
        }
        if ((i14 & 2) != 0) {
            str = customizableMetricModel.icon;
        }
        if ((i14 & 4) != 0) {
            str2 = customizableMetricModel.name;
        }
        if ((i14 & 8) != 0) {
            str3 = customizableMetricModel.metric;
        }
        if ((i14 & 16) != 0) {
            str4 = customizableMetricModel.shortName;
        }
        if ((i14 & 32) != 0) {
            str5 = customizableMetricModel.previewIcon;
        }
        String str6 = str4;
        String str7 = str5;
        return customizableMetricModel.copy(i13, str, str2, str3, str6, str7);
    }

    public static final /* synthetic */ void write$Self$home_customization_release(CustomizableMetricModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.index);
        output.encodeStringElement(serialDesc, 1, self.icon);
        output.encodeStringElement(serialDesc, 2, self.name);
        output.encodeStringElement(serialDesc, 3, self.metric);
        output.encodeStringElement(serialDesc, 4, self.shortName);
        output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.previewIcon);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMetric() {
        return this.metric;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getShortName() {
        return this.shortName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPreviewIcon() {
        return this.previewIcon;
    }

    public final CustomizableMetricModel copy(int index, String icon, String name, String metric, String shortName, String previewIcon) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(metric, "metric");
        AbstractC22676k.m65750j(shortName, "shortName");
        return new CustomizableMetricModel(index, icon, name, metric, shortName, previewIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomizableMetricModel)) {
            return false;
        }
        CustomizableMetricModel customizableMetricModel = (CustomizableMetricModel) other;
        return this.index == customizableMetricModel.index && AbstractC22676k.m65745e(this.icon, customizableMetricModel.icon) && AbstractC22676k.m65745e(this.name, customizableMetricModel.name) && AbstractC22676k.m65745e(this.metric, customizableMetricModel.metric) && AbstractC22676k.m65745e(this.shortName, customizableMetricModel.shortName) && AbstractC22676k.m65745e(this.previewIcon, customizableMetricModel.previewIcon);
    }

    public final String getIcon() {
        return this.icon;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getMetric() {
        return this.metric;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPreviewIcon() {
        return this.previewIcon;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(Integer.hashCode(this.index) * 31, 31, this.icon), 31, this.name), 31, this.metric), 31, this.shortName);
        String str = this.previewIcon;
        return iM30450d + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        int i13 = this.index;
        String str = this.icon;
        String str2 = this.name;
        String str3 = this.metric;
        String str4 = this.shortName;
        String str5 = this.previewIcon;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "CustomizableMetricModel(index=", ", icon=", str, ", name=");
        AbstractC11266d.m30444B(sbM53373n, str2, ", metric=", str3, ", shortName=");
        return AbstractC11266d.m30464r(sbM53373n, str4, ", previewIcon=", str5, ")");
    }

    public CustomizableMetricModel(int i13, String icon, String name, String metric, String shortName, String str) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(metric, "metric");
        AbstractC22676k.m65750j(shortName, "shortName");
        this.index = i13;
        this.icon = icon;
        this.name = name;
        this.metric = metric;
        this.shortName = shortName;
        this.previewIcon = str;
    }
}
