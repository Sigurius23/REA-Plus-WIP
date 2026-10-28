package io.getstream.chat.android.p226ui.feature.gallery;

import com.whoop.service.network.model.UserState;
import d13.AbstractC11478a;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.User;
import java.util.Date;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\fHÆ\u0003JE\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010 \u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0018¨\u0006%"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;", "", "attachment", "Lio/getstream/chat/android/models/Attachment;", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "createdAt", "Ljava/util/Date;", "messageId", "", "cid", "isMine", "", "<init>", "(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/User;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Z)V", "getAttachment", "()Lio/getstream/chat/android/models/Attachment;", "getUser", "()Lio/getstream/chat/android/models/User;", "getCreatedAt", "()Ljava/util/Date;", "getMessageId", "()Ljava/lang/String;", "getCid", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class AttachmentGalleryItem {
    private final Attachment attachment;
    private final String cid;
    private final Date createdAt;
    private final boolean isMine;
    private final String messageId;
    private final User user;

    public AttachmentGalleryItem(Attachment attachment, User user, Date createdAt, String messageId, String cid, boolean z4) {
        AbstractC22676k.m65750j(attachment, "attachment");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(cid, "cid");
        this.attachment = attachment;
        this.user = user;
        this.createdAt = createdAt;
        this.messageId = messageId;
        this.cid = cid;
        this.isMine = z4;
    }

    public static /* synthetic */ AttachmentGalleryItem copy$default(AttachmentGalleryItem attachmentGalleryItem, Attachment attachment, User user, Date date, String str, String str2, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            attachment = attachmentGalleryItem.attachment;
        }
        if ((i13 & 2) != 0) {
            user = attachmentGalleryItem.user;
        }
        if ((i13 & 4) != 0) {
            date = attachmentGalleryItem.createdAt;
        }
        if ((i13 & 8) != 0) {
            str = attachmentGalleryItem.messageId;
        }
        if ((i13 & 16) != 0) {
            str2 = attachmentGalleryItem.cid;
        }
        if ((i13 & 32) != 0) {
            z4 = attachmentGalleryItem.isMine;
        }
        String str3 = str2;
        boolean z13 = z4;
        return attachmentGalleryItem.copy(attachment, user, date, str, str3, z13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Attachment getAttachment() {
        return this.attachment;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsMine() {
        return this.isMine;
    }

    public final AttachmentGalleryItem copy(Attachment attachment, User user, Date createdAt, String messageId, String cid, boolean isMine) {
        AbstractC22676k.m65750j(attachment, "attachment");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(cid, "cid");
        return new AttachmentGalleryItem(attachment, user, createdAt, messageId, cid, isMine);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttachmentGalleryItem)) {
            return false;
        }
        AttachmentGalleryItem attachmentGalleryItem = (AttachmentGalleryItem) other;
        return AbstractC22676k.m65745e(this.attachment, attachmentGalleryItem.attachment) && AbstractC22676k.m65745e(this.user, attachmentGalleryItem.user) && AbstractC22676k.m65745e(this.createdAt, attachmentGalleryItem.createdAt) && AbstractC22676k.m65745e(this.messageId, attachmentGalleryItem.messageId) && AbstractC22676k.m65745e(this.cid, attachmentGalleryItem.cid) && this.isMine == attachmentGalleryItem.isMine;
    }

    public final Attachment getAttachment() {
        return this.attachment;
    }

    public final String getCid() {
        return this.cid;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final User getUser() {
        return this.user;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isMine) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC38963t7.m124373c(this.createdAt, AbstractC11478a.m30850b(this.user, this.attachment.hashCode() * 31, 31), 31), 31, this.messageId), 31, this.cid);
    }

    public final boolean isMine() {
        return this.isMine;
    }

    public final String toString() {
        Attachment attachment = this.attachment;
        User user = this.user;
        Date date = this.createdAt;
        String str = this.messageId;
        String str2 = this.cid;
        boolean z4 = this.isMine;
        StringBuilder sb4 = new StringBuilder("AttachmentGalleryItem(attachment=");
        sb4.append(attachment);
        sb4.append(", user=");
        sb4.append(user);
        sb4.append(", createdAt=");
        sb4.append(date);
        sb4.append(", messageId=");
        sb4.append(str);
        sb4.append(", cid=");
        return AbstractC21702c.m61137h(sb4, str2, ", isMine=", z4, ")");
    }
}
