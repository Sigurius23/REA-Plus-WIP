.class public final Lk7/a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final x:Lk7/a;

.field public static final y:Lk7/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lk7/a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lk7/a;-><init>(II)V

    sput-object v0, Lk7/a;->x:Lk7/a;

    new-instance v0, Lk7/a;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lk7/a;-><init>(II)V

    sput-object v0, Lk7/a;->y:Lk7/a;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Lk7/a;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lk7/a;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/health/platform/client/permission/Permission;

    iget-object p1, p1, Landroidx/health/platform/client/permission/Permission;->x:Landroidx/health/platform/client/proto/w1;

    invoke-virtual {p1}, Landroidx/health/platform/client/proto/w1;->q()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/health/platform/client/permission/Permission;

    invoke-static {}, Landroidx/health/platform/client/proto/w1;->r()Landroidx/health/platform/client/proto/v1;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v2, v1, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v2, Landroidx/health/platform/client/proto/w1;

    invoke-static {v2, p1}, Landroidx/health/platform/client/proto/w1;->p(Landroidx/health/platform/client/proto/w1;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object p1

    check-cast p1, Landroidx/health/platform/client/proto/w1;

    invoke-direct {v0, p1}, Landroidx/health/platform/client/permission/Permission;-><init>(Landroidx/health/platform/client/proto/w1;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
