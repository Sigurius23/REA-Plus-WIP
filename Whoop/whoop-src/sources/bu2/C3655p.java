package bu2;

import com.whoop.data.remote.domain.dto.DoubleRange;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p730qt2.C30619y;

/* JADX INFO: renamed from: bu2.p */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lbu2/p;", "", "Lcom/whoop/data/remote/domain/dto/DoubleRange;", "range", "Lbu2/b0;", "toolTip", "Lqt2/y;", "progressionToolTip", "<init>", "(Lcom/whoop/data/remote/domain/dto/DoubleRange;Lbu2/b0;Lqt2/y;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/data/remote/domain/dto/DoubleRange;", "b", "()Lcom/whoop/data/remote/domain/dto/DoubleRange;", "Lbu2/b0;", "c", "()Lbu2/b0;", "Lqt2/y;", "()Lqt2/y;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3655p {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final DoubleRange range;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C3640b0 toolTip;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C30619y progressionToolTip;

    public C3655p(DoubleRange range, C3640b0 toolTip, C30619y c30619y) {
        AbstractC22676k.m65750j(range, "range");
        AbstractC22676k.m65750j(toolTip, "toolTip");
        this.range = range;
        this.toolTip = toolTip;
        this.progressionToolTip = c30619y;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C30619y getProgressionToolTip() {
        return this.progressionToolTip;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DoubleRange getRange() {
        return this.range;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C3640b0 getToolTip() {
        return this.toolTip;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3655p)) {
            return false;
        }
        C3655p c3655p = (C3655p) other;
        return AbstractC22676k.m65745e(this.range, c3655p.range) && AbstractC22676k.m65745e(this.toolTip, c3655p.toolTip) && AbstractC22676k.m65745e(this.progressionToolTip, c3655p.progressionToolTip);
    }

    public int hashCode() {
        int iHashCode = (this.toolTip.hashCode() + (this.range.hashCode() * 31)) * 31;
        C30619y c30619y = this.progressionToolTip;
        return iHashCode + (c30619y == null ? 0 : c30619y.hashCode());
    }

    public String toString() {
        return "RangeWithTipState(range=" + this.range + ", toolTip=" + this.toolTip + ", progressionToolTip=" + this.progressionToolTip + ")";
    }
}
