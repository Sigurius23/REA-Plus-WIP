package rw;

import com.nimbusds.jose.shaded.gson.JsonIOException;
import java.lang.reflect.Field;
import p000.AbstractC11266d;
import p440qw.InterfaceC30680o;
import p596ww.C37653a;
import tw.AbstractC34214c;

/* JADX INFO: renamed from: rw.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C31863m extends AbstractC31862l {

    /* JADX INFO: renamed from: b */
    public final InterfaceC30680o f132138b;

    public C31863m(InterfaceC30680o interfaceC30680o, C31864n c31864n) {
        super(c31864n);
        this.f132138b = interfaceC30680o;
    }

    @Override // rw.AbstractC31862l
    /* JADX INFO: renamed from: d */
    public final Object mo99048d() {
        return this.f132138b.construct();
    }

    @Override // rw.AbstractC31862l
    /* JADX INFO: renamed from: e */
    public final Object mo99049e(Object obj) {
        return obj;
    }

    @Override // rw.AbstractC31862l
    /* JADX INFO: renamed from: f */
    public final void mo99050f(Object obj, C37653a c37653a, C31861k c31861k) throws IllegalAccessException {
        Field field = c31861k.f132130b;
        Object objMo86132b = c31861k.f132134f.mo86132b(c37653a);
        if (objMo86132b == null && c31861k.f132135g) {
            return;
        }
        if (c31861k.f132136h) {
            throw new JsonIOException(AbstractC11266d.m30461o("Cannot set value of 'static final' ", AbstractC34214c.m108139d(field, false)));
        }
        field.set(obj, objMo86132b);
    }
}
