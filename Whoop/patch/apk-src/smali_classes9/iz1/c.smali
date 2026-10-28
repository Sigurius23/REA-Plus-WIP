.class public final Liz1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Liz1/a;",
        "Liz1/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ#\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00082\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Liz1/c;",
        "Lod1/g;",
        "Liz1/a;",
        "Liz1/b;",
        "Lgz1/a;",
        "detectionSource",
        "<init>",
        "(Lgz1/a;)V",
        "Lec3/l;",
        "Liz1/d;",
        "e",
        "()Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lgz1/a;",
        "motion-tracking-sandbox_release"
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
.field private final a:Lgz1/a;


# direct methods
.method public constructor <init>(Lgz1/a;)V
    .locals 1

    const-string v0, "detectionSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Liz1/c;->a:Lgz1/a;

    return-void
.end method

.method public static final synthetic c(Liz1/c;)Lgz1/a;
    .locals 0

    iget-object p0, p0, Liz1/c;->a:Lgz1/a;

    return-object p0
.end method

.method public static final synthetic d(Liz1/c;)Lec3/l;
    .locals 0

    invoke-direct {p0}, Liz1/c;->e()Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final e()Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Liz1/c$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Liz1/c$c;-><init>(Liz1/c;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object v1
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

    new-instance v0, Liz1/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Liz1/c$a;-><init>(Lq83/d;Liz1/c;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v0, Liz1/b;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v1, v2, v1}, Liz1/b;-><init>(Liz1/e;Lgz1/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Liz1/c$b;

    invoke-direct {v2, v1}, Liz1/c$b;-><init>(Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v0, p1, v2}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v1
.end method
