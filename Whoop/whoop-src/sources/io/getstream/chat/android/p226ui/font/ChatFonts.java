package io.getstream.chat.android.p226ui.font;

import android.graphics.Typeface;
import android.widget.TextView;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0007\u0010\u000bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/font/ChatFonts;", "", "Lio/getstream/chat/android/ui/font/TextStyle;", "textStyle", "Landroid/widget/TextView;", "textView", "Ll83/a0;", "setFont", "(Lio/getstream/chat/android/ui/font/TextStyle;Landroid/widget/TextView;)V", "Landroid/graphics/Typeface;", "defaultTypeface", "(Lio/getstream/chat/android/ui/font/TextStyle;Landroid/widget/TextView;Landroid/graphics/Typeface;)V", "getFont", "(Lio/getstream/chat/android/ui/font/TextStyle;)Landroid/graphics/Typeface;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ChatFonts {

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ void setFont$default(ChatFonts chatFonts, TextStyle textStyle, TextView textView, Typeface DEFAULT, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFont");
        }
        if ((i13 & 4) != 0) {
            DEFAULT = Typeface.DEFAULT;
            AbstractC22676k.m65749i(DEFAULT, "DEFAULT");
        }
        chatFonts.setFont(textStyle, textView, DEFAULT);
    }

    Typeface getFont(TextStyle textStyle);

    void setFont(TextStyle textStyle, TextView textView);

    void setFont(TextStyle textStyle, TextView textView, Typeface defaultTypeface);
}
