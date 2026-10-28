.class public final synthetic Liw0/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Liw0/l0;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Liw0/j0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Liw0/j0;->E:Ljava/lang/Object;

    iput-boolean p2, p0, Liw0/j0;->x:Z

    iput-object p3, p0, Liw0/j0;->F:Ljava/lang/Object;

    iput-object p4, p0, Liw0/j0;->y:Lkotlin/jvm/functions/Function1;

    iput-boolean p5, p0, Liw0/j0;->z:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Z)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Liw0/j0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Liw0/j0;->x:Z

    iput-object p2, p0, Liw0/j0;->E:Ljava/lang/Object;

    iput-object p3, p0, Liw0/j0;->F:Ljava/lang/Object;

    iput-object p4, p0, Liw0/j0;->y:Lkotlin/jvm/functions/Function1;

    iput-boolean p5, p0, Liw0/j0;->z:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Liw0/j0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Liw0/j0;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    iget-object v0, p0, Liw0/j0;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/a;

    move-object v5, p1

    check-cast v5, Ll1/x3;

    new-instance v1, Ll1/w3;

    iget-boolean v2, p0, Liw0/j0;->x:Z

    iget-object v6, p0, Liw0/j0;->y:Lkotlin/jvm/functions/Function1;

    iget-boolean v7, p0, Liw0/j0;->z:Z

    invoke-direct/range {v1 .. v7}, Ll1/w3;-><init>(ZLc93/a;Lc93/a;Ll1/x3;Lkotlin/jvm/functions/Function1;Z)V

    return-object v1

    :pswitch_0
    iget-object v0, p0, Liw0/j0;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Liw0/l0;

    iget-object v0, p0, Liw0/j0;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Landroidx/compose/ui/Modifier;

    iget-boolean v5, p0, Liw0/j0;->z:Z

    move-object v6, p1

    check-cast v6, Ln0/q;

    iget-boolean v2, p0, Liw0/j0;->x:Z

    iget-object v4, p0, Liw0/j0;->y:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v1 .. v6}, Liw0/k0;->c(Liw0/l0;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;ZLn0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
