package cj0;

import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import com.whoop.archv2.model.template.FlowStep;
import com.whoop.archv2.model.template.FlowTemplate;
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
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: cj0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aS\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lcom/whoop/archv2/model/template/FlowTemplate;", "", "", "contentBinding", "Lcom/whoop/design/models/binding/AggregateBinding;", "aggregateBindings", "", "accumulatedState", "a", "(Lcom/whoop/archv2/model/template/FlowTemplate;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/archv2/model/template/FlowTemplate;", "arch-v2_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4742d {

    /* JADX INFO: renamed from: cj0.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f19423w = new a();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<? extends java.lang.String>] */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List<? extends java.lang.String>] */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List<? extends java.lang.String>] */
        @Override // p715kotlin.jvm.functions.Function1
        public final List<? extends String> invoke(Object obj) {
            Object objM1830a;
            ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj);
            if (UnwrapForCoercion == 0) {
                return null;
            }
            if (UnwrapForCoercion instanceof JsonElement) {
                JsonElement jsonElement = (JsonElement) UnwrapForCoercion;
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(StringSerializer.INSTANCE), jsonElement);
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
                    objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(StringSerializer.INSTANCE), jsonPrimitiveM1841c);
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

    /* JADX INFO: renamed from: cj0.d$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f19424w = new b();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JsonElement invoke(Map<String, ? extends FlowStep> v13) {
            AbstractC22676k.m65750j(v13, "v");
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                LinkedHashMapSerializer linkedHashMapSerializer = new LinkedHashMapSerializer(StringSerializer.INSTANCE, FlowStep.INSTANCE.serializer());
                AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                stateBindingJson.getClass();
                return AbstractC12313p.m34290h0(stateBindingJson, v13, linkedHashMapSerializer);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: cj0.d$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f19425w = new c();

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.archv2.model.template.FlowStep>] */
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<String, ? extends FlowStep> invoke(JsonElement json) {
            AbstractC22676k.m65750j(json, "json");
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, FlowStep.INSTANCE.serializer()), json);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: cj0.d$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f19426w = new d();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JsonElement invoke(Map<String, ? extends FlowStep> map) {
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new LinkedHashMapSerializer(StringSerializer.INSTANCE, FlowStep.INSTANCE.serializer()));
                AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                stateBindingJson.getClass();
                return AbstractC12313p.m34290h0(stateBindingJson, map, interfaceC37138cM122336d);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: cj0.d$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f19427w = new e();

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.archv2.model.template.FlowStep>] */
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<String, ? extends FlowStep> invoke(JsonElement json) {
            AbstractC22676k.m65750j(json, "json");
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, FlowStep.INSTANCE.serializer()), json);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: cj0.d$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f19428w = new f();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, ? extends com.whoop.archv2.model.template.FlowStep>] */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.archv2.model.template.FlowStep>] */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.archv2.model.template.FlowStep>] */
        @Override // p715kotlin.jvm.functions.Function1
        public final Map<String, ? extends FlowStep> invoke(Object obj) {
            Object objM1830a;
            ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj);
            if (UnwrapForCoercion == 0) {
                return null;
            }
            if (UnwrapForCoercion instanceof JsonElement) {
                JsonElement jsonElement = (JsonElement) UnwrapForCoercion;
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, FlowStep.INSTANCE.serializer()), jsonElement);
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
                    objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, FlowStep.INSTANCE.serializer()), jsonPrimitiveM1841c);
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

    /* JADX INFO: renamed from: cj0.d$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f19429w = new g();

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

    /* JADX INFO: renamed from: cj0.d$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f19430w = new h();

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

    /* JADX INFO: renamed from: cj0.d$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i f19431w = new i();

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

    /* JADX INFO: renamed from: cj0.d$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final j f19432w = new j();

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

    /* JADX INFO: renamed from: cj0.d$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final k f19433w = new k();

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

    /* JADX INFO: renamed from: cj0.d$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final l f19434w = new l();

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

    /* JADX INFO: renamed from: cj0.d$m */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final m f19435w = new m();

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

    /* JADX INFO: renamed from: cj0.d$n */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final n f19436w = new n();

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

    /* JADX INFO: renamed from: cj0.d$o */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final o f19437w = new o();

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

    /* JADX INFO: renamed from: cj0.d$p */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final p f19438w = new p();

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

    /* JADX INFO: renamed from: cj0.d$q */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final q f19439w = new q();

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

    /* JADX INFO: renamed from: cj0.d$r */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final r f19440w = new r();

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

    /* JADX INFO: renamed from: cj0.d$s */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final s f19441w = new s();

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

    /* JADX INFO: renamed from: cj0.d$t */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final t f19442w = new t();

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

    /* JADX INFO: renamed from: cj0.d$u */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final u f19443w = new u();

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

    /* JADX INFO: renamed from: cj0.d$v */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final v f19444w = new v();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JsonElement invoke(List<? extends String> v13) {
            AbstractC22676k.m65750j(v13, "v");
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                ArrayListSerializer arrayListSerializer = new ArrayListSerializer(StringSerializer.INSTANCE);
                AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                stateBindingJson.getClass();
                return AbstractC12313p.m34290h0(stateBindingJson, v13, arrayListSerializer);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: cj0.d$w */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class w implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final w f19445w = new w();

        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List<? extends java.lang.String>] */
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<? extends String> invoke(JsonElement json) {
            AbstractC22676k.m65750j(json, "json");
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(StringSerializer.INSTANCE), json);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: cj0.d$x */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class x implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final x f19446w = new x();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JsonElement invoke(List<? extends String> list) {
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new ArrayListSerializer(StringSerializer.INSTANCE));
                AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                stateBindingJson.getClass();
                return AbstractC12313p.m34290h0(stateBindingJson, list, interfaceC37138cM122336d);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: cj0.d$y */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class y implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final y f19447w = new y();

        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List<? extends java.lang.String>] */
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<? extends String> invoke(JsonElement json) {
            AbstractC22676k.m65750j(json, "json");
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(StringSerializer.INSTANCE), json);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:104:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:105:0x01da  */
    /* JADX WARN: Code duplicated, block: B:107:0x01de  */
    /* JADX WARN: Code duplicated, block: B:109:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:112:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:116:0x0208  */
    /* JADX WARN: Code duplicated, block: B:118:0x0210  */
    /* JADX WARN: Code duplicated, block: B:119:0x0214  */
    /* JADX WARN: Code duplicated, block: B:130:0x0229  */
    /* JADX WARN: Code duplicated, block: B:131:0x022e  */
    /* JADX WARN: Code duplicated, block: B:133:0x0231  */
    /* JADX WARN: Code duplicated, block: B:135:0x0237  */
    /* JADX WARN: Code duplicated, block: B:142:0x0259  */
    /* JADX WARN: Code duplicated, block: B:144:0x025f  */
    /* JADX WARN: Code duplicated, block: B:145:0x0262  */
    /* JADX WARN: Code duplicated, block: B:147:0x0266  */
    /* JADX WARN: Code duplicated, block: B:150:0x0280  */
    /* JADX WARN: Code duplicated, block: B:153:0x0286  */
    /* JADX WARN: Code duplicated, block: B:155:0x028a  */
    /* JADX WARN: Code duplicated, block: B:157:0x029c  */
    /* JADX WARN: Code duplicated, block: B:158:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:160:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:161:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:163:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:164:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:166:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:167:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:169:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:170:0x0307  */
    /* JADX WARN: Code duplicated, block: B:172:0x0311  */
    /* JADX WARN: Code duplicated, block: B:173:0x031e  */
    /* JADX WARN: Code duplicated, block: B:175:0x0322  */
    /* JADX WARN: Code duplicated, block: B:181:0x0344  */
    /* JADX WARN: Code duplicated, block: B:182:0x0346 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:184:0x0349  */
    /* JADX WARN: Code duplicated, block: B:187:0x0365  */
    /* JADX WARN: Code duplicated, block: B:190:0x0371  */
    /* JADX WARN: Code duplicated, block: B:191:0x0373  */
    /* JADX WARN: Code duplicated, block: B:193:0x0377  */
    /* JADX WARN: Code duplicated, block: B:195:0x0382  */
    /* JADX WARN: Code duplicated, block: B:199:0x0388  */
    /* JADX WARN: Code duplicated, block: B:201:0x038c  */
    /* JADX WARN: Code duplicated, block: B:204:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:206:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:207:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:215:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:219:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:220:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:223:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:225:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:232:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:234:0x0401  */
    /* JADX WARN: Code duplicated, block: B:235:0x0404  */
    /* JADX WARN: Code duplicated, block: B:237:0x0408  */
    /* JADX WARN: Code duplicated, block: B:240:0x0428  */
    /* JADX WARN: Code duplicated, block: B:243:0x042e  */
    /* JADX WARN: Code duplicated, block: B:245:0x0432  */
    /* JADX WARN: Code duplicated, block: B:247:0x0442  */
    /* JADX WARN: Code duplicated, block: B:248:0x0450  */
    /* JADX WARN: Code duplicated, block: B:250:0x045a  */
    /* JADX WARN: Code duplicated, block: B:251:0x0468  */
    /* JADX WARN: Code duplicated, block: B:253:0x0472  */
    /* JADX WARN: Code duplicated, block: B:254:0x047f  */
    /* JADX WARN: Code duplicated, block: B:256:0x0489  */
    /* JADX WARN: Code duplicated, block: B:257:0x0496  */
    /* JADX WARN: Code duplicated, block: B:259:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:260:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:262:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:263:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:265:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:271:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:272:0x04f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:274:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:277:0x0515  */
    /* JADX WARN: Code duplicated, block: B:280:0x0521  */
    /* JADX WARN: Code duplicated, block: B:281:0x0523  */
    /* JADX WARN: Code duplicated, block: B:283:0x0527  */
    /* JADX WARN: Code duplicated, block: B:285:0x0532  */
    /* JADX WARN: Code duplicated, block: B:289:0x0538  */
    /* JADX WARN: Code duplicated, block: B:291:0x053c  */
    /* JADX WARN: Code duplicated, block: B:294:0x0554  */
    /* JADX WARN: Code duplicated, block: B:296:0x055c  */
    /* JADX WARN: Code duplicated, block: B:297:0x0560  */
    /* JADX WARN: Code duplicated, block: B:305:0x0573  */
    /* JADX WARN: Code duplicated, block: B:309:0x0579  */
    /* JADX WARN: Code duplicated, block: B:310:0x057e  */
    /* JADX WARN: Code duplicated, block: B:312:0x0581  */
    /* JADX WARN: Code duplicated, block: B:314:0x0587  */
    /* JADX WARN: Code duplicated, block: B:321:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:323:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:325:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:327:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:332:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:335:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:337:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:339:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:340:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:342:0x0608  */
    /* JADX WARN: Code duplicated, block: B:343:0x0615  */
    /* JADX WARN: Code duplicated, block: B:345:0x061f  */
    /* JADX WARN: Code duplicated, block: B:346:0x062c  */
    /* JADX WARN: Code duplicated, block: B:348:0x0636  */
    /* JADX WARN: Code duplicated, block: B:349:0x0643  */
    /* JADX WARN: Code duplicated, block: B:351:0x064d  */
    /* JADX WARN: Code duplicated, block: B:352:0x065b  */
    /* JADX WARN: Code duplicated, block: B:354:0x0667  */
    /* JADX WARN: Code duplicated, block: B:355:0x0674  */
    /* JADX WARN: Code duplicated, block: B:357:0x067a  */
    /* JADX WARN: Code duplicated, block: B:363:0x069c  */
    /* JADX WARN: Code duplicated, block: B:364:0x069e  */
    /* JADX WARN: Code duplicated, block: B:365:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:368:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:371:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:372:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:374:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:376:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:380:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:382:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:385:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:387:0x0707  */
    /* JADX WARN: Code duplicated, block: B:388:0x070b  */
    /* JADX WARN: Code duplicated, block: B:396:0x071e  */
    /* JADX WARN: Code duplicated, block: B:400:0x0724  */
    /* JADX WARN: Code duplicated, block: B:401:0x0729  */
    /* JADX WARN: Code duplicated, block: B:403:0x072c  */
    /* JADX WARN: Code duplicated, block: B:405:0x0732  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:412:0x0754  */
    /* JADX WARN: Code duplicated, block: B:414:0x075a  */
    /* JADX WARN: Code duplicated, block: B:415:0x075d  */
    /* JADX WARN: Code duplicated, block: B:417:0x0761  */
    /* JADX WARN: Code duplicated, block: B:420:0x0781  */
    /* JADX WARN: Code duplicated, block: B:422:0x0785 A[PHI: r0
      0x0785: PHI (r0v28 java.lang.Object) = (r0v6 java.lang.Object), (r0v10 java.lang.Object) binds: [B:421:0x0783, B:449:0x084f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:423:0x0788  */
    /* JADX WARN: Code duplicated, block: B:425:0x078c  */
    /* JADX WARN: Code duplicated, block: B:427:0x079c  */
    /* JADX WARN: Code duplicated, block: B:428:0x07ab  */
    /* JADX WARN: Code duplicated, block: B:430:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:431:0x07c4  */
    /* JADX WARN: Code duplicated, block: B:433:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:434:0x07dd  */
    /* JADX WARN: Code duplicated, block: B:436:0x07e7  */
    /* JADX WARN: Code duplicated, block: B:437:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:439:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:440:0x080d  */
    /* JADX WARN: Code duplicated, block: B:442:0x0819  */
    /* JADX WARN: Code duplicated, block: B:443:0x0827  */
    /* JADX WARN: Code duplicated, block: B:445:0x082b  */
    /* JADX WARN: Code duplicated, block: B:452:0x0855  */
    /* JADX WARN: Code duplicated, block: B:453:0x0857 A[PHI: r10
      0x0857: PHI (r10v2 java.lang.Object) = (r10v1 java.lang.Object), (r10v17 java.lang.Object) binds: [B:456:0x085c, B:451:0x0853] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:454:0x0859 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:456:0x085c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final FlowTemplate m14895a(FlowTemplate flowTemplate, Map<String, String> map, Map<String, AggregateBinding> map2, Map<String, ? extends Object> accumulatedState) {
        Object objOverlayContentPathBindings;
        WithGeneratedBindings withGeneratedBindingsBind;
        String flowId;
        List<String> currentStepList;
        ArrayList arrayList;
        List list;
        WithGeneratedBindings withGeneratedBindings;
        WithGeneratedBindings withGeneratedBindingsBind2;
        Object objOverlayContentPathBindings2;
        WithGeneratedBindings withGeneratedBindingsBind3;
        String strResolveContentBindingKey;
        List<String> currentStepList2;
        Map<String, FlowStep> steps;
        List arrayList2;
        Map<String, FlowStep> map3;
        WithGeneratedBindings withGeneratedBindings2;
        WithGeneratedBindings withGeneratedBindingsBind4;
        Object objOverlayContentPathBindings3;
        WithGeneratedBindings withGeneratedBindingsBind5;
        String strResolveContentBindingKey2;
        Map<String, FlowStep> steps2;
        Map<String, String> bindings;
        List arrayList3;
        Map<String, String> map4;
        WithGeneratedBindings withGeneratedBindings3;
        WithGeneratedBindings withGeneratedBindingsBind6;
        Object objOverlayContentPathBindings4;
        WithGeneratedBindings withGeneratedBindingsBind7;
        String strResolveContentBindingKey3;
        Class cls;
        Class cls2;
        Map<String, AggregateBinding> aggregateBindings;
        List arrayList4;
        Map<String, AggregateBinding> map5;
        WithGeneratedBindings withGeneratedBindings4;
        WithGeneratedBindings withGeneratedBindingsBind8;
        Object obj;
        WithGeneratedBindings withGeneratedBindingsBind9;
        String strResolveContentBindingKey4;
        Object objOverlayContentPathBindings5;
        Object objResolveStateRef;
        Object objUnwrapForCoercion;
        Object objUnwrapForCoercion2;
        C22673i0 c22673i0;
        InterfaceC21461d orCreateKotlinClass;
        Object objResolveStateRef2;
        Object objUnwrapForCoercion3;
        C22673i0 c22673i1;
        InterfaceC21461d orCreateKotlinClass2;
        Object objResolveStateRef3;
        Object objUnwrapForCoercion4;
        C22673i0 c22673i2;
        InterfaceC21461d orCreateKotlinClass3;
        Object objResolveStateRef4;
        Object objUnwrapForCoercion5;
        C22673i0 c22673i3;
        InterfaceC21461d orCreateKotlinClass4;
        AbstractC22676k.m65750j(flowTemplate, "<this>");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        if ((map == null || map.isEmpty()) && ((map2 == null || map2.isEmpty()) && accumulatedState.isEmpty())) {
            return flowTemplate;
        }
        Object flowId2 = flowTemplate.getFlowId();
        if (flowId2 == null) {
            objOverlayContentPathBindings = null;
        } else if (flowId2 instanceof WithGeneratedBindings) {
            Object objBind = ((WithGeneratedBindings) flowId2).bind(accumulatedState);
            if (!(objBind instanceof String)) {
                objBind = null;
            }
            objOverlayContentPathBindings = (String) objBind;
            if (objOverlayContentPathBindings == null) {
                objOverlayContentPathBindings = flowId2;
            }
        } else if (flowId2 instanceof List) {
            Iterable iterable = (Iterable) flowId2;
            ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
            for (Object obj2 : iterable) {
                WithGeneratedBindings withGeneratedBindings5 = obj2 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj2 : null;
                if (withGeneratedBindings5 != null && (withGeneratedBindingsBind = withGeneratedBindings5.bind(accumulatedState)) != null) {
                    obj2 = withGeneratedBindingsBind;
                }
                arrayList5.add(obj2);
            }
            objOverlayContentPathBindings = (String) arrayList5;
        } else {
            objOverlayContentPathBindings = flowId2;
        }
        String strResolveContentBindingKey5 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "flowId") : null;
        Class cls3 = Byte.TYPE;
        Class cls4 = Short.TYPE;
        Class cls5 = Float.TYPE;
        Class cls6 = Double.TYPE;
        Class cls7 = Long.TYPE;
        Class cls8 = Integer.TYPE;
        if (strResolveContentBindingKey5 != null) {
            Object objResolveStateRef5 = StateLookupKt.resolveStateRef(strResolveContentBindingKey5, accumulatedState);
            if (objResolveStateRef5 != null) {
                BindingLoggerKt.logContentBinding("flowId", strResolveContentBindingKey5, objResolveStateRef5);
                Object objUnwrapForCoercion6 = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                if ((objUnwrapForCoercion6 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion6) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                    objOverlayContentPathBindings = null;
                } else {
                    objOverlayContentPathBindings = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                    if (objOverlayContentPathBindings == null) {
                        objOverlayContentPathBindings = null;
                    } else if (objOverlayContentPathBindings instanceof JsonElement) {
                        JsonElement jsonElement = (JsonElement) objOverlayContentPathBindings;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement);
                        } catch (Exception unused) {
                            objOverlayContentPathBindings = null;
                        }
                    } else {
                        boolean z4 = objOverlayContentPathBindings instanceof String;
                        if (!z4) {
                            if (objOverlayContentPathBindings instanceof Number) {
                                C22673i0 c22673i4 = AbstractC22671h0.f89337a;
                                InterfaceC21461d orCreateKotlinClass5 = c22673i4.getOrCreateKotlinClass(String.class);
                                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls8))) {
                                    objOverlayContentPathBindings = (String) Integer.valueOf(((Number) objOverlayContentPathBindings).intValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls7))) {
                                    objOverlayContentPathBindings = (String) Long.valueOf(((Number) objOverlayContentPathBindings).longValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls6))) {
                                    objOverlayContentPathBindings = (String) Double.valueOf(((Number) objOverlayContentPathBindings).doubleValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls5))) {
                                    objOverlayContentPathBindings = (String) Float.valueOf(((Number) objOverlayContentPathBindings).floatValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls4))) {
                                    objOverlayContentPathBindings = (String) Short.valueOf(((Number) objOverlayContentPathBindings).shortValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls3))) {
                                    objOverlayContentPathBindings = (String) Byte.valueOf(((Number) objOverlayContentPathBindings).byteValue());
                                } else {
                                    objOverlayContentPathBindings = null;
                                }
                            } else if (z4) {
                                JsonPrimitive jsonPrimitiveM1841c = AbstractC0770m.m1841c((String) objOverlayContentPathBindings);
                                try {
                                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                                    objOverlayContentPathBindings = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c);
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
                    }
                    if (objOverlayContentPathBindings == null) {
                        objOverlayContentPathBindings = flowId2;
                    }
                }
            }
            flowId = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "flowId", accumulatedState, objOverlayContentPathBindings, "flowId", s.f19441w, t.f19442w, u.f19443w);
            if (flowId == null) {
                flowId = flowTemplate.getFlowId();
            }
            String str = flowId;
            currentStepList = flowTemplate.getCurrentStepList();
            if (currentStepList == null) {
                objOverlayContentPathBindings2 = null;
            } else {
                if (currentStepList instanceof WithGeneratedBindings) {
                    withGeneratedBindingsBind3 = ((WithGeneratedBindings) currentStepList).bind(accumulatedState);
                    if (!(withGeneratedBindingsBind3 instanceof List)) {
                        withGeneratedBindingsBind3 = null;
                    }
                    list = (List) withGeneratedBindingsBind3;
                    if (list == null) {
                        list = currentStepList;
                    }
                } else {
                    List<String> list2 = currentStepList;
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                    for (Object obj3 : list2) {
                        if (obj3 instanceof WithGeneratedBindings) {
                            withGeneratedBindings = (WithGeneratedBindings) obj3;
                        } else {
                            withGeneratedBindings = null;
                        }
                        if (withGeneratedBindings == null && (withGeneratedBindingsBind2 = withGeneratedBindings.bind(accumulatedState)) != null) {
                            obj3 = withGeneratedBindingsBind2;
                        }
                        arrayList.add(obj3);
                    }
                    list = arrayList;
                }
                objOverlayContentPathBindings2 = list;
            }
            if (r1 != 0) {
                strResolveContentBindingKey = BindingLoggerKt.resolveContentBindingKey(map, "current_step_list");
            } else {
                strResolveContentBindingKey = null;
            }
            if (strResolveContentBindingKey != null) {
                objResolveStateRef4 = StateLookupKt.resolveStateRef(strResolveContentBindingKey, accumulatedState);
                if (objResolveStateRef4 != null) {
                    BindingLoggerKt.logContentBinding("current_step_list", strResolveContentBindingKey, objResolveStateRef4);
                    objUnwrapForCoercion5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                    if (!(objUnwrapForCoercion5 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion5) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                        objOverlayContentPathBindings2 = null;
                    } else {
                        objOverlayContentPathBindings2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                        if (objOverlayContentPathBindings2 == null) {
                            objOverlayContentPathBindings2 = null;
                        } else if (objOverlayContentPathBindings2 instanceof JsonElement) {
                            JsonElement jsonElement2 = (JsonElement) objOverlayContentPathBindings2;
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(StringSerializer.INSTANCE), jsonElement2);
                            } catch (Exception unused3) {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else if (!(objOverlayContentPathBindings2 instanceof List)) {
                            if (objOverlayContentPathBindings2 instanceof Number) {
                                c22673i3 = AbstractC22671h0.f89337a;
                                orCreateKotlinClass4 = c22673i3.getOrCreateKotlinClass(List.class);
                                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls8))) {
                                    objOverlayContentPathBindings2 = (List) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls7))) {
                                    objOverlayContentPathBindings2 = (List) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls6))) {
                                    objOverlayContentPathBindings2 = (List) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls5))) {
                                    objOverlayContentPathBindings2 = (List) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls4))) {
                                    objOverlayContentPathBindings2 = (List) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls3))) {
                                    objOverlayContentPathBindings2 = (List) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                                } else {
                                    objOverlayContentPathBindings2 = null;
                                }
                            } else if (objOverlayContentPathBindings2 instanceof String) {
                                JsonPrimitive jsonPrimitiveM1841c2 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings2);
                                try {
                                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                                    objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(StringSerializer.INSTANCE), jsonPrimitiveM1841c2);
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
                            objOverlayContentPathBindings2 = currentStepList;
                        }
                    }
                }
            } else if (objOverlayContentPathBindings2 != null) {
                objOverlayContentPathBindings2 = ContentPathBindingsKt.overlayContentPathBindings(r1, "current_step_list", accumulatedState, objOverlayContentPathBindings2, v.f19444w, w.f19445w);
            }
            currentStepList2 = (List) DotPathBindingsKt.overlayAggregateBinding(map2, "current_step_list", accumulatedState, objOverlayContentPathBindings2, "current_step_list", x.f19446w, y.f19447w, a.f19423w);
            if (currentStepList2 == null) {
                currentStepList2 = flowTemplate.getCurrentStepList();
            }
            List<String> list3 = currentStepList2;
            steps = flowTemplate.getSteps();
            if (steps == null) {
                objOverlayContentPathBindings3 = null;
            } else {
                if (steps instanceof WithGeneratedBindings) {
                    withGeneratedBindingsBind5 = ((WithGeneratedBindings) steps).bind(accumulatedState);
                    if (!(withGeneratedBindingsBind5 instanceof Map)) {
                        withGeneratedBindingsBind5 = null;
                    }
                    map3 = (Map) withGeneratedBindingsBind5;
                    if (map3 == null) {
                        map3 = steps;
                    }
                } else if (steps instanceof List) {
                    Iterable iterable2 = (Iterable) steps;
                    arrayList2 = new ArrayList(AbstractC25267u.m74163i0(iterable2, 10));
                    for (Object obj4 : iterable2) {
                        if (obj4 instanceof WithGeneratedBindings) {
                            withGeneratedBindings2 = (WithGeneratedBindings) obj4;
                        } else {
                            withGeneratedBindings2 = null;
                        }
                        if (withGeneratedBindings2 == null && (withGeneratedBindingsBind4 = withGeneratedBindings2.bind(accumulatedState)) != null) {
                            obj4 = withGeneratedBindingsBind4;
                        }
                        arrayList2.add(obj4);
                    }
                    map3 = (Map) arrayList2;
                } else {
                    map3 = steps;
                }
                objOverlayContentPathBindings3 = map3;
            }
            if (r1 != 0) {
                strResolveContentBindingKey2 = BindingLoggerKt.resolveContentBindingKey(r1, "steps");
            } else {
                strResolveContentBindingKey2 = null;
            }
            if (strResolveContentBindingKey2 != null) {
                objResolveStateRef3 = StateLookupKt.resolveStateRef(strResolveContentBindingKey2, accumulatedState);
                if (objResolveStateRef3 != null) {
                    BindingLoggerKt.logContentBinding("steps", strResolveContentBindingKey2, objResolveStateRef3);
                    objUnwrapForCoercion4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                    if (!(objUnwrapForCoercion4 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion4) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                        objOverlayContentPathBindings3 = null;
                    } else {
                        objOverlayContentPathBindings3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                        if (objOverlayContentPathBindings3 == null) {
                            objOverlayContentPathBindings3 = null;
                        } else if (objOverlayContentPathBindings3 instanceof JsonElement) {
                            JsonElement jsonElement3 = (JsonElement) objOverlayContentPathBindings3;
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, FlowStep.INSTANCE.serializer()), jsonElement3);
                            } catch (Exception unused5) {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else if (!(objOverlayContentPathBindings3 instanceof Map)) {
                            if (objOverlayContentPathBindings3 instanceof Number) {
                                c22673i2 = AbstractC22671h0.f89337a;
                                orCreateKotlinClass3 = c22673i2.getOrCreateKotlinClass(Map.class);
                                if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls8))) {
                                    objOverlayContentPathBindings3 = (Map) Integer.valueOf(((Number) objOverlayContentPathBindings3).intValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls7))) {
                                    objOverlayContentPathBindings3 = (Map) Long.valueOf(((Number) objOverlayContentPathBindings3).longValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls6))) {
                                    objOverlayContentPathBindings3 = (Map) Double.valueOf(((Number) objOverlayContentPathBindings3).doubleValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls5))) {
                                    objOverlayContentPathBindings3 = (Map) Float.valueOf(((Number) objOverlayContentPathBindings3).floatValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls4))) {
                                    objOverlayContentPathBindings3 = (Map) Short.valueOf(((Number) objOverlayContentPathBindings3).shortValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls3))) {
                                    objOverlayContentPathBindings3 = (Map) Byte.valueOf(((Number) objOverlayContentPathBindings3).byteValue());
                                } else {
                                    objOverlayContentPathBindings3 = null;
                                }
                            } else if (objOverlayContentPathBindings3 instanceof String) {
                                JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings3);
                                try {
                                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                                    objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, FlowStep.INSTANCE.serializer()), jsonPrimitiveM1841c3);
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
                        if (objOverlayContentPathBindings3 == null) {
                            objOverlayContentPathBindings3 = steps;
                        }
                    }
                }
            } else if (objOverlayContentPathBindings3 != null) {
                objOverlayContentPathBindings3 = ContentPathBindingsKt.overlayContentPathBindings(r1, "steps", accumulatedState, objOverlayContentPathBindings3, b.f19424w, c.f19425w);
            }
            steps2 = (Map) DotPathBindingsKt.overlayAggregateBinding(map2, "steps", accumulatedState, objOverlayContentPathBindings3, "steps", d.f19426w, e.f19427w, f.f19428w);
            if (steps2 == null) {
                steps2 = flowTemplate.getSteps();
            }
            Map<String, FlowStep> map6 = steps2;
            bindings = flowTemplate.getBindings();
            if (bindings == null) {
                objOverlayContentPathBindings4 = null;
            } else {
                if (bindings instanceof WithGeneratedBindings) {
                    withGeneratedBindingsBind7 = ((WithGeneratedBindings) bindings).bind(accumulatedState);
                    if (!(withGeneratedBindingsBind7 instanceof Map)) {
                        withGeneratedBindingsBind7 = null;
                    }
                    map4 = (Map) withGeneratedBindingsBind7;
                    if (map4 == null) {
                        map4 = bindings;
                    }
                } else if (bindings instanceof List) {
                    Iterable iterable3 = (Iterable) bindings;
                    arrayList3 = new ArrayList(AbstractC25267u.m74163i0(iterable3, 10));
                    for (Object obj5 : iterable3) {
                        if (obj5 instanceof WithGeneratedBindings) {
                            withGeneratedBindings3 = (WithGeneratedBindings) obj5;
                        } else {
                            withGeneratedBindings3 = null;
                        }
                        if (withGeneratedBindings3 == null && (withGeneratedBindingsBind6 = withGeneratedBindings3.bind(accumulatedState)) != null) {
                            obj5 = withGeneratedBindingsBind6;
                        }
                        arrayList3.add(obj5);
                    }
                    map4 = (Map) arrayList3;
                } else {
                    map4 = bindings;
                }
                objOverlayContentPathBindings4 = map4;
            }
            if (r1 != 0) {
                strResolveContentBindingKey3 = BindingLoggerKt.resolveContentBindingKey(r1, "bindings");
            } else {
                strResolveContentBindingKey3 = null;
            }
            if (strResolveContentBindingKey3 != null) {
                objResolveStateRef2 = StateLookupKt.resolveStateRef(strResolveContentBindingKey3, accumulatedState);
                if (objResolveStateRef2 != null) {
                    BindingLoggerKt.logContentBinding("bindings", strResolveContentBindingKey3, objResolveStateRef2);
                    objUnwrapForCoercion3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                    if (!(objUnwrapForCoercion3 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion3) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                        cls = cls3;
                        objOverlayContentPathBindings4 = null;
                    } else {
                        objOverlayContentPathBindings4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                        if (objOverlayContentPathBindings4 == null) {
                            cls = cls3;
                        } else {
                            if (objOverlayContentPathBindings4 instanceof JsonElement) {
                                JsonElement jsonElement4 = (JsonElement) objOverlayContentPathBindings4;
                                try {
                                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                                    StringSerializer stringSerializer = StringSerializer.INSTANCE;
                                    objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer, stringSerializer), jsonElement4);
                                } catch (Exception unused7) {
                                    objOverlayContentPathBindings4 = null;
                                }
                            } else {
                                if (!(objOverlayContentPathBindings4 instanceof Map)) {
                                    if (objOverlayContentPathBindings4 instanceof Number) {
                                        c22673i1 = AbstractC22671h0.f89337a;
                                        orCreateKotlinClass2 = c22673i1.getOrCreateKotlinClass(Map.class);
                                        if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls8))) {
                                            objOverlayContentPathBindings4 = (Map) Integer.valueOf(((Number) objOverlayContentPathBindings4).intValue());
                                        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls7))) {
                                            objOverlayContentPathBindings4 = (Map) Long.valueOf(((Number) objOverlayContentPathBindings4).longValue());
                                        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls6))) {
                                            objOverlayContentPathBindings4 = (Map) Double.valueOf(((Number) objOverlayContentPathBindings4).doubleValue());
                                        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls5))) {
                                            objOverlayContentPathBindings4 = (Map) Float.valueOf(((Number) objOverlayContentPathBindings4).floatValue());
                                        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls4))) {
                                            objOverlayContentPathBindings4 = (Map) Short.valueOf(((Number) objOverlayContentPathBindings4).shortValue());
                                        } else {
                                            cls = cls3;
                                            if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls))) {
                                                objOverlayContentPathBindings4 = (Map) Byte.valueOf(((Number) objOverlayContentPathBindings4).byteValue());
                                            }
                                        }
                                    } else {
                                        cls = cls3;
                                        if (objOverlayContentPathBindings4 instanceof String) {
                                            JsonPrimitive jsonPrimitiveM1841c4 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings4);
                                            try {
                                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                                StringSerializer stringSerializer2 = StringSerializer.INSTANCE;
                                                objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer2, stringSerializer2), jsonPrimitiveM1841c4);
                                            } catch (Exception unused8) {
                                                objOverlayContentPathBindings4 = null;
                                            }
                                            if (objOverlayContentPathBindings4 == null) {
                                            }
                                        }
                                    }
                                }
                                if (objOverlayContentPathBindings4 == null) {
                                    objOverlayContentPathBindings4 = bindings;
                                }
                            }
                            cls = cls3;
                            if (objOverlayContentPathBindings4 == null) {
                                objOverlayContentPathBindings4 = bindings;
                            }
                        }
                        objOverlayContentPathBindings4 = null;
                        if (objOverlayContentPathBindings4 == null) {
                            objOverlayContentPathBindings4 = bindings;
                        }
                    }
                } else {
                    cls = cls3;
                }
            } else {
                cls = cls3;
                if (objOverlayContentPathBindings4 != null) {
                    objOverlayContentPathBindings4 = ContentPathBindingsKt.overlayContentPathBindings(r1, "bindings", accumulatedState, objOverlayContentPathBindings4, g.f19429w, h.f19430w);
                }
            }
            cls2 = cls;
            Map map7 = (Map) DotPathBindingsKt.overlayAggregateBinding(map2, "bindings", accumulatedState, objOverlayContentPathBindings4, "bindings", i.f19431w, j.f19432w, l.f19434w);
            aggregateBindings = flowTemplate.getAggregateBindings();
            if (aggregateBindings == null) {
                obj = null;
            } else {
                if (aggregateBindings instanceof WithGeneratedBindings) {
                    withGeneratedBindingsBind9 = ((WithGeneratedBindings) aggregateBindings).bind(accumulatedState);
                    if (!(withGeneratedBindingsBind9 instanceof Map)) {
                        withGeneratedBindingsBind9 = null;
                    }
                    map5 = (Map) withGeneratedBindingsBind9;
                    if (map5 == null) {
                        map5 = aggregateBindings;
                    }
                } else if (aggregateBindings instanceof List) {
                    Iterable iterable4 = (Iterable) aggregateBindings;
                    arrayList4 = new ArrayList(AbstractC25267u.m74163i0(iterable4, 10));
                    for (Object obj6 : iterable4) {
                        if (obj6 instanceof WithGeneratedBindings) {
                            withGeneratedBindings4 = (WithGeneratedBindings) obj6;
                        } else {
                            withGeneratedBindings4 = null;
                        }
                        if (withGeneratedBindings4 == null && (withGeneratedBindingsBind8 = withGeneratedBindings4.bind(accumulatedState)) != null) {
                            obj6 = withGeneratedBindingsBind8;
                        }
                        arrayList4.add(obj6);
                    }
                    map5 = (Map) arrayList4;
                } else {
                    map5 = aggregateBindings;
                }
                obj = map5;
            }
            if (r1 != 0) {
                strResolveContentBindingKey4 = BindingLoggerKt.resolveContentBindingKey(r1, "aggregateBindings");
            } else {
                strResolveContentBindingKey4 = null;
            }
            if (strResolveContentBindingKey4 != null) {
                objResolveStateRef = StateLookupKt.resolveStateRef(strResolveContentBindingKey4, accumulatedState);
                if (objResolveStateRef != null) {
                    BindingLoggerKt.logContentBinding("aggregateBindings", strResolveContentBindingKey4, objResolveStateRef);
                    objUnwrapForCoercion = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                    if (!(objUnwrapForCoercion instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                        obj = null;
                    } else {
                        objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                        if (objUnwrapForCoercion2 == null) {
                            objOverlayContentPathBindings5 = null;
                        } else if (objUnwrapForCoercion2 instanceof JsonElement) {
                            JsonElement jsonElement5 = (JsonElement) objUnwrapForCoercion2;
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonElement5);
                            } catch (Exception unused9) {
                                objOverlayContentPathBindings5 = null;
                            }
                        } else if (objUnwrapForCoercion2 instanceof Map) {
                            objOverlayContentPathBindings5 = objUnwrapForCoercion2;
                        } else {
                            if (objUnwrapForCoercion2 instanceof Number) {
                                c22673i0 = AbstractC22671h0.f89337a;
                                orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Map.class);
                                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls8))) {
                                    objOverlayContentPathBindings5 = (Map) Integer.valueOf(((Number) objUnwrapForCoercion2).intValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls7))) {
                                    objOverlayContentPathBindings5 = (Map) Long.valueOf(((Number) objUnwrapForCoercion2).longValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls6))) {
                                    objOverlayContentPathBindings5 = (Map) Double.valueOf(((Number) objUnwrapForCoercion2).doubleValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
                                    objOverlayContentPathBindings5 = (Map) Float.valueOf(((Number) objUnwrapForCoercion2).floatValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
                                    objOverlayContentPathBindings5 = (Map) Short.valueOf(((Number) objUnwrapForCoercion2).shortValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
                                    objOverlayContentPathBindings5 = (Map) Byte.valueOf(((Number) objUnwrapForCoercion2).byteValue());
                                }
                            } else if (objUnwrapForCoercion2 instanceof String) {
                                JsonPrimitive jsonPrimitiveM1841c5 = AbstractC0770m.m1841c((String) objUnwrapForCoercion2);
                                try {
                                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                                    objUnwrapForCoercion2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonPrimitiveM1841c5);
                                } catch (Exception unused10) {
                                    objUnwrapForCoercion2 = null;
                                }
                                if (objUnwrapForCoercion2 != null) {
                                    objOverlayContentPathBindings5 = objUnwrapForCoercion2;
                                }
                            }
                            objOverlayContentPathBindings5 = null;
                        }
                        if (objOverlayContentPathBindings5 == null) {
                            obj = aggregateBindings;
                        } else {
                            obj = objOverlayContentPathBindings5;
                        }
                    }
                }
            } else if (obj != null) {
                objOverlayContentPathBindings5 = ContentPathBindingsKt.overlayContentPathBindings(r1, "aggregateBindings", accumulatedState, obj, m.f19435w, n.f19436w);
                obj = objOverlayContentPathBindings5;
            }
            return (FlowTemplate) ContentBindingResolverKt.copyBindingsFrom(new FlowTemplate(str, list3, map6, map7, (Map) DotPathBindingsKt.overlayAggregateBinding(map2, "aggregateBindings", accumulatedState, obj, "aggregateBindings", o.f19437w, p.f19438w, q.f19439w)), flowTemplate);
        }
        if (objOverlayContentPathBindings != null) {
            objOverlayContentPathBindings = ContentPathBindingsKt.overlayContentPathBindings(map, "flowId", accumulatedState, objOverlayContentPathBindings, k.f19433w, r.f19440w);
        }
        flowId = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "flowId", accumulatedState, objOverlayContentPathBindings, "flowId", s.f19441w, t.f19442w, u.f19443w);
        if (flowId == null) {
            flowId = flowTemplate.getFlowId();
        }
        String str2 = flowId;
        currentStepList = flowTemplate.getCurrentStepList();
        if (currentStepList == null) {
            objOverlayContentPathBindings2 = null;
        } else {
            if (currentStepList instanceof WithGeneratedBindings) {
                withGeneratedBindingsBind3 = ((WithGeneratedBindings) currentStepList).bind(accumulatedState);
                if (!(withGeneratedBindingsBind3 instanceof List)) {
                    withGeneratedBindingsBind3 = null;
                }
                list = (List) withGeneratedBindingsBind3;
                if (list == null) {
                    list = currentStepList;
                }
            } else {
                List<String> list4 = currentStepList;
                arrayList = new ArrayList(AbstractC25267u.m74163i0(list4, 10));
                while (r2.hasNext()) {
                    if (obj3 instanceof WithGeneratedBindings) {
                        withGeneratedBindings = (WithGeneratedBindings) obj3;
                    } else {
                        withGeneratedBindings = null;
                    }
                    if (withGeneratedBindings == null) {
                    }
                    arrayList.add(obj3);
                }
                list = arrayList;
            }
            objOverlayContentPathBindings2 = list;
        }
        if (r1 != 0) {
            strResolveContentBindingKey = BindingLoggerKt.resolveContentBindingKey(map, "current_step_list");
        } else {
            strResolveContentBindingKey = null;
        }
        if (strResolveContentBindingKey != null) {
            objResolveStateRef4 = StateLookupKt.resolveStateRef(strResolveContentBindingKey, accumulatedState);
            if (objResolveStateRef4 != null) {
                BindingLoggerKt.logContentBinding("current_step_list", strResolveContentBindingKey, objResolveStateRef4);
                objUnwrapForCoercion5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                if (!(objUnwrapForCoercion5 instanceof String)) {
                    objOverlayContentPathBindings2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = null;
                    } else if (objOverlayContentPathBindings2 instanceof JsonElement) {
                        JsonElement jsonElement6 = (JsonElement) objOverlayContentPathBindings2;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(StringSerializer.INSTANCE), jsonElement6);
                    } else if (!(objOverlayContentPathBindings2 instanceof List)) {
                        if (objOverlayContentPathBindings2 instanceof Number) {
                            c22673i3 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass4 = c22673i3.getOrCreateKotlinClass(List.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls8))) {
                                objOverlayContentPathBindings2 = (List) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls7))) {
                                objOverlayContentPathBindings2 = (List) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings2 = (List) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings2 = (List) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings2 = (List) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings2 = (List) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                            } else {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else if (objOverlayContentPathBindings2 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c6 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings2);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(StringSerializer.INSTANCE), jsonPrimitiveM1841c6);
                            if (objOverlayContentPathBindings2 == null) {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else {
                            objOverlayContentPathBindings2 = null;
                        }
                    }
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = currentStepList;
                    }
                } else {
                    objOverlayContentPathBindings2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = null;
                    } else if (objOverlayContentPathBindings2 instanceof JsonElement) {
                        JsonElement jsonElement7 = (JsonElement) objOverlayContentPathBindings2;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(StringSerializer.INSTANCE), jsonElement7);
                    } else if (!(objOverlayContentPathBindings2 instanceof List)) {
                        if (objOverlayContentPathBindings2 instanceof Number) {
                            c22673i3 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass4 = c22673i3.getOrCreateKotlinClass(List.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls8))) {
                                objOverlayContentPathBindings2 = (List) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls7))) {
                                objOverlayContentPathBindings2 = (List) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings2 = (List) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings2 = (List) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings2 = (List) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings2 = (List) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                            } else {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else if (objOverlayContentPathBindings2 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c7 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings2);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(StringSerializer.INSTANCE), jsonPrimitiveM1841c7);
                            if (objOverlayContentPathBindings2 == null) {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else {
                            objOverlayContentPathBindings2 = null;
                        }
                    }
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = currentStepList;
                    }
                }
            }
        } else if (objOverlayContentPathBindings2 != null) {
            objOverlayContentPathBindings2 = ContentPathBindingsKt.overlayContentPathBindings(r1, "current_step_list", accumulatedState, objOverlayContentPathBindings2, v.f19444w, w.f19445w);
        }
        currentStepList2 = (List) DotPathBindingsKt.overlayAggregateBinding(map2, "current_step_list", accumulatedState, objOverlayContentPathBindings2, "current_step_list", x.f19446w, y.f19447w, a.f19423w);
        if (currentStepList2 == null) {
            currentStepList2 = flowTemplate.getCurrentStepList();
        }
        List<String> list5 = currentStepList2;
        steps = flowTemplate.getSteps();
        if (steps == null) {
            objOverlayContentPathBindings3 = null;
        } else {
            if (steps instanceof WithGeneratedBindings) {
                withGeneratedBindingsBind5 = ((WithGeneratedBindings) steps).bind(accumulatedState);
                if (!(withGeneratedBindingsBind5 instanceof Map)) {
                    withGeneratedBindingsBind5 = null;
                }
                map3 = (Map) withGeneratedBindingsBind5;
                if (map3 == null) {
                    map3 = steps;
                }
            } else if (steps instanceof List) {
                Iterable iterable5 = (Iterable) steps;
                arrayList2 = new ArrayList(AbstractC25267u.m74163i0(iterable5, 10));
                while (r2.hasNext()) {
                    if (obj4 instanceof WithGeneratedBindings) {
                        withGeneratedBindings2 = (WithGeneratedBindings) obj4;
                    } else {
                        withGeneratedBindings2 = null;
                    }
                    if (withGeneratedBindings2 == null) {
                    }
                    arrayList2.add(obj4);
                }
                map3 = (Map) arrayList2;
            } else {
                map3 = steps;
            }
            objOverlayContentPathBindings3 = map3;
        }
        if (r1 != 0) {
            strResolveContentBindingKey2 = BindingLoggerKt.resolveContentBindingKey(r1, "steps");
        } else {
            strResolveContentBindingKey2 = null;
        }
        if (strResolveContentBindingKey2 != null) {
            objResolveStateRef3 = StateLookupKt.resolveStateRef(strResolveContentBindingKey2, accumulatedState);
            if (objResolveStateRef3 != null) {
                BindingLoggerKt.logContentBinding("steps", strResolveContentBindingKey2, objResolveStateRef3);
                objUnwrapForCoercion4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                if (!(objUnwrapForCoercion4 instanceof String)) {
                    objOverlayContentPathBindings3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                    if (objOverlayContentPathBindings3 == null) {
                        objOverlayContentPathBindings3 = null;
                    } else if (objOverlayContentPathBindings3 instanceof JsonElement) {
                        JsonElement jsonElement8 = (JsonElement) objOverlayContentPathBindings3;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, FlowStep.INSTANCE.serializer()), jsonElement8);
                    } else if (!(objOverlayContentPathBindings3 instanceof Map)) {
                        if (objOverlayContentPathBindings3 instanceof Number) {
                            c22673i2 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass3 = c22673i2.getOrCreateKotlinClass(Map.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls8))) {
                                objOverlayContentPathBindings3 = (Map) Integer.valueOf(((Number) objOverlayContentPathBindings3).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls7))) {
                                objOverlayContentPathBindings3 = (Map) Long.valueOf(((Number) objOverlayContentPathBindings3).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings3 = (Map) Double.valueOf(((Number) objOverlayContentPathBindings3).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings3 = (Map) Float.valueOf(((Number) objOverlayContentPathBindings3).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings3 = (Map) Short.valueOf(((Number) objOverlayContentPathBindings3).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings3 = (Map) Byte.valueOf(((Number) objOverlayContentPathBindings3).byteValue());
                            } else {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else if (objOverlayContentPathBindings3 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c8 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings3);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, FlowStep.INSTANCE.serializer()), jsonPrimitiveM1841c8);
                            if (objOverlayContentPathBindings3 == null) {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else {
                            objOverlayContentPathBindings3 = null;
                        }
                    }
                    if (objOverlayContentPathBindings3 == null) {
                        objOverlayContentPathBindings3 = steps;
                    }
                } else {
                    objOverlayContentPathBindings3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                    if (objOverlayContentPathBindings3 == null) {
                        objOverlayContentPathBindings3 = null;
                    } else if (objOverlayContentPathBindings3 instanceof JsonElement) {
                        JsonElement jsonElement9 = (JsonElement) objOverlayContentPathBindings3;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, FlowStep.INSTANCE.serializer()), jsonElement9);
                    } else if (!(objOverlayContentPathBindings3 instanceof Map)) {
                        if (objOverlayContentPathBindings3 instanceof Number) {
                            c22673i2 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass3 = c22673i2.getOrCreateKotlinClass(Map.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls8))) {
                                objOverlayContentPathBindings3 = (Map) Integer.valueOf(((Number) objOverlayContentPathBindings3).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls7))) {
                                objOverlayContentPathBindings3 = (Map) Long.valueOf(((Number) objOverlayContentPathBindings3).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings3 = (Map) Double.valueOf(((Number) objOverlayContentPathBindings3).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings3 = (Map) Float.valueOf(((Number) objOverlayContentPathBindings3).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings3 = (Map) Short.valueOf(((Number) objOverlayContentPathBindings3).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings3 = (Map) Byte.valueOf(((Number) objOverlayContentPathBindings3).byteValue());
                            } else {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else if (objOverlayContentPathBindings3 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c9 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings3);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, FlowStep.INSTANCE.serializer()), jsonPrimitiveM1841c9);
                            if (objOverlayContentPathBindings3 == null) {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else {
                            objOverlayContentPathBindings3 = null;
                        }
                    }
                    if (objOverlayContentPathBindings3 == null) {
                        objOverlayContentPathBindings3 = steps;
                    }
                }
            }
        } else if (objOverlayContentPathBindings3 != null) {
            objOverlayContentPathBindings3 = ContentPathBindingsKt.overlayContentPathBindings(r1, "steps", accumulatedState, objOverlayContentPathBindings3, b.f19424w, c.f19425w);
        }
        steps2 = (Map) DotPathBindingsKt.overlayAggregateBinding(map2, "steps", accumulatedState, objOverlayContentPathBindings3, "steps", d.f19426w, e.f19427w, f.f19428w);
        if (steps2 == null) {
            steps2 = flowTemplate.getSteps();
        }
        Map<String, FlowStep> map8 = steps2;
        bindings = flowTemplate.getBindings();
        if (bindings == null) {
            objOverlayContentPathBindings4 = null;
        } else {
            if (bindings instanceof WithGeneratedBindings) {
                withGeneratedBindingsBind7 = ((WithGeneratedBindings) bindings).bind(accumulatedState);
                if (!(withGeneratedBindingsBind7 instanceof Map)) {
                    withGeneratedBindingsBind7 = null;
                }
                map4 = (Map) withGeneratedBindingsBind7;
                if (map4 == null) {
                    map4 = bindings;
                }
            } else if (bindings instanceof List) {
                Iterable iterable6 = (Iterable) bindings;
                arrayList3 = new ArrayList(AbstractC25267u.m74163i0(iterable6, 10));
                while (r2.hasNext()) {
                    if (obj5 instanceof WithGeneratedBindings) {
                        withGeneratedBindings3 = (WithGeneratedBindings) obj5;
                    } else {
                        withGeneratedBindings3 = null;
                    }
                    if (withGeneratedBindings3 == null) {
                    }
                    arrayList3.add(obj5);
                }
                map4 = (Map) arrayList3;
            } else {
                map4 = bindings;
            }
            objOverlayContentPathBindings4 = map4;
        }
        if (r1 != 0) {
            strResolveContentBindingKey3 = BindingLoggerKt.resolveContentBindingKey(r1, "bindings");
        } else {
            strResolveContentBindingKey3 = null;
        }
        if (strResolveContentBindingKey3 != null) {
            objResolveStateRef2 = StateLookupKt.resolveStateRef(strResolveContentBindingKey3, accumulatedState);
            if (objResolveStateRef2 != null) {
                BindingLoggerKt.logContentBinding("bindings", strResolveContentBindingKey3, objResolveStateRef2);
                objUnwrapForCoercion3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                if (!(objUnwrapForCoercion3 instanceof String)) {
                    objOverlayContentPathBindings4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                    if (objOverlayContentPathBindings4 == null) {
                        cls = cls3;
                    } else {
                        if (objOverlayContentPathBindings4 instanceof JsonElement) {
                            JsonElement jsonElement10 = (JsonElement) objOverlayContentPathBindings4;
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
                            objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer3, stringSerializer3), jsonElement10);
                        } else {
                            if (!(objOverlayContentPathBindings4 instanceof Map)) {
                                if (objOverlayContentPathBindings4 instanceof Number) {
                                    c22673i1 = AbstractC22671h0.f89337a;
                                    orCreateKotlinClass2 = c22673i1.getOrCreateKotlinClass(Map.class);
                                    if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls8))) {
                                        objOverlayContentPathBindings4 = (Map) Integer.valueOf(((Number) objOverlayContentPathBindings4).intValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls7))) {
                                        objOverlayContentPathBindings4 = (Map) Long.valueOf(((Number) objOverlayContentPathBindings4).longValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls6))) {
                                        objOverlayContentPathBindings4 = (Map) Double.valueOf(((Number) objOverlayContentPathBindings4).doubleValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls5))) {
                                        objOverlayContentPathBindings4 = (Map) Float.valueOf(((Number) objOverlayContentPathBindings4).floatValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls4))) {
                                        objOverlayContentPathBindings4 = (Map) Short.valueOf(((Number) objOverlayContentPathBindings4).shortValue());
                                    } else {
                                        cls = cls3;
                                        if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls))) {
                                            objOverlayContentPathBindings4 = (Map) Byte.valueOf(((Number) objOverlayContentPathBindings4).byteValue());
                                        }
                                    }
                                } else {
                                    cls = cls3;
                                    if (objOverlayContentPathBindings4 instanceof String) {
                                        JsonPrimitive jsonPrimitiveM1841c10 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings4);
                                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                                        StringSerializer stringSerializer4 = StringSerializer.INSTANCE;
                                        objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer4, stringSerializer4), jsonPrimitiveM1841c10);
                                        if (objOverlayContentPathBindings4 == null) {
                                        }
                                    }
                                }
                            }
                            if (objOverlayContentPathBindings4 == null) {
                                objOverlayContentPathBindings4 = bindings;
                            }
                        }
                        cls = cls3;
                        if (objOverlayContentPathBindings4 == null) {
                            objOverlayContentPathBindings4 = bindings;
                        }
                    }
                    objOverlayContentPathBindings4 = null;
                    if (objOverlayContentPathBindings4 == null) {
                        objOverlayContentPathBindings4 = bindings;
                    }
                } else {
                    objOverlayContentPathBindings4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                    if (objOverlayContentPathBindings4 == null) {
                        cls = cls3;
                    } else {
                        if (objOverlayContentPathBindings4 instanceof JsonElement) {
                            JsonElement jsonElement11 = (JsonElement) objOverlayContentPathBindings4;
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            StringSerializer stringSerializer5 = StringSerializer.INSTANCE;
                            objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer5, stringSerializer5), jsonElement11);
                        } else {
                            if (!(objOverlayContentPathBindings4 instanceof Map)) {
                                if (objOverlayContentPathBindings4 instanceof Number) {
                                    c22673i1 = AbstractC22671h0.f89337a;
                                    orCreateKotlinClass2 = c22673i1.getOrCreateKotlinClass(Map.class);
                                    if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls8))) {
                                        objOverlayContentPathBindings4 = (Map) Integer.valueOf(((Number) objOverlayContentPathBindings4).intValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls7))) {
                                        objOverlayContentPathBindings4 = (Map) Long.valueOf(((Number) objOverlayContentPathBindings4).longValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls6))) {
                                        objOverlayContentPathBindings4 = (Map) Double.valueOf(((Number) objOverlayContentPathBindings4).doubleValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls5))) {
                                        objOverlayContentPathBindings4 = (Map) Float.valueOf(((Number) objOverlayContentPathBindings4).floatValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls4))) {
                                        objOverlayContentPathBindings4 = (Map) Short.valueOf(((Number) objOverlayContentPathBindings4).shortValue());
                                    } else {
                                        cls = cls3;
                                        if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls))) {
                                            objOverlayContentPathBindings4 = (Map) Byte.valueOf(((Number) objOverlayContentPathBindings4).byteValue());
                                        }
                                    }
                                } else {
                                    cls = cls3;
                                    if (objOverlayContentPathBindings4 instanceof String) {
                                        JsonPrimitive jsonPrimitiveM1841c11 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings4);
                                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                                        StringSerializer stringSerializer6 = StringSerializer.INSTANCE;
                                        objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer6, stringSerializer6), jsonPrimitiveM1841c11);
                                        if (objOverlayContentPathBindings4 == null) {
                                        }
                                    }
                                }
                            }
                            if (objOverlayContentPathBindings4 == null) {
                                objOverlayContentPathBindings4 = bindings;
                            }
                        }
                        cls = cls3;
                        if (objOverlayContentPathBindings4 == null) {
                            objOverlayContentPathBindings4 = bindings;
                        }
                    }
                    objOverlayContentPathBindings4 = null;
                    if (objOverlayContentPathBindings4 == null) {
                        objOverlayContentPathBindings4 = bindings;
                    }
                }
            } else {
                cls = cls3;
            }
        } else {
            cls = cls3;
            if (objOverlayContentPathBindings4 != null) {
                objOverlayContentPathBindings4 = ContentPathBindingsKt.overlayContentPathBindings(r1, "bindings", accumulatedState, objOverlayContentPathBindings4, g.f19429w, h.f19430w);
            }
        }
        cls2 = cls;
        Map map9 = (Map) DotPathBindingsKt.overlayAggregateBinding(map2, "bindings", accumulatedState, objOverlayContentPathBindings4, "bindings", i.f19431w, j.f19432w, l.f19434w);
        aggregateBindings = flowTemplate.getAggregateBindings();
        if (aggregateBindings == null) {
            obj = null;
        } else {
            if (aggregateBindings instanceof WithGeneratedBindings) {
                withGeneratedBindingsBind9 = ((WithGeneratedBindings) aggregateBindings).bind(accumulatedState);
                if (!(withGeneratedBindingsBind9 instanceof Map)) {
                    withGeneratedBindingsBind9 = null;
                }
                map5 = (Map) withGeneratedBindingsBind9;
                if (map5 == null) {
                    map5 = aggregateBindings;
                }
            } else if (aggregateBindings instanceof List) {
                Iterable iterable7 = (Iterable) aggregateBindings;
                arrayList4 = new ArrayList(AbstractC25267u.m74163i0(iterable7, 10));
                while (r2.hasNext()) {
                    if (obj6 instanceof WithGeneratedBindings) {
                        withGeneratedBindings4 = (WithGeneratedBindings) obj6;
                    } else {
                        withGeneratedBindings4 = null;
                    }
                    if (withGeneratedBindings4 == null) {
                    }
                    arrayList4.add(obj6);
                }
                map5 = (Map) arrayList4;
            } else {
                map5 = aggregateBindings;
            }
            obj = map5;
        }
        if (r1 != 0) {
            strResolveContentBindingKey4 = BindingLoggerKt.resolveContentBindingKey(r1, "aggregateBindings");
        } else {
            strResolveContentBindingKey4 = null;
        }
        if (strResolveContentBindingKey4 != null) {
            objResolveStateRef = StateLookupKt.resolveStateRef(strResolveContentBindingKey4, accumulatedState);
            if (objResolveStateRef != null) {
                BindingLoggerKt.logContentBinding("aggregateBindings", strResolveContentBindingKey4, objResolveStateRef);
                objUnwrapForCoercion = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                if (!(objUnwrapForCoercion instanceof String)) {
                    objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                    if (objUnwrapForCoercion2 == null) {
                        objOverlayContentPathBindings5 = null;
                    } else if (objUnwrapForCoercion2 instanceof JsonElement) {
                        JsonElement jsonElement12 = (JsonElement) objUnwrapForCoercion2;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonElement12);
                    } else if (objUnwrapForCoercion2 instanceof Map) {
                        if (objUnwrapForCoercion2 instanceof Number) {
                            c22673i0 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Map.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls8))) {
                                objOverlayContentPathBindings5 = (Map) Integer.valueOf(((Number) objUnwrapForCoercion2).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls7))) {
                                objOverlayContentPathBindings5 = (Map) Long.valueOf(((Number) objUnwrapForCoercion2).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings5 = (Map) Double.valueOf(((Number) objUnwrapForCoercion2).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings5 = (Map) Float.valueOf(((Number) objUnwrapForCoercion2).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings5 = (Map) Short.valueOf(((Number) objUnwrapForCoercion2).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings5 = (Map) Byte.valueOf(((Number) objUnwrapForCoercion2).byteValue());
                            }
                        } else if (objUnwrapForCoercion2 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c12 = AbstractC0770m.m1841c((String) objUnwrapForCoercion2);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objUnwrapForCoercion2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonPrimitiveM1841c12);
                            if (objUnwrapForCoercion2 != null) {
                                objOverlayContentPathBindings5 = objUnwrapForCoercion2;
                            }
                        }
                        objOverlayContentPathBindings5 = null;
                    } else {
                        objOverlayContentPathBindings5 = objUnwrapForCoercion2;
                    }
                    if (objOverlayContentPathBindings5 == null) {
                        obj = aggregateBindings;
                    } else {
                        obj = objOverlayContentPathBindings5;
                    }
                } else {
                    objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                    if (objUnwrapForCoercion2 == null) {
                        objOverlayContentPathBindings5 = null;
                    } else if (objUnwrapForCoercion2 instanceof JsonElement) {
                        JsonElement jsonElement13 = (JsonElement) objUnwrapForCoercion2;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonElement13);
                    } else if (objUnwrapForCoercion2 instanceof Map) {
                        if (objUnwrapForCoercion2 instanceof Number) {
                            c22673i0 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Map.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls8))) {
                                objOverlayContentPathBindings5 = (Map) Integer.valueOf(((Number) objUnwrapForCoercion2).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls7))) {
                                objOverlayContentPathBindings5 = (Map) Long.valueOf(((Number) objUnwrapForCoercion2).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings5 = (Map) Double.valueOf(((Number) objUnwrapForCoercion2).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings5 = (Map) Float.valueOf(((Number) objUnwrapForCoercion2).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings5 = (Map) Short.valueOf(((Number) objUnwrapForCoercion2).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings5 = (Map) Byte.valueOf(((Number) objUnwrapForCoercion2).byteValue());
                            }
                        } else if (objUnwrapForCoercion2 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c13 = AbstractC0770m.m1841c((String) objUnwrapForCoercion2);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objUnwrapForCoercion2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonPrimitiveM1841c13);
                            if (objUnwrapForCoercion2 != null) {
                                objOverlayContentPathBindings5 = objUnwrapForCoercion2;
                            }
                        }
                        objOverlayContentPathBindings5 = null;
                    } else {
                        objOverlayContentPathBindings5 = objUnwrapForCoercion2;
                    }
                    if (objOverlayContentPathBindings5 == null) {
                        obj = aggregateBindings;
                    } else {
                        obj = objOverlayContentPathBindings5;
                    }
                }
            }
        } else if (obj != null) {
            objOverlayContentPathBindings5 = ContentPathBindingsKt.overlayContentPathBindings(r1, "aggregateBindings", accumulatedState, obj, m.f19435w, n.f19436w);
            obj = objOverlayContentPathBindings5;
        }
        return (FlowTemplate) ContentBindingResolverKt.copyBindingsFrom(new FlowTemplate(str2, list5, map8, map9, (Map) DotPathBindingsKt.overlayAggregateBinding(map2, "aggregateBindings", accumulatedState, obj, "aggregateBindings", o.f19437w, p.f19438w, q.f19439w)), flowTemplate);
    }
}
