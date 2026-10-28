package r32;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.personalrecords.miniarch.domain.models.ArchMiniPersonalRecords;
import e31.C12612d;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import p730qt2.C30617w;
import q32.C29952d;
import s32.C32115g;

/* JADX INFO: renamed from: r32.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Llb1/z0;", "Ll83/a0;", "b", "(Llb1/z0;)V", "personal-records-mini-arch_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30912a {

    /* JADX INFO: renamed from: r32.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f127486w;

        public a(Function1 function1) {
            this.f127486w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f127486w.invoke((ArchMiniPersonalRecords) it);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m95039b(C23749z0 c23749z0) {
        AbstractC22676k.m65750j(c23749z0, "<this>");
        c23749z0.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ArchMiniPersonalRecords.class), new a(new C30617w(20)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C32115g m95040c(ArchMiniPersonalRecords model) {
        AbstractC22676k.m65750j(model, "model");
        String path = model.getPath();
        if (path == null) {
            path = "";
        }
        return new C32115g(new C29952d(new C29952d.a(C12612d.f43056a.m35366a(), null, null, 6, null), null, null, 6, null), path);
    }
}
