package vk0;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import zj0.C40727h;

/* JADX INFO: renamed from: vk0.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lvk0/e;", "", "b", "a", "Lvk0/e$a;", "Lvk0/e$b;", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC36079e {

    /* JADX INFO: renamed from: vk0.e$a */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lvk0/e$a;", "Lvk0/e;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/lang/Exception;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC36079e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Exception exception;

        public a(Exception exception) {
            AbstractC22676k.m65750j(exception, "exception");
            this.exception = exception;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Exception getException() {
            return this.exception;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.exception, ((a) other).exception);
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            return "Error(exception=" + this.exception + ")";
        }
    }

    /* JADX INFO: renamed from: vk0.e$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lvk0/e$b;", "Lvk0/e;", "Lzj0/h;", "commandResponse", "<init>", "(Lzj0/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzj0/h;", "()Lzj0/h;", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC36079e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C40727h commandResponse;

        public b(C40727h c40727h) {
            this.commandResponse = c40727h;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C40727h getCommandResponse() {
            return this.commandResponse;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.commandResponse, ((b) other).commandResponse);
        }

        public int hashCode() {
            C40727h c40727h = this.commandResponse;
            if (c40727h == null) {
                return 0;
            }
            return c40727h.hashCode();
        }

        public String toString() {
            return "Success(commandResponse=" + this.commandResponse + ")";
        }
    }
}
