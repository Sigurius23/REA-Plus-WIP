package com.amplitude.android.engagement.types;

import com.mapbox.maps.MapboxMap;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import no.nordicsemi.android.dfu.DfuBaseService;
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
@Metadata(m65680d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 _2\u00020\u0001:\u0002`aB£\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aB\u00ad\u0001\b\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u0019\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b'\u0010&J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\"J\u0012\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010\"J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010\"J\u0012\u00105\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b7\u00106J®\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b:\u0010\"J\u0010\u0010;\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b;\u0010<J\u001a\u0010?\u001a\u00020\u00062\b\u0010>\u001a\u0004\u0018\u00010=HÖ\u0003¢\u0006\u0004\b?\u0010@J(\u0010G\u001a\u00020F2\u0006\u0010A\u001a\u00020\u00002\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020DHÇ\u0001¢\u0006\u0004\bG\u0010HR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010I\u001a\u0004\bJ\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010K\u001a\u0004\bL\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010M\u001a\u0004\b\u0007\u0010&R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010M\u001a\u0004\b\b\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010I\u001a\u0004\bN\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010O\u001a\u0004\bP\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010Q\u001a\u0004\bR\u0010,R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010S\u001a\u0004\bT\u0010.R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010U\u001a\u0004\bV\u00100R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010W\u001a\u0004\bX\u00102R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010I\u001a\u0004\bY\u0010\"R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010I\u001a\u0004\bZ\u0010\"R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010[\u001a\u0004\b\\\u00106R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010[\u001a\u0004\b]\u00106R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010I\u001a\u0004\b^\u0010\"¨\u0006b"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/PinFormFactor;", "Lcom/amplitude/android/engagement/types/FormFactor;", "", "anchor", "Lcom/amplitude/android/engagement/types/ElementSelector;", "anchorSelector", "", "isOpenByDefault", "isShowingMask", "advanceTrigger", "Lcom/amplitude/android/engagement/types/OffsetValue;", MapboxMap.QFE_OFFSET, "Lcom/amplitude/android/engagement/types/PinPosition;", "position", "Lcom/amplitude/android/engagement/types/PinAlignment;", "alignment", "Lcom/amplitude/android/engagement/types/PinPointer;", "pointer", "Lcom/amplitude/android/engagement/types/NudgeStepLayout;", "layout", "textAnimation", "mediaPosition", "Lcom/amplitude/android/engagement/types/ContentAlignment;", "titleAlignment", "contentAlignment", "<init>", "(Ljava/lang/String;Lcom/amplitude/android/engagement/types/ElementSelector;ZZLjava/lang/String;Lcom/amplitude/android/engagement/types/OffsetValue;Lcom/amplitude/android/engagement/types/PinPosition;Lcom/amplitude/android/engagement/types/PinAlignment;Lcom/amplitude/android/engagement/types/PinPointer;Lcom/amplitude/android/engagement/types/NudgeStepLayout;Ljava/lang/String;Ljava/lang/String;Lcom/amplitude/android/engagement/types/ContentAlignment;Lcom/amplitude/android/engagement/types/ContentAlignment;)V", "", "seen1", "selector", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/amplitude/android/engagement/types/ElementSelector;ZZLjava/lang/String;Lcom/amplitude/android/engagement/types/OffsetValue;Lcom/amplitude/android/engagement/types/PinPosition;Lcom/amplitude/android/engagement/types/PinAlignment;Lcom/amplitude/android/engagement/types/PinPointer;Lcom/amplitude/android/engagement/types/NudgeStepLayout;Ljava/lang/String;Ljava/lang/String;Lcom/amplitude/android/engagement/types/ContentAlignment;Lcom/amplitude/android/engagement/types/ContentAlignment;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/amplitude/android/engagement/types/ElementSelector;", "component3", "()Z", "component4", "component5", "component6", "()Lcom/amplitude/android/engagement/types/OffsetValue;", "component7", "()Lcom/amplitude/android/engagement/types/PinPosition;", "component8", "()Lcom/amplitude/android/engagement/types/PinAlignment;", "component9", "()Lcom/amplitude/android/engagement/types/PinPointer;", "component10", "()Lcom/amplitude/android/engagement/types/NudgeStepLayout;", "component11", "component12", "component13", "()Lcom/amplitude/android/engagement/types/ContentAlignment;", "component14", "copy", "(Ljava/lang/String;Lcom/amplitude/android/engagement/types/ElementSelector;ZZLjava/lang/String;Lcom/amplitude/android/engagement/types/OffsetValue;Lcom/amplitude/android/engagement/types/PinPosition;Lcom/amplitude/android/engagement/types/PinAlignment;Lcom/amplitude/android/engagement/types/PinPointer;Lcom/amplitude/android/engagement/types/NudgeStepLayout;Ljava/lang/String;Ljava/lang/String;Lcom/amplitude/android/engagement/types/ContentAlignment;Lcom/amplitude/android/engagement/types/ContentAlignment;)Lcom/amplitude/android/engagement/types/PinFormFactor;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/PinFormFactor;Lzc3/c;Lyc3/g;)V", "Ljava/lang/String;", "getAnchor", "Lcom/amplitude/android/engagement/types/ElementSelector;", "getAnchorSelector", "Z", "getAdvanceTrigger", "Lcom/amplitude/android/engagement/types/OffsetValue;", "getOffset", "Lcom/amplitude/android/engagement/types/PinPosition;", "getPosition", "Lcom/amplitude/android/engagement/types/PinAlignment;", "getAlignment", "Lcom/amplitude/android/engagement/types/PinPointer;", "getPointer", "Lcom/amplitude/android/engagement/types/NudgeStepLayout;", "getLayout", "getTextAnimation", "getMediaPosition", "Lcom/amplitude/android/engagement/types/ContentAlignment;", "getTitleAlignment", "getContentAlignment", "getSelector", "Companion", "$serializer", "com/amplitude/android/engagement/types/z0", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37143h("pin")
@InterfaceC37144i
public final /* data */ class PinFormFactor extends FormFactor {
    private static final InterfaceC37138c[] $childSerializers;
    public static final int $stable = 8;
    public static final C4953z0 Companion = new C4953z0();
    private final String advanceTrigger;
    private final PinAlignment alignment;
    private final String anchor;
    private final ElementSelector anchorSelector;
    private final ContentAlignment contentAlignment;
    private final boolean isOpenByDefault;
    private final boolean isShowingMask;
    private final NudgeStepLayout layout;
    private final String mediaPosition;
    private final OffsetValue offset;
    private final PinPointer pointer;
    private final PinPosition position;
    private final String selector;
    private final String textAnimation;
    private final ContentAlignment titleAlignment;

    static {
        InterfaceC37138c interfaceC37138cSerializer = PinPosition.Companion.serializer();
        InterfaceC37138c interfaceC37138cSerializer2 = PinAlignment.Companion.serializer();
        InterfaceC37138c interfaceC37138cSerializer3 = NudgeStepLayout.Companion.serializer();
        C24426f c24426f = ContentAlignment.Companion;
        $childSerializers = new InterfaceC37138c[]{null, null, null, null, null, null, interfaceC37138cSerializer, interfaceC37138cSerializer2, null, interfaceC37138cSerializer3, null, null, c24426f.serializer(), c24426f.serializer(), null};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC23457c
    public /* synthetic */ PinFormFactor(int i13, String str, ElementSelector elementSelector, boolean z4, boolean z13, String str2, OffsetValue offsetValue, PinPosition pinPosition, PinAlignment pinAlignment, PinPointer pinPointer, NudgeStepLayout nudgeStepLayout, String str3, String str4, ContentAlignment contentAlignment, ContentAlignment contentAlignment2, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        String selector;
        super(i13, serializationConstructorMarker);
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, PinFormFactor$$serializer.INSTANCE.getDescriptor());
        }
        this.anchor = str;
        if ((i13 & 2) == 0) {
            this.anchorSelector = null;
        } else {
            this.anchorSelector = elementSelector;
        }
        if ((i13 & 4) == 0) {
            this.isOpenByDefault = true;
        } else {
            this.isOpenByDefault = z4;
        }
        if ((i13 & 8) == 0) {
            this.isShowingMask = false;
        } else {
            this.isShowingMask = z13;
        }
        if ((i13 & 16) == 0) {
            this.advanceTrigger = null;
        } else {
            this.advanceTrigger = str2;
        }
        if ((i13 & 32) == 0) {
            this.offset = null;
        } else {
            this.offset = offsetValue;
        }
        if ((i13 & 64) == 0) {
            this.position = null;
        } else {
            this.position = pinPosition;
        }
        if ((i13 & 128) == 0) {
            this.alignment = null;
        } else {
            this.alignment = pinAlignment;
        }
        if ((i13 & 256) == 0) {
            this.pointer = new PinPointer(PinPointerType.ARROW);
        } else {
            this.pointer = pinPointer;
        }
        if ((i13 & 512) == 0) {
            this.layout = NudgeStepLayout.CLASSIC;
        } else {
            this.layout = nudgeStepLayout;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.textAnimation = null;
        } else {
            this.textAnimation = str3;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.mediaPosition = null;
        } else {
            this.mediaPosition = str4;
        }
        if ((i13 & 4096) == 0) {
            this.titleAlignment = null;
        } else {
            this.titleAlignment = contentAlignment;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
            this.contentAlignment = null;
        } else {
            this.contentAlignment = contentAlignment2;
        }
        if ((i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0) {
            this.selector = str5;
            return;
        }
        ElementSelector elementSelector2 = this.anchorSelector;
        if (elementSelector2 != null && (selector = elementSelector2.getSelector()) != null) {
            str = selector;
        }
        this.selector = str;
    }

    public static final /* synthetic */ void write$Self(PinFormFactor self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        String selector;
        FormFactor.write$Self(self, output, serialDesc);
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.anchor);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.anchorSelector != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, ElementSelector$$serializer.INSTANCE, self.anchorSelector);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !self.isOpenByDefault) {
            output.encodeBooleanElement(serialDesc, 2, self.isOpenByDefault);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.isShowingMask) {
            output.encodeBooleanElement(serialDesc, 3, self.isShowingMask);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.advanceTrigger != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.advanceTrigger);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.offset != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, OffsetValue$$serializer.INSTANCE, self.offset);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.position != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, interfaceC37138cArr[6], self.position);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.alignment != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, interfaceC37138cArr[7], self.alignment);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || !AbstractC22676k.m65745e(self.pointer, new PinPointer(PinPointerType.ARROW))) {
            output.encodeSerializableElement(serialDesc, 8, PinPointer$$serializer.INSTANCE, self.pointer);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.getLayout() != NudgeStepLayout.CLASSIC) {
            output.encodeSerializableElement(serialDesc, 9, interfaceC37138cArr[9], self.getLayout());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.getTextAnimation() != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, self.getTextAnimation());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.getMediaPosition() != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, self.getMediaPosition());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.getTitleAlignment() != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, interfaceC37138cArr[12], self.getTitleAlignment());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.getContentAlignment() != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, interfaceC37138cArr[13], self.getContentAlignment());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 14)) {
            String str = self.selector;
            ElementSelector elementSelector = self.anchorSelector;
            if (elementSelector == null || (selector = elementSelector.getSelector()) == null) {
                selector = self.anchor;
            }
            if (AbstractC22676k.m65745e(str, selector)) {
                return;
            }
        }
        output.encodeStringElement(serialDesc, 14, self.selector);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAnchor() {
        return this.anchor;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final NudgeStepLayout getLayout() {
        return this.layout;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTextAnimation() {
        return this.textAnimation;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getMediaPosition() {
        return this.mediaPosition;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final ContentAlignment getTitleAlignment() {
        return this.titleAlignment;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final ContentAlignment getContentAlignment() {
        return this.contentAlignment;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ElementSelector getAnchorSelector() {
        return this.anchorSelector;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsOpenByDefault() {
        return this.isOpenByDefault;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsShowingMask() {
        return this.isShowingMask;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAdvanceTrigger() {
        return this.advanceTrigger;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final OffsetValue getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final PinPosition getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final PinAlignment getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final PinPointer getPointer() {
        return this.pointer;
    }

    public final PinFormFactor copy(String anchor, ElementSelector anchorSelector, boolean isOpenByDefault, boolean isShowingMask, String advanceTrigger, OffsetValue offset, PinPosition position, PinAlignment alignment, PinPointer pointer, NudgeStepLayout layout, String textAnimation, String mediaPosition, ContentAlignment titleAlignment, ContentAlignment contentAlignment) {
        AbstractC22676k.m65750j(anchor, "anchor");
        AbstractC22676k.m65750j(pointer, "pointer");
        AbstractC22676k.m65750j(layout, "layout");
        return new PinFormFactor(anchor, anchorSelector, isOpenByDefault, isShowingMask, advanceTrigger, offset, position, alignment, pointer, layout, textAnimation, mediaPosition, titleAlignment, contentAlignment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PinFormFactor)) {
            return false;
        }
        PinFormFactor pinFormFactor = (PinFormFactor) other;
        return AbstractC22676k.m65745e(this.anchor, pinFormFactor.anchor) && AbstractC22676k.m65745e(this.anchorSelector, pinFormFactor.anchorSelector) && this.isOpenByDefault == pinFormFactor.isOpenByDefault && this.isShowingMask == pinFormFactor.isShowingMask && AbstractC22676k.m65745e(this.advanceTrigger, pinFormFactor.advanceTrigger) && AbstractC22676k.m65745e(this.offset, pinFormFactor.offset) && this.position == pinFormFactor.position && this.alignment == pinFormFactor.alignment && AbstractC22676k.m65745e(this.pointer, pinFormFactor.pointer) && this.layout == pinFormFactor.layout && AbstractC22676k.m65745e(this.textAnimation, pinFormFactor.textAnimation) && AbstractC22676k.m65745e(this.mediaPosition, pinFormFactor.mediaPosition) && this.titleAlignment == pinFormFactor.titleAlignment && this.contentAlignment == pinFormFactor.contentAlignment;
    }

    public final String getAdvanceTrigger() {
        return this.advanceTrigger;
    }

    public final PinAlignment getAlignment() {
        return this.alignment;
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

    @Override // com.amplitude.android.engagement.types.FormFactor
    public String getMediaPosition() {
        return this.mediaPosition;
    }

    public final OffsetValue getOffset() {
        return this.offset;
    }

    public final PinPointer getPointer() {
        return this.pointer;
    }

    public final PinPosition getPosition() {
        return this.position;
    }

    public final String getSelector() {
        return this.selector;
    }

    @Override // com.amplitude.android.engagement.types.FormFactor
    public String getTextAnimation() {
        return this.textAnimation;
    }

    @Override // com.amplitude.android.engagement.types.FormFactor
    public ContentAlignment getTitleAlignment() {
        return this.titleAlignment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        int iHashCode = this.anchor.hashCode() * 31;
        ElementSelector elementSelector = this.anchorSelector;
        int iHashCode2 = (iHashCode + (elementSelector == null ? 0 : elementSelector.hashCode())) * 31;
        boolean z4 = this.isOpenByDefault;
        ?? r10 = z4;
        if (z4) {
            r10 = 1;
        }
        int i13 = (iHashCode2 + r10) * 31;
        boolean z13 = this.isShowingMask;
        int i14 = (i13 + (z13 ? 1 : z13)) * 31;
        String str = this.advanceTrigger;
        int iHashCode3 = (i14 + (str == null ? 0 : str.hashCode())) * 31;
        OffsetValue offsetValue = this.offset;
        int iHashCode4 = (iHashCode3 + (offsetValue == null ? 0 : offsetValue.hashCode())) * 31;
        PinPosition pinPosition = this.position;
        int iHashCode5 = (iHashCode4 + (pinPosition == null ? 0 : pinPosition.hashCode())) * 31;
        PinAlignment pinAlignment = this.alignment;
        int iHashCode6 = (this.layout.hashCode() + ((this.pointer.hashCode() + ((iHashCode5 + (pinAlignment == null ? 0 : pinAlignment.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.textAnimation;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mediaPosition;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ContentAlignment contentAlignment = this.titleAlignment;
        int iHashCode9 = (iHashCode8 + (contentAlignment == null ? 0 : contentAlignment.hashCode())) * 31;
        ContentAlignment contentAlignment2 = this.contentAlignment;
        return iHashCode9 + (contentAlignment2 != null ? contentAlignment2.hashCode() : 0);
    }

    public final boolean isOpenByDefault() {
        return this.isOpenByDefault;
    }

    public final boolean isShowingMask() {
        return this.isShowingMask;
    }

    public String toString() {
        return "PinFormFactor(anchor=" + this.anchor + ", anchorSelector=" + this.anchorSelector + ", isOpenByDefault=" + this.isOpenByDefault + ", isShowingMask=" + this.isShowingMask + ", advanceTrigger=" + this.advanceTrigger + ", offset=" + this.offset + ", position=" + this.position + ", alignment=" + this.alignment + ", pointer=" + this.pointer + ", layout=" + this.layout + ", textAnimation=" + this.textAnimation + ", mediaPosition=" + this.mediaPosition + ", titleAlignment=" + this.titleAlignment + ", contentAlignment=" + this.contentAlignment + ')';
    }

    public /* synthetic */ PinFormFactor(String str, ElementSelector elementSelector, boolean z4, boolean z13, String str2, OffsetValue offsetValue, PinPosition pinPosition, PinAlignment pinAlignment, PinPointer pinPointer, NudgeStepLayout nudgeStepLayout, String str3, String str4, ContentAlignment contentAlignment, ContentAlignment contentAlignment2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : elementSelector, (i13 & 4) != 0 ? true : z4, (i13 & 8) != 0 ? false : z13, (i13 & 16) != 0 ? null : str2, (i13 & 32) != 0 ? null : offsetValue, (i13 & 64) != 0 ? null : pinPosition, (i13 & 128) != 0 ? null : pinAlignment, (i13 & 256) != 0 ? new PinPointer(PinPointerType.ARROW) : pinPointer, (i13 & 512) != 0 ? NudgeStepLayout.CLASSIC : nudgeStepLayout, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str3, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str4, (i13 & 4096) != 0 ? null : contentAlignment, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : contentAlignment2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinFormFactor(String anchor, ElementSelector elementSelector, boolean z4, boolean z13, String str, OffsetValue offsetValue, PinPosition pinPosition, PinAlignment pinAlignment, PinPointer pointer, NudgeStepLayout layout, String str2, String str3, ContentAlignment contentAlignment, ContentAlignment contentAlignment2) {
        String selector;
        super(null);
        AbstractC22676k.m65750j(anchor, "anchor");
        AbstractC22676k.m65750j(pointer, "pointer");
        AbstractC22676k.m65750j(layout, "layout");
        this.anchor = anchor;
        this.anchorSelector = elementSelector;
        this.isOpenByDefault = z4;
        this.isShowingMask = z13;
        this.advanceTrigger = str;
        this.offset = offsetValue;
        this.position = pinPosition;
        this.alignment = pinAlignment;
        this.pointer = pointer;
        this.layout = layout;
        this.textAnimation = str2;
        this.mediaPosition = str3;
        this.titleAlignment = contentAlignment;
        this.contentAlignment = contentAlignment2;
        if (elementSelector != null && (selector = elementSelector.getSelector()) != null) {
            anchor = selector;
        }
        this.selector = anchor;
    }
}
