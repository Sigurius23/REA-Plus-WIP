package de2;

import com.whoop.shepherd.feature.terms.domain.models.ShepherdTermsOfUseResponse;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: de2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lde2/c;", "", "Lde2/f;", "currentScreenType", "Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseResponse;", "termsOfUseResponse", "<init>", "(Lde2/f;Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseResponse;)V", "a", "(Lde2/f;Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseResponse;)Lde2/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lde2/f;", "c", "()Lde2/f;", "b", "Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseResponse;", "d", "()Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseResponse;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11987c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC11990f currentScreenType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ShepherdTermsOfUseResponse termsOfUseResponse;

    public C11987c(InterfaceC11990f currentScreenType, ShepherdTermsOfUseResponse shepherdTermsOfUseResponse) {
        AbstractC22676k.m65750j(currentScreenType, "currentScreenType");
        this.currentScreenType = currentScreenType;
        this.termsOfUseResponse = shepherdTermsOfUseResponse;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C11987c m33023b(C11987c c11987c, InterfaceC11990f interfaceC11990f, ShepherdTermsOfUseResponse shepherdTermsOfUseResponse, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC11990f = c11987c.currentScreenType;
        }
        if ((i13 & 2) != 0) {
            shepherdTermsOfUseResponse = c11987c.termsOfUseResponse;
        }
        return c11987c.m33024a(interfaceC11990f, shepherdTermsOfUseResponse);
    }

    /* JADX INFO: renamed from: a */
    public final C11987c m33024a(InterfaceC11990f currentScreenType, ShepherdTermsOfUseResponse termsOfUseResponse) {
        AbstractC22676k.m65750j(currentScreenType, "currentScreenType");
        return new C11987c(currentScreenType, termsOfUseResponse);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC11990f getCurrentScreenType() {
        return this.currentScreenType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ShepherdTermsOfUseResponse getTermsOfUseResponse() {
        return this.termsOfUseResponse;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11987c)) {
            return false;
        }
        C11987c c11987c = (C11987c) other;
        return AbstractC22676k.m65745e(this.currentScreenType, c11987c.currentScreenType) && AbstractC22676k.m65745e(this.termsOfUseResponse, c11987c.termsOfUseResponse);
    }

    public int hashCode() {
        int iHashCode = this.currentScreenType.hashCode() * 31;
        ShepherdTermsOfUseResponse shepherdTermsOfUseResponse = this.termsOfUseResponse;
        return iHashCode + (shepherdTermsOfUseResponse == null ? 0 : shepherdTermsOfUseResponse.hashCode());
    }

    public String toString() {
        return "ShepherdTermsOfUseDomainState(currentScreenType=" + this.currentScreenType + ", termsOfUseResponse=" + this.termsOfUseResponse + ")";
    }

    public /* synthetic */ C11987c(InterfaceC11990f interfaceC11990f, ShepherdTermsOfUseResponse shepherdTermsOfUseResponse, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC11990f.c.f39474a : interfaceC11990f, (i13 & 2) != 0 ? null : shepherdTermsOfUseResponse);
    }
}
