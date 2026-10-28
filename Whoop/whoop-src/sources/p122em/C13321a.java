package p122em;

import dm.C12173c;
import gm.InterfaceC15984l;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p550vd.AbstractC35903f;

/* JADX INFO: renamed from: em.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C13321a implements InterfaceC15984l {

    /* JADX INFO: renamed from: c */
    public static final String f46152c;

    /* JADX INFO: renamed from: d */
    public static final Set f46153d;

    /* JADX INFO: renamed from: e */
    public static final C13321a f46154e;

    /* JADX INFO: renamed from: f */
    public static final C13321a f46155f;

    /* JADX INFO: renamed from: a */
    public final String f46156a;

    /* JADX INFO: renamed from: b */
    public final String f46157b;

    static {
        String strM113986D = AbstractC35903f.m113986D("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f46152c = strM113986D;
        String strM113986D2 = AbstractC35903f.m113986D("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strM113986D3 = AbstractC35903f.m113986D("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f46153d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C12173c("proto"), new C12173c("json"))));
        f46154e = new C13321a(strM113986D, null);
        f46155f = new C13321a(strM113986D2, strM113986D3);
    }

    public C13321a(String str, String str2) {
        this.f46156a = str;
        this.f46157b = str2;
    }

    /* JADX INFO: renamed from: a */
    public static C13321a m37428a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new C13321a(str2, str3);
    }
}
