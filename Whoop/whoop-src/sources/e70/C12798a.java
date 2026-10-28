package e70;

import f70.InterfaceC14176e;
import m70.InterfaceC25188b;
import o70.C27629c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: e70.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Le70/a;", "", "Lf70/e;", "activationDomainResult", "Lm70/b;", "paymentsDomainResult", "Lo70/c;", "privacyResultState", "<init>", "(Lf70/e;Lm70/b;Lo70/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lf70/e;", "()Lf70/e;", "b", "Lm70/b;", "()Lm70/b;", "c", "Lo70/c;", "()Lo70/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12798a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14176e activationDomainResult;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC25188b paymentsDomainResult;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C27629c privacyResultState;

    public C12798a(InterfaceC14176e activationDomainResult, InterfaceC25188b paymentsDomainResult, C27629c privacyResultState) {
        AbstractC22676k.m65750j(activationDomainResult, "activationDomainResult");
        AbstractC22676k.m65750j(paymentsDomainResult, "paymentsDomainResult");
        AbstractC22676k.m65750j(privacyResultState, "privacyResultState");
        this.activationDomainResult = activationDomainResult;
        this.paymentsDomainResult = paymentsDomainResult;
        this.privacyResultState = privacyResultState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC14176e getActivationDomainResult() {
        return this.activationDomainResult;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC25188b getPaymentsDomainResult() {
        return this.paymentsDomainResult;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C27629c getPrivacyResultState() {
        return this.privacyResultState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12798a)) {
            return false;
        }
        C12798a c12798a = (C12798a) other;
        return AbstractC22676k.m65745e(this.activationDomainResult, c12798a.activationDomainResult) && AbstractC22676k.m65745e(this.paymentsDomainResult, c12798a.paymentsDomainResult) && AbstractC22676k.m65745e(this.privacyResultState, c12798a.privacyResultState);
    }

    public int hashCode() {
        return this.privacyResultState.hashCode() + ((this.paymentsDomainResult.hashCode() + (this.activationDomainResult.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "ActivationCombinedDomainResult(activationDomainResult=" + this.activationDomainResult + ", paymentsDomainResult=" + this.paymentsDomainResult + ", privacyResultState=" + this.privacyResultState + ")";
    }
}
