package com.whoop.home.domain.models;

import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import te0.AbstractC33745d;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import we1.C37224h;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HGBk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0087\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0010\u0010$\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b$\u0010%J\u008a\u0001\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0018J\u0010\u0010)\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.J'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b5\u00106R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b:\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b;\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b<\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010=\u001a\u0004\b>\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b?\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b@\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010A\u001a\u0004\bB\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bC\u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\bD\u0010!R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010E\u001a\u0004\bF\u0010%¨\u0006I"}, m65681d2 = {"Lcom/whoop/home/domain/models/ScoreGaugeStickyDialModel;", "", "", "id", "title", "scoreDisplay", "scoreDisplaySuffix", "", "gaugeFillPercentage", "progressFillStyle", "titleEndIcon", "scoreTarget", "lowerOptimalPercentage", "higherOptimalPercentage", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()F", "component6", "component7", "component8", "()Ljava/lang/Float;", "component9", "component10", "component11", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Lcom/whoop/navigation/e;)Lcom/whoop/home/domain/models/ScoreGaugeStickyDialModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$home_release", "(Lcom/whoop/home/domain/models/ScoreGaugeStickyDialModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getTitle", "getScoreDisplay", "getScoreDisplaySuffix", "F", "getGaugeFillPercentage", "getProgressFillStyle", "getTitleEndIcon", "Ljava/lang/Float;", "getScoreTarget", "getLowerOptimalPercentage", "getHigherOptimalPercentage", "Lcom/whoop/navigation/e;", "getDestination", "Companion", "$serializer", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ScoreGaugeStickyDialModel {
    private final C9598e destination;
    private final float gaugeFillPercentage;
    private final Float higherOptimalPercentage;
    private final String id;
    private final Float lowerOptimalPercentage;
    private final String progressFillStyle;
    private final String scoreDisplay;
    private final String scoreDisplaySuffix;
    private final Float scoreTarget;
    private final String title;
    private final String titleEndIcon;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C37224h(24))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/home/domain/models/ScoreGaugeStickyDialModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/home/domain/models/ScoreGaugeStickyDialModel;", "serializer", "()Lwc3/c;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ScoreGaugeStickyDialModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ScoreGaugeStickyDialModel(int i13, String str, String str2, String str3, String str4, float f13, String str5, String str6, Float f14, Float f15, Float f16, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i13 & 2047)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2047, ScoreGaugeStickyDialModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.title = str2;
        this.scoreDisplay = str3;
        this.scoreDisplaySuffix = str4;
        this.gaugeFillPercentage = f13;
        this.progressFillStyle = str5;
        this.titleEndIcon = str6;
        this.scoreTarget = f14;
        this.lowerOptimalPercentage = f15;
        this.higherOptimalPercentage = f16;
        this.destination = c9598e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ ScoreGaugeStickyDialModel copy$default(ScoreGaugeStickyDialModel scoreGaugeStickyDialModel, String str, String str2, String str3, String str4, float f13, String str5, String str6, Float f14, Float f15, Float f16, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = scoreGaugeStickyDialModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = scoreGaugeStickyDialModel.title;
        }
        if ((i13 & 4) != 0) {
            str3 = scoreGaugeStickyDialModel.scoreDisplay;
        }
        if ((i13 & 8) != 0) {
            str4 = scoreGaugeStickyDialModel.scoreDisplaySuffix;
        }
        if ((i13 & 16) != 0) {
            f13 = scoreGaugeStickyDialModel.gaugeFillPercentage;
        }
        if ((i13 & 32) != 0) {
            str5 = scoreGaugeStickyDialModel.progressFillStyle;
        }
        if ((i13 & 64) != 0) {
            str6 = scoreGaugeStickyDialModel.titleEndIcon;
        }
        if ((i13 & 128) != 0) {
            f14 = scoreGaugeStickyDialModel.scoreTarget;
        }
        if ((i13 & 256) != 0) {
            f15 = scoreGaugeStickyDialModel.lowerOptimalPercentage;
        }
        if ((i13 & 512) != 0) {
            f16 = scoreGaugeStickyDialModel.higherOptimalPercentage;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            c9598e = scoreGaugeStickyDialModel.destination;
        }
        Float f17 = f16;
        C9598e c9598e2 = c9598e;
        Float f18 = f14;
        Float f19 = f15;
        String str7 = str5;
        String str8 = str6;
        float f24 = f13;
        String str9 = str3;
        return scoreGaugeStickyDialModel.copy(str, str2, str9, str4, f24, str7, str8, f18, f19, f17, c9598e2);
    }

    public static final /* synthetic */ void write$Self$home_release(ScoreGaugeStickyDialModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.id);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.scoreDisplay);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.scoreDisplaySuffix);
        output.encodeFloatElement(serialDesc, 4, self.gaugeFillPercentage);
        output.encodeStringElement(serialDesc, 5, self.progressFillStyle);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.titleEndIcon);
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 7, floatSerializer, self.scoreTarget);
        output.encodeNullableSerializableElement(serialDesc, 8, floatSerializer, self.lowerOptimalPercentage);
        output.encodeNullableSerializableElement(serialDesc, 9, floatSerializer, self.higherOptimalPercentage);
        output.encodeSerializableElement(serialDesc, 10, (InterfaceC37145j) interfaceC23462hArr[10].getValue(), self.destination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Float getHigherOptimalPercentage() {
        return this.higherOptimalPercentage;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getScoreDisplay() {
        return this.scoreDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getScoreDisplaySuffix() {
        return this.scoreDisplaySuffix;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getGaugeFillPercentage() {
        return this.gaugeFillPercentage;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getProgressFillStyle() {
        return this.progressFillStyle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTitleEndIcon() {
        return this.titleEndIcon;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Float getScoreTarget() {
        return this.scoreTarget;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Float getLowerOptimalPercentage() {
        return this.lowerOptimalPercentage;
    }

    public final ScoreGaugeStickyDialModel copy(String id4, String title, String scoreDisplay, String scoreDisplaySuffix, float gaugeFillPercentage, String progressFillStyle, String titleEndIcon, Float scoreTarget, Float lowerOptimalPercentage, Float higherOptimalPercentage, C9598e destination) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(scoreDisplay, "scoreDisplay");
        AbstractC22676k.m65750j(progressFillStyle, "progressFillStyle");
        AbstractC22676k.m65750j(destination, "destination");
        return new ScoreGaugeStickyDialModel(id4, title, scoreDisplay, scoreDisplaySuffix, gaugeFillPercentage, progressFillStyle, titleEndIcon, scoreTarget, lowerOptimalPercentage, higherOptimalPercentage, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScoreGaugeStickyDialModel)) {
            return false;
        }
        ScoreGaugeStickyDialModel scoreGaugeStickyDialModel = (ScoreGaugeStickyDialModel) other;
        return AbstractC22676k.m65745e(this.id, scoreGaugeStickyDialModel.id) && AbstractC22676k.m65745e(this.title, scoreGaugeStickyDialModel.title) && AbstractC22676k.m65745e(this.scoreDisplay, scoreGaugeStickyDialModel.scoreDisplay) && AbstractC22676k.m65745e(this.scoreDisplaySuffix, scoreGaugeStickyDialModel.scoreDisplaySuffix) && Float.compare(this.gaugeFillPercentage, scoreGaugeStickyDialModel.gaugeFillPercentage) == 0 && AbstractC22676k.m65745e(this.progressFillStyle, scoreGaugeStickyDialModel.progressFillStyle) && AbstractC22676k.m65745e(this.titleEndIcon, scoreGaugeStickyDialModel.titleEndIcon) && AbstractC22676k.m65745e(this.scoreTarget, scoreGaugeStickyDialModel.scoreTarget) && AbstractC22676k.m65745e(this.lowerOptimalPercentage, scoreGaugeStickyDialModel.lowerOptimalPercentage) && AbstractC22676k.m65745e(this.higherOptimalPercentage, scoreGaugeStickyDialModel.higherOptimalPercentage) && AbstractC22676k.m65745e(this.destination, scoreGaugeStickyDialModel.destination);
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final float getGaugeFillPercentage() {
        return this.gaugeFillPercentage;
    }

    public final Float getHigherOptimalPercentage() {
        return this.higherOptimalPercentage;
    }

    public final String getId() {
        return this.id;
    }

    public final Float getLowerOptimalPercentage() {
        return this.lowerOptimalPercentage;
    }

    public final String getProgressFillStyle() {
        return this.progressFillStyle;
    }

    public final String getScoreDisplay() {
        return this.scoreDisplay;
    }

    public final String getScoreDisplaySuffix() {
        return this.scoreDisplaySuffix;
    }

    public final Float getScoreTarget() {
        return this.scoreTarget;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleEndIcon() {
        return this.titleEndIcon;
    }

    public int hashCode() {
        String str = this.id;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.title), 31, this.scoreDisplay);
        String str2 = this.scoreDisplaySuffix;
        int iM30450d2 = AbstractC11266d.m30450d(AbstractC11266d.m30447a(this.gaugeFillPercentage, (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.progressFillStyle);
        String str3 = this.titleEndIcon;
        int iHashCode = (iM30450d2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f13 = this.scoreTarget;
        int iHashCode2 = (iHashCode + (f13 == null ? 0 : f13.hashCode())) * 31;
        Float f14 = this.lowerOptimalPercentage;
        int iHashCode3 = (iHashCode2 + (f14 == null ? 0 : f14.hashCode())) * 31;
        Float f15 = this.higherOptimalPercentage;
        return this.destination.hashCode() + ((iHashCode3 + (f15 != null ? f15.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.scoreDisplay;
        String str4 = this.scoreDisplaySuffix;
        float f13 = this.gaugeFillPercentage;
        String str5 = this.progressFillStyle;
        String str6 = this.titleEndIcon;
        Float f14 = this.scoreTarget;
        Float f15 = this.lowerOptimalPercentage;
        Float f16 = this.higherOptimalPercentage;
        C9598e c9598e = this.destination;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ScoreGaugeStickyDialModel(id=", str, ", title=", str2, ", scoreDisplay=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", scoreDisplaySuffix=", str4, ", gaugeFillPercentage=");
        sbM32001t.append(f13);
        sbM32001t.append(", progressFillStyle=");
        sbM32001t.append(str5);
        sbM32001t.append(", titleEndIcon=");
        sbM32001t.append(str6);
        sbM32001t.append(", scoreTarget=");
        sbM32001t.append(f14);
        sbM32001t.append(", lowerOptimalPercentage=");
        sbM32001t.append(f15);
        sbM32001t.append(", higherOptimalPercentage=");
        sbM32001t.append(f16);
        sbM32001t.append(", destination=");
        return AbstractC33745d.m106656o(sbM32001t, c9598e, ")");
    }

    public ScoreGaugeStickyDialModel(String str, String title, String scoreDisplay, String str2, float f13, String progressFillStyle, String str3, Float f14, Float f15, Float f16, C9598e destination) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(scoreDisplay, "scoreDisplay");
        AbstractC22676k.m65750j(progressFillStyle, "progressFillStyle");
        AbstractC22676k.m65750j(destination, "destination");
        this.id = str;
        this.title = title;
        this.scoreDisplay = scoreDisplay;
        this.scoreDisplaySuffix = str2;
        this.gaugeFillPercentage = f13;
        this.progressFillStyle = progressFillStyle;
        this.titleEndIcon = str3;
        this.scoreTarget = f14;
        this.lowerOptimalPercentage = f15;
        this.higherOptimalPercentage = f16;
        this.destination = destination;
    }
}
