package com.whoop.ble.api.pair;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import mj0.EnumC25613b;
import mj0.InterfaceC25612a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/ble/api/pair/PairFailure;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lmj0/b;", "phase", "Lmj0/a;", "typedCause", "<init>", "(Lmj0/b;Lmj0/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lmj0/b;", "getPhase", "()Lmj0/b;", "x", "Lmj0/a;", "getTypedCause", "()Lmj0/a;", "whoop-ble-api"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class PairFailure extends Exception {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final EnumC25613b phase;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC25612a typedCause;

    /* JADX WARN: Illegal instructions before constructor call */
    public PairFailure(EnumC25613b phase, InterfaceC25612a typedCause) {
        AbstractC22676k.m65750j(phase, "phase");
        AbstractC22676k.m65750j(typedCause, "typedCause");
        String str = "Pair failed at " + phase + " (" + typedCause + ")";
        InterfaceC25612a.i iVar = typedCause instanceof InterfaceC25612a.i ? (InterfaceC25612a.i) typedCause : null;
        super(str, iVar != null ? iVar.getUnderlying() : null);
        this.phase = phase;
        this.typedCause = typedCause;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PairFailure)) {
            return false;
        }
        PairFailure pairFailure = (PairFailure) other;
        return this.phase == pairFailure.phase && AbstractC22676k.m65745e(this.typedCause, pairFailure.typedCause);
    }

    public int hashCode() {
        return this.typedCause.hashCode() + (this.phase.hashCode() * 31);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "PairFailure(phase=" + this.phase + ", typedCause=" + this.typedCause + ")";
    }
}
