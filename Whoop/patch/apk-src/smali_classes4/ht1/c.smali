.class public final Lht1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0082@\u00a2\u0006\u0004\u0008\t\u0010\nJ!\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u000b2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lht1/c;",
        "",
        "Ltr2/n;",
        "logger",
        "Lqk1/b;",
        "dao",
        "<init>",
        "(Ltr2/n;Lqk1/b;)V",
        "",
        "b",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lec3/l;",
        "Lht1/a;",
        "upstream",
        "Lht1/b;",
        "c",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Ltr2/n;",
        "Lqk1/b;",
        "labrador_release"
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
.field private final a:Ltr2/n;

.field private final b:Lqk1/b;


# direct methods
.method public constructor <init>(Ltr2/n;Lqk1/b;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dao"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lht1/c;->a:Ltr2/n;

    iput-object p2, p0, Lht1/c;->b:Lqk1/b;

    return-void
.end method

.method public static final synthetic a(Lht1/c;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lht1/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final b(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lht1/c$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lht1/c$a;

    iget v1, v0, Lht1/c$a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lht1/c$a;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lht1/c$a;

    invoke-direct {v0, p0, p1}, Lht1/c$a;-><init>(Lht1/c;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lht1/c$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lht1/c$a;->y:I

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

    iget-object p1, p0, Lht1/c;->b:Lqk1/b;

    iput v3, v0, Lht1/c$a;->y:I

    invoke-interface {p1, v0}, Lqk1/b;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lqk1/a;

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lqk1/a;->j()Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_2

    :cond_4
    move v3, v0

    :goto_2
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final c(Lec3/l;)Lec3/l;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lht1/b;

    sget-object v2, Lht1/d$b;->a:Lht1/d$b;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lht1/b;-><init>(Lht1/d;Lht1/e;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lht1/c$b;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lht1/c$b;-><init>(Lht1/c;Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v1, p1, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v2
.end method
