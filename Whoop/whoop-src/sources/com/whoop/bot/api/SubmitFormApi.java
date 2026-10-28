package com.whoop.bot.api;

import com.whoop.p057ai.chat.domain.formwidget.SubmitFormAnswersRequest;
import com.whoop.p057ai.chat.domain.formwidget.UpdateFormRequest;
import com.whoop.p057ai.chat.domain.formwidget.UpdateFormResponse;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37285p;
import wg3.InterfaceC37294y;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/bot/api/SubmitFormApi;", "", "", "path", "Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest;", "body", "Lpg3/v0;", "Ll83/a0;", "submitAnswers", "(Ljava/lang/String;Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/ai/chat/domain/formwidget/UpdateFormRequest;", "Lcom/whoop/ai/chat/domain/formwidget/UpdateFormResponse;", "markComplete", "(Ljava/lang/String;Lcom/whoop/ai/chat/domain/formwidget/UpdateFormRequest;Lq83/d;)Ljava/lang/Object;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface SubmitFormApi {
    @InterfaceC37285p
    Object markComplete(@InterfaceC37294y String str, @InterfaceC37270a UpdateFormRequest updateFormRequest, InterfaceC30057d<? super C29218v0<UpdateFormResponse>> interfaceC30057d);

    @InterfaceC37285p
    Object submitAnswers(@InterfaceC37294y String str, @InterfaceC37270a SubmitFormAnswersRequest submitFormAnswersRequest, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);
}
