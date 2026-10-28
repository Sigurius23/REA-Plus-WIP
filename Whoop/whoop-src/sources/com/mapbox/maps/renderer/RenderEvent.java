package com.mapbox.maps.renderer;

import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m65681d2 = {"Lcom/mapbox/maps/renderer/RenderEvent;", "", "runnable", "Ljava/lang/Runnable;", "needRender", "", "(Ljava/lang/Runnable;Z)V", "getNeedRender", "()Z", "getRunnable", "()Ljava/lang/Runnable;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final /* data */ class RenderEvent {
    private final boolean needRender;
    private final Runnable runnable;

    public RenderEvent(Runnable runnable, boolean z4) {
        this.runnable = runnable;
        this.needRender = z4;
    }

    public static /* synthetic */ RenderEvent copy$default(RenderEvent renderEvent, Runnable runnable, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            runnable = renderEvent.runnable;
        }
        if ((i13 & 2) != 0) {
            z4 = renderEvent.needRender;
        }
        return renderEvent.copy(runnable, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Runnable getRunnable() {
        return this.runnable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getNeedRender() {
        return this.needRender;
    }

    public final RenderEvent copy(Runnable runnable, boolean needRender) {
        return new RenderEvent(runnable, needRender);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RenderEvent)) {
            return false;
        }
        RenderEvent renderEvent = (RenderEvent) other;
        return AbstractC22676k.m65745e(this.runnable, renderEvent.runnable) && this.needRender == renderEvent.needRender;
    }

    public final boolean getNeedRender() {
        return this.needRender;
    }

    public final Runnable getRunnable() {
        return this.runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        Runnable runnable = this.runnable;
        int iHashCode = (runnable == null ? 0 : runnable.hashCode()) * 31;
        boolean z4 = this.needRender;
        ?? r10 = z4;
        if (z4) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("RenderEvent(runnable=");
        sb4.append(this.runnable);
        sb4.append(", needRender=");
        return AbstractC2875y.m8305r(sb4, this.needRender, ')');
    }
}
