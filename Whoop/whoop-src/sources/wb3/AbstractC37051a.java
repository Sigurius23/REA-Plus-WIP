package wb3;

import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import j93.InterfaceC21456a0;
import j93.InterfaceC21461d;
import j93.InterfaceC21463e;
import ob3.InterfaceC27795e;
import ob3.InterfaceC27796f;
import ob3.InterfaceC27797g;
import ob3.InterfaceC27799i;
import ob3.InterfaceC27800j;
import p715kotlin.jvm.internal.InterfaceC22678l;
import p715kotlin.reflect.jvm.internal.ReflectProperties;
import p715kotlin.reflect.jvm.internal.ReflectionObjectRenderer;

/* JADX INFO: renamed from: wb3.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC37051a implements InterfaceC22678l, InterfaceC27795e, InterfaceC27796f, InterfaceC27799i, InterfaceC27800j {

    /* JADX INFO: renamed from: w */
    public final ReflectProperties.LazySoftVal f158537w;

    public AbstractC37051a(InterfaceC4339a interfaceC4339a) {
        ReflectProperties.LazySoftVal lazySoftValLazySoft = null;
        ReflectProperties.LazySoftVal lazySoftVal = interfaceC4339a instanceof ReflectProperties.LazySoftVal ? (ReflectProperties.LazySoftVal) interfaceC4339a : null;
        if (lazySoftVal != null) {
            lazySoftValLazySoft = lazySoftVal;
        } else if (interfaceC4339a != null) {
            lazySoftValLazySoft = ReflectProperties.lazySoft(interfaceC4339a);
        }
        this.f158537w = lazySoftValLazySoft;
    }

    /* JADX INFO: renamed from: a */
    public abstract InterfaceC21456a0 mo118940a();

    /* JADX INFO: renamed from: b */
    public abstract InterfaceC21461d mo118941b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo118942c();

    /* JADX INFO: renamed from: d */
    public abstract boolean mo118943d();

    /* JADX INFO: renamed from: e */
    public abstract boolean mo118944e();

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC37051a) && AbstractC5583n.m16774d0(C37066p.f158572w, this, (InterfaceC27797g) obj);
    }

    /* JADX INFO: renamed from: f */
    public abstract boolean mo118945f();

    /* JADX INFO: renamed from: g */
    public abstract AbstractC37051a mo118946g();

    /* JADX INFO: renamed from: h */
    public abstract AbstractC37051a mo118947h(boolean z4);

    public int hashCode() {
        InterfaceC21463e classifier = getClassifier();
        return Boolean.hashCode(isMarkedNullable()) + ((getArguments().hashCode() + ((classifier != null ? classifier.hashCode() : 0) * 31)) * 31);
    }

    /* JADX INFO: renamed from: i */
    public abstract AbstractC37051a mo118948i(boolean z4);

    /* JADX INFO: renamed from: j */
    public abstract AbstractC37051a mo118949j();

    public String toString() {
        return ReflectionObjectRenderer.renderType$default(ReflectionObjectRenderer.INSTANCE, this, false, 2, null);
    }
}
