package p395p6;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.RemoteViews;
import c93.InterfaceC4352n;
import com.whoop.android.R;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import n20.C26175j;
import p335n6.InterfaceC26395l;
import p505ts.AbstractC34132o;
import p550vd.AbstractC35902e;
import p605x6.AbstractC38008m;
import p605x6.C38007l;
import p605x6.InterfaceC38001f;
import p639y6.C39254f;
import p639y6.C39256h;
import p639y6.InterfaceC39255g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: p6.g0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC28880g0 {

    /* JADX INFO: renamed from: w */
    private final int f116876w = R.layout.glance_error_layout;

    /* JADX INFO: renamed from: x */
    private final InterfaceC28923u1 f116877x;

    /* JADX INFO: renamed from: y */
    private final InterfaceC28890j1 f116878y;

    /* JADX INFO: renamed from: z */
    private final InterfaceC39255g f116879z;

    public AbstractC28880g0() {
        C28920t1 c28920t1 = C28920t1.f117030a;
        this.f116877x = c28920t1;
        this.f116878y = c28920t1;
        this.f116879z = C39256h.f168775a;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Object m87796k(AbstractC28880g0 abstractC28880g0, Context context, InterfaceC26395l interfaceC26395l, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ Object m87797o(AbstractC28880g0 abstractC28880g0, Context context, int i13, String str, Bundle bundle, InterfaceC30057d interfaceC30057d, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: triggerAction");
        }
        if ((i14 & 8) != 0) {
            bundle = null;
        }
        return abstractC28880g0.m87808n(context, i13, str, bundle, interfaceC30057d);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ Object m87798r(AbstractC28880g0 abstractC28880g0, Context context, int i13, Bundle bundle, InterfaceC30057d interfaceC30057d, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
        }
        if ((i14 & 4) != 0) {
            bundle = null;
        }
        return abstractC28880g0.m87810q(context, i13, bundle, interfaceC30057d);
    }

    /* JADX INFO: renamed from: a */
    public C28894l m87799a(Context context, C28864b c28864b, Bundle bundle) {
        return new C28894l(this, c28864b, bundle);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:62:0x012a  */
    /* JADX WARN: Code duplicated, block: B:65:0x013e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m87800b(Context context, int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        C28868c0 c28868c0;
        C28864b c28864b;
        Context context2;
        int i14;
        C28864b c28864b2;
        Throwable th3;
        C28864b c28864b3;
        Throwable th4;
        Context context3;
        InterfaceC39255g interfaceC39255gMo63262h;
        C39254f c39254f;
        String strM113970l;
        C28864b c28864b4;
        Context context4;
        InterfaceC39255g interfaceC39255gMo63262h2;
        C39254f c39254f2;
        String strM113970l2;
        Context context5;
        InterfaceC39255g interfaceC39255gMo63262h3;
        C39254f c39254f3;
        String strM113970l3;
        if (interfaceC30057d instanceof C28868c0) {
            c28868c0 = (C28868c0) interfaceC30057d;
            int i15 = c28868c0.f116839G;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                c28868c0.f116839G = i15 - Integer.MIN_VALUE;
            } else {
                c28868c0 = new C28868c0(this, interfaceC30057d);
            }
        } else {
            c28868c0 = new C28868c0(this, interfaceC30057d);
        }
        Object obj = c28868c0.f116837E;
        Object obj2 = EnumC31071a.f128113w;
        switch (c28868c0.f116839G) {
            case 0:
                AbstractC34132o.m107864I(obj);
                c28864b = new C28864b(i13);
                InterfaceC38001f interfaceC38001fM87804f = m87804f(context);
                C26175j c26175j = new C26175j(c28864b, (InterfaceC30057d) null, 13);
                c28868c0.f116840w = context;
                c28868c0.f116841x = c28864b;
                c28868c0.f116843z = i13;
                c28868c0.f116839G = 1;
                if (((C38007l) interfaceC38001fM87804f).m121743a(c26175j, c28868c0) != obj2) {
                    try {
                        c28868c0.f116840w = context;
                        c28868c0.f116841x = c28864b;
                        c28868c0.f116843z = i13;
                        c28868c0.f116839G = 2;
                        if (m87806j(context, c28864b, c28868c0) != obj2) {
                            context2 = context;
                            c28864b3 = c28864b;
                            interfaceC39255gMo63262h3 = mo63262h();
                            if (interfaceC39255gMo63262h3 != null) {
                                c39254f3 = C39254f.f168772a;
                                strM113970l3 = AbstractC35902e.m113970l(i13);
                                c28868c0.f116840w = context2;
                                c28868c0.f116841x = c28864b3;
                                c28868c0.f116839G = 3;
                                if (c39254f3.m125026a(context2, interfaceC39255gMo63262h3, strM113970l3, c28868c0) != obj2) {
                                    context5 = context2;
                                    context2 = context5;
                                }
                            }
                            C28918t.m87833b(context2, c28864b3);
                            return C23454a0.f92919a;
                        }
                    } catch (CancellationException unused) {
                        context2 = context;
                        c28864b3 = c28864b;
                        interfaceC39255gMo63262h2 = mo63262h();
                        if (interfaceC39255gMo63262h2 != null) {
                            c39254f2 = C39254f.f168772a;
                            strM113970l2 = AbstractC35902e.m113970l(i13);
                            c28868c0.f116840w = context2;
                            c28868c0.f116841x = c28864b3;
                            c28868c0.f116839G = 4;
                            if (c39254f2.m125026a(context2, interfaceC39255gMo63262h2, strM113970l2, c28868c0) != obj2) {
                                context5 = context2;
                            }
                            return obj2;
                        }
                        C28918t.m87833b(context2, c28864b3);
                        return C23454a0.f92919a;
                    } catch (Throwable th5) {
                        context2 = context;
                        i14 = i13;
                        c28864b2 = c28864b;
                        th3 = th5;
                        try {
                            Log.e("GlanceAppWidget", "Error in user-provided deletion callback", th3);
                            interfaceC39255gMo63262h = mo63262h();
                            if (interfaceC39255gMo63262h != null) {
                                c39254f = C39254f.f168772a;
                                strM113970l = AbstractC35902e.m113970l(i14);
                                c28868c0.f116840w = context2;
                                c28868c0.f116841x = c28864b2;
                                c28868c0.f116839G = 5;
                                if (c39254f.m125026a(context2, interfaceC39255gMo63262h, strM113970l, c28868c0) != obj2) {
                                    c28864b4 = c28864b2;
                                    context4 = context2;
                                    context2 = context4;
                                    c28864b2 = c28864b4;
                                }
                            }
                            C28918t.m87833b(context2, c28864b2);
                            return C23454a0.f92919a;
                        } catch (Throwable th6) {
                            th = th6;
                            InterfaceC39255g interfaceC39255gMo63262h4 = mo63262h();
                            if (interfaceC39255gMo63262h4 != null) {
                                C39254f c39254f4 = C39254f.f168772a;
                                String strM113970l4 = AbstractC35902e.m113970l(i14);
                                c28868c0.f116840w = context2;
                                c28868c0.f116841x = c28864b2;
                                c28868c0.f116842y = th;
                                c28868c0.f116839G = 6;
                                if (c39254f4.m125026a(context2, interfaceC39255gMo63262h4, strM113970l4, c28868c0) != obj2) {
                                    th4 = th;
                                    context3 = context2;
                                    th = th4;
                                    context2 = context3;
                                }
                            }
                            C28918t.m87833b(context2, c28864b2);
                            throw th;
                        }
                    }
                }
                return obj2;
            case 1:
                i13 = c28868c0.f116843z;
                C28864b c28864b5 = c28868c0.f116841x;
                Context context6 = c28868c0.f116840w;
                AbstractC34132o.m107864I(obj);
                c28864b = c28864b5;
                context = context6;
                c28868c0.f116840w = context;
                c28868c0.f116841x = c28864b;
                c28868c0.f116843z = i13;
                c28868c0.f116839G = 2;
                if (m87806j(context, c28864b, c28868c0) != obj2) {
                    context2 = context;
                    c28864b3 = c28864b;
                    interfaceC39255gMo63262h3 = mo63262h();
                    if (interfaceC39255gMo63262h3 != null) {
                        c39254f3 = C39254f.f168772a;
                        strM113970l3 = AbstractC35902e.m113970l(i13);
                        c28868c0.f116840w = context2;
                        c28868c0.f116841x = c28864b3;
                        c28868c0.f116839G = 3;
                        if (c39254f3.m125026a(context2, interfaceC39255gMo63262h3, strM113970l3, c28868c0) != obj2) {
                            context5 = context2;
                            context2 = context5;
                        }
                    }
                    C28918t.m87833b(context2, c28864b3);
                    return C23454a0.f92919a;
                }
                return obj2;
            case 2:
                i14 = c28868c0.f116843z;
                c28864b2 = c28868c0.f116841x;
                context2 = c28868c0.f116840w;
                try {
                    AbstractC34132o.m107864I(obj);
                    i13 = i14;
                    c28864b3 = c28864b2;
                    interfaceC39255gMo63262h3 = mo63262h();
                    if (interfaceC39255gMo63262h3 != null) {
                        c39254f3 = C39254f.f168772a;
                        strM113970l3 = AbstractC35902e.m113970l(i13);
                        c28868c0.f116840w = context2;
                        c28868c0.f116841x = c28864b3;
                        c28868c0.f116839G = 3;
                        if (c39254f3.m125026a(context2, interfaceC39255gMo63262h3, strM113970l3, c28868c0) != obj2) {
                            context5 = context2;
                            context2 = context5;
                        }
                        return obj2;
                    }
                } catch (CancellationException unused2) {
                    i13 = i14;
                    c28864b3 = c28864b2;
                    interfaceC39255gMo63262h2 = mo63262h();
                    if (interfaceC39255gMo63262h2 != null) {
                        c39254f2 = C39254f.f168772a;
                        strM113970l2 = AbstractC35902e.m113970l(i13);
                        c28868c0.f116840w = context2;
                        c28868c0.f116841x = c28864b3;
                        c28868c0.f116839G = 4;
                        if (c39254f2.m125026a(context2, interfaceC39255gMo63262h2, strM113970l2, c28868c0) != obj2) {
                            context5 = context2;
                        }
                        return obj2;
                    }
                    C28918t.m87833b(context2, c28864b3);
                    return C23454a0.f92919a;
                } catch (Throwable th7) {
                    th3 = th7;
                    Log.e("GlanceAppWidget", "Error in user-provided deletion callback", th3);
                    interfaceC39255gMo63262h = mo63262h();
                    if (interfaceC39255gMo63262h != null) {
                        c39254f = C39254f.f168772a;
                        strM113970l = AbstractC35902e.m113970l(i14);
                        c28868c0.f116840w = context2;
                        c28868c0.f116841x = c28864b2;
                        c28868c0.f116839G = 5;
                        if (c39254f.m125026a(context2, interfaceC39255gMo63262h, strM113970l, c28868c0) != obj2) {
                            c28864b4 = c28864b2;
                            context4 = context2;
                            context2 = context4;
                            c28864b2 = c28864b4;
                        }
                    }
                    C28918t.m87833b(context2, c28864b2);
                    return C23454a0.f92919a;
                }
                C28918t.m87833b(context2, c28864b3);
                return C23454a0.f92919a;
            case 3:
                c28864b3 = c28868c0.f116841x;
                context5 = c28868c0.f116840w;
                AbstractC34132o.m107864I(obj);
                context2 = context5;
                C28918t.m87833b(context2, c28864b3);
                return C23454a0.f92919a;
            case 4:
                c28864b3 = c28868c0.f116841x;
                context5 = c28868c0.f116840w;
                AbstractC34132o.m107864I(obj);
                context2 = context5;
                C28918t.m87833b(context2, c28864b3);
                return C23454a0.f92919a;
            case 5:
                c28864b4 = c28868c0.f116841x;
                context4 = c28868c0.f116840w;
                AbstractC34132o.m107864I(obj);
                context2 = context4;
                c28864b2 = c28864b4;
                C28918t.m87833b(context2, c28864b2);
                return C23454a0.f92919a;
            case 6:
                th4 = c28868c0.f116842y;
                c28864b2 = c28868c0.f116841x;
                context3 = c28868c0.f116840w;
                AbstractC34132o.m107864I(obj);
                th = th4;
                context2 = context3;
                C28918t.m87833b(context2, c28864b2);
                throw th;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: c */
    public C28919t0 m87801c(Context context) {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public int m87802d() {
        return this.f116876w;
    }

    /* JADX INFO: renamed from: e */
    public final <T> Object m87803e(Context context, C28864b c28864b, Bundle bundle, InterfaceC4352n interfaceC4352n, InterfaceC30057d<? super T> interfaceC30057d) {
        return ((C38007l) m87804f(context)).m121743a(new C28871d0(context, c28864b, this, bundle, interfaceC4352n, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC38001f m87804f(Context context) {
        return AbstractC38008m.m121744a();
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC28923u1 getSizeMode() {
        return this.f116877x;
    }

    /* JADX INFO: renamed from: h */
    public abstract InterfaceC39255g mo63262h();

    /* JADX INFO: renamed from: i */
    public void m87805i(Context context, InterfaceC26395l interfaceC26395l, int i13, Throwable th3) throws Throwable {
        if (m87802d() == 0) {
            throw th3;
        }
        AppWidgetManager.getInstance(context).updateAppWidget(i13, new RemoteViews(context.getPackageName(), m87802d()));
    }

    /* JADX INFO: renamed from: j */
    public Object m87806j(Context context, InterfaceC26395l interfaceC26395l, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return m87796k(this, context, interfaceC26395l, interfaceC30057d);
    }

    /* JADX INFO: renamed from: l */
    public abstract Object mo63263l(Context context, InterfaceC26395l interfaceC26395l, InterfaceC30057d interfaceC30057d);

    /* JADX INFO: renamed from: m */
    public final Object m87807m(Context context, int i13, Bundle bundle, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM87803e;
        return ((getSizeMode() instanceof C28920t1) || (Build.VERSION.SDK_INT > 31 && (getSizeMode() instanceof C28917s1)) || (objM87803e = m87803e(context, new C28864b(i13), bundle, new C28874e0(bundle, null, 0), interfaceC30057d)) != EnumC31071a.f128113w) ? C23454a0.f92919a : objM87803e;
    }

    /* JADX INFO: renamed from: n */
    public final Object m87808n(Context context, int i13, String str, Bundle bundle, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM87803e = m87803e(context, new C28864b(i13), bundle, new C28874e0(str, null, 1), interfaceC30057d);
        return objM87803e == EnumC31071a.f128113w ? objM87803e : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    public final Object m87809p(Context context, InterfaceC26395l interfaceC26395l, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        if (interfaceC26395l instanceof C28864b) {
            C28864b c28864b = (C28864b) interfaceC26395l;
            if (AbstractC35902e.m113941J(c28864b)) {
                Object objM87798r = m87798r(this, context, c28864b.m87784a(), null, interfaceC30057d, 4, null);
                return objM87798r == EnumC31071a.f128113w ? objM87798r : C23454a0.f92919a;
            }
        }
        throw new IllegalArgumentException("Invalid Glance ID");
    }

    /* JADX INFO: renamed from: q */
    public final Object m87810q(Context context, int i13, Bundle bundle, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        AbstractC28929w1.m87838a();
        Object objM87803e = m87803e(context, new C28864b(i13), bundle, new C28877f0(), interfaceC30057d);
        return objM87803e == EnumC31071a.f128113w ? objM87803e : C23454a0.f92919a;
    }
}
