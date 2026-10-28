package com.whoop.health.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lz0.EnumC24819d;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import sh2.C32513d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001b¨\u0006,"}, m65681d2 = {"Lcom/whoop/health/domain/models/ProgressPlotDescription;", "", "", "title", "metricTitle", "Llz0/d;", "style", "<init>", "(Ljava/lang/String;Ljava/lang/String;Llz0/d;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Llz0/d;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$health_release", "(Lcom/whoop/health/domain/models/ProgressPlotDescription;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Llz0/d;", "copy", "(Ljava/lang/String;Ljava/lang/String;Llz0/d;)Lcom/whoop/health/domain/models/ProgressPlotDescription;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getMetricTitle", "Llz0/d;", "getStyle", "Companion", "$serializer", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ProgressPlotDescription {
    public static final int $stable = 0;
    private final String metricTitle;
    private final EnumC24819d style;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C32513d(13))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/health/domain/models/ProgressPlotDescription$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/health/domain/models/ProgressPlotDescription;", "serializer", "()Lwc3/c;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ProgressPlotDescription$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ProgressPlotDescription(int i13, String str, String str2, EnumC24819d enumC24819d, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, ProgressPlotDescription$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.metricTitle = str2;
        this.style = enumC24819d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.progressbar.PregnancyProgressPlotStyle", EnumC24819d.values());
    }

    public static /* synthetic */ ProgressPlotDescription copy$default(ProgressPlotDescription progressPlotDescription, String str, String str2, EnumC24819d enumC24819d, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = progressPlotDescription.title;
        }
        if ((i13 & 2) != 0) {
            str2 = progressPlotDescription.metricTitle;
        }
        if ((i13 & 4) != 0) {
            enumC24819d = progressPlotDescription.style;
        }
        return progressPlotDescription.copy(str, str2, enumC24819d);
    }

    public static final /* synthetic */ void write$Self$health_release(ProgressPlotDescription self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.metricTitle);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.style);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMetricTitle() {
        return this.metricTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EnumC24819d getStyle() {
        return this.style;
    }

    public final ProgressPlotDescription copy(String title, String metricTitle, EnumC24819d style) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(metricTitle, "metricTitle");
        AbstractC22676k.m65750j(style, "style");
        return new ProgressPlotDescription(title, metricTitle, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressPlotDescription)) {
            return false;
        }
        ProgressPlotDescription progressPlotDescription = (ProgressPlotDescription) other;
        return AbstractC22676k.m65745e(this.title, progressPlotDescription.title) && AbstractC22676k.m65745e(this.metricTitle, progressPlotDescription.metricTitle) && this.style == progressPlotDescription.style;
    }

    public final String getMetricTitle() {
        return this.metricTitle;
    }

    public final EnumC24819d getStyle() {
        return this.style;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.style.hashCode() + AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.metricTitle);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.metricTitle;
        EnumC24819d enumC24819d = this.style;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ProgressPlotDescription(title=", str, ", metricTitle=", str2, ", style=");
        sbM32001t.append(enumC24819d);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public ProgressPlotDescription(String title, String metricTitle, EnumC24819d style) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(metricTitle, "metricTitle");
        AbstractC22676k.m65750j(style, "style");
        this.title = title;
        this.metricTitle = metricTitle;
        this.style = style;
    }
}
