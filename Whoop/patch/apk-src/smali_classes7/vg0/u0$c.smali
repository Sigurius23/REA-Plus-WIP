.class public final Lvg0/u0$c;
.super Lvg0/u0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvg0/u0;
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
        "Lvg0/u0$c;",
        "Lvg0/u0;",
        "<init>",
        "()V",
        "bot_release"
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
.field public static final a:Lvg0/u0$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lvg0/u0$c;

    invoke-direct {v0}, Lvg0/u0$c;-><init>()V

    sput-object v0, Lvg0/u0$c;->a:Lvg0/u0$c;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lvg0/u0;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
