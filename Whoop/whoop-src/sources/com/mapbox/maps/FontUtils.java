package com.mapbox.maps;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.util.Log;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m65681d2 = {"Lcom/mapbox/maps/FontUtils;", "", "()V", "DEFAULT_FONT", "", "DEFAULT_FONT_STACKS", "", "TAG", "TYPEFACE_FONTMAP_FIELD_NAME", "deviceFonts", "getDeviceFonts", "()Ljava/util/List;", "extractValidFont", "font", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class FontUtils {
    private static final String TAG = "Mbgl-FontUtils";
    private static final String TYPEFACE_FONTMAP_FIELD_NAME = "sSystemFontMap";
    public static final FontUtils INSTANCE = new FontUtils();
    private static final String DEFAULT_FONT = "sans-serif";
    private static final List<String> DEFAULT_FONT_STACKS = AbstractC37056f.m118959K(DEFAULT_FONT, "serif", "monospace");

    private FontUtils() {
    }

    @SuppressLint({"DiscouragedPrivateApi"})
    private final List<String> getDeviceFonts() {
        ArrayList arrayList = new ArrayList();
        try {
            Typeface typefaceCreate = Typeface.create(Typeface.DEFAULT, 0);
            Field declaredField = Typeface.class.getDeclaredField(TYPEFACE_FONTMAP_FIELD_NAME);
            AbstractC22676k.m65749i(declaredField, "Typeface::class.java.get…EFACE_FONTMAP_FIELD_NAME)");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(typefaceCreate);
            AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, android.graphics.Typeface>");
            arrayList.addAll(((java.util.Map) obj).keySet());
            return arrayList;
        } catch (Exception e5) {
            Log.e(TAG, "Couldn't load fonts from Typeface: " + e5);
            return arrayList;
        }
    }

    public final String extractValidFont(String font) {
        List<String> deviceFonts = getDeviceFonts();
        if (deviceFonts == null || deviceFonts.isEmpty()) {
            deviceFonts = DEFAULT_FONT_STACKS;
        }
        if (font != null && deviceFonts.contains(font)) {
            return font;
        }
        Log.i(TAG, "Couldn't map font family for local ideograph, using sans-serif instead");
        return DEFAULT_FONT;
    }
}
