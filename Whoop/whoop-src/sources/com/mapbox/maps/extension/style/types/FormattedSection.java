package com.mapbox.maps.extension.style.types;

import android.graphics.Color;
import android.util.Log;
import androidx.annotation.Keep;
import com.mapbox.bindgen.Value;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m83.AbstractC25267u;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003JB\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0019HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\r\u0010*\u001a\u00020+H\u0000¢\u0006\u0002\b,R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0014\"\u0004\b\u0016\u0010\u0017R&\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u0018\u001a\u00020\u00198G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006-"}, m65681d2 = {"Lcom/mapbox/maps/extension/style/types/FormattedSection;", "", "text", "", "fontScale", "", "fontStack", "", "textColor", "(Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;)V", "getFontScale", "()Ljava/lang/Double;", "setFontScale", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getFontStack", "()Ljava/util/List;", "setFontStack", "(Ljava/util/List;)V", "getText", "()Ljava/lang/String;", "getTextColor", "setTextColor", "(Ljava/lang/String;)V", "value", "", "textColorAsInt", "getTextColorAsInt", "()I", "setTextColorAsInt", "(I)V", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;)Lcom/mapbox/maps/extension/style/types/FormattedSection;", "equals", "", "other", "hashCode", "toString", "toValue", "Lcom/mapbox/bindgen/Value;", "toValue$extension_style_release", "extension-style_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final /* data */ class FormattedSection {
    private Double fontScale;
    private List<String> fontStack;
    private final String text;
    private String textColor;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FormattedSection(String text) {
        this(text, null, null, null, 14, null);
        AbstractC22676k.m65750j(text, "text");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FormattedSection copy$default(FormattedSection formattedSection, String str, Double d3, List list, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = formattedSection.text;
        }
        if ((i13 & 2) != 0) {
            d3 = formattedSection.fontScale;
        }
        if ((i13 & 4) != 0) {
            list = formattedSection.fontStack;
        }
        if ((i13 & 8) != 0) {
            str2 = formattedSection.textColor;
        }
        return formattedSection.copy(str, d3, list, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getFontScale() {
        return this.fontScale;
    }

    public final List<String> component3() {
        return this.fontStack;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    public final FormattedSection copy(String text, Double fontScale, List<String> fontStack, String textColor) {
        AbstractC22676k.m65750j(text, "text");
        return new FormattedSection(text, fontScale, fontStack, textColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormattedSection)) {
            return false;
        }
        FormattedSection formattedSection = (FormattedSection) other;
        return AbstractC22676k.m65745e(this.text, formattedSection.text) && AbstractC22676k.m65745e(this.fontScale, formattedSection.fontScale) && AbstractC22676k.m65745e(this.fontStack, formattedSection.fontStack) && AbstractC22676k.m65745e(this.textColor, formattedSection.textColor);
    }

    public final Double getFontScale() {
        return this.fontScale;
    }

    public final List<String> getFontStack() {
        return this.fontStack;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final int getTextColorAsInt() {
        Integer numValueOf;
        String str = this.textColor;
        if (str != null) {
            Matcher m10 = Pattern.compile("rgba?\\s*\\(\\s*(\\d+\\.?\\d*)\\s*,\\s*(\\d+\\.?\\d*)\\s*,\\s*(\\d+\\.?\\d*)\\s*,?\\s*(\\d+\\.?\\d*)?\\s*\\)").matcher(str);
            AbstractC22676k.m65749i(m10, "m");
            if (m10.matches() && m10.groupCount() == 4) {
                String strGroup = m10.group(4);
                float f13 = strGroup != null ? Float.parseFloat(strGroup) : 1.0f;
                String strGroup2 = m10.group(1);
                AbstractC22676k.m65747g(strGroup2);
                int i13 = (int) Float.parseFloat(strGroup2);
                String strGroup3 = m10.group(2);
                AbstractC22676k.m65747g(strGroup3);
                int i14 = (int) Float.parseFloat(strGroup3);
                String strGroup4 = m10.group(3);
                AbstractC22676k.m65747g(strGroup4);
                numValueOf = Integer.valueOf(Color.argb((int) ((f13 * 255.0f) + 0.5f), i13, i14, (int) Float.parseFloat(strGroup4)));
            } else {
                Log.e("ColorUtils", "Not a valid rgb/rgba value");
                numValueOf = null;
            }
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        throw new IllegalStateException("Property textColor is not set.");
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        Double d3 = this.fontScale;
        int iHashCode2 = (iHashCode + (d3 == null ? 0 : d3.hashCode())) * 31;
        List<String> list = this.fontStack;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.textColor;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final void setFontScale(Double d3) {
        this.fontScale = d3;
    }

    public final void setFontStack(List<String> list) {
        this.fontStack = list;
    }

    public final void setTextColor(String str) {
        this.textColor = str;
    }

    public final void setTextColorAsInt(int i13) {
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
        AbstractC22676k.m65748h(numberInstance, "null cannot be cast to non-null type java.text.DecimalFormat");
        DecimalFormat decimalFormat = (DecimalFormat) numberInstance;
        decimalFormat.applyPattern("#.########");
        String str = decimalFormat.format(((double) ((i13 >> 24) & 255)) / 255.0d);
        AbstractC22676k.m65749i(str, "decimalFormat.format(alpha)");
        this.textColor = String.format(Locale.US, "rgba(%d, %d, %d, %s)", Arrays.copyOf(new Object[]{Integer.valueOf((i13 >> 16) & 255), Integer.valueOf((i13 >> 8) & 255), Integer.valueOf(i13 & 255), str}, 4));
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("FormattedSection(text=");
        sb4.append(this.text);
        sb4.append(", fontScale=");
        sb4.append(this.fontScale);
        sb4.append(", fontStack=");
        sb4.append(this.fontStack);
        sb4.append(", textColor=");
        return AbstractC25012a.m73377j(sb4, this.textColor, ')');
    }

    public final Value toValue$extension_style_release() {
        HashMap map = new HashMap();
        Double d3 = this.fontScale;
        if (d3 != null) {
            map.put("font-scale", new Value(d3.doubleValue()));
        }
        List<String> list = this.fontStack;
        if (list != null) {
            List<String> list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new Value((String) it.next()));
            }
            map.put("text-font", new Value((List<Value>) arrayList));
        }
        String str = this.textColor;
        if (str != null) {
            map.put("text-color", new Value(str));
        }
        return new Value((List<Value>) AbstractC37056f.m118959K(new Value(this.text), new Value((HashMap<String, Value>) map)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FormattedSection(String text, Double d3) {
        this(text, d3, null, null, 12, null);
        AbstractC22676k.m65750j(text, "text");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FormattedSection(String text, Double d3, List<String> list) {
        this(text, d3, list, null, 8, null);
        AbstractC22676k.m65750j(text, "text");
    }

    public FormattedSection(String text, Double d3, List<String> list, String str) {
        AbstractC22676k.m65750j(text, "text");
        this.text = text;
        this.fontScale = d3;
        this.fontStack = list;
        this.textColor = str;
    }

    public /* synthetic */ FormattedSection(String str, Double d3, List list, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : d3, (i13 & 4) != 0 ? null : list, (i13 & 8) != 0 ? null : str2);
    }
}
