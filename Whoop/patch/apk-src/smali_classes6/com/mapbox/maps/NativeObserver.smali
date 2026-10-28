.class public final Lcom/mapbox/maps/NativeObserver;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;,
        Lcom/mapbox/maps/NativeObserver$ResubscribeExtendedCancelable;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00bc\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010#\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0001\u0018\u00002\u00020\u0001:\u0004\u00b5\u0001\u00b6\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u0011H\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u0011H\u0007\u00a2\u0006\u0004\u0008\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00082\u0006\u0010\u0017\u001a\u00020\u0016H\u0007\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00082\u0006\u0010\u0017\u001a\u00020\u0016H\u0007\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u00082\u0006\u0010\u001c\u001a\u00020\u001bH\u0007\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00082\u0006\u0010\u001c\u001a\u00020\u001bH\u0007\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0017\u0010\"\u001a\u00020\u00082\u0006\u0010!\u001a\u00020 H\u0007\u00a2\u0006\u0004\u0008\"\u0010#J\u0017\u0010$\u001a\u00020\u00082\u0006\u0010!\u001a\u00020 H\u0007\u00a2\u0006\u0004\u0008$\u0010#J\u0017\u0010\'\u001a\u00020\u00082\u0006\u0010&\u001a\u00020%H\u0007\u00a2\u0006\u0004\u0008\'\u0010(J\u0017\u0010)\u001a\u00020\u00082\u0006\u0010&\u001a\u00020%H\u0007\u00a2\u0006\u0004\u0008)\u0010(J\u0017\u0010,\u001a\u00020\u00082\u0006\u0010+\u001a\u00020*H\u0007\u00a2\u0006\u0004\u0008,\u0010-J\u0017\u0010.\u001a\u00020\u00082\u0006\u0010+\u001a\u00020*H\u0007\u00a2\u0006\u0004\u0008.\u0010-J\u0017\u00101\u001a\u00020\u00082\u0006\u00100\u001a\u00020/H\u0007\u00a2\u0006\u0004\u00081\u00102J\u0017\u00103\u001a\u00020\u00082\u0006\u00100\u001a\u00020/H\u0007\u00a2\u0006\u0004\u00083\u00102J\u0017\u00106\u001a\u00020\u00082\u0006\u00105\u001a\u000204H\u0007\u00a2\u0006\u0004\u00086\u00107J\u0017\u00108\u001a\u00020\u00082\u0006\u00105\u001a\u000204H\u0007\u00a2\u0006\u0004\u00088\u00107J\u0017\u0010;\u001a\u00020\u00082\u0006\u0010:\u001a\u000209H\u0007\u00a2\u0006\u0004\u0008;\u0010<J\u0017\u0010=\u001a\u00020\u00082\u0006\u0010:\u001a\u000209H\u0007\u00a2\u0006\u0004\u0008=\u0010<J\u0017\u0010@\u001a\u00020\u00082\u0006\u0010?\u001a\u00020>H\u0007\u00a2\u0006\u0004\u0008@\u0010AJ\u0017\u0010B\u001a\u00020\u00082\u0006\u0010?\u001a\u00020>H\u0007\u00a2\u0006\u0004\u0008B\u0010AJ\u0017\u0010E\u001a\u00020\u00082\u0006\u0010D\u001a\u00020CH\u0007\u00a2\u0006\u0004\u0008E\u0010FJ\u0017\u0010G\u001a\u00020\u00082\u0006\u0010D\u001a\u00020CH\u0007\u00a2\u0006\u0004\u0008G\u0010FJ3\u0010M\u001a\u00020L2\u0006\u0010I\u001a\u00020H2\u0010\u0008\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010J2\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008M\u0010NJ)\u0010Q\u001a\u00020L2\u0006\u0010P\u001a\u00020O2\u0010\u0008\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010JH\u0007\u00a2\u0006\u0004\u0008Q\u0010RJ3\u0010V\u001a\u00020L2\u0006\u0010T\u001a\u00020S2\u0010\u0008\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010J2\n\u0008\u0002\u0010U\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008V\u0010WJ3\u0010[\u001a\u00020L2\u0006\u0010Y\u001a\u00020X2\u0010\u0008\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010J2\n\u0008\u0002\u0010Z\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008[\u0010\\J3\u0010`\u001a\u00020L2\u0006\u0010^\u001a\u00020]2\u0010\u0008\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010J2\n\u0008\u0002\u0010_\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\u0008`\u0010aJ3\u0010e\u001a\u00020L2\u0006\u0010c\u001a\u00020b2\u0010\u0008\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010J2\n\u0008\u0002\u0010d\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0004\u0008e\u0010fJ3\u0010j\u001a\u00020L2\u0006\u0010h\u001a\u00020g2\u0010\u0008\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010J2\n\u0008\u0002\u0010i\u001a\u0004\u0018\u00010 \u00a2\u0006\u0004\u0008j\u0010kJ3\u0010o\u001a\u00020L2\u0006\u0010m\u001a\u00020l2\u0010\u0008\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010J2\n\u0008\u0002\u0010n\u001a\u0004\u0018\u00010%\u00a2\u0006\u0004\u0008o\u0010pJ3\u0010t\u001a\u00020L2\u0006\u0010r\u001a\u00020q2\u0010\u0008\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010J2\n\u0008\u0002\u0010s\u001a\u0004\u0018\u00010*\u00a2\u0006\u0004\u0008t\u0010uJ3\u0010y\u001a\u00020L2\u0006\u0010w\u001a\u00020v2\u0010\u0008\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010J2\n\u0008\u0002\u0010x\u001a\u0004\u0018\u00010/\u00a2\u0006\u0004\u0008y\u0010zJ3\u0010~\u001a\u00020L2\u0006\u0010|\u001a\u00020{2\u0010\u0008\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010J2\n\u0008\u0002\u0010}\u001a\u0004\u0018\u000104\u00a2\u0006\u0004\u0008~\u0010\u007fJ9\u0010\u0083\u0001\u001a\u00020L2\u0008\u0010\u0081\u0001\u001a\u00030\u0080\u00012\u0010\u0008\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010J2\u000b\u0008\u0002\u0010\u0082\u0001\u001a\u0004\u0018\u000109\u00a2\u0006\u0006\u0008\u0083\u0001\u0010\u0084\u0001J9\u0010\u0088\u0001\u001a\u00020L2\u0008\u0010\u0086\u0001\u001a\u00030\u0085\u00012\u0010\u0008\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010J2\u000b\u0008\u0002\u0010\u0087\u0001\u001a\u0004\u0018\u00010>\u00a2\u0006\u0006\u0008\u0088\u0001\u0010\u0089\u0001J9\u0010\u008d\u0001\u001a\u00020L2\u0008\u0010\u008b\u0001\u001a\u00030\u008a\u00012\u0010\u0008\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010J2\u000b\u0008\u0002\u0010\u008c\u0001\u001a\u0004\u0018\u00010C\u00a2\u0006\u0006\u0008\u008d\u0001\u0010\u008e\u0001J,\u0010\u0091\u0001\u001a\u00020L2\u0008\u0010\u0090\u0001\u001a\u00030\u008f\u00012\u0010\u0008\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010J\u00a2\u0006\u0006\u0008\u0091\u0001\u0010\u0092\u0001J8\u0010\u0097\u0001\u001a\u00020L2\u0008\u0010\u0094\u0001\u001a\u00030\u0093\u00012\u0008\u0010\u0096\u0001\u001a\u00030\u0095\u00012\u0010\u0008\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010JH\u0007\u00a2\u0006\u0006\u0008\u0097\u0001\u0010\u0098\u0001J\u0010\u0010\u0099\u0001\u001a\u00020\u0008\u00a2\u0006\u0006\u0008\u0099\u0001\u0010\u009a\u0001J\u0010\u0010\u009b\u0001\u001a\u00020\u0008\u00a2\u0006\u0006\u0008\u009b\u0001\u0010\u009a\u0001J\u001a\u0010\u009e\u0001\u001a\u00020\u00082\u0008\u0010\u009d\u0001\u001a\u00030\u009c\u0001\u00a2\u0006\u0006\u0008\u009e\u0001\u0010\u009f\u0001J0\u0010\u00a4\u0001\u001a\u00020\u00082\u0007\u0010\u00a0\u0001\u001a\u00020\u00012\u0013\u0010\u00a3\u0001\u001a\u000e\u0012\t\u0012\u00070\u00a2\u0001R\u00020\u00000\u00a1\u0001H\u0002\u00a2\u0006\u0006\u0008\u00a4\u0001\u0010\u00a5\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0003\u0010\u00a6\u0001R\u001e\u0010\u00a8\u0001\u001a\t\u0012\u0004\u0012\u00020]0\u00a7\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00a8\u0001\u0010\u00a9\u0001R#\u0010\u00a3\u0001\u001a\u000e\u0012\t\u0012\u00070\u00a2\u0001R\u00020\u00000\u00a7\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00a3\u0001\u0010\u00a9\u0001R0\u0010\u00ab\u0001\u001a\u000b\u0012\u0006\u0008\u0001\u0012\u00020L0\u00aa\u00018\u0000X\u0081\u0004\u00a2\u0006\u0018\n\u0006\u0008\u00ab\u0001\u0010\u00ac\u0001\u0012\u0006\u0008\u00af\u0001\u0010\u009a\u0001\u001a\u0006\u0008\u00ad\u0001\u0010\u00ae\u0001R#\u0010\u00b1\u0001\u001a\u000e\u0012\t\u0012\u00070\u00b0\u0001R\u00020\u00000\u00a7\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00b1\u0001\u0010\u00a9\u0001R0\u0010\u00b2\u0001\u001a\u000b\u0012\u0006\u0008\u0001\u0012\u00020L0\u00aa\u00018\u0000X\u0081\u0004\u00a2\u0006\u0018\n\u0006\u0008\u00b2\u0001\u0010\u00ac\u0001\u0012\u0006\u0008\u00b4\u0001\u0010\u009a\u0001\u001a\u0006\u0008\u00b3\u0001\u0010\u00ae\u0001\u00a8\u0006\u00b7\u0001"
    }
    d2 = {
        "Lcom/mapbox/maps/NativeObserver;",
        "",
        "Lcom/mapbox/maps/NativeMapImpl;",
        "observable",
        "<init>",
        "(Lcom/mapbox/maps/NativeMapImpl;)V",
        "Lnv/a;",
        "onCameraChangeListener",
        "Ll83/a0;",
        "addOnCameraChangeListener",
        "(Lnv/a;)V",
        "removeOnCameraChangeListener",
        "Lnv/d;",
        "onMapLoadedListener",
        "addOnMapLoadedListener",
        "(Lnv/d;)V",
        "removeOnMapLoadedListener",
        "Lnv/b;",
        "onMapIdleListener",
        "addOnMapIdleListener",
        "(Lnv/b;)V",
        "removeOnMapIdleListener",
        "Lnv/c;",
        "onMapLoadErrorListener",
        "addOnMapLoadErrorListener",
        "(Lnv/c;)V",
        "removeOnMapLoadErrorListener",
        "Lnv/m;",
        "onStyleLoadedListener",
        "addOnStyleLoadedListener",
        "(Lnv/m;)V",
        "removeOnStyleLoadedListener",
        "Lnv/j;",
        "onStyleDataLoadedListener",
        "addOnStyleDataLoadedListener",
        "(Lnv/j;)V",
        "removeOnStyleDataLoadedListener",
        "Lnv/h;",
        "onSourceDataLoadedListener",
        "addOnSourceDataLoadedListener",
        "(Lnv/h;)V",
        "removeOnSourceDataLoadedListener",
        "Lnv/g;",
        "onSourceAddedListener",
        "addOnSourceAddedListener",
        "(Lnv/g;)V",
        "removeOnSourceAddedListener",
        "Lnv/i;",
        "onSourceRemovedListener",
        "addOnSourceRemovedListener",
        "(Lnv/i;)V",
        "removeOnSourceRemovedListener",
        "Lnv/k;",
        "onStyleImageMissingListener",
        "addOnStyleImageMissingListener",
        "(Lnv/k;)V",
        "removeOnStyleImageMissingListener",
        "Lnv/l;",
        "onStyleImageUnusedListener",
        "addOnStyleImageUnusedListener",
        "(Lnv/l;)V",
        "removeOnStyleImageUnusedListener",
        "Lnv/f;",
        "onRenderFrameStartedListener",
        "addOnRenderFrameStartedListener",
        "(Lnv/f;)V",
        "removeOnRenderFrameStartedListener",
        "Lnv/e;",
        "onRenderFrameFinishedListener",
        "addOnRenderFrameFinishedListener",
        "(Lnv/e;)V",
        "removeOnRenderFrameFinishedListener",
        "Lcom/mapbox/maps/CameraChangedCallback;",
        "cameraChangedCallback",
        "Lkotlin/Function0;",
        "onCancel",
        "Lcom/mapbox/common/Cancelable;",
        "subscribeCameraChanged",
        "(Lcom/mapbox/maps/CameraChangedCallback;Lc93/a;Lnv/a;)Lcom/mapbox/common/Cancelable;",
        "Lcom/mapbox/maps/CameraChangedCoalescedCallback;",
        "cameraChangedCoalescedCallback",
        "subscribeCameraChangedCoalesced",
        "(Lcom/mapbox/maps/CameraChangedCoalescedCallback;Lc93/a;)Lcom/mapbox/common/Cancelable;",
        "Lcom/mapbox/maps/MapLoadedCallback;",
        "mapLoadedCallback",
        "mapLoadedListener",
        "subscribeMapLoaded",
        "(Lcom/mapbox/maps/MapLoadedCallback;Lc93/a;Lnv/d;)Lcom/mapbox/common/Cancelable;",
        "Lcom/mapbox/maps/MapIdleCallback;",
        "mapIdleCallback",
        "mapIdleListener",
        "subscribeMapIdle",
        "(Lcom/mapbox/maps/MapIdleCallback;Lc93/a;Lnv/b;)Lcom/mapbox/common/Cancelable;",
        "Lcom/mapbox/maps/MapLoadingErrorCallback;",
        "mapLoadingErrorCallback",
        "mapLoadingErrorListener",
        "subscribeMapLoadingError",
        "(Lcom/mapbox/maps/MapLoadingErrorCallback;Lc93/a;Lnv/c;)Lcom/mapbox/common/Cancelable;",
        "Lcom/mapbox/maps/StyleLoadedCallback;",
        "styleLoadedCallback",
        "styleLoadedListener",
        "subscribeStyleLoaded",
        "(Lcom/mapbox/maps/StyleLoadedCallback;Lc93/a;Lnv/m;)Lcom/mapbox/common/Cancelable;",
        "Lcom/mapbox/maps/StyleDataLoadedCallback;",
        "styleDataLoadedCallback",
        "styleDataLoadedListener",
        "subscribeStyleDataLoaded",
        "(Lcom/mapbox/maps/StyleDataLoadedCallback;Lc93/a;Lnv/j;)Lcom/mapbox/common/Cancelable;",
        "Lcom/mapbox/maps/SourceDataLoadedCallback;",
        "sourceDataLoadedCallback",
        "sourceDataLoadedListener",
        "subscribeSourceDataLoaded",
        "(Lcom/mapbox/maps/SourceDataLoadedCallback;Lc93/a;Lnv/h;)Lcom/mapbox/common/Cancelable;",
        "Lcom/mapbox/maps/SourceAddedCallback;",
        "sourceAddedCallback",
        "sourceAddedListener",
        "subscribeSourceAdded",
        "(Lcom/mapbox/maps/SourceAddedCallback;Lc93/a;Lnv/g;)Lcom/mapbox/common/Cancelable;",
        "Lcom/mapbox/maps/SourceRemovedCallback;",
        "sourceRemovedCallback",
        "sourceRemovedListener",
        "subscribeSourceRemoved",
        "(Lcom/mapbox/maps/SourceRemovedCallback;Lc93/a;Lnv/i;)Lcom/mapbox/common/Cancelable;",
        "Lcom/mapbox/maps/StyleImageMissingCallback;",
        "styleImageMissingCallback",
        "styleImageMissingListener",
        "subscribeStyleImageMissing",
        "(Lcom/mapbox/maps/StyleImageMissingCallback;Lc93/a;Lnv/k;)Lcom/mapbox/common/Cancelable;",
        "Lcom/mapbox/maps/StyleImageRemoveUnusedCallback;",
        "styleImageRemoveUnusedCallback",
        "styleImageUnusedListener",
        "subscribeStyleImageRemoveUnused",
        "(Lcom/mapbox/maps/StyleImageRemoveUnusedCallback;Lc93/a;Lnv/l;)Lcom/mapbox/common/Cancelable;",
        "Lcom/mapbox/maps/RenderFrameStartedCallback;",
        "renderFrameStartedCallback",
        "renderFrameStarted",
        "subscribeRenderFrameStarted",
        "(Lcom/mapbox/maps/RenderFrameStartedCallback;Lc93/a;Lnv/f;)Lcom/mapbox/common/Cancelable;",
        "Lcom/mapbox/maps/RenderFrameFinishedCallback;",
        "renderFrameFinishedCallback",
        "renderFrameFinishedListener",
        "subscribeRenderFrameFinished",
        "(Lcom/mapbox/maps/RenderFrameFinishedCallback;Lc93/a;Lnv/e;)Lcom/mapbox/common/Cancelable;",
        "Lcom/mapbox/maps/ResourceRequestCallback;",
        "resourceRequestCallback",
        "subscribeResourceRequest",
        "(Lcom/mapbox/maps/ResourceRequestCallback;Lc93/a;)Lcom/mapbox/common/Cancelable;",
        "",
        "eventName",
        "Lcom/mapbox/maps/GenericEventCallback;",
        "genericEventCallback",
        "subscribeGenericEvent",
        "(Ljava/lang/String;Lcom/mapbox/maps/GenericEventCallback;Lc93/a;)Lcom/mapbox/common/Cancelable;",
        "resubscribeStyleLoadListeners",
        "()V",
        "onDestroy",
        "Lcom/mapbox/maps/MapLoadingError;",
        "error",
        "sendMapLoadingError",
        "(Lcom/mapbox/maps/MapLoadingError;)V",
        "listener",
        "",
        "Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;",
        "cancelableSet",
        "unsubscribeListener",
        "(Ljava/lang/Object;Ljava/util/Set;)V",
        "Lcom/mapbox/maps/NativeMapImpl;",
        "Ljava/util/concurrent/CopyOnWriteArraySet;",
        "mapLoadingErrorCallbackSet",
        "Ljava/util/concurrent/CopyOnWriteArraySet;",
        "",
        "_cancelableSet",
        "Ljava/util/Set;",
        "get_cancelableSet$maps_sdk_release",
        "()Ljava/util/Set;",
        "get_cancelableSet$maps_sdk_release$annotations",
        "Lcom/mapbox/maps/NativeObserver$ResubscribeExtendedCancelable;",
        "resubscribableSet",
        "_resubscribableSet",
        "get_resubscribableSet$maps_sdk_release",
        "get_resubscribableSet$maps_sdk_release$annotations",
        "ExtendedCancelable",
        "ResubscribeExtendedCancelable",
        "maps-sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final _cancelableSet:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "+",
            "Lcom/mapbox/common/Cancelable;",
            ">;"
        }
    .end annotation
