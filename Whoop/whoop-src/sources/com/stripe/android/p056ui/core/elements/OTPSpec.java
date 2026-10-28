package com.stripe.android.p056ui.core.elements;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.uicore.elements.C5705a;
import com.stripe.android.uicore.elements.IdentifierSpec;
import g40.C15389m1;
import g40.C15399o1;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.ObjectSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wr1.C37572f;
import x30.C37871a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m65681d2 = {"Lcom/stripe/android/ui/core/elements/OTPSpec;", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "<init>", "()V", "Lg40/o1;", "transform", "()Lg40/o1;", "Landroid/os/Parcel;", "dest", "", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lwc3/c;", "serializer", "()Lwc3/c;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getApiPath", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "apiPath", "payments-ui-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class OTPSpec extends FormItemSpec {
    public static final OTPSpec INSTANCE = new OTPSpec();
    public static final Parcelable.Creator<OTPSpec> CREATOR = new C37871a(20);
    private static final /* synthetic */ InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C37572f(21));
    public static final int $stable = 8;

    private OTPSpec() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _init_$_anonymous_() {
        return new ObjectSerializer("com.stripe.android.ui.core.elements.OTPSpec", INSTANCE, new Annotation[0]);
    }

    private final /* synthetic */ InterfaceC37138c get$cachedSerializer() {
        return (InterfaceC37138c) $cachedSerializer$delegate.getValue();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        return this == other || (other instanceof OTPSpec);
    }

    @Override // com.stripe.android.p056ui.core.elements.FormItemSpec
    public IdentifierSpec getApiPath() {
        IdentifierSpec.Companion.getClass();
        return C5705a.m16892a("otp");
    }

    public int hashCode() {
        return -1061058889;
    }

    public final InterfaceC37138c serializer() {
        return get$cachedSerializer();
    }

    public String toString() {
        return "OTPSpec";
    }

    public final C15399o1 transform() {
        return new C15399o1(getApiPath(), new C15389m1());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(1);
    }
}
