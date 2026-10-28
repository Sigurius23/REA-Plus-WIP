package io.getstream.android.video.generated.models;

import c13.AbstractC3855a;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.List;
import jg3.C21682i;
import jh3.AbstractC21702c;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B§\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\u000e\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u0012\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u0012\u0010\b\u0003\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\tHÆ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\tHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b,\u0010-J°\u0001\u0010.\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u00022\u000e\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0010\b\u0003\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b0\u0010\u001cJ\u0010\u00102\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b;\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b<\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b=\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b>\u0010\u001aR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\b@\u0010!R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\bA\u0010!R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\bB\u0010!R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010C\u001a\u0004\bD\u0010%R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010E\u001a\u0004\bF\u0010'R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010G\u001a\u0004\bH\u0010)R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010I\u001a\u0004\bJ\u0010+R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010K\u001a\u0004\bL\u0010-¨\u0006M"}, m65681d2 = {"Lio/getstream/android/video/generated/models/SIPInboundRoutingRuleResponse;", "", "Ljg3/i;", "createdAt", "", AttachmentExtensionsKt.EXTRA_DURATION, "id", "name", "updatedAt", "", "calledNumbers", "trunkIds", "callerNumbers", "Lio/getstream/android/video/generated/models/SIPCallConfigsResponse;", "callConfigs", "Lio/getstream/android/video/generated/models/SIPCallerConfigsResponse;", "callerConfigs", "Lio/getstream/android/video/generated/models/SIPDirectRoutingRuleCallConfigsResponse;", "directRoutingConfigs", "Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;", "pinProtectionConfigs", "Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;", "pinRoutingConfigs", "<init>", "(Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/android/video/generated/models/SIPCallConfigsResponse;Lio/getstream/android/video/generated/models/SIPCallerConfigsResponse;Lio/getstream/android/video/generated/models/SIPDirectRoutingRuleCallConfigsResponse;Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;)V", "component1", "()Ljg3/i;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "component8", "component9", "()Lio/getstream/android/video/generated/models/SIPCallConfigsResponse;", "component10", "()Lio/getstream/android/video/generated/models/SIPCallerConfigsResponse;", "component11", "()Lio/getstream/android/video/generated/models/SIPDirectRoutingRuleCallConfigsResponse;", "component12", "()Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;", "component13", "()Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;", "copy", "(Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/android/video/generated/models/SIPCallConfigsResponse;Lio/getstream/android/video/generated/models/SIPCallerConfigsResponse;Lio/getstream/android/video/generated/models/SIPDirectRoutingRuleCallConfigsResponse;Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;)Lio/getstream/android/video/generated/models/SIPInboundRoutingRuleResponse;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljg3/i;", "getCreatedAt", "Ljava/lang/String;", "getDuration", "getId", "getName", "getUpdatedAt", "Ljava/util/List;", "getCalledNumbers", "getTrunkIds", "getCallerNumbers", "Lio/getstream/android/video/generated/models/SIPCallConfigsResponse;", "getCallConfigs", "Lio/getstream/android/video/generated/models/SIPCallerConfigsResponse;", "getCallerConfigs", "Lio/getstream/android/video/generated/models/SIPDirectRoutingRuleCallConfigsResponse;", "getDirectRoutingConfigs", "Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;", "getPinProtectionConfigs", "Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;", "getPinRoutingConfigs", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class SIPInboundRoutingRuleResponse {
    private final SIPCallConfigsResponse callConfigs;
    private final List<String> calledNumbers;
    private final SIPCallerConfigsResponse callerConfigs;
    private final List<String> callerNumbers;
    private final C21682i createdAt;
    private final SIPDirectRoutingRuleCallConfigsResponse directRoutingConfigs;
    private final String duration;
    private final String id;
    private final String name;
    private final SIPPinProtectionConfigsResponse pinProtectionConfigs;
    private final SIPInboundRoutingRulePinConfigsResponse pinRoutingConfigs;
    private final List<String> trunkIds;
    private final C21682i updatedAt;

    public SIPInboundRoutingRuleResponse(@InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration, @InterfaceC30731q(name = "id") String id4, @InterfaceC30731q(name = "name") String name, @InterfaceC30731q(name = "updated_at") C21682i updatedAt, @InterfaceC30731q(name = "called_numbers") List<String> calledNumbers, @InterfaceC30731q(name = "trunk_ids") List<String> trunkIds, @InterfaceC30731q(name = "caller_numbers") List<String> list, @InterfaceC30731q(name = "call_configs") SIPCallConfigsResponse sIPCallConfigsResponse, @InterfaceC30731q(name = "caller_configs") SIPCallerConfigsResponse sIPCallerConfigsResponse, @InterfaceC30731q(name = "direct_routing_configs") SIPDirectRoutingRuleCallConfigsResponse sIPDirectRoutingRuleCallConfigsResponse, @InterfaceC30731q(name = "pin_protection_configs") SIPPinProtectionConfigsResponse sIPPinProtectionConfigsResponse, @InterfaceC30731q(name = "pin_routing_configs") SIPInboundRoutingRulePinConfigsResponse sIPInboundRoutingRulePinConfigsResponse) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(calledNumbers, "calledNumbers");
        AbstractC22676k.m65750j(trunkIds, "trunkIds");
        this.createdAt = createdAt;
        this.duration = duration;
        this.id = id4;
        this.name = name;
        this.updatedAt = updatedAt;
        this.calledNumbers = calledNumbers;
        this.trunkIds = trunkIds;
        this.callerNumbers = list;
        this.callConfigs = sIPCallConfigsResponse;
        this.callerConfigs = sIPCallerConfigsResponse;
        this.directRoutingConfigs = sIPDirectRoutingRuleCallConfigsResponse;
        this.pinProtectionConfigs = sIPPinProtectionConfigsResponse;
        this.pinRoutingConfigs = sIPInboundRoutingRulePinConfigsResponse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SIPInboundRoutingRuleResponse copy$default(SIPInboundRoutingRuleResponse sIPInboundRoutingRuleResponse, C21682i c21682i, String str, String str2, String str3, C21682i c21682i2, List list, List list2, List list3, SIPCallConfigsResponse sIPCallConfigsResponse, SIPCallerConfigsResponse sIPCallerConfigsResponse, SIPDirectRoutingRuleCallConfigsResponse sIPDirectRoutingRuleCallConfigsResponse, SIPPinProtectionConfigsResponse sIPPinProtectionConfigsResponse, SIPInboundRoutingRulePinConfigsResponse sIPInboundRoutingRulePinConfigsResponse, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c21682i = sIPInboundRoutingRuleResponse.createdAt;
        }
        return sIPInboundRoutingRuleResponse.copy(c21682i, (i13 & 2) != 0 ? sIPInboundRoutingRuleResponse.duration : str, (i13 & 4) != 0 ? sIPInboundRoutingRuleResponse.id : str2, (i13 & 8) != 0 ? sIPInboundRoutingRuleResponse.name : str3, (i13 & 16) != 0 ? sIPInboundRoutingRuleResponse.updatedAt : c21682i2, (i13 & 32) != 0 ? sIPInboundRoutingRuleResponse.calledNumbers : list, (i13 & 64) != 0 ? sIPInboundRoutingRuleResponse.trunkIds : list2, (i13 & 128) != 0 ? sIPInboundRoutingRuleResponse.callerNumbers : list3, (i13 & 256) != 0 ? sIPInboundRoutingRuleResponse.callConfigs : sIPCallConfigsResponse, (i13 & 512) != 0 ? sIPInboundRoutingRuleResponse.callerConfigs : sIPCallerConfigsResponse, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? sIPInboundRoutingRuleResponse.directRoutingConfigs : sIPDirectRoutingRuleCallConfigsResponse, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? sIPInboundRoutingRuleResponse.pinProtectionConfigs : sIPPinProtectionConfigsResponse, (i13 & 4096) != 0 ? sIPInboundRoutingRuleResponse.pinRoutingConfigs : sIPInboundRoutingRulePinConfigsResponse);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final C21682i getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final SIPCallerConfigsResponse getCallerConfigs() {
        return this.callerConfigs;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final SIPDirectRoutingRuleCallConfigsResponse getDirectRoutingConfigs() {
        return this.directRoutingConfigs;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final SIPPinProtectionConfigsResponse getPinProtectionConfigs() {
        return this.pinProtectionConfigs;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final SIPInboundRoutingRulePinConfigsResponse getPinRoutingConfigs() {
        return this.pinRoutingConfigs;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final C21682i getUpdatedAt() {
        return this.updatedAt;
    }

    public final List<String> component6() {
        return this.calledNumbers;
    }

    public final List<String> component7() {
        return this.trunkIds;
    }

    public final List<String> component8() {
        return this.callerNumbers;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final SIPCallConfigsResponse getCallConfigs() {
        return this.callConfigs;
    }

    public final SIPInboundRoutingRuleResponse copy(@InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration, @InterfaceC30731q(name = "id") String id4, @InterfaceC30731q(name = "name") String name, @InterfaceC30731q(name = "updated_at") C21682i updatedAt, @InterfaceC30731q(name = "called_numbers") List<String> calledNumbers, @InterfaceC30731q(name = "trunk_ids") List<String> trunkIds, @InterfaceC30731q(name = "caller_numbers") List<String> callerNumbers, @InterfaceC30731q(name = "call_configs") SIPCallConfigsResponse callConfigs, @InterfaceC30731q(name = "caller_configs") SIPCallerConfigsResponse callerConfigs, @InterfaceC30731q(name = "direct_routing_configs") SIPDirectRoutingRuleCallConfigsResponse directRoutingConfigs, @InterfaceC30731q(name = "pin_protection_configs") SIPPinProtectionConfigsResponse pinProtectionConfigs, @InterfaceC30731q(name = "pin_routing_configs") SIPInboundRoutingRulePinConfigsResponse pinRoutingConfigs) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(calledNumbers, "calledNumbers");
        AbstractC22676k.m65750j(trunkIds, "trunkIds");
        return new SIPInboundRoutingRuleResponse(createdAt, duration, id4, name, updatedAt, calledNumbers, trunkIds, callerNumbers, callConfigs, callerConfigs, directRoutingConfigs, pinProtectionConfigs, pinRoutingConfigs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SIPInboundRoutingRuleResponse)) {
            return false;
        }
        SIPInboundRoutingRuleResponse sIPInboundRoutingRuleResponse = (SIPInboundRoutingRuleResponse) other;
        return AbstractC22676k.m65745e(this.createdAt, sIPInboundRoutingRuleResponse.createdAt) && AbstractC22676k.m65745e(this.duration, sIPInboundRoutingRuleResponse.duration) && AbstractC22676k.m65745e(this.id, sIPInboundRoutingRuleResponse.id) && AbstractC22676k.m65745e(this.name, sIPInboundRoutingRuleResponse.name) && AbstractC22676k.m65745e(this.updatedAt, sIPInboundRoutingRuleResponse.updatedAt) && AbstractC22676k.m65745e(this.calledNumbers, sIPInboundRoutingRuleResponse.calledNumbers) && AbstractC22676k.m65745e(this.trunkIds, sIPInboundRoutingRuleResponse.trunkIds) && AbstractC22676k.m65745e(this.callerNumbers, sIPInboundRoutingRuleResponse.callerNumbers) && AbstractC22676k.m65745e(this.callConfigs, sIPInboundRoutingRuleResponse.callConfigs) && AbstractC22676k.m65745e(this.callerConfigs, sIPInboundRoutingRuleResponse.callerConfigs) && AbstractC22676k.m65745e(this.directRoutingConfigs, sIPInboundRoutingRuleResponse.directRoutingConfigs) && AbstractC22676k.m65745e(this.pinProtectionConfigs, sIPInboundRoutingRuleResponse.pinProtectionConfigs) && AbstractC22676k.m65745e(this.pinRoutingConfigs, sIPInboundRoutingRuleResponse.pinRoutingConfigs);
    }

    public final SIPCallConfigsResponse getCallConfigs() {
        return this.callConfigs;
    }

    public final List<String> getCalledNumbers() {
        return this.calledNumbers;
    }

    public final SIPCallerConfigsResponse getCallerConfigs() {
        return this.callerConfigs;
    }

    public final List<String> getCallerNumbers() {
        return this.callerNumbers;
    }

    public final C21682i getCreatedAt() {
        return this.createdAt;
    }

    public final SIPDirectRoutingRuleCallConfigsResponse getDirectRoutingConfigs() {
        return this.directRoutingConfigs;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final SIPPinProtectionConfigsResponse getPinProtectionConfigs() {
        return this.pinProtectionConfigs;
    }

    public final SIPInboundRoutingRulePinConfigsResponse getPinRoutingConfigs() {
        return this.pinRoutingConfigs;
    }

    public final List<String> getTrunkIds() {
        return this.trunkIds;
    }

    public final C21682i getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC3855a.m11822f(this.updatedAt, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.createdAt.hashCode() * 31, 31, this.duration), 31, this.id), 31, this.name), 31), 31, this.calledNumbers), 31, this.trunkIds);
        List<String> list = this.callerNumbers;
        int iHashCode = (iM31983b + (list == null ? 0 : list.hashCode())) * 31;
        SIPCallConfigsResponse sIPCallConfigsResponse = this.callConfigs;
        int iHashCode2 = (iHashCode + (sIPCallConfigsResponse == null ? 0 : sIPCallConfigsResponse.hashCode())) * 31;
        SIPCallerConfigsResponse sIPCallerConfigsResponse = this.callerConfigs;
        int iHashCode3 = (iHashCode2 + (sIPCallerConfigsResponse == null ? 0 : sIPCallerConfigsResponse.hashCode())) * 31;
        SIPDirectRoutingRuleCallConfigsResponse sIPDirectRoutingRuleCallConfigsResponse = this.directRoutingConfigs;
        int iHashCode4 = (iHashCode3 + (sIPDirectRoutingRuleCallConfigsResponse == null ? 0 : sIPDirectRoutingRuleCallConfigsResponse.hashCode())) * 31;
        SIPPinProtectionConfigsResponse sIPPinProtectionConfigsResponse = this.pinProtectionConfigs;
        int iHashCode5 = (iHashCode4 + (sIPPinProtectionConfigsResponse == null ? 0 : sIPPinProtectionConfigsResponse.hashCode())) * 31;
        SIPInboundRoutingRulePinConfigsResponse sIPInboundRoutingRulePinConfigsResponse = this.pinRoutingConfigs;
        return iHashCode5 + (sIPInboundRoutingRulePinConfigsResponse != null ? sIPInboundRoutingRulePinConfigsResponse.hashCode() : 0);
    }

    public String toString() {
        C21682i c21682i = this.createdAt;
        String str = this.duration;
        String str2 = this.id;
        String str3 = this.name;
        C21682i c21682i2 = this.updatedAt;
        List<String> list = this.calledNumbers;
        List<String> list2 = this.trunkIds;
        List<String> list3 = this.callerNumbers;
        SIPCallConfigsResponse sIPCallConfigsResponse = this.callConfigs;
        SIPCallerConfigsResponse sIPCallerConfigsResponse = this.callerConfigs;
        SIPDirectRoutingRuleCallConfigsResponse sIPDirectRoutingRuleCallConfigsResponse = this.directRoutingConfigs;
        SIPPinProtectionConfigsResponse sIPPinProtectionConfigsResponse = this.pinProtectionConfigs;
        SIPInboundRoutingRulePinConfigsResponse sIPInboundRoutingRulePinConfigsResponse = this.pinRoutingConfigs;
        StringBuilder sb4 = new StringBuilder("SIPInboundRoutingRuleResponse(createdAt=");
        sb4.append(c21682i);
        sb4.append(", duration=");
        sb4.append(str);
        sb4.append(", id=");
        AbstractC11266d.m30444B(sb4, str2, ", name=", str3, ", updatedAt=");
        sb4.append(c21682i2);
        sb4.append(", calledNumbers=");
        sb4.append(list);
        sb4.append(", trunkIds=");
        AbstractC21702c.m61148s(sb4, list2, ", callerNumbers=", list3, ", callConfigs=");
        sb4.append(sIPCallConfigsResponse);
        sb4.append(", callerConfigs=");
        sb4.append(sIPCallerConfigsResponse);
        sb4.append(", directRoutingConfigs=");
        sb4.append(sIPDirectRoutingRuleCallConfigsResponse);
        sb4.append(", pinProtectionConfigs=");
        sb4.append(sIPPinProtectionConfigsResponse);
        sb4.append(", pinRoutingConfigs=");
        sb4.append(sIPInboundRoutingRulePinConfigsResponse);
        sb4.append(")");
        return sb4.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SIPInboundRoutingRuleResponse(C21682i c21682i, String str, String str2, String str3, C21682i c21682i2, List list, List list2, List list3, SIPCallConfigsResponse sIPCallConfigsResponse, SIPCallerConfigsResponse sIPCallerConfigsResponse, SIPDirectRoutingRuleCallConfigsResponse sIPDirectRoutingRuleCallConfigsResponse, SIPPinProtectionConfigsResponse sIPPinProtectionConfigsResponse, SIPInboundRoutingRulePinConfigsResponse sIPInboundRoutingRulePinConfigsResponse, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i13 & 32;
        C25271y c25271y = C25271y.f99162w;
        this(c21682i, str, str2, str3, c21682i2, i14 != 0 ? c25271y : list, (i13 & 64) != 0 ? c25271y : list2, (i13 & 128) != 0 ? c25271y : list3, (i13 & 256) != 0 ? null : sIPCallConfigsResponse, (i13 & 512) != 0 ? null : sIPCallerConfigsResponse, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : sIPDirectRoutingRuleCallConfigsResponse, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : sIPPinProtectionConfigsResponse, (i13 & 4096) != 0 ? null : sIPInboundRoutingRulePinConfigsResponse);
    }
}
