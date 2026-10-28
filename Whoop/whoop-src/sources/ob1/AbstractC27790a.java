package ob1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.avatarpill.AvatarPillModel;
import kd1.AbstractC22403o;
import l83.C23454a0;
import o72.C27644e;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23743y0;
import p716lb1.C23749z0;
import p716lb1.Function1;
import p720m91.InterfaceC25312u;
import x81.C38072d;
import yz0.C39906c;

/* JADX INFO: renamed from: ob1.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/design/models/items/avatarpill/AvatarPillModel;", "Lyz0/c;", "f", "(Lcom/whoop/design/models/items/avatarpill/AvatarPillModel;)Lyz0/c;", "Llb1/y0;", "a", "Llb1/y0;", "e", "()Llb1/y0;", "avatarPillMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27790a {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f112041a = Function1.m68251a(new C27644e(5));

    /* JADX INFO: renamed from: ob1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f112042w;

        public a(p715kotlin.jvm.functions.Function1 function1) {
            this.f112042w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f112042w.invoke((AvatarPillModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m83882c(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(AvatarPillModel.class), new a(new C27644e(6)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C39906c m83883d(AvatarPillModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m83885f(model);
    }

    /* JADX INFO: renamed from: e */
    public static final C23743y0 m83884e() {
        return f112041a;
    }

    /* JADX INFO: renamed from: f */
    private static final C39906c m83885f(AvatarPillModel avatarPillModel) {
        return new C39906c(new AbstractC22403o.c(avatarPillModel.getImage(), AbstractC11895b.m31985d(C38072d.f163053a), 0, 0, 12, null), avatarPillModel.getTitle(), avatarPillModel.getInteraction());
    }
}
