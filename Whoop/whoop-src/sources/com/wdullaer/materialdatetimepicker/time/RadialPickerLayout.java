package com.wdullaer.materialdatetimepicker.time;

import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Handler;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import com.whoop.android.R;
import d50.C11707a;
import d50.C11708b;
import d50.C11710d;
import d50.C11711e;
import d50.C11712f;
import d50.InterfaceC11709c;
import java.util.Calendar;
import p479s4.AbstractC32122c;

/* JADX INFO: loaded from: classes6.dex */
public class RadialPickerLayout extends FrameLayout implements View.OnTouchListener {

    /* JADX INFO: renamed from: E */
    public final C11710d f22599E;

    /* JADX INFO: renamed from: F */
    public final View f22600F;

    /* JADX INFO: renamed from: G */
    public final int[] f22601G;

    /* JADX INFO: renamed from: H */
    public final boolean f22602H;

    /* JADX INFO: renamed from: I */
    public int f22603I;

    /* JADX INFO: renamed from: J */
    public boolean f22604J;

    /* JADX INFO: renamed from: K */
    public float f22605K;

    /* JADX INFO: renamed from: L */
    public float f22606L;

    /* JADX INFO: renamed from: M */
    public final Handler f22607M;

    /* JADX INFO: renamed from: w */
    public final int f22608w;

    /* JADX INFO: renamed from: x */
    public final C11707a f22609x;

    /* JADX INFO: renamed from: y */
    public final C11710d f22610y;

    /* JADX INFO: renamed from: z */
    public final C11710d f22611z;

