package com.amplitude.android.engagement.types;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import p031b9.AbstractC2875y;
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
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u0000 82\u00020\u0001:\u00029:BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBU\b\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÇ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010$JT\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u001eJ\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b2\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b5\u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010$¨\u0006;"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/ModalFormFactor;", "Lcom/amplitude/android/engagement/types/FormFactor;", "Lcom/amplitude/android/engagement/types/NudgeStepLayout;", "layout", "", "textAnimation", "mediaPosition", "Lcom/amplitude/android/engagement/types/ContentAlignment;", "titleAlignment", "contentAlignment", "", "canClickOutsideToClose", "<init>", "(Lcom/amplitude/android/engagement/types/NudgeStepLayout;Ljava/lang/String;Ljava/lang/String;Lcom/amplitude/android/engagement/types/ContentAlignment;Lcom/amplitude/android/engagement/types/ContentAlignment;Z)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/amplitude/android/engagement/types/NudgeStepLayout;Ljava/lang/String;Ljava/lang/String;Lcom/amplitude/android/engagement/types/ContentAlignment;Lcom/amplitude/android/engagement/types/ContentAlignment;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/ModalFormFactor;Lzc3/c;Lyc3/g;)V", "component1", "()Lcom/amplitude/android/engagement/types/NudgeStepLayout;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/amplitude/android/engagement/types/ContentAlignment;", "component5", "component6", "()Z", "copy", "(Lcom/amplitude/android/engagement/types/NudgeStepLayout;Ljava/lang/String;Ljava/lang/String;Lcom/amplitude/android/engagement/types/ContentAlignment;Lcom/amplitude/android/engagement/types/ContentAlignment;Z)Lcom/amplitude/android/engagement/types/ModalFormFactor;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/amplitude/android/engagement/types/NudgeStepLayout;", "getLayout", "Ljava/lang/String;", "getTextAnimation", "getMediaPosition", "Lcom/amplitude/android/engagement/types/ContentAlignment;", "getTitleAlignment", "getContentAlignment", "Z", "getCanClickOutsideToClose", "Companion", "$serializer", "com/amplitude/android/engagement/types/o0", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37143h("modal")
@InterfaceC37144i
public final /* data */ class ModalFormFactor extends FormFactor {
    private static final InterfaceC37138c[] $childSerializers;
    public static final int $stable = 0;
    public static final C4920o0 Companion = new C4920o0();
    private final boolean canClickOutsideToClose;
    private final ContentAlignment contentAlignment;
    private final NudgeStepLayout layout;
    private final String mediaPosition;
    private final String textAnimation;
    private final ContentAlignment titleAlignment;

    static {
        InterfaceC37138c interfaceC37138cSerializer = NudgeStepLayout.Companion.serializer();
        C24426f c24426f = ContentAlignment.Companion;
        $childSerializers = new InterfaceC37138c[]{interfaceC37138cSerializer, null, null, c24426f.serializer(), c24426f.serializer(), null};
    }

    public ModalFormFactor() {
        this((NudgeStepLayout) null, (String) null, (String) null, (ContentAlignment) null, (ContentAlignment) null, false, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ModalFormFactor copy$default(ModalFormFactor modalFormFactor, NudgeStepLayout nudgeStepLayout, String str, String str2, ContentAlignment contentAlignment, ContentAlignment contentAlignment2, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            nudgeStepLayout = modalFormFactor.layout;
        }
        if ((i13 & 2) != 0) {
            str = modalFormFactor.textAnimation;
        }
        if ((i13 & 4) != 0) {
            str2 = modalFormFactor.mediaPosition;
        }
        if ((i13 & 8) != 0) {
            contentAlignment = modalFormFactor.titleAlignment;
        }
        if ((i13 & 16) != 0) {
            contentAlignment2 = modalFormFactor.contentAlignment;
        }
        if ((i13 & 32) != 0) {
            z4 = modalFormFactor.canClickOutsideToClose;
        }
        ContentAlignment contentAlignment3 = contentAlignment2;
        boolean z13 = z4;
        return modalFormFactor.copy(nudgeStepLayout, str, str2, contentAlignment, contentAlignment3, z13);
    }

    public static final /* synthetic */ void write$Self(ModalFormFactor self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        FormFactor.write$Self(self, output, serialDesc);
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.getLayout() != NudgeStepLayout.CLASSIC) {
            output.encodeSerializableElement(serialDesc, 0, interfaceC37138cArr[0], self.getLayout());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.getTextAnimation() != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.getTextAnimation());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.getMediaPosition() != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.getMediaPosition());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.getTitleAlignment() != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, interfaceC37138cArr[3], self.getTitleAlignment());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.getContentAlignment() != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, interfaceC37138cArr[4], self.getContentAlignment());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.canClickOutsideToClose) {
            output.encodeBooleanElement(serialDesc, 5, self.canClickOutsideToClose);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NudgeStepLayout getLayout() {
        return this.layout;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTextAnimation() {
        return this.textAnimation;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMediaPosition() {
        return this.mediaPosition;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ContentAlignment getTitleAlignment() {
        return this.titleAlignment;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ContentAlignment getContentAlignment() {
        return this.contentAlignment;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getCanClickOutsideToClose() {
        return this.canClickOutsideToClose;
    }

    public final ModalFormFactor copy(NudgeStepLayout layout, String textAnimation, String mediaPosition, ContentAlignment titleAlignment, ContentAlignment contentAlignment, boolean canClickOutsideToClose) {
        AbstractC22676k.m65750j(layout, "layout");
        return new ModalFormFactor(layout, textAnimation, mediaPosition, titleAlignment, contentAlignment, canClickOutsideToClose);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModalFormFactor)) {
            return false;
        }
        ModalFormFactor modalFormFactor = (ModalFormFactor) other;
        return this.layout == modalFormFactor.layout && AbstractC22676k.m65745e(this.textAnimation, modalFormFactor.textAnimation) && AbstractC22676k.m65745e(this.mediaPosition, modalFormFactor.mediaPosition) && this.titleAlignment == modalFormFactor.titleAlignment && this.contentAlignment == modalFormFactor.contentAlignment && this.canClickOutsideToClose == modalFormFactor.canClickOutsideToClose;
    }

    public final boolean getCanClickOutsideToClose() {
        return this.canClickOutsideToClose;
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

    @Override // com.amplitude.android.engagement.types.FormFactor
    public String getTextAnimation() {
        return this.textAnimation;
    }

    @Override // com.amplitude.android.engagement.types.FormFactor
    public ContentAlignment getTitleAlignment() {
        return this.titleAlignment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v16 */
    public int hashCode() {
        int iHashCode = this.layout.hashCode() * 31;
        String str = this.textAnimation;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mediaPosition;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ContentAlignment contentAlignment = this.titleAlignment;
        int iHashCode4 = (iHashCode3 + (contentAlignment == null ? 0 : contentAlignment.hashCode())) * 31;
        ContentAlignment contentAlignment2 = this.contentAlignment;
        int iHashCode5 = (iHashCode4 + (contentAlignment2 != null ? contentAlignment2.hashCode() : 0)) * 31;
        boolean z4 = this.canClickOutsideToClose;
        ?? r10 = z4;
        if (z4) {
            r10 = 1;
        }
        return iHashCode5 + r10;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("ModalFormFactor(layout=");
        sb4.append(this.layout);
        sb4.append(", textAnimation=");
        sb4.append(this.textAnimation);
        sb4.append(", mediaPosition=");
        sb4.append(this.mediaPosition);
        sb4.append(", titleAlignment=");
        sb4.append(this.titleAlignment);
        sb4.append(", contentAlignment=");
        sb4.append(this.contentAlignment);
        sb4.append(", canClickOutsideToClose=");
        return AbstractC2875y.m8305r(sb4, this.canClickOutsideToClose, ')');
    }

    @InterfaceC23457c
    public /* synthetic */ ModalFormFactor(int i13, NudgeStepLayout nudgeStepLayout, String str, String str2, ContentAlignment contentAlignment, ContentAlignment contentAlignment2, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        super(i13, serializationConstructorMarker);
        this.layout = (i13 & 1) == 0 ? NudgeStepLayout.CLASSIC : nudgeStepLayout;
        if ((i13 & 2) == 0) {
            this.textAnimation = null;
        } else {
            this.textAnimation = str;
        }
        if ((i13 & 4) == 0) {
            this.mediaPosition = null;
        } else {
            this.mediaPosition = str2;
        }
        if ((i13 & 8) == 0) {
            this.titleAlignment = null;
        } else {
            this.titleAlignment = contentAlignment;
        }
        if ((i13 & 16) == 0) {
            this.contentAlignment = null;
        } else {
            this.contentAlignment = contentAlignment2;
        }
        if ((i13 & 32) == 0) {
            this.canClickOutsideToClose = false;
        } else {
            this.canClickOutsideToClose = z4;
        }
    }

    public /* synthetic */ ModalFormFactor(NudgeStepLayout nudgeStepLayout, String str, String str2, ContentAlignment contentAlignment, ContentAlignment contentAlignment2, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? NudgeStepLayout.CLASSIC : nudgeStepLayout, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : contentAlignment, (i13 & 16) != 0 ? null : contentAlignment2, (i13 & 32) != 0 ? false : z4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalFormFactor(NudgeStepLayout layout, String str, String str2, ContentAlignment contentAlignment, ContentAlignment contentAlignment2, boolean z4) {
        super(null);
        AbstractC22676k.m65750j(layout, "layout");
        this.layout = layout;
        this.textAnimation = str;
        this.mediaPosition = str2;
        this.titleAlignment = contentAlignment;
        this.contentAlignment = contentAlignment2;
        this.canClickOutsideToClose = z4;
    }
}
