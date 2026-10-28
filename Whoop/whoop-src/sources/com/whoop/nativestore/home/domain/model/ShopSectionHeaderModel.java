package com.whoop.nativestore.home.domain.model;

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
import q83.AbstractC30060g;
import rx0.C31901f;
import te0.AbstractC33745d;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=>Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBu\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'Jz\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b4\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b5\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b6\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b7\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b8\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b9\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010'¨\u0006?"}, m65681d2 = {"Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;", "", "", "title", "subtitle", "icon", "style", "typography", "titleAlignment", "subtitleTypography", "subtitleLocation", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$native_store_release", "(Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "getIcon", "getStyle", "getTypography", "getTitleAlignment", "getSubtitleTypography", "getSubtitleLocation", "Lcom/whoop/navigation/e;", "getDestination", "Companion", "$serializer", "a", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ShopSectionHeaderModel {
    private final C9598e destination;
    private final String icon;
    private final String style;
    private final String subtitle;
    private final String subtitleLocation;
    private final String subtitleTypography;
    private final String title;
    private final String titleAlignment;
    private final String typography;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C31901f(18))};

    /* JADX INFO: renamed from: com.whoop.nativestore.home.domain.model.ShopSectionHeaderModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;", "serializer", "()Lwc3/c;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ShopSectionHeaderModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ShopSectionHeaderModel(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, ShopSectionHeaderModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        if ((i13 & 2) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str2;
        }
        if ((i13 & 4) == 0) {
            this.icon = null;
        } else {
            this.icon = str3;
        }
        if ((i13 & 8) == 0) {
            this.style = null;
        } else {
            this.style = str4;
        }
        if ((i13 & 16) == 0) {
            this.typography = null;
        } else {
            this.typography = str5;
        }
        if ((i13 & 32) == 0) {
            this.titleAlignment = null;
        } else {
            this.titleAlignment = str6;
        }
        if ((i13 & 64) == 0) {
            this.subtitleTypography = null;
        } else {
            this.subtitleTypography = str7;
        }
        if ((i13 & 128) == 0) {
            this.subtitleLocation = null;
        } else {
            this.subtitleLocation = str8;
        }
        if ((i13 & 256) == 0) {
            this.destination = null;
        } else {
            this.destination = c9598e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ ShopSectionHeaderModel copy$default(ShopSectionHeaderModel shopSectionHeaderModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = shopSectionHeaderModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = shopSectionHeaderModel.subtitle;
        }
        if ((i13 & 4) != 0) {
            str3 = shopSectionHeaderModel.icon;
        }
        if ((i13 & 8) != 0) {
            str4 = shopSectionHeaderModel.style;
        }
        if ((i13 & 16) != 0) {
            str5 = shopSectionHeaderModel.typography;
        }
        if ((i13 & 32) != 0) {
            str6 = shopSectionHeaderModel.titleAlignment;
        }
        if ((i13 & 64) != 0) {
            str7 = shopSectionHeaderModel.subtitleTypography;
        }
        if ((i13 & 128) != 0) {
            str8 = shopSectionHeaderModel.subtitleLocation;
        }
        if ((i13 & 256) != 0) {
            c9598e = shopSectionHeaderModel.destination;
        }
        String str9 = str8;
        C9598e c9598e2 = c9598e;
        String str10 = str6;
        String str11 = str7;
        String str12 = str5;
        String str13 = str3;
        return shopSectionHeaderModel.copy(str, str2, str13, str4, str12, str10, str11, str9, c9598e2);
    }

    public static final /* synthetic */ void write$Self$native_store_release(ShopSectionHeaderModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.subtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.icon != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.icon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.style != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.style);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.typography != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.typography);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.titleAlignment != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.titleAlignment);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.subtitleTypography != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.subtitleTypography);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.subtitleLocation != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.subtitleLocation);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 8) && self.destination == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.destination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTypography() {
        return this.typography;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTitleAlignment() {
        return this.titleAlignment;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSubtitleTypography() {
        return this.subtitleTypography;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSubtitleLocation() {
        return this.subtitleLocation;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public final ShopSectionHeaderModel copy(String title, String subtitle, String icon, String style, String typography, String titleAlignment, String subtitleTypography, String subtitleLocation, C9598e destination) {
        AbstractC22676k.m65750j(title, "title");
        return new ShopSectionHeaderModel(title, subtitle, icon, style, typography, titleAlignment, subtitleTypography, subtitleLocation, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopSectionHeaderModel)) {
            return false;
        }
        ShopSectionHeaderModel shopSectionHeaderModel = (ShopSectionHeaderModel) other;
        return AbstractC22676k.m65745e(this.title, shopSectionHeaderModel.title) && AbstractC22676k.m65745e(this.subtitle, shopSectionHeaderModel.subtitle) && AbstractC22676k.m65745e(this.icon, shopSectionHeaderModel.icon) && AbstractC22676k.m65745e(this.style, shopSectionHeaderModel.style) && AbstractC22676k.m65745e(this.typography, shopSectionHeaderModel.typography) && AbstractC22676k.m65745e(this.titleAlignment, shopSectionHeaderModel.titleAlignment) && AbstractC22676k.m65745e(this.subtitleTypography, shopSectionHeaderModel.subtitleTypography) && AbstractC22676k.m65745e(this.subtitleLocation, shopSectionHeaderModel.subtitleLocation) && AbstractC22676k.m65745e(this.destination, shopSectionHeaderModel.destination);
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getSubtitleLocation() {
        return this.subtitleLocation;
    }

    public final String getSubtitleTypography() {
        return this.subtitleTypography;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleAlignment() {
        return this.titleAlignment;
    }

    public final String getTypography() {
        return this.typography;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.style;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.typography;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.titleAlignment;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.subtitleTypography;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.subtitleLocation;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        C9598e c9598e = this.destination;
        return iHashCode8 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.icon;
        String str4 = this.style;
        String str5 = this.typography;
        String str6 = this.titleAlignment;
        String str7 = this.subtitleTypography;
        String str8 = this.subtitleLocation;
        C9598e c9598e = this.destination;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ShopSectionHeaderModel(title=", str, ", subtitle=", str2, ", icon=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", style=", str4, ", typography=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", titleAlignment=", str6, ", subtitleTypography=");
        AbstractC11266d.m30444B(sbM32001t, str7, ", subtitleLocation=", str8, ", destination=");
        return AbstractC33745d.m106656o(sbM32001t, c9598e, ")");
    }

    public ShopSectionHeaderModel(String title, String str, String str2, String str3, String str4, String str5, String str6, String str7, C9598e c9598e) {
        AbstractC22676k.m65750j(title, "title");
        this.title = title;
        this.subtitle = str;
        this.icon = str2;
        this.style = str3;
        this.typography = str4;
        this.titleAlignment = str5;
        this.subtitleTypography = str6;
        this.subtitleLocation = str7;
        this.destination = c9598e;
    }

    public /* synthetic */ ShopSectionHeaderModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? null : str6, (i13 & 64) != 0 ? null : str7, (i13 & 128) != 0 ? null : str8, (i13 & 256) != 0 ? null : c9598e);
    }
}
