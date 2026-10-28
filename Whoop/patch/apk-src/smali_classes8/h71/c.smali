.class public final synthetic Lh71/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Li71/g;

.field public final synthetic F:Lh71/i;

.field public final synthetic G:Li71/h;

.field public final synthetic H:Lh61/a;

.field public final synthetic I:J

.field public final synthetic J:Lp1/c1;

.field public final synthetic w:F

.field public final synthetic x:Lb2/m;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(FLb2/m;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Li71/g;Lh71/i;Li71/h;Lh61/a;JLp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lh71/c;->w:F

    iput-object p2, p0, Lh71/c;->x:Lb2/m;

    iput-object p3, p0, Lh71/c;->y:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Lh71/c;->z:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lh71/c;->E:Li71/g;

    iput-object p6, p0, Lh71/c;->F:Lh71/i;

    iput-object p7, p0, Lh71/c;->G:Li71/h;

    iput-object p8, p0, Lh71/c;->H:Lh61/a;

    iput-wide p9, p0, Lh71/c;->I:J

    iput-object p11, p0, Lh71/c;->J:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget v0, p0, Lh71/c;->w:F

    iget-object v1, p0, Lh71/c;->x:Lb2/m;

    iget-object v2, p0, Lh71/c;->y:Landroidx/compose/ui/Modifier;

    iget-object v3, p0, Lh71/c;->z:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lh71/c;->E:Li71/g;

    iget-object v5, p0, Lh71/c;->F:Lh71/i;

    iget-object v6, p0, Lh71/c;->G:Li71/h;

    iget-object v7, p0, Lh71/c;->H:Lh61/a;

    iget-wide v8, p0, Lh71/c;->I:J

    iget-object v10, p0, Lh71/c;->J:Lp1/c1;

    invoke-static/range {v0 .. v12}, Lh71/g;->b(FLb2/m;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Li71/g;Lh71/i;Li71/h;Lh61/a;JLp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
