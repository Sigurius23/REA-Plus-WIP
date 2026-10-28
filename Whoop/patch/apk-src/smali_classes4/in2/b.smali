.class public final Lin2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lin2/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lin2/h<",
        "Lxg3/k;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u00c6\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004R\u001a\u0010\u0008\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0005\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0006\u001a\u0004\u0008\n\u0010\u0007R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0006\u001a\u0004\u0008\r\u0010\u0007\u00a8\u0006\u000f"
    }
    d2 = {
        "Lin2/b;",
        "Lin2/h;",
        "Lxg3/k;",
        "<init>",
        "()V",
        "b",
        "Lxg3/k;",
        "()Lxg3/k;",
        "main",
        "c",
        "getIo",
        "io",
        "d",
        "getComputation",
        "computation",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lin2/b;

.field private static final b:Lxg3/k;

.field private static final c:Lxg3/k;

.field private static final d:Lxg3/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lin2/b;

    invoke-direct {v0}, Lin2/b;-><init>()V

    sput-object v0, Lin2/b;->a:Lin2/b;

    invoke-static {}, Lzg3/a;->a()Leh3/j;

    move-result-object v0

    const-string v1, "mainThread(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lin2/b;->b:Lxg3/k;

    invoke-static {}, Lkh3/a;->a()Lkh3/a;

    move-result-object v0

    iget-object v0, v0, Lkh3/a;->b:Leh3/e;

    const-string v1, "io(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lin2/b;->c:Lxg3/k;

    invoke-static {}, Lkh3/a;->a()Lkh3/a;

    move-result-object v0

    iget-object v0, v0, Lkh3/a;->a:Leh3/i;

    const-string v1, "computation(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lin2/b;->d:Lxg3/k;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lin2/b;->b()Lxg3/k;

    move-result-object v0

    return-object v0
.end method

.method public b()Lxg3/k;
    .locals 1

    sget-object v0, Lin2/b;->b:Lxg3/k;

    return-object v0
.end method
