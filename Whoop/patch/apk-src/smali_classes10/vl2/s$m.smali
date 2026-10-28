.class public final Lvl2/s$m;
.super Lvl2/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvl2/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "m"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lvl2/s$m;",
        "Lvl2/s;",
        "<init>",
        "()V",
        "trends_release"
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
.field public static final a:Lvl2/s$m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lvl2/s$m;

    invoke-direct {v0}, Lvl2/s$m;-><init>()V

    sput-object v0, Lvl2/s$m;->a:Lvl2/s$m;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lvl2/s;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
