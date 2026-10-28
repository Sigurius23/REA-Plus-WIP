package androidx.room;

import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;
import p518ub.InterfaceC34733f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.room.m1 */
/* JADX INFO: loaded from: classes.dex */
public class C1810m1 implements InterfaceC34733f {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7115w = 1;

    /* JADX INFO: renamed from: x */
    public final Closeable f7116x;

    public C1810m1(SQLiteProgram delegate) {
        AbstractC22676k.m65750j(delegate, "delegate");
        this.f7116x = delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f7115w) {
            case 0:
                ((C1813n1) this.f7116x).getClass();
                break;
            default:
                ((SQLiteProgram) this.f7116x).close();
                break;
        }
    }

    @Override // p518ub.InterfaceC34733f
    /* JADX INFO: renamed from: n0 */
    public final void mo5432n0(int i13, String value) {
        switch (this.f7115w) {
            case 0:
                ((C1813n1) this.f7116x).mo5432n0(i13, value);
                break;
            default:
                AbstractC22676k.m65750j(value, "value");
                ((SQLiteProgram) this.f7116x).bindString(i13, value);
                break;
        }
    }

    @Override // p518ub.InterfaceC34733f
    /* JADX INFO: renamed from: p */
    public final void mo5433p(int i13, long j7) {
        switch (this.f7115w) {
            case 0:
                ((C1813n1) this.f7116x).mo5433p(i13, j7);
                break;
            default:
                ((SQLiteProgram) this.f7116x).bindLong(i13, j7);
                break;
        }
    }

    @Override // p518ub.InterfaceC34733f
    /* JADX INFO: renamed from: q */
    public final void mo5434q(int i13, byte[] value) {
        switch (this.f7115w) {
            case 0:
                ((C1813n1) this.f7116x).mo5434q(i13, value);
                break;
            default:
                AbstractC22676k.m65750j(value, "value");
                ((SQLiteProgram) this.f7116x).bindBlob(i13, value);
                break;
        }
    }

    @Override // p518ub.InterfaceC34733f
    /* JADX INFO: renamed from: t */
    public final void mo5435t(double d3, int i13) {
        switch (this.f7115w) {
            case 0:
                ((C1813n1) this.f7116x).mo5435t(d3, i13);
                break;
            default:
                ((SQLiteProgram) this.f7116x).bindDouble(i13, d3);
                break;
        }
    }

    @Override // p518ub.InterfaceC34733f
    /* JADX INFO: renamed from: u */
    public final void mo5436u(int i13) {
        switch (this.f7115w) {
            case 0:
                ((C1813n1) this.f7116x).mo5436u(i13);
                break;
            default:
                ((SQLiteProgram) this.f7116x).bindNull(i13);
                break;
        }
    }

    @Override // p518ub.InterfaceC34733f
    /* JADX INFO: renamed from: w */
    public void mo5437w() {
        ((SQLiteProgram) this.f7116x).clearBindings();
    }

    public C1810m1(C1813n1 c1813n1) {
        this.f7116x = c1813n1;
    }
}
