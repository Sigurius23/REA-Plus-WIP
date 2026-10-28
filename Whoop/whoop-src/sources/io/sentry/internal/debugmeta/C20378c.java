package io.sentry.internal.debugmeta;

import a33.C0352d;
import a53.C0403b;
import ac3.C0745a;
import al.InterfaceC0955b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.WindowInsetsAnimation;
import androidx.health.platform.client.proto.C1533u;
import androidx.room.AbstractC1772c1;
import androidx.room.C1812n0;
import androidx.room.EnumC1827s0;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import bc3.InterfaceC2994c0;
import bi.C3278p;
import c93.InterfaceC4339a;
import com.bumptech.glide.ComponentCallbacks2C4966h;
import com.google.crypto.tink.shaded.protobuf.C5143h;
import com.google.crypto.tink.shaded.protobuf.C5158m;
import d13.AbstractC11478a;
import d30.C11552o;
import e53.C12742a;
import e53.C12745d;
import e53.InterfaceC12744c;
import ec3.C13045h2;
import f53.C14124l;
import f53.C14125m;
import f93.C14289a;
import f93.InterfaceC14291c;
import fg3.InterfaceC14474b;
import fk.InterfaceC14544a;
import g53.C15504i;
import g53.C15509n;
import g53.C15513r;
import g53.EnumC15497b;
import gg3.C15829b;
import gl.C15956u;
import gl.InterfaceC15947l;
import gm.C15982j;
import gm.C15990r;
import hg3.AbstractC17269i;
import hm.C17417d;
import hm.C17418e;
import i33.C18058b;
import ig3.InterfaceC18475a;
import im.InterfaceC18653b;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20602v0;
import j93.InterfaceC21493z;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import l83.C23454a0;
import l83.C23465k;
import l83.C23470p;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import n23.AbstractC26205h;
import na3.C26526m;
import na3.C26528o;
import na3.C26530q;
import no.nordicsemi.android.dfu.DfuBaseService;
import o23.C27478h;
import o23.InterfaceC27471a;
import oa3.C27776s;
import org.webrtc.MediaStreamTrack;
import org.webrtc.RtpTransceiver;
import p005a3.C0230n0;
import p005a3.C0271z0;
import p009a8.RunnableC0533c;
import p012ab.C0668a0;
import p012ab.C0670b0;
import p012ab.C0684i0;
import p012ab.C0690l0;
import p026b2.C2319y;
import p031b9.AbstractC2829f;
import p031b9.AbstractC2875y;
import p031b9.C2832g;
import p031b9.SurfaceHolderCallbackC2821c0;
import p044c5.C4215g;
import p044c5.ExecutorC4220l;
import p044c5.RunnableC4209a;
import p085d9.C11780a0;
import p085d9.C11799p;
import p085d9.C11807x;
import p088dc.AbstractC11895b;
import p097ds.AbstractC12314q;
import p097ds.RunnableC12316s;
import p108e4.AbstractC12682p;
import p133f1.C13968p1;
import p141f9.AbstractC14271m;
import p141f9.C14259a;
import p141f9.C14261c;
import p141f9.C14263e;
import p141f9.C14266h;
import p184h5.AbstractC16928z0;
import p184h5.C16860b1;
import p187h9.C17022f;
import p187h9.InterfaceC17019c;
import p246j9.C21427b;
import p277kb.C22318b;
import p284ko.C22629m;
import p309lo.AbstractC24543a;
import p338n9.C26470d;
import p398p9.InterfaceC28989m;
import p454r9.C31079d;
import p454r9.C31080e;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p479s4.AbstractC32122c;
import p484s9.C32277b;
import p499t9.C33628f;
import p499t9.InterfaceC33630g;
import p499t9.InterfaceC33646o;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33688b;
import p505ts.AbstractC34132o;
import p508ty.C34249c;
import p516u8.C34601k0;
import p543v4.C35643b;
import p547v8.InterfaceC35788e;
import p588wm.InterfaceC37369k;
import p588wm.InterfaceC37377s;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import p607x8.C38064s;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pg.C29158c;
import q83.AbstractC30060g;
import qg3.C30352d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import rb3.AbstractC31199g;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import stream.video.sfu.models.PublishOption;
import tl.C33905d;
import va3.AbstractC35849g;
import y43.C39230b;

