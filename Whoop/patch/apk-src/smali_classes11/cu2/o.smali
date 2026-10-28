.class public final synthetic Lcu2/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Lp1/t2;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Leb/u0;Lj02/o0;ZLc93/a;Ll83/h;Lp1/t2;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lcu2/o;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcu2/o;->y:Ljava/lang/Object;

    iput-object p2, p0, Lcu2/o;->z:Ljava/lang/Object;

    iput-boolean p3, p0, Lcu2/o;->x:Z

    iput-object p4, p0, Lcu2/o;->E:Ljava/lang/Object;

    iput-object p5, p0, Lcu2/o;->F:Ljava/lang/Object;

    iput-object p6, p0, Lcu2/o;->G:Lp1/t2;

    return-void
.end method

.method public synthetic constructor <init>(Lmf0/g;ZLbc3/c0;Lg1/y3;Lp1/c1;Lp1/c1;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lcu2/o;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcu2/o;->y:Ljava/lang/Object;

    iput-boolean p2, p0, Lcu2/o;->x:Z

    iput-object p3, p0, Lcu2/o;->z:Ljava/lang/Object;

    iput-object p4, p0, Lcu2/o;->E:Ljava/lang/Object;

    iput-object p5, p0, Lcu2/o;->F:Ljava/lang/Object;

    iput-object p6, p0, Lcu2/o;->G:Lp1/t2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lcu2/o;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcu2/o;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lmf0/g;

    iget-object v0, p0, Lcu2/o;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lbc3/c0;

    iget-object v0, p0, Lcu2/o;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lg1/y3;

    iget-object v0, p0, Lcu2/o;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lp1/c1;

    iget-object v0, p0, Lcu2/o;->G:Lp1/t2;

    move-object v6, v0

    check-cast v6, Lp1/c1;

    move-object v7, p1

    check-cast v7, Ll0/y;

    move-object v8, p2

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-boolean v2, p0, Lcu2/o;->x:Z

    invoke-static/range {v1 .. v9}, Lmf0/e;->s(Lmf0/g;ZLbc3/c0;Lg1/y3;Lp1/c1;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcu2/o;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Leb/u0;

    iget-object v0, p0, Lcu2/o;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lj02/o0;

    iget-object v0, p0, Lcu2/o;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/a;

    iget-object v0, p0, Lcu2/o;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ll83/h;

    move-object v7, p1

    check-cast v7, Lcom/whoop/weightlifting/StrengthTrainerDestination$a$a;

    move-object v8, p2

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-boolean v3, p0, Lcu2/o;->x:Z

    iget-object v6, p0, Lcu2/o;->G:Lp1/t2;

    invoke-static/range {v1 .. v9}, Lcom/whoop/weightlifting/a;->i(Leb/u0;Lj02/o0;ZLc93/a;Ll83/h;Lp1/t2;Lcom/whoop/weightlifting/StrengthTrainerDestination$a$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
