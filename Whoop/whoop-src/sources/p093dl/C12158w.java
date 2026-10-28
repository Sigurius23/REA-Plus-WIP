package p093dl;

import com.bumptech.glide.EnumC4962d;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p167g5.InterfaceC15485d;
import p586wk.EnumC37323a;
import p618xk.InterfaceC38413d;
import p618xk.InterfaceC38414e;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: dl.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C12158w implements InterfaceC38414e, InterfaceC38413d {

    /* JADX INFO: renamed from: E */
    public InterfaceC38413d f40411E;

    /* JADX INFO: renamed from: F */
    public List f40412F;

    /* JADX INFO: renamed from: G */
    public boolean f40413G;

    /* JADX INFO: renamed from: w */
    public final ArrayList f40414w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC15485d f40415x;

    /* JADX INFO: renamed from: y */
    public int f40416y;

    /* JADX INFO: renamed from: z */
    public EnumC4962d f40417z;

    public C12158w(ArrayList arrayList, InterfaceC15485d interfaceC15485d) {
        this.f40415x = interfaceC15485d;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f40414w = arrayList;
        this.f40416y = 0;
    }

    @Override // p618xk.InterfaceC38414e
    /* JADX INFO: renamed from: a */
    public final void mo33597a() {
        List list = this.f40412F;
        if (list != null) {
            this.f40415x.mo43683a(list);
        }
        this.f40412F = null;
        Iterator it = this.f40414w.iterator();
        while (it.hasNext()) {
            ((InterfaceC38414e) it.next()).mo33597a();
        }
    }

    @Override // p618xk.InterfaceC38414e
    /* JADX INFO: renamed from: b */
    public final Class mo33598b() {
        return ((InterfaceC38414e) this.f40414w.get(0)).mo33598b();
    }

    @Override // p618xk.InterfaceC38413d
    /* JADX INFO: renamed from: c */
    public final void mo33617c(Exception exc) {
        List list = this.f40412F;
        AbstractC29125c.m88539p(list, "Argument must not be null");
        list.add(exc);
        m33619g();
    }

    @Override // p618xk.InterfaceC38414e
    public final void cancel() {
        this.f40413G = true;
        Iterator it = this.f40414w.iterator();
        while (it.hasNext()) {
            ((InterfaceC38414e) it.next()).cancel();
        }
    }

    @Override // p618xk.InterfaceC38414e
    /* JADX INFO: renamed from: d */
    public final EnumC37323a mo33599d() {
        return ((InterfaceC38414e) this.f40414w.get(0)).mo33599d();
    }

    @Override // p618xk.InterfaceC38414e
    /* JADX INFO: renamed from: e */
    public final void mo33600e(EnumC4962d enumC4962d, InterfaceC38413d interfaceC38413d) {
        this.f40417z = enumC4962d;
        this.f40411E = interfaceC38413d;
        this.f40412F = (List) this.f40415x.mo43684b();
        ((InterfaceC38414e) this.f40414w.get(this.f40416y)).mo33600e(enumC4962d, this);
        if (this.f40413G) {
            cancel();
        }
    }

    @Override // p618xk.InterfaceC38413d
    /* JADX INFO: renamed from: f */
    public final void mo33618f(Object obj) {
        if (obj != null) {
            this.f40411E.mo33618f(obj);
        } else {
            m33619g();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m33619g() {
        if (this.f40413G) {
            return;
        }
        if (this.f40416y < this.f40414w.size() - 1) {
            this.f40416y++;
            mo33600e(this.f40417z, this.f40411E);
        } else {
            AbstractC29125c.m88538o(this.f40412F);
            this.f40411E.mo33617c(new GlideException("Fetch failed", new ArrayList(this.f40412F)));
        }
    }
}
