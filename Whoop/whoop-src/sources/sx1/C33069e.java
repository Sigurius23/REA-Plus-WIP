package sx1;

import com.whoop.membership.reactivationmodal.domain.models.ReactivationModalModel;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: sx1.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lsx1/e;", "", "Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalModel;", "model", "", "Lsx1/b;", "noShowScreenList", "<init>", "(Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalModel;Ljava/util/List;)V", "a", "(Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalModel;Ljava/util/List;)Lsx1/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalModel;", "c", "()Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalModel;", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33069e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ReactivationModalModel model;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<EnumC33066b> noShowScreenList;

    /* JADX WARN: Multi-variable type inference failed */
    public C33069e(ReactivationModalModel reactivationModalModel, List<? extends EnumC33066b> noShowScreenList) {
        AbstractC22676k.m65750j(noShowScreenList, "noShowScreenList");
        this.model = reactivationModalModel;
        this.noShowScreenList = noShowScreenList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C33069e m104728b(C33069e c33069e, ReactivationModalModel reactivationModalModel, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            reactivationModalModel = c33069e.model;
        }
        if ((i13 & 2) != 0) {
            list = c33069e.noShowScreenList;
        }
        return c33069e.m104729a(reactivationModalModel, list);
    }

    /* JADX INFO: renamed from: a */
    public final C33069e m104729a(ReactivationModalModel model, List<? extends EnumC33066b> noShowScreenList) {
        AbstractC22676k.m65750j(noShowScreenList, "noShowScreenList");
        return new C33069e(model, noShowScreenList);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ReactivationModalModel getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: d */
    public final List<EnumC33066b> m104731d() {
        return this.noShowScreenList;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33069e)) {
            return false;
        }
        C33069e c33069e = (C33069e) other;
        return AbstractC22676k.m65745e(this.model, c33069e.model) && AbstractC22676k.m65745e(this.noShowScreenList, c33069e.noShowScreenList);
    }

    public int hashCode() {
        ReactivationModalModel reactivationModalModel = this.model;
        return this.noShowScreenList.hashCode() + ((reactivationModalModel == null ? 0 : reactivationModalModel.hashCode()) * 31);
    }

    public String toString() {
        return "ReactivationModalFlowData(model=" + this.model + ", noShowScreenList=" + this.noShowScreenList + ")";
    }
}
