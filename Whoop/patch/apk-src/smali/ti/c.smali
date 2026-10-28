.class public final Lti/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lti/b;


# instance fields
.field public final w:Lej/a;

.field public x:F


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lti/c;->x:F

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lej/a;

    iput-object p1, p0, Lti/c;->w:Lej/a;

    return-void
.end method


# virtual methods
.method public final a(F)Z
    .locals 1

    iget v0, p0, Lti/c;->x:F

    cmpl-float v0, v0, p1

    if-nez v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    iput p1, p0, Lti/c;->x:F

    const/4 p1, 0x0

    return p1
.end method

.method public final b()Lej/a;
    .locals 1

    iget-object v0, p0, Lti/c;->w:Lej/a;

    return-object v0
.end method

.method public final c(F)Z
    .locals 0

    iget-object p1, p0, Lti/c;->w:Lej/a;

    invoke-virtual {p1}, Lej/a;->c()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public final d()F
    .locals 1

    iget-object v0, p0, Lti/c;->w:Lej/a;

    invoke-virtual {v0}, Lej/a;->b()F

    move-result v0

    return v0
.end method

.method public final e()F
    .locals 1

    iget-object v0, p0, Lti/c;->w:Lej/a;

    invoke-virtual {v0}, Lej/a;->a()F

    move-result v0

    return v0
.end method

.method public final isEmpty()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
