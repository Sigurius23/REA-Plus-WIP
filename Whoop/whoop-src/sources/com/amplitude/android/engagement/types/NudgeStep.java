package com.amplitude.android.engagement.types;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.weeklyplan.api.WeeklyPlanApiKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.InterfaceC23457c;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBQ\b\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÇ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b#\u0010$JJ\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u001eJ\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001cJ\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b6\u0010$¨\u0006:"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/NudgeStep;", "", "", "id", "", "title", "", "Lcom/amplitude/android/engagement/types/ContentBlock;", "content", "Lcom/amplitude/android/engagement/types/FormFactor;", "formFactor", "Lcom/amplitude/android/engagement/types/Goal;", WeeklyPlanApiKt.GOAL, "<init>", "(ILjava/lang/String;Ljava/util/List;Lcom/amplitude/android/engagement/types/FormFactor;Lcom/amplitude/android/engagement/types/Goal;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/util/List;Lcom/amplitude/android/engagement/types/FormFactor;Lcom/amplitude/android/engagement/types/Goal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/NudgeStep;Lzc3/c;Lyc3/g;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "component4", "()Lcom/amplitude/android/engagement/types/FormFactor;", "component5", "()Lcom/amplitude/android/engagement/types/Goal;", "copy", "(ILjava/lang/String;Ljava/util/List;Lcom/amplitude/android/engagement/types/FormFactor;Lcom/amplitude/android/engagement/types/Goal;)Lcom/amplitude/android/engagement/types/NudgeStep;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getContent", "Lcom/amplitude/android/engagement/types/FormFactor;", "getFormFactor", "Lcom/amplitude/android/engagement/types/Goal;", "getGoal", "Companion", "$serializer", "com/amplitude/android/engagement/types/v0", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class NudgeStep {
    public static final int $stable = 8;
    private final List<ContentBlock> content;
    private final FormFactor formFactor;
    private final Goal goal;
    private final int id;
    private final String title;
    public static final C4941v0 Companion = new C4941v0();
    private static final InterfaceC37138c[] $childSerializers = {null, null, new ArrayListSerializer(ContentBlock.Companion.serializer()), FormFactor.Companion.serializer(), Goal.Companion.serializer()};

    @InterfaceC23457c
    public /* synthetic */ NudgeStep(int i13, int i14, String str, List list, FormFactor formFactor, Goal goal, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, NudgeStep$$serializer.INSTANCE.getDescriptor());
        }
        this.id = i14;
        this.title = str;
        this.content = list;
        this.formFactor = formFactor;
        if ((i13 & 16) == 0) {
            this.goal = null;
        } else {
            this.goal = goal;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NudgeStep copy$default(NudgeStep nudgeStep, int i13, String str, List list, FormFactor formFactor, Goal goal, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = nudgeStep.id;
        }
        if ((i14 & 2) != 0) {
            str = nudgeStep.title;
        }
        if ((i14 & 4) != 0) {
            list = nudgeStep.content;
        }
        if ((i14 & 8) != 0) {
            formFactor = nudgeStep.formFactor;
        }
        if ((i14 & 16) != 0) {
            goal = nudgeStep.goal;
        }
        Goal goal2 = goal;
        List list2 = list;
        return nudgeStep.copy(i13, str, list2, formFactor, goal2);
    }

    public static final /* synthetic */ void write$Self(NudgeStep self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        output.encodeIntElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeSerializableElement(serialDesc, 2, interfaceC37138cArr[2], self.content);
        output.encodeSerializableElement(serialDesc, 3, interfaceC37138cArr[3], self.formFactor);
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.goal == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, interfaceC37138cArr[4], self.goal);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<ContentBlock> component3() {
        return this.content;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final FormFactor getFormFactor() {
        return this.formFactor;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Goal getGoal() {
        return this.goal;
    }

    public final NudgeStep copy(int id4, String title, List<? extends ContentBlock> content, FormFactor formFactor, Goal goal) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(content, "content");
        AbstractC22676k.m65750j(formFactor, "formFactor");
        return new NudgeStep(id4, title, content, formFactor, goal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NudgeStep)) {
            return false;
        }
        NudgeStep nudgeStep = (NudgeStep) other;
        return this.id == nudgeStep.id && AbstractC22676k.m65745e(this.title, nudgeStep.title) && AbstractC22676k.m65745e(this.content, nudgeStep.content) && AbstractC22676k.m65745e(this.formFactor, nudgeStep.formFactor) && AbstractC22676k.m65745e(this.goal, nudgeStep.goal);
    }

    public final List<ContentBlock> getContent() {
        return this.content;
    }

    public final FormFactor getFormFactor() {
        return this.formFactor;
    }

    public final Goal getGoal() {
        return this.goal;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = (this.formFactor.hashCode() + AbstractC11895b.m31983b(AbstractC11266d.m30450d(Integer.hashCode(this.id) * 31, 31, this.title), 31, this.content)) * 31;
        Goal goal = this.goal;
        return iHashCode + (goal == null ? 0 : goal.hashCode());
    }

    public String toString() {
        return "NudgeStep(id=" + this.id + ", title=" + this.title + ", content=" + this.content + ", formFactor=" + this.formFactor + ", goal=" + this.goal + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NudgeStep(int i13, String title, List<? extends ContentBlock> content, FormFactor formFactor, Goal goal) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(content, "content");
        AbstractC22676k.m65750j(formFactor, "formFactor");
        this.id = i13;
        this.title = title;
        this.content = content;
        this.formFactor = formFactor;
        this.goal = goal;
    }

    public /* synthetic */ NudgeStep(int i13, String str, List list, FormFactor formFactor, Goal goal, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, str, list, formFactor, (i14 & 16) != 0 ? null : goal);
    }
}
