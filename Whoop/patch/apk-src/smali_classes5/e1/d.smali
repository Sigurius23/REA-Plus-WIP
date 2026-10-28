.class public final Le1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly3/c;


# instance fields
.field public w:Ll3/r0;

.field public final synthetic x:Le1/e;


# direct methods
.method public constructor <init>(Le1/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le1/d;->x:Le1/e;

    return-void
.end method


# virtual methods
.method public final K(J)F
    .locals 5

    invoke-static {p1, p2}, Ly3/o;->d(J)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Le1/d;->x:Le1/e;

    iget-object v1, v0, Le1/e;->l:Ll3/v0;

    iget-object v1, v1, Ll3/v0;->a:Ll3/m0;

    iget-wide v1, v1, Ll3/m0;->b:J

    invoke-static {v1, v2}, Ly3/o;->d(J)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, v0, Le1/e;->l:Ll3/v0;

    iget-object v1, v1, Ll3/v0;->a:Ll3/m0;

    iget-wide v1, v1, Ll3/m0;->b:J

    sget-object v3, Ly3/o;->b:[Ly3/p;

    sget-wide v3, Ly3/o;->c:J

    invoke-static {v1, v2, v3, v4}, Ly3/o;->a(JJ)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v0, v0, Le1/e;->l:Ll3/v0;

    iget-object v0, v0, Ll3/v0;->a:Ll3/m0;

    iget-wide v0, v0, Ll3/m0;->b:J

    invoke-virtual {p0, v0, v1}, Le1/d;->K(J)F

    move-result v0

    invoke-static {p1, p2}, Ly3/o;->c(J)F

    move-result p1

    mul-float/2addr p1, v0

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is not set. Please specify a font size."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is Em\nDeclare the composable\'s style.fontSize with Sp units instead."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-interface {p0, p1, p2}, Ly3/c;->l(J)F

    move-result p1

    invoke-virtual {p0}, Le1/d;->getDensity()F

    move-result p2

    mul-float/2addr p2, p1

    return p2
.end method

.method public final a()Ll3/r0;
    .locals 1

    iget-object v0, p0, Le1/d;->w:Ll3/r0;

    return-object v0
.end method

.method public final b(JJ)Ll3/r0;
    .locals 20

    move-object/from16 v0, p0

    iget-object v1, v0, Le1/d;->x:Le1/e;

    iget-object v2, v1, Le1/e;->l:Ll3/v0;

    invoke-static/range {p3 .. p4}, Ly3/o;->d(J)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, v1, Le1/e;->l:Ll3/v0;

    iget-object v3, v3, Ll3/v0;->a:Ll3/m0;

    iget-wide v3, v3, Ll3/m0;->b:J

    move-wide/from16 v5, p3

    invoke-static {v3, v4, v5, v6}, Le1/f;->a(JJ)J

    move-result-wide v3

    move-wide v8, v3

    goto :goto_0

    :cond_0
    move-wide/from16 v5, p3

    move-wide v8, v5

    :goto_0
    iget-object v3, v1, Le1/e;->l:Ll3/v0;

    iget-object v3, v3, Ll3/v0;->a:Ll3/m0;

    iget-wide v3, v3, Ll3/m0;->b:J

    invoke-static {v8, v9, v3, v4}, Ly3/o;->a(JJ)Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v5, v1, Le1/e;->l:Ll3/v0;

    const/16 v18, 0x0

    const v19, 0xfffffd

    const-wide/16 v6, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    invoke-static/range {v5 .. v19}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v3

    invoke-virtual {v1, v3}, Le1/e;->f(Ll3/v0;)V

    :cond_1
    iget v3, v1, Le1/e;->f:I

    const/4 v4, 0x1

    if-le v3, v4, :cond_2

    iget-object v3, v1, Le1/e;->n:Ly3/m;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    move-wide/from16 v4, p1

    invoke-virtual {v1, v4, v5, v3}, Le1/e;->h(JLy3/m;)J

    move-result-wide v3

    goto :goto_1

    :cond_2
    move-wide/from16 v4, p1

    move-wide v3, v4

    :goto_1
    iget-object v5, v1, Le1/e;->n:Ly3/m;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1, v3, v4, v5}, Le1/e;->b(JLy3/m;)Ll3/w;

    move-result-object v5

    iget-object v6, v1, Le1/e;->n:Ly3/m;

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1, v6, v3, v4, v5}, Le1/e;->g(Ly3/m;JLl3/w;)Ll3/r0;

    move-result-object v3

    iput-object v3, v0, Le1/d;->w:Ll3/r0;

    invoke-virtual {v1, v2}, Le1/e;->f(Ll3/v0;)V

    return-object v3
.end method

.method public final getDensity()F
    .locals 1

    iget-object v0, p0, Le1/d;->x:Le1/e;

    iget-object v0, v0, Le1/e;->k:Ly3/c;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v0}, Ly3/c;->getDensity()F

    move-result v0

    return v0
.end method

.method public final m0()F
    .locals 1

    iget-object v0, p0, Le1/d;->x:Le1/e;

    iget-object v0, v0, Le1/e;->k:Ly3/c;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v0}, Ly3/c;->m0()F

    move-result v0

    return v0
.end method
