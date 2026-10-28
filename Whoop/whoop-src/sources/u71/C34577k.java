package u71;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: u71.k */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lu71/k;", "", "", "noteIcon", "Lcom/whoop/design/util/TextResource;", "noteText", "<init>", "(ILcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34577k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int noteIcon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource noteText;

    public C34577k(int i13, TextResource noteText) {
        AbstractC22676k.m65750j(noteText, "noteText");
        this.noteIcon = i13;
        this.noteText = noteText;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getNoteIcon() {
        return this.noteIcon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getNoteText() {
        return this.noteText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34577k)) {
            return false;
        }
        C34577k c34577k = (C34577k) other;
        return this.noteIcon == c34577k.noteIcon && AbstractC22676k.m65745e(this.noteText, c34577k.noteText);
    }

    public int hashCode() {
        return this.noteText.hashCode() + (Integer.hashCode(this.noteIcon) * 31);
    }

    public String toString() {
        return "JournalEntrypointNote(noteIcon=" + this.noteIcon + ", noteText=" + this.noteText + ")";
    }
}
