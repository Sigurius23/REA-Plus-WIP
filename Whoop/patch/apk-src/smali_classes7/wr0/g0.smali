.class public final synthetic Lwr0/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:Z

.field public final synthetic G:Lkotlin/jvm/functions/Function1;

.field public final synthetic H:Lp1/a1;

.field public final synthetic I:Lp1/a1;

.field public final synthetic w:Ly3/c;

.field public final synthetic x:Lwr0/k0;

.field public final synthetic y:F

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Ly3/c;Lwr0/k0;FZFZLkotlin/jvm/functions/Function1;Lp1/a1;Lp1/a1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwr0/g0;->w:Ly3/c;

    iput-object p2, p0, Lwr0/g0;->x:Lwr0/k0;

    iput p3, p0, Lwr0/g0;->y:F

    iput-boolean p4, p0, Lwr0/g0;->z:Z

    iput p5, p0, Lwr0/g0;->E:F

    iput-boolean p6, p0, Lwr0/g0;->F:Z

    iput-object p7, p0, Lwr0/g0;->G:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lwr0/g0;->H:Lp1/a1;

    iput-object p9, p0, Lwr0/g0;->I:Lp1/a1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    move-object v9, p1

    check-cast v9, Ll0/v;

    move-object v10, p2

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget-object v0, p0, Lwr0/g0;->w:Ly3/c;

    iget-object v1, p0, Lwr0/g0;->x:Lwr0/k0;

    iget v2, p0, Lwr0/g0;->y:F

    iget-boolean v3, p0, Lwr0/g0;->z:Z

    iget v4, p0, Lwr0/g0;->E:F

    iget-boolean v5, p0, Lwr0/g0;->F:Z

    iget-object v6, p0, Lwr0/g0;->G:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Lwr0/g0;->H:Lp1/a1;

    iget-object v8, p0, Lwr0/g0;->I:Lp1/a1;

    invoke-static/range {v0 .. v11}, Lwr0/j0;->j(Ly3/c;Lwr0/k0;FZFZLkotlin/jvm/functions/Function1;Lp1/a1;Lp1/a1;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
