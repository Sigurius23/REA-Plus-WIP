package wz0;

import com.whoop.navigation.models.GenericInteraction;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.C25306o;
import v41.InterfaceC35689r0;

/* JADX INFO: renamed from: wz0.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, m65681d2 = {"Lwz0/f;", "", "Lv41/r0;", "lottie", "Lm91/o;", "content", "", "minDurationMs", "Lcom/whoop/navigation/models/GenericInteraction;", "onStepCompleteInteraction", "<init>", "(Lv41/r0;Lm91/o;Ljava/lang/Long;Lcom/whoop/navigation/models/GenericInteraction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lv41/r0;", "b", "()Lv41/r0;", "Lm91/o;", "()Lm91/o;", "c", "Ljava/lang/Long;", "()Ljava/lang/Long;", "d", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37779f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC35689r0 lottie;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C25306o content;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Long minDurationMs;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final GenericInteraction onStepCompleteInteraction;

    public C37779f(InterfaceC35689r0 lottie, C25306o c25306o, Long l7, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(lottie, "lottie");
        this.lottie = lottie;
        this.content = c25306o;
        this.minDurationMs = l7;
        this.onStepCompleteInteraction = genericInteraction;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C25306o getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC35689r0 getLottie() {
        return this.lottie;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getMinDurationMs() {
        return this.minDurationMs;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final GenericInteraction getOnStepCompleteInteraction() {
        return this.onStepCompleteInteraction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37779f)) {
            return false;
        }
        C37779f c37779f = (C37779f) other;
        return AbstractC22676k.m65745e(this.lottie, c37779f.lottie) && AbstractC22676k.m65745e(this.content, c37779f.content) && AbstractC22676k.m65745e(this.minDurationMs, c37779f.minDurationMs) && AbstractC22676k.m65745e(this.onStepCompleteInteraction, c37779f.onStepCompleteInteraction);
    }

    public int hashCode() {
        int iHashCode = this.lottie.hashCode() * 31;
        C25306o c25306o = this.content;
        int iHashCode2 = (iHashCode + (c25306o == null ? 0 : c25306o.hashCode())) * 31;
        Long l7 = this.minDurationMs;
        int iHashCode3 = (iHashCode2 + (l7 == null ? 0 : l7.hashCode())) * 31;
        GenericInteraction genericInteraction = this.onStepCompleteInteraction;
        return iHashCode3 + (genericInteraction != null ? genericInteraction.hashCode() : 0);
    }

    public String toString() {
        return "AnimatedSequenceStepState(lottie=" + this.lottie + ", content=" + this.content + ", minDurationMs=" + this.minDurationMs + ", onStepCompleteInteraction=" + this.onStepCompleteInteraction + ")";
    }
}
