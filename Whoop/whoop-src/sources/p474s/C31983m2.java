package p474s;

import ad3.AbstractC0757c;
import ad3.C0783z;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import c93.InterfaceC4339a;
import com.getkeepsafe.relinker.MissingLibraryException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import mc3.AbstractC25438d;
import mc3.C25437c;
import mc3.InterfaceC25435a;
import ne3.AbstractC26604b;
import ne3.C26617h0;
import ne3.C26621j0;
import ne3.InterfaceC26629n0;
import ne3.InterfaceC26631o0;
import ne3.InterfaceC26633p0;
import nf3.C26669a;
import p002a0.C0057v0;
import p005a3.C0237p;
import p075ct.C11105a;
import p167g5.C15487f;
import p167g5.InterfaceC15485d;
import p249jc.C21567b;
import p412q3.C29875i;
import p478s3.C32095a;
import p478s3.C32096b;
import p479s4.AbstractC32122c;
import p505ts.AbstractC34132o;
import p505ts.C34124g;
import p505ts.C34125h;
import p513u4.AbstractC34523k;
import p526ul.InterfaceC35055a;
import p526ul.InterfaceC35056b;
import p602x1.AbstractC37817c;
import p602x1.AbstractC37824j;
import p602x1.C37823i;
import p634y1.InterfaceC39032e;
import p652yl.C39615a;
import p652yl.C39616b;
import p652yl.C39617c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.InterfaceC29201n;
import q83.AbstractC30060g;
import r83.EnumC31071a;
import rf3.C31365d;
import s83.AbstractC32269c;
import ud3.AbstractC34846v0;
import ud3.C34818h0;
import uf3.C34911a;
import vg.C35962i;
import vg.C35972s;
import wc3.InterfaceC37145j;
import wc3.InterfaceC37147l;

/* JADX INFO: renamed from: s.m2 */
/* JADX INFO: loaded from: classes.dex */
public final class C31983m2 implements InterfaceC29201n, InterfaceC15485d, InterfaceC39032e, InterfaceC26631o0 {

    /* JADX INFO: renamed from: w */
    public Object f132768w;

    /* JADX INFO: renamed from: x */
    public Object f132769x;

    /* JADX INFO: renamed from: y */
    public Object f132770y;

    public /* synthetic */ C31983m2(Object obj, Object obj2, Object obj3) {
        this.f132768w = obj;
        this.f132769x = obj2;
        this.f132770y = obj3;
    }

    /* JADX INFO: renamed from: o */
    public static void m99477o(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
    }

    /* JADX INFO: renamed from: p */
    public static C31983m2 m99478p(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C31983m2(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* JADX INFO: renamed from: q */
    public static C31983m2 m99479q(Context context, AttributeSet attributeSet, int[] iArr, int i13) {
        return new C31983m2(context, context.obtainStyledAttributes(attributeSet, iArr, i13, 0));
    }

    @Override // p167g5.InterfaceC15485d
    /* JADX INFO: renamed from: a */
    public boolean mo43683a(Object obj) {
        if (obj instanceof InterfaceC35056b) {
            ((InterfaceC35056b) obj).mo9724b().m110830a(true);
        }
        switch (((C21567b) this.f132769x).f82710w) {
            case 25:
                break;
            default:
                ((List) obj).clear();
                break;
        }
        return ((C15487f) this.f132770y).mo43683a(obj);
    }

    @Override // p167g5.InterfaceC15485d
    /* JADX INFO: renamed from: b */
    public Object mo43684b() {
        Object objMo43684b = ((C15487f) this.f132770y).mo43684b();
        if (objMo43684b == null) {
            objMo43684b = ((InterfaceC35055a) this.f132768w).create();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + objMo43684b.getClass());
            }
        }
        if (objMo43684b instanceof InterfaceC35056b) {
            ((InterfaceC35056b) objMo43684b).mo9724b().m110830a(false);
        }
        return objMo43684b;
    }

