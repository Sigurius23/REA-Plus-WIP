package com.whoop.profile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import com.whoop.profile.C9691R;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ViewMemberLevelBinding extends AbstractC1168a0 {
    public final TextView level;
    public final ImageView levelBadge;
    public final TextView levelDescription;
    public final TextView tier;

    public ViewMemberLevelBinding(Object obj, View view, int i13, TextView textView, ImageView imageView, TextView textView2, TextView textView3) {
        super(view, i13, obj);
        this.level = textView;
        this.levelBadge = imageView;
        this.levelDescription = textView2;
        this.tier = textView3;
    }

    public static ViewMemberLevelBinding bind(View view) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return bind(view, null);
    }

    public static ViewMemberLevelBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return inflate(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    public static ViewMemberLevelBinding bind(View view, Object obj) {
        return (ViewMemberLevelBinding) AbstractC1168a0.bind(obj, view, C9691R.layout.view_member_level);
    }

    @Deprecated
    public static ViewMemberLevelBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (ViewMemberLevelBinding) AbstractC1168a0.inflateInternal(layoutInflater, C9691R.layout.view_member_level, viewGroup, z4, obj);
    }

    public static ViewMemberLevelBinding inflate(LayoutInflater layoutInflater) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return inflate(layoutInflater, null);
    }

    @Deprecated
    public static ViewMemberLevelBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ViewMemberLevelBinding) AbstractC1168a0.inflateInternal(layoutInflater, C9691R.layout.view_member_level, null, false, obj);
    }
}
