package com.whoop.design.models.items.searchable;

import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import com.whoop.design.models.DesignSystemModel;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001aL\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0003¨\u0006\t"}, m65681d2 = {"generatedBind", "Lcom/whoop/design/models/items/searchable/SearchableListModel;", "contentBinding", "", "", "aggregateBindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "accumulatedState", "", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SearchableListModelStateBindingKt {
    /* JADX WARN: Code duplicated, block: B:102:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:105:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:108:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:110:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:113:0x0201  */
    /* JADX WARN: Code duplicated, block: B:114:0x0203  */
    /* JADX WARN: Code duplicated, block: B:117:0x021b  */
    /* JADX WARN: Code duplicated, block: B:119:0x0223  */
    /* JADX WARN: Code duplicated, block: B:120:0x0227  */
    /* JADX WARN: Code duplicated, block: B:131:0x023c  */
    /* JADX WARN: Code duplicated, block: B:132:0x0241  */
    /* JADX WARN: Code duplicated, block: B:134:0x0244  */
    /* JADX WARN: Code duplicated, block: B:136:0x024a  */
    /* JADX WARN: Code duplicated, block: B:143:0x026c  */
    /* JADX WARN: Code duplicated, block: B:145:0x0272  */
    /* JADX WARN: Code duplicated, block: B:146:0x0275  */
    /* JADX WARN: Code duplicated, block: B:148:0x0279  */
    /* JADX WARN: Code duplicated, block: B:151:0x0297  */
    /* JADX WARN: Code duplicated, block: B:154:0x029d  */
    /* JADX WARN: Code duplicated, block: B:156:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:158:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:159:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:161:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:162:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:164:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:165:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:167:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:168:0x0307  */
    /* JADX WARN: Code duplicated, block: B:170:0x0311  */
    /* JADX WARN: Code duplicated, block: B:171:0x031e  */
    /* JADX WARN: Code duplicated, block: B:173:0x0328  */
    /* JADX WARN: Code duplicated, block: B:174:0x0335  */
    /* JADX WARN: Code duplicated, block: B:176:0x0339  */
    /* JADX WARN: Code duplicated, block: B:182:0x035f  */
    /* JADX WARN: Code duplicated, block: B:183:0x0361 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:185:0x0364  */
    /* JADX WARN: Code duplicated, block: B:188:0x0383  */
    /* JADX WARN: Code duplicated, block: B:191:0x038e  */
    /* JADX WARN: Code duplicated, block: B:192:0x0390  */
    /* JADX WARN: Code duplicated, block: B:194:0x0394  */
    /* JADX WARN: Code duplicated, block: B:196:0x039f  */
    /* JADX WARN: Code duplicated, block: B:200:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:202:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:205:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:207:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:208:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:216:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:220:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:221:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:223:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:225:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:232:0x0416  */
    /* JADX WARN: Code duplicated, block: B:234:0x041c  */
    /* JADX WARN: Code duplicated, block: B:235:0x041f  */
    /* JADX WARN: Code duplicated, block: B:237:0x0423  */
    /* JADX WARN: Code duplicated, block: B:240:0x0438  */
    /* JADX WARN: Code duplicated, block: B:243:0x043e  */
    /* JADX WARN: Code duplicated, block: B:245:0x0442  */
    /* JADX WARN: Code duplicated, block: B:247:0x0454  */
    /* JADX WARN: Code duplicated, block: B:248:0x0462  */
    /* JADX WARN: Code duplicated, block: B:250:0x046c  */
    /* JADX WARN: Code duplicated, block: B:251:0x047a  */
    /* JADX WARN: Code duplicated, block: B:253:0x0484  */
    /* JADX WARN: Code duplicated, block: B:254:0x0491  */
    /* JADX WARN: Code duplicated, block: B:256:0x049b  */
    /* JADX WARN: Code duplicated, block: B:257:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:259:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:260:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:262:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:263:0x04d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:264:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:270:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:271:0x04f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:273:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:276:0x0519  */
    /* JADX WARN: Code duplicated, block: B:279:0x0524  */
    /* JADX WARN: Code duplicated, block: B:280:0x0526  */
    /* JADX WARN: Code duplicated, block: B:282:0x052a  */
    /* JADX WARN: Code duplicated, block: B:284:0x0535  */
    /* JADX WARN: Code duplicated, block: B:288:0x053b  */
    /* JADX WARN: Code duplicated, block: B:290:0x053f  */
    /* JADX WARN: Code duplicated, block: B:293:0x0557  */
    /* JADX WARN: Code duplicated, block: B:295:0x055f  */
    /* JADX WARN: Code duplicated, block: B:296:0x0563  */
    /* JADX WARN: Code duplicated, block: B:304:0x0576  */
    /* JADX WARN: Code duplicated, block: B:308:0x057c  */
    /* JADX WARN: Code duplicated, block: B:309:0x0581  */
    /* JADX WARN: Code duplicated, block: B:311:0x0584  */
    /* JADX WARN: Code duplicated, block: B:313:0x058a  */
    /* JADX WARN: Code duplicated, block: B:320:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:322:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:323:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:325:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:328:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:330:0x05d2 A[PHI: r0
      0x05d2: PHI (r0v28 java.lang.Object) = (r0v6 java.lang.Object), (r0v10 java.lang.Object) binds: [B:329:0x05d0, B:357:0x0690] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:331:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:333:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:335:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:336:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:338:0x0604  */
    /* JADX WARN: Code duplicated, block: B:339:0x0613  */
    /* JADX WARN: Code duplicated, block: B:341:0x061d  */
    /* JADX WARN: Code duplicated, block: B:342:0x062b  */
    /* JADX WARN: Code duplicated, block: B:344:0x0635  */
    /* JADX WARN: Code duplicated, block: B:345:0x0643  */
    /* JADX WARN: Code duplicated, block: B:347:0x064d  */
    /* JADX WARN: Code duplicated, block: B:348:0x065b  */
    /* JADX WARN: Code duplicated, block: B:350:0x0665  */
    /* JADX WARN: Code duplicated, block: B:351:0x0673  */
    /* JADX WARN: Code duplicated, block: B:353:0x0677  */
    /* JADX WARN: Code duplicated, block: B:360:0x0696  */
    /* JADX WARN: Code duplicated, block: B:361:0x0698 A[PHI: r10
      0x0698: PHI (r10v2 java.lang.Object) = (r10v1 java.lang.Object), (r10v17 java.lang.Object) binds: [B:364:0x069d, B:359:0x0694] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:362:0x069a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:364:0x069d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cb  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final SearchableListModel generatedBind(SearchableListModel searchableListModel, Map<String, String> map, Map<String, AggregateBinding> map2, Map<String, ? extends Object> accumulatedState) {
        Object objOverlayContentPathBindings;
        WithGeneratedBindings withGeneratedBindingsBind;
        DesignSystemModel emptyResultsItem;
        List<SearchableSectionModel> sections;
        ArrayList arrayList;
        List list;
        WithGeneratedBindings withGeneratedBindings;
        WithGeneratedBindings withGeneratedBindingsBind2;
        Object objOverlayContentPathBindings2;
        WithGeneratedBindings withGeneratedBindingsBind3;
        String strResolveContentBindingKey;
        List<SearchableSectionModel> sections2;
        Object stateUpdateSearchKey;
        ArrayList arrayList2;
        Object obj;
        WithGeneratedBindings withGeneratedBindings2;
        WithGeneratedBindings withGeneratedBindingsBind4;
        Object objOverlayContentPathBindings3;
        Object objBind;
        String strResolveContentBindingKey2;
        String stateUpdateSearchKey2;
        Object objIsSearchActive;
        ArrayList arrayList3;
        Object obj2;
        WithGeneratedBindings withGeneratedBindings3;
        WithGeneratedBindings withGeneratedBindingsBind5;
        Object obj3;
        Object objBind2;
        String strResolveContentBindingKey3;
        Object objOverlayContentPathBindings4;
        Object objResolveStateRef;
        Object objUnwrapForCoercion;
        Object objUnwrapForCoercion2;
        C22673i0 c22673i0;
        InterfaceC21461d orCreateKotlinClass;
        Object objResolveStateRef2;
        Object objUnwrapForCoercion3;
        boolean z4;
        C22673i0 c22673i1;
        InterfaceC21461d orCreateKotlinClass2;
        Object objResolveStateRef3;
        Object objUnwrapForCoercion4;
        C22673i0 c22673i2;
        InterfaceC21461d orCreateKotlinClass3;
        AbstractC22676k.m65750j(searchableListModel, "<this>");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        if ((map == null || map.isEmpty()) && ((map2 == null || map2.isEmpty()) && accumulatedState.isEmpty())) {
            return searchableListModel;
        }
        DesignSystemModel emptyResultsItem2 = searchableListModel.getEmptyResultsItem();
        if (emptyResultsItem2 == null) {
            objOverlayContentPathBindings = null;
        } else if (emptyResultsItem2 instanceof WithGeneratedBindings) {
            WithGeneratedBindings withGeneratedBindingsBind6 = ((WithGeneratedBindings) emptyResultsItem2).bind(accumulatedState);
            if (!(withGeneratedBindingsBind6 instanceof DesignSystemModel)) {
                withGeneratedBindingsBind6 = null;
            }
            objOverlayContentPathBindings = (DesignSystemModel) withGeneratedBindingsBind6;
            if (objOverlayContentPathBindings == null) {
                objOverlayContentPathBindings = emptyResultsItem2;
            }
        } else if (emptyResultsItem2 instanceof List) {
            Iterable iterable = (Iterable) emptyResultsItem2;
            List arrayList4 = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
            for (Object obj4 : iterable) {
                WithGeneratedBindings withGeneratedBindings4 = obj4 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj4 : null;
                if (withGeneratedBindings4 != null && (withGeneratedBindingsBind = withGeneratedBindings4.bind(accumulatedState)) != null) {
                    obj4 = withGeneratedBindingsBind;
                }
                arrayList4.add(obj4);
            }
            objOverlayContentPathBindings = (DesignSystemModel) arrayList4;
        } else {
            objOverlayContentPathBindings = emptyResultsItem2;
        }
        String strResolveContentBindingKey4 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "emptyResultsItem") : null;
        Class cls = Byte.TYPE;
        Class cls2 = Short.TYPE;
        Class cls3 = Float.TYPE;
        Class cls4 = Double.TYPE;
        Class cls5 = Long.TYPE;
        Class cls6 = Integer.TYPE;
        if (strResolveContentBindingKey4 != null) {
            Object objResolveStateRef4 = StateLookupKt.resolveStateRef(strResolveContentBindingKey4, accumulatedState);
            if (objResolveStateRef4 != null) {
                BindingLoggerKt.logContentBinding("emptyResultsItem", strResolveContentBindingKey4, objResolveStateRef4);
                Object objUnwrapForCoercion5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                if ((objUnwrapForCoercion5 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion5) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                    objOverlayContentPathBindings = null;
                } else {
                    objOverlayContentPathBindings = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                    if (objOverlayContentPathBindings == null) {
                        objOverlayContentPathBindings = null;
                    } else if (objOverlayContentPathBindings instanceof JsonElement) {
                        try {
                            objOverlayContentPathBindings = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)), (JsonElement) objOverlayContentPathBindings);
                        } catch (Exception unused) {
                            objOverlayContentPathBindings = null;
                        }
                    } else if (!(objOverlayContentPathBindings instanceof DesignSystemModel)) {
                        if (objOverlayContentPathBindings instanceof Number) {
                            C22673i0 c22673i3 = AbstractC22671h0.f89337a;
                            InterfaceC21461d orCreateKotlinClass4 = c22673i3.getOrCreateKotlinClass(DesignSystemModel.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings = (DesignSystemModel) Integer.valueOf(((Number) objOverlayContentPathBindings).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings = (DesignSystemModel) Long.valueOf(((Number) objOverlayContentPathBindings).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings = (DesignSystemModel) Double.valueOf(((Number) objOverlayContentPathBindings).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings = (DesignSystemModel) Float.valueOf(((Number) objOverlayContentPathBindings).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings = (DesignSystemModel) Short.valueOf(((Number) objOverlayContentPathBindings).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings = (DesignSystemModel) Byte.valueOf(((Number) objOverlayContentPathBindings).byteValue());
                            } else {
                                objOverlayContentPathBindings = null;
                            }
                        } else if (objOverlayContentPathBindings instanceof String) {
                            try {
                                objOverlayContentPathBindings = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)), AbstractC0770m.m1841c((String) objOverlayContentPathBindings));
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
                        objOverlayContentPathBindings = emptyResultsItem2;
                    }
                }
            }
            emptyResultsItem = (DesignSystemModel) DotPathBindingsKt.overlayAggregateBinding(map2, "emptyResultsItem", accumulatedState, objOverlayContentPathBindings, "emptyResultsItem", new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$3
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj5) {
                    return invoke((DesignSystemModel) obj5);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(DesignSystemModel designSystemModel) {
                    try {
                        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)));
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, designSystemModel, interfaceC37138cM122336d);
                    } catch (Exception unused3) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$4
                /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.design.models.DesignSystemModel, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final DesignSystemModel invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)), json);
                    } catch (Exception unused3) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$5
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v1, types: [com.whoop.design.models.DesignSystemModel] */
                /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.DesignSystemModel, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.DesignSystemModel, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final DesignSystemModel invoke(Object obj5) {
                    Object objM1830a;
                    ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj5);
                    if (UnwrapForCoercion == 0) {
                        return null;
                    }
                    if (UnwrapForCoercion instanceof JsonElement) {
                        try {
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)), (JsonElement) UnwrapForCoercion);
                        } catch (Exception unused3) {
                            return null;
                        }
                    }
                    if (UnwrapForCoercion instanceof DesignSystemModel) {
                        return UnwrapForCoercion;
                    }
                    if (!(UnwrapForCoercion instanceof Number)) {
                        if (!(UnwrapForCoercion instanceof String)) {
                            return null;
                        }
                        try {
                            objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)), AbstractC0770m.m1841c((String) UnwrapForCoercion));
                        } catch (Exception unused4) {
                            objM1830a = null;
                        }
                        if (objM1830a != null) {
                            return objM1830a;
                        }
                        return null;
                    }
                    C22673i0 c22673i4 = AbstractC22671h0.f89337a;
                    InterfaceC21461d orCreateKotlinClass5 = c22673i4.getOrCreateKotlinClass(DesignSystemModel.class);
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Integer.TYPE))) {
                        return (DesignSystemModel) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Long.TYPE))) {
                        return (DesignSystemModel) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Double.TYPE))) {
                        return (DesignSystemModel) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Float.TYPE))) {
                        return (DesignSystemModel) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Short.TYPE))) {
                        return (DesignSystemModel) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Byte.TYPE))) {
                        return (DesignSystemModel) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                    }
                    return null;
                }
            });
            if (emptyResultsItem == null) {
                emptyResultsItem = searchableListModel.getEmptyResultsItem();
            }
            DesignSystemModel designSystemModel = emptyResultsItem;
            sections = searchableListModel.getSections();
            if (sections == null) {
                objOverlayContentPathBindings2 = null;
            } else {
                if (sections instanceof WithGeneratedBindings) {
                    withGeneratedBindingsBind3 = ((WithGeneratedBindings) sections).bind(accumulatedState);
                    if (!(withGeneratedBindingsBind3 instanceof List)) {
                        withGeneratedBindingsBind3 = null;
                    }
                    list = (List) withGeneratedBindingsBind3;
                    if (list == null) {
                        list = sections;
                    }
                } else {
                    List<SearchableSectionModel> list2 = sections;
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                    for (Object obj5 : list2) {
                        if (obj5 instanceof WithGeneratedBindings) {
                            withGeneratedBindings = (WithGeneratedBindings) obj5;
                        } else {
                            withGeneratedBindings = null;
                        }
                        if (withGeneratedBindings == null && (withGeneratedBindingsBind2 = withGeneratedBindings.bind(accumulatedState)) != null) {
                            obj5 = withGeneratedBindingsBind2;
                        }
                        arrayList.add(obj5);
                    }
                    list = arrayList;
                }
                objOverlayContentPathBindings2 = list;
            }
            if (r1 != 0) {
                strResolveContentBindingKey = BindingLoggerKt.resolveContentBindingKey(map, "sections");
            } else {
                strResolveContentBindingKey = null;
            }
            if (strResolveContentBindingKey != null) {
                objResolveStateRef3 = StateLookupKt.resolveStateRef(strResolveContentBindingKey, accumulatedState);
                if (objResolveStateRef3 != null) {
                    BindingLoggerKt.logContentBinding("sections", strResolveContentBindingKey, objResolveStateRef3);
                    objUnwrapForCoercion4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                    if (!(objUnwrapForCoercion4 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion4) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                        objOverlayContentPathBindings2 = null;
                    } else {
                        objOverlayContentPathBindings2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                        if (objOverlayContentPathBindings2 == null) {
                            objOverlayContentPathBindings2 = null;
                        } else if (objOverlayContentPathBindings2 instanceof JsonElement) {
                            JsonElement jsonElement = (JsonElement) objOverlayContentPathBindings2;
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(SearchableSectionModel.INSTANCE.serializer()), jsonElement);
                            } catch (Exception unused3) {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else if (!(objOverlayContentPathBindings2 instanceof List)) {
                            if (objOverlayContentPathBindings2 instanceof Number) {
                                c22673i2 = AbstractC22671h0.f89337a;
                                orCreateKotlinClass3 = c22673i2.getOrCreateKotlinClass(List.class);
                                if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls6))) {
                                    objOverlayContentPathBindings2 = (List) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls5))) {
                                    objOverlayContentPathBindings2 = (List) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls4))) {
                                    objOverlayContentPathBindings2 = (List) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls3))) {
                                    objOverlayContentPathBindings2 = (List) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls2))) {
                                    objOverlayContentPathBindings2 = (List) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls))) {
                                    objOverlayContentPathBindings2 = (List) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                                } else {
                                    objOverlayContentPathBindings2 = null;
                                }
                            } else if (objOverlayContentPathBindings2 instanceof String) {
                                JsonPrimitive jsonPrimitiveM1841c = AbstractC0770m.m1841c((String) objOverlayContentPathBindings2);
                                try {
                                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                                    objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(SearchableSectionModel.INSTANCE.serializer()), jsonPrimitiveM1841c);
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
                            objOverlayContentPathBindings2 = sections;
                        }
                    }
                }
            } else if (objOverlayContentPathBindings2 != null) {
                objOverlayContentPathBindings2 = ContentPathBindingsKt.overlayContentPathBindings(r1, "sections", accumulatedState, objOverlayContentPathBindings2, new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$6
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj6) {
                        return invoke((List<? extends SearchableSectionModel>) obj6);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(List<? extends SearchableSectionModel> v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            ArrayListSerializer arrayListSerializer = new ArrayListSerializer(SearchableSectionModel.INSTANCE.serializer());
                            AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                            stateBindingJson.getClass();
                            return AbstractC12313p.m34290h0(stateBindingJson, v13, arrayListSerializer);
                        } catch (Exception unused5) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$7
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.items.searchable.SearchableSectionModel>] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final List<? extends SearchableSectionModel> invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(SearchableSectionModel.INSTANCE.serializer()), json);
                        } catch (Exception unused5) {
                            return null;
                        }
                    }
                });
            }
            sections2 = (List) DotPathBindingsKt.overlayAggregateBinding(map2, "sections", accumulatedState, objOverlayContentPathBindings2, "sections", new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$8
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj6) {
                    return invoke((List<? extends SearchableSectionModel>) obj6);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(List<? extends SearchableSectionModel> list3) {
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new ArrayListSerializer(SearchableSectionModel.INSTANCE.serializer()));
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, list3, interfaceC37138cM122336d);
                    } catch (Exception unused5) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$9
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.items.searchable.SearchableSectionModel>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final List<? extends SearchableSectionModel> invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(SearchableSectionModel.INSTANCE.serializer()), json);
                    } catch (Exception unused5) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$10
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<? extends com.whoop.design.models.items.searchable.SearchableSectionModel>] */
                /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.items.searchable.SearchableSectionModel>] */
                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.items.searchable.SearchableSectionModel>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final List<? extends SearchableSectionModel> invoke(Object obj6) {
                    Object objM1830a;
                    ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj6);
                    if (UnwrapForCoercion == 0) {
                        return null;
                    }
                    if (UnwrapForCoercion instanceof JsonElement) {
                        JsonElement jsonElement2 = (JsonElement) UnwrapForCoercion;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(SearchableSectionModel.INSTANCE.serializer()), jsonElement2);
                        } catch (Exception unused5) {
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
                        JsonPrimitive jsonPrimitiveM1841c2 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(SearchableSectionModel.INSTANCE.serializer()), jsonPrimitiveM1841c2);
                        } catch (Exception unused6) {
                            objM1830a = null;
                        }
                        if (objM1830a != null) {
                            return objM1830a;
                        }
                        return null;
                    }
                    C22673i0 c22673i4 = AbstractC22671h0.f89337a;
                    InterfaceC21461d orCreateKotlinClass5 = c22673i4.getOrCreateKotlinClass(List.class);
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Integer.TYPE))) {
                        return (List) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Long.TYPE))) {
                        return (List) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Double.TYPE))) {
                        return (List) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Float.TYPE))) {
                        return (List) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Short.TYPE))) {
                        return (List) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Byte.TYPE))) {
                        return (List) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                    }
                    return null;
                }
            });
            if (sections2 == null) {
                sections2 = searchableListModel.getSections();
            }
            List<SearchableSectionModel> list3 = sections2;
            stateUpdateSearchKey = searchableListModel.getStateUpdateSearchKey();
            if (stateUpdateSearchKey == null) {
                objOverlayContentPathBindings3 = null;
            } else {
                if (stateUpdateSearchKey instanceof WithGeneratedBindings) {
                    objBind = ((WithGeneratedBindings) stateUpdateSearchKey).bind(accumulatedState);
                    if (!(objBind instanceof String)) {
                        objBind = null;
                    }
                    obj = (String) objBind;
                    if (obj == null) {
                        obj = stateUpdateSearchKey;
                    }
                } else if (stateUpdateSearchKey instanceof List) {
                    Iterable iterable2 = (Iterable) stateUpdateSearchKey;
                    arrayList2 = new ArrayList(AbstractC25267u.m74163i0(iterable2, 10));
                    for (Object obj6 : iterable2) {
                        if (obj6 instanceof WithGeneratedBindings) {
                            withGeneratedBindings2 = (WithGeneratedBindings) obj6;
                        } else {
                            withGeneratedBindings2 = null;
                        }
                        if (withGeneratedBindings2 == null && (withGeneratedBindingsBind4 = withGeneratedBindings2.bind(accumulatedState)) != null) {
                            obj6 = withGeneratedBindingsBind4;
                        }
                        arrayList2.add(obj6);
                    }
                    obj = (String) arrayList2;
                } else {
                    obj = stateUpdateSearchKey;
                }
                objOverlayContentPathBindings3 = obj;
            }
            if (r1 != 0) {
                strResolveContentBindingKey2 = BindingLoggerKt.resolveContentBindingKey(r1, "stateUpdateSearchKey");
            } else {
                strResolveContentBindingKey2 = null;
            }
            if (strResolveContentBindingKey2 != null) {
                objResolveStateRef2 = StateLookupKt.resolveStateRef(strResolveContentBindingKey2, accumulatedState);
                if (objResolveStateRef2 != null) {
                    BindingLoggerKt.logContentBinding("stateUpdateSearchKey", strResolveContentBindingKey2, objResolveStateRef2);
                    objUnwrapForCoercion3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                    if (!(objUnwrapForCoercion3 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion3) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                        objOverlayContentPathBindings3 = null;
                    } else {
                        objOverlayContentPathBindings3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                        if (objOverlayContentPathBindings3 == null) {
                            objOverlayContentPathBindings3 = null;
                        } else if (objOverlayContentPathBindings3 instanceof JsonElement) {
                            JsonElement jsonElement2 = (JsonElement) objOverlayContentPathBindings3;
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement2);
                            } catch (Exception unused5) {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else {
                            z4 = objOverlayContentPathBindings3 instanceof String;
                            if (!z4) {
                                if (objOverlayContentPathBindings3 instanceof Number) {
                                    c22673i1 = AbstractC22671h0.f89337a;
                                    orCreateKotlinClass2 = c22673i1.getOrCreateKotlinClass(String.class);
                                    if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls6))) {
                                        objOverlayContentPathBindings3 = (String) Integer.valueOf(((Number) objOverlayContentPathBindings3).intValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls5))) {
                                        objOverlayContentPathBindings3 = (String) Long.valueOf(((Number) objOverlayContentPathBindings3).longValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls4))) {
                                        objOverlayContentPathBindings3 = (String) Double.valueOf(((Number) objOverlayContentPathBindings3).doubleValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls3))) {
                                        objOverlayContentPathBindings3 = (String) Float.valueOf(((Number) objOverlayContentPathBindings3).floatValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls2))) {
                                        objOverlayContentPathBindings3 = (String) Short.valueOf(((Number) objOverlayContentPathBindings3).shortValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls))) {
                                        objOverlayContentPathBindings3 = (String) Byte.valueOf(((Number) objOverlayContentPathBindings3).byteValue());
                                    } else {
                                        objOverlayContentPathBindings3 = null;
                                    }
                                } else if (z4) {
                                    JsonPrimitive jsonPrimitiveM1841c2 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings3);
                                    try {
                                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                                        objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c2);
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
                            objOverlayContentPathBindings3 = stateUpdateSearchKey;
                        }
                    }
                }
            } else if (objOverlayContentPathBindings3 != null) {
                objOverlayContentPathBindings3 = ContentPathBindingsKt.overlayContentPathBindings(r1, "stateUpdateSearchKey", accumulatedState, objOverlayContentPathBindings3, new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$11
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj7) {
                        return invoke((String) obj7);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(String v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(StringSerializer.INSTANCE, v13);
                        } catch (Exception unused7) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$12
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final String invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                        } catch (Exception unused7) {
                            return null;
                        }
                    }
                });
            }
            stateUpdateSearchKey2 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "stateUpdateSearchKey", accumulatedState, objOverlayContentPathBindings3, "stateUpdateSearchKey", new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$13
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj7) {
                    return invoke((String) obj7);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(String str) {
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, str, interfaceC37138cM122336d);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$14
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
                @Override // p715kotlin.jvm.functions.Function1
                public final String invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$15
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
                @Override // p715kotlin.jvm.functions.Function1
                public final String invoke(Object obj7) {
                    Object objM1830a;
                    ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj7);
                    if (UnwrapForCoercion == 0) {
                        return null;
                    }
                    if (UnwrapForCoercion instanceof JsonElement) {
                        JsonElement jsonElement3 = (JsonElement) UnwrapForCoercion;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement3);
                        } catch (Exception unused7) {
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
                        JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c3);
                        } catch (Exception unused8) {
                            objM1830a = null;
                        }
                        if (objM1830a != null) {
                            return objM1830a;
                        }
                        return null;
                    }
                    C22673i0 c22673i4 = AbstractC22671h0.f89337a;
                    InterfaceC21461d orCreateKotlinClass5 = c22673i4.getOrCreateKotlinClass(String.class);
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Integer.TYPE))) {
                        return (String) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Long.TYPE))) {
                        return (String) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Double.TYPE))) {
                        return (String) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Float.TYPE))) {
                        return (String) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Short.TYPE))) {
                        return (String) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Byte.TYPE))) {
                        return (String) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                    }
                    return null;
                }
            });
            if (stateUpdateSearchKey2 == null) {
                stateUpdateSearchKey2 = searchableListModel.getStateUpdateSearchKey();
            }
            String str = stateUpdateSearchKey2;
            objIsSearchActive = searchableListModel.isSearchActive();
            if (objIsSearchActive == null) {
                obj3 = null;
            } else {
                if (objIsSearchActive instanceof WithGeneratedBindings) {
                    objBind2 = ((WithGeneratedBindings) objIsSearchActive).bind(accumulatedState);
                    if (!(objBind2 instanceof Boolean)) {
                        objBind2 = null;
                    }
                    obj2 = (Boolean) objBind2;
                    if (obj2 == null) {
                        obj2 = objIsSearchActive;
                    }
                } else if (objIsSearchActive instanceof List) {
                    Iterable iterable3 = (Iterable) objIsSearchActive;
                    arrayList3 = new ArrayList(AbstractC25267u.m74163i0(iterable3, 10));
                    for (Object obj7 : iterable3) {
                        if (obj7 instanceof WithGeneratedBindings) {
                            withGeneratedBindings3 = (WithGeneratedBindings) obj7;
                        } else {
                            withGeneratedBindings3 = null;
                        }
                        if (withGeneratedBindings3 == null && (withGeneratedBindingsBind5 = withGeneratedBindings3.bind(accumulatedState)) != null) {
                            obj7 = withGeneratedBindingsBind5;
                        }
                        arrayList3.add(obj7);
                    }
                    obj2 = (Boolean) arrayList3;
                } else {
                    obj2 = objIsSearchActive;
                }
                obj3 = obj2;
            }
            if (r1 != 0) {
                strResolveContentBindingKey3 = BindingLoggerKt.resolveContentBindingKey(r1, "isSearchActive");
            } else {
                strResolveContentBindingKey3 = null;
            }
            if (strResolveContentBindingKey3 != null) {
                objResolveStateRef = StateLookupKt.resolveStateRef(strResolveContentBindingKey3, accumulatedState);
                if (objResolveStateRef != null) {
                    BindingLoggerKt.logContentBinding("isSearchActive", strResolveContentBindingKey3, objResolveStateRef);
                    objUnwrapForCoercion = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                    if (!(objUnwrapForCoercion instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                        obj3 = null;
                    } else {
                        objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                        if (objUnwrapForCoercion2 == null) {
                            objOverlayContentPathBindings4 = null;
                        } else if (objUnwrapForCoercion2 instanceof JsonElement) {
                            JsonElement jsonElement3 = (JsonElement) objUnwrapForCoercion2;
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonElement3);
                            } catch (Exception unused7) {
                                objOverlayContentPathBindings4 = null;
                            }
                        } else if (objUnwrapForCoercion2 instanceof Boolean) {
                            objOverlayContentPathBindings4 = objUnwrapForCoercion2;
                        } else {
                            if (objUnwrapForCoercion2 instanceof Number) {
                                c22673i0 = AbstractC22671h0.f89337a;
                                orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Boolean.class);
                                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls6))) {
                                    objOverlayContentPathBindings4 = (Boolean) Integer.valueOf(((Number) objUnwrapForCoercion2).intValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
                                    objOverlayContentPathBindings4 = (Boolean) Long.valueOf(((Number) objUnwrapForCoercion2).longValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
                                    objOverlayContentPathBindings4 = (Boolean) Double.valueOf(((Number) objUnwrapForCoercion2).doubleValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls3))) {
                                    objOverlayContentPathBindings4 = (Boolean) Float.valueOf(((Number) objUnwrapForCoercion2).floatValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
                                    objOverlayContentPathBindings4 = (Boolean) Short.valueOf(((Number) objUnwrapForCoercion2).shortValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls))) {
                                    objOverlayContentPathBindings4 = (Boolean) Byte.valueOf(((Number) objUnwrapForCoercion2).byteValue());
                                }
                            } else if (objUnwrapForCoercion2 instanceof String) {
                                JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) objUnwrapForCoercion2);
                                try {
                                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                                    objUnwrapForCoercion2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonPrimitiveM1841c3);
                                } catch (Exception unused8) {
                                    objUnwrapForCoercion2 = null;
                                }
                                if (objUnwrapForCoercion2 != null) {
                                    objOverlayContentPathBindings4 = objUnwrapForCoercion2;
                                }
                            }
                            objOverlayContentPathBindings4 = null;
                        }
                        if (objOverlayContentPathBindings4 == null) {
                            obj3 = objIsSearchActive;
                        } else {
                            obj3 = objOverlayContentPathBindings4;
                        }
                    }
                }
            } else if (obj3 != null) {
                objOverlayContentPathBindings4 = ContentPathBindingsKt.overlayContentPathBindings(r1, "isSearchActive", accumulatedState, obj3, new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$16
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj8) {
                        return invoke((Boolean) obj8);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(Boolean v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(BooleanSerializer.INSTANCE, v13);
                        } catch (Exception unused9) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$17
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Boolean, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Boolean invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, json);
                        } catch (Exception unused9) {
                            return null;
                        }
                    }
                });
                obj3 = objOverlayContentPathBindings4;
            }
            return (SearchableListModel) ContentBindingResolverKt.copyBindingsFrom(new SearchableListModel(designSystemModel, list3, str, (Boolean) DotPathBindingsKt.overlayAggregateBinding(map2, "isSearchActive", accumulatedState, obj3, "isSearchActive", new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$18
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj8) {
                    return invoke((Boolean) obj8);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Boolean bool) {
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(BooleanSerializer.INSTANCE);
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, bool, interfaceC37138cM122336d);
                    } catch (Exception unused9) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$19
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Boolean, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Boolean invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, json);
                    } catch (Exception unused9) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$20
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Boolean, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Boolean, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Boolean invoke(Object obj8) {
                    Object objM1830a;
                    ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj8);
                    if (UnwrapForCoercion == 0) {
                        return null;
                    }
                    if (UnwrapForCoercion instanceof JsonElement) {
                        JsonElement jsonElement4 = (JsonElement) UnwrapForCoercion;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonElement4);
                        } catch (Exception unused9) {
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
                        JsonPrimitive jsonPrimitiveM1841c4 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonPrimitiveM1841c4);
                        } catch (Exception unused10) {
                            objM1830a = null;
                        }
                        if (objM1830a != null) {
                            return objM1830a;
                        }
                        return null;
                    }
                    C22673i0 c22673i4 = AbstractC22671h0.f89337a;
                    InterfaceC21461d orCreateKotlinClass5 = c22673i4.getOrCreateKotlinClass(Boolean.class);
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Integer.TYPE))) {
                        return (Boolean) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Long.TYPE))) {
                        return (Boolean) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Double.TYPE))) {
                        return (Boolean) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Float.TYPE))) {
                        return (Boolean) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Short.TYPE))) {
                        return (Boolean) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Byte.TYPE))) {
                        return (Boolean) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                    }
                    return null;
                }
            })), searchableListModel);
        }
        if (objOverlayContentPathBindings != null) {
            objOverlayContentPathBindings = ContentPathBindingsKt.overlayContentPathBindings(map, "emptyResultsItem", accumulatedState, objOverlayContentPathBindings, new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$1
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj8) {
                    return invoke((DesignSystemModel) obj8);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(DesignSystemModel v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        InterfaceC37138c interfaceC37138cM113842e = AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class));
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, v13, interfaceC37138cM113842e);
                    } catch (Exception unused9) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$2
                /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.design.models.DesignSystemModel, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final DesignSystemModel invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)), json);
                    } catch (Exception unused9) {
                        return null;
                    }
                }
            });
        }
        emptyResultsItem = (DesignSystemModel) DotPathBindingsKt.overlayAggregateBinding(map2, "emptyResultsItem", accumulatedState, objOverlayContentPathBindings, "emptyResultsItem", new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$3
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj8) {
                return invoke((DesignSystemModel) obj8);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(DesignSystemModel designSystemModel2) {
                try {
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, designSystemModel2, interfaceC37138cM122336d);
                } catch (Exception unused9) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$4
            /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.design.models.DesignSystemModel, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final DesignSystemModel invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)), json);
                } catch (Exception unused9) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$5
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [com.whoop.design.models.DesignSystemModel] */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.DesignSystemModel, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.DesignSystemModel, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final DesignSystemModel invoke(Object obj8) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj8);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    try {
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)), (JsonElement) UnwrapForCoercion);
                    } catch (Exception unused9) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof DesignSystemModel) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    try {
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)), AbstractC0770m.m1841c((String) UnwrapForCoercion));
                    } catch (Exception unused10) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i4 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass5 = c22673i4.getOrCreateKotlinClass(DesignSystemModel.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (DesignSystemModel) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Long.TYPE))) {
                    return (DesignSystemModel) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Double.TYPE))) {
                    return (DesignSystemModel) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Float.TYPE))) {
                    return (DesignSystemModel) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Short.TYPE))) {
                    return (DesignSystemModel) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (DesignSystemModel) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        if (emptyResultsItem == null) {
            emptyResultsItem = searchableListModel.getEmptyResultsItem();
        }
        DesignSystemModel designSystemModel2 = emptyResultsItem;
        sections = searchableListModel.getSections();
        if (sections == null) {
            objOverlayContentPathBindings2 = null;
        } else {
            if (sections instanceof WithGeneratedBindings) {
                withGeneratedBindingsBind3 = ((WithGeneratedBindings) sections).bind(accumulatedState);
                if (!(withGeneratedBindingsBind3 instanceof List)) {
                    withGeneratedBindingsBind3 = null;
                }
                list = (List) withGeneratedBindingsBind3;
                if (list == null) {
                    list = sections;
                }
            } else {
                List<SearchableSectionModel> list4 = sections;
                arrayList = new ArrayList(AbstractC25267u.m74163i0(list4, 10));
                while (r2.hasNext()) {
                    if (obj5 instanceof WithGeneratedBindings) {
                        withGeneratedBindings = (WithGeneratedBindings) obj5;
                    } else {
                        withGeneratedBindings = null;
                    }
                    if (withGeneratedBindings == null) {
                    }
                    arrayList.add(obj5);
                }
                list = arrayList;
            }
            objOverlayContentPathBindings2 = list;
        }
        if (r1 != 0) {
            strResolveContentBindingKey = BindingLoggerKt.resolveContentBindingKey(map, "sections");
        } else {
            strResolveContentBindingKey = null;
        }
        if (strResolveContentBindingKey != null) {
            objResolveStateRef3 = StateLookupKt.resolveStateRef(strResolveContentBindingKey, accumulatedState);
            if (objResolveStateRef3 != null) {
                BindingLoggerKt.logContentBinding("sections", strResolveContentBindingKey, objResolveStateRef3);
                objUnwrapForCoercion4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                if (!(objUnwrapForCoercion4 instanceof String)) {
                    objOverlayContentPathBindings2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = null;
                    } else if (objOverlayContentPathBindings2 instanceof JsonElement) {
                        JsonElement jsonElement4 = (JsonElement) objOverlayContentPathBindings2;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(SearchableSectionModel.INSTANCE.serializer()), jsonElement4);
                    } else if (!(objOverlayContentPathBindings2 instanceof List)) {
                        if (objOverlayContentPathBindings2 instanceof Number) {
                            c22673i2 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass3 = c22673i2.getOrCreateKotlinClass(List.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings2 = (List) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings2 = (List) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings2 = (List) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings2 = (List) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings2 = (List) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings2 = (List) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                            } else {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else if (objOverlayContentPathBindings2 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c4 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings2);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(SearchableSectionModel.INSTANCE.serializer()), jsonPrimitiveM1841c4);
                            if (objOverlayContentPathBindings2 == null) {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else {
                            objOverlayContentPathBindings2 = null;
                        }
                    }
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = sections;
                    }
                } else {
                    objOverlayContentPathBindings2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = null;
                    } else if (objOverlayContentPathBindings2 instanceof JsonElement) {
                        JsonElement jsonElement5 = (JsonElement) objOverlayContentPathBindings2;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(SearchableSectionModel.INSTANCE.serializer()), jsonElement5);
                    } else if (!(objOverlayContentPathBindings2 instanceof List)) {
                        if (objOverlayContentPathBindings2 instanceof Number) {
                            c22673i2 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass3 = c22673i2.getOrCreateKotlinClass(List.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings2 = (List) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings2 = (List) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings2 = (List) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings2 = (List) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings2 = (List) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings2 = (List) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                            } else {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else if (objOverlayContentPathBindings2 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c5 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings2);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(SearchableSectionModel.INSTANCE.serializer()), jsonPrimitiveM1841c5);
                            if (objOverlayContentPathBindings2 == null) {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else {
                            objOverlayContentPathBindings2 = null;
                        }
                    }
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = sections;
                    }
                }
            }
        } else if (objOverlayContentPathBindings2 != null) {
            objOverlayContentPathBindings2 = ContentPathBindingsKt.overlayContentPathBindings(r1, "sections", accumulatedState, objOverlayContentPathBindings2, new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$6
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj8) {
                    return invoke((List<? extends SearchableSectionModel>) obj8);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(List<? extends SearchableSectionModel> v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        ArrayListSerializer arrayListSerializer = new ArrayListSerializer(SearchableSectionModel.INSTANCE.serializer());
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, v13, arrayListSerializer);
                    } catch (Exception unused9) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$7
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.items.searchable.SearchableSectionModel>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final List<? extends SearchableSectionModel> invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(SearchableSectionModel.INSTANCE.serializer()), json);
                    } catch (Exception unused9) {
                        return null;
                    }
                }
            });
        }
        sections2 = (List) DotPathBindingsKt.overlayAggregateBinding(map2, "sections", accumulatedState, objOverlayContentPathBindings2, "sections", new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$8
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj8) {
                return invoke((List<? extends SearchableSectionModel>) obj8);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(List<? extends SearchableSectionModel> list5) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new ArrayListSerializer(SearchableSectionModel.INSTANCE.serializer()));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, list5, interfaceC37138cM122336d);
                } catch (Exception unused9) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$9
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.items.searchable.SearchableSectionModel>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final List<? extends SearchableSectionModel> invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(SearchableSectionModel.INSTANCE.serializer()), json);
                } catch (Exception unused9) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$10
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<? extends com.whoop.design.models.items.searchable.SearchableSectionModel>] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.items.searchable.SearchableSectionModel>] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.items.searchable.SearchableSectionModel>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final List<? extends SearchableSectionModel> invoke(Object obj8) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj8);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement6 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(SearchableSectionModel.INSTANCE.serializer()), jsonElement6);
                    } catch (Exception unused9) {
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
                    JsonPrimitive jsonPrimitiveM1841c6 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(SearchableSectionModel.INSTANCE.serializer()), jsonPrimitiveM1841c6);
                    } catch (Exception unused10) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i4 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass5 = c22673i4.getOrCreateKotlinClass(List.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (List) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Long.TYPE))) {
                    return (List) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Double.TYPE))) {
                    return (List) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Float.TYPE))) {
                    return (List) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Short.TYPE))) {
                    return (List) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (List) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        if (sections2 == null) {
            sections2 = searchableListModel.getSections();
        }
        List<SearchableSectionModel> list5 = sections2;
        stateUpdateSearchKey = searchableListModel.getStateUpdateSearchKey();
        if (stateUpdateSearchKey == null) {
            objOverlayContentPathBindings3 = null;
        } else {
            if (stateUpdateSearchKey instanceof WithGeneratedBindings) {
                objBind = ((WithGeneratedBindings) stateUpdateSearchKey).bind(accumulatedState);
                if (!(objBind instanceof String)) {
                    objBind = null;
                }
                obj = (String) objBind;
                if (obj == null) {
                    obj = stateUpdateSearchKey;
                }
            } else if (stateUpdateSearchKey instanceof List) {
                Iterable iterable4 = (Iterable) stateUpdateSearchKey;
                arrayList2 = new ArrayList(AbstractC25267u.m74163i0(iterable4, 10));
                while (r2.hasNext()) {
                    if (obj6 instanceof WithGeneratedBindings) {
                        withGeneratedBindings2 = (WithGeneratedBindings) obj6;
                    } else {
                        withGeneratedBindings2 = null;
                    }
                    if (withGeneratedBindings2 == null) {
                    }
                    arrayList2.add(obj6);
                }
                obj = (String) arrayList2;
            } else {
                obj = stateUpdateSearchKey;
            }
            objOverlayContentPathBindings3 = obj;
        }
        if (r1 != 0) {
            strResolveContentBindingKey2 = BindingLoggerKt.resolveContentBindingKey(r1, "stateUpdateSearchKey");
        } else {
            strResolveContentBindingKey2 = null;
        }
        if (strResolveContentBindingKey2 != null) {
            objResolveStateRef2 = StateLookupKt.resolveStateRef(strResolveContentBindingKey2, accumulatedState);
            if (objResolveStateRef2 != null) {
                BindingLoggerKt.logContentBinding("stateUpdateSearchKey", strResolveContentBindingKey2, objResolveStateRef2);
                objUnwrapForCoercion3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                if (!(objUnwrapForCoercion3 instanceof String)) {
                    objOverlayContentPathBindings3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                    if (objOverlayContentPathBindings3 == null) {
                        objOverlayContentPathBindings3 = null;
                    } else if (objOverlayContentPathBindings3 instanceof JsonElement) {
                        JsonElement jsonElement6 = (JsonElement) objOverlayContentPathBindings3;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement6);
                    } else {
                        z4 = objOverlayContentPathBindings3 instanceof String;
                        if (!z4) {
                            if (objOverlayContentPathBindings3 instanceof Number) {
                                c22673i1 = AbstractC22671h0.f89337a;
                                orCreateKotlinClass2 = c22673i1.getOrCreateKotlinClass(String.class);
                                if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls6))) {
                                    objOverlayContentPathBindings3 = (String) Integer.valueOf(((Number) objOverlayContentPathBindings3).intValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls5))) {
                                    objOverlayContentPathBindings3 = (String) Long.valueOf(((Number) objOverlayContentPathBindings3).longValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls4))) {
                                    objOverlayContentPathBindings3 = (String) Double.valueOf(((Number) objOverlayContentPathBindings3).doubleValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls3))) {
                                    objOverlayContentPathBindings3 = (String) Float.valueOf(((Number) objOverlayContentPathBindings3).floatValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls2))) {
                                    objOverlayContentPathBindings3 = (String) Short.valueOf(((Number) objOverlayContentPathBindings3).shortValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls))) {
                                    objOverlayContentPathBindings3 = (String) Byte.valueOf(((Number) objOverlayContentPathBindings3).byteValue());
                                } else {
                                    objOverlayContentPathBindings3 = null;
                                }
                            } else if (z4) {
                                JsonPrimitive jsonPrimitiveM1841c6 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings3);
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c6);
                                if (objOverlayContentPathBindings3 == null) {
                                    objOverlayContentPathBindings3 = null;
                                }
                            } else {
                                objOverlayContentPathBindings3 = null;
                            }
                        }
                    }
                    if (objOverlayContentPathBindings3 == null) {
                        objOverlayContentPathBindings3 = stateUpdateSearchKey;
                    }
                } else {
                    objOverlayContentPathBindings3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                    if (objOverlayContentPathBindings3 == null) {
                        objOverlayContentPathBindings3 = null;
                    } else if (objOverlayContentPathBindings3 instanceof JsonElement) {
                        JsonElement jsonElement7 = (JsonElement) objOverlayContentPathBindings3;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement7);
                    } else {
                        z4 = objOverlayContentPathBindings3 instanceof String;
                        if (!z4) {
                            if (objOverlayContentPathBindings3 instanceof Number) {
                                c22673i1 = AbstractC22671h0.f89337a;
                                orCreateKotlinClass2 = c22673i1.getOrCreateKotlinClass(String.class);
                                if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls6))) {
                                    objOverlayContentPathBindings3 = (String) Integer.valueOf(((Number) objOverlayContentPathBindings3).intValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls5))) {
                                    objOverlayContentPathBindings3 = (String) Long.valueOf(((Number) objOverlayContentPathBindings3).longValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls4))) {
                                    objOverlayContentPathBindings3 = (String) Double.valueOf(((Number) objOverlayContentPathBindings3).doubleValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls3))) {
                                    objOverlayContentPathBindings3 = (String) Float.valueOf(((Number) objOverlayContentPathBindings3).floatValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls2))) {
                                    objOverlayContentPathBindings3 = (String) Short.valueOf(((Number) objOverlayContentPathBindings3).shortValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls))) {
                                    objOverlayContentPathBindings3 = (String) Byte.valueOf(((Number) objOverlayContentPathBindings3).byteValue());
                                } else {
                                    objOverlayContentPathBindings3 = null;
                                }
                            } else if (z4) {
                                JsonPrimitive jsonPrimitiveM1841c7 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings3);
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c7);
                                if (objOverlayContentPathBindings3 == null) {
                                    objOverlayContentPathBindings3 = null;
                                }
                            } else {
                                objOverlayContentPathBindings3 = null;
                            }
                        }
                    }
                    if (objOverlayContentPathBindings3 == null) {
                        objOverlayContentPathBindings3 = stateUpdateSearchKey;
                    }
                }
            }
        } else if (objOverlayContentPathBindings3 != null) {
            objOverlayContentPathBindings3 = ContentPathBindingsKt.overlayContentPathBindings(r1, "stateUpdateSearchKey", accumulatedState, objOverlayContentPathBindings3, new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$11
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj8) {
                    return invoke((String) obj8);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(String v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(StringSerializer.INSTANCE, v13);
                    } catch (Exception unused9) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$12
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
                @Override // p715kotlin.jvm.functions.Function1
                public final String invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                    } catch (Exception unused9) {
                        return null;
                    }
                }
            });
        }
        stateUpdateSearchKey2 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "stateUpdateSearchKey", accumulatedState, objOverlayContentPathBindings3, "stateUpdateSearchKey", new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$13
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj8) {
                return invoke((String) obj8);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(String str2) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, str2, interfaceC37138cM122336d);
                } catch (Exception unused9) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$14
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                } catch (Exception unused9) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$15
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj8) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj8);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement8 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement8);
                    } catch (Exception unused9) {
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
                    JsonPrimitive jsonPrimitiveM1841c8 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c8);
                    } catch (Exception unused10) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i4 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass5 = c22673i4.getOrCreateKotlinClass(String.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (String) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Long.TYPE))) {
                    return (String) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Double.TYPE))) {
                    return (String) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Float.TYPE))) {
                    return (String) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Short.TYPE))) {
                    return (String) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (String) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        if (stateUpdateSearchKey2 == null) {
            stateUpdateSearchKey2 = searchableListModel.getStateUpdateSearchKey();
        }
        String str2 = stateUpdateSearchKey2;
        objIsSearchActive = searchableListModel.isSearchActive();
        if (objIsSearchActive == null) {
            obj3 = null;
        } else {
            if (objIsSearchActive instanceof WithGeneratedBindings) {
                objBind2 = ((WithGeneratedBindings) objIsSearchActive).bind(accumulatedState);
                if (!(objBind2 instanceof Boolean)) {
                    objBind2 = null;
                }
                obj2 = (Boolean) objBind2;
                if (obj2 == null) {
                    obj2 = objIsSearchActive;
                }
            } else if (objIsSearchActive instanceof List) {
                Iterable iterable5 = (Iterable) objIsSearchActive;
                arrayList3 = new ArrayList(AbstractC25267u.m74163i0(iterable5, 10));
                while (r2.hasNext()) {
                    if (obj7 instanceof WithGeneratedBindings) {
                        withGeneratedBindings3 = (WithGeneratedBindings) obj7;
                    } else {
                        withGeneratedBindings3 = null;
                    }
                    if (withGeneratedBindings3 == null) {
                    }
                    arrayList3.add(obj7);
                }
                obj2 = (Boolean) arrayList3;
            } else {
                obj2 = objIsSearchActive;
            }
            obj3 = obj2;
        }
        if (r1 != 0) {
            strResolveContentBindingKey3 = BindingLoggerKt.resolveContentBindingKey(r1, "isSearchActive");
        } else {
            strResolveContentBindingKey3 = null;
        }
        if (strResolveContentBindingKey3 != null) {
            objResolveStateRef = StateLookupKt.resolveStateRef(strResolveContentBindingKey3, accumulatedState);
            if (objResolveStateRef != null) {
                BindingLoggerKt.logContentBinding("isSearchActive", strResolveContentBindingKey3, objResolveStateRef);
                objUnwrapForCoercion = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                if (!(objUnwrapForCoercion instanceof String)) {
                    objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                    if (objUnwrapForCoercion2 == null) {
                        objOverlayContentPathBindings4 = null;
                    } else if (objUnwrapForCoercion2 instanceof JsonElement) {
                        JsonElement jsonElement8 = (JsonElement) objUnwrapForCoercion2;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonElement8);
                    } else if (objUnwrapForCoercion2 instanceof Boolean) {
                        if (objUnwrapForCoercion2 instanceof Number) {
                            c22673i0 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Boolean.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings4 = (Boolean) Integer.valueOf(((Number) objUnwrapForCoercion2).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings4 = (Boolean) Long.valueOf(((Number) objUnwrapForCoercion2).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings4 = (Boolean) Double.valueOf(((Number) objUnwrapForCoercion2).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings4 = (Boolean) Float.valueOf(((Number) objUnwrapForCoercion2).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings4 = (Boolean) Short.valueOf(((Number) objUnwrapForCoercion2).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings4 = (Boolean) Byte.valueOf(((Number) objUnwrapForCoercion2).byteValue());
                            }
                        } else if (objUnwrapForCoercion2 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c8 = AbstractC0770m.m1841c((String) objUnwrapForCoercion2);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objUnwrapForCoercion2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonPrimitiveM1841c8);
                            if (objUnwrapForCoercion2 != null) {
                                objOverlayContentPathBindings4 = objUnwrapForCoercion2;
                            }
                        }
                        objOverlayContentPathBindings4 = null;
                    } else {
                        objOverlayContentPathBindings4 = objUnwrapForCoercion2;
                    }
                    if (objOverlayContentPathBindings4 == null) {
                        obj3 = objIsSearchActive;
                    } else {
                        obj3 = objOverlayContentPathBindings4;
                    }
                } else {
                    objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                    if (objUnwrapForCoercion2 == null) {
                        objOverlayContentPathBindings4 = null;
                    } else if (objUnwrapForCoercion2 instanceof JsonElement) {
                        JsonElement jsonElement9 = (JsonElement) objUnwrapForCoercion2;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonElement9);
                    } else if (objUnwrapForCoercion2 instanceof Boolean) {
                        if (objUnwrapForCoercion2 instanceof Number) {
                            c22673i0 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Boolean.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings4 = (Boolean) Integer.valueOf(((Number) objUnwrapForCoercion2).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings4 = (Boolean) Long.valueOf(((Number) objUnwrapForCoercion2).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings4 = (Boolean) Double.valueOf(((Number) objUnwrapForCoercion2).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings4 = (Boolean) Float.valueOf(((Number) objUnwrapForCoercion2).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings4 = (Boolean) Short.valueOf(((Number) objUnwrapForCoercion2).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings4 = (Boolean) Byte.valueOf(((Number) objUnwrapForCoercion2).byteValue());
                            }
                        } else if (objUnwrapForCoercion2 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c9 = AbstractC0770m.m1841c((String) objUnwrapForCoercion2);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objUnwrapForCoercion2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonPrimitiveM1841c9);
                            if (objUnwrapForCoercion2 != null) {
                                objOverlayContentPathBindings4 = objUnwrapForCoercion2;
                            }
                        }
                        objOverlayContentPathBindings4 = null;
                    } else {
                        objOverlayContentPathBindings4 = objUnwrapForCoercion2;
                    }
                    if (objOverlayContentPathBindings4 == null) {
                        obj3 = objIsSearchActive;
                    } else {
                        obj3 = objOverlayContentPathBindings4;
                    }
                }
            }
        } else if (obj3 != null) {
            objOverlayContentPathBindings4 = ContentPathBindingsKt.overlayContentPathBindings(r1, "isSearchActive", accumulatedState, obj3, new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$16
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj8) {
                    return invoke((Boolean) obj8);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Boolean v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(BooleanSerializer.INSTANCE, v13);
                    } catch (Exception unused9) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$17
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Boolean, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Boolean invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, json);
                    } catch (Exception unused9) {
                        return null;
                    }
                }
            });
            obj3 = objOverlayContentPathBindings4;
        }
        return (SearchableListModel) ContentBindingResolverKt.copyBindingsFrom(new SearchableListModel(designSystemModel2, list5, str2, (Boolean) DotPathBindingsKt.overlayAggregateBinding(map2, "isSearchActive", accumulatedState, obj3, "isSearchActive", new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$18
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj8) {
                return invoke((Boolean) obj8);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Boolean bool) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(BooleanSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, bool, interfaceC37138cM122336d);
                } catch (Exception unused9) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$19
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Boolean, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Boolean invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, json);
                } catch (Exception unused9) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.searchable.SearchableListModelStateBindingKt$generatedBind$$inlined$resolveBinding$20
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Boolean, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Boolean, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj8) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj8);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement10 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonElement10);
                    } catch (Exception unused9) {
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
                    JsonPrimitive jsonPrimitiveM1841c10 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonPrimitiveM1841c10);
                    } catch (Exception unused10) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i4 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass5 = c22673i4.getOrCreateKotlinClass(Boolean.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (Boolean) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Long.TYPE))) {
                    return (Boolean) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Double.TYPE))) {
                    return (Boolean) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Float.TYPE))) {
                    return (Boolean) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Short.TYPE))) {
                    return (Boolean) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (Boolean) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        })), searchableListModel);
    }

    public static /* synthetic */ SearchableListModel generatedBind$default(SearchableListModel searchableListModel, Map map, Map map2, Map map3, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            map2 = null;
        }
        return generatedBind(searchableListModel, map, map2, map3);
    }
}
