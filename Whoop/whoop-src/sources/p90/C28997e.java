package p90;

import d70.C11753g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: p90.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001b"}, m65681d2 = {"Lp90/e;", "", "Ld70/g;", "cardNumber", "cardExpiration", "cardCvv", "cardZip", "<init>", "(Ld70/g;Ld70/g;Ld70/g;Ld70/g;)V", "", "a", "()Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ld70/g;", "d", "()Ld70/g;", "b", "c", "e", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28997e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C11753g cardNumber;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C11753g cardExpiration;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C11753g cardCvv;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C11753g cardZip;

    public C28997e(C11753g cardNumber, C11753g cardExpiration, C11753g cardCvv, C11753g cardZip) {
        AbstractC22676k.m65750j(cardNumber, "cardNumber");
        AbstractC22676k.m65750j(cardExpiration, "cardExpiration");
        AbstractC22676k.m65750j(cardCvv, "cardCvv");
        AbstractC22676k.m65750j(cardZip, "cardZip");
        this.cardNumber = cardNumber;
        this.cardExpiration = cardExpiration;
        this.cardCvv = cardCvv;
        this.cardZip = cardZip;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m88068a() {
        return (AbstractC39414r.m125890i0(this.cardNumber.getValue()) || AbstractC39414r.m125890i0(this.cardExpiration.getValue()) || AbstractC39414r.m125890i0(this.cardCvv.getValue())) ? false : true;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C11753g getCardCvv() {
        return this.cardCvv;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C11753g getCardExpiration() {
        return this.cardExpiration;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C11753g getCardNumber() {
        return this.cardNumber;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C11753g getCardZip() {
        return this.cardZip;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28997e)) {
            return false;
        }
        C28997e c28997e = (C28997e) other;
        return AbstractC22676k.m65745e(this.cardNumber, c28997e.cardNumber) && AbstractC22676k.m65745e(this.cardExpiration, c28997e.cardExpiration) && AbstractC22676k.m65745e(this.cardCvv, c28997e.cardCvv) && AbstractC22676k.m65745e(this.cardZip, c28997e.cardZip);
    }

    public int hashCode() {
        return this.cardZip.hashCode() + ((this.cardCvv.hashCode() + ((this.cardExpiration.hashCode() + (this.cardNumber.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "Card(cardNumber=" + this.cardNumber + ", cardExpiration=" + this.cardExpiration + ", cardCvv=" + this.cardCvv + ", cardZip=" + this.cardZip + ")";
    }

    public /* synthetic */ C28997e(C11753g c11753g, C11753g c11753g2, C11753g c11753g3, C11753g c11753g4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C11753g(null, 1, null) : c11753g, (i13 & 2) != 0 ? new C11753g(null, 1, null) : c11753g2, (i13 & 4) != 0 ? new C11753g(null, 1, null) : c11753g3, (i13 & 8) != 0 ? new C11753g(null, 1, null) : c11753g4);
    }
}
