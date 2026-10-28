package f01;

import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: f01.h0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lf01/h0;", "Lm91/u;", "", "Lf01/e0;", "contentBlocks", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13864h0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C13855e0> contentBlocks;

    public C13864h0(List<C13855e0> contentBlocks) {
        AbstractC22676k.m65750j(contentBlocks, "contentBlocks");
        this.contentBlocks = contentBlocks;
    }

    /* JADX INFO: renamed from: a */
    public final List<C13855e0> m39307a() {
        return this.contentBlocks;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C13864h0) && AbstractC22676k.m65745e(this.contentBlocks, ((C13864h0) other).contentBlocks);
    }

    public int hashCode() {
        return this.contentBlocks.hashCode();
    }

    public String toString() {
        return AbstractC33745d.m106654m("ContentBlockListCardViewState(contentBlocks=", ")", this.contentBlocks);
    }
}
