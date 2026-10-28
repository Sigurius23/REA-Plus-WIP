package com.whoop.data.remote.domain.response.journal;

import java.util.Map;
import live.hms.video.media.tracks.HMSTrackSource;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/data/remote/domain/response/journal/BehaviorTrackerDestination;", "", HMSTrackSource.SCREEN, "", "parameters", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getScreen", "()Ljava/lang/String;", "getParameters", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class BehaviorTrackerDestination {
    private final Map<String, Object> parameters;
    private final String screen;

    public BehaviorTrackerDestination(String screen, Map<String, ? extends Object> parameters) {
        AbstractC22676k.m65750j(screen, "screen");
        AbstractC22676k.m65750j(parameters, "parameters");
        this.screen = screen;
        this.parameters = parameters;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BehaviorTrackerDestination copy$default(BehaviorTrackerDestination behaviorTrackerDestination, String str, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = behaviorTrackerDestination.screen;
        }
        if ((i13 & 2) != 0) {
            map = behaviorTrackerDestination.parameters;
        }
        return behaviorTrackerDestination.copy(str, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getScreen() {
        return this.screen;
    }

    public final Map<String, Object> component2() {
        return this.parameters;
    }

    public final BehaviorTrackerDestination copy(String screen, Map<String, ? extends Object> parameters) {
        AbstractC22676k.m65750j(screen, "screen");
        AbstractC22676k.m65750j(parameters, "parameters");
        return new BehaviorTrackerDestination(screen, parameters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BehaviorTrackerDestination)) {
            return false;
        }
        BehaviorTrackerDestination behaviorTrackerDestination = (BehaviorTrackerDestination) other;
        return AbstractC22676k.m65745e(this.screen, behaviorTrackerDestination.screen) && AbstractC22676k.m65745e(this.parameters, behaviorTrackerDestination.parameters);
    }

    public final Map<String, Object> getParameters() {
        return this.parameters;
    }

    public final String getScreen() {
        return this.screen;
    }

    public int hashCode() {
        return this.parameters.hashCode() + (this.screen.hashCode() * 31);
    }

    public String toString() {
        return AbstractC36095b.m114680h("BehaviorTrackerDestination(screen=", this.screen, ", parameters=", ")", this.parameters);
    }
}
