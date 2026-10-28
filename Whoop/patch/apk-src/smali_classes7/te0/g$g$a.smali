.class public final Lte0/g$g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lte0/g$g;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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


# direct methods
.method public constructor <init>(Lec3/m;)V
    .locals 0

    iput-object p1, p0, Lte0/g$g$a;->w:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p2, Lte0/g$g$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lte0/g$g$a$a;

    iget v1, v0, Lte0/g$g$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lte0/g$g$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lte0/g$g$a$a;

    invoke-direct {v0, p0, p2}, Lte0/g$g$a$a;-><init>(Lte0/g$g$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lte0/g$g$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lte0/g$g$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lte0/g$g$a$a;->H:Ljava/lang/Object;

    check-cast p1, Lre0/b;

    iget-object p1, v0, Lte0/g$g$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lte0/g$g$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lte0/g$g$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lte0/g$g$a;->w:Lec3/m;

    check-cast p1, Lqw2/b;

    invoke-virtual {p1}, Lqw2/b;->a()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v2

    instance-of v4, v2, Lcom/whoop/whoopaction/domain/models/UpdateAction;

    const/4 v5, 0x0

    if-eqz v4, :cond_3

    move-object v6, v2

    check-cast v6, Lcom/whoop/whoopaction/domain/models/UpdateAction;

    invoke-virtual {v6}, Lcom/whoop/whoopaction/domain/models/UpdateAction;->getRequest()Lcom/whoop/whoopaction/domain/models/Request;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/whoopaction/domain/models/Request;->getMethod()Ljava/lang/String;

    move-result-object v6

    const-string v7, "DELETE"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    move v6, v3

    goto :goto_1

    :cond_3
    move v6, v5

    :goto_1
    instance-of v7, p1, Lqw2/b$a;

    const/4 v8, 0x0

    if-eqz v7, :cond_5

    if-nez v4, :cond_4

    instance-of v4, v2, Lcom/whoop/whoopaction/domain/models/DownloadAction;

    if-eqz v4, :cond_5

    :cond_4
    new-instance p1, Lre0/b$f;

    invoke-direct {p1, v2}, Lre0/b$f;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    goto :goto_2

    :cond_5
    instance-of v4, p1, Lqw2/b$i;

    if-eqz v4, :cond_6

    if-eqz v6, :cond_6

    sget-object p1, Lre0/b$b;->a:Lre0/b$b;

    goto :goto_2

    :cond_6
    instance-of v4, p1, Lqw2/b$f;

    if-eqz v4, :cond_7

    if-eqz v6, :cond_7

    sget-object p1, Lre0/b$a;->a:Lre0/b$a;

    goto :goto_2

    :cond_7
    instance-of p1, p1, Lqw2/b$c;

    if-eqz p1, :cond_8

    instance-of p1, v2, Lcom/whoop/whoopaction/domain/models/DownloadAction;

    if-eqz p1, :cond_8

    sget-object p1, Lre0/b$d;->a:Lre0/b$d;

    goto :goto_2

    :cond_8
    move-object p1, v8

    :goto_2
    if-eqz p1, :cond_9

    iput-object v8, v0, Lte0/g$g$a$a;->y:Ljava/lang/Object;

    iput-object v8, v0, Lte0/g$g$a$a;->E:Ljava/lang/Object;

    iput-object v8, v0, Lte0/g$g$a$a;->F:Ljava/lang/Object;

    iput-object v8, v0, Lte0/g$g$a$a;->G:Ljava/lang/Object;

    iput-object v8, v0, Lte0/g$g$a$a;->H:Ljava/lang/Object;

    iput v5, v0, Lte0/g$g$a$a;->I:I

    iput v3, v0, Lte0/g$g$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    return-object v1

    :cond_9
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
