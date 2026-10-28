package qm2;

import com.whoop.domain.model.WhoopStrapInfo;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import st0.EnumC32978v;

/* JADX INFO: renamed from: qm2.t */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lqm2/t;", "Lqm2/l;", "Lcom/whoop/domain/model/WhoopStrapInfo;", "strapInfo", "Lst0/v;", "strapGen", "<init>", "(Lcom/whoop/domain/model/WhoopStrapInfo;Lst0/v;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/domain/model/WhoopStrapInfo;", "b", "()Lcom/whoop/domain/model/WhoopStrapInfo;", "Lst0/v;", "()Lst0/v;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30503t extends AbstractC30495l {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final WhoopStrapInfo strapInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC32978v strapGen;

    public C30503t(WhoopStrapInfo whoopStrapInfo, EnumC32978v enumC32978v) {
        super(null);
        this.strapInfo = whoopStrapInfo;
        this.strapGen = enumC32978v;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC32978v getStrapGen() {
        return this.strapGen;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final WhoopStrapInfo getStrapInfo() {
        return this.strapInfo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30503t)) {
            return false;
        }
        C30503t c30503t = (C30503t) other;
        return AbstractC22676k.m65745e(this.strapInfo, c30503t.strapInfo) && this.strapGen == c30503t.strapGen;
    }

    public int hashCode() {
        WhoopStrapInfo whoopStrapInfo = this.strapInfo;
        int iHashCode = (whoopStrapInfo == null ? 0 : whoopStrapInfo.hashCode()) * 31;
        EnumC32978v enumC32978v = this.strapGen;
        return iHashCode + (enumC32978v != null ? enumC32978v.hashCode() : 0);
    }

    public String toString() {
        return "StrapConnectedEvent(strapInfo=" + this.strapInfo + ", strapGen=" + this.strapGen + ")";
    }
}
