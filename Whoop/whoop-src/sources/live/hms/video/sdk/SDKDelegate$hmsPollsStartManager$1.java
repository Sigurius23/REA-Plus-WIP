package live.hms.video.sdk;

import c93.InterfaceC4351m;
import live.hms.video.polls.network.QuestionContainer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.C22672i;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
public /* synthetic */ class SDKDelegate$hmsPollsStartManager$1 extends C22672i implements InterfaceC4351m {
    public SDKDelegate$hmsPollsStartManager$1(Object obj) {
        super(2, 0, SDKDelegate.class, obj, "safeGetAllPollQuestions", "safeGetAllPollQuestions(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(String str, InterfaceC30057d<? super QuestionContainer> interfaceC30057d) {
        return ((SDKDelegate) this.receiver).safeGetAllPollQuestions(str, interfaceC30057d);
    }
}
