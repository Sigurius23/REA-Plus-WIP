package io.getstream.chat.android.p226ui.viewmodel.messages;

import androidx.lifecycle.AbstractC1637w1;
import io.getstream.chat.android.models.Poll;
import l83.C23454a0;
import n23.AbstractC26205h;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.messages.f */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19942f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74874w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f74875x;

    public /* synthetic */ C19942f(Object obj, int i13) {
        this.f74874w = i13;
        this.f74875x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f74874w) {
            case 0:
                MessageListViewModel.onEvent$lambda$7((MessageListViewModel.Event) this.f74875x, (AbstractC26205h) obj);
                return C23454a0.f92919a;
            default:
                return PollResultsViewModel._init_$lambda$0((Poll) this.f74875x, (AbstractC1637w1) obj);
        }
    }
}
