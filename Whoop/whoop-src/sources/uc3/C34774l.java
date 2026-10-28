package uc3;

import java.util.List;
import m83.AbstractC25265s;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: uc3.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C34774l {

    /* JADX INFO: renamed from: a */
    public final List f146442a;

    /* JADX INFO: renamed from: b */
    public final List f146443b;

    public C34774l(List operations, List followedBy) {
        AbstractC22676k.m65750j(operations, "operations");
        AbstractC22676k.m65750j(followedBy, "followedBy");
        this.f146442a = operations;
        this.f146443b = followedBy;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(AbstractC25265s.m74110N0(this.f146442a, ", ", null, null, null, 62));
        sb4.append('(');
        return AbstractC25012a.m73377j(sb4, AbstractC25265s.m74110N0(this.f146443b, ";", null, null, null, 62), ')');
    }
}
