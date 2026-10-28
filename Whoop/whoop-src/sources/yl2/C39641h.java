package yl2;

import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.TrendsScreenModel;
import j02.AbstractC21155m0;
import j93.InterfaceC21461d;
import java.time.Clock;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Map;
import lj1.C24473a;
import o02.InterfaceC27353d;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: yl2.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lyl2/h;", "Lo02/d;", "Ljava/time/Clock;", "clock", "Ljava/time/format/DateTimeFormatter;", "dateTimeFormatter", "<init>", "(Ljava/time/Clock;Ljava/time/format/DateTimeFormatter;)V", "", "dateString", "Ljava/time/LocalDate;", "d", "(Ljava/lang/String;)Ljava/time/LocalDate;", "Lcom/whoop/navigation/NavigationScreenModel;", "navigationScreenModel", "Lj02/m0;", "c", "(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/m0;", "a", "Ljava/time/Clock;", "b", "Ljava/time/format/DateTimeFormatter;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39641h implements InterfaceC27353d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final DateTimeFormatter dateTimeFormatter;

    public C39641h(Clock clock, DateTimeFormatter dateTimeFormatter) {
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(dateTimeFormatter, "dateTimeFormatter");
        this.clock = clock;
        this.dateTimeFormatter = dateTimeFormatter;
    }

    /* JADX INFO: renamed from: d */
    private final LocalDate m126726d(String dateString) {
        if (dateString == null || dateString.length() == 0) {
            LocalDate localDateNow = LocalDate.now(this.clock);
            AbstractC22676k.m65749i(localDateNow, "now(...)");
            return localDateNow;
        }
        try {
            LocalDate localDate = ((ZonedDateTime) this.dateTimeFormatter.parse(dateString, new C24473a(2))).toLocalDate();
            AbstractC22676k.m65747g(localDate);
            return localDate;
        } catch (DateTimeParseException unused) {
            LocalDate localDateNow2 = LocalDate.now(this.clock);
            AbstractC22676k.m65747g(localDateNow2);
            return localDateNow2;
        }
    }

    @Override // o02.InterfaceC27353d
    /* JADX INFO: renamed from: b */
    public /* bridge */ InterfaceC27353d mo67682b(List<? extends InterfaceC27353d> list, Map<InterfaceC21461d, ? extends Function1> map) {
        return super.mo67682b(list, map);
    }

    @Override // o02.InterfaceC27353d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC21155m0 mo67681a(NavigationScreenModel navigationScreenModel) {
        AbstractC22676k.m65750j(navigationScreenModel, "navigationScreenModel");
        if (!(navigationScreenModel instanceof TrendsScreenModel)) {
            return AbstractC21155m0.j3.f80414b;
        }
        TrendsScreenModel trendsScreenModel = (TrendsScreenModel) navigationScreenModel;
        String trendKey = trendsScreenModel.getTrendKey();
        LocalDate localDateM126726d = m126726d(trendsScreenModel.getDate());
        String fromLocation = trendsScreenModel.getFromLocation();
        if (fromLocation == null) {
            fromLocation = "";
        }
        String source = trendsScreenModel.getSource();
        if (source == null) {
            source = "";
        }
        return new AbstractC21155m0.f5(trendKey, localDateM126726d, fromLocation, source, trendsScreenModel.getDuration(), false, trendsScreenModel.getAiAction(), 32, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C39641h(Clock clock, DateTimeFormatter dateTimeFormatter, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 1) != 0) {
            clock = Clock.systemUTC();
            AbstractC22676k.m65749i(clock, "systemUTC(...)");
        }
        if ((i13 & 2) != 0) {
            dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ").withZone(clock.getZone());
            AbstractC22676k.m65749i(dateTimeFormatter, "withZone(...)");
        }
        this(clock, dateTimeFormatter);
    }
}
