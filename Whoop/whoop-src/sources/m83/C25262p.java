package m83;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.health.platform.client.proto.C1533u;
import bc3.C3033m;
import bc3.InterfaceC3025k;
import c93.InterfaceC4339a;
import com.whoop.data.repositories.LanguageRepository;
import com.whoop.metrics.worker.BaseReportingWorker;
import e93.AbstractC12889b;
import j93.InterfaceC21461d;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptorKt;
import l83.C23454a0;
import l83.C23465k;
import ld1.AbstractC23864c;
import m92.AbstractC25319b;
import mi1.C25577f;
import ne3.AbstractC26632p;
import ne3.C26611e0;
import o72.C27644e;
import oe3.C27887g;
import or2.C28205u0;
import p002a0.C0059w0;
import p007a6.InterfaceC0422g;
import p037bu.C3632c;
import p088dc.AbstractC11894a;
import p097ds.AbstractC12314q;
import p249jc.AbstractC21598x;
import p249jc.C21567b;
import p390p1.C28655q;
import p390p1.C28688y1;
import p390p1.EnumC28681w1;
import p395p6.C28889j0;
import p395p6.C28901n0;
import p399pb.C29044a;
import p399pb.InterfaceC29049f;
import p423qf.C30318b;
import p446r1.C30849c;
import p459rf.C31344o;
import p459rf.C31345p;
import p459rf.C31347r;
import p547v8.AbstractC35785b;
import p549vb.C35863h;
import p549vb.C35864i;
import p571w3.C36766b;
import p571w3.InterfaceC36779o;
import p579wc.C37074c;
import p579wc.C37105m0;
import p634y1.C39029b;
import p634y1.C39036i;
import p634y1.InterfaceC39037j;
import p668z1.C39972u;
import p668z1.C39973v;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import p715kotlin.jvm.internal.C22659b0;
import pf.InterfaceC29123a;
import rm0.C31585c;
import t92.AbstractC33664b;
import ud3.C34826l0;
import um1.AbstractC35086d;
import uo1.C35141b;
import vf3.AbstractC35952b;
import vm2.C36159d;
import wc3.C37140e;
import x30.AbstractC37926s0;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import yc3.C39438b;
import yc3.C39439c;
import yc3.C39444h;
import yc3.InterfaceC39443g;

