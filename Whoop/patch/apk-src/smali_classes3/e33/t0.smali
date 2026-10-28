.class public final Le33/t0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lbi/p;

.field public final synthetic w:Le33/v0;

.field public final synthetic x:Z

.field public final synthetic y:Ljava/util/List;

.field public final synthetic z:Ljava/util/List;


# direct methods
.method public constructor <init>(Le33/v0;ZLjava/util/List;Ljava/util/List;Lbi/p;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Le33/t0;->w:Le33/v0;

    iput-boolean p2, p0, Le33/t0;->x:Z

    iput-object p3, p0, Le33/t0;->y:Ljava/util/List;

    iput-object p4, p0, Le33/t0;->z:Ljava/util/List;

    iput-object p5, p0, Le33/t0;->E:Lbi/p;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 7

    new-instance v0, Le33/t0;

    iget-object v4, p0, Le33/t0;->z:Ljava/util/List;

    iget-object v5, p0, Le33/t0;->E:Lbi/p;

    iget-object v1, p0, Le33/t0;->w:Le33/v0;

    iget-boolean v2, p0, Le33/t0;->x:Z

    iget-object v3, p0, Le33/t0;->y:Ljava/util/List;

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Le33/t0;-><init>(Le33/v0;ZLjava/util/List;Ljava/util/List;Lbi/p;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Le33/t0;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le33/t0;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Le33/t0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, p0, Le33/t0;->w:Le33/v0;

    iget-object p1, v2, Le33/v0;->E:Lbc3/c2;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iget-object p1, v2, Le33/v0;->y:Lbc3/c0;

    new-instance v1, Ld33/t0;

    iget-object v6, p0, Le33/t0;->E:Lbi/p;

    const/4 v7, 0x0

    iget-boolean v3, p0, Le33/t0;->x:Z

    iget-object v4, p0, Le33/t0;->y:Ljava/util/List;

    iget-object v5, p0, Le33/t0;->z:Ljava/util/List;

    invoke-direct/range {v1 .. v7}, Ld33/t0;-><init>(Le33/v0;ZLjava/util/List;Ljava/util/List;Lbi/p;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {p1, v0, v0, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, v2, Le33/v0;->E:Lbc3/c2;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
