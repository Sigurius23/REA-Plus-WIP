.class final Lsl0/u1$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsl0/u1;->d(Lsl0/v1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic E:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic F:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic w:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ll83/k;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic x:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic y:Lsl0/v1;

.field final synthetic z:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/atomic/AtomicReference;Lkotlin/jvm/functions/Function1;Lsl0/v1;Lp1/c1;Lp1/c1;Lp1/c1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ll83/k;",
            ">;",
            "Lkotlin/jvm/functions/Function1;",
            "Lsl0/v1;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lp1/c1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lsl0/u1$d;->w:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p2, p0, Lsl0/u1$d;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lsl0/u1$d;->y:Lsl0/v1;

    iput-object p4, p0, Lsl0/u1$d;->z:Lp1/c1;

    iput-object p5, p0, Lsl0/u1$d;->E:Lp1/c1;

    iput-object p6, p0, Lsl0/u1$d;->F:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 12

    iget-object v0, p0, Lsl0/u1$d;->w:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll83/k;

    if-eqz v0, :cond_0

    iget-object v2, v0, Ll83/k;->w:Ljava/lang/Object;

    move-object v4, v2

    check-cast v4, Ljava/lang/String;

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v5

    iget-object v0, p0, Lsl0/u1$d;->x:Lkotlin/jvm/functions/Function1;

    new-instance v3, Lnl0/d$m;

    iget-object v2, p0, Lsl0/u1$d;->y:Lsl0/v1;

    invoke-virtual {v2}, Lsl0/v1;->b()I

    move-result v6

    iget-object v2, p0, Lsl0/u1$d;->y:Lsl0/v1;

    invoke-virtual {v2}, Lsl0/v1;->a()Ljava/lang/String;

    move-result-object v7

    const/16 v10, 0x30

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v11}, Lnl0/d$m;-><init>(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lfl0/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lsl0/u1$d;->z:Lp1/c1;

    invoke-static {v0, v1}, Lsl0/u1;->s(Lp1/c1;Ljava/lang/Integer;)V

    iget-object v0, p0, Lsl0/u1$d;->E:Lp1/c1;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lsl0/u1;->u(Lp1/c1;Z)V

    iget-object v0, p0, Lsl0/u1$d;->y:Lsl0/v1;

    invoke-virtual {v0}, Lsl0/v1;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lsl0/u1$d;->F:Lp1/c1;

    sget-object v1, Lm83/y;->w:Lm83/y;

    invoke-static {v0, v1}, Lsl0/u1;->v(Lp1/c1;Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lsl0/u1$d;->a()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
