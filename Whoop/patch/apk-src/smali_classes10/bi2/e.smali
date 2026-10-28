.class public abstract Lbi2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u001d\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0002\u0010\u0003\u001a\u0004\u0008\u0002\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "",
        "Llt0/g;",
        "a",
        "Ljava/util/Set;",
        "()Ljava/util/Set;",
        "PROCESSED_DATA_FORMAT_REVISIONS",
        "strap-history-sync_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Llt0/g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Llt0/g;->a:Llt0/g$a;

    const/4 v1, 0x4

    new-array v1, v1, [S

    fill-array-data v1, :array_0

    invoke-virtual {v0, v1}, Llt0/g$a;->a([S)Ljava/util/Set;

    move-result-object v0

    new-instance v1, Llt0/g$c;

    sget-object v2, Lhk0/p;->PROCESSED_RESULTS:Lhk0/p;

    invoke-direct {v1, v2}, Llt0/g$c;-><init>(Lhk0/p;)V

    invoke-static {v1, v0}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object v0

    sput-object v0, Lbi2/e;->a:Ljava/util/Set;

    return-void

    :array_0
    .array-data 2
        0x9s
        0xcs
        0x12s
        0x18s
    .end array-data
.end method

.method public static final a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Llt0/g;",
            ">;"
        }
    .end annotation

    sget-object v0, Lbi2/e;->a:Ljava/util/Set;

    return-object v0
.end method
