package st0;

import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: st0.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\t¨\u0006\u0015"}, m65681d2 = {"Lst0/i;", "Lst0/f;", "", "code", "", "message", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32965i extends AbstractC32962f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32965i(int i13, String message) {
        super(null);
        AbstractC22676k.m65750j(message, "message");
        this.code = i13;
        this.message = message;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32965i)) {
            return false;
        }
        C32965i c32965i = (C32965i) other;
        return this.code == c32965i.code && AbstractC22676k.m65745e(this.message, c32965i.message);
    }

    public int hashCode() {
        return this.message.hashCode() + (Integer.hashCode(this.code) * 31);
    }

    @Override // st0.AbstractC32962f
    public String toString() {
        return AbstractC11266d.m30456j(this.code, "Error code=", " message=", this.message);
    }
}
