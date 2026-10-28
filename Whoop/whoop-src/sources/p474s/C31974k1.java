package p474s;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.whoop.android.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p036bq.RunnableC3543b;
import p296l5.ViewOnTouchListenerC23340d;

/* JADX INFO: renamed from: s.k1 */
/* JADX INFO: loaded from: classes5.dex */
public class C31974k1 extends ListView {

    /* JADX INFO: renamed from: E */
    public int f132731E;

    /* JADX INFO: renamed from: F */
    public int f132732F;

    /* JADX INFO: renamed from: G */
    public C31966i1 f132733G;

    /* JADX INFO: renamed from: H */
    public boolean f132734H;

    /* JADX INFO: renamed from: I */
    public final boolean f132735I;

    /* JADX INFO: renamed from: J */
    public boolean f132736J;

    /* JADX INFO: renamed from: K */
    public ViewOnTouchListenerC23340d f132737K;

    /* JADX INFO: renamed from: L */
    public RunnableC3543b f132738L;

    /* JADX INFO: renamed from: w */
    public final Rect f132739w;

    /* JADX INFO: renamed from: x */
    public int f132740x;

    /* JADX INFO: renamed from: y */
    public int f132741y;

    /* JADX INFO: renamed from: z */
    public int f132742z;

    public C31974k1(Context context, boolean z4) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f132739w = new Rect();
        this.f132740x = 0;
        this.f132741y = 0;
        this.f132742z = 0;
        this.f132731E = 0;
        this.f132735I = z4;
        setCacheColorHint(0);
    }

    /* JADX INFO: renamed from: a */
    public final int m99464a(int i13, int i14) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i15 = 0;
        View view = null;
        for (int i16 = 0; i16 < count; i16++) {
            int itemViewType = adapter.getItemViewType(i16);
            if (itemViewType != i15) {
                view = null;
                i15 = itemViewType;
            }
            view = adapter.getView(i16, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i17 = layoutParams.height;
            view.measure(i13, i17 > 0 ? View.MeasureSpec.makeMeasureSpec(i17, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i16 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i14) {
                return i14;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x014c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0162  */
    /* JADX WARN: Code duplicated, block: B:86:0x0167  */
    /* JADX WARN: Code duplicated, block: B:88:0x016b  */
    /* JADX WARN: Code duplicated, block: B:90:0x017d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0181  */
    /* JADX WARN: Code duplicated, block: B:94:0x0185  */
    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    /* JADX INFO: renamed from: b */
    public final boolean m99465b(MotionEvent motionEvent, int i13) {
        boolean z4;
        boolean zM99452a;
        View childAt;
        View childAt2;
        ViewOnTouchListenerC23340d viewOnTouchListenerC23340d;
        int actionMasked = motionEvent.getActionMasked();
        boolean z13 = false;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z4 = true;
            } else if (actionMasked != 3) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4 || z13) {
                this.f132736J = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f132732F - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            if (z4) {
                if (this.f132737K == null) {
                    this.f132737K = new ViewOnTouchListenerC23340d(this);
                }
                ViewOnTouchListenerC23340d viewOnTouchListenerC23340d2 = this.f132737K;
                boolean z14 = viewOnTouchListenerC23340d2.f92548P;
                viewOnTouchListenerC23340d2.f92548P = true;
                viewOnTouchListenerC23340d2.onTouch(this, motionEvent);
            } else {
                viewOnTouchListenerC23340d = this.f132737K;
                if (viewOnTouchListenerC23340d != null) {
                    if (viewOnTouchListenerC23340d.f92548P) {
                        viewOnTouchListenerC23340d.m67576d();
                    }
                    viewOnTouchListenerC23340d.f92548P = false;
                }
            }
            return z4;
        }
        z4 = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i13);
        if (iFindPointerIndex < 0) {
            z4 = false;
        } else {
            int x3 = (int) motionEvent.getX(iFindPointerIndex);
            int y13 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x3, y13);
            if (iPointToPosition == -1) {
                z13 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f13 = x3;
                float f14 = y13;
                this.f132736J = true;
                int i14 = Build.VERSION.SDK_INT;
                AbstractC31954f1.m99447a(this, f13, f14);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i15 = this.f132732F;
                if (i15 != -1 && (childAt = getChildAt(i15 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f132732F = iPointToPosition;
                AbstractC31954f1.m99447a(childAt3, f13 - childAt3.getLeft(), f14 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z15 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z15) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f132739w;
                rect.set(left, top, right, bottom);
                rect.left -= this.f132740x;
                rect.top -= this.f132741y;
                rect.right += this.f132742z;
                rect.bottom += this.f132731E;
                if (i14 >= 33) {
                    zM99452a = AbstractC31962h1.m99452a(this);
                } else {
                    Field field = AbstractC31970j1.f132729a;
                    if (field != null) {
                        try {
                            zM99452a = field.getBoolean(this);
                        } catch (IllegalAccessException e5) {
                            e5.printStackTrace();
                            zM99452a = false;
                        }
                    } else {
                        zM99452a = false;
                    }
                }
                if (childAt3.isEnabled() != zM99452a) {
                    boolean z16 = !zM99452a;
                    if (Build.VERSION.SDK_INT >= 33) {
                        AbstractC31962h1.m99453b(this, z16);
                    } else {
                        Field field2 = AbstractC31970j1.f132729a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z16));
                            } catch (IllegalAccessException e13) {
                                e13.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z15) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f13, f14);
                }
                C31966i1 c31966i1 = this.f132733G;
                if (c31966i1 != null) {
                    c31966i1.f132714x = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z4 = true;
                z13 = false;
            }
        }
        if (z4) {
            this.f132736J = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f132732F - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f132736J = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f132732F - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z4) {
            if (this.f132737K == null) {
                this.f132737K = new ViewOnTouchListenerC23340d(this);
            }
            ViewOnTouchListenerC23340d viewOnTouchListenerC23340d3 = this.f132737K;
            boolean z17 = viewOnTouchListenerC23340d3.f92548P;
            viewOnTouchListenerC23340d3.f92548P = true;
            viewOnTouchListenerC23340d3.onTouch(this, motionEvent);
        } else {
            viewOnTouchListenerC23340d = this.f132737K;
            if (viewOnTouchListenerC23340d != null) {
                if (viewOnTouchListenerC23340d.f92548P) {
                    viewOnTouchListenerC23340d.m67576d();
                }
                viewOnTouchListenerC23340d.f92548P = false;
            }
        }
        return z4;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f132739w;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f132738L != null) {
            return;
        }
        super.drawableStateChanged();
        C31966i1 c31966i1 = this.f132733G;
        if (c31966i1 != null) {
            c31966i1.f132714x = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f132736J && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f132735I || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f132735I || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f132735I || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f132735I && this.f132734H) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f132738L = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i13 = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f132738L == null) {
            RunnableC3543b runnableC3543b = new RunnableC3543b(this, 21);
            this.f132738L = runnableC3543b;
            post(runnableC3543b);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i13 < 30 || !AbstractC31958g1.f132681d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        AbstractC31958g1.f132678a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        AbstractC31958g1.f132679b.invoke(this, Integer.valueOf(iPointToPosition));
                        AbstractC31958g1.f132680c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e5) {
                        e5.printStackTrace();
                    } catch (InvocationTargetException e13) {
                        e13.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f132736J && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f132732F = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC3543b runnableC3543b = this.f132738L;
        if (runnableC3543b != null) {
            C31974k1 c31974k1 = (C31974k1) runnableC3543b.f14263x;
            c31974k1.f132738L = null;
            c31974k1.removeCallbacks(runnableC3543b);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z4) {
        this.f132734H = z4;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C31966i1 c31966i1 = null;
        if (drawable != null) {
            C31966i1 c31966i2 = new C31966i1();
            Drawable drawable2 = c31966i2.f132713w;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c31966i2.f132713w = drawable;
            drawable.setCallback(c31966i2);
            c31966i2.f132714x = true;
            c31966i1 = c31966i2;
        }
        this.f132733G = c31966i1;
        super.setSelector(c31966i1);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f132740x = rect.left;
        this.f132741y = rect.top;
        this.f132742z = rect.right;
        this.f132731E = rect.bottom;
    }
}
