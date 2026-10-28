package dn1;

import com.whoop.homecustomization.domain.models.CustomizeOverviewResponse;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: dn1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Ldn1/e;", "", "Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;", "response", "Ldn1/i;", "selectedValue", "<init>", "(Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;Ldn1/i;)V", "b", "(Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;Ldn1/i;)Ldn1/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;", "()Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;", "Ldn1/i;", "d", "()Ldn1/i;", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12221e implements InterfaceC12219c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final CustomizeOverviewResponse response;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C12225i selectedValue;

    public C12221e(CustomizeOverviewResponse response, C12225i c12225i) {
        AbstractC22676k.m65750j(response, "response");
        this.response = response;
        this.selectedValue = c12225i;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C12221e m33955c(C12221e c12221e, CustomizeOverviewResponse customizeOverviewResponse, C12225i c12225i, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            customizeOverviewResponse = c12221e.response;
        }
        if ((i13 & 2) != 0) {
            c12225i = c12221e.selectedValue;
        }
        return c12221e.m33957b(customizeOverviewResponse, c12225i);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final CustomizeOverviewResponse getResponse() {
        return this.response;
    }

    /* JADX INFO: renamed from: b */
    public final C12221e m33957b(CustomizeOverviewResponse response, C12225i selectedValue) {
        AbstractC22676k.m65750j(response, "response");
        return new C12221e(response, selectedValue);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C12225i getSelectedValue() {
        return this.selectedValue;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12221e)) {
            return false;
        }
        C12221e c12221e = (C12221e) other;
        return AbstractC22676k.m65745e(this.response, c12221e.response) && AbstractC22676k.m65745e(this.selectedValue, c12221e.selectedValue);
    }

    public int hashCode() {
        int iHashCode = this.response.hashCode() * 31;
        C12225i c12225i = this.selectedValue;
        return iHashCode + (c12225i == null ? 0 : c12225i.hashCode());
    }

    public String toString() {
        return "Result(response=" + this.response + ", selectedValue=" + this.selectedValue + ")";
    }

    public /* synthetic */ C12221e(CustomizeOverviewResponse customizeOverviewResponse, C12225i c12225i, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(customizeOverviewResponse, (i13 & 2) != 0 ? null : c12225i);
    }
}
