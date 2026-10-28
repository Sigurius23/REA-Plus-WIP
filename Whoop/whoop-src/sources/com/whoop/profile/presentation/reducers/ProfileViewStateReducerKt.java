package com.whoop.profile.presentation.reducers;

import c41.C4018e5;
import com.whoop.data.local.room.dao.persistent.C6498i;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.profile.C9691R;
import com.whoop.profile.domain.models.components.ContextHubTileModel;
import com.whoop.profile.domain.models.components.ReferralsTileButtonModel;
import com.whoop.profile.domain.models.components.ReferralsTileFooterModel;
import com.whoop.profile.domain.models.components.ReferralsTileModel;
import com.whoop.profile.domain.models.components.ReferredListModel;
import com.whoop.profile.domain.models.components.ReferredMemberModel;
import com.whoop.profile.domain.models.components.StreakTileModel;
import com.whoop.profile.view.components.ContextHubTileViewState;
import com.whoop.profile.view.components.ReferralsTileFooterViewState;
import com.whoop.profile.view.components.ReferralsTileHeaderViewState;
import com.whoop.profile.view.components.ReferralsTileViewState;
import com.whoop.profile.view.components.ReferredListViewState;
import com.whoop.profile.view.components.ReferredMemberViewState;
import com.whoop.profile.view.components.StreaksTileViewState;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import kd1.AbstractC22403o;
import l83.C23454a0;
import m83.AbstractC25267u;
import ny0.C27256h;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p716lb1.AbstractC23613d4;
import p716lb1.C23749z0;
import p720m91.C25306o;
import p720m91.InterfaceC25312u;
import v41.InterfaceC35689r0;
import x81.C38072d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\b\u001a\u00020\n*\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\u000b\u001a#\u0010\u000e\u001a\u00020\n*\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"", "iconString", "", "mapIconStringToDrawableResource", "(Ljava/lang/String;)I", "", "Lm91/o;", "inFlightCardButtonId", "withInFlightCardButtonDisabled", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "Lm91/u;", "(Lm91/u;Ljava/lang/String;)Lm91/u;", "", "pairInFlight", "disableIfPairInFlight", "(Lm91/u;ZLjava/lang/String;)Lm91/u;", "Ljb1/a;", "itemReducer", "Ljb1/a;", "profile_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ProfileViewStateReducerKt {
    private static final C21535a itemReducer = AbstractC21537c.m60554d(new C6498i(14));

    private static final InterfaceC25312u disableIfPairInFlight(InterfaceC25312u interfaceC25312u, boolean z4, String str) {
        return (z4 && (interfaceC25312u instanceof C27256h)) ? C27256h.m82144b((C27256h) interfaceC25312u, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33488895, null) : withInFlightCardButtonDisabled(interfaceC25312u, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 itemReducer$lambda$0(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C6498i(13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 itemReducer$lambda$0$0(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        final C6498i c6498i = new C6498i(10);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ContextHubTileModel.class), new Function1() { // from class: com.whoop.profile.presentation.reducers.ProfileViewStateReducerKt$itemReducer$lambda$0$0$$inlined$modelToItem$1
            @Override // p715kotlin.jvm.functions.Function1
            public final InterfaceC25312u invoke(DesignSystemModel it) {
                AbstractC22676k.m65750j(it, "it");
                return (InterfaceC25312u) c6498i.invoke((ContextHubTileModel) it);
            }
        });
        final C6498i c6498i2 = new C6498i(11);
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(StreakTileModel.class), new Function1() { // from class: com.whoop.profile.presentation.reducers.ProfileViewStateReducerKt$itemReducer$lambda$0$0$$inlined$modelToItem$2
            @Override // p715kotlin.jvm.functions.Function1
            public final InterfaceC25312u invoke(DesignSystemModel it) {
                AbstractC22676k.m65750j(it, "it");
                return (InterfaceC25312u) c6498i2.invoke((StreakTileModel) it);
            }
        });
        final C6498i c6498i3 = new C6498i(12);
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ReferralsTileModel.class), new Function1() { // from class: com.whoop.profile.presentation.reducers.ProfileViewStateReducerKt$itemReducer$lambda$0$0$$inlined$modelToItem$3
            @Override // p715kotlin.jvm.functions.Function1
            public final InterfaceC25312u invoke(DesignSystemModel it) {
                AbstractC22676k.m65750j(it, "it");
                return (InterfaceC25312u) c6498i3.invoke((ReferralsTileModel) it);
            }
        });
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContextHubTileViewState itemReducer$lambda$0$0$0(ContextHubTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new ContextHubTileViewState(model.getId(), model.getTitle(), AbstractC16315n0.m46377b(model.getEndIcon()), model.getDestination());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StreaksTileViewState itemReducer$lambda$0$0$1(StreakTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        String id4 = model.getId();
        String title = model.getTitle();
        String subtitle = model.getSubtitle();
        String lottieUrl = model.getLottieUrl();
        String strM113135b = lottieUrl != null ? InterfaceC35689r0.e.m113135b(lottieUrl) : null;
        InterfaceC35689r0.e eVarM113134a = strM113135b != null ? InterfaceC35689r0.e.m113134a(strM113135b) : null;
        String imageUrl = model.getImageUrl();
        return new StreaksTileViewState(id4, title, subtitle, eVarM113134a, imageUrl != null ? new AbstractC22403o.c(imageUrl, 0, 0, 0, 14, null) : null, AbstractC16315n0.m46377b(model.getEndIcon()), model.getDestination());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReferralsTileViewState itemReducer$lambda$0$0$2(ReferralsTileModel model) {
        ReferredListViewState referredListViewState;
        CardButtonModel content;
        C27256h c27256hM68661k;
        AbstractC22676k.m65750j(model, "model");
        String id4 = model.getId();
        String title = model.getHeader().getTitle();
        String subtitle = model.getHeader().getSubtitle();
        int referralsCount = model.getHeader().getReferralsCount();
        String referralsImg = model.getHeader().getReferralsImg();
        C38072d c38072d = C38072d.f163053a;
        ReferralsTileHeaderViewState referralsTileHeaderViewState = new ReferralsTileHeaderViewState(title, subtitle, referralsCount, new AbstractC22403o.c(referralsImg, AbstractC11895b.m31985d(c38072d), 0, AbstractC11895b.m31985d(c38072d), 4, null));
        ReferredListModel referredList = model.getReferredList();
        C27256h c27256hM82144b = null;
        if (referredList != null) {
            String id5 = referredList.getId();
            List<ReferredMemberModel> referredMembers = referredList.getReferredMembers();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(referredMembers, 10));
            for (ReferredMemberModel referredMemberModel : referredMembers) {
                String name = referredMemberModel.getName();
                String avatar = referredMemberModel.getAvatar();
                C38072d c38072d2 = C38072d.f163053a;
                arrayList.add(new ReferredMemberViewState(name, new AbstractC22403o.c(avatar, AbstractC11895b.m31985d(c38072d2), 0, AbstractC11895b.m31985d(c38072d2), 4, null), mapIconStringToDrawableResource(referredMemberModel.getEndIcon()), referredMemberModel.getSubtitle()));
            }
            referredListViewState = new ReferredListViewState(id5, arrayList, referredList.getAdditionalReferralDisplay());
        } else {
            referredListViewState = null;
        }
        ReferralsTileFooterModel footer = model.getFooter();
        ReferralsTileFooterViewState referralsTileFooterViewState = footer != null ? new ReferralsTileFooterViewState(footer.getTag(), footer.getTitle()) : null;
        ReferralsTileButtonModel button = model.getButton();
        if (button != null && (content = button.getContent()) != null && (c27256hM68661k = AbstractC23613d4.m68661k(content, "LIFE")) != null) {
            c27256hM82144b = C27256h.m82144b(c27256hM68661k, null, null, null, null, null, null, null, null, null, null, null, null, null, false, true, null, false, false, null, null, null, null, null, null, null, 33529855, null);
        }
        return new ReferralsTileViewState(id4, referralsTileHeaderViewState, referredListViewState, referralsTileFooterViewState, c27256hM82144b, model.getDestination());
    }

    private static final int mapIconStringToDrawableResource(String str) {
        if (AbstractC22676k.m65745e(str, "COMPLETED_CHECKMARK")) {
            return C9691R.drawable.design_ic_completed_checkmark;
        }
        return AbstractC22676k.m65745e(str, "PENDING_CHECKMARK") ? C9691R.drawable.design_ic_pending_checkmark : EnumC16313m0.CHECKMARK.toWhoopIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<C25306o> withInFlightCardButtonDisabled(List<C25306o> list, String str) {
        if (str == null) {
            return list;
        }
        List<C25306o> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (C25306o c25306o : list2) {
            arrayList.add(C25306o.m74314b(c25306o, withInFlightCardButtonDisabled(c25306o.getState(), str), null, 2, null));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0083  */
    private static final InterfaceC25312u withInFlightCardButtonDisabled(InterfaceC25312u interfaceC25312u, String str) {
        boolean z4;
        if (interfaceC25312u instanceof C27256h) {
            C27256h c27256h = (C27256h) interfaceC25312u;
            return AbstractC22676k.m65745e(c27256h.getId(), str) ? C27256h.m82144b(c27256h, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33488895, null) : c27256h;
        }
        if (!(interfaceC25312u instanceof C4018e5)) {
            return interfaceC25312u;
        }
        C4018e5 c4018e5 = (C4018e5) interfaceC25312u;
        InterfaceC25312u startItem = c4018e5.getStartItem();
        C27256h c27256h2 = startItem instanceof C27256h ? (C27256h) startItem : null;
        if (AbstractC22676k.m65745e(c27256h2 != null ? c27256h2.getId() : null, str)) {
            z4 = true;
        } else {
            InterfaceC25312u endItem = c4018e5.getEndItem();
            C27256h c27256h3 = endItem instanceof C27256h ? (C27256h) endItem : null;
            if (AbstractC22676k.m65745e(c27256h3 != null ? c27256h3.getId() : null, str)) {
                z4 = true;
            } else {
                z4 = false;
            }
        }
        return C4018e5.m12212b(c4018e5, disableIfPairInFlight(c4018e5.getStartItem(), z4, str), disableIfPairInFlight(c4018e5.getEndItem(), z4, str), false, 4, null);
    }
}
