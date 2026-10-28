package d21;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e93.AbstractC12889b;
import gy0.AbstractC16277f;
import i93.C18284j;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import l83.C23465k;
import m83.AbstractC25243e0;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: d21.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00172\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001cJ\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u0015J\u0015\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$J\u001d\u0010%\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0004¢\u0006\u0004\b(\u0010\u001cJ\u0015\u0010)\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u001f¢\u0006\u0004\b)\u0010\"J\u0015\u0010+\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0004¢\u0006\u0004\b+\u0010\u001cJ\u0015\u0010,\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u0004¢\u0006\u0004\b,\u0010$J\u0011\u0010-\u001a\u00020\u0004*\u00020\u001f¢\u0006\u0004\b-\u0010\"J\u0011\u0010.\u001a\u00020\u001f*\u00020\u0004¢\u0006\u0004\b.\u0010$J\u001d\u00102\u001a\u0002012\u0006\u0010 \u001a\u00020\u001f2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b2\u00103J\u001d\u00104\u001a\u0002012\u0006\u0010*\u001a\u00020\u00042\u0006\u00100\u001a\u00020/¢\u0006\u0004\b4\u00105J)\u00106\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u0002010\u00172\u0006\u0010 \u001a\u00020\u001f2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b6\u00107J)\u00108\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u0002010\u00172\u0006\u0010*\u001a\u00020\u00042\u0006\u00100\u001a\u00020/¢\u0006\u0004\b8\u00109¨\u0006:"}, m65681d2 = {"Ld21/a;", "", "<init>", "()V", "", "min", "max", "", "suffix", "", "f", "(IILjava/lang/String;)Ljava/util/List;", "values", "g", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "value", "r", "(Ljava/lang/String;)I", "feet", "inches", "u", "(II)I", "totalInches", "Ll83/k;", "k", "(I)Ll83/k;", "centimeters", "a", "(I)I", "j", "b", "", "meters", "o", "(F)I", "l", "(I)F", "c", "(II)F", "kilograms", "n", "m", "pounds", "p", "q", "s", "t", "", "isImperial", "Lcom/whoop/design/util/TextResource;", "d", "(FZ)Lcom/whoop/design/util/TextResource;", "e", "(IZ)Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(FZ)Ll83/k;", "i", "(IZ)Ll83/k;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11503a {

    /* JADX INFO: renamed from: a */
    public static final C11503a f37005a = new C11503a();

    private C11503a() {
    }

    /* JADX INFO: renamed from: a */
    public final int m30912a(int centimeters) {
        return AbstractC12889b.m36258X(centimeters / 2.54f);
    }

    /* JADX INFO: renamed from: b */
    public final int m30913b(int feet, int inches) {
        return m30921j(m30932u(feet, inches));
    }

    /* JADX INFO: renamed from: c */
    public final float m30914c(int feet, int inches) {
        return m30923l(m30932u(feet, inches));
    }

    /* JADX INFO: renamed from: d */
    public final TextResource m30915d(float meters, boolean isImperial) {
        if (!isImperial) {
            return new TextResource.C8688b(AbstractC16277f.f62250J0, (List<? extends TextResource.AbstractC8690d>) AbstractC37056f.m118959K(new TextResource.AbstractC8690d.b(Integer.valueOf(m30930s(meters))), new TextResource.AbstractC8690d.a(AbstractC8693b.m21277k(AbstractC16277f.f62245I))));
        }
        C23465k c23465kM30922k = m30922k(m30926o(meters));
        return new TextResource.C8688b(AbstractC16277f.f62242H0, (List<? extends TextResource.AbstractC8690d>) AbstractC37056f.m118959K(new TextResource.AbstractC8690d.b(Integer.valueOf(((Number) c23465kM30922k.f92937w).intValue())), new TextResource.AbstractC8690d.b(Integer.valueOf(((Number) c23465kM30922k.f92938x).intValue()))));
    }

    /* JADX INFO: renamed from: e */
    public final TextResource m30916e(int pounds, boolean isImperial) {
        return isImperial ? new TextResource.C8688b(AbstractC16277f.f62256K2, (List<? extends TextResource.AbstractC8690d>) AbstractC37056f.m118959K(new TextResource.AbstractC8690d.b(Integer.valueOf(pounds)), new TextResource.AbstractC8690d.a(AbstractC8693b.m21277k(AbstractC16277f.f62247I1)))) : new TextResource.C8688b(AbstractC16277f.f62256K2, (List<? extends TextResource.AbstractC8690d>) AbstractC37056f.m118959K(new TextResource.AbstractC8690d.b(Integer.valueOf(m30927p(pounds))), new TextResource.AbstractC8690d.a(AbstractC8693b.m21277k(AbstractC16277f.f62273Q0))));
    }

    /* JADX INFO: renamed from: f */
    public final List<String> m30917f(int min, int max, String suffix) {
        AbstractC22676k.m65750j(suffix, "suffix");
        C18284j c18284j = new C18284j(min, max, 1);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284j, 10));
        Iterator it = c18284j.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC25243e0) it).nextInt() + " " + suffix);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public final List<String> m30918g(List<Integer> values, String suffix) {
        AbstractC22676k.m65750j(values, "values");
        AbstractC22676k.m65750j(suffix, "suffix");
        List<Integer> list = values;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Number) it.next()).intValue() + " " + suffix);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public final C23465k m30919h(float meters, boolean isImperial) {
        if (!isImperial) {
            return new C23465k(AbstractC8693b.m21278l(String.valueOf(m30930s(meters))), AbstractC8693b.m21277k(AbstractC16277f.f62245I));
        }
        C23465k c23465kM30922k = m30922k(m30926o(meters));
        return new C23465k(new TextResource.C8688b(AbstractC16277f.f62246I0, (List<? extends TextResource.AbstractC8690d>) AbstractC37056f.m118959K(new TextResource.AbstractC8690d.b(Integer.valueOf(((Number) c23465kM30922k.f92937w).intValue())), new TextResource.AbstractC8690d.b(Integer.valueOf(((Number) c23465kM30922k.f92938x).intValue())))), AbstractC8693b.m21278l(""));
    }

    /* JADX INFO: renamed from: i */
    public final C23465k m30920i(int pounds, boolean isImperial) {
        return isImperial ? new C23465k(AbstractC8693b.m21278l(String.valueOf(pounds)), AbstractC8693b.m21277k(AbstractC16277f.f62247I1)) : new C23465k(AbstractC8693b.m21278l(String.valueOf(m30927p(pounds))), AbstractC8693b.m21277k(AbstractC16277f.f62273Q0));
    }

    /* JADX INFO: renamed from: j */
    public final int m30921j(int inches) {
        return AbstractC12889b.m36258X(inches * 2.54f);
    }

    /* JADX INFO: renamed from: k */
    public final C23465k m30922k(int totalInches) {
        return new C23465k(Integer.valueOf(totalInches / 12), Integer.valueOf(totalInches % 12));
    }

    /* JADX INFO: renamed from: l */
    public final float m30923l(int inches) {
        return inches * 0.0254f;
    }

    /* JADX INFO: renamed from: m */
    public final int m30924m(float kilograms) {
        return Math.round(kilograms * 2.2046225f);
    }

    /* JADX INFO: renamed from: n */
    public final int m30925n(int kilograms) {
        return Math.round(kilograms * 2.2046225f);
    }

    /* JADX INFO: renamed from: o */
    public final int m30926o(float meters) {
        return AbstractC12889b.m36258X(meters / 0.0254f);
    }

    /* JADX INFO: renamed from: p */
    public final int m30927p(int pounds) {
        return Math.round(pounds / 2.2046225f);
    }

    /* JADX INFO: renamed from: q */
    public final float m30928q(int pounds) {
        return pounds / 2.2046225f;
    }

    /* JADX INFO: renamed from: r */
    public final int m30929r(String value) {
        AbstractC22676k.m65750j(value, "value");
        Pattern patternCompile = Pattern.compile("\\D");
        AbstractC22676k.m65749i(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(value).replaceAll("");
        AbstractC22676k.m65749i(strReplaceAll, "replaceAll(...)");
        Integer numM125932Q = AbstractC39421y.m125932Q(strReplaceAll);
        if (numM125932Q != null) {
            return numM125932Q.intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: s */
    public final int m30930s(float f13) {
        return AbstractC12889b.m36258X(f13 * 100);
    }

    /* JADX INFO: renamed from: t */
    public final float m30931t(int i13) {
        return i13 / 100.0f;
    }

    /* JADX INFO: renamed from: u */
    public final int m30932u(int feet, int inches) {
        return (feet * 12) + inches;
    }
}
