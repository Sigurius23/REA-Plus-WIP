package com.whoop.design.models.calendar.archmini;

import ge3.AbstractC15751g;
import j93.InterfaceC21461d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001f\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\n¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/design/models/calendar/archmini/CalendarDayType;", "", "Lj93/d;", "Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;", "modelType", "<init>", "(Ljava/lang/String;ILj93/d;)V", "Lj93/d;", "getModelType", "()Lj93/d;", "HORMONAL_INSIGHTS_CALENDAR_DAY", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum CalendarDayType {
    HORMONAL_INSIGHTS_CALENDAR_DAY(AbstractC22671h0.f89337a.getOrCreateKotlinClass(HormonalInsightsCalendarDayModel.class));

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final InterfaceC21461d modelType;

    CalendarDayType(InterfaceC21461d interfaceC21461d) {
        this.modelType = interfaceC21461d;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final InterfaceC21461d getModelType() {
        return this.modelType;
    }
}
