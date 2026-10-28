package com.whoop.bot.api;

import com.whoop.p057ai.chat.view.startturnbutton.StartTurnResponse;
import kotlinx.serialization.json.JsonElement;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37294y;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/bot/api/StartTurnApi;", "", "", "path", "Lkotlinx/serialization/json/JsonElement;", "body", "Lpg3/v0;", "Lcom/whoop/ai/chat/view/startturnbutton/StartTurnResponse;", "startTurn", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Lq83/d;)Ljava/lang/Object;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface StartTurnApi {
    @InterfaceC37284o
    Object startTurn(@InterfaceC37294y String str, @InterfaceC37270a JsonElement jsonElement, InterfaceC30057d<? super C29218v0<StartTurnResponse>> interfaceC30057d);
}
