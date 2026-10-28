.class public final synthetic Ljm0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Ljava/lang/String;

.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLjava/lang/String;III)V
    .locals 0

    iput p8, p0, Ljm0/a;->w:I

    iput-object p1, p0, Ljm0/a;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Ljm0/a;->y:Landroidx/compose/ui/Modifier;

    iput-boolean p3, p0, Ljm0/a;->z:Z

    iput-boolean p4, p0, Ljm0/a;->E:Z

    iput-object p5, p0, Ljm0/a;->F:Ljava/lang/String;

    iput p6, p0, Ljm0/a;->G:I

    iput p7, p0, Ljm0/a;->H:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Ljm0/a;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v1, p0, Ljm0/a;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Ljm0/a;->y:Landroidx/compose/ui/Modifier;

    iget-boolean v3, p0, Ljm0/a;->z:Z

    iget-boolean v4, p0, Ljm0/a;->E:Z

    iget-object v5, p0, Ljm0/a;->F:Ljava/lang/String;

    iget v6, p0, Ljm0/a;->G:I

    iget v7, p0, Ljm0/a;->H:I

    invoke-static/range {v1 .. v9}, Ljm0/b;->c(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLjava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v0, p0, Ljm0/a;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ljm0/a;->y:Landroidx/compose/ui/Modifier;

    iget-boolean v2, p0, Ljm0/a;->z:Z

    iget-boolean v3, p0, Ljm0/a;->E:Z

    iget-object v4, p0, Ljm0/a;->F:Ljava/lang/String;

    iget v5, p0, Ljm0/a;->G:I

    iget v6, p0, Ljm0/a;->H:I

    invoke-static/range {v0 .. v8}, Ljm0/b;->a(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLjava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
