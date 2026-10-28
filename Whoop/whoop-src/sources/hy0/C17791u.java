package hy0;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: hy0.u */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0019\u0010!¨\u0006\""}, m65681d2 = {"Lhy0/u;", "Lm91/u;", "", "id", "Lcom/whoop/design/util/TextResource;", "day", "Lhy0/z;", "style", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lhy0/z;Lcom/whoop/navigation/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "c", "Lhy0/z;", "()Lhy0/z;", "d", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17791u implements InterfaceC25312u {

    /* JADX INFO: renamed from: e */
    public static final int f69166e = C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource day;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC17806z style;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C9598e destination;

    public C17791u(String id4, TextResource day, EnumC17806z style, C9598e destination) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(day, "day");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(destination, "destination");
        this.id = id4;
        this.day = day;
        this.style = style;
        this.destination = destination;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getDay() {
        return this.day;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC17806z getStyle() {
        return this.style;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17791u)) {
            return false;
        }
        C17791u c17791u = (C17791u) other;
        return AbstractC22676k.m65745e(this.id, c17791u.id) && AbstractC22676k.m65745e(this.day, c17791u.day) && this.style == c17791u.style && AbstractC22676k.m65745e(this.destination, c17791u.destination);
    }

    public int hashCode() {
        return this.destination.hashCode() + ((this.style.hashCode() + AbstractC31061c.m95625a(this.id.hashCode() * 31, this.day, 31)) * 31);
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.day;
        EnumC17806z enumC17806z = this.style;
        C9598e c9598e = this.destination;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("GoalIndicatorItemState(id=", str, ", day=", textResource, ", style=");
        sbM91847q.append(enumC17806z);
        sbM91847q.append(", destination=");
        sbM91847q.append(c9598e);
        sbM91847q.append(")");
        return sbM91847q.toString();
    }

    public /* synthetic */ C17791u(String str, TextResource textResource, EnumC17806z enumC17806z, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, textResource, enumC17806z, c9598e);
    }
}
