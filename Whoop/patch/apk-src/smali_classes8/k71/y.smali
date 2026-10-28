.class public final synthetic Lk71/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lm91/u;

.field public final synthetic F:Ljava/util/List;

.field public final synthetic G:Z

.field public final synthetic H:I

.field public final synthetic I:I

.field public final synthetic w:Lcom/whoop/design/util/TextResource;

.field public final synthetic x:Ly81/e;

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;FLm91/u;Ljava/util/List;ZII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk71/y;->w:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Lk71/y;->x:Ly81/e;

    iput-object p3, p0, Lk71/y;->y:Lcom/whoop/design/util/TextResource;

    iput p4, p0, Lk71/y;->z:F

    iput-object p5, p0, Lk71/y;->E:Lm91/u;

    iput-object p6, p0, Lk71/y;->F:Ljava/util/List;

    iput-boolean p7, p0, Lk71/y;->G:Z

    iput p8, p0, Lk71/y;->H:I

    iput p9, p0, Lk71/y;->I:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v0, p0, Lk71/y;->w:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lk71/y;->x:Ly81/e;

    iget-object v2, p0, Lk71/y;->y:Lcom/whoop/design/util/TextResource;

    iget v3, p0, Lk71/y;->z:F

    iget-object v4, p0, Lk71/y;->E:Lm91/u;

    iget-object v5, p0, Lk71/y;->F:Ljava/util/List;

    iget-boolean v6, p0, Lk71/y;->G:Z

    iget v7, p0, Lk71/y;->H:I

    iget v8, p0, Lk71/y;->I:I

    invoke-static/range {v0 .. v10}, Lk71/z;->l(Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;FLm91/u;Ljava/util/List;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
