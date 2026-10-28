package ld0;

import c13.AbstractC3855a;
import hy0.C17736e;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: ld0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lld0/b;", "Lm91/u;", "", "id", "Lhy0/e;", "sectionHeader", "", "items", "<init>", "(Ljava/lang/String;Lhy0/e;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lhy0/e;", "()Lhy0/e;", "c", "Ljava/util/List;", "()Ljava/util/List;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23843b implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C17736e sectionHeader;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX WARN: Multi-variable type inference failed */
    public C23843b(String id4, C17736e sectionHeader, List<? extends InterfaceC25312u> items) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(sectionHeader, "sectionHeader");
        AbstractC22676k.m65750j(items, "items");
        this.id = id4;
        this.sectionHeader = sectionHeader;
        this.items = items;
    }

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC25312u> m70050a() {
        return this.items;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C17736e getSectionHeader() {
        return this.sectionHeader;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23843b)) {
            return false;
        }
        C23843b c23843b = (C23843b) other;
        return AbstractC22676k.m65745e(this.id, c23843b.id) && AbstractC22676k.m65745e(this.sectionHeader, c23843b.sectionHeader) && AbstractC22676k.m65745e(this.items, c23843b.items);
    }

    public int hashCode() {
        return this.items.hashCode() + ((this.sectionHeader.hashCode() + (this.id.hashCode() * 31)) * 31);
    }

    public String toString() {
        String str = this.id;
        C17736e c17736e = this.sectionHeader;
        List<InterfaceC25312u> list = this.items;
        StringBuilder sb4 = new StringBuilder("AdvancedLabsRecordingSectionState(id=");
        sb4.append(str);
        sb4.append(", sectionHeader=");
        sb4.append(c17736e);
        sb4.append(", items=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }
}
