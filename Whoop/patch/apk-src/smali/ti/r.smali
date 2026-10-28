.class public final Lti/r;
.super Lti/d;
.source "SourceFile"


# instance fields
.field public final i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ld1/j;Ljava/lang/Object;)V
    .locals 1

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {p0, v0}, Lti/d;-><init>(Ljava/util/List;)V

    invoke-virtual {p0, p1}, Lti/d;->j(Ld1/j;)V

    iput-object p2, p0, Lti/r;->i:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b()F
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public final e()Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lti/d;->e:Ld1/j;

    iget-object v3, p0, Lti/r;->i:Ljava/lang/Object;

    iget v5, p0, Lti/d;->d:F

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v4, v3

    move v6, v5

    move v7, v5

    invoke-virtual/range {v0 .. v7}, Ld1/j;->A(FFLjava/lang/Object;Ljava/lang/Object;FFF)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final f(Lej/a;F)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, Lti/r;->e()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final h()V
    .locals 1

    iget-object v0, p0, Lti/d;->e:Ld1/j;

    if-eqz v0, :cond_0

    invoke-super {p0}, Lti/d;->h()V

    :cond_0
    return-void
.end method

.method public final i(F)V
    .locals 0

    iput p1, p0, Lti/d;->d:F

    return-void
.end method
