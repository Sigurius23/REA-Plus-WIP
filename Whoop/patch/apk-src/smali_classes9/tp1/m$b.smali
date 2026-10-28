.class public final Ltp1/m$b;
.super Ltp1/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltp1/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Ltp1/m$b;",
        "Ltp1/m;",
        "<init>",
        "()V",
        "hormonal-insights_release"
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
.field public static final a:Ltp1/m$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltp1/m$b;

    invoke-direct {v0}, Ltp1/m$b;-><init>()V

    sput-object v0, Ltp1/m$b;->a:Ltp1/m$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ltp1/m;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
