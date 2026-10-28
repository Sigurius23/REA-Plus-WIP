.class public final synthetic Ln1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Li2/a1;

.field public final synthetic w:Ln1/o;

.field public final synthetic x:Z

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Ln1/o;ZFFLi2/a1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln1/d;->w:Ln1/o;

    iput-boolean p2, p0, Ln1/d;->x:Z

    iput p3, p0, Ln1/d;->y:F

    iput p4, p0, Ln1/d;->z:F

    iput-object p5, p0, Ln1/d;->E:Li2/a1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    check-cast p1, Ly2/t0;

    check-cast p2, Ly2/q0;

    check-cast p3, Ly3/a;

    iget-wide v0, p3, Ly3/a;->a:J

    invoke-interface {p2, v0, v1}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v3

    iget p2, v3, Ly2/j1;->w:I

    iget p3, v3, Ly2/j1;->x:I

    new-instance v2, Ln1/a;

    iget-object v4, p0, Ln1/d;->w:Ln1/o;

    iget-boolean v5, p0, Ln1/d;->x:Z

    iget v6, p0, Ln1/d;->y:F

    iget v7, p0, Ln1/d;->z:F

    iget-object v8, p0, Ln1/d;->E:Li2/a1;

    invoke-direct/range {v2 .. v8}, Ln1/a;-><init>(Ly2/j1;Ln1/o;ZFFLi2/a1;)V

    sget-object v0, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, p2, p3, v0, v2}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method
