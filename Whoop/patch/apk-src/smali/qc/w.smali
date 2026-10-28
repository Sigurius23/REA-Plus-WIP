.class public final Lqc/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/room/z0;

.field public final b:Lqc/b;


# direct methods
.method public constructor <init>(Landroidx/room/z0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqc/w;->a:Landroidx/room/z0;

    new-instance p1, Lqc/b;

    const/4 v0, 0x6

    invoke-direct {p1, v0}, Lqc/b;-><init>(I)V

    iput-object p1, p0, Lqc/w;->b:Lqc/b;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/util/Set;)V
    .locals 4

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tags"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v1, Lqc/v;

    invoke-direct {v1, v0, p1}, Lqc/v;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lp3/b0;

    const/4 v2, 0x7

    invoke-direct {v0, v2, p0, v1}, Lp3/b0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, Lqc/w;->a:Landroidx/room/z0;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v1, v2, v3, v0}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method
