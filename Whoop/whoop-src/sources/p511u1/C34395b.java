package p511u1;

import d93.InterfaceC11823d;
import java.util.NoSuchElementException;
import m83.C25266t;

/* JADX INFO: renamed from: u1.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C34395b extends C34394a implements InterfaceC11823d {

    /* JADX INFO: renamed from: y */
    public final C25266t f144599y;

    /* JADX INFO: renamed from: z */
    public Object f144600z;

    public C34395b(C25266t c25266t, Object obj, Object obj2) {
        super(obj, obj2);
        this.f144599y = c25266t;
        this.f144600z = obj2;
    }

    @Override // p511u1.C34394a, java.util.Map.Entry
    public final Object getValue() {
        return this.f144600z;
    }

    @Override // p511u1.C34394a, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f144600z;
        this.f144600z = obj;
        C34399f c34399f = (C34399f) this.f144599y.f99160x;
        C34398e c34398e = c34399f.f144616z;
        Object obj3 = this.f144597w;
        if (!c34398e.containsKey(obj3)) {
            return obj2;
        }
        boolean z4 = c34399f.f144606y;
        if (!z4) {
            c34398e.put(obj3, obj);
        } else {
            if (!z4) {
                throw new NoSuchElementException();
            }
            AbstractC34409p abstractC34409p = c34399f.f144604w[c34399f.f144605x];
            Object obj4 = abstractC34409p.f144628w[abstractC34409p.f144630y];
            c34398e.put(obj3, obj);
            c34399f.m108765c(obj4 != null ? obj4.hashCode() : 0, c34398e.f144611y, obj4, 0);
        }
        c34399f.f144615G = c34398e.f144607E;
        return obj2;
    }
}
