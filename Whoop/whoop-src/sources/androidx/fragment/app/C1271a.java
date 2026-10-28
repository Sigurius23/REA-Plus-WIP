package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.EnumC1635w;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import p031b9.AbstractC2875y;
import p321m6.AbstractC25106b;

/* JADX INFO: renamed from: androidx.fragment.app.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1271a extends AbstractC1282c2 implements InterfaceC1313k1 {

    /* JADX INFO: renamed from: t */
    public final AbstractC1329o1 f5518t;

    /* JADX INFO: renamed from: u */
    public boolean f5519u;

    /* JADX INFO: renamed from: v */
    public int f5520v;

    /* JADX INFO: renamed from: w */
    public boolean f5521w;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1271a(AbstractC1329o1 abstractC1329o1) {
        AbstractC1356w0 abstractC1356w0M4143J = abstractC1329o1.m4143J();
        AbstractC1359x0 abstractC1359x0 = abstractC1329o1.f5738x;
        super(abstractC1356w0M4143J, abstractC1359x0 != null ? abstractC1359x0.f5827x.getClassLoader() : null);
        this.f5520v = -1;
        this.f5521w = false;
        this.f5518t = abstractC1329o1;
    }

    @Override // androidx.fragment.app.InterfaceC1313k1
    /* JADX INFO: renamed from: a */
    public final boolean mo4041a(ArrayList arrayList, ArrayList arrayList2) {
        if (AbstractC1329o1.m4132M(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f5569i) {
            return true;
        }
        this.f5518t.f5718d.add(this);
        return true;
    }

    @Override // androidx.fragment.app.AbstractC1282c2
    /* JADX INFO: renamed from: d */
    public final void mo4042d(int i13, AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, String str, int i14) {
        String str2 = abstractComponentCallbacksC1320m0.mPreviousWho;
        if (str2 != null) {
            AbstractC25106b.m73600c(abstractComponentCallbacksC1320m0, str2);
        }
        Class<?> cls = abstractComponentCallbacksC1320m0.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = abstractComponentCallbacksC1320m0.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb4 = new StringBuilder("Can't change tag of fragment ");
                sb4.append(abstractComponentCallbacksC1320m0);
                sb4.append(": was ");
                throw new IllegalStateException(AbstractC2875y.m8304q(sb4, abstractComponentCallbacksC1320m0.mTag, " now ", str));
            }
            abstractComponentCallbacksC1320m0.mTag = str;
        }
        if (i13 != 0) {
            if (i13 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC1320m0 + " with tag " + str + " to container view with no id");
            }
            int i15 = abstractComponentCallbacksC1320m0.mFragmentId;
            if (i15 != 0 && i15 != i13) {
                throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC1320m0 + ": was " + abstractComponentCallbacksC1320m0.mFragmentId + " now " + i13);
            }
            abstractComponentCallbacksC1320m0.mFragmentId = i13;
            abstractComponentCallbacksC1320m0.mContainerId = i13;
        }
        m4066b(new C1278b2(abstractComponentCallbacksC1320m0, i14));
        abstractComponentCallbacksC1320m0.mFragmentManager = this.f5518t;
    }

    @Override // androidx.fragment.app.AbstractC1282c2
    /* JADX INFO: renamed from: g */
    public final C1271a mo4043g(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, EnumC1635w enumC1635w) {
        AbstractC1329o1 abstractC1329o1 = abstractComponentCallbacksC1320m0.mFragmentManager;
        AbstractC1329o1 abstractC1329o2 = this.f5518t;
        if (abstractC1329o1 != abstractC1329o2) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + abstractC1329o2);
        }
        if (enumC1635w == EnumC1635w.f6326x && abstractComponentCallbacksC1320m0.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + enumC1635w + " after the Fragment has been created");
        }
        if (enumC1635w == EnumC1635w.f6325w) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + enumC1635w + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        C1278b2 c1278b2 = new C1278b2();
        c1278b2.f5547a = 10;
        c1278b2.f5548b = abstractComponentCallbacksC1320m0;
        c1278b2.f5549c = false;
        c1278b2.f5554h = abstractComponentCallbacksC1320m0.mMaxState;
        c1278b2.f5555i = enumC1635w;
        m4066b(c1278b2);
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final void m4044h(int i13) {
        if (this.f5569i) {
            if (AbstractC1329o1.m4132M(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i13);
            }
            ArrayList arrayList = this.f5563c;
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                C1278b2 c1278b2 = (C1278b2) arrayList.get(i14);
                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = c1278b2.f5548b;
                if (abstractComponentCallbacksC1320m0 != null) {
                    abstractComponentCallbacksC1320m0.mBackStackNesting += i13;
                    if (AbstractC1329o1.m4132M(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + c1278b2.f5548b + " to " + c1278b2.f5548b.mBackStackNesting);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m4045i() {
        ArrayList arrayList = this.f5563c;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            C1278b2 c1278b2 = (C1278b2) arrayList.get(size);
            if (c1278b2.f5549c) {
                if (c1278b2.f5547a == 8) {
                    c1278b2.f5549c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i13 = c1278b2.f5548b.mContainerId;
                    c1278b2.f5547a = 2;
                    c1278b2.f5549c = false;
                    for (int i14 = size - 1; i14 >= 0; i14--) {
                        C1278b2 c1278b3 = (C1278b2) arrayList.get(i14);
                        if (c1278b3.f5549c && c1278b3.f5548b.mContainerId == i13) {
                            arrayList.remove(i14);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    /* JADX INFO: renamed from: j */
    public final int m4046j() {
        return m4047k(false, true);
    }

    /* JADX INFO: renamed from: k */
    public final int m4047k(boolean z4, boolean z13) {
        if (this.f5519u) {
            throw new IllegalStateException("commit already called");
        }
        if (AbstractC1329o1.m4132M(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C1322m2());
            m4049m("  ", printWriter, true);
            printWriter.close();
        }
        this.f5519u = true;
        boolean z14 = this.f5569i;
        AbstractC1329o1 abstractC1329o1 = this.f5518t;
        if (z14) {
            this.f5520v = abstractC1329o1.f5725k.getAndIncrement();
        } else {
            this.f5520v = -1;
        }
        if (z13) {
            abstractC1329o1.m4193x(this, z4);
        }
        return this.f5520v;
    }

    /* JADX INFO: renamed from: l */
    public final void m4048l() {
        if (this.f5569i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f5570j = false;
        this.f5518t.m4136A(this, false);
    }

    /* JADX INFO: renamed from: m */
    public final void m4049m(String str, PrintWriter printWriter, boolean z4) {
        String str2;
        if (z4) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f5571k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f5520v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f5519u);
            if (this.f5568h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f5568h));
            }
            if (this.f5564d != 0 || this.f5565e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f5564d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f5565e));
            }
            if (this.f5566f != 0 || this.f5567g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f5566f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f5567g));
            }
            if (this.f5572l != 0 || this.f5573m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f5572l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f5573m);
            }
            if (this.f5574n != 0 || this.f5575o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f5574n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f5575o);
            }
        }
        ArrayList arrayList = this.f5563c;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            C1278b2 c1278b2 = (C1278b2) arrayList.get(i13);
            switch (c1278b2.f5547a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + c1278b2.f5547a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i13);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c1278b2.f5548b);
            if (z4) {
                if (c1278b2.f5550d != 0 || c1278b2.f5551e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c1278b2.f5550d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c1278b2.f5551e));
                }
                if (c1278b2.f5552f != 0 || c1278b2.f5553g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c1278b2.f5552f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c1278b2.f5553g));
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final C1271a m4050n(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        AbstractC1329o1 abstractC1329o1 = abstractComponentCallbacksC1320m0.mFragmentManager;
        if (abstractC1329o1 == null || abstractC1329o1 == this.f5518t) {
            m4066b(new C1278b2(abstractComponentCallbacksC1320m0, 3));
            return this;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC1320m0.toString() + " is already attached to a FragmentManager.");
    }

    /* JADX INFO: renamed from: o */
    public final C1271a m4051o(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        AbstractC1329o1 abstractC1329o1 = abstractComponentCallbacksC1320m0.mFragmentManager;
        if (abstractC1329o1 == null || abstractC1329o1 == this.f5518t) {
            m4066b(new C1278b2(abstractComponentCallbacksC1320m0, 8));
            return this;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC1320m0.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder(128);
        sb4.append("BackStackEntry{");
        sb4.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f5520v >= 0) {
            sb4.append(" #");
            sb4.append(this.f5520v);
        }
        if (this.f5571k != null) {
            sb4.append(" ");
            sb4.append(this.f5571k);
        }
        sb4.append("}");
        return sb4.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1271a(C1271a c1271a) {
        AbstractC1356w0 abstractC1356w0M4143J = c1271a.f5518t.m4143J();
        AbstractC1359x0 abstractC1359x0 = c1271a.f5518t.f5738x;
        super(abstractC1356w0M4143J, abstractC1359x0 != null ? abstractC1359x0.f5827x.getClassLoader() : null);
        for (C1278b2 c1278b2 : c1271a.f5563c) {
            ArrayList arrayList = this.f5563c;
            C1278b2 c1278b3 = new C1278b2();
            c1278b3.f5547a = c1278b2.f5547a;
            c1278b3.f5548b = c1278b2.f5548b;
            c1278b3.f5549c = c1278b2.f5549c;
            c1278b3.f5550d = c1278b2.f5550d;
            c1278b3.f5551e = c1278b2.f5551e;
            c1278b3.f5552f = c1278b2.f5552f;
            c1278b3.f5553g = c1278b2.f5553g;
            c1278b3.f5554h = c1278b2.f5554h;
            c1278b3.f5555i = c1278b2.f5555i;
            arrayList.add(c1278b3);
        }
        this.f5564d = c1271a.f5564d;
        this.f5565e = c1271a.f5565e;
        this.f5566f = c1271a.f5566f;
        this.f5567g = c1271a.f5567g;
        this.f5568h = c1271a.f5568h;
        this.f5569i = c1271a.f5569i;
        this.f5570j = c1271a.f5570j;
        this.f5571k = c1271a.f5571k;
        this.f5574n = c1271a.f5574n;
        this.f5575o = c1271a.f5575o;
        this.f5572l = c1271a.f5572l;
        this.f5573m = c1271a.f5573m;
        if (c1271a.f5576p != null) {
            ArrayList arrayList2 = new ArrayList();
            this.f5576p = arrayList2;
            arrayList2.addAll(c1271a.f5576p);
        }
        if (c1271a.f5577q != null) {
            ArrayList arrayList3 = new ArrayList();
            this.f5577q = arrayList3;
            arrayList3.addAll(c1271a.f5577q);
        }
        this.f5578r = c1271a.f5578r;
        this.f5520v = -1;
        this.f5521w = false;
        this.f5518t = c1271a.f5518t;
        this.f5519u = c1271a.f5519u;
        this.f5520v = c1271a.f5520v;
        this.f5521w = c1271a.f5521w;
    }
}
