package io.getstream.chat.android.client.api2.model.dto;

import d13.AbstractC11478a;
import java.util.List;
import jh3.AbstractC21702c;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0017Jj\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006'"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;", "", "action", "", "original_text", "text_harms", "", "image_harms", "blocklist_matched", "semantic_filter_matched", "platform_circumvented", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getAction", "()Ljava/lang/String;", "getOriginal_text", "getText_harms", "()Ljava/util/List;", "getImage_harms", "getBlocklist_matched", "getSemantic_filter_matched", "getPlatform_circumvented", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;", "equals", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class DownstreamModerationDto {
    private final String action;
    private final String blocklist_matched;
    private final List<String> image_harms;
    private final String original_text;
    private final Boolean platform_circumvented;
    private final String semantic_filter_matched;
    private final List<String> text_harms;

    public DownstreamModerationDto(String action, String original_text, List<String> list, List<String> list2, String str, String str2, Boolean bool) {
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(original_text, "original_text");
        this.action = action;
        this.original_text = original_text;
        this.text_harms = list;
        this.image_harms = list2;
        this.blocklist_matched = str;
        this.semantic_filter_matched = str2;
        this.platform_circumvented = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DownstreamModerationDto copy$default(DownstreamModerationDto downstreamModerationDto, String str, String str2, List list, List list2, String str3, String str4, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = downstreamModerationDto.action;
        }
        if ((i13 & 2) != 0) {
            str2 = downstreamModerationDto.original_text;
        }
        if ((i13 & 4) != 0) {
            list = downstreamModerationDto.text_harms;
        }
        if ((i13 & 8) != 0) {
            list2 = downstreamModerationDto.image_harms;
        }
        if ((i13 & 16) != 0) {
            str3 = downstreamModerationDto.blocklist_matched;
        }
        if ((i13 & 32) != 0) {
            str4 = downstreamModerationDto.semantic_filter_matched;
        }
        if ((i13 & 64) != 0) {
            bool = downstreamModerationDto.platform_circumvented;
        }
        String str5 = str4;
        Boolean bool2 = bool;
        String str6 = str3;
        List list3 = list;
        return downstreamModerationDto.copy(str, str2, list3, list2, str6, str5, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOriginal_text() {
        return this.original_text;
    }

    public final List<String> component3() {
        return this.text_harms;
    }

    public final List<String> component4() {
        return this.image_harms;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBlocklist_matched() {
        return this.blocklist_matched;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSemantic_filter_matched() {
        return this.semantic_filter_matched;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getPlatform_circumvented() {
        return this.platform_circumvented;
    }

    public final DownstreamModerationDto copy(String action, String original_text, List<String> text_harms, List<String> image_harms, String blocklist_matched, String semantic_filter_matched, Boolean platform_circumvented) {
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(original_text, "original_text");
        return new DownstreamModerationDto(action, original_text, text_harms, image_harms, blocklist_matched, semantic_filter_matched, platform_circumvented);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamModerationDto)) {
            return false;
        }
        DownstreamModerationDto downstreamModerationDto = (DownstreamModerationDto) other;
        return AbstractC22676k.m65745e(this.action, downstreamModerationDto.action) && AbstractC22676k.m65745e(this.original_text, downstreamModerationDto.original_text) && AbstractC22676k.m65745e(this.text_harms, downstreamModerationDto.text_harms) && AbstractC22676k.m65745e(this.image_harms, downstreamModerationDto.image_harms) && AbstractC22676k.m65745e(this.blocklist_matched, downstreamModerationDto.blocklist_matched) && AbstractC22676k.m65745e(this.semantic_filter_matched, downstreamModerationDto.semantic_filter_matched) && AbstractC22676k.m65745e(this.platform_circumvented, downstreamModerationDto.platform_circumvented);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getBlocklist_matched() {
        return this.blocklist_matched;
    }

    public final List<String> getImage_harms() {
        return this.image_harms;
    }

    public final String getOriginal_text() {
        return this.original_text;
    }

    public final Boolean getPlatform_circumvented() {
        return this.platform_circumvented;
    }

    public final String getSemantic_filter_matched() {
        return this.semantic_filter_matched;
    }

    public final List<String> getText_harms() {
        return this.text_harms;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.action.hashCode() * 31, 31, this.original_text);
        List<String> list = this.text_harms;
        int iHashCode = (iM30450d + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.image_harms;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.blocklist_matched;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.semantic_filter_matched;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.platform_circumvented;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.action;
        String str2 = this.original_text;
        List<String> list = this.text_harms;
        List<String> list2 = this.image_harms;
        String str3 = this.blocklist_matched;
        String str4 = this.semantic_filter_matched;
        Boolean bool = this.platform_circumvented;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DownstreamModerationDto(action=", str, ", original_text=", str2, ", text_harms=");
        AbstractC21702c.m61148s(sbM32001t, list, ", image_harms=", list2, ", blocklist_matched=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", semantic_filter_matched=", str4, ", platform_circumvented=");
        return AbstractC11478a.m30858j(sbM32001t, bool, ")");
    }
}
