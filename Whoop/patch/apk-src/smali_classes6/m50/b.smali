.class public final synthetic Lm50/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lp1/c1;

.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lm50/d;

.field public final synthetic z:Lp1/a1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lm50/d;Lp1/a1;Lp1/c1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lm50/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm50/b;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lm50/b;->y:Lm50/d;

    iput-object p3, p0, Lm50/b;->z:Lp1/a1;

    iput-object p4, p0, Lm50/b;->E:Lp1/c1;

    return-void
.end method

.method public synthetic constructor <init>(Lm50/d;Lp1/c1;Lkotlin/jvm/functions/Function1;Lp1/a1;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lm50/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm50/b;->y:Lm50/d;

    iput-object p2, p0, Lm50/b;->E:Lp1/c1;

    iput-object p3, p0, Lm50/b;->x:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lm50/b;->z:Lp1/a1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lm50/b;->w:I

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lm50/b;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lm50/b;->y:Lm50/d;

    iget-object v2, p0, Lm50/b;->z:Lp1/a1;

    iget-object v3, p0, Lm50/b;->E:Lp1/c1;

    invoke-static {v0, v1, v2, v3, p1}, Lm50/c;->a(Lkotlin/jvm/functions/Function1;Lm50/d;Lp1/a1;Lp1/c1;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lm50/b;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lm50/b;->y:Lm50/d;

    iget-object v2, p0, Lm50/b;->z:Lp1/a1;

    iget-object v3, p0, Lm50/b;->E:Lp1/c1;

    invoke-static {v0, v1, v2, v3, p1}, Lm50/c;->d(Lkotlin/jvm/functions/Function1;Lm50/d;Lp1/a1;Lp1/c1;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
