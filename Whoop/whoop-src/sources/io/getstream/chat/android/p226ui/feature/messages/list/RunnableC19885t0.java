package io.getstream.chat.android.p226ui.feature.messages.list;

import c93.InterfaceC4339a;
import j93.InterfaceC21493z;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.t0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC19885t0 implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74805w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f74806x;

    public /* synthetic */ RunnableC19885t0(Object obj, int i13) {
        this.f74805w = i13;
        this.f74806x = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f74805w;
        Object obj = this.f74806x;
        switch (i13) {
            case 0:
                InterfaceC21493z[] interfaceC21493zArr = MessageListView.$$delegatedProperties;
                ((InterfaceC4339a) obj).invoke();
                break;
            case 1:
                InterfaceC21493z[] interfaceC21493zArr2 = MessageListView.$$delegatedProperties;
                ((InterfaceC4339a) obj).invoke();
                break;
            case 2:
                ((InterfaceC4339a) obj).invoke();
                break;
            case 3:
                ((InterfaceC4339a) obj).invoke();
                break;
            default:
                ((MessageListView) obj).lockScrollUp = false;
                break;
        }
    }
}
