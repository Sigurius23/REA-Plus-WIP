package s51;

import gz0.EnumC16313m0;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: s51.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0012\u0010\n¨\u0006\u0019"}, m65681d2 = {"Ls51/e;", "", "Lgz0/m0;", "infoIcon", "", "infoTitle", "infoDescription", "<init>", "(Lgz0/m0;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgz0/m0;", "b", "()Lgz0/m0;", "Ljava/lang/String;", "getInfoTitle", "c", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32208e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC16313m0 infoIcon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String infoTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String infoDescription;

    public C32208e(EnumC16313m0 enumC16313m0, String infoTitle, String infoDescription) {
        AbstractC22676k.m65750j(infoTitle, "infoTitle");
        AbstractC22676k.m65750j(infoDescription, "infoDescription");
        this.infoIcon = enumC16313m0;
        this.infoTitle = infoTitle;
        this.infoDescription = infoDescription;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getInfoDescription() {
        return this.infoDescription;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC16313m0 getInfoIcon() {
        return this.infoIcon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32208e)) {
            return false;
        }
        C32208e c32208e = (C32208e) other;
        return this.infoIcon == c32208e.infoIcon && AbstractC22676k.m65745e(this.infoTitle, c32208e.infoTitle) && AbstractC22676k.m65745e(this.infoDescription, c32208e.infoDescription);
    }

    public int hashCode() {
        EnumC16313m0 enumC16313m0 = this.infoIcon;
        return this.infoDescription.hashCode() + AbstractC11266d.m30450d((enumC16313m0 == null ? 0 : enumC16313m0.hashCode()) * 31, 31, this.infoTitle);
    }

    public String toString() {
        EnumC16313m0 enumC16313m0 = this.infoIcon;
        String str = this.infoTitle;
        String str2 = this.infoDescription;
        StringBuilder sb4 = new StringBuilder("InfoViewState(infoIcon=");
        sb4.append(enumC16313m0);
        sb4.append(", infoTitle=");
        sb4.append(str);
        sb4.append(", infoDescription=");
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }
}
