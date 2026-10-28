.class public final synthetic Lr21/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lcom/whoop/design/util/TextResource;

.field public final synthetic F:Lkd1/o;

.field public final synthetic G:Lcom/whoop/design/util/TextResource;

.field public final synthetic H:J

.field public final synthetic I:Z

.field public final synthetic J:Lc93/a;

.field public final synthetic K:Li2/x;

.field public final synthetic w:Lr21/a;

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:J

.field public final synthetic z:Lkd1/o;


# direct methods
.method public synthetic constructor <init>(Lr21/a;Lcom/whoop/design/util/TextResource;JLkd1/o;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;JZLc93/a;Li2/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr21/e;->w:Lr21/a;

    iput-object p2, p0, Lr21/e;->x:Lcom/whoop/design/util/TextResource;

    iput-wide p3, p0, Lr21/e;->y:J

    iput-object p5, p0, Lr21/e;->z:Lkd1/o;

    iput-object p6, p0, Lr21/e;->E:Lcom/whoop/design/util/TextResource;

    iput-object p7, p0, Lr21/e;->F:Lkd1/o;

    iput-object p8, p0, Lr21/e;->G:Lcom/whoop/design/util/TextResource;

    iput-wide p9, p0, Lr21/e;->H:J

    iput-boolean p11, p0, Lr21/e;->I:Z

    iput-object p12, p0, Lr21/e;->J:Lc93/a;

    iput-object p13, p0, Lr21/e;->K:Li2/x;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v14, p1

    check-cast v14, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v15

    iget-object v1, v0, Lr21/e;->w:Lr21/a;

    iget-object v2, v0, Lr21/e;->x:Lcom/whoop/design/util/TextResource;

    iget-wide v3, v0, Lr21/e;->y:J

    iget-object v5, v0, Lr21/e;->z:Lkd1/o;

    iget-object v6, v0, Lr21/e;->E:Lcom/whoop/design/util/TextResource;

    iget-object v7, v0, Lr21/e;->F:Lkd1/o;

    iget-object v8, v0, Lr21/e;->G:Lcom/whoop/design/util/TextResource;

    iget-wide v9, v0, Lr21/e;->H:J

    iget-boolean v11, v0, Lr21/e;->I:Z

    iget-object v12, v0, Lr21/e;->J:Lc93/a;

    iget-object v13, v0, Lr21/e;->K:Li2/x;

    invoke-static/range {v1 .. v15}, Lr21/f;->c(Lr21/a;Lcom/whoop/design/util/TextResource;JLkd1/o;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;JZLc93/a;Li2/x;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
