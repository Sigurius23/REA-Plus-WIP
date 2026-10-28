package p578wb;

import hg3.AbstractC17269i;
import java.io.IOException;
import p518ub.InterfaceC34728a;
import p518ub.InterfaceC34735h;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wb.d */
/* JADX INFO: loaded from: classes.dex */
public final class C37027d extends AbstractC37029f {

    /* JADX INFO: renamed from: E */
    public final Object f158407E;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f158408z = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37027d(InterfaceC34728a db4, String sql, EnumC37026c enumC37026c) {
        super(db4, sql);
        AbstractC22676k.m65750j(db4, "db");
        AbstractC22676k.m65750j(sql, "sql");
        this.f158407E = enumC37026c;
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: B0 */
    public boolean mo5352B0() {
        switch (this.f158408z) {
            case 0:
                return ((C37028e) this.f158407E).mo5352B0();
            default:
                return super.mo5352B0();
        }
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: J0 */
    public final String mo5353J0(int i13) {
        switch (this.f158408z) {
            case 0:
                return ((C37028e) this.f158407E).mo5353J0(i13);
            case 1:
                m118836b();
                AbstractC17269i.m48901l0(21, "no row");
                throw null;
            default:
                m118836b();
                AbstractC17269i.m48901l0(21, "no row");
                throw null;
        }
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: L */
    public final void mo5354L(int i13, String value) {
        switch (this.f158408z) {
            case 0:
                AbstractC22676k.m65750j(value, "value");
                ((C37028e) this.f158407E).mo5354L(i13, value);
                return;
            case 1:
                AbstractC22676k.m65750j(value, "value");
                m118836b();
                ((InterfaceC34735h) this.f158407E).mo5432n0(i13, value);
                return;
            default:
                AbstractC22676k.m65750j(value, "value");
                m118836b();
                AbstractC17269i.m48901l0(25, "column index out of range");
                throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f158408z) {
            case 0:
                ((C37028e) this.f158407E).close();
                break;
            case 1:
                ((InterfaceC34735h) this.f158407E).close();
                this.f158417y = true;
                break;
            default:
                this.f158417y = true;
                break;
        }
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: e1 */
    public final boolean mo5355e1() {
        switch (this.f158408z) {
            case 0:
                C37028e c37028e = (C37028e) this.f158407E;
                boolean zMo5355e1 = c37028e.mo5355e1();
                boolean zEqualsIgnoreCase = c37028e.mo5353J0(0).equalsIgnoreCase("wal");
                InterfaceC34728a interfaceC34728a = this.f158415w;
                if (zEqualsIgnoreCase) {
                    interfaceC34728a.mo109662N();
                } else {
                    interfaceC34728a.mo109659D();
                }
                return zMo5355e1;
            case 1:
                m118836b();
                ((InterfaceC34735h) this.f158407E).execute();
                return false;
            default:
                int iOrdinal = ((EnumC37026c) this.f158407E).ordinal();
                InterfaceC34728a interfaceC34728a2 = this.f158415w;
                if (iOrdinal == 0) {
                    interfaceC34728a2.mo109663O();
                    interfaceC34728a2.mo109665V();
                    return false;
                }
                if (iOrdinal == 1) {
                    interfaceC34728a2.mo109665V();
                    return false;
                }
                if (iOrdinal == 2) {
                    interfaceC34728a2.mo109673y();
                    return false;
                }
                if (iOrdinal == 3) {
                    interfaceC34728a2.mo109664P();
                    return false;
                }
                if (iOrdinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC34728a2.mo109671u0();
                return false;
        }
    }

    @Override // p500tb.InterfaceC33689c
    public final byte[] getBlob(int i13) {
        switch (this.f158408z) {
            case 0:
                return ((C37028e) this.f158407E).getBlob(i13);
            case 1:
                m118836b();
                AbstractC17269i.m48901l0(21, "no row");
                throw null;
            default:
                m118836b();
                AbstractC17269i.m48901l0(21, "no row");
                throw null;
        }
    }

    @Override // p500tb.InterfaceC33689c
    public final int getColumnCount() {
        switch (this.f158408z) {
            case 0:
                return ((C37028e) this.f158407E).getColumnCount();
            case 1:
                m118836b();
                return 0;
            default:
                m118836b();
                return 0;
        }
    }

    @Override // p500tb.InterfaceC33689c
    public final String getColumnName(int i13) {
        switch (this.f158408z) {
            case 0:
                return ((C37028e) this.f158407E).getColumnName(i13);
            case 1:
                m118836b();
                AbstractC17269i.m48901l0(21, "no row");
                throw null;
            default:
                m118836b();
                AbstractC17269i.m48901l0(21, "no row");
                throw null;
        }
    }

    @Override // p500tb.InterfaceC33689c
    public final double getDouble(int i13) {
        switch (this.f158408z) {
            case 0:
                return ((C37028e) this.f158407E).getDouble(i13);
            case 1:
                m118836b();
                AbstractC17269i.m48901l0(21, "no row");
                throw null;
            default:
                m118836b();
                AbstractC17269i.m48901l0(21, "no row");
                throw null;
        }
    }

    @Override // p500tb.InterfaceC33689c
    public final long getLong(int i13) {
        switch (this.f158408z) {
            case 0:
                return ((C37028e) this.f158407E).getLong(i13);
            case 1:
                m118836b();
                AbstractC17269i.m48901l0(21, "no row");
                throw null;
            default:
                m118836b();
                AbstractC17269i.m48901l0(21, "no row");
                throw null;
        }
    }

    @Override // p500tb.InterfaceC33689c
    public final boolean isNull(int i13) {
        switch (this.f158408z) {
            case 0:
                return ((C37028e) this.f158407E).isNull(i13);
            case 1:
                m118836b();
                AbstractC17269i.m48901l0(21, "no row");
                throw null;
            default:
                m118836b();
                AbstractC17269i.m48901l0(21, "no row");
                throw null;
        }
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: p */
    public final void mo5356p(int i13, long j7) {
        switch (this.f158408z) {
            case 0:
                ((C37028e) this.f158407E).mo5356p(i13, j7);
                return;
            case 1:
                m118836b();
                ((InterfaceC34735h) this.f158407E).mo5433p(i13, j7);
                return;
            default:
                m118836b();
                AbstractC17269i.m48901l0(25, "column index out of range");
                throw null;
        }
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: q */
    public final void mo5357q(int i13, byte[] value) {
        switch (this.f158408z) {
            case 0:
                AbstractC22676k.m65750j(value, "value");
                ((C37028e) this.f158407E).mo5357q(i13, value);
                return;
            case 1:
                AbstractC22676k.m65750j(value, "value");
                m118836b();
                ((InterfaceC34735h) this.f158407E).mo5434q(i13, value);
                return;
            default:
                AbstractC22676k.m65750j(value, "value");
                m118836b();
                AbstractC17269i.m48901l0(25, "column index out of range");
                throw null;
        }
    }

    @Override // p578wb.AbstractC37029f, p500tb.InterfaceC33689c
    public void reset() {
        switch (this.f158408z) {
            case 0:
                ((C37028e) this.f158407E).reset();
                break;
            default:
                super.reset();
                break;
        }
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: t */
    public final void mo5358t(double d3, int i13) {
        switch (this.f158408z) {
            case 0:
                ((C37028e) this.f158407E).mo5358t(d3, i13);
                return;
            case 1:
                m118836b();
                ((InterfaceC34735h) this.f158407E).mo5435t(d3, i13);
                return;
            default:
                m118836b();
                AbstractC17269i.m48901l0(25, "column index out of range");
                throw null;
        }
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: u */
    public final void mo5359u(int i13) {
        switch (this.f158408z) {
            case 0:
                ((C37028e) this.f158407E).mo5359u(i13);
                return;
            case 1:
                m118836b();
                ((InterfaceC34735h) this.f158407E).mo5436u(i13);
                return;
            default:
                m118836b();
                AbstractC17269i.m48901l0(25, "column index out of range");
                throw null;
        }
    }

    @Override // p578wb.AbstractC37029f, p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: w */
    public void mo5360w() {
        switch (this.f158408z) {
            case 0:
                ((C37028e) this.f158407E).mo5360w();
                break;
            case 1:
                m118836b();
                ((InterfaceC34735h) this.f158407E).mo5437w();
                break;
            default:
                super.mo5360w();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37027d(InterfaceC34728a db4, String sql, C37028e c37028e) {
        super(db4, sql);
        AbstractC22676k.m65750j(db4, "db");
        AbstractC22676k.m65750j(sql, "sql");
        this.f158407E = c37028e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37027d(InterfaceC34728a db4, String sql) {
        super(db4, sql);
        AbstractC22676k.m65750j(db4, "db");
        AbstractC22676k.m65750j(sql, "sql");
        this.f158407E = db4.mo109670r0(sql);
    }
}
