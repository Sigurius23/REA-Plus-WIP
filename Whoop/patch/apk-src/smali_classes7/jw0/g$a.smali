.class final Ljw0/g$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljw0/g;->g(Lec3/l;)Lec3/l;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Ljw0/f;",
        "currentDomain",
        "Ljw0/e;",
        "action",
        "<anonymous>",
        "(Ljw0/f;Ljw0/e;)Ljw0/f;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.core.details.sleep.domain.SleepDetailsInteractor$interact$1"
    f = "SleepDetailsInteractor.kt"
    l = {
        0x25,
        0x26
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Ljw0/g;


# direct methods
.method public constructor <init>(Ljw0/g;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljw0/g;",
            "Lq83/d<",
            "-",
            "Ljw0/g$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ljw0/g$a;->z:Ljw0/g;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Ljw0/f;Ljw0/e;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljw0/f;",
            "Ljw0/e;",
            "Lq83/d<",
            "-",
            "Ljw0/f;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Ljw0/g$a;

    iget-object v1, p0, Ljw0/g$a;->z:Ljw0/g;

    invoke-direct {v0, v1, p3}, Ljw0/g$a;-><init>(Ljw0/g;Lq83/d;)V

    iput-object p1, v0, Ljw0/g$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Ljw0/g$a;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Ljw0/g$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljw0/f;

    check-cast p2, Ljw0/e;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Ljw0/g$a;->f(Ljw0/f;Ljw0/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Ljw0/g$a;->x:Ljava/lang/Object;

    check-cast v0, Ljw0/f;

    iget-object v1, p0, Ljw0/g$a;->y:Ljava/lang/Object;

    check-cast v1, Ljw0/e;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Ljw0/g$a;->w:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v3, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Ljw0/e$g;

    if-eqz p1, :cond_7

    iget-object p1, p0, Ljw0/g$a;->z:Ljw0/g;

    move-object v0, v1

    check-cast v0, Ljw0/e$g;

    invoke-virtual {v0}, Ljw0/e$g;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v6, p0, Ljw0/g$a;->x:Ljava/lang/Object;

    iput-object v1, p0, Ljw0/g$a;->y:Ljava/lang/Object;

    iput v5, p0, Ljw0/g$a;->w:I

    invoke-static {p1, v0, p0}, Ljw0/g;->f(Ljw0/g;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iget-object p1, p0, Ljw0/g$a;->z:Ljw0/g;

    invoke-static {p1}, Ljw0/g;->a(Ljw0/g;)Llw0/a;

    move-result-object p1

    move-object v0, v1

    check-cast v0, Ljw0/e$g;

    invoke-virtual {v0}, Ljw0/e$g;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v6, p0, Ljw0/g$a;->x:Ljava/lang/Object;

    iput-object v1, p0, Ljw0/g$a;->y:Ljava/lang/Object;

    iput v4, p0, Ljw0/g$a;->w:I

    invoke-virtual {p1, v0, p0}, Llw0/a;->j(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_4

    :goto_1
    return-object v2

    :cond_4
    :goto_2
    check-cast p1, Lcom/whoop/data/remote/commons/Resource;

    invoke-virtual {p1}, Lcom/whoop/data/remote/commons/Resource;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;

    if-eqz p1, :cond_6

    invoke-static {p1}, Ljw0/h;->a(Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;)Ljw0/f;

    move-result-object p1

    if-nez p1, :cond_5

    goto :goto_3

    :cond_5
    return-object p1

    :cond_6
    :goto_3
    new-instance p1, Ljw0/f$a;

    check-cast v1, Ljw0/e$g;

    invoke-virtual {v1}, Ljw0/e$g;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljw0/f$a;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_7
    sget-object p1, Ljw0/e$d;->a:Ljw0/e$d;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    sget-object p1, Ljw0/f$c;->a:Ljw0/f$c;

    return-object p1

    :cond_8
    instance-of p1, v1, Ljw0/e$c;

    if-eqz p1, :cond_9

    iget-object p1, p0, Ljw0/g$a;->z:Ljw0/g;

    check-cast v1, Ljw0/e$c;

    invoke-static {p1, v1, v0}, Ljw0/g;->b(Ljw0/g;Ljw0/e$c;Ljw0/f;)Ljw0/f;

    move-result-object p1

    return-object p1

    :cond_9
    sget-object p1, Ljw0/e$b;->a:Ljw0/e$b;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    iget-object p1, p0, Ljw0/g$a;->z:Ljw0/g;

    invoke-static {p1, v6, v0}, Ljw0/g;->b(Ljw0/g;Ljw0/e$c;Ljw0/f;)Ljw0/f;

    move-result-object p1

    return-object p1

    :cond_a
    instance-of p1, v1, Ljw0/e$e;

    if-eqz p1, :cond_b

    iget-object p1, p0, Ljw0/g$a;->z:Ljw0/g;

    check-cast v1, Ljw0/e$e;

    invoke-virtual {v1}, Ljw0/e$e;->a()Lmc1/b;

    move-result-object v1

    invoke-static {p1, v1, v0}, Ljw0/g;->d(Ljw0/g;Lmc1/b;Ljw0/f;)Ljw0/f;

    move-result-object p1

    return-object p1

    :cond_b
    instance-of p1, v1, Ljw0/e$f;

    if-eqz p1, :cond_c

    iget-object p1, p0, Ljw0/g$a;->z:Ljw0/g;

    check-cast v1, Ljw0/e$f;

    invoke-virtual {v1}, Ljw0/e$f;->a()Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    move-result-object v1

    invoke-static {p1, v1, v0}, Ljw0/g;->e(Ljw0/g;Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;Ljw0/f;)Ljw0/f;

    move-result-object p1

    return-object p1

    :cond_c
    instance-of p1, v1, Ljw0/e$a;

    if-eqz p1, :cond_d

    iget-object p1, p0, Ljw0/g$a;->z:Ljw0/g;

    check-cast v1, Ljw0/e$a;

    invoke-virtual {v1}, Ljw0/e$a;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v1}, Ljw0/e$a;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v1}, Ljw0/e$a;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-static {p1, v2, v3, v1, v0}, Ljw0/g;->c(Ljw0/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljw0/f;)Ljw0/f;

    move-result-object p1

    return-object p1

    :cond_d
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
