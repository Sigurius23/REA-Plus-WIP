.class public final Lts0/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lts0/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lts0/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lts0/f$a;",
        "Lts0/f;",
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
.field public static final a:Lts0/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lts0/f$a;

    invoke-direct {v0}, Lts0/f$a;-><init>()V

    sput-object v0, Lts0/f$a;->a:Lts0/f$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
