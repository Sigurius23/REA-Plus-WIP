package ge0;

import a81.InterfaceC0569t;
import android.content.Context;
import android.view.View;
import androidx.health.platform.client.proto.C1533u;
import cz.C11208k;
import cz.C11230v;
import cz.C11232w;
import cz.C11234x;
import gf1.AbstractC15788g;
import go1.AbstractC16017b;
import gp2.AbstractC16071f;
import gz2.AbstractC16337d;
import h01.C16540g;
import h02.AbstractC16578j;
import h11.C16608c;
import h20.C16687l;
import h51.AbstractC16932d;
import h51.C16929a;
import h60.AbstractC16978g;
import he1.AbstractC17212a;
import ib0.AbstractC18333d;
import ib2.AbstractC18337b;
import ic2.AbstractC18401f;
import if0.AbstractC18452c;
import ih2.AbstractC18527b;
import io2.AbstractC20749a0;
import ip0.C20811h;
import j11.AbstractC21202e;
import kd0.InterfaceC22381a;
import l83.C23454a0;
import p31.AbstractC28799j;
import p635y2.InterfaceC39147y;
import p707gt1.AbstractC16202p;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29840y;
import u00.C34378f;

/* JADX INFO: renamed from: ge0.c */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C15728c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f59243w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f59244x;

    public /* synthetic */ C15728c(Function1 function1, int i13) {
        this.f59243w = i13;
        this.f59244x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f59243w) {
            case 0:
                return C15729d.m44313d(this.f59244x, (AbstractC15727b) obj);
            case 1:
                return AbstractC15730e.m44328m(this.f59244x, obj);
            case 2:
                return AbstractC15730e.m44331p(this.f59244x, obj);
            case 3:
                return AbstractC15730e.m44333r(this.f59244x, obj);
            case 4:
                return AbstractC15788g.m44520p(this.f59244x, obj);
            case 5:
                return AbstractC15788g.m44521q(this.f59244x, obj);
            case 6:
                return AbstractC16017b.m45336j(this.f59244x, ((Boolean) obj).booleanValue());
            case 7:
                return AbstractC16071f.m45416p(this.f59244x, (InterfaceC0569t) obj);
            case 8:
                return AbstractC16202p.m45858n(this.f59244x, obj);
            case 9:
                this.f59244x.invoke(new C11232w((AbstractC29840y) obj));
                return C23454a0.f92919a;
            case 10:
                C16687l it = (C16687l) obj;
                AbstractC22676k.m65750j(it, "it");
                this.f59244x.invoke(new C11234x(it));
                return C23454a0.f92919a;
            case 11:
                C34378f it3 = (C34378f) obj;
                AbstractC22676k.m65750j(it3, "it");
                this.f59244x.invoke(new C11208k(it3));
                return C23454a0.f92919a;
            case 12:
                this.f59244x.invoke(new C11230v());
                return C23454a0.f92919a;
            case 13:
                return AbstractC16337d.m46540d(this.f59244x, obj);
            case 14:
                return C16540g.m46739d(this.f59244x, obj);
            case 15:
                return AbstractC16578j.m47014m(this.f59244x, obj);
            case 16:
                return C16608c.m47129d(this.f59244x, obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C16929a.m47630g(this.f59244x, obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC16932d.m47661y(this.f59244x, (InterfaceC39147y) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC16978g.m47780s(this.f59244x, obj);
            case 20:
                return AbstractC17212a.m48613B(this.f59244x, obj);
            case 21:
                return AbstractC18333d.m52785x(this.f59244x, (InterfaceC22381a) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC18337b.m52804D(this.f59244x, (String) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC18401f.m52916B(this.f59244x, ((Boolean) obj).booleanValue());
            case 24:
                return AbstractC18452c.m53186r(this.f59244x, obj);
            case 25:
                return AbstractC18452c.m53188t(this.f59244x, (Context) obj);
            case 26:
                return AbstractC18527b.m53711L(this.f59244x, ((Boolean) obj).booleanValue());
            case 27:
                return AbstractC20749a0.m57118h(this.f59244x, (AbstractC28799j) obj);
            case 28:
                return C20811h.m57383m(this.f59244x, (View) obj);
            default:
                return AbstractC21202e.m59451h(this.f59244x, ((Boolean) obj).booleanValue());
        }
    }
}