.end field

.field private final _resubscribableSet:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "+",
            "Lcom/mapbox/common/Cancelable;",
            ">;"
        }
    .end annotation
.end field

.field private final cancelableSet:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;",
            ">;"
        }
    .end annotation
.end field

.field private final mapLoadingErrorCallbackSet:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lcom/mapbox/maps/MapLoadingErrorCallback;",
            ">;"
        }
    .end annotation
.end field

.field private final observable:Lcom/mapbox/maps/NativeMapImpl;

.field private final resubscribableSet:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lcom/mapbox/maps/NativeObserver$ResubscribeExtendedCancelable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/mapbox/maps/NativeMapImpl;)V
    .locals 1

    const-string v0, "observable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mapbox/maps/NativeObserver;->observable:Lcom/mapbox/maps/NativeMapImpl;

    new-instance p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object p1, p0, Lcom/mapbox/maps/NativeObserver;->mapLoadingErrorCallbackSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object p1, p0, Lcom/mapbox/maps/NativeObserver;->cancelableSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    iput-object p1, p0, Lcom/mapbox/maps/NativeObserver;->_cancelableSet:Ljava/util/Set;

    new-instance p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object p1, p0, Lcom/mapbox/maps/NativeObserver;->resubscribableSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    iput-object p1, p0, Lcom/mapbox/maps/NativeObserver;->_resubscribableSet:Ljava/util/Set;

    return-void
