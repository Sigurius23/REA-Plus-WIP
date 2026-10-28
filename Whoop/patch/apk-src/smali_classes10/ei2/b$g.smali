.class public final Lei2/b$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lei2/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lei2/b;
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
        "Lei2/b$g;",
        "Lei2/b;",
        "<init>",
        "()V",
        "strava_release"
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
.field public static final a:Lei2/b$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lei2/b$g;

    invoke-direct {v0}, Lei2/b$g;-><init>()V

    sput-object v0, Lei2/b$g;->a:Lei2/b$g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
