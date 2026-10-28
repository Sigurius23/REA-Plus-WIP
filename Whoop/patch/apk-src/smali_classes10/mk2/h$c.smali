.class final Lmk2/h$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmk2/h;->c(IJLc93/m;Lc93/a;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/n;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0008\u001a\u00020\u0007\"\u0004\u0008\u0000\u0010\u0000*\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "T",
        "Lec3/m;",
        "Lpm0/a;",
        "",
        "cause",
        "",
        "attempt",
        "",
        "<anonymous>",
        "(Lec3/m;Ljava/lang/Throwable;J)Z"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.trackactivity.domain.SessionTargetsFetcherKt$retryOnTransientError$4"
    f = "SessionTargetsFetcher.kt"
    l = {
        0x50
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:I

.field final synthetic F:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field final synthetic G:J

.field w:I

.field x:I

.field synthetic y:Ljava/lang/Object;

.field synthetic z:J


# direct methods
.method public constructor <init>(ILc93/m;JLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lc93/m;",
            "J",
            "Lq83/d<",
            "-",
            "Lmk2/h$c;",
            ">;)V"
        }
    .end annotation

    iput p1, p0, Lmk2/h$c;->E:I

    iput-object p2, p0, Lmk2/h$c;->F:Lc93/m;

    iput-wide p3, p0, Lmk2/h$c;->G:J

    const/4 p1, 0x4

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Throwable;JLq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Ljava/lang/Throwable;",
            "J",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lmk2/h$c;

    iget v1, p0, Lmk2/h$c;->E:I

    iget-object v2, p0, Lmk2/h$c;->F:Lc93/m;

    iget-wide v3, p0, Lmk2/h$c;->G:J

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lmk2/h$c;-><init>(ILc93/m;JLq83/d;)V

    iput-object p2, v0, Lmk2/h$c;->y:Ljava/lang/Object;

    iput-wide p3, v0, Lmk2/h$c;->z:J

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lmk2/h$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 2
    move-object v1, p1

    check-cast v1, Lec3/m;

    move-object v2, p2

    check-cast v2, Ljava/lang/Throwable;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    move-object v5, p4

    check-cast v5, Lq83/d;

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lmk2/h$c;->invoke(Lec3/m;Ljava/lang/Throwable;JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lmk2/h$c;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    iget-wide v1, p0, Lmk2/h$c;->z:J

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, p0, Lmk2/h$c;->x:I

    const/4 v5, 0x1

    if-eqz v4, :cond_1

    if-ne v4, v5, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    long-to-int p1, v1

    add-int/2addr p1, v5

    instance-of v4, v0, Lmk2/y;

    if-eqz v4, :cond_2

    iget v4, p0, Lmk2/h$c;->E:I

    if-ge p1, v4, :cond_2

    iget-object v4, p0, Lmk2/h$c;->F:Lc93/m;

    new-instance v6, Ljava/lang/Integer;

    invoke-direct {v6, p1}, Ljava/lang/Integer;-><init>(I)V

    check-cast v0, Lmk2/y;

    invoke-virtual {v0}, Lmk2/y;->a()Lpm0/a$c;

    move-result-object v0

    invoke-virtual {v0}, Lpm0/a$c;->b()I

    move-result v0

    new-instance v7, Ljava/lang/Integer;

    invoke-direct {v7, v0}, Ljava/lang/Integer;-><init>(I)V

    invoke-interface {v4, v6, v7}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    iget-wide v6, p0, Lmk2/h$c;->G:J

    sget-object v0, Lkotlin/time/DurationUnit;->MILLISECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v6, v7, v0}, Lkotlin/time/DurationKt;->toDuration(JLkotlin/time/DurationUnit;)J

    move-result-wide v6

    const/4 v0, 0x0

    iput-object v0, p0, Lmk2/h$c;->y:Ljava/lang/Object;

    iput-wide v1, p0, Lmk2/h$c;->z:J

    iput p1, p0, Lmk2/h$c;->w:I

    iput v5, p0, Lmk2/h$c;->x:I

    invoke-static {v6, v7, p0}, Lbc3/m0;->c(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_3

    return-object v3

    :cond_2
    const/4 v5, 0x0

    :cond_3
    :goto_0
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
