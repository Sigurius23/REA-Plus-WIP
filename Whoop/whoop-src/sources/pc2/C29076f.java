package pc2;

import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qc2.AbstractC30221c;

/* JADX INFO: renamed from: pc2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lpc2/f;", "", "", "title", "", "Lqc2/c;", "regulatoryLabels", "<init>", "(ILjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/util/List;", "()Ljava/util/List;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29076f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<AbstractC30221c> regulatoryLabels;

    /* JADX WARN: Multi-variable type inference failed */
    public C29076f(int i13, List<? extends AbstractC30221c> regulatoryLabels) {
        AbstractC22676k.m65750j(regulatoryLabels, "regulatoryLabels");
        this.title = i13;
        this.regulatoryLabels = regulatoryLabels;
    }

    /* JADX INFO: renamed from: a */
    public final List<AbstractC30221c> m88399a() {
        return this.regulatoryLabels;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29076f)) {
            return false;
        }
        C29076f c29076f = (C29076f) other;
        return this.title == c29076f.title && AbstractC22676k.m65745e(this.regulatoryLabels, c29076f.regulatoryLabels);
    }

    public int hashCode() {
        return this.regulatoryLabels.hashCode() + (Integer.hashCode(this.title) * 31);
    }

    public String toString() {
        return "RegulatoryLabelsViewState(title=" + this.title + ", regulatoryLabels=" + this.regulatoryLabels + ")";
    }
}
