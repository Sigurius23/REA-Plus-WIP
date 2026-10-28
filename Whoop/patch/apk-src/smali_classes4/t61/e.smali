.class public final synthetic Lt61/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:J

.field public final synthetic y:F

.field public final synthetic z:Lu61/b;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;JFLu61/b;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt61/e;->w:Landroidx/compose/ui/Modifier;

    iput-wide p2, p0, Lt61/e;->x:J

    iput p4, p0, Lt61/e;->y:F

    iput-object p5, p0, Lt61/e;->z:Lu61/b;

    iput p6, p0, Lt61/e;->E:I

    iput p7, p0, Lt61/e;->F:I

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

    iget-object v0, p0, Lt61/e;->w:Landroidx/compose/ui/Modifier;

    iget-wide v1, p0, Lt61/e;->x:J

    iget v3, p0, Lt61/e;->y:F

    iget-object v4, p0, Lt61/e;->z:Lu61/b;

    iget v5, p0, Lt61/e;->E:I

    iget v6, p0, Lt61/e;->F:I

    invoke-static/range {v0 .. v8}, Lt61/f;->b(Landroidx/compose/ui/Modifier;JFLu61/b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
