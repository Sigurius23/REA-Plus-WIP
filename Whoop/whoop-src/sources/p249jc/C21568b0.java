package p249jc;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.io.Serializable;
import java.util.ArrayList;
import m83.C25262p;
import p005a3.C0237p;
import p218ic.C18348b;
import p400pc.InterfaceC29062a;
import p420qc.C30207q;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import sc.C32352b;
import sc0.C32355c;
import vb1.C35868a;
import ve0.C35926d;
import vg.AbstractC35959f;
import vg.C35958e;
import vg.EnumC35969p;
import vg.InterfaceC35960g;

/* JADX INFO: renamed from: jc.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C21568b0 {

    /* JADX INFO: renamed from: a */
    public final Object f82711a;

    /* JADX INFO: renamed from: b */
    public final Object f82712b;

    /* JADX INFO: renamed from: c */
    public final Object f82713c;

    /* JADX INFO: renamed from: d */
    public Object f82714d;

    /* JADX INFO: renamed from: e */
    public Object f82715e;

    /* JADX INFO: renamed from: f */
    public Serializable f82716f;

    /* JADX INFO: renamed from: g */
    public Object f82717g;

    /* JADX INFO: renamed from: h */
    public Object f82718h;

    public C21568b0(InterfaceC35960g interfaceC35960g, Function1 function1) {
        C35868a c35868a = new C35868a(18);
        this.f82711a = interfaceC35960g;
        this.f82712b = function1;
        this.f82713c = c35868a;
        this.f82714d = new C35868a(3);
        this.f82715e = interfaceC35960g;
        this.f82716f = EnumC35969p.f153151w;
        this.f82717g = new C35958e(this, 1);
    }

    /* JADX INFO: renamed from: a */
    public void m60617a(Object obj) {
        Object c25262p;
        Object c35926d;
        this.f82716f = AbstractC35959f.f153124a[((EnumC35969p) this.f82716f).ordinal()] == 1 ? EnumC35969p.f153152x : EnumC35969p.f153154z;
        this.f82718h = obj;
        if (obj == null) {
            this.f82715e = (InterfaceC35960g) this.f82711a;
            c25262p = new C32355c(this, 28);
        } else {
            c25262p = new C25262p(obj, 18);
        }
        this.f82717g = c25262p;
        if (obj == null || (c35926d = (Function1) ((Function1) this.f82712b).invoke(obj)) == null) {
            c35926d = new C35926d(3);
        }
        this.f82714d = c35926d;
    }

    public C21568b0(Context context, C18348b c18348b, C32352b c32352b, InterfaceC29062a foregroundProcessor, WorkDatabase workDatabase, C30207q c30207q, ArrayList arrayList) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(foregroundProcessor, "foregroundProcessor");
        this.f82711a = c18348b;
        this.f82712b = c32352b;
        this.f82713c = foregroundProcessor;
        this.f82714d = workDatabase;
        this.f82715e = c30207q;
        this.f82716f = arrayList;
        Context applicationContext = context.getApplicationContext();
        AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
        this.f82717g = applicationContext;
        this.f82718h = new C0237p(7);
    }
}
