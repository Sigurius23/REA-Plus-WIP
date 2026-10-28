.class public final Li20/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/a2;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Li20/c;Li20/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Li20/o;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Li20/o;->b:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Li20/o;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ls20/a;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Li20/o;->a:I

    const-string v0, "formElements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formArguments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Li20/o;->b:Ljava/lang/Object;

    .line 6
    iput-object p2, p0, Li20/o;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Class;)Landroidx/lifecycle/w1;
    .locals 8

    iget v0, p0, Li20/o;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lo20/e;

    iget-object v0, p0, Li20/o;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Li20/o;->c:Ljava/lang/Object;

    check-cast v1, Ls20/a;

    invoke-direct {p1, v0, v1}, Lo20/e;-><init>(Ljava/util/List;Ls20/a;)V

    return-object p1

    :pswitch_0
    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Li20/o;->b:Ljava/lang/Object;

    check-cast p1, Li20/c;

    invoke-virtual {p1}, Li20/c;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iget-object v0, p0, Li20/o;->c:Ljava/lang/Object;

    check-cast v0, Li20/c;

    invoke-virtual {v0}, Li20/c;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li20/h;

    new-instance v1, Lkr/j;

    new-instance v2, Lt9/c0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    new-instance v3, Lt9/p;

    const/4 v4, 0x7

    invoke-direct {v3, v4}, Lt9/p;-><init>(I)V

    new-instance v4, Lng3/n;

    const/16 v5, 0xb

    invoke-direct {v4, v5}, Lng3/n;-><init>(I)V

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, v1, Lkr/j;->b:Ljava/lang/Object;

    iput-object v0, v1, Lkr/j;->a:Ljava/lang/Object;

    sget-object v5, Li20/l1;->a:Li20/m1;

    invoke-static {v5}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v5

    iput-object v5, v1, Lkr/j;->c:Ljava/lang/Object;

    new-instance v5, Lp20/b;

    const/4 v6, 0x0

    invoke-direct {v5, v1, v6}, Lp20/b;-><init>(Lkr/j;I)V

    iput-object v5, v1, Lkr/j;->d:Ljava/lang/Object;

    new-instance v5, Lp20/b;

    const/4 v6, 0x1

    invoke-direct {v5, v1, v6}, Lp20/b;-><init>(Lkr/j;I)V

    iput-object v5, v1, Lkr/j;->e:Ljava/lang/Object;

    sget-object v5, Lp20/a;->d:Lcy/b;

    invoke-static {v5}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v5

    new-instance v6, Le20/a;

    const/4 v7, 0x5

    invoke-direct {v6, v3, v5, v7}, Le20/a;-><init>(Ljava/lang/Object;Lv03/h;I)V

    invoke-static {v6}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v3

    iput-object v3, v1, Lkr/j;->f:Ljava/lang/Object;

    new-instance v3, Luy/a;

    const/4 v5, 0x1

    invoke-direct {v3, v2, v5}, Luy/a;-><init>(Lt9/c0;I)V

    invoke-static {v3}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v2

    iput-object v2, v1, Lkr/j;->g:Ljava/lang/Object;

    iget-object v3, v1, Lkr/j;->f:Ljava/lang/Object;

    check-cast v3, Lv03/h;

    new-instance v5, Lb20/g;

    const/16 v6, 0xb

    invoke-direct {v5, v3, v2, v6}, Lb20/g;-><init>(Lv03/h;Lv03/h;I)V

    iput-object v5, v1, Lkr/j;->h:Ljava/lang/Object;

    invoke-static {p1}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object p1

    iput-object p1, v1, Lkr/j;->i:Ljava/lang/Object;

    new-instance v2, Lp20/i;

    const/4 v3, 0x0

    invoke-direct {v2, p1, v3}, Lp20/i;-><init>(Lv03/h;I)V

    new-instance p1, Lb10/c;

    const/16 v3, 0x8

    invoke-direct {p1, v2, v3}, Lb10/c;-><init>(Ljava/lang/Object;I)V

    iput-object p1, v1, Lkr/j;->j:Ljava/lang/Object;

    new-instance p1, Lb10/c;

    const/4 v2, 0x5

    invoke-direct {p1, v4, v2}, Lb10/c;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object p1

    iget-object v2, v1, Lkr/j;->i:Ljava/lang/Object;

    check-cast v2, Lv03/e;

    iget-object v3, v1, Lkr/j;->j:Ljava/lang/Object;

    check-cast v3, Lb10/c;

    new-instance v5, La30/c;

    const/4 v6, 0x2

    invoke-direct {v5, v2, v3, p1, v6}, La30/c;-><init>(Lv03/h;Lv03/h;Lv03/h;I)V

    iget-object p1, v1, Lkr/j;->h:Ljava/lang/Object;

    check-cast p1, Lb20/g;

    iget-object v2, v1, Lkr/j;->g:Ljava/lang/Object;

    check-cast v2, Lv03/h;

    new-instance v3, Lay/w;

    const/4 v6, 0x3

    invoke-direct {v3, p1, v5, v2, v6}, Lay/w;-><init>(Lv03/h;Lv03/h;Lv03/h;I)V

    invoke-static {v3}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object p1

    new-instance v2, Le20/a;

    const/4 v3, 0x2

    invoke-direct {v2, v4, p1, v3}, Le20/a;-><init>(Ljava/lang/Object;Lv03/h;I)V

    invoke-static {v2}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object p1

    iput-object p1, v1, Lkr/j;->k:Ljava/lang/Object;

    invoke-static {v0}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object p1

    iget-object v0, v1, Lkr/j;->i:Ljava/lang/Object;

    check-cast v0, Lv03/e;

    new-instance v2, Lc00/f;

    invoke-direct {v2, v4, v0, p1}, Lc00/f;-><init>(Lng3/n;Lv03/e;Lv03/e;)V

    invoke-static {v2}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object p1

    iput-object p1, v1, Lkr/j;->l:Ljava/lang/Object;

    new-instance p1, Li20/p;

    iget-object v0, v1, Lkr/j;->c:Ljava/lang/Object;

    check-cast v0, Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li20/k1;

    iget-object v2, v1, Lkr/j;->d:Ljava/lang/Object;

    check-cast v2, Lp20/b;

    iget-object v1, v1, Lkr/j;->e:Ljava/lang/Object;

    check-cast v1, Lp20/b;

    invoke-direct {p1, v0, v2, v1}, Li20/p;-><init>(Li20/k1;Lp20/b;Lp20/b;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
