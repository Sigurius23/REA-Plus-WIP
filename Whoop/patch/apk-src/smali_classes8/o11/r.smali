.class public final synthetic Lo11/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Z

.field public final synthetic y:J

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;ZJII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo11/r;->w:Landroidx/compose/ui/Modifier;

    iput-boolean p2, p0, Lo11/r;->x:Z

    iput-wide p3, p0, Lo11/r;->y:J

    iput p5, p0, Lo11/r;->z:I

    iput p6, p0, Lo11/r;->E:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v0, p0, Lo11/r;->w:Landroidx/compose/ui/Modifier;

    iget-boolean v1, p0, Lo11/r;->x:Z

    iget-wide v2, p0, Lo11/r;->y:J

    iget v4, p0, Lo11/r;->z:I

    iget v5, p0, Lo11/r;->E:I

    invoke-static/range {v0 .. v7}, Lo11/s;->b(Landroidx/compose/ui/Modifier;ZJIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
