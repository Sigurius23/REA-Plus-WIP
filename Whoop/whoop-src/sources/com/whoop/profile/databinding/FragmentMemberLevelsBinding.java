package com.whoop.profile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.whoop.p069ui.WhoopNewToolbar;
import com.whoop.profile.C9691R;

/* JADX INFO: loaded from: classes7.dex */
public abstract class FragmentMemberLevelsBinding extends AbstractC1168a0 {
    public final CollapsingToolbarLayout collapsingToolbarLayout;
    public final MemberLevelsCurrentViewBinding currentLevelViewContainer;
    public final WhoopNewToolbar memberLevelsToolbar;
    public final TextView pinnedLevelTitle;
    public final RecyclerView progressLevelRecyclerview;

    public FragmentMemberLevelsBinding(Object obj, View view, int i13, CollapsingToolbarLayout collapsingToolbarLayout, MemberLevelsCurrentViewBinding memberLevelsCurrentViewBinding, WhoopNewToolbar whoopNewToolbar, TextView textView, RecyclerView recyclerView) {
        super(view, i13, obj);
        this.collapsingToolbarLayout = collapsingToolbarLayout;
        this.currentLevelViewContainer = memberLevelsCurrentViewBinding;
        this.memberLevelsToolbar = whoopNewToolbar;
        this.pinnedLevelTitle = textView;
        this.progressLevelRecyclerview = recyclerView;
    }

    public static FragmentMemberLevelsBinding bind(View view) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return bind(view, null);
    }

    public static FragmentMemberLevelsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return inflate(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    public static FragmentMemberLevelsBinding bind(View view, Object obj) {
        return (FragmentMemberLevelsBinding) AbstractC1168a0.bind(obj, view, C9691R.layout.fragment_member_levels);
    }

    @Deprecated
    public static FragmentMemberLevelsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (FragmentMemberLevelsBinding) AbstractC1168a0.inflateInternal(layoutInflater, C9691R.layout.fragment_member_levels, viewGroup, z4, obj);
    }

    public static FragmentMemberLevelsBinding inflate(LayoutInflater layoutInflater) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return inflate(layoutInflater, null);
    }

    @Deprecated
    public static FragmentMemberLevelsBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentMemberLevelsBinding) AbstractC1168a0.inflateInternal(layoutInflater, C9691R.layout.fragment_member_levels, null, false, obj);
    }
}
