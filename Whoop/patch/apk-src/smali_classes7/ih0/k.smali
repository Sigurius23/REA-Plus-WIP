.class public final synthetic Lih0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Z

.field public final synthetic G:Z

.field public final synthetic H:I

.field public final synthetic I:I

.field public final synthetic J:Ljava/lang/Object;

.field public final synthetic K:Ll83/e;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Z

.field public final synthetic z:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lq3/y;Lkotlin/jvm/functions/Function1;IZZZZLc93/a;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lih0/k;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lih0/k;->x:Ljava/lang/String;

    iput-object p2, p0, Lih0/k;->J:Ljava/lang/Object;

    iput-object p3, p0, Lih0/k;->K:Ll83/e;

    iput p4, p0, Lih0/k;->H:I

    iput-boolean p5, p0, Lih0/k;->y:Z

    iput-boolean p6, p0, Lih0/k;->E:Z

    iput-boolean p7, p0, Lih0/k;->F:Z

    iput-boolean p8, p0, Lih0/k;->G:Z

    iput-object p9, p0, Lih0/k;->z:Lc93/a;

    iput p10, p0, Lih0/k;->I:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;ZZZLc93/a;II)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lih0/k;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lih0/k;->x:Ljava/lang/String;

    iput-boolean p2, p0, Lih0/k;->y:Z

    iput-object p3, p0, Lih0/k;->z:Lc93/a;

    iput-object p4, p0, Lih0/k;->J:Ljava/lang/Object;

    iput-boolean p5, p0, Lih0/k;->E:Z

    iput-boolean p6, p0, Lih0/k;->F:Z

    iput-boolean p7, p0, Lih0/k;->G:Z

    iput-object p8, p0, Lih0/k;->K:Ll83/e;

    iput p9, p0, Lih0/k;->H:I

    iput p10, p0, Lih0/k;->I:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Lih0/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lih0/k;->J:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lih0/k;->K:Ll83/e;

    move-object v8, v0

    check-cast v8, Lc93/a;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lih0/k;->H:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v10

    iget-object v1, p0, Lih0/k;->x:Ljava/lang/String;

    iget-boolean v2, p0, Lih0/k;->y:Z

    iget-object v3, p0, Lih0/k;->z:Lc93/a;

    iget-boolean v5, p0, Lih0/k;->E:Z

    iget-boolean v6, p0, Lih0/k;->F:Z

    iget-boolean v7, p0, Lih0/k;->G:Z

    iget v11, p0, Lih0/k;->I:I

    invoke-static/range {v1 .. v11}, Lio/sentry/config/a;->i(Ljava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;ZZZLc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lih0/k;->J:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lq3/y;

    iget-object v0, p0, Lih0/k;->K:Ll83/e;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-object v1, p0, Lih0/k;->x:Ljava/lang/String;

    iget v4, p0, Lih0/k;->H:I

    iget-boolean v5, p0, Lih0/k;->y:Z

    iget-boolean v6, p0, Lih0/k;->E:Z

    iget-boolean v7, p0, Lih0/k;->F:Z

    iget-boolean v8, p0, Lih0/k;->G:Z

    iget-object v9, p0, Lih0/k;->z:Lc93/a;

    iget v10, p0, Lih0/k;->I:I

    invoke-static/range {v1 .. v12}, Lih0/l;->c(Ljava/lang/String;Lq3/y;Lkotlin/jvm/functions/Function1;IZZZZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
