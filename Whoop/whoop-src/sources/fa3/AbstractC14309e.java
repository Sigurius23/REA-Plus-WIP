package fa3;

import cb3.AbstractC4393e;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31162w;
import u93.AbstractC34690n;
import va3.C35850h;

/* JADX INFO: renamed from: fa3.e */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14309e extends AbstractC14314g0 {

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ int f52250l = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final InterfaceC31162w m40918a(InterfaceC31162w functionDescriptor) {
        AbstractC22676k.m65750j(functionDescriptor, "functionDescriptor");
        C35850h name = ((AbstractC34690n) functionDescriptor).getName();
        AbstractC22676k.m65749i(name, "getName(...)");
        if (m40919b(name)) {
            return (InterfaceC31162w) AbstractC4393e.m13804b(functionDescriptor, C14307d.f52242x);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m40919b(C35850h c35850h) {
        AbstractC22676k.m65750j(c35850h, "<this>");
        return AbstractC14314g0.f52265e.contains(c35850h);
    }
}
