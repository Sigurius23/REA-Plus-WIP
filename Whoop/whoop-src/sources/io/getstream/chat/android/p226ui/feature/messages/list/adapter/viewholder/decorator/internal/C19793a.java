package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.internal;

import android.view.View;
import androidx.constraintlayout.widget.C1153p;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.FootnoteView;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.decorator.internal.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19793a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74663w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ FootnoteView f74664x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ View f74665y;

    public /* synthetic */ C19793a(FootnoteView footnoteView, View view, int i13) {
        this.f74663w = i13;
        this.f74664x = footnoteView;
        this.f74665y = view;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f74663w) {
            case 0:
                FootnoteDecorator.setupThreadFootnote$lambda$2(this.f74664x, this.f74665y, (C1153p) obj);
                break;
            default:
                FootnoteDecorator.setupSimpleFootnoteWithRootConstraints$lambda$1(this.f74664x, this.f74665y, (C1153p) obj);
                break;
        }
        return C23454a0.f92919a;
    }
}
