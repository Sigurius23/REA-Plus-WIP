package io0;

import ad3.AbstractC0757c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import m83.AbstractC25267u;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: io0.z */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"", "intakeResponses", "Ltr2/n;", "logger", "", "Lkotlinx/serialization/json/JsonObject;", "a", "(Ljava/lang/String;Ltr2/n;)Ljava/util/List;", "clinician-in-the-loop_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC20739z {
    /* JADX INFO: renamed from: a */
    public static final List<JsonObject> m57058a(String intakeResponses, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(intakeResponses, "intakeResponses");
        AbstractC22676k.m65750j(logger, "logger");
        if (AbstractC39414r.m125890i0(intakeResponses)) {
            return C25271y.f99162w;
        }
        try {
            JsonElement jsonElementM1835f = AbstractC0757c.f2762d.m1835f(intakeResponses);
            JsonArray jsonArray = jsonElementM1835f instanceof JsonArray ? (JsonArray) jsonElementM1835f : null;
            if (jsonArray != null) {
                if (!jsonArray.isEmpty()) {
                    Iterator<JsonElement> it = jsonArray.iterator();
                    while (it.hasNext()) {
                        if (!(it.next() instanceof JsonObject)) {
                        }
                    }
                }
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(jsonArray, 10));
                for (JsonElement jsonElement : jsonArray) {
                    AbstractC22676k.m65748h(jsonElement, "null cannot be cast to non-null type kotlinx.serialization.json.JsonObject");
                    arrayList.add((JsonObject) jsonElement);
                }
                return arrayList;
            }
            logger.mo85226q("intakeResponses must be a JSON array of objects", new AbstractC30556a.a[0]);
            return null;
        } catch (SerializationException e5) {
            logger.mo85213c("intakeResponses is not valid JSON", e5, new AbstractC30556a.a[0]);
            return null;
        }
    }
}
