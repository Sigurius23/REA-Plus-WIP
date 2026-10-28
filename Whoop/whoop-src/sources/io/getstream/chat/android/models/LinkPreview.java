package io.getstream.chat.android.models;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/models/LinkPreview;", "", "originUrl", "", "attachment", "Lio/getstream/chat/android/models/Attachment;", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/models/Attachment;)V", "getOriginUrl", "()Ljava/lang/String;", "getAttachment", "()Lio/getstream/chat/android/models/Attachment;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class LinkPreview {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final LinkPreview EMPTY = new LinkPreview("", new Attachment(null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, 1048575, null));
    private final Attachment attachment;
    private final String originUrl;

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/models/LinkPreview$Companion;", "", "<init>", "()V", "EMPTY", "Lio/getstream/chat/android/models/LinkPreview;", "getEMPTY", "()Lio/getstream/chat/android/models/LinkPreview;", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LinkPreview getEMPTY() {
            return LinkPreview.EMPTY;
        }

        private Companion() {
        }
    }

    public LinkPreview(String originUrl, Attachment attachment) {
        AbstractC22676k.m65750j(originUrl, "originUrl");
        AbstractC22676k.m65750j(attachment, "attachment");
        this.originUrl = originUrl;
        this.attachment = attachment;
    }

    public static /* synthetic */ LinkPreview copy$default(LinkPreview linkPreview, String str, Attachment attachment, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = linkPreview.originUrl;
        }
        if ((i13 & 2) != 0) {
            attachment = linkPreview.attachment;
        }
        return linkPreview.copy(str, attachment);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOriginUrl() {
        return this.originUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Attachment getAttachment() {
        return this.attachment;
    }

    public final LinkPreview copy(String originUrl, Attachment attachment) {
        AbstractC22676k.m65750j(originUrl, "originUrl");
        AbstractC22676k.m65750j(attachment, "attachment");
        return new LinkPreview(originUrl, attachment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkPreview)) {
            return false;
        }
        LinkPreview linkPreview = (LinkPreview) other;
        return AbstractC22676k.m65745e(this.originUrl, linkPreview.originUrl) && AbstractC22676k.m65745e(this.attachment, linkPreview.attachment);
    }

    public final Attachment getAttachment() {
        return this.attachment;
    }

    public final String getOriginUrl() {
        return this.originUrl;
    }

    public int hashCode() {
        return this.attachment.hashCode() + (this.originUrl.hashCode() * 31);
    }

    public String toString() {
        return "LinkPreview(originUrl=" + this.originUrl + ", attachment=" + this.attachment + ")";
    }
}