.end method

.method public static synthetic a(Lcom/mapbox/maps/StyleImageMissing;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0, p0}, Lcom/mapbox/maps/NativeObserver;->addOnStyleImageMissingListener$lambda$11(Lnv/k;Lcom/mapbox/maps/StyleImageMissing;)V

    return-void
.end method

.method public static final synthetic access$getCancelableSet$p(Lcom/mapbox/maps/NativeObserver;)Ljava/util/concurrent/CopyOnWriteArraySet;
    .locals 0

    iget-object p0, p0, Lcom/mapbox/maps/NativeObserver;->cancelableSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    return-object p0
.end method

.method public static final synthetic access$getMapLoadingErrorCallbackSet$p(Lcom/mapbox/maps/NativeObserver;)Ljava/util/concurrent/CopyOnWriteArraySet;
    .locals 0

    iget-object p0, p0, Lcom/mapbox/maps/NativeObserver;->mapLoadingErrorCallbackSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    return-object p0
.end method

.method public static final synthetic access$getObservable$p(Lcom/mapbox/maps/NativeObserver;)Lcom/mapbox/maps/NativeMapImpl;
    .locals 0

    iget-object p0, p0, Lcom/mapbox/maps/NativeObserver;->observable:Lcom/mapbox/maps/NativeMapImpl;

    return-object p0
.end method

.method private static final addOnCameraChangeListener$lambda$2(Lnv/a;Lcom/mapbox/maps/CameraChanged;)V
    .locals 1

    const-string v0, "$onCameraChangeListener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mapbox/maps/CameraChanged;->getTimestamp()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    invoke-virtual {p1}, Lcom/mapbox/maps/CameraChanged;->getTimestamp()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    invoke-interface {p0}, Lnv/a;->a()V

    return-void
.end method

.method private static final addOnMapIdleListener$lambda$4(Lnv/b;Lcom/mapbox/maps/MapIdle;)V
    .locals 1

    const-string v0, "$onMapIdleListener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mapbox/maps/MapIdle;->getTimestamp()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    invoke-virtual {p1}, Lcom/mapbox/maps/MapIdle;->getTimestamp()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    invoke-interface {p0}, Lnv/b;->a()V

    return-void
.end method

.method private static final addOnMapLoadErrorListener$lambda$5(Lnv/c;Lcom/mapbox/maps/MapLoadingError;)V
    .locals 16

    const-string v0, "$onMapLoadErrorListener"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lsu/d;

    invoke-virtual/range {p1 .. p1}, Lcom/mapbox/maps/MapLoadingError;->getTimestamp()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-virtual/range {p1 .. p1}, Lcom/mapbox/maps/MapLoadingError;->getTimestamp()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/mapbox/maps/MapLoadingError;->getType()Lcom/mapbox/maps/MapLoadingErrorType;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ltu/c;->valueOf(Ljava/lang/String;)Ltu/c;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lcom/mapbox/maps/MapLoadingError;->getMessage()Ljava/lang/String;

    move-result-object v7

    const-string v0, "this.message"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/mapbox/maps/MapLoadingError;->getSourceId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lcom/mapbox/maps/MapLoadingError;->getTileId()Lcom/mapbox/maps/CanonicalTileID;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v9, Ltu/m;

    invoke-virtual {v0}, Lcom/mapbox/maps/CanonicalTileID;->getZ()B

    move-result v10

    int-to-long v10, v10

    invoke-virtual {v0}, Lcom/mapbox/maps/CanonicalTileID;->getX()I

    move-result v12

    int-to-long v12, v12

    invoke-virtual {v0}, Lcom/mapbox/maps/CanonicalTileID;->getY()I

    move-result v0

    int-to-long v14, v0

    invoke-direct/range {v9 .. v15}, Ltu/m;-><init>(JJJ)V

    goto :goto_0

    :cond_0
    const/4 v9, 0x0

    :goto_0
    invoke-direct/range {v2 .. v9}, Lsu/d;-><init>(JLjava/lang/Long;Ltu/c;Ljava/lang/String;Ljava/lang/String;Ltu/m;)V

    invoke-interface {v1}, Lnv/c;->a()V

    return-void
.end method

.method private static final addOnMapLoadedListener$lambda$3(Lnv/d;Lcom/mapbox/maps/MapLoaded;)V
    .locals 1

    const-string v0, "$onMapLoadedListener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mapbox/maps/MapLoaded;->getTimeInterval()Lcom/mapbox/maps/EventTimeInterval;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/EventTimeInterval;->getBegin()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    invoke-virtual {p1}, Lcom/mapbox/maps/MapLoaded;->getTimeInterval()Lcom/mapbox/maps/EventTimeInterval;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mapbox/maps/EventTimeInterval;->getEnd()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    invoke-interface {p0}, Lnv/d;->a()V

    return-void
.end method

.method private static final addOnRenderFrameFinishedListener$lambda$14(Lnv/e;Lcom/mapbox/maps/RenderFrameFinished;)V
    .locals 8

    const-string v0, "$onRenderFrameFinishedListener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lsu/e;

    invoke-virtual {p1}, Lcom/mapbox/maps/RenderFrameFinished;->getTimeInterval()Lcom/mapbox/maps/EventTimeInterval;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/EventTimeInterval;->getBegin()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-virtual {p1}, Lcom/mapbox/maps/RenderFrameFinished;->getTimeInterval()Lcom/mapbox/maps/EventTimeInterval;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/EventTimeInterval;->getEnd()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {p1}, Lcom/mapbox/maps/RenderFrameFinished;->getRenderMode()Lcom/mapbox/maps/RenderModeType;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ltu/d;->valueOf(Ljava/lang/String;)Ltu/d;

    move-result-object v5

    invoke-virtual {p1}, Lcom/mapbox/maps/RenderFrameFinished;->getNeedsRepaint()Z

    move-result v6

    invoke-virtual {p1}, Lcom/mapbox/maps/RenderFrameFinished;->getPlacementChanged()Z

    move-result v7

    invoke-direct/range {v1 .. v7}, Lsu/e;-><init>(JLjava/lang/Long;Ltu/d;ZZ)V

    invoke-interface {p0}, Lnv/e;->a()V

    return-void
