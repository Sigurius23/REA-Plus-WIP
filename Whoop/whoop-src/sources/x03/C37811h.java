package x03;

import p715kotlin.jvm.internal.C22663d0;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: x03.h */
/* JADX INFO: loaded from: classes11.dex */
public final class C37811h extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f161941E;

    /* JADX INFO: renamed from: w */
    public C37812i f161942w;

    /* JADX INFO: renamed from: x */
    public C22663d0 f161943x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f161944y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C37812i f161945z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37811h(C37812i c37812i, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f161945z = c37812i;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f161944y = obj;
        this.f161941E |= Integer.MIN_VALUE;
        return this.f161945z.m121328f(null, null, 0, 0.0f, this);
    }
}
