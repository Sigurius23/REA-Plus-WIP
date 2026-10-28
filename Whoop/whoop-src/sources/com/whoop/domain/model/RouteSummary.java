package com.whoop.domain.model;

import c13.AbstractC3855a;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m83.AbstractC25265s;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p92.C29019h;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J4\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u000eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0011R\u001a\u0010#\u001a\u00020\u00148\u0006X\u0086D¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0016R#\u0010)\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0&8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, m65681d2 = {"Lcom/whoop/domain/model/RouteSummary;", "", "Lorg/joda/time/DateTime;", "start", "end", "", "Lp92/h$a;", "routePoints", "<init>", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/List;)V", "Lcom/whoop/domain/model/RouteSummaryDto;", "toRouteSummaryDto", "()Lcom/whoop/domain/model/RouteSummaryDto;", "component1", "()Lorg/joda/time/DateTime;", "component2", "component3", "()Ljava/util/List;", "copy", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/List;)Lcom/whoop/domain/model/RouteSummary;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lorg/joda/time/DateTime;", "getStart", "getEnd", "Ljava/util/List;", "getRoutePoints", "name", "Ljava/lang/String;", "getName", "", "", "Lcom/whoop/domain/model/RoutePointDto;", "values", "Ljava/util/Map;", "getValues", "()Ljava/util/Map;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class RouteSummary {
    private final DateTime end;
    private final String name;
    private final List<C29019h.a> routePoints;
    private final DateTime start;
    private final Map<Long, RoutePointDto> values;

    public RouteSummary(DateTime start, DateTime end, List<C29019h.a> routePoints) {
        AbstractC22676k.m65750j(start, "start");
        AbstractC22676k.m65750j(end, "end");
        AbstractC22676k.m65750j(routePoints, "routePoints");
        this.start = start;
        this.end = end;
        this.routePoints = routePoints;
        this.name = "gps";
        this.values = new HashMap();
        if (routePoints.isEmpty()) {
            return;
        }
        for (C29019h.a aVar : AbstractC25265s.m74152u1(routePoints, new Comparator() { // from class: com.whoop.domain.model.RouteSummary$special$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t14, T t15) {
                return AbstractC30060g.m92127q(Long.valueOf(((C29019h.a) t14).getTime()), Long.valueOf(((C29019h.a) t15).getTime()));
            }
        })) {
            this.values.put(Long.valueOf(aVar.getTime()), new RoutePointDto(Double.valueOf(aVar.getLocation().getLatitude()), Double.valueOf(aVar.getLocation().getLongitude()), Double.valueOf(aVar.getLocation().getAltitude()), Double.valueOf(aVar.getLocation().getAccuracy()), Double.valueOf(aVar.getLocation().getVerticalAccuracyMeters())));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RouteSummary copy$default(RouteSummary routeSummary, DateTime dateTime, DateTime dateTime2, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            dateTime = routeSummary.start;
        }
        if ((i13 & 2) != 0) {
            dateTime2 = routeSummary.end;
        }
        if ((i13 & 4) != 0) {
            list = routeSummary.routePoints;
        }
        return routeSummary.copy(dateTime, dateTime2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DateTime getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DateTime getEnd() {
        return this.end;
    }

    public final List<C29019h.a> component3() {
        return this.routePoints;
    }

    public final RouteSummary copy(DateTime start, DateTime end, List<C29019h.a> routePoints) {
        AbstractC22676k.m65750j(start, "start");
        AbstractC22676k.m65750j(end, "end");
        AbstractC22676k.m65750j(routePoints, "routePoints");
        return new RouteSummary(start, end, routePoints);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RouteSummary)) {
            return false;
        }
        RouteSummary routeSummary = (RouteSummary) other;
        return AbstractC22676k.m65745e(this.start, routeSummary.start) && AbstractC22676k.m65745e(this.end, routeSummary.end) && AbstractC22676k.m65745e(this.routePoints, routeSummary.routePoints);
    }

    public final DateTime getEnd() {
        return this.end;
    }

    public final String getName() {
        return this.name;
    }

    public final List<C29019h.a> getRoutePoints() {
        return this.routePoints;
    }

    public final DateTime getStart() {
        return this.start;
    }

    public final Map<Long, RoutePointDto> getValues() {
        return this.values;
    }

    public int hashCode() {
        return this.routePoints.hashCode() + ((this.end.hashCode() + (this.start.hashCode() * 31)) * 31);
    }

    public final RouteSummaryDto toRouteSummaryDto() {
        DateTime dateTime = this.start;
        DateTimeZone dateTimeZone = DateTimeZone.UTC;
        return new RouteSummaryDto(this.name, this.values, "(" + dateTime.toDateTime(dateTimeZone) + "," + this.end.toDateTime(dateTimeZone) + ")");
    }

    public String toString() {
        DateTime dateTime = this.start;
        DateTime dateTime2 = this.end;
        List<C29019h.a> list = this.routePoints;
        StringBuilder sb4 = new StringBuilder("RouteSummary(start=");
        sb4.append(dateTime);
        sb4.append(", end=");
        sb4.append(dateTime2);
        sb4.append(", routePoints=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }
}
