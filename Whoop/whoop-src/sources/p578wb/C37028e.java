package p578wb;

import android.database.Cursor;
import hg3.AbstractC17269i;
import java.util.Arrays;
import p518ub.InterfaceC34728a;
import p715kotlin.jvm.internal.AbstractC22676k;
import u93.C34671d0;

/* JADX INFO: renamed from: wb.e */
/* JADX INFO: loaded from: classes.dex */
public final class C37028e extends AbstractC37029f {

    /* JADX INFO: renamed from: E */
    public long[] f158409E;

    /* JADX INFO: renamed from: F */
    public double[] f158410F;

    /* JADX INFO: renamed from: G */
    public String[] f158411G;

    /* JADX INFO: renamed from: H */
    public byte[][] f158412H;

    /* JADX INFO: renamed from: I */
    public Cursor f158413I;

    /* JADX INFO: renamed from: z */
    public int[] f158414z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37028e(InterfaceC34728a db4, String sql) {
        super(db4, sql);
        AbstractC22676k.m65750j(db4, "db");
        AbstractC22676k.m65750j(sql, "sql");
        this.f158414z = new int[0];
        this.f158409E = new long[0];
        this.f158410F = new double[0];
        this.f158411G = new String[0];
        this.f158412H = new byte[0][];
    }

    /* JADX INFO: renamed from: k */
    public static void m118832k(Cursor cursor, int i13) {
        if (i13 < 0 || i13 >= cursor.getColumnCount()) {
            AbstractC17269i.m48901l0(25, "column index out of range");
            throw null;
        }
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: J0 */
    public final String mo5353J0(int i13) {
        m118836b();
        Cursor cursorM118835m = m118835m();
        m118832k(cursorM118835m, i13);
        String string = cursorM118835m.getString(i13);
        AbstractC22676k.m65749i(string, "getString(...)");
        return string;
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: L */
    public final void mo5354L(int i13, String value) {
        AbstractC22676k.m65750j(value, "value");
        m118836b();
        m118833h(3, i13);
        this.f158414z[i13] = 3;
        this.f158411G[i13] = value;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.f158417y) {
            mo5360w();
            reset();
        }
        this.f158417y = true;
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: e1 */
    public final boolean mo5355e1() {
        m118836b();
        m118834i();
        Cursor cursor = this.f158413I;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // p500tb.InterfaceC33689c
    public final byte[] getBlob(int i13) {
        m118836b();
        Cursor cursorM118835m = m118835m();
        m118832k(cursorM118835m, i13);
        byte[] blob = cursorM118835m.getBlob(i13);
        AbstractC22676k.m65749i(blob, "getBlob(...)");
        return blob;
    }

    @Override // p500tb.InterfaceC33689c
    public final int getColumnCount() {
        m118836b();
        m118834i();
        Cursor cursor = this.f158413I;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // p500tb.InterfaceC33689c
    public final String getColumnName(int i13) {
        m118836b();
        m118834i();
        Cursor cursor = this.f158413I;
        if (cursor == null) {
            throw new IllegalStateException("Required value was null.");
        }
        m118832k(cursor, i13);
        String columnName = cursor.getColumnName(i13);
        AbstractC22676k.m65749i(columnName, "getColumnName(...)");
        return columnName;
    }

    @Override // p500tb.InterfaceC33689c
    public final double getDouble(int i13) {
        m118836b();
        Cursor cursorM118835m = m118835m();
        m118832k(cursorM118835m, i13);
        return cursorM118835m.getDouble(i13);
    }

    @Override // p500tb.InterfaceC33689c
    public final long getLong(int i13) {
        m118836b();
        Cursor cursorM118835m = m118835m();
        m118832k(cursorM118835m, i13);
        return cursorM118835m.getLong(i13);
    }

    /* JADX INFO: renamed from: h */
    public final void m118833h(int i13, int i14) {
        int i15 = i14 + 1;
        int[] iArr = this.f158414z;
        if (iArr.length < i15) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i15);
            AbstractC22676k.m65749i(iArrCopyOf, "copyOf(...)");
            this.f158414z = iArrCopyOf;
        }
        if (i13 == 1) {
            long[] jArr = this.f158409E;
            if (jArr.length < i15) {
                long[] jArrCopyOf = Arrays.copyOf(jArr, i15);
                AbstractC22676k.m65749i(jArrCopyOf, "copyOf(...)");
                this.f158409E = jArrCopyOf;
                return;
            }
            return;
        }
        if (i13 == 2) {
            double[] dArr = this.f158410F;
            if (dArr.length < i15) {
                double[] dArrCopyOf = Arrays.copyOf(dArr, i15);
                AbstractC22676k.m65749i(dArrCopyOf, "copyOf(...)");
                this.f158410F = dArrCopyOf;
                return;
            }
            return;
        }
        if (i13 == 3) {
            String[] strArr = this.f158411G;
            if (strArr.length < i15) {
                Object[] objArrCopyOf = Arrays.copyOf(strArr, i15);
                AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
                this.f158411G = (String[]) objArrCopyOf;
                return;
            }
            return;
        }
        if (i13 != 4) {
            return;
        }
        byte[][] bArr = this.f158412H;
        if (bArr.length < i15) {
            Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i15);
            AbstractC22676k.m65749i(objArrCopyOf2, "copyOf(...)");
            this.f158412H = (byte[][]) objArrCopyOf2;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m118834i() {
        if (this.f158413I == null) {
            this.f158413I = this.f158415w.mo109669l0(new C34671d0(this));
        }
    }

    @Override // p500tb.InterfaceC33689c
    public final boolean isNull(int i13) {
        m118836b();
        Cursor cursorM118835m = m118835m();
        m118832k(cursorM118835m, i13);
        return cursorM118835m.isNull(i13);
    }

    /* JADX INFO: renamed from: m */
    public final Cursor m118835m() {
        Cursor cursor = this.f158413I;
        if (cursor != null) {
            return cursor;
        }
        AbstractC17269i.m48901l0(21, "no row");
        throw null;
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: p */
    public final void mo5356p(int i13, long j7) {
        m118836b();
        m118833h(1, i13);
        this.f158414z[i13] = 1;
        this.f158409E[i13] = j7;
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: q */
    public final void mo5357q(int i13, byte[] value) {
        AbstractC22676k.m65750j(value, "value");
        m118836b();
        m118833h(4, i13);
        this.f158414z[i13] = 4;
        this.f158412H[i13] = value;
    }

    @Override // p578wb.AbstractC37029f, p500tb.InterfaceC33689c
    public final void reset() {
        m118836b();
        Cursor cursor = this.f158413I;
        if (cursor != null) {
            cursor.close();
        }
        this.f158413I = null;
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: t */
    public final void mo5358t(double d3, int i13) {
        m118836b();
        m118833h(2, i13);
        this.f158414z[i13] = 2;
        this.f158410F[i13] = d3;
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: u */
    public final void mo5359u(int i13) {
        m118836b();
        m118833h(5, i13);
        this.f158414z[i13] = 5;
    }

    @Override // p578wb.AbstractC37029f, p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: w */
    public final void mo5360w() {
        m118836b();
        this.f158414z = new int[0];
        this.f158409E = new long[0];
        this.f158410F = new double[0];
        this.f158411G = new String[0];
        this.f158412H = new byte[0][];
    }
}
