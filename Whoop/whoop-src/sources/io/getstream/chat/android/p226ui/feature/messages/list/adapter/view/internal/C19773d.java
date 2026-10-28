package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import android.view.ViewGroup;
import c93.InterfaceC4339a;
import l83.C23454a0;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.adapter.view.internal.d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19773d implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74626w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ViewGroup f74627x;

    public /* synthetic */ C19773d(ViewGroup viewGroup, int i13) {
        this.f74626w = i13;
        this.f74627x = viewGroup;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f74626w) {
            case 0:
                return AudioRecordingAttachmentsGroupView.extractor_delegate$lambda$2((AudioRecordingAttachmentsGroupView) this.f74627x);
            case 1:
                MediaAttachmentView.m55508m((MediaAttachmentView) this.f74627x);
                return C23454a0.f92919a;
            default:
                PollView.m55513B((PollView) this.f74627x);
                return C23454a0.f92919a;
        }
    }
}
