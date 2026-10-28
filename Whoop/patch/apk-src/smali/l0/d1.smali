.class public final Ll0/d1;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/d2;


# instance fields
.field public O:F

.field public P:Z


# virtual methods
.method public final Y(Ly3/c;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    instance-of p1, p2, Ll0/o1;

    if-eqz p1, :cond_0

    check-cast p2, Ll0/o1;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_1

    new-instance p2, Ll0/o1;

    invoke-direct {p2}, Ll0/o1;-><init>()V

    :cond_1
    iget p1, p0, Ll0/d1;->O:F

    iput p1, p2, Ll0/o1;->a:F

    iget-boolean p1, p0, Ll0/d1;->P:Z

    iput-boolean p1, p2, Ll0/o1;->b:Z

    return-object p2
.end method
