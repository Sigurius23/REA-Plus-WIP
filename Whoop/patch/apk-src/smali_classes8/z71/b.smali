.class public final synthetic Lz71/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:J

.field public final synthetic G:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:Lcom/whoop/design/util/TextResource;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;JJI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz71/b;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lz71/b;->x:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lz71/b;->y:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lz71/b;->z:Lcom/whoop/design/util/TextResource;

    iput-wide p5, p0, Lz71/b;->E:J

    iput-wide p7, p0, Lz71/b;->F:J

    iput p9, p0, Lz71/b;->G:I

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

    iget-object v0, p0, Lz71/b;->w:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lz71/b;->x:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lz71/b;->y:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lz71/b;->z:Lcom/whoop/design/util/TextResource;

    iget-wide v4, p0, Lz71/b;->E:J

    iget-wide v6, p0, Lz71/b;->F:J

    iget v8, p0, Lz71/b;->G:I

    invoke-static/range {v0 .. v10}, Lz71/c;->a(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;JJILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
