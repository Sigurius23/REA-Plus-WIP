.class public final synthetic Lh01/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(ILjava/util/List;Z)V
    .locals 0

    iput p1, p0, Lh01/j;->w:I

    iput-boolean p3, p0, Lh01/j;->x:Z

    iput-object p2, p0, Lh01/j;->y:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lh01/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lh01/j;->y:Ljava/util/List;

    check-cast p1, Lk2/c;

    iget-boolean v1, p0, Lh01/j;->x:Z

    invoke-static {v1, v0, p1}, Lh01/p;->o(ZLjava/util/List;Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lh01/j;->y:Ljava/util/List;

    check-cast v0, Ljava/util/ArrayList;

    check-cast p1, Lf2/d;

    iget-boolean v1, p0, Lh01/j;->x:Z

    invoke-static {v1, v0, p1}, Lh01/p;->g(ZLjava/util/ArrayList;Lf2/d;)Lf2/g;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
