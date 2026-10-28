package com.whoop.hormonalinsights.postpartum.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gm2.C15999a;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJB\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001f¨\u00062"}, m65681d2 = {"Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;", "", "", "imageUrl", "title", "subtitle", "primaryButtonTitle", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "nextPregnancyScreen", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;)Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImageUrl", "getTitle", "getSubtitle", "getPrimaryButtonTitle", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "getNextPregnancyScreen", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CongratulationsScreen {
    public static final int $stable = 0;
    private final String imageUrl;
    private final HormonalScreenId nextPregnancyScreen;
    private final String primaryButtonTitle;
    private final String subtitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C15999a(23))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CongratulationsScreen$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CongratulationsScreen(int i13, String str, String str2, String str3, String str4, HormonalScreenId hormonalScreenId, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, CongratulationsScreen$$serializer.INSTANCE.getDescriptor());
        }
        this.imageUrl = str;
        this.title = str2;
        this.subtitle = str3;
        this.primaryButtonTitle = str4;
        this.nextPregnancyScreen = hormonalScreenId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId", HormonalScreenId.values());
    }

    public static /* synthetic */ CongratulationsScreen copy$default(CongratulationsScreen congratulationsScreen, String str, String str2, String str3, String str4, HormonalScreenId hormonalScreenId, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = congratulationsScreen.imageUrl;
        }
        if ((i13 & 2) != 0) {
            str2 = congratulationsScreen.title;
        }
        if ((i13 & 4) != 0) {
            str3 = congratulationsScreen.subtitle;
        }
        if ((i13 & 8) != 0) {
            str4 = congratulationsScreen.primaryButtonTitle;
        }
        if ((i13 & 16) != 0) {
            hormonalScreenId = congratulationsScreen.nextPregnancyScreen;
        }
        HormonalScreenId hormonalScreenId2 = hormonalScreenId;
        String str5 = str3;
        return congratulationsScreen.copy(str, str2, str5, str4, hormonalScreenId2);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(CongratulationsScreen self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.imageUrl);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.subtitle);
        output.encodeStringElement(serialDesc, 3, self.primaryButtonTitle);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.nextPregnancyScreen);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPrimaryButtonTitle() {
        return this.primaryButtonTitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final HormonalScreenId getNextPregnancyScreen() {
        return this.nextPregnancyScreen;
    }

    public final CongratulationsScreen copy(String imageUrl, String title, String subtitle, String primaryButtonTitle, HormonalScreenId nextPregnancyScreen) {
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(primaryButtonTitle, "primaryButtonTitle");
        AbstractC22676k.m65750j(nextPregnancyScreen, "nextPregnancyScreen");
        return new CongratulationsScreen(imageUrl, title, subtitle, primaryButtonTitle, nextPregnancyScreen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CongratulationsScreen)) {
            return false;
        }
        CongratulationsScreen congratulationsScreen = (CongratulationsScreen) other;
        return AbstractC22676k.m65745e(this.imageUrl, congratulationsScreen.imageUrl) && AbstractC22676k.m65745e(this.title, congratulationsScreen.title) && AbstractC22676k.m65745e(this.subtitle, congratulationsScreen.subtitle) && AbstractC22676k.m65745e(this.primaryButtonTitle, congratulationsScreen.primaryButtonTitle) && this.nextPregnancyScreen == congratulationsScreen.nextPregnancyScreen;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final HormonalScreenId getNextPregnancyScreen() {
        return this.nextPregnancyScreen;
    }

    public final String getPrimaryButtonTitle() {
        return this.primaryButtonTitle;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.nextPregnancyScreen.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.imageUrl.hashCode() * 31, 31, this.title), 31, this.subtitle), 31, this.primaryButtonTitle);
    }

    public String toString() {
        String str = this.imageUrl;
        String str2 = this.title;
        String str3 = this.subtitle;
        String str4 = this.primaryButtonTitle;
        HormonalScreenId hormonalScreenId = this.nextPregnancyScreen;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CongratulationsScreen(imageUrl=", str, ", title=", str2, ", subtitle=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", primaryButtonTitle=", str4, ", nextPregnancyScreen=");
        sbM32001t.append(hormonalScreenId);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public CongratulationsScreen(String imageUrl, String title, String subtitle, String primaryButtonTitle, HormonalScreenId nextPregnancyScreen) {
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(primaryButtonTitle, "primaryButtonTitle");
        AbstractC22676k.m65750j(nextPregnancyScreen, "nextPregnancyScreen");
        this.imageUrl = imageUrl;
        this.title = title;
        this.subtitle = subtitle;
        this.primaryButtonTitle = primaryButtonTitle;
        this.nextPregnancyScreen = nextPregnancyScreen;
    }
}
