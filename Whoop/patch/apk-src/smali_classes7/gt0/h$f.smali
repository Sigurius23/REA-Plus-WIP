.class public final Lgt0/h$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgt0/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgt0/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lgt0/h$f;",
        "Lgt0/h;",
        "<init>",
        "()V",
        "connectivity-core_release"
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
.field public static final b:Lgt0/h$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgt0/h$f;

    invoke-direct {v0}, Lgt0/h$f;-><init>()V

    sput-object v0, Lgt0/h$f;->b:Lgt0/h$f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
