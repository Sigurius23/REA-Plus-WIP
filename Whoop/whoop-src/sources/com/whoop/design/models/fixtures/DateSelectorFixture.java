package com.whoop.design.models.fixtures;

import com.whoop.design.models.items.DateSelectorModel;
import com.whoop.design.models.items.DateStripModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.navigation.models.GenericInteraction;
import i11.C17863f;
import p291l0.AbstractC22977m;
import p291l0.C22961h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/design/models/fixtures/DateSelectorFixture;", "", "<init>", "()V", "Lcom/whoop/design/models/items/DateSelectorModel;", "weekDateSelectorModel", "Lcom/whoop/design/models/items/DateSelectorModel;", "getWeekDateSelectorModel", "()Lcom/whoop/design/models/items/DateSelectorModel;", "monthDateSelectorModel", "getMonthDateSelectorModel", "sixMonthSelectorModel", "getSixMonthSelectorModel", "Li11/f;", "weekDateSelectorState", "Li11/f;", "getWeekDateSelectorState", "()Li11/f;", "monthDateSelectorState", "getMonthDateSelectorState", "sixMonthDateSelectorState", "getSixMonthDateSelectorState", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DateSelectorFixture {
    public static final int $stable;
    private static final C17863f monthDateSelectorState;
    private static final C17863f sixMonthDateSelectorState;
    private static final C17863f weekDateSelectorState;
    public static final DateSelectorFixture INSTANCE = new DateSelectorFixture();
    private static final DateSelectorModel weekDateSelectorModel = new DateSelectorModel("Mar 8 - Mar 14, 2022", "Feb 22 - Feb 28, 2022", "Mar 1 - Mar 7, 2022", (GenericInteraction) null, (GenericInteraction) null, (GenericInteraction) null, (DateStripModel) null, 120, (DefaultConstructorMarker) null);
    private static final DateSelectorModel monthDateSelectorModel = new DateSelectorModel("Apr 1 - Apr 30, 2022", "Feb 1 - Feb 28, 2022", "Mar 1 - Mar 31, 2022", (GenericInteraction) null, (GenericInteraction) null, (GenericInteraction) null, (DateStripModel) null, 120, (DefaultConstructorMarker) null);
    private static final DateSelectorModel sixMonthSelectorModel = new DateSelectorModel("Jul 1 - Dec 31, 2022", "Jul 1 - Dec 31, 2021", "Jan 1 - Jun 30, 2022", (GenericInteraction) null, (GenericInteraction) null, (GenericInteraction) null, (DateStripModel) null, 120, (DefaultConstructorMarker) null);

    static {
        C22961h c22961h = AbstractC22977m.f90654e;
        weekDateSelectorState = new C17863f(c22961h, AbstractC8693b.m21278l("Mar 1 - Mar 7, 2022"), true, "Feb 22 - Feb 28, 2022", true, "Mar 8 - Mar 14, 2022", null, null, null, null, 960, null);
        monthDateSelectorState = new C17863f(c22961h, AbstractC8693b.m21278l("Mar 1 - Mar 31, 2022"), true, "Feb 1 - Feb 28, 2022", true, "Apr 1 - Apr 30, 2022", null, null, null, null, 960, null);
        sixMonthDateSelectorState = new C17863f(c22961h, AbstractC8693b.m21278l("Jan 1 - Jun 30, 2022"), true, "Jul 1 - Dec 31, 2021", true, "Jul 1 - Dec 31, 2022", null, null, null, null, 960, null);
        $stable = 8;
    }

    private DateSelectorFixture() {
    }

    public final DateSelectorModel getMonthDateSelectorModel() {
        return monthDateSelectorModel;
    }

    public final C17863f getMonthDateSelectorState() {
        return monthDateSelectorState;
    }

    public final C17863f getSixMonthDateSelectorState() {
        return sixMonthDateSelectorState;
    }

    public final DateSelectorModel getSixMonthSelectorModel() {
        return sixMonthSelectorModel;
    }

    public final DateSelectorModel getWeekDateSelectorModel() {
        return weekDateSelectorModel;
    }

    public final C17863f getWeekDateSelectorState() {
        return weekDateSelectorState;
    }
}
