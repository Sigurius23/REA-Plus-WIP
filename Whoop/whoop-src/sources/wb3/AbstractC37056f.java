package wb3;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.util.TypedValue;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.C1630u0;
import androidx.room.AbstractC1772c1;
import androidx.room.ExecutorC1834u1;
import bc3.C3023j1;
import bc3.C3033m;
import bg.AbstractC3210e;
import bg.C3208c;
import bg.C3209d;
import bg.C3213h;
import bg.C3216k;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cf.InterfaceC4534i;
import cf.InterfaceC4535j;
import cf.InterfaceC4536k;
import com.whoop.data.repositories.C6656c;
import com.whoop.service.network.model.UserSessionDto;
import dc3.C11933r;
import dc3.C11934s;
import dc3.C11935t;
import dc3.InterfaceC11936u;
import e93.AbstractC12889b;
import ec3.InterfaceC13058l;
import ge3.AbstractC15751g;
import hc3.C17191x;
import i63.AbstractC18157a;
import i63.C18168g;
import i63.C18173l;
import i63.C18185x;
import i63.C18186y;
import i63.InterfaceC18184w;
import i93.C18284j;
import io.sentry.C20269c;
import io.sentry.C20323e7;
import io.sentry.C20353h7;
import io.sentry.C20513q6;
import io.sentry.C20546t2;
import io.sentry.C20621w6;
import io.sentry.InterfaceC20308d1;
import io.sentry.InterfaceC20408l1;
import io.sentry.protocol.C20501v;
import j93.AbstractC21478l0;
import j93.InterfaceC21461d;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import l83.C23465k;
import l83.C23479y;
import m83.AbstractC25248h;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25256l;
import m83.C25271y;
import n83.C26460c;
import no.nordicsemi.android.dfu.DfuBaseService;
import o63.InterfaceC27622m;
import org.xmlpull.v1.XmlPullParserException;
import p005a3.C0237p;
import p014aj.C0928c;
import p014aj.C0929d;
import p026b2.C2310p;
import p026b2.C2311q;
import p026b2.C2312r;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p037bu.C3633d;
import p080d4.C11650i;
import p080d4.InterfaceC11651j;
import p088dc.AbstractC11895b;
import p114eb.AbstractC12958g1;
import p179h.AbstractC16349g;
import p179h.C16343a;
import p179h.C16344b;
import p179h.C16345c;
import p179h.C16351i;
import p208i2.InterfaceC17869a1;
import p218ic.C18357f0;
import p218ic.C18391y;
import p218ic.InterfaceC18355e0;
import p236j.AbstractC21071j;
import p236j.InterfaceC21072k;
import p249jc.AbstractC21598x;
import p267k.AbstractC22081b;
import p319m4.AbstractC25012a;
import p368og.C27909f;
import p368og.InterfaceC27910g;
import p368og.InterfaceC27913j;
import p390p1.AbstractC28683x;
import p390p1.C28626i2;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28599c;
import p390p1.InterfaceC28601c1;
import p482s7.AbstractC32237a;
import p505ts.AbstractC34132o;
import p634y1.AbstractC39038k;
import p692zt.C41113q;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import ud3.C34807d0;
import va3.AbstractC35844b;
import va3.AbstractC35846d;
import vf3.InterfaceC35951a;
import vg.InterfaceC35954a;
import w73.C36920f;
import xb3.AbstractC38176k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: wb3.f */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC37056f implements InterfaceC35954a, InterfaceC27913j {

    /* JADX INFO: renamed from: a */
    public static volatile C0929d f158547a;

    /* JADX INFO: renamed from: b */
    public static volatile C0928c f158548b;

    /* JADX INFO: renamed from: B */
    public static C18284j m118950B(Collection collection) {
        AbstractC22676k.m65750j(collection, "<this>");
        return new C18284j(0, collection.size() - 1, 1);
    }

    /* JADX INFO: renamed from: C */
    public static int m118951C(List list) {
        AbstractC22676k.m65750j(list, "<this>");
        return list.size() - 1;
    }

    /* JADX INFO: renamed from: D */
    public static final AbstractC1637w1 m118952D(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, InterfaceC35951a interfaceC35951a, InterfaceC21461d clazz, InterfaceC4339a owner, InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(abstractComponentCallbacksC1320m0, "<this>");
        AbstractC22676k.m65750j(clazz, "clazz");
        AbstractC22676k.m65750j(owner, "owner");
        return AbstractC21598x.m60668X(AbstractC29125c.m88492A(abstractComponentCallbacksC1320m0), interfaceC35951a, owner, clazz, null, interfaceC4339a);
    }

    /* JADX INFO: renamed from: E */
    public static File m118953E(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i13 = 0; i13 < 100; i13++) {
            File file = new File(cacheDir, str + i13);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: F */
    public static boolean m118954F(Context context) {
        AbstractC29125c.m88510S(context, "The application context is required.");
        return context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0;
    }

    /* JADX INFO: renamed from: G */
    public static final int m118955G(int i13, int i14) {
        return (i13 >> i14) & 31;
    }

    /* JADX INFO: renamed from: H */
    public static final boolean m118956H(String method) {
        AbstractC22676k.m65750j(method, "method");
        return method.equals("POST") || method.equals("PATCH") || method.equals("PUT") || method.equals("DELETE") || method.equals("MOVE");
    }

    /* JADX INFO: renamed from: I */
    public static final C18357f0 m118957I(final C18391y tracer, final String label, final ExecutorC1834u1 executor, final InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(tracer, "tracer");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(executor, "executor");
        final C1630u0 c1630u0 = new C1630u0(InterfaceC18355e0.f71475b);
        return new C18357f0(c1630u0, AbstractC21478l0.m60455z(new InterfaceC11651j() { // from class: ic.g0
            @Override // p080d4.InterfaceC11651j
            /* JADX INFO: renamed from: d */
            public final Object mo8621d(C11650i c11650i) {
                executor.execute(new RunnableC18361h0(tracer, label, interfaceC4339a, c1630u0, c11650i));
                return C23454a0.f92919a;
            }
        }));
    }

    /* JADX INFO: renamed from: J */
    public static List m118958J(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        AbstractC22676k.m65749i(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    /* JADX INFO: renamed from: K */
    public static List m118959K(Object... elements) {
        AbstractC22676k.m65750j(elements, "elements");
        return elements.length > 0 ? AbstractC25260n.m74048W(elements) : C25271y.f99162w;
    }

    /* JADX INFO: renamed from: L */
    public static List m118960L(Object obj) {
        return obj != null ? m118958J(obj) : C25271y.f99162w;
    }

    /* JADX INFO: renamed from: M */
    public static final Modifier m118961M(Composer composer, Modifier modifier) {
        if (modifier.mo3470c(C2311q.f9127w)) {
            return modifier;
        }
        C28655q c28655q = (C28655q) composer;
        c28655q.m87152f0(1219399079);
        Modifier modifier2 = (Modifier) modifier.mo3469a(C2314t.f9131w, new C2312r(c28655q, 0));
        c28655q.m87173q(false);
        return modifier2;
    }

    /* JADX INFO: renamed from: N */
    public static final Modifier m118962N(Composer composer, Modifier modifier) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(439770924);
        Modifier modifierM118961M = m118961M(c28655q, modifier);
        c28655q.m87173q(false);
        return modifierM118961M;
    }

    /* JADX INFO: renamed from: O */
    public static MappedByteBuffer m118963O(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th3) {
                    try {
                        fileInputStream.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (Throwable th5) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw th5;
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                    throw th5;
                }
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: P */
    public static ArrayList m118964P(Object... elements) {
        AbstractC22676k.m65750j(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new C25256l(elements, true));
    }

    /* JADX INFO: renamed from: R */
    public static C34807d0 m118965R(String... strArr) {
        String[] inputNamesAndValues = (String[]) Arrays.copyOf(strArr, strArr.length);
        AbstractC22676k.m65750j(inputNamesAndValues, "inputNamesAndValues");
        if (inputNamesAndValues.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) Arrays.copyOf(inputNamesAndValues, inputNamesAndValues.length);
        int length = strArr2.length;
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            if (strArr2[i14] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i14] = AbstractC39414r.m125869O0(inputNamesAndValues[i14]).toString();
        }
        int iM60400F = AbstractC21478l0.m60400F(0, strArr2.length - 1, 2);
        if (iM60400F >= 0) {
            while (true) {
                String str = strArr2[i13];
                String str2 = strArr2[i13 + 1];
                AbstractC35844b.m113764e(str);
                AbstractC35844b.m113765f(str2, str);
                if (i13 == iM60400F) {
                    break;
                }
                i13 += 2;
            }
        }
        return new C34807d0(strArr2);
    }

    /* JADX INFO: renamed from: U */
    public static final List m118966U(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : m118958J(list.get(0));
        }
        return C25271y.f99162w;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0028 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0046  */
    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0055  */
    /* JADX WARN: Code duplicated, block: B:20:0x0070  */
    /* JADX WARN: Code duplicated, block: B:21:0x0073  */
    /* JADX WARN: Code duplicated, block: B:23:0x0079  */
    /* JADX WARN: Code duplicated, block: B:24:0x008b  */
    /* JADX WARN: Code duplicated, block: B:26:0x009b  */
    /* JADX WARN: Code duplicated, block: B:27:0x009d  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f7 A[LOOP:3: B:42:0x00f5->B:43:0x00f7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x0117  */
    /* JADX WARN: Code duplicated, block: B:55:0x0125 A[LOOP:0: B:51:0x0115->B:55:0x0125, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0130  */
    /* JADX WARN: Code duplicated, block: B:61:0x0149 A[LOOP:1: B:59:0x0143->B:61:0x0149, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0028 A[EDGE_INSN: B:7:0x0028->B:82:0x023e BREAK  A[LOOP:0: B:51:0x0115->B:55:0x0125]] */
    /* JADX WARN: Code duplicated, block: B:80:0x01da A[LOOP:2: B:78:0x01d4->B:80:0x01da, LOOP_END] */
    /* JADX INFO: renamed from: V */
    public static AbstractC3210e m118967V(String host) {
        String str;
        List listM125906y0;
        boolean zM65745e;
        List listM125905x0;
        List listM125905x1;
        String str2;
        int i13;
        int size;
        C26460c c26460cM119000x;
        int i14;
        List listM118988k;
        int i15;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        Iterator it3;
        C3213h c3213hM36253S;
        AbstractC22676k.m65750j(host, "host");
        AbstractC1772c1 abstractC1772c1M36253S = AbstractC12889b.m36253S(host);
        short s13 = 0;
        if (abstractC1772c1M36253S == null) {
            List listM125905x2 = AbstractC39414r.m125905x0(host, new char[]{'%'}, 0, 6);
            if (listM125905x2.size() > 2) {
                abstractC1772c1M36253S = null;
                break;
            }
            if (listM125905x2.size() == 2) {
                String str3 = (String) listM125905x2.get(1);
                AbstractC22676k.m65750j(str3, "<this>");
                if (str3.length() <= 0 || AbstractC39414r.m125875T(str3, '%', false)) {
                    abstractC1772c1M36253S = null;
                    break;
                }
                if (listM125905x2.size() == 2) {
                    str = (String) listM125905x2.get(1);
                } else {
                    str = null;
                }
                listM125906y0 = AbstractC39414r.m125906y0((String) listM125905x2.get(0), new String[]{"::"}, 6);
                if (listM125906y0.size() <= 2) {
                    listM118988k = null;
                } else if (listM125906y0.size() == 1) {
                    listM118988k = AbstractC39414r.m125906y0((CharSequence) listM125906y0.get(0), new String[]{":"}, 6);
                } else {
                    zM65745e = AbstractC22676k.m65745e(listM125906y0.get(0), "");
                    listM125905x0 = C25271y.f99162w;
                    if (zM65745e) {
                        listM125905x1 = listM125905x0;
                    } else {
                        listM125905x1 = AbstractC39414r.m125905x0((CharSequence) listM125906y0.get(0), new char[]{':'}, 0, 6);
                    }
                    if (!AbstractC22676k.m65745e(listM125906y0.get(1), "")) {
                        listM125905x0 = AbstractC39414r.m125905x0((CharSequence) listM125906y0.get(1), new char[]{':'}, 0, 6);
                    }
                    if (listM125905x0.size() + listM125905x1.size() == 8) {
                        listM118988k = null;
                    } else {
                        str2 = (String) AbstractC25265s.m74114R0(listM125905x0);
                        if (str2 == null && AbstractC39414r.m125875T(str2, '.', false)) {
                            i13 = 7;
                        } else {
                            i13 = 8;
                        }
                        size = (i13 - listM125905x1.size()) - listM125905x0.size();
                        c26460cM119000x = m119000x();
                        c26460cM119000x.addAll(listM125905x1);
                        while (i14 < size) {
                            c26460cM119000x.add(UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE);
                        }
                        c26460cM119000x.addAll(listM125905x0);
                        listM118988k = m118988k(c26460cM119000x);
                    }
                }
                if (listM118988k != null || listM118988k.size() < 7) {
                    abstractC1772c1M36253S = null;
                    break;
                }
                i15 = 0;
                while (true) {
                    if (i15 < 6) {
                        if (listM118988k.size() != 7) {
                            List listSubList = listM118988k.subList(0, 6);
                            arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listSubList, 10));
                            it3 = listSubList.iterator();
                            while (it3.hasNext()) {
                                arrayList2.add(new C23479y(AbstractC32237a.m100305t((String) it3.next())));
                            }
                            if (!arrayList2.equals(m118959K(new C23479y(s13), new C23479y(s13), new C23479y(s13), new C23479y(s13), new C23479y(s13), new C23479y((short) -1))) && (c3213hM36253S = AbstractC12889b.m36253S((String) listM118988k.get(6))) != null) {
                                abstractC1772c1M36253S = c3213hM36253S.m9255U();
                                break;
                            }
                        } else if (listM118988k.size() == 8 && AbstractC12889b.m36248N((String) listM118988k.get(6)) && AbstractC12889b.m36248N((String) listM118988k.get(7))) {
                            List list = listM118988k;
                            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                            it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new C23479y(AbstractC32237a.m100305t((String) it.next())));
                            }
                            abstractC1772c1M36253S = new C3216k(((C23479y) arrayList.get(0)).f92957w, ((C23479y) arrayList.get(1)).f92957w, ((C23479y) arrayList.get(2)).f92957w, ((C23479y) arrayList.get(3)).f92957w, ((C23479y) arrayList.get(4)).f92957w, ((C23479y) arrayList.get(5)).f92957w, ((C23479y) arrayList.get(6)).f92957w, ((C23479y) arrayList.get(7)).f92957w, str);
                            break;
                        }
                    } else if (!AbstractC12889b.m36248N((String) listM118988k.get(i15))) {
                        i15++;
                    }
                    abstractC1772c1M36253S = null;
                    break;
                }
            } else {
                if (listM125905x2.size() == 2) {
                    str = (String) listM125905x2.get(1);
                } else {
                    str = null;
                }
                listM125906y0 = AbstractC39414r.m125906y0((String) listM125905x2.get(0), new String[]{"::"}, 6);
                if (listM125906y0.size() <= 2) {
                    listM118988k = null;
                } else if (listM125906y0.size() == 1) {
                    listM118988k = AbstractC39414r.m125906y0((CharSequence) listM125906y0.get(0), new String[]{":"}, 6);
                } else {
                    zM65745e = AbstractC22676k.m65745e(listM125906y0.get(0), "");
                    listM125905x0 = C25271y.f99162w;
                    if (zM65745e) {
                        listM125905x1 = listM125905x0;
                    } else {
                        listM125905x1 = AbstractC39414r.m125905x0((CharSequence) listM125906y0.get(0), new char[]{':'}, 0, 6);
                    }
                    if (!AbstractC22676k.m65745e(listM125906y0.get(1), "")) {
                        listM125905x0 = AbstractC39414r.m125905x0((CharSequence) listM125906y0.get(1), new char[]{':'}, 0, 6);
                    }
                    if (listM125905x0.size() + listM125905x1.size() == 8) {
                        listM118988k = null;
                    } else {
                        str2 = (String) AbstractC25265s.m74114R0(listM125905x0);
                        if (str2 == null) {
                            i13 = 8;
                        } else {
                            i13 = 8;
                        }
                        size = (i13 - listM125905x1.size()) - listM125905x0.size();
                        c26460cM119000x = m119000x();
                        c26460cM119000x.addAll(listM125905x1);
                        for (i14 = 0; i14 < size; i14++) {
                            c26460cM119000x.add(UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE);
                        }
                        c26460cM119000x.addAll(listM125905x0);
                        listM118988k = m118988k(c26460cM119000x);
                    }
                }
                if (listM118988k != null) {
                    abstractC1772c1M36253S = null;
                    break;
                }
                i15 = 0;
                while (true) {
                    if (i15 < 6) {
                        if (listM118988k.size() != 7) {
                            if (listM118988k.size() == 8) {
                                List list2 = listM118988k;
                                arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                                it = list2.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new C23479y(AbstractC32237a.m100305t((String) it.next())));
                                }
                                abstractC1772c1M36253S = new C3216k(((C23479y) arrayList.get(0)).f92957w, ((C23479y) arrayList.get(1)).f92957w, ((C23479y) arrayList.get(2)).f92957w, ((C23479y) arrayList.get(3)).f92957w, ((C23479y) arrayList.get(4)).f92957w, ((C23479y) arrayList.get(5)).f92957w, ((C23479y) arrayList.get(6)).f92957w, ((C23479y) arrayList.get(7)).f92957w, str);
                                break;
                            }
                            break;
                        }
                        List listSubList2 = listM118988k.subList(0, 6);
                        arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listSubList2, 10));
                        it3 = listSubList2.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(new C23479y(AbstractC32237a.m100305t((String) it3.next())));
                        }
                        if (!arrayList2.equals(m118959K(new C23479y(s13), new C23479y(s13), new C23479y(s13), new C23479y(s13), new C23479y(s13), new C23479y((short) -1)))) {
                            break;
                        }
                        abstractC1772c1M36253S = c3213hM36253S.m9255U();
                        break;
                    }
                    if (!AbstractC12889b.m36248N((String) listM118988k.get(i15))) {
                        i15++;
                    }
                    abstractC1772c1M36253S = null;
                    break;
                }
            }
        }
        if (abstractC1772c1M36253S != null) {
            return new C3209d(abstractC1772c1M36253S);
        }
        List<String> listM125905x3 = AbstractC39414r.m125905x0(host, new char[]{'.'}, 0, 6);
        if (!(listM125905x3 instanceof Collection) || !listM125905x3.isEmpty()) {
            for (String str4 : listM125905x3) {
                AbstractC22676k.m65750j(str4, "<this>");
                int length = str4.length();
                if (1 <= length && length < 64 && Character.isLetterOrDigit(str4.charAt(0))) {
                    String strM125878W = AbstractC39414r.m125878W(1, str4);
                    for (int i16 = 0; i16 < strM125878W.length(); i16++) {
                        char cCharAt = strM125878W.charAt(i16);
                        if (Character.isLetterOrDigit(cCharAt) || cCharAt == '-') {
                        }
                    }
                }
                throw new IllegalArgumentException(host.concat(" is not a valid inet host"));
            }
        }
        return new C3208c(host);
    }

    /* JADX INFO: renamed from: W */
    public static InterfaceC18184w m118968W(int i13, String str) {
        String str2;
        int i14;
        int i15;
        int i16 = 0;
        boolean z4 = (i13 & 8) != 0;
        if (AbstractC39414r.m125884c0(str) < 0) {
            InterfaceC18184w.f70532b.getClass();
            return C18168g.f70491c;
        }
        C18173l c18173l = InterfaceC18184w.f70532b;
        C18185x c18185x = new C18185x(3);
        int iM125884c0 = AbstractC39414r.m125884c0(str);
        if (iM125884c0 >= 0) {
            i14 = 0;
            int i17 = 0;
            i15 = -1;
            while (true) {
                if (i16 != 1000) {
                    char cCharAt = str.charAt(i17);
                    if (cCharAt == '&') {
                        str2 = str;
                        m118978e(c18185x, str2, i14, i15, i17, z4);
                        i16++;
                        i14 = i17 + 1;
                        i15 = -1;
                    } else {
                        str2 = str;
                        if (cCharAt == '=' && i15 == -1) {
                            i15 = i17;
                        }
                    }
                    if (i17 == iM125884c0) {
                        break;
                    }
                    i17++;
                    str = str2;
                }
                Map values = (Map) c18185x.f3536x;
                AbstractC22676k.m65750j(values, "values");
                return new C18186y(values);
            }
        }
        str2 = str;
        i14 = 0;
        i15 = -1;
        if (i16 != 1000) {
            m118978e(c18185x, str2, i14, i15, str2.length(), z4);
        }
        Map values2 = (Map) c18185x.f3536x;
        AbstractC22676k.m65750j(values2, "values");
        return new C18186y(values2);
    }

    /* JADX INFO: renamed from: X */
    public static final boolean m118969X(String method) {
        AbstractC22676k.m65750j(method, "method");
        return (method.equals("GET") || method.equals("HEAD")) ? false : true;
    }

    /* JADX INFO: renamed from: Y */
    public static final void m118970Y(C28626i2 c28626i2, InterfaceC28599c interfaceC28599c, int i13) {
        while (true) {
            int i14 = c28626i2.f115802v;
            if (i13 > i14 && i13 < c28626i2.f115801u) {
                return;
            }
            if (i14 == 0 && i13 == 0) {
                return;
            }
            c28626i2.m87047L();
            if (c28626i2.m87078x(c28626i2.f115802v)) {
                interfaceC28599c.mo710p();
            }
            c28626i2.m87064j();
        }
    }

    /* JADX INFO: renamed from: Z */
    public static final void m118971Z(int i13, int i14) {
        if (i14 < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8296i(i14, "fromIndex (0) is greater than toIndex (", ")."));
        }
        if (i14 > i13) {
            throw new IndexOutOfBoundsException(AbstractC25012a.m73372e(i14, i13, "toIndex (", ") is greater than size (", ")."));
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static final C16351i m118972a0(AbstractC22081b abstractC22081b, Function1 function1, Composer composer, int i13) {
        Object c16344b;
        AbstractC22081b abstractC22081b2;
        AbstractC28683x.m87238F(abstractC22081b, composer);
        InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(function1, composer);
        String str = (String) AbstractC39038k.m124459e(new Object[0], null, C16345c.f62855x, composer, 3072, 6);
        InterfaceC21072k interfaceC21072kM46560a = AbstractC16349g.m46560a(composer);
        if (interfaceC21072kM46560a == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        }
        AbstractC21071j activityResultRegistry = interfaceC21072kM46560a.getActivityResultRegistry();
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = new C16343a();
            c28655q.m87172p0(objM87133R);
        }
        C16343a c16343a = (C16343a) objM87133R;
        Object objM87133R2 = c28655q.m87133R();
        if (objM87133R2 == c28676v0) {
            objM87133R2 = new C16351i(c16343a);
            c28655q.m87172p0(objM87133R2);
        }
        C16351i c16351i = (C16351i) objM87133R2;
        boolean zM87157i = c28655q.m87157i(c16343a) | c28655q.m87157i(activityResultRegistry) | c28655q.m87153g(str) | c28655q.m87157i(abstractC22081b) | c28655q.m87153g(interfaceC28601c1M87238F);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i || objM87133R3 == c28676v0) {
            abstractC22081b2 = abstractC22081b;
            c16344b = new C16344b(c16343a, activityResultRegistry, str, abstractC22081b2, interfaceC28601c1M87238F);
            c28655q.m87172p0(c16344b);
        } else {
            c16344b = objM87133R3;
            abstractC22081b2 = abstractC22081b;
        }
        AbstractC28683x.m87249c(activityResultRegistry, str, abstractC22081b2, (Function1) c16344b, c28655q);
        return c16351i;
    }

    /* JADX INFO: renamed from: b */
    public static final String m118973b(Object[] objArr, int i13, int i14, AbstractC25248h abstractC25248h) {
        StringBuilder sb4 = new StringBuilder((i14 * 3) + 2);
        sb4.append("[");
        for (int i15 = 0; i15 < i14; i15++) {
            if (i15 > 0) {
                sb4.append(", ");
            }
            Object obj = objArr[i13 + i15];
            if (obj == abstractC25248h) {
                sb4.append("(this Collection)");
            } else {
                sb4.append(obj);
            }
        }
        sb4.append("]");
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: b0 */
    public static final void m118974b0(int i13, int i14, Object[] objArr) {
        AbstractC22676k.m65750j(objArr, "<this>");
        while (i13 < i14) {
            objArr[i13] = null;
            i13++;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final List m118975c(InterfaceC21461d interfaceC21461d) {
        AbstractC22676k.m65750j(interfaceC21461d, "<this>");
        return AbstractC38176k.m122276E(AbstractC38176k.m122285u(AbstractC38176k.m122288x(interfaceC21461d, C37055e.f158544x), C37055e.f158545y));
    }

    /* JADX INFO: renamed from: c0 */
    public static void m118976c0() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* JADX INFO: renamed from: d0 */
    public static void m118977d0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* JADX INFO: renamed from: e */
    public static final void m118978e(C18185x c18185x, String str, int i13, int i14, int i15, boolean z4) {
        String strSubstring;
        String strSubstring2;
        String strSubstring3;
        if (i14 == -1) {
            int iM118985h0 = m118985h0(i13, i15, str);
            int iM118983g0 = m118983g0(iM118985h0, i15, str);
            if (iM118983g0 > iM118985h0) {
                if (z4) {
                    strSubstring3 = AbstractC18157a.m52155e(iM118985h0, iM118983g0, 12, str, false);
                } else {
                    strSubstring3 = str.substring(iM118985h0, iM118983g0);
                    AbstractC22676k.m65749i(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                c18185x.mo2297E(strSubstring3, C25271y.f99162w);
                return;
            }
            return;
        }
        int iM118985h1 = m118985h0(i13, i14, str);
        int iM118983g1 = m118983g0(iM118985h1, i14, str);
        if (iM118983g1 > iM118985h1) {
            if (z4) {
                strSubstring = AbstractC18157a.m52155e(iM118985h1, iM118983g1, 12, str, false);
            } else {
                strSubstring = str.substring(iM118985h1, iM118983g1);
                AbstractC22676k.m65749i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            int iM118985h2 = m118985h0(i14 + 1, i15, str);
            int iM118983g2 = m118983g0(iM118985h2, i15, str);
            if (z4) {
                strSubstring2 = AbstractC18157a.m52155e(iM118985h2, iM118983g2, 8, str, true);
            } else {
                strSubstring2 = str.substring(iM118985h2, iM118983g2);
                AbstractC22676k.m65749i(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            c18185x.m2422s0(strSubstring, strSubstring2);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static final C23465k m118979e0(Object obj, Object obj2) {
        return new C23465k(obj, obj2);
    }

    /* JADX INFO: renamed from: f */
    public static ArrayList m118980f(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C25256l(objArr, true));
    }

    /* JADX INFO: renamed from: f0 */
    public static C0237p m118981f0(InterfaceC20308d1 interfaceC20308d1, String str, List list, InterfaceC20408l1 interfaceC20408l1) {
        C20513q6 c20513q6Mo56432l = interfaceC20308d1.mo56432l();
        C0237p c0237p = null;
        if (c20513q6Mo56432l.isTraceSampling()) {
            List<String> tracePropagationTargets = c20513q6Mo56432l.getTracePropagationTargets();
            boolean z4 = false;
            if (!tracePropagationTargets.isEmpty()) {
                for (String str2 : tracePropagationTargets) {
                    if (!str.contains(str2)) {
                        try {
                            if (str.matches(str2)) {
                            }
                        } catch (Exception unused) {
                        }
                    }
                    z4 = true;
                }
            }
            if (z4) {
                C20513q6 c20513q6Mo56432l2 = interfaceC20308d1.mo56432l();
                if (interfaceC20408l1 != null && !interfaceC20408l1.mo56455k()) {
                    C20621w6 c20621w6Mo56449b = interfaceC20408l1.mo56449b();
                    C17191x c17191xMo56458n = interfaceC20408l1.mo56458n(list);
                    if (c20513q6Mo56432l2.isPropagateTraceparent()) {
                        C20323e7 c20323e7Mo56462t = interfaceC20408l1.mo56462t();
                        c0237p = new C0237p(c20323e7Mo56462t.f76321w, c20323e7Mo56462t.f76322x, c20621w6Mo56449b.f77167c, 10);
                    }
                    return new C0237p(c20621w6Mo56449b, c17191xMo56458n, c0237p, 11);
                }
                C0929d c0929d = new C0929d();
                c0929d.f3422w = null;
                interfaceC20308d1.mo56439s(new C3633d(5, c0929d, c20513q6Mo56432l2));
                C0237p c0237p2 = (C0237p) c0929d.f3422w;
                if (c0237p2 != null) {
                    C20269c c20269c = (C20269c) c0237p2.f814z;
                    C20353h7 c20353h7 = (C20353h7) c0237p2.f813y;
                    C20501v c20501v = (C20501v) c0237p2.f812x;
                    return new C0237p(new C20621w6(c20501v, c20353h7, null), C17191x.m48545a(c20269c, list), c20513q6Mo56432l2.isPropagateTraceparent() ? new C0237p(c20501v, c20353h7, c0237p, 10) : null, 11);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static C36920f m118982g(InterfaceC13058l interfaceC13058l) {
        return new C36920f(new C6656c(interfaceC13058l, 15));
    }

    /* JADX INFO: renamed from: g0 */
    public static final int m118983g0(int i13, int i14, String str) {
        while (i14 > i13 && AbstractC35846d.m113784i(str.charAt(i14 - 1))) {
            i14--;
        }
        return i14;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public static final Object m118984h(InterfaceC11936u interfaceC11936u, InterfaceC4339a interfaceC4339a, InterfaceC30057d interfaceC30057d) {
        C11933r c11933r;
        if (interfaceC30057d instanceof C11933r) {
            c11933r = (C11933r) interfaceC30057d;
            int i13 = c11933r.f39038y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c11933r.f39038y = i13 - Integer.MIN_VALUE;
            } else {
                c11933r = new C11933r(interfaceC30057d);
            }
        } else {
            c11933r = new C11933r(interfaceC30057d);
        }
        Object obj = c11933r.f39037x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c11933r.f39038y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                if (c11933r.getContext().get(C3023j1.f12041w) != interfaceC11936u) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                }
                c11933r.f39036w = interfaceC4339a;
                c11933r.f39038y = 1;
                C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(c11933r));
                c3033m.m8774s();
                ((C11935t) interfaceC11936u).m32235c0(new C11934s(c3033m, 0));
                if (c3033m.m8773r() == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC4339a = c11933r.f39036w;
                AbstractC34132o.m107864I(obj);
            }
            interfaceC4339a.invoke();
            return C23454a0.f92919a;
        } catch (Throwable th3) {
            interfaceC4339a.invoke();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static final int m118985h0(int i13, int i14, String str) {
        while (i13 < i14 && AbstractC35846d.m113784i(str.charAt(i13))) {
            i13++;
        }
        return i13;
    }

    /* JADX INFO: renamed from: i */
    public static int m118986i(List list, Comparable comparable) {
        int size = list.size();
        AbstractC22676k.m65750j(list, "<this>");
        m118971Z(list.size(), size);
        int i13 = size - 1;
        int i14 = 0;
        while (i14 <= i13) {
            int i15 = (i14 + i13) >>> 1;
            int iM92127q = AbstractC30060g.m92127q((Comparable) list.get(i15), comparable);
            if (iM92127q < 0) {
                i14 = i15 + 1;
            } else {
                if (iM92127q <= 0) {
                    return i15;
                }
                i13 = i15 - 1;
            }
        }
        return -(i14 + 1);
    }

    /* JADX INFO: renamed from: j */
    public static final void m118987j(int i13, StringBuilder sb4) {
        if (i13 <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(i13);
        for (int i14 = 0; i14 < i13; i14++) {
            arrayList.add("?");
        }
        sb4.append(AbstractC25265s.m74110N0(arrayList, ",", null, null, null, 62));
    }

    /* JADX INFO: renamed from: k */
    public static C26460c m118988k(C26460c c26460c) {
        c26460c.m78373j();
        c26460c.f105098y = true;
        return c26460c.f105097x > 0 ? c26460c : C26460c.f105095z;
    }

    /* JADX INFO: renamed from: l */
    public static final int m118989l(float f13) {
        return Math.round((float) Math.ceil(f13));
    }

    /* JADX INFO: renamed from: m */
    public static void m118990m(boolean z4, String str) {
        if (!z4) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m118991n(int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: p */
    public static AbstractC12958g1 m118992p(TypedValue typedValue, AbstractC12958g1 abstractC12958g1, AbstractC12958g1 abstractC12958g2, String str, String str2) throws XmlPullParserException {
        if (abstractC12958g1 == null || abstractC12958g1 == abstractC12958g2) {
            return abstractC12958g1 == null ? abstractC12958g2 : abstractC12958g1;
        }
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Type is ", str, " but found ", str2, ": ");
        sbM32001t.append(typedValue.data);
        throw new XmlPullParserException(sbM32001t.toString());
    }

    /* JADX INFO: renamed from: q */
    public static void m118993q(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: r */
    public static final Modifier m118994r(Modifier modifier, InterfaceC17869a1 interfaceC17869a1) {
        return AbstractC1127a.m3488c(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, interfaceC17869a1, null, 0, 518143);
    }

    /* JADX INFO: renamed from: s */
    public static final Modifier m118995s(Modifier modifier) {
        return AbstractC1127a.m3488c(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0, 520191);
    }

    /* JADX INFO: renamed from: t */
    public static void m118996t(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public static final Modifier m118997u(Modifier modifier, Function3 function3) {
        return modifier.mo3471e(new C2310p(function3));
    }

    /* JADX INFO: renamed from: v */
    public static boolean m118998v(File file, Resources resources, int i13) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i13);
            try {
                boolean zM118999w = m118999w(file, inputStreamOpenRawResource);
                m118996t(inputStreamOpenRawResource);
                return zM118999w;
            } catch (Throwable th3) {
                th = th3;
                m118996t(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            inputStreamOpenRawResource = null;
        }
    }

    /* JADX INFO: renamed from: w */
    public static boolean m118999w(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];
                    while (true) {
                        int i13 = inputStream.read(bArr);
                        if (i13 == -1) {
                            m118996t(fileOutputStream2);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, i13);
                    }
                } catch (IOException e5) {
                    e = e5;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    m118996t(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = fileOutputStream2;
                    m118996t(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (IOException e13) {
                e = e13;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: renamed from: x */
    public static C26460c m119000x() {
        return new C26460c(10);
    }

    /* JADX INFO: renamed from: y */
    public static C20269c m119001y(C20269c c20269c, Boolean bool, Double d3, Double d14) {
        if (c20269c == null) {
            c20269c = new C20269c(C20546t2.f76998w);
        }
        if (c20269c.f76116d == null) {
            Double d15 = c20269c.f76115c;
            if (d15 != null) {
                d3 = d15;
            }
            Double dM107881e = AbstractC34132o.m107881e(bool, d14, d3);
            if (c20269c.f76118f) {
                c20269c.f76116d = dM107881e;
            }
        }
        if (c20269c.f76118f && c20269c.f76119g) {
            c20269c.f76118f = false;
        }
        return c20269c;
    }

    /* JADX INFO: renamed from: z */
    public static void m119002z(InterfaceC27622m interfaceC27622m, InterfaceC4351m interfaceC4351m) {
        for (Map.Entry entry : interfaceC27622m.mo52165b()) {
            interfaceC4351m.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    /* JADX INFO: renamed from: A */
    public abstract InterfaceC4535j mo36632A();

    /* JADX INFO: renamed from: Q */
    public abstract InterfaceC4534i mo36633Q(InterfaceC4536k interfaceC4536k);

    /* JADX INFO: renamed from: S */
    public abstract void mo47704S(Throwable th3);

    /* JADX INFO: renamed from: T */
    public abstract void mo47705T(C41113q c41113q);

    /* JADX INFO: renamed from: a */
    public InterfaceC27910g mo44900a(String str) {
        return C27909f.f112509a;
    }

    @Override // vg.InterfaceC35954a
    public Object build() {
        return mo36633Q((InterfaceC4536k) mo36632A().build());
    }
}
