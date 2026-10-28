package vp0;

import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vp0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m65681d2 = {"Lvp0/a;", "", "a", "commons_release"}, m65682k = 1, m65683mv = {1, 5, 1}, m65685xi = 48)
public interface InterfaceC36263a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f155322a;

    /* JADX INFO: renamed from: vp0.a$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u00020\b2 \u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r8\u0006@BX\u0086.¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lvp0/a$a;", "", "<init>", "()V", "Lkotlin/Function3;", "", "", "", "Ll83/a0;", "logAction", "c", "(Lkotlin/jvm/functions/Function3;)V", "tag", "Lvp0/a;", "a", "(Ljava/lang/String;)Lvp0/a;", "<set-?>", "b", "Lvp0/a;", "()Lvp0/a;", "logger", "commons_release"}, m65682k = 1, m65683mv = {1, 5, 1}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ Companion f155322a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static InterfaceC36263a logger;

        /* JADX INFO: renamed from: vp0.a$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"vp0/a$a$a", "Lvp0/a;", "commons_release"}, m65682k = 1, m65683mv = {1, 5, 1}, m65685xi = 48)
        public static final class C42559a implements InterfaceC36263a {

            /* JADX INFO: renamed from: b */
            final /* synthetic */ Function3 f155324b;

            public C42559a(Function3 function3) {
                this.f155324b = function3;
            }
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC36263a m115719a(String tag) {
            AbstractC22676k.m65750j(tag, "tag");
            return new C36264b(m115720b(), tag);
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC36263a m115720b() {
            InterfaceC36263a interfaceC36263a = logger;
            if (interfaceC36263a != null) {
                return interfaceC36263a;
            }
            AbstractC22676k.m65757q("logger");
            throw null;
        }

        /* JADX INFO: renamed from: c */
        public final void m115721c(Function3 logAction) {
            AbstractC22676k.m65750j(logAction, "logAction");
            logger = new C42559a(logAction);
        }
    }
}
