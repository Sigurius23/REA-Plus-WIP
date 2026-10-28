package p549vb;

import android.database.sqlite.SQLiteStatement;
import androidx.room.C1810m1;
import p518ub.InterfaceC34735h;

/* JADX INFO: renamed from: vb.j */
/* JADX INFO: loaded from: classes.dex */
public final class C35865j extends C1810m1 implements InterfaceC34735h {

    /* JADX INFO: renamed from: y */
    public final SQLiteStatement f152694y;

    public C35865j(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f152694y = sQLiteStatement;
    }

    @Override // p518ub.InterfaceC34735h
    /* JADX INFO: renamed from: F */
    public final int mo109676F() {
        return this.f152694y.executeUpdateDelete();
    }

    @Override // p518ub.InterfaceC34735h
    public final void execute() {
        this.f152694y.execute();
    }

    @Override // p518ub.InterfaceC34735h
    /* JADX INFO: renamed from: i0 */
    public final long mo109677i0() {
        return this.f152694y.executeInsert();
    }
}
