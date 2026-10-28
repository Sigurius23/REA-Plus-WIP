.class public abstract Lii0/y;
.super Landroidx/databinding/a0;
.source "SourceFile"


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Landroid/widget/TextView;

.field public final c:Landroid/widget/ImageView;

.field public final d:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroid/view/View;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/TextView;)V
    .locals 0

    invoke-direct {p0, p2, p3, p1}, Landroidx/databinding/a0;-><init>(Landroid/view/View;ILjava/lang/Object;)V

    iput-object p4, p0, Lii0/y;->a:Landroid/view/View;

    iput-object p5, p0, Lii0/y;->b:Landroid/widget/TextView;

    iput-object p6, p0, Lii0/y;->c:Landroid/widget/ImageView;

    iput-object p7, p0, Lii0/y;->d:Landroid/widget/TextView;

    return-void
.end method

.method public static c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lii0/y;
    .locals 1

    sget-object v0, Landroidx/databinding/g;->a:Landroidx/databinding/DataBinderMapperImpl;

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lii0/y;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lii0/y;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lii0/y;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget v0, Lhi0/f;->q:I

    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/a0;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/a0;

    move-result-object p0

    check-cast p0, Lii0/y;

    return-object p0
.end method
