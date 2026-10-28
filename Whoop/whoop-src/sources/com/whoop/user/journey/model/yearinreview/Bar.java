package com.whoop.user.journey.model.yearinreview;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fBo\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b'\u0010&J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001fJp\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u00020\u00072\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b5\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b6\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010&R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b;\u0010&R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b<\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b=\u0010\u001f¨\u0006@"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/Bar;", "", "", "title", "metric", "subMetric", "iconUrl", "", "primary", "", "fillPercentage", "opacity", "barType", "alignment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZFFLjava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZFFLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$user_journey_release", "(Lcom/whoop/user/journey/model/yearinreview/Bar;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Z", "component6", "()F", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZFFLjava/lang/String;Ljava/lang/String;)Lcom/whoop/user/journey/model/yearinreview/Bar;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getMetric", "getSubMetric", "getIconUrl", "Z", "getPrimary", "F", "getFillPercentage", "getOpacity", "getBarType", "getAlignment", "Companion", "$serializer", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class Bar {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String alignment;
    private final String barType;
    private final float fillPercentage;
    private final String iconUrl;
    private final String metric;
    private final float opacity;
    private final boolean primary;
    private final String subMetric;
    private final String title;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/Bar$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/user/journey/model/yearinreview/Bar;", "serializer", "()Lwc3/c;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return Bar$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Bar(int i13, String str, String str2, String str3, String str4, boolean z4, float f13, float f14, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, Bar$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.metric = str2;
        this.subMetric = str3;
        this.iconUrl = str4;
        this.primary = z4;
        this.fillPercentage = f13;
        this.opacity = f14;
        this.barType = str5;
        if ((i13 & 256) == 0) {
            this.alignment = null;
        } else {
            this.alignment = str6;
        }
    }

    public static /* synthetic */ Bar copy$default(Bar bar, String str, String str2, String str3, String str4, boolean z4, float f13, float f14, String str5, String str6, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = bar.title;
        }
        if ((i13 & 2) != 0) {
            str2 = bar.metric;
        }
        if ((i13 & 4) != 0) {
            str3 = bar.subMetric;
        }
        if ((i13 & 8) != 0) {
            str4 = bar.iconUrl;
        }
        if ((i13 & 16) != 0) {
            z4 = bar.primary;
        }
        if ((i13 & 32) != 0) {
            f13 = bar.fillPercentage;
        }
        if ((i13 & 64) != 0) {
            f14 = bar.opacity;
        }
        if ((i13 & 128) != 0) {
            str5 = bar.barType;
        }
        if ((i13 & 256) != 0) {
            str6 = bar.alignment;
        }
        String str7 = str5;
        String str8 = str6;
        float f15 = f13;
        float f16 = f14;
        boolean z13 = z4;
        String str9 = str3;
        return bar.copy(str, str2, str9, str4, z13, f15, f16, str7, str8);
    }

    public static final /* synthetic */ void write$Self$user_journey_release(Bar self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.metric);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.subMetric);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.iconUrl);
        output.encodeBooleanElement(serialDesc, 4, self.primary);
        output.encodeFloatElement(serialDesc, 5, self.fillPercentage);
        output.encodeFloatElement(serialDesc, 6, self.opacity);
        output.encodeStringElement(serialDesc, 7, self.barType);
        if (!output.shouldEncodeElementDefault(serialDesc, 8) && self.alignment == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 8, stringSerializer, self.alignment);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMetric() {
        return this.metric;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubMetric() {
        return this.subMetric;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getPrimary() {
        return this.primary;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getFillPercentage() {
        return this.fillPercentage;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final float getOpacity() {
        return this.opacity;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBarType() {
        return this.barType;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAlignment() {
        return this.alignment;
    }

    public final Bar copy(String title, String metric, String subMetric, String iconUrl, boolean primary, float fillPercentage, float opacity, String barType, String alignment) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(metric, "metric");
        AbstractC22676k.m65750j(barType, "barType");
        return new Bar(title, metric, subMetric, iconUrl, primary, fillPercentage, opacity, barType, alignment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Bar)) {
            return false;
        }
        Bar bar = (Bar) other;
        return AbstractC22676k.m65745e(this.title, bar.title) && AbstractC22676k.m65745e(this.metric, bar.metric) && AbstractC22676k.m65745e(this.subMetric, bar.subMetric) && AbstractC22676k.m65745e(this.iconUrl, bar.iconUrl) && this.primary == bar.primary && Float.compare(this.fillPercentage, bar.fillPercentage) == 0 && Float.compare(this.opacity, bar.opacity) == 0 && AbstractC22676k.m65745e(this.barType, bar.barType) && AbstractC22676k.m65745e(this.alignment, bar.alignment);
    }

    public final String getAlignment() {
        return this.alignment;
    }

    public final String getBarType() {
        return this.barType;
    }

    public final float getFillPercentage() {
        return this.fillPercentage;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getMetric() {
        return this.metric;
    }

    public final float getOpacity() {
        return this.opacity;
    }

    public final boolean getPrimary() {
        return this.primary;
    }

    public final String getSubMetric() {
        return this.subMetric;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.metric);
        String str = this.subMetric;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconUrl;
        int iM30450d2 = AbstractC11266d.m30450d(AbstractC11266d.m30447a(this.opacity, AbstractC11266d.m30447a(this.fillPercentage, AbstractC2875y.m8289b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.primary), 31), 31), 31, this.barType);
        String str3 = this.alignment;
        return iM30450d2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.metric;
        String str3 = this.subMetric;
        String str4 = this.iconUrl;
        boolean z4 = this.primary;
        float f13 = this.fillPercentage;
        float f14 = this.opacity;
        String str5 = this.barType;
        String str6 = this.alignment;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Bar(title=", str, ", metric=", str2, ", subMetric=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", iconUrl=", str4, ", primary=");
        sbM32001t.append(z4);
        sbM32001t.append(", fillPercentage=");
        sbM32001t.append(f13);
        sbM32001t.append(", opacity=");
        sbM32001t.append(f14);
        sbM32001t.append(", barType=");
        sbM32001t.append(str5);
        sbM32001t.append(", alignment=");
        return AbstractC25012a.m73376i(str6, ")", sbM32001t);
    }

    public Bar(String title, String metric, String str, String str2, boolean z4, float f13, float f14, String barType, String str3) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(metric, "metric");
        AbstractC22676k.m65750j(barType, "barType");
        this.title = title;
        this.metric = metric;
        this.subMetric = str;
        this.iconUrl = str2;
        this.primary = z4;
        this.fillPercentage = f13;
        this.opacity = f14;
        this.barType = barType;
        this.alignment = str3;
    }

    public /* synthetic */ Bar(String str, String str2, String str3, String str4, boolean z4, float f13, float f14, String str5, String str6, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, z4, f13, f14, str5, (i13 & 256) != 0 ? null : str6);
    }
}
