.class public final Lso1/x$e;
.super Lso1/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lso1/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lso1/x$e;",
        "Lso1/x;",
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
.field public static final b:Lso1/x$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lso1/x$e;

    invoke-direct {v0}, Lso1/x$e;-><init>()V

    sput-object v0, Lso1/x$e;->b:Lso1/x$e;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lso1/x;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
