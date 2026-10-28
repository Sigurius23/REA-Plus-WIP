package u02;

import androidx.room.AbstractC1848z0;
import bc3.AbstractC3006f0;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.ktor.client.plugins.ResponseException;
import java.io.IOException;
import kotlinx.serialization.SerializationException;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import retrofit2.HttpException;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import w02.AbstractC36685b;

/* JADX INFO: renamed from: u02.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u0003*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0004\u0005\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lu02/a;", "T", "", "a", "c", "b", "Lu02/a$b;", "Lu02/a$c;", "network_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC34385a<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f144511a;

    /* JADX INFO: renamed from: u02.a$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JX\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u001c\u0010\r\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lu02/a$a;", "", "<init>", "()V", "T", "Ltr2/n;", "logger", "Lrr2/c;", "crashReporter", "", "errorPrefix", "Lkotlin/Function1;", "Lq83/d;", "apiCall", "Lu02/a;", "a", "(Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;", "network_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ Companion f144511a = new Companion();

        /* JADX INFO: renamed from: u02.a$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.network.api.ApiCall$Companion", m100430f = "ApiCall.kt", m100431l = {94}, m100432m = "execute", m100433v = 2)
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42430a<T> extends AbstractC32269c {

            /* JADX INFO: renamed from: E */
            /* synthetic */ Object f144512E;

            /* JADX INFO: renamed from: G */
            int f144514G;

            /* JADX INFO: renamed from: w */
            Object f144515w;

            /* JADX INFO: renamed from: x */
            Object f144516x;

            /* JADX INFO: renamed from: y */
            Object f144517y;

            /* JADX INFO: renamed from: z */
            Object f144518z;

            public C42430a(InterfaceC30057d<? super C42430a> interfaceC30057d) {
                super(interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                this.f144512E = obj;
                this.f144514G |= Integer.MIN_VALUE;
                return Companion.this.m108730a(null, null, null, null, this);
            }
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ Object m108729b(Companion companion, InterfaceC34116n interfaceC34116n, InterfaceC31766c interfaceC31766c, String str, Function1 function1, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                interfaceC31766c = null;
            }
            InterfaceC31766c interfaceC31766c2 = interfaceC31766c;
            if ((i13 & 4) != 0) {
                str = "";
            }
            return companion.m108730a(interfaceC34116n, interfaceC31766c2, str, function1, interfaceC30057d);
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0014  */
        /* JADX INFO: renamed from: a */
        public final <T> Object m108730a(InterfaceC34116n interfaceC34116n, InterfaceC31766c interfaceC31766c, String str, Function1 function1, InterfaceC30057d<? super InterfaceC34385a<? extends T>> interfaceC30057d) throws Exception {
            C42430a c42430a;
            if (interfaceC30057d instanceof C42430a) {
                c42430a = (C42430a) interfaceC30057d;
                int i13 = c42430a.f144514G;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    c42430a.f144514G = i13 - Integer.MIN_VALUE;
                } else {
                    c42430a = new C42430a(interfaceC30057d);
                }
            } else {
                c42430a = new C42430a(interfaceC30057d);
            }
            C42430a c42430a2 = c42430a;
            Object objInvoke = c42430a2.f144512E;
            Object obj = EnumC31071a.f128113w;
            int i14 = c42430a2.f144514G;
            try {
                if (i14 == 0) {
                    AbstractC34132o.m107864I(objInvoke);
                    c42430a2.f144515w = interfaceC34116n;
                    c42430a2.f144516x = interfaceC31766c;
                    c42430a2.f144517y = str;
                    c42430a2.f144518z = null;
                    c42430a2.f144514G = 1;
                    objInvoke = function1.invoke(c42430a2);
                    if (objInvoke == obj) {
                        return obj;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(objInvoke);
                }
                if ((objInvoke instanceof C29218v0) && !((C29218v0) objInvoke).f118269a.f146788Q) {
                    throw new HttpException((C29218v0) objInvoke);
                }
                return new c(objInvoke);
            } catch (Exception e5) {
                AbstractC3006f0.m8721o(c42430a2.getContext());
                String strM117759a = AbstractC36685b.m117759a(e5, str, interfaceC34116n, interfaceC31766c);
                if (e5 instanceof IOException) {
                    return new b.C42432b(e5, strM117759a, false);
                }
                if (e5 instanceof HttpException) {
                    return new b.a(e5, strM117759a, ((HttpException) e5).f128920w, false);
                }
                if (e5 instanceof ResponseException) {
                    return new b.a(e5, strM117759a, ((ResponseException) e5).f74974w.mo13325e().f70530a, false);
                }
                if (!(e5 instanceof SerializationException)) {
                    throw e5;
                }
                return new b.a.C42431a(e5, strM117759a, 0, false, 4, null);
            }
        }
    }

    /* JADX INFO: renamed from: u02.a$b */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u0002:\u0002\u0007\u000bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004R\u0018\u0010\t\u001a\u00060\u0005j\u0002`\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8 X \u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, m65681d2 = {"Lu02/a$b;", "T", "Lu02/a;", "<init>", "()V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "b", "()Ljava/lang/Exception;", "exception", "", "a", "()Ljava/lang/String;", "errorMessage", "", "c", "()Z", "handled", "Lu02/a$b$a;", "Lu02/a$b$b;", "network_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class b<T> implements InterfaceC34385a<T> {

        /* JADX INFO: renamed from: u02.a$b$b, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0086\b\u0018\u0000*\u0006\b\u0002\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B#\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u001a\u0010\t\u001a\u00020\b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lu02/a$b$b;", "T", "Lu02/a$b;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "", "errorMessage", "", "handled", "<init>", "(Ljava/lang/Exception;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "c", "Ljava/lang/String;", "a", "d", "Z", "()Z", "network_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C42432b<T> extends b<T> {

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final Exception exception;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final String errorMessage;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final boolean handled;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42432b(Exception exception, String errorMessage, boolean z4) {
                super(null);
                AbstractC22676k.m65750j(exception, "exception");
                AbstractC22676k.m65750j(errorMessage, "errorMessage");
                this.exception = exception;
                this.errorMessage = errorMessage;
                this.handled = z4;
            }

            @Override // u02.InterfaceC34385a.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public String getErrorMessage() {
                return this.errorMessage;
            }

            @Override // u02.InterfaceC34385a.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public Exception getException() {
                return this.exception;
            }

            @Override // u02.InterfaceC34385a.b
            /* JADX INFO: renamed from: c, reason: from getter */
            public boolean getHandled() {
                return this.handled;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C42432b)) {
                    return false;
                }
                C42432b c42432b = (C42432b) other;
                return AbstractC22676k.m65745e(this.exception, c42432b.exception) && AbstractC22676k.m65745e(this.errorMessage, c42432b.errorMessage) && this.handled == c42432b.handled;
            }

            public int hashCode() {
                return Boolean.hashCode(this.handled) + AbstractC11266d.m30450d(this.exception.hashCode() * 31, 31, this.errorMessage);
            }

            public String toString() {
                Exception exc = this.exception;
                String str = this.errorMessage;
                boolean z4 = this.handled;
                StringBuilder sb4 = new StringBuilder("Network(exception=");
                sb4.append(exc);
                sb4.append(", errorMessage=");
                sb4.append(str);
                sb4.append(", handled=");
                return AbstractC18489d0.m53372m(sb4, z4, ")");
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public abstract String getErrorMessage();

        /* JADX INFO: renamed from: b */
        public abstract Exception getException();

        /* JADX INFO: renamed from: c */
        public abstract boolean getHandled();

        private b() {
        }

        /* JADX INFO: renamed from: u02.a$b$a */
        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0016\u0018\u0000*\u0006\b\u0002\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00020\u0002:\u0001\u0013B+\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001e\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\n8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0011\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lu02/a$b$a;", "T", "Lu02/a$b;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "", "errorMessage", "", "errorCode", "", "handled", "<init>", "(Ljava/lang/Exception;Ljava/lang/String;IZ)V", "b", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "c", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "d", "I", "()I", "e", "Z", "()Z", "network_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static class a<T> extends b<T> {

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final Exception exception;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final String errorMessage;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final int errorCode;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            private final boolean handled;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Exception exception, String errorMessage, int i13, boolean z4) {
                super(null);
                AbstractC22676k.m65750j(exception, "exception");
                AbstractC22676k.m65750j(errorMessage, "errorMessage");
                this.exception = exception;
                this.errorMessage = errorMessage;
                this.errorCode = i13;
                this.handled = z4;
            }

            @Override // u02.InterfaceC34385a.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public String getErrorMessage() {
                return this.errorMessage;
            }

            @Override // u02.InterfaceC34385a.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public Exception getException() {
                return this.exception;
            }

            @Override // u02.InterfaceC34385a.b
            /* JADX INFO: renamed from: c, reason: from getter */
            public boolean getHandled() {
                return this.handled;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public int getErrorCode() {
                return this.errorCode;
            }

            /* JADX INFO: renamed from: u02.a$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes9.dex */
            @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0086\b\u0018\u0000*\u0006\b\u0003\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00030\u0002B-\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\n8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, m65681d2 = {"Lu02/a$b$a$a;", "T", "Lu02/a$b$a;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "", "errorMessage", "", "errorCode", "", "handled", "<init>", "(Ljava/lang/Exception;Ljava/lang/String;IZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "f", "Ljava/lang/Exception;", "b", "()Ljava/lang/Exception;", "g", "Ljava/lang/String;", "a", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "I", "d", "i", "Z", "c", "()Z", "network_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final /* data */ class C42431a<T> extends a<T> {

                /* JADX INFO: renamed from: f, reason: from kotlin metadata */
                private final Exception exception;

                /* JADX INFO: renamed from: g, reason: from kotlin metadata */
                private final String errorMessage;

                /* JADX INFO: renamed from: h, reason: from kotlin metadata */
                private final int errorCode;

                /* JADX INFO: renamed from: i, reason: from kotlin metadata */
                private final boolean handled;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C42431a(Exception exception, String errorMessage, int i13, boolean z4) {
                    super(exception, errorMessage, i13, z4);
                    AbstractC22676k.m65750j(exception, "exception");
                    AbstractC22676k.m65750j(errorMessage, "errorMessage");
                    this.exception = exception;
                    this.errorMessage = errorMessage;
                    this.errorCode = i13;
                    this.handled = z4;
                }

                @Override // u02.InterfaceC34385a.b.a, u02.InterfaceC34385a.b
                /* JADX INFO: renamed from: a, reason: from getter */
                public String getErrorMessage() {
                    return this.errorMessage;
                }

                @Override // u02.InterfaceC34385a.b.a, u02.InterfaceC34385a.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public Exception getException() {
                    return this.exception;
                }

                @Override // u02.InterfaceC34385a.b.a, u02.InterfaceC34385a.b
                /* JADX INFO: renamed from: c, reason: from getter */
                public boolean getHandled() {
                    return this.handled;
                }

                @Override // u02.InterfaceC34385a.b.a
                /* JADX INFO: renamed from: d, reason: from getter */
                public int getErrorCode() {
                    return this.errorCode;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof C42431a)) {
                        return false;
                    }
                    C42431a c42431a = (C42431a) other;
                    return AbstractC22676k.m65745e(this.exception, c42431a.exception) && AbstractC22676k.m65745e(this.errorMessage, c42431a.errorMessage) && this.errorCode == c42431a.errorCode && this.handled == c42431a.handled;
                }

                public int hashCode() {
                    return Boolean.hashCode(this.handled) + AbstractC11266d.m30448b(this.errorCode, AbstractC11266d.m30450d(this.exception.hashCode() * 31, 31, this.errorMessage), 31);
                }

                public String toString() {
                    return "Deserialization(exception=" + this.exception + ", errorMessage=" + this.errorMessage + ", errorCode=" + this.errorCode + ", handled=" + this.handled + ")";
                }

                public /* synthetic */ C42431a(Exception exc, String str, int i13, boolean z4, int i14, DefaultConstructorMarker defaultConstructorMarker) {
                    this(exc, str, (i14 & 4) != 0 ? AbstractC1848z0.MAX_BIND_PARAMETER_CNT : i13, z4);
                }
            }
        }
    }

    /* JADX INFO: renamed from: u02.a$c */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lu02/a$c;", "T", "Lu02/a;", "data", "<init>", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "network_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c<T> implements InterfaceC34385a<T> {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final T data;

        public c(T t14) {
            this.data = t14;
        }

        /* JADX INFO: renamed from: a */
        public final T m108735a() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.data, ((c) other).data);
        }

        public int hashCode() {
            T t14 = this.data;
            if (t14 == null) {
                return 0;
            }
            return t14.hashCode();
        }

        public String toString() {
            return AbstractC18489d0.m53369j(this.data, "Success(data=", ")");
        }
    }
}