/* JADX INFO: renamed from: io.sentry.internal.debugmeta.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C20378c implements InterfaceC20376a, InterfaceC14291c, InterfaceC33630g, InterfaceC33688b, InterfaceC12744c, InterfaceC15947l, InterfaceC18653b, InterfaceC18475a, InterfaceC28989m, InterfaceC27471a {

    /* JADX INFO: renamed from: E */
    public static int f76419E;

    /* JADX INFO: renamed from: z */
    public static int f76420z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f76421w;

    /* JADX INFO: renamed from: x */
    public Object f76422x;

    /* JADX INFO: renamed from: y */
    public Object f76423y;

    public /* synthetic */ C20378c(int i13, char c3) {
        this.f76421w = i13;
    }

    /* JADX INFO: renamed from: G */
    public static C20378c m56576G(WindowInsetsAnimation.Bounds bounds) {
        return new C20378c(bounds);
    }

    /* JADX INFO: renamed from: y */
    public static String m56577y(PublishOption publishOption) {
        return publishOption.getId() + "-" + publishOption.getTrack_type();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: A */
    public void m56578A(C2319y c2319y, AbstractC32269c abstractC32269c) {
        C14124l c14124l;
        if (abstractC32269c instanceof C14124l) {
            c14124l = (C14124l) abstractC32269c;
            int i13 = c14124l.f50775y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c14124l.f50775y = i13 - Integer.MIN_VALUE;
            } else {
                c14124l = new C14124l(this, abstractC32269c);
            }
        } else {
            c14124l = new C14124l(this, abstractC32269c);
        }
        Object obj = c14124l.f50773w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c14124l.f50775y;
        if (i14 != 0) {
            if (i14 == 1) {
                throw AbstractC2875y.m8309v(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        C13045h2 c13045h2 = m56594w().f168690e;
        C14125m c14125m = new C14125m(0, c2319y);
        c14124l.f50775y = 1;
        c13045h2.collect(c14125m, c14124l);
    }

    /* JADX INFO: renamed from: B */
    public Object m56579B(AbstractC32275i abstractC32275i) {
        C2345k c2345kM56591t = m56591t();
        InterfaceC2339e interfaceC2339e = c2345kM56591t.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.WARN;
        String str = c2345kM56591t.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM56591t.f9274b.log(enumC2341g, str, "[onNetworkNotAvailable] no args", null);
        }
        Object objM124995a = m56594w().m124995a(C15513r.f58183a, abstractC32275i);
        return objM124995a == EnumC31071a.f128113w ? objM124995a : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    public Object m56580C(AbstractC31199g abstractC31199g, boolean z4, AbstractC32269c abstractC32269c) {
        EnumC15497b enumC15497b;
        f76420z++;
        C2345k c2345kM56591t = m56591t();
        InterfaceC2339e interfaceC2339e = c2345kM56591t.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = c2345kM56591t.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM56591t.f9274b.log(enumC2341g, str, AbstractC11478a.m30857i("[onReconnect] user.id: '", abstractC31199g.mo96151b().getId(), "', isReconnection: ", abstractC31199g.f128524a), null);
        }
        C39230b c39230bM56594w = m56594w();
        if (z4) {
            enumC15497b = EnumC15497b.f58166y;
        } else {
            if (z4) {
                throw new NoWhenBranchMatchedException();
            }
            enumC15497b = EnumC15497b.f58165x;
        }
        Object objM124995a = c39230bM56594w.m124995a(new C15509n(abstractC31199g, enumC15497b), abstractC32269c);
        return objM124995a == EnumC31071a.f128113w ? objM124995a : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    public void m56581D(C4215g c4215g) {
        ExecutorC4220l executorC4220l = (ExecutorC4220l) this.f76423y;
        C34249c c34249c = (C34249c) this.f76422x;
        int i13 = c4215g.f17093b;
        if (i13 != 0) {
            executorC4220l.execute(new RunnableC4209a(c34249c, i13, 0));
        } else {
            executorC4220l.execute(new RunnableC12316s(3, c34249c, c4215g.f17092a));
        }
    }

    /* JADX INFO: renamed from: E */
    public void m56582E(Function1 function1) {
        C2996c2 c2996c2 = (C2996c2) this.f76423y;
        if (c2996c2 != null) {
            c2996c2.cancel((CancellationException) null);
        }
        this.f76423y = AbstractC3006f0.m8732z((InterfaceC2994c0) this.f76422x, null, null, new C11552o(function1, null), 3);
    }

    /* JADX INFO: renamed from: F */
    public WindowInsetsAnimation.Bounds m56583F() {
        AbstractC16928z0.m47624c();
        return AbstractC16928z0.m47622a(((C35643b) this.f76422x).m112842d(), ((C35643b) this.f76423y).m112842d());
    }

    @Override // ig3.InterfaceC18475a
    /* JADX INFO: renamed from: a */
    public InterfaceC18475a mo53317a(Throwable th3) {
        ((C0684i0) this.f76422x).f2442E = th3;
        return this;
    }

    @Override // ig3.InterfaceC18475a
    /* JADX INFO: renamed from: b */
    public void mo53318b() {
        StringBuilder sb4;
        C0684i0 c0684i0 = (C0684i0) this.f76422x;
        if (((String) c0684i0.f2443F) == null) {
            c0684i0.f2443F = "io.sentry.internal.debugmeta.c";
        }
        InterfaceC14474b interfaceC14474b = (InterfaceC14474b) this.f76423y;
        Throwable th3 = (Throwable) c0684i0.f2442E;
        Object[] objArr = new Object[th3 == null ? 0 : 1];
        if (th3 != null) {
            objArr[0] = th3;
        }
        ArrayList<C15829b> arrayList = (ArrayList) c0684i0.f2447z;
        if (arrayList == null || arrayList.isEmpty()) {
            sb4 = null;
        } else {
            sb4 = new StringBuilder();
            for (C15829b c15829b : arrayList) {
                sb4.append(c15829b.f59811a);
                sb4.append('=');
                sb4.append(c15829b.f59812b);
                sb4.append(' ');
            }
        }
        String string = (String) c0684i0.f2446y;
        if (sb4 != null) {
            sb4.append(string);
            string = sb4.toString();
        }
        int iM35485e = AbstractC12682p.m35485e(c0684i0.f2445x);
        if (iM35485e == 0) {
            interfaceC14474b.mo41320f(string, objArr);
            return;
        }
        if (iM35485e == 1) {
            interfaceC14474b.mo41317c(string, objArr);
            return;
        }
        if (iM35485e == 2) {
            interfaceC14474b.mo41335u(string, objArr);
        } else if (iM35485e == 3) {
            interfaceC14474b.mo41322h(string, objArr);
        } else {
            if (iM35485e != 4) {
                return;
            }
            interfaceC14474b.mo41326l(string, objArr);
        }
    }

    @Override // p398p9.InterfaceC28989m
    /* JADX INFO: renamed from: c */
    public Object mo36141c(Uri uri, C22629m c22629m) {
        long j7;
        C14261c c14261c = (C14261c) ((C14263e) this.f76422x).mo36141c(uri, c22629m);
        List list = (List) this.f76423y;
        if (list == null || list.isEmpty()) {
            return c14261c;
        }
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new C34601k0());
        ArrayList arrayList = new ArrayList();
        long j13 = 0;
        int i13 = 0;
        while (true) {
            if (i13 >= c14261c.f52074m.size()) {
                break;
            }
            if (((C34601k0) linkedList.peek()).f145684w != i13) {
                long jM40729b = c14261c.m40729b(i13);
                if (jM40729b != -9223372036854775807L) {
                    j13 += jM40729b;
                }
            } else {
                C14266h c14266hM40728a = c14261c.m40728a(i13);
                List list2 = c14266hM40728a.f52096c;
                C34601k0 c34601k0 = (C34601k0) linkedList.poll();
                int i14 = c34601k0.f145684w;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i15 = c34601k0.f145685x;
                    C14259a c14259a = (C14259a) list2.get(i15);
                    List list3 = c14259a.f52054c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((AbstractC14271m) list3.get(c34601k0.f145686y));
                        c34601k0 = (C34601k0) linkedList.poll();
                        if (c34601k0.f145684w != i14) {
                            break;
                        }
                    } while (c34601k0.f145685x == i15);
                    j7 = j13;
                    arrayList2.add(new C14259a(c14259a.f52052a, c14259a.f52053b, arrayList3, c14259a.f52055d, c14259a.f52056e, c14259a.f52057f));
                    if (c34601k0.f145684w != i14) {
                        break;
                    }
                    j13 = j7;
                }
                linkedList.addFirst(c34601k0);
                arrayList.add(new C14266h(c14266hM40728a.f52094a, c14266hM40728a.f52095b - j7, arrayList2, c14266hM40728a.f52097d));
                j13 = j7;
            }
            i13++;
        }
        long j14 = j13;
        long j15 = c14261c.f52063b;
        return new C14261c(c14261c.f52062a, j15 != -9223372036854775807L ? j15 - j14 : -9223372036854775807L, c14261c.f52064c, c14261c.f52065d, c14261c.f52066e, c14261c.f52067f, c14261c.f52068g, c14261c.f52069h, c14261c.f52073l, c14261c.f52070i, c14261c.f52071j, c14261c.f52072k, arrayList);
    }

    @Override // p499t9.InterfaceC33630g
    /* JADX INFO: renamed from: d */
    public void mo1689d() {
        C38059n c38059n = (C38059n) this.f76423y;
        byte[] bArr = AbstractC38065t.f163033c;
        c38059n.getClass();
        c38059n.m121844D(bArr.length, bArr);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // e53.InterfaceC12744c
    /* JADX INFO: renamed from: e */
    public Object mo31821e(AbstractC32269c abstractC32269c) {
        C12742a c12742a;
        C20378c c20378c;
        if (abstractC32269c instanceof C12742a) {
            c12742a = (C12742a) abstractC32269c;
            int i13 = c12742a.f43621z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12742a.f43621z = i13 - Integer.MIN_VALUE;
            } else {
                c12742a = new C12742a(this, abstractC32269c);
            }
        } else {
            c12742a = new C12742a(this, abstractC32269c);
        }
        Object objMo31821e = c12742a.f43619x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12742a.f43621z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo31821e);
            InterfaceC12744c interfaceC12744c = (InterfaceC12744c) this.f76422x;
            c12742a.f43618w = this;
            c12742a.f43621z = 1;
            objMo31821e = interfaceC12744c.mo31821e(c12742a);
            if (objMo31821e == enumC31071a) {
                return enumC31071a;
            }
            c20378c = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c20378c = c12742a.f43618w;
            AbstractC34132o.m107864I(objMo31821e);
        }
        String token = (String) objMo31821e;
        C12745d c12745d = (C12745d) c20378c.f76423y;
        c12745d.getClass();
        AbstractC22676k.m65750j(token, "token");
        c12745d.f43626a = token;
        return objMo31821e;
    }

    @Override // ig3.InterfaceC18475a
    /* JADX INFO: renamed from: f */
    public InterfaceC18475a mo53319f(Object obj, String str) {
        C0684i0 c0684i0 = (C0684i0) this.f76422x;
        if (((ArrayList) c0684i0.f2447z) == null) {
            c0684i0.f2447z = new ArrayList(4);
        }
        ((ArrayList) c0684i0.f2447z).add(new C15829b(str, obj));
        return this;
    }

    @Override // ig3.InterfaceC18475a
    /* JADX INFO: renamed from: g */
    public InterfaceC18475a mo53320g(C29158c c29158c) {
        ((C0684i0) this.f76422x).f2446y = (String) c29158c.get();
        return this;
    }

    @Override // k83.InterfaceC22297a
    public Object get() {
        return new C17418e((Context) ((C14289a) this.f76422x).f52186x, (C15990r) ((C17417d) this.f76423y).get());
    }

    @Override // f93.InterfaceC14291c
    public Object getValue(Object obj, InterfaceC21493z property) {
        AbstractC22676k.m65750j(property, "property");
        Object obj2 = ((C0403b) this.f76423y).get();
        AbstractC22676k.m65747g(obj2);
        return obj2;
    }

    @Override // p500tb.InterfaceC33688b
    /* JADX INFO: renamed from: h */
    public InterfaceC33687a mo11169h(String fileName) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        AbstractC22676k.m65750j(fileName, "fileName");
        C1812n0 c1812n0 = (C1812n0) this.f76423y;
        if (!fileName.equals(":memory:")) {
            fileName = c1812n0.f7120c.f7042a.getDatabasePath(fileName).getAbsolutePath();
            AbstractC22676k.m65747g(fileName);
        }
        boolean z4 = true;
        C22318b c22318b = new C22318b(fileName, (c1812n0.f7118a || c1812n0.f7119b || fileName.equals(":memory:")) ? false : true);
        ReentrantLock reentrantLock = c22318b.f87092a;
        reentrantLock.lock();
        C30352d c30352d = c22318b.f87093b;
        if (c30352d != null) {
            try {
                c30352d.m92823x();
            } catch (Throwable th3) {
                th = th3;
                z4 = false;
            }
        }
        try {
            try {
                if (c1812n0.f7119b) {
                    throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                }
                InterfaceC33687a interfaceC33687aMo11169h = ((InterfaceC33688b) this.f76422x).mo11169h(fileName);
                if (c1812n0.f7118a) {
                    C1812n0.m5440b(interfaceC33687aMo11169h);
                    if (c1812n0.f7120c.f7048g == EnumC1827s0.f7172y) {
                        AbstractC17269i.m48864K("PRAGMA synchronous = NORMAL", interfaceC33687aMo11169h);
                    } else {
                        AbstractC17269i.m48864K("PRAGMA synchronous = FULL", interfaceC33687aMo11169h);
                    }
                    c1812n0.f7121d.onOpen(interfaceC33687aMo11169h);
                } else {
                    try {
                        c1812n0.f7119b = true;
                        C1812n0.m5439a(c1812n0, interfaceC33687aMo11169h);
                        c1812n0.f7119b = false;
                    } catch (Throwable th4) {
                        c1812n0.f7119b = false;
                        throw th4;
                    }
                }
                if (c30352d != null && (fileChannel2 = (FileChannel) c30352d.f124536y) != null) {
                    try {
                        fileChannel2.close();
                        c30352d.f124536y = null;
                    } catch (Throwable th5) {
                        c30352d.f124536y = null;
                        throw th5;
                    }
                }
                reentrantLock.unlock();
                return interfaceC33687aMo11169h;
            } catch (Throwable th6) {
                if (c30352d != null && (fileChannel = (FileChannel) c30352d.f124536y) != null) {
                    try {
                        fileChannel.close();
                    } finally {
                        c30352d.f124536y = null;
                    }
                }
                throw th6;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        th = th7;
        try {
            if (z4) {
                throw th;
            }
            throw new IllegalStateException("Unable to open database '" + fileName + "'. Was a proper path / name used in Room's database builder?", th);
        } catch (Throwable th8) {
            reentrantLock.unlock();
            throw th8;
        }
    }

    @Override // gl.InterfaceC15947l
    /* JADX INFO: renamed from: i */
    public void mo45011i(InterfaceC0955b interfaceC0955b, Bitmap bitmap) throws IOException {
        IOException iOException = ((C33905d) this.f76423y).f142080x;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            interfaceC0955b.mo2433h(bitmap);
            throw iOException;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00e9  */
    @Override // p499t9.InterfaceC33630g
    /* JADX INFO: renamed from: j */
    public C33628f mo1695j(InterfaceC33646o interfaceC33646o, long j7) {
        int iM1657f;
        long position = interfaceC33646o.getPosition();
        int iMin = (int) Math.min(20000L, interfaceC33646o.getLength() - position);
        C38059n c38059n = (C38059n) this.f76423y;
        c38059n.m121843C(iMin);
        interfaceC33646o.mo3103p(c38059n.f163017a, 0, iMin);
        int i13 = -1;
        int i14 = -1;
        long j13 = -9223372036854775807L;
        while (c38059n.m121848a() >= 4) {
            if (C0668a0.m1657f(c38059n.f163018b, c38059n.f163017a) != 442) {
                c38059n.m121847G(1);
            } else {
                c38059n.m121847G(4);
                long jM1659c = C0670b0.m1659c(c38059n);
                if (jM1659c != -9223372036854775807L) {
                    long jM121883b = ((C38064s) this.f76422x).m121883b(jM1659c);
                    if (jM121883b > j7) {
                        return j13 == -9223372036854775807L ? new C33628f(-1, jM121883b, position) : new C33628f(0, -9223372036854775807L, position + ((long) i14));
                    }
                    if (jM121883b + 100000 > j7) {
                        return new C33628f(0, -9223372036854775807L, position + ((long) c38059n.f163018b));
                    }
                    j13 = jM121883b;
                    i14 = c38059n.f163018b;
                }
                int i15 = c38059n.f163019c;
                if (c38059n.m121848a() >= 10) {
                    c38059n.m121847G(9);
                    int iM121867t = c38059n.m121867t() & 7;
                    if (c38059n.m121848a() >= iM121867t) {
                        c38059n.m121847G(iM121867t);
                        if (c38059n.m121848a() >= 4) {
                            if (C0668a0.m1657f(c38059n.f163018b, c38059n.f163017a) != 443) {
                                while (c38059n.m121848a() >= 4) {
                                    iM1657f = C0668a0.m1657f(c38059n.f163018b, c38059n.f163017a);
                                    if (iM1657f == 442) {
                                        break;
                                    }
                                    break;
                                }
                            }
                            c38059n.m121847G(4);
                            int iM121873z = c38059n.m121873z();
                            if (c38059n.m121848a() < iM121873z) {
                                c38059n.m121846F(i15);
                            } else {
                                c38059n.m121847G(iM121873z);
                                while (c38059n.m121848a() >= 4) {
                                    iM1657f = C0668a0.m1657f(c38059n.f163018b, c38059n.f163017a);
                                    if (iM1657f == 442 || iM1657f == 441 || (iM1657f >>> 8) != 1) {
                                        break;
                                    }
                                    c38059n.m121847G(4);
                                    if (c38059n.m121848a() < 2) {
                                        c38059n.m121846F(i15);
                                        break;
                                    }
                                    c38059n.m121846F(Math.min(c38059n.f163019c, c38059n.f163018b + c38059n.m121873z()));
                                }
                            }
                        } else {
                            c38059n.m121846F(i15);
                        }
                    } else {
                        c38059n.m121846F(i15);
                    }
                } else {
                    c38059n.m121846F(i15);
                }
                i13 = c38059n.f163018b;
            }
        }
        return j13 != -9223372036854775807L ? new C33628f(-2, j13, position + ((long) i13)) : C33628f.f140366d;
    }

    @Override // gl.InterfaceC15947l
    /* JADX INFO: renamed from: k */
    public void mo45012k() {
        C15956u c15956u = (C15956u) this.f76422x;
        synchronized (c15956u) {
            c15956u.f60387y = c15956u.f60385w.length;
        }
    }

    @Override // io.sentry.internal.debugmeta.InterfaceC20376a
    /* JADX INFO: renamed from: l */
    public List mo16064l() {
        InterfaceC20602v0 interfaceC20602v0 = (InterfaceC20602v0) this.f76422x;
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = ((ClassLoader) this.f76423y).getResources("sentry-debug-meta.properties");
            while (resources.hasMoreElements()) {
                URL urlNextElement = resources.nextElement();
                try {
                    InputStream inputStreamOpenStream = urlNextElement.openStream();
                    try {
                        Properties properties = new Properties();
                        properties.load(inputStreamOpenStream);
                        arrayList.add(properties);
                        interfaceC20602v0.mo16066m(EnumC20436n5.INFO, "Debug Meta Data Properties loaded from %s", urlNextElement);
                        if (inputStreamOpenStream != null) {
                            inputStreamOpenStream.close();
                        }
                    } catch (Throwable th3) {
                        if (inputStreamOpenStream != null) {
                            try {
                                inputStreamOpenStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                } catch (RuntimeException e5) {
                    interfaceC20602v0.mo16058i(EnumC20436n5.ERROR, e5, "%s file is malformed.", urlNextElement);
                }
            }
        } catch (IOException e13) {
            interfaceC20602v0.mo16058i(EnumC20436n5.ERROR, e13, "Failed to load %s", "sentry-debug-meta.properties");
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        interfaceC20602v0.mo16066m(EnumC20436n5.INFO, "No %s file was found.", "sentry-debug-meta.properties");
        return null;
    }

    /* JADX INFO: renamed from: m */
    public C5143h m56584m() {
        ((C5158m) this.f76422x).m16266g0();
        return new C5143h((byte[]) this.f76423y);
    }

    /* JADX INFO: renamed from: n */
    public AbstractC2829f[] m56585n(Handler handler, SurfaceHolderCallbackC2821c0 surfaceHolderCallbackC2821c0, SurfaceHolderCallbackC2821c0 surfaceHolderCallbackC2821c1, SurfaceHolderCallbackC2821c0 surfaceHolderCallbackC2821c2, SurfaceHolderCallbackC2821c0 surfaceHolderCallbackC2821c3) {
        ArrayList arrayList = new ArrayList();
        Context context = (Context) this.f76422x;
        C31079d c31079d = new C31079d(context);
        C15982j c15982j = (C15982j) this.f76423y;
        c31079d.f128136c = c15982j;
        c31079d.f128137d = 5000L;
        c31079d.f128138e = handler;
        c31079d.f128139f = surfaceHolderCallbackC2821c0;
        c31079d.f128140g = 50;
        AbstractC35849g.m113807i(!c31079d.f128135b);
        Handler handler2 = c31079d.f128138e;
        AbstractC35849g.m113807i((handler2 == null && c31079d.f128139f == null) || !(handler2 == null || c31079d.f128139f == null));
        c31079d.f128135b = true;
        arrayList.add(new C31080e(c31079d));
        C11799p c11799p = new C11799p(context);
        AbstractC35849g.m113807i(!c11799p.f38300a);
        c11799p.f38300a = true;
        if (((C0352d) c11799p.f38303d) == null) {
            c11799p.f38303d = new C0352d(new InterfaceC35788e[0]);
        }
        if (((C30352d) c11799p.f38306g) == null) {
            c11799p.f38306g = new C30352d(context);
        }
        arrayList.add(new C11780a0((Context) this.f76422x, c15982j, handler, surfaceHolderCallbackC2821c1, new C11807x(c11799p)));
        arrayList.add(new C26470d(surfaceHolderCallbackC2821c2, handler.getLooper()));
        Looper looper = handler.getLooper();
        arrayList.add(new C21427b(surfaceHolderCallbackC2821c3, looper));
        arrayList.add(new C21427b(surfaceHolderCallbackC2821c3, looper));
        arrayList.add(new C32277b());
        arrayList.add(new C17022f(InterfaceC17019c.f65416j));
        return (AbstractC2829f[]) arrayList.toArray(new AbstractC2829f[0]);
    }

    /* JADX INFO: renamed from: o */
    public void m56586o(InterfaceC37369k interfaceC37369k, C0690l0 c0690l0) {
        InterfaceC37377s[] interfaceC37377sArr = (InterfaceC37377s[]) this.f76423y;
        for (int i13 = 0; i13 < interfaceC37377sArr.length; i13++) {
            c0690l0.m1733c();
            c0690l0.m1738h();
            InterfaceC37377s interfaceC37377sMo3102o = interfaceC37369k.mo3102o(c0690l0.f2494e, 3);
            C31521c0 c31521c0 = (C31521c0) ((List) this.f76422x).get(i13);
            String str = c31521c0.f130077L;
            boolean z4 = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            String strValueOf = String.valueOf(str);
            AbstractC24543a.m71570f(z4, strValueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(strValueOf) : new String("Invalid closed caption mime type provided: "));
            String str2 = c31521c0.f130098w;
            if (str2 == null) {
                c0690l0.m1738h();
                str2 = (String) c0690l0.f2495f;
            }
            C31518b0 c31518b0 = new C31518b0();
            c31518b0.f130037a = str2;
            c31518b0.f130047k = str;
            c31518b0.f130040d = c31521c0.f130101z;
            c31518b0.f130039c = c31521c0.f130100y;
            c31518b0.f130035C = c31521c0.f130095d0;
            c31518b0.f130049m = c31521c0.f130079N;
            interfaceC37377sMo3102o.mo102730a(new C31521c0(c31518b0));
            interfaceC37377sArr[i13] = interfaceC37377sMo3102o;
        }
    }

    @Override // o23.InterfaceC27471a
    public void onResult(AbstractC26205h it) {
        AbstractC22676k.m65750j(it, "it");
        if (((C0745a) ((C27478h) this.f76423y).f110691d).m1812a()) {
            it = null;
        }
        if (it != null) {
            ((InterfaceC27471a) this.f76422x).onResult(it);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m56587p(C2832g c2832g) {
        synchronized (c2832g) {
        }
        Handler handler = (Handler) this.f76422x;
        if (handler != null) {
            handler.post(new RunnableC0533c(18, this, c2832g));
        }
    }

    /* JADX INFO: renamed from: q */
    public void m56588q(String str, String str2, Function1 function1) {
        LinkedHashMap linkedHashMap = ((C3278p) this.f76423y).f12803a;
        C26528o c26528o = new C26528o(this, str, str2);
        function1.invoke(c26528o);
        String internalName = (String) this.f76422x;
        ArrayList arrayList = c26528o.f105462b;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((C23465k) it.next()).f92937w);
        }
        String ret = (String) c26528o.f105463c.f92937w;
        AbstractC22676k.m65750j(ret, "ret");
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str);
        sb4.append('(');
        sb4.append(AbstractC25265s.m74110N0(arrayList2, "", null, null, C27776s.f111973w, 30));
        sb4.append(')');
        if (ret.length() > 1) {
            ret = AbstractC31061c.m95633i(';', "L", ret);
        }
        sb4.append(ret);
        String jvmDescriptor = sb4.toString();
        AbstractC22676k.m65750j(internalName, "internalName");
        AbstractC22676k.m65750j(jvmDescriptor, "jvmDescriptor");
        String strM31992k = AbstractC11895b.m31992k('.', internalName, jvmDescriptor);
        C26530q c26530q = (C26530q) c26528o.f105463c.f92938x;
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList3.add((C26530q) ((C23465k) it3.next()).f92938x);
        }
        linkedHashMap.put(strM31992k, new C26526m(c26530q, arrayList3, c26528o.f105461a));
    }

    /* JADX INFO: renamed from: r */
    public RtpTransceiver m56589r(PublishOption publishOption) {
        C18058b c18058b = (C18058b) ((Map) this.f76422x).get(m56577y(publishOption));
        if (c18058b != null) {
            return c18058b.f70144b;
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public C5158m m56590s() {
        return (C5158m) this.f76422x;
    }

    /* JADX INFO: renamed from: t */
    public C2345k m56591t() {
        return (C2345k) ((C23470p) this.f76422x).getValue();
    }

    public String toString() {
        switch (this.f76421w) {
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return "Bounds{lower=" + ((C35643b) this.f76422x) + " upper=" + ((C35643b) this.f76423y) + "}";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: u */
    public int m56592u(Context context, String str) {
        AbstractC22676k.m65750j(context, "context");
        if (!(str.equals("ongoing_call") ? true : str.equals("outgoing_call"))) {
            if (Build.VERSION.SDK_INT >= 34) {
                return DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            }
            return 4;
        }
        Set set = (Set) this.f76422x;
        Set set2 = set;
        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                String str2 = (String) this.f76423y.get(Integer.valueOf(((Number) it.next()).intValue()));
                if (str2 != null && AbstractC32122c.checkSelfPermission(context, str2) != 0) {
                    if (Build.VERSION.SDK_INT >= 34) {
                        return DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    return 4;
                }
            }
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 30) {
            if (i13 != 29) {
                return 0;
            }
            if (set.contains(4)) {
                return 4;
            }
            return DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        }
        Iterator it3 = set2.iterator();
        if (!it3.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it3.next();
        while (it3.hasNext()) {
            next = Integer.valueOf(((Number) next).intValue() | ((Number) it3.next()).intValue());
        }
        return ((Number) next).intValue();
    }

    /* JADX INFO: renamed from: v */
    public synchronized Map m56593v() {
        try {
            if (((Map) this.f76423y) == null) {
                this.f76423y = Collections.unmodifiableMap(new HashMap((HashMap) this.f76422x));
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return (Map) this.f76423y;
    }

    /* JADX INFO: renamed from: w */
    public C39230b m56594w() {
        return (C39230b) ((C23470p) this.f76423y).getValue();
    }

    /* JADX INFO: renamed from: x */
    public ArrayList m56595x() {
        List listM74093D1 = AbstractC25265s.m74093D1(((Map) this.f76422x).values());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM74093D1) {
            MediaStreamTrack mediaStreamTrackTrack = ((C18058b) obj).f70144b.getSender().track();
            if (mediaStreamTrackTrack != null && !mediaStreamTrackTrack.isDisposed()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // p500tb.InterfaceC33688b
    /* JADX INFO: renamed from: z */
    public boolean mo11177z() {
        return ((InterfaceC33688b) this.f76422x).mo11177z();
    }

    public /* synthetic */ C20378c(int i13, Object obj, Object obj2) {
        this.f76421w = i13;
        this.f76422x = obj;
        this.f76423y = obj2;
    }

    public C20378c(InterfaceC2994c0 scope) {
        this.f76421w = 15;
        AbstractC22676k.m65750j(scope, "scope");
        this.f76422x = scope;
    }

    public C20378c(InterfaceC12744c tokenProvider, C12745d tokenRepository) {
        this.f76421w = 11;
        AbstractC22676k.m65750j(tokenProvider, "tokenProvider");
        AbstractC22676k.m65750j(tokenRepository, "tokenRepository");
        this.f76422x = tokenProvider;
        this.f76423y = tokenRepository;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20378c(InterfaceC4339a interfaceC4339a) {
        this.f76421w = 1;
        this.f76422x = (AbstractC22680m) interfaceC4339a;
        this.f76423y = new C0403b(this, 0);
    }

    public C20378c(InterfaceC14544a interfaceC14544a) {
        this.f76421w = 3;
        this.f76422x = null;
        this.f76423y = interfaceC14544a;
        try {
            Field declaredField = C0230n0.class.getDeclaredField("layoutDelegate");
            this.f76422x = declaredField;
            declaredField.setAccessible(true);
        } catch (Exception unused) {
            interfaceC14544a.info("Could not find LayoutNode.layoutDelegate field");
        }
    }

    public C20378c(InterfaceC20602v0 interfaceC20602v0) {
        this.f76421w = 0;
        ClassLoader classLoader = C20378c.class.getClassLoader();
        this.f76422x = interfaceC20602v0;
        this.f76423y = AbstractC12314q.m34337q(classLoader);
    }

    public C20378c(int i13, byte b) {
        this.f76421w = i13;
        switch (i13) {
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                this.f76422x = Collections.synchronizedMap(new LinkedHashMap());
                this.f76423y = Collections.synchronizedMap(new LinkedHashMap());
                break;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                this.f76422x = new HashMap();
                break;
            case 24:
                this.f76422x = new Rect();
                this.f76423y = new Rect();
                break;
            case 28:
                this.f76422x = AbstractC25260n.m74059b1(new Integer[]{4, 64, 128});
                this.f76423y = AbstractC25247g0.m73990Y(new C23465k(64, "android.permission.CAMERA"), new C23465k(128, "android.permission.RECORD_AUDIO"), new C23465k(2, null), new C23465k(4, null));
                break;
            default:
                this.f76422x = AbstractC1772c1.m5382S(this, "Video:SocketState");
                this.f76423y = AbstractC30060g.m92088H(new C0271z0(6, C15504i.f58175a, this));
                break;
        }
    }

    public C20378c(List list) {
        this.f76421w = 14;
        this.f76422x = list;
        this.f76423y = new InterfaceC37377s[list.size()];
    }

    public C20378c(InterfaceC14474b interfaceC14474b, int i13) {
        this.f76421w = 20;
        this.f76423y = interfaceC14474b;
        C0684i0 c0684i0 = new C0684i0(4, false);
        c0684i0.f2445x = i13;
        this.f76422x = c0684i0;
    }

    public C20378c(byte[] bArr, byte[] bArr2) {
        this.f76421w = 21;
        Objects.requireNonNull(bArr);
        this.f76422x = bArr;
        Objects.requireNonNull(bArr2);
        this.f76423y = bArr2;
    }

    public C20378c(C1812n0 c1812n0, InterfaceC33688b actual) {
        this.f76421w = 4;
        AbstractC22676k.m65750j(actual, "actual");
        this.f76423y = c1812n0;
        this.f76422x = actual;
    }

    public C20378c(C38064s c38064s) {
        this.f76421w = 2;
        this.f76422x = c38064s;
        this.f76423y = new C38059n();
    }

    public C20378c(Context context) {
        this.f76421w = 5;
        this.f76422x = context;
        this.f76423y = new C15982j(context, (byte) 0);
    }

    public C20378c(WindowInsetsAnimation.Bounds bounds) {
        this.f76421w = 17;
        this.f76422x = C16860b1.m47486f(bounds);
        this.f76423y = C16860b1.m47485e(bounds);
    }

    public C20378c(C3278p c3278p, String className) {
        this.f76421w = 26;
        AbstractC22676k.m65750j(className, "className");
        this.f76423y = c3278p;
        this.f76422x = className;
    }

    public C20378c(ComponentCallbacks2C4966h componentCallbacks2C4966h, C13968p1 c13968p1) {
        this.f76421w = 8;
        this.f76423y = componentCallbacks2C4966h;
        this.f76422x = c13968p1;
    }

    public C20378c(int i13) {
        this.f76421w = 9;
        byte[] bArr = new byte[i13];
        this.f76423y = bArr;
        this.f76422x = new C5158m(bArr, i13);
    }
}
