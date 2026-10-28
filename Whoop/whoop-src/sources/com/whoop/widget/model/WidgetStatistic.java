package com.whoop.widget.model;

import androidx.annotation.Keep;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import d13.AbstractC11478a;
import fw0.C14833a;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ0\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b\u0007\u0010\u001d¨\u00060"}, m65681d2 = {"Lcom/whoop/widget/model/WidgetStatistic;", "", "Lcom/whoop/widget/model/WidgetType;", "type", "", "text", "", "isCalibrating", "<init>", "(Lcom/whoop/widget/model/WidgetType;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/widget/model/WidgetType;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$widget_release", "(Lcom/whoop/widget/model/WidgetStatistic;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/widget/model/WidgetType;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Boolean;", "copy", "(Lcom/whoop/widget/model/WidgetType;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/whoop/widget/model/WidgetStatistic;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/widget/model/WidgetType;", "getType", "getType$annotations", "()V", "Ljava/lang/String;", "getText", "Ljava/lang/Boolean;", "Companion", "$serializer", "a", "widget_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WidgetStatistic {
    public static final int $stable = 0;
    private final Boolean isCalibrating;
    private final String text;
    private final WidgetType type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C14833a(12)), null, null};

    /* JADX INFO: renamed from: com.whoop.widget.model.WidgetStatistic$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/widget/model/WidgetStatistic$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/widget/model/WidgetStatistic;", "serializer", "()Lwc3/c;", "widget_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WidgetStatistic$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WidgetStatistic(int i13, WidgetType widgetType, String str, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (6 != (i13 & 6)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 6, WidgetStatistic$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.type = WidgetType.SLEEP;
        } else {
            this.type = widgetType;
        }
        this.text = str;
        this.isCalibrating = bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return WidgetType.INSTANCE.serializer();
    }

    public static /* synthetic */ WidgetStatistic copy$default(WidgetStatistic widgetStatistic, WidgetType widgetType, String str, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            widgetType = widgetStatistic.type;
        }
        if ((i13 & 2) != 0) {
            str = widgetStatistic.text;
        }
        if ((i13 & 4) != 0) {
            bool = widgetStatistic.isCalibrating;
        }
        return widgetStatistic.copy(widgetType, str, bool);
    }

    @InterfaceC37143h("icon")
    public static /* synthetic */ void getType$annotations() {
    }

    public static final /* synthetic */ void write$Self$widget_release(WidgetStatistic self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.type != WidgetType.SLEEP) {
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.type);
        }
        output.encodeStringElement(serialDesc, 1, self.text);
        output.encodeNullableSerializableElement(serialDesc, 2, BooleanSerializer.INSTANCE, self.isCalibrating);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WidgetType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getIsCalibrating() {
        return this.isCalibrating;
    }

    public final WidgetStatistic copy(WidgetType type, String text, Boolean isCalibrating) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(text, "text");
        return new WidgetStatistic(type, text, isCalibrating);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetStatistic)) {
            return false;
        }
        WidgetStatistic widgetStatistic = (WidgetStatistic) other;
        return this.type == widgetStatistic.type && AbstractC22676k.m65745e(this.text, widgetStatistic.text) && AbstractC22676k.m65745e(this.isCalibrating, widgetStatistic.isCalibrating);
    }

    public final String getText() {
        return this.text;
    }

    public final WidgetType getType() {
        return this.type;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.type.hashCode() * 31, 31, this.text);
        Boolean bool = this.isCalibrating;
        return iM30450d + (bool == null ? 0 : bool.hashCode());
    }

    public final Boolean isCalibrating() {
        return this.isCalibrating;
    }

    public String toString() {
        WidgetType widgetType = this.type;
        String str = this.text;
        Boolean bool = this.isCalibrating;
        StringBuilder sb4 = new StringBuilder("WidgetStatistic(type=");
        sb4.append(widgetType);
        sb4.append(", text=");
        sb4.append(str);
        sb4.append(", isCalibrating=");
        return AbstractC11478a.m30858j(sb4, bool, ")");
    }

    public WidgetStatistic(WidgetType type, String text, Boolean bool) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(text, "text");
        this.type = type;
        this.text = text;
        this.isCalibrating = bool;
    }

    public /* synthetic */ WidgetStatistic(WidgetType widgetType, String str, Boolean bool, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? WidgetType.SLEEP : widgetType, str, bool);
    }
}
