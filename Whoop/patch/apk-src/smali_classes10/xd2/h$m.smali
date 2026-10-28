.class public final Lxd2/h$m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxd2/h$p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxd2/h;
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
        "Lxd2/h$m;",
        "Lxd2/h$p;",
        "<init>",
        "()V",
        "shepherd_release"
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
.field public static final a:Lxd2/h$m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxd2/h$m;

    invoke-direct {v0}, Lxd2/h$m;-><init>()V

    sput-object v0, Lxd2/h$m;->a:Lxd2/h$m;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
