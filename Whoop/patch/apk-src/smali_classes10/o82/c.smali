.class public final synthetic Lo82/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Ln82/c;

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ln82/c;Lp1/c1;I)V
    .locals 0

    iput p4, p0, Lo82/c;->w:I

    iput-object p1, p0, Lo82/c;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lo82/c;->y:Ln82/c;

    iput-object p3, p0, Lo82/c;->z:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lo82/c;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lo82/c;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lo82/c;->y:Ln82/c;

    iget-object v2, p0, Lo82/c;->z:Lp1/c1;

    invoke-static {v0, v1, v2, p1}, Lo82/d;->g(Lkotlin/jvm/functions/Function1;Ln82/c;Lp1/c1;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lo82/c;->y:Ln82/c;

    iget-object v1, p0, Lo82/c;->z:Lp1/c1;

    iget-object v2, p0, Lo82/c;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1, p1}, Lo82/d;->e(Lkotlin/jvm/functions/Function1;Ln82/c;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
