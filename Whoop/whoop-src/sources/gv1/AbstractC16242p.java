package gv1;

import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import v41.InterfaceC35689r0;

/* JADX INFO: renamed from: gv1.p */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lgv1/o;", "Lv41/r0;", "b", "(Lgv1/o;)Lv41/r0;", "Lkd1/o;", "a", "(Lgv1/o;)Lkd1/o;", "lottie-tester_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16242p {
    /* JADX INFO: renamed from: a */
    public static final AbstractC22403o m46025a(AbstractC16241o abstractC16241o) {
        AbstractC22676k.m65750j(abstractC16241o, "<this>");
        if (abstractC16241o instanceof AbstractC16241o.b) {
            return new AbstractC22403o.c(((AbstractC16241o.b) abstractC16241o).getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String(), 0, 0, 0, 14, null);
        }
        if (abstractC16241o instanceof AbstractC16241o.a) {
            return new AbstractC22403o.c(((AbstractC16241o.a) abstractC16241o).getUri(), 0, 0, 0, 14, null);
        }
        if ((abstractC16241o instanceof AbstractC16241o.d) || (abstractC16241o instanceof AbstractC16241o.c)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC35689r0 m46026b(AbstractC16241o abstractC16241o) {
        AbstractC22676k.m65750j(abstractC16241o, "<this>");
        if (abstractC16241o instanceof AbstractC16241o.d) {
            return InterfaceC35689r0.e.m113134a(InterfaceC35689r0.e.m113135b(((AbstractC16241o.d) abstractC16241o).getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String()));
        }
        if (abstractC16241o instanceof AbstractC16241o.c) {
            return InterfaceC35689r0.c.m113122a(InterfaceC35689r0.c.m113123b(((AbstractC16241o.c) abstractC16241o).getJson()));
        }
        if ((abstractC16241o instanceof AbstractC16241o.b) || (abstractC16241o instanceof AbstractC16241o.a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
