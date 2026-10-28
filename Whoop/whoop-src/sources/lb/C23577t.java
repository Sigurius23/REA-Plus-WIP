package lb;

import hg3.AbstractC17269i;
import p500tb.InterfaceC33689c;
import p550vd.AbstractC35902e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lb.t */
/* JADX INFO: loaded from: classes5.dex */
public final class C23577t implements InterfaceC33689c {

    /* JADX INFO: renamed from: w */
    public final InterfaceC33689c f93506w;

    /* JADX INFO: renamed from: x */
    public final long f93507x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C23557a0 f93508y;

    public C23577t(C23557a0 c23557a0, InterfaceC33689c delegate) {
        AbstractC22676k.m65750j(delegate, "delegate");
        this.f93508y = c23557a0;
        this.f93506w = delegate;
        this.f93507x = AbstractC35902e.m113972m();
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: J0 */
    public final String mo5353J0(int i13) {
        if (this.f93508y.f93434e) {
            AbstractC17269i.m48901l0(21, "Statement is recycled");
            throw null;
        }
        if (this.f93507x == AbstractC35902e.m113972m()) {
            return this.f93506w.mo5353J0(i13);
        }
        AbstractC17269i.m48901l0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: L */
    public final void mo5354L(int i13, String value) {
        AbstractC22676k.m65750j(value, "value");
        if (this.f93508y.f93434e) {
            AbstractC17269i.m48901l0(21, "Statement is recycled");
            throw null;
        }
        if (this.f93507x == AbstractC35902e.m113972m()) {
            this.f93506w.mo5354L(i13, value);
        } else {
            AbstractC17269i.m48901l0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.f93508y.f93434e) {
            AbstractC17269i.m48901l0(21, "Statement is recycled");
            throw null;
        }
        if (this.f93507x == AbstractC35902e.m113972m()) {
            this.f93506w.close();
        } else {
            AbstractC17269i.m48901l0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: e1 */
    public final boolean mo5355e1() {
        if (this.f93508y.f93434e) {
            AbstractC17269i.m48901l0(21, "Statement is recycled");
            throw null;
        }
        if (this.f93507x == AbstractC35902e.m113972m()) {
            return this.f93506w.mo5355e1();
        }
        AbstractC17269i.m48901l0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // p500tb.InterfaceC33689c
    public final byte[] getBlob(int i13) {
        if (this.f93508y.f93434e) {
            AbstractC17269i.m48901l0(21, "Statement is recycled");
            throw null;
        }
        if (this.f93507x == AbstractC35902e.m113972m()) {
            return this.f93506w.getBlob(i13);
        }
        AbstractC17269i.m48901l0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // p500tb.InterfaceC33689c
    public final int getColumnCount() {
        if (this.f93508y.f93434e) {
            AbstractC17269i.m48901l0(21, "Statement is recycled");
            throw null;
        }
        if (this.f93507x == AbstractC35902e.m113972m()) {
            return this.f93506w.getColumnCount();
        }
        AbstractC17269i.m48901l0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // p500tb.InterfaceC33689c
    public final String getColumnName(int i13) {
        if (this.f93508y.f93434e) {
            AbstractC17269i.m48901l0(21, "Statement is recycled");
            throw null;
        }
        if (this.f93507x == AbstractC35902e.m113972m()) {
            return this.f93506w.getColumnName(i13);
        }
        AbstractC17269i.m48901l0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // p500tb.InterfaceC33689c
    public final double getDouble(int i13) {
        if (this.f93508y.f93434e) {
            AbstractC17269i.m48901l0(21, "Statement is recycled");
            throw null;
        }
        if (this.f93507x == AbstractC35902e.m113972m()) {
            return this.f93506w.getDouble(i13);
        }
        AbstractC17269i.m48901l0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // p500tb.InterfaceC33689c
    public final long getLong(int i13) {
        if (this.f93508y.f93434e) {
            AbstractC17269i.m48901l0(21, "Statement is recycled");
            throw null;
        }
        if (this.f93507x == AbstractC35902e.m113972m()) {
            return this.f93506w.getLong(i13);
        }
        AbstractC17269i.m48901l0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // p500tb.InterfaceC33689c
    public final boolean isNull(int i13) {
        if (this.f93508y.f93434e) {
            AbstractC17269i.m48901l0(21, "Statement is recycled");
            throw null;
        }
        if (this.f93507x == AbstractC35902e.m113972m()) {
            return this.f93506w.isNull(i13);
        }
        AbstractC17269i.m48901l0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: p */
    public final void mo5356p(int i13, long j7) {
        if (this.f93508y.f93434e) {
            AbstractC17269i.m48901l0(21, "Statement is recycled");
            throw null;
        }
        if (this.f93507x == AbstractC35902e.m113972m()) {
            this.f93506w.mo5356p(i13, j7);
        } else {
            AbstractC17269i.m48901l0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: q */
    public final void mo5357q(int i13, byte[] value) {
        AbstractC22676k.m65750j(value, "value");
        if (this.f93508y.f93434e) {
            AbstractC17269i.m48901l0(21, "Statement is recycled");
            throw null;
        }
        if (this.f93507x == AbstractC35902e.m113972m()) {
            this.f93506w.mo5357q(i13, value);
        } else {
            AbstractC17269i.m48901l0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // p500tb.InterfaceC33689c
    public final void reset() {
        if (this.f93508y.f93434e) {
            AbstractC17269i.m48901l0(21, "Statement is recycled");
            throw null;
        }
        if (this.f93507x == AbstractC35902e.m113972m()) {
            this.f93506w.reset();
        } else {
            AbstractC17269i.m48901l0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: t */
    public final void mo5358t(double d3, int i13) {
        if (this.f93508y.f93434e) {
            AbstractC17269i.m48901l0(21, "Statement is recycled");
            throw null;
        }
        if (this.f93507x == AbstractC35902e.m113972m()) {
            this.f93506w.mo5358t(d3, i13);
        } else {
            AbstractC17269i.m48901l0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: u */
    public final void mo5359u(int i13) {
        if (this.f93508y.f93434e) {
            AbstractC17269i.m48901l0(21, "Statement is recycled");
            throw null;
        }
        if (this.f93507x == AbstractC35902e.m113972m()) {
            this.f93506w.mo5359u(i13);
        } else {
            AbstractC17269i.m48901l0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: w */
    public final void mo5360w() {
        if (this.f93508y.f93434e) {
            AbstractC17269i.m48901l0(21, "Statement is recycled");
            throw null;
        }
        if (this.f93507x == AbstractC35902e.m113972m()) {
            this.f93506w.mo5360w();
        } else {
            AbstractC17269i.m48901l0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }
}
