package com.whoop.homecustomization.domain.legacy.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJB\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u001f¨\u00061"}, m65681d2 = {"Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;", "", "", "supportedTrendKey", "icon", "name", "shortName", "", "toggledOn", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$home_customization_release", "(Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSupportedTrendKey", "getIcon", "getName", "getShortName", "Z", "getToggledOn", "Companion", "$serializer", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CustomizeableKeyStatModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("icon")
    private final String icon;

    @SerializedName("name")
    private final String name;

    @SerializedName("short_name")
    private final String shortName;

    @SerializedName("supported_trend_key")
    private final String supportedTrendKey;

    @SerializedName("toggled_on")
    private final boolean toggledOn;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;", "serializer", "()Lwc3/c;", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CustomizeableKeyStatModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public CustomizeableKeyStatModel() {
        this((String) null, (String) null, (String) null, (String) null, false, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CustomizeableKeyStatModel copy$default(CustomizeableKeyStatModel customizeableKeyStatModel, String str, String str2, String str3, String str4, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = customizeableKeyStatModel.supportedTrendKey;
        }
        if ((i13 & 2) != 0) {
            str2 = customizeableKeyStatModel.icon;
        }
        if ((i13 & 4) != 0) {
            str3 = customizeableKeyStatModel.name;
        }
        if ((i13 & 8) != 0) {
            str4 = customizeableKeyStatModel.shortName;
        }
        if ((i13 & 16) != 0) {
            z4 = customizeableKeyStatModel.toggledOn;
        }
        boolean z13 = z4;
        String str5 = str3;
        return customizeableKeyStatModel.copy(str, str2, str5, str4, z13);
    }

    public static final /* synthetic */ void write$Self$home_customization_release(CustomizeableKeyStatModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.supportedTrendKey, "")) {
            output.encodeStringElement(serialDesc, 0, self.supportedTrendKey);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.icon, "")) {
            output.encodeStringElement(serialDesc, 1, self.icon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.name, "")) {
            output.encodeStringElement(serialDesc, 2, self.name);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.shortName, "")) {
            output.encodeStringElement(serialDesc, 3, self.shortName);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.toggledOn) {
            output.encodeBooleanElement(serialDesc, 4, self.toggledOn);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSupportedTrendKey() {
        return this.supportedTrendKey;
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
    public final String getShortName() {
        return this.shortName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getToggledOn() {
        return this.toggledOn;
    }

    public final CustomizeableKeyStatModel copy(String supportedTrendKey, String icon, String name, String shortName, boolean toggledOn) {
        AbstractC22676k.m65750j(supportedTrendKey, "supportedTrendKey");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(shortName, "shortName");
        return new CustomizeableKeyStatModel(supportedTrendKey, icon, name, shortName, toggledOn);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomizeableKeyStatModel)) {
            return false;
        }
        CustomizeableKeyStatModel customizeableKeyStatModel = (CustomizeableKeyStatModel) other;
        return AbstractC22676k.m65745e(this.supportedTrendKey, customizeableKeyStatModel.supportedTrendKey) && AbstractC22676k.m65745e(this.icon, customizeableKeyStatModel.icon) && AbstractC22676k.m65745e(this.name, customizeableKeyStatModel.name) && AbstractC22676k.m65745e(this.shortName, customizeableKeyStatModel.shortName) && this.toggledOn == customizeableKeyStatModel.toggledOn;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getName() {
        return this.name;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public final String getSupportedTrendKey() {
        return this.supportedTrendKey;
    }

    public final boolean getToggledOn() {
        return this.toggledOn;
    }

    public int hashCode() {
        return Boolean.hashCode(this.toggledOn) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.supportedTrendKey.hashCode() * 31, 31, this.icon), 31, this.name), 31, this.shortName);
    }

    public String toString() {
        String str = this.supportedTrendKey;
        String str2 = this.icon;
        String str3 = this.name;
        String str4 = this.shortName;
        boolean z4 = this.toggledOn;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CustomizeableKeyStatModel(supportedTrendKey=", str, ", icon=", str2, ", name=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", shortName=", str4, ", toggledOn=");
        return AbstractC18489d0.m53372m(sbM32001t, z4, ")");
    }

    public /* synthetic */ CustomizeableKeyStatModel(int i13, String str, String str2, String str3, String str4, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.supportedTrendKey = "";
        } else {
            this.supportedTrendKey = str;
        }
        if ((i13 & 2) == 0) {
            this.icon = "";
        } else {
            this.icon = str2;
        }
        if ((i13 & 4) == 0) {
            this.name = "";
        } else {
            this.name = str3;
        }
        if ((i13 & 8) == 0) {
            this.shortName = "";
        } else {
            this.shortName = str4;
        }
        if ((i13 & 16) == 0) {
            this.toggledOn = false;
        } else {
            this.toggledOn = z4;
        }
    }

    public CustomizeableKeyStatModel(String supportedTrendKey, String icon, String name, String shortName, boolean z4) {
        AbstractC22676k.m65750j(supportedTrendKey, "supportedTrendKey");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(shortName, "shortName");
        this.supportedTrendKey = supportedTrendKey;
        this.icon = icon;
        this.name = name;
        this.shortName = shortName;
        this.toggledOn = z4;
    }

    public /* synthetic */ CustomizeableKeyStatModel(String str, String str2, String str3, String str4, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "" : str4, (i13 & 16) != 0 ? false : z4);
    }
}
