package p715kotlin.jvm.internal;

import j93.InterfaceC21465f;
import java.io.Serializable;
import p000.AbstractC11266d;

/* JADX INFO: renamed from: kotlin.jvm.internal.a */
/* JADX INFO: loaded from: classes5.dex */
public class C22656a implements InterfaceC22668g, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public C22656a(int i13, Class cls, String str, String str2, int i14) {
        this(i13, i14, cls, AbstractC22660c.NO_RECEIVER, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22656a)) {
            return false;
        }
        C22656a c22656a = (C22656a) obj;
        return this.isTopLevel == c22656a.isTopLevel && this.arity == c22656a.arity && this.flags == c22656a.flags && AbstractC22676k.m65745e(this.receiver, c22656a.receiver) && AbstractC22676k.m65745e(this.owner, c22656a.owner) && this.name.equals(c22656a.name) && this.signature.equals(c22656a.signature);
    }

    @Override // p715kotlin.jvm.internal.InterfaceC22668g
    public int getArity() {
        return this.arity;
    }

    public InterfaceC21465f getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? AbstractC22671h0.f89337a.getOrCreateKotlinPackage(cls, "") : AbstractC22671h0.f89337a.getOrCreateKotlinClass(cls);
    }

    public int hashCode() {
        Object obj = this.receiver;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.owner;
        return ((((AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31, this.name), 31, this.signature) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        return AbstractC22671h0.f89337a.renderLambdaToString(this);
    }

    public C22656a(int i13, int i14, Class cls, Object obj, String str, String str2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = (i14 & 1) == 1;
        this.arity = i13;
        this.flags = i14 >> 1;
    }
}
