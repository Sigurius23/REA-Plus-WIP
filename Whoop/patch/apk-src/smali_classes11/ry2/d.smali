.class public final synthetic Lry2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 1
    iput p1, p0, Lry2/d;->w:I

    iput-object p2, p0, Lry2/d;->x:Ljava/lang/Object;

    iput-object p3, p0, Lry2/d;->z:Ljava/lang/Object;

    iput-object p4, p0, Lry2/d;->y:Ljava/lang/Object;

    iput-object p5, p0, Lry2/d;->E:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/16 v0, 0x10

    iput v0, p0, Lry2/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lry2/d;->y:Ljava/lang/Object;

    iput-object p2, p0, Lry2/d;->E:Ljava/lang/Object;

    iput-object p3, p0, Lry2/d;->z:Ljava/lang/Object;

    iput-object p4, p0, Lry2/d;->x:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Lnl0/c;Lb3/x2;Lc93/m;)V
    .locals 1

    .line 3
    const/4 v0, 0x3

    iput v0, p0, Lry2/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lry2/d;->y:Ljava/lang/Object;

    iput-object p2, p0, Lry2/d;->z:Ljava/lang/Object;

    iput-object p3, p0, Lry2/d;->x:Ljava/lang/Object;

    iput-object p4, p0, Lry2/d;->E:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 4
    iput p5, p0, Lry2/d;->w:I

    iput-object p1, p0, Lry2/d;->x:Ljava/lang/Object;

    iput-object p2, p0, Lry2/d;->y:Ljava/lang/Object;

    iput-object p3, p0, Lry2/d;->z:Ljava/lang/Object;

    iput-object p4, p0, Lry2/d;->E:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 5
    iput p5, p0, Lry2/d;->w:I

    iput-object p1, p0, Lry2/d;->x:Ljava/lang/Object;

    iput-object p2, p0, Lry2/d;->y:Ljava/lang/Object;

    iput-object p3, p0, Lry2/d;->E:Ljava/lang/Object;

    iput-object p4, p0, Lry2/d;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 6
    iput p5, p0, Lry2/d;->w:I

    iput-object p1, p0, Lry2/d;->z:Ljava/lang/Object;

    iput-object p2, p0, Lry2/d;->x:Ljava/lang/Object;

    iput-object p3, p0, Lry2/d;->y:Ljava/lang/Object;

    iput-object p4, p0, Lry2/d;->E:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lry2/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lry2/d;->x:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    iget-object v1, p0, Lry2/d;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    iget-object v2, p0, Lry2/d;->z:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    iget-object v3, p0, Lry2/d;->E:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/design/atomic/organism/toolbar/d$c;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, v2, v3, p1}, Lzc1/i5;->m(Lp1/c1;Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$c;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lry2/d;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lry2/d;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lry2/d;->z:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    iget-object v3, p0, Lry2/d;->E:Ljava/lang/Object;

    check-cast v3, Lp1/c1;

    invoke-static {v0, v1, v2, v3, p1}, Lzc1/v2;->a(Ljava/lang/String;Ljava/lang/String;Lp1/c1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lry2/d;->x:Ljava/lang/Object;

    check-cast v0, Lp1/z0;

    iget-object v1, p0, Lry2/d;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    iget-object v2, p0, Lry2/d;->z:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    iget-object v3, p0, Lry2/d;->E:Ljava/lang/Object;

    check-cast v3, Lp1/c1;

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {v0, v1, v2, v3, p1}, Lwr0/u0;->c(Lp1/z0;Lp1/c1;Lp1/c1;Lp1/c1;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lry2/d;->x:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    iget-object v1, p0, Lry2/d;->y:Ljava/lang/Object;

    check-cast v1, Landroidx/viewpager2/widget/ViewPager2;

    iget-object v2, p0, Lry2/d;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lry2/d;->E:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, v1, v2, v3, p1}, Lw81/c;->d(Lp1/c1;Landroidx/viewpager2/widget/ViewPager2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lry2/d;->z:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lry2/d;->x:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    iget-object v2, p0, Lry2/d;->y:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    iget-object v3, p0, Lry2/d;->E:Ljava/lang/Object;

    check-cast v3, Lp1/c1;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, p1}, Lw80/b;->d(Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lry2/d;->x:Ljava/lang/Object;

    check-cast v0, Ltp1/c;

    iget-object v1, p0, Lry2/d;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    iget-object v2, p0, Lry2/d;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lry2/d;->E:Ljava/lang/Object;

    check-cast v3, Lp1/c1;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, v2, v3, p1}, Lvp1/h;->d0(Ltp1/c;Lp1/c1;Lkotlin/jvm/functions/Function1;Lp1/c1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lry2/d;->x:Ljava/lang/Object;

    check-cast v0, Ltp1/c;

    iget-object v1, p0, Lry2/d;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    iget-object v2, p0, Lry2/d;->z:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    iget-object v3, p0, Lry2/d;->E:Ljava/lang/Object;

    check-cast v3, Lp1/c1;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, v2, v3, p1}, Lvp1/h;->E(Ltp1/c;Lp1/c1;Lp1/c1;Lp1/c1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lry2/d;->x:Ljava/lang/Object;

    check-cast v0, Ltp1/j;

    iget-object v1, p0, Lry2/d;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    iget-object v2, p0, Lry2/d;->z:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    iget-object v3, p0, Lry2/d;->E:Ljava/lang/Object;

    check-cast v3, Lp1/c1;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, v2, v3, p1}, Lvp1/h;->L(Ltp1/j;Lp1/c1;Lp1/c1;Lp1/c1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lry2/d;->z:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lry2/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lry2/d;->y:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    iget-object v3, p0, Lry2/d;->E:Ljava/lang/Object;

    check-cast v3, Lp1/c1;

    check-cast p1, La81/t;

    invoke-static {v0, v1, v2, v3, p1}, Lvo1/r;->o(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;La81/t;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lry2/d;->y:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v1, p0, Lry2/d;->E:Ljava/lang/Object;

    check-cast v1, Lg1/y3;

    iget-object v2, p0, Lry2/d;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lry2/d;->x:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast p1, Lte0/b;

    invoke-static {v0, v1, v2, v3, p1}, Lve0/e;->v(Lbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lte0/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lry2/d;->x:Ljava/lang/Object;

    check-cast v0, Lg2/i;

    iget-object v1, p0, Lry2/d;->y:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    iget-object v2, p0, Lry2/d;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lry2/d;->E:Ljava/lang/Object;

    check-cast v3, Lq0/b;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, v1, v2, v3, p1}, Luw0/l;->b(Lg2/i;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lq0/b;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lry2/d;->x:Ljava/lang/Object;

    check-cast v0, Lm91/u;

    iget-object v1, p0, Lry2/d;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v2, p0, Lry2/d;->E:Ljava/lang/Object;

    check-cast v2, Ly81/e;

    iget-object v3, p0, Lry2/d;->z:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, v2, v3, p1}, Luw0/l;->i(Lm91/u;Ljava/util/List;Ly81/e;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lry2/d;->z:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lry2/d;->x:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    iget-object v2, p0, Lry2/d;->y:Ljava/lang/Object;

    check-cast v2, Leb/a0;

    iget-object v3, p0, Lry2/d;->E:Ljava/lang/Object;

    check-cast v3, Ll83/h;

    check-cast p1, Luu2/p;

    invoke-static {v0, v1, v2, v3, p1}, Luu2/w;->i(Lkotlin/jvm/functions/Function1;Lc93/a;Leb/a0;Ll83/h;Luu2/p;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lry2/d;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;

    iget-object v1, p0, Lry2/d;->y:Ljava/lang/Object;

    check-cast v1, Leb/u0;

    iget-object v2, p0, Lry2/d;->z:Ljava/lang/Object;

    check-cast v2, Leb/a0;

    iget-object v3, p0, Lry2/d;->E:Ljava/lang/Object;

    check-cast v3, Ll83/h;

    check-cast p1, Luu2/c;

    invoke-static {v0, v1, v2, v3, p1}, Luu2/l;->f(Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;Leb/u0;Leb/a0;Ll83/h;Luu2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lry2/d;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/settings/journalv2/h;

    iget-object v1, p0, Lry2/d;->y:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    iget-object v2, p0, Lry2/d;->z:Ljava/lang/Object;

    check-cast v2, Lc93/m;

    iget-object v3, p0, Lry2/d;->E:Ljava/lang/Object;

    check-cast v3, Lp1/c1;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/whoop/settings/journalv2/e;->b(Lcom/whoop/settings/journalv2/h;Lc93/a;Lc93/m;Lp1/c1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lry2/d;->x:Ljava/lang/Object;

    check-cast v0, Lu0/s0;

    iget-object v1, p0, Lry2/d;->y:Ljava/lang/Object;

    check-cast v1, Lq3/z;

    iget-object v2, p0, Lry2/d;->z:Ljava/lang/Object;

    check-cast v2, Lq3/y;

    iget-object v3, p0, Lry2/d;->E:Ljava/lang/Object;

    check-cast v3, Lq3/l;

    check-cast p1, Lp1/i0;

    invoke-virtual {v0}, Lu0/s0;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, v0, Lu0/s0;->d:Lq3/i;

    iget-object v4, v0, Lu0/s0;->v:Lu0/v;

    iget-object v5, v0, Lu0/s0;->w:Lu0/v;

    new-instance v6, Lkotlin/jvm/internal/g0;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    new-instance v7, Ls90/f;

    const/16 v8, 0xf

    invoke-direct {v7, p1, v4, v6, v8}, Ls90/f;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    iget-object p1, v1, Lq3/z;->a:Lq3/t;

    invoke-interface {p1, v2, v3, v7, v5}, Lq3/t;->f(Lq3/y;Lq3/l;Ls90/f;Lu0/v;)V

    new-instance v2, Lq3/d0;

    invoke-direct {v2, v1, p1}, Lq3/d0;-><init>(Lq3/z;Lq3/t;)V

    iget-object p1, v1, Lq3/z;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iput-object v2, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iput-object v2, v0, Lu0/s0;->e:Lq3/d0;

    :cond_0
    new-instance p1, Lu0/a0;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lry2/d;->x:Ljava/lang/Object;

    check-cast v0, Lq83/j;

    iget-object v1, p0, Lry2/d;->y:Ljava/lang/Object;

    check-cast v1, Landroid/graphics/Bitmap;

    iget-object v2, p0, Lry2/d;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/g0;

    iget-object v3, p0, Lry2/d;->E:Ljava/lang/Object;

    check-cast v3, Ltw2/d;

    check-cast p1, Ltw2/a;

    invoke-static {v0, v1, v2, v3, p1}, Ltw2/d;->b(Lq83/j;Landroid/graphics/Bitmap;Lkotlin/jvm/internal/g0;Ltw2/d;Ltw2/a;)[B

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lry2/d;->z:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lry2/d;->x:Ljava/lang/Object;

    check-cast v1, Ltu1/g;

    iget-object v2, p0, Lry2/d;->y:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lry2/d;->E:Ljava/lang/Object;

    check-cast v3, Lp1/c1;

    invoke-static {v0, v1, v2, v3, p1}, Ltu1/f;->c(Lkotlin/jvm/functions/Function1;Ltu1/g;Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lry2/d;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lry2/d;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lry2/d;->y:Ljava/lang/Object;

    check-cast v2, Ln82/c;

    iget-object v3, p0, Lry2/d;->E:Ljava/lang/Object;

    check-cast v3, Lp1/a1;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, v2, v3, p1}, Ltg2/j;->e(Ljava/util/List;Lkotlin/jvm/functions/Function1;Ln82/c;Lp1/a1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lry2/d;->x:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    iget-object v1, p0, Lry2/d;->y:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    iget-object v2, p0, Lry2/d;->E:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    iget-object v3, p0, Lry2/d;->z:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, p1}, Lsy2/p;->j(Lp1/c1;Lbc3/c0;Lp1/c1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lry2/d;->x:Ljava/lang/Object;

    check-cast v0, Lrv2/h$b;

    iget-object v1, p0, Lry2/d;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lry2/d;->y:Ljava/lang/Object;

    check-cast v2, Lbc3/c0;

    iget-object v3, p0, Lry2/d;->E:Ljava/lang/Object;

    check-cast v3, Lg1/y3;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, v2, v3, p1}, Lsv2/e;->R(Lrv2/h$b;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lg1/y3;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lry2/d;->x:Ljava/lang/Object;

    check-cast v0, Lfi0/a;

    iget-object v1, p0, Lry2/d;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v2, p0, Lry2/d;->y:Ljava/lang/Object;

    check-cast v2, Lbc3/c0;

    iget-object v3, p0, Lry2/d;->E:Ljava/lang/Object;

    check-cast v3, Lbm/t;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, v1, v2, v3, p1}, Lsv2/e;->L(Lfi0/a;Ljava/util/List;Lbc3/c0;Lbm/t;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lry2/d;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    iget-object v1, p0, Lry2/d;->z:Ljava/lang/Object;

    check-cast v1, Lnl0/c;

    iget-object v2, p0, Lry2/d;->x:Ljava/lang/Object;

    check-cast v2, Lb3/x2;

    iget-object v3, p0, Lry2/d;->E:Ljava/lang/Object;

    check-cast v3, Lc93/m;

    check-cast p1, Lcom/whoop/bot/models/feedback/AiFeedbackType;

    invoke-static {v0, v1, v2, v3, p1}, Lsl0/s3;->m(Lcom/whoop/data/repositories/FeatureFlagChecker;Lnl0/c;Lb3/x2;Lc93/m;Lcom/whoop/bot/models/feedback/AiFeedbackType;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lry2/d;->x:Ljava/lang/Object;

    check-cast v0, Lnl0/f;

    iget-object v1, p0, Lry2/d;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lry2/d;->y:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lry2/d;->E:Ljava/lang/Object;

    check-cast v3, Lsl0/y0;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, v2, v3, p1}, Lsl0/u0;->H(Lnl0/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lsl0/y0;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lry2/d;->x:Ljava/lang/Object;

    check-cast v0, Li71/h;

    iget-object v1, p0, Lry2/d;->y:Ljava/lang/Object;

    check-cast v1, Li71/g;

    iget-object v2, p0, Lry2/d;->z:Ljava/lang/Object;

    check-cast v2, Lu61/a;

    iget-object v3, p0, Lry2/d;->E:Ljava/lang/Object;

    check-cast v3, Li91/h;

    check-cast p1, Lk2/e;

    invoke-static {v0, v1, v2, v3, p1}, Ls61/a;->a(Li71/h;Li71/g;Lu61/a;Li91/h;Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lry2/d;->x:Ljava/lang/Object;

    check-cast v0, Lb3/x2;

    iget-object v1, p0, Lry2/d;->y:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    iget-object v2, p0, Lry2/d;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lry2/d;->E:Ljava/lang/Object;

    check-cast v3, Lg1/y3;

    check-cast p1, Lny2/a;

    invoke-static {v0, v1, v2, v3, p1}, Lry2/e;->l(Lb3/x2;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lg1/y3;Lny2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
