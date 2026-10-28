package ib0;

import android.content.Context;
import androidx.health.platform.client.proto.C1533u;
import bf.InterfaceC3186a;
import ef0.AbstractC13142a;
import fb0.AbstractC14335a;
import fd0.AbstractC14397a;
import ff0.AbstractC14424a;
import gd0.AbstractC15711a;
import gg0.InterfaceC15822a;
import ib2.AbstractC18337b;
import ib2.InterfaceC18338c;
import ic2.AbstractC18401f;
import id0.AbstractC18409c;
import id2.AbstractC18424i;
import id2.AbstractC18435t;
import if0.AbstractC18452c;
import ig0.AbstractC18467g;
import ig0.AbstractC18469i;
import ih0.AbstractC18486c;
import ih0.AbstractC18491e0;
import ih0.AbstractC18502l;
import ih0.C18488d;
import ih0.InterfaceC18484b;
import java.util.Arrays;
import java.util.Map;
import p108e4.AbstractC12682p;
import p270k2.InterfaceC22131e;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.C25308q;
import ql0.AbstractC30467b;

/* JADX INFO: renamed from: ib0.c */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C18332c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f71347w;

    public /* synthetic */ C18332c(int i13) {
        this.f71347w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f71347w) {
            case 0:
                return AbstractC18333d.m52755M(obj);
            case 1:
                return AbstractC18333d.m52781t((AbstractC14335a) obj);
            case 2:
                return AbstractC18337b.m52828v((InterfaceC18338c) obj);
            case 3:
                Map.Entry entry = (Map.Entry) obj;
                AbstractC22676k.m65750j(entry, "<destruct>");
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                StringBuilder sbM35484d = AbstractC12682p.m35484d(str, " : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    AbstractC22676k.m65749i(value, "toString(...)");
                }
                sbM35484d.append(value);
                return sbM35484d.toString();
            case 4:
                return AbstractC18401f.m52943z(((Boolean) obj).booleanValue());
            case 5:
                return AbstractC18409c.m52957E((AbstractC15711a) obj);
            case 6:
                return AbstractC18409c.m52958F((AbstractC14397a) obj);
            case 7:
                return AbstractC18409c.m52978q((AbstractC15711a) obj);
            case 8:
                return AbstractC18409c.m52979r((AbstractC14397a) obj);
            case 9:
                return AbstractC18409c.m52984w((AbstractC15711a) obj);
            case 10:
                return AbstractC18409c.m52985x((AbstractC14397a) obj);
            case 11:
                return AbstractC18424i.m53036m((InterfaceC22131e) obj);
            case 12:
                return AbstractC18435t.m53113f0((C25308q) obj);
            case 13:
                InterfaceC3186a it = (InterfaceC3186a) obj;
                AbstractC22676k.m65750j(it, "it");
                return it.mo9168a();
            case 14:
                return AbstractC18452c.m53192x((AbstractC14424a) obj);
            case 15:
                return AbstractC18452c.m53193y((AbstractC13142a) obj);
            case 16:
                return AbstractC18452c.m53183o((AbstractC14424a) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC18452c.m53184p((AbstractC13142a) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC18467g.m53256w(obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC18467g.m53257x((C25308q) obj);
            case 20:
                return AbstractC18469i.m53270k((InterfaceC15822a) obj);
            case 21:
                return AbstractC18486c.m53350d((InterfaceC18484b) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC18502l.m53568O((AbstractC30467b) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC18502l.m53607v((Context) obj);
            case 24:
                return AbstractC18502l.m53611z(((Boolean) obj).booleanValue());
            case 25:
                return Integer.valueOf(AbstractC18491e0.m53518s0(((Integer) obj).intValue()));
            case 26:
                return Integer.valueOf(AbstractC18491e0.m53521t0(((Integer) obj).intValue()));
            case 27:
                return Integer.valueOf(AbstractC18491e0.m53524u0(((Integer) obj).intValue()));
            case 28:
                return Integer.valueOf(AbstractC18491e0.m53527v0(((Integer) obj).intValue()));
            default:
                return AbstractC18491e0.m53494k0((C18488d) obj);
        }
    }
}
