.class public final synthetic Lnw0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Z

.field public final synthetic G:Z

.field public final synthetic H:I

.field public final synthetic I:Ljava/lang/String;

.field public final synthetic J:Ll83/k;

.field public final synthetic K:Lkotlin/jvm/functions/Function1;

.field public final synthetic L:I

.field public final synthetic M:I

.field public final synthetic N:I

.field public final synthetic w:Lcom/whoop/design/util/TextResource;

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IZZILjava/lang/String;Ll83/k;Lkotlin/jvm/functions/Function1;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnw0/b;->w:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Lnw0/b;->x:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lnw0/b;->y:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lnw0/b;->z:Lkotlin/jvm/functions/Function1;

    iput p5, p0, Lnw0/b;->E:I

    iput-boolean p6, p0, Lnw0/b;->F:Z

    iput-boolean p7, p0, Lnw0/b;->G:Z

    iput p8, p0, Lnw0/b;->H:I

    iput-object p9, p0, Lnw0/b;->I:Ljava/lang/String;

    iput-object p10, p0, Lnw0/b;->J:Ll83/k;

    iput-object p11, p0, Lnw0/b;->K:Lkotlin/jvm/functions/Function1;

    iput p12, p0, Lnw0/b;->L:I

    iput p13, p0, Lnw0/b;->M:I

    iput p14, p0, Lnw0/b;->N:I

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

    iget-object v1, v0, Lnw0/b;->w:Lcom/whoop/design/util/TextResource;

    iget-object v2, v0, Lnw0/b;->x:Lcom/whoop/design/util/TextResource;

    iget-object v3, v0, Lnw0/b;->y:Lkotlin/jvm/functions/Function1;

    iget-object v4, v0, Lnw0/b;->z:Lkotlin/jvm/functions/Function1;

    iget v5, v0, Lnw0/b;->E:I

    iget-boolean v6, v0, Lnw0/b;->F:Z

    iget-boolean v7, v0, Lnw0/b;->G:Z

    iget v8, v0, Lnw0/b;->H:I

    iget-object v9, v0, Lnw0/b;->I:Ljava/lang/String;

    iget-object v10, v0, Lnw0/b;->J:Ll83/k;

    iget-object v11, v0, Lnw0/b;->K:Lkotlin/jvm/functions/Function1;

    iget v12, v0, Lnw0/b;->L:I

    iget v13, v0, Lnw0/b;->M:I

    iget v14, v0, Lnw0/b;->N:I

    invoke-static/range {v1 .. v16}, Lnw0/g;->w(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IZZILjava/lang/String;Ll83/k;Lkotlin/jvm/functions/Function1;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
