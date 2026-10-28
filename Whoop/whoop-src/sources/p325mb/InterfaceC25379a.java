package p325mb;

import p500tb.InterfaceC33687a;
import p518ub.InterfaceC34728a;
import p578wb.C37024a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: mb.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC25379a {
    /* JADX INFO: renamed from: d */
    void mo19644d(InterfaceC34728a interfaceC34728a);

    /* JADX INFO: renamed from: f */
    default void mo19645f(InterfaceC33687a connection) {
        AbstractC22676k.m65750j(connection, "connection");
        if (connection instanceof C37024a) {
            mo19644d(((C37024a) connection).f158399w);
        }
    }
}
