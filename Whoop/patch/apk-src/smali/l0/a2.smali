.class public final Ll0/a2;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/d2;


# instance fields
.field public O:Lb2/l;


# virtual methods
.method public final Y(Ly3/c;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

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
    iget-object p1, p0, Ll0/a2;->O:Lb2/l;

    new-instance v0, Ll0/d0;

    invoke-direct {v0, p1}, Ll0/d0;-><init>(Lb2/g;)V

    iput-object v0, p2, Ll0/o1;->c:Ll0/f;

    return-object p2
.end method
