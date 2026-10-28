package com.mapbox.common;

import android.os.BaseBundle;
import android.os.Bundle;
import com.mapbox.bindgen.Value;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u001a\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\n\u0010\u0006\u001a\u00020\u0003*\u00020\u0007\u001a\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u0005H\u0002\u001a\u0011\u0010\u0006\u001a\u00020\u0003*\u0004\u0018\u00010\b¢\u0006\u0002\u0010\t\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\f\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\u000e\u001a\u0011\u0010\u0006\u001a\u00020\u0003*\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010\u001a\u0011\u0010\u0006\u001a\u00020\u0003*\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012\u001a\f\u0010\u0006\u001a\u00020\u0003*\u0004\u0018\u00010\u0001\u001a*\u0010\u0006\u001a\u00020\u0003*\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013j\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0014\u001a\u0012\u0010\u0006\u001a\u00020\u0003*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m65681d2 = {"TAG", "", "arrayToValue", "Lcom/mapbox/bindgen/Value;", "array", "", "toValue", "Landroid/os/BaseBundle;", "", "(Ljava/lang/Boolean;)Lcom/mapbox/bindgen/Value;", "", "requireIsFinite", "(Ljava/lang/Double;Z)Lcom/mapbox/bindgen/Value;", "", "(Ljava/lang/Float;Z)Lcom/mapbox/bindgen/Value;", "", "(Ljava/lang/Integer;)Lcom/mapbox/bindgen/Value;", "", "(Ljava/lang/Long;)Lcom/mapbox/bindgen/Value;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "", "common_release"}, m65682k = 2, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class ValueUtilsKt {
    private static final String TAG = "ValueUtils";

    private static final Value arrayToValue(Object obj) {
        ArrayList arrayList;
        int i13 = 0;
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            arrayList = new ArrayList(zArr.length);
            int length = zArr.length;
            while (i13 < length) {
                arrayList.add(Value.valueOf(zArr[i13]));
                i13++;
            }
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            arrayList = new ArrayList(bArr.length);
            int length2 = bArr.length;
            while (i13 < length2) {
                arrayList.add(Value.valueOf(bArr[i13]));
                i13++;
            }
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            arrayList = new ArrayList(iArr.length);
            int length3 = iArr.length;
            while (i13 < length3) {
                arrayList.add(Value.valueOf(iArr[i13]));
                i13++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            arrayList = new ArrayList(jArr.length);
            int length4 = jArr.length;
            while (i13 < length4) {
                arrayList.add(Value.valueOf(jArr[i13]));
                i13++;
            }
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            arrayList = new ArrayList(fArr.length);
            int length5 = fArr.length;
            while (i13 < length5) {
                arrayList.add(Value.valueOf(fArr[i13]));
                i13++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            arrayList = new ArrayList(dArr.length);
            int length6 = dArr.length;
            while (i13 < length6) {
                arrayList.add(Value.valueOf(dArr[i13]));
                i13++;
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        return Value.valueOf(arrayList);
    }

    public static final Value toValue(BaseBundle baseBundle) {
        AbstractC22676k.m65750j(baseBundle, "<this>");
        HashMap map = new HashMap();
        if (baseBundle.isEmpty()) {
            Value valueValueOf = Value.valueOf((HashMap<String, Value>) map);
            AbstractC22676k.m65749i(valueValueOf, "valueOf(map)");
            return valueValueOf;
        }
        for (String str : baseBundle.keySet()) {
            Object obj = baseBundle.get(str);
            if (obj != null) {
                if ((obj instanceof Bundle) && obj.equals(baseBundle)) {
                    Log.warning(TAG, "This bundle contains reference to itself");
                } else {
                    Value value = toValue(obj);
                    if (value != null) {
                    }
                }
            }
        }
        Value valueValueOf2 = Value.valueOf((HashMap<String, Value>) map);
        AbstractC22676k.m65749i(valueValueOf2, "valueOf(map)");
        return valueValueOf2;
    }

    public static /* synthetic */ Value toValue$default(Float f13, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = true;
        }
        return toValue(f13, z4);
    }

    public static /* synthetic */ Value toValue$default(Double d3, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = true;
        }
        return toValue(d3, z4);
    }

    public static final Value toValue(String str) {
        if (str != null) {
            Value valueValueOf = Value.valueOf(str);
            AbstractC22676k.m65749i(valueValueOf, "valueOf(this)");
            return valueValueOf;
        }
        Value valueNullValue = Value.nullValue();
        AbstractC22676k.m65749i(valueNullValue, "nullValue()");
        return valueNullValue;
    }

    public static final Value toValue(Boolean bool) {
        if (bool != null) {
            Value valueValueOf = Value.valueOf(bool.booleanValue());
            AbstractC22676k.m65749i(valueValueOf, "valueOf(it)");
            return valueValueOf;
        }
        Value valueNullValue = Value.nullValue();
        AbstractC22676k.m65749i(valueNullValue, "nullValue()");
        return valueNullValue;
    }

    public static final Value toValue(Integer num) {
        if (num != null) {
            Value valueValueOf = Value.valueOf(num.intValue());
            AbstractC22676k.m65749i(valueValueOf, "valueOf(it.toLong())");
            return valueValueOf;
        }
        Value valueNullValue = Value.nullValue();
        AbstractC22676k.m65749i(valueNullValue, "nullValue()");
        return valueNullValue;
    }

    public static final Value toValue(Long l7) {
        if (l7 != null) {
            Value valueValueOf = Value.valueOf(l7.longValue());
            AbstractC22676k.m65749i(valueValueOf, "valueOf(it)");
            return valueValueOf;
        }
        Value valueNullValue = Value.nullValue();
        AbstractC22676k.m65749i(valueNullValue, "nullValue()");
        return valueNullValue;
    }

    public static final Value toValue(Float f13, boolean z4) {
        if (f13 != null) {
            float fFloatValue = f13.floatValue();
            if (z4) {
                float fFloatValue2 = f13.floatValue();
                if (Float.isInfinite(fFloatValue2) || Float.isNaN(fFloatValue2)) {
                    throw new IllegalArgumentException("Value can not be Double.NaN, Double.POSITIVE_INFINITY or Double.NEGATIVE_INFINITY");
                }
            }
            Value valueValueOf = Value.valueOf(fFloatValue);
            AbstractC22676k.m65749i(valueValueOf, "valueOf(it.toDouble())");
            return valueValueOf;
        }
        Value valueNullValue = Value.nullValue();
        AbstractC22676k.m65749i(valueNullValue, "nullValue()");
        return valueNullValue;
    }

    public static final Value toValue(Double d3, boolean z4) {
        if (d3 != null) {
            double dDoubleValue = d3.doubleValue();
            if (z4) {
                double dDoubleValue2 = d3.doubleValue();
                if (Double.isInfinite(dDoubleValue2) || Double.isNaN(dDoubleValue2)) {
                    throw new IllegalArgumentException("Value can not be Float.NaN, Float.POSITIVE_INFINITY or Float.NEGATIVE_INFINITY");
                }
            }
            Value valueValueOf = Value.valueOf(dDoubleValue);
            AbstractC22676k.m65749i(valueValueOf, "valueOf(it)");
            return valueValueOf;
        }
        Value valueNullValue = Value.nullValue();
        AbstractC22676k.m65749i(valueNullValue, "nullValue()");
        return valueNullValue;
    }

    public static final Value toValue(List<? extends Value> list) {
        if (list != null) {
            Value valueValueOf = Value.valueOf((List<Value>) list);
            AbstractC22676k.m65749i(valueValueOf, "valueOf(this)");
            return valueValueOf;
        }
        Value valueNullValue = Value.nullValue();
        AbstractC22676k.m65749i(valueNullValue, "nullValue()");
        return valueNullValue;
    }

    public static final Value toValue(HashMap<String, Value> map) {
        if (map != null) {
            Value valueValueOf = Value.valueOf(map);
            AbstractC22676k.m65749i(valueValueOf, "valueOf(this)");
            return valueValueOf;
        }
        Value valueNullValue = Value.nullValue();
        AbstractC22676k.m65749i(valueNullValue, "nullValue()");
        return valueNullValue;
    }

    private static final Value toValue(Object obj) {
        if (obj instanceof Byte) {
            return Value.valueOf(((Number) obj).byteValue());
        }
        if (obj instanceof Integer) {
            return Value.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return Value.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof Float) {
            return Value.valueOf(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return Value.valueOf(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return Value.valueOf(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return Value.valueOf((String) obj);
        }
        if (obj instanceof boolean[] ? true : obj instanceof byte[] ? true : obj instanceof int[] ? true : obj instanceof long[] ? true : obj instanceof float[] ? true : obj instanceof double[]) {
            return arrayToValue(obj);
        }
        if (obj instanceof Bundle) {
            return toValue((BaseBundle) obj);
        }
        Log.warning(TAG, "Type is not supported: " + obj.getClass().getCanonicalName());
        return null;
    }
}
