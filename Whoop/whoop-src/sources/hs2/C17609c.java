package hs2;

import hy0.C17749h0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hs2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m65681d2 = {"Lhs2/c;", "", "Lhs2/b;", "localParticipant", "remoteParticipant", "<init>", "(Lhs2/b;Lhs2/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhs2/b;", "()Lhs2/b;", "b", "getRemoteParticipant", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17609c {

    /* JADX INFO: renamed from: c */
    public static final int f68232c = C17749h0.f69004h;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C17608b localParticipant;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C17608b remoteParticipant;

    public C17609c(C17608b localParticipant, C17608b remoteParticipant) {
        AbstractC22676k.m65750j(localParticipant, "localParticipant");
        AbstractC22676k.m65750j(remoteParticipant, "remoteParticipant");
        this.localParticipant = localParticipant;
        this.remoteParticipant = remoteParticipant;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C17608b getLocalParticipant() {
        return this.localParticipant;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17609c)) {
            return false;
        }
        C17609c c17609c = (C17609c) other;
        return AbstractC22676k.m65745e(this.localParticipant, c17609c.localParticipant) && AbstractC22676k.m65745e(this.remoteParticipant, c17609c.remoteParticipant);
    }

    public int hashCode() {
        return this.remoteParticipant.hashCode() + (this.localParticipant.hashCode() * 31);
    }

    public String toString() {
        return "VideoCallParticipantsViewState(localParticipant=" + this.localParticipant + ", remoteParticipant=" + this.remoteParticipant + ")";
    }
}
