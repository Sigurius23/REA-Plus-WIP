.class final Ldt1/h$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldt1/h;->u(Lqk1/a;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lbc3/c0;",
        "Lu02/a;",
        "Lf63/c;",
        "<anonymous>",
        "(Lbc3/c0;)Lu02/a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.labrador.feature.details.domain.LabradorDetailsInteractor$doUpload$result$1"
    f = "LabradorDetailsInteractor.kt"
    l = {
        0x151
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Ldt1/h;

.field final synthetic y:Lcom/whoop/labrador/feature/reading/domain/models/LabradorReadingSymptomsUpdateRequest;


# direct methods
.method public constructor <init>(Ldt1/h;Lcom/whoop/labrador/feature/reading/domain/models/LabradorReadingSymptomsUpdateRequest;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt1/h;",
            "Lcom/whoop/labrador/feature/reading/domain/models/LabradorReadingSymptomsUpdateRequest;",
            "Lq83/d<",
            "-",
            "Ldt1/h$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldt1/h$e;->x:Ldt1/h;

    iput-object p2, p0, Ldt1/h$e;->y:Lcom/whoop/labrador/feature/reading/domain/models/LabradorReadingSymptomsUpdateRequest;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Ldt1/h$e;

    iget-object v0, p0, Ldt1/h$e;->x:Ldt1/h;

    iget-object v1, p0, Ldt1/h$e;->y:Lcom/whoop/labrador/feature/reading/domain/models/LabradorReadingSymptomsUpdateRequest;

    invoke-direct {p1, v0, v1, p2}, Ldt1/h$e;-><init>(Ldt1/h;Lcom/whoop/labrador/feature/reading/domain/models/LabradorReadingSymptomsUpdateRequest;Lq83/d;)V

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
            "Lu02/a<",
            "+",
            "Lf63/c;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Ldt1/h$e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ldt1/h$e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ldt1/h$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ldt1/h$e;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ldt1/h$e;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    iget-object p1, p0, Ldt1/h$e;->x:Ldt1/h;

    invoke-static {p1}, Ldt1/h;->k(Ldt1/h;)Ltr2/n;

    move-result-object p1

    new-instance v5, Ldt1/h$e$a;

    iget-object v3, p0, Ldt1/h$e;->x:Ldt1/h;

    iget-object v4, p0, Ldt1/h$e;->y:Lcom/whoop/labrador/feature/reading/domain/models/LabradorReadingSymptomsUpdateRequest;

    const/4 v6, 0x0

    invoke-direct {v5, v3, v4, v6}, Ldt1/h$e$a;-><init>(Ldt1/h;Lcom/whoop/labrador/feature/reading/domain/models/LabradorReadingSymptomsUpdateRequest;Lq83/d;)V

    iput v2, p0, Ldt1/h$e;->w:I

    const/4 v3, 0x0

    const-string v4, "Failed to upload ECG reading symptoms"

    const/4 v7, 0x2

    const/4 v8, 0x0

    move-object v6, p0

    move-object v2, p1

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
