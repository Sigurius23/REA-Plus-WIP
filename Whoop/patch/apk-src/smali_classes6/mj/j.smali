.class public final Lmj/j;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:J

.field public final synthetic w:F

.field public final synthetic x:F

.field public final synthetic y:F

.field public final synthetic z:Lt0/i;


# direct methods
.method public constructor <init>(FFFLt0/i;J)V
    .locals 0

    iput p1, p0, Lmj/j;->w:F

    iput p2, p0, Lmj/j;->x:F

    iput p3, p0, Lmj/j;->y:F

    iput-object p4, p0, Lmj/j;->z:Lt0/i;

    iput-wide p5, p0, Lmj/j;->E:J

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Li2/g0;

    const-string v0, "$this$graphicsLayer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Li2/x0;

    invoke-virtual {p1}, Li2/x0;->getDensity()F

    move-result v0

    iget v1, p0, Lmj/j;->w:F

    mul-float/2addr v0, v1

    invoke-virtual {p1, v0}, Li2/x0;->s(F)V

    iget v0, p0, Lmj/j;->x:F

    invoke-virtual {p1}, Li2/x0;->getDensity()F

    move-result v1

    mul-float/2addr v1, v0

    invoke-virtual {p1, v1}, Li2/x0;->E(F)V

    iget v0, p0, Lmj/j;->y:F

    invoke-virtual {p1}, Li2/x0;->getDensity()F

    move-result v1

    mul-float/2addr v1, v0

    invoke-virtual {p1, v1}, Li2/x0;->C(F)V

    iget-object v0, p0, Lmj/j;->z:Lt0/i;

    invoke-virtual {p1, v0}, Li2/x0;->t(Li2/a1;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Li2/x0;->e(Z)V

    iget-wide v0, p0, Lmj/j;->E:J

    invoke-virtual {p1, v0, v1}, Li2/x0;->v(J)V

    invoke-virtual {p1, v0, v1}, Li2/x0;->b(J)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
