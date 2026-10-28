package androidx.room;

import a20.C0162b;
import android.content.Intent;
import c93.InterfaceC4339a;
import com.google.crypto.tink.internal.C5101l0;
import e93.AbstractC12889b;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: androidx.room.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1835v {

    /* JADX INFO: renamed from: a */
    public final AbstractC1848z0 f7187a;

    /* JADX INFO: renamed from: b */
    public final String[] f7188b;

    /* JADX INFO: renamed from: c */
    public final C1797i2 f7189c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f7190d;

    /* JADX INFO: renamed from: e */
    public final ReentrantLock f7191e;

    /* JADX INFO: renamed from: f */
    public final C1823r f7192f;

    /* JADX INFO: renamed from: g */
    public final C1823r f7193g;

    /* JADX INFO: renamed from: h */
    public final C5101l0 f7194h;

    /* JADX INFO: renamed from: i */
    public Intent f7195i;

    /* JADX INFO: renamed from: j */
    public C1771c0 f7196j;

    /* JADX INFO: renamed from: k */
    public final Object f7197k;

    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.room.r] */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.room.r] */
    public C1835v(AbstractC1848z0 database, HashMap map, HashMap map2, String... strArr) {
        AbstractC22676k.m65750j(database, "database");
        this.f7187a = database;
        this.f7188b = strArr;
        C1797i2 c1797i2 = new C1797i2(database, map, map2, strArr, database.getUseTempTrackingTable$room_runtime(), new C1832u(1, this, C1835v.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 0));
        this.f7189c = c1797i2;
        this.f7190d = new LinkedHashMap();
        this.f7191e = new ReentrantLock();
        final int i13 = 0;
        this.f7192f = new InterfaceC4339a(this) { // from class: androidx.room.r

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C1835v f7168x;

            {
                this.f7168x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        this.f7168x.getClass();
                        break;
                    case 1:
                        this.f7168x.getClass();
                        break;
                    default:
                        C1835v c1835v = this.f7168x;
                        return Boolean.valueOf(!c1835v.f7187a.inCompatibilityMode() || c1835v.f7187a.isOpenInternal$room_runtime());
                }
                return C23454a0.f92919a;
            }
        };
        final int i14 = 1;
        this.f7193g = new InterfaceC4339a(this) { // from class: androidx.room.r

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C1835v f7168x;

            {
                this.f7168x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        this.f7168x.getClass();
                        break;
                    case 1:
                        this.f7168x.getClass();
                        break;
                    default:
                        C1835v c1835v = this.f7168x;
                        return Boolean.valueOf(!c1835v.f7187a.inCompatibilityMode() || c1835v.f7187a.isOpenInternal$room_runtime());
                }
                return C23454a0.f92919a;
            }
        };
        this.f7194h = new C5101l0(database);
        this.f7197k = new Object();
        final int i15 = 2;
        c1797i2.f7102k = new InterfaceC4339a(this) { // from class: androidx.room.r

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C1835v f7168x;

            {
                this.f7168x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        this.f7168x.getClass();
                        break;
                    case 1:
                        this.f7168x.getClass();
                        break;
                    default:
                        C1835v c1835v = this.f7168x;
                        return Boolean.valueOf(!c1835v.f7187a.inCompatibilityMode() || c1835v.f7187a.isOpenInternal$room_runtime());
                }
                return C23454a0.f92919a;
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5454a(AbstractC1826s abstractC1826s) {
        LinkedHashMap linkedHashMap = this.f7190d;
        String[] strArr = abstractC1826s.f7169a;
        C1797i2 c1797i2 = this.f7189c;
        C23465k c23465kM5425g = c1797i2.m5425g(strArr);
        String[] strArr2 = (String[]) c23465kM5425g.f92937w;
        int[] iArr = (int[]) c23465kM5425g.f92938x;
        C1795i0 c1795i0 = new C1795i0(abstractC1826s, iArr, strArr2);
        ReentrantLock reentrantLock = this.f7191e;
        reentrantLock.lock();
        try {
            C1795i0 c1795i1 = linkedHashMap.containsKey(abstractC1826s) ? (C1795i0) AbstractC25247g0.m73986U(abstractC1826s, linkedHashMap) : (C1795i0) linkedHashMap.put(abstractC1826s, c1795i0);
            reentrantLock.unlock();
            return c1795i1 == null && c1797i2.f7099h.m5417a(iArr);
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final C1780e1 m5455b(String[] strArr, boolean z4, Function1 function1) {
        this.f7189c.m5425g(strArr);
        C5101l0 c5101l0 = this.f7194h;
        c5101l0.getClass();
        return new C1780e1((AbstractC1848z0) c5101l0.f21443x, c5101l0, z4, strArr, function1);
    }

    /* JADX INFO: renamed from: c */
    public final void m5456c(AbstractC1826s observer) {
        AbstractC22676k.m65750j(observer, "observer");
        ReentrantLock reentrantLock = this.f7191e;
        reentrantLock.lock();
        try {
            C1795i0 c1795i0 = (C1795i0) this.f7190d.remove(observer);
            reentrantLock.unlock();
            if (c1795i0 != null) {
                int[] tableIds = c1795i0.f7088b;
                C1797i2 c1797i2 = this.f7189c;
                c1797i2.getClass();
                AbstractC22676k.m65750j(tableIds, "tableIds");
                if (c1797i2.f7099h.m5418b(tableIds)) {
                    AbstractC12889b.m36260Z(new C0162b(this, null, 3));
                }
            }
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: d */
    public final Object m5457d(AbstractC32275i abstractC32275i) {
        Object objM5424f = this.f7189c.m5424f(abstractC32275i);
        return objM5424f == EnumC31071a.f128113w ? objM5424f : C23454a0.f92919a;
    }
}
