package vk0;

import ec3.InterfaceC13075p1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: vk0.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\b\u0010\u0006R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018À\u0006\u0003"}, m65681d2 = {"Lvk0/j;", "Lvk0/a;", "Lvk0/i;", "gattService", "Lvk0/e;", "x", "(Lvk0/i;Lq83/d;)Ljava/lang/Object;", "Ll83/a0;", "H", "Lec3/p1;", "Lvk0/k;", "o", "()Lec3/p1;", "serviceFlow", "l", "iGattService", "", "F", "()Ljava/lang/String;", "taskName", "Ltr2/n;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ltr2/n;", "logger", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC36084j extends InterfaceC36075a {

    /* JADX INFO: renamed from: vk0.j$a */
    @InterfaceC32271e(m100429c = "com.whoop.bleTaskExecutor.LongRunningTask", m100430f = "BleTaskResponse.kt", m100431l = {65, 66, 68}, m100432m = "execute$suspendImpl", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f154173F;

        /* JADX INFO: renamed from: w */
        Object f154174w;

        /* JADX INFO: renamed from: x */
        Object f154175x;

        /* JADX INFO: renamed from: y */
        Object f154176y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f154177z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f154177z = obj;
            this.f154173F |= Integer.MIN_VALUE;
            return InterfaceC36084j.m114609E(InterfaceC36084j.this, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c4, code lost:
    
        if (r3 == r1) goto L38;
     */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object m114609E(vk0.InterfaceC36084j r12, vk0.InterfaceC36083i r13, q83.InterfaceC30057d<? super vk0.InterfaceC36079e> r14) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vk0.InterfaceC36084j.m114609E(vk0.j, vk0.i, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: u */
    static /* synthetic */ Object m114610u(InterfaceC36084j interfaceC36084j, InterfaceC36083i interfaceC36083i, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: F */
    String getTaskName();

    /* JADX INFO: renamed from: H */
    default Object mo23651H(InterfaceC36083i interfaceC36083i, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return m114610u(this, interfaceC36083i, interfaceC30057d);
    }

    /* JADX INFO: renamed from: h */
    InterfaceC34116n getLogger();

    /* JADX INFO: renamed from: l */
    InterfaceC13075p1 getIGattService();

    /* JADX INFO: renamed from: o */
    InterfaceC13075p1 getServiceFlow();

    /* JADX INFO: renamed from: x */
    default Object mo23655x(InterfaceC36083i interfaceC36083i, InterfaceC30057d<? super InterfaceC36079e> interfaceC30057d) {
        return m114609E(this, interfaceC36083i, interfaceC30057d);
    }
}
