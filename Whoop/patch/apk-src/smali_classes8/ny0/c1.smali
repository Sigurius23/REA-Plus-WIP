.class public final synthetic Lny0/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Z

.field public final synthetic G:Lny0/d0;

.field public final synthetic H:Lc93/m;

.field public final synthetic I:Lkotlin/jvm/functions/Function1;

.field public final synthetic J:I

.field public final synthetic K:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Lny0/e0;

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lny0/e0;JZZLny0/d0;Lc93/m;Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lny0/c1;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lny0/c1;->x:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lny0/c1;->y:Lny0/e0;

    iput-wide p4, p0, Lny0/c1;->z:J

    iput-boolean p6, p0, Lny0/c1;->E:Z

    iput-boolean p7, p0, Lny0/c1;->F:Z

    iput-object p8, p0, Lny0/c1;->G:Lny0/d0;

    iput-object p9, p0, Lny0/c1;->H:Lc93/m;

    iput-object p10, p0, Lny0/c1;->I:Lkotlin/jvm/functions/Function1;

    iput p11, p0, Lny0/c1;->J:I

    iput p12, p0, Lny0/c1;->K:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    move-object v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    iget-object v0, p0, Lny0/c1;->w:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lny0/c1;->x:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lny0/c1;->y:Lny0/e0;

    iget-wide v3, p0, Lny0/c1;->z:J

    iget-boolean v5, p0, Lny0/c1;->E:Z

    iget-boolean v6, p0, Lny0/c1;->F:Z

    iget-object v7, p0, Lny0/c1;->G:Lny0/d0;

    iget-object v8, p0, Lny0/c1;->H:Lc93/m;

    iget-object v9, p0, Lny0/c1;->I:Lkotlin/jvm/functions/Function1;

    iget v10, p0, Lny0/c1;->J:I

    iget v11, p0, Lny0/c1;->K:I

    invoke-static/range {v0 .. v13}, Lny0/d1;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lny0/e0;JZZLny0/d0;Lc93/m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
