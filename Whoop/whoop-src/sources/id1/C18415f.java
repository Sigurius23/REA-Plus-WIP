package id1;

import com.whoop.design.showcase.navigation.DesignShowcaseGalleryType;
import com.whoop.design.showcase.navigation.DesignShowcaseMenuType;
import com.whoop.design.util.AbstractC8693b;
import ed1.C13113b;
import g91.C15604c;
import gd1.InterfaceC15714a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25260n;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import wr2.AbstractC37575c;

/* JADX INFO: renamed from: id1.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lid1/f;", "", "Lgd1/a;", "Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;", "menuItemFactory", "Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;", "galleryItemFactory", "<init>", "(Lgd1/a;Lgd1/a;)V", "", "Led1/b;", "a", "()Ljava/util/List;", "Lg91/c;", "state", "Lid1/e;", "b", "(Lg91/c;)Lid1/e;", "Lgd1/a;", "design-showcase_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18415f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC15714a<DesignShowcaseMenuType> menuItemFactory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC15714a<DesignShowcaseGalleryType> galleryItemFactory;

    public C18415f(InterfaceC15714a<DesignShowcaseMenuType> menuItemFactory, InterfaceC15714a<DesignShowcaseGalleryType> galleryItemFactory) {
        AbstractC22676k.m65750j(menuItemFactory, "menuItemFactory");
        AbstractC22676k.m65750j(galleryItemFactory, "galleryItemFactory");
        this.menuItemFactory = menuItemFactory;
        this.galleryItemFactory = galleryItemFactory;
    }

    /* JADX INFO: renamed from: a */
    private final List<C13113b> m52998a() {
        ArrayList arrayList = new ArrayList();
        List listM74049W0 = AbstractC25260n.m74049W0(DesignShowcaseMenuType.values());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listM74049W0) {
            if (((DesignShowcaseMenuType) obj) != DesignShowcaseMenuType.COMPOSE_STRESS_TEST) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            List<InterfaceC25312u> listMo32936b = this.menuItemFactory.mo32936b((DesignShowcaseMenuType) it.next());
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : listMo32936b) {
                if (obj2 instanceof C13113b) {
                    arrayList3.add(obj2);
                }
            }
            arrayList.addAll(arrayList3);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final C18414e m52999b(C15604c state) {
        ArrayList arrayList;
        List<InterfaceC25312u> listM120636o;
        AbstractC22676k.m65750j(state, "state");
        Object itemType = state.getItemType();
        if (!(itemType instanceof DesignShowcaseMenuType)) {
            if (itemType instanceof DesignShowcaseGalleryType) {
                return new C18414e(AbstractC8693b.m21267a(), this.galleryItemFactory.mo32936b((DesignShowcaseGalleryType) state.getItemType()), this.galleryItemFactory.mo32935a((DesignShowcaseGalleryType) state.getItemType()));
            }
            throw new IllegalStateException("DesignShowcaseDomainState.itemType must be one of [DesignShowcaseMenuType, DesignShowcaseGalleryType]");
        }
        if (state.getSearchQuery().length() == 0) {
            listM120636o = this.menuItemFactory.mo32936b((DesignShowcaseMenuType) state.getItemType());
        } else {
            if (state.getItemType() == DesignShowcaseMenuType.ROOT) {
                List<C13113b> listM52998a = m52998a();
                arrayList = new ArrayList(AbstractC25267u.m74163i0(listM52998a, 10));
                Iterator<T> it = listM52998a.iterator();
                while (it.hasNext()) {
                    arrayList.add(C13113b.m36660g((C13113b) it.next(), null, null, null, null, true, null, 47, null));
                }
            } else {
                List<InterfaceC25312u> listMo32936b = this.menuItemFactory.mo32936b((DesignShowcaseMenuType) state.getItemType());
                arrayList = new ArrayList();
                for (Object obj : listMo32936b) {
                    if (obj instanceof C13113b) {
                        arrayList.add(obj);
                    }
                }
            }
            listM120636o = AbstractC37575c.m120636o(arrayList, state.getSearchQuery(), null, 2, null);
        }
        return new C18414e(AbstractC8693b.m21278l(state.getSearchQuery()), listM120636o, this.menuItemFactory.mo32935a((DesignShowcaseMenuType) state.getItemType()));
    }
}
