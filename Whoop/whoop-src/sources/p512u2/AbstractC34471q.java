package p512u2;

import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;

/* JADX INFO: renamed from: u2.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC34471q {

    /* JADX INFO: renamed from: a */
    public static final C34447a f144812a = new C34447a(1000);

    /* JADX INFO: renamed from: b */
    public static final C34447a f144813b;

    /* JADX INFO: renamed from: c */
    public static final C34447a f144814c;

    static {
        new C34447a(MessageListItemViewType.TYPING_INDICATOR);
        f144813b = new C34447a(MessageListItemViewType.GIPHY);
        f144814c = new C34447a(1002);
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m108943a(long j7, long j13) {
        return j7 == j13;
    }

    /* JADX INFO: renamed from: b */
    public static String m108944b(long j7) {
        return "PointerId(value=" + j7 + ')';
    }
}
