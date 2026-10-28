package com.amplitude.android.engagement.types;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import p305lj.C24426f;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002CDBA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eBi\b\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\r\u0010\u0016J(\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aHÇ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b)\u0010(JP\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b,\u0010(J\u0010\u0010-\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u00020\u00062\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010$R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010&R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010(R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b=\u0010(R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010>\u001a\u0004\b?\u0010@R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010>\u001a\u0004\bA\u0010@¨\u0006E"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/BannerFormFactor;", "Lcom/amplitude/android/engagement/types/FormFactor;", "Lcom/amplitude/android/engagement/types/BannerPosition;", "position", "Lcom/amplitude/android/engagement/types/BannerPlacement;", "placement", "", "sticky", "Lcom/amplitude/android/engagement/types/NudgeStepLayout;", "layout", "", "textAnimation", "mediaPosition", "<init>", "(Lcom/amplitude/android/engagement/types/BannerPosition;Lcom/amplitude/android/engagement/types/BannerPlacement;ZLcom/amplitude/android/engagement/types/NudgeStepLayout;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lcom/amplitude/android/engagement/types/ContentAlignment;", "titleAlignment", "contentAlignment", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/amplitude/android/engagement/types/BannerPosition;Lcom/amplitude/android/engagement/types/BannerPlacement;ZLcom/amplitude/android/engagement/types/NudgeStepLayout;Ljava/lang/String;Ljava/lang/String;Lcom/amplitude/android/engagement/types/ContentAlignment;Lcom/amplitude/android/engagement/types/ContentAlignment;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/BannerFormFactor;Lzc3/c;Lyc3/g;)V", "component1", "()Lcom/amplitude/android/engagement/types/BannerPosition;", "component2", "()Lcom/amplitude/android/engagement/types/BannerPlacement;", "component3", "()Z", "component4", "()Lcom/amplitude/android/engagement/types/NudgeStepLayout;", "component5", "()Ljava/lang/String;", "component6", "copy", "(Lcom/amplitude/android/engagement/types/BannerPosition;Lcom/amplitude/android/engagement/types/BannerPlacement;ZLcom/amplitude/android/engagement/types/NudgeStepLayout;Ljava/lang/String;Ljava/lang/String;)Lcom/amplitude/android/engagement/types/BannerFormFactor;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/amplitude/android/engagement/types/BannerPosition;", "getPosition", "Lcom/amplitude/android/engagement/types/BannerPlacement;", "getPlacement", "Z", "getSticky", "Lcom/amplitude/android/engagement/types/NudgeStepLayout;", "getLayout", "Ljava/lang/String;", "getTextAnimation", "getMediaPosition", "Lcom/amplitude/android/engagement/types/ContentAlignment;", "getTitleAlignment", "()Lcom/amplitude/android/engagement/types/ContentAlignment;", "getContentAlignment", "Companion", "$serializer", "com/amplitude/android/engagement/types/e", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37143h("banner")
@InterfaceC37144i
public final /* data */ class BannerFormFactor extends FormFactor {
    private static final InterfaceC37138c[] $childSerializers;
    public static final int $stable = 0;
    public static final C4880e Companion = new C4880e();
    private final ContentAlignment contentAlignment;
    private final NudgeStepLayout layout;
    private final String mediaPosition;
    private final BannerPlacement placement;
    private final BannerPosition position;
    private final boolean sticky;
    private final String textAnimation;
    private final ContentAlignment titleAlignment;

    static {
        InterfaceC37138c interfaceC37138cSerializer = BannerPosition.Companion.serializer();
        InterfaceC37138c interfaceC37138cSerializer2 = BannerPlacement.Companion.serializer();
        InterfaceC37138c interfaceC37138cSerializer3 = NudgeStepLayout.Companion.serializer();
        C24426f c24426f = ContentAlignment.Companion;
        $childSerializers = new InterfaceC37138c[]{interfaceC37138cSerializer, interfaceC37138cSerializer2, null, interfaceC37138cSerializer3, null, null, c24426f.serializer(), c24426f.serializer()};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC23457c
    public /* synthetic */ BannerFormFactor(int i13, BannerPosition bannerPosition, BannerPlacement bannerPlacement, boolean z4, NudgeStepLayout nudgeStepLayout, String str, String str2, ContentAlignment contentAlignment, ContentAlignment contentAlignment2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i13, serializationConstructorMarker);
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, BannerFormFactor$$serializer.INSTANCE.getDescriptor());
        }
        this.position = bannerPosition;
        this.placement = bannerPlacement;
        this.sticky = z4;
        if ((i13 & 8) == 0) {
            this.layout = NudgeStepLayout.CLASSIC;
        } else {
            this.layout = nudgeStepLayout;
        }
        if ((i13 & 16) == 0) {
            this.textAnimation = null;
        } else {
            this.textAnimation = str;
        }
        if ((i13 & 32) == 0) {
            this.mediaPosition = null;
        } else {
            this.mediaPosition = str2;
        }
        if ((i13 & 64) == 0) {
            this.titleAlignment = null;
        } else {
            this.titleAlignment = contentAlignment;
        }
        if ((i13 & 128) == 0) {
            this.contentAlignment = null;
        } else {
            this.contentAlignment = contentAlignment2;
        }
    }

    public static /* synthetic */ BannerFormFactor copy$default(BannerFormFactor bannerFormFactor, BannerPosition bannerPosition, BannerPlacement bannerPlacement, boolean z4, NudgeStepLayout nudgeStepLayout, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            bannerPosition = bannerFormFactor.position;
        }
        if ((i13 & 2) != 0) {
            bannerPlacement = bannerFormFactor.placement;
        }
        if ((i13 & 4) != 0) {
            z4 = bannerFormFactor.sticky;
        }
        if ((i13 & 8) != 0) {
            nudgeStepLayout = bannerFormFactor.layout;
        }
        if ((i13 & 16) != 0) {
            str = bannerFormFactor.textAnimation;
        }
        if ((i13 & 32) != 0) {
            str2 = bannerFormFactor.mediaPosition;
        }
        String str3 = str;
        String str4 = str2;
        return bannerFormFactor.copy(bannerPosition, bannerPlacement, z4, nudgeStepLayout, str3, str4);
    }

    public static final /* synthetic */ void write$Self(BannerFormFactor self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        FormFactor.write$Self(self, output, serialDesc);
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, interfaceC37138cArr[0], self.position);
        output.encodeSerializableElement(serialDesc, 1, interfaceC37138cArr[1], self.placement);
        output.encodeBooleanElement(serialDesc, 2, self.sticky);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.getLayout() != NudgeStepLayout.CLASSIC) {
            output.encodeSerializableElement(serialDesc, 3, interfaceC37138cArr[3], self.getLayout());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.getTextAnimation() != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.getTextAnimation());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.getMediaPosition() != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.getMediaPosition());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.getTitleAlignment() != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, interfaceC37138cArr[6], self.getTitleAlignment());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.getContentAlignment() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, interfaceC37138cArr[7], self.getContentAlignment());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BannerPosition getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BannerPlacement getPlacement() {
        return this.placement;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getSticky() {
        return this.sticky;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final NudgeStepLayout getLayout() {
        return this.layout;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTextAnimation() {
        return this.textAnimation;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMediaPosition() {
        return this.mediaPosition;
    }

    public final BannerFormFactor copy(BannerPosition position, BannerPlacement placement, boolean sticky, NudgeStepLayout layout, String textAnimation, String mediaPosition) {
        AbstractC22676k.m65750j(position, "position");
        AbstractC22676k.m65750j(placement, "placement");
        AbstractC22676k.m65750j(layout, "layout");
        return new BannerFormFactor(position, placement, sticky, layout, textAnimation, mediaPosition);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerFormFactor)) {
            return false;
        }
        BannerFormFactor bannerFormFactor = (BannerFormFactor) other;
        return this.position == bannerFormFactor.position && this.placement == bannerFormFactor.placement && this.sticky == bannerFormFactor.sticky && this.layout == bannerFormFactor.layout && AbstractC22676k.m65745e(this.textAnimation, bannerFormFactor.textAnimation) && AbstractC22676k.m65745e(this.mediaPosition, bannerFormFactor.mediaPosition);
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

    public final BannerPlacement getPlacement() {
        return this.placement;
    }

    public final BannerPosition getPosition() {
        return this.position;
    }

    public final boolean getSticky() {
        return this.sticky;
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
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public int hashCode() {
        int iHashCode = (this.placement.hashCode() + (this.position.hashCode() * 31)) * 31;
        boolean z4 = this.sticky;
        ?? r10 = z4;
        if (z4) {
            r10 = 1;
        }
        int iHashCode2 = (this.layout.hashCode() + ((iHashCode + r10) * 31)) * 31;
        String str = this.textAnimation;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mediaPosition;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("BannerFormFactor(position=");
        sb4.append(this.position);
        sb4.append(", placement=");
        sb4.append(this.placement);
        sb4.append(", sticky=");
        sb4.append(this.sticky);
        sb4.append(", layout=");
        sb4.append(this.layout);
        sb4.append(", textAnimation=");
        sb4.append(this.textAnimation);
        sb4.append(", mediaPosition=");
        return AbstractC25012a.m73377j(sb4, this.mediaPosition, ')');
    }

    public /* synthetic */ BannerFormFactor(BannerPosition bannerPosition, BannerPlacement bannerPlacement, boolean z4, NudgeStepLayout nudgeStepLayout, String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(bannerPosition, bannerPlacement, z4, (i13 & 8) != 0 ? NudgeStepLayout.CLASSIC : nudgeStepLayout, (i13 & 16) != 0 ? null : str, (i13 & 32) != 0 ? null : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerFormFactor(BannerPosition position, BannerPlacement placement, boolean z4, NudgeStepLayout layout, String str, String str2) {
        super(null);
        AbstractC22676k.m65750j(position, "position");
        AbstractC22676k.m65750j(placement, "placement");
        AbstractC22676k.m65750j(layout, "layout");
        this.position = position;
        this.placement = placement;
        this.sticky = z4;
        this.layout = layout;
        this.textAnimation = str;
        this.mediaPosition = str2;
    }
}
