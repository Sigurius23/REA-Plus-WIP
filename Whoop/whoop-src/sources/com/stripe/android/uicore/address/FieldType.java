package com.stripe.android.uicore.address;

import com.stripe.android.uicore.elements.IdentifierSpec;
import com.whoop.android.R;
import dx2.C12430a;
import e40.C12690d;
import e40.C12691e;
import e40.C12692f;
import ge3.AbstractC15751g;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.EnumsKt;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import t83.InterfaceC33616a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\fj\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, m65681d2 = {"Lcom/stripe/android/uicore/address/FieldType;", "", "", "serializedValue", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "identifierSpec", "", "defaultLabel", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V", "Lq3/m;", "capitalization-IUNYP9k", "()I", "capitalization", "Ljava/lang/String;", "getSerializedValue", "()Ljava/lang/String;", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getIdentifierSpec", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "I", "getDefaultLabel", "Companion", "e40/d", "AddressLine1", "AddressLine2", "Locality", "DependentLocality", "PostalCode", "SortingCode", "AdministrativeArea", "Name", "stripe-ui-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public class FieldType {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ FieldType[] $VALUES;
    private static final InterfaceC23462h $cachedSerializer$delegate;

    @InterfaceC37143h("addressLine1")
    public static final FieldType AddressLine1;

    @InterfaceC37143h("addressLine2")
    public static final FieldType AddressLine2;

    @InterfaceC37143h("administrativeArea")
    public static final FieldType AdministrativeArea;
    public static final C12690d Companion;

    @InterfaceC37143h("dependentLocality")
    public static final FieldType DependentLocality;

    @InterfaceC37143h("locality")
    public static final FieldType Locality;

    @InterfaceC37143h("name")
    public static final FieldType Name;

    @InterfaceC37143h("postalCode")
    public static final FieldType PostalCode;

    @InterfaceC37143h("sortingCode")
    public static final FieldType SortingCode;
    private final int defaultLabel;
    private final IdentifierSpec identifierSpec;
    private final String serializedValue;

    private static final /* synthetic */ FieldType[] $values() {
        return new FieldType[]{AddressLine1, AddressLine2, Locality, DependentLocality, PostalCode, SortingCode, AdministrativeArea, Name};
    }

    static {
        IdentifierSpec.Companion.getClass();
        AddressLine1 = new FieldType("AddressLine1", 0, "addressLine1", IdentifierSpec.Line1, R.string.stripe_address_label_address_line1);
        AddressLine2 = new FieldType("AddressLine2", 1, "addressLine2", IdentifierSpec.Line2, R.string.stripe_address_label_address_line2);
        Locality = new FieldType("Locality", 2, "locality", IdentifierSpec.City, R.string.stripe_address_label_city);
        DependentLocality = new FieldType("DependentLocality", 3, "dependentLocality", IdentifierSpec.DependentLocality, R.string.stripe_address_label_city);
        PostalCode = new C12691e("PostalCode", 4, "postalCode", IdentifierSpec.PostalCode, R.string.stripe_address_label_postal_code, null);
        SortingCode = new C12692f("SortingCode", 5, "sortingCode", IdentifierSpec.SortingCode, R.string.stripe_address_label_postal_code, null);
        AdministrativeArea = new FieldType("AdministrativeArea", 6, "administrativeArea", IdentifierSpec.State, NameType.State.getStringResId());
        Name = new FieldType("Name", 7, "name", IdentifierSpec.Name, R.string.stripe_address_label_full_name);
        FieldType[] fieldTypeArr$values = $values();
        $VALUES = fieldTypeArr$values;
        $ENTRIES = AbstractC15751g.m44468u(fieldTypeArr$values);
        Companion = new C12690d();
        $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C12430a(17));
    }

    public /* synthetic */ FieldType(String str, int i13, String str2, IdentifierSpec identifierSpec, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, str2, identifierSpec, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.stripe.android.uicore.address.FieldType", values(), new String[]{"addressLine1", "addressLine2", "locality", "dependentLocality", "postalCode", "sortingCode", "administrativeArea", "name"}, new Annotation[][]{null, null, null, null, null, null, null, null}, null);
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static FieldType valueOf(String str) {
        return (FieldType) Enum.valueOf(FieldType.class, str);
    }

    public static FieldType[] values() {
        return (FieldType[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: capitalization-IUNYP9k, reason: not valid java name */
    public int mo134139capitalizationIUNYP9k() {
        return 2;
    }

    public final int getDefaultLabel() {
        return this.defaultLabel;
    }

    public final IdentifierSpec getIdentifierSpec() {
        return this.identifierSpec;
    }

    public final String getSerializedValue() {
        return this.serializedValue;
    }

    private FieldType(String str, int i13, String str2, IdentifierSpec identifierSpec, int i14) {
        super(str, i13);
        this.serializedValue = str2;
        this.identifierSpec = identifierSpec;
        this.defaultLabel = i14;
    }
}
