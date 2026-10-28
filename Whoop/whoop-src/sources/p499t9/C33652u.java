package p499t9;

import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import androidx.media3.common.ParserException;
import bi.AbstractC3269g;
import com.google.android.gms.common.api.C4976g;
import com.google.android.gms.tasks.Task;
import ec3.C13081r1;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import la.C23548b;
import np.AbstractC27007l;
import np.C27000e;
import np.C27004i;
import p073cq.C11040i;
import p073cq.InterfaceC11035d;
import p075ct.C11105a;
import p078d1.C11457j;
import p085d9.C11799p;
import p088dc.AbstractC11894a;
import p199ho.C17531l;
import p229ip.BinderC20793d;
import p284ko.InterfaceC22613d0;
import p403pp.C29406b;
import p403pp.EnumC29422r;
import p460rg.AbstractC31375j;
import p503tp.C34043n;
import p505ts.AbstractC34132o;
import p505ts.C34126i;
import p505ts.C34128k;
import p581we.C37175a;
import p589wn.C37402j;
import p589wn.C37405m;
import p589wn.InterfaceC37408p;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38048c;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import p607x8.InterfaceC38049d;
import p623xr.C38606b;
import p647yf.C39498k;
import p647yf.InterfaceC39502o;
import p656yp.C39697d;
import p695zx.C41185g;
import p695zx.C41198t;
import p695zx.InterfaceC41184f;
import p695zx.InterfaceC41202x;
import q83.InterfaceC30057d;
import qa.C30106k;
import qa.InterfaceC30107l;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import ro.C31624i;
import s83.AbstractC32269c;
import so.C32800q;
import to.C33980j0;
import to.InterfaceC33987n;
import va3.AbstractC35849g;
import za.AbstractC40219g;
import za.AbstractC40220h;
import za.C40213a;
import za.C40214b;
import za.C40215c;

/* JADX INFO: renamed from: t9.u */
/* JADX INFO: loaded from: classes5.dex */
public final class C33652u implements InterfaceC33987n, InterfaceC39502o, InterfaceC37408p, InterfaceC11035d, InterfaceC30107l, InterfaceC41184f {

    /* JADX INFO: renamed from: y */
    public static C33652u f140440y;

    /* JADX INFO: renamed from: w */
    public Object f140441w;

    /* JADX INFO: renamed from: x */
    public Object f140442x;

    public /* synthetic */ C33652u(Object obj, Object obj2) {
        this.f140441w = obj;
        this.f140442x = obj2;
    }

    /* JADX INFO: renamed from: i */
    public static C33652u m106280i(Context context) {
        if (f140440y == null) {
            C33652u c33652u = new C33652u();
            c33652u.f140442x = context.getApplicationContext();
            f140440y = c33652u;
            c33652u.f140441w = new C39697d((Context) c33652u.f140442x, null, C39697d.f170861a, null, C4976g.f20501c);
        }
        return f140440y;
    }

