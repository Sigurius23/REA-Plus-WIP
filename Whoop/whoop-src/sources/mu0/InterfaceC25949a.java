package mu0;

import ec3.InterfaceC13058l;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import l83.C23454a0;
import nu0.C27136a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: mu0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H§@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0010\u001a\u00020\fH§@¢\u0006\u0004\b\u0011\u0010\u000fJ\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\fH§@¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u0015\u0010\u000fJ\u001a\u0010\u0016\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u0016\u0010\u000fJ.\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH§@¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001b\u001a\u00020\f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H§@¢\u0006\u0004\b\u001b\u0010\u000bJ8\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u001f\u0010 J>\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\fH§@¢\u0006\u0004\b!\u0010 ¨\u0006\"À\u0006\u0003"}, m65681d2 = {"Lmu0/a;", "", "Lec3/l;", "", "observeNewestTimestamp", "()Lec3/l;", "", "Lnu0/a;", "metricsDataDtoList", "Ll83/a0;", "insertList", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "", "packetRevision", "f", "(ILq83/d;)Ljava/lang/Object;", "numOfRows", "e", "g", "getOldestPacketRevision", "(Lq83/d;)Ljava/lang/Object;", "k", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "versionId", "j", "(IIILq83/d;)Ljava/lang/Object;", "metricsListDto", "a", "numRecords", "oldestTimeStamp", "newestTimeStamp", "b", "(JIJJILq83/d;)Ljava/lang/Object;", "i", "connectivity-data-packets-model_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC25949a {

    /* JADX INFO: renamed from: mu0.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        @Deprecated
        /* JADX INFO: renamed from: a */
        public static Object m76801a(InterfaceC25949a interfaceC25949a, long j7, int i13, long j13, long j14, int i14, InterfaceC30057d<? super Integer> interfaceC30057d) {
            return InterfaceC25949a.super.mo76793b(j7, i13, j13, j14, i14, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: mu0.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityDataPacketsModels.metrics.dao.MetricsDataDao", m100430f = "MetricsDataDao.kt", m100431l = {78, 79}, m100432m = "deleteMetricsDataByTimeStampAndVersionId$suspendImpl", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        long f102491E;

        /* JADX INFO: renamed from: F */
        int f102492F;

        /* JADX INFO: renamed from: G */
        int f102493G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f102494H;

        /* JADX INFO: renamed from: J */
        int f102496J;

        /* JADX INFO: renamed from: w */
        Object f102497w;

        /* JADX INFO: renamed from: x */
        Object f102498x;

        /* JADX INFO: renamed from: y */
        long f102499y;

        /* JADX INFO: renamed from: z */
        long f102500z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f102494H = obj;
            this.f102496J |= Integer.MIN_VALUE;
            return InterfaceC25949a.m76790c(InterfaceC25949a.this, 0L, 0, 0L, 0L, 0, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: c */
    static Object m76790c(InterfaceC25949a interfaceC25949a, long j7, int i13, long j13, long j14, int i14, InterfaceC30057d<? super Integer> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i15 = bVar.f102496J;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                bVar.f102496J = i15 - Integer.MIN_VALUE;
            } else {
                bVar = interfaceC25949a.new b(interfaceC30057d);
            }
        } else {
            bVar = interfaceC25949a.new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object objMo76798i = bVar2.f102494H;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i16 = bVar2.f102496J;
        if (i16 == 0) {
            AbstractC34132o.m107864I(objMo76798i);
            bVar2.f102497w = interfaceC25949a;
            bVar2.f102499y = j7;
            bVar2.f102492F = i13;
            bVar2.f102500z = j13;
            bVar2.f102491E = j14;
            bVar2.f102493G = i14;
            bVar2.f102496J = 1;
            objMo76798i = interfaceC25949a.mo76798i(j7, i13, j13, j14, i14, bVar2);
            if (objMo76798i != enumC31071a) {
            }
        }
        if (i16 != 1) {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo76798i);
            return objMo76798i;
        }
        i14 = bVar2.f102493G;
        j14 = bVar2.f102491E;
        j13 = bVar2.f102500z;
        i13 = bVar2.f102492F;
        j7 = bVar2.f102499y;
        interfaceC25949a = (InterfaceC25949a) bVar2.f102497w;
        AbstractC34132o.m107864I(objMo76798i);
        bVar2.f102497w = null;
        bVar2.f102498x = null;
        bVar2.f102499y = j7;
        bVar2.f102492F = i13;
        bVar2.f102500z = j13;
        bVar2.f102491E = j14;
        bVar2.f102493G = i14;
        bVar2.f102496J = 2;
        Object objMo76792a = interfaceC25949a.mo76792a((List) objMo76798i, bVar2);
        return objMo76792a == enumC31071a ? enumC31071a : objMo76792a;
    }

    /* JADX INFO: renamed from: a */
    Object mo76792a(List<C27136a> list, InterfaceC30057d<? super Integer> interfaceC30057d);

    /* JADX INFO: renamed from: b */
    default Object mo76793b(long j7, int i13, long j13, long j14, int i14, InterfaceC30057d<? super Integer> interfaceC30057d) {
        return m76790c(this, j7, i13, j13, j14, i14, interfaceC30057d);
    }

    /* JADX INFO: renamed from: e */
    Object mo76794e(int i13, InterfaceC30057d<? super List<C27136a>> interfaceC30057d);

    /* JADX INFO: renamed from: f */
    Object mo76795f(int i13, InterfaceC30057d<? super Integer> interfaceC30057d);

    /* JADX INFO: renamed from: g */
    Object mo76796g(int i13, InterfaceC30057d<? super Long> interfaceC30057d);

    Object getOldestPacketRevision(InterfaceC30057d<? super Integer> interfaceC30057d);

    /* JADX INFO: renamed from: h */
    Object mo76797h(int i13, InterfaceC30057d<? super Integer> interfaceC30057d);

    /* JADX INFO: renamed from: i */
    Object mo76798i(long j7, int i13, long j13, long j14, int i14, InterfaceC30057d<? super List<C27136a>> interfaceC30057d);

    Object insertList(List<C27136a> list, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: j */
    Object mo76799j(int i13, int i14, int i15, InterfaceC30057d<? super List<C27136a>> interfaceC30057d);

    /* JADX INFO: renamed from: k */
    Object mo76800k(int i13, InterfaceC30057d<? super Long> interfaceC30057d);

    InterfaceC13058l observeNewestTimestamp();
}
