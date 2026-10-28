package com.stripe.android.p056ui.core.elements;

import android.os.Parcelable;
import com.stripe.android.uicore.elements.IdentifierSpec;
import g40.C15383l0;
import g40.C15440w2;
import g40.InterfaceC15450y2;
import java.util.List;
import p696zy.InterfaceC41211c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import x30.C37933v0;
import x30.C37935w0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000b\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\t\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8&X§\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0018\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-¨\u0006."}, m65681d2 = {"Lcom/stripe/android/ui/core/elements/FormItemSpec;", "Landroid/os/Parcelable;", "<init>", "()V", "Lg40/y2;", "sectionFieldElement", "Lzy/c;", "label", "Lg40/w2;", "createSectionElement$payments_ui_core_release", "(Lg40/y2;Lzy/c;)Lg40/w2;", "createSectionElement", "", "sectionFieldElements", "(Ljava/util/List;Lzy/c;)Lg40/w2;", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getApiPath", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getApiPath$annotations", "apiPath", "Companion", "x30/v0", "Lcom/stripe/android/ui/core/elements/AddressSpec;", "Lcom/stripe/android/ui/core/elements/AffirmTextSpec;", "Lcom/stripe/android/ui/core/elements/AfterpayClearpayTextSpec;", "Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec;", "Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateTextSpec;", "Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;", "Lcom/stripe/android/ui/core/elements/BacsDebitConfirmSpec;", "Lcom/stripe/android/ui/core/elements/BsbSpec;", "Lcom/stripe/android/ui/core/elements/CashAppPayMandateTextSpec;", "Lcom/stripe/android/ui/core/elements/CountrySpec;", "Lcom/stripe/android/ui/core/elements/DropdownSpec;", "Lcom/stripe/android/ui/core/elements/EmailSpec;", "Lcom/stripe/android/ui/core/elements/EmptyFormSpec;", "Lcom/stripe/android/ui/core/elements/IbanSpec;", "Lcom/stripe/android/ui/core/elements/KlarnaHeaderStaticTextSpec;", "Lcom/stripe/android/ui/core/elements/KlarnaMandateTextSpec;", "Lcom/stripe/android/ui/core/elements/MandateTextSpec;", "Lcom/stripe/android/ui/core/elements/NameSpec;", "Lcom/stripe/android/ui/core/elements/OTPSpec;", "Lcom/stripe/android/ui/core/elements/PhoneSpec;", "Lcom/stripe/android/ui/core/elements/PlaceholderSpec;", "Lcom/stripe/android/ui/core/elements/SepaMandateTextSpec;", "Lcom/stripe/android/ui/core/elements/SimpleTextSpec;", "Lcom/stripe/android/ui/core/elements/StaticTextSpec;", "payments-ui-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i(with = C37935w0.class)
public abstract class FormItemSpec implements Parcelable {
    public static final int $stable = 0;
    public static final C37933v0 Companion = new C37933v0();

    public /* synthetic */ FormItemSpec(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ C15440w2 createSectionElement$payments_ui_core_release$default(FormItemSpec formItemSpec, InterfaceC15450y2 interfaceC15450y2, InterfaceC41211c interfaceC41211c, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSectionElement");
        }
        if ((i13 & 2) != 0) {
            interfaceC41211c = null;
        }
        return formItemSpec.createSectionElement$payments_ui_core_release(interfaceC15450y2, interfaceC41211c);
    }

    @InterfaceC37143h("api_path")
    public static /* synthetic */ void getApiPath$annotations() {
    }

    public final C15440w2 createSectionElement$payments_ui_core_release(InterfaceC15450y2 sectionFieldElement, InterfaceC41211c label) {
        AbstractC22676k.m65750j(sectionFieldElement, "sectionFieldElement");
        return C15383l0.m43594b(sectionFieldElement, label);
    }

    public abstract IdentifierSpec getApiPath();

    private FormItemSpec() {
    }

    public static /* synthetic */ C15440w2 createSectionElement$payments_ui_core_release$default(FormItemSpec formItemSpec, List list, InterfaceC41211c interfaceC41211c, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSectionElement");
        }
        if ((i13 & 2) != 0) {
            interfaceC41211c = null;
        }
        return formItemSpec.createSectionElement$payments_ui_core_release((List<? extends InterfaceC15450y2>) list, interfaceC41211c);
    }

    public final C15440w2 createSectionElement$payments_ui_core_release(List<? extends InterfaceC15450y2> sectionFieldElements, InterfaceC41211c label) {
        AbstractC22676k.m65750j(sectionFieldElements, "sectionFieldElements");
        return C15383l0.m43595c(sectionFieldElements, label);
    }
}