.end method

.method private static final addOnRenderFrameStartedListener$lambda$13(Lnv/f;Lcom/mapbox/maps/RenderFrameStarted;)V
    .locals 1

    const-string v0, "$onRenderFrameStartedListener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mapbox/maps/RenderFrameStarted;->getTimestamp()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    invoke-virtual {p1}, Lcom/mapbox/maps/RenderFrameStarted;->getTimestamp()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    invoke-interface {p0}, Lnv/f;->a()V

    return-void
.end method

.method private static final addOnSourceAddedListener$lambda$9(Lnv/g;Lcom/mapbox/maps/SourceAdded;)V
    .locals 1

    const-string v0, "$onSourceAddedListener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mapbox/maps/SourceAdded;->getTimestamp()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    invoke-virtual {p1}, Lcom/mapbox/maps/SourceAdded;->getTimestamp()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    invoke-virtual {p1}, Lcom/mapbox/maps/SourceAdded;->getSourceId()Ljava/lang/String;

    move-result-object p1

    const-string v0, "this.sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lnv/g;->a()V

    return-void
.end method

.method private static final addOnSourceDataLoadedListener$lambda$8(Lnv/h;Lcom/mapbox/maps/SourceDataLoaded;)V
    .locals 16

    const-string v0, "$onSourceDataLoadedListener"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lsu/i;

    invoke-virtual/range {p1 .. p1}, Lcom/mapbox/maps/SourceDataLoaded;->getTimeInterval()Lcom/mapbox/maps/EventTimeInterval;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/EventTimeInterval;->getBegin()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-virtual/range {p1 .. p1}, Lcom/mapbox/maps/SourceDataLoaded;->getTimeInterval()Lcom/mapbox/maps/EventTimeInterval;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/EventTimeInterval;->getEnd()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/mapbox/maps/SourceDataLoaded;->getSourceId()Ljava/lang/String;

    move-result-object v6

    const-string v0, "this.sourceId"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/mapbox/maps/SourceDataLoaded;->getType()Lcom/mapbox/maps/SourceDataLoadedType;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ltu/k;->valueOf(Ljava/lang/String;)Ltu/k;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lcom/mapbox/maps/SourceDataLoaded;->getLoaded()Ljava/lang/Boolean;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lcom/mapbox/maps/SourceDataLoaded;->getTileId()Lcom/mapbox/maps/CanonicalTileID;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v9, Ltu/m;

    invoke-virtual {v0}, Lcom/mapbox/maps/CanonicalTileID;->getZ()B

    move-result v10

    int-to-long v10, v10

    invoke-virtual {v0}, Lcom/mapbox/maps/CanonicalTileID;->getX()I

    move-result v12

    int-to-long v12, v12

    invoke-virtual {v0}, Lcom/mapbox/maps/CanonicalTileID;->getY()I

    move-result v0

    int-to-long v14, v0

    invoke-direct/range {v9 .. v15}, Ltu/m;-><init>(JJJ)V

    goto :goto_0

    :cond_0
    const/4 v9, 0x0

    :goto_0
    invoke-direct/range {v2 .. v9}, Lsu/i;-><init>(JLjava/lang/Long;Ljava/lang/String;Ltu/k;Ljava/lang/Boolean;Ltu/m;)V

    invoke-interface {v1}, Lnv/h;->a()V

    return-void
.end method

.method private static final addOnSourceRemovedListener$lambda$10(Lnv/i;Lcom/mapbox/maps/SourceRemoved;)V
    .locals 1

    const-string v0, "$onSourceRemovedListener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mapbox/maps/SourceRemoved;->getTimestamp()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    invoke-virtual {p1}, Lcom/mapbox/maps/SourceRemoved;->getTimestamp()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    invoke-virtual {p1}, Lcom/mapbox/maps/SourceRemoved;->getSourceId()Ljava/lang/String;

    move-result-object p1

    const-string v0, "this.sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lnv/i;->a()V

    return-void
.end method

.method private static final addOnStyleDataLoadedListener$lambda$7(Lnv/j;Lcom/mapbox/maps/StyleDataLoaded;)V
    .locals 5

    const-string v0, "$onStyleDataLoadedListener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lsu/k;

    invoke-virtual {p1}, Lcom/mapbox/maps/StyleDataLoaded;->getTimeInterval()Lcom/mapbox/maps/EventTimeInterval;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mapbox/maps/EventTimeInterval;->getBegin()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/mapbox/maps/StyleDataLoaded;->getTimeInterval()Lcom/mapbox/maps/EventTimeInterval;

    move-result-object v3

    invoke-virtual {v3}, Lcom/mapbox/maps/EventTimeInterval;->getEnd()Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {p1}, Lcom/mapbox/maps/StyleDataLoaded;->getType()Lcom/mapbox/maps/StyleDataLoadedType;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ltu/l;->valueOf(Ljava/lang/String;)Ltu/l;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lsu/k;-><init>(JLjava/lang/Long;Ltu/l;)V

    invoke-interface {p0}, Lnv/j;->a()V

    return-void
.end method

.method private static final addOnStyleImageMissingListener$lambda$11(Lnv/k;Lcom/mapbox/maps/StyleImageMissing;)V
    .locals 1

    const-string v0, "$onStyleImageMissingListener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mapbox/maps/StyleImageMissing;->getTimestamp()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    invoke-virtual {p1}, Lcom/mapbox/maps/StyleImageMissing;->getTimestamp()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    invoke-virtual {p1}, Lcom/mapbox/maps/StyleImageMissing;->getImageId()Ljava/lang/String;

    move-result-object p1

    const-string v0, "this.imageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lnv/k;->a()V

    return-void
.end method

.method private static final addOnStyleImageUnusedListener$lambda$12(Lnv/l;Lcom/mapbox/maps/StyleImageRemoveUnused;)V
    .locals 1

    const-string v0, "$onStyleImageUnusedListener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mapbox/maps/StyleImageRemoveUnused;->getTimestamp()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    invoke-virtual {p1}, Lcom/mapbox/maps/StyleImageRemoveUnused;->getTimestamp()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    invoke-virtual {p1}, Lcom/mapbox/maps/StyleImageRemoveUnused;->getImageId()Ljava/lang/String;

    move-result-object p1

    const-string v0, "this.imageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lnv/l;->a()V

    return-void
.end method

.method private static final addOnStyleLoadedListener$lambda$6(Lnv/m;Lcom/mapbox/maps/StyleLoaded;)V
    .locals 1

    const-string v0, "$onStyleLoadedListener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mapbox/maps/StyleLoaded;->getTimeInterval()Lcom/mapbox/maps/EventTimeInterval;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/EventTimeInterval;->getBegin()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    invoke-virtual {p1}, Lcom/mapbox/maps/StyleLoaded;->getTimeInterval()Lcom/mapbox/maps/EventTimeInterval;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mapbox/maps/EventTimeInterval;->getEnd()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    invoke-interface {p0}, Lnv/m;->a()V

    return-void
.end method

.method public static synthetic b(Lcom/mapbox/maps/StyleLoaded;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0, p0}, Lcom/mapbox/maps/NativeObserver;->addOnStyleLoadedListener$lambda$6(Lnv/m;Lcom/mapbox/maps/StyleLoaded;)V

    return-void
.end method

.method public static synthetic c(Lcom/mapbox/maps/StyleImageRemoveUnused;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0, p0}, Lcom/mapbox/maps/NativeObserver;->addOnStyleImageUnusedListener$lambda$12(Lnv/l;Lcom/mapbox/maps/StyleImageRemoveUnused;)V

    return-void
.end method

.method public static synthetic d(Lcom/mapbox/maps/SourceAdded;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0, p0}, Lcom/mapbox/maps/NativeObserver;->addOnSourceAddedListener$lambda$9(Lnv/g;Lcom/mapbox/maps/SourceAdded;)V

    return-void
.end method

.method public static synthetic e(Lcom/mapbox/maps/CameraChanged;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0, p0}, Lcom/mapbox/maps/NativeObserver;->addOnCameraChangeListener$lambda$2(Lnv/a;Lcom/mapbox/maps/CameraChanged;)V

    return-void
.end method

.method public static synthetic f(Lcom/mapbox/maps/SourceDataLoaded;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0, p0}, Lcom/mapbox/maps/NativeObserver;->addOnSourceDataLoadedListener$lambda$8(Lnv/h;Lcom/mapbox/maps/SourceDataLoaded;)V

    return-void
.end method

.method public static synthetic g(Lcom/mapbox/maps/MapLoadingError;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0, p0}, Lcom/mapbox/maps/NativeObserver;->addOnMapLoadErrorListener$lambda$5(Lnv/c;Lcom/mapbox/maps/MapLoadingError;)V

    return-void
.end method

.method public static synthetic get_cancelableSet$maps_sdk_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic get_resubscribableSet$maps_sdk_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic h(Lcom/mapbox/maps/RenderFrameStarted;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0, p0}, Lcom/mapbox/maps/NativeObserver;->addOnRenderFrameStartedListener$lambda$13(Lnv/f;Lcom/mapbox/maps/RenderFrameStarted;)V

    return-void
