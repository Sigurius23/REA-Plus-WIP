.class public final synthetic Lk71/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ly81/e;

.field public final synthetic F:Lcom/whoop/design/util/TextResource;

.field public final synthetic G:Ly3/m;

.field public final synthetic H:I

.field public final synthetic w:Lcom/whoop/design/util/TextResource;

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Ly71/g;

.field public final synthetic z:Lcom/whoop/design/util/TextResource;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/g;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly3/m;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk71/u;->w:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Lk71/u;->x:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lk71/u;->y:Ly71/g;

    iput-object p4, p0, Lk71/u;->z:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lk71/u;->E:Ly81/e;

    iput-object p6, p0, Lk71/u;->F:Lcom/whoop/design/util/TextResource;

    iput-object p7, p0, Lk71/u;->G:Ly3/m;

    iput p8, p0, Lk71/u;->H:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v0, p0, Lk71/u;->w:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lk71/u;->x:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lk71/u;->y:Ly71/g;

    iget-object v3, p0, Lk71/u;->z:Lcom/whoop/design/util/TextResource;

    iget-object v4, p0, Lk71/u;->E:Ly81/e;

    iget-object v5, p0, Lk71/u;->F:Lcom/whoop/design/util/TextResource;

    iget-object v6, p0, Lk71/u;->G:Ly3/m;

    iget v7, p0, Lk71/u;->H:I

    invoke-static/range {v0 .. v9}, Lk71/z;->o(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/g;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly3/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
