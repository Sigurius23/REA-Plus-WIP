package com.whoop.hormonalinsights.logsymptoms.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, m65681d2 = {"Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;", "", "", "title", "Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBarButton;", "rightButton", "<init>", "(Ljava/lang/String;Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBarButton;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBarButton;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBarButton;", "copy", "(Ljava/lang/String;Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBarButton;)Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBarButton;", "getRightButton", "Companion", "$serializer", "a", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class NavigationBar {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final NavigationBarButton rightButton;
    private final String title;

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.logsymptoms.domain.models.NavigationBar$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return NavigationBar$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ NavigationBar(int i13, String str, NavigationBarButton navigationBarButton, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, NavigationBar$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        if ((i13 & 2) == 0) {
            this.rightButton = null;
        } else {
            this.rightButton = navigationBarButton;
        }
    }

    public static /* synthetic */ NavigationBar copy$default(NavigationBar navigationBar, String str, NavigationBarButton navigationBarButton, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = navigationBar.title;
        }
        if ((i13 & 2) != 0) {
            navigationBarButton = navigationBar.rightButton;
        }
        return navigationBar.copy(str, navigationBarButton);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(NavigationBar self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.rightButton == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, NavigationBarButton$$serializer.INSTANCE, self.rightButton);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NavigationBarButton getRightButton() {
        return this.rightButton;
    }

    public final NavigationBar copy(String title, NavigationBarButton rightButton) {
        AbstractC22676k.m65750j(title, "title");
        return new NavigationBar(title, rightButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationBar)) {
            return false;
        }
        NavigationBar navigationBar = (NavigationBar) other;
        return AbstractC22676k.m65745e(this.title, navigationBar.title) && AbstractC22676k.m65745e(this.rightButton, navigationBar.rightButton);
    }

    public final NavigationBarButton getRightButton() {
        return this.rightButton;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        NavigationBarButton navigationBarButton = this.rightButton;
        return iHashCode + (navigationBarButton == null ? 0 : navigationBarButton.hashCode());
    }

    public String toString() {
        return "NavigationBar(title=" + this.title + ", rightButton=" + this.rightButton + ")";
    }

    public NavigationBar(String title, NavigationBarButton navigationBarButton) {
        AbstractC22676k.m65750j(title, "title");
        this.title = title;
        this.rightButton = navigationBarButton;
    }

    public /* synthetic */ NavigationBar(String str, NavigationBarButton navigationBarButton, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : navigationBarButton);
    }
}
