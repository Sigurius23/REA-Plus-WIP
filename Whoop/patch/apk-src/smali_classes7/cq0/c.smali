.class public final synthetic Lcq0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcq0/e;


# direct methods
.method public synthetic constructor <init>(Lcq0/e;I)V
    .locals 0

    iput p2, p0, Lcq0/c;->w:I

    iput-object p1, p0, Lcq0/c;->x:Lcq0/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcq0/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcq0/c;->x:Lcq0/e;

    invoke-static {v0, p1}, Lcq0/e;->a(Lcq0/e;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcq0/c;->x:Lcq0/e;

    invoke-static {v0, p1}, Lcq0/e;->h(Lcq0/e;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lcq0/c;->x:Lcq0/e;

    invoke-static {v0, p1}, Lcq0/e;->b(Lcq0/e;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lcq0/c;->x:Lcq0/e;

    invoke-static {v0, p1}, Lcq0/e;->g(Lcq0/e;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
