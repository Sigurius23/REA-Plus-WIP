.class public final Lrr2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrr2/i;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lrr2/b;",
        "Lrr2/i;",
        "<init>",
        "()V",
        "Lio/sentry/y3;",
        "context",
        "",
        "a",
        "(Lio/sentry/y3;)D",
        "app_prodStandardRelease"
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
.field public static final a:Lrr2/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lrr2/b;

    invoke-direct {v0}, Lrr2/b;-><init>()V

    sput-object v0, Lrr2/b;->a:Lrr2/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lio/sentry/y3;)D
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/high16 v0, 0x3fd0000000000000L    # 0.25

    return-wide v0
.end method
