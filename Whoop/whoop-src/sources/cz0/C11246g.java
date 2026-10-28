package cz0;

import d61.InterfaceC11732a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: cz0.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lcz0/g;", "", "Ld61/a;", "scrubberState", "Lkotlin/Function1;", "Ll83/a0;", "onDataScrub", "<init>", "(Ld61/a;Lkotlin/jvm/functions/Function1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ld61/a;", "b", "()Ld61/a;", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11246g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC11732a scrubberState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function1 onDataScrub;

    public C11246g(InterfaceC11732a scrubberState, Function1 onDataScrub) {
        AbstractC22676k.m65750j(scrubberState, "scrubberState");
        AbstractC22676k.m65750j(onDataScrub, "onDataScrub");
        this.scrubberState = scrubberState;
        this.onDataScrub = onDataScrub;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Function1 getOnDataScrub() {
        return this.onDataScrub;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC11732a getScrubberState() {
        return this.scrubberState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11246g)) {
            return false;
        }
        C11246g c11246g = (C11246g) other;
        return AbstractC22676k.m65745e(this.scrubberState, c11246g.scrubberState) && AbstractC22676k.m65745e(this.onDataScrub, c11246g.onDataScrub);
    }

    public int hashCode() {
        return this.onDataScrub.hashCode() + (this.scrubberState.hashCode() * 31);
    }

    public String toString() {
        return "ContentWithDataScrubberState(scrubberState=" + this.scrubberState + ", onDataScrub=" + this.onDataScrub + ")";
    }
}
