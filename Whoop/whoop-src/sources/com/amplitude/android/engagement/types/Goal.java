package com.amplitude.android.engagement.types;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import p305lj.C24438l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fHÇ\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0004\u0013\u0014\u0015\u0016¨\u0006\u0017"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/Goal;", "", "<init>", "()V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/Goal;Lzc3/c;Lyc3/g;)V", "Companion", "lj/l", "Lcom/amplitude/android/engagement/types/CTAClickedGoal;", "Lcom/amplitude/android/engagement/types/ElementClickedGoal;", "Lcom/amplitude/android/engagement/types/EventTrackedGoal;", "Lcom/amplitude/android/engagement/types/PageVisitedGoal;", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public abstract class Goal {
    public static final int $stable = 0;
    public static final C24438l Companion = new C24438l();
    private static final InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, C4865a0.f20282w);

    public /* synthetic */ Goal(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ void write$Self(Goal self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
    }

    private Goal() {
    }

    @InterfaceC23457c
    public /* synthetic */ Goal(int i13, SerializationConstructorMarker serializationConstructorMarker) {
    }
}
