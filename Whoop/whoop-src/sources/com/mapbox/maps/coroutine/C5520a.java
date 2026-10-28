package com.mapbox.maps.coroutine;

import com.mapbox.maps.CameraChanged;
import com.mapbox.maps.CameraChangedCallback;
import com.mapbox.maps.CameraChangedCoalesced;
import com.mapbox.maps.CameraChangedCoalescedCallback;
import com.mapbox.maps.GenericEvent;
import com.mapbox.maps.GenericEventCallback;
import com.mapbox.maps.MapIdle;
import com.mapbox.maps.MapIdleCallback;
import com.mapbox.maps.MapLoaded;
import com.mapbox.maps.MapLoadedCallback;
import com.mapbox.maps.RenderFrameFinished;
import com.mapbox.maps.RenderFrameFinishedCallback;
import com.mapbox.maps.RenderFrameStarted;
import com.mapbox.maps.RenderFrameStartedCallback;
import com.mapbox.maps.ResourceRequest;
import com.mapbox.maps.ResourceRequestCallback;
import com.mapbox.maps.SourceAdded;
import com.mapbox.maps.SourceAddedCallback;
import com.mapbox.maps.SourceDataLoaded;
import com.mapbox.maps.SourceDataLoadedCallback;
import com.mapbox.maps.SourceRemoved;
import com.mapbox.maps.SourceRemovedCallback;
import com.mapbox.maps.StyleDataLoaded;
import com.mapbox.maps.StyleDataLoadedCallback;
import com.mapbox.maps.StyleImageMissing;
import com.mapbox.maps.StyleImageMissingCallback;
import com.mapbox.maps.StyleImageRemoveUnused;
import com.mapbox.maps.StyleImageRemoveUnusedCallback;
import com.mapbox.maps.StyleLoaded;
import com.mapbox.maps.StyleLoadedCallback;
import dc3.InterfaceC11936u;
import p550vd.AbstractC35903f;

/* JADX INFO: renamed from: com.mapbox.maps.coroutine.a */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C5520a implements CameraChangedCoalescedCallback, CameraChangedCallback, GenericEventCallback, MapIdleCallback, MapLoadedCallback, RenderFrameFinishedCallback, RenderFrameStartedCallback, ResourceRequestCallback, SourceAddedCallback, SourceDataLoadedCallback, SourceRemovedCallback, StyleDataLoadedCallback, StyleImageMissingCallback, StyleImageRemoveUnusedCallback, StyleLoadedCallback {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC11936u f22032w;

    public /* synthetic */ C5520a(InterfaceC11936u interfaceC11936u) {
        this.f22032w = interfaceC11936u;
    }

    @Override // com.mapbox.maps.CameraChangedCallback
    public void run(CameraChanged cameraChanged) {
        AbstractC35903f.m114004X(this.f22032w, cameraChanged);
    }

    @Override // com.mapbox.maps.CameraChangedCoalescedCallback
    public void run(CameraChangedCoalesced cameraChangedCoalesced) {
        AbstractC35903f.m114004X(this.f22032w, cameraChangedCoalesced);
    }

    @Override // com.mapbox.maps.GenericEventCallback
    public void run(GenericEvent genericEvent) {
        AbstractC35903f.m114004X(this.f22032w, genericEvent);
    }

    @Override // com.mapbox.maps.MapIdleCallback
    public void run(MapIdle mapIdle) {
        AbstractC35903f.m114004X(this.f22032w, mapIdle);
    }

    @Override // com.mapbox.maps.MapLoadedCallback
    public void run(MapLoaded mapLoaded) {
        AbstractC35903f.m114004X(this.f22032w, mapLoaded);
    }

    @Override // com.mapbox.maps.RenderFrameFinishedCallback
    public void run(RenderFrameFinished renderFrameFinished) {
        AbstractC35903f.m114004X(this.f22032w, renderFrameFinished);
    }

    @Override // com.mapbox.maps.RenderFrameStartedCallback
    public void run(RenderFrameStarted renderFrameStarted) {
        AbstractC35903f.m114004X(this.f22032w, renderFrameStarted);
    }

    @Override // com.mapbox.maps.ResourceRequestCallback
    public void run(ResourceRequest resourceRequest) {
        AbstractC35903f.m114004X(this.f22032w, resourceRequest);
    }

    @Override // com.mapbox.maps.SourceAddedCallback
    public void run(SourceAdded sourceAdded) {
        AbstractC35903f.m114004X(this.f22032w, sourceAdded);
    }

    @Override // com.mapbox.maps.SourceDataLoadedCallback
    public void run(SourceDataLoaded sourceDataLoaded) {
        AbstractC35903f.m114004X(this.f22032w, sourceDataLoaded);
    }

    @Override // com.mapbox.maps.SourceRemovedCallback
    public void run(SourceRemoved sourceRemoved) {
        AbstractC35903f.m114004X(this.f22032w, sourceRemoved);
    }

    @Override // com.mapbox.maps.StyleDataLoadedCallback
    public void run(StyleDataLoaded styleDataLoaded) {
        AbstractC35903f.m114004X(this.f22032w, styleDataLoaded);
    }

    @Override // com.mapbox.maps.StyleImageMissingCallback
    public void run(StyleImageMissing styleImageMissing) {
        AbstractC35903f.m114004X(this.f22032w, styleImageMissing);
    }

    @Override // com.mapbox.maps.StyleImageRemoveUnusedCallback
    public void run(StyleImageRemoveUnused styleImageRemoveUnused) {
        AbstractC35903f.m114004X(this.f22032w, styleImageRemoveUnused);
    }

    @Override // com.mapbox.maps.StyleLoadedCallback
    public void run(StyleLoaded styleLoaded) {
        AbstractC35903f.m114004X(this.f22032w, styleLoaded);
    }
}
