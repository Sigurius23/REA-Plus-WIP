.class public final Ll9/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/b1;


# instance fields
.field public final w:Ll9/b1;

.field public final x:Lzr/g0;


# direct methods
.method public constructor <init>(Ll9/b1;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/k;->w:Ll9/b1;

    invoke-static {p2}, Lzr/g0;->m(Ljava/util/Collection;)Lzr/g0;

    move-result-object p1

    iput-object p1, p0, Ll9/k;->x:Lzr/g0;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, Ll9/k;->w:Ll9/b1;

    invoke-interface {v0}, Ll9/b1;->a()Z

    move-result v0

    return v0
.end method

.method public final d()J
    .locals 2

    iget-object v0, p0, Ll9/k;->w:Ll9/b1;

    invoke-interface {v0}, Ll9/b1;->d()J

    move-result-wide v0

    return-wide v0
.end method

.method public final m()J
    .locals 2

    iget-object v0, p0, Ll9/k;->w:Ll9/b1;

    invoke-interface {v0}, Ll9/b1;->m()J

    move-result-wide v0

    return-wide v0
.end method

.method public final n(J)V
    .locals 1

    iget-object v0, p0, Ll9/k;->w:Ll9/b1;

    invoke-interface {v0, p1, p2}, Ll9/b1;->n(J)V

    return-void
.end method

.method public final x(Lb9/o0;)Z
    .locals 1

    iget-object v0, p0, Ll9/k;->w:Ll9/b1;

    invoke-interface {v0, p1}, Ll9/b1;->x(Lb9/o0;)Z

    move-result p1

    return p1
.end method
