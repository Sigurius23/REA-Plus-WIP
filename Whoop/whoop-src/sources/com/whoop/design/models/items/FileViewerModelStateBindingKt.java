package com.whoop.design.models.items;

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
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.EnumSerializer;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001aL\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0003¨\u0006\t"}, m65681d2 = {"generatedBind", "Lcom/whoop/design/models/items/FileViewerModel;", "contentBinding", "", "", "aggregateBindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "accumulatedState", "", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class FileViewerModelStateBindingKt {
    /* JADX WARN: Code duplicated, block: B:128:0x0222  */
    /* JADX WARN: Code duplicated, block: B:147:0x0262  */
    /* JADX WARN: Code duplicated, block: B:220:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:239:0x0410  */
    /* JADX WARN: Code duplicated, block: B:312:0x057e  */
    /* JADX WARN: Code duplicated, block: B:331:0x05be  */
    /* JADX WARN: Code duplicated, block: B:404:0x072c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:423:0x076c  */
    /* JADX WARN: Code duplicated, block: B:496:0x08da  */
    /* JADX WARN: Code duplicated, block: B:515:0x091a  */
    /* JADX WARN: Code duplicated, block: B:588:0x0a88  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:614:0x0aef A[PHI: r4
      0x0aef: PHI (r4v78 java.lang.Object) = (r4v54 java.lang.Object), (r4v58 java.lang.Object) binds: [B:613:0x0aed, B:641:0x0bb3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final FileViewerModel generatedBind(FileViewerModel fileViewerModel, Map<String, String> map, Map<String, AggregateBinding> map2, Map<String, ? extends Object> accumulatedState) {
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
        Object obj7;
        WithGeneratedBindings withGeneratedBindingsBind5;
        Object objOverlayContentPathBindings5;
        Object obj8;
        Object obj9;
        WithGeneratedBindings withGeneratedBindingsBind6;
        Object objOverlayContentPathBindings6;
        Object obj10;
        Object obj11;
        WithGeneratedBindings withGeneratedBindingsBind7;
        Object obj12;
        Object objOverlayContentPathBindings7;
        AbstractC22676k.m65750j(fileViewerModel, "<this>");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        if ((map == null || map.isEmpty()) && ((map2 == null || map2.isEmpty()) && accumulatedState.isEmpty())) {
            return fileViewerModel;
        }
        Object fileUrl = fileViewerModel.getFileUrl();
        if (fileUrl == null) {
            objOverlayContentPathBindings = null;
        } else if (fileUrl instanceof WithGeneratedBindings) {
            Object objBind = ((WithGeneratedBindings) fileUrl).bind(accumulatedState);
            if (!(objBind instanceof String)) {
                objBind = null;
            }
            objOverlayContentPathBindings = (String) objBind;
            if (objOverlayContentPathBindings == null) {
                objOverlayContentPathBindings = fileUrl;
            }
        } else if (fileUrl instanceof List) {
            Iterable iterable = (Iterable) fileUrl;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
            for (Object obj13 : iterable) {
                WithGeneratedBindings withGeneratedBindings = obj13 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj13 : null;
                if (withGeneratedBindings != null && (withGeneratedBindingsBind = withGeneratedBindings.bind(accumulatedState)) != null) {
                    obj13 = withGeneratedBindingsBind;
                }
                arrayList.add(obj13);
            }
            objOverlayContentPathBindings = (String) arrayList;
        } else {
            objOverlayContentPathBindings = fileUrl;
        }
        String strResolveContentBindingKey = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "fileUrl") : null;
        Class cls = Byte.TYPE;
        Class cls2 = Short.TYPE;
        Class cls3 = Float.TYPE;
        Class cls4 = Double.TYPE;
        Class cls5 = Long.TYPE;
        Class cls6 = Integer.TYPE;
        if (strResolveContentBindingKey != null) {
            Object objResolveStateRef = StateLookupKt.resolveStateRef(strResolveContentBindingKey, accumulatedState);
            if (objResolveStateRef != null) {
                BindingLoggerKt.logContentBinding("fileUrl", strResolveContentBindingKey, objResolveStateRef);
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
                        objOverlayContentPathBindings = fileUrl;
                    }
                }
            }
        } else if (objOverlayContentPathBindings != null) {
            objOverlayContentPathBindings = ContentPathBindingsKt.overlayContentPathBindings(map, "fileUrl", accumulatedState, objOverlayContentPathBindings, new Function1() { // from class: com.whoop.design.models.items.FileViewerModelStateBindingKt$generatedBind$$inlined$resolveBinding$1
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj14) {
                    return invoke((String) obj14);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(String v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(StringSerializer.INSTANCE, v13);
                    } catch (Exception unused3) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.FileViewerModelStateBindingKt$generatedBind$$inlined$resolveBinding$2
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
                @Override // p715kotlin.jvm.functions.Function1
                public final String invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                    } catch (Exception unused3) {
                        return null;
                    }
                }
            });
        }
        String fileUrl2 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "fileUrl", accumulatedState, objOverlayContentPathBindings, "fileUrl", new Function1() { // from class: com.whoop.design.models.items.FileViewerModelStateBindingKt$generatedBind$$inlined$resolveBinding$3
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj14) {
                return invoke((String) obj14);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(String str) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, str, interfaceC37138cM122336d);
                } catch (Exception unused3) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.FileViewerModelStateBindingKt$generatedBind$$inlined$resolveBinding$4
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                } catch (Exception unused3) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.FileViewerModelStateBindingKt$generatedBind$$inlined$resolveBinding$5
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj14) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj14);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement2 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement2);
                    } catch (Exception unused3) {
                        return null;
                    }
                }
                boolean z13 = UnwrapForCoercion instanceof String;
                if (z13) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!z13) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c2 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c2);
                    } catch (Exception unused4) {
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
        });
        if (fileUrl2 == null) {
            fileUrl2 = fileViewerModel.getFileUrl();
        }
        String str = fileUrl2;
        Object urlType = fileViewerModel.getUrlType();
        if (urlType == null) {
            objOverlayContentPathBindings2 = null;
        } else {
            if (urlType instanceof WithGeneratedBindings) {
                Object objBind2 = ((WithGeneratedBindings) urlType).bind(accumulatedState);
                if (!(objBind2 instanceof FileViewerModel.FileUrlType)) {
                    objBind2 = null;
                }
                obj = (FileViewerModel.FileUrlType) objBind2;
                if (obj == null) {
                    obj = urlType;
                }
            } else if (urlType instanceof List) {
                Iterable iterable2 = (Iterable) urlType;
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(iterable2, 10));
                for (Object obj14 : iterable2) {
                    WithGeneratedBindings withGeneratedBindings2 = obj14 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj14 : null;
                    if (withGeneratedBindings2 != null && (withGeneratedBindingsBind2 = withGeneratedBindings2.bind(accumulatedState)) != null) {
                        obj14 = withGeneratedBindingsBind2;
                    }
                    arrayList2.add(obj14);
                }
                obj = (FileViewerModel.FileUrlType) arrayList2;
            } else {
                obj = urlType;
            }
            objOverlayContentPathBindings2 = obj;
        }
        String strResolveContentBindingKey2 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "urlType") : null;
        if (strResolveContentBindingKey2 != null) {
            Object objResolveStateRef2 = StateLookupKt.resolveStateRef(strResolveContentBindingKey2, accumulatedState);
            if (objResolveStateRef2 != null) {
                BindingLoggerKt.logContentBinding("urlType", strResolveContentBindingKey2, objResolveStateRef2);
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
                        objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.FileUrlType", FileViewerModel.FileUrlType.values()), jsonElement2);
                    } catch (Exception unused3) {
                        objOverlayContentPathBindings2 = null;
                    }
                } else if (!(objOverlayContentPathBindings2 instanceof FileViewerModel.FileUrlType)) {
                    if (objOverlayContentPathBindings2 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a2 = AbstractC22671h0.m65688a(FileViewerModel.FileUrlType.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings2 = (FileViewerModel.FileUrlType) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings2 = (FileViewerModel.FileUrlType) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings2 = (FileViewerModel.FileUrlType) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings2 = (FileViewerModel.FileUrlType) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings2 = (FileViewerModel.FileUrlType) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings2 = (FileViewerModel.FileUrlType) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                        } else {
                            objOverlayContentPathBindings2 = null;
                        }
                    } else if (objOverlayContentPathBindings2 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c2 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings2);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.FileUrlType", FileViewerModel.FileUrlType.values()), jsonPrimitiveM1841c2);
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
                    objOverlayContentPathBindings2 = urlType;
                }
            } else {
                obj2 = ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY;
            }
        } else {
            obj2 = ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY;
            if (objOverlayContentPathBindings2 != null) {
                objOverlayContentPathBindings2 = ContentPathBindingsKt.overlayContentPathBindings(map, "urlType", accumulatedState, objOverlayContentPathBindings2, new Function1() { // from class: com.whoop.design.models.items.FileViewerModelStateBindingKt$generatedBind$$inlined$resolveBinding$6
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj15) {
                        return invoke((FileViewerModel.FileUrlType) obj15);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(FileViewerModel.FileUrlType v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            EnumSerializer enumSerializer = new EnumSerializer("com.whoop.design.models.items.FileViewerModel.FileUrlType", FileViewerModel.FileUrlType.values());
                            AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                            stateBindingJson.getClass();
                            return AbstractC12313p.m34290h0(stateBindingJson, v13, enumSerializer);
                        } catch (Exception unused5) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.FileViewerModelStateBindingKt$generatedBind$$inlined$resolveBinding$7
                    /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.design.models.items.FileViewerModel$FileUrlType, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final FileViewerModel.FileUrlType invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.FileUrlType", FileViewerModel.FileUrlType.values()), json);
                        } catch (Exception unused5) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj15 = obj2;
        FileViewerModel.FileUrlType urlType2 = (FileViewerModel.FileUrlType) DotPathBindingsKt.overlayAggregateBinding(map2, "urlType", accumulatedState, objOverlayContentPathBindings2, "urlType", new Function1() { // from class: com.whoop.design.models.items.FileViewerModelStateBindingKt$generatedBind$$inlined$resolveBinding$8
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj16) {
                return invoke((FileViewerModel.FileUrlType) obj16);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(FileViewerModel.FileUrlType fileUrlType) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.FileUrlType", FileViewerModel.FileUrlType.values()));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, fileUrlType, interfaceC37138cM122336d);
                } catch (Exception unused5) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.FileViewerModelStateBindingKt$generatedBind$$inlined$resolveBinding$9
            /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.design.models.items.FileViewerModel$FileUrlType, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final FileViewerModel.FileUrlType invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.FileUrlType", FileViewerModel.FileUrlType.values()), json);
                } catch (Exception unused5) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.FileViewerModelStateBindingKt$generatedBind$$inlined$resolveBinding$10
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.items.FileViewerModel$FileUrlType, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.items.FileViewerModel$FileUrlType, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final FileViewerModel.FileUrlType invoke(Object obj16) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj16);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement3 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.FileUrlType", FileViewerModel.FileUrlType.values()), jsonElement3);
                    } catch (Exception unused5) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof FileViewerModel.FileUrlType) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.FileUrlType", FileViewerModel.FileUrlType.values()), jsonPrimitiveM1841c3);
                    } catch (Exception unused6) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(FileViewerModel.FileUrlType.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (FileViewerModel.FileUrlType) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (FileViewerModel.FileUrlType) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (FileViewerModel.FileUrlType) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (FileViewerModel.FileUrlType) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (FileViewerModel.FileUrlType) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (FileViewerModel.FileUrlType) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        if (urlType2 == null) {
            urlType2 = fileViewerModel.getUrlType();
        }
        FileViewerModel.FileUrlType fileUrlType = urlType2;
        Object fileType = fileViewerModel.getFileType();
        if (fileType == null) {
            objOverlayContentPathBindings3 = null;
        } else {
            if (fileType instanceof WithGeneratedBindings) {
                Object objBind3 = ((WithGeneratedBindings) fileType).bind(accumulatedState);
                if (!(objBind3 instanceof FileViewerModel.FileType)) {
                    objBind3 = null;
                }
                obj3 = (FileViewerModel.FileType) objBind3;
                if (obj3 == null) {
                    obj3 = fileType;
                }
            } else if (fileType instanceof List) {
                Iterable iterable3 = (Iterable) fileType;
                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(iterable3, 10));
                for (Object obj16 : iterable3) {
                    WithGeneratedBindings withGeneratedBindings3 = obj16 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj16 : null;
                    if (withGeneratedBindings3 != null && (withGeneratedBindingsBind3 = withGeneratedBindings3.bind(accumulatedState)) != null) {
                        obj16 = withGeneratedBindingsBind3;
                    }
                    arrayList3.add(obj16);
                }
                obj3 = (FileViewerModel.FileType) arrayList3;
            } else {
                obj3 = fileType;
            }
            objOverlayContentPathBindings3 = obj3;
        }
        String strResolveContentBindingKey3 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "fileType") : null;
        if (strResolveContentBindingKey3 != null) {
            Object objResolveStateRef3 = StateLookupKt.resolveStateRef(strResolveContentBindingKey3, accumulatedState);
            if (objResolveStateRef3 != null) {
                BindingLoggerKt.logContentBinding("fileType", strResolveContentBindingKey3, objResolveStateRef3);
                Object objUnwrapForCoercion3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                if ((objUnwrapForCoercion3 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion3)) {
                    obj4 = obj15;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj4), Boolean.TRUE)) {
                        objOverlayContentPathBindings3 = null;
                    }
                } else {
                    obj4 = obj15;
                }
                objOverlayContentPathBindings3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                if (objOverlayContentPathBindings3 == null) {
                    objOverlayContentPathBindings3 = null;
                } else if (objOverlayContentPathBindings3 instanceof JsonElement) {
                    JsonElement jsonElement3 = (JsonElement) objOverlayContentPathBindings3;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.FileType", FileViewerModel.FileType.values()), jsonElement3);
                    } catch (Exception unused5) {
                        objOverlayContentPathBindings3 = null;
                    }
                } else if (!(objOverlayContentPathBindings3 instanceof FileViewerModel.FileType)) {
                    if (objOverlayContentPathBindings3 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a3 = AbstractC22671h0.m65688a(FileViewerModel.FileType.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings3 = (FileViewerModel.FileType) Integer.valueOf(((Number) objOverlayContentPathBindings3).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings3 = (FileViewerModel.FileType) Long.valueOf(((Number) objOverlayContentPathBindings3).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings3 = (FileViewerModel.FileType) Double.valueOf(((Number) objOverlayContentPathBindings3).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings3 = (FileViewerModel.FileType) Float.valueOf(((Number) objOverlayContentPathBindings3).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings3 = (FileViewerModel.FileType) Short.valueOf(((Number) objOverlayContentPathBindings3).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings3 = (FileViewerModel.FileType) Byte.valueOf(((Number) objOverlayContentPathBindings3).byteValue());
                        } else {
                            objOverlayContentPathBindings3 = null;
                        }
                    } else if (objOverlayContentPathBindings3 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings3);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.FileType", FileViewerModel.FileType.values()), jsonPrimitiveM1841c3);
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
                    objOverlayContentPathBindings3 = fileType;
                }
            } else {
                obj4 = obj15;
            }
        } else {
            obj4 = obj15;
            if (objOverlayContentPathBindings3 != null) {
                objOverlayContentPathBindings3 = ContentPathBindingsKt.overlayContentPathBindings(map, "fileType", accumulatedState, objOverlayContentPathBindings3, new Function1() { // from class: com.whoop.design.models.items.FileViewerModelStateBindingKt$generatedBind$$inlined$resolveBinding$11
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj17) {
                        return invoke((FileViewerModel.FileType) obj17);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(FileViewerModel.FileType v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            EnumSerializer enumSerializer = new EnumSerializer("com.whoop.design.models.items.FileViewerModel.FileType", FileViewerModel.FileType.values());
                            AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                            stateBindingJson.getClass();
                            return AbstractC12313p.m34290h0(stateBindingJson, v13, enumSerializer);
                        } catch (Exception unused7) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.FileViewerModelStateBindingKt$generatedBind$$inlined$resolveBinding$12
                    /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.design.models.items.FileViewerModel$FileType, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final FileViewerModel.FileType invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.FileType", FileViewerModel.FileType.values()), json);
                        } catch (Exception unused7) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj17 = obj4;
        FileViewerModel.FileType fileType2 = (FileViewerModel.FileType) DotPathBindingsKt.overlayAggregateBinding(map2, "fileType", accumulatedState, objOverlayContentPathBindings3, "fileType", new Function1() { // from class: com.whoop.design.models.items.FileViewerModelStateBindingKt$generatedBind$$inlined$resolveBinding$13
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj18) {
                return invoke((FileViewerModel.FileType) obj18);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(FileViewerModel.FileType fileType3) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.FileType", FileViewerModel.FileType.values()));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, fileType3, interfaceC37138cM122336d);
                } catch (Exception unused7) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.FileViewerModelStateBindingKt$generatedBind$$inlined$resolveBinding$14
            /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.design.models.items.FileViewerModel$FileType, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final FileViewerModel.FileType invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.FileType", FileViewerModel.FileType.values()), json);
                } catch (Exception unused7) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.FileViewerModelStateBindingKt$generatedBind$$inlined$resolveBinding$15
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.items.FileViewerModel$FileType, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.items.FileViewerModel$FileType, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final FileViewerModel.FileType invoke(Object obj18) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj18);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement4 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.FileType", FileViewerModel.FileType.values()), jsonElement4);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof FileViewerModel.FileType) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c4 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.FileType", FileViewerModel.FileType.values()), jsonPrimitiveM1841c4);
                    } catch (Exception unused8) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(FileViewerModel.FileType.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (FileViewerModel.FileType) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (FileViewerModel.FileType) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (FileViewerModel.FileType) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (FileViewerModel.FileType) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (FileViewerModel.FileType) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (FileViewerModel.FileType) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        if (fileType2 == null) {
            fileType2 = fileViewerModel.getFileType();
        }
        FileViewerModel.FileType fileType3 = fileType2;
        Object scaling = fileViewerModel.getScaling();
        if (scaling == null) {
            objOverlayContentPathBindings4 = null;
        } else {
            if (scaling instanceof WithGeneratedBindings) {
                Object objBind4 = ((WithGeneratedBindings) scaling).bind(accumulatedState);
                if (!(objBind4 instanceof FileViewerModel.Scaling)) {
                    objBind4 = null;
                }
                obj5 = (FileViewerModel.Scaling) objBind4;
                if (obj5 == null) {
                    obj5 = scaling;
                }
            } else if (scaling instanceof List) {
                Iterable iterable4 = (Iterable) scaling;
                ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(iterable4, 10));
                for (Object obj18 : iterable4) {
                    WithGeneratedBindings withGeneratedBindings4 = obj18 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj18 : null;
                    if (withGeneratedBindings4 != null && (withGeneratedBindingsBind4 = withGeneratedBindings4.bind(accumulatedState)) != null) {
                        obj18 = withGeneratedBindingsBind4;
                    }
                    arrayList4.add(obj18);
                }
                obj5 = (FileViewerModel.Scaling) arrayList4;
            } else {
                obj5 = scaling;
            }
            objOverlayContentPathBindings4 = obj5;
        }
        String strResolveContentBindingKey4 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "scaling") : null;
        if (strResolveContentBindingKey4 != null) {
            Object objResolveStateRef4 = StateLookupKt.resolveStateRef(strResolveContentBindingKey4, accumulatedState);
            if (objResolveStateRef4 != null) {
                BindingLoggerKt.logContentBinding("scaling", strResolveContentBindingKey4, objResolveStateRef4);
                Object objUnwrapForCoercion4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                if ((objUnwrapForCoercion4 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion4)) {
                    obj6 = obj17;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj6), Boolean.TRUE)) {
                        objOverlayContentPathBindings4 = null;
                    }
                } else {
                    obj6 = obj17;
                }
                objOverlayContentPathBindings4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                if (objOverlayContentPathBindings4 == null) {
                    objOverlayContentPathBindings4 = null;
                } else if (objOverlayContentPathBindings4 instanceof JsonElement) {
                    JsonElement jsonElement4 = (JsonElement) objOverlayContentPathBindings4;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.Scaling", FileViewerModel.Scaling.values()), jsonElement4);
                    } catch (Exception unused7) {
                        objOverlayContentPathBindings4 = null;
                    }
                } else if (!(objOverlayContentPathBindings4 instanceof FileViewerModel.Scaling)) {
                    if (objOverlayContentPathBindings4 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a4 = AbstractC22671h0.m65688a(FileViewerModel.Scaling.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings4 = (FileViewerModel.Scaling) Integer.valueOf(((Number) objOverlayContentPathBindings4).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings4 = (FileViewerModel.Scaling) Long.valueOf(((Number) objOverlayContentPathBindings4).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings4 = (FileViewerModel.Scaling) Double.valueOf(((Number) objOverlayContentPathBindings4).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings4 = (FileViewerModel.Scaling) Float.valueOf(((Number) objOverlayContentPathBindings4).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings4 = (FileViewerModel.Scaling) Short.valueOf(((Number) objOverlayContentPathBindings4).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings4 = (FileViewerModel.Scaling) Byte.valueOf(((Number) objOverlayContentPathBindings4).byteValue());
                        } else {
                            objOverlayContentPathBindings4 = null;
                        }
                    } else if (objOverlayContentPathBindings4 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c4 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings4);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.Scaling", FileViewerModel.Scaling.values()), jsonPrimitiveM1841c4);
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
                    objOverlayContentPathBindings4 = scaling;
                }
            } else {
                obj6 = obj17;
            }
        } else {
            obj6 = obj17;
            if (objOverlayContentPathBindings4 != null) {
                objOverlayContentPathBindings4 = ContentPathBindingsKt.overlayContentPathBindings(map, "scaling", accumulatedState, objOverlayContentPathBindings4, new Function1() { // from class: com.whoop.design.models.items.FileViewerModelStateBindingKt$generatedBind$$inlined$resolveBinding$16
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj19) {
                        return invoke((FileViewerModel.Scaling) obj19);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(FileViewerModel.Scaling v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            EnumSerializer enumSerializer = new EnumSerializer("com.whoop.design.models.items.FileViewerModel.Scaling", FileViewerModel.Scaling.values());
                            AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                            stateBindingJson.getClass();
                            return AbstractC12313p.m34290h0(stateBindingJson, v13, enumSerializer);
                        } catch (Exception unused9) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.FileViewerModelStateBindingKt$generatedBind$$inlined$resolveBinding$17
                    /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.design.models.items.FileViewerModel$Scaling, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final FileViewerModel.Scaling invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.Scaling", FileViewerModel.Scaling.values()), json);
                        } catch (Exception unused9) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj19 = obj6;
        FileViewerModel.Scaling scaling2 = (FileViewerModel.Scaling) DotPathBindingsKt.overlayAggregateBinding(map2, "scaling", accumulatedState, objOverlayContentPathBindings4, "scaling", new Function1() { // from class: com.whoop.design.models.items.FileViewerModelStateBindingKt$generatedBind$$inlined$resolveBinding$18
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj20) {
                return invoke((FileViewerModel.Scaling) obj20);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(FileViewerModel.Scaling scaling3) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.Scaling", FileViewerModel.Scaling.values()));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, scaling3, interfaceC37138cM122336d);
                } catch (Exception unused9) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.FileViewerModelStateBindingKt$generatedBind$$inlined$resolveBinding$19
            /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.design.models.items.FileViewerModel$Scaling, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final FileViewerModel.Scaling invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.Scaling", FileViewerModel.Scaling.values()), json);
                } catch (Exception unused9) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.FileViewerModelStateBindingKt$generatedBind$$inlined$resolveBinding$20
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.items.FileViewerModel$Scaling, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.items.FileViewerModel$Scaling, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final FileViewerModel.Scaling invoke(Object obj20) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj20);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement5 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.Scaling", FileViewerModel.Scaling.values()), jsonElement5);
                    } catch (Exception unused9) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof FileViewerModel.Scaling) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c5 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.Scaling", FileViewerModel.Scaling.values()), jsonPrimitiveM1841c5);
                    } catch (Exception unused10) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(FileViewerModel.Scaling.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (FileViewerModel.Scaling) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (FileViewerModel.Scaling) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (FileViewerModel.Scaling) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (FileViewerModel.Scaling) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (FileViewerModel.Scaling) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (FileViewerModel.Scaling) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        if (scaling2 == null) {
            scaling2 = fileViewerModel.getScaling();
        }
        FileViewerModel.Scaling scaling3 = scaling2;
        Object zoom = fileViewerModel.getZoom();
        if (zoom == null) {
            objOverlayContentPathBindings5 = null;
        } else {
            if (zoom instanceof WithGeneratedBindings) {
                Object objBind5 = ((WithGeneratedBindings) zoom).bind(accumulatedState);
                if (!(objBind5 instanceof FileViewerModel.Zoom)) {
                    objBind5 = null;
                }
                obj7 = (FileViewerModel.Zoom) objBind5;
                if (obj7 == null) {
                    obj7 = zoom;
                }
            } else if (zoom instanceof List) {
                Iterable iterable5 = (Iterable) zoom;
                ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(iterable5, 10));
                for (Object obj20 : iterable5) {
                    WithGeneratedBindings withGeneratedBindings5 = obj20 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj20 : null;
                    if (withGeneratedBindings5 != null && (withGeneratedBindingsBind5 = withGeneratedBindings5.bind(accumulatedState)) != null) {
                        obj20 = withGeneratedBindingsBind5;
                    }
                    arrayList5.add(obj20);
                }
                obj7 = (FileViewerModel.Zoom) arrayList5;
            } else {
                obj7 = zoom;
            }
            objOverlayContentPathBindings5 = obj7;
        }
        String strResolveContentBindingKey5 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "zoom") : null;
        if (strResolveContentBindingKey5 != null) {
            Object objResolveStateRef5 = StateLookupKt.resolveStateRef(strResolveContentBindingKey5, accumulatedState);
            if (objResolveStateRef5 != null) {
                BindingLoggerKt.logContentBinding("zoom", strResolveContentBindingKey5, objResolveStateRef5);
                Object objUnwrapForCoercion5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                if ((objUnwrapForCoercion5 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion5)) {
                    obj8 = obj19;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj8), Boolean.TRUE)) {
                        objOverlayContentPathBindings5 = null;
                    }
                } else {
                    obj8 = obj19;
                }
                objOverlayContentPathBindings5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                if (objOverlayContentPathBindings5 == null) {
                    objOverlayContentPathBindings5 = null;
                } else if (objOverlayContentPathBindings5 instanceof JsonElement) {
                    JsonElement jsonElement5 = (JsonElement) objOverlayContentPathBindings5;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.Zoom", FileViewerModel.Zoom.values()), jsonElement5);
                    } catch (Exception unused9) {
                        objOverlayContentPathBindings5 = null;
                    }
                } else if (!(objOverlayContentPathBindings5 instanceof FileViewerModel.Zoom)) {
                    if (objOverlayContentPathBindings5 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a5 = AbstractC22671h0.m65688a(FileViewerModel.Zoom.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings5 = (FileViewerModel.Zoom) Integer.valueOf(((Number) objOverlayContentPathBindings5).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings5 = (FileViewerModel.Zoom) Long.valueOf(((Number) objOverlayContentPathBindings5).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings5 = (FileViewerModel.Zoom) Double.valueOf(((Number) objOverlayContentPathBindings5).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings5 = (FileViewerModel.Zoom) Float.valueOf(((Number) objOverlayContentPathBindings5).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings5 = (FileViewerModel.Zoom) Short.valueOf(((Number) objOverlayContentPathBindings5).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings5 = (FileViewerModel.Zoom) Byte.valueOf(((Number) objOverlayContentPathBindings5).byteValue());
                        } else {
                            objOverlayContentPathBindings5 = null;
                        }
                    } else if (objOverlayContentPathBindings5 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c5 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings5);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.Zoom", FileViewerModel.Zoom.values()), jsonPrimitiveM1841c5);
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
                    objOverlayContentPathBindings5 = zoom;
                }
            } else {
                obj8 = obj19;
            }
        } else {
            obj8 = obj19;
            if (objOverlayContentPathBindings5 != null) {
                objOverlayContentPathBindings5 = ContentPathBindingsKt.overlayContentPathBindings(map, "zoom", accumulatedState, objOverlayContentPathBindings5, new Function1() { // from class: com.whoop.design.models.items.FileViewerModelStateBindingKt$generatedBind$$inlined$resolveBinding$21
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj21) {
                        return invoke((FileViewerModel.Zoom) obj21);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(FileViewerModel.Zoom v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            EnumSerializer enumSerializer = new EnumSerializer("com.whoop.design.models.items.FileViewerModel.Zoom", FileViewerModel.Zoom.values());
                            AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                            stateBindingJson.getClass();
                            return AbstractC12313p.m34290h0(stateBindingJson, v13, enumSerializer);
                        } catch (Exception unused11) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.FileViewerModelStateBindingKt$generatedBind$$inlined$resolveBinding$22
                    /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.design.models.items.FileViewerModel$Zoom, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final FileViewerModel.Zoom invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.Zoom", FileViewerModel.Zoom.values()), json);
                        } catch (Exception unused11) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj21 = obj8;
        FileViewerModel.Zoom zoom2 = (FileViewerModel.Zoom) DotPathBindingsKt.overlayAggregateBinding(map2, "zoom", accumulatedState, objOverlayContentPathBindings5, "zoom", new Function1() { // from class: com.whoop.design.models.items.FileViewerModelStateBindingKt$generatedBind$$inlined$resolveBinding$23
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj22) {
                return invoke((FileViewerModel.Zoom) obj22);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(FileViewerModel.Zoom zoom3) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.Zoom", FileViewerModel.Zoom.values()));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, zoom3, interfaceC37138cM122336d);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.FileViewerModelStateBindingKt$generatedBind$$inlined$resolveBinding$24
            /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.design.models.items.FileViewerModel$Zoom, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final FileViewerModel.Zoom invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.Zoom", FileViewerModel.Zoom.values()), json);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.FileViewerModelStateBindingKt$generatedBind$$inlined$resolveBinding$25
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.items.FileViewerModel$Zoom, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.items.FileViewerModel$Zoom, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final FileViewerModel.Zoom invoke(Object obj22) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj22);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement6 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.Zoom", FileViewerModel.Zoom.values()), jsonElement6);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof FileViewerModel.Zoom) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c6 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.Zoom", FileViewerModel.Zoom.values()), jsonPrimitiveM1841c6);
                    } catch (Exception unused12) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(FileViewerModel.Zoom.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (FileViewerModel.Zoom) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (FileViewerModel.Zoom) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (FileViewerModel.Zoom) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (FileViewerModel.Zoom) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (FileViewerModel.Zoom) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (FileViewerModel.Zoom) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        if (zoom2 == null) {
            zoom2 = fileViewerModel.getZoom();
        }
        FileViewerModel.Zoom zoom3 = zoom2;
        Object horizontalAlignment = fileViewerModel.getHorizontalAlignment();
        if (horizontalAlignment == null) {
            objOverlayContentPathBindings6 = null;
        } else {
            if (horizontalAlignment instanceof WithGeneratedBindings) {
                Object objBind6 = ((WithGeneratedBindings) horizontalAlignment).bind(accumulatedState);
                if (!(objBind6 instanceof FileViewerModel.HorizontalAlignment)) {
                    objBind6 = null;
                }
                obj9 = (FileViewerModel.HorizontalAlignment) objBind6;
                if (obj9 == null) {
                    obj9 = horizontalAlignment;
                }
            } else if (horizontalAlignment instanceof List) {
                Iterable iterable6 = (Iterable) horizontalAlignment;
                ArrayList arrayList6 = new ArrayList(AbstractC25267u.m74163i0(iterable6, 10));
                for (Object obj22 : iterable6) {
                    WithGeneratedBindings withGeneratedBindings6 = obj22 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj22 : null;
                    if (withGeneratedBindings6 != null && (withGeneratedBindingsBind6 = withGeneratedBindings6.bind(accumulatedState)) != null) {
                        obj22 = withGeneratedBindingsBind6;
                    }
                    arrayList6.add(obj22);
                }
                obj9 = (FileViewerModel.HorizontalAlignment) arrayList6;
            } else {
                obj9 = horizontalAlignment;
            }
            objOverlayContentPathBindings6 = obj9;
        }
        String strResolveContentBindingKey6 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "horizontalAlignment") : null;
        if (strResolveContentBindingKey6 != null) {
            Object objResolveStateRef6 = StateLookupKt.resolveStateRef(strResolveContentBindingKey6, accumulatedState);
            if (objResolveStateRef6 != null) {
                BindingLoggerKt.logContentBinding("horizontalAlignment", strResolveContentBindingKey6, objResolveStateRef6);
                Object objUnwrapForCoercion6 = BindCoercionKt.unwrapForCoercion(objResolveStateRef6);
                if ((objUnwrapForCoercion6 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion6)) {
                    obj10 = obj21;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj10), Boolean.TRUE)) {
                        objOverlayContentPathBindings6 = null;
                    }
                } else {
                    obj10 = obj21;
                }
                objOverlayContentPathBindings6 = BindCoercionKt.unwrapForCoercion(objResolveStateRef6);
                if (objOverlayContentPathBindings6 == null) {
                    objOverlayContentPathBindings6 = null;
                } else if (objOverlayContentPathBindings6 instanceof JsonElement) {
                    JsonElement jsonElement6 = (JsonElement) objOverlayContentPathBindings6;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings6 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.HorizontalAlignment", FileViewerModel.HorizontalAlignment.values()), jsonElement6);
                    } catch (Exception unused11) {
                        objOverlayContentPathBindings6 = null;
                    }
                } else if (!(objOverlayContentPathBindings6 instanceof FileViewerModel.HorizontalAlignment)) {
                    if (objOverlayContentPathBindings6 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a6 = AbstractC22671h0.m65688a(FileViewerModel.HorizontalAlignment.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings6 = (FileViewerModel.HorizontalAlignment) Integer.valueOf(((Number) objOverlayContentPathBindings6).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings6 = (FileViewerModel.HorizontalAlignment) Long.valueOf(((Number) objOverlayContentPathBindings6).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings6 = (FileViewerModel.HorizontalAlignment) Double.valueOf(((Number) objOverlayContentPathBindings6).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings6 = (FileViewerModel.HorizontalAlignment) Float.valueOf(((Number) objOverlayContentPathBindings6).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings6 = (FileViewerModel.HorizontalAlignment) Short.valueOf(((Number) objOverlayContentPathBindings6).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings6 = (FileViewerModel.HorizontalAlignment) Byte.valueOf(((Number) objOverlayContentPathBindings6).byteValue());
                        } else {
                            objOverlayContentPathBindings6 = null;
                        }
                    } else if (objOverlayContentPathBindings6 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c6 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings6);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings6 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.HorizontalAlignment", FileViewerModel.HorizontalAlignment.values()), jsonPrimitiveM1841c6);
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
                    objOverlayContentPathBindings6 = horizontalAlignment;
                }
            } else {
                obj10 = obj21;
            }
        } else {
            obj10 = obj21;
            if (objOverlayContentPathBindings6 != null) {
                objOverlayContentPathBindings6 = ContentPathBindingsKt.overlayContentPathBindings(map, "horizontalAlignment", accumulatedState, objOverlayContentPathBindings6, new Function1() { // from class: com.whoop.design.models.items.FileViewerModelStateBindingKt$generatedBind$$inlined$resolveBinding$26
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj23) {
                        return invoke((FileViewerModel.HorizontalAlignment) obj23);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(FileViewerModel.HorizontalAlignment v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            EnumSerializer enumSerializer = new EnumSerializer("com.whoop.design.models.items.FileViewerModel.HorizontalAlignment", FileViewerModel.HorizontalAlignment.values());
                            AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                            stateBindingJson.getClass();
                            return AbstractC12313p.m34290h0(stateBindingJson, v13, enumSerializer);
                        } catch (Exception unused13) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.FileViewerModelStateBindingKt$generatedBind$$inlined$resolveBinding$27
                    /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.design.models.items.FileViewerModel$HorizontalAlignment, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final FileViewerModel.HorizontalAlignment invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.HorizontalAlignment", FileViewerModel.HorizontalAlignment.values()), json);
                        } catch (Exception unused13) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj23 = obj10;
        FileViewerModel.HorizontalAlignment horizontalAlignment2 = (FileViewerModel.HorizontalAlignment) DotPathBindingsKt.overlayAggregateBinding(map2, "horizontalAlignment", accumulatedState, objOverlayContentPathBindings6, "horizontalAlignment", new Function1() { // from class: com.whoop.design.models.items.FileViewerModelStateBindingKt$generatedBind$$inlined$resolveBinding$28
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj24) {
                return invoke((FileViewerModel.HorizontalAlignment) obj24);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(FileViewerModel.HorizontalAlignment horizontalAlignment3) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.HorizontalAlignment", FileViewerModel.HorizontalAlignment.values()));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, horizontalAlignment3, interfaceC37138cM122336d);
                } catch (Exception unused13) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.FileViewerModelStateBindingKt$generatedBind$$inlined$resolveBinding$29
            /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.design.models.items.FileViewerModel$HorizontalAlignment, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final FileViewerModel.HorizontalAlignment invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.HorizontalAlignment", FileViewerModel.HorizontalAlignment.values()), json);
                } catch (Exception unused13) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.FileViewerModelStateBindingKt$generatedBind$$inlined$resolveBinding$30
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.items.FileViewerModel$HorizontalAlignment, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.items.FileViewerModel$HorizontalAlignment, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final FileViewerModel.HorizontalAlignment invoke(Object obj24) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj24);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement7 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.HorizontalAlignment", FileViewerModel.HorizontalAlignment.values()), jsonElement7);
                    } catch (Exception unused13) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof FileViewerModel.HorizontalAlignment) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c7 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.HorizontalAlignment", FileViewerModel.HorizontalAlignment.values()), jsonPrimitiveM1841c7);
                    } catch (Exception unused14) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(FileViewerModel.HorizontalAlignment.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (FileViewerModel.HorizontalAlignment) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (FileViewerModel.HorizontalAlignment) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (FileViewerModel.HorizontalAlignment) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (FileViewerModel.HorizontalAlignment) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (FileViewerModel.HorizontalAlignment) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (FileViewerModel.HorizontalAlignment) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        if (horizontalAlignment2 == null) {
            horizontalAlignment2 = fileViewerModel.getHorizontalAlignment();
        }
        FileViewerModel.HorizontalAlignment horizontalAlignment3 = horizontalAlignment2;
        Object verticalAlignment = fileViewerModel.getVerticalAlignment();
        if (verticalAlignment == null) {
            obj12 = null;
        } else {
            if (verticalAlignment instanceof WithGeneratedBindings) {
                Object objBind7 = ((WithGeneratedBindings) verticalAlignment).bind(accumulatedState);
                if (!(objBind7 instanceof FileViewerModel.VerticalAlignment)) {
                    objBind7 = null;
                }
                obj11 = (FileViewerModel.VerticalAlignment) objBind7;
                if (obj11 == null) {
                    obj11 = verticalAlignment;
                }
            } else if (verticalAlignment instanceof List) {
                Iterable iterable7 = (Iterable) verticalAlignment;
                ArrayList arrayList7 = new ArrayList(AbstractC25267u.m74163i0(iterable7, 10));
                for (Object obj24 : iterable7) {
                    WithGeneratedBindings withGeneratedBindings7 = obj24 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj24 : null;
                    if (withGeneratedBindings7 != null && (withGeneratedBindingsBind7 = withGeneratedBindings7.bind(accumulatedState)) != null) {
                        obj24 = withGeneratedBindingsBind7;
                    }
                    arrayList7.add(obj24);
                }
                obj11 = (FileViewerModel.VerticalAlignment) arrayList7;
            } else {
                obj11 = verticalAlignment;
            }
            obj12 = obj11;
        }
        String strResolveContentBindingKey7 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "verticalAlignment") : null;
        if (strResolveContentBindingKey7 != null) {
            Object objResolveStateRef7 = StateLookupKt.resolveStateRef(strResolveContentBindingKey7, accumulatedState);
            if (objResolveStateRef7 != null) {
                BindingLoggerKt.logContentBinding("verticalAlignment", strResolveContentBindingKey7, objResolveStateRef7);
                Object objUnwrapForCoercion7 = BindCoercionKt.unwrapForCoercion(objResolveStateRef7);
                if ((objUnwrapForCoercion7 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion7) && AbstractC22676k.m65745e(accumulatedState.get(obj23), Boolean.TRUE)) {
                    obj12 = null;
                } else {
                    Object objUnwrapForCoercion8 = BindCoercionKt.unwrapForCoercion(objResolveStateRef7);
                    if (objUnwrapForCoercion8 == null) {
                        objOverlayContentPathBindings7 = null;
                    } else if (objUnwrapForCoercion8 instanceof JsonElement) {
                        JsonElement jsonElement7 = (JsonElement) objUnwrapForCoercion8;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings7 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.VerticalAlignment", FileViewerModel.VerticalAlignment.values()), jsonElement7);
                        } catch (Exception unused13) {
                            objOverlayContentPathBindings7 = null;
                        }
                    } else if (objUnwrapForCoercion8 instanceof FileViewerModel.VerticalAlignment) {
                        objOverlayContentPathBindings7 = objUnwrapForCoercion8;
                    } else {
                        if (objUnwrapForCoercion8 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a7 = AbstractC22671h0.m65688a(FileViewerModel.VerticalAlignment.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings7 = (FileViewerModel.VerticalAlignment) Integer.valueOf(((Number) objUnwrapForCoercion8).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings7 = (FileViewerModel.VerticalAlignment) Long.valueOf(((Number) objUnwrapForCoercion8).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings7 = (FileViewerModel.VerticalAlignment) Double.valueOf(((Number) objUnwrapForCoercion8).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings7 = (FileViewerModel.VerticalAlignment) Float.valueOf(((Number) objUnwrapForCoercion8).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings7 = (FileViewerModel.VerticalAlignment) Short.valueOf(((Number) objUnwrapForCoercion8).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings7 = (FileViewerModel.VerticalAlignment) Byte.valueOf(((Number) objUnwrapForCoercion8).byteValue());
                            }
                        } else if (objUnwrapForCoercion8 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c7 = AbstractC0770m.m1841c((String) objUnwrapForCoercion8);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objUnwrapForCoercion8 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.VerticalAlignment", FileViewerModel.VerticalAlignment.values()), jsonPrimitiveM1841c7);
                            } catch (Exception unused14) {
                                objUnwrapForCoercion8 = null;
                            }
                            if (objUnwrapForCoercion8 != null) {
                                objOverlayContentPathBindings7 = objUnwrapForCoercion8;
                            }
                        }
                        objOverlayContentPathBindings7 = null;
                    }
                    obj12 = objOverlayContentPathBindings7 == null ? verticalAlignment : objOverlayContentPathBindings7;
                }
            }
        } else if (obj12 != null) {
            objOverlayContentPathBindings7 = ContentPathBindingsKt.overlayContentPathBindings(map, "verticalAlignment", accumulatedState, obj12, new Function1() { // from class: com.whoop.design.models.items.FileViewerModelStateBindingKt$generatedBind$$inlined$resolveBinding$31
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj25) {
                    return invoke((FileViewerModel.VerticalAlignment) obj25);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(FileViewerModel.VerticalAlignment v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        EnumSerializer enumSerializer = new EnumSerializer("com.whoop.design.models.items.FileViewerModel.VerticalAlignment", FileViewerModel.VerticalAlignment.values());
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, v13, enumSerializer);
                    } catch (Exception unused15) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.FileViewerModelStateBindingKt$generatedBind$$inlined$resolveBinding$32
                /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.design.models.items.FileViewerModel$VerticalAlignment, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final FileViewerModel.VerticalAlignment invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.VerticalAlignment", FileViewerModel.VerticalAlignment.values()), json);
                    } catch (Exception unused15) {
                        return null;
                    }
                }
            });
        }
        FileViewerModel.VerticalAlignment verticalAlignment2 = (FileViewerModel.VerticalAlignment) DotPathBindingsKt.overlayAggregateBinding(map2, "verticalAlignment", accumulatedState, obj12, "verticalAlignment", new Function1() { // from class: com.whoop.design.models.items.FileViewerModelStateBindingKt$generatedBind$$inlined$resolveBinding$33
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj25) {
                return invoke((FileViewerModel.VerticalAlignment) obj25);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(FileViewerModel.VerticalAlignment verticalAlignment3) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.VerticalAlignment", FileViewerModel.VerticalAlignment.values()));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, verticalAlignment3, interfaceC37138cM122336d);
                } catch (Exception unused15) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.FileViewerModelStateBindingKt$generatedBind$$inlined$resolveBinding$34
            /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.design.models.items.FileViewerModel$VerticalAlignment, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final FileViewerModel.VerticalAlignment invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.VerticalAlignment", FileViewerModel.VerticalAlignment.values()), json);
                } catch (Exception unused15) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.FileViewerModelStateBindingKt$generatedBind$$inlined$resolveBinding$35
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.items.FileViewerModel$VerticalAlignment, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.items.FileViewerModel$VerticalAlignment, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final FileViewerModel.VerticalAlignment invoke(Object obj25) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj25);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement8 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.VerticalAlignment", FileViewerModel.VerticalAlignment.values()), jsonElement8);
                    } catch (Exception unused15) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof FileViewerModel.VerticalAlignment) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c8 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.FileViewerModel.VerticalAlignment", FileViewerModel.VerticalAlignment.values()), jsonPrimitiveM1841c8);
                    } catch (Exception unused16) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(FileViewerModel.VerticalAlignment.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (FileViewerModel.VerticalAlignment) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (FileViewerModel.VerticalAlignment) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (FileViewerModel.VerticalAlignment) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (FileViewerModel.VerticalAlignment) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (FileViewerModel.VerticalAlignment) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (FileViewerModel.VerticalAlignment) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        if (verticalAlignment2 == null) {
            verticalAlignment2 = fileViewerModel.getVerticalAlignment();
        }
        return (FileViewerModel) ContentBindingResolverKt.copyBindingsFrom(new FileViewerModel(str, fileUrlType, fileType3, scaling3, zoom3, horizontalAlignment3, verticalAlignment2), fileViewerModel);
    }

    public static /* synthetic */ FileViewerModel generatedBind$default(FileViewerModel fileViewerModel, Map map, Map map2, Map map3, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            map2 = null;
        }
        return generatedBind(fileViewerModel, map, map2, map3);
    }
}
