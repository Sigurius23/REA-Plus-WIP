package v71;

import com.whoop.navigation.C9598e;
import p000.AbstractC11266d;
import p291l0.InterfaceC22965i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: v71.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\r¨\u0006\u001e"}, m65681d2 = {"Lv71/c;", "", "Ll0/i;", "alignment", "Lcom/whoop/navigation/e;", "ctaActionArgument", "", "ctaIcon", "", "ctaTitle", "<init>", "(Ll0/i;Lcom/whoop/navigation/e;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ll0/i;", "()Ll0/i;", "b", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "c", "I", "d", "Ljava/lang/String;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35762c {

    /* JADX INFO: renamed from: e */
    public static final int f152104e = C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC22965i alignment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C9598e ctaActionArgument;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int ctaIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String ctaTitle;

    public C35762c(InterfaceC22965i alignment, C9598e c9598e, int i13, String ctaTitle) {
        AbstractC22676k.m65750j(alignment, "alignment");
        AbstractC22676k.m65750j(ctaTitle, "ctaTitle");
        this.alignment = alignment;
        this.ctaActionArgument = c9598e;
        this.ctaIcon = i13;
        this.ctaTitle = ctaTitle;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC22965i getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C9598e getCtaActionArgument() {
        return this.ctaActionArgument;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCtaIcon() {
        return this.ctaIcon;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCtaTitle() {
        return this.ctaTitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35762c)) {
            return false;
        }
        C35762c c35762c = (C35762c) other;
        return AbstractC22676k.m65745e(this.alignment, c35762c.alignment) && AbstractC22676k.m65745e(this.ctaActionArgument, c35762c.ctaActionArgument) && this.ctaIcon == c35762c.ctaIcon && AbstractC22676k.m65745e(this.ctaTitle, c35762c.ctaTitle);
    }

    public int hashCode() {
        int iHashCode = this.alignment.hashCode() * 31;
        C9598e c9598e = this.ctaActionArgument;
        return this.ctaTitle.hashCode() + AbstractC11266d.m30448b(this.ctaIcon, (iHashCode + (c9598e == null ? 0 : c9598e.hashCode())) * 31, 31);
    }

    public String toString() {
        InterfaceC22965i interfaceC22965i = this.alignment;
        C9598e c9598e = this.ctaActionArgument;
        int i13 = this.ctaIcon;
        String str = this.ctaTitle;
        StringBuilder sb4 = new StringBuilder("ItemsCardFooterState(alignment=");
        sb4.append(interfaceC22965i);
        sb4.append(", ctaActionArgument=");
        sb4.append(c9598e);
        sb4.append(", ctaIcon=");
        return AbstractC38963t7.m124376f(i13, ", ctaTitle=", str, ")", sb4);
    }
}