.end method

.method public static synthetic i(Lcom/mapbox/maps/StyleDataLoaded;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0, p0}, Lcom/mapbox/maps/NativeObserver;->addOnStyleDataLoadedListener$lambda$7(Lnv/j;Lcom/mapbox/maps/StyleDataLoaded;)V

    return-void
.end method

.method public static synthetic j(Lcom/mapbox/maps/RenderFrameFinished;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0, p0}, Lcom/mapbox/maps/NativeObserver;->addOnRenderFrameFinishedListener$lambda$14(Lnv/e;Lcom/mapbox/maps/RenderFrameFinished;)V

    return-void
.end method

.method public static synthetic k(Lcom/mapbox/maps/MapLoaded;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0, p0}, Lcom/mapbox/maps/NativeObserver;->addOnMapLoadedListener$lambda$3(Lnv/d;Lcom/mapbox/maps/MapLoaded;)V

    return-void
.end method

.method public static synthetic l(Lcom/mapbox/maps/MapIdle;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0, p0}, Lcom/mapbox/maps/NativeObserver;->addOnMapIdleListener$lambda$4(Lnv/b;Lcom/mapbox/maps/MapIdle;)V

    return-void
.end method

.method public static synthetic m(Lcom/mapbox/maps/SourceRemoved;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0, p0}, Lcom/mapbox/maps/NativeObserver;->addOnSourceRemovedListener$lambda$10(Lnv/i;Lcom/mapbox/maps/SourceRemoved;)V

    return-void
.end method

.method public static synthetic subscribeCameraChanged$default(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/CameraChangedCallback;Lc93/a;Lnv/a;ILjava/lang/Object;)Lcom/mapbox/common/Cancelable;
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/mapbox/maps/NativeObserver;->subscribeCameraChanged(Lcom/mapbox/maps/CameraChangedCallback;Lc93/a;Lnv/a;)Lcom/mapbox/common/Cancelable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic subscribeCameraChangedCoalesced$default(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/CameraChangedCoalescedCallback;Lc93/a;ILjava/lang/Object;)Lcom/mapbox/common/Cancelable;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/mapbox/maps/NativeObserver;->subscribeCameraChangedCoalesced(Lcom/mapbox/maps/CameraChangedCoalescedCallback;Lc93/a;)Lcom/mapbox/common/Cancelable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic subscribeGenericEvent$default(Lcom/mapbox/maps/NativeObserver;Ljava/lang/String;Lcom/mapbox/maps/GenericEventCallback;Lc93/a;ILjava/lang/Object;)Lcom/mapbox/common/Cancelable;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/mapbox/maps/NativeObserver;->subscribeGenericEvent(Ljava/lang/String;Lcom/mapbox/maps/GenericEventCallback;Lc93/a;)Lcom/mapbox/common/Cancelable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic subscribeMapIdle$default(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/MapIdleCallback;Lc93/a;Lnv/b;ILjava/lang/Object;)Lcom/mapbox/common/Cancelable;
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/mapbox/maps/NativeObserver;->subscribeMapIdle(Lcom/mapbox/maps/MapIdleCallback;Lc93/a;Lnv/b;)Lcom/mapbox/common/Cancelable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic subscribeMapLoaded$default(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/MapLoadedCallback;Lc93/a;Lnv/d;ILjava/lang/Object;)Lcom/mapbox/common/Cancelable;
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/mapbox/maps/NativeObserver;->subscribeMapLoaded(Lcom/mapbox/maps/MapLoadedCallback;Lc93/a;Lnv/d;)Lcom/mapbox/common/Cancelable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic subscribeMapLoadingError$default(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/MapLoadingErrorCallback;Lc93/a;Lnv/c;ILjava/lang/Object;)Lcom/mapbox/common/Cancelable;
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/mapbox/maps/NativeObserver;->subscribeMapLoadingError(Lcom/mapbox/maps/MapLoadingErrorCallback;Lc93/a;Lnv/c;)Lcom/mapbox/common/Cancelable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic subscribeRenderFrameFinished$default(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/RenderFrameFinishedCallback;Lc93/a;Lnv/e;ILjava/lang/Object;)Lcom/mapbox/common/Cancelable;
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/mapbox/maps/NativeObserver;->subscribeRenderFrameFinished(Lcom/mapbox/maps/RenderFrameFinishedCallback;Lc93/a;Lnv/e;)Lcom/mapbox/common/Cancelable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic subscribeRenderFrameStarted$default(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/RenderFrameStartedCallback;Lc93/a;Lnv/f;ILjava/lang/Object;)Lcom/mapbox/common/Cancelable;
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/mapbox/maps/NativeObserver;->subscribeRenderFrameStarted(Lcom/mapbox/maps/RenderFrameStartedCallback;Lc93/a;Lnv/f;)Lcom/mapbox/common/Cancelable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic subscribeResourceRequest$default(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/ResourceRequestCallback;Lc93/a;ILjava/lang/Object;)Lcom/mapbox/common/Cancelable;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/mapbox/maps/NativeObserver;->subscribeResourceRequest(Lcom/mapbox/maps/ResourceRequestCallback;Lc93/a;)Lcom/mapbox/common/Cancelable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic subscribeSourceAdded$default(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/SourceAddedCallback;Lc93/a;Lnv/g;ILjava/lang/Object;)Lcom/mapbox/common/Cancelable;
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/mapbox/maps/NativeObserver;->subscribeSourceAdded(Lcom/mapbox/maps/SourceAddedCallback;Lc93/a;Lnv/g;)Lcom/mapbox/common/Cancelable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic subscribeSourceDataLoaded$default(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/SourceDataLoadedCallback;Lc93/a;Lnv/h;ILjava/lang/Object;)Lcom/mapbox/common/Cancelable;
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/mapbox/maps/NativeObserver;->subscribeSourceDataLoaded(Lcom/mapbox/maps/SourceDataLoadedCallback;Lc93/a;Lnv/h;)Lcom/mapbox/common/Cancelable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic subscribeSourceRemoved$default(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/SourceRemovedCallback;Lc93/a;Lnv/i;ILjava/lang/Object;)Lcom/mapbox/common/Cancelable;
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/mapbox/maps/NativeObserver;->subscribeSourceRemoved(Lcom/mapbox/maps/SourceRemovedCallback;Lc93/a;Lnv/i;)Lcom/mapbox/common/Cancelable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic subscribeStyleDataLoaded$default(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/StyleDataLoadedCallback;Lc93/a;Lnv/j;ILjava/lang/Object;)Lcom/mapbox/common/Cancelable;
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/mapbox/maps/NativeObserver;->subscribeStyleDataLoaded(Lcom/mapbox/maps/StyleDataLoadedCallback;Lc93/a;Lnv/j;)Lcom/mapbox/common/Cancelable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic subscribeStyleImageMissing$default(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/StyleImageMissingCallback;Lc93/a;Lnv/k;ILjava/lang/Object;)Lcom/mapbox/common/Cancelable;
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/mapbox/maps/NativeObserver;->subscribeStyleImageMissing(Lcom/mapbox/maps/StyleImageMissingCallback;Lc93/a;Lnv/k;)Lcom/mapbox/common/Cancelable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic subscribeStyleImageRemoveUnused$default(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/StyleImageRemoveUnusedCallback;Lc93/a;Lnv/l;ILjava/lang/Object;)Lcom/mapbox/common/Cancelable;
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/mapbox/maps/NativeObserver;->subscribeStyleImageRemoveUnused(Lcom/mapbox/maps/StyleImageRemoveUnusedCallback;Lc93/a;Lnv/l;)Lcom/mapbox/common/Cancelable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic subscribeStyleLoaded$default(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/StyleLoadedCallback;Lc93/a;Lnv/m;ILjava/lang/Object;)Lcom/mapbox/common/Cancelable;
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/mapbox/maps/NativeObserver;->subscribeStyleLoaded(Lcom/mapbox/maps/StyleLoadedCallback;Lc93/a;Lnv/m;)Lcom/mapbox/common/Cancelable;

    move-result-object p0

    return-object p0
.end method

.method private final unsubscribeListener(Ljava/lang/Object;Ljava/util/Set;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/util/Set<",
            "+",
            "Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;",
            ">;)V"
        }
    .end annotation

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;

    invoke-virtual {v2}, Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;->getListener()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;

    invoke-virtual {p2}, Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;->cancel()V

    goto :goto_1

    :cond_2
    return-void
.end method


# virtual methods
.method public final addOnCameraChangeListener(Lnv/a;)V
    .locals 7
    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "onCameraChangeListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/mapbox/maps/l;

    const/4 v0, 0x2

    invoke-direct {v2, v0}, Lcom/mapbox/maps/l;-><init>(I)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    move-object v4, p1

    invoke-static/range {v1 .. v6}, Lcom/mapbox/maps/NativeObserver;->subscribeCameraChanged$default(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/CameraChangedCallback;Lc93/a;Lnv/a;ILjava/lang/Object;)Lcom/mapbox/common/Cancelable;

    return-void
