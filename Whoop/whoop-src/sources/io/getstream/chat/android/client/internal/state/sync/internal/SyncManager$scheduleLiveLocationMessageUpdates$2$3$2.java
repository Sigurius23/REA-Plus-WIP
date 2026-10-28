package io.getstream.chat.android.client.internal.state.sync.internal;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import io.getstream.chat.android.models.Location;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$scheduleLiveLocationMessageUpdates$2$3$2", m100430f = "SyncManager.kt", m100431l = {171, 180}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class SyncManager$scheduleLiveLocationMessageUpdates$2$3$2 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ long $delayMillis;
    final /* synthetic */ Location $location;
    int label;
    final /* synthetic */ SyncManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncManager$scheduleLiveLocationMessageUpdates$2$3$2(long j7, SyncManager syncManager, Location location, InterfaceC30057d<? super SyncManager$scheduleLiveLocationMessageUpdates$2$3$2> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.$delayMillis = j7;
        this.this$0 = syncManager;
        this.$location = location;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new SyncManager$scheduleLiveLocationMessageUpdates$2$3$2(this.$delayMillis, this.this$0, this.$location, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((SyncManager$scheduleLiveLocationMessageUpdates$2$3$2) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0086, code lost:
    
        if (r11 == r0) goto L18;
     */
    @Override // s83.AbstractC32267a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$scheduleLiveLocationMessageUpdates$2$3$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
