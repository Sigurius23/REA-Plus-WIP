package io.getstream.chat.android.p226ui.utils;

import i93.C18284j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0001H\u0000\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001H\u0002\u001a\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m65681d2 = {"MAX_LINE_BREAKS", "", "ELLIPSIS", "", "ellipsizeText", "text", "textLimit", "maxLineBreaks", "textIsTooTall", "", "parseTooTallText", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageEllipsizeKt {
    private static final String ELLIPSIS = "...";
    private static final int MAX_LINE_BREAKS = 8;

    public static final String ellipsizeText(String text, int i13, int i14) {
        AbstractC22676k.m65750j(text, "text");
        if (text.length() > i13) {
            return AbstractC39414r.m125857C0(text, new C18284j(0, i13, 1)).concat(ELLIPSIS);
        }
        return textIsTooTall(text, i14) ? parseTooTallText(text, i14) : text;
    }

    public static /* synthetic */ String ellipsizeText$default(String str, int i13, int i14, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            i14 = 8;
        }
        return ellipsizeText(str, i13, i14);
    }

    private static final String parseTooTallText(String str, int i13) {
        StringBuilder sb4 = new StringBuilder();
        int i14 = 0;
        for (int i15 = 0; i14 < i13 && i15 < str.length() - 1; i15++) {
            char cCharAt = str.charAt(i15);
            sb4.append(cCharAt);
            if (cCharAt == '\n') {
                i14++;
            }
        }
        sb4.append("...\n");
        return sb4.toString();
    }

    private static final boolean textIsTooTall(String str, int i13) {
        int i14 = 0;
        for (int i15 = 0; i15 < str.length(); i15++) {
            if (str.charAt(i15) == '\n') {
                i14++;
            }
        }
        return i14 > i13;
    }
}
