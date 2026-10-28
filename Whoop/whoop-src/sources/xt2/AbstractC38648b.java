package xt2;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.tiles.EmptyTileModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.weeklyplan.weeklyplan.domain.models.AddGoalCard;
import com.whoop.weeklyplan.weeklyplan.domain.models.LoggedRecoveries;
import com.whoop.weeklyplan.weeklyplan.domain.models.LoggedRecoveryItem;
import f01.EnumC13892q1;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j61.C21374h;
import j71.C21395c;
import java.util.ArrayList;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import k11.C22123f;
import k71.C22256m;
import l83.C23454a0;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23645i1;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import xl0.C38448b;
import y71.C39274g;
import zt2.C41133b;
import zt2.C41143l;
import zt2.C41145n;

/* JADX INFO: renamed from: xt2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Ljb1/a;", "a", "Ljb1/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ljb1/a;", "weeklyPlanDesignItemReducer", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38648b {

    /* JADX INFO: renamed from: a */
    private static final C21535a f166276a = AbstractC21537c.m60554d(new C38448b(14));

    /* JADX INFO: renamed from: xt2.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            C22256m c22256m = (C22256m) it;
            InterfaceC25312u graphItem = c22256m.getGraphItem();
            C21395c c21395c = graphItem instanceof C21395c ? (C21395c) graphItem : null;
            if (c21395c == null) {
                return c22256m;
            }
            C21374h plane = c21395c.getPlane();
            return C22256m.m63894b(c22256m, null, null, null, null, null, null, null, C21395c.m60092b(c21395c, plane.m59985a((8187 & 1) != 0 ? plane.startVerticalAxis : null, (8187 & 2) != 0 ? plane.endVerticalAxis : null, (8187 & 4) != 0 ? plane.bottomHorizontalAxis : null, (8187 & 8) != 0 ? plane.topHorizontalAxis : null, (8187 & 16) != 0 ? plane.insets : null, (8187 & 32) != 0 ? plane.lines : null, (8187 & 64) != 0 ? plane.graphAnnotations : null, (8187 & 128) != 0 ? plane.accessibilityState : null, (8187 & 256) != 0 ? plane.scrubberEnabled : false, (8187 & 512) != 0 ? plane.clickable : false, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? plane.buttons : null, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? plane.longPressTimeoutMillis : 0L, (8187 & 4096) != 0 ? plane.horizontalGridLinePadding : 0.0f), null, null, null, 14, null), null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, 8388479, null);
        }
    }

    /* JADX INFO: renamed from: xt2.b$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f166277w;

        public b(Function1 function1) {
            this.f166277w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f166277w.invoke((LoggedRecoveries) it);
        }
    }

    /* JADX INFO: renamed from: xt2.b$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f166278w;

        public c(Function1 function1) {
            this.f166278w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f166278w.invoke((AddGoalCard) it);
        }
    }

    /* JADX INFO: renamed from: xt2.b$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f166279w;

        public d(Function1 function1) {
            this.f166279w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f166279w.invoke((EmptyTileModel) it);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final C21535a m123880h() {
        return f166276a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m123881i(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60546a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22256m.class), new a());
        designItemReducer.m60547b(new C38448b(15));
        designItemReducer.m60547b(new C38448b(16));
        designItemReducer.m60547b(new C38448b(17));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m123882j(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(LoggedRecoveries.class), new b(new C38448b(18)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C41145n m123883k(LoggedRecoveries loggedRecoveriesModel) {
        AbstractC22676k.m65750j(loggedRecoveriesModel, "loggedRecoveriesModel");
        List<LoggedRecoveryItem> items = loggedRecoveriesModel.getItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        for (LoggedRecoveryItem loggedRecoveryItem : items) {
            String textDisplay = loggedRecoveryItem.getTextDisplay();
            EnumC16313m0 enumC16313m0ValueOf = null;
            TextResource textResourceM21278l = textDisplay != null ? AbstractC8693b.m21278l(textDisplay) : null;
            String icon = loggedRecoveryItem.getIcon();
            if (icon != null) {
                enumC16313m0ValueOf = EnumC16313m0.valueOf(icon);
            }
            arrayList.add(new C41143l(textResourceM21278l, enumC16313m0ValueOf, loggedRecoveryItem.getEnabled()));
        }
        return new C41145n(arrayList, loggedRecoveriesModel.getGoalId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m123884l(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(AddGoalCard.class), new c(new C38448b(20)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C41133b m123885m(AddGoalCard addGoalCardModel) {
        AbstractC22676k.m65750j(addGoalCardModel, "addGoalCardModel");
        return new C41133b(new C39274g(EnumC16313m0.valueOf(addGoalCardModel.getLeftIcon()).toWhoopIcon(), AbstractC8693b.m21267a()), AbstractC8693b.m21278l(addGoalCardModel.getTitleDisplay()), new C39274g(EnumC16313m0.valueOf(addGoalCardModel.getRightIcon()).toWhoopIcon(), AbstractC8693b.m21267a()), addGoalCardModel.getDestination());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m123886n(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(EmptyTileModel.class), new d(new C38448b(19)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C22123f m123887o(EmptyTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        return C22123f.m63348b(AbstractC23645i1.m68864c(model), null, null, null, null, null, null, null, EnumC13892q1.HAL, null, false, false, null, 0.0f, 8063, null);
    }
}
