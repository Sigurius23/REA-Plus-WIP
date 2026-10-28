package com.whoop.archv2.feature.domain;

import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.PickMediaSource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.whoop.archv2.feature.domain.p */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/p;", "", "", "stateKey", "Lcom/whoop/whoopaction/domain/models/PickMediaSource;", "source", "Lcom/whoop/navigation/models/GenericInteraction;", "onSuccess", "onError", "<init>", "(Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/PickMediaSource;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Lcom/whoop/whoopaction/domain/models/PickMediaSource;", "c", "()Lcom/whoop/whoopaction/domain/models/PickMediaSource;", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C6010p {

    /* JADX INFO: renamed from: e */
    public static final int f24003e = GenericInteraction.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String stateKey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final PickMediaSource source;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final GenericInteraction onSuccess;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final GenericInteraction onError;

    public C6010p(String stateKey, PickMediaSource source, GenericInteraction genericInteraction, GenericInteraction genericInteraction2) {
        AbstractC22676k.m65750j(stateKey, "stateKey");
        AbstractC22676k.m65750j(source, "source");
        this.stateKey = stateKey;
        this.source = source;
        this.onSuccess = genericInteraction;
        this.onError = genericInteraction2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final GenericInteraction getOnError() {
        return this.onError;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final GenericInteraction getOnSuccess() {
        return this.onSuccess;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final PickMediaSource getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getStateKey() {
        return this.stateKey;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C6010p)) {
            return false;
        }
        C6010p c6010p = (C6010p) other;
        return AbstractC22676k.m65745e(this.stateKey, c6010p.stateKey) && this.source == c6010p.source && AbstractC22676k.m65745e(this.onSuccess, c6010p.onSuccess) && AbstractC22676k.m65745e(this.onError, c6010p.onError);
    }

    public int hashCode() {
        int iHashCode = (this.source.hashCode() + (this.stateKey.hashCode() * 31)) * 31;
        GenericInteraction genericInteraction = this.onSuccess;
        int iHashCode2 = (iHashCode + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        GenericInteraction genericInteraction2 = this.onError;
        return iHashCode2 + (genericInteraction2 != null ? genericInteraction2.hashCode() : 0);
    }

    public String toString() {
        return "PendingMediaPick(stateKey=" + this.stateKey + ", source=" + this.source + ", onSuccess=" + this.onSuccess + ", onError=" + this.onError + ")";
    }
}
