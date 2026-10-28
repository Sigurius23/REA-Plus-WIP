package x93;

import db3.EnumC11891c;
import java.lang.reflect.Type;
import java.util.Collection;
import m83.C25271y;
import ma3.InterfaceC25376e;
import o93.EnumC27738j;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x93.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C38133y extends AbstractC38106a0 implements InterfaceC25376e {

    /* JADX INFO: renamed from: a */
    public final Class f163242a;

    public C38133y(Class cls) {
        this.f163242a = cls;
    }

    @Override // x93.AbstractC38106a0
    /* JADX INFO: renamed from: b */
    public final Type mo122088b() {
        return this.f163242a;
    }

    /* JADX INFO: renamed from: c */
    public final EnumC27738j m122129c() {
        Class cls = Void.TYPE;
        Class cls2 = this.f163242a;
        if (AbstractC22676k.m65745e(cls2, cls)) {
            return null;
        }
        return EnumC11891c.m31930b(cls2.getName()).m31932d();
    }

    @Override // ma3.InterfaceC25373b
    public final Collection getAnnotations() {
        return C25271y.f99162w;
    }
}
