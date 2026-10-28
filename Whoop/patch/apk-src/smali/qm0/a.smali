.class public final Lqm0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J&\u0010\r\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00082\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lqm0/a;",
        "",
        "Lu82/a;",
        "bffCacheDeserializer",
        "Lq83/j;",
        "ioDispatcher",
        "<init>",
        "(Lu82/a;Lq83/j;)V",
        "T",
        "Lne3/l;",
        "byteString",
        "Ljava/lang/reflect/Type;",
        "type",
        "b",
        "(Lne3/l;Ljava/lang/reflect/Type;Lq83/d;)Ljava/lang/Object;",
        "a",
        "Lu82/a;",
        "Lq83/j;",
        "cache_release"
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
.field private final a:Lu82/a;

.field private final b:Lq83/j;


# direct methods
.method public constructor <init>(Lu82/a;Lq83/j;)V
    .locals 1

    const-string v0, "bffCacheDeserializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ioDispatcher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqm0/a;->a:Lu82/a;

    iput-object p2, p0, Lqm0/a;->b:Lq83/j;

    return-void
.end method

.method public static final synthetic a(Lqm0/a;)Lu82/a;
    .locals 0

    iget-object p0, p0, Lqm0/a;->a:Lu82/a;

    return-object p0
.end method


# virtual methods
.method public final b(Lne3/l;Ljava/lang/reflect/Type;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lne3/l;",
            "Ljava/lang/reflect/Type;",
            "Lq83/d<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lqm0/a;->b:Lq83/j;

    new-instance v1, Lqm0/a$a;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, p2, v2}, Lqm0/a$a;-><init>(Lne3/l;Lqm0/a;Ljava/lang/reflect/Type;Lq83/d;)V

    invoke-static {v0, v1, p3}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
