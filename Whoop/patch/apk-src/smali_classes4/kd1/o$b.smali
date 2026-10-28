.class public final Lkd1/o$b;
.super Lkd1/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkd1/o;
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
        "Lkd1/o$b;",
        "Lkd1/o;",
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
.field public static final b:Lkd1/o$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkd1/o$b;

    invoke-direct {v0}, Lkd1/o$b;-><init>()V

    sput-object v0, Lkd1/o$b;->b:Lkd1/o$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkd1/o;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
