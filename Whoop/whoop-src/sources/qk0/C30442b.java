package qk0;

import c93.InterfaceC4339a;
import nj0.InterfaceC26750f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pk0.InterfaceC29333c;
import ut0.InterfaceC35229a;
import ut0.InterfaceC35230b;

/* JADX INFO: renamed from: qk0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, m65681d2 = {"Lqk0/b;", "Lut0/b;", "Lkotlin/Function0;", "Lpk0/c;", "readers", "<init>", "(Lc93/a;)V", "Lnj0/f;", "protocol", "Lut0/a;", "a", "(Lnj0/f;)Lut0/a;", "Lc93/a;", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30442b implements InterfaceC35230b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC4339a readers;

    public C30442b(InterfaceC4339a readers) {
        AbstractC22676k.m65750j(readers, "readers");
        this.readers = readers;
    }

    @Override // ut0.InterfaceC35230b
    /* JADX INFO: renamed from: a */
    public InterfaceC35229a mo93114a(InterfaceC26750f protocol) {
        AbstractC22676k.m65750j(protocol, "protocol");
        return new C30441a(protocol, (InterfaceC29333c) this.readers.invoke());
    }
}
