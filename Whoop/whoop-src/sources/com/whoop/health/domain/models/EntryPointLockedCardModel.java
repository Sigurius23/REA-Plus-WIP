package com.whoop.health.domain.models;

import androidx.core.app.FrameMetricsAggregator;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.TagModel;
import com.whoop.design.models.items.TagModel$$serializer;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import sh2.C32513d;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@B_\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBu\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0012\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b(\u0010)Jz\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b7\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b8\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b9\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b:\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b;\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010)¨\u0006B"}, m65681d2 = {"Lcom/whoop/health/domain/models/EntryPointLockedCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "cardName", "title", "titleImage", "endIcon", "subtitle", "backgroundImage", "lastUpdated", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/design/models/items/TagModel;", "navigationTag", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/TagModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/TagModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$health_release", "(Lcom/whoop/health/domain/models/EntryPointLockedCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Lcom/whoop/navigation/e;", "component9", "()Lcom/whoop/design/models/items/TagModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/TagModel;)Lcom/whoop/health/domain/models/EntryPointLockedCardModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCardName", "getTitle", "getTitleImage", "getEndIcon", "getSubtitle", "getBackgroundImage", "getLastUpdated", "Lcom/whoop/navigation/e;", "getDestination", "Lcom/whoop/design/models/items/TagModel;", "getNavigationTag", "Companion", "$serializer", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class EntryPointLockedCardModel implements DesignSystemModel {
    private final String backgroundImage;
    private final String cardName;
    private final C9598e destination;
    private final String endIcon;
    private final String lastUpdated;
    private final TagModel navigationTag;
    private final String subtitle;
    private final String title;
    private final String titleImage;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TagModel.$stable | C9598e.f28134d;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C32513d(4)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/health/domain/models/EntryPointLockedCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/health/domain/models/EntryPointLockedCardModel;", "serializer", "()Lwc3/c;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return EntryPointLockedCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ EntryPointLockedCardModel(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, C9598e c9598e, TagModel tagModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i13 & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i13, FrameMetricsAggregator.EVERY_DURATION, EntryPointLockedCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.cardName = str;
        this.title = str2;
        this.titleImage = str3;
        this.endIcon = str4;
        this.subtitle = str5;
        this.backgroundImage = str6;
        this.lastUpdated = str7;
        this.destination = c9598e;
        this.navigationTag = tagModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ EntryPointLockedCardModel copy$default(EntryPointLockedCardModel entryPointLockedCardModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, C9598e c9598e, TagModel tagModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = entryPointLockedCardModel.cardName;
        }
        if ((i13 & 2) != 0) {
            str2 = entryPointLockedCardModel.title;
        }
        if ((i13 & 4) != 0) {
            str3 = entryPointLockedCardModel.titleImage;
        }
        if ((i13 & 8) != 0) {
            str4 = entryPointLockedCardModel.endIcon;
        }
        if ((i13 & 16) != 0) {
            str5 = entryPointLockedCardModel.subtitle;
        }
        if ((i13 & 32) != 0) {
            str6 = entryPointLockedCardModel.backgroundImage;
        }
        if ((i13 & 64) != 0) {
            str7 = entryPointLockedCardModel.lastUpdated;
        }
        if ((i13 & 128) != 0) {
            c9598e = entryPointLockedCardModel.destination;
        }
        if ((i13 & 256) != 0) {
            tagModel = entryPointLockedCardModel.navigationTag;
        }
        C9598e c9598e2 = c9598e;
        TagModel tagModel2 = tagModel;
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return entryPointLockedCardModel.copy(str, str2, str11, str4, str10, str8, str9, c9598e2, tagModel2);
    }

    public static final /* synthetic */ void write$Self$health_release(EntryPointLockedCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.cardName);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.titleImage);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.endIcon);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.subtitle);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.backgroundImage);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.lastUpdated);
        output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.destination);
        output.encodeNullableSerializableElement(serialDesc, 8, TagModel$$serializer.INSTANCE, self.navigationTag);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCardName() {
        return this.cardName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitleImage() {
        return this.titleImage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEndIcon() {
        return this.endIcon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLastUpdated() {
        return this.lastUpdated;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final TagModel getNavigationTag() {
        return this.navigationTag;
    }

    public final EntryPointLockedCardModel copy(String cardName, String title, String titleImage, String endIcon, String subtitle, String backgroundImage, String lastUpdated, C9598e destination, TagModel navigationTag) {
        AbstractC22676k.m65750j(title, "title");
        return new EntryPointLockedCardModel(cardName, title, titleImage, endIcon, subtitle, backgroundImage, lastUpdated, destination, navigationTag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntryPointLockedCardModel)) {
            return false;
        }
        EntryPointLockedCardModel entryPointLockedCardModel = (EntryPointLockedCardModel) other;
        return AbstractC22676k.m65745e(this.cardName, entryPointLockedCardModel.cardName) && AbstractC22676k.m65745e(this.title, entryPointLockedCardModel.title) && AbstractC22676k.m65745e(this.titleImage, entryPointLockedCardModel.titleImage) && AbstractC22676k.m65745e(this.endIcon, entryPointLockedCardModel.endIcon) && AbstractC22676k.m65745e(this.subtitle, entryPointLockedCardModel.subtitle) && AbstractC22676k.m65745e(this.backgroundImage, entryPointLockedCardModel.backgroundImage) && AbstractC22676k.m65745e(this.lastUpdated, entryPointLockedCardModel.lastUpdated) && AbstractC22676k.m65745e(this.destination, entryPointLockedCardModel.destination) && AbstractC22676k.m65745e(this.navigationTag, entryPointLockedCardModel.navigationTag);
    }

    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final String getCardName() {
        return this.cardName;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getEndIcon() {
        return this.endIcon;
    }

    public final String getLastUpdated() {
        return this.lastUpdated;
    }

    public final TagModel getNavigationTag() {
        return this.navigationTag;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleImage() {
        return this.titleImage;
    }

    public int hashCode() {
        String str = this.cardName;
        int iM30450d = AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.title);
        String str2 = this.titleImage;
        int iHashCode = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.endIcon;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.backgroundImage;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.lastUpdated;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode6 = (iHashCode5 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        TagModel tagModel = this.navigationTag;
        return iHashCode6 + (tagModel != null ? tagModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.cardName;
        String str2 = this.title;
        String str3 = this.titleImage;
        String str4 = this.endIcon;
        String str5 = this.subtitle;
        String str6 = this.backgroundImage;
        String str7 = this.lastUpdated;
        C9598e c9598e = this.destination;
        TagModel tagModel = this.navigationTag;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("EntryPointLockedCardModel(cardName=", str, ", title=", str2, ", titleImage=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", endIcon=", str4, ", subtitle=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", backgroundImage=", str6, ", lastUpdated=");
        AbstractC30007c.m91827B(sbM32001t, str7, ", destination=", c9598e, ", navigationTag=");
        sbM32001t.append(tagModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public EntryPointLockedCardModel(String str, String title, String str2, String str3, String str4, String str5, String str6, C9598e c9598e, TagModel tagModel) {
        AbstractC22676k.m65750j(title, "title");
        this.cardName = str;
        this.title = title;
        this.titleImage = str2;
        this.endIcon = str3;
        this.subtitle = str4;
        this.backgroundImage = str5;
        this.lastUpdated = str6;
        this.destination = c9598e;
        this.navigationTag = tagModel;
    }
}
