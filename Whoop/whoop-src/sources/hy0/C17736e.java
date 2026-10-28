package hy0;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: hy0.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lhy0/e;", "Lm91/u;", "Lhy0/g;", "dividerType", "Lhy0/f;", "dividerTextPosition", "Lcom/whoop/design/util/TextResource;", "title", "<init>", "(Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhy0/g;", "b", "()Lhy0/g;", "Lhy0/f;", "()Lhy0/f;", "c", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17736e implements InterfaceC25312u {

    /* JADX INFO: renamed from: d */
    public static final int f68939d = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC17744g dividerType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC17740f dividerTextPosition;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource title;

    public C17736e(EnumC17744g dividerType, EnumC17740f dividerTextPosition, TextResource title) {
        AbstractC22676k.m65750j(dividerType, "dividerType");
        AbstractC22676k.m65750j(dividerTextPosition, "dividerTextPosition");
        AbstractC22676k.m65750j(title, "title");
        this.dividerType = dividerType;
        this.dividerTextPosition = dividerTextPosition;
        this.title = title;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC17740f getDividerTextPosition() {
        return this.dividerTextPosition;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC17744g getDividerType() {
        return this.dividerType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17736e)) {
            return false;
        }
        C17736e c17736e = (C17736e) other;
        return this.dividerType == c17736e.dividerType && this.dividerTextPosition == c17736e.dividerTextPosition && AbstractC22676k.m65745e(this.title, c17736e.title);
    }

    public int hashCode() {
        return this.title.hashCode() + ((this.dividerTextPosition.hashCode() + (this.dividerType.hashCode() * 31)) * 31);
    }

    public String toString() {
        EnumC17744g enumC17744g = this.dividerType;
        EnumC17740f enumC17740f = this.dividerTextPosition;
        TextResource textResource = this.title;
        StringBuilder sb4 = new StringBuilder("DividerState(dividerType=");
        sb4.append(enumC17744g);
        sb4.append(", dividerTextPosition=");
        sb4.append(enumC17740f);
        sb4.append(", title=");
        return AbstractC30007c.m91841k(sb4, textResource, ")");
    }

    public /* synthetic */ C17736e(EnumC17744g enumC17744g, EnumC17740f enumC17740f, TextResource textResource, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? EnumC17744g.SOLID : enumC17744g, (i13 & 2) != 0 ? EnumC17740f.LEFT : enumC17740f, (i13 & 4) != 0 ? new TextResource.C8691e("") : textResource);
    }
}
