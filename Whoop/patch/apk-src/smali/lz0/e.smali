.class public final synthetic Llz0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:Z

.field public final synthetic G:F

.field public final synthetic H:I

.field public final synthetic I:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:I

.field public final synthetic y:I

.field public final synthetic z:Li2/t;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;IILi2/t;JZFII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llz0/e;->w:Landroidx/compose/ui/Modifier;

    iput p2, p0, Llz0/e;->x:I

    iput p3, p0, Llz0/e;->y:I

    iput-object p4, p0, Llz0/e;->z:Li2/t;

    iput-wide p5, p0, Llz0/e;->E:J

    iput-boolean p7, p0, Llz0/e;->F:Z

    iput p8, p0, Llz0/e;->G:F

    iput p9, p0, Llz0/e;->H:I

    iput p10, p0, Llz0/e;->I:I

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

    iget-object v0, p0, Llz0/e;->w:Landroidx/compose/ui/Modifier;

    iget v1, p0, Llz0/e;->x:I

    iget v2, p0, Llz0/e;->y:I

    iget-object v3, p0, Llz0/e;->z:Li2/t;

    iget-wide v4, p0, Llz0/e;->E:J

    iget-boolean v6, p0, Llz0/e;->F:Z

    iget v7, p0, Llz0/e;->G:F

    iget v8, p0, Llz0/e;->H:I

    iget v9, p0, Llz0/e;->I:I

    invoke-static/range {v0 .. v11}, Llz0/f;->a(Landroidx/compose/ui/Modifier;IILi2/t;JZFIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
