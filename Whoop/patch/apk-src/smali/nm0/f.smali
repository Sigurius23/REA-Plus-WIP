.class public final Lnm0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnm0/e;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJE\u0010\u0017\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u00160\u0015\"\u0004\u0008\u0000\u0010\u000e\"\u0004\u0008\u0001\u0010\u000f2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!\u00a8\u0006\""
    }
    d2 = {
        "Lnm0/f;",
        "Lnm0/e;",
        "Lym0/a;",
        "cacheStream",
        "Lnm0/b;",
        "apiStream",
        "Lnm0/d;",
        "cacheResultCombiner",
        "Lwm0/a;",
        "scopeCoordinator",
        "Lsr2/y;",
        "urlProvider",
        "<init>",
        "(Lym0/a;Lnm0/b;Lnm0/d;Lwm0/a;Lsr2/y;)V",
        "RequestBodyT",
        "ResponseT",
        "Lnm0/c;",
        "request",
        "Ls63/a;",
        "requestBodyTypeInfo",
        "responseTypeInfo",
        "Lec3/l;",
        "Lpm0/a;",
        "a",
        "(Lnm0/c;Ls63/a;Ls63/a;)Lec3/l;",
        "Lym0/a;",
        "b",
        "Lnm0/b;",
        "c",
        "Lnm0/d;",
        "d",
        "Lwm0/a;",
        "e",
        "Lsr2/y;",
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
.field private final a:Lym0/a;

.field private final b:Lnm0/b;

.field private final c:Lnm0/d;

.field private final d:Lwm0/a;

.field private final e:Lsr2/y;


# direct methods
.method public constructor <init>(Lym0/a;Lnm0/b;Lnm0/d;Lwm0/a;Lsr2/y;)V
    .locals 1

    const-string v0, "cacheStream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiStream"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cacheResultCombiner"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeCoordinator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "urlProvider"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnm0/f;->a:Lym0/a;

    iput-object p2, p0, Lnm0/f;->b:Lnm0/b;

    iput-object p3, p0, Lnm0/f;->c:Lnm0/d;

    iput-object p4, p0, Lnm0/f;->d:Lwm0/a;

    iput-object p5, p0, Lnm0/f;->e:Lsr2/y;

    return-void
.end method


# virtual methods
.method public a(Lnm0/c;Ls63/a;Ls63/a;)Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<RequestBodyT:",
            "Ljava/lang/Object;",
            "ResponseT:",
            "Ljava/lang/Object;",
            ">(",
            "Lnm0/c<",
            "TRequestBodyT;>;",
            "Ls63/a;",
            "Ls63/a;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestBodyTypeInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "responseTypeInfo"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lnm0/f;->d:Lwm0/a;

    invoke-virtual {v0}, Lwm0/a;->a()Lec3/t1;

    move-result-object v0

    new-instance v1, Lnm0/f$a;

    invoke-direct {v1, v0, p1}, Lnm0/f$a;-><init>(Lec3/l;Lnm0/c;)V

    new-instance v0, Lnm0/f$b;

    invoke-direct {v0, v1, p1}, Lnm0/f$b;-><init>(Lec3/l;Lnm0/c;)V

    new-instance v1, Lnm0/f$c;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lnm0/f$c;-><init>(Lnm0/c;Lq83/d;)V

    new-instance v2, Lec3/a0;

    invoke-direct {v2, v1, v0}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    iget-object v0, p0, Lnm0/f;->b:Lnm0/b;

    invoke-virtual {v0, v2, p2, p3, p1}, Lnm0/b;->i(Lec3/l;Ls63/a;Ls63/a;Lnm0/c;)Lec3/l;

    move-result-object p2

    iget-object v0, p0, Lnm0/f;->a:Lym0/a;

    iget-object v1, p0, Lnm0/f;->e:Lsr2/y;

    invoke-virtual {p1, v1}, Lnm0/c;->d(Lsr2/y;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lym0/a;->c(Ljava/lang/String;)Lec3/l;

    move-result-object p1

    iget-object v0, p0, Lnm0/f;->c:Lnm0/d;

    invoke-virtual {v0, p3, p2, p1}, Lnm0/d;->c(Ls63/a;Lec3/l;Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method
