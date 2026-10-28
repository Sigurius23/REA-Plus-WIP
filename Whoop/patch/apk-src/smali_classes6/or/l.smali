.class public final Lor/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lor/d;


# instance fields
.field public final synthetic a:I

.field public final b:Landroid/view/ViewGroup;


# direct methods
.method public synthetic constructor <init>(Landroid/view/ViewGroup;I)V
    .locals 0

    iput p2, p0, Lor/l;->a:I

    iput-object p1, p0, Lor/l;->b:Landroid/view/ViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lor/h;)V
    .locals 2

    iget v0, p0, Lor/l;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lor/l;->b:Landroid/view/ViewGroup;

    check-cast v0, Landroidx/viewpager2/widget/ViewPager2;

    iget p1, p1, Lor/h;->d:I

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroidx/viewpager2/widget/ViewPager2;->d(IZ)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lor/l;->b:Landroid/view/ViewGroup;

    check-cast v0, Landroidx/viewpager/widget/ViewPager;

    iget p1, p1, Lor/h;->d:I

    invoke-virtual {v0, p1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
