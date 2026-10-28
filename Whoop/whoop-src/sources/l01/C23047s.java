package l01;

import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import jh3.AbstractC21702c;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: l01.s */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b\u001f\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010'\u001a\u0004\b\u0019\u0010(¨\u0006)"}, m65681d2 = {"Ll01/s;", "Lm91/u;", "", "title", "Lgz0/m0;", "endIcon", "Lkd1/o;", "titleImage", "sideImage", "Ll01/t;", "style", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Lgz0/m0;Lkd1/o;Lkd1/o;Ll01/t;Lcom/whoop/navigation/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "Lgz0/m0;", "()Lgz0/m0;", "c", "Lkd1/o;", "g", "()Lkd1/o;", "d", "e", "Ll01/t;", "()Ll01/t;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23047s implements InterfaceC25312u {

    /* JADX INFO: renamed from: g */
    public static final int f90894g = C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16313m0 endIcon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC22403o titleImage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC22403o sideImage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC23048t style;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C9598e destination;

    public C23047s(String title, EnumC16313m0 enumC16313m0, AbstractC22403o titleImage, AbstractC22403o sideImage, EnumC23048t enumC23048t, C9598e c9598e) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(titleImage, "titleImage");
        AbstractC22676k.m65750j(sideImage, "sideImage");
        this.title = title;
        this.endIcon = enumC16313m0;
        this.titleImage = titleImage;
        this.sideImage = sideImage;
        this.style = enumC23048t;
        this.destination = c9598e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC16313m0 getEndIcon() {
        return this.endIcon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC22403o getSideImage() {
        return this.sideImage;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC23048t getStyle() {
        return this.style;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23047s)) {
            return false;
        }
        C23047s c23047s = (C23047s) other;
        return AbstractC22676k.m65745e(this.title, c23047s.title) && this.endIcon == c23047s.endIcon && AbstractC22676k.m65745e(this.titleImage, c23047s.titleImage) && AbstractC22676k.m65745e(this.sideImage, c23047s.sideImage) && this.style == c23047s.style && AbstractC22676k.m65745e(this.destination, c23047s.destination);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final AbstractC22403o getTitleImage() {
        return this.titleImage;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        EnumC16313m0 enumC16313m0 = this.endIcon;
        int iM91833c = AbstractC30007c.m91833c(this.sideImage, AbstractC30007c.m91833c(this.titleImage, (iHashCode + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31, 31), 31);
        EnumC23048t enumC23048t = this.style;
        int iHashCode2 = (iM91833c + (enumC23048t == null ? 0 : enumC23048t.hashCode())) * 31;
        C9598e c9598e = this.destination;
        return iHashCode2 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        EnumC16313m0 enumC16313m0 = this.endIcon;
        AbstractC22403o abstractC22403o = this.titleImage;
        AbstractC22403o abstractC22403o2 = this.sideImage;
        EnumC23048t enumC23048t = this.style;
        C9598e c9598e = this.destination;
        StringBuilder sbM61141l = AbstractC21702c.m61141l("UpsellCardSmallState(title=", str, ", endIcon=", enumC16313m0, ", titleImage=");
        sbM61141l.append(abstractC22403o);
        sbM61141l.append(", sideImage=");
        sbM61141l.append(abstractC22403o2);
        sbM61141l.append(", style=");
        sbM61141l.append(enumC23048t);
        sbM61141l.append(", destination=");
        sbM61141l.append(c9598e);
        sbM61141l.append(")");
        return sbM61141l.toString();
    }
}
