.class final Lht1/c$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lht1/c;->c(Lec3/l;)Lec3/l;
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
        "Lht1/b;",
        "domainState",
        "Lht1/a;",
        "domainAction",
        "<anonymous>",
        "(Lht1/b;Lht1/a;)Lht1/b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.labrador.feature.deviceloaction.domain.LabradorDeviceLocationInteractor$interact$1"
    f = "LabradorDeviceLocationInteractor.kt"
    l = {
        0x14,
        0x19
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lht1/c;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lht1/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lht1/c;",
            "Lq83/d<",
            "-",
            "Lht1/c$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lht1/c$b;->F:Lht1/c;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lht1/b;Lht1/a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lht1/b;",
            "Lht1/a;",
            "Lq83/d<",
            "-",
            "Lht1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lht1/c$b;

    iget-object v1, p0, Lht1/c$b;->F:Lht1/c;

    invoke-direct {v0, v1, p3}, Lht1/c$b;-><init>(Lht1/c;Lq83/d;)V

    iput-object p1, v0, Lht1/c$b;->z:Ljava/lang/Object;

    iput-object p2, v0, Lht1/c$b;->E:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lht1/c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lht1/b;

    check-cast p2, Lht1/a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lht1/c$b;->f(Lht1/b;Lht1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lht1/c$b;->z:Ljava/lang/Object;

    check-cast v0, Lht1/b;

    iget-object v1, p0, Lht1/c$b;->E:Ljava/lang/Object;

    check-cast v1, Lht1/a;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lht1/c$b;->y:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v3, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v0, p0, Lht1/c$b;->x:Ljava/lang/Object;

    check-cast v0, Lht1/e;

    iget-object v1, p0, Lht1/c$b;->w:Ljava/lang/Object;

    check-cast v1, Lht1/b;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v2, v0

    move-object v0, v1

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lht1/c$b;->x:Ljava/lang/Object;

    check-cast v0, Lht1/d;

    iget-object v1, p0, Lht1/c$b;->w:Ljava/lang/Object;

    check-cast v1, Lht1/b;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v7, v1

    move-object v1, v0

    move-object v0, v7

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lht1/a$a;->a:Lht1/a$a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Lht1/d$a;->a:Lht1/d$a;

    iget-object v1, p0, Lht1/c$b;->F:Lht1/c;

    iput-object v6, p0, Lht1/c$b;->z:Ljava/lang/Object;

    iput-object v6, p0, Lht1/c$b;->E:Ljava/lang/Object;

    iput-object v0, p0, Lht1/c$b;->w:Ljava/lang/Object;

    iput-object p1, p0, Lht1/c$b;->x:Ljava/lang/Object;

    iput v5, p0, Lht1/c$b;->y:I

    invoke-static {v1, p0}, Lht1/c;->a(Lht1/c;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_3

    goto :goto_1

    :cond_3
    move-object v7, v1

    move-object v1, p1

    move-object p1, v7

    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {v0, v1, v6, p1}, Lht1/b;->a(Lht1/d;Lht1/e;Z)Lht1/b;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of p1, v1, Lht1/a$b;

    if-eqz p1, :cond_6

    check-cast v1, Lht1/a$b;

    invoke-virtual {v1}, Lht1/a$b;->a()Lht1/e;

    move-result-object p1

    iget-object v1, p0, Lht1/c$b;->F:Lht1/c;

    iput-object v6, p0, Lht1/c$b;->z:Ljava/lang/Object;

    iput-object v6, p0, Lht1/c$b;->E:Ljava/lang/Object;

    iput-object v0, p0, Lht1/c$b;->w:Ljava/lang/Object;

    iput-object p1, p0, Lht1/c$b;->x:Ljava/lang/Object;

    iput v4, p0, Lht1/c$b;->y:I

    invoke-static {v1, p0}, Lht1/c;->a(Lht1/c;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_5

    :goto_1
    return-object v2

    :cond_5
    move-object v2, p1

    move-object p1, v1

    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, Lht1/b;->b(Lht1/b;Lht1/d;Lht1/e;ZILjava/lang/Object;)Lht1/b;

    move-result-object p1

    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
