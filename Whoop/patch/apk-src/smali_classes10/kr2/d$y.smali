.class public final Lkr2/d$y;
.super Lkr2/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkr2/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "y"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lkr2/d$y;",
        "Lkr2/d;",
        "<init>",
        "()V",
        "Llq2/p$a$d;",
        "b",
        "()Llq2/p$a$d;",
        "user-journey_release"
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
.field public static final b:Lkr2/d$y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkr2/d$y;

    invoke-direct {v0}, Lkr2/d$y;-><init>()V

    sput-object v0, Lkr2/d$y;->b:Lkr2/d$y;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    sget-object v0, Llq2/f;->SECONDARY:Llq2/f;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lkr2/d;-><init>(Llq2/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Llq2/p$a;
    .locals 1

    invoke-virtual {p0}, Lkr2/d$y;->b()Llq2/p$a$d;

    move-result-object v0

    return-object v0
.end method

.method public b()Llq2/p$a$d;
    .locals 9

    new-instance v0, Llq2/p$a$d;

    invoke-static {}, Lkr2/e;->P()J

    move-result-wide v1

    const/16 v7, 0x1e

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Llq2/p$a$d;-><init>(JFFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
