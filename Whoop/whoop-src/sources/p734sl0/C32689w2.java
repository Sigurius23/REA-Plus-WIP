package p734sl0;

import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: sl0.w2 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, m65681d2 = {"Lsl0/w2;", "", "", "shouldInvokeCallback", "", "previewContent", "messageId", "wasTextCutoff", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "Ljava/lang/String;", "d", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32689w2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean shouldInvokeCallback;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String previewContent;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String messageId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean wasTextCutoff;

    public C32689w2(boolean z4, String previewContent, String messageId, boolean z13) {
        AbstractC22676k.m65750j(previewContent, "previewContent");
        AbstractC22676k.m65750j(messageId, "messageId");
        this.shouldInvokeCallback = z4;
        this.previewContent = previewContent;
        this.messageId = messageId;
        this.wasTextCutoff = z13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPreviewContent() {
        return this.previewContent;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getShouldInvokeCallback() {
        return this.shouldInvokeCallback;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getWasTextCutoff() {
        return this.wasTextCutoff;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32689w2)) {
            return false;
        }
        C32689w2 c32689w2 = (C32689w2) other;
        return this.shouldInvokeCallback == c32689w2.shouldInvokeCallback && AbstractC22676k.m65745e(this.previewContent, c32689w2.previewContent) && AbstractC22676k.m65745e(this.messageId, c32689w2.messageId) && this.wasTextCutoff == c32689w2.wasTextCutoff;
    }

    public int hashCode() {
        return Boolean.hashCode(this.wasTextCutoff) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(Boolean.hashCode(this.shouldInvokeCallback) * 31, 31, this.previewContent), 31, this.messageId);
    }

    public String toString() {
        boolean z4 = this.shouldInvokeCallback;
        String str = this.previewContent;
        return AbstractC21702c.m61137h(AbstractC13673n.m38567n("PreviewUpdateResult(shouldInvokeCallback=", ", previewContent=", str, ", messageId=", z4), this.messageId, ", wasTextCutoff=", this.wasTextCutoff, ")");
    }

    public /* synthetic */ C32689w2(boolean z4, String str, String str2, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, str, str2, (i13 & 8) != 0 ? false : z13);
    }
}
