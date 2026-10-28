package io.getstream.chat.android.client.internal.state.plugin.logic.internal;

import c93.InterfaceC4339a;

/* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.logic.internal.a */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19321a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73900w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ LogicRegistry f73901x;

    public /* synthetic */ C19321a(LogicRegistry logicRegistry, int i13) {
        this.f73900w = i13;
        this.f73901x = logicRegistry;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f73900w) {
            case 0:
                return LogicRegistry.channelLogic$lambda$10$lambda$9(this.f73901x);
            default:
                return LogicRegistry.legacyChannelLogic$lambda$8$lambda$7(this.f73901x);
        }
    }
}
