.class public final Lfm2/d$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfm2/d$b;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Lfm2/d;

.field final synthetic y:La12/a;


# direct methods
.method public constructor <init>(Lec3/m;Lfm2/d;La12/a;)V
    .locals 0

    iput-object p1, p0, Lfm2/d$b$a;->w:Lec3/m;

    iput-object p2, p0, Lfm2/d$b$a;->x:Lfm2/d;

    iput-object p3, p0, Lfm2/d$b$a;->y:La12/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lfm2/d$b$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lfm2/d$b$a$a;

    iget v1, v0, Lfm2/d$b$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lfm2/d$b$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lfm2/d$b$a$a;

    invoke-direct {v0, p0, p2}, Lfm2/d$b$a$a;-><init>(Lfm2/d$b$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lfm2/d$b$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lfm2/d$b$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lfm2/d$b$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lfm2/d$b$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lfm2/d$b$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lfm2/d$b$a;->w:Lec3/m;

    check-cast p1, Lpm0/a;

    instance-of v2, p1, Lpm0/a$e;

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    new-instance p1, Lfm2/c;

    sget-object v2, Lfm2/a$a;->a:Lfm2/a$a;

    invoke-direct {p1, v2, v5, v4, v5}, Lfm2/c;-><init>(Lfm2/a;Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_3
    instance-of v2, p1, Lpm0/a$a$b;

    if-eqz v2, :cond_4

    new-instance v2, Lfm2/c;

    check-cast p1, Lpm0/a$a$b;

    invoke-virtual {p1}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;

    invoke-direct {v2, v5, p1, v3, v5}, Lfm2/c;-><init>(Lfm2/a;Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_1
    move-object p1, v2

    goto :goto_2

    :cond_4
    instance-of v2, p1, Lpm0/a$a$a;

    if-eqz v2, :cond_5

    iget-object v2, p0, Lfm2/d$b$a;->x:Lfm2/d;

    check-cast p1, Lpm0/a$a$a;

    invoke-virtual {p1}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;

    invoke-static {v2, p1}, Lfm2/d;->c(Lfm2/d;Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;)Lfm2/c;

    move-result-object p1

    goto :goto_2

    :cond_5
    instance-of v2, p1, Lpm0/a$d;

    if-eqz v2, :cond_6

    new-instance v2, Lfm2/c;

    check-cast p1, Lpm0/a$d;

    invoke-virtual {p1}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;

    invoke-direct {v2, v5, p1, v3, v5}, Lfm2/c;-><init>(Lfm2/a;Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_6
    instance-of p1, p1, Lpm0/a$c;

    if-eqz p1, :cond_7

    new-instance p1, Lfm2/c;

    new-instance v2, Lfm2/a$c;

    iget-object v6, p0, Lfm2/d$b$a;->y:La12/a;

    invoke-virtual {v6}, La12/a;->c()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v2, v6}, Lfm2/a$c;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v2, v5, v4, v5}, Lfm2/c;-><init>(Lfm2/a;Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_7
    new-instance p1, Lfm2/c;

    new-instance v2, Lfm2/a$c;

    iget-object v6, p0, Lfm2/d$b$a;->y:La12/a;

    invoke-virtual {v6}, La12/a;->c()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v2, v6}, Lfm2/a$c;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v2, v5, v4, v5}, Lfm2/c;-><init>(Lfm2/a;Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_2
    iput-object v5, v0, Lfm2/d$b$a$a;->y:Ljava/lang/Object;

    iput-object v5, v0, Lfm2/d$b$a$a;->E:Ljava/lang/Object;

    iput-object v5, v0, Lfm2/d$b$a$a;->F:Ljava/lang/Object;

    iput-object v5, v0, Lfm2/d$b$a$a;->G:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lfm2/d$b$a$a;->H:I

    iput v3, v0, Lfm2/d$b$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    return-object v1

    :cond_8
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
