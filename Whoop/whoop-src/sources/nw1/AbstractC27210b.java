package nw1;

import c41.C4094p4;
import c41.C4108r4;
import java.util.List;
import jx1.C22015f0;
import m83.AbstractC25265s;
import no1.C26993g;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import uw1.C35310c;
import xb3.AbstractC38176k;
import xb3.InterfaceC38174i;

/* JADX INFO: renamed from: nw1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Luw1/c$c;", "", "c", "(Luw1/c$c;)Ljava/lang/Integer;", "membership_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27210b {

    /* JADX INFO: renamed from: nw1.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f108924w = new a();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof C4094p4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final Integer m81942c(C35310c.c cVar) {
        List<C4108r4> listM12578a;
        C4094p4 c4094p4 = (C4094p4) AbstractC38176k.m122283s(AbstractC38176k.m122282r(AbstractC38176k.m122284t(AbstractC25265s.m74145r0(cVar.m112126b()), new C26993g(24)), a.f108924w));
        if (c4094p4 == null || (listM12578a = c4094p4.m12578a()) == null) {
            return null;
        }
        return Integer.valueOf(listM12578a.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final InterfaceC38174i m81943d(C22015f0 it) {
        AbstractC22676k.m65750j(it, "it");
        return AbstractC25265s.m74145r0(it.m62922a());
    }
}
