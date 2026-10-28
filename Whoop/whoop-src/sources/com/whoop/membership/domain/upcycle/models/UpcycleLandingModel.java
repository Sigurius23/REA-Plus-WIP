package com.whoop.membership.domain.upcycle.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import ut2.C35231a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eBe\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJ^\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001eJ\u0010\u0010*\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010\"R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b5\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010%R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b8\u0010\u001e¨\u0006;"}, m65681d2 = {"Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;", "", "", "icon", "title", "subtitle", "", "Lcom/whoop/membership/domain/upcycle/models/UpcycleContent;", "items", "analyticsCategory", "", "receivedKit", "upcycleOffer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$membership_release", "(Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "()Z", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;)Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "getTitle", "getSubtitle", "Ljava/util/List;", "getItems", "getAnalyticsCategory", "Z", "getReceivedKit", "getUpcycleOffer", "Companion", "$serializer", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class UpcycleLandingModel {
    private final String analyticsCategory;
    private final String icon;
    private final List<UpcycleContent> items;
    private final boolean receivedKit;
    private final String subtitle;
    private final String title;
    private final String upcycleOffer;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C35231a(13)), null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;", "serializer", "()Lwc3/c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return UpcycleLandingModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ UpcycleLandingModel(int i13, String str, String str2, String str3, List list, String str4, boolean z4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, UpcycleLandingModel$$serializer.INSTANCE.getDescriptor());
        }
        this.icon = str;
        this.title = str2;
        this.subtitle = str3;
        this.items = list;
        this.analyticsCategory = str4;
        this.receivedKit = z4;
        this.upcycleOffer = str5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(UpcycleContent$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpcycleLandingModel copy$default(UpcycleLandingModel upcycleLandingModel, String str, String str2, String str3, List list, String str4, boolean z4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = upcycleLandingModel.icon;
        }
        if ((i13 & 2) != 0) {
            str2 = upcycleLandingModel.title;
        }
        if ((i13 & 4) != 0) {
            str3 = upcycleLandingModel.subtitle;
        }
        if ((i13 & 8) != 0) {
            list = upcycleLandingModel.items;
        }
        if ((i13 & 16) != 0) {
            str4 = upcycleLandingModel.analyticsCategory;
        }
        if ((i13 & 32) != 0) {
            z4 = upcycleLandingModel.receivedKit;
        }
        if ((i13 & 64) != 0) {
            str5 = upcycleLandingModel.upcycleOffer;
        }
        boolean z13 = z4;
        String str6 = str5;
        String str7 = str4;
        String str8 = str3;
        return upcycleLandingModel.copy(str, str2, str8, list, str7, z13, str6);
    }

    public static final /* synthetic */ void write$Self$membership_release(UpcycleLandingModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.icon);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.subtitle);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.items);
        output.encodeStringElement(serialDesc, 4, self.analyticsCategory);
        output.encodeBooleanElement(serialDesc, 5, self.receivedKit);
        output.encodeStringElement(serialDesc, 6, self.upcycleOffer);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<UpcycleContent> component4() {
        return this.items;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAnalyticsCategory() {
        return this.analyticsCategory;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getReceivedKit() {
        return this.receivedKit;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUpcycleOffer() {
        return this.upcycleOffer;
    }

    public final UpcycleLandingModel copy(String icon, String title, String subtitle, List<UpcycleContent> items, String analyticsCategory, boolean receivedKit, String upcycleOffer) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(analyticsCategory, "analyticsCategory");
        AbstractC22676k.m65750j(upcycleOffer, "upcycleOffer");
        return new UpcycleLandingModel(icon, title, subtitle, items, analyticsCategory, receivedKit, upcycleOffer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpcycleLandingModel)) {
            return false;
        }
        UpcycleLandingModel upcycleLandingModel = (UpcycleLandingModel) other;
        return AbstractC22676k.m65745e(this.icon, upcycleLandingModel.icon) && AbstractC22676k.m65745e(this.title, upcycleLandingModel.title) && AbstractC22676k.m65745e(this.subtitle, upcycleLandingModel.subtitle) && AbstractC22676k.m65745e(this.items, upcycleLandingModel.items) && AbstractC22676k.m65745e(this.analyticsCategory, upcycleLandingModel.analyticsCategory) && this.receivedKit == upcycleLandingModel.receivedKit && AbstractC22676k.m65745e(this.upcycleOffer, upcycleLandingModel.upcycleOffer);
    }

    public final String getAnalyticsCategory() {
        return this.analyticsCategory;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final List<UpcycleContent> getItems() {
        return this.items;
    }

    public final boolean getReceivedKit() {
        return this.receivedKit;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUpcycleOffer() {
        return this.upcycleOffer;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.icon.hashCode() * 31, 31, this.title);
        String str = this.subtitle;
        return this.upcycleOffer.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11895b.m31983b((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.items), 31, this.analyticsCategory), 31, this.receivedKit);
    }

    public String toString() {
        String str = this.icon;
        String str2 = this.title;
        String str3 = this.subtitle;
        List<UpcycleContent> list = this.items;
        String str4 = this.analyticsCategory;
        boolean z4 = this.receivedKit;
        String str5 = this.upcycleOffer;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("UpcycleLandingModel(icon=", str, ", title=", str2, ", subtitle=");
        AbstractC36095b.m114694v(str3, ", items=", ", analyticsCategory=", sbM32001t, list);
        AbstractC38963t7.m124390t(sbM32001t, str4, ", receivedKit=", z4, ", upcycleOffer=");
        return AbstractC25012a.m73376i(str5, ")", sbM32001t);
    }

    public UpcycleLandingModel(String icon, String title, String str, List<UpcycleContent> items, String analyticsCategory, boolean z4, String upcycleOffer) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(analyticsCategory, "analyticsCategory");
        AbstractC22676k.m65750j(upcycleOffer, "upcycleOffer");
        this.icon = icon;
        this.title = title;
        this.subtitle = str;
        this.items = items;
        this.analyticsCategory = analyticsCategory;
        this.receivedKit = z4;
        this.upcycleOffer = upcycleOffer;
    }
}
