package qc3;

import aa3.C0656u0;
import java.util.ArrayList;
import p715kotlin.jvm.internal.AbstractC22676k;
import sc3.C32390d;
import sc3.C32394h;

/* JADX INFO: renamed from: qc3.b */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC30225b extends InterfaceC30262o {
    @Override // qc3.InterfaceC30262o
    /* JADX INFO: renamed from: a */
    default void mo92505a(String value) {
        AbstractC22676k.m65750j(value, "value");
        mo92501c().m1637f(new C32394h(value));
    }

    default C32390d build() {
        ArrayList formats = mo92501c().f2286a;
        AbstractC22676k.m65750j(formats, "formats");
        return new C32390d(formats);
    }

    /* JADX INFO: renamed from: c */
    C0656u0 mo92501c();

    /* JADX INFO: renamed from: f */
    InterfaceC30225b mo92503f();
}
