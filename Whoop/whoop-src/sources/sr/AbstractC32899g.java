package sr;

import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.integrity.internal.C5077af;
import p073cq.C11040i;
import p623xr.AbstractRunnableC38625u;

/* JADX INFO: renamed from: sr.g */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC32899g extends AbstractRunnableC38625u {

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C32900h f137113x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC32899g(C32900h c32900h, C11040i c11040i) {
        super(c11040i);
        this.f137113x = c32900h;
    }

    @Override // p623xr.AbstractRunnableC38625u
    /* JADX INFO: renamed from: a */
    public final void mo103294a(Exception exc) {
        if (!(exc instanceof C5077af)) {
            super.mo103294a(exc);
        } else if (C32900h.m103298d(this.f137113x)) {
            super.mo103294a(new StandardIntegrityException(-2, exc));
        } else {
            super.mo103294a(new StandardIntegrityException(-9, exc));
        }
    }
}
