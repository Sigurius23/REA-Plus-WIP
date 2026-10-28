.class public final Lp6/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final x:Lp6/i1;

.field public static final y:Lp6/i1;

.field public static final z:Lp6/i1;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lp6/i1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp6/i1;-><init>(I)V

    sput-object v0, Lp6/i1;->x:Lp6/i1;

    new-instance v0, Lp6/i1;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lp6/i1;-><init>(I)V

    sput-object v0, Lp6/i1;->y:Lp6/i1;

    new-instance v0, Lp6/i1;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lp6/i1;-><init>(I)V

    sput-object v0, Lp6/i1;->z:Lp6/i1;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lp6/i1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lp6/i1;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ln6/n;

    instance-of p1, p1, Lo6/b;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ln6/n;

    instance-of p1, p1, Ln6/e;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ln6/n;

    instance-of p1, p1, Lo6/b;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
