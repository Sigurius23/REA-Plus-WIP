.class final Lio0/n$h$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio0/n$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lcom/whoop/navigation/e;",
        "<anonymous>",
        "()Lcom/whoop/navigation/e;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.clinicianintheloop.domain.ClinicianVideoSchedulingFormInteractor$saveSchedulingForm$1$response$1"
    f = "ClinicianVideoSchedulingFormInteractor.kt"
    l = {
        0xa2,
        0xa7
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Ljava/lang/String;

.field final synthetic y:Lio0/n;

.field final synthetic z:Lcom/whoop/clinicianintheloop/api/SaveVideoSchedulingFormRequest;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lio0/n;Lcom/whoop/clinicianintheloop/api/SaveVideoSchedulingFormRequest;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio0/n;",
            "Lcom/whoop/clinicianintheloop/api/SaveVideoSchedulingFormRequest;",
            "Lq83/d<",
            "-",
            "Lio0/n$h$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio0/n$h$a;->x:Ljava/lang/String;

    iput-object p2, p0, Lio0/n$h$a;->y:Lio0/n;

    iput-object p3, p0, Lio0/n$h$a;->z:Lcom/whoop/clinicianintheloop/api/SaveVideoSchedulingFormRequest;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio0/n$h$a;

    iget-object v1, p0, Lio0/n$h$a;->x:Ljava/lang/String;

    iget-object v2, p0, Lio0/n$h$a;->y:Lio0/n;

    iget-object v3, p0, Lio0/n$h$a;->z:Lcom/whoop/clinicianintheloop/api/SaveVideoSchedulingFormRequest;

    invoke-direct {v0, v1, v2, v3, p1}, Lio0/n$h$a;-><init>(Ljava/lang/String;Lio0/n;Lcom/whoop/clinicianintheloop/api/SaveVideoSchedulingFormRequest;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lio0/n$h$a;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/navigation/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lio0/n$h$a;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio0/n$h$a;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lio0/n$h$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio0/n$h$a;->w:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

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

    iget-object p1, p0, Lio0/n$h$a;->x:Ljava/lang/String;

    if-eqz p1, :cond_4

    iget-object p1, p0, Lio0/n$h$a;->y:Lio0/n;

    invoke-static {p1}, Lio0/n;->c(Lio0/n;)Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormApi;

    move-result-object p1

    iget-object v1, p0, Lio0/n$h$a;->x:Ljava/lang/String;

    iget-object v2, p0, Lio0/n$h$a;->z:Lcom/whoop/clinicianintheloop/api/SaveVideoSchedulingFormRequest;

    iput v3, p0, Lio0/n$h$a;->w:I

    invoke-interface {p1, v1, v2, p0}, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormApi;->rescheduleSchedulingForm(Ljava/lang/String;Lcom/whoop/clinicianintheloop/api/SaveVideoSchedulingFormRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Lcom/whoop/navigation/e;

    return-object p1

    :cond_4
    iget-object p1, p0, Lio0/n$h$a;->y:Lio0/n;

    invoke-static {p1}, Lio0/n;->c(Lio0/n;)Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormApi;

    move-result-object p1

    iget-object v1, p0, Lio0/n$h$a;->z:Lcom/whoop/clinicianintheloop/api/SaveVideoSchedulingFormRequest;

    iput v2, p0, Lio0/n$h$a;->w:I

    const-string v2, "SCHEDULED_AHEAD"

    invoke-interface {p1, v2, v1, p0}, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormApi;->saveSchedulingForm(Ljava/lang/String;Lcom/whoop/clinicianintheloop/api/SaveVideoSchedulingFormRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    :goto_2
    check-cast p1, Lcom/whoop/navigation/e;

    return-object p1
.end method