    public RadialPickerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22603I = -1;
        this.f22607M = new Handler();
        setOnTouchListener(this);
        this.f22608w = ViewConfiguration.get(context).getScaledTouchSlop();
        ViewConfiguration.getTapTimeout();
        int i13 = 0;
        this.f22604J = false;
        View c11708b = new C11708b(context, 0);
        new Paint();
        addView(c11708b);
        C11707a c11707a = new C11707a(context);
        new Paint();
        this.f22609x = c11707a;
        addView(c11707a);
        C11710d c11710d = new C11710d(context);
        this.f22610y = c11710d;
        addView(c11710d);
        C11710d c11710d2 = new C11710d(context);
        this.f22611z = c11710d2;
        addView(c11710d2);
        C11710d c11710d3 = new C11710d(context);
        this.f22599E = c11710d3;
        addView(c11710d3);
        addView(new C11711e(context));
        addView(new C11711e(context));
        addView(new C11711e(context));
        this.f22601G = new int[361];
        int i14 = 1;
        int i15 = 8;
        int i16 = 0;
        while (true) {
            int i17 = 4;
            if (i13 >= 361) {
                this.f22602H = true;
                View view = new View(context);
                this.f22600F = view;
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                view.setBackgroundColor(AbstractC32122c.getColor(context, R.color.mdtp_transparent_black));
                view.setVisibility(4);
                addView(view);
                return;
            }
            this.f22601G[i13] = i16;
            if (i14 == i15) {
                i16 += 6;
                if (i16 == 360) {
                    i17 = 7;
                } else if (i16 % 30 == 0) {
                    i17 = 14;
                }
                i14 = 1;
                i15 = i17;
            } else {
                i14++;
            }
            i13++;
        }
    }

    private int getCurrentlyShowingValue() {
        int currentItemShowing = getCurrentItemShowing();
        if (currentItemShowing == 0 || currentItemShowing == 1 || currentItemShowing == 2) {
            throw null;
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public final void m16931a() {
        int currentItemShowing = getCurrentItemShowing();
        if (currentItemShowing == 0) {
            this.f22610y.getClass();
        } else if (currentItemShowing == 1) {
            this.f22611z.getClass();
        } else {
            if (currentItemShowing != 2) {
                return;
            }
            this.f22599E.getClass();
        }
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        accessibilityEvent.getText().clear();
        Calendar calendar = Calendar.getInstance();
        calendar.set(10, getHours());
        calendar.set(12, getMinutes());
        calendar.set(13, getSeconds());
        accessibilityEvent.getText().add(DateUtils.formatDateTime(getContext(), calendar.getTimeInMillis(), 1));
        return true;
    }

    public int getCurrentItemShowing() {
        return 0;
    }

    public int getHours() {
        throw null;
    }

    public int getIsCurrentlyAmOrPm() {
        throw null;
    }

    public int getMinutes() {
        throw null;
    }

    public int getSeconds() {
        throw null;
    }

    public C11712f getTime() {
        return null;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i13;
        float x3 = motionEvent.getX();
        float y13 = motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z4 = this.f22602H;
        if (action == 0) {
            if (!z4) {
                return true;
            }
            this.f22605K = x3;
            this.f22606L = y13;
            this.f22604J = false;
            throw null;
        }
        Handler handler = this.f22607M;
        C11707a c11707a = this.f22609x;
        if (action == 1) {
            if (!z4) {
                Log.d("RadialPickerLayout", "Input was disabled, but received ACTION_UP.");
                throw null;
            }
            handler.removeCallbacksAndMessages(null);
            int i14 = this.f22603I;
            if (i14 != 0 && i14 != 1) {
                m16931a();
                this.f22604J = false;
                return true;
            }
            c11707a.getClass();
            c11707a.setAmOrPmPressed(-1);
            c11707a.invalidate();
            if (-1 == this.f22603I) {
                c11707a.setAmOrPm(-1);
                if (getIsCurrentlyAmOrPm() != -1) {
                    throw null;
                }
            }
            this.f22603I = -1;
            return false;
        }
        if (action == 2) {
            if (!z4) {
                Log.e("RadialPickerLayout", "Input was disabled, but received ACTION_MOVE.");
                return true;
            }
            float fAbs = Math.abs(y13 - this.f22606L);
            float fAbs2 = Math.abs(x3 - this.f22605K);
            if (this.f22604J) {
                i13 = this.f22603I;
                if (i13 == 0) {
                }
                handler.removeCallbacksAndMessages(null);
                c11707a.getClass();
                if (-1 != this.f22603I) {
                    c11707a.setAmOrPmPressed(-1);
                    c11707a.invalidate();
                    this.f22603I = -1;
                }
            } else {
                float f13 = this.f22608w;
                if (fAbs2 > f13 || fAbs > f13) {
                    i13 = this.f22603I;
                    if (i13 == 0 && i13 != 1) {
                        this.f22604J = true;
                        handler.removeCallbacksAndMessages(null);
                        m16931a();
                        return true;
                    }
                    handler.removeCallbacksAndMessages(null);
                    c11707a.getClass();
                    if (-1 != this.f22603I) {
                        c11707a.setAmOrPmPressed(-1);
                        c11707a.invalidate();
                        this.f22603I = -1;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x004a  */
    @Override // android.view.View
    public final boolean performAccessibilityAction(int i13, Bundle bundle) {
        byte b;
        if (super.performAccessibilityAction(i13, bundle)) {
            return true;
        }
        int i14 = 0;
        if (i13 == 4096) {
            b = 1;
        } else {
            b = i13 == 8192 ? (byte) -1 : (byte) 0;
        }
        if (b == 0) {
            return false;
        }
        int currentlyShowingValue = getCurrentlyShowingValue();
        int currentItemShowing = getCurrentItemShowing();
        if (currentItemShowing == 0) {
            currentlyShowingValue %= 12;
            i14 = 30;
        } else if (currentItemShowing == 1 || currentItemShowing == 2) {
            i14 = 6;
        }
        int i15 = currentlyShowingValue * i14;
        int i16 = (i15 / 30) * 30;
        int i17 = i16 + 30;
        if (b == 1) {
            i16 = i17;
        } else if (b == -1) {
            if (i15 == i16) {
                i16 -= 30;
            }
        } else if (i15 - i16 >= i17 - i15) {
            i16 = i17;
        }
        int i18 = i16 / i14;
        if (currentItemShowing == 0 || currentItemShowing == 1 || currentItemShowing == 2 || currentItemShowing == 0 || currentItemShowing != 1) {
            throw null;
        }
        throw null;
    }

    public void setAmOrPm(int i13) {
        C11707a c11707a = this.f22609x;
        c11707a.setAmOrPm(i13);
        c11707a.invalidate();
        throw null;
    }

    public void setOnValueSelectedListener(InterfaceC11709c interfaceC11709c) {
    }

    public void setTime(C11712f c11712f) {
        throw null;
    }
}
