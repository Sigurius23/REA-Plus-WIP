package com.whoop.profile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import com.whoop.profile.C9691R;

/* JADX INFO: loaded from: classes7.dex */
public abstract class MemberLevelsCurrentViewBinding extends AbstractC1168a0 {
    public final TextView currentLevel;
    public final ImageView currentLevelBadge;
    public final ImageView currentLevelMiniBadge;
    public final TextView currentLevelProgressText;
    public final TextView currentTier;
    public final ViewOnboardingSegmentBarBinding levelOnboardingSegmentBar;
    public final ProgressBar levelProgressBar;
    public final ImageView nextLevelMiniBadge;

    public MemberLevelsCurrentViewBinding(Object obj, View view, int i13, TextView textView, ImageView imageView, ImageView imageView2, TextView textView2, TextView textView3, ViewOnboardingSegmentBarBinding viewOnboardingSegmentBarBinding, ProgressBar progressBar, ImageView imageView3) {
        super(view, i13, obj);
        this.currentLevel = textView;
        this.currentLevelBadge = imageView;
        this.currentLevelMiniBadge = imageView2;
        this.currentLevelProgressText = textView2;
        this.currentTier = textView3;
        this.levelOnboardingSegmentBar = viewOnboardingSegmentBarBinding;
        this.levelProgressBar = progressBar;
        this.nextLevelMiniBadge = imageView3;
    }

    public static MemberLevelsCurrentViewBinding bind(View view) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return bind(view, null);
    }

    public static MemberLevelsCurrentViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return inflate(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    public static MemberLevelsCurrentViewBinding bind(View view, Object obj) {
        return (MemberLevelsCurrentViewBinding) AbstractC1168a0.bind(obj, view, C9691R.layout.member_levels_current_view);
    }

    @Deprecated
    public static MemberLevelsCurrentViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (MemberLevelsCurrentViewBinding) AbstractC1168a0.inflateInternal(layoutInflater, C9691R.layout.member_levels_current_view, viewGroup, z4, obj);
    }

    public static MemberLevelsCurrentViewBinding inflate(LayoutInflater layoutInflater) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return inflate(layoutInflater, null);
    }

    @Deprecated
    public static MemberLevelsCurrentViewBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (MemberLevelsCurrentViewBinding) AbstractC1168a0.inflateInternal(layoutInflater, C9691R.layout.member_levels_current_view, null, false, obj);
    }
}
