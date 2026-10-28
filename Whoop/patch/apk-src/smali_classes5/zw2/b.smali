.class public final Lzw2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lzw2/b;",
        "",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "Lzw2/a;",
        "event",
        "Ll83/a0;",
        "a",
        "(Lzw2/a;)V",
        "Lfi0/a;",
        "whooplabs_release"
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

    iput-object p1, p0, Lzw2/b;->a:Lfi0/a;

    return-void
.end method


# virtual methods
.method public final a(Lzw2/a;)V
    .locals 10

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lzw2/b;->a:Lfi0/a;

    invoke-virtual {p1}, Lzw2/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lzw2/a;->e()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lzw2/a;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lzw2/a;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lzw2/a;->d()Ljava/util/Map;

    move-result-object v7

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method
