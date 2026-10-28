package p163g1;

import androidx.health.platform.client.proto.C1533u;
import bi.AbstractC3269g;
import com.stripe.android.core.model.Country;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherConfirmationActivity;
import com.whoop.android.R;
import ec3.InterfaceC13058l;
import g31.AbstractC15299c;
import g32.AbstractC15311k;
import g40.AbstractC15380k2;
import g40.C15329c;
import g40.C15335d;
import g40.C15341e;
import g40.C15347f;
import g40.C15349f1;
import g40.C15356g2;
import g40.InterfaceC15361h1;
import g40.InterfaceC15450y2;
import i93.C18277c;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.extensions.internal.ChannelKt;
import io.getstream.chat.android.client.extensions.internal.ThreadKt;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.ThreadParticipant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l83.C23454a0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import n53.C26318e;
import p077d0.C11385o0;
import p088dc.AbstractC11895b;
import p161g.AbstractC14917t;
import p164g2.InterfaceC15241m;
import p209i3.AbstractC18042x;
import p209i3.InterfaceC18044z;
import p412q3.C29891y;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g1.u4 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15160u4 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56860w;

    public /* synthetic */ C15160u4(int i13) {
        this.f56860w = i13;
    }

    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v56, types: [java.lang.Object, java.util.Map] */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f56860w;
        String str = "🌐";
        C25271y c25271y = C25271y.f99162w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i13) {
            case 0:
                C11385o0 c11385o0 = (C11385o0) obj;
                c11385o0.f36506a = 1800;
                c11385o0.m30615a(1267, Float.valueOf(0.0f)).f36485b = AbstractC15170v4.f56908g;
                c11385o0.m30615a(1800, Float.valueOf(1.0f));
                return c23454a0;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Float.valueOf(((Float) obj).floatValue() * 0.7f);
            case 3:
                return ChannelKt.m54666a((Channel) obj);
            case 4:
                return ChannelKt.m54667b((Channel) obj);
            case 5:
                return ThreadKt.upsertThreadParticipantInList$lambda$6((ThreadParticipant) obj);
            case 6:
                AbstractC14917t addCallback = (AbstractC14917t) obj;
                int i14 = PaymentLauncherConfirmationActivity.f22360z;
                AbstractC22676k.m65750j(addCallback, "$this$addCallback");
                return c23454a0;
            case 7:
                return AbstractC15299c.m43422f(((Integer) obj).intValue());
            case 8:
                return AbstractC15311k.m43459E(obj);
            case 9:
                return AbstractC15311k.m43467M(obj);
            case 10:
                List sectionFieldElements = (List) obj;
                AbstractC22676k.m65750j(sectionFieldElements, "sectionFieldElements");
                List list = sectionFieldElements;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC15450y2) it.next()).mo43540i().mo43544f());
                }
                return new C26318e(arrayList.isEmpty() ? AbstractC3269g.m9493Z((InterfaceC15361h1) AbstractC25265s.m74100H0(AbstractC25265s.m74092D0(c25271y))) : new C15329c((InterfaceC13058l[]) AbstractC25265s.m74093D1(arrayList).toArray(new InterfaceC13058l[0]), 0), new C15335d(arrayList, 0));
            case 11:
                List fieldElements = (List) obj;
                AbstractC22676k.m65750j(fieldElements, "fieldElements");
                List list2 = fieldElements;
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((InterfaceC15450y2) it3.next()).mo43535e());
                }
                return new C26318e(arrayList2.isEmpty() ? AbstractC3269g.m9493Z(AbstractC25267u.m74164j0(AbstractC25265s.m74093D1(c25271y))) : new C15329c((InterfaceC13058l[]) AbstractC25265s.m74093D1(arrayList2).toArray(new InterfaceC13058l[0]), 1), new C15335d(arrayList2, 1));
            case 12:
                List fieldElements2 = (List) obj;
                AbstractC22676k.m65750j(fieldElements2, "fieldElements");
                List list3 = fieldElements2;
                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
                Iterator it4 = list3.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(((InterfaceC15450y2) it4.next()).mo43535e());
                }
                return new C26318e(arrayList3.isEmpty() ? AbstractC3269g.m9493Z(AbstractC25267u.m74164j0(AbstractC25265s.m74093D1(c25271y))) : new C15329c((InterfaceC13058l[]) AbstractC25265s.m74093D1(arrayList3).toArray(new InterfaceC13058l[0]), 2), new C15335d(arrayList3, 2));
            case 13:
                List it5 = (List) obj;
                AbstractC22676k.m65750j(it5, "it");
                List list4 = it5;
                ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(list4, 10));
                Iterator it6 = list4.iterator();
                while (it6.hasNext()) {
                    arrayList4.add(((InterfaceC15450y2) it6.next()).mo43538f());
                }
                return new C26318e(arrayList4.isEmpty() ? AbstractC3269g.m9493Z(AbstractC25267u.m74164j0(AbstractC25265s.m74093D1(c25271y))) : new C15329c((InterfaceC13058l[]) AbstractC25265s.m74093D1(arrayList4).toArray(new InterfaceC13058l[0]), 3), new C15335d(arrayList4, 3));
            case 14:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C15349f1 c15349f1 = new C15349f1(R.string.stripe_blank_and_required, null);
                if (zBooleanValue) {
                    return c15349f1;
                }
                return null;
            case 15:
                AbstractC22676k.m65750j((String) obj, "it");
                return c23454a0;
            case 16:
                C15347f addressElement = (C15347f) obj;
                AbstractC22676k.m65750j(addressElement, "addressElement");
                return addressElement.mo43535e();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C15347f addressElement2 = (C15347f) obj;
                AbstractC22676k.m65750j(addressElement2, "addressElement");
                return addressElement2.mo43538f();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C15347f it7 = (C15347f) obj;
                AbstractC22676k.m65750j(it7, "it");
                return it7.f57678r;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C15341e it8 = (C15341e) obj;
                AbstractC22676k.m65750j(it8, "it");
                return it8.f57649b;
            case 20:
                Country country = (Country) obj;
                AbstractC22676k.m65750j(country, "country");
                return country.getName();
            case 21:
                Country country2 = (Country) obj;
                AbstractC22676k.m65750j(country2, "country");
                String countryCode = country2.getCode().getValue();
                AbstractC22676k.m65750j(countryCode, "countryCode");
                if (countryCode.length() == 2) {
                    int iCodePointAt = Character.codePointAt(countryCode, 0) - (-127397);
                    int iCodePointAt2 = Character.codePointAt(countryCode, 1) - (-127397);
                    char[] chars = Character.toChars(iCodePointAt);
                    AbstractC22676k.m65749i(chars, "toChars(...)");
                    char[] chars2 = Character.toChars(iCodePointAt2);
                    AbstractC22676k.m65749i(chars2, "toChars(...)");
                    int length = chars.length;
                    int length2 = chars2.length;
                    char[] cArrCopyOf = Arrays.copyOf(chars, length + length2);
                    System.arraycopy(chars2, 0, cArrCopyOf, length, length2);
                    AbstractC22676k.m65747g(cArrCopyOf);
                    str = new String(cArrCopyOf);
                }
                return AbstractC18489d0.m53370k(str, " ", country2.getName());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return Boolean.valueOf(((Integer) obj) != null);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                InterfaceC15241m focusProperties = (InterfaceC15241m) obj;
                AbstractC22676k.m65750j(focusProperties, "$this$focusProperties");
                focusProperties.mo534b(false);
                return c23454a0;
            case 24:
                AbstractC22676k.m65750j((C29891y) obj, "it");
                return c23454a0;
            case 25:
                InterfaceC18044z semantics = (InterfaceC18044z) obj;
                AbstractC22676k.m65750j(semantics, "$this$semantics");
                AbstractC18042x.m51816a(semantics);
                return c23454a0;
            case 26:
                Country country3 = (Country) obj;
                AbstractC22676k.m65750j(country3, "country");
                String countryCode2 = country3.getCode().getValue();
                AbstractC22676k.m65750j(countryCode2, "countryCode");
                if (countryCode2.length() == 2) {
                    int iCodePointAt3 = Character.codePointAt(countryCode2, 0) - (-127397);
                    int iCodePointAt4 = Character.codePointAt(countryCode2, 1) - (-127397);
                    char[] chars3 = Character.toChars(iCodePointAt3);
                    AbstractC22676k.m65749i(chars3, "toChars(...)");
                    char[] chars4 = Character.toChars(iCodePointAt4);
                    AbstractC22676k.m65749i(chars4, "toChars(...)");
                    int length3 = chars3.length;
                    int length4 = chars4.length;
                    char[] cArrCopyOf2 = Arrays.copyOf(chars3, length3 + length4);
                    System.arraycopy(chars4, 0, cArrCopyOf2, length3, length4);
                    AbstractC22676k.m65747g(cArrCopyOf2);
                    str = new String(cArrCopyOf2);
                }
                C18277c c18277c = AbstractC15380k2.f57813a;
                String countryCode3 = country3.getCode().getValue();
                AbstractC22676k.m65750j(countryCode3, "countryCode");
                ?? r10 = AbstractC15380k2.f57814b;
                String upperCase = countryCode3.toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                C15356g2 c15356g2 = (C15356g2) r10.get(upperCase);
                String str2 = c15356g2 != null ? c15356g2.f57729a : null;
                return AbstractC25265s.m74110N0(AbstractC25260n.m74077r0(new String[]{str, str2 != null ? AbstractC11895b.m31996o("  ", str2, "  ") : null}), "", null, null, null, 62);
            case 27:
                AbstractC15380k2 it9 = (AbstractC15380k2) obj;
                AbstractC22676k.m65750j(it9, "it");
                return it9.mo43576b();
            case 28:
                AbstractC15380k2 it10 = (AbstractC15380k2) obj;
                AbstractC22676k.m65750j(it10, "it");
                return it10.mo43578d();
            default:
                Country country4 = (Country) obj;
                AbstractC22676k.m65750j(country4, "country");
                String countryCode4 = country4.getCode().getValue();
                AbstractC22676k.m65750j(countryCode4, "countryCode");
                if (countryCode4.length() == 2) {
                    int iCodePointAt5 = Character.codePointAt(countryCode4, 0) - (-127397);
                    int iCodePointAt6 = Character.codePointAt(countryCode4, 1) - (-127397);
                    char[] chars5 = Character.toChars(iCodePointAt5);
                    AbstractC22676k.m65749i(chars5, "toChars(...)");
                    char[] chars6 = Character.toChars(iCodePointAt6);
                    AbstractC22676k.m65749i(chars6, "toChars(...)");
                    int length5 = chars5.length;
                    int length6 = chars6.length;
                    char[] cArrCopyOf3 = Arrays.copyOf(chars5, length5 + length6);
                    System.arraycopy(chars6, 0, cArrCopyOf3, length5, length6);
                    AbstractC22676k.m65747g(cArrCopyOf3);
                    str = new String(cArrCopyOf3);
                }
                String name = country4.getName();
                C18277c c18277c2 = AbstractC15380k2.f57813a;
                String countryCode5 = country4.getCode().getValue();
                AbstractC22676k.m65750j(countryCode5, "countryCode");
                ?? r14 = AbstractC15380k2.f57814b;
                String upperCase2 = countryCode5.toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
                C15356g2 c15356g3 = (C15356g2) r14.get(upperCase2);
                return AbstractC25265s.m74110N0(AbstractC25260n.m74077r0(new String[]{str, name, c15356g3 != null ? c15356g3.f57729a : null}), " ", null, null, null, 62);
        }
    }
}
