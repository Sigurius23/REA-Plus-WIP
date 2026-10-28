.class public final synthetic Lm12/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lc93/a;I)V
    .locals 0

    iput p2, p0, Lm12/c;->w:I

    iput-object p1, p0, Lm12/c;->x:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lm12/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lm12/c;->x:Lc93/a;

    invoke-static {v0, p1}, Lm12/d;->b(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lm12/c;->x:Lc93/a;

    check-cast p1, Lh2/b;

    invoke-static {v0, p1}, Lm12/d$a;->a(Lc93/a;Lh2/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
