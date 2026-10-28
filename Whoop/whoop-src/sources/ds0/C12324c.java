package ds0;

import es0.EnumC13588a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ds0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lds0/c;", "", "", "submissionId", "", "text", "Les0/a;", "renderStyle", "<init>", "(JLjava/lang/String;Les0/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "Ljava/lang/String;", "c", "Les0/a;", "()Les0/a;", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12324c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long submissionId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String text;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC13588a renderStyle;

    public C12324c(long j7, String text, EnumC13588a renderStyle) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(renderStyle, "renderStyle");
        this.submissionId = j7;
        this.text = text;
        this.renderStyle = renderStyle;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC13588a getRenderStyle() {
        return this.renderStyle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getSubmissionId() {
        return this.submissionId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12324c)) {
            return false;
        }
        C12324c c12324c = (C12324c) other;
        return this.submissionId == c12324c.submissionId && AbstractC22676k.m65745e(this.text, c12324c.text) && this.renderStyle == c12324c.renderStyle;
    }

    public int hashCode() {
        return this.renderStyle.hashCode() + AbstractC11266d.m30450d(Long.hashCode(this.submissionId) * 31, 31, this.text);
    }

    public String toString() {
        return "PendingComment(#" + this.submissionId + ", " + this.text.length() + " chars, " + this.renderStyle + ")";
    }

    public /* synthetic */ C12324c(long j7, String str, EnumC13588a enumC13588a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j7, str, (i13 & 4) != 0 ? EnumC13588a.TEXT : enumC13588a);
    }
}
