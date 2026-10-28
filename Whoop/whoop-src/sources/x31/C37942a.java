package x31;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.Map;
import l83.C23454a0;
import l83.C23465k;
import p024b0.C2178b;
import p335n6.InterfaceC26398o;
import p390p1.C28633k1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28650o2;
import p395p6.C28894l;
import p412q3.C29891y;
import p605x6.C38007l;
import p634y1.C39029b;
import p664yy.AbstractC39861h;
import p664yy.AbstractC39872m0;
import p664yy.EnumC39868k0;
import p668z1.InterfaceC39965n;
import p672z6.C40118a;
import p672z6.C40123f;
import p715kotlin.jvm.internal.AbstractC22676k;
import uf3.C34911a;
import va3.AbstractC35854l;
import xf3.C38266c;
import xh0.C38308d;
import xp2.C38532a;
import xr0.C38627a;
import y90.C39351a;
import yb0.C39378a;
import yb0.C39379b;
import yd2.C39460b;
import yf1.C39512a;
import yk2.C39601a;
import yw1.C39814a;
import yw1.C39815b;
import z12.C39997a;
import z22.C40022a;

/* JADX INFO: renamed from: x31.a */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C37942a implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f162427w;

    public /* synthetic */ C37942a(int i13) {
        this.f162427w = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) throws IOException {
        switch (this.f162427w) {
            case 0:
                return C37943b.m121491f((Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return C37943b.m121490e((Composer) obj, ((Integer) obj2).intValue());
            case 2:
                return AbstractC37947f.m121497D(((Integer) obj).intValue(), ((Integer) obj2).intValue());
            case 3:
                ((C38007l) obj).getClass();
                C23465k[] c23465kArr = {new C23465k("KEY", ((C28894l) obj2).f116951a)};
                C2178b c2178b = new C2178b(1);
                C23465k c23465k = c23465kArr[0];
                c2178b.m6858d(c23465k.f92938x, (String) c23465k.f92937w);
                return c2178b.m6856b();
            case 4:
                return C38308d.m122741c((Composer) obj, ((Integer) obj2).intValue());
            case 5:
                return C38532a.m123431c((Composer) obj, ((Integer) obj2).intValue());
            case 6:
                return C38627a.m123825g((C38266c) obj, (C34911a) obj2);
            case 7:
                return C38627a.m123826h((C38266c) obj, (C34911a) obj2);
            case 8:
                return C38627a.m123827i((C38266c) obj, (C34911a) obj2);
            case 9:
                return C38627a.m123828j((C38266c) obj, (C34911a) obj2);
            case 10:
                C39029b c39029b = (C39029b) obj;
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) obj2;
                if (!(interfaceC28601c1 instanceof InterfaceC39965n)) {
                    throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
                }
                InterfaceC39965n interfaceC39965n = (InterfaceC39965n) interfaceC28601c1;
                Object objInvoke = ((InterfaceC4351m) C29891y.f122124d.f115462x).invoke(c39029b, interfaceC39965n.getValue());
                if (objInvoke == null) {
                    return null;
                }
                InterfaceC28650o2 interfaceC28650o2Mo87021h = interfaceC39965n.mo87021h();
                AbstractC22676k.m65748h(interfaceC28650o2Mo87021h, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
                return new C28633k1(objInvoke, interfaceC28650o2Mo87021h);
            case 11:
                return C39351a.m125476d((C38266c) obj, (C34911a) obj2);
            case 12:
                return C39351a.m125477e((C38266c) obj, (C34911a) obj2);
            case 13:
                return C39378a.m125590c((Composer) obj, ((Integer) obj2).intValue());
            case 14:
                return C39379b.m125593c((Composer) obj, ((Integer) obj2).intValue());
            case 15:
                return C39460b.m126011c((Composer) obj, ((Integer) obj2).intValue());
            case 16:
                return C39512a.m126170c((Composer) obj, ((Integer) obj2).intValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C39601a.m126491c((Composer) obj, ((Integer) obj2).intValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C39814a.m127648c((Composer) obj, ((Integer) obj2).intValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C39815b.m127651c((Composer) obj, ((Integer) obj2).intValue());
            case 20:
                HttpURLConnection open = (HttpURLConnection) obj;
                AbstractC39872m0 request = (AbstractC39872m0) obj2;
                AbstractC22676k.m65750j(open, "$this$open");
                AbstractC22676k.m65750j(request, "request");
                open.setConnectTimeout(AbstractC39861h.f172143a);
                open.setReadTimeout(AbstractC39861h.f172144b);
                open.setUseCaches(request.getShouldCache());
                open.setRequestMethod(request.getMethod().f172167w);
                for (Map.Entry entry : request.getHeaders().entrySet()) {
                    open.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (EnumC39868k0.POST == request.getMethod()) {
                    open.setDoOutput(true);
                    Map<String, String> postHeaders = request.getPostHeaders();
                    if (postHeaders != null) {
                        for (Map.Entry<String, String> entry2 : postHeaders.entrySet()) {
                            open.setRequestProperty(entry2.getKey(), entry2.getValue());
                        }
                    }
                    OutputStream outputStream = open.getOutputStream();
                    try {
                        AbstractC22676k.m65747g(outputStream);
                        request.writePostBody(outputStream);
                        outputStream.close();
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            AbstractC35854l.m113829i(outputStream, th3);
                            throw th4;
                        }
                    }
                }
                return C23454a0.f92919a;
            case 21:
                return C39997a.m128230i((C38266c) obj, (C34911a) obj2);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C39997a.m128231j((C38266c) obj, (C34911a) obj2);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C39997a.m128232k((C38266c) obj, (C34911a) obj2);
            case 24:
                return C39997a.m128235n((C38266c) obj, (C34911a) obj2);
            case 25:
                return C39997a.m128236o((C38266c) obj, (C34911a) obj2);
            case 26:
                return C40022a.m128288c((Composer) obj, ((Integer) obj2).intValue());
            case 27:
                ((C40118a) obj).f173162a = (String) obj2;
                return C23454a0.f92919a;
            case 28:
                ((C40118a) obj).f173165d = (InterfaceC26398o) obj2;
                return C23454a0.f92919a;
            default:
                ((C40118a) obj).f173163b = (C40123f) obj2;
                return C23454a0.f92919a;
        }
    }
}
