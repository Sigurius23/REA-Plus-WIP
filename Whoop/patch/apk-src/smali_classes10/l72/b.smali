.class public final synthetic Ll72/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lj72/a;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lj72/a;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p4, p0, Ll72/b;->w:I

    iput-object p1, p0, Ll72/b;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Ll72/b;->y:Lj72/a;

    iput-object p3, p0, Ll72/b;->z:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Ll72/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll72/b;->y:Lj72/a;

    iget-object v1, p0, Ll72/b;->z:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Ll72/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1}, Ll72/c;->n(Lkotlin/jvm/functions/Function1;Lj72/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ll72/b;->y:Lj72/a;

    iget-object v1, p0, Ll72/b;->z:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Ll72/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1}, Ll72/c;->k(Lkotlin/jvm/functions/Function1;Lj72/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Ll72/b;->y:Lj72/a;

    iget-object v1, p0, Ll72/b;->z:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Ll72/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1}, Ll72/c;->j(Lkotlin/jvm/functions/Function1;Lj72/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
