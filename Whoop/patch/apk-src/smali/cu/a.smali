.class public abstract Lcu/a;
.super Landroid/content/ContentProvider;
.source "SourceFile"


# static fields
.field public static final w:Ldt/a;

.field public static final x:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v5

    new-instance v0, Ldt/a;

    invoke-direct/range {v0 .. v6}, Ldt/a;-><init>(JJJ)V

    sput-object v0, Lcu/a;->w:Ldt/a;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lcu/a;->x:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method
