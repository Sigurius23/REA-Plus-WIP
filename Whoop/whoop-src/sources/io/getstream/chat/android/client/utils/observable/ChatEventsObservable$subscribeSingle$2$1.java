package io.getstream.chat.android.client.utils.observable;

import c93.InterfaceC4339a;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* synthetic */ class ChatEventsObservable$subscribeSingle$2$1 extends C22672i implements InterfaceC4339a {
    public ChatEventsObservable$subscribeSingle$2$1(Object obj) {
        super(0, 0, SubscriptionImpl.class, obj, "dispose", "dispose()V");
    }

    @Override // c93.InterfaceC4339a
    public final /* bridge */ /* synthetic */ Object invoke() {
        m134222invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m134222invoke() {
        ((SubscriptionImpl) this.receiver).dispose();
    }
}
