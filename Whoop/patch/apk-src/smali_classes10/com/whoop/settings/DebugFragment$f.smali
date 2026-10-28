.class final Lcom/whoop/settings/DebugFragment$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/settings/DebugFragment;->S3(Lyh2/c;Ljk0/d;Lyh2/a;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Ldc3/u;",
        "",
        "Ll83/a0;",
        "<anonymous>",
        "(Ldc3/u;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.settings.DebugFragment$liveWatermarkFlow$1"
    f = "DebugFragment.kt"
    l = {
        0x1b4,
        0x1b7,
        0x1b8
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:J

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lec3/f2;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/f2;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/settings/DebugFragment$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/settings/DebugFragment$f;->z:Lec3/f2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/settings/DebugFragment$f;

    iget-object v1, p0, Lcom/whoop/settings/DebugFragment$f;->z:Lec3/f2;

    invoke-direct {v0, v1, p2}, Lcom/whoop/settings/DebugFragment$f;-><init>(Lec3/f2;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/settings/DebugFragment$f;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ldc3/u;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldc3/u;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/settings/DebugFragment$f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/settings/DebugFragment$f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/settings/DebugFragment$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Ldc3/u;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/settings/DebugFragment$f;->invoke(Ldc3/u;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lcom/whoop/settings/DebugFragment$f;->y:Ljava/lang/Object;

    check-cast v0, Ldc3/u;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcom/whoop/settings/DebugFragment$f;->x:I

    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v6, :cond_2

    if-eq v2, v5, :cond_1

    if-eq v2, v4, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    iget-wide v5, p0, Lcom/whoop/settings/DebugFragment$f;->w:J

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lcom/whoop/settings/DebugFragment$f$b;

    iget-object v2, p0, Lcom/whoop/settings/DebugFragment$f;->z:Lec3/f2;

    invoke-direct {p1, v2, v3}, Lcom/whoop/settings/DebugFragment$f$b;-><init>(Lec3/f2;Lq83/d;)V

    iput-object v0, p0, Lcom/whoop/settings/DebugFragment$f;->y:Ljava/lang/Object;

    iput v6, p0, Lcom/whoop/settings/DebugFragment$f;->x:I

    const-wide/16 v6, 0x3e8

    invoke-static {v6, v7, p1, p0}, Lbc3/k2;->d(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_3

    :cond_4
    :goto_0
    check-cast p1, Ljava/lang/Long;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    goto :goto_1

    :cond_5
    iget-object p1, p0, Lcom/whoop/settings/DebugFragment$f;->z:Lec3/f2;

    invoke-interface {p1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v6

    :goto_1
    new-instance p1, Ljava/lang/Long;

    invoke-direct {p1, v6, v7}, Ljava/lang/Long;-><init>(J)V

    iput-object v0, p0, Lcom/whoop/settings/DebugFragment$f;->y:Ljava/lang/Object;

    iput-wide v6, p0, Lcom/whoop/settings/DebugFragment$f;->w:J

    iput v5, p0, Lcom/whoop/settings/DebugFragment$f;->x:I

    move-object v2, v0

    check-cast v2, Ldc3/t;

    iget-object v2, v2, Ldc3/t;->z:Ldc3/h;

    invoke-interface {v2, p1, p0}, Ldc3/x;->t(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_3

    :cond_6
    move-wide v5, v6

    :goto_2
    iget-object p1, p0, Lcom/whoop/settings/DebugFragment$f;->z:Lec3/f2;

    new-instance v2, Lcom/whoop/settings/DebugFragment$f$a;

    invoke-direct {v2, v0}, Lcom/whoop/settings/DebugFragment$f$a;-><init>(Ldc3/u;)V

    iput-object v3, p0, Lcom/whoop/settings/DebugFragment$f;->y:Ljava/lang/Object;

    iput-wide v5, p0, Lcom/whoop/settings/DebugFragment$f;->w:J

    iput v4, p0, Lcom/whoop/settings/DebugFragment$f;->x:I

    invoke-interface {p1, v2, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    :goto_4
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method
