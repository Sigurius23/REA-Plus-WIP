package io.getstream.chat.android.p226ui.utils.extensions;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import l83.C23467m;
import live.hms.video.utils.HMSConstantsKt;
import p479s4.AbstractC32122c;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\t\u0010\n\u001a8\u0010\u000e\u001a\u00020\f*\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\f0\u000bH\u0080\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a6\u0010\u0014\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0011\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0010*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001f\u0010\u0016\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\b\b\u0001\u0010\u0012\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001f\u0010\u0019\u001a\u0004\u0018\u00010\u0018*\u00020\u00002\b\b\u0001\u0010\u0012\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001b"}, m65681d2 = {"Landroid/content/res/TypedArray;", "Landroid/content/Context;", "context", "", "id", "Landroid/graphics/drawable/Drawable;", "getDrawableCompat", "(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;", "Landroid/content/res/ColorStateList;", "getColorStateListCompat", "(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/content/res/ColorStateList;", "Lkotlin/Function1;", "Ll83/a0;", "block", "use", "(Landroid/content/res/TypedArray;Lkotlin/jvm/functions/Function1;)V", "", "T", "index", HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY, "getEnum", "(Landroid/content/res/TypedArray;ILjava/lang/Enum;)Ljava/lang/Enum;", "getColorOrNull", "(Landroid/content/res/TypedArray;I)Ljava/lang/Integer;", "", "getDimensionOrNull", "(Landroid/content/res/TypedArray;I)Ljava/lang/Float;", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class TypedArrayKt {
    public static final Integer getColorOrNull(TypedArray typedArray, int i13) {
        Object objM107888l;
        AbstractC22676k.m65750j(typedArray, "<this>");
        try {
            if (!typedArray.hasValue(i13)) {
                throw new IllegalArgumentException("Attribute not defined in set.");
            }
            objM107888l = Integer.valueOf(typedArray.getColor(i13, 0));
            if (objM107888l instanceof C23467m) {
                objM107888l = null;
            }
            return (Integer) objM107888l;
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
    }

    public static final ColorStateList getColorStateListCompat(TypedArray typedArray, Context context, int i13) {
        AbstractC22676k.m65750j(typedArray, "<this>");
        AbstractC22676k.m65750j(context, "context");
        int resourceId = typedArray.getResourceId(i13, 0);
        if (resourceId != 0) {
            return AbstractC32122c.getColorStateList(context, resourceId);
        }
        return null;
    }

    public static final Float getDimensionOrNull(TypedArray typedArray, int i13) {
        Object objM107888l;
        AbstractC22676k.m65750j(typedArray, "<this>");
        try {
            if (!typedArray.hasValue(i13)) {
                throw new IllegalArgumentException("Attribute not defined in set.");
            }
            objM107888l = Float.valueOf(typedArray.getDimension(i13, 0.0f));
            if (objM107888l instanceof C23467m) {
                objM107888l = null;
            }
            return (Float) objM107888l;
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
    }

    public static final Drawable getDrawableCompat(TypedArray typedArray, Context context, int i13) {
        AbstractC22676k.m65750j(typedArray, "<this>");
        AbstractC22676k.m65750j(context, "context");
        int resourceId = typedArray.getResourceId(i13, 0);
        if (resourceId != 0) {
            return AbstractC30060g.m92133x(context, resourceId);
        }
        return null;
    }

    public static final <T extends Enum<T>> T getEnum(TypedArray typedArray, int i13, T t14) {
        AbstractC22676k.m65750j(typedArray, "<this>");
        AbstractC22676k.m65750j(t14, "default");
        if (typedArray.getInt(i13, -1) < 0) {
            return t14;
        }
        AbstractC22676k.m65756p();
        throw null;
    }

    public static final void use(TypedArray typedArray, Function1 block) {
        AbstractC22676k.m65750j(typedArray, "<this>");
        AbstractC22676k.m65750j(block, "block");
        block.invoke(typedArray);
        typedArray.recycle();
    }
}
