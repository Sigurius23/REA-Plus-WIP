package com.whoop.data.local.room.dao.wipeable;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.stripe.android.shoppay.ShopPayActivity;
import fu0.C14778c;
import fu0.C14781f;
import io.getstream.chat.android.client.audio.StreamAudioPlayer;
import io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionDao_Impl;
import io.getstream.chat.android.client.persistence.p225db.dao.MessageReceiptDao_Impl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jy1.C22049c;
import l83.C23454a0;
import p164g2.InterfaceC15237i;
import p353o0.C27315a;
import p353o0.C27341y;
import p389p0.C28529i0;
import p390p1.InterfaceC28593a1;
import p500tb.InterfaceC33687a;
import p510u0.InterfaceC34345p0;
import p522uf.AbstractC34870c0;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p652yl.C39615a;
import p668z1.AbstractC39957f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import z80.AbstractC40180a;

/* JADX INFO: renamed from: com.whoop.data.local.room.dao.wipeable.c */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C6516c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f25406w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f25407x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f25408y;

    public /* synthetic */ C6516c(int i13, Object obj, int i14) {
        this.f25406w = i14;
        this.f25407x = i13;
        this.f25408y = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f25406w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj2 = this.f25408y;
        int i14 = this.f25407x;
        switch (i13) {
            case 0:
                return ((FeatureTeamDao_Impl) obj2).lambda$getFeatureTeamByCommunityId$5(i14, (InterfaceC33687a) obj);
            case 1:
                return ((TeamsDao_Impl) obj2).lambda$getLiveTeamData$3(i14, (InterfaceC33687a) obj);
            case 2:
                return TeamsDao_Impl.lambda$removeTeam$6(i14, (String) obj2, (InterfaceC33687a) obj);
            case 3:
                return ((C14778c) obj2).m42397j(i14, (InterfaceC33687a) obj);
            case 4:
                return ((C14781f) obj2).m42411j(i14, (InterfaceC33687a) obj);
            case 5:
                ((AbstractC39101i1) obj).m124632f((AbstractC39104j1) obj2, 0, -i14, 0.0f);
                return c23454a0;
            case 6:
                ArrayList arrayList = (ArrayList) obj2;
                AbstractC39101i1 abstractC39101i1 = (AbstractC39101i1) obj;
                int size = arrayList.size();
                for (int i15 = 0; i15 < size; i15++) {
                    AbstractC39104j1 abstractC39104j1 = (AbstractC39104j1) arrayList.get(i15);
                    AbstractC39101i1.m124624n(abstractC39104j1, 0, (i14 - abstractC39104j1.f168212x) / 2, abstractC39101i1);
                }
                return c23454a0;
            case 7:
                InterfaceC34345p0 KeyboardActions = (InterfaceC34345p0) obj;
                AbstractC22676k.m65750j(KeyboardActions, "$this$KeyboardActions");
                AbstractC34870c0.m109993c0((InterfaceC15237i) obj2, i14);
                return c23454a0;
            case 8:
                WebView webView = (WebView) obj2;
                Context it = (Context) obj;
                int i16 = ShopPayActivity.f22413E;
                AbstractC22676k.m65750j(it, "it");
                webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                webView.setBackgroundColor(i14);
                return webView;
            case 9:
                StreamAudioPlayer.m54635b((StreamAudioPlayer) obj2, i14, ((Integer) obj).intValue());
                return Boolean.TRUE;
            case 10:
                return ReactionDao_Impl.selectReactionById$lambda$2("SELECT * FROM stream_chat_reaction WHERE id = ?", i14, (ReactionDao_Impl) obj2, (InterfaceC33687a) obj);
            case 11:
                return MessageReceiptDao_Impl.m54909c(i14, (MessageReceiptDao_Impl) obj2, (InterfaceC33687a) obj);
            case 12:
                return ((C22049c) obj2).m63119m(i14, (InterfaceC33687a) obj);
            case 13:
                C28529i0 c28529i0 = (C28529i0) obj;
                C27315a c27315a = ((C27341y) obj2).f109497a;
                AbstractC39957f abstractC39957fM126587c = C39615a.m126587c();
                C39615a.m126591g(abstractC39957fM126587c, C39615a.m126589e(abstractC39957fM126587c), abstractC39957fM126587c != null ? abstractC39957fM126587c.mo128133e() : null);
                c27315a.getClass();
                int i17 = c28529i0.f115439a;
                int i18 = i17 != -1 ? i17 : 2;
                for (int i19 = 0; i19 < i18; i19++) {
                    c28529i0.m86830b(i14 + i19);
                }
                return c23454a0;
            case 14:
                return Boolean.valueOf(((List) obj).addAll(i14, (Collection) obj2));
            default:
                return AbstractC40180a.m128910r(i14, (InterfaceC28593a1) obj2, ((Boolean) obj).booleanValue());
        }
    }

    public /* synthetic */ C6516c(Object obj, int i13, int i14) {
        this.f25406w = i14;
        this.f25408y = obj;
        this.f25407x = i13;
    }
}
