package io.getstream.chat.android.p226ui.utils.extensions;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"applyTint", "Landroid/graphics/drawable/Drawable;", "tintColor", "", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;)Landroid/graphics/drawable/Drawable;", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DrawableKt {
    public static final Drawable applyTint(Drawable drawable, Integer num) {
        AbstractC22676k.m65750j(drawable, "<this>");
        if (num == null) {
            return drawable;
        }
        Drawable drawableMutate = drawable.mutate();
        AbstractC22676k.m65749i(drawableMutate, "mutate(...)");
        drawableMutate.setTint(num.intValue());
        drawableMutate.setTintMode(PorterDuff.Mode.SRC_IN);
        return drawableMutate;
    }
}
