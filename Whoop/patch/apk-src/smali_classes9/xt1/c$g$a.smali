.class public final Lxt1/c$g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxt1/c$g;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Lxt1/c;


# direct methods
.method public constructor <init>(Lec3/m;Lxt1/c;)V
    .locals 0

    iput-object p1, p0, Lxt1/c$g$a;->w:Lec3/m;

    iput-object p2, p0, Lxt1/c$g$a;->x:Lxt1/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p2, Lxt1/c$g$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lxt1/c$g$a$a;

    iget v1, v0, Lxt1/c$g$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lxt1/c$g$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lxt1/c$g$a$a;

    invoke-direct {v0, p0, p2}, Lxt1/c$g$a$a;-><init>(Lxt1/c$g$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lxt1/c$g$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lxt1/c$g$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lxt1/c$g$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lxt1/c$g$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lxt1/c$g$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lxt1/c$g$a;->w:Lec3/m;

    check-cast p1, Lpm0/a;

    instance-of v2, p1, Lpm0/a$a$a;

    if-eqz v2, :cond_4

    iget-object v2, p0, Lxt1/c$g$a;->x:Lxt1/c;

    invoke-static {v2}, Lxt1/c;->d(Lxt1/c;)Lec3/p1;

    move-result-object v2

    :cond_3
    move-object v4, v2

    check-cast v4, Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;

    iget-object v7, p0, Lxt1/c$g$a;->x:Lxt1/c;

    move-object v8, p1

    check-cast v8, Lpm0/a$a$a;

    invoke-virtual {v8}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;

    invoke-static {v7, v6, v8}, Lxt1/c;->c(Lxt1/c;Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;)Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    new-instance p1, Lxt1/b$f;

    invoke-direct {p1, v6}, Lxt1/b$f;-><init>(Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;)V

    goto :goto_3

    :cond_4
    instance-of v2, p1, Lpm0/a$e;

    if-nez v2, :cond_8

    instance-of v2, p1, Lpm0/a$a$b;

    if-eqz v2, :cond_5

    goto :goto_2

    :cond_5
    instance-of v2, p1, Lpm0/a$c;

    if-nez v2, :cond_7

    instance-of p1, p1, Lpm0/a$d;

    if-eqz p1, :cond_6

    goto :goto_1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    :goto_1
    new-instance p1, Lxt1/b$a;

    iget-object v2, p0, Lxt1/c$g$a;->x:Lxt1/c;

    invoke-static {v2}, Lxt1/c;->d(Lxt1/c;)Lec3/p1;

    move-result-object v2

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;

    invoke-direct {p1, v2}, Lxt1/b$a;-><init>(Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;)V

    goto :goto_3

    :cond_8
    :goto_2
    new-instance p1, Lxt1/b$b;

    iget-object v2, p0, Lxt1/c$g$a;->x:Lxt1/c;

    invoke-static {v2}, Lxt1/c;->d(Lxt1/c;)Lec3/p1;

    move-result-object v2

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;

    invoke-direct {p1, v2}, Lxt1/b$b;-><init>(Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;)V

    :goto_3
    const/4 v2, 0x0

    iput-object v2, v0, Lxt1/c$g$a$a;->y:Ljava/lang/Object;

    iput-object v2, v0, Lxt1/c$g$a$a;->E:Ljava/lang/Object;

    iput-object v2, v0, Lxt1/c$g$a$a;->F:Ljava/lang/Object;

    iput-object v2, v0, Lxt1/c$g$a$a;->G:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lxt1/c$g$a$a;->H:I

    iput v3, v0, Lxt1/c$g$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    return-object v1

    :cond_9
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
