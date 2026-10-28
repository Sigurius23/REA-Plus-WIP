package eg;

import ae3.C0803k;
import android.os.Parcelable;
import androidx.health.platform.client.proto.C1533u;
import be0.AbstractC3165a;
import be0.C3166b;
import bp1.AbstractC3535b;
import bp1.C3536c;
import c93.InterfaceC4339a;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.whoop.advancedlabs.schedulingform.view.SchedulingFormFragment;
import com.whoop.android.R;
import com.whoop.bot.models.feedback.FeedbackReason;
import com.whoop.health.view.HealthTabFragment;
import com.whoop.hormonalinsights.onboarding.view.MciOnboardingFragment;
import com.whoop.nativestore.pdp.sizeguide.view.SizeGuideDialogFragment;
import com.whoop.weightlifting.data.domain.WorkoutExercise;
import cy2.AbstractC11187a;
import cz0.C11244e;
import e40.InterfaceC12689c;
import e93.AbstractC12889b;
import ec3.C13045h2;
import ep1.AbstractC13413h;
import fu2.C14789d;
import fy2.AbstractC14879a;
import g40.AbstractC15327b3;
import g40.AbstractC15387m;
import g40.C15333c3;
import g40.C15336d0;
import g40.C15339d3;
import g40.C15342e0;
import g40.C15347f;
import g40.C15349f1;
import g40.C15351f3;
import g40.C15399o1;
import g40.C15411q3;
import g40.C15422t;
import g40.C15435v2;
import g40.C15437w;
import g40.C15442x;
import g40.InterfaceC15386l3;
import g40.InterfaceC15391m3;
import g40.InterfaceC15447y;
import g40.InterfaceC15450y2;
import gh0.AbstractC15850e;
import gy2.C16282a;
import ha0.C17050c;
import ha0.C17054g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kb1.C22325e;
import l40.C23328a;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25271y;
import m83.C25272z;
import p078d1.C11456i;
import p148fg.C14431a;
import p148fg.C14432b;
import p148fg.C14439i;
import p148fg.C14440j;
import p148fg.C14441k;
import p148fg.C14445o;
import p148fg.InterfaceC14438h;
import p148fg.InterfaceC14442l;
import p148fg.InterfaceC14444n;
import p163g1.AbstractC15108p2;
import p163g1.C15072l6;
import p163g1.C15118q2;
import p163g1.C15136s0;
import p163g1.C15168v2;
import p164g2.C15247s;
import p180h0.C16489z3;
import p181h2.C16617b;
import p221ii.AbstractC18532b;
import p437qt.C30582e;
import p461rh.InterfaceC31421j;
import p500tb.InterfaceC33687a;
import p512u2.AbstractC34454d0;
import p512u2.C34472r;
import p636y3.C39178j;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22665e0;
import qg3.C30352d;
import wb3.AbstractC37056f;
import zc0.AbstractC40262a;
import zc0.C40263b;

