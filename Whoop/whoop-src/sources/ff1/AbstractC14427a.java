package ff1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.exerciseprogressminiarch.domain.models.ArchMiniExerciseProgress;
import e31.C12612d;
import ef1.C13147c;
import f41.C14068f;
import gf1.C15791j;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: ff1.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Llb1/z0;", "Ll83/a0;", "b", "(Llb1/z0;)V", "exercise-progress-mini-arch_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14427a {

    /* JADX INFO: renamed from: ff1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f52651w;

        public a(Function1 function1) {
            this.f52651w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f52651w.invoke((ArchMiniExerciseProgress) it);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m41140b(C23749z0 c23749z0) {
        AbstractC22676k.m65750j(c23749z0, "<this>");
        c23749z0.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ArchMiniExerciseProgress.class), new a(new C14068f(15)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C15791j m41141c(ArchMiniExerciseProgress model) {
        AbstractC22676k.m65750j(model, "model");
        String path = model.getPath();
        if (path == null) {
            path = "";
        }
        return new C15791j(new C13147c(new C13147c.a(C12612d.f43056a.m35366a(), null, null, 6, null), null, 2, null), path);
    }
}
