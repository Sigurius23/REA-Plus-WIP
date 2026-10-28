package m40;

import android.graphics.BitmapFactory;
import java.net.URL;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: m40.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C25033j extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f98054E;

    /* JADX INFO: renamed from: F */
    public /* synthetic */ Object f98055F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C25034k f98056G;

    /* JADX INFO: renamed from: H */
    public int f98057H;

    /* JADX INFO: renamed from: w */
    public C25034k f98058w;

    /* JADX INFO: renamed from: x */
    public URL f98059x;

    /* JADX INFO: renamed from: y */
    public BitmapFactory.Options f98060y;

    /* JADX INFO: renamed from: z */
    public int f98061z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25033j(C25034k c25034k, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f98056G = c25034k;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f98055F = obj;
        this.f98057H |= Integer.MIN_VALUE;
        return this.f98056G.m73480a(null, 0, 0, this);
    }
}
