package jx0;

import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: jx0.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0015\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Ljx0/f;", "", "Ljx0/b;", "dataSyncWorkDao", "<init>", "(Ljx0/b;)V", "", "source", "", "threshold", "", "Ljx0/a;", "b", "(Ljava/lang/String;JLq83/d;)Ljava/lang/Object;", "id", "c", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "dataSyncWork", "Ll83/a0;", "d", "(Ljx0/a;Lq83/d;)Ljava/lang/Object;", "a", "e", "Ljx0/b;", "data-sync-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22003f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21999b dataSyncWorkDao;

    public C22003f(InterfaceC21999b dataSyncWorkDao) {
        AbstractC22676k.m65750j(dataSyncWorkDao, "dataSyncWorkDao");
        this.dataSyncWorkDao = dataSyncWorkDao;
    }

    /* JADX INFO: renamed from: a */
    public final Object m62879a(C21998a c21998a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo62863d = this.dataSyncWorkDao.mo62863d(c21998a, interfaceC30057d);
        return objMo62863d == EnumC31071a.f128113w ? objMo62863d : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public final Object m62880b(String str, long j7, InterfaceC30057d<? super List<C21998a>> interfaceC30057d) {
        return this.dataSyncWorkDao.mo62861b(str, j7, interfaceC30057d);
    }

    /* JADX INFO: renamed from: c */
    public final Object m62881c(String str, InterfaceC30057d<? super C21998a> interfaceC30057d) {
        return this.dataSyncWorkDao.mo62862c(str, interfaceC30057d);
    }

    /* JADX INFO: renamed from: d */
    public final Object m62882d(C21998a c21998a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo62864e = this.dataSyncWorkDao.mo62864e(c21998a, interfaceC30057d);
        return objMo62864e == EnumC31071a.f128113w ? objMo62864e : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    public final Object m62883e(C21998a c21998a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo62860a = this.dataSyncWorkDao.mo62860a(c21998a, interfaceC30057d);
        return objMo62860a == EnumC31071a.f128113w ? objMo62860a : C23454a0.f92919a;
    }
}
