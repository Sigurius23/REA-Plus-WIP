package wg0;

import com.whoop.p057ai.chat.models.AITurn;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wg0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lwg0/g;", "", "Lcom/whoop/ai/chat/models/AITurn;", "turn", "<init>", "(Lcom/whoop/ai/chat/models/AITurn;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/ai/chat/models/AITurn;", "()Lcom/whoop/ai/chat/models/AITurn;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37257g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AITurn turn;

    public C37257g(AITurn turn) {
        AbstractC22676k.m65750j(turn, "turn");
        this.turn = turn;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AITurn getTurn() {
        return this.turn;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C37257g) && AbstractC22676k.m65745e(this.turn, ((C37257g) other).turn);
    }

    public int hashCode() {
        return this.turn.hashCode();
    }

    public String toString() {
        return "TurnInterpolationRequest(turn=" + this.turn + ")";
    }
}
