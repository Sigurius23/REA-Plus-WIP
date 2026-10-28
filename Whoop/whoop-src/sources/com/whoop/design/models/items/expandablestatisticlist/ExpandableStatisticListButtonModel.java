package com.whoop.design.models.items.expandablestatisticlist;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010&\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010\u0018R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b-\u0010)\u001a\u0004\b,\u0010\u0018R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b/\u0010)\u001a\u0004\b.\u0010\u0018¨\u00062"}, m65681d2 = {"Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "collapsedTitle", "expandedTitle", "collapsedIcon", "expandedIcon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCollapsedTitle", "getCollapsedTitle$annotations", "()V", "getExpandedTitle", "getExpandedTitle$annotations", "getCollapsedIcon", "getCollapsedIcon$annotations", "getExpandedIcon", "getExpandedIcon$annotations", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ExpandableStatisticListButtonModel implements DesignSystemModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String collapsedIcon;
    private final String collapsedTitle;
    private final String expandedIcon;
    private final String expandedTitle;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ExpandableStatisticListButtonModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ExpandableStatisticListButtonModel(int i13, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, ExpandableStatisticListButtonModel$$serializer.INSTANCE.getDescriptor());
        }
        this.collapsedTitle = str;
        this.expandedTitle = str2;
        this.collapsedIcon = str3;
        this.expandedIcon = str4;
    }

    public static /* synthetic */ ExpandableStatisticListButtonModel copy$default(ExpandableStatisticListButtonModel expandableStatisticListButtonModel, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = expandableStatisticListButtonModel.collapsedTitle;
        }
        if ((i13 & 2) != 0) {
            str2 = expandableStatisticListButtonModel.expandedTitle;
        }
        if ((i13 & 4) != 0) {
            str3 = expandableStatisticListButtonModel.collapsedIcon;
        }
        if ((i13 & 8) != 0) {
            str4 = expandableStatisticListButtonModel.expandedIcon;
        }
        return expandableStatisticListButtonModel.copy(str, str2, str3, str4);
    }

    @InterfaceC37143h("collapsed_icon")
    public static /* synthetic */ void getCollapsedIcon$annotations() {
    }

    @InterfaceC37143h("collapsed_title")
    public static /* synthetic */ void getCollapsedTitle$annotations() {
    }

    @InterfaceC37143h("expanded_icon")
    public static /* synthetic */ void getExpandedIcon$annotations() {
    }

    @InterfaceC37143h("expanded_title")
    public static /* synthetic */ void getExpandedTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(ExpandableStatisticListButtonModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.collapsedTitle);
        output.encodeStringElement(serialDesc, 1, self.expandedTitle);
        output.encodeStringElement(serialDesc, 2, self.collapsedIcon);
        output.encodeStringElement(serialDesc, 3, self.expandedIcon);
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

    public final ExpandableStatisticListButtonModel copy(String collapsedTitle, String expandedTitle, String collapsedIcon, String expandedIcon) {
        AbstractC22676k.m65750j(collapsedTitle, "collapsedTitle");
        AbstractC22676k.m65750j(expandedTitle, "expandedTitle");
        AbstractC22676k.m65750j(collapsedIcon, "collapsedIcon");
        AbstractC22676k.m65750j(expandedIcon, "expandedIcon");
        return new ExpandableStatisticListButtonModel(collapsedTitle, expandedTitle, collapsedIcon, expandedIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpandableStatisticListButtonModel)) {
            return false;
        }
        ExpandableStatisticListButtonModel expandableStatisticListButtonModel = (ExpandableStatisticListButtonModel) other;
        return AbstractC22676k.m65745e(this.collapsedTitle, expandableStatisticListButtonModel.collapsedTitle) && AbstractC22676k.m65745e(this.expandedTitle, expandableStatisticListButtonModel.expandedTitle) && AbstractC22676k.m65745e(this.collapsedIcon, expandableStatisticListButtonModel.collapsedIcon) && AbstractC22676k.m65745e(this.expandedIcon, expandableStatisticListButtonModel.expandedIcon);
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

    public int hashCode() {
        return this.expandedIcon.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.collapsedTitle.hashCode() * 31, 31, this.expandedTitle), 31, this.collapsedIcon);
    }

    public String toString() {
        String str = this.collapsedTitle;
        String str2 = this.expandedTitle;
        return AbstractC11266d.m30464r(AbstractC11895b.m32001t("ExpandableStatisticListButtonModel(collapsedTitle=", str, ", expandedTitle=", str2, ", collapsedIcon="), this.collapsedIcon, ", expandedIcon=", this.expandedIcon, ")");
    }

    public ExpandableStatisticListButtonModel(String collapsedTitle, String expandedTitle, String collapsedIcon, String expandedIcon) {
        AbstractC22676k.m65750j(collapsedTitle, "collapsedTitle");
        AbstractC22676k.m65750j(expandedTitle, "expandedTitle");
        AbstractC22676k.m65750j(collapsedIcon, "collapsedIcon");
        AbstractC22676k.m65750j(expandedIcon, "expandedIcon");
        this.collapsedTitle = collapsedTitle;
        this.expandedTitle = expandedTitle;
        this.collapsedIcon = collapsedIcon;
        this.expandedIcon = expandedIcon;
    }
}
