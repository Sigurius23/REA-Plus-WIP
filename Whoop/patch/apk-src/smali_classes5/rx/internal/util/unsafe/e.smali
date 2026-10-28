.class public abstract Lrx/internal/util/unsafe/e;
.super Lrx/internal/util/unsafe/g;
.source "SourceFile"


# static fields
.field public static final H:J


# instance fields
.field protected consumerIndex:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lrx/internal/util/unsafe/e;

    const-string v1, "consumerIndex"

    invoke-static {v0, v1}, Lrx/internal/util/unsafe/j;->a(Ljava/lang/Class;Ljava/lang/String;)J

    move-result-wide v0

    sput-wide v0, Lrx/internal/util/unsafe/e;->H:J

    return-void
.end method
