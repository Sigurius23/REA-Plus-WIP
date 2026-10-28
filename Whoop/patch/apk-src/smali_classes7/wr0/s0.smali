.class public final synthetic Lwr0/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:F

.field public final synthetic G:F

.field public final synthetic H:Lkotlin/jvm/functions/Function1;

.field public final synthetic I:Lkotlin/jvm/functions/Function1;

.field public final synthetic J:I

.field public final synthetic w:Ll0/u;

.field public final synthetic x:Ljava/util/List;

.field public final synthetic y:I

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Ll0/u;Ljava/util/List;IFFFFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwr0/s0;->w:Ll0/u;

    iput-object p2, p0, Lwr0/s0;->x:Ljava/util/List;

    iput p3, p0, Lwr0/s0;->y:I

    iput p4, p0, Lwr0/s0;->z:F

    iput p5, p0, Lwr0/s0;->E:F

    iput p6, p0, Lwr0/s0;->F:F

    iput p7, p0, Lwr0/s0;->G:F

    iput-object p8, p0, Lwr0/s0;->H:Lkotlin/jvm/functions/Function1;

    iput-object p9, p0, Lwr0/s0;->I:Lkotlin/jvm/functions/Function1;

    iput p10, p0, Lwr0/s0;->J:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget-object v0, p0, Lwr0/s0;->w:Ll0/u;

    iget-object v1, p0, Lwr0/s0;->x:Ljava/util/List;

    iget v2, p0, Lwr0/s0;->y:I

    iget v3, p0, Lwr0/s0;->z:F

    iget v4, p0, Lwr0/s0;->E:F

    iget v5, p0, Lwr0/s0;->F:F

    iget v6, p0, Lwr0/s0;->G:F

    iget-object v7, p0, Lwr0/s0;->H:Lkotlin/jvm/functions/Function1;

    iget-object v8, p0, Lwr0/s0;->I:Lkotlin/jvm/functions/Function1;

    iget v9, p0, Lwr0/s0;->J:I

    invoke-static/range {v0 .. v11}, Lwr0/u0;->b(Ll0/u;Ljava/util/List;IFFFFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
