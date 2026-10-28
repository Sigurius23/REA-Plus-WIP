package sj2;

import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: sj2.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BC\u0012\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003\u0012\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R-\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R-\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Lsj2/e;", "R", "", "Lkotlin/Function1;", "Lq83/d;", "block", "Ll83/a0;", "onCancel", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "b", "essentials_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32568e<R> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function1 block;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function1 onCancel;

    public C32568e(Function1 block, Function1 onCancel) {
        AbstractC22676k.m65750j(block, "block");
        AbstractC22676k.m65750j(onCancel, "onCancel");
        this.block = block;
        this.onCancel = onCancel;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Function1 getBlock() {
        return this.block;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Function1 getOnCancel() {
        return this.onCancel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32568e)) {
            return false;
        }
        C32568e c32568e = (C32568e) other;
        return AbstractC22676k.m65745e(this.block, c32568e.block) && AbstractC22676k.m65745e(this.onCancel, c32568e.onCancel);
    }

    public int hashCode() {
        return this.onCancel.hashCode() + (this.block.hashCode() * 31);
    }

    public String toString() {
        return "Task(block=" + this.block + ", onCancel=" + this.onCancel + ")";
    }
}
