package es0;

import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import com.whoop.communityreactions.domain.model.ReactionsInputModel;
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
import com.whoop.navigation.models.GenericInteraction;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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

/* JADX INFO: renamed from: es0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aS\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;", "", "", "contentBinding", "Lcom/whoop/design/models/binding/AggregateBinding;", "aggregateBindings", "", "accumulatedState", "a", "(Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;", "community-reactions-arch-mini_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13589b {

    /* JADX INFO: renamed from: es0.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f47953w = new a();

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

    /* JADX INFO: renamed from: es0.b$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f47954w = new b();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JsonElement invoke(GenericInteraction v13) {
            AbstractC22676k.m65750j(v13, "v");
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                return StateBindingDeserializerKt.getStateBindingJson().m1832c(GenericInteraction.INSTANCE.serializer(), v13);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: es0.b$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f47955w = new c();

        /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.navigation.models.GenericInteraction, java.lang.Object] */
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GenericInteraction invoke(JsonElement json) {
            AbstractC22676k.m65750j(json, "json");
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                return StateBindingDeserializerKt.getStateBindingJson().m1830a(GenericInteraction.INSTANCE.serializer(), json);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: es0.b$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f47956w = new d();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JsonElement invoke(GenericInteraction genericInteraction) {
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(GenericInteraction.INSTANCE.serializer());
                AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                stateBindingJson.getClass();
                return AbstractC12313p.m34290h0(stateBindingJson, genericInteraction, interfaceC37138cM122336d);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: es0.b$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f47957w = new e();

        /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.navigation.models.GenericInteraction, java.lang.Object] */
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GenericInteraction invoke(JsonElement json) {
            AbstractC22676k.m65750j(json, "json");
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                return StateBindingDeserializerKt.getStateBindingJson().m1830a(GenericInteraction.INSTANCE.serializer(), json);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: es0.b$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f47958w = new f();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.navigation.models.GenericInteraction, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.navigation.models.GenericInteraction, java.lang.Object] */
        @Override // p715kotlin.jvm.functions.Function1
        public final GenericInteraction invoke(Object obj) {
            Object objM1830a;
            ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj);
            if (UnwrapForCoercion == 0) {
                return null;
            }
            if (UnwrapForCoercion instanceof JsonElement) {
                JsonElement jsonElement = (JsonElement) UnwrapForCoercion;
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(GenericInteraction.INSTANCE.serializer(), jsonElement);
                } catch (Exception unused) {
                    return null;
                }
            }
            if (UnwrapForCoercion instanceof GenericInteraction) {
                return UnwrapForCoercion;
            }
            if (!(UnwrapForCoercion instanceof Number)) {
                if (!(UnwrapForCoercion instanceof String)) {
                    return null;
                }
                JsonPrimitive jsonPrimitiveM1841c = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(GenericInteraction.INSTANCE.serializer(), jsonPrimitiveM1841c);
                } catch (Exception unused2) {
                    objM1830a = null;
                }
                if (objM1830a != null) {
                    return objM1830a;
                }
                return null;
            }
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(GenericInteraction.class);
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                return (GenericInteraction) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                return (GenericInteraction) Long.valueOf(((Number) UnwrapForCoercion).longValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                return (GenericInteraction) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                return (GenericInteraction) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                return (GenericInteraction) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                return (GenericInteraction) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: es0.b$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f47959w = new g();

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

    /* JADX INFO: renamed from: es0.b$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f47960w = new h();

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

    /* JADX INFO: renamed from: es0.b$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i f47961w = new i();

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

    /* JADX INFO: renamed from: es0.b$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final j f47962w = new j();

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

    /* JADX INFO: renamed from: es0.b$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final k f47963w = new k();

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

    /* JADX INFO: renamed from: es0.b$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final l f47964w = new l();

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

    /* JADX INFO: renamed from: es0.b$m */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final m f47965w = new m();

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

    /* JADX INFO: renamed from: es0.b$n */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final n f47966w = new n();

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

    /* JADX INFO: renamed from: es0.b$o */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final o f47967w = new o();

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

    /* JADX INFO: renamed from: es0.b$p */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final p f47968w = new p();

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

    /* JADX INFO: renamed from: es0.b$q */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final q f47969w = new q();

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

    /* JADX INFO: renamed from: es0.b$r */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final r f47970w = new r();

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

    /* JADX INFO: renamed from: es0.b$s */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final s f47971w = new s();

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

    /* JADX INFO: renamed from: es0.b$t */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final t f47972w = new t();

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

    /* JADX INFO: renamed from: es0.b$u */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final u f47973w = new u();

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

    /* JADX INFO: renamed from: es0.b$v */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final v f47974w = new v();

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

    /* JADX INFO: renamed from: es0.b$w */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class w implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final w f47975w = new w();

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

    /* JADX INFO: renamed from: es0.b$x */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class x implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final x f47976w = new x();

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

    /* JADX INFO: renamed from: es0.b$y */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class y implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final y f47977w = new y();

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

    /* JADX WARN: Code duplicated, block: B:130:0x0231  */
    /* JADX WARN: Code duplicated, block: B:188:0x034e  */
    /* JADX WARN: Code duplicated, block: B:224:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:242:0x040e  */
    /* JADX WARN: Code duplicated, block: B:313:0x0574  */
    /* JADX WARN: Code duplicated, block: B:332:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:400:0x0712  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:418:0x074e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a9 A[PHI: r4
      0x01a9: PHI (r4v16 java.lang.Object) = (r4v14 java.lang.Object), (r4v14 java.lang.Object), (r4v209 java.lang.Object) binds: [B:97:0x01ac, B:48:0x00a2, B:94:0x01a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final ReactionsInputModel m38350a(ReactionsInputModel reactionsInputModel, Map<String, String> map, Map<String, AggregateBinding> map2, Map<String, ? extends Object> accumulatedState) {
        Object objOverlayContentPathBindings;
        WithGeneratedBindings withGeneratedBindingsBind;
        Map<String, String> map3;
        Object obj;
        WithGeneratedBindings withGeneratedBindingsBind2;
        Object objOverlayContentPathBindings2;
        Class cls;
        Object obj2;
        WithGeneratedBindings withGeneratedBindingsBind3;
        Object objOverlayContentPathBindings3;
        Map<String, String> map4;
        WithGeneratedBindings withGeneratedBindingsBind4;
        Object objOverlayContentPathBindings4;
        Map<String, AggregateBinding> map5;
        WithGeneratedBindings withGeneratedBindingsBind5;
        Object obj3;
        Object objOverlayContentPathBindings5;
        Object objM1830a;
        String str;
        AbstractC22676k.m65750j(reactionsInputModel, "<this>");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        if ((map == null || map.isEmpty()) && ((map2 == null || map2.isEmpty()) && accumulatedState.isEmpty())) {
            return reactionsInputModel;
        }
        Object placeholder = reactionsInputModel.getPlaceholder();
        if (placeholder == null) {
            objOverlayContentPathBindings = null;
        } else if (placeholder instanceof WithGeneratedBindings) {
            Object objBind = ((WithGeneratedBindings) placeholder).bind(accumulatedState);
            if (!(objBind instanceof String)) {
                objBind = null;
            }
            objOverlayContentPathBindings = (String) objBind;
            if (objOverlayContentPathBindings == null) {
                objOverlayContentPathBindings = placeholder;
            }
        } else if (placeholder instanceof List) {
            Iterable iterable = (Iterable) placeholder;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
            for (Object obj4 : iterable) {
                WithGeneratedBindings withGeneratedBindings = obj4 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj4 : null;
                if (withGeneratedBindings != null && (withGeneratedBindingsBind = withGeneratedBindings.bind(accumulatedState)) != null) {
                    obj4 = withGeneratedBindingsBind;
                }
                arrayList.add(obj4);
            }
            objOverlayContentPathBindings = (String) arrayList;
        } else {
            objOverlayContentPathBindings = placeholder;
        }
        String strResolveContentBindingKey = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "placeholder") : null;
        Class cls2 = Byte.TYPE;
        Class cls3 = Short.TYPE;
        Class cls4 = Float.TYPE;
        Class cls5 = Double.TYPE;
        Class cls6 = Long.TYPE;
        Class cls7 = Integer.TYPE;
        if (strResolveContentBindingKey != null) {
            Object objResolveStateRef = StateLookupKt.resolveStateRef(strResolveContentBindingKey, accumulatedState);
            if (objResolveStateRef != null) {
                BindingLoggerKt.logContentBinding("placeholder", strResolveContentBindingKey, objResolveStateRef);
                Object objUnwrapForCoercion = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                if ((objUnwrapForCoercion instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                    map3 = map;
                    objOverlayContentPathBindings = null;
                } else {
                    objOverlayContentPathBindings = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
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
                                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(String.class);
                                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls7))) {
                                    str = (String) Integer.valueOf(((Number) objOverlayContentPathBindings).intValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls6))) {
                                    str = (String) Long.valueOf(((Number) objOverlayContentPathBindings).longValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
                                    str = (String) Double.valueOf(((Number) objOverlayContentPathBindings).doubleValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
                                    str = (String) Float.valueOf(((Number) objOverlayContentPathBindings).floatValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls3))) {
                                    str = (String) Short.valueOf(((Number) objOverlayContentPathBindings).shortValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
                                    str = (String) Byte.valueOf(((Number) objOverlayContentPathBindings).byteValue());
                                } else {
                                    objOverlayContentPathBindings = null;
                                }
                                objOverlayContentPathBindings = str;
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
                        map3 = map;
                        objOverlayContentPathBindings = placeholder;
                    } else {
                        map3 = map;
                    }
                }
            } else {
                map3 = map;
            }
        } else if (objOverlayContentPathBindings == null) {
            map3 = map;
        } else {
            objOverlayContentPathBindings = ContentPathBindingsKt.overlayContentPathBindings(map, "placeholder", accumulatedState, objOverlayContentPathBindings, k.f47963w, r.f47970w);
            map3 = map;
        }
        String placeholder2 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "placeholder", accumulatedState, objOverlayContentPathBindings, "placeholder", s.f47971w, t.f47972w, u.f47973w);
        if (placeholder2 == null) {
            placeholder2 = reactionsInputModel.getPlaceholder();
        }
        String str2 = placeholder2;
        Object stateUpdateValueKey = reactionsInputModel.getStateUpdateValueKey();
        if (stateUpdateValueKey == null) {
            objOverlayContentPathBindings2 = null;
        } else {
            if (stateUpdateValueKey instanceof WithGeneratedBindings) {
                Object objBind2 = ((WithGeneratedBindings) stateUpdateValueKey).bind(accumulatedState);
                if (!(objBind2 instanceof String)) {
                    objBind2 = null;
                }
                obj = (String) objBind2;
                if (obj == null) {
                    obj = stateUpdateValueKey;
                }
            } else if (stateUpdateValueKey instanceof List) {
                Iterable iterable2 = (Iterable) stateUpdateValueKey;
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(iterable2, 10));
                for (Object obj5 : iterable2) {
                    WithGeneratedBindings withGeneratedBindings2 = obj5 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj5 : null;
                    if (withGeneratedBindings2 != null && (withGeneratedBindingsBind2 = withGeneratedBindings2.bind(accumulatedState)) != null) {
                        obj5 = withGeneratedBindingsBind2;
                    }
                    arrayList2.add(obj5);
                }
                obj = (String) arrayList2;
            } else {
                obj = stateUpdateValueKey;
            }
            objOverlayContentPathBindings2 = obj;
        }
        String strResolveContentBindingKey2 = map3 != null ? BindingLoggerKt.resolveContentBindingKey(map3, "stateUpdateValueKey") : null;
        if (strResolveContentBindingKey2 != null) {
            Object objResolveStateRef2 = StateLookupKt.resolveStateRef(strResolveContentBindingKey2, accumulatedState);
            if (objResolveStateRef2 != null) {
                BindingLoggerKt.logContentBinding("stateUpdateValueKey", strResolveContentBindingKey2, objResolveStateRef2);
                Object objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                if ((objUnwrapForCoercion2 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion2) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                    cls = cls2;
                    objOverlayContentPathBindings2 = null;
                } else {
                    objOverlayContentPathBindings2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                    if (objOverlayContentPathBindings2 == null) {
                        cls = cls2;
                    } else {
                        if (objOverlayContentPathBindings2 instanceof JsonElement) {
                            JsonElement jsonElement2 = (JsonElement) objOverlayContentPathBindings2;
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement2);
                            } catch (Exception unused3) {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else {
                            boolean z13 = objOverlayContentPathBindings2 instanceof String;
                            if (!z13) {
                                if (objOverlayContentPathBindings2 instanceof Number) {
                                    C22673i0 c22673i1 = AbstractC22671h0.f89337a;
                                    InterfaceC21461d orCreateKotlinClass2 = c22673i1.getOrCreateKotlinClass(String.class);
                                    if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls7))) {
                                        objOverlayContentPathBindings2 = (String) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls6))) {
                                        objOverlayContentPathBindings2 = (String) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls5))) {
                                        objOverlayContentPathBindings2 = (String) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls4))) {
                                        objOverlayContentPathBindings2 = (String) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls3))) {
                                        objOverlayContentPathBindings2 = (String) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                                    } else {
                                        cls = cls2;
                                        if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls))) {
                                            objOverlayContentPathBindings2 = (String) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                                        }
                                    }
                                } else {
                                    cls = cls2;
                                    if (z13) {
                                        JsonPrimitive jsonPrimitiveM1841c2 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings2);
                                        try {
                                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                                            objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c2);
                                        } catch (Exception unused4) {
                                            objOverlayContentPathBindings2 = null;
                                        }
                                        if (objOverlayContentPathBindings2 == null) {
                                        }
                                    }
                                }
                            }
                            if (objOverlayContentPathBindings2 == null) {
                                objOverlayContentPathBindings2 = stateUpdateValueKey;
                            }
                        }
                        cls = cls2;
                        if (objOverlayContentPathBindings2 == null) {
                            objOverlayContentPathBindings2 = stateUpdateValueKey;
                        }
                    }
                    objOverlayContentPathBindings2 = null;
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = stateUpdateValueKey;
                    }
                }
            } else {
                cls = cls2;
            }
        } else {
            cls = cls2;
            if (objOverlayContentPathBindings2 != null) {
                objOverlayContentPathBindings2 = ContentPathBindingsKt.overlayContentPathBindings(map3, "stateUpdateValueKey", accumulatedState, objOverlayContentPathBindings2, v.f47974w, w.f47975w);
            }
        }
        String stateUpdateValueKey2 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "stateUpdateValueKey", accumulatedState, objOverlayContentPathBindings2, "stateUpdateValueKey", x.f47976w, y.f47977w, a.f47953w);
        if (stateUpdateValueKey2 == null) {
            stateUpdateValueKey2 = reactionsInputModel.getStateUpdateValueKey();
        }
        String str3 = stateUpdateValueKey2;
        Object submitAction = reactionsInputModel.getSubmitAction();
        if (submitAction == null) {
            objOverlayContentPathBindings3 = null;
        } else {
            if (submitAction instanceof WithGeneratedBindings) {
                Object objBind3 = ((WithGeneratedBindings) submitAction).bind(accumulatedState);
                if (!(objBind3 instanceof GenericInteraction)) {
                    objBind3 = null;
                }
                obj2 = (GenericInteraction) objBind3;
                if (obj2 == null) {
                    obj2 = submitAction;
                }
            } else if (submitAction instanceof List) {
                Iterable iterable3 = (Iterable) submitAction;
                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(iterable3, 10));
                for (Object obj6 : iterable3) {
                    WithGeneratedBindings withGeneratedBindings3 = obj6 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj6 : null;
                    if (withGeneratedBindings3 != null && (withGeneratedBindingsBind3 = withGeneratedBindings3.bind(accumulatedState)) != null) {
                        obj6 = withGeneratedBindingsBind3;
                    }
                    arrayList3.add(obj6);
                }
                obj2 = (GenericInteraction) arrayList3;
            } else {
                obj2 = submitAction;
            }
            objOverlayContentPathBindings3 = obj2;
        }
        String strResolveContentBindingKey3 = map3 != null ? BindingLoggerKt.resolveContentBindingKey(map3, "submitAction") : null;
        if (strResolveContentBindingKey3 != null) {
            Object objResolveStateRef3 = StateLookupKt.resolveStateRef(strResolveContentBindingKey3, accumulatedState);
            if (objResolveStateRef3 != null) {
                BindingLoggerKt.logContentBinding("submitAction", strResolveContentBindingKey3, objResolveStateRef3);
                Object objUnwrapForCoercion3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                if ((objUnwrapForCoercion3 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion3) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                    objOverlayContentPathBindings3 = null;
                } else {
                    objOverlayContentPathBindings3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                    if (objOverlayContentPathBindings3 == null) {
                        objOverlayContentPathBindings3 = null;
                    } else if (objOverlayContentPathBindings3 instanceof JsonElement) {
                        JsonElement jsonElement3 = (JsonElement) objOverlayContentPathBindings3;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(GenericInteraction.INSTANCE.serializer(), jsonElement3);
                        } catch (Exception unused5) {
                            objOverlayContentPathBindings3 = null;
                        }
                    } else if (!(objOverlayContentPathBindings3 instanceof GenericInteraction)) {
                        if (objOverlayContentPathBindings3 instanceof Number) {
                            C22673i0 c22673i2 = AbstractC22671h0.f89337a;
                            InterfaceC21461d orCreateKotlinClass3 = c22673i2.getOrCreateKotlinClass(GenericInteraction.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls7))) {
                                objOverlayContentPathBindings3 = (GenericInteraction) Integer.valueOf(((Number) objOverlayContentPathBindings3).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings3 = (GenericInteraction) Long.valueOf(((Number) objOverlayContentPathBindings3).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings3 = (GenericInteraction) Double.valueOf(((Number) objOverlayContentPathBindings3).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings3 = (GenericInteraction) Float.valueOf(((Number) objOverlayContentPathBindings3).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings3 = (GenericInteraction) Short.valueOf(((Number) objOverlayContentPathBindings3).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings3 = (GenericInteraction) Byte.valueOf(((Number) objOverlayContentPathBindings3).byteValue());
                            } else {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else if (objOverlayContentPathBindings3 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings3);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(GenericInteraction.INSTANCE.serializer(), jsonPrimitiveM1841c3);
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
                        objOverlayContentPathBindings3 = submitAction;
                    }
                }
            }
        } else if (objOverlayContentPathBindings3 != null) {
            objOverlayContentPathBindings3 = ContentPathBindingsKt.overlayContentPathBindings(map3, "submitAction", accumulatedState, objOverlayContentPathBindings3, b.f47954w, c.f47955w);
        }
        GenericInteraction submitAction2 = (GenericInteraction) DotPathBindingsKt.overlayAggregateBinding(map2, "submitAction", accumulatedState, objOverlayContentPathBindings3, "submitAction", d.f47956w, e.f47957w, f.f47958w);
        if (submitAction2 == null) {
            submitAction2 = reactionsInputModel.getSubmitAction();
        }
        GenericInteraction genericInteraction = submitAction2;
        Map<String, String> bindings = reactionsInputModel.getBindings();
        if (bindings == null) {
            objOverlayContentPathBindings4 = null;
        } else {
            if (bindings instanceof WithGeneratedBindings) {
                WithGeneratedBindings withGeneratedBindingsBind6 = ((WithGeneratedBindings) bindings).bind(accumulatedState);
                if (!(withGeneratedBindingsBind6 instanceof Map)) {
                    withGeneratedBindingsBind6 = null;
                }
                map4 = (Map) withGeneratedBindingsBind6;
                if (map4 == null) {
                    map4 = bindings;
                }
            } else if (bindings instanceof List) {
                Iterable iterable4 = (Iterable) bindings;
                List arrayList4 = new ArrayList(AbstractC25267u.m74163i0(iterable4, 10));
                for (Object obj7 : iterable4) {
                    WithGeneratedBindings withGeneratedBindings4 = obj7 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj7 : null;
                    if (withGeneratedBindings4 != null && (withGeneratedBindingsBind4 = withGeneratedBindings4.bind(accumulatedState)) != null) {
                        obj7 = withGeneratedBindingsBind4;
                    }
                    arrayList4.add(obj7);
                }
                map4 = (Map) arrayList4;
            } else {
                map4 = bindings;
            }
            objOverlayContentPathBindings4 = map4;
        }
        String strResolveContentBindingKey4 = map3 != null ? BindingLoggerKt.resolveContentBindingKey(map3, "bindings") : null;
        if (strResolveContentBindingKey4 != null) {
            Object objResolveStateRef4 = StateLookupKt.resolveStateRef(strResolveContentBindingKey4, accumulatedState);
            if (objResolveStateRef4 != null) {
                BindingLoggerKt.logContentBinding("bindings", strResolveContentBindingKey4, objResolveStateRef4);
                Object objUnwrapForCoercion4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                if ((objUnwrapForCoercion4 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion4) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                    objOverlayContentPathBindings4 = null;
                } else {
                    objOverlayContentPathBindings4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                    if (objOverlayContentPathBindings4 == null) {
                        objOverlayContentPathBindings4 = null;
                    } else if (objOverlayContentPathBindings4 instanceof JsonElement) {
                        JsonElement jsonElement4 = (JsonElement) objOverlayContentPathBindings4;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            StringSerializer stringSerializer = StringSerializer.INSTANCE;
                            objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer, stringSerializer), jsonElement4);
                        } catch (Exception unused7) {
                            objOverlayContentPathBindings4 = null;
                        }
                    } else if (!(objOverlayContentPathBindings4 instanceof Map)) {
                        if (objOverlayContentPathBindings4 instanceof Number) {
                            C22673i0 c22673i3 = AbstractC22671h0.f89337a;
                            InterfaceC21461d orCreateKotlinClass4 = c22673i3.getOrCreateKotlinClass(Map.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls7))) {
                                objOverlayContentPathBindings4 = (Map) Integer.valueOf(((Number) objOverlayContentPathBindings4).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings4 = (Map) Long.valueOf(((Number) objOverlayContentPathBindings4).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings4 = (Map) Double.valueOf(((Number) objOverlayContentPathBindings4).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings4 = (Map) Float.valueOf(((Number) objOverlayContentPathBindings4).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings4 = (Map) Short.valueOf(((Number) objOverlayContentPathBindings4).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings4 = (Map) Byte.valueOf(((Number) objOverlayContentPathBindings4).byteValue());
                            } else {
                                objOverlayContentPathBindings4 = null;
                            }
                        } else if (objOverlayContentPathBindings4 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c4 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings4);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                StringSerializer stringSerializer2 = StringSerializer.INSTANCE;
                                objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer2, stringSerializer2), jsonPrimitiveM1841c4);
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
                    if (objOverlayContentPathBindings4 == null) {
                        objOverlayContentPathBindings4 = bindings;
                    }
                }
            }
        } else if (objOverlayContentPathBindings4 != null) {
            objOverlayContentPathBindings4 = ContentPathBindingsKt.overlayContentPathBindings(map3, "bindings", accumulatedState, objOverlayContentPathBindings4, g.f47959w, h.f47960w);
        }
        Class cls8 = cls;
        Map map6 = (Map) DotPathBindingsKt.overlayAggregateBinding(map2, "bindings", accumulatedState, objOverlayContentPathBindings4, "bindings", i.f47961w, j.f47962w, l.f47964w);
        Map<String, AggregateBinding> aggregateBindings = reactionsInputModel.getAggregateBindings();
        if (aggregateBindings == null) {
            obj3 = null;
        } else {
            if (aggregateBindings instanceof WithGeneratedBindings) {
                WithGeneratedBindings withGeneratedBindingsBind7 = ((WithGeneratedBindings) aggregateBindings).bind(accumulatedState);
                if (!(withGeneratedBindingsBind7 instanceof Map)) {
                    withGeneratedBindingsBind7 = null;
                }
                map5 = (Map) withGeneratedBindingsBind7;
                if (map5 == null) {
                    map5 = aggregateBindings;
                }
            } else if (aggregateBindings instanceof List) {
                Iterable iterable5 = (Iterable) aggregateBindings;
                List arrayList5 = new ArrayList(AbstractC25267u.m74163i0(iterable5, 10));
                for (Object obj8 : iterable5) {
                    WithGeneratedBindings withGeneratedBindings5 = obj8 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj8 : null;
                    if (withGeneratedBindings5 != null && (withGeneratedBindingsBind5 = withGeneratedBindings5.bind(accumulatedState)) != null) {
                        obj8 = withGeneratedBindingsBind5;
                    }
                    arrayList5.add(obj8);
                }
                map5 = (Map) arrayList5;
            } else {
                map5 = aggregateBindings;
            }
            obj3 = map5;
        }
        String strResolveContentBindingKey5 = map3 != null ? BindingLoggerKt.resolveContentBindingKey(map3, "aggregateBindings") : null;
        if (strResolveContentBindingKey5 != null) {
            Object objResolveStateRef5 = StateLookupKt.resolveStateRef(strResolveContentBindingKey5, accumulatedState);
            if (objResolveStateRef5 != null) {
                BindingLoggerKt.logContentBinding("aggregateBindings", strResolveContentBindingKey5, objResolveStateRef5);
                Object objUnwrapForCoercion5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                if ((objUnwrapForCoercion5 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion5) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                    obj3 = null;
                } else {
                    Object objUnwrapForCoercion6 = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                    if (objUnwrapForCoercion6 == null) {
                        objOverlayContentPathBindings5 = null;
                    } else if (objUnwrapForCoercion6 instanceof JsonElement) {
                        JsonElement jsonElement5 = (JsonElement) objUnwrapForCoercion6;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonElement5);
                        } catch (Exception unused9) {
                            objOverlayContentPathBindings5 = null;
                        }
                    } else if (objUnwrapForCoercion6 instanceof Map) {
                        objOverlayContentPathBindings5 = objUnwrapForCoercion6;
                    } else if (objUnwrapForCoercion6 instanceof Number) {
                        C22673i0 c22673i4 = AbstractC22671h0.f89337a;
                        InterfaceC21461d orCreateKotlinClass5 = c22673i4.getOrCreateKotlinClass(Map.class);
                        if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls7))) {
                            objOverlayContentPathBindings5 = (Map) Integer.valueOf(((Number) objUnwrapForCoercion6).intValue());
                        } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls6))) {
                            objOverlayContentPathBindings5 = (Map) Long.valueOf(((Number) objUnwrapForCoercion6).longValue());
                        } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls5))) {
                            objOverlayContentPathBindings5 = (Map) Double.valueOf(((Number) objUnwrapForCoercion6).doubleValue());
                        } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls4))) {
                            objOverlayContentPathBindings5 = (Map) Float.valueOf(((Number) objUnwrapForCoercion6).floatValue());
                        } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls3))) {
                            objOverlayContentPathBindings5 = (Map) Short.valueOf(((Number) objUnwrapForCoercion6).shortValue());
                        } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls8))) {
                            objOverlayContentPathBindings5 = (Map) Byte.valueOf(((Number) objUnwrapForCoercion6).byteValue());
                        } else {
                            objOverlayContentPathBindings5 = null;
                        }
                    } else if (objUnwrapForCoercion6 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c5 = AbstractC0770m.m1841c((String) objUnwrapForCoercion6);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonPrimitiveM1841c5);
                        } catch (Exception unused10) {
                            objM1830a = null;
                        }
                        if (objM1830a != null) {
                            objOverlayContentPathBindings5 = objM1830a;
                        } else {
                            objOverlayContentPathBindings5 = null;
                        }
                    } else {
                        objOverlayContentPathBindings5 = null;
                    }
                    obj3 = objOverlayContentPathBindings5 == null ? aggregateBindings : objOverlayContentPathBindings5;
                }
            }
        } else if (obj3 != null) {
            objOverlayContentPathBindings5 = ContentPathBindingsKt.overlayContentPathBindings(map3, "aggregateBindings", accumulatedState, obj3, m.f47965w, n.f47966w);
        }
        return (ReactionsInputModel) ContentBindingResolverKt.copyBindingsFrom(new ReactionsInputModel(str2, str3, genericInteraction, map6, (Map) DotPathBindingsKt.overlayAggregateBinding(map2, "aggregateBindings", accumulatedState, obj3, "aggregateBindings", o.f47967w, p.f47968w, q.f47969w)), reactionsInputModel);
    }
}
