package io.getstream.chat.android.p226ui.common.internal;

import android.R;
import android.content.res.ColorStateList;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a&\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0003H\u0000¨\u0006\u0006"}, m65681d2 = {"getColorList", "Landroid/content/res/ColorStateList;", "normalColor", "", "selectedColor", "disabledColor", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ColorUtilsKt {
    public static final ColorStateList getColorList(int i13, int i14, int i15) {
        return new ColorStateList(new int[][]{new int[]{R.attr.state_enabled, -16842913}, new int[]{R.attr.state_enabled, R.attr.state_selected}, new int[]{-16842910}}, new int[]{i13, i14, i15});
    }
}
