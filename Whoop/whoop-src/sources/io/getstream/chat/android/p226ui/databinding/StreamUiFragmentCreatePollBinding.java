package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.switchmaterial.SwitchMaterial;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiFragmentCreatePollBinding implements InterfaceC13008a {
    public final AppCompatTextView addACommentLabel;
    public final SwitchMaterial addACommentLabelSwitch;
    public final AppCompatTextView addOption;
    public final AppCompatTextView anonymousPollLabel;
    public final SwitchMaterial anonymousPollSwitch;
    public final AppCompatEditText multipleAnswersCount;
    public final AppCompatTextView multipleAnswersLabel;
    public final SwitchMaterial multipleAnswersSwitch;
    public final RecyclerView optionList;
    public final AppCompatTextView optionsLabel;
    public final AppCompatEditText question;
    public final AppCompatTextView quetionLabel;
    private final ConstraintLayout rootView;
    public final AppCompatTextView suggestAnOptionLabel;
    public final SwitchMaterial suggestAnOptionSwitch;
    public final Toolbar toolbar;

    private StreamUiFragmentCreatePollBinding(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, SwitchMaterial switchMaterial, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, SwitchMaterial switchMaterial2, AppCompatEditText appCompatEditText, AppCompatTextView appCompatTextView4, SwitchMaterial switchMaterial3, RecyclerView recyclerView, AppCompatTextView appCompatTextView5, AppCompatEditText appCompatEditText2, AppCompatTextView appCompatTextView6, AppCompatTextView appCompatTextView7, SwitchMaterial switchMaterial4, Toolbar toolbar) {
        this.rootView = constraintLayout;
        this.addACommentLabel = appCompatTextView;
        this.addACommentLabelSwitch = switchMaterial;
        this.addOption = appCompatTextView2;
        this.anonymousPollLabel = appCompatTextView3;
        this.anonymousPollSwitch = switchMaterial2;
        this.multipleAnswersCount = appCompatEditText;
        this.multipleAnswersLabel = appCompatTextView4;
        this.multipleAnswersSwitch = switchMaterial3;
        this.optionList = recyclerView;
        this.optionsLabel = appCompatTextView5;
        this.question = appCompatEditText2;
        this.quetionLabel = appCompatTextView6;
        this.suggestAnOptionLabel = appCompatTextView7;
        this.suggestAnOptionSwitch = switchMaterial4;
        this.toolbar = toolbar;
    }

    public static StreamUiFragmentCreatePollBinding bind(View view) {
        int i13 = C19469R.id.addACommentLabel;
        AppCompatTextView appCompatTextView = (AppCompatTextView) AbstractC34235f.m108203J(view, i13);
        if (appCompatTextView != null) {
            i13 = C19469R.id.addACommentLabelSwitch;
            SwitchMaterial switchMaterial = (SwitchMaterial) AbstractC34235f.m108203J(view, i13);
            if (switchMaterial != null) {
                i13 = C19469R.id.addOption;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) AbstractC34235f.m108203J(view, i13);
                if (appCompatTextView2 != null) {
                    i13 = C19469R.id.anonymousPollLabel;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) AbstractC34235f.m108203J(view, i13);
                    if (appCompatTextView3 != null) {
                        i13 = C19469R.id.anonymousPollSwitch;
                        SwitchMaterial switchMaterial2 = (SwitchMaterial) AbstractC34235f.m108203J(view, i13);
                        if (switchMaterial2 != null) {
                            i13 = C19469R.id.multipleAnswersCount;
                            AppCompatEditText appCompatEditText = (AppCompatEditText) AbstractC34235f.m108203J(view, i13);
                            if (appCompatEditText != null) {
                                i13 = C19469R.id.multipleAnswersLabel;
                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) AbstractC34235f.m108203J(view, i13);
                                if (appCompatTextView4 != null) {
                                    i13 = C19469R.id.multipleAnswersSwitch;
                                    SwitchMaterial switchMaterial3 = (SwitchMaterial) AbstractC34235f.m108203J(view, i13);
                                    if (switchMaterial3 != null) {
                                        i13 = C19469R.id.optionList;
                                        RecyclerView recyclerView = (RecyclerView) AbstractC34235f.m108203J(view, i13);
                                        if (recyclerView != null) {
                                            i13 = C19469R.id.optionsLabel;
                                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) AbstractC34235f.m108203J(view, i13);
                                            if (appCompatTextView5 != null) {
                                                i13 = C19469R.id.question;
                                                AppCompatEditText appCompatEditText2 = (AppCompatEditText) AbstractC34235f.m108203J(view, i13);
                                                if (appCompatEditText2 != null) {
                                                    i13 = C19469R.id.quetionLabel;
                                                    AppCompatTextView appCompatTextView6 = (AppCompatTextView) AbstractC34235f.m108203J(view, i13);
                                                    if (appCompatTextView6 != null) {
                                                        i13 = C19469R.id.suggestAnOptionLabel;
                                                        AppCompatTextView appCompatTextView7 = (AppCompatTextView) AbstractC34235f.m108203J(view, i13);
                                                        if (appCompatTextView7 != null) {
                                                            i13 = C19469R.id.suggestAnOptionSwitch;
                                                            SwitchMaterial switchMaterial4 = (SwitchMaterial) AbstractC34235f.m108203J(view, i13);
                                                            if (switchMaterial4 != null) {
                                                                i13 = C19469R.id.toolbar;
                                                                Toolbar toolbar = (Toolbar) AbstractC34235f.m108203J(view, i13);
                                                                if (toolbar != null) {
                                                                    return new StreamUiFragmentCreatePollBinding((ConstraintLayout) view, appCompatTextView, switchMaterial, appCompatTextView2, appCompatTextView3, switchMaterial2, appCompatEditText, appCompatTextView4, switchMaterial3, recyclerView, appCompatTextView5, appCompatEditText2, appCompatTextView6, appCompatTextView7, switchMaterial4, toolbar);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiFragmentCreatePollBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiFragmentCreatePollBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_fragment_create_poll, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }
}
