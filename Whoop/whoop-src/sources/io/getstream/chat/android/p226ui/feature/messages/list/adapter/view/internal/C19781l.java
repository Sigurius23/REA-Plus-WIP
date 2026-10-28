package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import androidx.constraintlayout.widget.C1153p;
import io.getstream.chat.android.models.Option;
import io.getstream.chat.android.p226ui.databinding.StreamUiMediaAttachmentViewBinding;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.adapter.view.internal.l */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19781l implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74642w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f74643x;

    public /* synthetic */ C19781l(Object obj, int i13) {
        this.f74642w = i13;
        this.f74643x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f74642w) {
            case 0:
                GiphyMediaAttachmentView.applyFixedSizing$lambda$1((GiphyMediaAttachmentView) this.f74643x, (C1153p) obj);
                break;
            case 1:
                MediaAttachmentView.binding$lambda$1$lambda$0((StreamUiMediaAttachmentViewBinding) this.f74643x, (C1153p) obj);
                break;
            default:
                PollView.setPoll$lambda$8((PollView) this.f74643x, (Option) obj);
                break;
        }
        return C23454a0.f92919a;
    }
}