.end method

.method public final addOnMapIdleListener(Lnv/b;)V
    .locals 7
    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "onMapIdleListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lc9/g;

    const/16 v0, 0x19

    invoke-direct {v2, v0}, Lc9/g;-><init>(I)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    move-object v4, p1

    invoke-static/range {v1 .. v6}, Lcom/mapbox/maps/NativeObserver;->subscribeMapIdle$default(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/MapIdleCallback;Lc93/a;Lnv/b;ILjava/lang/Object;)Lcom/mapbox/common/Cancelable;

    return-void
.end method

.method public final addOnMapLoadErrorListener(Lnv/c;)V
    .locals 7
    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "onMapLoadErrorListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/mapbox/maps/m;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    move-object v4, p1

    invoke-static/range {v1 .. v6}, Lcom/mapbox/maps/NativeObserver;->subscribeMapLoadingError$default(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/MapLoadingErrorCallback;Lc93/a;Lnv/c;ILjava/lang/Object;)Lcom/mapbox/common/Cancelable;

    return-void
.end method

.method public final addOnMapLoadedListener(Lnv/d;)V
    .locals 7
    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "onMapLoadedListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lc9/g;

    const/16 v0, 0x1b

    invoke-direct {v2, v0}, Lc9/g;-><init>(I)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    move-object v4, p1

    invoke-static/range {v1 .. v6}, Lcom/mapbox/maps/NativeObserver;->subscribeMapLoaded$default(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/MapLoadedCallback;Lc93/a;Lnv/d;ILjava/lang/Object;)Lcom/mapbox/common/Cancelable;

    return-void
.end method

.method public final addOnRenderFrameFinishedListener(Lnv/e;)V
    .locals 7
    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "onRenderFrameFinishedListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lc9/g;

    const/16 v0, 0x1d

    invoke-direct {v2, v0}, Lc9/g;-><init>(I)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    move-object v4, p1

    invoke-static/range {v1 .. v6}, Lcom/mapbox/maps/NativeObserver;->subscribeRenderFrameFinished$default(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/RenderFrameFinishedCallback;Lc93/a;Lnv/e;ILjava/lang/Object;)Lcom/mapbox/common/Cancelable;

    return-void
.end method

.method public final addOnRenderFrameStartedListener(Lnv/f;)V
    .locals 7
    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "onRenderFrameStartedListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/mapbox/maps/l;

    const/4 v0, 0x3

    invoke-direct {v2, v0}, Lcom/mapbox/maps/l;-><init>(I)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    move-object v4, p1

    invoke-static/range {v1 .. v6}, Lcom/mapbox/maps/NativeObserver;->subscribeRenderFrameStarted$default(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/RenderFrameStartedCallback;Lc93/a;Lnv/f;ILjava/lang/Object;)Lcom/mapbox/common/Cancelable;

    return-void
.end method

.method public final addOnSourceAddedListener(Lnv/g;)V
    .locals 7
    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "onSourceAddedListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/mapbox/maps/l;

    const/4 v0, 0x5

    invoke-direct {v2, v0}, Lcom/mapbox/maps/l;-><init>(I)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    move-object v4, p1

    invoke-static/range {v1 .. v6}, Lcom/mapbox/maps/NativeObserver;->subscribeSourceAdded$default(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/SourceAddedCallback;Lc93/a;Lnv/g;ILjava/lang/Object;)Lcom/mapbox/common/Cancelable;

    return-void
.end method

.method public final addOnSourceDataLoadedListener(Lnv/h;)V
    .locals 7
    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "onSourceDataLoadedListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/mapbox/maps/l;

    const/4 v0, 0x6

    invoke-direct {v2, v0}, Lcom/mapbox/maps/l;-><init>(I)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    move-object v4, p1

    invoke-static/range {v1 .. v6}, Lcom/mapbox/maps/NativeObserver;->subscribeSourceDataLoaded$default(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/SourceDataLoadedCallback;Lc93/a;Lnv/h;ILjava/lang/Object;)Lcom/mapbox/common/Cancelable;

    return-void
.end method

.method public final addOnSourceRemovedListener(Lnv/i;)V
    .locals 7
    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "onSourceRemovedListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/mapbox/maps/l;

    const/4 v0, 0x0

    invoke-direct {v2, v0}, Lcom/mapbox/maps/l;-><init>(I)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    move-object v4, p1

    invoke-static/range {v1 .. v6}, Lcom/mapbox/maps/NativeObserver;->subscribeSourceRemoved$default(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/SourceRemovedCallback;Lc93/a;Lnv/i;ILjava/lang/Object;)Lcom/mapbox/common/Cancelable;

    return-void
.end method

.method public final addOnStyleDataLoadedListener(Lnv/j;)V
    .locals 7
    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "onStyleDataLoadedListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/mapbox/maps/l;

    const/4 v0, 0x1

    invoke-direct {v2, v0}, Lcom/mapbox/maps/l;-><init>(I)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    move-object v4, p1

    invoke-static/range {v1 .. v6}, Lcom/mapbox/maps/NativeObserver;->subscribeStyleDataLoaded$default(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/StyleDataLoadedCallback;Lc93/a;Lnv/j;ILjava/lang/Object;)Lcom/mapbox/common/Cancelable;

    return-void
.end method

.method public final addOnStyleImageMissingListener(Lnv/k;)V
    .locals 7
    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "onStyleImageMissingListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lc9/g;

    const/16 v0, 0x1a

    invoke-direct {v2, v0}, Lc9/g;-><init>(I)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    move-object v4, p1

    invoke-static/range {v1 .. v6}, Lcom/mapbox/maps/NativeObserver;->subscribeStyleImageMissing$default(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/StyleImageMissingCallback;Lc93/a;Lnv/k;ILjava/lang/Object;)Lcom/mapbox/common/Cancelable;

    return-void
.end method

.method public final addOnStyleImageUnusedListener(Lnv/l;)V
    .locals 7
    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "onStyleImageUnusedListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lc9/g;

    const/16 v0, 0x1c

    invoke-direct {v2, v0}, Lc9/g;-><init>(I)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    move-object v4, p1

    invoke-static/range {v1 .. v6}, Lcom/mapbox/maps/NativeObserver;->subscribeStyleImageRemoveUnused$default(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/StyleImageRemoveUnusedCallback;Lc93/a;Lnv/l;ILjava/lang/Object;)Lcom/mapbox/common/Cancelable;

    return-void
.end method

.method public final addOnStyleLoadedListener(Lnv/m;)V
    .locals 7
    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "onStyleLoadedListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/mapbox/maps/l;

    const/4 v0, 0x4

    invoke-direct {v2, v0}, Lcom/mapbox/maps/l;-><init>(I)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    move-object v4, p1

    invoke-static/range {v1 .. v6}, Lcom/mapbox/maps/NativeObserver;->subscribeStyleLoaded$default(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/StyleLoadedCallback;Lc93/a;Lnv/m;ILjava/lang/Object;)Lcom/mapbox/common/Cancelable;

    return-void
.end method

.method public final get_cancelableSet$maps_sdk_release()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "+",
            "Lcom/mapbox/common/Cancelable;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/mapbox/maps/NativeObserver;->_cancelableSet:Ljava/util/Set;

    return-object v0
.end method

.method public final get_resubscribableSet$maps_sdk_release()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "+",
            "Lcom/mapbox/common/Cancelable;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/mapbox/maps/NativeObserver;->_resubscribableSet:Ljava/util/Set;

    return-object v0
.end method

.method public final onDestroy()V
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/NativeObserver;->cancelableSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mapbox/common/Cancelable;

    invoke-interface {v1}, Lcom/mapbox/common/Cancelable;->cancel()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/mapbox/maps/NativeObserver;->resubscribableSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mapbox/common/Cancelable;

    invoke-interface {v1}, Lcom/mapbox/common/Cancelable;->cancel()V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final removeOnCameraChangeListener(Lnv/a;)V
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "onCameraChangeListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeObserver;->cancelableSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p0, p1, v0}, Lcom/mapbox/maps/NativeObserver;->unsubscribeListener(Ljava/lang/Object;Ljava/util/Set;)V

    return-void
.end method

.method public final removeOnMapIdleListener(Lnv/b;)V
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "onMapIdleListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeObserver;->cancelableSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p0, p1, v0}, Lcom/mapbox/maps/NativeObserver;->unsubscribeListener(Ljava/lang/Object;Ljava/util/Set;)V

    return-void
.end method

.method public final removeOnMapLoadErrorListener(Lnv/c;)V
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "onMapLoadErrorListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeObserver;->cancelableSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p0, p1, v0}, Lcom/mapbox/maps/NativeObserver;->unsubscribeListener(Ljava/lang/Object;Ljava/util/Set;)V

    return-void
.end method

