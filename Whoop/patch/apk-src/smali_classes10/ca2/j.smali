.class public final Lca2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lts0/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lca2/j$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lca2/j;",
        "Lts0/a;",
        "Lca2/f;",
        "historySyncRouter",
        "<init>",
        "(Lca2/f;)V",
        "Lts0/d;",
        "request",
        "Lec3/l;",
        "Lts0/c;",
        "a",
        "(Lts0/d;)Lec3/l;",
        "Lca2/f;",
        "b",
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
.field public static final b:Lca2/j$a;


# instance fields
.field private final a:Lca2/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lca2/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lca2/j$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lca2/j;->b:Lca2/j$a;

    return-void
.end method

.method public constructor <init>(Lca2/f;)V
    .locals 1

    const-string v0, "historySyncRouter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lca2/j;->a:Lca2/f;

    return-void
.end method


# virtual methods
.method public a(Lts0/d;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lts0/d;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lca2/j;->a:Lca2/f;

    const-string v1, "StrapAndAppSync"

    invoke-interface {v0, v1}, Lca2/f;->e(Ljava/lang/String;)Lec3/l;

    move-result-object v0

    new-instance v1, Lca2/j$b;

    invoke-direct {v1, v0, p1}, Lca2/j$b;-><init>(Lec3/l;Lts0/d;)V

    return-object v1
.end method
