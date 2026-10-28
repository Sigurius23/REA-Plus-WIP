.class public final synthetic Lc41/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic J:Ljava/lang/Object;

.field public final synthetic K:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lc41/o;Lc41/x;Lcom/whoop/navigation/ActivityDetailType;ZLc41/g2;Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lc41/l;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc41/l;->F:Ljava/lang/Object;

    iput-object p2, p0, Lc41/l;->G:Ljava/lang/Object;

    iput-object p3, p0, Lc41/l;->H:Ljava/lang/Object;

    iput-object p4, p0, Lc41/l;->I:Ljava/lang/Object;

    iput-boolean p5, p0, Lc41/l;->x:Z

    iput-object p6, p0, Lc41/l;->J:Ljava/lang/Object;

    iput-object p7, p0, Lc41/l;->K:Ljava/lang/Object;

    iput-object p8, p0, Lc41/l;->y:Lkotlin/jvm/functions/Function1;

    iput p9, p0, Lc41/l;->z:I

    iput p10, p0, Lc41/l;->E:I

    return-void
.end method

.method public synthetic constructor <init>(Lvn1/g$c;ZLc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;II)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lc41/l;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc41/l;->F:Ljava/lang/Object;

    iput-boolean p2, p0, Lc41/l;->x:Z

    iput-object p3, p0, Lc41/l;->G:Ljava/lang/Object;

    iput-object p4, p0, Lc41/l;->y:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lc41/l;->H:Ljava/lang/Object;

    iput-object p6, p0, Lc41/l;->I:Ljava/lang/Object;

    iput-object p7, p0, Lc41/l;->J:Ljava/lang/Object;

    iput-object p8, p0, Lc41/l;->K:Ljava/lang/Object;

    iput p9, p0, Lc41/l;->z:I

    iput p10, p0, Lc41/l;->E:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Lc41/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc41/l;->F:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lvn1/g$c;

    iget-object v0, p0, Lc41/l;->G:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    iget-object v0, p0, Lc41/l;->H:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lc93/m;

    iget-object v0, p0, Lc41/l;->I:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lc41/l;->J:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lc93/a;

    iget-object v0, p0, Lc41/l;->K:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lkotlin/jvm/functions/Function1;

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-boolean v2, p0, Lc41/l;->x:Z

    iget-object v4, p0, Lc41/l;->y:Lkotlin/jvm/functions/Function1;

    iget v9, p0, Lc41/l;->z:I

    iget v10, p0, Lc41/l;->E:I

    invoke-static/range {v1 .. v12}, Lun1/g;->f(Lvn1/g$c;ZLc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lc41/l;->F:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lc41/l;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc41/o;

    iget-object v0, p0, Lc41/l;->H:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc41/x;

    iget-object v0, p0, Lc41/l;->I:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/whoop/navigation/ActivityDetailType;

    iget-object v0, p0, Lc41/l;->J:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lc41/g2;

    iget-object v0, p0, Lc41/l;->K:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lcom/whoop/navigation/e;

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-boolean v5, p0, Lc41/l;->x:Z

    iget-object v8, p0, Lc41/l;->y:Lkotlin/jvm/functions/Function1;

    iget v9, p0, Lc41/l;->z:I

    iget v10, p0, Lc41/l;->E:I

    invoke-static/range {v1 .. v12}, Lc41/n;->f(Lcom/whoop/design/util/TextResource;Lc41/o;Lc41/x;Lcom/whoop/navigation/ActivityDetailType;ZLc41/g2;Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
