.class public final Lch3/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxg3/f;


# instance fields
.field public final w:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lch3/h0;->w:Z

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lxg3/s;

    new-instance v0, Lch3/g0;

    iget-boolean v1, p0, Lch3/h0;->w:Z

    invoke-direct {v0, p1, v1}, Lch3/g0;-><init>(Lxg3/s;Z)V

    new-instance v1, Lch3/f0;

    invoke-direct {v1, v0}, Lch3/f0;-><init>(Lch3/g0;)V

    iput-object v1, v0, Lch3/g0;->H:Lch3/f0;

    invoke-virtual {p1, v0}, Lxg3/s;->c(Lxg3/t;)V

    invoke-virtual {p1, v1}, Lxg3/s;->f(Lxg3/i;)V

    return-object v0
.end method
