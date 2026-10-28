.class public final synthetic Lsy2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Lqz0/c;

.field public final synthetic G:Z

.field public final synthetic H:I

.field public final synthetic I:Ljava/lang/String;

.field public final synthetic J:Lkotlin/jvm/functions/Function1;

.field public final synthetic K:I

.field public final synthetic L:I

.field public final synthetic w:Lcom/whoop/design/util/TextResource;

.field public final synthetic x:Lb91/a;

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:Lcom/whoop/design/util/TextResource;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lb91/a;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILqz0/c;ZILjava/lang/String;Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsy2/i;->w:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Lsy2/i;->x:Lb91/a;

    iput-object p3, p0, Lsy2/i;->y:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lsy2/i;->z:Lcom/whoop/design/util/TextResource;

    iput p5, p0, Lsy2/i;->E:I

    iput-object p6, p0, Lsy2/i;->F:Lqz0/c;

    iput-boolean p7, p0, Lsy2/i;->G:Z

    iput p8, p0, Lsy2/i;->H:I

    iput-object p9, p0, Lsy2/i;->I:Ljava/lang/String;

    iput-object p10, p0, Lsy2/i;->J:Lkotlin/jvm/functions/Function1;

    iput p11, p0, Lsy2/i;->K:I

    iput p12, p0, Lsy2/i;->L:I

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

    iget-object v0, p0, Lsy2/i;->w:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lsy2/i;->x:Lb91/a;

    iget-object v2, p0, Lsy2/i;->y:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lsy2/i;->z:Lcom/whoop/design/util/TextResource;

    iget v4, p0, Lsy2/i;->E:I

    iget-object v5, p0, Lsy2/i;->F:Lqz0/c;

    iget-boolean v6, p0, Lsy2/i;->G:Z

    iget v7, p0, Lsy2/i;->H:I

    iget-object v8, p0, Lsy2/i;->I:Ljava/lang/String;

    iget-object v9, p0, Lsy2/i;->J:Lkotlin/jvm/functions/Function1;

    iget v10, p0, Lsy2/i;->K:I

    iget v11, p0, Lsy2/i;->L:I

    invoke-static/range {v0 .. v13}, Lsy2/k;->b(Lcom/whoop/design/util/TextResource;Lb91/a;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILqz0/c;ZILjava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
