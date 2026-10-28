.class public final Lui/h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Z

.field public final synthetic w:Lui/i;

.field public final synthetic x:Lqi/i;

.field public final synthetic y:F

.field public final synthetic z:I


# direct methods
.method public constructor <init>(Lui/i;Lqi/i;FIZLq83/d;)V
    .locals 0

    iput-object p1, p0, Lui/h;->w:Lui/i;

    iput-object p2, p0, Lui/h;->x:Lqi/i;

    iput p3, p0, Lui/h;->y:F

    iput p4, p0, Lui/h;->z:I

    iput-boolean p5, p0, Lui/h;->E:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 7

    new-instance v0, Lui/h;

    iget v4, p0, Lui/h;->z:I

    iget-boolean v5, p0, Lui/h;->E:Z

    iget-object v1, p0, Lui/h;->w:Lui/i;

    iget-object v2, p0, Lui/h;->x:Lqi/i;

    iget v3, p0, Lui/h;->y:F

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lui/h;-><init>(Lui/i;Lqi/i;FIZLq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lui/h;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lui/h;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lui/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lui/h;->x:Lqi/i;

    iget-object v0, p0, Lui/h;->w:Lui/i;

    iget-object v1, v0, Lui/i;->I:Lp1/k1;

    invoke-virtual {v1, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget p1, p0, Lui/h;->y:F

    invoke-virtual {v0, p1}, Lui/i;->n(F)V

    iget p1, p0, Lui/h;->z:I

    invoke-virtual {v0, p1}, Lui/i;->m(I)V

    iget-object p1, v0, Lui/i;->w:Lp1/k1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lui/h;->E:Z

    if-eqz p1, :cond_0

    iget-object p1, v0, Lui/i;->L:Lp1/k1;

    const-wide/high16 v0, -0x8000000000000000L

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
