.class public final synthetic Lo31/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lp1/c1;

.field public final synthetic z:Lo31/e;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lp1/c1;Lo31/e;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lo31/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo31/c;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lo31/c;->y:Lp1/c1;

    iput-object p3, p0, Lo31/c;->z:Lo31/e;

    return-void
.end method

.method public synthetic constructor <init>(Lo31/e;Lp1/c1;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lo31/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo31/c;->z:Lo31/e;

    iput-object p2, p0, Lo31/c;->y:Lp1/c1;

    iput-object p3, p0, Lo31/c;->x:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lo31/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lo31/c;->y:Lp1/c1;

    iget-object v1, p0, Lo31/c;->z:Lo31/e;

    iget-object v2, p0, Lo31/c;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1, p1}, Lo31/d;->b(Lkotlin/jvm/functions/Function1;Lp1/c1;Lo31/e;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lo31/c;->z:Lo31/e;

    iget-object v1, p0, Lo31/c;->y:Lp1/c1;

    iget-object v2, p0, Lo31/c;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2, p1}, Lo31/d;->c(Lo31/e;Lp1/c1;Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