/* JADX INFO: renamed from: eg.j */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C13161j implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f45586w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f45587x;

    public /* synthetic */ C13161j(Object obj, int i13) {
        this.f45586w = i13;
        this.f45587x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f45586w) {
            case 0:
                C0803k c0803k = (C0803k) this.f45587x;
                C13162k c13162k = (C13162k) obj;
                AbstractC22676k.m65750j(c13162k, "<this>");
                c13162k.f45588a.m60617a((C14441k) c0803k.f2965c);
                c13162k.f45589b = c0803k.f2964b;
                c13162k.f45590c.m60617a((InterfaceC14444n) c0803k.f2966d);
                return C23454a0.f92919a;
            case 1:
                return HealthTabFragment.m21517G((HealthTabFragment) this.f45587x, ((Boolean) obj).booleanValue());
            case 2:
                return AbstractC13413h.m37931B((LinkedHashMap) this.f45587x, (C22325e) obj);
            case 3:
                return MciOnboardingFragment.m22081R((C3536c) this.f45587x, (AbstractC3535b) obj);
            case 4:
                return SizeGuideDialogFragment.m22988M((SizeGuideDialogFragment) this.f45587x, obj);
            case 5:
                return SchedulingFormFragment.m17566i0((C40263b) this.f45587x, (AbstractC40262a) obj);
            case 6:
                return SchedulingFormFragment.m17560c0((C3166b) this.f45587x, (AbstractC3165a) obj);
            case 7:
                C14432b c14432b = (C14432b) this.f45587x;
                InterfaceC14442l interfaceC14442l = (InterfaceC14442l) obj;
                AbstractC22676k.m65750j(interfaceC14442l, "<this>");
                if (interfaceC14442l instanceof C14431a) {
                    C14431a c14431a = (C14431a) interfaceC14442l;
                    c14432b.getClass();
                    c14431a.f52670a = c14432b.f52675a;
                    c14431a.f52671b = c14432b.f52676b;
                    c14431a.f52672c = c14432b.f52677c;
                    c14431a.f52673d = c14432b.f52678d;
                    c14431a.f52674e = c14432b.f52679e;
                }
                return C23454a0.f92919a;
            case 8:
                C14440j c14440j = (C14440j) this.f45587x;
                InterfaceC14438h interfaceC14438h = (InterfaceC14438h) obj;
                AbstractC22676k.m65750j(interfaceC14438h, "<this>");
                if (interfaceC14438h instanceof C14439i) {
                    C14439i c14439i = (C14439i) interfaceC14438h;
                    c14439i.f52712a = c14440j.f52716a;
                    c14439i.f52713b = c14440j.f52717b;
                    c14439i.f52714c = c14440j.f52718c;
                    c14439i.f52715d = c14440j.f52719d;
                }
                return C23454a0.f92919a;
            case 9:
                C30582e c30582e = (C30582e) this.f45587x;
                AbstractC22676k.m65750j((C14445o) obj, "<this>");
                c30582e.getClass();
                return C23454a0.f92919a;
            case 10:
                return (InterfaceC31421j) this.f45587x;
            case 11:
                C22665e0 c22665e0 = (C22665e0) this.f45587x;
                StringBuilder sb4 = new StringBuilder();
                int i13 = c22665e0.f89334w;
                c22665e0.f89334w = i13 + 1;
                sb4.append(i13);
                sb4.append(':');
                sb4.append(((AbstractC18532b) obj).getCacheKey());
                return sb4.toString();
            case 12:
                return C14789d.m42504o((C14789d) this.f45587x, (WorkoutExercise) obj);
            case 13:
                return AbstractC14879a.m42936r((C16282a) this.f45587x, (AbstractC11187a) obj);
            case 14:
                return new C39178j((((long) 0) << 32) | (((long) AbstractC12889b.m36258X(((C15136s0) this.f45587x).f56747a.m43072g())) & 4294967295L));
            case 15:
                C15118q2 c15118q2 = (C15118q2) this.f45587x;
                ((Float) obj).floatValue();
                return Float.valueOf(c15118q2.m43179a().mo743q0(AbstractC15108p2.f56602a));
            case 16:
                return Boolean.valueOf(AbstractC22676k.m65745e(((C15168v2) obj).f56899a, (C15072l6) this.f45587x));
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C15347f c15347f = (C15347f) this.f45587x;
                String str = (String) obj;
                if (str != null) {
                    c15347f.f57672l.f57557c.f58055j.mo43573s(str);
                }
                C30352d c30352d = c15347f.f57674n;
                Iterable iterable = str != null ? (List) ((LinkedHashMap) c30352d.f124536y).get(str) : (ArrayList) c30352d.f124535x;
                if (iterable == null) {
                    iterable = C25271y.f99162w;
                }
                Iterable<InterfaceC15450y2> iterable2 = iterable;
                for (InterfaceC15450y2 field : iterable2) {
                    Parcelable addressInputMode = c15347f.f57663c;
                    boolean z4 = c15347f.f57665e;
                    AbstractC22676k.m65750j(field, "field");
                    AbstractC22676k.m65750j(addressInputMode, "addressInputMode");
                    IdentifierSpec identifierSpecMo43531a = field.mo43531a();
                    IdentifierSpec.Companion.getClass();
                    if (AbstractC22676k.m65745e(identifierSpecMo43531a, IdentifierSpec.Line1)) {
                        C15333c3 c15333c3 = field instanceof C15333c3 ? (C15333c3) field : null;
                        InterfaceC15391m3 interfaceC15391m3 = c15333c3 != null ? c15333c3.f57610c : null;
                        C15351f3 c15351f3 = interfaceC15391m3 instanceof C15351f3 ? (C15351f3) interfaceC15391m3 : null;
                        InterfaceC15386l3 interfaceC15386l3 = c15351f3 != null ? c15351f3.f57702a : null;
                        C15339d3 c15339d3 = interfaceC15386l3 instanceof C15339d3 ? (C15339d3) interfaceC15386l3 : null;
                        if (c15339d3 != null) {
                            InterfaceC12689c interfaceC12689c = addressInputMode instanceof InterfaceC12689c ? (InterfaceC12689c) addressInputMode : null;
                            ((C13045h2) c15339d3.f57645z).m36570j(AbstractC22676k.m65745e(interfaceC12689c != null ? Boolean.valueOf(interfaceC12689c.mo35499f(str, z4)) : null, Boolean.TRUE) ? new C15411q3(R.drawable.stripe_ic_search, Integer.valueOf(R.string.stripe_address_search_content_description), true, (InterfaceC4339a) new C11456i(addressInputMode, 25)) : null);
                        }
                    }
                    field.mo43539h(c15347f.f57662b);
                }
                return (List) iterable2;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C15422t c15422t = (C15422t) this.f45587x;
                InterfaceC15447y event = (InterfaceC15447y) obj;
                AbstractC22676k.m65750j(event, "event");
                Map mapM74000i0 = AbstractC25247g0.m74000i0((Iterable) ((InterfaceC4339a) c15422t.f57954p.f104635y).invoke());
                LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(mapM74000i0.size()));
                for (Map.Entry entry : mapM74000i0.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ((C23328a) entry.getValue()).f92491a);
                }
                Map mapMo43609a = event.mo43609a();
                if (mapMo43609a == null) {
                    mapMo43609a = C25272z.f99163w;
                }
                LinkedHashMap linkedHashMapM73995d0 = AbstractC25247g0.m73995d0(linkedHashMap, mapMo43609a);
                if (!(event instanceof C15442x)) {
                    if (!(event instanceof C15437w)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c15422t.f57949k = true;
                }
                AbstractC15387m abstractC15387mM43605v = c15422t.m43605v(c15422t.f57949k, linkedHashMapM73995d0);
                if (!linkedHashMap.equals(linkedHashMapM73995d0) || !abstractC15387mM43605v.equals(((C15347f) ((InterfaceC4339a) c15422t.f57953o.f104635y).invoke()).f57663c)) {
                    IdentifierSpec.Companion.getClass();
                    String str2 = (String) linkedHashMapM73995d0.get(IdentifierSpec.Country);
                    if (str2 != null) {
                        c15422t.f57940b.mo43573s(str2);
                    }
                    C13045h2 c13045h2 = c15422t.f57952n;
                    C15347f c15347fM43604u = c15422t.m43604u(linkedHashMapM73995d0, c15422t.m43605v(c15422t.f57949k, linkedHashMapM73995d0));
                    c13045h2.getClass();
                    c13045h2.m36571k(null, c15347fM43604u);
                }
                return C23454a0.f92919a;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C15336d0 c15336d0 = (C15336d0) this.f45587x;
                if (((Boolean) obj).booleanValue() || !c15336d0.f57627b) {
                    return null;
                }
                return new C15349f1(R.string.stripe_field_required, null);
            case 20:
                C15342e0 c15342e0 = (C15342e0) this.f45587x;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                return AbstractC37056f.m118958J(new C23465k(c15342e0.f57650a, new C23328a(String.valueOf(zBooleanValue), zBooleanValue)));
            case 21:
                C15399o1 c15399o1 = (C15399o1) this.f45587x;
                String it = (String) obj;
                AbstractC22676k.m65750j(it, "it");
                return AbstractC37056f.m118958J(new C23465k(c15399o1.f57853a, new C23328a(it, it.length() == 6)));
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((C15247s) this.f45587x).m43352b();
                return C23454a0.f92919a;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                C15435v2 c15435v2 = (C15435v2) this.f45587x;
                C23328a formFieldEntry = (C23328a) obj;
                AbstractC22676k.m65750j(formFieldEntry, "formFieldEntry");
                return AbstractC37056f.m118958J(new C23465k(c15435v2.f58018a, formFieldEntry));
            case 24:
                AbstractC15327b3 abstractC15327b3 = (AbstractC15327b3) this.f45587x;
                C23328a formFieldEntry2 = (C23328a) obj;
                AbstractC22676k.m65750j(formFieldEntry2, "formFieldEntry");
                return AbstractC37056f.m118958J(new C23465k(abstractC15327b3.mo43531a(), formFieldEntry2));
            case 25:
                return Boolean.valueOf(AbstractC15850e.m44739z((FeedbackReason) this.f45587x, (FeedbackReason) obj));
            case 26:
                C34472r c34472r = (C34472r) obj;
                ((C11244e) this.f45587x).invoke(c34472r, new C16617b(AbstractC34454d0.m108920k(c34472r, false)));
                c34472r.m108946a();
                return C23454a0.f92919a;
            case 27:
                ((C16489z3) this.f45587x).f63374R.getClass();
                return Boolean.TRUE;
            case 28:
                return ((C17050c) this.f45587x).m48136m((InterfaceC33687a) obj);
            default:
                return ((C17054g) this.f45587x).m48159m((InterfaceC33687a) obj);
        }
    }
}
