package com.whoop.widget.model;

import androidx.annotation.Keep;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import d13.AbstractC11478a;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBK\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"JF\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001bJ\u0010\u0010&\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u001eR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00102\u0012\u0004\b4\u00101\u001a\u0004\b3\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010\"¨\u0006:"}, m65681d2 = {"Lcom/whoop/widget/model/WidgetSingle;", "", "", "icon", "text", "", "percentage", "targetPercentage", "", "calibrating", "<init>", "(Ljava/lang/String;Ljava/lang/String;FLjava/lang/Float;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;FLjava/lang/Float;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$widget_release", "(Lcom/whoop/widget/model/WidgetSingle;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()F", "component4", "()Ljava/lang/Float;", "component5", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;FLjava/lang/Float;Ljava/lang/Boolean;)Lcom/whoop/widget/model/WidgetSingle;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "getText", "F", "getPercentage", "getPercentage$annotations", "()V", "Ljava/lang/Float;", "getTargetPercentage", "getTargetPercentage$annotations", "Ljava/lang/Boolean;", "getCalibrating", "Companion", "$serializer", "a", "widget_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WidgetSingle {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Boolean calibrating;
    private final String icon;
    private final float percentage;
    private final Float targetPercentage;
    private final String text;

    /* JADX INFO: renamed from: com.whoop.widget.model.WidgetSingle$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/widget/model/WidgetSingle$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/widget/model/WidgetSingle;", "serializer", "()Lwc3/c;", "widget_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WidgetSingle$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WidgetSingle(int i13, String str, String str2, float f13, Float f14, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, WidgetSingle$$serializer.INSTANCE.getDescriptor());
        }
        this.icon = str;
        this.text = str2;
        this.percentage = f13;
        this.targetPercentage = f14;
        this.calibrating = bool;
    }

    public static /* synthetic */ WidgetSingle copy$default(WidgetSingle widgetSingle, String str, String str2, float f13, Float f14, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = widgetSingle.icon;
        }
        if ((i13 & 2) != 0) {
            str2 = widgetSingle.text;
        }
        if ((i13 & 4) != 0) {
            f13 = widgetSingle.percentage;
        }
        if ((i13 & 8) != 0) {
            f14 = widgetSingle.targetPercentage;
        }
        if ((i13 & 16) != 0) {
            bool = widgetSingle.calibrating;
        }
        Boolean bool2 = bool;
        float f15 = f13;
        return widgetSingle.copy(str, str2, f15, f14, bool2);
    }

    @InterfaceC37143h("percentage_around")
    public static /* synthetic */ void getPercentage$annotations() {
    }

    @InterfaceC37143h("target_percentage_around")
    public static /* synthetic */ void getTargetPercentage$annotations() {
    }

    public static final /* synthetic */ void write$Self$widget_release(WidgetSingle self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.icon);
        output.encodeStringElement(serialDesc, 1, self.text);
        output.encodeFloatElement(serialDesc, 2, self.percentage);
        output.encodeNullableSerializableElement(serialDesc, 3, FloatSerializer.INSTANCE, self.targetPercentage);
        output.encodeNullableSerializableElement(serialDesc, 4, BooleanSerializer.INSTANCE, self.calibrating);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getPercentage() {
        return this.percentage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Float getTargetPercentage() {
        return this.targetPercentage;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getCalibrating() {
        return this.calibrating;
    }

    public final WidgetSingle copy(String icon, String text, float percentage, Float targetPercentage, Boolean calibrating) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(text, "text");
        return new WidgetSingle(icon, text, percentage, targetPercentage, calibrating);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetSingle)) {
            return false;
        }
        WidgetSingle widgetSingle = (WidgetSingle) other;
        return AbstractC22676k.m65745e(this.icon, widgetSingle.icon) && AbstractC22676k.m65745e(this.text, widgetSingle.text) && Float.compare(this.percentage, widgetSingle.percentage) == 0 && AbstractC22676k.m65745e(this.targetPercentage, widgetSingle.targetPercentage) && AbstractC22676k.m65745e(this.calibrating, widgetSingle.calibrating);
    }

    public final Boolean getCalibrating() {
        return this.calibrating;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final float getPercentage() {
        return this.percentage;
    }

    public final Float getTargetPercentage() {
        return this.targetPercentage;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iM30447a = AbstractC11266d.m30447a(this.percentage, AbstractC11266d.m30450d(this.icon.hashCode() * 31, 31, this.text), 31);
        Float f13 = this.targetPercentage;
        int iHashCode = (iM30447a + (f13 == null ? 0 : f13.hashCode())) * 31;
        Boolean bool = this.calibrating;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.icon;
        String str2 = this.text;
        float f13 = this.percentage;
        Float f14 = this.targetPercentage;
        Boolean bool = this.calibrating;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("WidgetSingle(icon=", str, ", text=", str2, ", percentage=");
        sbM32001t.append(f13);
        sbM32001t.append(", targetPercentage=");
        sbM32001t.append(f14);
        sbM32001t.append(", calibrating=");
        return AbstractC11478a.m30858j(sbM32001t, bool, ")");
    }

    public WidgetSingle(String icon, String text, float f13, Float f14, Boolean bool) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(text, "text");
        this.icon = icon;
        this.text = text;
        this.percentage = f13;
        this.targetPercentage = f14;
        this.calibrating = bool;
    }
}
