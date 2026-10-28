.class public final Ll9/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/z0;


# instance fields
.field public final w:Ll9/z0;

.field public final x:J


# direct methods
.method public constructor <init>(Ll9/z0;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/e1;->w:Ll9/z0;

    iput-wide p2, p0, Ll9/e1;->x:J

    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 1

    iget-object v0, p0, Ll9/e1;->w:Ll9/z0;

    invoke-interface {v0}, Ll9/z0;->b()Z

    move-result v0

    return v0
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Ll9/e1;->w:Ll9/z0;

    invoke-interface {v0}, Ll9/z0;->c()V

    return-void
.end method

.method public final j(J)I
    .locals 2

    iget-wide v0, p0, Ll9/e1;->x:J

    sub-long/2addr p1, v0

    iget-object v0, p0, Ll9/e1;->w:Ll9/z0;

    invoke-interface {v0, p1, p2}, Ll9/z0;->j(J)I

    move-result p1

    return p1
.end method

.method public final l(Lqg3/d;La9/e;I)I
    .locals 4

    iget-object v0, p0, Ll9/e1;->w:Ll9/z0;

    invoke-interface {v0, p1, p2, p3}, Ll9/z0;->l(Lqg3/d;La9/e;I)I

    move-result p1

    const/4 p3, -0x4

    if-ne p1, p3, :cond_0

    iget-wide v0, p2, La9/e;->G:J

    iget-wide v2, p0, Ll9/e1;->x:J

    add-long/2addr v0, v2

    iput-wide v0, p2, La9/e;->G:J

    :cond_0
    return p1
.end method
