package ia3;

import androidx.lifecycle.C1591h2;
import dc3.C11934s;
import ja3.C21510f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kb3.C22342k;
import ma3.InterfaceC25377f;
import p692zt.C41113q;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31138l;
import r93.InterfaceC31165x0;
import x93.C38108b0;

/* JADX INFO: renamed from: ia3.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C18299e implements InterfaceC18300f {

    /* JADX INFO: renamed from: a */
    public final C41113q f71255a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC31138l f71256b;

    /* JADX INFO: renamed from: c */
    public final int f71257c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f71258d;

    /* JADX INFO: renamed from: e */
    public final C1591h2 f71259e;

    public C18299e(C41113q c3, InterfaceC31138l interfaceC31138l, InterfaceC25377f typeParameterOwner, int i13) {
        AbstractC22676k.m65750j(c3, "c");
        AbstractC22676k.m65750j(typeParameterOwner, "typeParameterOwner");
        this.f71255a = c3;
        this.f71256b = interfaceC31138l;
        this.f71257c = i13;
        ArrayList typeParameters = typeParameterOwner.getTypeParameters();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = typeParameters.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i14));
            i14++;
        }
        this.f71258d = linkedHashMap;
        this.f71259e = ((C22342k) ((C18295a) this.f71255a.f177224x).f71223a).m64224c(new C11934s(this, 6));
    }

    @Override // ia3.InterfaceC18300f
    /* JADX INFO: renamed from: a */
    public final InterfaceC31165x0 mo52687a(C38108b0 javaTypeParameter) {
        AbstractC22676k.m65750j(javaTypeParameter, "javaTypeParameter");
        C21510f0 c21510f0 = (C21510f0) this.f71259e.invoke(javaTypeParameter);
        return c21510f0 != null ? c21510f0 : ((InterfaceC18300f) this.f71255a.f177225y).mo52687a(javaTypeParameter);
    }
}
