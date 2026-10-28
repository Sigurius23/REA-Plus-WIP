package p325mb;

import l83.C23464j;
import p500tb.InterfaceC33687a;
import p518ub.InterfaceC34728a;
import p578wb.C37024a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: mb.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC25380b {
    public final int endVersion;
    public final int startVersion;

    public AbstractC25380b(int i13, int i14) {
        this.startVersion = i13;
        this.endVersion = i14;
    }

    public void migrate(InterfaceC34728a db4) {
        AbstractC22676k.m65750j(db4, "db");
        throw new C23464j("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }

    public void migrate(InterfaceC33687a connection) {
        AbstractC22676k.m65750j(connection, "connection");
        if (connection instanceof C37024a) {
            migrate(((C37024a) connection).f158399w);
            return;
        }
        throw new C23464j("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
    }
}
