.class public final Lny0/v0$b;
.super Lny0/v0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lny0/v0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lny0/v0$b;",
        "Lny0/v0;",
        "<init>",
        "()V",
        "Ll0/k1;",
        "e",
        "Ll0/k1;",
        "a",
        "()Ll0/k1;",
        "padding",
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
.field public static final d:Lny0/v0$b;

.field private static final e:Ll0/k1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lny0/v0$b;

    invoke-direct {v0}, Lny0/v0$b;-><init>()V

    sput-object v0, Lny0/v0$b;->d:Lny0/v0$b;

    const-wide/high16 v0, 0x3ff8000000000000L    # 1.5

    double-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr v0, v1

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Landroidx/compose/foundation/layout/a;->a(FFI)Ll0/l1;

    move-result-object v0

    sput-object v0, Lny0/v0$b;->e:Ll0/k1;

    return-void
.end method

.method private constructor <init>()V
    .locals 7

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->r()Lb91/a;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lny0/v0;-><init>(Lb91/a;Lb91/a;Lb91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public a()Ll0/k1;
    .locals 1

    sget-object v0, Lny0/v0$b;->e:Ll0/k1;

    return-object v0
.end method
