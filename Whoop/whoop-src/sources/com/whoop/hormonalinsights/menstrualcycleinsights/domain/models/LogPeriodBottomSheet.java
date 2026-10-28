package com.whoop.hormonalinsights.menstrualcycleinsights.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import qo1.C30526a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ>\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00060"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodBottomSheet;", "", "", "titleDisplay", "buttonTitle", "secondaryButtonTitle", "", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;", "toggles", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodBottomSheet;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodBottomSheet;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitleDisplay", "getButtonTitle", "getSecondaryButtonTitle", "Ljava/util/List;", "getToggles", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LogPeriodBottomSheet {
    private final String buttonTitle;
    private final String secondaryButtonTitle;
    private final String titleDisplay;
    private final List<LogPeriodToggle> toggles;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C30526a(19))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodBottomSheet$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodBottomSheet;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LogPeriodBottomSheet$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ LogPeriodBottomSheet(int i13, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, LogPeriodBottomSheet$$serializer.INSTANCE.getDescriptor());
        }
        this.titleDisplay = str;
        this.buttonTitle = str2;
        this.secondaryButtonTitle = str3;
        this.toggles = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(LogPeriodToggle$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LogPeriodBottomSheet copy$default(LogPeriodBottomSheet logPeriodBottomSheet, String str, String str2, String str3, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = logPeriodBottomSheet.titleDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = logPeriodBottomSheet.buttonTitle;
        }
        if ((i13 & 4) != 0) {
            str3 = logPeriodBottomSheet.secondaryButtonTitle;
        }
        if ((i13 & 8) != 0) {
            list = logPeriodBottomSheet.toggles;
        }
        return logPeriodBottomSheet.copy(str, str2, str3, list);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(LogPeriodBottomSheet self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.titleDisplay);
        output.encodeStringElement(serialDesc, 1, self.buttonTitle);
        output.encodeStringElement(serialDesc, 2, self.secondaryButtonTitle);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.toggles);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSecondaryButtonTitle() {
        return this.secondaryButtonTitle;
    }

    public final List<LogPeriodToggle> component4() {
        return this.toggles;
    }

    public final LogPeriodBottomSheet copy(String titleDisplay, String buttonTitle, String secondaryButtonTitle, List<LogPeriodToggle> toggles) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        AbstractC22676k.m65750j(secondaryButtonTitle, "secondaryButtonTitle");
        AbstractC22676k.m65750j(toggles, "toggles");
        return new LogPeriodBottomSheet(titleDisplay, buttonTitle, secondaryButtonTitle, toggles);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogPeriodBottomSheet)) {
            return false;
        }
        LogPeriodBottomSheet logPeriodBottomSheet = (LogPeriodBottomSheet) other;
        return AbstractC22676k.m65745e(this.titleDisplay, logPeriodBottomSheet.titleDisplay) && AbstractC22676k.m65745e(this.buttonTitle, logPeriodBottomSheet.buttonTitle) && AbstractC22676k.m65745e(this.secondaryButtonTitle, logPeriodBottomSheet.secondaryButtonTitle) && AbstractC22676k.m65745e(this.toggles, logPeriodBottomSheet.toggles);
    }

    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    public final String getSecondaryButtonTitle() {
        return this.secondaryButtonTitle;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public final List<LogPeriodToggle> getToggles() {
        return this.toggles;
    }

    public int hashCode() {
        return this.toggles.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.titleDisplay.hashCode() * 31, 31, this.buttonTitle), 31, this.secondaryButtonTitle);
    }

    public String toString() {
        String str = this.titleDisplay;
        String str2 = this.buttonTitle;
        return AbstractC30007c.m91840j(this.secondaryButtonTitle, ", toggles=", ")", AbstractC11895b.m32001t("LogPeriodBottomSheet(titleDisplay=", str, ", buttonTitle=", str2, ", secondaryButtonTitle="), this.toggles);
    }

    public LogPeriodBottomSheet(String titleDisplay, String buttonTitle, String secondaryButtonTitle, List<LogPeriodToggle> toggles) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        AbstractC22676k.m65750j(secondaryButtonTitle, "secondaryButtonTitle");
        AbstractC22676k.m65750j(toggles, "toggles");
        this.titleDisplay = titleDisplay;
        this.buttonTitle = buttonTitle;
        this.secondaryButtonTitle = secondaryButtonTitle;
        this.toggles = toggles;
    }
}
