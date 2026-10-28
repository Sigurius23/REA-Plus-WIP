package com.whoop.health.domain.models;

import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hy0.EnumC17727b2;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import sh2.C32513d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBA\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!J:\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010!J\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010!¨\u00064"}, m65681d2 = {"Lcom/whoop/health/domain/models/ImageVisualizationTrend;", "", "Lcom/whoop/design/util/TextResource;", "titleDisplay", "", "backgroundEnabled", "Lhy0/b2;", "trend", "", "icon", "<init>", "(Lcom/whoop/design/util/TextResource;ZLhy0/b2;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;ZLhy0/b2;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$health_release", "(Lcom/whoop/health/domain/models/ImageVisualizationTrend;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "()Z", "component3", "()Lhy0/b2;", "component4", "()Ljava/lang/String;", "copy", "(Lcom/whoop/design/util/TextResource;ZLhy0/b2;Ljava/lang/String;)Lcom/whoop/health/domain/models/ImageVisualizationTrend;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getTitleDisplay", "Z", "getBackgroundEnabled", "Lhy0/b2;", "getTrend", "Ljava/lang/String;", "getIcon", "Companion", "$serializer", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ImageVisualizationTrend {
    private final boolean backgroundEnabled;
    private final String icon;
    private final TextResource titleDisplay;
    private final EnumC17727b2 trend;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C32513d(10)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/health/domain/models/ImageVisualizationTrend$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/health/domain/models/ImageVisualizationTrend;", "serializer", "()Lwc3/c;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ImageVisualizationTrend$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ImageVisualizationTrend(int i13, TextResource textResource, boolean z4, EnumC17727b2 enumC17727b2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, ImageVisualizationTrend$$serializer.INSTANCE.getDescriptor());
        }
        this.titleDisplay = textResource;
        this.backgroundEnabled = z4;
        this.trend = enumC17727b2;
        this.icon = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.TrendTypeState", EnumC17727b2.values());
    }

    public static /* synthetic */ ImageVisualizationTrend copy$default(ImageVisualizationTrend imageVisualizationTrend, TextResource textResource, boolean z4, EnumC17727b2 enumC17727b2, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = imageVisualizationTrend.titleDisplay;
        }
        if ((i13 & 2) != 0) {
            z4 = imageVisualizationTrend.backgroundEnabled;
        }
        if ((i13 & 4) != 0) {
            enumC17727b2 = imageVisualizationTrend.trend;
        }
        if ((i13 & 8) != 0) {
            str = imageVisualizationTrend.icon;
        }
        return imageVisualizationTrend.copy(textResource, z4, enumC17727b2, str);
    }

    public static final /* synthetic */ void write$Self$health_release(ImageVisualizationTrend self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, C25452a.f99689a, self.titleDisplay);
        output.encodeBooleanElement(serialDesc, 1, self.backgroundEnabled);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.trend);
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.icon);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getBackgroundEnabled() {
        return this.backgroundEnabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EnumC17727b2 getTrend() {
        return this.trend;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    public final ImageVisualizationTrend copy(TextResource titleDisplay, boolean backgroundEnabled, EnumC17727b2 trend, String icon) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(trend, "trend");
        return new ImageVisualizationTrend(titleDisplay, backgroundEnabled, trend, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageVisualizationTrend)) {
            return false;
        }
        ImageVisualizationTrend imageVisualizationTrend = (ImageVisualizationTrend) other;
        return AbstractC22676k.m65745e(this.titleDisplay, imageVisualizationTrend.titleDisplay) && this.backgroundEnabled == imageVisualizationTrend.backgroundEnabled && this.trend == imageVisualizationTrend.trend && AbstractC22676k.m65745e(this.icon, imageVisualizationTrend.icon);
    }

    public final boolean getBackgroundEnabled() {
        return this.backgroundEnabled;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final TextResource getTitleDisplay() {
        return this.titleDisplay;
    }

    public final EnumC17727b2 getTrend() {
        return this.trend;
    }

    public int hashCode() {
        int iHashCode = (this.trend.hashCode() + AbstractC2875y.m8289b(this.titleDisplay.hashCode() * 31, 31, this.backgroundEnabled)) * 31;
        String str = this.icon;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        TextResource textResource = this.titleDisplay;
        boolean z4 = this.backgroundEnabled;
        EnumC17727b2 enumC17727b2 = this.trend;
        String str = this.icon;
        StringBuilder sbM91846p = AbstractC30007c.m91846p("ImageVisualizationTrend(titleDisplay=", textResource, ", backgroundEnabled=", z4, ", trend=");
        sbM91846p.append(enumC17727b2);
        sbM91846p.append(", icon=");
        sbM91846p.append(str);
        sbM91846p.append(")");
        return sbM91846p.toString();
    }

    public ImageVisualizationTrend(TextResource titleDisplay, boolean z4, EnumC17727b2 trend, String str) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(trend, "trend");
        this.titleDisplay = titleDisplay;
        this.backgroundEnabled = z4;
        this.trend = trend;
        this.icon = str;
    }
}
