package u92;

import android.content.Context;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: u92.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0012\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m65681d2 = {"Lu92/b;", "Lu92/d;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ll83/a0;", "y", "()V", "", "value", "A", "(Z)V", "", "getForceQuitTimeStamp", "()J", "z", "(J)V", "forceQuitTimeStamp", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34658b extends C34660d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34658b(Context context) {
        super(context, "mainPreferences");
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX INFO: renamed from: A */
    public final void m109512A(boolean value) {
        m109538q("wasLastForceQuit", value);
    }

    /* JADX INFO: renamed from: y */
    public final void m109513y() {
        m109541t("forceQuitCount", m109531h("forceQuitCount", 0) + 1);
    }

    /* JADX INFO: renamed from: z */
    public final void m109514z(long j7) {
        m109542u("forceQuitTimeMillis", j7);
    }
}
