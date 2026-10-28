package com.whoop.profile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import com.whoop.profile.C9691R;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ViewOnboardingSegmentBarBinding extends AbstractC1168a0 {
    public final View first;
    public final View fourth;
    public final View second;
    public final View third;

    public ViewOnboardingSegmentBarBinding(Object obj, View view, int i13, View view2, View view3, View view4, View view5) {
        super(view, i13, obj);
        this.first = view2;
        this.fourth = view3;
        this.second = view4;
        this.third = view5;
    }

    public static ViewOnboardingSegmentBarBinding bind(View view) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return bind(view, null);
    }

    public static ViewOnboardingSegmentBarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return inflate(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    public static ViewOnboardingSegmentBarBinding bind(View view, Object obj) {
        return (ViewOnboardingSegmentBarBinding) AbstractC1168a0.bind(obj, view, C9691R.layout.view_onboarding_segment_bar);
    }

    @Deprecated
    public static ViewOnboardingSegmentBarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (ViewOnboardingSegmentBarBinding) AbstractC1168a0.inflateInternal(layoutInflater, C9691R.layout.view_onboarding_segment_bar, viewGroup, z4, obj);
    }

    public static ViewOnboardingSegmentBarBinding inflate(LayoutInflater layoutInflater) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return inflate(layoutInflater, null);
    }

    @Deprecated
    public static ViewOnboardingSegmentBarBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ViewOnboardingSegmentBarBinding) AbstractC1168a0.inflateInternal(layoutInflater, C9691R.layout.view_onboarding_segment_bar, null, false, obj);
    }
}
