package wg0;

import com.whoop.p057ai.chat.models.AITurn;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wg0.h */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lwg0/h;", "", "Lcom/whoop/ai/chat/models/AITurn;", "turn", "", "isInterpolationComplete", "<init>", "(Lcom/whoop/ai/chat/models/AITurn;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/ai/chat/models/AITurn;", "()Lcom/whoop/ai/chat/models/AITurn;", "b", "Z", "()Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37258h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AITurn turn;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isInterpolationComplete;

    public C37258h(AITurn turn, boolean z4) {
        AbstractC22676k.m65750j(turn, "turn");
        this.turn = turn;
        this.isInterpolationComplete = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AITurn getTurn() {
        return this.turn;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsInterpolationComplete() {
        return this.isInterpolationComplete;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37258h)) {
            return false;
        }
        C37258h c37258h = (C37258h) other;
        return AbstractC22676k.m65745e(this.turn, c37258h.turn) && this.isInterpolationComplete == c37258h.isInterpolationComplete;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isInterpolationComplete) + (this.turn.hashCode() * 31);
    }

    public String toString() {
        return "TurnInterpolationResult(turn=" + this.turn + ", isInterpolationComplete=" + this.isInterpolationComplete + ")";
    }
}
