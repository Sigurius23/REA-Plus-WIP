package j23;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import h23.C16784a;
import hn.C17508p;
import i23.InterfaceC18016a;
import io.getstream.photoview.PhotoView;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import p144fc.AbstractC14345a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: j23.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C21263b extends AbstractC14345a {

    /* JADX INFO: renamed from: c */
    public final SparseArray f81173c;

    /* JADX INFO: renamed from: d */
    public SparseArray f81174d;

    /* JADX INFO: renamed from: e */
    public final Context f81175e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC18016a f81176f;

    /* JADX INFO: renamed from: g */
    public final boolean f81177g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f81178h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f81179i;

    public C21263b(Context context, ArrayList arrayList, InterfaceC18016a imageLoader, boolean z4) {
        AbstractC22676k.m65750j(imageLoader, "imageLoader");
        this.f81173c = new SparseArray();
        this.f81174d = new SparseArray();
        this.f81175e = context;
        this.f81176f = imageLoader;
        this.f81177g = z4;
        this.f81178h = arrayList;
        this.f81179i = new ArrayList();
    }

    @Override // p144fc.AbstractC14345a
    /* JADX INFO: renamed from: a */
    public final void mo4232a(ViewGroup viewGroup, int i13, Object item) {
        AbstractC22676k.m65750j(item, "item");
        if (item instanceof C21262a) {
            C21262a c21262a = (C21262a) item;
            viewGroup.removeView(c21262a.f81168a);
            c21262a.f81170c = false;
        }
    }

    @Override // p144fc.AbstractC14345a
    /* JADX INFO: renamed from: d */
    public final int mo28901d() {
        return this.f81178h.size();
    }

    @Override // p144fc.AbstractC14345a
    /* JADX INFO: renamed from: e */
    public final int mo40965e(Object item) {
        AbstractC22676k.m65750j(item, "item");
        return -2;
    }

    @Override // p144fc.AbstractC14345a
    /* JADX INFO: renamed from: h */
    public final Object mo4234h(ViewGroup viewGroup, int i13) {
        SparseArray<Parcelable> sparseParcelableArray;
        C21262a c21262a;
        SparseArray sparseArray = this.f81173c;
        int i14 = 0;
        C16784a c16784a = (C16784a) sparseArray.get(0);
        if (c16784a == null) {
            c16784a = new C16784a(this);
            sparseArray.put(0, c16784a);
        }
        ArrayList arrayList = c16784a.f64519b;
        while (true) {
            sparseParcelableArray = null;
            if (i14 >= arrayList.size()) {
                C21263b c21263b = c16784a.f64518a;
                PhotoView photoView = new PhotoView(c21263b.f81175e, null, 6);
                photoView.setEnabled(c21263b.f81177g);
                photoView.setOnViewDragListener(new C17508p(photoView, 21));
                c21262a = new C21262a(c21263b, photoView);
                c21263b.f81179i.add(c21262a);
                arrayList.add(c21262a);
                break;
            }
            c21262a = (C21262a) arrayList.get(i14);
            if (!c21262a.f81170c) {
                break;
            }
            i14++;
        }
        PhotoView photoView2 = c21262a.f81168a;
        c21262a.f81170c = true;
        c21262a.f81169b = i13;
        viewGroup.addView(photoView2);
        c21262a.f81169b = i13;
        C21263b c21263b2 = c21262a.f81172e;
        c21263b2.f81176f.loadImage(c21262a.f81171d, c21263b2.f81178h.get(i13));
        Parcelable parcelable = (Parcelable) this.f81174d.get(i13);
        if (parcelable != null && (parcelable instanceof Bundle)) {
            Bundle bundle = (Bundle) parcelable;
            if (bundle.containsKey("a")) {
                sparseParcelableArray = bundle.getSparseParcelableArray("a");
            }
        }
        if (sparseParcelableArray != null) {
            photoView2.restoreHierarchyState(sparseParcelableArray);
        }
        return c21262a;
    }

    @Override // p144fc.AbstractC14345a
    /* JADX INFO: renamed from: i */
    public final boolean mo4235i(View view, Object obj) {
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(obj, "obj");
        return (obj instanceof C21262a) && ((C21262a) obj).f81168a == view;
    }

    @Override // p144fc.AbstractC14345a
    /* JADX INFO: renamed from: l */
    public final void mo4236l(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null && (parcelable instanceof Bundle)) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("b");
            if (sparseParcelableArray == null) {
                sparseParcelableArray = new SparseArray();
            }
            this.f81174d = sparseParcelableArray;
        }
        super.mo4236l(parcelable, classLoader);
    }

    @Override // p144fc.AbstractC14345a
    /* JADX INFO: renamed from: m */
    public final Parcelable mo4237m() {
        ArrayList<C21262a> arrayList = new ArrayList();
        SparseArray sparseArray = this.f81173c;
        int size = sparseArray.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (size != sparseArray.size()) {
                throw new ConcurrentModificationException();
            }
            sparseArray.keyAt(i13);
            for (C21262a c21262a : ((C16784a) sparseArray.valueAt(i13)).f64519b) {
                if (c21262a.f81170c) {
                    arrayList.add(c21262a);
                }
            }
        }
        for (C21262a c21262a2 : arrayList) {
            SparseArray sparseArray2 = this.f81174d;
            int i14 = c21262a2.f81169b;
            SparseArray<Parcelable> sparseArray3 = new SparseArray<>();
            c21262a2.f81168a.saveHierarchyState(sparseArray3);
            Bundle bundle = new Bundle();
            bundle.putSparseParcelableArray("a", sparseArray3);
            sparseArray2.put(i14, bundle);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putSparseParcelableArray("b", this.f81174d);
        return bundle2;
    }
}
