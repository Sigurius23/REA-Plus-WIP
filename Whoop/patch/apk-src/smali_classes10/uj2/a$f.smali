.class public final Luj2/a$f;
.super Luj2/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Luj2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Luj2/a$f;",
        "Luj2/a;",
        "<init>",
        "()V",
        "tilt-graph_release"
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
.field public static final a:Luj2/a$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Luj2/a$f;

    invoke-direct {v0}, Luj2/a$f;-><init>()V

    sput-object v0, Luj2/a$f;->a:Luj2/a$f;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Luj2/a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
