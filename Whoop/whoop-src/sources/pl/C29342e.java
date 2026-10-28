package pl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.C4961c;
import com.bumptech.glide.EnumC4962d;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p108e4.AbstractC12667a;
import p108e4.AbstractC12682p;
import p429ql.InterfaceC30462h;
import p429ql.InterfaceC30463i;
import p464rl.InterfaceC31509d;
import p526ul.C35058d;
import p586wk.C37330h;
import p586wk.EnumC37323a;
import p586wk.InterfaceC37327e;
import p684zk.C40786k;
import p684zk.C40787l;
import p684zk.C40791p;
import p684zk.InterfaceC40801z;
import tl.AbstractC33908g;
import tl.AbstractC33913l;
import tl.C33903b;
import z63.C40132d;

/* JADX INFO: renamed from: pl.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C29342e implements InterfaceC29339b, InterfaceC30462h {

    /* JADX INFO: renamed from: A */
    public static final boolean f118878A = Log.isLoggable("Request", 2);

    /* JADX INFO: renamed from: a */
    public final String f118879a;

    /* JADX INFO: renamed from: b */
    public final C35058d f118880b;

    /* JADX INFO: renamed from: c */
    public final Object f118881c;

    /* JADX INFO: renamed from: d */
    public final Context f118882d;

    /* JADX INFO: renamed from: e */
    public final C4961c f118883e;

    /* JADX INFO: renamed from: f */
    public final Object f118884f;

    /* JADX INFO: renamed from: g */
    public final Class f118885g;

    /* JADX INFO: renamed from: h */
    public final AbstractC29338a f118886h;

    /* JADX INFO: renamed from: i */
    public final int f118887i;

    /* JADX INFO: renamed from: j */
    public final int f118888j;

    /* JADX INFO: renamed from: k */
    public final EnumC4962d f118889k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC30463i f118890l;

    /* JADX INFO: renamed from: m */
    public final List f118891m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC31509d f118892n;

    /* JADX INFO: renamed from: o */
    public final Executor f118893o;

    /* JADX INFO: renamed from: p */
    public InterfaceC40801z f118894p;

    /* JADX INFO: renamed from: q */
    public C40132d f118895q;

    /* JADX INFO: renamed from: r */
    public long f118896r;

    /* JADX INFO: renamed from: s */
    public volatile C40787l f118897s;

    /* JADX INFO: renamed from: t */
    public Drawable f118898t;

    /* JADX INFO: renamed from: u */
    public Drawable f118899u;

    /* JADX INFO: renamed from: v */
    public Drawable f118900v;

    /* JADX INFO: renamed from: w */
    public int f118901w;

    /* JADX INFO: renamed from: x */
    public int f118902x;

    /* JADX INFO: renamed from: y */
    public boolean f118903y;

    /* JADX INFO: renamed from: z */
    public int f118904z;

    public C29342e(Context context, C4961c c4961c, Object obj, Object obj2, Class cls, AbstractC29338a abstractC29338a, int i13, int i14, EnumC4962d enumC4962d, InterfaceC30463i interfaceC30463i, ArrayList arrayList, C40787l c40787l, InterfaceC31509d interfaceC31509d, Executor executor) {
        this.f118879a = f118878A ? String.valueOf(hashCode()) : null;
        this.f118880b = new C35058d();
        this.f118881c = obj;
        this.f118882d = context;
        this.f118883e = c4961c;
        this.f118884f = obj2;
        this.f118885g = cls;
        this.f118886h = abstractC29338a;
        this.f118887i = i13;
        this.f118888j = i14;
        this.f118889k = enumC4962d;
        this.f118890l = interfaceC30463i;
        this.f118891m = arrayList;
        this.f118897s = c40787l;
        this.f118892n = interfaceC31509d;
        this.f118893o = executor;
        this.f118904z = 1;
        c4961c.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final void m89331a() {
        synchronized (this.f118881c) {
            try {
                if (this.f118903y) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f118880b.m110831b();
                int i13 = AbstractC33908g.f142084b;
                this.f118896r = SystemClock.elapsedRealtimeNanos();
                if (this.f118884f == null) {
                    if (AbstractC33913l.m107273h(this.f118887i, this.f118888j)) {
                        this.f118901w = this.f118887i;
                        this.f118902x = this.f118888j;
                    }
                    if (this.f118900v == null) {
                        this.f118886h.getClass();
                        this.f118900v = null;
                    }
                    m89339i(new GlideException("Received null model"), this.f118900v == null ? 5 : 3);
                    return;
                }
                int i14 = this.f118904z;
                if (i14 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i14 == 4) {
                    m89341k(this.f118894p, EnumC37323a.f159579E);
                    return;
                }
                this.f118904z = 3;
                if (AbstractC33913l.m107273h(this.f118887i, this.f118888j)) {
                    m89342l(this.f118887i, this.f118888j);
                } else {
                    this.f118890l.mo15544h(this);
                }
                int i15 = this.f118904z;
                if (i15 == 2 || i15 == 3) {
                    this.f118890l.mo15540c(m89334d());
                }
                if (f118878A) {
                    m89338h("finished run method in " + AbstractC33908g.m107258a(this.f118896r));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m89332b() {
        if (this.f118903y) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.f118880b.m110831b();
        this.f118890l.mo15539a(this);
        C40132d c40132d = this.f118895q;
        if (c40132d != null) {
            synchronized (((C40787l) c40132d.f173185y)) {
                ((C40791p) c40132d.f173183w).m132301i((C29342e) c40132d.f173184x);
            }
            this.f118895q = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m89333c() {
        synchronized (this.f118881c) {
            try {
                if (this.f118903y) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f118880b.m110831b();
                if (this.f118904z == 6) {
                    return;
                }
                m89332b();
                InterfaceC40801z interfaceC40801z = this.f118894p;
                if (interfaceC40801z != null) {
                    this.f118894p = null;
                } else {
                    interfaceC40801z = null;
                }
                this.f118890l.mo5839e(m89334d());
                this.f118904z = 6;
                if (interfaceC40801z != null) {
                    this.f118897s.getClass();
                    C40787l.m132288f(interfaceC40801z);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final Drawable m89334d() {
        int i13;
        if (this.f118899u == null) {
            AbstractC29338a abstractC29338a = this.f118886h;
            Drawable drawable = abstractC29338a.f118858E;
            this.f118899u = drawable;
            if (drawable == null && (i13 = abstractC29338a.f118859F) > 0) {
                this.f118899u = m89337g(i13);
            }
        }
        return this.f118899u;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m89335e() {
        boolean z4;
        synchronized (this.f118881c) {
            z4 = this.f118904z == 4;
        }
        return z4;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m89336f() {
        boolean z4;
        synchronized (this.f118881c) {
            int i13 = this.f118904z;
            z4 = i13 == 2 || i13 == 3;
        }
        return z4;
    }

    /* JADX INFO: renamed from: g */
    public final Drawable m89337g(int i13) {
        this.f118886h.getClass();
        Resources.Theme theme = this.f118882d.getTheme();
        C4961c c4961c = this.f118883e;
        return AbstractC12667a.m35472z(c4961c, c4961c, i13, theme);
    }

    /* JADX INFO: renamed from: h */
    public final void m89338h(String str) {
        StringBuilder sbM35484d = AbstractC12682p.m35484d(str, " this: ");
        sbM35484d.append(this.f118879a);
        Log.v("Request", sbM35484d.toString());
    }

    /* JADX INFO: renamed from: i */
    public final void m89339i(GlideException glideException, int i13) {
        boolean zMo28896a;
        Drawable drawableM89334d;
        this.f118880b.m110831b();
        synchronized (this.f118881c) {
            try {
                glideException.getClass();
                int i14 = this.f118883e.f20309h;
                if (i14 <= i13) {
                    Log.w("Glide", "Load failed for " + this.f118884f + " with size [" + this.f118901w + "x" + this.f118902x + "]", glideException);
                    if (i14 <= 4) {
                        glideException.m15558d();
                    }
                }
                this.f118895q = null;
                this.f118904z = 5;
                this.f118903y = true;
                try {
                    List list = this.f118891m;
                    if (list != null) {
                        Iterator it = list.iterator();
                        zMo28896a = false;
                        while (it.hasNext()) {
                            zMo28896a |= ((InterfaceC29340c) it.next()).mo28896a(glideException, this.f118884f, this.f118890l, true);
                        }
                    } else {
                        zMo28896a = false;
                    }
                    if (!zMo28896a) {
                        if (this.f118884f == null) {
                            if (this.f118900v == null) {
                                this.f118886h.getClass();
                                this.f118900v = null;
                            }
                            drawableM89334d = this.f118900v;
                        } else {
                            drawableM89334d = null;
                        }
                        if (drawableM89334d == null) {
                            if (this.f118898t == null) {
                                AbstractC29338a abstractC29338a = this.f118886h;
                                abstractC29338a.getClass();
                                this.f118898t = null;
                                int i15 = abstractC29338a.f118876z;
                                if (i15 > 0) {
                                    this.f118898t = m89337g(i15);
                                }
                            }
                            drawableM89334d = this.f118898t;
                        }
                        if (drawableM89334d == null) {
                            drawableM89334d = m89334d();
                        }
                        this.f118890l.mo15543g(drawableM89334d);
                    }
                    this.f118903y = false;
                } catch (Throwable th3) {
                    this.f118903y = false;
                    throw th3;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m89340j(InterfaceC40801z interfaceC40801z, Object obj, EnumC37323a enumC37323a) {
        boolean zMo28897b;
        this.f118904z = 4;
        this.f118894p = interfaceC40801z;
        if (this.f118883e.f20309h <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + enumC37323a + " for " + this.f118884f + " with size [" + this.f118901w + "x" + this.f118902x + "] in " + AbstractC33908g.m107258a(this.f118896r) + " ms");
        }
        this.f118903y = true;
        try {
            List list = this.f118891m;
            if (list != null) {
                Iterator it = list.iterator();
                zMo28897b = false;
                while (it.hasNext()) {
                    Object obj2 = obj;
                    EnumC37323a enumC37323a2 = enumC37323a;
                    zMo28897b |= ((InterfaceC29340c) it.next()).mo28897b(obj2, this.f118884f, this.f118890l, enumC37323a2, true);
                    obj = obj2;
                    enumC37323a = enumC37323a2;
                }
            } else {
                zMo28897b = false;
            }
            Object obj3 = obj;
            EnumC37323a enumC37323a3 = enumC37323a;
            if (!zMo28897b) {
                this.f118890l.mo5838b(obj3, this.f118892n.mo2218e(enumC37323a3));
            }
        } finally {
            this.f118903y = false;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m89341k(InterfaceC40801z interfaceC40801z, EnumC37323a enumC37323a) {
        this.f118880b.m110831b();
        InterfaceC40801z interfaceC40801z2 = null;
        try {
            synchronized (this.f118881c) {
                try {
                    this.f118895q = null;
                    if (interfaceC40801z == null) {
                        m89339i(new GlideException("Expected to receive a Resource<R> with an object of " + this.f118885g + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = interfaceC40801z.get();
                    if (obj != null && this.f118885g.isAssignableFrom(obj.getClass())) {
                        m89340j(interfaceC40801z, obj, enumC37323a);
                        return;
                    }
                    try {
                        this.f118894p = null;
                        StringBuilder sb4 = new StringBuilder("Expected to receive an object of ");
                        sb4.append(this.f118885g);
                        sb4.append(" but instead got ");
                        sb4.append(obj != null ? obj.getClass() : "");
                        sb4.append("{");
                        sb4.append(obj);
                        sb4.append("} inside Resource{");
                        sb4.append(interfaceC40801z);
                        sb4.append("}.");
                        sb4.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        m89339i(new GlideException(sb4.toString()), 5);
                        this.f118897s.getClass();
                        C40787l.m132288f(interfaceC40801z);
                    } catch (Throwable th3) {
                        interfaceC40801z2 = interfaceC40801z;
                        th = th3;
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            if (interfaceC40801z2 != null) {
                this.f118897s.getClass();
                C40787l.m132288f(interfaceC40801z2);
            }
            throw th5;
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
    /* JADX INFO: renamed from: l */
    public final void m89342l(int i13, int i14) throws Throwable {
        Object obj;
        C29342e c29342e = this;
        int iRound = i13;
        c29342e.f118880b.m110831b();
        Object obj2 = c29342e.f118881c;
        synchronized (obj2) {
            try {
                try {
                    boolean z4 = f118878A;
                    if (z4) {
                        c29342e.m89338h("Got onSizeReady in " + AbstractC33908g.m107258a(c29342e.f118896r));
                    }
                    if (c29342e.f118904z == 3) {
                        c29342e.f118904z = 2;
                        c29342e.f118886h.getClass();
                        if (iRound != Integer.MIN_VALUE) {
                            iRound = Math.round(iRound * 1.0f);
                        }
                        c29342e.f118901w = iRound;
                        c29342e.f118902x = i14 == Integer.MIN_VALUE ? i14 : Math.round(1.0f * i14);
                        if (z4) {
                            c29342e.m89338h("finished setup for calling load in " + AbstractC33908g.m107258a(c29342e.f118896r));
                        }
                        C40787l c40787l = c29342e.f118897s;
                        C4961c c4961c = c29342e.f118883e;
                        Object obj3 = c29342e.f118884f;
                        AbstractC29338a abstractC29338a = c29342e.f118886h;
                        InterfaceC37327e interfaceC37327e = abstractC29338a.f118863J;
                        try {
                            int i15 = c29342e.f118901w;
                            int i16 = c29342e.f118902x;
                            Class cls = abstractC29338a.f118868O;
                            try {
                                Class cls2 = c29342e.f118885g;
                                EnumC4962d enumC4962d = c29342e.f118889k;
                                C40786k c40786k = abstractC29338a.f118874x;
                                try {
                                    C33903b c33903b = abstractC29338a.f118867N;
                                    boolean z13 = abstractC29338a.f118864K;
                                    boolean z14 = abstractC29338a.f118871R;
                                    try {
                                        C37330h c37330h = abstractC29338a.f118866M;
                                        boolean z15 = abstractC29338a.f118860G;
                                        boolean z16 = abstractC29338a.f118872S;
                                        Executor executor = c29342e.f118893o;
                                        Object obj4 = obj2;
                                        try {
                                            c29342e.f118895q = c40787l.m132289a(c4961c, obj3, interfaceC37327e, i15, i16, cls, cls2, enumC4962d, c40786k, c33903b, z13, z14, c37330h, z15, z16, c29342e, executor);
                                            if (c29342e.f118904z != 2) {
                                                c29342e.f118895q = null;
                                            }
                                            if (z4) {
                                                c29342e.m89338h("finished onSizeReady in " + AbstractC33908g.m107258a(c29342e.f118896r));
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            obj = obj4;
                                            throw th;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        obj = obj2;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    obj = obj2;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                obj = obj2;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            obj = obj2;
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    obj = c29342e;
                }
            } catch (Throwable th9) {
                th = th9;
                obj = obj2;
            }
        }
    }
}
