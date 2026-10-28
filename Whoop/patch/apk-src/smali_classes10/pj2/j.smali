.class public final synthetic Lpj2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Z

.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lpj2/j;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpj2/j;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lpj2/j;->y:Ljava/lang/String;

    iput-object p3, p0, Lpj2/j;->z:Ljava/lang/String;

    iput-boolean p4, p0, Lpj2/j;->E:Z

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;ZLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lpj2/j;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpj2/j;->x:Lkotlin/jvm/functions/Function1;

    iput-boolean p2, p0, Lpj2/j;->E:Z

    iput-object p3, p0, Lpj2/j;->y:Ljava/lang/String;

    iput-object p4, p0, Lpj2/j;->z:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lpj2/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpj2/j;->z:Ljava/lang/String;

    iget-boolean v1, p0, Lpj2/j;->E:Z

    iget-object v2, p0, Lpj2/j;->x:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lpj2/j;->y:Ljava/lang/String;

    invoke-static {v2, v3, v0, v1}, Lr90/f;->h(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lpj2/j;->y:Ljava/lang/String;

    iget-object v1, p0, Lpj2/j;->z:Ljava/lang/String;

    iget-object v2, p0, Lpj2/j;->x:Lkotlin/jvm/functions/Function1;

    iget-boolean v3, p0, Lpj2/j;->E:Z

    invoke-static {v2, v0, v1, v3}, Lpj2/q;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
