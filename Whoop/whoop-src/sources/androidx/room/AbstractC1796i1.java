package androidx.room;

import l83.InterfaceC23457c;
import p518ub.InterfaceC34728a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.room.i1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1796i1 {
    public final int version;

    public AbstractC1796i1(int i13) {
        this.version = i13;
    }

    public abstract void createAllTables(InterfaceC34728a interfaceC34728a);

    public abstract void dropAllTables(InterfaceC34728a interfaceC34728a);

    public abstract void onCreate(InterfaceC34728a interfaceC34728a);

    public abstract void onOpen(InterfaceC34728a interfaceC34728a);

    public abstract void onPostMigrate(InterfaceC34728a interfaceC34728a);

    public abstract void onPreMigrate(InterfaceC34728a interfaceC34728a);

    public abstract C1800j1 onValidateSchema(InterfaceC34728a interfaceC34728a);

    @InterfaceC23457c
    public void validateMigration(InterfaceC34728a db4) {
        AbstractC22676k.m65750j(db4, "db");
        throw new UnsupportedOperationException("validateMigration is deprecated");
    }
}
