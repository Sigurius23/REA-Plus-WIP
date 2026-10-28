.class public final Lh80/c$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh80/c$e;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lec3/m;

.field final synthetic x:Lh80/c;


# direct methods
.method public constructor <init>(Lec3/m;Lh80/c;)V
    .locals 0

    iput-object p1, p0, Lh80/c$e$a;->w:Lec3/m;

    iput-object p2, p0, Lh80/c$e$a;->x:Lh80/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lh80/c$e$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lh80/c$e$a$a;

    iget v1, v0, Lh80/c$e$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh80/c$e$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh80/c$e$a$a;

    invoke-direct {v0, p0, p2}, Lh80/c$e$a$a;-><init>(Lh80/c$e$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lh80/c$e$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh80/c$e$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lh80/c$e$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lh80/c$e$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lh80/c$e$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lh80/c$e$a;->w:Lec3/m;

    check-cast p1, Lf70/e$b;

    invoke-virtual {p1}, Lf70/e$b;->l()Ln70/e;

    move-result-object v2

    invoke-virtual {v2}, Ln70/e;->g()I

    move-result v2

    const/4 v4, 0x0

    if-nez v2, :cond_4

    :cond_3
    :goto_1
    move-object v2, v4

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Lf70/e$b;->p()Lcom/whoop/activation/iajf/domain/SignUpSource;

    move-result-object v2

    invoke-static {v2}, Lc80/a;->a(Lcom/whoop/activation/iajf/domain/SignUpSource;)Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_1

    :cond_5
    invoke-virtual {p1}, Lf70/e$b;->m()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {p1}, Lf70/e$b;->l()Ln70/e;

    move-result-object p1

    invoke-virtual {p1}, Ln70/e;->d()I

    move-result p1

    invoke-static {p1, v2}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/activation/domain/models/ActivationFlowStepModel;

    if-eqz p1, :cond_3

    new-instance v2, Lh80/c$a;

    invoke-interface {p1}, Lcom/whoop/activation/domain/models/ActivationFlowStepModel;->getAnalyticsName()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lh80/c$e$a;->x:Lh80/c;

    invoke-static {v6, p1}, Lh80/c;->a(Lh80/c;Lcom/whoop/activation/domain/models/ActivationFlowStepModel;)Ljava/lang/String;

    move-result-object v6

    invoke-static {p1}, Lh80/a;->a(Lcom/whoop/activation/domain/models/ActivationFlowStepModel;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, v5, v6, p1}, Lh80/c$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    iput-object v4, v0, Lh80/c$e$a$a;->y:Ljava/lang/Object;

    iput-object v4, v0, Lh80/c$e$a$a;->E:Ljava/lang/Object;

    iput-object v4, v0, Lh80/c$e$a$a;->F:Ljava/lang/Object;

    iput-object v4, v0, Lh80/c$e$a$a;->G:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, v0, Lh80/c$e$a$a;->H:I

    iput v3, v0, Lh80/c$e$a$a;->x:I

    invoke-interface {p2, v2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    return-object v1

    :cond_6
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
