package h02;

import c13.AbstractC3855a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: h02.c0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJD\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR%\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019¨\u0006!"}, m65681d2 = {"Lh02/c0;", "Lm91/u;", "", "Lkd1/o;", "images", "Lh02/d0;", "productTag", "stackedImages", "<init>", "(Ljava/util/List;Lh02/d0;Ljava/util/List;)V", "a", "(Ljava/util/List;Lh02/d0;Ljava/util/List;)Lh02/c0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Lh02/d0;", "f", "()Lh02/d0;", "g", "e", "pages", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16565c0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<AbstractC22403o> images;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C16567d0 productTag;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<List<AbstractC22403o>> stackedImages;

    /* JADX WARN: Multi-variable type inference failed */
    public C16565c0(List<? extends AbstractC22403o> images, C16567d0 c16567d0, List<? extends List<? extends AbstractC22403o>> list) {
        AbstractC22676k.m65750j(images, "images");
        this.images = images;
        this.productTag = c16567d0;
        this.stackedImages = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C16565c0 m46932b(C16565c0 c16565c0, List list, C16567d0 c16567d0, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = c16565c0.images;
        }
        if ((i13 & 2) != 0) {
            c16567d0 = c16565c0.productTag;
        }
        if ((i13 & 4) != 0) {
            list2 = c16565c0.stackedImages;
        }
        return c16565c0.m46933a(list, c16567d0, list2);
    }

    /* JADX INFO: renamed from: a */
    public final C16565c0 m46933a(List<? extends AbstractC22403o> images, C16567d0 productTag, List<? extends List<? extends AbstractC22403o>> stackedImages) {
        AbstractC22676k.m65750j(images, "images");
        return new C16565c0(images, productTag, stackedImages);
    }

    /* JADX INFO: renamed from: c */
    public final List<AbstractC22403o> m46934c() {
        return this.images;
    }

    /* JADX INFO: renamed from: e */
    public final List<List<AbstractC22403o>> m46935e() {
        List<List<AbstractC22403o>> list = this.stackedImages;
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                return list;
            }
        }
        List<AbstractC22403o> list2 = this.images;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC37056f.m118958J((AbstractC22403o) it.next()));
        }
        return arrayList;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16565c0)) {
            return false;
        }
        C16565c0 c16565c0 = (C16565c0) other;
        return AbstractC22676k.m65745e(this.images, c16565c0.images) && AbstractC22676k.m65745e(this.productTag, c16565c0.productTag) && AbstractC22676k.m65745e(this.stackedImages, c16565c0.stackedImages);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C16567d0 getProductTag() {
        return this.productTag;
    }

    /* JADX INFO: renamed from: g */
    public final List<List<AbstractC22403o>> m46937g() {
        return this.stackedImages;
    }

    public int hashCode() {
        int iHashCode = this.images.hashCode() * 31;
        C16567d0 c16567d0 = this.productTag;
        int iHashCode2 = (iHashCode + (c16567d0 == null ? 0 : c16567d0.hashCode())) * 31;
        List<List<AbstractC22403o>> list = this.stackedImages;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        List<AbstractC22403o> list = this.images;
        C16567d0 c16567d0 = this.productTag;
        List<List<AbstractC22403o>> list2 = this.stackedImages;
        StringBuilder sb4 = new StringBuilder("ProductImageGalleryItemState(images=");
        sb4.append(list);
        sb4.append(", productTag=");
        sb4.append(c16567d0);
        sb4.append(", stackedImages=");
        return AbstractC3855a.m11829m(sb4, list2, ")");
    }

    public /* synthetic */ C16565c0(List list, C16567d0 c16567d0, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, c16567d0, (i13 & 4) != 0 ? null : list2);
    }
}
