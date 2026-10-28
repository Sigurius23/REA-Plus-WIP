.class public final Lhc/k;
.super Landroidx/recyclerview/widget/e1;
.source "SourceFile"


# instance fields
.field public final synthetic e:Landroidx/viewpager2/widget/ViewPager2;


# direct methods
.method public constructor <init>(Landroidx/viewpager2/widget/ViewPager2;)V
    .locals 0

    iput-object p1, p0, Lhc/k;->e:Landroidx/viewpager2/widget/ViewPager2;

    invoke-direct {p0}, Landroidx/recyclerview/widget/e1;-><init>()V

    return-void
.end method


# virtual methods
.method public final e(Landroidx/recyclerview/widget/u1;)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lhc/k;->e:Landroidx/viewpager2/widget/ViewPager2;

    iget-object v0, v0, Landroidx/viewpager2/widget/ViewPager2;->N:Le10/k0;

    iget-object v0, v0, Le10/k0;->x:Ljava/lang/Object;

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/e1;->e(Landroidx/recyclerview/widget/u1;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
