package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import io.getstream.chat.android.p226ui.feature.messages.list.C19883s0;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListView;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.recyclerview.widget.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C1722q extends AbstractC1720p1 {

    /* JADX INFO: renamed from: s */
    public static TimeInterpolator f6810s;

    /* JADX INFO: renamed from: g */
    public boolean f6811g;

    /* JADX INFO: renamed from: h */
    public ArrayList f6812h;

    /* JADX INFO: renamed from: i */
    public ArrayList f6813i;

    /* JADX INFO: renamed from: j */
    public ArrayList f6814j;

    /* JADX INFO: renamed from: k */
    public ArrayList f6815k;

    /* JADX INFO: renamed from: l */
    public ArrayList f6816l;

    /* JADX INFO: renamed from: m */
    public ArrayList f6817m;

    /* JADX INFO: renamed from: n */
    public ArrayList f6818n;

    /* JADX INFO: renamed from: o */
    public ArrayList f6819o;

    /* JADX INFO: renamed from: p */
    public ArrayList f6820p;

    /* JADX INFO: renamed from: q */
    public ArrayList f6821q;

    /* JADX INFO: renamed from: r */
    public ArrayList f6822r;

    /* JADX INFO: renamed from: h */
    public static void m5310h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((AbstractC1717o2) arrayList.get(size)).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1720p1
    /* JADX INFO: renamed from: a */
    public final boolean mo5296a(AbstractC1717o2 abstractC1717o2, AbstractC1717o2 abstractC1717o3, C1716o1 c1716o1, C1716o1 c1716o2) {
        int i13;
        int i14;
        int i15 = c1716o1.f6795a;
        int i16 = c1716o1.f6796b;
        if (abstractC1717o3.shouldIgnore()) {
            int i17 = c1716o1.f6795a;
            i14 = c1716o1.f6796b;
            i13 = i17;
        } else {
            i13 = c1716o2.f6795a;
            i14 = c1716o2.f6796b;
        }
        if (abstractC1717o2 == abstractC1717o3) {
            return m5311g(abstractC1717o2, i15, i16, i13, i14);
        }
        float translationX = abstractC1717o2.itemView.getTranslationX();
        float translationY = abstractC1717o2.itemView.getTranslationY();
        float alpha = abstractC1717o2.itemView.getAlpha();
        m5315l(abstractC1717o2);
        abstractC1717o2.itemView.setTranslationX(translationX);
        abstractC1717o2.itemView.setTranslationY(translationY);
        abstractC1717o2.itemView.setAlpha(alpha);
        m5315l(abstractC1717o3);
        abstractC1717o3.itemView.setTranslationX(-((int) ((i13 - i15) - translationX)));
        abstractC1717o3.itemView.setTranslationY(-((int) ((i14 - i16) - translationY)));
        abstractC1717o3.itemView.setAlpha(0.0f);
        ArrayList arrayList = this.f6815k;
        C1714o c1714o = new C1714o();
        c1714o.f6761a = abstractC1717o2;
        c1714o.f6762b = abstractC1717o3;
        c1714o.f6763c = i15;
        c1714o.f6764d = i16;
        c1714o.f6765e = i13;
        c1714o.f6766f = i14;
        arrayList.add(c1714o);
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1720p1
    /* JADX INFO: renamed from: d */
    public final void mo5298d(AbstractC1717o2 abstractC1717o2) {
        ArrayList arrayList = this.f6816l;
        ArrayList arrayList2 = this.f6817m;
        ArrayList arrayList3 = this.f6818n;
        View view = abstractC1717o2.itemView;
        view.animate().cancel();
        ArrayList arrayList4 = this.f6814j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C1718p) arrayList4.get(size)).f6797a == abstractC1717o2) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m5297c(abstractC1717o2);
                arrayList4.remove(size);
            }
        }
        m5313j(this.f6815k, abstractC1717o2);
        if (this.f6812h.remove(abstractC1717o2)) {
            view.setAlpha(1.0f);
            m5297c(abstractC1717o2);
        }
        if (this.f6813i.remove(abstractC1717o2)) {
            view.setAlpha(1.0f);
            m5297c(abstractC1717o2);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            m5313j(arrayList5, abstractC1717o2);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            for (int size4 = arrayList6.size() - 1; size4 >= 0; size4--) {
                if (((C1718p) arrayList6.get(size4)).f6797a == abstractC1717o2) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m5297c(abstractC1717o2);
                    arrayList6.remove(size4);
                    if (!arrayList6.isEmpty()) {
                        break;
                    }
                    arrayList2.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(abstractC1717o2)) {
                view.setAlpha(1.0f);
                m5297c(abstractC1717o2);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.f6821q.remove(abstractC1717o2);
        this.f6819o.remove(abstractC1717o2);
        this.f6822r.remove(abstractC1717o2);
        this.f6820p.remove(abstractC1717o2);
        m5312i();
    }

    @Override // androidx.recyclerview.widget.AbstractC1720p1
    /* JADX INFO: renamed from: e */
    public final void mo5299e() {
        ArrayList arrayList = this.f6818n;
        ArrayList arrayList2 = this.f6816l;
        ArrayList arrayList3 = this.f6817m;
        ArrayList arrayList4 = this.f6815k;
        ArrayList arrayList5 = this.f6813i;
        ArrayList arrayList6 = this.f6812h;
        ArrayList arrayList7 = this.f6814j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1718p c1718p = (C1718p) arrayList7.get(size);
            View view = c1718p.f6797a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m5297c(c1718p.f6797a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            m5297c((AbstractC1717o2) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractC1717o2 abstractC1717o2 = (AbstractC1717o2) arrayList5.get(size3);
            abstractC1717o2.itemView.setAlpha(1.0f);
            m5297c(abstractC1717o2);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C1714o c1714o = (C1714o) arrayList4.get(size4);
            AbstractC1717o2 abstractC1717o3 = c1714o.f6761a;
            if (abstractC1717o3 != null) {
                m5314k(c1714o, abstractC1717o3);
            }
            AbstractC1717o2 abstractC1717o4 = c1714o.f6762b;
            if (abstractC1717o4 != null) {
                m5314k(c1714o, abstractC1717o4);
            }
        }
        arrayList4.clear();
        if (mo5300f()) {
            for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList3.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    C1718p c1718p2 = (C1718p) arrayList8.get(size6);
                    View view2 = c1718p2.f6797a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m5297c(c1718p2.f6797a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList3.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList2.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    AbstractC1717o2 abstractC1717o5 = (AbstractC1717o2) arrayList9.get(size8);
                    abstractC1717o5.itemView.setAlpha(1.0f);
                    m5297c(abstractC1717o5);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList2.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C1714o c1714o2 = (C1714o) arrayList10.get(size10);
                    AbstractC1717o2 abstractC1717o6 = c1714o2.f6761a;
                    if (abstractC1717o6 != null) {
                        m5314k(c1714o2, abstractC1717o6);
                    }
                    AbstractC1717o2 abstractC1717o7 = c1714o2.f6762b;
                    if (abstractC1717o7 != null) {
                        m5314k(c1714o2, abstractC1717o7);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList.remove(arrayList10);
                    }
                }
            }
            m5310h(this.f6821q);
            m5310h(this.f6820p);
            m5310h(this.f6819o);
            m5310h(this.f6822r);
            ArrayList arrayList11 = this.f6803b;
            int size11 = arrayList11.size();
            for (int i13 = 0; i13 < size11; i13++) {
                C19883s0 c19883s0 = (C19883s0) arrayList11.get(i13);
                MessageListView.submitListOnAnimationsFinished$lambda$125(c19883s0.f74801a, c19883s0.f74802b, c19883s0.f74803c);
            }
            arrayList11.clear();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1720p1
    /* JADX INFO: renamed from: f */
    public final boolean mo5300f() {
        return (this.f6813i.isEmpty() && this.f6815k.isEmpty() && this.f6814j.isEmpty() && this.f6812h.isEmpty() && this.f6820p.isEmpty() && this.f6821q.isEmpty() && this.f6819o.isEmpty() && this.f6822r.isEmpty() && this.f6817m.isEmpty() && this.f6816l.isEmpty() && this.f6818n.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m5311g(AbstractC1717o2 abstractC1717o2, int i13, int i14, int i15, int i16) {
        View view = abstractC1717o2.itemView;
        int translationX = i13 + ((int) view.getTranslationX());
        int translationY = i14 + ((int) abstractC1717o2.itemView.getTranslationY());
        m5315l(abstractC1717o2);
        int i17 = i15 - translationX;
        int i18 = i16 - translationY;
        if (i17 == 0 && i18 == 0) {
            m5297c(abstractC1717o2);
            return false;
        }
        if (i17 != 0) {
            view.setTranslationX(-i17);
        }
        if (i18 != 0) {
            view.setTranslationY(-i18);
        }
        ArrayList arrayList = this.f6814j;
        C1718p c1718p = new C1718p();
        c1718p.f6797a = abstractC1717o2;
        c1718p.f6798b = translationX;
        c1718p.f6799c = translationY;
        c1718p.f6800d = i15;
        c1718p.f6801e = i16;
        arrayList.add(c1718p);
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m5312i() {
        if (mo5300f()) {
            return;
        }
        ArrayList arrayList = this.f6803b;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            C19883s0 c19883s0 = (C19883s0) arrayList.get(i13);
            MessageListView.submitListOnAnimationsFinished$lambda$125(c19883s0.f74801a, c19883s0.f74802b, c19883s0.f74803c);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: j */
    public final void m5313j(ArrayList arrayList, AbstractC1717o2 abstractC1717o2) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1714o c1714o = (C1714o) arrayList.get(size);
            if (m5314k(c1714o, abstractC1717o2) && c1714o.f6761a == null && c1714o.f6762b == null) {
                arrayList.remove(c1714o);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m5314k(C1714o c1714o, AbstractC1717o2 abstractC1717o2) {
        if (c1714o.f6762b == abstractC1717o2) {
            c1714o.f6762b = null;
        } else {
            if (c1714o.f6761a != abstractC1717o2) {
                return false;
            }
            c1714o.f6761a = null;
        }
        abstractC1717o2.itemView.setAlpha(1.0f);
        abstractC1717o2.itemView.setTranslationX(0.0f);
        abstractC1717o2.itemView.setTranslationY(0.0f);
        m5297c(abstractC1717o2);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final void m5315l(AbstractC1717o2 abstractC1717o2) {
        if (f6810s == null) {
            f6810s = new ValueAnimator().getInterpolator();
        }
        abstractC1717o2.itemView.animate().setInterpolator(f6810s);
        mo5298d(abstractC1717o2);
    }
}
