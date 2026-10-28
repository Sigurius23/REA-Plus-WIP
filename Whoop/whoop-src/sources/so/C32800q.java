package so;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import bc3.AbstractC3006f0;
import bi.C3278p;
import com.google.android.gms.tasks.Task;
import e93.AbstractC12889b;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13081r1;
import i93.C18283i;
import i93.C18284j;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l83.C23467m;
import l83.C23468n;
import m83.AbstractC25243e0;
import m83.C25271y;
import n30.C26212c;
import n30.InterfaceC26213d;
import o23.C27486p;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p073cq.C11040i;
import p073cq.InterfaceC11033b;
import p073cq.InterfaceC11035d;
import p075ct.C11105a;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p505ts.C34122e;
import p505ts.C34125h;
import p565vy.InterfaceC36562b;
import p598wy.InterfaceC37689b;
import p695zx.C41179a;
import p695zx.C41185g;
import p695zx.InterfaceC41184f;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29203o;
import q30.C29938w0;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import ro.C31624i;
import s83.AbstractC32269c;
import t30.C33521w;
import va3.AbstractC35854l;
import w23.C36750h;
import x23.EnumC37870f;
import y00.C38783b;
import y00.C38883l;
import z00.C39932a;

/* JADX INFO: renamed from: so.q */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C32800q implements InterfaceC11033b, InterfaceC11035d, InterfaceC37689b, InterfaceC41184f {

    /* JADX INFO: renamed from: w */
    public Object f136504w;

    /* JADX INFO: renamed from: x */
    public Object f136505x;

    public /* synthetic */ C32800q(Object obj, Object obj2) {
        this.f136504w = obj;
        this.f136505x = obj2;
    }

    @Override // p073cq.InterfaceC11033b
    /* JADX INFO: renamed from: a */
    public Object mo11178a(Task task) {
        Bundle bundle;
        C32785b c32785b = (C32785b) this.f136504w;
        Bundle bundle2 = (Bundle) this.f136505x;
        c32785b.getClass();
        return (task.isSuccessful() && (bundle = (Bundle) task.getResult()) != null && bundle.containsKey("google.messenger")) ? c32785b.m102845a(bundle2).onSuccessTask(ExecutorC32799p.f136503w, C32788e.f136476x) : task;
    }

    /* JADX INFO: renamed from: b */
    public C34122e m102858b() throws GeneralSecurityException {
        C31624i c31624i;
        C34125h c34125h = (C34125h) this.f136504w;
        if (c34125h == null || (c31624i = (C31624i) this.f136505x) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c34125h.f143056a == ((C11105a) c31624i.f130665x).f35302a.length) {
            return new C34122e(c34125h, c31624i);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public Object m102859c(String str, AbstractC32269c abstractC32269c) {
        C33521w c33521w;
        C32800q c32800q;
        Object objM107888l;
        if (abstractC32269c instanceof C33521w) {
            c33521w = (C33521w) abstractC32269c;
            int i13 = c33521w.f139943E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c33521w.f139943E = i13 - Integer.MIN_VALUE;
            } else {
                c33521w = new C33521w(this, abstractC32269c);
            }
        } else {
            c33521w = new C33521w(this, abstractC32269c);
        }
        Object objM8705K = c33521w.f139946y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c33521w.f139943E;
        InterfaceC30057d interfaceC30057d = null;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            try {
                InterfaceC26213d interfaceC26213d = (InterfaceC26213d) this.f136504w;
                InterfaceC30063j interfaceC30063j = (InterfaceC30063j) this.f136505x;
                C29938w0 c29938w0 = new C29938w0(str, interfaceC26213d, interfaceC30063j);
                c33521w.f139944w = this;
                c33521w.f139945x = str;
                c33521w.f139943E = 1;
                objM8705K = AbstractC3006f0.m8705K(interfaceC30063j, new C27486p(c29938w0, interfaceC30057d, 6), c33521w);
                if (objM8705K == enumC31071a) {
                    return enumC31071a;
                }
                c32800q = this;
            } catch (Throwable th3) {
                th = th3;
                c32800q = this;
                objM107888l = AbstractC34132o.m107888l(th);
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c33521w.f139945x;
            c32800q = c33521w.f139944w;
            try {
                AbstractC34132o.m107864I(objM8705K);
            } catch (Throwable th4) {
                th = th4;
                objM107888l = AbstractC34132o.m107888l(th);
            }
        }
        InputStream inputStream = (InputStream) objM8705K;
        if (inputStream != null) {
            try {
                objM107888l = BitmapFactory.decodeStream(inputStream);
                inputStream.close();
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    AbstractC35854l.m113829i(inputStream, th5);
                    throw th6;
                }
            }
        } else {
            objM107888l = null;
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            ((C26212c) ((InterfaceC26213d) c32800q.f136504w)).m77828c(new RuntimeException(AbstractC11895b.m31996o("Could not get bitmap from url: ", str, "."), thM68037a));
        }
        if (objM107888l instanceof C23467m) {
            return null;
        }
        return objM107888l;
    }

    @Override // p695zx.InterfaceC41184f
    /* JADX INFO: renamed from: d */
    public Object mo102860d(C41185g c41185g, InterfaceC30057d interfaceC30057d) {
        C41179a c41179a = c41185g.f177699g;
        if (c41179a == null) {
            return null;
        }
        Object obj = ((C3278p) this.f136504w).f12803a.get(c41179a);
        if (obj == null) {
            obj = C25271y.f99162w;
        }
        return obj == EnumC31071a.f128113w ? obj : (List) obj;
    }

    /* JADX INFO: renamed from: e */
    public List m102861e() {
        return (List) this.f136504w;
    }

    /* JADX INFO: renamed from: f */
    public void m102862f(C31624i c31624i) {
        this.f136505x = c31624i;
    }

    /* JADX INFO: renamed from: g */
    public void m102863g() {
        this.f136505x = null;
    }

    @Override // p695zx.InterfaceC41184f
    public C13081r1 getLoading() {
        return (C13081r1) this.f136505x;
    }

    /* JADX INFO: renamed from: h */
    public void m102864h(C34125h c34125h) {
        this.f136504w = c34125h;
    }

    /* JADX INFO: renamed from: i */
    public void m102865i(EnumC37870f enumC37870f) {
        C13045h2 c13045h2 = (C13045h2) this.f136504w;
        while (true) {
            Object value = c13045h2.getValue();
            EnumC37870f enumC37870f2 = enumC37870f;
            if (c13045h2.m36569i(value, C36750h.m117871a((C36750h) value, null, null, null, enumC37870f2, null, 23))) {
                return;
            } else {
                enumC37870f = enumC37870f2;
            }
        }
    }

    @Override // p598wy.InterfaceC37689b
    /* JADX INFO: renamed from: m */
    public InterfaceC36562b mo8011m(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(0, jSONArrayOptJSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator it = c18284jM36278i0.iterator();
        while (((C18283i) it).f71138y) {
            int iNextInt = ((AbstractC25243e0) it).nextInt();
            C39932a c39932a = (C39932a) this.f136505x;
            JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(iNextInt);
            AbstractC22676k.m65749i(jSONObject2, "getJSONObject(...)");
            C38783b c38783bM128094a = c39932a.m128094a(jSONObject2);
            if (c38783bM128094a != null) {
                arrayList.add(c38783bM128094a);
            }
        }
        return new C38883l((C41179a) this.f136504w, arrayList);
    }

    @Override // p073cq.InterfaceC11035d
    /* JADX INFO: renamed from: q */
    public void mo944q(Task task) {
        ((Map) ((C29203o) this.f136505x).f118199x).remove((C11040i) this.f136504w);
    }

    public C32800q(int i13) {
        switch (i13) {
            case 5:
                C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(new C36750h(null, null, "", EnumC37870f.f162183w, "unknown"));
                this.f136504w = c13045h2M36593c;
                this.f136505x = AbstractC13091v.m36598h(c13045h2M36593c);
                break;
            default:
                this.f136504w = null;
                this.f136505x = null;
                break;
        }
    }
}
