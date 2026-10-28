.class public final Lbi/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luh/e;


# instance fields
.field public final a:Ll83/p;

.field public final b:Ll83/p;

.field public final c:Lxl/a;


# direct methods
.method public constructor <init>(Ldf2/a;)V
    .locals 3

    new-instance v0, Lbf2/a;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lbf2/a;-><init>(I)V

    sget-object v1, Lbi/i;->w:Lbi/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lbi/j;->a:Ll83/p;

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lbi/j;->b:Ll83/p;

    new-instance p1, Lxl/a;

    const/4 v0, 0x6

    const/4 v2, 0x0

    invoke-direct {p1, v0, v2}, Lxl/a;-><init>(IZ)V

    iput-object v1, p1, Lxl/a;->x:Ljava/lang/Object;

    sget-object v0, Lci/b;->a:Lci/b;

    iput-object v0, p1, Lxl/a;->y:Ljava/lang/Object;

    iput-object p1, p0, Lbi/j;->c:Lxl/a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lfi/o;Lrh/t;)Luh/f;
    .locals 9

    check-cast p1, Lrh/y;

    iget-object v0, p1, Lrh/y;->c:Ljava/lang/String;

    const-string v1, "http"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-object v0, p1, Lrh/y;->c:Ljava/lang/String;

    const-string v2, "https"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v1

    :cond_1
    :goto_0
    new-instance v2, Lbi/o;

    iget-object v3, p1, Lrh/y;->a:Ljava/lang/String;

    iget-object v5, p0, Lbi/j;->a:Ll83/p;

    new-instance p1, La1/j;

    const/16 v0, 0xc

    invoke-direct {p1, p3, v0}, La1/j;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v6

    iget-object v7, p0, Lbi/j;->b:Ll83/p;

    iget-object p1, p0, Lbi/j;->c:Lxl/a;

    iget-object p3, p2, Lfi/o;->a:Landroid/content/Context;

    iget-object v0, p1, Lxl/a;->y:Ljava/lang/Object;

    sget-object v4, Lci/b;->a:Lci/b;

    if-eq v0, v4, :cond_2

    goto :goto_2

    :cond_2
    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lxl/a;->y:Ljava/lang/Object;

    if-eq v0, v4, :cond_3

    goto :goto_1

    :cond_3
    iget-object v0, p1, Lxl/a;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v0, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    iput-object p3, p1, Lxl/a;->y:Ljava/lang/Object;

    iput-object v1, p1, Lxl/a;->x:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v0, p3

    :goto_1
    monitor-exit p1

    :goto_2
    move-object v8, v0

    check-cast v8, Lbi/e;

    move-object v4, p2

    invoke-direct/range {v2 .. v8}, Lbi/o;-><init>(Ljava/lang/String;Lfi/o;Ll83/p;Ll83/p;Ll83/p;Lbi/e;)V

    return-object v2

    :catchall_0
    move-exception v0

    move-object p2, v0

    monitor-exit p1

    throw p2
.end method
