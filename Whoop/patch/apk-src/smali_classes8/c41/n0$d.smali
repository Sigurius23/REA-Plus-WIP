.class public final Lc41/n0$d;
.super Lc41/n0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc41/n0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lc41/n0$d;",
        "Lc41/n0;",
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
.field public static final d:Lc41/n0$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc41/n0$d;

    invoke-direct {v0}, Lc41/n0$d;-><init>()V

    sput-object v0, Lc41/n0$d;->d:Lc41/n0$d;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    sget v0, Lgy0/a;->M:I

    sget-object v1, Ly81/f;->ACCENT_ACTION:Ly81/f;

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v1, v2}, Lc41/n0;-><init>(ILy81/f;Ly81/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
