.class final Liu2/a$n;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Liu2/a;->s(ZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "",
        "<anonymous>",
        "(Lbc3/c0;)Z"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.weightlifting.data.StrengthTrainerPacketManager$sendStrapCommandWithRetry$2"
    f = "StrengthTrainerPacketManager.kt"
    l = {
        0xcc,
        0xcf,
        0xd0
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Liu2/a;

.field final synthetic F:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field w:I

.field x:I

.field y:I

.field final synthetic z:Z


# direct methods
.method public constructor <init>(ZLiu2/a;Lkotlin/jvm/functions/Function1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Liu2/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Lq83/d<",
            "-",
            "Liu2/a$n;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Liu2/a$n;->z:Z

    iput-object p2, p0, Liu2/a$n;->E:Liu2/a;

    iput-object p3, p0, Liu2/a$n;->F:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance p1, Liu2/a$n;

    iget-boolean v0, p0, Liu2/a$n;->z:Z

    iget-object v1, p0, Liu2/a$n;->E:Liu2/a;

    iget-object v2, p0, Liu2/a$n;->F:Lkotlin/jvm/functions/Function1;

    invoke-direct {p1, v0, v1, v2, p2}, Liu2/a$n;-><init>(ZLiu2/a;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Liu2/a$n;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Liu2/a$n;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Liu2/a$n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Liu2/a$n;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Liu2/a$n;->y:I

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v5, :cond_2

    if-eq v1, v2, :cond_1

    if-ne v1, v4, :cond_0

    iget v1, p0, Liu2/a$n;->w:I

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget v1, p0, Liu2/a$n;->x:I

    iget v5, p0, Liu2/a$n;->w:I

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move p1, v1

    move v1, v5

    goto :goto_2

    :cond_2
    iget v1, p0, Liu2/a$n;->w:I

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Liu2/a$n;->z:Z

    if-nez p1, :cond_4

    iget-object p1, p0, Liu2/a$n;->E:Liu2/a;

    invoke-static {p1}, Liu2/a;->e(Liu2/a;)Ltd1/b;

    move-result-object p1

    invoke-interface {p1}, Ltd1/b;->A()Ltd1/e;

    move-result-object p1

    sget-object v1, Ltd1/e;->READY:Ltd1/e;

    if-eq p1, v1, :cond_4

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_4
    iget-object p1, p0, Liu2/a$n;->F:Lkotlin/jvm/functions/Function1;

    iput v3, p0, Liu2/a$n;->w:I

    iput v5, p0, Liu2/a$n;->y:I

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_3

    :cond_5
    move v1, v3

    :goto_0
    check-cast p1, Lzj0/h;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lzj0/h;->W()Z

    move-result p1

    goto :goto_1

    :cond_6
    move p1, v3

    :goto_1
    if-ge v1, v4, :cond_9

    if-nez p1, :cond_9

    add-int/lit8 v1, v1, 0x1

    const-wide/16 v5, 0x1f4

    int-to-long v7, v1

    mul-long/2addr v7, v5

    iput v1, p0, Liu2/a$n;->w:I

    iput p1, p0, Liu2/a$n;->x:I

    iput v2, p0, Liu2/a$n;->y:I

    invoke-static {v7, v8, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_7

    goto :goto_3

    :cond_7
    :goto_2
    iget-object v5, p0, Liu2/a$n;->F:Lkotlin/jvm/functions/Function1;

    iput v1, p0, Liu2/a$n;->w:I

    iput p1, p0, Liu2/a$n;->x:I

    iput v4, p0, Liu2/a$n;->y:I

    invoke-interface {v5, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    :goto_3
    return-object v0

    :cond_8
    :goto_4
    check-cast p1, Lzj0/h;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lzj0/h;->W()Z

    move-result p1

    goto :goto_1

    :cond_9
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
