.class public final synthetic Lw20/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Z

.field public final synthetic z:Lw20/z;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ZLw20/z;Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    iput p6, p0, Lw20/p;->w:I

    iput-object p1, p0, Lw20/p;->x:Ljava/lang/String;

    iput-boolean p2, p0, Lw20/p;->y:Z

    iput-object p3, p0, Lw20/p;->z:Lw20/z;

    iput-object p4, p0, Lw20/p;->E:Lkotlin/jvm/functions/Function1;

    iput p5, p0, Lw20/p;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lw20/p;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lw20/p;->F:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v6

    iget-object v1, p0, Lw20/p;->x:Ljava/lang/String;

    iget-boolean v2, p0, Lw20/p;->y:Z

    iget-object v3, p0, Lw20/p;->z:Lw20/z;

    iget-object v4, p0, Lw20/p;->E:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v1 .. v6}, Ls2/d;->b(Ljava/lang/String;ZLw20/z;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lw20/p;->F:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v5

    iget-object v0, p0, Lw20/p;->x:Ljava/lang/String;

    iget-boolean v1, p0, Lw20/p;->y:Z

    iget-object v2, p0, Lw20/p;->z:Lw20/z;

    iget-object v3, p0, Lw20/p;->E:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v0 .. v5}, Ls2/d;->d(Ljava/lang/String;ZLw20/z;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
