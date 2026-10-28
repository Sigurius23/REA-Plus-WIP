.class public final Lpx2/g$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpx2/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpx2/g;
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
        "Lpx2/g$c;",
        "Lpx2/g;",
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
.field public static final a:Lpx2/g$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpx2/g$c;

    invoke-direct {v0}, Lpx2/g$c;-><init>()V

    sput-object v0, Lpx2/g$c;->a:Lpx2/g$c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge a()Lpx2/b;
    .locals 1

    invoke-super {p0}, Lpx2/g;->a()Lpx2/b;

    move-result-object v0

    return-object v0
.end method
