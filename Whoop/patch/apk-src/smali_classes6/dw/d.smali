.class public final Ldw/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:D

.field public b:I


# direct methods
.method public constructor <init>(DI)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ldw/d;->a:D

    const-wide/16 v0, 0x0

    cmpl-double p1, p1, v0

    if-lez p1, :cond_0

    iput p3, p0, Ldw/d;->b:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Failed requirement."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
