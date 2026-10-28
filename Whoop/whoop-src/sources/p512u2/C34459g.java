package p512u2;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.compose.p018ui.platform.AndroidComposeView;
import java.util.ArrayList;
import p181h2.C16617b;
import so.C32800q;

/* JADX INFO: renamed from: u2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C34459g {

    /* JADX INFO: renamed from: a */
    public long f144767a;

    /* JADX INFO: renamed from: b */
    public final SparseLongArray f144768b = new SparseLongArray();

    /* JADX INFO: renamed from: c */
    public final SparseBooleanArray f144769c = new SparseBooleanArray();

    /* JADX INFO: renamed from: d */
    public final ArrayList f144770d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public int f144771e = -1;

    /* JADX INFO: renamed from: f */
    public int f144772f = -1;

    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    /* JADX WARN: Code duplicated, block: B:72:0x0157  */
    /* JADX WARN: Code duplicated, block: B:74:0x015a  */
    /* JADX WARN: Code duplicated, block: B:76:0x015d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x015f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0161  */
    /* JADX WARN: Code duplicated, block: B:79:0x0164  */
    /* JADX WARN: Code duplicated, block: B:80:0x0167  */
    /* JADX WARN: Code duplicated, block: B:81:0x016a  */
    /* JADX WARN: Code duplicated, block: B:82:0x016d  */
    /* JADX WARN: Code duplicated, block: B:85:0x017f  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:96:0x01fa  */
    /* JADX INFO: renamed from: a */
    public final C32800q m108927a(MotionEvent motionEvent, AndroidComposeView androidComposeView) {
        long j7;
        int i13;
        int i14;
        long jValueAt;
        float f13;
        long j13;
        long jM3591v;
        long jM3578K;
        int toolType;
        int i15;
        int historySize;
        int i16;
        char c3;
        long jFloatToRawIntBits;
        float historicalX;
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.f144768b;
        SparseBooleanArray sparseBooleanArray = this.f144769c;
        int i17 = 3;
        if (actionMasked != 3) {
            int i18 = 4;
            if (actionMasked != 4) {
                if (motionEvent.getPointerCount() == 1) {
                    int toolType2 = motionEvent.getToolType(0);
                    int source = motionEvent.getSource();
                    if (toolType2 != this.f144771e || source != this.f144772f) {
                        this.f144771e = toolType2;
                        this.f144772f = source;
                        sparseBooleanArray.clear();
                        sparseLongArray.clear();
                    }
                }
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0 || actionMasked2 == 5) {
                    j7 = 1;
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    if (sparseLongArray.indexOfKey(pointerId) < 0) {
                        long j14 = this.f144767a;
                        this.f144767a = j14 + 1;
                        sparseLongArray.put(pointerId, j14);
                        if (motionEvent.getToolType(actionIndex) == 3) {
                            sparseBooleanArray.put(pointerId, true);
                        }
                    }
                } else if (actionMasked2 != 9) {
                    j7 = 1;
                } else {
                    int pointerId2 = motionEvent.getPointerId(0);
                    if (sparseLongArray.indexOfKey(pointerId2) < 0) {
                        long j15 = this.f144767a;
                        j7 = 1;
                        this.f144767a = j15 + 1;
                        sparseLongArray.put(pointerId2, j15);
                    } else {
                        j7 = 1;
                    }
                }
                boolean z4 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
                boolean z13 = actionMasked == 8;
                if (z4) {
                    i13 = 1;
                    sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
                } else {
                    i13 = 1;
                }
                int actionIndex2 = actionMasked != i13 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
                ArrayList arrayList = this.f144770d;
                arrayList.clear();
                int pointerCount = motionEvent.getPointerCount();
                int i19 = 0;
                while (i19 < pointerCount) {
                    boolean z14 = (z4 || i19 == actionIndex2 || (z13 && motionEvent.getButtonState() == 0)) ? false : true;
                    int pointerId3 = motionEvent.getPointerId(i19);
                    int iIndexOfKey = sparseLongArray.indexOfKey(pointerId3);
                    if (iIndexOfKey >= 0) {
                        jValueAt = sparseLongArray.valueAt(iIndexOfKey);
                    } else {
                        long j16 = this.f144767a;
                        this.f144767a = j16 + j7;
                        sparseLongArray.put(pointerId3, j16);
                        jValueAt = j16;
                    }
                    float pressure = motionEvent.getPressure(i19);
                    char c7 = ' ';
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getY(i19))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getX(i19))) << 32);
                    long jM47185a = C16617b.m47185a(0.0f, 0.0f, jFloatToRawIntBits2, i17);
                    if (i19 == 0) {
                        f13 = 0.0f;
                        jM3591v = (((long) Float.floatToRawIntBits(motionEvent.getRawY())) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getRawX())) << 32);
                        jM3578K = androidComposeView.m3578K(jM3591v);
                    } else {
                        f13 = 0.0f;
                        if (Build.VERSION.SDK_INT >= 29) {
                            jM3591v = AbstractC34461h.m108933a(motionEvent, i19);
                            jM3578K = androidComposeView.m3578K(jM3591v);
                        } else {
                            j13 = jFloatToRawIntBits2;
                            jM3591v = androidComposeView.m3591v(jFloatToRawIntBits2);
                        }
                        toolType = motionEvent.getToolType(i19);
                        if (toolType == 0) {
                            i15 = 0;
                        } else if (toolType != 1) {
                            i15 = 1;
                        } else if (toolType != 2) {
                            i15 = i17;
                        } else if (toolType != i17) {
                            i15 = 2;
                        } else if (toolType != i18) {
                            i15 = 0;
                        } else {
                            i15 = i18;
                        }
                        ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
                        historySize = motionEvent.getHistorySize();
                        i16 = 0;
                        while (i16 < historySize) {
                            historicalX = motionEvent.getHistoricalX(i19, i16);
                            float historicalY = motionEvent.getHistoricalY(i19, i16);
                            char c14 = c7;
                            if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 && (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) < 2139095040) {
                                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(historicalX)) << c14) | (((long) Float.floatToRawIntBits(historicalY)) & 4294967295L);
                                arrayList2.add(new C34451c(motionEvent.getHistoricalEventTime(i16), jFloatToRawIntBits3, jFloatToRawIntBits3));
                            }
                            i16++;
                            actionIndex2 = actionIndex2;
                            c7 = c14;
                        }
                        c3 = c7;
                        int i24 = actionIndex2;
                        if (motionEvent.getActionMasked() == 8) {
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c3) | (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + f13)) & 4294967295L);
                        } else {
                            jFloatToRawIntBits = 0;
                        }
                        arrayList.add(new C34474t(jValueAt, motionEvent.getEventTime(), jM3591v, j13, z14, pressure, i15, sparseBooleanArray.get(motionEvent.getPointerId(i19), false), arrayList2, jFloatToRawIntBits, jM47185a));
                        i19++;
                        actionIndex2 = i24;
                        z13 = z13;
                        z4 = z4;
                        i17 = 3;
                        i18 = 4;
                    }
                    j13 = jM3578K;
                    toolType = motionEvent.getToolType(i19);
                    if (toolType == 0) {
                        i15 = 0;
                    } else if (toolType != 1) {
                        i15 = 1;
                    } else if (toolType != 2) {
                        i15 = i17;
                    } else if (toolType != i17) {
                        i15 = 2;
                    } else if (toolType != i18) {
                        i15 = 0;
                    } else {
                        i15 = i18;
                    }
                    ArrayList arrayList3 = new ArrayList(motionEvent.getHistorySize());
                    historySize = motionEvent.getHistorySize();
                    i16 = 0;
                    while (i16 < historySize) {
                        historicalX = motionEvent.getHistoricalX(i19, i16);
                        float historicalY2 = motionEvent.getHistoricalY(i19, i16);
                        char c15 = c7;
                        if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040) {
                        }
                        i16++;
                        actionIndex2 = actionIndex2;
                        c7 = c15;
                    }
                    c3 = c7;
                    int i25 = actionIndex2;
                    if (motionEvent.getActionMasked() == 8) {
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c3) | (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + f13)) & 4294967295L);
                    } else {
                        jFloatToRawIntBits = 0;
                    }
                    arrayList.add(new C34474t(jValueAt, motionEvent.getEventTime(), jM3591v, j13, z14, pressure, i15, sparseBooleanArray.get(motionEvent.getPointerId(i19), false), arrayList3, jFloatToRawIntBits, jM47185a));
                    i19++;
                    actionIndex2 = i25;
                    z13 = z13;
                    z4 = z4;
                    i17 = 3;
                    i18 = 4;
                }
                int actionMasked3 = motionEvent.getActionMasked();
                if (actionMasked3 == 1 || actionMasked3 == 6) {
                    int pointerId4 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    i14 = 0;
                    if (!sparseBooleanArray.get(pointerId4, false)) {
                        sparseLongArray.delete(pointerId4);
                        sparseBooleanArray.delete(pointerId4);
                    }
                } else {
                    i14 = 0;
                }
                if (sparseLongArray.size() > motionEvent.getPointerCount()) {
                    for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                        int iKeyAt = sparseLongArray.keyAt(size);
                        int pointerCount2 = motionEvent.getPointerCount();
                        int i26 = i14;
                        while (true) {
                            if (i26 >= pointerCount2) {
                                sparseLongArray.removeAt(size);
                                sparseBooleanArray.delete(iKeyAt);
                                break;
                            }
                            if (motionEvent.getPointerId(i26) == iKeyAt) {
                                break;
                            }
                            i26++;
                        }
                    }
                }
                motionEvent.getEventTime();
                return new C32800q(arrayList, motionEvent);
            }
        }
        sparseLongArray.clear();
        sparseBooleanArray.clear();
        return null;
    }
}
