.class public final synthetic Lau2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic w:I

.field public final synthetic x:Lwt2/a;

.field public final synthetic y:Lwt2/a;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lwt2/a;Lwt2/a;ZFLkotlin/jvm/functions/Function1;III)V
    .locals 0

    iput p8, p0, Lau2/g;->w:I

    iput-object p1, p0, Lau2/g;->x:Lwt2/a;

    iput-object p2, p0, Lau2/g;->y:Lwt2/a;

    iput-boolean p3, p0, Lau2/g;->z:Z

    iput p4, p0, Lau2/g;->E:F

    iput-object p5, p0, Lau2/g;->F:Lkotlin/jvm/functions/Function1;

    iput p6, p0, Lau2/g;->G:I

    iput p7, p0, Lau2/g;->H:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lau2/g;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v1, p0, Lau2/g;->x:Lwt2/a;

    iget-object v2, p0, Lau2/g;->y:Lwt2/a;

    iget-boolean v3, p0, Lau2/g;->z:Z

    iget v4, p0, Lau2/g;->E:F

    iget-object v5, p0, Lau2/g;->F:Lkotlin/jvm/functions/Function1;

    iget v6, p0, Lau2/g;->G:I

    iget v7, p0, Lau2/g;->H:I

    invoke-static/range {v1 .. v9}, Lau2/h;->c(Lwt2/a;Lwt2/a;ZFLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v0, p0, Lau2/g;->x:Lwt2/a;

    iget-object v1, p0, Lau2/g;->y:Lwt2/a;

    iget-boolean v2, p0, Lau2/g;->z:Z

    iget v3, p0, Lau2/g;->E:F

    iget-object v4, p0, Lau2/g;->F:Lkotlin/jvm/functions/Function1;

    iget v5, p0, Lau2/g;->G:I

    iget v6, p0, Lau2/g;->H:I

    invoke-static/range {v0 .. v8}, Lau2/h;->a(Lwt2/a;Lwt2/a;ZFLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
