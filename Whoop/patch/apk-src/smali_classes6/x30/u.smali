.class public final synthetic Lx30/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lx30/v;


# direct methods
.method public synthetic constructor <init>(Lx30/v;I)V
    .locals 0

    iput p2, p0, Lx30/u;->w:I

    iput-object p1, p0, Lx30/u;->x:Lx30/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lx30/u;->w:I

    check-cast p1, Ll40/a;

    packed-switch v0, :pswitch_data_0

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx30/u;->x:Lx30/v;

    iget-object v0, v0, Lx30/v;->c:Lx30/t;

    iget-object v0, v0, Lx30/t;->d:Lx30/f0;

    iget-object v0, v0, Lg40/b3;->a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :pswitch_0
    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx30/u;->x:Lx30/v;

    iget-object v0, v0, Lx30/v;->c:Lx30/t;

    iget-object v0, v0, Lx30/t;->c:Lx30/z;

    iget-object v0, v0, Lg40/b3;->a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :pswitch_1
    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx30/u;->x:Lx30/v;

    iget-object v0, v0, Lx30/v;->c:Lx30/t;

    iget-object v0, v0, Lx30/t;->b:Lg40/c3;

    iget-object v0, v0, Lg40/c3;->b:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
