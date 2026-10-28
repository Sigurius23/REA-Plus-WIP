.class final Le82/b$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le82/b;->a(Lj93/d;Z)Lec3/l;
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
        "\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "sdkState",
        "Ljk0/d;",
        "whoopStrap",
        "Le82/c;",
        "<anonymous>",
        "(Ljava/lang/Object;Ljk0/d;)Le82/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.sdk.realtimeStream.RealTimeStreamSdkImpl$toggleRealtimeStream$2"
    f = "RealTimeStreamSdkImpl.kt"
    l = {
        0x3a,
        0x3b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Z

.field final synthetic F:Lj93/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj93/d;"
        }
    .end annotation
.end field

.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Le82/b;


# direct methods
.method public constructor <init>(Le82/b;ZLj93/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le82/b;",
            "Z",
            "Lj93/d;",
            "Lq83/d<",
            "-",
            "Le82/b$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Le82/b$h;->z:Le82/b;

    iput-boolean p2, p0, Le82/b$h;->E:Z

    iput-object p3, p0, Le82/b$h;->F:Lj93/d;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;Ljk0/d;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljk0/d;",
            "Lq83/d<",
            "-",
            "Le82/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Le82/b$h;

    iget-object v1, p0, Le82/b$h;->z:Le82/b;

    iget-boolean v2, p0, Le82/b$h;->E:Z

    iget-object v3, p0, Le82/b$h;->F:Lj93/d;

    invoke-direct {v0, v1, v2, v3, p3}, Le82/b$h;-><init>(Le82/b;ZLj93/d;Lq83/d;)V

    iput-object p1, v0, Le82/b$h;->x:Ljava/lang/Object;

    iput-object p2, v0, Le82/b$h;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Le82/b$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ljk0/d;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Le82/b$h;->f(Ljava/lang/Object;Ljk0/d;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Le82/b$h;->x:Ljava/lang/Object;

    iget-object v1, p0, Le82/b$h;->y:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Ljk0/d;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v3, p0, Le82/b$h;->w:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v6, p0

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v2, p0

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Le82/c$a;->a:Le82/c$a;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    return-object p1

    :cond_3
    if-nez v2, :cond_4

    iget-object p1, p0, Le82/b$h;->z:Le82/b;

    invoke-virtual {p1}, Le82/b;->g()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    new-instance p1, Le82/c$c;

    const-string v0, "Connection with strap lost"

    invoke-direct {p1, v0}, Le82/c$c;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_4
    iget-object p1, p0, Le82/b$h;->z:Le82/b;

    invoke-static {p1}, Le82/b;->e(Le82/b;)Ltr2/n;

    move-result-object p1

    iget-boolean v0, p0, Le82/b$h;->E:Z

    iget-object v3, p0, Le82/b$h;->F:Lj93/d;

    invoke-interface {v3}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Sending "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, " command for "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {p1, v0, v3}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Le82/b$h;->F:Lj93/d;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lrt0/b$a;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/4 v6, 0x0

    if-eqz v3, :cond_6

    iget-boolean v3, p0, Le82/b$h;->E:Z

    iput-object v6, p0, Le82/b$h;->x:Ljava/lang/Object;

    iput-object v6, p0, Le82/b$h;->y:Ljava/lang/Object;

    iput v5, p0, Le82/b$h;->w:I

    const-wide/16 v4, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    move-object v6, p0

    invoke-static/range {v2 .. v8}, Ljk0/d;->D(Ljk0/d;ZJLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v2, v6

    if-ne p1, v1, :cond_5

    move-object v6, v2

    goto :goto_1

    :cond_5
    :goto_0
    check-cast p1, Lzj0/h;

    move-object v6, v2

    goto :goto_3

    :cond_6
    move-object v3, v2

    move-object v2, p0

    const-class v5, Lrt0/b$b;

    invoke-virtual {v0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    move-object p1, v6

    move-object v6, v2

    move-object v2, v3

    iget-boolean v3, v6, Le82/b$h;->E:Z

    iput-object p1, v6, Le82/b$h;->x:Ljava/lang/Object;

    iput-object p1, v6, Le82/b$h;->y:Ljava/lang/Object;

    iput v4, v6, Le82/b$h;->w:I

    const-wide/16 v4, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v2 .. v8}, Ljk0/d;->m0(Ljk0/d;ZJLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_1
    return-object v1

    :cond_7
    :goto_2
    check-cast p1, Lzj0/h;

    :goto_3
    if-eqz p1, :cond_9

    invoke-virtual {p1}, Lzj0/h;->W()Z

    move-result p1

    if-eqz p1, :cond_9

    iget-boolean p1, v6, Le82/b$h;->E:Z

    if-eqz p1, :cond_8

    sget-object p1, Le82/c$b;->a:Le82/c$b;

    return-object p1

    :cond_8
    sget-object p1, Le82/c$d;->a:Le82/c$d;

    return-object p1

    :cond_9
    new-instance p1, Le82/c$c;

    iget-boolean v0, v6, Le82/b$h;->E:Z

    iget-object v1, v6, Le82/b$h;->F:Lj93/d;

    invoke-interface {v1}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const-string v2, " "

    const-string v3, " failed"

    const-string v4, "Command to "

    invoke-static {v4, v2, v1, v3, v0}, Lc13/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Le82/c$c;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_a
    move-object v6, v2

    new-instance p1, Ljava/lang/IllegalAccessException;

    const-string v0, "Not supported"

    invoke-direct {p1, v0}, Ljava/lang/IllegalAccessException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
