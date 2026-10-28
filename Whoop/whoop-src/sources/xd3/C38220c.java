package xd3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import ne3.C26611e0;
import ne3.InterfaceC26633p0;
import p031b9.C2817b;
import p715kotlin.jvm.internal.AbstractC22676k;
import wd3.AbstractC37172f;
import wd3.AbstractC37174h;

/* JADX INFO: renamed from: xd3.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C38220c {

    /* JADX INFO: renamed from: a */
    public final String f163814a;

    /* JADX INFO: renamed from: b */
    public final long[] f163815b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f163816c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f163817d;

    /* JADX INFO: renamed from: e */
    public boolean f163818e;

    /* JADX INFO: renamed from: f */
    public boolean f163819f;

    /* JADX INFO: renamed from: g */
    public C2817b f163820g;

    /* JADX INFO: renamed from: h */
    public int f163821h;

    /* JADX INFO: renamed from: i */
    public long f163822i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C38223f f163823j;

    public C38220c(C38223f c38223f, String key) {
        AbstractC22676k.m65750j(key, "key");
        this.f163823j = c38223f;
        this.f163814a = key;
        c38223f.getClass();
        this.f163815b = new long[2];
        this.f163816c = new ArrayList();
        this.f163817d = new ArrayList();
        StringBuilder sb4 = new StringBuilder(key);
        sb4.append('.');
        int length = sb4.length();
        for (int i13 = 0; i13 < 2; i13++) {
            sb4.append(i13);
            ArrayList arrayList = this.f163816c;
            C26611e0 c26611e0 = this.f163823j.f163848w;
            String string = sb4.toString();
            AbstractC22676k.m65749i(string, "toString(...)");
            arrayList.add(c26611e0.m79176e(string));
            sb4.append(".tmp");
            ArrayList arrayList2 = this.f163817d;
            C26611e0 c26611e1 = this.f163823j.f163848w;
            String string2 = sb4.toString();
            AbstractC22676k.m65749i(string2, "toString(...)");
            arrayList2.add(c26611e1.m79176e(string2));
            sb4.setLength(length);
        }
    }

    /* JADX INFO: renamed from: a */
    public final C38221d m122490a() {
        TimeZone timeZone = AbstractC37174h.f158962a;
        if (!this.f163818e) {
            return null;
        }
        C38223f c38223f = this.f163823j;
        if (!c38223f.f163840L && (this.f163820g != null || this.f163819f)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        long[] jArr = (long[]) this.f163815b.clone();
        for (int i13 = 0; i13 < 2; i13++) {
            try {
                InterfaceC26633p0 interfaceC26633p0Mo79155x0 = c38223f.f163849x.mo79155x0((C26611e0) this.f163816c.get(i13));
                if (!c38223f.f163840L) {
                    this.f163821h++;
                    interfaceC26633p0Mo79155x0 = new C38219b(interfaceC26633p0Mo79155x0, c38223f, this);
                }
                arrayList.add(interfaceC26633p0Mo79155x0);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC37172f.m119117b((InterfaceC26633p0) it.next());
                }
                try {
                    c38223f.m122496b0(this);
                    return null;
                } catch (IOException unused2) {
                    return null;
                }
            }
        }
        return new C38221d(this.f163823j, this.f163814a, this.f163822i, arrayList, jArr);
    }
}
