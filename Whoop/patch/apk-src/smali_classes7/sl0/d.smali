.class public final synthetic Lsl0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ll83/e;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Lc93/a;


# direct methods
.method public synthetic constructor <init>(ZLc93/a;ZLp1/c1;Ljava/util/List;Lkotlin/jvm/functions/Function3;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lsl0/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lsl0/d;->x:Z

    iput-object p2, p0, Lsl0/d;->z:Lc93/a;

    iput-boolean p3, p0, Lsl0/d;->y:Z

    iput-object p4, p0, Lsl0/d;->E:Ljava/lang/Object;

    iput-object p5, p0, Lsl0/d;->F:Ljava/lang/Object;

    iput-object p6, p0, Lsl0/d;->G:Ll83/e;

    return-void
.end method

.method public synthetic constructor <init>(ZLq3/y;ZLql0/c;Lc93/a;Lc93/a;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lsl0/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lsl0/d;->x:Z

    iput-object p2, p0, Lsl0/d;->E:Ljava/lang/Object;

    iput-boolean p3, p0, Lsl0/d;->y:Z

    iput-object p4, p0, Lsl0/d;->F:Ljava/lang/Object;

    iput-object p5, p0, Lsl0/d;->z:Lc93/a;

    iput-object p6, p0, Lsl0/d;->G:Ll83/e;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lsl0/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsl0/d;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lq3/y;

    iget-object v0, p0, Lsl0/d;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lql0/c;

    iget-object v0, p0, Lsl0/d;->G:Ll83/e;

    move-object v6, v0

    check-cast v6, Lc93/a;

    iget-boolean v1, p0, Lsl0/d;->x:Z

    iget-boolean v3, p0, Lsl0/d;->y:Z

    iget-object v5, p0, Lsl0/d;->z:Lc93/a;

    invoke-static/range {v1 .. v6}, Lsl0/p3;->e(ZLq3/y;ZLql0/c;Lc93/a;Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lsl0/d;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lp1/c1;

    iget-object v0, p0, Lsl0/d;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/util/List;

    iget-object v0, p0, Lsl0/d;->G:Ll83/e;

    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function3;

    iget-boolean v1, p0, Lsl0/d;->x:Z

    iget-object v2, p0, Lsl0/d;->z:Lc93/a;

    iget-boolean v3, p0, Lsl0/d;->y:Z

    invoke-static/range {v1 .. v6}, Lsl0/i;->o(ZLc93/a;ZLp1/c1;Ljava/util/List;Lkotlin/jvm/functions/Function3;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
