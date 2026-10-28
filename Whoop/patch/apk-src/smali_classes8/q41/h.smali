.class public final synthetic Lq41/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lp1/c1;

.field public final synthetic w:Lp1/t2;

.field public final synthetic x:Z

.field public final synthetic y:Lq41/c;

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Lp1/t2;ZLq41/c;FLp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq41/h;->w:Lp1/t2;

    iput-boolean p2, p0, Lq41/h;->x:Z

    iput-object p3, p0, Lq41/h;->y:Lq41/c;

    iput p4, p0, Lq41/h;->z:F

    iput-object p5, p0, Lq41/h;->E:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    move-object v5, p1

    check-cast v5, Lu2/r;

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result v6

    iget-object v0, p0, Lq41/h;->w:Lp1/t2;

    iget-boolean v1, p0, Lq41/h;->x:Z

    iget-object v2, p0, Lq41/h;->y:Lq41/c;

    iget v3, p0, Lq41/h;->z:F

    iget-object v4, p0, Lq41/h;->E:Lp1/c1;

    invoke-static/range {v0 .. v6}, Lq41/f$b;->b(Lp1/t2;ZLq41/c;FLp1/c1;Lu2/r;F)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
