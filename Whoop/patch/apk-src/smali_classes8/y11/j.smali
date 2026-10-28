.class public final synthetic Ly11/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:Lcom/whoop/design/util/TextResource;

.field public final synthetic G:Lcom/whoop/design/util/TextResource;

.field public final synthetic H:Z

.field public final synthetic I:Lc93/a;

.field public final synthetic J:I

.field public final synthetic w:Lcom/whoop/design/util/TextResource;

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZJLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLc93/a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly11/j;->w:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Ly11/j;->x:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Ly11/j;->y:Lcom/whoop/design/util/TextResource;

    iput-boolean p4, p0, Ly11/j;->z:Z

    iput-wide p5, p0, Ly11/j;->E:J

    iput-object p7, p0, Ly11/j;->F:Lcom/whoop/design/util/TextResource;

    iput-object p8, p0, Ly11/j;->G:Lcom/whoop/design/util/TextResource;

    iput-boolean p9, p0, Ly11/j;->H:Z

    iput-object p10, p0, Ly11/j;->I:Lc93/a;

    iput p11, p0, Ly11/j;->J:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-object v0, p0, Ly11/j;->w:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Ly11/j;->x:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Ly11/j;->y:Lcom/whoop/design/util/TextResource;

    iget-boolean v3, p0, Ly11/j;->z:Z

    iget-wide v4, p0, Ly11/j;->E:J

    iget-object v6, p0, Ly11/j;->F:Lcom/whoop/design/util/TextResource;

    iget-object v7, p0, Ly11/j;->G:Lcom/whoop/design/util/TextResource;

    iget-boolean v8, p0, Ly11/j;->H:Z

    iget-object v9, p0, Ly11/j;->I:Lc93/a;

    iget v10, p0, Ly11/j;->J:I

    invoke-static/range {v0 .. v12}, Ly11/k;->d(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZJLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
