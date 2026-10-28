package com.mapbox.maps;

import c93.InterfaceC4339a;
import com.mapbox.common.Cancelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import l83.C23454a0;
import l83.InterfaceC23457c;
import p047c9.C4316g;
import p349nv.InterfaceC27150a;
import p349nv.InterfaceC27151b;
import p349nv.InterfaceC27152c;
import p349nv.InterfaceC27153d;
import p349nv.InterfaceC27154e;
import p349nv.InterfaceC27155f;
import p349nv.InterfaceC27156g;
import p349nv.InterfaceC27157h;
import p349nv.InterfaceC27158i;
import p349nv.InterfaceC27159j;
import p349nv.InterfaceC27160k;
import p349nv.InterfaceC27161l;
import p349nv.InterfaceC27162m;
import p506tu.C34186m;
import p506tu.EnumC34176c;
import p506tu.EnumC34177d;
import p506tu.EnumC34184k;
import p506tu.EnumC34185l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.AbstractC22681m0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import su.C33000d;
import su.C33001e;
import su.C33005i;
import su.C33007k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000¼\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0004µ\u0001¶\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b$\u0010#J\u0017\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b)\u0010(J\u0017\u0010,\u001a\u00020\b2\u0006\u0010+\u001a\u00020*H\u0007¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\b2\u0006\u0010+\u001a\u00020*H\u0007¢\u0006\u0004\b.\u0010-J\u0017\u00101\u001a\u00020\b2\u0006\u00100\u001a\u00020/H\u0007¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\b2\u0006\u00100\u001a\u00020/H\u0007¢\u0006\u0004\b3\u00102J\u0017\u00106\u001a\u00020\b2\u0006\u00105\u001a\u000204H\u0007¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\b2\u0006\u00105\u001a\u000204H\u0007¢\u0006\u0004\b8\u00107J\u0017\u0010;\u001a\u00020\b2\u0006\u0010:\u001a\u000209H\u0007¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\b2\u0006\u0010:\u001a\u000209H\u0007¢\u0006\u0004\b=\u0010<J\u0017\u0010@\u001a\u00020\b2\u0006\u0010?\u001a\u00020>H\u0007¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\b2\u0006\u0010?\u001a\u00020>H\u0007¢\u0006\u0004\bB\u0010AJ\u0017\u0010E\u001a\u00020\b2\u0006\u0010D\u001a\u00020CH\u0007¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\b2\u0006\u0010D\u001a\u00020CH\u0007¢\u0006\u0004\bG\u0010FJ3\u0010M\u001a\u00020L2\u0006\u0010I\u001a\u00020H2\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\bM\u0010NJ)\u0010Q\u001a\u00020L2\u0006\u0010P\u001a\u00020O2\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010JH\u0007¢\u0006\u0004\bQ\u0010RJ3\u0010V\u001a\u00020L2\u0006\u0010T\u001a\u00020S2\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\f¢\u0006\u0004\bV\u0010WJ3\u0010[\u001a\u00020L2\u0006\u0010Y\u001a\u00020X2\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b[\u0010\\J3\u0010`\u001a\u00020L2\u0006\u0010^\u001a\u00020]2\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b`\u0010aJ3\u0010e\u001a\u00020L2\u0006\u0010c\u001a\u00020b2\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\be\u0010fJ3\u0010j\u001a\u00020L2\u0006\u0010h\u001a\u00020g2\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\n\b\u0002\u0010i\u001a\u0004\u0018\u00010 ¢\u0006\u0004\bj\u0010kJ3\u0010o\u001a\u00020L2\u0006\u0010m\u001a\u00020l2\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\n\b\u0002\u0010n\u001a\u0004\u0018\u00010%¢\u0006\u0004\bo\u0010pJ3\u0010t\u001a\u00020L2\u0006\u0010r\u001a\u00020q2\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\n\b\u0002\u0010s\u001a\u0004\u0018\u00010*¢\u0006\u0004\bt\u0010uJ3\u0010y\u001a\u00020L2\u0006\u0010w\u001a\u00020v2\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\n\b\u0002\u0010x\u001a\u0004\u0018\u00010/¢\u0006\u0004\by\u0010zJ3\u0010~\u001a\u00020L2\u0006\u0010|\u001a\u00020{2\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\n\b\u0002\u0010}\u001a\u0004\u0018\u000104¢\u0006\u0004\b~\u0010\u007fJ9\u0010\u0083\u0001\u001a\u00020L2\b\u0010\u0081\u0001\u001a\u00030\u0080\u00012\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\u000b\b\u0002\u0010\u0082\u0001\u001a\u0004\u0018\u000109¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J9\u0010\u0088\u0001\u001a\u00020L2\b\u0010\u0086\u0001\u001a\u00030\u0085\u00012\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\u000b\b\u0002\u0010\u0087\u0001\u001a\u0004\u0018\u00010>¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J9\u0010\u008d\u0001\u001a\u00020L2\b\u0010\u008b\u0001\u001a\u00030\u008a\u00012\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\u000b\b\u0002\u0010\u008c\u0001\u001a\u0004\u0018\u00010C¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J,\u0010\u0091\u0001\u001a\u00020L2\b\u0010\u0090\u0001\u001a\u00030\u008f\u00012\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J8\u0010\u0097\u0001\u001a\u00020L2\b\u0010\u0094\u0001\u001a\u00030\u0093\u00012\b\u0010\u0096\u0001\u001a\u00030\u0095\u00012\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010JH\u0007¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u0010\u0010\u0099\u0001\u001a\u00020\b¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u0010\u0010\u009b\u0001\u001a\u00020\b¢\u0006\u0006\b\u009b\u0001\u0010\u009a\u0001J\u001a\u0010\u009e\u0001\u001a\u00020\b2\b\u0010\u009d\u0001\u001a\u00030\u009c\u0001¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J0\u0010¤\u0001\u001a\u00020\b2\u0007\u0010 \u0001\u001a\u00020\u00012\u0013\u0010£\u0001\u001a\u000e\u0012\t\u0012\u00070¢\u0001R\u00020\u00000¡\u0001H\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010¦\u0001R\u001e\u0010¨\u0001\u001a\t\u0012\u0004\u0012\u00020]0§\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R#\u0010£\u0001\u001a\u000e\u0012\t\u0012\u00070¢\u0001R\u00020\u00000§\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010©\u0001R0\u0010«\u0001\u001a\u000b\u0012\u0006\b\u0001\u0012\u00020L0ª\u00018\u0000X\u0081\u0004¢\u0006\u0018\n\u0006\b«\u0001\u0010¬\u0001\u0012\u0006\b¯\u0001\u0010\u009a\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001R#\u0010±\u0001\u001a\u000e\u0012\t\u0012\u00070°\u0001R\u00020\u00000§\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010©\u0001R0\u0010²\u0001\u001a\u000b\u0012\u0006\b\u0001\u0012\u00020L0ª\u00018\u0000X\u0081\u0004¢\u0006\u0018\n\u0006\b²\u0001\u0010¬\u0001\u0012\u0006\b´\u0001\u0010\u009a\u0001\u001a\u0006\b³\u0001\u0010®\u0001¨\u0006·\u0001"}, m65681d2 = {"Lcom/mapbox/maps/NativeObserver;", "", "Lcom/mapbox/maps/NativeMapImpl;", "observable", "<init>", "(Lcom/mapbox/maps/NativeMapImpl;)V", "Lnv/a;", "onCameraChangeListener", "Ll83/a0;", "addOnCameraChangeListener", "(Lnv/a;)V", "removeOnCameraChangeListener", "Lnv/d;", "onMapLoadedListener", "addOnMapLoadedListener", "(Lnv/d;)V", "removeOnMapLoadedListener", "Lnv/b;", "onMapIdleListener", "addOnMapIdleListener", "(Lnv/b;)V", "removeOnMapIdleListener", "Lnv/c;", "onMapLoadErrorListener", "addOnMapLoadErrorListener", "(Lnv/c;)V", "removeOnMapLoadErrorListener", "Lnv/m;", "onStyleLoadedListener", "addOnStyleLoadedListener", "(Lnv/m;)V", "removeOnStyleLoadedListener", "Lnv/j;", "onStyleDataLoadedListener", "addOnStyleDataLoadedListener", "(Lnv/j;)V", "removeOnStyleDataLoadedListener", "Lnv/h;", "onSourceDataLoadedListener", "addOnSourceDataLoadedListener", "(Lnv/h;)V", "removeOnSourceDataLoadedListener", "Lnv/g;", "onSourceAddedListener", "addOnSourceAddedListener", "(Lnv/g;)V", "removeOnSourceAddedListener", "Lnv/i;", "onSourceRemovedListener", "addOnSourceRemovedListener", "(Lnv/i;)V", "removeOnSourceRemovedListener", "Lnv/k;", "onStyleImageMissingListener", "addOnStyleImageMissingListener", "(Lnv/k;)V", "removeOnStyleImageMissingListener", "Lnv/l;", "onStyleImageUnusedListener", "addOnStyleImageUnusedListener", "(Lnv/l;)V", "removeOnStyleImageUnusedListener", "Lnv/f;", "onRenderFrameStartedListener", "addOnRenderFrameStartedListener", "(Lnv/f;)V", "removeOnRenderFrameStartedListener", "Lnv/e;", "onRenderFrameFinishedListener", "addOnRenderFrameFinishedListener", "(Lnv/e;)V", "removeOnRenderFrameFinishedListener", "Lcom/mapbox/maps/CameraChangedCallback;", "cameraChangedCallback", "Lkotlin/Function0;", "onCancel", "Lcom/mapbox/common/Cancelable;", "subscribeCameraChanged", "(Lcom/mapbox/maps/CameraChangedCallback;Lc93/a;Lnv/a;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/CameraChangedCoalescedCallback;", "cameraChangedCoalescedCallback", "subscribeCameraChangedCoalesced", "(Lcom/mapbox/maps/CameraChangedCoalescedCallback;Lc93/a;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/MapLoadedCallback;", "mapLoadedCallback", "mapLoadedListener", "subscribeMapLoaded", "(Lcom/mapbox/maps/MapLoadedCallback;Lc93/a;Lnv/d;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/MapIdleCallback;", "mapIdleCallback", "mapIdleListener", "subscribeMapIdle", "(Lcom/mapbox/maps/MapIdleCallback;Lc93/a;Lnv/b;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/MapLoadingErrorCallback;", "mapLoadingErrorCallback", "mapLoadingErrorListener", "subscribeMapLoadingError", "(Lcom/mapbox/maps/MapLoadingErrorCallback;Lc93/a;Lnv/c;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/StyleLoadedCallback;", "styleLoadedCallback", "styleLoadedListener", "subscribeStyleLoaded", "(Lcom/mapbox/maps/StyleLoadedCallback;Lc93/a;Lnv/m;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/StyleDataLoadedCallback;", "styleDataLoadedCallback", "styleDataLoadedListener", "subscribeStyleDataLoaded", "(Lcom/mapbox/maps/StyleDataLoadedCallback;Lc93/a;Lnv/j;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/SourceDataLoadedCallback;", "sourceDataLoadedCallback", "sourceDataLoadedListener", "subscribeSourceDataLoaded", "(Lcom/mapbox/maps/SourceDataLoadedCallback;Lc93/a;Lnv/h;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/SourceAddedCallback;", "sourceAddedCallback", "sourceAddedListener", "subscribeSourceAdded", "(Lcom/mapbox/maps/SourceAddedCallback;Lc93/a;Lnv/g;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/SourceRemovedCallback;", "sourceRemovedCallback", "sourceRemovedListener", "subscribeSourceRemoved", "(Lcom/mapbox/maps/SourceRemovedCallback;Lc93/a;Lnv/i;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/StyleImageMissingCallback;", "styleImageMissingCallback", "styleImageMissingListener", "subscribeStyleImageMissing", "(Lcom/mapbox/maps/StyleImageMissingCallback;Lc93/a;Lnv/k;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/StyleImageRemoveUnusedCallback;", "styleImageRemoveUnusedCallback", "styleImageUnusedListener", "subscribeStyleImageRemoveUnused", "(Lcom/mapbox/maps/StyleImageRemoveUnusedCallback;Lc93/a;Lnv/l;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/RenderFrameStartedCallback;", "renderFrameStartedCallback", "renderFrameStarted", "subscribeRenderFrameStarted", "(Lcom/mapbox/maps/RenderFrameStartedCallback;Lc93/a;Lnv/f;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/RenderFrameFinishedCallback;", "renderFrameFinishedCallback", "renderFrameFinishedListener", "subscribeRenderFrameFinished", "(Lcom/mapbox/maps/RenderFrameFinishedCallback;Lc93/a;Lnv/e;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/ResourceRequestCallback;", "resourceRequestCallback", "subscribeResourceRequest", "(Lcom/mapbox/maps/ResourceRequestCallback;Lc93/a;)Lcom/mapbox/common/Cancelable;", "", "eventName", "Lcom/mapbox/maps/GenericEventCallback;", "genericEventCallback", "subscribeGenericEvent", "(Ljava/lang/String;Lcom/mapbox/maps/GenericEventCallback;Lc93/a;)Lcom/mapbox/common/Cancelable;", "resubscribeStyleLoadListeners", "()V", "onDestroy", "Lcom/mapbox/maps/MapLoadingError;", "error", "sendMapLoadingError", "(Lcom/mapbox/maps/MapLoadingError;)V", "listener", "", "Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;", "cancelableSet", "unsubscribeListener", "(Ljava/lang/Object;Ljava/util/Set;)V", "Lcom/mapbox/maps/NativeMapImpl;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "mapLoadingErrorCallbackSet", "Ljava/util/concurrent/CopyOnWriteArraySet;", "", "_cancelableSet", "Ljava/util/Set;", "get_cancelableSet$maps_sdk_release", "()Ljava/util/Set;", "get_cancelableSet$maps_sdk_release$annotations", "Lcom/mapbox/maps/NativeObserver$ResubscribeExtendedCancelable;", "resubscribableSet", "_resubscribableSet", "get_resubscribableSet$maps_sdk_release", "get_resubscribableSet$maps_sdk_release$annotations", "ExtendedCancelable", "ResubscribeExtendedCancelable", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class NativeObserver {
    private final Set<? extends Cancelable> _cancelableSet;
    private final Set<? extends Cancelable> _resubscribableSet;
    private final CopyOnWriteArraySet<ExtendedCancelable> cancelableSet;
    private final CopyOnWriteArraySet<MapLoadingErrorCallback> mapLoadingErrorCallbackSet;
    private final NativeMapImpl observable;
    private final CopyOnWriteArraySet<ResubscribeExtendedCancelable> resubscribableSet;

    /* JADX INFO: renamed from: com.mapbox.maps.NativeObserver$subscribeMapLoadingError$1 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "invoke", "()V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C54851 extends AbstractC22680m implements InterfaceC4339a {
        final /* synthetic */ MapLoadingErrorCallback $mapLoadingErrorCallback;
        final /* synthetic */ InterfaceC4339a $onCancel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C54851(MapLoadingErrorCallback mapLoadingErrorCallback, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.$mapLoadingErrorCallback = mapLoadingErrorCallback;
            this.$onCancel = interfaceC4339a;
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134087invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134087invoke() {
            NativeObserver.this.mapLoadingErrorCallbackSet.remove(this.$mapLoadingErrorCallback);
            InterfaceC4339a interfaceC4339a = this.$onCancel;
            if (interfaceC4339a != null) {
                interfaceC4339a.invoke();
            }
        }
    }

    public NativeObserver(NativeMapImpl observable) {
        AbstractC22676k.m65750j(observable, "observable");
        this.observable = observable;
        this.mapLoadingErrorCallbackSet = new CopyOnWriteArraySet<>();
        CopyOnWriteArraySet<ExtendedCancelable> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        this.cancelableSet = copyOnWriteArraySet;
        this._cancelableSet = copyOnWriteArraySet;
        CopyOnWriteArraySet<ResubscribeExtendedCancelable> copyOnWriteArraySet2 = new CopyOnWriteArraySet<>();
        this.resubscribableSet = copyOnWriteArraySet2;
        this._resubscribableSet = copyOnWriteArraySet2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnCameraChangeListener$lambda$2(InterfaceC27150a onCameraChangeListener, CameraChanged it) {
        AbstractC22676k.m65750j(onCameraChangeListener, "$onCameraChangeListener");
        AbstractC22676k.m65750j(it, "it");
        it.getTimestamp().getTime();
        it.getTimestamp().getTime();
        onCameraChangeListener.m81642a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnMapIdleListener$lambda$4(InterfaceC27151b onMapIdleListener, MapIdle it) {
        AbstractC22676k.m65750j(onMapIdleListener, "$onMapIdleListener");
        AbstractC22676k.m65750j(it, "it");
        it.getTimestamp().getTime();
        it.getTimestamp().getTime();
        onMapIdleListener.m81643a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnMapLoadErrorListener$lambda$5(InterfaceC27152c onMapLoadErrorListener, MapLoadingError it) {
        AbstractC22676k.m65750j(onMapLoadErrorListener, "$onMapLoadErrorListener");
        AbstractC22676k.m65750j(it, "it");
        long time = it.getTimestamp().getTime();
        Long lValueOf = Long.valueOf(it.getTimestamp().getTime());
        EnumC34176c enumC34176cValueOf = EnumC34176c.valueOf(it.getType().name());
        String message = it.getMessage();
        AbstractC22676k.m65749i(message, "this.message");
        String sourceId = it.getSourceId();
        CanonicalTileID tileId = it.getTileId();
        new C33000d(time, lValueOf, enumC34176cValueOf, message, sourceId, tileId != null ? new C34186m(tileId.getZ(), tileId.getX(), tileId.getY()) : null);
        onMapLoadErrorListener.m81644a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnMapLoadedListener$lambda$3(InterfaceC27153d onMapLoadedListener, MapLoaded it) {
        AbstractC22676k.m65750j(onMapLoadedListener, "$onMapLoadedListener");
        AbstractC22676k.m65750j(it, "it");
        it.getTimeInterval().getBegin().getTime();
        it.getTimeInterval().getEnd().getTime();
        onMapLoadedListener.m81645a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnRenderFrameFinishedListener$lambda$14(InterfaceC27154e onRenderFrameFinishedListener, RenderFrameFinished it) {
        AbstractC22676k.m65750j(onRenderFrameFinishedListener, "$onRenderFrameFinishedListener");
        AbstractC22676k.m65750j(it, "it");
        new C33001e(it.getTimeInterval().getBegin().getTime(), Long.valueOf(it.getTimeInterval().getEnd().getTime()), EnumC34177d.valueOf(it.getRenderMode().name()), it.getNeedsRepaint(), it.getPlacementChanged());
        onRenderFrameFinishedListener.m81646a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnRenderFrameStartedListener$lambda$13(InterfaceC27155f onRenderFrameStartedListener, RenderFrameStarted it) {
        AbstractC22676k.m65750j(onRenderFrameStartedListener, "$onRenderFrameStartedListener");
        AbstractC22676k.m65750j(it, "it");
        it.getTimestamp().getTime();
        it.getTimestamp().getTime();
        onRenderFrameStartedListener.m81647a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnSourceAddedListener$lambda$9(InterfaceC27156g onSourceAddedListener, SourceAdded it) {
        AbstractC22676k.m65750j(onSourceAddedListener, "$onSourceAddedListener");
        AbstractC22676k.m65750j(it, "it");
        it.getTimestamp().getTime();
        it.getTimestamp().getTime();
        AbstractC22676k.m65749i(it.getSourceId(), "this.sourceId");
        onSourceAddedListener.m81648a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnSourceDataLoadedListener$lambda$8(InterfaceC27157h onSourceDataLoadedListener, SourceDataLoaded it) {
        AbstractC22676k.m65750j(onSourceDataLoadedListener, "$onSourceDataLoadedListener");
        AbstractC22676k.m65750j(it, "it");
        long time = it.getTimeInterval().getBegin().getTime();
        Long lValueOf = Long.valueOf(it.getTimeInterval().getEnd().getTime());
        String sourceId = it.getSourceId();
        AbstractC22676k.m65749i(sourceId, "this.sourceId");
        EnumC34184k enumC34184kValueOf = EnumC34184k.valueOf(it.getType().name());
        Boolean loaded = it.getLoaded();
        CanonicalTileID tileId = it.getTileId();
        new C33005i(time, lValueOf, sourceId, enumC34184kValueOf, loaded, tileId != null ? new C34186m(tileId.getZ(), tileId.getX(), tileId.getY()) : null);
        onSourceDataLoadedListener.m81649a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnSourceRemovedListener$lambda$10(InterfaceC27158i onSourceRemovedListener, SourceRemoved it) {
        AbstractC22676k.m65750j(onSourceRemovedListener, "$onSourceRemovedListener");
        AbstractC22676k.m65750j(it, "it");
        it.getTimestamp().getTime();
        it.getTimestamp().getTime();
        AbstractC22676k.m65749i(it.getSourceId(), "this.sourceId");
        onSourceRemovedListener.m81650a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnStyleDataLoadedListener$lambda$7(InterfaceC27159j onStyleDataLoadedListener, StyleDataLoaded it) {
        AbstractC22676k.m65750j(onStyleDataLoadedListener, "$onStyleDataLoadedListener");
        AbstractC22676k.m65750j(it, "it");
        new C33007k(it.getTimeInterval().getBegin().getTime(), Long.valueOf(it.getTimeInterval().getEnd().getTime()), EnumC34185l.valueOf(it.getType().name()));
        onStyleDataLoadedListener.m81651a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnStyleImageMissingListener$lambda$11(InterfaceC27160k onStyleImageMissingListener, StyleImageMissing it) {
        AbstractC22676k.m65750j(onStyleImageMissingListener, "$onStyleImageMissingListener");
        AbstractC22676k.m65750j(it, "it");
        it.getTimestamp().getTime();
        it.getTimestamp().getTime();
        AbstractC22676k.m65749i(it.getImageId(), "this.imageId");
        onStyleImageMissingListener.m81652a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnStyleImageUnusedListener$lambda$12(InterfaceC27161l onStyleImageUnusedListener, StyleImageRemoveUnused it) {
        AbstractC22676k.m65750j(onStyleImageUnusedListener, "$onStyleImageUnusedListener");
        AbstractC22676k.m65750j(it, "it");
        it.getTimestamp().getTime();
        it.getTimestamp().getTime();
        AbstractC22676k.m65749i(it.getImageId(), "this.imageId");
        onStyleImageUnusedListener.m81653a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnStyleLoadedListener$lambda$6(InterfaceC27162m onStyleLoadedListener, StyleLoaded it) {
        AbstractC22676k.m65750j(onStyleLoadedListener, "$onStyleLoadedListener");
        AbstractC22676k.m65750j(it, "it");
        it.getTimeInterval().getBegin().getTime();
        it.getTimeInterval().getEnd().getTime();
        onStyleLoadedListener.m81654a();
    }

    public static /* synthetic */ void get_cancelableSet$maps_sdk_release$annotations() {
    }

    public static /* synthetic */ void get_resubscribableSet$maps_sdk_release$annotations() {
    }

    public static /* synthetic */ Cancelable subscribeCameraChanged$default(NativeObserver nativeObserver, CameraChangedCallback cameraChangedCallback, InterfaceC4339a interfaceC4339a, InterfaceC27150a interfaceC27150a, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            interfaceC4339a = null;
        }
        if ((i13 & 4) != 0) {
            interfaceC27150a = null;
        }
        return nativeObserver.subscribeCameraChanged(cameraChangedCallback, interfaceC4339a, interfaceC27150a);
    }

    public static /* synthetic */ Cancelable subscribeCameraChangedCoalesced$default(NativeObserver nativeObserver, CameraChangedCoalescedCallback cameraChangedCoalescedCallback, InterfaceC4339a interfaceC4339a, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            interfaceC4339a = null;
        }
        return nativeObserver.subscribeCameraChangedCoalesced(cameraChangedCoalescedCallback, interfaceC4339a);
    }

    public static /* synthetic */ Cancelable subscribeGenericEvent$default(NativeObserver nativeObserver, String str, GenericEventCallback genericEventCallback, InterfaceC4339a interfaceC4339a, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            interfaceC4339a = null;
        }
        return nativeObserver.subscribeGenericEvent(str, genericEventCallback, interfaceC4339a);
    }

    public static /* synthetic */ Cancelable subscribeMapIdle$default(NativeObserver nativeObserver, MapIdleCallback mapIdleCallback, InterfaceC4339a interfaceC4339a, InterfaceC27151b interfaceC27151b, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            interfaceC4339a = null;
        }
        if ((i13 & 4) != 0) {
            interfaceC27151b = null;
        }
        return nativeObserver.subscribeMapIdle(mapIdleCallback, interfaceC4339a, interfaceC27151b);
    }

    public static /* synthetic */ Cancelable subscribeMapLoaded$default(NativeObserver nativeObserver, MapLoadedCallback mapLoadedCallback, InterfaceC4339a interfaceC4339a, InterfaceC27153d interfaceC27153d, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            interfaceC4339a = null;
        }
        if ((i13 & 4) != 0) {
            interfaceC27153d = null;
        }
        return nativeObserver.subscribeMapLoaded(mapLoadedCallback, interfaceC4339a, interfaceC27153d);
    }

    public static /* synthetic */ Cancelable subscribeMapLoadingError$default(NativeObserver nativeObserver, MapLoadingErrorCallback mapLoadingErrorCallback, InterfaceC4339a interfaceC4339a, InterfaceC27152c interfaceC27152c, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            interfaceC4339a = null;
        }
        if ((i13 & 4) != 0) {
            interfaceC27152c = null;
        }
        return nativeObserver.subscribeMapLoadingError(mapLoadingErrorCallback, interfaceC4339a, interfaceC27152c);
    }

    public static /* synthetic */ Cancelable subscribeRenderFrameFinished$default(NativeObserver nativeObserver, RenderFrameFinishedCallback renderFrameFinishedCallback, InterfaceC4339a interfaceC4339a, InterfaceC27154e interfaceC27154e, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            interfaceC4339a = null;
        }
        if ((i13 & 4) != 0) {
            interfaceC27154e = null;
        }
        return nativeObserver.subscribeRenderFrameFinished(renderFrameFinishedCallback, interfaceC4339a, interfaceC27154e);
    }

    public static /* synthetic */ Cancelable subscribeRenderFrameStarted$default(NativeObserver nativeObserver, RenderFrameStartedCallback renderFrameStartedCallback, InterfaceC4339a interfaceC4339a, InterfaceC27155f interfaceC27155f, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            interfaceC4339a = null;
        }
        if ((i13 & 4) != 0) {
            interfaceC27155f = null;
        }
        return nativeObserver.subscribeRenderFrameStarted(renderFrameStartedCallback, interfaceC4339a, interfaceC27155f);
    }

    public static /* synthetic */ Cancelable subscribeResourceRequest$default(NativeObserver nativeObserver, ResourceRequestCallback resourceRequestCallback, InterfaceC4339a interfaceC4339a, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            interfaceC4339a = null;
        }
        return nativeObserver.subscribeResourceRequest(resourceRequestCallback, interfaceC4339a);
    }

    public static /* synthetic */ Cancelable subscribeSourceAdded$default(NativeObserver nativeObserver, SourceAddedCallback sourceAddedCallback, InterfaceC4339a interfaceC4339a, InterfaceC27156g interfaceC27156g, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            interfaceC4339a = null;
        }
        if ((i13 & 4) != 0) {
            interfaceC27156g = null;
        }
        return nativeObserver.subscribeSourceAdded(sourceAddedCallback, interfaceC4339a, interfaceC27156g);
    }

    public static /* synthetic */ Cancelable subscribeSourceDataLoaded$default(NativeObserver nativeObserver, SourceDataLoadedCallback sourceDataLoadedCallback, InterfaceC4339a interfaceC4339a, InterfaceC27157h interfaceC27157h, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            interfaceC4339a = null;
        }
        if ((i13 & 4) != 0) {
            interfaceC27157h = null;
        }
        return nativeObserver.subscribeSourceDataLoaded(sourceDataLoadedCallback, interfaceC4339a, interfaceC27157h);
    }

    public static /* synthetic */ Cancelable subscribeSourceRemoved$default(NativeObserver nativeObserver, SourceRemovedCallback sourceRemovedCallback, InterfaceC4339a interfaceC4339a, InterfaceC27158i interfaceC27158i, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            interfaceC4339a = null;
        }
        if ((i13 & 4) != 0) {
            interfaceC27158i = null;
        }
        return nativeObserver.subscribeSourceRemoved(sourceRemovedCallback, interfaceC4339a, interfaceC27158i);
    }

    public static /* synthetic */ Cancelable subscribeStyleDataLoaded$default(NativeObserver nativeObserver, StyleDataLoadedCallback styleDataLoadedCallback, InterfaceC4339a interfaceC4339a, InterfaceC27159j interfaceC27159j, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            interfaceC4339a = null;
        }
        if ((i13 & 4) != 0) {
            interfaceC27159j = null;
        }
        return nativeObserver.subscribeStyleDataLoaded(styleDataLoadedCallback, interfaceC4339a, interfaceC27159j);
    }

    public static /* synthetic */ Cancelable subscribeStyleImageMissing$default(NativeObserver nativeObserver, StyleImageMissingCallback styleImageMissingCallback, InterfaceC4339a interfaceC4339a, InterfaceC27160k interfaceC27160k, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            interfaceC4339a = null;
        }
        if ((i13 & 4) != 0) {
            interfaceC27160k = null;
        }
        return nativeObserver.subscribeStyleImageMissing(styleImageMissingCallback, interfaceC4339a, interfaceC27160k);
    }

    public static /* synthetic */ Cancelable subscribeStyleImageRemoveUnused$default(NativeObserver nativeObserver, StyleImageRemoveUnusedCallback styleImageRemoveUnusedCallback, InterfaceC4339a interfaceC4339a, InterfaceC27161l interfaceC27161l, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            interfaceC4339a = null;
        }
        if ((i13 & 4) != 0) {
            interfaceC27161l = null;
        }
        return nativeObserver.subscribeStyleImageRemoveUnused(styleImageRemoveUnusedCallback, interfaceC4339a, interfaceC27161l);
    }

    public static /* synthetic */ Cancelable subscribeStyleLoaded$default(NativeObserver nativeObserver, StyleLoadedCallback styleLoadedCallback, InterfaceC4339a interfaceC4339a, InterfaceC27162m interfaceC27162m, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            interfaceC4339a = null;
        }
        if ((i13 & 4) != 0) {
            interfaceC27162m = null;
        }
        return nativeObserver.subscribeStyleLoaded(styleLoadedCallback, interfaceC4339a, interfaceC27162m);
    }

    private final void unsubscribeListener(Object listener, Set<? extends ExtendedCancelable> cancelableSet) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : cancelableSet) {
            if (AbstractC22676k.m65745e(((ExtendedCancelable) obj).getListener(), listener)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ExtendedCancelable) it.next()).cancel();
        }
    }

    @InterfaceC23457c
    public final void addOnCameraChangeListener(InterfaceC27150a onCameraChangeListener) {
        AbstractC22676k.m65750j(onCameraChangeListener, "onCameraChangeListener");
        subscribeCameraChanged$default(this, new C5538l(2), null, onCameraChangeListener, 2, null);
    }

    @InterfaceC23457c
    public final void addOnMapIdleListener(InterfaceC27151b onMapIdleListener) {
        AbstractC22676k.m65750j(onMapIdleListener, "onMapIdleListener");
        subscribeMapIdle$default(this, new C4316g(25), null, onMapIdleListener, 2, null);
    }

    @InterfaceC23457c
    public final void addOnMapLoadErrorListener(InterfaceC27152c onMapLoadErrorListener) {
        AbstractC22676k.m65750j(onMapLoadErrorListener, "onMapLoadErrorListener");
        subscribeMapLoadingError$default(this, new C5539m(), null, onMapLoadErrorListener, 2, null);
    }

    @InterfaceC23457c
    public final void addOnMapLoadedListener(InterfaceC27153d onMapLoadedListener) {
        AbstractC22676k.m65750j(onMapLoadedListener, "onMapLoadedListener");
        subscribeMapLoaded$default(this, new C4316g(27), null, onMapLoadedListener, 2, null);
    }

    @InterfaceC23457c
    public final void addOnRenderFrameFinishedListener(InterfaceC27154e onRenderFrameFinishedListener) {
        AbstractC22676k.m65750j(onRenderFrameFinishedListener, "onRenderFrameFinishedListener");
        subscribeRenderFrameFinished$default(this, new C4316g(29), null, onRenderFrameFinishedListener, 2, null);
    }

    @InterfaceC23457c
    public final void addOnRenderFrameStartedListener(InterfaceC27155f onRenderFrameStartedListener) {
        AbstractC22676k.m65750j(onRenderFrameStartedListener, "onRenderFrameStartedListener");
        subscribeRenderFrameStarted$default(this, new C5538l(3), null, onRenderFrameStartedListener, 2, null);
    }

    @InterfaceC23457c
    public final void addOnSourceAddedListener(InterfaceC27156g onSourceAddedListener) {
        AbstractC22676k.m65750j(onSourceAddedListener, "onSourceAddedListener");
        subscribeSourceAdded$default(this, new C5538l(5), null, onSourceAddedListener, 2, null);
    }

    @InterfaceC23457c
    public final void addOnSourceDataLoadedListener(InterfaceC27157h onSourceDataLoadedListener) {
        AbstractC22676k.m65750j(onSourceDataLoadedListener, "onSourceDataLoadedListener");
        subscribeSourceDataLoaded$default(this, new C5538l(6), null, onSourceDataLoadedListener, 2, null);
    }

    @InterfaceC23457c
    public final void addOnSourceRemovedListener(InterfaceC27158i onSourceRemovedListener) {
        AbstractC22676k.m65750j(onSourceRemovedListener, "onSourceRemovedListener");
        subscribeSourceRemoved$default(this, new C5538l(0), null, onSourceRemovedListener, 2, null);
    }

    @InterfaceC23457c
    public final void addOnStyleDataLoadedListener(InterfaceC27159j onStyleDataLoadedListener) {
        AbstractC22676k.m65750j(onStyleDataLoadedListener, "onStyleDataLoadedListener");
        subscribeStyleDataLoaded$default(this, new C5538l(1), null, onStyleDataLoadedListener, 2, null);
    }

    @InterfaceC23457c
    public final void addOnStyleImageMissingListener(InterfaceC27160k onStyleImageMissingListener) {
        AbstractC22676k.m65750j(onStyleImageMissingListener, "onStyleImageMissingListener");
        subscribeStyleImageMissing$default(this, new C4316g(26), null, onStyleImageMissingListener, 2, null);
    }

    @InterfaceC23457c
    public final void addOnStyleImageUnusedListener(InterfaceC27161l onStyleImageUnusedListener) {
        AbstractC22676k.m65750j(onStyleImageUnusedListener, "onStyleImageUnusedListener");
        subscribeStyleImageRemoveUnused$default(this, new C4316g(28), null, onStyleImageUnusedListener, 2, null);
    }

    @InterfaceC23457c
    public final void addOnStyleLoadedListener(InterfaceC27162m onStyleLoadedListener) {
        AbstractC22676k.m65750j(onStyleLoadedListener, "onStyleLoadedListener");
        subscribeStyleLoaded$default(this, new C5538l(4), null, onStyleLoadedListener, 2, null);
    }

    public final Set<? extends Cancelable> get_cancelableSet$maps_sdk_release() {
        return this._cancelableSet;
    }

    public final Set<? extends Cancelable> get_resubscribableSet$maps_sdk_release() {
        return this._resubscribableSet;
    }

    public final void onDestroy() {
        Iterator<T> it = this.cancelableSet.iterator();
        while (it.hasNext()) {
            ((Cancelable) it.next()).cancel();
        }
        Iterator<T> it3 = this.resubscribableSet.iterator();
        while (it3.hasNext()) {
            ((Cancelable) it3.next()).cancel();
        }
    }

    @InterfaceC23457c
    public final void removeOnCameraChangeListener(InterfaceC27150a onCameraChangeListener) {
        AbstractC22676k.m65750j(onCameraChangeListener, "onCameraChangeListener");
        unsubscribeListener(onCameraChangeListener, this.cancelableSet);
    }

    @InterfaceC23457c
    public final void removeOnMapIdleListener(InterfaceC27151b onMapIdleListener) {
        AbstractC22676k.m65750j(onMapIdleListener, "onMapIdleListener");
        unsubscribeListener(onMapIdleListener, this.cancelableSet);
    }

    @InterfaceC23457c
    public final void removeOnMapLoadErrorListener(InterfaceC27152c onMapLoadErrorListener) {
        AbstractC22676k.m65750j(onMapLoadErrorListener, "onMapLoadErrorListener");
        unsubscribeListener(onMapLoadErrorListener, this.cancelableSet);
    }

    @InterfaceC23457c
    public final void removeOnMapLoadedListener(InterfaceC27153d onMapLoadedListener) {
        AbstractC22676k.m65750j(onMapLoadedListener, "onMapLoadedListener");
        unsubscribeListener(onMapLoadedListener, this.cancelableSet);
    }

    @InterfaceC23457c
    public final void removeOnRenderFrameFinishedListener(InterfaceC27154e onRenderFrameFinishedListener) {
        AbstractC22676k.m65750j(onRenderFrameFinishedListener, "onRenderFrameFinishedListener");
        unsubscribeListener(onRenderFrameFinishedListener, this.cancelableSet);
    }

    @InterfaceC23457c
    public final void removeOnRenderFrameStartedListener(InterfaceC27155f onRenderFrameStartedListener) {
        AbstractC22676k.m65750j(onRenderFrameStartedListener, "onRenderFrameStartedListener");
        unsubscribeListener(onRenderFrameStartedListener, this.cancelableSet);
    }

    @InterfaceC23457c
    public final void removeOnSourceAddedListener(InterfaceC27156g onSourceAddedListener) {
        AbstractC22676k.m65750j(onSourceAddedListener, "onSourceAddedListener");
        unsubscribeListener(onSourceAddedListener, this.cancelableSet);
    }

    @InterfaceC23457c
    public final void removeOnSourceDataLoadedListener(InterfaceC27157h onSourceDataLoadedListener) {
        AbstractC22676k.m65750j(onSourceDataLoadedListener, "onSourceDataLoadedListener");
        unsubscribeListener(onSourceDataLoadedListener, this.cancelableSet);
    }

    @InterfaceC23457c
    public final void removeOnSourceRemovedListener(InterfaceC27158i onSourceRemovedListener) {
        AbstractC22676k.m65750j(onSourceRemovedListener, "onSourceRemovedListener");
        unsubscribeListener(onSourceRemovedListener, this.cancelableSet);
    }

    @InterfaceC23457c
    public final void removeOnStyleDataLoadedListener(InterfaceC27159j onStyleDataLoadedListener) {
        AbstractC22676k.m65750j(onStyleDataLoadedListener, "onStyleDataLoadedListener");
        unsubscribeListener(onStyleDataLoadedListener, this.resubscribableSet);
    }

    @InterfaceC23457c
    public final void removeOnStyleImageMissingListener(InterfaceC27160k onStyleImageMissingListener) {
        AbstractC22676k.m65750j(onStyleImageMissingListener, "onStyleImageMissingListener");
        unsubscribeListener(onStyleImageMissingListener, this.cancelableSet);
    }

    @InterfaceC23457c
    public final void removeOnStyleImageUnusedListener(InterfaceC27161l onStyleImageUnusedListener) {
        AbstractC22676k.m65750j(onStyleImageUnusedListener, "onStyleImageUnusedListener");
        unsubscribeListener(onStyleImageUnusedListener, this.cancelableSet);
    }

    @InterfaceC23457c
    public final void removeOnStyleLoadedListener(InterfaceC27162m onStyleLoadedListener) {
        AbstractC22676k.m65750j(onStyleLoadedListener, "onStyleLoadedListener");
        unsubscribeListener(onStyleLoadedListener, this.resubscribableSet);
    }

    public final void resubscribeStyleLoadListeners() {
        Iterator<T> it = this.resubscribableSet.iterator();
        while (it.hasNext()) {
            ((ResubscribeExtendedCancelable) it.next()).resubscribe();
        }
    }

    public final void sendMapLoadingError(MapLoadingError error) {
        AbstractC22676k.m65750j(error, "error");
        Iterator<T> it = this.mapLoadingErrorCallbackSet.iterator();
        while (it.hasNext()) {
            ((MapLoadingErrorCallback) it.next()).run(error);
        }
    }

    public final Cancelable subscribeCameraChanged(CameraChangedCallback cameraChangedCallback, InterfaceC4339a onCancel, InterfaceC27150a onCameraChangeListener) {
        AbstractC22676k.m65750j(cameraChangedCallback, "cameraChangedCallback");
        return new ExtendedCancelable(this, this.observable.subscribe(cameraChangedCallback), onCancel, null, onCameraChangeListener, 4, null);
    }

    public final Cancelable subscribeCameraChangedCoalesced(CameraChangedCoalescedCallback cameraChangedCoalescedCallback, InterfaceC4339a onCancel) {
        AbstractC22676k.m65750j(cameraChangedCoalescedCallback, "cameraChangedCoalescedCallback");
        return new ExtendedCancelable(this, this.observable.subscribe(cameraChangedCoalescedCallback), onCancel, null, null, 12, null);
    }

    @MapboxExperimental
    public final Cancelable subscribeGenericEvent(String eventName, GenericEventCallback genericEventCallback, InterfaceC4339a onCancel) {
        AbstractC22676k.m65750j(eventName, "eventName");
        AbstractC22676k.m65750j(genericEventCallback, "genericEventCallback");
        return new ExtendedCancelable(this, this.observable.subscribe(eventName, genericEventCallback), onCancel, null, null, 12, null);
    }

    public final Cancelable subscribeMapIdle(MapIdleCallback mapIdleCallback, InterfaceC4339a onCancel, InterfaceC27151b mapIdleListener) {
        AbstractC22676k.m65750j(mapIdleCallback, "mapIdleCallback");
        return new ExtendedCancelable(this, this.observable.subscribe(mapIdleCallback), onCancel, null, mapIdleListener, 4, null);
    }

    public final Cancelable subscribeMapLoaded(MapLoadedCallback mapLoadedCallback, InterfaceC4339a onCancel, InterfaceC27153d mapLoadedListener) {
        AbstractC22676k.m65750j(mapLoadedCallback, "mapLoadedCallback");
        return new ExtendedCancelable(this, this.observable.subscribe(mapLoadedCallback), onCancel, null, mapLoadedListener, 4, null);
    }

    public final Cancelable subscribeMapLoadingError(MapLoadingErrorCallback mapLoadingErrorCallback, InterfaceC4339a onCancel, InterfaceC27152c mapLoadingErrorListener) {
        AbstractC22676k.m65750j(mapLoadingErrorCallback, "mapLoadingErrorCallback");
        this.mapLoadingErrorCallbackSet.add(mapLoadingErrorCallback);
        return new ExtendedCancelable(this, this.observable.subscribe(mapLoadingErrorCallback), new C54851(mapLoadingErrorCallback, onCancel), null, mapLoadingErrorListener, 4, null);
    }

    public final Cancelable subscribeRenderFrameFinished(RenderFrameFinishedCallback renderFrameFinishedCallback, InterfaceC4339a onCancel, InterfaceC27154e renderFrameFinishedListener) {
        AbstractC22676k.m65750j(renderFrameFinishedCallback, "renderFrameFinishedCallback");
        return new ExtendedCancelable(this, this.observable.subscribe(renderFrameFinishedCallback), onCancel, null, renderFrameFinishedListener, 4, null);
    }

    public final Cancelable subscribeRenderFrameStarted(RenderFrameStartedCallback renderFrameStartedCallback, InterfaceC4339a onCancel, InterfaceC27155f renderFrameStarted) {
        AbstractC22676k.m65750j(renderFrameStartedCallback, "renderFrameStartedCallback");
        return new ExtendedCancelable(this, this.observable.subscribe(renderFrameStartedCallback), onCancel, null, renderFrameStarted, 4, null);
    }

    public final Cancelable subscribeResourceRequest(ResourceRequestCallback resourceRequestCallback, InterfaceC4339a onCancel) {
        AbstractC22676k.m65750j(resourceRequestCallback, "resourceRequestCallback");
        return new ExtendedCancelable(this, this.observable.subscribe(resourceRequestCallback), onCancel, null, null, 12, null);
    }

    public final Cancelable subscribeSourceAdded(SourceAddedCallback sourceAddedCallback, InterfaceC4339a onCancel, InterfaceC27156g sourceAddedListener) {
        AbstractC22676k.m65750j(sourceAddedCallback, "sourceAddedCallback");
        return new ExtendedCancelable(this, this.observable.subscribe(sourceAddedCallback), onCancel, null, sourceAddedListener, 4, null);
    }

    public final Cancelable subscribeSourceDataLoaded(SourceDataLoadedCallback sourceDataLoadedCallback, InterfaceC4339a onCancel, InterfaceC27157h sourceDataLoadedListener) {
        AbstractC22676k.m65750j(sourceDataLoadedCallback, "sourceDataLoadedCallback");
        return new ExtendedCancelable(this, this.observable.subscribe(sourceDataLoadedCallback), onCancel, null, sourceDataLoadedListener, 4, null);
    }

    public final Cancelable subscribeSourceRemoved(SourceRemovedCallback sourceRemovedCallback, InterfaceC4339a onCancel, InterfaceC27158i sourceRemovedListener) {
        AbstractC22676k.m65750j(sourceRemovedCallback, "sourceRemovedCallback");
        return new ExtendedCancelable(this, this.observable.subscribe(sourceRemovedCallback), onCancel, null, sourceRemovedListener, 4, null);
    }

    public final Cancelable subscribeStyleDataLoaded(StyleDataLoadedCallback styleDataLoadedCallback, InterfaceC4339a onCancel, InterfaceC27159j styleDataLoadedListener) {
        AbstractC22676k.m65750j(styleDataLoadedCallback, "styleDataLoadedCallback");
        NativeObserver$subscribeStyleDataLoaded$resubscriber$1 nativeObserver$subscribeStyleDataLoaded$resubscriber$1 = new NativeObserver$subscribeStyleDataLoaded$resubscriber$1(this, styleDataLoadedCallback);
        return new ResubscribeExtendedCancelable(this, nativeObserver$subscribeStyleDataLoaded$resubscriber$1, (Cancelable) nativeObserver$subscribeStyleDataLoaded$resubscriber$1.invoke(), this.resubscribableSet, onCancel, styleDataLoadedListener);
    }

    public final Cancelable subscribeStyleImageMissing(StyleImageMissingCallback styleImageMissingCallback, InterfaceC4339a onCancel, InterfaceC27160k styleImageMissingListener) {
        AbstractC22676k.m65750j(styleImageMissingCallback, "styleImageMissingCallback");
        return new ExtendedCancelable(this, this.observable.subscribe(styleImageMissingCallback), onCancel, null, styleImageMissingListener, 4, null);
    }

    public final Cancelable subscribeStyleImageRemoveUnused(StyleImageRemoveUnusedCallback styleImageRemoveUnusedCallback, InterfaceC4339a onCancel, InterfaceC27161l styleImageUnusedListener) {
        AbstractC22676k.m65750j(styleImageRemoveUnusedCallback, "styleImageRemoveUnusedCallback");
        return new ExtendedCancelable(this, this.observable.subscribe(styleImageRemoveUnusedCallback), onCancel, null, styleImageUnusedListener, 4, null);
    }

    public final Cancelable subscribeStyleLoaded(StyleLoadedCallback styleLoadedCallback, InterfaceC4339a onCancel, InterfaceC27162m styleLoadedListener) {
        AbstractC22676k.m65750j(styleLoadedCallback, "styleLoadedCallback");
        NativeObserver$subscribeStyleLoaded$resubscriber$1 nativeObserver$subscribeStyleLoaded$resubscriber$1 = new NativeObserver$subscribeStyleLoaded$resubscriber$1(this, styleLoadedCallback);
        return new ResubscribeExtendedCancelable(this, nativeObserver$subscribeStyleLoaded$resubscriber$1, (Cancelable) nativeObserver$subscribeStyleLoaded$resubscriber$1.invoke(), this.resubscribableSet, onCancel, styleLoadedListener);
    }

    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002BM\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0010\u0010\b\u001a\f\u0012\b\u0012\u00060\u0000R\u00020\u00020\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\"\u0010\u0006\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lcom/mapbox/maps/NativeObserver$ResubscribeExtendedCancelable;", "Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;", "Lcom/mapbox/maps/NativeObserver;", "Lkotlin/Function0;", "Lcom/mapbox/common/Cancelable;", "resubscriber", "originalCancelable", "", "cancelableSet", "Ll83/a0;", "onCancel", "", "listener", "<init>", "(Lcom/mapbox/maps/NativeObserver;Lc93/a;Lcom/mapbox/common/Cancelable;Ljava/util/Set;Lc93/a;Ljava/lang/Object;)V", "resubscribe", "()V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lc93/a;", "Lcom/mapbox/common/Cancelable;", "getOriginalCancelable", "()Lcom/mapbox/common/Cancelable;", "setOriginalCancelable", "(Lcom/mapbox/common/Cancelable;)V", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public final class ResubscribeExtendedCancelable extends ExtendedCancelable {
        private Cancelable originalCancelable;
        private final InterfaceC4339a resubscriber;
        final /* synthetic */ NativeObserver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResubscribeExtendedCancelable(NativeObserver nativeObserver, InterfaceC4339a resubscriber, Cancelable originalCancelable, Set<ResubscribeExtendedCancelable> cancelableSet, InterfaceC4339a interfaceC4339a, Object obj) {
            super(nativeObserver, originalCancelable, interfaceC4339a, AbstractC22681m0.m65773d(cancelableSet), obj);
            AbstractC22676k.m65750j(resubscriber, "resubscriber");
            AbstractC22676k.m65750j(originalCancelable, "originalCancelable");
            AbstractC22676k.m65750j(cancelableSet, "cancelableSet");
            this.this$0 = nativeObserver;
            this.resubscriber = resubscriber;
            this.originalCancelable = originalCancelable;
        }

        @Override // com.mapbox.maps.NativeObserver.ExtendedCancelable
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!ResubscribeExtendedCancelable.class.equals(other != null ? other.getClass() : null) || !super.equals(other)) {
                return false;
            }
            AbstractC22676k.m65748h(other, "null cannot be cast to non-null type com.mapbox.maps.NativeObserver.ResubscribeExtendedCancelable");
            return AbstractC22676k.m65745e(this.resubscriber, ((ResubscribeExtendedCancelable) other).resubscriber);
        }

        @Override // com.mapbox.maps.NativeObserver.ExtendedCancelable
        public Cancelable getOriginalCancelable() {
            return this.originalCancelable;
        }

        @Override // com.mapbox.maps.NativeObserver.ExtendedCancelable
        public int hashCode() {
            return Objects.hash(Integer.valueOf(super.hashCode()), this.resubscriber);
        }

        public final void resubscribe() {
            getOriginalCancelable().cancel();
            setOriginalCancelable((Cancelable) this.resubscriber.invoke());
        }

        public void setOriginalCancelable(Cancelable cancelable) {
            AbstractC22676k.m65750j(cancelable, "<set-?>");
            this.originalCancelable = cancelable;
        }

        public /* synthetic */ ResubscribeExtendedCancelable(NativeObserver nativeObserver, InterfaceC4339a interfaceC4339a, Cancelable cancelable, Set set, InterfaceC4339a interfaceC4339a2, Object obj, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(nativeObserver, interfaceC4339a, cancelable, set, (i13 & 8) != 0 ? null : interfaceC4339a2, (i13 & 16) != 0 ? null : obj);
        }
    }

    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0092\u0004\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\b\u001a\f\u0012\b\u0012\u00060\u0000R\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0002\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\b\u001a\f\u0012\b\u0012\u00060\u0000R\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;", "Lcom/mapbox/common/Cancelable;", "originalCancelable", "Lkotlin/Function0;", "Ll83/a0;", "onCancel", "", "Lcom/mapbox/maps/NativeObserver;", "cancelableSet", "", "listener", "<init>", "(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/common/Cancelable;Lc93/a;Ljava/util/Set;Ljava/lang/Object;)V", "cancel", "()V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/mapbox/common/Cancelable;", "getOriginalCancelable", "()Lcom/mapbox/common/Cancelable;", "Lc93/a;", "getOnCancel", "()Lc93/a;", "Ljava/util/Set;", "Ljava/lang/Object;", "getListener", "()Ljava/lang/Object;", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public class ExtendedCancelable implements Cancelable {
        private final Set<ExtendedCancelable> cancelableSet;
        private final Object listener;
        private final InterfaceC4339a onCancel;
        private final Cancelable originalCancelable;
        final /* synthetic */ NativeObserver this$0;

        public ExtendedCancelable(NativeObserver nativeObserver, Cancelable originalCancelable, InterfaceC4339a interfaceC4339a, Set<ExtendedCancelable> cancelableSet, Object obj) {
            AbstractC22676k.m65750j(originalCancelable, "originalCancelable");
            AbstractC22676k.m65750j(cancelableSet, "cancelableSet");
            this.this$0 = nativeObserver;
            this.originalCancelable = originalCancelable;
            this.onCancel = interfaceC4339a;
            this.cancelableSet = cancelableSet;
            this.listener = obj;
            cancelableSet.add(this);
        }

        @Override // com.mapbox.common.Cancelable
        public void cancel() {
            this.cancelableSet.remove(this);
            getOriginalCancelable().cancel();
            InterfaceC4339a interfaceC4339a = this.onCancel;
            if (interfaceC4339a != null) {
                interfaceC4339a.invoke();
            }
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!getClass().equals(other != null ? other.getClass() : null)) {
                return false;
            }
            AbstractC22676k.m65748h(other, "null cannot be cast to non-null type com.mapbox.maps.NativeObserver.ExtendedCancelable");
            ExtendedCancelable extendedCancelable = (ExtendedCancelable) other;
            return AbstractC22676k.m65745e(getOriginalCancelable(), extendedCancelable.getOriginalCancelable()) && AbstractC22676k.m65745e(this.cancelableSet, extendedCancelable.cancelableSet) && AbstractC22676k.m65745e(this.onCancel, extendedCancelable.onCancel) && AbstractC22676k.m65745e(this.listener, extendedCancelable.listener);
        }

        public final Object getListener() {
            return this.listener;
        }

        public final InterfaceC4339a getOnCancel() {
            return this.onCancel;
        }

        public Cancelable getOriginalCancelable() {
            return this.originalCancelable;
        }

        public int hashCode() {
            return Objects.hash(getOriginalCancelable(), this.cancelableSet, this.onCancel, this.listener);
        }

        public /* synthetic */ ExtendedCancelable(NativeObserver nativeObserver, Cancelable cancelable, InterfaceC4339a interfaceC4339a, Set set, Object obj, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(nativeObserver, cancelable, (i13 & 2) != 0 ? null : interfaceC4339a, (i13 & 4) != 0 ? nativeObserver.cancelableSet : set, (i13 & 8) != 0 ? null : obj);
        }
    }
}
