.class public final Le10/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lab/g;

.field public final b:Landroidx/lifecycle/k1;

.field public final c:Lb20/f;

.field public final d:Lq83/j;

.field public final e:Lqy/d;

.field public final f:Le10/k0;


# direct methods
.method public constructor <init>(Lab/g;Landroidx/lifecycle/k1;Lb20/f;Lq83/j;Lqy/d;Le10/k0;)V
    .locals 1

    const-string v0, "registry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedStateHandle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ioContext"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmationSaver"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le10/n0;->a:Lab/g;

    iput-object p2, p0, Le10/n0;->b:Landroidx/lifecycle/k1;

    iput-object p3, p0, Le10/n0;->c:Lb20/f;

    iput-object p4, p0, Le10/n0;->d:Lq83/j;

    iput-object p5, p0, Le10/n0;->e:Lqy/d;

    iput-object p6, p0, Le10/n0;->f:Le10/k0;

    return-void
.end method


# virtual methods
.method public final a(Lbc3/c0;)Le10/r0;
    .locals 11

    iget-object v0, p0, Le10/n0;->a:Lab/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "savedStateHandle"

    iget-object v2, p0, Le10/n0;->b:Landroidx/lifecycle/k1;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lab/g;->x:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Lb2/d;

    const/4 v3, 0x3

    invoke-direct {v1, v3}, Lb2/d;-><init>(I)V

    invoke-static {v0, v1}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le10/j;

    new-instance v3, Le10/i0;

    invoke-direct {v3, v2, v1}, Le10/i0;-><init>(Landroidx/lifecycle/k1;Le10/j;)V

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v3, Le10/r0;

    iget-object v6, p0, Le10/n0;->b:Landroidx/lifecycle/k1;

    iget-object v7, p0, Le10/n0;->c:Lb20/f;

    iget-object v8, p0, Le10/n0;->d:Lq83/j;

    iget-object v9, p0, Le10/n0;->e:Lqy/d;

    iget-object v10, p0, Le10/n0;->f:Le10/k0;

    move-object v5, p1

    invoke-direct/range {v3 .. v10}, Le10/r0;-><init>(Ljava/util/ArrayList;Lbc3/c0;Landroidx/lifecycle/k1;Lb20/f;Lq83/j;Lqy/d;Le10/k0;)V

    return-object v3
.end method
