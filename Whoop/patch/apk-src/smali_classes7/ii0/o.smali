.class public abstract Lii0/o;
.super Landroidx/databinding/a0;
.source "SourceFile"


# instance fields
.field public final a:Lcom/whoop/ui/pills/StrokedPillButton;

.field public final b:Landroid/widget/ImageView;

.field public final c:Landroid/widget/TextView;

.field public final d:Landroid/widget/TextView;

.field public final e:Landroid/widget/TextView;

.field public final f:Landroid/widget/ImageView;

.field public final g:Landroid/widget/TextView;

.field public final h:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILcom/whoop/ui/pills/StrokedPillButton;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0

    invoke-direct {p0, p2, p3, p1}, Landroidx/databinding/a0;-><init>(Landroid/view/View;ILjava/lang/Object;)V

    iput-object p4, p0, Lii0/o;->a:Lcom/whoop/ui/pills/StrokedPillButton;

    iput-object p5, p0, Lii0/o;->b:Landroid/widget/ImageView;

    iput-object p6, p0, Lii0/o;->c:Landroid/widget/TextView;

    iput-object p7, p0, Lii0/o;->d:Landroid/widget/TextView;

    iput-object p8, p0, Lii0/o;->e:Landroid/widget/TextView;

    iput-object p9, p0, Lii0/o;->f:Landroid/widget/ImageView;

    iput-object p10, p0, Lii0/o;->g:Landroid/widget/TextView;

    iput-object p11, p0, Lii0/o;->h:Landroid/widget/TextView;

    return-void
.end method

.method public static c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lii0/o;
    .locals 1

    sget-object v0, Landroidx/databinding/g;->a:Landroidx/databinding/DataBinderMapperImpl;

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lii0/o;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lii0/o;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lii0/o;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget v0, Lhi0/f;->h:I

    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/a0;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/a0;

    move-result-object p0

    check-cast p0, Lii0/o;

    return-object p0
.end method
