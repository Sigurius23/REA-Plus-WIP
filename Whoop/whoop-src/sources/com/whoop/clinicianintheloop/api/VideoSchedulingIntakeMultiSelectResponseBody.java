package com.whoop.clinicianintheloop.api;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gm2.C15999a;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J,\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006,"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeMultiSelectResponseBody;", "", "", "", "selectedOptionIds", "text", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$clinician_in_the_loop_release", "(Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeMultiSelectResponseBody;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeMultiSelectResponseBody;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSelectedOptionIds", "getSelectedOptionIds$annotations", "()V", "Ljava/lang/String;", "getText", "Companion", "$serializer", "a", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class VideoSchedulingIntakeMultiSelectResponseBody {
    private final List<String> selectedOptionIds;
    private final String text;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C15999a(21)), null};

    /* JADX INFO: renamed from: com.whoop.clinicianintheloop.api.VideoSchedulingIntakeMultiSelectResponseBody$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeMultiSelectResponseBody$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeMultiSelectResponseBody;", "serializer", "()Lwc3/c;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return VideoSchedulingIntakeMultiSelectResponseBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ VideoSchedulingIntakeMultiSelectResponseBody(int i13, List list, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, VideoSchedulingIntakeMultiSelectResponseBody$$serializer.INSTANCE.getDescriptor());
        }
        this.selectedOptionIds = list;
        if ((i13 & 2) == 0) {
            this.text = null;
        } else {
            this.text = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoSchedulingIntakeMultiSelectResponseBody copy$default(VideoSchedulingIntakeMultiSelectResponseBody videoSchedulingIntakeMultiSelectResponseBody, List list, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = videoSchedulingIntakeMultiSelectResponseBody.selectedOptionIds;
        }
        if ((i13 & 2) != 0) {
            str = videoSchedulingIntakeMultiSelectResponseBody.text;
        }
        return videoSchedulingIntakeMultiSelectResponseBody.copy(list, str);
    }

    @InterfaceC37143h("selected_option_ids")
    public static /* synthetic */ void getSelectedOptionIds$annotations() {
    }

    public static final /* synthetic */ void write$Self$clinician_in_the_loop_release(VideoSchedulingIntakeMultiSelectResponseBody self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.selectedOptionIds);
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.text == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.text);
    }

    public final List<String> component1() {
        return this.selectedOptionIds;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final VideoSchedulingIntakeMultiSelectResponseBody copy(List<String> selectedOptionIds, String text) {
        AbstractC22676k.m65750j(selectedOptionIds, "selectedOptionIds");
        return new VideoSchedulingIntakeMultiSelectResponseBody(selectedOptionIds, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoSchedulingIntakeMultiSelectResponseBody)) {
            return false;
        }
        VideoSchedulingIntakeMultiSelectResponseBody videoSchedulingIntakeMultiSelectResponseBody = (VideoSchedulingIntakeMultiSelectResponseBody) other;
        return AbstractC22676k.m65745e(this.selectedOptionIds, videoSchedulingIntakeMultiSelectResponseBody.selectedOptionIds) && AbstractC22676k.m65745e(this.text, videoSchedulingIntakeMultiSelectResponseBody.text);
    }

    public final List<String> getSelectedOptionIds() {
        return this.selectedOptionIds;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = this.selectedOptionIds.hashCode() * 31;
        String str = this.text;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return AbstractC30802r.m94761j("VideoSchedulingIntakeMultiSelectResponseBody(selectedOptionIds=", ", text=", this.text, ")", this.selectedOptionIds);
    }

    public VideoSchedulingIntakeMultiSelectResponseBody(List<String> selectedOptionIds, String str) {
        AbstractC22676k.m65750j(selectedOptionIds, "selectedOptionIds");
        this.selectedOptionIds = selectedOptionIds;
        this.text = str;
    }

    public /* synthetic */ VideoSchedulingIntakeMultiSelectResponseBody(List list, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i13 & 2) != 0 ? null : str);
    }
}
