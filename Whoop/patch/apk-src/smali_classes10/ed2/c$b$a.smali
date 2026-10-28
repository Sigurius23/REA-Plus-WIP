.class public final Led2/c$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Led2/c$b;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Led2/c;

.field final synthetic y:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lec3/m;Led2/c;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Led2/c$b$a;->w:Lec3/m;

    iput-object p2, p0, Led2/c$b$a;->x:Led2/c;

    iput-object p3, p0, Led2/c$b$a;->y:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 13

    instance-of v0, p2, Led2/c$b$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Led2/c$b$a$a;

    iget v1, v0, Led2/c$b$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Led2/c$b$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Led2/c$b$a$a;

    invoke-direct {v0, p0, p2}, Led2/c$b$a$a;-><init>(Led2/c$b$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Led2/c$b$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Led2/c$b$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Led2/c$b$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Led2/c$b$a$a;->E:Ljava/lang/Object;

    check-cast p1, Led2/c$b$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Led2/c$b$a;->w:Lec3/m;

    check-cast p1, Lpm0/a;

    instance-of v2, p1, Lpm0/a$e;

    const/4 v4, 0x0

    if-eqz v2, :cond_3

    new-instance v5, Led2/b;

    const/16 v10, 0xe

    const/4 v11, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Led2/b;-><init>(ZZZLcom/whoop/share/model/ShareResponse;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_2

    :cond_3
    instance-of v2, p1, Lpm0/a$a$b;

    if-eqz v2, :cond_4

    new-instance v5, Led2/b;

    const/16 v10, 0x8

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Led2/b;-><init>(ZZZLcom/whoop/share/model/ShareResponse;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_2

    :cond_4
    instance-of v2, p1, Lpm0/a$a$a;

    if-eqz v2, :cond_5

    iget-object v2, p0, Led2/c$b$a;->x:Led2/c;

    check-cast p1, Lpm0/a$a$a;

    invoke-virtual {p1}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/share/model/ShareResponse;

    invoke-static {v2, v5}, Led2/c;->f(Led2/c;Lcom/whoop/share/model/ShareResponse;)V

    new-instance v6, Led2/b;

    invoke-virtual {p1}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object p1

    move-object v10, p1

    check-cast v10, Lcom/whoop/share/model/ShareResponse;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v12}, Led2/b;-><init>(ZZZLcom/whoop/share/model/ShareResponse;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v5, v6

    goto :goto_2

    :cond_5
    instance-of v2, p1, Lpm0/a$d;

    if-eqz v2, :cond_6

    new-instance v5, Led2/b;

    check-cast p1, Lpm0/a$d;

    invoke-virtual {p1}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object p1

    move-object v9, p1

    check-cast v9, Lcom/whoop/share/model/ShareResponse;

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v11}, Led2/b;-><init>(ZZZLcom/whoop/share/model/ShareResponse;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_6
    instance-of v2, p1, Lpm0/a$c;

    if-eqz v2, :cond_9

    check-cast p1, Lpm0/a$c;

    invoke-virtual {p1}, Lpm0/a$c;->b()I

    move-result v2

    if-lez v2, :cond_7

    invoke-virtual {p1}, Lpm0/a$c;->b()I

    move-result v2

    const-string v5, ", HTTP status="

    invoke-static {v2, v5}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_7
    const-string v2, ""

    :goto_1
    iget-object v5, p0, Led2/c$b$a;->x:Led2/c;

    invoke-static {v5}, Led2/c;->d(Led2/c;)Ltr2/n;

    move-result-object v5

    iget-object v6, p0, Led2/c$b$a;->y:Ljava/lang/String;

    invoke-virtual {p1}, Lpm0/a$c;->a()Ljava/lang/String;

    move-result-object p1

    const-string v7, "API fetch failure: request path="

    const-string v8, ", error message="

    invoke-static {v7, v6, v2, v8, p1}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v2, v4, [Lqr2/a$a;

    invoke-interface {v5, p1, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Led2/c$b$a;->x:Led2/c;

    invoke-static {p1}, Led2/c;->e(Led2/c;)Lcd2/b;

    move-result-object p1

    sget-object v2, Lfd2/c;->FAILURE:Lfd2/c;

    invoke-virtual {p1, v2}, Lcd2/b;->c(Lfd2/c;)V

    new-instance v5, Led2/b;

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Led2/b;-><init>(ZZZLcom/whoop/share/model/ShareResponse;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_2
    const/4 p1, 0x0

    iput-object p1, v0, Led2/c$b$a$a;->y:Ljava/lang/Object;

    iput-object p1, v0, Led2/c$b$a$a;->E:Ljava/lang/Object;

    iput-object p1, v0, Led2/c$b$a$a;->F:Ljava/lang/Object;

    iput-object p1, v0, Led2/c$b$a$a;->G:Ljava/lang/Object;

    iput v4, v0, Led2/c$b$a$a;->H:I

    iput v3, v0, Led2/c$b$a$a;->x:I

    invoke-interface {p2, v5, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    return-object v1

    :cond_8
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
