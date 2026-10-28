package p716lb1;

import b81.C2799f;
import b81.C2803j;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.ItemVisibilityStateEnum;
import com.whoop.design.models.items.SelectionWidgetModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import l11.C23223e;
import l11.InterfaceC23222d;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r31.C30911f;
import r31.EnumC30910e;
import t31.C33527c;

/* JADX INFO: renamed from: lb1.j4 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "selectionWidgetMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23655j4 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93819a = Function1.m68251a(new C23740x3(25));

    /* JADX INFO: renamed from: lb1.j4$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93820a;

        static {
            int[] iArr = new int[ItemVisibilityStateEnum.values().length];
            try {
                iArr[ItemVisibilityStateEnum.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ItemVisibilityStateEnum.ENABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f93820a = iArr;
        }
    }

    /* JADX INFO: renamed from: lb1.j4$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93821w;

        public b(Function1 function1) {
            this.f93821w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93821w.invoke((SelectionWidgetModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m68927c() {
        return f93819a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m68928d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(SelectionWidgetModel.class), new b(new C23740x3(26)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C30911f m68929e(SelectionWidgetModel model) {
        EnumC30910e enumC30910e;
        AbstractC22676k.m65750j(model, "model");
        C21535a c21535aM60555e = AbstractC21537c.m60555e(null, 1, null);
        boolean z4 = model.getStatus() == ItemVisibilityStateEnum.DISABLED;
        InterfaceC25312u interfaceC25312uM60544l = c21535aM60555e.m60544l(model.getButton());
        if (z4 && (interfaceC25312uM60544l instanceof C23223e)) {
            interfaceC25312uM60544l = C23223e.m67193b((C23223e) interfaceC25312uM60544l, null, null, null, null, null, null, null, InterfaceC23222d.b.f91939a, false, null, null, null, 3967, null);
        }
        InterfaceC25312u interfaceC25312u = interfaceC25312uM60544l;
        List<InterfaceC25312u> listM60545m = c21535aM60555e.m60545m(model.getItems());
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM60545m, 10));
        for (Object objM7969b : listM60545m) {
            if (z4) {
                if (objM7969b instanceof C2803j) {
                    objM7969b = C2803j.m7983b((C2803j) objM7969b, 0, null, false, false, 0.0d, 23, null);
                } else if (objM7969b instanceof C2799f) {
                    C2799f c2799f = (C2799f) objM7969b;
                    List<InterfaceC25312u> listM7971c = c2799f.m7971c();
                    ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM7971c, 10));
                    for (Object objM7983b : listM7971c) {
                        if (objM7983b instanceof C2803j) {
                            objM7983b = C2803j.m7983b((C2803j) objM7983b, 0, null, false, false, 0.0d, 23, null);
                        }
                        arrayList2.add(objM7983b);
                    }
                    objM7969b = C2799f.m7969b(c2799f, null, arrayList2, null, 5, null);
                }
            }
            arrayList.add(objM7969b);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof C33527c) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(arrayList3, 10));
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList4.add(Integer.valueOf(((C33527c) it.next()).getSelectionId()));
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof C2799f) {
                arrayList5.add(obj2);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            List<InterfaceC25312u> listM7971c2 = ((C2799f) it3.next()).m7971c();
            ArrayList arrayList7 = new ArrayList();
            for (InterfaceC25312u interfaceC25312u2 : listM7971c2) {
                C2803j c2803j = interfaceC25312u2 instanceof C2803j ? (C2803j) interfaceC25312u2 : null;
                Integer numValueOf = c2803j != null ? Integer.valueOf(c2803j.getSelectionId()) : null;
                if (numValueOf != null) {
                    arrayList7.add(numValueOf);
                }
            }
            AbstractC25265s.m74141p0(arrayList6, arrayList7);
        }
        ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(arrayList4, arrayList6);
        String id4 = model.getId();
        String title = model.getTitle();
        int i13 = a.f93820a[model.getStatus().ordinal()];
        if (i13 == 1) {
            enumC30910e = EnumC30910e.DISABLED;
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            enumC30910e = EnumC30910e.ENABLED;
        }
        return new C30911f(id4, title, enumC30910e, arrayList, interfaceC25312u, arrayList4, arrayListM74129g1);
    }
}
