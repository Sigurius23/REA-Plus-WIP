package c41;

import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import java.util.UUID;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: c41.l5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lc41/l5;", "Lm91/u;", "Ljava/util/UUID;", "id", "", "leftIcon", "Lcom/whoop/design/util/TextResource;", "title", "<init>", "(Ljava/util/UUID;ILcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "()Ljava/util/UUID;", "b", "I", "c", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4067l5 implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final UUID id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int leftIcon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource title;

    public C4067l5(UUID id4, int i13, TextResource title) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        this.id = id4;
        this.leftIcon = i13;
        this.title = title;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getLeftIcon() {
        return this.leftIcon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4067l5)) {
            return false;
        }
        C4067l5 c4067l5 = (C4067l5) other;
        return AbstractC22676k.m65745e(this.id, c4067l5.id) && this.leftIcon == c4067l5.leftIcon && AbstractC22676k.m65745e(this.title, c4067l5.title);
    }

    public int hashCode() {
        return this.title.hashCode() + AbstractC11266d.m30448b(this.leftIcon, this.id.hashCode() * 31, 31);
    }

    public String toString() {
        UUID uuid = this.id;
        int i13 = this.leftIcon;
        TextResource textResource = this.title;
        StringBuilder sb4 = new StringBuilder("SupportActionTileViewState(id=");
        sb4.append(uuid);
        sb4.append(", leftIcon=");
        sb4.append(i13);
        sb4.append(", title=");
        return AbstractC30007c.m91841k(sb4, textResource, ")");
    }

    public /* synthetic */ C4067l5(UUID uuid, int i13, TextResource textResource, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, (i14 & 2) != 0 ? EnumC16313m0.WHOOP_HELP.toWhoopIcon() : i13, textResource);
    }
}
