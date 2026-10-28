.class public final Lcom/whoop/community/presentation/teams/TeamCreateActivity;
.super Lhj0/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/community/presentation/teams/TeamCreateActivity$a;,
        Lcom/whoop/community/presentation/teams/TeamCreateActivity$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001HB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00042\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0014\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\u0008\u000b\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J)\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ!\u0010\u001e\u001a\u00020\u00042\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00040\u001b\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\r\u0010!\u001a\u00020 \u00a2\u0006\u0004\u0008!\u0010\"R\u001a\u0010(\u001a\u00020#8\u0014X\u0094D\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008!\u0010*\u001a\u0004\u0008+\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008/\u00100R$\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008+\u00102R$\u00109\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0005\u00104\u001a\u0004\u00085\u00106\"\u0004\u00087\u00108R$\u0010;\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0006\u00104\u001a\u0004\u0008/\u00106\"\u0004\u0008:\u00108R0\u0010A\u001a\u001e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020=0<j\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020=`>8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008?\u0010@R\u0016\u0010D\u001a\u00020B8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010CR\u0016\u0010G\u001a\u00020E8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008:\u0010F\u00a8\u0006I"
    }
    d2 = {
        "Lcom/whoop/community/presentation/teams/TeamCreateActivity;",
        "Lhj0/i;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "I",
        "J",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "onStart",
        "Landroid/view/MenuItem;",
        "item",
        "",
        "onOptionsItemSelected",
        "(Landroid/view/MenuItem;)Z",
        "",
        "requestCode",
        "resultCode",
        "Landroid/content/Intent;",
        "data",
        "onActivityResult",
        "(IILandroid/content/Intent;)V",
        "enabled",
        "N",
        "(Z)V",
        "Lkotlin/Function1;",
        "Landroid/graphics/Bitmap;",
        "deliverResult",
        "L",
        "(Lkotlin/jvm/functions/Function1;)V",
        "Landroid/graphics/drawable/BitmapDrawable;",
        "F",
        "()Landroid/graphics/drawable/BitmapDrawable;",
        "",
        "E",
        "Ljava/lang/String;",
        "v",
        "()Ljava/lang/String;",
        "logTag",
        "Lrq0/y;",
        "Ll83/h;",
        "H",
        "()Lrq0/y;",
        "viewModel",
        "Lrq0/w;",
        "G",
        "Lrq0/w;",
        "attachedStep",
        "Lkotlin/jvm/functions/Function1;",
        "onPhotoPick",
        "Landroid/graphics/Bitmap;",
        "getBannerCropping",
        "()Landroid/graphics/Bitmap;",
        "setBannerCropping",
        "(Landroid/graphics/Bitmap;)V",
        "bannerCropping",
        "M",
        "logoCropping",
        "Ljava/util/HashMap;",
        "Lrq0/o;",
        "Lkotlin/collections/HashMap;",
        "K",
        "Ljava/util/HashMap;",
        "fragments",
        "Lrq0/a;",
        "Lrq0/a;",
        "bannerPagerAdapter",
        "Leq0/a;",
        "Leq0/a;",
        "binding",
        "a",
        "community_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final N:Lcom/whoop/community/presentation/teams/TeamCreateActivity$a;

.field public static final O:I


# instance fields
.field private final E:Ljava/lang/String;

.field private final F:Ll83/h;

.field private G:Lrq0/w;

.field private H:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private I:Landroid/graphics/Bitmap;

.field private J:Landroid/graphics/Bitmap;

.field private final K:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lrq0/w;",
            "Lrq0/o;",
            ">;"
        }
    .end annotation
.end field

.field private L:Lrq0/a;

