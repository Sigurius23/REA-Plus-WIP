package zz2;

import j93.InterfaceC21461d;
import java.util.Map;
import jb1.InterfaceC21539e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zz2.c */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007R*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lzz2/c;", "Ljb1/e;", "", "", "Lj93/d;", "models", "<init>", "(Ljava/util/Map;)V", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "whoop-status_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final class C41256c implements InterfaceC21539e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<String, InterfaceC21461d> models;

    /* JADX WARN: Multi-variable type inference failed */
    public C41256c(Map<String, ? extends InterfaceC21461d> models) {
        AbstractC22676k.m65750j(models, "models");
        this.models = models;
    }

    @Override // jb1.InterfaceC21539e
    /* JADX INFO: renamed from: a */
    public Map<String, InterfaceC21461d> mo1798a() {
        return this.models;
    }
}
