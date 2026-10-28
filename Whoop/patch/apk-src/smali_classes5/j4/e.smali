.class public final Lj4/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj4/d;


# instance fields
.field public final a:F

.field public b:F


# direct methods
.method public constructor <init>(FF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lj4/e;->a:F

    iput p1, p0, Lj4/e;->b:F

    return-void
.end method


# virtual methods
.method public final value()F
    .locals 2

    iget v0, p0, Lj4/e;->b:F

    iget v1, p0, Lj4/e;->a:F

    add-float/2addr v0, v1

    iput v0, p0, Lj4/e;->b:F

    return v0
.end method
