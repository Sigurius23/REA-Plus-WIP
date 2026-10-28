.class public final Lm91/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\r\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\t\u0010\nR+\u0010\u0011\u001a\u0016\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\r0\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lm91/q;",
        "",
        "<init>",
        "()V",
        "Lm91/p;",
        "factory",
        "Ll83/a0;",
        "b",
        "(Lm91/p;)V",
        "a",
        "()Lm91/p;",
        "",
        "Lj93/d;",
        "Lm91/f;",
        "Ljava/util/Map;",
        "c",
        "()Ljava/util/Map;",
        "composerByItemState",
        "design_release"
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
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lj93/d;",
            "Lm91/f<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lm91/q;->a:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a()Lm91/p;
    .locals 2

    new-instance v0, Lm91/p;

    iget-object v1, p0, Lm91/q;->a:Ljava/util/Map;

    invoke-direct {v0, v1}, Lm91/p;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method public final b(Lm91/p;)V
    .locals 1

    const-string v0, "factory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm91/q;->a:Ljava/util/Map;

    invoke-virtual {p1}, Lm91/p;->b()Ljava/util/Map;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public final c()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lj93/d;",
            "Lm91/f<",
            "*>;>;"
        }
    .end annotation

    iget-object v0, p0, Lm91/q;->a:Ljava/util/Map;

    return-object v0
.end method
