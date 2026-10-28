package bt1;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: bt1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0017\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lbt1/f;", "", "Lcom/whoop/design/util/TextResource;", "tileLabel", "", "caretIcon", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Lcom/whoop/design/util/TextResource;ILcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "I", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3625f {

    /* JADX INFO: renamed from: d */
    public static final int f14771d = C9598e.f28134d | TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource tileLabel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int caretIcon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C9598e destination;

    public C3625f(TextResource tileLabel, int i13, C9598e c9598e) {
        AbstractC22676k.m65750j(tileLabel, "tileLabel");
        this.tileLabel = tileLabel;
        this.caretIcon = i13;
        this.destination = c9598e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCaretIcon() {
        return this.caretIcon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTileLabel() {
        return this.tileLabel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3625f)) {
            return false;
        }
        C3625f c3625f = (C3625f) other;
        return AbstractC22676k.m65745e(this.tileLabel, c3625f.tileLabel) && this.caretIcon == c3625f.caretIcon && AbstractC22676k.m65745e(this.destination, c3625f.destination);
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.caretIcon, this.tileLabel.hashCode() * 31, 31);
        C9598e c9598e = this.destination;
        return iM30448b + (c9598e == null ? 0 : c9598e.hashCode());
    }

    public String toString() {
        TextResource textResource = this.tileLabel;
        int i13 = this.caretIcon;
        C9598e c9598e = this.destination;
        StringBuilder sb4 = new StringBuilder("TileItemViewState(tileLabel=");
        sb4.append(textResource);
        sb4.append(", caretIcon=");
        sb4.append(i13);
        sb4.append(", destination=");
        return AbstractC33745d.m106656o(sb4, c9598e, ")");
    }
}
