package io.getstream.chat.android.p226ui.font;

import android.widget.TextView;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Landroid/widget/TextView;", "Lio/getstream/chat/android/ui/font/TextStyle;", "textStyle", "Ll83/a0;", "setTextStyle", "(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class TextStyleKt {
    public static final void setTextStyle(TextView textView, TextStyle textStyle) {
        AbstractC22676k.m65750j(textView, "<this>");
        AbstractC22676k.m65750j(textStyle, "textStyle");
        textStyle.apply(textView);
    }
}
