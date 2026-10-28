package zp2;

import ih0.AbstractC18489d0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zp2.h */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u000e¨\u0006\u001b"}, m65681d2 = {"Lzp2/h;", "", "Lzp2/i;", "type", "Lzp2/k;", "currentState", "", "year", "<init>", "(Lzp2/i;Lzp2/k;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzp2/i;", "b", "()Lzp2/i;", "Lzp2/k;", "()Lzp2/k;", "c", "I", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40950h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC40951i type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C40953k currentState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int year;

    public C40950h(EnumC40951i type, C40953k currentState, int i13) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(currentState, "currentState");
        this.type = type;
        this.currentState = currentState;
        this.year = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C40953k getCurrentState() {
        return this.currentState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC40951i getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40950h)) {
            return false;
        }
        C40950h c40950h = (C40950h) other;
        return this.type == c40950h.type && AbstractC22676k.m65745e(this.currentState, c40950h.currentState) && this.year == c40950h.year;
    }

    public int hashCode() {
        return Integer.hashCode(this.year) + ((this.currentState.hashCode() + (this.type.hashCode() * 31)) * 31);
    }

    public String toString() {
        EnumC40951i enumC40951i = this.type;
        C40953k c40953k = this.currentState;
        int i13 = this.year;
        StringBuilder sb4 = new StringBuilder("UserJourneyProgressAction(type=");
        sb4.append(enumC40951i);
        sb4.append(", currentState=");
        sb4.append(c40953k);
        sb4.append(", year=");
        return AbstractC18489d0.m53371l(sb4, i13, ")");
    }
}
