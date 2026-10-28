package androidx.recyclerview.widget;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import ge3.AbstractC15751g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p016an.C1053d;
import p184h5.AbstractC16901p0;
import p184h5.C16855a;
import p184h5.C16858b;

/* JADX INFO: renamed from: androidx.recyclerview.widget.c2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1668c2 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f6591a;

    /* JADX INFO: renamed from: b */
    public ArrayList f6592b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f6593c;

    /* JADX INFO: renamed from: d */
    public final List f6594d;

    /* JADX INFO: renamed from: e */
    public int f6595e;

    /* JADX INFO: renamed from: f */
    public int f6596f;

    /* JADX INFO: renamed from: g */
    public C1663b2 f6597g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ RecyclerView f6598h;

    public C1668c2(RecyclerView recyclerView) {
        this.f6598h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f6591a = arrayList;
        this.f6592b = null;
        this.f6593c = new ArrayList();
        this.f6594d = Collections.unmodifiableList(arrayList);
        this.f6595e = 2;
        this.f6596f = 2;
    }

    /* JADX INFO: renamed from: d */
    public static void m5194d(ViewGroup viewGroup, boolean z4) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                m5194d((ViewGroup) childAt, true);
            }
        }
        if (z4) {
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
            } else {
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5195a(AbstractC1717o2 abstractC1717o2, boolean z4) {
        RecyclerView.clearNestedRecyclerViewIfNotNested(abstractC1717o2);
        View view = abstractC1717o2.itemView;
        RecyclerView recyclerView = this.f6598h;
        C1725q2 c1725q2 = recyclerView.mAccessibilityDelegate;
        if (c1725q2 != null) {
            C1721p2 c1721p2 = c1725q2.f6825e;
            AbstractC16901p0.m47583n(view, c1721p2 != null ? (C16858b) c1721p2.f6809e.remove(view) : null);
        }
        if (z4) {
            if (recyclerView.mRecyclerListeners.size() > 0) {
                recyclerView.mRecyclerListeners.get(0).getClass();
                throw new ClassCastException();
            }
            AbstractC1692i1 abstractC1692i1 = recyclerView.mAdapter;
            if (abstractC1692i1 != null) {
                abstractC1692i1.onViewRecycled(abstractC1717o2);
            }
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.m5211d(abstractC1717o2);
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + abstractC1717o2);
            }
        }
        abstractC1717o2.mBindingAdapter = null;
        abstractC1717o2.mOwnerRecyclerView = null;
        C1663b2 c1663b2M5197c = m5197c();
        c1663b2M5197c.getClass();
        int itemViewType = abstractC1717o2.getItemViewType();
        ArrayList arrayList = c1663b2M5197c.m5192a(itemViewType).f6564a;
        if (((C1658a2) c1663b2M5197c.f6582a.get(itemViewType)).f6565b <= arrayList.size()) {
            AbstractC15751g.m44458k(abstractC1717o2.itemView);
        } else {
            if (RecyclerView.sDebugAssertionsEnabled && arrayList.contains(abstractC1717o2)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            abstractC1717o2.resetInternal();
            arrayList.add(abstractC1717o2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m5196b(int i13) {
        RecyclerView recyclerView = this.f6598h;
        if (i13 >= 0 && i13 < recyclerView.mState.m5276b()) {
            return !recyclerView.mState.f6727g ? i13 : recyclerView.mAdapterHelper.m5171f(i13, 0);
        }
        StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "invalid position ", ". State item count is ");
        sbM30466t.append(recyclerView.mState.m5276b());
        sbM30466t.append(recyclerView.exceptionLabel());
        throw new IndexOutOfBoundsException(sbM30466t.toString());
    }

    /* JADX INFO: renamed from: c */
    public final C1663b2 m5197c() {
        if (this.f6597g == null) {
            C1663b2 c1663b2 = new C1663b2();
            c1663b2.f6582a = new SparseArray();
            c1663b2.f6583b = 0;
            c1663b2.f6584c = Collections.newSetFromMap(new IdentityHashMap());
            this.f6597g = c1663b2;
            m5198e();
        }
        return this.f6597g;
    }

    /* JADX INFO: renamed from: e */
    public final void m5198e() {
        RecyclerView recyclerView;
        AbstractC1692i1 abstractC1692i1;
        C1663b2 c1663b2 = this.f6597g;
        if (c1663b2 == null || (abstractC1692i1 = (recyclerView = this.f6598h).mAdapter) == null || !recyclerView.mIsAttached) {
            return;
        }
        c1663b2.f6584c.add(abstractC1692i1);
    }

    /* JADX INFO: renamed from: f */
    public final void m5199f(AbstractC1692i1 abstractC1692i1, boolean z4) {
        C1663b2 c1663b2 = this.f6597g;
        if (c1663b2 != null) {
            SparseArray sparseArray = c1663b2.f6582a;
            Set set = c1663b2.f6584c;
            set.remove(abstractC1692i1);
            if (set.size() != 0 || z4) {
                return;
            }
            for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                ArrayList arrayList = ((C1658a2) sparseArray.get(sparseArray.keyAt(i13))).f6564a;
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    AbstractC15751g.m44458k(((AbstractC1717o2) arrayList.get(i14)).itemView);
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m5200g() {
        ArrayList arrayList = this.f6593c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m5201h(size);
        }
        arrayList.clear();
        if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
            C1675e0 c1675e0 = this.f6598h.mPrefetchRegistry;
            int[] iArr = c1675e0.f6638c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c1675e0.f6639d = 0;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m5201h(int i13) {
        if (RecyclerView.sVerboseLoggingEnabled) {
            Log.d("RecyclerView", "Recycling cached view at index " + i13);
        }
        ArrayList arrayList = this.f6593c;
        AbstractC1717o2 abstractC1717o2 = (AbstractC1717o2) arrayList.get(i13);
        if (RecyclerView.sVerboseLoggingEnabled) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + abstractC1717o2);
        }
        m5195a(abstractC1717o2, true);
        arrayList.remove(i13);
    }

    /* JADX INFO: renamed from: i */
    public final void m5202i(View view) {
        AbstractC1717o2 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        boolean zIsTmpDetached = childViewHolderInt.isTmpDetached();
        RecyclerView recyclerView = this.f6598h;
        if (zIsTmpDetached) {
            recyclerView.removeDetachedView(view, false);
        }
        if (childViewHolderInt.isScrap()) {
            childViewHolderInt.unScrap();
        } else if (childViewHolderInt.wasReturnedFromScrap()) {
            childViewHolderInt.clearReturnedFromScrapFlag();
        }
        m5203j(childViewHolderInt);
        if (recyclerView.mItemAnimator == null || childViewHolderInt.isRecyclable()) {
            return;
        }
        recyclerView.mItemAnimator.mo5298d(childViewHolderInt);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d7 A[LOOP:2: B:57:0x00cc->B:61:0x00d7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x00da A[EDGE_INSN: B:87:0x00da->B:62:0x00da BREAK  A[LOOP:1: B:53:0x00b7->B:60:0x00d4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00da A[EDGE_INSN: B:88:0x00da->B:62:0x00da BREAK  A[LOOP:1: B:53:0x00b7->B:60:0x00d4, LOOP_LABEL: LOOP:1: B:53:0x00b7->B:60:0x00d4], SYNTHETIC] */
    /* JADX INFO: renamed from: j */
    public final void m5203j(AbstractC1717o2 abstractC1717o2) {
        boolean z4;
        int i13;
        int i14;
        C1675e0 c1675e0;
        int i15;
        int i16;
        boolean zIsScrap = abstractC1717o2.isScrap();
        boolean z13 = false;
        boolean z14 = true;
        RecyclerView recyclerView = this.f6598h;
        if (zIsScrap || abstractC1717o2.itemView.getParent() != null) {
            StringBuilder sb4 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb4.append(abstractC1717o2.isScrap());
            sb4.append(" isAttached:");
            sb4.append(abstractC1717o2.itemView.getParent() != null);
            sb4.append(recyclerView.exceptionLabel());
            throw new IllegalArgumentException(sb4.toString());
        }
        if (abstractC1717o2.isTmpDetached()) {
            StringBuilder sb5 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb5.append(abstractC1717o2);
            throw new IllegalArgumentException(AbstractC30802r.m94760i(recyclerView, sb5));
        }
        if (abstractC1717o2.shouldIgnore()) {
            throw new IllegalArgumentException(AbstractC30802r.m94760i(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
        }
        boolean zDoesTransientStatePreventRecycling = abstractC1717o2.doesTransientStatePreventRecycling();
        AbstractC1692i1 abstractC1692i1 = recyclerView.mAdapter;
        boolean z15 = abstractC1692i1 != null && zDoesTransientStatePreventRecycling && abstractC1692i1.onFailedToRecycleView(abstractC1717o2);
        boolean z16 = RecyclerView.sDebugAssertionsEnabled;
        ArrayList arrayList = this.f6593c;
        if (z16 && arrayList.contains(abstractC1717o2)) {
            StringBuilder sb6 = new StringBuilder("cached view received recycle internal? ");
            sb6.append(abstractC1717o2);
            throw new IllegalArgumentException(AbstractC30802r.m94760i(recyclerView, sb6));
        }
        if (z15 || abstractC1717o2.isRecyclable()) {
            if (this.f6596f <= 0 || abstractC1717o2.hasAnyOfTheFlags(526)) {
                z4 = false;
            } else {
                int size = arrayList.size();
                if (size >= this.f6596f && size > 0) {
                    m5201h(0);
                    size--;
                }
                if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0) {
                    C1675e0 c1675e1 = recyclerView.mPrefetchRegistry;
                    int i17 = abstractC1717o2.mPosition;
                    if (c1675e1.f6638c != null) {
                        int i18 = c1675e1.f6639d * 2;
                        int i19 = 0;
                        while (true) {
                            if (i19 >= i18) {
                                i13 = size - 1;
                                loop1: while (i13 >= 0) {
                                    i14 = ((AbstractC1717o2) arrayList.get(i13)).mPosition;
                                    c1675e0 = recyclerView.mPrefetchRegistry;
                                    if (c1675e0.f6638c != null) {
                                        break;
                                    }
                                    i15 = c1675e0.f6639d * 2;
                                    i16 = 0;
                                    while (true) {
                                        if (i16 < i15) {
                                            break loop1;
                                        } else if (c1675e0.f6638c[i16] == i14) {
                                            break;
                                        } else {
                                            i16 += 2;
                                        }
                                    }
                                    i13--;
                                }
                                size = i13 + 1;
                            } else if (c1675e1.f6638c[i19] != i17) {
                                i19 += 2;
                            }
                        }
                    } else {
                        i13 = size - 1;
                        loop1: while (i13 >= 0) {
                            i14 = ((AbstractC1717o2) arrayList.get(i13)).mPosition;
                            c1675e0 = recyclerView.mPrefetchRegistry;
                            if (c1675e0.f6638c != null) {
                                break;
                                break;
                            }
                            i15 = c1675e0.f6639d * 2;
                            i16 = 0;
                            while (true) {
                                if (i16 < i15) {
                                    break loop1;
                                    break loop1;
                                } else if (c1675e0.f6638c[i16] == i14) {
                                    break;
                                } else {
                                    i16 += 2;
                                }
                            }
                            i13--;
                        }
                        size = i13 + 1;
                    }
                }
                arrayList.add(size, abstractC1717o2);
                z4 = true;
            }
            if (z4) {
                z14 = false;
            } else {
                m5195a(abstractC1717o2, true);
            }
            z13 = z4;
        } else {
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + recyclerView.exceptionLabel());
            }
            z14 = false;
        }
        recyclerView.mViewInfoStore.m5211d(abstractC1717o2);
        if (z13 || z14 || !zDoesTransientStatePreventRecycling) {
            return;
        }
        AbstractC15751g.m44458k(abstractC1717o2.itemView);
        abstractC1717o2.mBindingAdapter = null;
        abstractC1717o2.mOwnerRecyclerView = null;
    }

    /* JADX INFO: renamed from: k */
    public final void m5204k(View view) {
        AbstractC1717o2 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        boolean zHasAnyOfTheFlags = childViewHolderInt.hasAnyOfTheFlags(12);
        RecyclerView recyclerView = this.f6598h;
        if (!zHasAnyOfTheFlags && childViewHolderInt.isUpdated() && !recyclerView.canReuseUpdatedViewHolder(childViewHolderInt)) {
            if (this.f6592b == null) {
                this.f6592b = new ArrayList();
            }
            childViewHolderInt.setScrapContainer(this, true);
            this.f6592b.add(childViewHolderInt);
            return;
        }
        if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !recyclerView.mAdapter.hasStableIds()) {
            throw new IllegalArgumentException(AbstractC30802r.m94760i(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        childViewHolderInt.setScrapContainer(this, false);
        this.f6591a.add(childViewHolderInt);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01da  */
    /* JADX WARN: Code duplicated, block: B:121:0x0218  */
    /* JADX WARN: Code duplicated, block: B:123:0x0222  */
    /* JADX WARN: Code duplicated, block: B:124:0x022b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0231  */
    /* JADX WARN: Code duplicated, block: B:128:0x0239  */
    /* JADX WARN: Code duplicated, block: B:131:0x0250  */
    /* JADX WARN: Code duplicated, block: B:134:0x025b  */
    /* JADX WARN: Code duplicated, block: B:136:0x0263  */
    /* JADX WARN: Code duplicated, block: B:138:0x026d  */
    /* JADX WARN: Code duplicated, block: B:140:0x027b  */
    /* JADX WARN: Code duplicated, block: B:142:0x0289  */
    /* JADX WARN: Code duplicated, block: B:155:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:159:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:170:0x030d  */
    /* JADX WARN: Code duplicated, block: B:171:0x0312  */
    /* JADX WARN: Code duplicated, block: B:173:0x0316  */
    /* JADX WARN: Code duplicated, block: B:175:0x031a  */
    /* JADX WARN: Code duplicated, block: B:178:0x033e  */
    /* JADX WARN: Code duplicated, block: B:180:0x0346  */
    /* JADX WARN: Code duplicated, block: B:182:0x034e  */
    /* JADX WARN: Code duplicated, block: B:185:0x0361 A[LOOP:3: B:181:0x034c->B:185:0x0361, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:186:0x0364 A[EDGE_INSN: B:186:0x0364->B:187:0x0365 BREAK  A[LOOP:3: B:181:0x034c->B:185:0x0361]] */
    /* JADX WARN: Code duplicated, block: B:188:0x0367  */
    /* JADX WARN: Code duplicated, block: B:190:0x036e  */
    /* JADX WARN: Code duplicated, block: B:192:0x0374  */
    /* JADX WARN: Code duplicated, block: B:195:0x037c  */
    /* JADX WARN: Code duplicated, block: B:197:0x0384  */
    /* JADX WARN: Code duplicated, block: B:203:0x0398  */
    /* JADX WARN: Code duplicated, block: B:205:0x039c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:214:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:217:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:221:0x0400  */
    /* JADX WARN: Code duplicated, block: B:229:0x041d  */
    /* JADX WARN: Code duplicated, block: B:235:0x0442  */
    /* JADX WARN: Code duplicated, block: B:237:0x0448  */
    /* JADX WARN: Code duplicated, block: B:243:0x045a  */
    /* JADX WARN: Code duplicated, block: B:245:0x045e  */
    /* JADX WARN: Code duplicated, block: B:252:0x048f  */
    /* JADX WARN: Code duplicated, block: B:254:0x049b  */
    /* JADX WARN: Code duplicated, block: B:258:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:259:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:262:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:266:0x04db  */
    /* JADX WARN: Code duplicated, block: B:269:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:271:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:272:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:276:0x0501  */
    /* JADX WARN: Code duplicated, block: B:278:0x0505  */
    /* JADX WARN: Code duplicated, block: B:281:0x050c  */
    /* JADX WARN: Code duplicated, block: B:283:0x0510  */
    /* JADX WARN: Code duplicated, block: B:284:0x0515  */
    /* JADX WARN: Code duplicated, block: B:286:0x051c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:289:0x0527  */
    /* JADX WARN: Code duplicated, block: B:292:0x052f  */
    /* JADX WARN: Code duplicated, block: B:296:0x053a  */
    /* JADX WARN: Code duplicated, block: B:297:0x0546  */
    /* JADX WARN: Code duplicated, block: B:299:0x054c  */
    /* JADX WARN: Code duplicated, block: B:300:0x0558  */
    /* JADX WARN: Code duplicated, block: B:303:0x055f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:305:0x0562  */
    /* JADX WARN: Code duplicated, block: B:316:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x02da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x0364 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:0x035a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:328:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x01b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0082 A[EDGE_INSN: B:35:0x0082->B:36:0x0083 BREAK  A[LOOP:0: B:14:0x0026->B:20:0x0040]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0091  */
    /* JADX WARN: Code duplicated, block: B:44:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:70:0x010b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0111  */
    /* JADX WARN: Code duplicated, block: B:74:0x0120 A[EDGE_INSN: B:74:0x0120->B:95:0x01b1 BREAK  A[LOOP:1: B:43:0x0096->B:55:0x00c4]] */
    /* JADX WARN: Code duplicated, block: B:75:0x0130  */
    /* JADX WARN: Code duplicated, block: B:77:0x0144  */
    /* JADX WARN: Code duplicated, block: B:79:0x0158  */
    /* JADX WARN: Code duplicated, block: B:81:0x016c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0173  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b9  */
    /* JADX WARN: Instruction removed from duplicated block: B:175:0x031a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:77:0x0144, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:79:0x0158, please report this as an issue */
    /* JADX INFO: renamed from: l */
    public final AbstractC1717o2 m5205l(int i13, long j7) {
        AbstractC1717o2 abstractC1717o2;
        boolean z4;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z13;
        long j13;
        long j14;
        int itemViewType;
        boolean z14;
        long nanoTime;
        long j15;
        boolean z15;
        Object[] objArr;
        View view;
        C1725q2 c1725q2;
        C1721p2 c1721p2;
        View.AccessibilityDelegate accessibilityDelegateM47572c;
        long j16;
        ViewGroup.LayoutParams layoutParams;
        C1744v1 c1744v1;
        int iM5171f;
        int itemViewType2;
        AbstractC1717o2 abstractC1717o2CreateViewHolder;
        long nanoTime2;
        long j17;
        RecyclerView recyclerViewFindNestedRecyclerView;
        long j18;
        boolean z16;
        C1658a2 c1658a2;
        AbstractC1717o2 abstractC1717o3;
        View view2;
        ArrayList arrayList3;
        int size;
        long itemId;
        int size2;
        int size3;
        AbstractC1717o2 abstractC1717o4;
        AbstractC1717o2 abstractC1717o5;
        int size4;
        int i14;
        ArrayList arrayList4;
        int size5;
        int i15;
        View view3;
        int size6;
        int i16;
        AbstractC1717o2 abstractC1717o6;
        AbstractC1717o2 childViewHolderInt;
        C1694j c1694j;
        C1053d c1053d;
        int iIndexOfChild;
        int iM5261j;
        AbstractC1717o2 childViewHolderInt2;
        int i17;
        boolean z17;
        AbstractC1717o2 abstractC1717o7;
        int size7;
        int iM5171f2;
        RecyclerView recyclerView = this.f6598h;
        if (i13 < 0 || i13 >= recyclerView.mState.m5276b()) {
            StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i13, "Invalid item position ", "(", "). Item count:");
            sbM30465s.append(recyclerView.mState.m5276b());
            sbM30465s.append(recyclerView.exceptionLabel());
            throw new IndexOutOfBoundsException(sbM30465s.toString());
        }
        C16858b c16858b = null;
        if (recyclerView.mState.f6727g) {
            ArrayList arrayList5 = this.f6592b;
            if (arrayList5 != null && (size7 = arrayList5.size()) != 0) {
                int i18 = 0;
                while (true) {
                    if (i18 >= size7) {
                        if (recyclerView.mAdapter.hasStableIds() && (iM5171f2 = recyclerView.mAdapterHelper.m5171f(i13, 0)) > 0 && iM5171f2 < recyclerView.mAdapter.getItemCount()) {
                            long itemId2 = recyclerView.mAdapter.getItemId(iM5171f2);
                            int i19 = 0;
                            while (true) {
                                if (i19 >= size7) {
                                    abstractC1717o2 = null;
                                    break;
                                }
                                AbstractC1717o2 abstractC1717o8 = (AbstractC1717o2) this.f6592b.get(i19);
                                if (!abstractC1717o8.wasReturnedFromScrap() && abstractC1717o8.getItemId() == itemId2) {
                                    abstractC1717o8.addFlags(32);
                                    abstractC1717o2 = abstractC1717o8;
                                    break;
                                }
                                i19++;
                            }
                        } else {
                            abstractC1717o2 = null;
                            break;
                        }
                    } else {
                        abstractC1717o2 = (AbstractC1717o2) this.f6592b.get(i18);
                        if (!abstractC1717o2.wasReturnedFromScrap() && abstractC1717o2.getLayoutPosition() == i13) {
                            abstractC1717o2.addFlags(32);
                            break;
                        }
                        i18++;
                    }
                }
            } else {
                abstractC1717o2 = null;
                break;
            }
            if (abstractC1717o2 != null) {
                z4 = true;
            }
            arrayList = this.f6591a;
            arrayList2 = this.f6593c;
            if (abstractC1717o2 == null) {
                size4 = arrayList.size();
                i14 = 0;
                while (true) {
                    if (i14 < size4) {
                        arrayList4 = recyclerView.mChildHelper.f6688c;
                        size5 = arrayList4.size();
                        i15 = 0;
                        while (true) {
                            if (i15 < size5) {
                                z13 = true;
                                view3 = null;
                                break;
                            }
                            view3 = (View) arrayList4.get(i15);
                            childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view3);
                            z13 = true;
                            if (childViewHolderInt2.getLayoutPosition() != i13 && !childViewHolderInt2.isInvalid() && !childViewHolderInt2.isRemoved()) {
                                break;
                            }
                            i15++;
                        }
                        if (view3 != null) {
                            size6 = arrayList2.size();
                            i16 = 0;
                            while (true) {
                                if (i16 < size6) {
                                    abstractC1717o2 = null;
                                    break;
                                }
                                abstractC1717o6 = (AbstractC1717o2) arrayList2.get(i16);
                                if (abstractC1717o6.isInvalid() && abstractC1717o6.getLayoutPosition() == i13 && !abstractC1717o6.isAttachedToTransitionOverlay()) {
                                    arrayList2.remove(i16);
                                    if (RecyclerView.sVerboseLoggingEnabled) {
                                        Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i13 + ") found match in cache: " + abstractC1717o6);
                                    }
                                    abstractC1717o2 = abstractC1717o6;
                                    break;
                                }
                                i16++;
                            }
                        } else {
                            childViewHolderInt = RecyclerView.getChildViewHolderInt(view3);
                            c1694j = recyclerView.mChildHelper;
                            c1053d = c1694j.f6687b;
                            iIndexOfChild = c1694j.f6686a.f6659a.indexOfChild(view3);
                            if (iIndexOfChild >= 0) {
                                throw new IllegalArgumentException("view is not a child, cannot hide " + view3);
                            }
                            if (c1053d.m3084I(iIndexOfChild)) {
                                throw new RuntimeException("trying to unhide a view that was not hidden" + view3);
                            }
                            c1053d.m3081F(iIndexOfChild);
                            c1694j.m5263l(view3);
                            iM5261j = recyclerView.mChildHelper.m5261j(view3);
                            if (iM5261j != -1) {
                                StringBuilder sb4 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                sb4.append(childViewHolderInt);
                                throw new IllegalStateException(AbstractC30802r.m94760i(recyclerView, sb4));
                            }
                            recyclerView.mChildHelper.m5254c(iM5261j);
                            m5204k(view3);
                            childViewHolderInt.addFlags(8224);
                            abstractC1717o2 = childViewHolderInt;
                            break;
                        }
                    } else {
                        abstractC1717o7 = (AbstractC1717o2) arrayList.get(i14);
                        if (abstractC1717o7.wasReturnedFromScrap() && abstractC1717o7.getLayoutPosition() == i13 && !abstractC1717o7.isInvalid() && (recyclerView.mState.f6727g || !abstractC1717o7.isRemoved())) {
                            abstractC1717o7.addFlags(32);
                            abstractC1717o2 = abstractC1717o7;
                            z13 = true;
                            break;
                        }
                        i14++;
                    }
                }
                if (abstractC1717o2 != null) {
                    if (abstractC1717o2.isRemoved()) {
                        i17 = abstractC1717o2.mPosition;
                        if (i17 >= 0 || i17 >= recyclerView.mAdapter.getItemCount()) {
                            StringBuilder sb5 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                            sb5.append(abstractC1717o2);
                            throw new IndexOutOfBoundsException(AbstractC30802r.m94760i(recyclerView, sb5));
                        }
                        z17 = ((recyclerView.mState.f6727g || recyclerView.mAdapter.getItemViewType(abstractC1717o2.mPosition) == abstractC1717o2.getItemViewType()) && (!recyclerView.mAdapter.hasStableIds() || abstractC1717o2.getItemId() == recyclerView.mAdapter.getItemId(abstractC1717o2.mPosition))) ? z13 : false;
                    } else {
                        if (!RecyclerView.sDebugAssertionsEnabled && !recyclerView.mState.f6727g) {
                            throw new IllegalStateException(AbstractC30802r.m94760i(recyclerView, new StringBuilder("should not receive a removed view unless it is pre layout")));
                        }
                        z17 = recyclerView.mState.f6727g;
                    }
                    if (z17) {
                        z4 = z13;
                    } else {
                        abstractC1717o2.addFlags(4);
                        if (abstractC1717o2.isScrap()) {
                            recyclerView.removeDetachedView(abstractC1717o2.itemView, false);
                            abstractC1717o2.unScrap();
                        } else if (abstractC1717o2.wasReturnedFromScrap()) {
                            abstractC1717o2.clearReturnedFromScrapFlag();
                        }
                        m5203j(abstractC1717o2);
                        abstractC1717o2 = null;
                    }
                }
            } else {
                z13 = true;
            }
            if (abstractC1717o2 == null) {
                iM5171f = recyclerView.mAdapterHelper.m5171f(i13, 0);
                if (iM5171f >= 0) {
                    j13 = 3;
                    if (iM5171f < recyclerView.mAdapter.getItemCount()) {
                        itemViewType2 = recyclerView.mAdapter.getItemViewType(iM5171f);
                        if (recyclerView.mAdapter.hasStableIds()) {
                            itemId = recyclerView.mAdapter.getItemId(iM5171f);
                            size2 = arrayList.size() - 1;
                            while (true) {
                                if (size2 >= 0) {
                                    j14 = 4;
                                    size3 = arrayList2.size() - 1;
                                    while (true) {
                                        if (size3 >= 0) {
                                            abstractC1717o4 = (AbstractC1717o2) arrayList2.get(size3);
                                            if (abstractC1717o4.getItemId() == itemId || abstractC1717o4.isAttachedToTransitionOverlay()) {
                                                size3--;
                                            } else {
                                                if (itemViewType2 == abstractC1717o4.getItemViewType()) {
                                                    arrayList2.remove(size3);
                                                    abstractC1717o2 = abstractC1717o4;
                                                    break;
                                                }
                                                m5201h(size3);
                                            }
                                        }
                                        abstractC1717o2 = null;
                                        break;
                                    }
                                }
                                abstractC1717o5 = (AbstractC1717o2) arrayList.get(size2);
                                if (abstractC1717o5.getItemId() != itemId && !abstractC1717o5.wasReturnedFromScrap()) {
                                    j14 = 4;
                                    if (itemViewType2 == abstractC1717o5.getItemViewType()) {
                                        abstractC1717o5.addFlags(32);
                                        if (abstractC1717o5.isRemoved() && !recyclerView.mState.f6727g) {
                                            abstractC1717o5.setFlags(2, 14);
                                        }
                                        abstractC1717o2 = abstractC1717o5;
                                        break;
                                    }
                                    arrayList.remove(size2);
                                    recyclerView.removeDetachedView(abstractC1717o5.itemView, false);
                                    AbstractC1717o2 childViewHolderInt3 = RecyclerView.getChildViewHolderInt(abstractC1717o5.itemView);
                                    childViewHolderInt3.mScrapContainer = null;
                                    childViewHolderInt3.mInChangeScrap = false;
                                    childViewHolderInt3.clearReturnedFromScrapFlag();
                                    m5203j(childViewHolderInt3);
                                }
                                size2--;
                            }
                            if (abstractC1717o2 != null) {
                                abstractC1717o2.mPosition = iM5171f;
                                z4 = z13;
                            }
                        } else {
                            j14 = 4;
                        }
                        if (abstractC1717o2 == null) {
                            if (RecyclerView.sVerboseLoggingEnabled) {
                                Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i13 + ") fetching from shared pool");
                            }
                            c1658a2 = (C1658a2) m5197c().f6582a.get(itemViewType2);
                            if (c1658a2 != null) {
                                abstractC1717o3 = null;
                                break;
                            }
                            arrayList3 = c1658a2.f6564a;
                            if (arrayList3.isEmpty()) {
                                size = arrayList3.size() - 1;
                                while (true) {
                                    if (size >= 0) {
                                        abstractC1717o3 = null;
                                        break;
                                    }
                                    if (!((AbstractC1717o2) arrayList3.get(size)).isAttachedToTransitionOverlay()) {
                                        abstractC1717o3 = (AbstractC1717o2) arrayList3.remove(size);
                                        break;
                                    }
                                    size--;
                                }
                            } else {
                                abstractC1717o3 = null;
                                break;
                            }
                            if (abstractC1717o3 != null) {
                                abstractC1717o3.resetInternal();
                                if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                                    view2 = abstractC1717o3.itemView;
                                    if (view2 instanceof ViewGroup) {
                                        m5194d((ViewGroup) view2, false);
                                    }
                                }
                            }
                            abstractC1717o2 = abstractC1717o3;
                        }
                        if (abstractC1717o2 == null) {
                            long nanoTime3 = recyclerView.getNanoTime();
                            if (j7 != Long.MAX_VALUE) {
                                j18 = this.f6597g.m5192a(itemViewType2).f6566c;
                                if (j18 != 0 || j18 + nanoTime3 < j7) {
                                    z16 = z13;
                                } else {
                                    z16 = false;
                                }
                                if (!z16) {
                                    return null;
                                }
                            }
                            abstractC1717o2CreateViewHolder = recyclerView.mAdapter.createViewHolder(recyclerView, itemViewType2);
                            if (RecyclerView.ALLOW_THREAD_GAP_WORK && (recyclerViewFindNestedRecyclerView = RecyclerView.findNestedRecyclerView(abstractC1717o2CreateViewHolder.itemView)) != null) {
                                abstractC1717o2CreateViewHolder.mNestedRecyclerView = new WeakReference<>(recyclerViewFindNestedRecyclerView);
                            }
                            nanoTime2 = recyclerView.getNanoTime() - nanoTime3;
                            C1658a2 c1658a2M5192a = this.f6597g.m5192a(itemViewType2);
                            j17 = c1658a2M5192a.f6566c;
                            if (j17 != 0) {
                                nanoTime2 = (nanoTime2 / j14) + ((j17 / j14) * 3);
                            }
                            c1658a2M5192a.f6566c = nanoTime2;
                            if (RecyclerView.sVerboseLoggingEnabled) {
                                Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                            }
                            abstractC1717o2 = abstractC1717o2CreateViewHolder;
                        }
                    }
                }
                StringBuilder sbM30465s2 = AbstractC11266d.m30465s(i13, iM5171f, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                sbM30465s2.append(recyclerView.mState.m5276b());
                sbM30465s2.append(recyclerView.exceptionLabel());
                throw new IndexOutOfBoundsException(sbM30465s2.toString());
            }
            j13 = 3;
            j14 = 4;
            if (z4 && !recyclerView.mState.f6727g && abstractC1717o2.hasAnyOfTheFlags(DfuBaseService.ERROR_REMOTE_MASK)) {
                abstractC1717o2.setFlags(0, DfuBaseService.ERROR_REMOTE_MASK);
                if (recyclerView.mState.f6730j) {
                    AbstractC1720p1.m5295b(abstractC1717o2);
                    AbstractC1720p1 abstractC1720p1 = recyclerView.mItemAnimator;
                    abstractC1717o2.getUnmodifiedPayloads();
                    abstractC1720p1.getClass();
                    C1716o1 c1716o1 = new C1716o1();
                    c1716o1.m5294a(abstractC1717o2);
                    recyclerView.recordAnimationInfoIfBouncedHiddenView(abstractC1717o2, c1716o1);
                }
            }
            if (recyclerView.mState.f6727g || !abstractC1717o2.isBound()) {
                if (abstractC1717o2.isBound() || abstractC1717o2.needsUpdate() || abstractC1717o2.isInvalid()) {
                    if (!RecyclerView.sDebugAssertionsEnabled && abstractC1717o2.isRemoved()) {
                        StringBuilder sb6 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                        sb6.append(abstractC1717o2);
                        throw new IllegalStateException(AbstractC30802r.m94760i(recyclerView, sb6));
                    }
                    int iM5171f3 = recyclerView.mAdapterHelper.m5171f(i13, 0);
                    abstractC1717o2.mBindingAdapter = null;
                    abstractC1717o2.mOwnerRecyclerView = recyclerView;
                    itemViewType = abstractC1717o2.getItemViewType();
                    long nanoTime4 = recyclerView.getNanoTime();
                    if (j7 != Long.MAX_VALUE) {
                        j16 = this.f6597g.m5192a(itemViewType).f6567d;
                        if (j16 != 0 || j16 + nanoTime4 < j7) {
                        }
                    }
                    if (abstractC1717o2.isTmpDetached()) {
                        recyclerView.attachViewToParent(abstractC1717o2.itemView, recyclerView.getChildCount(), abstractC1717o2.itemView.getLayoutParams());
                        z14 = z13;
                    } else {
                        z14 = false;
                    }
                    recyclerView.mAdapter.bindViewHolder(abstractC1717o2, iM5171f3);
                    if (z14) {
                        recyclerView.detachViewFromParent(abstractC1717o2.itemView);
                    }
                    nanoTime = recyclerView.getNanoTime() - nanoTime4;
                    C1658a2 c1658a2M5192a2 = this.f6597g.m5192a(abstractC1717o2.getItemViewType());
                    j15 = c1658a2M5192a2.f6567d;
                    if (j15 != 0) {
                        nanoTime = (nanoTime / j14) + ((j15 / j14) * j13);
                    }
                    c1658a2M5192a2.f6567d = nanoTime;
                    if (recyclerView.isAccessibilityEnabled()) {
                        view = abstractC1717o2.itemView;
                        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                        if (view.getImportantForAccessibility() == 0) {
                            z15 = z13;
                            view.setImportantForAccessibility(z15 ? 1 : 0);
                        } else {
                            z15 = z13;
                        }
                        c1725q2 = recyclerView.mAccessibilityDelegate;
                        if (c1725q2 != null) {
                            c1721p2 = c1725q2.f6825e;
                            if (c1721p2 != null) {
                                accessibilityDelegateM47572c = AbstractC16901p0.m47572c(view);
                                if (accessibilityDelegateM47572c != null) {
                                    if (accessibilityDelegateM47572c instanceof C16855a) {
                                        c16858b = ((C16855a) accessibilityDelegateM47572c).f64770a;
                                    } else {
                                        c16858b = new C16858b(accessibilityDelegateM47572c);
                                    }
                                }
                                if (c16858b != null && c16858b != c1721p2) {
                                    c1721p2.f6809e.put(view, c16858b);
                                }
                            }
                            AbstractC16901p0.m47583n(view, c1721p2);
                        }
                    } else {
                        z15 = z13;
                    }
                    if (recyclerView.mState.f6727g) {
                        abstractC1717o2.mPreLayoutPosition = i13;
                    }
                    objArr = z15 ? 1 : 0;
                }
                layoutParams = abstractC1717o2.itemView.getLayoutParams();
                if (layoutParams == null) {
                    c1744v1 = (C1744v1) recyclerView.generateDefaultLayoutParams();
                    abstractC1717o2.itemView.setLayoutParams(c1744v1);
                } else if (recyclerView.checkLayoutParams(layoutParams)) {
                    c1744v1 = (C1744v1) layoutParams;
                } else {
                    c1744v1 = (C1744v1) recyclerView.generateLayoutParams(layoutParams);
                    abstractC1717o2.itemView.setLayoutParams(c1744v1);
                }
                c1744v1.f6891a = abstractC1717o2;
                if (z4 || objArr == null) {
                    z15 = false;
                }
                c1744v1.f6894d = z15;
                return abstractC1717o2;
            }
            abstractC1717o2.mPreLayoutPosition = i13;
            objArr = null;
            z15 = z13;
            layoutParams = abstractC1717o2.itemView.getLayoutParams();
            if (layoutParams == null) {
                c1744v1 = (C1744v1) recyclerView.generateDefaultLayoutParams();
                abstractC1717o2.itemView.setLayoutParams(c1744v1);
            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                c1744v1 = (C1744v1) recyclerView.generateLayoutParams(layoutParams);
                abstractC1717o2.itemView.setLayoutParams(c1744v1);
            } else {
                c1744v1 = (C1744v1) layoutParams;
            }
            c1744v1.f6891a = abstractC1717o2;
            if (z4) {
                z15 = false;
            } else {
                z15 = false;
            }
            c1744v1.f6894d = z15;
            return abstractC1717o2;
        }
        abstractC1717o2 = null;
        z4 = false;
        arrayList = this.f6591a;
        arrayList2 = this.f6593c;
        if (abstractC1717o2 == null) {
            size4 = arrayList.size();
            i14 = 0;
            while (true) {
                if (i14 < size4) {
                    arrayList4 = recyclerView.mChildHelper.f6688c;
                    size5 = arrayList4.size();
                    i15 = 0;
                    while (true) {
                        if (i15 < size5) {
                            z13 = true;
                            view3 = null;
                            break;
                        }
                        view3 = (View) arrayList4.get(i15);
                        childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view3);
                        z13 = true;
                        if (childViewHolderInt2.getLayoutPosition() != i13) {
                        }
                        i15++;
                    }
                    if (view3 != null) {
                        size6 = arrayList2.size();
                        i16 = 0;
                        while (true) {
                            if (i16 < size6) {
                                abstractC1717o2 = null;
                                break;
                            }
                            abstractC1717o6 = (AbstractC1717o2) arrayList2.get(i16);
                            if (abstractC1717o6.isInvalid()) {
                            }
                            i16++;
                        }
                    } else {
                        childViewHolderInt = RecyclerView.getChildViewHolderInt(view3);
                        c1694j = recyclerView.mChildHelper;
                        c1053d = c1694j.f6687b;
                        iIndexOfChild = c1694j.f6686a.f6659a.indexOfChild(view3);
                        if (iIndexOfChild >= 0) {
                            throw new IllegalArgumentException("view is not a child, cannot hide " + view3);
                        }
                        if (c1053d.m3084I(iIndexOfChild)) {
                            throw new RuntimeException("trying to unhide a view that was not hidden" + view3);
                        }
                        c1053d.m3081F(iIndexOfChild);
                        c1694j.m5263l(view3);
                        iM5261j = recyclerView.mChildHelper.m5261j(view3);
                        if (iM5261j != -1) {
                            StringBuilder sb7 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                            sb7.append(childViewHolderInt);
                            throw new IllegalStateException(AbstractC30802r.m94760i(recyclerView, sb7));
                        }
                        recyclerView.mChildHelper.m5254c(iM5261j);
                        m5204k(view3);
                        childViewHolderInt.addFlags(8224);
                        abstractC1717o2 = childViewHolderInt;
                        break;
                    }
                } else {
                    abstractC1717o7 = (AbstractC1717o2) arrayList.get(i14);
                    if (abstractC1717o7.wasReturnedFromScrap()) {
                    }
                    i14++;
                }
            }
            if (abstractC1717o2 != null) {
                if (abstractC1717o2.isRemoved()) {
                    i17 = abstractC1717o2.mPosition;
                    if (i17 >= 0) {
                    }
                    StringBuilder sb8 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                    sb8.append(abstractC1717o2);
                    throw new IndexOutOfBoundsException(AbstractC30802r.m94760i(recyclerView, sb8));
                }
                if (!RecyclerView.sDebugAssertionsEnabled) {
                }
                z17 = recyclerView.mState.f6727g;
                if (z17) {
                    abstractC1717o2.addFlags(4);
                    if (abstractC1717o2.isScrap()) {
                        recyclerView.removeDetachedView(abstractC1717o2.itemView, false);
                        abstractC1717o2.unScrap();
                    } else if (abstractC1717o2.wasReturnedFromScrap()) {
                        abstractC1717o2.clearReturnedFromScrapFlag();
                    }
                    m5203j(abstractC1717o2);
                    abstractC1717o2 = null;
                } else {
                    z4 = z13;
                }
            }
        } else {
            z13 = true;
        }
        if (abstractC1717o2 == null) {
            iM5171f = recyclerView.mAdapterHelper.m5171f(i13, 0);
            if (iM5171f >= 0) {
                j13 = 3;
                if (iM5171f < recyclerView.mAdapter.getItemCount()) {
                    itemViewType2 = recyclerView.mAdapter.getItemViewType(iM5171f);
                    if (recyclerView.mAdapter.hasStableIds()) {
                        itemId = recyclerView.mAdapter.getItemId(iM5171f);
                        size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                j14 = 4;
                                size3 = arrayList2.size() - 1;
                                while (true) {
                                    if (size3 >= 0) {
                                        abstractC1717o4 = (AbstractC1717o2) arrayList2.get(size3);
                                        if (abstractC1717o4.getItemId() == itemId) {
                                        }
                                        size3--;
                                    }
                                    abstractC1717o2 = null;
                                    break;
                                }
                            }
                            abstractC1717o5 = (AbstractC1717o2) arrayList.get(size2);
                            if (abstractC1717o5.getItemId() != itemId) {
                            }
                            size2--;
                        }
                        if (abstractC1717o2 != null) {
                            abstractC1717o2.mPosition = iM5171f;
                            z4 = z13;
                        }
                    } else {
                        j14 = 4;
                    }
                    if (abstractC1717o2 == null) {
                        if (RecyclerView.sVerboseLoggingEnabled) {
                            Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i13 + ") fetching from shared pool");
                        }
                        c1658a2 = (C1658a2) m5197c().f6582a.get(itemViewType2);
                        if (c1658a2 != null) {
                            abstractC1717o3 = null;
                            break;
                        }
                        arrayList3 = c1658a2.f6564a;
                        if (arrayList3.isEmpty()) {
                            abstractC1717o3 = null;
                            break;
                        }
                        size = arrayList3.size() - 1;
                        while (true) {
                            if (size >= 0) {
                                abstractC1717o3 = null;
                                break;
                            }
                            if (!((AbstractC1717o2) arrayList3.get(size)).isAttachedToTransitionOverlay()) {
                                abstractC1717o3 = (AbstractC1717o2) arrayList3.remove(size);
                                break;
                            }
                            size--;
                        }
                        if (abstractC1717o3 != null) {
                            abstractC1717o3.resetInternal();
                            if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                                view2 = abstractC1717o3.itemView;
                                if (view2 instanceof ViewGroup) {
                                    m5194d((ViewGroup) view2, false);
                                }
                            }
                        }
                        abstractC1717o2 = abstractC1717o3;
                    }
                    if (abstractC1717o2 == null) {
                        long nanoTime5 = recyclerView.getNanoTime();
                        if (j7 != Long.MAX_VALUE) {
                            j18 = this.f6597g.m5192a(itemViewType2).f6566c;
                            if (j18 != 0) {
                                z16 = z13;
                            } else {
                                z16 = z13;
                            }
                            if (!z16) {
                                return null;
                            }
                        }
                        abstractC1717o2CreateViewHolder = recyclerView.mAdapter.createViewHolder(recyclerView, itemViewType2);
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                            abstractC1717o2CreateViewHolder.mNestedRecyclerView = new WeakReference<>(recyclerViewFindNestedRecyclerView);
                        }
                        nanoTime2 = recyclerView.getNanoTime() - nanoTime5;
                        C1658a2 c1658a2M5192a3 = this.f6597g.m5192a(itemViewType2);
                        j17 = c1658a2M5192a3.f6566c;
                        if (j17 != 0) {
                            nanoTime2 = (nanoTime2 / j14) + ((j17 / j14) * 3);
                        }
                        c1658a2M5192a3.f6566c = nanoTime2;
                        if (RecyclerView.sVerboseLoggingEnabled) {
                            Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                        }
                        abstractC1717o2 = abstractC1717o2CreateViewHolder;
                    }
                }
            }
            StringBuilder sbM30465s3 = AbstractC11266d.m30465s(i13, iM5171f, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
            sbM30465s3.append(recyclerView.mState.m5276b());
            sbM30465s3.append(recyclerView.exceptionLabel());
            throw new IndexOutOfBoundsException(sbM30465s3.toString());
        }
        j13 = 3;
        j14 = 4;
        if (z4) {
            abstractC1717o2.setFlags(0, DfuBaseService.ERROR_REMOTE_MASK);
            if (recyclerView.mState.f6730j) {
                AbstractC1720p1.m5295b(abstractC1717o2);
                AbstractC1720p1 abstractC1720p2 = recyclerView.mItemAnimator;
                abstractC1717o2.getUnmodifiedPayloads();
                abstractC1720p2.getClass();
                C1716o1 c1716o2 = new C1716o1();
                c1716o2.m5294a(abstractC1717o2);
                recyclerView.recordAnimationInfoIfBouncedHiddenView(abstractC1717o2, c1716o2);
            }
        }
        if (recyclerView.mState.f6727g) {
            if (abstractC1717o2.isBound()) {
                if (!RecyclerView.sDebugAssertionsEnabled) {
                }
                int iM5171f4 = recyclerView.mAdapterHelper.m5171f(i13, 0);
                abstractC1717o2.mBindingAdapter = null;
                abstractC1717o2.mOwnerRecyclerView = recyclerView;
                itemViewType = abstractC1717o2.getItemViewType();
                long nanoTime6 = recyclerView.getNanoTime();
                if (j7 != Long.MAX_VALUE) {
                    j16 = this.f6597g.m5192a(itemViewType).f6567d;
                    if (j16 != 0) {
                    }
                }
                if (abstractC1717o2.isTmpDetached()) {
                    recyclerView.attachViewToParent(abstractC1717o2.itemView, recyclerView.getChildCount(), abstractC1717o2.itemView.getLayoutParams());
                    z14 = z13;
                } else {
                    z14 = false;
                }
                recyclerView.mAdapter.bindViewHolder(abstractC1717o2, iM5171f4);
                if (z14) {
                    recyclerView.detachViewFromParent(abstractC1717o2.itemView);
                }
                nanoTime = recyclerView.getNanoTime() - nanoTime6;
                C1658a2 c1658a2M5192a4 = this.f6597g.m5192a(abstractC1717o2.getItemViewType());
                j15 = c1658a2M5192a4.f6567d;
                if (j15 != 0) {
                    nanoTime = (nanoTime / j14) + ((j15 / j14) * j13);
                }
                c1658a2M5192a4.f6567d = nanoTime;
                if (recyclerView.isAccessibilityEnabled()) {
                    view = abstractC1717o2.itemView;
                    WeakHashMap weakHashMap2 = AbstractC16901p0.f64851a;
                    if (view.getImportantForAccessibility() == 0) {
                        z15 = z13;
                        view.setImportantForAccessibility(z15 ? 1 : 0);
                    } else {
                        z15 = z13;
                    }
                    c1725q2 = recyclerView.mAccessibilityDelegate;
                    if (c1725q2 != null) {
                        c1721p2 = c1725q2.f6825e;
                        if (c1721p2 != null) {
                            accessibilityDelegateM47572c = AbstractC16901p0.m47572c(view);
                            if (accessibilityDelegateM47572c != null) {
                                if (accessibilityDelegateM47572c instanceof C16855a) {
                                    c16858b = ((C16855a) accessibilityDelegateM47572c).f64770a;
                                } else {
                                    c16858b = new C16858b(accessibilityDelegateM47572c);
                                }
                            }
                            if (c16858b != null) {
                                c1721p2.f6809e.put(view, c16858b);
                            }
                        }
                        AbstractC16901p0.m47583n(view, c1721p2);
                    }
                } else {
                    z15 = z13;
                }
                if (recyclerView.mState.f6727g) {
                    abstractC1717o2.mPreLayoutPosition = i13;
                }
                objArr = z15 ? 1 : 0;
            } else {
                if (!RecyclerView.sDebugAssertionsEnabled) {
                }
                int iM5171f5 = recyclerView.mAdapterHelper.m5171f(i13, 0);
                abstractC1717o2.mBindingAdapter = null;
                abstractC1717o2.mOwnerRecyclerView = recyclerView;
                itemViewType = abstractC1717o2.getItemViewType();
                long nanoTime7 = recyclerView.getNanoTime();
                if (j7 != Long.MAX_VALUE) {
                    j16 = this.f6597g.m5192a(itemViewType).f6567d;
                    if (j16 != 0) {
                    }
                }
                if (abstractC1717o2.isTmpDetached()) {
                    recyclerView.attachViewToParent(abstractC1717o2.itemView, recyclerView.getChildCount(), abstractC1717o2.itemView.getLayoutParams());
                    z14 = z13;
                } else {
                    z14 = false;
                }
                recyclerView.mAdapter.bindViewHolder(abstractC1717o2, iM5171f5);
                if (z14) {
                    recyclerView.detachViewFromParent(abstractC1717o2.itemView);
                }
                nanoTime = recyclerView.getNanoTime() - nanoTime7;
                C1658a2 c1658a2M5192a5 = this.f6597g.m5192a(abstractC1717o2.getItemViewType());
                j15 = c1658a2M5192a5.f6567d;
                if (j15 != 0) {
                    nanoTime = (nanoTime / j14) + ((j15 / j14) * j13);
                }
                c1658a2M5192a5.f6567d = nanoTime;
                if (recyclerView.isAccessibilityEnabled()) {
                    view = abstractC1717o2.itemView;
                    WeakHashMap weakHashMap3 = AbstractC16901p0.f64851a;
                    if (view.getImportantForAccessibility() == 0) {
                        z15 = z13;
                        view.setImportantForAccessibility(z15 ? 1 : 0);
                    } else {
                        z15 = z13;
                    }
                    c1725q2 = recyclerView.mAccessibilityDelegate;
                    if (c1725q2 != null) {
                        c1721p2 = c1725q2.f6825e;
                        if (c1721p2 != null) {
                            accessibilityDelegateM47572c = AbstractC16901p0.m47572c(view);
                            if (accessibilityDelegateM47572c != null) {
                                if (accessibilityDelegateM47572c instanceof C16855a) {
                                    c16858b = ((C16855a) accessibilityDelegateM47572c).f64770a;
                                } else {
                                    c16858b = new C16858b(accessibilityDelegateM47572c);
                                }
                            }
                            if (c16858b != null) {
                                c1721p2.f6809e.put(view, c16858b);
                            }
                        }
                        AbstractC16901p0.m47583n(view, c1721p2);
                    }
                } else {
                    z15 = z13;
                }
                if (recyclerView.mState.f6727g) {
                    abstractC1717o2.mPreLayoutPosition = i13;
                }
                objArr = z15 ? 1 : 0;
            }
        } else if (abstractC1717o2.isBound()) {
            if (!RecyclerView.sDebugAssertionsEnabled) {
            }
            int iM5171f6 = recyclerView.mAdapterHelper.m5171f(i13, 0);
            abstractC1717o2.mBindingAdapter = null;
            abstractC1717o2.mOwnerRecyclerView = recyclerView;
            itemViewType = abstractC1717o2.getItemViewType();
            long nanoTime8 = recyclerView.getNanoTime();
            if (j7 != Long.MAX_VALUE) {
                j16 = this.f6597g.m5192a(itemViewType).f6567d;
                if (j16 != 0) {
                }
            }
            if (abstractC1717o2.isTmpDetached()) {
                recyclerView.attachViewToParent(abstractC1717o2.itemView, recyclerView.getChildCount(), abstractC1717o2.itemView.getLayoutParams());
                z14 = z13;
            } else {
                z14 = false;
            }
            recyclerView.mAdapter.bindViewHolder(abstractC1717o2, iM5171f6);
            if (z14) {
                recyclerView.detachViewFromParent(abstractC1717o2.itemView);
            }
            nanoTime = recyclerView.getNanoTime() - nanoTime8;
            C1658a2 c1658a2M5192a6 = this.f6597g.m5192a(abstractC1717o2.getItemViewType());
            j15 = c1658a2M5192a6.f6567d;
            if (j15 != 0) {
                nanoTime = (nanoTime / j14) + ((j15 / j14) * j13);
            }
            c1658a2M5192a6.f6567d = nanoTime;
            if (recyclerView.isAccessibilityEnabled()) {
                view = abstractC1717o2.itemView;
                WeakHashMap weakHashMap4 = AbstractC16901p0.f64851a;
                if (view.getImportantForAccessibility() == 0) {
                    z15 = z13;
                    view.setImportantForAccessibility(z15 ? 1 : 0);
                } else {
                    z15 = z13;
                }
                c1725q2 = recyclerView.mAccessibilityDelegate;
                if (c1725q2 != null) {
                    c1721p2 = c1725q2.f6825e;
                    if (c1721p2 != null) {
                        accessibilityDelegateM47572c = AbstractC16901p0.m47572c(view);
                        if (accessibilityDelegateM47572c != null) {
                            if (accessibilityDelegateM47572c instanceof C16855a) {
                                c16858b = ((C16855a) accessibilityDelegateM47572c).f64770a;
                            } else {
                                c16858b = new C16858b(accessibilityDelegateM47572c);
                            }
                        }
                        if (c16858b != null) {
                            c1721p2.f6809e.put(view, c16858b);
                        }
                    }
                    AbstractC16901p0.m47583n(view, c1721p2);
                }
            } else {
                z15 = z13;
            }
            if (recyclerView.mState.f6727g) {
                abstractC1717o2.mPreLayoutPosition = i13;
            }
            objArr = z15 ? 1 : 0;
        } else {
            if (!RecyclerView.sDebugAssertionsEnabled) {
            }
            int iM5171f7 = recyclerView.mAdapterHelper.m5171f(i13, 0);
            abstractC1717o2.mBindingAdapter = null;
            abstractC1717o2.mOwnerRecyclerView = recyclerView;
            itemViewType = abstractC1717o2.getItemViewType();
            long nanoTime9 = recyclerView.getNanoTime();
            if (j7 != Long.MAX_VALUE) {
                j16 = this.f6597g.m5192a(itemViewType).f6567d;
                if (j16 != 0) {
                }
            }
            if (abstractC1717o2.isTmpDetached()) {
                recyclerView.attachViewToParent(abstractC1717o2.itemView, recyclerView.getChildCount(), abstractC1717o2.itemView.getLayoutParams());
                z14 = z13;
            } else {
                z14 = false;
            }
            recyclerView.mAdapter.bindViewHolder(abstractC1717o2, iM5171f7);
            if (z14) {
                recyclerView.detachViewFromParent(abstractC1717o2.itemView);
            }
            nanoTime = recyclerView.getNanoTime() - nanoTime9;
            C1658a2 c1658a2M5192a7 = this.f6597g.m5192a(abstractC1717o2.getItemViewType());
            j15 = c1658a2M5192a7.f6567d;
            if (j15 != 0) {
                nanoTime = (nanoTime / j14) + ((j15 / j14) * j13);
            }
            c1658a2M5192a7.f6567d = nanoTime;
            if (recyclerView.isAccessibilityEnabled()) {
                view = abstractC1717o2.itemView;
                WeakHashMap weakHashMap5 = AbstractC16901p0.f64851a;
                if (view.getImportantForAccessibility() == 0) {
                    z15 = z13;
                    view.setImportantForAccessibility(z15 ? 1 : 0);
                } else {
                    z15 = z13;
                }
                c1725q2 = recyclerView.mAccessibilityDelegate;
                if (c1725q2 != null) {
                    c1721p2 = c1725q2.f6825e;
                    if (c1721p2 != null) {
                        accessibilityDelegateM47572c = AbstractC16901p0.m47572c(view);
                        if (accessibilityDelegateM47572c != null) {
                            if (accessibilityDelegateM47572c instanceof C16855a) {
                                c16858b = ((C16855a) accessibilityDelegateM47572c).f64770a;
                            } else {
                                c16858b = new C16858b(accessibilityDelegateM47572c);
                            }
                        }
                        if (c16858b != null) {
                            c1721p2.f6809e.put(view, c16858b);
                        }
                    }
                    AbstractC16901p0.m47583n(view, c1721p2);
                }
            } else {
                z15 = z13;
            }
            if (recyclerView.mState.f6727g) {
                abstractC1717o2.mPreLayoutPosition = i13;
            }
            objArr = z15 ? 1 : 0;
        }
        layoutParams = abstractC1717o2.itemView.getLayoutParams();
        if (layoutParams == null) {
            c1744v1 = (C1744v1) recyclerView.generateDefaultLayoutParams();
            abstractC1717o2.itemView.setLayoutParams(c1744v1);
        } else if (recyclerView.checkLayoutParams(layoutParams)) {
            c1744v1 = (C1744v1) recyclerView.generateLayoutParams(layoutParams);
            abstractC1717o2.itemView.setLayoutParams(c1744v1);
        } else {
            c1744v1 = (C1744v1) layoutParams;
        }
        c1744v1.f6891a = abstractC1717o2;
        if (z4) {
            z15 = false;
        } else {
            z15 = false;
        }
        c1744v1.f6894d = z15;
        return abstractC1717o2;
    }

    /* JADX INFO: renamed from: m */
    public final void m5206m(AbstractC1717o2 abstractC1717o2) {
        if (abstractC1717o2.mInChangeScrap) {
            this.f6592b.remove(abstractC1717o2);
        } else {
            this.f6591a.remove(abstractC1717o2);
        }
        abstractC1717o2.mScrapContainer = null;
        abstractC1717o2.mInChangeScrap = false;
        abstractC1717o2.clearReturnedFromScrapFlag();
    }

    /* JADX INFO: renamed from: n */
    public final void m5207n() {
        AbstractC1740u1 abstractC1740u1 = this.f6598h.mLayout;
        this.f6596f = this.f6595e + (abstractC1740u1 != null ? abstractC1740u1.mPrefetchMaxCountObserved : 0);
        ArrayList arrayList = this.f6593c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f6596f; size--) {
            m5201h(size);
        }
    }
}
