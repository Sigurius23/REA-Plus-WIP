package com.whoop.profile.view.memberlevels;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractActivityC1340r0;
import com.bumptech.glide.C4964f;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.squareup.wire.AbstractC5583n;
import com.whoop.design.models.modal.C8527a;
import com.whoop.domain.model.memberlevels.MemberLevelsListViewData;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.profile.C9691R;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.profile.databinding.FragmentMemberLevelsBinding;
import com.whoop.profile.databinding.MemberLevelsCurrentViewBinding;
import com.whoop.profile.databinding.ViewOnboardingSegmentBarBinding;
import com.whoop.profile.presentation.memberlevels.MemberLevelsViewModel;
import hj0.AbstractC17354m;
import hj0.AbstractC17357p;
import j93.InterfaceC21493z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25267u;
import or2.C28216y;
import p003a1.C0111j;
import p114eb.C12962i;
import p684zk.C40786k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22686q;
import q83.AbstractC30060g;
import vu1.AbstractC36510a;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 =2\u00020\u0001:\u0001=B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003J+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u001b\u001a\u0004\b,\u0010-R+\u00107\u001a\u00020/2\u0006\u00100\u001a\u00020/8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00109\u001a\u0002088\u0016X\u0096D¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006>"}, m65681d2 = {"Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;", "Lhj0/m;", "<init>", "()V", "Ll83/a0;", "initViews", "Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;", "currentLevelViewContainer", "displayProgressView", "(Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;)V", "displayOnboardingView", "displayProgressText", "loadMiniBadges", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/whoop/profile/presentation/memberlevels/MemberLevelsViewModel;", "memberLevelsViewModel$delegate", "Ll83/h;", "getMemberLevelsViewModel", "()Lcom/whoop/profile/presentation/memberlevels/MemberLevelsViewModel;", "memberLevelsViewModel", "Lor2/y;", "externalLinkNavigator$delegate", "getExternalLinkNavigator", "()Lor2/y;", "externalLinkNavigator", "Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;", "args$delegate", "Leb/i;", "getArgs", "()Lcom/whoop/profile/view/memberlevels/MemberLevelsFragmentArgs;", "args", "Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter;", "adapter$delegate", "getAdapter", "()Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter;", "adapter", "Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;", "<set-?>", "dataBinding$delegate", "Lcom/whoop/ui/b;", "getDataBinding", "()Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;", "setDataBinding", "(Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;)V", "dataBinding", "", "logTag", "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "Companion", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class MemberLevelsFragment extends AbstractC17354m {
    public static final int DAY_1_RECOVERY = 1;
    public static final int DAY_2_RECOVERY = 2;
    public static final int DAY_3_RECOVERY = 3;
    public static final int MAX_LEVEL = 30;
    static final /* synthetic */ InterfaceC21493z[] $$delegatedProperties = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(MemberLevelsFragment.class, "dataBinding", "getDataBinding()Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;", 0))};
    public static final int $stable = 8;

    /* JADX INFO: renamed from: memberLevelsViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h memberLevelsViewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new MemberLevelsFragment$special$$inlined$viewModel$default$2(this, null, new MemberLevelsFragment$special$$inlined$viewModel$default$1(this), null));

    /* JADX INFO: renamed from: externalLinkNavigator$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h externalLinkNavigator = AbstractC30060g.m92087G(EnumC23463i.f92933w, new MemberLevelsFragment$special$$inlined$inject$default$1(this, null, null));

    /* JADX INFO: renamed from: args$delegate, reason: from kotlin metadata */
    private final C12962i args = new C12962i(AbstractC22671h0.f89337a.getOrCreateKotlinClass(MemberLevelsFragmentArgs.class), new MemberLevelsFragment$special$$inlined$navArgs$1(this));

    /* JADX INFO: renamed from: adapter$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h adapter = AbstractC30060g.m92088H(new C8527a(17));

    /* JADX INFO: renamed from: dataBinding$delegate, reason: from kotlin metadata */
    private final C10462b dataBinding = AbstractC10463c.m26726c(this, null, 1, null);
    private final String logTag = "MemberLevelsFragment";

    /* JADX INFO: Access modifiers changed from: private */
    public static final MemberLevelsDetailAdapter adapter_delegate$lambda$0() {
        return new MemberLevelsDetailAdapter();
    }

    private final void displayOnboardingView(MemberLevelsCurrentViewBinding currentLevelViewContainer) {
        currentLevelViewContainer.levelProgressBar.setVisibility(8);
        currentLevelViewContainer.levelOnboardingSegmentBar.getRoot().setVisibility(0);
        int iM49142b = AbstractC17357p.m49142b(this, C9691R.color.whoop_green);
        ViewOnboardingSegmentBarBinding levelOnboardingSegmentBar = currentLevelViewContainer.levelOnboardingSegmentBar;
        AbstractC22676k.m65749i(levelOnboardingSegmentBar, "levelOnboardingSegmentBar");
        int memberExperience = getArgs().getMemberLevelData().getMemberExperience();
        if (memberExperience == 1) {
            levelOnboardingSegmentBar.first.getBackground().setColorFilter(new PorterDuffColorFilter(iM49142b, PorterDuff.Mode.SRC_OVER));
            return;
        }
        if (memberExperience == 2) {
            Drawable background = levelOnboardingSegmentBar.first.getBackground();
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_OVER;
            background.setColorFilter(new PorterDuffColorFilter(iM49142b, mode));
            levelOnboardingSegmentBar.second.getBackground().setColorFilter(new PorterDuffColorFilter(iM49142b, mode));
            return;
        }
        if (memberExperience != 3) {
            return;
        }
        Drawable background2 = levelOnboardingSegmentBar.first.getBackground();
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_OVER;
        background2.setColorFilter(new PorterDuffColorFilter(iM49142b, mode2));
        levelOnboardingSegmentBar.second.getBackground().setColorFilter(new PorterDuffColorFilter(iM49142b, mode2));
        levelOnboardingSegmentBar.third.getBackground().setColorFilter(new PorterDuffColorFilter(iM49142b, mode2));
    }

    private final void displayProgressText(MemberLevelsCurrentViewBinding currentLevelViewContainer) {
        if (getArgs().getMemberLevelData().getNextLevelExperience() <= 0) {
            if (getArgs().getMemberLevelData().getCurrentLevelId() != 30) {
                currentLevelViewContainer.currentLevelProgressText.setVisibility(8);
                return;
            } else {
                currentLevelViewContainer.currentLevelProgressText.setVisibility(0);
                currentLevelViewContainer.currentLevelProgressText.setText(getString(C9691R.string.member_levels_congrats));
                return;
            }
        }
        int nextLevelExperience = getArgs().getMemberLevelData().getNextLevelExperience() - getArgs().getMemberLevelData().getMemberExperience();
        SpannableString spannableString = new SpannableString(getResources().getQuantityString(C9691R.plurals.member_level_out_of_total, nextLevelExperience, String.valueOf(nextLevelExperience), getArgs().getMemberLevelData().getNextLevelId()));
        spannableString.setSpan(new ForegroundColorSpan(AbstractC17357p.m49142b(this, AbstractC36510a.f156023c0)), 0, ((String) AbstractC39414r.m125906y0(spannableString, new String[]{" "}, 6).get(0)).length(), 33);
        currentLevelViewContainer.currentLevelProgressText.setText(spannableString);
        currentLevelViewContainer.currentLevelProgressText.setVisibility(0);
    }

    private final void displayProgressView(MemberLevelsCurrentViewBinding currentLevelViewContainer) {
        currentLevelViewContainer.levelOnboardingSegmentBar.getRoot().setVisibility(8);
        if (getArgs().getMemberLevelData().getCurrentLevelId() == 30) {
            currentLevelViewContainer.levelProgressBar.setVisibility(8);
            return;
        }
        currentLevelViewContainer.levelProgressBar.setVisibility(0);
        Integer currentLevelMaxExperience = getArgs().getMemberLevelData().getCurrentLevelMaxExperience();
        if (currentLevelMaxExperience != null) {
            currentLevelViewContainer.levelProgressBar.setMax(currentLevelMaxExperience.intValue() - getArgs().getMemberLevelData().getCurrentLevelMinExperience());
        }
        currentLevelViewContainer.levelProgressBar.setProgress(getArgs().getMemberLevelData().getMemberExperience() - getArgs().getMemberLevelData().getCurrentLevelMinExperience(), true);
        loadMiniBadges();
    }

    private final MemberLevelsDetailAdapter getAdapter() {
        return (MemberLevelsDetailAdapter) this.adapter.getValue();
    }

    private final MemberLevelsFragmentArgs getArgs() {
        return (MemberLevelsFragmentArgs) this.args.getValue();
    }

    private final FragmentMemberLevelsBinding getDataBinding() {
        return (FragmentMemberLevelsBinding) this.dataBinding.getValue(this, $$delegatedProperties[0]);
    }

    private final C28216y getExternalLinkNavigator() {
        return (C28216y) this.externalLinkNavigator.getValue();
    }

    private final MemberLevelsViewModel getMemberLevelsViewModel() {
        return (MemberLevelsViewModel) this.memberLevelsViewModel.getValue();
    }

    private final void initViews() {
        FragmentMemberLevelsBinding dataBinding = getDataBinding();
        ((C4964f) ((C4964f) ((C4964f) ComponentCallbacks2C4960b.m15529e(requireContext()).m15549m(getArgs().getMemberLevelData().getCurrentBadgeUrl()).m89319j(C9691R.drawable.ic_placeholder_badge)).m89316f(C9691R.drawable.ic_placeholder_badge)).m89314d(C40786k.f175891b)).m15537y(dataBinding.currentLevelViewContainer.currentLevelBadge);
        if (getArgs().getMemberLevelData().getCurrentLevelId() == 30) {
            dataBinding.currentLevelViewContainer.currentLevelMiniBadge.setVisibility(8);
            dataBinding.currentLevelViewContainer.nextLevelMiniBadge.setVisibility(8);
        } else {
            dataBinding.currentLevelViewContainer.currentLevelMiniBadge.setVisibility(0);
            dataBinding.currentLevelViewContainer.nextLevelMiniBadge.setVisibility(0);
            loadMiniBadges();
        }
        if (getArgs().getMemberLevelData().getCurrentLevelId() == 1) {
            MemberLevelsCurrentViewBinding currentLevelViewContainer = dataBinding.currentLevelViewContainer;
            AbstractC22676k.m65749i(currentLevelViewContainer, "currentLevelViewContainer");
            displayOnboardingView(currentLevelViewContainer);
        } else {
            MemberLevelsCurrentViewBinding currentLevelViewContainer2 = dataBinding.currentLevelViewContainer;
            AbstractC22676k.m65749i(currentLevelViewContainer2, "currentLevelViewContainer");
            displayProgressView(currentLevelViewContainer2);
        }
        dataBinding.currentLevelViewContainer.currentTier.setText(getArgs().getMemberLevelData().getCurrentLevelType());
        dataBinding.currentLevelViewContainer.currentLevel.setText(getString(C9691R.string.profile_level_title, String.valueOf(getArgs().getMemberLevelData().getCurrentLevelId())));
        dataBinding.pinnedLevelTitle.setText(getString(C9691R.string.profile_level_title, String.valueOf(getArgs().getMemberLevelData().getCurrentLevelId())));
        MemberLevelsCurrentViewBinding currentLevelViewContainer3 = dataBinding.currentLevelViewContainer;
        AbstractC22676k.m65749i(currentLevelViewContainer3, "currentLevelViewContainer");
        displayProgressText(currentLevelViewContainer3);
        getMemberLevelsViewModel().getMemberLevelsLiveData().observe(getViewLifecycleOwner(), new MemberLevelsFragment$sam$androidx_lifecycle_Observer$0(new C9815a(this, 0)));
        getMemberLevelsViewModel().getMemberLevels(getArgs().getMemberLevelData().getCurrentLevelId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 initViews$lambda$0$0(MemberLevelsFragment memberLevelsFragment, List list) {
        AbstractC22676k.m65747g(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((MemberLevelsListViewData) obj).getLevelId() <= memberLevelsFragment.getArgs().getMemberLevelData().getCurrentLevelId()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (!zHasNext) {
                memberLevelsFragment.getAdapter().setDataList(list);
                memberLevelsFragment.getAdapter().notifyDataSetChanged();
                return c23454a0;
            }
            ((MemberLevelsListViewData) it.next()).setLocked(false);
            arrayList2.add(c23454a0);
        }
    }

    private final void loadMiniBadges() {
        C4964f c4964f = (C4964f) ((C4964f) ComponentCallbacks2C4960b.m15529e(requireContext()).m15549m(getArgs().getMemberLevelData().getCurrentMiniBadgeUrl()).m89319j(C9691R.drawable.ic_placeholder_badge)).m89316f(C9691R.drawable.ic_placeholder_badge);
        C40786k c40786k = C40786k.f175891b;
        ((C4964f) c4964f.m89314d(c40786k)).m15537y(getDataBinding().currentLevelViewContainer.currentLevelMiniBadge);
        ((C4964f) ((C4964f) ((C4964f) ComponentCallbacks2C4960b.m15529e(requireContext()).m15549m(getArgs().getMemberLevelData().getNextMiniBadgeUrl()).m89319j(C9691R.drawable.ic_placeholder_badge)).m89316f(C9691R.drawable.ic_placeholder_badge)).m89314d(c40786k)).m15537y(getDataBinding().currentLevelViewContainer.nextLevelMiniBadge);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 onViewCreated$lambda$0(MemberLevelsFragment memberLevelsFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC5583n.m16799z(memberLevelsFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 onViewCreated$lambda$1(MemberLevelsFragment memberLevelsFragment) {
        C28216y externalLinkNavigator = memberLevelsFragment.getExternalLinkNavigator();
        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = memberLevelsFragment.requireActivity();
        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
        externalLinkNavigator.m85434x(abstractActivityC1340r0RequireActivity, memberLevelsFragment.getMemberLevelsViewModel().getProfileHelpUrl(), false);
        return C23454a0.f92919a;
    }

    private final void setDataBinding(FragmentMemberLevelsBinding fragmentMemberLevelsBinding) {
        this.dataBinding.setValue(this, $$delegatedProperties[0], fragmentMemberLevelsBinding);
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        FragmentMemberLevelsBinding fragmentMemberLevelsBindingInflate = FragmentMemberLevelsBinding.inflate(inflater, container, false);
        AbstractC22676k.m65749i(fragmentMemberLevelsBindingInflate, "inflate(...)");
        setDataBinding(fragmentMemberLevelsBindingInflate);
        getDataBinding().progressLevelRecyclerview.setAdapter(getAdapter());
        View root = getDataBinding().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getDataBinding().memberLevelsToolbar.m26687n(new C9815a(this, 1));
        getDataBinding().memberLevelsToolbar.m26688p(new C0111j(this, 21));
        getActivity();
        initViews();
    }
}
