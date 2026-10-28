.class public final synthetic Lb81/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ll83/e;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZLl83/e;I)V
    .locals 0

    iput p4, p0, Lb81/b;->w:I

    iput-object p1, p0, Lb81/b;->z:Ljava/lang/Object;

    iput-boolean p2, p0, Lb81/b;->x:Z

    iput-object p3, p0, Lb81/b;->y:Ll83/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lb81/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb81/b;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Leu/g;

    iget-object v0, p0, Lb81/b;->y:Ll83/e;

    move-object v3, v0

    check-cast v3, Lc93/m;

    move-object v4, p1

    check-cast v4, Ll0/v;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v2, p0, Lb81/b;->x:Z

    invoke-static/range {v1 .. v6}, Lw41/a;->b(Leu/g;ZLc93/m;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lb81/b;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcy0/c$b;

    iget-object v0, p0, Lb81/b;->y:Ll83/e;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v4, p1

    check-cast v4, Ll0/u;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v2, p0, Lb81/b;->x:Z

    invoke-static/range {v1 .. v6}, Ley0/g;->j(Lcy0/c$b;ZLkotlin/jvm/functions/Function1;Ll0/u;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lb81/b;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lb81/f;

    iget-object v0, p0, Lb81/b;->y:Ll83/e;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v4, p1

    check-cast v4, Ll0/s0;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v2, p0, Lb81/b;->x:Z

    invoke-static/range {v1 .. v6}, Lb81/d;->a(Lb81/f;ZLkotlin/jvm/functions/Function1;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
