package com.whoop.user.journey.model.yearinreview;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJB\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010 R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b1\u0010\u001b¨\u00064"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/DonutStatisticsItem;", "", "", "value", "statistic", "", "fillPercentage", "", "primary", "style", "<init>", "(Ljava/lang/String;Ljava/lang/String;FZLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;FZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$user_journey_release", "(Lcom/whoop/user/journey/model/yearinreview/DonutStatisticsItem;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()F", "component4", "()Z", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;FZLjava/lang/String;)Lcom/whoop/user/journey/model/yearinreview/DonutStatisticsItem;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "getStatistic", "F", "getFillPercentage", "Z", "getPrimary", "getStyle", "Companion", "$serializer", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DonutStatisticsItem {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final float fillPercentage;
    private final boolean primary;
    private final String statistic;
    private final String style;
    private final String value;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/DonutStatisticsItem$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/user/journey/model/yearinreview/DonutStatisticsItem;", "serializer", "()Lwc3/c;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DonutStatisticsItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DonutStatisticsItem(int i13, String str, String str2, float f13, boolean z4, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, DonutStatisticsItem$$serializer.INSTANCE.getDescriptor());
        }
        this.value = str;
        this.statistic = str2;
        this.fillPercentage = f13;
        this.primary = z4;
        this.style = str3;
    }

    public static /* synthetic */ DonutStatisticsItem copy$default(DonutStatisticsItem donutStatisticsItem, String str, String str2, float f13, boolean z4, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = donutStatisticsItem.value;
        }
        if ((i13 & 2) != 0) {
            str2 = donutStatisticsItem.statistic;
        }
        if ((i13 & 4) != 0) {
            f13 = donutStatisticsItem.fillPercentage;
        }
        if ((i13 & 8) != 0) {
            z4 = donutStatisticsItem.primary;
        }
        if ((i13 & 16) != 0) {
            str3 = donutStatisticsItem.style;
        }
        String str4 = str3;
        float f14 = f13;
        return donutStatisticsItem.copy(str, str2, f14, z4, str4);
    }

    public static final /* synthetic */ void write$Self$user_journey_release(DonutStatisticsItem self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.value);
        output.encodeStringElement(serialDesc, 1, self.statistic);
        output.encodeFloatElement(serialDesc, 2, self.fillPercentage);
        output.encodeBooleanElement(serialDesc, 3, self.primary);
        output.encodeStringElement(serialDesc, 4, self.style);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatistic() {
        return this.statistic;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getFillPercentage() {
        return this.fillPercentage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getPrimary() {
        return this.primary;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    public final DonutStatisticsItem copy(String value, String statistic, float fillPercentage, boolean primary, String style) {
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(statistic, "statistic");
        AbstractC22676k.m65750j(style, "style");
        return new DonutStatisticsItem(value, statistic, fillPercentage, primary, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DonutStatisticsItem)) {
            return false;
        }
        DonutStatisticsItem donutStatisticsItem = (DonutStatisticsItem) other;
        return AbstractC22676k.m65745e(this.value, donutStatisticsItem.value) && AbstractC22676k.m65745e(this.statistic, donutStatisticsItem.statistic) && Float.compare(this.fillPercentage, donutStatisticsItem.fillPercentage) == 0 && this.primary == donutStatisticsItem.primary && AbstractC22676k.m65745e(this.style, donutStatisticsItem.style);
    }

    public final float getFillPercentage() {
        return this.fillPercentage;
    }

    public final boolean getPrimary() {
        return this.primary;
    }

    public final String getStatistic() {
        return this.statistic;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.style.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30447a(this.fillPercentage, AbstractC11266d.m30450d(this.value.hashCode() * 31, 31, this.statistic), 31), 31, this.primary);
    }

    public String toString() {
        String str = this.value;
        String str2 = this.statistic;
        float f13 = this.fillPercentage;
        boolean z4 = this.primary;
        String str3 = this.style;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DonutStatisticsItem(value=", str, ", statistic=", str2, ", fillPercentage=");
        sbM32001t.append(f13);
        sbM32001t.append(", primary=");
        sbM32001t.append(z4);
        sbM32001t.append(", style=");
        return AbstractC25012a.m73376i(str3, ")", sbM32001t);
    }

    public DonutStatisticsItem(String value, String statistic, float f13, boolean z4, String style) {
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(statistic, "statistic");
        AbstractC22676k.m65750j(style, "style");
        this.value = value;
        this.statistic = statistic;
        this.fillPercentage = f13;
        this.primary = z4;
        this.style = style;
    }
}
