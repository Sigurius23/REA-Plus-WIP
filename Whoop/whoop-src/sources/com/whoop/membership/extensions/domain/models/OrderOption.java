package com.whoop.membership.extensions.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0018R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b*\u0010'\u001a\u0004\b)\u0010\u001aR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010$\u0012\u0004\b,\u0010'\u001a\u0004\b+\u0010\u0018¨\u0006/"}, m65681d2 = {"Lcom/whoop/membership/extensions/domain/models/OrderOption;", "", "", "label", "", "selected", "parameter", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$membership_release", "(Lcom/whoop/membership/extensions/domain/models/OrderOption;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "copy", "(Ljava/lang/String;ZLjava/lang/String;)Lcom/whoop/membership/extensions/domain/models/OrderOption;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLabel", "getLabel$annotations", "()V", "Z", "getSelected", "getSelected$annotations", "getParameter", "getParameter$annotations", "Companion", "$serializer", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class OrderOption {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("label")
    private final String label;

    @SerializedName("parameter")
    private final String parameter;

    @SerializedName("selected")
    private final boolean selected;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/membership/extensions/domain/models/OrderOption$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/membership/extensions/domain/models/OrderOption;", "serializer", "()Lwc3/c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return OrderOption$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ OrderOption(int i13, String str, boolean z4, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, OrderOption$$serializer.INSTANCE.getDescriptor());
        }
        this.label = str;
        this.selected = z4;
        this.parameter = str2;
    }

    public static /* synthetic */ OrderOption copy$default(OrderOption orderOption, String str, boolean z4, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = orderOption.label;
        }
        if ((i13 & 2) != 0) {
            z4 = orderOption.selected;
        }
        if ((i13 & 4) != 0) {
            str2 = orderOption.parameter;
        }
        return orderOption.copy(str, z4, str2);
    }

    @InterfaceC37143h("label")
    public static /* synthetic */ void getLabel$annotations() {
    }

    @InterfaceC37143h("parameter")
    public static /* synthetic */ void getParameter$annotations() {
    }

    @InterfaceC37143h("selected")
    public static /* synthetic */ void getSelected$annotations() {
    }

    public static final /* synthetic */ void write$Self$membership_release(OrderOption self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.label);
        output.encodeBooleanElement(serialDesc, 1, self.selected);
        output.encodeStringElement(serialDesc, 2, self.parameter);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getParameter() {
        return this.parameter;
    }

    public final OrderOption copy(String label, boolean selected, String parameter) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(parameter, "parameter");
        return new OrderOption(label, selected, parameter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderOption)) {
            return false;
        }
        OrderOption orderOption = (OrderOption) other;
        return AbstractC22676k.m65745e(this.label, orderOption.label) && this.selected == orderOption.selected && AbstractC22676k.m65745e(this.parameter, orderOption.parameter);
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getParameter() {
        return this.parameter;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public int hashCode() {
        return this.parameter.hashCode() + AbstractC2875y.m8289b(this.label.hashCode() * 31, 31, this.selected);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.parameter, ")", AbstractC25012a.m73379l("OrderOption(label=", this.label, ", selected=", ", parameter=", this.selected));
    }

    public OrderOption(String label, boolean z4, String parameter) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(parameter, "parameter");
        this.label = label;
        this.selected = z4;
        this.parameter = parameter;
    }
}
