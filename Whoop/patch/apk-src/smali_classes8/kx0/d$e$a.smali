.class public final Lkx0/d$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkx0/d$e;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Lkx0/d;

.field final synthetic y:Lkx0/b;


# direct methods
.method public constructor <init>(Lec3/m;Lkx0/d;Lkx0/b;)V
    .locals 0

    iput-object p1, p0, Lkx0/d$e$a;->w:Lec3/m;

    iput-object p2, p0, Lkx0/d$e$a;->x:Lkx0/d;

    iput-object p3, p0, Lkx0/d$e$a;->y:Lkx0/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, Lkx0/d$e$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lkx0/d$e$a$a;

    iget v1, v0, Lkx0/d$e$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lkx0/d$e$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lkx0/d$e$a$a;

    invoke-direct {v0, p0, p2}, Lkx0/d$e$a$a;-><init>(Lkx0/d$e$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lkx0/d$e$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lkx0/d$e$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lkx0/d$e$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lkx0/d$e$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lkx0/d$e$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lkx0/d$e$a;->w:Lec3/m;

    check-cast p1, Lcom/whoop/straphistorysync/sync/f;

    iget-object v2, p0, Lkx0/d$e$a;->x:Lkx0/d;

    invoke-static {v2}, Lkx0/d;->c(Lkx0/d;)Ltr2/n;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Sensor HPS terminal state: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    new-array v6, v5, [Lqr2/a$a;

    invoke-interface {v2, v4, v6}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    instance-of v2, p1, Lcom/whoop/straphistorysync/sync/f$b$d;

    const/4 v4, 0x2

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    new-instance p1, Lkx0/e$a;

    iget-object v2, p0, Lkx0/d$e$a;->y:Lkx0/b;

    invoke-interface {v2}, Lkx0/b;->a()Ldt0/c;

    move-result-object v2

    invoke-direct {p1, v2, v6, v4, v6}, Lkx0/e$a;-><init>(Ldt0/c;Lts0/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_3
    instance-of v2, p1, Lcom/whoop/straphistorysync/sync/f$b;

    if-eqz v2, :cond_5

    invoke-interface {p1}, Lcom/whoop/straphistorysync/sync/f;->b()Lbi2/l;

    move-result-object p1

    invoke-virtual {p1}, Lbi2/l;->b()I

    move-result p1

    if-lez p1, :cond_4

    iget-object p1, p0, Lkx0/d$e$a;->x:Lkx0/d;

    invoke-static {p1}, Lkx0/d;->c(Lkx0/d;)Ltr2/n;

    move-result-object p1

    const-string v2, "HPS ended with partial data, triggering upload"

    new-array v7, v5, [Lqr2/a$a;

    invoke-interface {p1, v2, v7}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lkx0/e$a;

    iget-object v2, p0, Lkx0/d$e$a;->y:Lkx0/b;

    invoke-interface {v2}, Lkx0/b;->a()Ldt0/c;

    move-result-object v2

    invoke-direct {p1, v2, v6, v4, v6}, Lkx0/e$a;-><init>(Ldt0/c;Lts0/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_4
    new-instance p1, Lkx0/e$b;

    iget-object v2, p0, Lkx0/d$e$a;->y:Lkx0/b;

    invoke-interface {v2}, Lkx0/b;->a()Ldt0/c;

    move-result-object v2

    invoke-direct {p1, v2, v6, v4, v6}, Lkx0/e$b;-><init>(Ldt0/c;Lts0/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_5
    new-instance p1, Lkx0/e$b;

    iget-object v2, p0, Lkx0/d$e$a;->y:Lkx0/b;

    invoke-interface {v2}, Lkx0/b;->a()Ldt0/c;

    move-result-object v2

    invoke-direct {p1, v2, v6, v4, v6}, Lkx0/e$b;-><init>(Ldt0/c;Lts0/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_1
    iput-object v6, v0, Lkx0/d$e$a$a;->y:Ljava/lang/Object;

    iput-object v6, v0, Lkx0/d$e$a$a;->E:Ljava/lang/Object;

    iput-object v6, v0, Lkx0/d$e$a$a;->F:Ljava/lang/Object;

    iput-object v6, v0, Lkx0/d$e$a$a;->G:Ljava/lang/Object;

    iput v5, v0, Lkx0/d$e$a$a;->H:I

    iput v3, v0, Lkx0/d$e$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    return-object v1

    :cond_6
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
