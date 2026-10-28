package k50;

import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import com.whoop.access.circumference.models.CircumferenceModel;
import com.whoop.access.circumference.models.CircumferencePickerModel;
import com.whoop.access.circumference.models.SegmentedControlDisplayModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.BindCoercionKt;
import com.whoop.design.models.binding.BindingLoggerKt;
import com.whoop.design.models.binding.ContentBindingResolverKt;
import com.whoop.design.models.binding.ContentPathBindingsKt;
import com.whoop.design.models.binding.DotPathBindingsKt;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.design.models.binding.StateBindingDeserializerKt;
import com.whoop.design.models.binding.StateLookupKt;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
import m83.AbstractC25267u;
import p097ds.AbstractC12313p;
import p549vb.AbstractC35862g;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: k50.b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aS\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lcom/whoop/access/circumference/models/CircumferenceModel;", "", "", "contentBinding", "Lcom/whoop/design/models/binding/AggregateBinding;", "aggregateBindings", "", "accumulatedState", "a", "(Lcom/whoop/access/circumference/models/CircumferenceModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/access/circumference/models/CircumferenceModel;", "access_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22199b {

    /* JADX INFO: renamed from: k50.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f86196w = new a();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.access.circumference.models.CircumferencePickerModel, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.access.circumference.models.CircumferencePickerModel, java.lang.Object] */
        @Override // p715kotlin.jvm.functions.Function1
        public final CircumferencePickerModel invoke(Object obj) {
            Object objM1830a;
            ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj);
            if (UnwrapForCoercion == 0) {
                return null;
            }
            if (UnwrapForCoercion instanceof JsonElement) {
                JsonElement jsonElement = (JsonElement) UnwrapForCoercion;
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(CircumferencePickerModel.INSTANCE.serializer(), jsonElement);
                } catch (Exception unused) {
                    return null;
                }
            }
            if (UnwrapForCoercion instanceof CircumferencePickerModel) {
                return UnwrapForCoercion;
            }
            if (!(UnwrapForCoercion instanceof Number)) {
                if (!(UnwrapForCoercion instanceof String)) {
                    return null;
                }
                JsonPrimitive jsonPrimitiveM1841c = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(CircumferencePickerModel.INSTANCE.serializer(), jsonPrimitiveM1841c);
                } catch (Exception unused2) {
                    objM1830a = null;
                }
                if (objM1830a != null) {
                    return objM1830a;
                }
                return null;
            }
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(CircumferencePickerModel.class);
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                return (CircumferencePickerModel) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                return (CircumferencePickerModel) Long.valueOf(((Number) UnwrapForCoercion).longValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                return (CircumferencePickerModel) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                return (CircumferencePickerModel) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                return (CircumferencePickerModel) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                return (CircumferencePickerModel) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: k50.b$a0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a0 f86197w = new a0();

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<String, ? extends AggregateBinding> invoke(JsonElement json) {
            AbstractC22676k.m65750j(json, "json");
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), json);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: k50.b$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f86198w = new b();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JsonElement invoke(String v13) {
            AbstractC22676k.m65750j(v13, "v");
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                return StateBindingDeserializerKt.getStateBindingJson().m1832c(StringSerializer.INSTANCE, v13);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: k50.b$b0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b0 f86199w = new b0();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
        @Override // p715kotlin.jvm.functions.Function1
        public final Map<String, ? extends AggregateBinding> invoke(Object obj) {
            Object objM1830a;
            ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj);
            if (UnwrapForCoercion == 0) {
                return null;
            }
            if (UnwrapForCoercion instanceof JsonElement) {
                JsonElement jsonElement = (JsonElement) UnwrapForCoercion;
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonElement);
                } catch (Exception unused) {
                    return null;
                }
            }
            if (UnwrapForCoercion instanceof Map) {
                return UnwrapForCoercion;
            }
            if (!(UnwrapForCoercion instanceof Number)) {
                if (!(UnwrapForCoercion instanceof String)) {
                    return null;
                }
                JsonPrimitive jsonPrimitiveM1841c = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonPrimitiveM1841c);
                } catch (Exception unused2) {
                    objM1830a = null;
                }
                if (objM1830a != null) {
                    return objM1830a;
                }
                return null;
            }
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Map.class);
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                return (Map) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                return (Map) Long.valueOf(((Number) UnwrapForCoercion).longValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                return (Map) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                return (Map) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                return (Map) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                return (Map) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: k50.b$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f86200w = new c();

        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(JsonElement json) {
            AbstractC22676k.m65750j(json, "json");
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: k50.b$c0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c0 f86201w = new c0();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JsonElement invoke(List<? extends SegmentedControlDisplayModel> list) {
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new ArrayListSerializer(SegmentedControlDisplayModel.INSTANCE.serializer()));
                AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                stateBindingJson.getClass();
                return AbstractC12313p.m34290h0(stateBindingJson, list, interfaceC37138cM122336d);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: k50.b$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f86202w = new d();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JsonElement invoke(String str) {
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                stateBindingJson.getClass();
                return AbstractC12313p.m34290h0(stateBindingJson, str, interfaceC37138cM122336d);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: k50.b$d0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d0 f86203w = new d0();

        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List<? extends com.whoop.access.circumference.models.SegmentedControlDisplayModel>] */
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<? extends SegmentedControlDisplayModel> invoke(JsonElement json) {
            AbstractC22676k.m65750j(json, "json");
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(SegmentedControlDisplayModel.INSTANCE.serializer()), json);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: k50.b$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f86204w = new e();

        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(JsonElement json) {
            AbstractC22676k.m65750j(json, "json");
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: k50.b$e0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e0 f86205w = new e0();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<? extends com.whoop.access.circumference.models.SegmentedControlDisplayModel>] */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List<? extends com.whoop.access.circumference.models.SegmentedControlDisplayModel>] */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List<? extends com.whoop.access.circumference.models.SegmentedControlDisplayModel>] */
        @Override // p715kotlin.jvm.functions.Function1
        public final List<? extends SegmentedControlDisplayModel> invoke(Object obj) {
            Object objM1830a;
            ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj);
            if (UnwrapForCoercion == 0) {
                return null;
            }
            if (UnwrapForCoercion instanceof JsonElement) {
                JsonElement jsonElement = (JsonElement) UnwrapForCoercion;
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(SegmentedControlDisplayModel.INSTANCE.serializer()), jsonElement);
                } catch (Exception unused) {
                    return null;
                }
            }
            if (UnwrapForCoercion instanceof List) {
                return UnwrapForCoercion;
            }
            if (!(UnwrapForCoercion instanceof Number)) {
                if (!(UnwrapForCoercion instanceof String)) {
                    return null;
                }
                JsonPrimitive jsonPrimitiveM1841c = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(SegmentedControlDisplayModel.INSTANCE.serializer()), jsonPrimitiveM1841c);
                } catch (Exception unused2) {
                    objM1830a = null;
                }
                if (objM1830a != null) {
                    return objM1830a;
                }
                return null;
            }
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(List.class);
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                return (List) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                return (List) Long.valueOf(((Number) UnwrapForCoercion).longValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                return (List) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                return (List) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                return (List) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                return (List) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: k50.b$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f86206w = new f();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
        @Override // p715kotlin.jvm.functions.Function1
        public final String invoke(Object obj) {
            Object objM1830a;
            ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj);
            if (UnwrapForCoercion == 0) {
                return null;
            }
            if (UnwrapForCoercion instanceof JsonElement) {
                JsonElement jsonElement = (JsonElement) UnwrapForCoercion;
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement);
                } catch (Exception unused) {
                    return null;
                }
            }
            boolean z4 = UnwrapForCoercion instanceof String;
            if (z4) {
                return UnwrapForCoercion;
            }
            if (!(UnwrapForCoercion instanceof Number)) {
                if (!z4) {
                    return null;
                }
                JsonPrimitive jsonPrimitiveM1841c = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c);
                } catch (Exception unused2) {
                    objM1830a = null;
                }
                if (objM1830a != null) {
                    return objM1830a;
                }
                return null;
            }
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(String.class);
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                return (String) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                return (String) Long.valueOf(((Number) UnwrapForCoercion).longValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                return (String) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                return (String) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                return (String) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                return (String) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: k50.b$f0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f0 f86207w = new f0();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JsonElement invoke(CircumferencePickerModel v13) {
            AbstractC22676k.m65750j(v13, "v");
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                return StateBindingDeserializerKt.getStateBindingJson().m1832c(CircumferencePickerModel.INSTANCE.serializer(), v13);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: k50.b$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f86208w = new g();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JsonElement invoke(String v13) {
            AbstractC22676k.m65750j(v13, "v");
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                return StateBindingDeserializerKt.getStateBindingJson().m1832c(StringSerializer.INSTANCE, v13);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: k50.b$g0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g0 f86209w = new g0();

        /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.access.circumference.models.CircumferencePickerModel, java.lang.Object] */
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CircumferencePickerModel invoke(JsonElement json) {
            AbstractC22676k.m65750j(json, "json");
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                return StateBindingDeserializerKt.getStateBindingJson().m1830a(CircumferencePickerModel.INSTANCE.serializer(), json);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: k50.b$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f86210w = new h();

        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(JsonElement json) {
            AbstractC22676k.m65750j(json, "json");
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: k50.b$h0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h0 f86211w = new h0();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JsonElement invoke(CircumferencePickerModel circumferencePickerModel) {
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(CircumferencePickerModel.INSTANCE.serializer());
                AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                stateBindingJson.getClass();
                return AbstractC12313p.m34290h0(stateBindingJson, circumferencePickerModel, interfaceC37138cM122336d);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: k50.b$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i f86212w = new i();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JsonElement invoke(String str) {
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                stateBindingJson.getClass();
                return AbstractC12313p.m34290h0(stateBindingJson, str, interfaceC37138cM122336d);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: k50.b$i0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i0 f86213w = new i0();

        /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.access.circumference.models.CircumferencePickerModel, java.lang.Object] */
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CircumferencePickerModel invoke(JsonElement json) {
            AbstractC22676k.m65750j(json, "json");
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                return StateBindingDeserializerKt.getStateBindingJson().m1830a(CircumferencePickerModel.INSTANCE.serializer(), json);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: k50.b$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final j f86214w = new j();

        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(JsonElement json) {
            AbstractC22676k.m65750j(json, "json");
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: k50.b$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final k f86215w = new k();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JsonElement invoke(List<? extends SegmentedControlDisplayModel> v13) {
            AbstractC22676k.m65750j(v13, "v");
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                ArrayListSerializer arrayListSerializer = new ArrayListSerializer(SegmentedControlDisplayModel.INSTANCE.serializer());
                AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                stateBindingJson.getClass();
                return AbstractC12313p.m34290h0(stateBindingJson, v13, arrayListSerializer);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: k50.b$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final l f86216w = new l();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
        @Override // p715kotlin.jvm.functions.Function1
        public final String invoke(Object obj) {
            Object objM1830a;
            ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj);
            if (UnwrapForCoercion == 0) {
                return null;
            }
            if (UnwrapForCoercion instanceof JsonElement) {
                JsonElement jsonElement = (JsonElement) UnwrapForCoercion;
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement);
                } catch (Exception unused) {
                    return null;
                }
            }
            boolean z4 = UnwrapForCoercion instanceof String;
            if (z4) {
                return UnwrapForCoercion;
            }
            if (!(UnwrapForCoercion instanceof Number)) {
                if (!z4) {
                    return null;
                }
                JsonPrimitive jsonPrimitiveM1841c = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c);
                } catch (Exception unused2) {
                    objM1830a = null;
                }
                if (objM1830a != null) {
                    return objM1830a;
                }
                return null;
            }
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(String.class);
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                return (String) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                return (String) Long.valueOf(((Number) UnwrapForCoercion).longValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                return (String) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                return (String) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                return (String) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                return (String) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: k50.b$m */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final m f86217w = new m();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JsonElement invoke(List<? extends C22200c> v13) {
            AbstractC22676k.m65750j(v13, "v");
            try {
                ArrayListSerializer arrayListSerializer = new ArrayListSerializer(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22200c.class)));
                AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                stateBindingJson.getClass();
                return AbstractC12313p.m34290h0(stateBindingJson, v13, arrayListSerializer);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: k50.b$n */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final n f86218w = new n();

        /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List<? extends k50.c>] */
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<? extends C22200c> invoke(JsonElement json) {
            AbstractC22676k.m65750j(json, "json");
            try {
                return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22200c.class))), json);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: k50.b$o */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final o f86219w = new o();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JsonElement invoke(List<? extends C22200c> list) {
            try {
                InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new ArrayListSerializer(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22200c.class))));
                AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                stateBindingJson.getClass();
                return AbstractC12313p.m34290h0(stateBindingJson, list, interfaceC37138cM122336d);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: k50.b$p */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final p f86220w = new p();

        /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List<? extends k50.c>] */
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<? extends C22200c> invoke(JsonElement json) {
            AbstractC22676k.m65750j(json, "json");
            try {
                return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22200c.class))), json);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: k50.b$q */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final q f86221w = new q();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<? extends k50.c>] */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List<? extends k50.c>] */
        /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List<? extends k50.c>] */
        @Override // p715kotlin.jvm.functions.Function1
        public final List<? extends C22200c> invoke(Object obj) {
            Object objM1830a;
            ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj);
            if (UnwrapForCoercion == 0) {
                return null;
            }
            if (UnwrapForCoercion instanceof JsonElement) {
                try {
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22200c.class))), (JsonElement) UnwrapForCoercion);
                } catch (Exception unused) {
                    return null;
                }
            }
            if (UnwrapForCoercion instanceof List) {
                return UnwrapForCoercion;
            }
            if (!(UnwrapForCoercion instanceof Number)) {
                if (!(UnwrapForCoercion instanceof String)) {
                    return null;
                }
                try {
                    objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22200c.class))), AbstractC0770m.m1841c((String) UnwrapForCoercion));
                } catch (Exception unused2) {
                    objM1830a = null;
                }
                if (objM1830a != null) {
                    return objM1830a;
                }
                return null;
            }
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(List.class);
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                return (List) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                return (List) Long.valueOf(((Number) UnwrapForCoercion).longValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                return (List) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                return (List) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                return (List) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                return (List) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: k50.b$r */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final r f86222w = new r();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JsonElement invoke(Map<String, ? extends String> v13) {
            AbstractC22676k.m65750j(v13, "v");
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                LinkedHashMapSerializer linkedHashMapSerializer = new LinkedHashMapSerializer(stringSerializer, stringSerializer);
                AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                stateBindingJson.getClass();
                return AbstractC12313p.m34290h0(stateBindingJson, v13, linkedHashMapSerializer);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: k50.b$s */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final s f86223w = new s();

        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<String, ? extends String> invoke(JsonElement json) {
            AbstractC22676k.m65750j(json, "json");
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer, stringSerializer), json);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: k50.b$t */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final t f86224w = new t();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JsonElement invoke(Map<String, ? extends String> map) {
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new LinkedHashMapSerializer(stringSerializer, stringSerializer));
                AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                stateBindingJson.getClass();
                return AbstractC12313p.m34290h0(stateBindingJson, map, interfaceC37138cM122336d);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: k50.b$u */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final u f86225w = new u();

        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<String, ? extends String> invoke(JsonElement json) {
            AbstractC22676k.m65750j(json, "json");
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer, stringSerializer), json);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: k50.b$v */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final v f86226w = new v();

        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List<? extends com.whoop.access.circumference.models.SegmentedControlDisplayModel>] */
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<? extends SegmentedControlDisplayModel> invoke(JsonElement json) {
            AbstractC22676k.m65750j(json, "json");
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(SegmentedControlDisplayModel.INSTANCE.serializer()), json);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: k50.b$w */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class w implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final w f86227w = new w();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, ? extends java.lang.String>] */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
        @Override // p715kotlin.jvm.functions.Function1
        public final Map<String, ? extends String> invoke(Object obj) {
            Object objM1830a;
            ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj);
            if (UnwrapForCoercion == 0) {
                return null;
            }
            if (UnwrapForCoercion instanceof JsonElement) {
                JsonElement jsonElement = (JsonElement) UnwrapForCoercion;
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    StringSerializer stringSerializer = StringSerializer.INSTANCE;
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer, stringSerializer), jsonElement);
                } catch (Exception unused) {
                    return null;
                }
            }
            if (UnwrapForCoercion instanceof Map) {
                return UnwrapForCoercion;
            }
            if (!(UnwrapForCoercion instanceof Number)) {
                if (!(UnwrapForCoercion instanceof String)) {
                    return null;
                }
                JsonPrimitive jsonPrimitiveM1841c = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    StringSerializer stringSerializer2 = StringSerializer.INSTANCE;
                    objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer2, stringSerializer2), jsonPrimitiveM1841c);
                } catch (Exception unused2) {
                    objM1830a = null;
                }
                if (objM1830a != null) {
                    return objM1830a;
                }
                return null;
            }
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Map.class);
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                return (Map) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                return (Map) Long.valueOf(((Number) UnwrapForCoercion).longValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                return (Map) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                return (Map) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                return (Map) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                return (Map) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: k50.b$x */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class x implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final x f86228w = new x();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JsonElement invoke(Map<String, ? extends AggregateBinding> v13) {
            AbstractC22676k.m65750j(v13, "v");
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                LinkedHashMapSerializer linkedHashMapSerializer = new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer());
                AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                stateBindingJson.getClass();
                return AbstractC12313p.m34290h0(stateBindingJson, v13, linkedHashMapSerializer);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: k50.b$y */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class y implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final y f86229w = new y();

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<String, ? extends AggregateBinding> invoke(JsonElement json) {
            AbstractC22676k.m65750j(json, "json");
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), json);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: k50.b$z */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class z implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final z f86230w = new z();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JsonElement invoke(Map<String, ? extends AggregateBinding> map) {
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(LenientAggregateBindingsSerializer.INSTANCE);
                AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                stateBindingJson.getClass();
                return AbstractC12313p.m34290h0(stateBindingJson, map, interfaceC37138cM122336d);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x022f  */
    /* JADX WARN: Code duplicated, block: B:145:0x026f  */
    /* JADX WARN: Code duplicated, block: B:218:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:238:0x041b  */
    /* JADX WARN: Code duplicated, block: B:307:0x056f  */
    /* JADX WARN: Code duplicated, block: B:326:0x05af  */
    /* JADX WARN: Code duplicated, block: B:411:0x073c  */
    /* JADX WARN: Code duplicated, block: B:484:0x08b2  */
    /* JADX WARN: Code duplicated, block: B:503:0x08f0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:571:0x0a48  */
    /* JADX WARN: Code duplicated, block: B:597:0x0aaf A[PHI: r4
      0x0aaf: PHI (r4v76 java.lang.Object) = (r4v52 java.lang.Object), (r4v56 java.lang.Object) binds: [B:596:0x0aad, B:624:0x0b75] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final CircumferenceModel m63629a(CircumferenceModel circumferenceModel, Map<String, String> map, Map<String, AggregateBinding> map2, Map<String, ? extends Object> accumulatedState) {
        Object objOverlayContentPathBindings;
        WithGeneratedBindings withGeneratedBindingsBind;
        Object obj;
        WithGeneratedBindings withGeneratedBindingsBind2;
        Object objOverlayContentPathBindings2;
        Object obj2;
        Object obj3;
        WithGeneratedBindings withGeneratedBindingsBind3;
        Object objOverlayContentPathBindings3;
        Object obj4;
        Object obj5;
        WithGeneratedBindings withGeneratedBindingsBind4;
        Object objOverlayContentPathBindings4;
        Object obj6;
        List list;
        WithGeneratedBindings withGeneratedBindingsBind5;
        Object objOverlayContentPathBindings5;
        Object obj7;
        Map<String, String> map3;
        WithGeneratedBindings withGeneratedBindingsBind6;
        Object objOverlayContentPathBindings6;
        Map<String, AggregateBinding> map4;
        WithGeneratedBindings withGeneratedBindingsBind7;
        Object obj8;
        Object objOverlayContentPathBindings7;
        AbstractC22676k.m65750j(circumferenceModel, "<this>");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        if ((map == null || map.isEmpty()) && ((map2 == null || map2.isEmpty()) && accumulatedState.isEmpty())) {
            return circumferenceModel;
        }
        List<SegmentedControlDisplayModel> segmentedControlLabels = circumferenceModel.getSegmentedControlLabels();
        if (segmentedControlLabels == null) {
            objOverlayContentPathBindings = null;
        } else if (segmentedControlLabels instanceof WithGeneratedBindings) {
            WithGeneratedBindings withGeneratedBindingsBind8 = ((WithGeneratedBindings) segmentedControlLabels).bind(accumulatedState);
            if (!(withGeneratedBindingsBind8 instanceof List)) {
                withGeneratedBindingsBind8 = null;
            }
            objOverlayContentPathBindings = (List) withGeneratedBindingsBind8;
            if (objOverlayContentPathBindings == null) {
                objOverlayContentPathBindings = segmentedControlLabels;
            }
        } else {
            List<SegmentedControlDisplayModel> list2 = segmentedControlLabels;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            for (Object obj9 : list2) {
                WithGeneratedBindings withGeneratedBindings = obj9 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj9 : null;
                if (withGeneratedBindings != null && (withGeneratedBindingsBind = withGeneratedBindings.bind(accumulatedState)) != null) {
                    obj9 = withGeneratedBindingsBind;
                }
                arrayList.add(obj9);
            }
            objOverlayContentPathBindings = arrayList;
        }
        String strResolveContentBindingKey = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "segmentedControlLabels") : null;
        Class cls = Byte.TYPE;
        Class cls2 = Short.TYPE;
        Class cls3 = Float.TYPE;
        Class cls4 = Double.TYPE;
        Class cls5 = Long.TYPE;
        Class cls6 = Integer.TYPE;
        if (strResolveContentBindingKey != null) {
            Object objResolveStateRef = StateLookupKt.resolveStateRef(strResolveContentBindingKey, accumulatedState);
            if (objResolveStateRef != null) {
                BindingLoggerKt.logContentBinding("segmentedControlLabels", strResolveContentBindingKey, objResolveStateRef);
                Object objUnwrapForCoercion = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                if ((objUnwrapForCoercion instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                    objOverlayContentPathBindings = null;
                } else {
                    objOverlayContentPathBindings = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                    if (objOverlayContentPathBindings == null) {
                        objOverlayContentPathBindings = null;
                    } else if (objOverlayContentPathBindings instanceof JsonElement) {
                        JsonElement jsonElement = (JsonElement) objOverlayContentPathBindings;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(SegmentedControlDisplayModel.INSTANCE.serializer()), jsonElement);
                        } catch (Exception unused) {
                            objOverlayContentPathBindings = null;
                        }
                    } else if (!(objOverlayContentPathBindings instanceof List)) {
                        if (objOverlayContentPathBindings instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a = AbstractC22671h0.m65688a(List.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings = (List) Integer.valueOf(((Number) objOverlayContentPathBindings).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings = (List) Long.valueOf(((Number) objOverlayContentPathBindings).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings = (List) Double.valueOf(((Number) objOverlayContentPathBindings).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings = (List) Float.valueOf(((Number) objOverlayContentPathBindings).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings = (List) Short.valueOf(((Number) objOverlayContentPathBindings).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings = (List) Byte.valueOf(((Number) objOverlayContentPathBindings).byteValue());
                            } else {
                                objOverlayContentPathBindings = null;
                            }
                        } else if (objOverlayContentPathBindings instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c = AbstractC0770m.m1841c((String) objOverlayContentPathBindings);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(SegmentedControlDisplayModel.INSTANCE.serializer()), jsonPrimitiveM1841c);
                            } catch (Exception unused2) {
                                objOverlayContentPathBindings = null;
                            }
                            if (objOverlayContentPathBindings == null) {
                                objOverlayContentPathBindings = null;
                            }
                        } else {
                            objOverlayContentPathBindings = null;
                        }
                    }
                    if (objOverlayContentPathBindings == null) {
                        objOverlayContentPathBindings = segmentedControlLabels;
                    }
                }
            }
        } else if (objOverlayContentPathBindings != null) {
            objOverlayContentPathBindings = ContentPathBindingsKt.overlayContentPathBindings(map, "segmentedControlLabels", accumulatedState, objOverlayContentPathBindings, k.f86215w, v.f86226w);
        }
        List<SegmentedControlDisplayModel> segmentedControlLabels2 = (List) DotPathBindingsKt.overlayAggregateBinding(map2, "segmentedControlLabels", accumulatedState, objOverlayContentPathBindings, "segmentedControlLabels", c0.f86201w, d0.f86203w, e0.f86205w);
        if (segmentedControlLabels2 == null) {
            segmentedControlLabels2 = circumferenceModel.getSegmentedControlLabels();
        }
        List<SegmentedControlDisplayModel> list3 = segmentedControlLabels2;
        Object circumferencePicker = circumferenceModel.getCircumferencePicker();
        if (circumferencePicker == null) {
            objOverlayContentPathBindings2 = null;
        } else {
            if (circumferencePicker instanceof WithGeneratedBindings) {
                Object objBind = ((WithGeneratedBindings) circumferencePicker).bind(accumulatedState);
                if (!(objBind instanceof CircumferencePickerModel)) {
                    objBind = null;
                }
                obj = (CircumferencePickerModel) objBind;
                if (obj == null) {
                    obj = circumferencePicker;
                }
            } else if (circumferencePicker instanceof List) {
                Iterable iterable = (Iterable) circumferencePicker;
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
                for (Object obj10 : iterable) {
                    WithGeneratedBindings withGeneratedBindings2 = obj10 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj10 : null;
                    if (withGeneratedBindings2 != null && (withGeneratedBindingsBind2 = withGeneratedBindings2.bind(accumulatedState)) != null) {
                        obj10 = withGeneratedBindingsBind2;
                    }
                    arrayList2.add(obj10);
                }
                obj = (CircumferencePickerModel) arrayList2;
            } else {
                obj = circumferencePicker;
            }
            objOverlayContentPathBindings2 = obj;
        }
        String strResolveContentBindingKey2 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "circumferencePicker") : null;
        if (strResolveContentBindingKey2 != null) {
            Object objResolveStateRef2 = StateLookupKt.resolveStateRef(strResolveContentBindingKey2, accumulatedState);
            if (objResolveStateRef2 != null) {
                BindingLoggerKt.logContentBinding("circumferencePicker", strResolveContentBindingKey2, objResolveStateRef2);
                Object objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                if ((objUnwrapForCoercion2 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion2)) {
                    obj2 = ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj2), Boolean.TRUE)) {
                        objOverlayContentPathBindings2 = null;
                    }
                } else {
                    obj2 = ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY;
                }
                objOverlayContentPathBindings2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                if (objOverlayContentPathBindings2 == null) {
                    objOverlayContentPathBindings2 = null;
                } else if (objOverlayContentPathBindings2 instanceof JsonElement) {
                    JsonElement jsonElement2 = (JsonElement) objOverlayContentPathBindings2;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(CircumferencePickerModel.INSTANCE.serializer(), jsonElement2);
                    } catch (Exception unused3) {
                        objOverlayContentPathBindings2 = null;
                    }
                } else if (!(objOverlayContentPathBindings2 instanceof CircumferencePickerModel)) {
                    if (objOverlayContentPathBindings2 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a2 = AbstractC22671h0.m65688a(CircumferencePickerModel.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings2 = (CircumferencePickerModel) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings2 = (CircumferencePickerModel) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings2 = (CircumferencePickerModel) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings2 = (CircumferencePickerModel) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings2 = (CircumferencePickerModel) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings2 = (CircumferencePickerModel) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                        } else {
                            objOverlayContentPathBindings2 = null;
                        }
                    } else if (objOverlayContentPathBindings2 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c2 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings2);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(CircumferencePickerModel.INSTANCE.serializer(), jsonPrimitiveM1841c2);
                        } catch (Exception unused4) {
                            objOverlayContentPathBindings2 = null;
                        }
                        if (objOverlayContentPathBindings2 == null) {
                            objOverlayContentPathBindings2 = null;
                        }
                    } else {
                        objOverlayContentPathBindings2 = null;
                    }
                }
                if (objOverlayContentPathBindings2 == null) {
                    objOverlayContentPathBindings2 = circumferencePicker;
                }
            } else {
                obj2 = ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY;
            }
        } else {
            obj2 = ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY;
            if (objOverlayContentPathBindings2 != null) {
                objOverlayContentPathBindings2 = ContentPathBindingsKt.overlayContentPathBindings(map, "circumferencePicker", accumulatedState, objOverlayContentPathBindings2, f0.f86207w, g0.f86209w);
            }
        }
        Object obj11 = obj2;
        CircumferencePickerModel circumferencePicker2 = (CircumferencePickerModel) DotPathBindingsKt.overlayAggregateBinding(map2, "circumferencePicker", accumulatedState, objOverlayContentPathBindings2, "circumferencePicker", h0.f86211w, i0.f86213w, a.f86196w);
        if (circumferencePicker2 == null) {
            circumferencePicker2 = circumferenceModel.getCircumferencePicker();
        }
        CircumferencePickerModel circumferencePickerModel = circumferencePicker2;
        Object stateUpdateUnitKey = circumferenceModel.getStateUpdateUnitKey();
        if (stateUpdateUnitKey == null) {
            objOverlayContentPathBindings3 = null;
        } else {
            if (stateUpdateUnitKey instanceof WithGeneratedBindings) {
                Object objBind2 = ((WithGeneratedBindings) stateUpdateUnitKey).bind(accumulatedState);
                if (!(objBind2 instanceof String)) {
                    objBind2 = null;
                }
                obj3 = (String) objBind2;
                if (obj3 == null) {
                    obj3 = stateUpdateUnitKey;
                }
            } else if (stateUpdateUnitKey instanceof List) {
                Iterable iterable2 = (Iterable) stateUpdateUnitKey;
                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(iterable2, 10));
                for (Object obj12 : iterable2) {
                    WithGeneratedBindings withGeneratedBindings3 = obj12 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj12 : null;
                    if (withGeneratedBindings3 != null && (withGeneratedBindingsBind3 = withGeneratedBindings3.bind(accumulatedState)) != null) {
                        obj12 = withGeneratedBindingsBind3;
                    }
                    arrayList3.add(obj12);
                }
                obj3 = (String) arrayList3;
            } else {
                obj3 = stateUpdateUnitKey;
            }
            objOverlayContentPathBindings3 = obj3;
        }
        String strResolveContentBindingKey3 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "stateUpdateUnitKey") : null;
        if (strResolveContentBindingKey3 != null) {
            Object objResolveStateRef3 = StateLookupKt.resolveStateRef(strResolveContentBindingKey3, accumulatedState);
            if (objResolveStateRef3 != null) {
                BindingLoggerKt.logContentBinding("stateUpdateUnitKey", strResolveContentBindingKey3, objResolveStateRef3);
                Object objUnwrapForCoercion3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                if ((objUnwrapForCoercion3 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion3)) {
                    obj4 = obj11;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj4), Boolean.TRUE)) {
                        objOverlayContentPathBindings3 = null;
                    }
                } else {
                    obj4 = obj11;
                }
                objOverlayContentPathBindings3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                if (objOverlayContentPathBindings3 == null) {
                    objOverlayContentPathBindings3 = null;
                } else if (objOverlayContentPathBindings3 instanceof JsonElement) {
                    JsonElement jsonElement3 = (JsonElement) objOverlayContentPathBindings3;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement3);
                    } catch (Exception unused5) {
                        objOverlayContentPathBindings3 = null;
                    }
                } else {
                    boolean z4 = objOverlayContentPathBindings3 instanceof String;
                    if (!z4) {
                        if (objOverlayContentPathBindings3 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a3 = AbstractC22671h0.m65688a(String.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings3 = (String) Integer.valueOf(((Number) objOverlayContentPathBindings3).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings3 = (String) Long.valueOf(((Number) objOverlayContentPathBindings3).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings3 = (String) Double.valueOf(((Number) objOverlayContentPathBindings3).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings3 = (String) Float.valueOf(((Number) objOverlayContentPathBindings3).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings3 = (String) Short.valueOf(((Number) objOverlayContentPathBindings3).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings3 = (String) Byte.valueOf(((Number) objOverlayContentPathBindings3).byteValue());
                            } else {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else if (z4) {
                            JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings3);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c3);
                            } catch (Exception unused6) {
                                objOverlayContentPathBindings3 = null;
                            }
                            if (objOverlayContentPathBindings3 == null) {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else {
                            objOverlayContentPathBindings3 = null;
                        }
                    }
                }
                if (objOverlayContentPathBindings3 == null) {
                    objOverlayContentPathBindings3 = stateUpdateUnitKey;
                }
            } else {
                obj4 = obj11;
            }
        } else {
            obj4 = obj11;
            if (objOverlayContentPathBindings3 != null) {
                objOverlayContentPathBindings3 = ContentPathBindingsKt.overlayContentPathBindings(map, "stateUpdateUnitKey", accumulatedState, objOverlayContentPathBindings3, b.f86198w, c.f86200w);
            }
        }
        Object obj13 = obj4;
        String str = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "stateUpdateUnitKey", accumulatedState, objOverlayContentPathBindings3, "stateUpdateUnitKey", d.f86202w, e.f86204w, f.f86206w);
        Object unitType = circumferenceModel.getUnitType();
        if (unitType == null) {
            objOverlayContentPathBindings4 = null;
        } else {
            if (unitType instanceof WithGeneratedBindings) {
                Object objBind3 = ((WithGeneratedBindings) unitType).bind(accumulatedState);
                if (!(objBind3 instanceof String)) {
                    objBind3 = null;
                }
                obj5 = (String) objBind3;
                if (obj5 == null) {
                    obj5 = unitType;
                }
            } else if (unitType instanceof List) {
                Iterable iterable3 = (Iterable) unitType;
                ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(iterable3, 10));
                for (Object obj14 : iterable3) {
                    WithGeneratedBindings withGeneratedBindings4 = obj14 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj14 : null;
                    if (withGeneratedBindings4 != null && (withGeneratedBindingsBind4 = withGeneratedBindings4.bind(accumulatedState)) != null) {
                        obj14 = withGeneratedBindingsBind4;
                    }
                    arrayList4.add(obj14);
                }
                obj5 = (String) arrayList4;
            } else {
                obj5 = unitType;
            }
            objOverlayContentPathBindings4 = obj5;
        }
        String strResolveContentBindingKey4 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "unitType") : null;
        if (strResolveContentBindingKey4 != null) {
            Object objResolveStateRef4 = StateLookupKt.resolveStateRef(strResolveContentBindingKey4, accumulatedState);
            if (objResolveStateRef4 != null) {
                BindingLoggerKt.logContentBinding("unitType", strResolveContentBindingKey4, objResolveStateRef4);
                Object objUnwrapForCoercion4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                if ((objUnwrapForCoercion4 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion4)) {
                    obj6 = obj13;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj6), Boolean.TRUE)) {
                        objOverlayContentPathBindings4 = null;
                    }
                } else {
                    obj6 = obj13;
                }
                objOverlayContentPathBindings4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                if (objOverlayContentPathBindings4 == null) {
                    objOverlayContentPathBindings4 = null;
                } else if (objOverlayContentPathBindings4 instanceof JsonElement) {
                    JsonElement jsonElement4 = (JsonElement) objOverlayContentPathBindings4;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement4);
                    } catch (Exception unused7) {
                        objOverlayContentPathBindings4 = null;
                    }
                } else {
                    boolean z13 = objOverlayContentPathBindings4 instanceof String;
                    if (!z13) {
                        if (objOverlayContentPathBindings4 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a4 = AbstractC22671h0.m65688a(String.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings4 = (String) Integer.valueOf(((Number) objOverlayContentPathBindings4).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings4 = (String) Long.valueOf(((Number) objOverlayContentPathBindings4).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings4 = (String) Double.valueOf(((Number) objOverlayContentPathBindings4).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings4 = (String) Float.valueOf(((Number) objOverlayContentPathBindings4).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings4 = (String) Short.valueOf(((Number) objOverlayContentPathBindings4).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings4 = (String) Byte.valueOf(((Number) objOverlayContentPathBindings4).byteValue());
                            } else {
                                objOverlayContentPathBindings4 = null;
                            }
                        } else if (z13) {
                            JsonPrimitive jsonPrimitiveM1841c4 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings4);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c4);
                            } catch (Exception unused8) {
                                objOverlayContentPathBindings4 = null;
                            }
                            if (objOverlayContentPathBindings4 == null) {
                                objOverlayContentPathBindings4 = null;
                            }
                        } else {
                            objOverlayContentPathBindings4 = null;
                        }
                    }
                }
                if (objOverlayContentPathBindings4 == null) {
                    objOverlayContentPathBindings4 = unitType;
                }
            } else {
                obj6 = obj13;
            }
        } else {
            obj6 = obj13;
            if (objOverlayContentPathBindings4 != null) {
                objOverlayContentPathBindings4 = ContentPathBindingsKt.overlayContentPathBindings(map, "unitType", accumulatedState, objOverlayContentPathBindings4, g.f86208w, h.f86210w);
            }
        }
        Object obj15 = obj6;
        String str2 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "unitType", accumulatedState, objOverlayContentPathBindings4, "unitType", i.f86212w, j.f86214w, l.f86216w);
        List<C22200c> foreignMeasurements = circumferenceModel.getForeignMeasurements();
        if (foreignMeasurements == null) {
            objOverlayContentPathBindings5 = null;
        } else {
            if (foreignMeasurements instanceof WithGeneratedBindings) {
                WithGeneratedBindings withGeneratedBindingsBind9 = ((WithGeneratedBindings) foreignMeasurements).bind(accumulatedState);
                if (!(withGeneratedBindingsBind9 instanceof List)) {
                    withGeneratedBindingsBind9 = null;
                }
                list = (List) withGeneratedBindingsBind9;
                if (list == null) {
                    list = foreignMeasurements;
                }
            } else {
                List<C22200c> list4 = foreignMeasurements;
                ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(list4, 10));
                for (Object obj16 : list4) {
                    WithGeneratedBindings withGeneratedBindings5 = obj16 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj16 : null;
                    if (withGeneratedBindings5 != null && (withGeneratedBindingsBind5 = withGeneratedBindings5.bind(accumulatedState)) != null) {
                        obj16 = withGeneratedBindingsBind5;
                    }
                    arrayList5.add(obj16);
                }
                list = arrayList5;
            }
            objOverlayContentPathBindings5 = list;
        }
        String strResolveContentBindingKey5 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "foreignMeasurements") : null;
        if (strResolveContentBindingKey5 != null) {
            Object objResolveStateRef5 = StateLookupKt.resolveStateRef(strResolveContentBindingKey5, accumulatedState);
            if (objResolveStateRef5 != null) {
                BindingLoggerKt.logContentBinding("foreignMeasurements", strResolveContentBindingKey5, objResolveStateRef5);
                Object objUnwrapForCoercion5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                if ((objUnwrapForCoercion5 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion5)) {
                    obj7 = obj15;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj7), Boolean.TRUE)) {
                        objOverlayContentPathBindings5 = null;
                    }
                } else {
                    obj7 = obj15;
                }
                objOverlayContentPathBindings5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                if (objOverlayContentPathBindings5 == null) {
                    objOverlayContentPathBindings5 = null;
                } else if (objOverlayContentPathBindings5 instanceof JsonElement) {
                    try {
                        objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().m1834e(), AbstractC22671h0.m65688a(C22200c.class))), (JsonElement) objOverlayContentPathBindings5);
                    } catch (Exception unused9) {
                        objOverlayContentPathBindings5 = null;
                    }
                } else if (!(objOverlayContentPathBindings5 instanceof List)) {
                    if (objOverlayContentPathBindings5 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a5 = AbstractC22671h0.m65688a(List.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings5 = (List) Integer.valueOf(((Number) objOverlayContentPathBindings5).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings5 = (List) Long.valueOf(((Number) objOverlayContentPathBindings5).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings5 = (List) Double.valueOf(((Number) objOverlayContentPathBindings5).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings5 = (List) Float.valueOf(((Number) objOverlayContentPathBindings5).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings5 = (List) Short.valueOf(((Number) objOverlayContentPathBindings5).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings5 = (List) Byte.valueOf(((Number) objOverlayContentPathBindings5).byteValue());
                        } else {
                            objOverlayContentPathBindings5 = null;
                        }
                    } else if (objOverlayContentPathBindings5 instanceof String) {
                        try {
                            objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().m1834e(), AbstractC22671h0.m65688a(C22200c.class))), AbstractC0770m.m1841c((String) objOverlayContentPathBindings5));
                        } catch (Exception unused10) {
                            objOverlayContentPathBindings5 = null;
                        }
                        if (objOverlayContentPathBindings5 == null) {
                            objOverlayContentPathBindings5 = null;
                        }
                    } else {
                        objOverlayContentPathBindings5 = null;
                    }
                }
                if (objOverlayContentPathBindings5 == null) {
                    objOverlayContentPathBindings5 = foreignMeasurements;
                }
            } else {
                obj7 = obj15;
            }
        } else {
            obj7 = obj15;
            if (objOverlayContentPathBindings5 != null) {
                objOverlayContentPathBindings5 = ContentPathBindingsKt.overlayContentPathBindings(map, "foreignMeasurements", accumulatedState, objOverlayContentPathBindings5, m.f86217w, n.f86218w);
            }
        }
        Object obj17 = obj7;
        List<C22200c> foreignMeasurements2 = (List) DotPathBindingsKt.overlayAggregateBinding(map2, "foreignMeasurements", accumulatedState, objOverlayContentPathBindings5, "foreignMeasurements", o.f86219w, p.f86220w, q.f86221w);
        if (foreignMeasurements2 == null) {
            foreignMeasurements2 = circumferenceModel.getForeignMeasurements();
        }
        List<C22200c> list5 = foreignMeasurements2;
        Map<String, String> bindings = circumferenceModel.getBindings();
        if (bindings == null) {
            objOverlayContentPathBindings6 = null;
        } else {
            if (bindings instanceof WithGeneratedBindings) {
                WithGeneratedBindings withGeneratedBindingsBind10 = ((WithGeneratedBindings) bindings).bind(accumulatedState);
                if (!(withGeneratedBindingsBind10 instanceof Map)) {
                    withGeneratedBindingsBind10 = null;
                }
                map3 = (Map) withGeneratedBindingsBind10;
                if (map3 == null) {
                    map3 = bindings;
                }
            } else if (bindings instanceof List) {
                Iterable iterable4 = (Iterable) bindings;
                List arrayList6 = new ArrayList(AbstractC25267u.m74163i0(iterable4, 10));
                for (Object obj18 : iterable4) {
                    WithGeneratedBindings withGeneratedBindings6 = obj18 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj18 : null;
                    if (withGeneratedBindings6 != null && (withGeneratedBindingsBind6 = withGeneratedBindings6.bind(accumulatedState)) != null) {
                        obj18 = withGeneratedBindingsBind6;
                    }
                    arrayList6.add(obj18);
                }
                map3 = (Map) arrayList6;
            } else {
                map3 = bindings;
            }
            objOverlayContentPathBindings6 = map3;
        }
        String strResolveContentBindingKey6 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "bindings") : null;
        if (strResolveContentBindingKey6 != null) {
            Object objResolveStateRef6 = StateLookupKt.resolveStateRef(strResolveContentBindingKey6, accumulatedState);
            if (objResolveStateRef6 != null) {
                BindingLoggerKt.logContentBinding("bindings", strResolveContentBindingKey6, objResolveStateRef6);
                Object objUnwrapForCoercion6 = BindCoercionKt.unwrapForCoercion(objResolveStateRef6);
                if ((objUnwrapForCoercion6 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion6) && AbstractC22676k.m65745e(accumulatedState.get(obj17), Boolean.TRUE)) {
                    objOverlayContentPathBindings6 = null;
                } else {
                    objOverlayContentPathBindings6 = BindCoercionKt.unwrapForCoercion(objResolveStateRef6);
                    if (objOverlayContentPathBindings6 == null) {
                        objOverlayContentPathBindings6 = null;
                    } else if (objOverlayContentPathBindings6 instanceof JsonElement) {
                        JsonElement jsonElement5 = (JsonElement) objOverlayContentPathBindings6;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            StringSerializer stringSerializer = StringSerializer.INSTANCE;
                            objOverlayContentPathBindings6 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer, stringSerializer), jsonElement5);
                        } catch (Exception unused11) {
                            objOverlayContentPathBindings6 = null;
                        }
                    } else if (!(objOverlayContentPathBindings6 instanceof Map)) {
                        if (objOverlayContentPathBindings6 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a6 = AbstractC22671h0.m65688a(Map.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings6 = (Map) Integer.valueOf(((Number) objOverlayContentPathBindings6).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings6 = (Map) Long.valueOf(((Number) objOverlayContentPathBindings6).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings6 = (Map) Double.valueOf(((Number) objOverlayContentPathBindings6).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings6 = (Map) Float.valueOf(((Number) objOverlayContentPathBindings6).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings6 = (Map) Short.valueOf(((Number) objOverlayContentPathBindings6).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings6 = (Map) Byte.valueOf(((Number) objOverlayContentPathBindings6).byteValue());
                            } else {
                                objOverlayContentPathBindings6 = null;
                            }
                        } else if (objOverlayContentPathBindings6 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c5 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings6);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                StringSerializer stringSerializer2 = StringSerializer.INSTANCE;
                                objOverlayContentPathBindings6 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer2, stringSerializer2), jsonPrimitiveM1841c5);
                            } catch (Exception unused12) {
                                objOverlayContentPathBindings6 = null;
                            }
                            if (objOverlayContentPathBindings6 == null) {
                                objOverlayContentPathBindings6 = null;
                            }
                        } else {
                            objOverlayContentPathBindings6 = null;
                        }
                    }
                    if (objOverlayContentPathBindings6 == null) {
                        objOverlayContentPathBindings6 = bindings;
                    }
                }
            }
        } else if (objOverlayContentPathBindings6 != null) {
            objOverlayContentPathBindings6 = ContentPathBindingsKt.overlayContentPathBindings(map, "bindings", accumulatedState, objOverlayContentPathBindings6, r.f86222w, s.f86223w);
        }
        Map map5 = (Map) DotPathBindingsKt.overlayAggregateBinding(map2, "bindings", accumulatedState, objOverlayContentPathBindings6, "bindings", t.f86224w, u.f86225w, w.f86227w);
        Map<String, AggregateBinding> aggregateBindings = circumferenceModel.getAggregateBindings();
        if (aggregateBindings == null) {
            obj8 = null;
        } else {
            if (aggregateBindings instanceof WithGeneratedBindings) {
                WithGeneratedBindings withGeneratedBindingsBind11 = ((WithGeneratedBindings) aggregateBindings).bind(accumulatedState);
                if (!(withGeneratedBindingsBind11 instanceof Map)) {
                    withGeneratedBindingsBind11 = null;
                }
                map4 = (Map) withGeneratedBindingsBind11;
                if (map4 == null) {
                    map4 = aggregateBindings;
                }
            } else if (aggregateBindings instanceof List) {
                Iterable iterable5 = (Iterable) aggregateBindings;
                List arrayList7 = new ArrayList(AbstractC25267u.m74163i0(iterable5, 10));
                for (Object obj19 : iterable5) {
                    WithGeneratedBindings withGeneratedBindings7 = obj19 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj19 : null;
                    if (withGeneratedBindings7 != null && (withGeneratedBindingsBind7 = withGeneratedBindings7.bind(accumulatedState)) != null) {
                        obj19 = withGeneratedBindingsBind7;
                    }
                    arrayList7.add(obj19);
                }
                map4 = (Map) arrayList7;
            } else {
                map4 = aggregateBindings;
            }
            obj8 = map4;
        }
        String strResolveContentBindingKey7 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "aggregateBindings") : null;
        if (strResolveContentBindingKey7 != null) {
            Object objResolveStateRef7 = StateLookupKt.resolveStateRef(strResolveContentBindingKey7, accumulatedState);
            if (objResolveStateRef7 != null) {
                BindingLoggerKt.logContentBinding("aggregateBindings", strResolveContentBindingKey7, objResolveStateRef7);
                Object objUnwrapForCoercion7 = BindCoercionKt.unwrapForCoercion(objResolveStateRef7);
                if ((objUnwrapForCoercion7 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion7) && AbstractC22676k.m65745e(accumulatedState.get(obj17), Boolean.TRUE)) {
                    obj8 = null;
                } else {
                    Object objUnwrapForCoercion8 = BindCoercionKt.unwrapForCoercion(objResolveStateRef7);
                    if (objUnwrapForCoercion8 == null) {
                        objOverlayContentPathBindings7 = null;
                    } else if (objUnwrapForCoercion8 instanceof JsonElement) {
                        JsonElement jsonElement6 = (JsonElement) objUnwrapForCoercion8;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings7 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonElement6);
                        } catch (Exception unused13) {
                            objOverlayContentPathBindings7 = null;
                        }
                    } else if (objUnwrapForCoercion8 instanceof Map) {
                        objOverlayContentPathBindings7 = objUnwrapForCoercion8;
                    } else {
                        if (objUnwrapForCoercion8 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a7 = AbstractC22671h0.m65688a(Map.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings7 = (Map) Integer.valueOf(((Number) objUnwrapForCoercion8).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings7 = (Map) Long.valueOf(((Number) objUnwrapForCoercion8).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings7 = (Map) Double.valueOf(((Number) objUnwrapForCoercion8).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings7 = (Map) Float.valueOf(((Number) objUnwrapForCoercion8).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings7 = (Map) Short.valueOf(((Number) objUnwrapForCoercion8).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings7 = (Map) Byte.valueOf(((Number) objUnwrapForCoercion8).byteValue());
                            }
                        } else if (objUnwrapForCoercion8 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c6 = AbstractC0770m.m1841c((String) objUnwrapForCoercion8);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objUnwrapForCoercion8 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonPrimitiveM1841c6);
                            } catch (Exception unused14) {
                                objUnwrapForCoercion8 = null;
                            }
                            if (objUnwrapForCoercion8 != null) {
                                objOverlayContentPathBindings7 = objUnwrapForCoercion8;
                            }
                        }
                        objOverlayContentPathBindings7 = null;
                    }
                    obj8 = objOverlayContentPathBindings7 == null ? aggregateBindings : objOverlayContentPathBindings7;
                }
            }
        } else if (obj8 != null) {
            objOverlayContentPathBindings7 = ContentPathBindingsKt.overlayContentPathBindings(map, "aggregateBindings", accumulatedState, obj8, x.f86228w, y.f86229w);
        }
        return (CircumferenceModel) ContentBindingResolverKt.copyBindingsFrom(new CircumferenceModel(list3, circumferencePickerModel, str, str2, list5, map5, (Map) DotPathBindingsKt.overlayAggregateBinding(map2, "aggregateBindings", accumulatedState, obj8, "aggregateBindings", z.f86230w, a0.f86197w, b0.f86199w)), circumferenceModel);
    }
}
