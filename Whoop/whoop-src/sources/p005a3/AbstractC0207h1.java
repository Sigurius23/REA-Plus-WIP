package p005a3;

import java.lang.reflect.Field;
import java.util.List;
import m83.AbstractC25260n;
import p026b2.AbstractC2316v;
import p026b2.C2298d;
import p026b2.InterfaceC2315u;
import p027b3.C2404l2;
import p027b3.InterfaceC2394j2;
import p715kotlin.jvm.internal.AbstractC22671h0;
import xb3.InterfaceC38174i;

/* JADX INFO: renamed from: a3.h1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0207h1 implements InterfaceC2315u, InterfaceC2394j2 {
    private C2404l2 _inspectorValues;

    public abstract AbstractC2316v create();

    @Override // p027b3.InterfaceC2394j2
    public final InterfaceC38174i getInspectableElements() {
        return m536j().m7400b();
    }

    @Override // p027b3.InterfaceC2394j2
    public final String getNameFallback() {
        return m536j().m7399a();
    }

    public void inspectableProperties(C2404l2 c2404l2) {
        int i13 = 0;
        List listM74041Q0 = AbstractC25260n.m74041Q0(getClass().getDeclaredFields(), new C2298d(i13));
        int size = listM74041Q0.size();
        while (i13 < size) {
            Field field = (Field) listM74041Q0.get(i13);
            if (!field.getDeclaringClass().isAssignableFrom(AbstractC0207h1.class)) {
                try {
                    field.setAccessible(true);
                    c2404l2.m7400b().m7292c(field.get(this), field.getName());
                } catch (IllegalAccessException | SecurityException unused) {
                }
            }
            i13++;
        }
    }

    /* JADX INFO: renamed from: j */
    public final C2404l2 m536j() {
        C2404l2 c2404l2 = this._inspectorValues;
        if (c2404l2 != null) {
            return c2404l2;
        }
        C2404l2 c2404l3 = new C2404l2();
        c2404l3.m7401c(AbstractC22671h0.f89337a.getOrCreateKotlinClass(getClass()).getSimpleName());
        inspectableProperties(c2404l3);
        this._inspectorValues = c2404l3;
        return c2404l3;
    }

    public abstract void update(AbstractC2316v abstractC2316v);
}
