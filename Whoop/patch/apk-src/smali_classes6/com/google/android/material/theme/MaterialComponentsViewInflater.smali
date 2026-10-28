.class public Lcom/google/android/material/theme/MaterialComponentsViewInflater;
.super Lm/f0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lm/f0;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/util/AttributeSet;)Ls/l;
    .locals 1

    new-instance v0, Lcom/google/android/material/textfield/x;

    invoke-direct {v0, p1, p2}, Lcom/google/android/material/textfield/x;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public final b(Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 1

    new-instance v0, Lcom/google/android/material/button/MaterialButton;

    invoke-direct {v0, p1, p2}, Lcom/google/android/material/button/MaterialButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public final c(Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/AppCompatCheckBox;
    .locals 1

    new-instance v0, Ltq/b;

    invoke-direct {v0, p1, p2}, Ltq/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public final d(Landroid/content/Context;Landroid/util/AttributeSet;)Ls/x;
    .locals 1

    new-instance v0, Lgr/a;

    invoke-direct {v0, p1, p2}, Lgr/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public final e(Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/AppCompatTextView;
    .locals 2

    new-instance v0, Lpr/a;

    const v1, 0x1010084

    invoke-direct {v0, p1, p2, v1}, Lpr/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-object v0
.end method
