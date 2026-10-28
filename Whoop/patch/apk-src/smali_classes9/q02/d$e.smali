.class final Lq02/d$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq02/d;->i(Ljava/lang/String;Lcom/whoop/navigation/models/GenericHttpMethod;Ljava/util/Map;)Lec3/l;
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
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u0004*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lec3/m;",
        "Lq02/b;",
        "",
        "e",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;Ljava/lang/Throwable;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.nestedbff.domain.NestedBFFInteractor$fetch$3$2"
    f = "NestedBFFInteractor.kt"
    l = {
        0x51
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field final synthetic F:Lcom/whoop/navigation/models/GenericHttpMethod;

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lq02/d;


# direct methods
.method public constructor <init>(Lq02/d;Ljava/lang/String;Lcom/whoop/navigation/models/GenericHttpMethod;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq02/d;",
            "Ljava/lang/String;",
            "Lcom/whoop/navigation/models/GenericHttpMethod;",
            "Lq83/d<",
            "-",
            "Lq02/d$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lq02/d$e;->z:Lq02/d;

    iput-object p2, p0, Lq02/d$e;->E:Ljava/lang/String;

    iput-object p3, p0, Lq02/d$e;->F:Lcom/whoop/navigation/models/GenericHttpMethod;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Throwable;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Ljava/lang/Throwable;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lq02/d$e;

    iget-object v1, p0, Lq02/d$e;->z:Lq02/d;

    iget-object v2, p0, Lq02/d$e;->E:Ljava/lang/String;

    iget-object v3, p0, Lq02/d$e;->F:Lcom/whoop/navigation/models/GenericHttpMethod;

    invoke-direct {v0, v1, v2, v3, p3}, Lq02/d$e;-><init>(Lq02/d;Ljava/lang/String;Lcom/whoop/navigation/models/GenericHttpMethod;Lq83/d;)V

    iput-object p1, v0, Lq02/d$e;->x:Ljava/lang/Object;

    iput-object p2, v0, Lq02/d$e;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lq02/d$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Ljava/lang/Throwable;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lq02/d$e;->invoke(Lec3/m;Ljava/lang/Throwable;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lq02/d$e;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    iget-object v1, p0, Lq02/d$e;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lq02/d$e;->w:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Lkotlinx/serialization/SerializationException;

    if-eqz p1, :cond_3

    iget-object p1, p0, Lq02/d$e;->z:Lq02/d;

    invoke-static {p1}, Lq02/d;->f(Lq02/d;)Ltr2/n;

    move-result-object p1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    sget-object v5, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v5, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-interface {v3}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    iget-object v5, p0, Lq02/d$e;->E:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    const-string v7, "] ["

    const-string v8, "]: "

    const-string v9, "NestedBFF schema validation failure ["

    invoke-static {v9, v3, v7, v5, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x0

    new-array v5, v5, [Lqr2/a$a;

    invoke-interface {p1, v3, v5}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lq02/d$e;->z:Lq02/d;

    invoke-static {p1}, Lq02/d;->g(Lq02/d;)Liy1/c;

    move-result-object p1

    new-instance v5, Ljy1/a;

    iget-object v3, p0, Lq02/d$e;->E:Ljava/lang/String;

    const-string v6, "path:"

    invoke-static {v6, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v6, p0, Lq02/d$e;->F:Lcom/whoop/navigation/models/GenericHttpMethod;

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "toLowerCase(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "method:"

    invoke-virtual {v7, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lq02/d$e;->z:Lq02/d;

    check-cast v1, Lkotlinx/serialization/SerializationException;

    invoke-static {v7, v1}, Lq02/d;->d(Lq02/d;Lkotlinx/serialization/SerializationException;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "error:"

    invoke-static {v7, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v3, v6, v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    const/16 v11, 0x15

    const/4 v12, 0x0

    const/4 v6, 0x0

    const-string v7, "nested_bff.schema_validation_failure"

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v5 .. v12}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v5}, Liy1/c;->b(Ljy1/a;)V

    sget-object p1, Lq02/b$a$b;->a:Lq02/b$a$b;

    const/4 v1, 0x0

    iput-object v1, p0, Lq02/d$e;->x:Ljava/lang/Object;

    iput-object v1, p0, Lq02/d$e;->y:Ljava/lang/Object;

    iput v4, p0, Lq02/d$e;->w:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_2

    return-object v2

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_3
    throw v1
.end method
