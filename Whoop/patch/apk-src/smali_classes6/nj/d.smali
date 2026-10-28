.class public final Lnj/d;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    iput-wide p1, p0, Lnj/d;->w:J

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p1

    check-cast v0, Lk2/e;

    const-string v1, "$this$Canvas"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v1

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v2

    invoke-static {v2, v3}, Lh2/e;->e(J)F

    move-result v2

    const/4 v3, 0x2

    int-to-float v3, v3

    div-float/2addr v2, v3

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v4

    invoke-static {v4, v5}, Lh2/e;->c(J)F

    move-result v4

    invoke-virtual {v1, v2, v4}, Li2/j;->i(FF)V

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v2}, Li2/j;->h(FF)V

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v4

    invoke-static {v4, v5}, Lh2/e;->e(J)F

    move-result v4

    invoke-virtual {v1, v4, v2}, Li2/j;->h(FF)V

    invoke-virtual {v1}, Li2/j;->f()V

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v7

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v4

    invoke-static {v4, v5}, Lh2/e;->e(J)F

    move-result v4

    div-float/2addr v4, v3

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v5

    invoke-static {v5, v6}, Lh2/e;->c(J)F

    move-result v5

    invoke-virtual {v7, v4, v5}, Li2/j;->i(FF)V

    invoke-virtual {v7, v2, v2}, Li2/j;->h(FF)V

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v4

    invoke-static {v4, v5}, Lh2/e;->e(J)F

    move-result v4

    div-float/2addr v4, v3

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v5

    invoke-static {v5, v6}, Lh2/e;->c(J)F

    move-result v3

    invoke-virtual {v7, v4, v3}, Li2/j;->i(FF)V

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v3

    invoke-static {v3, v4}, Lh2/e;->e(J)F

    move-result v3

    invoke-virtual {v7, v3, v2}, Li2/j;->h(FF)V

    const/4 v5, 0x0

    const/16 v6, 0x3c

    move-object/from16 v8, p0

    iget-wide v2, v8, Lnj/d;->w:J

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lk2/e;->z(Lk2/e;Li2/s0;JFLk2/f;I)V

    const/16 v1, 0xe2

    const/16 v2, 0xff

    invoke-static {v1, v1, v1, v2}, Li2/w0;->d(IIII)J

    move-result-wide v2

    new-instance v5, Lk2/i;

    const/4 v14, 0x0

    const/16 v15, 0x1e

    const/high16 v10, 0x3f800000    # 1.0f

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v9, v5

    invoke-direct/range {v9 .. v15}, Lk2/i;-><init>(FFIILi2/t0;I)V

    const/16 v6, 0x34

    move-object v1, v7

    invoke-static/range {v0 .. v6}, Lk2/e;->z(Lk2/e;Li2/s0;JFLk2/f;I)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
