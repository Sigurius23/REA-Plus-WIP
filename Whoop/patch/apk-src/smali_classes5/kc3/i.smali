.class public abstract Lkc3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public w:J

.field public x:Z


# direct methods
.method public constructor <init>(JZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lkc3/i;->w:J

    iput-boolean p3, p0, Lkc3/i;->x:Z

    return-void
.end method
