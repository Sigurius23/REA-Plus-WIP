package com.whoop.design.models.binding;

import ad3.AbstractC0757c;
import cd3.AbstractC4454f;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.design.models.WithGeneratedBindings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import l83.InterfaceC23462h;
import m83.AbstractC25267u;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import r70.C31050b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001e\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\"\u0010\u0005\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a$\u0010\b\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007H\u0086\b¢\u0006\u0004\b\b\u0010\t\u001a@\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e\"\u0006\b\u0000\u0010\n\u0018\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000bH\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010\"!\u0010\u0018\u001a\u00020\u00118@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m65681d2 = {"T", "Lkotlinx/serialization/json/JsonElement;", "deserializeFromState", "(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;", "value", "encodeForStateBinding", "(Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;", "", "coerceNumericState", "(Ljava/lang/Object;)Ljava/lang/Object;", "E", "", "", "accumulatedState", "", "coerceListState", "(Ljava/lang/Object;Ljava/util/Map;)Ljava/util/List;", "Lad3/c;", "stateBindingJson$delegate", "Ll83/h;", "getStateBindingJson", "()Lad3/c;", "getStateBindingJson$annotations", "()V", "stateBindingJson", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class StateBindingDeserializerKt {
    private static final InterfaceC23462h stateBindingJson$delegate = AbstractC30060g.m92088H(new C31050b(27));

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> List<E> coerceListState(Object obj, Map<String, ? extends Object> accumulatedState) {
        ArrayList arrayList;
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        if (obj == null) {
            return null;
        }
        if (obj instanceof JsonArray) {
            JsonArray jsonArray = (JsonArray) obj;
            arrayList = new ArrayList(jsonArray.size());
            Iterator<JsonElement> it = jsonArray.iterator();
            if (it.hasNext()) {
                it.next();
                AbstractC22676k.m65756p();
                throw null;
            }
        } else {
            if (!(obj instanceof List)) {
                return null;
            }
            List list = (List) obj;
            arrayList = new ArrayList(list.size());
            Iterator<E> it3 = list.iterator();
            if (it3.hasNext()) {
                it3.next();
                AbstractC22676k.m65756p();
                throw null;
            }
        }
        if (accumulatedState.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        for (Object obj2 : arrayList) {
            if (obj2 instanceof WithGeneratedBindings) {
                ((WithGeneratedBindings) obj2).bind(accumulatedState);
                AbstractC22676k.m65756p();
                throw null;
            }
            arrayList2.add(obj2);
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List coerceListState$default(Object obj, Map accumulatedState, int i13, Object obj2) {
        ArrayList arrayList;
        if ((i13 & 2) != 0) {
            accumulatedState = C25272z.f99163w;
        }
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        if (obj == null) {
            return null;
        }
        if (obj instanceof JsonArray) {
            JsonArray jsonArray = (JsonArray) obj;
            arrayList = new ArrayList(jsonArray.size());
            Iterator<JsonElement> it = jsonArray.iterator();
            if (it.hasNext()) {
                it.next();
                AbstractC22676k.m65756p();
                throw null;
            }
        } else {
            if (!(obj instanceof List)) {
                return null;
            }
            List list = (List) obj;
            arrayList = new ArrayList(list.size());
            Iterator it3 = list.iterator();
            if (it3.hasNext()) {
                it3.next();
                AbstractC22676k.m65756p();
                throw null;
            }
        }
        if (accumulatedState.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        for (Object obj3 : arrayList) {
            if (obj3 instanceof WithGeneratedBindings) {
                ((WithGeneratedBindings) obj3).bind(accumulatedState);
                AbstractC22676k.m65756p();
                throw null;
            }
            arrayList2.add(obj3);
        }
        return arrayList2;
    }

    public static final <T> T coerceNumericState(Object obj) {
        AbstractC22676k.m65756p();
        throw null;
    }

    public static final <T> T deserializeFromState(JsonElement jsonElement) {
        AbstractC22676k.m65750j(jsonElement, "<this>");
        try {
            AbstractC4454f abstractC4454f = getStateBindingJson().f2764b;
            AbstractC22676k.m65756p();
            throw null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final <T> JsonElement encodeForStateBinding(T t14) {
        try {
            AbstractC4454f abstractC4454f = getStateBindingJson().f2764b;
            AbstractC22676k.m65756p();
            throw null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final AbstractC0757c getStateBindingJson() {
        return (AbstractC0757c) stateBindingJson$delegate.getValue();
    }

    public static /* synthetic */ void getStateBindingJson$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC0757c stateBindingJson_delegate$lambda$0() {
        return AbstractC6728b.m20379d(null, null, null, null, null, 31, null);
    }
}
