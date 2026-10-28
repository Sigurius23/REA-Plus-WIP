.class public final Lmt0/a$b;
.super Lmt0/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmt0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lmt0/a$b;",
        "Lmt0/a;",
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
.field public static final b:Lmt0/a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmt0/a$b;

    invoke-direct {v0}, Lmt0/a$b;-><init>()V

    sput-object v0, Lmt0/a$b;->b:Lmt0/a$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lmt0/a;-><init>(BLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
