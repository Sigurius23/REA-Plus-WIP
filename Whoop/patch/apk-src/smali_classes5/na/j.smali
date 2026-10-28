.class public final Lna/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lna/o;

.field public final b:Lna/q;

.field public final c:Lt9/k0;

.field public final d:Lt9/l0;

.field public e:I


# direct methods
.method public constructor <init>(Lna/o;Lna/q;Lt9/k0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lna/j;->a:Lna/o;

    iput-object p2, p0, Lna/j;->b:Lna/q;

    iput-object p3, p0, Lna/j;->c:Lt9/k0;

    iget-object p1, p1, Lna/o;->g:Lu8/p;

    iget-object p1, p1, Lu8/p;->n:Ljava/lang/String;

    const-string p2, "audio/true-hd"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lt9/l0;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lt9/l0;-><init>(I)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lna/j;->d:Lt9/l0;

    return-void
.end method
