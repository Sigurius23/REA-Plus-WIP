.class public final synthetic Li20/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ll1/w3;Lcom/whoop/design/models/modal/BottomSheet;Lbc3/c0;Lc93/a;Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Li20/a1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li20/a1;->z:Ljava/lang/Object;

    iput-object p2, p0, Li20/a1;->F:Ljava/lang/Object;

    iput-object p3, p0, Li20/a1;->G:Ljava/lang/Object;

    iput-object p4, p0, Li20/a1;->E:Ljava/lang/Object;

    iput-object p5, p0, Li20/a1;->H:Ljava/lang/Object;

    iput-object p6, p0, Li20/a1;->y:Ljava/lang/Object;

    iput-boolean p7, p0, Li20/a1;->x:Z

    iput-object p8, p0, Li20/a1;->I:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/String;Ljava/lang/String;Lc93/a;Lc93/a;Lx1/b;Lx1/b;Lx1/b;I)V
    .locals 0

    .line 2
    const/4 p9, 0x0

    iput p9, p0, Li20/a1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Li20/a1;->x:Z

    iput-object p2, p0, Li20/a1;->y:Ljava/lang/Object;

    iput-object p3, p0, Li20/a1;->z:Ljava/lang/Object;

    iput-object p4, p0, Li20/a1;->E:Ljava/lang/Object;

    iput-object p5, p0, Li20/a1;->F:Ljava/lang/Object;

    iput-object p6, p0, Li20/a1;->G:Ljava/lang/Object;

    iput-object p7, p0, Li20/a1;->H:Ljava/lang/Object;

    iput-object p8, p0, Li20/a1;->I:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/util/Map;Lah0/c;Lz1/s;Ljava/util/Set;Lah0/c;Lp1/c1;Lp1/c1;)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput v0, p0, Li20/a1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Li20/a1;->x:Z

    iput-object p2, p0, Li20/a1;->y:Ljava/lang/Object;

    iput-object p3, p0, Li20/a1;->z:Ljava/lang/Object;

    iput-object p4, p0, Li20/a1;->E:Ljava/lang/Object;

    iput-object p5, p0, Li20/a1;->F:Ljava/lang/Object;

    iput-object p6, p0, Li20/a1;->G:Ljava/lang/Object;

    iput-object p7, p0, Li20/a1;->H:Ljava/lang/Object;

    iput-object p8, p0, Li20/a1;->I:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Li20/a1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Li20/a1;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll1/w3;

    iget-object v0, p0, Li20/a1;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/design/models/modal/BottomSheet;

    iget-object v0, p0, Li20/a1;->G:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lbc3/c0;

    iget-object v0, p0, Li20/a1;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/a;

    iget-object v0, p0, Li20/a1;->H:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;

    iget-object v0, p0, Li20/a1;->y:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    iget-object v0, p0, Li20/a1;->I:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lkotlin/jvm/functions/Function1;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-boolean v7, p0, Li20/a1;->x:Z

    invoke-static/range {v1 .. v10}, Ltg2/d;->i(Ll1/w3;Lcom/whoop/design/models/modal/BottomSheet;Lbc3/c0;Lc93/a;Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Li20/a1;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/Map;

    iget-object v0, p0, Li20/a1;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lah0/c;

    iget-object v0, p0, Li20/a1;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lz1/s;

    iget-object v0, p0, Li20/a1;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/util/Set;

    iget-object v0, p0, Li20/a1;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lah0/c;

    iget-object v0, p0, Li20/a1;->H:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lp1/c1;

    iget-object v0, p0, Li20/a1;->I:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lp1/c1;

    move-object v9, p1

    check-cast v9, Ljava/lang/String;

    move-object v10, p2

    check-cast v10, Lq3/y;

    iget-boolean v1, p0, Li20/a1;->x:Z

    invoke-static/range {v1 .. v10}, Lih0/e0;->W(ZLjava/util/Map;Lah0/c;Lz1/s;Ljava/util/Set;Lah0/c;Lp1/c1;Lp1/c1;Ljava/lang/String;Lq3/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Li20/a1;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    iget-object v0, p0, Li20/a1;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    iget-object v0, p0, Li20/a1;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/a;

    iget-object v0, p0, Li20/a1;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lc93/a;

    iget-object v0, p0, Li20/a1;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lx1/b;

    iget-object v0, p0, Li20/a1;->H:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lx1/b;

    iget-object v0, p0, Li20/a1;->I:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lx1/b;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const p1, 0xdb0001

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v10

    iget-boolean v1, p0, Li20/a1;->x:Z

    invoke-static/range {v1 .. v10}, Li20/l1;->i(ZLjava/lang/String;Ljava/lang/String;Lc93/a;Lc93/a;Lx1/b;Lx1/b;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
