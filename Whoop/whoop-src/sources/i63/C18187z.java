package i63;

import androidx.room.AbstractC1772c1;
import hg3.AbstractC17269i;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23465k;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25270x;
import m83.C25271y;
import p005a3.C0227m1;
import p014aj.C0928c;
import p098dt.AbstractC12350b;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import yb3.AbstractC39397a;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: i63.z */
/* JADX INFO: loaded from: classes5.dex */
public final class C18187z {

    /* JADX INFO: renamed from: k */
    public static final C18166e0 f70533k;

    /* JADX INFO: renamed from: a */
    public C18160b0 f70534a;

    /* JADX INFO: renamed from: b */
    public String f70535b;

    /* JADX INFO: renamed from: c */
    public int f70536c;

    /* JADX INFO: renamed from: d */
    public boolean f70537d;

    /* JADX INFO: renamed from: e */
    public String f70538e;

    /* JADX INFO: renamed from: f */
    public String f70539f;

    /* JADX INFO: renamed from: g */
    public String f70540g;

    /* JADX INFO: renamed from: h */
    public List f70541h;

    /* JADX INFO: renamed from: i */
    public C18185x f70542i;

    /* JADX INFO: renamed from: j */
    public C0928c f70543j;

    static {
        C18187z c18187z = new C18187z();
        AbstractC18158a0.m52160b(c18187z, "http://localhost");
        f70533k = c18187z.m52176b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C18187z() {
        C18160b0 protocol = C18160b0.f70470c;
        InterfaceC18184w.f70532b.getClass();
        AbstractC22676k.m65750j(protocol, "protocol");
        this.f70534a = protocol;
        this.f70535b = "";
        this.f70536c = 0;
        this.f70537d = false;
        this.f70538e = null;
        this.f70539f = null;
        Set set = AbstractC18157a.f70461a;
        Charset charset = AbstractC39397a.f169546a;
        AbstractC22676k.m65750j(charset, "charset");
        StringBuilder sb4 = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        AbstractC22676k.m65749i(charsetEncoderNewEncoder, "charset.newEncoder()");
        AbstractC18157a.m52158h(AbstractC17269i.m48862H(charsetEncoderNewEncoder, "", 0, 0), new C0227m1(sb4, 18));
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "StringBuilder().apply(builderAction).toString()");
        this.f70540g = string;
        C25271y<String> c25271y = C25271y.f99162w;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c25271y, 10));
        for (String str : c25271y) {
            AbstractC22676k.m65750j(str, "<this>");
            arrayList.add(AbstractC18157a.m52157g(str, true));
        }
        this.f70541h = arrayList;
        C18185x c18185x = new C18185x(3);
        while (true) {
            C25270x c25270x = C25270x.f99161w;
            if (!c25270x.hasNext()) {
                this.f70542i = c18185x;
                this.f70543j = new C0928c(c18185x, 13);
                return;
            }
            String name = (String) c25270x.next();
            AbstractC22676k.m65750j(name, "name");
            String strM52156f = AbstractC18157a.m52156f(name, false);
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(c25271y, 10));
            for (String str2 : c25271y) {
                AbstractC22676k.m65750j(str2, "<this>");
                arrayList2.add(AbstractC18157a.m52156f(str2, true));
            }
            c18185x.mo2297E(strM52156f, arrayList2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m52175a() {
        if (this.f70535b.length() <= 0 && !AbstractC22676k.m65745e(this.f70534a.f70472a, "file")) {
            C18166e0 c18166e0 = f70533k;
            this.f70535b = c18166e0.f70482b;
            C18160b0 c18160b0 = this.f70534a;
            C18160b0 c18160b1 = C18160b0.f70470c;
            if (AbstractC22676k.m65745e(c18160b0, C18160b0.f70470c)) {
                this.f70534a = c18166e0.f70481a;
            }
            if (this.f70536c == 0) {
                this.f70536c = c18166e0.f70483c;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final C18166e0 m52176b() {
        m52175a();
        C18160b0 c18160b0 = this.f70534a;
        String str = this.f70535b;
        int i13 = this.f70536c;
        List list = this.f70541h;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC18157a.m52154d((String) it.next()));
        }
        InterfaceC18184w interfaceC18184wM34594o = AbstractC12350b.m34594o((C18185x) this.f70543j.f3421x);
        String strM52155e = AbstractC18157a.m52155e(0, 0, 15, this.f70540g, false);
        String str2 = this.f70538e;
        String strM52154d = str2 != null ? AbstractC18157a.m52154d(str2) : null;
        String str3 = this.f70539f;
        return new C18166e0(c18160b0, str, i13, arrayList, interfaceC18184wM34594o, strM52155e, strM52154d, str3 != null ? AbstractC18157a.m52154d(str3) : null, m52177c());
    }

    /* JADX INFO: renamed from: c */
    public final String m52177c() throws IOException {
        List listM118958J;
        m52175a();
        StringBuilder sb4 = new StringBuilder(256);
        sb4.append((CharSequence) this.f70534a.f70472a);
        String str = this.f70534a.f70472a;
        if (str.equals("file")) {
            String str2 = this.f70535b;
            String strM5405w = AbstractC1772c1.m5405w(this);
            sb4.append((CharSequence) "://");
            sb4.append((CharSequence) str2);
            if (!AbstractC39414r.m125907z0(strM5405w, '/')) {
                sb4.append('/');
            }
            sb4.append((CharSequence) strM5405w);
        } else if (str.equals("mailto")) {
            StringBuilder sb5 = new StringBuilder();
            String str3 = this.f70538e;
            String str4 = this.f70539f;
            if (str3 != null) {
                sb5.append(str3);
                if (str4 != null) {
                    sb5.append(':');
                    sb5.append(str4);
                }
                sb5.append("@");
            }
            String string = sb5.toString();
            AbstractC22676k.m65749i(string, "StringBuilder().apply(builderAction).toString()");
            String str5 = this.f70535b;
            sb4.append((CharSequence) ":");
            sb4.append((CharSequence) string);
            sb4.append((CharSequence) str5);
        } else {
            sb4.append((CharSequence) "://");
            sb4.append((CharSequence) AbstractC1772c1.m5404v(this));
            String encodedPath = AbstractC1772c1.m5405w(this);
            C18185x encodedQueryParameters = this.f70542i;
            boolean z4 = this.f70537d;
            AbstractC22676k.m65750j(encodedPath, "encodedPath");
            AbstractC22676k.m65750j(encodedQueryParameters, "encodedQueryParameters");
            if (!AbstractC39414r.m125890i0(encodedPath) && !AbstractC39421y.m125930O(encodedPath, "/", false)) {
                sb4.append('/');
            }
            sb4.append((CharSequence) encodedPath);
            if (!((Map) encodedQueryParameters.f3536x).isEmpty() || z4) {
                sb4.append((CharSequence) "?");
            }
            Set<Map.Entry> setMo2319b = encodedQueryParameters.mo2319b();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : setMo2319b) {
                String str6 = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (list.isEmpty()) {
                    listM118958J = AbstractC37056f.m118958J(new C23465k(str6, null));
                } else {
                    List list2 = list;
                    ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new C23465k(str6, (String) it.next()));
                    }
                    listM118958J = arrayList2;
                }
                AbstractC25265s.m74141p0(arrayList, listM118958J);
            }
            AbstractC25265s.m74109M0(arrayList, sb4, "&", null, null, C18162c0.f70475w, 60);
            if (this.f70540g.length() > 0) {
                sb4.append('#');
                sb4.append((CharSequence) this.f70540g);
            }
        }
        String string2 = sb4.toString();
        AbstractC22676k.m65749i(string2, "appendTo(StringBuilder(256)).toString()");
        return string2;
    }
}
