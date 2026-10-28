package h81;

import gz0.EnumC16313m0;
import hy0.C17750h1;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p736sz0.C33169c0;

/* JADX INFO: renamed from: h81.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b\u001e\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%¨\u0006&"}, m65681d2 = {"Lh81/c;", "Lm91/u;", "Lkd1/o;", "image", "Lgz0/m0;", "icon", "Lsz0/c0;", "title", "subtitle", "Lhy0/h1;", "tag", "<init>", "(Lkd1/o;Lgz0/m0;Lsz0/c0;Lsz0/c0;Lhy0/h1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/o;", "b", "()Lkd1/o;", "Lgz0/m0;", "()Lgz0/m0;", "c", "Lsz0/c0;", "f", "()Lsz0/c0;", "d", "e", "Lhy0/h1;", "()Lhy0/h1;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17010c implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C33169c0 title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C33169c0 subtitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C17750h1 tag;

    public C17010c(AbstractC22403o abstractC22403o, EnumC16313m0 enumC16313m0, C33169c0 title, C33169c0 subtitle, C17750h1 c17750h1) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        this.image = abstractC22403o;
        this.icon = enumC16313m0;
        this.title = title;
        this.subtitle = subtitle;
        this.tag = c17750h1;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C33169c0 getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C17750h1 getTag() {
        return this.tag;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17010c)) {
            return false;
        }
        C17010c c17010c = (C17010c) other;
        return AbstractC22676k.m65745e(this.image, c17010c.image) && this.icon == c17010c.icon && AbstractC22676k.m65745e(this.title, c17010c.title) && AbstractC22676k.m65745e(this.subtitle, c17010c.subtitle) && AbstractC22676k.m65745e(this.tag, c17010c.tag);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C33169c0 getTitle() {
        return this.title;
    }

    public int hashCode() {
        AbstractC22403o abstractC22403o = this.image;
        int iHashCode = (abstractC22403o == null ? 0 : abstractC22403o.hashCode()) * 31;
        EnumC16313m0 enumC16313m0 = this.icon;
        int iHashCode2 = (this.subtitle.hashCode() + ((this.title.hashCode() + ((iHashCode + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31)) * 31)) * 31;
        C17750h1 c17750h1 = this.tag;
        return iHashCode2 + (c17750h1 != null ? c17750h1.hashCode() : 0);
    }

    public String toString() {
        return "RewardItemViewState(image=" + this.image + ", icon=" + this.icon + ", title=" + this.title + ", subtitle=" + this.subtitle + ", tag=" + this.tag + ")";
    }
}
