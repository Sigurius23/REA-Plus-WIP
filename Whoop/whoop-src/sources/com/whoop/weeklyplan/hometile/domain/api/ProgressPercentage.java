package com.whoop.weeklyplan.hometile.domain.api;

import a13.C0148f;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u0006/"}, m65681d2 = {"Lcom/whoop/weeklyplan/hometile/domain/api/ProgressPercentage;", "", "", "textDisplay", "", "percentage", "Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;", "style", "<init>", "(Ljava/lang/String;DLcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;DLcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/hometile/domain/api/ProgressPercentage;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()D", "component3", "()Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;", "copy", "(Ljava/lang/String;DLcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;)Lcom/whoop/weeklyplan/hometile/domain/api/ProgressPercentage;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTextDisplay", "D", "getPercentage", "Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;", "getStyle", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ProgressPercentage {
    public static final int $stable = 0;
    private final double percentage;
    private final TextDisplayStyle style;
    private final String textDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C0148f(19))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/hometile/domain/api/ProgressPercentage$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/hometile/domain/api/ProgressPercentage;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ProgressPercentage$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ProgressPercentage(int i13, String str, double d3, TextDisplayStyle textDisplayStyle, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, ProgressPercentage$$serializer.INSTANCE.getDescriptor());
        }
        this.textDisplay = str;
        this.percentage = d3;
        this.style = textDisplayStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.weeklyplan.hometile.domain.api.TextDisplayStyle", TextDisplayStyle.values());
    }

    public static /* synthetic */ ProgressPercentage copy$default(ProgressPercentage progressPercentage, String str, double d3, TextDisplayStyle textDisplayStyle, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = progressPercentage.textDisplay;
        }
        if ((i13 & 2) != 0) {
            d3 = progressPercentage.percentage;
        }
        if ((i13 & 4) != 0) {
            textDisplayStyle = progressPercentage.style;
        }
        return progressPercentage.copy(str, d3, textDisplayStyle);
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(ProgressPercentage self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.textDisplay);
        output.encodeDoubleElement(serialDesc, 1, self.percentage);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.style);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTextDisplay() {
        return this.textDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getPercentage() {
        return this.percentage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextDisplayStyle getStyle() {
        return this.style;
    }

    public final ProgressPercentage copy(String textDisplay, double percentage, TextDisplayStyle style) {
        AbstractC22676k.m65750j(textDisplay, "textDisplay");
        AbstractC22676k.m65750j(style, "style");
        return new ProgressPercentage(textDisplay, percentage, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressPercentage)) {
            return false;
        }
        ProgressPercentage progressPercentage = (ProgressPercentage) other;
        return AbstractC22676k.m65745e(this.textDisplay, progressPercentage.textDisplay) && Double.compare(this.percentage, progressPercentage.percentage) == 0 && this.style == progressPercentage.style;
    }

    public final double getPercentage() {
        return this.percentage;
    }

    public final TextDisplayStyle getStyle() {
        return this.style;
    }

    public final String getTextDisplay() {
        return this.textDisplay;
    }

    public int hashCode() {
        return this.style.hashCode() + AbstractC17176i.m48499a(this.textDisplay.hashCode() * 31, 31, this.percentage);
    }

    public String toString() {
        return "ProgressPercentage(textDisplay=" + this.textDisplay + ", percentage=" + this.percentage + ", style=" + this.style + ")";
    }

    public ProgressPercentage(String textDisplay, double d3, TextDisplayStyle style) {
        AbstractC22676k.m65750j(textDisplay, "textDisplay");
        AbstractC22676k.m65750j(style, "style");
        this.textDisplay = textDisplay;
        this.percentage = d3;
        this.style = style;
    }
}
