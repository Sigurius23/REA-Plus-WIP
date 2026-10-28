.class final Lkt1/f$b$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkt1/f$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.labrador.feature.eligibility.domain.LabradorSubmitEligibilityInteractor$interact$1$1$1"
    f = "LabradorSubmitEligibilityInteractor.kt"
    l = {
        0x1d,
        0x1f,
        0x23,
        0x24
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field final synthetic z:Lkt1/f;


# direct methods
.method public constructor <init>(Lkt1/f;Lec3/m;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkt1/f;",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Lkt1/f$b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkt1/f$b$a;->z:Lkt1/f;

    iput-object p2, p0, Lkt1/f$b$a;->E:Lec3/m;

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

    new-instance p1, Lkt1/f$b$a;

    iget-object v0, p0, Lkt1/f$b$a;->z:Lkt1/f;

    iget-object v1, p0, Lkt1/f$b$a;->E:Lec3/m;

    invoke-direct {p1, v0, v1, p2}, Lkt1/f$b$a;-><init>(Lkt1/f;Lec3/m;Lq83/d;)V

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
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lkt1/f$b$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkt1/f$b$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkt1/f$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkt1/f$b$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkt1/f$b$a;->y:I

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v1, :cond_4

    if-eq v1, v5, :cond_2

    if-eq v1, v4, :cond_3

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lkt1/f$b$a;->x:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    :cond_2
    iget-object v0, p0, Lkt1/f$b$a;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityRequest;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lkt1/f$b$a;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityRequest;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v12, p0

    goto :goto_2

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lkt1/f$b$a;->z:Lkt1/f;

    invoke-static {p1}, Lkt1/f;->c(Lkt1/f;)Lkt1/d;

    move-result-object p1

    invoke-virtual {p1}, Lkt1/d;->a()Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityRequest;

    move-result-object p1

    if-nez p1, :cond_6

    iget-object p1, p0, Lkt1/f$b$a;->E:Lec3/m;

    new-instance v1, Lnt1/h$a;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lnt1/h$a;-><init>(Z)V

    iput-object v6, p0, Lkt1/f$b$a;->w:Ljava/lang/Object;

    iput v5, p0, Lkt1/f$b$a;->y:I

    invoke-interface {p1, v1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    move-object v12, p0

    goto :goto_3

    :cond_5
    :goto_1
    move-object v12, p0

    goto :goto_4

    :cond_6
    sget-object v7, Lu02/a;->a:Lu02/a$a;

    iget-object v1, p0, Lkt1/f$b$a;->z:Lkt1/f;

    invoke-static {v1}, Lkt1/f;->b(Lkt1/f;)Ltr2/n;

    move-result-object v8

    new-instance v11, Lkt1/f$b$a$a;

    iget-object v1, p0, Lkt1/f$b$a;->z:Lkt1/f;

    invoke-direct {v11, v1, p1, v6}, Lkt1/f$b$a$a;-><init>(Lkt1/f;Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityRequest;Lq83/d;)V

    iput-object v6, p0, Lkt1/f$b$a;->w:Ljava/lang/Object;

    iput v4, p0, Lkt1/f$b$a;->y:I

    const/4 v9, 0x0

    const-string v10, "Failed to submit ECG eligibility"

    move-object v12, p0

    invoke-virtual/range {v7 .. v12}, Lu02/a$a;->a(Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_3

    :cond_7
    :goto_2
    check-cast p1, Lu02/a;

    instance-of p1, p1, Lu02/a$c;

    if-eqz p1, :cond_8

    iget-object p1, v12, Lkt1/f$b$a;->E:Lec3/m;

    sget-object v1, Lnt1/h$c;->a:Lnt1/h$c;

    iput-object v6, v12, Lkt1/f$b$a;->w:Ljava/lang/Object;

    iput-object v6, v12, Lkt1/f$b$a;->x:Ljava/lang/Object;

    iput v3, v12, Lkt1/f$b$a;->y:I

    invoke-interface {p1, v1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    goto :goto_3

    :cond_8
    iget-object p1, v12, Lkt1/f$b$a;->E:Lec3/m;

    new-instance v1, Lnt1/h$a;

    invoke-direct {v1, v5}, Lnt1/h$a;-><init>(Z)V

    iput-object v6, v12, Lkt1/f$b$a;->w:Ljava/lang/Object;

    iput-object v6, v12, Lkt1/f$b$a;->x:Ljava/lang/Object;

    iput v2, v12, Lkt1/f$b$a;->y:I

    invoke-interface {p1, v1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    :goto_3
    return-object v0

    :cond_9
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
