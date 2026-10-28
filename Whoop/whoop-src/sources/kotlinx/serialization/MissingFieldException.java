package kotlinx.serialization;

import java.util.ArrayList;
import java.util.List;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Lkotlinx/serialization/MissingFieldException;", "Lkotlinx/serialization/SerializationException;", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MissingFieldException extends SerializationException {

    /* JADX INFO: renamed from: w */
    public final List f89405w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(List missingFields, String str, MissingFieldException missingFieldException) {
        super(str, missingFieldException);
        AbstractC22676k.m65750j(missingFields, "missingFields");
        this.f89405w = missingFields;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MissingFieldException(String serialName, ArrayList arrayList) {
        String strM30464r;
        AbstractC22676k.m65750j(serialName, "serialName");
        if (arrayList.size() == 1) {
            strM30464r = AbstractC11266d.m30464r(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", serialName, "', but it was missing");
        } else {
            strM30464r = "Fields " + arrayList + " are required for type with serial name '" + serialName + "', but they were missing";
        }
        this(arrayList, strM30464r, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(String str, String serialName) {
        this(AbstractC37056f.m118958J(str), AbstractC2875y.m8300m("Field '", str, "' is required for type with serial name '", serialName, "', but it was missing"), null);
        AbstractC22676k.m65750j(serialName, "serialName");
    }
}
