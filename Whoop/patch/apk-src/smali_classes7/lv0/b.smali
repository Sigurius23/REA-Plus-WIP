.class public final Llv0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Llv0/b;",
        "",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "Llv0/a;",
        "event",
        "Ll83/a0;",
        "a",
        "(Llv0/a;)V",
        "Lpv0/b;",
        "b",
        "(Lpv0/b;)V",
        "Lfi0/a;",
        "content-search_release"
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

    iput-object p1, p0, Llv0/b;->a:Lfi0/a;

    return-void
.end method


# virtual methods
.method public final a(Llv0/a;)V
    .locals 8

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Llv0/b;->a:Lfi0/a;

    invoke-virtual {p1}, Llv0/a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Llv0/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Llv0/a;->f()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Llv0/a;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Llv0/a;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Llv0/a;->e()Ljava/util/Map;

    move-result-object v7

    invoke-interface/range {v1 .. v7}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final b(Lpv0/b;)V
    .locals 8

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lpv0/b$d;

    if-eqz v0, :cond_0

    new-instance v1, Llv0/a$c;

    check-cast p1, Lpv0/b$d;

    invoke-virtual {p1}, Lpv0/b$d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lpv0/b$d;->a()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v7}, Llv0/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, v1}, Llv0/b;->a(Llv0/a;)V

    :cond_0
    return-void
.end method
