.class public final Loy2/l$h;
.super Loy2/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Loy2/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Loy2/l$h;",
        "Loy2/l;",
        "<init>",
        "()V",
        "whooplabs_release"
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
.field public static final a:Loy2/l$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Loy2/l$h;

    invoke-direct {v0}, Loy2/l$h;-><init>()V

    sput-object v0, Loy2/l$h;->a:Loy2/l$h;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Loy2/l;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
