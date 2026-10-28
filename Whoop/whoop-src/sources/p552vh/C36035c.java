package p552vh;

import android.graphics.drawable.AnimatedImageDrawable;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: vh.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C36035c extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f153716E;

    /* JADX INFO: renamed from: w */
    public C36036d f153717w;

    /* JADX INFO: renamed from: x */
    public AnimatedImageDrawable f153718x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f153719y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C36036d f153720z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36035c(C36036d c36036d, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f153720z = c36036d;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f153719y = obj;
        this.f153716E |= Integer.MIN_VALUE;
        return this.f153720z.m114401b(null, this);
    }
}
