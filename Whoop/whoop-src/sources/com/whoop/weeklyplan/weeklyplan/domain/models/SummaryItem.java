package com.whoop.weeklyplan.weeklyplan.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import ut2.C35231a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b)\u0010\u0018¨\u0006,"}, m65681d2 = {"Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryItem;", "", "", "titleDisplay", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryItemStyle;", "style", "progressDisplay", "<init>", "(Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryItemStyle;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryItemStyle;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryItem;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryItemStyle;", "component3", "copy", "(Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryItemStyle;Ljava/lang/String;)Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryItem;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitleDisplay", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryItemStyle;", "getStyle", "getProgressDisplay", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SummaryItem {
    public static final int $stable = 0;
    private final String progressDisplay;
    private final SummaryItemStyle style;
    private final String titleDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C35231a(2)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryItem$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryItem;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SummaryItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SummaryItem(int i13, String str, SummaryItemStyle summaryItemStyle, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, SummaryItem$$serializer.INSTANCE.getDescriptor());
        }
        this.titleDisplay = str;
        this.style = summaryItemStyle;
        this.progressDisplay = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return SummaryItemStyle.INSTANCE.serializer();
    }

    public static /* synthetic */ SummaryItem copy$default(SummaryItem summaryItem, String str, SummaryItemStyle summaryItemStyle, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = summaryItem.titleDisplay;
        }
        if ((i13 & 2) != 0) {
            summaryItemStyle = summaryItem.style;
        }
        if ((i13 & 4) != 0) {
            str2 = summaryItem.progressDisplay;
        }
        return summaryItem.copy(str, summaryItemStyle, str2);
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(SummaryItem self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.titleDisplay);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.style);
        output.encodeStringElement(serialDesc, 2, self.progressDisplay);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SummaryItemStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProgressDisplay() {
        return this.progressDisplay;
    }

    public final SummaryItem copy(String titleDisplay, SummaryItemStyle style, String progressDisplay) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(progressDisplay, "progressDisplay");
        return new SummaryItem(titleDisplay, style, progressDisplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SummaryItem)) {
            return false;
        }
        SummaryItem summaryItem = (SummaryItem) other;
        return AbstractC22676k.m65745e(this.titleDisplay, summaryItem.titleDisplay) && this.style == summaryItem.style && AbstractC22676k.m65745e(this.progressDisplay, summaryItem.progressDisplay);
    }

    public final String getProgressDisplay() {
        return this.progressDisplay;
    }

    public final SummaryItemStyle getStyle() {
        return this.style;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        return this.progressDisplay.hashCode() + ((this.style.hashCode() + (this.titleDisplay.hashCode() * 31)) * 31);
    }

    public String toString() {
        String str = this.titleDisplay;
        SummaryItemStyle summaryItemStyle = this.style;
        String str2 = this.progressDisplay;
        StringBuilder sb4 = new StringBuilder("SummaryItem(titleDisplay=");
        sb4.append(str);
        sb4.append(", style=");
        sb4.append(summaryItemStyle);
        sb4.append(", progressDisplay=");
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }

    public SummaryItem(String titleDisplay, SummaryItemStyle style, String progressDisplay) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(progressDisplay, "progressDisplay");
        this.titleDisplay = titleDisplay;
        this.style = style;
        this.progressDisplay = progressDisplay;
    }
}
