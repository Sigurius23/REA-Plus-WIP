package com.whoop.home.domain;

import com.mapbox.common.HttpHeaders;
import com.whoop.network.request.GetApiRequest;
import com.whoop.network.request.HttpTimeoutConfig;
import i63.C18181t;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import l83.C23454a0;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import sr2.AbstractC32943y;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u000b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001'B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001c\u0010\u0010R&\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R&\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0016\u0010%\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0010¨\u0006("}, m65681d2 = {"Lcom/whoop/home/domain/HomeGetRequest;", "Lcom/whoop/network/request/GetApiRequest;", "Ljava/time/LocalDate;", "selectedDate", "", "batteryPercent", "<init>", "(Ljava/time/LocalDate;I)V", "component1", "()Ljava/time/LocalDate;", "component2", "()I", "copy", "(Ljava/time/LocalDate;I)Lcom/whoop/home/domain/HomeGetRequest;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/time/LocalDate;", "I", "batteryPercentParam", "Ljava/lang/String;", "path", "getPath", "", "parameters", "Ljava/util/Map;", "getParameters", "()Ljava/util/Map;", "headers", "getHeaders", "getDateString", "dateString", "Companion", "a", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class HomeGetRequest implements GetApiRequest {
    private static final DateTimeFormatter formatter;
    private final int batteryPercent;
    private final String batteryPercentParam;
    private final Map<String, String> headers;
    private final Map<String, String> parameters;
    private final String path;
    private final LocalDate selectedDate;
    private static final C8815a Companion = new C8815a(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.home.domain.HomeGetRequest$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/home/domain/HomeGetRequest$a;", "", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C8815a {
        public /* synthetic */ C8815a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C8815a() {
        }
    }

    static {
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        AbstractC22676k.m65749i(dateTimeFormatterOfPattern, "ofPattern(...)");
        formatter = dateTimeFormatterOfPattern;
    }

    public HomeGetRequest(LocalDate localDate, int i13) {
        this.selectedDate = localDate;
        this.batteryPercent = i13;
        String strValueOf = String.valueOf(i13);
        this.batteryPercentParam = strValueOf;
        this.path = "home-service/v1/home";
        String dateString = getDateString();
        this.parameters = dateString != null ? AbstractC31061c.m95645u(HttpHeaders.DATE, dateString) : C25272z.f99163w;
        this.headers = AbstractC31061c.m95645u("Battery-Level", strValueOf);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final LocalDate getSelectedDate() {
        return this.selectedDate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final int getBatteryPercent() {
        return this.batteryPercent;
    }

    public static /* synthetic */ HomeGetRequest copy$default(HomeGetRequest homeGetRequest, LocalDate localDate, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            localDate = homeGetRequest.selectedDate;
        }
        if ((i14 & 2) != 0) {
            i13 = homeGetRequest.batteryPercent;
        }
        return homeGetRequest.copy(localDate, i13);
    }

    private final String getDateString() {
        LocalDate localDate = this.selectedDate;
        if (localDate != null) {
            return localDate.format(formatter);
        }
        return null;
    }

    public final HomeGetRequest copy(LocalDate selectedDate, int batteryPercent) {
        return new HomeGetRequest(selectedDate, batteryPercent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeGetRequest)) {
            return false;
        }
        HomeGetRequest homeGetRequest = (HomeGetRequest) other;
        return AbstractC22676k.m65745e(this.selectedDate, homeGetRequest.selectedDate) && this.batteryPercent == homeGetRequest.batteryPercent;
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public /* bridge */ boolean getHasBody() {
        return super.getHasBody();
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public /* bridge */ HttpTimeoutConfig getHttpTimeoutConfig() {
        return super.getHttpTimeoutConfig();
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public /* bridge */ C18181t getMethod() {
        return super.getMethod();
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public Map<String, String> getParameters() {
        return this.parameters;
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public String getPath() {
        return this.path;
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public /* bridge */ String getTag() {
        return super.getTag();
    }

    public int hashCode() {
        LocalDate localDate = this.selectedDate;
        return Integer.hashCode(this.batteryPercent) + ((localDate == null ? 0 : localDate.hashCode()) * 31);
    }

    public String toString() {
        return "HomeGetRequest(selectedDate=" + this.selectedDate + ", batteryPercent=" + this.batteryPercent + ")";
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public /* bridge */ String url(AbstractC32943y abstractC32943y) {
        return super.url(abstractC32943y);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Void, l83.a0] */
    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public /* bridge */ C23454a0 getBody() {
        return super.getBody();
    }
}
