package com.stripe.android.p056ui.core.elements;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.uicore.elements.C5705a;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.IdentifierSpec$$serializer;
import com.whoop.android.R;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import do0.C12229c;
import g40.C15333c3;
import g40.C15351f3;
import g40.C15440w2;
import java.util.Map;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import m83.C25271y;
import p012ab.C0684i0;
import p479s4.AbstractC32128i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import wc3.InterfaceC37144i;
import x30.C37871a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 )2\u00020\u0001:\u0002*+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B9\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0002\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u001a\u001a\u00020\u00192\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u0012\u0004\b$\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\b\u0010#\u0012\u0004\b%\u0010\u0003R \u0010\t\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\t\u0010#\u0012\u0004\b(\u0010\u0003\u001a\u0004\b&\u0010'¨\u0006,"}, m65681d2 = {"Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "<init>", "()V", "", "seen0", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "sortCodeIdentifier", "accountNumberIdentifier", "apiPath", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/IdentifierSpec;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$payments_ui_core_release", "(Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;Lzc3/c;Lyc3/g;)V", "write$Self", "", "", "initialValues", "Lg40/w2;", "transform", "(Ljava/util/Map;)Lg40/w2;", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getSortCodeIdentifier$annotations", "getAccountNumberIdentifier$annotations", "getApiPath", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getApiPath$annotations", "Companion", "com/stripe/android/ui/core/elements/f", "$serializer", "payments-ui-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final class BacsDebitBankAccountSpec extends FormItemSpec {

    @Deprecated
    public static final String ACCOUNT_NUMBER_API_PATH = "bacs_debit[account_number]";

    @Deprecated
    public static final String SORT_CODE_API_PATH = "bacs_debit[sort_code]";
    private final IdentifierSpec accountNumberIdentifier;
    private final IdentifierSpec apiPath;
    private final IdentifierSpec sortCodeIdentifier;
    private static final C5681f Companion = new C5681f();
    public static final Parcelable.Creator<BacsDebitBankAccountSpec> CREATOR = new C37871a(5);
    public static final int $stable = IdentifierSpec.$stable;

    public /* synthetic */ BacsDebitBankAccountSpec(int i13, IdentifierSpec identifierSpec, IdentifierSpec identifierSpec2, IdentifierSpec identifierSpec3, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if ((i13 & 1) == 0) {
            IdentifierSpec.Companion.getClass();
            identifierSpec = C5705a.m16892a(SORT_CODE_API_PATH);
        }
        this.sortCodeIdentifier = identifierSpec;
        if ((i13 & 2) == 0) {
            IdentifierSpec.Companion.getClass();
            this.accountNumberIdentifier = C5705a.m16892a(ACCOUNT_NUMBER_API_PATH);
        } else {
            this.accountNumberIdentifier = identifierSpec2;
        }
        if ((i13 & 4) == 0) {
            this.apiPath = new IdentifierSpec();
        } else {
            this.apiPath = identifierSpec3;
        }
    }

    private static /* synthetic */ void getAccountNumberIdentifier$annotations() {
    }

    public static /* synthetic */ void getApiPath$annotations() {
    }

    private static /* synthetic */ void getSortCodeIdentifier$annotations() {
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static final /* synthetic */ void write$Self$payments_ui_core_release(BacsDebitBankAccountSpec self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0)) {
            output.encodeSerializableElement(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.sortCodeIdentifier);
        } else {
            IdentifierSpec identifierSpec = self.sortCodeIdentifier;
            IdentifierSpec.Companion.getClass();
            if (!AbstractC22676k.m65745e(identifierSpec, C5705a.m16892a(SORT_CODE_API_PATH))) {
                output.encodeSerializableElement(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.sortCodeIdentifier);
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1)) {
            output.encodeSerializableElement(serialDesc, 1, IdentifierSpec$$serializer.INSTANCE, self.accountNumberIdentifier);
        } else {
            IdentifierSpec identifierSpec2 = self.accountNumberIdentifier;
            IdentifierSpec.Companion.getClass();
            if (!AbstractC22676k.m65745e(identifierSpec2, C5705a.m16892a(ACCOUNT_NUMBER_API_PATH))) {
                output.encodeSerializableElement(serialDesc, 1, IdentifierSpec$$serializer.INSTANCE, self.accountNumberIdentifier);
            }
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && AbstractC22676k.m65745e(self.getApiPath(), new IdentifierSpec())) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 2, IdentifierSpec$$serializer.INSTANCE, self.getApiPath());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.p056ui.core.elements.FormItemSpec
    public IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    public final C15440w2 transform(Map<IdentifierSpec, String> initialValues) {
        AbstractC22676k.m65750j(initialValues, "initialValues");
        C12229c c12229c = null;
        int i13 = 4;
        return createSectionElement$payments_ui_core_release(AbstractC37056f.m118959K(new C15333c3(this.sortCodeIdentifier, new C15351f3(new C0684i0(9), initialValues.get(this.sortCodeIdentifier), c12229c, i13)), new C15333c3(this.accountNumberIdentifier, new C15351f3(new C0684i0(8), initialValues.get(this.accountNumberIdentifier), c12229c, i13))), AbstractC32128i.m100064s(R.string.stripe_bacs_bank_account_title, new Object[0], C25271y.f99162w));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(1);
    }

    public BacsDebitBankAccountSpec() {
        super(null);
        IdentifierSpec.Companion.getClass();
        this.sortCodeIdentifier = C5705a.m16892a(SORT_CODE_API_PATH);
        this.accountNumberIdentifier = C5705a.m16892a(ACCOUNT_NUMBER_API_PATH);
        this.apiPath = new IdentifierSpec();
    }
}
