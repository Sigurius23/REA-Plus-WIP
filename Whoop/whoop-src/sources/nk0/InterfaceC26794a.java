package nk0;

import android.annotation.SuppressLint;
import c83.AbstractC4309a;
import dk0.C12108h;
import dk0.C12110j;
import dk0.C12111k;
import g83.C15578d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23468n;
import l83.InterfaceC23457c;
import lt0.AbstractC24726c;
import lt0.C24736m;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import rt0.InterfaceC31800b;
import st0.EnumC32978v;
import vk0.InterfaceC36081g;
import vk0.InterfaceC36083i;
import xj0.AbstractC38334b;
import zj0.C40727h;

/* JADX INFO: renamed from: nk0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0002\u0017\u0018J0\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u0015\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0005\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0019À\u0006\u0003"}, m65681d2 = {"Lnk0/a;", "Lvk0/i;", "Lvk0/g;", "task", "Lkotlin/time/Duration;", "timeout", "", "dualResponse", "Ll83/n;", "Lzj0/h;", "i", "(Lvk0/g;JZLq83/d;)Ljava/lang/Object;", "Llt0/c;", "blePacket", "", "delay", "Lnk0/a$a;", "G", "(Llt0/c;J)Lnk0/a$a;", "Lxj0/b;", "commandPacket", "E0", "(Lxj0/b;JZLq83/d;)Ljava/lang/Object;", "b", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC26794a extends InterfaceC36083i {

    /* JADX INFO: renamed from: nk0.a$a */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m65681d2 = {"Lnk0/a$a;", "Ljava/lang/Runnable;", "Llt0/c;", "blePacket", "Lst0/v;", "strapGen", "<init>", "(Llt0/c;Lst0/v;)V", "", "sequenceNumber", "Ll83/a0;", "d", "(B)V", "Lkotlin/Function1;", "action", "c", "(Lkotlin/jvm/functions/Function1;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Llt0/c;", "a", "()Llt0/c;", "x", "Lst0/v;", "b", "()Lst0/v;", "Lg83/d;", "y", "Lg83/d;", "notificationPubSub", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class a implements Runnable {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final AbstractC24726c blePacket;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private final EnumC32978v strapGen;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private final C15578d notificationPubSub;

        /* JADX INFO: renamed from: nk0.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes7.dex */
        @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"nk0/a$a$a", "Lc83/a;", "", "sequenceNumber", "Ll83/a0;", "c", "(B)V", "", "t", "onError", "(Ljava/lang/Throwable;)V", "onComplete", "()V", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42062a extends AbstractC4309a {

            /* JADX INFO: renamed from: x */
            final /* synthetic */ Function1 f106723x;

            public C42062a(Function1 function1) {
                this.f106723x = function1;
            }

            /* JADX INFO: renamed from: c */
            public void m79835c(byte sequenceNumber) {
                this.f106723x.invoke(Byte.valueOf(sequenceNumber));
                dispose();
            }

            @Override // l73.InterfaceC23413d
            public void onComplete() {
                dispose();
            }

            @Override // l73.InterfaceC23413d
            public void onError(Throwable t14) {
                AbstractC22676k.m65750j(t14, "t");
                dispose();
            }

            @Override // l73.InterfaceC23413d
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                m79835c(((Number) obj).byteValue());
            }
        }

        public a(AbstractC24726c blePacket, EnumC32978v strapGen) {
            AbstractC22676k.m65750j(blePacket, "blePacket");
            AbstractC22676k.m65750j(strapGen, "strapGen");
            this.blePacket = blePacket;
            this.strapGen = strapGen;
            this.notificationPubSub = new C15578d();
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC24726c getBlePacket() {
            return this.blePacket;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC32978v getStrapGen() {
            return this.strapGen;
        }

        @SuppressLint({"CheckResult"})
        /* JADX INFO: renamed from: c */
        public final void m79833c(Function1 action) {
            AbstractC22676k.m65750j(action, "action");
            this.notificationPubSub.m67905c(new C42062a(action));
        }

        /* JADX INFO: renamed from: d */
        public final void m79834d(byte sequenceNumber) {
            this.blePacket.mo72388P(sequenceNumber);
            this.notificationPubSub.onNext(Byte.valueOf(sequenceNumber));
        }
    }

    /* JADX INFO: renamed from: nk0.a$b */
    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u0006J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001dÀ\u0006\u0003"}, m65681d2 = {"Lnk0/a$b;", "", "Llt0/m;", "receivedPacket", "Ll83/a0;", "c0", "(Llt0/m;)V", "Z", "Ldk0/k;", "realTimeDataPacket", "T0", "(Ldk0/k;)V", "Ldk0/h;", "imuStreamDataPacket", "s", "(Ldk0/h;)V", "Lrt0/b$b;", "imuData", "a0", "(Lrt0/b$b;)V", "l", "", "chunk", "j0", "([B)V", "Ldk0/j;", "r17LabradorFilteredDataPacket", "R0", "(Ldk0/j;)V", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface b {
        /* JADX INFO: renamed from: R0 */
        void mo24703R0(C12110j r17LabradorFilteredDataPacket);

        /* JADX INFO: renamed from: T0 */
        void mo24706T0(C12111k realTimeDataPacket);

        /* JADX INFO: renamed from: Z */
        void mo24713Z(C24736m receivedPacket);

        /* JADX INFO: renamed from: a0 */
        void mo24714a0(InterfaceC31800b.b imuData);

        /* JADX INFO: renamed from: c0 */
        void mo24719c0(C24736m receivedPacket);

        /* JADX INFO: renamed from: j0 */
        void mo24733j0(byte[] chunk);

        /* JADX INFO: renamed from: l */
        void mo24737l(C24736m receivedPacket);

        @InterfaceC23457c
        /* JADX INFO: renamed from: s */
        void mo24747s(C12108h imuStreamDataPacket);
    }

    /* JADX INFO: renamed from: Q0 */
    static /* synthetic */ a m79826Q0(InterfaceC26794a interfaceC26794a, AbstractC24726c abstractC24726c, long j7, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendCommandToStrap");
        }
        if ((i13 & 2) != 0) {
            j7 = 0;
        }
        return interfaceC26794a.mo79829G(abstractC24726c, j7);
    }

    /* JADX INFO: renamed from: T */
    static /* synthetic */ Object m79827T(InterfaceC26794a interfaceC26794a, AbstractC38334b abstractC38334b, long j7, boolean z4, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendCommandToStrapSuspend");
        }
        if ((i13 & 2) != 0) {
            j7 = 5000;
        }
        long j13 = j7;
        if ((i13 & 4) != 0) {
            z4 = false;
        }
        return interfaceC26794a.mo79828E0(abstractC38334b, j13, z4, interfaceC30057d);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: E0 */
    Object mo79828E0(AbstractC38334b abstractC38334b, long j7, boolean z4, InterfaceC30057d<? super C40727h> interfaceC30057d);

    @InterfaceC23457c
    /* JADX INFO: renamed from: G */
    a mo79829G(AbstractC24726c blePacket, long delay);

    @Override // vk0.InterfaceC36083i
    /* JADX INFO: renamed from: i */
    Object mo79830i(InterfaceC36081g interfaceC36081g, long j7, boolean z4, InterfaceC30057d<? super C23468n> interfaceC30057d);
}