.method public final removeOnMapLoadedListener(Lnv/d;)V
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "onMapLoadedListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeObserver;->cancelableSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p0, p1, v0}, Lcom/mapbox/maps/NativeObserver;->unsubscribeListener(Ljava/lang/Object;Ljava/util/Set;)V

    return-void
.end method

.method public final removeOnRenderFrameFinishedListener(Lnv/e;)V
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "onRenderFrameFinishedListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeObserver;->cancelableSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p0, p1, v0}, Lcom/mapbox/maps/NativeObserver;->unsubscribeListener(Ljava/lang/Object;Ljava/util/Set;)V

    return-void
.end method

.method public final removeOnRenderFrameStartedListener(Lnv/f;)V
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "onRenderFrameStartedListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeObserver;->cancelableSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p0, p1, v0}, Lcom/mapbox/maps/NativeObserver;->unsubscribeListener(Ljava/lang/Object;Ljava/util/Set;)V

    return-void
.end method

.method public final removeOnSourceAddedListener(Lnv/g;)V
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "onSourceAddedListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeObserver;->cancelableSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p0, p1, v0}, Lcom/mapbox/maps/NativeObserver;->unsubscribeListener(Ljava/lang/Object;Ljava/util/Set;)V

    return-void
.end method

.method public final removeOnSourceDataLoadedListener(Lnv/h;)V
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "onSourceDataLoadedListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeObserver;->cancelableSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p0, p1, v0}, Lcom/mapbox/maps/NativeObserver;->unsubscribeListener(Ljava/lang/Object;Ljava/util/Set;)V

    return-void
.end method

.method public final removeOnSourceRemovedListener(Lnv/i;)V
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "onSourceRemovedListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeObserver;->cancelableSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p0, p1, v0}, Lcom/mapbox/maps/NativeObserver;->unsubscribeListener(Ljava/lang/Object;Ljava/util/Set;)V

    return-void
.end method

.method public final removeOnStyleDataLoadedListener(Lnv/j;)V
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "onStyleDataLoadedListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeObserver;->resubscribableSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p0, p1, v0}, Lcom/mapbox/maps/NativeObserver;->unsubscribeListener(Ljava/lang/Object;Ljava/util/Set;)V

    return-void
.end method

.method public final removeOnStyleImageMissingListener(Lnv/k;)V
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "onStyleImageMissingListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeObserver;->cancelableSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p0, p1, v0}, Lcom/mapbox/maps/NativeObserver;->unsubscribeListener(Ljava/lang/Object;Ljava/util/Set;)V

    return-void
.end method

.method public final removeOnStyleImageUnusedListener(Lnv/l;)V
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "onStyleImageUnusedListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeObserver;->cancelableSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p0, p1, v0}, Lcom/mapbox/maps/NativeObserver;->unsubscribeListener(Ljava/lang/Object;Ljava/util/Set;)V

    return-void
.end method

.method public final removeOnStyleLoadedListener(Lnv/m;)V
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "onStyleLoadedListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeObserver;->resubscribableSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p0, p1, v0}, Lcom/mapbox/maps/NativeObserver;->unsubscribeListener(Ljava/lang/Object;Ljava/util/Set;)V

    return-void
.end method

