package c41;

import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import jh3.AbstractC21702c;
import kd1.AbstractC22403o;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: c41.o */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010$\u001a\u0004\b\u001e\u0010%¨\u0006&"}, m65681d2 = {"Lc41/o;", "", "", "isEmpty", "Ly81/f;", "backgroundColor", "Lkd1/o;", "icon", "Lcom/whoop/design/util/TextResource;", "secondaryText", "Lgz0/m0;", "secondaryIcon", "<init>", "(ZLy81/f;Lkd1/o;Lcom/whoop/design/util/TextResource;Lgz0/m0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "e", "()Z", "b", "Ly81/f;", "()Ly81/f;", "c", "Lkd1/o;", "()Lkd1/o;", "d", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "Lgz0/m0;", "()Lgz0/m0;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4082o {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isEmpty;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC39333f backgroundColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC22403o icon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource secondaryText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC16313m0 secondaryIcon;

    public C4082o(boolean z4, EnumC39333f backgroundColor, AbstractC22403o icon, TextResource textResource, EnumC16313m0 enumC16313m0) {
        AbstractC22676k.m65750j(backgroundColor, "backgroundColor");
        AbstractC22676k.m65750j(icon, "icon");
        this.isEmpty = z4;
        this.backgroundColor = backgroundColor;
        this.icon = icon;
        this.secondaryText = textResource;
        this.secondaryIcon = enumC16313m0;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC39333f getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC22403o getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC16313m0 getSecondaryIcon() {
        return this.secondaryIcon;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSecondaryText() {
        return this.secondaryText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsEmpty() {
        return this.isEmpty;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4082o)) {
            return false;
        }
        C4082o c4082o = (C4082o) other;
        return this.isEmpty == c4082o.isEmpty && this.backgroundColor == c4082o.backgroundColor && AbstractC22676k.m65745e(this.icon, c4082o.icon) && AbstractC22676k.m65745e(this.secondaryText, c4082o.secondaryText) && this.secondaryIcon == c4082o.secondaryIcon;
    }

    public int hashCode() {
        int iM91833c = AbstractC30007c.m91833c(this.icon, AbstractC21702c.m61132c(this.backgroundColor, Boolean.hashCode(this.isEmpty) * 31, 31), 31);
        TextResource textResource = this.secondaryText;
        int iHashCode = (iM91833c + (textResource == null ? 0 : textResource.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.secondaryIcon;
        return iHashCode + (enumC16313m0 != null ? enumC16313m0.hashCode() : 0);
    }

    public String toString() {
        boolean z4 = this.isEmpty;
        EnumC39333f enumC39333f = this.backgroundColor;
        AbstractC22403o abstractC22403o = this.icon;
        TextResource textResource = this.secondaryText;
        EnumC16313m0 enumC16313m0 = this.secondaryIcon;
        StringBuilder sb4 = new StringBuilder("ActivityTilePillState(isEmpty=");
        sb4.append(z4);
        sb4.append(", backgroundColor=");
        sb4.append(enumC39333f);
        sb4.append(", icon=");
        AbstractC13673n.m38549A(sb4, abstractC22403o, ", secondaryText=", textResource, ", secondaryIcon=");
        sb4.append(enumC16313m0);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C4082o(boolean z4, EnumC39333f enumC39333f, AbstractC22403o abstractC22403o, TextResource textResource, EnumC16313m0 enumC16313m0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? EnumC39333f.BLACK_20 : enumC39333f, abstractC22403o, (i13 & 8) != 0 ? null : textResource, (i13 & 16) != 0 ? null : enumC16313m0);
    }
}
