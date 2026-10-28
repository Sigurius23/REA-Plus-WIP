package na2;

import com.whoop.navigation.C9598e;
import ha2.C17057a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: na2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lna2/a;", "", "Lha2/a;", "analyticsHelper", "<init>", "(Lha2/a;)V", "Lcom/whoop/navigation/e;", "destination", "", "tracking", "Lkotlin/Function1;", "Ll83/a0;", "onNavigationEvent", "a", "(Lcom/whoop/navigation/e;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lha2/a;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26512a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C17057a analyticsHelper;

    public C26512a(C17057a analyticsHelper) {
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        this.analyticsHelper = analyticsHelper;
    }

    /* JADX INFO: renamed from: a */
    public final void m78590a(C9598e destination, String tracking, Function1 onNavigationEvent) {
        AbstractC22676k.m65750j(destination, "destination");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        if (tracking != null) {
            this.analyticsHelper.m48172a(tracking);
        }
        onNavigationEvent.invoke(destination);
    }
}
