package cj1;

import kd1.AbstractC22403o;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: cj1.o */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u001a\u0010\f¨\u0006\u001b"}, m65681d2 = {"Lcj1/o;", "", "", "text", "Lkd1/o;", "image", "pill", "<init>", "(Ljava/lang/String;Lkd1/o;Ljava/lang/String;)V", "a", "(Ljava/lang/String;Lkd1/o;Ljava/lang/String;)Lcj1/o;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "Lkd1/o;", "c", "()Lkd1/o;", "d", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4759o {

    /* JADX INFO: renamed from: d */
    public static final int f19617d = AbstractC22403o.f87638a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String pill;

    public C4759o(String text, AbstractC22403o image, String str) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(image, "image");
        this.text = text;
        this.image = image;
        this.pill = str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C4759o m14997b(C4759o c4759o, String str, AbstractC22403o abstractC22403o, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c4759o.text;
        }
        if ((i13 & 2) != 0) {
            abstractC22403o = c4759o.image;
        }
        if ((i13 & 4) != 0) {
            str2 = c4759o.pill;
        }
        return c4759o.m14998a(str, abstractC22403o, str2);
    }

    /* JADX INFO: renamed from: a */
    public final C4759o m14998a(String text, AbstractC22403o image, String pill) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(image, "image");
        return new C4759o(text, image, pill);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPill() {
        return this.pill;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4759o)) {
            return false;
        }
        C4759o c4759o = (C4759o) other;
        return AbstractC22676k.m65745e(this.text, c4759o.text) && AbstractC22676k.m65745e(this.image, c4759o.image) && AbstractC22676k.m65745e(this.pill, c4759o.pill);
    }

    public int hashCode() {
        int iM91833c = AbstractC30007c.m91833c(this.image, this.text.hashCode() * 31, 31);
        String str = this.pill;
        return iM91833c + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.text;
        AbstractC22403o abstractC22403o = this.image;
        String str2 = this.pill;
        StringBuilder sb4 = new StringBuilder("HorizontalRecordsTileBodyContentState(text=");
        sb4.append(str);
        sb4.append(", image=");
        sb4.append(abstractC22403o);
        sb4.append(", pill=");
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }

    public /* synthetic */ C4759o(String str, AbstractC22403o abstractC22403o, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? AbstractC22403o.b.f87641b : abstractC22403o, (i13 & 4) != 0 ? null : str2);
    }
}