/* JADX INFO: renamed from: m83.p */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C25262p implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f99153w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f99154x;

    public /* synthetic */ C25262p(Object obj, int i13) {
        this.f99153w = i13;
        this.f99154x = obj;
    }

    /* JADX WARN: Code duplicated, block: B:188:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0078 A[Catch: all -> 0x0069, LOOP:2: B:15:0x0034->B:30:0x0078, LOOP_END, TryCatch #2 {all -> 0x0069, blocks: (B:23:0x0063, B:27:0x006d, B:32:0x0081, B:30:0x0078), top: B:177:0x0063 }] */
    @Override // c93.InterfaceC4339a
    public final Object invoke() throws Throwable {
        int iM125893l0;
        C23465k c23465k;
        C23465k c23465k2;
        InterfaceC3025k interfaceC3025kM87291w;
        InterfaceC0422g interfaceC0422g;
        C35863h c35863h;
        Object obj;
        int i13 = 8;
        switch (this.f99153w) {
            case 0:
                return AbstractC22681m0.m65777h((Object[]) this.f99154x);
            case 1:
                return ((Iterable) this.f99154x).iterator();
            case 2:
                return AbstractC25319b.m74343t((AbstractC25319b) this.f99154x);
            case 3:
                return C25577f.m75206j((C25577f) this.f99154x);
            case 4:
                C27887g c27887g = (C27887g) this.f99154x;
                ClassLoader classLoader = c27887g.f112445y;
                AbstractC26632p abstractC26632p = c27887g.f112446z;
                Enumeration<URL> resources = classLoader.getResources("");
                AbstractC22676k.m65749i(resources, "getResources(...)");
                ArrayList<URL> list = Collections.list(resources);
                AbstractC22676k.m65749i(list, "list(...)");
                ArrayList arrayList = new ArrayList();
                for (URL url : list) {
                    AbstractC22676k.m65747g(url);
                    if (AbstractC22676k.m65745e(url.getProtocol(), "file")) {
                        String str = C26611e0.f105848x;
                        c23465k2 = new C23465k(abstractC26632p, C21567b.m60607p(new File(url.toURI())));
                    } else {
                        c23465k2 = null;
                    }
                    if (c23465k2 != null) {
                        arrayList.add(c23465k2);
                    }
                }
                Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                AbstractC22676k.m65749i(resources2, "getResources(...)");
                ArrayList<URL> list2 = Collections.list(resources2);
                AbstractC22676k.m65749i(list2, "list(...)");
                ArrayList arrayList2 = new ArrayList();
                for (URL url2 : list2) {
                    AbstractC22676k.m65747g(url2);
                    String string = url2.toString();
                    AbstractC22676k.m65749i(string, "toString(...)");
                    if (AbstractC39421y.m125930O(string, "jar:file:", false) && (iM125893l0 = AbstractC39414r.m125893l0(string, "!", 0, 6)) != -1) {
                        String str2 = C26611e0.f105848x;
                        String strSubstring = string.substring(4, iM125893l0);
                        AbstractC22676k.m65749i(strSubstring, "substring(...)");
                        c23465k = new C23465k(AbstractC35785b.m113389L(C21567b.m60607p(new File(URI.create(strSubstring))), abstractC26632p, new C27644e(9)), C27887g.f112443F);
                    } else {
                        c23465k = null;
                    }
                    if (c23465k != null) {
                        arrayList2.add(c23465k);
                    }
                }
                return AbstractC25265s.m74129g1(arrayList, arrayList2);
            case 5:
                return C28205u0.m85375d((LanguageRepository) this.f99154x);
            case 6:
                return BaseReportingWorker.m22892f((BaseReportingWorker) this.f99154x);
            case 7:
                return ((C28655q) this.f99154x).m87167n();
            case 8:
                C28688y1 c28688y1 = (C28688y1) this.f99154x;
                synchronized (c28688y1.f116037c) {
                    interfaceC3025kM87291w = c28688y1.m87291w();
                    if (((EnumC28681w1) c28688y1.f116055u.getValue()).compareTo(EnumC28681w1.f116015x) <= 0) {
                        throw AbstractC11894a.m31955d("Recomposer shutdown; frame clock awaiter will never resume", c28688y1.f116039e);
                    }
                }
                if (interfaceC3025kM87291w != null) {
                    ((C3033m) interfaceC3025kM87291w).resumeWith(C23454a0.f92919a);
                }
                return C23454a0.f92919a;
            case 9:
                C28901n0 c28901n0 = (C28901n0) this.f99154x;
                synchronized (C28901n0.f116983d) {
                    try {
                        interfaceC0422g = C28901n0.f116985f;
                        if (interfaceC0422g == null) {
                            File fileM60684i0 = AbstractC21598x.m60684i0(c28901n0.f116987a, "GlanceAppWidgetManager");
                            File file = fileM60684i0.exists() ? fileM60684i0 : null;
                            if (file != null) {
                                file.delete();
                            }
                            interfaceC0422g = (InterfaceC0422g) C28901n0.f116984e.getValue(c28901n0.f116987a, C28889j0.f116940a[0]);
                            C28901n0.f116985f = interfaceC0422g;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return interfaceC0422g;
            case 10:
                InterfaceC29049f interfaceC29049f = (InterfaceC29049f) this.f99154x;
                interfaceC29049f.getLifecycle().mo4986a(new C29044a(interfaceC29049f, 0));
                return C23454a0.f92919a;
            case 11:
                return (InterfaceC29123a) this.f99154x;
            case 12:
                C31344o c31344o = (C31344o) this.f99154x;
                C34826l0 c34826l0 = c31344o.f128975E;
                C31347r c31347r = c31344o.f128978z;
                C30318b c30318b = c31344o.f128976F;
                return c34826l0 != null ? AbstractC37926s0.m121472j(c34826l0, c30318b, c31347r) : AbstractC37926s0.m121473k(c31347r, c30318b, null);
            case 13:
                return C31585c.m97327M((Map) this.f99154x);
            case 14:
                return Integer.valueOf(AbstractC33664b.m106353n2((AbstractC33664b) this.f99154x));
            case 15:
                return (List) this.f99154x;
            case 16:
                return AbstractC35086d.m110963s((AbstractC23864c) this.f99154x);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C35864i c35864i = (C35864i) this.f99154x;
                String str3 = c35864i.f152691x;
                if (str3 == null || !c35864i.f152693z) {
                    c35863h = new C35863h(c35864i.f152690w, c35864i.f152691x, new C3632c(28), c35864i.f152692y, c35864i.f152687E);
                } else {
                    Context context = c35864i.f152690w;
                    AbstractC22676k.m65750j(context, "context");
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    AbstractC22676k.m65749i(noBackupFilesDir, "getNoBackupFilesDir(...)");
                    c35863h = new C35863h(c35864i.f152690w, new File(noBackupFilesDir, str3).getAbsolutePath(), new C3632c(28), c35864i.f152692y, c35864i.f152687E);
                }
                c35863h.setWriteAheadLoggingEnabled(c35864i.f152689G);
                return c35863h;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return this.f99154x;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C36159d.m115069n0((C22659b0) this.f99154x);
            case 20:
                return C36159d.m115068n((AbstractActivityC1340r0) this.f99154x);
            case 21:
                return Float.valueOf(((C36766b) ((InterfaceC36779o) this.f99154x)).f157334b);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC12314q.m34309A(new C35141b((C37074c) this.f99154x, 16));
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC12314q.m34309A(new C35141b((C37105m0) this.f99154x, 17));
            case 24:
                C37140e c37140e = (C37140e) this.f99154x;
                C39444h c39444hM114196d = AbstractC35952b.m114196d("kotlinx.serialization.Polymorphic", C39439c.f169688a, new InterfaceC39443g[0], new C31345p(c37140e, 8));
                InterfaceC21461d context2 = c37140e.f158881a;
                AbstractC22676k.m65750j(context2, "context");
                return new C39438b(c39444hM114196d, context2);
            case 25:
                C39029b c39029b = (C39029b) this.f99154x;
                InterfaceC39037j interfaceC39037j = c39029b.f167992w;
                Object obj2 = c39029b.f167995z;
                if (obj2 != null) {
                    return interfaceC39037j.mo67322a(c39029b, obj2);
                }
                throw new IllegalArgumentException("Value should be initialized");
            case 26:
                C39036i c39036i = (C39036i) this.f99154x;
                Bundle bundleM36273g = AbstractC12889b.m36273g((C23465k[]) Arrays.copyOf(new C23465k[0], 0));
                c39036i.f168006x.m88296b(bundleM36273g);
                if (bundleM36273g.isEmpty()) {
                    return null;
                }
                return bundleM36273g;
            case 27:
                C39444h c39444h = (C39444h) this.f99154x;
                return Integer.valueOf(PluginGeneratedSerialDescriptorKt.hashCodeImpl(c39444h, c39444h.f169709k));
            default:
                C39973v c39973v = (C39973v) this.f99154x;
                while (true) {
                    Object obj3 = c39973v.f172500g;
                    synchronized (obj3) {
                        try {
                            if (c39973v.f172496c) {
                                obj = obj3;
                            } else {
                                c39973v.f172496c = true;
                                try {
                                    C30849c c30849c = c39973v.f172499f;
                                    Object[] objArr = c30849c.f127227w;
                                    int i14 = c30849c.f127229y;
                                    int i15 = 0;
                                    while (i15 < i14) {
                                        C39972u c39972u = (C39972u) objArr[i15];
                                        C0059w0 c0059w0 = c39972u.f172488g;
                                        Function1 function1 = c39972u.f172482a;
                                        Object[] objArr2 = c0059w0.f178b;
                                        long[] jArr = c0059w0.f177a;
                                        int length = jArr.length - 2;
                                        if (length >= 0) {
                                            int i16 = 0;
                                            while (true) {
                                                long j7 = jArr[i16];
                                                obj = obj3;
                                                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i17 = 8 - ((~(i16 - length)) >>> 31);
                                                    int i18 = 0;
                                                    while (i18 < i17) {
                                                        if ((j7 & 255) < 128) {
                                                            try {
                                                                function1.invoke(objArr2[(i16 << 3) + i18]);
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                c39973v.f172496c = false;
                                                                throw th;
                                                            }
                                                        }
                                                        j7 >>= i13;
                                                        i18++;
                                                        i13 = i13;
                                                    }
                                                    if (i17 == i13) {
                                                        if (i16 != length) {
                                                            i16++;
                                                            obj3 = obj;
                                                            i13 = 8;
                                                        }
                                                    }
                                                } else if (i16 != length) {
                                                    i16++;
                                                    obj3 = obj;
                                                    i13 = 8;
                                                }
                                            }
                                        } else {
                                            obj = obj3;
                                        }
                                        c0059w0.m137b();
                                        i15++;
                                        obj3 = obj;
                                        i13 = 8;
                                    }
                                    obj = obj3;
                                    try {
                                        c39973v.f172496c = false;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        throw th;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    obj = obj3;
                                }
                            }
                            if (!c39973v.m128203c()) {
                                return C23454a0.f92919a;
                            }
                            i13 = 8;
                        } catch (Throwable th7) {
                            th = th7;
                            obj = obj3;
                        }
                    }
                }
                break;
        }
    }
}
