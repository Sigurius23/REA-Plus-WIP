package p033bk;

import p173gj.C15906g;
import s83.AbstractC32269c;
import so.C32798o;

/* JADX INFO: renamed from: bk.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C3339g extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f12957E;

    /* JADX INFO: renamed from: w */
    public C32798o f12958w;

    /* JADX INFO: renamed from: x */
    public C15906g f12959x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f12960y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C32798o f12961z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3339g(C32798o c32798o, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f12961z = c32798o;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f12960y = obj;
        this.f12957E |= Integer.MIN_VALUE;
        return this.f12961z.m102856a(this);
    }
}
