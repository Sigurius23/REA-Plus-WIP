.class public final Lc00/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv03/d;


# instance fields
.field public final synthetic w:I

.field public final x:Lv03/e;

.field public final y:Lv03/h;


# direct methods
.method public constructor <init>(Lng3/n;Lv03/e;Lv03/e;)V
    .locals 0

    const/4 p1, 0x2

    iput p1, p0, Lc00/f;->w:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p2, p0, Lc00/f;->y:Lv03/h;

    .line 7
    iput-object p3, p0, Lc00/f;->x:Lv03/e;

    return-void
.end method

.method public constructor <init>(Lv03/e;La30/h;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lc00/f;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lc00/f;->x:Lv03/e;

    .line 4
    iput-object p2, p0, Lc00/f;->y:Lv03/h;

    return-void
.end method

.method public synthetic constructor <init>(Lv03/h;Lv03/e;I)V
    .locals 0

    .line 1
    iput p3, p0, Lc00/f;->w:I

    iput-object p1, p0, Lc00/f;->y:Lv03/h;

    iput-object p2, p0, Lc00/f;->x:Lv03/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lc00/f;->w:I

    const/4 v1, 0x1

    sget-object v2, Lqy/e;->b:Lqy/d;

    const-string v3, "getApplicationContext(...)"

    sget-object v4, Lm83/a0;->w:Lm83/a0;

    const-string v5, "args"

    const-string v6, "context"

    iget-object v7, p0, Lc00/f;->x:Lv03/e;

    iget-object v8, p0, Lc00/f;->y:Lv03/h;

    packed-switch v0, :pswitch_data_0

    invoke-interface {v8}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v7, v7, Lv03/e;->w:Ljava/lang/Object;

    check-cast v7, Li20/c0;

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v7, Li20/c0;->y:Ljava/lang/String;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lb20/f;

    new-instance v7, Lyy/j;

    sget-object v8, Lbc3/q0;->a:Lkc3/e;

    sget-object v8, Lkc3/d;->w:Lkc3/d;

    invoke-static {v8}, Ls93/k;->c(Ljava/lang/Object;)V

    invoke-direct {v7, v2, v8}, Lyy/j;-><init>(Lqy/d;Lq83/j;)V

    new-instance v2, Lb10/b;

    new-instance v8, Lal0/f;

    invoke-direct {v8, v6, v1}, Lal0/f;-><init>(Landroid/content/Context;I)V

    invoke-direct {v2, v6, v4, v8}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V

    invoke-direct {v3, v7, v2}, Lb20/f;-><init>(Lyy/j;Lyy/c;)V

    invoke-static {v0, v5, v3}, Ly30/d;->b(Landroid/content/Context;Ljava/lang/String;Lb20/f;)Ly30/e;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-interface {v8}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v7, v7, Lv03/e;->w:Ljava/lang/Object;

    check-cast v7, Li20/h;

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v7, Li20/h;->x:Li20/s;

    if-eqz v5, :cond_0

    iget-object v5, v5, Li20/s;->G:Ljava/lang/String;

    if-eqz v5, :cond_0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lb20/f;

    new-instance v7, Lyy/j;

    sget-object v8, Lbc3/q0;->a:Lkc3/e;

    sget-object v8, Lkc3/d;->w:Lkc3/d;

    invoke-static {v8}, Ls93/k;->c(Ljava/lang/Object;)V

    invoke-direct {v7, v2, v8}, Lyy/j;-><init>(Lqy/d;Lq83/j;)V

    new-instance v2, Lb10/b;

    new-instance v8, Lal0/f;

    invoke-direct {v8, v6, v1}, Lal0/f;-><init>(Landroid/content/Context;I)V

    invoke-direct {v2, v6, v4, v8}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V

    invoke-direct {v3, v7, v2}, Lb20/f;-><init>(Lyy/j;Lyy/c;)V

    invoke-static {v0, v5, v3}, Ly30/d;->b(Landroid/content/Context;Ljava/lang/String;Lb20/f;)Ly30/e;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :pswitch_1
    iget-object v0, v7, Lv03/e;->w:Ljava/lang/Object;

    check-cast v0, Ltz/b;

    invoke-interface {v8}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbz/i;

    new-instance v2, Lj10/a;

    invoke-direct {v2, v0, v1}, Lj10/a;-><init>(Ltz/b;Lbz/i;)V

    return-object v2

    :pswitch_2
    invoke-interface {v8}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/k1;

    iget-object v1, v7, Lv03/e;->w:Ljava/lang/Object;

    check-cast v1, Lwz/d;

    const-string v2, "savedStateHandle"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "linkAccountInfo"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lxz/f0;

    invoke-direct {v2, v0}, Lxz/f0;-><init>(Landroidx/lifecycle/k1;)V

    invoke-virtual {v2, v1}, Lxz/f0;->a(Lwz/d;)V

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
