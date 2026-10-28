.class final Lio0/g$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio0/g;->interact(Lec3/l;)Lec3/l;
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
        "Lio0/f;",
        "previousState",
        "Lio0/g$a;",
        "internal",
        "<anonymous>",
        "(Lio0/f;Lio0/g$a;)Lio0/f;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.clinicianintheloop.domain.ClinicianSchedulingConfirmationInteractor$interact$2"
    f = "ClinicianSchedulingConfirmationInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lio0/g$e;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lio0/f;Lio0/g$a;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio0/f;",
            "Lio0/g$a;",
            "Lq83/d<",
            "-",
            "Lio0/f;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lio0/g$e;

    invoke-direct {v0, p3}, Lio0/g$e;-><init>(Lq83/d;)V

    iput-object p1, v0, Lio0/g$e;->x:Ljava/lang/Object;

    iput-object p2, v0, Lio0/g$e;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lio0/g$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio0/f;

    check-cast p2, Lio0/g$a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lio0/g$e;->f(Lio0/f;Lio0/g$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lio0/g$e;->x:Ljava/lang/Object;

    check-cast v0, Lio0/f;

    iget-object v1, p0, Lio0/g$e;->y:Ljava/lang/Object;

    check-cast v1, Lio0/g$a;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lio0/g$e;->w:I

    if-nez v2, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lio0/g$a$b;->a:Lio0/g$a$b;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    sget-object p1, Lio0/c;->a:Lio0/c;

    invoke-virtual {v0, p1, v2}, Lio0/f;->a(Lio0/b;Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;)Lio0/f;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of p1, v1, Lio0/g$a$c;

    if-eqz p1, :cond_1

    check-cast v1, Lio0/g$a$c;

    invoke-virtual {v1}, Lio0/g$a$c;->a()Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;

    move-result-object p1

    invoke-virtual {v0, v2, p1}, Lio0/f;->a(Lio0/b;Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;)Lio0/f;

    move-result-object p1

    return-object p1

    :cond_1
    sget-object p1, Lio0/g$a$a;->a:Lio0/g$a$a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lio0/d;->a:Lio0/d;

    invoke-virtual {v0, p1, v2}, Lio0/f;->a(Lio0/b;Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;)Lio0/f;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
