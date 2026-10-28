.class public Ln4/h;
.super Ln4/g;
.source "SourceFile"


# instance fields
.field public m:I


# direct methods
.method public constructor <init>(Ln4/p;)V
    .locals 0

    invoke-direct {p0, p1}, Ln4/g;-><init>(Ln4/p;)V

    instance-of p1, p1, Ln4/l;

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    iput p1, p0, Ln4/g;->e:I

    return-void

    :cond_0
    const/4 p1, 0x3

    iput p1, p0, Ln4/g;->e:I

    return-void
.end method


# virtual methods
.method public final d(I)V
    .locals 1

    iget-boolean v0, p0, Ln4/g;->j:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Ln4/g;->j:Z

    iput p1, p0, Ln4/g;->g:I

    iget-object p1, p0, Ln4/g;->k:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln4/e;

    invoke-interface {v0, v0}, Ln4/e;->a(Ln4/e;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method
