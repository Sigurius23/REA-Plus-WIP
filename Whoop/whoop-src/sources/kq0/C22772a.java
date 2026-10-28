package kq0;

import io.getstream.chat.android.models.Attachment;
import java.util.List;
import l83.C23465k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kq0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lkq0/a;", "", "", "Lio/getstream/chat/android/models/Attachment;", "attachments", "Ll83/k;", "", "header", "<init>", "(Ljava/util/List;Ll83/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ll83/k;", "()Ll83/k;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22772a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<Attachment> attachments;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C23465k header;

    public C22772a(List<Attachment> attachments, C23465k c23465k) {
        AbstractC22676k.m65750j(attachments, "attachments");
        this.attachments = attachments;
        this.header = c23465k;
    }

    /* JADX INFO: renamed from: a */
    public final List<Attachment> m65978a() {
        return this.attachments;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C23465k getHeader() {
        return this.header;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22772a)) {
            return false;
        }
        C22772a c22772a = (C22772a) other;
        return AbstractC22676k.m65745e(this.attachments, c22772a.attachments) && AbstractC22676k.m65745e(this.header, c22772a.header);
    }

    public int hashCode() {
        int iHashCode = this.attachments.hashCode() * 31;
        C23465k c23465k = this.header;
        return iHashCode + (c23465k == null ? 0 : c23465k.hashCode());
    }

    public String toString() {
        return "ChatImageViewState(attachments=" + this.attachments + ", header=" + this.header + ")";
    }
}
