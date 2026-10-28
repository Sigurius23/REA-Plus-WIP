.class final Lc51/z;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u000b\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0006\u001a\u0004\u0008\n\u0010\u0008R\u0017\u0010\r\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0006\u001a\u0004\u0008\u0005\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "Lc51/z;",
        "",
        "<init>",
        "()V",
        "Ld51/d;",
        "b",
        "Ld51/d;",
        "c",
        "()Ld51/d;",
        "yearsDifferenceTextSizeMultiplierRange",
        "a",
        "nonYearsDifferenceTextAlphaRange",
        "d",
        "yearsDifferenceTextHeightRange",
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
.field public static final a:Lc51/z;

.field private static final b:Ld51/d;

.field private static final c:Ld51/d;

.field private static final d:Ld51/d;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, Lc51/z;

    invoke-direct {v0}, Lc51/z;-><init>()V

    sput-object v0, Lc51/z;->a:Lc51/z;

    new-instance v0, Ld51/d;

    new-instance v1, Ld51/b;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Ld51/b;-><init>(FFLd0/z;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Ld51/b;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const v3, 0x3dcccccd    # 0.1f

    const v4, 0x3fc51eb8    # 1.54f

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Ld51/b;-><init>(FFLd0/z;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Ld51/b;

    const v4, 0x3f970a3d    # 1.18f

    sget-object v5, Ld0/a0;->c:Ld0/v;

    const v6, 0x3f1c28f6    # 0.61f

    invoke-direct {v3, v6, v4, v5}, Ld51/b;-><init>(FFLd0/z;)V

    new-instance v4, Ld51/b;

    const v5, 0x3fc51eb8    # 1.54f

    sget-object v6, Ld0/a0;->e:Ld0/v;

    const v7, 0x3f28f5c3    # 0.66f

    invoke-direct {v4, v7, v5, v6}, Ld51/b;-><init>(FFLd0/z;)V

    new-instance v8, Ld51/b;

    const/4 v12, 0x4

    const/4 v13, 0x0

    const/high16 v9, 0x3f800000    # 1.0f

    const/high16 v10, 0x3f800000    # 1.0f

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Ld51/b;-><init>(FFLd0/z;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v1, v2, v3, v4, v8}, [Ld51/b;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ld51/d;-><init>(Ljava/util/List;)V

    sput-object v0, Lc51/z;->b:Ld51/d;

    new-instance v0, Ld51/d;

    new-instance v1, Ld51/b;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Ld51/b;-><init>(FFLd0/z;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Ld51/b;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const v3, 0x3d4ccccd    # 0.05f

    const v4, 0x3dcccccd    # 0.1f

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Ld51/b;-><init>(FFLd0/z;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Ld51/b;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const v4, 0x3f733333    # 0.95f

    const v5, 0x3dcccccd    # 0.1f

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Ld51/b;-><init>(FFLd0/z;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Ld51/b;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Ld51/b;-><init>(FFLd0/z;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v1, v2, v3, v4}, [Ld51/b;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ld51/d;-><init>(Ljava/util/List;)V

    sput-object v0, Lc51/z;->c:Ld51/d;

    new-instance v0, Ld51/d;

    new-instance v1, Ld51/b;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Ld51/b;-><init>(FFLd0/z;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Ld51/b;

    sget-object v3, Ld0/a0;->b:Ld0/v;

    const v4, 0x3dcccccd    # 0.1f

    const/high16 v5, 0x42a00000    # 80.0f

    invoke-direct {v2, v4, v5, v3}, Ld51/b;-><init>(FFLd0/z;)V

    new-instance v6, Ld51/b;

    const/4 v10, 0x4

    const v7, 0x3f35c290    # 0.71000004f

    const/high16 v8, 0x42a00000    # 80.0f

    invoke-direct/range {v6 .. v11}, Ld51/b;-><init>(FFLd0/z;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Ld51/b;

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v7, 0x0

    invoke-direct {v4, v5, v7, v3}, Ld51/b;-><init>(FFLd0/z;)V

    filled-new-array {v1, v2, v6, v4}, [Ld51/b;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ld51/d;-><init>(Ljava/util/List;)V

    sput-object v0, Lc51/z;->d:Ld51/d;

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

    sget-object v0, Lc51/z;->c:Ld51/d;

    return-object v0
.end method

.method public final b()Ld51/d;
    .locals 1

    sget-object v0, Lc51/z;->d:Ld51/d;

    return-object v0
.end method

.method public final c()Ld51/d;
    .locals 1

    sget-object v0, Lc51/z;->b:Ld51/d;

    return-object v0
.end method
