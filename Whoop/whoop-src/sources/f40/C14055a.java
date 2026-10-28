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

/* JADX INFO: renamed from: f40.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C14055a implements InterfaceC12687a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50215a;

    /* JADX INFO: renamed from: b */
    public static final C14055a f50190b = new C14055a(0);

    /* JADX INFO: renamed from: c */
    public static final C14055a f50191c = new C14055a(1);

    /* JADX INFO: renamed from: d */
    public static final C14055a f50192d = new C14055a(2);

    /* JADX INFO: renamed from: e */
    public static final C14055a f50193e = new C14055a(3);

    /* JADX INFO: renamed from: f */
    public static final C14055a f50194f = new C14055a(4);

    /* JADX INFO: renamed from: g */
    public static final C14055a f50195g = new C14055a(5);

    /* JADX INFO: renamed from: h */
    public static final C14055a f50196h = new C14055a(6);

    /* JADX INFO: renamed from: i */
    public static final C14055a f50197i = new C14055a(7);

    /* JADX INFO: renamed from: j */
    public static final C14055a f50198j = new C14055a(8);

    /* JADX INFO: renamed from: k */
    public static final C14055a f50199k = new C14055a(9);

    /* JADX INFO: renamed from: l */
    public static final C14055a f50200l = new C14055a(10);

    /* JADX INFO: renamed from: m */
    public static final C14055a f50201m = new C14055a(11);

    /* JADX INFO: renamed from: n */
    public static final C14055a f50202n = new C14055a(12);

    /* JADX INFO: renamed from: o */
    public static final C14055a f50203o = new C14055a(13);

    /* JADX INFO: renamed from: p */
    public static final C14055a f50204p = new C14055a(14);

    /* JADX INFO: renamed from: q */
    public static final C14055a f50205q = new C14055a(15);

    /* JADX INFO: renamed from: r */
    public static final C14055a f50206r = new C14055a(16);

    /* JADX INFO: renamed from: s */
    public static final C14055a f50207s = new C14055a(17);

    /* JADX INFO: renamed from: t */
    public static final C14055a f50208t = new C14055a(18);

    /* JADX INFO: renamed from: u */
    public static final C14055a f50209u = new C14055a(19);

    /* JADX INFO: renamed from: v */
    public static final C14055a f50210v = new C14055a(20);

    /* JADX INFO: renamed from: w */
    public static final C14055a f50211w = new C14055a(21);

    /* JADX INFO: renamed from: x */
    public static final C14055a f50212x = new C14055a(22);

    /* JADX INFO: renamed from: y */
    public static final C14055a f50213y = new C14055a(23);

    /* JADX INFO: renamed from: z */
    public static final C14055a f50214z = new C14055a(24);

    /* JADX INFO: renamed from: A */
    public static final C14055a f50185A = new C14055a(25);

    /* JADX INFO: renamed from: B */
    public static final C14055a f50186B = new C14055a(26);

    /* JADX INFO: renamed from: C */
    public static final C14055a f50187C = new C14055a(27);

    /* JADX INFO: renamed from: D */
    public static final C14055a f50188D = new C14055a(28);

    /* JADX INFO: renamed from: E */
    public static final C14055a f50189E = new C14055a(29);

    public /* synthetic */ C14055a(int i13) {
        this.f50215a = i13;
    }

    @Override // e40.InterfaceC12687a
    /* JADX INFO: renamed from: a */
    public final List mo35497a() {
        switch (this.f50215a) {
            case 0:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)));
            case 1:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 2:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.AdministrativeArea, true, new FieldSchema(false, (ArrayList) null, NameType.Emirate, 2, (DefaultConstructorMarker) null)));
            case 3:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)));
            case 4:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, false, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 5:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)));
            case 6:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 7:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.AdministrativeArea, false, new FieldSchema(false, (ArrayList) null, NameType.Province, 2, (DefaultConstructorMarker) null)));
            case 8:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 9:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 10:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.AdministrativeArea, false, new FieldSchema(false, (ArrayList) null, NameType.Province, 2, (DefaultConstructorMarker) null)));
            case 11:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 12:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.SuburbOrCity, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.AdministrativeArea, true, new FieldSchema(false, (ArrayList) null, NameType.State, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)));
            case 13:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 14:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 15:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 16:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.AdministrativeArea, false, new FieldSchema(false, (ArrayList) null, NameType.Parish, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)));
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)));
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 20:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.SortingCode, false, new FieldSchema(false, (ArrayList) null, NameType.Cedex, 2, (DefaultConstructorMarker) null)));
            case 21:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)));
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 24:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 25:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.SortingCode, false, new FieldSchema(false, (ArrayList) null, NameType.Cedex, 2, (DefaultConstructorMarker) null)));
            case 26:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)));
            case 27:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)));
            case 28:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            default:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
        }
    }
}
