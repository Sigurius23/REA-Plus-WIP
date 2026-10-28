.class public final Lcom/whoop/healthspan/domain/b$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/healthspan/domain/b;->interact(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"
    }
    d2 = {
        "R",
        "T",
        "Lec3/m;",
        "it",
        "Ll83/a0;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.healthspan.domain.HealthspanInteractor$interact$$inlined$flatMapLatest$1"
    f = "HealthspanInteractor.kt"
    l = {
        0xbd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lcom/whoop/healthspan/domain/b;


# direct methods
.method public constructor <init>(Lq83/d;Lcom/whoop/healthspan/domain/b;)V
    .locals 0

    iput-object p2, p0, Lcom/whoop/healthspan/domain/b$i;->z:Lcom/whoop/healthspan/domain/b;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lcom/whoop/healthspan/domain/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/whoop/healthspan/domain/b$i;

    iget-object v1, p0, Lcom/whoop/healthspan/domain/b$i;->z:Lcom/whoop/healthspan/domain/b;

    invoke-direct {v0, p3, v1}, Lcom/whoop/healthspan/domain/b$i;-><init>(Lq83/d;Lcom/whoop/healthspan/domain/b;)V

    iput-object p1, v0, Lcom/whoop/healthspan/domain/b$i;->x:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/healthspan/domain/b$i;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcom/whoop/healthspan/domain/b$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/healthspan/domain/b$i;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/healthspan/domain/b$i;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/whoop/healthspan/domain/b$i;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/healthspan/domain/b$i;->x:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lcom/whoop/healthspan/domain/b$i;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/healthspan/domain/a;

    instance-of v3, v1, Lcom/whoop/healthspan/domain/a$d;

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    new-instance v3, Lcom/whoop/healthspan/domain/b$j;

    iget-object v5, p0, Lcom/whoop/healthspan/domain/b$i;->z:Lcom/whoop/healthspan/domain/b;

    invoke-direct {v3, v5, v1, v4}, Lcom/whoop/healthspan/domain/b$j;-><init>(Lcom/whoop/healthspan/domain/b;Lcom/whoop/healthspan/domain/a;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v3}, Lec3/s1;-><init>(Lc93/m;)V

    goto/16 :goto_1

    :cond_2
    instance-of v3, v1, Lcom/whoop/healthspan/domain/a$f;

    if-eqz v3, :cond_3

    new-instance v3, Lcom/whoop/healthspan/domain/b$k;

    iget-object v5, p0, Lcom/whoop/healthspan/domain/b$i;->z:Lcom/whoop/healthspan/domain/b;

    invoke-direct {v3, v5, v1, v4}, Lcom/whoop/healthspan/domain/b$k;-><init>(Lcom/whoop/healthspan/domain/b;Lcom/whoop/healthspan/domain/a;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v3}, Lec3/s1;-><init>(Lc93/m;)V

    goto :goto_1

    :cond_3
    instance-of v3, v1, Lcom/whoop/healthspan/domain/a$a;

    if-eqz v3, :cond_4

    new-instance v3, Lcom/whoop/healthspan/domain/b$l;

    iget-object v5, p0, Lcom/whoop/healthspan/domain/b$i;->z:Lcom/whoop/healthspan/domain/b;

    invoke-direct {v3, v5, v1, v4}, Lcom/whoop/healthspan/domain/b$l;-><init>(Lcom/whoop/healthspan/domain/b;Lcom/whoop/healthspan/domain/a;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v3}, Lec3/s1;-><init>(Lc93/m;)V

    goto :goto_1

    :cond_4
    sget-object v3, Lcom/whoop/healthspan/domain/a$b;->a:Lcom/whoop/healthspan/domain/a$b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    new-instance v1, Lcom/whoop/healthspan/domain/b$m;

    iget-object v3, p0, Lcom/whoop/healthspan/domain/b$i;->z:Lcom/whoop/healthspan/domain/b;

    invoke-direct {v1, v3, v4}, Lcom/whoop/healthspan/domain/b$m;-><init>(Lcom/whoop/healthspan/domain/b;Lq83/d;)V

    new-instance v3, Lec3/s1;

    invoke-direct {v3, v1}, Lec3/s1;-><init>(Lc93/m;)V

    :goto_0
    move-object v1, v3

    goto :goto_1

    :cond_5
    sget-object v3, Lcom/whoop/healthspan/domain/a$c;->a:Lcom/whoop/healthspan/domain/a$c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    new-instance v1, Lcom/whoop/healthspan/domain/b$n;

    iget-object v3, p0, Lcom/whoop/healthspan/domain/b$i;->z:Lcom/whoop/healthspan/domain/b;

    invoke-direct {v1, v3, v4}, Lcom/whoop/healthspan/domain/b$n;-><init>(Lcom/whoop/healthspan/domain/b;Lq83/d;)V

    new-instance v3, Lec3/s1;

    invoke-direct {v3, v1}, Lec3/s1;-><init>(Lc93/m;)V

    goto :goto_0

    :cond_6
    sget-object v3, Lcom/whoop/healthspan/domain/a$e;->a:Lcom/whoop/healthspan/domain/a$e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    new-instance v1, Lcom/whoop/healthspan/domain/b$o;

    invoke-direct {v1, v4}, Lcom/whoop/healthspan/domain/b$o;-><init>(Lq83/d;)V

    new-instance v3, Lec3/s1;

    invoke-direct {v3, v1}, Lec3/s1;-><init>(Lc93/m;)V

    goto :goto_0

    :cond_7
    instance-of v3, v1, Lcom/whoop/healthspan/domain/a$g;

    if-eqz v3, :cond_9

    new-instance v3, Lcom/whoop/healthspan/domain/b$p;

    iget-object v5, p0, Lcom/whoop/healthspan/domain/b$i;->z:Lcom/whoop/healthspan/domain/b;

    invoke-direct {v3, v5, v1, v4}, Lcom/whoop/healthspan/domain/b$p;-><init>(Lcom/whoop/healthspan/domain/b;Lcom/whoop/healthspan/domain/a;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v3}, Lec3/s1;-><init>(Lc93/m;)V

    :goto_1
    iput-object v4, p0, Lcom/whoop/healthspan/domain/b$i;->x:Ljava/lang/Object;

    iput-object v4, p0, Lcom/whoop/healthspan/domain/b$i;->y:Ljava/lang/Object;

    iput v2, p0, Lcom/whoop/healthspan/domain/b$i;->w:I

    invoke-static {p1, v1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    return-object v0

    :cond_8
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
