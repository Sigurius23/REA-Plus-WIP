.class public final synthetic Lr11/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lz51/k;

.field public final synthetic F:F

.field public final synthetic G:Lcom/whoop/design/util/TextResource;

.field public final synthetic H:Lcom/whoop/design/util/TextResource;

.field public final synthetic I:Z

.field public final synthetic J:I

.field public final synthetic w:Z

.field public final synthetic x:F

.field public final synthetic y:Ll83/k;

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(ZFLl83/k;FLz51/k;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lr11/b;->w:Z

    iput p2, p0, Lr11/b;->x:F

    iput-object p3, p0, Lr11/b;->y:Ll83/k;

    iput p4, p0, Lr11/b;->z:F

    iput-object p5, p0, Lr11/b;->E:Lz51/k;

    iput p6, p0, Lr11/b;->F:F

    iput-object p7, p0, Lr11/b;->G:Lcom/whoop/design/util/TextResource;

    iput-object p8, p0, Lr11/b;->H:Lcom/whoop/design/util/TextResource;

    iput-boolean p9, p0, Lr11/b;->I:Z

    iput p10, p0, Lr11/b;->J:I

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

    iget-boolean v0, p0, Lr11/b;->w:Z

    iget v1, p0, Lr11/b;->x:F

    iget-object v2, p0, Lr11/b;->y:Ll83/k;

    iget v3, p0, Lr11/b;->z:F

    iget-object v4, p0, Lr11/b;->E:Lz51/k;

    iget v5, p0, Lr11/b;->F:F

    iget-object v6, p0, Lr11/b;->G:Lcom/whoop/design/util/TextResource;

    iget-object v7, p0, Lr11/b;->H:Lcom/whoop/design/util/TextResource;

    iget-boolean v8, p0, Lr11/b;->I:Z

    iget v9, p0, Lr11/b;->J:I

    invoke-static/range {v0 .. v11}, Lr11/c;->a(ZFLl83/k;FLz51/k;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
