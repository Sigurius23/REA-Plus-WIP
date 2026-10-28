.class public final Llf2/k$e;
.super Llf2/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llf2/k;
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
        "Llf2/k$e;",
        "Llf2/k;",
        "<init>",
        "()V",
        "sleep-coach_release"
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
.field public static final a:Llf2/k$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Llf2/k$e;

    invoke-direct {v0}, Llf2/k$e;-><init>()V

    sput-object v0, Llf2/k$e;->a:Llf2/k$e;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Llf2/k;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
