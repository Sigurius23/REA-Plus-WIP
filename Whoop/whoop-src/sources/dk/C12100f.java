package dk;

import android.content.SharedPreferences;
import bc3.AbstractC3076z;
import bc3.InterfaceC2994c0;
import fk.InterfaceC14544a;
import ge3.AbstractC15751g;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25260n;
import m83.AbstractC25267u;
import p014aj.C0929d;
import p173gj.C15906g;
import p223ik.EnumC18597a;
import p223ik.InterfaceC18598b;
import p255jk.C21743a;
import p282kk.C22533b;
import p343nk.C26781b;
import p343nk.C26784e;
import p343nk.C26788i;
import p343nk.C26792m;
import p505ts.AbstractC34132o;
import p581we.C37199o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: dk.f */
/* JADX INFO: loaded from: classes.dex */
public final class C12100f implements InterfaceC18598b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC14544a f40290a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f40291b;

    /* JADX INFO: renamed from: c */
    public final C26788i f40292c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f40293d;

    public C12100f(String storageKey, InterfaceC14544a logger, SharedPreferences sharedPreferences, File file, C37199o diagnostics) {
        AbstractC22676k.m65750j(storageKey, "storageKey");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(diagnostics, "diagnostics");
        this.f40290a = logger;
        this.f40291b = sharedPreferences;
        this.f40292c = new C26788i(file, storageKey, new C0929d(sharedPreferences), logger, diagnostics);
        this.f40293d = new LinkedHashMap();
    }

    @Override // p223ik.InterfaceC18598b
    /* JADX INFO: renamed from: a */
    public final List mo33424a() {
        C26788i c26788i = this.f40292c;
        File[] fileArrListFiles = c26788i.f106693a.listFiles(new C26781b(c26788i, 0));
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        List listM74041Q0 = AbstractC25260n.m74041Q0(fileArrListFiles, new C26784e(c26788i));
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM74041Q0, 10));
        Iterator it = listM74041Q0.iterator();
        while (it.hasNext()) {
            arrayList.add(((File) it.next()).getAbsolutePath());
        }
        return arrayList;
    }

    @Override // p223ik.InterfaceC18598b
    /* JADX INFO: renamed from: b */
    public final void mo33425b(EnumC18597a enumC18597a, String str) {
        SharedPreferences.Editor editorEdit = this.f40291b.edit();
        editorEdit.putString(enumC18597a.f72681w, str);
        editorEdit.apply();
    }

    @Override // p223ik.InterfaceC18598b
    /* JADX INFO: renamed from: c */
    public final String mo33426c(EnumC18597a key) {
        AbstractC22676k.m65750j(key, "key");
        return this.f40291b.getString(key.f72681w, null);
    }

    @Override // p223ik.InterfaceC18598b
    /* JADX INFO: renamed from: d */
    public final Object mo33427d(Object obj, InterfaceC30057d interfaceC30057d) {
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.String");
        return this.f40292c.m79815d((String) obj, (AbstractC32269c) interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p223ik.InterfaceC18598b
    /* JADX INFO: renamed from: e */
    public final Object mo33428e(C21743a event, AbstractC32269c abstractC32269c) {
        C12099e c12099e;
        if (abstractC32269c instanceof C12099e) {
            c12099e = (C12099e) abstractC32269c;
            int i13 = c12099e.f40285E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12099e.f40285E = i13 - Integer.MIN_VALUE;
            } else {
                c12099e = new C12099e(this, abstractC32269c);
            }
        } else {
            c12099e = new C12099e(this, abstractC32269c);
        }
        Object obj = c12099e.f40288y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12099e.f40285E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            AbstractC22676k.m65750j(event, "event");
            String string = AbstractC15751g.m44469v(event).toString();
            AbstractC22676k.m65749i(string, "eventToJsonObject(event).toString()");
            c12099e.f40286w = this;
            c12099e.f40287x = event;
            c12099e.f40285E = 1;
            if (this.f40292c.m79820i(string, c12099e) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            event = c12099e.f40287x;
            AbstractC34132o.m107864I(obj);
        }
        event.getClass();
        return C23454a0.f92919a;
    }

    @Override // p223ik.InterfaceC18598b
    /* JADX INFO: renamed from: f */
    public final Object mo33429f(AbstractC32269c abstractC32269c) {
        Object objM79819h = this.f40292c.m79819h(abstractC32269c);
        return objM79819h == EnumC31071a.f128113w ? objM79819h : C23454a0.f92919a;
    }

    @Override // p223ik.InterfaceC18598b
    /* JADX INFO: renamed from: g */
    public final C26792m mo33430g(C22533b c22533b, C15906g c15906g, InterfaceC2994c0 scope, AbstractC3076z abstractC3076z) {
        AbstractC22676k.m65750j(scope, "scope");
        return new C26792m(this, c22533b, c15906g, scope, abstractC3076z, this.f40290a);
    }

    /* JADX INFO: renamed from: h */
    public final void m33431h(String filePath) {
        AbstractC22676k.m65750j(filePath, "filePath");
        C26788i c26788i = this.f40292c;
        c26788i.getClass();
        c26788i.f106700h.remove(filePath);
    }

    /* JADX INFO: renamed from: i */
    public final void m33432i(String filePath) {
        AbstractC22676k.m65750j(filePath, "filePath");
        this.f40292c.m79817f(filePath);
    }
}
