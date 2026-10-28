package com.whoop.hormonalinsights.postpartum.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gm2.C15999a;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rBk\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010$Jf\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b3\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b4\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b5\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b6\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b9\u0010$¨\u0006<"}, m65681d2 = {"Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalDateInputScreen;", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;", "", "title", "startDate", "minDate", "maxDate", "buttonTitle", "skipTitle", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "skipNextId", "nextId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalDateInputScreen;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;)Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalDateInputScreen;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getStartDate", "getMinDate", "getMaxDate", "getButtonTitle", "getSkipTitle", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "getSkipNextId", "getNextId", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HormonalDateInputScreen implements HormonalScreenContent {
    private static final InterfaceC23462h[] $childSerializers;
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String buttonTitle;
    private final String maxDate;
    private final String minDate;
    private final HormonalScreenId nextId;
    private final HormonalScreenId skipNextId;
    private final String skipTitle;
    private final String startDate;
    private final String title;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalDateInputScreen$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalDateInputScreen;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HormonalDateInputScreen$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C15999a(24)), AbstractC30060g.m92087G(enumC23463i, new C15999a(25))};
    }

    public /* synthetic */ HormonalDateInputScreen(int i13, String str, String str2, String str3, String str4, String str5, String str6, HormonalScreenId hormonalScreenId, HormonalScreenId hormonalScreenId2, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, HormonalDateInputScreen$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.startDate = str2;
        this.minDate = str3;
        this.maxDate = str4;
        this.buttonTitle = str5;
        this.skipTitle = str6;
        this.skipNextId = hormonalScreenId;
        this.nextId = hormonalScreenId2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId", HormonalScreenId.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId", HormonalScreenId.values());
    }

    public static /* synthetic */ HormonalDateInputScreen copy$default(HormonalDateInputScreen hormonalDateInputScreen, String str, String str2, String str3, String str4, String str5, String str6, HormonalScreenId hormonalScreenId, HormonalScreenId hormonalScreenId2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = hormonalDateInputScreen.title;
        }
        if ((i13 & 2) != 0) {
            str2 = hormonalDateInputScreen.startDate;
        }
        if ((i13 & 4) != 0) {
            str3 = hormonalDateInputScreen.minDate;
        }
        if ((i13 & 8) != 0) {
            str4 = hormonalDateInputScreen.maxDate;
        }
        if ((i13 & 16) != 0) {
            str5 = hormonalDateInputScreen.buttonTitle;
        }
        if ((i13 & 32) != 0) {
            str6 = hormonalDateInputScreen.skipTitle;
        }
        if ((i13 & 64) != 0) {
            hormonalScreenId = hormonalDateInputScreen.skipNextId;
        }
        if ((i13 & 128) != 0) {
            hormonalScreenId2 = hormonalDateInputScreen.nextId;
        }
        HormonalScreenId hormonalScreenId3 = hormonalScreenId;
        HormonalScreenId hormonalScreenId4 = hormonalScreenId2;
        String str7 = str5;
        String str8 = str6;
        return hormonalDateInputScreen.copy(str, str2, str3, str4, str7, str8, hormonalScreenId3, hormonalScreenId4);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(HormonalDateInputScreen self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.startDate);
        output.encodeStringElement(serialDesc, 2, self.minDate);
        output.encodeStringElement(serialDesc, 3, self.maxDate);
        output.encodeStringElement(serialDesc, 4, self.buttonTitle);
        output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.skipTitle);
        output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.skipNextId);
        output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.nextId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMinDate() {
        return this.minDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMaxDate() {
        return this.maxDate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSkipTitle() {
        return this.skipTitle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final HormonalScreenId getSkipNextId() {
        return this.skipNextId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final HormonalScreenId getNextId() {
        return this.nextId;
    }

    public final HormonalDateInputScreen copy(String title, String startDate, String minDate, String maxDate, String buttonTitle, String skipTitle, HormonalScreenId skipNextId, HormonalScreenId nextId) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(startDate, "startDate");
        AbstractC22676k.m65750j(minDate, "minDate");
        AbstractC22676k.m65750j(maxDate, "maxDate");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        return new HormonalDateInputScreen(title, startDate, minDate, maxDate, buttonTitle, skipTitle, skipNextId, nextId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HormonalDateInputScreen)) {
            return false;
        }
        HormonalDateInputScreen hormonalDateInputScreen = (HormonalDateInputScreen) other;
        return AbstractC22676k.m65745e(this.title, hormonalDateInputScreen.title) && AbstractC22676k.m65745e(this.startDate, hormonalDateInputScreen.startDate) && AbstractC22676k.m65745e(this.minDate, hormonalDateInputScreen.minDate) && AbstractC22676k.m65745e(this.maxDate, hormonalDateInputScreen.maxDate) && AbstractC22676k.m65745e(this.buttonTitle, hormonalDateInputScreen.buttonTitle) && AbstractC22676k.m65745e(this.skipTitle, hormonalDateInputScreen.skipTitle) && this.skipNextId == hormonalDateInputScreen.skipNextId && this.nextId == hormonalDateInputScreen.nextId;
    }

    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    public final String getMaxDate() {
        return this.maxDate;
    }

    public final String getMinDate() {
        return this.minDate;
    }

    public final HormonalScreenId getNextId() {
        return this.nextId;
    }

    public final HormonalScreenId getSkipNextId() {
        return this.skipNextId;
    }

    public final String getSkipTitle() {
        return this.skipTitle;
    }

    public final String getStartDate() {
        return this.startDate;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.startDate), 31, this.minDate), 31, this.maxDate), 31, this.buttonTitle);
        String str = this.skipTitle;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        HormonalScreenId hormonalScreenId = this.skipNextId;
        int iHashCode2 = (iHashCode + (hormonalScreenId == null ? 0 : hormonalScreenId.hashCode())) * 31;
        HormonalScreenId hormonalScreenId2 = this.nextId;
        return iHashCode2 + (hormonalScreenId2 != null ? hormonalScreenId2.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.startDate;
        String str3 = this.minDate;
        String str4 = this.maxDate;
        String str5 = this.buttonTitle;
        String str6 = this.skipTitle;
        HormonalScreenId hormonalScreenId = this.skipNextId;
        HormonalScreenId hormonalScreenId2 = this.nextId;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HormonalDateInputScreen(title=", str, ", startDate=", str2, ", minDate=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", maxDate=", str4, ", buttonTitle=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", skipTitle=", str6, ", skipNextId=");
        sbM32001t.append(hormonalScreenId);
        sbM32001t.append(", nextId=");
        sbM32001t.append(hormonalScreenId2);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public HormonalDateInputScreen(String title, String startDate, String minDate, String maxDate, String buttonTitle, String str, HormonalScreenId hormonalScreenId, HormonalScreenId hormonalScreenId2) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(startDate, "startDate");
        AbstractC22676k.m65750j(minDate, "minDate");
        AbstractC22676k.m65750j(maxDate, "maxDate");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        this.title = title;
        this.startDate = startDate;
        this.minDate = minDate;
        this.maxDate = maxDate;
        this.buttonTitle = buttonTitle;
        this.skipTitle = str;
        this.skipNextId = hormonalScreenId;
        this.nextId = hormonalScreenId2;
    }
}
