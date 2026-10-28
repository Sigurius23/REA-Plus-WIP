package io.getstream.chat.android.p226ui.common.state.messages.composer;

import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.chat.android.models.Attachment;
import java.io.File;
import java.util.List;
import l83.C23465k;
import m83.C25271y;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;", "", "<init>", "()V", "Idle", "Recording", "Hold", "Locked", "Overview", "Complete", "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Complete;", "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;", "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;", "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Recording;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class RecordingState {
    public static final int $stable = 0;

    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Complete;", "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;", "attachment", "Lio/getstream/chat/android/models/Attachment;", "<init>", "(Lio/getstream/chat/android/models/Attachment;)V", "getAttachment", "()Lio/getstream/chat/android/models/Attachment;", "toString", "", "component1", "copy", "equals", "", "other", "", "hashCode", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class Complete extends RecordingState {
        public static final int $stable = 0;
        private final Attachment attachment;

        public Complete(Attachment attachment) {
            AbstractC22676k.m65750j(attachment, "attachment");
            this.attachment = attachment;
        }

        public static /* synthetic */ Complete copy$default(Complete complete, Attachment attachment, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                attachment = complete.attachment;
            }
            return complete.copy(attachment);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Attachment getAttachment() {
            return this.attachment;
        }

        public final Complete copy(Attachment attachment) {
            AbstractC22676k.m65750j(attachment, "attachment");
            return new Complete(attachment);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Complete) && AbstractC22676k.m65745e(this.attachment, ((Complete) other).attachment);
        }

        public final Attachment getAttachment() {
            return this.attachment;
        }

        public final int hashCode() {
            return this.attachment.hashCode();
        }

        public final String toString() {
            return "Recording.Complete(duration=" + AttachmentExtensionsKt.getDuration(this.attachment) + ", attachment=" + this.attachment.getUpload() + ")";
        }
    }

    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001'B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0013R\u0011\u0010$\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010&\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b%\u0010#¨\u0006("}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Hold;", "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Recording;", "", "durationInMs", "", "", "waveform", "Ll83/k;", MapboxMap.QFE_OFFSET, "<init>", "(ILjava/util/List;Ll83/k;)V", "", "toString", "()Ljava/lang/String;", "component1", "()I", "component2", "()Ljava/util/List;", "component3", "()Ll83/k;", "copy", "(ILjava/util/List;Ll83/k;)Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Hold;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getDurationInMs", "Ljava/util/List;", "getWaveform", "Ll83/k;", "getOffset", "getOffsetX", "()F", "offsetX", "getOffsetY", "offsetY", "Companion", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class Hold extends Recording {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        private static final C23465k ZeroOffset;
        private final int durationInMs;
        private final C23465k offset;
        private final List<Float> waveform;

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Hold$Companion;", "", "<init>", "()V", "Ll83/k;", "", "ZeroOffset", "Ll83/k;", "getZeroOffset", "()Ll83/k;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final C23465k getZeroOffset() {
                return Hold.ZeroOffset;
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        static {
            Float fValueOf = Float.valueOf(0.0f);
            ZeroOffset = new C23465k(fValueOf, fValueOf);
        }

        public Hold() {
            this(0, null, null, 7, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Hold copy$default(Hold hold, int i13, List list, C23465k c23465k, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i13 = hold.durationInMs;
            }
            if ((i14 & 2) != 0) {
                list = hold.waveform;
            }
            if ((i14 & 4) != 0) {
                c23465k = hold.offset;
            }
            return hold.copy(i13, list, c23465k);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getDurationInMs() {
            return this.durationInMs;
        }

        public final List<Float> component2() {
            return this.waveform;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final C23465k getOffset() {
            return this.offset;
        }

        public final Hold copy(int durationInMs, List<Float> waveform, C23465k offset) {
            AbstractC22676k.m65750j(waveform, "waveform");
            AbstractC22676k.m65750j(offset, "offset");
            return new Hold(durationInMs, waveform, offset);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Hold)) {
                return false;
            }
            Hold hold = (Hold) other;
            return this.durationInMs == hold.durationInMs && AbstractC22676k.m65745e(this.waveform, hold.waveform) && AbstractC22676k.m65745e(this.offset, hold.offset);
        }

        @Override // io.getstream.chat.android.ui.common.state.messages.composer.RecordingState.Recording
        public final int getDurationInMs() {
            return this.durationInMs;
        }

        public final C23465k getOffset() {
            return this.offset;
        }

        public final float getOffsetX() {
            return ((Number) this.offset.f92937w).floatValue();
        }

        public final float getOffsetY() {
            return ((Number) this.offset.f92938x).floatValue();
        }

        @Override // io.getstream.chat.android.ui.common.state.messages.composer.RecordingState.Recording
        public final List<Float> getWaveform() {
            return this.waveform;
        }

        public final int hashCode() {
            return this.offset.hashCode() + AbstractC11895b.m31983b(Integer.hashCode(this.durationInMs) * 31, 31, this.waveform);
        }

        public final String toString() {
            int size = this.waveform.size();
            int i13 = this.durationInMs;
            float offsetX = getOffsetX();
            float offsetY = getOffsetY();
            StringBuilder sbM30465s = AbstractC11266d.m30465s(size, i13, "Recording.Hold(waveform=", ", duration=", "ms, offset=[");
            sbM30465s.append(offsetX);
            sbM30465s.append(":");
            sbM30465s.append(offsetY);
            sbM30465s.append("])");
            return sbM30465s.toString();
        }

        public Hold(int i13, List<Float> waveform, C23465k offset) {
            AbstractC22676k.m65750j(waveform, "waveform");
            AbstractC22676k.m65750j(offset, "offset");
            this.durationInMs = i13;
            this.waveform = waveform;
            this.offset = offset;
        }

        public /* synthetic */ Hold(int i13, List list, C23465k c23465k, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this((i14 & 1) != 0 ? 0 : i13, (i14 & 2) != 0 ? C25271y.f99162w : list, (i14 & 4) != 0 ? ZeroOffset : c23465k);
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;", "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;", "<init>", "()V", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Idle extends RecordingState {
        public static final int $stable = 0;
        public static final Idle INSTANCE = new Idle();

        private Idle() {
        }

        public final String toString() {
            return "Recording.Idle";
        }
    }

    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;", "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Recording;", "durationInMs", "", "waveform", "", "", "<init>", "(ILjava/util/List;)V", "getDurationInMs", "()I", "getWaveform", "()Ljava/util/List;", "toString", "", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class Locked extends Recording {
        public static final int $stable = 8;
        private final int durationInMs;
        private final List<Float> waveform;

        /* JADX WARN: Multi-variable type inference failed */
        public Locked() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Locked copy$default(Locked locked, int i13, List list, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i13 = locked.durationInMs;
            }
            if ((i14 & 2) != 0) {
                list = locked.waveform;
            }
            return locked.copy(i13, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getDurationInMs() {
            return this.durationInMs;
        }

        public final List<Float> component2() {
            return this.waveform;
        }

        public final Locked copy(int durationInMs, List<Float> waveform) {
            AbstractC22676k.m65750j(waveform, "waveform");
            return new Locked(durationInMs, waveform);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Locked)) {
                return false;
            }
            Locked locked = (Locked) other;
            return this.durationInMs == locked.durationInMs && AbstractC22676k.m65745e(this.waveform, locked.waveform);
        }

        @Override // io.getstream.chat.android.ui.common.state.messages.composer.RecordingState.Recording
        public final int getDurationInMs() {
            return this.durationInMs;
        }

        @Override // io.getstream.chat.android.ui.common.state.messages.composer.RecordingState.Recording
        public final List<Float> getWaveform() {
            return this.waveform;
        }

        public final int hashCode() {
            return this.waveform.hashCode() + (Integer.hashCode(this.durationInMs) * 31);
        }

        public final String toString() {
            return AbstractC25012a.m73372e(this.waveform.size(), this.durationInMs, "Recording.Locked(waveform=", ", duration=", "ms)");
        }

        public Locked(int i13, List<Float> waveform) {
            AbstractC22676k.m65750j(waveform, "waveform");
            this.durationInMs = i13;
            this.waveform = waveform;
        }

        public /* synthetic */ Locked(int i13, List list, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this((i14 & 1) != 0 ? 0 : i13, (i14 & 2) != 0 ? C25271y.f99162w : list);
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Recording;", "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;", "<init>", "()V", "durationInMs", "", "getDurationInMs", "()I", "waveform", "", "", "getWaveform", "()Ljava/util/List;", "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Hold;", "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static abstract class Recording extends RecordingState {
        public static final int $stable = 0;

        private Recording() {
        }

        public abstract int getDurationInMs();

        public abstract List<Float> getWaveform();

        public Recording(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    private RecordingState() {
    }

    public RecordingState(DefaultConstructorMarker defaultConstructorMarker) {
    }

    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003JK\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\u0019\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015¨\u0006("}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;", "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;", "durationInMs", "", "waveform", "", "", "attachment", "Lio/getstream/chat/android/models/Attachment;", "isPlaying", "", "playingProgress", "playingId", "<init>", "(ILjava/util/List;Lio/getstream/chat/android/models/Attachment;ZFI)V", "getDurationInMs", "()I", "getWaveform", "()Ljava/util/List;", "getAttachment", "()Lio/getstream/chat/android/models/Attachment;", "()Z", "getPlayingProgress", "()F", "getPlayingId", "hasPlayingId", "getHasPlayingId", "toString", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class Overview extends RecordingState {
        public static final int $stable = 8;
        private final Attachment attachment;
        private final int durationInMs;
        private final boolean isPlaying;
        private final int playingId;
        private final float playingProgress;
        private final List<Float> waveform;

        public Overview(int i13, List<Float> waveform, Attachment attachment, boolean z4, float f13, int i14) {
            AbstractC22676k.m65750j(waveform, "waveform");
            AbstractC22676k.m65750j(attachment, "attachment");
            this.durationInMs = i13;
            this.waveform = waveform;
            this.attachment = attachment;
            this.isPlaying = z4;
            this.playingProgress = f13;
            this.playingId = i14;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Overview copy$default(Overview overview, int i13, List list, Attachment attachment, boolean z4, float f13, int i14, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                i13 = overview.durationInMs;
            }
            if ((i15 & 2) != 0) {
                list = overview.waveform;
            }
            if ((i15 & 4) != 0) {
                attachment = overview.attachment;
            }
            if ((i15 & 8) != 0) {
                z4 = overview.isPlaying;
            }
            if ((i15 & 16) != 0) {
                f13 = overview.playingProgress;
            }
            if ((i15 & 32) != 0) {
                i14 = overview.playingId;
            }
            float f14 = f13;
            int i16 = i14;
            return overview.copy(i13, list, attachment, z4, f14, i16);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getDurationInMs() {
            return this.durationInMs;
        }

        public final List<Float> component2() {
            return this.waveform;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Attachment getAttachment() {
            return this.attachment;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsPlaying() {
            return this.isPlaying;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final float getPlayingProgress() {
            return this.playingProgress;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getPlayingId() {
            return this.playingId;
        }

        public final Overview copy(int durationInMs, List<Float> waveform, Attachment attachment, boolean isPlaying, float playingProgress, int playingId) {
            AbstractC22676k.m65750j(waveform, "waveform");
            AbstractC22676k.m65750j(attachment, "attachment");
            return new Overview(durationInMs, waveform, attachment, isPlaying, playingProgress, playingId);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Overview)) {
                return false;
            }
            Overview overview = (Overview) other;
            return this.durationInMs == overview.durationInMs && AbstractC22676k.m65745e(this.waveform, overview.waveform) && AbstractC22676k.m65745e(this.attachment, overview.attachment) && this.isPlaying == overview.isPlaying && Float.compare(this.playingProgress, overview.playingProgress) == 0 && this.playingId == overview.playingId;
        }

        public final Attachment getAttachment() {
            return this.attachment;
        }

        public final int getDurationInMs() {
            return this.durationInMs;
        }

        public final boolean getHasPlayingId() {
            return this.playingId != -1;
        }

        public final int getPlayingId() {
            return this.playingId;
        }

        public final float getPlayingProgress() {
            return this.playingProgress;
        }

        public final List<Float> getWaveform() {
            return this.waveform;
        }

        public final int hashCode() {
            return Integer.hashCode(this.playingId) + AbstractC11266d.m30447a(this.playingProgress, AbstractC2875y.m8289b((this.attachment.hashCode() + AbstractC11895b.m31983b(Integer.hashCode(this.durationInMs) * 31, 31, this.waveform)) * 31, 31, this.isPlaying), 31);
        }

        public final boolean isPlaying() {
            return this.isPlaying;
        }

        public final String toString() {
            int i13 = this.playingId;
            int size = this.waveform.size();
            int i14 = this.durationInMs;
            boolean z4 = this.isPlaying;
            float f13 = this.playingProgress;
            File upload = this.attachment.getUpload();
            Integer numValueOf = upload != null ? Integer.valueOf(upload.hashCode()) : null;
            StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, size, "Recording.Overview(playingId=", ", waveform=", ", duration=");
            AbstractC13673n.m38573t(i14, "ms, isPlaying=", ", playingProgress=", sbM30465s, z4);
            sbM30465s.append(f13);
            sbM30465s.append(", attachment=");
            sbM30465s.append(numValueOf);
            sbM30465s.append(")");
            return sbM30465s.toString();
        }

        public /* synthetic */ Overview(int i13, List list, Attachment attachment, boolean z4, float f13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this((i15 & 1) != 0 ? 0 : i13, (i15 & 2) != 0 ? C25271y.f99162w : list, attachment, (i15 & 8) != 0 ? false : z4, (i15 & 16) != 0 ? 0.0f : f13, (i15 & 32) != 0 ? -1 : i14);
        }
    }
}
