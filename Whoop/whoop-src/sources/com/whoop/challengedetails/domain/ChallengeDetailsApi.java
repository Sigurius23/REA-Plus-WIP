package com.whoop.challengedetails.domain;

import com.whoop.challengedetails.domain.models.ChallengeDetailsResponse;
import com.whoop.challengedetails.domain.models.JoinChallengeRequest;
import com.whoop.challengedetails.domain.models.JoinChallengeResponse;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37288s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/challengedetails/domain/ChallengeDetailsApi;", "", "", "name", "Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;", "getChallengeDetails", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/challengedetails/domain/models/JoinChallengeRequest;", "body", "Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;", "joinChallenge", "(Lcom/whoop/challengedetails/domain/models/JoinChallengeRequest;Lq83/d;)Ljava/lang/Object;", "challenge-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface ChallengeDetailsApi {
    @InterfaceC37275f("user-journey-service/v1/challenges/details/{name}")
    Object getChallengeDetails(@InterfaceC37288s("name") String str, InterfaceC30057d<? super ChallengeDetailsResponse> interfaceC30057d);

    @InterfaceC37284o("user-journey-service/v1/challenges/join")
    Object joinChallenge(@InterfaceC37270a JoinChallengeRequest joinChallengeRequest, InterfaceC30057d<? super JoinChallengeResponse> interfaceC30057d);
}
