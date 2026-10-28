.class public final synthetic Lg40/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;ZZJLkotlin/jvm/functions/Function1;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lg40/t0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg40/t0;->F:Ljava/lang/Object;

    iput-boolean p2, p0, Lg40/t0;->x:Z

    iput-boolean p3, p0, Lg40/t0;->y:Z

    iput-wide p4, p0, Lg40/t0;->z:J

    iput-object p6, p0, Lg40/t0;->G:Ljava/lang/Object;

    iput p7, p0, Lg40/t0;->E:I

    return-void
.end method

.method public synthetic constructor <init>(Lzy/c;ZLjava/lang/String;JZI)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lg40/t0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg40/t0;->F:Ljava/lang/Object;

    iput-boolean p2, p0, Lg40/t0;->x:Z

    iput-object p3, p0, Lg40/t0;->G:Ljava/lang/Object;

    iput-wide p4, p0, Lg40/t0;->z:J

    iput-boolean p6, p0, Lg40/t0;->y:Z

    iput p7, p0, Lg40/t0;->E:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lg40/t0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg40/t0;->F:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lg40/t0;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function1;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-boolean v2, p0, Lg40/t0;->x:Z

    iget-boolean v3, p0, Lg40/t0;->y:Z

    iget-wide v4, p0, Lg40/t0;->z:J

    iget v7, p0, Lg40/t0;->E:I

    invoke-static/range {v1 .. v9}, Lpz0/d;->b(Landroidx/compose/ui/Modifier;ZZJLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lg40/t0;->F:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lzy/c;

    iget-object v0, p0, Lg40/t0;->G:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lg40/t0;->E:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v8

    iget-boolean v2, p0, Lg40/t0;->x:Z

    iget-wide v4, p0, Lg40/t0;->z:J

    iget-boolean v6, p0, Lg40/t0;->y:Z

    invoke-static/range {v1 .. v8}, Lg40/y0;->c(Lzy/c;ZLjava/lang/String;JZLandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
