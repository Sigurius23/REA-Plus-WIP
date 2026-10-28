.class public final synthetic Lih0/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Z

.field public final synthetic G:I

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Lc93/a;

.field public final synthetic z:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lc93/a;Lc93/a;ZZI)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lih0/p;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lih0/p;->x:Ljava/lang/String;

    iput-object p2, p0, Lih0/p;->y:Lc93/a;

    iput-object p3, p0, Lih0/p;->z:Lc93/a;

    iput-boolean p4, p0, Lih0/p;->E:Z

    iput-boolean p5, p0, Lih0/p;->F:Z

    iput p6, p0, Lih0/p;->G:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZZLc93/a;Lc93/a;I)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lih0/p;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lih0/p;->x:Ljava/lang/String;

    iput-boolean p2, p0, Lih0/p;->E:Z

    iput-boolean p3, p0, Lih0/p;->F:Z

    iput-object p4, p0, Lih0/p;->y:Lc93/a;

    iput-object p5, p0, Lih0/p;->z:Lc93/a;

    iput p6, p0, Lih0/p;->G:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lih0/p;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v1, p0, Lih0/p;->x:Ljava/lang/String;

    iget-object v2, p0, Lih0/p;->y:Lc93/a;

    iget-object v3, p0, Lih0/p;->z:Lc93/a;

    iget-boolean v4, p0, Lih0/p;->E:Z

    iget-boolean v5, p0, Lih0/p;->F:Z

    iget v6, p0, Lih0/p;->G:I

    invoke-static/range {v1 .. v8}, Lvy0/p;->p(Ljava/lang/String;Lc93/a;Lc93/a;ZZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v0, p0, Lih0/p;->x:Ljava/lang/String;

    iget-object v1, p0, Lih0/p;->y:Lc93/a;

    iget-object v2, p0, Lih0/p;->z:Lc93/a;

    iget-boolean v3, p0, Lih0/p;->E:Z

    iget-boolean v4, p0, Lih0/p;->F:Z

    iget v5, p0, Lih0/p;->G:I

    invoke-static/range {v0 .. v7}, Lih0/e0;->q(Ljava/lang/String;Lc93/a;Lc93/a;ZZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
