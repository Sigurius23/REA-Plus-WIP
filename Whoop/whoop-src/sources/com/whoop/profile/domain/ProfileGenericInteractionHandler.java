package com.whoop.profile.domain;

import ad3.AbstractC0757c;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.models.modal.DecodedGenericInteraction;
import com.whoop.design.models.modal.GenericInteractionDecoderKt;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.Action;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileGenericInteractionHandler;", "", "<init>", "()V", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "Lad3/c;", "json", "Lcom/whoop/profile/domain/ProfileInteractionResolution;", "resolve", "(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/profile/domain/ProfileInteractionResolution;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ProfileGenericInteractionHandler {
    public static final int $stable = 0;
    public static final ProfileGenericInteractionHandler INSTANCE = new ProfileGenericInteractionHandler();

    private ProfileGenericInteractionHandler() {
    }

    public final ProfileInteractionResolution resolve(GenericInteraction interaction, AbstractC0757c json) {
        C9598e navigation;
        Action action;
        AnyModal modal;
        AbstractC22676k.m65750j(interaction, "interaction");
        AbstractC22676k.m65750j(json, "json");
        DecodedGenericInteraction decodedGenericInteraction = GenericInteractionDecoderKt.toDecodedGenericInteraction(interaction, json);
        AnalyticEventModel analyticEvent = decodedGenericInteraction != null ? decodedGenericInteraction.getAnalyticEvent() : null;
        if (decodedGenericInteraction != null && (modal = decodedGenericInteraction.getModal()) != null) {
            return new ProfileInteractionResolution.PresentModal(modal, analyticEvent);
        }
        if (decodedGenericInteraction == null || (action = decodedGenericInteraction.getAction()) == null) {
            return (decodedGenericInteraction == null || (navigation = decodedGenericInteraction.getNavigation()) == null) ? new ProfileInteractionResolution.None(analyticEvent) : new ProfileInteractionResolution.Navigate(navigation, analyticEvent);
        }
        return new ProfileInteractionResolution.PerformAction(action, analyticEvent);
    }
}
