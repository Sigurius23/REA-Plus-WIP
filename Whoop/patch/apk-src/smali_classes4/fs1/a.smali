.class public final Lfs1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lfs1/b;",
        "Lfs1/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001d\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ#\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000c2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lfs1/a;",
        "Lod1/g;",
        "Lfs1/b;",
        "Lfs1/c;",
        "Lfs1/d;",
        "refreshHook",
        "Lnm0/e;",
        "cachedApiSource",
        "<init>",
        "(Lfs1/d;Lnm0/e;)V",
        "La12/a;",
        "parsedPath",
        "Lec3/l;",
        "d",
        "(La12/a;)Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lfs1/d;",
        "b",
        "Lnm0/e;",
        "journal-home-tile-mini-arch_release"
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
.field private final a:Lfs1/d;

.field private final b:Lnm0/e;


# direct methods
.method public constructor <init>(Lfs1/d;Lnm0/e;)V
    .locals 1

    const-string v0, "refreshHook"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cachedApiSource"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfs1/a;->a:Lfs1/d;

    iput-object p2, p0, Lfs1/a;->b:Lnm0/e;

    return-void
.end method

.method public static final synthetic c(Lfs1/a;La12/a;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lfs1/a;->d(La12/a;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final d(La12/a;)Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La12/a;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/journalhometile/api/JournalHomeTileGetRequest;

    invoke-virtual {p1}, La12/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, La12/a;->b()Ljava/util/Map;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/whoop/journalhometile/api/JournalHomeTileGetRequest;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    new-instance p1, La6/u;

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1}, La6/u;-><init>(Ljava/lang/Object;I)V

    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-static {p1, v1, v1, v0, v1}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object p1

    iget-object v0, p0, Lfs1/a;->b:Lnm0/e;

    new-instance v2, Lfs1/a$a;

    invoke-direct {v2, v1, v0}, Lfs1/a$a;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {p1, v2}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v0, Lfs1/a$b;

    invoke-direct {v0, p1}, Lfs1/a$b;-><init>(Lec3/l;)V

    return-object v0
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lfs1/a;->a:Lfs1/d;

    invoke-virtual {v0}, Lfs1/d;->a()Lec3/t1;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lec3/l;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    invoke-static {p1, v1}, Lor2/e0;->a(Lec3/l;[Lec3/l;)Lec3/l;

    move-result-object p1

    new-instance v0, Lfs1/a$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lfs1/a$c;-><init>(Lq83/d;Lfs1/a;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
