.class public final synthetic Ln01/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ll83/e;

.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Z

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ll83/k;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Ln01/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln01/c;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Ln01/c;->z:Ljava/lang/Object;

    iput-object p3, p0, Ln01/c;->E:Ljava/lang/Object;

    iput-object p4, p0, Ln01/c;->F:Ljava/lang/Object;

    iput-boolean p5, p0, Ln01/c;->y:Z

    iput-object p6, p0, Ln01/c;->G:Ll83/e;

    return-void
.end method

.method public synthetic constructor <init>(Ln01/e;Lry0/d;ZLz1/p;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Ln01/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln01/c;->z:Ljava/lang/Object;

    iput-object p2, p0, Ln01/c;->E:Ljava/lang/Object;

    iput-boolean p3, p0, Ln01/c;->y:Z

    iput-object p4, p0, Ln01/c;->F:Ljava/lang/Object;

    iput-object p5, p0, Ln01/c;->x:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Ln01/c;->G:Ll83/e;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    iget v0, p0, Ln01/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ln01/c;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Ln01/c;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ll83/k;

    iget-object v0, p0, Ln01/c;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    iget-object v0, p0, Ln01/c;->G:Ll83/e;

    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ln01/c;->x:Lkotlin/jvm/functions/Function1;

    iget-boolean v5, p0, Ln01/c;->y:Z

    invoke-static/range {v1 .. v6}, Lnw0/g;->q(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ll83/k;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ln01/c;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ln01/e;

    iget-object v0, p0, Ln01/c;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lry0/d;

    iget-object v0, p0, Ln01/c;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lz1/p;

    iget-object v0, p0, Ln01/c;->G:Ll83/e;

    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function3;

    iget-boolean v3, p0, Ln01/c;->y:Z

    iget-object v5, p0, Ln01/c;->x:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v1 .. v6}, Ln01/d;->a(Ln01/e;Lry0/d;ZLz1/p;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
