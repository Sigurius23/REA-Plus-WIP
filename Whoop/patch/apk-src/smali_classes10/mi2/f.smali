.class public final synthetic Lmi2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lji2/f;


# direct methods
.method public synthetic constructor <init>(ILji2/f;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput p1, p0, Lmi2/f;->w:I

    iput-object p2, p0, Lmi2/f;->y:Lji2/f;

    iput-object p3, p0, Lmi2/f;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lji2/f;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lmi2/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmi2/f;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lmi2/f;->y:Lji2/f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lmi2/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmi2/f;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    iget-object v1, p0, Lmi2/f;->y:Lji2/f;

    invoke-static {v1, v0, p1}, Lmi2/i;->e(Lji2/f;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lmi2/f;->y:Lji2/f;

    iget-object v1, p0, Lmi2/f;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1}, Lmi2/i;->h(Lji2/f;Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lmi2/f;->y:Lji2/f;

    iget-object v1, p0, Lmi2/f;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1}, Lmi2/i;->f(Lji2/f;Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
