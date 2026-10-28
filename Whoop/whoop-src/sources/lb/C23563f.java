package lb;

import p500tb.InterfaceC33689c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lb.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C23563f implements InterfaceC33689c {

    /* JADX INFO: renamed from: w */
    public final InterfaceC33689c f93455w;

    public C23563f(InterfaceC33689c interfaceC33689c) {
        this.f93455w = interfaceC33689c;
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: B0 */
    public final boolean mo5352B0() {
        return this.f93455w.mo5352B0();
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: J0 */
    public final String mo5353J0(int i13) {
        return this.f93455w.mo5353J0(i13);
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: L */
    public final void mo5354L(int i13, String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f93455w.mo5354L(i13, value);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        InterfaceC33689c interfaceC33689c = this.f93455w;
        interfaceC33689c.reset();
        interfaceC33689c.mo5360w();
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: e1 */
    public final boolean mo5355e1() {
        return this.f93455w.mo5355e1();
    }

    @Override // p500tb.InterfaceC33689c
    public final byte[] getBlob(int i13) {
        return this.f93455w.getBlob(i13);
    }

    @Override // p500tb.InterfaceC33689c
    public final int getColumnCount() {
        return this.f93455w.getColumnCount();
    }

    @Override // p500tb.InterfaceC33689c
    public final String getColumnName(int i13) {
        return this.f93455w.getColumnName(i13);
    }

    @Override // p500tb.InterfaceC33689c
    public final double getDouble(int i13) {
        return this.f93455w.getDouble(i13);
    }

    @Override // p500tb.InterfaceC33689c
    public final long getLong(int i13) {
        return this.f93455w.getLong(i13);
    }

    @Override // p500tb.InterfaceC33689c
    public final boolean isNull(int i13) {
        return this.f93455w.isNull(i13);
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: p */
    public final void mo5356p(int i13, long j7) {
        this.f93455w.mo5356p(i13, j7);
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: q */
    public final void mo5357q(int i13, byte[] value) {
        AbstractC22676k.m65750j(value, "value");
        this.f93455w.mo5357q(i13, value);
    }

    @Override // p500tb.InterfaceC33689c
    public final void reset() {
        this.f93455w.reset();
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: t */
    public final void mo5358t(double d3, int i13) {
        this.f93455w.mo5358t(d3, i13);
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: u */
    public final void mo5359u(int i13) {
        this.f93455w.mo5359u(i13);
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: w */
    public final void mo5360w() {
        this.f93455w.mo5360w();
    }
}
