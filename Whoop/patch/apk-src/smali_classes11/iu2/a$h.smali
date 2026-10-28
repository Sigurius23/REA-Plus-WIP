.class final Liu2/a$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Liu2/a;->j()Lec3/l;
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
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lnt0/i;",
        "oldVal",
        "newVal",
        "<anonymous>",
        "(Lnt0/i;Lnt0/i;)Lnt0/i;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.weightlifting.data.StrengthTrainerPacketManager$getHrStreamFromR10$1"
    f = "StrengthTrainerPacketManager.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Liu2/a;


# direct methods
.method public constructor <init>(Liu2/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liu2/a;",
            "Lq83/d<",
            "-",
            "Liu2/a$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Liu2/a$h;->z:Liu2/a;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lnt0/i;Lnt0/i;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt0/i;",
            "Lnt0/i;",
            "Lq83/d<",
            "-",
            "Lnt0/i;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Liu2/a$h;

    iget-object v1, p0, Liu2/a$h;->z:Liu2/a;

    invoke-direct {v0, v1, p3}, Liu2/a$h;-><init>(Liu2/a;Lq83/d;)V

    iput-object p1, v0, Liu2/a$h;->x:Ljava/lang/Object;

    iput-object p2, v0, Liu2/a$h;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Liu2/a$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnt0/i;

    check-cast p2, Lnt0/i;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Liu2/a$h;->f(Lnt0/i;Lnt0/i;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Liu2/a$h;->x:Ljava/lang/Object;

    check-cast v0, Lnt0/i;

    iget-object v1, p0, Liu2/a$h;->y:Ljava/lang/Object;

    check-cast v1, Lnt0/i;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Liu2/a$h;->w:I

    if-nez v2, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    if-eqz v0, :cond_0

    iget-object p1, p0, Liu2/a$h;->z:Liu2/a;

    invoke-virtual {v1}, Lnt0/i;->b()J

    move-result-wide v2

    invoke-virtual {v0}, Lnt0/i;->b()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-gez v2, :cond_0

    invoke-static {p1}, Liu2/a;->c(Liu2/a;)Ltr2/n;

    move-result-object p1

    invoke-virtual {v1}, Lnt0/i;->b()J

    move-result-wide v2

    invoke-virtual {v1}, Lnt0/i;->a()B

    move-result v4

    and-int/lit16 v4, v4, 0xff

    invoke-virtual {v1}, Lnt0/i;->c()Llt0/c$a;

    move-result-object v5

    invoke-virtual {v0}, Lnt0/i;->b()J

    move-result-wide v6

    invoke-virtual {v0}, Lnt0/i;->a()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {v1}, Lnt0/i;->c()Llt0/c$a;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "R10 packets received in StrengthTrainerPacketManager out of order. Latest packet: ( timestamp seconds "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", hr "

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", type: "

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " ), previous packet: ( timestamp seconds "

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " )"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {p1, v0, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_0
    return-object v1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
