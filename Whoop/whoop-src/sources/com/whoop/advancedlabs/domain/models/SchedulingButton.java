package com.whoop.advancedlabs.domain.models;

import androidx.core.app.NotificationCompat;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import tb0.C33690a;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ4\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u0006/"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/SchedulingButton;", "", "", "textDisplay", "Lcom/whoop/navigation/e;", "destination", "", NotificationCompat.CATEGORY_PROGRESS, "<init>", "(Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/Float;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/Float;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/SchedulingButton;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/navigation/e;", "component3", "()Ljava/lang/Float;", "copy", "(Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/Float;)Lcom/whoop/advancedlabs/domain/models/SchedulingButton;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTextDisplay", "Lcom/whoop/navigation/e;", "getDestination", "Ljava/lang/Float;", "getProgress", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SchedulingButton {
    private final C9598e destination;
    private final Float progress;
    private final String textDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C33690a(23)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/SchedulingButton$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/SchedulingButton;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SchedulingButton$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SchedulingButton(int i13, String str, C9598e c9598e, Float f13, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, SchedulingButton$$serializer.INSTANCE.getDescriptor());
        }
        this.textDisplay = str;
        this.destination = c9598e;
        if ((i13 & 4) == 0) {
            this.progress = null;
        } else {
            this.progress = f13;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ SchedulingButton copy$default(SchedulingButton schedulingButton, String str, C9598e c9598e, Float f13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = schedulingButton.textDisplay;
        }
        if ((i13 & 2) != 0) {
            c9598e = schedulingButton.destination;
        }
        if ((i13 & 4) != 0) {
            f13 = schedulingButton.progress;
        }
        return schedulingButton.copy(str, c9598e, f13);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(SchedulingButton self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.textDisplay);
        output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.destination);
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.progress == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, FloatSerializer.INSTANCE, self.progress);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTextDisplay() {
        return this.textDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getProgress() {
        return this.progress;
    }

    public final SchedulingButton copy(String textDisplay, C9598e destination, Float progress) {
        return new SchedulingButton(textDisplay, destination, progress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SchedulingButton)) {
            return false;
        }
        SchedulingButton schedulingButton = (SchedulingButton) other;
        return AbstractC22676k.m65745e(this.textDisplay, schedulingButton.textDisplay) && AbstractC22676k.m65745e(this.destination, schedulingButton.destination) && AbstractC22676k.m65745e(this.progress, schedulingButton.progress);
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final Float getProgress() {
        return this.progress;
    }

    public final String getTextDisplay() {
        return this.textDisplay;
    }

    public int hashCode() {
        String str = this.textDisplay;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C9598e c9598e = this.destination;
        int iHashCode2 = (iHashCode + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        Float f13 = this.progress;
        return iHashCode2 + (f13 != null ? f13.hashCode() : 0);
    }

    public String toString() {
        return "SchedulingButton(textDisplay=" + this.textDisplay + ", destination=" + this.destination + ", progress=" + this.progress + ")";
    }

    public SchedulingButton(String str, C9598e c9598e, Float f13) {
        this.textDisplay = str;
        this.destination = c9598e;
        this.progress = f13;
    }

    public /* synthetic */ SchedulingButton(String str, C9598e c9598e, Float f13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, c9598e, (i13 & 4) != 0 ? null : f13);
    }
}
