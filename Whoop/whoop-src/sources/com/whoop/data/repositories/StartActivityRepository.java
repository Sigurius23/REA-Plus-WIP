package com.whoop.data.repositories;

import com.whoop.data.local.prefs.SharedPreferenceConstants;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import u92.C34660d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R$\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/data/repositories/StartActivityRepository;", "", "Lu92/d;", "sharedPreferences", "<init>", "(Lu92/d;)V", "Lu92/d;", "", "enabledTrackRoute", "getTrackRoute", "()Z", "setTrackRoute", "(Z)V", "trackRoute", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class StartActivityRepository {
    private final C34660d sharedPreferences;

    public StartActivityRepository(C34660d sharedPreferences) {
        AbstractC22676k.m65750j(sharedPreferences, "sharedPreferences");
        this.sharedPreferences = sharedPreferences;
    }

    public final boolean getTrackRoute() {
        return this.sharedPreferences.m109528e(SharedPreferenceConstants.KET_TRACK_ROUTE_ON_OFF, false);
    }

    public final void setTrackRoute(boolean z4) {
        this.sharedPreferences.m109538q(SharedPreferenceConstants.KET_TRACK_ROUTE_ON_OFF, z4);
    }
}
