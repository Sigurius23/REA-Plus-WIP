package oy2;

import com.whoop.whooplabs.data.remote.domain.dto.bff.InputType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: oy2.j */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Loy2/j;", "", "<init>", "()V", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;", "inputType", "", "", "inputConfig", "Loy2/h;", "a", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;Ljava/util/Map;)Loy2/h;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28484j {

    /* JADX INFO: renamed from: oy2.j$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f115310a;

        static {
            int[] iArr = new int[InputType.values().length];
            try {
                iArr[InputType.NUMBER_INPUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputType.TEXT_INPUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InputType.TEXT_SELECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InputType.TIME_PICKER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InputType.DATETIME_PICKER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InputType.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f115310a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: a */
    public final InterfaceC28482h m86738a(InputType inputType, Map<String, ? extends Object> inputConfig) {
        ?? arrayList;
        C28485k c28485k;
        if (inputType == null || inputConfig == null) {
            return null;
        }
        switch (a.f115310a[inputType.ordinal()]) {
            case 1:
                Object obj = inputConfig.get("required");
                Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                Object obj2 = inputConfig.get("input_label");
                String str = obj2 instanceof String ? (String) obj2 : null;
                Object obj3 = inputConfig.get("min");
                Integer num = obj3 instanceof Integer ? (Integer) obj3 : null;
                Object obj4 = inputConfig.get("max");
                Integer num2 = obj4 instanceof Integer ? (Integer) obj4 : null;
                Object obj5 = inputConfig.get("hint");
                String str2 = obj5 instanceof String ? (String) obj5 : null;
                Object obj6 = inputConfig.get("min_error_text");
                String str3 = obj6 instanceof String ? (String) obj6 : null;
                Object obj7 = inputConfig.get("max_error_text");
                return new InterfaceC28482h.c(boolValueOf, str, num, num2, str2, str3, obj7 instanceof String ? (String) obj7 : null);
            case 2:
                Object obj8 = inputConfig.get("required");
                Boolean bool2 = obj8 instanceof Boolean ? (Boolean) obj8 : null;
                Boolean boolValueOf2 = Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
                Object obj9 = inputConfig.get("input_label");
                String str4 = obj9 instanceof String ? (String) obj9 : null;
                Object obj10 = inputConfig.get("row_count");
                Integer num3 = obj10 instanceof Integer ? (Integer) obj10 : null;
                Object obj11 = inputConfig.get("min_length");
                Integer num4 = obj11 instanceof Integer ? (Integer) obj11 : null;
                Object obj12 = inputConfig.get("max_length");
                Integer num5 = obj12 instanceof Integer ? (Integer) obj12 : null;
                Object obj13 = inputConfig.get("hint");
                String str5 = obj13 instanceof String ? (String) obj13 : null;
                Object obj14 = inputConfig.get("min_length_error_text");
                String str6 = obj14 instanceof String ? (String) obj14 : null;
                Object obj15 = inputConfig.get("max_length_error_text");
                return new InterfaceC28482h.d(boolValueOf2, str4, num3, num4, num5, str5, str6, obj15 instanceof String ? (String) obj15 : null);
            case 3:
                Object obj16 = inputConfig.get("required");
                Boolean bool3 = obj16 instanceof Boolean ? (Boolean) obj16 : null;
                Boolean boolValueOf3 = Boolean.valueOf(bool3 != null ? bool3.booleanValue() : false);
                Object obj17 = inputConfig.get("options");
                List list = obj17 instanceof List ? (List) obj17 : null;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj18 : list) {
                        Map map = obj18 instanceof Map ? (Map) obj18 : null;
                        if (map != null) {
                            Object obj19 = map.get("key");
                            String str7 = obj19 instanceof String ? (String) obj19 : null;
                            if (str7 == null) {
                                str7 = "";
                            }
                            Object obj20 = map.get("value");
                            String str8 = obj20 instanceof String ? (String) obj20 : null;
                            c28485k = new C28485k(str7, str8 != null ? str8 : "");
                        } else {
                            c28485k = null;
                        }
                        if (c28485k != null) {
                            arrayList.add(c28485k);
                        }
                    }
                } else {
                    arrayList = C25271y.f99162w;
                }
                return new InterfaceC28482h.e(boolValueOf3, arrayList);
            case 4:
                return InterfaceC28482h.f.f115302a;
            case 5:
                Object obj21 = inputConfig.get("input_label");
                return new InterfaceC28482h.a(obj21 instanceof String ? (String) obj21 : null);
            case 6:
                return InterfaceC28482h.b.f115284a;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
