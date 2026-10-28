package com.whoop.data.remote.domain.dto.growth;

import com.whoop.network.exception.DeserializationException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0004¨\u0006\u0005"}, m65681d2 = {"toDomainModel", "Lcom/whoop/data/remote/domain/dto/growth/SubscriptionInfo;", "Lcom/whoop/data/remote/domain/dto/growth/SubscriptionInfoDto;", "Lcom/whoop/data/remote/domain/dto/growth/SubscriptionPlan;", "Lcom/whoop/data/remote/domain/dto/growth/SubscriptionPlanDto;", "core_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SubscriptionInfoKt {
    public static final SubscriptionInfo toDomainModel(SubscriptionInfoDto subscriptionInfoDto) {
        SubscriptionPlan domainModel;
        AbstractC22676k.m65750j(subscriptionInfoDto, "<this>");
        Boolean requirePostalCode = subscriptionInfoDto.getRequirePostalCode();
        boolean zBooleanValue = requirePostalCode != null ? requirePostalCode.booleanValue() : true;
        String header = subscriptionInfoDto.getHeader();
        if (header == null) {
            throw new DeserializationException("SubscriptionInfoDto#header cannot be null");
        }
        SubscriptionPlanDto monthlyPlan = subscriptionInfoDto.getMonthlyPlan();
        if (monthlyPlan == null || (domainModel = toDomainModel(monthlyPlan)) == null) {
            throw new DeserializationException("SubscriptionInfoDto#monthlyPlan cannot be null");
        }
        return new SubscriptionInfo(zBooleanValue, header, domainModel);
    }

    public static final SubscriptionPlan toDomainModel(SubscriptionPlanDto subscriptionPlanDto) {
        AbstractC22676k.m65750j(subscriptionPlanDto, "<this>");
        String footer = subscriptionPlanDto.getFooter();
        if (footer != null) {
            return new SubscriptionPlan(footer);
        }
        throw new DeserializationException("SubscriptionInfoDto#footer cannot be null");
    }
}
