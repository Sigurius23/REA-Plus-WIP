package com.whoop.profile.view.memberlevels;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1692i1;
import androidx.recyclerview.widget.AbstractC1717o2;
import com.bumptech.glide.C4964f;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.whoop.domain.model.memberlevels.MemberLevelsListViewData;
import com.whoop.profile.C9691R;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.profile.databinding.ViewMemberLevelBinding;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p684zk.C40786k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import vu1.AbstractC36510a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter;", "Landroidx/recyclerview/widget/i1;", "Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter$ViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter$ViewHolder;", "holder", "position", "Ll83/a0;", "onBindViewHolder", "(Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter$ViewHolder;I)V", "getItemCount", "()I", "", "Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;", "dataList", "Ljava/util/List;", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "ViewHolder", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class MemberLevelsDetailAdapter extends AbstractC1692i1 {
    public static final int $stable = 8;
    private List<MemberLevelsListViewData> dataList = new ArrayList();

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter$ViewHolder;", "Landroidx/recyclerview/widget/o2;", "Lcom/whoop/profile/databinding/ViewMemberLevelBinding;", ProfileAnalyticsKt.VIEW, "<init>", "(Lcom/whoop/profile/databinding/ViewMemberLevelBinding;)V", "Landroid/widget/ImageView;", "badgeImageView", "Landroid/widget/ImageView;", "getBadgeImageView", "()Landroid/widget/ImageView;", "Landroid/widget/TextView;", "tier", "Landroid/widget/TextView;", "getTier", "()Landroid/widget/TextView;", "level", "getLevel", "description", "getDescription", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class ViewHolder extends AbstractC1717o2 {
        public static final int $stable = 8;
        private final ImageView badgeImageView;
        private final TextView description;
        private final TextView level;
        private final TextView tier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ViewMemberLevelBinding view) {
            super(view.getRoot());
            AbstractC22676k.m65750j(view, "view");
            ImageView levelBadge = view.levelBadge;
            AbstractC22676k.m65749i(levelBadge, "levelBadge");
            this.badgeImageView = levelBadge;
            TextView tier = view.tier;
            AbstractC22676k.m65749i(tier, "tier");
            this.tier = tier;
            TextView level = view.level;
            AbstractC22676k.m65749i(level, "level");
            this.level = level;
            TextView levelDescription = view.levelDescription;
            AbstractC22676k.m65749i(levelDescription, "levelDescription");
            this.description = levelDescription;
        }

        public final ImageView getBadgeImageView() {
            return this.badgeImageView;
        }

        public final TextView getDescription() {
            return this.description;
        }

        public final TextView getLevel() {
            return this.level;
        }

        public final TextView getTier() {
            return this.tier;
        }
    }

    public final List<MemberLevelsListViewData> getDataList() {
        return this.dataList;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public int getItemCount() {
        return this.dataList.size();
    }

    public final void setDataList(List<MemberLevelsListViewData> list) {
        AbstractC22676k.m65750j(list, "<set-?>");
        this.dataList = list;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public void onBindViewHolder(ViewHolder holder, int position) {
        AbstractC22676k.m65750j(holder, "holder");
        Context context = holder.itemView.getContext();
        MemberLevelsListViewData memberLevelsListViewData = this.dataList.get(position);
        ((C4964f) ((C4964f) ((C4964f) ComponentCallbacks2C4960b.m15529e(context).m15549m(memberLevelsListViewData.getBadgeUrl()).m89319j(C9691R.drawable.ic_placeholder_badge)).m89316f(C9691R.drawable.ic_placeholder_badge)).m89314d(C40786k.f175891b)).m15537y(holder.getBadgeImageView());
        TextView tier = holder.getTier();
        String tier2 = memberLevelsListViewData.getTier();
        Locale locale = Locale.getDefault();
        AbstractC22676k.m65749i(locale, "getDefault(...)");
        String upperCase = tier2.toUpperCase(locale);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        tier.setText(upperCase);
        holder.getLevel().setText(context.getString(C9691R.string.profile_level_title, String.valueOf(memberLevelsListViewData.getLevelId())));
        holder.getDescription().setText(context.getResources().getQuantityString(C9691R.plurals.membership_recoveries, memberLevelsListViewData.getLevelId(), String.valueOf(memberLevelsListViewData.getMinExperience())));
        if (memberLevelsListViewData.isLocked()) {
            holder.getTier().setTextColor(context.getColor(AbstractC36510a.f156008Q));
            holder.getLevel().setTextColor(context.getColor(AbstractC36510a.f156008Q));
            holder.getDescription().setTextColor(context.getColor(AbstractC36510a.f156008Q));
        } else {
            holder.getTier().setTextColor(context.getColor(AbstractC36510a.f156008Q));
            holder.getLevel().setTextColor(context.getColor(AbstractC36510a.f156023c0));
            holder.getDescription().setTextColor(context.getColor(AbstractC36510a.f156009R));
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        AbstractC22676k.m65750j(parent, "parent");
        ViewMemberLevelBinding viewMemberLevelBindingInflate = ViewMemberLevelBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC22676k.m65749i(viewMemberLevelBindingInflate, "inflate(...)");
        return new ViewHolder(viewMemberLevelBindingInflate);
    }
}
