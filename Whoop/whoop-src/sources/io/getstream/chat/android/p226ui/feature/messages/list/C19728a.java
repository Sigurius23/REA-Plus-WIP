package io.getstream.chat.android.p226ui.feature.messages.list;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import io.getstream.chat.android.p226ui.utils.extensions.IntKt;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19728a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74590w;

    public /* synthetic */ C19728a(int i13) {
        this.f74590w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f74590w) {
            case 0:
                MessageListItemStyle.Companion companion = MessageListItemStyle.INSTANCE;
                return Float.valueOf(IntKt.dpToPxPrecise(1));
            case 1:
                return MessageListView.defaultChildLayoutParams_delegate$lambda$0();
            case 2:
                MessageListViewStyle.Companion companion2 = MessageListViewStyle.INSTANCE;
                return Float.valueOf(IntKt.dpToPx(3));
            case 3:
                MessageListViewStyle.Companion companion3 = MessageListViewStyle.INSTANCE;
                return Integer.valueOf(IntKt.dpToPx(0));
            case 4:
                MessageListViewStyle.Companion companion4 = MessageListViewStyle.INSTANCE;
                return Integer.valueOf(IntKt.dpToPx(0));
            case 5:
                MessageListViewStyle.Companion companion5 = MessageListViewStyle.INSTANCE;
                return Integer.valueOf(IntKt.dpToPx(50));
            case 6:
                MessageListViewStyle.Companion companion6 = MessageListViewStyle.INSTANCE;
                return Integer.valueOf(IntKt.dpToPx(8));
            case 7:
                MessageListViewStyle.Companion companion7 = MessageListViewStyle.INSTANCE;
                return Integer.valueOf(IntKt.dpToPx(8));
            case 8:
                MessageListViewStyle.Companion companion8 = MessageListViewStyle.INSTANCE;
                return Integer.valueOf(IntKt.dpToPx(0));
            case 9:
                MessageListViewStyle.Companion companion9 = MessageListViewStyle.INSTANCE;
                return Integer.valueOf(IntKt.dpToPx(8));
            case 10:
                MessageListViewStyle.Companion companion10 = MessageListViewStyle.INSTANCE;
                return Integer.valueOf(IntKt.dpToPx(8));
            case 11:
                MessageListViewStyle.Companion companion11 = MessageListViewStyle.INSTANCE;
                return Integer.valueOf(IntKt.dpToPx(24));
            case 12:
                MessageListViewStyle.Companion companion12 = MessageListViewStyle.INSTANCE;
                return Integer.valueOf(IntKt.dpToPx(0));
            case 13:
                MessageListViewStyle.Companion companion13 = MessageListViewStyle.INSTANCE;
                return Integer.valueOf(IntKt.dpToPx(50));
            case 14:
                MessageListViewStyle.Companion companion14 = MessageListViewStyle.INSTANCE;
                return Integer.valueOf(IntKt.dpToPx(8));
            case 15:
                MessageListViewStyle.Companion companion15 = MessageListViewStyle.INSTANCE;
                return Integer.valueOf(IntKt.dpToPx(6));
            case 16:
                MessageListViewStyle.Companion companion16 = MessageListViewStyle.INSTANCE;
                return Integer.valueOf(IntKt.dpToPx(2));
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return Float.valueOf(MessageListViewStyle.INSTANCE.getDEFAULT_SCROLL_BUTTON_ELEVATION());
            default:
                MessageReplyStyle.Companion companion17 = MessageReplyStyle.Companion;
                return Float.valueOf(IntKt.dpToPxPrecise(1));
        }
    }
}
