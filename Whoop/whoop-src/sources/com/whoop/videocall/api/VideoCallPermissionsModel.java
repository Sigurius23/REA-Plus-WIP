package com.whoop.videocall.api;

import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.InfoCalloutTileModel$$serializer;
import com.whoop.design.models.items.SecondaryButtonModel;
import com.whoop.design.models.items.SecondaryButtonModel$$serializer;
import com.whoop.design.models.modal.DialogModel;
import com.whoop.design.models.modal.DialogModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001d¨\u00062"}, m65681d2 = {"Lcom/whoop/videocall/api/VideoCallPermissionsModel;", "", "Lcom/whoop/design/models/InfoCalloutTileModel;", "callout", "Lcom/whoop/design/models/items/SecondaryButtonModel;", "button", "Lcom/whoop/design/models/modal/DialogModel;", "modal", "<init>", "(Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/modal/DialogModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/modal/DialogModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$video_call_release", "(Lcom/whoop/videocall/api/VideoCallPermissionsModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/InfoCalloutTileModel;", "component2", "()Lcom/whoop/design/models/items/SecondaryButtonModel;", "component3", "()Lcom/whoop/design/models/modal/DialogModel;", "copy", "(Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/modal/DialogModel;)Lcom/whoop/videocall/api/VideoCallPermissionsModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/InfoCalloutTileModel;", "getCallout", "Lcom/whoop/design/models/items/SecondaryButtonModel;", "getButton", "Lcom/whoop/design/models/modal/DialogModel;", "getModal", "Companion", "$serializer", "a", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class VideoCallPermissionsModel {
    private final SecondaryButtonModel button;
    private final InfoCalloutTileModel callout;
    private final DialogModel modal;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = (DialogModel.$stable | SecondaryButtonModel.$stable) | InfoCalloutTileModel.$stable;

    /* JADX INFO: renamed from: com.whoop.videocall.api.VideoCallPermissionsModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/videocall/api/VideoCallPermissionsModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/videocall/api/VideoCallPermissionsModel;", "serializer", "()Lwc3/c;", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return VideoCallPermissionsModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ VideoCallPermissionsModel(int i13, InfoCalloutTileModel infoCalloutTileModel, SecondaryButtonModel secondaryButtonModel, DialogModel dialogModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, VideoCallPermissionsModel$$serializer.INSTANCE.getDescriptor());
        }
        this.callout = infoCalloutTileModel;
        this.button = secondaryButtonModel;
        this.modal = dialogModel;
    }

    public static /* synthetic */ VideoCallPermissionsModel copy$default(VideoCallPermissionsModel videoCallPermissionsModel, InfoCalloutTileModel infoCalloutTileModel, SecondaryButtonModel secondaryButtonModel, DialogModel dialogModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            infoCalloutTileModel = videoCallPermissionsModel.callout;
        }
        if ((i13 & 2) != 0) {
            secondaryButtonModel = videoCallPermissionsModel.button;
        }
        if ((i13 & 4) != 0) {
            dialogModel = videoCallPermissionsModel.modal;
        }
        return videoCallPermissionsModel.copy(infoCalloutTileModel, secondaryButtonModel, dialogModel);
    }

    public static final /* synthetic */ void write$Self$video_call_release(VideoCallPermissionsModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, InfoCalloutTileModel$$serializer.INSTANCE, self.callout);
        output.encodeSerializableElement(serialDesc, 1, SecondaryButtonModel$$serializer.INSTANCE, self.button);
        output.encodeSerializableElement(serialDesc, 2, DialogModel$$serializer.INSTANCE, self.modal);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final InfoCalloutTileModel getCallout() {
        return this.callout;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SecondaryButtonModel getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DialogModel getModal() {
        return this.modal;
    }

    public final VideoCallPermissionsModel copy(InfoCalloutTileModel callout, SecondaryButtonModel button, DialogModel modal) {
        AbstractC22676k.m65750j(callout, "callout");
        AbstractC22676k.m65750j(button, "button");
        AbstractC22676k.m65750j(modal, "modal");
        return new VideoCallPermissionsModel(callout, button, modal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoCallPermissionsModel)) {
            return false;
        }
        VideoCallPermissionsModel videoCallPermissionsModel = (VideoCallPermissionsModel) other;
        return AbstractC22676k.m65745e(this.callout, videoCallPermissionsModel.callout) && AbstractC22676k.m65745e(this.button, videoCallPermissionsModel.button) && AbstractC22676k.m65745e(this.modal, videoCallPermissionsModel.modal);
    }

    public final SecondaryButtonModel getButton() {
        return this.button;
    }

    public final InfoCalloutTileModel getCallout() {
        return this.callout;
    }

    public final DialogModel getModal() {
        return this.modal;
    }

    public int hashCode() {
        return this.modal.hashCode() + ((this.button.hashCode() + (this.callout.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "VideoCallPermissionsModel(callout=" + this.callout + ", button=" + this.button + ", modal=" + this.modal + ")";
    }

    public VideoCallPermissionsModel(InfoCalloutTileModel callout, SecondaryButtonModel button, DialogModel modal) {
        AbstractC22676k.m65750j(callout, "callout");
        AbstractC22676k.m65750j(button, "button");
        AbstractC22676k.m65750j(modal, "modal");
        this.callout = callout;
        this.button = button;
        this.modal = modal;
    }
}
