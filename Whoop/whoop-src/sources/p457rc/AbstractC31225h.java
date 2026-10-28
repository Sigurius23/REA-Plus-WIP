package p457rc;

import android.app.Application;
import android.content.Context;
import p218ic.C18348b;
import p218ic.C18389w;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: rc.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC31225h {
    static {
        AbstractC22676k.m65749i(C18389w.m52887f("ProcessUtils"), "tagWithPrefix(...)");
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m96166a(Context context, C18348b configuration) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(configuration, "configuration");
        String processName = Application.getProcessName();
        AbstractC22676k.m65749i(processName, "getProcessName(...)");
        return processName.equals(context.getApplicationInfo().processName);
    }
}
