package t23;

import io.getstream.android.video.generated.apis.ProductvideoApi;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: t23.s3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33453s3 extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C33366b4 f139697E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ String f139698F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ String f139699G;

    /* JADX INFO: renamed from: w */
    public ProductvideoApi f139700w;

    /* JADX INFO: renamed from: x */
    public String f139701x;

    /* JADX INFO: renamed from: y */
    public String f139702y;

    /* JADX INFO: renamed from: z */
    public int f139703z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33453s3(C33366b4 c33366b4, String str, String str2, InterfaceC30057d interfaceC30057d) {
        super(1, interfaceC30057d);
        this.f139697E = c33366b4;
        this.f139698F = str;
        this.f139699G = str2;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        return new C33453s3(this.f139697E, this.f139698F, this.f139699G, interfaceC30057d);
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C33453s3) create((InterfaceC30057d) obj)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        String str;
        ProductvideoApi productvideoApi;
        String str2;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f139703z;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            C33366b4 c33366b4 = this.f139697E;
            ProductvideoApi productvideoApiM124884a = c33366b4.f139232E.m124884a();
            this.f139700w = productvideoApiM124884a;
            String str3 = this.f139698F;
            this.f139701x = str3;
            str = this.f139699G;
            this.f139702y = str;
            this.f139703z = 1;
            obj = C33366b4.m105794l(c33366b4, this);
            if (obj != enumC31071a) {
                productvideoApi = productvideoApiM124884a;
                str2 = str3;
            }
        }
        if (i13 != 1) {
            if (i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        String str4 = this.f139702y;
        String str5 = this.f139701x;
        ProductvideoApi productvideoApi2 = this.f139700w;
        AbstractC34132o.m107864I(obj);
        str2 = str5;
        productvideoApi = productvideoApi2;
        str = str4;
        this.f139700w = null;
        this.f139701x = null;
        this.f139702y = null;
        this.f139703z = 2;
        Object call$default = ProductvideoApi.getCall$default(productvideoApi, str2, str, (String) obj, null, null, null, null, this, 120, null);
        return call$default == enumC31071a ? enumC31071a : call$default;
    }
}
