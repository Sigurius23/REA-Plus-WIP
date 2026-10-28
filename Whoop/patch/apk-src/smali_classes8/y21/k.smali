.class public final synthetic Ly21/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lp1/t2;

.field public final synthetic F:I

.field public final synthetic G:F

.field public final synthetic w:Lp1/t2;

.field public final synthetic x:Z

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Lp1/t2;ZFFLp1/t2;IF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly21/k;->w:Lp1/t2;

    iput-boolean p2, p0, Ly21/k;->x:Z

    iput p3, p0, Ly21/k;->y:F

    iput p4, p0, Ly21/k;->z:F

    iput-object p5, p0, Ly21/k;->E:Lp1/t2;

    iput p6, p0, Ly21/k;->F:I

    iput p7, p0, Ly21/k;->G:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    move-object v7, p1

    check-cast v7, Lu2/r;

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result v8

    iget-object v0, p0, Ly21/k;->w:Lp1/t2;

    iget-boolean v1, p0, Ly21/k;->x:Z

    iget v2, p0, Ly21/k;->y:F

    iget v3, p0, Ly21/k;->z:F

    iget-object v4, p0, Ly21/k;->E:Lp1/t2;

    iget v5, p0, Ly21/k;->F:I

    iget v6, p0, Ly21/k;->G:F

    invoke-static/range {v0 .. v8}, Ly21/i$d;->b(Lp1/t2;ZFFLp1/t2;IFLu2/r;F)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
