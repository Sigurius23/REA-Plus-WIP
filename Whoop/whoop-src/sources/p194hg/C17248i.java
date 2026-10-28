package p194hg;

import java.util.Set;
import m83.AbstractC25265s;
import p097ds.AbstractC12314q;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hg.i */
/* JADX INFO: loaded from: classes6.dex */
public class C17248i {

    /* JADX INFO: renamed from: a */
    public final AbstractC12314q f66266a;

    /* JADX INFO: renamed from: b */
    public int f66267b;

    /* JADX INFO: renamed from: c */
    public final Set f66268c;

    public C17248i(AbstractC12314q kind, Set traits, int i13) {
        AbstractC22676k.m65750j(kind, "kind");
        AbstractC22676k.m65750j(traits, "traits");
        this.f66266a = kind;
        this.f66267b = 0;
        this.f66268c = traits;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("SdkFieldDescriptor.");
        sb4.append(this.f66266a);
        sb4.append("(traits=");
        return AbstractC25012a.m73377j(sb4, AbstractC25265s.m74110N0(this.f66268c, ",", null, null, null, 62), ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17248i(AbstractC12314q kind, Set traits) {
        this(kind, traits, 0);
        AbstractC22676k.m65750j(kind, "kind");
        AbstractC22676k.m65750j(traits, "traits");
    }
}
