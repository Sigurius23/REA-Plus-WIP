package p549vb;

import android.content.Context;
import l83.C23470p;
import m83.C25262p;
import p518ub.AbstractC34729b;
import p518ub.InterfaceC34728a;
import p518ub.InterfaceC34732e;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: vb.i */
/* JADX INFO: loaded from: classes.dex */
public final class C35864i implements InterfaceC34732e {

    /* JADX INFO: renamed from: E */
    public final boolean f152687E;

    /* JADX INFO: renamed from: F */
    public final C23470p f152688F;

    /* JADX INFO: renamed from: G */
    public boolean f152689G;

    /* JADX INFO: renamed from: w */
    public final Context f152690w;

    /* JADX INFO: renamed from: x */
    public final String f152691x;

    /* JADX INFO: renamed from: y */
    public final AbstractC34729b f152692y;

    /* JADX INFO: renamed from: z */
    public final boolean f152693z;

    public C35864i(Context context, String str, AbstractC34729b callback, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(callback, "callback");
        this.f152690w = context;
        this.f152691x = str;
        this.f152692y = callback;
        this.f152693z = z4;
        this.f152687E = z13;
        this.f152688F = AbstractC30060g.m92088H(new C25262p(this, 17));
    }

    @Override // p518ub.InterfaceC34732e
    /* JADX INFO: renamed from: E0 */
    public final InterfaceC34728a mo109675E0() {
        return ((C35863h) this.f152688F.getValue()).m113849b(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C23470p c23470p = this.f152688F;
        if (c23470p.mo5046b()) {
            ((C35863h) c23470p.getValue()).close();
        }
    }

    @Override // p518ub.InterfaceC34732e
    public final String getDatabaseName() {
        return this.f152691x;
    }

    @Override // p518ub.InterfaceC34732e
    public final void setWriteAheadLoggingEnabled(boolean z4) {
        C23470p c23470p = this.f152688F;
        if (c23470p.mo5046b()) {
            ((C35863h) c23470p.getValue()).setWriteAheadLoggingEnabled(z4);
        }
        this.f152689G = z4;
    }
}
