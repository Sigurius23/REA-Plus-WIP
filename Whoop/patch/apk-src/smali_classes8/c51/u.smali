.class final Lc51/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lc51/u;",
        "",
        "<init>",
        "()V",
        "Ld51/d;",
        "b",
        "Ld51/d;",
        "a",
        "()Ld51/d;",
        "alphaRange",
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


# static fields
.field public static final a:Lc51/u;

.field private static final b:Ld51/d;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lc51/u;

    invoke-direct {v0}, Lc51/u;-><init>()V

    sput-object v0, Lc51/u;->a:Lc51/u;

    new-instance v0, Ld51/d;

    new-instance v1, Ld51/b;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Ld51/b;-><init>(FFLd0/z;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Ld51/b;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Ld51/b;-><init>(FFLd0/z;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v1, v2}, [Ld51/b;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ld51/d;-><init>(Ljava/util/List;)V

    sput-object v0, Lc51/u;->b:Ld51/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ld51/d;
    .locals 1

    sget-object v0, Lc51/u;->b:Ld51/d;

    return-object v0
.end method
