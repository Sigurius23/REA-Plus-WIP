package com.whoop.whooplabs;

import androidx.lifecycle.InterfaceC1633v0;
import l83.InterfaceC23459e;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.InterfaceC22666f;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;

/* JADX INFO: renamed from: com.whoop.whooplabs.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0017\u0010\u0004\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, m65681d2 = {"Lkotlin/time/Duration;", "a", "J", "()J", "BTHR_TIMEOUT", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC10824b {

    /* JADX INFO: renamed from: a */
    private static final long f33202a;

    /* JADX INFO: renamed from: com.whoop.whooplabs.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC1633v0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f33203w;

        public a(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f33203w = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f33203w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f33203w.invoke(obj);
        }
    }

    static {
        Duration.Companion companion = Duration.INSTANCE;
        f33202a = DurationKt.toDuration(20, DurationUnit.SECONDS);
    }

    /* JADX INFO: renamed from: a */
    public static final long m28487a() {
        return f33202a;
    }
}
