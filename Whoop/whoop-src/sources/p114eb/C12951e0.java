package p114eb;

import android.net.Uri;
import c93.InterfaceC4339a;
import io.sentry.C20513q6;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l83.C23465k;
import m83.AbstractC25265s;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: eb.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C12951e0 extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f44728w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12954f0 f44729x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12951e0(C12954f0 c12954f0, int i13) {
        super(0);
        this.f44728w = i13;
        this.f44729x = c12954f0;
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, l83.h] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, l83.h] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, l83.h] */
    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        List list;
        switch (this.f44728w) {
            case 0:
                C23465k c23465k = (C23465k) this.f44729x.f44744j.getValue();
                return (c23465k == null || (list = (List) c23465k.f92937w) == null) ? new ArrayList() : list;
            case 1:
                String str = this.f44729x.f44735a;
                if (str == null || Uri.parse(str).getFragment() == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                String fragment = Uri.parse(str).getFragment();
                StringBuilder sb4 = new StringBuilder();
                AbstractC22676k.m65747g(fragment);
                C12954f0.m36426a(fragment, arrayList, sb4);
                String string = sb4.toString();
                AbstractC22676k.m65749i(string, "fragRegex.toString()");
                return new C23465k(arrayList, string);
            case 2:
                String str2 = (String) this.f44729x.f44746l.getValue();
                if (str2 != null) {
                    return Pattern.compile(str2, 2);
                }
                return null;
            case 3:
                C23465k c23465k2 = (C23465k) this.f44729x.f44744j.getValue();
                if (c23465k2 != null) {
                    return (String) c23465k2.f92938x;
                }
                return null;
            case 4:
                String str3 = this.f44729x.f44735a;
                return Boolean.valueOf((str3 == null || Uri.parse(str3).getQuery() == null) ? false : true);
            case 5:
                String str4 = this.f44729x.f44748n;
                if (str4 != null) {
                    return Pattern.compile(str4);
                }
                return null;
            case 6:
                String str5 = this.f44729x.f44739e;
                if (str5 != null) {
                    return Pattern.compile(str5, 2);
                }
                return null;
            default:
                C12954f0 c12954f0 = this.f44729x;
                String str6 = c12954f0.f44735a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (((Boolean) c12954f0.f44741g.getValue()).booleanValue()) {
                    Uri uri = Uri.parse(str6);
                    for (String paramName : uri.getQueryParameterNames()) {
                        StringBuilder sb5 = new StringBuilder();
                        List<String> queryParameters = uri.getQueryParameters(paramName);
                        int i13 = 1;
                        if (queryParameters.size() > 1) {
                            throw new IllegalArgumentException(AbstractC2875y.m8300m("Query parameter ", paramName, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                        }
                        String queryParam = (String) AbstractC25265s.m74100H0(queryParameters);
                        if (queryParam == null) {
                            c12954f0.f44743i = true;
                            queryParam = paramName;
                        }
                        Matcher matcher = C12954f0.f44734r.matcher(queryParam);
                        C12948d0 c12948d0 = new C12948d0();
                        int iEnd = 0;
                        while (matcher.find()) {
                            String strGroup = matcher.group(i13);
                            AbstractC22676k.m65748h(strGroup, "null cannot be cast to non-null type kotlin.String");
                            c12948d0.f44726b.add(strGroup);
                            AbstractC22676k.m65749i(queryParam, "queryParam");
                            String strSubstring = queryParam.substring(iEnd, matcher.start());
                            AbstractC22676k.m65749i(strSubstring, "substring(...)");
                            sb5.append(Pattern.quote(strSubstring));
                            sb5.append("(.+?)?");
                            iEnd = matcher.end();
                            i13 = 1;
                        }
                        if (iEnd < queryParam.length()) {
                            String strSubstring2 = queryParam.substring(iEnd);
                            AbstractC22676k.m65749i(strSubstring2, "substring(...)");
                            sb5.append(Pattern.quote(strSubstring2));
                        }
                        String string2 = sb5.toString();
                        AbstractC22676k.m65749i(string2, "argRegex.toString()");
                        c12948d0.f44725a = AbstractC39421y.m125926K(string2, C20513q6.DEFAULT_PROPAGATION_TARGETS, "\\E.*\\Q", false);
                        AbstractC22676k.m65749i(paramName, "paramName");
                        linkedHashMap.put(paramName, c12948d0);
                    }
                }
                return linkedHashMap;
        }
    }
}
