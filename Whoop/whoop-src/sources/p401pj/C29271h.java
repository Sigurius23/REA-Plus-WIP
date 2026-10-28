package p401pj;

import a73.C0527b;
import a73.C0530e;
import af3.AbstractC0844t;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.widget.TextView;
import b30.C2570m;
import bf3.C3203b;
import d73.C11763a;
import e73.C12804c;
import f73.C14231a;
import g73.C15553a;
import g73.C15556d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m63.C25126d;
import o20.C27456a;
import p012ab.C0684i0;
import p047c9.C4320k;
import p171g9.C15594k;
import p408q.C29662f;
import p671z5.C40084b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import z40.C40062i;
import z63.AbstractC40129a;
import z63.C40132d;
import z63.C40134f;
import z63.C40135g;
import z63.C40136h;

/* JADX INFO: renamed from: pj.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C29271h extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Context f118457w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f118458x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f118459y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ String f118460z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29271h(Context context, long j7, Function1 function1, String str) {
        super(1);
        this.f118457w = context;
        this.f118458x = j7;
        this.f118459y = function1;
        this.f118460z = str;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TextView it = (TextView) obj;
        AbstractC22676k.m65750j(it, "it");
        Context context = this.f118457w;
        AbstractC22676k.m65750j(context, "context");
        ArrayList arrayList = new ArrayList(3);
        TextView.BufferType bufferType = TextView.BufferType.SPANNABLE;
        arrayList.add(new C0527b());
        arrayList.add(new C0527b());
        float f13 = context.getResources().getDisplayMetrics().density;
        C4320k c4320k = new C4320k();
        c4320k.f17542y = -1;
        c4320k.f17541x = (int) ((4 * f13) + 0.5f);
        c4320k.f17542y = (int) ((1 * f13) + 0.5f);
        arrayList.add(new C12804c(new C4320k(c4320k)));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.textColorLink});
        try {
            int color = typedArrayObtainStyledAttributes.getColor(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.colorBackground});
            try {
                int color2 = typedArrayObtainStyledAttributes2.getColor(0, 0);
                typedArrayObtainStyledAttributes2.recycle();
                arrayList.add(new C12804c(new C14231a(color, color, color2)));
                arrayList.add(new C11763a(0));
                arrayList.add(new C11763a(1));
                arrayList.add(new C29278l(this.f118458x, this.f118459y));
                if (arrayList.isEmpty()) {
                    throw new IllegalStateException("No plugins were added to this builder. Use #usePlugin method to add them");
                }
                C40132d c40132d = new C40132d();
                c40132d.f173183w = arrayList;
                c40132d.f173184x = new ArrayList(arrayList.size());
                c40132d.f173185y = new HashSet(3);
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    c40132d.m128676a((AbstractC40129a) it3.next());
                }
                ArrayList<AbstractC40129a> arrayList2 = (ArrayList) c40132d.f173184x;
                C0684i0 c0684i0 = new C0684i0(1);
                float f14 = context.getResources().getDisplayMetrics().density;
                C0530e c0530e = new C0530e();
                c0530e.f1838e = -1;
                c0530e.f1839f = -1;
                c0530e.f1837d = (int) ((8 * f14) + 0.5f);
                c0530e.f1834a = (int) ((24 * f14) + 0.5f);
                c0530e.f1835b = (int) ((4 * f14) + 0.5f);
                c0530e.f1836c = (int) ((1 * f14) + 0.5f);
                c0530e.f1838e = (int) ((1 * f14) + 0.5f);
                c0530e.f1839f = (int) ((4 * f14) + 0.5f);
                C25126d c25126d = new C25126d(13);
                C15594k c15594k = new C15594k(2);
                C15594k c15594k2 = new C15594k(1);
                for (AbstractC40129a abstractC40129a : arrayList2) {
                    abstractC40129a.mo31501c(c0684i0);
                    abstractC40129a.mo1294e(c15594k);
                    abstractC40129a.mo1293d(c15594k2);
                }
                C0530e c0530e2 = new C0530e();
                c0530e2.f1834a = c0530e.f1834a;
                c0530e2.f1835b = c0530e.f1835b;
                c0530e2.f1836c = c0530e.f1836c;
                c0530e2.f1837d = c0530e.f1837d;
                c0530e2.f1838e = c0530e.f1838e;
                c0530e2.f1839f = c0530e.f1839f;
                C27456a c27456a = new C27456a(Collections.unmodifiableMap(c15594k2.f58544a));
                c25126d.f98484x = c0530e2;
                c25126d.f98482H = c27456a;
                if (((C15553a) c25126d.f98485y) == null) {
                    c25126d.f98485y = new C15553a(0);
                }
                if (((C15553a) c25126d.f98486z) == null) {
                    c25126d.f98486z = new C15553a(12);
                }
                if (((C40084b) c25126d.f98479E) == null) {
                    c25126d.f98479E = new C40084b();
                }
                if (((C15553a) c25126d.f98480F) == null) {
                    c25126d.f98480F = new C15553a(4);
                }
                if (((C15556d) c25126d.f98481G) == null) {
                    c25126d.f98481G = new C15556d(0);
                }
                C2570m c2570m = new C2570m(c25126d);
                C3203b c3203b = new C3203b(c0684i0);
                List listUnmodifiableList = Collections.unmodifiableList(arrayList2);
                Iterator it4 = listUnmodifiableList.iterator();
                while (it4.hasNext()) {
                    ((AbstractC40129a) it4.next()).getClass();
                }
                AbstractC0844t abstractC0844tM9251a = c3203b.m9251a(this.f118460z);
                Iterator it5 = listUnmodifiableList.iterator();
                while (it5.hasNext()) {
                    ((AbstractC40129a) it5.next()).mo35876a();
                }
                C29662f c29662f = new C29662f(c2570m, new C15594k(3), new C40136h(), Collections.unmodifiableMap(c15594k.f58544a), new C40062i());
                abstractC0844tM9251a.mo2029a(c29662f);
                Iterator it6 = listUnmodifiableList.iterator();
                while (it6.hasNext()) {
                    ((AbstractC40129a) it6.next()).getClass();
                }
                C40136h c40136h = (C40136h) c29662f.f121232z;
                C40135g c40135g = new C40135g(c40136h.f173190w);
                for (C40134f c40134f : c40136h.f173191x) {
                    c40135g.setSpan(c40134f.f173186a, c40134f.f173187b, c40134f.f173188c, c40134f.f173189d);
                }
                it.setText(c40135g, TextView.BufferType.SPANNABLE);
                return C23454a0.f92919a;
            } catch (Throwable th3) {
                typedArrayObtainStyledAttributes2.recycle();
                throw th3;
            }
        } catch (Throwable th4) {
            typedArrayObtainStyledAttributes.recycle();
            throw th4;
        }
    }
}
