.class final Lcr1/c$j;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcr1/c;->s(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lcr1/b;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.integrations.domain.IntegrationsInteractor$loadIntegrationDetails$2"
    f = "IntegrationsInteractor.kt"
    l = {
        0x4f,
        0x51,
        0x52,
        0x52
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field final synthetic F:Lcr1/c;

.field w:Ljava/lang/Object;

.field x:I

.field y:I

.field private synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcr1/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcr1/c;",
            "Lq83/d<",
            "-",
            "Lcr1/c$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcr1/c$j;->E:Ljava/lang/String;

    iput-object p2, p0, Lcr1/c$j;->F:Lcr1/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance v0, Lcr1/c$j;

    iget-object v1, p0, Lcr1/c$j;->E:Ljava/lang/String;

    iget-object v2, p0, Lcr1/c$j;->F:Lcr1/c;

    invoke-direct {v0, v1, v2, p2}, Lcr1/c$j;-><init>(Ljava/lang/String;Lcr1/c;Lq83/d;)V

    iput-object p1, v0, Lcr1/c$j;->z:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcr1/c$j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcr1/c$j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcr1/c$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcr1/c$j;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lcr1/c$j;->z:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcr1/c$j;->y:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lcr1/c$j;->w:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcr1/c$j;->w:Ljava/lang/Object;

    check-cast v0, Lir1/b;

    :goto_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lcr1/b$h;

    invoke-direct {p1, v7, v6, v7}, Lcr1/b$h;-><init>(Lcr1/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lcr1/c$j;->z:Ljava/lang/Object;

    iput v6, p0, Lcr1/c$j;->y:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_3

    :cond_5
    :goto_1
    sget-object p1, Lir1/b;->Companion:Lir1/b$a;

    iget-object v2, p0, Lcr1/c$j;->E:Ljava/lang/String;

    invoke-virtual {p1, v2}, Lir1/b$a;->a(Ljava/lang/String;)Lir1/b;

    move-result-object p1

    if-eqz p1, :cond_6

    new-instance v2, Lcr1/b$c;

    invoke-direct {v2, p1}, Lcr1/b$c;-><init>(Lir1/b;)V

    iput-object v0, p0, Lcr1/c$j;->z:Ljava/lang/Object;

    iput-object v7, p0, Lcr1/c$j;->w:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, p0, Lcr1/c$j;->x:I

    iput v5, p0, Lcr1/c$j;->y:I

    invoke-interface {v0, v2, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_3

    :cond_6
    iget-object p1, p0, Lcr1/c$j;->F:Lcr1/c;

    iget-object v2, p0, Lcr1/c$j;->E:Ljava/lang/String;

    iput-object v7, p0, Lcr1/c$j;->z:Ljava/lang/Object;

    iput-object v0, p0, Lcr1/c$j;->w:Ljava/lang/Object;

    iput v4, p0, Lcr1/c$j;->y:I

    invoke-static {p1, v2, p0}, Lcr1/c;->c(Lcr1/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_3

    :cond_7
    :goto_2
    iput-object v7, p0, Lcr1/c$j;->z:Ljava/lang/Object;

    iput-object v7, p0, Lcr1/c$j;->w:Ljava/lang/Object;

    iput v3, p0, Lcr1/c$j;->y:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_3
    return-object v1

    :cond_8
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
