package w02;

import ad3.AbstractC0757c;
import f63.AbstractC14155c;
import io.ktor.client.plugins.ResponseException;
import j93.AbstractC21478l0;
import kotlinx.serialization.SerializationException;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import retrofit2.HttpException;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u82.AbstractC34650k;
import ud3.AbstractC34799a1;
import wc3.InterfaceC37137b;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: w02.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0086@¢\u0006\u0004\b\f\u0010\rJ2\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000e2\n\u0010\n\u001a\u00060\bj\u0002`\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lw02/a;", "", "Lad3/c;", "json", "Ltr2/n;", "logger", "<init>", "(Lad3/c;Ltr2/n;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "", "b", "(Ljava/lang/Exception;Lq83/d;)Ljava/lang/Object;", "T", "Lwc3/b;", "deserializer", "a", "(Ljava/lang/Exception;Lwc3/b;Lq83/d;)Ljava/lang/Object;", "Lad3/c;", "Ltr2/n;", "network_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36684a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC0757c json;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: w02.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.network.exception.ErrorBodyParser", m100430f = "ErrorBodyParser.kt", m100431l = {60}, m100432m = "deserializeErrorBody", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a<T> extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f157114E;

        /* JADX INFO: renamed from: w */
        Object f157115w;

        /* JADX INFO: renamed from: x */
        Object f157116x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f157117y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f157117y = obj;
            this.f157114E |= Integer.MIN_VALUE;
            return C36684a.this.m117757a(null, null, this);
        }
    }

    /* JADX INFO: renamed from: w02.a$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.network.exception.ErrorBodyParser", m100430f = "ErrorBodyParser.kt", m100431l = {35}, m100432m = "readErrorBody", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f157119w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f157120x;

        /* JADX INFO: renamed from: z */
        int f157122z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f157120x = obj;
            this.f157122z |= Integer.MIN_VALUE;
            return C36684a.this.m117758b(null, this);
        }
    }

    public C36684a(AbstractC0757c json, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(logger, "logger");
        this.json = json;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: a */
    public final <T> Object m117757a(Exception exc, InterfaceC37137b interfaceC37137b, InterfaceC30057d<? super T> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f157114E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f157114E = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objM117758b = aVar.f157117y;
        Object obj = EnumC31071a.f128113w;
        int i14 = aVar.f157114E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM117758b);
            aVar.f157115w = null;
            aVar.f157116x = interfaceC37137b;
            aVar.f157114E = 1;
            objM117758b = m117758b(exc, aVar);
            if (objM117758b == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC37137b = (InterfaceC37137b) aVar.f157116x;
            AbstractC34132o.m107864I(objM117758b);
        }
        String str = (String) objM117758b;
        if (str == null) {
            return null;
        }
        try {
            return this.json.m1831b(interfaceC37137b, str);
        } catch (SerializationException e5) {
            this.logger.mo85230v(AbstractC31061c.m95640p("Failed to parse error response body: ", e5.getMessage(), ". Body: ", str), e5, new AbstractC30556a.a[0]);
            return null;
        } catch (IllegalArgumentException e13) {
            this.logger.mo85230v(AbstractC31061c.m95640p("Failed to parse error response body: ", e13.getMessage(), ". Body: ", str), e13, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m117758b(Exception exc, InterfaceC30057d<? super String> interfaceC30057d) {
        b bVar;
        String strM109860m;
        C29218v0 c29218v0;
        AbstractC34799a1 abstractC34799a1;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f157122z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f157122z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM60440k = bVar.f157120x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f157122z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM60440k);
            if (exc instanceof ResponseException) {
                AbstractC14155c abstractC14155c = ((ResponseException) exc).f74974w;
                bVar.f157119w = null;
                bVar.f157122z = 1;
                objM60440k = AbstractC21478l0.m60440k(abstractC14155c, AbstractC39397a.f169546a, bVar);
                if (objM60440k == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                strM109860m = (!(exc instanceof HttpException) || (c29218v0 = ((HttpException) exc).f128922y) == null || (abstractC34799a1 = c29218v0.f118271c) == null) ? null : abstractC34799a1.m109860m();
            }
            if (strM109860m == null && strM109860m.length() != 0) {
                return strM109860m;
            }
            this.logger.mo85228t("Error body is null or empty, cannot deserialize.", new AbstractC30556a.a[0]);
            return null;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(objM60440k);
        strM109860m = (String) objM60440k;
        if (strM109860m == null) {
        }
        this.logger.mo85228t("Error body is null or empty, cannot deserialize.", new AbstractC30556a.a[0]);
        return null;
    }

    public /* synthetic */ C36684a(AbstractC0757c abstractC0757c, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC34650k.m109496c() : abstractC0757c, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ErrorBodyParser") : interfaceC34116n);
    }
}
