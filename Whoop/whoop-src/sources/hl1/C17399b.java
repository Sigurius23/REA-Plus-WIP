package hl1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.home.domain.models.NotificationsWrapperModelV3;
import gm1.AbstractC15993c;
import jb1.InterfaceC21538d;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23743y0;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import p741vn1.C36213q;

/* JADX INFO: renamed from: hl1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lhl1/b;", "Ljb1/d;", "<init>", "()V", "Llb1/y0;", "a", "()Llb1/y0;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final class C17399b implements InterfaceC21538d {

    /* JADX INFO: renamed from: hl1.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f67370w;

        public a(Function1 function1) {
            this.f67370w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f67370w.invoke((NotificationsWrapperModelV3) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C36213q m49240c(NotificationsWrapperModelV3 model) {
        AbstractC22676k.m65750j(model, "model");
        return AbstractC15993c.m45207c0(model);
    }

    @Override // jb1.InterfaceC21538d
    /* JADX INFO: renamed from: a */
    public C23743y0 mo1796a() {
        C23749z0 c23749z0 = new C23749z0();
        c23749z0.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(NotificationsWrapperModelV3.class), new a(new C17398a()));
        return c23749z0.m69766b();
    }
}