    /* JADX INFO: renamed from: c */
    public C34125h m99480c() throws GeneralSecurityException {
        Integer num = (Integer) this.f132768w;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (((C34124g) this.f132769x) != null) {
            return new C34125h(num.intValue(), (C34124g) this.f132769x, (C11105a) this.f132770y);
        }
        throw new GeneralSecurityException("hash type is not set");
    }

    @Override // ne3.InterfaceC26631o0
    public void cancel() {
        ((InterfaceC26631o0) this.f132768w).cancel();
    }

    @Override // pg3.InterfaceC29201n
    public Object convert(Object obj) {
        C0783z c0783z = (C0783z) this.f132770y;
        C34818h0 contentType = (C34818h0) this.f132768w;
        InterfaceC37145j saver = (InterfaceC37145j) this.f132769x;
        c0783z.getClass();
        AbstractC22676k.m65750j(contentType, "contentType");
        AbstractC22676k.m65750j(saver, "saver");
        AbstractC34846v0 abstractC34846v0Create = AbstractC34846v0.create(contentType, ((AbstractC0757c) ((InterfaceC37147l) c0783z.f2818x)).m1833d(saver, obj));
        AbstractC22676k.m65749i(abstractC34846v0Create, "create(...)");
        return abstractC34846v0Create;
    }

    @Override // ne3.InterfaceC26631o0
    /* JADX INFO: renamed from: d */
    public InterfaceC26629n0 mo14152d() {
        return (C26617h0) this.f132770y;
    }

