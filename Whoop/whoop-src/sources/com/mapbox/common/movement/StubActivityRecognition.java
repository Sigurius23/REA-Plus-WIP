package com.mapbox.common.movement;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000f"}, m65681d2 = {"Lcom/mapbox/common/movement/StubActivityRecognition;", "Lcom/mapbox/common/movement/ActivityRecognitionClient;", "<init>", "()V", "", "isPlatformActivityRecognitionAvailable", "()Z", "Ll83/a0;", "start", "stop", "Lcom/mapbox/common/movement/ActivityRecognitionClient$Observer;", "observer", "addObserver", "(Lcom/mapbox/common/movement/ActivityRecognitionClient$Observer;)V", "removeObserver", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class StubActivityRecognition implements ActivityRecognitionClient {
    public static final StubActivityRecognition INSTANCE = new StubActivityRecognition();

    private StubActivityRecognition() {
    }

    @Override // com.mapbox.common.movement.ActivityRecognitionClient
    public void addObserver(ActivityRecognitionClient.Observer observer) {
        AbstractC22676k.m65750j(observer, "observer");
    }

    @Override // com.mapbox.common.movement.ActivityRecognitionClient
    public boolean isPlatformActivityRecognitionAvailable() {
        return false;
    }

    @Override // com.mapbox.common.movement.ActivityRecognitionClient
    public void removeObserver(ActivityRecognitionClient.Observer observer) {
        AbstractC22676k.m65750j(observer, "observer");
    }

    @Override // com.mapbox.common.movement.ActivityRecognitionClient
    public void start() {
    }

    @Override // com.mapbox.common.movement.ActivityRecognitionClient
    public void stop() {
    }
}
