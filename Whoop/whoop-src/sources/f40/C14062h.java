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

/* JADX INFO: renamed from: f40.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C14062h implements InterfaceC12687a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50429a;

    /* JADX INFO: renamed from: b */
    public static final C14062h f50404b = new C14062h(0);

    /* JADX INFO: renamed from: c */
    public static final C14062h f50405c = new C14062h(1);

    /* JADX INFO: renamed from: d */
    public static final C14062h f50406d = new C14062h(2);

    /* JADX INFO: renamed from: e */
    public static final C14062h f50407e = new C14062h(3);

    /* JADX INFO: renamed from: f */
    public static final C14062h f50408f = new C14062h(4);

    /* JADX INFO: renamed from: g */
    public static final C14062h f50409g = new C14062h(5);

    /* JADX INFO: renamed from: h */
    public static final C14062h f50410h = new C14062h(6);

    /* JADX INFO: renamed from: i */
    public static final C14062h f50411i = new C14062h(7);

    /* JADX INFO: renamed from: j */
    public static final C14062h f50412j = new C14062h(8);

    /* JADX INFO: renamed from: k */
    public static final C14062h f50413k = new C14062h(9);

    /* JADX INFO: renamed from: l */
    public static final C14062h f50414l = new C14062h(10);

    /* JADX INFO: renamed from: m */
    public static final C14062h f50415m = new C14062h(11);

    /* JADX INFO: renamed from: n */
    public static final C14062h f50416n = new C14062h(12);

    /* JADX INFO: renamed from: o */
    public static final C14062h f50417o = new C14062h(13);

    /* JADX INFO: renamed from: p */
    public static final C14062h f50418p = new C14062h(14);

    /* JADX INFO: renamed from: q */
    public static final C14062h f50419q = new C14062h(15);

    /* JADX INFO: renamed from: r */
    public static final C14062h f50420r = new C14062h(16);

    /* JADX INFO: renamed from: s */
    public static final C14062h f50421s = new C14062h(17);

    /* JADX INFO: renamed from: t */
    public static final C14062h f50422t = new C14062h(18);

    /* JADX INFO: renamed from: u */
    public static final C14062h f50423u = new C14062h(19);

    /* JADX INFO: renamed from: v */
    public static final C14062h f50424v = new C14062h(20);

    /* JADX INFO: renamed from: w */
    public static final C14062h f50425w = new C14062h(21);

    /* JADX INFO: renamed from: x */
    public static final C14062h f50426x = new C14062h(22);

    /* JADX INFO: renamed from: y */
    public static final C14062h f50427y = new C14062h(23);

    /* JADX INFO: renamed from: z */
    public static final C14062h f50428z = new C14062h(24);

    /* JADX INFO: renamed from: A */
    public static final C14062h f50402A = new C14062h(25);

    /* JADX INFO: renamed from: B */
    public static final C14062h f50403B = new C14062h(26);

    public /* synthetic */ C14062h(int i13) {
        this.f50429a = i13;
    }

    @Override // e40.InterfaceC12687a
    /* JADX INFO: renamed from: a */
    public final List mo35497a() {
        switch (this.f50429a) {
            case 0:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 1:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 2:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.District, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.AdministrativeArea, false, new FieldSchema(false, (ArrayList) null, NameType.Province, 2, (DefaultConstructorMarker) null)));
            case 3:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 4:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.AdministrativeArea, false, new FieldSchema(false, (ArrayList) null, NameType.Island, 2, (DefaultConstructorMarker) null)));
            case 5:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.AdministrativeArea, true, new FieldSchema(false, (ArrayList) null, NameType.County, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null));
            case 6:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 7:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.AdministrativeArea, false, new FieldSchema(false, (ArrayList) null, NameType.Oblast, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)));
            case 8:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 9:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(true, (ArrayList) null, NameType.Zip, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.AdministrativeArea, true, new FieldSchema(false, (ArrayList) null, NameType.State, 2, (DefaultConstructorMarker) null)));
            case 10:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.AdministrativeArea, false, new FieldSchema(false, (ArrayList) null, NameType.Province, 2, (DefaultConstructorMarker) null)));
            case 11:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.AdministrativeArea, false, new FieldSchema(false, (ArrayList) null, NameType.Province, 2, (DefaultConstructorMarker) null)));
            case 12:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 13:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)));
            case 14:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.AdministrativeArea, true, new FieldSchema(false, (ArrayList) null, NameType.State, 2, (DefaultConstructorMarker) null)));
            case 15:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, false, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)));
            case 16:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.AdministrativeArea, false, new FieldSchema(false, (ArrayList) null, NameType.Province, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)));
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.SortingCode, false, new FieldSchema(false, (ArrayList) null, NameType.Cedex, 2, (DefaultConstructorMarker) null)));
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 20:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 21:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.SortingCode, false, new FieldSchema(false, (ArrayList) null, NameType.Cedex, 2, (DefaultConstructorMarker) null)));
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.DependentLocality, false, new FieldSchema(false, (ArrayList) null, NameType.Suburb, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)));
            case 24:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 25:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            default:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
        }
    }
}
