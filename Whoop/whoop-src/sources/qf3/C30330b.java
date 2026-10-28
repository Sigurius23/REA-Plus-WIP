package qf3;

import ag3.AbstractC0865a;
import c93.InterfaceC4351m;
import ih0.AbstractC18489d0;
import j93.InterfaceC21461d;
import java.util.Collection;
import m83.AbstractC25265s;
import m83.C25271y;
import p715kotlin.jvm.internal.AbstractC22676k;
import vf3.C35953c;
import vf3.InterfaceC35951a;
import wf3.C37247a;

/* JADX INFO: renamed from: qf3.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C30330b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC35951a f124470a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC21461d f124471b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC35951a f124472c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC4351m f124473d;

    /* JADX INFO: renamed from: e */
    public final int f124474e;

    /* JADX INFO: renamed from: f */
    public Object f124475f;

    public C30330b(InterfaceC35951a scopeQualifier, InterfaceC21461d primaryType, C35953c c35953c, InterfaceC4351m interfaceC4351m, int i13) {
        AbstractC22676k.m65750j(scopeQualifier, "scopeQualifier");
        AbstractC22676k.m65750j(primaryType, "primaryType");
        AbstractC18489d0.m53382w(i13, "kind");
        this.f124470a = scopeQualifier;
        this.f124471b = primaryType;
        this.f124472c = c35953c;
        this.f124473d = interfaceC4351m;
        this.f124474e = i13;
        this.f124475f = C25271y.f99162w;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC21461d m92688a() {
        return this.f124471b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type org.koin.core.definition.BeanDefinition<*>");
        }
        C30330b c30330b = (C30330b) obj;
        return AbstractC22676k.m65745e(this.f124471b, c30330b.f124471b) && AbstractC22676k.m65745e(this.f124472c, c30330b.f124472c) && AbstractC22676k.m65745e(this.f124470a, c30330b.f124470a);
    }

    public final int hashCode() {
        InterfaceC35951a interfaceC35951a = this.f124472c;
        return ((C35953c) this.f124470a).f153107a.hashCode() + ((this.f124471b.hashCode() + ((interfaceC35951a == null ? 0 : ((C35953c) interfaceC35951a).f153107a.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        String str;
        String strM65755o;
        int i13 = this.f124474e;
        if (i13 == 1) {
            str = "Singleton";
        } else if (i13 == 2) {
            str = "Factory";
        } else {
            if (i13 != 3) {
                throw null;
            }
            str = "Scoped";
        }
        String str2 = "'" + AbstractC0865a.m2111a(this.f124471b) + '\'';
        InterfaceC35951a interfaceC35951a = this.f124472c;
        if (interfaceC35951a == null || (strM65755o = AbstractC22676k.m65755o(interfaceC35951a, ",qualifier:")) == null) {
            strM65755o = "";
        }
        C35953c c35953c = C37247a.f159360e;
        InterfaceC35951a interfaceC35951a2 = this.f124470a;
        return "[" + str + ':' + str2 + strM65755o + (AbstractC22676k.m65745e(interfaceC35951a2, c35953c) ? "" : AbstractC22676k.m65755o(interfaceC35951a2, ",scope:")) + (((Collection) this.f124475f).isEmpty() ? "" : AbstractC22676k.m65755o(AbstractC25265s.m74110N0((Iterable) this.f124475f, ",", null, null, C30329a.f124469w, 30), ",binds:")) + ']';
    }
}
