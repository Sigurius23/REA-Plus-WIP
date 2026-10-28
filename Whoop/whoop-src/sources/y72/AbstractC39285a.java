package y72;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.UnknownDesignModel;
import com.whoop.sanguine.domain.models.SanguineWaitlistSection;
import h51.C16934f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.Function1;
import p720m91.InterfaceC25312u;
import x72.C38043a;
import y41.C39211b;
import z72.C40162h;

/* JADX INFO: renamed from: y72.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\b\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\u0004\"\u001a\u0010\u000e\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m65681d2 = {"Ljb1/a;", "a", "Ljb1/a;", "getBaseDesignItemReducer", "()Ljb1/a;", "baseDesignItemReducer", "b", "g", "sanguineDesignItemReducer", "Lm91/p;", "c", "Lm91/p;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lm91/p;", "sanguineItemViewFactory", "sanguine_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39285a {

    /* JADX INFO: renamed from: a */
    private static final C21535a f169016a = AbstractC21537c.m60554d(new C39211b(6));

    /* JADX INFO: renamed from: b */
    private static final C21535a f169017b = AbstractC21537c.m60554d(new C39211b(7));

    /* JADX INFO: renamed from: c */
    private static final C25307p f169018c = Function1.m74306g(new C39211b(8));

    /* JADX INFO: renamed from: y72.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements p715kotlin.jvm.functions.Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            return C16934f.m47677b((C16934f) it, null, null, null, null, null, null, false, false, null, null, null, null, false, 8063, null);
        }
    }

    /* JADX INFO: renamed from: y72.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f169019w;

        public b(p715kotlin.jvm.functions.Function1 function1) {
            this.f169019w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f169019w.invoke((SanguineWaitlistSection) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m125250f(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60546a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C16934f.class), new a());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    public static final C21535a m125251g() {
        return f169017b;
    }

    /* JADX INFO: renamed from: h */
    public static final C25307p m125252h() {
        return f169018c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m125253i(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C39211b(9));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m125254j(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(SanguineWaitlistSection.class), new b(new C39211b(10)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C38043a m125255k(SanguineWaitlistSection model) {
        AbstractC22676k.m65750j(model, "model");
        String headerText = model.getHeaderText();
        String bodyText = model.getBodyText();
        List<DesignSystemModel> content = model.getContent();
        ArrayList arrayList = new ArrayList();
        for (Object obj : content) {
            if (!(((DesignSystemModel) obj) instanceof UnknownDesignModel)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(f169016a.m60541h((DesignSystemModel) it.next()));
        }
        return new C38043a(headerText, bodyText, arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m125256l(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        designItemViewFactory.m74324c().put(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38043a.class), new C40162h());
        return C23454a0.f92919a;
    }
}
