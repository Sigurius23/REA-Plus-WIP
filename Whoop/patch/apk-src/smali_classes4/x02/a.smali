.class public abstract Lx02/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\'\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lk63/a;",
        "Lcom/google/gson/Gson;",
        "gson",
        "Li63/d;",
        "contentType",
        "Ll83/a0;",
        "a",
        "(Lk63/a;Lcom/google/gson/Gson;Li63/d;)V",
        "network_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lk63/a;Lcom/google/gson/Gson;Li63/d;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gson"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll63/b;

    invoke-direct {v0, p1}, Ll63/b;-><init>(Lcom/google/gson/Gson;)V

    invoke-static {p0, p2, v0}, Lge3/g;->R(Lk63/a;Li63/d;Lk63/b;)V

    return-void
.end method

.method public static b(Lk63/a;Lcom/google/gson/Gson;Li63/d;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    new-instance p1, Lcom/google/gson/Gson;

    invoke-direct {p1}, Lcom/google/gson/Gson;-><init>()V

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    sget-object p2, Li63/b;->a:Li63/d;

    sget-object p2, Li63/b;->a:Li63/d;

    :cond_1
    invoke-static {p0, p1, p2}, Lx02/a;->a(Lk63/a;Lcom/google/gson/Gson;Li63/d;)V

    return-void
.end method