    /* JADX INFO: renamed from: e */
    public void m99481e() {
        HashSet hashSet = (HashSet) this.f132770y;
        C26669a c26669a = (C26669a) this.f132768w;
        if (!hashSet.isEmpty()) {
            if (c26669a.f106048c.m92137D(1)) {
                c26669a.f106048c.m92139r("Creating eager instances ...");
            }
            C0237p c0237p = new C0237p(c26669a, c26669a.f106046a.f159364d, (C34911a) null);
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((C31365d) it.next()).mo96459b(c0237p);
            }
        }
        hashSet.clear();
    }

    /* JADX INFO: renamed from: f */
    public Object m99482f() {
        long jM121342c = AbstractC37817c.m121342c();
        if (jM121342c == AbstractC37824j.f161982a) {
            return this.f132770y;
        }
        C37823i c37823i = (C37823i) ((AtomicReference) this.f132768w).get();
        int iM121356a = c37823i.m121356a(jM121342c);
        if (iM121356a >= 0) {
            return c37823i.f161981c[iM121356a];
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    /* JADX INFO: renamed from: g */
    public Object m99483g(AbstractC32269c abstractC32269c) throws Throwable {
        C35962i c35962i;
        InterfaceC25435a interfaceC25435a;
        int i13;
        InterfaceC25435a interfaceC25435a2;
        Throwable th3;
        C31983m2 c31983m2;
        if (abstractC32269c instanceof C35962i) {
            c35962i = (C35962i) abstractC32269c;
            int i14 = c35962i.f153128F;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c35962i.f153128F = i14 - Integer.MIN_VALUE;
            } else {
                c35962i = new C35962i(this, abstractC32269c);
            }
        } else {
            c35962i = new C35962i(this, abstractC32269c);
        }
        Object obj = c35962i.f153132z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c35962i.f153128F;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(obj);
                interfaceC25435a = (C25437c) this.f132768w;
                c35962i.f153129w = interfaceC25435a;
                i13 = 0;
                c35962i.f153131y = 0;
                c35962i.f153128F = 1;
                if (interfaceC25435a.mo68211b(c35962i) != enumC31071a) {
                }
                return enumC31071a;
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c31983m2 = c35962i.f153130x;
                interfaceC25435a2 = c35962i.f153129w;
                try {
                    AbstractC34132o.m107864I(obj);
                    c31983m2.f132770y = obj;
                    this.f132769x = null;
                    Object obj2 = this.f132770y;
                    interfaceC25435a2.mo68214i(null);
                    return obj2;
                } catch (Throwable th4) {
                    th3 = th4;
                    interfaceC25435a2.mo68214i(null);
                    throw th3;
                }
            }
            i13 = c35962i.f153131y;
            InterfaceC25435a interfaceC25435a3 = c35962i.f153129w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a3;
            if (this.f132770y == C35972s.f153161a) {
                ?? r10 = this.f132769x;
                AbstractC22676k.m65747g(r10);
                c35962i.f153129w = interfaceC25435a;
                c35962i.f153130x = this;
                c35962i.f153131y = i13;
                c35962i.f153128F = 2;
                Object objInvoke = r10.invoke(c35962i);
                if (objInvoke != enumC31071a) {
                    interfaceC25435a2 = interfaceC25435a;
                    obj = objInvoke;
                    c31983m2 = this;
                    c31983m2.f132770y = obj;
                    this.f132769x = null;
                }
                return enumC31071a;
            }
            interfaceC25435a2 = interfaceC25435a;
            Object obj3 = this.f132770y;
            interfaceC25435a2.mo68214i(null);
            return obj3;
        } catch (Throwable th5) {
            interfaceC25435a2 = interfaceC25435a;
            th3 = th5;
            interfaceC25435a2.mo68214i(null);
            throw th3;
        }
    }

    @Override // ne3.InterfaceC26631o0
    public InterfaceC26633p0 getSource() {
        return (C26621j0) this.f132769x;
    }

    /* JADX INFO: renamed from: h */
    public ColorStateList m99484h(int i13) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = (TypedArray) this.f132769x;
        return (!typedArray.hasValue(i13) || (resourceId = typedArray.getResourceId(i13, 0)) == 0 || (colorStateList = AbstractC32122c.getColorStateList((Context) this.f132768w, resourceId)) == null) ? typedArray.getColorStateList(i13) : colorStateList;
    }

    /* JADX INFO: renamed from: i */
    public C32096b m99485i() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((C21567b) this.f132770y)) {
            try {
                C32096b c32096b = (C32096b) this.f132769x;
                if (c32096b != null && localeList == ((LocaleList) this.f132768w)) {
                    return c32096b;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i13 = 0; i13 < size; i13++) {
                    arrayList.add(new C32095a(localeList.get(i13)));
                }
                C32096b c32096b2 = new C32096b(arrayList);
                this.f132768w = localeList;
                this.f132769x = c32096b2;
                return c32096b2;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public Drawable m99486j(int i13) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f132769x;
        return (!typedArray.hasValue(i13) || (resourceId = typedArray.getResourceId(i13, 0)) == 0) ? typedArray.getDrawable(i13) : AbstractC30060g.m92133x((Context) this.f132768w, resourceId);
    }

    /* JADX INFO: renamed from: k */
    public Drawable m99487k(int i13) {
        int resourceId;
        Drawable drawableM99426d;
        if (!((TypedArray) this.f132769x).hasValue(i13) || (resourceId = ((TypedArray) this.f132769x).getResourceId(i13, 0)) == 0) {
            return null;
        }
        C31992p c31992pM99505a = C31992p.m99505a();
        Context context = (Context) this.f132768w;
        synchronized (c31992pM99505a) {
            drawableM99426d = c31992pM99505a.f132798a.m99426d(context, resourceId, true);
        }
        return drawableM99426d;
    }

    /* JADX INFO: renamed from: l */
    public Typeface m99488l(int i13, int i14, C31985n0 c31985n0) {
        int resourceId = ((TypedArray) this.f132769x).getResourceId(i13, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f132770y) == null) {
            this.f132770y = new TypedValue();
        }
        Context context = (Context) this.f132768w;
        TypedValue typedValue = (TypedValue) this.f132770y;
        ThreadLocal threadLocal = AbstractC34523k.f145117a;
        if (context.isRestricted()) {
            return null;
        }
        return AbstractC34523k.m109099c(context, resourceId, typedValue, i14, c31985n0, true, false);
    }

    /* JADX INFO: renamed from: m */
    public File m99489m(Context context, String str) {
        ((C39617c) this.f132769x).getClass();
        return new File(context.getDir("lib", 0), C39617c.m126594b(str));
    }

    /* JADX INFO: renamed from: n */
    public void m99490n(Context context, String str) throws Throwable {
        String[] strArrM126588d;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        C39617c c39617c = (C39617c) this.f132769x;
        HashSet hashSet = (HashSet) this.f132768w;
        if (hashSet.contains(str)) {
            m99477o("%s already loaded previously!", str);
            return;
        }
        C29875i c29875i = null;
        try {
            c39617c.getClass();
            System.loadLibrary(str);
            hashSet.add(str);
            m99477o("%s (%s) was loaded normally!", str, null);
        } catch (UnsatisfiedLinkError e5) {
            m99477o("Loading the library normally failed: %s", Log.getStackTraceString(e5));
            m99477o("%s (%s) was not loaded normally, re-linking...", str, null);
            File fileM99489m = m99489m(context, str);
            if (!fileM99489m.exists()) {
                File dir = context.getDir("lib", 0);
                File fileM99489m2 = m99489m(context, str);
                c39617c.getClass();
                File[] fileArrListFiles = dir.listFiles(new C39616b(C39617c.m126594b(str)));
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        if (!file.getAbsolutePath().equals(fileM99489m2.getAbsolutePath())) {
                            file.delete();
                        }
                    }
                }
                C39615a c39615a = (C39615a) this.f132770y;
                String[] strArr = Build.SUPPORTED_ABIS;
                if (strArr.length <= 0) {
                    String str2 = Build.CPU_ABI2;
                    strArr = (str2 == null || str2.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str2};
                }
                String strM126594b = C39617c.m126594b(str);
                c39615a.getClass();
                try {
                    C29875i c29875iM126586b = C39615a.m126586b(context, strArr, strM126594b);
                    try {
                        if (c29875iM126586b == null) {
                            try {
                                strArrM126588d = C39615a.m126588d(context, strM126594b);
                            } catch (Exception e13) {
                                strArrM126588d = new String[]{e13.toString()};
                            }
                            throw new MissingLibraryException(strM126594b, strArr, strArrM126588d);
                        }
                        ZipFile zipFile = (ZipFile) c29875iM126586b.f122095w;
                        int i13 = 0;
                        while (true) {
                            int i14 = i13 + 1;
                            if (i13 >= 5) {
                                break;
                            }
                            m99477o("Found %s! Extracting...", strM126594b);
                            try {
                                if (fileM99489m.exists() || fileM99489m.createNewFile()) {
                                    try {
                                        inputStream2 = zipFile.getInputStream((ZipEntry) c29875iM126586b.f122096x);
                                        try {
                                            fileOutputStream2 = new FileOutputStream(fileM99489m);
                                            try {
                                                byte[] bArr = new byte[4096];
                                                long j7 = 0;
                                                while (true) {
                                                    int i15 = inputStream2.read(bArr);
                                                    if (i15 == -1) {
                                                        break;
                                                    }
                                                    fileOutputStream2.write(bArr, 0, i15);
                                                    j7 += (long) i15;
                                                    inputStream2 = inputStream2;
                                                }
                                                fileOutputStream2.flush();
                                                try {
                                                    fileOutputStream2.getFD().sync();
                                                    if (j7 == fileM99489m.length()) {
                                                        C39615a.m126585a(inputStream2);
                                                        C39615a.m126585a(fileOutputStream2);
                                                        fileM99489m.setReadable(true, false);
                                                        fileM99489m.setExecutable(true, false);
                                                        fileM99489m.setWritable(true);
                                                        break;
                                                    }
                                                } catch (FileNotFoundException | IOException unused) {
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    inputStream = inputStream2;
                                                    fileOutputStream = fileOutputStream2;
                                                    C39615a.m126585a(inputStream);
                                                    C39615a.m126585a(fileOutputStream);
                                                    throw th;
                                                }
                                            } catch (FileNotFoundException unused2) {
                                                inputStream2 = inputStream2;
                                            } catch (IOException unused3) {
                                                inputStream2 = inputStream2;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                inputStream = inputStream2;
                                            }
                                        } catch (FileNotFoundException unused4) {
                                            fileOutputStream2 = null;
                                            C39615a.m126585a(inputStream2);
                                            C39615a.m126585a(fileOutputStream2);
                                            i13 = i14;
                                        } catch (IOException unused5) {
                                            fileOutputStream2 = null;
                                            C39615a.m126585a(inputStream2);
                                            C39615a.m126585a(fileOutputStream2);
                                            i13 = i14;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            inputStream = inputStream2;
                                            fileOutputStream = null;
                                            C39615a.m126585a(inputStream);
                                            C39615a.m126585a(fileOutputStream);
                                            throw th;
                                        }
                                    } catch (FileNotFoundException unused6) {
                                        inputStream2 = null;
                                    } catch (IOException unused7) {
                                        inputStream2 = null;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        inputStream = null;
                                    }
                                    C39615a.m126585a(inputStream2);
                                    C39615a.m126585a(fileOutputStream2);
                                }
                            } catch (IOException unused8) {
                            }
                            i13 = i14;
                        }
                        try {
                            zipFile.close();
                        } catch (IOException unused9) {
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        c29875i = c29875iM126586b;
                        if (c29875i != null) {
                            try {
                                ((ZipFile) c29875i.f122095w).close();
                            } catch (IOException unused10) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th8) {
                    th = th8;
                }
            }
            String absolutePath = fileM99489m.getAbsolutePath();
            c39617c.getClass();
            System.load(absolutePath);
            hashSet.add(str);
            m99477o("%s (%s) was re-linked!", str, null);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m99491r() {
        ((TypedArray) this.f132769x).recycle();
    }

    /* JADX INFO: renamed from: s */
    public void m99492s(Object obj) {
        long jM121342c = AbstractC37817c.m121342c();
        if (jM121342c == AbstractC37824j.f161982a) {
            this.f132770y = obj;
            return;
        }
        synchronized (this.f132769x) {
            C37823i c37823i = (C37823i) ((AtomicReference) this.f132768w).get();
            int iM121356a = c37823i.m121356a(jM121342c);
            if (iM121356a < 0) {
                ((AtomicReference) this.f132768w).set(c37823i.m121357b(jM121342c, obj));
            } else {
                c37823i.f161981c[iM121356a] = obj;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public void m99493t(int i13) throws InvalidAlgorithmParameterException {
        if (i13 < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit or larger are supported", Integer.valueOf(i13 * 8)));
        }
        this.f132768w = Integer.valueOf(i13);
    }

    /* JADX INFO: renamed from: u */
    public void m99494u() {
        C0057v0 c0057v0 = (C0057v0) this.f132768w;
        String str = (String) this.f132769x;
        List list = (List) c0057v0.m133k(str);
        if (list != null) {
            list.remove((InterfaceC4339a) this.f132770y);
        }
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        c0057v0.m135m(str, list);
    }

    public C31983m2(InterfaceC26631o0 interfaceC26631o0) {
        this.f132768w = interfaceC26631o0;
        this.f132769x = AbstractC26604b.m79158c(interfaceC26631o0.getSource());
        this.f132770y = AbstractC26604b.m79157b(interfaceC26631o0.mo14152d());
    }

    public C31983m2(Function1 function1) {
        this.f132768w = AbstractC25438d.m74669a();
        this.f132769x = function1;
        this.f132770y = C35972s.f153161a;
    }

    public C31983m2(int i13) {
        switch (i13) {
            case 3:
                this.f132768w = new WeakHashMap();
                this.f132769x = new WeakHashMap();
                this.f132770y = new WeakHashMap();
                break;
            case 10:
                this.f132768w = new AtomicReference(AbstractC37817c.f161962c);
                this.f132769x = new Object();
                break;
            case 12:
                C39617c c39617c = new C39617c();
                C39615a c39615a = new C39615a();
                this.f132768w = new HashSet();
                this.f132769x = c39617c;
                this.f132770y = c39615a;
                break;
            default:
                this.f132770y = new C21567b(23);
                break;
        }
    }

    public C31983m2(Context context, TypedArray typedArray) {
        this.f132768w = context;
        this.f132769x = typedArray;
    }

    public C31983m2(C15487f c15487f, InterfaceC35055a interfaceC35055a, C21567b c21567b) {
        this.f132770y = c15487f;
        this.f132768w = interfaceC35055a;
        this.f132769x = c21567b;
    }
}
