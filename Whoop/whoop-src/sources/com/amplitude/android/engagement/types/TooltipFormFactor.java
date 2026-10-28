package com.amplitude.android.engagement.types;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import p305lj.C24426f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 N2\u00020\u0001:\u0002OPBq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014B\u007f\b\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001bJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001bJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b*\u0010)J\u0080\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u001bJ\u0010\u0010.\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b3\u00104J(\u0010;\u001a\u00020:2\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208HÇ\u0001¢\u0006\u0004\b;\u0010<R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010?\u001a\u0004\b@\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010A\u001a\u0004\bB\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010C\u001a\u0004\bD\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010E\u001a\u0004\bF\u0010#R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010G\u001a\u0004\bH\u0010%R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\bI\u0010\u001bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010=\u001a\u0004\bJ\u0010\u001bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010K\u001a\u0004\bL\u0010)R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010K\u001a\u0004\bM\u0010)¨\u0006Q"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/TooltipFormFactor;", "Lcom/amplitude/android/engagement/types/FormFactor;", "", "anchor", "Lcom/amplitude/android/engagement/types/ElementSelector;", "anchorSelector", "Lcom/amplitude/android/engagement/types/TooltipShowOn;", "showOn", "Lcom/amplitude/android/engagement/types/Marker;", "marker", "Lcom/amplitude/android/engagement/types/TooltipPointer;", "pointer", "Lcom/amplitude/android/engagement/types/NudgeStepLayout;", "layout", "textAnimation", "mediaPosition", "Lcom/amplitude/android/engagement/types/ContentAlignment;", "titleAlignment", "contentAlignment", "<init>", "(Ljava/lang/String;Lcom/amplitude/android/engagement/types/ElementSelector;Lcom/amplitude/android/engagement/types/TooltipShowOn;Lcom/amplitude/android/engagement/types/Marker;Lcom/amplitude/android/engagement/types/TooltipPointer;Lcom/amplitude/android/engagement/types/NudgeStepLayout;Ljava/lang/String;Ljava/lang/String;Lcom/amplitude/android/engagement/types/ContentAlignment;Lcom/amplitude/android/engagement/types/ContentAlignment;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/amplitude/android/engagement/types/ElementSelector;Lcom/amplitude/android/engagement/types/TooltipShowOn;Lcom/amplitude/android/engagement/types/Marker;Lcom/amplitude/android/engagement/types/TooltipPointer;Lcom/amplitude/android/engagement/types/NudgeStepLayout;Ljava/lang/String;Ljava/lang/String;Lcom/amplitude/android/engagement/types/ContentAlignment;Lcom/amplitude/android/engagement/types/ContentAlignment;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/amplitude/android/engagement/types/ElementSelector;", "component3", "()Lcom/amplitude/android/engagement/types/TooltipShowOn;", "component4", "()Lcom/amplitude/android/engagement/types/Marker;", "component5", "()Lcom/amplitude/android/engagement/types/TooltipPointer;", "component6", "()Lcom/amplitude/android/engagement/types/NudgeStepLayout;", "component7", "component8", "component9", "()Lcom/amplitude/android/engagement/types/ContentAlignment;", "component10", "copy", "(Ljava/lang/String;Lcom/amplitude/android/engagement/types/ElementSelector;Lcom/amplitude/android/engagement/types/TooltipShowOn;Lcom/amplitude/android/engagement/types/Marker;Lcom/amplitude/android/engagement/types/TooltipPointer;Lcom/amplitude/android/engagement/types/NudgeStepLayout;Ljava/lang/String;Ljava/lang/String;Lcom/amplitude/android/engagement/types/ContentAlignment;Lcom/amplitude/android/engagement/types/ContentAlignment;)Lcom/amplitude/android/engagement/types/TooltipFormFactor;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/TooltipFormFactor;Lzc3/c;Lyc3/g;)V", "Ljava/lang/String;", "getAnchor", "Lcom/amplitude/android/engagement/types/ElementSelector;", "getAnchorSelector", "Lcom/amplitude/android/engagement/types/TooltipShowOn;", "getShowOn", "Lcom/amplitude/android/engagement/types/Marker;", "getMarker", "Lcom/amplitude/android/engagement/types/TooltipPointer;", "getPointer", "Lcom/amplitude/android/engagement/types/NudgeStepLayout;", "getLayout", "getTextAnimation", "getMediaPosition", "Lcom/amplitude/android/engagement/types/ContentAlignment;", "getTitleAlignment", "getContentAlignment", "Companion", "$serializer", "com/amplitude/android/engagement/types/a2", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37143h("tooltip")
@InterfaceC37144i
public final /* data */ class TooltipFormFactor extends FormFactor {
    private static final InterfaceC37138c[] $childSerializers;
    public static final int $stable = 8;
    public static final C4867a2 Companion = new C4867a2();
    private final String anchor;
    private final ElementSelector anchorSelector;
    private final ContentAlignment contentAlignment;
    private final NudgeStepLayout layout;
    private final Marker marker;
    private final String mediaPosition;
    private final TooltipPointer pointer;
    private final TooltipShowOn showOn;
    private final String textAnimation;
    private final ContentAlignment titleAlignment;

    static {
        InterfaceC37138c interfaceC37138cSerializer = TooltipShowOn.Companion.serializer();
        InterfaceC37138c interfaceC37138cSerializer2 = Marker.Companion.serializer();
        InterfaceC37138c interfaceC37138cSerializer3 = NudgeStepLayout.Companion.serializer();
        C24426f c24426f = ContentAlignment.Companion;
        $childSerializers = new InterfaceC37138c[]{null, null, interfaceC37138cSerializer, interfaceC37138cSerializer2, null, interfaceC37138cSerializer3, null, null, c24426f.serializer(), c24426f.serializer()};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC23457c
    public /* synthetic */ TooltipFormFactor(int i13, String str, ElementSelector elementSelector, TooltipShowOn tooltipShowOn, Marker marker, TooltipPointer tooltipPointer, NudgeStepLayout nudgeStepLayout, String str2, String str3, ContentAlignment contentAlignment, ContentAlignment contentAlignment2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i13, serializationConstructorMarker);
        if (13 != (i13 & 13)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 13, TooltipFormFactor$$serializer.INSTANCE.getDescriptor());
        }
        this.anchor = str;
        if ((i13 & 2) == 0) {
            this.anchorSelector = null;
        } else {
            this.anchorSelector = elementSelector;
        }
        this.showOn = tooltipShowOn;
        this.marker = marker;
        if ((i13 & 16) == 0) {
            this.pointer = new TooltipPointer(TooltipPointerType.NONE);
        } else {
            this.pointer = tooltipPointer;
        }
        if ((i13 & 32) == 0) {
            this.layout = NudgeStepLayout.CLASSIC;
        } else {
            this.layout = nudgeStepLayout;
        }
        if ((i13 & 64) == 0) {
            this.textAnimation = null;
        } else {
            this.textAnimation = str2;
        }
        if ((i13 & 128) == 0) {
            this.mediaPosition = null;
        } else {
            this.mediaPosition = str3;
        }
        if ((i13 & 256) == 0) {
            this.titleAlignment = null;
        } else {
            this.titleAlignment = contentAlignment;
        }
        if ((i13 & 512) == 0) {
            this.contentAlignment = null;
        } else {
            this.contentAlignment = contentAlignment2;
        }
    }

    public static /* synthetic */ TooltipFormFactor copy$default(TooltipFormFactor tooltipFormFactor, String str, ElementSelector elementSelector, TooltipShowOn tooltipShowOn, Marker marker, TooltipPointer tooltipPointer, NudgeStepLayout nudgeStepLayout, String str2, String str3, ContentAlignment contentAlignment, ContentAlignment contentAlignment2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = tooltipFormFactor.anchor;
        }
        if ((i13 & 2) != 0) {
            elementSelector = tooltipFormFactor.anchorSelector;
        }
        if ((i13 & 4) != 0) {
            tooltipShowOn = tooltipFormFactor.showOn;
        }
        if ((i13 & 8) != 0) {
            marker = tooltipFormFactor.marker;
        }
        if ((i13 & 16) != 0) {
            tooltipPointer = tooltipFormFactor.pointer;
        }
        if ((i13 & 32) != 0) {
            nudgeStepLayout = tooltipFormFactor.layout;
        }
        if ((i13 & 64) != 0) {
            str2 = tooltipFormFactor.textAnimation;
        }
        if ((i13 & 128) != 0) {
            str3 = tooltipFormFactor.mediaPosition;
        }
        if ((i13 & 256) != 0) {
            contentAlignment = tooltipFormFactor.titleAlignment;
        }
        if ((i13 & 512) != 0) {
            contentAlignment2 = tooltipFormFactor.contentAlignment;
        }
        ContentAlignment contentAlignment3 = contentAlignment;
        ContentAlignment contentAlignment4 = contentAlignment2;
        String str4 = str2;
        String str5 = str3;
        TooltipPointer tooltipPointer2 = tooltipPointer;
        NudgeStepLayout nudgeStepLayout2 = nudgeStepLayout;
        return tooltipFormFactor.copy(str, elementSelector, tooltipShowOn, marker, tooltipPointer2, nudgeStepLayout2, str4, str5, contentAlignment3, contentAlignment4);
    }

    public static final /* synthetic */ void write$Self(TooltipFormFactor self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        FormFactor.write$Self(self, output, serialDesc);
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.anchor);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.anchorSelector != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, ElementSelector$$serializer.INSTANCE, self.anchorSelector);
        }
        output.encodeSerializableElement(serialDesc, 2, interfaceC37138cArr[2], self.showOn);
        output.encodeSerializableElement(serialDesc, 3, interfaceC37138cArr[3], self.marker);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !AbstractC22676k.m65745e(self.pointer, new TooltipPointer(TooltipPointerType.NONE))) {
            output.encodeNullableSerializableElement(serialDesc, 4, TooltipPointer$$serializer.INSTANCE, self.pointer);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.getLayout() != NudgeStepLayout.CLASSIC) {
            output.encodeSerializableElement(serialDesc, 5, interfaceC37138cArr[5], self.getLayout());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.getTextAnimation() != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.getTextAnimation());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.getMediaPosition() != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.getMediaPosition());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.getTitleAlignment() != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, interfaceC37138cArr[8], self.getTitleAlignment());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 9) && self.getContentAlignment() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 9, interfaceC37138cArr[9], self.getContentAlignment());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAnchor() {
        return this.anchor;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final ContentAlignment getContentAlignment() {
        return this.contentAlignment;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ElementSelector getAnchorSelector() {
        return this.anchorSelector;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TooltipShowOn getShowOn() {
        return this.showOn;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Marker getMarker() {
        return this.marker;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TooltipPointer getPointer() {
        return this.pointer;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final NudgeStepLayout getLayout() {
        return this.layout;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTextAnimation() {
        return this.textAnimation;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMediaPosition() {
        return this.mediaPosition;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final ContentAlignment getTitleAlignment() {
        return this.titleAlignment;
    }

    public final TooltipFormFactor copy(String anchor, ElementSelector anchorSelector, TooltipShowOn showOn, Marker marker, TooltipPointer pointer, NudgeStepLayout layout, String textAnimation, String mediaPosition, ContentAlignment titleAlignment, ContentAlignment contentAlignment) {
        AbstractC22676k.m65750j(anchor, "anchor");
        AbstractC22676k.m65750j(showOn, "showOn");
        AbstractC22676k.m65750j(marker, "marker");
        AbstractC22676k.m65750j(layout, "layout");
        return new TooltipFormFactor(anchor, anchorSelector, showOn, marker, pointer, layout, textAnimation, mediaPosition, titleAlignment, contentAlignment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TooltipFormFactor)) {
            return false;
        }
        TooltipFormFactor tooltipFormFactor = (TooltipFormFactor) other;
        return AbstractC22676k.m65745e(this.anchor, tooltipFormFactor.anchor) && AbstractC22676k.m65745e(this.anchorSelector, tooltipFormFactor.anchorSelector) && this.showOn == tooltipFormFactor.showOn && AbstractC22676k.m65745e(this.marker, tooltipFormFactor.marker) && AbstractC22676k.m65745e(this.pointer, tooltipFormFactor.pointer) && this.layout == tooltipFormFactor.layout && AbstractC22676k.m65745e(this.textAnimation, tooltipFormFactor.textAnimation) && AbstractC22676k.m65745e(this.mediaPosition, tooltipFormFactor.mediaPosition) && this.titleAlignment == tooltipFormFactor.titleAlignment && this.contentAlignment == tooltipFormFactor.contentAlignment;
    }

    public final String getAnchor() {
        return this.anchor;
    }

    public final ElementSelector getAnchorSelector() {
        return this.anchorSelector;
    }

    @Override // com.amplitude.android.engagement.types.FormFactor
    public ContentAlignment getContentAlignment() {
        return this.contentAlignment;
    }

    @Override // com.amplitude.android.engagement.types.FormFactor
    public NudgeStepLayout getLayout() {
        return this.layout;
    }

    public final Marker getMarker() {
        return this.marker;
    }

    @Override // com.amplitude.android.engagement.types.FormFactor
    public String getMediaPosition() {
        return this.mediaPosition;
    }

    public final TooltipPointer getPointer() {
        return this.pointer;
    }

    public final TooltipShowOn getShowOn() {
        return this.showOn;
    }

    @Override // com.amplitude.android.engagement.types.FormFactor
    public String getTextAnimation() {
        return this.textAnimation;
    }

    @Override // com.amplitude.android.engagement.types.FormFactor
    public ContentAlignment getTitleAlignment() {
        return this.titleAlignment;
    }

    public int hashCode() {
        int iHashCode = this.anchor.hashCode() * 31;
        ElementSelector elementSelector = this.anchorSelector;
        int iHashCode2 = (this.marker.hashCode() + ((this.showOn.hashCode() + ((iHashCode + (elementSelector == null ? 0 : elementSelector.hashCode())) * 31)) * 31)) * 31;
        TooltipPointer tooltipPointer = this.pointer;
        int iHashCode3 = (this.layout.hashCode() + ((iHashCode2 + (tooltipPointer == null ? 0 : tooltipPointer.hashCode())) * 31)) * 31;
        String str = this.textAnimation;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mediaPosition;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ContentAlignment contentAlignment = this.titleAlignment;
        int iHashCode6 = (iHashCode5 + (contentAlignment == null ? 0 : contentAlignment.hashCode())) * 31;
        ContentAlignment contentAlignment2 = this.contentAlignment;
        return iHashCode6 + (contentAlignment2 != null ? contentAlignment2.hashCode() : 0);
    }

    public String toString() {
        return "TooltipFormFactor(anchor=" + this.anchor + ", anchorSelector=" + this.anchorSelector + ", showOn=" + this.showOn + ", marker=" + this.marker + ", pointer=" + this.pointer + ", layout=" + this.layout + ", textAnimation=" + this.textAnimation + ", mediaPosition=" + this.mediaPosition + ", titleAlignment=" + this.titleAlignment + ", contentAlignment=" + this.contentAlignment + ')';
    }

    public /* synthetic */ TooltipFormFactor(String str, ElementSelector elementSelector, TooltipShowOn tooltipShowOn, Marker marker, TooltipPointer tooltipPointer, NudgeStepLayout nudgeStepLayout, String str2, String str3, ContentAlignment contentAlignment, ContentAlignment contentAlignment2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : elementSelector, tooltipShowOn, marker, (i13 & 16) != 0 ? new TooltipPointer(TooltipPointerType.NONE) : tooltipPointer, (i13 & 32) != 0 ? NudgeStepLayout.CLASSIC : nudgeStepLayout, (i13 & 64) != 0 ? null : str2, (i13 & 128) != 0 ? null : str3, (i13 & 256) != 0 ? null : contentAlignment, (i13 & 512) != 0 ? null : contentAlignment2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipFormFactor(String anchor, ElementSelector elementSelector, TooltipShowOn showOn, Marker marker, TooltipPointer tooltipPointer, NudgeStepLayout layout, String str, String str2, ContentAlignment contentAlignment, ContentAlignment contentAlignment2) {
        super(null);
        AbstractC22676k.m65750j(anchor, "anchor");
        AbstractC22676k.m65750j(showOn, "showOn");
        AbstractC22676k.m65750j(marker, "marker");
        AbstractC22676k.m65750j(layout, "layout");
        this.anchor = anchor;
        this.anchorSelector = elementSelector;
        this.showOn = showOn;
        this.marker = marker;
        this.pointer = tooltipPointer;
        this.layout = layout;
        this.textAnimation = str;
        this.mediaPosition = str2;
        this.titleAlignment = contentAlignment;
        this.contentAlignment = contentAlignment2;
    }
}
