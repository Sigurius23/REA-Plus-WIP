.class final Lur2/a$c$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lur2/a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lbc3/c0;",
        "",
        "kotlin.jvm.PlatformType",
        "<anonymous>",
        "(Lbc3/c0;)Ljava/lang/Object;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.util.log.exporter.LocalLogExporter$emailLogData$1$3"
    f = "LocalLogExporter.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field final synthetic F:Landroid/widget/Toast;

.field w:I

.field final synthetic x:Lur2/a;

.field final synthetic y:Landroid/content/Context;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lur2/a;Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/internal/g0;Landroid/widget/Toast;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lur2/a;",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/internal/g0;",
            "Landroid/widget/Toast;",
            "Lq83/d<",
            "-",
            "Lur2/a$c$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lur2/a$c$c;->x:Lur2/a;

    iput-object p2, p0, Lur2/a$c$c;->y:Landroid/content/Context;

    iput-object p3, p0, Lur2/a$c$c;->z:Ljava/lang/String;

    iput-object p4, p0, Lur2/a$c$c;->E:Lkotlin/jvm/internal/g0;

    iput-object p5, p0, Lur2/a$c$c;->F:Landroid/widget/Toast;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
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

    new-instance v0, Lur2/a$c$c;

    iget-object v1, p0, Lur2/a$c$c;->x:Lur2/a;

    iget-object v2, p0, Lur2/a$c$c;->y:Landroid/content/Context;

    iget-object v3, p0, Lur2/a$c$c;->z:Ljava/lang/String;

    iget-object v4, p0, Lur2/a$c$c;->E:Lkotlin/jvm/internal/g0;

    iget-object v5, p0, Lur2/a$c$c;->F:Landroid/widget/Toast;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lur2/a$c$c;-><init>(Lur2/a;Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/internal/g0;Landroid/widget/Toast;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lur2/a$c$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lur2/a$c$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lur2/a$c$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lur2/a$c$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lur2/a$c$c;->w:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lur2/a$c$c;->x:Lur2/a;

    invoke-static {p1}, Lur2/a;->k(Lur2/a;)Lci2/b;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lci2/b;->b()Lec3/t1;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lec3/t1;->getReplayCache()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljk0/d;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljk0/d;->f()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/whoop/domain/model/WhoopStrapInfo;->getSerialNumber()Ljava/lang/String;

    move-result-object p1

    :goto_0
    move-object v5, p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :goto_1
    iget-object p1, p0, Lur2/a$c$c;->x:Lur2/a;

    invoke-static {p1}, Lur2/a;->h(Lur2/a;)Lur2/c;

    move-result-object v0

    iget-object v1, p0, Lur2/a$c$c;->y:Landroid/content/Context;

    iget-object v2, p0, Lur2/a$c$c;->z:Ljava/lang/String;

    iget-object p1, p0, Lur2/a$c$c;->E:Lkotlin/jvm/internal/g0;

    iget-object p1, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Ljava/io/File;

    iget-object p1, p0, Lur2/a$c$c;->x:Lur2/a;

    invoke-static {p1}, Lur2/a;->b(Lur2/a;)Lor2/g;

    move-result-object v4

    invoke-virtual/range {v0 .. v5}, Lur2/c;->b(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Lor2/g;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    iget-object v0, p0, Lur2/a$c$c;->F:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->cancel()V

    :try_start_0
    iget-object v0, p0, Lur2/a$c$c;->y:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    move-object p1, v0

    iget-object v0, p0, Lur2/a$c$c;->x:Lur2/a;

    invoke-static {v0}, Lur2/a;->i(Lur2/a;)Ltr2/n;

    move-result-object v0

    new-instance v1, Lur2/a$b;

    invoke-direct {v1, p1}, Lur2/a$b;-><init>(Ljava/lang/Exception;)V

    const/4 p1, 0x0

    new-array p1, p1, [Lqr2/a$a;

    const-string v2, "LocalLogExporter failed to find activity for email"

    invoke-interface {v0, v2, v1, p1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    iget-object p1, p0, Lur2/a$c$c;->x:Lur2/a;

    invoke-static {p1}, Lur2/a;->e(Lur2/a;)Lur2/b;

    move-result-object p1

    iget-object v0, p0, Lur2/a$c$c;->y:Landroid/content/Context;

    invoke-virtual {p1, v0}, Lur2/b;->b(Landroid/content/Context;)Lm/j;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
