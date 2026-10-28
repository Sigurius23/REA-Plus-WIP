.class public final Lny0/q$c;
.super Lny0/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lny0/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lny0/q$c;",
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
.field public static final f:Lny0/q$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lny0/q$c;

    invoke-direct {v0}, Lny0/q$c;-><init>()V

    sput-object v0, Lny0/q$c;->f:Lny0/q$c;

    return-void
.end method

.method private constructor <init>()V
    .locals 10

    const/4 v0, 0x6

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float v3, v0, v1

    mul-float v4, v1, v1

    const/16 v8, 0x1c

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p0

    invoke-direct/range {v2 .. v9}, Lny0/q;-><init>(FFFFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
