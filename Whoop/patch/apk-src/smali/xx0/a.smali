.class public final Lxx0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lxx0/a;",
        "",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "Lcy0/a$a;",
        "event",
        "Ll83/a0;",
        "a",
        "(Lcy0/a$a;)V",
        "Lfi0/a;",
        "deep-dive_release"
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

    iput-object p1, p0, Lxx0/a;->a:Lfi0/a;

    return-void
.end method


# virtual methods
.method public final a(Lcy0/a$a;)V
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcy0/a$j;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lxx0/a;->a:Lfi0/a;

    check-cast p1, Lcy0/a$j;

    invoke-virtual {p1}, Lcy0/a$j;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxx0/b;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lxx0/b;->b(Lfi0/a;Ljava/lang/String;)V

    return-void

    :cond_0
    instance-of v0, p1, Lcy0/a$i;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lxx0/a;->a:Lfi0/a;

    check-cast p1, Lcy0/a$i;

    invoke-virtual {p1}, Lcy0/a$i;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcy0/a$i;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lxx0/b;->a(Lfi0/a;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
