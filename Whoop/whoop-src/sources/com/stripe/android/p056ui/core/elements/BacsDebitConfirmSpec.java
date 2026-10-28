package com.stripe.android.p056ui.core.elements;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.IdentifierSpec$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import e10.C12554k0;
import g40.C15336d0;
import g40.C15342e0;
import java.util.Map;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37144i;
import x30.C37871a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 &2\u00020\u0001:\u0002'(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B%\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0004¢\u0006\u0004\b \u0010!R \u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u0012\u0004\b%\u0010\u0003\u001a\u0004\b#\u0010$¨\u0006)"}, m65681d2 = {"Lcom/stripe/android/ui/core/elements/BacsDebitConfirmSpec;", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "<init>", "()V", "", "seen0", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "apiPath", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/stripe/android/uicore/elements/IdentifierSpec;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$payments_ui_core_release", "(Lcom/stripe/android/ui/core/elements/BacsDebitConfirmSpec;Lzc3/c;Lyc3/g;)V", "write$Self", "", "merchantName", "", "initialValues", "Lg40/e0;", "transform", "(Ljava/lang/String;Ljava/util/Map;)Lg40/e0;", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getApiPath", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getApiPath$annotations", "Companion", "$serializer", "com/stripe/android/ui/core/elements/g", "payments-ui-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final class BacsDebitConfirmSpec extends FormItemSpec {
    private final IdentifierSpec apiPath;
    public static final C5682g Companion = new C5682g();
    public static final Parcelable.Creator<BacsDebitConfirmSpec> CREATOR = new C37871a(6);
    public static final int $stable = IdentifierSpec.$stable;

    public BacsDebitConfirmSpec(int i13, IdentifierSpec identifierSpec, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if ((i13 & 1) != 0) {
            this.apiPath = identifierSpec;
        } else {
            IdentifierSpec.Companion.getClass();
            this.apiPath = IdentifierSpec.BacsDebitConfirmed;
        }
    }

    public static /* synthetic */ void getApiPath$annotations() {
    }

    public static final void write$Self$payments_ui_core_release(BacsDebitConfirmSpec self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (!output.shouldEncodeElementDefault(serialDesc, 0)) {
            IdentifierSpec apiPath = self.getApiPath();
            IdentifierSpec.Companion.getClass();
            if (AbstractC22676k.m65745e(apiPath, IdentifierSpec.BacsDebitConfirmed)) {
                return;
            }
        }
        output.encodeSerializableElement(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.getApiPath());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.p056ui.core.elements.FormItemSpec
    public IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    public final C15342e0 transform(String merchantName, Map<IdentifierSpec, String> initialValues) {
        AbstractC22676k.m65750j(merchantName, "merchantName");
        AbstractC22676k.m65750j(initialValues, "initialValues");
        return new C15342e0(getApiPath(), new C15336d0(new C12554k0(new Object[]{merchantName}, 18), Boolean.parseBoolean(initialValues.get(getApiPath()))));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(1);
    }

    public BacsDebitConfirmSpec() {
        super(null);
        IdentifierSpec.Companion.getClass();
        this.apiPath = IdentifierSpec.BacsDebitConfirmed;
    }
}