    /* JADX INFO: renamed from: j */
    public static C32800q m106281j(Context context, String str) {
        try {
            return new C32800q(context.getPackageManager().getResourcesForApplication(str), str);
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 52);
            sb4.append("Unable to get resources for ");
            sb4.append(str);
            sb4.append(", using local resources.");
            Log.w("OssLicenses", sb4.toString());
            return new C32800q(context.getResources(), context.getPackageName());
        }
    }

    /* JADX INFO: renamed from: a */
    public C34126i m106282a() throws GeneralSecurityException {
        C31624i c31624i;
        C34128k c34128k = (C34128k) this.f140441w;
        if (c34128k == null || (c31624i = (C31624i) this.f140442x) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c34128k.f143066a == ((C11105a) c31624i.f130665x).f35302a.length) {
            return new C34126i(c34128k, c31624i);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    @Override // to.InterfaceC33987n
    public void accept(Object obj, Object obj2) {
        PendingIntent pendingIntent = (PendingIntent) this.f140441w;
        C34043n c34043n = (C34043n) this.f140442x;
        BinderC20793d binderC20793d = new BinderC20793d(1, (C11040i) obj2);
        C27000e c27000e = (C27000e) ((C27004i) obj).m111061j();
        Parcel parcelM80981s = c27000e.m80981s();
        AbstractC27007l.m80996c(parcelM80981s, pendingIntent);
        AbstractC27007l.m80996c(parcelM80981s, c34043n);
        AbstractC27007l.m80997d(parcelM80981s, binderC20793d);
        c27000e.m80980c0(parcelM80981s, 79);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // p647yf.InterfaceC39502o
    /* JADX INFO: renamed from: b */
    public Object mo106283b(C39498k c39498k, long j7, AbstractC32269c abstractC32269c) {
        C37175a c37175a;
        C11799p c11799p = (C11799p) this.f140442x;
        if (abstractC32269c instanceof C37175a) {
            c37175a = (C37175a) abstractC32269c;
            int i13 = c37175a.f158964E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c37175a.f158964E = i13 - Integer.MIN_VALUE;
            } else {
                c37175a = new C37175a(this, abstractC32269c);
            }
        } else {
            c37175a = new C37175a(this, abstractC32269c);
        }
        Object objM31617a = c37175a.f158967y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c37175a.f158964E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM31617a);
            if (j7 < 0) {
                throw new IllegalArgumentException(AbstractC31061c.m95636l(j7, "Invalid limit (", ") must be >= 0L").toString());
            }
            c37175a.f158965w = c39498k;
            c37175a.f158966x = j7;
            c37175a.f158964E = 1;
            objM31617a = c11799p.m31617a(c37175a);
            if (objM31617a == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j7 = c37175a.f158966x;
            c39498k = c37175a.f158965w;
            AbstractC34132o.m107864I(objM31617a);
        }
        return !((Boolean) objM31617a).booleanValue() ? new Long(-1L) : new Long(((C39498k) c11799p.f38306g).mo119145c0(c39498k, j7));
    }

    @Override // p589wn.InterfaceC37408p
    /* JADX INFO: renamed from: c */
    public InterfaceC22613d0 mo106243c() {
        return new C11457j(28, ((InterfaceC37408p) this.f140441w).mo106243c(), (List) this.f140442x);
    }

    @Override // qa.InterfaceC30107l
    /* JADX INFO: renamed from: c0 */
    public int mo91110c0() {
        return 1;
    }

    @Override // p647yf.InterfaceC39502o
    public boolean cancel() {
        return ((InterfaceC39502o) this.f140441w).cancel();
    }

    @Override // p695zx.InterfaceC41184f
    /* JADX INFO: renamed from: d */
    public Object mo102860d(C41185g c41185g, InterfaceC30057d interfaceC30057d) {
        return ((C41198t) ((InterfaceC41202x) this.f140441w)).m133837a(c41185g);
    }

    /* JADX INFO: renamed from: e */
    public void m106284e(C31624i c31624i) {
        this.f140442x = c31624i;
    }

    @Override // p589wn.InterfaceC37408p
    /* JADX INFO: renamed from: f */
    public InterfaceC22613d0 mo106245f(C37405m c37405m, C37402j c37402j) {
        return new C11457j(28, ((InterfaceC37408p) this.f140441w).mo106245f(c37405m, c37402j), (List) this.f140442x);
    }

    /* JADX INFO: renamed from: g */
    public void m106285g(C34128k c34128k) {
        this.f140441w = c34128k;
    }

    @Override // p695zx.InterfaceC41184f
    public C13081r1 getLoading() {
        return (C13081r1) this.f140442x;
    }

    @Override // p647yf.InterfaceC39502o
    /* JADX INFO: renamed from: h */
    public boolean mo106286h() {
        C11799p c11799p = (C11799p) this.f140442x;
        return ((C39498k) c11799p.f38306g).f169914w.f105866x == 0 && c11799p.f38300a && ((InterfaceC39502o) this.f140441w).mo106286h();
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0252  */
    /* JADX WARN: Code duplicated, block: B:130:0x025d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0266  */
    /* JADX WARN: Code duplicated, block: B:133:0x0270  */
    /* JADX WARN: Code duplicated, block: B:135:0x0278  */
    /* JADX WARN: Code duplicated, block: B:137:0x0280  */
    /* JADX WARN: Code duplicated, block: B:138:0x0284  */
    /* JADX WARN: Code duplicated, block: B:140:0x028c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0292  */
    /* JADX WARN: Code duplicated, block: B:143:0x029a  */
    /* JADX WARN: Code duplicated, block: B:149:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:151:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:153:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:155:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:156:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:158:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:159:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:161:0x02df  */
    /* JADX WARN: Code duplicated, block: B:163:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:164:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:166:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:168:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:169:0x0301  */
    /* JADX WARN: Code duplicated, block: B:171:0x0309  */
    /* JADX WARN: Code duplicated, block: B:173:0x0319  */
    /* JADX WARN: Code duplicated, block: B:174:0x0332  */
    /* JADX WARN: Code duplicated, block: B:177:0x0343  */
    /* JADX WARN: Code duplicated, block: B:180:0x034c  */
    /* JADX WARN: Code duplicated, block: B:181:0x034e  */
    /* JADX WARN: Code duplicated, block: B:184:0x0357  */
    /* JADX WARN: Code duplicated, block: B:185:0x0359  */
    /* JADX WARN: Code duplicated, block: B:188:0x0362  */
    /* JADX WARN: Code duplicated, block: B:192:0x036c  */
    /* JADX WARN: Code duplicated, block: B:193:0x0371  */
    /* JADX WARN: Code duplicated, block: B:194:0x0376  */
    /* JADX WARN: Code duplicated, block: B:196:0x0389  */
    /* JADX WARN: Code duplicated, block: B:236:0x0366 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:173:0x0319, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v16 */
    @Override // qa.InterfaceC30107l
    /* JADX INFO: renamed from: k */
    public void mo91120k(byte[] bArr, int i13, int i14, C30106k c30106k, InterfaceC38049d interfaceC38049d) {
        C40215c c40215cM129105d;
        String strTrim;
        String string;
        Matcher matcher;
        String strGroup;
        byte b;
        int i15;
        boolean z4;
        C33652u c33652u = this;
        C38059n c38059n = (C38059n) c33652u.f140441w;
        c38059n.m121844D(i13 + i14, bArr);
        c38059n.m121846F(i13);
        ArrayList arrayList = new ArrayList();
        try {
            AbstractC40220h.m129111c(c38059n);
            while (!TextUtils.isEmpty(c38059n.m121855h(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                boolean z13 = false;
                int i16 = -1;
                int i17 = 0;
                byte b6 = -1;
                while (true) {
                    int i18 = 1;
                    if (b6 == -1) {
                        i17 = c38059n.f163018b;
                        String strM121855h = c38059n.m121855h(StandardCharsets.UTF_8);
                        if (strM121855h == null) {
                            b6 = 0;
                        } else if ("STYLE".equals(strM121855h)) {
                            b6 = 2;
                        } else {
                            b6 = strM121855h.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                        }
                    } else {
                        c38059n.m121846F(i17);
                        if (b6 == 0) {
                            AbstractC11894a.m31948P(new C17531l(arrayList2, 1), c30106k, interfaceC38049d);
                            return;
                        }
                        if (b6 == 1) {
                            while (!TextUtils.isEmpty(c38059n.m121855h(StandardCharsets.UTF_8))) {
                            }
                        } else {
                            String str = null;
                            if (b6 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    throw new IllegalArgumentException("A style block was found after the first cue.");
                                }
                                c38059n.m121855h(StandardCharsets.UTF_8);
                                C40213a c40213a = (C40213a) c33652u.f140442x;
                                C38059n c38059n2 = c40213a.f173643a;
                                StringBuilder sb4 = c40213a.f173644b;
                                sb4.setLength(0);
                                int i19 = c38059n.f163018b;
                                while (!TextUtils.isEmpty(c38059n.m121855h(StandardCharsets.UTF_8))) {
                                }
                                c38059n2.m121844D(c38059n.f163018b, c38059n.f163017a);
                                c38059n2.m121846F(i19);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    C40213a.m129100c(c38059n2);
                                    if (c38059n2.m121848a() >= 5 && "::cue".equals(c38059n2.m121865r(5, StandardCharsets.UTF_8))) {
                                        int i24 = c38059n2.f163018b;
                                        String strM129099b = C40213a.m129099b(c38059n2, sb4);
                                        if (strM129099b == null) {
                                            strTrim = str;
                                        } else if ("{".equals(strM129099b)) {
                                            c38059n2.m121846F(i24);
                                            strTrim = "";
                                        } else {
                                            if ("(".equals(strM129099b)) {
                                                int i25 = c38059n2.f163018b;
                                                int i26 = c38059n2.f163019c;
                                                int i27 = z13 ? 1 : 0;
                                                while (i25 < i26 && i27 == 0) {
                                                    int i28 = i25 + 1;
                                                    i27 = ((char) c38059n2.f163017a[i25]) == ')' ? i18 : z13 ? 1 : 0;
                                                    i25 = i28;
                                                }
                                                strTrim = c38059n2.m121865r((i25 - 1) - c38059n2.f163018b, StandardCharsets.UTF_8).trim();
                                            } else {
                                                strTrim = str;
                                            }
                                            if (!")".equals(C40213a.m129099b(c38059n2, sb4))) {
                                                strTrim = str;
                                            }
                                        }
                                    } else {
                                        strTrim = str;
                                    }
                                    if (strTrim != null && "{".equals(C40213a.m129099b(c38059n2, sb4))) {
                                        C40214b c40214b = new C40214b();
                                        c40214b.f173645a = "";
                                        c40214b.f173646b = "";
                                        c40214b.f173647c = Collections.EMPTY_SET;
                                        c40214b.f173648d = "";
                                        c40214b.f173649e = str;
                                        c40214b.f173651g = z13;
                                        c40214b.f173653i = z13;
                                        c40214b.f173654j = i16;
                                        c40214b.f173655k = i16;
                                        c40214b.f173656l = i16;
                                        c40214b.f173657m = i16;
                                        c40214b.f173658n = i16;
                                        c40214b.f173660p = i16;
                                        c40214b.f173661q = z13;
                                        if (!"".equals(strTrim)) {
                                            int iIndexOf = strTrim.indexOf(91);
                                            if (iIndexOf != i16) {
                                                Matcher matcher2 = C40213a.f173641c.matcher(strTrim.substring(iIndexOf));
                                                if (matcher2.matches()) {
                                                    String strGroup2 = matcher2.group(i18);
                                                    strGroup2.getClass();
                                                    c40214b.f173648d = strGroup2;
                                                }
                                                strTrim = strTrim.substring(z13 ? 1 : 0, iIndexOf);
                                            }
                                            int i29 = AbstractC38065t.f163031a;
                                            String[] strArrSplit = strTrim.split("\\.", i16);
                                            String str2 = strArrSplit[z13 ? 1 : 0];
                                            int iIndexOf2 = str2.indexOf(35);
                                            if (iIndexOf2 != i16) {
                                                c40214b.f173646b = str2.substring(z13 ? 1 : 0, iIndexOf2);
                                                c40214b.f173645a = str2.substring(iIndexOf2 + 1);
                                            } else {
                                                c40214b.f173646b = str2;
                                            }
                                            if (strArrSplit.length > i18) {
                                                int length = strArrSplit.length;
                                                AbstractC35849g.m113802d(length <= strArrSplit.length ? i18 : z13 ? 1 : 0);
                                                c40214b.f173647c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, i18, length)));
                                            }
                                        }
                                        ?? r10 = z13 ? 1 : 0;
                                        String strM129099b2 = null;
                                        while (r10 == 0) {
                                            int i34 = c38059n2.f163018b;
                                            strM129099b2 = C40213a.m129099b(c38059n2, sb4);
                                            ?? r14 = (strM129099b2 == null || "}".equals(strM129099b2)) ? i18 : z13;
                                            if (r14 == 0) {
                                                c38059n2.m121846F(i34);
                                                C40213a.m129100c(c38059n2);
                                                String strM129098a = C40213a.m129098a(c38059n2, sb4);
                                                if (!"".equals(strM129098a) && ":".equals(C40213a.m129099b(c38059n2, sb4))) {
                                                    C40213a.m129100c(c38059n2);
                                                    StringBuilder sb5 = new StringBuilder();
                                                    boolean z14 = false;
                                                    while (true) {
                                                        if (z14) {
                                                            string = sb5.toString();
                                                        } else {
                                                            int i35 = c38059n2.f163018b;
                                                            boolean z15 = z14;
                                                            String strM129099b3 = C40213a.m129099b(c38059n2, sb4);
                                                            if (strM129099b3 == null) {
                                                                string = null;
                                                            } else if ("}".equals(strM129099b3) || ";".equals(strM129099b3)) {
                                                                c38059n2.m121846F(i35);
                                                                z14 = true;
                                                            } else {
                                                                sb5.append(strM129099b3);
                                                                z14 = z15;
                                                            }
                                                        }
                                                    }
                                                    if (string != null && !"".equals(string)) {
                                                        int i36 = c38059n2.f163018b;
                                                        String strM129099b4 = C40213a.m129099b(c38059n2, sb4);
                                                        if (";".equals(strM129099b4)) {
                                                            if ("color".equals(strM129098a)) {
                                                                c40214b.f173650f = AbstractC38048c.m121830a(string, true);
                                                                c40214b.f173651g = true;
                                                            } else if ("background-color".equals(strM129098a)) {
                                                                c40214b.f173652h = AbstractC38048c.m121830a(string, true);
                                                                c40214b.f173653i = true;
                                                            } else if ("ruby-position".equals(strM129098a)) {
                                                                if ("over".equals(string)) {
                                                                    c40214b.f173660p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    c40214b.f173660p = 2;
                                                                }
                                                            } else if ("text-combine-upright".equals(strM129098a)) {
                                                                if ("all".equals(string)) {
                                                                    z4 = true;
                                                                } else {
                                                                    z4 = true;
                                                                }
                                                                c40214b.f173661q = z4;
                                                            } else if ("text-decoration".equals(strM129098a)) {
                                                                if ("underline".equals(string)) {
                                                                    c40214b.f173655k = 1;
                                                                }
                                                            } else if ("font-family".equals(strM129098a)) {
                                                                c40214b.f173649e = AbstractC31375j.m96499o(string);
                                                            } else if ("font-weight".equals(strM129098a)) {
                                                                if ("bold".equals(string)) {
                                                                    c40214b.f173656l = 1;
                                                                }
                                                            } else if ("font-style".equals(strM129098a)) {
                                                                if ("italic".equals(string)) {
                                                                    c40214b.f173657m = 1;
                                                                }
                                                            } else if ("font-size".equals(strM129098a)) {
                                                                matcher = C40213a.f173642d.matcher(AbstractC31375j.m96499o(string));
                                                                if (matcher.matches()) {
                                                                    strGroup = matcher.group(2);
                                                                    strGroup.getClass();
                                                                    switch (strGroup.hashCode()) {
                                                                        case 37:
                                                                            if (!strGroup.equals("%")) {
                                                                                b = 0;
                                                                            }
                                                                            switch (b) {
                                                                                case 0:
                                                                                    i15 = 1;
                                                                                    c40214b.f173658n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i15 = 1;
                                                                                    c40214b.f173658n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i15 = 1;
                                                                                    c40214b.f173658n = 1;
                                                                                    break;
                                                                                default:
                                                                                    throw new IllegalStateException();
                                                                            }
                                                                            String strGroup3 = matcher.group(i15);
                                                                            strGroup3.getClass();
                                                                            c40214b.f173659o = Float.parseFloat(strGroup3);
                                                                            break;
                                                                        case 3240:
                                                                            if (!strGroup.equals("em")) {
                                                                                b = 1;
                                                                            }
                                                                            switch (b) {
                                                                                case 0:
                                                                                    i15 = 1;
                                                                                    c40214b.f173658n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i15 = 1;
                                                                                    c40214b.f173658n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i15 = 1;
                                                                                    c40214b.f173658n = 1;
                                                                                    break;
                                                                                default:
                                                                                    throw new IllegalStateException();
                                                                            }
                                                                            String strGroup4 = matcher.group(i15);
                                                                            strGroup4.getClass();
                                                                            c40214b.f173659o = Float.parseFloat(strGroup4);
                                                                            break;
                                                                        case 3592:
                                                                            if (!strGroup.equals("px")) {
                                                                                b = 2;
                                                                            }
                                                                            switch (b) {
                                                                                case 0:
                                                                                    i15 = 1;
                                                                                    c40214b.f173658n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i15 = 1;
                                                                                    c40214b.f173658n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i15 = 1;
                                                                                    c40214b.f173658n = 1;
                                                                                    break;
                                                                                default:
                                                                                    throw new IllegalStateException();
                                                                            }
                                                                            String strGroup5 = matcher.group(i15);
                                                                            strGroup5.getClass();
                                                                            c40214b.f173659o = Float.parseFloat(strGroup5);
                                                                            break;
                                                                    }
                                                                    b = -1;
                                                                    switch (b) {
                                                                        case 0:
                                                                            i15 = 1;
                                                                            c40214b.f173658n = 3;
                                                                            break;
                                                                        case 1:
                                                                            i15 = 1;
                                                                            c40214b.f173658n = 2;
                                                                            break;
                                                                        case 2:
                                                                            i15 = 1;
                                                                            c40214b.f173658n = 1;
                                                                            break;
                                                                        default:
                                                                            throw new IllegalStateException();
                                                                    }
                                                                    String strGroup6 = matcher.group(i15);
                                                                    strGroup6.getClass();
                                                                    c40214b.f173659o = Float.parseFloat(strGroup6);
                                                                } else {
                                                                    AbstractC38046a.m121826u("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                }
                                                            }
                                                        } else if ("}".equals(strM129099b4)) {
                                                            c38059n2.m121846F(i36);
                                                            if ("color".equals(strM129098a)) {
                                                                c40214b.f173650f = AbstractC38048c.m121830a(string, true);
                                                                c40214b.f173651g = true;
                                                            } else if ("background-color".equals(strM129098a)) {
                                                                c40214b.f173652h = AbstractC38048c.m121830a(string, true);
                                                                c40214b.f173653i = true;
                                                            } else if ("ruby-position".equals(strM129098a)) {
                                                                if ("over".equals(string)) {
                                                                    c40214b.f173660p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    c40214b.f173660p = 2;
                                                                }
                                                            } else if ("text-combine-upright".equals(strM129098a)) {
                                                                if ("all".equals(string) || string.startsWith("digits")) {
                                                                    z4 = true;
                                                                } else {
                                                                    z4 = false;
                                                                }
                                                                c40214b.f173661q = z4;
                                                            } else if ("text-decoration".equals(strM129098a)) {
                                                                if ("underline".equals(string)) {
                                                                    c40214b.f173655k = 1;
                                                                }
                                                            } else if ("font-family".equals(strM129098a)) {
                                                                c40214b.f173649e = AbstractC31375j.m96499o(string);
                                                            } else if ("font-weight".equals(strM129098a)) {
                                                                if ("bold".equals(string)) {
                                                                    c40214b.f173656l = 1;
                                                                }
                                                            } else if ("font-style".equals(strM129098a)) {
                                                                if ("italic".equals(string)) {
                                                                    c40214b.f173657m = 1;
                                                                }
                                                            } else if ("font-size".equals(strM129098a)) {
                                                                matcher = C40213a.f173642d.matcher(AbstractC31375j.m96499o(string));
                                                                if (matcher.matches()) {
                                                                    AbstractC38046a.m121826u("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                } else {
                                                                    strGroup = matcher.group(2);
                                                                    strGroup.getClass();
                                                                    switch (strGroup.hashCode()) {
                                                                        case 37:
                                                                            if (!strGroup.equals("%")) {
                                                                                b = 0;
                                                                            }
                                                                            switch (b) {
                                                                                case 0:
                                                                                    i15 = 1;
                                                                                    c40214b.f173658n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i15 = 1;
                                                                                    c40214b.f173658n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i15 = 1;
                                                                                    c40214b.f173658n = 1;
                                                                                    break;
                                                                                default:
                                                                                    throw new IllegalStateException();
                                                                            }
                                                                            String strGroup7 = matcher.group(i15);
                                                                            strGroup7.getClass();
                                                                            c40214b.f173659o = Float.parseFloat(strGroup7);
                                                                            break;
                                                                        case 3240:
                                                                            if (!strGroup.equals("em")) {
                                                                                b = 1;
                                                                            }
                                                                            switch (b) {
                                                                                case 0:
                                                                                    i15 = 1;
                                                                                    c40214b.f173658n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i15 = 1;
                                                                                    c40214b.f173658n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i15 = 1;
                                                                                    c40214b.f173658n = 1;
                                                                                    break;
                                                                                default:
                                                                                    throw new IllegalStateException();
                                                                            }
                                                                            String strGroup8 = matcher.group(i15);
                                                                            strGroup8.getClass();
                                                                            c40214b.f173659o = Float.parseFloat(strGroup8);
                                                                            break;
                                                                        case 3592:
                                                                            if (!strGroup.equals("px")) {
                                                                                b = 2;
                                                                            }
                                                                            switch (b) {
                                                                                case 0:
                                                                                    i15 = 1;
                                                                                    c40214b.f173658n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i15 = 1;
                                                                                    c40214b.f173658n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i15 = 1;
                                                                                    c40214b.f173658n = 1;
                                                                                    break;
                                                                                default:
                                                                                    throw new IllegalStateException();
                                                                            }
                                                                            String strGroup9 = matcher.group(i15);
                                                                            strGroup9.getClass();
                                                                            c40214b.f173659o = Float.parseFloat(strGroup9);
                                                                            break;
                                                                    }
                                                                    b = -1;
                                                                    switch (b) {
                                                                        case 0:
                                                                            i15 = 1;
                                                                            c40214b.f173658n = 3;
                                                                            break;
                                                                        case 1:
                                                                            i15 = 1;
                                                                            c40214b.f173658n = 2;
                                                                            break;
                                                                        case 2:
                                                                            i15 = 1;
                                                                            c40214b.f173658n = 1;
                                                                            break;
                                                                        default:
                                                                            throw new IllegalStateException();
                                                                    }
                                                                    String strGroup10 = matcher.group(i15);
                                                                    strGroup10.getClass();
                                                                    c40214b.f173659o = Float.parseFloat(strGroup10);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            r10 = r14;
                                            z13 = false;
                                            i18 = 1;
                                        }
                                        if ("}".equals(strM129099b2)) {
                                            arrayList3.add(c40214b);
                                        }
                                        z13 = false;
                                        i16 = -1;
                                        str = null;
                                        i18 = 1;
                                    }
                                }
                                arrayList.addAll(arrayList3);
                            } else if (b6 == 3) {
                                Pattern pattern = AbstractC40219g.f173674a;
                                Charset charset = StandardCharsets.UTF_8;
                                String strM121855h2 = c38059n.m121855h(charset);
                                if (strM121855h2 == null) {
                                    c40215cM129105d = null;
                                } else {
                                    Pattern pattern2 = AbstractC40219g.f173674a;
                                    Matcher matcher3 = pattern2.matcher(strM121855h2);
                                    if (matcher3.matches()) {
                                        c40215cM129105d = AbstractC40219g.m129105d(null, matcher3, c38059n, arrayList);
                                    } else {
                                        c40215cM129105d = null;
                                        String strM121855h3 = c38059n.m121855h(charset);
                                        if (strM121855h3 != null) {
                                            Matcher matcher4 = pattern2.matcher(strM121855h3);
                                            if (matcher4.matches()) {
                                                c40215cM129105d = AbstractC40219g.m129105d(strM121855h2.trim(), matcher4, c38059n, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (c40215cM129105d != null) {
                                    arrayList2.add(c40215cM129105d);
                                }
                            }
                            c33652u = this;
                        }
                    }
                }
            }
        } catch (ParserException e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    /* JADX INFO: renamed from: l */
    public String m106287l(String str) {
        try {
            C39697d c39697d = (C39697d) this.f140441w;
            Task taskDoRead = c39697d.doRead(new C33980j0(c39697d, str));
            C29406b c29406b = new C29406b();
            c29406b.f119429M = taskDoRead;
            taskDoRead.addOnCompleteListener(EnumC29422r.f119461w, new C23548b(c29406b, 26));
            return (String) c29406b.get(2L, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e5) {
            Log.w("OssLicenses", "Failed to get package name from OssLicensesClient", e5);
            return str;
        }
    }

    @Override // p073cq.InterfaceC11035d
    /* JADX INFO: renamed from: q */
    public void mo944q(Task task) {
        C38606b c38606b = (C38606b) this.f140441w;
        C11040i c11040i = (C11040i) this.f140442x;
        synchronized (c38606b.f166099f) {
            c38606b.f166098e.remove(c11040i);
        }
    }

    public C33652u(int i13) {
        switch (i13) {
            case 11:
                this.f140441w = new C38059n();
                this.f140442x = new C40213a();
                break;
            case 12:
                this.f140441w = new C41198t();
                this.f140442x = AbstractC3269g.m9493Z(Boolean.FALSE);
                break;
            default:
                this.f140441w = null;
                this.f140442x = null;
                break;
        }
    }
}
