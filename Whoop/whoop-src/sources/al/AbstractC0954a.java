package al;

import ab3.C0714f;
import android.graphics.RenderEffect;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m83.AbstractC25265s;
import o63.C27613d;
import o63.InterfaceC27623n;
import oa3.InterfaceC27771n;
import oa3.InterfaceC27772o;
import p077d0.C11421z1;
import p119ej.C13224a;
import p390p1.AbstractC28683x;
import p616xi.InterfaceC38318f;
import p715kotlin.jvm.internal.AbstractC22676k;
import s93.InterfaceC32299a;
import s93.InterfaceC32307i;
import tl.AbstractC33913l;
import va3.C35845c;
import va3.C35850h;

/* JADX INFO: renamed from: al.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0954a implements InterfaceC27623n, InterfaceC27772o, InterfaceC32299a, InterfaceC38318f {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f3535w;

    /* JADX INFO: renamed from: x */
    public Object f3536x;

    public /* synthetic */ AbstractC0954a(Object obj, int i13) {
        this.f3535w = i13;
        this.f3536x = obj;
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m2412r0(int i13) {
        String str = i13 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i13 != 1 ? 3 : 2];
        if (i13 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i13 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i13 != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i13 == 1) {
            throw new IllegalStateException(str2);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public void m2413A0(InterfaceC0962i interfaceC0962i) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f3536x;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(interfaceC0962i);
        }
    }

    /* JADX INFO: renamed from: B0 */
    public abstract void mo2414B0(Object obj);

    /* JADX INFO: renamed from: C0 */
    public abstract void mo2415C0(C11421z1 c11421z1);

    /* JADX INFO: renamed from: D0 */
    public abstract void mo2416D0();

    @Override // o63.InterfaceC27623n
    /* JADX INFO: renamed from: E */
    public void mo2297E(String name, Iterable values) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(values, "values");
        List listM2425v0 = m2425v0(name);
        Iterator it = values.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            mo2418F0(str);
            listM2425v0.add(str);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public void mo2417E0(String name) {
        AbstractC22676k.m65750j(name, "name");
    }

    /* JADX INFO: renamed from: F0 */
    public void mo2418F0(String value) {
        AbstractC22676k.m65750j(value, "value");
    }

    @Override // oa3.InterfaceC27772o
    /* JADX INFO: renamed from: G */
    public void mo171G(C35845c c35845c, C35850h c35850h) {
    }

    /* JADX INFO: renamed from: G0 */
    public abstract void mo2419G0(String[] strArr);

    @Override // oa3.InterfaceC27772o
    /* JADX INFO: renamed from: X */
    public void mo181X(C0714f c0714f) {
    }

    @Override // oa3.InterfaceC27772o
    /* JADX INFO: renamed from: Y */
    public void mo182Y(Object obj) {
        if (obj instanceof String) {
            ((ArrayList) this.f3536x).add((String) obj);
        }
    }

    @Override // o63.InterfaceC27623n
    /* JADX INFO: renamed from: b */
    public Set mo2319b() {
        Set setEntrySet = ((Map) this.f3536x).entrySet();
        AbstractC22676k.m65750j(setEntrySet, "<this>");
        Set setUnmodifiableSet = Collections.unmodifiableSet(setEntrySet);
        AbstractC22676k.m65749i(setUnmodifiableSet, "unmodifiableSet(this)");
        return setUnmodifiableSet;
    }

    @Override // s93.InterfaceC32299a
    public InterfaceC32307i getAnnotations() {
        InterfaceC32307i interfaceC32307i = (InterfaceC32307i) this.f3536x;
        if (interfaceC32307i != null) {
            return interfaceC32307i;
        }
        m2412r0(1);
        throw null;
    }

    @Override // oa3.InterfaceC27772o
    /* JADX INFO: renamed from: i0 */
    public InterfaceC27771n mo192i0(C35845c c35845c) {
        return null;
    }

    @Override // oa3.InterfaceC27772o
    /* JADX INFO: renamed from: l */
    public void mo195l() {
        mo2419G0((String[]) ((ArrayList) this.f3536x).toArray(new String[0]));
    }

    @Override // p616xi.InterfaceC38318f
    /* JADX INFO: renamed from: m0 */
    public List mo2420m0() {
        return (List) this.f3536x;
    }

    @Override // p616xi.InterfaceC38318f
    /* JADX INFO: renamed from: p0 */
    public boolean mo2421p0() {
        List list = (List) this.f3536x;
        return list.isEmpty() || (list.size() == 1 && ((C13224a) list.get(0)).m37125c());
    }

    /* JADX INFO: renamed from: s0 */
    public void m2422s0(String name, String value) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(value, "value");
        mo2418F0(value);
        m2425v0(name).add(value);
    }

    /* JADX INFO: renamed from: t0 */
    public RenderEffect m2423t0() {
        RenderEffect renderEffect = (RenderEffect) this.f3536x;
        if (renderEffect != null) {
            return renderEffect;
        }
        RenderEffect renderEffectMo2424u0 = mo2424u0();
        this.f3536x = renderEffectMo2424u0;
        return renderEffectMo2424u0;
    }

    public String toString() {
        switch (this.f3535w) {
            case 7:
                StringBuilder sb4 = new StringBuilder();
                List list = (List) this.f3536x;
                if (!list.isEmpty()) {
                    sb4.append("values=");
                    sb4.append(Arrays.toString(list.toArray()));
                }
                return sb4.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u0 */
    public abstract RenderEffect mo2424u0();

    /* JADX INFO: renamed from: v0 */
    public List m2425v0(String str) {
        Map map = (Map) this.f3536x;
        List list = (List) map.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        mo2417E0(str);
        map.put(str, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: w0 */
    public String m2426w0(String str) {
        List listM2427x0 = m2427x0(str);
        if (listM2427x0 != null) {
            return (String) AbstractC25265s.m74100H0(listM2427x0);
        }
        return null;
    }

    /* JADX INFO: renamed from: x0 */
    public List m2427x0(String name) {
        AbstractC22676k.m65750j(name, "name");
        return (List) ((Map) this.f3536x).get(name);
    }

    /* JADX INFO: renamed from: y0 */
    public abstract Object mo2428y0();

    /* JADX INFO: renamed from: z0 */
    public abstract Object mo2429z0();

    public AbstractC0954a(int i13) {
        this.f3535w = i13;
        switch (i13) {
            case 1:
                this.f3536x = AbstractC28683x.m87272z(Boolean.FALSE);
                break;
            case 2:
                break;
            case 3:
                this.f3536x = new C27613d();
                break;
            case 4:
            default:
                char[] cArr = AbstractC33913l.f142093a;
                this.f3536x = new ArrayDeque(20);
                break;
            case 5:
                this.f3536x = new ArrayList();
                break;
        }
    }

    public AbstractC0954a(InterfaceC32307i interfaceC32307i) {
        this.f3535w = 6;
        if (interfaceC32307i != null) {
            this.f3536x = interfaceC32307i;
        } else {
            m2412r0(0);
            throw null;
        }
    }
}
