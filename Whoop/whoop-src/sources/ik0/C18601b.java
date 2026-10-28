package ik0;

import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.C25271y;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import mj0.C25615d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: ik0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R&\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00120\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\"\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001d"}, m65681d2 = {"Lik0/b;", "Lik0/d;", "<init>", "()V", "Lik0/c;", "record", "Ll83/a0;", "a", "(Lik0/c;Lq83/d;)Ljava/lang/Object;", "Lmj0/d;", "deviceId", "d", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "c", "Lmc3/a;", "Lmc3/a;", "mutex", "Lec3/p1;", "", "b", "Lec3/p1;", "_records", "Lec3/f2;", "Lec3/f2;", "e", "()Lec3/f2;", "records", "_primaryDeviceId", "primaryDeviceId", "whoop-ble_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18601b implements InterfaceC18603d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC25435a mutex = AbstractC25438d.m74669a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13075p1 _records;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC13037f2 records;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC13075p1 _primaryDeviceId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC13037f2 primaryDeviceId;

    /* JADX INFO: renamed from: ik0.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.ble.registry.InMemoryPairedDeviceRegistry", m100430f = "InMemoryPairedDeviceRegistry.kt", m100431l = {56}, m100432m = "remove-cjISt7w", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f72688F;

        /* JADX INFO: renamed from: w */
        Object f72689w;

        /* JADX INFO: renamed from: x */
        Object f72690x;

        /* JADX INFO: renamed from: y */
        int f72691y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f72692z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f72692z = obj;
            this.f72688F |= Integer.MIN_VALUE;
            return C18601b.this.mo53820d(null, this);
        }
    }

    /* JADX INFO: renamed from: ik0.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.ble.registry.InMemoryPairedDeviceRegistry", m100430f = "InMemoryPairedDeviceRegistry.kt", m100431l = {56}, m100432m = "setPrimary-5gQNZ-0", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f72694F;

        /* JADX INFO: renamed from: w */
        Object f72695w;

        /* JADX INFO: renamed from: x */
        Object f72696x;

        /* JADX INFO: renamed from: y */
        int f72697y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f72698z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f72698z = obj;
            this.f72694F |= Integer.MIN_VALUE;
            return C18601b.this.mo53819c(null, this);
        }
    }

    /* JADX INFO: renamed from: ik0.b$c */
    @InterfaceC32271e(m100429c = "com.whoop.ble.registry.InMemoryPairedDeviceRegistry", m100430f = "InMemoryPairedDeviceRegistry.kt", m100431l = {56}, m100432m = "upsert", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f72700F;

        /* JADX INFO: renamed from: w */
        Object f72701w;

        /* JADX INFO: renamed from: x */
        Object f72702x;

        /* JADX INFO: renamed from: y */
        int f72703y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f72704z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f72704z = obj;
            this.f72700F |= Integer.MIN_VALUE;
            return C18601b.this.mo53817a(null, this);
        }
    }

    public C18601b() {
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(C25271y.f99162w);
        this._records = c13045h2M36593c;
        this.records = AbstractC13091v.m36598h(c13045h2M36593c);
        C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(null);
        this._primaryDeviceId = c13045h2M36593c2;
        this.primaryDeviceId = AbstractC13091v.m36598h(c13045h2M36593c2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ik0.InterfaceC18603d
    /* JADX INFO: renamed from: a */
    public Object mo53817a(C18602c c18602c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        c cVar;
        C18602c c18602c2;
        InterfaceC25435a interfaceC25435a;
        C13045h2 c13045h2;
        Object value;
        ArrayList arrayList;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f72700F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f72700F = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object obj = cVar.f72704z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f72700F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC25435a interfaceC25435a2 = this.mutex;
            cVar.f72701w = c18602c;
            cVar.f72702x = interfaceC25435a2;
            cVar.f72703y = 0;
            cVar.f72700F = 1;
            if (interfaceC25435a2.mo68211b(cVar) == enumC31071a) {
                return enumC31071a;
            }
            c18602c2 = c18602c;
            interfaceC25435a = interfaceC25435a2;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC25435a = (InterfaceC25435a) cVar.f72702x;
            c18602c2 = (C18602c) cVar.f72701w;
            AbstractC34132o.m107864I(obj);
        }
        try {
            InterfaceC13075p1 interfaceC13075p1 = this._records;
            do {
                c13045h2 = (C13045h2) interfaceC13075p1;
                value = c13045h2.getValue();
                arrayList = new ArrayList();
                for (Object obj2 : (List) value) {
                    if (!C25615d.m75339d(((C18602c) obj2).getDeviceId(), c18602c2.getDeviceId())) {
                        arrayList.add(obj2);
                    }
                }
            } while (!c13045h2.m36569i(value, AbstractC25265s.m74128f1(c18602c2, arrayList)));
            return C23454a0.f92919a;
        } finally {
            interfaceC25435a.mo68214i(null);
        }
    }

    @Override // ik0.InterfaceC18603d
    /* JADX INFO: renamed from: b, reason: from getter */
    public InterfaceC13037f2 getPrimaryDeviceId() {
        return this.primaryDeviceId;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ik0.InterfaceC18603d
    /* JADX INFO: renamed from: c */
    public Object mo53819c(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        b bVar;
        InterfaceC25435a interfaceC25435a;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f72694F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f72694F = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object obj = bVar.f72698z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f72694F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = this.mutex;
            bVar.f72695w = str;
            bVar.f72696x = interfaceC25435a;
            bVar.f72697y = 0;
            bVar.f72694F = 1;
            if (interfaceC25435a.mo68211b(bVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC25435a interfaceC25435a2 = (InterfaceC25435a) bVar.f72696x;
            String str2 = (String) bVar.f72695w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a2;
            str = str2;
        }
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (str != null) {
            try {
                Iterable iterable = (Iterable) ((C13045h2) this._records).getValue();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    do {
                        if (it.hasNext()) {
                        }
                    } while (!C25615d.m75339d(((C18602c) it.next()).getDeviceId(), str));
                }
                return c23454a0;
            } finally {
                interfaceC25435a.mo68214i(null);
            }
        }
        ((C13045h2) this._primaryDeviceId).m36570j(str != null ? C25615d.m75336a(str) : null);
        return c23454a0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ik0.InterfaceC18603d
    /* JADX INFO: renamed from: d */
    public Object mo53820d(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        a aVar;
        InterfaceC25435a interfaceC25435a;
        C13045h2 c13045h2;
        Object value;
        ArrayList arrayList;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f72688F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f72688F = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f72692z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f72688F;
        boolean zM75339d = false;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = this.mutex;
            aVar.f72689w = str;
            aVar.f72690x = interfaceC25435a;
            aVar.f72691y = 0;
            aVar.f72688F = 1;
            if (interfaceC25435a.mo68211b(aVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC25435a interfaceC25435a2 = (InterfaceC25435a) aVar.f72690x;
            String str2 = (String) aVar.f72689w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a2;
            str = str2;
        }
        try {
            InterfaceC13075p1 interfaceC13075p1 = this._records;
            do {
                c13045h2 = (C13045h2) interfaceC13075p1;
                value = c13045h2.getValue();
                arrayList = new ArrayList();
                for (Object obj2 : (List) value) {
                    if (!C25615d.m75339d(((C18602c) obj2).getDeviceId(), str)) {
                        arrayList.add(obj2);
                    }
                }
            } while (!c13045h2.m36569i(value, arrayList));
            C25615d c25615d = (C25615d) ((C13045h2) this._primaryDeviceId).getValue();
            String value2 = c25615d != null ? c25615d.getValue() : null;
            if (value2 != null) {
                zM75339d = C25615d.m75339d(value2, str);
            }
            if (zM75339d) {
                ((C13045h2) this._primaryDeviceId).m36570j(null);
            }
            return C23454a0.f92919a;
        } finally {
            interfaceC25435a.mo68214i(null);
        }
    }

    @Override // ik0.InterfaceC18603d
    /* JADX INFO: renamed from: e, reason: from getter */
    public InterfaceC13037f2 getRecords() {
        return this.records;
    }
}
