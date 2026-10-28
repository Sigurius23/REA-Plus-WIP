package e73;

import af3.AbstractC0830f;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.RemoteViews;
import com.google.android.gms.common.C4986c;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.WeakHashMap;
import lr.RunnableC24693e;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p016an.C1053d;
import p031b9.AbstractC2875y;
import p035bp.AbstractC3511b;
import p047c9.C4320k;
import p095dp.AbstractC12240d;
import p184h5.AbstractC16901p0;
import p251jg.EnumC21664q;
import p309lo.AbstractC24543a;
import p404pq.RunnableC29457e;
import p408q.C29662f;
import p529uo.AbstractC35135w;
import p621xn.C38465b;
import p621xn.C38466c;
import p621xn.C38471h;
import p621xn.InterfaceC38469f;
import p715kotlin.jvm.internal.AbstractC22676k;
import to.C33980j0;
import to.InterfaceC33987n;
import wb3.AbstractC37056f;
import yb3.AbstractC39421y;
import z63.C40136h;

/* JADX INFO: renamed from: e73.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C12803b implements InterfaceC38469f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43823a;

    /* JADX INFO: renamed from: b */
    public boolean f43824b;

    /* JADX INFO: renamed from: c */
    public Object f43825c;

    /* JADX INFO: renamed from: d */
    public int f43826d;

    /* JADX INFO: renamed from: e */
    public Object f43827e;

    public C12803b(boolean z4) {
        this.f43823a = 1;
        this.f43824b = z4;
        this.f43827e = new StringBuilder();
        this.f43825c = AbstractC37056f.m118964P(EnumC21664q.f83181w);
    }

    /* JADX INFO: renamed from: e */
    public static void m35858e(C12803b c12803b, C29662f c29662f, AbstractC0830f abstractC0830f) {
        C40136h c40136h = (C40136h) c29662f.f121232z;
        int iM91133w0 = c29662f.m91133w0();
        c29662f.m91103V0(abstractC0830f);
        if (((ArrayList) c12803b.f43825c) != null) {
            StringBuilder sb4 = c40136h.f173190w;
            int length = sb4.length();
            boolean z4 = length > 0 && '\n' != sb4.charAt(length - 1);
            if (z4) {
                c40136h.m128679a('\n');
            }
            c40136h.m128679a((char) 160);
            C12806e c12806e = new C12806e((C4320k) c12803b.f43827e, (ArrayList) c12803b.f43825c, c12803b.f43824b, c12803b.f43826d % 2 == 1);
            c12803b.f43826d = c12803b.f43824b ? 0 : c12803b.f43826d + 1;
            if (z4) {
                iM91133w0++;
            }
            c29662f.m91096Q0(iM91133w0, c12806e);
            c12803b.f43825c = null;
        }
    }

    @Override // p621xn.InterfaceC38469f
    /* JADX INFO: renamed from: a */
    public void mo35859a(long j7) {
    }

    @Override // p527um.InterfaceC35072b
    /* JADX INFO: renamed from: b */
    public Object mo35860b() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f43825c;
        C38471h c38471h = (C38471h) this.f43827e;
        AbstractC24543a.m71573i(!this.f43824b);
        if (this.f43826d != 2 || arrayDeque.isEmpty()) {
            return null;
        }
        C38466c c38466c = (C38466c) arrayDeque.removeFirst();
        if (c38471h.m1496f(4)) {
            c38466c.m1495a(4);
        } else {
            long j7 = c38471h.f148797F;
            ByteBuffer byteBuffer = c38471h.f148801z;
            byteBuffer.getClass();
            byte[] bArrArray = byteBuffer.array();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.unmarshall(bArrArray, 0, bArrArray.length);
            parcelObtain.setDataPosition(0);
            Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
            parcelObtain.recycle();
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
            parcelableArrayList.getClass();
            c38466c.m123261p(c38471h.f148797F, new C1053d(j7, AbstractC24543a.m71581q(C38465b.f164724S, parcelableArrayList), 11), 0L);
        }
        c38471h.mo49690o();
        this.f43826d = 0;
        return c38466c;
    }

    @Override // p527um.InterfaceC35072b
    /* JADX INFO: renamed from: c */
    public Object mo35861c() {
        AbstractC24543a.m71573i(!this.f43824b);
        if (this.f43826d != 0) {
            return null;
        }
        this.f43826d = 1;
        return (C38471h) this.f43827e;
    }

    @Override // p527um.InterfaceC35072b
    /* JADX INFO: renamed from: d */
    public void mo35862d(C38471h c38471h) {
        AbstractC24543a.m71573i(!this.f43824b);
        AbstractC24543a.m71573i(this.f43826d == 1);
        AbstractC24543a.m71569e(((C38471h) this.f43827e) == c38471h);
        this.f43826d = 2;
    }

    /* JADX INFO: renamed from: f */
    public void m35863f() {
        EnumC21664q enumC21664q = EnumC21664q.f83184z;
        m35867j("{");
        if (this.f43824b) {
            ((StringBuilder) this.f43827e).append('\n');
        }
        this.f43826d++;
        ArrayList arrayList = (ArrayList) this.f43825c;
        AbstractC22676k.m65750j(arrayList, "<this>");
        arrayList.add(enumC21664q);
    }

    @Override // p527um.InterfaceC35072b
    public void flush() {
        AbstractC24543a.m71573i(!this.f43824b);
        ((C38471h) this.f43827e).mo49690o();
        this.f43826d = 0;
    }

    /* JADX INFO: renamed from: g */
    public C33980j0 m35864g() {
        AbstractC35135w.m111090b(((InterfaceC33987n) this.f43827e) != null, "execute parameter required");
        return new C33980j0(this, (C4986c[]) this.f43825c, this.f43824b, this.f43826d);
    }

    /* JADX INFO: renamed from: h */
    public void m35865h(String str, EnumC21664q... enumC21664qArr) {
        StringBuilder sb4 = (StringBuilder) this.f43827e;
        if (this.f43824b) {
            sb4.append('\n');
        }
        this.f43826d--;
        m35873p();
        sb4.append(str);
        ArrayList arrayList = (ArrayList) this.f43825c;
        AbstractC22676k.m65750j(arrayList, "<this>");
        EnumC21664q enumC21664q = (EnumC21664q) AbstractC25265s.m74134l1(arrayList);
        if (AbstractC25260n.m74056a0(enumC21664qArr, enumC21664q)) {
            return;
        }
        throw new IllegalStateException(("Invalid JSON encoder state " + enumC21664q + "; expected one of " + AbstractC25260n.m74028D0(enumC21664qArr, null, null, null, null, 63)).toString());
    }

    /* JADX INFO: renamed from: i */
    public void m35866i(int i13) {
        switch (this.f43823a) {
            case 3:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f43825c;
                WeakReference weakReference = sideSheetBehavior.f21034p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f43826d = i13;
                    if (!this.f43824b) {
                        View view = (View) sideSheetBehavior.f21034p.get();
                        RunnableC24693e runnableC24693e = (RunnableC24693e) this.f43827e;
                        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                        view.postOnAnimation(runnableC24693e);
                        this.f43824b = true;
                    }
                    break;
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f43825c;
                WeakReference weakReference2 = bottomSheetBehavior.f20793U;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f43826d = i13;
                    if (!this.f43824b) {
                        View view2 = (View) bottomSheetBehavior.f20793U.get();
                        RunnableC29457e runnableC29457e = (RunnableC29457e) this.f43827e;
                        WeakHashMap weakHashMap2 = AbstractC16901p0.f64851a;
                        view2.postOnAnimation(runnableC29457e);
                        this.f43824b = true;
                    }
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m35867j(String str) {
        boolean z4 = this.f43824b;
        StringBuilder sb4 = (StringBuilder) this.f43827e;
        ArrayList arrayList = (ArrayList) this.f43825c;
        int iOrdinal = ((EnumC21664q) AbstractC12240d.m34064b0(arrayList)).ordinal();
        if (iOrdinal == 1) {
            AbstractC12240d.m34055U(arrayList, EnumC21664q.f83183y);
            m35873p();
        } else if (iOrdinal == 2) {
            sb4.append(",");
            if (z4) {
                sb4.append('\n');
            }
            m35873p();
        } else if (iOrdinal == 5) {
            sb4.append(":");
            if (z4) {
                sb4.append(" ");
            }
            AbstractC12240d.m34055U(arrayList, EnumC21664q.f83178E);
        }
        sb4.append(str);
    }

    /* JADX INFO: renamed from: k */
    public void m35868k() {
        m35865h("}", EnumC21664q.f83184z, EnumC21664q.f83178E);
    }

    /* JADX INFO: renamed from: l */
    public byte[] m35869l() {
        String string = ((StringBuilder) this.f43827e).toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return AbstractC39421y.m125919D(string);
    }

    /* JADX INFO: renamed from: m */
    public void m35870m(InterfaceC33987n interfaceC33987n) {
        this.f43827e = interfaceC33987n;
    }

    /* JADX INFO: renamed from: n */
    public void m35871n(C4986c... c4986cArr) {
        this.f43825c = c4986cArr;
    }

    /* JADX INFO: renamed from: o */
    public void m35872o(int i13) {
        this.f43826d = i13;
    }

    /* JADX INFO: renamed from: p */
    public void m35873p() {
        int i13;
        if (!this.f43824b || (i13 = this.f43826d) <= 0) {
            return;
        }
        ((StringBuilder) this.f43827e).append(AbstractC39421y.m125925J(i13 * 4, " "));
    }

    /* JADX INFO: renamed from: q */
    public void m35874q(String name) {
        StringBuilder sb4 = (StringBuilder) this.f43827e;
        AbstractC22676k.m65750j(name, "name");
        ArrayList arrayList = (ArrayList) this.f43825c;
        if (AbstractC12240d.m34064b0(arrayList) == EnumC21664q.f83178E) {
            sb4.append(",");
            if (this.f43824b) {
                sb4.append('\n');
            }
        }
        m35873p();
        String strM10391t = AbstractC3511b.m10391t(name);
        sb4.append("\"");
        sb4.append(strM10391t);
        sb4.append("\"");
        AbstractC12240d.m34055U(arrayList, EnumC21664q.f83179F);
    }

    /* JADX INFO: renamed from: r */
    public void m35875r(String value) {
        AbstractC22676k.m65750j(value, "value");
        m35867j("\"" + AbstractC3511b.m10391t(value) + '\"');
    }

    @Override // p527um.InterfaceC35072b
    public void release() {
        this.f43824b = true;
    }

    public C12803b(int i13) {
        this.f43823a = i13;
        switch (i13) {
            case 6:
                this.f43827e = new C38471h(1);
                this.f43825c = new ArrayDeque();
                for (int i14 = 0; i14 < 2; i14++) {
                    ((ArrayDeque) this.f43825c).addFirst(new C38466c(this, 0));
                }
                this.f43826d = 0;
                break;
        }
    }

    public C12803b(long[] jArr, RemoteViews[] remoteViewsArr) {
        this.f43823a = 2;
        this.f43827e = jArr;
        this.f43825c = remoteViewsArr;
        this.f43824b = false;
        this.f43826d = 1;
        if (jArr.length == remoteViewsArr.length) {
            ArrayList arrayList = new ArrayList(remoteViewsArr.length);
            for (RemoteViews remoteViews : remoteViewsArr) {
                arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
            }
            int size = AbstractC25265s.m74159y0(arrayList).size();
            if (size > 1) {
                throw new IllegalArgumentException(AbstractC2875y.m8296i(size, "View type count is set to 1, but the collection contains ", " different layout ids").toString());
            }
            return;
        }
        throw new IllegalArgumentException("RemoteCollectionItems has different number of ids and views");
    }

    public C12803b(C4320k c4320k) {
        this.f43823a = 0;
        this.f43827e = c4320k;
    }

    public C12803b(Parcel parcel) {
        this.f43823a = 2;
        AbstractC22676k.m65750j(parcel, "parcel");
        int i13 = parcel.readInt();
        long[] jArr = new long[i13];
        this.f43827e = jArr;
        parcel.readLongArray(jArr);
        Parcelable.Creator CREATOR = RemoteViews.CREATOR;
        AbstractC22676k.m65749i(CREATOR, "CREATOR");
        RemoteViews[] remoteViewsArr = new RemoteViews[i13];
        parcel.readTypedArray(remoteViewsArr, CREATOR);
        AbstractC25260n.m74033I0(remoteViewsArr);
        this.f43825c = remoteViewsArr;
        this.f43824b = parcel.readInt() == 1;
        this.f43826d = parcel.readInt();
    }

    public C12803b(SideSheetBehavior sideSheetBehavior) {
        this.f43823a = 3;
        this.f43825c = sideSheetBehavior;
        this.f43827e = new RunnableC24693e(this, 0);
    }

    public C12803b(BottomSheetBehavior bottomSheetBehavior) {
        this.f43823a = 4;
        this.f43825c = bottomSheetBehavior;
        this.f43827e = new RunnableC29457e(this);
    }
}
