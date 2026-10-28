package jh0;

import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: jh0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Ljh0/c;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "", "startIcon", "Lcom/whoop/design/models/modal/AnyModal;", "modal", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/models/modal/AnyModal;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Lcom/whoop/design/models/modal/AnyModal;", "()Lcom/whoop/design/models/modal/AnyModal;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21695c implements InterfaceC25312u {

    /* JADX INFO: renamed from: d */
    public static final int f83292d = AnyModal.$stable | TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Integer startIcon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AnyModal modal;

    public C21695c(TextResource title, Integer num, AnyModal modal) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(modal, "modal");
        this.title = title;
        this.startIcon = num;
        this.modal = modal;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AnyModal getModal() {
        return this.modal;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getStartIcon() {
        return this.startIcon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21695c)) {
            return false;
        }
        C21695c c21695c = (C21695c) other;
        return AbstractC22676k.m65745e(this.title, c21695c.title) && AbstractC22676k.m65745e(this.startIcon, c21695c.startIcon) && AbstractC22676k.m65745e(this.modal, c21695c.modal);
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        Integer num = this.startIcon;
        return this.modal.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public String toString() {
        return "HealthSnapshotTileViewState(title=" + this.title + ", startIcon=" + this.startIcon + ", modal=" + this.modal + ")";
    }
}