.method public final resubscribeStyleLoadListeners()V
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/NativeObserver;->resubscribableSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mapbox/maps/NativeObserver$ResubscribeExtendedCancelable;

    invoke-virtual {v1}, Lcom/mapbox/maps/NativeObserver$ResubscribeExtendedCancelable;->resubscribe()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final sendMapLoadingError(Lcom/mapbox/maps/MapLoadingError;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeObserver;->mapLoadingErrorCallbackSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mapbox/maps/MapLoadingErrorCallback;

    invoke-interface {v1, p1}, Lcom/mapbox/maps/MapLoadingErrorCallback;->run(Lcom/mapbox/maps/MapLoadingError;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final subscribeCameraChanged(Lcom/mapbox/maps/CameraChangedCallback;Lc93/a;Lnv/a;)Lcom/mapbox/common/Cancelable;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/CameraChangedCallback;",
            "Lc93/a;",
            "Lnv/a;",
            ")",
            "Lcom/mapbox/common/Cancelable;"
        }
    .end annotation

    const-string v0, "cameraChangedCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;

    iget-object v0, p0, Lcom/mapbox/maps/NativeObserver;->observable:Lcom/mapbox/maps/NativeMapImpl;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/NativeMapImpl;->subscribe(Lcom/mapbox/maps/CameraChangedCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object v3

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    move-object v4, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v8}, Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;-><init>(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/common/Cancelable;Lc93/a;Ljava/util/Set;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final subscribeCameraChangedCoalesced(Lcom/mapbox/maps/CameraChangedCoalescedCallback;Lc93/a;)Lcom/mapbox/common/Cancelable;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/CameraChangedCoalescedCallback;",
            "Lc93/a;",
            ")",
            "Lcom/mapbox/common/Cancelable;"
        }
    .end annotation

    const-string v0, "cameraChangedCoalescedCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;

    iget-object v0, p0, Lcom/mapbox/maps/NativeObserver;->observable:Lcom/mapbox/maps/NativeMapImpl;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/NativeMapImpl;->subscribe(Lcom/mapbox/maps/CameraChangedCoalescedCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object v3

    const/16 v7, 0xc

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    move-object v4, p2

    invoke-direct/range {v1 .. v8}, Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;-><init>(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/common/Cancelable;Lc93/a;Ljava/util/Set;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final subscribeGenericEvent(Ljava/lang/String;Lcom/mapbox/maps/GenericEventCallback;Lc93/a;)Lcom/mapbox/common/Cancelable;
    .locals 9
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/GenericEventCallback;",
            "Lc93/a;",
            ")",
            "Lcom/mapbox/common/Cancelable;"
        }
    .end annotation

    const-string v0, "eventName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "genericEventCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;

    iget-object v0, p0, Lcom/mapbox/maps/NativeObserver;->observable:Lcom/mapbox/maps/NativeMapImpl;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/NativeMapImpl;->subscribe(Ljava/lang/String;Lcom/mapbox/maps/GenericEventCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object v3

    const/16 v7, 0xc

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    move-object v4, p3

    invoke-direct/range {v1 .. v8}, Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;-><init>(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/common/Cancelable;Lc93/a;Ljava/util/Set;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final subscribeMapIdle(Lcom/mapbox/maps/MapIdleCallback;Lc93/a;Lnv/b;)Lcom/mapbox/common/Cancelable;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/MapIdleCallback;",
            "Lc93/a;",
            "Lnv/b;",
            ")",
            "Lcom/mapbox/common/Cancelable;"
        }
    .end annotation

    const-string v0, "mapIdleCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;

    iget-object v0, p0, Lcom/mapbox/maps/NativeObserver;->observable:Lcom/mapbox/maps/NativeMapImpl;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/NativeMapImpl;->subscribe(Lcom/mapbox/maps/MapIdleCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object v3

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    move-object v4, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v8}, Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;-><init>(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/common/Cancelable;Lc93/a;Ljava/util/Set;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final subscribeMapLoaded(Lcom/mapbox/maps/MapLoadedCallback;Lc93/a;Lnv/d;)Lcom/mapbox/common/Cancelable;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/MapLoadedCallback;",
            "Lc93/a;",
            "Lnv/d;",
            ")",
            "Lcom/mapbox/common/Cancelable;"
        }
    .end annotation

    const-string v0, "mapLoadedCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;

    iget-object v0, p0, Lcom/mapbox/maps/NativeObserver;->observable:Lcom/mapbox/maps/NativeMapImpl;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/NativeMapImpl;->subscribe(Lcom/mapbox/maps/MapLoadedCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object v3

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    move-object v4, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v8}, Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;-><init>(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/common/Cancelable;Lc93/a;Ljava/util/Set;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final subscribeMapLoadingError(Lcom/mapbox/maps/MapLoadingErrorCallback;Lc93/a;Lnv/c;)Lcom/mapbox/common/Cancelable;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/MapLoadingErrorCallback;",
            "Lc93/a;",
            "Lnv/c;",
            ")",
            "Lcom/mapbox/common/Cancelable;"
        }
    .end annotation

    const-string v0, "mapLoadingErrorCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/NativeObserver;->mapLoadingErrorCallbackSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;

    iget-object v0, p0, Lcom/mapbox/maps/NativeObserver;->observable:Lcom/mapbox/maps/NativeMapImpl;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/NativeMapImpl;->subscribe(Lcom/mapbox/maps/MapLoadingErrorCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object v3

    new-instance v4, Lcom/mapbox/maps/NativeObserver$subscribeMapLoadingError$1;

    invoke-direct {v4, p0, p1, p2}, Lcom/mapbox/maps/NativeObserver$subscribeMapLoadingError$1;-><init>(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/MapLoadingErrorCallback;Lc93/a;)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    move-object v6, p3

    invoke-direct/range {v1 .. v8}, Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;-><init>(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/common/Cancelable;Lc93/a;Ljava/util/Set;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final subscribeRenderFrameFinished(Lcom/mapbox/maps/RenderFrameFinishedCallback;Lc93/a;Lnv/e;)Lcom/mapbox/common/Cancelable;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/RenderFrameFinishedCallback;",
            "Lc93/a;",
            "Lnv/e;",
            ")",
            "Lcom/mapbox/common/Cancelable;"
        }
    .end annotation

    const-string v0, "renderFrameFinishedCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;

    iget-object v0, p0, Lcom/mapbox/maps/NativeObserver;->observable:Lcom/mapbox/maps/NativeMapImpl;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/NativeMapImpl;->subscribe(Lcom/mapbox/maps/RenderFrameFinishedCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object v3

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    move-object v4, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v8}, Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;-><init>(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/common/Cancelable;Lc93/a;Ljava/util/Set;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final subscribeRenderFrameStarted(Lcom/mapbox/maps/RenderFrameStartedCallback;Lc93/a;Lnv/f;)Lcom/mapbox/common/Cancelable;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/RenderFrameStartedCallback;",
            "Lc93/a;",
            "Lnv/f;",
            ")",
            "Lcom/mapbox/common/Cancelable;"
        }
    .end annotation

    const-string v0, "renderFrameStartedCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;

    iget-object v0, p0, Lcom/mapbox/maps/NativeObserver;->observable:Lcom/mapbox/maps/NativeMapImpl;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/NativeMapImpl;->subscribe(Lcom/mapbox/maps/RenderFrameStartedCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object v3

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    move-object v4, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v8}, Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;-><init>(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/common/Cancelable;Lc93/a;Ljava/util/Set;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final subscribeResourceRequest(Lcom/mapbox/maps/ResourceRequestCallback;Lc93/a;)Lcom/mapbox/common/Cancelable;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/ResourceRequestCallback;",
            "Lc93/a;",
            ")",
            "Lcom/mapbox/common/Cancelable;"
        }
    .end annotation

    const-string v0, "resourceRequestCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;

    iget-object v0, p0, Lcom/mapbox/maps/NativeObserver;->observable:Lcom/mapbox/maps/NativeMapImpl;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/NativeMapImpl;->subscribe(Lcom/mapbox/maps/ResourceRequestCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object v3

    const/16 v7, 0xc

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    move-object v4, p2

    invoke-direct/range {v1 .. v8}, Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;-><init>(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/common/Cancelable;Lc93/a;Ljava/util/Set;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final subscribeSourceAdded(Lcom/mapbox/maps/SourceAddedCallback;Lc93/a;Lnv/g;)Lcom/mapbox/common/Cancelable;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/SourceAddedCallback;",
            "Lc93/a;",
            "Lnv/g;",
            ")",
            "Lcom/mapbox/common/Cancelable;"
        }
    .end annotation

    const-string v0, "sourceAddedCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;

    iget-object v0, p0, Lcom/mapbox/maps/NativeObserver;->observable:Lcom/mapbox/maps/NativeMapImpl;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/NativeMapImpl;->subscribe(Lcom/mapbox/maps/SourceAddedCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object v3

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    move-object v4, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v8}, Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;-><init>(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/common/Cancelable;Lc93/a;Ljava/util/Set;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final subscribeSourceDataLoaded(Lcom/mapbox/maps/SourceDataLoadedCallback;Lc93/a;Lnv/h;)Lcom/mapbox/common/Cancelable;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/SourceDataLoadedCallback;",
            "Lc93/a;",
            "Lnv/h;",
            ")",
            "Lcom/mapbox/common/Cancelable;"
        }
    .end annotation

    const-string v0, "sourceDataLoadedCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;

    iget-object v0, p0, Lcom/mapbox/maps/NativeObserver;->observable:Lcom/mapbox/maps/NativeMapImpl;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/NativeMapImpl;->subscribe(Lcom/mapbox/maps/SourceDataLoadedCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object v3

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    move-object v4, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v8}, Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;-><init>(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/common/Cancelable;Lc93/a;Ljava/util/Set;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final subscribeSourceRemoved(Lcom/mapbox/maps/SourceRemovedCallback;Lc93/a;Lnv/i;)Lcom/mapbox/common/Cancelable;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/SourceRemovedCallback;",
            "Lc93/a;",
            "Lnv/i;",
            ")",
            "Lcom/mapbox/common/Cancelable;"
        }
    .end annotation

    const-string v0, "sourceRemovedCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;

    iget-object v0, p0, Lcom/mapbox/maps/NativeObserver;->observable:Lcom/mapbox/maps/NativeMapImpl;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/NativeMapImpl;->subscribe(Lcom/mapbox/maps/SourceRemovedCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object v3

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    move-object v4, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v8}, Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;-><init>(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/common/Cancelable;Lc93/a;Ljava/util/Set;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final subscribeStyleDataLoaded(Lcom/mapbox/maps/StyleDataLoadedCallback;Lc93/a;Lnv/j;)Lcom/mapbox/common/Cancelable;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/StyleDataLoadedCallback;",
            "Lc93/a;",
            "Lnv/j;",
            ")",
            "Lcom/mapbox/common/Cancelable;"
        }
    .end annotation

    const-string v0, "styleDataLoadedCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/mapbox/maps/NativeObserver$subscribeStyleDataLoaded$resubscriber$1;

    invoke-direct {v3, p0, p1}, Lcom/mapbox/maps/NativeObserver$subscribeStyleDataLoaded$resubscriber$1;-><init>(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/StyleDataLoadedCallback;)V

    new-instance v1, Lcom/mapbox/maps/NativeObserver$ResubscribeExtendedCancelable;

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lcom/mapbox/common/Cancelable;

    iget-object v5, p0, Lcom/mapbox/maps/NativeObserver;->resubscribableSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    move-object v2, p0

    move-object v6, p2

    move-object v7, p3

    invoke-direct/range {v1 .. v7}, Lcom/mapbox/maps/NativeObserver$ResubscribeExtendedCancelable;-><init>(Lcom/mapbox/maps/NativeObserver;Lc93/a;Lcom/mapbox/common/Cancelable;Ljava/util/Set;Lc93/a;Ljava/lang/Object;)V

    return-object v1
.end method

.method public final subscribeStyleImageMissing(Lcom/mapbox/maps/StyleImageMissingCallback;Lc93/a;Lnv/k;)Lcom/mapbox/common/Cancelable;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/StyleImageMissingCallback;",
            "Lc93/a;",
            "Lnv/k;",
            ")",
            "Lcom/mapbox/common/Cancelable;"
        }
    .end annotation

    const-string v0, "styleImageMissingCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;

    iget-object v0, p0, Lcom/mapbox/maps/NativeObserver;->observable:Lcom/mapbox/maps/NativeMapImpl;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/NativeMapImpl;->subscribe(Lcom/mapbox/maps/StyleImageMissingCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object v3

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    move-object v4, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v8}, Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;-><init>(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/common/Cancelable;Lc93/a;Ljava/util/Set;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final subscribeStyleImageRemoveUnused(Lcom/mapbox/maps/StyleImageRemoveUnusedCallback;Lc93/a;Lnv/l;)Lcom/mapbox/common/Cancelable;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/StyleImageRemoveUnusedCallback;",
            "Lc93/a;",
            "Lnv/l;",
            ")",
            "Lcom/mapbox/common/Cancelable;"
        }
    .end annotation

    const-string v0, "styleImageRemoveUnusedCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;

    iget-object v0, p0, Lcom/mapbox/maps/NativeObserver;->observable:Lcom/mapbox/maps/NativeMapImpl;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/NativeMapImpl;->subscribe(Lcom/mapbox/maps/StyleImageRemoveUnusedCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object v3

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    move-object v4, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v8}, Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;-><init>(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/common/Cancelable;Lc93/a;Ljava/util/Set;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final subscribeStyleLoaded(Lcom/mapbox/maps/StyleLoadedCallback;Lc93/a;Lnv/m;)Lcom/mapbox/common/Cancelable;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/StyleLoadedCallback;",
            "Lc93/a;",
            "Lnv/m;",
            ")",
            "Lcom/mapbox/common/Cancelable;"
        }
    .end annotation

    const-string v0, "styleLoadedCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/mapbox/maps/NativeObserver$subscribeStyleLoaded$resubscriber$1;

    invoke-direct {v3, p0, p1}, Lcom/mapbox/maps/NativeObserver$subscribeStyleLoaded$resubscriber$1;-><init>(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/StyleLoadedCallback;)V

    new-instance v1, Lcom/mapbox/maps/NativeObserver$ResubscribeExtendedCancelable;

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lcom/mapbox/common/Cancelable;

    iget-object v5, p0, Lcom/mapbox/maps/NativeObserver;->resubscribableSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    move-object v2, p0

    move-object v6, p2

    move-object v7, p3

    invoke-direct/range {v1 .. v7}, Lcom/mapbox/maps/NativeObserver$ResubscribeExtendedCancelable;-><init>(Lcom/mapbox/maps/NativeObserver;Lc93/a;Lcom/mapbox/common/Cancelable;Ljava/util/Set;Lc93/a;Ljava/lang/Object;)V

    return-object v1
.end method
