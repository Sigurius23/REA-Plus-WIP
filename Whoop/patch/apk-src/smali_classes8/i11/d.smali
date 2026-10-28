.class public final synthetic Li11/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Z

.field public final synthetic G:Ljava/lang/String;

.field public final synthetic H:Ljava/lang/String;

.field public final synthetic I:Lcom/whoop/navigation/models/GenericInteraction;

.field public final synthetic J:Lcom/whoop/navigation/models/GenericInteraction;

.field public final synthetic K:Lcom/whoop/navigation/models/GenericInteraction;

.field public final synthetic L:Lkotlin/jvm/functions/Function1;

.field public final synthetic M:I

.field public final synthetic N:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Ll0/i;

.field public final synthetic y:Z

.field public final synthetic z:Lcom/whoop/design/util/TextResource;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ll0/i;ZLcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li11/d;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Li11/d;->x:Ll0/i;

    iput-boolean p3, p0, Li11/d;->y:Z

    iput-object p4, p0, Li11/d;->z:Lcom/whoop/design/util/TextResource;

    iput-boolean p5, p0, Li11/d;->E:Z

    iput-boolean p6, p0, Li11/d;->F:Z

    iput-object p7, p0, Li11/d;->G:Ljava/lang/String;

    iput-object p8, p0, Li11/d;->H:Ljava/lang/String;

    iput-object p9, p0, Li11/d;->I:Lcom/whoop/navigation/models/GenericInteraction;

    iput-object p10, p0, Li11/d;->J:Lcom/whoop/navigation/models/GenericInteraction;

    iput-object p11, p0, Li11/d;->K:Lcom/whoop/navigation/models/GenericInteraction;

    iput-object p12, p0, Li11/d;->L:Lkotlin/jvm/functions/Function1;

    iput p13, p0, Li11/d;->M:I

    iput p14, p0, Li11/d;->N:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    check-cast v15, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v16

    iget-object v1, v0, Li11/d;->w:Landroidx/compose/ui/Modifier;

    iget-object v2, v0, Li11/d;->x:Ll0/i;

    iget-boolean v3, v0, Li11/d;->y:Z

    iget-object v4, v0, Li11/d;->z:Lcom/whoop/design/util/TextResource;

    iget-boolean v5, v0, Li11/d;->E:Z

    iget-boolean v6, v0, Li11/d;->F:Z

    iget-object v7, v0, Li11/d;->G:Ljava/lang/String;

    iget-object v8, v0, Li11/d;->H:Ljava/lang/String;

    iget-object v9, v0, Li11/d;->I:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v10, v0, Li11/d;->J:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v11, v0, Li11/d;->K:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v12, v0, Li11/d;->L:Lkotlin/jvm/functions/Function1;

    iget v13, v0, Li11/d;->M:I

    iget v14, v0, Li11/d;->N:I

    invoke-static/range {v1 .. v16}, Li11/e;->d(Landroidx/compose/ui/Modifier;Ll0/i;ZLcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
