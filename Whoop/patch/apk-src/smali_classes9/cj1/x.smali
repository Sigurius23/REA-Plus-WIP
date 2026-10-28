.class public abstract Lcj1/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0008\" \u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0002\u0010\u0003\u001a\u0004\u0008\u0002\u0010\u0004\" \u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0003\u001a\u0004\u0008\u0007\u0010\u0004\u00a8\u0006\t"
    }
    d2 = {
        "",
        "Lsl1/b;",
        "a",
        "Ljava/util/Set;",
        "()Ljava/util/Set;",
        "stickyConnectivityNonFWUpdateTypes",
        "b",
        "getStickyConnectivityFWUpdateTypes",
        "stickyConnectivityFWUpdateTypes",
        "health_release"
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
            "Lsl1/b;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lsl1/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/4 v0, 0x4

    new-array v1, v0, [Lsl1/b;

    sget-object v2, Lsl1/b$n;->o:Lsl1/b$n;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lsl1/b$q;->o:Lsl1/b$q;

    const/4 v4, 0x1

    aput-object v2, v1, v4

    sget-object v2, Lsl1/b$a;->o:Lsl1/b$a;

    const/4 v5, 0x2

    aput-object v2, v1, v5

    sget-object v2, Lsl1/b$r;->o:Lsl1/b$r;

    const/4 v6, 0x3

    aput-object v2, v1, v6

    invoke-static {v1}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    sput-object v1, Lcj1/x;->a:Ljava/util/Set;

    const/4 v1, 0x6

    new-array v1, v1, [Lsl1/b;

    sget-object v2, Lsl1/b$k;->o:Lsl1/b$k;

    aput-object v2, v1, v3

    sget-object v2, Lsl1/b$m;->o:Lsl1/b$m;

    aput-object v2, v1, v4

    sget-object v2, Lsl1/b$l;->o:Lsl1/b$l;

    aput-object v2, v1, v5

    sget-object v2, Lsl1/b$i;->o:Lsl1/b$i;

    aput-object v2, v1, v6

    sget-object v2, Lsl1/b$j;->o:Lsl1/b$j;

    aput-object v2, v1, v0

    sget-object v0, Lsl1/b$h;->o:Lsl1/b$h;

    const/4 v2, 0x5

    aput-object v0, v1, v2

    invoke-static {v1}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcj1/x;->b:Ljava/util/Set;

    return-void
.end method

.method public static final a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lsl1/b;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcj1/x;->a:Ljava/util/Set;

    return-object v0
.end method
