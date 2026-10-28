package au0;

import bu0.C3634a;
import ec3.InterfaceC13058l;
import java.util.List;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: au0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0097@¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH§@¢\u0006\u0004\b\u0010\u0010\rJ&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH§@¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0018\u001a\u00020\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0018\u0010\u0007J\u0017\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0019H'¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001cÀ\u0006\u0003"}, m65681d2 = {"Lau0/a;", "", "", "Lbu0/a;", "strapFirmwareEventsDtoList", "Ll83/a0;", "insertList", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "", "oldestTimeStamp", "newestTimeStamp", "", "f", "(JJLq83/d;)Ljava/lang/Object;", "from", "to", "c", "versionId", "numberOfRecords", "e", "(IILq83/d;)Ljava/lang/Object;", "b", "(Lq83/d;)Ljava/lang/Object;", "listDto", "a", "Lec3/l;", "observeNewestTimestamp", "()Lec3/l;", "connectivity-data-packets-model_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC2050a {

    /* JADX INFO: renamed from: au0.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityDataPacketsModels.firmware.events.dao.StrapFirmwareEventsDao", m100430f = "StrapFirmwareEventsDao.kt", m100431l = {30, 31}, m100432m = "deleteBetween$suspendImpl", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f8153E;

        /* JADX INFO: renamed from: G */
        int f8155G;

        /* JADX INFO: renamed from: w */
        Object f8156w;

        /* JADX INFO: renamed from: x */
        Object f8157x;

        /* JADX INFO: renamed from: y */
        long f8158y;

        /* JADX INFO: renamed from: z */
        long f8159z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f8153E = obj;
            this.f8155G |= Integer.MIN_VALUE;
            return InterfaceC2050a.m6454d(InterfaceC2050a.this, 0L, 0L, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: d */
    static Object m6454d(InterfaceC2050a interfaceC2050a, long j7, long j13, InterfaceC30057d<? super Integer> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f8155G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f8155G = i13 - Integer.MIN_VALUE;
            } else {
                aVar = interfaceC2050a.new a(interfaceC30057d);
            }
        } else {
            aVar = interfaceC2050a.new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objMo6457c = aVar2.f8153E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f8155G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo6457c);
            aVar2.f8156w = interfaceC2050a;
            aVar2.f8158y = j7;
            aVar2.f8159z = j13;
            aVar2.f8155G = 1;
            objMo6457c = interfaceC2050a.mo6457c(j7, j13, aVar2);
            if (objMo6457c != enumC31071a) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo6457c);
            return objMo6457c;
        }
        j13 = aVar2.f8159z;
        j7 = aVar2.f8158y;
        interfaceC2050a = (InterfaceC2050a) aVar2.f8156w;
        AbstractC34132o.m107864I(objMo6457c);
        aVar2.f8156w = null;
        aVar2.f8157x = null;
        aVar2.f8158y = j7;
        aVar2.f8159z = j13;
        aVar2.f8155G = 2;
        Object objMo6455a = interfaceC2050a.mo6455a((List) objMo6457c, aVar2);
        return objMo6455a == enumC31071a ? enumC31071a : objMo6455a;
    }

    /* JADX INFO: renamed from: a */
    Object mo6455a(List<C3634a> list, InterfaceC30057d<? super Integer> interfaceC30057d);

    /* JADX INFO: renamed from: b */
    Object mo6456b(InterfaceC30057d<? super Integer> interfaceC30057d);

    /* JADX INFO: renamed from: c */
    Object mo6457c(long j7, long j13, InterfaceC30057d<? super List<C3634a>> interfaceC30057d);

    /* JADX INFO: renamed from: e */
    Object mo6458e(int i13, int i14, InterfaceC30057d<? super List<C3634a>> interfaceC30057d);

    /* JADX INFO: renamed from: f */
    default Object mo6459f(long j7, long j13, InterfaceC30057d<? super Integer> interfaceC30057d) {
        return m6454d(this, j7, j13, interfaceC30057d);
    }

    Object insertList(List<C3634a> list, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    InterfaceC13058l observeNewestTimestamp();
}
