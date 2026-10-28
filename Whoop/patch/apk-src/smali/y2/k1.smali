.class public final Ly2/k1;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final x:Ly2/k1;

.field public static final y:Ly2/k1;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Ly2/k1;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ly2/k1;-><init>(II)V

    sput-object v0, Ly2/k1;->x:Ly2/k1;

    new-instance v0, Ly2/k1;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ly2/k1;-><init>(II)V

    sput-object v0, Ly2/k1;->y:Ly2/k1;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Ly2/k1;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ly2/k1;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ly2/i1;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Li2/g0;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
