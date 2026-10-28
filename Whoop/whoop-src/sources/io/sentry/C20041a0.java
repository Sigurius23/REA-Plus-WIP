package io.sentry;

import io.sentry.hints.InterfaceC20361h;
import java.io.File;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.a0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20041a0 extends AbstractC20601v {

    /* JADX INFO: renamed from: e */
    public final InterfaceC20308d1 f75190e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC20390j1 f75191f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC20602v0 f75192g;

    public C20041a0(InterfaceC20308d1 interfaceC20308d1, InterfaceC20390j1 interfaceC20390j1, InterfaceC20602v0 interfaceC20602v0, long j7, int i13) {
        super(interfaceC20308d1, interfaceC20602v0, j7, i13);
        AbstractC29125c.m88510S(interfaceC20308d1, "Scopes are required.");
        this.f75190e = interfaceC20308d1;
        AbstractC29125c.m88510S(interfaceC20390j1, "Serializer is required.");
        this.f75191f = interfaceC20390j1;
        AbstractC29125c.m88510S(interfaceC20602v0, "Logger is required.");
        this.f75192g = interfaceC20602v0;
    }

    /* JADX INFO: renamed from: c */
    public static void m55886c(C20041a0 c20041a0, File file, InterfaceC20361h interfaceC20361h) {
        InterfaceC20602v0 interfaceC20602v0 = c20041a0.f75192g;
        if (interfaceC20361h.mo56034a()) {
            interfaceC20602v0.mo16066m(EnumC20436n5.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
            return;
        }
        try {
            if (!file.delete()) {
                interfaceC20602v0.mo16066m(EnumC20436n5.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), "after trying to capture it");
            }
        } catch (Throwable th3) {
            interfaceC20602v0.mo16058i(EnumC20436n5.ERROR, th3, "Failed to delete '%s' %s", file.getAbsolutePath(), "after trying to capture it");
        }
        interfaceC20602v0.mo16066m(EnumC20436n5.DEBUG, "Deleted file %s.", file.getAbsolutePath());
    }

    @Override // io.sentry.AbstractC20601v
    /* JADX INFO: renamed from: a */
    public final boolean mo55887a(String str) {
        return str.endsWith(".envelope");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0115, code lost:
    
        if (r2 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0117, code lost:
    
        m55886c(r8, r9, (io.sentry.hints.InterfaceC20361h) r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0140, code lost:
    
        if (r2 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0160, code lost:
    
        if (r2 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0163, code lost:
    
        return;
     */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:576)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:602)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    @Override // io.sentry.AbstractC20601v
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo55888b(java.io.File r9, io.sentry.C20337g0 r10) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.C20041a0.mo55888b(java.io.File, io.sentry.g0):void");
    }
}
