package live.hms.video.sdk;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import live.hms.video.sdk.models.HMSConfig;
import live.hms.video.sdk.models.HMSLocalPeer;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate$join$2$4$1", m100430f = "SDKDelegate.kt", m100431l = {1526, 1534, 1548, 1559}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
public final class SDKDelegate$join$2$4$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ HMSConfig $config;
    final /* synthetic */ boolean $hasNameChanged;
    final /* synthetic */ HMSLocalPeer $hmsLocalPeer;
    final /* synthetic */ HMSLocalPeer $it;
    Object L$0;
    int label;
    final /* synthetic */ SDKDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SDKDelegate$join$2$4$1(SDKDelegate sDKDelegate, HMSConfig hMSConfig, HMSLocalPeer hMSLocalPeer, HMSLocalPeer hMSLocalPeer2, boolean z4, InterfaceC30057d<? super SDKDelegate$join$2$4$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = sDKDelegate;
        this.$config = hMSConfig;
        this.$hmsLocalPeer = hMSLocalPeer;
        this.$it = hMSLocalPeer2;
        this.$hasNameChanged = z4;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new SDKDelegate$join$2$4$1(this.this$0, this.$config, this.$hmsLocalPeer, this.$it, this.$hasNameChanged, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((SDKDelegate$join$2$4$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c8 A[Catch: IllegalStateException -> 0x0029, HMSException -> 0x002c, TryCatch #3 {IllegalStateException -> 0x0029, HMSException -> 0x002c, blocks: (B:11:0x0024, B:57:0x013d, B:63:0x0163, B:65:0x0167, B:67:0x0173, B:16:0x002f, B:54:0x012a, B:19:0x0038, B:27:0x0082, B:28:0x0087, B:30:0x0098, B:34:0x00a3, B:36:0x00b2, B:40:0x00bd, B:42:0x00c8, B:44:0x0104, B:48:0x010e, B:62:0x0159, B:22:0x0042, B:24:0x004c), top: B:77:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:47:0x010d  */
    /* JADX WARN: Code duplicated, block: B:54:0x012a A[Catch: IllegalStateException -> 0x0029, HMSException -> 0x002c, PHI: r7
      0x012a: PHI (r7v7 live.hms.video.sdk.SDKDelegate$join$2$4$1) = (r7v6 live.hms.video.sdk.SDKDelegate$join$2$4$1), (r7v0 live.hms.video.sdk.SDKDelegate$join$2$4$1) binds: [B:52:0x0126, B:16:0x002f] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #3 {IllegalStateException -> 0x0029, HMSException -> 0x002c, blocks: (B:11:0x0024, B:57:0x013d, B:63:0x0163, B:65:0x0167, B:67:0x0173, B:16:0x002f, B:54:0x012a, B:19:0x0038, B:27:0x0082, B:28:0x0087, B:30:0x0098, B:34:0x00a3, B:36:0x00b2, B:40:0x00bd, B:42:0x00c8, B:44:0x0104, B:48:0x010e, B:62:0x0159, B:22:0x0042, B:24:0x004c), top: B:77:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:56:0x013c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0159 A[Catch: IllegalStateException -> 0x0029, HMSException -> 0x002c, TryCatch #3 {IllegalStateException -> 0x0029, HMSException -> 0x002c, blocks: (B:11:0x0024, B:57:0x013d, B:63:0x0163, B:65:0x0167, B:67:0x0173, B:16:0x002f, B:54:0x012a, B:19:0x0038, B:27:0x0082, B:28:0x0087, B:30:0x0098, B:34:0x00a3, B:36:0x00b2, B:40:0x00bd, B:42:0x00c8, B:44:0x0104, B:48:0x010e, B:62:0x0159, B:22:0x0042, B:24:0x004c), top: B:77:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0167 A[Catch: IllegalStateException -> 0x0029, HMSException -> 0x002c, TryCatch #3 {IllegalStateException -> 0x0029, HMSException -> 0x002c, blocks: (B:11:0x0024, B:57:0x013d, B:63:0x0163, B:65:0x0167, B:67:0x0173, B:16:0x002f, B:54:0x012a, B:19:0x0038, B:27:0x0082, B:28:0x0087, B:30:0x0098, B:34:0x00a3, B:36:0x00b2, B:40:0x00bd, B:42:0x00c8, B:44:0x0104, B:48:0x010e, B:62:0x0159, B:22:0x0042, B:24:0x004c), top: B:77:0x000d }] */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0197, code lost:
    
        if (r1.onJoinError(r0, r7) == r11) goto L72;
     */
    @Override // s83.AbstractC32267a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: live.hms.video.sdk.SDKDelegate$join$2$4$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
