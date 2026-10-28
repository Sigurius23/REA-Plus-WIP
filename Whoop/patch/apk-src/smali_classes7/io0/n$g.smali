.class final Lio0/n$g;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio0/n;->interact(Lec3/l;)Lec3/l;
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
        "Lio0/m;",
        "previousState",
        "Lio0/n$b;",
        "internal",
        "<anonymous>",
        "(Lio0/m;Lio0/n$b;)Lio0/m;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.clinicianintheloop.domain.ClinicianVideoSchedulingFormInteractor$interact$2"
    f = "ClinicianVideoSchedulingFormInteractor.kt"
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
            "Lio0/n$g;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lio0/m;Lio0/n$b;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio0/m;",
            "Lio0/n$b;",
            "Lq83/d<",
            "-",
            "Lio0/m;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lio0/n$g;

    invoke-direct {v0, p3}, Lio0/n$g;-><init>(Lq83/d;)V

    iput-object p1, v0, Lio0/n$g;->x:Ljava/lang/Object;

    iput-object p2, v0, Lio0/n$g;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lio0/n$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio0/m;

    check-cast p2, Lio0/n$b;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lio0/n$g;->f(Lio0/m;Lio0/n$b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lio0/n$g;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lio0/m;

    iget-object v0, p0, Lio0/n$g;->y:Ljava/lang/Object;

    check-cast v0, Lio0/n$b;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lio0/n$g;->w:I

    if-nez v2, :cond_d

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lio0/n$b$b;->a:Lio0/n$b$b;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object v2, Lio0/i;->a:Lio0/i;

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lio0/m;->b(Lio0/m;Lio0/h;Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lio0/m;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of p1, v0, Lio0/n$b$h;

    const/4 v2, 0x0

    if-eqz p1, :cond_4

    check-cast v0, Lio0/n$b$h;

    invoke-virtual {v0}, Lio0/n$b$h;->a()Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->getFormContent()Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent;->getSchedulingDatePicker()Lcom/whoop/clinicianintheloop/api/VideoSchedulingDatePicker;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/clinicianintheloop/api/VideoSchedulingDatePicker;->getSchedulingDatePickerItems()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;

    invoke-virtual {v5}, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->getStyle()Lh11/g;

    move-result-object v5

    sget-object v6, Lh11/g;->HAS_APPOINTMENT:Lh11/g;

    if-ne v5, v6, :cond_1

    move-object v2, v4

    :cond_2
    check-cast v2, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->getSelectionDisplay()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    :goto_0
    move-object v4, v0

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lcom/whoop/clinicianintheloop/api/VideoSchedulingDatePicker;->getDateDisplay()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :goto_1
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v1 .. v6}, Lio0/m;->a(Lio0/h;Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)Lio0/m;

    move-result-object p1

    return-object p1

    :cond_4
    sget-object p1, Lio0/n$b$a;->a:Lio0/n$b$a;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    sget-object v2, Lio0/j;->a:Lio0/j;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v1 .. v6}, Lio0/m;->a(Lio0/h;Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)Lio0/m;

    move-result-object p1

    return-object p1

    :cond_5
    instance-of p1, v0, Lio0/n$b$c;

    if-eqz p1, :cond_6

    invoke-virtual {v1}, Lio0/m;->d()Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;

    move-result-object p1

    if-eqz p1, :cond_8

    check-cast v0, Lio0/n$b$c;

    invoke-virtual {v0}, Lio0/n$b$c;->a()Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lio0/m;->b(Lio0/m;Lio0/h;Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lio0/m;

    move-result-object p1

    return-object p1

    :cond_6
    instance-of p1, v0, Lio0/n$b$g;

    if-eqz p1, :cond_9

    invoke-virtual {v1}, Lio0/m;->d()Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {v1}, Lio0/m;->g()Ljava/lang/String;

    move-result-object p1

    check-cast v0, Lio0/n$b$g;

    invoke-virtual {v0}, Lio0/n$b$g;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    :goto_2
    move-object v5, v2

    goto :goto_3

    :cond_7
    invoke-virtual {v0}, Lio0/n$b$g;->a()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :goto_3
    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lio0/m;->b(Lio0/m;Lio0/h;Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lio0/m;

    move-result-object p1

    return-object p1

    :cond_8
    return-object v1

    :cond_9
    sget-object p1, Lio0/n$b$f;->a:Lio0/n$b$f;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    sget-object v2, Lio0/k;->a:Lio0/k;

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lio0/m;->b(Lio0/m;Lio0/h;Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lio0/m;

    move-result-object p1

    return-object p1

    :cond_a
    instance-of p1, v0, Lio0/n$b$e;

    if-eqz p1, :cond_b

    check-cast v0, Lio0/n$b$e;

    invoke-virtual {v0}, Lio0/n$b$e;->a()Lcom/whoop/navigation/e;

    move-result-object v6

    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v8}, Lio0/m;->b(Lio0/m;Lio0/h;Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lio0/m;

    move-result-object p1

    return-object p1

    :cond_b
    sget-object p1, Lio0/n$b$d;->a:Lio0/n$b$d;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    sget-object v2, Lio0/j;->a:Lio0/j;

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lio0/m;->b(Lio0/m;Lio0/h;Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lio0/m;

    move-result-object p1

    return-object p1

    :cond_c
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
