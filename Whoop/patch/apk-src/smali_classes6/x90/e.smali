.class public final Lx90/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0086@\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lx90/e;",
        "",
        "Lx90/f;",
        "activitySessionHandler",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lx90/f;Ltr2/n;)V",
        "Lcom/whoop/navigation/e;",
        "a",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lx90/f;",
        "b",
        "Ltr2/n;",
        "activity-session_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lx90/f;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lx90/f;Ltr2/n;)V
    .locals 1

    const-string v0, "activitySessionHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx90/e;->a:Lx90/f;

    iput-object p2, p0, Lx90/e;->b:Ltr2/n;

    return-void
.end method


# virtual methods
.method public final a(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/navigation/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lx90/e$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lx90/e$a;

    iget v1, v0, Lx90/e$a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lx90/e$a;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lx90/e$a;

    invoke-direct {v0, p0, p1}, Lx90/e$a;-><init>(Lx90/e;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lx90/e$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lx90/e$a;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lx90/e;->a:Lx90/f;

    iput v3, v0, Lx90/e$a;->y:I

    invoke-interface {p1, v0}, Lx90/f;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lx90/d;

    const/4 v0, 0x0

    if-nez p1, :cond_4

    return-object v0

    :cond_4
    invoke-virtual {p1}, Lx90/d;->c()Lcom/whoop/navigation/e;

    move-result-object v1

    if-nez v1, :cond_5

    iget-object v1, p0, Lx90/e;->b:Ltr2/n;

    invoke-virtual {p1}, Lx90/d;->f()Lx90/g;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Active session ("

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ") found with no resumeSessionDestination"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v1, p1, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v0

    :cond_5
    return-object v1
.end method
