package j72;

import kd1.AbstractC22403o;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: j72.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b!\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b\"\u0010\u000fR\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\u001e\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\u0017\u0010\u001a¨\u0006#"}, m65681d2 = {"Lj72/c;", "", "Lj72/g;", "screenId", "Lkd1/o;", "image", "", "supertitle", "title", "subtitle", "nextButtonText", "buttonNextId", "<init>", "(Lj72/g;Lkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj72/g;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lj72/g;", "d", "()Lj72/g;", "b", "Lkd1/o;", "()Lkd1/o;", "c", "Ljava/lang/String;", "f", "g", "e", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21398c {

    /* JADX INFO: renamed from: h */
    public static final int f82010h = AbstractC22403o.f87638a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC21402g screenId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String supertitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String nextButtonText;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final EnumC21402g buttonNextId;

    public C21398c(EnumC21402g screenId, AbstractC22403o image, String supertitle, String title, String subtitle, String nextButtonText, EnumC21402g enumC21402g) {
        AbstractC22676k.m65750j(screenId, "screenId");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(supertitle, "supertitle");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(nextButtonText, "nextButtonText");
        this.screenId = screenId;
        this.image = image;
        this.supertitle = supertitle;
        this.title = title;
        this.subtitle = subtitle;
        this.nextButtonText = nextButtonText;
        this.buttonNextId = enumC21402g;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC21402g getButtonNextId() {
        return this.buttonNextId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getNextButtonText() {
        return this.nextButtonText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC21402g getScreenId() {
        return this.screenId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21398c)) {
            return false;
        }
        C21398c c21398c = (C21398c) other;
        return this.screenId == c21398c.screenId && AbstractC22676k.m65745e(this.image, c21398c.image) && AbstractC22676k.m65745e(this.supertitle, c21398c.supertitle) && AbstractC22676k.m65745e(this.title, c21398c.title) && AbstractC22676k.m65745e(this.subtitle, c21398c.subtitle) && AbstractC22676k.m65745e(this.nextButtonText, c21398c.nextButtonText) && this.buttonNextId == c21398c.buttonNextId;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSupertitle() {
        return this.supertitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC30007c.m91833c(this.image, this.screenId.hashCode() * 31, 31), 31, this.supertitle), 31, this.title), 31, this.subtitle), 31, this.nextButtonText);
        EnumC21402g enumC21402g = this.buttonNextId;
        return iM30450d + (enumC21402g == null ? 0 : enumC21402g.hashCode());
    }

    public String toString() {
        EnumC21402g enumC21402g = this.screenId;
        AbstractC22403o abstractC22403o = this.image;
        String str = this.supertitle;
        String str2 = this.title;
        String str3 = this.subtitle;
        String str4 = this.nextButtonText;
        EnumC21402g enumC21402g2 = this.buttonNextId;
        StringBuilder sb4 = new StringBuilder("InformationState(screenId=");
        sb4.append(enumC21402g);
        sb4.append(", image=");
        sb4.append(abstractC22403o);
        sb4.append(", supertitle=");
        AbstractC11266d.m30444B(sb4, str, ", title=", str2, ", subtitle=");
        AbstractC11266d.m30444B(sb4, str3, ", nextButtonText=", str4, ", buttonNextId=");
        sb4.append(enumC21402g2);
        sb4.append(")");
        return sb4.toString();
    }
}
