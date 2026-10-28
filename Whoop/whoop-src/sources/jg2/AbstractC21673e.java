package jg2;

import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.BindCoercionKt;
import com.whoop.design.models.binding.BindingLoggerKt;
import com.whoop.design.models.binding.ContentBindingResolverKt;
import com.whoop.design.models.binding.ContentPathBindingsKt;
import com.whoop.design.models.binding.DotPathBindingsKt;
import com.whoop.design.models.binding.StateBindingDeserializerKt;
import com.whoop.design.models.binding.StateLookupKt;
import com.whoop.startactivity.dropdown.DropdownModel;
import com.whoop.startactivity.dropdown.DropdownOption;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
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

/* JADX INFO: renamed from: jg2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aS\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lcom/whoop/startactivity/dropdown/DropdownModel;", "", "", "contentBinding", "Lcom/whoop/design/models/binding/AggregateBinding;", "aggregateBindings", "", "accumulatedState", "a", "(Lcom/whoop/startactivity/dropdown/DropdownModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/startactivity/dropdown/DropdownModel;", "start-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21673e {

    /* JADX INFO: renamed from: jg2.e$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f83202w = new a();

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

    /* JADX INFO: renamed from: jg2.e$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f83203w = new b();

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

    /* JADX INFO: renamed from: jg2.e$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f83204w = new c();

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

    /* JADX INFO: renamed from: jg2.e$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f83205w = new d();

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

    /* JADX INFO: renamed from: jg2.e$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f83206w = new e();

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

    /* JADX INFO: renamed from: jg2.e$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f83207w = new f();

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

    /* JADX INFO: renamed from: jg2.e$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f83208w = new g();

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

    /* JADX INFO: renamed from: jg2.e$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f83209w = new h();

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

    /* JADX INFO: renamed from: jg2.e$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i f83210w = new i();

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

    /* JADX INFO: renamed from: jg2.e$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final j f83211w = new j();

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

    /* JADX INFO: renamed from: jg2.e$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final k f83212w = new k();

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

    /* JADX INFO: renamed from: jg2.e$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final l f83213w = new l();

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

    /* JADX INFO: renamed from: jg2.e$m */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final m f83214w = new m();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JsonElement invoke(List<? extends DropdownOption> v13) {
            AbstractC22676k.m65750j(v13, "v");
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                ArrayListSerializer arrayListSerializer = new ArrayListSerializer(DropdownOption.INSTANCE.serializer());
                AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                stateBindingJson.getClass();
                return AbstractC12313p.m34290h0(stateBindingJson, v13, arrayListSerializer);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: jg2.e$n */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final n f83215w = new n();

        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List<? extends com.whoop.startactivity.dropdown.DropdownOption>] */
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<? extends DropdownOption> invoke(JsonElement json) {
            AbstractC22676k.m65750j(json, "json");
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(DropdownOption.INSTANCE.serializer()), json);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: jg2.e$o */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final o f83216w = new o();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JsonElement invoke(List<? extends DropdownOption> list) {
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new ArrayListSerializer(DropdownOption.INSTANCE.serializer()));
                AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                stateBindingJson.getClass();
                return AbstractC12313p.m34290h0(stateBindingJson, list, interfaceC37138cM122336d);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: jg2.e$p */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final p f83217w = new p();

        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List<? extends com.whoop.startactivity.dropdown.DropdownOption>] */
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<? extends DropdownOption> invoke(JsonElement json) {
            AbstractC22676k.m65750j(json, "json");
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(DropdownOption.INSTANCE.serializer()), json);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: jg2.e$q */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final q f83218w = new q();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<? extends com.whoop.startactivity.dropdown.DropdownOption>] */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List<? extends com.whoop.startactivity.dropdown.DropdownOption>] */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List<? extends com.whoop.startactivity.dropdown.DropdownOption>] */
        @Override // p715kotlin.jvm.functions.Function1
        public final List<? extends DropdownOption> invoke(Object obj) {
            Object objM1830a;
            ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj);
            if (UnwrapForCoercion == 0) {
                return null;
            }
            if (UnwrapForCoercion instanceof JsonElement) {
                JsonElement jsonElement = (JsonElement) UnwrapForCoercion;
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(DropdownOption.INSTANCE.serializer()), jsonElement);
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
                    objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(DropdownOption.INSTANCE.serializer()), jsonPrimitiveM1841c);
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

    /* JADX INFO: renamed from: jg2.e$r */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final r f83219w = new r();

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

    /* JADX INFO: renamed from: jg2.e$s */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final s f83220w = new s();

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

    /* JADX INFO: renamed from: jg2.e$t */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final t f83221w = new t();

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

    /* JADX INFO: renamed from: jg2.e$u */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final u f83222w = new u();

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

    /* JADX INFO: renamed from: jg2.e$v */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final v f83223w = new v();

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

    /* JADX INFO: renamed from: jg2.e$w */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class w implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final w f83224w = new w();

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

    /* JADX INFO: renamed from: jg2.e$x */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class x implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final x f83225w = new x();

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

    /* JADX INFO: renamed from: jg2.e$y */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class y implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final y f83226w = new y();

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
    /* JADX WARN: Code duplicated, block: B:221:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:279:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:312:0x056f  */
    /* JADX WARN: Code duplicated, block: B:370:0x068c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:418:0x073f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a9 A[PHI: r4
      0x01a9: PHI (r4v16 java.lang.Object) = (r4v14 java.lang.Object), (r4v14 java.lang.Object), (r4v213 java.lang.Object) binds: [B:97:0x01ac, B:48:0x00a2, B:94:0x01a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final DropdownModel m60964a(DropdownModel dropdownModel, Map<String, String> map, Map<String, AggregateBinding> map2, Map<String, ? extends Object> accumulatedState) {
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
        Class cls2;
        Object obj3;
        WithGeneratedBindings withGeneratedBindingsBind4;
        Object objOverlayContentPathBindings4;
        Class cls3;
        List list;
        WithGeneratedBindings withGeneratedBindingsBind5;
        Object obj4;
        Object objOverlayContentPathBindings5;
        Object objM1830a;
        String str;
        AbstractC22676k.m65750j(dropdownModel, "<this>");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        if ((map == null || map.isEmpty()) && ((map2 == null || map2.isEmpty()) && accumulatedState.isEmpty())) {
            return dropdownModel;
        }
        Object id4 = dropdownModel.getId();
        if (id4 == null) {
            objOverlayContentPathBindings = null;
        } else if (id4 instanceof WithGeneratedBindings) {
            Object objBind = ((WithGeneratedBindings) id4).bind(accumulatedState);
            if (!(objBind instanceof String)) {
                objBind = null;
            }
            objOverlayContentPathBindings = (String) objBind;
            if (objOverlayContentPathBindings == null) {
                objOverlayContentPathBindings = id4;
            }
        } else if (id4 instanceof List) {
            Iterable iterable = (Iterable) id4;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
            for (Object obj5 : iterable) {
                WithGeneratedBindings withGeneratedBindings = obj5 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj5 : null;
                if (withGeneratedBindings != null && (withGeneratedBindingsBind = withGeneratedBindings.bind(accumulatedState)) != null) {
                    obj5 = withGeneratedBindingsBind;
                }
                arrayList.add(obj5);
            }
            objOverlayContentPathBindings = (String) arrayList;
        } else {
            objOverlayContentPathBindings = id4;
        }
        String strResolveContentBindingKey = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "id") : null;
        Class cls4 = Byte.TYPE;
        Class cls5 = Short.TYPE;
        Class cls6 = Float.TYPE;
        Class cls7 = Double.TYPE;
        Class cls8 = Long.TYPE;
        Class cls9 = Integer.TYPE;
        if (strResolveContentBindingKey != null) {
            Object objResolveStateRef = StateLookupKt.resolveStateRef(strResolveContentBindingKey, accumulatedState);
            if (objResolveStateRef != null) {
                BindingLoggerKt.logContentBinding("id", strResolveContentBindingKey, objResolveStateRef);
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
                                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls9))) {
                                    str = (String) Integer.valueOf(((Number) objOverlayContentPathBindings).intValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls8))) {
                                    str = (String) Long.valueOf(((Number) objOverlayContentPathBindings).longValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls7))) {
                                    str = (String) Double.valueOf(((Number) objOverlayContentPathBindings).doubleValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls6))) {
                                    str = (String) Float.valueOf(((Number) objOverlayContentPathBindings).floatValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
                                    str = (String) Short.valueOf(((Number) objOverlayContentPathBindings).shortValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
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
                        objOverlayContentPathBindings = id4;
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
            objOverlayContentPathBindings = ContentPathBindingsKt.overlayContentPathBindings(map, "id", accumulatedState, objOverlayContentPathBindings, k.f83212w, r.f83219w);
            map3 = map;
        }
        String id5 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "id", accumulatedState, objOverlayContentPathBindings, "id", s.f83220w, t.f83221w, u.f83222w);
        if (id5 == null) {
            id5 = dropdownModel.getId();
        }
        String str2 = id5;
        Object label = dropdownModel.getLabel();
        if (label == null) {
            objOverlayContentPathBindings2 = null;
        } else {
            if (label instanceof WithGeneratedBindings) {
                Object objBind2 = ((WithGeneratedBindings) label).bind(accumulatedState);
                if (!(objBind2 instanceof String)) {
                    objBind2 = null;
                }
                obj = (String) objBind2;
                if (obj == null) {
                    obj = label;
                }
            } else if (label instanceof List) {
                Iterable iterable2 = (Iterable) label;
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(iterable2, 10));
                for (Object obj6 : iterable2) {
                    WithGeneratedBindings withGeneratedBindings2 = obj6 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj6 : null;
                    if (withGeneratedBindings2 != null && (withGeneratedBindingsBind2 = withGeneratedBindings2.bind(accumulatedState)) != null) {
                        obj6 = withGeneratedBindingsBind2;
                    }
                    arrayList2.add(obj6);
                }
                obj = (String) arrayList2;
            } else {
                obj = label;
            }
            objOverlayContentPathBindings2 = obj;
        }
        String strResolveContentBindingKey2 = map3 != null ? BindingLoggerKt.resolveContentBindingKey(map3, "label") : null;
        if (strResolveContentBindingKey2 != null) {
            Object objResolveStateRef2 = StateLookupKt.resolveStateRef(strResolveContentBindingKey2, accumulatedState);
            if (objResolveStateRef2 != null) {
                BindingLoggerKt.logContentBinding("label", strResolveContentBindingKey2, objResolveStateRef2);
                Object objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                if ((objUnwrapForCoercion2 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion2) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                    cls = cls4;
                    objOverlayContentPathBindings2 = null;
                } else {
                    objOverlayContentPathBindings2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                    if (objOverlayContentPathBindings2 == null) {
                        cls = cls4;
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
                                    if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls9))) {
                                        objOverlayContentPathBindings2 = (String) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls8))) {
                                        objOverlayContentPathBindings2 = (String) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls7))) {
                                        objOverlayContentPathBindings2 = (String) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls6))) {
                                        objOverlayContentPathBindings2 = (String) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls5))) {
                                        objOverlayContentPathBindings2 = (String) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                                    } else {
                                        cls = cls4;
                                        if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls))) {
                                            objOverlayContentPathBindings2 = (String) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                                        }
                                    }
                                } else {
                                    cls = cls4;
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
                                objOverlayContentPathBindings2 = label;
                            }
                        }
                        cls = cls4;
                        if (objOverlayContentPathBindings2 == null) {
                            objOverlayContentPathBindings2 = label;
                        }
                    }
                    objOverlayContentPathBindings2 = null;
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = label;
                    }
                }
            } else {
                cls = cls4;
            }
        } else {
            cls = cls4;
            if (objOverlayContentPathBindings2 != null) {
                objOverlayContentPathBindings2 = ContentPathBindingsKt.overlayContentPathBindings(map3, "label", accumulatedState, objOverlayContentPathBindings2, v.f83223w, w.f83224w);
            }
        }
        Class cls10 = cls;
        String str3 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "label", accumulatedState, objOverlayContentPathBindings2, "label", x.f83225w, y.f83226w, a.f83202w);
        Object placeholder = dropdownModel.getPlaceholder();
        if (placeholder == null) {
            objOverlayContentPathBindings3 = null;
        } else {
            if (placeholder instanceof WithGeneratedBindings) {
                Object objBind3 = ((WithGeneratedBindings) placeholder).bind(accumulatedState);
                if (!(objBind3 instanceof String)) {
                    objBind3 = null;
                }
                obj2 = (String) objBind3;
                if (obj2 == null) {
                    obj2 = placeholder;
                }
            } else if (placeholder instanceof List) {
                Iterable iterable3 = (Iterable) placeholder;
                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(iterable3, 10));
                for (Object obj7 : iterable3) {
                    WithGeneratedBindings withGeneratedBindings3 = obj7 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj7 : null;
                    if (withGeneratedBindings3 != null && (withGeneratedBindingsBind3 = withGeneratedBindings3.bind(accumulatedState)) != null) {
                        obj7 = withGeneratedBindingsBind3;
                    }
                    arrayList3.add(obj7);
                }
                obj2 = (String) arrayList3;
            } else {
                obj2 = placeholder;
            }
            objOverlayContentPathBindings3 = obj2;
        }
        String strResolveContentBindingKey3 = map3 != null ? BindingLoggerKt.resolveContentBindingKey(map3, "placeholder") : null;
        if (strResolveContentBindingKey3 != null) {
            Object objResolveStateRef3 = StateLookupKt.resolveStateRef(strResolveContentBindingKey3, accumulatedState);
            if (objResolveStateRef3 != null) {
                BindingLoggerKt.logContentBinding("placeholder", strResolveContentBindingKey3, objResolveStateRef3);
                Object objUnwrapForCoercion3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                if ((objUnwrapForCoercion3 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion3) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                    cls2 = cls10;
                    objOverlayContentPathBindings3 = null;
                } else {
                    objOverlayContentPathBindings3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                    if (objOverlayContentPathBindings3 == null) {
                        cls2 = cls10;
                    } else {
                        if (objOverlayContentPathBindings3 instanceof JsonElement) {
                            JsonElement jsonElement3 = (JsonElement) objOverlayContentPathBindings3;
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement3);
                            } catch (Exception unused5) {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else {
                            boolean z14 = objOverlayContentPathBindings3 instanceof String;
                            if (!z14) {
                                if (objOverlayContentPathBindings3 instanceof Number) {
                                    C22673i0 c22673i2 = AbstractC22671h0.f89337a;
                                    InterfaceC21461d orCreateKotlinClass3 = c22673i2.getOrCreateKotlinClass(String.class);
                                    if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls9))) {
                                        objOverlayContentPathBindings3 = (String) Integer.valueOf(((Number) objOverlayContentPathBindings3).intValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls8))) {
                                        objOverlayContentPathBindings3 = (String) Long.valueOf(((Number) objOverlayContentPathBindings3).longValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls7))) {
                                        objOverlayContentPathBindings3 = (String) Double.valueOf(((Number) objOverlayContentPathBindings3).doubleValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls6))) {
                                        objOverlayContentPathBindings3 = (String) Float.valueOf(((Number) objOverlayContentPathBindings3).floatValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls5))) {
                                        objOverlayContentPathBindings3 = (String) Short.valueOf(((Number) objOverlayContentPathBindings3).shortValue());
                                    } else {
                                        cls2 = cls10;
                                        if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls2))) {
                                            objOverlayContentPathBindings3 = (String) Byte.valueOf(((Number) objOverlayContentPathBindings3).byteValue());
                                        }
                                    }
                                } else {
                                    cls2 = cls10;
                                    if (z14) {
                                        JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings3);
                                        try {
                                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                                            objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c3);
                                        } catch (Exception unused6) {
                                            objOverlayContentPathBindings3 = null;
                                        }
                                        if (objOverlayContentPathBindings3 == null) {
                                        }
                                    }
                                }
                            }
                            if (objOverlayContentPathBindings3 == null) {
                                objOverlayContentPathBindings3 = placeholder;
                            }
                        }
                        cls2 = cls10;
                        if (objOverlayContentPathBindings3 == null) {
                            objOverlayContentPathBindings3 = placeholder;
                        }
                    }
                    objOverlayContentPathBindings3 = null;
                    if (objOverlayContentPathBindings3 == null) {
                        objOverlayContentPathBindings3 = placeholder;
                    }
                }
            } else {
                cls2 = cls10;
            }
        } else {
            cls2 = cls10;
            if (objOverlayContentPathBindings3 != null) {
                objOverlayContentPathBindings3 = ContentPathBindingsKt.overlayContentPathBindings(map3, "placeholder", accumulatedState, objOverlayContentPathBindings3, b.f83203w, c.f83204w);
            }
        }
        Class cls11 = cls2;
        String str4 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "placeholder", accumulatedState, objOverlayContentPathBindings3, "placeholder", d.f83205w, e.f83206w, f.f83207w);
        Object selectedOptionId = dropdownModel.getSelectedOptionId();
        if (selectedOptionId == null) {
            objOverlayContentPathBindings4 = null;
        } else {
            if (selectedOptionId instanceof WithGeneratedBindings) {
                Object objBind4 = ((WithGeneratedBindings) selectedOptionId).bind(accumulatedState);
                if (!(objBind4 instanceof String)) {
                    objBind4 = null;
                }
                obj3 = (String) objBind4;
                if (obj3 == null) {
                    obj3 = selectedOptionId;
                }
            } else if (selectedOptionId instanceof List) {
                Iterable iterable4 = (Iterable) selectedOptionId;
                ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(iterable4, 10));
                for (Object obj8 : iterable4) {
                    WithGeneratedBindings withGeneratedBindings4 = obj8 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj8 : null;
                    if (withGeneratedBindings4 != null && (withGeneratedBindingsBind4 = withGeneratedBindings4.bind(accumulatedState)) != null) {
                        obj8 = withGeneratedBindingsBind4;
                    }
                    arrayList4.add(obj8);
                }
                obj3 = (String) arrayList4;
            } else {
                obj3 = selectedOptionId;
            }
            objOverlayContentPathBindings4 = obj3;
        }
        String strResolveContentBindingKey4 = map3 != null ? BindingLoggerKt.resolveContentBindingKey(map3, "selectedOptionId") : null;
        if (strResolveContentBindingKey4 != null) {
            Object objResolveStateRef4 = StateLookupKt.resolveStateRef(strResolveContentBindingKey4, accumulatedState);
            if (objResolveStateRef4 != null) {
                BindingLoggerKt.logContentBinding("selectedOptionId", strResolveContentBindingKey4, objResolveStateRef4);
                Object objUnwrapForCoercion4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                if ((objUnwrapForCoercion4 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion4) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                    cls3 = cls11;
                    objOverlayContentPathBindings4 = null;
                } else {
                    objOverlayContentPathBindings4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                    if (objOverlayContentPathBindings4 == null) {
                        cls3 = cls11;
                    } else {
                        if (objOverlayContentPathBindings4 instanceof JsonElement) {
                            JsonElement jsonElement4 = (JsonElement) objOverlayContentPathBindings4;
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement4);
                            } catch (Exception unused7) {
                                objOverlayContentPathBindings4 = null;
                            }
                        } else {
                            boolean z15 = objOverlayContentPathBindings4 instanceof String;
                            if (!z15) {
                                if (objOverlayContentPathBindings4 instanceof Number) {
                                    C22673i0 c22673i3 = AbstractC22671h0.f89337a;
                                    InterfaceC21461d orCreateKotlinClass4 = c22673i3.getOrCreateKotlinClass(String.class);
                                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls9))) {
                                        objOverlayContentPathBindings4 = (String) Integer.valueOf(((Number) objOverlayContentPathBindings4).intValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls8))) {
                                        objOverlayContentPathBindings4 = (String) Long.valueOf(((Number) objOverlayContentPathBindings4).longValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls7))) {
                                        objOverlayContentPathBindings4 = (String) Double.valueOf(((Number) objOverlayContentPathBindings4).doubleValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls6))) {
                                        objOverlayContentPathBindings4 = (String) Float.valueOf(((Number) objOverlayContentPathBindings4).floatValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls5))) {
                                        objOverlayContentPathBindings4 = (String) Short.valueOf(((Number) objOverlayContentPathBindings4).shortValue());
                                    } else {
                                        cls3 = cls11;
                                        if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls3))) {
                                            objOverlayContentPathBindings4 = (String) Byte.valueOf(((Number) objOverlayContentPathBindings4).byteValue());
                                        }
                                    }
                                } else {
                                    cls3 = cls11;
                                    if (z15) {
                                        JsonPrimitive jsonPrimitiveM1841c4 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings4);
                                        try {
                                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                                            objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c4);
                                        } catch (Exception unused8) {
                                            objOverlayContentPathBindings4 = null;
                                        }
                                        if (objOverlayContentPathBindings4 == null) {
                                        }
                                    }
                                }
                            }
                            if (objOverlayContentPathBindings4 == null) {
                                objOverlayContentPathBindings4 = selectedOptionId;
                            }
                        }
                        cls3 = cls11;
                        if (objOverlayContentPathBindings4 == null) {
                            objOverlayContentPathBindings4 = selectedOptionId;
                        }
                    }
                    objOverlayContentPathBindings4 = null;
                    if (objOverlayContentPathBindings4 == null) {
                        objOverlayContentPathBindings4 = selectedOptionId;
                    }
                }
            } else {
                cls3 = cls11;
            }
        } else {
            cls3 = cls11;
            if (objOverlayContentPathBindings4 != null) {
                objOverlayContentPathBindings4 = ContentPathBindingsKt.overlayContentPathBindings(map3, "selectedOptionId", accumulatedState, objOverlayContentPathBindings4, g.f83208w, h.f83209w);
            }
        }
        String str5 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "selectedOptionId", accumulatedState, objOverlayContentPathBindings4, "selectedOptionId", i.f83210w, j.f83211w, l.f83213w);
        List<DropdownOption> options = dropdownModel.getOptions();
        if (options == null) {
            obj4 = null;
        } else {
            if (options instanceof WithGeneratedBindings) {
                WithGeneratedBindings withGeneratedBindingsBind6 = ((WithGeneratedBindings) options).bind(accumulatedState);
                if (!(withGeneratedBindingsBind6 instanceof List)) {
                    withGeneratedBindingsBind6 = null;
                }
                list = (List) withGeneratedBindingsBind6;
                if (list == null) {
                    list = options;
                }
            } else {
                List<DropdownOption> list2 = options;
                ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                for (Object obj9 : list2) {
                    WithGeneratedBindings withGeneratedBindings5 = obj9 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj9 : null;
                    if (withGeneratedBindings5 != null && (withGeneratedBindingsBind5 = withGeneratedBindings5.bind(accumulatedState)) != null) {
                        obj9 = withGeneratedBindingsBind5;
                    }
                    arrayList5.add(obj9);
                }
                list = arrayList5;
            }
            obj4 = list;
        }
        String strResolveContentBindingKey5 = map3 != null ? BindingLoggerKt.resolveContentBindingKey(map3, "options") : null;
        if (strResolveContentBindingKey5 != null) {
            Object objResolveStateRef5 = StateLookupKt.resolveStateRef(strResolveContentBindingKey5, accumulatedState);
            if (objResolveStateRef5 != null) {
                BindingLoggerKt.logContentBinding("options", strResolveContentBindingKey5, objResolveStateRef5);
                Object objUnwrapForCoercion5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                if ((objUnwrapForCoercion5 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion5) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                    obj4 = null;
                } else {
                    Object objUnwrapForCoercion6 = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                    if (objUnwrapForCoercion6 == null) {
                        objOverlayContentPathBindings5 = null;
                    } else if (objUnwrapForCoercion6 instanceof JsonElement) {
                        JsonElement jsonElement5 = (JsonElement) objUnwrapForCoercion6;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(DropdownOption.INSTANCE.serializer()), jsonElement5);
                        } catch (Exception unused9) {
                            objOverlayContentPathBindings5 = null;
                        }
                    } else if (objUnwrapForCoercion6 instanceof List) {
                        objOverlayContentPathBindings5 = objUnwrapForCoercion6;
                    } else if (objUnwrapForCoercion6 instanceof Number) {
                        C22673i0 c22673i4 = AbstractC22671h0.f89337a;
                        InterfaceC21461d orCreateKotlinClass5 = c22673i4.getOrCreateKotlinClass(List.class);
                        if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls9))) {
                            objOverlayContentPathBindings5 = (List) Integer.valueOf(((Number) objUnwrapForCoercion6).intValue());
                        } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls8))) {
                            objOverlayContentPathBindings5 = (List) Long.valueOf(((Number) objUnwrapForCoercion6).longValue());
                        } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls7))) {
                            objOverlayContentPathBindings5 = (List) Double.valueOf(((Number) objUnwrapForCoercion6).doubleValue());
                        } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls6))) {
                            objOverlayContentPathBindings5 = (List) Float.valueOf(((Number) objUnwrapForCoercion6).floatValue());
                        } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls5))) {
                            objOverlayContentPathBindings5 = (List) Short.valueOf(((Number) objUnwrapForCoercion6).shortValue());
                        } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls3))) {
                            objOverlayContentPathBindings5 = (List) Byte.valueOf(((Number) objUnwrapForCoercion6).byteValue());
                        } else {
                            objOverlayContentPathBindings5 = null;
                        }
                    } else if (objUnwrapForCoercion6 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c5 = AbstractC0770m.m1841c((String) objUnwrapForCoercion6);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(DropdownOption.INSTANCE.serializer()), jsonPrimitiveM1841c5);
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
                    obj4 = objOverlayContentPathBindings5 == null ? options : objOverlayContentPathBindings5;
                }
            }
        } else if (obj4 != null) {
            objOverlayContentPathBindings5 = ContentPathBindingsKt.overlayContentPathBindings(map3, "options", accumulatedState, obj4, m.f83214w, n.f83215w);
        }
        List<DropdownOption> options2 = (List) DotPathBindingsKt.overlayAggregateBinding(map2, "options", accumulatedState, obj4, "options", o.f83216w, p.f83217w, q.f83218w);
        if (options2 == null) {
            options2 = dropdownModel.getOptions();
        }
        return (DropdownModel) ContentBindingResolverKt.copyBindingsFrom(new DropdownModel(str2, str3, str4, str5, options2), dropdownModel);
    }
}
