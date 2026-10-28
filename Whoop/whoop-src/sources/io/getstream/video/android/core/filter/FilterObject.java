package io.getstream.video.android.core.filter;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import p479s4.AbstractC32120a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w33.C36792a;
import w33.C36793b;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fHÇ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0001\u0001\u0019¨\u0006\u001a"}, m65681d2 = {"Lio/getstream/video/android/core/filter/FilterObject;", "", "<init>", "()V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lio/getstream/video/android/core/filter/FilterObject;Lzc3/c;Lyc3/g;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Companion", "w33/b", "Lw33/c;", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
@InterfaceC37144i
public abstract class FilterObject {
    public static final C36793b Companion = new C36793b();
    private static final InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, C36792a.f157408w);

    public /* synthetic */ FilterObject(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ void write$Self(FilterObject self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
    }

    public boolean equals(Object other) {
        if (other instanceof FilterObject) {
            return AbstractC32120a.m99987n(this).equals(AbstractC32120a.m99987n((FilterObject) other));
        }
        return false;
    }

    public int hashCode() {
        return AbstractC32120a.m99987n(this).hashCode();
    }

    private FilterObject() {
    }

    @InterfaceC23457c
    public /* synthetic */ FilterObject(int i13, SerializationConstructorMarker serializationConstructorMarker) {
    }
}
