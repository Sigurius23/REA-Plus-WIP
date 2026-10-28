.class public final synthetic Lbu2/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ll0/v;

.field public final synthetic y:Lbu2/q;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ll0/v;Lbu2/q;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p4, p0, Lbu2/t;->w:I

    iput-object p1, p0, Lbu2/t;->x:Ll0/v;

    iput-object p2, p0, Lbu2/t;->y:Lbu2/q;

    iput-object p3, p0, Lbu2/t;->z:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lbu2/t;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbu2/t;->z:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lh2/b;

    iget-object v1, p0, Lbu2/t;->x:Ll0/v;

    iget-object v2, p0, Lbu2/t;->y:Lbu2/q;

    invoke-static {v1, v2, v0, p1}, Lbu2/x;->f(Ll0/v;Lbu2/q;Lkotlin/jvm/functions/Function1;Lh2/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lbu2/t;->x:Ll0/v;

    iget-object v1, p0, Lbu2/t;->y:Lbu2/q;

    iget-object v2, p0, Lbu2/t;->z:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2, p1}, Lbu2/x;->i(Ll0/v;Lbu2/q;Lkotlin/jvm/functions/Function1;F)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
