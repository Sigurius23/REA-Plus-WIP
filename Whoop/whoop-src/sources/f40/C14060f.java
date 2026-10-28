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

/* JADX INFO: renamed from: f40.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C14060f implements InterfaceC12687a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50370a;

    /* JADX INFO: renamed from: b */
    public static final C14060f f50345b = new C14060f(0);

    /* JADX INFO: renamed from: c */
    public static final C14060f f50346c = new C14060f(1);

    /* JADX INFO: renamed from: d */
    public static final C14060f f50347d = new C14060f(2);

    /* JADX INFO: renamed from: e */
    public static final C14060f f50348e = new C14060f(3);

    /* JADX INFO: renamed from: f */
    public static final C14060f f50349f = new C14060f(4);

    /* JADX INFO: renamed from: g */
    public static final C14060f f50350g = new C14060f(5);

    /* JADX INFO: renamed from: h */
    public static final C14060f f50351h = new C14060f(6);

    /* JADX INFO: renamed from: i */
    public static final C14060f f50352i = new C14060f(7);

    /* JADX INFO: renamed from: j */
    public static final C14060f f50353j = new C14060f(8);

    /* JADX INFO: renamed from: k */
    public static final C14060f f50354k = new C14060f(9);

    /* JADX INFO: renamed from: l */
    public static final C14060f f50355l = new C14060f(10);

    /* JADX INFO: renamed from: m */
    public static final C14060f f50356m = new C14060f(11);

    /* JADX INFO: renamed from: n */
    public static final C14060f f50357n = new C14060f(12);

    /* JADX INFO: renamed from: o */
    public static final C14060f f50358o = new C14060f(13);

    /* JADX INFO: renamed from: p */
    public static final C14060f f50359p = new C14060f(14);

    /* JADX INFO: renamed from: q */
    public static final C14060f f50360q = new C14060f(15);

    /* JADX INFO: renamed from: r */
    public static final C14060f f50361r = new C14060f(16);

    /* JADX INFO: renamed from: s */
    public static final C14060f f50362s = new C14060f(17);

    /* JADX INFO: renamed from: t */
    public static final C14060f f50363t = new C14060f(18);

    /* JADX INFO: renamed from: u */
    public static final C14060f f50364u = new C14060f(19);

    /* JADX INFO: renamed from: v */
    public static final C14060f f50365v = new C14060f(20);

    /* JADX INFO: renamed from: w */
    public static final C14060f f50366w = new C14060f(21);

    /* JADX INFO: renamed from: x */
    public static final C14060f f50367x = new C14060f(22);

    /* JADX INFO: renamed from: y */
    public static final C14060f f50368y = new C14060f(23);

    /* JADX INFO: renamed from: z */
    public static final C14060f f50369z = new C14060f(24);

    /* JADX INFO: renamed from: A */
    public static final C14060f f50340A = new C14060f(25);

    /* JADX INFO: renamed from: B */
    public static final C14060f f50341B = new C14060f(26);

    /* JADX INFO: renamed from: C */
    public static final C14060f f50342C = new C14060f(27);

    /* JADX INFO: renamed from: D */
    public static final C14060f f50343D = new C14060f(28);

    /* JADX INFO: renamed from: E */
    public static final C14060f f50344E = new C14060f(29);

    public /* synthetic */ C14060f(int i13) {
        this.f50370a = i13;
    }

    @Override // e40.InterfaceC12687a
    /* JADX INFO: renamed from: a */
    public final List mo35497a() {
        switch (this.f50370a) {
            case 0:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)));
            case 1:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.SortingCode, false, new FieldSchema(false, (ArrayList) null, NameType.Cedex, 2, (DefaultConstructorMarker) null)));
            case 2:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 3:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.DependentLocality, false, new FieldSchema(false, (ArrayList) null, NameType.Suburb, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.AdministrativeArea, false, new FieldSchema(false, (ArrayList) null, NameType.State, 2, (DefaultConstructorMarker) null)));
            case 4:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.AdministrativeArea, false, new FieldSchema(false, (ArrayList) null, NameType.Department, 2, (DefaultConstructorMarker) null)));
            case 5:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 6:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.PostTown, 2, (DefaultConstructorMarker) null)));
            case 7:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)));
            case 8:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.AdministrativeArea, true, new FieldSchema(false, (ArrayList) null, NameType.District, 2, (DefaultConstructorMarker) null)));
            case 9:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 10:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.DependentLocality, false, new FieldSchema(false, (ArrayList) null, NameType.Suburb, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)));
            case 11:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 12:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.AdministrativeArea, false, new FieldSchema(false, (ArrayList) null, NameType.Province, 2, (DefaultConstructorMarker) null)));
            case 13:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.District, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.AdministrativeArea, false, new FieldSchema(false, (ArrayList) null, NameType.Province, 2, (DefaultConstructorMarker) null)));
            case 14:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.AdministrativeArea, true, new FieldSchema(false, (ArrayList) null, NameType.Island, 2, (DefaultConstructorMarker) null)));
            case 15:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.AdministrativeArea, true, new FieldSchema(false, (ArrayList) null, NameType.Province, 2, (DefaultConstructorMarker) null)));
            case 16:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.DependentLocality, false, new FieldSchema(false, (ArrayList) null, NameType.Suburb, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.AdministrativeArea, false, new FieldSchema(false, (ArrayList) null, NameType.Province, 2, (DefaultConstructorMarker) null)));
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)));
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.SortingCode, false, new FieldSchema(false, (ArrayList) null, NameType.Cedex, 2, (DefaultConstructorMarker) null)));
            case 20:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)));
            case 21:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Zip, 2, (DefaultConstructorMarker) null)));
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 24:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 25:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 26:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.SortingCode, false, new FieldSchema(false, (ArrayList) null, NameType.Cedex, 2, (DefaultConstructorMarker) null)));
            case 27:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 28:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            default:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.AdministrativeArea, true, new FieldSchema(false, (ArrayList) null, NameType.Oblast, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)));
        }
    }
}
