package m62;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m62.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lm62/e;", "", "", "isComplete", "Lm62/d;", "card", "<init>", "(ZLm62/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Lm62/d;", "()Lm62/d;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25114e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isComplete;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C25113d card;

    public C25114e(boolean z4, C25113d card) {
        AbstractC22676k.m65750j(card, "card");
        this.isComplete = z4;
        this.card = card;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C25113d getCard() {
        return this.card;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsComplete() {
        return this.isComplete;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25114e)) {
            return false;
        }
        C25114e c25114e = (C25114e) other;
        return this.isComplete == c25114e.isComplete && AbstractC22676k.m65745e(this.card, c25114e.card);
    }

    public int hashCode() {
        return this.card.hashCode() + (Boolean.hashCode(this.isComplete) * 31);
    }

    public String toString() {
        return "PromotionViewState(isComplete=" + this.isComplete + ", card=" + this.card + ")";
    }
}
