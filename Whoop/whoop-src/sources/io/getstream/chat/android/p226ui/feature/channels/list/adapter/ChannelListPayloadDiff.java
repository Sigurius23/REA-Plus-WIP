package io.getstream.chat.android.p226ui.feature.channels.list.adapter;

import ih0.AbstractC18489d0;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0018\u001a\u00020\u0003J\u0011\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0000H\u0086\u0002J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003Jc\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006*"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;", "", "nameChanged", "", "avatarViewChanged", "usersChanged", "lastMessageChanged", "readStateChanged", "unreadCountChanged", "extraDataChanged", "typingUsersChanged", "draftMessageChanged", "<init>", "(ZZZZZZZZZ)V", "getNameChanged", "()Z", "getAvatarViewChanged", "getUsersChanged", "getLastMessageChanged", "getReadStateChanged", "getUnreadCountChanged", "getExtraDataChanged", "getTypingUsersChanged", "getDraftMessageChanged", "hasDifference", "plus", "other", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ChannelListPayloadDiff {
    private final boolean avatarViewChanged;
    private final boolean draftMessageChanged;
    private final boolean extraDataChanged;
    private final boolean lastMessageChanged;
    private final boolean nameChanged;
    private final boolean readStateChanged;
    private final boolean typingUsersChanged;
    private final boolean unreadCountChanged;
    private final boolean usersChanged;

    public ChannelListPayloadDiff(boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24) {
        this.nameChanged = z4;
        this.avatarViewChanged = z13;
        this.usersChanged = z14;
        this.lastMessageChanged = z15;
        this.readStateChanged = z16;
        this.unreadCountChanged = z17;
        this.extraDataChanged = z18;
        this.typingUsersChanged = z19;
        this.draftMessageChanged = z24;
    }

    public static ChannelListPayloadDiff copy$default(ChannelListPayloadDiff channelListPayloadDiff, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = channelListPayloadDiff.nameChanged;
        }
        if ((i13 & 2) != 0) {
            z13 = channelListPayloadDiff.avatarViewChanged;
        }
        if ((i13 & 4) != 0) {
            z14 = channelListPayloadDiff.usersChanged;
        }
        if ((i13 & 8) != 0) {
            z15 = channelListPayloadDiff.lastMessageChanged;
        }
        if ((i13 & 16) != 0) {
            z16 = channelListPayloadDiff.readStateChanged;
        }
        if ((i13 & 32) != 0) {
            z17 = channelListPayloadDiff.unreadCountChanged;
        }
        if ((i13 & 64) != 0) {
            z18 = channelListPayloadDiff.extraDataChanged;
        }
        if ((i13 & 128) != 0) {
            z19 = channelListPayloadDiff.typingUsersChanged;
        }
        if ((i13 & 256) != 0) {
            z24 = channelListPayloadDiff.draftMessageChanged;
        }
        boolean z25 = z24;
        channelListPayloadDiff.getClass();
        boolean z26 = z19;
        boolean z27 = z17;
        boolean z28 = z18;
        boolean z29 = z16;
        boolean z34 = z14;
        return new ChannelListPayloadDiff(z4, z13, z34, z15, z29, z27, z28, z26, z25);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getNameChanged() {
        return this.nameChanged;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getAvatarViewChanged() {
        return this.avatarViewChanged;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getUsersChanged() {
        return this.usersChanged;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getLastMessageChanged() {
        return this.lastMessageChanged;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getReadStateChanged() {
        return this.readStateChanged;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getUnreadCountChanged() {
        return this.unreadCountChanged;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getExtraDataChanged() {
        return this.extraDataChanged;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getTypingUsersChanged() {
        return this.typingUsersChanged;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getDraftMessageChanged() {
        return this.draftMessageChanged;
    }

    public final ChannelListPayloadDiff copy(boolean nameChanged, boolean avatarViewChanged, boolean usersChanged, boolean lastMessageChanged, boolean readStateChanged, boolean unreadCountChanged, boolean extraDataChanged, boolean typingUsersChanged, boolean draftMessageChanged) {
        return new ChannelListPayloadDiff(nameChanged, avatarViewChanged, usersChanged, lastMessageChanged, readStateChanged, unreadCountChanged, extraDataChanged, typingUsersChanged, draftMessageChanged);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelListPayloadDiff)) {
            return false;
        }
        ChannelListPayloadDiff channelListPayloadDiff = (ChannelListPayloadDiff) other;
        return this.nameChanged == channelListPayloadDiff.nameChanged && this.avatarViewChanged == channelListPayloadDiff.avatarViewChanged && this.usersChanged == channelListPayloadDiff.usersChanged && this.lastMessageChanged == channelListPayloadDiff.lastMessageChanged && this.readStateChanged == channelListPayloadDiff.readStateChanged && this.unreadCountChanged == channelListPayloadDiff.unreadCountChanged && this.extraDataChanged == channelListPayloadDiff.extraDataChanged && this.typingUsersChanged == channelListPayloadDiff.typingUsersChanged && this.draftMessageChanged == channelListPayloadDiff.draftMessageChanged;
    }

    public final boolean getAvatarViewChanged() {
        return this.avatarViewChanged;
    }

    public final boolean getDraftMessageChanged() {
        return this.draftMessageChanged;
    }

    public final boolean getExtraDataChanged() {
        return this.extraDataChanged;
    }

    public final boolean getLastMessageChanged() {
        return this.lastMessageChanged;
    }

    public final boolean getNameChanged() {
        return this.nameChanged;
    }

    public final boolean getReadStateChanged() {
        return this.readStateChanged;
    }

    public final boolean getTypingUsersChanged() {
        return this.typingUsersChanged;
    }

    public final boolean getUnreadCountChanged() {
        return this.unreadCountChanged;
    }

    public final boolean getUsersChanged() {
        return this.usersChanged;
    }

    public final boolean hasDifference() {
        return this.nameChanged | this.avatarViewChanged | this.usersChanged | this.lastMessageChanged | this.readStateChanged | this.unreadCountChanged | this.extraDataChanged | this.typingUsersChanged | this.draftMessageChanged;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.draftMessageChanged) + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(Boolean.hashCode(this.nameChanged) * 31, 31, this.avatarViewChanged), 31, this.usersChanged), 31, this.lastMessageChanged), 31, this.readStateChanged), 31, this.unreadCountChanged), 31, this.extraDataChanged), 31, this.typingUsersChanged);
    }

    public final ChannelListPayloadDiff plus(ChannelListPayloadDiff other) {
        AbstractC22676k.m65750j(other, "other");
        return new ChannelListPayloadDiff(this.nameChanged || other.nameChanged, this.avatarViewChanged || other.avatarViewChanged, this.usersChanged || other.usersChanged, this.lastMessageChanged || other.lastMessageChanged, this.readStateChanged || other.readStateChanged, this.unreadCountChanged || other.unreadCountChanged, this.extraDataChanged || other.extraDataChanged, this.typingUsersChanged || other.typingUsersChanged, this.draftMessageChanged || other.draftMessageChanged);
    }

    public final String toString() {
        boolean z4 = this.nameChanged;
        boolean z13 = this.avatarViewChanged;
        boolean z14 = this.usersChanged;
        boolean z15 = this.lastMessageChanged;
        boolean z16 = this.readStateChanged;
        boolean z17 = this.unreadCountChanged;
        boolean z18 = this.extraDataChanged;
        boolean z19 = this.typingUsersChanged;
        boolean z24 = this.draftMessageChanged;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("ChannelListPayloadDiff(nameChanged=", ", avatarViewChanged=", ", usersChanged=", z4, z13);
        AbstractC38963t7.m124392v(sbM32002u, z14, ", lastMessageChanged=", z15, ", readStateChanged=");
        AbstractC38963t7.m124392v(sbM32002u, z16, ", unreadCountChanged=", z17, ", extraDataChanged=");
        AbstractC38963t7.m124392v(sbM32002u, z18, ", typingUsersChanged=", z19, ", draftMessageChanged=");
        return AbstractC18489d0.m53372m(sbM32002u, z24, ")");
    }
}
