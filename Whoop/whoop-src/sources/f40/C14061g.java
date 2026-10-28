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

/* JADX INFO: renamed from: f40.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C14061g implements InterfaceC12687a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50401a;

    /* JADX INFO: renamed from: b */
    public static final C14061g f50376b = new C14061g(0);

    /* JADX INFO: renamed from: c */
    public static final C14061g f50377c = new C14061g(1);

    /* JADX INFO: renamed from: d */
    public static final C14061g f50378d = new C14061g(2);

    /* JADX INFO: renamed from: e */
    public static final C14061g f50379e = new C14061g(3);

    /* JADX INFO: renamed from: f */
    public static final C14061g f50380f = new C14061g(4);

    /* JADX INFO: renamed from: g */
    public static final C14061g f50381g = new C14061g(5);

    /* JADX INFO: renamed from: h */
    public static final C14061g f50382h = new C14061g(6);

    /* JADX INFO: renamed from: i */
    public static final C14061g f50383i = new C14061g(7);

    /* JADX INFO: renamed from: j */
    public static final C14061g f50384j = new C14061g(8);

    /* JADX INFO: renamed from: k */
    public static final C14061g f50385k = new C14061g(9);

    /* JADX INFO: renamed from: l */
    public static final C14061g f50386l = new C14061g(10);

    /* JADX INFO: renamed from: m */
    public static final C14061g f50387m = new C14061g(11);

    /* JADX INFO: renamed from: n */
    public static final C14061g f50388n = new C14061g(12);

    /* JADX INFO: renamed from: o */
    public static final C14061g f50389o = new C14061g(13);

    /* JADX INFO: renamed from: p */
    public static final C14061g f50390p = new C14061g(14);

    /* JADX INFO: renamed from: q */
    public static final C14061g f50391q = new C14061g(15);

    /* JADX INFO: renamed from: r */
    public static final C14061g f50392r = new C14061g(16);

    /* JADX INFO: renamed from: s */
    public static final C14061g f50393s = new C14061g(17);

    /* JADX INFO: renamed from: t */
    public static final C14061g f50394t = new C14061g(18);

    /* JADX INFO: renamed from: u */
    public static final C14061g f50395u = new C14061g(19);

    /* JADX INFO: renamed from: v */
    public static final C14061g f50396v = new C14061g(20);

    /* JADX INFO: renamed from: w */
    public static final C14061g f50397w = new C14061g(21);

    /* JADX INFO: renamed from: x */
    public static final C14061g f50398x = new C14061g(22);

    /* JADX INFO: renamed from: y */
    public static final C14061g f50399y = new C14061g(23);

    /* JADX INFO: renamed from: z */
    public static final C14061g f50400z = new C14061g(24);

    /* JADX INFO: renamed from: A */
    public static final C14061g f50371A = new C14061g(25);

    /* JADX INFO: renamed from: B */
    public static final C14061g f50372B = new C14061g(26);

    /* JADX INFO: renamed from: C */
    public static final C14061g f50373C = new C14061g(27);

    /* JADX INFO: renamed from: D */
    public static final C14061g f50374D = new C14061g(28);

    /* JADX INFO: renamed from: E */
    public static final C14061g f50375E = new C14061g(29);

    public /* synthetic */ C14061g(int i13) {
        this.f50401a = i13;
    }

    @Override // e40.InterfaceC12687a
    /* JADX INFO: renamed from: a */
    public final List mo35497a() {
        switch (this.f50401a) {
            case 0:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 1:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)));
            case 2:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 3:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.AdministrativeArea, false, new FieldSchema(false, (ArrayList) null, NameType.Island, 2, (DefaultConstructorMarker) null)));
            case 4:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.PostTown, 2, (DefaultConstructorMarker) null)));
            case 5:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)));
            case 6:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)));
            case 7:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 8:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.PostTown, 2, (DefaultConstructorMarker) null)));
            case 9:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 10:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 11:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, false, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 12:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 13:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.AdministrativeArea, true, new FieldSchema(false, (ArrayList) null, NameType.Province, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)));
            case 14:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.AdministrativeArea, false, new FieldSchema(false, (ArrayList) null, NameType.Province, 2, (DefaultConstructorMarker) null)));
            case 15:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 16:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.AdministrativeArea, true, new FieldSchema(false, (ArrayList) null, NameType.Province, 2, (DefaultConstructorMarker) null)));
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)));
            case 20:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)));
            case 21:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, true, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)));
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 24:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 25:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.DependentLocality, false, new FieldSchema(false, (ArrayList) null, NameType.Suburb, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.AdministrativeArea, false, new FieldSchema(false, (ArrayList) null, NameType.Province, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)));
            case 26:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 27:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            case 28:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
            default:
                return AbstractC37056f.m118959K(new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null)));
        }
    }
}
