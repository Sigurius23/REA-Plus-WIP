package androidx.room;

import p500tb.InterfaceC33687a;
import p518ub.InterfaceC34728a;
import p578wb.C37024a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.room.q0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1821q0 {
    public final void onCreate(InterfaceC34728a db4) {
        AbstractC22676k.m65750j(db4, "db");
    }

    public final void onDestructiveMigration(InterfaceC34728a db4) {
        AbstractC22676k.m65750j(db4, "db");
    }

    public final void onOpen(InterfaceC33687a connection) {
        AbstractC22676k.m65750j(connection, "connection");
        if (connection instanceof C37024a) {
            onOpen(((C37024a) connection).f158399w);
        }
    }

    public abstract void onOpen(InterfaceC34728a interfaceC34728a);

    public final void onCreate(InterfaceC33687a connection) {
        AbstractC22676k.m65750j(connection, "connection");
        if (connection instanceof C37024a) {
            onCreate(((C37024a) connection).f158399w);
        }
    }

    public final void onDestructiveMigration(InterfaceC33687a connection) {
        AbstractC22676k.m65750j(connection, "connection");
        if (connection instanceof C37024a) {
            onDestructiveMigration(((C37024a) connection).f158399w);
        }
    }
}
