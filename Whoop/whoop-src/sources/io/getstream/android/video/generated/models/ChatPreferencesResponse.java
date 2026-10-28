package io.getstream.android.video.generated.models;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001a\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, m65681d2 = {"Lio/getstream/android/video/generated/models/ChatPreferencesResponse;", "", "channelMentions", "", "defaultPreference", "directMentions", "groupMentions", "hereMentions", "roleMentions", "threadReplies", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannelMentions", "()Ljava/lang/String;", "getDefaultPreference", "getDirectMentions", "getGroupMentions", "getHereMentions", "getRoleMentions", "getThreadReplies", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class ChatPreferencesResponse {
    private final String channelMentions;
    private final String defaultPreference;
    private final String directMentions;
    private final String groupMentions;
    private final String hereMentions;
    private final String roleMentions;
    private final String threadReplies;

    public ChatPreferencesResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ ChatPreferencesResponse copy$default(ChatPreferencesResponse chatPreferencesResponse, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = chatPreferencesResponse.channelMentions;
        }
        if ((i13 & 2) != 0) {
            str2 = chatPreferencesResponse.defaultPreference;
        }
        if ((i13 & 4) != 0) {
            str3 = chatPreferencesResponse.directMentions;
        }
        if ((i13 & 8) != 0) {
            str4 = chatPreferencesResponse.groupMentions;
        }
        if ((i13 & 16) != 0) {
            str5 = chatPreferencesResponse.hereMentions;
        }
        if ((i13 & 32) != 0) {
            str6 = chatPreferencesResponse.roleMentions;
        }
        if ((i13 & 64) != 0) {
            str7 = chatPreferencesResponse.threadReplies;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return chatPreferencesResponse.copy(str, str2, str11, str4, str10, str8, str9);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannelMentions() {
        return this.channelMentions;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDefaultPreference() {
        return this.defaultPreference;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDirectMentions() {
        return this.directMentions;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGroupMentions() {
        return this.groupMentions;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHereMentions() {
        return this.hereMentions;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRoleMentions() {
        return this.roleMentions;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getThreadReplies() {
        return this.threadReplies;
    }

    public final ChatPreferencesResponse copy(@InterfaceC30731q(name = "channel_mentions") String channelMentions, @InterfaceC30731q(name = "default_preference") String defaultPreference, @InterfaceC30731q(name = "direct_mentions") String directMentions, @InterfaceC30731q(name = "group_mentions") String groupMentions, @InterfaceC30731q(name = "here_mentions") String hereMentions, @InterfaceC30731q(name = "role_mentions") String roleMentions, @InterfaceC30731q(name = "thread_replies") String threadReplies) {
        return new ChatPreferencesResponse(channelMentions, defaultPreference, directMentions, groupMentions, hereMentions, roleMentions, threadReplies);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatPreferencesResponse)) {
            return false;
        }
        ChatPreferencesResponse chatPreferencesResponse = (ChatPreferencesResponse) other;
        return AbstractC22676k.m65745e(this.channelMentions, chatPreferencesResponse.channelMentions) && AbstractC22676k.m65745e(this.defaultPreference, chatPreferencesResponse.defaultPreference) && AbstractC22676k.m65745e(this.directMentions, chatPreferencesResponse.directMentions) && AbstractC22676k.m65745e(this.groupMentions, chatPreferencesResponse.groupMentions) && AbstractC22676k.m65745e(this.hereMentions, chatPreferencesResponse.hereMentions) && AbstractC22676k.m65745e(this.roleMentions, chatPreferencesResponse.roleMentions) && AbstractC22676k.m65745e(this.threadReplies, chatPreferencesResponse.threadReplies);
    }

    public final String getChannelMentions() {
        return this.channelMentions;
    }

    public final String getDefaultPreference() {
        return this.defaultPreference;
    }

    public final String getDirectMentions() {
        return this.directMentions;
    }

    public final String getGroupMentions() {
        return this.groupMentions;
    }

    public final String getHereMentions() {
        return this.hereMentions;
    }

    public final String getRoleMentions() {
        return this.roleMentions;
    }

    public final String getThreadReplies() {
        return this.threadReplies;
    }

    public int hashCode() {
        String str = this.channelMentions;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.defaultPreference;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.directMentions;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.groupMentions;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.hereMentions;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.roleMentions;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.threadReplies;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        String str = this.channelMentions;
        String str2 = this.defaultPreference;
        String str3 = this.directMentions;
        String str4 = this.groupMentions;
        String str5 = this.hereMentions;
        String str6 = this.roleMentions;
        String str7 = this.threadReplies;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ChatPreferencesResponse(channelMentions=", str, ", defaultPreference=", str2, ", directMentions=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", groupMentions=", str4, ", hereMentions=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", roleMentions=", str6, ", threadReplies=");
        return AbstractC25012a.m73376i(str7, ")", sbM32001t);
    }

    public ChatPreferencesResponse(@InterfaceC30731q(name = "channel_mentions") String str, @InterfaceC30731q(name = "default_preference") String str2, @InterfaceC30731q(name = "direct_mentions") String str3, @InterfaceC30731q(name = "group_mentions") String str4, @InterfaceC30731q(name = "here_mentions") String str5, @InterfaceC30731q(name = "role_mentions") String str6, @InterfaceC30731q(name = "thread_replies") String str7) {
        this.channelMentions = str;
        this.defaultPreference = str2;
        this.directMentions = str3;
        this.groupMentions = str4;
        this.hereMentions = str5;
        this.roleMentions = str6;
        this.threadReplies = str7;
    }

    public /* synthetic */ ChatPreferencesResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? null : str6, (i13 & 64) != 0 ? null : str7);
    }
}
