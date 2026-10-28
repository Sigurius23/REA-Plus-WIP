package p343nk;

import androidx.room.AbstractC1772c1;
import androidx.room.C1849z1;
import bc3.AbstractC3006f0;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import fk.InterfaceC14544a;
import hg3.AbstractC17269i;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import l83.C23454a0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p014aj.C0929d;
import p505ts.AbstractC34132o;
import p581we.C37199o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.C30064k;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import va3.AbstractC35854l;
import vf3.AbstractC35952b;
import x83.AbstractC38093j;
import yb3.AbstractC39397a;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: nk.i */
/* JADX INFO: loaded from: classes.dex */
public final class C26788i {

    /* JADX INFO: renamed from: l */
    public static final ConcurrentHashMap f106691l = new ConcurrentHashMap();

    /* JADX INFO: renamed from: m */
    public static final ConcurrentHashMap f106692m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final File f106693a;

    /* JADX INFO: renamed from: b */
    public final String f106694b;

    /* JADX INFO: renamed from: c */
    public final C0929d f106695c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC14544a f106696d;

    /* JADX INFO: renamed from: e */
    public final C37199o f106697e;

    /* JADX INFO: renamed from: f */
    public final String f106698f;

    /* JADX INFO: renamed from: g */
    public final String f106699g;

    /* JADX INFO: renamed from: h */
    public final Set f106700h;

    /* JADX INFO: renamed from: i */
    public final ConcurrentHashMap f106701i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC25435a f106702j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC25435a f106703k;

