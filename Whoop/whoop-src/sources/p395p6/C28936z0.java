package p395p6;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import l83.C23454a0;
import o23.C27486p;
import p031b9.AbstractC2875y;
import p095dp.AbstractC12240d;
import p335n6.AbstractC26394k;
import p451r6.C30969w;
import p639y6.C39254f;
import r83.EnumC31071a;

/* JADX INFO: renamed from: p6.z0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C28936z0 {

    /* JADX INFO: renamed from: g */
    public static final C28918t f117072g = new C28918t();

    /* JADX INFO: renamed from: a */
    public final Context f117073a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f117074b;

    /* JADX INFO: renamed from: c */
    public int f117075c;

    /* JADX INFO: renamed from: d */
    public final int f117076d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f117077e;

    /* JADX INFO: renamed from: f */
    public final Set f117078f;

    public C28936z0(Context context, LinkedHashMap linkedHashMap, int i13, int i14, Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f117073a = context;
        this.f117074b = linkedHashMap;
        this.f117075c = i13;
        this.f117076d = i14;
        this.f117077e = linkedHashSet;
        this.f117078f = set;
    }

    /* JADX INFO: renamed from: a */
    public final int m87842a(AbstractC26394k abstractC26394k) {
        C30969w c30969wM34087x = AbstractC12240d.m34087x(abstractC26394k);
        synchronized (this) {
            Integer num = (Integer) this.f117074b.get(c30969wM34087x);
            if (num != null) {
                int iIntValue = num.intValue();
                this.f117077e.add(Integer.valueOf(iIntValue));
                return iIntValue;
            }
            int i13 = this.f117075c;
            while (this.f117078f.contains(Integer.valueOf(i13))) {
                i13 = (i13 + 1) % AbstractC28869c1.f116846c;
                if (i13 == this.f117075c) {
                    throw new IllegalArgumentException("Cannot assign a valid layout index to the new layout: no free index left.");
                }
            }
            this.f117075c = (i13 + 1) % AbstractC28869c1.f116846c;
            this.f117077e.add(Integer.valueOf(i13));
            this.f117078f.add(Integer.valueOf(i13));
            this.f117074b.put(c30969wM34087x, Integer.valueOf(i13));
            return i13;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m87843b(C28882h c28882h) {
        Object objM125029d = C39254f.f168772a.m125029d(this.f117073a, C28878f1.f116874a, AbstractC2875y.m8295h(this.f117076d, "appWidgetLayout-"), new C27486p(this, null, 4), c28882h);
        return objM125029d == EnumC31071a.f128113w ? objM125029d : C23454a0.f92919a;
    }
}
