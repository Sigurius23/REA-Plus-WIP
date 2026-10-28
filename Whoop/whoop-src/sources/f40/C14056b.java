package f40;

import androidx.health.platform.client.proto.C1533u;
import com.stripe.android.uicore.address.CountryAddressSchema;
import com.stripe.android.uicore.address.FieldSchema;
import com.stripe.android.uicore.address.FieldType;
import com.stripe.android.uicore.address.NameType;
import e40.InterfaceC12687a;
import java.util.ArrayList;
import java.util.List;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: f40.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C14056b implements InterfaceC12687a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50246a;

    /* JADX INFO: renamed from: b */
    public static final C14056b f50221b = new C14056b(0);

    /* JADX INFO: renamed from: c */
    public static final C14056b f50222c = new C14056b(1);

    /* JADX INFO: renamed from: d */
    public static final C14056b f50223d = new C14056b(2);

    /* JADX INFO: renamed from: e */
    public static final C14056b f50224e = new C14056b(3);

    /* JADX INFO: renamed from: f */
    public static final C14056b f50225f = new C14056b(4);

    /* JADX INFO: renamed from: g */
    public static final C14056b f50226g = new C14056b(5);

    /* JADX INFO: renamed from: h */
    public static final C14056b f50227h = new C14056b(6);

    /* JADX INFO: renamed from: i */
    public static final C14056b f50228i = new C14056b(7);

    /* JADX INFO: renamed from: j */
    public static final C14056b f50229j = new C14056b(8);

    /* JADX INFO: renamed from: k */
    public static final C14056b f50230k = new C14056b(9);

    /* JADX INFO: renamed from: l */
    public static final C14056b f50231l = new C14056b(10);

    /* JADX INFO: renamed from: m */
    public static final C14056b f50232m = new C14056b(11);

    /* JADX INFO: renamed from: n */
    public static final C14056b f50233n = new C14056b(12);

    /* JADX INFO: renamed from: o */
    public static final C14056b f50234o = new C14056b(13);

    /* JADX INFO: renamed from: p */
    public static final C14056b f50235p = new C14056b(14);

    /* JADX INFO: renamed from: q */
    public static final C14056b f50236q = new C14056b(15);

    /* JADX INFO: renamed from: r */
    public static final C14056b f50237r = new C14056b(16);

    /* JADX INFO: renamed from: s */
    public static final C14056b f50238s = new C14056b(17);

    /* JADX INFO: renamed from: t */
    public static final C14056b f50239t = new C14056b(18);

    /* JADX INFO: renamed from: u */
    public static final C14056b f50240u = new C14056b(19);

    /* JADX INFO: renamed from: v */
    public static final C14056b f50241v = new C14056b(20);

    /* JADX INFO: renamed from: w */
    public static final C14056b f50242w = new C14056b(21);

    /* JADX INFO: renamed from: x */
    public static final C14056b f50243x = new C14056b(22);

    /* JADX INFO: renamed from: y */
    public static final C14056b f50244y = new C14056b(23);

    /* JADX INFO: renamed from: z */
    public static final C14056b f50245z = new C14056b(24);

    /* JADX INFO: renamed from: A */
    public static final C14056b f50216A = new C14056b(25);

    /* JADX INFO: renamed from: B */
    public static final C14056b f50217B = new C14056b(26);

    /* JADX INFO: renamed from: C */
    public static final C14056b f50218C = new C14056b(27);

    /* JADX INFO: renamed from: D */
    public static final C14056b f50219D = new C14056b(28);

    /* JADX INFO: renamed from: E */
    public static final C14056b f50220E = new C14056b(29);

    public /* synthetic */ C14056b(int i13) {
        this.f50246a = i13;
    }

    @Override // e40.InterfaceC12687a
    /* JADX INFO: renamed from: a */
    public final List mo35497a() {
        switch (this.f50246a) {
            case 0:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.DependentLocality, false, new FieldSchema(false, (ArrayList) null, NameType.Neighborhood, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.AdministrativeArea, true, new FieldSchema(false, (ArrayList) null, NameType.State, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)));
            case 1:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.AdministrativeArea, false, new FieldSchema(false, (ArrayList) null, NameType.Island, 2, (DefaultConstructorMarker) null)));
            case 2:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)));
            case 3:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 4:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 5:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.AdministrativeArea, false, new FieldSchema(false, (ArrayList) null, NameType.Oblast, 2, (DefaultConstructorMarker) null)));
            case 6:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 7:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.AdministrativeArea, true, new FieldSchema(false, (ArrayList) null, NameType.Province, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)));
            case 8:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 9:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 10:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 11:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 12:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.SortingCode, false, new FieldSchema(false, (ArrayList) null, NameType.Cedex, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 13:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 14:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.AdministrativeArea, false, new FieldSchema(false, (ArrayList) null, NameType.Province, 2, (DefaultConstructorMarker) null)));
            case 15:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 16:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.AdministrativeArea, true, new FieldSchema(false, (ArrayList) null, NameType.Province, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.DependentLocality, false, new FieldSchema(false, (ArrayList) null, NameType.District, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null));
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, false, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.AdministrativeArea, true, new FieldSchema(false, (ArrayList) null, NameType.Department, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)));
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.AdministrativeArea, true, new FieldSchema(false, (ArrayList) null, NameType.Province, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)));
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.AdministrativeArea, false, new FieldSchema(false, (ArrayList) null, NameType.Island, 2, (DefaultConstructorMarker) null)));
            case 20:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 21:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 24:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 25:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 26:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 27:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 28:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            default:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
        }
    }
}
