package r63;

import e93.AbstractC12889b;
import hc3.C17191x;
import java.util.ArrayList;
import java.util.List;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;

/* JADX INFO: renamed from: r63.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C30991c {

    /* JADX INFO: renamed from: e */
    public static final ArrayList f127959e = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final C17191x f127960a;

    /* JADX INFO: renamed from: b */
    public final AbstractC12889b f127961b;

    /* JADX INFO: renamed from: c */
    public List f127962c;

    /* JADX INFO: renamed from: d */
    public boolean f127963d;

    public C30991c(C17191x phase, AbstractC12889b abstractC12889b) {
        AbstractC22676k.m65750j(phase, "phase");
        ArrayList arrayList = f127959e;
        AbstractC22676k.m65748h(arrayList, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Function3<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.PhaseContent, Call of io.ktor.util.pipeline.PhaseContent>, TSubject of io.ktor.util.pipeline.PhaseContent, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>{ io.ktor.util.pipeline.PipelineKt.PipelineInterceptorFunction<TSubject of io.ktor.util.pipeline.PhaseContent, Call of io.ktor.util.pipeline.PhaseContent> }>");
        List interceptors = AbstractC22681m0.m65771b(arrayList);
        AbstractC22676k.m65750j(interceptors, "interceptors");
        this.f127960a = phase;
        this.f127961b = abstractC12889b;
        this.f127962c = interceptors;
        this.f127963d = true;
        if (!arrayList.isEmpty()) {
            throw new IllegalStateException("The shared empty array list has been modified");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m95528a(Function3 function3) {
        if (this.f127963d) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f127962c);
            this.f127962c = arrayList;
            this.f127963d = false;
        }
        this.f127962c.add(function3);
    }

    public final String toString() {
        return "Phase `" + this.f127960a.f66010b + "`, " + this.f127962c.size() + " handlers";
    }
}
