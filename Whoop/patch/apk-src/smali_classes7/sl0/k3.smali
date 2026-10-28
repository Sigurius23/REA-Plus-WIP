.class public final synthetic Lsl0/k3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Z

.field public final synthetic y:F

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;ZFJII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsl0/k3;->w:Landroidx/compose/ui/Modifier;

    iput-boolean p2, p0, Lsl0/k3;->x:Z

    iput p3, p0, Lsl0/k3;->y:F

    iput-wide p4, p0, Lsl0/k3;->z:J

    iput p6, p0, Lsl0/k3;->E:I

    iput p7, p0, Lsl0/k3;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v0, p0, Lsl0/k3;->w:Landroidx/compose/ui/Modifier;

    iget-boolean v1, p0, Lsl0/k3;->x:Z

    iget v2, p0, Lsl0/k3;->y:F

    iget-wide v3, p0, Lsl0/k3;->z:J

    iget v5, p0, Lsl0/k3;->E:I

    iget v6, p0, Lsl0/k3;->F:I

    invoke-static/range {v0 .. v8}, Lsl0/l3;->a(Landroidx/compose/ui/Modifier;ZFJIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
