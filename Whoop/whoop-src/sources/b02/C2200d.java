package b02;

import c13.AbstractC3855a;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: b02.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ4\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\rR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lb02/d;", "", "", "id", "sectionType", "", "Lm91/u;", "items", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lb02/d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", "getSectionType", "c", "Ljava/util/List;", "()Ljava/util/List;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C2200d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String sectionType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX WARN: Multi-variable type inference failed */
    public C2200d(String id4, String sectionType, List<? extends InterfaceC25312u> items) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(sectionType, "sectionType");
        AbstractC22676k.m65750j(items, "items");
        this.id = id4;
        this.sectionType = sectionType;
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C2200d m6997b(C2200d c2200d, String str, String str2, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c2200d.id;
        }
        if ((i13 & 2) != 0) {
            str2 = c2200d.sectionType;
        }
        if ((i13 & 4) != 0) {
            list = c2200d.items;
        }
        return c2200d.m6998a(str, str2, list);
    }

    /* JADX INFO: renamed from: a */
    public final C2200d m6998a(String id4, String sectionType, List<? extends InterfaceC25312u> items) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(sectionType, "sectionType");
        AbstractC22676k.m65750j(items, "items");
        return new C2200d(id4, sectionType, items);
    }

    /* JADX INFO: renamed from: c */
    public final List<InterfaceC25312u> m6999c() {
        return this.items;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2200d)) {
            return false;
        }
        C2200d c2200d = (C2200d) other;
        return AbstractC22676k.m65745e(this.id, c2200d.id) && AbstractC22676k.m65745e(this.sectionType, c2200d.sectionType) && AbstractC22676k.m65745e(this.items, c2200d.items);
    }

    public int hashCode() {
        return this.items.hashCode() + AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.sectionType);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.sectionType;
        return AbstractC3855a.m11829m(AbstractC11895b.m32001t("PdpSectionViewState(id=", str, ", sectionType=", str2, ", items="), this.items, ")");
    }
}
