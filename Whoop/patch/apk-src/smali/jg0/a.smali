.class public final Ljg0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Ljg0/a;",
        "",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "Log0/a$f;",
        "event",
        "Ll83/a0;",
        "b",
        "(Log0/a$f;)V",
        "Log0/a$b;",
        "a",
        "(Log0/a$b;)V",
        "Lfi0/a;",
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
.field private final a:Lfi0/a;


# direct methods
.method public constructor <init>(Lfi0/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljg0/a;->a:Lfi0/a;

    return-void
.end method

.method private final b(Log0/a$f;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public final a(Log0/a$b;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Log0/a$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljg0/a;->a:Lfi0/a;

    check-cast p1, Log0/a$a;

    invoke-virtual {p1}, Log0/a$a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Ljg0/b;->a(Lfi0/a;Ljava/lang/String;)V

    return-void

    :cond_0
    instance-of v0, p1, Log0/a$f;

    if-eqz v0, :cond_1

    check-cast p1, Log0/a$f;

    invoke-direct {p0, p1}, Ljg0/a;->b(Log0/a$f;)V

    return-void

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
