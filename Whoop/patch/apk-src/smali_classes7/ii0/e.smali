.class public abstract Lii0/e;
.super Landroidx/databinding/a0;
.source "SourceFile"


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Landroid/widget/TextView;

.field public final c:Lcom/google/android/material/textfield/TextInputEditText;

.field public final d:Lcom/google/android/material/textfield/TextInputLayout;

.field public final e:Landroid/widget/ProgressBar;

.field public final f:Landroid/widget/TextView;

.field public final g:Landroid/widget/ImageView;

.field public final h:Landroid/widget/TextView;

.field public final i:Landroid/view/View;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroid/view/View;Landroid/widget/TextView;Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputLayout;Landroid/widget/ProgressBar;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p2, p3, p1}, Landroidx/databinding/a0;-><init>(Landroid/view/View;ILjava/lang/Object;)V

    iput-object p4, p0, Lii0/e;->a:Landroid/view/View;

    iput-object p5, p0, Lii0/e;->b:Landroid/widget/TextView;

    iput-object p6, p0, Lii0/e;->c:Lcom/google/android/material/textfield/TextInputEditText;

    iput-object p7, p0, Lii0/e;->d:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object p8, p0, Lii0/e;->e:Landroid/widget/ProgressBar;

    iput-object p9, p0, Lii0/e;->f:Landroid/widget/TextView;

    iput-object p10, p0, Lii0/e;->g:Landroid/widget/ImageView;

    iput-object p11, p0, Lii0/e;->h:Landroid/widget/TextView;

    iput-object p12, p0, Lii0/e;->i:Landroid/view/View;

    return-void
.end method

.method public static c(Landroid/view/LayoutInflater;)Lii0/e;
    .locals 1

    sget-object v0, Landroidx/databinding/g;->a:Landroidx/databinding/DataBinderMapperImpl;

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lii0/e;->d(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lii0/e;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lii0/e;
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget v0, Lhi0/f;->c:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2, p1}, Landroidx/databinding/a0;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/a0;

    move-result-object p0

    check-cast p0, Lii0/e;

    return-object p0
.end method
