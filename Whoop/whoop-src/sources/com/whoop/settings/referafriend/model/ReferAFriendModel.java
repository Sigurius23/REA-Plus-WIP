package com.whoop.settings.referafriend.model;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!J>\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010!¨\u00067"}, m65681d2 = {"Lcom/whoop/settings/referafriend/model/ReferAFriendModel;", "", "Lcom/whoop/settings/referafriend/model/ShareSheetContent;", "shareSheetContent", "Lcom/whoop/settings/referafriend/model/BannerContent;", "bannerContent", "Lcom/whoop/settings/referafriend/model/RafMenuItem;", "rafMenuItem", "Lcom/whoop/settings/referafriend/model/RafHubContent;", "rafHubContent", "<init>", "(Lcom/whoop/settings/referafriend/model/ShareSheetContent;Lcom/whoop/settings/referafriend/model/BannerContent;Lcom/whoop/settings/referafriend/model/RafMenuItem;Lcom/whoop/settings/referafriend/model/RafHubContent;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/settings/referafriend/model/ShareSheetContent;Lcom/whoop/settings/referafriend/model/BannerContent;Lcom/whoop/settings/referafriend/model/RafMenuItem;Lcom/whoop/settings/referafriend/model/RafHubContent;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$settings_release", "(Lcom/whoop/settings/referafriend/model/ReferAFriendModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/settings/referafriend/model/ShareSheetContent;", "component2", "()Lcom/whoop/settings/referafriend/model/BannerContent;", "component3", "()Lcom/whoop/settings/referafriend/model/RafMenuItem;", "component4", "()Lcom/whoop/settings/referafriend/model/RafHubContent;", "copy", "(Lcom/whoop/settings/referafriend/model/ShareSheetContent;Lcom/whoop/settings/referafriend/model/BannerContent;Lcom/whoop/settings/referafriend/model/RafMenuItem;Lcom/whoop/settings/referafriend/model/RafHubContent;)Lcom/whoop/settings/referafriend/model/ReferAFriendModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/settings/referafriend/model/ShareSheetContent;", "getShareSheetContent", "Lcom/whoop/settings/referafriend/model/BannerContent;", "getBannerContent", "Lcom/whoop/settings/referafriend/model/RafMenuItem;", "getRafMenuItem", "Lcom/whoop/settings/referafriend/model/RafHubContent;", "getRafHubContent", "Companion", "$serializer", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ReferAFriendModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("banner_content")
    private final BannerContent bannerContent;

    @SerializedName("raf_hub_content")
    private final RafHubContent rafHubContent;

    @SerializedName("raf_menu_item")
    private final RafMenuItem rafMenuItem;

    @SerializedName("share_sheet_content")
    private final ShareSheetContent shareSheetContent;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/settings/referafriend/model/ReferAFriendModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/settings/referafriend/model/ReferAFriendModel;", "serializer", "()Lwc3/c;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ReferAFriendModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ReferAFriendModel(int i13, ShareSheetContent shareSheetContent, BannerContent bannerContent, RafMenuItem rafMenuItem, RafHubContent rafHubContent, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, ReferAFriendModel$$serializer.INSTANCE.getDescriptor());
        }
        this.shareSheetContent = shareSheetContent;
        this.bannerContent = bannerContent;
        this.rafMenuItem = rafMenuItem;
        this.rafHubContent = rafHubContent;
    }

    public static /* synthetic */ ReferAFriendModel copy$default(ReferAFriendModel referAFriendModel, ShareSheetContent shareSheetContent, BannerContent bannerContent, RafMenuItem rafMenuItem, RafHubContent rafHubContent, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            shareSheetContent = referAFriendModel.shareSheetContent;
        }
        if ((i13 & 2) != 0) {
            bannerContent = referAFriendModel.bannerContent;
        }
        if ((i13 & 4) != 0) {
            rafMenuItem = referAFriendModel.rafMenuItem;
        }
        if ((i13 & 8) != 0) {
            rafHubContent = referAFriendModel.rafHubContent;
        }
        return referAFriendModel.copy(shareSheetContent, bannerContent, rafMenuItem, rafHubContent);
    }

    public static final /* synthetic */ void write$Self$settings_release(ReferAFriendModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, ShareSheetContent$$serializer.INSTANCE, self.shareSheetContent);
        output.encodeNullableSerializableElement(serialDesc, 1, BannerContent$$serializer.INSTANCE, self.bannerContent);
        output.encodeNullableSerializableElement(serialDesc, 2, RafMenuItem$$serializer.INSTANCE, self.rafMenuItem);
        output.encodeNullableSerializableElement(serialDesc, 3, RafHubContent$$serializer.INSTANCE, self.rafHubContent);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ShareSheetContent getShareSheetContent() {
        return this.shareSheetContent;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BannerContent getBannerContent() {
        return this.bannerContent;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final RafMenuItem getRafMenuItem() {
        return this.rafMenuItem;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final RafHubContent getRafHubContent() {
        return this.rafHubContent;
    }

    public final ReferAFriendModel copy(ShareSheetContent shareSheetContent, BannerContent bannerContent, RafMenuItem rafMenuItem, RafHubContent rafHubContent) {
        AbstractC22676k.m65750j(shareSheetContent, "shareSheetContent");
        return new ReferAFriendModel(shareSheetContent, bannerContent, rafMenuItem, rafHubContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReferAFriendModel)) {
            return false;
        }
        ReferAFriendModel referAFriendModel = (ReferAFriendModel) other;
        return AbstractC22676k.m65745e(this.shareSheetContent, referAFriendModel.shareSheetContent) && AbstractC22676k.m65745e(this.bannerContent, referAFriendModel.bannerContent) && AbstractC22676k.m65745e(this.rafMenuItem, referAFriendModel.rafMenuItem) && AbstractC22676k.m65745e(this.rafHubContent, referAFriendModel.rafHubContent);
    }

    public final BannerContent getBannerContent() {
        return this.bannerContent;
    }

    public final RafHubContent getRafHubContent() {
        return this.rafHubContent;
    }

    public final RafMenuItem getRafMenuItem() {
        return this.rafMenuItem;
    }

    public final ShareSheetContent getShareSheetContent() {
        return this.shareSheetContent;
    }

    public int hashCode() {
        int iHashCode = this.shareSheetContent.hashCode() * 31;
        BannerContent bannerContent = this.bannerContent;
        int iHashCode2 = (iHashCode + (bannerContent == null ? 0 : bannerContent.hashCode())) * 31;
        RafMenuItem rafMenuItem = this.rafMenuItem;
        int iHashCode3 = (iHashCode2 + (rafMenuItem == null ? 0 : rafMenuItem.hashCode())) * 31;
        RafHubContent rafHubContent = this.rafHubContent;
        return iHashCode3 + (rafHubContent != null ? rafHubContent.hashCode() : 0);
    }

    public String toString() {
        return "ReferAFriendModel(shareSheetContent=" + this.shareSheetContent + ", bannerContent=" + this.bannerContent + ", rafMenuItem=" + this.rafMenuItem + ", rafHubContent=" + this.rafHubContent + ")";
    }

    public ReferAFriendModel(ShareSheetContent shareSheetContent, BannerContent bannerContent, RafMenuItem rafMenuItem, RafHubContent rafHubContent) {
        AbstractC22676k.m65750j(shareSheetContent, "shareSheetContent");
        this.shareSheetContent = shareSheetContent;
        this.bannerContent = bannerContent;
        this.rafMenuItem = rafMenuItem;
        this.rafHubContent = rafHubContent;
    }
}
