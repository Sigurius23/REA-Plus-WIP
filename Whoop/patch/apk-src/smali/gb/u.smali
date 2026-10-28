.class public final Lgb/u;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    iput p2, p0, Lgb/u;->w:I

    iput-object p1, p0, Lgb/u;->x:Landroid/content/Context;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lgb/u;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ltf3/a;

    const-string v0, "$this$module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lb2/r;

    iget-object v0, p0, Lgb/u;->x:Landroid/content/Context;

    const/4 v1, 0x6

    invoke-direct {v5, v0, v1}, Lb2/r;-><init>(Ljava/lang/Object;I)V

    new-instance v1, Lqf3/b;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Landroid/content/Context;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    sget-object v2, Lwf3/a;->e:Lvf3/c;

    const/4 v4, 0x0

    const/4 v6, 0x1

    invoke-direct/range {v1 .. v6}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v3, v4, v2}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v1, p1, v2, v3}, Lm4/a;->p(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)Lrf3/d;

    move-result-object v1

    const-class v2, Landroid/app/Application;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const-string v2, "clazz"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lrf3/b;->a:Lqf3/b;

    iget-object v3, v2, Lqf3/b;->f:Ljava/lang/Object;

    check-cast v3, Ljava/util/Collection;

    invoke-static {v0, v3}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v3

    iput-object v3, v2, Lqf3/b;->f:Ljava/lang/Object;

    iget-object v3, v2, Lqf3/b;->c:Lvf3/a;

    iget-object v2, v2, Lqf3/b;->a:Lvf3/a;

    invoke-static {v0, v3, v2}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v1, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Landroid/os/Bundle;

    iget-object v0, p0, Lgb/u;->x:Landroid/content/Context;

    invoke-static {v0}, Lge3/g;->d(Landroid/content/Context;)Leb/u0;

    move-result-object v0

    invoke-virtual {v0, p1}, Leb/a0;->H(Landroid/os/Bundle;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
