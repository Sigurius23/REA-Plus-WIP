package ts1;

import dk0.C12110j;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rk1.EnumC31496c;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import vs1.C36472a;

/* JADX INFO: renamed from: ts1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\fJ\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001c\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR&\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\"¨\u0006$"}, m65681d2 = {"Lts1/b;", "Lts1/c;", "Lts1/a;", "labradorReadingResultDbManager", "<init>", "(Lts1/a;)V", "Ll83/a0;", "g", "(Lq83/d;)Ljava/lang/Object;", "Ldk0/j;", "r17", "f", "(Ldk0/j;)V", "", "dataSequenceNum", "", "", "labradorData", "e", "(JLjava/util/List;)V", "Lvs1/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lvs1/a;", "b", "a", "d", "()V", "", "c", "Lts1/a;", "", "Ljava/util/List;", "accumulatedPackets", "", "Ljava/util/Map;", "savePacketMap", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34143b implements InterfaceC34144c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C34142a labradorReadingResultDbManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C12110j> accumulatedPackets;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Map<Long, List<Integer>> savePacketMap;

    /* JADX INFO: renamed from: ts1.b$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t14, T t15) {
            return AbstractC30060g.m92127q((Long) ((Map.Entry) t14).getKey(), (Long) ((Map.Entry) t15).getKey());
        }
    }

    /* JADX INFO: renamed from: ts1.b$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.data.LabradorReadingResultPacketAccumulator", m100430f = "LabradorReadingResultPacketAccumulator.kt", m100431l = {51}, m100432m = "saveToLabradorDatabase", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f143122E;

        /* JADX INFO: renamed from: w */
        Object f143123w;

        /* JADX INFO: renamed from: x */
        int f143124x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f143125y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f143125y = obj;
            this.f143122E |= Integer.MIN_VALUE;
            return C34143b.this.mo107914c(this);
        }
    }

    public C34143b(C34142a labradorReadingResultDbManager) {
        AbstractC22676k.m65750j(labradorReadingResultDbManager, "labradorReadingResultDbManager");
        this.labradorReadingResultDbManager = labradorReadingResultDbManager;
        List<C12110j> listSynchronizedList = Collections.synchronizedList(new ArrayList());
        AbstractC22676k.m65749i(listSynchronizedList, "synchronizedList(...)");
        this.accumulatedPackets = listSynchronizedList;
        Map<Long, List<Integer>> mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        AbstractC22676k.m65749i(mapSynchronizedMap, "synchronizedMap(...)");
        this.savePacketMap = mapSynchronizedMap;
    }

    /* JADX INFO: renamed from: e */
    private final void m107908e(long dataSequenceNum, List<Integer> labradorData) {
        this.savePacketMap.put(Long.valueOf(dataSequenceNum), labradorData);
    }

    /* JADX INFO: renamed from: f */
    private final void m107909f(C12110j r17) {
        C12110j c12110j = (C12110j) AbstractC25265s.m74112P0(this.accumulatedPackets);
        if (r17.mo33457Q() != c12110j.mo33457Q() + 1) {
            m107908e(c12110j.mo33457Q() + 1, C25271y.f99162w);
        }
    }

    /* JADX INFO: renamed from: g */
    private final Object m107910g(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM107906e = this.labradorReadingResultDbManager.m107906e(interfaceC30057d);
        return objM107906e == EnumC31071a.f128113w ? objM107906e : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    private final C36472a m107911h() {
        C12110j c12110j = (C12110j) AbstractC25265s.m74114R0(this.accumulatedPackets);
        List listM74152u1 = AbstractC25265s.m74152u1(this.savePacketMap.entrySet(), new a());
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM74152u1, 10));
        Iterator it = listM74152u1.iterator();
        while (it.hasNext()) {
            arrayList.add((List) ((Map.Entry) it.next()).getValue());
        }
        if (c12110j != null) {
            return new C36472a(c12110j.m33461f0(), EnumC31496c.INSTANCE.m97037b(c12110j.m33459d0(), c12110j.m33461f0()).getCheckResult(), arrayList, c12110j.m72396Y().m41583j(), null, "", false, false, 16, null);
        }
        return null;
    }

    @Override // ts1.InterfaceC34144c
    /* JADX INFO: renamed from: a */
    public void mo107912a(C12110j r17) {
        AbstractC22676k.m65750j(r17, "r17");
        int i13 = 0;
        if (this.accumulatedPackets.isEmpty()) {
            this.accumulatedPackets.add(r17);
            long jMo33457Q = r17.mo33457Q();
            short[] sArrM33458c0 = r17.m33458c0();
            ArrayList arrayList = new ArrayList(sArrM33458c0.length);
            int length = sArrM33458c0.length;
            while (i13 < length) {
                arrayList.add(Integer.valueOf(sArrM33458c0[i13]));
                i13++;
            }
            m107908e(jMo33457Q, arrayList);
            return;
        }
        m107909f(r17);
        long jMo33457Q2 = r17.mo33457Q();
        short[] sArrM33458c1 = r17.m33458c0();
        ArrayList arrayList2 = new ArrayList(sArrM33458c1.length);
        int length2 = sArrM33458c1.length;
        while (i13 < length2) {
            arrayList2.add(Integer.valueOf(sArrM33458c1[i13]));
            i13++;
        }
        m107908e(jMo33457Q2, arrayList2);
        this.accumulatedPackets.add(r17);
    }

    @Override // ts1.InterfaceC34144c
    /* JADX INFO: renamed from: b */
    public Object mo107913b(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        mo107915d();
        Object objM107910g = m107910g(interfaceC30057d);
        return objM107910g == EnumC31071a.f128113w ? objM107910g : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ts1.InterfaceC34144c
    /* JADX INFO: renamed from: c */
    public Object mo107914c(InterfaceC30057d<? super Boolean> interfaceC30057d) throws Throwable {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f143122E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f143122E = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM107907f = bVar.f143125y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f143122E;
        boolean z4 = false;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM107907f);
            C36472a c36472aM107911h = m107911h();
            if (c36472aM107911h != null) {
                C34142a c34142a = this.labradorReadingResultDbManager;
                bVar.f143123w = null;
                bVar.f143124x = 0;
                bVar.f143122E = 1;
                objM107907f = c34142a.m107907f(c36472aM107911h, bVar);
                if (objM107907f == enumC31071a) {
                    return enumC31071a;
                }
            }
            return Boolean.valueOf(z4);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(objM107907f);
        if (((Boolean) objM107907f).booleanValue()) {
            mo107915d();
            z4 = true;
        }
        return Boolean.valueOf(z4);
    }

    @Override // ts1.InterfaceC34144c
    /* JADX INFO: renamed from: d */
    public void mo107915d() {
        this.accumulatedPackets.clear();
        this.savePacketMap.clear();
    }
}
