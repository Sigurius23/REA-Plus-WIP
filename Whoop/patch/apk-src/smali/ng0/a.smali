.class public final Lng0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u000f\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lng0/a;",
        "",
        "Ljg0/a;",
        "analytics",
        "<init>",
        "(Ljg0/a;)V",
        "Log0/a$f;",
        "event",
        "Log0/a;",
        "a",
        "(Log0/a$f;)Log0/a;",
        "Lcom/whoop/navigation/e;",
        "navAction",
        "b",
        "(Lcom/whoop/navigation/e;)Log0/a;",
        "actionEvent",
        "c",
        "(Log0/a;)Log0/a;",
        "Ljg0/a;",
        "advanced-labs-management_release"
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
.field private final a:Ljg0/a;


# direct methods
.method public constructor <init>(Ljg0/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lng0/a;->a:Ljg0/a;

    return-void
.end method

.method private final a(Log0/a$f;)Log0/a;
    .locals 1

    invoke-virtual {p1}, Log0/a$f;->a()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lm91/u;

    if-eqz v0, :cond_0

    new-instance v0, Log0/a$c;

    check-cast p1, Lm91/u;

    invoke-direct {v0, p1}, Log0/a$c;-><init>(Lm91/u;)V

    return-object v0

    :cond_0
    instance-of v0, p1, Lcom/whoop/navigation/e;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-direct {p0, p1}, Lng0/a;->b(Lcom/whoop/navigation/e;)Log0/a;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private final b(Lcom/whoop/navigation/e;)Log0/a;
    .locals 1

    new-instance v0, Log0/a$d;

    invoke-direct {v0, p1}, Log0/a$d;-><init>(Lcom/whoop/navigation/e;)V

    return-object v0
.end method


# virtual methods
.method public final c(Log0/a;)Log0/a;
    .locals 2

    const-string v0, "actionEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Log0/a$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lng0/a;->a:Ljg0/a;

    move-object v1, p1

    check-cast v1, Log0/a$b;

    invoke-virtual {v0, v1}, Ljg0/a;->a(Log0/a$b;)V

    :cond_0
    instance-of v0, p1, Log0/a$f;

    if-eqz v0, :cond_1

    check-cast p1, Log0/a$f;

    invoke-direct {p0, p1}, Lng0/a;->a(Log0/a$f;)Log0/a;

    move-result-object p1

    :cond_1
    return-object p1
.end method
