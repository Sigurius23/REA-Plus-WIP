package hr1;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.clinicalreportcard.ClinicalReportCardModel;
import com.whoop.design.models.items.keyinfotile.KeyInfoItemModel;
import com.whoop.design.models.items.keyinfotile.KeyInfoTileModel;
import com.whoop.design.models.items.secondaryactionbutton.SecondaryActionButtonModel;
import com.whoop.navigation.C9598e;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import hb1.C17085h;
import java.util.ArrayList;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import k11.AbstractC22122e;
import l83.C23454a0;
import lr1.C24696a;
import lr1.C24699d;
import m83.AbstractC25267u;
import ny0.C27256h;
import ny0.C27257h0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import r01.C30842c;

/* JADX INFO: renamed from: hr1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m65681d2 = {"", NotificationCompat.CATEGORY_EVENT, "Lcom/whoop/navigation/e;", "l", "(Ljava/lang/Object;)Lcom/whoop/navigation/e;", "Ljb1/a;", "a", "Ljb1/a;", "f", "()Ljb1/a;", "integrationsDesignItemReducer", "integrations_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17575a {

    /* JADX INFO: renamed from: a */
    private static final C21535a f68105a = AbstractC21537c.m60554d(new C17085h(18));

    /* JADX INFO: renamed from: hr1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            return C27256h.m82144b((C27256h) it, null, null, null, null, null, null, null, null, null, null, null, null, null, false, true, null, false, false, null, null, null, null, null, null, null, 33529855, null);
        }
    }

    /* JADX INFO: renamed from: hr1.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f68106w;

        public b(Function1 function1) {
            this.f68106w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f68106w.invoke((KeyInfoTileModel) it);
        }
    }

    /* JADX INFO: renamed from: hr1.a$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f68107w;

        public c(Function1 function1) {
            this.f68107w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f68107w.invoke((ClinicalReportCardModel) it);
        }
    }

    /* JADX INFO: renamed from: hr1.a$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f68108w;

        public d(Function1 function1) {
            this.f68108w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f68108w.invoke((SecondaryActionButtonModel) it);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final C21535a m50034f() {
        return f68105a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m50035g(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60546a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27256h.class), new a());
        designItemReducer.m60547b(new C17085h(19));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m50036h(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        C17085h c17085h = new C17085h(20);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(KeyInfoTileModel.class), new b(c17085h));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ClinicalReportCardModel.class), new c(new C17085h(21)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(SecondaryActionButtonModel.class), new d(new C17085h(22)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C24699d m50037i(KeyInfoTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        String title = model.getTitle();
        List<KeyInfoItemModel> items = model.getItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        for (KeyInfoItemModel keyInfoItemModel : items) {
            arrayList.add(new C24696a(keyInfoItemModel.getText(), AbstractC16315n0.m46378c(keyInfoItemModel.getIcon(), EnumC16313m0.INTEGRATIONS)));
        }
        return new C24699d(title, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C30842c m50038j(ClinicalReportCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        String imageUrl = model.getImageUrl();
        String title = model.getTitle();
        String description = model.getDescription();
        DesignSystemModel button = model.getButton();
        return new C30842c(imageUrl, title, description, button != null ? f68105a.m60544l(button) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C27257h0 m50039k(SecondaryActionButtonModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C27257h0(model.getTitle(), AbstractC16315n0.m46378c(model.getIcon(), EnumC16313m0.ARROW_FORWARD), model.getAction(), false, 8, null);
    }

    /* JADX INFO: renamed from: l */
    public static final C9598e m50040l(Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof C9598e) {
            return (C9598e) event;
        }
        if (event instanceof C27256h) {
            return ((C27256h) event).getDestination();
        }
        if (event instanceof AbstractC22122e.b) {
            return ((AbstractC22122e.b) event).getDestination();
        }
        return null;
    }
}
