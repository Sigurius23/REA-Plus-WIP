package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.whoop.android.R;
import e10.C12554k0;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.SwipeReplyCallback;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p184h5.AbstractC16901p0;

/* JADX INFO: renamed from: androidx.recyclerview.widget.o0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1715o0 extends AbstractC1724q1 implements InterfaceC1748w1 {

    /* JADX INFO: renamed from: A */
    public Rect f6767A;

    /* JADX INFO: renamed from: B */
    public long f6768B;

    /* JADX INFO: renamed from: d */
    public float f6772d;

    /* JADX INFO: renamed from: e */
    public float f6773e;

    /* JADX INFO: renamed from: f */
    public float f6774f;

    /* JADX INFO: renamed from: g */
    public float f6775g;

    /* JADX INFO: renamed from: h */
    public float f6776h;

    /* JADX INFO: renamed from: i */
    public float f6777i;

    /* JADX INFO: renamed from: j */
    public float f6778j;

    /* JADX INFO: renamed from: k */
    public float f6779k;

    /* JADX INFO: renamed from: m */
    public final SwipeReplyCallback f6781m;

    /* JADX INFO: renamed from: o */
    public int f6783o;

    /* JADX INFO: renamed from: q */
    public int f6785q;

    /* JADX INFO: renamed from: r */
    public RecyclerView f6786r;

    /* JADX INFO: renamed from: t */
    public VelocityTracker f6788t;

    /* JADX INFO: renamed from: u */
    public ArrayList f6789u;

    /* JADX INFO: renamed from: v */
    public ArrayList f6790v;

    /* JADX INFO: renamed from: x */
    public C12554k0 f6792x;

    /* JADX INFO: renamed from: y */
    public C1711n0 f6793y;

    /* JADX INFO: renamed from: a */
    public final ArrayList f6769a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final float[] f6770b = new float[2];

    /* JADX INFO: renamed from: c */
    public AbstractC1717o2 f6771c = null;

    /* JADX INFO: renamed from: l */
    public int f6780l = -1;

    /* JADX INFO: renamed from: n */
    public int f6782n = 0;

    /* JADX INFO: renamed from: p */
    public final ArrayList f6784p = new ArrayList();

    /* JADX INFO: renamed from: s */
    public final RunnableC1758z f6787s = new RunnableC1758z(this, 1);

    /* JADX INFO: renamed from: w */
    public View f6791w = null;

    /* JADX INFO: renamed from: z */
    public final C1691i0 f6794z = new C1691i0(this);

    public C1715o0(SwipeReplyCallback swipeReplyCallback) {
        this.f6781m = swipeReplyCallback;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m5280l(View view, float f13, float f14, float f15, float f16) {
        return f13 >= f15 && f13 <= f15 + ((float) view.getWidth()) && f14 >= f16 && f14 <= f16 + ((float) view.getHeight());
    }

    @Override // androidx.recyclerview.widget.InterfaceC1748w1
    /* JADX INFO: renamed from: a */
    public final void mo5281a(View view) {
        m5291n(view);
        AbstractC1717o2 childViewHolder = this.f6786r.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        AbstractC1717o2 abstractC1717o2 = this.f6771c;
        if (abstractC1717o2 != null && childViewHolder == abstractC1717o2) {
            m5292o(null, 0);
            return;
        }
        m5287i(childViewHolder, false);
        if (this.f6769a.remove(childViewHolder.itemView)) {
            this.f6781m.clearView(this.f6786r, childViewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.InterfaceC1748w1
    /* JADX INFO: renamed from: c */
    public final void mo5282c(View view) {
    }

    /* JADX INFO: renamed from: e */
    public final void m5283e(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f6786r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        C1691i0 c1691i0 = this.f6794z;
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.f6786r.removeOnItemTouchListener(c1691i0);
            this.f6786r.removeOnChildAttachStateChangeListener(this);
            ArrayList arrayList = this.f6784p;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C1695j0 c1695j0 = (C1695j0) arrayList.get(0);
                c1695j0.f6697g.cancel();
                this.f6781m.clearView(this.f6786r, c1695j0.f6695e);
            }
            arrayList.clear();
            this.f6791w = null;
            VelocityTracker velocityTracker = this.f6788t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f6788t = null;
            }
            C1711n0 c1711n0 = this.f6793y;
            if (c1711n0 != null) {
                c1711n0.f6752w = false;
                this.f6793y = null;
            }
            if (this.f6792x != null) {
                this.f6792x = null;
            }
        }
        this.f6786r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f6774f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            this.f6775g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            this.f6785q = ViewConfiguration.get(this.f6786r.getContext()).getScaledTouchSlop();
            this.f6786r.addItemDecoration(this, -1);
            this.f6786r.addOnItemTouchListener(c1691i0);
            this.f6786r.addOnChildAttachStateChangeListener(this);
            this.f6793y = new C1711n0(this);
            this.f6792x = new C12554k0(this.f6786r.getContext(), this.f6793y);
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m5284f(AbstractC1717o2 abstractC1717o2, int i13) {
        if ((i13 & 12) == 0) {
            return 0;
        }
        int i14 = this.f6776h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f6788t;
        SwipeReplyCallback swipeReplyCallback = this.f6781m;
        if (velocityTracker != null && this.f6780l > -1) {
            float f13 = this.f6775g;
            swipeReplyCallback.getClass();
            velocityTracker.computeCurrentVelocity(1000, f13);
            float xVelocity = this.f6788t.getXVelocity(this.f6780l);
            float yVelocity = this.f6788t.getYVelocity(this.f6780l);
            int i15 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i15 & i13) != 0 && i14 == i15 && fAbs >= this.f6774f && fAbs > Math.abs(yVelocity)) {
                return i15;
            }
        }
        float width = this.f6786r.getWidth();
        swipeReplyCallback.getSwipeThreshold(abstractC1717o2);
        float f14 = 0.3f * width;
        if ((i13 & i14) == 0 || Math.abs(this.f6776h) <= f14) {
            return 0;
        }
        return i14;
    }

    /* JADX INFO: renamed from: g */
    public final void m5285g(int i13, int i14, MotionEvent motionEvent) {
        int absoluteMovementFlags;
        View viewM5288j;
        if (this.f6771c == null && i13 == 2 && this.f6782n != 2) {
            SwipeReplyCallback swipeReplyCallback = this.f6781m;
            swipeReplyCallback.getClass();
            if (this.f6786r.getScrollState() == 1) {
                return;
            }
            AbstractC1740u1 layoutManager = this.f6786r.getLayoutManager();
            int i15 = this.f6780l;
            AbstractC1717o2 childViewHolder = null;
            if (i15 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i15);
                float x3 = motionEvent.getX(iFindPointerIndex) - this.f6772d;
                float y13 = motionEvent.getY(iFindPointerIndex) - this.f6773e;
                float fAbs = Math.abs(x3);
                float fAbs2 = Math.abs(y13);
                float f13 = this.f6785q;
                if ((fAbs >= f13 || fAbs2 >= f13) && ((fAbs <= fAbs2 || !layoutManager.canScrollHorizontally()) && ((fAbs2 <= fAbs || !layoutManager.canScrollVertically()) && (viewM5288j = m5288j(motionEvent)) != null))) {
                    childViewHolder = this.f6786r.getChildViewHolder(viewM5288j);
                }
            }
            if (childViewHolder == null || (absoluteMovementFlags = (swipeReplyCallback.getAbsoluteMovementFlags(this.f6786r, childViewHolder) & 65280) >> 8) == 0) {
                return;
            }
            float x5 = motionEvent.getX(i14);
            float y14 = motionEvent.getY(i14);
            float f14 = x5 - this.f6772d;
            float f15 = y14 - this.f6773e;
            float fAbs3 = Math.abs(f14);
            float fAbs4 = Math.abs(f15);
            float f16 = this.f6785q;
            if (fAbs3 >= f16 || fAbs4 >= f16) {
                if (fAbs3 > fAbs4) {
                    if (f14 < 0.0f && (absoluteMovementFlags & 4) == 0) {
                        return;
                    }
                    if (f14 > 0.0f && (absoluteMovementFlags & 8) == 0) {
                        return;
                    }
                } else {
                    if (f15 < 0.0f && (absoluteMovementFlags & 1) == 0) {
                        return;
                    }
                    if (f15 > 0.0f && (absoluteMovementFlags & 2) == 0) {
                        return;
                    }
                }
                this.f6777i = 0.0f;
                this.f6776h = 0.0f;
                this.f6780l = motionEvent.getPointerId(0);
                m5292o(childViewHolder, 1);
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1724q1
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1701k2 c1701k2) {
        rect.setEmpty();
    }

    /* JADX INFO: renamed from: h */
    public final int m5286h(AbstractC1717o2 abstractC1717o2, int i13) {
        if ((i13 & 3) == 0) {
            return 0;
        }
        int i14 = this.f6777i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f6788t;
        SwipeReplyCallback swipeReplyCallback = this.f6781m;
        if (velocityTracker != null && this.f6780l > -1) {
            float f13 = this.f6775g;
            swipeReplyCallback.getClass();
            velocityTracker.computeCurrentVelocity(1000, f13);
            float xVelocity = this.f6788t.getXVelocity(this.f6780l);
            float yVelocity = this.f6788t.getYVelocity(this.f6780l);
            int i15 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i15 & i13) != 0 && i15 == i14 && fAbs >= this.f6774f && fAbs > Math.abs(xVelocity)) {
                return i15;
            }
        }
        float height = this.f6786r.getHeight();
        swipeReplyCallback.getSwipeThreshold(abstractC1717o2);
        float f14 = 0.3f * height;
        if ((i13 & i14) == 0 || Math.abs(this.f6777i) <= f14) {
            return 0;
        }
        return i14;
    }

    /* JADX INFO: renamed from: i */
    public final void m5287i(AbstractC1717o2 abstractC1717o2, boolean z4) {
        ArrayList arrayList = this.f6784p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1695j0 c1695j0 = (C1695j0) arrayList.get(size);
            if (c1695j0.f6695e == abstractC1717o2) {
                c1695j0.f6701k |= z4;
                if (!c1695j0.f6702l) {
                    c1695j0.f6697g.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final View m5288j(MotionEvent motionEvent) {
        float x3 = motionEvent.getX();
        float y13 = motionEvent.getY();
        AbstractC1717o2 abstractC1717o2 = this.f6771c;
        if (abstractC1717o2 != null) {
            View view = abstractC1717o2.itemView;
            if (m5280l(view, x3, y13, this.f6778j + this.f6776h, this.f6779k + this.f6777i)) {
                return view;
            }
        }
        ArrayList arrayList = this.f6784p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1695j0 c1695j0 = (C1695j0) arrayList.get(size);
            View view2 = c1695j0.f6695e.itemView;
            if (m5280l(view2, x3, y13, c1695j0.f6699i, c1695j0.f6700j)) {
                return view2;
            }
        }
        return this.f6786r.findChildViewUnder(x3, y13);
    }

    /* JADX INFO: renamed from: k */
    public final void m5289k(float[] fArr) {
        if ((this.f6783o & 12) != 0) {
            fArr[0] = (this.f6778j + this.f6776h) - this.f6771c.itemView.getLeft();
        } else {
            fArr[0] = this.f6771c.itemView.getTranslationX();
        }
        if ((this.f6783o & 3) != 0) {
            fArr[1] = (this.f6779k + this.f6777i) - this.f6771c.itemView.getTop();
        } else {
            fArr[1] = this.f6771c.itemView.getTranslationY();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: m */
    public final void m5290m(AbstractC1717o2 abstractC1717o2) {
        if (this.f6786r.isLayoutRequested()) {
            return;
        }
        char c3 = 2;
        if (this.f6782n != 2) {
            return;
        }
        SwipeReplyCallback swipeReplyCallback = this.f6781m;
        swipeReplyCallback.getClass();
        int i13 = (int) (this.f6778j + this.f6776h);
        int i14 = (int) (this.f6779k + this.f6777i);
        if (Math.abs(i14 - abstractC1717o2.itemView.getTop()) >= abstractC1717o2.itemView.getHeight() * 0.5f || Math.abs(i13 - abstractC1717o2.itemView.getLeft()) >= abstractC1717o2.itemView.getWidth() * 0.5f) {
            ArrayList arrayList = this.f6789u;
            if (arrayList == null) {
                this.f6789u = new ArrayList();
                this.f6790v = new ArrayList();
            } else {
                arrayList.clear();
                this.f6790v.clear();
            }
            int iRound = Math.round(this.f6778j + this.f6776h);
            int iRound2 = Math.round(this.f6779k + this.f6777i);
            int width = abstractC1717o2.itemView.getWidth() + iRound;
            int height = abstractC1717o2.itemView.getHeight() + iRound2;
            int i15 = (iRound + width) / 2;
            int i16 = (iRound2 + height) / 2;
            AbstractC1740u1 layoutManager = this.f6786r.getLayoutManager();
            int childCount = layoutManager.getChildCount();
            int i17 = 0;
            while (i17 < childCount) {
                char c7 = c3;
                View childAt = layoutManager.getChildAt(i17);
                if (childAt != abstractC1717o2.itemView && childAt.getBottom() >= iRound2 && childAt.getTop() <= height && childAt.getRight() >= iRound && childAt.getLeft() <= width) {
                    AbstractC1717o2 childViewHolder = this.f6786r.getChildViewHolder(childAt);
                    int iAbs = Math.abs(i15 - ((childAt.getRight() + childAt.getLeft()) / 2));
                    int iAbs2 = Math.abs(i16 - ((childAt.getBottom() + childAt.getTop()) / 2));
                    int i18 = (iAbs2 * iAbs2) + (iAbs * iAbs);
                    int size = this.f6789u.size();
                    int i19 = 0;
                    int i24 = 0;
                    while (i19 < size) {
                        int i25 = size;
                        if (i18 <= ((Integer) this.f6790v.get(i19)).intValue()) {
                            break;
                        }
                        i24++;
                        i19++;
                        size = i25;
                    }
                    this.f6789u.add(i24, childViewHolder);
                    this.f6790v.add(i24, Integer.valueOf(i18));
                }
                i17++;
                c3 = c7;
                iRound = iRound;
                iRound2 = iRound2;
                width = width;
            }
            ArrayList arrayList2 = this.f6789u;
            if (arrayList2.size() == 0) {
                return;
            }
            AbstractC1717o2 abstractC1717o2ChooseDropTarget = swipeReplyCallback.chooseDropTarget(abstractC1717o2, arrayList2, i13, i14);
            if (abstractC1717o2ChooseDropTarget == null) {
                this.f6789u.clear();
                this.f6790v.clear();
            } else {
                abstractC1717o2ChooseDropTarget.getAbsoluteAdapterPosition();
                abstractC1717o2.getAbsoluteAdapterPosition();
                swipeReplyCallback.onMove(this.f6786r, abstractC1717o2, abstractC1717o2ChooseDropTarget);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m5291n(View view) {
        if (view == this.f6791w) {
            this.f6791w = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.recyclerview.widget.m0, io.getstream.chat.android.ui.feature.messages.list.internal.SwipeReplyCallback] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [androidx.recyclerview.widget.m0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3, types: [androidx.recyclerview.widget.m0] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [androidx.recyclerview.widget.m0] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r20v0, types: [androidx.recyclerview.widget.o0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.recyclerview.widget.o2] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: o */
    public final void m5292o(AbstractC1717o2 abstractC1717o2, int i13) {
        ?? r14;
        ?? r15;
        boolean z4;
        ?? r16;
        ?? r17;
        ?? r18;
        int iM5286h;
        char c3;
        float fSignum;
        if (abstractC1717o2 == this.f6771c && i13 == this.f6782n) {
            return;
        }
        this.f6768B = Long.MIN_VALUE;
        int i14 = this.f6782n;
        m5287i(abstractC1717o2, true);
        this.f6782n = i13;
        if (i13 == 2) {
            if (abstractC1717o2 == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.f6791w = abstractC1717o2.itemView;
        }
        int i15 = (1 << ((i13 * 8) + 8)) - 1;
        ?? r10 = this.f6771c;
        ?? r19 = this.f6781m;
        if (r10 != 0) {
            if (r10.itemView.getParent() != null) {
                if (i14 == 2 || this.f6782n == 2) {
                    iM5286h = 0;
                } else {
                    int movementFlags = r19.getMovementFlags(this.f6786r, r10);
                    RecyclerView recyclerView = this.f6786r;
                    WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                    int iConvertToAbsoluteDirection = (r19.convertToAbsoluteDirection(movementFlags, recyclerView.getLayoutDirection()) & 65280) >> 8;
                    if (iConvertToAbsoluteDirection == 0) {
                        iM5286h = 0;
                    } else {
                        int i16 = (movementFlags & 65280) >> 8;
                        if (Math.abs(this.f6776h) > Math.abs(this.f6777i)) {
                            iM5286h = m5284f(r10, iConvertToAbsoluteDirection);
                            if (iM5286h <= 0) {
                                iM5286h = m5286h(r10, iConvertToAbsoluteDirection);
                                if (iM5286h <= 0) {
                                    iM5286h = 0;
                                }
                            } else if ((i16 & iM5286h) == 0) {
                                iM5286h = AbstractC1707m0.convertToRelativeDirection(iM5286h, this.f6786r.getLayoutDirection());
                            }
                        } else {
                            iM5286h = m5286h(r10, iConvertToAbsoluteDirection);
                            if (iM5286h <= 0) {
                                iM5286h = m5284f(r10, iConvertToAbsoluteDirection);
                                if (iM5286h <= 0) {
                                    iM5286h = 0;
                                } else if ((i16 & iM5286h) == 0) {
                                    iM5286h = AbstractC1707m0.convertToRelativeDirection(iM5286h, this.f6786r.getLayoutDirection());
                                }
                            }
                        }
                    }
                }
                VelocityTracker velocityTracker = this.f6788t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f6788t = null;
                }
                int i17 = 4;
                float fSignum2 = 0.0f;
                if (iM5286h == 1 || iM5286h == 2) {
                    c3 = 0;
                    fSignum = Math.signum(this.f6777i) * this.f6786r.getHeight();
                } else if (iM5286h == 4 || iM5286h == 8 || iM5286h == 16 || iM5286h == 32) {
                    c3 = 0;
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.f6776h) * this.f6786r.getWidth();
                } else {
                    fSignum = 0.0f;
                    c3 = 0;
                }
                if (i14 == 2) {
                    i17 = 8;
                } else if (iM5286h > 0) {
                    i17 = 2;
                }
                float[] fArr = this.f6770b;
                m5289k(fArr);
                float f13 = fSignum2;
                float f14 = fSignum;
                float f15 = fArr[c3];
                float f16 = fArr[1];
                ?? r110 = c3;
                ?? r111 = r19;
                C1695j0 c1695j0 = new C1695j0(this, r10, i14, f15, f16, f13, f14, iM5286h, r10);
                long animationDuration = r111.getAnimationDuration(this.f6786r, i17, f13 - f15, f14 - f16);
                ValueAnimator valueAnimator = c1695j0.f6697g;
                valueAnimator.setDuration(animationDuration);
                this.f6784p.add(c1695j0);
                r10.setIsRecyclable(r110);
                valueAnimator.start();
                z4 = true;
                r17 = r110;
                r18 = r111;
            } else {
                ?? r112 = r19;
                r17 = 0;
                m5291n(r10.itemView);
                r112.clearView(this.f6786r, r10);
                z4 = false;
                r18 = r112;
            }
            this.f6771c = null;
            r15 = r17;
            r14 = r18;
        } else {
            r14 = r19;
            r15 = 0;
            z4 = false;
        }
        if (abstractC1717o2 != null) {
            this.f6783o = (r14.getAbsoluteMovementFlags(this.f6786r, abstractC1717o2) & i15) >> (this.f6782n * 8);
            this.f6778j = abstractC1717o2.itemView.getLeft();
            this.f6779k = abstractC1717o2.itemView.getTop();
            this.f6771c = abstractC1717o2;
            if (i13 == 2) {
                abstractC1717o2.itemView.performHapticFeedback(r15 == true ? 1 : 0);
            }
        }
        ?? parent = this.f6786r.getParent();
        if (parent != 0) {
            if (this.f6771c != null) {
                r16 = r15;
                r16 = 1;
            }
            r16 = r15;
            parent.requestDisallowInterceptTouchEvent(r16);
        }
        if (!z4) {
            this.f6786r.getLayoutManager().requestSimpleAnimationsInNextLayout();
        }
        r14.getClass();
        this.f6786r.invalidate();
    }

    @Override // androidx.recyclerview.widget.AbstractC1724q1
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, C1701k2 c1701k2) {
        float f13;
        float f14;
        if (this.f6771c != null) {
            float[] fArr = this.f6770b;
            m5289k(fArr);
            float f15 = fArr[0];
            f14 = fArr[1];
            f13 = f15;
        } else {
            f13 = 0.0f;
            f14 = 0.0f;
        }
        this.f6781m.onDraw(canvas, recyclerView, this.f6771c, this.f6784p, this.f6782n, f13, f14);
    }

    @Override // androidx.recyclerview.widget.AbstractC1724q1
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, C1701k2 c1701k2) {
        float f13;
        float f14;
        if (this.f6771c != null) {
            float[] fArr = this.f6770b;
            m5289k(fArr);
            float f15 = fArr[0];
            f14 = fArr[1];
            f13 = f15;
        } else {
            f13 = 0.0f;
            f14 = 0.0f;
        }
        this.f6781m.onDrawOver(canvas, recyclerView, this.f6771c, this.f6784p, this.f6782n, f13, f14);
    }

    /* JADX INFO: renamed from: p */
    public final void m5293p(int i13, int i14, MotionEvent motionEvent) {
        float x3 = motionEvent.getX(i14);
        float y13 = motionEvent.getY(i14);
        float f13 = x3 - this.f6772d;
        this.f6776h = f13;
        this.f6777i = y13 - this.f6773e;
        if ((i13 & 4) == 0) {
            this.f6776h = Math.max(0.0f, f13);
        }
        if ((i13 & 8) == 0) {
            this.f6776h = Math.min(0.0f, this.f6776h);
        }
        if ((i13 & 1) == 0) {
            this.f6777i = Math.max(0.0f, this.f6777i);
        }
        if ((i13 & 2) == 0) {
            this.f6777i = Math.min(0.0f, this.f6777i);
        }
    }
}
