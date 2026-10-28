.class public final Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final addACommentLabel:Landroidx/appcompat/widget/AppCompatTextView;

.field public final addACommentLabelSwitch:Lcom/google/android/material/switchmaterial/SwitchMaterial;

.field public final addOption:Landroidx/appcompat/widget/AppCompatTextView;

.field public final anonymousPollLabel:Landroidx/appcompat/widget/AppCompatTextView;

.field public final anonymousPollSwitch:Lcom/google/android/material/switchmaterial/SwitchMaterial;

.field public final multipleAnswersCount:Landroidx/appcompat/widget/AppCompatEditText;

.field public final multipleAnswersLabel:Landroidx/appcompat/widget/AppCompatTextView;

.field public final multipleAnswersSwitch:Lcom/google/android/material/switchmaterial/SwitchMaterial;

.field public final optionList:Landroidx/recyclerview/widget/RecyclerView;

.field public final optionsLabel:Landroidx/appcompat/widget/AppCompatTextView;

.field public final question:Landroidx/appcompat/widget/AppCompatEditText;

.field public final quetionLabel:Landroidx/appcompat/widget/AppCompatTextView;

.field private final rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final suggestAnOptionLabel:Landroidx/appcompat/widget/AppCompatTextView;

.field public final suggestAnOptionSwitch:Lcom/google/android/material/switchmaterial/SwitchMaterial;

.field public final toolbar:Landroidx/appcompat/widget/Toolbar;


# direct methods
.method private constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/appcompat/widget/AppCompatTextView;Lcom/google/android/material/switchmaterial/SwitchMaterial;Landroidx/appcompat/widget/AppCompatTextView;Landroidx/appcompat/widget/AppCompatTextView;Lcom/google/android/material/switchmaterial/SwitchMaterial;Landroidx/appcompat/widget/AppCompatEditText;Landroidx/appcompat/widget/AppCompatTextView;Lcom/google/android/material/switchmaterial/SwitchMaterial;Landroidx/recyclerview/widget/RecyclerView;Landroidx/appcompat/widget/AppCompatTextView;Landroidx/appcompat/widget/AppCompatEditText;Landroidx/appcompat/widget/AppCompatTextView;Landroidx/appcompat/widget/AppCompatTextView;Lcom/google/android/material/switchmaterial/SwitchMaterial;Landroidx/appcompat/widget/Toolbar;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p2, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->addACommentLabel:Landroidx/appcompat/widget/AppCompatTextView;

    iput-object p3, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->addACommentLabelSwitch:Lcom/google/android/material/switchmaterial/SwitchMaterial;

    iput-object p4, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->addOption:Landroidx/appcompat/widget/AppCompatTextView;

    iput-object p5, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->anonymousPollLabel:Landroidx/appcompat/widget/AppCompatTextView;

    iput-object p6, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->anonymousPollSwitch:Lcom/google/android/material/switchmaterial/SwitchMaterial;

    iput-object p7, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->multipleAnswersCount:Landroidx/appcompat/widget/AppCompatEditText;

    iput-object p8, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->multipleAnswersLabel:Landroidx/appcompat/widget/AppCompatTextView;

    iput-object p9, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->multipleAnswersSwitch:Lcom/google/android/material/switchmaterial/SwitchMaterial;

    iput-object p10, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->optionList:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p11, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->optionsLabel:Landroidx/appcompat/widget/AppCompatTextView;

    iput-object p12, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->question:Landroidx/appcompat/widget/AppCompatEditText;

    iput-object p13, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->quetionLabel:Landroidx/appcompat/widget/AppCompatTextView;

    iput-object p14, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->suggestAnOptionLabel:Landroidx/appcompat/widget/AppCompatTextView;

    iput-object p15, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->suggestAnOptionSwitch:Lcom/google/android/material/switchmaterial/SwitchMaterial;

    move-object/from16 p1, p16

    iput-object p1, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->toolbar:Landroidx/appcompat/widget/Toolbar;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;
    .locals 20

    move-object/from16 v0, p0

    sget v1, Lio/getstream/chat/android/ui/R$id;->addACommentLabel:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Landroidx/appcompat/widget/AppCompatTextView;

    if-eqz v5, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->addACommentLabelSwitch:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lcom/google/android/material/switchmaterial/SwitchMaterial;

    if-eqz v6, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->addOption:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Landroidx/appcompat/widget/AppCompatTextView;

    if-eqz v7, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->anonymousPollLabel:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Landroidx/appcompat/widget/AppCompatTextView;

    if-eqz v8, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->anonymousPollSwitch:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lcom/google/android/material/switchmaterial/SwitchMaterial;

    if-eqz v9, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->multipleAnswersCount:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Landroidx/appcompat/widget/AppCompatEditText;

    if-eqz v10, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->multipleAnswersLabel:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Landroidx/appcompat/widget/AppCompatTextView;

    if-eqz v11, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->multipleAnswersSwitch:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Lcom/google/android/material/switchmaterial/SwitchMaterial;

    if-eqz v12, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->optionList:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v13, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->optionsLabel:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Landroidx/appcompat/widget/AppCompatTextView;

    if-eqz v14, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->question:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Landroidx/appcompat/widget/AppCompatEditText;

    if-eqz v15, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->quetionLabel:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Landroidx/appcompat/widget/AppCompatTextView;

    if-eqz v16, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->suggestAnOptionLabel:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Landroidx/appcompat/widget/AppCompatTextView;

    if-eqz v17, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->suggestAnOptionSwitch:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v18, v2

    check-cast v18, Lcom/google/android/material/switchmaterial/SwitchMaterial;

    if-eqz v18, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->toolbar:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v19, v2

    check-cast v19, Landroidx/appcompat/widget/Toolbar;

    if-eqz v19, :cond_0

    new-instance v3, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;

    move-object v4, v0

    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-direct/range {v3 .. v19}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/appcompat/widget/AppCompatTextView;Lcom/google/android/material/switchmaterial/SwitchMaterial;Landroidx/appcompat/widget/AppCompatTextView;Landroidx/appcompat/widget/AppCompatTextView;Lcom/google/android/material/switchmaterial/SwitchMaterial;Landroidx/appcompat/widget/AppCompatEditText;Landroidx/appcompat/widget/AppCompatTextView;Lcom/google/android/material/switchmaterial/SwitchMaterial;Landroidx/recyclerview/widget/RecyclerView;Landroidx/appcompat/widget/AppCompatTextView;Landroidx/appcompat/widget/AppCompatEditText;Landroidx/appcompat/widget/AppCompatTextView;Landroidx/appcompat/widget/AppCompatTextView;Lcom/google/android/material/switchmaterial/SwitchMaterial;Landroidx/appcompat/widget/Toolbar;)V

    return-object v3

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Missing required view with ID: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-static {p0, v0, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;
    .locals 2

    .line 2
    sget v0, Lio/getstream/chat/android/ui/R$layout;->stream_ui_fragment_create_poll:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method

.method public final getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 1

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method