    public C26788i(File file, String storageKey, C0929d c0929d, InterfaceC14544a logger, C37199o diagnostics) throws Throwable {
        Object objPutIfAbsent;
        Object objPutIfAbsent2;
        AbstractC22676k.m65750j(storageKey, "storageKey");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(diagnostics, "diagnostics");
        this.f106693a = file;
        this.f106694b = storageKey;
        this.f106695c = c0929d;
        this.f106696d = logger;
        this.f106697e = diagnostics;
        this.f106698f = "amplitude.events.file.index.".concat(storageKey);
        this.f106699g = "amplitude.events.file.version.".concat(storageKey);
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        AbstractC22676k.m65749i(setNewSetFromMap, "newSetFromMap(ConcurrentHashMap())");
        this.f106700h = setNewSetFromMap;
        this.f106701i = new ConcurrentHashMap();
        ConcurrentHashMap concurrentHashMap = f106691l;
        Object objM74669a = concurrentHashMap.get(storageKey);
        if (objM74669a == null && (objPutIfAbsent2 = concurrentHashMap.putIfAbsent(storageKey, (objM74669a = AbstractC25438d.m74669a()))) != null) {
            objM74669a = objPutIfAbsent2;
        }
        this.f106702j = (InterfaceC25435a) objM74669a;
        ConcurrentHashMap concurrentHashMap2 = f106692m;
        Object objM74669a2 = concurrentHashMap2.get(storageKey);
        if (objM74669a2 == null && (objPutIfAbsent = concurrentHashMap2.putIfAbsent(storageKey, (objM74669a2 = AbstractC25438d.m74669a()))) != null) {
            objM74669a2 = objPutIfAbsent;
        }
        this.f106703k = (InterfaceC25435a) objM74669a2;
        m79816e();
        AbstractC3006f0.m8699E(C30064k.f122676w, new C1849z1(this, null, 11));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m79812a(C26788i c26788i, AbstractC32269c abstractC32269c) {
        C26783d c26783d;
        InterfaceC25435a writeMutex;
        if (abstractC32269c instanceof C26783d) {
            c26783d = (C26783d) abstractC32269c;
            int i13 = c26783d.f106673E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c26783d.f106673E = i13 - Integer.MIN_VALUE;
            } else {
                c26783d = new C26783d(c26788i, abstractC32269c);
            }
        } else {
            c26783d = new C26783d(c26788i, abstractC32269c);
        }
        Object obj = c26783d.f106676y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c26783d.f106673E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            writeMutex = c26788i.f106702j;
            AbstractC22676k.m65749i(writeMutex, "writeMutex");
            c26783d.f106674w = c26788i;
            c26783d.f106675x = writeMutex;
            c26783d.f106673E = 1;
            if (writeMutex.mo68211b(c26783d) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC25435a interfaceC25435a = c26783d.f106675x;
            C26788i c26788i2 = c26783d.f106674w;
            AbstractC34132o.m107864I(obj);
            writeMutex = interfaceC25435a;
            c26788i = c26788i2;
        }
        try {
            if (c26788i.f106695c.m2352l(c26788i.f106699g, 1L) <= 1) {
                File[] fileArrListFiles = c26788i.f106693a.listFiles(new C26781b(c26788i, 2));
                if (fileArrListFiles == null) {
                    fileArrListFiles = new File[0];
                }
                ArrayList<File> arrayList = new ArrayList();
                for (File file : fileArrListFiles) {
                    if (file.exists()) {
                        arrayList.add(file);
                    }
                }
                for (File it : arrayList) {
                    AbstractC22676k.m65749i(it, "it");
                    Charset charset = AbstractC39397a.f169546a;
                    AbstractC22676k.m65750j(charset, "charset");
                    InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(it), charset);
                    try {
                        String strM114200h = AbstractC35952b.m114200h(inputStreamReader);
                        inputStreamReader.close();
                        if (!AbstractC39421y.m125920E(strM114200h, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, false)) {
                            String str = '[' + AbstractC39414r.m125872R0(AbstractC39414r.m125874S0(strM114200h, '[', DateTimeRange.lowerUpperDelimiter), ']', DateTimeRange.lowerUpperDelimiter) + ']';
                            try {
                                c26788i.m79821j(AbstractC17269i.m48913r0(new JSONArray(str)), it, false);
                                if (AbstractC38093j.m122039m(it).equals("tmp")) {
                                    c26788i.m79814c(it);
                                }
                            } catch (JSONException unused) {
                                c26788i.f106696d.error("Failed to parse events: " + str + ", dropping file: " + it.getPath());
                                String path = it.getPath();
                                AbstractC22676k.m65749i(path, "it.path");
                                c26788i.m79817f(path);
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            AbstractC35854l.m113829i(inputStreamReader, th3);
                            throw th4;
                        }
                    }
                }
                c26788i.f106695c.m2357u(2L, c26788i.f106699g);
            }
            writeMutex.mo68214i(null);
            return C23454a0.f92919a;
        } catch (Throwable th5) {
            writeMutex.mo68214i(null);
            throw th5;
        }
    }

    /* JADX INFO: renamed from: b */
    public final File m79813b() {
        ConcurrentHashMap concurrentHashMap = this.f106701i;
        String str = this.f106694b;
        File file = (File) concurrentHashMap.get(str);
        File file2 = this.f106693a;
        if (file == null) {
            File[] fileArrListFiles = file2.listFiles(new C26781b(this, 1));
            if (fileArrListFiles == null) {
                fileArrListFiles = new File[0];
            }
            file = (File) AbstractC25260n.m74084y0(0, fileArrListFiles);
        }
        long jM2352l = this.f106695c.m2352l(this.f106698f, 0L);
        if (file == null) {
            file = new File(file2, str + '-' + jM2352l + ".tmp");
        }
        concurrentHashMap.put(str, file);
        Object obj = concurrentHashMap.get(str);
        AbstractC22676k.m65747g(obj);
        return (File) obj;
    }

