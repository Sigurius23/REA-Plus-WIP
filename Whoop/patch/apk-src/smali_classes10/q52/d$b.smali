.class public Lq52/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq52/d$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq52/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:F


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lq52/d$b;->a:F

    return-void
.end method


# virtual methods
.method public a(II)F
    .locals 0

    mul-int/2addr p1, p1

    mul-int/2addr p2, p2

    add-int/2addr p2, p1

    int-to-double p1, p2

    invoke-static {p1, p2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p1

    double-to-float p1, p1

    iget p2, p0, Lq52/d$b;->a:F

    mul-float/2addr p1, p2

    return p1
.end method
