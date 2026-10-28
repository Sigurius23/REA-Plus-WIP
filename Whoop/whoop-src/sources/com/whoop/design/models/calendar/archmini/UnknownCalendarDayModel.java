package com.whoop.design.models.calendar.archmini;

import com.mapbox.common.HttpHeaders;
import com.whoop.navigation.models.GenericInteraction;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0005HÖ\u0081\u0004R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/design/models/calendar/archmini/UnknownCalendarDayModel;", "Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;", "<init>", "()V", HttpHeaders.DATE, "", "getDate", "()Ljava/lang/String;", "dateValueDisplay", "getDateValueDisplay", "hasData", "", "getHasData", "()Z", "hidden", "getHidden", "interaction", "Lcom/whoop/navigation/models/GenericInteraction;", "getInteraction", "()Lcom/whoop/navigation/models/GenericInteraction;", "equals", "other", "", "hashCode", "", "toString", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class UnknownCalendarDayModel implements CalendarDayModel {
    private static final String date = null;
    private static final boolean hasData = false;
    private static final boolean hidden = false;
    private static final GenericInteraction interaction = null;
    public static final UnknownCalendarDayModel INSTANCE = new UnknownCalendarDayModel();
    private static final String dateValueDisplay = "";
    public static final int $stable = GenericInteraction.$stable;

    private UnknownCalendarDayModel() {
    }

    public boolean equals(Object other) {
        return this == other || (other instanceof UnknownCalendarDayModel);
    }

    @Override // com.whoop.design.models.calendar.archmini.CalendarDayModel
    public String getDate() {
        return date;
    }

    @Override // com.whoop.design.models.calendar.archmini.CalendarDayModel
    public String getDateValueDisplay() {
        return dateValueDisplay;
    }

    @Override // com.whoop.design.models.calendar.archmini.CalendarDayModel
    public boolean getHasData() {
        return hasData;
    }

    @Override // com.whoop.design.models.calendar.archmini.CalendarDayModel
    public boolean getHidden() {
        return hidden;
    }

    @Override // com.whoop.design.models.calendar.archmini.CalendarDayModel
    public GenericInteraction getInteraction() {
        return interaction;
    }

    public int hashCode() {
        return 2008273716;
    }

    public String toString() {
        return "UnknownCalendarDayModel";
    }
}
