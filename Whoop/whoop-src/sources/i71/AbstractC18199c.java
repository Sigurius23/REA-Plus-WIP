package i71;

import androidx.compose.runtime.Composer;
import h71.C16993j;
import p390p1.C28635l;
import p390p1.C28655q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i71.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Li71/b;", "dataScrollerFactory", "Lh71/j;", "scrollableGraphState", "Li71/g;", "a", "(Li71/b;Lh71/j;Landroidx/compose/runtime/Composer;I)Li71/g;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18199c {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC18203g m52259a(C18198b dataScrollerFactory, C16993j scrollableGraphState, Composer composer, int i13) {
        AbstractC22676k.m65750j(dataScrollerFactory, "dataScrollerFactory");
        AbstractC22676k.m65750j(scrollableGraphState, "scrollableGraphState");
        InterfaceC18201e dataScrollerType = scrollableGraphState.getDataScrollerType();
        boolean z4 = (((i13 & 14) ^ 6) > 4 && ((C28655q) composer).m87153g(dataScrollerFactory)) || (i13 & 6) == 4;
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = z4 | c28655q.m87153g(dataScrollerType);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = dataScrollerFactory.m52258a(scrollableGraphState.getDataScrollerType());
            c28655q.m87172p0(objM87133R);
        }
        return (InterfaceC18203g) objM87133R;
    }
}
