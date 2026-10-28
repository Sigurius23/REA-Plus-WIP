.class public final synthetic Lnw0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ls01/d;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ls01/d;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lnw0/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnw0/f;->x:Ls01/d;

    iput-object p2, p0, Lnw0/f;->z:Ljava/lang/String;

    iput-object p3, p0, Lnw0/f;->y:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Ls01/d;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lnw0/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnw0/f;->x:Ls01/d;

    iput-object p2, p0, Lnw0/f;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lnw0/f;->z:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lnw0/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lnw0/f;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lnw0/f;->z:Ljava/lang/String;

    iget-object v2, p0, Lnw0/f;->x:Ls01/d;

    invoke-static {v2, v1, v0, p1}, Lpp1/i;->A(Ls01/d;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lnw0/f;->z:Ljava/lang/String;

    iget-object v1, p0, Lnw0/f;->y:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lnw0/f;->x:Ls01/d;

    invoke-static {v2, v0, v1, p1}, Lnw0/g;->a(Ls01/d;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
