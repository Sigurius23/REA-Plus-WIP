package m83;

import c93.InterfaceC4339a;
import d93.InterfaceC11820a;
import java.util.Iterator;
import kotlinx.serialization.internal.EnumDescriptor;
import p002a0.C0030i1;
import p715kotlin.jvm.internal.AbstractC22681m0;
import yc3.InterfaceC39443g;

/* JADX INFO: renamed from: m83.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C25263q implements Iterable, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f99155w;

    /* JADX INFO: renamed from: x */
    public final Object f99156x;

    public /* synthetic */ C25263q(Object obj, int i13) {
        this.f99155w = i13;
        this.f99156x = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f99155w) {
            case 0:
                return AbstractC22681m0.m65777h((Object[]) this.f99156x);
            case 1:
                return new C25241d0((Iterator) ((InterfaceC4339a) this.f99156x).invoke());
            case 2:
                return new C0030i1((InterfaceC39443g) this.f99156x);
            default:
                return new C0030i1((EnumDescriptor) this.f99156x);
        }
    }
}
