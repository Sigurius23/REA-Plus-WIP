package iq0;

import android.graphics.Bitmap;
import io.getstream.chat.android.p226ui.common.state.messages.composer.AttachmentMetaData;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: iq0.r */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Liq0/r;", "", "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;", "streamMetaData", "Landroid/graphics/Bitmap;", "dataWidget", "<init>", "(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;Landroid/graphics/Bitmap;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;", "b", "()Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20839r {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AttachmentMetaData streamMetaData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Bitmap dataWidget;

    public C20839r(AttachmentMetaData attachmentMetaData, Bitmap bitmap) {
        this.streamMetaData = attachmentMetaData;
        this.dataWidget = bitmap;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Bitmap getDataWidget() {
        return this.dataWidget;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AttachmentMetaData getStreamMetaData() {
        return this.streamMetaData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20839r)) {
            return false;
        }
        C20839r c20839r = (C20839r) other;
        return AbstractC22676k.m65745e(this.streamMetaData, c20839r.streamMetaData) && AbstractC22676k.m65745e(this.dataWidget, c20839r.dataWidget);
    }

    public int hashCode() {
        AttachmentMetaData attachmentMetaData = this.streamMetaData;
        int iHashCode = (attachmentMetaData == null ? 0 : attachmentMetaData.hashCode()) * 31;
        Bitmap bitmap = this.dataWidget;
        return iHashCode + (bitmap != null ? bitmap.hashCode() : 0);
    }

    public String toString() {
        return "CustomAttachmentMetaData(streamMetaData=" + this.streamMetaData + ", dataWidget=" + this.dataWidget + ")";
    }

    public /* synthetic */ C20839r(AttachmentMetaData attachmentMetaData, Bitmap bitmap, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : attachmentMetaData, (i13 & 2) != 0 ? null : bitmap);
    }
}
