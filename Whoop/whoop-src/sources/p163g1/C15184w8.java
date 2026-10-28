package p163g1;

import a30.C0273a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import com.whoop.android.R;
import e41.EnumC12706k;
import g40.AbstractC15380k2;
import g40.C15347f;
import g40.C15349f1;
import g40.InterfaceC15361h1;
import g40.InterfaceC15421s3;
import gh0.C15846a;
import gp2.C16066a;
import gv1.C16228b;
import h60.C16972a;
import hy0.AbstractC17726b1;
import hy0.AbstractC17741f0;
import hy0.C17724b;
import hz1.C17815a;
import i11.AbstractC17862e;
import i22.AbstractC18015c;
import java.util.List;
import java.util.Map;
import l40.C23328a;
import my.EnumC26028b;
import p635y2.InterfaceC39124q0;
import p715kotlin.jvm.internal.AbstractC22676k;
import uf3.C34911a;
import v00.C35459c0;
import v00.C35482o;
import v00.C35484p;
import xf3.C38266c;

/* JADX INFO: renamed from: g1.w8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15184w8 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56985w;

    public /* synthetic */ C15184w8(int i13) {
        this.f56985w = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C35484p c35484p;
        switch (this.f56985w) {
            case 0:
                return Integer.valueOf(((InterfaceC39124q0) obj).mo449b(((Integer) obj2).intValue()));
            case 1:
                return Integer.valueOf(((InterfaceC39124q0) obj).mo446O(((Integer) obj2).intValue()));
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                String value = (String) obj2;
                AbstractC22676k.m65750j(value, "value");
                return new C23328a(value, zBooleanValue);
            case 3:
                C15347f element = (C15347f) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                AbstractC22676k.m65750j(element, "element");
                element.mo43537b(zBooleanValue2);
                return element;
            case 4:
                Integer num = (Integer) obj2;
                if (((Boolean) obj).booleanValue() && num == null) {
                    return new C15349f1(R.string.stripe_blank_and_required, null);
                }
                return null;
            case 5:
                return new C23328a((String) obj2, ((Boolean) obj).booleanValue());
            case 6:
                String value2 = (String) obj;
                AbstractC15380k2 formatter = (AbstractC15380k2) obj2;
                AbstractC22676k.m65750j(value2, "value");
                AbstractC22676k.m65750j(formatter, "formatter");
                return formatter.mo43579e(value2);
            case 7:
                String rawFieldValue = (String) obj;
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                AbstractC22676k.m65750j(rawFieldValue, "rawFieldValue");
                return new C23328a(rawFieldValue, zBooleanValue3);
            case 8:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                InterfaceC15421s3 fieldState = (InterfaceC15421s3) obj2;
                AbstractC22676k.m65750j(fieldState, "fieldState");
                InterfaceC15361h1 interfaceC15361h1Mo43602f = fieldState.mo43602f();
                if (interfaceC15361h1Mo43602f == null || !zBooleanValue4) {
                    return null;
                }
                return interfaceC15361h1Mo43602f;
            case 9:
                boolean zBooleanValue5 = ((Boolean) obj).booleanValue();
                String value3 = (String) obj2;
                AbstractC22676k.m65750j(value3, "value");
                return new C23328a(value3, zBooleanValue5);
            case 10:
                return C15846a.m44682c((Composer) obj, ((Integer) obj2).intValue());
            case 11:
                return C16066a.m45360c((Composer) obj, ((Integer) obj2).intValue());
            case 12:
                return C16228b.m45935c((Composer) obj, ((Integer) obj2).intValue());
            case 13:
                C35482o c35482o = (C35482o) obj2;
                return Boolean.valueOf(c35482o != null ? c35482o.f151056y : false);
            case 14:
                List paymentMethods = (List) obj;
                C35482o c35482o2 = (C35482o) obj2;
                AbstractC22676k.m65750j(paymentMethods, "paymentMethods");
                boolean z4 = false;
                if (c35482o2 != null) {
                    EnumC26028b enumC26028b = c35482o2.f151054w;
                    boolean z13 = enumC26028b == EnumC26028b.Full || enumC26028b == EnumC26028b.Partial;
                    boolean z14 = c35482o2.f151055x;
                    int size = paymentMethods.size();
                    if (size != 0) {
                        if (size != 1) {
                            z4 = z13;
                        } else if (z14 && z13) {
                            z4 = true;
                        }
                    }
                }
                return Boolean.valueOf(z4);
            case 15:
                C0273a c0273a = (C0273a) obj;
                C35459c0 c35459c0 = (C35459c0) obj2;
                if (c35459c0 == null || (c35484p = c35459c0.f150973P) == null || !c35484p.f151062z || c0273a == null) {
                    return null;
                }
                return c0273a.f936x;
            case 16:
                return C16972a.m47735c((Composer) obj, ((Integer) obj2).intValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C17724b.m50762g((Composer) obj, ((Integer) obj2).intValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C17724b.m50760e((Composer) obj, ((Integer) obj2).intValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C17724b.m50761f((Composer) obj, ((Integer) obj2).intValue());
            case 20:
                return AbstractC17741f0.m50857s((Modifier) obj, ((Integer) obj2).intValue());
            case 21:
                return AbstractC17741f0.m50859u((Modifier) obj, ((Integer) obj2).intValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC17726b1.m50794l((EnumC12706k) obj, (EnumC12706k) obj2);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C17815a.m51240f((C38266c) obj, (C34911a) obj2);
            case 24:
                return C17815a.m51241g((C38266c) obj, (C34911a) obj2);
            case 25:
                return C17815a.m51242h((C38266c) obj, (C34911a) obj2);
            case 26:
                return C17815a.m51243i((C38266c) obj, (C34911a) obj2);
            case 27:
                return AbstractC17862e.m51359r((String) obj, (Long) obj2);
            case 28:
                return AbstractC18015c.m51725F((String) obj, (Map) obj2);
            default:
                return AbstractC18015c.m51762w((String) obj, (Map) obj2);
        }
    }
}
