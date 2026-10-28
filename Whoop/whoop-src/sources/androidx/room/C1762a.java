package androidx.room;

import p500tb.InterfaceC33689c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.room.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1762a implements InterfaceC33689c {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC33689c f6949w;

    public C1762a(InterfaceC33689c delegate) {
        AbstractC22676k.m65750j(delegate, "delegate");
        this.f6949w = delegate;
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: B0 */
    public final boolean mo5352B0() {
        return this.f6949w.mo5352B0();
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: J0 */
    public final String mo5353J0(int i13) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: L */
    public final void mo5354L(int i13, String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f6949w.mo5354L(i13, value);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: e1 */
    public final boolean mo5355e1() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // p500tb.InterfaceC33689c
    public final byte[] getBlob(int i13) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // p500tb.InterfaceC33689c
    public final int getColumnCount() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // p500tb.InterfaceC33689c
    public final String getColumnName(int i13) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // p500tb.InterfaceC33689c
    public final double getDouble(int i13) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // p500tb.InterfaceC33689c
    public final long getLong(int i13) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // p500tb.InterfaceC33689c
    public final boolean isNull(int i13) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: p */
    public final void mo5356p(int i13, long j7) {
        this.f6949w.mo5356p(i13, j7);
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: q */
    public final void mo5357q(int i13, byte[] value) {
        AbstractC22676k.m65750j(value, "value");
        this.f6949w.mo5357q(i13, value);
    }

    @Override // p500tb.InterfaceC33689c
    public final void reset() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: t */
    public final void mo5358t(double d3, int i13) {
        this.f6949w.mo5358t(d3, i13);
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: u */
    public final void mo5359u(int i13) {
        this.f6949w.mo5359u(i13);
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: w */
    public final void mo5360w() {
        this.f6949w.mo5360w();
    }
}
