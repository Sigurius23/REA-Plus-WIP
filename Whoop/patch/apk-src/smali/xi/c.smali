.class public final Lxi/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxi/f;


# instance fields
.field public final w:Lxi/b;

.field public final x:Lxi/b;


# direct methods
.method public constructor <init>(Lxi/b;Lxi/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxi/c;->w:Lxi/b;

    iput-object p2, p0, Lxi/c;->x:Lxi/b;

    return-void
.end method


# virtual methods
.method public final k0()Lti/d;
    .locals 3

    new-instance v0, Lti/n;

    iget-object v1, p0, Lxi/c;->w:Lxi/b;

    invoke-virtual {v1}, Lxi/b;->H0()Lti/h;

    move-result-object v1

    iget-object v2, p0, Lxi/c;->x:Lxi/b;

    invoke-virtual {v2}, Lxi/b;->H0()Lti/h;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lti/n;-><init>(Lti/h;Lti/h;)V

    return-object v0
.end method

.method public final m0()Ljava/util/List;
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Cannot call getKeyframes on AnimatableSplitDimensionPathValue."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final p0()Z
    .locals 1

    iget-object v0, p0, Lxi/c;->w:Lxi/b;

    invoke-virtual {v0}, Lal/a;->p0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lxi/c;->x:Lxi/b;

    invoke-virtual {v0}, Lal/a;->p0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
