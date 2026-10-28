.class public final Lde2/f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lde2/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lde2/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lde2/f$b;",
        "Lde2/f;",
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
.field public static final a:Lde2/f$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lde2/f$b;

    invoke-direct {v0}, Lde2/f$b;-><init>()V

    sput-object v0, Lde2/f$b;->a:Lde2/f$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
