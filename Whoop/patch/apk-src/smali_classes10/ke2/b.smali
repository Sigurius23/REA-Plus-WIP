.class public final synthetic Lke2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lje2/c$b;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lje2/c$b;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lke2/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lke2/b;->x:Lje2/c$b;

    iput-object p2, p0, Lke2/b;->y:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lje2/c$b;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lke2/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lke2/b;->y:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lke2/b;->x:Lje2/c$b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lke2/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lke2/b;->x:Lje2/c$b;

    iget-object v1, p0, Lke2/b;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1}, Lke2/c;->e(Lje2/c$b;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lke2/b;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lke2/b;->x:Lje2/c$b;

    invoke-static {v0, v1, p1}, Lke2/c;->p(Lkotlin/jvm/functions/Function1;Lje2/c$b;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
