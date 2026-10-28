.class public final Lfo/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:F

.field public c:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(FII)V
    .locals 0

    .line 2
    iput p1, p0, Lfo/c;->b:F

    iput p2, p0, Lfo/c;->a:I

    iput p3, p0, Lfo/c;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
