.class public final Lny0/q$g;
.super Lny0/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lny0/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lny0/q$g;",
        "Lny0/q;",
        "<init>",
        "()V",
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
.field public static final f:Lny0/q$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lny0/q$g;

    invoke-direct {v0}, Lny0/q$g;-><init>()V

    sput-object v0, Lny0/q$g;->f:Lny0/q$g;

    return-void
.end method

.method private constructor <init>()V
    .locals 9

    const/4 v0, 0x6

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float v3, v0, v1

    const/4 v0, 0x3

    int-to-float v0, v0

    mul-float v4, v0, v1

    const/4 v0, 0x5

    int-to-float v0, v0

    mul-float v5, v0, v1

    invoke-static {}, Lz81/d;->q()Lz81/b;

    move-result-object v0

    invoke-virtual {v0}, Lz81/b;->d()Lf0/t;

    move-result-object v0

    iget v6, v0, Lf0/t;->a:F

    const/4 v7, 0x1

    const/4 v8, 0x0

    move-object v2, p0

    invoke-direct/range {v2 .. v8}, Lny0/q;-><init>(FFFFZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
