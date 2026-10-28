package f93;

import d13.AbstractC11478a;
import j93.InterfaceC21493z;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: f93.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14290b implements InterfaceC14292d {
    private Object value;

    public AbstractC14290b(Object obj) {
        this.value = obj;
    }

    public void afterChange(InterfaceC21493z property, Object obj, Object obj2) {
        AbstractC22676k.m65750j(property, "property");
    }

    public boolean beforeChange(InterfaceC21493z property, Object obj, Object obj2) {
        AbstractC22676k.m65750j(property, "property");
        return true;
    }

    @Override // f93.InterfaceC14291c
    public Object getValue(Object obj, InterfaceC21493z property) {
        AbstractC22676k.m65750j(property, "property");
        return this.value;
    }

    @Override // f93.InterfaceC14292d
    public void setValue(Object obj, InterfaceC21493z property, Object obj2) {
        AbstractC22676k.m65750j(property, "property");
        Object obj3 = this.value;
        if (beforeChange(property, obj3, obj2)) {
            this.value = obj2;
            afterChange(property, obj3, obj2);
        }
    }

    public String toString() {
        return AbstractC11478a.m30860l(new StringBuilder("ObservableProperty(value="), this.value, ')');
    }
}
