package ld0;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ld0.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lld0/i;", "", "Lld0/h;", "type", "", "title", "<init>", "(Lld0/h;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lld0/h;", "b", "()Lld0/h;", "Ljava/lang/String;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23850i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC23849h type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String title;

    public C23850i(EnumC23849h type, String title) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(title, "title");
        this.type = type;
        this.title = title;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC23849h getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23850i)) {
            return false;
        }
        C23850i c23850i = (C23850i) other;
        return this.type == c23850i.type && AbstractC22676k.m65745e(this.title, c23850i.title);
    }

    public int hashCode() {
        return this.title.hashCode() + (this.type.hashCode() * 31);
    }

    public String toString() {
        return "BiomarkersListSortOptionViewState(type=" + this.type + ", title=" + this.title + ")";
    }
}