    /* JADX INFO: renamed from: c */
    public final void m79814c(File file) {
        m79818g(file);
        C0929d c0929d = this.f106695c;
        String str = this.f106698f;
        c0929d.m2357u(c0929d.m2352l(str, 0L) + 1, str);
        this.f106701i.remove(this.f106694b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: d */
    public final Object m79815d(String str, AbstractC32269c abstractC32269c) {
        C26782c c26782c;
        InterfaceC25435a readMutex;
        C26788i c26788i;
        if (abstractC32269c instanceof C26782c) {
            c26782c = (C26782c) abstractC32269c;
            int i13 = c26782c.f106668F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c26782c.f106668F = i13 - Integer.MIN_VALUE;
            } else {
                c26782c = new C26782c(this, abstractC32269c);
            }
        } else {
            c26782c = new C26782c(this, abstractC32269c);
        }
        Object obj = c26782c.f106672z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c26782c.f106668F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            readMutex = this.f106703k;
            AbstractC22676k.m65749i(readMutex, "readMutex");
            c26782c.f106669w = this;
            c26782c.f106670x = str;
            c26782c.f106671y = readMutex;
            c26782c.f106668F = 1;
            if (readMutex.mo68211b(c26782c) == enumC31071a) {
                return enumC31071a;
            }
            c26788i = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC25435a interfaceC25435a = c26782c.f106671y;
            String str2 = c26782c.f106670x;
            c26788i = c26782c.f106669w;
            AbstractC34132o.m107864I(obj);
            readMutex = interfaceC25435a;
            str = str2;
        }
        try {
            Set set = c26788i.f106700h;
            String string = "";
            if (set.contains(str)) {
                set.remove(str);
            } else {
                set.add(str);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(str)), AbstractC39397a.f169546a), DfuBaseService.ERROR_REMOTE_MASK);
                try {
                    String strM114200h = AbstractC35952b.m114200h(bufferedReader);
                    if (AbstractC39421y.m125920E(strM114200h, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, false)) {
                        JSONArray jSONArray = new JSONArray();
                        for (String str3 : AbstractC39414r.m125906y0(strM114200h, new String[]{WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR}, 6)) {
                            if (str3.length() > 0) {
                                try {
                                    jSONArray.put(new JSONObject(str3));
                                } catch (JSONException unused) {
                                    C37199o c37199o = c26788i.f106697e;
                                    c37199o.getClass();
                                    if (((List) c37199o.f159040w) == null) {
                                        c37199o.f159040w = Collections.synchronizedList(new ArrayList());
                                    }
                                    List list = (List) c37199o.f159040w;
                                    if (list != null) {
                                        list.add(str3);
                                    }
                                    c26788i.f106696d.error("Failed to parse event: " + str3);
                                }
                            }
                        }
                        string = jSONArray.length() > 0 ? jSONArray.toString() : "";
                        AbstractC22676k.m65749i(string, "if (events.length() > 0)… \"\"\n                    }");
                    } else {
                        String event = "[" + AbstractC39414r.m125872R0(AbstractC39414r.m125874S0(strM114200h, '[', DateTimeRange.lowerUpperDelimiter), ']', DateTimeRange.lowerUpperDelimiter) + ']';
                        try {
                            String string2 = new JSONArray(event).toString();
                            AbstractC22676k.m65749i(string2, "jsonArray.toString()");
                            string = string2;
                        } catch (JSONException unused2) {
                            C37199o c37199o2 = c26788i.f106697e;
                            c37199o2.getClass();
                            AbstractC22676k.m65750j(event, "event");
                            if (((List) c37199o2.f159040w) == null) {
                                c37199o2.f159040w = Collections.synchronizedList(new ArrayList());
                            }
                            List list2 = (List) c37199o2.f159040w;
                            if (list2 != null) {
                                list2.add(event);
                            }
                            c26788i.f106696d.error("Failed to parse events: " + event + ", dropping file: " + str);
                            c26788i.m79817f(str);
                            string = event;
                        }
                    }
                    bufferedReader.close();
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        AbstractC35854l.m113829i(bufferedReader, th3);
                        throw th4;
                    }
                }
            }
            readMutex.mo68214i(null);
            return string;
        } catch (Throwable th5) {
            readMutex.mo68214i(null);
            throw th5;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m79816e() {
        File file = this.f106693a;
        try {
            AbstractC1772c1.m5396n(file);
            return true;
        } catch (IOException e5) {
            this.f106697e.m119225g("Failed to create directory: " + e5.getMessage());
            this.f106696d.error("Failed to create directory for events storage: " + file.getPath());
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m79817f(String filePath) {
        AbstractC22676k.m65750j(filePath, "filePath");
        this.f106700h.remove(filePath);
        return new File(filePath).delete();
    }

    /* JADX INFO: renamed from: g */
    public final void m79818g(File file) {
        if (!file.exists() || AbstractC38093j.m122039m(file).length() == 0) {
            return;
        }
        String strM122040n = AbstractC38093j.m122040n(file);
        File file2 = this.f106693a;
        File file3 = new File(file2, strM122040n);
        if (!file3.exists()) {
            file.renameTo(new File(file2, AbstractC38093j.m122040n(file)));
            return;
        }
        this.f106696d.debug("File already exists: " + file3 + ", handle gracefully.");
        file.renameTo(new File(file2, strM122040n + '-' + System.currentTimeMillis() + '-' + new Random().nextInt(1000)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m79819h(AbstractC32269c abstractC32269c) {
        C26785f c26785f;
        C26788i c26788i;
        InterfaceC25435a interfaceC25435a;
        if (abstractC32269c instanceof C26785f) {
            c26785f = (C26785f) abstractC32269c;
            int i13 = c26785f.f106679E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c26785f.f106679E = i13 - Integer.MIN_VALUE;
            } else {
                c26785f = new C26785f(this, abstractC32269c);
            }
        } else {
            c26785f = new C26785f(this, abstractC32269c);
        }
        Object obj = c26785f.f106682y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c26785f.f106679E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC25435a writeMutex = this.f106702j;
            AbstractC22676k.m65749i(writeMutex, "writeMutex");
            c26785f.f106680w = this;
            c26785f.f106681x = writeMutex;
            c26785f.f106679E = 1;
            if (writeMutex.mo68211b(c26785f) == enumC31071a) {
                return enumC31071a;
            }
            c26788i = this;
            interfaceC25435a = writeMutex;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC25435a = c26785f.f106681x;
            c26788i = c26785f.f106680w;
            AbstractC34132o.m107864I(obj);
        }
        try {
            File fileM79813b = c26788i.m79813b();
            if (fileM79813b.exists() && fileM79813b.length() > 0) {
                c26788i.m79814c(fileM79813b);
            }
            return C23454a0.f92919a;
        } finally {
            interfaceC25435a.mo68214i(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a4 A[Catch: all -> 0x006e, TRY_LEAVE, TryCatch #2 {all -> 0x006e, blocks: (B:19:0x0052, B:23:0x005e, B:26:0x006a, B:32:0x0099, B:34:0x00a4, B:36:0x00b1, B:39:0x00b6, B:40:0x00e3, B:31:0x0072), top: B:49:0x0052, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m79820i(String str, AbstractC32269c abstractC32269c) {
        C26786g c26786g;
        InterfaceC25435a writeMutex;
        C26788i c26788i;
        if (abstractC32269c instanceof C26786g) {
            c26786g = (C26786g) abstractC32269c;
            int i13 = c26786g.f106685F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c26786g.f106685F = i13 - Integer.MIN_VALUE;
            } else {
                c26786g = new C26786g(this, abstractC32269c);
            }
        } else {
            c26786g = new C26786g(this, abstractC32269c);
        }
        Object obj = c26786g.f106689z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c26786g.f106685F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            writeMutex = this.f106702j;
            AbstractC22676k.m65749i(writeMutex, "writeMutex");
            c26786g.f106686w = this;
            c26786g.f106687x = str;
            c26786g.f106688y = writeMutex;
            c26786g.f106685F = 1;
            if (writeMutex.mo68211b(c26786g) == enumC31071a) {
                return enumC31071a;
            }
            c26788i = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC25435a interfaceC25435a = c26786g.f106688y;
            String str2 = c26786g.f106687x;
            c26788i = c26786g.f106686w;
            AbstractC34132o.m107864I(obj);
            writeMutex = interfaceC25435a;
            str = str2;
        }
        try {
            boolean zM79816e = c26788i.m79816e();
            InterfaceC14544a interfaceC14544a = c26788i.f106696d;
            C37199o c37199o = c26788i.f106697e;
            if (zM79816e) {
                File fileM79813b = c26788i.m79813b();
                if (fileM79813b.exists()) {
                    while (fileM79813b.length() > 975000) {
                        c26788i.m79814c(fileM79813b);
                        fileM79813b = c26788i.m79813b();
                        if (!fileM79813b.exists()) {
                            fileM79813b.createNewFile();
                        }
                    }
                    byte[] bytes = (AbstractC39421y.m125926K(str, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, "", false) + (char) 0).getBytes(AbstractC39397a.f169546a);
                    AbstractC22676k.m65749i(bytes, "this as java.lang.String).getBytes(charset)");
                    c26788i.m79822k(bytes, fileM79813b, true);
                } else {
                    try {
                        fileM79813b.createNewFile();
                        while (fileM79813b.length() > 975000) {
                            c26788i.m79814c(fileM79813b);
                            fileM79813b = c26788i.m79813b();
                            if (!fileM79813b.exists()) {
                                try {
                                    fileM79813b.createNewFile();
                                } catch (IOException e5) {
                                    c37199o.m119225g("Failed to create new storage file: " + e5.getMessage());
                                    interfaceC14544a.error("Failed to create new storage file: " + fileM79813b.getPath());
                                }
                            }
                        }
                        byte[] bytes2 = (AbstractC39421y.m125926K(str, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, "", false) + (char) 0).getBytes(AbstractC39397a.f169546a);
                        AbstractC22676k.m65749i(bytes2, "this as java.lang.String).getBytes(charset)");
                        c26788i.m79822k(bytes2, fileM79813b, true);
                    } catch (IOException e13) {
                        c37199o.m119225g("Failed to create new storage file: " + e13.getMessage());
                        interfaceC14544a.error("Failed to create new storage file: " + fileM79813b.getPath());
                    }
                }
            }
            writeMutex.mo68214i(null);
            return C23454a0.f92919a;
        } catch (Throwable th3) {
            writeMutex.mo68214i(null);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m79821j(List list, File file, boolean z4) {
        InterfaceC14544a interfaceC14544a = this.f106696d;
        C37199o c37199o = this.f106697e;
        try {
            String strM74110N0 = AbstractC25265s.m74110N0(list, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, null, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, C26787h.f106690w, 26);
            file.createNewFile();
            byte[] bytes = strM74110N0.getBytes(AbstractC39397a.f169546a);
            AbstractC22676k.m65749i(bytes, "this as java.lang.String).getBytes(charset)");
            m79822k(bytes, file, z4);
            m79818g(file);
        } catch (IOException e5) {
            c37199o.m119225g("Failed to create or write to split file: " + e5.getMessage());
            interfaceC14544a.error("Failed to create or write to split file: " + file.getPath());
        } catch (Exception e13) {
            c37199o.m119225g("Failed to write to split file: " + e13.getMessage());
            interfaceC14544a.error("Failed to write to split file: " + file.getPath() + " for error: " + e13.getMessage());
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m79822k(byte[] bArr, File file, boolean z4) {
        InterfaceC14544a interfaceC14544a = this.f106696d;
        C37199o c37199o = this.f106697e;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, z4);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC35854l.m113829i(fileOutputStream, th3);
                    throw th4;
                }
            }
        } catch (FileNotFoundException e5) {
            c37199o.m119225g("Error writing to file: " + e5.getMessage());
            interfaceC14544a.error("File not found: " + file.getPath());
        } catch (IOException e13) {
            c37199o.m119225g("Error writing to file: " + e13.getMessage());
            interfaceC14544a.error("Failed to write to file: " + file.getPath());
        } catch (SecurityException e14) {
            c37199o.m119225g("Error writing to file: " + e14.getMessage());
            interfaceC14544a.error("Security exception when saving event: " + e14.getMessage());
        } catch (Exception e15) {
            c37199o.m119225g("Error writing to file: " + e15.getMessage());
            interfaceC14544a.error("Failed to write to file: " + file.getPath());
        }
    }
}
