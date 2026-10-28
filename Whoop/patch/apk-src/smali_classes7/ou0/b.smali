.class public final synthetic Lou0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic I:I

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;IIIIIIII)V
    .locals 0

    iput p9, p0, Lou0/b;->w:I

    iput-object p1, p0, Lou0/b;->x:Ljava/lang/String;

    iput p2, p0, Lou0/b;->y:I

    iput p3, p0, Lou0/b;->z:I

    iput p4, p0, Lou0/b;->E:I

    iput p5, p0, Lou0/b;->F:I

    iput p6, p0, Lou0/b;->G:I

    iput p7, p0, Lou0/b;->H:I

    iput p8, p0, Lou0/b;->I:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lou0/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget v8, p0, Lou0/b;->I:I

    move-object v9, p1

    check-cast v9, Ltb/a;

    iget-object v1, p0, Lou0/b;->x:Ljava/lang/String;

    iget v2, p0, Lou0/b;->y:I

    iget v3, p0, Lou0/b;->z:I

    iget v4, p0, Lou0/b;->E:I

    iget v5, p0, Lou0/b;->F:I

    iget v6, p0, Lou0/b;->G:I

    iget v7, p0, Lou0/b;->H:I

    invoke-static/range {v1 .. v9}, Lou0/f;->j(Ljava/lang/String;IIIIIIILtb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget v7, p0, Lou0/b;->I:I

    move-object v8, p1

    check-cast v8, Ltb/a;

    iget-object v0, p0, Lou0/b;->x:Ljava/lang/String;

    iget v1, p0, Lou0/b;->y:I

    iget v2, p0, Lou0/b;->z:I

    iget v3, p0, Lou0/b;->E:I

    iget v4, p0, Lou0/b;->F:I

    iget v5, p0, Lou0/b;->G:I

    iget v6, p0, Lou0/b;->H:I

    invoke-static/range {v0 .. v8}, Lou0/d;->j(Ljava/lang/String;IIIIIIILtb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
