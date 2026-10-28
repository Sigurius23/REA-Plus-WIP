.class public final synthetic Liw0/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic J:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Lc93/a;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Liw0/l0;ILq0/y;Lc93/a;Lkotlin/jvm/functions/Function1;ZZII)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Liw0/b0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Liw0/b0;->H:Ljava/lang/Object;

    iput p2, p0, Liw0/b0;->z:I

    iput-object p3, p0, Liw0/b0;->I:Ljava/lang/Object;

    iput-object p4, p0, Liw0/b0;->y:Lc93/a;

    iput-object p5, p0, Liw0/b0;->J:Ljava/lang/Object;

    iput-boolean p6, p0, Liw0/b0;->x:Z

    iput-boolean p7, p0, Liw0/b0;->E:Z

    iput p8, p0, Liw0/b0;->F:I

    iput p9, p0, Liw0/b0;->G:I

    return-void
.end method

.method public synthetic constructor <init>(ZLc93/a;ILcom/whoop/design/util/TextResource;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZII)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Liw0/b0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Liw0/b0;->x:Z

    iput-object p2, p0, Liw0/b0;->y:Lc93/a;

    iput p3, p0, Liw0/b0;->z:I

    iput-object p4, p0, Liw0/b0;->H:Ljava/lang/Object;

    iput-object p5, p0, Liw0/b0;->I:Ljava/lang/Object;

    iput-object p6, p0, Liw0/b0;->J:Ljava/lang/Object;

    iput-boolean p7, p0, Liw0/b0;->E:Z

    iput p8, p0, Liw0/b0;->F:I

    iput p9, p0, Liw0/b0;->G:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Liw0/b0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Liw0/b0;->H:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Liw0/b0;->I:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    iget-object v0, p0, Liw0/b0;->J:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Landroidx/compose/ui/Modifier;

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget-boolean v1, p0, Liw0/b0;->x:Z

    iget-object v2, p0, Liw0/b0;->y:Lc93/a;

    iget v3, p0, Liw0/b0;->z:I

    iget-boolean v7, p0, Liw0/b0;->E:Z

    iget v8, p0, Liw0/b0;->F:I

    iget v9, p0, Liw0/b0;->G:I

    invoke-static/range {v1 .. v11}, Ljm0/d;->e(ZLc93/a;ILcom/whoop/design/util/TextResource;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Liw0/b0;->H:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Liw0/l0;

    iget-object v0, p0, Liw0/b0;->I:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lq0/y;

    iget-object v0, p0, Liw0/b0;->J:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget v2, p0, Liw0/b0;->z:I

    iget-object v4, p0, Liw0/b0;->y:Lc93/a;

    iget-boolean v6, p0, Liw0/b0;->x:Z

    iget-boolean v7, p0, Liw0/b0;->E:Z

    iget v8, p0, Liw0/b0;->F:I

    iget v9, p0, Liw0/b0;->G:I

    invoke-static/range {v1 .. v11}, Liw0/c0;->a(Liw0/l0;ILq0/y;Lc93/a;Lkotlin/jvm/functions/Function1;ZZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
