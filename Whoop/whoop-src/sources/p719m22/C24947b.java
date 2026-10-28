package p719m22;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import com.stripe.android.p056ui.core.elements.CashAppPayMandateTextSpec;
import com.stripe.android.p056ui.core.elements.FormItemSpec;
import com.stripe.android.p056ui.core.elements.MandateTextSpec;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.whoop.whooplabs.data.room.entity.ProtocolStepMysticReading;
import e41.C12704i;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import l83.C23454a0;
import m72.EnumC25209h;
import mn1.AbstractC25712c;
import mn1.C25710a;
import n03.C26090a;
import no0.AbstractC26933a0;
import no0.C26974t0;
import no1.C26987a;
import nx0.C27218a;
import o42.C27521a;
import o52.C27567n;
import os0.C28305a;
import ox0.C28452f;
import oy2.C28479e;
import p098dt.AbstractC12350b;
import p330n1.C26115o;
import p335n6.C26393j;
import p335n6.InterfaceC26397n;
import p335n6.InterfaceC26398o;
import p335n6.InterfaceC26401r;
import p353o0.C27319c;
import p353o0.C27341y;
import p390p1.C28621h1;
import p545v6.C35720i;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import uf3.C34911a;
import wb3.AbstractC37056f;
import xf3.C38266c;

/* JADX INFO: renamed from: m22.b */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C24947b implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f97665w;

    public /* synthetic */ C24947b(int i13) {
        this.f97665w = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Object objPrevious;
        int i13;
        switch (this.f97665w) {
            case 0:
                return C24948c.m73110c((Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return EnumC25209h._init_$lambda$0((Composer) obj, ((Integer) obj2).intValue());
            case 2:
                return EnumC25209h._init_$lambda$1((Composer) obj, ((Integer) obj2).intValue());
            case 3:
                return C25710a.m75712c((Composer) obj, ((Integer) obj2).intValue());
            case 4:
                return AbstractC25712c.m75736u(((Integer) obj).intValue(), (C12704i) obj2);
            case 5:
                return C26090a.m77612c((Composer) obj, ((Integer) obj2).intValue());
            case 6:
                return (Float) ((C26115o) obj2).f103466a.m30549e();
            case 7:
                String str = (String) obj;
                InterfaceC26397n interfaceC26397n = (InterfaceC26397n) obj2;
                if (str.length() == 0) {
                    return interfaceC26397n.toString();
                }
                return str + ", " + interfaceC26397n;
            case 8:
                ((C26393j) obj).f104845b = (InterfaceC26401r) obj2;
                return C23454a0.f92919a;
            case 9:
                ((C26393j) obj).f104844a = (InterfaceC26398o) obj2;
                return C23454a0.f92919a;
            case 10:
                ((C26393j) obj).f104847d = ((C35720i) obj2).f151961a;
                return C23454a0.f92919a;
            case 11:
                C26393j c26393j = (C26393j) obj;
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                c26393j.getClass();
                return C23454a0.f92919a;
            case 12:
                ((C26393j) obj).f104846c = (Float) obj2;
                return C23454a0.f92919a;
            case 13:
                return AbstractC26933a0.m80408m(((Integer) obj).intValue(), (InterfaceC25312u) obj2);
            case 14:
                return C26974t0.m80812c((Composer) obj, ((Integer) obj2).intValue());
            case 15:
                return C26987a.m80931c((Composer) obj, ((Integer) obj2).intValue());
            case 16:
                return C27218a.m81950c((C38266c) obj, (C34911a) obj2);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                ((Integer) obj2).getClass();
                return new C27319c(1);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C27341y c27341y = (C27341y) obj2;
                return AbstractC37056f.m118959K(Integer.valueOf(((C28621h1) c27341y.f109500d.f16070c).m87024x()), Integer.valueOf(((C28621h1) c27341y.f109500d.f16069b).m87024x()));
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                Set cardBillingIdentifiers = (Set) obj;
                Set externalHiddenIdentifiers = (Set) obj2;
                AbstractC22676k.m65750j(cardBillingIdentifiers, "cardBillingIdentifiers");
                AbstractC22676k.m65750j(externalHiddenIdentifiers, "externalHiddenIdentifiers");
                return AbstractC12350b.m34556E(externalHiddenIdentifiers, cardBillingIdentifiers);
            case 20:
                Set hiddenIds = (Set) obj;
                List textFieldControllerIds = (List) obj2;
                AbstractC22676k.m65750j(hiddenIds, "hiddenIds");
                AbstractC22676k.m65750j(textFieldControllerIds, "textFieldControllerIds");
                ListIterator listIterator = textFieldControllerIds.listIterator(textFieldControllerIds.size());
                while (listIterator.hasPrevious()) {
                    objPrevious = listIterator.previous();
                    if (!hiddenIds.contains((IdentifierSpec) objPrevious)) {
                        return (IdentifierSpec) objPrevious;
                    }
                }
                objPrevious = null;
                return (IdentifierSpec) objPrevious;
            case 21:
                FormItemSpec formItemSpec = (FormItemSpec) obj;
                FormItemSpec formItemSpec2 = (FormItemSpec) obj2;
                if ((formItemSpec instanceof MandateTextSpec) || (formItemSpec instanceof CashAppPayMandateTextSpec)) {
                    i13 = 1;
                } else {
                    i13 = ((formItemSpec2 instanceof MandateTextSpec) || (formItemSpec2 instanceof CashAppPayMandateTextSpec)) ? -1 : 0;
                }
                return Integer.valueOf(i13);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C27521a.m82957c((Composer) obj, ((Integer) obj2).intValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C27567n.m83210O0((Integer) obj, (List) obj2);
            case 24:
                return C28305a.m85752c((Composer) obj, ((Integer) obj2).intValue());
            case 25:
                return C28452f.m86254k((Composer) obj, ((Integer) obj2).intValue());
            case 26:
                return C28452f.m86253j((Composer) obj, ((Integer) obj2).intValue());
            case 27:
                return C28479e.m86600F0((ProtocolStepMysticReading) obj, (Integer) obj2);
            case 28:
                return C28479e.m86606I0((ProtocolStepMysticReading) obj, (Integer) obj2);
            default:
                return C28479e.m86612L0((ProtocolStepMysticReading) obj, (Integer) obj2);
        }
    }
}
