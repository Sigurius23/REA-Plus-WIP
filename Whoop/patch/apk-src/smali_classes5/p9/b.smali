.class public final synthetic Lp9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:Lp9/c;

.field public final synthetic x:I

.field public final synthetic y:J

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Lp9/c;IJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp9/b;->w:Lp9/c;

    iput p2, p0, Lp9/b;->x:I

    iput-wide p3, p0, Lp9/b;->y:J

    iput-wide p5, p0, Lp9/b;->z:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    iget-object v0, p0, Lp9/b;->w:Lp9/c;

    iget-object v0, v0, Lp9/c;->b:Lc9/h;

    iget-object v1, v0, Lc9/h;->z:La30/w0;

    iget-object v2, v1, La30/w0;->y:Ljava/lang/Object;

    check-cast v2, Lzr/g0;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    iget-object v1, v1, La30/w0;->y:Ljava/lang/Object;

    check-cast v1, Lzr/g0;

    invoke-static {v1}, Lzr/q;->i(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll9/c0;

    :goto_0
    invoke-virtual {v0, v1}, Lc9/h;->h(Ll9/c0;)Lc9/a;

    move-result-object v3

    new-instance v2, Lc9/f;

    iget v4, p0, Lp9/b;->x:I

    iget-wide v5, p0, Lp9/b;->y:J

    iget-wide v7, p0, Lp9/b;->z:J

    invoke-direct/range {v2 .. v8}, Lc9/f;-><init>(Lc9/a;IJJ)V

    const/16 v1, 0x3ee

    invoke-virtual {v0, v3, v1, v2}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void
.end method
