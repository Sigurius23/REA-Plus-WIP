package androidx.databinding;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.EnumC1635w;
import androidx.lifecycle.InterfaceC1585g0;
import com.whoop.android.R;
import ec.InterfaceC13008a;
import io.sentry.hints.C20363j;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Map;
import p000.AbstractC30802r;
import p002a0.C0062y;
import p437qt.C30582e;

/* JADX INFO: renamed from: androidx.databinding.a0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1168a0 extends AbstractC1167a implements InterfaceC13008a {
    private static final int BINDING_NUMBER_START = 8;
    public static final String BINDING_TAG_PREFIX = "binding_";
    private static final InterfaceC1173d CREATE_LIST_LISTENER;
    private static final InterfaceC1173d CREATE_LIVE_DATA_LISTENER;
    private static final InterfaceC1173d CREATE_MAP_LISTENER;
    private static final InterfaceC1173d CREATE_PROPERTY_LISTENER;
    private static final int HALTED = 2;
    private static final int REBIND = 1;
    private static final int REBOUND = 3;
    protected final InterfaceC1176f mBindingComponent;
    private Choreographer mChoreographer;
    private AbstractC1168a0 mContainingBinding;
    private final Choreographer.FrameCallback mFrameCallback;
    private boolean mInLiveDataRegisterObserver;
    protected boolean mInStateFlowRegisterObserver;
    private boolean mIsExecutingPendingBindings;
    private InterfaceC1585g0 mLifecycleOwner;
    private C1174d0[] mLocalFieldObservers;
    private C1193w mOnStartListener;
    private boolean mPendingRebind;
    private C1171c mRebindCallbacks;
    private boolean mRebindHalted;
    private final Runnable mRebindRunnable;
    private final View mRoot;
    private Handler mUIThreadHandler;
    static int SDK_INT = Build.VERSION.SDK_INT;
    private static final boolean USE_CHOREOGRAPHER = true;
    private static final AbstractC1169b REBIND_NOTIFIER = new C1187q();
    private static final ReferenceQueue<AbstractC1168a0> sReferenceQueue = new ReferenceQueue<>();
    private static final View.OnAttachStateChangeListener ROOT_REATTACHED_LISTENER = new ViewOnAttachStateChangeListenerC1188r();

    static {
        int i13 = 4;
        CREATE_PROPERTY_LISTENER = new C20363j(i13);
        CREATE_LIST_LISTENER = new C30582e(i13);
        int i14 = 5;
        CREATE_MAP_LISTENER = new C20363j(i14);
        CREATE_LIVE_DATA_LISTENER = new C30582e(i14);
    }

    public AbstractC1168a0(View view, int i13, Object obj) {
        if (obj != null) {
            throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
        }
        this.mRebindRunnable = new RunnableC1189s(this, 0);
        this.mPendingRebind = false;
        this.mRebindHalted = false;
        this.mLocalFieldObservers = new C1174d0[i13];
        this.mRoot = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        if (USE_CHOREOGRAPHER) {
            this.mChoreographer = Choreographer.getInstance();
            this.mFrameCallback = new ChoreographerFrameCallbackC1190t(this);
        } else {
            this.mFrameCallback = null;
            this.mUIThreadHandler = new Handler(Looper.myLooper());
        }
    }

    public static void access$300() {
        while (true) {
            Reference<? extends AbstractC1168a0> referencePoll = sReferenceQueue.poll();
            if (referencePoll == null) {
                return;
            }
            if (referencePoll instanceof C1174d0) {
                ((C1174d0) referencePoll).m3729a();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01db  */
    /* JADX WARN: Code duplicated, block: B:43:0x008f  */
    /* JADX INFO: renamed from: b */
    public static void m3717b(View view, Object[] objArr, C1191u c1191u, SparseIntArray sparseIntArray, boolean z4) {
        int iCharAt;
        boolean z13;
        int i13;
        int i14;
        int i15;
        String str;
        int id4;
        int i16;
        int i17;
        int length;
        if (getBinding(view) != null) {
            return;
        }
        Object tag = view.getTag();
        String str2 = tag instanceof String ? (String) tag : null;
        String str3 = "layout";
        int i18 = 0;
        int i19 = 1;
        if (z4 && str2 != null && str2.startsWith("layout")) {
            int iLastIndexOf = str2.lastIndexOf(95);
            if (iLastIndexOf > 0 && (length = str2.length()) != (i17 = iLastIndexOf + 1)) {
                int i24 = i17;
                while (true) {
                    if (i24 >= length) {
                        int length2 = str2.length();
                        iCharAt = 0;
                        while (i17 < length2) {
                            iCharAt = (iCharAt * 10) + (str2.charAt(i17) - '0');
                            i17++;
                        }
                        if (objArr[iCharAt] == null) {
                            objArr[iCharAt] = view;
                        }
                        if (c1191u == null) {
                            iCharAt = -1;
                        }
                        z13 = true;
                    } else if (Character.isDigit(str2.charAt(i24))) {
                        i24++;
                    }
                }
            }
            iCharAt = -1;
            z13 = false;
        } else if (str2 == null || !str2.startsWith(BINDING_TAG_PREFIX)) {
            iCharAt = -1;
            z13 = false;
        } else {
            int length3 = str2.length();
            iCharAt = 0;
            for (int i25 = BINDING_NUMBER_START; i25 < length3; i25++) {
                iCharAt = (iCharAt * 10) + (str2.charAt(i25) - '0');
            }
            if (objArr[iCharAt] == null) {
                objArr[iCharAt] = view;
            }
            if (c1191u == null) {
                iCharAt = -1;
            }
            z13 = true;
        }
        if (!z13 && (id4 = view.getId()) > 0 && sparseIntArray != null && (i16 = sparseIntArray.get(id4, -1)) >= 0 && objArr[i16] == null) {
            objArr[i16] = view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            int i26 = 0;
            int i27 = 0;
            while (i26 < childCount) {
                View childAt = viewGroup.getChildAt(i26);
                if (iCharAt < 0 || !(childAt.getTag() instanceof String)) {
                    i13 = i19;
                    i14 = 0;
                } else {
                    String str4 = (String) childAt.getTag();
                    if (str4.endsWith("_0") && str4.startsWith(str3) && str4.indexOf(47) > 0) {
                        i13 = i19;
                        CharSequence charSequenceSubSequence = str4.subSequence(str4.indexOf(47) + i19, str4.length() - 2);
                        String[] strArr = c1191u.f5339a[iCharAt];
                        int length4 = strArr.length;
                        int i28 = i27;
                        while (true) {
                            if (i28 >= length4) {
                                i28 = -1;
                                break;
                            } else if (TextUtils.equals(charSequenceSubSequence, strArr[i28])) {
                                break;
                            } else {
                                i28++;
                            }
                        }
                        if (i28 >= 0) {
                            i27 = i28 + 1;
                            int i29 = c1191u.f5340b[iCharAt][i28];
                            int i34 = c1191u.f5341c[iCharAt][i28];
                            String str5 = (String) viewGroup.getChildAt(i26).getTag();
                            String strSubstring = str5.substring(i18, str5.length() - 1);
                            int length5 = strSubstring.length();
                            int childCount2 = viewGroup.getChildCount();
                            childCount = childCount;
                            int i35 = i26;
                            int i36 = i26 + 1;
                            while (true) {
                                if (i36 >= childCount2) {
                                    str3 = str3;
                                    break;
                                }
                                View childAt2 = viewGroup.getChildAt(i36);
                                int i37 = i36;
                                String str6 = childAt2.getTag() instanceof String ? (String) childAt2.getTag() : null;
                                if (str6 != null && str6.startsWith(strSubstring)) {
                                    str3 = str3;
                                    str = str5;
                                    if (str6.length() == str.length() && str6.charAt(str6.length() - 1) == '0') {
                                        break;
                                    }
                                    int length6 = str6.length();
                                    if (length6 != length5) {
                                        int i38 = length5;
                                        while (true) {
                                            if (i38 >= length6) {
                                                i35 = i37;
                                                break;
                                            } else if (!Character.isDigit(str6.charAt(i38))) {
                                                break;
                                            } else {
                                                i38++;
                                            }
                                        }
                                    }
                                } else {
                                    str3 = str3;
                                    str = str5;
                                }
                                i36 = i37 + 1;
                                str3 = str3;
                                str5 = str;
                            }
                            if (i35 == i26) {
                                objArr[i29] = AbstractC1177g.f5333a.getDataBinder((InterfaceC1176f) null, childAt, i34);
                                i14 = i13;
                            } else {
                                int i39 = i35 - i26;
                                int i44 = i39 + 1;
                                View[] viewArr = new View[i44];
                                for (int i45 = 0; i45 < i44; i45++) {
                                    viewArr[i45] = viewGroup.getChildAt(i26 + i45);
                                }
                                objArr[i29] = AbstractC1177g.f5333a.getDataBinder((InterfaceC1176f) null, viewArr, i34);
                                i26 += i39;
                                i14 = i13;
                            }
                        }
                    } else {
                        i13 = i19;
                    }
                    i14 = 0;
                }
                if (i14 == 0) {
                    i15 = 0;
                    m3717b(childAt, objArr, c1191u, sparseIntArray, false);
                } else {
                    i15 = 0;
                }
                i26++;
                i18 = i15;
                i19 = i13;
                str3 = str3;
                childCount = childCount;
            }
        }
    }

    public static AbstractC1168a0 bind(Object obj, View view, int i13) {
        if (obj == null) {
            return AbstractC1177g.f5333a.getDataBinder((InterfaceC1176f) null, view, i13);
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    public static void executeBindingsOn(AbstractC1168a0 abstractC1168a0) throws Throwable {
        abstractC1168a0.m3718a();
    }

    public static AbstractC1168a0 getBinding(View view) {
        if (view != null) {
            return (AbstractC1168a0) view.getTag(R.id.dataBinding);
        }
        return null;
    }

    public static int getBuildSdkInt() {
        return SDK_INT;
    }

    public static int getColorFromResource(View view, int i13) {
        return view.getContext().getColor(i13);
    }

    public static ColorStateList getColorStateListFromResource(View view, int i13) {
        return view.getContext().getColorStateList(i13);
    }

    public static Drawable getDrawableFromResource(View view, int i13) {
        return view.getContext().getDrawable(i13);
    }

    public static <K, T> T getFrom(Map<K, T> map, K k5) {
        if (map == null) {
            return null;
        }
        return map.get(k5);
    }

    public static <T> T getFromArray(T[] tArr, int i13) {
        if (tArr == null || i13 < 0 || i13 >= tArr.length) {
            return null;
        }
        return tArr[i13];
    }

    public static <T> T getFromList(List<T> list, int i13) {
        if (list == null || i13 < 0 || i13 >= list.size()) {
            return null;
        }
        return list.get(i13);
    }

    public static <T extends AbstractC1168a0> T inflateInternal(LayoutInflater layoutInflater, int i13, ViewGroup viewGroup, boolean z4, Object obj) {
        if (obj == null) {
            return (T) AbstractC1177g.m3732c(layoutInflater, i13, viewGroup, z4);
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    public static Object[] mapBindings(InterfaceC1176f interfaceC1176f, View view, int i13, C1191u c1191u, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i13];
        m3717b(view, objArr, c1191u, sparseIntArray, true);
        return objArr;
    }

    public static boolean parse(String str, boolean z4) {
        return str == null ? z4 : Boolean.parseBoolean(str);
    }

    public static int safeUnbox(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static void setBindingInverseListener(AbstractC1168a0 abstractC1168a0, InterfaceC1178h interfaceC1178h, AbstractC1194x abstractC1194x) {
        if (interfaceC1178h == abstractC1194x || interfaceC1178h == null) {
            return;
        }
        AbstractC30802r.m94770s(interfaceC1178h);
        abstractC1168a0.removeOnPropertyChangedCallback(null);
    }

    public static <T> void setTo(T[] tArr, int i13, T t14) {
        if (tArr == null || i13 < 0 || i13 >= tArr.length) {
            return;
        }
        tArr[i13] = t14;
    }

    /* JADX INFO: renamed from: a */
    public final void m3718a() throws Throwable {
        if (this.mIsExecutingPendingBindings) {
            requestRebind();
            return;
        }
        if (hasPendingBindings()) {
            this.mIsExecutingPendingBindings = true;
            this.mRebindHalted = false;
            C1171c c1171c = this.mRebindCallbacks;
            if (c1171c != null) {
                c1171c.m3722c(this, 1);
                if (this.mRebindHalted) {
                    this.mRebindCallbacks.m3722c(this, 2);
                }
            }
            if (!this.mRebindHalted) {
                executeBindings();
                C1171c c1171c2 = this.mRebindCallbacks;
                if (c1171c2 != null) {
                    c1171c2.m3722c(this, 3);
                }
            }
            this.mIsExecutingPendingBindings = false;
        }
    }

    public void addOnRebindCallback(AbstractC1184n abstractC1184n) {
        if (this.mRebindCallbacks == null) {
            this.mRebindCallbacks = new C1171c(REBIND_NOTIFIER);
        }
        this.mRebindCallbacks.m3720a(abstractC1184n);
    }

    public void ensureBindingComponentIsNotNull(Class<?> cls) {
        throw new IllegalStateException("Required DataBindingComponent is null in class " + getClass().getSimpleName() + ". A BindingAdapter in " + cls.getCanonicalName() + " is not static and requires an object to use, retrieved from the DataBindingComponent. If you don't use an inflation method taking a DataBindingComponent, use DataBindingUtil.setDefaultComponent or make all BindingAdapter methods static.");
    }

    public abstract void executeBindings();

    public void executePendingBindings() throws Throwable {
        AbstractC1168a0 abstractC1168a0 = this.mContainingBinding;
        if (abstractC1168a0 == null) {
            m3718a();
        } else {
            abstractC1168a0.executePendingBindings();
        }
    }

    public void forceExecuteBindings() {
        executeBindings();
    }

    public InterfaceC1585g0 getLifecycleOwner() {
        return this.mLifecycleOwner;
    }

    public Object getObservedField(int i13) {
        C1174d0 c1174d0 = this.mLocalFieldObservers[i13];
        if (c1174d0 == null) {
            return null;
        }
        return c1174d0.f5332c;
    }

    @Override // ec.InterfaceC13008a
    public View getRoot() {
        return this.mRoot;
    }

    public void handleFieldChange(int i13, Object obj, int i14) {
        if (this.mInLiveDataRegisterObserver || this.mInStateFlowRegisterObserver || !onFieldChange(i13, obj, i14)) {
            return;
        }
        requestRebind();
    }

    public abstract boolean hasPendingBindings();

    public abstract void invalidateAll();

    public abstract boolean onFieldChange(int i13, Object obj, int i14);

    public void registerTo(int i13, Object obj, InterfaceC1173d interfaceC1173d) {
        if (obj == null) {
            return;
        }
        C1174d0 c1174d0Mo3728m = this.mLocalFieldObservers[i13];
        if (c1174d0Mo3728m == null) {
            c1174d0Mo3728m = interfaceC1173d.mo3728m(this, i13, sReferenceQueue);
            this.mLocalFieldObservers[i13] = c1174d0Mo3728m;
            InterfaceC1585g0 interfaceC1585g0 = this.mLifecycleOwner;
            if (interfaceC1585g0 != null) {
                c1174d0Mo3728m.f5330a.mo3734a(interfaceC1585g0);
            }
        }
        c1174d0Mo3728m.m3729a();
        c1174d0Mo3728m.f5332c = obj;
        c1174d0Mo3728m.f5330a.mo3736c(obj);
    }

    public void removeOnRebindCallback(AbstractC1184n abstractC1184n) {
        C1171c c1171c = this.mRebindCallbacks;
        if (c1171c != null) {
            c1171c.m3725f(abstractC1184n);
        }
    }

    public void requestRebind() {
        AbstractC1168a0 abstractC1168a0 = this.mContainingBinding;
        if (abstractC1168a0 != null) {
            abstractC1168a0.requestRebind();
            return;
        }
        InterfaceC1585g0 interfaceC1585g0 = this.mLifecycleOwner;
        if (interfaceC1585g0 == null || interfaceC1585g0.getLifecycle().getCurrentState().compareTo(EnumC1635w.f6328z) >= 0) {
            synchronized (this) {
                try {
                    if (this.mPendingRebind) {
                        return;
                    }
                    this.mPendingRebind = true;
                    if (USE_CHOREOGRAPHER) {
                        this.mChoreographer.postFrameCallback(this.mFrameCallback);
                    } else {
                        this.mUIThreadHandler.post(this.mRebindRunnable);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public void setContainedBinding(AbstractC1168a0 abstractC1168a0) {
        if (abstractC1168a0 != null) {
            abstractC1168a0.mContainingBinding = this;
        }
    }

    public void setLifecycleOwner(InterfaceC1585g0 interfaceC1585g0) {
        if (interfaceC1585g0 instanceof AbstractComponentCallbacksC1320m0) {
            Log.w("DataBinding", "Setting the fragment as the LifecycleOwner might cause memory leaks because views lives shorter than the Fragment. Consider using Fragment's view lifecycle");
        }
        InterfaceC1585g0 interfaceC1585g1 = this.mLifecycleOwner;
        if (interfaceC1585g1 == interfaceC1585g0) {
            return;
        }
        if (interfaceC1585g1 != null) {
            interfaceC1585g1.getLifecycle().mo4988d(this.mOnStartListener);
        }
        this.mLifecycleOwner = interfaceC1585g0;
        if (interfaceC1585g0 != null) {
            if (this.mOnStartListener == null) {
                this.mOnStartListener = new C1193w(this);
            }
            interfaceC1585g0.getLifecycle().mo4986a(this.mOnStartListener);
        }
        for (C1174d0 c1174d0 : this.mLocalFieldObservers) {
            if (c1174d0 != null) {
                c1174d0.f5330a.mo3734a(interfaceC1585g0);
            }
        }
    }

    public void setRootTag(View view) {
        view.setTag(R.id.dataBinding, this);
    }

    public abstract boolean setVariable(int i13, Object obj);

    public void unbind() {
        for (C1174d0 c1174d0 : this.mLocalFieldObservers) {
            if (c1174d0 != null) {
                c1174d0.m3729a();
            }
        }
    }

    public boolean unregisterFrom(int i13) {
        C1174d0 c1174d0 = this.mLocalFieldObservers[i13];
        if (c1174d0 != null) {
            return c1174d0.m3729a();
        }
        return false;
    }

    public boolean updateLiveDataRegistration(int i13, AbstractC1615p0 abstractC1615p0) {
        this.mInLiveDataRegisterObserver = true;
        try {
            return updateRegistration(i13, abstractC1615p0, CREATE_LIVE_DATA_LISTENER);
        } finally {
            this.mInLiveDataRegisterObserver = false;
        }
    }

    public boolean updateRegistration(int i13, Object obj, InterfaceC1173d interfaceC1173d) {
        if (obj == null) {
            return unregisterFrom(i13);
        }
        C1174d0 c1174d0 = this.mLocalFieldObservers[i13];
        if (c1174d0 == null) {
            registerTo(i13, obj, interfaceC1173d);
            return true;
        }
        if (c1174d0.f5332c == obj) {
            return false;
        }
        unregisterFrom(i13);
        registerTo(i13, obj, interfaceC1173d);
        return true;
    }

    public static byte parse(String str, byte b) {
        try {
            return Byte.parseByte(str);
        } catch (NumberFormatException unused) {
            return b;
        }
    }

    public static long safeUnbox(Long l7) {
        if (l7 == null) {
            return 0L;
        }
        return l7.longValue();
    }

    public void setRootTag(View[] viewArr) {
        for (View view : viewArr) {
            view.setTag(R.id.dataBinding, this);
        }
    }

    public static boolean getFromArray(boolean[] zArr, int i13) {
        if (zArr == null || i13 < 0 || i13 >= zArr.length) {
            return false;
        }
        return zArr[i13];
    }

    public static <T> T getFromList(SparseArray<T> sparseArray, int i13) {
        if (sparseArray == null || i13 < 0) {
            return null;
        }
        return sparseArray.get(i13);
    }

    public static Object[] mapBindings(InterfaceC1176f interfaceC1176f, View[] viewArr, int i13, C1191u c1191u, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i13];
        for (View view : viewArr) {
            m3717b(view, objArr, c1191u, sparseIntArray, true);
        }
        return objArr;
    }

    public static short parse(String str, short s13) {
        try {
            return Short.parseShort(str);
        } catch (NumberFormatException unused) {
            return s13;
        }
    }

    public static short safeUnbox(Short sh3) {
        if (sh3 == null) {
            return (short) 0;
        }
        return sh3.shortValue();
    }

    public static void setTo(boolean[] zArr, int i13, boolean z4) {
        if (zArr == null || i13 < 0 || i13 >= zArr.length) {
            return;
        }
        zArr[i13] = z4;
    }

    @TargetApi(16)
    public static <T> T getFromList(LongSparseArray<T> longSparseArray, int i13) {
        if (longSparseArray == null || i13 < 0) {
            return null;
        }
        return longSparseArray.get(i13);
    }

    public static int parse(String str, int i13) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i13;
        }
    }

    public static byte safeUnbox(Byte b) {
        if (b == null) {
            return (byte) 0;
        }
        return b.byteValue();
    }

    public static byte getFromArray(byte[] bArr, int i13) {
        if (bArr == null || i13 < 0 || i13 >= bArr.length) {
            return (byte) 0;
        }
        return bArr[i13];
    }

    public static <T> T getFromList(C0062y c0062y, int i13) {
        if (c0062y == null || i13 < 0) {
            return null;
        }
        return (T) c0062y.m151c(i13);
    }

    public static long parse(String str, long j7) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j7;
        }
    }

    public static char safeUnbox(Character ch4) {
        if (ch4 == null) {
            return (char) 0;
        }
        return ch4.charValue();
    }

    public static void setTo(byte[] bArr, int i13, byte b) {
        if (bArr == null || i13 < 0 || i13 >= bArr.length) {
            return;
        }
        bArr[i13] = b;
    }

    public static boolean getFromList(SparseBooleanArray sparseBooleanArray, int i13) {
        if (sparseBooleanArray == null || i13 < 0) {
            return false;
        }
        return sparseBooleanArray.get(i13);
    }

    public static float parse(String str, float f13) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f13;
        }
    }

    public static double safeUnbox(Double d3) {
        if (d3 == null) {
            return 0.0d;
        }
        return d3.doubleValue();
    }

    public static short getFromArray(short[] sArr, int i13) {
        if (sArr == null || i13 < 0 || i13 >= sArr.length) {
            return (short) 0;
        }
        return sArr[i13];
    }

    public static int getFromList(SparseIntArray sparseIntArray, int i13) {
        if (sparseIntArray == null || i13 < 0) {
            return 0;
        }
        return sparseIntArray.get(i13);
    }

    public static double parse(String str, double d3) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return d3;
        }
    }

    public static float safeUnbox(Float f13) {
        if (f13 == null) {
            return 0.0f;
        }
        return f13.floatValue();
    }

    public static void setTo(short[] sArr, int i13, short s13) {
        if (sArr == null || i13 < 0 || i13 >= sArr.length) {
            return;
        }
        sArr[i13] = s13;
    }

    public boolean updateRegistration(int i13, InterfaceC1180j interfaceC1180j) {
        return updateRegistration(i13, interfaceC1180j, CREATE_PROPERTY_LISTENER);
    }

    @TargetApi(C1533u.AVG_FIELD_NUMBER)
    public static long getFromList(SparseLongArray sparseLongArray, int i13) {
        if (sparseLongArray == null || i13 < 0) {
            return 0L;
        }
        return sparseLongArray.get(i13);
    }

    public static char parse(String str, char c3) {
        return (str == null || str.isEmpty()) ? c3 : str.charAt(0);
    }

    public static boolean safeUnbox(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean updateRegistration(int i13, InterfaceC1181k interfaceC1181k) {
        return updateRegistration(i13, interfaceC1181k, CREATE_LIST_LISTENER);
    }

    public static char getFromArray(char[] cArr, int i13) {
        if (cArr == null || i13 < 0 || i13 >= cArr.length) {
            return (char) 0;
        }
        return cArr[i13];
    }

    public static void setTo(char[] cArr, int i13, char c3) {
        if (cArr == null || i13 < 0 || i13 >= cArr.length) {
            return;
        }
        cArr[i13] = c3;
    }

    public boolean updateRegistration(int i13, InterfaceC1182l interfaceC1182l) {
        return updateRegistration(i13, interfaceC1182l, CREATE_MAP_LISTENER);
    }

    public static int getFromArray(int[] iArr, int i13) {
        if (iArr == null || i13 < 0 || i13 >= iArr.length) {
            return 0;
        }
        return iArr[i13];
    }

    public static void setTo(int[] iArr, int i13, int i14) {
        if (iArr == null || i13 < 0 || i13 >= iArr.length) {
            return;
        }
        iArr[i13] = i14;
    }

    public static long getFromArray(long[] jArr, int i13) {
        if (jArr == null || i13 < 0 || i13 >= jArr.length) {
            return 0L;
        }
        return jArr[i13];
    }

    public static void setTo(long[] jArr, int i13, long j7) {
        if (jArr == null || i13 < 0 || i13 >= jArr.length) {
            return;
        }
        jArr[i13] = j7;
    }

    public static float getFromArray(float[] fArr, int i13) {
        if (fArr == null || i13 < 0 || i13 >= fArr.length) {
            return 0.0f;
        }
        return fArr[i13];
    }

    public static void setTo(float[] fArr, int i13, float f13) {
        if (fArr == null || i13 < 0 || i13 >= fArr.length) {
            return;
        }
        fArr[i13] = f13;
    }

    public static double getFromArray(double[] dArr, int i13) {
        if (dArr == null || i13 < 0 || i13 >= dArr.length) {
            return 0.0d;
        }
        return dArr[i13];
    }

    public static void setTo(double[] dArr, int i13, double d3) {
        if (dArr == null || i13 < 0 || i13 >= dArr.length) {
            return;
        }
        dArr[i13] = d3;
    }

    public static <T> void setTo(List<T> list, int i13, T t14) {
        if (list == null || i13 < 0 || i13 >= list.size()) {
            return;
        }
        list.set(i13, t14);
    }

    public static <T> void setTo(SparseArray<T> sparseArray, int i13, T t14) {
        if (sparseArray == null || i13 < 0 || i13 >= sparseArray.size()) {
            return;
        }
        sparseArray.put(i13, t14);
    }

    @TargetApi(16)
    public static <T> void setTo(LongSparseArray<T> longSparseArray, int i13, T t14) {
        if (longSparseArray == null || i13 < 0 || i13 >= longSparseArray.size()) {
            return;
        }
        longSparseArray.put(i13, t14);
    }

    public static <T> void setTo(C0062y c0062y, int i13, T t14) {
        if (c0062y == null || i13 < 0 || i13 >= c0062y.m157i()) {
            return;
        }
        c0062y.m155g(i13, t14);
    }

    public static void setTo(SparseBooleanArray sparseBooleanArray, int i13, boolean z4) {
        if (sparseBooleanArray == null || i13 < 0 || i13 >= sparseBooleanArray.size()) {
            return;
        }
        sparseBooleanArray.put(i13, z4);
    }

    public static void setTo(SparseIntArray sparseIntArray, int i13, int i14) {
        if (sparseIntArray == null || i13 < 0 || i13 >= sparseIntArray.size()) {
            return;
        }
        sparseIntArray.put(i13, i14);
    }

    @TargetApi(C1533u.AVG_FIELD_NUMBER)
    public static void setTo(SparseLongArray sparseLongArray, int i13, long j7) {
        if (sparseLongArray == null || i13 < 0 || i13 >= sparseLongArray.size()) {
            return;
        }
        sparseLongArray.put(i13, j7);
    }

    public static <K, T> void setTo(Map<K, T> map, K k5, T t14) {
        if (map == null) {
            return;
        }
        map.put(k5, t14);
    }
}
