package oa2;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import kd1.AbstractC22403o;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: oa2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b\"\u0010!R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b\u0017\u0010!¨\u0006#"}, m65681d2 = {"Loa2/a;", "", "Lkd1/o;", "icon", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "Loa2/b;", "joinCta", "switchCta", "cancelCta", "<init>", "(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Loa2/b;Loa2/b;Loa2/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/o;", "b", "()Lkd1/o;", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "c", "d", "Loa2/b;", "()Loa2/b;", "e", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27753a {

    /* JADX INFO: renamed from: g */
    public static final int f111922g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C27754b joinCta;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C27754b switchCta;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C27754b cancelCta;

    static {
        int i13 = C9598e.f28134d;
        int i14 = TextResource.$stable;
        f111922g = i13 | i13 | i14 | i13 | i14 | i14 | i14 | i14 | AbstractC22403o.f87638a;
    }

    public C27753a(AbstractC22403o abstractC22403o, TextResource title, TextResource subtitle, C27754b joinCta, C27754b c27754b, C27754b cancelCta) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(joinCta, "joinCta");
        AbstractC22676k.m65750j(cancelCta, "cancelCta");
        this.icon = abstractC22403o;
        this.title = title;
        this.subtitle = subtitle;
        this.joinCta = joinCta;
        this.switchCta = c27754b;
        this.cancelCta = cancelCta;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C27754b getCancelCta() {
        return this.cancelCta;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC22403o getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C27754b getJoinCta() {
        return this.joinCta;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C27754b getSwitchCta() {
        return this.switchCta;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27753a)) {
            return false;
        }
        C27753a c27753a = (C27753a) other;
        return AbstractC22676k.m65745e(this.icon, c27753a.icon) && AbstractC22676k.m65745e(this.title, c27753a.title) && AbstractC22676k.m65745e(this.subtitle, c27753a.subtitle) && AbstractC22676k.m65745e(this.joinCta, c27753a.joinCta) && AbstractC22676k.m65745e(this.switchCta, c27753a.switchCta) && AbstractC22676k.m65745e(this.cancelCta, c27753a.cancelCta);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        AbstractC22403o abstractC22403o = this.icon;
        int iHashCode = (this.joinCta.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a((abstractC22403o == null ? 0 : abstractC22403o.hashCode()) * 31, this.title, 31), this.subtitle, 31)) * 31;
        C27754b c27754b = this.switchCta;
        return this.cancelCta.hashCode() + ((iHashCode + (c27754b != null ? c27754b.hashCode() : 0)) * 31);
    }

    public String toString() {
        AbstractC22403o abstractC22403o = this.icon;
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        C27754b c27754b = this.joinCta;
        C27754b c27754b2 = this.switchCta;
        C27754b c27754b3 = this.cancelCta;
        StringBuilder sbM114683k = AbstractC36095b.m114683k("HeaderViewState(icon=", textResource, abstractC22403o, ", title=", ", subtitle=");
        sbM114683k.append(textResource2);
        sbM114683k.append(", joinCta=");
        sbM114683k.append(c27754b);
        sbM114683k.append(", switchCta=");
        sbM114683k.append(c27754b2);
        sbM114683k.append(", cancelCta=");
        sbM114683k.append(c27754b3);
        sbM114683k.append(")");
        return sbM114683k.toString();
    }
}
