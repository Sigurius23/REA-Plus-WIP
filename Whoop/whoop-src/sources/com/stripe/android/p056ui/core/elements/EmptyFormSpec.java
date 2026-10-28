package com.stripe.android.p056ui.core.elements;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.uicore.elements.C5705a;
import com.stripe.android.uicore.elements.IdentifierSpec;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.ObjectSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wr1.C37572f;
import x30.C37871a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u001a\u001a\u00020\u00198\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m65681d2 = {"Lcom/stripe/android/ui/core/elements/EmptyFormSpec;", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lwc3/c;", "serializer", "()Lwc3/c;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "apiPath", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getApiPath", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getApiPath$annotations", "payments-ui-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class EmptyFormSpec extends FormItemSpec {
    private static final /* synthetic */ InterfaceC23462h $cachedSerializer$delegate;
    public static final int $stable;
    public static final Parcelable.Creator<EmptyFormSpec> CREATOR;
    public static final EmptyFormSpec INSTANCE = new EmptyFormSpec();
    private static final IdentifierSpec apiPath;

    static {
        IdentifierSpec.Companion.getClass();
        apiPath = C5705a.m16892a("empty");
        CREATOR = new C37871a(13);
        $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C37572f(19));
        $stable = 8;
    }

    private EmptyFormSpec() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _init_$_anonymous_() {
        return new ObjectSerializer("com.stripe.android.ui.core.elements.EmptyFormSpec", INSTANCE, new Annotation[0]);
    }

    private final /* synthetic */ InterfaceC37138c get$cachedSerializer() {
        return (InterfaceC37138c) $cachedSerializer$delegate.getValue();
    }

    @InterfaceC37143h("api_path")
    public static /* synthetic */ void getApiPath$annotations() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        return this == other || (other instanceof EmptyFormSpec);
    }

    @Override // com.stripe.android.p056ui.core.elements.FormItemSpec
    public IdentifierSpec getApiPath() {
        return apiPath;
    }

    public int hashCode() {
        return 780162941;
    }

    public final InterfaceC37138c serializer() {
        return get$cachedSerializer();
    }

    public String toString() {
        return "EmptyFormSpec";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(1);
    }
}