.field private M:Leq0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/community/presentation/teams/TeamCreateActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/community/presentation/teams/TeamCreateActivity$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->N:Lcom/whoop/community/presentation/teams/TeamCreateActivity$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->O:I

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Lhj0/i;-><init>()V

    const-string v0, "TeamCreateActivity"

    iput-object v0, p0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->E:Ljava/lang/String;

    new-instance v0, Lq80/h;

    const/16 v1, 0x10

    invoke-direct {v0, p0, v1}, Lq80/h;-><init>(Ljava/lang/Object;I)V

    new-instance v1, Lcom/whoop/community/presentation/teams/TeamCreateActivity$e;

    invoke-direct {v1, p0}, Lcom/whoop/community/presentation/teams/TeamCreateActivity$e;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v2, Ll83/i;->y:Ll83/i;

    new-instance v3, Lcom/whoop/community/presentation/teams/TeamCreateActivity$f;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4, v1, v0}, Lcom/whoop/community/presentation/teams/TeamCreateActivity$f;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->F:Ll83/h;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->K:Ljava/util/HashMap;

    return-void
.end method

.method public static synthetic A(ZLcom/whoop/community/presentation/teams/TeamCreateActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->O(ZLcom/whoop/community/presentation/teams/TeamCreateActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic B(Lcom/whoop/community/presentation/teams/TeamCreateActivity;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->P(Lcom/whoop/community/presentation/teams/TeamCreateActivity;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic D(Lcom/whoop/community/presentation/teams/TeamCreateActivity;)Lrq0/y;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->H()Lrq0/y;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic E(Lcom/whoop/community/presentation/teams/TeamCreateActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->I()V

    return-void
.end method

.method private final H()Lrq0/y;
    .locals 1

    iget-object v0, p0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->F:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrq0/y;

    return-object v0
.end method

.method private final I()V
    .locals 2

    iget-object v0, p0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->G:Lrq0/w;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->K:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrq0/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lrq0/o;->O()V

    :cond_0
    invoke-direct {p0}, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->H()Lrq0/y;

    move-result-object v0

    invoke-virtual {v0}, Lrq0/y;->I()Landroidx/lifecycle/p0;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrq0/z;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lrq0/z;->t()Lrq0/w;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    sget-object v1, Lrq0/w;->SPLASH:Lrq0/w;

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_2
    invoke-direct {p0}, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->H()Lrq0/y;

    move-result-object v0

    invoke-virtual {v0}, Lrq0/y;->M()V

    return-void
.end method

.method private final J()V
    .locals 3

    invoke-direct {p0}, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->H()Lrq0/y;

    move-result-object v0

    invoke-virtual {v0}, Lrq0/y;->I()Landroidx/lifecycle/p0;

    move-result-object v0

    new-instance v1, Lpf/b;

    const/16 v2, 0x1c

    invoke-direct {v1, p0, v2}, Lpf/b;-><init>(Ljava/lang/Object;I)V

    new-instance v2, Lcom/whoop/community/presentation/teams/a;

    invoke-direct {v2, v1}, Lcom/whoop/community/presentation/teams/a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    return-void
.end method

.method private static final K(Lcom/whoop/community/presentation/teams/TeamCreateActivity;Lrq0/z;)Ll83/a0;
    .locals 8

    iget-object v0, p0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->M:Leq0/a;

    const/4 v1, 0x0

    if-eqz v0, :cond_1b

    invoke-virtual {p1}, Lrq0/z;->t()Lrq0/w;

    move-result-object v2

    iget-object v3, p0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->G:Lrq0/w;

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq v2, v3, :cond_d

    iget-object v2, p0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->K:Ljava/util/HashMap;

    invoke-virtual {p1}, Lrq0/z;->t()Lrq0/w;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lrq0/o;

    if-eqz v2, :cond_c

    invoke-virtual {p1}, Lrq0/z;->t()Lrq0/w;

    move-result-object v3

    if-nez v3, :cond_0

    sget-object v3, Lrq0/w;->SPLASH:Lrq0/w;

    :cond_0
    iget-object v6, p0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->G:Lrq0/w;

    if-nez v6, :cond_1

    sget-object v6, Lrq0/w;->SPLASH:Lrq0/w;

    :cond_1
    invoke-virtual {v3, v6}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v3

    if-lez v3, :cond_2

    sget v3, Lnf1/a;->h:I

    goto :goto_0

    :cond_2
    sget v3, Lnf1/a;->l:I

    :goto_0
    invoke-virtual {p1}, Lrq0/z;->t()Lrq0/w;

    move-result-object v6

    if-nez v6, :cond_3

    sget-object v6, Lrq0/w;->SPLASH:Lrq0/w;

    :cond_3
    iget-object v7, p0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->G:Lrq0/w;

    if-nez v7, :cond_4

    sget-object v7, Lrq0/w;->SPLASH:Lrq0/w;

    :cond_4
    invoke-virtual {v6, v7}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v6

    if-lez v6, :cond_5

    sget v6, Lnf1/a;->i:I

    goto :goto_1

    :cond_5
    sget v6, Lnf1/a;->m:I

    :goto_1
    invoke-virtual {p0}, Landroidx/fragment/app/r0;->getSupportFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v7

    invoke-static {v7, v7}, Lr;->g(Landroidx/fragment/app/o1;Landroidx/fragment/app/o1;)Landroidx/fragment/app/a;

    move-result-object v7

    invoke-virtual {v7, v3, v6, v4, v4}, Landroidx/fragment/app/c2;->f(IIII)V

    iget-boolean v3, v7, Landroidx/fragment/app/c2;->i:Z

    if-nez v3, :cond_b

    iput-boolean v4, v7, Landroidx/fragment/app/c2;->j:Z

    sget v3, Lxp0/a0;->D2:I

    invoke-virtual {v7, v3, v2, v1}, Landroidx/fragment/app/c2;->e(ILandroidx/fragment/app/m0;Ljava/lang/String;)V

    invoke-virtual {v7}, Landroidx/fragment/app/a;->j()I

    invoke-virtual {p1}, Lrq0/z;->t()Lrq0/w;

    move-result-object v3

    iput-object v3, p0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->G:Lrq0/w;

    invoke-virtual {p0}, Lm/m;->getSupportActionBar()Lm/b;

    move-result-object v3

    if-eqz v3, :cond_8

    invoke-virtual {v2}, Lrq0/o;->K()I

    move-result v6

    invoke-virtual {p0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Lm/b;->w(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lrq0/z;->t()Lrq0/w;

    move-result-object v6

    if-nez v6, :cond_6

    const/4 v6, -0x1

    goto :goto_2

    :cond_6
    sget-object v7, Lcom/whoop/community/presentation/teams/TeamCreateActivity$b;->a:[I

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v6, v7, v6

    :goto_2
    if-ne v6, v5, :cond_7

    invoke-virtual {v3, v5}, Lm/b;->o(Z)V

    sget v6, Lvu1/c;->j:I

    invoke-virtual {v3, v6}, Lm/b;->r(I)V

    goto :goto_3

    :cond_7
    invoke-virtual {v3, v5}, Lm/b;->o(Z)V

    sget v6, Lnf1/c;->c:I

    invoke-virtual {v3, v6}, Lm/b;->r(I)V

    :cond_8
    :goto_3
    iget-object v3, v0, Leq0/a;->a:Lcom/whoop/ui/WhoopZoomageView;

    invoke-virtual {p1}, Lrq0/z;->t()Lrq0/w;

    move-result-object v6

    sget-object v7, Lrq0/w;->BANNER:Lrq0/w;

    if-ne v6, v7, :cond_9

    move v6, v5

    goto :goto_4

    :cond_9
    move v6, v4

    :goto_4
    invoke-virtual {v3, v6}, Lcom/whoop/ui/WhoopZoomageView;->setTranslatable(Z)V

    iget-object v3, v0, Leq0/a;->a:Lcom/whoop/ui/WhoopZoomageView;

    invoke-virtual {p1}, Lrq0/z;->t()Lrq0/w;

    move-result-object v6

    if-ne v6, v7, :cond_a

    move v6, v5

    goto :goto_5

    :cond_a
    move v6, v4

    :goto_5
    invoke-virtual {v3, v6}, Lcom/whoop/ui/WhoopZoomageView;->setZoomable(Z)V

    iget-object v3, v0, Leq0/a;->e:Lcom/whoop/ui/pills/StrokedPillButton;

    invoke-virtual {v2}, Lrq0/o;->J()I

    move-result v2

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_6

    :cond_b
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "This transaction is already being added to the back stack"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    :cond_d
    :goto_6
    iget-object v2, p0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->L:Lrq0/a;

    const-string v3, "bannerPagerAdapter"

    if-eqz v2, :cond_1a

    invoke-virtual {v2}, Lrq0/a;->t()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {p1}, Lrq0/z;->g()Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-eq v2, v6, :cond_f

    iget-object v2, p0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->L:Lrq0/a;

    if-eqz v2, :cond_e

    invoke-virtual {p1}, Lrq0/z;->g()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v2, v1}, Lrq0/a;->v(Ljava/util/ArrayList;)V

    move v1, v5

    goto :goto_7

    :cond_e
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_f
    move v1, v4

    :goto_7
    if-nez v1, :cond_10

    invoke-virtual {p1}, Lrq0/z;->g()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-eqz v1, :cond_12

    iget-object v1, v0, Leq0/a;->b:Lcom/whoop/community/presentation/ui/SwipelessViewPager;

    invoke-virtual {v1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v1

    invoke-virtual {p1}, Lrq0/z;->g()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    rem-int/2addr v1, v2

    invoke-virtual {p1}, Lrq0/z;->f()I

    move-result v2

    if-eq v1, v2, :cond_12

    :cond_10
    iget-object v1, v0, Leq0/a;->b:Lcom/whoop/community/presentation/ui/SwipelessViewPager;

    invoke-virtual {p1}, Lrq0/z;->f()I

    move-result v2

    invoke-virtual {p1}, Lrq0/z;->g()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    mul-int/lit8 v3, v3, 0xa

    add-int/2addr v3, v2

    invoke-virtual {p1}, Lrq0/z;->t()Lrq0/w;

    move-result-object v2

    sget-object v6, Lrq0/w;->BANNER:Lrq0/w;

    if-ne v2, v6, :cond_11

    move v2, v5

    goto :goto_8

    :cond_11
    move v2, v4

    :goto_8
    invoke-virtual {v1, v3, v2}, Landroidx/viewpager/widget/ViewPager;->D(IZ)V

    :cond_12
    iget-object v1, v0, Leq0/a;->a:Lcom/whoop/ui/WhoopZoomageView;

    invoke-virtual {p1}, Lrq0/z;->e()Landroid/graphics/Bitmap;

    move-result-object v2

    if-eqz v2, :cond_13

    move v2, v5

    goto :goto_9

    :cond_13
    move v2, v4

    :goto_9
    invoke-static {v1, v2}, Lse/h;->T(Landroid/view/View;Z)V

    iget-object v1, v0, Leq0/a;->c:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lrq0/z;->e()Landroid/graphics/Bitmap;

    move-result-object v2

    if-nez v2, :cond_14

    move v2, v5

    goto :goto_a

    :cond_14
    move v2, v4

    :goto_a
    invoke-static {v1, v2}, Lse/h;->T(Landroid/view/View;Z)V

    iget-object v1, v0, Leq0/a;->b:Lcom/whoop/community/presentation/ui/SwipelessViewPager;

    invoke-virtual {p1}, Lrq0/z;->e()Landroid/graphics/Bitmap;

    move-result-object v2

    if-nez v2, :cond_15

    move v2, v5

    goto :goto_b

    :cond_15
    move v2, v4

    :goto_b
    invoke-static {v1, v2}, Lse/h;->T(Landroid/view/View;Z)V

    iget-object v1, v0, Leq0/a;->b:Lcom/whoop/community/presentation/ui/SwipelessViewPager;

    invoke-virtual {p1}, Lrq0/z;->t()Lrq0/w;

    move-result-object v2

    sget-object v3, Lrq0/w;->BANNER:Lrq0/w;

    if-eq v2, v3, :cond_16

    move v4, v5

    :cond_16
    invoke-virtual {v1, v4}, Lcom/whoop/community/presentation/ui/SwipelessViewPager;->setSwipeDisabled(Z)V

    invoke-virtual {p1}, Lrq0/z;->e()Landroid/graphics/Bitmap;

    move-result-object v1

    iget-object v2, p0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->I:Landroid/graphics/Bitmap;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    iget-object v1, v0, Leq0/a;->a:Lcom/whoop/ui/WhoopZoomageView;

    invoke-virtual {p1}, Lrq0/z;->e()Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/whoop/ui/WhoopZoomageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    invoke-virtual {p1}, Lrq0/z;->e()Landroid/graphics/Bitmap;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->I:Landroid/graphics/Bitmap;

    :cond_17
    iget-object v1, v0, Leq0/a;->d:Landroid/widget/FrameLayout;

    invoke-virtual {p1}, Lrq0/z;->k()Z

    move-result v2

    xor-int/2addr v2, v5

    invoke-static {v1, v2}, Lse/h;->T(Landroid/view/View;Z)V

    iget-object v1, v0, Leq0/a;->e:Lcom/whoop/ui/pills/StrokedPillButton;

    invoke-virtual {p1}, Lrq0/z;->k()Z

    move-result v2

    xor-int/2addr v2, v5

    invoke-static {v1, v2}, Lse/h;->T(Landroid/view/View;Z)V

    iget-object v1, v0, Leq0/a;->f:Lcom/whoop/ui/ThrobberView;

    invoke-virtual {p1}, Lrq0/z;->k()Z

    move-result v2

    invoke-static {v1, v2}, Lse/h;->T(Landroid/view/View;Z)V

    invoke-virtual {p1}, Lrq0/z;->k()Z

    move-result v1

    if-eqz v1, :cond_18

    iget-object v1, v0, Leq0/a;->f:Lcom/whoop/ui/ThrobberView;

    invoke-virtual {v1}, Lcom/whoop/ui/ThrobberView;->f()V

    goto :goto_c

    :cond_18
    iget-object v1, v0, Leq0/a;->f:Lcom/whoop/ui/ThrobberView;

    invoke-virtual {v1}, Lcom/whoop/ui/ThrobberView;->g()V

    :goto_c
    invoke-virtual {p1}, Lrq0/z;->j()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_19

    invoke-virtual {v0}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Lrq0/z;->j()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    invoke-virtual {p1}, Lrq0/z;->i()I

    move-result v0

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const-string v2, "createdTeam"

    invoke-virtual {p1}, Lrq0/z;->h()Lcom/whoop/domain/model/teams/Team;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_19
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_1a
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1b
    const-string p0, "binding"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method private static final O(ZLcom/whoop/community/presentation/teams/TeamCreateActivity;Landroid/view/View;)V
    .locals 0

    if-eqz p0, :cond_0

    iget-object p0, p1, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->G:Lrq0/w;

    if-eqz p0, :cond_0

    iget-object p2, p1, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->K:Ljava/util/HashMap;

    invoke-virtual {p2, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lrq0/o;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lrq0/o;->O()V

    invoke-direct {p1}, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->H()Lrq0/y;

    move-result-object p1

    invoke-virtual {p0}, Lrq0/o;->G()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lrq0/o;->H()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p2, p0}, Lrq0/y;->K(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private static final P(Lcom/whoop/community/presentation/teams/TeamCreateActivity;)Luf3/a;
    .locals 0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/community/presentation/teams/TeamCreateActivity;Lrq0/z;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->K(Lcom/whoop/community/presentation/teams/TeamCreateActivity;Lrq0/z;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final F()Landroid/graphics/drawable/BitmapDrawable;
    .locals 5

    iget-object v0, p0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->M:Leq0/a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, v0, Leq0/a;->a:Lcom/whoop/ui/WhoopZoomageView;

    invoke-virtual {v2}, Landroid/view/View;->getForeground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iget-object v3, v0, Leq0/a;->a:Lcom/whoop/ui/WhoopZoomageView;

    invoke-virtual {v3, v1}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    iget-object v1, v0, Leq0/a;->a:Lcom/whoop/ui/WhoopZoomageView;

    const-string v3, "bannerCrop"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lm/m;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const-string v4, "getResources(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v3}, Lrq0/u;->a(Landroid/widget/ImageView;Landroid/content/res/Resources;)Landroid/graphics/drawable/BitmapDrawable;

    move-result-object v1

    iget-object v0, v0, Leq0/a;->a:Lcom/whoop/ui/WhoopZoomageView;

    invoke-virtual {v0, v2}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    return-object v1

    :cond_0
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public final G()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->J:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final L(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "deliverResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->H:Lkotlin/jvm/functions/Function1;

    new-instance p1, Landroid/content/Intent;

    const-string v0, "android.intent.action.GET_CONTENT"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v0, "image/*"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lg/l;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_0
    return-void
.end method

.method public final M(Landroid/graphics/Bitmap;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->J:Landroid/graphics/Bitmap;

    return-void
.end method

.method public final N(Z)V
    .locals 4

    invoke-virtual {p0}, Lm/m;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    if-eqz p1, :cond_0

    sget v1, Lvu1/a;->s:I

    goto :goto_0

    :cond_0
    sget v1, Lvu1/a;->t:I

    :goto_0
    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->M:Leq0/a;

    const-string v3, "binding"

    if-eqz v1, :cond_3

    iget-object v1, v1, Leq0/a;->e:Lcom/whoop/ui/pills/StrokedPillButton;

    invoke-virtual {v1, v0}, Lcom/whoop/ui/pills/StrokedPillButton;->setStrokeColor(I)V

    iget-object v1, p0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->M:Leq0/a;

    if-eqz v1, :cond_2

    iget-object v1, v1, Leq0/a;->e:Lcom/whoop/ui/pills/StrokedPillButton;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->M:Leq0/a;

    if-eqz v0, :cond_1

    iget-object v0, v0, Leq0/a;->e:Lcom/whoop/ui/pills/StrokedPillButton;

    new-instance v1, Lrq0/m;

    invoke-direct {v1, p1, p0}, Lrq0/m;-><init>(ZLcom/whoop/community/presentation/teams/TeamCreateActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :cond_1
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_2
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_3
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/r0;->onActivityResult(IILandroid/content/Intent;)V

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    const/4 p1, -0x1

    if-ne p2, p1, :cond_1

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance p2, Lvq0/d;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p3

    const-string v0, "getFilesDir(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "getContentResolver(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p3, v0, p1}, Lvq0/d;-><init>(Ljava/io/File;Landroid/content/ContentResolver;Landroid/net/Uri;)V

    invoke-virtual {p2}, Lvq0/d;->a()Landroid/graphics/Bitmap;

    move-result-object p1

    iget-object p2, p0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->H:Lkotlin/jvm/functions/Function1;

    if-eqz p2, :cond_0

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->H:Lkotlin/jvm/functions/Function1;

    :cond_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lhj0/i;->onCreate(Landroid/os/Bundle;)V

    sget p1, Lxp0/b0;->a:I

    invoke-static {p0, p1}, Landroidx/databinding/g;->d(Lm/m;I)Landroidx/databinding/a0;

    move-result-object p1

    const-string v0, "setContentView(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Leq0/a;

    iput-object p1, p0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->M:Leq0/a;

    invoke-direct {p0}, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->H()Lrq0/y;

    move-result-object p1

    invoke-virtual {p1}, Lrq0/y;->O()V

    sget p1, Lnf1/d;->k:I

    invoke-virtual {p0, p1}, Lm/m;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p0, p1}, Lm/m;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    invoke-virtual {p0}, Lm/m;->getSupportActionBar()Lm/b;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lm/b;->s()V

    :cond_0
    sget p1, Lnf1/d;->n:I

    invoke-virtual {p0, p1}, Lm/m;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/whoop/ui/ProgressBar;

    invoke-virtual {p1}, Lcom/whoop/ui/ProgressBar;->a()V

    iget-object p1, p0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->K:Ljava/util/HashMap;

    sget-object v0, Lrq0/w;->SPLASH:Lrq0/w;

    sget-object v1, Lcom/whoop/community/presentation/teams/f;->K:Lcom/whoop/community/presentation/teams/f$a;

    invoke-virtual {v1}, Lcom/whoop/community/presentation/teams/f$a;->a()Lcom/whoop/community/presentation/teams/f;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->K:Ljava/util/HashMap;

    sget-object v0, Lrq0/w;->NAME:Lrq0/w;

    sget-object v1, Lcom/whoop/community/presentation/teams/d;->L:Lcom/whoop/community/presentation/teams/d$a;

    invoke-virtual {v1}, Lcom/whoop/community/presentation/teams/d$a;->a()Lcom/whoop/community/presentation/teams/d;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->K:Ljava/util/HashMap;

    sget-object v0, Lrq0/w;->BANNER:Lrq0/w;

    sget-object v1, Lcom/whoop/community/presentation/teams/b;->M:Lcom/whoop/community/presentation/teams/b$a;

    invoke-virtual {v1}, Lcom/whoop/community/presentation/teams/b$a;->a()Lcom/whoop/community/presentation/teams/b;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->K:Ljava/util/HashMap;

    sget-object v0, Lrq0/w;->LOGO:Lrq0/w;

    sget-object v1, Lcom/whoop/community/presentation/teams/c;->M:Lcom/whoop/community/presentation/teams/c$a;

    invoke-virtual {v1}, Lcom/whoop/community/presentation/teams/c$a;->a()Lcom/whoop/community/presentation/teams/c;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->K:Ljava/util/HashMap;

    sget-object v0, Lrq0/w;->SHARING:Lrq0/w;

    sget-object v1, Lcom/whoop/community/presentation/teams/e;->L:Lcom/whoop/community/presentation/teams/e$a;

    invoke-virtual {v1}, Lcom/whoop/community/presentation/teams/e$a;->a()Lcom/whoop/community/presentation/teams/e;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Lrq0/a;

    invoke-direct {p1, p0}, Lrq0/a;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->L:Lrq0/a;

    iget-object v0, p0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->M:Leq0/a;

    const/4 v1, 0x0

    const-string v2, "binding"

    if-eqz v0, :cond_2

    iget-object v0, v0, Leq0/a;->b:Lcom/whoop/community/presentation/ui/SwipelessViewPager;

    invoke-virtual {v0, p1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Lfc/a;)V

    iget-object p1, p0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->M:Leq0/a;

    if-eqz p1, :cond_1

    iget-object p1, p1, Leq0/a;->b:Lcom/whoop/community/presentation/ui/SwipelessViewPager;

    new-instance v0, Lcom/whoop/community/presentation/teams/TeamCreateActivity$c;

    invoke-direct {v0, p0}, Lcom/whoop/community/presentation/teams/TeamCreateActivity$c;-><init>(Lcom/whoop/community/presentation/teams/TeamCreateActivity;)V

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->c(Lfc/g;)V

    invoke-virtual {p0}, Lg/l;->getOnBackPressedDispatcher()Lg/z;

    move-result-object p1

    new-instance v0, Lcom/whoop/community/presentation/teams/TeamCreateActivity$d;

    invoke-direct {v0, p0}, Lcom/whoop/community/presentation/teams/TeamCreateActivity$d;-><init>(Lcom/whoop/community/presentation/teams/TeamCreateActivity;)V

    invoke-virtual {p1, p0, v0}, Lg/z;->a(Landroidx/lifecycle/g0;Lg/t;)V

    return-void

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lg/l;->onBackPressed()V

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public onStart()V
    .locals 3

    invoke-super {p0}, Lm/m;->onStart()V

    invoke-direct {p0}, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->J()V

    invoke-direct {p0}, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->H()Lrq0/y;

    move-result-object v0

    invoke-virtual {v0}, Lrq0/y;->I()Landroidx/lifecycle/p0;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrq0/z;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lrq0/z;->t()Lrq0/w;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->H()Lrq0/y;

    move-result-object v0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {v0, v2, v2, v1, v2}, Lrq0/y;->L(Lrq0/y;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public v()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->E:Ljava/lang/String;

    return-object v0
.end method
