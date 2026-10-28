package com.whoop.home.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc2.C39434a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0010\u0010$\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b$\u0010%J`\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b5\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b6\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b7\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010%¨\u0006<"}, m65681d2 = {"Lcom/whoop/home/domain/models/CoachActivityTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "iconUrl", "scoreDisplay", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "secondaryIcon", "commitmentLevel", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$home_release", "(Lcom/whoop/home/domain/models/CoachActivityTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/util/TextResource;", "component4", "component5", "component6", "component7", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/home/domain/models/CoachActivityTileModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIconUrl", "getScoreDisplay", "Lcom/whoop/design/util/TextResource;", "getTitle", "getSubtitle", "getSecondaryIcon", "getCommitmentLevel", "Lcom/whoop/navigation/e;", "getDestination", "Companion", "$serializer", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CoachActivityTileModel implements DesignSystemModel {
    private final String commitmentLevel;
    private final C9598e destination;
    private final String iconUrl;
    private final String scoreDisplay;
    private final String secondaryIcon;
    private final String subtitle;
    private final TextResource title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d | TextResource.$stable;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C39434a(15))};

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/home/domain/models/CoachActivityTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/home/domain/models/CoachActivityTileModel;", "serializer", "()Lwc3/c;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CoachActivityTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CoachActivityTileModel(int i13, String str, String str2, TextResource textResource, String str3, String str4, String str5, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, CoachActivityTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.iconUrl = str;
        this.scoreDisplay = str2;
        this.title = textResource;
        this.subtitle = str3;
        this.secondaryIcon = str4;
        this.commitmentLevel = str5;
        this.destination = c9598e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ CoachActivityTileModel copy$default(CoachActivityTileModel coachActivityTileModel, String str, String str2, TextResource textResource, String str3, String str4, String str5, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = coachActivityTileModel.iconUrl;
        }
        if ((i13 & 2) != 0) {
            str2 = coachActivityTileModel.scoreDisplay;
        }
        if ((i13 & 4) != 0) {
            textResource = coachActivityTileModel.title;
        }
        if ((i13 & 8) != 0) {
            str3 = coachActivityTileModel.subtitle;
        }
        if ((i13 & 16) != 0) {
            str4 = coachActivityTileModel.secondaryIcon;
        }
        if ((i13 & 32) != 0) {
            str5 = coachActivityTileModel.commitmentLevel;
        }
        if ((i13 & 64) != 0) {
            c9598e = coachActivityTileModel.destination;
        }
        String str6 = str5;
        C9598e c9598e2 = c9598e;
        String str7 = str4;
        TextResource textResource2 = textResource;
        return coachActivityTileModel.copy(str, str2, textResource2, str3, str7, str6, c9598e2);
    }

    public static final /* synthetic */ void write$Self$home_release(CoachActivityTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.iconUrl);
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.scoreDisplay);
        output.encodeSerializableElement(serialDesc, 2, C25452a.f99689a, self.title);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.subtitle);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.secondaryIcon);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.commitmentLevel);
        output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.destination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getScoreDisplay() {
        return this.scoreDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSecondaryIcon() {
        return this.secondaryIcon;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCommitmentLevel() {
        return this.commitmentLevel;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public final CoachActivityTileModel copy(String iconUrl, String scoreDisplay, TextResource title, String subtitle, String secondaryIcon, String commitmentLevel, C9598e destination) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(destination, "destination");
        return new CoachActivityTileModel(iconUrl, scoreDisplay, title, subtitle, secondaryIcon, commitmentLevel, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoachActivityTileModel)) {
            return false;
        }
        CoachActivityTileModel coachActivityTileModel = (CoachActivityTileModel) other;
        return AbstractC22676k.m65745e(this.iconUrl, coachActivityTileModel.iconUrl) && AbstractC22676k.m65745e(this.scoreDisplay, coachActivityTileModel.scoreDisplay) && AbstractC22676k.m65745e(this.title, coachActivityTileModel.title) && AbstractC22676k.m65745e(this.subtitle, coachActivityTileModel.subtitle) && AbstractC22676k.m65745e(this.secondaryIcon, coachActivityTileModel.secondaryIcon) && AbstractC22676k.m65745e(this.commitmentLevel, coachActivityTileModel.commitmentLevel) && AbstractC22676k.m65745e(this.destination, coachActivityTileModel.destination);
    }

    public final String getCommitmentLevel() {
        return this.commitmentLevel;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getScoreDisplay() {
        return this.scoreDisplay;
    }

    public final String getSecondaryIcon() {
        return this.secondaryIcon;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.iconUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.scoreDisplay;
        int iM95625a = AbstractC31061c.m95625a((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, this.title, 31);
        String str3 = this.subtitle;
        int iHashCode2 = (iM95625a + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.secondaryIcon;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.commitmentLevel;
        return this.destination.hashCode() + ((iHashCode3 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.iconUrl;
        String str2 = this.scoreDisplay;
        TextResource textResource = this.title;
        String str3 = this.subtitle;
        String str4 = this.secondaryIcon;
        String str5 = this.commitmentLevel;
        C9598e c9598e = this.destination;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CoachActivityTileModel(iconUrl=", str, ", scoreDisplay=", str2, ", title=");
        AbstractC30007c.m91856z(sbM32001t, textResource, ", subtitle=", str3, ", secondaryIcon=");
        AbstractC11266d.m30444B(sbM32001t, str4, ", commitmentLevel=", str5, ", destination=");
        return AbstractC33745d.m106656o(sbM32001t, c9598e, ")");
    }

    public CoachActivityTileModel(String str, String str2, TextResource title, String str3, String str4, String str5, C9598e destination) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(destination, "destination");
        this.iconUrl = str;
        this.scoreDisplay = str2;
        this.title = title;
        this.subtitle = str3;
        this.secondaryIcon = str4;
        this.commitmentLevel = str5;
        this.destination = destination;
    }
}
