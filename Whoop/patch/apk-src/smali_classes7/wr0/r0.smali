.class public final synthetic Lwr0/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:Lp1/a1;

.field public final synthetic G:Lkotlin/jvm/functions/Function1;

.field public final synthetic w:Ljava/util/List;

.field public final synthetic x:I

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;IFFFLp1/a1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwr0/r0;->w:Ljava/util/List;

    iput p2, p0, Lwr0/r0;->x:I

    iput p3, p0, Lwr0/r0;->y:F

    iput p4, p0, Lwr0/r0;->z:F

    iput p5, p0, Lwr0/r0;->E:F

    iput-object p6, p0, Lwr0/r0;->F:Lp1/a1;

    iput-object p7, p0, Lwr0/r0;->G:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    move-object v7, p1

    check-cast v7, Ll0/u;

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result v8

    move-object v9, p3

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v0, p0, Lwr0/r0;->w:Ljava/util/List;

    iget v1, p0, Lwr0/r0;->x:I

    iget v2, p0, Lwr0/r0;->y:F

    iget v3, p0, Lwr0/r0;->z:F

    iget v4, p0, Lwr0/r0;->E:F

    iget-object v5, p0, Lwr0/r0;->F:Lp1/a1;

    iget-object v6, p0, Lwr0/r0;->G:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v0 .. v10}, Lwr0/u0;->o(Ljava/util/List;IFFFLp1/a1;Lkotlin/jvm/functions/Function1;Ll0/u;FLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
