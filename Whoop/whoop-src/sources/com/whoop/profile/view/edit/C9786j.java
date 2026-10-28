package com.whoop.profile.view.edit;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4354p;
import ec3.InterfaceC13037f2;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.p226ui.common.helper.DateFormatter;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListView;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.internal.MessageListItemDecoratorProvider;
import io.getstream.chat.android.p226ui.feature.messages.list.background.MessageBackgroundFactory;
import p163g1.C15199y3;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import v41.AbstractC35664f;
import wb0.C37035f;
import yb0.AbstractC39384g;

/* JADX INFO: renamed from: com.whoop.profile.view.edit.j */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C9786j implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f28517E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f28518F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f28519G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f28520H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f28521w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f28522x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f28523y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f28524z;

    public /* synthetic */ C9786j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i13) {
        this.f28521w = i13;
        this.f28522x = obj;
        this.f28523y = obj2;
        this.f28524z = obj3;
        this.f28517E = obj4;
        this.f28518F = obj5;
        this.f28519G = obj6;
        this.f28520H = obj7;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f28521w) {
            case 0:
                return EditProfileBottomSheetKt.EditProfileBottomSheet$lambda$24$0((InterfaceC2994c0) this.f28522x, (C15199y3) this.f28523y, (InterfaceC28601c1) this.f28524z, (InterfaceC28601c1) this.f28517E, (InterfaceC28601c1) this.f28518F, (InterfaceC28601c1) this.f28519G, (InterfaceC28601c1) this.f28520H);
            case 1:
                return ((InterfaceC4354p) this.f28522x).invoke(((InterfaceC13037f2) this.f28523y).getValue(), ((InterfaceC13037f2) this.f28524z).getValue(), ((InterfaceC13037f2) this.f28517E).getValue(), ((InterfaceC13037f2) this.f28518F).getValue(), ((InterfaceC13037f2) this.f28519G).getValue(), ((InterfaceC13037f2) this.f28520H).getValue());
            case 2:
                return MessageListItemDecoratorProvider.m55476b((MessageBackgroundFactory) this.f28522x, (MessageListViewStyle) this.f28523y, (MessageListView.ShowAvatarPredicate) this.f28524z, (DateFormatter) this.f28517E, (Function1) this.f28518F, (Function1) this.f28519G, (Channel) this.f28520H);
            default:
                return AbstractC39384g.m125598B((C37035f) this.f28523y, (InterfaceC4351m) this.f28519G, (InterfaceC2994c0) this.f28522x, (InterfaceC28601c1) this.f28524z, (InterfaceC28601c1) this.f28517E, (InterfaceC28601c1) this.f28518F, (AbstractC35664f) this.f28520H);
        }
    }

    public /* synthetic */ C9786j(C37035f c37035f, InterfaceC4351m interfaceC4351m, InterfaceC2994c0 interfaceC2994c0, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, AbstractC35664f abstractC35664f) {
        this.f28521w = 3;
        this.f28523y = c37035f;
        this.f28519G = interfaceC4351m;
        this.f28522x = interfaceC2994c0;
        this.f28524z = interfaceC28601c1;
        this.f28517E = interfaceC28601c2;
        this.f28518F = interfaceC28601c3;
        this.f28520H = abstractC35664f;
    }
}
