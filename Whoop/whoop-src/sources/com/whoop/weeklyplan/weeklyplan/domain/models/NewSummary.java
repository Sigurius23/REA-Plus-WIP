package com.whoop.weeklyplan.weeklyplan.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import ur0.C35180a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fBI\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b!\u0010\"JB\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b%\u0010 J\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010\"¨\u00066"}, m65681d2 = {"Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;", "", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;", "progressBar", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/ChallengeProgressBar;", "challengeProgressBar", "", "overrideImage", "", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummaryItem;", "items", "<init>", "(Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ChallengeProgressBar;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ChallengeProgressBar;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;", "component2", "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/ChallengeProgressBar;", "component3", "()Ljava/lang/String;", "component4", "()Ljava/util/List;", "copy", "(Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ChallengeProgressBar;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;", "getProgressBar", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/ChallengeProgressBar;", "getChallengeProgressBar", "Ljava/lang/String;", "getOverrideImage", "Ljava/util/List;", "getItems", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class NewSummary {
    private final ChallengeProgressBar challengeProgressBar;
    private final List<NewSummaryItem> items;
    private final String overrideImage;
    private final ProgressBarModel progressBar;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C35180a(29))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return NewSummary$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ NewSummary(int i13, ProgressBarModel progressBarModel, ChallengeProgressBar challengeProgressBar, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, NewSummary$$serializer.INSTANCE.getDescriptor());
        }
        this.progressBar = progressBarModel;
        this.challengeProgressBar = challengeProgressBar;
        this.overrideImage = str;
        this.items = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(NewSummaryItem$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewSummary copy$default(NewSummary newSummary, ProgressBarModel progressBarModel, ChallengeProgressBar challengeProgressBar, String str, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            progressBarModel = newSummary.progressBar;
        }
        if ((i13 & 2) != 0) {
            challengeProgressBar = newSummary.challengeProgressBar;
        }
        if ((i13 & 4) != 0) {
            str = newSummary.overrideImage;
        }
        if ((i13 & 8) != 0) {
            list = newSummary.items;
        }
        return newSummary.copy(progressBarModel, challengeProgressBar, str, list);
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(NewSummary self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, ProgressBarModel$$serializer.INSTANCE, self.progressBar);
        output.encodeNullableSerializableElement(serialDesc, 1, ChallengeProgressBar$$serializer.INSTANCE, self.challengeProgressBar);
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.overrideImage);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.items);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ProgressBarModel getProgressBar() {
        return this.progressBar;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ChallengeProgressBar getChallengeProgressBar() {
        return this.challengeProgressBar;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOverrideImage() {
        return this.overrideImage;
    }

    public final List<NewSummaryItem> component4() {
        return this.items;
    }

    public final NewSummary copy(ProgressBarModel progressBar, ChallengeProgressBar challengeProgressBar, String overrideImage, List<NewSummaryItem> items) {
        AbstractC22676k.m65750j(progressBar, "progressBar");
        AbstractC22676k.m65750j(items, "items");
        return new NewSummary(progressBar, challengeProgressBar, overrideImage, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewSummary)) {
            return false;
        }
        NewSummary newSummary = (NewSummary) other;
        return AbstractC22676k.m65745e(this.progressBar, newSummary.progressBar) && AbstractC22676k.m65745e(this.challengeProgressBar, newSummary.challengeProgressBar) && AbstractC22676k.m65745e(this.overrideImage, newSummary.overrideImage) && AbstractC22676k.m65745e(this.items, newSummary.items);
    }

    public final ChallengeProgressBar getChallengeProgressBar() {
        return this.challengeProgressBar;
    }

    public final List<NewSummaryItem> getItems() {
        return this.items;
    }

    public final String getOverrideImage() {
        return this.overrideImage;
    }

    public final ProgressBarModel getProgressBar() {
        return this.progressBar;
    }

    public int hashCode() {
        int iHashCode = this.progressBar.hashCode() * 31;
        ChallengeProgressBar challengeProgressBar = this.challengeProgressBar;
        int iHashCode2 = (iHashCode + (challengeProgressBar == null ? 0 : challengeProgressBar.hashCode())) * 31;
        String str = this.overrideImage;
        return this.items.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        ProgressBarModel progressBarModel = this.progressBar;
        ChallengeProgressBar challengeProgressBar = this.challengeProgressBar;
        String str = this.overrideImage;
        List<NewSummaryItem> list = this.items;
        StringBuilder sb4 = new StringBuilder("NewSummary(progressBar=");
        sb4.append(progressBarModel);
        sb4.append(", challengeProgressBar=");
        sb4.append(challengeProgressBar);
        sb4.append(", overrideImage=");
        return AbstractC30007c.m91840j(str, ", items=", ")", sb4, list);
    }

    public NewSummary(ProgressBarModel progressBar, ChallengeProgressBar challengeProgressBar, String str, List<NewSummaryItem> items) {
        AbstractC22676k.m65750j(progressBar, "progressBar");
        AbstractC22676k.m65750j(items, "items");
        this.progressBar = progressBar;
        this.challengeProgressBar = challengeProgressBar;
        this.overrideImage = str;
        this.items = items;
    }
}
