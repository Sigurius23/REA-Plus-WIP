.class public final Lvj1/a$e;
.super Lvj1/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvj1/a;
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
        "Lvj1/a$e;",
        "Lvj1/a;",
        "<init>",
        "()V",
        "health-monitor_release"
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
.field public static final b:Lvj1/a$e;

.field public static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lvj1/a$e;

    invoke-direct {v0}, Lvj1/a$e;-><init>()V

    sput-object v0, Lvj1/a$e;->b:Lvj1/a$e;

    const/16 v0, 0x8

    sput v0, Lvj1/a$e;->c:I

    return-void
.end method

.method private constructor <init>()V
    .locals 8

    new-instance v0, Lvj1/d;

    const-string v1, "Share"

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string v1, "toLowerCase(...)"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x18

    const/4 v7, 0x0

    const-string v1, "sharing"

    const-string v3, "share_report"

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Lvj1/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lvj1/a;-><init>(Lvj1/d;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
