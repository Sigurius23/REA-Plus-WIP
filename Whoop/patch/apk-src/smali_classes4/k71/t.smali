.class public final synthetic Lk71/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lcom/whoop/design/util/TextResource;

.field public final synthetic w:Lcom/whoop/design/util/TextResource;

.field public final synthetic x:Z

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:Ly81/e;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk71/t;->w:Lcom/whoop/design/util/TextResource;

    iput-boolean p2, p0, Lk71/t;->x:Z

    iput-object p3, p0, Lk71/t;->y:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lk71/t;->z:Ly81/e;

    iput-object p5, p0, Lk71/t;->E:Lcom/whoop/design/util/TextResource;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lk71/t;->w:Lcom/whoop/design/util/TextResource;

    iget-boolean v1, p0, Lk71/t;->x:Z

    iget-object v2, p0, Lk71/t;->y:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lk71/t;->z:Ly81/e;

    iget-object v4, p0, Lk71/t;->E:Lcom/whoop/design/util/TextResource;

    invoke-static/range {v0 .. v6}, Lk71/z;->h(Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
