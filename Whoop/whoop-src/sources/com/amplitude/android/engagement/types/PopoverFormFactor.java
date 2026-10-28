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
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:;BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rBW\b\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÇ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010#JT\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b'\u0010 J\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b5\u0010 R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b8\u0010#¨\u0006<"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/PopoverFormFactor;", "Lcom/amplitude/android/engagement/types/FormFactor;", "Lcom/amplitude/android/engagement/types/PopoverPosition;", "position", "Lcom/amplitude/android/engagement/types/NudgeStepLayout;", "layout", "", "textAnimation", "mediaPosition", "Lcom/amplitude/android/engagement/types/ContentAlignment;", "titleAlignment", "contentAlignment", "<init>", "(Lcom/amplitude/android/engagement/types/PopoverPosition;Lcom/amplitude/android/engagement/types/NudgeStepLayout;Ljava/lang/String;Ljava/lang/String;Lcom/amplitude/android/engagement/types/ContentAlignment;Lcom/amplitude/android/engagement/types/ContentAlignment;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/amplitude/android/engagement/types/PopoverPosition;Lcom/amplitude/android/engagement/types/NudgeStepLayout;Ljava/lang/String;Ljava/lang/String;Lcom/amplitude/android/engagement/types/ContentAlignment;Lcom/amplitude/android/engagement/types/ContentAlignment;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/PopoverFormFactor;Lzc3/c;Lyc3/g;)V", "component1", "()Lcom/amplitude/android/engagement/types/PopoverPosition;", "component2", "()Lcom/amplitude/android/engagement/types/NudgeStepLayout;", "component3", "()Ljava/lang/String;", "component4", "component5", "()Lcom/amplitude/android/engagement/types/ContentAlignment;", "component6", "copy", "(Lcom/amplitude/android/engagement/types/PopoverPosition;Lcom/amplitude/android/engagement/types/NudgeStepLayout;Ljava/lang/String;Ljava/lang/String;Lcom/amplitude/android/engagement/types/ContentAlignment;Lcom/amplitude/android/engagement/types/ContentAlignment;)Lcom/amplitude/android/engagement/types/PopoverFormFactor;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/amplitude/android/engagement/types/PopoverPosition;", "getPosition", "Lcom/amplitude/android/engagement/types/NudgeStepLayout;", "getLayout", "Ljava/lang/String;", "getTextAnimation", "getMediaPosition", "Lcom/amplitude/android/engagement/types/ContentAlignment;", "getTitleAlignment", "getContentAlignment", "Companion", "$serializer", "com/amplitude/android/engagement/types/b1", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37143h("popover")
@InterfaceC37144i
public final /* data */ class PopoverFormFactor extends FormFactor {
    private static final InterfaceC37138c[] $childSerializers;
    public static final int $stable = 0;
    public static final C4870b1 Companion = new C4870b1();
    private final ContentAlignment contentAlignment;
    private final NudgeStepLayout layout;
    private final String mediaPosition;
    private final PopoverPosition position;
    private final String textAnimation;
    private final ContentAlignment titleAlignment;

    static {
        InterfaceC37138c interfaceC37138cSerializer = PopoverPosition.Companion.serializer();
        InterfaceC37138c interfaceC37138cSerializer2 = NudgeStepLayout.Companion.serializer();
        C24426f c24426f = ContentAlignment.Companion;
        $childSerializers = new InterfaceC37138c[]{interfaceC37138cSerializer, interfaceC37138cSerializer2, null, null, c24426f.serializer(), c24426f.serializer()};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC23457c
    public /* synthetic */ PopoverFormFactor(int i13, PopoverPosition popoverPosition, NudgeStepLayout nudgeStepLayout, String str, String str2, ContentAlignment contentAlignment, ContentAlignment contentAlignment2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i13, serializationConstructorMarker);
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, PopoverFormFactor$$serializer.INSTANCE.getDescriptor());
        }
        this.position = popoverPosition;
        if ((i13 & 2) == 0) {
            this.layout = NudgeStepLayout.CLASSIC;
        } else {
            this.layout = nudgeStepLayout;
        }
        if ((i13 & 4) == 0) {
            this.textAnimation = null;
        } else {
            this.textAnimation = str;
        }
        if ((i13 & 8) == 0) {
            this.mediaPosition = null;
        } else {
            this.mediaPosition = str2;
        }
        if ((i13 & 16) == 0) {
            this.titleAlignment = null;
        } else {
            this.titleAlignment = contentAlignment;
        }
        if ((i13 & 32) == 0) {
            this.contentAlignment = null;
        } else {
            this.contentAlignment = contentAlignment2;
        }
    }

    public static /* synthetic */ PopoverFormFactor copy$default(PopoverFormFactor popoverFormFactor, PopoverPosition popoverPosition, NudgeStepLayout nudgeStepLayout, String str, String str2, ContentAlignment contentAlignment, ContentAlignment contentAlignment2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            popoverPosition = popoverFormFactor.position;
        }
        if ((i13 & 2) != 0) {
            nudgeStepLayout = popoverFormFactor.layout;
        }
        if ((i13 & 4) != 0) {
            str = popoverFormFactor.textAnimation;
        }
        if ((i13 & 8) != 0) {
            str2 = popoverFormFactor.mediaPosition;
        }
        if ((i13 & 16) != 0) {
            contentAlignment = popoverFormFactor.titleAlignment;
        }
        if ((i13 & 32) != 0) {
            contentAlignment2 = popoverFormFactor.contentAlignment;
        }
        ContentAlignment contentAlignment3 = contentAlignment;
        ContentAlignment contentAlignment4 = contentAlignment2;
        return popoverFormFactor.copy(popoverPosition, nudgeStepLayout, str, str2, contentAlignment3, contentAlignment4);
    }

    public static final /* synthetic */ void write$Self(PopoverFormFactor self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        FormFactor.write$Self(self, output, serialDesc);
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, interfaceC37138cArr[0], self.position);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.getLayout() != NudgeStepLayout.CLASSIC) {
            output.encodeSerializableElement(serialDesc, 1, interfaceC37138cArr[1], self.getLayout());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.getTextAnimation() != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.getTextAnimation());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.getMediaPosition() != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.getMediaPosition());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.getTitleAlignment() != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, interfaceC37138cArr[4], self.getTitleAlignment());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.getContentAlignment() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, interfaceC37138cArr[5], self.getContentAlignment());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PopoverPosition getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NudgeStepLayout getLayout() {
        return this.layout;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTextAnimation() {
        return this.textAnimation;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMediaPosition() {
        return this.mediaPosition;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ContentAlignment getTitleAlignment() {
        return this.titleAlignment;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ContentAlignment getContentAlignment() {
        return this.contentAlignment;
    }

    public final PopoverFormFactor copy(PopoverPosition position, NudgeStepLayout layout, String textAnimation, String mediaPosition, ContentAlignment titleAlignment, ContentAlignment contentAlignment) {
        AbstractC22676k.m65750j(position, "position");
        AbstractC22676k.m65750j(layout, "layout");
        return new PopoverFormFactor(position, layout, textAnimation, mediaPosition, titleAlignment, contentAlignment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PopoverFormFactor)) {
            return false;
        }
        PopoverFormFactor popoverFormFactor = (PopoverFormFactor) other;
        return this.position == popoverFormFactor.position && this.layout == popoverFormFactor.layout && AbstractC22676k.m65745e(this.textAnimation, popoverFormFactor.textAnimation) && AbstractC22676k.m65745e(this.mediaPosition, popoverFormFactor.mediaPosition) && this.titleAlignment == popoverFormFactor.titleAlignment && this.contentAlignment == popoverFormFactor.contentAlignment;
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

    public final PopoverPosition getPosition() {
        return this.position;
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
        int iHashCode = (this.layout.hashCode() + (this.position.hashCode() * 31)) * 31;
        String str = this.textAnimation;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mediaPosition;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ContentAlignment contentAlignment = this.titleAlignment;
        int iHashCode4 = (iHashCode3 + (contentAlignment == null ? 0 : contentAlignment.hashCode())) * 31;
        ContentAlignment contentAlignment2 = this.contentAlignment;
        return iHashCode4 + (contentAlignment2 != null ? contentAlignment2.hashCode() : 0);
    }

    public String toString() {
        return "PopoverFormFactor(position=" + this.position + ", layout=" + this.layout + ", textAnimation=" + this.textAnimation + ", mediaPosition=" + this.mediaPosition + ", titleAlignment=" + this.titleAlignment + ", contentAlignment=" + this.contentAlignment + ')';
    }

    public /* synthetic */ PopoverFormFactor(PopoverPosition popoverPosition, NudgeStepLayout nudgeStepLayout, String str, String str2, ContentAlignment contentAlignment, ContentAlignment contentAlignment2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(popoverPosition, (i13 & 2) != 0 ? NudgeStepLayout.CLASSIC : nudgeStepLayout, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? null : contentAlignment, (i13 & 32) != 0 ? null : contentAlignment2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopoverFormFactor(PopoverPosition position, NudgeStepLayout layout, String str, String str2, ContentAlignment contentAlignment, ContentAlignment contentAlignment2) {
        super(null);
        AbstractC22676k.m65750j(position, "position");
        AbstractC22676k.m65750j(layout, "layout");
        this.position = position;
        this.layout = layout;
        this.textAnimation = str;
        this.mediaPosition = str2;
        this.titleAlignment = contentAlignment;
        this.contentAlignment = contentAlignment2;
    }
}
