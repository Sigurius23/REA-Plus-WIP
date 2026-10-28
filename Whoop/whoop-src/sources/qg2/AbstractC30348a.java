package qg2;

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
import com.whoop.design.models.modal.AnyModal;
import com.whoop.navigation.C9598e;
import com.whoop.startactivity.presession.domain.model.PreSessionWidgetModel;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.BooleanSerializer;
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

/* JADX INFO: renamed from: qg2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aS\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;", "", "", "contentBinding", "Lcom/whoop/design/models/binding/AggregateBinding;", "aggregateBindings", "", "accumulatedState", "a", "(Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;", "start-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30348a {

    /* JADX INFO: renamed from: qg2.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f124496w = new a();

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

    /* JADX INFO: renamed from: qg2.a$a0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a0 f124497w = new a0();

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

    /* JADX INFO: renamed from: qg2.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f124498w = new b();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JsonElement invoke(Boolean v13) {
            AbstractC22676k.m65750j(v13, "v");
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                return StateBindingDeserializerKt.getStateBindingJson().m1832c(BooleanSerializer.INSTANCE, v13);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: qg2.a$b0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b0 f124499w = new b0();

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

    /* JADX INFO: renamed from: qg2.a$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f124500w = new c();

        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Boolean, java.lang.Object] */
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(JsonElement json) {
            AbstractC22676k.m65750j(json, "json");
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, json);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: qg2.a$c0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c0 f124501w = new c0();

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

    /* JADX INFO: renamed from: qg2.a$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f124502w = new d();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JsonElement invoke(Boolean bool) {
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(BooleanSerializer.INSTANCE);
                AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                stateBindingJson.getClass();
                return AbstractC12313p.m34290h0(stateBindingJson, bool, interfaceC37138cM122336d);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: qg2.a$d0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d0 implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d0 f124503w = new d0();

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

    /* JADX INFO: renamed from: qg2.a$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f124504w = new e();

        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Boolean, java.lang.Object] */
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(JsonElement json) {
            AbstractC22676k.m65750j(json, "json");
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, json);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: qg2.a$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f124505w = new f();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Boolean, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Boolean, java.lang.Object] */
        @Override // p715kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            Object objM1830a;
            ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj);
            if (UnwrapForCoercion == 0) {
                return null;
            }
            if (UnwrapForCoercion instanceof JsonElement) {
                JsonElement jsonElement = (JsonElement) UnwrapForCoercion;
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonElement);
                } catch (Exception unused) {
                    return null;
                }
            }
            if (UnwrapForCoercion instanceof Boolean) {
                return UnwrapForCoercion;
            }
            if (!(UnwrapForCoercion instanceof Number)) {
                if (!(UnwrapForCoercion instanceof String)) {
                    return null;
                }
                JsonPrimitive jsonPrimitiveM1841c = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonPrimitiveM1841c);
                } catch (Exception unused2) {
                    objM1830a = null;
                }
                if (objM1830a != null) {
                    return objM1830a;
                }
                return null;
            }
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Boolean.class);
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                return (Boolean) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                return (Boolean) Long.valueOf(((Number) UnwrapForCoercion).longValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                return (Boolean) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                return (Boolean) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                return (Boolean) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                return (Boolean) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: qg2.a$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f124506w = new g();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JsonElement invoke(C9598e v13) {
            AbstractC22676k.m65750j(v13, "v");
            try {
                InterfaceC37138c interfaceC37138cM113843f = AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class));
                AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                stateBindingJson.getClass();
                return AbstractC12313p.m34290h0(stateBindingJson, v13, interfaceC37138cM113843f);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: qg2.a$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f124507w = new h();

        /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.navigation.e, java.lang.Object] */
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C9598e invoke(JsonElement json) {
            AbstractC22676k.m65750j(json, "json");
            try {
                return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class)), json);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: qg2.a$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i f124508w = new i();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JsonElement invoke(C9598e c9598e) {
            try {
                InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class)));
                AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                stateBindingJson.getClass();
                return AbstractC12313p.m34290h0(stateBindingJson, c9598e, interfaceC37138cM122336d);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: qg2.a$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final j f124509w = new j();

        /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.navigation.e, java.lang.Object] */
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C9598e invoke(JsonElement json) {
            AbstractC22676k.m65750j(json, "json");
            try {
                return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class)), json);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: qg2.a$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final k f124510w = new k();

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

    /* JADX INFO: renamed from: qg2.a$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final l f124511w = new l();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.navigation.e, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.navigation.e, java.lang.Object] */
        @Override // p715kotlin.jvm.functions.Function1
        public final C9598e invoke(Object obj) {
            Object objM1830a;
            ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj);
            if (UnwrapForCoercion == 0) {
                return null;
            }
            if (UnwrapForCoercion instanceof JsonElement) {
                try {
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class)), (JsonElement) UnwrapForCoercion);
                } catch (Exception unused) {
                    return null;
                }
            }
            if (UnwrapForCoercion instanceof C9598e) {
                return UnwrapForCoercion;
            }
            if (!(UnwrapForCoercion instanceof Number)) {
                if (!(UnwrapForCoercion instanceof String)) {
                    return null;
                }
                try {
                    objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class)), AbstractC0770m.m1841c((String) UnwrapForCoercion));
                } catch (Exception unused2) {
                    objM1830a = null;
                }
                if (objM1830a != null) {
                    return objM1830a;
                }
                return null;
            }
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(C9598e.class);
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                return (C9598e) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                return (C9598e) Long.valueOf(((Number) UnwrapForCoercion).longValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                return (C9598e) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                return (C9598e) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                return (C9598e) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                return (C9598e) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: qg2.a$m */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final m f124512w = new m();

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

    /* JADX INFO: renamed from: qg2.a$n */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final n f124513w = new n();

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

    /* JADX INFO: renamed from: qg2.a$o */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final o f124514w = new o();

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

    /* JADX INFO: renamed from: qg2.a$p */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final p f124515w = new p();

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

    /* JADX INFO: renamed from: qg2.a$q */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final q f124516w = new q();

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

    /* JADX INFO: renamed from: qg2.a$r */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final r f124517w = new r();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JsonElement invoke(AnyModal v13) {
            AbstractC22676k.m65750j(v13, "v");
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                return StateBindingDeserializerKt.getStateBindingJson().m1832c(AnyModal.INSTANCE.serializer(), v13);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: qg2.a$s */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final s f124518w = new s();

        /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.modal.AnyModal, java.lang.Object] */
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AnyModal invoke(JsonElement json) {
            AbstractC22676k.m65750j(json, "json");
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                return StateBindingDeserializerKt.getStateBindingJson().m1830a(AnyModal.INSTANCE.serializer(), json);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: qg2.a$t */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final t f124519w = new t();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JsonElement invoke(AnyModal anyModal) {
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(AnyModal.INSTANCE.serializer());
                AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                stateBindingJson.getClass();
                return AbstractC12313p.m34290h0(stateBindingJson, anyModal, interfaceC37138cM122336d);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: qg2.a$u */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final u f124520w = new u();

        /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.modal.AnyModal, java.lang.Object] */
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AnyModal invoke(JsonElement json) {
            AbstractC22676k.m65750j(json, "json");
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                return StateBindingDeserializerKt.getStateBindingJson().m1830a(AnyModal.INSTANCE.serializer(), json);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: qg2.a$v */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final v f124521w = new v();

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

    /* JADX INFO: renamed from: qg2.a$w */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class w implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final w f124522w = new w();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.modal.AnyModal, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.modal.AnyModal, java.lang.Object] */
        @Override // p715kotlin.jvm.functions.Function1
        public final AnyModal invoke(Object obj) {
            Object objM1830a;
            ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj);
            if (UnwrapForCoercion == 0) {
                return null;
            }
            if (UnwrapForCoercion instanceof JsonElement) {
                JsonElement jsonElement = (JsonElement) UnwrapForCoercion;
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(AnyModal.INSTANCE.serializer(), jsonElement);
                } catch (Exception unused) {
                    return null;
                }
            }
            if (UnwrapForCoercion instanceof AnyModal) {
                return UnwrapForCoercion;
            }
            if (!(UnwrapForCoercion instanceof Number)) {
                if (!(UnwrapForCoercion instanceof String)) {
                    return null;
                }
                JsonPrimitive jsonPrimitiveM1841c = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(AnyModal.INSTANCE.serializer(), jsonPrimitiveM1841c);
                } catch (Exception unused2) {
                    objM1830a = null;
                }
                if (objM1830a != null) {
                    return objM1830a;
                }
                return null;
            }
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(AnyModal.class);
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                return (AnyModal) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                return (AnyModal) Long.valueOf(((Number) UnwrapForCoercion).longValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                return (AnyModal) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                return (AnyModal) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                return (AnyModal) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
            }
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                return (AnyModal) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: qg2.a$x */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class x implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final x f124523w = new x();

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

    /* JADX INFO: renamed from: qg2.a$y */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class y implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final y f124524w = new y();

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

    /* JADX INFO: renamed from: qg2.a$z */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class z implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final z f124525w = new z();

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

    /* JADX WARN: Code duplicated, block: B:128:0x0222  */
    /* JADX WARN: Code duplicated, block: B:147:0x0262  */
    /* JADX WARN: Code duplicated, block: B:219:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:237:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:305:0x0547  */
    /* JADX WARN: Code duplicated, block: B:323:0x0583  */
    /* JADX WARN: Code duplicated, block: B:391:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:409:0x0721  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:484:0x089c A[PHI: r4
      0x089c: PHI (r4v71 java.lang.Object) = (r4v47 java.lang.Object), (r4v51 java.lang.Object) binds: [B:483:0x089a, B:511:0x095f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x00cc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final PreSessionWidgetModel m92783a(PreSessionWidgetModel preSessionWidgetModel, Map<String, String> map, Map<String, AggregateBinding> map2, Map<String, ? extends Object> accumulatedState) {
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
        WithGeneratedBindings withGeneratedBindingsBind4;
        Object objOverlayContentPathBindings4;
        Map<String, String> map3;
        WithGeneratedBindings withGeneratedBindingsBind5;
        Object objOverlayContentPathBindings5;
        Object obj5;
        Object objOverlayContentPathBindings6;
        AbstractC22676k.m65750j(preSessionWidgetModel, "<this>");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        if ((map == null || map.isEmpty()) && ((map2 == null || map2.isEmpty()) && accumulatedState.isEmpty())) {
            return preSessionWidgetModel;
        }
        Object id4 = preSessionWidgetModel.getId();
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
            for (Object obj6 : iterable) {
                WithGeneratedBindings withGeneratedBindings = obj6 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj6 : null;
                if (withGeneratedBindings != null && (withGeneratedBindingsBind = withGeneratedBindings.bind(accumulatedState)) != null) {
                    obj6 = withGeneratedBindingsBind;
                }
                arrayList.add(obj6);
            }
            objOverlayContentPathBindings = (String) arrayList;
        } else {
            objOverlayContentPathBindings = id4;
        }
        String strResolveContentBindingKey = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "id") : null;
        Class cls = Byte.TYPE;
        Class cls2 = Short.TYPE;
        Class cls3 = Float.TYPE;
        Class cls4 = Double.TYPE;
        Class cls5 = Long.TYPE;
        Class cls6 = Integer.TYPE;
        if (strResolveContentBindingKey != null) {
            Object objResolveStateRef = StateLookupKt.resolveStateRef(strResolveContentBindingKey, accumulatedState);
            if (objResolveStateRef != null) {
                BindingLoggerKt.logContentBinding("id", strResolveContentBindingKey, objResolveStateRef);
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
                            objOverlayContentPathBindings = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement);
                        } catch (Exception unused) {
                            objOverlayContentPathBindings = null;
                        }
                    } else {
                        boolean z4 = objOverlayContentPathBindings instanceof String;
                        if (!z4) {
                            if (objOverlayContentPathBindings instanceof Number) {
                                InterfaceC21461d interfaceC21461dM65688a = AbstractC22671h0.m65688a(String.class);
                                if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls6))) {
                                    objOverlayContentPathBindings = (String) Integer.valueOf(((Number) objOverlayContentPathBindings).intValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls5))) {
                                    objOverlayContentPathBindings = (String) Long.valueOf(((Number) objOverlayContentPathBindings).longValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls4))) {
                                    objOverlayContentPathBindings = (String) Double.valueOf(((Number) objOverlayContentPathBindings).doubleValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls3))) {
                                    objOverlayContentPathBindings = (String) Float.valueOf(((Number) objOverlayContentPathBindings).floatValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls2))) {
                                    objOverlayContentPathBindings = (String) Short.valueOf(((Number) objOverlayContentPathBindings).shortValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls))) {
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
                        objOverlayContentPathBindings = id4;
                    }
                }
            }
        } else if (objOverlayContentPathBindings != null) {
            objOverlayContentPathBindings = ContentPathBindingsKt.overlayContentPathBindings(map, "id", accumulatedState, objOverlayContentPathBindings, k.f124510w, v.f124521w);
        }
        String id5 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "id", accumulatedState, objOverlayContentPathBindings, "id", x.f124523w, y.f124524w, z.f124525w);
        if (id5 == null) {
            id5 = preSessionWidgetModel.getId();
        }
        String str = id5;
        Object selectedInternalName = preSessionWidgetModel.getSelectedInternalName();
        if (selectedInternalName == null) {
            objOverlayContentPathBindings2 = null;
        } else {
            if (selectedInternalName instanceof WithGeneratedBindings) {
                Object objBind2 = ((WithGeneratedBindings) selectedInternalName).bind(accumulatedState);
                if (!(objBind2 instanceof String)) {
                    objBind2 = null;
                }
                obj = (String) objBind2;
                if (obj == null) {
                    obj = selectedInternalName;
                }
            } else if (selectedInternalName instanceof List) {
                Iterable iterable2 = (Iterable) selectedInternalName;
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(iterable2, 10));
                for (Object obj7 : iterable2) {
                    WithGeneratedBindings withGeneratedBindings2 = obj7 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj7 : null;
                    if (withGeneratedBindings2 != null && (withGeneratedBindingsBind2 = withGeneratedBindings2.bind(accumulatedState)) != null) {
                        obj7 = withGeneratedBindingsBind2;
                    }
                    arrayList2.add(obj7);
                }
                obj = (String) arrayList2;
            } else {
                obj = selectedInternalName;
            }
            objOverlayContentPathBindings2 = obj;
        }
        String strResolveContentBindingKey2 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "selectedInternalName") : null;
        if (strResolveContentBindingKey2 != null) {
            Object objResolveStateRef2 = StateLookupKt.resolveStateRef(strResolveContentBindingKey2, accumulatedState);
            if (objResolveStateRef2 != null) {
                BindingLoggerKt.logContentBinding("selectedInternalName", strResolveContentBindingKey2, objResolveStateRef2);
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
                        objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement2);
                    } catch (Exception unused3) {
                        objOverlayContentPathBindings2 = null;
                    }
                } else {
                    boolean z13 = objOverlayContentPathBindings2 instanceof String;
                    if (!z13) {
                        if (objOverlayContentPathBindings2 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a2 = AbstractC22671h0.m65688a(String.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings2 = (String) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings2 = (String) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings2 = (String) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings2 = (String) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings2 = (String) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings2 = (String) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                            } else {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else if (z13) {
                            JsonPrimitive jsonPrimitiveM1841c2 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings2);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c2);
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
                }
                if (objOverlayContentPathBindings2 == null) {
                    objOverlayContentPathBindings2 = selectedInternalName;
                }
            } else {
                obj2 = ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY;
            }
        } else {
            obj2 = ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY;
            if (objOverlayContentPathBindings2 != null) {
                objOverlayContentPathBindings2 = ContentPathBindingsKt.overlayContentPathBindings(map, "selectedInternalName", accumulatedState, objOverlayContentPathBindings2, a0.f124497w, b0.f124499w);
            }
        }
        Object obj8 = obj2;
        String selectedInternalName2 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "selectedInternalName", accumulatedState, objOverlayContentPathBindings2, "selectedInternalName", c0.f124501w, d0.f124503w, a.f124496w);
        if (selectedInternalName2 == null) {
            selectedInternalName2 = preSessionWidgetModel.getSelectedInternalName();
        }
        String str2 = selectedInternalName2;
        Object gpsTrackingEnabled = preSessionWidgetModel.getGpsTrackingEnabled();
        if (gpsTrackingEnabled == null) {
            objOverlayContentPathBindings3 = null;
        } else {
            if (gpsTrackingEnabled instanceof WithGeneratedBindings) {
                Object objBind3 = ((WithGeneratedBindings) gpsTrackingEnabled).bind(accumulatedState);
                if (!(objBind3 instanceof Boolean)) {
                    objBind3 = null;
                }
                obj3 = (Boolean) objBind3;
                if (obj3 == null) {
                    obj3 = gpsTrackingEnabled;
                }
            } else if (gpsTrackingEnabled instanceof List) {
                Iterable iterable3 = (Iterable) gpsTrackingEnabled;
                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(iterable3, 10));
                for (Object obj9 : iterable3) {
                    WithGeneratedBindings withGeneratedBindings3 = obj9 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj9 : null;
                    if (withGeneratedBindings3 != null && (withGeneratedBindingsBind3 = withGeneratedBindings3.bind(accumulatedState)) != null) {
                        obj9 = withGeneratedBindingsBind3;
                    }
                    arrayList3.add(obj9);
                }
                obj3 = (Boolean) arrayList3;
            } else {
                obj3 = gpsTrackingEnabled;
            }
            objOverlayContentPathBindings3 = obj3;
        }
        String strResolveContentBindingKey3 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "gpsTrackingEnabled") : null;
        if (strResolveContentBindingKey3 != null) {
            Object objResolveStateRef3 = StateLookupKt.resolveStateRef(strResolveContentBindingKey3, accumulatedState);
            if (objResolveStateRef3 != null) {
                BindingLoggerKt.logContentBinding("gpsTrackingEnabled", strResolveContentBindingKey3, objResolveStateRef3);
                Object objUnwrapForCoercion3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                if ((objUnwrapForCoercion3 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion3) && AbstractC22676k.m65745e(accumulatedState.get(obj8), Boolean.TRUE)) {
                    objOverlayContentPathBindings3 = null;
                } else {
                    objOverlayContentPathBindings3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                    if (objOverlayContentPathBindings3 == null) {
                        objOverlayContentPathBindings3 = null;
                    } else if (objOverlayContentPathBindings3 instanceof JsonElement) {
                        JsonElement jsonElement3 = (JsonElement) objOverlayContentPathBindings3;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonElement3);
                        } catch (Exception unused5) {
                            objOverlayContentPathBindings3 = null;
                        }
                    } else if (!(objOverlayContentPathBindings3 instanceof Boolean)) {
                        if (objOverlayContentPathBindings3 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a3 = AbstractC22671h0.m65688a(Boolean.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings3 = (Boolean) Integer.valueOf(((Number) objOverlayContentPathBindings3).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings3 = (Boolean) Long.valueOf(((Number) objOverlayContentPathBindings3).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings3 = (Boolean) Double.valueOf(((Number) objOverlayContentPathBindings3).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings3 = (Boolean) Float.valueOf(((Number) objOverlayContentPathBindings3).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings3 = (Boolean) Short.valueOf(((Number) objOverlayContentPathBindings3).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings3 = (Boolean) Byte.valueOf(((Number) objOverlayContentPathBindings3).byteValue());
                            } else {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else if (objOverlayContentPathBindings3 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings3);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonPrimitiveM1841c3);
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
                        objOverlayContentPathBindings3 = gpsTrackingEnabled;
                    }
                }
            }
        } else if (objOverlayContentPathBindings3 != null) {
            objOverlayContentPathBindings3 = ContentPathBindingsKt.overlayContentPathBindings(map, "gpsTrackingEnabled", accumulatedState, objOverlayContentPathBindings3, b.f124498w, c.f124500w);
        }
        Boolean bool = (Boolean) DotPathBindingsKt.overlayAggregateBinding(map2, "gpsTrackingEnabled", accumulatedState, objOverlayContentPathBindings3, "gpsTrackingEnabled", d.f124502w, e.f124504w, f.f124505w);
        Object destination = preSessionWidgetModel.getDestination();
        if (destination == null) {
            objOverlayContentPathBindings4 = null;
        } else {
            if (destination instanceof WithGeneratedBindings) {
                Object objBind4 = ((WithGeneratedBindings) destination).bind(accumulatedState);
                if (!(objBind4 instanceof C9598e)) {
                    objBind4 = null;
                }
                obj4 = (C9598e) objBind4;
                if (obj4 == null) {
                    obj4 = destination;
                }
            } else if (destination instanceof List) {
                Iterable iterable4 = (Iterable) destination;
                ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(iterable4, 10));
                for (Object obj10 : iterable4) {
                    WithGeneratedBindings withGeneratedBindings4 = obj10 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj10 : null;
                    if (withGeneratedBindings4 != null && (withGeneratedBindingsBind4 = withGeneratedBindings4.bind(accumulatedState)) != null) {
                        obj10 = withGeneratedBindingsBind4;
                    }
                    arrayList4.add(obj10);
                }
                obj4 = (C9598e) arrayList4;
            } else {
                obj4 = destination;
            }
            objOverlayContentPathBindings4 = obj4;
        }
        String strResolveContentBindingKey4 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "destination") : null;
        if (strResolveContentBindingKey4 != null) {
            Object objResolveStateRef4 = StateLookupKt.resolveStateRef(strResolveContentBindingKey4, accumulatedState);
            if (objResolveStateRef4 != null) {
                BindingLoggerKt.logContentBinding("destination", strResolveContentBindingKey4, objResolveStateRef4);
                Object objUnwrapForCoercion4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                if ((objUnwrapForCoercion4 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion4) && AbstractC22676k.m65745e(accumulatedState.get(obj8), Boolean.TRUE)) {
                    objOverlayContentPathBindings4 = null;
                } else {
                    objOverlayContentPathBindings4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                    if (objOverlayContentPathBindings4 == null) {
                        objOverlayContentPathBindings4 = null;
                    } else if (objOverlayContentPathBindings4 instanceof JsonElement) {
                        try {
                            objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().m1834e(), AbstractC22671h0.m65688a(C9598e.class)), (JsonElement) objOverlayContentPathBindings4);
                        } catch (Exception unused7) {
                            objOverlayContentPathBindings4 = null;
                        }
                    } else if (!(objOverlayContentPathBindings4 instanceof C9598e)) {
                        if (objOverlayContentPathBindings4 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a4 = AbstractC22671h0.m65688a(C9598e.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings4 = (C9598e) Integer.valueOf(((Number) objOverlayContentPathBindings4).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings4 = (C9598e) Long.valueOf(((Number) objOverlayContentPathBindings4).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings4 = (C9598e) Double.valueOf(((Number) objOverlayContentPathBindings4).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings4 = (C9598e) Float.valueOf(((Number) objOverlayContentPathBindings4).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings4 = (C9598e) Short.valueOf(((Number) objOverlayContentPathBindings4).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings4 = (C9598e) Byte.valueOf(((Number) objOverlayContentPathBindings4).byteValue());
                            } else {
                                objOverlayContentPathBindings4 = null;
                            }
                        } else if (objOverlayContentPathBindings4 instanceof String) {
                            try {
                                objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().m1834e(), AbstractC22671h0.m65688a(C9598e.class)), AbstractC0770m.m1841c((String) objOverlayContentPathBindings4));
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
                        objOverlayContentPathBindings4 = destination;
                    }
                }
            }
        } else if (objOverlayContentPathBindings4 != null) {
            objOverlayContentPathBindings4 = ContentPathBindingsKt.overlayContentPathBindings(map, "destination", accumulatedState, objOverlayContentPathBindings4, g.f124506w, h.f124507w);
        }
        C9598e c9598e = (C9598e) DotPathBindingsKt.overlayAggregateBinding(map2, "destination", accumulatedState, objOverlayContentPathBindings4, "destination", i.f124508w, j.f124509w, l.f124511w);
        Map<String, String> stateKeys = preSessionWidgetModel.getStateKeys();
        if (stateKeys == null) {
            objOverlayContentPathBindings5 = null;
        } else {
            if (stateKeys instanceof WithGeneratedBindings) {
                WithGeneratedBindings withGeneratedBindingsBind6 = ((WithGeneratedBindings) stateKeys).bind(accumulatedState);
                if (!(withGeneratedBindingsBind6 instanceof Map)) {
                    withGeneratedBindingsBind6 = null;
                }
                map3 = (Map) withGeneratedBindingsBind6;
                if (map3 == null) {
                    map3 = stateKeys;
                }
            } else if (stateKeys instanceof List) {
                Iterable iterable5 = (Iterable) stateKeys;
                List arrayList5 = new ArrayList(AbstractC25267u.m74163i0(iterable5, 10));
                for (Object obj11 : iterable5) {
                    WithGeneratedBindings withGeneratedBindings5 = obj11 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj11 : null;
                    if (withGeneratedBindings5 != null && (withGeneratedBindingsBind5 = withGeneratedBindings5.bind(accumulatedState)) != null) {
                        obj11 = withGeneratedBindingsBind5;
                    }
                    arrayList5.add(obj11);
                }
                map3 = (Map) arrayList5;
            } else {
                map3 = stateKeys;
            }
            objOverlayContentPathBindings5 = map3;
        }
        String strResolveContentBindingKey5 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "stateKeys") : null;
        if (strResolveContentBindingKey5 != null) {
            Object objResolveStateRef5 = StateLookupKt.resolveStateRef(strResolveContentBindingKey5, accumulatedState);
            if (objResolveStateRef5 != null) {
                BindingLoggerKt.logContentBinding("stateKeys", strResolveContentBindingKey5, objResolveStateRef5);
                Object objUnwrapForCoercion5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                if ((objUnwrapForCoercion5 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion5) && AbstractC22676k.m65745e(accumulatedState.get(obj8), Boolean.TRUE)) {
                    objOverlayContentPathBindings5 = null;
                } else {
                    objOverlayContentPathBindings5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                    if (objOverlayContentPathBindings5 == null) {
                        objOverlayContentPathBindings5 = null;
                    } else if (objOverlayContentPathBindings5 instanceof JsonElement) {
                        JsonElement jsonElement4 = (JsonElement) objOverlayContentPathBindings5;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            StringSerializer stringSerializer = StringSerializer.INSTANCE;
                            objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer, stringSerializer), jsonElement4);
                        } catch (Exception unused9) {
                            objOverlayContentPathBindings5 = null;
                        }
                    } else if (!(objOverlayContentPathBindings5 instanceof Map)) {
                        if (objOverlayContentPathBindings5 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a5 = AbstractC22671h0.m65688a(Map.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings5 = (Map) Integer.valueOf(((Number) objOverlayContentPathBindings5).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings5 = (Map) Long.valueOf(((Number) objOverlayContentPathBindings5).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings5 = (Map) Double.valueOf(((Number) objOverlayContentPathBindings5).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings5 = (Map) Float.valueOf(((Number) objOverlayContentPathBindings5).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings5 = (Map) Short.valueOf(((Number) objOverlayContentPathBindings5).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings5 = (Map) Byte.valueOf(((Number) objOverlayContentPathBindings5).byteValue());
                            } else {
                                objOverlayContentPathBindings5 = null;
                            }
                        } else if (objOverlayContentPathBindings5 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c4 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings5);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                StringSerializer stringSerializer2 = StringSerializer.INSTANCE;
                                objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer2, stringSerializer2), jsonPrimitiveM1841c4);
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
                        objOverlayContentPathBindings5 = stateKeys;
                    }
                }
            }
        } else if (objOverlayContentPathBindings5 != null) {
            objOverlayContentPathBindings5 = ContentPathBindingsKt.overlayContentPathBindings(map, "stateKeys", accumulatedState, objOverlayContentPathBindings5, m.f124512w, n.f124513w);
        }
        Map map4 = (Map) DotPathBindingsKt.overlayAggregateBinding(map2, "stateKeys", accumulatedState, objOverlayContentPathBindings5, "stateKeys", o.f124514w, p.f124515w, q.f124516w);
        AnyModal modal = preSessionWidgetModel.getModal();
        if (modal == null) {
            obj5 = null;
        } else {
            WithGeneratedBindings withGeneratedBindingsBind7 = modal.bind(accumulatedState);
            if (!(withGeneratedBindingsBind7 instanceof AnyModal)) {
                withGeneratedBindingsBind7 = null;
            }
            AnyModal anyModal = (AnyModal) withGeneratedBindingsBind7;
            if (anyModal == null) {
                anyModal = modal;
            }
            obj5 = anyModal;
        }
        String strResolveContentBindingKey6 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "modal") : null;
        if (strResolveContentBindingKey6 != null) {
            Object objResolveStateRef6 = StateLookupKt.resolveStateRef(strResolveContentBindingKey6, accumulatedState);
            if (objResolveStateRef6 != null) {
                BindingLoggerKt.logContentBinding("modal", strResolveContentBindingKey6, objResolveStateRef6);
                Object objUnwrapForCoercion6 = BindCoercionKt.unwrapForCoercion(objResolveStateRef6);
                if ((objUnwrapForCoercion6 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion6) && AbstractC22676k.m65745e(accumulatedState.get(obj8), Boolean.TRUE)) {
                    obj5 = null;
                } else {
                    Object objUnwrapForCoercion7 = BindCoercionKt.unwrapForCoercion(objResolveStateRef6);
                    if (objUnwrapForCoercion7 == null) {
                        objOverlayContentPathBindings6 = null;
                    } else if (objUnwrapForCoercion7 instanceof JsonElement) {
                        JsonElement jsonElement5 = (JsonElement) objUnwrapForCoercion7;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings6 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AnyModal.INSTANCE.serializer(), jsonElement5);
                        } catch (Exception unused11) {
                            objOverlayContentPathBindings6 = null;
                        }
                    } else if (objUnwrapForCoercion7 instanceof AnyModal) {
                        objOverlayContentPathBindings6 = objUnwrapForCoercion7;
                    } else {
                        if (objUnwrapForCoercion7 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a6 = AbstractC22671h0.m65688a(AnyModal.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings6 = (AnyModal) Integer.valueOf(((Number) objUnwrapForCoercion7).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings6 = (AnyModal) Long.valueOf(((Number) objUnwrapForCoercion7).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings6 = (AnyModal) Double.valueOf(((Number) objUnwrapForCoercion7).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings6 = (AnyModal) Float.valueOf(((Number) objUnwrapForCoercion7).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings6 = (AnyModal) Short.valueOf(((Number) objUnwrapForCoercion7).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings6 = (AnyModal) Byte.valueOf(((Number) objUnwrapForCoercion7).byteValue());
                            }
                        } else if (objUnwrapForCoercion7 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c5 = AbstractC0770m.m1841c((String) objUnwrapForCoercion7);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objUnwrapForCoercion7 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AnyModal.INSTANCE.serializer(), jsonPrimitiveM1841c5);
                            } catch (Exception unused12) {
                                objUnwrapForCoercion7 = null;
                            }
                            if (objUnwrapForCoercion7 != null) {
                                objOverlayContentPathBindings6 = objUnwrapForCoercion7;
                            }
                        }
                        objOverlayContentPathBindings6 = null;
                    }
                    obj5 = objOverlayContentPathBindings6 == null ? modal : objOverlayContentPathBindings6;
                }
            }
        } else if (obj5 != null) {
            objOverlayContentPathBindings6 = ContentPathBindingsKt.overlayContentPathBindings(map, "modal", accumulatedState, obj5, r.f124517w, s.f124518w);
        }
        return (PreSessionWidgetModel) ContentBindingResolverKt.copyBindingsFrom(new PreSessionWidgetModel(str, str2, bool, c9598e, map4, (AnyModal) DotPathBindingsKt.overlayAggregateBinding(map2, "modal", accumulatedState, obj5, "modal", t.f124519w, u.f124520w, w.f124522w)), preSessionWidgetModel);
    }
}
