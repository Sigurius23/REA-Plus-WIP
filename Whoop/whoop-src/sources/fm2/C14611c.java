package fm2;

import com.whoop.trendsminiarch.domain.models.TrendsMiniArchModels;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: fm2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lfm2/c;", "", "Lfm2/a;", "currentDialogType", "Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;", "response", "<init>", "(Lfm2/a;Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfm2/a;", "()Lfm2/a;", "b", "Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;", "()Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;", "trends-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14611c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14609a currentDialogType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TrendsMiniArchModels response;

    public C14611c(InterfaceC14609a interfaceC14609a, TrendsMiniArchModels trendsMiniArchModels) {
        this.currentDialogType = interfaceC14609a;
        this.response = trendsMiniArchModels;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC14609a getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TrendsMiniArchModels getResponse() {
        return this.response;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14611c)) {
            return false;
        }
        C14611c c14611c = (C14611c) other;
        return AbstractC22676k.m65745e(this.currentDialogType, c14611c.currentDialogType) && AbstractC22676k.m65745e(this.response, c14611c.response);
    }

    public int hashCode() {
        InterfaceC14609a interfaceC14609a = this.currentDialogType;
        int iHashCode = (interfaceC14609a == null ? 0 : interfaceC14609a.hashCode()) * 31;
        TrendsMiniArchModels trendsMiniArchModels = this.response;
        return iHashCode + (trendsMiniArchModels != null ? trendsMiniArchModels.hashCode() : 0);
    }

    public String toString() {
        return "TrendsMiniArchDomainState(currentDialogType=" + this.currentDialogType + ", response=" + this.response + ")";
    }

    public /* synthetic */ C14611c(InterfaceC14609a interfaceC14609a, TrendsMiniArchModels trendsMiniArchModels, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : interfaceC14609a, (i13 & 2) != 0 ? null : trendsMiniArchModels);
    }
}
