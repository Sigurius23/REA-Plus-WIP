package com.stripe.android.uicore.elements;

import g40.InterfaceC15439w1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;

/* JADX INFO: renamed from: com.stripe.android.uicore.elements.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C5705a {
    /* JADX INFO: renamed from: a */
    public static IdentifierSpec m16892a(String _value) {
        AbstractC22676k.m65750j(_value, "_value");
        return new IdentifierSpec(_value, false, (InterfaceC15439w1) null, 6, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: b */
    public static IdentifierSpec m16893b(String value) {
        AbstractC22676k.m65750j(value, "value");
        if (value.equals(IdentifierSpec.CardBrand.getV1())) {
            return IdentifierSpec.CardBrand;
        }
        if (value.equals(IdentifierSpec.CardNumber.getV1())) {
            return IdentifierSpec.CardNumber;
        }
        if (value.equals(IdentifierSpec.CardCvc.getV1())) {
            return IdentifierSpec.CardCvc;
        }
        if (value.equals(IdentifierSpec.City.getV1())) {
            return IdentifierSpec.City;
        }
        if (value.equals(IdentifierSpec.Country.getV1())) {
            return IdentifierSpec.Country;
        }
        if (value.equals(IdentifierSpec.Email.getV1())) {
            return IdentifierSpec.Email;
        }
        if (value.equals(IdentifierSpec.Line1.getV1())) {
            return IdentifierSpec.Line1;
        }
        if (value.equals(IdentifierSpec.Line2.getV1())) {
            return IdentifierSpec.Line2;
        }
        if (value.equals(IdentifierSpec.Name.getV1())) {
            return IdentifierSpec.Name;
        }
        if (value.equals(IdentifierSpec.Phone.getV1())) {
            return IdentifierSpec.Phone;
        }
        if (value.equals(IdentifierSpec.PostalCode.getV1())) {
            return IdentifierSpec.PostalCode;
        }
        if (value.equals(IdentifierSpec.SaveForFutureUse.getV1())) {
            return IdentifierSpec.SaveForFutureUse;
        }
        if (value.equals(IdentifierSpec.State.getV1())) {
            return IdentifierSpec.State;
        }
        return value.equals(IdentifierSpec.OneLineAddress.getV1()) ? IdentifierSpec.OneLineAddress : m16892a(value);
    }

    public final InterfaceC37138c serializer() {
        return IdentifierSpec$$serializer.INSTANCE;
    }
}
