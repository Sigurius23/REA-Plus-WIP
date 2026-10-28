.class public abstract Lrx/internal/util/unsafe/i;
.super Lrx/internal/util/unsafe/f;
.source "SourceFile"


# static fields
.field public static final G:J


# instance fields
.field protected producerIndex:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lrx/internal/util/unsafe/i;

    const-string v1, "producerIndex"

    invoke-static {v0, v1}, Lrx/internal/util/unsafe/j;->a(Ljava/lang/Class;Ljava/lang/String;)J

    move-result-wide v0

    sput-wide v0, Lrx/internal/util/unsafe/i;->G:J

    return-void
.end method
