package com.mapbox.maps;

import b10.C2219a;
import c93.InterfaceC4339a;
import com.mapbox.bindgen.DataRef;
import java.nio.ByteBuffer;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0007\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lcom/mapbox/maps/MapboxMapRecorder;", "", "Lcom/mapbox/maps/MapRecorder;", "mapRecorder", "<init>", "(Lcom/mapbox/maps/MapRecorder;)V", "Lcom/mapbox/maps/MapRecorderOptions;", "options", "Ll83/a0;", "startRecording", "(Lcom/mapbox/maps/MapRecorderOptions;)V", "Ljava/nio/ByteBuffer;", "stopRecording", "()Ljava/nio/ByteBuffer;", "recordedSequence", "Lcom/mapbox/maps/MapPlayerOptions;", "Lkotlin/Function0;", "onEnded", "replay", "(Ljava/nio/ByteBuffer;Lcom/mapbox/maps/MapPlayerOptions;Lc93/a;)V", "togglePauseReplay", "()V", "", "getPlaybackState", "()Ljava/lang/String;", "Lcom/mapbox/maps/MapRecorder;", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
@MapboxExperimental
public final class MapboxMapRecorder {
    private final MapRecorder mapRecorder;

    /* JADX INFO: renamed from: com.mapbox.maps.MapboxMapRecorder$replay$2 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "invoke", "()V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C54842 extends AbstractC22680m implements InterfaceC4339a {
        public static final C54842 INSTANCE = new C54842();

        public C54842() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134086invoke() {
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134086invoke();
            return C23454a0.f92919a;
        }
    }

    public MapboxMapRecorder(MapRecorder mapRecorder) {
        AbstractC22676k.m65750j(mapRecorder, "mapRecorder");
        this.mapRecorder = mapRecorder;
    }

    public static /* synthetic */ void replay$default(MapboxMapRecorder mapboxMapRecorder, ByteBuffer byteBuffer, MapPlayerOptions mapPlayerOptions, InterfaceC4339a interfaceC4339a, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            mapPlayerOptions = new MapPlayerOptions.Builder().build();
            AbstractC22676k.m65749i(mapPlayerOptions, "mapPlayerOptions");
        }
        if ((i13 & 4) != 0) {
            interfaceC4339a = C54842.INSTANCE;
        }
        mapboxMapRecorder.replay(byteBuffer, mapPlayerOptions, interfaceC4339a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void replay$lambda$4(InterfaceC4339a onEnded) {
        AbstractC22676k.m65750j(onEnded, "$onEnded");
        onEnded.invoke();
    }

    public static /* synthetic */ void startRecording$default(MapboxMapRecorder mapboxMapRecorder, MapRecorderOptions mapRecorderOptions, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            mapRecorderOptions = new MapRecorderOptions.Builder().build();
            AbstractC22676k.m65749i(mapRecorderOptions, "Builder().apply(block).build()");
        }
        mapboxMapRecorder.startRecording(mapRecorderOptions);
    }

    public final String getPlaybackState() {
        String playbackState = this.mapRecorder.getPlaybackState();
        AbstractC22676k.m65749i(playbackState, "mapRecorder.playbackState");
        return playbackState;
    }

    public final void replay(ByteBuffer recordedSequence) {
        AbstractC22676k.m65750j(recordedSequence, "recordedSequence");
        replay$default(this, recordedSequence, null, null, 6, null);
    }

    public final void startRecording() {
        startRecording$default(this, null, 1, null);
    }

    public final ByteBuffer stopRecording() {
        ByteBuffer buffer = this.mapRecorder.stopRecording().getBuffer();
        AbstractC22676k.m65749i(buffer, "data.buffer");
        buffer.rewind();
        return buffer;
    }

    public final void togglePauseReplay() {
        this.mapRecorder.togglePauseReplay();
    }

    public final void replay(ByteBuffer recordedSequence, MapPlayerOptions options) {
        AbstractC22676k.m65750j(recordedSequence, "recordedSequence");
        AbstractC22676k.m65750j(options, "options");
        replay$default(this, recordedSequence, options, null, 4, null);
    }

    public final void startRecording(MapRecorderOptions options) {
        AbstractC22676k.m65750j(options, "options");
        this.mapRecorder.startRecording(options);
    }

    public final void replay(ByteBuffer recordedSequence, MapPlayerOptions options, InterfaceC4339a onEnded) {
        AbstractC22676k.m65750j(recordedSequence, "recordedSequence");
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(onEnded, "onEnded");
        DataRef dataRefAllocateNative = DataRef.allocateNative(recordedSequence.limit());
        ByteBuffer buffer = dataRefAllocateNative.getBuffer();
        recordedSequence.rewind();
        buffer.put(recordedSequence).rewind();
        this.mapRecorder.replay(dataRefAllocateNative, options, new C2219a(onEnded, 1));
    }
}
