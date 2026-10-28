package u50;

import androidx.core.app.NotificationCompat;
import com.whoop.access.omronauth.domain.models.OmronAuthModel;
import com.whoop.design.models.TitleSubTitleModel;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.FeatureListModel;
import com.whoop.design.models.items.ImageUrlModel;
import com.whoop.design.models.items.NavigationBarModel;
import com.whoop.navigation.C9598e;
import ih0.AbstractC18489d0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: u50.b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lu50/b;", "", "Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;", "model", "Lu50/e;", NotificationCompat.CATEGORY_STATUS, "", "exchangeInFlight", "<init>", "(Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;Lu50/e;Z)V", "a", "(Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;Lu50/e;Z)Lu50/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;", "d", "()Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;", "b", "Lu50/e;", "e", "()Lu50/e;", "c", "Z", "()Z", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34538b {

    /* JADX INFO: renamed from: d */
    public static final int f145173d = ((((C9598e.f28134d | CardButtonModel.$stable) | FeatureListModel.$stable) | TitleSubTitleModel.$stable) | ImageUrlModel.$stable) | NavigationBarModel.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final OmronAuthModel model;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34541e status;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean exchangeInFlight;

    public C34538b(OmronAuthModel omronAuthModel, InterfaceC34541e status, boolean z4) {
        AbstractC22676k.m65750j(status, "status");
        this.model = omronAuthModel;
        this.status = status;
        this.exchangeInFlight = z4;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C34538b m109137b(C34538b c34538b, OmronAuthModel omronAuthModel, InterfaceC34541e interfaceC34541e, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            omronAuthModel = c34538b.model;
        }
        if ((i13 & 2) != 0) {
            interfaceC34541e = c34538b.status;
        }
        if ((i13 & 4) != 0) {
            z4 = c34538b.exchangeInFlight;
        }
        return c34538b.m109138a(omronAuthModel, interfaceC34541e, z4);
    }

    /* JADX INFO: renamed from: a */
    public final C34538b m109138a(OmronAuthModel model, InterfaceC34541e status, boolean exchangeInFlight) {
        AbstractC22676k.m65750j(status, "status");
        return new C34538b(model, status, exchangeInFlight);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getExchangeInFlight() {
        return this.exchangeInFlight;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final OmronAuthModel getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC34541e getStatus() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34538b)) {
            return false;
        }
        C34538b c34538b = (C34538b) other;
        return AbstractC22676k.m65745e(this.model, c34538b.model) && AbstractC22676k.m65745e(this.status, c34538b.status) && this.exchangeInFlight == c34538b.exchangeInFlight;
    }

    public int hashCode() {
        OmronAuthModel omronAuthModel = this.model;
        return Boolean.hashCode(this.exchangeInFlight) + ((this.status.hashCode() + ((omronAuthModel == null ? 0 : omronAuthModel.hashCode()) * 31)) * 31);
    }

    public String toString() {
        OmronAuthModel omronAuthModel = this.model;
        InterfaceC34541e interfaceC34541e = this.status;
        boolean z4 = this.exchangeInFlight;
        StringBuilder sb4 = new StringBuilder("OmronAuthDomainState(model=");
        sb4.append(omronAuthModel);
        sb4.append(", status=");
        sb4.append(interfaceC34541e);
        sb4.append(", exchangeInFlight=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }

    public /* synthetic */ C34538b(OmronAuthModel omronAuthModel, InterfaceC34541e interfaceC34541e, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : omronAuthModel, (i13 & 2) != 0 ? InterfaceC34541e.e.f145237a : interfaceC34541e, (i13 & 4) != 0 ? false : z4);
    }
}
