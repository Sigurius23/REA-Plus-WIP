.class public final synthetic Lly0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ly71/g;

.field public final synthetic F:J

.field public final synthetic G:Z

.field public final synthetic H:I

.field public final synthetic I:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Lb91/a;

.field public final synthetic z:Lcom/whoop/design/util/TextResource;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lb91/a;Lcom/whoop/design/util/TextResource;Ly71/g;JZII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lly0/c;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lly0/c;->x:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lly0/c;->y:Lb91/a;

    iput-object p4, p0, Lly0/c;->z:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lly0/c;->E:Ly71/g;

    iput-wide p6, p0, Lly0/c;->F:J

    iput-boolean p8, p0, Lly0/c;->G:Z

    iput p9, p0, Lly0/c;->H:I

    iput p10, p0, Lly0/c;->I:I

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

    iget-object v0, p0, Lly0/c;->w:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lly0/c;->x:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lly0/c;->y:Lb91/a;

    iget-object v3, p0, Lly0/c;->z:Lcom/whoop/design/util/TextResource;

    iget-object v4, p0, Lly0/c;->E:Ly71/g;

    iget-wide v5, p0, Lly0/c;->F:J

    iget-boolean v7, p0, Lly0/c;->G:Z

    iget v8, p0, Lly0/c;->H:I

    iget v9, p0, Lly0/c;->I:I

    invoke-static/range {v0 .. v11}, Lly0/e;->f(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lb91/a;Lcom/whoop/design/util/TextResource;Ly71/g;JZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
