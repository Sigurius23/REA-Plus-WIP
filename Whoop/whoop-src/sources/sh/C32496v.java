package sh;

import mc3.C25443i;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: sh.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C32496v extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f134539E;

    /* JADX INFO: renamed from: w */
    public C32498x f134540w;

    /* JADX INFO: renamed from: x */
    public C25443i f134541x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f134542y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C32498x f134543z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32496v(C32498x c32498x, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f134543z = c32498x;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f134542y = obj;
        this.f134539E |= Integer.MIN_VALUE;
        return this.f134543z.mo71006a(this);
    }
}
