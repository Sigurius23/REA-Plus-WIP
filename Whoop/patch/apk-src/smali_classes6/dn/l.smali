.class public final Ldn/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ldn/q;

.field public final b:Ldn/t;

.field public final c:Lwm/s;

.field public final d:Lt9/l0;

.field public e:I


# direct methods
.method public constructor <init>(Ldn/q;Ldn/t;Lwm/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldn/l;->a:Ldn/q;

    iput-object p2, p0, Ldn/l;->b:Ldn/t;

    iput-object p3, p0, Ldn/l;->c:Lwm/s;

    iget-object p1, p1, Ldn/q;->f:Lrm/c0;

    iget-object p1, p1, Lrm/c0;->L:Ljava/lang/String;

    const-string p2, "audio/true-hd"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lt9/l0;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Lt9/l0;-><init>(I)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Ldn/l;->d:Lt9/l0;

    return-void
.end method
