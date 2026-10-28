package xd2;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.CtaTileModel;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import d11.C11474i;
import i91.AbstractC18249c;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23593a5;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import xa0.C38136a;
import y71.C39274g;

/* JADX INFO: renamed from: xd2.l */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, m65681d2 = {"Ljb1/a;", "a", "Ljb1/a;", "shepherdNotificationHistoryReducer", "shepherd_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38216l {

    /* JADX INFO: renamed from: a */
    private static final C21535a f163802a = AbstractC21537c.m60554d(new C38136a(12));

    /* JADX INFO: renamed from: xd2.l$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f163803w = new a();

        /* JADX INFO: renamed from: a */
        public final long m122485a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getWhite10();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m122485a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: xd2.l$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            C11474i c11474i = (C11474i) it;
            TextResource title = c11474i.getTitle();
            C39274g leftIcon = c11474i.getLeftIcon();
            C9598e navigationAction = c11474i.getNavigationAction();
            return new C11474i(null, null, null, title, null, null, leftIcon, null, null, null, null, false, false, null, null, null, c11474i.getShowCaretIcon(), false, null, AbstractC18249c.m52574l(a.f163803w), null, null, 0.0f, 0.0f, 0.0f, 0.0f, Float.NaN, null, navigationAction, 200736567, null);
        }
    }

    /* JADX INFO: renamed from: xd2.l$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f163804w;

        public c(Function1 function1) {
            this.f163804w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f163804w.invoke((CtaTileModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m122482e(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60546a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C11474i.class), new b());
        designItemReducer.m60547b(new C38136a(13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m122483f(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(CtaTileModel.class), new c(new C38136a(14)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C11474i m122484g(CtaTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        return AbstractC23593a5.m68356d0(model);
    }
}
