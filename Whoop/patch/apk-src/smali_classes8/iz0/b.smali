.class public final synthetic Liz0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/o;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Liz0/m;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Liz0/m;Lkotlin/jvm/functions/Function1;ZI)V
    .locals 0

    iput p5, p0, Liz0/b;->w:I

    iput-object p1, p0, Liz0/b;->E:Ljava/lang/Object;

    iput-object p2, p0, Liz0/b;->x:Liz0/m;

    iput-object p3, p0, Liz0/b;->y:Lkotlin/jvm/functions/Function1;

    iput-boolean p4, p0, Liz0/b;->z:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Liz0/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Liz0/b;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    move-object v5, p1

    check-cast v5, Ll0/y;

    move-object v6, p2

    check-cast v6, Laf3/t;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    move-object v8, p4

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p5, Ljava/lang/Integer;

    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v2, p0, Liz0/b;->x:Liz0/m;

    iget-object v3, p0, Liz0/b;->y:Lkotlin/jvm/functions/Function1;

    iget-boolean v4, p0, Liz0/b;->z:Z

    invoke-static/range {v1 .. v9}, Liz0/g;->r(Ljava/lang/String;Liz0/m;Lkotlin/jvm/functions/Function1;ZLl0/y;Laf3/t;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Liz0/b;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Liz0/j;

    move-object v5, p1

    check-cast v5, Ll0/y;

    move-object v6, p2

    check-cast v6, Laf3/t;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    move-object v8, p4

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p5, Ljava/lang/Integer;

    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v2, p0, Liz0/b;->x:Liz0/m;

    iget-object v3, p0, Liz0/b;->y:Lkotlin/jvm/functions/Function1;

    iget-boolean v4, p0, Liz0/b;->z:Z

    invoke-static/range {v1 .. v9}, Liz0/g;->C(Liz0/j;Liz0/m;Lkotlin/jvm/functions/Function1;ZLl0/y;Laf3/t;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
