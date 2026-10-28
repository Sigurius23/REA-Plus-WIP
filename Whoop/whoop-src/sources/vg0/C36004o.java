package vg0;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vg0.o */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0011\u0010\t¨\u0006\u0015"}, m65681d2 = {"Lvg0/o;", "", "", "fingerprint", "turnId", "actionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36004o {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String fingerprint;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String turnId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String actionId;

    public C36004o(String fingerprint, String turnId, String actionId) {
        AbstractC22676k.m65750j(fingerprint, "fingerprint");
        AbstractC22676k.m65750j(turnId, "turnId");
        AbstractC22676k.m65750j(actionId, "actionId");
        this.fingerprint = fingerprint;
        this.turnId = turnId;
        this.actionId = actionId;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActionId() {
        return this.actionId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFingerprint() {
        return this.fingerprint;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTurnId() {
        return this.turnId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36004o)) {
            return false;
        }
        C36004o c36004o = (C36004o) other;
        return AbstractC22676k.m65745e(this.fingerprint, c36004o.fingerprint) && AbstractC22676k.m65745e(this.turnId, c36004o.turnId) && AbstractC22676k.m65745e(this.actionId, c36004o.actionId);
    }

    public int hashCode() {
        return this.actionId.hashCode() + AbstractC11266d.m30450d(this.fingerprint.hashCode() * 31, 31, this.turnId);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.actionId, ")", AbstractC11895b.m32001t("CreateMxmSupportTicketAction(fingerprint=", this.fingerprint, ", turnId=", this.turnId, ", actionId="));
    }
}
