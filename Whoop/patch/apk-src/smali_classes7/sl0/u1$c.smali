.class final Lsl0/u1$c;
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

.field final synthetic w:Z

.field final synthetic x:Ljava/lang/String;

.field final synthetic y:I

.field final synthetic z:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ll83/k;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLjava/lang/String;ILjava/util/concurrent/atomic/AtomicReference;Lp1/c1;Lp1/c1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ll83/k;",
            ">;",
            "Lp1/c1;",
            "Lp1/c1;",
            ")V"
        }
    .end annotation

    iput-boolean p1, p0, Lsl0/u1$c;->w:Z

    iput-object p2, p0, Lsl0/u1$c;->x:Ljava/lang/String;

    iput p3, p0, Lsl0/u1$c;->y:I

    iput-object p4, p0, Lsl0/u1$c;->z:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p5, p0, Lsl0/u1$c;->E:Lp1/c1;

    iput-object p6, p0, Lsl0/u1$c;->F:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-boolean v0, p0, Lsl0/u1$c;->w:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lsl0/u1$c;->x:Ljava/lang/String;

    iget v1, p0, Lsl0/u1$c;->y:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, Lsl0/u1$c;->z:Ljava/util/concurrent/atomic/AtomicReference;

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, p0, Lsl0/u1$c;->E:Lp1/c1;

    iget v1, p0, Lsl0/u1$c;->y:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lsl0/u1;->s(Lp1/c1;Ljava/lang/Integer;)V

    iget-object v0, p0, Lsl0/u1$c;->F:Lp1/c1;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lsl0/u1;->u(Lp1/c1;Z)V

    return-void

    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    :cond_2
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lsl0/u1$c;->a()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
