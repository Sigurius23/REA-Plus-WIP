package com.whoop.archv2.feature.domain;

import androidx.room.AbstractC1772c1;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.InterfaceC9596c;
import j02.C21173v0;
import java.util.Map;
import m83.AbstractC25247g0;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: com.whoop.archv2.feature.domain.s */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004*\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/navigation/c;", "", "c", "(Lcom/whoop/navigation/c;)Ljava/lang/String;", "", "d", "(Ljava/lang/String;)Ljava/util/Map;", "arch-v2_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC6013s {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final String m18048c(InterfaceC9596c interfaceC9596c) {
        if (interfaceC9596c instanceof InterfaceC9596c.d) {
            InterfaceC9596c.d dVar = (InterfaceC9596c.d) interfaceC9596c;
            AppScreen appScreen = dVar.getDestination().getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String();
            C21173v0 tab = dVar.getDestination().getTab();
            return "Resolved(screen=" + appScreen + ", tab=" + (tab != null ? tab.getId() : null) + ")";
        }
        if (interfaceC9596c instanceof InterfaceC9596c.e) {
            return AbstractC2875y.m8296i(((InterfaceC9596c.e) interfaceC9596c).getStatusCode(), "ServerError(", ")");
        }
        if (AbstractC22676k.m65745e(interfaceC9596c, InterfaceC9596c.c.f28129a)) {
            return "NotMigrated";
        }
        if (AbstractC22676k.m65745e(interfaceC9596c, InterfaceC9596c.b.f28128a)) {
            return "NoRoute";
        }
        if (AbstractC22676k.m65745e(interfaceC9596c, InterfaceC9596c.f.f28132a)) {
            return "Unreachable";
        }
        if (AbstractC22676k.m65745e(interfaceC9596c, InterfaceC9596c.a.f28127a)) {
            return "Invalid";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final Map<String, String> m18049d(String str) {
        return AbstractC25247g0.m74000i0(AbstractC1772c1.m5400r(AbstractC37056f.m118968W(14, AbstractC39414r.m125898q0(str, "?"))));
    }
}
