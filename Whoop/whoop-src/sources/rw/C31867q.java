package rw;

import java.util.concurrent.ConcurrentHashMap;
import p000.AbstractC11266d;
import p133f1.C13968p1;
import p384ow.AbstractC28430z;
import p384ow.C28417m;
import p384ow.InterfaceC28405a0;
import p440qw.AbstractC30672g;
import p563vw.C36540a;
import pw.InterfaceC29582a;

/* JADX INFO: renamed from: rw.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C31867q implements InterfaceC28405a0 {

    /* JADX INFO: renamed from: z */
    public static final C31851a f132151z = new C31851a(3);

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f132152w;

    /* JADX INFO: renamed from: x */
    public final Object f132153x;

    /* JADX INFO: renamed from: y */
    public final Object f132154y;

    public /* synthetic */ C31867q(Class cls, AbstractC28430z abstractC28430z, int i13) {
        this.f132152w = i13;
        this.f132153x = cls;
        this.f132154y = abstractC28430z;
    }

    @Override // p384ow.InterfaceC28405a0
    /* JADX INFO: renamed from: a */
    public final AbstractC28430z mo86129a(C28417m c28417m, C36540a c36540a) {
        switch (this.f132152w) {
            case 0:
                if (c36540a.f156459a == ((Class) this.f132153x)) {
                    return (AbstractC28430z) this.f132154y;
                }
                return null;
            case 1:
                Class<?> cls = c36540a.f156459a;
                if (((Class) this.f132153x).isAssignableFrom(cls)) {
                    return new C31852b(3, this, cls);
                }
                return null;
            default:
                InterfaceC29582a interfaceC29582a = (InterfaceC29582a) c36540a.f156459a.getAnnotation(InterfaceC29582a.class);
                if (interfaceC29582a == null) {
                    return null;
                }
                return m99054b((C13968p1) this.f132153x, c28417m, c36540a, interfaceC29582a, true);
        }
    }

    /* JADX INFO: renamed from: b */
    public AbstractC28430z m99054b(C13968p1 c13968p1, C28417m c28417m, C36540a c36540a, InterfaceC29582a interfaceC29582a, boolean z4) {
        AbstractC28430z abstractC28430zMo86129a;
        Object objConstruct = c13968p1.m39754j(new C36540a(interfaceC29582a.value()), true).construct();
        boolean zNullSafe = interfaceC29582a.nullSafe();
        if (objConstruct instanceof AbstractC28430z) {
            abstractC28430zMo86129a = (AbstractC28430z) objConstruct;
        } else {
            if (!(objConstruct instanceof InterfaceC28405a0)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objConstruct.getClass().getName() + " as a @JsonAdapter for " + AbstractC30672g.m94275k(c36540a.f156460b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            InterfaceC28405a0 interfaceC28405a0 = (InterfaceC28405a0) objConstruct;
            if (z4) {
                InterfaceC28405a0 interfaceC28405a1 = (InterfaceC28405a0) ((ConcurrentHashMap) this.f132154y).putIfAbsent(c36540a.f156459a, interfaceC28405a0);
                if (interfaceC28405a1 != null) {
                    interfaceC28405a0 = interfaceC28405a1;
                }
            }
            abstractC28430zMo86129a = interfaceC28405a0.mo86129a(c28417m, c36540a);
        }
        return (abstractC28430zMo86129a == null || !zNullSafe) ? abstractC28430zMo86129a : abstractC28430zMo86129a.m86145a();
    }

    public String toString() {
        switch (this.f132152w) {
            case 0:
                StringBuilder sb4 = new StringBuilder("Factory[type=");
                AbstractC11266d.m30443A((Class) this.f132153x, sb4, ",adapter=");
                sb4.append((AbstractC28430z) this.f132154y);
                sb4.append("]");
                return sb4.toString();
            case 1:
                StringBuilder sb5 = new StringBuilder("Factory[typeHierarchy=");
                AbstractC11266d.m30443A((Class) this.f132153x, sb5, ",adapter=");
                sb5.append((AbstractC28430z) this.f132154y);
                sb5.append("]");
                return sb5.toString();
            default:
                return super.toString();
        }
    }

    public C31867q(C13968p1 c13968p1) {
        this.f132152w = 2;
        this.f132153x = c13968p1;
        this.f132154y = new ConcurrentHashMap();
    }
}
