.class public final Ln53/a2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/l;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lec3/l;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(ILec3/f2;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput p1, p0, Ln53/a2;->w:I

    iput-object p2, p0, Ln53/a2;->x:Lec3/l;

    iput-object p3, p0, Ln53/a2;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Ln53/a2;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ln53/z1;

    iget-object v1, p0, Ln53/a2;->y:Lkotlin/jvm/functions/Function1;

    const/4 v2, 0x1

    invoke-direct {v0, p1, v1, v2}, Ln53/z1;-><init>(Lec3/m;Lkotlin/jvm/functions/Function1;I)V

    iget-object p1, p0, Ln53/a2;->x:Lec3/l;

    invoke-interface {p1, v0, p2}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_0
    return-object p1

    :pswitch_0
    new-instance v0, Ln53/z1;

    iget-object v1, p0, Ln53/a2;->y:Lkotlin/jvm/functions/Function1;

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, v2}, Ln53/z1;-><init>(Lec3/m;Lkotlin/jvm/functions/Function1;I)V

    iget-object p1, p0, Ln53/a2;->x:Lec3/l;

    invoke-interface {p1, v0, p2}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    goto :goto_1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_1
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
