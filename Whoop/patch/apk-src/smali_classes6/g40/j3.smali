.class public final synthetic Lg40/j3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ll83/e;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:J

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/lang/String;JZLkotlin/jvm/functions/Function1;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lg40/j3;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg40/j3;->F:Ljava/lang/Object;

    iput-object p2, p0, Lg40/j3;->x:Ljava/lang/String;

    iput-wide p3, p0, Lg40/j3;->y:J

    iput-boolean p5, p0, Lg40/j3;->z:Z

    iput-object p6, p0, Lg40/j3;->G:Ll83/e;

    iput-boolean p7, p0, Lg40/j3;->E:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Integer;ZJZLc93/a;I)V
    .locals 0

    .line 2
    const/4 p8, 0x0

    iput p8, p0, Lg40/j3;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg40/j3;->x:Ljava/lang/String;

    iput-object p2, p0, Lg40/j3;->F:Ljava/lang/Object;

    iput-boolean p3, p0, Lg40/j3;->z:Z

    iput-wide p4, p0, Lg40/j3;->y:J

    iput-boolean p6, p0, Lg40/j3;->E:Z

    iput-object p7, p0, Lg40/j3;->G:Ll83/e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lg40/j3;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg40/j3;->F:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lg40/j3;->G:Ll83/e;

    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function1;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v2, p0, Lg40/j3;->x:Ljava/lang/String;

    iget-wide v3, p0, Lg40/j3;->y:J

    iget-boolean v5, p0, Lg40/j3;->z:Z

    iget-boolean v7, p0, Lg40/j3;->E:Z

    invoke-static/range {v1 .. v9}, Lsy0/o;->b(Landroidx/compose/ui/Modifier;Ljava/lang/String;JZLkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lg40/j3;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/Integer;

    iget-object v0, p0, Lg40/j3;->G:Ll83/e;

    move-object v7, v0

    check-cast v7, Lc93/a;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v9

    iget-object v1, p0, Lg40/j3;->x:Ljava/lang/String;

    iget-boolean v3, p0, Lg40/j3;->z:Z

    iget-wide v4, p0, Lg40/j3;->y:J

    iget-boolean v6, p0, Lg40/j3;->E:Z

    invoke-static/range {v1 .. v9}, Lse/b;->c(Ljava/lang/String;Ljava/lang/Integer;ZJZLc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
