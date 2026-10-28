package uz;

import io.sentry.android.replay.video.C20245d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: uz.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C35393g extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C35401o f150806E;

    /* JADX INFO: renamed from: F */
    public int f150807F;

    /* JADX INFO: renamed from: w */
    public C35401o f150808w;

    /* JADX INFO: renamed from: x */
    public String f150809x;

    /* JADX INFO: renamed from: y */
    public C20245d f150810y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f150811z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35393g(C35401o c35401o, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f150806E = c35401o;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f150811z = obj;
        this.f150807F |= Integer.MIN_VALUE;
        return this.f150806E.m112320b(null, null, null, this);
    }
}
