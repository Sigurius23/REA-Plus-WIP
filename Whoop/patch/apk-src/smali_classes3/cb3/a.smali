.class public final Lcb3/a;
.super Ljava/lang/Object;

# interfaces
.implements Lub3/a;


# static fields
.field public static final x:Lcb3/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcb3/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcb3/a;-><init>(I)V

    sput-object v0, Lcb3/a;->x:Lcb3/a;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lcb3/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final r(Ljava/lang/Object;)Ljava/lang/Iterable;
    .locals 2

    iget v0, p0, Lcb3/a;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lr93/c;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lr93/c;->h()Ljava/util/Collection;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Ljava/lang/Iterable;

    goto :goto_0

    :cond_0
    sget-object p1, Lm83/y;->w:Lm83/y;

    :goto_0
    return-object p1

    :pswitch_0
    check-cast p1, Lr93/a1;

    sget v0, Lcb3/e;->a:I

    check-cast p1, Lu93/w0;

    invoke-virtual {p1}, Lu93/w0;->h()Ljava/util/Collection;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr93/a1;

    check-cast v1, Lu93/w0;

    invoke-virtual {v1}, Lu93/w0;->L0()Lr93/a1;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
