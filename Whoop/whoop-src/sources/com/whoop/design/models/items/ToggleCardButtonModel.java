package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JD\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b-\u0010\u0019¨\u00060"}, m65681d2 = {"Lcom/whoop/design/models/items/ToggleCardButtonModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "collapsedTitle", "expandedTitle", "collapsedIcon", "expandedIcon", "style", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ToggleCardButtonModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/items/ToggleCardButtonModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCollapsedTitle", "getExpandedTitle", "getCollapsedIcon", "getExpandedIcon", "getStyle", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ToggleCardButtonModel implements DesignSystemModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String collapsedIcon;
    private final String collapsedTitle;
    private final String expandedIcon;
    private final String expandedTitle;
    private final String style;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ToggleCardButtonModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ToggleCardButtonModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ToggleCardButtonModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ToggleCardButtonModel(int i13, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, ToggleCardButtonModel$$serializer.INSTANCE.getDescriptor());
        }
        this.collapsedTitle = str;
        this.expandedTitle = str2;
        this.collapsedIcon = str3;
        this.expandedIcon = str4;
        this.style = str5;
    }

    public static /* synthetic */ ToggleCardButtonModel copy$default(ToggleCardButtonModel toggleCardButtonModel, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = toggleCardButtonModel.collapsedTitle;
        }
        if ((i13 & 2) != 0) {
            str2 = toggleCardButtonModel.expandedTitle;
        }
        if ((i13 & 4) != 0) {
            str3 = toggleCardButtonModel.collapsedIcon;
        }
        if ((i13 & 8) != 0) {
            str4 = toggleCardButtonModel.expandedIcon;
        }
        if ((i13 & 16) != 0) {
            str5 = toggleCardButtonModel.style;
        }
        String str6 = str5;
        String str7 = str3;
        return toggleCardButtonModel.copy(str, str2, str7, str4, str6);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ToggleCardButtonModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.collapsedTitle);
        output.encodeStringElement(serialDesc, 1, self.expandedTitle);
        output.encodeStringElement(serialDesc, 2, self.collapsedIcon);
        output.encodeStringElement(serialDesc, 3, self.expandedIcon);
        output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.style);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCollapsedTitle() {
        return this.collapsedTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getExpandedTitle() {
        return this.expandedTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCollapsedIcon() {
        return this.collapsedIcon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getExpandedIcon() {
        return this.expandedIcon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    public final ToggleCardButtonModel copy(String collapsedTitle, String expandedTitle, String collapsedIcon, String expandedIcon, String style) {
        AbstractC22676k.m65750j(collapsedTitle, "collapsedTitle");
        AbstractC22676k.m65750j(expandedTitle, "expandedTitle");
        AbstractC22676k.m65750j(collapsedIcon, "collapsedIcon");
        AbstractC22676k.m65750j(expandedIcon, "expandedIcon");
        return new ToggleCardButtonModel(collapsedTitle, expandedTitle, collapsedIcon, expandedIcon, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToggleCardButtonModel)) {
            return false;
        }
        ToggleCardButtonModel toggleCardButtonModel = (ToggleCardButtonModel) other;
        return AbstractC22676k.m65745e(this.collapsedTitle, toggleCardButtonModel.collapsedTitle) && AbstractC22676k.m65745e(this.expandedTitle, toggleCardButtonModel.expandedTitle) && AbstractC22676k.m65745e(this.collapsedIcon, toggleCardButtonModel.collapsedIcon) && AbstractC22676k.m65745e(this.expandedIcon, toggleCardButtonModel.expandedIcon) && AbstractC22676k.m65745e(this.style, toggleCardButtonModel.style);
    }

    public final String getCollapsedIcon() {
        return this.collapsedIcon;
    }

    public final String getCollapsedTitle() {
        return this.collapsedTitle;
    }

    public final String getExpandedIcon() {
        return this.expandedIcon;
    }

    public final String getExpandedTitle() {
        return this.expandedTitle;
    }

    public final String getStyle() {
        return this.style;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.collapsedTitle.hashCode() * 31, 31, this.expandedTitle), 31, this.collapsedIcon), 31, this.expandedIcon);
        String str = this.style;
        return iM30450d + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.collapsedTitle;
        String str2 = this.expandedTitle;
        String str3 = this.collapsedIcon;
        String str4 = this.expandedIcon;
        String str5 = this.style;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ToggleCardButtonModel(collapsedTitle=", str, ", expandedTitle=", str2, ", collapsedIcon=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", expandedIcon=", str4, ", style=");
        return AbstractC25012a.m73376i(str5, ")", sbM32001t);
    }

    public ToggleCardButtonModel(String collapsedTitle, String expandedTitle, String collapsedIcon, String expandedIcon, String str) {
        AbstractC22676k.m65750j(collapsedTitle, "collapsedTitle");
        AbstractC22676k.m65750j(expandedTitle, "expandedTitle");
        AbstractC22676k.m65750j(collapsedIcon, "collapsedIcon");
        AbstractC22676k.m65750j(expandedIcon, "expandedIcon");
        this.collapsedTitle = collapsedTitle;
        this.expandedTitle = expandedTitle;
        this.collapsedIcon = collapsedIcon;
        this.expandedIcon = expandedIcon;
        this.style = str;
    }
}
