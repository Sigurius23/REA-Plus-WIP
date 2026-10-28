.class public final synthetic Lc51/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Li2/s0;Li2/t;Lc51/s;F)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lc51/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc51/d;->y:Ljava/lang/Object;

    iput-object p2, p0, Lc51/d;->z:Ljava/lang/Object;

    iput-object p3, p0, Lc51/d;->E:Ljava/lang/Object;

    iput p4, p0, Lc51/d;->x:F

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/f0;Lkotlin/jvm/internal/c0;FLkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lc51/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc51/d;->y:Ljava/lang/Object;

    iput-object p2, p0, Lc51/d;->z:Ljava/lang/Object;

    iput p3, p0, Lc51/d;->x:F

    iput-object p4, p0, Lc51/d;->E:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lc51/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc51/d;->y:Ljava/lang/Object;

    check-cast v0, Li2/s0;

    iget-object v1, p0, Lc51/d;->z:Ljava/lang/Object;

    check-cast v1, Li2/t;

    iget-object v2, p0, Lc51/d;->E:Ljava/lang/Object;

    check-cast v2, Lc51/s;

    iget v3, p0, Lc51/d;->x:F

    check-cast p1, Lk2/e;

    invoke-static {v0, v1, v2, v3, p1}, Lc51/k;->j(Li2/s0;Li2/t;Lc51/s;FLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lc51/d;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lkotlin/jvm/internal/f0;

    iget-object v0, p0, Lc51/d;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/internal/c0;

    iget-object v0, p0, Lc51/d;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    iget v3, p0, Lc51/d;->x:F

    invoke-static/range {v1 .. v6}, Lc51/c$b;->f(Lkotlin/jvm/internal/f0;Lkotlin/jvm/internal/c0;FLkotlin/jvm/functions/Function1;J)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
