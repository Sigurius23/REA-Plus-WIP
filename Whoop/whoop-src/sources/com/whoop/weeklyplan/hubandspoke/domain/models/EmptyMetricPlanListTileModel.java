package com.whoop.weeklyplan.hubandspoke.domain.models;

import com.whoop.design.models.DesignSystemModel;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/weeklyplan/hubandspoke/domain/models/EmptyMetricPlanListTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "title", "", "buttonTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getButtonTitle", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class EmptyMetricPlanListTileModel implements DesignSystemModel {
    public static final int $stable = 0;
    private final String buttonTitle;
    private final String title;

    public EmptyMetricPlanListTileModel(String title, String buttonTitle) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        this.title = title;
        this.buttonTitle = buttonTitle;
    }

    public static /* synthetic */ EmptyMetricPlanListTileModel copy$default(EmptyMetricPlanListTileModel emptyMetricPlanListTileModel, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = emptyMetricPlanListTileModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = emptyMetricPlanListTileModel.buttonTitle;
        }
        return emptyMetricPlanListTileModel.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    public final EmptyMetricPlanListTileModel copy(String title, String buttonTitle) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        return new EmptyMetricPlanListTileModel(title, buttonTitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmptyMetricPlanListTileModel)) {
            return false;
        }
        EmptyMetricPlanListTileModel emptyMetricPlanListTileModel = (EmptyMetricPlanListTileModel) other;
        return AbstractC22676k.m65745e(this.title, emptyMetricPlanListTileModel.title) && AbstractC22676k.m65745e(this.buttonTitle, emptyMetricPlanListTileModel.buttonTitle);
    }

    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.buttonTitle.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        return AbstractC2875y.m8300m("EmptyMetricPlanListTileModel(title=", this.title, ", buttonTitle=", this.buttonTitle, ")");
    }
}
