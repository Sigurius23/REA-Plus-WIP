package lb;

import androidx.room.EnumC1840w1;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: lb.w */
/* JADX INFO: loaded from: classes5.dex */
public final class C23580w extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f93511E;

    /* JADX INFO: renamed from: w */
    public EnumC1840w1 f93512w;

    /* JADX INFO: renamed from: x */
    public C23565h f93513x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f93514y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C23557a0 f93515z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23580w(C23557a0 c23557a0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f93515z = c23557a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f93514y = obj;
        this.f93511E |= Integer.MIN_VALUE;
        return this.f93515z.m68207e(null, this);
    }
}
