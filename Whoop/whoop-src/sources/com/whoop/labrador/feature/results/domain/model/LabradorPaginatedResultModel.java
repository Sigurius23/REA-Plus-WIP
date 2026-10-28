package com.whoop.labrador.feature.results.domain.model;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010!\u001a\u00020\"HÖ\u0081\u0004J\n\u0010#\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006$"}, m65681d2 = {"Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;", "", "id", "", "trailingTimestamp", "", "title", "Lcom/whoop/design/util/TextResource;", "description", "alertState", "", "icon", "<init>", "(Ljava/lang/String;JLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTrailingTimestamp", "()J", "getTitle", "()Lcom/whoop/design/util/TextResource;", "getDescription", "getAlertState", "()Z", "getIcon", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class LabradorPaginatedResultModel {
    public static final int $stable = TextResource.$stable;
    private final boolean alertState;
    private final TextResource description;
    private final String icon;
    private final String id;
    private final TextResource title;
    private final long trailingTimestamp;

    public LabradorPaginatedResultModel() {
        this(null, 0L, null, null, false, null, 63, null);
    }

    public static /* synthetic */ LabradorPaginatedResultModel copy$default(LabradorPaginatedResultModel labradorPaginatedResultModel, String str, long j7, TextResource textResource, TextResource textResource2, boolean z4, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = labradorPaginatedResultModel.id;
        }
        if ((i13 & 2) != 0) {
            j7 = labradorPaginatedResultModel.trailingTimestamp;
        }
        if ((i13 & 4) != 0) {
            textResource = labradorPaginatedResultModel.title;
        }
        if ((i13 & 8) != 0) {
            textResource2 = labradorPaginatedResultModel.description;
        }
        if ((i13 & 16) != 0) {
            z4 = labradorPaginatedResultModel.alertState;
        }
        if ((i13 & 32) != 0) {
            str2 = labradorPaginatedResultModel.icon;
        }
        return labradorPaginatedResultModel.copy(str, j7, textResource, textResource2, z4, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTrailingTimestamp() {
        return this.trailingTimestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TextResource getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getAlertState() {
        return this.alertState;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    public final LabradorPaginatedResultModel copy(String id4, long trailingTimestamp, TextResource title, TextResource description, boolean alertState, String icon) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(icon, "icon");
        return new LabradorPaginatedResultModel(id4, trailingTimestamp, title, description, alertState, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LabradorPaginatedResultModel)) {
            return false;
        }
        LabradorPaginatedResultModel labradorPaginatedResultModel = (LabradorPaginatedResultModel) other;
        return AbstractC22676k.m65745e(this.id, labradorPaginatedResultModel.id) && this.trailingTimestamp == labradorPaginatedResultModel.trailingTimestamp && AbstractC22676k.m65745e(this.title, labradorPaginatedResultModel.title) && AbstractC22676k.m65745e(this.description, labradorPaginatedResultModel.description) && this.alertState == labradorPaginatedResultModel.alertState && AbstractC22676k.m65745e(this.icon, labradorPaginatedResultModel.icon);
    }

    public final boolean getAlertState() {
        return this.alertState;
    }

    public final TextResource getDescription() {
        return this.description;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public final long getTrailingTimestamp() {
        return this.trailingTimestamp;
    }

    public int hashCode() {
        return this.icon.hashCode() + AbstractC2875y.m8289b(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11266d.m30451e(this.id.hashCode() * 31, this.trailingTimestamp, 31), this.title, 31), this.description, 31), 31, this.alertState);
    }

    public String toString() {
        String str = this.id;
        long j7 = this.trailingTimestamp;
        TextResource textResource = this.title;
        TextResource textResource2 = this.description;
        boolean z4 = this.alertState;
        String str2 = this.icon;
        StringBuilder sbM32000s = AbstractC11895b.m32000s("LabradorPaginatedResultModel(id=", str, j7, ", trailingTimestamp=");
        sbM32000s.append(", title=");
        sbM32000s.append(textResource);
        sbM32000s.append(", description=");
        sbM32000s.append(textResource2);
        sbM32000s.append(", alertState=");
        sbM32000s.append(z4);
        sbM32000s.append(", icon=");
        sbM32000s.append(str2);
        sbM32000s.append(")");
        return sbM32000s.toString();
    }

    public LabradorPaginatedResultModel(String id4, long j7, TextResource title, TextResource description, boolean z4, String icon) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(icon, "icon");
        this.id = id4;
        this.trailingTimestamp = j7;
        this.title = title;
        this.description = description;
        this.alertState = z4;
        this.icon = icon;
    }

    public /* synthetic */ LabradorPaginatedResultModel(String str, long j7, TextResource textResource, TextResource textResource2, boolean z4, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? 0L : j7, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 8) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 16) != 0 ? false : z4, (i13 & 32) != 0 ? "" : str2);
    }
}
