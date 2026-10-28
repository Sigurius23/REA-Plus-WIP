package iq1;

import com.whoop.impacts.details.domain.requests.JournalTrendsMiniArchResponse;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: iq1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Liq1/f;", "", "Liq1/e;", "currentDialogType", "Lcom/whoop/impacts/details/domain/requests/JournalTrendsMiniArchResponse;", "response", "<init>", "(Liq1/e;Lcom/whoop/impacts/details/domain/requests/JournalTrendsMiniArchResponse;)V", "a", "(Liq1/e;Lcom/whoop/impacts/details/domain/requests/JournalTrendsMiniArchResponse;)Liq1/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Liq1/e;", "c", "()Liq1/e;", "b", "Lcom/whoop/impacts/details/domain/requests/JournalTrendsMiniArchResponse;", "d", "()Lcom/whoop/impacts/details/domain/requests/JournalTrendsMiniArchResponse;", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20853f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC20852e currentDialogType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final JournalTrendsMiniArchResponse response;

    public C20853f(InterfaceC20852e interfaceC20852e, JournalTrendsMiniArchResponse journalTrendsMiniArchResponse) {
        this.currentDialogType = interfaceC20852e;
        this.response = journalTrendsMiniArchResponse;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C20853f m57601b(C20853f c20853f, InterfaceC20852e interfaceC20852e, JournalTrendsMiniArchResponse journalTrendsMiniArchResponse, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC20852e = c20853f.currentDialogType;
        }
        if ((i13 & 2) != 0) {
            journalTrendsMiniArchResponse = c20853f.response;
        }
        return c20853f.m57602a(interfaceC20852e, journalTrendsMiniArchResponse);
    }

    /* JADX INFO: renamed from: a */
    public final C20853f m57602a(InterfaceC20852e currentDialogType, JournalTrendsMiniArchResponse response) {
        return new C20853f(currentDialogType, response);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC20852e getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final JournalTrendsMiniArchResponse getResponse() {
        return this.response;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20853f)) {
            return false;
        }
        C20853f c20853f = (C20853f) other;
        return AbstractC22676k.m65745e(this.currentDialogType, c20853f.currentDialogType) && AbstractC22676k.m65745e(this.response, c20853f.response);
    }

    public int hashCode() {
        InterfaceC20852e interfaceC20852e = this.currentDialogType;
        int iHashCode = (interfaceC20852e == null ? 0 : interfaceC20852e.hashCode()) * 31;
        JournalTrendsMiniArchResponse journalTrendsMiniArchResponse = this.response;
        return iHashCode + (journalTrendsMiniArchResponse != null ? journalTrendsMiniArchResponse.hashCode() : 0);
    }

    public String toString() {
        return "JournalTrendsDomainState(currentDialogType=" + this.currentDialogType + ", response=" + this.response + ")";
    }

    public /* synthetic */ C20853f(InterfaceC20852e interfaceC20852e, JournalTrendsMiniArchResponse journalTrendsMiniArchResponse, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : interfaceC20852e, (i13 & 2) != 0 ? null : journalTrendsMiniArchResponse);
    }
}
